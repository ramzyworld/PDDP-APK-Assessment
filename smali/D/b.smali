.class public final LD/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LD/b;->e:I

    iput-object p2, p0, LD/b;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lp0/b;I)V
    .locals 0

    const/4 p2, 0x7

    iput p2, p0, LD/b;->e:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD/b;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    const/4 v0, 0x2

    .line 2
    const-wide/16 v1, 0x0

    .line 3
    .line 4
    const/4 v3, 0x0

    .line 5
    const/4 v4, 0x0

    .line 6
    const/4 v5, 0x1

    .line 7
    iget-object v6, p0, LD/b;->f:Ljava/lang/Object;

    .line 8
    .line 9
    iget v7, p0, LD/b;->e:I

    .line 10
    .line 11
    packed-switch v7, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v6, Lp0/b;

    .line 15
    .line 16
    iget-object v0, v6, Lp0/b;->f:Ljava/lang/Object;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    check-cast v6, Landroidx/appcompat/widget/Toolbar;

    .line 20
    .line 21
    iget-object v0, v6, Landroidx/appcompat/widget/Toolbar;->e:Landroidx/appcompat/widget/ActionMenuView;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->w:Lj/i;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0}, Lj/i;->k()Z

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void

    .line 33
    :pswitch_1
    check-cast v6, Lj/A;

    .line 34
    .line 35
    iput-object v3, v6, Lj/A;->q:LD/b;

    .line 36
    .line 37
    invoke-virtual {v6}, Lj/A;->drawableStateChanged()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_2
    check-cast v6, Le/e;

    .line 42
    .line 43
    invoke-virtual {v6, v5}, Le/f;->a(Z)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_3
    check-cast v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 51
    .line 52
    invoke-virtual {v6}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->J()Z

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_4
    check-cast v6, Landroidx/recyclerview/widget/RecyclerView;

    .line 57
    .line 58
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->H:LN/v;

    .line 59
    .line 60
    if-eqz v0, :cond_e

    .line 61
    .line 62
    check-cast v0, LN/d;

    .line 63
    .line 64
    iget-object v5, v0, LN/d;->e:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    iget-object v7, v0, LN/d;->g:Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    iget-object v9, v0, LN/d;->h:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    iget-object v11, v0, LN/d;->f:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 85
    .line 86
    .line 87
    move-result v12

    .line 88
    if-eqz v6, :cond_1

    .line 89
    .line 90
    if-eqz v8, :cond_1

    .line 91
    .line 92
    if-eqz v12, :cond_1

    .line 93
    .line 94
    if-eqz v10, :cond_1

    .line 95
    .line 96
    goto/16 :goto_4

    .line 97
    .line 98
    :cond_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v13

    .line 102
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v14

    .line 106
    if-nez v14, :cond_d

    .line 107
    .line 108
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 109
    .line 110
    .line 111
    if-nez v8, :cond_4

    .line 112
    .line 113
    new-instance v5, Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 119
    .line 120
    .line 121
    iget-object v13, v0, LN/d;->j:Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 127
    .line 128
    .line 129
    if-eqz v6, :cond_3

    .line 130
    .line 131
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v14

    .line 139
    if-nez v14, :cond_2

    .line 140
    .line 141
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_2
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {v0}, LI0/h;->g(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    throw v3

    .line 156
    :cond_3
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-static {v0}, LI0/h;->g(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    throw v3

    .line 164
    :cond_4
    :goto_0
    if-nez v10, :cond_7

    .line 165
    .line 166
    new-instance v5, Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 172
    .line 173
    .line 174
    iget-object v7, v0, LN/d;->k:Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    .line 180
    .line 181
    .line 182
    if-eqz v6, :cond_6

    .line 183
    .line 184
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object v9

    .line 188
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v13

    .line 192
    if-nez v13, :cond_5

    .line 193
    .line 194
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_5
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-static {v0}, LI0/h;->g(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    throw v3

    .line 209
    :cond_6
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-static {v0}, LI0/h;->g(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    throw v3

    .line 217
    :cond_7
    :goto_1
    if-nez v12, :cond_e

    .line 218
    .line 219
    new-instance v3, Ljava/util/ArrayList;

    .line 220
    .line 221
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 225
    .line 226
    .line 227
    iget-object v5, v0, LN/d;->i:Ljava/util/ArrayList;

    .line 228
    .line 229
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    .line 233
    .line 234
    .line 235
    if-eqz v6, :cond_a

    .line 236
    .line 237
    if-eqz v8, :cond_a

    .line 238
    .line 239
    if-nez v10, :cond_8

    .line 240
    .line 241
    goto :goto_2

    .line 242
    :cond_8
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    if-nez v1, :cond_9

    .line 251
    .line 252
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    goto :goto_4

    .line 259
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    new-instance v0, Ljava/lang/ClassCastException;

    .line 267
    .line 268
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 269
    .line 270
    .line 271
    throw v0

    .line 272
    :cond_a
    :goto_2
    if-nez v8, :cond_b

    .line 273
    .line 274
    iget-wide v5, v0, LN/v;->c:J

    .line 275
    .line 276
    goto :goto_3

    .line 277
    :cond_b
    move-wide v5, v1

    .line 278
    :goto_3
    if-nez v10, :cond_c

    .line 279
    .line 280
    iget-wide v1, v0, LN/v;->d:J

    .line 281
    .line 282
    :cond_c
    invoke-static {v5, v6, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 283
    .line 284
    .line 285
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    new-instance v0, Ljava/lang/ClassCastException;

    .line 293
    .line 294
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 295
    .line 296
    .line 297
    throw v0

    .line 298
    :cond_d
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    new-instance v0, Ljava/lang/ClassCastException;

    .line 306
    .line 307
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 308
    .line 309
    .line 310
    throw v0

    .line 311
    :cond_e
    :goto_4
    return-void

    .line 312
    :pswitch_5
    check-cast v6, LN/h;

    .line 313
    .line 314
    iget v1, v6, LN/h;->v:I

    .line 315
    .line 316
    iget-object v2, v6, LN/h;->u:Landroid/animation/ValueAnimator;

    .line 317
    .line 318
    if-eq v1, v5, :cond_f

    .line 319
    .line 320
    if-eq v1, v0, :cond_10

    .line 321
    .line 322
    goto :goto_5

    .line 323
    :cond_f
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->cancel()V

    .line 324
    .line 325
    .line 326
    :cond_10
    const/4 v1, 0x3

    .line 327
    iput v1, v6, LN/h;->v:I

    .line 328
    .line 329
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    check-cast v1, Ljava/lang/Float;

    .line 334
    .line 335
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    new-array v0, v0, [F

    .line 340
    .line 341
    aput v1, v0, v4

    .line 342
    .line 343
    const/4 v1, 0x0

    .line 344
    aput v1, v0, v5

    .line 345
    .line 346
    invoke-virtual {v2, v0}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 347
    .line 348
    .line 349
    const/16 v0, 0x1f4

    .line 350
    .line 351
    int-to-long v0, v0

    .line 352
    invoke-virtual {v2, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->start()V

    .line 356
    .line 357
    .line 358
    :goto_5
    return-void

    .line 359
    :pswitch_6
    check-cast v6, LD/g;

    .line 360
    .line 361
    iget-boolean v0, v6, LD/g;->o:Z

    .line 362
    .line 363
    if-nez v0, :cond_11

    .line 364
    .line 365
    goto/16 :goto_7

    .line 366
    .line 367
    :cond_11
    iget-boolean v0, v6, LD/g;->m:Z

    .line 368
    .line 369
    iget-object v3, v6, LD/g;->a:LD/a;

    .line 370
    .line 371
    if-eqz v0, :cond_12

    .line 372
    .line 373
    iput-boolean v4, v6, LD/g;->m:Z

    .line 374
    .line 375
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 376
    .line 377
    .line 378
    move-result-wide v7

    .line 379
    iput-wide v7, v3, LD/a;->e:J

    .line 380
    .line 381
    const-wide/16 v9, -0x1

    .line 382
    .line 383
    iput-wide v9, v3, LD/a;->g:J

    .line 384
    .line 385
    iput-wide v7, v3, LD/a;->f:J

    .line 386
    .line 387
    const/high16 v0, 0x3f000000    # 0.5f

    .line 388
    .line 389
    iput v0, v3, LD/a;->h:F

    .line 390
    .line 391
    :cond_12
    iget-wide v7, v3, LD/a;->g:J

    .line 392
    .line 393
    cmp-long v0, v7, v1

    .line 394
    .line 395
    if-lez v0, :cond_13

    .line 396
    .line 397
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 398
    .line 399
    .line 400
    move-result-wide v7

    .line 401
    iget-wide v9, v3, LD/a;->g:J

    .line 402
    .line 403
    iget v0, v3, LD/a;->i:I

    .line 404
    .line 405
    int-to-long v11, v0

    .line 406
    add-long/2addr v9, v11

    .line 407
    cmp-long v0, v7, v9

    .line 408
    .line 409
    if-lez v0, :cond_13

    .line 410
    .line 411
    goto :goto_6

    .line 412
    :cond_13
    invoke-virtual {v6}, LD/g;->e()Z

    .line 413
    .line 414
    .line 415
    move-result v0

    .line 416
    if-nez v0, :cond_14

    .line 417
    .line 418
    :goto_6
    iput-boolean v4, v6, LD/g;->o:Z

    .line 419
    .line 420
    goto :goto_7

    .line 421
    :cond_14
    iget-boolean v0, v6, LD/g;->n:Z

    .line 422
    .line 423
    iget-object v5, v6, LD/g;->c:Landroid/widget/ListView;

    .line 424
    .line 425
    if-eqz v0, :cond_15

    .line 426
    .line 427
    iput-boolean v4, v6, LD/g;->n:Z

    .line 428
    .line 429
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 430
    .line 431
    .line 432
    move-result-wide v9

    .line 433
    const/4 v13, 0x0

    .line 434
    const/4 v14, 0x0

    .line 435
    const/4 v11, 0x3

    .line 436
    const/4 v12, 0x0

    .line 437
    move-wide v7, v9

    .line 438
    invoke-static/range {v7 .. v14}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    invoke-virtual {v5, v0}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 443
    .line 444
    .line 445
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 446
    .line 447
    .line 448
    :cond_15
    iget-wide v7, v3, LD/a;->f:J

    .line 449
    .line 450
    cmp-long v0, v7, v1

    .line 451
    .line 452
    if-eqz v0, :cond_16

    .line 453
    .line 454
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 455
    .line 456
    .line 457
    move-result-wide v0

    .line 458
    invoke-virtual {v3, v0, v1}, LD/a;->a(J)F

    .line 459
    .line 460
    .line 461
    move-result v2

    .line 462
    const/high16 v4, -0x3f800000    # -4.0f

    .line 463
    .line 464
    mul-float v4, v4, v2

    .line 465
    .line 466
    mul-float v4, v4, v2

    .line 467
    .line 468
    const/high16 v7, 0x40800000    # 4.0f

    .line 469
    .line 470
    mul-float v2, v2, v7

    .line 471
    .line 472
    add-float/2addr v2, v4

    .line 473
    iget-wide v7, v3, LD/a;->f:J

    .line 474
    .line 475
    sub-long v7, v0, v7

    .line 476
    .line 477
    iput-wide v0, v3, LD/a;->f:J

    .line 478
    .line 479
    long-to-float v0, v7

    .line 480
    mul-float v0, v0, v2

    .line 481
    .line 482
    iget v1, v3, LD/a;->d:F

    .line 483
    .line 484
    mul-float v0, v0, v1

    .line 485
    .line 486
    float-to-int v0, v0

    .line 487
    iget-object v1, v6, LD/g;->q:Lj/A;

    .line 488
    .line 489
    invoke-virtual {v1, v0}, Landroid/widget/AbsListView;->scrollListBy(I)V

    .line 490
    .line 491
    .line 492
    sget-object v0, Ly/x;->a:Ljava/lang/reflect/Field;

    .line 493
    .line 494
    invoke-virtual {v5, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 495
    .line 496
    .line 497
    :goto_7
    return-void

    .line 498
    :cond_16
    new-instance v0, Ljava/lang/RuntimeException;

    .line 499
    .line 500
    const-string v1, "Cannot compute scroll delta before calling start()"

    .line 501
    .line 502
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    throw v0

    .line 506
    nop

    .line 507
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
