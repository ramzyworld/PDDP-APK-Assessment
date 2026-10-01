.class public final LG/F;
.super LB0/g;
.source "SourceFile"

# interfaces
.implements LH0/p;


# instance fields
.field public i:Ljava/lang/Throwable;

.field public j:I

.field public synthetic k:Z

.field public final synthetic l:LG/S;

.field public final synthetic m:I


# direct methods
.method public constructor <init>(LG/S;ILz0/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LG/F;->l:LG/S;

    .line 2
    .line 3
    iput p2, p0, LG/F;->m:I

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, LB0/g;-><init>(ILz0/d;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lz0/d;)Lz0/d;
    .locals 3

    .line 1
    new-instance v0, LG/F;

    .line 2
    .line 3
    iget-object v1, p0, LG/F;->l:LG/S;

    .line 4
    .line 5
    iget v2, p0, LG/F;->m:I

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, LG/F;-><init>(LG/S;ILz0/d;)V

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iput-boolean p1, v0, LG/F;->k:Z

    .line 17
    .line 18
    return-object v0
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    check-cast p2, Lz0/d;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, LG/F;->b(Ljava/lang/Object;Lz0/d;)Lz0/d;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, LG/F;

    .line 13
    .line 14
    sget-object p2, Lx0/g;->a:Lx0/g;

    .line 15
    .line 16
    invoke-virtual {p1, p2}, LG/F;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, LA0/a;->e:LA0/a;

    .line 2
    .line 3
    iget v1, p0, LG/F;->j:I

    .line 4
    .line 5
    iget-object v2, p0, LG/F;->l:LG/S;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v4, :cond_1

    .line 12
    .line 13
    if-ne v1, v3, :cond_0

    .line 14
    .line 15
    iget-boolean v0, p0, LG/F;->k:Z

    .line 16
    .line 17
    iget-object v1, p0, LG/F;->i:Ljava/lang/Throwable;

    .line 18
    .line 19
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    iget-boolean v1, p0, LG/F;->k:Z

    .line 32
    .line 33
    :try_start_0
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-boolean v1, p0, LG/F;->k:Z

    .line 43
    .line 44
    :try_start_1
    iput-boolean v1, p0, LG/F;->k:Z

    .line 45
    .line 46
    iput v4, p0, LG/F;->j:I

    .line 47
    .line 48
    invoke-static {v2, v1, p0}, LG/S;->f(LG/S;ZLB0/b;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-ne p1, v0, :cond_3

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_3
    :goto_0
    check-cast p1, LG/m0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    .line 57
    goto :goto_4

    .line 58
    :goto_1
    if-eqz v1, :cond_5

    .line 59
    .line 60
    invoke-virtual {v2}, LG/S;->g()LG/l0;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iput-object p1, p0, LG/F;->i:Ljava/lang/Throwable;

    .line 65
    .line 66
    iput-boolean v1, p0, LG/F;->k:Z

    .line 67
    .line 68
    iput v3, p0, LG/F;->j:I

    .line 69
    .line 70
    invoke-virtual {v2}, LG/l0;->a()Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-ne v2, v0, :cond_4

    .line 75
    .line 76
    return-object v0

    .line 77
    :cond_4
    move v0, v1

    .line 78
    move-object v1, p1

    .line 79
    move-object p1, v2

    .line 80
    :goto_2
    check-cast p1, Ljava/lang/Number;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    goto :goto_3

    .line 87
    :cond_5
    iget v0, p0, LG/F;->m:I

    .line 88
    .line 89
    move v5, v1

    .line 90
    move-object v1, p1

    .line 91
    move p1, v0

    .line 92
    move v0, v5

    .line 93
    :goto_3
    new-instance v2, LG/f0;

    .line 94
    .line 95
    invoke-direct {v2, v1, p1}, LG/f0;-><init>(Ljava/lang/Throwable;I)V

    .line 96
    .line 97
    .line 98
    move v1, v0

    .line 99
    move-object p1, v2

    .line 100
    :goto_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    new-instance v1, Lx0/b;

    .line 105
    .line 106
    invoke-direct {v1, p1, v0}, Lx0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    return-object v1
.end method
