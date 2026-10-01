.class public final synthetic Lg0/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq0/c;
.implements Lq0/b;
.implements Lw0/b;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lg0/t;->e:I

    iput-object p2, p0, Lg0/t;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    iget-object v2, p0, Lg0/t;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, [Ljava/lang/Class;

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-ge v1, v3, :cond_1

    .line 9
    .line 10
    aget-object v2, v2, v1

    .line 11
    .line 12
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    :goto_1
    return v0
.end method

.method public b(Ljava/lang/Object;)V
    .locals 8

    .line 1
    iget v0, p0, Lg0/t;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg0/t;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lv0/h;

    .line 9
    .line 10
    instance-of v1, p1, Ljava/util/List;

    .line 11
    .line 12
    const-string v2, "PigeonProxyApiRegistrar"

    .line 13
    .line 14
    const-string v3, "Failed to remove Dart strong reference with identifier: "

    .line 15
    .line 16
    iget-wide v4, v0, Lv0/h;->f:J

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    check-cast p1, Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x1

    .line 27
    if-le v0, v1, :cond_1

    .line 28
    .line 29
    new-instance v0, Lv0/a;

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    const-string v7, "null cannot be cast to non-null type kotlin.String"

    .line 37
    .line 38
    invoke-static {v6, v7}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    check-cast v6, Ljava/lang/String;

    .line 42
    .line 43
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {v1, v7}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    check-cast v1, Ljava/lang/String;

    .line 51
    .line 52
    const/4 v7, 0x2

    .line 53
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Ljava/lang/String;

    .line 58
    .line 59
    invoke-direct {v0, v6, v1, p1}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 63
    .line 64
    .line 65
    new-instance p1, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    new-instance p1, Lv0/a;

    .line 82
    .line 83
    const-string v0, ""

    .line 84
    .line 85
    const-string v1, "channel-error"

    .line 86
    .line 87
    const-string v6, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference\'."

    .line 88
    .line 89
    invoke-direct {p1, v1, v6, v0}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-static {p1}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 93
    .line 94
    .line 95
    new-instance p1, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    :cond_1
    :goto_0
    return-void

    .line 111
    :pswitch_0
    const/4 v0, 0x0

    .line 112
    if-eqz p1, :cond_2

    .line 113
    .line 114
    :try_start_0
    check-cast p1, Lorg/json/JSONObject;

    .line 115
    .line 116
    const-string v1, "handled"

    .line 117
    .line 118
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 119
    .line 120
    .line 121
    move-result v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    goto :goto_1

    .line 123
    :catch_0
    move-exception p1

    .line 124
    new-instance v1, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    const-string v2, "Unable to unpack JSON message: "

    .line 127
    .line 128
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    const-string v1, "KeyEventChannel"

    .line 139
    .line 140
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    :cond_2
    :goto_1
    iget-object p1, p0, Lg0/t;->f:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast p1, Lg0/t;

    .line 146
    .line 147
    iget-object p1, p1, Lg0/t;->f:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast p1, Lg0/z;

    .line 150
    .line 151
    invoke-virtual {p1, v0}, Lg0/z;->a(Z)V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public o(Ljava/lang/Object;LN/Q;)V
    .locals 5

    .line 1
    iget v0, p0, Lg0/t;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg0/t;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lv0/i;

    .line 9
    .line 10
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 11
    .line 12
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    check-cast p1, Ljava/util/List;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v1, "null cannot be cast to non-null type kotlin.Long"

    .line 23
    .line 24
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    check-cast p1, Ljava/lang/Long;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 30
    .line 31
    .line 32
    move-result-wide v1

    .line 33
    :try_start_0
    iget-object p1, v0, Lv0/i;->a:Lv/d;

    .line 34
    .line 35
    iget-object p1, p1, Lv/d;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Lv0/c;

    .line 38
    .line 39
    invoke-static {}, Landroid/webkit/WebStorage;->getInstance()Landroid/webkit/WebStorage;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p1, v1, v2, v0}, Lv0/c;->a(JLjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    :goto_0
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_0
    iget-object v0, p0, Lg0/t;->f:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Lv0/i;

    .line 64
    .line 65
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 66
    .line 67
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    check-cast p1, Ljava/util/List;

    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    const-string v3, "null cannot be cast to non-null type android.net.http.SslError"

    .line 78
    .line 79
    invoke-static {v2, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    check-cast v2, Landroid/net/http/SslError;

    .line 83
    .line 84
    const/4 v3, 0x1

    .line 85
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    const-string v4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.SslErrorType"

    .line 90
    .line 91
    invoke-static {p1, v4}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    check-cast p1, Lv0/O;

    .line 95
    .line 96
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    packed-switch v4, :pswitch_data_1

    .line 101
    .line 102
    .line 103
    const/4 v1, -0x1

    .line 104
    goto :goto_1

    .line 105
    :pswitch_1
    iget-object v0, v0, Lv0/i;->a:Lv/d;

    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 111
    .line 112
    new-instance v1, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string p1, " doesn\'t represent a native value."

    .line 121
    .line 122
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v0

    .line 133
    :pswitch_2
    const/4 v1, 0x3

    .line 134
    goto :goto_1

    .line 135
    :pswitch_3
    const/4 v1, 0x5

    .line 136
    goto :goto_1

    .line 137
    :pswitch_4
    const/4 v1, 0x2

    .line 138
    goto :goto_1

    .line 139
    :pswitch_5
    const/4 v1, 0x1

    .line 140
    goto :goto_1

    .line 141
    :pswitch_6
    const/4 v1, 0x4

    .line 142
    :goto_1
    :pswitch_7
    invoke-virtual {v2, v1}, Landroid/net/http/SslError;->hasError(I)Z

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 154
    goto :goto_2

    .line 155
    :catchall_1
    move-exception p1

    .line 156
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    :goto_2
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :pswitch_8
    iget-object v0, p0, Lg0/t;->f:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v0, Lv0/i;

    .line 167
    .line 168
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 169
    .line 170
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    check-cast p1, Ljava/util/List;

    .line 174
    .line 175
    const/4 v1, 0x0

    .line 176
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    const-string v2, "null cannot be cast to non-null type kotlin.Long"

    .line 181
    .line 182
    invoke-static {v1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    check-cast v1, Ljava/lang/Long;

    .line 186
    .line 187
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 188
    .line 189
    .line 190
    move-result-wide v1

    .line 191
    const/4 v3, 0x1

    .line 192
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    const-string v3, "null cannot be cast to non-null type kotlin.String"

    .line 197
    .line 198
    invoke-static {p1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    check-cast p1, Ljava/lang/String;

    .line 202
    .line 203
    :try_start_2
    iget-object v3, v0, Lv0/i;->a:Lv/d;

    .line 204
    .line 205
    iget-object v3, v3, Lv/d;->c:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v3, Lv0/c;

    .line 208
    .line 209
    new-instance v4, Lv0/t;

    .line 210
    .line 211
    invoke-direct {v4, p1, v0}, Lv0/t;-><init>(Ljava/lang/String;Lv0/i;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v3, v1, v2, v4}, Lv0/c;->a(JLjava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    const/4 p1, 0x0

    .line 218
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 219
    .line 220
    .line 221
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 222
    goto :goto_3

    .line 223
    :catchall_2
    move-exception p1

    .line 224
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    :goto_3
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    return-void

    .line 232
    :pswitch_9
    iget-object v0, p0, Lg0/t;->f:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v0, Lv0/i;

    .line 235
    .line 236
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 237
    .line 238
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    check-cast p1, Ljava/util/List;

    .line 242
    .line 243
    const/4 v1, 0x0

    .line 244
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    const-string v1, "null cannot be cast to non-null type kotlin.Long"

    .line 249
    .line 250
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    check-cast p1, Ljava/lang/Long;

    .line 254
    .line 255
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 256
    .line 257
    .line 258
    move-result-wide v1

    .line 259
    :try_start_3
    iget-object p1, v0, Lv0/i;->a:Lv/d;

    .line 260
    .line 261
    iget-object p1, p1, Lv/d;->c:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast p1, Lv0/c;

    .line 264
    .line 265
    new-instance v3, Lv0/o;

    .line 266
    .line 267
    invoke-direct {v3, v0}, Lv0/o;-><init>(Lv0/i;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {p1, v1, v2, v3}, Lv0/c;->a(JLjava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    const/4 p1, 0x0

    .line 274
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 275
    .line 276
    .line 277
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 278
    goto :goto_4

    .line 279
    :catchall_3
    move-exception p1

    .line 280
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    :goto_4
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    return-void

    .line 288
    nop

    .line 289
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_9
        :pswitch_8
        :pswitch_0
    .end packed-switch

    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_7
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
