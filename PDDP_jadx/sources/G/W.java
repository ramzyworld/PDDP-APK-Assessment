package G;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class W extends I0.j implements H0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f161g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(int i2, Object obj) {
        super(0);
        this.f160f = i2;
        this.f161g = obj;
    }

    @Override // H0.a
    public final Object f() throws NoSuchMethodException, ClassNotFoundException {
        switch (this.f160f) {
            case 0:
                Object obj = X.f163d;
                File file = (File) this.f161g;
                synchronized (obj) {
                    X.f162c.remove(file.getAbsolutePath());
                }
                return p041x0.g.f3419a;
            case 1:
                File file2 = (File) ((I.b) this.f161g).f();
                String name = file2.getName();
                I0.i.d(name, "getName(...)");
                if (P0.j.Y(name, "").equals("preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    I0.i.d(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            case 2:
                U.a aVar = (U.a) this.f161g;
                Class<?> clsLoadClass = aVar.f906a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                I0.i.d(clsLoadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                Method declaredMethod = clsLoadClass.getDeclaredMethod("getWindowExtensions", null);
                Class<?> clsLoadClass2 = aVar.f906a.loadClass("androidx.window.extensions.WindowExtensions");
                I0.i.d(clsLoadClass2, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                I0.i.d(declaredMethod, "getWindowExtensionsMethod");
                return Boolean.valueOf(declaredMethod.getReturnType().equals(clsLoadClass2) && Modifier.isPublic(declaredMethod.getModifiers()));
            default:
                V.i iVar = (V.i) this.f161g;
                return BigInteger.valueOf(iVar.f962e).shiftLeft(32).or(BigInteger.valueOf(iVar.f963f)).shiftLeft(32).or(BigInteger.valueOf(iVar.f964g));
        }
    }
}
