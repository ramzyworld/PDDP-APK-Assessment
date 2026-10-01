.class public abstract Lr/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La1/a;

.field public static final b:Lm/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Lr/j;

    .line 8
    .line 9
    invoke-direct {v0}, La1/a;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lr/e;->a:La1/a;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/16 v1, 0x1c

    .line 16
    .line 17
    if-lt v0, v1, :cond_1

    .line 18
    .line 19
    new-instance v0, Lr/i;

    .line 20
    .line 21
    invoke-direct {v0}, Lr/h;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lr/e;->a:La1/a;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/16 v1, 0x1a

    .line 28
    .line 29
    if-lt v0, v1, :cond_2

    .line 30
    .line 31
    new-instance v0, Lr/h;

    .line 32
    .line 33
    invoke-direct {v0}, Lr/h;-><init>()V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lr/e;->a:La1/a;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    const/16 v1, 0x18

    .line 40
    .line 41
    if-lt v0, v1, :cond_4

    .line 42
    .line 43
    sget-object v0, Lr/g;->o:Ljava/lang/reflect/Method;

    .line 44
    .line 45
    if-nez v0, :cond_3

    .line 46
    .line 47
    const-string v1, "TypefaceCompatApi24Impl"

    .line 48
    .line 49
    const-string v2, "Unable to collect necessary private methods.Fallback to legacy implementation."

    .line 50
    .line 51
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    :cond_3
    if-eqz v0, :cond_4

    .line 55
    .line 56
    new-instance v0, Lr/g;

    .line 57
    .line 58
    invoke-direct {v0}, La1/a;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v0, Lr/e;->a:La1/a;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_4
    new-instance v0, Lr/f;

    .line 65
    .line 66
    invoke-direct {v0}, La1/a;-><init>()V

    .line 67
    .line 68
    .line 69
    sput-object v0, Lr/e;->a:La1/a;

    .line 70
    .line 71
    :goto_0
    new-instance v0, Lm/d;

    .line 72
    .line 73
    const/16 v1, 0x10

    .line 74
    .line 75
    invoke-direct {v0, v1}, Lm/d;-><init>(I)V

    .line 76
    .line 77
    .line 78
    sput-object v0, Lr/e;->b:Lm/d;

    .line 79
    .line 80
    return-void
.end method

.method public static a(Landroid/content/Context;Lq/f;Landroid/content/res/Resources;ILjava/lang/String;IILj/s;)Landroid/graphics/Typeface;
    .locals 14

    .line 1
    move-object v0, p0

    .line 2
    move-object v1, p1

    .line 3
    move/from16 v7, p6

    .line 4
    .line 5
    move-object/from16 v2, p7

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v8, 0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    instance-of v5, v1, Lq/i;

    .line 11
    .line 12
    if-eqz v5, :cond_a

    .line 13
    .line 14
    check-cast v1, Lq/i;

    .line 15
    .line 16
    iget-object v5, v1, Lq/i;->d:Ljava/lang/String;

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    if-eqz v5, :cond_1

    .line 20
    .line 21
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v5, v4}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    sget-object v6, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 33
    .line 34
    invoke-static {v6, v4}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    if-eqz v5, :cond_1

    .line 39
    .line 40
    invoke-virtual {v5, v6}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-nez v6, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    :goto_0
    move-object v5, v9

    .line 48
    :goto_1
    if-eqz v5, :cond_2

    .line 49
    .line 50
    new-instance v0, Landroid/os/Handler;

    .line 51
    .line 52
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 57
    .line 58
    .line 59
    new-instance v1, LL/h;

    .line 60
    .line 61
    invoke-direct {v1, v8, v2, v5}, LL/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 65
    .line 66
    .line 67
    return-object v5

    .line 68
    :cond_2
    iget v5, v1, Lq/i;->c:I

    .line 69
    .line 70
    if-nez v5, :cond_3

    .line 71
    .line 72
    const/4 v5, 0x1

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    const/4 v5, 0x0

    .line 75
    :goto_2
    iget v10, v1, Lq/i;->b:I

    .line 76
    .line 77
    new-instance v6, Landroid/os/Handler;

    .line 78
    .line 79
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 80
    .line 81
    .line 82
    move-result-object v11

    .line 83
    invoke-direct {v6, v11}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 84
    .line 85
    .line 86
    new-instance v11, Lp0/b;

    .line 87
    .line 88
    invoke-direct {v11}, Lp0/b;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v2, v11, Lp0/b;->f:Ljava/lang/Object;

    .line 92
    .line 93
    iget-object v12, v1, Lq/i;->a:Lv/d;

    .line 94
    .line 95
    new-instance v13, LN/Q;

    .line 96
    .line 97
    const/16 v1, 0x19

    .line 98
    .line 99
    invoke-direct {v13, v1, v11, v6}, LN/Q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    if-eqz v5, :cond_6

    .line 103
    .line 104
    sget-object v1, Lv/h;->a:Lm/d;

    .line 105
    .line 106
    new-instance v1, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 109
    .line 110
    .line 111
    iget-object v2, v12, Lv/d;->e:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v2, Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string v2, "-"

    .line 119
    .line 120
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    sget-object v1, Lv/h;->a:Lm/d;

    .line 131
    .line 132
    invoke-virtual {v1, v2}, Lm/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    check-cast v1, Landroid/graphics/Typeface;

    .line 137
    .line 138
    if-eqz v1, :cond_4

    .line 139
    .line 140
    new-instance v0, LV0/i;

    .line 141
    .line 142
    invoke-direct {v0, v11, v1, v3, v4}, LV0/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v6, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 146
    .line 147
    .line 148
    :goto_3
    move-object v9, v1

    .line 149
    goto/16 :goto_7

    .line 150
    .line 151
    :cond_4
    const/4 v1, -0x1

    .line 152
    if-ne v10, v1, :cond_5

    .line 153
    .line 154
    invoke-static {v2, p0, v12, v7}, Lv/h;->a(Ljava/lang/String;Landroid/content/Context;Lv/d;I)Lv/g;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {v13, v0}, LN/Q;->k(Lv/g;)V

    .line 159
    .line 160
    .line 161
    iget-object v9, v0, Lv/g;->a:Landroid/graphics/Typeface;

    .line 162
    .line 163
    goto/16 :goto_7

    .line 164
    .line 165
    :cond_5
    new-instance v8, Lv/e;

    .line 166
    .line 167
    const/4 v6, 0x0

    .line 168
    move-object v1, v8

    .line 169
    move-object v3, p0

    .line 170
    move-object v4, v12

    .line 171
    move/from16 v5, p6

    .line 172
    .line 173
    invoke-direct/range {v1 .. v6}, Lv/e;-><init>(Ljava/lang/String;Landroid/content/Context;Lv/d;II)V

    .line 174
    .line 175
    .line 176
    :try_start_0
    sget-object v0, Lv/h;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 177
    .line 178
    invoke-interface {v0, v8}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 179
    .line 180
    .line 181
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3

    .line 182
    int-to-long v1, v10

    .line 183
    :try_start_1
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 184
    .line 185
    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_2

    .line 189
    :try_start_2
    check-cast v0, Lv/g;

    .line 190
    .line 191
    invoke-virtual {v13, v0}, LN/Q;->k(Lv/g;)V

    .line 192
    .line 193
    .line 194
    iget-object v9, v0, Lv/g;->a:Landroid/graphics/Typeface;

    .line 195
    .line 196
    goto/16 :goto_7

    .line 197
    .line 198
    :catch_0
    move-exception v0

    .line 199
    goto :goto_4

    .line 200
    :catch_1
    move-exception v0

    .line 201
    goto :goto_5

    .line 202
    :catch_2
    new-instance v0, Ljava/lang/InterruptedException;

    .line 203
    .line 204
    const-string v1, "timeout"

    .line 205
    .line 206
    invoke-direct {v0, v1}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw v0

    .line 210
    :goto_4
    throw v0

    .line 211
    :goto_5
    new-instance v1, Ljava/lang/RuntimeException;

    .line 212
    .line 213
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 214
    .line 215
    .line 216
    throw v1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_3

    .line 217
    :catch_3
    new-instance v0, LD/b;

    .line 218
    .line 219
    iget-object v1, v13, LN/Q;->f:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v1, Lp0/b;

    .line 222
    .line 223
    const/4 v2, -0x3

    .line 224
    invoke-direct {v0, v1, v2}, LD/b;-><init>(Lp0/b;I)V

    .line 225
    .line 226
    .line 227
    iget-object v1, v13, LN/Q;->g:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v1, Landroid/os/Handler;

    .line 230
    .line 231
    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 232
    .line 233
    .line 234
    goto/16 :goto_7

    .line 235
    .line 236
    :cond_6
    sget-object v1, Lv/h;->a:Lm/d;

    .line 237
    .line 238
    new-instance v1, Ljava/lang/StringBuilder;

    .line 239
    .line 240
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 241
    .line 242
    .line 243
    iget-object v2, v12, Lv/d;->e:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v2, Ljava/lang/String;

    .line 246
    .line 247
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    const-string v2, "-"

    .line 251
    .line 252
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v10

    .line 262
    sget-object v1, Lv/h;->a:Lm/d;

    .line 263
    .line 264
    invoke-virtual {v1, v10}, Lm/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    check-cast v1, Landroid/graphics/Typeface;

    .line 269
    .line 270
    if-eqz v1, :cond_7

    .line 271
    .line 272
    new-instance v0, LV0/i;

    .line 273
    .line 274
    invoke-direct {v0, v11, v1, v3, v4}, LV0/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v6, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 278
    .line 279
    .line 280
    goto/16 :goto_3

    .line 281
    .line 282
    :cond_7
    new-instance v1, Lv/f;

    .line 283
    .line 284
    invoke-direct {v1, v4, v13}, Lv/f;-><init>(ILjava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    sget-object v3, Lv/h;->c:Ljava/lang/Object;

    .line 288
    .line 289
    monitor-enter v3

    .line 290
    :try_start_3
    sget-object v2, Lv/h;->d:Lm/i;

    .line 291
    .line 292
    invoke-virtual {v2, v10, v9}, Lm/i;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    check-cast v4, Ljava/util/ArrayList;

    .line 297
    .line 298
    if-eqz v4, :cond_8

    .line 299
    .line 300
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    monitor-exit v3

    .line 304
    goto :goto_7

    .line 305
    :catchall_0
    move-exception v0

    .line 306
    goto :goto_8

    .line 307
    :cond_8
    new-instance v4, Ljava/util/ArrayList;

    .line 308
    .line 309
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2, v10, v4}, Lm/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 319
    new-instance v11, Lv/e;

    .line 320
    .line 321
    const/4 v6, 0x1

    .line 322
    move-object v1, v11

    .line 323
    move-object v2, v10

    .line 324
    move-object v3, p0

    .line 325
    move-object v4, v12

    .line 326
    move/from16 v5, p6

    .line 327
    .line 328
    invoke-direct/range {v1 .. v6}, Lv/e;-><init>(Ljava/lang/String;Landroid/content/Context;Lv/d;II)V

    .line 329
    .line 330
    .line 331
    sget-object v0, Lv/h;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 332
    .line 333
    new-instance v1, Lv/f;

    .line 334
    .line 335
    invoke-direct {v1, v8, v10}, Lv/f;-><init>(ILjava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    if-nez v2, :cond_9

    .line 343
    .line 344
    new-instance v2, Landroid/os/Handler;

    .line 345
    .line 346
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 351
    .line 352
    .line 353
    goto :goto_6

    .line 354
    :cond_9
    new-instance v2, Landroid/os/Handler;

    .line 355
    .line 356
    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    .line 357
    .line 358
    .line 359
    :goto_6
    new-instance v3, Lv/l;

    .line 360
    .line 361
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 362
    .line 363
    .line 364
    iput-object v11, v3, Lv/l;->e:Lv/e;

    .line 365
    .line 366
    iput-object v1, v3, Lv/l;->f:Lv/f;

    .line 367
    .line 368
    iput-object v2, v3, Lv/l;->g:Landroid/os/Handler;

    .line 369
    .line 370
    invoke-virtual {v0, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 371
    .line 372
    .line 373
    :goto_7
    move-object/from16 v4, p2

    .line 374
    .line 375
    goto :goto_9

    .line 376
    :goto_8
    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 377
    throw v0

    .line 378
    :cond_a
    sget-object v3, Lr/e;->a:La1/a;

    .line 379
    .line 380
    check-cast v1, Lq/g;

    .line 381
    .line 382
    move-object/from16 v4, p2

    .line 383
    .line 384
    invoke-virtual {v3, p0, v1, v4, v7}, La1/a;->g(Landroid/content/Context;Lq/g;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;

    .line 385
    .line 386
    .line 387
    move-result-object v9

    .line 388
    if-eqz v9, :cond_b

    .line 389
    .line 390
    new-instance v0, Landroid/os/Handler;

    .line 391
    .line 392
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 397
    .line 398
    .line 399
    new-instance v1, LL/h;

    .line 400
    .line 401
    invoke-direct {v1, v8, v2, v9}, LL/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 405
    .line 406
    .line 407
    goto :goto_9

    .line 408
    :cond_b
    invoke-virtual/range {p7 .. p7}, Lj/s;->a()V

    .line 409
    .line 410
    .line 411
    :goto_9
    if-eqz v9, :cond_c

    .line 412
    .line 413
    sget-object v0, Lr/e;->b:Lm/d;

    .line 414
    .line 415
    invoke-static/range {p2 .. p6}, Lr/e;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    invoke-virtual {v0, v1, v9}, Lm/d;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    :cond_c
    return-object v9
.end method

.method public static b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x2d

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method
