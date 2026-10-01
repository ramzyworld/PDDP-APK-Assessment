.class public final Lio/flutter/embedding/engine/renderer/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lio/flutter/embedding/engine/FlutterJNI;

.field public final b:Ljava/util/concurrent/atomic/AtomicLong;

.field public c:Landroid/view/Surface;

.field public d:Z

.field public final e:Landroid/os/Handler;

.field public final f:Ljava/util/HashSet;

.field public final g:Ljava/util/ArrayList;

.field public final h:Lio/flutter/embedding/engine/renderer/a;


# direct methods
.method public constructor <init>(Lio/flutter/embedding/engine/FlutterJNI;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lio/flutter/embedding/engine/renderer/l;->b:Ljava/util/concurrent/atomic/AtomicLong;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, Lio/flutter/embedding/engine/renderer/l;->d:Z

    .line 15
    .line 16
    new-instance v1, Landroid/os/Handler;

    .line 17
    .line 18
    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Lio/flutter/embedding/engine/renderer/l;->e:Landroid/os/Handler;

    .line 22
    .line 23
    new-instance v1, Ljava/util/HashSet;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lio/flutter/embedding/engine/renderer/l;->f:Ljava/util/HashSet;

    .line 29
    .line 30
    new-instance v1, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lio/flutter/embedding/engine/renderer/l;->g:Ljava/util/ArrayList;

    .line 36
    .line 37
    new-instance v1, Lio/flutter/embedding/engine/renderer/a;

    .line 38
    .line 39
    invoke-direct {v1, p0}, Lio/flutter/embedding/engine/renderer/a;-><init>(Lio/flutter/embedding/engine/renderer/l;)V

    .line 40
    .line 41
    .line 42
    iput-object v1, p0, Lio/flutter/embedding/engine/renderer/l;->h:Lio/flutter/embedding/engine/renderer/a;

    .line 43
    .line 44
    iput-object p1, p0, Lio/flutter/embedding/engine/renderer/l;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 45
    .line 46
    invoke-virtual {p1, v1}, Lio/flutter/embedding/engine/FlutterJNI;->addIsDisplayingFlutterUiListener(Lio/flutter/embedding/engine/renderer/m;)V

    .line 47
    .line 48
    .line 49
    sget-object p1, Landroidx/lifecycle/s;->m:Landroidx/lifecycle/s;

    .line 50
    .line 51
    iget-object p1, p1, Landroidx/lifecycle/s;->j:Landroidx/lifecycle/n;

    .line 52
    .line 53
    new-instance v1, Lio/flutter/embedding/engine/renderer/b;

    .line 54
    .line 55
    invoke-direct {v1, p0}, Lio/flutter/embedding/engine/renderer/b;-><init>(Lio/flutter/embedding/engine/renderer/l;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    const-string v2, "addObserver"

    .line 62
    .line 63
    invoke-virtual {p1, v2}, Landroidx/lifecycle/n;->b(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object v2, p1, Landroidx/lifecycle/n;->c:Landroidx/lifecycle/g;

    .line 67
    .line 68
    sget-object v3, Landroidx/lifecycle/g;->e:Landroidx/lifecycle/g;

    .line 69
    .line 70
    if-ne v2, v3, :cond_0

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    sget-object v3, Landroidx/lifecycle/g;->f:Landroidx/lifecycle/g;

    .line 74
    .line 75
    :goto_0
    new-instance v2, Landroidx/lifecycle/m;

    .line 76
    .line 77
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 78
    .line 79
    .line 80
    sget v4, Landroidx/lifecycle/o;->a:I

    .line 81
    .line 82
    const/4 v4, 0x0

    .line 83
    new-instance v5, Landroidx/lifecycle/b;

    .line 84
    .line 85
    invoke-direct {v5, v1, v4}, Landroidx/lifecycle/b;-><init>(Lio/flutter/embedding/engine/renderer/b;Landroidx/lifecycle/b;)V

    .line 86
    .line 87
    .line 88
    iput-object v5, v2, Landroidx/lifecycle/m;->b:Landroidx/lifecycle/b;

    .line 89
    .line 90
    iput-object v3, v2, Landroidx/lifecycle/m;->a:Landroidx/lifecycle/g;

    .line 91
    .line 92
    iget-object v3, p1, Landroidx/lifecycle/n;->b:Ll/a;

    .line 93
    .line 94
    iget-object v5, v3, Ll/a;->i:Ljava/util/HashMap;

    .line 95
    .line 96
    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    check-cast v6, Ll/c;

    .line 101
    .line 102
    const/4 v7, 0x1

    .line 103
    if-eqz v6, :cond_1

    .line 104
    .line 105
    iget-object v4, v6, Ll/c;->f:Landroidx/lifecycle/m;

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_1
    new-instance v6, Ll/c;

    .line 109
    .line 110
    invoke-direct {v6, v1, v2}, Ll/c;-><init>(Lio/flutter/embedding/engine/renderer/b;Landroidx/lifecycle/m;)V

    .line 111
    .line 112
    .line 113
    iget v8, v3, Ll/a;->h:I

    .line 114
    .line 115
    add-int/2addr v8, v7

    .line 116
    iput v8, v3, Ll/a;->h:I

    .line 117
    .line 118
    iget-object v8, v3, Ll/a;->f:Ll/c;

    .line 119
    .line 120
    if-nez v8, :cond_2

    .line 121
    .line 122
    iput-object v6, v3, Ll/a;->e:Ll/c;

    .line 123
    .line 124
    iput-object v6, v3, Ll/a;->f:Ll/c;

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_2
    iput-object v6, v8, Ll/c;->g:Ll/c;

    .line 128
    .line 129
    iput-object v8, v6, Ll/c;->h:Ll/c;

    .line 130
    .line 131
    iput-object v6, v3, Ll/a;->f:Ll/c;

    .line 132
    .line 133
    :goto_1
    invoke-virtual {v5, v1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    :goto_2
    if-eqz v4, :cond_3

    .line 137
    .line 138
    goto/16 :goto_4

    .line 139
    .line 140
    :cond_3
    iget-object v3, p1, Landroidx/lifecycle/n;->d:Ljava/lang/ref/WeakReference;

    .line 141
    .line 142
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    check-cast v3, Landroidx/lifecycle/l;

    .line 147
    .line 148
    if-nez v3, :cond_4

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_4
    iget v4, p1, Landroidx/lifecycle/n;->e:I

    .line 152
    .line 153
    if-nez v4, :cond_5

    .line 154
    .line 155
    iget-boolean v4, p1, Landroidx/lifecycle/n;->f:Z

    .line 156
    .line 157
    if-eqz v4, :cond_6

    .line 158
    .line 159
    :cond_5
    const/4 v0, 0x1

    .line 160
    :cond_6
    invoke-virtual {p1, v1}, Landroidx/lifecycle/n;->a(Lio/flutter/embedding/engine/renderer/b;)Landroidx/lifecycle/g;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    iget v5, p1, Landroidx/lifecycle/n;->e:I

    .line 165
    .line 166
    add-int/2addr v5, v7

    .line 167
    iput v5, p1, Landroidx/lifecycle/n;->e:I

    .line 168
    .line 169
    :goto_3
    iget-object v5, v2, Landroidx/lifecycle/m;->a:Landroidx/lifecycle/g;

    .line 170
    .line 171
    invoke-virtual {v5, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    if-gez v4, :cond_8

    .line 176
    .line 177
    iget-object v4, p1, Landroidx/lifecycle/n;->b:Ll/a;

    .line 178
    .line 179
    iget-object v4, v4, Ll/a;->i:Ljava/util/HashMap;

    .line 180
    .line 181
    invoke-virtual {v4, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    if-eqz v4, :cond_8

    .line 186
    .line 187
    iget-object v4, v2, Landroidx/lifecycle/m;->a:Landroidx/lifecycle/g;

    .line 188
    .line 189
    iget-object v5, p1, Landroidx/lifecycle/n;->h:Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    sget-object v4, Landroidx/lifecycle/f;->Companion:Landroidx/lifecycle/d;

    .line 195
    .line 196
    iget-object v5, v2, Landroidx/lifecycle/m;->a:Landroidx/lifecycle/g;

    .line 197
    .line 198
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-static {v5}, Landroidx/lifecycle/d;->a(Landroidx/lifecycle/g;)Landroidx/lifecycle/f;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    if-eqz v4, :cond_7

    .line 206
    .line 207
    invoke-virtual {v2, v3, v4}, Landroidx/lifecycle/m;->a(Landroidx/lifecycle/l;Landroidx/lifecycle/f;)V

    .line 208
    .line 209
    .line 210
    iget-object v4, p1, Landroidx/lifecycle/n;->h:Ljava/util/ArrayList;

    .line 211
    .line 212
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 213
    .line 214
    .line 215
    move-result v5

    .line 216
    sub-int/2addr v5, v7

    .line 217
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    invoke-virtual {p1, v1}, Landroidx/lifecycle/n;->a(Lio/flutter/embedding/engine/renderer/b;)Landroidx/lifecycle/g;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    goto :goto_3

    .line 225
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 226
    .line 227
    new-instance v0, Ljava/lang/StringBuilder;

    .line 228
    .line 229
    const-string v1, "no event up from "

    .line 230
    .line 231
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    iget-object v1, v2, Landroidx/lifecycle/m;->a:Landroidx/lifecycle/g;

    .line 235
    .line 236
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    throw p1

    .line 247
    :cond_8
    if-nez v0, :cond_9

    .line 248
    .line 249
    invoke-virtual {p1}, Landroidx/lifecycle/n;->d()V

    .line 250
    .line 251
    .line 252
    :cond_9
    iget v0, p1, Landroidx/lifecycle/n;->e:I

    .line 253
    .line 254
    add-int/lit8 v0, v0, -0x1

    .line 255
    .line 256
    iput v0, p1, Landroidx/lifecycle/n;->e:I

    .line 257
    .line 258
    :goto_4
    return-void
.end method


# virtual methods
.method public final a(Lio/flutter/view/o;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/l;->f:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lio/flutter/view/o;

    .line 24
    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 32
    .line 33
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final b()Lio/flutter/view/TextureRegistry$ImageTextureEntry;
    .locals 4

    .line 1
    new-instance v0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ImageTextureRegistryEntry;

    .line 2
    .line 3
    iget-object v1, p0, Lio/flutter/embedding/engine/renderer/l;->b:Ljava/util/concurrent/atomic/AtomicLong;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-direct {v0, p0, v1, v2}, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ImageTextureRegistryEntry;-><init>(Lio/flutter/embedding/engine/renderer/l;J)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ImageTextureRegistryEntry;->id()J

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ImageTextureRegistryEntry;->id()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    iget-object v3, p0, Lio/flutter/embedding/engine/renderer/l;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 20
    .line 21
    invoke-virtual {v3, v1, v2, v0}, Lio/flutter/embedding/engine/FlutterJNI;->registerImageTexture(JLio/flutter/view/TextureRegistry$ImageConsumer;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public final c()Lio/flutter/view/TextureRegistry$SurfaceProducer;
    .locals 9

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/l;->b:Ljava/util/concurrent/atomic/AtomicLong;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    new-instance v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ImageReaderSurfaceProducer;

    .line 14
    .line 15
    invoke-direct {v2, p0, v0, v1}, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ImageReaderSurfaceProducer;-><init>(Lio/flutter/embedding/engine/renderer/l;J)V

    .line 16
    .line 17
    .line 18
    iget-object v3, p0, Lio/flutter/embedding/engine/renderer/l;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 19
    .line 20
    invoke-virtual {v3, v0, v1, v2}, Lio/flutter/embedding/engine/FlutterJNI;->registerImageTexture(JLio/flutter/view/TextureRegistry$ImageConsumer;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v2}, Lio/flutter/embedding/engine/renderer/l;->a(Lio/flutter/view/o;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/l;->g:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p0}, Lio/flutter/embedding/engine/renderer/l;->d()Lio/flutter/embedding/engine/renderer/i;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    new-instance v2, Lio/flutter/embedding/engine/renderer/o;

    .line 37
    .line 38
    iget-object v6, p0, Lio/flutter/embedding/engine/renderer/l;->e:Landroid/os/Handler;

    .line 39
    .line 40
    iget-object v7, p0, Lio/flutter/embedding/engine/renderer/l;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 41
    .line 42
    iget-wide v4, v8, Lio/flutter/embedding/engine/renderer/i;->a:J

    .line 43
    .line 44
    move-object v3, v2

    .line 45
    invoke-direct/range {v3 .. v8}, Lio/flutter/embedding/engine/renderer/o;-><init>(JLandroid/os/Handler;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/embedding/engine/renderer/i;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    return-object v2
.end method

.method public final d()Lio/flutter/embedding/engine/renderer/i;
    .locals 5

    .line 1
    new-instance v0, Landroid/graphics/SurfaceTexture;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lio/flutter/embedding/engine/renderer/l;->b:Ljava/util/concurrent/atomic/AtomicLong;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->detachFromGLContext()V

    .line 14
    .line 15
    .line 16
    new-instance v3, Lio/flutter/embedding/engine/renderer/i;

    .line 17
    .line 18
    invoke-direct {v3, p0, v1, v2, v0}, Lio/flutter/embedding/engine/renderer/i;-><init>(Lio/flutter/embedding/engine/renderer/l;JLandroid/graphics/SurfaceTexture;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/l;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 22
    .line 23
    iget-wide v1, v3, Lio/flutter/embedding/engine/renderer/i;->a:J

    .line 24
    .line 25
    iget-object v4, v3, Lio/flutter/embedding/engine/renderer/i;->b:Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2, v4}, Lio/flutter/embedding/engine/FlutterJNI;->registerTexture(JLio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v3}, Lio/flutter/embedding/engine/renderer/l;->a(Lio/flutter/view/o;)V

    .line 31
    .line 32
    .line 33
    return-object v3
.end method

.method public final e(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/l;->f:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lio/flutter/view/o;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-interface {v1, p1}, Lio/flutter/view/o;->onTrimMemory(I)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-void
.end method

.method public final f(Lio/flutter/view/o;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/l;->f:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    if-ne v3, p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public final g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/l;->c:Landroid/view/Surface;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/l;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 6
    .line 7
    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->onSurfaceDestroyed()V

    .line 8
    .line 9
    .line 10
    iget-boolean v0, p0, Lio/flutter/embedding/engine/renderer/l;->d:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/l;->h:Lio/flutter/embedding/engine/renderer/a;

    .line 15
    .line 16
    invoke-virtual {v0}, Lio/flutter/embedding/engine/renderer/a;->a()V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Lio/flutter/embedding/engine/renderer/l;->d:Z

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lio/flutter/embedding/engine/renderer/l;->c:Landroid/view/Surface;

    .line 24
    .line 25
    :cond_1
    return-void
.end method
