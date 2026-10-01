package I0;

import G.C0013n;
import I.k;
import N.Q;
import java.util.ArrayList;
import java.util.List;
import p000a.a;
import p037u0.C0129a;
import p037u0.C0130b;
import p039v0.C0143a;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class h {
    public static int a(String str) throws NoSuchFieldException {
        String str2;
        for (int i2 : I.j.c(2)) {
            if (i2 == 1) {
                str2 = "Brightness.light";
            } else {
                if (i2 != 2) {
                    throw null;
                }
                str2 = "Brightness.dark";
            }
            if (str2.equals(str)) {
                return i2;
            }
        }
        throw new NoSuchFieldException(e("No such Brightness: ", str));
    }

    public static int b(String str) throws NoSuchFieldException {
        for (int i2 : I.j.c(5)) {
            String str2 = null;
            if (i2 != 1) {
                if (i2 == 2) {
                    str2 = "HapticFeedbackType.lightImpact";
                } else if (i2 == 3) {
                    str2 = "HapticFeedbackType.mediumImpact";
                } else if (i2 == 4) {
                    str2 = "HapticFeedbackType.heavyImpact";
                } else {
                    if (i2 != 5) {
                        throw null;
                    }
                    str2 = "HapticFeedbackType.selectionClick";
                }
            }
            if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                return i2;
            }
        }
        throw new NoSuchFieldException(e("No such HapticFeedbackType: ", str));
    }

    public static int c(String str) throws NoSuchFieldException {
        String str2;
        for (int i2 : I.j.c(2)) {
            if (i2 == 1) {
                str2 = "SystemSoundType.click";
            } else {
                if (i2 != 2) {
                    throw null;
                }
                str2 = "SystemSoundType.alert";
            }
            if (str2.equals(str)) {
                return i2;
            }
        }
        throw new NoSuchFieldException(e("No such SoundType: ", str));
    }

    public static /* synthetic */ int d(int i2) {
        switch (i2) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case I.k.LONG_FIELD_NUMBER /* 4 */:
                return 8;
            case I.k.STRING_FIELD_NUMBER /* 5 */:
                return 16;
            case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return 32;
            case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return 64;
            case I.k.BYTES_FIELD_NUMBER /* 8 */:
                return 128;
            case 9:
                return 256;
            case 10:
                return 512;
            case 11:
                return 1024;
            case 12:
                return 2048;
            case 13:
                return 4096;
            case 14:
                return 8192;
            case 15:
                return 16384;
            case 16:
                return 32768;
            case 17:
                return 65536;
            case 18:
                return 131072;
            case 19:
                return 262144;
            case 20:
                return 524288;
            case 21:
                return 1048576;
            case 22:
                return 2097152;
            case 23:
                return 4194304;
            case 24:
                return 8388608;
            case 25:
                return 16777216;
            case 26:
                return 33554432;
            case 27:
                return 67108864;
            case 28:
                return 134217728;
            case 29:
                return 268435456;
            default:
                throw null;
        }
    }

    public static String e(String str, String str2) {
        return str + str2;
    }

    public static p041x0.c f(String str, String str2, String str3) {
        return p000a.a.l(new C0143a(str, str2, str3));
    }

    public static /* synthetic */ void g(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void h(String str, int i2) {
        if (i2 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = i.class.getName();
            int i3 = 0;
            while (!stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            while (stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            StackTraceElement stackTraceElement = stackTrace[i3];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            i.f(nullPointerException, i.class.getName());
            throw nullPointerException;
        }
    }

    public static void i(String str, String str2, String str3) {
        p000a.a.l(new C0143a(str, str2, str3));
    }

    public static void j(p041x0.c cVar, H0.l lVar) {
        lVar.j(new p041x0.d(cVar));
    }

    public static void k(p030q0.f fVar, final C0129a c0129a) {
        H.a aVarM = fVar.m();
        C0130b c0130b = C0130b.f3126e;
        C0013n c0013n = new C0013n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", c0130b, aVarM);
        if (c0129a != null) {
            final int i2 = 0;
            c0013n.g(new p030q0.b() { // from class: u0.c
                @Override // p030q0.b
                public final void o(Object obj, Q q2) {
                    switch (i2) {
                        case 0:
                            C0129a c0129a2 = c0129a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0129a2.f3124e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = a.Q(th);
                            }
                            q2.b(arrayList);
                            break;
                        case 1:
                            C0129a c0129a3 = c0129a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0129a3.f3124e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = a.Q(th2);
                            }
                            q2.b(arrayList2);
                            break;
                        case 2:
                            C0129a c0129a4 = c0129a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0129a4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = a.Q(th3);
                            }
                            q2.b(arrayList4);
                            break;
                        case 3:
                            C0129a c0129a5 = c0129a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0129a5.f3124e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = a.Q(th4);
                            }
                            q2.b(arrayList6);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0129a c0129a6 = c0129a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                c0129a6.getClass();
                                String string = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0129a6.f3124e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = a.Q(th5);
                            }
                            q2.b(arrayList8);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0129a c0129a7 = c0129a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0129a7.f3124e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = a.Q(th6);
                            }
                            q2.b(arrayList10);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0129a c0129a8 = c0129a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0129a8.f3124e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0129a8.f3125f.f(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = a.Q(th7);
                            }
                            q2.b(arrayList12);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0129a c0129a9 = c0129a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0129a9.b((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = a.Q(th8);
                            }
                            q2.b(arrayList14);
                            break;
                        default:
                            C0129a c0129a10 = c0129a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0129a10.c((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = a.Q(th9);
                            }
                            q2.b(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0013n.g(null);
        }
        C0013n c0013n2 = new C0013n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", c0130b, aVarM);
        if (c0129a != null) {
            final int i3 = 1;
            c0013n2.g(new p030q0.b() { // from class: u0.c
                @Override // p030q0.b
                public final void o(Object obj, Q q2) {
                    switch (i3) {
                        case 0:
                            C0129a c0129a2 = c0129a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0129a2.f3124e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = a.Q(th);
                            }
                            q2.b(arrayList);
                            break;
                        case 1:
                            C0129a c0129a3 = c0129a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0129a3.f3124e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = a.Q(th2);
                            }
                            q2.b(arrayList2);
                            break;
                        case 2:
                            C0129a c0129a4 = c0129a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0129a4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = a.Q(th3);
                            }
                            q2.b(arrayList4);
                            break;
                        case 3:
                            C0129a c0129a5 = c0129a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0129a5.f3124e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = a.Q(th4);
                            }
                            q2.b(arrayList6);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0129a c0129a6 = c0129a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                c0129a6.getClass();
                                String string = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0129a6.f3124e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = a.Q(th5);
                            }
                            q2.b(arrayList8);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0129a c0129a7 = c0129a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0129a7.f3124e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = a.Q(th6);
                            }
                            q2.b(arrayList10);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0129a c0129a8 = c0129a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0129a8.f3124e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0129a8.f3125f.f(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = a.Q(th7);
                            }
                            q2.b(arrayList12);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0129a c0129a9 = c0129a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0129a9.b((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = a.Q(th8);
                            }
                            q2.b(arrayList14);
                            break;
                        default:
                            C0129a c0129a10 = c0129a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0129a10.c((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = a.Q(th9);
                            }
                            q2.b(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0013n2.g(null);
        }
        C0013n c0013n3 = new C0013n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", c0130b, aVarM);
        if (c0129a != null) {
            final int i4 = 2;
            c0013n3.g(new p030q0.b() { // from class: u0.c
                @Override // p030q0.b
                public final void o(Object obj, Q q2) {
                    switch (i4) {
                        case 0:
                            C0129a c0129a2 = c0129a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0129a2.f3124e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = a.Q(th);
                            }
                            q2.b(arrayList);
                            break;
                        case 1:
                            C0129a c0129a3 = c0129a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0129a3.f3124e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = a.Q(th2);
                            }
                            q2.b(arrayList2);
                            break;
                        case 2:
                            C0129a c0129a4 = c0129a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0129a4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = a.Q(th3);
                            }
                            q2.b(arrayList4);
                            break;
                        case 3:
                            C0129a c0129a5 = c0129a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0129a5.f3124e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = a.Q(th4);
                            }
                            q2.b(arrayList6);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0129a c0129a6 = c0129a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                c0129a6.getClass();
                                String string = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0129a6.f3124e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = a.Q(th5);
                            }
                            q2.b(arrayList8);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0129a c0129a7 = c0129a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0129a7.f3124e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = a.Q(th6);
                            }
                            q2.b(arrayList10);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0129a c0129a8 = c0129a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0129a8.f3124e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0129a8.f3125f.f(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = a.Q(th7);
                            }
                            q2.b(arrayList12);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0129a c0129a9 = c0129a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0129a9.b((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = a.Q(th8);
                            }
                            q2.b(arrayList14);
                            break;
                        default:
                            C0129a c0129a10 = c0129a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0129a10.c((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = a.Q(th9);
                            }
                            q2.b(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0013n3.g(null);
        }
        C0013n c0013n4 = new C0013n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", c0130b, aVarM);
        if (c0129a != null) {
            final int i5 = 3;
            c0013n4.g(new p030q0.b() { // from class: u0.c
                @Override // p030q0.b
                public final void o(Object obj, Q q2) {
                    switch (i5) {
                        case 0:
                            C0129a c0129a2 = c0129a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0129a2.f3124e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = a.Q(th);
                            }
                            q2.b(arrayList);
                            break;
                        case 1:
                            C0129a c0129a3 = c0129a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0129a3.f3124e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = a.Q(th2);
                            }
                            q2.b(arrayList2);
                            break;
                        case 2:
                            C0129a c0129a4 = c0129a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0129a4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = a.Q(th3);
                            }
                            q2.b(arrayList4);
                            break;
                        case 3:
                            C0129a c0129a5 = c0129a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0129a5.f3124e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = a.Q(th4);
                            }
                            q2.b(arrayList6);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0129a c0129a6 = c0129a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                c0129a6.getClass();
                                String string = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0129a6.f3124e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = a.Q(th5);
                            }
                            q2.b(arrayList8);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0129a c0129a7 = c0129a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0129a7.f3124e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = a.Q(th6);
                            }
                            q2.b(arrayList10);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0129a c0129a8 = c0129a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0129a8.f3124e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0129a8.f3125f.f(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = a.Q(th7);
                            }
                            q2.b(arrayList12);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0129a c0129a9 = c0129a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0129a9.b((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = a.Q(th8);
                            }
                            q2.b(arrayList14);
                            break;
                        default:
                            C0129a c0129a10 = c0129a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0129a10.c((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = a.Q(th9);
                            }
                            q2.b(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0013n4.g(null);
        }
        C0013n c0013n5 = new C0013n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", c0130b, aVarM);
        if (c0129a != null) {
            final int i6 = 4;
            c0013n5.g(new p030q0.b() { // from class: u0.c
                @Override // p030q0.b
                public final void o(Object obj, Q q2) {
                    switch (i6) {
                        case 0:
                            C0129a c0129a2 = c0129a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0129a2.f3124e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = a.Q(th);
                            }
                            q2.b(arrayList);
                            break;
                        case 1:
                            C0129a c0129a3 = c0129a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0129a3.f3124e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = a.Q(th2);
                            }
                            q2.b(arrayList2);
                            break;
                        case 2:
                            C0129a c0129a4 = c0129a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0129a4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = a.Q(th3);
                            }
                            q2.b(arrayList4);
                            break;
                        case 3:
                            C0129a c0129a5 = c0129a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0129a5.f3124e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = a.Q(th4);
                            }
                            q2.b(arrayList6);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0129a c0129a6 = c0129a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                c0129a6.getClass();
                                String string = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0129a6.f3124e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = a.Q(th5);
                            }
                            q2.b(arrayList8);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0129a c0129a7 = c0129a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0129a7.f3124e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = a.Q(th6);
                            }
                            q2.b(arrayList10);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0129a c0129a8 = c0129a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0129a8.f3124e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0129a8.f3125f.f(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = a.Q(th7);
                            }
                            q2.b(arrayList12);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0129a c0129a9 = c0129a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0129a9.b((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = a.Q(th8);
                            }
                            q2.b(arrayList14);
                            break;
                        default:
                            C0129a c0129a10 = c0129a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0129a10.c((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = a.Q(th9);
                            }
                            q2.b(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0013n5.g(null);
        }
        C0013n c0013n6 = new C0013n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList", c0130b, aVarM);
        if (c0129a != null) {
            final int i7 = 5;
            c0013n6.g(new p030q0.b() { // from class: u0.c
                @Override // p030q0.b
                public final void o(Object obj, Q q2) {
                    switch (i7) {
                        case 0:
                            C0129a c0129a2 = c0129a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0129a2.f3124e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = a.Q(th);
                            }
                            q2.b(arrayList);
                            break;
                        case 1:
                            C0129a c0129a3 = c0129a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0129a3.f3124e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = a.Q(th2);
                            }
                            q2.b(arrayList2);
                            break;
                        case 2:
                            C0129a c0129a4 = c0129a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0129a4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = a.Q(th3);
                            }
                            q2.b(arrayList4);
                            break;
                        case 3:
                            C0129a c0129a5 = c0129a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0129a5.f3124e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = a.Q(th4);
                            }
                            q2.b(arrayList6);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0129a c0129a6 = c0129a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                c0129a6.getClass();
                                String string = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0129a6.f3124e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = a.Q(th5);
                            }
                            q2.b(arrayList8);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0129a c0129a7 = c0129a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0129a7.f3124e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = a.Q(th6);
                            }
                            q2.b(arrayList10);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0129a c0129a8 = c0129a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0129a8.f3124e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0129a8.f3125f.f(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = a.Q(th7);
                            }
                            q2.b(arrayList12);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0129a c0129a9 = c0129a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0129a9.b((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = a.Q(th8);
                            }
                            q2.b(arrayList14);
                            break;
                        default:
                            C0129a c0129a10 = c0129a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0129a10.c((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = a.Q(th9);
                            }
                            q2.b(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0013n6.g(null);
        }
        C0013n c0013n7 = new C0013n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList", c0130b, aVarM);
        if (c0129a != null) {
            final int i8 = 6;
            c0013n7.g(new p030q0.b() { // from class: u0.c
                @Override // p030q0.b
                public final void o(Object obj, Q q2) {
                    switch (i8) {
                        case 0:
                            C0129a c0129a2 = c0129a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0129a2.f3124e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = a.Q(th);
                            }
                            q2.b(arrayList);
                            break;
                        case 1:
                            C0129a c0129a3 = c0129a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0129a3.f3124e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = a.Q(th2);
                            }
                            q2.b(arrayList2);
                            break;
                        case 2:
                            C0129a c0129a4 = c0129a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0129a4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = a.Q(th3);
                            }
                            q2.b(arrayList4);
                            break;
                        case 3:
                            C0129a c0129a5 = c0129a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0129a5.f3124e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = a.Q(th4);
                            }
                            q2.b(arrayList6);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0129a c0129a6 = c0129a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                c0129a6.getClass();
                                String string = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0129a6.f3124e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = a.Q(th5);
                            }
                            q2.b(arrayList8);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0129a c0129a7 = c0129a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0129a7.f3124e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = a.Q(th6);
                            }
                            q2.b(arrayList10);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0129a c0129a8 = c0129a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0129a8.f3124e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0129a8.f3125f.f(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = a.Q(th7);
                            }
                            q2.b(arrayList12);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0129a c0129a9 = c0129a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0129a9.b((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = a.Q(th8);
                            }
                            q2.b(arrayList14);
                            break;
                        default:
                            C0129a c0129a10 = c0129a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0129a10.c((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = a.Q(th9);
                            }
                            q2.b(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0013n7.g(null);
        }
        C0013n c0013n8 = new C0013n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", c0130b, aVarM);
        if (c0129a != null) {
            final int i9 = 7;
            c0013n8.g(new p030q0.b() { // from class: u0.c
                @Override // p030q0.b
                public final void o(Object obj, Q q2) {
                    switch (i9) {
                        case 0:
                            C0129a c0129a2 = c0129a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0129a2.f3124e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = a.Q(th);
                            }
                            q2.b(arrayList);
                            break;
                        case 1:
                            C0129a c0129a3 = c0129a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0129a3.f3124e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = a.Q(th2);
                            }
                            q2.b(arrayList2);
                            break;
                        case 2:
                            C0129a c0129a4 = c0129a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0129a4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = a.Q(th3);
                            }
                            q2.b(arrayList4);
                            break;
                        case 3:
                            C0129a c0129a5 = c0129a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0129a5.f3124e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = a.Q(th4);
                            }
                            q2.b(arrayList6);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0129a c0129a6 = c0129a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                c0129a6.getClass();
                                String string = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0129a6.f3124e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = a.Q(th5);
                            }
                            q2.b(arrayList8);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0129a c0129a7 = c0129a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0129a7.f3124e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = a.Q(th6);
                            }
                            q2.b(arrayList10);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0129a c0129a8 = c0129a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0129a8.f3124e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0129a8.f3125f.f(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = a.Q(th7);
                            }
                            q2.b(arrayList12);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0129a c0129a9 = c0129a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0129a9.b((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = a.Q(th8);
                            }
                            q2.b(arrayList14);
                            break;
                        default:
                            C0129a c0129a10 = c0129a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0129a10.c((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = a.Q(th9);
                            }
                            q2.b(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0013n8.g(null);
        }
        C0013n c0013n9 = new C0013n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", c0130b, aVarM);
        if (c0129a == null) {
            c0013n9.g(null);
        } else {
            final int i10 = 8;
            c0013n9.g(new p030q0.b() { // from class: u0.c
                @Override // p030q0.b
                public final void o(Object obj, Q q2) {
                    switch (i10) {
                        case 0:
                            C0129a c0129a2 = c0129a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0129a2.f3124e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = a.Q(th);
                            }
                            q2.b(arrayList);
                            break;
                        case 1:
                            C0129a c0129a3 = c0129a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0129a3.f3124e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = a.Q(th2);
                            }
                            q2.b(arrayList2);
                            break;
                        case 2:
                            C0129a c0129a4 = c0129a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0129a4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = a.Q(th3);
                            }
                            q2.b(arrayList4);
                            break;
                        case 3:
                            C0129a c0129a5 = c0129a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0129a5.f3124e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = a.Q(th4);
                            }
                            q2.b(arrayList6);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0129a c0129a6 = c0129a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                c0129a6.getClass();
                                String string = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0129a6.f3124e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = a.Q(th5);
                            }
                            q2.b(arrayList8);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0129a c0129a7 = c0129a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0129a7.f3124e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = a.Q(th6);
                            }
                            q2.b(arrayList10);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0129a c0129a8 = c0129a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0129a8.f3124e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0129a8.f3125f.f(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = a.Q(th7);
                            }
                            q2.b(arrayList12);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0129a c0129a9 = c0129a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0129a9.b((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = a.Q(th8);
                            }
                            q2.b(arrayList14);
                            break;
                        default:
                            C0129a c0129a10 = c0129a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0129a10.c((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = a.Q(th9);
                            }
                            q2.b(arrayList16);
                            break;
                    }
                }
            });
        }
    }
}
