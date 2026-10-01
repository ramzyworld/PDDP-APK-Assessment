.class public final LU0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT0/e;


# instance fields
.field public final e:LS0/p;


# direct methods
.method public constructor <init>(LS0/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LU0/r;->e:LS0/p;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lz0/d;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LU0/r;->e:LS0/p;

    .line 2
    .line 3
    check-cast v0, LS0/o;

    .line 4
    .line 5
    iget-object v0, v0, LS0/o;->h:LS0/b;

    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, LS0/r;->n(Ljava/lang/Object;Lz0/d;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget-object p2, LA0/a;->e:LA0/a;

    .line 12
    .line 13
    if-ne p1, p2, :cond_0

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object p1, Lx0/g;->a:Lx0/g;

    .line 17
    .line 18
    return-object p1
.end method
