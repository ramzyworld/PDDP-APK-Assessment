.class public final Lp0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:I

.field public final g:Lp0/p;

.field public final h:Ljava/lang/Integer;

.field public final i:Ljava/lang/String;

.field public final j:LG/n;

.field public final k:[Ljava/lang/String;

.field public final l:[Lp0/o;


# direct methods
.method public constructor <init>(ZZZZZILp0/p;Ljava/lang/Integer;Ljava/lang/String;LG/n;[Ljava/lang/String;[Lp0/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lp0/o;->a:Z

    .line 5
    .line 6
    iput-boolean p2, p0, Lp0/o;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lp0/o;->c:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Lp0/o;->d:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lp0/o;->e:Z

    .line 13
    .line 14
    iput p6, p0, Lp0/o;->f:I

    .line 15
    .line 16
    iput-object p7, p0, Lp0/o;->g:Lp0/p;

    .line 17
    .line 18
    iput-object p8, p0, Lp0/o;->h:Ljava/lang/Integer;

    .line 19
    .line 20
    iput-object p9, p0, Lp0/o;->i:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p10, p0, Lp0/o;->j:LG/n;

    .line 23
    .line 24
    iput-object p11, p0, Lp0/o;->k:[Ljava/lang/String;

    .line 25
    .line 26
    iput-object p12, p0, Lp0/o;->l:[Lp0/o;

    .line 27
    .line 28
    return-void
.end method

.method public static a(Lorg/json/JSONObject;)Lp0/o;
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "username"

    .line 4
    .line 5
    const-string v2, "creditCardExpirationYear"

    .line 6
    .line 7
    const-string v3, "creditCardExpirationDate"

    .line 8
    .line 9
    const-string v4, "creditCardNumber"

    .line 10
    .line 11
    const-string v5, "gender"

    .line 12
    .line 13
    const-string v6, "creditCardExpirationDay"

    .line 14
    .line 15
    const-string v7, "creditCardSecurityCode"

    .line 16
    .line 17
    const-string v8, "newPassword"

    .line 18
    .line 19
    const-string v9, "creditCardExpirationMonth"

    .line 20
    .line 21
    const-string v12, "name"

    .line 22
    .line 23
    const/16 v16, 0x5

    .line 24
    .line 25
    const/16 v17, 0x0

    .line 26
    .line 27
    const-string v10, "inputAction"

    .line 28
    .line 29
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v10

    .line 33
    if-eqz v10, :cond_3d

    .line 34
    .line 35
    const-string v11, "fields"

    .line 36
    .line 37
    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v20

    .line 41
    if-nez v20, :cond_1

    .line 42
    .line 43
    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 44
    .line 45
    .line 46
    move-result-object v11

    .line 47
    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    .line 48
    .line 49
    .line 50
    move-result v14

    .line 51
    new-array v13, v14, [Lp0/o;

    .line 52
    .line 53
    const/4 v15, 0x0

    .line 54
    :goto_0
    if-ge v15, v14, :cond_0

    .line 55
    .line 56
    invoke-virtual {v11, v15}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 57
    .line 58
    .line 59
    move-result-object v23

    .line 60
    invoke-static/range {v23 .. v23}, Lp0/o;->a(Lorg/json/JSONObject;)Lp0/o;

    .line 61
    .line 62
    .line 63
    move-result-object v23

    .line 64
    aput-object v23, v13, v15

    .line 65
    .line 66
    const/16 v22, 0x1

    .line 67
    .line 68
    add-int/lit8 v15, v15, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    const/16 v22, 0x1

    .line 72
    .line 73
    move-object/from16 v35, v13

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    const/16 v22, 0x1

    .line 77
    .line 78
    move-object/from16 v35, v17

    .line 79
    .line 80
    :goto_1
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v11

    .line 84
    const/4 v13, 0x0

    .line 85
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v14

    .line 89
    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    .line 90
    .line 91
    .line 92
    move-result v13

    .line 93
    sparse-switch v13, :sswitch_data_0

    .line 94
    .line 95
    .line 96
    :goto_2
    const/4 v10, -0x1

    .line 97
    goto/16 :goto_3

    .line 98
    .line 99
    :sswitch_0
    const-string v13, "TextInputAction.previous"

    .line 100
    .line 101
    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v10

    .line 105
    if-nez v10, :cond_2

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_2
    const/4 v10, 0x7

    .line 109
    goto :goto_3

    .line 110
    :sswitch_1
    const-string v13, "TextInputAction.newline"

    .line 111
    .line 112
    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v10

    .line 116
    if-nez v10, :cond_3

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_3
    const/4 v10, 0x6

    .line 120
    goto :goto_3

    .line 121
    :sswitch_2
    const-string v13, "TextInputAction.go"

    .line 122
    .line 123
    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v10

    .line 127
    if-nez v10, :cond_4

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_4
    const/4 v10, 0x5

    .line 131
    goto :goto_3

    .line 132
    :sswitch_3
    const-string v13, "TextInputAction.search"

    .line 133
    .line 134
    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v10

    .line 138
    if-nez v10, :cond_5

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_5
    const/4 v10, 0x4

    .line 142
    goto :goto_3

    .line 143
    :sswitch_4
    const-string v13, "TextInputAction.send"

    .line 144
    .line 145
    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v10

    .line 149
    if-nez v10, :cond_6

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_6
    const/4 v10, 0x3

    .line 153
    goto :goto_3

    .line 154
    :sswitch_5
    const-string v13, "TextInputAction.none"

    .line 155
    .line 156
    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v10

    .line 160
    if-nez v10, :cond_7

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_7
    const/4 v10, 0x2

    .line 164
    goto :goto_3

    .line 165
    :sswitch_6
    const-string v13, "TextInputAction.next"

    .line 166
    .line 167
    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v10

    .line 171
    if-nez v10, :cond_8

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_8
    const/4 v10, 0x1

    .line 175
    goto :goto_3

    .line 176
    :sswitch_7
    const-string v13, "TextInputAction.done"

    .line 177
    .line 178
    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v10

    .line 182
    if-nez v10, :cond_9

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_9
    const/4 v10, 0x0

    .line 186
    :goto_3
    packed-switch v10, :pswitch_data_0

    .line 187
    .line 188
    .line 189
    move-object/from16 v31, v14

    .line 190
    .line 191
    const/4 v10, 0x7

    .line 192
    :goto_4
    const/4 v11, 0x6

    .line 193
    goto :goto_7

    .line 194
    :pswitch_0
    const/4 v10, 0x7

    .line 195
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 196
    .line 197
    .line 198
    move-result-object v11

    .line 199
    :goto_5
    move-object/from16 v31, v11

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :pswitch_1
    const/4 v10, 0x7

    .line 203
    goto :goto_5

    .line 204
    :pswitch_2
    const/4 v10, 0x7

    .line 205
    const/4 v11, 0x2

    .line 206
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 207
    .line 208
    .line 209
    move-result-object v13

    .line 210
    :goto_6
    move-object/from16 v31, v13

    .line 211
    .line 212
    goto :goto_4

    .line 213
    :pswitch_3
    const/4 v10, 0x7

    .line 214
    const/4 v11, 0x3

    .line 215
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 216
    .line 217
    .line 218
    move-result-object v13

    .line 219
    goto :goto_6

    .line 220
    :pswitch_4
    const/4 v10, 0x7

    .line 221
    const/4 v11, 0x4

    .line 222
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v13

    .line 226
    goto :goto_6

    .line 227
    :pswitch_5
    const/4 v10, 0x7

    .line 228
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 229
    .line 230
    .line 231
    move-result-object v11

    .line 232
    goto :goto_5

    .line 233
    :pswitch_6
    const/4 v10, 0x7

    .line 234
    const/4 v11, 0x6

    .line 235
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 236
    .line 237
    .line 238
    move-result-object v13

    .line 239
    move-object/from16 v31, v13

    .line 240
    .line 241
    :goto_7
    new-instance v13, Ljava/util/ArrayList;

    .line 242
    .line 243
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 244
    .line 245
    .line 246
    const-string v14, "contentCommitMimeTypes"

    .line 247
    .line 248
    invoke-virtual {v0, v14}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 249
    .line 250
    .line 251
    move-result v15

    .line 252
    if-eqz v15, :cond_a

    .line 253
    .line 254
    move-object/from16 v14, v17

    .line 255
    .line 256
    goto :goto_8

    .line 257
    :cond_a
    invoke-virtual {v0, v14}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 258
    .line 259
    .line 260
    move-result-object v14

    .line 261
    :goto_8
    if-eqz v14, :cond_b

    .line 262
    .line 263
    const/4 v15, 0x0

    .line 264
    :goto_9
    invoke-virtual {v14}, Lorg/json/JSONArray;->length()I

    .line 265
    .line 266
    .line 267
    move-result v10

    .line 268
    if-ge v15, v10, :cond_b

    .line 269
    .line 270
    invoke-virtual {v14, v15}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v10

    .line 274
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    const/4 v10, 0x1

    .line 278
    add-int/2addr v15, v10

    .line 279
    goto :goto_9

    .line 280
    :cond_b
    const/4 v10, 0x1

    .line 281
    new-instance v14, Lp0/o;

    .line 282
    .line 283
    const-string v15, "obscureText"

    .line 284
    .line 285
    invoke-virtual {v0, v15}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 286
    .line 287
    .line 288
    move-result v24

    .line 289
    const-string v15, "autocorrect"

    .line 290
    .line 291
    invoke-virtual {v0, v15, v10}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 292
    .line 293
    .line 294
    move-result v25

    .line 295
    const-string v10, "enableSuggestions"

    .line 296
    .line 297
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 298
    .line 299
    .line 300
    move-result v26

    .line 301
    const-string v10, "enableIMEPersonalizedLearning"

    .line 302
    .line 303
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 304
    .line 305
    .line 306
    move-result v27

    .line 307
    const-string v10, "enableDeltaModel"

    .line 308
    .line 309
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 310
    .line 311
    .line 312
    move-result v28

    .line 313
    const-string v10, "textCapitalization"

    .line 314
    .line 315
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v10

    .line 319
    const/4 v15, 0x4

    .line 320
    invoke-static {v15}, LI/j;->c(I)[I

    .line 321
    .line 322
    .line 323
    move-result-object v11

    .line 324
    array-length v15, v11

    .line 325
    move-object/from16 v36, v14

    .line 326
    .line 327
    const/4 v14, 0x0

    .line 328
    :goto_a
    if-ge v14, v15, :cond_3c

    .line 329
    .line 330
    move/from16 v23, v15

    .line 331
    .line 332
    aget v15, v11, v14

    .line 333
    .line 334
    move-object/from16 v29, v11

    .line 335
    .line 336
    const/4 v11, 0x1

    .line 337
    if-eq v15, v11, :cond_f

    .line 338
    .line 339
    const/4 v11, 0x2

    .line 340
    if-eq v15, v11, :cond_e

    .line 341
    .line 342
    const/4 v11, 0x3

    .line 343
    if-eq v15, v11, :cond_d

    .line 344
    .line 345
    const/4 v11, 0x4

    .line 346
    if-ne v15, v11, :cond_c

    .line 347
    .line 348
    const-string v19, "TextCapitalization.none"

    .line 349
    .line 350
    :goto_b
    move-object/from16 v11, v19

    .line 351
    .line 352
    goto :goto_c

    .line 353
    :cond_c
    throw v17

    .line 354
    :cond_d
    const/4 v11, 0x4

    .line 355
    const-string v19, "TextCapitalization.sentences"

    .line 356
    .line 357
    goto :goto_b

    .line 358
    :cond_e
    const/4 v11, 0x4

    .line 359
    const-string v19, "TextCapitalization.words"

    .line 360
    .line 361
    goto :goto_b

    .line 362
    :cond_f
    const/4 v11, 0x4

    .line 363
    const-string v19, "TextCapitalization.characters"

    .line 364
    .line 365
    goto :goto_b

    .line 366
    :goto_c
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    move-result v11

    .line 370
    if-eqz v11, :cond_3b

    .line 371
    .line 372
    const-string v10, "inputType"

    .line 373
    .line 374
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 375
    .line 376
    .line 377
    move-result-object v10

    .line 378
    new-instance v11, Lp0/p;

    .line 379
    .line 380
    invoke-virtual {v10, v12}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v14

    .line 384
    move/from16 v19, v15

    .line 385
    .line 386
    const/16 v18, 0xd

    .line 387
    .line 388
    invoke-static/range {v18 .. v18}, LI/j;->c(I)[I

    .line 389
    .line 390
    .line 391
    move-result-object v15

    .line 392
    move-object/from16 v32, v13

    .line 393
    .line 394
    array-length v13, v15

    .line 395
    move-object/from16 v33, v9

    .line 396
    .line 397
    const/4 v9, 0x0

    .line 398
    :goto_d
    if-ge v9, v13, :cond_3a

    .line 399
    .line 400
    move/from16 v23, v13

    .line 401
    .line 402
    aget v13, v15, v9

    .line 403
    .line 404
    packed-switch v13, :pswitch_data_1

    .line 405
    .line 406
    .line 407
    throw v17

    .line 408
    :pswitch_7
    const-string v29, "TextInputType.twitter"

    .line 409
    .line 410
    :goto_e
    move-object/from16 v34, v15

    .line 411
    .line 412
    move-object/from16 v15, v29

    .line 413
    .line 414
    goto :goto_f

    .line 415
    :pswitch_8
    const-string v29, "TextInputType.webSearch"

    .line 416
    .line 417
    goto :goto_e

    .line 418
    :pswitch_9
    const-string v29, "TextInputType.none"

    .line 419
    .line 420
    goto :goto_e

    .line 421
    :pswitch_a
    const-string v29, "TextInputType.visiblePassword"

    .line 422
    .line 423
    goto :goto_e

    .line 424
    :pswitch_b
    const-string v29, "TextInputType.url"

    .line 425
    .line 426
    goto :goto_e

    .line 427
    :pswitch_c
    const-string v29, "TextInputType.emailAddress"

    .line 428
    .line 429
    goto :goto_e

    .line 430
    :pswitch_d
    const-string v29, "TextInputType.multiline"

    .line 431
    .line 432
    goto :goto_e

    .line 433
    :pswitch_e
    const-string v29, "TextInputType.phone"

    .line 434
    .line 435
    goto :goto_e

    .line 436
    :pswitch_f
    const-string v29, "TextInputType.number"

    .line 437
    .line 438
    goto :goto_e

    .line 439
    :pswitch_10
    const-string v29, "TextInputType.address"

    .line 440
    .line 441
    goto :goto_e

    .line 442
    :pswitch_11
    const-string v29, "TextInputType.name"

    .line 443
    .line 444
    goto :goto_e

    .line 445
    :pswitch_12
    const-string v29, "TextInputType.datetime"

    .line 446
    .line 447
    goto :goto_e

    .line 448
    :pswitch_13
    const-string v29, "TextInputType.text"

    .line 449
    .line 450
    goto :goto_e

    .line 451
    :goto_f
    invoke-virtual {v15, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    move-result v15

    .line 455
    if-eqz v15, :cond_39

    .line 456
    .line 457
    const-string v9, "signed"

    .line 458
    .line 459
    const/4 v15, 0x0

    .line 460
    invoke-virtual {v10, v9, v15}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 461
    .line 462
    .line 463
    move-result v9

    .line 464
    const-string v14, "decimal"

    .line 465
    .line 466
    invoke-virtual {v10, v14, v15}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 467
    .line 468
    .line 469
    move-result v10

    .line 470
    invoke-direct {v11, v13, v9, v10}, Lp0/p;-><init>(IZZ)V

    .line 471
    .line 472
    .line 473
    const-string v9, "actionLabel"

    .line 474
    .line 475
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 476
    .line 477
    .line 478
    move-result v10

    .line 479
    if-eqz v10, :cond_10

    .line 480
    .line 481
    move-object/from16 v9, v17

    .line 482
    .line 483
    goto :goto_10

    .line 484
    :cond_10
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v9

    .line 488
    :goto_10
    const-string v10, "autofill"

    .line 489
    .line 490
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 491
    .line 492
    .line 493
    move-result v13

    .line 494
    if-eqz v13, :cond_11

    .line 495
    .line 496
    move-object/from16 v34, v9

    .line 497
    .line 498
    move-object/from16 v37, v11

    .line 499
    .line 500
    move-object/from16 v33, v17

    .line 501
    .line 502
    goto/16 :goto_19

    .line 503
    .line 504
    :cond_11
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    const-string v10, "uniqueIdentifier"

    .line 509
    .line 510
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v10

    .line 514
    const-string v13, "hints"

    .line 515
    .line 516
    invoke-virtual {v0, v13}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 517
    .line 518
    .line 519
    move-result-object v13

    .line 520
    const-string v14, "hintText"

    .line 521
    .line 522
    invoke-virtual {v0, v14}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 523
    .line 524
    .line 525
    move-result v21

    .line 526
    if-eqz v21, :cond_12

    .line 527
    .line 528
    :goto_11
    move-object/from16 v14, v17

    .line 529
    .line 530
    goto :goto_12

    .line 531
    :cond_12
    invoke-virtual {v0, v14}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v17

    .line 535
    goto :goto_11

    .line 536
    :goto_12
    const-string v15, "editingValue"

    .line 537
    .line 538
    invoke-virtual {v0, v15}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    invoke-virtual {v13}, Lorg/json/JSONArray;->length()I

    .line 543
    .line 544
    .line 545
    move-result v15

    .line 546
    new-array v15, v15, [Ljava/lang/String;

    .line 547
    .line 548
    move-object/from16 v34, v9

    .line 549
    .line 550
    move-object/from16 v37, v11

    .line 551
    .line 552
    const/4 v9, 0x0

    .line 553
    :goto_13
    invoke-virtual {v13}, Lorg/json/JSONArray;->length()I

    .line 554
    .line 555
    .line 556
    move-result v11

    .line 557
    if-ge v9, v11, :cond_38

    .line 558
    .line 559
    invoke-virtual {v13, v9}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v11

    .line 563
    move-object/from16 p0, v13

    .line 564
    .line 565
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 566
    .line 567
    move-object/from16 v23, v10

    .line 568
    .line 569
    const/16 v10, 0x1a

    .line 570
    .line 571
    if-ge v13, v10, :cond_13

    .line 572
    .line 573
    move-object/from16 v13, v33

    .line 574
    .line 575
    goto/16 :goto_18

    .line 576
    .line 577
    :cond_13
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    .line 581
    .line 582
    .line 583
    move-result v13

    .line 584
    sparse-switch v13, :sswitch_data_1

    .line 585
    .line 586
    .line 587
    :goto_14
    move-object/from16 v13, v33

    .line 588
    .line 589
    :goto_15
    const/4 v10, -0x1

    .line 590
    goto/16 :goto_17

    .line 591
    .line 592
    :sswitch_8
    const-string v13, "birthdayDay"

    .line 593
    .line 594
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 595
    .line 596
    .line 597
    move-result v13

    .line 598
    if-nez v13, :cond_14

    .line 599
    .line 600
    goto :goto_14

    .line 601
    :cond_14
    const/16 v13, 0x23

    .line 602
    .line 603
    move-object/from16 v13, v33

    .line 604
    .line 605
    const/16 v10, 0x23

    .line 606
    .line 607
    goto/16 :goto_17

    .line 608
    .line 609
    :sswitch_9
    const-string v13, "postalCode"

    .line 610
    .line 611
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 612
    .line 613
    .line 614
    move-result v13

    .line 615
    if-nez v13, :cond_15

    .line 616
    .line 617
    goto :goto_14

    .line 618
    :cond_15
    const/16 v13, 0x22

    .line 619
    .line 620
    move-object/from16 v13, v33

    .line 621
    .line 622
    const/16 v10, 0x22

    .line 623
    .line 624
    goto/16 :goto_17

    .line 625
    .line 626
    :sswitch_a
    const-string v13, "postalAddressExtended"

    .line 627
    .line 628
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 629
    .line 630
    .line 631
    move-result v13

    .line 632
    if-nez v13, :cond_16

    .line 633
    .line 634
    goto :goto_14

    .line 635
    :cond_16
    const/16 v13, 0x21

    .line 636
    .line 637
    move-object/from16 v13, v33

    .line 638
    .line 639
    const/16 v10, 0x21

    .line 640
    .line 641
    goto/16 :goto_17

    .line 642
    .line 643
    :sswitch_b
    const-string v13, "postalAddress"

    .line 644
    .line 645
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 646
    .line 647
    .line 648
    move-result v13

    .line 649
    if-nez v13, :cond_17

    .line 650
    .line 651
    goto :goto_14

    .line 652
    :cond_17
    const/16 v13, 0x20

    .line 653
    .line 654
    move-object/from16 v13, v33

    .line 655
    .line 656
    const/16 v10, 0x20

    .line 657
    .line 658
    goto/16 :goto_17

    .line 659
    .line 660
    :sswitch_c
    const-string v13, "givenName"

    .line 661
    .line 662
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    move-result v13

    .line 666
    if-nez v13, :cond_18

    .line 667
    .line 668
    goto :goto_14

    .line 669
    :cond_18
    const/16 v13, 0x1f

    .line 670
    .line 671
    move-object/from16 v13, v33

    .line 672
    .line 673
    const/16 v10, 0x1f

    .line 674
    .line 675
    goto/16 :goto_17

    .line 676
    .line 677
    :sswitch_d
    const-string v13, "password"

    .line 678
    .line 679
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 680
    .line 681
    .line 682
    move-result v13

    .line 683
    if-nez v13, :cond_19

    .line 684
    .line 685
    goto :goto_14

    .line 686
    :cond_19
    const/16 v13, 0x1e

    .line 687
    .line 688
    move-object/from16 v13, v33

    .line 689
    .line 690
    const/16 v10, 0x1e

    .line 691
    .line 692
    goto/16 :goto_17

    .line 693
    .line 694
    :sswitch_e
    const-string v13, "birthday"

    .line 695
    .line 696
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 697
    .line 698
    .line 699
    move-result v13

    .line 700
    if-nez v13, :cond_1a

    .line 701
    .line 702
    goto :goto_14

    .line 703
    :cond_1a
    const/16 v13, 0x1d

    .line 704
    .line 705
    move-object/from16 v13, v33

    .line 706
    .line 707
    const/16 v10, 0x1d

    .line 708
    .line 709
    goto/16 :goto_17

    .line 710
    .line 711
    :sswitch_f
    const-string v13, "newUsername"

    .line 712
    .line 713
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 714
    .line 715
    .line 716
    move-result v13

    .line 717
    if-nez v13, :cond_1b

    .line 718
    .line 719
    goto/16 :goto_14

    .line 720
    .line 721
    :cond_1b
    const/16 v13, 0x1c

    .line 722
    .line 723
    move-object/from16 v13, v33

    .line 724
    .line 725
    const/16 v10, 0x1c

    .line 726
    .line 727
    goto/16 :goto_17

    .line 728
    .line 729
    :sswitch_10
    const-string v13, "telephoneNumber"

    .line 730
    .line 731
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 732
    .line 733
    .line 734
    move-result v13

    .line 735
    if-nez v13, :cond_1c

    .line 736
    .line 737
    goto/16 :goto_14

    .line 738
    .line 739
    :cond_1c
    const/16 v13, 0x1b

    .line 740
    .line 741
    move-object/from16 v13, v33

    .line 742
    .line 743
    const/16 v10, 0x1b

    .line 744
    .line 745
    goto/16 :goto_17

    .line 746
    .line 747
    :sswitch_11
    const-string v13, "familyName"

    .line 748
    .line 749
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 750
    .line 751
    .line 752
    move-result v13

    .line 753
    if-nez v13, :cond_1d

    .line 754
    .line 755
    goto/16 :goto_14

    .line 756
    .line 757
    :cond_1d
    move-object/from16 v13, v33

    .line 758
    .line 759
    goto/16 :goto_17

    .line 760
    .line 761
    :sswitch_12
    const-string v13, "birthdayMonth"

    .line 762
    .line 763
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 764
    .line 765
    .line 766
    move-result v13

    .line 767
    if-nez v13, :cond_1e

    .line 768
    .line 769
    goto/16 :goto_14

    .line 770
    .line 771
    :cond_1e
    const/16 v13, 0x19

    .line 772
    .line 773
    move-object/from16 v13, v33

    .line 774
    .line 775
    const/16 v10, 0x19

    .line 776
    .line 777
    goto/16 :goto_17

    .line 778
    .line 779
    :sswitch_13
    const-string v13, "addressState"

    .line 780
    .line 781
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 782
    .line 783
    .line 784
    move-result v13

    .line 785
    if-nez v13, :cond_1f

    .line 786
    .line 787
    goto/16 :goto_14

    .line 788
    .line 789
    :cond_1f
    const/16 v13, 0x18

    .line 790
    .line 791
    move-object/from16 v13, v33

    .line 792
    .line 793
    const/16 v10, 0x18

    .line 794
    .line 795
    goto/16 :goto_17

    .line 796
    .line 797
    :sswitch_14
    const-string v13, "email"

    .line 798
    .line 799
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 800
    .line 801
    .line 802
    move-result v13

    .line 803
    if-nez v13, :cond_20

    .line 804
    .line 805
    goto/16 :goto_14

    .line 806
    .line 807
    :cond_20
    const/16 v13, 0x17

    .line 808
    .line 809
    move-object/from16 v13, v33

    .line 810
    .line 811
    const/16 v10, 0x17

    .line 812
    .line 813
    goto/16 :goto_17

    .line 814
    .line 815
    :sswitch_15
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 816
    .line 817
    .line 818
    move-result v13

    .line 819
    if-nez v13, :cond_21

    .line 820
    .line 821
    goto/16 :goto_14

    .line 822
    .line 823
    :cond_21
    const/16 v13, 0x16

    .line 824
    .line 825
    move-object/from16 v13, v33

    .line 826
    .line 827
    const/16 v10, 0x16

    .line 828
    .line 829
    goto/16 :goto_17

    .line 830
    .line 831
    :sswitch_16
    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 832
    .line 833
    .line 834
    move-result v13

    .line 835
    if-nez v13, :cond_22

    .line 836
    .line 837
    goto/16 :goto_14

    .line 838
    .line 839
    :cond_22
    const/16 v13, 0x15

    .line 840
    .line 841
    move-object/from16 v13, v33

    .line 842
    .line 843
    const/16 v10, 0x15

    .line 844
    .line 845
    goto/16 :goto_17

    .line 846
    .line 847
    :sswitch_17
    const-string v13, "telephoneNumberCountryCode"

    .line 848
    .line 849
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 850
    .line 851
    .line 852
    move-result v13

    .line 853
    if-nez v13, :cond_23

    .line 854
    .line 855
    goto/16 :goto_14

    .line 856
    .line 857
    :cond_23
    const/16 v13, 0x14

    .line 858
    .line 859
    move-object/from16 v13, v33

    .line 860
    .line 861
    const/16 v10, 0x14

    .line 862
    .line 863
    goto/16 :goto_17

    .line 864
    .line 865
    :sswitch_18
    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 866
    .line 867
    .line 868
    move-result v13

    .line 869
    if-nez v13, :cond_24

    .line 870
    .line 871
    goto/16 :goto_14

    .line 872
    .line 873
    :cond_24
    const/16 v13, 0x13

    .line 874
    .line 875
    move-object/from16 v13, v33

    .line 876
    .line 877
    const/16 v10, 0x13

    .line 878
    .line 879
    goto/16 :goto_17

    .line 880
    .line 881
    :sswitch_19
    invoke-virtual {v11, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 882
    .line 883
    .line 884
    move-result v13

    .line 885
    if-nez v13, :cond_25

    .line 886
    .line 887
    goto/16 :goto_14

    .line 888
    .line 889
    :cond_25
    const/16 v13, 0x12

    .line 890
    .line 891
    move-object/from16 v13, v33

    .line 892
    .line 893
    const/16 v10, 0x12

    .line 894
    .line 895
    goto/16 :goto_17

    .line 896
    .line 897
    :sswitch_1a
    const-string v13, "nameSuffix"

    .line 898
    .line 899
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 900
    .line 901
    .line 902
    move-result v13

    .line 903
    if-nez v13, :cond_26

    .line 904
    .line 905
    goto/16 :goto_14

    .line 906
    .line 907
    :cond_26
    const/16 v13, 0x11

    .line 908
    .line 909
    move-object/from16 v13, v33

    .line 910
    .line 911
    const/16 v10, 0x11

    .line 912
    .line 913
    goto/16 :goto_17

    .line 914
    .line 915
    :sswitch_1b
    const-string v13, "middleName"

    .line 916
    .line 917
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 918
    .line 919
    .line 920
    move-result v13

    .line 921
    if-nez v13, :cond_27

    .line 922
    .line 923
    goto/16 :goto_14

    .line 924
    .line 925
    :cond_27
    const/16 v13, 0x10

    .line 926
    .line 927
    move-object/from16 v13, v33

    .line 928
    .line 929
    const/16 v10, 0x10

    .line 930
    .line 931
    goto/16 :goto_17

    .line 932
    .line 933
    :sswitch_1c
    const-string v13, "namePrefix"

    .line 934
    .line 935
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 936
    .line 937
    .line 938
    move-result v13

    .line 939
    if-nez v13, :cond_28

    .line 940
    .line 941
    goto/16 :goto_14

    .line 942
    .line 943
    :cond_28
    const/16 v13, 0xf

    .line 944
    .line 945
    move-object/from16 v13, v33

    .line 946
    .line 947
    const/16 v10, 0xf

    .line 948
    .line 949
    goto/16 :goto_17

    .line 950
    .line 951
    :sswitch_1d
    invoke-virtual {v11, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 952
    .line 953
    .line 954
    move-result v13

    .line 955
    if-nez v13, :cond_29

    .line 956
    .line 957
    goto/16 :goto_14

    .line 958
    .line 959
    :cond_29
    const/16 v13, 0xe

    .line 960
    .line 961
    move-object/from16 v13, v33

    .line 962
    .line 963
    const/16 v10, 0xe

    .line 964
    .line 965
    goto/16 :goto_17

    .line 966
    .line 967
    :sswitch_1e
    const-string v13, "postalAddressExtendedPostalCode"

    .line 968
    .line 969
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 970
    .line 971
    .line 972
    move-result v13

    .line 973
    if-nez v13, :cond_2a

    .line 974
    .line 975
    goto/16 :goto_14

    .line 976
    .line 977
    :cond_2a
    move-object/from16 v13, v33

    .line 978
    .line 979
    const/16 v10, 0xd

    .line 980
    .line 981
    goto/16 :goto_17

    .line 982
    .line 983
    :sswitch_1f
    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 984
    .line 985
    .line 986
    move-result v13

    .line 987
    if-nez v13, :cond_2b

    .line 988
    .line 989
    goto/16 :goto_14

    .line 990
    .line 991
    :cond_2b
    const/16 v13, 0xc

    .line 992
    .line 993
    move-object/from16 v13, v33

    .line 994
    .line 995
    const/16 v10, 0xc

    .line 996
    .line 997
    goto/16 :goto_17

    .line 998
    .line 999
    :sswitch_20
    const-string v13, "addressCity"

    .line 1000
    .line 1001
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1002
    .line 1003
    .line 1004
    move-result v13

    .line 1005
    if-nez v13, :cond_2c

    .line 1006
    .line 1007
    goto/16 :goto_14

    .line 1008
    .line 1009
    :cond_2c
    const/16 v13, 0xb

    .line 1010
    .line 1011
    move-object/from16 v13, v33

    .line 1012
    .line 1013
    const/16 v10, 0xb

    .line 1014
    .line 1015
    goto/16 :goto_17

    .line 1016
    .line 1017
    :sswitch_21
    const-string v13, "middleInitial"

    .line 1018
    .line 1019
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1020
    .line 1021
    .line 1022
    move-result v13

    .line 1023
    if-nez v13, :cond_2d

    .line 1024
    .line 1025
    goto/16 :goto_14

    .line 1026
    .line 1027
    :cond_2d
    const/16 v13, 0xa

    .line 1028
    .line 1029
    move-object/from16 v13, v33

    .line 1030
    .line 1031
    const/16 v10, 0xa

    .line 1032
    .line 1033
    goto/16 :goto_17

    .line 1034
    .line 1035
    :sswitch_22
    const-string v13, "countryName"

    .line 1036
    .line 1037
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1038
    .line 1039
    .line 1040
    move-result v13

    .line 1041
    if-nez v13, :cond_2e

    .line 1042
    .line 1043
    goto/16 :goto_14

    .line 1044
    .line 1045
    :cond_2e
    const/16 v13, 0x9

    .line 1046
    .line 1047
    move-object/from16 v13, v33

    .line 1048
    .line 1049
    const/16 v10, 0x9

    .line 1050
    .line 1051
    goto/16 :goto_17

    .line 1052
    .line 1053
    :sswitch_23
    const-string v13, "telephoneNumberDevice"

    .line 1054
    .line 1055
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1056
    .line 1057
    .line 1058
    move-result v13

    .line 1059
    if-nez v13, :cond_2f

    .line 1060
    .line 1061
    goto/16 :goto_14

    .line 1062
    .line 1063
    :cond_2f
    const/16 v13, 0x8

    .line 1064
    .line 1065
    move-object/from16 v13, v33

    .line 1066
    .line 1067
    const/16 v10, 0x8

    .line 1068
    .line 1069
    goto/16 :goto_17

    .line 1070
    .line 1071
    :sswitch_24
    const-string v13, "fullStreetAddress"

    .line 1072
    .line 1073
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1074
    .line 1075
    .line 1076
    move-result v13

    .line 1077
    if-nez v13, :cond_30

    .line 1078
    .line 1079
    goto/16 :goto_14

    .line 1080
    .line 1081
    :cond_30
    move-object/from16 v13, v33

    .line 1082
    .line 1083
    const/4 v10, 0x7

    .line 1084
    goto :goto_17

    .line 1085
    :sswitch_25
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1086
    .line 1087
    .line 1088
    move-result v13

    .line 1089
    if-nez v13, :cond_31

    .line 1090
    .line 1091
    goto/16 :goto_14

    .line 1092
    .line 1093
    :cond_31
    move-object/from16 v13, v33

    .line 1094
    .line 1095
    const/4 v10, 0x6

    .line 1096
    goto :goto_17

    .line 1097
    :sswitch_26
    invoke-virtual {v11, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1098
    .line 1099
    .line 1100
    move-result v13

    .line 1101
    if-nez v13, :cond_32

    .line 1102
    .line 1103
    goto/16 :goto_14

    .line 1104
    .line 1105
    :cond_32
    move-object/from16 v13, v33

    .line 1106
    .line 1107
    const/4 v10, 0x5

    .line 1108
    goto :goto_17

    .line 1109
    :sswitch_27
    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1110
    .line 1111
    .line 1112
    move-result v13

    .line 1113
    if-nez v13, :cond_33

    .line 1114
    .line 1115
    goto/16 :goto_14

    .line 1116
    .line 1117
    :cond_33
    move-object/from16 v13, v33

    .line 1118
    .line 1119
    const/4 v10, 0x4

    .line 1120
    goto :goto_17

    .line 1121
    :sswitch_28
    const-string v13, "telephoneNumberNational"

    .line 1122
    .line 1123
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1124
    .line 1125
    .line 1126
    move-result v13

    .line 1127
    if-nez v13, :cond_34

    .line 1128
    .line 1129
    goto/16 :goto_14

    .line 1130
    .line 1131
    :cond_34
    move-object/from16 v13, v33

    .line 1132
    .line 1133
    const/4 v10, 0x3

    .line 1134
    goto :goto_17

    .line 1135
    :sswitch_29
    move-object/from16 v13, v33

    .line 1136
    .line 1137
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1138
    .line 1139
    .line 1140
    move-result v17

    .line 1141
    if-nez v17, :cond_35

    .line 1142
    .line 1143
    goto :goto_16

    .line 1144
    :cond_35
    const/4 v10, 0x2

    .line 1145
    goto :goto_17

    .line 1146
    :sswitch_2a
    move-object/from16 v13, v33

    .line 1147
    .line 1148
    const-string v10, "oneTimeCode"

    .line 1149
    .line 1150
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1151
    .line 1152
    .line 1153
    move-result v10

    .line 1154
    if-nez v10, :cond_36

    .line 1155
    .line 1156
    goto :goto_16

    .line 1157
    :cond_36
    const/4 v10, 0x1

    .line 1158
    goto :goto_17

    .line 1159
    :sswitch_2b
    move-object/from16 v13, v33

    .line 1160
    .line 1161
    const-string v10, "birthdayYear"

    .line 1162
    .line 1163
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1164
    .line 1165
    .line 1166
    move-result v10

    .line 1167
    if-nez v10, :cond_37

    .line 1168
    .line 1169
    :goto_16
    goto/16 :goto_15

    .line 1170
    .line 1171
    :cond_37
    const/4 v10, 0x0

    .line 1172
    :goto_17
    packed-switch v10, :pswitch_data_2

    .line 1173
    .line 1174
    .line 1175
    goto/16 :goto_18

    .line 1176
    .line 1177
    :pswitch_14
    const-string v11, "birthDateDay"

    .line 1178
    .line 1179
    goto/16 :goto_18

    .line 1180
    .line 1181
    :pswitch_15
    const-string v11, "postalCode"

    .line 1182
    .line 1183
    goto/16 :goto_18

    .line 1184
    .line 1185
    :pswitch_16
    const-string v11, "extendedAddress"

    .line 1186
    .line 1187
    goto/16 :goto_18

    .line 1188
    .line 1189
    :pswitch_17
    const-string v11, "postalAddress"

    .line 1190
    .line 1191
    goto/16 :goto_18

    .line 1192
    .line 1193
    :pswitch_18
    const-string v11, "personGivenName"

    .line 1194
    .line 1195
    goto/16 :goto_18

    .line 1196
    .line 1197
    :pswitch_19
    const-string v11, "password"

    .line 1198
    .line 1199
    goto/16 :goto_18

    .line 1200
    .line 1201
    :pswitch_1a
    const-string v11, "birthDateFull"

    .line 1202
    .line 1203
    goto/16 :goto_18

    .line 1204
    .line 1205
    :pswitch_1b
    const-string v11, "newUsername"

    .line 1206
    .line 1207
    goto/16 :goto_18

    .line 1208
    .line 1209
    :pswitch_1c
    const-string v11, "phoneNumber"

    .line 1210
    .line 1211
    goto/16 :goto_18

    .line 1212
    .line 1213
    :pswitch_1d
    const-string v11, "personFamilyName"

    .line 1214
    .line 1215
    goto/16 :goto_18

    .line 1216
    .line 1217
    :pswitch_1e
    const-string v11, "birthDateMonth"

    .line 1218
    .line 1219
    goto/16 :goto_18

    .line 1220
    .line 1221
    :pswitch_1f
    const-string v11, "addressRegion"

    .line 1222
    .line 1223
    goto/16 :goto_18

    .line 1224
    .line 1225
    :pswitch_20
    const-string v11, "emailAddress"

    .line 1226
    .line 1227
    goto :goto_18

    .line 1228
    :pswitch_21
    const-string v11, "personName"

    .line 1229
    .line 1230
    goto :goto_18

    .line 1231
    :pswitch_22
    move-object v11, v1

    .line 1232
    goto :goto_18

    .line 1233
    :pswitch_23
    const-string v11, "phoneCountryCode"

    .line 1234
    .line 1235
    goto :goto_18

    .line 1236
    :pswitch_24
    move-object v11, v2

    .line 1237
    goto :goto_18

    .line 1238
    :pswitch_25
    move-object v11, v3

    .line 1239
    goto :goto_18

    .line 1240
    :pswitch_26
    const-string v11, "personNameSuffix"

    .line 1241
    .line 1242
    goto :goto_18

    .line 1243
    :pswitch_27
    const-string v11, "personMiddleName"

    .line 1244
    .line 1245
    goto :goto_18

    .line 1246
    :pswitch_28
    const-string v11, "personNamePrefix"

    .line 1247
    .line 1248
    goto :goto_18

    .line 1249
    :pswitch_29
    move-object v11, v4

    .line 1250
    goto :goto_18

    .line 1251
    :pswitch_2a
    const-string v11, "extendedPostalCode"

    .line 1252
    .line 1253
    goto :goto_18

    .line 1254
    :pswitch_2b
    move-object v11, v5

    .line 1255
    goto :goto_18

    .line 1256
    :pswitch_2c
    const-string v11, "addressLocality"

    .line 1257
    .line 1258
    goto :goto_18

    .line 1259
    :pswitch_2d
    const-string v11, "personMiddleInitial"

    .line 1260
    .line 1261
    goto :goto_18

    .line 1262
    :pswitch_2e
    const-string v11, "addressCountry"

    .line 1263
    .line 1264
    goto :goto_18

    .line 1265
    :pswitch_2f
    const-string v11, "phoneNumberDevice"

    .line 1266
    .line 1267
    goto :goto_18

    .line 1268
    :pswitch_30
    const-string v11, "streetAddress"

    .line 1269
    .line 1270
    goto :goto_18

    .line 1271
    :pswitch_31
    move-object v11, v6

    .line 1272
    goto :goto_18

    .line 1273
    :pswitch_32
    move-object v11, v7

    .line 1274
    goto :goto_18

    .line 1275
    :pswitch_33
    move-object v11, v8

    .line 1276
    goto :goto_18

    .line 1277
    :pswitch_34
    const-string v11, "phoneNational"

    .line 1278
    .line 1279
    goto :goto_18

    .line 1280
    :pswitch_35
    move-object v11, v13

    .line 1281
    goto :goto_18

    .line 1282
    :pswitch_36
    const-string v11, "smsOTPCode"

    .line 1283
    .line 1284
    goto :goto_18

    .line 1285
    :pswitch_37
    const-string v11, "birthDateYear"

    .line 1286
    .line 1287
    :goto_18
    aput-object v11, v15, v9

    .line 1288
    .line 1289
    const/4 v10, 0x1

    .line 1290
    add-int/2addr v9, v10

    .line 1291
    move-object/from16 v33, v13

    .line 1292
    .line 1293
    move-object/from16 v10, v23

    .line 1294
    .line 1295
    move-object/from16 v13, p0

    .line 1296
    .line 1297
    goto/16 :goto_13

    .line 1298
    .line 1299
    :cond_38
    move-object/from16 v23, v10

    .line 1300
    .line 1301
    new-instance v1, LG/n;

    .line 1302
    .line 1303
    invoke-static {v0}, Lp0/q;->a(Lorg/json/JSONObject;)Lp0/q;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v0

    .line 1307
    move-object/from16 v2, v23

    .line 1308
    .line 1309
    invoke-direct {v1, v2, v15, v14, v0}, LG/n;-><init>(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Lp0/q;)V

    .line 1310
    .line 1311
    .line 1312
    move-object/from16 v33, v1

    .line 1313
    .line 1314
    :goto_19
    invoke-virtual/range {v32 .. v32}, Ljava/util/ArrayList;->size()I

    .line 1315
    .line 1316
    .line 1317
    move-result v0

    .line 1318
    new-array v0, v0, [Ljava/lang/String;

    .line 1319
    .line 1320
    move-object/from16 v10, v32

    .line 1321
    .line 1322
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v0

    .line 1326
    check-cast v0, [Ljava/lang/String;

    .line 1327
    .line 1328
    move-object/from16 v23, v36

    .line 1329
    .line 1330
    move/from16 v29, v19

    .line 1331
    .line 1332
    move-object/from16 v30, v37

    .line 1333
    .line 1334
    move-object/from16 v32, v34

    .line 1335
    .line 1336
    move-object/from16 v34, v0

    .line 1337
    .line 1338
    invoke-direct/range {v23 .. v35}, Lp0/o;-><init>(ZZZZZILp0/p;Ljava/lang/Integer;Ljava/lang/String;LG/n;[Ljava/lang/String;[Lp0/o;)V

    .line 1339
    .line 1340
    .line 1341
    return-object v36

    .line 1342
    :cond_39
    move-object/from16 v37, v11

    .line 1343
    .line 1344
    move-object/from16 v13, v33

    .line 1345
    .line 1346
    const/4 v15, 0x1

    .line 1347
    move-object v11, v10

    .line 1348
    move-object/from16 v10, v32

    .line 1349
    .line 1350
    add-int/2addr v9, v15

    .line 1351
    move-object v10, v11

    .line 1352
    move/from16 v13, v23

    .line 1353
    .line 1354
    move-object/from16 v15, v34

    .line 1355
    .line 1356
    move-object/from16 v11, v37

    .line 1357
    .line 1358
    goto/16 :goto_d

    .line 1359
    .line 1360
    :cond_3a
    new-instance v0, Ljava/lang/NoSuchFieldException;

    .line 1361
    .line 1362
    const-string v1, "No such TextInputType: "

    .line 1363
    .line 1364
    invoke-static {v1, v14}, LI0/h;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v1

    .line 1368
    invoke-direct {v0, v1}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 1369
    .line 1370
    .line 1371
    throw v0

    .line 1372
    :cond_3b
    const/4 v15, 0x1

    .line 1373
    const/16 v18, 0xd

    .line 1374
    .line 1375
    move-object/from16 v38, v13

    .line 1376
    .line 1377
    move-object v13, v9

    .line 1378
    move-object v9, v10

    .line 1379
    move-object/from16 v10, v38

    .line 1380
    .line 1381
    add-int/2addr v14, v15

    .line 1382
    move/from16 v15, v23

    .line 1383
    .line 1384
    move-object/from16 v11, v29

    .line 1385
    .line 1386
    move-object v10, v9

    .line 1387
    move-object v9, v13

    .line 1388
    move-object/from16 v13, v38

    .line 1389
    .line 1390
    goto/16 :goto_a

    .line 1391
    .line 1392
    :cond_3c
    move-object v9, v10

    .line 1393
    new-instance v0, Ljava/lang/NoSuchFieldException;

    .line 1394
    .line 1395
    const-string v1, "No such TextCapitalization: "

    .line 1396
    .line 1397
    invoke-static {v1, v9}, LI0/h;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v1

    .line 1401
    invoke-direct {v0, v1}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 1402
    .line 1403
    .line 1404
    throw v0

    .line 1405
    :cond_3d
    new-instance v0, Lorg/json/JSONException;

    .line 1406
    .line 1407
    const-string v1, "Configuration JSON missing \'inputAction\' property."

    .line 1408
    .line 1409
    invoke-direct {v0, v1}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    .line 1410
    .line 1411
    .line 1412
    throw v0

    .line 1413
    :sswitch_data_0
    .sparse-switch
        -0x2bf37e83 -> :sswitch_7
        -0x2bef1712 -> :sswitch_6
        -0x2beef2cd -> :sswitch_5
        -0x2becd27d -> :sswitch_4
        0x1bf830e3 -> :sswitch_3
        0x4a02ada3 -> :sswitch_2
        0x5bc225b9 -> :sswitch_1
        0x7dcba372 -> :sswitch_0
    .end sparse-switch

    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_13
        :pswitch_12
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
    .end packed-switch

    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    :sswitch_data_1
    .sparse-switch
        -0x7ab827a6 -> :sswitch_2b
        -0x72476d20 -> :sswitch_2a
        -0x6df5a7d8 -> :sswitch_29
        -0x6cd04ac1 -> :sswitch_28
        -0x6c8dd7a5 -> :sswitch_27
        -0x68c2726a -> :sswitch_26
        -0x6446fcbc -> :sswitch_25
        -0x62e1a7de -> :sswitch_24
        -0x5d6852dd -> :sswitch_23
        -0x580574bf -> :sswitch_22
        -0x5443ec11 -> :sswitch_21
        -0x521f7081 -> :sswitch_20
        -0x4a7a0d3f -> :sswitch_1f
        -0x46b1d806 -> :sswitch_1e
        -0x449b65ae -> :sswitch_1d
        -0x31d43b03 -> :sswitch_1c
        -0x30c50a40 -> :sswitch_1b
        -0x2c8af644 -> :sswitch_1a
        -0x24989afa -> :sswitch_19
        -0x248f026b -> :sswitch_18
        -0x20bc980a -> :sswitch_17
        -0xfd6772a -> :sswitch_16
        0x337a8b -> :sswitch_15
        0x5c24b9c -> :sswitch_14
        0xf1790fd -> :sswitch_13
        0x230ed603 -> :sswitch_12
        0x2f98f80f -> :sswitch_11
        0x352e686d -> :sswitch_10
        0x3b11f696 -> :sswitch_f
        0x3fbd627d -> :sswitch_e
        0x4889ba9b -> :sswitch_d
        0x578fdfa8 -> :sswitch_c
        0x631a4ca9 -> :sswitch_b
        0x728d6502 -> :sswitch_a
        0x77dfc158 -> :sswitch_9
        0x77e93bdf -> :sswitch_8
    .end sparse-switch

    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
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
    .end packed-switch
.end method
