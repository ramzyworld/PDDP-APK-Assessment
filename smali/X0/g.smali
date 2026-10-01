.class public abstract LX0/g;
.super LQ0/I;
.source "SourceFile"


# instance fields
.field public g:LX0/b;


# virtual methods
.method public final e(Lz0/i;Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object p1, p0, LX0/g;->g:LX0/b;

    .line 2
    .line 3
    sget-object v0, LX0/b;->l:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 4
    .line 5
    sget-object v0, LX0/k;->g:LX0/i;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {p1, p2, v0, v1}, LX0/b;->b(Ljava/lang/Runnable;LX0/i;Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
