package p029q;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final o f3010k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f3013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f3014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f3015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f3016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f3017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f3018h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f3019i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f3020j;

    static {
        float[] fArr = b.f2985c;
        float fL = (float) ((((double) b.l()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f2983a;
        float f2 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f3 = fArr3[0] * f2;
        float f4 = fArr[1];
        float f5 = (fArr3[1] * f4) + f3;
        float f6 = fArr[2];
        float f7 = (fArr3[2] * f6) + f5;
        float[] fArr4 = fArr2[1];
        float f8 = (fArr4[2] * f6) + (fArr4[1] * f4) + (fArr4[0] * f2);
        float[] fArr5 = fArr2[2];
        float f9 = (f6 * fArr5[2]) + (f4 * fArr5[1]) + (f2 * fArr5[0]);
        float f10 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fL) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d2 = fExp;
        if (d2 > 1.0d) {
            fExp = 1.0f;
        } else if (d2 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f7) * fExp) + 1.0f) - fExp, (((100.0f / f8) * fExp) + 1.0f) - fExp, (((100.0f / f9) * fExp) + 1.0f) - fExp};
        float f11 = 1.0f / ((5.0f * fL) + 1.0f);
        float f12 = f11 * f11 * f11 * f11;
        float f13 = 1.0f - f12;
        float fCbrt = (0.1f * f13 * f13 * ((float) Math.cbrt(((double) fL) * 5.0d))) + (f12 * fL);
        float fL2 = b.l() / fArr[1];
        double d3 = fL2;
        float fSqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f7)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f8)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f9)) / 100.0d, 0.42d)};
        float f14 = fArr7[0];
        float f15 = (f14 * 400.0f) / (f14 + 27.13f);
        float f16 = fArr7[1];
        float f17 = (f16 * 400.0f) / (f16 + 27.13f);
        float f18 = fArr7[2];
        float[] fArr8 = {f15, f17, (400.0f * f18) / (f18 + 27.13f)};
        f3010k = new o(fL2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow, fPow, fPow, f10, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public o(float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr, float f8, float f9, float f10) {
        this.f3016f = f2;
        this.f3011a = f3;
        this.f3012b = f4;
        this.f3013c = f5;
        this.f3014d = f6;
        this.f3015e = f7;
        this.f3017g = fArr;
        this.f3018h = f8;
        this.f3019i = f9;
        this.f3020j = f10;
    }
}
