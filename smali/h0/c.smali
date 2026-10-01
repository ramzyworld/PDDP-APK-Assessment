.class public final Lh0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lio/flutter/embedding/engine/FlutterJNI;

.field public final b:Lio/flutter/embedding/engine/renderer/l;

.field public final c:Li0/b;

.field public final d:Lh0/e;

.field public final e:Lr0/b;

.field public final f:LN/b;

.field public final g:Lp0/d;

.field public final h:Lp0/b;

.field public final i:Lp0/a;

.field public final j:Lp0/a;

.field public final k:Lp0/l;

.field public final l:LN/Q;

.field public final m:Lp0/b;

.field public final n:Lp0/n;

.field public final o:Lp0/b;

.field public final p:Lp0/c;

.field public final q:LN/Q;

.field public final r:Lio/flutter/plugin/platform/o;

.field public final s:Ljava/util/HashSet;

.field public final t:Lh0/a;


# direct methods
.method public constructor <init>(Lg0/e;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/o;ZZ)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lh0/c;->s:Ljava/util/HashSet;

    .line 10
    .line 11
    new-instance v0, Lh0/a;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lh0/a;-><init>(Lh0/c;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lh0/c;->t:Lh0/a;

    .line 17
    .line 18
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 28
    .line 29
    .line 30
    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    goto :goto_0

    .line 32
    :catch_0
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :goto_0
    invoke-static {}, LN/b;->E()LN/b;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-nez p2, :cond_0

    .line 41
    .line 42
    iget-object p2, v1, LN/b;->f:Ljava/lang/Object;

    .line 43
    .line 44
    new-instance p2, Lio/flutter/embedding/engine/FlutterJNI;

    .line 45
    .line 46
    invoke-direct {p2}, Lio/flutter/embedding/engine/FlutterJNI;-><init>()V

    .line 47
    .line 48
    .line 49
    :cond_0
    iput-object p2, p0, Lh0/c;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 50
    .line 51
    new-instance v2, Li0/b;

    .line 52
    .line 53
    invoke-direct {v2, p2, v0}, Li0/b;-><init>(Lio/flutter/embedding/engine/FlutterJNI;Landroid/content/res/AssetManager;)V

    .line 54
    .line 55
    .line 56
    iput-object v2, p0, Lh0/c;->c:Li0/b;

    .line 57
    .line 58
    iget-object v0, v2, Li0/b;->h:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Li0/j;

    .line 61
    .line 62
    invoke-virtual {p2, v0}, Lio/flutter/embedding/engine/FlutterJNI;->setPlatformMessageHandler(Li0/k;)V

    .line 63
    .line 64
    .line 65
    invoke-static {}, LN/b;->E()LN/b;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    new-instance v0, LN/b;

    .line 73
    .line 74
    invoke-direct {v0, v2, p2}, LN/b;-><init>(Li0/b;Lio/flutter/embedding/engine/FlutterJNI;)V

    .line 75
    .line 76
    .line 77
    iput-object v0, p0, Lh0/c;->f:LN/b;

    .line 78
    .line 79
    new-instance v0, LH/a;

    .line 80
    .line 81
    invoke-direct {v0, v2}, LH/a;-><init>(Li0/b;)V

    .line 82
    .line 83
    .line 84
    new-instance v0, Lp0/d;

    .line 85
    .line 86
    invoke-direct {v0, v2}, Lp0/d;-><init>(Li0/b;)V

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, Lh0/c;->g:Lp0/d;

    .line 90
    .line 91
    new-instance v0, LN/Q;

    .line 92
    .line 93
    const/16 v3, 0xd

    .line 94
    .line 95
    invoke-direct {v0, v2, v3}, LN/Q;-><init>(Li0/b;I)V

    .line 96
    .line 97
    .line 98
    new-instance v3, Lp0/b;

    .line 99
    .line 100
    const/4 v4, 0x4

    .line 101
    invoke-direct {v3, v2, v4}, Lp0/b;-><init>(Li0/b;I)V

    .line 102
    .line 103
    .line 104
    iput-object v3, p0, Lh0/c;->h:Lp0/b;

    .line 105
    .line 106
    new-instance v3, Lp0/a;

    .line 107
    .line 108
    const/4 v4, 0x1

    .line 109
    invoke-direct {v3, v2, v4}, Lp0/a;-><init>(Li0/b;I)V

    .line 110
    .line 111
    .line 112
    iput-object v3, p0, Lh0/c;->i:Lp0/a;

    .line 113
    .line 114
    new-instance v3, Lp0/a;

    .line 115
    .line 116
    const/4 v4, 0x0

    .line 117
    invoke-direct {v3, v2, v4}, Lp0/a;-><init>(Li0/b;I)V

    .line 118
    .line 119
    .line 120
    iput-object v3, p0, Lh0/c;->j:Lp0/a;

    .line 121
    .line 122
    new-instance v3, LN/Q;

    .line 123
    .line 124
    const/16 v4, 0xe

    .line 125
    .line 126
    invoke-direct {v3, v2, v4}, LN/Q;-><init>(Li0/b;I)V

    .line 127
    .line 128
    .line 129
    iput-object v3, p0, Lh0/c;->l:LN/Q;

    .line 130
    .line 131
    new-instance v3, LN/Q;

    .line 132
    .line 133
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-direct {v3, v2, v4}, LN/Q;-><init>(Li0/b;Landroid/content/pm/PackageManager;)V

    .line 138
    .line 139
    .line 140
    new-instance v4, Lp0/l;

    .line 141
    .line 142
    invoke-direct {v4, v2, p5}, Lp0/l;-><init>(Li0/b;Z)V

    .line 143
    .line 144
    .line 145
    iput-object v4, p0, Lh0/c;->k:Lp0/l;

    .line 146
    .line 147
    new-instance p5, Lp0/b;

    .line 148
    .line 149
    const/16 v4, 0xa

    .line 150
    .line 151
    invoke-direct {p5, v2, v4}, Lp0/b;-><init>(Li0/b;I)V

    .line 152
    .line 153
    .line 154
    iput-object p5, p0, Lh0/c;->m:Lp0/b;

    .line 155
    .line 156
    new-instance p5, Lp0/n;

    .line 157
    .line 158
    invoke-direct {p5, v2}, Lp0/n;-><init>(Li0/b;)V

    .line 159
    .line 160
    .line 161
    iput-object p5, p0, Lh0/c;->n:Lp0/n;

    .line 162
    .line 163
    new-instance p5, Lp0/b;

    .line 164
    .line 165
    const/16 v4, 0xc

    .line 166
    .line 167
    invoke-direct {p5, v2, v4}, Lp0/b;-><init>(Li0/b;I)V

    .line 168
    .line 169
    .line 170
    iput-object p5, p0, Lh0/c;->o:Lp0/b;

    .line 171
    .line 172
    new-instance p5, Lp0/c;

    .line 173
    .line 174
    invoke-direct {p5, v2}, Lp0/c;-><init>(Li0/b;)V

    .line 175
    .line 176
    .line 177
    iput-object p5, p0, Lh0/c;->p:Lp0/c;

    .line 178
    .line 179
    new-instance p5, LN/Q;

    .line 180
    .line 181
    const/16 v4, 0x12

    .line 182
    .line 183
    invoke-direct {p5, v2, v4}, LN/Q;-><init>(Li0/b;I)V

    .line 184
    .line 185
    .line 186
    iput-object p5, p0, Lh0/c;->q:LN/Q;

    .line 187
    .line 188
    new-instance p5, Lr0/b;

    .line 189
    .line 190
    invoke-direct {p5, p1, v0}, Lr0/b;-><init>(Lg0/e;LN/Q;)V

    .line 191
    .line 192
    .line 193
    iput-object p5, p0, Lh0/c;->e:Lr0/b;

    .line 194
    .line 195
    iget-object v0, v1, LN/b;->g:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v0, Lk0/d;

    .line 198
    .line 199
    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    const/4 v4, 0x0

    .line 204
    if-nez v2, :cond_1

    .line 205
    .line 206
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    invoke-virtual {v0, v2}, Lk0/d;->b(Landroid/content/Context;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, p1, v4}, Lk0/d;->a(Landroid/content/Context;[Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    :cond_1
    iget-object v2, p0, Lh0/c;->t:Lh0/a;

    .line 217
    .line 218
    invoke-virtual {p2, v2}, Lio/flutter/embedding/engine/FlutterJNI;->addEngineLifecycleListener(Lh0/b;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p2, p3}, Lio/flutter/embedding/engine/FlutterJNI;->setPlatformViewsController(Lio/flutter/plugin/platform/o;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p2, p5}, Lio/flutter/embedding/engine/FlutterJNI;->setLocalizationPlugin(Lr0/b;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    invoke-virtual {p2, v4}, Lio/flutter/embedding/engine/FlutterJNI;->setDeferredComponentManager(Lj0/a;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    if-nez v1, :cond_3

    .line 238
    .line 239
    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterJNI;->attachToNative()V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    if-eqz v1, :cond_2

    .line 247
    .line 248
    goto :goto_1

    .line 249
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    .line 250
    .line 251
    const-string p2, "FlutterEngine failed to attach to its native Object reference."

    .line 252
    .line 253
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    throw p1

    .line 257
    :cond_3
    :goto_1
    new-instance v1, Lio/flutter/embedding/engine/renderer/l;

    .line 258
    .line 259
    invoke-direct {v1, p2}, Lio/flutter/embedding/engine/renderer/l;-><init>(Lio/flutter/embedding/engine/FlutterJNI;)V

    .line 260
    .line 261
    .line 262
    iput-object v1, p0, Lh0/c;->b:Lio/flutter/embedding/engine/renderer/l;

    .line 263
    .line 264
    iput-object p3, p0, Lh0/c;->r:Lio/flutter/plugin/platform/o;

    .line 265
    .line 266
    new-instance p2, Lh0/e;

    .line 267
    .line 268
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 269
    .line 270
    .line 271
    move-result-object p3

    .line 272
    invoke-direct {p2, p3, p0, v0}, Lh0/e;-><init>(Landroid/content/Context;Lh0/c;Lk0/d;)V

    .line 273
    .line 274
    .line 275
    iput-object p2, p0, Lh0/c;->d:Lh0/e;

    .line 276
    .line 277
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 278
    .line 279
    .line 280
    move-result-object p3

    .line 281
    invoke-virtual {p3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 282
    .line 283
    .line 284
    move-result-object p3

    .line 285
    invoke-virtual {p5, p3}, Lr0/b;->b(Landroid/content/res/Configuration;)V

    .line 286
    .line 287
    .line 288
    if-eqz p4, :cond_4

    .line 289
    .line 290
    iget-object p3, v0, Lk0/d;->d:Li0/b;

    .line 291
    .line 292
    iget-boolean p3, p3, Li0/b;->e:Z

    .line 293
    .line 294
    if-eqz p3, :cond_4

    .line 295
    .line 296
    invoke-static {p0}, La1/a;->v(Lh0/c;)V

    .line 297
    .line 298
    .line 299
    :cond_4
    invoke-static {p1, p0}, La/a;->a(Landroid/content/Context;Lh0/c;)V

    .line 300
    .line 301
    .line 302
    new-instance p1, Lt0/a;

    .line 303
    .line 304
    invoke-direct {p1, v3}, Lt0/a;-><init>(LN/Q;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {p2, p1}, Lh0/e;->a(Lm0/a;)V

    .line 308
    .line 309
    .line 310
    return-void
.end method
