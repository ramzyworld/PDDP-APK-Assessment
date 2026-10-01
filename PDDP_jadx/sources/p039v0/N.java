package p039v0;

import p041x0.c;
import p041x0.d;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f3262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3263d;

    public N(Object obj) {
        this.f3260a = obj;
        boolean z2 = obj instanceof c;
        this.f3261b = z2 ? null : obj;
        this.f3262c = d.a(obj);
        this.f3263d = z2;
    }
}
