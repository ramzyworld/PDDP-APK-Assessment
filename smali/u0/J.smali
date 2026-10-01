.class public final Lu0/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/a;
.implements Lu0/g;


# instance fields
.field public e:Landroid/content/Context;

.field public f:LN/b;

.field public final g:LH/a;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LH/a;

    .line 5
    .line 6
    const/16 v1, 0x19

    .line 7
    .line 8
    invoke-direct {v0, v1}, LH/a;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lu0/J;->g:LH/a;

    .line 12
    .line 13
    return-void
.end method

.method public static final q(Lu0/J;Ljava/lang/String;Ljava/lang/String;LB0/g;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, LJ/d;

    .line 5
    .line 6
    invoke-direct {v0, p1}, LJ/d;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lu0/J;->e:Landroid/content/Context;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    invoke-static {p0}, Lu0/K;->a(Landroid/content/Context;)LD/j;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    new-instance v1, Lu0/k;

    .line 19
    .line 20
    invoke-direct {v1, v0, p2, p1}, Lu0/k;-><init>(LJ/d;Ljava/lang/String;Lz0/d;)V

    .line 21
    .line 22
    .line 23
    new-instance p2, LJ/h;

    .line 24
    .line 25
    invoke-direct {p2, v1, p1}, LJ/h;-><init>(LH0/p;Lz0/d;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p2, p3}, LD/j;->c(LH0/p;LB0/g;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    sget-object p1, LA0/a;->e:LA0/a;

    .line 33
    .line 34
    if-ne p0, p1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    sget-object p0, Lx0/g;->a:Lx0/g;

    .line 38
    .line 39
    :goto_0
    return-object p0

    .line 40
    :cond_1
    const-string p0, "context"

    .line 41
    .line 42
    invoke-static {p0}, LI0/i;->g(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1
.end method

.method public static final s(Lu0/J;Ljava/util/List;LB0/b;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p2, Lu0/v;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p2

    .line 9
    check-cast v0, Lu0/v;

    .line 10
    .line 11
    iget v1, v0, Lu0/v;->o:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Lu0/v;->o:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Lu0/v;

    .line 24
    .line 25
    invoke-direct {v0, p0, p2}, Lu0/v;-><init>(Lu0/J;LB0/b;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p2, v0, Lu0/v;->m:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v1, LA0/a;->e:LA0/a;

    .line 31
    .line 32
    iget v2, v0, Lu0/v;->o:I

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    const-string v4, "context"

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v6, 0x1

    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    if-eq v2, v6, :cond_2

    .line 42
    .line 43
    if-ne v2, v5, :cond_1

    .line 44
    .line 45
    iget-object p0, v0, Lu0/v;->l:LJ/d;

    .line 46
    .line 47
    iget-object p1, v0, Lu0/v;->k:Ljava/util/Iterator;

    .line 48
    .line 49
    iget-object v2, v0, Lu0/v;->j:Ljava/util/Map;

    .line 50
    .line 51
    iget-object v6, v0, Lu0/v;->i:Ljava/util/Set;

    .line 52
    .line 53
    iget-object v7, v0, Lu0/v;->h:Lu0/J;

    .line 54
    .line 55
    invoke-static {p2}, La/a;->O(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_4

    .line 59
    .line 60
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p0

    .line 68
    :cond_2
    iget-object p0, v0, Lu0/v;->j:Ljava/util/Map;

    .line 69
    .line 70
    iget-object p1, v0, Lu0/v;->i:Ljava/util/Set;

    .line 71
    .line 72
    iget-object v2, v0, Lu0/v;->h:Lu0/J;

    .line 73
    .line 74
    invoke-static {p2}, La/a;->O(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    invoke-static {p2}, La/a;->O(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    if-eqz p1, :cond_4

    .line 82
    .line 83
    invoke-static {p1}, Ly0/d;->U(Ljava/util/Collection;)Ljava/util/Set;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    goto :goto_1

    .line 88
    :cond_4
    move-object p1, v3

    .line 89
    :goto_1
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 90
    .line 91
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 92
    .line 93
    .line 94
    iput-object p0, v0, Lu0/v;->h:Lu0/J;

    .line 95
    .line 96
    iput-object p1, v0, Lu0/v;->i:Ljava/util/Set;

    .line 97
    .line 98
    iput-object p2, v0, Lu0/v;->j:Ljava/util/Map;

    .line 99
    .line 100
    iput v6, v0, Lu0/v;->o:I

    .line 101
    .line 102
    iget-object v2, p0, Lu0/J;->e:Landroid/content/Context;

    .line 103
    .line 104
    if-eqz v2, :cond_b

    .line 105
    .line 106
    invoke-static {v2}, Lu0/K;->a(Landroid/content/Context;)LD/j;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    iget-object v2, v2, LD/j;->f:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v2, LG/i;

    .line 113
    .line 114
    invoke-interface {v2}, LG/i;->getData()LT0/d;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    new-instance v6, Lp0/b;

    .line 119
    .line 120
    const/16 v7, 0x11

    .line 121
    .line 122
    invoke-direct {v6, v7, v2}, Lp0/b;-><init>(ILjava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-static {v6, v0}, LT0/r;->c(LT0/d;LB0/b;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    if-ne v2, v1, :cond_5

    .line 130
    .line 131
    goto/16 :goto_5

    .line 132
    .line 133
    :cond_5
    move-object v10, v2

    .line 134
    move-object v2, p0

    .line 135
    move-object p0, p2

    .line 136
    move-object p2, v10

    .line 137
    :goto_2
    check-cast p2, Ljava/util/Set;

    .line 138
    .line 139
    if-eqz p2, :cond_a

    .line 140
    .line 141
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    move-object v6, p1

    .line 146
    move-object p1, p2

    .line 147
    move-object v7, v2

    .line 148
    move-object v2, p0

    .line 149
    :cond_6
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result p0

    .line 153
    if-eqz p0, :cond_9

    .line 154
    .line 155
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    check-cast p0, LJ/d;

    .line 160
    .line 161
    iput-object v7, v0, Lu0/v;->h:Lu0/J;

    .line 162
    .line 163
    iput-object v6, v0, Lu0/v;->i:Ljava/util/Set;

    .line 164
    .line 165
    iput-object v2, v0, Lu0/v;->j:Ljava/util/Map;

    .line 166
    .line 167
    iput-object p1, v0, Lu0/v;->k:Ljava/util/Iterator;

    .line 168
    .line 169
    iput-object p0, v0, Lu0/v;->l:LJ/d;

    .line 170
    .line 171
    iput v5, v0, Lu0/v;->o:I

    .line 172
    .line 173
    iget-object p2, v7, Lu0/J;->e:Landroid/content/Context;

    .line 174
    .line 175
    if-eqz p2, :cond_8

    .line 176
    .line 177
    invoke-static {p2}, Lu0/K;->a(Landroid/content/Context;)LD/j;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    iget-object p2, p2, LD/j;->f:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast p2, LG/i;

    .line 184
    .line 185
    invoke-interface {p2}, LG/i;->getData()LT0/d;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    new-instance v8, Lu0/o;

    .line 190
    .line 191
    const/4 v9, 0x3

    .line 192
    invoke-direct {v8, p2, p0, v9}, Lu0/o;-><init>(LT0/d;LJ/d;I)V

    .line 193
    .line 194
    .line 195
    invoke-static {v8, v0}, LT0/r;->c(LT0/d;LB0/b;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p2

    .line 199
    if-ne p2, v1, :cond_7

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_7
    :goto_4
    iget-object v8, p0, LJ/d;->a:Ljava/lang/String;

    .line 203
    .line 204
    invoke-static {v8, p2, v6}, Lu0/K;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Set;)Z

    .line 205
    .line 206
    .line 207
    move-result v8

    .line 208
    if-eqz v8, :cond_6

    .line 209
    .line 210
    iget-object v8, v7, Lu0/J;->g:LH/a;

    .line 211
    .line 212
    invoke-static {p2, v8}, Lu0/K;->c(Ljava/lang/Object;LH/a;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p2

    .line 216
    if-eqz p2, :cond_6

    .line 217
    .line 218
    iget-object p0, p0, LJ/d;->a:Ljava/lang/String;

    .line 219
    .line 220
    invoke-interface {v2, p0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    goto :goto_3

    .line 224
    :cond_8
    invoke-static {v4}, LI0/i;->g(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    throw v3

    .line 228
    :cond_9
    move-object v1, v2

    .line 229
    goto :goto_5

    .line 230
    :cond_a
    move-object v1, p0

    .line 231
    :goto_5
    return-object v1

    .line 232
    :cond_b
    invoke-static {v4}, LI0/i;->g(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw v3
.end method


# virtual methods
.method public final a(LG/n;)V
    .locals 2

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, LG/n;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lq0/f;

    .line 9
    .line 10
    const-string v0, "binding.binaryMessenger"

    .line 11
    .line 12
    invoke-static {p1, v0}, LI0/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget-object v0, Lu0/g;->d:Lu0/f;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    const-string v1, "data_store"

    .line 22
    .line 23
    invoke-static {p1, v0, v1}, Lu0/f;->b(Lq0/f;Lu0/g;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lu0/J;->f:LN/b;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    const-string v1, "shared_preferences"

    .line 31
    .line 32
    iget-object p1, p1, LN/b;->g:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Lq0/f;

    .line 35
    .line 36
    invoke-static {p1, v0, v1}, Lu0/f;->b(Lq0/f;Lu0/g;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    iput-object v0, p0, Lu0/J;->f:LN/b;

    .line 40
    .line 41
    return-void
.end method

.method public final b(Ljava/lang/String;Lu0/h;)Ljava/lang/Boolean;
    .locals 2

    .line 1
    new-instance p2, LI0/p;

    .line 2
    .line 3
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lu0/p;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p1, p0, p2, v1}, Lu0/p;-><init>(Ljava/lang/String;Lu0/J;LI0/p;Lz0/d;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, LQ0/v;->j(LH0/p;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    iget-object p1, p2, LI0/p;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Ljava/lang/Boolean;

    .line 18
    .line 19
    return-object p1
.end method

.method public final c(Ljava/lang/String;Lu0/h;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance p2, LI0/p;

    .line 2
    .line 3
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lu0/x;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p1, p0, p2, v1}, Lu0/x;-><init>(Ljava/lang/String;Lu0/J;LI0/p;Lz0/d;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, LQ0/v;->j(LH0/p;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    iget-object p1, p2, LI0/p;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Ljava/lang/String;

    .line 18
    .line 19
    return-object p1
.end method

.method public final d(Ljava/lang/String;ZLu0/h;)V
    .locals 1

    .line 1
    new-instance p3, Lu0/B;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p3, p1, p0, p2, v0}, Lu0/B;-><init>(Ljava/lang/String;Lu0/J;ZLz0/d;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p3}, LQ0/v;->j(LH0/p;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final e(Ljava/lang/String;DLu0/h;)V
    .locals 6

    .line 1
    new-instance p4, Lu0/E;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v0, p4

    .line 5
    move-object v1, p1

    .line 6
    move-object v2, p0

    .line 7
    move-wide v3, p2

    .line 8
    invoke-direct/range {v0 .. v5}, Lu0/E;-><init>(Ljava/lang/String;Lu0/J;DLz0/d;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p4}, LQ0/v;->j(LH0/p;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;Lu0/h;)V
    .locals 1

    .line 1
    new-instance p3, Lu0/F;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p3, p0, p1, p2, v0}, Lu0/F;-><init>(Lu0/J;Ljava/lang/String;Ljava/lang/String;Lz0/d;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p3}, LQ0/v;->j(LH0/p;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final g(LG/n;)V
    .locals 4

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, LG/n;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lq0/f;

    .line 9
    .line 10
    const-string v1, "binding.binaryMessenger"

    .line 11
    .line 12
    invoke-static {v0, v1}, LI0/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p1, LG/n;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Landroid/content/Context;

    .line 18
    .line 19
    const-string v2, "binding.applicationContext"

    .line 20
    .line 21
    invoke-static {v1, v2}, LI0/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Lu0/J;->e:Landroid/content/Context;

    .line 25
    .line 26
    :try_start_0
    sget-object v2, Lu0/g;->d:Lu0/f;

    .line 27
    .line 28
    const-string v3, "data_store"

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {v0, p0, v3}, Lu0/f;->b(Lq0/f;Lu0/g;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    new-instance v2, LN/b;

    .line 37
    .line 38
    iget-object v3, p0, Lu0/J;->g:LH/a;

    .line 39
    .line 40
    invoke-direct {v2, v0, v1, v3}, LN/b;-><init>(Lq0/f;Landroid/content/Context;LH/a;)V

    .line 41
    .line 42
    .line 43
    iput-object v2, p0, Lu0/J;->f:LN/b;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catch_0
    move-exception v0

    .line 47
    const-string v1, "SharedPreferencesPlugin"

    .line 48
    .line 49
    const-string v2, "Received exception while setting up SharedPreferencesPlugin"

    .line 50
    .line 51
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 52
    .line 53
    .line 54
    :goto_0
    new-instance v0, Lu0/a;

    .line 55
    .line 56
    invoke-direct {v0}, Lu0/a;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p1}, Lu0/a;->g(LG/n;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final h(Ljava/util/List;Lu0/h;)Ljava/util/List;
    .locals 1

    .line 1
    new-instance p2, Lu0/u;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p2, p0, p1, v0}, Lu0/u;-><init>(Lu0/J;Ljava/util/List;Lz0/d;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, LQ0/v;->j(LH0/p;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, Ly0/d;->T(Ljava/lang/Iterable;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public final i(Ljava/lang/String;Lu0/h;)Ljava/lang/Long;
    .locals 2

    .line 1
    new-instance p2, LI0/p;

    .line 2
    .line 3
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lu0/t;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p1, p0, p2, v1}, Lu0/t;-><init>(Ljava/lang/String;Lu0/J;LI0/p;Lz0/d;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, LQ0/v;->j(LH0/p;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    iget-object p1, p2, LI0/p;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Ljava/lang/Long;

    .line 18
    .line 19
    return-object p1
.end method

.method public final j(Ljava/lang/String;Ljava/lang/String;Lu0/h;)V
    .locals 1

    .line 1
    new-instance p3, Lu0/I;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p3, p0, p1, p2, v0}, Lu0/I;-><init>(Lu0/J;Ljava/lang/String;Ljava/lang/String;Lz0/d;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p3}, LQ0/v;->j(LH0/p;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final k(Ljava/lang/String;Lu0/h;)Lu0/N;
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Lu0/J;->c(Ljava/lang/String;Lu0/h;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 p2, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    const-string v0, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    new-instance p2, Lu0/N;

    .line 17
    .line 18
    sget-object v0, Lu0/L;->g:Lu0/L;

    .line 19
    .line 20
    invoke-direct {p2, p1, v0}, Lu0/N;-><init>(Ljava/lang/String;Lu0/L;)V

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    const-string v0, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu"

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    new-instance p1, Lu0/N;

    .line 33
    .line 34
    sget-object v0, Lu0/L;->f:Lu0/L;

    .line 35
    .line 36
    invoke-direct {p1, p2, v0}, Lu0/N;-><init>(Ljava/lang/String;Lu0/L;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    move-object p2, p1

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    new-instance p1, Lu0/N;

    .line 42
    .line 43
    sget-object v0, Lu0/L;->h:Lu0/L;

    .line 44
    .line 45
    invoke-direct {p1, p2, v0}, Lu0/N;-><init>(Ljava/lang/String;Lu0/L;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    :goto_1
    return-object p2
.end method

.method public final l(Ljava/lang/String;Lu0/h;)Ljava/lang/Double;
    .locals 2

    .line 1
    new-instance p2, LI0/p;

    .line 2
    .line 3
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lu0/r;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p1, p0, p2, v1}, Lu0/r;-><init>(Ljava/lang/String;Lu0/J;LI0/p;Lz0/d;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, LQ0/v;->j(LH0/p;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    iget-object p1, p2, LI0/p;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Ljava/lang/Double;

    .line 18
    .line 19
    return-object p1
.end method

.method public final m(Ljava/lang/String;Ljava/util/List;Lu0/h;)V
    .locals 1

    .line 1
    iget-object p3, p0, Lu0/J;->g:LH/a;

    .line 2
    .line 3
    invoke-virtual {p3, p2}, LH/a;->f(Ljava/util/List;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const-string p3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu"

    .line 8
    .line 9
    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    new-instance p3, Lu0/C;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {p3, p0, p1, p2, v0}, Lu0/C;-><init>(Lu0/J;Ljava/lang/String;Ljava/lang/String;Lz0/d;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p3}, LQ0/v;->j(LH0/p;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final n(Ljava/util/List;Lu0/h;)Ljava/util/Map;
    .locals 1

    .line 1
    new-instance p2, Lu0/l;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p2, p0, p1, v0}, Lu0/l;-><init>(Lu0/J;Ljava/util/List;Lz0/d;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, LQ0/v;->j(LH0/p;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/util/Map;

    .line 12
    .line 13
    return-object p1
.end method

.method public final o(Ljava/lang/String;JLu0/h;)V
    .locals 6

    .line 1
    new-instance p4, Lu0/H;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v0, p4

    .line 5
    move-object v1, p1

    .line 6
    move-object v2, p0

    .line 7
    move-wide v3, p2

    .line 8
    invoke-direct/range {v0 .. v5}, Lu0/H;-><init>(Ljava/lang/String;Lu0/J;JLz0/d;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p4}, LQ0/v;->j(LH0/p;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final p(Ljava/util/List;Lu0/h;)V
    .locals 1

    .line 1
    new-instance p2, Lu0/j;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p2, p0, p1, v0}, Lu0/j;-><init>(Lu0/J;Ljava/util/List;Lz0/d;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, LQ0/v;->j(LH0/p;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final r(Ljava/lang/String;Lu0/h;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lu0/J;->c(Ljava/lang/String;Lu0/h;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 p2, 0x0

    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    const-string v0, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    const-string v0, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lu0/J;->g:LH/a;

    .line 25
    .line 26
    invoke-static {p1, v0}, Lu0/K;->c(Ljava/lang/Object;LH/a;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Ljava/util/List;

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    new-instance p2, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    instance-of v1, v0, Ljava/lang/String;

    .line 54
    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    return-object p2
.end method
