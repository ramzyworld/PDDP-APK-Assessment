package Q;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Matrix f633p = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Paint f638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PathMeasure f639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f642i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f643j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f644k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f645l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f646m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f647n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p022m.a f648o;

    public n() {
        this.f636c = new Matrix();
        this.f641h = 0.0f;
        this.f642i = 0.0f;
        this.f643j = 0.0f;
        this.f644k = 0.0f;
        this.f645l = 255;
        this.f646m = null;
        this.f647n = null;
        this.f648o = new p022m.a();
        this.f640g = new k();
        this.f634a = new Path();
        this.f635b = new Path();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0139  */
    /* JADX WARN: Code duplicated, block: B:52:0x0146  */
    /* JADX WARN: Code duplicated, block: B:54:0x014a  */
    /* JADX WARN: Code duplicated, block: B:57:0x015d  */
    /* JADX WARN: Code duplicated, block: B:58:0x016f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0191  */
    /* JADX WARN: Code duplicated, block: B:62:0x0194  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:74:0x01be  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v16 */
    public final void a(k kVar, Matrix matrix, Canvas canvas, int i2, int i3) {
        Matrix matrix2;
        float f2;
        float f3;
        p029q.d dVar;
        boolean z2;
        p029q.d dVar2;
        Paint paint;
        Paint.Join join;
        Paint.Cap cap;
        Shader shader;
        Paint paint2;
        Shader shader2;
        Path.FillType fillType;
        char c2 = 1;
        kVar.f619a.set(matrix);
        Matrix matrix3 = kVar.f619a;
        matrix3.preConcat(kVar.f628j);
        canvas.save();
        ?? r11 = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = kVar.f620b;
            if (i4 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            l lVar = (l) arrayList.get(i4);
            if (lVar instanceof k) {
                a((k) lVar, matrix3, canvas, i2, i3);
            } else {
                if (lVar instanceof m) {
                    m mVar = (m) lVar;
                    float f4 = i2 / this.f643j;
                    float f5 = i3 / this.f644k;
                    float fMin = Math.min(f4, f5);
                    Matrix matrix4 = this.f636c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f4, f5);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[r11], fArr[c2]);
                    matrix2 = matrix3;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f6 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f6) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        Path path = this.f634a;
                        mVar.getClass();
                        path.reset();
                        p031r.d[] dVarArr = mVar.f630a;
                        if (dVarArr != null) {
                            p031r.d.b(dVarArr, path);
                        }
                        Path path2 = this.f635b;
                        path2.reset();
                        if (mVar instanceof i) {
                            path2.setFillType(mVar.f632c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            j jVar = (j) mVar;
                            float f7 = jVar.f613i;
                            if (f7 == 0.0f) {
                                f2 = 1.0f;
                                if (jVar.f614j != 1.0f) {
                                }
                                path2.addPath(path, matrix4);
                                dVar = jVar.f610f;
                                if (dVar.f2988a != null && dVar.f2990c == 0) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    if (this.f638e == null) {
                                        Paint paint3 = new Paint(1);
                                        this.f638e = paint3;
                                        paint3.setStyle(Paint.Style.FILL);
                                    }
                                    paint2 = this.f638e;
                                    shader2 = dVar.f2988a;
                                    if (shader2 != null) {
                                        shader2.setLocalMatrix(matrix4);
                                        paint2.setShader(shader2);
                                        paint2.setAlpha(Math.round(jVar.f612h * 255.0f));
                                    } else {
                                        paint2.setShader(null);
                                        paint2.setAlpha(255);
                                        int i5 = dVar.f2990c;
                                        float f8 = jVar.f612h;
                                        PorterDuff.Mode mode = q.f662n;
                                        paint2.setColor((i5 & 16777215) | (((int) (Color.alpha(i5) * f8)) << 24));
                                    }
                                    paint2.setColorFilter(null);
                                    if (jVar.f632c == 0) {
                                        fillType = Path.FillType.WINDING;
                                    } else {
                                        fillType = Path.FillType.EVEN_ODD;
                                    }
                                    path2.setFillType(fillType);
                                    canvas.drawPath(path2, paint2);
                                }
                                dVar2 = jVar.f608d;
                                if (dVar2.f2988a == null || dVar2.f2990c != 0) {
                                    if (this.f637d == null) {
                                        Paint paint4 = new Paint(1);
                                        this.f637d = paint4;
                                        paint4.setStyle(Paint.Style.STROKE);
                                    }
                                    paint = this.f637d;
                                    join = jVar.f617m;
                                    if (join != null) {
                                        paint.setStrokeJoin(join);
                                    }
                                    cap = jVar.f616l;
                                    if (cap != null) {
                                        paint.setStrokeCap(cap);
                                    }
                                    paint.setStrokeMiter(jVar.f618n);
                                    shader = dVar2.f2988a;
                                    if (shader != null) {
                                        shader.setLocalMatrix(matrix4);
                                        paint.setShader(shader);
                                        paint.setAlpha(Math.round(jVar.f611g * 255.0f));
                                    } else {
                                        paint.setShader(null);
                                        paint.setAlpha(255);
                                        int i6 = dVar2.f2990c;
                                        float f9 = jVar.f611g;
                                        PorterDuff.Mode mode2 = q.f662n;
                                        paint.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f9)) << 24));
                                    }
                                    paint.setColorFilter(null);
                                    paint.setStrokeWidth(jVar.f609e * fAbs * fMin);
                                    canvas.drawPath(path2, paint);
                                }
                            } else {
                                f2 = 1.0f;
                            }
                            float f10 = jVar.f615k;
                            float f11 = (f7 + f10) % f2;
                            float f12 = (jVar.f614j + f10) % f2;
                            if (this.f639f == null) {
                                this.f639f = new PathMeasure();
                            }
                            this.f639f.setPath(path, r11);
                            float length = this.f639f.getLength();
                            float f13 = f11 * length;
                            float f14 = f12 * length;
                            path.reset();
                            if (f13 > f14) {
                                this.f639f.getSegment(f13, length, path, true);
                                f3 = 0.0f;
                                this.f639f.getSegment(0.0f, f14, path, true);
                            } else {
                                f3 = 0.0f;
                                this.f639f.getSegment(f13, f14, path, true);
                            }
                            path.rLineTo(f3, f3);
                            path2.addPath(path, matrix4);
                            dVar = jVar.f610f;
                            if (dVar.f2988a != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                if (this.f638e == null) {
                                    Paint paint5 = new Paint(1);
                                    this.f638e = paint5;
                                    paint5.setStyle(Paint.Style.FILL);
                                }
                                paint2 = this.f638e;
                                shader2 = dVar.f2988a;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint2.setShader(shader2);
                                    paint2.setAlpha(Math.round(jVar.f612h * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i7 = dVar.f2990c;
                                    float f15 = jVar.f612h;
                                    PorterDuff.Mode mode3 = q.f662n;
                                    paint2.setColor((i7 & 16777215) | (((int) (Color.alpha(i7) * f15)) << 24));
                                }
                                paint2.setColorFilter(null);
                                if (jVar.f632c == 0) {
                                    fillType = Path.FillType.WINDING;
                                } else {
                                    fillType = Path.FillType.EVEN_ODD;
                                }
                                path2.setFillType(fillType);
                                canvas.drawPath(path2, paint2);
                            }
                            dVar2 = jVar.f608d;
                            if (dVar2.f2988a == null) {
                                if (this.f637d == null) {
                                    Paint paint6 = new Paint(1);
                                    this.f637d = paint6;
                                    paint6.setStyle(Paint.Style.STROKE);
                                }
                                paint = this.f637d;
                                join = jVar.f617m;
                                if (join != null) {
                                    paint.setStrokeJoin(join);
                                }
                                cap = jVar.f616l;
                                if (cap != null) {
                                    paint.setStrokeCap(cap);
                                }
                                paint.setStrokeMiter(jVar.f618n);
                                shader = dVar2.f2988a;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint.setShader(shader);
                                    paint.setAlpha(Math.round(jVar.f611g * 255.0f));
                                } else {
                                    paint.setShader(null);
                                    paint.setAlpha(255);
                                    int i8 = dVar2.f2990c;
                                    float f16 = jVar.f611g;
                                    PorterDuff.Mode mode4 = q.f662n;
                                    paint.setColor((i8 & 16777215) | (((int) (Color.alpha(i8) * f16)) << 24));
                                }
                                paint.setColorFilter(null);
                                paint.setStrokeWidth(jVar.f609e * fAbs * fMin);
                                canvas.drawPath(path2, paint);
                            } else {
                                if (this.f637d == null) {
                                    Paint paint7 = new Paint(1);
                                    this.f637d = paint7;
                                    paint7.setStyle(Paint.Style.STROKE);
                                }
                                paint = this.f637d;
                                join = jVar.f617m;
                                if (join != null) {
                                    paint.setStrokeJoin(join);
                                }
                                cap = jVar.f616l;
                                if (cap != null) {
                                    paint.setStrokeCap(cap);
                                }
                                paint.setStrokeMiter(jVar.f618n);
                                shader = dVar2.f2988a;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint.setShader(shader);
                                    paint.setAlpha(Math.round(jVar.f611g * 255.0f));
                                } else {
                                    paint.setShader(null);
                                    paint.setAlpha(255);
                                    int i9 = dVar2.f2990c;
                                    float f17 = jVar.f611g;
                                    PorterDuff.Mode mode5 = q.f662n;
                                    paint.setColor((i9 & 16777215) | (((int) (Color.alpha(i9) * f17)) << 24));
                                }
                                paint.setColorFilter(null);
                                paint.setStrokeWidth(jVar.f609e * fAbs * fMin);
                                canvas.drawPath(path2, paint);
                            }
                        }
                    }
                }
                i4++;
                matrix3 = matrix2;
                c2 = 1;
                r11 = 0;
            }
            matrix2 = matrix3;
            i4++;
            matrix3 = matrix2;
            c2 = 1;
            r11 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f645l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i2) {
        this.f645l = i2;
    }

    public n(n nVar) {
        this.f636c = new Matrix();
        this.f641h = 0.0f;
        this.f642i = 0.0f;
        this.f643j = 0.0f;
        this.f644k = 0.0f;
        this.f645l = 255;
        this.f646m = null;
        this.f647n = null;
        p022m.a aVar = new p022m.a();
        this.f648o = aVar;
        this.f640g = new k(nVar.f640g, aVar);
        this.f634a = new Path(nVar.f634a);
        this.f635b = new Path(nVar.f635b);
        this.f641h = nVar.f641h;
        this.f642i = nVar.f642i;
        this.f643j = nVar.f643j;
        this.f644k = nVar.f644k;
        this.f645l = nVar.f645l;
        this.f646m = nVar.f646m;
        String str = nVar.f646m;
        if (str != null) {
            aVar.put(str, this);
        }
        this.f647n = nVar.f647n;
    }
}
