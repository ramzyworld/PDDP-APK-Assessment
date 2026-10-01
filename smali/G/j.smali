.class public final LG/j;
.super LB0/b;
.source "SourceFile"


# instance fields
.field public h:LG/n;

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:LG/n;

.field public k:I


# direct methods
.method public constructor <init>(LG/n;LB0/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LG/j;->j:LG/n;

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
    iput-object p1, p0, LG/j;->i:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LG/j;->k:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LG/j;->k:I

    .line 9
    .line 10
    iget-object p1, p0, LG/j;->j:LG/n;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, LG/n;->c(LB0/b;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
