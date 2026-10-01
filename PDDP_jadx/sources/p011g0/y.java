package p011g0;

import I.j;
import X0.i;
import android.util.Log;
import android.view.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p030q0.e;
import p030q0.f;

/* JADX INFO: loaded from: classes.dex */
public final class y implements B {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f1933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f1934f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f1935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f1936h;

    public y(f fVar) {
        HashMap map = new HashMap();
        this.f1935g = map;
        this.f1936h = new i();
        this.f1933e = fVar;
        D d2 = H.f1840a;
        G g2 = new G();
        g2.f1839a = false;
        G g3 = new G[]{g2}[0];
        g3.getClass();
        map.put(4294967556L, g3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p011g0.B
    public final void a(final KeyEvent keyEvent, z zVar) {
        Long lValueOf;
        boolean z2;
        int i2;
        String str;
        int i3;
        G g2;
        long j2;
        HashMap map;
        int i4;
        boolean z3;
        if (keyEvent.getScanCode() == 0 && keyEvent.getKeyCode() == 0) {
            j2 = 0;
        } else {
            long scanCode = keyEvent.getScanCode();
            if (scanCode == 0) {
                lValueOf = Long.valueOf((((long) keyEvent.getKeyCode()) & 4294967295L) | 73014444032L);
            } else {
                lValueOf = (Long) H.f1840a.get(Long.valueOf(scanCode));
                if (lValueOf == null) {
                    lValueOf = Long.valueOf((((long) keyEvent.getScanCode()) & 4294967295L) | 73014444032L);
                }
            }
            Long l2 = lValueOf;
            Long lValueOf2 = (Long) H.f1841b.get(Long.valueOf(keyEvent.getKeyCode()));
            if (lValueOf2 == null) {
                lValueOf2 = Long.valueOf((((long) keyEvent.getKeyCode()) & 4294967295L) | 73014444032L);
            }
            Long l3 = lValueOf2;
            ArrayList arrayList = new ArrayList();
            F[] fArr = H.f1842c;
            int length = fArr.length;
            int i5 = 0;
            while (true) {
                HashMap map2 = this.f1934f;
                if (i5 >= length) {
                    HashMap map3 = map2;
                    HashMap map4 = this.f1935g;
                    for (G g3 : map4.values()) {
                        int metaState = keyEvent.getMetaState();
                        g3.getClass();
                        boolean z4 = (metaState & 1048576) != 0;
                        if (4294967556L == l3.longValue() || g3.f1839a == z4) {
                            map = map3;
                        } else {
                            HashMap map5 = map3;
                            boolean zContainsKey = map5.containsKey(458809L);
                            boolean z5 = !zContainsKey;
                            if (!zContainsKey) {
                                g3.f1839a = !g3.f1839a;
                            }
                            map = map5;
                            c(z5, 4294967556L, 458809L, keyEvent.getEventTime());
                            if (zContainsKey) {
                                g3.f1839a = !g3.f1839a;
                            }
                            c(zContainsKey, 4294967556L, 458809L, keyEvent.getEventTime());
                        }
                        map3 = map;
                    }
                    HashMap map6 = map3;
                    int action = keyEvent.getAction();
                    if (action != 0) {
                        z2 = action != 1;
                        j2 = 0;
                        break;
                    }
                    Long l4 = (Long) map6.get(l2);
                    if (!z2) {
                        if (l4 != null) {
                            i2 = 1;
                            str = null;
                            i3 = 2;
                        }
                        j2 = 0;
                        break;
                    }
                    if (l4 == null) {
                        i3 = 1;
                    } else if (keyEvent.getRepeatCount() > 0) {
                        i3 = 3;
                    } else {
                        c(false, l4, l2, keyEvent.getEventTime());
                        i3 = 1;
                    }
                    char cCharValue = this.f1936h.a(keyEvent.getUnicodeChar()).charValue();
                    str = cCharValue != 0 ? "" + cCharValue : null;
                    i2 = 1;
                    if (i3 != 3) {
                        d(l2, z2 ? l3 : null);
                    }
                    if (i3 == i2 && (g2 = (G) map4.get(l3)) != null) {
                        g2.f1839a = (g2.f1839a ? 1 : 0) ^ i2;
                    }
                    u uVar = new u();
                    int source = keyEvent.getSource();
                    if (source == 513) {
                        uVar.f1922f = 2;
                    } else if (source == 1025) {
                        uVar.f1922f = 3;
                    } else if (source == 16777232) {
                        uVar.f1922f = 4;
                    } else if (source != 33554433) {
                        uVar.f1922f = 1;
                    } else {
                        uVar.f1922f = 5;
                    }
                    uVar.f1917a = keyEvent.getEventTime();
                    uVar.f1918b = i3;
                    uVar.f1920d = l3.longValue();
                    uVar.f1919c = l2.longValue();
                    uVar.f1923g = str;
                    uVar.f1921e = false;
                    b(uVar, zVar);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                F f2 = fArr[i5];
                boolean z6 = (keyEvent.getMetaState() & f2.f1837a) != 0;
                long jLongValue = l3.longValue();
                final long jLongValue2 = l2.longValue();
                E[] eArr = (E[]) f2.f1838b;
                boolean[] zArr = new boolean[2];
                Boolean[] boolArr = new Boolean[2];
                int i6 = 0;
                boolean z7 = false;
                for (int i7 = 2; i6 < i7; i7 = 2) {
                    final E e2 = eArr[i6];
                    boolean[] zArr2 = zArr;
                    boolean zContainsKey2 = map2.containsKey(Long.valueOf(e2.f1835a));
                    zArr2[i6] = zContainsKey2;
                    int i8 = i6;
                    if (e2.f1836b == jLongValue) {
                        boolean z8 = keyEvent.getRepeatCount() > 0;
                        int action2 = keyEvent.getAction();
                        if (action2 == 0) {
                            i4 = z8 ? 3 : 1;
                        } else {
                            if (action2 != 1) {
                                throw new AssertionError("Unexpected event type");
                            }
                            i4 = 2;
                        }
                        int iB = j.b(i4);
                        if (iB != 0) {
                            if (iB != 1) {
                                if (iB == 2) {
                                    if (!z6) {
                                        arrayList.add(new x(this, e2, keyEvent, 0));
                                    }
                                    boolArr[i8] = Boolean.valueOf(zArr2[i8]);
                                    z3 = true;
                                }
                                i5 = i5;
                            } else {
                                boolArr[i8] = Boolean.valueOf(zArr2[i8]);
                            }
                            z3 = z7;
                            i5 = i5;
                        } else {
                            boolArr[i8] = Boolean.FALSE;
                            if (z6) {
                                map2 = map2;
                            } else {
                                map2 = map2;
                                arrayList.add(new Runnable() { // from class: g0.w
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        y yVar = this.f1925e;
                                        yVar.getClass();
                                        yVar.c(false, Long.valueOf(e2.f1836b), Long.valueOf(jLongValue2), keyEvent.getEventTime());
                                    }
                                });
                            }
                            z3 = true;
                        }
                        z7 = z3;
                    } else {
                        boolArr = boolArr;
                        map2 = map2;
                        zArr2 = zArr2;
                        i5 = i5;
                        z7 = z7 || zContainsKey2;
                    }
                    i6 = i8 + 1;
                    zArr = zArr2;
                    boolArr = boolArr;
                    i5 = i5;
                    map2 = map2;
                }
                Boolean[] boolArr2 = boolArr;
                boolean[] zArr3 = zArr;
                int i9 = i5;
                if (z6) {
                    for (int i10 = 0; i10 < 2; i10++) {
                        if (boolArr2[i10] == null) {
                            if (z7) {
                                boolArr2[i10] = Boolean.valueOf(zArr3[i10]);
                            } else {
                                boolArr2[i10] = Boolean.TRUE;
                                z7 = true;
                            }
                        }
                    }
                    if (!z7) {
                        boolArr2[0] = Boolean.TRUE;
                    }
                } else {
                    for (int i11 = 0; i11 < 2; i11++) {
                        if (boolArr2[i11] == null) {
                            boolArr2[i11] = Boolean.FALSE;
                        }
                    }
                }
                for (int i12 = 0; i12 < 2; i12++) {
                    if (zArr3[i12] != boolArr2[i12].booleanValue()) {
                        E e3 = eArr[i12];
                        c(boolArr2[i12].booleanValue(), Long.valueOf(e3.f1836b), Long.valueOf(e3.f1835a), keyEvent.getEventTime());
                    }
                }
                i5 = i9 + 1;
            }
        }
        c(true, Long.valueOf(j2), Long.valueOf(j2), 0L);
        zVar.a(true);
    }

    public final void b(u uVar, final z zVar) {
        long j2;
        long j3;
        byte[] bytes = null;
        e eVar = zVar == null ? null : new e() { // from class: g0.v
            @Override // p030q0.e
            public final void a(ByteBuffer byteBuffer) {
                Boolean boolValueOf = Boolean.FALSE;
                if (byteBuffer != null) {
                    byteBuffer.rewind();
                    if (byteBuffer.capacity() != 0) {
                        boolValueOf = Boolean.valueOf(byteBuffer.get() != 0);
                    }
                } else {
                    Log.w("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
                }
                zVar.a(boolValueOf.booleanValue());
            }
        };
        try {
            String str = uVar.f1923g;
            if (str != null) {
                bytes = str.getBytes("UTF-8");
            }
            int length = bytes == null ? 0 : bytes.length;
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(length + 56);
            byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocateDirect.putLong(length);
            byteBufferAllocateDirect.putLong(uVar.f1917a);
            int i2 = uVar.f1918b;
            if (i2 == 1) {
                j2 = 0;
            } else if (i2 == 2) {
                j2 = 1;
            } else {
                if (i2 != 3) {
                    throw null;
                }
                j2 = 2;
            }
            byteBufferAllocateDirect.putLong(j2);
            byteBufferAllocateDirect.putLong(uVar.f1919c);
            byteBufferAllocateDirect.putLong(uVar.f1920d);
            byteBufferAllocateDirect.putLong(uVar.f1921e ? 1L : 0L);
            int i3 = uVar.f1922f;
            if (i3 == 1) {
                j3 = 0;
            } else if (i3 == 2) {
                j3 = 1;
            } else if (i3 == 3) {
                j3 = 2;
            } else if (i3 == 4) {
                j3 = 3;
            } else {
                if (i3 != 5) {
                    throw null;
                }
                j3 = 4;
            }
            byteBufferAllocateDirect.putLong(j3);
            if (bytes != null) {
                byteBufferAllocateDirect.put(bytes);
            }
            this.f1933e.n("flutter/keydata", byteBufferAllocateDirect, eVar);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    public final void c(boolean z2, Long l2, Long l3, long j2) {
        u uVar = new u();
        uVar.f1917a = j2;
        uVar.f1918b = z2 ? 1 : 2;
        uVar.f1920d = l2.longValue();
        uVar.f1919c = l3.longValue();
        uVar.f1923g = null;
        uVar.f1921e = true;
        uVar.f1922f = 1;
        if (l3.longValue() != 0 && l2.longValue() != 0) {
            if (!z2) {
                l2 = null;
            }
            d(l3, l2);
        }
        b(uVar, null);
    }

    public final void d(Long l2, Long l3) {
        HashMap map = this.f1934f;
        if (l3 != null) {
            if (((Long) map.put(l2, l3)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) map.remove(l2)) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
