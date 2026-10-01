.class public final LQ0/l;
.super LQ0/Z;
.source "SourceFile"

# interfaces
.implements LQ0/k;


# virtual methods
.method public final U(LB0/g;)Ljava/lang/Object;
    .locals 3

    .line 1
    :cond_0
    invoke-virtual {p0}, LQ0/Z;->E()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, LQ0/L;

    .line 6
    .line 7
    if-nez v1, :cond_2

    .line 8
    .line 9
    instance-of p1, v0, LQ0/n;

    .line 10
    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    invoke-static {v0}, LQ0/v;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    check-cast v0, LQ0/n;

    .line 19
    .line 20
    iget-object p1, v0, LQ0/n;->a:Ljava/lang/Throwable;

    .line 21
    .line 22
    throw p1

    .line 23
    :cond_2
    invoke-virtual {p0, v0}, LQ0/Z;->R(Ljava/lang/Object;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-ltz v0, :cond_0

    .line 28
    .line 29
    new-instance v0, LQ0/V;

    .line 30
    .line 31
    invoke-static {p1}, La/a;->x(Lz0/d;)Lz0/d;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-direct {v0, p1, p0}, LQ0/V;-><init>(Lz0/d;LQ0/l;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, LQ0/f;->v()V

    .line 39
    .line 40
    .line 41
    new-instance p1, LQ0/O;

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    invoke-direct {p1, v1, v0}, LQ0/O;-><init>(ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    const/4 v2, 0x1

    .line 49
    invoke-virtual {p0, v1, v2, p1}, LQ0/Z;->I(ZZLH0/l;)LQ0/C;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-instance v1, LQ0/D;

    .line 54
    .line 55
    invoke-direct {v1, p1}, LQ0/D;-><init>(LQ0/C;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, LQ0/f;->x(LQ0/c0;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, LQ0/f;->u()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :goto_0
    return-object p1
.end method
