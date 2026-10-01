.class public final Lu0/v;
.super LB0/b;
.source "SourceFile"


# instance fields
.field public h:Lu0/J;

.field public i:Ljava/util/Set;

.field public j:Ljava/util/Map;

.field public k:Ljava/util/Iterator;

.field public l:LJ/d;

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Lu0/J;

.field public o:I


# direct methods
.method public constructor <init>(Lu0/J;LB0/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu0/v;->n:Lu0/J;

    .line 2
    .line 3
    invoke-direct {p0, p2}, LB0/b;-><init>(Lz0/d;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lu0/v;->m:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lu0/v;->o:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lu0/v;->o:I

    .line 9
    .line 10
    iget-object p1, p0, Lu0/v;->n:Lu0/J;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p1, v0, p0}, Lu0/J;->s(Lu0/J;Ljava/util/List;LB0/b;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
