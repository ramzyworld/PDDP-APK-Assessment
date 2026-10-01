.class public final LY0/b;
.super LI0/j;
.source "SourceFile"

# interfaces
.implements LH0/l;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LY0/b;->f:I

    iput-object p2, p0, LY0/b;->g:Ljava/lang/Object;

    iput-object p3, p0, LY0/b;->h:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LI0/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LY0/b;->f:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Ljava/lang/Throwable;

    .line 11
    .line 12
    iget-object v2, v0, LY0/b;->g:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, LG/M;

    .line 15
    .line 16
    invoke-virtual {v2, v1}, LG/M;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    iget-object v2, v0, LY0/b;->h:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, LG/n;

    .line 22
    .line 23
    iget-object v3, v2, LG/n;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, LS0/b;

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-virtual {v3, v1, v4}, LS0/b;->f(Ljava/lang/Throwable;Z)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object v3, v2, LG/n;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, LS0/b;

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    sget-object v10, LS0/b;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 39
    .line 40
    invoke-virtual {v10, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 41
    .line 42
    .line 43
    move-result-wide v4

    .line 44
    sget-object v11, LS0/b;->g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 45
    .line 46
    invoke-virtual {v11, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v6

    .line 50
    const/4 v12, 0x1

    .line 51
    invoke-virtual {v3, v6, v7, v12}, LS0/b;->r(JZ)Z

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    if-eqz v8, :cond_1

    .line 56
    .line 57
    invoke-virtual {v3}, LS0/b;->l()Ljava/lang/Throwable;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    new-instance v4, LS0/g;

    .line 62
    .line 63
    invoke-direct {v4, v3}, LS0/g;-><init>(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    goto/16 :goto_5

    .line 67
    .line 68
    :cond_1
    const-wide v8, 0xfffffffffffffffL

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    and-long/2addr v6, v8

    .line 74
    sget-object v13, LS0/i;->a:LS0/h;

    .line 75
    .line 76
    cmp-long v8, v4, v6

    .line 77
    .line 78
    if-ltz v8, :cond_2

    .line 79
    .line 80
    :goto_0
    move-object v4, v13

    .line 81
    goto/16 :goto_5

    .line 82
    .line 83
    :cond_2
    sget-object v14, LS0/d;->k:LD/j;

    .line 84
    .line 85
    sget-object v4, LS0/b;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 86
    .line 87
    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    check-cast v4, LS0/j;

    .line 92
    .line 93
    :goto_1
    invoke-virtual {v11, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 94
    .line 95
    .line 96
    move-result-wide v5

    .line 97
    invoke-virtual {v3, v5, v6, v12}, LS0/b;->r(JZ)Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-eqz v5, :cond_3

    .line 102
    .line 103
    invoke-virtual {v3}, LS0/b;->l()Ljava/lang/Throwable;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    new-instance v4, LS0/g;

    .line 108
    .line 109
    invoke-direct {v4, v3}, LS0/g;-><init>(Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    goto/16 :goto_5

    .line 113
    .line 114
    :cond_3
    invoke-virtual {v10, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 115
    .line 116
    .line 117
    move-result-wide v7

    .line 118
    sget v5, LS0/d;->b:I

    .line 119
    .line 120
    int-to-long v5, v5

    .line 121
    move-object v15, v13

    .line 122
    div-long v12, v7, v5

    .line 123
    .line 124
    rem-long v5, v7, v5

    .line 125
    .line 126
    long-to-int v9, v5

    .line 127
    iget-wide v5, v4, LV0/v;->g:J

    .line 128
    .line 129
    cmp-long v16, v5, v12

    .line 130
    .line 131
    if-eqz v16, :cond_5

    .line 132
    .line 133
    invoke-virtual {v3, v12, v13, v4}, LS0/b;->k(JLS0/j;)LS0/j;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    if-nez v5, :cond_4

    .line 138
    .line 139
    :goto_2
    move-object v13, v15

    .line 140
    const/4 v12, 0x1

    .line 141
    goto :goto_1

    .line 142
    :cond_4
    move-object v12, v5

    .line 143
    goto :goto_3

    .line 144
    :cond_5
    move-object v12, v4

    .line 145
    :goto_3
    move-object v4, v3

    .line 146
    move-object v5, v12

    .line 147
    move v6, v9

    .line 148
    move-wide/from16 v16, v7

    .line 149
    .line 150
    move v13, v9

    .line 151
    move-object v9, v14

    .line 152
    invoke-virtual/range {v4 .. v9}, LS0/b;->A(LS0/j;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    sget-object v5, LS0/d;->m:LD/j;

    .line 157
    .line 158
    if-ne v4, v5, :cond_8

    .line 159
    .line 160
    instance-of v4, v14, LQ0/l0;

    .line 161
    .line 162
    if-eqz v4, :cond_6

    .line 163
    .line 164
    check-cast v14, LQ0/l0;

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_6
    const/4 v14, 0x0

    .line 168
    :goto_4
    if-eqz v14, :cond_7

    .line 169
    .line 170
    invoke-interface {v14, v12, v13}, LQ0/l0;->a(LV0/v;I)V

    .line 171
    .line 172
    .line 173
    :cond_7
    move-wide/from16 v5, v16

    .line 174
    .line 175
    invoke-virtual {v3, v5, v6}, LS0/b;->C(J)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12}, LV0/v;->h()V

    .line 179
    .line 180
    .line 181
    move-object v13, v15

    .line 182
    goto :goto_0

    .line 183
    :cond_8
    move-wide/from16 v5, v16

    .line 184
    .line 185
    sget-object v7, LS0/d;->o:LD/j;

    .line 186
    .line 187
    if-ne v4, v7, :cond_a

    .line 188
    .line 189
    invoke-virtual {v3}, LS0/b;->p()J

    .line 190
    .line 191
    .line 192
    move-result-wide v7

    .line 193
    cmp-long v4, v5, v7

    .line 194
    .line 195
    if-gez v4, :cond_9

    .line 196
    .line 197
    invoke-virtual {v12}, LV0/d;->a()V

    .line 198
    .line 199
    .line 200
    :cond_9
    move-object v4, v12

    .line 201
    goto :goto_2

    .line 202
    :cond_a
    sget-object v3, LS0/d;->n:LD/j;

    .line 203
    .line 204
    if-eq v4, v3, :cond_d

    .line 205
    .line 206
    invoke-virtual {v12}, LV0/d;->a()V

    .line 207
    .line 208
    .line 209
    move-object v13, v4

    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :goto_5
    instance-of v3, v4, LS0/h;

    .line 213
    .line 214
    const/4 v5, 0x0

    .line 215
    if-nez v3, :cond_b

    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_b
    move-object v4, v5

    .line 219
    :goto_6
    sget-object v3, Lx0/g;->a:Lx0/g;

    .line 220
    .line 221
    if-eqz v4, :cond_c

    .line 222
    .line 223
    sget-object v5, LG/N;->f:LG/N;

    .line 224
    .line 225
    invoke-virtual {v5, v4, v1}, LG/N;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-object v5, v3

    .line 229
    :cond_c
    if-nez v5, :cond_0

    .line 230
    .line 231
    return-object v3

    .line 232
    :cond_d
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 233
    .line 234
    const-string v2, "unexpected"

    .line 235
    .line 236
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    throw v1

    .line 240
    :pswitch_0
    move-object/from16 v1, p1

    .line 241
    .line 242
    check-cast v1, Ljava/lang/Throwable;

    .line 243
    .line 244
    sget-object v1, LY0/d;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 245
    .line 246
    iget-object v2, v0, LY0/b;->h:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v2, LY0/c;

    .line 249
    .line 250
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    iget-object v2, v0, LY0/b;->g:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v2, LY0/d;

    .line 256
    .line 257
    const/4 v3, 0x0

    .line 258
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2, v3}, LY0/d;->e(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    sget-object v1, Lx0/g;->a:Lx0/g;

    .line 265
    .line 266
    return-object v1

    .line 267
    :pswitch_1
    move-object/from16 v1, p1

    .line 268
    .line 269
    check-cast v1, Ljava/lang/Throwable;

    .line 270
    .line 271
    iget-object v1, v0, LY0/b;->h:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v1, LY0/c;

    .line 274
    .line 275
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    iget-object v1, v0, LY0/b;->g:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v1, LY0/d;

    .line 281
    .line 282
    const/4 v2, 0x0

    .line 283
    invoke-virtual {v1, v2}, LY0/d;->e(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    sget-object v1, Lx0/g;->a:Lx0/g;

    .line 287
    .line 288
    return-object v1

    .line 289
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
