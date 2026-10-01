.class public final Lp0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq0/k;
.implements LT0/d;


# instance fields
.field public final synthetic e:I

.field public f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/16 v0, 0xe

    iput v0, p0, Lp0/b;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 2
    iput p1, p0, Lp0/b;->e:I

    iput-object p2, p0, Lp0/b;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Li0/b;I)V
    .locals 4

    iput p2, p0, Lp0/b;->e:I

    packed-switch p2, :pswitch_data_0

    .line 3
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance p2, Lp0/b;

    const/4 v0, 0x3

    invoke-direct {p2, v0, p0}, Lp0/b;-><init>(ILjava/lang/Object;)V

    .line 5
    new-instance v0, LN/b;

    const-string v1, "flutter/mousecursor"

    sget-object v2, Lq0/o;->a:Lq0/o;

    const/16 v3, 0xa

    invoke-direct {v0, p1, v1, v2, v3}, LN/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 6
    invoke-virtual {v0, p2}, LN/b;->N(Lq0/k;)V

    return-void

    .line 7
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance p2, Lp0/b;

    const/16 v0, 0xb

    invoke-direct {p2, v0, p0}, Lp0/b;-><init>(ILjava/lang/Object;)V

    .line 9
    new-instance v0, LN/b;

    const-string v1, "flutter/spellcheck"

    sget-object v2, Lq0/o;->a:Lq0/o;

    const/16 v3, 0xa

    invoke-direct {v0, p1, v1, v2, v3}, LN/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 10
    invoke-virtual {v0, p2}, LN/b;->N(Lq0/k;)V

    return-void

    .line 11
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance p2, Lp0/b;

    const/16 v0, 0x9

    invoke-direct {p2, v0, p0}, Lp0/b;-><init>(ILjava/lang/Object;)V

    .line 13
    new-instance v0, LN/b;

    sget-object v1, Lq0/i;->a:Lq0/i;

    const-string v2, "flutter/scribe"

    const/16 v3, 0xa

    invoke-direct {v0, p1, v2, v1, v3}, LN/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 14
    invoke-virtual {v0, p2}, LN/b;->N(Lq0/k;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public constructor <init>(Lq0/f;)V
    .locals 5

    const/4 v0, 0x1

    iput v0, p0, Lp0/b;->e:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, LN/Q;

    invoke-direct {v0, p0}, LN/Q;-><init>(Lp0/b;)V

    .line 17
    new-instance v1, LN/b;

    const-string v2, "flutter/keyboard"

    sget-object v3, Lq0/o;->a:Lq0/o;

    const/16 v4, 0xa

    invoke-direct {v1, p1, v2, v3, v4}, LN/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 18
    invoke-virtual {v1, v0}, LN/b;->N(Lq0/k;)V

    return-void
.end method

.method private final d(LN/Q;Lp0/k;)V
    .locals 12

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    const-string v1, "No such clipboard content format: "

    .line 4
    .line 5
    iget-object v2, p0, Lp0/b;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, LN/Q;

    .line 8
    .line 9
    iget-object v3, v2, LN/Q;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Lio/flutter/plugin/platform/n;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v3, p1, LN/Q;->f:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Ljava/lang/String;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    const/4 v6, 0x3

    .line 26
    const/4 v7, 0x4

    .line 27
    const/4 v8, 0x2

    .line 28
    const/4 v9, 0x1

    .line 29
    const/4 v10, 0x0

    .line 30
    sparse-switch v5, :sswitch_data_0

    .line 31
    .line 32
    .line 33
    goto/16 :goto_0

    .line 34
    .line 35
    :sswitch_0
    const-string v5, "SystemChrome.setPreferredOrientations"

    .line 36
    .line 37
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    const/4 v3, 0x2

    .line 44
    goto/16 :goto_1

    .line 45
    .line 46
    :catch_0
    move-exception p1

    .line 47
    goto/16 :goto_b

    .line 48
    .line 49
    :sswitch_1
    const-string v5, "SystemChrome.setEnabledSystemUIOverlays"

    .line 50
    .line 51
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_1

    .line 56
    .line 57
    const/4 v3, 0x4

    .line 58
    goto/16 :goto_1

    .line 59
    .line 60
    :sswitch_2
    const-string v5, "Clipboard.getData"

    .line 61
    .line 62
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_1

    .line 67
    .line 68
    const/16 v3, 0xb

    .line 69
    .line 70
    goto/16 :goto_1

    .line 71
    .line 72
    :sswitch_3
    const-string v5, "SystemChrome.setSystemUIOverlayStyle"

    .line 73
    .line 74
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_1

    .line 79
    .line 80
    const/16 v3, 0x8

    .line 81
    .line 82
    goto/16 :goto_1

    .line 83
    .line 84
    :sswitch_4
    const-string v5, "SystemChrome.setEnabledSystemUIMode"

    .line 85
    .line 86
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_1

    .line 91
    .line 92
    const/4 v3, 0x5

    .line 93
    goto/16 :goto_1

    .line 94
    .line 95
    :sswitch_5
    const-string v5, "Clipboard.hasStrings"

    .line 96
    .line 97
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-eqz v3, :cond_1

    .line 102
    .line 103
    const/16 v3, 0xd

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :sswitch_6
    const-string v5, "SystemChrome.restoreSystemUIOverlays"

    .line 107
    .line 108
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-eqz v3, :cond_1

    .line 113
    .line 114
    const/4 v3, 0x7

    .line 115
    goto :goto_1

    .line 116
    :sswitch_7
    const-string v5, "SystemSound.play"

    .line 117
    .line 118
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-eqz v3, :cond_1

    .line 123
    .line 124
    const/4 v3, 0x0

    .line 125
    goto :goto_1

    .line 126
    :sswitch_8
    const-string v5, "HapticFeedback.vibrate"

    .line 127
    .line 128
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eqz v3, :cond_1

    .line 133
    .line 134
    const/4 v3, 0x1

    .line 135
    goto :goto_1

    .line 136
    :sswitch_9
    const-string v5, "SystemChrome.setApplicationSwitcherDescription"

    .line 137
    .line 138
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    if-eqz v3, :cond_1

    .line 143
    .line 144
    const/4 v3, 0x3

    .line 145
    goto :goto_1

    .line 146
    :sswitch_a
    const-string v5, "SystemChrome.setSystemUIChangeListener"

    .line 147
    .line 148
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-eqz v3, :cond_1

    .line 153
    .line 154
    const/4 v3, 0x6

    .line 155
    goto :goto_1

    .line 156
    :sswitch_b
    const-string v5, "Clipboard.setData"

    .line 157
    .line 158
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    if-eqz v3, :cond_1

    .line 163
    .line 164
    const/16 v3, 0xc

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :sswitch_c
    const-string v5, "SystemNavigator.pop"

    .line 168
    .line 169
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    if-eqz v3, :cond_1

    .line 174
    .line 175
    const/16 v3, 0xa

    .line 176
    .line 177
    goto :goto_1

    .line 178
    :sswitch_d
    const-string v5, "Share.invoke"

    .line 179
    .line 180
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    if-eqz v3, :cond_1

    .line 185
    .line 186
    const/16 v3, 0xe

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :sswitch_e
    const-string v5, "SystemNavigator.setFrameworkHandlesBack"

    .line 190
    .line 191
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v3
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 195
    if-eqz v3, :cond_1

    .line 196
    .line 197
    const/16 v3, 0x9

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_1
    :goto_0
    const/4 v3, -0x1

    .line 201
    :goto_1
    const-string v5, "text"

    .line 202
    .line 203
    const-string v11, "clipboard"

    .line 204
    .line 205
    iget-object p1, p1, LN/Q;->g:Ljava/lang/Object;

    .line 206
    .line 207
    packed-switch v3, :pswitch_data_0

    .line 208
    .line 209
    .line 210
    :try_start_1
    invoke-virtual {p2}, Lp0/k;->b()V

    .line 211
    .line 212
    .line 213
    goto/16 :goto_c

    .line 214
    .line 215
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 216
    .line 217
    iget-object v1, v2, LN/Q;->g:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v1, Lio/flutter/plugin/platform/n;

    .line 220
    .line 221
    iget-object v1, v1, Lio/flutter/plugin/platform/n;->a:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v1, Lio/flutter/plugin/platform/f;

    .line 224
    .line 225
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    new-instance v2, Landroid/content/Intent;

    .line 229
    .line 230
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 231
    .line 232
    .line 233
    const-string v3, "android.intent.action.SEND"

    .line 234
    .line 235
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 236
    .line 237
    .line 238
    const-string v3, "text/plain"

    .line 239
    .line 240
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 241
    .line 242
    .line 243
    const-string v3, "android.intent.extra.TEXT"

    .line 244
    .line 245
    invoke-virtual {v2, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 246
    .line 247
    .line 248
    invoke-static {v2, v4}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    iget-object v1, v1, Lio/flutter/plugin/platform/f;->a:Lg0/e;

    .line 253
    .line 254
    invoke-virtual {v1, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {p2, v4}, Lp0/k;->c(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    goto/16 :goto_c

    .line 261
    .line 262
    :pswitch_1
    iget-object p1, v2, LN/Q;->g:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast p1, Lio/flutter/plugin/platform/n;

    .line 265
    .line 266
    iget-object p1, p1, Lio/flutter/plugin/platform/n;->a:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast p1, Lio/flutter/plugin/platform/f;

    .line 269
    .line 270
    iget-object p1, p1, Lio/flutter/plugin/platform/f;->a:Lg0/e;

    .line 271
    .line 272
    invoke-virtual {p1, v11}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    check-cast p1, Landroid/content/ClipboardManager;

    .line 277
    .line 278
    invoke-virtual {p1}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    if-nez v1, :cond_2

    .line 283
    .line 284
    goto :goto_2

    .line 285
    :cond_2
    invoke-virtual {p1}, Landroid/content/ClipboardManager;->getPrimaryClipDescription()Landroid/content/ClipDescription;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    if-nez p1, :cond_3

    .line 290
    .line 291
    goto :goto_2

    .line 292
    :cond_3
    const-string v1, "text/*"

    .line 293
    .line 294
    invoke-virtual {p1, v1}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    .line 295
    .line 296
    .line 297
    move-result v10

    .line 298
    :goto_2
    new-instance p1, Lorg/json/JSONObject;

    .line 299
    .line 300
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 301
    .line 302
    .line 303
    const-string v1, "value"

    .line 304
    .line 305
    invoke-virtual {p1, v1, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 306
    .line 307
    .line 308
    invoke-virtual {p2, p1}, Lp0/k;->c(Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    goto/16 :goto_c

    .line 312
    .line 313
    :pswitch_2
    check-cast p1, Lorg/json/JSONObject;

    .line 314
    .line 315
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    iget-object v1, v2, LN/Q;->g:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v1, Lio/flutter/plugin/platform/n;

    .line 322
    .line 323
    iget-object v1, v1, Lio/flutter/plugin/platform/n;->a:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast v1, Lio/flutter/plugin/platform/f;

    .line 326
    .line 327
    iget-object v1, v1, Lio/flutter/plugin/platform/f;->a:Lg0/e;

    .line 328
    .line 329
    invoke-virtual {v1, v11}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    check-cast v1, Landroid/content/ClipboardManager;

    .line 334
    .line 335
    const-string v2, "text label?"

    .line 336
    .line 337
    invoke-static {v2, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    invoke-virtual {v1, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {p2, v4}, Lp0/k;->c(Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    goto/16 :goto_c

    .line 348
    .line 349
    :pswitch_3
    check-cast p1, Ljava/lang/String;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 350
    .line 351
    if-eqz p1, :cond_4

    .line 352
    .line 353
    :try_start_2
    invoke-static {p1}, Lp0/e;->a(Ljava/lang/String;)Lp0/e;

    .line 354
    .line 355
    .line 356
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 357
    goto :goto_3

    .line 358
    :catch_1
    :try_start_3
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object p1

    .line 362
    invoke-virtual {p2, v0, p1, v4}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    :cond_4
    move-object p1, v4

    .line 366
    :goto_3
    iget-object v1, v2, LN/Q;->g:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v1, Lio/flutter/plugin/platform/n;

    .line 369
    .line 370
    invoke-virtual {v1, p1}, Lio/flutter/plugin/platform/n;->f(Lp0/e;)Ljava/lang/CharSequence;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    if-eqz p1, :cond_5

    .line 375
    .line 376
    new-instance v1, Lorg/json/JSONObject;

    .line 377
    .line 378
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v1, v5, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 382
    .line 383
    .line 384
    invoke-virtual {p2, v1}, Lp0/k;->c(Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    goto/16 :goto_c

    .line 388
    .line 389
    :cond_5
    invoke-virtual {p2, v4}, Lp0/k;->c(Ljava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    goto/16 :goto_c

    .line 393
    .line 394
    :pswitch_4
    iget-object p1, v2, LN/Q;->g:Ljava/lang/Object;

    .line 395
    .line 396
    check-cast p1, Lio/flutter/plugin/platform/n;

    .line 397
    .line 398
    iget-object p1, p1, Lio/flutter/plugin/platform/n;->a:Ljava/lang/Object;

    .line 399
    .line 400
    check-cast p1, Lio/flutter/plugin/platform/f;

    .line 401
    .line 402
    iget-object v1, p1, Lio/flutter/plugin/platform/f;->c:Lg0/e;

    .line 403
    .line 404
    iget-object p1, p1, Lio/flutter/plugin/platform/f;->a:Lg0/e;

    .line 405
    .line 406
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 407
    .line 408
    .line 409
    invoke-virtual {p2, v4}, Lp0/k;->c(Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    goto/16 :goto_c

    .line 413
    .line 414
    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    .line 415
    .line 416
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 417
    .line 418
    .line 419
    move-result p1

    .line 420
    iget-object v1, v2, LN/Q;->g:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast v1, Lio/flutter/plugin/platform/n;

    .line 423
    .line 424
    iget-object v1, v1, Lio/flutter/plugin/platform/n;->a:Ljava/lang/Object;

    .line 425
    .line 426
    check-cast v1, Lio/flutter/plugin/platform/f;

    .line 427
    .line 428
    iget-object v1, v1, Lio/flutter/plugin/platform/f;->c:Lg0/e;

    .line 429
    .line 430
    if-eqz v1, :cond_6

    .line 431
    .line 432
    invoke-virtual {v1, p1}, Lg0/e;->h(Z)V

    .line 433
    .line 434
    .line 435
    :cond_6
    invoke-virtual {p2, v4}, Lp0/k;->c(Ljava/lang/Object;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    .line 436
    .line 437
    .line 438
    goto/16 :goto_c

    .line 439
    .line 440
    :pswitch_6
    :try_start_4
    check-cast p1, Lorg/json/JSONObject;

    .line 441
    .line 442
    invoke-static {v2, p1}, LN/Q;->h(LN/Q;Lorg/json/JSONObject;)Lp0/f;

    .line 443
    .line 444
    .line 445
    move-result-object p1

    .line 446
    iget-object v1, v2, LN/Q;->g:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast v1, Lio/flutter/plugin/platform/n;

    .line 449
    .line 450
    iget-object v1, v1, Lio/flutter/plugin/platform/n;->a:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast v1, Lio/flutter/plugin/platform/f;

    .line 453
    .line 454
    invoke-virtual {v1, p1}, Lio/flutter/plugin/platform/f;->a(Lp0/f;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {p2, v4}, Lp0/k;->c(Ljava/lang/Object;)V
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_4 .. :try_end_4} :catch_2

    .line 458
    .line 459
    .line 460
    goto/16 :goto_c

    .line 461
    .line 462
    :catch_2
    move-exception p1

    .line 463
    goto :goto_4

    .line 464
    :catch_3
    move-exception p1

    .line 465
    :goto_4
    :try_start_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object p1

    .line 469
    invoke-virtual {p2, v0, p1, v4}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    goto/16 :goto_c

    .line 473
    .line 474
    :pswitch_7
    iget-object p1, v2, LN/Q;->g:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast p1, Lio/flutter/plugin/platform/n;

    .line 477
    .line 478
    iget-object p1, p1, Lio/flutter/plugin/platform/n;->a:Ljava/lang/Object;

    .line 479
    .line 480
    check-cast p1, Lio/flutter/plugin/platform/f;

    .line 481
    .line 482
    invoke-virtual {p1}, Lio/flutter/plugin/platform/f;->b()V

    .line 483
    .line 484
    .line 485
    invoke-virtual {p2, v4}, Lp0/k;->c(Ljava/lang/Object;)V

    .line 486
    .line 487
    .line 488
    goto/16 :goto_c

    .line 489
    .line 490
    :pswitch_8
    iget-object p1, v2, LN/Q;->g:Ljava/lang/Object;

    .line 491
    .line 492
    check-cast p1, Lio/flutter/plugin/platform/n;

    .line 493
    .line 494
    iget-object p1, p1, Lio/flutter/plugin/platform/n;->a:Ljava/lang/Object;

    .line 495
    .line 496
    check-cast p1, Lio/flutter/plugin/platform/f;

    .line 497
    .line 498
    iget-object v1, p1, Lio/flutter/plugin/platform/f;->a:Lg0/e;

    .line 499
    .line 500
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 505
    .line 506
    .line 507
    move-result-object v1

    .line 508
    new-instance v2, Lio/flutter/plugin/platform/e;

    .line 509
    .line 510
    invoke-direct {v2, p1, v1}, Lio/flutter/plugin/platform/e;-><init>(Lio/flutter/plugin/platform/f;Landroid/view/View;)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnSystemUiVisibilityChangeListener(Landroid/view/View$OnSystemUiVisibilityChangeListener;)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {p2, v4}, Lp0/k;->c(Ljava/lang/Object;)V
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_0

    .line 517
    .line 518
    .line 519
    goto/16 :goto_c

    .line 520
    .line 521
    :pswitch_9
    :try_start_6
    check-cast p1, Ljava/lang/String;

    .line 522
    .line 523
    invoke-static {v2, p1}, LN/Q;->f(LN/Q;Ljava/lang/String;)I

    .line 524
    .line 525
    .line 526
    move-result p1

    .line 527
    iget-object v1, v2, LN/Q;->g:Ljava/lang/Object;

    .line 528
    .line 529
    check-cast v1, Lio/flutter/plugin/platform/n;

    .line 530
    .line 531
    iget-object v1, v1, Lio/flutter/plugin/platform/n;->a:Ljava/lang/Object;

    .line 532
    .line 533
    check-cast v1, Lio/flutter/plugin/platform/f;

    .line 534
    .line 535
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 536
    .line 537
    .line 538
    if-ne p1, v9, :cond_7

    .line 539
    .line 540
    const/16 p1, 0x706

    .line 541
    .line 542
    goto :goto_5

    .line 543
    :cond_7
    if-ne p1, v8, :cond_8

    .line 544
    .line 545
    const/16 p1, 0xf06

    .line 546
    .line 547
    goto :goto_5

    .line 548
    :cond_8
    if-ne p1, v6, :cond_9

    .line 549
    .line 550
    const/16 p1, 0x1706

    .line 551
    .line 552
    goto :goto_5

    .line 553
    :cond_9
    if-ne p1, v7, :cond_a

    .line 554
    .line 555
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 556
    .line 557
    const/16 v2, 0x1d

    .line 558
    .line 559
    if-lt p1, v2, :cond_a

    .line 560
    .line 561
    const/16 p1, 0x700

    .line 562
    .line 563
    :goto_5
    iput p1, v1, Lio/flutter/plugin/platform/f;->e:I

    .line 564
    .line 565
    invoke-virtual {v1}, Lio/flutter/plugin/platform/f;->b()V

    .line 566
    .line 567
    .line 568
    :cond_a
    invoke-virtual {p2, v4}, Lp0/k;->c(Ljava/lang/Object;)V
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/NoSuchFieldException; {:try_start_6 .. :try_end_6} :catch_4

    .line 569
    .line 570
    .line 571
    goto/16 :goto_c

    .line 572
    .line 573
    :catch_4
    move-exception p1

    .line 574
    goto :goto_6

    .line 575
    :catch_5
    move-exception p1

    .line 576
    :goto_6
    :try_start_7
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object p1

    .line 580
    invoke-virtual {p2, v0, p1, v4}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_0

    .line 581
    .line 582
    .line 583
    goto/16 :goto_c

    .line 584
    .line 585
    :pswitch_a
    :try_start_8
    check-cast p1, Lorg/json/JSONArray;

    .line 586
    .line 587
    invoke-static {v2, p1}, LN/Q;->e(LN/Q;Lorg/json/JSONArray;)Ljava/util/ArrayList;

    .line 588
    .line 589
    .line 590
    move-result-object p1

    .line 591
    iget-object v1, v2, LN/Q;->g:Ljava/lang/Object;

    .line 592
    .line 593
    check-cast v1, Lio/flutter/plugin/platform/n;

    .line 594
    .line 595
    invoke-virtual {v1, p1}, Lio/flutter/plugin/platform/n;->k(Ljava/util/ArrayList;)V

    .line 596
    .line 597
    .line 598
    invoke-virtual {p2, v4}, Lp0/k;->c(Ljava/lang/Object;)V
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_7
    .catch Ljava/lang/NoSuchFieldException; {:try_start_8 .. :try_end_8} :catch_6

    .line 599
    .line 600
    .line 601
    goto/16 :goto_c

    .line 602
    .line 603
    :catch_6
    move-exception p1

    .line 604
    goto :goto_7

    .line 605
    :catch_7
    move-exception p1

    .line 606
    :goto_7
    :try_start_9
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object p1

    .line 610
    invoke-virtual {p2, v0, p1, v4}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_9
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_0

    .line 611
    .line 612
    .line 613
    goto/16 :goto_c

    .line 614
    .line 615
    :pswitch_b
    :try_start_a
    check-cast p1, Lorg/json/JSONObject;

    .line 616
    .line 617
    const-string v1, "primaryColor"

    .line 618
    .line 619
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 620
    .line 621
    .line 622
    move-result v1

    .line 623
    if-eqz v1, :cond_b

    .line 624
    .line 625
    const/high16 v3, -0x1000000

    .line 626
    .line 627
    or-int/2addr v1, v3

    .line 628
    :cond_b
    const-string v3, "label"

    .line 629
    .line 630
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object p1

    .line 634
    iget-object v2, v2, LN/Q;->g:Ljava/lang/Object;

    .line 635
    .line 636
    check-cast v2, Lio/flutter/plugin/platform/n;

    .line 637
    .line 638
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 639
    .line 640
    iget-object v2, v2, Lio/flutter/plugin/platform/n;->a:Ljava/lang/Object;

    .line 641
    .line 642
    check-cast v2, Lio/flutter/plugin/platform/f;

    .line 643
    .line 644
    iget-object v2, v2, Lio/flutter/plugin/platform/f;->a:Lg0/e;

    .line 645
    .line 646
    const/16 v5, 0x1c

    .line 647
    .line 648
    if-ge v3, v5, :cond_c

    .line 649
    .line 650
    new-instance v3, Landroid/app/ActivityManager$TaskDescription;

    .line 651
    .line 652
    invoke-direct {v3, p1, v4, v1}, Landroid/app/ActivityManager$TaskDescription;-><init>(Ljava/lang/String;Landroid/graphics/Bitmap;I)V

    .line 653
    .line 654
    .line 655
    invoke-virtual {v2, v3}, Landroid/app/Activity;->setTaskDescription(Landroid/app/ActivityManager$TaskDescription;)V

    .line 656
    .line 657
    .line 658
    goto :goto_8

    .line 659
    :cond_c
    new-instance v3, Landroid/app/ActivityManager$TaskDescription;

    .line 660
    .line 661
    invoke-static {p1, v1}, LL/l;->d(Ljava/lang/String;I)Landroid/app/ActivityManager$TaskDescription;

    .line 662
    .line 663
    .line 664
    move-result-object p1

    .line 665
    invoke-virtual {v2, p1}, Landroid/app/Activity;->setTaskDescription(Landroid/app/ActivityManager$TaskDescription;)V

    .line 666
    .line 667
    .line 668
    :goto_8
    invoke-virtual {p2, v4}, Lp0/k;->c(Ljava/lang/Object;)V
    :try_end_a
    .catch Lorg/json/JSONException; {:try_start_a .. :try_end_a} :catch_8

    .line 669
    .line 670
    .line 671
    goto/16 :goto_c

    .line 672
    .line 673
    :catch_8
    move-exception p1

    .line 674
    :try_start_b
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 675
    .line 676
    .line 677
    move-result-object p1

    .line 678
    invoke-virtual {p2, v0, p1, v4}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_b
    .catch Lorg/json/JSONException; {:try_start_b .. :try_end_b} :catch_0

    .line 679
    .line 680
    .line 681
    goto/16 :goto_c

    .line 682
    .line 683
    :pswitch_c
    :try_start_c
    check-cast p1, Lorg/json/JSONArray;

    .line 684
    .line 685
    invoke-static {v2, p1}, LN/Q;->d(LN/Q;Lorg/json/JSONArray;)I

    .line 686
    .line 687
    .line 688
    move-result p1

    .line 689
    iget-object v1, v2, LN/Q;->g:Ljava/lang/Object;

    .line 690
    .line 691
    check-cast v1, Lio/flutter/plugin/platform/n;

    .line 692
    .line 693
    iget-object v1, v1, Lio/flutter/plugin/platform/n;->a:Ljava/lang/Object;

    .line 694
    .line 695
    check-cast v1, Lio/flutter/plugin/platform/f;

    .line 696
    .line 697
    iget-object v1, v1, Lio/flutter/plugin/platform/f;->a:Lg0/e;

    .line 698
    .line 699
    invoke-virtual {v1, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 700
    .line 701
    .line 702
    invoke-virtual {p2, v4}, Lp0/k;->c(Ljava/lang/Object;)V
    :try_end_c
    .catch Lorg/json/JSONException; {:try_start_c .. :try_end_c} :catch_a
    .catch Ljava/lang/NoSuchFieldException; {:try_start_c .. :try_end_c} :catch_9

    .line 703
    .line 704
    .line 705
    goto :goto_c

    .line 706
    :catch_9
    move-exception p1

    .line 707
    goto :goto_9

    .line 708
    :catch_a
    move-exception p1

    .line 709
    :goto_9
    :try_start_d
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object p1

    .line 713
    invoke-virtual {p2, v0, p1, v4}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_d
    .catch Lorg/json/JSONException; {:try_start_d .. :try_end_d} :catch_0

    .line 714
    .line 715
    .line 716
    goto :goto_c

    .line 717
    :pswitch_d
    :try_start_e
    check-cast p1, Ljava/lang/String;

    .line 718
    .line 719
    invoke-static {p1}, LI0/h;->b(Ljava/lang/String;)I

    .line 720
    .line 721
    .line 722
    move-result p1

    .line 723
    iget-object v1, v2, LN/Q;->g:Ljava/lang/Object;

    .line 724
    .line 725
    check-cast v1, Lio/flutter/plugin/platform/n;

    .line 726
    .line 727
    invoke-virtual {v1, p1}, Lio/flutter/plugin/platform/n;->l(I)V

    .line 728
    .line 729
    .line 730
    invoke-virtual {p2, v4}, Lp0/k;->c(Ljava/lang/Object;)V
    :try_end_e
    .catch Ljava/lang/NoSuchFieldException; {:try_start_e .. :try_end_e} :catch_b
    .catch Lorg/json/JSONException; {:try_start_e .. :try_end_e} :catch_0

    .line 731
    .line 732
    .line 733
    goto :goto_c

    .line 734
    :catch_b
    move-exception p1

    .line 735
    :try_start_f
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 736
    .line 737
    .line 738
    move-result-object p1

    .line 739
    invoke-virtual {p2, v0, p1, v4}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_f
    .catch Lorg/json/JSONException; {:try_start_f .. :try_end_f} :catch_0

    .line 740
    .line 741
    .line 742
    goto :goto_c

    .line 743
    :pswitch_e
    :try_start_10
    check-cast p1, Ljava/lang/String;

    .line 744
    .line 745
    invoke-static {p1}, LI0/h;->c(Ljava/lang/String;)I

    .line 746
    .line 747
    .line 748
    move-result p1

    .line 749
    iget-object v1, v2, LN/Q;->g:Ljava/lang/Object;

    .line 750
    .line 751
    check-cast v1, Lio/flutter/plugin/platform/n;

    .line 752
    .line 753
    iget-object v1, v1, Lio/flutter/plugin/platform/n;->a:Ljava/lang/Object;

    .line 754
    .line 755
    check-cast v1, Lio/flutter/plugin/platform/f;

    .line 756
    .line 757
    if-ne p1, v9, :cond_d

    .line 758
    .line 759
    iget-object p1, v1, Lio/flutter/plugin/platform/f;->a:Lg0/e;

    .line 760
    .line 761
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 762
    .line 763
    .line 764
    move-result-object p1

    .line 765
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 766
    .line 767
    .line 768
    move-result-object p1

    .line 769
    invoke-virtual {p1, v10}, Landroid/view/View;->playSoundEffect(I)V

    .line 770
    .line 771
    .line 772
    goto :goto_a

    .line 773
    :cond_d
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 774
    .line 775
    .line 776
    :goto_a
    invoke-virtual {p2, v4}, Lp0/k;->c(Ljava/lang/Object;)V
    :try_end_10
    .catch Ljava/lang/NoSuchFieldException; {:try_start_10 .. :try_end_10} :catch_c
    .catch Lorg/json/JSONException; {:try_start_10 .. :try_end_10} :catch_0

    .line 777
    .line 778
    .line 779
    goto :goto_c

    .line 780
    :catch_c
    move-exception p1

    .line 781
    :try_start_11
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 782
    .line 783
    .line 784
    move-result-object p1

    .line 785
    invoke-virtual {p2, v0, p1, v4}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_11
    .catch Lorg/json/JSONException; {:try_start_11 .. :try_end_11} :catch_0

    .line 786
    .line 787
    .line 788
    goto :goto_c

    .line 789
    :goto_b
    new-instance v1, Ljava/lang/StringBuilder;

    .line 790
    .line 791
    const-string v2, "JSON error: "

    .line 792
    .line 793
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 794
    .line 795
    .line 796
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 797
    .line 798
    .line 799
    move-result-object p1

    .line 800
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 801
    .line 802
    .line 803
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 804
    .line 805
    .line 806
    move-result-object p1

    .line 807
    invoke-virtual {p2, v0, p1, v4}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 808
    .line 809
    .line 810
    :goto_c
    return-void

    .line 811
    :sswitch_data_0
    .sparse-switch
        -0x59804db0 -> :sswitch_e
        -0x3789da79 -> :sswitch_d
        -0x2dad73d5 -> :sswitch_c
        -0x2af4a94c -> :sswitch_b
        -0x2267c49c -> :sswitch_a
        -0x20b0f718 -> :sswitch_9
        -0xebc6f23 -> :sswitch_8
        -0xcd4cf9e -> :sswitch_7
        0xe6a45af -> :sswitch_6
        0x3436a200 -> :sswitch_5
        0x4341194a -> :sswitch_4
        0x52e10221 -> :sswitch_3
        0x5a408fa8 -> :sswitch_2
        0x63cbfa4a -> :sswitch_1
        0x7e576127 -> :sswitch_0
    .end sparse-switch

    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    :pswitch_data_0
    .packed-switch 0x0
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


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lp0/b;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LN/Q;

    .line 4
    .line 5
    iget-object v1, v0, LN/Q;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ls0/a;

    .line 8
    .line 9
    sget-object v2, LN/Q;->i:Lg0/D;

    .line 10
    .line 11
    const/16 v3, 0x3e8

    .line 12
    .line 13
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    new-instance v2, Lg0/D;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    const/16 v4, 0x3f2

    .line 25
    .line 26
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const-string v5, "alias"

    .line 31
    .line 32
    invoke-virtual {v2, v5, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    const/16 v4, 0x3f5

    .line 36
    .line 37
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    const-string v5, "allScroll"

    .line 42
    .line 43
    invoke-virtual {v2, v5, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    const-string v5, "basic"

    .line 47
    .line 48
    invoke-virtual {v2, v5, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    const/16 v3, 0x3ee

    .line 52
    .line 53
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    const-string v5, "cell"

    .line 58
    .line 59
    invoke-virtual {v2, v5, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    const/16 v3, 0x3ea

    .line 63
    .line 64
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    const-string v5, "click"

    .line 69
    .line 70
    invoke-virtual {v2, v5, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    const/16 v3, 0x3e9

    .line 74
    .line 75
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    const-string v5, "contextMenu"

    .line 80
    .line 81
    invoke-virtual {v2, v5, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    const/16 v3, 0x3f3

    .line 85
    .line 86
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    const-string v5, "copy"

    .line 91
    .line 92
    invoke-virtual {v2, v5, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    const/16 v3, 0x3f4

    .line 96
    .line 97
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    const-string v5, "forbidden"

    .line 102
    .line 103
    invoke-virtual {v2, v5, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    const/16 v5, 0x3fc

    .line 107
    .line 108
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    const-string v6, "grab"

    .line 113
    .line 114
    invoke-virtual {v2, v6, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    const/16 v5, 0x3fd

    .line 118
    .line 119
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    const-string v6, "grabbing"

    .line 124
    .line 125
    invoke-virtual {v2, v6, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    const/16 v5, 0x3eb

    .line 129
    .line 130
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    const-string v6, "help"

    .line 135
    .line 136
    invoke-virtual {v2, v6, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    const-string v5, "move"

    .line 140
    .line 141
    invoke-virtual {v2, v5, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    const/4 v4, 0x0

    .line 145
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    const-string v5, "none"

    .line 150
    .line 151
    invoke-virtual {v2, v5, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    const-string v4, "noDrop"

    .line 155
    .line 156
    invoke-virtual {v2, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    const/16 v3, 0x3ef

    .line 160
    .line 161
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    const-string v4, "precise"

    .line 166
    .line 167
    invoke-virtual {v2, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    const/16 v3, 0x3f0

    .line 171
    .line 172
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    const-string v4, "text"

    .line 177
    .line 178
    invoke-virtual {v2, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    const/16 v3, 0x3f6

    .line 182
    .line 183
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    const-string v4, "resizeColumn"

    .line 188
    .line 189
    invoke-virtual {v2, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    const/16 v4, 0x3f7

    .line 193
    .line 194
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    const-string v5, "resizeDown"

    .line 199
    .line 200
    invoke-virtual {v2, v5, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    const/16 v5, 0x3f8

    .line 204
    .line 205
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    const-string v6, "resizeUpLeft"

    .line 210
    .line 211
    invoke-virtual {v2, v6, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    const/16 v7, 0x3f9

    .line 215
    .line 216
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    const-string v8, "resizeDownRight"

    .line 221
    .line 222
    invoke-virtual {v2, v8, v7}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    const-string v8, "resizeLeft"

    .line 226
    .line 227
    invoke-virtual {v2, v8, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    const-string v8, "resizeLeftRight"

    .line 231
    .line 232
    invoke-virtual {v2, v8, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    const-string v8, "resizeRight"

    .line 236
    .line 237
    invoke-virtual {v2, v8, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    const-string v3, "resizeRow"

    .line 241
    .line 242
    invoke-virtual {v2, v3, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    const-string v3, "resizeUp"

    .line 246
    .line 247
    invoke-virtual {v2, v3, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    const-string v3, "resizeUpDown"

    .line 251
    .line 252
    invoke-virtual {v2, v3, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2, v6, v7}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    const-string v3, "resizeUpRight"

    .line 259
    .line 260
    invoke-virtual {v2, v3, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    const-string v3, "resizeUpLeftDownRight"

    .line 264
    .line 265
    invoke-virtual {v2, v3, v7}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    const-string v3, "resizeUpRightDownLeft"

    .line 269
    .line 270
    invoke-virtual {v2, v3, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    const/16 v3, 0x3f1

    .line 274
    .line 275
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    const-string v4, "verticalText"

    .line 280
    .line 281
    invoke-virtual {v2, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    const/16 v3, 0x3ec

    .line 285
    .line 286
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    const-string v4, "wait"

    .line 291
    .line 292
    invoke-virtual {v2, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    const/16 v3, 0x3fa

    .line 296
    .line 297
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    const-string v4, "zoomIn"

    .line 302
    .line 303
    invoke-virtual {v2, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    const/16 v3, 0x3fb

    .line 307
    .line 308
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    const-string v4, "zoomOut"

    .line 313
    .line 314
    invoke-virtual {v2, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    sput-object v2, LN/Q;->i:Lg0/D;

    .line 318
    .line 319
    :cond_0
    sget-object v2, LN/Q;->i:Lg0/D;

    .line 320
    .line 321
    invoke-static {v2, p1}, LL/a;->k(Lg0/D;Ljava/lang/String;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    check-cast p1, Ljava/lang/Integer;

    .line 326
    .line 327
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 328
    .line 329
    .line 330
    move-result p1

    .line 331
    iget-object v0, v0, LN/Q;->f:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v0, Ls0/a;

    .line 334
    .line 335
    check-cast v0, Lg0/q;

    .line 336
    .line 337
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-static {v0, p1}, LL/a;->h(Landroid/content/Context;I)Landroid/view/PointerIcon;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    invoke-interface {v1, p1}, Ls0/a;->setPointerIcon(Landroid/view/PointerIcon;)V

    .line 346
    .line 347
    .line 348
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lp0/b;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr0/b;

    .line 4
    .line 5
    iget-object v1, v0, Lr0/b;->b:Lg0/e;

    .line 6
    .line 7
    iget-object v0, v0, Lr0/b;->b:Lg0/e;

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-static {p2}, Lr0/b;->a(Ljava/lang/String;)Ljava/util/Locale;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    new-instance v1, Landroid/content/res/Configuration;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-direct {v1, v2}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p2}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v2, "string"

    .line 44
    .line 45
    invoke-virtual {v0, p1, v2, p2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    const/4 p1, 0x0

    .line 61
    :goto_0
    return-object p1
.end method

.method public c(LN/Q;Lp0/k;)V
    .locals 42

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v4, "height"

    .line 8
    .line 9
    const-string v5, "width"

    .line 10
    .line 11
    const/4 v12, 0x3

    .line 12
    const/4 v14, 0x2

    .line 13
    const-string v15, "error"

    .line 14
    .line 15
    const/4 v11, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x1

    .line 18
    iget v8, v1, Lp0/b;->e:I

    .line 19
    .line 20
    packed-switch v8, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    :pswitch_0
    const-string v8, "data"

    .line 24
    .line 25
    iget-object v9, v1, Lp0/b;->f:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v9, LN/Q;

    .line 28
    .line 29
    iget-object v10, v9, LN/Q;->g:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v10, LD/j;

    .line 32
    .line 33
    if-nez v10, :cond_0

    .line 34
    .line 35
    goto/16 :goto_e

    .line 36
    .line 37
    :cond_0
    iget-object v10, v0, LN/Q;->f:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v10, Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    const/16 v13, 0x1a

    .line 45
    .line 46
    iget-object v0, v0, LN/Q;->g:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v22

    .line 52
    sparse-switch v22, :sswitch_data_0

    .line 53
    .line 54
    .line 55
    :goto_0
    const/16 v16, -0x1

    .line 56
    .line 57
    goto/16 :goto_1

    .line 58
    .line 59
    :sswitch_0
    const-string v3, "TextInput.requestAutofill"

    .line 60
    .line 61
    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-nez v3, :cond_1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    const/16 v16, 0x9

    .line 69
    .line 70
    goto/16 :goto_1

    .line 71
    .line 72
    :sswitch_1
    const-string v3, "TextInput.clearClient"

    .line 73
    .line 74
    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-nez v3, :cond_2

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    const/16 v16, 0x8

    .line 82
    .line 83
    goto/16 :goto_1

    .line 84
    .line 85
    :sswitch_2
    const-string v3, "TextInput.finishAutofillContext"

    .line 86
    .line 87
    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-nez v3, :cond_3

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    const/16 v16, 0x7

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :sswitch_3
    const-string v3, "TextInput.setEditableSizeAndTransform"

    .line 98
    .line 99
    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-nez v3, :cond_4

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    const/16 v16, 0x6

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :sswitch_4
    const-string v3, "TextInput.sendAppPrivateCommand"

    .line 110
    .line 111
    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-nez v3, :cond_5

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_5
    const/16 v16, 0x5

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :sswitch_5
    const-string v3, "TextInput.show"

    .line 122
    .line 123
    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-nez v3, :cond_6

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_6
    const/16 v16, 0x4

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :sswitch_6
    const-string v3, "TextInput.hide"

    .line 134
    .line 135
    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    if-nez v3, :cond_7

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_7
    const/16 v16, 0x3

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :sswitch_7
    const-string v3, "TextInput.setClient"

    .line 146
    .line 147
    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    if-nez v3, :cond_8

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_8
    const/16 v16, 0x2

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :sswitch_8
    const-string v3, "TextInput.setEditingState"

    .line 158
    .line 159
    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-nez v3, :cond_9

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_9
    const/16 v16, 0x1

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :sswitch_9
    const-string v3, "TextInput.setPlatformViewClient"

    .line 170
    .line 171
    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    if-nez v3, :cond_a

    .line 176
    .line 177
    goto :goto_0

    .line 178
    :cond_a
    const/16 v16, 0x0

    .line 179
    .line 180
    :goto_1
    packed-switch v16, :pswitch_data_1

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {p2 .. p2}, Lp0/k;->b()V

    .line 184
    .line 185
    .line 186
    goto/16 :goto_e

    .line 187
    .line 188
    :pswitch_1
    iget-object v0, v9, LN/Q;->g:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v0, LD/j;

    .line 191
    .line 192
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 193
    .line 194
    iget-object v0, v0, LD/j;->f:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v0, Lio/flutter/plugin/editing/j;

    .line 197
    .line 198
    if-lt v3, v13, :cond_b

    .line 199
    .line 200
    iget-object v3, v0, Lio/flutter/plugin/editing/j;->c:Landroid/view/autofill/AutofillManager;

    .line 201
    .line 202
    if-eqz v3, :cond_c

    .line 203
    .line 204
    iget-object v3, v0, Lio/flutter/plugin/editing/j;->g:Landroid/util/SparseArray;

    .line 205
    .line 206
    if-eqz v3, :cond_c

    .line 207
    .line 208
    iget-object v3, v0, Lio/flutter/plugin/editing/j;->f:Lp0/o;

    .line 209
    .line 210
    iget-object v3, v3, Lp0/o;->j:LG/n;

    .line 211
    .line 212
    iget-object v3, v3, LG/n;->a:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v3, Ljava/lang/String;

    .line 215
    .line 216
    new-array v4, v14, [I

    .line 217
    .line 218
    iget-object v5, v0, Lio/flutter/plugin/editing/j;->a:Landroid/view/View;

    .line 219
    .line 220
    invoke-virtual {v5, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 221
    .line 222
    .line 223
    new-instance v8, Landroid/graphics/Rect;

    .line 224
    .line 225
    iget-object v9, v0, Lio/flutter/plugin/editing/j;->l:Landroid/graphics/Rect;

    .line 226
    .line 227
    invoke-direct {v8, v9}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 228
    .line 229
    .line 230
    aget v9, v4, v11

    .line 231
    .line 232
    aget v4, v4, v7

    .line 233
    .line 234
    invoke-virtual {v8, v9, v4}, Landroid/graphics/Rect;->offset(II)V

    .line 235
    .line 236
    .line 237
    iget-object v0, v0, Lio/flutter/plugin/editing/j;->c:Landroid/view/autofill/AutofillManager;

    .line 238
    .line 239
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    invoke-static {v0, v5, v3, v8}, LT/d;->u(Landroid/view/autofill/AutofillManager;Landroid/view/View;ILandroid/graphics/Rect;)V

    .line 244
    .line 245
    .line 246
    goto :goto_2

    .line 247
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    :cond_c
    :goto_2
    invoke-virtual {v2, v6}, Lp0/k;->c(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    goto/16 :goto_e

    .line 254
    .line 255
    :pswitch_2
    iget-object v0, v9, LN/Q;->g:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v0, LD/j;

    .line 258
    .line 259
    iget-object v0, v0, LD/j;->f:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v0, Lio/flutter/plugin/editing/j;

    .line 262
    .line 263
    iget-object v3, v0, Lio/flutter/plugin/editing/j;->e:LN/n;

    .line 264
    .line 265
    iget v3, v3, LN/n;->b:I

    .line 266
    .line 267
    if-ne v3, v12, :cond_d

    .line 268
    .line 269
    goto :goto_3

    .line 270
    :cond_d
    iget-object v3, v0, Lio/flutter/plugin/editing/j;->h:Lio/flutter/plugin/editing/e;

    .line 271
    .line 272
    invoke-virtual {v3, v0}, Lio/flutter/plugin/editing/e;->e(Lio/flutter/plugin/editing/d;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0}, Lio/flutter/plugin/editing/j;->d()V

    .line 276
    .line 277
    .line 278
    iput-object v6, v0, Lio/flutter/plugin/editing/j;->f:Lp0/o;

    .line 279
    .line 280
    invoke-virtual {v0, v6}, Lio/flutter/plugin/editing/j;->e(Lp0/o;)V

    .line 281
    .line 282
    .line 283
    new-instance v3, LN/n;

    .line 284
    .line 285
    invoke-direct {v3, v7, v11}, LN/n;-><init>(II)V

    .line 286
    .line 287
    .line 288
    iput-object v3, v0, Lio/flutter/plugin/editing/j;->e:LN/n;

    .line 289
    .line 290
    iput-object v6, v0, Lio/flutter/plugin/editing/j;->l:Landroid/graphics/Rect;

    .line 291
    .line 292
    :goto_3
    invoke-virtual {v2, v6}, Lp0/k;->c(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    goto/16 :goto_e

    .line 296
    .line 297
    :pswitch_3
    iget-object v3, v9, LN/Q;->g:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v3, LD/j;

    .line 300
    .line 301
    check-cast v0, Ljava/lang/Boolean;

    .line 302
    .line 303
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 308
    .line 309
    if-lt v4, v13, :cond_10

    .line 310
    .line 311
    iget-object v3, v3, LD/j;->f:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v3, Lio/flutter/plugin/editing/j;

    .line 314
    .line 315
    iget-object v3, v3, Lio/flutter/plugin/editing/j;->c:Landroid/view/autofill/AutofillManager;

    .line 316
    .line 317
    if-nez v3, :cond_e

    .line 318
    .line 319
    goto :goto_4

    .line 320
    :cond_e
    if-eqz v0, :cond_f

    .line 321
    .line 322
    invoke-static {v3}, LT/d;->s(Landroid/view/autofill/AutofillManager;)V

    .line 323
    .line 324
    .line 325
    goto :goto_4

    .line 326
    :cond_f
    invoke-static {v3}, LT/d;->D(Landroid/view/autofill/AutofillManager;)V

    .line 327
    .line 328
    .line 329
    goto :goto_4

    .line 330
    :cond_10
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    :goto_4
    invoke-virtual {v2, v6}, Lp0/k;->c(Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    goto/16 :goto_e

    .line 337
    .line 338
    :pswitch_4
    :try_start_0
    check-cast v0, Lorg/json/JSONObject;

    .line 339
    .line 340
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    .line 341
    .line 342
    .line 343
    move-result-wide v17

    .line 344
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    .line 345
    .line 346
    .line 347
    move-result-wide v19

    .line 348
    const-string v3, "transform"

    .line 349
    .line 350
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    const/16 v3, 0x10

    .line 355
    .line 356
    new-array v4, v3, [D

    .line 357
    .line 358
    :goto_5
    if-ge v11, v3, :cond_11

    .line 359
    .line 360
    invoke-virtual {v0, v11}, Lorg/json/JSONArray;->getDouble(I)D

    .line 361
    .line 362
    .line 363
    move-result-wide v12

    .line 364
    aput-wide v12, v4, v11

    .line 365
    .line 366
    add-int/2addr v11, v7

    .line 367
    goto :goto_5

    .line 368
    :catch_0
    move-exception v0

    .line 369
    goto :goto_6

    .line 370
    :cond_11
    iget-object v0, v9, LN/Q;->g:Ljava/lang/Object;

    .line 371
    .line 372
    move-object/from16 v16, v0

    .line 373
    .line 374
    check-cast v16, LD/j;

    .line 375
    .line 376
    move-object/from16 v21, v4

    .line 377
    .line 378
    invoke-virtual/range {v16 .. v21}, LD/j;->u(DD[D)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v2, v6}, Lp0/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 382
    .line 383
    .line 384
    goto/16 :goto_e

    .line 385
    .line 386
    :goto_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    invoke-virtual {v2, v15, v0, v6}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    goto/16 :goto_e

    .line 394
    .line 395
    :pswitch_5
    :try_start_1
    check-cast v0, Lorg/json/JSONObject;

    .line 396
    .line 397
    const-string v3, "action"

    .line 398
    .line 399
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v3

    .line 403
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    if-eqz v0, :cond_12

    .line 408
    .line 409
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 410
    .line 411
    .line 412
    move-result v4

    .line 413
    if-nez v4, :cond_12

    .line 414
    .line 415
    new-instance v4, Landroid/os/Bundle;

    .line 416
    .line 417
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v4, v8, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    goto :goto_7

    .line 424
    :catch_1
    move-exception v0

    .line 425
    goto :goto_8

    .line 426
    :cond_12
    move-object v4, v6

    .line 427
    :goto_7
    iget-object v0, v9, LN/Q;->g:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v0, LD/j;

    .line 430
    .line 431
    iget-object v0, v0, LD/j;->f:Ljava/lang/Object;

    .line 432
    .line 433
    check-cast v0, Lio/flutter/plugin/editing/j;

    .line 434
    .line 435
    iget-object v5, v0, Lio/flutter/plugin/editing/j;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 436
    .line 437
    iget-object v0, v0, Lio/flutter/plugin/editing/j;->a:Landroid/view/View;

    .line 438
    .line 439
    invoke-virtual {v5, v0, v3, v4}, Landroid/view/inputmethod/InputMethodManager;->sendAppPrivateCommand(Landroid/view/View;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v2, v6}, Lp0/k;->c(Ljava/lang/Object;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 443
    .line 444
    .line 445
    goto/16 :goto_e

    .line 446
    .line 447
    :goto_8
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    invoke-virtual {v2, v15, v0, v6}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    goto/16 :goto_e

    .line 455
    .line 456
    :pswitch_6
    iget-object v0, v9, LN/Q;->g:Ljava/lang/Object;

    .line 457
    .line 458
    check-cast v0, LD/j;

    .line 459
    .line 460
    iget-object v0, v0, LD/j;->f:Ljava/lang/Object;

    .line 461
    .line 462
    check-cast v0, Lio/flutter/plugin/editing/j;

    .line 463
    .line 464
    iget-object v3, v0, Lio/flutter/plugin/editing/j;->a:Landroid/view/View;

    .line 465
    .line 466
    iget-object v4, v0, Lio/flutter/plugin/editing/j;->f:Lp0/o;

    .line 467
    .line 468
    iget-object v5, v0, Lio/flutter/plugin/editing/j;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 469
    .line 470
    if-eqz v4, :cond_14

    .line 471
    .line 472
    iget-object v4, v4, Lp0/o;->g:Lp0/p;

    .line 473
    .line 474
    iget v4, v4, Lp0/p;->a:I

    .line 475
    .line 476
    const/16 v7, 0xb

    .line 477
    .line 478
    if-eq v4, v7, :cond_13

    .line 479
    .line 480
    goto :goto_9

    .line 481
    :cond_13
    invoke-virtual {v0}, Lio/flutter/plugin/editing/j;->d()V

    .line 482
    .line 483
    .line 484
    invoke-virtual {v3}, Landroid/view/View;->getApplicationWindowToken()Landroid/os/IBinder;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    invoke-virtual {v5, v0, v11}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 489
    .line 490
    .line 491
    goto :goto_a

    .line 492
    :cond_14
    :goto_9
    invoke-virtual {v3}, Landroid/view/View;->requestFocus()Z

    .line 493
    .line 494
    .line 495
    invoke-virtual {v5, v3, v11}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 496
    .line 497
    .line 498
    :goto_a
    invoke-virtual {v2, v6}, Lp0/k;->c(Ljava/lang/Object;)V

    .line 499
    .line 500
    .line 501
    goto/16 :goto_e

    .line 502
    .line 503
    :pswitch_7
    iget-object v0, v9, LN/Q;->g:Ljava/lang/Object;

    .line 504
    .line 505
    check-cast v0, LD/j;

    .line 506
    .line 507
    iget-object v0, v0, LD/j;->f:Ljava/lang/Object;

    .line 508
    .line 509
    check-cast v0, Lio/flutter/plugin/editing/j;

    .line 510
    .line 511
    iget-object v3, v0, Lio/flutter/plugin/editing/j;->e:LN/n;

    .line 512
    .line 513
    iget v3, v3, LN/n;->b:I

    .line 514
    .line 515
    const/4 v4, 0x4

    .line 516
    if-ne v3, v4, :cond_15

    .line 517
    .line 518
    invoke-virtual {v0}, Lio/flutter/plugin/editing/j;->d()V

    .line 519
    .line 520
    .line 521
    goto :goto_b

    .line 522
    :cond_15
    invoke-virtual {v0}, Lio/flutter/plugin/editing/j;->d()V

    .line 523
    .line 524
    .line 525
    iget-object v3, v0, Lio/flutter/plugin/editing/j;->a:Landroid/view/View;

    .line 526
    .line 527
    invoke-virtual {v3}, Landroid/view/View;->getApplicationWindowToken()Landroid/os/IBinder;

    .line 528
    .line 529
    .line 530
    move-result-object v3

    .line 531
    iget-object v0, v0, Lio/flutter/plugin/editing/j;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 532
    .line 533
    invoke-virtual {v0, v3, v11}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 534
    .line 535
    .line 536
    :goto_b
    invoke-virtual {v2, v6}, Lp0/k;->c(Ljava/lang/Object;)V

    .line 537
    .line 538
    .line 539
    goto/16 :goto_e

    .line 540
    .line 541
    :pswitch_8
    :try_start_2
    check-cast v0, Lorg/json/JSONArray;

    .line 542
    .line 543
    invoke-virtual {v0, v11}, Lorg/json/JSONArray;->getInt(I)I

    .line 544
    .line 545
    .line 546
    move-result v3

    .line 547
    invoke-virtual {v0, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    iget-object v4, v9, LN/Q;->g:Ljava/lang/Object;

    .line 552
    .line 553
    check-cast v4, LD/j;

    .line 554
    .line 555
    invoke-static {v0}, Lp0/o;->a(Lorg/json/JSONObject;)Lp0/o;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    invoke-virtual {v4, v3, v0}, LD/j;->t(ILp0/o;)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v2, v6}, Lp0/k;->c(Ljava/lang/Object;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_2

    .line 563
    .line 564
    .line 565
    goto :goto_e

    .line 566
    :catch_2
    move-exception v0

    .line 567
    goto :goto_c

    .line 568
    :catch_3
    move-exception v0

    .line 569
    :goto_c
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    invoke-virtual {v2, v15, v0, v6}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 574
    .line 575
    .line 576
    goto :goto_e

    .line 577
    :pswitch_9
    :try_start_3
    check-cast v0, Lorg/json/JSONObject;

    .line 578
    .line 579
    iget-object v3, v9, LN/Q;->g:Ljava/lang/Object;

    .line 580
    .line 581
    check-cast v3, LD/j;

    .line 582
    .line 583
    invoke-static {v0}, Lp0/q;->a(Lorg/json/JSONObject;)Lp0/q;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    invoke-virtual {v3, v0}, LD/j;->v(Lp0/q;)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {v2, v6}, Lp0/k;->c(Ljava/lang/Object;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_4

    .line 591
    .line 592
    .line 593
    goto :goto_e

    .line 594
    :catch_4
    move-exception v0

    .line 595
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    invoke-virtual {v2, v15, v0, v6}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 600
    .line 601
    .line 602
    goto :goto_e

    .line 603
    :pswitch_a
    :try_start_4
    check-cast v0, Lorg/json/JSONObject;

    .line 604
    .line 605
    const-string v3, "platformViewId"

    .line 606
    .line 607
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 608
    .line 609
    .line 610
    move-result v3

    .line 611
    const-string v4, "usesVirtualDisplay"

    .line 612
    .line 613
    invoke-virtual {v0, v4, v11}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 614
    .line 615
    .line 616
    move-result v0

    .line 617
    iget-object v4, v9, LN/Q;->g:Ljava/lang/Object;

    .line 618
    .line 619
    check-cast v4, LD/j;

    .line 620
    .line 621
    iget-object v4, v4, LD/j;->f:Ljava/lang/Object;

    .line 622
    .line 623
    check-cast v4, Lio/flutter/plugin/editing/j;

    .line 624
    .line 625
    if-eqz v0, :cond_16

    .line 626
    .line 627
    iget-object v0, v4, Lio/flutter/plugin/editing/j;->a:Landroid/view/View;

    .line 628
    .line 629
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 630
    .line 631
    .line 632
    new-instance v5, LN/n;

    .line 633
    .line 634
    invoke-direct {v5, v12, v3}, LN/n;-><init>(II)V

    .line 635
    .line 636
    .line 637
    iput-object v5, v4, Lio/flutter/plugin/editing/j;->e:LN/n;

    .line 638
    .line 639
    iget-object v3, v4, Lio/flutter/plugin/editing/j;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 640
    .line 641
    invoke-virtual {v3, v0}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 642
    .line 643
    .line 644
    iput-boolean v11, v4, Lio/flutter/plugin/editing/j;->i:Z

    .line 645
    .line 646
    goto :goto_d

    .line 647
    :cond_16
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 648
    .line 649
    .line 650
    new-instance v0, LN/n;

    .line 651
    .line 652
    const/4 v5, 0x4

    .line 653
    invoke-direct {v0, v5, v3}, LN/n;-><init>(II)V

    .line 654
    .line 655
    .line 656
    iput-object v0, v4, Lio/flutter/plugin/editing/j;->e:LN/n;

    .line 657
    .line 658
    iput-object v6, v4, Lio/flutter/plugin/editing/j;->j:Landroid/view/inputmethod/InputConnection;

    .line 659
    .line 660
    :goto_d
    invoke-virtual {v2, v6}, Lp0/k;->c(Ljava/lang/Object;)V
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_5

    .line 661
    .line 662
    .line 663
    goto :goto_e

    .line 664
    :catch_5
    move-exception v0

    .line 665
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    invoke-virtual {v2, v15, v0, v6}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 670
    .line 671
    .line 672
    :goto_e
    return-void

    .line 673
    :pswitch_b
    iget-object v3, v1, Lp0/b;->f:Ljava/lang/Object;

    .line 674
    .line 675
    check-cast v3, Lp0/b;

    .line 676
    .line 677
    iget-object v4, v3, Lp0/b;->f:Ljava/lang/Object;

    .line 678
    .line 679
    check-cast v4, Lio/flutter/plugin/editing/g;

    .line 680
    .line 681
    if-nez v4, :cond_17

    .line 682
    .line 683
    goto :goto_f

    .line 684
    :cond_17
    iget-object v4, v0, LN/Q;->f:Ljava/lang/Object;

    .line 685
    .line 686
    check-cast v4, Ljava/lang/String;

    .line 687
    .line 688
    iget-object v0, v0, LN/Q;->g:Ljava/lang/Object;

    .line 689
    .line 690
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 691
    .line 692
    .line 693
    const-string v5, "SpellCheck.initiateSpellCheck"

    .line 694
    .line 695
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 696
    .line 697
    .line 698
    move-result v4

    .line 699
    if-nez v4, :cond_18

    .line 700
    .line 701
    invoke-virtual/range {p2 .. p2}, Lp0/k;->b()V

    .line 702
    .line 703
    .line 704
    goto :goto_f

    .line 705
    :cond_18
    :try_start_5
    check-cast v0, Ljava/util/ArrayList;

    .line 706
    .line 707
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-result-object v4

    .line 711
    check-cast v4, Ljava/lang/String;

    .line 712
    .line 713
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    check-cast v0, Ljava/lang/String;

    .line 718
    .line 719
    iget-object v3, v3, Lp0/b;->f:Ljava/lang/Object;

    .line 720
    .line 721
    check-cast v3, Lio/flutter/plugin/editing/g;

    .line 722
    .line 723
    invoke-virtual {v3, v4, v0, v2}, Lio/flutter/plugin/editing/g;->a(Ljava/lang/String;Ljava/lang/String;Lp0/k;)V
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_6

    .line 724
    .line 725
    .line 726
    goto :goto_f

    .line 727
    :catch_6
    move-exception v0

    .line 728
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 729
    .line 730
    .line 731
    move-result-object v0

    .line 732
    invoke-virtual {v2, v15, v0, v6}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 733
    .line 734
    .line 735
    :goto_f
    return-void

    .line 736
    :pswitch_c
    iget-object v3, v1, Lp0/b;->f:Ljava/lang/Object;

    .line 737
    .line 738
    check-cast v3, Lp0/b;

    .line 739
    .line 740
    iget-object v4, v3, Lp0/b;->f:Ljava/lang/Object;

    .line 741
    .line 742
    check-cast v4, LN/Q;

    .line 743
    .line 744
    if-nez v4, :cond_19

    .line 745
    .line 746
    goto/16 :goto_13

    .line 747
    .line 748
    :cond_19
    iget-object v0, v0, LN/Q;->f:Ljava/lang/Object;

    .line 749
    .line 750
    check-cast v0, Ljava/lang/String;

    .line 751
    .line 752
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 753
    .line 754
    .line 755
    const/16 v4, 0x22

    .line 756
    .line 757
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 758
    .line 759
    .line 760
    move-result v5

    .line 761
    sparse-switch v5, :sswitch_data_1

    .line 762
    .line 763
    .line 764
    :goto_10
    const/16 v16, -0x1

    .line 765
    .line 766
    goto :goto_11

    .line 767
    :sswitch_a
    const-string v5, "Scribe.isStylusHandwritingAvailable"

    .line 768
    .line 769
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 770
    .line 771
    .line 772
    move-result v0

    .line 773
    if-nez v0, :cond_1a

    .line 774
    .line 775
    goto :goto_10

    .line 776
    :cond_1a
    const/16 v16, 0x2

    .line 777
    .line 778
    goto :goto_11

    .line 779
    :sswitch_b
    const-string v5, "Scribe.startStylusHandwriting"

    .line 780
    .line 781
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 782
    .line 783
    .line 784
    move-result v0

    .line 785
    if-nez v0, :cond_1b

    .line 786
    .line 787
    goto :goto_10

    .line 788
    :cond_1b
    const/16 v16, 0x1

    .line 789
    .line 790
    goto :goto_11

    .line 791
    :sswitch_c
    const-string v5, "Scribe.isFeatureAvailable"

    .line 792
    .line 793
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 794
    .line 795
    .line 796
    move-result v0

    .line 797
    if-nez v0, :cond_1c

    .line 798
    .line 799
    goto :goto_10

    .line 800
    :cond_1c
    const/16 v16, 0x0

    .line 801
    .line 802
    :goto_11
    packed-switch v16, :pswitch_data_2

    .line 803
    .line 804
    .line 805
    invoke-virtual/range {p2 .. p2}, Lp0/k;->b()V

    .line 806
    .line 807
    .line 808
    goto/16 :goto_13

    .line 809
    .line 810
    :pswitch_d
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 811
    .line 812
    if-ge v0, v4, :cond_1d

    .line 813
    .line 814
    const-string v0, "Requires API level 34 or higher."

    .line 815
    .line 816
    invoke-virtual {v2, v15, v0, v6}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 817
    .line 818
    .line 819
    goto/16 :goto_13

    .line 820
    .line 821
    :cond_1d
    :try_start_6
    iget-object v0, v3, Lp0/b;->f:Ljava/lang/Object;

    .line 822
    .line 823
    check-cast v0, LN/Q;

    .line 824
    .line 825
    iget-object v0, v0, LN/Q;->f:Ljava/lang/Object;

    .line 826
    .line 827
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 828
    .line 829
    invoke-static {v0}, Lio/flutter/plugin/editing/f;->c(Landroid/view/inputmethod/InputMethodManager;)Z

    .line 830
    .line 831
    .line 832
    move-result v0

    .line 833
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 834
    .line 835
    .line 836
    move-result-object v0

    .line 837
    invoke-virtual {v2, v0}, Lp0/k;->c(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_7

    .line 838
    .line 839
    .line 840
    goto :goto_13

    .line 841
    :catch_7
    move-exception v0

    .line 842
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 843
    .line 844
    .line 845
    move-result-object v0

    .line 846
    invoke-virtual {v2, v15, v0, v6}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 847
    .line 848
    .line 849
    goto :goto_13

    .line 850
    :pswitch_e
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 851
    .line 852
    const/16 v4, 0x21

    .line 853
    .line 854
    if-ge v0, v4, :cond_1e

    .line 855
    .line 856
    const-string v0, "Requires API level 33 or higher."

    .line 857
    .line 858
    invoke-virtual {v2, v15, v0, v6}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 859
    .line 860
    .line 861
    goto :goto_13

    .line 862
    :cond_1e
    :try_start_7
    iget-object v0, v3, Lp0/b;->f:Ljava/lang/Object;

    .line 863
    .line 864
    check-cast v0, LN/Q;

    .line 865
    .line 866
    iget-object v3, v0, LN/Q;->f:Ljava/lang/Object;

    .line 867
    .line 868
    check-cast v3, Landroid/view/inputmethod/InputMethodManager;

    .line 869
    .line 870
    iget-object v0, v0, LN/Q;->g:Ljava/lang/Object;

    .line 871
    .line 872
    check-cast v0, Landroid/view/View;

    .line 873
    .line 874
    invoke-static {v3, v0}, Lg0/b;->l(Landroid/view/inputmethod/InputMethodManager;Landroid/view/View;)V

    .line 875
    .line 876
    .line 877
    invoke-virtual {v2, v6}, Lp0/k;->c(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_8

    .line 878
    .line 879
    .line 880
    goto :goto_13

    .line 881
    :catch_8
    move-exception v0

    .line 882
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 883
    .line 884
    .line 885
    move-result-object v0

    .line 886
    invoke-virtual {v2, v15, v0, v6}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 887
    .line 888
    .line 889
    goto :goto_13

    .line 890
    :pswitch_f
    :try_start_8
    iget-object v0, v3, Lp0/b;->f:Ljava/lang/Object;

    .line 891
    .line 892
    check-cast v0, LN/Q;

    .line 893
    .line 894
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 895
    .line 896
    if-lt v3, v4, :cond_1f

    .line 897
    .line 898
    iget-object v0, v0, LN/Q;->f:Ljava/lang/Object;

    .line 899
    .line 900
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 901
    .line 902
    invoke-static {v0}, Lio/flutter/plugin/editing/f;->c(Landroid/view/inputmethod/InputMethodManager;)Z

    .line 903
    .line 904
    .line 905
    move-result v0

    .line 906
    if-eqz v0, :cond_20

    .line 907
    .line 908
    const/4 v11, 0x1

    .line 909
    goto :goto_12

    .line 910
    :cond_1f
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 911
    .line 912
    .line 913
    :cond_20
    :goto_12
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 914
    .line 915
    .line 916
    move-result-object v0

    .line 917
    invoke-virtual {v2, v0}, Lp0/k;->c(Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/IllegalStateException; {:try_start_8 .. :try_end_8} :catch_9

    .line 918
    .line 919
    .line 920
    goto :goto_13

    .line 921
    :catch_9
    move-exception v0

    .line 922
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 923
    .line 924
    .line 925
    move-result-object v0

    .line 926
    invoke-virtual {v2, v15, v0, v6}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 927
    .line 928
    .line 929
    :goto_13
    return-void

    .line 930
    :pswitch_10
    iget-object v3, v0, LN/Q;->f:Ljava/lang/Object;

    .line 931
    .line 932
    check-cast v3, Ljava/lang/String;

    .line 933
    .line 934
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 935
    .line 936
    .line 937
    iget-object v4, v1, Lp0/b;->f:Ljava/lang/Object;

    .line 938
    .line 939
    check-cast v4, Lp0/l;

    .line 940
    .line 941
    const-string v5, "get"

    .line 942
    .line 943
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 944
    .line 945
    .line 946
    move-result v5

    .line 947
    if-nez v5, :cond_22

    .line 948
    .line 949
    const-string v5, "put"

    .line 950
    .line 951
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 952
    .line 953
    .line 954
    move-result v3

    .line 955
    if-nez v3, :cond_21

    .line 956
    .line 957
    invoke-virtual/range {p2 .. p2}, Lp0/k;->b()V

    .line 958
    .line 959
    .line 960
    goto :goto_15

    .line 961
    :cond_21
    iget-object v0, v0, LN/Q;->g:Ljava/lang/Object;

    .line 962
    .line 963
    check-cast v0, [B

    .line 964
    .line 965
    iput-object v0, v4, Lp0/l;->b:[B

    .line 966
    .line 967
    invoke-virtual {v2, v6}, Lp0/k;->c(Ljava/lang/Object;)V

    .line 968
    .line 969
    .line 970
    goto :goto_15

    .line 971
    :cond_22
    iput-boolean v7, v4, Lp0/l;->f:Z

    .line 972
    .line 973
    iget-boolean v0, v4, Lp0/l;->e:Z

    .line 974
    .line 975
    if-nez v0, :cond_24

    .line 976
    .line 977
    iget-boolean v0, v4, Lp0/l;->a:Z

    .line 978
    .line 979
    if-nez v0, :cond_23

    .line 980
    .line 981
    goto :goto_14

    .line 982
    :cond_23
    iput-object v2, v4, Lp0/l;->d:Lp0/k;

    .line 983
    .line 984
    goto :goto_15

    .line 985
    :cond_24
    :goto_14
    iget-object v0, v4, Lp0/l;->b:[B

    .line 986
    .line 987
    invoke-static {v0}, Lp0/l;->a([B)Ljava/util/HashMap;

    .line 988
    .line 989
    .line 990
    move-result-object v0

    .line 991
    invoke-virtual {v2, v0}, Lp0/k;->c(Ljava/lang/Object;)V

    .line 992
    .line 993
    .line 994
    :goto_15
    return-void

    .line 995
    :pswitch_11
    iget-object v3, v1, Lp0/b;->f:Ljava/lang/Object;

    .line 996
    .line 997
    check-cast v3, LN/Q;

    .line 998
    .line 999
    iget-object v4, v3, LN/Q;->g:Ljava/lang/Object;

    .line 1000
    .line 1001
    check-cast v4, Lt0/a;

    .line 1002
    .line 1003
    if-nez v4, :cond_25

    .line 1004
    .line 1005
    goto :goto_16

    .line 1006
    :cond_25
    iget-object v4, v0, LN/Q;->f:Ljava/lang/Object;

    .line 1007
    .line 1008
    check-cast v4, Ljava/lang/String;

    .line 1009
    .line 1010
    iget-object v0, v0, LN/Q;->g:Ljava/lang/Object;

    .line 1011
    .line 1012
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1013
    .line 1014
    .line 1015
    const-string v5, "ProcessText.processTextAction"

    .line 1016
    .line 1017
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1018
    .line 1019
    .line 1020
    move-result v5

    .line 1021
    if-nez v5, :cond_27

    .line 1022
    .line 1023
    const-string v0, "ProcessText.queryTextActions"

    .line 1024
    .line 1025
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1026
    .line 1027
    .line 1028
    move-result v0

    .line 1029
    if-nez v0, :cond_26

    .line 1030
    .line 1031
    invoke-virtual/range {p2 .. p2}, Lp0/k;->b()V

    .line 1032
    .line 1033
    .line 1034
    goto :goto_16

    .line 1035
    :cond_26
    :try_start_9
    iget-object v0, v3, LN/Q;->g:Ljava/lang/Object;

    .line 1036
    .line 1037
    check-cast v0, Lt0/a;

    .line 1038
    .line 1039
    invoke-virtual {v0}, Lt0/a;->h()Ljava/util/HashMap;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v0

    .line 1043
    invoke-virtual {v2, v0}, Lp0/k;->c(Ljava/lang/Object;)V
    :try_end_9
    .catch Ljava/lang/IllegalStateException; {:try_start_9 .. :try_end_9} :catch_a

    .line 1044
    .line 1045
    .line 1046
    goto :goto_16

    .line 1047
    :catch_a
    move-exception v0

    .line 1048
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v0

    .line 1052
    invoke-virtual {v2, v15, v0, v6}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1053
    .line 1054
    .line 1055
    goto :goto_16

    .line 1056
    :cond_27
    :try_start_a
    check-cast v0, Ljava/util/ArrayList;

    .line 1057
    .line 1058
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v4

    .line 1062
    check-cast v4, Ljava/lang/String;

    .line 1063
    .line 1064
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v5

    .line 1068
    check-cast v5, Ljava/lang/String;

    .line 1069
    .line 1070
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v0

    .line 1074
    check-cast v0, Ljava/lang/Boolean;

    .line 1075
    .line 1076
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1077
    .line 1078
    .line 1079
    move-result v0

    .line 1080
    iget-object v3, v3, LN/Q;->g:Ljava/lang/Object;

    .line 1081
    .line 1082
    check-cast v3, Lt0/a;

    .line 1083
    .line 1084
    invoke-virtual {v3, v4, v5, v0, v2}, Lt0/a;->f(Ljava/lang/String;Ljava/lang/String;ZLp0/k;)V
    :try_end_a
    .catch Ljava/lang/IllegalStateException; {:try_start_a .. :try_end_a} :catch_b

    .line 1085
    .line 1086
    .line 1087
    goto :goto_16

    .line 1088
    :catch_b
    move-exception v0

    .line 1089
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v0

    .line 1093
    invoke-virtual {v2, v15, v0, v6}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1094
    .line 1095
    .line 1096
    :goto_16
    return-void

    .line 1097
    :pswitch_12
    iget-object v3, v1, Lp0/b;->f:Ljava/lang/Object;

    .line 1098
    .line 1099
    check-cast v3, LN/Q;

    .line 1100
    .line 1101
    iget-object v8, v3, LN/Q;->g:Ljava/lang/Object;

    .line 1102
    .line 1103
    check-cast v8, Lio/flutter/plugin/platform/n;

    .line 1104
    .line 1105
    if-nez v8, :cond_28

    .line 1106
    .line 1107
    goto/16 :goto_1f

    .line 1108
    .line 1109
    :cond_28
    iget-object v8, v0, LN/Q;->f:Ljava/lang/Object;

    .line 1110
    .line 1111
    check-cast v8, Ljava/lang/String;

    .line 1112
    .line 1113
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1114
    .line 1115
    .line 1116
    const-string v9, "left"

    .line 1117
    .line 1118
    const-string v10, "top"

    .line 1119
    .line 1120
    const-string v13, "direction"

    .line 1121
    .line 1122
    const-string v12, "id"

    .line 1123
    .line 1124
    iget-object v0, v0, LN/Q;->g:Ljava/lang/Object;

    .line 1125
    .line 1126
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 1127
    .line 1128
    .line 1129
    move-result v23

    .line 1130
    sparse-switch v23, :sswitch_data_2

    .line 1131
    .line 1132
    .line 1133
    :goto_17
    const/16 v16, -0x1

    .line 1134
    .line 1135
    goto/16 :goto_18

    .line 1136
    .line 1137
    :sswitch_d
    const-string v14, "dispose"

    .line 1138
    .line 1139
    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1140
    .line 1141
    .line 1142
    move-result v8

    .line 1143
    if-nez v8, :cond_29

    .line 1144
    .line 1145
    goto :goto_17

    .line 1146
    :cond_29
    const/16 v16, 0x7

    .line 1147
    .line 1148
    goto :goto_18

    .line 1149
    :sswitch_e
    const-string v14, "setDirection"

    .line 1150
    .line 1151
    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1152
    .line 1153
    .line 1154
    move-result v8

    .line 1155
    if-nez v8, :cond_2a

    .line 1156
    .line 1157
    goto :goto_17

    .line 1158
    :cond_2a
    const/16 v16, 0x6

    .line 1159
    .line 1160
    goto :goto_18

    .line 1161
    :sswitch_f
    const-string v14, "touch"

    .line 1162
    .line 1163
    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1164
    .line 1165
    .line 1166
    move-result v8

    .line 1167
    if-nez v8, :cond_2b

    .line 1168
    .line 1169
    goto :goto_17

    .line 1170
    :cond_2b
    const/16 v16, 0x5

    .line 1171
    .line 1172
    goto :goto_18

    .line 1173
    :sswitch_10
    const-string v14, "synchronizeToNativeViewHierarchy"

    .line 1174
    .line 1175
    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1176
    .line 1177
    .line 1178
    move-result v8

    .line 1179
    if-nez v8, :cond_2c

    .line 1180
    .line 1181
    goto :goto_17

    .line 1182
    :cond_2c
    const/16 v16, 0x4

    .line 1183
    .line 1184
    goto :goto_18

    .line 1185
    :sswitch_11
    const-string v14, "clearFocus"

    .line 1186
    .line 1187
    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1188
    .line 1189
    .line 1190
    move-result v8

    .line 1191
    if-nez v8, :cond_2d

    .line 1192
    .line 1193
    goto :goto_17

    .line 1194
    :cond_2d
    const/16 v16, 0x3

    .line 1195
    .line 1196
    goto :goto_18

    .line 1197
    :sswitch_12
    const-string v14, "resize"

    .line 1198
    .line 1199
    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1200
    .line 1201
    .line 1202
    move-result v8

    .line 1203
    if-nez v8, :cond_2e

    .line 1204
    .line 1205
    goto :goto_17

    .line 1206
    :cond_2e
    const/16 v16, 0x2

    .line 1207
    .line 1208
    goto :goto_18

    .line 1209
    :sswitch_13
    const-string v14, "offset"

    .line 1210
    .line 1211
    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1212
    .line 1213
    .line 1214
    move-result v8

    .line 1215
    if-nez v8, :cond_2f

    .line 1216
    .line 1217
    goto :goto_17

    .line 1218
    :cond_2f
    const/16 v16, 0x1

    .line 1219
    .line 1220
    goto :goto_18

    .line 1221
    :sswitch_14
    const-string v14, "create"

    .line 1222
    .line 1223
    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1224
    .line 1225
    .line 1226
    move-result v8

    .line 1227
    if-nez v8, :cond_30

    .line 1228
    .line 1229
    goto :goto_17

    .line 1230
    :cond_30
    const/16 v16, 0x0

    .line 1231
    .line 1232
    :goto_18
    packed-switch v16, :pswitch_data_3

    .line 1233
    .line 1234
    .line 1235
    invoke-virtual/range {p2 .. p2}, Lp0/k;->b()V

    .line 1236
    .line 1237
    .line 1238
    goto/16 :goto_1f

    .line 1239
    .line 1240
    :pswitch_13
    check-cast v0, Ljava/util/Map;

    .line 1241
    .line 1242
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v0

    .line 1246
    check-cast v0, Ljava/lang/Integer;

    .line 1247
    .line 1248
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1249
    .line 1250
    .line 1251
    move-result v0

    .line 1252
    :try_start_b
    iget-object v3, v3, LN/Q;->g:Ljava/lang/Object;

    .line 1253
    .line 1254
    check-cast v3, Lio/flutter/plugin/platform/n;

    .line 1255
    .line 1256
    invoke-virtual {v3, v0}, Lio/flutter/plugin/platform/n;->e(I)V

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual {v2, v6}, Lp0/k;->c(Ljava/lang/Object;)V
    :try_end_b
    .catch Ljava/lang/IllegalStateException; {:try_start_b .. :try_end_b} :catch_c

    .line 1260
    .line 1261
    .line 1262
    goto/16 :goto_1f

    .line 1263
    .line 1264
    :catch_c
    move-exception v0

    .line 1265
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v0

    .line 1269
    invoke-virtual {v2, v15, v0, v6}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1270
    .line 1271
    .line 1272
    goto/16 :goto_1f

    .line 1273
    .line 1274
    :pswitch_14
    check-cast v0, Ljava/util/Map;

    .line 1275
    .line 1276
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v4

    .line 1280
    check-cast v4, Ljava/lang/Integer;

    .line 1281
    .line 1282
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1283
    .line 1284
    .line 1285
    move-result v4

    .line 1286
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v0

    .line 1290
    check-cast v0, Ljava/lang/Integer;

    .line 1291
    .line 1292
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1293
    .line 1294
    .line 1295
    move-result v0

    .line 1296
    :try_start_c
    iget-object v3, v3, LN/Q;->g:Ljava/lang/Object;

    .line 1297
    .line 1298
    check-cast v3, Lio/flutter/plugin/platform/n;

    .line 1299
    .line 1300
    invoke-virtual {v3, v4, v0}, Lio/flutter/plugin/platform/n;->j(II)V

    .line 1301
    .line 1302
    .line 1303
    invoke-virtual {v2, v6}, Lp0/k;->c(Ljava/lang/Object;)V
    :try_end_c
    .catch Ljava/lang/IllegalStateException; {:try_start_c .. :try_end_c} :catch_d

    .line 1304
    .line 1305
    .line 1306
    goto/16 :goto_1f

    .line 1307
    .line 1308
    :catch_d
    move-exception v0

    .line 1309
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v0

    .line 1313
    invoke-virtual {v2, v15, v0, v6}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1314
    .line 1315
    .line 1316
    goto/16 :goto_1f

    .line 1317
    .line 1318
    :pswitch_15
    check-cast v0, Ljava/util/List;

    .line 1319
    .line 1320
    new-instance v4, Lp0/j;

    .line 1321
    .line 1322
    move-object/from16 v24, v4

    .line 1323
    .line 1324
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v5

    .line 1328
    check-cast v5, Ljava/lang/Integer;

    .line 1329
    .line 1330
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1331
    .line 1332
    .line 1333
    move-result v25

    .line 1334
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v5

    .line 1338
    move-object/from16 v26, v5

    .line 1339
    .line 1340
    check-cast v26, Ljava/lang/Number;

    .line 1341
    .line 1342
    const/4 v5, 0x2

    .line 1343
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v5

    .line 1347
    move-object/from16 v27, v5

    .line 1348
    .line 1349
    check-cast v27, Ljava/lang/Number;

    .line 1350
    .line 1351
    const/4 v5, 0x3

    .line 1352
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v5

    .line 1356
    check-cast v5, Ljava/lang/Integer;

    .line 1357
    .line 1358
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1359
    .line 1360
    .line 1361
    move-result v28

    .line 1362
    const/4 v5, 0x4

    .line 1363
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v5

    .line 1367
    check-cast v5, Ljava/lang/Integer;

    .line 1368
    .line 1369
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1370
    .line 1371
    .line 1372
    move-result v29

    .line 1373
    const/4 v5, 0x5

    .line 1374
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v30

    .line 1378
    const/4 v5, 0x6

    .line 1379
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v31

    .line 1383
    const/4 v5, 0x7

    .line 1384
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v5

    .line 1388
    check-cast v5, Ljava/lang/Integer;

    .line 1389
    .line 1390
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1391
    .line 1392
    .line 1393
    move-result v32

    .line 1394
    const/16 v5, 0x8

    .line 1395
    .line 1396
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v5

    .line 1400
    check-cast v5, Ljava/lang/Integer;

    .line 1401
    .line 1402
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1403
    .line 1404
    .line 1405
    move-result v33

    .line 1406
    const/16 v5, 0x9

    .line 1407
    .line 1408
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v5

    .line 1412
    check-cast v5, Ljava/lang/Double;

    .line 1413
    .line 1414
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 1415
    .line 1416
    .line 1417
    move-result-wide v7

    .line 1418
    double-to-float v5, v7

    .line 1419
    move/from16 v34, v5

    .line 1420
    .line 1421
    const/16 v5, 0xa

    .line 1422
    .line 1423
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v5

    .line 1427
    check-cast v5, Ljava/lang/Double;

    .line 1428
    .line 1429
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 1430
    .line 1431
    .line 1432
    move-result-wide v7

    .line 1433
    double-to-float v5, v7

    .line 1434
    move/from16 v35, v5

    .line 1435
    .line 1436
    const/16 v5, 0xb

    .line 1437
    .line 1438
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v5

    .line 1442
    check-cast v5, Ljava/lang/Integer;

    .line 1443
    .line 1444
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1445
    .line 1446
    .line 1447
    move-result v36

    .line 1448
    const/16 v5, 0xc

    .line 1449
    .line 1450
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v5

    .line 1454
    check-cast v5, Ljava/lang/Integer;

    .line 1455
    .line 1456
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1457
    .line 1458
    .line 1459
    move-result v37

    .line 1460
    const/16 v5, 0xd

    .line 1461
    .line 1462
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v5

    .line 1466
    check-cast v5, Ljava/lang/Integer;

    .line 1467
    .line 1468
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1469
    .line 1470
    .line 1471
    move-result v38

    .line 1472
    const/16 v5, 0xe

    .line 1473
    .line 1474
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v5

    .line 1478
    check-cast v5, Ljava/lang/Integer;

    .line 1479
    .line 1480
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1481
    .line 1482
    .line 1483
    move-result v39

    .line 1484
    const/16 v5, 0xf

    .line 1485
    .line 1486
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v0

    .line 1490
    check-cast v0, Ljava/lang/Number;

    .line 1491
    .line 1492
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 1493
    .line 1494
    .line 1495
    move-result-wide v40

    .line 1496
    invoke-direct/range {v24 .. v41}, Lp0/j;-><init>(ILjava/lang/Number;Ljava/lang/Number;IILjava/lang/Object;Ljava/lang/Object;IIFFIIIIJ)V

    .line 1497
    .line 1498
    .line 1499
    :try_start_d
    iget-object v0, v3, LN/Q;->g:Ljava/lang/Object;

    .line 1500
    .line 1501
    check-cast v0, Lio/flutter/plugin/platform/n;

    .line 1502
    .line 1503
    invoke-virtual {v0, v4}, Lio/flutter/plugin/platform/n;->h(Lp0/j;)V

    .line 1504
    .line 1505
    .line 1506
    invoke-virtual {v2, v6}, Lp0/k;->c(Ljava/lang/Object;)V
    :try_end_d
    .catch Ljava/lang/IllegalStateException; {:try_start_d .. :try_end_d} :catch_e

    .line 1507
    .line 1508
    .line 1509
    goto/16 :goto_1f

    .line 1510
    .line 1511
    :catch_e
    move-exception v0

    .line 1512
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v0

    .line 1516
    invoke-virtual {v2, v15, v0, v6}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1517
    .line 1518
    .line 1519
    goto/16 :goto_1f

    .line 1520
    .line 1521
    :pswitch_16
    check-cast v0, Ljava/lang/Boolean;

    .line 1522
    .line 1523
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1524
    .line 1525
    .line 1526
    move-result v0

    .line 1527
    :try_start_e
    iget-object v3, v3, LN/Q;->g:Ljava/lang/Object;

    .line 1528
    .line 1529
    check-cast v3, Lio/flutter/plugin/platform/n;

    .line 1530
    .line 1531
    iget-object v3, v3, Lio/flutter/plugin/platform/n;->a:Ljava/lang/Object;

    .line 1532
    .line 1533
    check-cast v3, Lio/flutter/plugin/platform/o;

    .line 1534
    .line 1535
    iput-boolean v0, v3, Lio/flutter/plugin/platform/o;->q:Z

    .line 1536
    .line 1537
    invoke-virtual {v2, v6}, Lp0/k;->c(Ljava/lang/Object;)V
    :try_end_e
    .catch Ljava/lang/IllegalStateException; {:try_start_e .. :try_end_e} :catch_f

    .line 1538
    .line 1539
    .line 1540
    goto/16 :goto_1f

    .line 1541
    .line 1542
    :catch_f
    move-exception v0

    .line 1543
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1544
    .line 1545
    .line 1546
    move-result-object v0

    .line 1547
    invoke-virtual {v2, v15, v0, v6}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1548
    .line 1549
    .line 1550
    goto/16 :goto_1f

    .line 1551
    .line 1552
    :pswitch_17
    check-cast v0, Ljava/lang/Integer;

    .line 1553
    .line 1554
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1555
    .line 1556
    .line 1557
    move-result v0

    .line 1558
    :try_start_f
    iget-object v3, v3, LN/Q;->g:Ljava/lang/Object;

    .line 1559
    .line 1560
    check-cast v3, Lio/flutter/plugin/platform/n;

    .line 1561
    .line 1562
    invoke-virtual {v3, v0}, Lio/flutter/plugin/platform/n;->c(I)V

    .line 1563
    .line 1564
    .line 1565
    invoke-virtual {v2, v6}, Lp0/k;->c(Ljava/lang/Object;)V
    :try_end_f
    .catch Ljava/lang/IllegalStateException; {:try_start_f .. :try_end_f} :catch_10

    .line 1566
    .line 1567
    .line 1568
    goto/16 :goto_1f

    .line 1569
    .line 1570
    :catch_10
    move-exception v0

    .line 1571
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1572
    .line 1573
    .line 1574
    move-result-object v0

    .line 1575
    invoke-virtual {v2, v15, v0, v6}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1576
    .line 1577
    .line 1578
    goto/16 :goto_1f

    .line 1579
    .line 1580
    :pswitch_18
    check-cast v0, Ljava/util/Map;

    .line 1581
    .line 1582
    new-instance v7, Lp0/i;

    .line 1583
    .line 1584
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v8

    .line 1588
    check-cast v8, Ljava/lang/Integer;

    .line 1589
    .line 1590
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 1591
    .line 1592
    .line 1593
    move-result v17

    .line 1594
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v5

    .line 1598
    check-cast v5, Ljava/lang/Double;

    .line 1599
    .line 1600
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 1601
    .line 1602
    .line 1603
    move-result-wide v18

    .line 1604
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1605
    .line 1606
    .line 1607
    move-result-object v0

    .line 1608
    check-cast v0, Ljava/lang/Double;

    .line 1609
    .line 1610
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 1611
    .line 1612
    .line 1613
    move-result-wide v20

    .line 1614
    move-object/from16 v16, v7

    .line 1615
    .line 1616
    invoke-direct/range {v16 .. v21}, Lp0/i;-><init>(IDD)V

    .line 1617
    .line 1618
    .line 1619
    :try_start_10
    iget-object v0, v3, LN/Q;->g:Ljava/lang/Object;

    .line 1620
    .line 1621
    check-cast v0, Lio/flutter/plugin/platform/n;

    .line 1622
    .line 1623
    new-instance v3, Lg0/t;

    .line 1624
    .line 1625
    const/4 v8, 0x2

    .line 1626
    invoke-direct {v3, v8, v2}, Lg0/t;-><init>(ILjava/lang/Object;)V

    .line 1627
    .line 1628
    .line 1629
    invoke-virtual {v0, v7, v3}, Lio/flutter/plugin/platform/n;->i(Lp0/i;Lg0/t;)V
    :try_end_10
    .catch Ljava/lang/IllegalStateException; {:try_start_10 .. :try_end_10} :catch_11

    .line 1630
    .line 1631
    .line 1632
    goto/16 :goto_1f

    .line 1633
    .line 1634
    :catch_11
    move-exception v0

    .line 1635
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1636
    .line 1637
    .line 1638
    move-result-object v0

    .line 1639
    invoke-virtual {v2, v15, v0, v6}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1640
    .line 1641
    .line 1642
    goto/16 :goto_1f

    .line 1643
    .line 1644
    :pswitch_19
    check-cast v0, Ljava/util/Map;

    .line 1645
    .line 1646
    :try_start_11
    iget-object v3, v3, LN/Q;->g:Ljava/lang/Object;

    .line 1647
    .line 1648
    move-object/from16 v16, v3

    .line 1649
    .line 1650
    check-cast v16, Lio/flutter/plugin/platform/n;

    .line 1651
    .line 1652
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v3

    .line 1656
    check-cast v3, Ljava/lang/Integer;

    .line 1657
    .line 1658
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1659
    .line 1660
    .line 1661
    move-result v17

    .line 1662
    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1663
    .line 1664
    .line 1665
    move-result-object v3

    .line 1666
    check-cast v3, Ljava/lang/Double;

    .line 1667
    .line 1668
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 1669
    .line 1670
    .line 1671
    move-result-wide v18

    .line 1672
    invoke-interface {v0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v0

    .line 1676
    check-cast v0, Ljava/lang/Double;

    .line 1677
    .line 1678
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 1679
    .line 1680
    .line 1681
    move-result-wide v20

    .line 1682
    invoke-virtual/range {v16 .. v21}, Lio/flutter/plugin/platform/n;->g(IDD)V

    .line 1683
    .line 1684
    .line 1685
    invoke-virtual {v2, v6}, Lp0/k;->c(Ljava/lang/Object;)V
    :try_end_11
    .catch Ljava/lang/IllegalStateException; {:try_start_11 .. :try_end_11} :catch_12

    .line 1686
    .line 1687
    .line 1688
    goto/16 :goto_1f

    .line 1689
    .line 1690
    :catch_12
    move-exception v0

    .line 1691
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1692
    .line 1693
    .line 1694
    move-result-object v0

    .line 1695
    invoke-virtual {v2, v15, v0, v6}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1696
    .line 1697
    .line 1698
    goto/16 :goto_1f

    .line 1699
    .line 1700
    :pswitch_1a
    const/4 v8, 0x2

    .line 1701
    const-string v14, "hybridFallback"

    .line 1702
    .line 1703
    check-cast v0, Ljava/util/Map;

    .line 1704
    .line 1705
    const-string v7, "hybrid"

    .line 1706
    .line 1707
    invoke-interface {v0, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1708
    .line 1709
    .line 1710
    move-result v17

    .line 1711
    if-eqz v17, :cond_31

    .line 1712
    .line 1713
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1714
    .line 1715
    .line 1716
    move-result-object v7

    .line 1717
    check-cast v7, Ljava/lang/Boolean;

    .line 1718
    .line 1719
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1720
    .line 1721
    .line 1722
    move-result v7

    .line 1723
    if-eqz v7, :cond_31

    .line 1724
    .line 1725
    const/4 v7, 0x1

    .line 1726
    goto :goto_19

    .line 1727
    :cond_31
    const/4 v7, 0x0

    .line 1728
    :goto_19
    const-string v8, "params"

    .line 1729
    .line 1730
    invoke-interface {v0, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1731
    .line 1732
    .line 1733
    move-result v17

    .line 1734
    if-eqz v17, :cond_32

    .line 1735
    .line 1736
    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1737
    .line 1738
    .line 1739
    move-result-object v8

    .line 1740
    check-cast v8, [B

    .line 1741
    .line 1742
    invoke-static {v8}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v8

    .line 1746
    move-object/from16 v37, v8

    .line 1747
    .line 1748
    goto :goto_1a

    .line 1749
    :cond_32
    move-object/from16 v37, v6

    .line 1750
    .line 1751
    :goto_1a
    const-string v8, "viewType"

    .line 1752
    .line 1753
    if-eqz v7, :cond_33

    .line 1754
    .line 1755
    :try_start_12
    new-instance v4, Lp0/h;

    .line 1756
    .line 1757
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1758
    .line 1759
    .line 1760
    move-result-object v5

    .line 1761
    check-cast v5, Ljava/lang/Integer;

    .line 1762
    .line 1763
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1764
    .line 1765
    .line 1766
    move-result v25

    .line 1767
    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1768
    .line 1769
    .line 1770
    move-result-object v5

    .line 1771
    move-object/from16 v26, v5

    .line 1772
    .line 1773
    check-cast v26, Ljava/lang/String;

    .line 1774
    .line 1775
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1776
    .line 1777
    .line 1778
    move-result-object v0

    .line 1779
    check-cast v0, Ljava/lang/Integer;

    .line 1780
    .line 1781
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1782
    .line 1783
    .line 1784
    move-result v35

    .line 1785
    const-wide/16 v27, 0x0

    .line 1786
    .line 1787
    const-wide/16 v29, 0x0

    .line 1788
    .line 1789
    const/16 v36, 0x3

    .line 1790
    .line 1791
    const-wide/16 v31, 0x0

    .line 1792
    .line 1793
    const-wide/16 v33, 0x0

    .line 1794
    .line 1795
    move-object/from16 v24, v4

    .line 1796
    .line 1797
    invoke-direct/range {v24 .. v37}, Lp0/h;-><init>(ILjava/lang/String;DDDDIILjava/nio/ByteBuffer;)V

    .line 1798
    .line 1799
    .line 1800
    iget-object v0, v3, LN/Q;->g:Ljava/lang/Object;

    .line 1801
    .line 1802
    check-cast v0, Lio/flutter/plugin/platform/n;

    .line 1803
    .line 1804
    iget-object v0, v0, Lio/flutter/plugin/platform/n;->a:Ljava/lang/Object;

    .line 1805
    .line 1806
    check-cast v0, Lio/flutter/plugin/platform/o;

    .line 1807
    .line 1808
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1809
    .line 1810
    .line 1811
    const/16 v3, 0x13

    .line 1812
    .line 1813
    invoke-static {v3}, Lio/flutter/plugin/platform/o;->d(I)V

    .line 1814
    .line 1815
    .line 1816
    invoke-static {v0, v4}, Lio/flutter/plugin/platform/o;->a(Lio/flutter/plugin/platform/o;Lp0/h;)V

    .line 1817
    .line 1818
    .line 1819
    invoke-virtual {v0, v4, v11}, Lio/flutter/plugin/platform/o;->b(Lp0/h;Z)Lio/flutter/plugin/platform/g;

    .line 1820
    .line 1821
    .line 1822
    invoke-static {v3}, Lio/flutter/plugin/platform/o;->d(I)V

    .line 1823
    .line 1824
    .line 1825
    invoke-virtual {v2, v6}, Lp0/k;->c(Ljava/lang/Object;)V

    .line 1826
    .line 1827
    .line 1828
    goto/16 :goto_1f

    .line 1829
    .line 1830
    :catch_13
    move-exception v0

    .line 1831
    goto/16 :goto_1e

    .line 1832
    .line 1833
    :cond_33
    invoke-interface {v0, v14}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1834
    .line 1835
    .line 1836
    move-result v7

    .line 1837
    if-eqz v7, :cond_34

    .line 1838
    .line 1839
    invoke-interface {v0, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1840
    .line 1841
    .line 1842
    move-result-object v7

    .line 1843
    check-cast v7, Ljava/lang/Boolean;

    .line 1844
    .line 1845
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1846
    .line 1847
    .line 1848
    move-result v7

    .line 1849
    if-eqz v7, :cond_34

    .line 1850
    .line 1851
    const/4 v11, 0x1

    .line 1852
    :cond_34
    if-eqz v11, :cond_35

    .line 1853
    .line 1854
    const/16 v36, 0x2

    .line 1855
    .line 1856
    goto :goto_1b

    .line 1857
    :cond_35
    const/16 v36, 0x1

    .line 1858
    .line 1859
    :goto_1b
    new-instance v7, Lp0/h;

    .line 1860
    .line 1861
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1862
    .line 1863
    .line 1864
    move-result-object v12

    .line 1865
    check-cast v12, Ljava/lang/Integer;

    .line 1866
    .line 1867
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 1868
    .line 1869
    .line 1870
    move-result v25

    .line 1871
    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1872
    .line 1873
    .line 1874
    move-result-object v8

    .line 1875
    move-object/from16 v26, v8

    .line 1876
    .line 1877
    check-cast v26, Ljava/lang/String;

    .line 1878
    .line 1879
    invoke-interface {v0, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1880
    .line 1881
    .line 1882
    move-result v8

    .line 1883
    const-wide/16 v16, 0x0

    .line 1884
    .line 1885
    if-eqz v8, :cond_36

    .line 1886
    .line 1887
    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1888
    .line 1889
    .line 1890
    move-result-object v8

    .line 1891
    check-cast v8, Ljava/lang/Double;

    .line 1892
    .line 1893
    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    .line 1894
    .line 1895
    .line 1896
    move-result-wide v18

    .line 1897
    move-wide/from16 v27, v18

    .line 1898
    .line 1899
    goto :goto_1c

    .line 1900
    :cond_36
    move-wide/from16 v27, v16

    .line 1901
    .line 1902
    :goto_1c
    invoke-interface {v0, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1903
    .line 1904
    .line 1905
    move-result v8

    .line 1906
    if-eqz v8, :cond_37

    .line 1907
    .line 1908
    invoke-interface {v0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1909
    .line 1910
    .line 1911
    move-result-object v8

    .line 1912
    check-cast v8, Ljava/lang/Double;

    .line 1913
    .line 1914
    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    .line 1915
    .line 1916
    .line 1917
    move-result-wide v8

    .line 1918
    move-wide/from16 v29, v8

    .line 1919
    .line 1920
    goto :goto_1d

    .line 1921
    :cond_37
    move-wide/from16 v29, v16

    .line 1922
    .line 1923
    :goto_1d
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1924
    .line 1925
    .line 1926
    move-result-object v5

    .line 1927
    check-cast v5, Ljava/lang/Double;

    .line 1928
    .line 1929
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 1930
    .line 1931
    .line 1932
    move-result-wide v31

    .line 1933
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1934
    .line 1935
    .line 1936
    move-result-object v4

    .line 1937
    check-cast v4, Ljava/lang/Double;

    .line 1938
    .line 1939
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 1940
    .line 1941
    .line 1942
    move-result-wide v33

    .line 1943
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1944
    .line 1945
    .line 1946
    move-result-object v0

    .line 1947
    check-cast v0, Ljava/lang/Integer;

    .line 1948
    .line 1949
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1950
    .line 1951
    .line 1952
    move-result v35

    .line 1953
    move-object/from16 v24, v7

    .line 1954
    .line 1955
    invoke-direct/range {v24 .. v37}, Lp0/h;-><init>(ILjava/lang/String;DDDDIILjava/nio/ByteBuffer;)V

    .line 1956
    .line 1957
    .line 1958
    iget-object v0, v3, LN/Q;->g:Ljava/lang/Object;

    .line 1959
    .line 1960
    check-cast v0, Lio/flutter/plugin/platform/n;

    .line 1961
    .line 1962
    invoke-virtual {v0, v7}, Lio/flutter/plugin/platform/n;->d(Lp0/h;)J

    .line 1963
    .line 1964
    .line 1965
    move-result-wide v3

    .line 1966
    const-wide/16 v7, -0x2

    .line 1967
    .line 1968
    cmp-long v0, v3, v7

    .line 1969
    .line 1970
    if-nez v0, :cond_39

    .line 1971
    .line 1972
    if-eqz v11, :cond_38

    .line 1973
    .line 1974
    invoke-virtual {v2, v6}, Lp0/k;->c(Ljava/lang/Object;)V

    .line 1975
    .line 1976
    .line 1977
    goto :goto_1f

    .line 1978
    :cond_38
    new-instance v0, Ljava/lang/AssertionError;

    .line 1979
    .line 1980
    const-string v3, "Platform view attempted to fall back to hybrid mode when not requested."

    .line 1981
    .line 1982
    invoke-direct {v0, v3}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 1983
    .line 1984
    .line 1985
    throw v0

    .line 1986
    :cond_39
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1987
    .line 1988
    .line 1989
    move-result-object v0

    .line 1990
    invoke-virtual {v2, v0}, Lp0/k;->c(Ljava/lang/Object;)V
    :try_end_12
    .catch Ljava/lang/IllegalStateException; {:try_start_12 .. :try_end_12} :catch_13

    .line 1991
    .line 1992
    .line 1993
    goto :goto_1f

    .line 1994
    :goto_1e
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1995
    .line 1996
    .line 1997
    move-result-object v0

    .line 1998
    invoke-virtual {v2, v15, v0, v6}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1999
    .line 2000
    .line 2001
    :goto_1f
    return-void

    .line 2002
    :pswitch_1b
    invoke-direct/range {p0 .. p2}, Lp0/b;->d(LN/Q;Lp0/k;)V

    .line 2003
    .line 2004
    .line 2005
    return-void

    .line 2006
    :pswitch_1c
    const-string v3, "Error when setting cursors: "

    .line 2007
    .line 2008
    iget-object v4, v1, Lp0/b;->f:Ljava/lang/Object;

    .line 2009
    .line 2010
    check-cast v4, Lp0/b;

    .line 2011
    .line 2012
    iget-object v5, v4, Lp0/b;->f:Ljava/lang/Object;

    .line 2013
    .line 2014
    check-cast v5, Lp0/b;

    .line 2015
    .line 2016
    if-nez v5, :cond_3a

    .line 2017
    .line 2018
    goto :goto_21

    .line 2019
    :cond_3a
    iget-object v5, v0, LN/Q;->f:Ljava/lang/Object;

    .line 2020
    .line 2021
    check-cast v5, Ljava/lang/String;

    .line 2022
    .line 2023
    :try_start_13
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 2024
    .line 2025
    .line 2026
    move-result v7

    .line 2027
    const v8, -0x4de8d908

    .line 2028
    .line 2029
    .line 2030
    if-eq v7, v8, :cond_3b

    .line 2031
    .line 2032
    goto :goto_21

    .line 2033
    :cond_3b
    const-string v7, "activateSystemCursor"

    .line 2034
    .line 2035
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2036
    .line 2037
    .line 2038
    move-result v5

    .line 2039
    if-eqz v5, :cond_3c

    .line 2040
    .line 2041
    iget-object v0, v0, LN/Q;->g:Ljava/lang/Object;

    .line 2042
    .line 2043
    check-cast v0, Ljava/util/HashMap;

    .line 2044
    .line 2045
    const-string v5, "kind"

    .line 2046
    .line 2047
    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2048
    .line 2049
    .line 2050
    move-result-object v0

    .line 2051
    check-cast v0, Ljava/lang/String;
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_14

    .line 2052
    .line 2053
    :try_start_14
    iget-object v4, v4, Lp0/b;->f:Ljava/lang/Object;

    .line 2054
    .line 2055
    check-cast v4, Lp0/b;

    .line 2056
    .line 2057
    invoke-virtual {v4, v0}, Lp0/b;->a(Ljava/lang/String;)V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_15

    .line 2058
    .line 2059
    .line 2060
    :try_start_15
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2061
    .line 2062
    invoke-virtual {v2, v0}, Lp0/k;->c(Ljava/lang/Object;)V

    .line 2063
    .line 2064
    .line 2065
    goto :goto_21

    .line 2066
    :catch_14
    move-exception v0

    .line 2067
    goto :goto_20

    .line 2068
    :catch_15
    move-exception v0

    .line 2069
    new-instance v4, Ljava/lang/StringBuilder;

    .line 2070
    .line 2071
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2072
    .line 2073
    .line 2074
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2075
    .line 2076
    .line 2077
    move-result-object v0

    .line 2078
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2079
    .line 2080
    .line 2081
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2082
    .line 2083
    .line 2084
    move-result-object v0

    .line 2085
    invoke-virtual {v2, v15, v0, v6}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_14

    .line 2086
    .line 2087
    .line 2088
    goto :goto_21

    .line 2089
    :goto_20
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2090
    .line 2091
    const-string v4, "Unhandled error: "

    .line 2092
    .line 2093
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2094
    .line 2095
    .line 2096
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2097
    .line 2098
    .line 2099
    move-result-object v0

    .line 2100
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2101
    .line 2102
    .line 2103
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2104
    .line 2105
    .line 2106
    move-result-object v0

    .line 2107
    invoke-virtual {v2, v15, v0, v6}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 2108
    .line 2109
    .line 2110
    :cond_3c
    :goto_21
    return-void

    .line 2111
    :pswitch_1d
    const-string v3, "locale"

    .line 2112
    .line 2113
    iget-object v4, v1, Lp0/b;->f:Ljava/lang/Object;

    .line 2114
    .line 2115
    check-cast v4, LN/Q;

    .line 2116
    .line 2117
    iget-object v5, v4, LN/Q;->g:Ljava/lang/Object;

    .line 2118
    .line 2119
    check-cast v5, Lp0/b;

    .line 2120
    .line 2121
    if-nez v5, :cond_3d

    .line 2122
    .line 2123
    goto :goto_24

    .line 2124
    :cond_3d
    iget-object v5, v0, LN/Q;->f:Ljava/lang/Object;

    .line 2125
    .line 2126
    check-cast v5, Ljava/lang/String;

    .line 2127
    .line 2128
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2129
    .line 2130
    .line 2131
    const-string v7, "Localization.getStringResource"

    .line 2132
    .line 2133
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2134
    .line 2135
    .line 2136
    move-result v5

    .line 2137
    if-nez v5, :cond_3e

    .line 2138
    .line 2139
    invoke-virtual/range {p2 .. p2}, Lp0/k;->b()V

    .line 2140
    .line 2141
    .line 2142
    goto :goto_24

    .line 2143
    :cond_3e
    iget-object v0, v0, LN/Q;->g:Ljava/lang/Object;

    .line 2144
    .line 2145
    check-cast v0, Lorg/json/JSONObject;

    .line 2146
    .line 2147
    :try_start_16
    const-string v5, "key"

    .line 2148
    .line 2149
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 2150
    .line 2151
    .line 2152
    move-result-object v5

    .line 2153
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 2154
    .line 2155
    .line 2156
    move-result v7

    .line 2157
    if-eqz v7, :cond_3f

    .line 2158
    .line 2159
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 2160
    .line 2161
    .line 2162
    move-result-object v0

    .line 2163
    goto :goto_22

    .line 2164
    :catch_16
    move-exception v0

    .line 2165
    goto :goto_23

    .line 2166
    :cond_3f
    move-object v0, v6

    .line 2167
    :goto_22
    iget-object v3, v4, LN/Q;->g:Ljava/lang/Object;

    .line 2168
    .line 2169
    check-cast v3, Lp0/b;

    .line 2170
    .line 2171
    invoke-virtual {v3, v5, v0}, Lp0/b;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2172
    .line 2173
    .line 2174
    move-result-object v0

    .line 2175
    invoke-virtual {v2, v0}, Lp0/k;->c(Ljava/lang/Object;)V
    :try_end_16
    .catch Lorg/json/JSONException; {:try_start_16 .. :try_end_16} :catch_16

    .line 2176
    .line 2177
    .line 2178
    goto :goto_24

    .line 2179
    :goto_23
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2180
    .line 2181
    .line 2182
    move-result-object v0

    .line 2183
    invoke-virtual {v2, v15, v0, v6}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 2184
    .line 2185
    .line 2186
    :goto_24
    return-void

    .line 2187
    :pswitch_1e
    iget-object v0, v1, Lp0/b;->f:Ljava/lang/Object;

    .line 2188
    .line 2189
    check-cast v0, LH/a;

    .line 2190
    .line 2191
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2192
    .line 2193
    .line 2194
    return-void

    .line 2195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1e
        :pswitch_0
        :pswitch_1d
        :pswitch_1c
        :pswitch_0
        :pswitch_1b
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_c
        :pswitch_0
        :pswitch_b
    .end packed-switch

    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    :sswitch_data_0
    .sparse-switch
        -0x6a0a6d0c -> :sswitch_9
        -0x3c861a16 -> :sswitch_8
        -0x23d2364 -> :sswitch_7
        0x101f2613 -> :sswitch_6
        0x102423ce -> :sswitch_5
        0x26b1e570 -> :sswitch_4
        0x47cf0f0b -> :sswitch_3
        0x66f8a3d9 -> :sswitch_2
        0x71834287 -> :sswitch_1
        0x7df775f0 -> :sswitch_0
    .end sparse-switch

    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    :pswitch_data_1
    .packed-switch 0x0
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
    .end packed-switch

    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    :sswitch_data_1
    .sparse-switch
        -0x2a11fcff -> :sswitch_c
        0x68dc8e5d -> :sswitch_b
        0x7e58a2bc -> :sswitch_a
    .end sparse-switch

    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
    .end packed-switch

    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    :sswitch_data_2
    .sparse-switch
        -0x509a5f04 -> :sswitch_14
        -0x3cc89b6d -> :sswitch_13
        -0x37b2634c -> :sswitch_12
        -0x2d106975 -> :sswitch_11
        -0x126acbb2 -> :sswitch_10
        0x696df3f -> :sswitch_f
        0x2261393d -> :sswitch_e
        0x63a5261f -> :sswitch_d
    .end sparse-switch

    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
    .end packed-switch
.end method

.method public g(LT0/e;Lz0/d;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LG/u;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p1, v1}, LG/u;-><init>(LT0/e;I)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lp0/b;->f:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, LT0/d;

    .line 10
    .line 11
    invoke-interface {p1, v0, p2}, LT0/d;->g(LT0/e;Lz0/d;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object p2, LA0/a;->e:LA0/a;

    .line 16
    .line 17
    if-ne p1, p2, :cond_0

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    sget-object p1, Lx0/g;->a:Lx0/g;

    .line 21
    .line 22
    return-object p1
.end method
