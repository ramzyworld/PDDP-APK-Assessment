package G;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: G.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0014o extends I0.j implements H0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ S f264g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0014o(S s2, int i2) {
        super(0);
        this.f263f = i2;
        this.f264g = s2;
    }

    @Override // H0.a
    public final Object f() throws IOException {
        switch (this.f263f) {
            case 0:
                return ((a0) this.f264g.f149n.a()).f180b;
            default:
                X x2 = this.f264g.f140e;
                File canonicalFile = ((File) x2.f165b.f()).getCanonicalFile();
                synchronized (X.f163d) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = X.f162c;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    I0.i.d(absolutePath, "path");
                    linkedHashSet.add(absolutePath);
                }
                return new a0(canonicalFile, (l0) x2.f164a.j(canonicalFile), new W(0, canonicalFile));
        }
    }
}
