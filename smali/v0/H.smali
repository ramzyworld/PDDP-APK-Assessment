.class public final synthetic Lv0/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq0/c;
.implements Lq0/b;
.implements Lw0/b;


# instance fields
.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lv0/H;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 2
    iput p1, p0, Lv0/H;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->hasFocus()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

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
    iget v6, p0, Lv0/H;->e:I

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
    if-eqz v6, :cond_0

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
    if-le v0, v5, :cond_1

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
    goto :goto_0

    .line 60
    :cond_0
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance\'."

    .line 61
    .line 62
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    :goto_0
    return-void

    .line 66
    :pswitch_1
    instance-of v6, p1, Ljava/util/List;

    .line 67
    .line 68
    if-eqz v6, :cond_2

    .line 69
    .line 70
    check-cast p1, Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-le v0, v5, :cond_3

    .line 77
    .line 78
    new-instance v0, Lv0/a;

    .line 79
    .line 80
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    check-cast v1, Ljava/lang/String;

    .line 88
    .line 89
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    check-cast v4, Ljava/lang/String;

    .line 97
    .line 98
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    check-cast p1, Ljava/lang/String;

    .line 103
    .line 104
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance\'."

    .line 112
    .line 113
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :cond_3
    :goto_1
    return-void

    .line 117
    :pswitch_2
    instance-of v6, p1, Ljava/util/List;

    .line 118
    .line 119
    if-eqz v6, :cond_5

    .line 120
    .line 121
    check-cast p1, Ljava/util/List;

    .line 122
    .line 123
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-le v0, v5, :cond_4

    .line 128
    .line 129
    new-instance v0, Lv0/a;

    .line 130
    .line 131
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    check-cast v1, Ljava/lang/String;

    .line 139
    .line 140
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    check-cast v4, Ljava/lang/String;

    .line 148
    .line 149
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    check-cast p1, Ljava/lang/String;

    .line 154
    .line 155
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 159
    .line 160
    .line 161
    sget p1, Lv0/d0;->c:I

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_4
    sget p1, Lv0/d0;->c:I

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_5
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError\'."

    .line 168
    .line 169
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    sget p1, Lv0/d0;->c:I

    .line 173
    .line 174
    :goto_2
    return-void

    .line 175
    :pswitch_3
    instance-of v6, p1, Ljava/util/List;

    .line 176
    .line 177
    if-eqz v6, :cond_7

    .line 178
    .line 179
    check-cast p1, Ljava/util/List;

    .line 180
    .line 181
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-le v0, v5, :cond_6

    .line 186
    .line 187
    new-instance v0, Lv0/a;

    .line 188
    .line 189
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    check-cast v1, Ljava/lang/String;

    .line 197
    .line 198
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    check-cast v4, Ljava/lang/String;

    .line 206
    .line 207
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    check-cast p1, Ljava/lang/String;

    .line 212
    .line 213
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 217
    .line 218
    .line 219
    sget p1, Lv0/b0;->d:I

    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_6
    sget p1, Lv0/b0;->d:I

    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_7
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestErrorCompat\'."

    .line 226
    .line 227
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    sget p1, Lv0/b0;->d:I

    .line 231
    .line 232
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
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance\'."

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
    if-eqz v6, :cond_b

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
    if-le v0, v5, :cond_a

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
    sget p1, Lv0/h0;->h:I

    .line 329
    .line 330
    goto :goto_5

    .line 331
    :cond_a
    sget p1, Lv0/h0;->h:I

    .line 332
    .line 333
    goto :goto_5

    .line 334
    :cond_b
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged\'."

    .line 335
    .line 336
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    sget p1, Lv0/h0;->h:I

    .line 340
    .line 341
    :goto_5
    return-void

    .line 342
    :pswitch_6
    instance-of v6, p1, Ljava/util/List;

    .line 343
    .line 344
    if-eqz v6, :cond_c

    .line 345
    .line 346
    check-cast p1, Ljava/util/List;

    .line 347
    .line 348
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 349
    .line 350
    .line 351
    move-result v0

    .line 352
    if-le v0, v5, :cond_d

    .line 353
    .line 354
    new-instance v0, Lv0/a;

    .line 355
    .line 356
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    check-cast v1, Ljava/lang/String;

    .line 364
    .line 365
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v4

    .line 369
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    check-cast v4, Ljava/lang/String;

    .line 373
    .line 374
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object p1

    .line 378
    check-cast p1, Ljava/lang/String;

    .line 379
    .line 380
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 384
    .line 385
    .line 386
    goto :goto_6

    .line 387
    :cond_c
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance\'."

    .line 388
    .line 389
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    :cond_d
    :goto_6
    return-void

    .line 393
    :pswitch_7
    instance-of v6, p1, Ljava/util/List;

    .line 394
    .line 395
    if-eqz v6, :cond_e

    .line 396
    .line 397
    check-cast p1, Ljava/util/List;

    .line 398
    .line 399
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 400
    .line 401
    .line 402
    move-result v0

    .line 403
    if-le v0, v5, :cond_f

    .line 404
    .line 405
    new-instance v0, Lv0/a;

    .line 406
    .line 407
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    check-cast v1, Ljava/lang/String;

    .line 415
    .line 416
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v4

    .line 420
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    check-cast v4, Ljava/lang/String;

    .line 424
    .line 425
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object p1

    .line 429
    check-cast p1, Ljava/lang/String;

    .line 430
    .line 431
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 435
    .line 436
    .line 437
    goto :goto_7

    .line 438
    :cond_e
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance\'."

    .line 439
    .line 440
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    :cond_f
    :goto_7
    return-void

    .line 444
    :pswitch_8
    instance-of v6, p1, Ljava/util/List;

    .line 445
    .line 446
    if-eqz v6, :cond_10

    .line 447
    .line 448
    check-cast p1, Ljava/util/List;

    .line 449
    .line 450
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 451
    .line 452
    .line 453
    move-result v0

    .line 454
    if-le v0, v5, :cond_11

    .line 455
    .line 456
    new-instance v0, Lv0/a;

    .line 457
    .line 458
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 463
    .line 464
    .line 465
    check-cast v1, Ljava/lang/String;

    .line 466
    .line 467
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v4

    .line 471
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    check-cast v4, Ljava/lang/String;

    .line 475
    .line 476
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object p1

    .line 480
    check-cast p1, Ljava/lang/String;

    .line 481
    .line 482
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 486
    .line 487
    .line 488
    goto :goto_8

    .line 489
    :cond_10
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance\'."

    .line 490
    .line 491
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    :cond_11
    :goto_8
    return-void

    .line 495
    :pswitch_9
    instance-of v6, p1, Ljava/util/List;

    .line 496
    .line 497
    if-eqz v6, :cond_12

    .line 498
    .line 499
    check-cast p1, Ljava/util/List;

    .line 500
    .line 501
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 502
    .line 503
    .line 504
    move-result v0

    .line 505
    if-le v0, v5, :cond_13

    .line 506
    .line 507
    new-instance v0, Lv0/a;

    .line 508
    .line 509
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    check-cast v1, Ljava/lang/String;

    .line 517
    .line 518
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v4

    .line 522
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 523
    .line 524
    .line 525
    check-cast v4, Ljava/lang/String;

    .line 526
    .line 527
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object p1

    .line 531
    check-cast p1, Ljava/lang/String;

    .line 532
    .line 533
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 537
    .line 538
    .line 539
    goto :goto_9

    .line 540
    :cond_12
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance\'."

    .line 541
    .line 542
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    :cond_13
    :goto_9
    return-void

    .line 546
    :pswitch_a
    instance-of v6, p1, Ljava/util/List;

    .line 547
    .line 548
    if-eqz v6, :cond_14

    .line 549
    .line 550
    check-cast p1, Ljava/util/List;

    .line 551
    .line 552
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 553
    .line 554
    .line 555
    move-result v0

    .line 556
    if-le v0, v5, :cond_15

    .line 557
    .line 558
    new-instance v0, Lv0/a;

    .line 559
    .line 560
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v1

    .line 564
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    check-cast v1, Ljava/lang/String;

    .line 568
    .line 569
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v4

    .line 573
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    check-cast v4, Ljava/lang/String;

    .line 577
    .line 578
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object p1

    .line 582
    check-cast p1, Ljava/lang/String;

    .line 583
    .line 584
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 585
    .line 586
    .line 587
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 588
    .line 589
    .line 590
    goto :goto_a

    .line 591
    :cond_14
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance\'."

    .line 592
    .line 593
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 594
    .line 595
    .line 596
    :cond_15
    :goto_a
    return-void

    .line 597
    :pswitch_b
    instance-of v6, p1, Ljava/util/List;

    .line 598
    .line 599
    if-eqz v6, :cond_16

    .line 600
    .line 601
    check-cast p1, Ljava/util/List;

    .line 602
    .line 603
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 604
    .line 605
    .line 606
    move-result v0

    .line 607
    if-le v0, v5, :cond_17

    .line 608
    .line 609
    new-instance v0, Lv0/a;

    .line 610
    .line 611
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 616
    .line 617
    .line 618
    check-cast v1, Ljava/lang/String;

    .line 619
    .line 620
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object v4

    .line 624
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 625
    .line 626
    .line 627
    check-cast v4, Ljava/lang/String;

    .line 628
    .line 629
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object p1

    .line 633
    check-cast p1, Ljava/lang/String;

    .line 634
    .line 635
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 636
    .line 637
    .line 638
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 639
    .line 640
    .line 641
    goto :goto_b

    .line 642
    :cond_16
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebResourceErrorCompat.pigeon_newInstance\'."

    .line 643
    .line 644
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 645
    .line 646
    .line 647
    :cond_17
    :goto_b
    return-void

    .line 648
    :pswitch_c
    instance-of v6, p1, Ljava/util/List;

    .line 649
    .line 650
    if-eqz v6, :cond_18

    .line 651
    .line 652
    check-cast p1, Ljava/util/List;

    .line 653
    .line 654
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 655
    .line 656
    .line 657
    move-result v0

    .line 658
    if-le v0, v5, :cond_19

    .line 659
    .line 660
    new-instance v0, Lv0/a;

    .line 661
    .line 662
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v1

    .line 666
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 667
    .line 668
    .line 669
    check-cast v1, Ljava/lang/String;

    .line 670
    .line 671
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v4

    .line 675
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 676
    .line 677
    .line 678
    check-cast v4, Ljava/lang/String;

    .line 679
    .line 680
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object p1

    .line 684
    check-cast p1, Ljava/lang/String;

    .line 685
    .line 686
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 687
    .line 688
    .line 689
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 690
    .line 691
    .line 692
    goto :goto_c

    .line 693
    :cond_18
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance\'."

    .line 694
    .line 695
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 696
    .line 697
    .line 698
    :cond_19
    :goto_c
    return-void

    .line 699
    :pswitch_d
    instance-of v6, p1, Ljava/util/List;

    .line 700
    .line 701
    if-eqz v6, :cond_1b

    .line 702
    .line 703
    check-cast p1, Ljava/util/List;

    .line 704
    .line 705
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 706
    .line 707
    .line 708
    move-result v0

    .line 709
    if-le v0, v5, :cond_1a

    .line 710
    .line 711
    new-instance v0, Lv0/a;

    .line 712
    .line 713
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v1

    .line 717
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 718
    .line 719
    .line 720
    check-cast v1, Ljava/lang/String;

    .line 721
    .line 722
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object v4

    .line 726
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 727
    .line 728
    .line 729
    check-cast v4, Ljava/lang/String;

    .line 730
    .line 731
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    move-result-object p1

    .line 735
    check-cast p1, Ljava/lang/String;

    .line 736
    .line 737
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 738
    .line 739
    .line 740
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 741
    .line 742
    .line 743
    sget p1, Lv0/U;->h:I

    .line 744
    .line 745
    goto :goto_d

    .line 746
    :cond_1a
    sget p1, Lv0/U;->h:I

    .line 747
    .line 748
    goto :goto_d

    .line 749
    :cond_1b
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt\'."

    .line 750
    .line 751
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 752
    .line 753
    .line 754
    sget p1, Lv0/U;->h:I

    .line 755
    .line 756
    :goto_d
    return-void

    .line 757
    :pswitch_e
    instance-of v6, p1, Ljava/util/List;

    .line 758
    .line 759
    if-eqz v6, :cond_1d

    .line 760
    .line 761
    check-cast p1, Ljava/util/List;

    .line 762
    .line 763
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 764
    .line 765
    .line 766
    move-result v0

    .line 767
    if-le v0, v5, :cond_1c

    .line 768
    .line 769
    new-instance v0, Lv0/a;

    .line 770
    .line 771
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v1

    .line 775
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 776
    .line 777
    .line 778
    check-cast v1, Ljava/lang/String;

    .line 779
    .line 780
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 781
    .line 782
    .line 783
    move-result-object v4

    .line 784
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 785
    .line 786
    .line 787
    check-cast v4, Ljava/lang/String;

    .line 788
    .line 789
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object p1

    .line 793
    check-cast p1, Ljava/lang/String;

    .line 794
    .line 795
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 796
    .line 797
    .line 798
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 799
    .line 800
    .line 801
    sget p1, Lv0/U;->h:I

    .line 802
    .line 803
    goto :goto_e

    .line 804
    :cond_1c
    sget p1, Lv0/U;->h:I

    .line 805
    .line 806
    goto :goto_e

    .line 807
    :cond_1d
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt\'."

    .line 808
    .line 809
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 810
    .line 811
    .line 812
    sget p1, Lv0/U;->h:I

    .line 813
    .line 814
    :goto_e
    return-void

    .line 815
    :pswitch_f
    instance-of v6, p1, Ljava/util/List;

    .line 816
    .line 817
    if-eqz v6, :cond_1f

    .line 818
    .line 819
    check-cast p1, Ljava/util/List;

    .line 820
    .line 821
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 822
    .line 823
    .line 824
    move-result v0

    .line 825
    if-le v0, v5, :cond_1e

    .line 826
    .line 827
    new-instance v0, Lv0/a;

    .line 828
    .line 829
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 830
    .line 831
    .line 832
    move-result-object v1

    .line 833
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 834
    .line 835
    .line 836
    check-cast v1, Ljava/lang/String;

    .line 837
    .line 838
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    move-result-object v4

    .line 842
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 843
    .line 844
    .line 845
    check-cast v4, Ljava/lang/String;

    .line 846
    .line 847
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object p1

    .line 851
    check-cast p1, Ljava/lang/String;

    .line 852
    .line 853
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 854
    .line 855
    .line 856
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 857
    .line 858
    .line 859
    sget p1, Lv0/U;->h:I

    .line 860
    .line 861
    goto :goto_f

    .line 862
    :cond_1e
    sget p1, Lv0/U;->h:I

    .line 863
    .line 864
    goto :goto_f

    .line 865
    :cond_1f
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage\'."

    .line 866
    .line 867
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 868
    .line 869
    .line 870
    sget p1, Lv0/U;->h:I

    .line 871
    .line 872
    :goto_f
    return-void

    .line 873
    :pswitch_10
    instance-of v6, p1, Ljava/util/List;

    .line 874
    .line 875
    if-eqz v6, :cond_21

    .line 876
    .line 877
    check-cast p1, Ljava/util/List;

    .line 878
    .line 879
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 880
    .line 881
    .line 882
    move-result v0

    .line 883
    if-le v0, v5, :cond_20

    .line 884
    .line 885
    new-instance v0, Lv0/a;

    .line 886
    .line 887
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 888
    .line 889
    .line 890
    move-result-object v1

    .line 891
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 892
    .line 893
    .line 894
    check-cast v1, Ljava/lang/String;

    .line 895
    .line 896
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 897
    .line 898
    .line 899
    move-result-object v4

    .line 900
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 901
    .line 902
    .line 903
    check-cast v4, Ljava/lang/String;

    .line 904
    .line 905
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 906
    .line 907
    .line 908
    move-result-object p1

    .line 909
    check-cast p1, Ljava/lang/String;

    .line 910
    .line 911
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 912
    .line 913
    .line 914
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 915
    .line 916
    .line 917
    sget p1, Lv0/U;->h:I

    .line 918
    .line 919
    goto :goto_10

    .line 920
    :cond_20
    sget p1, Lv0/U;->h:I

    .line 921
    .line 922
    goto :goto_10

    .line 923
    :cond_21
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView\'."

    .line 924
    .line 925
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 926
    .line 927
    .line 928
    sget p1, Lv0/U;->h:I

    .line 929
    .line 930
    :goto_10
    return-void

    .line 931
    :pswitch_11
    instance-of v6, p1, Ljava/util/List;

    .line 932
    .line 933
    if-eqz v6, :cond_23

    .line 934
    .line 935
    check-cast p1, Ljava/util/List;

    .line 936
    .line 937
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 938
    .line 939
    .line 940
    move-result v0

    .line 941
    if-le v0, v5, :cond_22

    .line 942
    .line 943
    new-instance v0, Lv0/a;

    .line 944
    .line 945
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 946
    .line 947
    .line 948
    move-result-object v1

    .line 949
    invoke-static {v1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 950
    .line 951
    .line 952
    check-cast v1, Ljava/lang/String;

    .line 953
    .line 954
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 955
    .line 956
    .line 957
    move-result-object v4

    .line 958
    invoke-static {v4, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 959
    .line 960
    .line 961
    check-cast v4, Ljava/lang/String;

    .line 962
    .line 963
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 964
    .line 965
    .line 966
    move-result-object p1

    .line 967
    check-cast p1, Ljava/lang/String;

    .line 968
    .line 969
    invoke-direct {v0, v1, v4, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 970
    .line 971
    .line 972
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 973
    .line 974
    .line 975
    sget p1, Lv0/U;->h:I

    .line 976
    .line 977
    goto :goto_11

    .line 978
    :cond_22
    sget p1, Lv0/U;->h:I

    .line 979
    .line 980
    goto :goto_11

    .line 981
    :cond_23
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest\'."

    .line 982
    .line 983
    invoke-static {v0, p1, v1}, LI0/h;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 984
    .line 985
    .line 986
    sget p1, Lv0/U;->h:I

    .line 987
    .line 988
    :goto_11
    return-void

    .line 989
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
        :pswitch_0
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public o(Ljava/lang/Object;LN/Q;)V
    .locals 2

    .line 1
    iget v0, p0, Lv0/H;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
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
    const-string v0, "null cannot be cast to non-null type kotlin.String"

    .line 19
    .line 20
    invoke-static {p1, v0}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    check-cast p1, Ljava/lang/String;

    .line 24
    .line 25
    :try_start_0
    invoke-static {p1}, La1/a;->r(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :goto_0
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_1
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 48
    .line 49
    invoke-static {p1, v0}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    check-cast p1, Ljava/util/List;

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const-string v0, "null cannot be cast to non-null type android.webkit.WebStorage"

    .line 60
    .line 61
    invoke-static {p1, v0}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    check-cast p1, Landroid/webkit/WebStorage;

    .line 65
    .line 66
    :try_start_1
    invoke-virtual {p1}, Landroid/webkit/WebStorage;->deleteAllData()V

    .line 67
    .line 68
    .line 69
    const/4 p1, 0x0

    .line 70
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    goto :goto_1

    .line 75
    :catchall_1
    move-exception p1

    .line 76
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    :goto_1
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :pswitch_2
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 85
    .line 86
    invoke-static {p1, v0}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    check-cast p1, Ljava/util/List;

    .line 90
    .line 91
    const/4 v0, 0x0

    .line 92
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    const-string v1, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 97
    .line 98
    invoke-static {v0, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    check-cast v0, Landroid/webkit/WebSettings;

    .line 102
    .line 103
    const/4 v1, 0x1

    .line 104
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    const-string v1, "null cannot be cast to non-null type kotlin.Boolean"

    .line 109
    .line 110
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    check-cast p1, Ljava/lang/Boolean;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    :try_start_2
    invoke-static {v0, p1}, Lv0/w;->a(Landroid/webkit/WebSettings;Z)V

    .line 120
    .line 121
    .line 122
    const/4 p1, 0x0

    .line 123
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 127
    goto :goto_2

    .line 128
    :catchall_2
    move-exception p1

    .line 129
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    :goto_2
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
