package G;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class V extends I0.j implements H0.l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final V f159f = new V(1);

    @Override // H0.l
    public final Object j(Object obj) {
        File file = (File) obj;
        I0.i.e(file, "it");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        I0.i.d(absolutePath, "file.canonicalFile.absolutePath");
        return new l0(absolutePath);
    }
}
