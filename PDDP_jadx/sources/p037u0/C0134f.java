package p037u0;

import G.C0013n;
import H.a;
import I.k;
import I0.h;
import I0.i;
import N.Q;
import java.util.List;
import p030q0.b;
import p030q0.f;
import p030q0.j;
import p041x0.e;

/* JADX INFO: renamed from: u0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0134f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C0134f f3133a = new C0134f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f3134b = new e(C0133e.f3132f);

    public static j a() {
        return (j) f3134b.a();
    }

    public static void b(f fVar, final InterfaceC0135g interfaceC0135g, String str) {
        i.e(fVar, "binaryMessenger");
        String strConcat = str.length() > 0 ? ".".concat(str) : "";
        a aVarM = fVar.m();
        C0013n c0013n = new C0013n(fVar, h.e("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", strConcat), a(), aVarM);
        if (interfaceC0135g != null) {
            final int i2 = 0;
            c0013n.g(new b() { // from class: u0.d
                @Override // p030q0.b
                public final void o(Object obj, Q q2) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i2) {
                        case 0:
                            InterfaceC0135g interfaceC0135g2 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g2.d(str2, zBooleanValue, (C0136h) obj4);
                                listB = a1.a.t(null);
                            } catch (Throwable th) {
                                listB = a1.a.b(th);
                            }
                            q2.b(listB);
                            break;
                        case 1:
                            InterfaceC0135g interfaceC0135g3 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g3.m(str3, list3, (C0136h) obj7);
                                listB2 = a1.a.t(null);
                            } catch (Throwable th2) {
                                listB2 = a1.a.b(th2);
                            }
                            q2.b(listB2);
                            break;
                        case 2:
                            InterfaceC0135g interfaceC0135g4 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = a1.a.t(interfaceC0135g4.c(str4, (C0136h) obj9));
                            } catch (Throwable th3) {
                                listB3 = a1.a.b(th3);
                            }
                            q2.b(listB3);
                            break;
                        case 3:
                            InterfaceC0135g interfaceC0135g5 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = a1.a.t(interfaceC0135g5.b(str5, (C0136h) obj11));
                            } catch (Throwable th4) {
                                listB4 = a1.a.b(th4);
                            }
                            q2.b(listB4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0135g interfaceC0135g6 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = a1.a.t(interfaceC0135g6.l(str6, (C0136h) obj13));
                            } catch (Throwable th5) {
                                listB5 = a1.a.b(th5);
                            }
                            q2.b(listB5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0135g interfaceC0135g7 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = a1.a.t(interfaceC0135g7.i(str7, (C0136h) obj15));
                            } catch (Throwable th6) {
                                listB6 = a1.a.b(th6);
                            }
                            q2.b(listB6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0135g interfaceC0135g8 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB7 = a1.a.t(interfaceC0135g8.r(str8, (C0136h) obj17));
                            } catch (Throwable th7) {
                                listB7 = a1.a.b(th7);
                            }
                            q2.b(listB7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0135g interfaceC0135g9 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = a1.a.t(interfaceC0135g9.k(str9, (C0136h) obj19));
                            } catch (Throwable th8) {
                                listB8 = a1.a.b(th8);
                            }
                            q2.b(listB8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0135g interfaceC0135g10 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g10.p(list11, (C0136h) obj20);
                                listB9 = a1.a.t(null);
                            } catch (Throwable th9) {
                                listB9 = a1.a.b(th9);
                            }
                            q2.b(listB9);
                            break;
                        case 9:
                            InterfaceC0135g interfaceC0135g11 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            i.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB10 = a1.a.t(interfaceC0135g11.n(list13, (C0136h) obj21));
                            } catch (Throwable th10) {
                                listB10 = a1.a.b(th10);
                            }
                            q2.b(listB10);
                            break;
                        case 10:
                            InterfaceC0135g interfaceC0135g12 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = a1.a.t(interfaceC0135g12.h(list15, (C0136h) obj22));
                            } catch (Throwable th11) {
                                listB11 = a1.a.b(th11);
                            }
                            q2.b(listB11);
                            break;
                        case 11:
                            InterfaceC0135g interfaceC0135g13 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            i.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g13.j(str10, str11, (C0136h) obj25);
                                listB12 = a1.a.t(null);
                            } catch (Throwable th12) {
                                listB12 = a1.a.b(th12);
                            }
                            q2.b(listB12);
                            break;
                        case 12:
                            InterfaceC0135g interfaceC0135g14 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g14.o(str12, jLongValue, (C0136h) obj28);
                                listB13 = a1.a.t(null);
                            } catch (Throwable th13) {
                                listB13 = a1.a.b(th13);
                            }
                            q2.b(listB13);
                            break;
                        case 13:
                            InterfaceC0135g interfaceC0135g15 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g15.e(str13, dDoubleValue, (C0136h) obj31);
                                listB14 = a1.a.t(null);
                            } catch (Throwable th14) {
                                listB14 = a1.a.b(th14);
                            }
                            q2.b(listB14);
                            break;
                        default:
                            InterfaceC0135g interfaceC0135g16 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            i.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g16.f(str14, str15, (C0136h) obj34);
                                listB15 = a1.a.t(null);
                            } catch (Throwable th15) {
                                listB15 = a1.a.b(th15);
                            }
                            q2.b(listB15);
                            break;
                    }
                }
            });
        } else {
            c0013n.g(null);
        }
        C0013n c0013n2 = new C0013n(fVar, h.e("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", strConcat), a(), aVarM);
        if (interfaceC0135g != null) {
            final int i3 = 11;
            c0013n2.g(new b() { // from class: u0.d
                @Override // p030q0.b
                public final void o(Object obj, Q q2) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i3) {
                        case 0:
                            InterfaceC0135g interfaceC0135g2 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g2.d(str2, zBooleanValue, (C0136h) obj4);
                                listB = a1.a.t(null);
                            } catch (Throwable th) {
                                listB = a1.a.b(th);
                            }
                            q2.b(listB);
                            break;
                        case 1:
                            InterfaceC0135g interfaceC0135g3 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g3.m(str3, list3, (C0136h) obj7);
                                listB2 = a1.a.t(null);
                            } catch (Throwable th2) {
                                listB2 = a1.a.b(th2);
                            }
                            q2.b(listB2);
                            break;
                        case 2:
                            InterfaceC0135g interfaceC0135g4 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = a1.a.t(interfaceC0135g4.c(str4, (C0136h) obj9));
                            } catch (Throwable th3) {
                                listB3 = a1.a.b(th3);
                            }
                            q2.b(listB3);
                            break;
                        case 3:
                            InterfaceC0135g interfaceC0135g5 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = a1.a.t(interfaceC0135g5.b(str5, (C0136h) obj11));
                            } catch (Throwable th4) {
                                listB4 = a1.a.b(th4);
                            }
                            q2.b(listB4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0135g interfaceC0135g6 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = a1.a.t(interfaceC0135g6.l(str6, (C0136h) obj13));
                            } catch (Throwable th5) {
                                listB5 = a1.a.b(th5);
                            }
                            q2.b(listB5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0135g interfaceC0135g7 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = a1.a.t(interfaceC0135g7.i(str7, (C0136h) obj15));
                            } catch (Throwable th6) {
                                listB6 = a1.a.b(th6);
                            }
                            q2.b(listB6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0135g interfaceC0135g8 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB7 = a1.a.t(interfaceC0135g8.r(str8, (C0136h) obj17));
                            } catch (Throwable th7) {
                                listB7 = a1.a.b(th7);
                            }
                            q2.b(listB7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0135g interfaceC0135g9 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = a1.a.t(interfaceC0135g9.k(str9, (C0136h) obj19));
                            } catch (Throwable th8) {
                                listB8 = a1.a.b(th8);
                            }
                            q2.b(listB8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0135g interfaceC0135g10 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g10.p(list11, (C0136h) obj20);
                                listB9 = a1.a.t(null);
                            } catch (Throwable th9) {
                                listB9 = a1.a.b(th9);
                            }
                            q2.b(listB9);
                            break;
                        case 9:
                            InterfaceC0135g interfaceC0135g11 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            i.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB10 = a1.a.t(interfaceC0135g11.n(list13, (C0136h) obj21));
                            } catch (Throwable th10) {
                                listB10 = a1.a.b(th10);
                            }
                            q2.b(listB10);
                            break;
                        case 10:
                            InterfaceC0135g interfaceC0135g12 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = a1.a.t(interfaceC0135g12.h(list15, (C0136h) obj22));
                            } catch (Throwable th11) {
                                listB11 = a1.a.b(th11);
                            }
                            q2.b(listB11);
                            break;
                        case 11:
                            InterfaceC0135g interfaceC0135g13 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            i.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g13.j(str10, str11, (C0136h) obj25);
                                listB12 = a1.a.t(null);
                            } catch (Throwable th12) {
                                listB12 = a1.a.b(th12);
                            }
                            q2.b(listB12);
                            break;
                        case 12:
                            InterfaceC0135g interfaceC0135g14 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g14.o(str12, jLongValue, (C0136h) obj28);
                                listB13 = a1.a.t(null);
                            } catch (Throwable th13) {
                                listB13 = a1.a.b(th13);
                            }
                            q2.b(listB13);
                            break;
                        case 13:
                            InterfaceC0135g interfaceC0135g15 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g15.e(str13, dDoubleValue, (C0136h) obj31);
                                listB14 = a1.a.t(null);
                            } catch (Throwable th14) {
                                listB14 = a1.a.b(th14);
                            }
                            q2.b(listB14);
                            break;
                        default:
                            InterfaceC0135g interfaceC0135g16 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            i.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g16.f(str14, str15, (C0136h) obj34);
                                listB15 = a1.a.t(null);
                            } catch (Throwable th15) {
                                listB15 = a1.a.b(th15);
                            }
                            q2.b(listB15);
                            break;
                    }
                }
            });
        } else {
            c0013n2.g(null);
        }
        C0013n c0013n3 = new C0013n(fVar, h.e("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", strConcat), a(), aVarM);
        if (interfaceC0135g != null) {
            final int i4 = 12;
            c0013n3.g(new b() { // from class: u0.d
                @Override // p030q0.b
                public final void o(Object obj, Q q2) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i4) {
                        case 0:
                            InterfaceC0135g interfaceC0135g2 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g2.d(str2, zBooleanValue, (C0136h) obj4);
                                listB = a1.a.t(null);
                            } catch (Throwable th) {
                                listB = a1.a.b(th);
                            }
                            q2.b(listB);
                            break;
                        case 1:
                            InterfaceC0135g interfaceC0135g3 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g3.m(str3, list3, (C0136h) obj7);
                                listB2 = a1.a.t(null);
                            } catch (Throwable th2) {
                                listB2 = a1.a.b(th2);
                            }
                            q2.b(listB2);
                            break;
                        case 2:
                            InterfaceC0135g interfaceC0135g4 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = a1.a.t(interfaceC0135g4.c(str4, (C0136h) obj9));
                            } catch (Throwable th3) {
                                listB3 = a1.a.b(th3);
                            }
                            q2.b(listB3);
                            break;
                        case 3:
                            InterfaceC0135g interfaceC0135g5 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = a1.a.t(interfaceC0135g5.b(str5, (C0136h) obj11));
                            } catch (Throwable th4) {
                                listB4 = a1.a.b(th4);
                            }
                            q2.b(listB4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0135g interfaceC0135g6 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = a1.a.t(interfaceC0135g6.l(str6, (C0136h) obj13));
                            } catch (Throwable th5) {
                                listB5 = a1.a.b(th5);
                            }
                            q2.b(listB5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0135g interfaceC0135g7 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = a1.a.t(interfaceC0135g7.i(str7, (C0136h) obj15));
                            } catch (Throwable th6) {
                                listB6 = a1.a.b(th6);
                            }
                            q2.b(listB6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0135g interfaceC0135g8 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB7 = a1.a.t(interfaceC0135g8.r(str8, (C0136h) obj17));
                            } catch (Throwable th7) {
                                listB7 = a1.a.b(th7);
                            }
                            q2.b(listB7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0135g interfaceC0135g9 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = a1.a.t(interfaceC0135g9.k(str9, (C0136h) obj19));
                            } catch (Throwable th8) {
                                listB8 = a1.a.b(th8);
                            }
                            q2.b(listB8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0135g interfaceC0135g10 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g10.p(list11, (C0136h) obj20);
                                listB9 = a1.a.t(null);
                            } catch (Throwable th9) {
                                listB9 = a1.a.b(th9);
                            }
                            q2.b(listB9);
                            break;
                        case 9:
                            InterfaceC0135g interfaceC0135g11 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            i.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB10 = a1.a.t(interfaceC0135g11.n(list13, (C0136h) obj21));
                            } catch (Throwable th10) {
                                listB10 = a1.a.b(th10);
                            }
                            q2.b(listB10);
                            break;
                        case 10:
                            InterfaceC0135g interfaceC0135g12 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = a1.a.t(interfaceC0135g12.h(list15, (C0136h) obj22));
                            } catch (Throwable th11) {
                                listB11 = a1.a.b(th11);
                            }
                            q2.b(listB11);
                            break;
                        case 11:
                            InterfaceC0135g interfaceC0135g13 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            i.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g13.j(str10, str11, (C0136h) obj25);
                                listB12 = a1.a.t(null);
                            } catch (Throwable th12) {
                                listB12 = a1.a.b(th12);
                            }
                            q2.b(listB12);
                            break;
                        case 12:
                            InterfaceC0135g interfaceC0135g14 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g14.o(str12, jLongValue, (C0136h) obj28);
                                listB13 = a1.a.t(null);
                            } catch (Throwable th13) {
                                listB13 = a1.a.b(th13);
                            }
                            q2.b(listB13);
                            break;
                        case 13:
                            InterfaceC0135g interfaceC0135g15 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g15.e(str13, dDoubleValue, (C0136h) obj31);
                                listB14 = a1.a.t(null);
                            } catch (Throwable th14) {
                                listB14 = a1.a.b(th14);
                            }
                            q2.b(listB14);
                            break;
                        default:
                            InterfaceC0135g interfaceC0135g16 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            i.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g16.f(str14, str15, (C0136h) obj34);
                                listB15 = a1.a.t(null);
                            } catch (Throwable th15) {
                                listB15 = a1.a.b(th15);
                            }
                            q2.b(listB15);
                            break;
                    }
                }
            });
        } else {
            c0013n3.g(null);
        }
        C0013n c0013n4 = new C0013n(fVar, h.e("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", strConcat), a(), aVarM);
        if (interfaceC0135g != null) {
            final int i5 = 13;
            c0013n4.g(new b() { // from class: u0.d
                @Override // p030q0.b
                public final void o(Object obj, Q q2) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i5) {
                        case 0:
                            InterfaceC0135g interfaceC0135g2 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g2.d(str2, zBooleanValue, (C0136h) obj4);
                                listB = a1.a.t(null);
                            } catch (Throwable th) {
                                listB = a1.a.b(th);
                            }
                            q2.b(listB);
                            break;
                        case 1:
                            InterfaceC0135g interfaceC0135g3 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g3.m(str3, list3, (C0136h) obj7);
                                listB2 = a1.a.t(null);
                            } catch (Throwable th2) {
                                listB2 = a1.a.b(th2);
                            }
                            q2.b(listB2);
                            break;
                        case 2:
                            InterfaceC0135g interfaceC0135g4 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = a1.a.t(interfaceC0135g4.c(str4, (C0136h) obj9));
                            } catch (Throwable th3) {
                                listB3 = a1.a.b(th3);
                            }
                            q2.b(listB3);
                            break;
                        case 3:
                            InterfaceC0135g interfaceC0135g5 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = a1.a.t(interfaceC0135g5.b(str5, (C0136h) obj11));
                            } catch (Throwable th4) {
                                listB4 = a1.a.b(th4);
                            }
                            q2.b(listB4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0135g interfaceC0135g6 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = a1.a.t(interfaceC0135g6.l(str6, (C0136h) obj13));
                            } catch (Throwable th5) {
                                listB5 = a1.a.b(th5);
                            }
                            q2.b(listB5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0135g interfaceC0135g7 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = a1.a.t(interfaceC0135g7.i(str7, (C0136h) obj15));
                            } catch (Throwable th6) {
                                listB6 = a1.a.b(th6);
                            }
                            q2.b(listB6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0135g interfaceC0135g8 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB7 = a1.a.t(interfaceC0135g8.r(str8, (C0136h) obj17));
                            } catch (Throwable th7) {
                                listB7 = a1.a.b(th7);
                            }
                            q2.b(listB7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0135g interfaceC0135g9 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = a1.a.t(interfaceC0135g9.k(str9, (C0136h) obj19));
                            } catch (Throwable th8) {
                                listB8 = a1.a.b(th8);
                            }
                            q2.b(listB8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0135g interfaceC0135g10 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g10.p(list11, (C0136h) obj20);
                                listB9 = a1.a.t(null);
                            } catch (Throwable th9) {
                                listB9 = a1.a.b(th9);
                            }
                            q2.b(listB9);
                            break;
                        case 9:
                            InterfaceC0135g interfaceC0135g11 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            i.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB10 = a1.a.t(interfaceC0135g11.n(list13, (C0136h) obj21));
                            } catch (Throwable th10) {
                                listB10 = a1.a.b(th10);
                            }
                            q2.b(listB10);
                            break;
                        case 10:
                            InterfaceC0135g interfaceC0135g12 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = a1.a.t(interfaceC0135g12.h(list15, (C0136h) obj22));
                            } catch (Throwable th11) {
                                listB11 = a1.a.b(th11);
                            }
                            q2.b(listB11);
                            break;
                        case 11:
                            InterfaceC0135g interfaceC0135g13 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            i.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g13.j(str10, str11, (C0136h) obj25);
                                listB12 = a1.a.t(null);
                            } catch (Throwable th12) {
                                listB12 = a1.a.b(th12);
                            }
                            q2.b(listB12);
                            break;
                        case 12:
                            InterfaceC0135g interfaceC0135g14 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g14.o(str12, jLongValue, (C0136h) obj28);
                                listB13 = a1.a.t(null);
                            } catch (Throwable th13) {
                                listB13 = a1.a.b(th13);
                            }
                            q2.b(listB13);
                            break;
                        case 13:
                            InterfaceC0135g interfaceC0135g15 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g15.e(str13, dDoubleValue, (C0136h) obj31);
                                listB14 = a1.a.t(null);
                            } catch (Throwable th14) {
                                listB14 = a1.a.b(th14);
                            }
                            q2.b(listB14);
                            break;
                        default:
                            InterfaceC0135g interfaceC0135g16 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            i.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g16.f(str14, str15, (C0136h) obj34);
                                listB15 = a1.a.t(null);
                            } catch (Throwable th15) {
                                listB15 = a1.a.b(th15);
                            }
                            q2.b(listB15);
                            break;
                    }
                }
            });
        } else {
            c0013n4.g(null);
        }
        C0013n c0013n5 = new C0013n(fVar, h.e("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList", strConcat), a(), aVarM);
        if (interfaceC0135g != null) {
            final int i6 = 14;
            c0013n5.g(new b() { // from class: u0.d
                @Override // p030q0.b
                public final void o(Object obj, Q q2) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i6) {
                        case 0:
                            InterfaceC0135g interfaceC0135g2 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g2.d(str2, zBooleanValue, (C0136h) obj4);
                                listB = a1.a.t(null);
                            } catch (Throwable th) {
                                listB = a1.a.b(th);
                            }
                            q2.b(listB);
                            break;
                        case 1:
                            InterfaceC0135g interfaceC0135g3 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g3.m(str3, list3, (C0136h) obj7);
                                listB2 = a1.a.t(null);
                            } catch (Throwable th2) {
                                listB2 = a1.a.b(th2);
                            }
                            q2.b(listB2);
                            break;
                        case 2:
                            InterfaceC0135g interfaceC0135g4 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = a1.a.t(interfaceC0135g4.c(str4, (C0136h) obj9));
                            } catch (Throwable th3) {
                                listB3 = a1.a.b(th3);
                            }
                            q2.b(listB3);
                            break;
                        case 3:
                            InterfaceC0135g interfaceC0135g5 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = a1.a.t(interfaceC0135g5.b(str5, (C0136h) obj11));
                            } catch (Throwable th4) {
                                listB4 = a1.a.b(th4);
                            }
                            q2.b(listB4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0135g interfaceC0135g6 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = a1.a.t(interfaceC0135g6.l(str6, (C0136h) obj13));
                            } catch (Throwable th5) {
                                listB5 = a1.a.b(th5);
                            }
                            q2.b(listB5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0135g interfaceC0135g7 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = a1.a.t(interfaceC0135g7.i(str7, (C0136h) obj15));
                            } catch (Throwable th6) {
                                listB6 = a1.a.b(th6);
                            }
                            q2.b(listB6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0135g interfaceC0135g8 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB7 = a1.a.t(interfaceC0135g8.r(str8, (C0136h) obj17));
                            } catch (Throwable th7) {
                                listB7 = a1.a.b(th7);
                            }
                            q2.b(listB7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0135g interfaceC0135g9 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = a1.a.t(interfaceC0135g9.k(str9, (C0136h) obj19));
                            } catch (Throwable th8) {
                                listB8 = a1.a.b(th8);
                            }
                            q2.b(listB8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0135g interfaceC0135g10 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g10.p(list11, (C0136h) obj20);
                                listB9 = a1.a.t(null);
                            } catch (Throwable th9) {
                                listB9 = a1.a.b(th9);
                            }
                            q2.b(listB9);
                            break;
                        case 9:
                            InterfaceC0135g interfaceC0135g11 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            i.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB10 = a1.a.t(interfaceC0135g11.n(list13, (C0136h) obj21));
                            } catch (Throwable th10) {
                                listB10 = a1.a.b(th10);
                            }
                            q2.b(listB10);
                            break;
                        case 10:
                            InterfaceC0135g interfaceC0135g12 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = a1.a.t(interfaceC0135g12.h(list15, (C0136h) obj22));
                            } catch (Throwable th11) {
                                listB11 = a1.a.b(th11);
                            }
                            q2.b(listB11);
                            break;
                        case 11:
                            InterfaceC0135g interfaceC0135g13 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            i.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g13.j(str10, str11, (C0136h) obj25);
                                listB12 = a1.a.t(null);
                            } catch (Throwable th12) {
                                listB12 = a1.a.b(th12);
                            }
                            q2.b(listB12);
                            break;
                        case 12:
                            InterfaceC0135g interfaceC0135g14 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g14.o(str12, jLongValue, (C0136h) obj28);
                                listB13 = a1.a.t(null);
                            } catch (Throwable th13) {
                                listB13 = a1.a.b(th13);
                            }
                            q2.b(listB13);
                            break;
                        case 13:
                            InterfaceC0135g interfaceC0135g15 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g15.e(str13, dDoubleValue, (C0136h) obj31);
                                listB14 = a1.a.t(null);
                            } catch (Throwable th14) {
                                listB14 = a1.a.b(th14);
                            }
                            q2.b(listB14);
                            break;
                        default:
                            InterfaceC0135g interfaceC0135g16 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            i.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g16.f(str14, str15, (C0136h) obj34);
                                listB15 = a1.a.t(null);
                            } catch (Throwable th15) {
                                listB15 = a1.a.b(th15);
                            }
                            q2.b(listB15);
                            break;
                    }
                }
            });
        } else {
            c0013n5.g(null);
        }
        C0013n c0013n6 = new C0013n(fVar, h.e("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList", strConcat), a(), aVarM);
        if (interfaceC0135g != null) {
            final int i7 = 1;
            c0013n6.g(new b() { // from class: u0.d
                @Override // p030q0.b
                public final void o(Object obj, Q q2) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i7) {
                        case 0:
                            InterfaceC0135g interfaceC0135g2 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g2.d(str2, zBooleanValue, (C0136h) obj4);
                                listB = a1.a.t(null);
                            } catch (Throwable th) {
                                listB = a1.a.b(th);
                            }
                            q2.b(listB);
                            break;
                        case 1:
                            InterfaceC0135g interfaceC0135g3 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g3.m(str3, list3, (C0136h) obj7);
                                listB2 = a1.a.t(null);
                            } catch (Throwable th2) {
                                listB2 = a1.a.b(th2);
                            }
                            q2.b(listB2);
                            break;
                        case 2:
                            InterfaceC0135g interfaceC0135g4 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = a1.a.t(interfaceC0135g4.c(str4, (C0136h) obj9));
                            } catch (Throwable th3) {
                                listB3 = a1.a.b(th3);
                            }
                            q2.b(listB3);
                            break;
                        case 3:
                            InterfaceC0135g interfaceC0135g5 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = a1.a.t(interfaceC0135g5.b(str5, (C0136h) obj11));
                            } catch (Throwable th4) {
                                listB4 = a1.a.b(th4);
                            }
                            q2.b(listB4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0135g interfaceC0135g6 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = a1.a.t(interfaceC0135g6.l(str6, (C0136h) obj13));
                            } catch (Throwable th5) {
                                listB5 = a1.a.b(th5);
                            }
                            q2.b(listB5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0135g interfaceC0135g7 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = a1.a.t(interfaceC0135g7.i(str7, (C0136h) obj15));
                            } catch (Throwable th6) {
                                listB6 = a1.a.b(th6);
                            }
                            q2.b(listB6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0135g interfaceC0135g8 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB7 = a1.a.t(interfaceC0135g8.r(str8, (C0136h) obj17));
                            } catch (Throwable th7) {
                                listB7 = a1.a.b(th7);
                            }
                            q2.b(listB7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0135g interfaceC0135g9 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = a1.a.t(interfaceC0135g9.k(str9, (C0136h) obj19));
                            } catch (Throwable th8) {
                                listB8 = a1.a.b(th8);
                            }
                            q2.b(listB8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0135g interfaceC0135g10 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g10.p(list11, (C0136h) obj20);
                                listB9 = a1.a.t(null);
                            } catch (Throwable th9) {
                                listB9 = a1.a.b(th9);
                            }
                            q2.b(listB9);
                            break;
                        case 9:
                            InterfaceC0135g interfaceC0135g11 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            i.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB10 = a1.a.t(interfaceC0135g11.n(list13, (C0136h) obj21));
                            } catch (Throwable th10) {
                                listB10 = a1.a.b(th10);
                            }
                            q2.b(listB10);
                            break;
                        case 10:
                            InterfaceC0135g interfaceC0135g12 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = a1.a.t(interfaceC0135g12.h(list15, (C0136h) obj22));
                            } catch (Throwable th11) {
                                listB11 = a1.a.b(th11);
                            }
                            q2.b(listB11);
                            break;
                        case 11:
                            InterfaceC0135g interfaceC0135g13 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            i.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g13.j(str10, str11, (C0136h) obj25);
                                listB12 = a1.a.t(null);
                            } catch (Throwable th12) {
                                listB12 = a1.a.b(th12);
                            }
                            q2.b(listB12);
                            break;
                        case 12:
                            InterfaceC0135g interfaceC0135g14 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g14.o(str12, jLongValue, (C0136h) obj28);
                                listB13 = a1.a.t(null);
                            } catch (Throwable th13) {
                                listB13 = a1.a.b(th13);
                            }
                            q2.b(listB13);
                            break;
                        case 13:
                            InterfaceC0135g interfaceC0135g15 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g15.e(str13, dDoubleValue, (C0136h) obj31);
                                listB14 = a1.a.t(null);
                            } catch (Throwable th14) {
                                listB14 = a1.a.b(th14);
                            }
                            q2.b(listB14);
                            break;
                        default:
                            InterfaceC0135g interfaceC0135g16 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            i.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g16.f(str14, str15, (C0136h) obj34);
                                listB15 = a1.a.t(null);
                            } catch (Throwable th15) {
                                listB15 = a1.a.b(th15);
                            }
                            q2.b(listB15);
                            break;
                    }
                }
            });
        } else {
            c0013n6.g(null);
        }
        C0013n c0013n7 = new C0013n(fVar, h.e("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", strConcat), a(), aVarM);
        if (interfaceC0135g != null) {
            final int i8 = 2;
            c0013n7.g(new b() { // from class: u0.d
                @Override // p030q0.b
                public final void o(Object obj, Q q2) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i8) {
                        case 0:
                            InterfaceC0135g interfaceC0135g2 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g2.d(str2, zBooleanValue, (C0136h) obj4);
                                listB = a1.a.t(null);
                            } catch (Throwable th) {
                                listB = a1.a.b(th);
                            }
                            q2.b(listB);
                            break;
                        case 1:
                            InterfaceC0135g interfaceC0135g3 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g3.m(str3, list3, (C0136h) obj7);
                                listB2 = a1.a.t(null);
                            } catch (Throwable th2) {
                                listB2 = a1.a.b(th2);
                            }
                            q2.b(listB2);
                            break;
                        case 2:
                            InterfaceC0135g interfaceC0135g4 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = a1.a.t(interfaceC0135g4.c(str4, (C0136h) obj9));
                            } catch (Throwable th3) {
                                listB3 = a1.a.b(th3);
                            }
                            q2.b(listB3);
                            break;
                        case 3:
                            InterfaceC0135g interfaceC0135g5 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = a1.a.t(interfaceC0135g5.b(str5, (C0136h) obj11));
                            } catch (Throwable th4) {
                                listB4 = a1.a.b(th4);
                            }
                            q2.b(listB4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0135g interfaceC0135g6 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = a1.a.t(interfaceC0135g6.l(str6, (C0136h) obj13));
                            } catch (Throwable th5) {
                                listB5 = a1.a.b(th5);
                            }
                            q2.b(listB5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0135g interfaceC0135g7 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = a1.a.t(interfaceC0135g7.i(str7, (C0136h) obj15));
                            } catch (Throwable th6) {
                                listB6 = a1.a.b(th6);
                            }
                            q2.b(listB6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0135g interfaceC0135g8 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB7 = a1.a.t(interfaceC0135g8.r(str8, (C0136h) obj17));
                            } catch (Throwable th7) {
                                listB7 = a1.a.b(th7);
                            }
                            q2.b(listB7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0135g interfaceC0135g9 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = a1.a.t(interfaceC0135g9.k(str9, (C0136h) obj19));
                            } catch (Throwable th8) {
                                listB8 = a1.a.b(th8);
                            }
                            q2.b(listB8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0135g interfaceC0135g10 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g10.p(list11, (C0136h) obj20);
                                listB9 = a1.a.t(null);
                            } catch (Throwable th9) {
                                listB9 = a1.a.b(th9);
                            }
                            q2.b(listB9);
                            break;
                        case 9:
                            InterfaceC0135g interfaceC0135g11 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            i.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB10 = a1.a.t(interfaceC0135g11.n(list13, (C0136h) obj21));
                            } catch (Throwable th10) {
                                listB10 = a1.a.b(th10);
                            }
                            q2.b(listB10);
                            break;
                        case 10:
                            InterfaceC0135g interfaceC0135g12 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = a1.a.t(interfaceC0135g12.h(list15, (C0136h) obj22));
                            } catch (Throwable th11) {
                                listB11 = a1.a.b(th11);
                            }
                            q2.b(listB11);
                            break;
                        case 11:
                            InterfaceC0135g interfaceC0135g13 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            i.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g13.j(str10, str11, (C0136h) obj25);
                                listB12 = a1.a.t(null);
                            } catch (Throwable th12) {
                                listB12 = a1.a.b(th12);
                            }
                            q2.b(listB12);
                            break;
                        case 12:
                            InterfaceC0135g interfaceC0135g14 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g14.o(str12, jLongValue, (C0136h) obj28);
                                listB13 = a1.a.t(null);
                            } catch (Throwable th13) {
                                listB13 = a1.a.b(th13);
                            }
                            q2.b(listB13);
                            break;
                        case 13:
                            InterfaceC0135g interfaceC0135g15 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g15.e(str13, dDoubleValue, (C0136h) obj31);
                                listB14 = a1.a.t(null);
                            } catch (Throwable th14) {
                                listB14 = a1.a.b(th14);
                            }
                            q2.b(listB14);
                            break;
                        default:
                            InterfaceC0135g interfaceC0135g16 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            i.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g16.f(str14, str15, (C0136h) obj34);
                                listB15 = a1.a.t(null);
                            } catch (Throwable th15) {
                                listB15 = a1.a.b(th15);
                            }
                            q2.b(listB15);
                            break;
                    }
                }
            });
        } else {
            c0013n7.g(null);
        }
        C0013n c0013n8 = new C0013n(fVar, h.e("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", strConcat), a(), aVarM);
        if (interfaceC0135g != null) {
            final int i9 = 3;
            c0013n8.g(new b() { // from class: u0.d
                @Override // p030q0.b
                public final void o(Object obj, Q q2) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i9) {
                        case 0:
                            InterfaceC0135g interfaceC0135g2 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g2.d(str2, zBooleanValue, (C0136h) obj4);
                                listB = a1.a.t(null);
                            } catch (Throwable th) {
                                listB = a1.a.b(th);
                            }
                            q2.b(listB);
                            break;
                        case 1:
                            InterfaceC0135g interfaceC0135g3 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g3.m(str3, list3, (C0136h) obj7);
                                listB2 = a1.a.t(null);
                            } catch (Throwable th2) {
                                listB2 = a1.a.b(th2);
                            }
                            q2.b(listB2);
                            break;
                        case 2:
                            InterfaceC0135g interfaceC0135g4 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = a1.a.t(interfaceC0135g4.c(str4, (C0136h) obj9));
                            } catch (Throwable th3) {
                                listB3 = a1.a.b(th3);
                            }
                            q2.b(listB3);
                            break;
                        case 3:
                            InterfaceC0135g interfaceC0135g5 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = a1.a.t(interfaceC0135g5.b(str5, (C0136h) obj11));
                            } catch (Throwable th4) {
                                listB4 = a1.a.b(th4);
                            }
                            q2.b(listB4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0135g interfaceC0135g6 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = a1.a.t(interfaceC0135g6.l(str6, (C0136h) obj13));
                            } catch (Throwable th5) {
                                listB5 = a1.a.b(th5);
                            }
                            q2.b(listB5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0135g interfaceC0135g7 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = a1.a.t(interfaceC0135g7.i(str7, (C0136h) obj15));
                            } catch (Throwable th6) {
                                listB6 = a1.a.b(th6);
                            }
                            q2.b(listB6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0135g interfaceC0135g8 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB7 = a1.a.t(interfaceC0135g8.r(str8, (C0136h) obj17));
                            } catch (Throwable th7) {
                                listB7 = a1.a.b(th7);
                            }
                            q2.b(listB7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0135g interfaceC0135g9 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = a1.a.t(interfaceC0135g9.k(str9, (C0136h) obj19));
                            } catch (Throwable th8) {
                                listB8 = a1.a.b(th8);
                            }
                            q2.b(listB8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0135g interfaceC0135g10 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g10.p(list11, (C0136h) obj20);
                                listB9 = a1.a.t(null);
                            } catch (Throwable th9) {
                                listB9 = a1.a.b(th9);
                            }
                            q2.b(listB9);
                            break;
                        case 9:
                            InterfaceC0135g interfaceC0135g11 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            i.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB10 = a1.a.t(interfaceC0135g11.n(list13, (C0136h) obj21));
                            } catch (Throwable th10) {
                                listB10 = a1.a.b(th10);
                            }
                            q2.b(listB10);
                            break;
                        case 10:
                            InterfaceC0135g interfaceC0135g12 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = a1.a.t(interfaceC0135g12.h(list15, (C0136h) obj22));
                            } catch (Throwable th11) {
                                listB11 = a1.a.b(th11);
                            }
                            q2.b(listB11);
                            break;
                        case 11:
                            InterfaceC0135g interfaceC0135g13 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            i.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g13.j(str10, str11, (C0136h) obj25);
                                listB12 = a1.a.t(null);
                            } catch (Throwable th12) {
                                listB12 = a1.a.b(th12);
                            }
                            q2.b(listB12);
                            break;
                        case 12:
                            InterfaceC0135g interfaceC0135g14 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g14.o(str12, jLongValue, (C0136h) obj28);
                                listB13 = a1.a.t(null);
                            } catch (Throwable th13) {
                                listB13 = a1.a.b(th13);
                            }
                            q2.b(listB13);
                            break;
                        case 13:
                            InterfaceC0135g interfaceC0135g15 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g15.e(str13, dDoubleValue, (C0136h) obj31);
                                listB14 = a1.a.t(null);
                            } catch (Throwable th14) {
                                listB14 = a1.a.b(th14);
                            }
                            q2.b(listB14);
                            break;
                        default:
                            InterfaceC0135g interfaceC0135g16 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            i.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g16.f(str14, str15, (C0136h) obj34);
                                listB15 = a1.a.t(null);
                            } catch (Throwable th15) {
                                listB15 = a1.a.b(th15);
                            }
                            q2.b(listB15);
                            break;
                    }
                }
            });
        } else {
            c0013n8.g(null);
        }
        C0013n c0013n9 = new C0013n(fVar, h.e("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", strConcat), a(), aVarM);
        if (interfaceC0135g != null) {
            final int i10 = 4;
            c0013n9.g(new b() { // from class: u0.d
                @Override // p030q0.b
                public final void o(Object obj, Q q2) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i10) {
                        case 0:
                            InterfaceC0135g interfaceC0135g2 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g2.d(str2, zBooleanValue, (C0136h) obj4);
                                listB = a1.a.t(null);
                            } catch (Throwable th) {
                                listB = a1.a.b(th);
                            }
                            q2.b(listB);
                            break;
                        case 1:
                            InterfaceC0135g interfaceC0135g3 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g3.m(str3, list3, (C0136h) obj7);
                                listB2 = a1.a.t(null);
                            } catch (Throwable th2) {
                                listB2 = a1.a.b(th2);
                            }
                            q2.b(listB2);
                            break;
                        case 2:
                            InterfaceC0135g interfaceC0135g4 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = a1.a.t(interfaceC0135g4.c(str4, (C0136h) obj9));
                            } catch (Throwable th3) {
                                listB3 = a1.a.b(th3);
                            }
                            q2.b(listB3);
                            break;
                        case 3:
                            InterfaceC0135g interfaceC0135g5 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = a1.a.t(interfaceC0135g5.b(str5, (C0136h) obj11));
                            } catch (Throwable th4) {
                                listB4 = a1.a.b(th4);
                            }
                            q2.b(listB4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0135g interfaceC0135g6 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = a1.a.t(interfaceC0135g6.l(str6, (C0136h) obj13));
                            } catch (Throwable th5) {
                                listB5 = a1.a.b(th5);
                            }
                            q2.b(listB5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0135g interfaceC0135g7 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = a1.a.t(interfaceC0135g7.i(str7, (C0136h) obj15));
                            } catch (Throwable th6) {
                                listB6 = a1.a.b(th6);
                            }
                            q2.b(listB6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0135g interfaceC0135g8 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB7 = a1.a.t(interfaceC0135g8.r(str8, (C0136h) obj17));
                            } catch (Throwable th7) {
                                listB7 = a1.a.b(th7);
                            }
                            q2.b(listB7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0135g interfaceC0135g9 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = a1.a.t(interfaceC0135g9.k(str9, (C0136h) obj19));
                            } catch (Throwable th8) {
                                listB8 = a1.a.b(th8);
                            }
                            q2.b(listB8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0135g interfaceC0135g10 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g10.p(list11, (C0136h) obj20);
                                listB9 = a1.a.t(null);
                            } catch (Throwable th9) {
                                listB9 = a1.a.b(th9);
                            }
                            q2.b(listB9);
                            break;
                        case 9:
                            InterfaceC0135g interfaceC0135g11 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            i.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB10 = a1.a.t(interfaceC0135g11.n(list13, (C0136h) obj21));
                            } catch (Throwable th10) {
                                listB10 = a1.a.b(th10);
                            }
                            q2.b(listB10);
                            break;
                        case 10:
                            InterfaceC0135g interfaceC0135g12 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = a1.a.t(interfaceC0135g12.h(list15, (C0136h) obj22));
                            } catch (Throwable th11) {
                                listB11 = a1.a.b(th11);
                            }
                            q2.b(listB11);
                            break;
                        case 11:
                            InterfaceC0135g interfaceC0135g13 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            i.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g13.j(str10, str11, (C0136h) obj25);
                                listB12 = a1.a.t(null);
                            } catch (Throwable th12) {
                                listB12 = a1.a.b(th12);
                            }
                            q2.b(listB12);
                            break;
                        case 12:
                            InterfaceC0135g interfaceC0135g14 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g14.o(str12, jLongValue, (C0136h) obj28);
                                listB13 = a1.a.t(null);
                            } catch (Throwable th13) {
                                listB13 = a1.a.b(th13);
                            }
                            q2.b(listB13);
                            break;
                        case 13:
                            InterfaceC0135g interfaceC0135g15 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g15.e(str13, dDoubleValue, (C0136h) obj31);
                                listB14 = a1.a.t(null);
                            } catch (Throwable th14) {
                                listB14 = a1.a.b(th14);
                            }
                            q2.b(listB14);
                            break;
                        default:
                            InterfaceC0135g interfaceC0135g16 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            i.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g16.f(str14, str15, (C0136h) obj34);
                                listB15 = a1.a.t(null);
                            } catch (Throwable th15) {
                                listB15 = a1.a.b(th15);
                            }
                            q2.b(listB15);
                            break;
                    }
                }
            });
        } else {
            c0013n9.g(null);
        }
        C0013n c0013n10 = new C0013n(fVar, h.e("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", strConcat), a(), aVarM);
        if (interfaceC0135g != null) {
            final int i11 = 5;
            c0013n10.g(new b() { // from class: u0.d
                @Override // p030q0.b
                public final void o(Object obj, Q q2) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i11) {
                        case 0:
                            InterfaceC0135g interfaceC0135g2 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g2.d(str2, zBooleanValue, (C0136h) obj4);
                                listB = a1.a.t(null);
                            } catch (Throwable th) {
                                listB = a1.a.b(th);
                            }
                            q2.b(listB);
                            break;
                        case 1:
                            InterfaceC0135g interfaceC0135g3 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g3.m(str3, list3, (C0136h) obj7);
                                listB2 = a1.a.t(null);
                            } catch (Throwable th2) {
                                listB2 = a1.a.b(th2);
                            }
                            q2.b(listB2);
                            break;
                        case 2:
                            InterfaceC0135g interfaceC0135g4 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = a1.a.t(interfaceC0135g4.c(str4, (C0136h) obj9));
                            } catch (Throwable th3) {
                                listB3 = a1.a.b(th3);
                            }
                            q2.b(listB3);
                            break;
                        case 3:
                            InterfaceC0135g interfaceC0135g5 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = a1.a.t(interfaceC0135g5.b(str5, (C0136h) obj11));
                            } catch (Throwable th4) {
                                listB4 = a1.a.b(th4);
                            }
                            q2.b(listB4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0135g interfaceC0135g6 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = a1.a.t(interfaceC0135g6.l(str6, (C0136h) obj13));
                            } catch (Throwable th5) {
                                listB5 = a1.a.b(th5);
                            }
                            q2.b(listB5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0135g interfaceC0135g7 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = a1.a.t(interfaceC0135g7.i(str7, (C0136h) obj15));
                            } catch (Throwable th6) {
                                listB6 = a1.a.b(th6);
                            }
                            q2.b(listB6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0135g interfaceC0135g8 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB7 = a1.a.t(interfaceC0135g8.r(str8, (C0136h) obj17));
                            } catch (Throwable th7) {
                                listB7 = a1.a.b(th7);
                            }
                            q2.b(listB7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0135g interfaceC0135g9 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = a1.a.t(interfaceC0135g9.k(str9, (C0136h) obj19));
                            } catch (Throwable th8) {
                                listB8 = a1.a.b(th8);
                            }
                            q2.b(listB8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0135g interfaceC0135g10 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g10.p(list11, (C0136h) obj20);
                                listB9 = a1.a.t(null);
                            } catch (Throwable th9) {
                                listB9 = a1.a.b(th9);
                            }
                            q2.b(listB9);
                            break;
                        case 9:
                            InterfaceC0135g interfaceC0135g11 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            i.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB10 = a1.a.t(interfaceC0135g11.n(list13, (C0136h) obj21));
                            } catch (Throwable th10) {
                                listB10 = a1.a.b(th10);
                            }
                            q2.b(listB10);
                            break;
                        case 10:
                            InterfaceC0135g interfaceC0135g12 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = a1.a.t(interfaceC0135g12.h(list15, (C0136h) obj22));
                            } catch (Throwable th11) {
                                listB11 = a1.a.b(th11);
                            }
                            q2.b(listB11);
                            break;
                        case 11:
                            InterfaceC0135g interfaceC0135g13 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            i.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g13.j(str10, str11, (C0136h) obj25);
                                listB12 = a1.a.t(null);
                            } catch (Throwable th12) {
                                listB12 = a1.a.b(th12);
                            }
                            q2.b(listB12);
                            break;
                        case 12:
                            InterfaceC0135g interfaceC0135g14 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g14.o(str12, jLongValue, (C0136h) obj28);
                                listB13 = a1.a.t(null);
                            } catch (Throwable th13) {
                                listB13 = a1.a.b(th13);
                            }
                            q2.b(listB13);
                            break;
                        case 13:
                            InterfaceC0135g interfaceC0135g15 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g15.e(str13, dDoubleValue, (C0136h) obj31);
                                listB14 = a1.a.t(null);
                            } catch (Throwable th14) {
                                listB14 = a1.a.b(th14);
                            }
                            q2.b(listB14);
                            break;
                        default:
                            InterfaceC0135g interfaceC0135g16 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            i.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g16.f(str14, str15, (C0136h) obj34);
                                listB15 = a1.a.t(null);
                            } catch (Throwable th15) {
                                listB15 = a1.a.b(th15);
                            }
                            q2.b(listB15);
                            break;
                    }
                }
            });
        } else {
            c0013n10.g(null);
        }
        C0013n c0013n11 = new C0013n(fVar, h.e("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList", strConcat), a(), aVarM);
        if (interfaceC0135g != null) {
            final int i12 = 6;
            c0013n11.g(new b() { // from class: u0.d
                @Override // p030q0.b
                public final void o(Object obj, Q q2) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i12) {
                        case 0:
                            InterfaceC0135g interfaceC0135g2 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g2.d(str2, zBooleanValue, (C0136h) obj4);
                                listB = a1.a.t(null);
                            } catch (Throwable th) {
                                listB = a1.a.b(th);
                            }
                            q2.b(listB);
                            break;
                        case 1:
                            InterfaceC0135g interfaceC0135g3 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g3.m(str3, list3, (C0136h) obj7);
                                listB2 = a1.a.t(null);
                            } catch (Throwable th2) {
                                listB2 = a1.a.b(th2);
                            }
                            q2.b(listB2);
                            break;
                        case 2:
                            InterfaceC0135g interfaceC0135g4 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = a1.a.t(interfaceC0135g4.c(str4, (C0136h) obj9));
                            } catch (Throwable th3) {
                                listB3 = a1.a.b(th3);
                            }
                            q2.b(listB3);
                            break;
                        case 3:
                            InterfaceC0135g interfaceC0135g5 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = a1.a.t(interfaceC0135g5.b(str5, (C0136h) obj11));
                            } catch (Throwable th4) {
                                listB4 = a1.a.b(th4);
                            }
                            q2.b(listB4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0135g interfaceC0135g6 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = a1.a.t(interfaceC0135g6.l(str6, (C0136h) obj13));
                            } catch (Throwable th5) {
                                listB5 = a1.a.b(th5);
                            }
                            q2.b(listB5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0135g interfaceC0135g7 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = a1.a.t(interfaceC0135g7.i(str7, (C0136h) obj15));
                            } catch (Throwable th6) {
                                listB6 = a1.a.b(th6);
                            }
                            q2.b(listB6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0135g interfaceC0135g8 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB7 = a1.a.t(interfaceC0135g8.r(str8, (C0136h) obj17));
                            } catch (Throwable th7) {
                                listB7 = a1.a.b(th7);
                            }
                            q2.b(listB7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0135g interfaceC0135g9 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = a1.a.t(interfaceC0135g9.k(str9, (C0136h) obj19));
                            } catch (Throwable th8) {
                                listB8 = a1.a.b(th8);
                            }
                            q2.b(listB8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0135g interfaceC0135g10 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g10.p(list11, (C0136h) obj20);
                                listB9 = a1.a.t(null);
                            } catch (Throwable th9) {
                                listB9 = a1.a.b(th9);
                            }
                            q2.b(listB9);
                            break;
                        case 9:
                            InterfaceC0135g interfaceC0135g11 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            i.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB10 = a1.a.t(interfaceC0135g11.n(list13, (C0136h) obj21));
                            } catch (Throwable th10) {
                                listB10 = a1.a.b(th10);
                            }
                            q2.b(listB10);
                            break;
                        case 10:
                            InterfaceC0135g interfaceC0135g12 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = a1.a.t(interfaceC0135g12.h(list15, (C0136h) obj22));
                            } catch (Throwable th11) {
                                listB11 = a1.a.b(th11);
                            }
                            q2.b(listB11);
                            break;
                        case 11:
                            InterfaceC0135g interfaceC0135g13 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            i.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g13.j(str10, str11, (C0136h) obj25);
                                listB12 = a1.a.t(null);
                            } catch (Throwable th12) {
                                listB12 = a1.a.b(th12);
                            }
                            q2.b(listB12);
                            break;
                        case 12:
                            InterfaceC0135g interfaceC0135g14 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g14.o(str12, jLongValue, (C0136h) obj28);
                                listB13 = a1.a.t(null);
                            } catch (Throwable th13) {
                                listB13 = a1.a.b(th13);
                            }
                            q2.b(listB13);
                            break;
                        case 13:
                            InterfaceC0135g interfaceC0135g15 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g15.e(str13, dDoubleValue, (C0136h) obj31);
                                listB14 = a1.a.t(null);
                            } catch (Throwable th14) {
                                listB14 = a1.a.b(th14);
                            }
                            q2.b(listB14);
                            break;
                        default:
                            InterfaceC0135g interfaceC0135g16 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            i.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g16.f(str14, str15, (C0136h) obj34);
                                listB15 = a1.a.t(null);
                            } catch (Throwable th15) {
                                listB15 = a1.a.b(th15);
                            }
                            q2.b(listB15);
                            break;
                    }
                }
            });
        } else {
            c0013n11.g(null);
        }
        C0013n c0013n12 = new C0013n(fVar, h.e("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", strConcat), a(), aVarM);
        if (interfaceC0135g != null) {
            final int i13 = 7;
            c0013n12.g(new b() { // from class: u0.d
                @Override // p030q0.b
                public final void o(Object obj, Q q2) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i13) {
                        case 0:
                            InterfaceC0135g interfaceC0135g2 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g2.d(str2, zBooleanValue, (C0136h) obj4);
                                listB = a1.a.t(null);
                            } catch (Throwable th) {
                                listB = a1.a.b(th);
                            }
                            q2.b(listB);
                            break;
                        case 1:
                            InterfaceC0135g interfaceC0135g3 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g3.m(str3, list3, (C0136h) obj7);
                                listB2 = a1.a.t(null);
                            } catch (Throwable th2) {
                                listB2 = a1.a.b(th2);
                            }
                            q2.b(listB2);
                            break;
                        case 2:
                            InterfaceC0135g interfaceC0135g4 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = a1.a.t(interfaceC0135g4.c(str4, (C0136h) obj9));
                            } catch (Throwable th3) {
                                listB3 = a1.a.b(th3);
                            }
                            q2.b(listB3);
                            break;
                        case 3:
                            InterfaceC0135g interfaceC0135g5 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = a1.a.t(interfaceC0135g5.b(str5, (C0136h) obj11));
                            } catch (Throwable th4) {
                                listB4 = a1.a.b(th4);
                            }
                            q2.b(listB4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0135g interfaceC0135g6 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = a1.a.t(interfaceC0135g6.l(str6, (C0136h) obj13));
                            } catch (Throwable th5) {
                                listB5 = a1.a.b(th5);
                            }
                            q2.b(listB5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0135g interfaceC0135g7 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = a1.a.t(interfaceC0135g7.i(str7, (C0136h) obj15));
                            } catch (Throwable th6) {
                                listB6 = a1.a.b(th6);
                            }
                            q2.b(listB6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0135g interfaceC0135g8 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB7 = a1.a.t(interfaceC0135g8.r(str8, (C0136h) obj17));
                            } catch (Throwable th7) {
                                listB7 = a1.a.b(th7);
                            }
                            q2.b(listB7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0135g interfaceC0135g9 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = a1.a.t(interfaceC0135g9.k(str9, (C0136h) obj19));
                            } catch (Throwable th8) {
                                listB8 = a1.a.b(th8);
                            }
                            q2.b(listB8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0135g interfaceC0135g10 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g10.p(list11, (C0136h) obj20);
                                listB9 = a1.a.t(null);
                            } catch (Throwable th9) {
                                listB9 = a1.a.b(th9);
                            }
                            q2.b(listB9);
                            break;
                        case 9:
                            InterfaceC0135g interfaceC0135g11 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            i.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB10 = a1.a.t(interfaceC0135g11.n(list13, (C0136h) obj21));
                            } catch (Throwable th10) {
                                listB10 = a1.a.b(th10);
                            }
                            q2.b(listB10);
                            break;
                        case 10:
                            InterfaceC0135g interfaceC0135g12 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = a1.a.t(interfaceC0135g12.h(list15, (C0136h) obj22));
                            } catch (Throwable th11) {
                                listB11 = a1.a.b(th11);
                            }
                            q2.b(listB11);
                            break;
                        case 11:
                            InterfaceC0135g interfaceC0135g13 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            i.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g13.j(str10, str11, (C0136h) obj25);
                                listB12 = a1.a.t(null);
                            } catch (Throwable th12) {
                                listB12 = a1.a.b(th12);
                            }
                            q2.b(listB12);
                            break;
                        case 12:
                            InterfaceC0135g interfaceC0135g14 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g14.o(str12, jLongValue, (C0136h) obj28);
                                listB13 = a1.a.t(null);
                            } catch (Throwable th13) {
                                listB13 = a1.a.b(th13);
                            }
                            q2.b(listB13);
                            break;
                        case 13:
                            InterfaceC0135g interfaceC0135g15 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g15.e(str13, dDoubleValue, (C0136h) obj31);
                                listB14 = a1.a.t(null);
                            } catch (Throwable th14) {
                                listB14 = a1.a.b(th14);
                            }
                            q2.b(listB14);
                            break;
                        default:
                            InterfaceC0135g interfaceC0135g16 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            i.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g16.f(str14, str15, (C0136h) obj34);
                                listB15 = a1.a.t(null);
                            } catch (Throwable th15) {
                                listB15 = a1.a.b(th15);
                            }
                            q2.b(listB15);
                            break;
                    }
                }
            });
        } else {
            c0013n12.g(null);
        }
        C0013n c0013n13 = new C0013n(fVar, h.e("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", strConcat), a(), aVarM);
        if (interfaceC0135g != null) {
            final int i14 = 8;
            c0013n13.g(new b() { // from class: u0.d
                @Override // p030q0.b
                public final void o(Object obj, Q q2) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i14) {
                        case 0:
                            InterfaceC0135g interfaceC0135g2 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g2.d(str2, zBooleanValue, (C0136h) obj4);
                                listB = a1.a.t(null);
                            } catch (Throwable th) {
                                listB = a1.a.b(th);
                            }
                            q2.b(listB);
                            break;
                        case 1:
                            InterfaceC0135g interfaceC0135g3 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g3.m(str3, list3, (C0136h) obj7);
                                listB2 = a1.a.t(null);
                            } catch (Throwable th2) {
                                listB2 = a1.a.b(th2);
                            }
                            q2.b(listB2);
                            break;
                        case 2:
                            InterfaceC0135g interfaceC0135g4 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = a1.a.t(interfaceC0135g4.c(str4, (C0136h) obj9));
                            } catch (Throwable th3) {
                                listB3 = a1.a.b(th3);
                            }
                            q2.b(listB3);
                            break;
                        case 3:
                            InterfaceC0135g interfaceC0135g5 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = a1.a.t(interfaceC0135g5.b(str5, (C0136h) obj11));
                            } catch (Throwable th4) {
                                listB4 = a1.a.b(th4);
                            }
                            q2.b(listB4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0135g interfaceC0135g6 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = a1.a.t(interfaceC0135g6.l(str6, (C0136h) obj13));
                            } catch (Throwable th5) {
                                listB5 = a1.a.b(th5);
                            }
                            q2.b(listB5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0135g interfaceC0135g7 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = a1.a.t(interfaceC0135g7.i(str7, (C0136h) obj15));
                            } catch (Throwable th6) {
                                listB6 = a1.a.b(th6);
                            }
                            q2.b(listB6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0135g interfaceC0135g8 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB7 = a1.a.t(interfaceC0135g8.r(str8, (C0136h) obj17));
                            } catch (Throwable th7) {
                                listB7 = a1.a.b(th7);
                            }
                            q2.b(listB7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0135g interfaceC0135g9 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = a1.a.t(interfaceC0135g9.k(str9, (C0136h) obj19));
                            } catch (Throwable th8) {
                                listB8 = a1.a.b(th8);
                            }
                            q2.b(listB8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0135g interfaceC0135g10 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g10.p(list11, (C0136h) obj20);
                                listB9 = a1.a.t(null);
                            } catch (Throwable th9) {
                                listB9 = a1.a.b(th9);
                            }
                            q2.b(listB9);
                            break;
                        case 9:
                            InterfaceC0135g interfaceC0135g11 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            i.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB10 = a1.a.t(interfaceC0135g11.n(list13, (C0136h) obj21));
                            } catch (Throwable th10) {
                                listB10 = a1.a.b(th10);
                            }
                            q2.b(listB10);
                            break;
                        case 10:
                            InterfaceC0135g interfaceC0135g12 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = a1.a.t(interfaceC0135g12.h(list15, (C0136h) obj22));
                            } catch (Throwable th11) {
                                listB11 = a1.a.b(th11);
                            }
                            q2.b(listB11);
                            break;
                        case 11:
                            InterfaceC0135g interfaceC0135g13 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            i.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g13.j(str10, str11, (C0136h) obj25);
                                listB12 = a1.a.t(null);
                            } catch (Throwable th12) {
                                listB12 = a1.a.b(th12);
                            }
                            q2.b(listB12);
                            break;
                        case 12:
                            InterfaceC0135g interfaceC0135g14 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g14.o(str12, jLongValue, (C0136h) obj28);
                                listB13 = a1.a.t(null);
                            } catch (Throwable th13) {
                                listB13 = a1.a.b(th13);
                            }
                            q2.b(listB13);
                            break;
                        case 13:
                            InterfaceC0135g interfaceC0135g15 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g15.e(str13, dDoubleValue, (C0136h) obj31);
                                listB14 = a1.a.t(null);
                            } catch (Throwable th14) {
                                listB14 = a1.a.b(th14);
                            }
                            q2.b(listB14);
                            break;
                        default:
                            InterfaceC0135g interfaceC0135g16 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            i.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g16.f(str14, str15, (C0136h) obj34);
                                listB15 = a1.a.t(null);
                            } catch (Throwable th15) {
                                listB15 = a1.a.b(th15);
                            }
                            q2.b(listB15);
                            break;
                    }
                }
            });
        } else {
            c0013n13.g(null);
        }
        C0013n c0013n14 = new C0013n(fVar, h.e("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", strConcat), a(), aVarM);
        if (interfaceC0135g != null) {
            final int i15 = 9;
            c0013n14.g(new b() { // from class: u0.d
                @Override // p030q0.b
                public final void o(Object obj, Q q2) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i15) {
                        case 0:
                            InterfaceC0135g interfaceC0135g2 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g2.d(str2, zBooleanValue, (C0136h) obj4);
                                listB = a1.a.t(null);
                            } catch (Throwable th) {
                                listB = a1.a.b(th);
                            }
                            q2.b(listB);
                            break;
                        case 1:
                            InterfaceC0135g interfaceC0135g3 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g3.m(str3, list3, (C0136h) obj7);
                                listB2 = a1.a.t(null);
                            } catch (Throwable th2) {
                                listB2 = a1.a.b(th2);
                            }
                            q2.b(listB2);
                            break;
                        case 2:
                            InterfaceC0135g interfaceC0135g4 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = a1.a.t(interfaceC0135g4.c(str4, (C0136h) obj9));
                            } catch (Throwable th3) {
                                listB3 = a1.a.b(th3);
                            }
                            q2.b(listB3);
                            break;
                        case 3:
                            InterfaceC0135g interfaceC0135g5 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = a1.a.t(interfaceC0135g5.b(str5, (C0136h) obj11));
                            } catch (Throwable th4) {
                                listB4 = a1.a.b(th4);
                            }
                            q2.b(listB4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0135g interfaceC0135g6 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = a1.a.t(interfaceC0135g6.l(str6, (C0136h) obj13));
                            } catch (Throwable th5) {
                                listB5 = a1.a.b(th5);
                            }
                            q2.b(listB5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0135g interfaceC0135g7 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = a1.a.t(interfaceC0135g7.i(str7, (C0136h) obj15));
                            } catch (Throwable th6) {
                                listB6 = a1.a.b(th6);
                            }
                            q2.b(listB6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0135g interfaceC0135g8 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB7 = a1.a.t(interfaceC0135g8.r(str8, (C0136h) obj17));
                            } catch (Throwable th7) {
                                listB7 = a1.a.b(th7);
                            }
                            q2.b(listB7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0135g interfaceC0135g9 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = a1.a.t(interfaceC0135g9.k(str9, (C0136h) obj19));
                            } catch (Throwable th8) {
                                listB8 = a1.a.b(th8);
                            }
                            q2.b(listB8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0135g interfaceC0135g10 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g10.p(list11, (C0136h) obj20);
                                listB9 = a1.a.t(null);
                            } catch (Throwable th9) {
                                listB9 = a1.a.b(th9);
                            }
                            q2.b(listB9);
                            break;
                        case 9:
                            InterfaceC0135g interfaceC0135g11 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            i.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB10 = a1.a.t(interfaceC0135g11.n(list13, (C0136h) obj21));
                            } catch (Throwable th10) {
                                listB10 = a1.a.b(th10);
                            }
                            q2.b(listB10);
                            break;
                        case 10:
                            InterfaceC0135g interfaceC0135g12 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = a1.a.t(interfaceC0135g12.h(list15, (C0136h) obj22));
                            } catch (Throwable th11) {
                                listB11 = a1.a.b(th11);
                            }
                            q2.b(listB11);
                            break;
                        case 11:
                            InterfaceC0135g interfaceC0135g13 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            i.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g13.j(str10, str11, (C0136h) obj25);
                                listB12 = a1.a.t(null);
                            } catch (Throwable th12) {
                                listB12 = a1.a.b(th12);
                            }
                            q2.b(listB12);
                            break;
                        case 12:
                            InterfaceC0135g interfaceC0135g14 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g14.o(str12, jLongValue, (C0136h) obj28);
                                listB13 = a1.a.t(null);
                            } catch (Throwable th13) {
                                listB13 = a1.a.b(th13);
                            }
                            q2.b(listB13);
                            break;
                        case 13:
                            InterfaceC0135g interfaceC0135g15 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g15.e(str13, dDoubleValue, (C0136h) obj31);
                                listB14 = a1.a.t(null);
                            } catch (Throwable th14) {
                                listB14 = a1.a.b(th14);
                            }
                            q2.b(listB14);
                            break;
                        default:
                            InterfaceC0135g interfaceC0135g16 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            i.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g16.f(str14, str15, (C0136h) obj34);
                                listB15 = a1.a.t(null);
                            } catch (Throwable th15) {
                                listB15 = a1.a.b(th15);
                            }
                            q2.b(listB15);
                            break;
                    }
                }
            });
        } else {
            c0013n14.g(null);
        }
        C0013n c0013n15 = new C0013n(fVar, h.e("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", strConcat), a(), aVarM);
        if (interfaceC0135g == null) {
            c0013n15.g(null);
        } else {
            final int i16 = 10;
            c0013n15.g(new b() { // from class: u0.d
                @Override // p030q0.b
                public final void o(Object obj, Q q2) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i16) {
                        case 0:
                            InterfaceC0135g interfaceC0135g2 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g2.d(str2, zBooleanValue, (C0136h) obj4);
                                listB = a1.a.t(null);
                            } catch (Throwable th) {
                                listB = a1.a.b(th);
                            }
                            q2.b(listB);
                            break;
                        case 1:
                            InterfaceC0135g interfaceC0135g3 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g3.m(str3, list3, (C0136h) obj7);
                                listB2 = a1.a.t(null);
                            } catch (Throwable th2) {
                                listB2 = a1.a.b(th2);
                            }
                            q2.b(listB2);
                            break;
                        case 2:
                            InterfaceC0135g interfaceC0135g4 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = a1.a.t(interfaceC0135g4.c(str4, (C0136h) obj9));
                            } catch (Throwable th3) {
                                listB3 = a1.a.b(th3);
                            }
                            q2.b(listB3);
                            break;
                        case 3:
                            InterfaceC0135g interfaceC0135g5 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = a1.a.t(interfaceC0135g5.b(str5, (C0136h) obj11));
                            } catch (Throwable th4) {
                                listB4 = a1.a.b(th4);
                            }
                            q2.b(listB4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0135g interfaceC0135g6 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = a1.a.t(interfaceC0135g6.l(str6, (C0136h) obj13));
                            } catch (Throwable th5) {
                                listB5 = a1.a.b(th5);
                            }
                            q2.b(listB5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0135g interfaceC0135g7 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = a1.a.t(interfaceC0135g7.i(str7, (C0136h) obj15));
                            } catch (Throwable th6) {
                                listB6 = a1.a.b(th6);
                            }
                            q2.b(listB6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0135g interfaceC0135g8 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB7 = a1.a.t(interfaceC0135g8.r(str8, (C0136h) obj17));
                            } catch (Throwable th7) {
                                listB7 = a1.a.b(th7);
                            }
                            q2.b(listB7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0135g interfaceC0135g9 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = a1.a.t(interfaceC0135g9.k(str9, (C0136h) obj19));
                            } catch (Throwable th8) {
                                listB8 = a1.a.b(th8);
                            }
                            q2.b(listB8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0135g interfaceC0135g10 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g10.p(list11, (C0136h) obj20);
                                listB9 = a1.a.t(null);
                            } catch (Throwable th9) {
                                listB9 = a1.a.b(th9);
                            }
                            q2.b(listB9);
                            break;
                        case 9:
                            InterfaceC0135g interfaceC0135g11 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            i.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB10 = a1.a.t(interfaceC0135g11.n(list13, (C0136h) obj21));
                            } catch (Throwable th10) {
                                listB10 = a1.a.b(th10);
                            }
                            q2.b(listB10);
                            break;
                        case 10:
                            InterfaceC0135g interfaceC0135g12 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = a1.a.t(interfaceC0135g12.h(list15, (C0136h) obj22));
                            } catch (Throwable th11) {
                                listB11 = a1.a.b(th11);
                            }
                            q2.b(listB11);
                            break;
                        case 11:
                            InterfaceC0135g interfaceC0135g13 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            i.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g13.j(str10, str11, (C0136h) obj25);
                                listB12 = a1.a.t(null);
                            } catch (Throwable th12) {
                                listB12 = a1.a.b(th12);
                            }
                            q2.b(listB12);
                            break;
                        case 12:
                            InterfaceC0135g interfaceC0135g14 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g14.o(str12, jLongValue, (C0136h) obj28);
                                listB13 = a1.a.t(null);
                            } catch (Throwable th13) {
                                listB13 = a1.a.b(th13);
                            }
                            q2.b(listB13);
                            break;
                        case 13:
                            InterfaceC0135g interfaceC0135g15 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g15.e(str13, dDoubleValue, (C0136h) obj31);
                                listB14 = a1.a.t(null);
                            } catch (Throwable th14) {
                                listB14 = a1.a.b(th14);
                            }
                            q2.b(listB14);
                            break;
                        default:
                            InterfaceC0135g interfaceC0135g16 = interfaceC0135g;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            i.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0135g16.f(str14, str15, (C0136h) obj34);
                                listB15 = a1.a.t(null);
                            } catch (Throwable th15) {
                                listB15 = a1.a.b(th15);
                            }
                            q2.b(listB15);
                            break;
                    }
                }
            });
        }
    }
}
