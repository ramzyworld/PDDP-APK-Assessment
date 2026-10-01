package p037u0;

import B0.b;
import J.d;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class v extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public J f3182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Set f3183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map f3184j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Iterator f3185k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f3186l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f3187m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ J f3188n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3189o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(J j2, b bVar) {
        super(bVar);
        this.f3188n = j2;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        this.f3187m = obj;
        this.f3189o |= Integer.MIN_VALUE;
        return J.s(this.f3188n, null, this);
    }
}
