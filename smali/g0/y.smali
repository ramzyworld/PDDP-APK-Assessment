.class public final Lg0/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/B;


# instance fields
.field public final e:Lq0/f;

.field public final f:Ljava/util/HashMap;

.field public final g:Ljava/util/HashMap;

.field public final h:LX0/i;


# direct methods
.method public constructor <init>(Lq0/f;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    .line 4
    .line 5
    new-instance v1, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, Lg0/y;->f:Ljava/util/HashMap;

    .line 11
    .line 12
    new-instance v1, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lg0/y;->g:Ljava/util/HashMap;

    .line 18
    .line 19
    new-instance v2, LX0/i;

    .line 20
    .line 21
    invoke-direct {v2}, LX0/i;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v2, p0, Lg0/y;->h:LX0/i;

    .line 25
    .line 26
    iput-object p1, p0, Lg0/y;->e:Lq0/f;

    .line 27
    .line 28
    sget-object p1, Lg0/H;->a:Lg0/D;

    .line 29
    .line 30
    new-instance p1, Lg0/G;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-boolean v0, p1, Lg0/G;->a:Z

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    new-array v2, v2, [Lg0/G;

    .line 39
    .line 40
    aput-object p1, v2, v0

    .line 41
    .line 42
    aget-object p1, v2, v0

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    const-wide v2, 0x100000104L

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/KeyEvent;Lg0/z;)V
    .locals 27

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move-object/from16 v7, p2

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getScanCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-wide/16 v9, 0x0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    move-wide v0, v9

    .line 20
    goto/16 :goto_20

    .line 21
    .line 22
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getScanCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    int-to-long v0, v0

    .line 27
    const-wide v2, 0x1100000000L

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    const-wide v4, 0xffffffffL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    cmp-long v11, v0, v9

    .line 38
    .line 39
    if-nez v11, :cond_1

    .line 40
    .line 41
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    int-to-long v0, v0

    .line 46
    and-long/2addr v0, v4

    .line 47
    or-long/2addr v0, v2

    .line 48
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :goto_0
    move-object v11, v0

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    sget-object v11, Lg0/H;->a:Lg0/D;

    .line 55
    .line 56
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v11, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Ljava/lang/Long;

    .line 65
    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getScanCode()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    int-to-long v0, v0

    .line 74
    and-long/2addr v0, v4

    .line 75
    or-long/2addr v0, v2

    .line 76
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    goto :goto_0

    .line 81
    :goto_1
    sget-object v0, Lg0/H;->b:Lg0/D;

    .line 82
    .line 83
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    int-to-long v12, v1

    .line 88
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    check-cast v0, Ljava/lang/Long;

    .line 97
    .line 98
    if-eqz v0, :cond_3

    .line 99
    .line 100
    :goto_2
    move-object v12, v0

    .line 101
    goto :goto_3

    .line 102
    :cond_3
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    int-to-long v0, v0

    .line 107
    and-long/2addr v0, v4

    .line 108
    or-long/2addr v0, v2

    .line 109
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    goto :goto_2

    .line 114
    :goto_3
    new-instance v13, Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 117
    .line 118
    .line 119
    sget-object v14, Lg0/H;->c:[Lg0/F;

    .line 120
    .line 121
    array-length v15, v14

    .line 122
    const/4 v3, 0x0

    .line 123
    :goto_4
    iget-object v4, v6, Lg0/y;->f:Ljava/util/HashMap;

    .line 124
    .line 125
    const/4 v1, 0x2

    .line 126
    if-ge v3, v15, :cond_1a

    .line 127
    .line 128
    aget-object v0, v14, v3

    .line 129
    .line 130
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getMetaState()I

    .line 131
    .line 132
    .line 133
    move-result v16

    .line 134
    iget v2, v0, Lg0/F;->a:I

    .line 135
    .line 136
    and-int v2, v16, v2

    .line 137
    .line 138
    if-eqz v2, :cond_4

    .line 139
    .line 140
    const/16 v16, 0x1

    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_4
    const/16 v16, 0x0

    .line 144
    .line 145
    :goto_5
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 146
    .line 147
    .line 148
    move-result-wide v18

    .line 149
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 150
    .line 151
    .line 152
    move-result-wide v20

    .line 153
    iget-object v0, v0, Lg0/F;->b:[Ljava/lang/Object;

    .line 154
    .line 155
    move-object/from16 v22, v0

    .line 156
    .line 157
    check-cast v22, [Lg0/E;

    .line 158
    .line 159
    new-array v2, v1, [Z

    .line 160
    .line 161
    new-array v0, v1, [Ljava/lang/Boolean;

    .line 162
    .line 163
    const/4 v9, 0x0

    .line 164
    const/4 v10, 0x0

    .line 165
    :goto_6
    if-ge v9, v1, :cond_11

    .line 166
    .line 167
    aget-object v5, v22, v9

    .line 168
    .line 169
    move-object/from16 v24, v2

    .line 170
    .line 171
    iget-wide v1, v5, Lg0/E;->a:J

    .line 172
    .line 173
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v4, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    aput-boolean v1, v24, v9

    .line 182
    .line 183
    move/from16 v25, v9

    .line 184
    .line 185
    iget-wide v8, v5, Lg0/E;->b:J

    .line 186
    .line 187
    cmp-long v2, v8, v18

    .line 188
    .line 189
    if-nez v2, :cond_e

    .line 190
    .line 191
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    if-lez v1, :cond_5

    .line 196
    .line 197
    const/4 v1, 0x1

    .line 198
    goto :goto_7

    .line 199
    :cond_5
    const/4 v1, 0x0

    .line 200
    :goto_7
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getAction()I

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    if-eqz v2, :cond_7

    .line 205
    .line 206
    const/4 v8, 0x1

    .line 207
    if-ne v2, v8, :cond_6

    .line 208
    .line 209
    const/4 v1, 0x2

    .line 210
    goto :goto_8

    .line 211
    :cond_6
    new-instance v0, Ljava/lang/AssertionError;

    .line 212
    .line 213
    const-string v1, "Unexpected event type"

    .line 214
    .line 215
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    throw v0

    .line 219
    :cond_7
    if-eqz v1, :cond_8

    .line 220
    .line 221
    const/4 v1, 0x3

    .line 222
    goto :goto_8

    .line 223
    :cond_8
    const/4 v1, 0x1

    .line 224
    :goto_8
    invoke-static {v1}, LI/j;->b(I)I

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    if-eqz v1, :cond_c

    .line 229
    .line 230
    const/4 v2, 0x1

    .line 231
    if-eq v1, v2, :cond_b

    .line 232
    .line 233
    const/4 v2, 0x2

    .line 234
    if-eq v1, v2, :cond_9

    .line 235
    .line 236
    move-object/from16 v9, p1

    .line 237
    .line 238
    goto :goto_b

    .line 239
    :cond_9
    if-nez v16, :cond_a

    .line 240
    .line 241
    new-instance v1, Lg0/x;

    .line 242
    .line 243
    const/4 v8, 0x0

    .line 244
    move-object/from16 v9, p1

    .line 245
    .line 246
    invoke-direct {v1, v6, v5, v9, v8}, Lg0/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    goto :goto_9

    .line 253
    :cond_a
    move-object/from16 v9, p1

    .line 254
    .line 255
    :goto_9
    aget-boolean v1, v24, v25

    .line 256
    .line 257
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    aput-object v1, v0, v25

    .line 262
    .line 263
    move-object/from16 v23, v0

    .line 264
    .line 265
    move-object/from16 v26, v4

    .line 266
    .line 267
    move-object/from16 v17, v24

    .line 268
    .line 269
    const/4 v0, 0x1

    .line 270
    :goto_a
    const/4 v9, 0x0

    .line 271
    const/4 v10, 0x2

    .line 272
    move/from16 v24, v3

    .line 273
    .line 274
    goto :goto_d

    .line 275
    :cond_b
    move-object/from16 v9, p1

    .line 276
    .line 277
    const/4 v2, 0x2

    .line 278
    aget-boolean v1, v24, v25

    .line 279
    .line 280
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    aput-object v1, v0, v25

    .line 285
    .line 286
    :goto_b
    move-object/from16 v23, v0

    .line 287
    .line 288
    move-object/from16 v26, v4

    .line 289
    .line 290
    move v0, v10

    .line 291
    move-object/from16 v17, v24

    .line 292
    .line 293
    goto :goto_a

    .line 294
    :cond_c
    move-object/from16 v9, p1

    .line 295
    .line 296
    const/4 v2, 0x2

    .line 297
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 298
    .line 299
    aput-object v1, v0, v25

    .line 300
    .line 301
    if-nez v16, :cond_d

    .line 302
    .line 303
    new-instance v8, Lg0/w;

    .line 304
    .line 305
    move-object/from16 v23, v0

    .line 306
    .line 307
    move-object v0, v8

    .line 308
    const/4 v10, 0x2

    .line 309
    move-object/from16 v1, p0

    .line 310
    .line 311
    move-object/from16 v17, v24

    .line 312
    .line 313
    const/4 v9, 0x3

    .line 314
    move-object v2, v5

    .line 315
    move/from16 v24, v3

    .line 316
    .line 317
    move-object v5, v4

    .line 318
    move-wide/from16 v3, v20

    .line 319
    .line 320
    move-object/from16 v26, v5

    .line 321
    .line 322
    const/4 v9, 0x0

    .line 323
    move-object/from16 v5, p1

    .line 324
    .line 325
    invoke-direct/range {v0 .. v5}, Lg0/w;-><init>(Lg0/y;Lg0/E;JLandroid/view/KeyEvent;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v13, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    goto :goto_c

    .line 332
    :cond_d
    move-object/from16 v23, v0

    .line 333
    .line 334
    move-object/from16 v26, v4

    .line 335
    .line 336
    move-object/from16 v17, v24

    .line 337
    .line 338
    const/4 v9, 0x0

    .line 339
    const/4 v10, 0x2

    .line 340
    move/from16 v24, v3

    .line 341
    .line 342
    :goto_c
    const/4 v0, 0x1

    .line 343
    :goto_d
    move v10, v0

    .line 344
    const/4 v8, 0x2

    .line 345
    goto :goto_10

    .line 346
    :cond_e
    move-object/from16 v23, v0

    .line 347
    .line 348
    move-object/from16 v26, v4

    .line 349
    .line 350
    move-object/from16 v17, v24

    .line 351
    .line 352
    const/4 v8, 0x2

    .line 353
    const/4 v9, 0x0

    .line 354
    move/from16 v24, v3

    .line 355
    .line 356
    if-nez v10, :cond_10

    .line 357
    .line 358
    if-eqz v1, :cond_f

    .line 359
    .line 360
    goto :goto_e

    .line 361
    :cond_f
    const/4 v5, 0x0

    .line 362
    goto :goto_f

    .line 363
    :cond_10
    :goto_e
    const/4 v5, 0x1

    .line 364
    :goto_f
    move v10, v5

    .line 365
    :goto_10
    add-int/lit8 v0, v25, 0x1

    .line 366
    .line 367
    move v9, v0

    .line 368
    move-object/from16 v2, v17

    .line 369
    .line 370
    move-object/from16 v0, v23

    .line 371
    .line 372
    move/from16 v3, v24

    .line 373
    .line 374
    move-object/from16 v4, v26

    .line 375
    .line 376
    const/4 v1, 0x2

    .line 377
    goto/16 :goto_6

    .line 378
    .line 379
    :cond_11
    move-object/from16 v23, v0

    .line 380
    .line 381
    move-object/from16 v17, v2

    .line 382
    .line 383
    move/from16 v24, v3

    .line 384
    .line 385
    const/4 v8, 0x2

    .line 386
    const/4 v9, 0x0

    .line 387
    if-eqz v16, :cond_15

    .line 388
    .line 389
    const/4 v5, 0x0

    .line 390
    :goto_11
    if-ge v5, v8, :cond_14

    .line 391
    .line 392
    aget-object v0, v23, v5

    .line 393
    .line 394
    if-eqz v0, :cond_12

    .line 395
    .line 396
    goto :goto_12

    .line 397
    :cond_12
    if-eqz v10, :cond_13

    .line 398
    .line 399
    aget-boolean v0, v17, v5

    .line 400
    .line 401
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    aput-object v0, v23, v5

    .line 406
    .line 407
    goto :goto_12

    .line 408
    :cond_13
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 409
    .line 410
    aput-object v0, v23, v5

    .line 411
    .line 412
    const/4 v10, 0x1

    .line 413
    :goto_12
    add-int/lit8 v5, v5, 0x1

    .line 414
    .line 415
    goto :goto_11

    .line 416
    :cond_14
    if-nez v10, :cond_17

    .line 417
    .line 418
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 419
    .line 420
    aput-object v0, v23, v9

    .line 421
    .line 422
    goto :goto_15

    .line 423
    :cond_15
    const/4 v5, 0x0

    .line 424
    :goto_13
    if-ge v5, v8, :cond_17

    .line 425
    .line 426
    aget-object v0, v23, v5

    .line 427
    .line 428
    if-eqz v0, :cond_16

    .line 429
    .line 430
    goto :goto_14

    .line 431
    :cond_16
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 432
    .line 433
    aput-object v0, v23, v5

    .line 434
    .line 435
    :goto_14
    add-int/lit8 v5, v5, 0x1

    .line 436
    .line 437
    goto :goto_13

    .line 438
    :cond_17
    :goto_15
    const/4 v10, 0x0

    .line 439
    :goto_16
    if-ge v10, v8, :cond_19

    .line 440
    .line 441
    aget-boolean v0, v17, v10

    .line 442
    .line 443
    aget-object v1, v23, v10

    .line 444
    .line 445
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 446
    .line 447
    .line 448
    move-result v1

    .line 449
    if-eq v0, v1, :cond_18

    .line 450
    .line 451
    aget-object v0, v22, v10

    .line 452
    .line 453
    aget-object v1, v23, v10

    .line 454
    .line 455
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 456
    .line 457
    .line 458
    move-result v1

    .line 459
    iget-wide v2, v0, Lg0/E;->b:J

    .line 460
    .line 461
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    iget-wide v3, v0, Lg0/E;->a:J

    .line 466
    .line 467
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 468
    .line 469
    .line 470
    move-result-object v3

    .line 471
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getEventTime()J

    .line 472
    .line 473
    .line 474
    move-result-wide v4

    .line 475
    move-object/from16 v0, p0

    .line 476
    .line 477
    invoke-virtual/range {v0 .. v5}, Lg0/y;->c(ZLjava/lang/Long;Ljava/lang/Long;J)V

    .line 478
    .line 479
    .line 480
    :cond_18
    add-int/lit8 v10, v10, 0x1

    .line 481
    .line 482
    goto :goto_16

    .line 483
    :cond_19
    add-int/lit8 v3, v24, 0x1

    .line 484
    .line 485
    const-wide/16 v9, 0x0

    .line 486
    .line 487
    goto/16 :goto_4

    .line 488
    .line 489
    :cond_1a
    move-object/from16 v26, v4

    .line 490
    .line 491
    const/4 v8, 0x2

    .line 492
    const/4 v9, 0x0

    .line 493
    iget-object v10, v6, Lg0/y;->g:Ljava/util/HashMap;

    .line 494
    .line 495
    invoke-virtual {v10}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 500
    .line 501
    .line 502
    move-result-object v14

    .line 503
    :goto_17
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 504
    .line 505
    .line 506
    move-result v0

    .line 507
    if-eqz v0, :cond_20

    .line 508
    .line 509
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    move-object v15, v0

    .line 514
    check-cast v15, Lg0/G;

    .line 515
    .line 516
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getMetaState()I

    .line 517
    .line 518
    .line 519
    move-result v0

    .line 520
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 521
    .line 522
    .line 523
    const/high16 v1, 0x100000

    .line 524
    .line 525
    and-int/2addr v0, v1

    .line 526
    if-eqz v0, :cond_1b

    .line 527
    .line 528
    const/4 v5, 0x1

    .line 529
    goto :goto_18

    .line 530
    :cond_1b
    const/4 v5, 0x0

    .line 531
    :goto_18
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 532
    .line 533
    .line 534
    move-result-wide v0

    .line 535
    const-wide v2, 0x100000104L

    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 541
    .line 542
    .line 543
    move-result-object v16

    .line 544
    cmp-long v4, v2, v0

    .line 545
    .line 546
    if-nez v4, :cond_1d

    .line 547
    .line 548
    :cond_1c
    move-object/from16 v9, v26

    .line 549
    .line 550
    goto :goto_19

    .line 551
    :cond_1d
    iget-boolean v0, v15, Lg0/G;->a:Z

    .line 552
    .line 553
    if-eq v0, v5, :cond_1c

    .line 554
    .line 555
    const-wide/32 v17, 0x70039

    .line 556
    .line 557
    .line 558
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    move-object/from16 v4, v26

    .line 563
    .line 564
    invoke-virtual {v4, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    move-result v19

    .line 568
    xor-int/lit8 v1, v19, 0x1

    .line 569
    .line 570
    if-nez v19, :cond_1e

    .line 571
    .line 572
    iget-boolean v0, v15, Lg0/G;->a:Z

    .line 573
    .line 574
    const/4 v2, 0x1

    .line 575
    xor-int/2addr v0, v2

    .line 576
    iput-boolean v0, v15, Lg0/G;->a:Z

    .line 577
    .line 578
    :cond_1e
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 579
    .line 580
    .line 581
    move-result-object v3

    .line 582
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getEventTime()J

    .line 583
    .line 584
    .line 585
    move-result-wide v20

    .line 586
    move-object/from16 v0, p0

    .line 587
    .line 588
    move-object/from16 v2, v16

    .line 589
    .line 590
    move-object v9, v4

    .line 591
    move-wide/from16 v4, v20

    .line 592
    .line 593
    invoke-virtual/range {v0 .. v5}, Lg0/y;->c(ZLjava/lang/Long;Ljava/lang/Long;J)V

    .line 594
    .line 595
    .line 596
    if-eqz v19, :cond_1f

    .line 597
    .line 598
    iget-boolean v0, v15, Lg0/G;->a:Z

    .line 599
    .line 600
    const/4 v1, 0x1

    .line 601
    xor-int/2addr v0, v1

    .line 602
    iput-boolean v0, v15, Lg0/G;->a:Z

    .line 603
    .line 604
    :cond_1f
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 605
    .line 606
    .line 607
    move-result-object v3

    .line 608
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getEventTime()J

    .line 609
    .line 610
    .line 611
    move-result-wide v4

    .line 612
    move-object/from16 v0, p0

    .line 613
    .line 614
    move/from16 v1, v19

    .line 615
    .line 616
    move-object/from16 v2, v16

    .line 617
    .line 618
    invoke-virtual/range {v0 .. v5}, Lg0/y;->c(ZLjava/lang/Long;Ljava/lang/Long;J)V

    .line 619
    .line 620
    .line 621
    :goto_19
    move-object/from16 v26, v9

    .line 622
    .line 623
    const/4 v9, 0x0

    .line 624
    goto :goto_17

    .line 625
    :cond_20
    move-object/from16 v9, v26

    .line 626
    .line 627
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getAction()I

    .line 628
    .line 629
    .line 630
    move-result v0

    .line 631
    if-eqz v0, :cond_22

    .line 632
    .line 633
    const/4 v1, 0x1

    .line 634
    if-eq v0, v1, :cond_21

    .line 635
    .line 636
    :goto_1a
    const-wide/16 v0, 0x0

    .line 637
    .line 638
    goto :goto_20

    .line 639
    :cond_21
    const/4 v14, 0x0

    .line 640
    goto :goto_1b

    .line 641
    :cond_22
    const/4 v14, 0x1

    .line 642
    :goto_1b
    invoke-virtual {v9, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    move-object v2, v0

    .line 647
    check-cast v2, Ljava/lang/Long;

    .line 648
    .line 649
    const/4 v9, 0x0

    .line 650
    if-eqz v14, :cond_26

    .line 651
    .line 652
    if-nez v2, :cond_23

    .line 653
    .line 654
    :goto_1c
    const/4 v2, 0x1

    .line 655
    goto :goto_1d

    .line 656
    :cond_23
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 657
    .line 658
    .line 659
    move-result v0

    .line 660
    if-lez v0, :cond_24

    .line 661
    .line 662
    const/4 v2, 0x3

    .line 663
    goto :goto_1d

    .line 664
    :cond_24
    const/4 v1, 0x0

    .line 665
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getEventTime()J

    .line 666
    .line 667
    .line 668
    move-result-wide v4

    .line 669
    move-object/from16 v0, p0

    .line 670
    .line 671
    move-object v3, v11

    .line 672
    invoke-virtual/range {v0 .. v5}, Lg0/y;->c(ZLjava/lang/Long;Ljava/lang/Long;J)V

    .line 673
    .line 674
    .line 675
    goto :goto_1c

    .line 676
    :goto_1d
    iget-object v0, v6, Lg0/y;->h:LX0/i;

    .line 677
    .line 678
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    .line 679
    .line 680
    .line 681
    move-result v1

    .line 682
    invoke-virtual {v0, v1}, LX0/i;->a(I)Ljava/lang/Character;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    .line 687
    .line 688
    .line 689
    move-result v0

    .line 690
    if-eqz v0, :cond_25

    .line 691
    .line 692
    new-instance v1, Ljava/lang/StringBuilder;

    .line 693
    .line 694
    const-string v3, ""

    .line 695
    .line 696
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 697
    .line 698
    .line 699
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    goto :goto_1e

    .line 707
    :cond_25
    move-object v0, v9

    .line 708
    :goto_1e
    move-object v1, v0

    .line 709
    const/4 v0, 0x1

    .line 710
    :goto_1f
    const/4 v3, 0x3

    .line 711
    goto :goto_21

    .line 712
    :cond_26
    if-nez v2, :cond_27

    .line 713
    .line 714
    goto :goto_1a

    .line 715
    :goto_20
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 716
    .line 717
    .line 718
    move-result-object v2

    .line 719
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 720
    .line 721
    .line 722
    move-result-object v3

    .line 723
    const-wide/16 v4, 0x0

    .line 724
    .line 725
    const/4 v1, 0x1

    .line 726
    move-object/from16 v0, p0

    .line 727
    .line 728
    invoke-virtual/range {v0 .. v5}, Lg0/y;->c(ZLjava/lang/Long;Ljava/lang/Long;J)V

    .line 729
    .line 730
    .line 731
    const/4 v0, 0x1

    .line 732
    invoke-virtual {v7, v0}, Lg0/z;->a(Z)V

    .line 733
    .line 734
    .line 735
    goto/16 :goto_24

    .line 736
    .line 737
    :cond_27
    const/4 v0, 0x1

    .line 738
    move-object v1, v9

    .line 739
    const/4 v2, 0x2

    .line 740
    goto :goto_1f

    .line 741
    :goto_21
    if-eq v2, v3, :cond_29

    .line 742
    .line 743
    if-eqz v14, :cond_28

    .line 744
    .line 745
    move-object v9, v12

    .line 746
    :cond_28
    invoke-virtual {v6, v11, v9}, Lg0/y;->d(Ljava/lang/Long;Ljava/lang/Long;)V

    .line 747
    .line 748
    .line 749
    :cond_29
    if-ne v2, v0, :cond_2a

    .line 750
    .line 751
    invoke-virtual {v10, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 752
    .line 753
    .line 754
    move-result-object v3

    .line 755
    check-cast v3, Lg0/G;

    .line 756
    .line 757
    if-eqz v3, :cond_2a

    .line 758
    .line 759
    iget-boolean v4, v3, Lg0/G;->a:Z

    .line 760
    .line 761
    xor-int/2addr v4, v0

    .line 762
    iput-boolean v4, v3, Lg0/G;->a:Z

    .line 763
    .line 764
    :cond_2a
    new-instance v0, Lg0/u;

    .line 765
    .line 766
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 767
    .line 768
    .line 769
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getSource()I

    .line 770
    .line 771
    .line 772
    move-result v3

    .line 773
    const/16 v4, 0x201

    .line 774
    .line 775
    if-eq v3, v4, :cond_2e

    .line 776
    .line 777
    const/16 v4, 0x401

    .line 778
    .line 779
    if-eq v3, v4, :cond_2d

    .line 780
    .line 781
    const v4, 0x1000010

    .line 782
    .line 783
    .line 784
    if-eq v3, v4, :cond_2c

    .line 785
    .line 786
    const v4, 0x2000001

    .line 787
    .line 788
    .line 789
    if-eq v3, v4, :cond_2b

    .line 790
    .line 791
    const/4 v3, 0x1

    .line 792
    iput v3, v0, Lg0/u;->f:I

    .line 793
    .line 794
    goto :goto_22

    .line 795
    :cond_2b
    const/4 v3, 0x5

    .line 796
    iput v3, v0, Lg0/u;->f:I

    .line 797
    .line 798
    goto :goto_22

    .line 799
    :cond_2c
    const/4 v3, 0x4

    .line 800
    iput v3, v0, Lg0/u;->f:I

    .line 801
    .line 802
    goto :goto_22

    .line 803
    :cond_2d
    const/4 v3, 0x3

    .line 804
    iput v3, v0, Lg0/u;->f:I

    .line 805
    .line 806
    goto :goto_22

    .line 807
    :cond_2e
    iput v8, v0, Lg0/u;->f:I

    .line 808
    .line 809
    :goto_22
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getEventTime()J

    .line 810
    .line 811
    .line 812
    move-result-wide v3

    .line 813
    iput-wide v3, v0, Lg0/u;->a:J

    .line 814
    .line 815
    iput v2, v0, Lg0/u;->b:I

    .line 816
    .line 817
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 818
    .line 819
    .line 820
    move-result-wide v2

    .line 821
    iput-wide v2, v0, Lg0/u;->d:J

    .line 822
    .line 823
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 824
    .line 825
    .line 826
    move-result-wide v2

    .line 827
    iput-wide v2, v0, Lg0/u;->c:J

    .line 828
    .line 829
    iput-object v1, v0, Lg0/u;->g:Ljava/lang/String;

    .line 830
    .line 831
    const/4 v1, 0x0

    .line 832
    iput-boolean v1, v0, Lg0/u;->e:Z

    .line 833
    .line 834
    invoke-virtual {v6, v0, v7}, Lg0/y;->b(Lg0/u;Lg0/z;)V

    .line 835
    .line 836
    .line 837
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    :goto_23
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 842
    .line 843
    .line 844
    move-result v1

    .line 845
    if-eqz v1, :cond_2f

    .line 846
    .line 847
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v1

    .line 851
    check-cast v1, Ljava/lang/Runnable;

    .line 852
    .line 853
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 854
    .line 855
    .line 856
    goto :goto_23

    .line 857
    :cond_2f
    :goto_24
    return-void
.end method

.method public final b(Lg0/u;Lg0/z;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    move-object v1, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v1, Lg0/v;

    .line 7
    .line 8
    invoke-direct {v1, p2}, Lg0/v;-><init>(Lg0/z;)V

    .line 9
    .line 10
    .line 11
    :goto_0
    :try_start_0
    iget-object p2, p1, Lg0/u;->g:Ljava/lang/String;

    .line 12
    .line 13
    if-nez p2, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    const-string v0, "UTF-8"

    .line 17
    .line 18
    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 19
    .line 20
    .line 21
    move-result-object v0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    :goto_1
    if-nez v0, :cond_2

    .line 23
    .line 24
    const/4 p2, 0x0

    .line 25
    goto :goto_2

    .line 26
    :cond_2
    array-length p2, v0

    .line 27
    :goto_2
    add-int/lit8 v2, p2, 0x38

    .line 28
    .line 29
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 36
    .line 37
    .line 38
    int-to-long v3, p2

    .line 39
    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 40
    .line 41
    .line 42
    iget-wide v3, p1, Lg0/u;->a:J

    .line 43
    .line 44
    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    .line 47
    iget p2, p1, Lg0/u;->b:I

    .line 48
    .line 49
    const/4 v3, 0x1

    .line 50
    if-eq p2, v3, :cond_5

    .line 51
    .line 52
    const/4 v3, 0x2

    .line 53
    if-eq p2, v3, :cond_4

    .line 54
    .line 55
    const/4 v3, 0x3

    .line 56
    if-ne p2, v3, :cond_3

    .line 57
    .line 58
    const-wide/16 v3, 0x2

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    const/4 p1, 0x0

    .line 62
    throw p1

    .line 63
    :cond_4
    const-wide/16 v3, 0x1

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_5
    const-wide/16 v3, 0x0

    .line 67
    .line 68
    :goto_3
    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 69
    .line 70
    .line 71
    iget-wide v3, p1, Lg0/u;->c:J

    .line 72
    .line 73
    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 74
    .line 75
    .line 76
    iget-wide v3, p1, Lg0/u;->d:J

    .line 77
    .line 78
    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 79
    .line 80
    .line 81
    iget-boolean p2, p1, Lg0/u;->e:Z

    .line 82
    .line 83
    if-eqz p2, :cond_6

    .line 84
    .line 85
    const-wide/16 v3, 0x1

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_6
    const-wide/16 v3, 0x0

    .line 89
    .line 90
    :goto_4
    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 91
    .line 92
    .line 93
    iget p1, p1, Lg0/u;->f:I

    .line 94
    .line 95
    const/4 p2, 0x1

    .line 96
    if-eq p1, p2, :cond_b

    .line 97
    .line 98
    const/4 p2, 0x2

    .line 99
    if-eq p1, p2, :cond_a

    .line 100
    .line 101
    const/4 p2, 0x3

    .line 102
    if-eq p1, p2, :cond_9

    .line 103
    .line 104
    const/4 p2, 0x4

    .line 105
    if-eq p1, p2, :cond_8

    .line 106
    .line 107
    const/4 p2, 0x5

    .line 108
    if-ne p1, p2, :cond_7

    .line 109
    .line 110
    const-wide/16 p1, 0x4

    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_7
    const/4 p1, 0x0

    .line 114
    throw p1

    .line 115
    :cond_8
    const-wide/16 p1, 0x3

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_9
    const-wide/16 p1, 0x2

    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_a
    const-wide/16 p1, 0x1

    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_b
    const-wide/16 p1, 0x0

    .line 125
    .line 126
    :goto_5
    invoke-virtual {v2, p1, p2}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 127
    .line 128
    .line 129
    if-eqz v0, :cond_c

    .line 130
    .line 131
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 132
    .line 133
    .line 134
    :cond_c
    iget-object p1, p0, Lg0/y;->e:Lq0/f;

    .line 135
    .line 136
    const-string p2, "flutter/keydata"

    .line 137
    .line 138
    invoke-interface {p1, p2, v2, v1}, Lq0/f;->n(Ljava/lang/String;Ljava/nio/ByteBuffer;Lq0/e;)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :catch_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 143
    .line 144
    const-string p2, "UTF-8 not supported"

    .line 145
    .line 146
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    throw p1
.end method

.method public final c(ZLjava/lang/Long;Ljava/lang/Long;J)V
    .locals 5

    .line 1
    new-instance v0, Lg0/u;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-wide p4, v0, Lg0/u;->a:J

    .line 7
    .line 8
    const/4 p4, 0x1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p5, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p5, 0x2

    .line 14
    :goto_0
    iput p5, v0, Lg0/u;->b:I

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    iput-wide v1, v0, Lg0/u;->d:J

    .line 21
    .line 22
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    .line 23
    .line 24
    .line 25
    move-result-wide v1

    .line 26
    iput-wide v1, v0, Lg0/u;->c:J

    .line 27
    .line 28
    const/4 p5, 0x0

    .line 29
    iput-object p5, v0, Lg0/u;->g:Ljava/lang/String;

    .line 30
    .line 31
    iput-boolean p4, v0, Lg0/u;->e:Z

    .line 32
    .line 33
    iput p4, v0, Lg0/u;->f:I

    .line 34
    .line 35
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    .line 36
    .line 37
    .line 38
    move-result-wide v1

    .line 39
    const-wide/16 v3, 0x0

    .line 40
    .line 41
    cmp-long p4, v1, v3

    .line 42
    .line 43
    if-eqz p4, :cond_2

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    cmp-long p4, v1, v3

    .line 50
    .line 51
    if-eqz p4, :cond_2

    .line 52
    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move-object p2, p5

    .line 57
    :goto_1
    invoke-virtual {p0, p3, p2}, Lg0/y;->d(Ljava/lang/Long;Ljava/lang/Long;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    invoke-virtual {p0, v0, p5}, Lg0/y;->b(Lg0/u;Lg0/z;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final d(Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg0/y;->f:Ljava/util/HashMap;

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ljava/lang/Long;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 15
    .line 16
    const-string p2, "The key was not empty"

    .line 17
    .line 18
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Ljava/lang/Long;

    .line 27
    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    :goto_0
    return-void

    .line 31
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    .line 32
    .line 33
    const-string p2, "The key was empty"

    .line 34
    .line 35
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    throw p1
.end method
