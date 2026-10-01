package N;

/* JADX INFO: renamed from: N.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0038n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f535c;

    public String toString() {
        switch (this.f533a) {
            case 0:
                return "LayoutState{mAvailable=0, mCurrentPosition=0, mItemDirection=0, mLayoutDirection=0, mStartLine=" + this.f534b + ", mEndLine=" + this.f535c + '}';
            default:
                return super.toString();
        }
    }

    public C0038n(int i2, int i3) {
        this.f533a = 1;
        this.f534b = i2;
        this.f535c = i3;
    }
}
