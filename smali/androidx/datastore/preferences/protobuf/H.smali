.class public final Landroidx/datastore/preferences/protobuf/H;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/datastore/preferences/protobuf/G;


# direct methods
.method public constructor <init>(Landroidx/datastore/preferences/protobuf/n0;Landroidx/datastore/preferences/protobuf/p0;LI/k;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/datastore/preferences/protobuf/G;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/G;-><init>(Landroidx/datastore/preferences/protobuf/n0;Landroidx/datastore/preferences/protobuf/p0;LI/k;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/datastore/preferences/protobuf/H;->a:Landroidx/datastore/preferences/protobuf/G;

    .line 10
    .line 11
    return-void
.end method

.method public static a(Landroidx/datastore/preferences/protobuf/G;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    sget v5, Landroidx/datastore/preferences/protobuf/r;->c:I

    .line 10
    .line 11
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/m;->k0(I)I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    sget-object v6, Landroidx/datastore/preferences/protobuf/r0;->h:Landroidx/datastore/preferences/protobuf/o0;

    .line 16
    .line 17
    iget-object v7, v0, Landroidx/datastore/preferences/protobuf/G;->a:Landroidx/datastore/preferences/protobuf/n0;

    .line 18
    .line 19
    if-ne v7, v6, :cond_0

    .line 20
    .line 21
    mul-int/lit8 v5, v5, 0x2

    .line 22
    .line 23
    :cond_0
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    const/16 v8, 0x3f

    .line 28
    .line 29
    const-string v9, "There is no way to get here, but the compiler thinks otherwise."

    .line 30
    .line 31
    const/16 v10, 0x8

    .line 32
    .line 33
    const/4 v11, 0x4

    .line 34
    const/4 v12, 0x0

    .line 35
    packed-switch v7, :pswitch_data_0

    .line 36
    .line 37
    .line 38
    new-instance v0, Ljava/lang/RuntimeException;

    .line 39
    .line 40
    invoke-direct {v0, v9}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v0

    .line 44
    :pswitch_0
    check-cast v1, Ljava/lang/Long;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 47
    .line 48
    .line 49
    move-result-wide v13

    .line 50
    shl-long v15, v13, v4

    .line 51
    .line 52
    shr-long/2addr v13, v8

    .line 53
    xor-long/2addr v13, v15

    .line 54
    invoke-static {v13, v14}, Landroidx/datastore/preferences/protobuf/m;->o0(J)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    goto/16 :goto_3

    .line 59
    .line 60
    :pswitch_1
    check-cast v1, Ljava/lang/Integer;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    shl-int/lit8 v7, v1, 0x1

    .line 67
    .line 68
    shr-int/lit8 v1, v1, 0x1f

    .line 69
    .line 70
    xor-int/2addr v1, v7

    .line 71
    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/m;->m0(I)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    goto/16 :goto_3

    .line 76
    .line 77
    :pswitch_2
    check-cast v1, Ljava/lang/Long;

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    :goto_0
    const/16 v1, 0x8

    .line 83
    .line 84
    goto/16 :goto_3

    .line 85
    .line 86
    :pswitch_3
    check-cast v1, Ljava/lang/Integer;

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    :goto_1
    const/4 v1, 0x4

    .line 92
    goto/16 :goto_3

    .line 93
    .line 94
    :pswitch_4
    check-cast v1, Ljava/lang/Integer;

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    int-to-long v13, v1

    .line 101
    invoke-static {v13, v14}, Landroidx/datastore/preferences/protobuf/m;->o0(J)I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    goto/16 :goto_3

    .line 106
    .line 107
    :pswitch_5
    check-cast v1, Ljava/lang/Integer;

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/m;->m0(I)I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    goto/16 :goto_3

    .line 118
    .line 119
    :pswitch_6
    instance-of v7, v1, Landroidx/datastore/preferences/protobuf/g;

    .line 120
    .line 121
    if-eqz v7, :cond_1

    .line 122
    .line 123
    check-cast v1, Landroidx/datastore/preferences/protobuf/g;

    .line 124
    .line 125
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/g;->size()I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/m;->m0(I)I

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    :goto_2
    add-int/2addr v1, v7

    .line 134
    goto/16 :goto_3

    .line 135
    .line 136
    :cond_1
    check-cast v1, [B

    .line 137
    .line 138
    array-length v1, v1

    .line 139
    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/m;->m0(I)I

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    goto :goto_2

    .line 144
    :pswitch_7
    check-cast v1, Landroidx/datastore/preferences/protobuf/a;

    .line 145
    .line 146
    check-cast v1, Landroidx/datastore/preferences/protobuf/w;

    .line 147
    .line 148
    invoke-virtual {v1, v12}, Landroidx/datastore/preferences/protobuf/w;->a(Landroidx/datastore/preferences/protobuf/W;)I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/m;->m0(I)I

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    goto :goto_2

    .line 157
    :pswitch_8
    check-cast v1, Landroidx/datastore/preferences/protobuf/a;

    .line 158
    .line 159
    check-cast v1, Landroidx/datastore/preferences/protobuf/w;

    .line 160
    .line 161
    invoke-virtual {v1, v12}, Landroidx/datastore/preferences/protobuf/w;->a(Landroidx/datastore/preferences/protobuf/W;)I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    goto :goto_3

    .line 166
    :pswitch_9
    instance-of v7, v1, Landroidx/datastore/preferences/protobuf/g;

    .line 167
    .line 168
    if-eqz v7, :cond_2

    .line 169
    .line 170
    check-cast v1, Landroidx/datastore/preferences/protobuf/g;

    .line 171
    .line 172
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/g;->size()I

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/m;->m0(I)I

    .line 177
    .line 178
    .line 179
    move-result v7

    .line 180
    goto :goto_2

    .line 181
    :cond_2
    check-cast v1, Ljava/lang/String;

    .line 182
    .line 183
    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/m;->j0(Ljava/lang/String;)I

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    goto :goto_3

    .line 188
    :pswitch_a
    check-cast v1, Ljava/lang/Boolean;

    .line 189
    .line 190
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    const/4 v1, 0x1

    .line 194
    goto :goto_3

    .line 195
    :pswitch_b
    check-cast v1, Ljava/lang/Integer;

    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    goto :goto_1

    .line 201
    :pswitch_c
    check-cast v1, Ljava/lang/Long;

    .line 202
    .line 203
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    goto :goto_0

    .line 207
    :pswitch_d
    check-cast v1, Ljava/lang/Integer;

    .line 208
    .line 209
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    int-to-long v13, v1

    .line 214
    invoke-static {v13, v14}, Landroidx/datastore/preferences/protobuf/m;->o0(J)I

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    goto :goto_3

    .line 219
    :pswitch_e
    check-cast v1, Ljava/lang/Long;

    .line 220
    .line 221
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 222
    .line 223
    .line 224
    move-result-wide v13

    .line 225
    invoke-static {v13, v14}, Landroidx/datastore/preferences/protobuf/m;->o0(J)I

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    goto :goto_3

    .line 230
    :pswitch_f
    check-cast v1, Ljava/lang/Long;

    .line 231
    .line 232
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 233
    .line 234
    .line 235
    move-result-wide v13

    .line 236
    invoke-static {v13, v14}, Landroidx/datastore/preferences/protobuf/m;->o0(J)I

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    goto :goto_3

    .line 241
    :pswitch_10
    check-cast v1, Ljava/lang/Float;

    .line 242
    .line 243
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    goto/16 :goto_1

    .line 247
    .line 248
    :pswitch_11
    check-cast v1, Ljava/lang/Double;

    .line 249
    .line 250
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    goto/16 :goto_0

    .line 254
    .line 255
    :goto_3
    add-int/2addr v1, v5

    .line 256
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/m;->k0(I)I

    .line 257
    .line 258
    .line 259
    move-result v5

    .line 260
    iget-object v0, v0, Landroidx/datastore/preferences/protobuf/G;->b:Landroidx/datastore/preferences/protobuf/p0;

    .line 261
    .line 262
    if-ne v0, v6, :cond_3

    .line 263
    .line 264
    mul-int/lit8 v5, v5, 0x2

    .line 265
    .line 266
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    packed-switch v0, :pswitch_data_1

    .line 271
    .line 272
    .line 273
    new-instance v0, Ljava/lang/RuntimeException;

    .line 274
    .line 275
    invoke-direct {v0, v9}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    throw v0

    .line 279
    :pswitch_12
    move-object v0, v2

    .line 280
    check-cast v0, Ljava/lang/Long;

    .line 281
    .line 282
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 283
    .line 284
    .line 285
    move-result-wide v2

    .line 286
    shl-long v6, v2, v4

    .line 287
    .line 288
    shr-long/2addr v2, v8

    .line 289
    xor-long/2addr v2, v6

    .line 290
    invoke-static {v2, v3}, Landroidx/datastore/preferences/protobuf/m;->o0(J)I

    .line 291
    .line 292
    .line 293
    move-result v4

    .line 294
    goto/16 :goto_7

    .line 295
    .line 296
    :pswitch_13
    move-object v0, v2

    .line 297
    check-cast v0, Ljava/lang/Integer;

    .line 298
    .line 299
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 300
    .line 301
    .line 302
    move-result v0

    .line 303
    shl-int/lit8 v2, v0, 0x1

    .line 304
    .line 305
    shr-int/lit8 v0, v0, 0x1f

    .line 306
    .line 307
    xor-int/2addr v0, v2

    .line 308
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/m;->m0(I)I

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    goto/16 :goto_7

    .line 313
    .line 314
    :pswitch_14
    move-object v0, v2

    .line 315
    check-cast v0, Ljava/lang/Long;

    .line 316
    .line 317
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    :goto_4
    const/16 v4, 0x8

    .line 321
    .line 322
    goto/16 :goto_7

    .line 323
    .line 324
    :pswitch_15
    move-object v0, v2

    .line 325
    check-cast v0, Ljava/lang/Integer;

    .line 326
    .line 327
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    :goto_5
    const/4 v4, 0x4

    .line 331
    goto/16 :goto_7

    .line 332
    .line 333
    :pswitch_16
    move-object v0, v2

    .line 334
    check-cast v0, Ljava/lang/Integer;

    .line 335
    .line 336
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    int-to-long v2, v0

    .line 341
    invoke-static {v2, v3}, Landroidx/datastore/preferences/protobuf/m;->o0(J)I

    .line 342
    .line 343
    .line 344
    move-result v4

    .line 345
    goto/16 :goto_7

    .line 346
    .line 347
    :pswitch_17
    move-object v0, v2

    .line 348
    check-cast v0, Ljava/lang/Integer;

    .line 349
    .line 350
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 351
    .line 352
    .line 353
    move-result v0

    .line 354
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/m;->m0(I)I

    .line 355
    .line 356
    .line 357
    move-result v4

    .line 358
    goto/16 :goto_7

    .line 359
    .line 360
    :pswitch_18
    instance-of v0, v2, Landroidx/datastore/preferences/protobuf/g;

    .line 361
    .line 362
    if-eqz v0, :cond_4

    .line 363
    .line 364
    move-object v0, v2

    .line 365
    check-cast v0, Landroidx/datastore/preferences/protobuf/g;

    .line 366
    .line 367
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/g;->size()I

    .line 368
    .line 369
    .line 370
    move-result v0

    .line 371
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/m;->m0(I)I

    .line 372
    .line 373
    .line 374
    move-result v2

    .line 375
    :goto_6
    add-int v4, v2, v0

    .line 376
    .line 377
    goto/16 :goto_7

    .line 378
    .line 379
    :cond_4
    move-object v0, v2

    .line 380
    check-cast v0, [B

    .line 381
    .line 382
    array-length v0, v0

    .line 383
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/m;->m0(I)I

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    goto :goto_6

    .line 388
    :pswitch_19
    move-object v0, v2

    .line 389
    check-cast v0, Landroidx/datastore/preferences/protobuf/a;

    .line 390
    .line 391
    check-cast v0, Landroidx/datastore/preferences/protobuf/w;

    .line 392
    .line 393
    invoke-virtual {v0, v12}, Landroidx/datastore/preferences/protobuf/w;->a(Landroidx/datastore/preferences/protobuf/W;)I

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/m;->m0(I)I

    .line 398
    .line 399
    .line 400
    move-result v2

    .line 401
    goto :goto_6

    .line 402
    :pswitch_1a
    move-object v0, v2

    .line 403
    check-cast v0, Landroidx/datastore/preferences/protobuf/a;

    .line 404
    .line 405
    check-cast v0, Landroidx/datastore/preferences/protobuf/w;

    .line 406
    .line 407
    invoke-virtual {v0, v12}, Landroidx/datastore/preferences/protobuf/w;->a(Landroidx/datastore/preferences/protobuf/W;)I

    .line 408
    .line 409
    .line 410
    move-result v4

    .line 411
    goto :goto_7

    .line 412
    :pswitch_1b
    instance-of v0, v2, Landroidx/datastore/preferences/protobuf/g;

    .line 413
    .line 414
    if-eqz v0, :cond_5

    .line 415
    .line 416
    move-object v0, v2

    .line 417
    check-cast v0, Landroidx/datastore/preferences/protobuf/g;

    .line 418
    .line 419
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/g;->size()I

    .line 420
    .line 421
    .line 422
    move-result v0

    .line 423
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/m;->m0(I)I

    .line 424
    .line 425
    .line 426
    move-result v2

    .line 427
    goto :goto_6

    .line 428
    :cond_5
    move-object v0, v2

    .line 429
    check-cast v0, Ljava/lang/String;

    .line 430
    .line 431
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/m;->j0(Ljava/lang/String;)I

    .line 432
    .line 433
    .line 434
    move-result v4

    .line 435
    goto :goto_7

    .line 436
    :pswitch_1c
    move-object v0, v2

    .line 437
    check-cast v0, Ljava/lang/Boolean;

    .line 438
    .line 439
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    goto :goto_7

    .line 443
    :pswitch_1d
    move-object v0, v2

    .line 444
    check-cast v0, Ljava/lang/Integer;

    .line 445
    .line 446
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 447
    .line 448
    .line 449
    goto :goto_5

    .line 450
    :pswitch_1e
    move-object v0, v2

    .line 451
    check-cast v0, Ljava/lang/Long;

    .line 452
    .line 453
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 454
    .line 455
    .line 456
    goto/16 :goto_4

    .line 457
    .line 458
    :pswitch_1f
    move-object v0, v2

    .line 459
    check-cast v0, Ljava/lang/Integer;

    .line 460
    .line 461
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 462
    .line 463
    .line 464
    move-result v0

    .line 465
    int-to-long v2, v0

    .line 466
    invoke-static {v2, v3}, Landroidx/datastore/preferences/protobuf/m;->o0(J)I

    .line 467
    .line 468
    .line 469
    move-result v4

    .line 470
    goto :goto_7

    .line 471
    :pswitch_20
    move-object v0, v2

    .line 472
    check-cast v0, Ljava/lang/Long;

    .line 473
    .line 474
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 475
    .line 476
    .line 477
    move-result-wide v2

    .line 478
    invoke-static {v2, v3}, Landroidx/datastore/preferences/protobuf/m;->o0(J)I

    .line 479
    .line 480
    .line 481
    move-result v4

    .line 482
    goto :goto_7

    .line 483
    :pswitch_21
    move-object v0, v2

    .line 484
    check-cast v0, Ljava/lang/Long;

    .line 485
    .line 486
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 487
    .line 488
    .line 489
    move-result-wide v2

    .line 490
    invoke-static {v2, v3}, Landroidx/datastore/preferences/protobuf/m;->o0(J)I

    .line 491
    .line 492
    .line 493
    move-result v4

    .line 494
    goto :goto_7

    .line 495
    :pswitch_22
    move-object v0, v2

    .line 496
    check-cast v0, Ljava/lang/Float;

    .line 497
    .line 498
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 499
    .line 500
    .line 501
    goto/16 :goto_5

    .line 502
    .line 503
    :pswitch_23
    move-object v0, v2

    .line 504
    check-cast v0, Ljava/lang/Double;

    .line 505
    .line 506
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 507
    .line 508
    .line 509
    goto/16 :goto_4

    .line 510
    .line 511
    :goto_7
    add-int/2addr v4, v5

    .line 512
    add-int/2addr v4, v1

    .line 513
    return v4

    .line 514
    nop

    .line 515
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
    .end packed-switch
.end method
