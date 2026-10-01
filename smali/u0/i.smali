.class public final Lu0/i;
.super LB0/g;
.source "SourceFile"

# interfaces
.implements LH0/p;


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;Lz0/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu0/i;->j:Ljava/util/List;

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
    new-instance v0, Lu0/i;

    .line 2
    .line 3
    iget-object v1, p0, Lu0/i;->j:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lu0/i;-><init>(Ljava/util/List;Lz0/d;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lu0/i;->i:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lu0/i;->b(Ljava/lang/Object;Lz0/d;)Lz0/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu0/i;

    .line 10
    .line 11
    sget-object p2, Lx0/g;->a:Lx0/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lu0/i;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lu0/i;->i:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p1, LJ/b;

    .line 7
    .line 8
    sget-object v0, Lx0/g;->a:Lx0/g;

    .line 9
    .line 10
    iget-object v1, p0, Lu0/i;->j:Ljava/util/List;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/lang/String;

    .line 29
    .line 30
    const-string v3, "name"

    .line 31
    .line 32
    invoke-static {v2, v3}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance v3, LJ/d;

    .line 36
    .line 37
    invoke-direct {v3, v2}, LJ/d;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, LJ/b;->b()V

    .line 41
    .line 42
    .line 43
    iget-object v2, p1, LJ/b;->a:Ljava/util/Map;

    .line 44
    .line 45
    invoke-interface {v2, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move-object v1, v0

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const/4 v1, 0x0

    .line 52
    :goto_1
    if-nez v1, :cond_2

    .line 53
    .line 54
    invoke-virtual {p1}, LJ/b;->b()V

    .line 55
    .line 56
    .line 57
    iget-object p1, p1, LJ/b;->a:Ljava/util/Map;

    .line 58
    .line 59
    invoke-interface {p1}, Ljava/util/Map;->clear()V

    .line 60
    .line 61
    .line 62
    :cond_2
    return-object v0
.end method
