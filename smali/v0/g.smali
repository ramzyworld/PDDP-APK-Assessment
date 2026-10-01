.class public final Lv0/g;
.super Lv0/b;
.source "SourceFile"


# instance fields
.field public final d:Lv/d;


# direct methods
.method public constructor <init>(Lv/d;)V
    .locals 1

    .line 1
    const-string v0, "registrar"

    .line 2
    .line 3
    invoke-static {p1, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lv0/g;->d:Lv/d;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;
    .locals 3

    .line 1
    const-string v0, "buffer"

    .line 2
    .line 3
    invoke-static {p2, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, -0x80

    .line 7
    .line 8
    if-ne p1, v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0, p2}, Lq0/n;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string p2, "null cannot be cast to non-null type kotlin.Long"

    .line 15
    .line 16
    invoke-static {p1, p2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    check-cast p1, Ljava/lang/Long;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    iget-object v0, p0, Lv0/g;->d:Lv/d;

    .line 26
    .line 27
    iget-object v0, v0, Lv/d;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lv0/c;

    .line 30
    .line 31
    invoke-virtual {v0, p1, p2}, Lv0/c;->e(J)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v2, "Failed to find instance with identifier: "

    .line 40
    .line 41
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string p2, "PigeonProxyApiBaseCodec"

    .line 52
    .line 53
    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    :cond_0
    return-object v0

    .line 57
    :cond_1
    invoke-super {p0, p1, p2}, Lv0/b;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1
.end method

.method public final k(Lq0/m;Ljava/lang/Object;)V
    .locals 21

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
    const/16 v5, 0x13

    .line 8
    .line 9
    const/16 v6, 0x18

    .line 10
    .line 11
    const/4 v8, 0x7

    .line 12
    const/4 v12, 0x1

    .line 13
    const/4 v13, 0x0

    .line 14
    instance-of v15, v2, Ljava/lang/Boolean;

    .line 15
    .line 16
    if-nez v15, :cond_51

    .line 17
    .line 18
    instance-of v15, v2, [B

    .line 19
    .line 20
    if-nez v15, :cond_51

    .line 21
    .line 22
    instance-of v15, v2, Ljava/lang/Double;

    .line 23
    .line 24
    if-nez v15, :cond_51

    .line 25
    .line 26
    instance-of v15, v2, [D

    .line 27
    .line 28
    if-nez v15, :cond_51

    .line 29
    .line 30
    instance-of v15, v2, [F

    .line 31
    .line 32
    if-nez v15, :cond_51

    .line 33
    .line 34
    instance-of v15, v2, Ljava/lang/Integer;

    .line 35
    .line 36
    if-nez v15, :cond_51

    .line 37
    .line 38
    instance-of v15, v2, [I

    .line 39
    .line 40
    if-nez v15, :cond_51

    .line 41
    .line 42
    instance-of v15, v2, Ljava/util/List;

    .line 43
    .line 44
    if-nez v15, :cond_51

    .line 45
    .line 46
    instance-of v15, v2, Ljava/lang/Long;

    .line 47
    .line 48
    if-nez v15, :cond_51

    .line 49
    .line 50
    instance-of v15, v2, [J

    .line 51
    .line 52
    if-nez v15, :cond_51

    .line 53
    .line 54
    instance-of v15, v2, Ljava/util/Map;

    .line 55
    .line 56
    if-nez v15, :cond_51

    .line 57
    .line 58
    instance-of v15, v2, Ljava/lang/String;

    .line 59
    .line 60
    if-nez v15, :cond_51

    .line 61
    .line 62
    instance-of v15, v2, Lv0/p;

    .line 63
    .line 64
    if-nez v15, :cond_51

    .line 65
    .line 66
    instance-of v15, v2, Lv0/j;

    .line 67
    .line 68
    if-nez v15, :cond_51

    .line 69
    .line 70
    instance-of v15, v2, Lv0/v;

    .line 71
    .line 72
    if-nez v15, :cond_51

    .line 73
    .line 74
    instance-of v15, v2, Lv0/O;

    .line 75
    .line 76
    if-nez v15, :cond_51

    .line 77
    .line 78
    instance-of v15, v2, Lv0/u;

    .line 79
    .line 80
    if-nez v15, :cond_51

    .line 81
    .line 82
    if-nez v2, :cond_0

    .line 83
    .line 84
    goto/16 :goto_8

    .line 85
    .line 86
    :cond_0
    instance-of v15, v2, Landroid/webkit/WebResourceRequest;

    .line 87
    .line 88
    const/4 v3, 0x0

    .line 89
    iget-object v4, v0, Lv0/g;->d:Lv/d;

    .line 90
    .line 91
    if-eqz v15, :cond_4

    .line 92
    .line 93
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-object v5, v2

    .line 97
    check-cast v5, Landroid/webkit/WebResourceRequest;

    .line 98
    .line 99
    iget-object v15, v4, Lv/d;->c:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v15, Lv0/c;

    .line 102
    .line 103
    invoke-virtual {v15, v5}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v16

    .line 107
    if-eqz v16, :cond_1

    .line 108
    .line 109
    goto/16 :goto_7

    .line 110
    .line 111
    :cond_1
    invoke-virtual {v15, v5}, Lv0/c;->b(Ljava/lang/Object;)J

    .line 112
    .line 113
    .line 114
    move-result-wide v15

    .line 115
    invoke-interface {v5}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 116
    .line 117
    .line 118
    move-result-object v17

    .line 119
    invoke-virtual/range {v17 .. v17}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v17

    .line 123
    invoke-interface {v5}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    .line 124
    .line 125
    .line 126
    move-result v18

    .line 127
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 128
    .line 129
    if-lt v7, v6, :cond_2

    .line 130
    .line 131
    invoke-static {v5}, LL/a;->x(Landroid/webkit/WebResourceRequest;)Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    goto :goto_0

    .line 140
    :cond_2
    move-object v6, v3

    .line 141
    :goto_0
    invoke-interface {v5}, Landroid/webkit/WebResourceRequest;->hasGesture()Z

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    invoke-interface {v5}, Landroid/webkit/WebResourceRequest;->getMethod()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v19

    .line 149
    invoke-interface {v5}, Landroid/webkit/WebResourceRequest;->getRequestHeaders()Ljava/util/Map;

    .line 150
    .line 151
    .line 152
    move-result-object v20

    .line 153
    if-nez v20, :cond_3

    .line 154
    .line 155
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    goto :goto_1

    .line 160
    :cond_3
    invoke-interface {v5}, Landroid/webkit/WebResourceRequest;->getRequestHeaders()Ljava/util/Map;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    :goto_1
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 165
    .line 166
    .line 167
    move-result-object v10

    .line 168
    new-instance v9, LG/n;

    .line 169
    .line 170
    iget-object v11, v4, Lv/d;->b:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v11, Lq0/f;

    .line 173
    .line 174
    const-string v14, "dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance"

    .line 175
    .line 176
    invoke-direct {v9, v11, v14, v10, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-static/range {v18 .. v18}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    new-array v11, v8, [Ljava/lang/Object;

    .line 192
    .line 193
    aput-object v3, v11, v13

    .line 194
    .line 195
    aput-object v17, v11, v12

    .line 196
    .line 197
    const/4 v3, 0x2

    .line 198
    aput-object v10, v11, v3

    .line 199
    .line 200
    const/4 v3, 0x3

    .line 201
    aput-object v6, v11, v3

    .line 202
    .line 203
    const/4 v3, 0x4

    .line 204
    aput-object v7, v11, v3

    .line 205
    .line 206
    const/4 v3, 0x5

    .line 207
    aput-object v19, v11, v3

    .line 208
    .line 209
    const/4 v3, 0x6

    .line 210
    aput-object v5, v11, v3

    .line 211
    .line 212
    invoke-static {v11}, Ly0/e;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    new-instance v5, Lv0/H;

    .line 217
    .line 218
    invoke-direct {v5, v8}, Lv0/H;-><init>(I)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v9, v3, v5}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 222
    .line 223
    .line 224
    goto/16 :goto_7

    .line 225
    .line 226
    :cond_4
    instance-of v7, v2, Landroid/webkit/WebResourceResponse;

    .line 227
    .line 228
    if-eqz v7, :cond_6

    .line 229
    .line 230
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    move-object v5, v2

    .line 234
    check-cast v5, Landroid/webkit/WebResourceResponse;

    .line 235
    .line 236
    iget-object v6, v4, Lv/d;->c:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v6, Lv0/c;

    .line 239
    .line 240
    invoke-virtual {v6, v5}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v7

    .line 244
    if-eqz v7, :cond_5

    .line 245
    .line 246
    goto/16 :goto_7

    .line 247
    .line 248
    :cond_5
    invoke-virtual {v6, v5}, Lv0/c;->b(Ljava/lang/Object;)J

    .line 249
    .line 250
    .line 251
    move-result-wide v6

    .line 252
    invoke-virtual {v5}, Landroid/webkit/WebResourceResponse;->getStatusCode()I

    .line 253
    .line 254
    .line 255
    move-result v5

    .line 256
    int-to-long v8, v5

    .line 257
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    new-instance v10, LG/n;

    .line 262
    .line 263
    iget-object v11, v4, Lv/d;->b:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v11, Lq0/f;

    .line 266
    .line 267
    const-string v14, "dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance"

    .line 268
    .line 269
    invoke-direct {v10, v11, v14, v5, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 277
    .line 278
    .line 279
    move-result-object v5

    .line 280
    const/4 v6, 0x2

    .line 281
    new-array v6, v6, [Ljava/lang/Long;

    .line 282
    .line 283
    aput-object v3, v6, v13

    .line 284
    .line 285
    aput-object v5, v6, v12

    .line 286
    .line 287
    invoke-static {v6}, Ly0/e;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    new-instance v5, Lv0/H;

    .line 292
    .line 293
    const/16 v6, 0x8

    .line 294
    .line 295
    invoke-direct {v5, v6}, Lv0/H;-><init>(I)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v10, v3, v5}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 299
    .line 300
    .line 301
    goto/16 :goto_7

    .line 302
    .line 303
    :cond_6
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 304
    .line 305
    const/16 v9, 0x17

    .line 306
    .line 307
    if-lt v7, v9, :cond_8

    .line 308
    .line 309
    invoke-static/range {p2 .. p2}, LD/r;->A(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v7

    .line 313
    if-eqz v7, :cond_8

    .line 314
    .line 315
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    invoke-static/range {p2 .. p2}, LD/r;->o(Ljava/lang/Object;)Landroid/webkit/WebResourceError;

    .line 319
    .line 320
    .line 321
    move-result-object v5

    .line 322
    const-string v6, "pigeon_instanceArg"

    .line 323
    .line 324
    invoke-static {v5, v6}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    iget-object v6, v4, Lv/d;->c:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v6, Lv0/c;

    .line 330
    .line 331
    invoke-virtual {v6, v5}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v7

    .line 335
    if-eqz v7, :cond_7

    .line 336
    .line 337
    goto/16 :goto_7

    .line 338
    .line 339
    :cond_7
    invoke-virtual {v6, v5}, Lv0/c;->b(Ljava/lang/Object;)J

    .line 340
    .line 341
    .line 342
    move-result-wide v6

    .line 343
    invoke-static {v5}, LD/r;->b(Landroid/webkit/WebResourceError;)I

    .line 344
    .line 345
    .line 346
    move-result v8

    .line 347
    int-to-long v8, v8

    .line 348
    invoke-static {v5}, LD/r;->p(Landroid/webkit/WebResourceError;)Ljava/lang/CharSequence;

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    invoke-interface {v5}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 357
    .line 358
    .line 359
    move-result-object v10

    .line 360
    new-instance v11, LG/n;

    .line 361
    .line 362
    iget-object v14, v4, Lv/d;->b:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v14, Lq0/f;

    .line 365
    .line 366
    const-string v15, "dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance"

    .line 367
    .line 368
    invoke-direct {v11, v14, v15, v10, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 376
    .line 377
    .line 378
    move-result-object v6

    .line 379
    const/4 v7, 0x3

    .line 380
    new-array v7, v7, [Ljava/lang/Object;

    .line 381
    .line 382
    aput-object v3, v7, v13

    .line 383
    .line 384
    aput-object v6, v7, v12

    .line 385
    .line 386
    const/4 v3, 0x2

    .line 387
    aput-object v5, v7, v3

    .line 388
    .line 389
    invoke-static {v7}, Ly0/e;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 390
    .line 391
    .line 392
    move-result-object v3

    .line 393
    new-instance v5, Lv0/H;

    .line 394
    .line 395
    const/4 v6, 0x5

    .line 396
    invoke-direct {v5, v6}, Lv0/H;-><init>(I)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v11, v3, v5}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 400
    .line 401
    .line 402
    goto/16 :goto_7

    .line 403
    .line 404
    :cond_8
    instance-of v7, v2, LT/i;

    .line 405
    .line 406
    if-eqz v7, :cond_12

    .line 407
    .line 408
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    move-object v5, v2

    .line 412
    check-cast v5, LT/i;

    .line 413
    .line 414
    iget-object v6, v4, Lv/d;->c:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast v6, Lv0/c;

    .line 417
    .line 418
    invoke-virtual {v6, v5}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    move-result v7

    .line 422
    if-eqz v7, :cond_9

    .line 423
    .line 424
    goto/16 :goto_7

    .line 425
    .line 426
    :cond_9
    invoke-virtual {v6, v5}, Lv0/c;->b(Ljava/lang/Object;)J

    .line 427
    .line 428
    .line 429
    move-result-wide v6

    .line 430
    sget-object v8, LT/m;->b:LT/b;

    .line 431
    .line 432
    invoke-virtual {v8}, LT/b;->a()Z

    .line 433
    .line 434
    .line 435
    move-result v9

    .line 436
    const-class v10, Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;

    .line 437
    .line 438
    if-eqz v9, :cond_b

    .line 439
    .line 440
    iget-object v8, v5, LT/i;->a:Landroid/webkit/WebResourceError;

    .line 441
    .line 442
    if-nez v8, :cond_a

    .line 443
    .line 444
    sget-object v8, LT/n;->a:LD/j;

    .line 445
    .line 446
    iget-object v9, v5, LT/i;->b:Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;

    .line 447
    .line 448
    invoke-static {v9}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    .line 449
    .line 450
    .line 451
    move-result-object v9

    .line 452
    iget-object v8, v8, LD/j;->f:Ljava/lang/Object;

    .line 453
    .line 454
    check-cast v8, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    .line 455
    .line 456
    invoke-interface {v8, v9}, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;->convertWebResourceError(Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v8

    .line 460
    invoke-static {v8}, LD/r;->o(Ljava/lang/Object;)Landroid/webkit/WebResourceError;

    .line 461
    .line 462
    .line 463
    move-result-object v8

    .line 464
    iput-object v8, v5, LT/i;->a:Landroid/webkit/WebResourceError;

    .line 465
    .line 466
    :cond_a
    iget-object v8, v5, LT/i;->a:Landroid/webkit/WebResourceError;

    .line 467
    .line 468
    invoke-static {v8}, LD/r;->b(Landroid/webkit/WebResourceError;)I

    .line 469
    .line 470
    .line 471
    move-result v8

    .line 472
    goto :goto_2

    .line 473
    :cond_b
    invoke-virtual {v8}, LT/c;->b()Z

    .line 474
    .line 475
    .line 476
    move-result v8

    .line 477
    if-eqz v8, :cond_11

    .line 478
    .line 479
    iget-object v8, v5, LT/i;->b:Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;

    .line 480
    .line 481
    if-nez v8, :cond_c

    .line 482
    .line 483
    sget-object v8, LT/n;->a:LD/j;

    .line 484
    .line 485
    iget-object v9, v5, LT/i;->a:Landroid/webkit/WebResourceError;

    .line 486
    .line 487
    iget-object v8, v8, LD/j;->f:Ljava/lang/Object;

    .line 488
    .line 489
    check-cast v8, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    .line 490
    .line 491
    invoke-interface {v8, v9}, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;->convertWebResourceError(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    .line 492
    .line 493
    .line 494
    move-result-object v8

    .line 495
    invoke-static {v10, v8}, La1/a;->d(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v8

    .line 499
    check-cast v8, Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;

    .line 500
    .line 501
    iput-object v8, v5, LT/i;->b:Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;

    .line 502
    .line 503
    :cond_c
    iget-object v8, v5, LT/i;->b:Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;

    .line 504
    .line 505
    invoke-interface {v8}, Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;->getErrorCode()I

    .line 506
    .line 507
    .line 508
    move-result v8

    .line 509
    :goto_2
    int-to-long v8, v8

    .line 510
    sget-object v11, LT/m;->a:LT/b;

    .line 511
    .line 512
    invoke-virtual {v11}, LT/b;->a()Z

    .line 513
    .line 514
    .line 515
    move-result v14

    .line 516
    if-eqz v14, :cond_e

    .line 517
    .line 518
    iget-object v10, v5, LT/i;->a:Landroid/webkit/WebResourceError;

    .line 519
    .line 520
    if-nez v10, :cond_d

    .line 521
    .line 522
    sget-object v10, LT/n;->a:LD/j;

    .line 523
    .line 524
    iget-object v11, v5, LT/i;->b:Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;

    .line 525
    .line 526
    invoke-static {v11}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    .line 527
    .line 528
    .line 529
    move-result-object v11

    .line 530
    iget-object v10, v10, LD/j;->f:Ljava/lang/Object;

    .line 531
    .line 532
    check-cast v10, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    .line 533
    .line 534
    invoke-interface {v10, v11}, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;->convertWebResourceError(Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v10

    .line 538
    invoke-static {v10}, LD/r;->o(Ljava/lang/Object;)Landroid/webkit/WebResourceError;

    .line 539
    .line 540
    .line 541
    move-result-object v10

    .line 542
    iput-object v10, v5, LT/i;->a:Landroid/webkit/WebResourceError;

    .line 543
    .line 544
    :cond_d
    iget-object v5, v5, LT/i;->a:Landroid/webkit/WebResourceError;

    .line 545
    .line 546
    invoke-static {v5}, LD/r;->p(Landroid/webkit/WebResourceError;)Ljava/lang/CharSequence;

    .line 547
    .line 548
    .line 549
    move-result-object v5

    .line 550
    goto :goto_3

    .line 551
    :cond_e
    invoke-virtual {v11}, LT/c;->b()Z

    .line 552
    .line 553
    .line 554
    move-result v11

    .line 555
    if-eqz v11, :cond_10

    .line 556
    .line 557
    iget-object v11, v5, LT/i;->b:Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;

    .line 558
    .line 559
    if-nez v11, :cond_f

    .line 560
    .line 561
    sget-object v11, LT/n;->a:LD/j;

    .line 562
    .line 563
    iget-object v14, v5, LT/i;->a:Landroid/webkit/WebResourceError;

    .line 564
    .line 565
    iget-object v11, v11, LD/j;->f:Ljava/lang/Object;

    .line 566
    .line 567
    check-cast v11, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    .line 568
    .line 569
    invoke-interface {v11, v14}, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;->convertWebResourceError(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    .line 570
    .line 571
    .line 572
    move-result-object v11

    .line 573
    invoke-static {v10, v11}, La1/a;->d(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v10

    .line 577
    check-cast v10, Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;

    .line 578
    .line 579
    iput-object v10, v5, LT/i;->b:Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;

    .line 580
    .line 581
    :cond_f
    iget-object v5, v5, LT/i;->b:Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;

    .line 582
    .line 583
    invoke-interface {v5}, Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;->getDescription()Ljava/lang/CharSequence;

    .line 584
    .line 585
    .line 586
    move-result-object v5

    .line 587
    :goto_3
    invoke-interface {v5}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v5

    .line 591
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 592
    .line 593
    .line 594
    move-result-object v10

    .line 595
    new-instance v11, LG/n;

    .line 596
    .line 597
    iget-object v14, v4, Lv/d;->b:Ljava/lang/Object;

    .line 598
    .line 599
    check-cast v14, Lq0/f;

    .line 600
    .line 601
    const-string v15, "dev.flutter.pigeon.webview_flutter_android.WebResourceErrorCompat.pigeon_newInstance"

    .line 602
    .line 603
    invoke-direct {v11, v14, v15, v10, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 604
    .line 605
    .line 606
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 607
    .line 608
    .line 609
    move-result-object v3

    .line 610
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 611
    .line 612
    .line 613
    move-result-object v6

    .line 614
    const/4 v7, 0x3

    .line 615
    new-array v7, v7, [Ljava/lang/Object;

    .line 616
    .line 617
    aput-object v3, v7, v13

    .line 618
    .line 619
    aput-object v6, v7, v12

    .line 620
    .line 621
    const/4 v3, 0x2

    .line 622
    aput-object v5, v7, v3

    .line 623
    .line 624
    invoke-static {v7}, Ly0/e;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 625
    .line 626
    .line 627
    move-result-object v3

    .line 628
    new-instance v5, Lv0/H;

    .line 629
    .line 630
    const/4 v6, 0x6

    .line 631
    invoke-direct {v5, v6}, Lv0/H;-><init>(I)V

    .line 632
    .line 633
    .line 634
    invoke-virtual {v11, v3, v5}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 635
    .line 636
    .line 637
    goto/16 :goto_7

    .line 638
    .line 639
    :cond_10
    invoke-static {}, LT/m;->a()Ljava/lang/UnsupportedOperationException;

    .line 640
    .line 641
    .line 642
    move-result-object v1

    .line 643
    throw v1

    .line 644
    :cond_11
    invoke-static {}, LT/m;->a()Ljava/lang/UnsupportedOperationException;

    .line 645
    .line 646
    .line 647
    move-result-object v1

    .line 648
    throw v1

    .line 649
    :cond_12
    instance-of v7, v2, Lv0/f0;

    .line 650
    .line 651
    if-eqz v7, :cond_14

    .line 652
    .line 653
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 654
    .line 655
    .line 656
    move-object v6, v2

    .line 657
    check-cast v6, Lv0/f0;

    .line 658
    .line 659
    iget-object v7, v4, Lv/d;->c:Ljava/lang/Object;

    .line 660
    .line 661
    check-cast v7, Lv0/c;

    .line 662
    .line 663
    invoke-virtual {v7, v6}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 664
    .line 665
    .line 666
    move-result v8

    .line 667
    if-eqz v8, :cond_13

    .line 668
    .line 669
    goto/16 :goto_7

    .line 670
    .line 671
    :cond_13
    invoke-virtual {v7, v6}, Lv0/c;->b(Ljava/lang/Object;)J

    .line 672
    .line 673
    .line 674
    move-result-wide v7

    .line 675
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 676
    .line 677
    .line 678
    move-result-object v9

    .line 679
    new-instance v10, LG/n;

    .line 680
    .line 681
    iget-object v11, v4, Lv/d;->b:Ljava/lang/Object;

    .line 682
    .line 683
    check-cast v11, Lq0/f;

    .line 684
    .line 685
    const-string v14, "dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance"

    .line 686
    .line 687
    invoke-direct {v10, v11, v14, v9, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 688
    .line 689
    .line 690
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 691
    .line 692
    .line 693
    move-result-object v3

    .line 694
    iget-wide v7, v6, Lv0/f0;->a:J

    .line 695
    .line 696
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 697
    .line 698
    .line 699
    move-result-object v7

    .line 700
    iget-wide v8, v6, Lv0/f0;->b:J

    .line 701
    .line 702
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 703
    .line 704
    .line 705
    move-result-object v6

    .line 706
    const/4 v8, 0x3

    .line 707
    new-array v8, v8, [Ljava/lang/Long;

    .line 708
    .line 709
    aput-object v3, v8, v13

    .line 710
    .line 711
    aput-object v7, v8, v12

    .line 712
    .line 713
    const/4 v3, 0x2

    .line 714
    aput-object v6, v8, v3

    .line 715
    .line 716
    invoke-static {v8}, Ly0/e;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 717
    .line 718
    .line 719
    move-result-object v3

    .line 720
    new-instance v6, Lv0/H;

    .line 721
    .line 722
    invoke-direct {v6, v5}, Lv0/H;-><init>(I)V

    .line 723
    .line 724
    .line 725
    invoke-virtual {v10, v3, v6}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 726
    .line 727
    .line 728
    goto/16 :goto_7

    .line 729
    .line 730
    :cond_14
    instance-of v7, v2, Landroid/webkit/ConsoleMessage;

    .line 731
    .line 732
    if-eqz v7, :cond_1b

    .line 733
    .line 734
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 735
    .line 736
    .line 737
    move-object v5, v2

    .line 738
    check-cast v5, Landroid/webkit/ConsoleMessage;

    .line 739
    .line 740
    iget-object v6, v4, Lv/d;->c:Ljava/lang/Object;

    .line 741
    .line 742
    check-cast v6, Lv0/c;

    .line 743
    .line 744
    invoke-virtual {v6, v5}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 745
    .line 746
    .line 747
    move-result v7

    .line 748
    if-eqz v7, :cond_15

    .line 749
    .line 750
    goto/16 :goto_7

    .line 751
    .line 752
    :cond_15
    invoke-virtual {v6, v5}, Lv0/c;->b(Ljava/lang/Object;)J

    .line 753
    .line 754
    .line 755
    move-result-wide v6

    .line 756
    invoke-virtual {v5}, Landroid/webkit/ConsoleMessage;->lineNumber()I

    .line 757
    .line 758
    .line 759
    move-result v8

    .line 760
    int-to-long v8, v8

    .line 761
    invoke-virtual {v5}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object v10

    .line 765
    sget-object v11, Lv0/k;->a:[I

    .line 766
    .line 767
    invoke-virtual {v5}, Landroid/webkit/ConsoleMessage;->messageLevel()Landroid/webkit/ConsoleMessage$MessageLevel;

    .line 768
    .line 769
    .line 770
    move-result-object v14

    .line 771
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 772
    .line 773
    .line 774
    move-result v14

    .line 775
    aget v11, v11, v14

    .line 776
    .line 777
    if-eq v11, v12, :cond_1a

    .line 778
    .line 779
    const/4 v14, 0x2

    .line 780
    if-eq v11, v14, :cond_19

    .line 781
    .line 782
    const/4 v14, 0x3

    .line 783
    if-eq v11, v14, :cond_18

    .line 784
    .line 785
    const/4 v14, 0x4

    .line 786
    if-eq v11, v14, :cond_17

    .line 787
    .line 788
    const/4 v14, 0x5

    .line 789
    if-eq v11, v14, :cond_16

    .line 790
    .line 791
    sget-object v11, Lv0/j;->k:Lv0/j;

    .line 792
    .line 793
    goto :goto_4

    .line 794
    :cond_16
    sget-object v11, Lv0/j;->f:Lv0/j;

    .line 795
    .line 796
    goto :goto_4

    .line 797
    :cond_17
    sget-object v11, Lv0/j;->g:Lv0/j;

    .line 798
    .line 799
    goto :goto_4

    .line 800
    :cond_18
    sget-object v11, Lv0/j;->j:Lv0/j;

    .line 801
    .line 802
    goto :goto_4

    .line 803
    :cond_19
    sget-object v11, Lv0/j;->h:Lv0/j;

    .line 804
    .line 805
    goto :goto_4

    .line 806
    :cond_1a
    sget-object v11, Lv0/j;->i:Lv0/j;

    .line 807
    .line 808
    :goto_4
    invoke-virtual {v5}, Landroid/webkit/ConsoleMessage;->sourceId()Ljava/lang/String;

    .line 809
    .line 810
    .line 811
    move-result-object v5

    .line 812
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 813
    .line 814
    .line 815
    move-result-object v14

    .line 816
    new-instance v15, LG/n;

    .line 817
    .line 818
    iget-object v12, v4, Lv/d;->b:Ljava/lang/Object;

    .line 819
    .line 820
    check-cast v12, Lq0/f;

    .line 821
    .line 822
    const-string v13, "dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance"

    .line 823
    .line 824
    invoke-direct {v15, v12, v13, v14, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 825
    .line 826
    .line 827
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 828
    .line 829
    .line 830
    move-result-object v3

    .line 831
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 832
    .line 833
    .line 834
    move-result-object v6

    .line 835
    const/4 v7, 0x5

    .line 836
    new-array v8, v7, [Ljava/lang/Object;

    .line 837
    .line 838
    const/4 v9, 0x0

    .line 839
    aput-object v3, v8, v9

    .line 840
    .line 841
    const/4 v3, 0x1

    .line 842
    aput-object v6, v8, v3

    .line 843
    .line 844
    const/4 v3, 0x2

    .line 845
    aput-object v10, v8, v3

    .line 846
    .line 847
    const/4 v3, 0x3

    .line 848
    aput-object v11, v8, v3

    .line 849
    .line 850
    const/4 v3, 0x4

    .line 851
    aput-object v5, v8, v3

    .line 852
    .line 853
    invoke-static {v8}, Ly0/e;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 854
    .line 855
    .line 856
    move-result-object v3

    .line 857
    new-instance v5, Lv0/x;

    .line 858
    .line 859
    invoke-direct {v5, v7}, Lv0/x;-><init>(I)V

    .line 860
    .line 861
    .line 862
    invoke-virtual {v15, v3, v5}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 863
    .line 864
    .line 865
    goto/16 :goto_7

    .line 866
    .line 867
    :cond_1b
    instance-of v7, v2, Landroid/webkit/CookieManager;

    .line 868
    .line 869
    if-eqz v7, :cond_1d

    .line 870
    .line 871
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 872
    .line 873
    .line 874
    move-object v5, v2

    .line 875
    check-cast v5, Landroid/webkit/CookieManager;

    .line 876
    .line 877
    iget-object v6, v4, Lv/d;->c:Ljava/lang/Object;

    .line 878
    .line 879
    check-cast v6, Lv0/c;

    .line 880
    .line 881
    invoke-virtual {v6, v5}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 882
    .line 883
    .line 884
    move-result v7

    .line 885
    if-eqz v7, :cond_1c

    .line 886
    .line 887
    goto/16 :goto_7

    .line 888
    .line 889
    :cond_1c
    invoke-virtual {v6, v5}, Lv0/c;->b(Ljava/lang/Object;)J

    .line 890
    .line 891
    .line 892
    move-result-wide v5

    .line 893
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 894
    .line 895
    .line 896
    move-result-object v7

    .line 897
    new-instance v8, LG/n;

    .line 898
    .line 899
    iget-object v9, v4, Lv/d;->b:Ljava/lang/Object;

    .line 900
    .line 901
    check-cast v9, Lq0/f;

    .line 902
    .line 903
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance"

    .line 904
    .line 905
    invoke-direct {v8, v9, v10, v7, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 906
    .line 907
    .line 908
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 909
    .line 910
    .line 911
    move-result-object v3

    .line 912
    invoke-static {v3}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 913
    .line 914
    .line 915
    move-result-object v3

    .line 916
    new-instance v5, Lv0/x;

    .line 917
    .line 918
    const/4 v6, 0x6

    .line 919
    invoke-direct {v5, v6}, Lv0/x;-><init>(I)V

    .line 920
    .line 921
    .line 922
    invoke-virtual {v8, v3, v5}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 923
    .line 924
    .line 925
    goto/16 :goto_7

    .line 926
    .line 927
    :cond_1d
    instance-of v7, v2, Landroid/webkit/WebView;

    .line 928
    .line 929
    if-eqz v7, :cond_1f

    .line 930
    .line 931
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 932
    .line 933
    .line 934
    move-object v5, v2

    .line 935
    check-cast v5, Landroid/webkit/WebView;

    .line 936
    .line 937
    iget-object v6, v4, Lv/d;->c:Ljava/lang/Object;

    .line 938
    .line 939
    check-cast v6, Lv0/c;

    .line 940
    .line 941
    invoke-virtual {v6, v5}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 942
    .line 943
    .line 944
    move-result v7

    .line 945
    if-eqz v7, :cond_1e

    .line 946
    .line 947
    goto/16 :goto_7

    .line 948
    .line 949
    :cond_1e
    invoke-virtual {v6, v5}, Lv0/c;->b(Ljava/lang/Object;)J

    .line 950
    .line 951
    .line 952
    move-result-wide v5

    .line 953
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 954
    .line 955
    .line 956
    move-result-object v7

    .line 957
    new-instance v8, LG/n;

    .line 958
    .line 959
    iget-object v9, v4, Lv/d;->b:Ljava/lang/Object;

    .line 960
    .line 961
    check-cast v9, Lq0/f;

    .line 962
    .line 963
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance"

    .line 964
    .line 965
    invoke-direct {v8, v9, v10, v7, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 966
    .line 967
    .line 968
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 969
    .line 970
    .line 971
    move-result-object v3

    .line 972
    invoke-static {v3}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 973
    .line 974
    .line 975
    move-result-object v3

    .line 976
    new-instance v5, Lv0/H;

    .line 977
    .line 978
    const/16 v6, 0xd

    .line 979
    .line 980
    invoke-direct {v5, v6}, Lv0/H;-><init>(I)V

    .line 981
    .line 982
    .line 983
    invoke-virtual {v8, v3, v5}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 984
    .line 985
    .line 986
    goto/16 :goto_7

    .line 987
    .line 988
    :cond_1f
    instance-of v7, v2, Landroid/webkit/WebSettings;

    .line 989
    .line 990
    if-eqz v7, :cond_21

    .line 991
    .line 992
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 993
    .line 994
    .line 995
    move-object v5, v2

    .line 996
    check-cast v5, Landroid/webkit/WebSettings;

    .line 997
    .line 998
    iget-object v6, v4, Lv/d;->c:Ljava/lang/Object;

    .line 999
    .line 1000
    check-cast v6, Lv0/c;

    .line 1001
    .line 1002
    invoke-virtual {v6, v5}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 1003
    .line 1004
    .line 1005
    move-result v7

    .line 1006
    if-eqz v7, :cond_20

    .line 1007
    .line 1008
    goto/16 :goto_7

    .line 1009
    .line 1010
    :cond_20
    invoke-virtual {v6, v5}, Lv0/c;->b(Ljava/lang/Object;)J

    .line 1011
    .line 1012
    .line 1013
    move-result-wide v5

    .line 1014
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v7

    .line 1018
    new-instance v8, LG/n;

    .line 1019
    .line 1020
    iget-object v9, v4, Lv/d;->b:Ljava/lang/Object;

    .line 1021
    .line 1022
    check-cast v9, Lq0/f;

    .line 1023
    .line 1024
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance"

    .line 1025
    .line 1026
    invoke-direct {v8, v9, v10, v7, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1027
    .line 1028
    .line 1029
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v3

    .line 1033
    invoke-static {v3}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v3

    .line 1037
    new-instance v5, Lv0/H;

    .line 1038
    .line 1039
    const/16 v6, 0x9

    .line 1040
    .line 1041
    invoke-direct {v5, v6}, Lv0/H;-><init>(I)V

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v8, v3, v5}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 1045
    .line 1046
    .line 1047
    goto/16 :goto_7

    .line 1048
    .line 1049
    :cond_21
    instance-of v7, v2, Lv0/t;

    .line 1050
    .line 1051
    const-string v9, "new-instance-error"

    .line 1052
    .line 1053
    const-string v10, ""

    .line 1054
    .line 1055
    if-eqz v7, :cond_23

    .line 1056
    .line 1057
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1058
    .line 1059
    .line 1060
    move-object v3, v2

    .line 1061
    check-cast v3, Lv0/t;

    .line 1062
    .line 1063
    iget-object v5, v4, Lv/d;->c:Ljava/lang/Object;

    .line 1064
    .line 1065
    check-cast v5, Lv0/c;

    .line 1066
    .line 1067
    invoke-virtual {v5, v3}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 1068
    .line 1069
    .line 1070
    move-result v3

    .line 1071
    if-eqz v3, :cond_22

    .line 1072
    .line 1073
    goto/16 :goto_7

    .line 1074
    .line 1075
    :cond_22
    const-string v3, "Attempting to create a new Dart instance of JavaScriptChannel, but the class has a nonnull callback method."

    .line 1076
    .line 1077
    :goto_5
    invoke-static {v9, v3, v10}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1078
    .line 1079
    .line 1080
    goto/16 :goto_7

    .line 1081
    .line 1082
    :cond_23
    instance-of v7, v2, Landroid/webkit/WebViewClient;

    .line 1083
    .line 1084
    if-eqz v7, :cond_25

    .line 1085
    .line 1086
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1087
    .line 1088
    .line 1089
    move-object v5, v2

    .line 1090
    check-cast v5, Landroid/webkit/WebViewClient;

    .line 1091
    .line 1092
    iget-object v6, v4, Lv/d;->c:Ljava/lang/Object;

    .line 1093
    .line 1094
    check-cast v6, Lv0/c;

    .line 1095
    .line 1096
    invoke-virtual {v6, v5}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 1097
    .line 1098
    .line 1099
    move-result v7

    .line 1100
    if-eqz v7, :cond_24

    .line 1101
    .line 1102
    goto/16 :goto_7

    .line 1103
    .line 1104
    :cond_24
    invoke-virtual {v6, v5}, Lv0/c;->b(Ljava/lang/Object;)J

    .line 1105
    .line 1106
    .line 1107
    move-result-wide v5

    .line 1108
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v7

    .line 1112
    new-instance v8, LG/n;

    .line 1113
    .line 1114
    iget-object v9, v4, Lv/d;->b:Ljava/lang/Object;

    .line 1115
    .line 1116
    check-cast v9, Lq0/f;

    .line 1117
    .line 1118
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance"

    .line 1119
    .line 1120
    invoke-direct {v8, v9, v10, v7, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1121
    .line 1122
    .line 1123
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v3

    .line 1127
    invoke-static {v3}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v3

    .line 1131
    new-instance v5, Lv0/H;

    .line 1132
    .line 1133
    const/16 v6, 0xf

    .line 1134
    .line 1135
    invoke-direct {v5, v6}, Lv0/H;-><init>(I)V

    .line 1136
    .line 1137
    .line 1138
    invoke-virtual {v8, v3, v5}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 1139
    .line 1140
    .line 1141
    goto/16 :goto_7

    .line 1142
    .line 1143
    :cond_25
    instance-of v7, v2, Landroid/webkit/DownloadListener;

    .line 1144
    .line 1145
    if-eqz v7, :cond_27

    .line 1146
    .line 1147
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1148
    .line 1149
    .line 1150
    move-object v3, v2

    .line 1151
    check-cast v3, Landroid/webkit/DownloadListener;

    .line 1152
    .line 1153
    iget-object v5, v4, Lv/d;->c:Ljava/lang/Object;

    .line 1154
    .line 1155
    check-cast v5, Lv0/c;

    .line 1156
    .line 1157
    invoke-virtual {v5, v3}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 1158
    .line 1159
    .line 1160
    move-result v3

    .line 1161
    if-eqz v3, :cond_26

    .line 1162
    .line 1163
    goto/16 :goto_7

    .line 1164
    .line 1165
    :cond_26
    const-string v3, "Attempting to create a new Dart instance of DownloadListener, but the class has a nonnull callback method."

    .line 1166
    .line 1167
    goto :goto_5

    .line 1168
    :cond_27
    instance-of v7, v2, Lv0/U;

    .line 1169
    .line 1170
    if-eqz v7, :cond_29

    .line 1171
    .line 1172
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1173
    .line 1174
    .line 1175
    move-object v3, v2

    .line 1176
    check-cast v3, Lv0/U;

    .line 1177
    .line 1178
    iget-object v5, v4, Lv/d;->c:Ljava/lang/Object;

    .line 1179
    .line 1180
    check-cast v5, Lv0/c;

    .line 1181
    .line 1182
    invoke-virtual {v5, v3}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 1183
    .line 1184
    .line 1185
    move-result v3

    .line 1186
    if-eqz v3, :cond_28

    .line 1187
    .line 1188
    goto/16 :goto_7

    .line 1189
    .line 1190
    :cond_28
    const-string v3, "Attempting to create a new Dart instance of WebChromeClient, but the class has a nonnull callback method."

    .line 1191
    .line 1192
    goto :goto_5

    .line 1193
    :cond_29
    instance-of v7, v2, Lv0/q;

    .line 1194
    .line 1195
    if-eqz v7, :cond_2b

    .line 1196
    .line 1197
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1198
    .line 1199
    .line 1200
    move-object v5, v2

    .line 1201
    check-cast v5, Lv0/q;

    .line 1202
    .line 1203
    iget-object v6, v4, Lv/d;->c:Ljava/lang/Object;

    .line 1204
    .line 1205
    check-cast v6, Lv0/c;

    .line 1206
    .line 1207
    invoke-virtual {v6, v5}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 1208
    .line 1209
    .line 1210
    move-result v7

    .line 1211
    if-eqz v7, :cond_2a

    .line 1212
    .line 1213
    goto/16 :goto_7

    .line 1214
    .line 1215
    :cond_2a
    invoke-virtual {v6, v5}, Lv0/c;->b(Ljava/lang/Object;)J

    .line 1216
    .line 1217
    .line 1218
    move-result-wide v5

    .line 1219
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v7

    .line 1223
    new-instance v8, LG/n;

    .line 1224
    .line 1225
    iget-object v9, v4, Lv/d;->b:Ljava/lang/Object;

    .line 1226
    .line 1227
    check-cast v9, Lq0/f;

    .line 1228
    .line 1229
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance"

    .line 1230
    .line 1231
    invoke-direct {v8, v9, v10, v7, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1232
    .line 1233
    .line 1234
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v3

    .line 1238
    invoke-static {v3}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v3

    .line 1242
    new-instance v5, Lv0/x;

    .line 1243
    .line 1244
    const/16 v6, 0xb

    .line 1245
    .line 1246
    invoke-direct {v5, v6}, Lv0/x;-><init>(I)V

    .line 1247
    .line 1248
    .line 1249
    invoke-virtual {v8, v3, v5}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 1250
    .line 1251
    .line 1252
    goto/16 :goto_7

    .line 1253
    .line 1254
    :cond_2b
    instance-of v7, v2, Landroid/webkit/WebStorage;

    .line 1255
    .line 1256
    if-eqz v7, :cond_2d

    .line 1257
    .line 1258
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1259
    .line 1260
    .line 1261
    move-object v5, v2

    .line 1262
    check-cast v5, Landroid/webkit/WebStorage;

    .line 1263
    .line 1264
    iget-object v6, v4, Lv/d;->c:Ljava/lang/Object;

    .line 1265
    .line 1266
    check-cast v6, Lv0/c;

    .line 1267
    .line 1268
    invoke-virtual {v6, v5}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 1269
    .line 1270
    .line 1271
    move-result v7

    .line 1272
    if-eqz v7, :cond_2c

    .line 1273
    .line 1274
    goto/16 :goto_7

    .line 1275
    .line 1276
    :cond_2c
    invoke-virtual {v6, v5}, Lv0/c;->b(Ljava/lang/Object;)J

    .line 1277
    .line 1278
    .line 1279
    move-result-wide v5

    .line 1280
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v7

    .line 1284
    new-instance v8, LG/n;

    .line 1285
    .line 1286
    iget-object v9, v4, Lv/d;->b:Ljava/lang/Object;

    .line 1287
    .line 1288
    check-cast v9, Lq0/f;

    .line 1289
    .line 1290
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance"

    .line 1291
    .line 1292
    invoke-direct {v8, v9, v10, v7, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1293
    .line 1294
    .line 1295
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v3

    .line 1299
    invoke-static {v3}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v3

    .line 1303
    new-instance v5, Lv0/H;

    .line 1304
    .line 1305
    const/16 v6, 0xb

    .line 1306
    .line 1307
    invoke-direct {v5, v6}, Lv0/H;-><init>(I)V

    .line 1308
    .line 1309
    .line 1310
    invoke-virtual {v8, v3, v5}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 1311
    .line 1312
    .line 1313
    goto/16 :goto_7

    .line 1314
    .line 1315
    :cond_2d
    instance-of v7, v2, Landroid/webkit/WebChromeClient$FileChooserParams;

    .line 1316
    .line 1317
    if-eqz v7, :cond_32

    .line 1318
    .line 1319
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1320
    .line 1321
    .line 1322
    move-object v5, v2

    .line 1323
    check-cast v5, Landroid/webkit/WebChromeClient$FileChooserParams;

    .line 1324
    .line 1325
    iget-object v6, v4, Lv/d;->c:Ljava/lang/Object;

    .line 1326
    .line 1327
    check-cast v6, Lv0/c;

    .line 1328
    .line 1329
    invoke-virtual {v6, v5}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 1330
    .line 1331
    .line 1332
    move-result v7

    .line 1333
    if-eqz v7, :cond_2e

    .line 1334
    .line 1335
    goto/16 :goto_7

    .line 1336
    .line 1337
    :cond_2e
    invoke-virtual {v6, v5}, Lv0/c;->b(Ljava/lang/Object;)J

    .line 1338
    .line 1339
    .line 1340
    move-result-wide v6

    .line 1341
    invoke-virtual {v5}, Landroid/webkit/WebChromeClient$FileChooserParams;->isCaptureEnabled()Z

    .line 1342
    .line 1343
    .line 1344
    move-result v8

    .line 1345
    invoke-virtual {v5}, Landroid/webkit/WebChromeClient$FileChooserParams;->getAcceptTypes()[Ljava/lang/String;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v9

    .line 1349
    invoke-static {v9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v9

    .line 1353
    invoke-virtual {v5}, Landroid/webkit/WebChromeClient$FileChooserParams;->getMode()I

    .line 1354
    .line 1355
    .line 1356
    move-result v10

    .line 1357
    if-eqz v10, :cond_31

    .line 1358
    .line 1359
    const/4 v11, 0x1

    .line 1360
    if-eq v10, v11, :cond_30

    .line 1361
    .line 1362
    const/4 v11, 0x3

    .line 1363
    if-eq v10, v11, :cond_2f

    .line 1364
    .line 1365
    sget-object v10, Lv0/p;->i:Lv0/p;

    .line 1366
    .line 1367
    goto :goto_6

    .line 1368
    :cond_2f
    sget-object v10, Lv0/p;->h:Lv0/p;

    .line 1369
    .line 1370
    goto :goto_6

    .line 1371
    :cond_30
    sget-object v10, Lv0/p;->g:Lv0/p;

    .line 1372
    .line 1373
    goto :goto_6

    .line 1374
    :cond_31
    sget-object v10, Lv0/p;->f:Lv0/p;

    .line 1375
    .line 1376
    :goto_6
    invoke-virtual {v5}, Landroid/webkit/WebChromeClient$FileChooserParams;->getFilenameHint()Ljava/lang/String;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v5

    .line 1380
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v11

    .line 1384
    new-instance v12, LG/n;

    .line 1385
    .line 1386
    iget-object v13, v4, Lv/d;->b:Ljava/lang/Object;

    .line 1387
    .line 1388
    check-cast v13, Lq0/f;

    .line 1389
    .line 1390
    const-string v14, "dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance"

    .line 1391
    .line 1392
    invoke-direct {v12, v13, v14, v11, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1393
    .line 1394
    .line 1395
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v3

    .line 1399
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v6

    .line 1403
    const/4 v7, 0x5

    .line 1404
    new-array v7, v7, [Ljava/lang/Object;

    .line 1405
    .line 1406
    const/4 v8, 0x0

    .line 1407
    aput-object v3, v7, v8

    .line 1408
    .line 1409
    const/4 v3, 0x1

    .line 1410
    aput-object v6, v7, v3

    .line 1411
    .line 1412
    const/4 v3, 0x2

    .line 1413
    aput-object v9, v7, v3

    .line 1414
    .line 1415
    const/4 v3, 0x3

    .line 1416
    aput-object v10, v7, v3

    .line 1417
    .line 1418
    const/4 v3, 0x4

    .line 1419
    aput-object v5, v7, v3

    .line 1420
    .line 1421
    invoke-static {v7}, Ly0/e;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v3

    .line 1425
    new-instance v5, Lv0/x;

    .line 1426
    .line 1427
    const/16 v6, 0xa

    .line 1428
    .line 1429
    invoke-direct {v5, v6}, Lv0/x;-><init>(I)V

    .line 1430
    .line 1431
    .line 1432
    invoke-virtual {v12, v3, v5}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 1433
    .line 1434
    .line 1435
    goto/16 :goto_7

    .line 1436
    .line 1437
    :cond_32
    instance-of v7, v2, Landroid/webkit/PermissionRequest;

    .line 1438
    .line 1439
    if-eqz v7, :cond_34

    .line 1440
    .line 1441
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1442
    .line 1443
    .line 1444
    move-object v5, v2

    .line 1445
    check-cast v5, Landroid/webkit/PermissionRequest;

    .line 1446
    .line 1447
    iget-object v6, v4, Lv/d;->c:Ljava/lang/Object;

    .line 1448
    .line 1449
    check-cast v6, Lv0/c;

    .line 1450
    .line 1451
    invoke-virtual {v6, v5}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 1452
    .line 1453
    .line 1454
    move-result v7

    .line 1455
    if-eqz v7, :cond_33

    .line 1456
    .line 1457
    goto/16 :goto_7

    .line 1458
    .line 1459
    :cond_33
    invoke-virtual {v6, v5}, Lv0/c;->b(Ljava/lang/Object;)J

    .line 1460
    .line 1461
    .line 1462
    move-result-wide v6

    .line 1463
    invoke-virtual {v5}, Landroid/webkit/PermissionRequest;->getResources()[Ljava/lang/String;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v5

    .line 1467
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v5

    .line 1471
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 1472
    .line 1473
    .line 1474
    move-result-object v8

    .line 1475
    new-instance v9, LG/n;

    .line 1476
    .line 1477
    iget-object v10, v4, Lv/d;->b:Ljava/lang/Object;

    .line 1478
    .line 1479
    check-cast v10, Lq0/f;

    .line 1480
    .line 1481
    const-string v11, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance"

    .line 1482
    .line 1483
    invoke-direct {v9, v10, v11, v8, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1484
    .line 1485
    .line 1486
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v3

    .line 1490
    const/4 v6, 0x2

    .line 1491
    new-array v6, v6, [Ljava/lang/Object;

    .line 1492
    .line 1493
    const/4 v7, 0x0

    .line 1494
    aput-object v3, v6, v7

    .line 1495
    .line 1496
    const/4 v3, 0x1

    .line 1497
    aput-object v5, v6, v3

    .line 1498
    .line 1499
    invoke-static {v6}, Ly0/e;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v3

    .line 1503
    new-instance v5, Lv0/x;

    .line 1504
    .line 1505
    const/16 v6, 0x10

    .line 1506
    .line 1507
    invoke-direct {v5, v6}, Lv0/x;-><init>(I)V

    .line 1508
    .line 1509
    .line 1510
    invoke-virtual {v9, v3, v5}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 1511
    .line 1512
    .line 1513
    goto/16 :goto_7

    .line 1514
    .line 1515
    :cond_34
    instance-of v7, v2, Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 1516
    .line 1517
    if-eqz v7, :cond_36

    .line 1518
    .line 1519
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1520
    .line 1521
    .line 1522
    move-object v5, v2

    .line 1523
    check-cast v5, Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 1524
    .line 1525
    iget-object v6, v4, Lv/d;->c:Ljava/lang/Object;

    .line 1526
    .line 1527
    check-cast v6, Lv0/c;

    .line 1528
    .line 1529
    invoke-virtual {v6, v5}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 1530
    .line 1531
    .line 1532
    move-result v7

    .line 1533
    if-eqz v7, :cond_35

    .line 1534
    .line 1535
    goto/16 :goto_7

    .line 1536
    .line 1537
    :cond_35
    invoke-virtual {v6, v5}, Lv0/c;->b(Ljava/lang/Object;)J

    .line 1538
    .line 1539
    .line 1540
    move-result-wide v5

    .line 1541
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v7

    .line 1545
    new-instance v9, LG/n;

    .line 1546
    .line 1547
    iget-object v10, v4, Lv/d;->b:Ljava/lang/Object;

    .line 1548
    .line 1549
    check-cast v10, Lq0/f;

    .line 1550
    .line 1551
    const-string v11, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance"

    .line 1552
    .line 1553
    invoke-direct {v9, v10, v11, v7, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1554
    .line 1555
    .line 1556
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v3

    .line 1560
    invoke-static {v3}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v3

    .line 1564
    new-instance v5, Lv0/x;

    .line 1565
    .line 1566
    invoke-direct {v5, v8}, Lv0/x;-><init>(I)V

    .line 1567
    .line 1568
    .line 1569
    invoke-virtual {v9, v3, v5}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 1570
    .line 1571
    .line 1572
    goto/16 :goto_7

    .line 1573
    .line 1574
    :cond_36
    instance-of v7, v2, Landroid/view/View;

    .line 1575
    .line 1576
    if-eqz v7, :cond_38

    .line 1577
    .line 1578
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1579
    .line 1580
    .line 1581
    move-object v5, v2

    .line 1582
    check-cast v5, Landroid/view/View;

    .line 1583
    .line 1584
    iget-object v6, v4, Lv/d;->c:Ljava/lang/Object;

    .line 1585
    .line 1586
    check-cast v6, Lv0/c;

    .line 1587
    .line 1588
    invoke-virtual {v6, v5}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 1589
    .line 1590
    .line 1591
    move-result v7

    .line 1592
    if-eqz v7, :cond_37

    .line 1593
    .line 1594
    goto/16 :goto_7

    .line 1595
    .line 1596
    :cond_37
    invoke-virtual {v6, v5}, Lv0/c;->b(Ljava/lang/Object;)J

    .line 1597
    .line 1598
    .line 1599
    move-result-wide v5

    .line 1600
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 1601
    .line 1602
    .line 1603
    move-result-object v7

    .line 1604
    new-instance v8, LG/n;

    .line 1605
    .line 1606
    iget-object v9, v4, Lv/d;->b:Ljava/lang/Object;

    .line 1607
    .line 1608
    check-cast v9, Lq0/f;

    .line 1609
    .line 1610
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance"

    .line 1611
    .line 1612
    invoke-direct {v8, v9, v10, v7, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1613
    .line 1614
    .line 1615
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1616
    .line 1617
    .line 1618
    move-result-object v3

    .line 1619
    invoke-static {v3}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 1620
    .line 1621
    .line 1622
    move-result-object v3

    .line 1623
    new-instance v5, Lv0/x;

    .line 1624
    .line 1625
    const/16 v6, 0x1b

    .line 1626
    .line 1627
    invoke-direct {v5, v6}, Lv0/x;-><init>(I)V

    .line 1628
    .line 1629
    .line 1630
    invoke-virtual {v8, v3, v5}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 1631
    .line 1632
    .line 1633
    goto/16 :goto_7

    .line 1634
    .line 1635
    :cond_38
    instance-of v7, v2, Landroid/webkit/GeolocationPermissions$Callback;

    .line 1636
    .line 1637
    if-eqz v7, :cond_3a

    .line 1638
    .line 1639
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1640
    .line 1641
    .line 1642
    move-object v5, v2

    .line 1643
    check-cast v5, Landroid/webkit/GeolocationPermissions$Callback;

    .line 1644
    .line 1645
    iget-object v6, v4, Lv/d;->c:Ljava/lang/Object;

    .line 1646
    .line 1647
    check-cast v6, Lv0/c;

    .line 1648
    .line 1649
    invoke-virtual {v6, v5}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 1650
    .line 1651
    .line 1652
    move-result v7

    .line 1653
    if-eqz v7, :cond_39

    .line 1654
    .line 1655
    goto/16 :goto_7

    .line 1656
    .line 1657
    :cond_39
    invoke-virtual {v6, v5}, Lv0/c;->b(Ljava/lang/Object;)J

    .line 1658
    .line 1659
    .line 1660
    move-result-wide v5

    .line 1661
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v7

    .line 1665
    new-instance v8, LG/n;

    .line 1666
    .line 1667
    iget-object v9, v4, Lv/d;->b:Ljava/lang/Object;

    .line 1668
    .line 1669
    check-cast v9, Lq0/f;

    .line 1670
    .line 1671
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance"

    .line 1672
    .line 1673
    invoke-direct {v8, v9, v10, v7, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1674
    .line 1675
    .line 1676
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v3

    .line 1680
    invoke-static {v3}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 1681
    .line 1682
    .line 1683
    move-result-object v3

    .line 1684
    new-instance v5, Lv0/x;

    .line 1685
    .line 1686
    const/16 v6, 0xc

    .line 1687
    .line 1688
    invoke-direct {v5, v6}, Lv0/x;-><init>(I)V

    .line 1689
    .line 1690
    .line 1691
    invoke-virtual {v8, v3, v5}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 1692
    .line 1693
    .line 1694
    goto/16 :goto_7

    .line 1695
    .line 1696
    :cond_3a
    instance-of v7, v2, Landroid/webkit/HttpAuthHandler;

    .line 1697
    .line 1698
    if-eqz v7, :cond_3c

    .line 1699
    .line 1700
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1701
    .line 1702
    .line 1703
    move-object v5, v2

    .line 1704
    check-cast v5, Landroid/webkit/HttpAuthHandler;

    .line 1705
    .line 1706
    iget-object v6, v4, Lv/d;->c:Ljava/lang/Object;

    .line 1707
    .line 1708
    check-cast v6, Lv0/c;

    .line 1709
    .line 1710
    invoke-virtual {v6, v5}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 1711
    .line 1712
    .line 1713
    move-result v7

    .line 1714
    if-eqz v7, :cond_3b

    .line 1715
    .line 1716
    goto/16 :goto_7

    .line 1717
    .line 1718
    :cond_3b
    invoke-virtual {v6, v5}, Lv0/c;->b(Ljava/lang/Object;)J

    .line 1719
    .line 1720
    .line 1721
    move-result-wide v5

    .line 1722
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 1723
    .line 1724
    .line 1725
    move-result-object v7

    .line 1726
    new-instance v8, LG/n;

    .line 1727
    .line 1728
    iget-object v9, v4, Lv/d;->b:Ljava/lang/Object;

    .line 1729
    .line 1730
    check-cast v9, Lq0/f;

    .line 1731
    .line 1732
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance"

    .line 1733
    .line 1734
    invoke-direct {v8, v9, v10, v7, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1735
    .line 1736
    .line 1737
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1738
    .line 1739
    .line 1740
    move-result-object v3

    .line 1741
    invoke-static {v3}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 1742
    .line 1743
    .line 1744
    move-result-object v3

    .line 1745
    new-instance v5, Lv0/x;

    .line 1746
    .line 1747
    const/16 v6, 0xe

    .line 1748
    .line 1749
    invoke-direct {v5, v6}, Lv0/x;-><init>(I)V

    .line 1750
    .line 1751
    .line 1752
    invoke-virtual {v8, v3, v5}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 1753
    .line 1754
    .line 1755
    goto/16 :goto_7

    .line 1756
    .line 1757
    :cond_3c
    instance-of v7, v2, Landroid/os/Message;

    .line 1758
    .line 1759
    if-eqz v7, :cond_3e

    .line 1760
    .line 1761
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1762
    .line 1763
    .line 1764
    move-object v5, v2

    .line 1765
    check-cast v5, Landroid/os/Message;

    .line 1766
    .line 1767
    iget-object v6, v4, Lv/d;->c:Ljava/lang/Object;

    .line 1768
    .line 1769
    check-cast v6, Lv0/c;

    .line 1770
    .line 1771
    invoke-virtual {v6, v5}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 1772
    .line 1773
    .line 1774
    move-result v7

    .line 1775
    if-eqz v7, :cond_3d

    .line 1776
    .line 1777
    goto/16 :goto_7

    .line 1778
    .line 1779
    :cond_3d
    invoke-virtual {v6, v5}, Lv0/c;->b(Ljava/lang/Object;)J

    .line 1780
    .line 1781
    .line 1782
    move-result-wide v5

    .line 1783
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 1784
    .line 1785
    .line 1786
    move-result-object v7

    .line 1787
    new-instance v8, LG/n;

    .line 1788
    .line 1789
    iget-object v9, v4, Lv/d;->b:Ljava/lang/Object;

    .line 1790
    .line 1791
    check-cast v9, Lq0/f;

    .line 1792
    .line 1793
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance"

    .line 1794
    .line 1795
    invoke-direct {v8, v9, v10, v7, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1796
    .line 1797
    .line 1798
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v3

    .line 1802
    invoke-static {v3}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v3

    .line 1806
    new-instance v5, Lv0/x;

    .line 1807
    .line 1808
    const/4 v6, 0x0

    .line 1809
    invoke-direct {v5, v6}, Lv0/x;-><init>(I)V

    .line 1810
    .line 1811
    .line 1812
    invoke-virtual {v8, v3, v5}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 1813
    .line 1814
    .line 1815
    goto/16 :goto_7

    .line 1816
    .line 1817
    :cond_3e
    instance-of v7, v2, Landroid/webkit/ClientCertRequest;

    .line 1818
    .line 1819
    if-eqz v7, :cond_40

    .line 1820
    .line 1821
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1822
    .line 1823
    .line 1824
    move-object v5, v2

    .line 1825
    check-cast v5, Landroid/webkit/ClientCertRequest;

    .line 1826
    .line 1827
    iget-object v6, v4, Lv/d;->c:Ljava/lang/Object;

    .line 1828
    .line 1829
    check-cast v6, Lv0/c;

    .line 1830
    .line 1831
    invoke-virtual {v6, v5}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 1832
    .line 1833
    .line 1834
    move-result v7

    .line 1835
    if-eqz v7, :cond_3f

    .line 1836
    .line 1837
    goto/16 :goto_7

    .line 1838
    .line 1839
    :cond_3f
    invoke-virtual {v6, v5}, Lv0/c;->b(Ljava/lang/Object;)J

    .line 1840
    .line 1841
    .line 1842
    move-result-wide v5

    .line 1843
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 1844
    .line 1845
    .line 1846
    move-result-object v7

    .line 1847
    new-instance v8, LG/n;

    .line 1848
    .line 1849
    iget-object v9, v4, Lv/d;->b:Ljava/lang/Object;

    .line 1850
    .line 1851
    check-cast v9, Lq0/f;

    .line 1852
    .line 1853
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance"

    .line 1854
    .line 1855
    invoke-direct {v8, v9, v10, v7, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1856
    .line 1857
    .line 1858
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1859
    .line 1860
    .line 1861
    move-result-object v3

    .line 1862
    invoke-static {v3}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 1863
    .line 1864
    .line 1865
    move-result-object v3

    .line 1866
    new-instance v5, Lv0/x;

    .line 1867
    .line 1868
    const/4 v6, 0x4

    .line 1869
    invoke-direct {v5, v6}, Lv0/x;-><init>(I)V

    .line 1870
    .line 1871
    .line 1872
    invoke-virtual {v8, v3, v5}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 1873
    .line 1874
    .line 1875
    goto/16 :goto_7

    .line 1876
    .line 1877
    :cond_40
    instance-of v7, v2, Ljava/security/PrivateKey;

    .line 1878
    .line 1879
    if-eqz v7, :cond_42

    .line 1880
    .line 1881
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1882
    .line 1883
    .line 1884
    move-object v6, v2

    .line 1885
    check-cast v6, Ljava/security/PrivateKey;

    .line 1886
    .line 1887
    iget-object v7, v4, Lv/d;->c:Ljava/lang/Object;

    .line 1888
    .line 1889
    check-cast v7, Lv0/c;

    .line 1890
    .line 1891
    invoke-virtual {v7, v6}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 1892
    .line 1893
    .line 1894
    move-result v8

    .line 1895
    if-eqz v8, :cond_41

    .line 1896
    .line 1897
    goto/16 :goto_7

    .line 1898
    .line 1899
    :cond_41
    invoke-virtual {v7, v6}, Lv0/c;->b(Ljava/lang/Object;)J

    .line 1900
    .line 1901
    .line 1902
    move-result-wide v6

    .line 1903
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 1904
    .line 1905
    .line 1906
    move-result-object v8

    .line 1907
    new-instance v9, LG/n;

    .line 1908
    .line 1909
    iget-object v10, v4, Lv/d;->b:Ljava/lang/Object;

    .line 1910
    .line 1911
    check-cast v10, Lq0/f;

    .line 1912
    .line 1913
    const-string v11, "dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance"

    .line 1914
    .line 1915
    invoke-direct {v9, v10, v11, v8, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1916
    .line 1917
    .line 1918
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1919
    .line 1920
    .line 1921
    move-result-object v3

    .line 1922
    invoke-static {v3}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 1923
    .line 1924
    .line 1925
    move-result-object v3

    .line 1926
    new-instance v6, Lv0/x;

    .line 1927
    .line 1928
    invoke-direct {v6, v5}, Lv0/x;-><init>(I)V

    .line 1929
    .line 1930
    .line 1931
    invoke-virtual {v9, v3, v6}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 1932
    .line 1933
    .line 1934
    goto/16 :goto_7

    .line 1935
    .line 1936
    :cond_42
    instance-of v5, v2, Ljava/security/cert/X509Certificate;

    .line 1937
    .line 1938
    if-eqz v5, :cond_44

    .line 1939
    .line 1940
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1941
    .line 1942
    .line 1943
    move-object v5, v2

    .line 1944
    check-cast v5, Ljava/security/cert/X509Certificate;

    .line 1945
    .line 1946
    iget-object v6, v4, Lv/d;->c:Ljava/lang/Object;

    .line 1947
    .line 1948
    check-cast v6, Lv0/c;

    .line 1949
    .line 1950
    invoke-virtual {v6, v5}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 1951
    .line 1952
    .line 1953
    move-result v7

    .line 1954
    if-eqz v7, :cond_43

    .line 1955
    .line 1956
    goto/16 :goto_7

    .line 1957
    .line 1958
    :cond_43
    invoke-virtual {v6, v5}, Lv0/c;->b(Ljava/lang/Object;)J

    .line 1959
    .line 1960
    .line 1961
    move-result-wide v5

    .line 1962
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 1963
    .line 1964
    .line 1965
    move-result-object v7

    .line 1966
    new-instance v8, LG/n;

    .line 1967
    .line 1968
    iget-object v9, v4, Lv/d;->b:Ljava/lang/Object;

    .line 1969
    .line 1970
    check-cast v9, Lq0/f;

    .line 1971
    .line 1972
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance"

    .line 1973
    .line 1974
    invoke-direct {v8, v9, v10, v7, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1975
    .line 1976
    .line 1977
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1978
    .line 1979
    .line 1980
    move-result-object v3

    .line 1981
    invoke-static {v3}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 1982
    .line 1983
    .line 1984
    move-result-object v3

    .line 1985
    new-instance v5, Lv0/H;

    .line 1986
    .line 1987
    const/16 v6, 0x14

    .line 1988
    .line 1989
    invoke-direct {v5, v6}, Lv0/H;-><init>(I)V

    .line 1990
    .line 1991
    .line 1992
    invoke-virtual {v8, v3, v5}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 1993
    .line 1994
    .line 1995
    goto/16 :goto_7

    .line 1996
    .line 1997
    :cond_44
    instance-of v5, v2, Landroid/webkit/SslErrorHandler;

    .line 1998
    .line 1999
    if-eqz v5, :cond_46

    .line 2000
    .line 2001
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2002
    .line 2003
    .line 2004
    move-object v5, v2

    .line 2005
    check-cast v5, Landroid/webkit/SslErrorHandler;

    .line 2006
    .line 2007
    iget-object v7, v4, Lv/d;->c:Ljava/lang/Object;

    .line 2008
    .line 2009
    check-cast v7, Lv0/c;

    .line 2010
    .line 2011
    invoke-virtual {v7, v5}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 2012
    .line 2013
    .line 2014
    move-result v8

    .line 2015
    if-eqz v8, :cond_45

    .line 2016
    .line 2017
    goto/16 :goto_7

    .line 2018
    .line 2019
    :cond_45
    invoke-virtual {v7, v5}, Lv0/c;->b(Ljava/lang/Object;)J

    .line 2020
    .line 2021
    .line 2022
    move-result-wide v7

    .line 2023
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 2024
    .line 2025
    .line 2026
    move-result-object v5

    .line 2027
    new-instance v9, LG/n;

    .line 2028
    .line 2029
    iget-object v10, v4, Lv/d;->b:Ljava/lang/Object;

    .line 2030
    .line 2031
    check-cast v10, Lq0/f;

    .line 2032
    .line 2033
    const-string v11, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance"

    .line 2034
    .line 2035
    invoke-direct {v9, v10, v11, v5, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2036
    .line 2037
    .line 2038
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2039
    .line 2040
    .line 2041
    move-result-object v3

    .line 2042
    invoke-static {v3}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 2043
    .line 2044
    .line 2045
    move-result-object v3

    .line 2046
    new-instance v5, Lv0/x;

    .line 2047
    .line 2048
    invoke-direct {v5, v6}, Lv0/x;-><init>(I)V

    .line 2049
    .line 2050
    .line 2051
    invoke-virtual {v9, v3, v5}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 2052
    .line 2053
    .line 2054
    goto/16 :goto_7

    .line 2055
    .line 2056
    :cond_46
    instance-of v5, v2, Landroid/net/http/SslError;

    .line 2057
    .line 2058
    if-eqz v5, :cond_48

    .line 2059
    .line 2060
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2061
    .line 2062
    .line 2063
    move-object v5, v2

    .line 2064
    check-cast v5, Landroid/net/http/SslError;

    .line 2065
    .line 2066
    iget-object v6, v4, Lv/d;->c:Ljava/lang/Object;

    .line 2067
    .line 2068
    check-cast v6, Lv0/c;

    .line 2069
    .line 2070
    invoke-virtual {v6, v5}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 2071
    .line 2072
    .line 2073
    move-result v7

    .line 2074
    if-eqz v7, :cond_47

    .line 2075
    .line 2076
    goto/16 :goto_7

    .line 2077
    .line 2078
    :cond_47
    invoke-virtual {v6, v5}, Lv0/c;->b(Ljava/lang/Object;)J

    .line 2079
    .line 2080
    .line 2081
    move-result-wide v6

    .line 2082
    invoke-virtual {v5}, Landroid/net/http/SslError;->getCertificate()Landroid/net/http/SslCertificate;

    .line 2083
    .line 2084
    .line 2085
    move-result-object v8

    .line 2086
    invoke-virtual {v5}, Landroid/net/http/SslError;->getUrl()Ljava/lang/String;

    .line 2087
    .line 2088
    .line 2089
    move-result-object v5

    .line 2090
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 2091
    .line 2092
    .line 2093
    move-result-object v9

    .line 2094
    new-instance v10, LG/n;

    .line 2095
    .line 2096
    iget-object v11, v4, Lv/d;->b:Ljava/lang/Object;

    .line 2097
    .line 2098
    check-cast v11, Lq0/f;

    .line 2099
    .line 2100
    const-string v12, "dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance"

    .line 2101
    .line 2102
    invoke-direct {v10, v11, v12, v9, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2103
    .line 2104
    .line 2105
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2106
    .line 2107
    .line 2108
    move-result-object v3

    .line 2109
    const/4 v6, 0x3

    .line 2110
    new-array v6, v6, [Ljava/lang/Object;

    .line 2111
    .line 2112
    const/4 v7, 0x0

    .line 2113
    aput-object v3, v6, v7

    .line 2114
    .line 2115
    const/4 v3, 0x1

    .line 2116
    aput-object v8, v6, v3

    .line 2117
    .line 2118
    const/4 v3, 0x2

    .line 2119
    aput-object v5, v6, v3

    .line 2120
    .line 2121
    invoke-static {v6}, Ly0/e;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 2122
    .line 2123
    .line 2124
    move-result-object v3

    .line 2125
    new-instance v5, Lv0/x;

    .line 2126
    .line 2127
    const/16 v6, 0x16

    .line 2128
    .line 2129
    invoke-direct {v5, v6}, Lv0/x;-><init>(I)V

    .line 2130
    .line 2131
    .line 2132
    invoke-virtual {v10, v3, v5}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 2133
    .line 2134
    .line 2135
    goto/16 :goto_7

    .line 2136
    .line 2137
    :cond_48
    instance-of v5, v2, Landroid/net/http/SslCertificate$DName;

    .line 2138
    .line 2139
    if-eqz v5, :cond_4a

    .line 2140
    .line 2141
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2142
    .line 2143
    .line 2144
    move-object v5, v2

    .line 2145
    check-cast v5, Landroid/net/http/SslCertificate$DName;

    .line 2146
    .line 2147
    iget-object v6, v4, Lv/d;->c:Ljava/lang/Object;

    .line 2148
    .line 2149
    check-cast v6, Lv0/c;

    .line 2150
    .line 2151
    invoke-virtual {v6, v5}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 2152
    .line 2153
    .line 2154
    move-result v7

    .line 2155
    if-eqz v7, :cond_49

    .line 2156
    .line 2157
    goto/16 :goto_7

    .line 2158
    .line 2159
    :cond_49
    invoke-virtual {v6, v5}, Lv0/c;->b(Ljava/lang/Object;)J

    .line 2160
    .line 2161
    .line 2162
    move-result-wide v5

    .line 2163
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 2164
    .line 2165
    .line 2166
    move-result-object v7

    .line 2167
    new-instance v8, LG/n;

    .line 2168
    .line 2169
    iget-object v9, v4, Lv/d;->b:Ljava/lang/Object;

    .line 2170
    .line 2171
    check-cast v9, Lq0/f;

    .line 2172
    .line 2173
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance"

    .line 2174
    .line 2175
    invoke-direct {v8, v9, v10, v7, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2176
    .line 2177
    .line 2178
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2179
    .line 2180
    .line 2181
    move-result-object v3

    .line 2182
    invoke-static {v3}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 2183
    .line 2184
    .line 2185
    move-result-object v3

    .line 2186
    new-instance v5, Lv0/x;

    .line 2187
    .line 2188
    const/16 v6, 0x15

    .line 2189
    .line 2190
    invoke-direct {v5, v6}, Lv0/x;-><init>(I)V

    .line 2191
    .line 2192
    .line 2193
    invoke-virtual {v8, v3, v5}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 2194
    .line 2195
    .line 2196
    goto/16 :goto_7

    .line 2197
    .line 2198
    :cond_4a
    instance-of v5, v2, Landroid/net/http/SslCertificate;

    .line 2199
    .line 2200
    if-eqz v5, :cond_4c

    .line 2201
    .line 2202
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2203
    .line 2204
    .line 2205
    move-object v5, v2

    .line 2206
    check-cast v5, Landroid/net/http/SslCertificate;

    .line 2207
    .line 2208
    iget-object v6, v4, Lv/d;->c:Ljava/lang/Object;

    .line 2209
    .line 2210
    check-cast v6, Lv0/c;

    .line 2211
    .line 2212
    invoke-virtual {v6, v5}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 2213
    .line 2214
    .line 2215
    move-result v7

    .line 2216
    if-eqz v7, :cond_4b

    .line 2217
    .line 2218
    goto :goto_7

    .line 2219
    :cond_4b
    invoke-virtual {v6, v5}, Lv0/c;->b(Ljava/lang/Object;)J

    .line 2220
    .line 2221
    .line 2222
    move-result-wide v5

    .line 2223
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 2224
    .line 2225
    .line 2226
    move-result-object v7

    .line 2227
    new-instance v8, LG/n;

    .line 2228
    .line 2229
    iget-object v9, v4, Lv/d;->b:Ljava/lang/Object;

    .line 2230
    .line 2231
    check-cast v9, Lq0/f;

    .line 2232
    .line 2233
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance"

    .line 2234
    .line 2235
    invoke-direct {v8, v9, v10, v7, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2236
    .line 2237
    .line 2238
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2239
    .line 2240
    .line 2241
    move-result-object v3

    .line 2242
    invoke-static {v3}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 2243
    .line 2244
    .line 2245
    move-result-object v3

    .line 2246
    new-instance v5, Lv0/x;

    .line 2247
    .line 2248
    const/16 v6, 0x14

    .line 2249
    .line 2250
    invoke-direct {v5, v6}, Lv0/x;-><init>(I)V

    .line 2251
    .line 2252
    .line 2253
    invoke-virtual {v8, v3, v5}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 2254
    .line 2255
    .line 2256
    goto :goto_7

    .line 2257
    :cond_4c
    instance-of v5, v2, Ljava/security/cert/Certificate;

    .line 2258
    .line 2259
    if-eqz v5, :cond_4e

    .line 2260
    .line 2261
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2262
    .line 2263
    .line 2264
    move-object v5, v2

    .line 2265
    check-cast v5, Ljava/security/cert/Certificate;

    .line 2266
    .line 2267
    iget-object v6, v4, Lv/d;->c:Ljava/lang/Object;

    .line 2268
    .line 2269
    check-cast v6, Lv0/c;

    .line 2270
    .line 2271
    invoke-virtual {v6, v5}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 2272
    .line 2273
    .line 2274
    move-result v7

    .line 2275
    if-eqz v7, :cond_4d

    .line 2276
    .line 2277
    goto :goto_7

    .line 2278
    :cond_4d
    invoke-virtual {v6, v5}, Lv0/c;->b(Ljava/lang/Object;)J

    .line 2279
    .line 2280
    .line 2281
    move-result-wide v5

    .line 2282
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 2283
    .line 2284
    .line 2285
    move-result-object v7

    .line 2286
    new-instance v8, LG/n;

    .line 2287
    .line 2288
    iget-object v9, v4, Lv/d;->b:Ljava/lang/Object;

    .line 2289
    .line 2290
    check-cast v9, Lq0/f;

    .line 2291
    .line 2292
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance"

    .line 2293
    .line 2294
    invoke-direct {v8, v9, v10, v7, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2295
    .line 2296
    .line 2297
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2298
    .line 2299
    .line 2300
    move-result-object v3

    .line 2301
    invoke-static {v3}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 2302
    .line 2303
    .line 2304
    move-result-object v3

    .line 2305
    new-instance v5, Lv0/x;

    .line 2306
    .line 2307
    const/4 v6, 0x2

    .line 2308
    invoke-direct {v5, v6}, Lv0/x;-><init>(I)V

    .line 2309
    .line 2310
    .line 2311
    invoke-virtual {v8, v3, v5}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 2312
    .line 2313
    .line 2314
    :cond_4e
    :goto_7
    iget-object v3, v4, Lv/d;->c:Ljava/lang/Object;

    .line 2315
    .line 2316
    check-cast v3, Lv0/c;

    .line 2317
    .line 2318
    invoke-virtual {v3, v2}, Lv0/c;->d(Ljava/lang/Object;)Z

    .line 2319
    .line 2320
    .line 2321
    move-result v3

    .line 2322
    if-eqz v3, :cond_50

    .line 2323
    .line 2324
    const/16 v3, 0x80

    .line 2325
    .line 2326
    invoke-virtual {v1, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 2327
    .line 2328
    .line 2329
    iget-object v3, v4, Lv/d;->c:Ljava/lang/Object;

    .line 2330
    .line 2331
    check-cast v3, Lv0/c;

    .line 2332
    .line 2333
    invoke-virtual {v3}, Lv0/c;->f()V

    .line 2334
    .line 2335
    .line 2336
    iget-object v4, v3, Lv0/c;->b:Ljava/util/WeakHashMap;

    .line 2337
    .line 2338
    invoke-virtual {v4, v2}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2339
    .line 2340
    .line 2341
    move-result-object v4

    .line 2342
    check-cast v4, Ljava/lang/Long;

    .line 2343
    .line 2344
    if-eqz v4, :cond_4f

    .line 2345
    .line 2346
    iget-object v3, v3, Lv0/c;->d:Ljava/util/HashMap;

    .line 2347
    .line 2348
    invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2349
    .line 2350
    .line 2351
    :cond_4f
    invoke-virtual {v0, v1, v4}, Lv0/g;->k(Lq0/m;Ljava/lang/Object;)V

    .line 2352
    .line 2353
    .line 2354
    return-void

    .line 2355
    :cond_50
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 2356
    .line 2357
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2358
    .line 2359
    .line 2360
    move-result-object v3

    .line 2361
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2362
    .line 2363
    .line 2364
    move-result-object v3

    .line 2365
    new-instance v4, Ljava/lang/StringBuilder;

    .line 2366
    .line 2367
    const-string v5, "Unsupported value: \'"

    .line 2368
    .line 2369
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2370
    .line 2371
    .line 2372
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2373
    .line 2374
    .line 2375
    const-string v2, "\' of type \'"

    .line 2376
    .line 2377
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2378
    .line 2379
    .line 2380
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2381
    .line 2382
    .line 2383
    const-string v2, "\'"

    .line 2384
    .line 2385
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2386
    .line 2387
    .line 2388
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2389
    .line 2390
    .line 2391
    move-result-object v2

    .line 2392
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 2393
    .line 2394
    .line 2395
    throw v1

    .line 2396
    :cond_51
    :goto_8
    invoke-super/range {p0 .. p2}, Lv0/b;->k(Lq0/m;Ljava/lang/Object;)V

    .line 2397
    .line 2398
    .line 2399
    return-void
.end method
