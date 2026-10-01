package p039v0;

import H0.l;
import I.k;
import I0.h;
import I0.i;
import java.util.List;
import p000a.a;
import p030q0.c;
import p041x0.d;
import p041x0.g;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class L implements c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f3257f;

    public /* synthetic */ L(int i2, l lVar) {
        this.f3256e = i2;
        this.f3257f = lVar;
    }

    @Override // p030q0.c
    public final void b(Object obj) {
        p041x0.c cVarF;
        p041x0.c cVarF2;
        p041x0.c cVarF3;
        p041x0.c cVarF4;
        p041x0.c cVarF5;
        p041x0.c cVarF6;
        p041x0.c cVarF7;
        p041x0.c cVarF8;
        p041x0.c cVarF9;
        p041x0.c cVarF10;
        p041x0.c cVarF11;
        p041x0.c cVarF12;
        p041x0.c cVarF13;
        p041x0.c cVarF14;
        p041x0.c cVarF15;
        switch (this.f3256e) {
            case 0:
                l lVar = this.f3257f;
                if (obj instanceof List) {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        lVar.j(new d(g.f3419a));
                    } else {
                        Object obj2 = list.get(0);
                        i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        cVarF = a.l(new C0143a((String) obj2, (String) obj3, (String) list.get(2)));
                    }
                } else {
                    cVarF = h.f("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged'.", "");
                }
                h.j(cVarF, lVar);
                break;
            case 1:
                l lVar2 = this.f3257f;
                if (obj instanceof List) {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        lVar2.j(new d(g.f3419a));
                    } else {
                        Object obj4 = list2.get(0);
                        i.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        cVarF2 = a.l(new C0143a((String) obj4, (String) obj5, (String) list2.get(2)));
                    }
                } else {
                    cVarF2 = h.f("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.urlLoading'.", "");
                }
                h.j(cVarF2, lVar2);
                break;
            case 2:
                l lVar3 = this.f3257f;
                if (obj instanceof List) {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        lVar3.j(new d(g.f3419a));
                    } else {
                        Object obj6 = list3.get(0);
                        i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        cVarF3 = a.l(new C0143a((String) obj6, (String) obj7, (String) list3.get(2)));
                    }
                } else {
                    cVarF3 = h.f("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory'.", "");
                }
                h.j(cVarF3, lVar3);
                break;
            case 3:
                l lVar4 = this.f3257f;
                if (obj instanceof List) {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        lVar4.j(new d(g.f3419a));
                    } else {
                        Object obj8 = list4.get(0);
                        i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        i.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        cVarF4 = a.l(new C0143a((String) obj8, (String) obj9, (String) list4.get(2)));
                    }
                } else {
                    cVarF4 = h.f("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError'.", "");
                }
                h.j(cVarF4, lVar4);
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
                l lVar5 = this.f3257f;
                if (obj instanceof List) {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        lVar5.j(new d(g.f3419a));
                    } else {
                        Object obj10 = list5.get(0);
                        i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        i.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        cVarF5 = a.l(new C0143a((String) obj10, (String) obj11, (String) list5.get(2)));
                    }
                } else {
                    cVarF5 = h.f("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource'.", "");
                }
                h.j(cVarF5, lVar5);
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                l lVar6 = this.f3257f;
                if (obj instanceof List) {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        lVar6.j(new d(g.f3419a));
                    } else {
                        Object obj12 = list6.get(0);
                        i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list6.get(1);
                        i.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        cVarF6 = a.l(new C0143a((String) obj12, (String) obj13, (String) list6.get(2)));
                    }
                } else {
                    cVarF6 = h.f("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest'.", "");
                }
                h.j(cVarF6, lVar6);
                break;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                l lVar7 = this.f3257f;
                if (obj instanceof List) {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        lVar7.j(new d(g.f3419a));
                    } else {
                        Object obj14 = list7.get(0);
                        i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                        Object obj15 = list7.get(1);
                        i.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        cVarF7 = a.l(new C0143a((String) obj14, (String) obj15, (String) list7.get(2)));
                    }
                } else {
                    cVarF7 = h.f("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted'.", "");
                }
                h.j(cVarF7, lVar7);
                break;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                l lVar8 = this.f3257f;
                if (obj instanceof List) {
                    List list8 = (List) obj;
                    if (list8.size() <= 1) {
                        lVar8.j(new d(g.f3419a));
                    } else {
                        Object obj16 = list8.get(0);
                        i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        Object obj17 = list8.get(1);
                        i.c(obj17, "null cannot be cast to non-null type kotlin.String");
                        cVarF8 = a.l(new C0143a((String) obj16, (String) obj17, (String) list8.get(2)));
                    }
                } else {
                    cVarF8 = h.f("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest'.", "");
                }
                h.j(cVarF8, lVar8);
                break;
            case k.BYTES_FIELD_NUMBER /* 8 */:
                l lVar9 = this.f3257f;
                if (obj instanceof List) {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        lVar9.j(new d(g.f3419a));
                    } else {
                        Object obj18 = list9.get(0);
                        i.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        Object obj19 = list9.get(1);
                        i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                        cVarF9 = a.l(new C0143a((String) obj18, (String) obj19, (String) list9.get(2)));
                    }
                } else {
                    cVarF9 = h.f("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading'.", "");
                }
                h.j(cVarF9, lVar9);
                break;
            case 9:
                l lVar10 = this.f3257f;
                if (obj instanceof List) {
                    List list10 = (List) obj;
                    if (list10.size() <= 1) {
                        lVar10.j(new d(g.f3419a));
                    } else {
                        Object obj20 = list10.get(0);
                        i.c(obj20, "null cannot be cast to non-null type kotlin.String");
                        Object obj21 = list10.get(1);
                        i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                        cVarF10 = a.l(new C0143a((String) obj20, (String) obj21, (String) list10.get(2)));
                    }
                } else {
                    cVarF10 = h.f("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible'.", "");
                }
                h.j(cVarF10, lVar10);
                break;
            case 10:
                l lVar11 = this.f3257f;
                if (obj instanceof List) {
                    List list11 = (List) obj;
                    if (list11.size() <= 1) {
                        lVar11.j(new d(g.f3419a));
                    } else {
                        Object obj22 = list11.get(0);
                        i.c(obj22, "null cannot be cast to non-null type kotlin.String");
                        Object obj23 = list11.get(1);
                        i.c(obj23, "null cannot be cast to non-null type kotlin.String");
                        cVarF11 = a.l(new C0143a((String) obj22, (String) obj23, (String) list11.get(2)));
                    }
                } else {
                    cVarF11 = h.f("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished'.", "");
                }
                h.j(cVarF11, lVar11);
                break;
            case 11:
                l lVar12 = this.f3257f;
                if (obj instanceof List) {
                    List list12 = (List) obj;
                    if (list12.size() <= 1) {
                        lVar12.j(new d(g.f3419a));
                    } else {
                        Object obj24 = list12.get(0);
                        i.c(obj24, "null cannot be cast to non-null type kotlin.String");
                        Object obj25 = list12.get(1);
                        i.c(obj25, "null cannot be cast to non-null type kotlin.String");
                        cVarF12 = a.l(new C0143a((String) obj24, (String) obj25, (String) list12.get(2)));
                    }
                } else {
                    cVarF12 = h.f("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedError'.", "");
                }
                h.j(cVarF12, lVar12);
                break;
            case 12:
                l lVar13 = this.f3257f;
                if (obj instanceof List) {
                    List list13 = (List) obj;
                    if (list13.size() <= 1) {
                        lVar13.j(new d(g.f3419a));
                    } else {
                        Object obj26 = list13.get(0);
                        i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                        Object obj27 = list13.get(1);
                        i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                        cVarF13 = a.l(new C0143a((String) obj26, (String) obj27, (String) list13.get(2)));
                    }
                } else {
                    cVarF13 = h.f("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest'.", "");
                }
                h.j(cVarF13, lVar13);
                break;
            case 13:
                l lVar14 = this.f3257f;
                if (obj instanceof List) {
                    List list14 = (List) obj;
                    if (list14.size() <= 1) {
                        lVar14.j(new d(g.f3419a));
                    } else {
                        Object obj28 = list14.get(0);
                        i.c(obj28, "null cannot be cast to non-null type kotlin.String");
                        Object obj29 = list14.get(1);
                        i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                        cVarF14 = a.l(new C0143a((String) obj28, (String) obj29, (String) list14.get(2)));
                    }
                } else {
                    cVarF14 = h.f("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission'.", "");
                }
                h.j(cVarF14, lVar14);
                break;
            default:
                l lVar15 = this.f3257f;
                if (obj instanceof List) {
                    List list15 = (List) obj;
                    if (list15.size() <= 1) {
                        lVar15.j(new d(g.f3419a));
                    } else {
                        Object obj30 = list15.get(0);
                        i.c(obj30, "null cannot be cast to non-null type kotlin.String");
                        Object obj31 = list15.get(1);
                        i.c(obj31, "null cannot be cast to non-null type kotlin.String");
                        cVarF15 = a.l(new C0143a((String) obj30, (String) obj31, (String) list15.get(2)));
                    }
                } else {
                    cVarF15 = h.f("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError'.", "");
                }
                h.j(cVarF15, lVar15);
                break;
        }
    }
}
