.class public final LQ0/W;
.super LQ0/U;
.source "SourceFile"


# instance fields
.field public final i:LQ0/Z;

.field public final j:LQ0/X;

.field public final k:LQ0/j;

.field public final l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LQ0/Z;LQ0/X;LQ0/j;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LV0/l;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQ0/W;->i:LQ0/Z;

    .line 5
    .line 6
    iput-object p2, p0, LQ0/W;->j:LQ0/X;

    .line 7
    .line 8
    iput-object p3, p0, LQ0/W;->k:LQ0/j;

    .line 9
    .line 10
    iput-object p4, p0, LQ0/W;->l:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final bridge synthetic j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LQ0/W;->o(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lx0/g;->a:Lx0/g;

    .line 7
    .line 8
    return-object p1
.end method

.method public final o(Ljava/lang/Throwable;)V
    .locals 7

    .line 1
    iget-object p1, p0, LQ0/W;->k:LQ0/j;

    .line 2
    .line 3
    iget-object v0, p0, LQ0/W;->i:LQ0/Z;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, LQ0/Z;->M(LV0/l;)LQ0/j;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v1, p0, LQ0/W;->j:LQ0/X;

    .line 13
    .line 14
    iget-object v2, p0, LQ0/W;->l:Ljava/lang/Object;

    .line 15
    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    :cond_0
    iget-object v3, p1, LQ0/j;->i:LQ0/Z;

    .line 19
    .line 20
    new-instance v4, LQ0/W;

    .line 21
    .line 22
    invoke-direct {v4, v0, v1, p1, v2}, LQ0/W;-><init>(LQ0/Z;LQ0/X;LQ0/j;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x1

    .line 27
    invoke-static {v3, v5, v4, v6}, LQ0/v;->e(LQ0/P;ZLQ0/U;I)LQ0/C;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    sget-object v4, LQ0/b0;->e:LQ0/b0;

    .line 32
    .line 33
    if-eq v3, v4, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-static {p1}, LQ0/Z;->M(LV0/l;)LQ0/j;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-nez p1, :cond_0

    .line 41
    .line 42
    :cond_2
    invoke-virtual {v0, v1, v2}, LQ0/Z;->z(LQ0/X;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {v0, p1}, LQ0/Z;->q(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    return-void
.end method
