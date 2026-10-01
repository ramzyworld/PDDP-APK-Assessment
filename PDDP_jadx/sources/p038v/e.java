package p038v;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f3215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f3216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3217e;

    public /* synthetic */ e(String str, Context context, d dVar, int i2, int i3) {
        this.f3213a = i3;
        this.f3214b = str;
        this.f3215c = context;
        this.f3216d = dVar;
        this.f3217e = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f3213a) {
            case 0:
                return h.a(this.f3214b, this.f3215c, this.f3216d, this.f3217e);
            default:
                try {
                    return h.a(this.f3214b, this.f3215c, this.f3216d, this.f3217e);
                } catch (Throwable unused) {
                    return new g(-3);
                }
        }
    }
}
