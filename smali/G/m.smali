.class public final LG/m;
.super LB0/g;
.source "SourceFile"

# interfaces
.implements LH0/l;


# instance fields
.field public i:Ljava/lang/Object;

.field public j:Ljava/io/Serializable;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/util/Iterator;

.field public n:I

.field public o:I

.field public final synthetic p:LG/S;

.field public final synthetic q:LG/n;


# direct methods
.method public constructor <init>(LG/S;LG/n;Lz0/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LG/m;->p:LG/S;

    .line 2
    .line 3
    iput-object p2, p0, LG/m;->q:LG/n;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p3}, LB0/g;-><init>(ILz0/d;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Lz0/d;

    .line 2
    .line 3
    new-instance v0, LG/m;

    .line 4
    .line 5
    iget-object v1, p0, LG/m;->p:LG/S;

    .line 6
    .line 7
    iget-object v2, p0, LG/m;->q:LG/n;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p1}, LG/m;-><init>(LG/S;LG/n;Lz0/d;)V

    .line 10
    .line 11
    .line 12
    sget-object p1, Lx0/g;->a:Lx0/g;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, LG/m;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    sget-object v0, LA0/a;->e:LA0/a;

    .line 2
    .line 3
    iget v1, p0, LG/m;->o:I

    .line 4
    .line 5
    iget-object v2, p0, LG/m;->q:LG/n;

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    const/4 v4, 0x3

    .line 9
    const/4 v5, 0x2

    .line 10
    iget-object v6, p0, LG/m;->p:LG/S;

    .line 11
    .line 12
    const/4 v7, 0x1

    .line 13
    const/4 v8, 0x0

    .line 14
    if-eqz v1, :cond_4

    .line 15
    .line 16
    if-eq v1, v7, :cond_3

    .line 17
    .line 18
    if-eq v1, v5, :cond_2

    .line 19
    .line 20
    if-eq v1, v4, :cond_1

    .line 21
    .line 22
    if-ne v1, v3, :cond_0

    .line 23
    .line 24
    iget v0, p0, LG/m;->n:I

    .line 25
    .line 26
    iget-object v1, p0, LG/m;->i:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto/16 :goto_4

    .line 32
    .line 33
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1

    .line 41
    :cond_1
    iget-object v1, p0, LG/m;->k:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, LY0/a;

    .line 44
    .line 45
    iget-object v2, p0, LG/m;->j:Ljava/io/Serializable;

    .line 46
    .line 47
    check-cast v2, LI0/p;

    .line 48
    .line 49
    iget-object v4, p0, LG/m;->i:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v4, LI0/n;

    .line 52
    .line 53
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_2

    .line 57
    .line 58
    :cond_2
    iget-object v1, p0, LG/m;->m:Ljava/util/Iterator;

    .line 59
    .line 60
    iget-object v9, p0, LG/m;->l:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v9, LG/l;

    .line 63
    .line 64
    iget-object v10, p0, LG/m;->k:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v10, LI0/p;

    .line 67
    .line 68
    iget-object v11, p0, LG/m;->j:Ljava/io/Serializable;

    .line 69
    .line 70
    check-cast v11, LI0/n;

    .line 71
    .line 72
    iget-object v12, p0, LG/m;->i:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v12, LY0/a;

    .line 75
    .line 76
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    iget-object v1, p0, LG/m;->l:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v1, LI0/p;

    .line 83
    .line 84
    iget-object v9, p0, LG/m;->k:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v9, LI0/p;

    .line 87
    .line 88
    iget-object v10, p0, LG/m;->j:Ljava/io/Serializable;

    .line 89
    .line 90
    check-cast v10, LI0/n;

    .line 91
    .line 92
    iget-object v11, p0, LG/m;->i:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v11, LY0/a;

    .line 95
    .line 96
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_4
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    invoke-static {}, LY0/e;->a()LY0/d;

    .line 104
    .line 105
    .line 106
    move-result-object v11

    .line 107
    new-instance v10, LI0/n;

    .line 108
    .line 109
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 110
    .line 111
    .line 112
    new-instance v1, LI0/p;

    .line 113
    .line 114
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 115
    .line 116
    .line 117
    iput-object v11, p0, LG/m;->i:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v10, p0, LG/m;->j:Ljava/io/Serializable;

    .line 120
    .line 121
    iput-object v1, p0, LG/m;->k:Ljava/lang/Object;

    .line 122
    .line 123
    iput-object v1, p0, LG/m;->l:Ljava/lang/Object;

    .line 124
    .line 125
    iput v7, p0, LG/m;->o:I

    .line 126
    .line 127
    invoke-static {v6, v7, p0}, LG/S;->f(LG/S;ZLB0/b;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    if-ne p1, v0, :cond_5

    .line 132
    .line 133
    return-object v0

    .line 134
    :cond_5
    move-object v9, v1

    .line 135
    :goto_0
    check-cast p1, LG/d;

    .line 136
    .line 137
    iget-object p1, p1, LG/d;->b:Ljava/lang/Object;

    .line 138
    .line 139
    iput-object p1, v1, LI0/p;->e:Ljava/lang/Object;

    .line 140
    .line 141
    new-instance p1, LG/l;

    .line 142
    .line 143
    invoke-direct {p1, v11, v10, v9, v6}, LG/l;-><init>(LY0/a;LI0/n;LI0/p;LG/S;)V

    .line 144
    .line 145
    .line 146
    iget-object v1, v2, LG/n;->c:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v1, Ljava/util/List;

    .line 149
    .line 150
    if-eqz v1, :cond_8

    .line 151
    .line 152
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    move-object v12, v11

    .line 157
    move-object v11, v10

    .line 158
    move-object v10, v9

    .line 159
    move-object v9, p1

    .line 160
    :cond_6
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    if-eqz p1, :cond_7

    .line 165
    .line 166
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    check-cast p1, LH0/p;

    .line 171
    .line 172
    iput-object v12, p0, LG/m;->i:Ljava/lang/Object;

    .line 173
    .line 174
    iput-object v11, p0, LG/m;->j:Ljava/io/Serializable;

    .line 175
    .line 176
    iput-object v10, p0, LG/m;->k:Ljava/lang/Object;

    .line 177
    .line 178
    iput-object v9, p0, LG/m;->l:Ljava/lang/Object;

    .line 179
    .line 180
    iput-object v1, p0, LG/m;->m:Ljava/util/Iterator;

    .line 181
    .line 182
    iput v5, p0, LG/m;->o:I

    .line 183
    .line 184
    invoke-interface {p1, v9, p0}, LH0/p;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    if-ne p1, v0, :cond_6

    .line 189
    .line 190
    return-object v0

    .line 191
    :cond_7
    move-object v9, v10

    .line 192
    move-object v10, v11

    .line 193
    move-object v11, v12

    .line 194
    :cond_8
    iput-object v8, v2, LG/n;->c:Ljava/lang/Object;

    .line 195
    .line 196
    iput-object v10, p0, LG/m;->i:Ljava/lang/Object;

    .line 197
    .line 198
    iput-object v9, p0, LG/m;->j:Ljava/io/Serializable;

    .line 199
    .line 200
    iput-object v11, p0, LG/m;->k:Ljava/lang/Object;

    .line 201
    .line 202
    iput-object v8, p0, LG/m;->l:Ljava/lang/Object;

    .line 203
    .line 204
    iput-object v8, p0, LG/m;->m:Ljava/util/Iterator;

    .line 205
    .line 206
    iput v4, p0, LG/m;->o:I

    .line 207
    .line 208
    move-object v1, v11

    .line 209
    check-cast v1, LY0/d;

    .line 210
    .line 211
    invoke-virtual {v1, p0}, LY0/d;->c(LB0/b;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    if-ne p1, v0, :cond_9

    .line 216
    .line 217
    return-object v0

    .line 218
    :cond_9
    move-object v2, v9

    .line 219
    move-object v4, v10

    .line 220
    :goto_2
    :try_start_0
    iput-boolean v7, v4, LI0/n;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 221
    .line 222
    check-cast v1, LY0/d;

    .line 223
    .line 224
    invoke-virtual {v1, v8}, LY0/d;->e(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    iget-object v1, v2, LI0/p;->e:Ljava/lang/Object;

    .line 228
    .line 229
    if-eqz v1, :cond_a

    .line 230
    .line 231
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    goto :goto_3

    .line 236
    :cond_a
    const/4 p1, 0x0

    .line 237
    :goto_3
    invoke-virtual {v6}, LG/S;->g()LG/l0;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    iput-object v1, p0, LG/m;->i:Ljava/lang/Object;

    .line 242
    .line 243
    iput-object v8, p0, LG/m;->j:Ljava/io/Serializable;

    .line 244
    .line 245
    iput-object v8, p0, LG/m;->k:Ljava/lang/Object;

    .line 246
    .line 247
    iput p1, p0, LG/m;->n:I

    .line 248
    .line 249
    iput v3, p0, LG/m;->o:I

    .line 250
    .line 251
    invoke-virtual {v2}, LG/l0;->a()Ljava/lang/Integer;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    if-ne v2, v0, :cond_b

    .line 256
    .line 257
    return-object v0

    .line 258
    :cond_b
    move v0, p1

    .line 259
    move-object p1, v2

    .line 260
    :goto_4
    check-cast p1, Ljava/lang/Number;

    .line 261
    .line 262
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 263
    .line 264
    .line 265
    move-result p1

    .line 266
    new-instance v2, LG/d;

    .line 267
    .line 268
    invoke-direct {v2, v1, v0, p1}, LG/d;-><init>(Ljava/lang/Object;II)V

    .line 269
    .line 270
    .line 271
    return-object v2

    .line 272
    :catchall_0
    move-exception p1

    .line 273
    check-cast v1, LY0/d;

    .line 274
    .line 275
    invoke-virtual {v1, v8}, LY0/d;->e(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    throw p1
.end method
