package p037u0;

import B0.b;
import z0.d;

/* JADX INFO: renamed from: u0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0141m extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3150i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0142n f3151j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0141m(C0142n c0142n, d dVar) {
        super(dVar);
        this.f3151j = c0142n;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        this.f3149h = obj;
        this.f3150i |= Integer.MIN_VALUE;
        return this.f3151j.a(null, this);
    }
}
