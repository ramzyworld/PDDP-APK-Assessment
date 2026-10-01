.class public final LU0/g;
.super LB0/g;
.source "SourceFile"

# interfaces
.implements LH0/p;


# instance fields
.field public i:I

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:LU0/h;


# direct methods
.method public constructor <init>(LU0/h;Lz0/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU0/g;->k:LU0/h;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, LB0/g;-><init>(ILz0/d;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lz0/d;)Lz0/d;
    .locals 2

    .line 1
    new-instance v0, LU0/g;

    .line 2
    .line 3
    iget-object v1, p0, LU0/g;->k:LU0/h;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LU0/g;-><init>(LU0/h;Lz0/d;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LU0/g;->j:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LT0/e;

    .line 2
    .line 3
    check-cast p2, Lz0/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LU0/g;->b(Ljava/lang/Object;Lz0/d;)Lz0/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LU0/g;

    .line 10
    .line 11
    sget-object p2, Lx0/g;->a:Lx0/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LU0/g;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, LA0/a;->e:LA0/a;

    .line 2
    .line 3
    iget v1, p0, LU0/g;->i:I

    .line 4
    .line 5
    sget-object v2, Lx0/g;->a:Lx0/g;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v3, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, LU0/g;->j:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, LT0/e;

    .line 30
    .line 31
    iput v3, p0, LU0/g;->i:I

    .line 32
    .line 33
    iget-object v1, p0, LU0/g;->k:LU0/h;

    .line 34
    .line 35
    iget-object v1, v1, LU0/h;->h:LT0/d;

    .line 36
    .line 37
    invoke-interface {v1, p1, p0}, LT0/d;->g(LT0/e;Lz0/d;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-ne p1, v0, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    move-object p1, v2

    .line 45
    :goto_0
    if-ne p1, v0, :cond_3

    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_3
    :goto_1
    return-object v2
.end method
