.class public final Lj/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/TextView;

.field public b:Lj/j0;

.field public c:Lj/j0;

.field public d:Lj/j0;

.field public e:Lj/j0;

.field public f:Lj/j0;

.field public g:Lj/j0;

.field public h:Lj/j0;

.field public final i:Lj/v;

.field public j:I

.field public k:I

.field public l:Landroid/graphics/Typeface;

.field public m:Z


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lj/t;->j:I

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lj/t;->k:I

    .line 9
    .line 10
    iput-object p1, p0, Lj/t;->a:Landroid/widget/TextView;

    .line 11
    .line 12
    new-instance v0, Lj/v;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Lj/v;-><init>(Landroid/widget/TextView;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lj/t;->i:Lj/v;

    .line 18
    .line 19
    return-void
.end method

.method public static c(Landroid/content/Context;Lj/o;I)Lj/j0;
    .locals 1

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    iget-object v0, p1, Lj/o;->a:Lj/P;

    .line 3
    .line 4
    invoke-virtual {v0, p0, p2}, Lj/P;->i(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 5
    .line 6
    .line 7
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p1

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    new-instance p1, Lj/j0;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 p2, 0x1

    .line 17
    iput-boolean p2, p1, Lj/j0;->d:Z

    .line 18
    .line 19
    iput-object p0, p1, Lj/j0;->a:Landroid/content/res/ColorStateList;

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw p0
.end method


# virtual methods
.method public final a(Landroid/graphics/drawable/Drawable;Lj/j0;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lj/t;->a:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p1, p2, v0}, Lj/o;->c(Landroid/graphics/drawable/Drawable;Lj/j0;[I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 6

    .line 1
    iget-object v0, p0, Lj/t;->b:Lj/j0;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, Lj/t;->a:Landroid/widget/TextView;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lj/t;->c:Lj/j0;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lj/t;->d:Lj/j0;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lj/t;->e:Lj/j0;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    aget-object v4, v0, v2

    .line 26
    .line 27
    iget-object v5, p0, Lj/t;->b:Lj/j0;

    .line 28
    .line 29
    invoke-virtual {p0, v4, v5}, Lj/t;->a(Landroid/graphics/drawable/Drawable;Lj/j0;)V

    .line 30
    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    aget-object v4, v0, v4

    .line 34
    .line 35
    iget-object v5, p0, Lj/t;->c:Lj/j0;

    .line 36
    .line 37
    invoke-virtual {p0, v4, v5}, Lj/t;->a(Landroid/graphics/drawable/Drawable;Lj/j0;)V

    .line 38
    .line 39
    .line 40
    aget-object v4, v0, v1

    .line 41
    .line 42
    iget-object v5, p0, Lj/t;->d:Lj/j0;

    .line 43
    .line 44
    invoke-virtual {p0, v4, v5}, Lj/t;->a(Landroid/graphics/drawable/Drawable;Lj/j0;)V

    .line 45
    .line 46
    .line 47
    const/4 v4, 0x3

    .line 48
    aget-object v0, v0, v4

    .line 49
    .line 50
    iget-object v4, p0, Lj/t;->e:Lj/j0;

    .line 51
    .line 52
    invoke-virtual {p0, v0, v4}, Lj/t;->a(Landroid/graphics/drawable/Drawable;Lj/j0;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-object v0, p0, Lj/t;->f:Lj/j0;

    .line 56
    .line 57
    if-nez v0, :cond_2

    .line 58
    .line 59
    iget-object v0, p0, Lj/t;->g:Lj/j0;

    .line 60
    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    :cond_2
    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    aget-object v2, v0, v2

    .line 68
    .line 69
    iget-object v3, p0, Lj/t;->f:Lj/j0;

    .line 70
    .line 71
    invoke-virtual {p0, v2, v3}, Lj/t;->a(Landroid/graphics/drawable/Drawable;Lj/j0;)V

    .line 72
    .line 73
    .line 74
    aget-object v0, v0, v1

    .line 75
    .line 76
    iget-object v1, p0, Lj/t;->g:Lj/j0;

    .line 77
    .line 78
    invoke-virtual {p0, v0, v1}, Lj/t;->a(Landroid/graphics/drawable/Drawable;Lj/j0;)V

    .line 79
    .line 80
    .line 81
    :cond_3
    return-void
.end method

.method public final d(Landroid/util/AttributeSet;I)V
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object v4, v1, Lj/t;->a:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    sget-object v6, Lj/o;->b:Landroid/graphics/PorterDuff$Mode;

    .line 15
    .line 16
    const-class v6, Lj/o;

    .line 17
    .line 18
    monitor-enter v6

    .line 19
    :try_start_0
    sget-object v7, Lj/o;->c:Lj/o;

    .line 20
    .line 21
    if-nez v7, :cond_0

    .line 22
    .line 23
    invoke-static {}, Lj/o;->b()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    goto/16 :goto_2d

    .line 29
    .line 30
    :cond_0
    :goto_0
    sget-object v7, Lj/o;->c:Lj/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    monitor-exit v6

    .line 33
    sget-object v6, Lc/a;->f:[I

    .line 34
    .line 35
    invoke-static {v5, v0, v6, v2}, LN/b;->I(Landroid/content/Context;Landroid/util/AttributeSet;[II)LN/b;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    iget-object v8, v6, LN/b;->f:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v8, Landroid/content/res/TypedArray;

    .line 42
    .line 43
    const/4 v9, 0x0

    .line 44
    const/4 v10, -0x1

    .line 45
    invoke-virtual {v8, v9, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 46
    .line 47
    .line 48
    move-result v11

    .line 49
    const/4 v12, 0x3

    .line 50
    invoke-virtual {v8, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 51
    .line 52
    .line 53
    move-result v13

    .line 54
    if-eqz v13, :cond_1

    .line 55
    .line 56
    invoke-virtual {v8, v12, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 57
    .line 58
    .line 59
    move-result v13

    .line 60
    invoke-static {v5, v7, v13}, Lj/t;->c(Landroid/content/Context;Lj/o;I)Lj/j0;

    .line 61
    .line 62
    .line 63
    move-result-object v13

    .line 64
    iput-object v13, v1, Lj/t;->b:Lj/j0;

    .line 65
    .line 66
    :cond_1
    invoke-virtual {v8, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 67
    .line 68
    .line 69
    move-result v13

    .line 70
    if-eqz v13, :cond_2

    .line 71
    .line 72
    invoke-virtual {v8, v3, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 73
    .line 74
    .line 75
    move-result v13

    .line 76
    invoke-static {v5, v7, v13}, Lj/t;->c(Landroid/content/Context;Lj/o;I)Lj/j0;

    .line 77
    .line 78
    .line 79
    move-result-object v13

    .line 80
    iput-object v13, v1, Lj/t;->c:Lj/j0;

    .line 81
    .line 82
    :cond_2
    const/4 v13, 0x4

    .line 83
    invoke-virtual {v8, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 84
    .line 85
    .line 86
    move-result v14

    .line 87
    if-eqz v14, :cond_3

    .line 88
    .line 89
    invoke-virtual {v8, v13, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 90
    .line 91
    .line 92
    move-result v14

    .line 93
    invoke-static {v5, v7, v14}, Lj/t;->c(Landroid/content/Context;Lj/o;I)Lj/j0;

    .line 94
    .line 95
    .line 96
    move-result-object v14

    .line 97
    iput-object v14, v1, Lj/t;->d:Lj/j0;

    .line 98
    .line 99
    :cond_3
    const/4 v14, 0x2

    .line 100
    invoke-virtual {v8, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 101
    .line 102
    .line 103
    move-result v15

    .line 104
    if-eqz v15, :cond_4

    .line 105
    .line 106
    invoke-virtual {v8, v14, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 107
    .line 108
    .line 109
    move-result v15

    .line 110
    invoke-static {v5, v7, v15}, Lj/t;->c(Landroid/content/Context;Lj/o;I)Lj/j0;

    .line 111
    .line 112
    .line 113
    move-result-object v15

    .line 114
    iput-object v15, v1, Lj/t;->e:Lj/j0;

    .line 115
    .line 116
    :cond_4
    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 117
    .line 118
    const/4 v3, 0x5

    .line 119
    invoke-virtual {v8, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 120
    .line 121
    .line 122
    move-result v16

    .line 123
    if-eqz v16, :cond_5

    .line 124
    .line 125
    invoke-virtual {v8, v3, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 126
    .line 127
    .line 128
    move-result v14

    .line 129
    invoke-static {v5, v7, v14}, Lj/t;->c(Landroid/content/Context;Lj/o;I)Lj/j0;

    .line 130
    .line 131
    .line 132
    move-result-object v14

    .line 133
    iput-object v14, v1, Lj/t;->f:Lj/j0;

    .line 134
    .line 135
    :cond_5
    const/4 v14, 0x6

    .line 136
    invoke-virtual {v8, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 137
    .line 138
    .line 139
    move-result v17

    .line 140
    if-eqz v17, :cond_6

    .line 141
    .line 142
    invoke-virtual {v8, v14, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    invoke-static {v5, v7, v8}, Lj/t;->c(Landroid/content/Context;Lj/o;I)Lj/j0;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    iput-object v8, v1, Lj/t;->g:Lj/j0;

    .line 151
    .line 152
    :cond_6
    invoke-virtual {v6}, LN/b;->L()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v4}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    instance-of v6, v6, Landroid/text/method/PasswordTransformationMethod;

    .line 160
    .line 161
    sget-object v8, Lc/a;->s:[I

    .line 162
    .line 163
    const/16 v14, 0x17

    .line 164
    .line 165
    const/16 v3, 0xe

    .line 166
    .line 167
    if-eq v11, v10, :cond_e

    .line 168
    .line 169
    new-instance v10, LN/b;

    .line 170
    .line 171
    invoke-virtual {v5, v11, v8}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 172
    .line 173
    .line 174
    move-result-object v11

    .line 175
    invoke-direct {v10, v5, v11}, LN/b;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 176
    .line 177
    .line 178
    if-nez v6, :cond_7

    .line 179
    .line 180
    invoke-virtual {v11, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 181
    .line 182
    .line 183
    move-result v22

    .line 184
    if-eqz v22, :cond_7

    .line 185
    .line 186
    invoke-virtual {v11, v3, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 187
    .line 188
    .line 189
    move-result v22

    .line 190
    move/from16 v23, v22

    .line 191
    .line 192
    const/16 v22, 0x1

    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_7
    const/16 v22, 0x0

    .line 196
    .line 197
    const/16 v23, 0x0

    .line 198
    .line 199
    :goto_1
    invoke-virtual {v1, v5, v10}, Lj/t;->f(Landroid/content/Context;LN/b;)V

    .line 200
    .line 201
    .line 202
    if-ge v15, v14, :cond_b

    .line 203
    .line 204
    invoke-virtual {v11, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 205
    .line 206
    .line 207
    move-result v24

    .line 208
    if-eqz v24, :cond_8

    .line 209
    .line 210
    invoke-virtual {v10, v12}, LN/b;->x(I)Landroid/content/res/ColorStateList;

    .line 211
    .line 212
    .line 213
    move-result-object v24

    .line 214
    goto :goto_2

    .line 215
    :cond_8
    const/16 v24, 0x0

    .line 216
    .line 217
    :goto_2
    invoke-virtual {v11, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 218
    .line 219
    .line 220
    move-result v25

    .line 221
    if-eqz v25, :cond_9

    .line 222
    .line 223
    invoke-virtual {v10, v13}, LN/b;->x(I)Landroid/content/res/ColorStateList;

    .line 224
    .line 225
    .line 226
    move-result-object v25

    .line 227
    const/4 v13, 0x5

    .line 228
    goto :goto_3

    .line 229
    :cond_9
    const/4 v13, 0x5

    .line 230
    const/16 v25, 0x0

    .line 231
    .line 232
    :goto_3
    invoke-virtual {v11, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 233
    .line 234
    .line 235
    move-result v19

    .line 236
    if-eqz v19, :cond_a

    .line 237
    .line 238
    invoke-virtual {v10, v13}, LN/b;->x(I)Landroid/content/res/ColorStateList;

    .line 239
    .line 240
    .line 241
    move-result-object v26

    .line 242
    const/16 v13, 0xf

    .line 243
    .line 244
    goto :goto_5

    .line 245
    :cond_a
    const/16 v13, 0xf

    .line 246
    .line 247
    :goto_4
    const/16 v26, 0x0

    .line 248
    .line 249
    goto :goto_5

    .line 250
    :cond_b
    const/16 v13, 0xf

    .line 251
    .line 252
    const/16 v24, 0x0

    .line 253
    .line 254
    const/16 v25, 0x0

    .line 255
    .line 256
    goto :goto_4

    .line 257
    :goto_5
    invoke-virtual {v11, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 258
    .line 259
    .line 260
    move-result v20

    .line 261
    if-eqz v20, :cond_c

    .line 262
    .line 263
    invoke-virtual {v11, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v27

    .line 267
    const/16 v13, 0x1a

    .line 268
    .line 269
    goto :goto_6

    .line 270
    :cond_c
    const/16 v13, 0x1a

    .line 271
    .line 272
    const/16 v27, 0x0

    .line 273
    .line 274
    :goto_6
    if-lt v15, v13, :cond_d

    .line 275
    .line 276
    const/16 v13, 0xd

    .line 277
    .line 278
    invoke-virtual {v11, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 279
    .line 280
    .line 281
    move-result v21

    .line 282
    if-eqz v21, :cond_d

    .line 283
    .line 284
    invoke-virtual {v11, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v11

    .line 288
    goto :goto_7

    .line 289
    :cond_d
    const/4 v11, 0x0

    .line 290
    :goto_7
    invoke-virtual {v10}, LN/b;->L()V

    .line 291
    .line 292
    .line 293
    goto :goto_8

    .line 294
    :cond_e
    const/4 v11, 0x0

    .line 295
    const/16 v22, 0x0

    .line 296
    .line 297
    const/16 v23, 0x0

    .line 298
    .line 299
    const/16 v24, 0x0

    .line 300
    .line 301
    const/16 v25, 0x0

    .line 302
    .line 303
    const/16 v26, 0x0

    .line 304
    .line 305
    const/16 v27, 0x0

    .line 306
    .line 307
    :goto_8
    new-instance v10, LN/b;

    .line 308
    .line 309
    invoke-virtual {v5, v0, v8, v2, v9}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 310
    .line 311
    .line 312
    move-result-object v8

    .line 313
    invoke-direct {v10, v5, v8}, LN/b;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 314
    .line 315
    .line 316
    if-nez v6, :cond_f

    .line 317
    .line 318
    invoke-virtual {v8, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 319
    .line 320
    .line 321
    move-result v13

    .line 322
    if-eqz v13, :cond_f

    .line 323
    .line 324
    invoke-virtual {v8, v3, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 325
    .line 326
    .line 327
    move-result v23

    .line 328
    move/from16 v13, v23

    .line 329
    .line 330
    const/16 v22, 0x1

    .line 331
    .line 332
    goto :goto_9

    .line 333
    :cond_f
    move/from16 v13, v23

    .line 334
    .line 335
    :goto_9
    if-ge v15, v14, :cond_12

    .line 336
    .line 337
    invoke-virtual {v8, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 338
    .line 339
    .line 340
    move-result v14

    .line 341
    if-eqz v14, :cond_10

    .line 342
    .line 343
    invoke-virtual {v10, v12}, LN/b;->x(I)Landroid/content/res/ColorStateList;

    .line 344
    .line 345
    .line 346
    move-result-object v24

    .line 347
    :cond_10
    const/4 v14, 0x4

    .line 348
    invoke-virtual {v8, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 349
    .line 350
    .line 351
    move-result v23

    .line 352
    if-eqz v23, :cond_11

    .line 353
    .line 354
    invoke-virtual {v10, v14}, LN/b;->x(I)Landroid/content/res/ColorStateList;

    .line 355
    .line 356
    .line 357
    move-result-object v25

    .line 358
    :cond_11
    const/4 v14, 0x5

    .line 359
    invoke-virtual {v8, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 360
    .line 361
    .line 362
    move-result v19

    .line 363
    if-eqz v19, :cond_12

    .line 364
    .line 365
    invoke-virtual {v10, v14}, LN/b;->x(I)Landroid/content/res/ColorStateList;

    .line 366
    .line 367
    .line 368
    move-result-object v26

    .line 369
    :cond_12
    move-object/from16 v14, v24

    .line 370
    .line 371
    move-object/from16 v3, v25

    .line 372
    .line 373
    move-object/from16 v12, v26

    .line 374
    .line 375
    const/16 v9, 0xf

    .line 376
    .line 377
    invoke-virtual {v8, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 378
    .line 379
    .line 380
    move-result v25

    .line 381
    if-eqz v25, :cond_13

    .line 382
    .line 383
    invoke-virtual {v8, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v27

    .line 387
    :cond_13
    move-object/from16 v18, v11

    .line 388
    .line 389
    move-object/from16 v9, v27

    .line 390
    .line 391
    const/16 v11, 0x1a

    .line 392
    .line 393
    if-lt v15, v11, :cond_14

    .line 394
    .line 395
    const/16 v11, 0xd

    .line 396
    .line 397
    invoke-virtual {v8, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 398
    .line 399
    .line 400
    move-result v21

    .line 401
    if-eqz v21, :cond_14

    .line 402
    .line 403
    invoke-virtual {v8, v11}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v18

    .line 407
    :cond_14
    move-object/from16 v11, v18

    .line 408
    .line 409
    move-object/from16 v18, v7

    .line 410
    .line 411
    const/16 v7, 0x1c

    .line 412
    .line 413
    if-lt v15, v7, :cond_15

    .line 414
    .line 415
    const/4 v7, 0x0

    .line 416
    invoke-virtual {v8, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 417
    .line 418
    .line 419
    move-result v24

    .line 420
    if-eqz v24, :cond_15

    .line 421
    .line 422
    const/4 v0, -0x1

    .line 423
    invoke-virtual {v8, v7, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 424
    .line 425
    .line 426
    move-result v8

    .line 427
    if-nez v8, :cond_15

    .line 428
    .line 429
    const/4 v0, 0x0

    .line 430
    invoke-virtual {v4, v7, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 431
    .line 432
    .line 433
    :cond_15
    invoke-virtual {v1, v5, v10}, Lj/t;->f(Landroid/content/Context;LN/b;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v10}, LN/b;->L()V

    .line 437
    .line 438
    .line 439
    if-eqz v14, :cond_16

    .line 440
    .line 441
    invoke-virtual {v4, v14}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 442
    .line 443
    .line 444
    :cond_16
    if-eqz v3, :cond_17

    .line 445
    .line 446
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setHintTextColor(Landroid/content/res/ColorStateList;)V

    .line 447
    .line 448
    .line 449
    :cond_17
    if-eqz v12, :cond_18

    .line 450
    .line 451
    invoke-virtual {v4, v12}, Landroid/widget/TextView;->setLinkTextColor(Landroid/content/res/ColorStateList;)V

    .line 452
    .line 453
    .line 454
    :cond_18
    if-nez v6, :cond_19

    .line 455
    .line 456
    if-eqz v22, :cond_19

    .line 457
    .line 458
    iget-object v0, v1, Lj/t;->a:Landroid/widget/TextView;

    .line 459
    .line 460
    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 461
    .line 462
    .line 463
    :cond_19
    iget-object v0, v1, Lj/t;->l:Landroid/graphics/Typeface;

    .line 464
    .line 465
    if-eqz v0, :cond_1b

    .line 466
    .line 467
    iget v3, v1, Lj/t;->k:I

    .line 468
    .line 469
    const/4 v6, -0x1

    .line 470
    if-ne v3, v6, :cond_1a

    .line 471
    .line 472
    iget v3, v1, Lj/t;->j:I

    .line 473
    .line 474
    invoke-virtual {v4, v0, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 475
    .line 476
    .line 477
    goto :goto_a

    .line 478
    :cond_1a
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 479
    .line 480
    .line 481
    :cond_1b
    :goto_a
    if-eqz v11, :cond_1c

    .line 482
    .line 483
    invoke-static {v4, v11}, LT/d;->x(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    :cond_1c
    const/16 v0, 0x18

    .line 487
    .line 488
    if-eqz v9, :cond_1d

    .line 489
    .line 490
    if-lt v15, v0, :cond_1e

    .line 491
    .line 492
    invoke-static {v9}, LL/a;->g(Ljava/lang/String;)Landroid/os/LocaleList;

    .line 493
    .line 494
    .line 495
    move-result-object v3

    .line 496
    invoke-static {v4, v3}, LL/a;->r(Landroid/widget/TextView;Landroid/os/LocaleList;)V

    .line 497
    .line 498
    .line 499
    :cond_1d
    const/4 v6, 0x0

    .line 500
    goto :goto_b

    .line 501
    :cond_1e
    const/16 v3, 0x2c

    .line 502
    .line 503
    invoke-virtual {v9, v3}, Ljava/lang/String;->indexOf(I)I

    .line 504
    .line 505
    .line 506
    move-result v3

    .line 507
    const/4 v6, 0x0

    .line 508
    invoke-virtual {v9, v6, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 509
    .line 510
    .line 511
    move-result-object v3

    .line 512
    invoke-static {v3}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    .line 513
    .line 514
    .line 515
    move-result-object v3

    .line 516
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextLocale(Ljava/util/Locale;)V

    .line 517
    .line 518
    .line 519
    :goto_b
    sget-object v3, Lc/a;->g:[I

    .line 520
    .line 521
    iget-object v7, v1, Lj/t;->i:Lj/v;

    .line 522
    .line 523
    iget-object v8, v7, Lj/v;->j:Landroid/content/Context;

    .line 524
    .line 525
    move-object/from16 v9, p1

    .line 526
    .line 527
    invoke-virtual {v8, v9, v3, v2, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 528
    .line 529
    .line 530
    move-result-object v2

    .line 531
    const/4 v10, 0x5

    .line 532
    invoke-virtual {v2, v10}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 533
    .line 534
    .line 535
    move-result v11

    .line 536
    if-eqz v11, :cond_1f

    .line 537
    .line 538
    invoke-virtual {v2, v10, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 539
    .line 540
    .line 541
    move-result v10

    .line 542
    iput v10, v7, Lj/v;->a:I

    .line 543
    .line 544
    :cond_1f
    const/4 v6, 0x4

    .line 545
    invoke-virtual {v2, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 546
    .line 547
    .line 548
    move-result v10

    .line 549
    const/high16 v11, -0x40800000    # -1.0f

    .line 550
    .line 551
    if-eqz v10, :cond_20

    .line 552
    .line 553
    invoke-virtual {v2, v6, v11}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 554
    .line 555
    .line 556
    move-result v6

    .line 557
    :goto_c
    const/4 v10, 0x2

    .line 558
    goto :goto_d

    .line 559
    :cond_20
    const/high16 v6, -0x40800000    # -1.0f

    .line 560
    .line 561
    goto :goto_c

    .line 562
    :goto_d
    invoke-virtual {v2, v10}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 563
    .line 564
    .line 565
    move-result v12

    .line 566
    if-eqz v12, :cond_21

    .line 567
    .line 568
    invoke-virtual {v2, v10, v11}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 569
    .line 570
    .line 571
    move-result v12

    .line 572
    const/4 v10, 0x1

    .line 573
    goto :goto_e

    .line 574
    :cond_21
    const/4 v10, 0x1

    .line 575
    const/high16 v12, -0x40800000    # -1.0f

    .line 576
    .line 577
    :goto_e
    invoke-virtual {v2, v10}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 578
    .line 579
    .line 580
    move-result v13

    .line 581
    if-eqz v13, :cond_22

    .line 582
    .line 583
    invoke-virtual {v2, v10, v11}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 584
    .line 585
    .line 586
    move-result v13

    .line 587
    const/4 v10, 0x3

    .line 588
    goto :goto_f

    .line 589
    :cond_22
    const/4 v10, 0x3

    .line 590
    const/high16 v13, -0x40800000    # -1.0f

    .line 591
    .line 592
    :goto_f
    invoke-virtual {v2, v10}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 593
    .line 594
    .line 595
    move-result v14

    .line 596
    if-eqz v14, :cond_25

    .line 597
    .line 598
    const/4 v14, 0x0

    .line 599
    invoke-virtual {v2, v10, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 600
    .line 601
    .line 602
    move-result v15

    .line 603
    if-lez v15, :cond_25

    .line 604
    .line 605
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 606
    .line 607
    .line 608
    move-result-object v10

    .line 609
    invoke-virtual {v10, v15}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    .line 610
    .line 611
    .line 612
    move-result-object v10

    .line 613
    invoke-virtual {v10}, Landroid/content/res/TypedArray;->length()I

    .line 614
    .line 615
    .line 616
    move-result v14

    .line 617
    new-array v15, v14, [I

    .line 618
    .line 619
    if-lez v14, :cond_24

    .line 620
    .line 621
    const/4 v0, 0x0

    .line 622
    :goto_10
    if-ge v0, v14, :cond_23

    .line 623
    .line 624
    const/4 v11, -0x1

    .line 625
    invoke-virtual {v10, v0, v11}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 626
    .line 627
    .line 628
    move-result v22

    .line 629
    aput v22, v15, v0

    .line 630
    .line 631
    const/4 v11, 0x1

    .line 632
    add-int/2addr v0, v11

    .line 633
    const/high16 v11, -0x40800000    # -1.0f

    .line 634
    .line 635
    goto :goto_10

    .line 636
    :cond_23
    invoke-static {v15}, Lj/v;->b([I)[I

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    iput-object v0, v7, Lj/v;->f:[I

    .line 641
    .line 642
    invoke-virtual {v7}, Lj/v;->h()Z

    .line 643
    .line 644
    .line 645
    :cond_24
    invoke-virtual {v10}, Landroid/content/res/TypedArray;->recycle()V

    .line 646
    .line 647
    .line 648
    :cond_25
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 649
    .line 650
    .line 651
    iget v0, v7, Lj/v;->a:I

    .line 652
    .line 653
    const/high16 v2, 0x3f800000    # 1.0f

    .line 654
    .line 655
    const/4 v10, 0x1

    .line 656
    if-ne v0, v10, :cond_2a

    .line 657
    .line 658
    iget-boolean v0, v7, Lj/v;->g:Z

    .line 659
    .line 660
    if-nez v0, :cond_29

    .line 661
    .line 662
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    const/high16 v8, -0x40800000    # -1.0f

    .line 671
    .line 672
    cmpl-float v10, v12, v8

    .line 673
    .line 674
    if-nez v10, :cond_26

    .line 675
    .line 676
    const/high16 v10, 0x41400000    # 12.0f

    .line 677
    .line 678
    const/4 v11, 0x2

    .line 679
    invoke-static {v11, v10, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 680
    .line 681
    .line 682
    move-result v12

    .line 683
    goto :goto_11

    .line 684
    :cond_26
    const/4 v11, 0x2

    .line 685
    :goto_11
    cmpl-float v10, v13, v8

    .line 686
    .line 687
    if-nez v10, :cond_27

    .line 688
    .line 689
    const/high16 v10, 0x42e00000    # 112.0f

    .line 690
    .line 691
    invoke-static {v11, v10, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 692
    .line 693
    .line 694
    move-result v13

    .line 695
    :cond_27
    cmpl-float v0, v6, v8

    .line 696
    .line 697
    if-nez v0, :cond_28

    .line 698
    .line 699
    const/high16 v6, 0x3f800000    # 1.0f

    .line 700
    .line 701
    :cond_28
    invoke-virtual {v7, v12, v13, v6}, Lj/v;->i(FFF)V

    .line 702
    .line 703
    .line 704
    :cond_29
    invoke-virtual {v7}, Lj/v;->g()Z

    .line 705
    .line 706
    .line 707
    :cond_2a
    sget-boolean v0, LD/c;->a:Z

    .line 708
    .line 709
    if-eqz v0, :cond_2c

    .line 710
    .line 711
    iget v0, v7, Lj/v;->a:I

    .line 712
    .line 713
    if-eqz v0, :cond_2c

    .line 714
    .line 715
    iget-object v0, v7, Lj/v;->f:[I

    .line 716
    .line 717
    array-length v6, v0

    .line 718
    if-lez v6, :cond_2c

    .line 719
    .line 720
    invoke-static {v4}, LT/d;->b(Landroid/widget/TextView;)I

    .line 721
    .line 722
    .line 723
    move-result v6

    .line 724
    int-to-float v6, v6

    .line 725
    const/high16 v8, -0x40800000    # -1.0f

    .line 726
    .line 727
    cmpl-float v6, v6, v8

    .line 728
    .line 729
    if-eqz v6, :cond_2b

    .line 730
    .line 731
    iget v0, v7, Lj/v;->d:F

    .line 732
    .line 733
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 734
    .line 735
    .line 736
    move-result v0

    .line 737
    iget v6, v7, Lj/v;->e:F

    .line 738
    .line 739
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 740
    .line 741
    .line 742
    move-result v6

    .line 743
    iget v7, v7, Lj/v;->c:F

    .line 744
    .line 745
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    .line 746
    .line 747
    .line 748
    move-result v7

    .line 749
    invoke-static {v4, v0, v6, v7}, LT/d;->w(Landroid/widget/TextView;III)V

    .line 750
    .line 751
    .line 752
    goto :goto_12

    .line 753
    :cond_2b
    invoke-static {v4, v0}, LT/d;->y(Landroid/widget/TextView;[I)V

    .line 754
    .line 755
    .line 756
    :cond_2c
    :goto_12
    invoke-virtual {v5, v9, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    const/16 v3, 0x8

    .line 761
    .line 762
    const/4 v6, -0x1

    .line 763
    invoke-virtual {v0, v3, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 764
    .line 765
    .line 766
    move-result v3

    .line 767
    move-object/from16 v7, v18

    .line 768
    .line 769
    if-eq v3, v6, :cond_2d

    .line 770
    .line 771
    invoke-virtual {v7, v5, v3}, Lj/o;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 772
    .line 773
    .line 774
    move-result-object v3

    .line 775
    :goto_13
    const/16 v8, 0xd

    .line 776
    .line 777
    goto :goto_14

    .line 778
    :cond_2d
    const/4 v3, 0x0

    .line 779
    goto :goto_13

    .line 780
    :goto_14
    invoke-virtual {v0, v8, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 781
    .line 782
    .line 783
    move-result v8

    .line 784
    if-eq v8, v6, :cond_2e

    .line 785
    .line 786
    invoke-virtual {v7, v5, v8}, Lj/o;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 787
    .line 788
    .line 789
    move-result-object v8

    .line 790
    goto :goto_15

    .line 791
    :cond_2e
    const/4 v8, 0x0

    .line 792
    :goto_15
    const/16 v9, 0x9

    .line 793
    .line 794
    invoke-virtual {v0, v9, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 795
    .line 796
    .line 797
    move-result v9

    .line 798
    if-eq v9, v6, :cond_2f

    .line 799
    .line 800
    invoke-virtual {v7, v5, v9}, Lj/o;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 801
    .line 802
    .line 803
    move-result-object v9

    .line 804
    :goto_16
    const/4 v10, 0x6

    .line 805
    goto :goto_17

    .line 806
    :cond_2f
    const/4 v9, 0x0

    .line 807
    goto :goto_16

    .line 808
    :goto_17
    invoke-virtual {v0, v10, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 809
    .line 810
    .line 811
    move-result v10

    .line 812
    if-eq v10, v6, :cond_30

    .line 813
    .line 814
    invoke-virtual {v7, v5, v10}, Lj/o;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 815
    .line 816
    .line 817
    move-result-object v10

    .line 818
    goto :goto_18

    .line 819
    :cond_30
    const/4 v10, 0x0

    .line 820
    :goto_18
    const/16 v11, 0xa

    .line 821
    .line 822
    invoke-virtual {v0, v11, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 823
    .line 824
    .line 825
    move-result v11

    .line 826
    if-eq v11, v6, :cond_31

    .line 827
    .line 828
    invoke-virtual {v7, v5, v11}, Lj/o;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 829
    .line 830
    .line 831
    move-result-object v11

    .line 832
    goto :goto_19

    .line 833
    :cond_31
    const/4 v11, 0x0

    .line 834
    :goto_19
    const/4 v12, 0x7

    .line 835
    invoke-virtual {v0, v12, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 836
    .line 837
    .line 838
    move-result v12

    .line 839
    if-eq v12, v6, :cond_32

    .line 840
    .line 841
    invoke-virtual {v7, v5, v12}, Lj/o;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 842
    .line 843
    .line 844
    move-result-object v6

    .line 845
    goto :goto_1a

    .line 846
    :cond_32
    const/4 v6, 0x0

    .line 847
    :goto_1a
    if-nez v11, :cond_3d

    .line 848
    .line 849
    if-eqz v6, :cond_33

    .line 850
    .line 851
    goto :goto_23

    .line 852
    :cond_33
    if-nez v3, :cond_34

    .line 853
    .line 854
    if-nez v8, :cond_34

    .line 855
    .line 856
    if-nez v9, :cond_34

    .line 857
    .line 858
    if-eqz v10, :cond_42

    .line 859
    .line 860
    :cond_34
    invoke-virtual {v4}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 861
    .line 862
    .line 863
    move-result-object v6

    .line 864
    const/4 v7, 0x0

    .line 865
    aget-object v11, v6, v7

    .line 866
    .line 867
    if-nez v11, :cond_3a

    .line 868
    .line 869
    const/4 v12, 0x2

    .line 870
    aget-object v13, v6, v12

    .line 871
    .line 872
    if-eqz v13, :cond_35

    .line 873
    .line 874
    goto :goto_1f

    .line 875
    :cond_35
    invoke-virtual {v4}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    .line 876
    .line 877
    .line 878
    move-result-object v6

    .line 879
    if-eqz v3, :cond_36

    .line 880
    .line 881
    goto :goto_1b

    .line 882
    :cond_36
    aget-object v3, v6, v7

    .line 883
    .line 884
    :goto_1b
    if-eqz v8, :cond_37

    .line 885
    .line 886
    goto :goto_1c

    .line 887
    :cond_37
    const/4 v7, 0x1

    .line 888
    aget-object v8, v6, v7

    .line 889
    .line 890
    :goto_1c
    if-eqz v9, :cond_38

    .line 891
    .line 892
    goto :goto_1d

    .line 893
    :cond_38
    const/4 v7, 0x2

    .line 894
    aget-object v9, v6, v7

    .line 895
    .line 896
    :goto_1d
    if-eqz v10, :cond_39

    .line 897
    .line 898
    goto :goto_1e

    .line 899
    :cond_39
    const/4 v7, 0x3

    .line 900
    aget-object v10, v6, v7

    .line 901
    .line 902
    :goto_1e
    invoke-virtual {v4, v3, v8, v9, v10}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 903
    .line 904
    .line 905
    goto :goto_28

    .line 906
    :cond_3a
    :goto_1f
    if-eqz v8, :cond_3b

    .line 907
    .line 908
    :goto_20
    const/4 v3, 0x2

    .line 909
    goto :goto_21

    .line 910
    :cond_3b
    const/4 v3, 0x1

    .line 911
    aget-object v8, v6, v3

    .line 912
    .line 913
    goto :goto_20

    .line 914
    :goto_21
    aget-object v3, v6, v3

    .line 915
    .line 916
    if-eqz v10, :cond_3c

    .line 917
    .line 918
    goto :goto_22

    .line 919
    :cond_3c
    const/4 v7, 0x3

    .line 920
    aget-object v10, v6, v7

    .line 921
    .line 922
    :goto_22
    invoke-virtual {v4, v11, v8, v3, v10}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 923
    .line 924
    .line 925
    goto :goto_28

    .line 926
    :cond_3d
    :goto_23
    invoke-virtual {v4}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 927
    .line 928
    .line 929
    move-result-object v3

    .line 930
    if-eqz v11, :cond_3e

    .line 931
    .line 932
    goto :goto_24

    .line 933
    :cond_3e
    const/4 v7, 0x0

    .line 934
    aget-object v11, v3, v7

    .line 935
    .line 936
    :goto_24
    if-eqz v8, :cond_3f

    .line 937
    .line 938
    goto :goto_25

    .line 939
    :cond_3f
    const/4 v7, 0x1

    .line 940
    aget-object v8, v3, v7

    .line 941
    .line 942
    :goto_25
    if-eqz v6, :cond_40

    .line 943
    .line 944
    goto :goto_26

    .line 945
    :cond_40
    const/4 v6, 0x2

    .line 946
    aget-object v6, v3, v6

    .line 947
    .line 948
    :goto_26
    if-eqz v10, :cond_41

    .line 949
    .line 950
    goto :goto_27

    .line 951
    :cond_41
    const/4 v7, 0x3

    .line 952
    aget-object v10, v3, v7

    .line 953
    .line 954
    :goto_27
    invoke-virtual {v4, v11, v8, v6, v10}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 955
    .line 956
    .line 957
    :cond_42
    :goto_28
    const/16 v3, 0xb

    .line 958
    .line 959
    invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 960
    .line 961
    .line 962
    move-result v6

    .line 963
    if-eqz v6, :cond_45

    .line 964
    .line 965
    invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 966
    .line 967
    .line 968
    move-result v6

    .line 969
    if-eqz v6, :cond_43

    .line 970
    .line 971
    const/4 v6, 0x0

    .line 972
    invoke-virtual {v0, v3, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 973
    .line 974
    .line 975
    move-result v6

    .line 976
    if-eqz v6, :cond_43

    .line 977
    .line 978
    invoke-static {v5, v6}, Ld/b;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 979
    .line 980
    .line 981
    move-result-object v5

    .line 982
    if-eqz v5, :cond_43

    .line 983
    .line 984
    goto :goto_29

    .line 985
    :cond_43
    invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 986
    .line 987
    .line 988
    move-result-object v5

    .line 989
    :goto_29
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 990
    .line 991
    const/16 v6, 0x18

    .line 992
    .line 993
    if-lt v3, v6, :cond_44

    .line 994
    .line 995
    invoke-static {v4, v5}, LD/o;->f(Landroid/widget/TextView;Landroid/content/res/ColorStateList;)V

    .line 996
    .line 997
    .line 998
    goto :goto_2a

    .line 999
    :cond_44
    instance-of v3, v4, LD/t;

    .line 1000
    .line 1001
    if-eqz v3, :cond_45

    .line 1002
    .line 1003
    move-object v3, v4

    .line 1004
    check-cast v3, LD/t;

    .line 1005
    .line 1006
    invoke-interface {v3, v5}, LD/t;->setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V

    .line 1007
    .line 1008
    .line 1009
    :cond_45
    :goto_2a
    const/16 v3, 0xc

    .line 1010
    .line 1011
    invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 1012
    .line 1013
    .line 1014
    move-result v5

    .line 1015
    if-eqz v5, :cond_47

    .line 1016
    .line 1017
    const/4 v5, -0x1

    .line 1018
    invoke-virtual {v0, v3, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 1019
    .line 1020
    .line 1021
    move-result v3

    .line 1022
    const/4 v5, 0x0

    .line 1023
    invoke-static {v3, v5}, Lj/y;->d(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v3

    .line 1027
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1028
    .line 1029
    const/16 v6, 0x18

    .line 1030
    .line 1031
    if-lt v5, v6, :cond_46

    .line 1032
    .line 1033
    invoke-static {v4, v3}, LD/o;->g(Landroid/widget/TextView;Landroid/graphics/PorterDuff$Mode;)V

    .line 1034
    .line 1035
    .line 1036
    goto :goto_2b

    .line 1037
    :cond_46
    instance-of v5, v4, LD/t;

    .line 1038
    .line 1039
    if-eqz v5, :cond_47

    .line 1040
    .line 1041
    move-object v5, v4

    .line 1042
    check-cast v5, LD/t;

    .line 1043
    .line 1044
    invoke-interface {v5, v3}, LD/t;->setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 1045
    .line 1046
    .line 1047
    :cond_47
    :goto_2b
    const/4 v3, -0x1

    .line 1048
    const/16 v5, 0xe

    .line 1049
    .line 1050
    invoke-virtual {v0, v5, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1051
    .line 1052
    .line 1053
    move-result v5

    .line 1054
    const/16 v6, 0x11

    .line 1055
    .line 1056
    invoke-virtual {v0, v6, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1057
    .line 1058
    .line 1059
    move-result v6

    .line 1060
    const/16 v7, 0x12

    .line 1061
    .line 1062
    invoke-virtual {v0, v7, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1063
    .line 1064
    .line 1065
    move-result v7

    .line 1066
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 1067
    .line 1068
    .line 1069
    if-eq v5, v3, :cond_48

    .line 1070
    .line 1071
    invoke-static {v4, v5}, La1/a;->y(Landroid/widget/TextView;I)V

    .line 1072
    .line 1073
    .line 1074
    :cond_48
    if-eq v6, v3, :cond_49

    .line 1075
    .line 1076
    invoke-static {v4, v6}, La1/a;->z(Landroid/widget/TextView;I)V

    .line 1077
    .line 1078
    .line 1079
    :cond_49
    if-eq v7, v3, :cond_4b

    .line 1080
    .line 1081
    if-ltz v7, :cond_4a

    .line 1082
    .line 1083
    invoke-virtual {v4}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v0

    .line 1087
    const/4 v3, 0x0

    .line 1088
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I

    .line 1089
    .line 1090
    .line 1091
    move-result v0

    .line 1092
    if-eq v7, v0, :cond_4b

    .line 1093
    .line 1094
    sub-int/2addr v7, v0

    .line 1095
    int-to-float v0, v7

    .line 1096
    invoke-virtual {v4, v0, v2}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 1097
    .line 1098
    .line 1099
    goto :goto_2c

    .line 1100
    :cond_4a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1101
    .line 1102
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 1103
    .line 1104
    .line 1105
    throw v0

    .line 1106
    :cond_4b
    :goto_2c
    return-void

    .line 1107
    :goto_2d
    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1108
    throw v0
.end method

.method public final e(Landroid/content/Context;I)V
    .locals 6

    .line 1
    sget-object v0, Lc/a;->s:[I

    .line 2
    .line 3
    new-instance v1, LN/b;

    .line 4
    .line 5
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-direct {v1, p1, p2}, LN/b;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 10
    .line 11
    .line 12
    const/16 v0, 0xe

    .line 13
    .line 14
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    iget-object v3, p0, Lj/t;->a:Landroid/widget/TextView;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p2, v0, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 28
    .line 29
    .line 30
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    const/16 v2, 0x17

    .line 33
    .line 34
    if-ge v0, v2, :cond_1

    .line 35
    .line 36
    const/4 v2, 0x3

    .line 37
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_1

    .line 42
    .line 43
    invoke-virtual {v1, v2}, LN/b;->x(I)Landroid/content/res/ColorStateList;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-virtual {p2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    const/4 v2, -0x1

    .line 59
    invoke-virtual {p2, v4, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_2

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    invoke-virtual {v3, v4, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 67
    .line 68
    .line 69
    :cond_2
    invoke-virtual {p0, p1, v1}, Lj/t;->f(Landroid/content/Context;LN/b;)V

    .line 70
    .line 71
    .line 72
    const/16 p1, 0x1a

    .line 73
    .line 74
    if-lt v0, p1, :cond_3

    .line 75
    .line 76
    const/16 p1, 0xd

    .line 77
    .line 78
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-eqz p1, :cond_3

    .line 89
    .line 90
    invoke-static {v3, p1}, LT/d;->x(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :cond_3
    invoke-virtual {v1}, LN/b;->L()V

    .line 94
    .line 95
    .line 96
    iget-object p1, p0, Lj/t;->l:Landroid/graphics/Typeface;

    .line 97
    .line 98
    if-eqz p1, :cond_4

    .line 99
    .line 100
    iget p2, p0, Lj/t;->j:I

    .line 101
    .line 102
    invoke-virtual {v3, p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 103
    .line 104
    .line 105
    :cond_4
    return-void
.end method

.method public final f(Landroid/content/Context;LN/b;)V
    .locals 10

    .line 1
    iget v0, p0, Lj/t;->j:I

    .line 2
    .line 3
    iget-object v1, p2, LN/b;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/content/res/TypedArray;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iput v0, p0, Lj/t;->j:I

    .line 13
    .line 14
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 15
    .line 16
    const/16 v3, 0x1c

    .line 17
    .line 18
    const/4 v4, -0x1

    .line 19
    if-lt v0, v3, :cond_0

    .line 20
    .line 21
    const/16 v5, 0xb

    .line 22
    .line 23
    invoke-virtual {v1, v5, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    iput v5, p0, Lj/t;->k:I

    .line 28
    .line 29
    if-eq v5, v4, :cond_0

    .line 30
    .line 31
    iget v5, p0, Lj/t;->j:I

    .line 32
    .line 33
    and-int/2addr v5, v2

    .line 34
    iput v5, p0, Lj/t;->j:I

    .line 35
    .line 36
    :cond_0
    const/16 v5, 0xa

    .line 37
    .line 38
    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    const/16 v7, 0xc

    .line 43
    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v9, 0x1

    .line 46
    if-nez v6, :cond_6

    .line 47
    .line 48
    invoke-virtual {v1, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-virtual {v1, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_5

    .line 60
    .line 61
    iput-boolean v8, p0, Lj/t;->m:Z

    .line 62
    .line 63
    invoke-virtual {v1, v9, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eq p1, v9, :cond_4

    .line 68
    .line 69
    if-eq p1, v2, :cond_3

    .line 70
    .line 71
    const/4 p2, 0x3

    .line 72
    if-eq p1, p2, :cond_2

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    .line 76
    .line 77
    iput-object p1, p0, Lj/t;->l:Landroid/graphics/Typeface;

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    .line 81
    .line 82
    iput-object p1, p0, Lj/t;->l:Landroid/graphics/Typeface;

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    .line 86
    .line 87
    iput-object p1, p0, Lj/t;->l:Landroid/graphics/Typeface;

    .line 88
    .line 89
    :cond_5
    :goto_0
    return-void

    .line 90
    :cond_6
    :goto_1
    const/4 v6, 0x0

    .line 91
    iput-object v6, p0, Lj/t;->l:Landroid/graphics/Typeface;

    .line 92
    .line 93
    invoke-virtual {v1, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    if-eqz v6, :cond_7

    .line 98
    .line 99
    const/16 v5, 0xc

    .line 100
    .line 101
    :cond_7
    iget v6, p0, Lj/t;->k:I

    .line 102
    .line 103
    iget v7, p0, Lj/t;->j:I

    .line 104
    .line 105
    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-nez p1, :cond_c

    .line 110
    .line 111
    new-instance p1, Lj/s;

    .line 112
    .line 113
    invoke-direct {p1, p0, v6, v7}, Lj/s;-><init>(Lj/t;II)V

    .line 114
    .line 115
    .line 116
    :try_start_0
    iget v6, p0, Lj/t;->j:I

    .line 117
    .line 118
    invoke-virtual {p2, v5, v6, p1}, LN/b;->z(IILj/s;)Landroid/graphics/Typeface;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    if-eqz p1, :cond_a

    .line 123
    .line 124
    if-lt v0, v3, :cond_9

    .line 125
    .line 126
    iget p2, p0, Lj/t;->k:I

    .line 127
    .line 128
    if-eq p2, v4, :cond_9

    .line 129
    .line 130
    invoke-static {p1, v8}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    iget p2, p0, Lj/t;->k:I

    .line 135
    .line 136
    iget v0, p0, Lj/t;->j:I

    .line 137
    .line 138
    and-int/2addr v0, v2

    .line 139
    if-eqz v0, :cond_8

    .line 140
    .line 141
    const/4 v0, 0x1

    .line 142
    goto :goto_2

    .line 143
    :cond_8
    const/4 v0, 0x0

    .line 144
    :goto_2
    invoke-static {p1, p2, v0}, LL/l;->g(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    iput-object p1, p0, Lj/t;->l:Landroid/graphics/Typeface;

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :catch_0
    nop

    .line 152
    goto :goto_5

    .line 153
    :cond_9
    iput-object p1, p0, Lj/t;->l:Landroid/graphics/Typeface;

    .line 154
    .line 155
    :cond_a
    :goto_3
    iget-object p1, p0, Lj/t;->l:Landroid/graphics/Typeface;

    .line 156
    .line 157
    if-nez p1, :cond_b

    .line 158
    .line 159
    const/4 p1, 0x1

    .line 160
    goto :goto_4

    .line 161
    :cond_b
    const/4 p1, 0x0

    .line 162
    :goto_4
    iput-boolean p1, p0, Lj/t;->m:Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 163
    .line 164
    :cond_c
    :goto_5
    iget-object p1, p0, Lj/t;->l:Landroid/graphics/Typeface;

    .line 165
    .line 166
    if-nez p1, :cond_f

    .line 167
    .line 168
    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    if-eqz p1, :cond_f

    .line 173
    .line 174
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 175
    .line 176
    if-lt p2, v3, :cond_e

    .line 177
    .line 178
    iget p2, p0, Lj/t;->k:I

    .line 179
    .line 180
    if-eq p2, v4, :cond_e

    .line 181
    .line 182
    invoke-static {p1, v8}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    iget p2, p0, Lj/t;->k:I

    .line 187
    .line 188
    iget v0, p0, Lj/t;->j:I

    .line 189
    .line 190
    and-int/2addr v0, v2

    .line 191
    if-eqz v0, :cond_d

    .line 192
    .line 193
    const/4 v8, 0x1

    .line 194
    :cond_d
    invoke-static {p1, p2, v8}, LL/l;->g(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    iput-object p1, p0, Lj/t;->l:Landroid/graphics/Typeface;

    .line 199
    .line 200
    goto :goto_6

    .line 201
    :cond_e
    iget p2, p0, Lj/t;->j:I

    .line 202
    .line 203
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    iput-object p1, p0, Lj/t;->l:Landroid/graphics/Typeface;

    .line 208
    .line 209
    :cond_f
    :goto_6
    return-void
.end method
