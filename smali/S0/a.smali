.class public final LS0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ0/l0;


# instance fields
.field public e:Ljava/lang/Object;

.field public f:LQ0/f;

.field public final synthetic g:LS0/b;


# direct methods
.method public constructor <init>(LS0/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LS0/a;->g:LS0/b;

    .line 5
    .line 6
    sget-object p1, LS0/d;->p:LD/j;

    .line 7
    .line 8
    iput-object p1, p0, LS0/a;->e:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(LV0/v;I)V
    .locals 1

    .line 1
    iget-object v0, p0, LS0/a;->f:LQ0/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, LQ0/f;->a(LV0/v;I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final b(LT0/f;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    sget-object v0, LS0/b;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 4
    .line 5
    iget-object v8, v7, LS0/a;->g:LS0/b;

    .line 6
    .line 7
    invoke-virtual {v0, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, LS0/j;

    .line 12
    .line 13
    :cond_0
    :goto_0
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget-object v1, LS0/b;->g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 17
    .line 18
    invoke-virtual {v1, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    const/4 v9, 0x1

    .line 23
    invoke-virtual {v8, v1, v2, v9}, LS0/b;->r(JZ)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    sget-object v0, LS0/d;->l:LD/j;

    .line 30
    .line 31
    iput-object v0, v7, LS0/a;->e:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-virtual {v8}, LS0/b;->l()Ljava/lang/Throwable;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 40
    .line 41
    goto/16 :goto_6

    .line 42
    .line 43
    :cond_1
    sget v1, LV0/w;->a:I

    .line 44
    .line 45
    throw v0

    .line 46
    :cond_2
    sget-object v1, LS0/b;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 47
    .line 48
    invoke-virtual {v1, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 49
    .line 50
    .line 51
    move-result-wide v10

    .line 52
    sget v1, LS0/d;->b:I

    .line 53
    .line 54
    int-to-long v1, v1

    .line 55
    div-long v3, v10, v1

    .line 56
    .line 57
    rem-long v1, v10, v1

    .line 58
    .line 59
    long-to-int v12, v1

    .line 60
    iget-wide v1, v0, LV0/v;->g:J

    .line 61
    .line 62
    cmp-long v5, v1, v3

    .line 63
    .line 64
    if-eqz v5, :cond_4

    .line 65
    .line 66
    invoke-virtual {v8, v3, v4, v0}, LS0/b;->k(JLS0/j;)LS0/j;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    if-nez v1, :cond_3

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    move-object v0, v1

    .line 74
    :cond_4
    const/4 v6, 0x0

    .line 75
    move-object v1, v8

    .line 76
    move-object v2, v0

    .line 77
    move v3, v12

    .line 78
    move-wide v4, v10

    .line 79
    invoke-virtual/range {v1 .. v6}, LS0/b;->A(LS0/j;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    sget-object v13, LS0/d;->m:LD/j;

    .line 84
    .line 85
    if-eq v1, v13, :cond_13

    .line 86
    .line 87
    sget-object v14, LS0/d;->o:LD/j;

    .line 88
    .line 89
    if-ne v1, v14, :cond_5

    .line 90
    .line 91
    invoke-virtual {v8}, LS0/b;->p()J

    .line 92
    .line 93
    .line 94
    move-result-wide v1

    .line 95
    cmp-long v3, v10, v1

    .line 96
    .line 97
    if-gez v3, :cond_0

    .line 98
    .line 99
    invoke-virtual {v0}, LV0/d;->a()V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_5
    sget-object v2, LS0/d;->n:LD/j;

    .line 104
    .line 105
    if-ne v1, v2, :cond_12

    .line 106
    .line 107
    iget-object v15, v7, LS0/a;->g:LS0/b;

    .line 108
    .line 109
    invoke-static/range {p1 .. p1}, La/a;->x(Lz0/d;)Lz0/d;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-static {v1}, LQ0/v;->c(Lz0/d;)LQ0/f;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    :try_start_0
    iput-object v6, v7, LS0/a;->f:LQ0/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 118
    .line 119
    move-object v1, v15

    .line 120
    move-object v2, v0

    .line 121
    move v3, v12

    .line 122
    move-wide v4, v10

    .line 123
    move-object v9, v6

    .line 124
    move-object/from16 v6, p0

    .line 125
    .line 126
    :try_start_1
    invoke-virtual/range {v1 .. v6}, LS0/b;->A(LS0/j;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    if-ne v1, v13, :cond_6

    .line 131
    .line 132
    invoke-virtual {v7, v0, v12}, LS0/a;->a(LV0/v;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 133
    .line 134
    .line 135
    goto/16 :goto_4

    .line 136
    .line 137
    :cond_6
    const/4 v12, 0x0

    .line 138
    iget-object v13, v9, LQ0/f;->i:Lz0/i;

    .line 139
    .line 140
    iget-object v6, v15, LS0/b;->f:LH0/l;

    .line 141
    .line 142
    if-ne v1, v14, :cond_11

    .line 143
    .line 144
    :try_start_2
    invoke-virtual {v15}, LS0/b;->p()J

    .line 145
    .line 146
    .line 147
    move-result-wide v1

    .line 148
    cmp-long v3, v10, v1

    .line 149
    .line 150
    if-gez v3, :cond_7

    .line 151
    .line 152
    invoke-virtual {v0}, LV0/d;->a()V

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :catchall_0
    move-exception v0

    .line 157
    goto/16 :goto_5

    .line 158
    .line 159
    :cond_7
    :goto_1
    sget-object v0, LS0/b;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 160
    .line 161
    invoke-virtual {v0, v15}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    check-cast v0, LS0/j;

    .line 166
    .line 167
    :goto_2
    sget-object v1, LS0/b;->g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 168
    .line 169
    invoke-virtual {v1, v15}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 170
    .line 171
    .line 172
    move-result-wide v1

    .line 173
    const/4 v10, 0x1

    .line 174
    invoke-virtual {v15, v1, v2, v10}, LS0/b;->r(JZ)Z

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-eqz v1, :cond_9

    .line 179
    .line 180
    iget-object v0, v7, LS0/a;->f:LQ0/f;

    .line 181
    .line 182
    invoke-static {v0}, LI0/i;->b(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    iput-object v12, v7, LS0/a;->f:LQ0/f;

    .line 186
    .line 187
    sget-object v1, LS0/d;->l:LD/j;

    .line 188
    .line 189
    iput-object v1, v7, LS0/a;->e:Ljava/lang/Object;

    .line 190
    .line 191
    invoke-virtual {v8}, LS0/b;->l()Ljava/lang/Throwable;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    if-nez v1, :cond_8

    .line 196
    .line 197
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 198
    .line 199
    invoke-virtual {v0, v1}, LQ0/f;->m(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    goto/16 :goto_4

    .line 203
    .line 204
    :cond_8
    invoke-static {v1}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-virtual {v0, v1}, LQ0/f;->m(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    goto/16 :goto_4

    .line 212
    .line 213
    :cond_9
    sget-object v1, LS0/b;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 214
    .line 215
    invoke-virtual {v1, v15}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 216
    .line 217
    .line 218
    move-result-wide v16

    .line 219
    sget v1, LS0/d;->b:I

    .line 220
    .line 221
    int-to-long v1, v1

    .line 222
    div-long v3, v16, v1

    .line 223
    .line 224
    rem-long v1, v16, v1

    .line 225
    .line 226
    long-to-int v11, v1

    .line 227
    iget-wide v1, v0, LV0/v;->g:J

    .line 228
    .line 229
    cmp-long v5, v1, v3

    .line 230
    .line 231
    if-eqz v5, :cond_b

    .line 232
    .line 233
    invoke-virtual {v15, v3, v4, v0}, LS0/b;->k(JLS0/j;)LS0/j;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    if-nez v1, :cond_a

    .line 238
    .line 239
    goto :goto_2

    .line 240
    :cond_a
    move-object v0, v1

    .line 241
    :cond_b
    move-object v1, v15

    .line 242
    move-object v2, v0

    .line 243
    move v3, v11

    .line 244
    move-wide/from16 v4, v16

    .line 245
    .line 246
    move-object v14, v6

    .line 247
    move-object/from16 v6, p0

    .line 248
    .line 249
    invoke-virtual/range {v1 .. v6}, LS0/b;->A(LS0/j;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    sget-object v2, LS0/d;->m:LD/j;

    .line 254
    .line 255
    if-ne v1, v2, :cond_c

    .line 256
    .line 257
    invoke-virtual {v7, v0, v11}, LS0/a;->a(LV0/v;I)V

    .line 258
    .line 259
    .line 260
    goto :goto_4

    .line 261
    :cond_c
    sget-object v2, LS0/d;->o:LD/j;

    .line 262
    .line 263
    if-ne v1, v2, :cond_e

    .line 264
    .line 265
    invoke-virtual {v15}, LS0/b;->p()J

    .line 266
    .line 267
    .line 268
    move-result-wide v1

    .line 269
    cmp-long v3, v16, v1

    .line 270
    .line 271
    if-gez v3, :cond_d

    .line 272
    .line 273
    invoke-virtual {v0}, LV0/d;->a()V

    .line 274
    .line 275
    .line 276
    :cond_d
    move-object v6, v14

    .line 277
    goto :goto_2

    .line 278
    :cond_e
    sget-object v2, LS0/d;->n:LD/j;

    .line 279
    .line 280
    if-eq v1, v2, :cond_10

    .line 281
    .line 282
    invoke-virtual {v0}, LV0/d;->a()V

    .line 283
    .line 284
    .line 285
    iput-object v1, v7, LS0/a;->e:Ljava/lang/Object;

    .line 286
    .line 287
    iput-object v12, v7, LS0/a;->f:LQ0/f;

    .line 288
    .line 289
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 290
    .line 291
    if-eqz v14, :cond_f

    .line 292
    .line 293
    new-instance v12, LV0/q;

    .line 294
    .line 295
    invoke-direct {v12, v14, v1, v13}, LV0/q;-><init>(LH0/l;Ljava/lang/Object;Lz0/i;)V

    .line 296
    .line 297
    .line 298
    :cond_f
    :goto_3
    invoke-virtual {v9, v0, v12}, LQ0/f;->l(Ljava/lang/Object;LH0/l;)V

    .line 299
    .line 300
    .line 301
    goto :goto_4

    .line 302
    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 303
    .line 304
    const-string v1, "unexpected"

    .line 305
    .line 306
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    throw v0

    .line 310
    :cond_11
    move-object v14, v6

    .line 311
    invoke-virtual {v0}, LV0/d;->a()V

    .line 312
    .line 313
    .line 314
    iput-object v1, v7, LS0/a;->e:Ljava/lang/Object;

    .line 315
    .line 316
    iput-object v12, v7, LS0/a;->f:LQ0/f;

    .line 317
    .line 318
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 319
    .line 320
    if-eqz v14, :cond_f

    .line 321
    .line 322
    new-instance v12, LV0/q;

    .line 323
    .line 324
    invoke-direct {v12, v14, v1, v13}, LV0/q;-><init>(LH0/l;Ljava/lang/Object;Lz0/i;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 325
    .line 326
    .line 327
    goto :goto_3

    .line 328
    :goto_4
    invoke-virtual {v9}, LQ0/f;->u()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    return-object v0

    .line 333
    :catchall_1
    move-exception v0

    .line 334
    move-object v9, v6

    .line 335
    :goto_5
    invoke-virtual {v9}, LQ0/f;->B()V

    .line 336
    .line 337
    .line 338
    throw v0

    .line 339
    :cond_12
    invoke-virtual {v0}, LV0/d;->a()V

    .line 340
    .line 341
    .line 342
    iput-object v1, v7, LS0/a;->e:Ljava/lang/Object;

    .line 343
    .line 344
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 345
    .line 346
    :goto_6
    return-object v0

    .line 347
    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 348
    .line 349
    const-string v1, "unreachable"

    .line 350
    .line 351
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    throw v0
.end method
