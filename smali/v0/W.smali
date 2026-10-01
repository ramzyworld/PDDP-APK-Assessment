.class public final synthetic Lv0/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Landroid/webkit/WebViewClient;

.field public final synthetic g:Landroid/webkit/WebView;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lv0/W;->e:I

    iput-object p1, p0, Lv0/W;->f:Landroid/webkit/WebViewClient;

    iput-object p2, p0, Lv0/W;->g:Landroid/webkit/WebView;

    iput-object p3, p0, Lv0/W;->h:Ljava/lang/Object;

    iput-object p4, p0, Lv0/W;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x4

    .line 6
    const/4 v4, 0x0

    .line 7
    const-string v5, "requestArg"

    .line 8
    .line 9
    const-string v6, "webViewArg"

    .line 10
    .line 11
    iget-object v7, v0, Lv0/W;->g:Landroid/webkit/WebView;

    .line 12
    .line 13
    const/4 v8, 0x2

    .line 14
    const/4 v9, 0x3

    .line 15
    iget-object v10, v0, Lv0/W;->i:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v11, v0, Lv0/W;->h:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v12, v0, Lv0/W;->f:Landroid/webkit/WebViewClient;

    .line 20
    .line 21
    iget v13, v0, Lv0/W;->e:I

    .line 22
    .line 23
    packed-switch v13, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    new-instance v1, Lv0/n;

    .line 27
    .line 28
    invoke-direct {v1, v9}, Lv0/n;-><init>(I)V

    .line 29
    .line 30
    .line 31
    move-object v15, v12

    .line 32
    check-cast v15, Lv0/d0;

    .line 33
    .line 34
    iget-object v14, v15, Lv0/d0;->a:Lv0/i;

    .line 35
    .line 36
    iget-object v2, v0, Lv0/W;->g:Landroid/webkit/WebView;

    .line 37
    .line 38
    move-object/from16 v17, v11

    .line 39
    .line 40
    check-cast v17, Landroid/webkit/WebResourceRequest;

    .line 41
    .line 42
    move-object/from16 v18, v10

    .line 43
    .line 44
    check-cast v18, Landroid/webkit/WebResourceResponse;

    .line 45
    .line 46
    move-object/from16 v16, v2

    .line 47
    .line 48
    move-object/from16 v19, v1

    .line 49
    .line 50
    invoke-virtual/range {v14 .. v19}, Lv0/i;->j(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;LH0/l;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_0
    check-cast v10, Landroid/webkit/WebResourceError;

    .line 55
    .line 56
    new-instance v13, Lv0/n;

    .line 57
    .line 58
    invoke-direct {v13, v9}, Lv0/n;-><init>(I)V

    .line 59
    .line 60
    .line 61
    check-cast v12, Lv0/d0;

    .line 62
    .line 63
    iget-object v14, v12, Lv0/d0;->a:Lv0/i;

    .line 64
    .line 65
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-static {v7, v6}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    check-cast v11, Landroid/webkit/WebResourceRequest;

    .line 72
    .line 73
    invoke-static {v11, v5}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const-string v5, "errorArg"

    .line 77
    .line 78
    invoke-static {v10, v5}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-object v5, v14, Lv0/i;->a:Lv/d;

    .line 82
    .line 83
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5}, Lv/d;->a()Lq0/j;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    new-instance v14, LG/n;

    .line 91
    .line 92
    const-string v15, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError"

    .line 93
    .line 94
    iget-object v5, v5, Lv/d;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v5, Lq0/f;

    .line 97
    .line 98
    invoke-direct {v14, v5, v15, v6, v4}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    new-array v3, v3, [Ljava/lang/Object;

    .line 102
    .line 103
    aput-object v12, v3, v2

    .line 104
    .line 105
    aput-object v7, v3, v1

    .line 106
    .line 107
    aput-object v11, v3, v8

    .line 108
    .line 109
    aput-object v10, v3, v9

    .line 110
    .line 111
    invoke-static {v3}, Ly0/e;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    new-instance v2, Lv0/H;

    .line 116
    .line 117
    const/16 v3, 0x11

    .line 118
    .line 119
    invoke-direct {v2, v3, v13}, Lv0/H;-><init>(ILjava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v14, v1, v2}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :pswitch_1
    new-instance v1, Lv0/n;

    .line 127
    .line 128
    invoke-direct {v1, v9}, Lv0/n;-><init>(I)V

    .line 129
    .line 130
    .line 131
    move-object v5, v12

    .line 132
    check-cast v5, Lv0/d0;

    .line 133
    .line 134
    iget-object v4, v5, Lv0/d0;->a:Lv0/i;

    .line 135
    .line 136
    iget-object v6, v0, Lv0/W;->g:Landroid/webkit/WebView;

    .line 137
    .line 138
    move-object v7, v11

    .line 139
    check-cast v7, Landroid/webkit/SslErrorHandler;

    .line 140
    .line 141
    move-object v8, v10

    .line 142
    check-cast v8, Landroid/net/http/SslError;

    .line 143
    .line 144
    move-object v9, v1

    .line 145
    invoke-virtual/range {v4 .. v9}, Lv0/i;->l(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;LH0/l;)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :pswitch_2
    new-instance v14, Lv0/n;

    .line 150
    .line 151
    invoke-direct {v14, v9}, Lv0/n;-><init>(I)V

    .line 152
    .line 153
    .line 154
    move-object v1, v12

    .line 155
    check-cast v1, Lv0/d0;

    .line 156
    .line 157
    iget-object v9, v1, Lv0/d0;->a:Lv0/i;

    .line 158
    .line 159
    iget-object v2, v0, Lv0/W;->g:Landroid/webkit/WebView;

    .line 160
    .line 161
    move-object v12, v11

    .line 162
    check-cast v12, Landroid/os/Message;

    .line 163
    .line 164
    move-object v13, v10

    .line 165
    check-cast v13, Landroid/os/Message;

    .line 166
    .line 167
    move-object v10, v1

    .line 168
    move-object v11, v2

    .line 169
    invoke-virtual/range {v9 .. v14}, Lv0/i;->b(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/os/Message;Landroid/os/Message;LH0/l;)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :pswitch_3
    new-instance v1, Lv0/n;

    .line 174
    .line 175
    invoke-direct {v1, v8}, Lv0/n;-><init>(I)V

    .line 176
    .line 177
    .line 178
    move-object v4, v12

    .line 179
    check-cast v4, Lv0/b0;

    .line 180
    .line 181
    iget-object v3, v4, Lv0/b0;->b:Lv0/i;

    .line 182
    .line 183
    iget-object v5, v0, Lv0/W;->g:Landroid/webkit/WebView;

    .line 184
    .line 185
    move-object v6, v11

    .line 186
    check-cast v6, Landroid/webkit/SslErrorHandler;

    .line 187
    .line 188
    move-object v7, v10

    .line 189
    check-cast v7, Landroid/net/http/SslError;

    .line 190
    .line 191
    move-object v8, v1

    .line 192
    invoke-virtual/range {v3 .. v8}, Lv0/i;->l(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;LH0/l;)V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :pswitch_4
    new-instance v13, Lv0/n;

    .line 197
    .line 198
    invoke-direct {v13, v8}, Lv0/n;-><init>(I)V

    .line 199
    .line 200
    .line 201
    move-object v9, v12

    .line 202
    check-cast v9, Lv0/b0;

    .line 203
    .line 204
    iget-object v8, v9, Lv0/b0;->b:Lv0/i;

    .line 205
    .line 206
    iget-object v1, v0, Lv0/W;->g:Landroid/webkit/WebView;

    .line 207
    .line 208
    check-cast v11, Landroid/os/Message;

    .line 209
    .line 210
    move-object v12, v10

    .line 211
    check-cast v12, Landroid/os/Message;

    .line 212
    .line 213
    move-object v10, v1

    .line 214
    invoke-virtual/range {v8 .. v13}, Lv0/i;->b(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/os/Message;Landroid/os/Message;LH0/l;)V

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    :pswitch_5
    new-instance v7, Lv0/n;

    .line 219
    .line 220
    invoke-direct {v7, v8}, Lv0/n;-><init>(I)V

    .line 221
    .line 222
    .line 223
    move-object v3, v12

    .line 224
    check-cast v3, Lv0/b0;

    .line 225
    .line 226
    iget-object v2, v3, Lv0/b0;->b:Lv0/i;

    .line 227
    .line 228
    iget-object v4, v0, Lv0/W;->g:Landroid/webkit/WebView;

    .line 229
    .line 230
    move-object v5, v11

    .line 231
    check-cast v5, Landroid/webkit/WebResourceRequest;

    .line 232
    .line 233
    move-object v6, v10

    .line 234
    check-cast v6, Landroid/webkit/WebResourceResponse;

    .line 235
    .line 236
    invoke-virtual/range {v2 .. v7}, Lv0/i;->j(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;LH0/l;)V

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    :pswitch_6
    new-instance v13, Lv0/n;

    .line 241
    .line 242
    invoke-direct {v13, v8}, Lv0/n;-><init>(I)V

    .line 243
    .line 244
    .line 245
    check-cast v12, Lv0/b0;

    .line 246
    .line 247
    iget-object v14, v12, Lv0/b0;->b:Lv0/i;

    .line 248
    .line 249
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    invoke-static {v7, v6}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    check-cast v11, Landroid/webkit/WebResourceRequest;

    .line 256
    .line 257
    invoke-static {v11, v5}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    check-cast v10, LT/i;

    .line 261
    .line 262
    iget-object v5, v14, Lv0/i;->a:Lv/d;

    .line 263
    .line 264
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v5}, Lv/d;->a()Lq0/j;

    .line 268
    .line 269
    .line 270
    move-result-object v6

    .line 271
    new-instance v14, LG/n;

    .line 272
    .line 273
    const-string v15, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestErrorCompat"

    .line 274
    .line 275
    iget-object v5, v5, Lv/d;->b:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v5, Lq0/f;

    .line 278
    .line 279
    invoke-direct {v14, v5, v15, v6, v4}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    new-array v3, v3, [Ljava/lang/Object;

    .line 283
    .line 284
    aput-object v12, v3, v2

    .line 285
    .line 286
    aput-object v7, v3, v1

    .line 287
    .line 288
    aput-object v11, v3, v8

    .line 289
    .line 290
    aput-object v10, v3, v9

    .line 291
    .line 292
    invoke-static {v3}, Ly0/e;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    new-instance v2, Lv0/H;

    .line 297
    .line 298
    const/16 v3, 0x10

    .line 299
    .line 300
    invoke-direct {v2, v3, v13}, Lv0/H;-><init>(ILjava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v14, v1, v2}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 304
    .line 305
    .line 306
    return-void

    .line 307
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
