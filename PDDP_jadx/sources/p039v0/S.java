package p039v0;

import H0.l;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import java.util.Objects;
import p038v.d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class S implements l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ U f3277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ JsResult f3278g;

    public /* synthetic */ S(U u2, JsResult jsResult, int i2) {
        this.f3276e = i2;
        this.f3277f = u2;
        this.f3278g = jsResult;
    }

    @Override // H0.l
    public final Object j(Object obj) {
        N n2 = (N) obj;
        switch (this.f3276e) {
            case 0:
                U u2 = this.f3277f;
                u2.getClass();
                if (!n2.f3263d) {
                    boolean zEquals = Boolean.TRUE.equals(n2.f3261b);
                    JsResult jsResult = this.f3278g;
                    if (!zEquals) {
                        jsResult.cancel();
                    } else {
                        jsResult.confirm();
                    }
                } else {
                    d dVar = u2.f3283b.f3364a;
                    Throwable th = n2.f3262c;
                    Objects.requireNonNull(th);
                    dVar.getClass();
                    d.b(th);
                }
                break;
            case 1:
                U u3 = this.f3277f;
                u3.getClass();
                if (!n2.f3263d) {
                    this.f3278g.confirm();
                } else {
                    d dVar2 = u3.f3283b.f3364a;
                    Throwable th2 = n2.f3262c;
                    Objects.requireNonNull(th2);
                    dVar2.getClass();
                    d.b(th2);
                }
                break;
            default:
                U u4 = this.f3277f;
                u4.getClass();
                if (!n2.f3263d) {
                    String str = (String) n2.f3261b;
                    JsPromptResult jsPromptResult = (JsPromptResult) this.f3278g;
                    if (str == null) {
                        jsPromptResult.cancel();
                    } else {
                        jsPromptResult.confirm(str);
                    }
                } else {
                    d dVar3 = u4.f3283b.f3364a;
                    Throwable th3 = n2.f3262c;
                    Objects.requireNonNull(th3);
                    dVar3.getClass();
                    d.b(th3);
                }
                break;
        }
        return null;
    }
}
