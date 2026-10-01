.class public final Lu0/E;
.super LB0/g;
.source "SourceFile"

# interfaces
.implements LH0/p;


# instance fields
.field public i:I

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Lu0/J;

.field public final synthetic l:D


# direct methods
.method public constructor <init>(Ljava/lang/String;Lu0/J;DLz0/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu0/E;->j:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lu0/E;->k:Lu0/J;

    .line 4
    .line 5
    iput-wide p3, p0, Lu0/E;->l:D

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, LB0/g;-><init>(ILz0/d;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lz0/d;)Lz0/d;
    .locals 6

    .line 1
    new-instance p1, Lu0/E;

    .line 2
    .line 3
    iget-object v2, p0, Lu0/E;->k:Lu0/J;

    .line 4
    .line 5
    iget-wide v3, p0, Lu0/E;->l:D

    .line 6
    .line 7
    iget-object v1, p0, Lu0/E;->j:Ljava/lang/String;

    .line 8
    .line 9
    move-object v0, p1

    .line 10
    move-object v5, p2

    .line 11
    invoke-direct/range {v0 .. v5}, Lu0/E;-><init>(Ljava/lang/String;Lu0/J;DLz0/d;)V

    .line 12
    .line 13
    .line 14
    return-object p1
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LQ0/u;

    .line 2
    .line 3
    check-cast p2, Lz0/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lu0/E;->b(Ljava/lang/Object;Lz0/d;)Lz0/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu0/E;

    .line 10
    .line 11
    sget-object p2, Lx0/g;->a:Lx0/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lu0/E;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, LA0/a;->e:LA0/a;

    .line 2
    .line 3
    iget v1, p0, Lu0/E;->i:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lu0/E;->j:Ljava/lang/String;

    .line 26
    .line 27
    new-instance v1, LJ/d;

    .line 28
    .line 29
    invoke-direct {v1, p1}, LJ/d;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lu0/E;->k:Lu0/J;

    .line 33
    .line 34
    iget-object p1, p1, Lu0/J;->e:Landroid/content/Context;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    invoke-static {p1}, Lu0/K;->a(Landroid/content/Context;)LD/j;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    new-instance v4, Lu0/D;

    .line 44
    .line 45
    iget-wide v5, p0, Lu0/E;->l:D

    .line 46
    .line 47
    invoke-direct {v4, v1, v5, v6, v3}, Lu0/D;-><init>(LJ/d;DLz0/d;)V

    .line 48
    .line 49
    .line 50
    iput v2, p0, Lu0/E;->i:I

    .line 51
    .line 52
    new-instance v1, LJ/h;

    .line 53
    .line 54
    invoke-direct {v1, v4, v3}, LJ/h;-><init>(LH0/p;Lz0/d;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v1, p0}, LD/j;->c(LH0/p;LB0/g;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-ne p1, v0, :cond_2

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_2
    :goto_0
    sget-object p1, Lx0/g;->a:Lx0/g;

    .line 65
    .line 66
    return-object p1

    .line 67
    :cond_3
    const-string p1, "context"

    .line 68
    .line 69
    invoke-static {p1}, LI0/i;->g(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v3
.end method
