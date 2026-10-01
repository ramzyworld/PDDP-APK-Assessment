package L;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H.a f386a = new H.a(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f387b = {112, 114, 111, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f388c = {112, 114, 109, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f389d = {48, 49, 53, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f390e = {48, 49, 48, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f391f = {48, 48, 57, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f392g = {48, 48, 53, 0};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f393h = {48, 48, 49, 0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f394i = {48, 48, 49, 0};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f395j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static byte[] b(d[] dVarArr, byte[] bArr) throws IOException {
        int length = 0;
        for (d dVar : dVarArr) {
            length += ((((dVar.f383g * 2) + 7) & (-8)) / 8) + (dVar.f381e * 2) + d(bArr, dVar.f377a, dVar.f378b).getBytes(StandardCharsets.UTF_8).length + 16 + dVar.f382f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f391f)) {
            for (d dVar2 : dVarArr) {
                p(byteArrayOutputStream, dVar2, d(bArr, dVar2.f377a, dVar2.f378b));
                r(byteArrayOutputStream, dVar2);
                int[] iArr = dVar2.f384h;
                int length2 = iArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length2) {
                    int i4 = iArr[i2];
                    u(byteArrayOutputStream, i4 - i3);
                    i2++;
                    i3 = i4;
                }
                q(byteArrayOutputStream, dVar2);
            }
        } else {
            for (d dVar3 : dVarArr) {
                p(byteArrayOutputStream, dVar3, d(bArr, dVar3.f377a, dVar3.f378b));
            }
            for (d dVar4 : dVarArr) {
                r(byteArrayOutputStream, dVar4);
                int[] iArr2 = dVar4.f384h;
                int length3 = iArr2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length3) {
                    int i7 = iArr2[i5];
                    u(byteArrayOutputStream, i7 - i6);
                    i5++;
                    i6 = i7;
                }
                q(byteArrayOutputStream, dVar4);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z2 = true;
        for (File file2 : fileArrListFiles) {
            z2 = c(file2) && z2;
        }
        return z2;
    }

    public static String d(byte[] bArr, String str, String str2) {
        byte[] bArr2 = f393h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f392g;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            return ":".equals(obj) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            return ":".equals(obj) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append((Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!");
        sb.append(str2);
        return sb.toString();
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i3, i2 - i3);
            if (i4 < 0) {
                throw new IllegalStateException("Not enough bytes to read: " + i2);
            }
            i3 += i4;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int iM = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iM += (int) m(byteArrayInputStream, 2);
            iArr[i3] = iM;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int i5 = fileInputStream.read(bArr2);
                if (i5 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, i5);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i3 - iInflate);
                    i4 += i5;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            if (i4 == i2) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static d[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, d[] dVarArr) throws IOException {
        byte[] bArr3 = f394i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f395j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM = (int) m(fileInputStream, 2);
            byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
            try {
                d[] dVarArrK = k(byteArrayInputStream, bArr2, iM, dVarArr);
                byteArrayInputStream.close();
                return dVarArrK;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f389d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM2 = (int) m(fileInputStream, 1);
        byte[] bArrH2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrH2);
        try {
            d[] dVarArrJ = j(byteArrayInputStream2, iM2, dVarArr);
            byteArrayInputStream2.close();
            return dVarArrJ;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static d[] j(ByteArrayInputStream byteArrayInputStream, int i2, d[] dVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new d[0];
        }
        if (i2 != dVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iM = (int) m(byteArrayInputStream, 2);
            iArr[i3] = (int) m(byteArrayInputStream, 2);
            strArr[i3] = new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            d dVar = dVarArr[i4];
            if (!dVar.f378b.equals(strArr[i4])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i5 = iArr[i4];
            dVar.f381e = i5;
            dVar.f384h = g(byteArrayInputStream, i5);
        }
        return dVarArr;
    }

    public static d[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, d[] dVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new d[0];
        }
        if (i2 != dVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM = m(byteArrayInputStream, 4);
            int iM = (int) m(byteArrayInputStream, 2);
            d dVar = null;
            if (dVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i4 = 0; i4 < dVarArr.length; i4++) {
                    if (dVarArr[i4].f378b.equals(strSubstring)) {
                        dVar = dVarArr[i4];
                        break;
                    }
                }
            }
            if (dVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            dVar.f380d = jM;
            int[] iArrG = g(byteArrayInputStream, iM);
            if (Arrays.equals(bArr, f393h)) {
                dVar.f381e = iM;
                dVar.f384h = iArrG;
            }
        }
        return dVarArr;
    }

    public static d[] l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f390e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM = (int) m(fileInputStream, 1);
        byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
        try {
            d[] dVarArrN = n(byteArrayInputStream, str, iM);
            byteArrayInputStream.close();
            return dVarArrN;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i2) throws IOException {
        byte[] bArrF = f(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += ((long) (bArrF[i3] & 255)) << (i3 * 8);
        }
        return j2;
    }

    public static d[] n(ByteArrayInputStream byteArrayInputStream, String str, int i2) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new d[0];
        }
        d[] dVarArr = new d[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iM = (int) m(byteArrayInputStream, 2);
            int iM2 = (int) m(byteArrayInputStream, 2);
            dVarArr[i3] = new d(str, new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), iM2, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[iM2], new TreeMap());
        }
        for (int i4 = 0; i4 < i2; i4++) {
            d dVar = dVarArr[i4];
            int iAvailable = byteArrayInputStream.available() - dVar.f382f;
            int iM3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = dVar.f385i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iM3 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM3), 1);
                for (int iM4 = (int) m(byteArrayInputStream, 2); iM4 > 0; iM4--) {
                    m(byteArrayInputStream, 2);
                    int iM5 = (int) m(byteArrayInputStream, 1);
                    if (iM5 != 6 && iM5 != 7) {
                        while (iM5 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int iM6 = (int) m(byteArrayInputStream, 1); iM6 > 0; iM6--) {
                                m(byteArrayInputStream, 2);
                            }
                            iM5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            dVar.f384h = g(byteArrayInputStream, dVar.f381e);
            int i5 = dVar.f383g;
            BitSet bitSetValueOf = BitSet.valueOf(f(byteArrayInputStream, (((i5 * 2) + 7) & (-8)) / 8));
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = bitSetValueOf.get(i6) ? 2 : 0;
                if (bitSetValueOf.get(i6 + i5)) {
                    i7 |= 4;
                }
                if (i7 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i6));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i6), Integer.valueOf(i7 | num.intValue()));
                }
            }
        }
        return dVarArr;
    }

    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, d[] dVarArr) throws IOException {
        long j2;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f389d;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f390e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrB = b(dVarArr, bArr3);
                t(byteArrayOutputStream, dVarArr.length, 1);
                t(byteArrayOutputStream, bArrB.length, 4);
                byte[] bArrA = a(bArrB);
                t(byteArrayOutputStream, bArrA.length, 4);
                byteArrayOutputStream.write(bArrA);
                return true;
            }
            byte[] bArr4 = f392g;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, dVarArr.length, 1);
                for (d dVar : dVarArr) {
                    int size = dVar.f385i.size() * 4;
                    String strD = d(bArr4, dVar.f377a, dVar.f378b);
                    Charset charset = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, strD.getBytes(charset).length);
                    u(byteArrayOutputStream, dVar.f384h.length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, dVar.f379c, 4);
                    byteArrayOutputStream.write(strD.getBytes(charset));
                    Iterator it = dVar.f385i.keySet().iterator();
                    while (it.hasNext()) {
                        u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        u(byteArrayOutputStream, 0);
                    }
                    for (int i3 : dVar.f384h) {
                        u(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr5 = f391f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrB2 = b(dVarArr, bArr5);
                t(byteArrayOutputStream, dVarArr.length, 1);
                t(byteArrayOutputStream, bArrB2.length, 4);
                byte[] bArrA2 = a(bArrB2);
                t(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr6 = f393h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, dVarArr.length);
            for (d dVar2 : dVarArr) {
                String strD2 = d(bArr6, dVar2.f377a, dVar2.f378b);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, strD2.getBytes(charset2).length);
                TreeMap treeMap = dVar2.f385i;
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, dVar2.f384h.length);
                t(byteArrayOutputStream, dVar2.f379c, 4);
                byteArrayOutputStream.write(strD2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : dVar2.f384h) {
                    u(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            u(byteArrayOutputStream2, dVarArr.length);
            int i5 = 2;
            int i6 = 2;
            for (d dVar3 : dVarArr) {
                t(byteArrayOutputStream2, dVar3.f379c, 4);
                t(byteArrayOutputStream2, dVar3.f380d, 4);
                t(byteArrayOutputStream2, dVar3.f383g, 4);
                String strD3 = d(bArr2, dVar3.f377a, dVar3.f378b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strD3.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(strD3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            q qVar = new q(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(qVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < dVarArr.length) {
                try {
                    d dVar4 = dVarArr[i7];
                    u(byteArrayOutputStream3, i7);
                    u(byteArrayOutputStream3, dVar4.f381e);
                    i8 = i8 + 4 + (dVar4.f381e * 2);
                    int[] iArr = dVar4.f384h;
                    int length3 = iArr.length;
                    int i9 = 0;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        u(byteArrayOutputStream3, i10 - i9);
                        i2++;
                        i9 = i10;
                    }
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            q qVar2 = new q(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(qVar2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < dVarArr.length) {
                try {
                    d dVar5 = dVarArr[i11];
                    Iterator it3 = dVar5.f385i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        q(byteArrayOutputStream5, dVar5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            r(byteArrayOutputStream6, dVar5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            u(byteArrayOutputStream4, i11);
                            int length4 = byteArray3.length + i5 + byteArray4.length;
                            int i13 = i12 + 6;
                            ArrayList arrayList4 = arrayList3;
                            t(byteArrayOutputStream4, length4, 4);
                            u(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i12 = i13 + length4;
                            i11++;
                            arrayList3 = arrayList4;
                            i5 = 2;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            q qVar3 = new q(4, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList2.add(qVar3);
            long j3 = 4;
            long size2 = j3 + j3 + 4 + ((long) (arrayList2.size() * 16));
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i14 = 0;
            while (i14 < arrayList2.size()) {
                q qVar4 = (q) arrayList2.get(i14);
                int i15 = qVar4.f409a;
                if (i15 == 1) {
                    j2 = 0;
                } else if (i15 == 2) {
                    j2 = 1;
                } else if (i15 == 3) {
                    j2 = 2;
                } else if (i15 == 4) {
                    j2 = 3;
                } else {
                    if (i15 != 5) {
                        throw null;
                    }
                    j2 = 4;
                }
                t(byteArrayOutputStream, j2, 4);
                t(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = qVar4.f410b;
                if (qVar4.f411c) {
                    long length5 = bArr7.length;
                    byte[] bArrA3 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA3);
                    t(byteArrayOutputStream, bArrA3.length, 4);
                    t(byteArrayOutputStream, length5, 4);
                    length = bArrA3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    t(byteArrayOutputStream, bArr7.length, 4);
                    t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i14++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i16));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, d dVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, dVar.f381e);
        t(byteArrayOutputStream, dVar.f382f, 4);
        t(byteArrayOutputStream, dVar.f379c, 4);
        t(byteArrayOutputStream, dVar.f383g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, d dVar) throws IOException {
        byte[] bArr = new byte[(((dVar.f383g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : dVar.f385i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i2 = iIntValue / 8;
                bArr[i2] = (byte) (bArr[i2] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i3 = iIntValue + dVar.f383g;
                int i4 = i3 / 8;
                bArr[i4] = (byte) ((1 << (i3 % 8)) | bArr[i4]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, d dVar) throws IOException {
        int i2 = 0;
        for (Map.Entry entry : dVar.f385i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, iIntValue - i2);
                u(byteArrayOutputStream, 0);
                i2 = iIntValue;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x018b A[Catch: all -> 0x01a1, TRY_LEAVE, TryCatch #1 {all -> 0x01a1, blocks: (B:101:0x017f, B:103:0x018b, B:114:0x01a4, B:115:0x01a9), top: B:237:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:114:0x01a4 A[Catch: all -> 0x01a1, TRY_ENTER, TryCatch #1 {all -> 0x01a1, blocks: (B:101:0x017f, B:103:0x018b, B:114:0x01a4, B:115:0x01a9), top: B:237:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:122:0x01b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x01b6 A[Catch: IllegalStateException -> 0x019a, IOException -> 0x019c, FileNotFoundException -> 0x019f, TRY_LEAVE, TryCatch #29 {FileNotFoundException -> 0x019f, IOException -> 0x019c, IllegalStateException -> 0x019a, blocks: (B:99:0x0177, B:104:0x0195, B:123:0x01b6, B:121:0x01b3, B:120:0x01b0), top: B:278:0x0177 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x01cd A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:134:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01f0 A[Catch: all -> 0x01ff, TRY_LEAVE, TryCatch #20 {all -> 0x01ff, blocks: (B:140:0x01e4, B:142:0x01f0, B:151:0x0202), top: B:255:0x01e4, outer: #32 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0202 A[Catch: all -> 0x01ff, TRY_ENTER, TRY_LEAVE, TryCatch #20 {all -> 0x01ff, blocks: (B:140:0x01e4, B:142:0x01f0, B:151:0x0202), top: B:255:0x01e4, outer: #32 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x0220  */
    /* JADX WARN: Code duplicated, block: B:167:0x022a  */
    /* JADX WARN: Code duplicated, block: B:168:0x022e  */
    /* JADX WARN: Code duplicated, block: B:176:0x0248 A[Catch: all -> 0x026b, TRY_LEAVE, TryCatch #10 {all -> 0x026b, blocks: (B:173:0x0240, B:174:0x0242, B:176:0x0248), top: B:240:0x0240 }] */
    /* JADX WARN: Code duplicated, block: B:219:0x029a  */
    /* JADX WARN: Code duplicated, block: B:222:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:227:0x02b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:229:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:237:0x017f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x0232 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x01df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x0177 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x024d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0161  */
    public static void s(Context context, Executor executor, f fVar, boolean z2) throws Throwable {
        byte[] bArr;
        FileInputStream fileInputStreamA;
        IOException iOException;
        int i2;
        d[] dVarArrL;
        d[] dVarArr;
        c cVar;
        f fVar2;
        d[] dVarArr2;
        byte[] bArr2;
        boolean z3;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        Throwable th;
        byte[] bArr3;
        int i3;
        byte[] bArr4;
        ByteArrayOutputStream byteArrayOutputStream;
        int i4;
        FileInputStream fileInputStreamA2;
        boolean z4;
        boolean z5;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z2) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j2 = dataInputStream.readLong();
                            dataInputStream.close();
                            z5 = j2 == packageInfo.lastUpdateTime;
                            if (z5) {
                                fVar.h(2, null);
                            }
                        } catch (Throwable th2) {
                            try {
                                dataInputStream.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (IOException unused) {
                        z5 = false;
                    }
                } else {
                    z5 = false;
                }
                if (z5) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    p.c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i5 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            c cVar2 = new c(assets, executor, fVar, name, file2);
            byte[] bArr5 = cVar2.f371c;
            if (bArr5 == null) {
                cVar2.b(3, Integer.valueOf(i5));
            } else {
                try {
                    try {
                        if (file2.exists()) {
                            if (!file2.canWrite()) {
                                cVar2.b(4, null);
                            }
                            if (z3 || !z2) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            p.c(context, z4);
                        }
                        try {
                            file2.createNewFile();
                        } catch (IOException unused2) {
                            cVar2.b(4, null);
                            z3 = false;
                        }
                        fileInputStreamA = cVar2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e2) {
                        fVar.h(6, e2);
                        fileInputStreamA = null;
                    } catch (IOException e3) {
                        fVar.h(7, e3);
                        fileInputStreamA = null;
                    }
                    if (fileInputStreamA != null) {
                        try {
                            if (!Arrays.equals(bArr, f(fileInputStreamA, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            dVarArrL = l(fileInputStreamA, f(fileInputStreamA, 4), cVar2.f373e);
                            try {
                                fileInputStreamA.close();
                            } catch (IOException e4) {
                                fVar.h(7, e4);
                            }
                            cVar2.f375g = dVarArrL;
                        } catch (IOException e5) {
                            i2 = 7;
                            fVar.h(7, e5);
                            try {
                                fileInputStreamA.close();
                            } catch (IOException e6) {
                                iOException = e6;
                                fVar.h(i2, iOException);
                                dVarArrL = null;
                                cVar2.f375g = dVarArrL;
                                dVarArr = cVar2.f375g;
                                if (dVarArr != null) {
                                    cVar = cVar2;
                                } else {
                                    cVar = cVar2;
                                }
                                fVar2 = cVar.f370b;
                                dVarArr2 = cVar.f375g;
                                if (dVarArr2 != null) {
                                    if (!cVar.f374f) {
                                        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    }
                                    try {
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        try {
                                            byteArrayOutputStream.write(bArr);
                                            byteArrayOutputStream.write(bArr4);
                                            if (o(byteArrayOutputStream, bArr4, dVarArr2)) {
                                                cVar.f376h = byteArrayOutputStream.toByteArray();
                                                byteArrayOutputStream.close();
                                                cVar.f375g = null;
                                            } else {
                                                fVar2.h(5, null);
                                                cVar.f375g = null;
                                                byteArrayOutputStream.close();
                                            }
                                        } catch (Throwable th4) {
                                            try {
                                                byteArrayOutputStream.close();
                                                throw th4;
                                            } catch (Throwable th5) {
                                                th4.addSuppressed(th5);
                                                throw th4;
                                            }
                                        }
                                    } catch (IOException e7) {
                                        fVar2.h(7, e7);
                                    } catch (IllegalStateException e8) {
                                        fVar2.h(8, e8);
                                    }
                                }
                                bArr2 = cVar.f376h;
                                if (bArr2 == null) {
                                    z3 = false;
                                } else {
                                    try {
                                        if (!cVar.f374f) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        try {
                                            try {
                                                byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                                try {
                                                    fileOutputStream = new FileOutputStream(cVar.f372d);
                                                    try {
                                                        try {
                                                            bArr3 = new byte[512];
                                                            while (true) {
                                                                i3 = byteArrayInputStream.read(bArr3);
                                                                if (i3 > 0) {
                                                                    fileOutputStream.write(bArr3, 0, i3);
                                                                } else {
                                                                    try {
                                                                        cVar.b(1, null);
                                                                        fileOutputStream.close();
                                                                        byteArrayInputStream.close();
                                                                        cVar.f376h = null;
                                                                        cVar.f375g = null;
                                                                        z3 = true;
                                                                    } catch (Throwable th6) {
                                                                        th = th6;
                                                                    }
                                                                }
                                                                th = th;
                                                                try {
                                                                    fileOutputStream.close();
                                                                    throw th;
                                                                } catch (Throwable th7) {
                                                                    th.addSuppressed(th7);
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (Throwable th8) {
                                                            th = th8;
                                                            Throwable th9 = th;
                                                            try {
                                                                byteArrayInputStream.close();
                                                                throw th9;
                                                            } catch (Throwable th10) {
                                                                th9.addSuppressed(th10);
                                                                throw th9;
                                                            }
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                    }
                                                } catch (Throwable th12) {
                                                    th = th12;
                                                }
                                            } catch (FileNotFoundException e9) {
                                                e = e9;
                                                cVar.b(6, e);
                                                cVar.f376h = null;
                                                cVar.f375g = null;
                                                z3 = false;
                                            } catch (IOException e10) {
                                                e = e10;
                                                cVar.b(7, e);
                                                cVar.f376h = null;
                                                cVar.f375g = null;
                                                z3 = false;
                                            }
                                        } catch (FileNotFoundException e11) {
                                            e = e11;
                                            cVar.b(6, e);
                                            cVar.f376h = null;
                                            cVar.f375g = null;
                                            z3 = false;
                                        } catch (IOException e12) {
                                            e = e12;
                                            cVar.b(7, e);
                                            cVar.f376h = null;
                                            cVar.f375g = null;
                                            z3 = false;
                                        }
                                    } catch (Throwable th13) {
                                        cVar.f376h = null;
                                        cVar.f375g = null;
                                        throw th13;
                                    }
                                }
                                if (z3) {
                                    e(packageInfo, filesDir);
                                }
                                if (z3) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                p.c(context, z4);
                            }
                            dVarArrL = null;
                        } catch (IllegalStateException e13) {
                            try {
                                fVar.h(8, e13);
                                try {
                                    fileInputStreamA.close();
                                } catch (IOException e14) {
                                    iOException = e14;
                                    i2 = 7;
                                    fVar.h(i2, iOException);
                                    dVarArrL = null;
                                    cVar2.f375g = dVarArrL;
                                    dVarArr = cVar2.f375g;
                                    if (dVarArr != null) {
                                        cVar = cVar2;
                                    } else {
                                        cVar = cVar2;
                                    }
                                    fVar2 = cVar.f370b;
                                    dVarArr2 = cVar.f375g;
                                    if (dVarArr2 != null) {
                                        if (!cVar.f374f) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        byteArrayOutputStream.write(bArr);
                                        byteArrayOutputStream.write(bArr4);
                                        if (o(byteArrayOutputStream, bArr4, dVarArr2)) {
                                            fVar2.h(5, null);
                                            cVar.f375g = null;
                                            byteArrayOutputStream.close();
                                        } else {
                                            cVar.f376h = byteArrayOutputStream.toByteArray();
                                            byteArrayOutputStream.close();
                                            cVar.f375g = null;
                                        }
                                    }
                                    bArr2 = cVar.f376h;
                                    if (bArr2 == null) {
                                        if (!cVar.f374f) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                        fileOutputStream = new FileOutputStream(cVar.f372d);
                                        bArr3 = new byte[512];
                                        while (true) {
                                            i3 = byteArrayInputStream.read(bArr3);
                                            if (i3 > 0) {
                                                fileOutputStream.write(bArr3, 0, i3);
                                            } else {
                                                cVar.b(1, null);
                                                fileOutputStream.close();
                                                byteArrayInputStream.close();
                                                cVar.f376h = null;
                                                cVar.f375g = null;
                                                z3 = true;
                                            }
                                            th = th;
                                            fileOutputStream.close();
                                            throw th;
                                        }
                                    }
                                    z3 = false;
                                    if (z3) {
                                        e(packageInfo, filesDir);
                                    }
                                    if (z3) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    p.c(context, z4);
                                }
                                dVarArrL = null;
                            } catch (Throwable th14) {
                                th = th14;
                                Throwable th15 = th;
                                try {
                                    fileInputStreamA.close();
                                    throw th15;
                                } catch (IOException e15) {
                                    fVar.h(7, e15);
                                    throw th15;
                                }
                            }
                        }
                    }
                    dVarArr = cVar2.f375g;
                    if (dVarArr != null || (i4 = Build.VERSION.SDK_INT) < 24 || i4 > 34) {
                        cVar = cVar2;
                    } else if (i4 != 24 && i4 != 25) {
                        switch (i4) {
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                                fileInputStreamA2 = cVar2.a(assets, "dexopt/baseline.profm");
                                if (fileInputStreamA2 == null) {
                                    if (fileInputStreamA2 != null) {
                                        fileInputStreamA2.close();
                                    }
                                    cVar = null;
                                } else {
                                    if (Arrays.equals(f388c, f(fileInputStreamA2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    cVar2.f375g = i(fileInputStreamA2, f(fileInputStreamA2, 4), bArr5, dVarArr);
                                    fileInputStreamA2.close();
                                    cVar = cVar2;
                                }
                                if (cVar == null) {
                                    cVar = cVar2;
                                }
                                break;
                            default:
                                cVar = cVar2;
                                break;
                        }
                    } else {
                        try {
                            fileInputStreamA2 = cVar2.a(assets, "dexopt/baseline.profm");
                            if (fileInputStreamA2 == null) {
                                try {
                                    if (Arrays.equals(f388c, f(fileInputStreamA2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    cVar2.f375g = i(fileInputStreamA2, f(fileInputStreamA2, 4), bArr5, dVarArr);
                                    fileInputStreamA2.close();
                                    cVar = cVar2;
                                } catch (Throwable th16) {
                                    try {
                                        fileInputStreamA2.close();
                                        throw th16;
                                    } catch (Throwable th17) {
                                        th16.addSuppressed(th17);
                                        throw th16;
                                    }
                                }
                            } else {
                                if (fileInputStreamA2 != null) {
                                    fileInputStreamA2.close();
                                }
                                cVar = null;
                            }
                        } catch (FileNotFoundException e16) {
                            fVar.h(9, e16);
                        } catch (IOException e17) {
                            fVar.h(7, e17);
                        } catch (IllegalStateException e18) {
                            cVar2.f375g = null;
                            fVar.h(8, e18);
                        }
                        if (cVar == null) {
                            cVar = cVar2;
                        }
                    }
                    fVar2 = cVar.f370b;
                    dVarArr2 = cVar.f375g;
                    if (dVarArr2 != null && (bArr4 = cVar.f371c) != null) {
                        if (!cVar.f374f) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(bArr);
                        byteArrayOutputStream.write(bArr4);
                        if (o(byteArrayOutputStream, bArr4, dVarArr2)) {
                            fVar2.h(5, null);
                            cVar.f375g = null;
                            byteArrayOutputStream.close();
                        } else {
                            cVar.f376h = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            cVar.f375g = null;
                        }
                    }
                    bArr2 = cVar.f376h;
                    if (bArr2 == null) {
                        if (!cVar.f374f) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        byteArrayInputStream = new ByteArrayInputStream(bArr2);
                        fileOutputStream = new FileOutputStream(cVar.f372d);
                        bArr3 = new byte[512];
                        while (true) {
                            i3 = byteArrayInputStream.read(bArr3);
                            if (i3 > 0) {
                                fileOutputStream.write(bArr3, 0, i3);
                            } else {
                                cVar.b(1, null);
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                cVar.f376h = null;
                                cVar.f375g = null;
                                z3 = true;
                            }
                            th = th;
                            fileOutputStream.close();
                            throw th;
                        }
                    }
                    z3 = false;
                    if (z3) {
                        e(packageInfo, filesDir);
                    }
                    if (z3) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    p.c(context, z4);
                } catch (Throwable th18) {
                    th = th18;
                }
                cVar2.f374f = true;
                bArr = f387b;
            }
            z3 = false;
            if (z3) {
                z4 = false;
            } else {
                z4 = false;
            }
            p.c(context, z4);
        } catch (PackageManager.NameNotFoundException e19) {
            fVar.h(7, e19);
            p.c(context, false);
        }
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i2) throws IOException {
        t(byteArrayOutputStream, i2, 2);
    }
}
