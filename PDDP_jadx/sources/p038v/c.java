package p038v;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p011g0.F;
import p029q.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3206a = new a();

    /* JADX WARN: Code duplicated, block: B:62:0x016d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0170 A[Catch: all -> 0x0177, TryCatch #2 {all -> 0x0177, blocks: (B:35:0x00e0, B:36:0x00fc, B:37:0x00ff, B:41:0x010b, B:45:0x0112, B:57:0x0138, B:59:0x013e, B:60:0x0167, B:64:0x0170, B:69:0x017d, B:72:0x0188, B:76:0x019e, B:79:0x01ab, B:83:0x01b6, B:74:0x0193, B:47:0x011b, B:51:0x0127, B:55:0x012e), top: B:101:0x00e0, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0179  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d A[Catch: all -> 0x0177, TryCatch #2 {all -> 0x0177, blocks: (B:35:0x00e0, B:36:0x00fc, B:37:0x00ff, B:41:0x010b, B:45:0x0112, B:57:0x0138, B:59:0x013e, B:60:0x0167, B:64:0x0170, B:69:0x017d, B:72:0x0188, B:76:0x019e, B:79:0x01ab, B:83:0x01b6, B:74:0x0193, B:47:0x011b, B:51:0x0127, B:55:0x012e), top: B:101:0x00e0, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0184  */
    /* JADX WARN: Code duplicated, block: B:72:0x0188 A[Catch: all -> 0x0177, TryCatch #2 {all -> 0x0177, blocks: (B:35:0x00e0, B:36:0x00fc, B:37:0x00ff, B:41:0x010b, B:45:0x0112, B:57:0x0138, B:59:0x013e, B:60:0x0167, B:64:0x0170, B:69:0x017d, B:72:0x0188, B:76:0x019e, B:79:0x01ab, B:83:0x01b6, B:74:0x0193, B:47:0x011b, B:51:0x0127, B:55:0x012e), top: B:101:0x00e0, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0193 A[Catch: all -> 0x0177, TryCatch #2 {all -> 0x0177, blocks: (B:35:0x00e0, B:36:0x00fc, B:37:0x00ff, B:41:0x010b, B:45:0x0112, B:57:0x0138, B:59:0x013e, B:60:0x0167, B:64:0x0170, B:69:0x017d, B:72:0x0188, B:76:0x019e, B:79:0x01ab, B:83:0x01b6, B:74:0x0193, B:47:0x011b, B:51:0x0127, B:55:0x012e), top: B:101:0x00e0, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x019e A[Catch: all -> 0x0177, TryCatch #2 {all -> 0x0177, blocks: (B:35:0x00e0, B:36:0x00fc, B:37:0x00ff, B:41:0x010b, B:45:0x0112, B:57:0x0138, B:59:0x013e, B:60:0x0167, B:64:0x0170, B:69:0x017d, B:72:0x0188, B:76:0x019e, B:79:0x01ab, B:83:0x01b6, B:74:0x0193, B:47:0x011b, B:51:0x0127, B:55:0x012e), top: B:101:0x00e0, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c2  */
    public static F a(Context context, d dVar) throws PackageManager.NameNotFoundException {
        Cursor cursor;
        Cursor cursorQuery;
        int columnIndex;
        int columnIndex2;
        int columnIndex3;
        int columnIndex4;
        int columnIndex5;
        int columnIndex6;
        int i2;
        int i3;
        Uri uriWithAppendedId;
        int i4;
        boolean z2;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) dVar.f3208b;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: ".concat(str));
        }
        String str2 = providerInfoResolveContentProvider.packageName;
        String str3 = (String) dVar.f3209c;
        if (!str2.equals(str3)) {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str3);
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        a aVar = f3206a;
        Collections.sort(arrayList, aVar);
        List listJ = (List) dVar.f3212f;
        if (listJ == null) {
            listJ = b.j(resources, 0);
        }
        int i5 = 0;
        loop1: while (true) {
            cursor = null;
            if (i5 >= listJ.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) listJ.get(i5));
            Collections.sort(arrayList2, aVar);
            if (arrayList.size() == arrayList2.size()) {
                int i6 = 0;
                while (true) {
                    if (i6 >= arrayList.size()) {
                        break loop1;
                    }
                    if (!Arrays.equals((byte[]) arrayList.get(i6), (byte[]) arrayList2.get(i6))) {
                        break;
                    }
                    i6++;
                }
            }
            i5++;
        }
        if (providerInfoResolveContentProvider == null) {
            return new F(1, null);
        }
        String str4 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str4).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
        b bVar = Build.VERSION.SDK_INT < 24 ? new b(context, uriBuild, 0) : new b(context, uriBuild, 1);
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            String[] strArr2 = {(String) dVar.f3210d};
            switch (bVar.f3204a) {
                case 0:
                    cursorQuery = null;
                    ContentProviderClient contentProviderClient = bVar.f3205b;
                    if (contentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e2) {
                            Log.w("FontsProvider", "Unable to query the content provider", e2);
                        }
                        break;
                    }
                    cursor = cursorQuery;
                    if (cursor != null && cursor.getCount() > 0) {
                        columnIndex = cursor.getColumnIndex("result_code");
                        arrayList3 = new ArrayList();
                        columnIndex2 = cursor.getColumnIndex("_id");
                        columnIndex3 = cursor.getColumnIndex("file_id");
                        columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        columnIndex5 = cursor.getColumnIndex("font_weight");
                        columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            if (columnIndex != -1) {
                                i2 = cursor.getInt(columnIndex);
                            } else {
                                i2 = 0;
                            }
                            if (columnIndex4 != -1) {
                                i3 = cursor.getInt(columnIndex4);
                            } else {
                                i3 = 0;
                            }
                            if (columnIndex3 == -1) {
                                uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursor.getLong(columnIndex2));
                            } else {
                                uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursor.getLong(columnIndex3));
                            }
                            Uri uri = uriWithAppendedId;
                            if (columnIndex5 != -1) {
                                i4 = cursor.getInt(columnIndex5);
                            } else {
                                i4 = 400;
                            }
                            if (columnIndex6 == -1 && cursor.getInt(columnIndex6) == 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            arrayList3.add(new i(uri, i3, i4, z2, i2));
                            break;
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    bVar.a();
                    return new F(0, (i[]) arrayList3.toArray(new i[0]));
                default:
                    cursorQuery = null;
                    ContentProviderClient contentProviderClient2 = bVar.f3205b;
                    if (contentProviderClient2 != null) {
                        try {
                            cursorQuery = contentProviderClient2.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e3) {
                            Log.w("FontsProvider", "Unable to query the content provider", e3);
                        }
                        break;
                    }
                    cursor = cursorQuery;
                    if (cursor != null) {
                        columnIndex = cursor.getColumnIndex("result_code");
                        arrayList3 = new ArrayList();
                        columnIndex2 = cursor.getColumnIndex("_id");
                        columnIndex3 = cursor.getColumnIndex("file_id");
                        columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        columnIndex5 = cursor.getColumnIndex("font_weight");
                        columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            if (columnIndex != -1) {
                                i2 = cursor.getInt(columnIndex);
                            } else {
                                i2 = 0;
                            }
                            if (columnIndex4 != -1) {
                                i3 = cursor.getInt(columnIndex4);
                            } else {
                                i3 = 0;
                            }
                            if (columnIndex3 == -1) {
                                uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursor.getLong(columnIndex2));
                            } else {
                                uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursor.getLong(columnIndex3));
                            }
                            Uri uri2 = uriWithAppendedId;
                            if (columnIndex5 != -1) {
                                i4 = cursor.getInt(columnIndex5);
                            } else {
                                i4 = 400;
                            }
                            if (columnIndex6 == -1) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            arrayList3.add(new i(uri2, i3, i4, z2, i2));
                            break;
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    bVar.a();
                    return new F(0, (i[]) arrayList3.toArray(new i[0]));
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            bVar.a();
            throw th;
        }
    }
}
