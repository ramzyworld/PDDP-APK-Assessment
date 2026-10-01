package p013h0;

import N.C0026b;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.o;
import java.util.ArrayList;
import java.util.List;
import p011g0.AbstractActivityC0098e;
import p015i0.a;
import p019k0.d;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2018a = new ArrayList();

    public h(AbstractActivityC0098e abstractActivityC0098e, String[] strArr) {
        d dVar = (d) C0026b.E().f477g;
        if (dVar.f2800a) {
            return;
        }
        dVar.b(abstractActivityC0098e.getApplicationContext());
        dVar.a(abstractActivityC0098e.getApplicationContext(), strArr);
    }

    public final c a(g gVar) {
        c cVar;
        AbstractActivityC0098e abstractActivityC0098e = gVar.f2012a;
        a aVar = gVar.f2013b;
        String str = gVar.f2014c;
        List<String> list = gVar.f2015d;
        o oVar = new o();
        boolean z2 = gVar.f2016e;
        boolean z3 = gVar.f2017f;
        if (aVar == null) {
            d dVar = (d) C0026b.E().f477g;
            if (!dVar.f2800a) {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
            aVar = new a((String) dVar.f2803d.f2160g, "main");
        }
        a aVar2 = aVar;
        ArrayList arrayList = this.f2018a;
        if (arrayList.size() == 0) {
            cVar = new c(abstractActivityC0098e, null, oVar, z2, z3);
            if (str != null) {
                cVar.f1986i.f2894a.F("setInitialRoute", str, null);
            }
            cVar.f1980c.a(aVar2, list);
        } else {
            FlutterJNI flutterJNI = ((c) arrayList.get(0)).f1978a;
            if (!flutterJNI.isAttached()) {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
            cVar = new c(abstractActivityC0098e, flutterJNI.spawn(aVar2.f2157c, aVar2.f2156b, str, list), oVar, z2, z3);
        }
        arrayList.add(cVar);
        cVar.f1996s.add(new f(this, cVar));
        return cVar;
    }
}
