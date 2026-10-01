package G;

import java.io.FileInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class T extends B0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f152h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FileInputStream f153i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f154j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ U f155k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f156l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u2, B0.b bVar) {
        super(bVar);
        this.f155k = u2;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        this.f154j = obj;
        this.f156l |= Integer.MIN_VALUE;
        return U.a(this.f155k, this);
    }
}
