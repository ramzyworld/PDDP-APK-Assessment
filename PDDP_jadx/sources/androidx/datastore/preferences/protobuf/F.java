package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0087t f1428b = new C0087t(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1429a;

    public F(C0081m c0081m) {
        AbstractC0092y.a(c0081m, "output");
        this.f1429a = c0081m;
        c0081m.f1538m = this;
    }

    public void a(int i2, boolean z2) {
        ((C0081m) this.f1429a).t0(i2, z2);
    }

    public void b(int i2, C0075g c0075g) {
        ((C0081m) this.f1429a).u0(i2, c0075g);
    }

    public void c(int i2, double d2) {
        C0081m c0081m = (C0081m) this.f1429a;
        c0081m.getClass();
        c0081m.y0(Double.doubleToRawLongBits(d2), i2);
    }

    public void d(int i2, int i3) {
        ((C0081m) this.f1429a).A0(i2, i3);
    }

    public void e(int i2, int i3) {
        ((C0081m) this.f1429a).w0(i2, i3);
    }

    public void f(long j2, int i2) {
        ((C0081m) this.f1429a).y0(j2, i2);
    }

    public void g(int i2, float f2) {
        C0081m c0081m = (C0081m) this.f1429a;
        c0081m.getClass();
        c0081m.w0(i2, Float.floatToRawIntBits(f2));
    }

    public void h(int i2, Object obj, W w2) {
        C0081m c0081m = (C0081m) this.f1429a;
        c0081m.E0(i2, 3);
        w2.d((AbstractC0069a) obj, c0081m.f1538m);
        c0081m.E0(i2, 4);
    }

    public void i(int i2, int i3) {
        ((C0081m) this.f1429a).A0(i2, i3);
    }

    public void j(long j2, int i2) {
        ((C0081m) this.f1429a).H0(j2, i2);
    }

    public void k(int i2, Object obj, W w2) {
        C0081m c0081m = (C0081m) this.f1429a;
        AbstractC0069a abstractC0069a = (AbstractC0069a) obj;
        c0081m.E0(i2, 2);
        c0081m.G0(abstractC0069a.a(w2));
        w2.d(abstractC0069a, c0081m.f1538m);
    }

    public void l(int i2, int i3) {
        ((C0081m) this.f1429a).w0(i2, i3);
    }

    public void m(long j2, int i2) {
        ((C0081m) this.f1429a).y0(j2, i2);
    }

    public void n(int i2, int i3) {
        ((C0081m) this.f1429a).F0(i2, (i3 >> 31) ^ (i3 << 1));
    }

    public void o(long j2, int i2) {
        ((C0081m) this.f1429a).H0((j2 >> 63) ^ (j2 << 1), i2);
    }

    public void p(int i2, int i3) {
        ((C0081m) this.f1429a).F0(i2, i3);
    }

    public void q(long j2, int i2) {
        ((C0081m) this.f1429a).H0(j2, i2);
    }

    public F() {
        T t = T.f1459c;
        L l2 = f1428b;
        try {
            l2 = (L) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
        }
        L[] lArr = {C0087t.f1573b, l2};
        E e2 = new E();
        e2.f1427a = lArr;
        Charset charset = AbstractC0092y.f1577a;
        this.f1429a = e2;
    }
}
