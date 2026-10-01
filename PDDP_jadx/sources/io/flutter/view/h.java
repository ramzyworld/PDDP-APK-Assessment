package io.flutter.view;

import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f2429C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f2430D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f2431E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f2432F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f2433G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f2434H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f2435I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f2436J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f2437K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public float f2438L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f2439M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float[] f2440N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public h f2441O;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public ArrayList f2444R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public f f2445S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public f f2446T;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public float[] f2448V;
    public float[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Rect f2450Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f2451a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2461k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f2462l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f2463m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f2464n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f2465o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f2466p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f2467q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f2468r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f2469s;
    public String t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f2470u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f2471v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f2472w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f2473x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f2474y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f2475z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2452b = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2427A = -1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f2428B = false;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final ArrayList f2442P = new ArrayList();

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final ArrayList f2443Q = new ArrayList();

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f2447U = true;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f2449W = true;

    public h(k kVar) {
        this.f2451a = kVar;
    }

    public static boolean a(h hVar, e eVar) {
        return (hVar.f2454d & eVar.f2420e) != 0;
    }

    public static CharSequence b(h hVar) {
        CharSequence[] charSequenceArr = {e(hVar.f2468r, hVar.f2469s), e(hVar.f2466p, hVar.f2467q), e(hVar.f2473x, hVar.f2474y)};
        CharSequence charSequenceConcat = null;
        for (int i2 = 0; i2 < 3; i2++) {
            CharSequence charSequence = charSequenceArr[i2];
            if (charSequence != null && charSequence.length() > 0) {
                charSequenceConcat = (charSequenceConcat == null || charSequenceConcat.length() == 0) ? charSequence : TextUtils.concat(charSequenceConcat, ", ", charSequence);
            }
        }
        return charSequenceConcat;
    }

    public static boolean c(h hVar, e eVar) {
        return (hVar.f2430D & eVar.f2420e) != 0;
    }

    public static SpannableString e(String str, ArrayList arrayList) {
        if (str == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString(str);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                int iB = I.j.b(jVar.f2478c);
                if (iB == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), jVar.f2476a, jVar.f2477b, 0);
                } else if (iB == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((g) jVar).f2426d)), jVar.f2476a, jVar.f2477b, 0);
                }
            }
        }
        return spannableString;
    }

    public static ArrayList g(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i2 = byteBuffer.getInt();
        if (i2 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = byteBuffer.getInt();
            int i5 = byteBuffer.getInt();
            int i6 = I.j.c(2)[byteBuffer.getInt()];
            int iB = I.j.b(i6);
            if (iB == 0) {
                byteBuffer.getInt();
                i iVar = new i();
                iVar.f2476a = i4;
                iVar.f2477b = i5;
                iVar.f2478c = i6;
                arrayList.add(iVar);
            } else if (iB == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                g gVar = new g();
                gVar.f2476a = i4;
                gVar.f2477b = i5;
                gVar.f2478c = i6;
                gVar.f2426d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                arrayList.add(gVar);
            }
        }
        return arrayList;
    }

    public static void k(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f2 = fArr[3];
        fArr[0] = fArr[0] / f2;
        fArr[1] = fArr[1] / f2;
        fArr[2] = fArr[2] / f2;
        fArr[3] = 0.0f;
    }

    public final void d(ArrayList arrayList) {
        if (h(12)) {
            arrayList.add(this);
        }
        Iterator it = this.f2442P.iterator();
        while (it.hasNext()) {
            ((h) it.next()).d(arrayList);
        }
    }

    public final String f() {
        String str;
        if (h(13) && (str = this.f2466p) != null && !str.isEmpty()) {
            return this.f2466p;
        }
        Iterator it = this.f2442P.iterator();
        while (it.hasNext()) {
            String strF = ((h) it.next()).f();
            if (strF != null && !strF.isEmpty()) {
                return strF;
            }
        }
        return null;
    }

    public final boolean h(int i2) {
        return (I0.h.d(i2) & this.f2453c) != 0;
    }

    public final h i(float[] fArr, boolean z2) {
        float f2 = fArr[3];
        boolean z3 = false;
        float f3 = fArr[0] / f2;
        float f4 = fArr[1] / f2;
        if (f3 < this.f2436J || f3 >= this.f2438L || f4 < this.f2437K || f4 >= this.f2439M) {
            return null;
        }
        float[] fArr2 = new float[4];
        for (h hVar : this.f2443Q) {
            if (!hVar.h(14)) {
                if (hVar.f2447U) {
                    hVar.f2447U = false;
                    if (hVar.f2448V == null) {
                        hVar.f2448V = new float[16];
                    }
                    if (!Matrix.invertM(hVar.f2448V, 0, hVar.f2440N, 0)) {
                        Arrays.fill(hVar.f2448V, 0.0f);
                    }
                }
                Matrix.multiplyMV(fArr2, 0, hVar.f2448V, 0, fArr, 0);
                h hVarI = hVar.i(fArr2, z2);
                if (hVarI != null) {
                    return hVarI;
                }
            }
        }
        if (z2 && this.f2459i != -1) {
            z3 = true;
        }
        if (j() || z3) {
            return this;
        }
        return null;
    }

    public final boolean j() {
        String str;
        String str2;
        String str3;
        if (h(12)) {
            return false;
        }
        if (h(22)) {
            return true;
        }
        int i2 = this.f2454d;
        int i3 = k.f2479z;
        return ((i2 & (-61)) == 0 && (this.f2453c & 10682871) == 0 && ((str = this.f2466p) == null || str.isEmpty()) && (((str2 = this.f2468r) == null || str2.isEmpty()) && ((str3 = this.f2473x) == null || str3.isEmpty()))) ? false : true;
    }

    public final void l(float[] fArr, HashSet hashSet, boolean z2) {
        hashSet.add(this);
        if (this.f2449W) {
            z2 = true;
        }
        if (z2) {
            if (this.X == null) {
                this.X = new float[16];
            }
            if (this.f2440N == null) {
                this.f2440N = new float[16];
            }
            Matrix.multiplyMM(this.X, 0, fArr, 0, this.f2440N, 0);
            float[] fArr2 = {this.f2436J, this.f2437K, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            k(fArr3, this.X, fArr2);
            fArr2[0] = this.f2438L;
            fArr2[1] = this.f2437K;
            k(fArr4, this.X, fArr2);
            fArr2[0] = this.f2438L;
            fArr2[1] = this.f2439M;
            k(fArr5, this.X, fArr2);
            fArr2[0] = this.f2436J;
            fArr2[1] = this.f2439M;
            k(fArr6, this.X, fArr2);
            if (this.f2450Y == null) {
                this.f2450Y = new Rect();
            }
            this.f2450Y.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f2449W = false;
        }
        int i2 = -1;
        for (h hVar : this.f2442P) {
            hVar.f2427A = i2;
            i2 = hVar.f2452b;
            hVar.l(this.X, hashSet, z2);
        }
    }
}
