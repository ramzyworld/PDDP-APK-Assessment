.class public final Ly/O;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ly/N;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    sget v0, Ly/M;->l:I

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget v0, Ly/N;->b:I

    .line 11
    .line 12
    :goto_0
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance v0, Ly/N;

    invoke-direct {v0, p0}, Ly/N;-><init>(Ly/O;)V

    iput-object v0, p0, Ly/O;->a:Ly/N;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsets;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, Ly/M;

    invoke-direct {v0, p0, p1}, Ly/M;-><init>(Ly/O;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Ly/O;->a:Ly/N;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 4
    new-instance v0, Ly/L;

    invoke-direct {v0, p0, p1}, Ly/L;-><init>(Ly/O;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Ly/O;->a:Ly/N;

    goto :goto_0

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    .line 5
    new-instance v0, Ly/K;

    invoke-direct {v0, p0, p1}, Ly/K;-><init>(Ly/O;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Ly/O;->a:Ly/N;

    goto :goto_0

    .line 6
    :cond_2
    new-instance v0, Ly/J;

    invoke-direct {v0, p0, p1}, Ly/J;-><init>(Ly/O;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Ly/O;->a:Ly/N;

    :goto_0
    return-void
.end method

.method public static a(Landroid/view/WindowInsets;Landroid/view/View;)Ly/O;
    .locals 2

    .line 1
    new-instance v0, Ly/O;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p0}, Ly/O;-><init>(Landroid/view/WindowInsets;)V

    .line 7
    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    sget-object p0, Ly/x;->a:Ljava/lang/reflect/Field;

    .line 18
    .line 19
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 20
    .line 21
    const/16 v1, 0x17

    .line 22
    .line 23
    if-lt p0, v1, :cond_0

    .line 24
    .line 25
    invoke-static {p1}, Ly/q;->a(Landroid/view/View;)Ly/O;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {p1}, Ly/p;->j(Landroid/view/View;)Ly/O;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    :goto_0
    iget-object v1, v0, Ly/O;->a:Ly/N;

    .line 35
    .line 36
    invoke-virtual {v1, p0}, Ly/N;->k(Ly/O;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {v1, p0}, Ly/N;->d(Landroid/view/View;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Ly/O;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    check-cast p1, Ly/O;

    .line 12
    .line 13
    iget-object p1, p1, Ly/O;->a:Ly/N;

    .line 14
    .line 15
    iget-object v0, p0, Ly/O;->a:Ly/N;

    .line 16
    .line 17
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Ly/O;->a:Ly/N;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ly/N;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    :goto_0
    return v0
.end method
