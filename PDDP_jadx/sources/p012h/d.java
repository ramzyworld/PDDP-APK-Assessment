package p012h;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p004c.a;
import p006d.b;
import p014i.j;
import p016j.AbstractC0127y;

/* JADX INFO: loaded from: classes.dex */
public final class d extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f1971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f1972f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f1973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f1974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f1975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1976d;

    static {
        Class[] clsArr = {Context.class};
        f1971e = clsArr;
        f1972f = clsArr;
    }

    public d(Context context) {
        super(context);
        this.f1975c = context;
        Object[] objArr = {context};
        this.f1973a = objArr;
        this.f1974b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v58 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ?? r4;
        int i2;
        ColorStateList colorStateList;
        int resourceId;
        c cVar = new c(this, menu);
        int eventType = xmlResourceParser.getEventType();
        do {
            r4 = 1;
            i2 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
                break;
            }
            eventType = xmlResourceParser.next();
        } while (eventType != 1);
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (!z2) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i2) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z3 && name2.equals(str)) {
                        z3 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        cVar.f1947b = 0;
                        cVar.f1948c = 0;
                        cVar.f1949d = 0;
                        cVar.f1950e = 0;
                        cVar.f1951f = r4;
                        cVar.f1952g = r4;
                    } else if (name2.equals("item")) {
                        if (!cVar.f1953h) {
                            cVar.f1953h = r4;
                            cVar.b(cVar.f1946a.add(cVar.f1947b, cVar.f1954i, cVar.f1955j, cVar.f1956k));
                        }
                    } else if (name2.equals("menu")) {
                        z2 = true;
                    }
                }
            } else if (!z3) {
                String name3 = xmlResourceParser.getName();
                boolean zEquals = name3.equals("group");
                d dVar = cVar.f1945D;
                if (zEquals) {
                    TypedArray typedArrayObtainStyledAttributes = dVar.f1975c.obtainStyledAttributes(attributeSet, a.f1748l);
                    cVar.f1947b = typedArrayObtainStyledAttributes.getResourceId(r4, 0);
                    cVar.f1948c = typedArrayObtainStyledAttributes.getInt(3, 0);
                    cVar.f1949d = typedArrayObtainStyledAttributes.getInt(4, 0);
                    cVar.f1950e = typedArrayObtainStyledAttributes.getInt(5, 0);
                    cVar.f1951f = typedArrayObtainStyledAttributes.getBoolean(2, r4);
                    cVar.f1952g = typedArrayObtainStyledAttributes.getBoolean(0, r4);
                    typedArrayObtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    Context context = dVar.f1975c;
                    TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.f1749m);
                    cVar.f1954i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                    cVar.f1955j = (typedArrayObtainStyledAttributes2.getInt(5, cVar.f1948c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, cVar.f1949d) & 65535);
                    cVar.f1956k = typedArrayObtainStyledAttributes2.getText(7);
                    cVar.f1957l = typedArrayObtainStyledAttributes2.getText(8);
                    cVar.f1958m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                    String string = typedArrayObtainStyledAttributes2.getString(9);
                    cVar.f1959n = string == null ? (char) 0 : string.charAt(0);
                    cVar.f1960o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                    String string2 = typedArrayObtainStyledAttributes2.getString(10);
                    cVar.f1961p = string2 == null ? (char) 0 : string2.charAt(0);
                    cVar.f1962q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                    if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                        cVar.f1963r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                    } else {
                        cVar.f1963r = cVar.f1950e;
                    }
                    cVar.f1964s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                    cVar.t = typedArrayObtainStyledAttributes2.getBoolean(4, cVar.f1951f);
                    cVar.f1965u = typedArrayObtainStyledAttributes2.getBoolean(1, cVar.f1952g);
                    cVar.f1966v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                    cVar.f1969y = typedArrayObtainStyledAttributes2.getString(12);
                    cVar.f1967w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                    cVar.f1968x = typedArrayObtainStyledAttributes2.getString(15);
                    String string3 = typedArrayObtainStyledAttributes2.getString(14);
                    boolean z4 = string3 != null;
                    if (z4 && cVar.f1967w == 0 && cVar.f1968x == null) {
                        if (cVar.a(string3, f1972f, dVar.f1974b) != null) {
                            throw new ClassCastException();
                        }
                    } else if (z4) {
                        Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                    }
                    cVar.f1970z = typedArrayObtainStyledAttributes2.getText(17);
                    cVar.f1942A = typedArrayObtainStyledAttributes2.getText(22);
                    if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                        cVar.f1944C = AbstractC0127y.d(typedArrayObtainStyledAttributes2.getInt(19, -1), cVar.f1944C);
                    } else {
                        cVar.f1944C = null;
                    }
                    if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                        if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = b.b(context, resourceId)) == null) {
                            colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                        }
                        cVar.f1943B = colorStateList;
                    } else {
                        cVar.f1943B = null;
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                    cVar.f1953h = false;
                } else if (name3.equals("menu")) {
                    cVar.f1953h = true;
                    SubMenu subMenuAddSubMenu = cVar.f1946a.addSubMenu(cVar.f1947b, cVar.f1954i, cVar.f1955j, cVar.f1956k);
                    cVar.b(subMenuAddSubMenu.getItem());
                    b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                } else {
                    str = name3;
                    z3 = true;
                }
            }
            eventType = xmlResourceParser.next();
            r4 = 1;
            i2 = 2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i2, Menu menu) {
        if (!(menu instanceof j)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f1975c.getResources().getLayout(i2);
                    b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (IOException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
