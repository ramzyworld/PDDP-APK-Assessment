.class public abstract Lz0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/g;


# instance fields
.field public final e:Lz0/h;


# direct methods
.method public constructor <init>(Lz0/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz0/a;->e:Lz0/h;

    .line 5
    .line 6
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

.method public f(Lz0/h;)Lz0/g;
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
    .locals 1

    .line 1
    iget-object v0, p0, Lz0/a;->e:Lz0/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public h(Lz0/h;)Lz0/i;
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
