package G;

/* JADX INFO: loaded from: classes.dex */
public final class H extends B0.g implements H0.p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ boolean f105k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f106l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f107m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(S s2, int i2, z0.d dVar) {
        super(2, dVar);
        this.f106l = s2;
        this.f107m = i2;
    }

    @Override // B0.b
    public final z0.d b(Object obj, z0.d dVar) {
        H h2 = new H(this.f106l, this.f107m, dVar);
        h2.f105k = ((Boolean) obj).booleanValue();
        return h2;
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((H) b(bool, (z0.d) obj2)).k(p041x0.g.f3419a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    @Override // B0.b
    public final Object k(Object obj) {
        boolean z2;
        Object obj2;
        int iIntValue;
        int iHashCode;
        A0.a aVar = A0.a.f0e;
        int i2 = this.f104j;
        S s2 = this.f106l;
        if (i2 != 0) {
            if (i2 == 1) {
                z2 = this.f105k;
                p000a.a.O(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f103i;
                p000a.a.O(obj);
            }
            iIntValue = ((Number) obj).intValue();
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new C0003d(obj2, iHashCode, iIntValue);
        }
        p000a.a.O(obj);
        z2 = this.f105k;
        this.f105k = z2;
        this.f104j = 1;
        obj = s2.i(this);
        if (obj == aVar) {
            return aVar;
        }
        if (z2) {
            l0 l0VarG = s2.g();
            this.f103i = obj;
            this.f104j = 2;
            Integer numA = l0VarG.a();
            if (numA == aVar) {
                return aVar;
            }
            obj2 = obj;
            obj = numA;
            iIntValue = ((Number) obj).intValue();
        } else {
            obj2 = obj;
            iIntValue = this.f107m;
        }
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        return new C0003d(obj2, iHashCode, iIntValue);
    }
}
