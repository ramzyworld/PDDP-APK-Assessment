.class public final LT0/p;
.super LB0/b;
.source "SourceFile"


# instance fields
.field public h:LT0/q;

.field public i:LT0/e;

.field public j:LT0/s;

.field public k:LQ0/P;

.field public l:Ljava/lang/Object;

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:LT0/q;

.field public o:I


# direct methods
.method public constructor <init>(LT0/q;Lz0/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT0/p;->n:LT0/q;

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
    iput-object p1, p0, LT0/p;->m:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LT0/p;->o:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LT0/p;->o:I

    .line 9
    .line 10
    iget-object p1, p0, LT0/p;->n:LT0/q;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, LT0/q;->g(LT0/e;Lz0/d;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p1, LA0/a;->e:LA0/a;

    .line 17
    .line 18
    return-object p1
.end method
