.class public final LU0/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/d;
.implements LB0/c;


# instance fields
.field public final e:Lz0/d;

.field public final f:Lz0/i;


# direct methods
.method public constructor <init>(Lz0/d;Lz0/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LU0/s;->e:Lz0/d;

    .line 5
    .line 6
    iput-object p2, p0, LU0/s;->f:Lz0/i;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final g()LB0/c;
    .locals 2

    .line 1
    iget-object v0, p0, LU0/s;->e:Lz0/d;

    .line 2
    .line 3
    instance-of v1, v0, LB0/c;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, LB0/c;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    return-object v0
.end method

.method public final i()Lz0/i;
    .locals 1

    .line 1
    iget-object v0, p0, LU0/s;->f:Lz0/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LU0/s;->e:Lz0/d;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lz0/d;->m(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
