.class public final LG/L;
.super LB0/g;
.source "SourceFile"

# interfaces
.implements LH0/p;


# instance fields
.field public i:I

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:LG/S;

.field public final synthetic l:LB0/g;


# direct methods
.method public constructor <init>(LG/S;LH0/p;Lz0/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LG/L;->k:LG/S;

    .line 2
    .line 3
    check-cast p2, LB0/g;

    .line 4
    .line 5
    iput-object p2, p0, LG/L;->l:LB0/g;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, LB0/g;-><init>(ILz0/d;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lz0/d;)Lz0/d;
    .locals 3

    .line 1
    new-instance v0, LG/L;

    .line 2
    .line 3
    iget-object v1, p0, LG/L;->l:LB0/g;

    .line 4
    .line 5
    iget-object v2, p0, LG/L;->k:LG/S;

    .line 6
    .line 7
    invoke-direct {v0, v2, v1, p2}, LG/L;-><init>(LG/S;LH0/p;Lz0/d;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, LG/L;->j:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LQ0/u;

    .line 2
    .line 3
    check-cast p2, Lz0/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LG/L;->b(Ljava/lang/Object;Lz0/d;)Lz0/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LG/L;

    .line 10
    .line 11
    sget-object p2, Lx0/g;->a:Lx0/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LG/L;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, LA0/a;->e:LA0/a;

    .line 2
    .line 3
    iget v1, p0, LG/L;->i:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto/16 :goto_1

    .line 14
    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1

    .line 23
    :cond_1
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, LG/L;->j:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, LQ0/u;

    .line 29
    .line 30
    new-instance v1, LQ0/l;

    .line 31
    .line 32
    invoke-direct {v1, v2}, LQ0/Z;-><init>(Z)V

    .line 33
    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-virtual {v1, v3}, LQ0/Z;->H(LQ0/P;)V

    .line 37
    .line 38
    .line 39
    iget-object v4, p0, LG/L;->k:LG/S;

    .line 40
    .line 41
    iget-object v5, v4, LG/S;->l:LD/j;

    .line 42
    .line 43
    invoke-virtual {v5}, LD/j;->p()LG/m0;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    new-instance v6, LG/e0;

    .line 48
    .line 49
    iget-object v7, p0, LG/L;->l:LB0/g;

    .line 50
    .line 51
    invoke-interface {p1}, LQ0/u;->k()Lz0/i;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-direct {v6, v7, v1, v5, p1}, LG/e0;-><init>(LH0/p;LQ0/l;LG/m0;Lz0/i;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, v4, LG/S;->p:LG/n;

    .line 59
    .line 60
    iget-object v4, p1, LG/n;->c:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v4, LS0/b;

    .line 63
    .line 64
    invoke-interface {v4, v6}, LS0/r;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    instance-of v5, v4, LS0/g;

    .line 69
    .line 70
    if-eqz v5, :cond_5

    .line 71
    .line 72
    instance-of p1, v4, LS0/g;

    .line 73
    .line 74
    if-eqz p1, :cond_2

    .line 75
    .line 76
    check-cast v4, LS0/g;

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    move-object v4, v3

    .line 80
    :goto_0
    if-eqz v4, :cond_3

    .line 81
    .line 82
    iget-object v3, v4, LS0/g;->a:Ljava/lang/Throwable;

    .line 83
    .line 84
    :cond_3
    if-nez v3, :cond_4

    .line 85
    .line 86
    new-instance v3, LS0/l;

    .line 87
    .line 88
    const-string p1, "Channel was closed normally"

    .line 89
    .line 90
    invoke-direct {v3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    throw v3

    .line 94
    :cond_5
    instance-of v4, v4, LS0/h;

    .line 95
    .line 96
    if-nez v4, :cond_8

    .line 97
    .line 98
    iget-object v4, p1, LG/n;->d:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v4, LD/j;

    .line 101
    .line 102
    iget-object v4, v4, LD/j;->f:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v4, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 105
    .line 106
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    if-nez v4, :cond_6

    .line 111
    .line 112
    new-instance v4, LG/h0;

    .line 113
    .line 114
    invoke-direct {v4, p1, v3}, LG/h0;-><init>(LG/n;Lz0/d;)V

    .line 115
    .line 116
    .line 117
    iget-object p1, p1, LG/n;->a:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p1, LQ0/u;

    .line 120
    .line 121
    invoke-static {p1, v4}, LQ0/v;->g(LQ0/u;LH0/p;)LQ0/e0;

    .line 122
    .line 123
    .line 124
    :cond_6
    iput v2, p0, LG/L;->i:I

    .line 125
    .line 126
    invoke-virtual {v1, p0}, LQ0/l;->U(LB0/g;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    if-ne p1, v0, :cond_7

    .line 131
    .line 132
    return-object v0

    .line 133
    :cond_7
    :goto_1
    return-object p1

    .line 134
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 135
    .line 136
    const-string v0, "Check failed."

    .line 137
    .line 138
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw p1
.end method
