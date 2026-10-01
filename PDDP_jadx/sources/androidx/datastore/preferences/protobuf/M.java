package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f1438a;

    static {
        char[] cArr = new char[80];
        f1438a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i2, StringBuilder sb) {
        while (i2 > 0) {
            int i3 = 80;
            if (i2 <= 80) {
                i3 = i2;
            }
            sb.append(f1438a, 0, i3);
            i2 -= i3;
        }
    }

    public static void b(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i2, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i3 = 1; i3 < str.length(); i3++) {
                char cCharAt = str.charAt(i3);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            C0075g c0075g = C0075g.f1501g;
            sb.append(p000a.a.q(new C0075g(((String) obj).getBytes(AbstractC0092y.f1577a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0075g) {
            sb.append(": \"");
            sb.append(p000a.a.q((C0075g) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0090w) {
            sb.append(" {");
            c((AbstractC0090w) obj, sb, i2 + 2);
            sb.append("\n");
            a(i2, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i4 = i2 + 2;
        b(sb, i4, "key", entry.getKey());
        b(sb, i4, "value", entry.getValue());
        sb.append("\n");
        a(i2, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:104:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:105:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:107:0x020c  */
    /* JADX WARN: Code duplicated, block: B:126:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0161  */
    /* JADX WARN: Code duplicated, block: B:65:0x0173  */
    /* JADX WARN: Code duplicated, block: B:67:0x017b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0180  */
    /* JADX WARN: Code duplicated, block: B:70:0x018a  */
    /* JADX WARN: Code duplicated, block: B:72:0x018e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0197  */
    /* JADX WARN: Code duplicated, block: B:75:0x0199  */
    /* JADX WARN: Code duplicated, block: B:77:0x019d  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:82:0x01af  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:88:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d7  */
    public static void c(AbstractC0090w abstractC0090w, StringBuilder sb, int i2) {
        int i3;
        Method method;
        Method method2;
        Object objG;
        boolean zBooleanValue;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC0090w.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i3 = 3;
            if (i4 >= length) {
                break;
            }
            Method method5 = declaredMethods[i4];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i3);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method4 = (Method) entry.getValue()) != null && method4.getReturnType().equals(List.class)) {
                b(sb, i2, strSubstring.substring(0, strSubstring.length() - 4), AbstractC0090w.g(method4, abstractC0090w, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                b(sb, i2, strSubstring.substring(0, strSubstring.length() - 3), AbstractC0090w.g(method3, abstractC0090w, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objG = AbstractC0090w.g(method, abstractC0090w, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objG instanceof Boolean) {
                                    zEquals = !((Boolean) objG).booleanValue();
                                } else if (objG instanceof Integer) {
                                    if (((Integer) objG).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objG instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objG).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objG instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objG).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objG instanceof String) {
                                    zEquals = objG.equals("");
                                } else if (objG instanceof C0075g) {
                                    zEquals = objG.equals(C0075g.f1501g);
                                } else if ((objG instanceof AbstractC0069a) ? !((objG instanceof Enum) && ((Enum) objG).ordinal() == 0) : objG != ((AbstractC0090w) ((AbstractC0090w) ((AbstractC0069a) objG)).e(6))) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) AbstractC0090w.g(method2, abstractC0090w, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                b(sb, i2, strSubstring, objG);
                            }
                        }
                    }
                } else {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objG = AbstractC0090w.g(method, abstractC0090w, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objG instanceof Boolean) {
                                zEquals = !((Boolean) objG).booleanValue();
                            } else if (objG instanceof Integer) {
                                if (((Integer) objG).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objG instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objG).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objG instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objG).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objG instanceof String) {
                                zEquals = objG.equals("");
                            } else if (objG instanceof C0075g) {
                                zEquals = objG.equals(C0075g.f1501g);
                            } else if (objG instanceof AbstractC0069a) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) AbstractC0090w.g(method2, abstractC0090w, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            b(sb, i2, strSubstring, objG);
                        }
                    }
                }
            }
            i3 = 3;
        }
        d0 d0Var = abstractC0090w.unknownFields;
        if (d0Var != null) {
            for (int i5 = 0; i5 < d0Var.f1493a; i5++) {
                b(sb, i2, String.valueOf(d0Var.f1494b[i5] >>> 3), d0Var.f1495c[i5]);
            }
        }
    }
}
