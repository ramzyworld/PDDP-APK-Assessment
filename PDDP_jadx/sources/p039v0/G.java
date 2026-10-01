package p039v0;

import G.M;
import H0.l;
import I0.h;
import I0.i;
import java.util.List;
import p000a.a;
import p030q0.c;
import p041x0.g;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class G implements c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ M f3248f;

    public /* synthetic */ G(M m2, int i2) {
        this.f3247e = i2;
        this.f3248f = m2;
    }

    @Override // p030q0.c
    public final void b(Object obj) {
        switch (this.f3247e) {
            case 0:
                boolean z2 = obj instanceof List;
                l lVar = (l) this.f3248f.f124g;
                if (!z2) {
                    lVar.j(new N(h.f("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt'.", "")));
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        lVar.j(new N((String) list.get(0)));
                    } else {
                        Object obj2 = list.get(0);
                        i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        lVar.j(new N(a.l(new C0143a((String) obj2, (String) obj3, (String) list.get(2)))));
                    }
                }
                break;
            case 1:
                boolean z3 = obj instanceof List;
                l lVar2 = (l) this.f3248f.f124g;
                if (!z3) {
                    lVar2.j(new N(h.f("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert'.", "")));
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        lVar2.j(new N(g.f3419a));
                    } else {
                        Object obj4 = list2.get(0);
                        i.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        lVar2.j(new N(a.l(new C0143a((String) obj4, (String) obj5, (String) list2.get(2)))));
                    }
                }
                break;
            case 2:
                boolean z4 = obj instanceof List;
                l lVar3 = (l) this.f3248f.f124g;
                if (!z4) {
                    lVar3.j(new N(h.f("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser'.", "")));
                } else {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        Object obj6 = list3.get(0);
                        i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        lVar3.j(new N(a.l(new C0143a((String) obj6, (String) obj7, (String) list3.get(2)))));
                    } else if (list3.get(0) != null) {
                        Object obj8 = list3.get(0);
                        i.c(obj8, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                        lVar3.j(new N((List) obj8));
                    } else {
                        lVar3.j(new N(h.f("null-error", "Flutter api returned null value for non-null return value.", "")));
                    }
                }
                break;
            default:
                boolean z5 = obj instanceof List;
                l lVar4 = (l) this.f3248f.f124g;
                if (!z5) {
                    lVar4.j(new N(h.f("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm'.", "")));
                } else {
                    List list4 = (List) obj;
                    if (list4.size() > 1) {
                        Object obj9 = list4.get(0);
                        i.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        Object obj10 = list4.get(1);
                        i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        lVar4.j(new N(a.l(new C0143a((String) obj9, (String) obj10, (String) list4.get(2)))));
                    } else if (list4.get(0) != null) {
                        Object obj11 = list4.get(0);
                        i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                        lVar4.j(new N((Boolean) obj11));
                    } else {
                        lVar4.j(new N(h.f("null-error", "Flutter api returned null value for non-null return value.", "")));
                    }
                }
                break;
        }
    }
}
