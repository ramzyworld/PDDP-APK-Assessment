package V0;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1015a = 0;

    static {
        Object objL;
        Object objL2;
        Exception exc = new Exception();
        String simpleName = p000a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objL = B0.b.class.getCanonicalName();
        } catch (Throwable th) {
            objL = p000a.a.l(th);
        }
        if (p041x0.d.a(objL) != null) {
            objL = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objL2 = w.class.getCanonicalName();
        } catch (Throwable th2) {
            objL2 = p000a.a.l(th2);
        }
        if (p041x0.d.a(objL2) != null) {
            objL2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
