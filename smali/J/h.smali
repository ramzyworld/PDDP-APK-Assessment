.class public final LJ/h;
.super LB0/g;
.source "SourceFile"

# interfaces
.implements LH0/p;


# instance fields
.field public i:I

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:LB0/g;


# direct methods
.method public constructor <init>(LH0/p;Lz0/d;)V
    .locals 0

    .line 1
    check-cast p1, LB0/g;

    .line 2
    .line 3
    iput-object p1, p0, LJ/h;->k:LB0/g;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, LB0/g;-><init>(ILz0/d;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lz0/d;)Lz0/d;
    .locals 2

    .line 1
    new-instance v0, LJ/h;

    .line 2
    .line 3
    iget-object v1, p0, LJ/h;->k:LB0/g;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LJ/h;-><init>(LH0/p;Lz0/d;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LJ/h;->j:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LJ/b;

    .line 2
    .line 3
    check-cast p2, Lz0/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LJ/h;->b(Ljava/lang/Object;Lz0/d;)Lz0/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LJ/h;

    .line 10
    .line 11
    sget-object p2, Lx0/g;->a:Lx0/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LJ/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, LJ/h;->i:I

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
    iget-object v0, p0, LJ/h;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, LJ/b;

    .line 13
    .line 14
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, LJ/h;->j:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, LJ/b;

    .line 32
    .line 33
    new-instance v1, LJ/b;

    .line 34
    .line 35
    invoke-virtual {p1}, LJ/b;->a()Ljava/util/Map;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 40
    .line 41
    invoke-direct {v3, p1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 42
    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    invoke-direct {v1, v3, p1}, LJ/b;-><init>(Ljava/util/Map;Z)V

    .line 46
    .line 47
    .line 48
    iput-object v1, p0, LJ/h;->j:Ljava/lang/Object;

    .line 49
    .line 50
    iput v2, p0, LJ/h;->i:I

    .line 51
    .line 52
    iget-object p1, p0, LJ/h;->k:LB0/g;

    .line 53
    .line 54
    invoke-interface {p1, v1, p0}, LH0/p;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-ne p1, v0, :cond_2

    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_2
    move-object v0, v1

    .line 62
    :goto_0
    return-object v0
.end method
