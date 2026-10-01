package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0079k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0078j f1531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1534d = 0;

    public C0079k(AbstractC0078j abstractC0078j) {
        Charset charset = AbstractC0092y.f1577a;
        this.f1531a = abstractC0078j;
        abstractC0078j.f1523b = this;
    }

    public final int a() {
        int i2 = this.f1534d;
        if (i2 != 0) {
            this.f1532b = i2;
            this.f1534d = 0;
        } else {
            this.f1532b = this.f1531a.u();
        }
        int i3 = this.f1532b;
        if (i3 == 0 || i3 == this.f1533c) {
            return Integer.MAX_VALUE;
        }
        return i3 >>> 3;
    }

    public final void b(Object obj, W w2, C0083o c0083o) {
        int i2 = this.f1533c;
        this.f1533c = ((this.f1532b >>> 3) << 3) | 4;
        try {
            w2.b(obj, this, c0083o);
            if (this.f1532b != this.f1533c) {
                throw new A("Failed to parse the message.");
            }
            this.f1533c = i2;
        } catch (Throwable th) {
            this.f1533c = i2;
            throw th;
        }
    }

    public final void c(Object obj, W w2, C0083o c0083o) throws A {
        AbstractC0078j abstractC0078j = this.f1531a;
        int iV = abstractC0078j.v();
        if (abstractC0078j.f1522a >= 100) {
            throw new A("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iE = abstractC0078j.e(iV);
        abstractC0078j.f1522a++;
        w2.b(obj, this, c0083o);
        abstractC0078j.a(0);
        abstractC0078j.f1522a--;
        abstractC0078j.d(iE);
    }

    public final void d(InterfaceC0091x interfaceC0091x) throws A {
        int iU;
        int i2 = this.f1532b & 7;
        AbstractC0078j abstractC0078j = this.f1531a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0091x).add(Boolean.valueOf(abstractC0078j.f()));
                if (abstractC0078j.c()) {
                    return;
                } else {
                    iU = abstractC0078j.u();
                }
            } while (iU == this.f1532b);
            this.f1534d = iU;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int iB = abstractC0078j.b() + abstractC0078j.v();
        do {
            ((U) interfaceC0091x).add(Boolean.valueOf(abstractC0078j.f()));
        } while (abstractC0078j.b() < iB);
        v(iB);
    }

    public final C0075g e() throws C0093z {
        w(2);
        return this.f1531a.g();
    }

    public final void f(InterfaceC0091x interfaceC0091x) throws C0093z {
        int iU;
        if ((this.f1532b & 7) != 2) {
            throw A.b();
        }
        do {
            ((U) interfaceC0091x).add(e());
            AbstractC0078j abstractC0078j = this.f1531a;
            if (abstractC0078j.c()) {
                return;
            } else {
                iU = abstractC0078j.u();
            }
        } while (iU == this.f1532b);
        this.f1534d = iU;
    }

    public final void g(InterfaceC0091x interfaceC0091x) throws A {
        int iU;
        int i2 = this.f1532b & 7;
        AbstractC0078j abstractC0078j = this.f1531a;
        if (i2 == 1) {
            do {
                ((U) interfaceC0091x).add(Double.valueOf(abstractC0078j.h()));
                if (abstractC0078j.c()) {
                    return;
                } else {
                    iU = abstractC0078j.u();
                }
            } while (iU == this.f1532b);
            this.f1534d = iU;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int iV = abstractC0078j.v();
        if ((iV & 7) != 0) {
            throw new A("Failed to parse the message.");
        }
        int iB = abstractC0078j.b() + iV;
        do {
            ((U) interfaceC0091x).add(Double.valueOf(abstractC0078j.h()));
        } while (abstractC0078j.b() < iB);
    }

    public final void h(InterfaceC0091x interfaceC0091x) throws A {
        int iU;
        int i2 = this.f1532b & 7;
        AbstractC0078j abstractC0078j = this.f1531a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0091x).add(Integer.valueOf(abstractC0078j.i()));
                if (abstractC0078j.c()) {
                    return;
                } else {
                    iU = abstractC0078j.u();
                }
            } while (iU == this.f1532b);
            this.f1534d = iU;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int iB = abstractC0078j.b() + abstractC0078j.v();
        do {
            ((U) interfaceC0091x).add(Integer.valueOf(abstractC0078j.i()));
        } while (abstractC0078j.b() < iB);
        v(iB);
    }

    public final Object i(r0 r0Var, Class cls, C0083o c0083o) throws A {
        int iOrdinal = r0Var.ordinal();
        AbstractC0078j abstractC0078j = this.f1531a;
        switch (iOrdinal) {
            case 0:
                w(1);
                return Double.valueOf(abstractC0078j.h());
            case 1:
                w(5);
                return Float.valueOf(abstractC0078j.l());
            case 2:
                w(0);
                return Long.valueOf(abstractC0078j.n());
            case 3:
                w(0);
                return Long.valueOf(abstractC0078j.w());
            case I.k.LONG_FIELD_NUMBER /* 4 */:
                w(0);
                return Integer.valueOf(abstractC0078j.m());
            case I.k.STRING_FIELD_NUMBER /* 5 */:
                w(1);
                return Long.valueOf(abstractC0078j.k());
            case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                w(5);
                return Integer.valueOf(abstractC0078j.j());
            case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                w(0);
                return Boolean.valueOf(abstractC0078j.f());
            case I.k.BYTES_FIELD_NUMBER /* 8 */:
                w(2);
                return abstractC0078j.t();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                w(2);
                W wA = T.f1459c.a(cls);
                AbstractC0090w abstractC0090wG = wA.g();
                c(abstractC0090wG, wA, c0083o);
                wA.h(abstractC0090wG);
                return abstractC0090wG;
            case 11:
                return e();
            case 12:
                w(0);
                return Integer.valueOf(abstractC0078j.v());
            case 13:
                w(0);
                return Integer.valueOf(abstractC0078j.i());
            case 14:
                w(5);
                return Integer.valueOf(abstractC0078j.o());
            case 15:
                w(1);
                return Long.valueOf(abstractC0078j.p());
            case 16:
                w(0);
                return Integer.valueOf(abstractC0078j.q());
            case 17:
                w(0);
                return Long.valueOf(abstractC0078j.r());
        }
    }

    public final void j(InterfaceC0091x interfaceC0091x) throws A {
        int iU;
        int i2 = this.f1532b & 7;
        AbstractC0078j abstractC0078j = this.f1531a;
        if (i2 == 2) {
            int iV = abstractC0078j.v();
            if ((iV & 3) != 0) {
                throw new A("Failed to parse the message.");
            }
            int iB = abstractC0078j.b() + iV;
            do {
                ((U) interfaceC0091x).add(Integer.valueOf(abstractC0078j.j()));
            } while (abstractC0078j.b() < iB);
            return;
        }
        if (i2 != 5) {
            throw A.b();
        }
        do {
            ((U) interfaceC0091x).add(Integer.valueOf(abstractC0078j.j()));
            if (abstractC0078j.c()) {
                return;
            } else {
                iU = abstractC0078j.u();
            }
        } while (iU == this.f1532b);
        this.f1534d = iU;
    }

    public final void k(InterfaceC0091x interfaceC0091x) throws A {
        int iU;
        int i2 = this.f1532b & 7;
        AbstractC0078j abstractC0078j = this.f1531a;
        if (i2 == 1) {
            do {
                ((U) interfaceC0091x).add(Long.valueOf(abstractC0078j.k()));
                if (abstractC0078j.c()) {
                    return;
                } else {
                    iU = abstractC0078j.u();
                }
            } while (iU == this.f1532b);
            this.f1534d = iU;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int iV = abstractC0078j.v();
        if ((iV & 7) != 0) {
            throw new A("Failed to parse the message.");
        }
        int iB = abstractC0078j.b() + iV;
        do {
            ((U) interfaceC0091x).add(Long.valueOf(abstractC0078j.k()));
        } while (abstractC0078j.b() < iB);
    }

    public final void l(InterfaceC0091x interfaceC0091x) throws A {
        int iU;
        int i2 = this.f1532b & 7;
        AbstractC0078j abstractC0078j = this.f1531a;
        if (i2 == 2) {
            int iV = abstractC0078j.v();
            if ((iV & 3) != 0) {
                throw new A("Failed to parse the message.");
            }
            int iB = abstractC0078j.b() + iV;
            do {
                ((U) interfaceC0091x).add(Float.valueOf(abstractC0078j.l()));
            } while (abstractC0078j.b() < iB);
            return;
        }
        if (i2 != 5) {
            throw A.b();
        }
        do {
            ((U) interfaceC0091x).add(Float.valueOf(abstractC0078j.l()));
            if (abstractC0078j.c()) {
                return;
            } else {
                iU = abstractC0078j.u();
            }
        } while (iU == this.f1532b);
        this.f1534d = iU;
    }

    public final void m(InterfaceC0091x interfaceC0091x) throws A {
        int iU;
        int i2 = this.f1532b & 7;
        AbstractC0078j abstractC0078j = this.f1531a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0091x).add(Integer.valueOf(abstractC0078j.m()));
                if (abstractC0078j.c()) {
                    return;
                } else {
                    iU = abstractC0078j.u();
                }
            } while (iU == this.f1532b);
            this.f1534d = iU;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int iB = abstractC0078j.b() + abstractC0078j.v();
        do {
            ((U) interfaceC0091x).add(Integer.valueOf(abstractC0078j.m()));
        } while (abstractC0078j.b() < iB);
        v(iB);
    }

    public final void n(InterfaceC0091x interfaceC0091x) throws A {
        int iU;
        int i2 = this.f1532b & 7;
        AbstractC0078j abstractC0078j = this.f1531a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0091x).add(Long.valueOf(abstractC0078j.n()));
                if (abstractC0078j.c()) {
                    return;
                } else {
                    iU = abstractC0078j.u();
                }
            } while (iU == this.f1532b);
            this.f1534d = iU;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int iB = abstractC0078j.b() + abstractC0078j.v();
        do {
            ((U) interfaceC0091x).add(Long.valueOf(abstractC0078j.n()));
        } while (abstractC0078j.b() < iB);
        v(iB);
    }

    public final void o(InterfaceC0091x interfaceC0091x) throws A {
        int iU;
        int i2 = this.f1532b & 7;
        AbstractC0078j abstractC0078j = this.f1531a;
        if (i2 == 2) {
            int iV = abstractC0078j.v();
            if ((iV & 3) != 0) {
                throw new A("Failed to parse the message.");
            }
            int iB = abstractC0078j.b() + iV;
            do {
                ((U) interfaceC0091x).add(Integer.valueOf(abstractC0078j.o()));
            } while (abstractC0078j.b() < iB);
            return;
        }
        if (i2 != 5) {
            throw A.b();
        }
        do {
            ((U) interfaceC0091x).add(Integer.valueOf(abstractC0078j.o()));
            if (abstractC0078j.c()) {
                return;
            } else {
                iU = abstractC0078j.u();
            }
        } while (iU == this.f1532b);
        this.f1534d = iU;
    }

    public final void p(InterfaceC0091x interfaceC0091x) throws A {
        int iU;
        int i2 = this.f1532b & 7;
        AbstractC0078j abstractC0078j = this.f1531a;
        if (i2 == 1) {
            do {
                ((U) interfaceC0091x).add(Long.valueOf(abstractC0078j.p()));
                if (abstractC0078j.c()) {
                    return;
                } else {
                    iU = abstractC0078j.u();
                }
            } while (iU == this.f1532b);
            this.f1534d = iU;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int iV = abstractC0078j.v();
        if ((iV & 7) != 0) {
            throw new A("Failed to parse the message.");
        }
        int iB = abstractC0078j.b() + iV;
        do {
            ((U) interfaceC0091x).add(Long.valueOf(abstractC0078j.p()));
        } while (abstractC0078j.b() < iB);
    }

    public final void q(InterfaceC0091x interfaceC0091x) throws A {
        int iU;
        int i2 = this.f1532b & 7;
        AbstractC0078j abstractC0078j = this.f1531a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0091x).add(Integer.valueOf(abstractC0078j.q()));
                if (abstractC0078j.c()) {
                    return;
                } else {
                    iU = abstractC0078j.u();
                }
            } while (iU == this.f1532b);
            this.f1534d = iU;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int iB = abstractC0078j.b() + abstractC0078j.v();
        do {
            ((U) interfaceC0091x).add(Integer.valueOf(abstractC0078j.q()));
        } while (abstractC0078j.b() < iB);
        v(iB);
    }

    public final void r(InterfaceC0091x interfaceC0091x) throws A {
        int iU;
        int i2 = this.f1532b & 7;
        AbstractC0078j abstractC0078j = this.f1531a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0091x).add(Long.valueOf(abstractC0078j.r()));
                if (abstractC0078j.c()) {
                    return;
                } else {
                    iU = abstractC0078j.u();
                }
            } while (iU == this.f1532b);
            this.f1534d = iU;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int iB = abstractC0078j.b() + abstractC0078j.v();
        do {
            ((U) interfaceC0091x).add(Long.valueOf(abstractC0078j.r()));
        } while (abstractC0078j.b() < iB);
        v(iB);
    }

    public final void s(InterfaceC0091x interfaceC0091x, boolean z2) throws C0093z {
        String strS;
        int iU;
        if ((this.f1532b & 7) != 2) {
            throw A.b();
        }
        do {
            AbstractC0078j abstractC0078j = this.f1531a;
            if (z2) {
                w(2);
                strS = abstractC0078j.t();
            } else {
                w(2);
                strS = abstractC0078j.s();
            }
            ((U) interfaceC0091x).add(strS);
            if (abstractC0078j.c()) {
                return;
            } else {
                iU = abstractC0078j.u();
            }
        } while (iU == this.f1532b);
        this.f1534d = iU;
    }

    public final void t(InterfaceC0091x interfaceC0091x) throws A {
        int iU;
        int i2 = this.f1532b & 7;
        AbstractC0078j abstractC0078j = this.f1531a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0091x).add(Integer.valueOf(abstractC0078j.v()));
                if (abstractC0078j.c()) {
                    return;
                } else {
                    iU = abstractC0078j.u();
                }
            } while (iU == this.f1532b);
            this.f1534d = iU;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int iB = abstractC0078j.b() + abstractC0078j.v();
        do {
            ((U) interfaceC0091x).add(Integer.valueOf(abstractC0078j.v()));
        } while (abstractC0078j.b() < iB);
        v(iB);
    }

    public final void u(InterfaceC0091x interfaceC0091x) throws A {
        int iU;
        int i2 = this.f1532b & 7;
        AbstractC0078j abstractC0078j = this.f1531a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0091x).add(Long.valueOf(abstractC0078j.w()));
                if (abstractC0078j.c()) {
                    return;
                } else {
                    iU = abstractC0078j.u();
                }
            } while (iU == this.f1532b);
            this.f1534d = iU;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int iB = abstractC0078j.b() + abstractC0078j.v();
        do {
            ((U) interfaceC0091x).add(Long.valueOf(abstractC0078j.w()));
        } while (abstractC0078j.b() < iB);
        v(iB);
    }

    public final void v(int i2) throws A {
        if (this.f1531a.b() != i2) {
            throw A.e();
        }
    }

    public final void w(int i2) throws C0093z {
        if ((this.f1532b & 7) != i2) {
            throw A.b();
        }
    }

    public final boolean x() {
        int i2;
        AbstractC0078j abstractC0078j = this.f1531a;
        if (abstractC0078j.c() || (i2 = this.f1532b) == this.f1533c) {
            return false;
        }
        return abstractC0078j.x(i2);
    }
}
