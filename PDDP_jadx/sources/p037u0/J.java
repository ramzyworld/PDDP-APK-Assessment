package p037u0;

import B0.g;
import G.C0013n;
import I0.i;
import I0.p;
import J.d;
import J.h;
import N.C0026b;
import Q0.AbstractC0063v;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p023m0.a;
import p030q0.f;

/* JADX INFO: loaded from: classes.dex */
public final class J implements a, InterfaceC0135g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f3112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0026b f3113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final H.a f3114g = new H.a(25);

    public static final Object q(J j2, String str, String str2, g gVar) {
        j2.getClass();
        d dVar = new d(str);
        Context context = j2.f3112e;
        if (context != null) {
            Object objC = K.a(context).c(new h(new C0139k(dVar, str2, null), null), gVar);
            return objC == A0.a.f0e ? objC : p041x0.g.f3419a;
        }
        i.g("context");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c6 -> B:36:0x00c9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object s(p037u0.J r11, java.util.List r12, B0.b r13) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p037u0.J.s(u0.J, java.util.List, B0.b):java.lang.Object");
    }

    @Override // p023m0.a
    public final void a(C0013n c0013n) {
        i.e(c0013n, "binding");
        f fVar = (f) c0013n.f259b;
        i.d(fVar, "binding.binaryMessenger");
        InterfaceC0135g.f3135d.getClass();
        C0134f.b(fVar, null, "data_store");
        C0026b c0026b = this.f3113f;
        if (c0026b != null) {
            C0134f.b((f) c0026b.f477g, null, "shared_preferences");
        }
        this.f3113f = null;
    }

    @Override // p037u0.InterfaceC0135g
    public final Boolean b(String str, C0136h c0136h) throws Throwable {
        p pVar = new p();
        AbstractC0063v.j(new p(str, this, pVar, null));
        return (Boolean) pVar.f338e;
    }

    @Override // p037u0.InterfaceC0135g
    public final String c(String str, C0136h c0136h) throws Throwable {
        p pVar = new p();
        AbstractC0063v.j(new x(str, this, pVar, null));
        return (String) pVar.f338e;
    }

    @Override // p037u0.InterfaceC0135g
    public final void d(String str, boolean z2, C0136h c0136h) throws Throwable {
        AbstractC0063v.j(new B(str, this, z2, null));
    }

    @Override // p037u0.InterfaceC0135g
    public final void e(String str, double d2, C0136h c0136h) throws Throwable {
        AbstractC0063v.j(new E(str, this, d2, null));
    }

    @Override // p037u0.InterfaceC0135g
    public final void f(String str, String str2, C0136h c0136h) throws Throwable {
        AbstractC0063v.j(new F(this, str, str2, null));
    }

    @Override // p023m0.a
    public final void g(C0013n c0013n) {
        i.e(c0013n, "binding");
        f fVar = (f) c0013n.f259b;
        i.d(fVar, "binding.binaryMessenger");
        Context context = (Context) c0013n.f258a;
        i.d(context, "binding.applicationContext");
        this.f3112e = context;
        try {
            InterfaceC0135g.f3135d.getClass();
            C0134f.b(fVar, this, "data_store");
            this.f3113f = new C0026b(fVar, context, this.f3114g);
        } catch (Exception e2) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e2);
        }
        new C0129a().g(c0013n);
    }

    @Override // p037u0.InterfaceC0135g
    public final List h(List list, C0136h c0136h) {
        return p043y0.d.T(((Map) AbstractC0063v.j(new u(this, list, null))).keySet());
    }

    @Override // p037u0.InterfaceC0135g
    public final Long i(String str, C0136h c0136h) throws Throwable {
        p pVar = new p();
        AbstractC0063v.j(new t(str, this, pVar, null));
        return (Long) pVar.f338e;
    }

    @Override // p037u0.InterfaceC0135g
    public final void j(String str, String str2, C0136h c0136h) throws Throwable {
        AbstractC0063v.j(new I(this, str, str2, null));
    }

    @Override // p037u0.InterfaceC0135g
    public final N k(String str, C0136h c0136h) throws Throwable {
        String strC = c(str, c0136h);
        if (strC == null) {
            return null;
        }
        if (strC.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
            return new N(strC, L.f3118g);
        }
        return strC.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new N(null, L.f3117f) : new N(null, L.f3119h);
    }

    @Override // p037u0.InterfaceC0135g
    public final Double l(String str, C0136h c0136h) throws Throwable {
        p pVar = new p();
        AbstractC0063v.j(new r(str, this, pVar, null));
        return (Double) pVar.f338e;
    }

    @Override // p037u0.InterfaceC0135g
    public final void m(String str, List list, C0136h c0136h) throws Throwable {
        AbstractC0063v.j(new C(this, str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(this.f3114g.f(list)), null));
    }

    @Override // p037u0.InterfaceC0135g
    public final Map n(List list, C0136h c0136h) {
        return (Map) AbstractC0063v.j(new C0140l(this, list, null));
    }

    @Override // p037u0.InterfaceC0135g
    public final void o(String str, long j2, C0136h c0136h) throws Throwable {
        AbstractC0063v.j(new H(str, this, j2, null));
    }

    @Override // p037u0.InterfaceC0135g
    public final void p(List list, C0136h c0136h) throws Throwable {
        AbstractC0063v.j(new C0138j(this, list, null));
    }

    @Override // p037u0.InterfaceC0135g
    public final ArrayList r(String str, C0136h c0136h) throws Throwable {
        List list;
        String strC = c(str, c0136h);
        ArrayList arrayList = null;
        if (strC != null && !strC.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && strC.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && (list = (List) K.c(strC, this.f3114g)) != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }
}
