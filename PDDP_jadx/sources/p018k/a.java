package p018k;

import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p000a.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile a f2789f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f2790e;

    public a(int i2) {
        switch (i2) {
            case 1:
                this.f2790e = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.f2790e = new a(1);
                break;
        }
    }
}
