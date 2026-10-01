package Q;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f626h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f627i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Matrix f628j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f629k;

    public k() {
        this.f619a = new Matrix();
        this.f620b = new ArrayList();
        this.f621c = 0.0f;
        this.f622d = 0.0f;
        this.f623e = 0.0f;
        this.f624f = 1.0f;
        this.f625g = 1.0f;
        this.f626h = 0.0f;
        this.f627i = 0.0f;
        this.f628j = new Matrix();
        this.f629k = null;
    }

    @Override // Q.l
    public final boolean a() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f620b;
            if (i2 >= arrayList.size()) {
                return false;
            }
            if (((l) arrayList.get(i2)).a()) {
                return true;
            }
            i2++;
        }
    }

    @Override // Q.l
    public final boolean b(int[] iArr) {
        int i2 = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f620b;
            if (i2 >= arrayList.size()) {
                return zB;
            }
            zB |= ((l) arrayList.get(i2)).b(iArr);
            i2++;
        }
    }

    public final void c() {
        Matrix matrix = this.f628j;
        matrix.reset();
        matrix.postTranslate(-this.f622d, -this.f623e);
        matrix.postScale(this.f624f, this.f625g);
        matrix.postRotate(this.f621c, 0.0f, 0.0f);
        matrix.postTranslate(this.f626h + this.f622d, this.f627i + this.f623e);
    }

    public String getGroupName() {
        return this.f629k;
    }

    public Matrix getLocalMatrix() {
        return this.f628j;
    }

    public float getPivotX() {
        return this.f622d;
    }

    public float getPivotY() {
        return this.f623e;
    }

    public float getRotation() {
        return this.f621c;
    }

    public float getScaleX() {
        return this.f624f;
    }

    public float getScaleY() {
        return this.f625g;
    }

    public float getTranslateX() {
        return this.f626h;
    }

    public float getTranslateY() {
        return this.f627i;
    }

    public void setPivotX(float f2) {
        if (f2 != this.f622d) {
            this.f622d = f2;
            c();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.f623e) {
            this.f623e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f621c) {
            this.f621c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f624f) {
            this.f624f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f625g) {
            this.f625g = f2;
            c();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.f626h) {
            this.f626h = f2;
            c();
        }
    }

    public void setTranslateY(float f2) {
        if (f2 != this.f627i) {
            this.f627i = f2;
            c();
        }
    }

    public k(k kVar, p022m.a aVar) {
        m iVar;
        this.f619a = new Matrix();
        this.f620b = new ArrayList();
        this.f621c = 0.0f;
        this.f622d = 0.0f;
        this.f623e = 0.0f;
        this.f624f = 1.0f;
        this.f625g = 1.0f;
        this.f626h = 0.0f;
        this.f627i = 0.0f;
        Matrix matrix = new Matrix();
        this.f628j = matrix;
        this.f629k = null;
        this.f621c = kVar.f621c;
        this.f622d = kVar.f622d;
        this.f623e = kVar.f623e;
        this.f624f = kVar.f624f;
        this.f625g = kVar.f625g;
        this.f626h = kVar.f626h;
        this.f627i = kVar.f627i;
        String str = kVar.f629k;
        this.f629k = str;
        if (str != null) {
            aVar.put(str, this);
        }
        matrix.set(kVar.f628j);
        ArrayList arrayList = kVar.f620b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof k) {
                this.f620b.add(new k((k) obj, aVar));
            } else {
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    j jVar2 = new j(jVar);
                    jVar2.f609e = 0.0f;
                    jVar2.f611g = 1.0f;
                    jVar2.f612h = 1.0f;
                    jVar2.f613i = 0.0f;
                    jVar2.f614j = 1.0f;
                    jVar2.f615k = 0.0f;
                    jVar2.f616l = Paint.Cap.BUTT;
                    jVar2.f617m = Paint.Join.MITER;
                    jVar2.f618n = 4.0f;
                    jVar2.f608d = jVar.f608d;
                    jVar2.f609e = jVar.f609e;
                    jVar2.f611g = jVar.f611g;
                    jVar2.f610f = jVar.f610f;
                    jVar2.f632c = jVar.f632c;
                    jVar2.f612h = jVar.f612h;
                    jVar2.f613i = jVar.f613i;
                    jVar2.f614j = jVar.f614j;
                    jVar2.f615k = jVar.f615k;
                    jVar2.f616l = jVar.f616l;
                    jVar2.f617m = jVar.f617m;
                    jVar2.f618n = jVar.f618n;
                    iVar = jVar2;
                } else if (obj instanceof i) {
                    iVar = new i((i) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f620b.add(iVar);
                Object obj2 = iVar.f631b;
                if (obj2 != null) {
                    aVar.put(obj2, iVar);
                }
            }
        }
    }
}
