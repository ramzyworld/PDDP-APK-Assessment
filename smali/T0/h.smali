.class public final LT0/h;
.super LB0/b;
.source "SourceFile"


# instance fields
.field public synthetic h:Ljava/lang/Object;

.field public i:I

.field public final synthetic j:LT0/i;

.field public k:Ljava/lang/Object;

.field public l:LT0/e;


# direct methods
.method public constructor <init>(LT0/i;Lz0/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT0/h;->j:LT0/i;

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
    iput-object p1, p0, LT0/h;->h:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LT0/h;->i:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LT0/h;->i:I

    .line 9
    .line 10
    iget-object p1, p0, LT0/h;->j:LT0/i;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, LT0/i;->g(LT0/e;Lz0/d;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
