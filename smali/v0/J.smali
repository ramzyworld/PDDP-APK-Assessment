.class public final synthetic Lv0/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq0/b;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Lv0/i;


# direct methods
.method public synthetic constructor <init>(Lv0/i;I)V
    .locals 0

    .line 1
    iput p2, p0, Lv0/J;->e:I

    iput-object p1, p0, Lv0/J;->f:Lv0/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/Object;LN/Q;)V
    .locals 5

    .line 1
    iget v0, p0, Lv0/J;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv0/J;->f:Lv0/i;

    .line 7
    .line 8
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 9
    .line 10
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    check-cast p1, Ljava/util/List;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 21
    .line 22
    invoke-static {v1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    check-cast v1, Landroid/webkit/WebSettings;

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 33
    .line 34
    invoke-static {p1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    check-cast p1, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x0

    .line 50
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    :goto_0
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_0
    iget-object v0, p0, Lv0/J;->f:Lv0/i;

    .line 65
    .line 66
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 67
    .line 68
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    check-cast p1, Ljava/util/List;

    .line 72
    .line 73
    const/4 v1, 0x0

    .line 74
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 79
    .line 80
    invoke-static {v1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    check-cast v1, Landroid/webkit/WebSettings;

    .line 84
    .line 85
    const/4 v2, 0x1

    .line 86
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 91
    .line 92
    invoke-static {p1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    check-cast p1, Ljava/lang/Boolean;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 105
    .line 106
    .line 107
    const/4 p1, 0x0

    .line 108
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 112
    goto :goto_1

    .line 113
    :catchall_1
    move-exception p1

    .line 114
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    :goto_1
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :pswitch_1
    iget-object v0, p0, Lv0/J;->f:Lv0/i;

    .line 123
    .line 124
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 125
    .line 126
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    check-cast p1, Ljava/util/List;

    .line 130
    .line 131
    const/4 v1, 0x0

    .line 132
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    const-string v3, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 137
    .line 138
    invoke-static {v2, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    check-cast v2, Landroid/webkit/WebSettings;

    .line 142
    .line 143
    const/4 v3, 0x1

    .line 144
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    const-string v4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode"

    .line 149
    .line 150
    invoke-static {p1, v4}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    check-cast p1, Lv0/u;

    .line 154
    .line 155
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-eqz p1, :cond_2

    .line 163
    .line 164
    const/4 v0, 0x2

    .line 165
    if-eq p1, v3, :cond_1

    .line 166
    .line 167
    if-eq p1, v0, :cond_0

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_0
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 171
    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_1
    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 175
    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_2
    invoke-virtual {v2, v1}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 179
    .line 180
    .line 181
    :goto_2
    const/4 p1, 0x0

    .line 182
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 183
    .line 184
    .line 185
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 186
    goto :goto_3

    .line 187
    :catchall_2
    move-exception p1

    .line 188
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    :goto_3
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :pswitch_2
    iget-object v0, p0, Lv0/J;->f:Lv0/i;

    .line 197
    .line 198
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 199
    .line 200
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    check-cast p1, Ljava/util/List;

    .line 204
    .line 205
    const/4 v1, 0x0

    .line 206
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    const-string v1, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 211
    .line 212
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    check-cast p1, Landroid/webkit/WebSettings;

    .line 216
    .line 217
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    invoke-virtual {p1}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 228
    goto :goto_4

    .line 229
    :catchall_3
    move-exception p1

    .line 230
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    :goto_4
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    return-void

    .line 238
    :pswitch_3
    iget-object v0, p0, Lv0/J;->f:Lv0/i;

    .line 239
    .line 240
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 241
    .line 242
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    check-cast p1, Ljava/util/List;

    .line 246
    .line 247
    const/4 v1, 0x0

    .line 248
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 253
    .line 254
    invoke-static {v1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    check-cast v1, Landroid/webkit/WebSettings;

    .line 258
    .line 259
    const/4 v2, 0x1

    .line 260
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    const-string v2, "null cannot be cast to non-null type kotlin.Long"

    .line 265
    .line 266
    invoke-static {p1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    check-cast p1, Ljava/lang/Long;

    .line 270
    .line 271
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 272
    .line 273
    .line 274
    move-result-wide v2

    .line 275
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    long-to-int p1, v2

    .line 279
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setTextZoom(I)V

    .line 280
    .line 281
    .line 282
    const/4 p1, 0x0

    .line 283
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 284
    .line 285
    .line 286
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 287
    goto :goto_5

    .line 288
    :catchall_4
    move-exception p1

    .line 289
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    :goto_5
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    return-void

    .line 297
    :pswitch_4
    iget-object v0, p0, Lv0/J;->f:Lv0/i;

    .line 298
    .line 299
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 300
    .line 301
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    check-cast p1, Ljava/util/List;

    .line 305
    .line 306
    const/4 v1, 0x0

    .line 307
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 312
    .line 313
    invoke-static {v1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    check-cast v1, Landroid/webkit/WebSettings;

    .line 317
    .line 318
    const/4 v2, 0x1

    .line 319
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 324
    .line 325
    invoke-static {p1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    check-cast p1, Ljava/lang/Boolean;

    .line 329
    .line 330
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 331
    .line 332
    .line 333
    move-result p1

    .line 334
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setGeolocationEnabled(Z)V

    .line 338
    .line 339
    .line 340
    const/4 p1, 0x0

    .line 341
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 342
    .line 343
    .line 344
    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 345
    goto :goto_6

    .line 346
    :catchall_5
    move-exception p1

    .line 347
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 348
    .line 349
    .line 350
    move-result-object p1

    .line 351
    :goto_6
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    return-void

    .line 355
    :pswitch_5
    iget-object v0, p0, Lv0/J;->f:Lv0/i;

    .line 356
    .line 357
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 358
    .line 359
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    check-cast p1, Ljava/util/List;

    .line 363
    .line 364
    const/4 v1, 0x0

    .line 365
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 370
    .line 371
    invoke-static {v1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    check-cast v1, Landroid/webkit/WebSettings;

    .line 375
    .line 376
    const/4 v2, 0x1

    .line 377
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object p1

    .line 381
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 382
    .line 383
    invoke-static {p1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    check-cast p1, Ljava/lang/Boolean;

    .line 387
    .line 388
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 389
    .line 390
    .line 391
    move-result p1

    .line 392
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setAllowContentAccess(Z)V

    .line 396
    .line 397
    .line 398
    const/4 p1, 0x0

    .line 399
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 400
    .line 401
    .line 402
    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 403
    goto :goto_7

    .line 404
    :catchall_6
    move-exception p1

    .line 405
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 406
    .line 407
    .line 408
    move-result-object p1

    .line 409
    :goto_7
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    return-void

    .line 413
    :pswitch_6
    iget-object v0, p0, Lv0/J;->f:Lv0/i;

    .line 414
    .line 415
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 416
    .line 417
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    check-cast p1, Ljava/util/List;

    .line 421
    .line 422
    const/4 v1, 0x0

    .line 423
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 428
    .line 429
    invoke-static {v1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    check-cast v1, Landroid/webkit/WebSettings;

    .line 433
    .line 434
    const/4 v2, 0x1

    .line 435
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object p1

    .line 439
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 440
    .line 441
    invoke-static {p1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    check-cast p1, Ljava/lang/Boolean;

    .line 445
    .line 446
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 447
    .line 448
    .line 449
    move-result p1

    .line 450
    :try_start_7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 454
    .line 455
    .line 456
    const/4 p1, 0x0

    .line 457
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 458
    .line 459
    .line 460
    move-result-object p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 461
    goto :goto_8

    .line 462
    :catchall_7
    move-exception p1

    .line 463
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 464
    .line 465
    .line 466
    move-result-object p1

    .line 467
    :goto_8
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    return-void

    .line 471
    :pswitch_7
    iget-object v0, p0, Lv0/J;->f:Lv0/i;

    .line 472
    .line 473
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 474
    .line 475
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    check-cast p1, Ljava/util/List;

    .line 479
    .line 480
    const/4 v1, 0x0

    .line 481
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 486
    .line 487
    invoke-static {v1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 488
    .line 489
    .line 490
    check-cast v1, Landroid/webkit/WebSettings;

    .line 491
    .line 492
    const/4 v2, 0x1

    .line 493
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object p1

    .line 497
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 498
    .line 499
    invoke-static {p1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    check-cast p1, Ljava/lang/Boolean;

    .line 503
    .line 504
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 505
    .line 506
    .line 507
    move-result p1

    .line 508
    :try_start_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 512
    .line 513
    .line 514
    const/4 p1, 0x0

    .line 515
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 516
    .line 517
    .line 518
    move-result-object p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 519
    goto :goto_9

    .line 520
    :catchall_8
    move-exception p1

    .line 521
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 522
    .line 523
    .line 524
    move-result-object p1

    .line 525
    :goto_9
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    return-void

    .line 529
    :pswitch_8
    iget-object v0, p0, Lv0/J;->f:Lv0/i;

    .line 530
    .line 531
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 532
    .line 533
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    check-cast p1, Ljava/util/List;

    .line 537
    .line 538
    const/4 v1, 0x0

    .line 539
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v1

    .line 543
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 544
    .line 545
    invoke-static {v1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    check-cast v1, Landroid/webkit/WebSettings;

    .line 549
    .line 550
    const/4 v2, 0x1

    .line 551
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object p1

    .line 555
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 556
    .line 557
    invoke-static {p1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    check-cast p1, Ljava/lang/Boolean;

    .line 561
    .line 562
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 563
    .line 564
    .line 565
    move-result p1

    .line 566
    :try_start_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 567
    .line 568
    .line 569
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V

    .line 570
    .line 571
    .line 572
    const/4 p1, 0x0

    .line 573
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 574
    .line 575
    .line 576
    move-result-object p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 577
    goto :goto_a

    .line 578
    :catchall_9
    move-exception p1

    .line 579
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 580
    .line 581
    .line 582
    move-result-object p1

    .line 583
    :goto_a
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 584
    .line 585
    .line 586
    return-void

    .line 587
    :pswitch_9
    iget-object v0, p0, Lv0/J;->f:Lv0/i;

    .line 588
    .line 589
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 590
    .line 591
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    check-cast p1, Ljava/util/List;

    .line 595
    .line 596
    const/4 v1, 0x0

    .line 597
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v1

    .line 601
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 602
    .line 603
    invoke-static {v1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 604
    .line 605
    .line 606
    check-cast v1, Landroid/webkit/WebSettings;

    .line 607
    .line 608
    const/4 v2, 0x1

    .line 609
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object p1

    .line 613
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 614
    .line 615
    invoke-static {p1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 616
    .line 617
    .line 618
    check-cast p1, Ljava/lang/Boolean;

    .line 619
    .line 620
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 621
    .line 622
    .line 623
    move-result p1

    .line 624
    :try_start_a
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 628
    .line 629
    .line 630
    const/4 p1, 0x0

    .line 631
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 632
    .line 633
    .line 634
    move-result-object p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 635
    goto :goto_b

    .line 636
    :catchall_a
    move-exception p1

    .line 637
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 638
    .line 639
    .line 640
    move-result-object p1

    .line 641
    :goto_b
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 642
    .line 643
    .line 644
    return-void

    .line 645
    :pswitch_a
    iget-object v0, p0, Lv0/J;->f:Lv0/i;

    .line 646
    .line 647
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 648
    .line 649
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    check-cast p1, Ljava/util/List;

    .line 653
    .line 654
    const/4 v1, 0x0

    .line 655
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 660
    .line 661
    invoke-static {v1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 662
    .line 663
    .line 664
    check-cast v1, Landroid/webkit/WebSettings;

    .line 665
    .line 666
    const/4 v2, 0x1

    .line 667
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object p1

    .line 671
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 672
    .line 673
    invoke-static {p1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 674
    .line 675
    .line 676
    check-cast p1, Ljava/lang/Boolean;

    .line 677
    .line 678
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 679
    .line 680
    .line 681
    move-result p1

    .line 682
    :try_start_b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 683
    .line 684
    .line 685
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 686
    .line 687
    .line 688
    const/4 p1, 0x0

    .line 689
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 690
    .line 691
    .line 692
    move-result-object p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 693
    goto :goto_c

    .line 694
    :catchall_b
    move-exception p1

    .line 695
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 696
    .line 697
    .line 698
    move-result-object p1

    .line 699
    :goto_c
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 700
    .line 701
    .line 702
    return-void

    .line 703
    :pswitch_b
    iget-object v0, p0, Lv0/J;->f:Lv0/i;

    .line 704
    .line 705
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 706
    .line 707
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 708
    .line 709
    .line 710
    check-cast p1, Ljava/util/List;

    .line 711
    .line 712
    const/4 v1, 0x0

    .line 713
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v1

    .line 717
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 718
    .line 719
    invoke-static {v1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 720
    .line 721
    .line 722
    check-cast v1, Landroid/webkit/WebSettings;

    .line 723
    .line 724
    const/4 v2, 0x1

    .line 725
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object p1

    .line 729
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 730
    .line 731
    invoke-static {p1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 732
    .line 733
    .line 734
    check-cast p1, Ljava/lang/Boolean;

    .line 735
    .line 736
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 737
    .line 738
    .line 739
    move-result p1

    .line 740
    :try_start_c
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 741
    .line 742
    .line 743
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 744
    .line 745
    .line 746
    const/4 p1, 0x0

    .line 747
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 748
    .line 749
    .line 750
    move-result-object p1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    .line 751
    goto :goto_d

    .line 752
    :catchall_c
    move-exception p1

    .line 753
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 754
    .line 755
    .line 756
    move-result-object p1

    .line 757
    :goto_d
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 758
    .line 759
    .line 760
    return-void

    .line 761
    :pswitch_c
    iget-object v0, p0, Lv0/J;->f:Lv0/i;

    .line 762
    .line 763
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 764
    .line 765
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 766
    .line 767
    .line 768
    check-cast p1, Ljava/util/List;

    .line 769
    .line 770
    const/4 v1, 0x0

    .line 771
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v1

    .line 775
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 776
    .line 777
    invoke-static {v1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 778
    .line 779
    .line 780
    check-cast v1, Landroid/webkit/WebSettings;

    .line 781
    .line 782
    const/4 v2, 0x1

    .line 783
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    move-result-object p1

    .line 787
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 788
    .line 789
    invoke-static {p1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 790
    .line 791
    .line 792
    check-cast p1, Ljava/lang/Boolean;

    .line 793
    .line 794
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 795
    .line 796
    .line 797
    move-result p1

    .line 798
    :try_start_d
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 799
    .line 800
    .line 801
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setMediaPlaybackRequiresUserGesture(Z)V

    .line 802
    .line 803
    .line 804
    const/4 p1, 0x0

    .line 805
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 806
    .line 807
    .line 808
    move-result-object p1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    .line 809
    goto :goto_e

    .line 810
    :catchall_d
    move-exception p1

    .line 811
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 812
    .line 813
    .line 814
    move-result-object p1

    .line 815
    :goto_e
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 816
    .line 817
    .line 818
    return-void

    .line 819
    :pswitch_d
    iget-object v0, p0, Lv0/J;->f:Lv0/i;

    .line 820
    .line 821
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 822
    .line 823
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 824
    .line 825
    .line 826
    check-cast p1, Ljava/util/List;

    .line 827
    .line 828
    const/4 v1, 0x0

    .line 829
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 830
    .line 831
    .line 832
    move-result-object v1

    .line 833
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 834
    .line 835
    invoke-static {v1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 836
    .line 837
    .line 838
    check-cast v1, Landroid/webkit/WebSettings;

    .line 839
    .line 840
    const/4 v2, 0x1

    .line 841
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 842
    .line 843
    .line 844
    move-result-object p1

    .line 845
    check-cast p1, Ljava/lang/String;

    .line 846
    .line 847
    :try_start_e
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 848
    .line 849
    .line 850
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 851
    .line 852
    .line 853
    const/4 p1, 0x0

    .line 854
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 855
    .line 856
    .line 857
    move-result-object p1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_e

    .line 858
    goto :goto_f

    .line 859
    :catchall_e
    move-exception p1

    .line 860
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 861
    .line 862
    .line 863
    move-result-object p1

    .line 864
    :goto_f
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 865
    .line 866
    .line 867
    return-void

    .line 868
    :pswitch_e
    iget-object v0, p0, Lv0/J;->f:Lv0/i;

    .line 869
    .line 870
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 871
    .line 872
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 873
    .line 874
    .line 875
    check-cast p1, Ljava/util/List;

    .line 876
    .line 877
    const/4 v1, 0x0

    .line 878
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    move-result-object v1

    .line 882
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 883
    .line 884
    invoke-static {v1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 885
    .line 886
    .line 887
    check-cast v1, Landroid/webkit/WebSettings;

    .line 888
    .line 889
    const/4 v2, 0x1

    .line 890
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    move-result-object p1

    .line 894
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 895
    .line 896
    invoke-static {p1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 897
    .line 898
    .line 899
    check-cast p1, Ljava/lang/Boolean;

    .line 900
    .line 901
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 902
    .line 903
    .line 904
    move-result p1

    .line 905
    :try_start_f
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 906
    .line 907
    .line 908
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 909
    .line 910
    .line 911
    const/4 p1, 0x0

    .line 912
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 913
    .line 914
    .line 915
    move-result-object p1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_f

    .line 916
    goto :goto_10

    .line 917
    :catchall_f
    move-exception p1

    .line 918
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 919
    .line 920
    .line 921
    move-result-object p1

    .line 922
    :goto_10
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 923
    .line 924
    .line 925
    return-void

    .line 926
    :pswitch_f
    iget-object v0, p0, Lv0/J;->f:Lv0/i;

    .line 927
    .line 928
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 929
    .line 930
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 931
    .line 932
    .line 933
    check-cast p1, Ljava/util/List;

    .line 934
    .line 935
    const/4 v1, 0x0

    .line 936
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 937
    .line 938
    .line 939
    move-result-object v1

    .line 940
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 941
    .line 942
    invoke-static {v1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 943
    .line 944
    .line 945
    check-cast v1, Landroid/webkit/WebSettings;

    .line 946
    .line 947
    const/4 v2, 0x1

    .line 948
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    move-result-object p1

    .line 952
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 953
    .line 954
    invoke-static {p1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 955
    .line 956
    .line 957
    check-cast p1, Ljava/lang/Boolean;

    .line 958
    .line 959
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 960
    .line 961
    .line 962
    move-result p1

    .line 963
    :try_start_10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 964
    .line 965
    .line 966
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 967
    .line 968
    .line 969
    const/4 p1, 0x0

    .line 970
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 971
    .line 972
    .line 973
    move-result-object p1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_10

    .line 974
    goto :goto_11

    .line 975
    :catchall_10
    move-exception p1

    .line 976
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 977
    .line 978
    .line 979
    move-result-object p1

    .line 980
    :goto_11
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 981
    .line 982
    .line 983
    return-void

    .line 984
    nop

    .line 985
    :pswitch_data_0
    .packed-switch 0x0
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
.end method
