.class public final LV0/q;
.super LI0/j;
.source "SourceFile"

# interfaces
.implements LH0/l;


# instance fields
.field public final synthetic f:LH0/l;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Lz0/i;


# direct methods
.method public constructor <init>(LH0/l;Ljava/lang/Object;Lz0/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV0/q;->f:LH0/l;

    .line 2
    .line 3
    iput-object p2, p0, LV0/q;->g:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, LV0/q;->h:Lz0/i;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, LI0/j;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iget-object v0, p0, LV0/q;->f:LH0/l;

    .line 5
    .line 6
    iget-object v1, p0, LV0/q;->g:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-static {v0, v1, p1}, LV0/a;->a(LH0/l;Ljava/lang/Object;LO/c;)LO/c;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, LV0/q;->h:Lz0/i;

    .line 15
    .line 16
    invoke-static {p1, v0}, LQ0/v;->d(Ljava/lang/Throwable;Lz0/i;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    sget-object p1, Lx0/g;->a:Lx0/g;

    .line 20
    .line 21
    return-object p1
.end method
