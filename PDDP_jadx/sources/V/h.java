package V;

import H0.l;

/* JADX INFO: loaded from: classes.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f960c;

    public h(Object obj, int i2, a aVar) {
        I0.i.e(obj, "value");
        I0.h.h("verificationMode", i2);
        this.f958a = obj;
        this.f959b = i2;
        this.f960c = aVar;
    }

    @Override // V.g
    public final Object a() {
        return this.f958a;
    }

    @Override // V.g
    public final g d(String str, l lVar) {
        Object obj = this.f958a;
        return ((Boolean) lVar.j(obj)).booleanValue() ? this : new f(obj, str, this.f960c, this.f959b);
    }
}
