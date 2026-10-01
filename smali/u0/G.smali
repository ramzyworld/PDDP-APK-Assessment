.class public final Lu0/G;
.super LB0/g;
.source "SourceFile"

# interfaces
.implements LH0/p;


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:LJ/d;

.field public final synthetic k:J


# direct methods
.method public constructor <init>(LJ/d;JLz0/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu0/G;->j:LJ/d;

    .line 2
    .line 3
    iput-wide p2, p0, Lu0/G;->k:J

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p4}, LB0/g;-><init>(ILz0/d;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lz0/d;)Lz0/d;
    .locals 4

    .line 1
    new-instance v0, Lu0/G;

    .line 2
    .line 3
    iget-object v1, p0, Lu0/G;->j:LJ/d;

    .line 4
    .line 5
    iget-wide v2, p0, Lu0/G;->k:J

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v3, p2}, Lu0/G;-><init>(LJ/d;JLz0/d;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lu0/G;->i:Ljava/lang/Object;

    .line 11
    .line 12
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
    invoke-virtual {p0, p1, p2}, Lu0/G;->b(Ljava/lang/Object;Lz0/d;)Lz0/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu0/G;

    .line 10
    .line 11
    sget-object p2, Lx0/g;->a:Lx0/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lu0/G;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lu0/G;->i:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p1, LJ/b;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/Long;

    .line 9
    .line 10
    iget-wide v1, p0, Lu0/G;->k:J

    .line 11
    .line 12
    invoke-direct {v0, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lu0/G;->j:LJ/d;

    .line 16
    .line 17
    invoke-virtual {p1, v1, v0}, LJ/b;->d(LJ/d;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object p1, Lx0/g;->a:Lx0/g;

    .line 21
    .line 22
    return-object p1
.end method
