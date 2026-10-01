.class public final synthetic Lv0/z;
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
    iput p2, p0, Lv0/z;->e:I

    iput-object p1, p0, Lv0/z;->f:Lv0/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/Object;LN/Q;)V
    .locals 5

    .line 1
    iget v0, p0, Lv0/z;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv0/z;->f:Lv0/i;

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
    const-string v2, "null cannot be cast to non-null type android.webkit.CookieManager"

    .line 21
    .line 22
    invoke-static {v1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    check-cast v1, Landroid/webkit/CookieManager;

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const-string v3, "null cannot be cast to non-null type android.webkit.WebView"

    .line 33
    .line 34
    invoke-static {v2, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    check-cast v2, Landroid/webkit/WebView;

    .line 38
    .line 39
    const/4 v3, 0x2

    .line 40
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-string v3, "null cannot be cast to non-null type kotlin.Boolean"

    .line 45
    .line 46
    invoke-static {p1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    check-cast p1, Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v2, p1}, Landroid/webkit/CookieManager;->setAcceptThirdPartyCookies(Landroid/webkit/WebView;Z)V

    .line 59
    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    goto :goto_0

    .line 67
    :catchall_0
    move-exception p1

    .line 68
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    :goto_0
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :pswitch_0
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 77
    .line 78
    invoke-static {p1, v0}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    check-cast p1, Ljava/util/List;

    .line 82
    .line 83
    const/4 v0, 0x0

    .line 84
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    const-string v0, "null cannot be cast to non-null type android.webkit.CookieManager"

    .line 89
    .line 90
    invoke-static {p1, v0}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    check-cast p1, Landroid/webkit/CookieManager;

    .line 94
    .line 95
    new-instance v0, Lv0/A;

    .line 96
    .line 97
    const/4 v1, 0x0

    .line 98
    invoke-direct {v0, p2, v1}, Lv0/A;-><init>(LN/Q;I)V

    .line 99
    .line 100
    .line 101
    iget-object p2, p0, Lv0/z;->f:Lv0/i;

    .line 102
    .line 103
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    new-instance p2, Lv0/l;

    .line 107
    .line 108
    const/4 v1, 0x0

    .line 109
    invoke-direct {p2, v0, v1}, Lv0/l;-><init>(LI0/j;I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, p2}, Landroid/webkit/CookieManager;->removeAllCookies(Landroid/webkit/ValueCallback;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :pswitch_1
    iget-object v0, p0, Lv0/z;->f:Lv0/i;

    .line 117
    .line 118
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 119
    .line 120
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    check-cast p1, Ljava/util/List;

    .line 124
    .line 125
    const/4 v1, 0x0

    .line 126
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    const-string v2, "null cannot be cast to non-null type android.webkit.CookieManager"

    .line 131
    .line 132
    invoke-static {v1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    check-cast v1, Landroid/webkit/CookieManager;

    .line 136
    .line 137
    const/4 v2, 0x1

    .line 138
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    const-string v3, "null cannot be cast to non-null type kotlin.String"

    .line 143
    .line 144
    invoke-static {v2, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    check-cast v2, Ljava/lang/String;

    .line 148
    .line 149
    const/4 v4, 0x2

    .line 150
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-static {p1, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    check-cast p1, Ljava/lang/String;

    .line 158
    .line 159
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1, v2, p1}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    const/4 p1, 0x0

    .line 166
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 170
    goto :goto_1

    .line 171
    :catchall_1
    move-exception p1

    .line 172
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    :goto_1
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :pswitch_2
    iget-object v0, p0, Lv0/z;->f:Lv0/i;

    .line 181
    .line 182
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 183
    .line 184
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    check-cast p1, Ljava/util/List;

    .line 188
    .line 189
    const/4 v1, 0x0

    .line 190
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    const-string v1, "null cannot be cast to non-null type kotlin.Long"

    .line 195
    .line 196
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    check-cast p1, Ljava/lang/Long;

    .line 200
    .line 201
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 202
    .line 203
    .line 204
    move-result-wide v1

    .line 205
    :try_start_2
    iget-object p1, v0, Lv0/i;->a:Lv/d;

    .line 206
    .line 207
    iget-object p1, p1, Lv/d;->c:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast p1, Lv0/c;

    .line 210
    .line 211
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-virtual {p1, v1, v2, v0}, Lv0/c;->a(JLjava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    const/4 p1, 0x0

    .line 219
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 220
    .line 221
    .line 222
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 223
    goto :goto_2

    .line 224
    :catchall_2
    move-exception p1

    .line 225
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    :goto_2
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    return-void

    .line 233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
