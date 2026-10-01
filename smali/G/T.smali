.class public final LG/T;
.super LB0/b;
.source "SourceFile"


# instance fields
.field public h:Ljava/lang/Object;

.field public i:Ljava/io/FileInputStream;

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:LG/U;

.field public l:I


# direct methods
.method public constructor <init>(LG/U;LB0/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LG/T;->k:LG/U;

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
    iput-object p1, p0, LG/T;->j:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LG/T;->l:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LG/T;->l:I

    .line 9
    .line 10
    iget-object p1, p0, LG/T;->k:LG/U;

    .line 11
    .line 12
    invoke-static {p1, p0}, LG/U;->a(LG/U;LB0/b;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
