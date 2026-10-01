package I0;

/* JADX INFO: loaded from: classes.dex */
public final class l extends m implements N0.c, H0.l {
    @Override // I0.c
    public final N0.a a() {
        q.f339a.getClass();
        return this;
    }

    public final void e() {
        if (this.f335k) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        N0.a aVarD = d();
        if (aVarD == this) {
            throw new G0.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((l) ((N0.c) aVarD)).e();
    }

    @Override // H0.l
    public final Object j(Object obj) {
        e();
        throw null;
    }
}
