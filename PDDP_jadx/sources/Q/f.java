package Q;

import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes.dex */
public final class f implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p031r.d[] f605a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f2, Object obj, Object obj2) {
        p031r.d[] dVarArr = (p031r.d[]) obj;
        p031r.d[] dVarArr2 = (p031r.d[]) obj2;
        if (!p000a.a.b(dVarArr, dVarArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!p000a.a.b(this.f605a, dVarArr)) {
            this.f605a = p000a.a.o(dVarArr);
        }
        for (int i2 = 0; i2 < dVarArr.length; i2++) {
            p031r.d dVar = this.f605a[i2];
            p031r.d dVar2 = dVarArr[i2];
            p031r.d dVar3 = dVarArr2[i2];
            dVar.getClass();
            dVar.f3040a = dVar2.f3040a;
            int i3 = 0;
            while (true) {
                float[] fArr = dVar2.f3041b;
                if (i3 < fArr.length) {
                    dVar.f3041b[i3] = (dVar3.f3041b[i3] * f2) + ((1.0f - f2) * fArr[i3]);
                    i3++;
                }
            }
        }
        return this.f605a;
    }
}
