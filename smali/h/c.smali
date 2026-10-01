.class public final Lh/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:Ljava/lang/CharSequence;

.field public B:Landroid/content/res/ColorStateList;

.field public C:Landroid/graphics/PorterDuff$Mode;

.field public final synthetic D:Lh/d;

.field public final a:Landroid/view/Menu;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public j:I

.field public k:Ljava/lang/CharSequence;

.field public l:Ljava/lang/CharSequence;

.field public m:I

.field public n:C

.field public o:I

.field public p:C

.field public q:I

.field public r:I

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:I

.field public w:I

.field public x:Ljava/lang/String;

.field public y:Ljava/lang/String;

.field public z:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Lh/d;Landroid/view/Menu;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh/c;->D:Lh/d;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lh/c;->B:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    iput-object p1, p0, Lh/c;->C:Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    iput-object p2, p0, Lh/c;->a:Landroid/view/Menu;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput p1, p0, Lh/c;->b:I

    .line 15
    .line 16
    iput p1, p0, Lh/c;->c:I

    .line 17
    .line 18
    iput p1, p0, Lh/c;->d:I

    .line 19
    .line 20
    iput p1, p0, Lh/c;->e:I

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Lh/c;->f:Z

    .line 24
    .line 25
    iput-boolean p1, p0, Lh/c;->g:Z

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lh/c;->D:Lh/d;

    .line 2
    .line 3
    iget-object v0, v0, Lh/d;->c:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {p1, v1, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-virtual {p2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, p3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    return-object p1

    .line 27
    :catch_0
    move-exception p2

    .line 28
    new-instance p3, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v0, "Cannot instantiate class: "

    .line 31
    .line 32
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string p3, "SupportMenuInflater"

    .line 43
    .line 44
    invoke-static {p3, p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    return-object p1
.end method

.method public final b(Landroid/view/MenuItem;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lh/c;->s:Z

    .line 2
    .line 3
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v1, p0, Lh/c;->t:Z

    .line 8
    .line 9
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-boolean v1, p0, Lh/c;->u:Z

    .line 14
    .line 15
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget v1, p0, Lh/c;->r:I

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x1

    .line 23
    if-lt v1, v3, :cond_0

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v1, 0x0

    .line 28
    :goto_0
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v1, p0, Lh/c;->l:Ljava/lang/CharSequence;

    .line 33
    .line 34
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget v1, p0, Lh/c;->m:I

    .line 39
    .line 40
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 41
    .line 42
    .line 43
    iget v0, p0, Lh/c;->v:I

    .line 44
    .line 45
    if-ltz v0, :cond_1

    .line 46
    .line 47
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setShowAsAction(I)V

    .line 48
    .line 49
    .line 50
    :cond_1
    iget-object v0, p0, Lh/c;->y:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v1, p0, Lh/c;->D:Lh/d;

    .line 53
    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    iget-object v0, v1, Lh/d;->c:Landroid/content/Context;

    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/content/Context;->isRestricted()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_3

    .line 63
    .line 64
    new-instance v0, Lh/b;

    .line 65
    .line 66
    iget-object v4, v1, Lh/d;->d:Ljava/lang/Object;

    .line 67
    .line 68
    if-nez v4, :cond_2

    .line 69
    .line 70
    iget-object v4, v1, Lh/d;->c:Landroid/content/Context;

    .line 71
    .line 72
    invoke-static {v4}, Lh/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    iput-object v4, v1, Lh/d;->d:Ljava/lang/Object;

    .line 77
    .line 78
    :cond_2
    iget-object v4, v1, Lh/d;->d:Ljava/lang/Object;

    .line 79
    .line 80
    iget-object v5, p0, Lh/c;->y:Ljava/lang/String;

    .line 81
    .line 82
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object v4, v0, Lh/b;->a:Ljava/lang/Object;

    .line 86
    .line 87
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    :try_start_0
    sget-object v6, Lh/b;->c:[Ljava/lang/Class;

    .line 92
    .line 93
    invoke-virtual {v4, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    iput-object v6, v0, Lh/b;->b:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    .line 99
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :catch_0
    move-exception p1

    .line 104
    new-instance v0, Landroid/view/InflateException;

    .line 105
    .line 106
    new-instance v1, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    const-string v2, "Couldn\'t resolve menu item onClick handler "

    .line 109
    .line 110
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v2, " in class "

    .line 117
    .line 118
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-direct {v0, v1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 136
    .line 137
    .line 138
    throw v0

    .line 139
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 140
    .line 141
    const-string v0, "The android:onClick attribute cannot be used within a restricted context"

    .line 142
    .line 143
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw p1

    .line 147
    :cond_4
    :goto_1
    instance-of v0, p1, Li/k;

    .line 148
    .line 149
    if-eqz v0, :cond_5

    .line 150
    .line 151
    move-object v4, p1

    .line 152
    check-cast v4, Li/k;

    .line 153
    .line 154
    :cond_5
    iget v4, p0, Lh/c;->r:I

    .line 155
    .line 156
    const/4 v5, 0x2

    .line 157
    if-lt v4, v5, :cond_6

    .line 158
    .line 159
    if-eqz v0, :cond_6

    .line 160
    .line 161
    move-object v0, p1

    .line 162
    check-cast v0, Li/k;

    .line 163
    .line 164
    iget v4, v0, Li/k;->x:I

    .line 165
    .line 166
    and-int/lit8 v4, v4, -0x5

    .line 167
    .line 168
    or-int/lit8 v4, v4, 0x4

    .line 169
    .line 170
    iput v4, v0, Li/k;->x:I

    .line 171
    .line 172
    :cond_6
    iget-object v0, p0, Lh/c;->x:Ljava/lang/String;

    .line 173
    .line 174
    if-eqz v0, :cond_7

    .line 175
    .line 176
    sget-object v2, Lh/d;->e:[Ljava/lang/Class;

    .line 177
    .line 178
    iget-object v1, v1, Lh/d;->a:[Ljava/lang/Object;

    .line 179
    .line 180
    invoke-virtual {p0, v0, v2, v1}, Lh/c;->a(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    check-cast v0, Landroid/view/View;

    .line 185
    .line 186
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;

    .line 187
    .line 188
    .line 189
    const/4 v2, 0x1

    .line 190
    :cond_7
    iget v0, p0, Lh/c;->w:I

    .line 191
    .line 192
    if-lez v0, :cond_9

    .line 193
    .line 194
    if-nez v2, :cond_8

    .line 195
    .line 196
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(I)Landroid/view/MenuItem;

    .line 197
    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_8
    const-string v0, "SupportMenuInflater"

    .line 201
    .line 202
    const-string v1, "Ignoring attribute \'itemActionViewLayout\'. Action view already specified."

    .line 203
    .line 204
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 205
    .line 206
    .line 207
    :cond_9
    :goto_2
    iget-object v0, p0, Lh/c;->z:Ljava/lang/CharSequence;

    .line 208
    .line 209
    instance-of v1, p1, Li/k;

    .line 210
    .line 211
    const/16 v2, 0x1a

    .line 212
    .line 213
    if-eqz v1, :cond_a

    .line 214
    .line 215
    move-object v3, p1

    .line 216
    check-cast v3, Li/k;

    .line 217
    .line 218
    invoke-virtual {v3, v0}, Li/k;->e(Ljava/lang/CharSequence;)Li/k;

    .line 219
    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_a
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 223
    .line 224
    if-lt v3, v2, :cond_b

    .line 225
    .line 226
    invoke-static {p1, v0}, Ly/f;->h(Landroid/view/MenuItem;Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 227
    .line 228
    .line 229
    :cond_b
    :goto_3
    iget-object v0, p0, Lh/c;->A:Ljava/lang/CharSequence;

    .line 230
    .line 231
    if-eqz v1, :cond_c

    .line 232
    .line 233
    move-object v3, p1

    .line 234
    check-cast v3, Li/k;

    .line 235
    .line 236
    invoke-virtual {v3, v0}, Li/k;->g(Ljava/lang/CharSequence;)Li/k;

    .line 237
    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_c
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 241
    .line 242
    if-lt v3, v2, :cond_d

    .line 243
    .line 244
    invoke-static {p1, v0}, Ly/f;->m(Landroid/view/MenuItem;Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 245
    .line 246
    .line 247
    :cond_d
    :goto_4
    iget-char v0, p0, Lh/c;->n:C

    .line 248
    .line 249
    iget v3, p0, Lh/c;->o:I

    .line 250
    .line 251
    if-eqz v1, :cond_e

    .line 252
    .line 253
    move-object v4, p1

    .line 254
    check-cast v4, Li/k;

    .line 255
    .line 256
    invoke-virtual {v4, v0, v3}, Li/k;->setAlphabeticShortcut(CI)Landroid/view/MenuItem;

    .line 257
    .line 258
    .line 259
    goto :goto_5

    .line 260
    :cond_e
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 261
    .line 262
    if-lt v4, v2, :cond_f

    .line 263
    .line 264
    invoke-static {p1, v0, v3}, Ly/f;->g(Landroid/view/MenuItem;CI)Landroid/view/MenuItem;

    .line 265
    .line 266
    .line 267
    :cond_f
    :goto_5
    iget-char v0, p0, Lh/c;->p:C

    .line 268
    .line 269
    iget v3, p0, Lh/c;->q:I

    .line 270
    .line 271
    if-eqz v1, :cond_10

    .line 272
    .line 273
    move-object v4, p1

    .line 274
    check-cast v4, Li/k;

    .line 275
    .line 276
    invoke-virtual {v4, v0, v3}, Li/k;->setNumericShortcut(CI)Landroid/view/MenuItem;

    .line 277
    .line 278
    .line 279
    goto :goto_6

    .line 280
    :cond_10
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 281
    .line 282
    if-lt v4, v2, :cond_11

    .line 283
    .line 284
    invoke-static {p1, v0, v3}, Ly/f;->k(Landroid/view/MenuItem;CI)Landroid/view/MenuItem;

    .line 285
    .line 286
    .line 287
    :cond_11
    :goto_6
    iget-object v0, p0, Lh/c;->C:Landroid/graphics/PorterDuff$Mode;

    .line 288
    .line 289
    if-eqz v0, :cond_13

    .line 290
    .line 291
    if-eqz v1, :cond_12

    .line 292
    .line 293
    move-object v3, p1

    .line 294
    check-cast v3, Li/k;

    .line 295
    .line 296
    invoke-virtual {v3, v0}, Li/k;->setIconTintMode(Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;

    .line 297
    .line 298
    .line 299
    goto :goto_7

    .line 300
    :cond_12
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 301
    .line 302
    if-lt v3, v2, :cond_13

    .line 303
    .line 304
    invoke-static {p1, v0}, Ly/f;->j(Landroid/view/MenuItem;Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;

    .line 305
    .line 306
    .line 307
    :cond_13
    :goto_7
    iget-object v0, p0, Lh/c;->B:Landroid/content/res/ColorStateList;

    .line 308
    .line 309
    if-eqz v0, :cond_15

    .line 310
    .line 311
    if-eqz v1, :cond_14

    .line 312
    .line 313
    check-cast p1, Li/k;

    .line 314
    .line 315
    invoke-virtual {p1, v0}, Li/k;->setIconTintList(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;

    .line 316
    .line 317
    .line 318
    goto :goto_8

    .line 319
    :cond_14
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 320
    .line 321
    if-lt v1, v2, :cond_15

    .line 322
    .line 323
    invoke-static {p1, v0}, Ly/f;->i(Landroid/view/MenuItem;Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;

    .line 324
    .line 325
    .line 326
    :cond_15
    :goto_8
    return-void
.end method
