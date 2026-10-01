package V;

import android.util.Log;
import java.util.ArrayList;
import p043y0.l;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f957d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public f(Object obj, String str, a aVar, int i2) {
        I0.i.e(obj, "value");
        I0.h.h("verificationMode", i2);
        this.f954a = obj;
        this.f955b = str;
        this.f956c = i2;
        String strB = g.b(obj, str);
        I0.i.e(strB, "message");
        j jVar = new j(strB);
        StackTraceElement[] stackTrace = jVar.getStackTrace();
        I0.i.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(("Requested element count " + length + " is less than zero.").toString());
        }
        ?? arrayList = l.f3483e;
        if (length != 0) {
            int length2 = stackTrace.length;
            if (length >= length2) {
                int length3 = stackTrace.length;
                if (length3 != 0) {
                    arrayList = length3 != 1 ? new ArrayList(new p043y0.a(stackTrace, false)) : a1.a.t(stackTrace[0]);
                }
            } else if (length == 1) {
                arrayList = a1.a.t(stackTrace[length2 - 1]);
            } else {
                arrayList = new ArrayList(length);
                for (int i3 = length2 - length; i3 < length2; i3++) {
                    arrayList.add(stackTrace[i3]);
                }
            }
        }
        jVar.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        this.f957d = jVar;
    }

    @Override // V.g
    public final Object a() throws j {
        int iB = I.j.b(this.f956c);
        if (iB == 0) {
            throw this.f957d;
        }
        if (iB != 1) {
            if (iB == 2) {
                return null;
            }
            throw new O.c();
        }
        String strB = g.b(this.f954a, this.f955b);
        I0.i.e(strB, "message");
        Log.d("f", strB);
        return null;
    }

    @Override // V.g
    public final g d(String str, H0.l lVar) {
        return this;
    }
}
