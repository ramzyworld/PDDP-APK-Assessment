.class public final Lp0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public b:[B

.field public final c:LN/b;

.field public d:Lp0/k;

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>(Li0/b;Z)V
    .locals 4

    .line 1
    new-instance v0, LN/b;

    .line 2
    .line 3
    const-string v1, "flutter/restoration"

    .line 4
    .line 5
    sget-object v2, Lq0/o;->a:Lq0/o;

    .line 6
    .line 7
    const/16 v3, 0xa

    .line 8
    .line 9
    invoke-direct {v0, p1, v1, v2, v3}, LN/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-boolean p1, p0, Lp0/l;->e:Z

    .line 17
    .line 18
    iput-boolean p1, p0, Lp0/l;->f:Z

    .line 19
    .line 20
    new-instance p1, Lp0/b;

    .line 21
    .line 22
    const/16 v1, 0x8

    .line 23
    .line 24
    invoke-direct {p1, v1, p0}, Lp0/b;-><init>(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lp0/l;->c:LN/b;

    .line 28
    .line 29
    iput-boolean p2, p0, Lp0/l;->a:Z

    .line 30
    .line 31
    invoke-virtual {v0, p1}, LN/b;->N(Lq0/k;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static a([B)Ljava/util/HashMap;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 7
    .line 8
    const-string v2, "enabled"

    .line 9
    .line 10
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    const-string v1, "data"

    .line 14
    .line 15
    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-object v0
.end method
