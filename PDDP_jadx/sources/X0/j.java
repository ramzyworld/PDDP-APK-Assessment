package X0;

import Q0.AbstractC0063v;

/* JADX INFO: loaded from: classes.dex */
public final class j extends h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Runnable f1053g;

    public j(Runnable runnable, long j2, i iVar) {
        super(j2, iVar);
        this.f1053g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f1053g.run();
        } finally {
            this.f1051f.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f1053g;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0063v.b(runnable));
        sb.append(", ");
        sb.append(this.f1050e);
        sb.append(", ");
        sb.append(this.f1051f);
        sb.append(']');
        return sb.toString();
    }
}
