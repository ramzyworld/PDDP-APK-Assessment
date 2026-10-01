.class public final Lc0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lc0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lc0/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lc0/b;->a:Lc0/b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Ly/O;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LD/r;->r(Landroid/content/Context;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Landroid/view/WindowManager;

    .line 11
    .line 12
    invoke-static {p1}, Lc0/a;->q(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, Lc0/a;->g(Landroid/view/WindowMetrics;)Landroid/view/WindowInsets;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string v0, "context.getSystemService\u2026indowMetrics.windowInsets"

    .line 21
    .line 22
    invoke-static {p1, v0}, LI0/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-static {p1, v0}, Ly/O;->a(Landroid/view/WindowInsets;Landroid/view/View;)Ly/O;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1
.end method
