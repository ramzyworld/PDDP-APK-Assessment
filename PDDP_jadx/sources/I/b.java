package I;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class b extends I0.j implements H0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f310h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, Object obj, Object obj2) {
        super(0);
        this.f308f = i2;
        this.f309g = obj;
        this.f310h = obj2;
    }

    @Override // H0.a
    public final Object f() {
        switch (this.f308f) {
            case 0:
                Context context = (Context) this.f309g;
                ((c) this.f310h).getClass();
                String strConcat = "FlutterSharedPreferences".concat(".preferences_pb");
                I0.i.e(strConcat, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(strConcat));
            default:
                ((Z.a) ((Y.b) this.f309g).f1077f).a((Y.i) this.f310h);
                return p041x0.g.f3419a;
        }
    }
}
