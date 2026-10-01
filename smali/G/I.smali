.class public final LG/I;
.super LB0/g;
.source "SourceFile"

# interfaces
.implements LH0/l;


# instance fields
.field public final synthetic i:I

.field public j:I

.field public final synthetic k:LG/S;

.field public l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(LG/S;Lz0/i;LH0/p;Lz0/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LG/I;->i:I

    .line 1
    iput-object p1, p0, LG/I;->k:LG/S;

    iput-object p2, p0, LG/I;->m:Ljava/lang/Object;

    check-cast p3, LB0/g;

    iput-object p3, p0, LG/I;->n:Ljava/io/Serializable;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, LB0/g;-><init>(ILz0/d;)V

    return-void
.end method

.method public constructor <init>(LI0/p;LG/S;LI0/o;Lz0/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LG/I;->i:I

    .line 2
    iput-object p1, p0, LG/I;->m:Ljava/lang/Object;

    iput-object p2, p0, LG/I;->k:LG/S;

    iput-object p3, p0, LG/I;->n:Ljava/io/Serializable;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, LB0/g;-><init>(ILz0/d;)V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LG/I;->i:I

    .line 2
    .line 3
    check-cast p1, Lz0/d;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, LG/I;

    .line 9
    .line 10
    iget-object v1, p0, LG/I;->n:Ljava/io/Serializable;

    .line 11
    .line 12
    check-cast v1, LB0/g;

    .line 13
    .line 14
    iget-object v2, p0, LG/I;->k:LG/S;

    .line 15
    .line 16
    iget-object v3, p0, LG/I;->m:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Lz0/i;

    .line 19
    .line 20
    invoke-direct {v0, v2, v3, v1, p1}, LG/I;-><init>(LG/S;Lz0/i;LH0/p;Lz0/d;)V

    .line 21
    .line 22
    .line 23
    sget-object p1, Lx0/g;->a:Lx0/g;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, LG/I;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :pswitch_0
    new-instance v0, LG/I;

    .line 31
    .line 32
    iget-object v1, p0, LG/I;->m:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, LI0/p;

    .line 35
    .line 36
    iget-object v2, p0, LG/I;->k:LG/S;

    .line 37
    .line 38
    iget-object v3, p0, LG/I;->n:Ljava/io/Serializable;

    .line 39
    .line 40
    check-cast v3, LI0/o;

    .line 41
    .line 42
    invoke-direct {v0, v1, v2, v3, p1}, LG/I;-><init>(LI0/p;LG/S;LI0/o;Lz0/d;)V

    .line 43
    .line 44
    .line 45
    sget-object p1, Lx0/g;->a:Lx0/g;

    .line 46
    .line 47
    invoke-virtual {v0, p1}, LG/I;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, LG/I;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, LA0/a;->e:LA0/a;

    .line 7
    .line 8
    iget v1, p0, LG/I;->j:I

    .line 9
    .line 10
    iget-object v2, p0, LG/I;->k:LG/S;

    .line 11
    .line 12
    const/4 v3, 0x3

    .line 13
    const/4 v4, 0x2

    .line 14
    const/4 v5, 0x1

    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    if-eq v1, v5, :cond_2

    .line 18
    .line 19
    if-eq v1, v4, :cond_1

    .line 20
    .line 21
    if-ne v1, v3, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, LG/I;->l:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_3

    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_1
    iget-object v1, p0, LG/I;->l:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, LG/d;

    .line 40
    .line 41
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput v5, p0, LG/I;->j:I

    .line 53
    .line 54
    invoke-static {v2, v5, p0}, LG/S;->f(LG/S;ZLB0/b;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-ne p1, v0, :cond_4

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_4
    :goto_0
    move-object v1, p1

    .line 62
    check-cast v1, LG/d;

    .line 63
    .line 64
    new-instance p1, LG/K;

    .line 65
    .line 66
    iget-object v6, p0, LG/I;->n:Ljava/io/Serializable;

    .line 67
    .line 68
    check-cast v6, LB0/g;

    .line 69
    .line 70
    const/4 v7, 0x0

    .line 71
    invoke-direct {p1, v6, v1, v7}, LG/K;-><init>(LH0/p;LG/d;Lz0/d;)V

    .line 72
    .line 73
    .line 74
    iput-object v1, p0, LG/I;->l:Ljava/lang/Object;

    .line 75
    .line 76
    iput v4, p0, LG/I;->j:I

    .line 77
    .line 78
    iget-object v4, p0, LG/I;->m:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v4, Lz0/i;

    .line 81
    .line 82
    invoke-static {v4, p1, p0}, LQ0/v;->n(Lz0/i;LH0/p;LB0/g;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-ne p1, v0, :cond_5

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_5
    :goto_1
    iget-object v4, v1, LG/d;->b:Ljava/lang/Object;

    .line 90
    .line 91
    if-eqz v4, :cond_6

    .line 92
    .line 93
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    goto :goto_2

    .line 98
    :cond_6
    const/4 v4, 0x0

    .line 99
    :goto_2
    iget v6, v1, LG/d;->c:I

    .line 100
    .line 101
    if-ne v4, v6, :cond_8

    .line 102
    .line 103
    iget-object v1, v1, LG/d;->b:Ljava/lang/Object;

    .line 104
    .line 105
    invoke-static {v1, p1}, LI0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-nez v1, :cond_7

    .line 110
    .line 111
    iput-object p1, p0, LG/I;->l:Ljava/lang/Object;

    .line 112
    .line 113
    iput v3, p0, LG/I;->j:I

    .line 114
    .line 115
    invoke-virtual {v2, p1, v5, p0}, LG/S;->j(Ljava/lang/Object;ZLB0/b;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    if-ne v1, v0, :cond_7

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_7
    move-object v0, p1

    .line 123
    :goto_3
    return-object v0

    .line 124
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 125
    .line 126
    const-string v0, "Data in DataStore was mutated but DataStore is only compatible with Immutable types."

    .line 127
    .line 128
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw p1

    .line 132
    :pswitch_0
    sget-object v0, LA0/a;->e:LA0/a;

    .line 133
    .line 134
    iget v1, p0, LG/I;->j:I

    .line 135
    .line 136
    iget-object v2, p0, LG/I;->n:Ljava/io/Serializable;

    .line 137
    .line 138
    check-cast v2, LI0/o;

    .line 139
    .line 140
    iget-object v3, p0, LG/I;->m:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v3, LI0/p;

    .line 143
    .line 144
    const/4 v4, 0x3

    .line 145
    const/4 v5, 0x2

    .line 146
    iget-object v6, p0, LG/I;->k:LG/S;

    .line 147
    .line 148
    const/4 v7, 0x1

    .line 149
    if-eqz v1, :cond_c

    .line 150
    .line 151
    if-eq v1, v7, :cond_b

    .line 152
    .line 153
    if-eq v1, v5, :cond_a

    .line 154
    .line 155
    if-ne v1, v4, :cond_9

    .line 156
    .line 157
    iget-object v0, p0, LG/I;->l:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, Ljava/io/Serializable;

    .line 160
    .line 161
    move-object v2, v0

    .line 162
    check-cast v2, LI0/o;

    .line 163
    .line 164
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    goto :goto_7

    .line 168
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 169
    .line 170
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 171
    .line 172
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw p1

    .line 176
    :cond_a
    iget-object v1, p0, LG/I;->l:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v1, Ljava/io/Serializable;

    .line 179
    .line 180
    check-cast v1, LI0/o;

    .line 181
    .line 182
    :try_start_0
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V
    :try_end_0
    .catch LG/c; {:try_start_0 .. :try_end_0} :catch_0

    .line 183
    .line 184
    .line 185
    goto :goto_5

    .line 186
    :catch_0
    nop

    .line 187
    goto :goto_6

    .line 188
    :cond_b
    iget-object v1, p0, LG/I;->l:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v1, Ljava/io/Serializable;

    .line 191
    .line 192
    check-cast v1, LI0/p;

    .line 193
    .line 194
    :try_start_1
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V
    :try_end_1
    .catch LG/c; {:try_start_1 .. :try_end_1} :catch_0

    .line 195
    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_c
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    :try_start_2
    iput-object v3, p0, LG/I;->l:Ljava/lang/Object;

    .line 202
    .line 203
    iput v7, p0, LG/I;->j:I

    .line 204
    .line 205
    invoke-virtual {v6, p0}, LG/S;->i(LB0/b;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    if-ne p1, v0, :cond_d

    .line 210
    .line 211
    goto :goto_9

    .line 212
    :cond_d
    move-object v1, v3

    .line 213
    :goto_4
    iput-object p1, v1, LI0/p;->e:Ljava/lang/Object;

    .line 214
    .line 215
    invoke-virtual {v6}, LG/S;->g()LG/l0;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    iput-object v2, p0, LG/I;->l:Ljava/lang/Object;

    .line 220
    .line 221
    iput v5, p0, LG/I;->j:I

    .line 222
    .line 223
    invoke-virtual {p1}, LG/l0;->a()Ljava/lang/Integer;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    if-ne p1, v0, :cond_e

    .line 228
    .line 229
    goto :goto_9

    .line 230
    :cond_e
    move-object v1, v2

    .line 231
    :goto_5
    check-cast p1, Ljava/lang/Number;

    .line 232
    .line 233
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 234
    .line 235
    .line 236
    move-result p1

    .line 237
    iput p1, v1, LI0/o;->e:I
    :try_end_2
    .catch LG/c; {:try_start_2 .. :try_end_2} :catch_0

    .line 238
    .line 239
    goto :goto_8

    .line 240
    :goto_6
    iget-object p1, v3, LI0/p;->e:Ljava/lang/Object;

    .line 241
    .line 242
    iput-object v2, p0, LG/I;->l:Ljava/lang/Object;

    .line 243
    .line 244
    iput v4, p0, LG/I;->j:I

    .line 245
    .line 246
    invoke-virtual {v6, p1, v7, p0}, LG/S;->j(Ljava/lang/Object;ZLB0/b;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    if-ne p1, v0, :cond_f

    .line 251
    .line 252
    goto :goto_9

    .line 253
    :cond_f
    :goto_7
    check-cast p1, Ljava/lang/Number;

    .line 254
    .line 255
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 256
    .line 257
    .line 258
    move-result p1

    .line 259
    iput p1, v2, LI0/o;->e:I

    .line 260
    .line 261
    :goto_8
    sget-object v0, Lx0/g;->a:Lx0/g;

    .line 262
    .line 263
    :goto_9
    return-object v0

    .line 264
    nop

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
