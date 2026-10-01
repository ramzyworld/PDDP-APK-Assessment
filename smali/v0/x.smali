.class public final synthetic Lv0/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq0/c;
.implements Lq0/b;


# instance fields
.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lv0/x;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 2
    iput p1, p0, Lv0/x;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;)V
    .locals 7

    .line 1
    const-string v0, "channel-error"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const-string v3, "null cannot be cast to non-null type kotlin.String"

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    iget v6, p0, Lv0/x;->e:I

    .line 11
    .line 12
    packed-switch v6, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    :pswitch_0
    instance-of v6, p1, Ljava/util/List;

    .line 16
    .line 17
    if-eqz v6, :cond_1

    .line 18
    .line 19
    check-cast p1, Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-le v0, v5, :cond_0

    .line 26
    .line 27
    new-instance v0, Lv0/a;

    .line 28
    .line 29
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    check-cast v1, Ljava/lang/String;

    .line 37
    .line 38
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    check-cast v4, Ljava/lang/String;

    .line 46
    .line 47
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Ljava/lang/String;

    .line 52
    .line 53
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 57
    .line 58
    .line 59
    sget p1, Lv0/U;->h:I

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    sget p1, Lv0/U;->h:I

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged\'."

    .line 66
    .line 67
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    sget p1, Lv0/U;->h:I

    .line 71
    .line 72
    :goto_0
    return-void

    .line 73
    :pswitch_1
    instance-of v6, p1, Ljava/util/List;

    .line 74
    .line 75
    if-eqz v6, :cond_3

    .line 76
    .line 77
    check-cast p1, Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-le v0, v5, :cond_2

    .line 84
    .line 85
    new-instance v0, Lv0/a;

    .line 86
    .line 87
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    check-cast v1, Ljava/lang/String;

    .line 95
    .line 96
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    check-cast v4, Ljava/lang/String;

    .line 104
    .line 105
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    check-cast p1, Ljava/lang/String;

    .line 110
    .line 111
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 115
    .line 116
    .line 117
    sget p1, Lv0/U;->h:I

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_2
    sget p1, Lv0/U;->h:I

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_3
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView\'."

    .line 124
    .line 125
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    sget p1, Lv0/U;->h:I

    .line 129
    .line 130
    :goto_1
    return-void

    .line 131
    :pswitch_2
    instance-of v6, p1, Ljava/util/List;

    .line 132
    .line 133
    if-eqz v6, :cond_4

    .line 134
    .line 135
    check-cast p1, Ljava/util/List;

    .line 136
    .line 137
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-le v0, v5, :cond_5

    .line 142
    .line 143
    new-instance v0, Lv0/a;

    .line 144
    .line 145
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    check-cast v1, Ljava/lang/String;

    .line 153
    .line 154
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    check-cast v4, Ljava/lang/String;

    .line 162
    .line 163
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    check-cast p1, Ljava/lang/String;

    .line 168
    .line 169
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 173
    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_4
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance\'."

    .line 177
    .line 178
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    :cond_5
    :goto_2
    return-void

    .line 182
    :pswitch_3
    instance-of v6, p1, Ljava/util/List;

    .line 183
    .line 184
    if-eqz v6, :cond_6

    .line 185
    .line 186
    check-cast p1, Ljava/util/List;

    .line 187
    .line 188
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-le v0, v5, :cond_7

    .line 193
    .line 194
    new-instance v0, Lv0/a;

    .line 195
    .line 196
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    check-cast v1, Ljava/lang/String;

    .line 204
    .line 205
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    check-cast v4, Ljava/lang/String;

    .line 213
    .line 214
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    check-cast p1, Ljava/lang/String;

    .line 219
    .line 220
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 224
    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_6
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance\'."

    .line 228
    .line 229
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    :cond_7
    :goto_3
    return-void

    .line 233
    :pswitch_4
    instance-of v6, p1, Ljava/util/List;

    .line 234
    .line 235
    if-eqz v6, :cond_8

    .line 236
    .line 237
    check-cast p1, Ljava/util/List;

    .line 238
    .line 239
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-le v0, v5, :cond_9

    .line 244
    .line 245
    new-instance v0, Lv0/a;

    .line 246
    .line 247
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    check-cast v1, Ljava/lang/String;

    .line 255
    .line 256
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    check-cast v4, Ljava/lang/String;

    .line 264
    .line 265
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    check-cast p1, Ljava/lang/String;

    .line 270
    .line 271
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 275
    .line 276
    .line 277
    goto :goto_4

    .line 278
    :cond_8
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance\'."

    .line 279
    .line 280
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    :cond_9
    :goto_4
    return-void

    .line 284
    :pswitch_5
    instance-of v6, p1, Ljava/util/List;

    .line 285
    .line 286
    if-eqz v6, :cond_a

    .line 287
    .line 288
    check-cast p1, Ljava/util/List;

    .line 289
    .line 290
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    if-le v0, v5, :cond_b

    .line 295
    .line 296
    new-instance v0, Lv0/a;

    .line 297
    .line 298
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    check-cast v1, Ljava/lang/String;

    .line 306
    .line 307
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    check-cast v4, Ljava/lang/String;

    .line 315
    .line 316
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object p1

    .line 320
    check-cast p1, Ljava/lang/String;

    .line 321
    .line 322
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 326
    .line 327
    .line 328
    goto :goto_5

    .line 329
    :cond_a
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance\'."

    .line 330
    .line 331
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    :cond_b
    :goto_5
    return-void

    .line 335
    :pswitch_6
    instance-of v6, p1, Ljava/util/List;

    .line 336
    .line 337
    if-eqz v6, :cond_c

    .line 338
    .line 339
    check-cast p1, Ljava/util/List;

    .line 340
    .line 341
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 342
    .line 343
    .line 344
    move-result v0

    .line 345
    if-le v0, v5, :cond_d

    .line 346
    .line 347
    new-instance v0, Lv0/a;

    .line 348
    .line 349
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    check-cast v1, Ljava/lang/String;

    .line 357
    .line 358
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v4

    .line 362
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    check-cast v4, Ljava/lang/String;

    .line 366
    .line 367
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object p1

    .line 371
    check-cast p1, Ljava/lang/String;

    .line 372
    .line 373
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 377
    .line 378
    .line 379
    goto :goto_6

    .line 380
    :cond_c
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance\'."

    .line 381
    .line 382
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    :cond_d
    :goto_6
    return-void

    .line 386
    :pswitch_7
    instance-of v6, p1, Ljava/util/List;

    .line 387
    .line 388
    if-eqz v6, :cond_e

    .line 389
    .line 390
    check-cast p1, Ljava/util/List;

    .line 391
    .line 392
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    if-le v0, v5, :cond_f

    .line 397
    .line 398
    new-instance v0, Lv0/a;

    .line 399
    .line 400
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    check-cast v1, Ljava/lang/String;

    .line 408
    .line 409
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v4

    .line 413
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    check-cast v4, Ljava/lang/String;

    .line 417
    .line 418
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object p1

    .line 422
    check-cast p1, Ljava/lang/String;

    .line 423
    .line 424
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 428
    .line 429
    .line 430
    goto :goto_7

    .line 431
    :cond_e
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance\'."

    .line 432
    .line 433
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    :cond_f
    :goto_7
    return-void

    .line 437
    :pswitch_8
    instance-of v6, p1, Ljava/util/List;

    .line 438
    .line 439
    if-eqz v6, :cond_10

    .line 440
    .line 441
    check-cast p1, Ljava/util/List;

    .line 442
    .line 443
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 444
    .line 445
    .line 446
    move-result v0

    .line 447
    if-le v0, v5, :cond_11

    .line 448
    .line 449
    new-instance v0, Lv0/a;

    .line 450
    .line 451
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    check-cast v1, Ljava/lang/String;

    .line 459
    .line 460
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v4

    .line 464
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 465
    .line 466
    .line 467
    check-cast v4, Ljava/lang/String;

    .line 468
    .line 469
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object p1

    .line 473
    check-cast p1, Ljava/lang/String;

    .line 474
    .line 475
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 479
    .line 480
    .line 481
    goto :goto_8

    .line 482
    :cond_10
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance\'."

    .line 483
    .line 484
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    :cond_11
    :goto_8
    return-void

    .line 488
    :pswitch_9
    instance-of v6, p1, Ljava/util/List;

    .line 489
    .line 490
    if-eqz v6, :cond_12

    .line 491
    .line 492
    check-cast p1, Ljava/util/List;

    .line 493
    .line 494
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 495
    .line 496
    .line 497
    move-result v0

    .line 498
    if-le v0, v5, :cond_13

    .line 499
    .line 500
    new-instance v0, Lv0/a;

    .line 501
    .line 502
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v1

    .line 506
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    check-cast v1, Ljava/lang/String;

    .line 510
    .line 511
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v4

    .line 515
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    check-cast v4, Ljava/lang/String;

    .line 519
    .line 520
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object p1

    .line 524
    check-cast p1, Ljava/lang/String;

    .line 525
    .line 526
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 527
    .line 528
    .line 529
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 530
    .line 531
    .line 532
    goto :goto_9

    .line 533
    :cond_12
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage\'."

    .line 534
    .line 535
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    :cond_13
    :goto_9
    return-void

    .line 539
    :pswitch_a
    instance-of v6, p1, Ljava/util/List;

    .line 540
    .line 541
    if-eqz v6, :cond_14

    .line 542
    .line 543
    check-cast p1, Ljava/util/List;

    .line 544
    .line 545
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 546
    .line 547
    .line 548
    move-result v0

    .line 549
    if-le v0, v5, :cond_15

    .line 550
    .line 551
    new-instance v0, Lv0/a;

    .line 552
    .line 553
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v1

    .line 557
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    check-cast v1, Ljava/lang/String;

    .line 561
    .line 562
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v4

    .line 566
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 567
    .line 568
    .line 569
    check-cast v4, Ljava/lang/String;

    .line 570
    .line 571
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object p1

    .line 575
    check-cast p1, Ljava/lang/String;

    .line 576
    .line 577
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 581
    .line 582
    .line 583
    goto :goto_a

    .line 584
    :cond_14
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance\'."

    .line 585
    .line 586
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 587
    .line 588
    .line 589
    :cond_15
    :goto_a
    return-void

    .line 590
    :pswitch_b
    instance-of v6, p1, Ljava/util/List;

    .line 591
    .line 592
    if-eqz v6, :cond_16

    .line 593
    .line 594
    check-cast p1, Ljava/util/List;

    .line 595
    .line 596
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 597
    .line 598
    .line 599
    move-result v0

    .line 600
    if-le v0, v5, :cond_17

    .line 601
    .line 602
    new-instance v0, Lv0/a;

    .line 603
    .line 604
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object v1

    .line 608
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 609
    .line 610
    .line 611
    check-cast v1, Ljava/lang/String;

    .line 612
    .line 613
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v4

    .line 617
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    check-cast v4, Ljava/lang/String;

    .line 621
    .line 622
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object p1

    .line 626
    check-cast p1, Ljava/lang/String;

    .line 627
    .line 628
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 629
    .line 630
    .line 631
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 632
    .line 633
    .line 634
    goto :goto_b

    .line 635
    :cond_16
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance\'."

    .line 636
    .line 637
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 638
    .line 639
    .line 640
    :cond_17
    :goto_b
    return-void

    .line 641
    :pswitch_c
    instance-of v6, p1, Ljava/util/List;

    .line 642
    .line 643
    if-eqz v6, :cond_18

    .line 644
    .line 645
    check-cast p1, Ljava/util/List;

    .line 646
    .line 647
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 648
    .line 649
    .line 650
    move-result v0

    .line 651
    if-le v0, v5, :cond_19

    .line 652
    .line 653
    new-instance v0, Lv0/a;

    .line 654
    .line 655
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 660
    .line 661
    .line 662
    check-cast v1, Ljava/lang/String;

    .line 663
    .line 664
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v4

    .line 668
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    check-cast v4, Ljava/lang/String;

    .line 672
    .line 673
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object p1

    .line 677
    check-cast p1, Ljava/lang/String;

    .line 678
    .line 679
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 680
    .line 681
    .line 682
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 683
    .line 684
    .line 685
    goto :goto_c

    .line 686
    :cond_18
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance\'."

    .line 687
    .line 688
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 689
    .line 690
    .line 691
    :cond_19
    :goto_c
    return-void

    .line 692
    :pswitch_d
    instance-of v6, p1, Ljava/util/List;

    .line 693
    .line 694
    if-eqz v6, :cond_1a

    .line 695
    .line 696
    check-cast p1, Ljava/util/List;

    .line 697
    .line 698
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 699
    .line 700
    .line 701
    move-result v0

    .line 702
    if-le v0, v5, :cond_1b

    .line 703
    .line 704
    new-instance v0, Lv0/a;

    .line 705
    .line 706
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 707
    .line 708
    .line 709
    move-result-object v1

    .line 710
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 711
    .line 712
    .line 713
    check-cast v1, Ljava/lang/String;

    .line 714
    .line 715
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v4

    .line 719
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 720
    .line 721
    .line 722
    check-cast v4, Ljava/lang/String;

    .line 723
    .line 724
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    move-result-object p1

    .line 728
    check-cast p1, Ljava/lang/String;

    .line 729
    .line 730
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 731
    .line 732
    .line 733
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 734
    .line 735
    .line 736
    goto :goto_d

    .line 737
    :cond_1a
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance\'."

    .line 738
    .line 739
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 740
    .line 741
    .line 742
    :cond_1b
    :goto_d
    return-void

    .line 743
    :pswitch_e
    instance-of v6, p1, Ljava/util/List;

    .line 744
    .line 745
    if-eqz v6, :cond_1c

    .line 746
    .line 747
    check-cast p1, Ljava/util/List;

    .line 748
    .line 749
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 750
    .line 751
    .line 752
    move-result v0

    .line 753
    if-le v0, v5, :cond_1d

    .line 754
    .line 755
    new-instance v0, Lv0/a;

    .line 756
    .line 757
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v1

    .line 761
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 762
    .line 763
    .line 764
    check-cast v1, Ljava/lang/String;

    .line 765
    .line 766
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v4

    .line 770
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 771
    .line 772
    .line 773
    check-cast v4, Ljava/lang/String;

    .line 774
    .line 775
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 776
    .line 777
    .line 778
    move-result-object p1

    .line 779
    check-cast p1, Ljava/lang/String;

    .line 780
    .line 781
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 782
    .line 783
    .line 784
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 785
    .line 786
    .line 787
    goto :goto_e

    .line 788
    :cond_1c
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart\'."

    .line 789
    .line 790
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 791
    .line 792
    .line 793
    :cond_1d
    :goto_e
    return-void

    .line 794
    :pswitch_f
    instance-of v6, p1, Ljava/util/List;

    .line 795
    .line 796
    if-eqz v6, :cond_1e

    .line 797
    .line 798
    check-cast p1, Ljava/util/List;

    .line 799
    .line 800
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 801
    .line 802
    .line 803
    move-result v0

    .line 804
    if-le v0, v5, :cond_1f

    .line 805
    .line 806
    new-instance v0, Lv0/a;

    .line 807
    .line 808
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 809
    .line 810
    .line 811
    move-result-object v1

    .line 812
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 813
    .line 814
    .line 815
    check-cast v1, Ljava/lang/String;

    .line 816
    .line 817
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    move-result-object v4

    .line 821
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 822
    .line 823
    .line 824
    check-cast v4, Ljava/lang/String;

    .line 825
    .line 826
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    move-result-object p1

    .line 830
    check-cast p1, Ljava/lang/String;

    .line 831
    .line 832
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 833
    .line 834
    .line 835
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 836
    .line 837
    .line 838
    goto :goto_f

    .line 839
    :cond_1e
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance\'."

    .line 840
    .line 841
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 842
    .line 843
    .line 844
    :cond_1f
    :goto_f
    return-void

    .line 845
    :pswitch_10
    instance-of v6, p1, Ljava/util/List;

    .line 846
    .line 847
    if-eqz v6, :cond_20

    .line 848
    .line 849
    check-cast p1, Ljava/util/List;

    .line 850
    .line 851
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 852
    .line 853
    .line 854
    move-result v0

    .line 855
    if-le v0, v5, :cond_21

    .line 856
    .line 857
    new-instance v0, Lv0/a;

    .line 858
    .line 859
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    move-result-object v1

    .line 863
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 864
    .line 865
    .line 866
    check-cast v1, Ljava/lang/String;

    .line 867
    .line 868
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 869
    .line 870
    .line 871
    move-result-object v4

    .line 872
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 873
    .line 874
    .line 875
    check-cast v4, Ljava/lang/String;

    .line 876
    .line 877
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 878
    .line 879
    .line 880
    move-result-object p1

    .line 881
    check-cast p1, Ljava/lang/String;

    .line 882
    .line 883
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 884
    .line 885
    .line 886
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 887
    .line 888
    .line 889
    goto :goto_10

    .line 890
    :cond_20
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance\'."

    .line 891
    .line 892
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 893
    .line 894
    .line 895
    :cond_21
    :goto_10
    return-void

    .line 896
    :pswitch_11
    instance-of v6, p1, Ljava/util/List;

    .line 897
    .line 898
    if-eqz v6, :cond_22

    .line 899
    .line 900
    check-cast p1, Ljava/util/List;

    .line 901
    .line 902
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 903
    .line 904
    .line 905
    move-result v0

    .line 906
    if-le v0, v5, :cond_23

    .line 907
    .line 908
    new-instance v0, Lv0/a;

    .line 909
    .line 910
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 911
    .line 912
    .line 913
    move-result-object v1

    .line 914
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 915
    .line 916
    .line 917
    check-cast v1, Ljava/lang/String;

    .line 918
    .line 919
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 920
    .line 921
    .line 922
    move-result-object v4

    .line 923
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 924
    .line 925
    .line 926
    check-cast v4, Ljava/lang/String;

    .line 927
    .line 928
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 929
    .line 930
    .line 931
    move-result-object p1

    .line 932
    check-cast p1, Ljava/lang/String;

    .line 933
    .line 934
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 935
    .line 936
    .line 937
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 938
    .line 939
    .line 940
    goto :goto_11

    .line 941
    :cond_22
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance\'."

    .line 942
    .line 943
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 944
    .line 945
    .line 946
    :cond_23
    :goto_11
    return-void

    .line 947
    :pswitch_12
    instance-of v6, p1, Ljava/util/List;

    .line 948
    .line 949
    if-eqz v6, :cond_24

    .line 950
    .line 951
    check-cast p1, Ljava/util/List;

    .line 952
    .line 953
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 954
    .line 955
    .line 956
    move-result v0

    .line 957
    if-le v0, v5, :cond_25

    .line 958
    .line 959
    new-instance v0, Lv0/a;

    .line 960
    .line 961
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 962
    .line 963
    .line 964
    move-result-object v1

    .line 965
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 966
    .line 967
    .line 968
    check-cast v1, Ljava/lang/String;

    .line 969
    .line 970
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 971
    .line 972
    .line 973
    move-result-object v4

    .line 974
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 975
    .line 976
    .line 977
    check-cast v4, Ljava/lang/String;

    .line 978
    .line 979
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 980
    .line 981
    .line 982
    move-result-object p1

    .line 983
    check-cast p1, Ljava/lang/String;

    .line 984
    .line 985
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 986
    .line 987
    .line 988
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 989
    .line 990
    .line 991
    goto :goto_12

    .line 992
    :cond_24
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance\'."

    .line 993
    .line 994
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 995
    .line 996
    .line 997
    :cond_25
    :goto_12
    return-void

    .line 998
    :pswitch_13
    instance-of v6, p1, Ljava/util/List;

    .line 999
    .line 1000
    if-eqz v6, :cond_26

    .line 1001
    .line 1002
    check-cast p1, Ljava/util/List;

    .line 1003
    .line 1004
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 1005
    .line 1006
    .line 1007
    move-result v0

    .line 1008
    if-le v0, v5, :cond_27

    .line 1009
    .line 1010
    new-instance v0, Lv0/a;

    .line 1011
    .line 1012
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v1

    .line 1016
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1017
    .line 1018
    .line 1019
    check-cast v1, Ljava/lang/String;

    .line 1020
    .line 1021
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v4

    .line 1025
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1026
    .line 1027
    .line 1028
    check-cast v4, Ljava/lang/String;

    .line 1029
    .line 1030
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1031
    .line 1032
    .line 1033
    move-result-object p1

    .line 1034
    check-cast p1, Ljava/lang/String;

    .line 1035
    .line 1036
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1037
    .line 1038
    .line 1039
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 1040
    .line 1041
    .line 1042
    goto :goto_13

    .line 1043
    :cond_26
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance\'."

    .line 1044
    .line 1045
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1046
    .line 1047
    .line 1048
    :cond_27
    :goto_13
    return-void

    .line 1049
    :pswitch_14
    instance-of v6, p1, Ljava/util/List;

    .line 1050
    .line 1051
    if-eqz v6, :cond_28

    .line 1052
    .line 1053
    check-cast p1, Ljava/util/List;

    .line 1054
    .line 1055
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 1056
    .line 1057
    .line 1058
    move-result v0

    .line 1059
    if-le v0, v5, :cond_29

    .line 1060
    .line 1061
    new-instance v0, Lv0/a;

    .line 1062
    .line 1063
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v1

    .line 1067
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1068
    .line 1069
    .line 1070
    check-cast v1, Ljava/lang/String;

    .line 1071
    .line 1072
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v4

    .line 1076
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1077
    .line 1078
    .line 1079
    check-cast v4, Ljava/lang/String;

    .line 1080
    .line 1081
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1082
    .line 1083
    .line 1084
    move-result-object p1

    .line 1085
    check-cast p1, Ljava/lang/String;

    .line 1086
    .line 1087
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1088
    .line 1089
    .line 1090
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 1091
    .line 1092
    .line 1093
    goto :goto_14

    .line 1094
    :cond_28
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance\'."

    .line 1095
    .line 1096
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1097
    .line 1098
    .line 1099
    :cond_29
    :goto_14
    return-void

    .line 1100
    nop

    .line 1101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_0
        :pswitch_13
        :pswitch_0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public o(Ljava/lang/Object;LN/Q;)V
    .locals 5

    .line 1
    iget v0, p0, Lv0/x;->e:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 7
    .line 8
    invoke-static {p1, v0}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/util/List;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v0, "null cannot be cast to non-null type android.webkit.SslErrorHandler"

    .line 19
    .line 20
    invoke-static {p1, v0}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    check-cast p1, Landroid/webkit/SslErrorHandler;

    .line 24
    .line 25
    :try_start_0
    invoke-virtual {p1}, Landroid/webkit/SslErrorHandler;->proceed()V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    :goto_0
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :sswitch_0
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 44
    .line 45
    invoke-static {p1, v0}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    check-cast p1, Ljava/util/List;

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const-string v0, "null cannot be cast to non-null type android.webkit.SslErrorHandler"

    .line 56
    .line 57
    invoke-static {p1, v0}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    check-cast p1, Landroid/webkit/SslErrorHandler;

    .line 61
    .line 62
    :try_start_1
    invoke-virtual {p1}, Landroid/webkit/SslErrorHandler;->cancel()V

    .line 63
    .line 64
    .line 65
    const/4 p1, 0x0

    .line 66
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 70
    goto :goto_1

    .line 71
    :catchall_1
    move-exception p1

    .line 72
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    :goto_1
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :sswitch_1
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 81
    .line 82
    invoke-static {p1, v0}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    check-cast p1, Ljava/util/List;

    .line 86
    .line 87
    const/4 v0, 0x0

    .line 88
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    const-string v0, "null cannot be cast to non-null type android.net.http.SslError"

    .line 93
    .line 94
    invoke-static {p1, v0}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    check-cast p1, Landroid/net/http/SslError;

    .line 98
    .line 99
    :try_start_2
    invoke-virtual {p1}, Landroid/net/http/SslError;->getPrimaryError()I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_5

    .line 104
    .line 105
    const/4 v0, 0x1

    .line 106
    if-eq p1, v0, :cond_4

    .line 107
    .line 108
    const/4 v0, 0x2

    .line 109
    if-eq p1, v0, :cond_3

    .line 110
    .line 111
    const/4 v0, 0x3

    .line 112
    if-eq p1, v0, :cond_2

    .line 113
    .line 114
    const/4 v0, 0x4

    .line 115
    if-eq p1, v0, :cond_1

    .line 116
    .line 117
    const/4 v0, 0x5

    .line 118
    if-eq p1, v0, :cond_0

    .line 119
    .line 120
    sget-object p1, Lv0/O;->l:Lv0/O;

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_0
    sget-object p1, Lv0/O;->i:Lv0/O;

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_1
    sget-object p1, Lv0/O;->f:Lv0/O;

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_2
    sget-object p1, Lv0/O;->k:Lv0/O;

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_3
    sget-object p1, Lv0/O;->h:Lv0/O;

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_4
    sget-object p1, Lv0/O;->g:Lv0/O;

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_5
    sget-object p1, Lv0/O;->j:Lv0/O;

    .line 139
    .line 140
    :goto_2
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 144
    goto :goto_3

    .line 145
    :catchall_2
    move-exception p1

    .line 146
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    :goto_3
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :sswitch_2
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 155
    .line 156
    invoke-static {p1, v0}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    check-cast p1, Ljava/util/List;

    .line 160
    .line 161
    const/4 v0, 0x0

    .line 162
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    const-string v0, "null cannot be cast to non-null type android.webkit.PermissionRequest"

    .line 167
    .line 168
    invoke-static {p1, v0}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    check-cast p1, Landroid/webkit/PermissionRequest;

    .line 172
    .line 173
    :try_start_3
    invoke-virtual {p1}, Landroid/webkit/PermissionRequest;->deny()V

    .line 174
    .line 175
    .line 176
    const/4 p1, 0x0

    .line 177
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 178
    .line 179
    .line 180
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 181
    goto :goto_4

    .line 182
    :catchall_3
    move-exception p1

    .line 183
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    :goto_4
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :sswitch_3
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 192
    .line 193
    invoke-static {p1, v0}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    check-cast p1, Ljava/util/List;

    .line 197
    .line 198
    const/4 v0, 0x0

    .line 199
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    const-string v2, "null cannot be cast to non-null type android.webkit.PermissionRequest"

    .line 204
    .line 205
    invoke-static {v1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    check-cast v1, Landroid/webkit/PermissionRequest;

    .line 209
    .line 210
    const/4 v2, 0x1

    .line 211
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    const-string v2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"

    .line 216
    .line 217
    invoke-static {p1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    check-cast p1, Ljava/util/List;

    .line 221
    .line 222
    :try_start_4
    new-array v0, v0, [Ljava/lang/String;

    .line 223
    .line 224
    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    check-cast p1, [Ljava/lang/String;

    .line 229
    .line 230
    invoke-virtual {v1, p1}, Landroid/webkit/PermissionRequest;->grant([Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    const/4 p1, 0x0

    .line 234
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 235
    .line 236
    .line 237
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 238
    goto :goto_5

    .line 239
    :catchall_4
    move-exception p1

    .line 240
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    :goto_5
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    return-void

    .line 248
    :sswitch_4
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 249
    .line 250
    invoke-static {p1, v0}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    check-cast p1, Ljava/util/List;

    .line 254
    .line 255
    const/4 v0, 0x0

    .line 256
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    const-string v1, "null cannot be cast to non-null type android.webkit.GeolocationPermissions.Callback"

    .line 261
    .line 262
    invoke-static {v0, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    check-cast v0, Landroid/webkit/GeolocationPermissions$Callback;

    .line 266
    .line 267
    const/4 v1, 0x1

    .line 268
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    const-string v2, "null cannot be cast to non-null type kotlin.String"

    .line 273
    .line 274
    invoke-static {v1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    check-cast v1, Ljava/lang/String;

    .line 278
    .line 279
    const/4 v2, 0x2

    .line 280
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    const-string v3, "null cannot be cast to non-null type kotlin.Boolean"

    .line 285
    .line 286
    invoke-static {v2, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    check-cast v2, Ljava/lang/Boolean;

    .line 290
    .line 291
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    const/4 v4, 0x3

    .line 296
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object p1

    .line 300
    invoke-static {p1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    check-cast p1, Ljava/lang/Boolean;

    .line 304
    .line 305
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 306
    .line 307
    .line 308
    move-result p1

    .line 309
    :try_start_5
    invoke-interface {v0, v1, v2, p1}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    .line 310
    .line 311
    .line 312
    const/4 p1, 0x0

    .line 313
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 314
    .line 315
    .line 316
    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 317
    goto :goto_6

    .line 318
    :catchall_5
    move-exception p1

    .line 319
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    :goto_6
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    return-void

    .line 327
    :sswitch_5
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 328
    .line 329
    invoke-static {p1, v0}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    check-cast p1, Ljava/util/List;

    .line 333
    .line 334
    const/4 v0, 0x0

    .line 335
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    const-string v0, "null cannot be cast to non-null type android.webkit.WebChromeClient.CustomViewCallback"

    .line 340
    .line 341
    invoke-static {p1, v0}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    check-cast p1, Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 345
    .line 346
    :try_start_6
    invoke-interface {p1}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    .line 347
    .line 348
    .line 349
    const/4 p1, 0x0

    .line 350
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 351
    .line 352
    .line 353
    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 354
    goto :goto_7

    .line 355
    :catchall_6
    move-exception p1

    .line 356
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 357
    .line 358
    .line 359
    move-result-object p1

    .line 360
    :goto_7
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    return-void

    .line 364
    :sswitch_6
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 365
    .line 366
    invoke-static {p1, v0}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    check-cast p1, Ljava/util/List;

    .line 370
    .line 371
    const/4 v0, 0x0

    .line 372
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    const-string v0, "null cannot be cast to non-null type java.security.cert.Certificate"

    .line 377
    .line 378
    invoke-static {p1, v0}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    check-cast p1, Ljava/security/cert/Certificate;

    .line 382
    .line 383
    :try_start_7
    invoke-virtual {p1}, Ljava/security/cert/Certificate;->getEncoded()[B

    .line 384
    .line 385
    .line 386
    move-result-object p1
    :try_end_7
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 387
    :try_start_8
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    goto :goto_9

    .line 392
    :catchall_7
    move-exception p1

    .line 393
    goto :goto_8

    .line 394
    :catch_0
    move-exception p1

    .line 395
    new-instance v0, Ljava/lang/RuntimeException;

    .line 396
    .line 397
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 398
    .line 399
    .line 400
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 401
    :goto_8
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 402
    .line 403
    .line 404
    move-result-object p1

    .line 405
    :goto_9
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    return-void

    .line 409
    :sswitch_7
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 410
    .line 411
    invoke-static {p1, v0}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    check-cast p1, Ljava/util/List;

    .line 415
    .line 416
    const/4 v0, 0x0

    .line 417
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object p1

    .line 421
    const-string v0, "null cannot be cast to non-null type android.os.Message"

    .line 422
    .line 423
    invoke-static {p1, v0}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    check-cast p1, Landroid/os/Message;

    .line 427
    .line 428
    :try_start_9
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 429
    .line 430
    .line 431
    const/4 p1, 0x0

    .line 432
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 433
    .line 434
    .line 435
    move-result-object p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 436
    goto :goto_a

    .line 437
    :catchall_8
    move-exception p1

    .line 438
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 439
    .line 440
    .line 441
    move-result-object p1

    .line 442
    :goto_a
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    return-void

    .line 446
    nop

    .line 447
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_7
        0x3 -> :sswitch_6
        0x8 -> :sswitch_5
        0xd -> :sswitch_4
        0x11 -> :sswitch_3
        0x12 -> :sswitch_2
        0x17 -> :sswitch_1
        0x19 -> :sswitch_0
    .end sparse-switch
.end method
