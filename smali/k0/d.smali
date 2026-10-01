.class public final Lk0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:LH/a;

.field public c:J

.field public d:Li0/b;

.field public e:Lio/flutter/embedding/engine/FlutterJNI;

.field public f:Ljava/util/concurrent/ExecutorService;

.field public g:Ljava/util/concurrent/Future;


# virtual methods
.method public final a(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    const-string v2, "--domain-network-policy="

    .line 6
    .line 7
    const-string v3, "--aot-shared-library-name="

    .line 8
    .line 9
    const-string v4, "io.flutter.embedding.android.DisableMergedPlatformUIThread"

    .line 10
    .line 11
    const-string v5, "io.flutter.embedding.android.EnableImpeller"

    .line 12
    .line 13
    const-string v6, "--leak-vm="

    .line 14
    .line 15
    const-string v7, "--impeller-backend="

    .line 16
    .line 17
    const-string v8, "--resource-cache-max-bytes-threshold="

    .line 18
    .line 19
    const-string v9, "--old-gen-heap-size="

    .line 20
    .line 21
    const-string v10, "--cache-dir-path="

    .line 22
    .line 23
    const-string v11, "--icu-native-lib-path="

    .line 24
    .line 25
    iget-boolean v12, v1, Lk0/d;->a:Z

    .line 26
    .line 27
    if-eqz v12, :cond_0

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 31
    .line 32
    .line 33
    move-result-object v12

    .line 34
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 35
    .line 36
    .line 37
    move-result-object v13

    .line 38
    if-ne v12, v13, :cond_f

    .line 39
    .line 40
    iget-object v12, v1, Lk0/d;->b:LH/a;

    .line 41
    .line 42
    if-eqz v12, :cond_e

    .line 43
    .line 44
    :try_start_0
    const-string v12, "FlutterLoader#ensureInitializationComplete"

    .line 45
    .line 46
    invoke-static {v12}, Lw0/a;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    :try_start_1
    iget-object v12, v1, Lk0/d;->g:Ljava/util/concurrent/Future;

    .line 50
    .line 51
    invoke-interface {v12}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v12

    .line 55
    check-cast v12, Lk0/c;

    .line 56
    .line 57
    new-instance v13, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string v14, "--icu-symbol-prefix=_binary_icudtl_dat"

    .line 63
    .line 64
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    new-instance v14, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v14, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iget-object v11, v1, Lk0/d;->d:Li0/b;

    .line 73
    .line 74
    iget-object v11, v11, Li0/b;->i:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v11, Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    sget-object v11, Ljava/io/File;->separator:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v15, "libflutter.so"

    .line 87
    .line 88
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v14

    .line 95
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    if-eqz v0, :cond_1

    .line 99
    .line 100
    invoke-static {v13, v0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    move-object v2, v0

    .line 106
    goto/16 :goto_6

    .line 107
    .line 108
    :cond_1
    :goto_0
    iget-object v0, v1, Lk0/d;->d:Li0/b;

    .line 109
    .line 110
    iget-object v0, v0, Li0/b;->f:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    new-instance v0, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    iget-object v3, v1, Lk0/d;->d:Li0/b;

    .line 127
    .line 128
    iget-object v3, v3, Li0/b;->i:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v3, Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    iget-object v3, v1, Lk0/d;->d:Li0/b;

    .line 139
    .line 140
    iget-object v3, v3, Li0/b;->f:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v3, Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    new-instance v0, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    invoke-direct {v0, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    iget-object v3, v12, Lk0/c;->b:Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    iget-object v0, v1, Lk0/d;->d:Li0/b;

    .line 172
    .line 173
    iget-object v0, v0, Li0/b;->h:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v0, Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    iget-object v0, v1, Lk0/d;->b:LH/a;

    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    const/16 v3, 0x80

    .line 198
    .line 199
    invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 204
    .line 205
    const/4 v2, 0x0

    .line 206
    if-eqz v0, :cond_2

    .line 207
    .line 208
    const-string v3, "io.flutter.embedding.android.OldGenHeapSize"

    .line 209
    .line 210
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    goto :goto_1

    .line 215
    :cond_2
    const/4 v3, 0x0

    .line 216
    :goto_1
    if-nez v3, :cond_3

    .line 217
    .line 218
    const-string v3, "activity"

    .line 219
    .line 220
    move-object/from16 v10, p1

    .line 221
    .line 222
    invoke-virtual {v10, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    check-cast v3, Landroid/app/ActivityManager;

    .line 227
    .line 228
    new-instance v11, Landroid/app/ActivityManager$MemoryInfo;

    .line 229
    .line 230
    invoke-direct {v11}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v3, v11}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    .line 234
    .line 235
    .line 236
    iget-wide v14, v11, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J

    .line 237
    .line 238
    long-to-double v14, v14

    .line 239
    const-wide v16, 0x412e848000000000L    # 1000000.0

    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    div-double v14, v14, v16

    .line 245
    .line 246
    const-wide/high16 v16, 0x4000000000000000L    # 2.0

    .line 247
    .line 248
    div-double v14, v14, v16

    .line 249
    .line 250
    double-to-int v3, v14

    .line 251
    goto :goto_2

    .line 252
    :cond_3
    move-object/from16 v10, p1

    .line 253
    .line 254
    :goto_2
    new-instance v11, Ljava/lang/StringBuilder;

    .line 255
    .line 256
    invoke-direct {v11, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    iget v9, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 278
    .line 279
    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 280
    .line 281
    mul-int v9, v9, v3

    .line 282
    .line 283
    mul-int/lit8 v9, v9, 0x30

    .line 284
    .line 285
    new-instance v3, Ljava/lang/StringBuilder;

    .line 286
    .line 287
    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    const-string v3, "--prefetched-default-font-manager"

    .line 301
    .line 302
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    if-eqz v0, :cond_b

    .line 306
    .line 307
    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 308
    .line 309
    .line 310
    move-result v3

    .line 311
    if-eqz v3, :cond_5

    .line 312
    .line 313
    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    if-eqz v3, :cond_4

    .line 318
    .line 319
    const-string v3, "--enable-impeller=true"

    .line 320
    .line 321
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    goto :goto_3

    .line 325
    :cond_4
    const-string v3, "--enable-impeller=false"

    .line 326
    .line 327
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    :cond_5
    :goto_3
    const-string v3, "io.flutter.embedding.android.EnableVulkanValidation"

    .line 331
    .line 332
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 333
    .line 334
    .line 335
    move-result v3

    .line 336
    if-eqz v3, :cond_6

    .line 337
    .line 338
    const-string v3, "--enable-vulkan-validation"

    .line 339
    .line 340
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    :cond_6
    const-string v3, "io.flutter.embedding.android.EnableOpenGLGPUTracing"

    .line 344
    .line 345
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 346
    .line 347
    .line 348
    move-result v3

    .line 349
    if-eqz v3, :cond_7

    .line 350
    .line 351
    const-string v3, "--enable-opengl-gpu-tracing"

    .line 352
    .line 353
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    :cond_7
    const-string v3, "io.flutter.embedding.android.EnableVulkanGPUTracing"

    .line 357
    .line 358
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 359
    .line 360
    .line 361
    move-result v3

    .line 362
    if-eqz v3, :cond_8

    .line 363
    .line 364
    const-string v3, "--enable-vulkan-gpu-tracing"

    .line 365
    .line 366
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    :cond_8
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 370
    .line 371
    .line 372
    move-result v3

    .line 373
    if-eqz v3, :cond_9

    .line 374
    .line 375
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    .line 376
    .line 377
    .line 378
    move-result v3

    .line 379
    if-eqz v3, :cond_9

    .line 380
    .line 381
    const-string v3, "--no-enable-merged-platform-ui-thread"

    .line 382
    .line 383
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    :cond_9
    const-string v3, "io.flutter.embedding.android.EnableSurfaceControl"

    .line 387
    .line 388
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 389
    .line 390
    .line 391
    move-result v3

    .line 392
    if-eqz v3, :cond_a

    .line 393
    .line 394
    const-string v3, "--enable-surface-control"

    .line 395
    .line 396
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    :cond_a
    const-string v3, "io.flutter.embedding.android.ImpellerBackend"

    .line 400
    .line 401
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v3

    .line 405
    if-eqz v3, :cond_b

    .line 406
    .line 407
    invoke-virtual {v7, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v3

    .line 411
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    :cond_b
    const/4 v3, 0x1

    .line 415
    if-nez v0, :cond_c

    .line 416
    .line 417
    const/4 v0, 0x1

    .line 418
    goto :goto_4

    .line 419
    :cond_c
    const-string v4, "io.flutter.embedding.android.LeakVM"

    .line 420
    .line 421
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    :goto_4
    if-eqz v0, :cond_d

    .line 426
    .line 427
    const-string v0, "true"

    .line 428
    .line 429
    goto :goto_5

    .line 430
    :cond_d
    const-string v0, "false"

    .line 431
    .line 432
    :goto_5
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 440
    .line 441
    .line 442
    move-result-wide v4

    .line 443
    iget-wide v6, v1, Lk0/d;->c:J

    .line 444
    .line 445
    sub-long v20, v4, v6

    .line 446
    .line 447
    iget-object v14, v1, Lk0/d;->e:Lio/flutter/embedding/engine/FlutterJNI;

    .line 448
    .line 449
    new-array v0, v2, [Ljava/lang/String;

    .line 450
    .line 451
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    move-object/from16 v16, v0

    .line 456
    .line 457
    check-cast v16, [Ljava/lang/String;

    .line 458
    .line 459
    iget-object v0, v12, Lk0/c;->a:Ljava/lang/String;

    .line 460
    .line 461
    iget-object v2, v12, Lk0/c;->b:Ljava/lang/String;

    .line 462
    .line 463
    const/16 v17, 0x0

    .line 464
    .line 465
    move-object/from16 v15, p1

    .line 466
    .line 467
    move-object/from16 v18, v0

    .line 468
    .line 469
    move-object/from16 v19, v2

    .line 470
    .line 471
    invoke-virtual/range {v14 .. v21}, Lio/flutter/embedding/engine/FlutterJNI;->init(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 472
    .line 473
    .line 474
    iput-boolean v3, v1, Lk0/d;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 475
    .line 476
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 477
    .line 478
    .line 479
    return-void

    .line 480
    :goto_6
    :try_start_3
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 481
    .line 482
    .line 483
    goto :goto_7

    .line 484
    :catchall_1
    move-exception v0

    .line 485
    move-object v3, v0

    .line 486
    :try_start_4
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 487
    .line 488
    .line 489
    :goto_7
    throw v2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 490
    :catch_0
    move-exception v0

    .line 491
    const-string v2, "FlutterLoader"

    .line 492
    .line 493
    const-string v3, "Flutter initialization failed."

    .line 494
    .line 495
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 496
    .line 497
    .line 498
    new-instance v2, Ljava/lang/RuntimeException;

    .line 499
    .line 500
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 501
    .line 502
    .line 503
    throw v2

    .line 504
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 505
    .line 506
    const-string v2, "ensureInitializationComplete must be called after startInitialization"

    .line 507
    .line 508
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    throw v0

    .line 512
    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 513
    .line 514
    const-string v2, "ensureInitializationComplete must be called on the main thread"

    .line 515
    .line 516
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 517
    .line 518
    .line 519
    throw v0
.end method

.method public final b(Landroid/content/Context;)V
    .locals 3

    .line 1
    new-instance v0, LH/a;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-direct {v0, v1}, LH/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lk0/d;->b:LH/a;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-ne v1, v2, :cond_1

    .line 22
    .line 23
    const-string v1, "FlutterLoader#startInitialization"

    .line 24
    .line 25
    invoke-static {v1}, Lw0/a;->b(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object v0, p0, Lk0/d;->b:LH/a;

    .line 33
    .line 34
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    iput-wide v0, p0, Lk0/d;->c:J

    .line 39
    .line 40
    invoke-static {p1}, Lk0/a;->a(Landroid/content/Context;)Li0/b;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Lk0/d;->d:Li0/b;

    .line 45
    .line 46
    const-string v0, "display"

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Landroid/hardware/display/DisplayManager;

    .line 53
    .line 54
    iget-object v1, p0, Lk0/d;->e:Lio/flutter/embedding/engine/FlutterJNI;

    .line 55
    .line 56
    invoke-static {v0, v1}, Lio/flutter/view/t;->a(Landroid/hardware/display/DisplayManager;Lio/flutter/embedding/engine/FlutterJNI;)Lio/flutter/view/t;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget-object v1, v0, Lio/flutter/view/t;->d:Lio/flutter/view/b;

    .line 61
    .line 62
    iget-object v0, v0, Lio/flutter/view/t;->b:Lio/flutter/embedding/engine/FlutterJNI;

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/FlutterJNI;->setAsyncWaitForVsyncDelegate(Lh0/l;)V

    .line 65
    .line 66
    .line 67
    new-instance v0, Lk0/b;

    .line 68
    .line 69
    invoke-direct {v0, p0, p1}, Lk0/b;-><init>(Lk0/d;Landroid/content/Context;)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lk0/d;->f:Ljava/util/concurrent/ExecutorService;

    .line 73
    .line 74
    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iput-object p1, p0, Lk0/d;->g:Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 81
    .line 82
    .line 83
    :goto_0
    return-void

    .line 84
    :catchall_0
    move-exception p1

    .line 85
    :try_start_1
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :catchall_1
    move-exception v0

    .line 90
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    :goto_1
    throw p1

    .line 94
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 95
    .line 96
    const-string v0, "startInitialization must be called on the main thread"

    .line 97
    .line 98
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p1
.end method
