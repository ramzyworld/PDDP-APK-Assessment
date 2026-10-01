package io.flutter.plugins;

import android.util.Log;
import p002b.a;
import p013h0.c;
import p037u0.J;
import p039v0.e0;

/* JADX INFO: loaded from: classes.dex */
@a
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(c cVar) {
        try {
            cVar.f1981d.a(new J());
        } catch (Exception e2) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e2);
        }
        try {
            cVar.f1981d.a(new e0());
        } catch (Exception e3) {
            Log.e(TAG, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin", e3);
        }
    }
}
