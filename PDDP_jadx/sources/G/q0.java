package G;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements z0.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q0 f270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final S f271f;

    public q0(q0 q0Var, S s2) {
        I0.i.e(s2, "instance");
        this.f270e = q0Var;
        this.f271f = s2;
    }

    @Override // z0.i
    public final z0.i c(z0.i iVar) {
        I0.i.e(iVar, "context");
        return iVar == z0.j.f3504e ? this : (z0.i) iVar.d(this, z0.b.f3499h);
    }

    @Override // z0.i
    public final Object d(Object obj, H0.p pVar) {
        return pVar.h(obj, this);
    }

    public final void e(S s2) {
        if (this.f271f == s2) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        q0 q0Var = this.f270e;
        if (q0Var != null) {
            q0Var.e(s2);
        }
    }

    @Override // z0.i
    public final z0.g f(z0.h hVar) {
        return p000a.a.s(this, hVar);
    }

    @Override // z0.g
    public final z0.h getKey() {
        return p0.f268e;
    }

    @Override // z0.i
    public final z0.i h(z0.h hVar) {
        return p000a.a.z(this, hVar);
    }
}
