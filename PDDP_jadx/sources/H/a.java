package H;

import I0.i;
import L.f;
import N.C0026b;
import N.Q;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.deeprf.pddp.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p014i.j;
import p014i.o;
import p014i.t;
import p015i0.b;
import p022m.c;
import p030q0.k;
import p037u0.M;

/* JADX INFO: loaded from: classes.dex */
public final class a implements f, o, k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static a f304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static a f305g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f306e;

    public /* synthetic */ a(int i2) {
        this.f306e = i2;
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static Q g(Context context, String[] strArr, String str, C0026b c0026b) {
        String[] strArrN = n(context);
        int length = strArrN.length;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i2 >= length) {
                return null;
            }
            String str2 = strArrN[i2];
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i3 = i4;
                }
            }
            if (zipFile != null) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    if (i5 >= 5) {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                            break;
                        }
                    }
                    for (String str3 : strArr) {
                        StringBuilder sb = new StringBuilder("lib");
                        char c2 = File.separatorChar;
                        sb.append(c2);
                        sb.append(str3);
                        sb.append(c2);
                        sb.append(str);
                        String string = sb.toString();
                        c0026b.getClass();
                        C0026b.H("Looking for %s in APK %s...", string, str2);
                        ZipEntry entry = zipFile.getEntry(string);
                        if (entry != null) {
                            Q q2 = new Q(7, z2);
                            q2.f471f = zipFile;
                            q2.f472g = entry;
                            return q2;
                        }
                    }
                    i5 = i6;
                }
            }
            i2++;
        }
    }

    public static String[] i(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c2 = File.separatorChar;
        sb.append(c2);
        sb.append("([^\\");
        sb.append(c2);
        sb.append("]*)");
        sb.append(c2);
        sb.append(str);
        Pattern patternCompile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : n(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str2), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static String[] n(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // p014i.o
    public boolean b(t tVar) {
        return false;
    }

    @Override // p030q0.k
    public void c(Q q2, p028p0.k kVar) {
        switch (this.f306e) {
            case 20:
                kVar.c(null);
                break;
            default:
                kVar.c(null);
                break;
        }
    }

    public List e(String str) throws ClassNotFoundException, IOException {
        switch (this.f306e) {
            case 24:
                try {
                    return (List) new M(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
                } catch (IOException | ClassNotFoundException e2) {
                    throw new RuntimeException(e2);
                }
            default:
                i.e(str, "listString");
                Object object = new M(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
                i.c(object, "null cannot be cast to non-null type kotlin.collections.List<*>");
                ArrayList arrayList = new ArrayList();
                for (Object obj : (List) object) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
        }
    }

    public String f(List list) throws IOException {
        switch (this.f306e) {
            case 24:
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(list);
                    objectOutputStream.flush();
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            default:
                i.e(list, "list");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                objectOutputStream2.writeObject(list);
                objectOutputStream2.flush();
                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 0);
                i.d(strEncodeToString, "encodeToString(byteStream.toByteArray(), 0)");
                return strEncodeToString;
        }
    }

    @Override // L.f
    public void h(int i2, Serializable serializable) {
        String str;
        switch (this.f306e) {
            case 3:
                break;
            default:
                switch (i2) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case I.k.LONG_FIELD_NUMBER /* 4 */:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case I.k.STRING_FIELD_NUMBER /* 5 */:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case I.k.BYTES_FIELD_NUMBER /* 8 */:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i2 == 6 || i2 == 7 || i2 == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) serializable);
                } else {
                    Log.d("ProfileInstaller", str);
                }
                break;
        }
    }

    @Override // L.f
    public void j() {
        switch (this.f306e) {
            case 3:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    public CharSequence m(Preference preference) {
        switch (this.f306e) {
            case 1:
                EditTextPreference editTextPreference = (EditTextPreference) preference;
                editTextPreference.getClass();
                if (TextUtils.isEmpty(null)) {
                    return editTextPreference.f1618e.getString(R.string.not_set);
                }
                return null;
            default:
                ListPreference listPreference = (ListPreference) preference;
                listPreference.getClass();
                if (TextUtils.isEmpty(null)) {
                    return listPreference.f1618e.getString(R.string.not_set);
                }
                return null;
        }
    }

    public /* synthetic */ a(int i2, Object obj) {
        this.f306e = i2;
    }

    public a() {
        this.f306e = 12;
        new p022m.a();
        new c();
    }

    public a(b bVar) {
        this.f306e = 21;
        new C0026b(bVar, "flutter/deferredcomponent", p030q0.o.f3031a, 10).N(new p028p0.b(0, this));
        C0026b.E().getClass();
        new HashMap();
    }

    private final void k() {
    }

    private final void l(int i2, Serializable serializable) {
    }

    @Override // p014i.o
    public void a(j jVar, boolean z2) {
    }
}
