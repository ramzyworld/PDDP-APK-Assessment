package io.flutter.plugin.editing;

import N.C0026b;
import N.Q;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import p011g0.q;

/* JADX INFO: loaded from: classes.dex */
public final class b extends BaseInputConnection implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f2250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q f2252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f2253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EditorInfo f2254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ExtractedTextRequest f2255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CursorAnchorInfo.Builder f2257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ExtractedText f2258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InputMethodManager f2259j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final DynamicLayout f2260k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final D.j f2261l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0026b f2262m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2263n;

    public b(q qVar, int i2, Q q2, C0026b c0026b, e eVar, EditorInfo editorInfo) {
        FlutterJNI flutterJNI = new FlutterJNI();
        super(qVar, true);
        this.f2256g = false;
        this.f2258i = new ExtractedText();
        this.f2263n = 0;
        this.f2250a = qVar;
        this.f2251b = i2;
        this.f2252c = q2;
        this.f2253d = eVar;
        eVar.a(this);
        this.f2254e = editorInfo;
        this.f2262m = c0026b;
        this.f2261l = new D.j(24, flutterJNI);
        this.f2260k = new DynamicLayout(eVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f2259j = (InputMethodManager) qVar.getContext().getSystemService("input_method");
    }

    @Override // io.flutter.plugin.editing.d
    public final void a(boolean z2) {
        e eVar = this.f2253d;
        eVar.getClass();
        this.f2259j.updateSelection(this.f2250a, Selection.getSelectionStart(eVar), Selection.getSelectionEnd(eVar), BaseInputConnection.getComposingSpanStart(eVar), BaseInputConnection.getComposingSpanEnd(eVar));
        ExtractedTextRequest extractedTextRequest = this.f2255f;
        InputMethodManager inputMethodManager = this.f2259j;
        q qVar = this.f2250a;
        if (extractedTextRequest != null) {
            inputMethodManager.updateExtractedText(qVar, extractedTextRequest.token, c(extractedTextRequest));
        }
        if (this.f2256g) {
            inputMethodManager.updateCursorAnchorInfo(qVar, b());
        }
    }

    public final CursorAnchorInfo b() {
        CursorAnchorInfo.Builder builder = this.f2257h;
        if (builder == null) {
            this.f2257h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        CursorAnchorInfo.Builder builder2 = this.f2257h;
        e eVar = this.f2253d;
        eVar.getClass();
        int selectionStart = Selection.getSelectionStart(eVar);
        eVar.getClass();
        builder2.setSelectionRange(selectionStart, Selection.getSelectionEnd(eVar));
        eVar.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(eVar);
        eVar.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(eVar);
        if (composingSpanStart < 0 || composingSpanEnd <= composingSpanStart) {
            this.f2257h.setComposingText(-1, "");
        } else {
            this.f2257h.setComposingText(composingSpanStart, eVar.toString().subSequence(composingSpanStart, composingSpanEnd));
        }
        return this.f2257h.build();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.f2253d.b();
        this.f2263n++;
        return super.beginBatchEdit();
    }

    public final ExtractedText c(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f2258i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        CharSequence string = this.f2253d;
        string.getClass();
        extractedText.selectionStart = Selection.getSelectionStart(string);
        string.getClass();
        extractedText.selectionEnd = Selection.getSelectionEnd(string);
        if (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) {
            string = string.toString();
        }
        extractedText.text = string;
        return extractedText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final void closeConnection() {
        super.closeConnection();
        this.f2253d.e(this);
        while (this.f2263n > 0) {
            endBatchEdit();
            this.f2263n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        int i3;
        if (Build.VERSION.SDK_INT >= 25 && (i2 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    Uri contentUri = inputContentInfo.getContentUri();
                    String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    Context context = this.f2250a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (inputStreamOpenInputStream != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[65536];
                                while (true) {
                                    try {
                                        i3 = inputStreamOpenInputStream.read(bArr);
                                    } catch (IOException unused) {
                                        i3 = -1;
                                    }
                                    if (i3 == -1) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        HashMap map = new HashMap();
                                        map.put("mimeType", mimeType);
                                        map.put("data", byteArray);
                                        map.put("uri", contentUri.toString());
                                        Q q2 = this.f2252c;
                                        q2.getClass();
                                        ((C0026b) q2.f471f).F("TextInputClient.performAction", Arrays.asList(Integer.valueOf(this.f2251b), "TextInputAction.commitContent", map), null);
                                        inputContentInfo.releasePermission();
                                        return true;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i3);
                                }
                            }
                        } catch (FileNotFoundException unused2) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused3) {
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:178:0x02ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:194:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x01af A[ADDED_TO_REGION, EDGE_INSN: B:203:0x01af->B:107:0x01af BREAK  A[LOOP:4: B:142:0x0234->B:208:?], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:64:0x0100  */
    /* JADX WARN: Code duplicated, block: B:75:0x0134  */
    /* JADX WARN: Code duplicated, block: B:78:0x013b A[EDGE_INSN: B:78:0x013b->B:18:0x003f BREAK  A[LOOP:2: B:63:0x00fe->B:198:?]] */
    /* JADX WARN: Code duplicated, block: B:79:0x0142 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0144  */
    /* JADX WARN: Code duplicated, block: B:82:0x014f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0172 A[PHI: r8 r11 r13
      0x0172: PHI (r8v13 boolean) = (r8v10 boolean), (r8v10 boolean), (r8v16 boolean) binds: [B:79:0x0142, B:89:0x0174, B:87:0x0170] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r11v5 int) = (r11v4 int), (r11v7 int), (r11v8 int) binds: [B:79:0x0142, B:89:0x0174, B:87:0x0170] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r13v16 int) = (r13v14 int), (r13v18 int), (r13v19 int) binds: [B:79:0x0142, B:89:0x0174, B:87:0x0170] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x0174  */
    public final boolean d(boolean z2, boolean z3) {
        int iCharCount;
        int iCharCount2;
        int iCharCount3;
        int iCharCount4;
        int iMin;
        int iCodePointBefore;
        int iCharCount5;
        int iCharCount6;
        boolean z4;
        int iCharCount7;
        int iCodePointBefore2;
        int iCharCount8;
        int iCharCount9;
        int iCodePointBefore3;
        int iCodePointBefore4;
        int i2;
        int iCharCount10;
        e eVar = this.f2253d;
        int selectionStart = Selection.getSelectionStart(eVar);
        int selectionEnd = Selection.getSelectionEnd(eVar);
        int i3 = 0;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        D.j jVar = this.f2261l;
        if (z2) {
            jVar.getClass();
            if (selectionEnd > 1 && (iCharCount6 = selectionEnd - (iCharCount5 = Character.charCount((iCodePointBefore = Character.codePointBefore(eVar, selectionEnd))))) != 0) {
                if (iCodePointBefore != 10) {
                    FlutterJNI flutterJNI = (FlutterJNI) jVar.f44f;
                    if (flutterJNI.isCodePointRegionalIndicator(iCodePointBefore)) {
                        int iCodePointBefore5 = Character.codePointBefore(eVar, iCharCount6);
                        int iCharCount11 = iCharCount6 - Character.charCount(iCodePointBefore5);
                        int i4 = 1;
                        while (iCharCount11 > 0 && flutterJNI.isCodePointRegionalIndicator(iCodePointBefore5)) {
                            iCodePointBefore5 = Character.codePointBefore(eVar, iCharCount11);
                            iCharCount11 -= Character.charCount(iCodePointBefore5);
                            i4++;
                        }
                        if (i4 % 2 == 0) {
                            iCharCount5 += 2;
                        }
                    } else if (iCodePointBefore == 8419) {
                        int iCodePointBefore6 = Character.codePointBefore(eVar, iCharCount6);
                        int iCharCount12 = iCharCount6 - Character.charCount(iCodePointBefore6);
                        if (iCharCount12 > 0 && flutterJNI.isCodePointVariantSelector(iCodePointBefore6)) {
                            int iCodePointBefore7 = Character.codePointBefore(eVar, iCharCount12);
                            if (D.j.s(iCodePointBefore7)) {
                                iCharCount10 = Character.charCount(iCodePointBefore7) + Character.charCount(iCodePointBefore6);
                                iCharCount5 += iCharCount10;
                            }
                        } else if (D.j.s(iCodePointBefore6)) {
                            iCharCount10 = Character.charCount(iCodePointBefore6);
                            iCharCount5 += iCharCount10;
                        }
                    } else {
                        if (iCodePointBefore == 917631) {
                            int iCodePointBefore8 = Character.codePointBefore(eVar, iCharCount6);
                            iCharCount6 -= Character.charCount(iCodePointBefore8);
                            iCodePointBefore = iCodePointBefore8;
                            while (iCharCount6 > 0 && 917536 <= iCodePointBefore && iCodePointBefore <= 917630) {
                                iCharCount5 += Character.charCount(iCodePointBefore);
                                iCodePointBefore = Character.codePointBefore(eVar, iCharCount6);
                                iCharCount6 -= Character.charCount(iCodePointBefore);
                            }
                            if (flutterJNI.isCodePointEmoji(iCodePointBefore)) {
                                iCharCount5 += Character.charCount(iCodePointBefore);
                            } else {
                                i2 = selectionEnd - 2;
                            }
                        }
                        if (flutterJNI.isCodePointVariantSelector(iCodePointBefore)) {
                            iCodePointBefore = Character.codePointBefore(eVar, iCharCount6);
                            if (flutterJNI.isCodePointEmoji(iCodePointBefore)) {
                                iCharCount5 += Character.charCount(iCodePointBefore);
                                iCharCount6 -= iCharCount5;
                                if (flutterJNI.isCodePointEmoji(iCodePointBefore)) {
                                    z4 = false;
                                    iCharCount7 = 0;
                                    do {
                                        if (z4) {
                                            iCharCount5 = Character.charCount(iCodePointBefore) + iCharCount7 + 1 + iCharCount5;
                                            z4 = false;
                                        }
                                        if (!flutterJNI.isCodePointEmojiModifier(iCodePointBefore)) {
                                            if (iCharCount6 > 0) {
                                                iCodePointBefore3 = Character.codePointBefore(eVar, iCharCount6);
                                                iCharCount6 -= Character.charCount(iCodePointBefore3);
                                                if (iCodePointBefore3 == 8205) {
                                                    iCodePointBefore4 = Character.codePointBefore(eVar, iCharCount6);
                                                    iCharCount6 -= Character.charCount(iCodePointBefore4);
                                                    if (iCharCount6 > 0 || !flutterJNI.isCodePointVariantSelector(iCodePointBefore4)) {
                                                        iCodePointBefore = iCodePointBefore4;
                                                        z4 = true;
                                                    } else {
                                                        int iCodePointBefore9 = Character.codePointBefore(eVar, iCharCount6);
                                                        iCharCount7 = Character.charCount(iCodePointBefore9);
                                                        iCharCount6 -= Character.charCount(iCodePointBefore9);
                                                        iCodePointBefore = iCodePointBefore9;
                                                        z4 = true;
                                                    }
                                                } else {
                                                    iCodePointBefore = iCodePointBefore3;
                                                }
                                                iCharCount7 = 0;
                                            } else {
                                                iCharCount7 = 0;
                                            }
                                            if (iCharCount6 != 0 || !z4) {
                                                break;
                                            }
                                        } else {
                                            iCodePointBefore2 = Character.codePointBefore(eVar, iCharCount6);
                                            iCharCount8 = iCharCount6 - Character.charCount(iCodePointBefore2);
                                            if (iCharCount8 > 0 && flutterJNI.isCodePointVariantSelector(iCodePointBefore2)) {
                                                iCodePointBefore2 = Character.codePointBefore(eVar, iCharCount8);
                                                if (!flutterJNI.isCodePointEmoji(iCodePointBefore2)) {
                                                    break;
                                                }
                                                iCharCount9 = Character.charCount(iCodePointBefore2);
                                                Character.charCount(iCodePointBefore2);
                                            } else {
                                                iCharCount9 = 0;
                                            }
                                            if (!flutterJNI.isCodePointEmojiModifierBase(iCodePointBefore2)) {
                                                break;
                                            }
                                            iCharCount5 += Character.charCount(iCodePointBefore2) + iCharCount9;
                                            break;
                                        }
                                    } while (flutterJNI.isCodePointEmoji(iCodePointBefore));
                                }
                            }
                        } else if (flutterJNI.isCodePointEmoji(iCodePointBefore)) {
                            z4 = false;
                            iCharCount7 = 0;
                            do {
                                if (z4) {
                                    iCharCount5 = Character.charCount(iCodePointBefore) + iCharCount7 + 1 + iCharCount5;
                                    z4 = false;
                                }
                                if (!flutterJNI.isCodePointEmojiModifier(iCodePointBefore)) {
                                    iCodePointBefore2 = Character.codePointBefore(eVar, iCharCount6);
                                    iCharCount8 = iCharCount6 - Character.charCount(iCodePointBefore2);
                                    if (iCharCount8 > 0) {
                                        iCharCount9 = 0;
                                        if (!flutterJNI.isCodePointEmojiModifierBase(iCodePointBefore2)) {
                                            break;
                                        }
                                        iCharCount5 += Character.charCount(iCodePointBefore2) + iCharCount9;
                                        break;
                                    }
                                    iCharCount9 = 0;
                                    if (!flutterJNI.isCodePointEmojiModifierBase(iCodePointBefore2)) {
                                        break;
                                    }
                                    iCharCount5 += Character.charCount(iCodePointBefore2) + iCharCount9;
                                    break;
                                }
                                if (iCharCount6 > 0) {
                                    iCodePointBefore3 = Character.codePointBefore(eVar, iCharCount6);
                                    iCharCount6 -= Character.charCount(iCodePointBefore3);
                                    if (iCodePointBefore3 == 8205) {
                                        iCodePointBefore4 = Character.codePointBefore(eVar, iCharCount6);
                                        iCharCount6 -= Character.charCount(iCodePointBefore4);
                                        if (iCharCount6 > 0) {
                                        }
                                        iCodePointBefore = iCodePointBefore4;
                                        z4 = true;
                                    } else {
                                        iCodePointBefore = iCodePointBefore3;
                                    }
                                    iCharCount7 = 0;
                                } else {
                                    iCharCount7 = 0;
                                }
                                if (iCharCount6 != 0) {
                                    break;
                                }
                            } while (flutterJNI.isCodePointEmoji(iCodePointBefore));
                        }
                    }
                } else if (Character.codePointBefore(eVar, iCharCount6) == 13) {
                    iCharCount5++;
                }
                i2 = selectionEnd - iCharCount5;
            } else {
                i2 = 0;
            }
            iMin = Math.max(i2, 0);
        } else {
            jVar.getClass();
            int length = eVar.length();
            int i5 = length - 1;
            if (selectionEnd >= i5) {
                i3 = length;
            } else {
                int iCodePointAt = Character.codePointAt(eVar, selectionEnd);
                int iCharCount13 = Character.charCount(iCodePointAt);
                int i6 = selectionEnd + iCharCount13;
                if (i6 != 0) {
                    if (iCodePointAt != 10) {
                        FlutterJNI flutterJNI2 = (FlutterJNI) jVar.f44f;
                        if (!flutterJNI2.isCodePointRegionalIndicator(iCodePointAt)) {
                            if (D.j.s(iCodePointAt)) {
                                iCharCount13 += Character.charCount(iCodePointAt);
                            }
                            if (iCodePointAt != 8419) {
                                if (flutterJNI2.isCodePointEmoji(iCodePointAt)) {
                                    boolean z5 = false;
                                    int i7 = 0;
                                    do {
                                        if (z5) {
                                            iCharCount13 = Character.charCount(iCodePointAt) + i7 + 1 + iCharCount13;
                                            z5 = false;
                                        }
                                        if (flutterJNI2.isCodePointEmojiModifier(iCodePointAt)) {
                                            break;
                                        }
                                        if (i6 < length) {
                                            int iCodePointAt2 = Character.codePointAt(eVar, i6);
                                            int iCharCount14 = Character.charCount(iCodePointAt2) + i6;
                                            if (iCodePointAt2 != 8419) {
                                                if (flutterJNI2.isCodePointEmojiModifier(iCodePointAt2)) {
                                                    iCharCount4 = Character.charCount(iCodePointAt2);
                                                } else if (flutterJNI2.isCodePointVariantSelector(iCodePointAt2)) {
                                                    iCharCount4 = Character.charCount(iCodePointAt2);
                                                } else {
                                                    if (iCodePointAt2 == 8205) {
                                                        int iCodePointAt3 = Character.codePointAt(eVar, iCharCount14);
                                                        int iCharCount15 = Character.charCount(iCodePointAt3) + iCharCount14;
                                                        if (iCharCount15 >= length || !flutterJNI2.isCodePointVariantSelector(iCodePointAt3)) {
                                                            iCodePointAt = iCodePointAt3;
                                                            i6 = iCharCount15;
                                                            z5 = true;
                                                        } else {
                                                            int iCodePointAt4 = Character.codePointAt(eVar, iCharCount15);
                                                            int iCharCount16 = Character.charCount(iCodePointAt4);
                                                            int iCharCount17 = Character.charCount(iCodePointAt4) + iCharCount15;
                                                            i7 = iCharCount16;
                                                            i6 = iCharCount17;
                                                            iCodePointAt = iCodePointAt4;
                                                            z5 = true;
                                                        }
                                                        if (i6 < length || !z5) {
                                                            break;
                                                        }
                                                    } else {
                                                        iCodePointAt = iCodePointAt2;
                                                        i6 = iCharCount14;
                                                    }
                                                    i7 = 0;
                                                    if (i6 < length) {
                                                        break;
                                                    }
                                                }
                                                iCharCount13 += iCharCount4;
                                                break;
                                            }
                                            int iCodePointBefore10 = Character.codePointBefore(eVar, iCharCount14);
                                            int iCharCount18 = Character.charCount(iCodePointBefore10) + iCharCount14;
                                            if (iCharCount18 < length && flutterJNI2.isCodePointVariantSelector(iCodePointBefore10)) {
                                                int iCodePointAt5 = Character.codePointAt(eVar, iCharCount18);
                                                if (!D.j.s(iCodePointAt5)) {
                                                    break;
                                                }
                                                iCharCount2 = Character.charCount(iCodePointBefore10);
                                                iCharCount3 = Character.charCount(iCodePointAt5);
                                                iCharCount13 += iCharCount3 + iCharCount2;
                                                break;
                                            }
                                            if (!D.j.s(iCodePointBefore10)) {
                                                break;
                                            }
                                            iCharCount = Character.charCount(iCodePointBefore10);
                                            iCharCount13 += iCharCount;
                                            break;
                                        }
                                        i7 = 0;
                                        if (i6 < length) {
                                            break;
                                            break;
                                        }
                                    } while (flutterJNI2.isCodePointEmoji(iCodePointAt));
                                }
                            } else {
                                int iCodePointBefore11 = Character.codePointBefore(eVar, i6);
                                int iCharCount19 = Character.charCount(iCodePointBefore11) + i6;
                                if (iCharCount19 < length && flutterJNI2.isCodePointVariantSelector(iCodePointBefore11)) {
                                    int iCodePointAt6 = Character.codePointAt(eVar, iCharCount19);
                                    if (D.j.s(iCodePointAt6)) {
                                        iCharCount2 = Character.charCount(iCodePointBefore11);
                                        iCharCount3 = Character.charCount(iCodePointAt6);
                                        iCharCount13 += iCharCount3 + iCharCount2;
                                        break;
                                    }
                                } else if (D.j.s(iCodePointBefore11)) {
                                    iCharCount = Character.charCount(iCodePointBefore11);
                                    iCharCount13 += iCharCount;
                                    break;
                                }
                            }
                        } else if (i6 >= i5 || !flutterJNI2.isCodePointRegionalIndicator(Character.codePointAt(eVar, i6))) {
                            i3 = i6;
                        } else {
                            int iCharCount20 = selectionEnd;
                            while (iCharCount20 > 0 && flutterJNI2.isCodePointRegionalIndicator(Character.codePointBefore(eVar, selectionEnd))) {
                                iCharCount20 -= Character.charCount(Character.codePointBefore(eVar, selectionEnd));
                                i3++;
                            }
                            if (i3 % 2 == 0) {
                                iCharCount13 += 2;
                            }
                        }
                    } else if (Character.codePointAt(eVar, i6) == 13) {
                        iCharCount13++;
                    }
                    i3 = selectionEnd + iCharCount13;
                }
            }
            iMin = Math.min(i3, eVar.length());
        }
        if (selectionStart != selectionEnd || z3) {
            setSelection(selectionStart, iMin);
        } else {
            setSelection(iMin, iMin);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i3) {
        e eVar = this.f2253d;
        eVar.getClass();
        if (Selection.getSelectionStart(eVar) == -1) {
            return true;
        }
        return super.deleteSurroundingText(i2, i3);
    }

    public final boolean e(boolean z2, boolean z3) {
        e eVar = this.f2253d;
        int selectionStart = Selection.getSelectionStart(eVar);
        int selectionEnd = Selection.getSelectionEnd(eVar);
        boolean z4 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z3) {
            z4 = true;
        }
        beginBatchEdit();
        DynamicLayout dynamicLayout = this.f2260k;
        if (z4) {
            if (z2) {
                Selection.moveUp(eVar, dynamicLayout);
            } else {
                Selection.moveDown(eVar, dynamicLayout);
            }
            int selectionStart2 = Selection.getSelectionStart(eVar);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z2) {
                Selection.extendUp(eVar, dynamicLayout);
            } else {
                Selection.extendDown(eVar, dynamicLayout);
            }
            setSelection(Selection.getSelectionStart(eVar), Selection.getSelectionEnd(eVar));
        }
        endBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        boolean zEndBatchEdit = super.endBatchEdit();
        this.f2263n--;
        this.f2253d.c();
        return zEndBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f2253d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
        this.f2255f = (i2 & 1) != 0 ? extractedTextRequest : null;
        return c(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i2) {
        beginBatchEdit();
        boolean z2 = true;
        e eVar = this.f2253d;
        if (i2 == 16908319) {
            setSelection(0, eVar.length());
        } else {
            q qVar = this.f2250a;
            if (i2 == 16908320) {
                int selectionStart = Selection.getSelectionStart(eVar);
                int selectionEnd = Selection.getSelectionEnd(eVar);
                if (selectionStart != selectionEnd) {
                    int iMin = Math.min(selectionStart, selectionEnd);
                    int iMax = Math.max(selectionStart, selectionEnd);
                    ((ClipboardManager) qVar.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", eVar.subSequence(iMin, iMax)));
                    eVar.delete(iMin, iMax);
                    setSelection(iMin, iMin);
                }
            } else if (i2 == 16908321) {
                int selectionStart2 = Selection.getSelectionStart(eVar);
                int selectionEnd2 = Selection.getSelectionEnd(eVar);
                if (selectionStart2 != selectionEnd2) {
                    ((ClipboardManager) qVar.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", eVar.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
                }
            } else if (i2 == 16908322) {
                ClipData primaryClip = ((ClipboardManager) qVar.getContext().getSystemService("clipboard")).getPrimaryClip();
                if (primaryClip != null) {
                    CharSequence charSequenceCoerceToText = primaryClip.getItemAt(0).coerceToText(qVar.getContext());
                    int iMax2 = Math.max(0, Selection.getSelectionStart(eVar));
                    int iMax3 = Math.max(0, Selection.getSelectionEnd(eVar));
                    int iMin2 = Math.min(iMax2, iMax3);
                    int iMax4 = Math.max(iMax2, iMax3);
                    if (iMin2 != iMax4) {
                        eVar.delete(iMin2, iMax4);
                    }
                    eVar.insert(iMin2, charSequenceCoerceToText);
                    int length = charSequenceCoerceToText.length() + iMin2;
                    setSelection(length, length);
                }
            } else {
                z2 = false;
            }
        }
        endBatchEdit();
        return z2;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i2) {
        int i3 = this.f2251b;
        Q q2 = this.f2252c;
        if (i2 == 0) {
            q2.getClass();
            ((C0026b) q2.f471f).F("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.unspecified"), null);
        } else if (i2 == 1) {
            q2.getClass();
            ((C0026b) q2.f471f).F("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.newline"), null);
        } else if (i2 == 2) {
            q2.getClass();
            ((C0026b) q2.f471f).F("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.go"), null);
        } else if (i2 == 3) {
            q2.getClass();
            ((C0026b) q2.f471f).F("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.search"), null);
        } else if (i2 == 4) {
            q2.getClass();
            ((C0026b) q2.f471f).F("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.send"), null);
        } else if (i2 == 5) {
            q2.getClass();
            ((C0026b) q2.f471f).F("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.next"), null);
        } else if (i2 != 7) {
            q2.getClass();
            ((C0026b) q2.f471f).F("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.done"), null);
        } else {
            q2.getClass();
            ((C0026b) q2.f471f).F("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.previous"), null);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Q q2 = this.f2252c;
        q2.getClass();
        HashMap map = new HashMap();
        map.put("action", str);
        if (bundle != null) {
            HashMap map2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    map2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    map2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    map2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    map2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    map2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    map2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    map2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    map2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            map.put("data", map2);
        }
        ((C0026b) q2.f471f).F("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(this.f2251b), map), null);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i2) {
        if ((i2 & 1) != 0) {
            this.f2259j.updateCursorAnchorInfo(this.f2250a, b());
        }
        this.f2256g = (i2 & 2) != 0;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f2262m.D(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i2) {
        beginBatchEdit();
        boolean zCommitText = charSequence.length() == 0 ? super.commitText(charSequence, i2) : super.setComposingText(charSequence, i2);
        endBatchEdit();
        return zCommitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i2, int i3) {
        beginBatchEdit();
        boolean selection = super.setSelection(i2, i3);
        endBatchEdit();
        return selection;
    }
}
