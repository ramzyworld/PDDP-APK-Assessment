package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class s extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f2368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A f2369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f2370c;

    public s(Context context, A a2, Context context2) {
        super(context);
        this.f2368a = a2;
        this.f2370c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i2 = 0; i2 < stackTrace.length && i2 < 11; i2++) {
            if (stackTrace[i2].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i2].getMethodName().equals("<init>")) {
                return this.f2370c.getSystemService(str);
            }
        }
        if (this.f2369b == null) {
            this.f2369b = this.f2368a;
        }
        return this.f2369b;
    }
}
