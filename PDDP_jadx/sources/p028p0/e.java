package p028p0;

import I0.h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f2902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ e[] f2903f;

    static {
        e eVar = new e("PLAIN_TEXT", 0);
        f2902e = eVar;
        f2903f = new e[]{eVar};
    }

    public static e a(String str) {
        for (e eVar : values()) {
            eVar.getClass();
            if ("text/plain".equals(str)) {
                return eVar;
            }
        }
        throw new NoSuchFieldException(h.e("No such ClipboardContentFormat: ", str));
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f2903f.clone();
    }
}
