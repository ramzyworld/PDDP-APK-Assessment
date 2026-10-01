package T;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f837a;

    static {
        p gVar;
        try {
            gVar = new D.j(11, (WebViewProviderFactoryBoundaryInterface) a1.a.d(WebViewProviderFactoryBoundaryInterface.class, p000a.a.r()));
        } catch (ClassNotFoundException unused) {
            gVar = new g();
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e3) {
            e = e3;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e4) {
            e = e4;
            throw new RuntimeException(e);
        }
        f837a = gVar;
    }
}
