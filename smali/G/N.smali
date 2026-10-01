.class public final LG/N;
.super LI0/j;
.source "SourceFile"

# interfaces
.implements LH0/p;


# static fields
.field public static final f:LG/N;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LG/N;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, LI0/j;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LG/N;->f:LG/N;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, LG/e0;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Throwable;

    .line 4
    .line 5
    const-string v0, "msg"

    .line 6
    .line 7
    invoke-static {p1, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    new-instance p2, Ljava/util/concurrent/CancellationException;

    .line 13
    .line 14
    const-string v0, "DataStore scope was cancelled before updateData could complete"

    .line 15
    .line 16
    invoke-direct {p2, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object p1, p1, LG/e0;->b:LQ0/l;

    .line 20
    .line 21
    new-instance v0, LQ0/n;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {v0, p2, v1}, LQ0/n;-><init>(Ljava/lang/Throwable;Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, LQ0/Z;->K(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    sget-object p1, Lx0/g;->a:Lx0/g;

    .line 31
    .line 32
    return-object p1
.end method
