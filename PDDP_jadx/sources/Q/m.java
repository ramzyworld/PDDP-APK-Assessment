package Q;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p031r.d[] f630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f632c;

    public m() {
        this.f630a = null;
        this.f632c = 0;
    }

    public p031r.d[] getPathData() {
        return this.f630a;
    }

    public String getPathName() {
        return this.f631b;
    }

    public void setPathData(p031r.d[] dVarArr) {
        if (!p000a.a.b(this.f630a, dVarArr)) {
            this.f630a = p000a.a.o(dVarArr);
            return;
        }
        p031r.d[] dVarArr2 = this.f630a;
        for (int i2 = 0; i2 < dVarArr.length; i2++) {
            dVarArr2[i2].f3040a = dVarArr[i2].f3040a;
            int i3 = 0;
            while (true) {
                float[] fArr = dVarArr[i2].f3041b;
                if (i3 < fArr.length) {
                    dVarArr2[i2].f3041b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public m(m mVar) {
        this.f630a = null;
        this.f632c = 0;
        this.f631b = mVar.f631b;
        this.f630a = p000a.a.o(mVar.f630a);
    }
}
