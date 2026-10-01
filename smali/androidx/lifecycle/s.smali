.class public final Landroidx/lifecycle/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/l;


# static fields
.field public static final m:Landroidx/lifecycle/s;


# instance fields
.field public e:I

.field public f:I

.field public g:Z

.field public h:Z

.field public i:Landroid/os/Handler;

.field public final j:Landroidx/lifecycle/n;

.field public final k:Landroidx/lifecycle/p;

.field public final l:LD/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/lifecycle/s;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/lifecycle/s;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/lifecycle/s;->m:Landroidx/lifecycle/s;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Landroidx/lifecycle/s;->g:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Landroidx/lifecycle/s;->h:Z

    .line 8
    .line 9
    new-instance v0, Landroidx/lifecycle/n;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Landroidx/lifecycle/n;-><init>(Landroidx/lifecycle/l;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Landroidx/lifecycle/s;->j:Landroidx/lifecycle/n;

    .line 15
    .line 16
    new-instance v0, Landroidx/lifecycle/p;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v0, v1, p0}, Landroidx/lifecycle/p;-><init>(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Landroidx/lifecycle/s;->k:Landroidx/lifecycle/p;

    .line 23
    .line 24
    new-instance v0, LD/j;

    .line 25
    .line 26
    const/16 v1, 0xf

    .line 27
    .line 28
    invoke-direct {v0, v1, p0}, LD/j;-><init>(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Landroidx/lifecycle/s;->l:LD/j;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a()Landroidx/lifecycle/n;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/s;->j:Landroidx/lifecycle/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/lifecycle/s;->f:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Landroidx/lifecycle/s;->f:I

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, Landroidx/lifecycle/s;->g:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/lifecycle/s;->j:Landroidx/lifecycle/n;

    .line 14
    .line 15
    sget-object v1, Landroidx/lifecycle/f;->ON_RESUME:Landroidx/lifecycle/f;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroidx/lifecycle/n;->c(Landroidx/lifecycle/f;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Landroidx/lifecycle/s;->g:Z

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v0, p0, Landroidx/lifecycle/s;->i:Landroid/os/Handler;

    .line 25
    .line 26
    invoke-static {v0}, LI0/i;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Landroidx/lifecycle/s;->k:Landroidx/lifecycle/p;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    return-void
.end method
