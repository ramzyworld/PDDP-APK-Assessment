package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f1583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f1584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f1585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f1586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f1587i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ g[] f1588j;

    static {
        g gVar = new g("DESTROYED", 0);
        f1583e = gVar;
        g gVar2 = new g("INITIALIZED", 1);
        f1584f = gVar2;
        g gVar3 = new g("CREATED", 2);
        f1585g = gVar3;
        g gVar4 = new g("STARTED", 3);
        f1586h = gVar4;
        g gVar5 = new g("RESUMED", 4);
        f1587i = gVar5;
        f1588j = new g[]{gVar, gVar2, gVar3, gVar4, gVar5};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f1588j.clone();
    }
}
