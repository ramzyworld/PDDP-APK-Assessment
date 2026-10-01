.class public final LG/h0;
.super LB0/g;
.source "SourceFile"

# interfaces
.implements LH0/p;


# instance fields
.field public i:LG/O;

.field public j:I

.field public final synthetic k:LG/n;


# direct methods
.method public constructor <init>(LG/n;Lz0/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LG/h0;->k:LG/n;

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
    .locals 1

    .line 1
    new-instance p1, LG/h0;

    .line 2
    .line 3
    iget-object v0, p0, LG/h0;->k:LG/n;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, LG/h0;-><init>(LG/n;Lz0/d;)V

    .line 6
    .line 7
    .line 8
    return-object p1
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
    invoke-virtual {p0, p1, p2}, LG/h0;->b(Ljava/lang/Object;Lz0/d;)Lz0/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LG/h0;

    .line 10
    .line 11
    sget-object p2, Lx0/g;->a:Lx0/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LG/h0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v0, LA0/a;->e:LA0/a;

    .line 4
    .line 5
    iget v2, v1, LG/h0;->j:I

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x2

    .line 9
    iget-object v6, v1, LG/h0;->k:LG/n;

    .line 10
    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    if-eq v2, v4, :cond_1

    .line 14
    .line 15
    if-ne v2, v5, :cond_0

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/a;->O(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    move-object v3, v6

    .line 21
    const/4 v4, 0x0

    .line 22
    goto/16 :goto_b

    .line 23
    .line 24
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :cond_1
    iget-object v2, v1, LG/h0;->i:LG/O;

    .line 33
    .line 34
    invoke-static/range {p1 .. p1}, La/a;->O(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    move-object v3, v2

    .line 38
    move-object/from16 v18, v6

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    move-object/from16 v2, p1

    .line 42
    .line 43
    goto/16 :goto_a

    .line 44
    .line 45
    :cond_2
    invoke-static/range {p1 .. p1}, La/a;->O(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v2, v6, LG/n;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, LD/j;

    .line 51
    .line 52
    iget-object v2, v2, LD/j;->f:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-lez v2, :cond_1b

    .line 61
    .line 62
    :goto_0
    iget-object v2, v6, LG/n;->a:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v2, LQ0/u;

    .line 65
    .line 66
    invoke-interface {v2}, LQ0/u;->k()Lz0/i;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    sget-object v7, LQ0/t;->f:LQ0/t;

    .line 71
    .line 72
    invoke-interface {v2, v7}, Lz0/i;->f(Lz0/h;)Lz0/g;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    check-cast v2, LQ0/P;

    .line 77
    .line 78
    if-eqz v2, :cond_4

    .line 79
    .line 80
    invoke-interface {v2}, LQ0/P;->b()Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-eqz v7, :cond_3

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    check-cast v2, LQ0/Z;

    .line 88
    .line 89
    invoke-virtual {v2}, LQ0/Z;->A()Ljava/util/concurrent/CancellationException;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    throw v0

    .line 94
    :cond_4
    :goto_1
    iget-object v2, v6, LG/n;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v2, LG/O;

    .line 97
    .line 98
    iput-object v2, v1, LG/h0;->i:LG/O;

    .line 99
    .line 100
    iput v4, v1, LG/h0;->j:I

    .line 101
    .line 102
    iget-object v7, v6, LG/n;->c:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v7, LS0/b;

    .line 105
    .line 106
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    sget-object v14, LS0/b;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 110
    .line 111
    invoke-virtual {v14, v7}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    check-cast v8, LS0/j;

    .line 116
    .line 117
    :goto_2
    sget-object v15, LS0/b;->g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 118
    .line 119
    invoke-virtual {v15, v7}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 120
    .line 121
    .line 122
    move-result-wide v9

    .line 123
    invoke-virtual {v7, v9, v10, v4}, LS0/b;->r(JZ)Z

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    if-nez v9, :cond_1a

    .line 128
    .line 129
    sget-object v13, LS0/b;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 130
    .line 131
    invoke-virtual {v13, v7}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 132
    .line 133
    .line 134
    move-result-wide v16

    .line 135
    sget v9, LS0/d;->b:I

    .line 136
    .line 137
    int-to-long v9, v9

    .line 138
    div-long v11, v16, v9

    .line 139
    .line 140
    rem-long v9, v16, v9

    .line 141
    .line 142
    long-to-int v10, v9

    .line 143
    move-object/from16 v18, v6

    .line 144
    .line 145
    iget-wide v5, v8, LV0/v;->g:J

    .line 146
    .line 147
    cmp-long v9, v5, v11

    .line 148
    .line 149
    if-eqz v9, :cond_5

    .line 150
    .line 151
    invoke-virtual {v7, v11, v12, v8}, LS0/b;->k(JLS0/j;)LS0/j;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    if-nez v5, :cond_6

    .line 156
    .line 157
    :goto_3
    move-object/from16 v6, v18

    .line 158
    .line 159
    const/4 v5, 0x2

    .line 160
    goto :goto_2

    .line 161
    :cond_5
    move-object v5, v8

    .line 162
    :cond_6
    const/4 v6, 0x0

    .line 163
    move-object v8, v7

    .line 164
    move-object v9, v5

    .line 165
    move v11, v10

    .line 166
    move/from16 p1, v11

    .line 167
    .line 168
    move-wide/from16 v11, v16

    .line 169
    .line 170
    move-object v3, v13

    .line 171
    move-object v13, v6

    .line 172
    invoke-virtual/range {v8 .. v13}, LS0/b;->A(LS0/j;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    sget-object v13, LS0/d;->m:LD/j;

    .line 177
    .line 178
    const-string v11, "unexpected"

    .line 179
    .line 180
    if-eq v6, v13, :cond_19

    .line 181
    .line 182
    sget-object v12, LS0/d;->o:LD/j;

    .line 183
    .line 184
    if-ne v6, v12, :cond_8

    .line 185
    .line 186
    invoke-virtual {v7}, LS0/b;->p()J

    .line 187
    .line 188
    .line 189
    move-result-wide v8

    .line 190
    cmp-long v3, v16, v8

    .line 191
    .line 192
    if-gez v3, :cond_7

    .line 193
    .line 194
    invoke-virtual {v5}, LV0/d;->a()V

    .line 195
    .line 196
    .line 197
    :cond_7
    move-object v8, v5

    .line 198
    goto :goto_3

    .line 199
    :cond_8
    sget-object v8, LS0/d;->n:LD/j;

    .line 200
    .line 201
    if-ne v6, v8, :cond_15

    .line 202
    .line 203
    invoke-static/range {p0 .. p0}, La/a;->x(Lz0/d;)Lz0/d;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    invoke-static {v6}, LQ0/v;->c(Lz0/d;)LQ0/f;

    .line 208
    .line 209
    .line 210
    move-result-object v6

    .line 211
    move-object v8, v7

    .line 212
    move-object v9, v5

    .line 213
    move/from16 v10, p1

    .line 214
    .line 215
    move-object/from16 v19, v11

    .line 216
    .line 217
    move-object v4, v12

    .line 218
    move-wide/from16 v11, v16

    .line 219
    .line 220
    move-object/from16 v20, v2

    .line 221
    .line 222
    move-object v2, v13

    .line 223
    move-object v13, v6

    .line 224
    :try_start_0
    invoke-virtual/range {v8 .. v13}, LS0/b;->A(LS0/j;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v8

    .line 228
    if-ne v8, v2, :cond_9

    .line 229
    .line 230
    move/from16 v2, p1

    .line 231
    .line 232
    invoke-virtual {v6, v5, v2}, LQ0/f;->a(LV0/v;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 233
    .line 234
    .line 235
    goto/16 :goto_7

    .line 236
    .line 237
    :cond_9
    iget-object v2, v7, LS0/b;->f:LH0/l;

    .line 238
    .line 239
    iget-object v13, v6, LQ0/f;->i:Lz0/i;

    .line 240
    .line 241
    if-ne v8, v4, :cond_13

    .line 242
    .line 243
    :try_start_1
    invoke-virtual {v7}, LS0/b;->p()J

    .line 244
    .line 245
    .line 246
    move-result-wide v8

    .line 247
    cmp-long v4, v16, v8

    .line 248
    .line 249
    if-gez v4, :cond_a

    .line 250
    .line 251
    invoke-virtual {v5}, LV0/d;->a()V

    .line 252
    .line 253
    .line 254
    goto :goto_4

    .line 255
    :catchall_0
    move-exception v0

    .line 256
    goto/16 :goto_8

    .line 257
    .line 258
    :cond_a
    :goto_4
    invoke-virtual {v14, v7}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    check-cast v4, LS0/j;

    .line 263
    .line 264
    :goto_5
    invoke-virtual {v15, v7}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 265
    .line 266
    .line 267
    move-result-wide v8

    .line 268
    const/4 v14, 0x1

    .line 269
    invoke-virtual {v7, v8, v9, v14}, LS0/b;->r(JZ)Z

    .line 270
    .line 271
    .line 272
    move-result v5

    .line 273
    if-eqz v5, :cond_b

    .line 274
    .line 275
    invoke-virtual {v7}, LS0/b;->m()Ljava/lang/Throwable;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    invoke-static {v2}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    invoke-virtual {v6, v2}, LQ0/f;->m(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    goto/16 :goto_7

    .line 287
    .line 288
    :cond_b
    invoke-virtual {v3, v7}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 289
    .line 290
    .line 291
    move-result-wide v16

    .line 292
    sget v5, LS0/d;->b:I

    .line 293
    .line 294
    int-to-long v8, v5

    .line 295
    div-long v10, v16, v8

    .line 296
    .line 297
    rem-long v8, v16, v8

    .line 298
    .line 299
    long-to-int v5, v8

    .line 300
    iget-wide v8, v4, LV0/v;->g:J

    .line 301
    .line 302
    cmp-long v12, v8, v10

    .line 303
    .line 304
    if-eqz v12, :cond_d

    .line 305
    .line 306
    invoke-virtual {v7, v10, v11, v4}, LS0/b;->k(JLS0/j;)LS0/j;

    .line 307
    .line 308
    .line 309
    move-result-object v8

    .line 310
    if-nez v8, :cond_c

    .line 311
    .line 312
    goto :goto_5

    .line 313
    :cond_c
    move-object v4, v8

    .line 314
    :cond_d
    move-object v8, v7

    .line 315
    move-object v9, v4

    .line 316
    move v10, v5

    .line 317
    move-wide/from16 v11, v16

    .line 318
    .line 319
    move-object v14, v13

    .line 320
    move-object v13, v6

    .line 321
    invoke-virtual/range {v8 .. v13}, LS0/b;->A(LS0/j;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v8

    .line 325
    sget-object v9, LS0/d;->m:LD/j;

    .line 326
    .line 327
    if-ne v8, v9, :cond_e

    .line 328
    .line 329
    invoke-virtual {v6, v4, v5}, LQ0/f;->a(LV0/v;I)V

    .line 330
    .line 331
    .line 332
    goto :goto_7

    .line 333
    :cond_e
    sget-object v5, LS0/d;->o:LD/j;

    .line 334
    .line 335
    if-ne v8, v5, :cond_10

    .line 336
    .line 337
    invoke-virtual {v7}, LS0/b;->p()J

    .line 338
    .line 339
    .line 340
    move-result-wide v8

    .line 341
    cmp-long v5, v16, v8

    .line 342
    .line 343
    if-gez v5, :cond_f

    .line 344
    .line 345
    invoke-virtual {v4}, LV0/d;->a()V

    .line 346
    .line 347
    .line 348
    :cond_f
    move-object v13, v14

    .line 349
    goto :goto_5

    .line 350
    :cond_10
    sget-object v3, LS0/d;->n:LD/j;

    .line 351
    .line 352
    if-eq v8, v3, :cond_12

    .line 353
    .line 354
    invoke-virtual {v4}, LV0/d;->a()V

    .line 355
    .line 356
    .line 357
    if-eqz v2, :cond_11

    .line 358
    .line 359
    new-instance v3, LV0/q;

    .line 360
    .line 361
    invoke-direct {v3, v2, v8, v14}, LV0/q;-><init>(LH0/l;Ljava/lang/Object;Lz0/i;)V

    .line 362
    .line 363
    .line 364
    goto :goto_6

    .line 365
    :cond_11
    const/4 v3, 0x0

    .line 366
    :goto_6
    invoke-virtual {v6, v8, v3}, LQ0/f;->l(Ljava/lang/Object;LH0/l;)V

    .line 367
    .line 368
    .line 369
    goto :goto_7

    .line 370
    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 371
    .line 372
    move-object/from16 v2, v19

    .line 373
    .line 374
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    throw v0

    .line 378
    :cond_13
    move-object v14, v13

    .line 379
    invoke-virtual {v5}, LV0/d;->a()V

    .line 380
    .line 381
    .line 382
    if-eqz v2, :cond_14

    .line 383
    .line 384
    new-instance v3, LV0/q;

    .line 385
    .line 386
    invoke-direct {v3, v2, v8, v14}, LV0/q;-><init>(LH0/l;Ljava/lang/Object;Lz0/i;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 387
    .line 388
    .line 389
    goto :goto_6

    .line 390
    :cond_14
    const/4 v3, 0x0

    .line 391
    goto :goto_6

    .line 392
    :goto_7
    invoke-virtual {v6}, LQ0/f;->u()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    goto :goto_9

    .line 397
    :goto_8
    invoke-virtual {v6}, LQ0/f;->B()V

    .line 398
    .line 399
    .line 400
    throw v0

    .line 401
    :cond_15
    move-object/from16 v20, v2

    .line 402
    .line 403
    invoke-virtual {v5}, LV0/d;->a()V

    .line 404
    .line 405
    .line 406
    move-object v2, v6

    .line 407
    :goto_9
    if-ne v2, v0, :cond_16

    .line 408
    .line 409
    return-object v0

    .line 410
    :cond_16
    move-object/from16 v3, v20

    .line 411
    .line 412
    const/4 v4, 0x0

    .line 413
    :goto_a
    iput-object v4, v1, LG/h0;->i:LG/O;

    .line 414
    .line 415
    const/4 v5, 0x2

    .line 416
    iput v5, v1, LG/h0;->j:I

    .line 417
    .line 418
    invoke-interface {v3, v2, v1}, LH0/p;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    if-ne v2, v0, :cond_17

    .line 423
    .line 424
    return-object v0

    .line 425
    :cond_17
    move-object/from16 v3, v18

    .line 426
    .line 427
    :goto_b
    iget-object v2, v3, LG/n;->d:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v2, LD/j;

    .line 430
    .line 431
    iget-object v2, v2, LD/j;->f:Ljava/lang/Object;

    .line 432
    .line 433
    check-cast v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 434
    .line 435
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 436
    .line 437
    .line 438
    move-result v2

    .line 439
    if-nez v2, :cond_18

    .line 440
    .line 441
    sget-object v0, Lx0/g;->a:Lx0/g;

    .line 442
    .line 443
    return-object v0

    .line 444
    :cond_18
    move-object v6, v3

    .line 445
    const/4 v4, 0x1

    .line 446
    goto/16 :goto_0

    .line 447
    .line 448
    :cond_19
    move-object v2, v11

    .line 449
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 450
    .line 451
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    throw v0

    .line 455
    :cond_1a
    invoke-virtual {v7}, LS0/b;->m()Ljava/lang/Throwable;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    sget v2, LV0/w;->a:I

    .line 460
    .line 461
    throw v0

    .line 462
    :cond_1b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 463
    .line 464
    const-string v2, "Check failed."

    .line 465
    .line 466
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    throw v0
.end method
