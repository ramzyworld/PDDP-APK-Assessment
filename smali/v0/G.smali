.class public final synthetic Lv0/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq0/c;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:LG/M;


# direct methods
.method public synthetic constructor <init>(LG/M;I)V
    .locals 0

    .line 1
    iput p2, p0, Lv0/G;->e:I

    iput-object p1, p0, Lv0/G;->f:LG/M;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget v0, p0, Lv0/G;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv0/G;->f:LG/M;

    .line 7
    .line 8
    instance-of v1, p1, Ljava/util/List;

    .line 9
    .line 10
    iget-object v0, v0, LG/M;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, LH0/l;

    .line 13
    .line 14
    const-string v2, ""

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    check-cast p1, Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v3, 0x1

    .line 25
    const/4 v4, 0x0

    .line 26
    if-le v1, v3, :cond_0

    .line 27
    .line 28
    new-instance v1, Lv0/a;

    .line 29
    .line 30
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 35
    .line 36
    invoke-static {v2, v4}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    check-cast v2, Ljava/lang/String;

    .line 40
    .line 41
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-static {v3, v4}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    check-cast v3, Ljava/lang/String;

    .line 49
    .line 50
    const/4 v4, 0x2

    .line 51
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Ljava/lang/String;

    .line 56
    .line 57
    invoke-direct {v1, v2, v3, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v1}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    new-instance v1, Lv0/N;

    .line 65
    .line 66
    invoke-direct {v1, p1}, Lv0/N;-><init>(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v0, v1}, LH0/l;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    if-nez v1, :cond_1

    .line 78
    .line 79
    const-string p1, "null-error"

    .line 80
    .line 81
    const-string v1, "Flutter api returned null value for non-null return value."

    .line 82
    .line 83
    invoke-static {p1, v1, v2}, LI0/h;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lx0/c;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    new-instance v1, Lv0/N;

    .line 88
    .line 89
    invoke-direct {v1, p1}, Lv0/N;-><init>(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {v0, v1}, LH0/l;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    const-string v1, "null cannot be cast to non-null type kotlin.Boolean"

    .line 101
    .line 102
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    check-cast p1, Ljava/lang/Boolean;

    .line 106
    .line 107
    new-instance v1, Lv0/N;

    .line 108
    .line 109
    invoke-direct {v1, p1}, Lv0/N;-><init>(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-interface {v0, v1}, LH0/l;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_2
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm\'."

    .line 117
    .line 118
    const-string v1, "channel-error"

    .line 119
    .line 120
    invoke-static {v1, p1, v2}, LI0/h;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lx0/c;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    new-instance v1, Lv0/N;

    .line 125
    .line 126
    invoke-direct {v1, p1}, Lv0/N;-><init>(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-interface {v0, v1}, LH0/l;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    :goto_0
    return-void

    .line 133
    :pswitch_0
    iget-object v0, p0, Lv0/G;->f:LG/M;

    .line 134
    .line 135
    instance-of v1, p1, Ljava/util/List;

    .line 136
    .line 137
    iget-object v0, v0, LG/M;->g:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, LH0/l;

    .line 140
    .line 141
    const-string v2, ""

    .line 142
    .line 143
    if-eqz v1, :cond_5

    .line 144
    .line 145
    check-cast p1, Ljava/util/List;

    .line 146
    .line 147
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    const/4 v3, 0x1

    .line 152
    const/4 v4, 0x0

    .line 153
    if-le v1, v3, :cond_3

    .line 154
    .line 155
    new-instance v1, Lv0/a;

    .line 156
    .line 157
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 162
    .line 163
    invoke-static {v2, v4}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    check-cast v2, Ljava/lang/String;

    .line 167
    .line 168
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    invoke-static {v3, v4}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    check-cast v3, Ljava/lang/String;

    .line 176
    .line 177
    const/4 v4, 0x2

    .line 178
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    check-cast p1, Ljava/lang/String;

    .line 183
    .line 184
    invoke-direct {v1, v2, v3, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-static {v1}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    new-instance v1, Lv0/N;

    .line 192
    .line 193
    invoke-direct {v1, p1}, Lv0/N;-><init>(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    invoke-interface {v0, v1}, LH0/l;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_3
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    if-nez v1, :cond_4

    .line 205
    .line 206
    const-string p1, "null-error"

    .line 207
    .line 208
    const-string v1, "Flutter api returned null value for non-null return value."

    .line 209
    .line 210
    invoke-static {p1, v1, v2}, LI0/h;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lx0/c;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    new-instance v1, Lv0/N;

    .line 215
    .line 216
    invoke-direct {v1, p1}, Lv0/N;-><init>(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    invoke-interface {v0, v1}, LH0/l;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_4
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"

    .line 228
    .line 229
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    check-cast p1, Ljava/util/List;

    .line 233
    .line 234
    new-instance v1, Lv0/N;

    .line 235
    .line 236
    invoke-direct {v1, p1}, Lv0/N;-><init>(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    invoke-interface {v0, v1}, LH0/l;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    goto :goto_1

    .line 243
    :cond_5
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser\'."

    .line 244
    .line 245
    const-string v1, "channel-error"

    .line 246
    .line 247
    invoke-static {v1, p1, v2}, LI0/h;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lx0/c;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    new-instance v1, Lv0/N;

    .line 252
    .line 253
    invoke-direct {v1, p1}, Lv0/N;-><init>(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    invoke-interface {v0, v1}, LH0/l;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    :goto_1
    return-void

    .line 260
    :pswitch_1
    iget-object v0, p0, Lv0/G;->f:LG/M;

    .line 261
    .line 262
    instance-of v1, p1, Ljava/util/List;

    .line 263
    .line 264
    iget-object v0, v0, LG/M;->g:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast v0, LH0/l;

    .line 267
    .line 268
    if-eqz v1, :cond_7

    .line 269
    .line 270
    check-cast p1, Ljava/util/List;

    .line 271
    .line 272
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    const/4 v2, 0x1

    .line 277
    if-le v1, v2, :cond_6

    .line 278
    .line 279
    new-instance v1, Lv0/a;

    .line 280
    .line 281
    const/4 v3, 0x0

    .line 282
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 287
    .line 288
    invoke-static {v3, v4}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    check-cast v3, Ljava/lang/String;

    .line 292
    .line 293
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    invoke-static {v2, v4}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    check-cast v2, Ljava/lang/String;

    .line 301
    .line 302
    const/4 v4, 0x2

    .line 303
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    check-cast p1, Ljava/lang/String;

    .line 308
    .line 309
    invoke-direct {v1, v3, v2, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    invoke-static {v1}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    new-instance v1, Lv0/N;

    .line 317
    .line 318
    invoke-direct {v1, p1}, Lv0/N;-><init>(Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    invoke-interface {v0, v1}, LH0/l;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    goto :goto_2

    .line 325
    :cond_6
    sget-object p1, Lx0/g;->a:Lx0/g;

    .line 326
    .line 327
    new-instance v1, Lv0/N;

    .line 328
    .line 329
    invoke-direct {v1, p1}, Lv0/N;-><init>(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    invoke-interface {v0, v1}, LH0/l;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    goto :goto_2

    .line 336
    :cond_7
    const-string p1, ""

    .line 337
    .line 338
    const-string v1, "channel-error"

    .line 339
    .line 340
    const-string v2, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert\'."

    .line 341
    .line 342
    invoke-static {v1, v2, p1}, LI0/h;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lx0/c;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    new-instance v1, Lv0/N;

    .line 347
    .line 348
    invoke-direct {v1, p1}, Lv0/N;-><init>(Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    invoke-interface {v0, v1}, LH0/l;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    :goto_2
    return-void

    .line 355
    :pswitch_2
    iget-object v0, p0, Lv0/G;->f:LG/M;

    .line 356
    .line 357
    instance-of v1, p1, Ljava/util/List;

    .line 358
    .line 359
    iget-object v0, v0, LG/M;->g:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v0, LH0/l;

    .line 362
    .line 363
    if-eqz v1, :cond_9

    .line 364
    .line 365
    check-cast p1, Ljava/util/List;

    .line 366
    .line 367
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 368
    .line 369
    .line 370
    move-result v1

    .line 371
    const/4 v2, 0x0

    .line 372
    const/4 v3, 0x1

    .line 373
    if-le v1, v3, :cond_8

    .line 374
    .line 375
    new-instance v1, Lv0/a;

    .line 376
    .line 377
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 382
    .line 383
    invoke-static {v2, v4}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    check-cast v2, Ljava/lang/String;

    .line 387
    .line 388
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    invoke-static {v3, v4}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    check-cast v3, Ljava/lang/String;

    .line 396
    .line 397
    const/4 v4, 0x2

    .line 398
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object p1

    .line 402
    check-cast p1, Ljava/lang/String;

    .line 403
    .line 404
    invoke-direct {v1, v2, v3, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    invoke-static {v1}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 408
    .line 409
    .line 410
    move-result-object p1

    .line 411
    new-instance v1, Lv0/N;

    .line 412
    .line 413
    invoke-direct {v1, p1}, Lv0/N;-><init>(Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    invoke-interface {v0, v1}, LH0/l;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    goto :goto_3

    .line 420
    :cond_8
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object p1

    .line 424
    check-cast p1, Ljava/lang/String;

    .line 425
    .line 426
    new-instance v1, Lv0/N;

    .line 427
    .line 428
    invoke-direct {v1, p1}, Lv0/N;-><init>(Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    invoke-interface {v0, v1}, LH0/l;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    goto :goto_3

    .line 435
    :cond_9
    const-string p1, ""

    .line 436
    .line 437
    const-string v1, "channel-error"

    .line 438
    .line 439
    const-string v2, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt\'."

    .line 440
    .line 441
    invoke-static {v1, v2, p1}, LI0/h;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lx0/c;

    .line 442
    .line 443
    .line 444
    move-result-object p1

    .line 445
    new-instance v1, Lv0/N;

    .line 446
    .line 447
    invoke-direct {v1, p1}, Lv0/N;-><init>(Ljava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    invoke-interface {v0, v1}, LH0/l;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    :goto_3
    return-void

    .line 454
    nop

    .line 455
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
