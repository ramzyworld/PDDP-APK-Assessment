.class public final Lu0/l;
.super LB0/g;
.source "SourceFile"

# interfaces
.implements LH0/p;


# instance fields
.field public i:I

.field public final synthetic j:Lu0/J;

.field public final synthetic k:Ljava/util/List;


# direct methods
.method public constructor <init>(Lu0/J;Ljava/util/List;Lz0/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu0/l;->j:Lu0/J;

    .line 2
    .line 3
    iput-object p2, p0, Lu0/l;->k:Ljava/util/List;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, LB0/g;-><init>(ILz0/d;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lz0/d;)Lz0/d;
    .locals 2

    .line 1
    new-instance p1, Lu0/l;

    .line 2
    .line 3
    iget-object v0, p0, Lu0/l;->j:Lu0/J;

    .line 4
    .line 5
    iget-object v1, p0, Lu0/l;->k:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lu0/l;-><init>(Lu0/J;Ljava/util/List;Lz0/d;)V

    .line 8
    .line 9
    .line 10
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
    invoke-virtual {p0, p1, p2}, Lu0/l;->b(Ljava/lang/Object;Lz0/d;)Lz0/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu0/l;

    .line 10
    .line 11
    sget-object p2, Lx0/g;->a:Lx0/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lu0/l;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, LA0/a;->e:LA0/a;

    .line 2
    .line 3
    iget v1, p0, Lu0/l;->i:I

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
    iput v2, p0, Lu0/l;->i:I

    .line 26
    .line 27
    iget-object p1, p0, Lu0/l;->j:Lu0/J;

    .line 28
    .line 29
    iget-object v1, p0, Lu0/l;->k:Ljava/util/List;

    .line 30
    .line 31
    invoke-static {p1, v1, p0}, Lu0/J;->s(Lu0/J;Ljava/util/List;LB0/b;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-ne p1, v0, :cond_2

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_2
    :goto_0
    return-object p1
.end method
