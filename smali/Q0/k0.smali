.class public final LQ0/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/g;
.implements Lz0/h;


# static fields
.field public static final e:LQ0/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LQ0/k0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LQ0/k0;->e:LQ0/k0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(Lz0/i;)Lz0/i;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lz0/j;->e:Lz0/j;

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    move-object p1, p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v0, Lz0/b;->h:Lz0/b;

    .line 13
    .line 14
    invoke-interface {p1, p0, v0}, Lz0/i;->d(Ljava/lang/Object;LH0/p;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lz0/i;

    .line 19
    .line 20
    :goto_0
    return-object p1
.end method

.method public final d(Ljava/lang/Object;LH0/p;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p2, p1, p0}, LH0/p;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final f(Lz0/h;)Lz0/g;
    .locals 0

    .line 1
    invoke-static {p0, p1}, La/a;->s(Lz0/g;Lz0/h;)Lz0/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final getKey()Lz0/h;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final h(Lz0/h;)Lz0/i;
    .locals 0

    .line 1
    invoke-static {p0, p1}, La/a;->z(Lz0/g;Lz0/h;)Lz0/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
