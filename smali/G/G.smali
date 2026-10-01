.class public final LG/G;
.super LB0/b;
.source "SourceFile"


# instance fields
.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/io/Serializable;

.field public k:LI0/p;

.field public l:Z

.field public m:I

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:LG/S;

.field public p:I


# direct methods
.method public constructor <init>(LG/S;LB0/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LG/G;->o:LG/S;

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
    iput-object p1, p0, LG/G;->n:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LG/G;->p:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LG/G;->p:I

    .line 9
    .line 10
    iget-object p1, p0, LG/G;->o:LG/S;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p1, v0, p0}, LG/S;->f(LG/S;ZLB0/b;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
