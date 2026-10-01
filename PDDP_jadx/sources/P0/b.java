package P0;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements O0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f581d;

    public b(String str, int i2, int i3, i iVar) {
        this.f578a = str;
        this.f579b = i2;
        this.f580c = i3;
        this.f581d = iVar;
    }

    @Override // O0.b
    public final Iterator iterator() {
        return new a(this);
    }
}
