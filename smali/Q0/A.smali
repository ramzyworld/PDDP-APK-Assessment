.class public abstract LQ0/A;
.super LX0/h;
.source "SourceFile"


# instance fields
.field public g:I


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    sget-object v2, LX0/k;->g:LX0/i;

    .line 4
    .line 5
    invoke-direct {p0, v0, v1, v2}, LX0/h;-><init>(JLX0/i;)V

    .line 6
    .line 7
    .line 8
    iput p1, p0, LQ0/A;->g:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public abstract b(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V
.end method

.method public abstract c()Lz0/d;
.end method

.method public d(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    .line 1
    instance-of v0, p1, LQ0/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, LQ0/n;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p1, v1

    .line 10
    :goto_0
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-object v1, p1, LQ0/n;->a:Ljava/lang/Throwable;

    .line 13
    .line 14
    :cond_1
    return-object v1
.end method

.method public f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p1
.end method

.method public final h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    if-eqz p1, :cond_1

    .line 7
    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    invoke-static {p1, p2}, La1/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    :cond_1
    if-nez p1, :cond_2

    .line 14
    .line 15
    move-object p1, p2

    .line 16
    :cond_2
    new-instance p2, LG0/a;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "Fatal exception in coroutines machinery for "

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ". Please read KDoc to \'handleFatalException\' method and report this incident to maintainers"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {p1}, LI0/i;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p2, v0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, LQ0/A;->c()Lz0/d;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-interface {p1}, Lz0/d;->i()Lz0/i;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {p2, p1}, LQ0/v;->d(Ljava/lang/Throwable;Lz0/i;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public abstract j()Ljava/lang/Object;
.end method

.method public final run()V
    .locals 11

    .line 1
    sget-object v0, Lx0/g;->a:Lx0/g;

    .line 2
    .line 3
    iget-object v1, p0, LX0/h;->f:LX0/i;

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0}, LQ0/A;->c()Lz0/d;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string v3, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"

    .line 10
    .line 11
    invoke-static {v2, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast v2, LV0/h;

    .line 15
    .line 16
    iget-object v3, v2, LV0/h;->i:LB0/b;

    .line 17
    .line 18
    iget-object v2, v2, LV0/h;->k:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-interface {v3}, Lz0/d;->i()Lz0/i;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-static {v4, v2}, LV0/a;->m(Lz0/i;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    sget-object v5, LV0/a;->f:LD/j;

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    if-eq v2, v5, :cond_0

    .line 32
    .line 33
    invoke-static {v3, v4, v2}, LQ0/v;->m(Lz0/d;Lz0/i;Ljava/lang/Object;)LQ0/j0;

    .line 34
    .line 35
    .line 36
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v2

    .line 39
    goto/16 :goto_5

    .line 40
    .line 41
    :cond_0
    move-object v5, v6

    .line 42
    :goto_0
    :try_start_1
    invoke-interface {v3}, Lz0/d;->i()Lz0/i;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-virtual {p0}, LQ0/A;->j()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    invoke-virtual {p0, v8}, LQ0/A;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    if-nez v9, :cond_1

    .line 55
    .line 56
    iget v10, p0, LQ0/A;->g:I

    .line 57
    .line 58
    invoke-static {v10}, LQ0/v;->f(I)Z

    .line 59
    .line 60
    .line 61
    move-result v10

    .line 62
    if-eqz v10, :cond_1

    .line 63
    .line 64
    sget-object v10, LQ0/t;->f:LQ0/t;

    .line 65
    .line 66
    invoke-interface {v7, v10}, Lz0/i;->f(Lz0/h;)Lz0/g;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    check-cast v7, LQ0/P;

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :catchall_1
    move-exception v3

    .line 74
    goto :goto_4

    .line 75
    :cond_1
    move-object v7, v6

    .line 76
    :goto_1
    if-eqz v7, :cond_2

    .line 77
    .line 78
    invoke-interface {v7}, LQ0/P;->b()Z

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    if-nez v10, :cond_2

    .line 83
    .line 84
    check-cast v7, LQ0/Z;

    .line 85
    .line 86
    invoke-virtual {v7}, LQ0/Z;->A()Ljava/util/concurrent/CancellationException;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-virtual {p0, v8, v7}, LQ0/A;->b(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v7}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    invoke-virtual {v3, v7}, LB0/b;->m(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_2
    if-eqz v9, :cond_3

    .line 102
    .line 103
    invoke-static {v9}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    invoke-virtual {v3, v7}, LB0/b;->m(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_3
    invoke-virtual {p0, v8}, LQ0/A;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    invoke-virtual {v3, v7}, LB0/b;->m(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 116
    .line 117
    .line 118
    :goto_2
    if-eqz v5, :cond_4

    .line 119
    .line 120
    :try_start_2
    invoke-virtual {v5}, LQ0/j0;->X()Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-eqz v3, :cond_5

    .line 125
    .line 126
    :cond_4
    invoke-static {v4, v2}, LV0/a;->g(Lz0/i;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 127
    .line 128
    .line 129
    :cond_5
    :try_start_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 130
    .line 131
    .line 132
    goto :goto_3

    .line 133
    :catchall_2
    move-exception v0

    .line 134
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    :goto_3
    invoke-static {v0}, Lx0/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {p0, v6, v0}, LQ0/A;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 143
    .line 144
    .line 145
    goto :goto_7

    .line 146
    :goto_4
    if-eqz v5, :cond_6

    .line 147
    .line 148
    :try_start_4
    invoke-virtual {v5}, LQ0/j0;->X()Z

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    if-eqz v5, :cond_7

    .line 153
    .line 154
    :cond_6
    invoke-static {v4, v2}, LV0/a;->g(Lz0/i;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    :cond_7
    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 158
    :goto_5
    :try_start_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 159
    .line 160
    .line 161
    goto :goto_6

    .line 162
    :catchall_3
    move-exception v0

    .line 163
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    :goto_6
    invoke-static {v0}, Lx0/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {p0, v2, v0}, LQ0/A;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 172
    .line 173
    .line 174
    :goto_7
    return-void
.end method
