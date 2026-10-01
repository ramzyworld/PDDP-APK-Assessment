.class public final LT0/g;
.super LB0/b;
.source "SourceFile"


# instance fields
.field public h:Ljava/lang/Throwable;

.field public synthetic i:Ljava/lang/Object;

.field public j:I


# virtual methods
.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, LT0/g;->i:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LT0/g;->j:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LT0/g;->j:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-static {p1, p1, p1, p0}, LT0/r;->a(LT0/t;LG/s;Ljava/lang/Throwable;LB0/b;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
