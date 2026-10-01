package B0;

import I0.i;
import I0.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends b implements I0.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11h;

    public g(int i2, z0.d dVar) {
        super(dVar);
        this.f11h = i2;
    }

    @Override // I0.f
    public final int c() {
        return this.f11h;
    }

    @Override // B0.b
    public final String toString() {
        if (this.f3e != null) {
            return super.toString();
        }
        q.f339a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        i.d(string, "renderLambdaToString(...)");
        return string;
    }
}
