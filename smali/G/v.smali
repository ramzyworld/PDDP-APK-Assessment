.class public final LG/v;
.super LB0/g;
.source "SourceFile"

# interfaces
.implements LH0/p;


# instance fields
.field public i:LG/d;

.field public j:I

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:LG/S;


# direct methods
.method public constructor <init>(LG/S;Lz0/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LG/v;->l:LG/S;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, LB0/g;-><init>(ILz0/d;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lz0/d;)Lz0/d;
    .locals 2

    .line 1
    new-instance v0, LG/v;

    .line 2
    .line 3
    iget-object v1, p0, LG/v;->l:LG/S;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LG/v;-><init>(LG/S;Lz0/d;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LG/v;->k:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LT0/e;

    .line 2
    .line 3
    check-cast p2, Lz0/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LG/v;->b(Ljava/lang/Object;Lz0/d;)Lz0/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LG/v;

    .line 10
    .line 11
    sget-object p2, Lx0/g;->a:Lx0/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LG/v;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, LA0/a;->e:LA0/a;

    .line 2
    .line 3
    iget v1, p0, LG/v;->j:I

    .line 4
    .line 5
    sget-object v2, Lx0/g;->a:Lx0/g;

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, p0, LG/v;->l:LG/S;

    .line 10
    .line 11
    const/4 v6, 0x2

    .line 12
    const/4 v7, 0x0

    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    if-eq v1, v4, :cond_2

    .line 16
    .line 17
    if-eq v1, v6, :cond_1

    .line 18
    .line 19
    if-ne v1, v3, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto/16 :goto_3

    .line 25
    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_1
    iget-object v1, p0, LG/v;->i:LG/d;

    .line 35
    .line 36
    iget-object v4, p0, LG/v;->k:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v4, LT0/e;

    .line 39
    .line 40
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    iget-object v1, p0, LG/v;->k:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, LT0/e;

    .line 47
    .line 48
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    move-object v4, v1

    .line 52
    goto :goto_0

    .line 53
    :cond_3
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, LG/v;->k:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p1, LT0/e;

    .line 59
    .line 60
    iput-object p1, p0, LG/v;->k:Ljava/lang/Object;

    .line 61
    .line 62
    iput v4, p0, LG/v;->j:I

    .line 63
    .line 64
    iget-object v1, v5, LG/S;->g:LQ0/u;

    .line 65
    .line 66
    invoke-interface {v1}, LQ0/u;->k()Lz0/i;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    new-instance v4, LG/J;

    .line 71
    .line 72
    invoke-direct {v4, v5, v7}, LG/J;-><init>(LG/S;Lz0/d;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v1, v4, p0}, LQ0/v;->n(Lz0/i;LH0/p;LB0/g;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-ne v1, v0, :cond_4

    .line 80
    .line 81
    return-object v0

    .line 82
    :cond_4
    move-object v4, p1

    .line 83
    move-object p1, v1

    .line 84
    :goto_0
    move-object v1, p1

    .line 85
    check-cast v1, LG/m0;

    .line 86
    .line 87
    instance-of p1, v1, LG/d;

    .line 88
    .line 89
    if-eqz p1, :cond_5

    .line 90
    .line 91
    move-object p1, v1

    .line 92
    check-cast p1, LG/d;

    .line 93
    .line 94
    iget-object p1, p1, LG/d;->b:Ljava/lang/Object;

    .line 95
    .line 96
    iput-object v4, p0, LG/v;->k:Ljava/lang/Object;

    .line 97
    .line 98
    move-object v8, v1

    .line 99
    check-cast v8, LG/d;

    .line 100
    .line 101
    iput-object v8, p0, LG/v;->i:LG/d;

    .line 102
    .line 103
    iput v6, p0, LG/v;->j:I

    .line 104
    .line 105
    invoke-interface {v4, p1, p0}, LT0/e;->a(Ljava/lang/Object;Lz0/d;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-ne p1, v0, :cond_6

    .line 110
    .line 111
    return-object v0

    .line 112
    :cond_5
    instance-of p1, v1, LG/n0;

    .line 113
    .line 114
    if-nez p1, :cond_b

    .line 115
    .line 116
    instance-of p1, v1, LG/f0;

    .line 117
    .line 118
    if-nez p1, :cond_a

    .line 119
    .line 120
    instance-of p1, v1, LG/d0;

    .line 121
    .line 122
    if-eqz p1, :cond_6

    .line 123
    .line 124
    return-object v2

    .line 125
    :cond_6
    :goto_1
    iget-object p1, v5, LG/S;->l:LD/j;

    .line 126
    .line 127
    iget-object p1, p1, LD/j;->f:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast p1, LT0/q;

    .line 130
    .line 131
    new-instance v8, LG/p;

    .line 132
    .line 133
    invoke-direct {v8, v5, v7}, LG/p;-><init>(LG/S;Lz0/d;)V

    .line 134
    .line 135
    .line 136
    new-instance v9, LN/Q;

    .line 137
    .line 138
    const/4 v10, 0x2

    .line 139
    invoke-direct {v9, v10, v8, p1}, LN/Q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    new-instance p1, LG/q;

    .line 143
    .line 144
    invoke-direct {p1, v6, v7}, LB0/g;-><init>(ILz0/d;)V

    .line 145
    .line 146
    .line 147
    new-instance v6, LN/Q;

    .line 148
    .line 149
    const/4 v8, 0x4

    .line 150
    invoke-direct {v6, v8, v9, p1}, LN/Q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    new-instance p1, LG/r;

    .line 154
    .line 155
    invoke-direct {p1, v1, v7}, LG/r;-><init>(LG/m0;Lz0/d;)V

    .line 156
    .line 157
    .line 158
    new-instance v1, LN/Q;

    .line 159
    .line 160
    const/4 v8, 0x3

    .line 161
    invoke-direct {v1, v8, v6, p1}, LN/Q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    new-instance p1, LD/j;

    .line 165
    .line 166
    const/4 v6, 0x2

    .line 167
    invoke-direct {p1, v6, v1}, LD/j;-><init>(ILjava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    new-instance v1, LG/s;

    .line 171
    .line 172
    invoke-direct {v1, v5, v7}, LG/s;-><init>(LG/S;Lz0/d;)V

    .line 173
    .line 174
    .line 175
    new-instance v5, LT0/i;

    .line 176
    .line 177
    invoke-direct {v5, p1, v1}, LT0/i;-><init>(LD/j;LG/s;)V

    .line 178
    .line 179
    .line 180
    iput-object v7, p0, LG/v;->k:Ljava/lang/Object;

    .line 181
    .line 182
    iput-object v7, p0, LG/v;->i:LG/d;

    .line 183
    .line 184
    iput v3, p0, LG/v;->j:I

    .line 185
    .line 186
    instance-of p1, v4, LT0/t;

    .line 187
    .line 188
    if-nez p1, :cond_9

    .line 189
    .line 190
    invoke-virtual {v5, v4, p0}, LT0/i;->g(LT0/e;Lz0/d;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    if-ne p1, v0, :cond_7

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_7
    move-object p1, v2

    .line 198
    :goto_2
    if-ne p1, v0, :cond_8

    .line 199
    .line 200
    return-object v0

    .line 201
    :cond_8
    :goto_3
    return-object v2

    .line 202
    :cond_9
    check-cast v4, LT0/t;

    .line 203
    .line 204
    iget-object p1, v4, LT0/t;->e:Ljava/lang/Throwable;

    .line 205
    .line 206
    throw p1

    .line 207
    :cond_a
    check-cast v1, LG/f0;

    .line 208
    .line 209
    iget-object p1, v1, LG/f0;->b:Ljava/lang/Throwable;

    .line 210
    .line 211
    throw p1

    .line 212
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 213
    .line 214
    const-string v0, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    .line 215
    .line 216
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    throw p1
.end method
