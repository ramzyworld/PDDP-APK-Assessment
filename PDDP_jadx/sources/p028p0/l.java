package p028p0;

import N.C0026b;
import java.util.HashMap;
import p015i0.b;
import p030q0.o;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f2947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0026b f2948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f2949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2951f;

    public l(b bVar, boolean z2) {
        C0026b c0026b = new C0026b(bVar, "flutter/restoration", o.f3031a, 10);
        this.f2950e = false;
        this.f2951f = false;
        b bVar2 = new b(8, this);
        this.f2948c = c0026b;
        this.f2946a = z2;
        c0026b.N(bVar2);
    }

    public static HashMap a(byte[] bArr) {
        HashMap map = new HashMap();
        map.put("enabled", Boolean.TRUE);
        map.put("data", bArr);
        return map;
    }
}
