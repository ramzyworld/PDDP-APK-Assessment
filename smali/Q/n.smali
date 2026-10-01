.class public final LQ/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final p:Landroid/graphics/Matrix;


# instance fields
.field public final a:Landroid/graphics/Path;

.field public final b:Landroid/graphics/Path;

.field public final c:Landroid/graphics/Matrix;

.field public d:Landroid/graphics/Paint;

.field public e:Landroid/graphics/Paint;

.field public f:Landroid/graphics/PathMeasure;

.field public final g:LQ/k;

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:I

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/Boolean;

.field public final o:Lm/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LQ/n;->p:Landroid/graphics/Matrix;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, LQ/n;->c:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, LQ/n;->h:F

    .line 4
    iput v0, p0, LQ/n;->i:F

    .line 5
    iput v0, p0, LQ/n;->j:F

    .line 6
    iput v0, p0, LQ/n;->k:F

    const/16 v0, 0xff

    .line 7
    iput v0, p0, LQ/n;->l:I

    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, LQ/n;->m:Ljava/lang/String;

    .line 9
    iput-object v0, p0, LQ/n;->n:Ljava/lang/Boolean;

    .line 10
    new-instance v0, Lm/a;

    .line 11
    invoke-direct {v0}, Lm/i;-><init>()V

    .line 12
    iput-object v0, p0, LQ/n;->o:Lm/a;

    .line 13
    new-instance v0, LQ/k;

    invoke-direct {v0}, LQ/k;-><init>()V

    iput-object v0, p0, LQ/n;->g:LQ/k;

    .line 14
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, LQ/n;->a:Landroid/graphics/Path;

    .line 15
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, LQ/n;->b:Landroid/graphics/Path;

    return-void
.end method

.method public constructor <init>(LQ/n;)V
    .locals 3

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, LQ/n;->c:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    .line 18
    iput v0, p0, LQ/n;->h:F

    .line 19
    iput v0, p0, LQ/n;->i:F

    .line 20
    iput v0, p0, LQ/n;->j:F

    .line 21
    iput v0, p0, LQ/n;->k:F

    const/16 v0, 0xff

    .line 22
    iput v0, p0, LQ/n;->l:I

    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, LQ/n;->m:Ljava/lang/String;

    .line 24
    iput-object v0, p0, LQ/n;->n:Ljava/lang/Boolean;

    .line 25
    new-instance v0, Lm/a;

    .line 26
    invoke-direct {v0}, Lm/i;-><init>()V

    .line 27
    iput-object v0, p0, LQ/n;->o:Lm/a;

    .line 28
    new-instance v1, LQ/k;

    iget-object v2, p1, LQ/n;->g:LQ/k;

    invoke-direct {v1, v2, v0}, LQ/k;-><init>(LQ/k;Lm/a;)V

    iput-object v1, p0, LQ/n;->g:LQ/k;

    .line 29
    new-instance v1, Landroid/graphics/Path;

    iget-object v2, p1, LQ/n;->a:Landroid/graphics/Path;

    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    iput-object v1, p0, LQ/n;->a:Landroid/graphics/Path;

    .line 30
    new-instance v1, Landroid/graphics/Path;

    iget-object v2, p1, LQ/n;->b:Landroid/graphics/Path;

    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    iput-object v1, p0, LQ/n;->b:Landroid/graphics/Path;

    .line 31
    iget v1, p1, LQ/n;->h:F

    iput v1, p0, LQ/n;->h:F

    .line 32
    iget v1, p1, LQ/n;->i:F

    iput v1, p0, LQ/n;->i:F

    .line 33
    iget v1, p1, LQ/n;->j:F

    iput v1, p0, LQ/n;->j:F

    .line 34
    iget v1, p1, LQ/n;->k:F

    iput v1, p0, LQ/n;->k:F

    .line 35
    iget v1, p1, LQ/n;->l:I

    iput v1, p0, LQ/n;->l:I

    .line 36
    iget-object v1, p1, LQ/n;->m:Ljava/lang/String;

    iput-object v1, p0, LQ/n;->m:Ljava/lang/String;

    .line 37
    iget-object v1, p1, LQ/n;->m:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 38
    invoke-virtual {v0, v1, p0}, Lm/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    :cond_0
    iget-object p1, p1, LQ/n;->n:Ljava/lang/Boolean;

    iput-object p1, p0, LQ/n;->n:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final a(LQ/k;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V
    .locals 18

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v8, p3

    .line 6
    .line 7
    const/4 v9, 0x1

    .line 8
    iget-object v0, v7, LQ/k;->a:Landroid/graphics/Matrix;

    .line 9
    .line 10
    move-object/from16 v1, p2

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 13
    .line 14
    .line 15
    iget-object v10, v7, LQ/k;->a:Landroid/graphics/Matrix;

    .line 16
    .line 17
    iget-object v0, v7, LQ/k;->j:Landroid/graphics/Matrix;

    .line 18
    .line 19
    invoke-virtual {v10, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 20
    .line 21
    .line 22
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->save()I

    .line 23
    .line 24
    .line 25
    const/4 v11, 0x0

    .line 26
    const/4 v12, 0x0

    .line 27
    :goto_0
    iget-object v0, v7, LQ/k;->b:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-ge v12, v1, :cond_17

    .line 34
    .line 35
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, LQ/l;

    .line 40
    .line 41
    instance-of v1, v0, LQ/k;

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    move-object v1, v0

    .line 46
    check-cast v1, LQ/k;

    .line 47
    .line 48
    move-object/from16 v0, p0

    .line 49
    .line 50
    move-object v2, v10

    .line 51
    move-object/from16 v3, p3

    .line 52
    .line 53
    move/from16 v4, p4

    .line 54
    .line 55
    move/from16 v5, p5

    .line 56
    .line 57
    invoke-virtual/range {v0 .. v5}, LQ/n;->a(LQ/k;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V

    .line 58
    .line 59
    .line 60
    :cond_0
    move/from16 v1, p4

    .line 61
    .line 62
    move-object/from16 v17, v10

    .line 63
    .line 64
    :cond_1
    :goto_1
    const/4 v0, 0x1

    .line 65
    goto/16 :goto_c

    .line 66
    .line 67
    :cond_2
    instance-of v1, v0, LQ/m;

    .line 68
    .line 69
    if-eqz v1, :cond_0

    .line 70
    .line 71
    check-cast v0, LQ/m;

    .line 72
    .line 73
    move/from16 v1, p4

    .line 74
    .line 75
    int-to-float v2, v1

    .line 76
    iget v3, v6, LQ/n;->j:F

    .line 77
    .line 78
    div-float/2addr v2, v3

    .line 79
    move/from16 v3, p5

    .line 80
    .line 81
    int-to-float v4, v3

    .line 82
    iget v5, v6, LQ/n;->k:F

    .line 83
    .line 84
    div-float/2addr v4, v5

    .line 85
    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    iget-object v13, v6, LQ/n;->c:Landroid/graphics/Matrix;

    .line 90
    .line 91
    invoke-virtual {v13, v10}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v13, v2, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 95
    .line 96
    .line 97
    const/4 v14, 0x4

    .line 98
    new-array v14, v14, [F

    .line 99
    .line 100
    fill-array-data v14, :array_0

    .line 101
    .line 102
    .line 103
    invoke-virtual {v10, v14}, Landroid/graphics/Matrix;->mapVectors([F)V

    .line 104
    .line 105
    .line 106
    aget v15, v14, v11

    .line 107
    .line 108
    move/from16 p2, v5

    .line 109
    .line 110
    float-to-double v4, v15

    .line 111
    aget v15, v14, v9

    .line 112
    .line 113
    float-to-double v2, v15

    .line 114
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->hypot(DD)D

    .line 115
    .line 116
    .line 117
    move-result-wide v2

    .line 118
    double-to-float v2, v2

    .line 119
    const/4 v3, 0x2

    .line 120
    aget v4, v14, v3

    .line 121
    .line 122
    float-to-double v4, v4

    .line 123
    const/4 v15, 0x3

    .line 124
    aget v3, v14, v15

    .line 125
    .line 126
    move-object/from16 v17, v10

    .line 127
    .line 128
    float-to-double v9, v3

    .line 129
    invoke-static {v4, v5, v9, v10}, Ljava/lang/Math;->hypot(DD)D

    .line 130
    .line 131
    .line 132
    move-result-wide v3

    .line 133
    double-to-float v3, v3

    .line 134
    aget v4, v14, v11

    .line 135
    .line 136
    const/4 v5, 0x1

    .line 137
    aget v9, v14, v5

    .line 138
    .line 139
    const/4 v5, 0x2

    .line 140
    aget v5, v14, v5

    .line 141
    .line 142
    aget v10, v14, v15

    .line 143
    .line 144
    mul-float v4, v4, v10

    .line 145
    .line 146
    mul-float v9, v9, v5

    .line 147
    .line 148
    sub-float/2addr v4, v9

    .line 149
    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    const/16 v16, 0x0

    .line 154
    .line 155
    cmpl-float v3, v2, v16

    .line 156
    .line 157
    if-lez v3, :cond_3

    .line 158
    .line 159
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    div-float v2, v3, v2

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_3
    const/4 v2, 0x0

    .line 167
    :goto_2
    cmpl-float v3, v2, v16

    .line 168
    .line 169
    if-nez v3, :cond_4

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_4
    iget-object v3, v6, LQ/n;->a:Landroid/graphics/Path;

    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v3}, Landroid/graphics/Path;->reset()V

    .line 178
    .line 179
    .line 180
    iget-object v4, v0, LQ/m;->a:[Lr/d;

    .line 181
    .line 182
    if-eqz v4, :cond_5

    .line 183
    .line 184
    invoke-static {v4, v3}, Lr/d;->b([Lr/d;Landroid/graphics/Path;)V

    .line 185
    .line 186
    .line 187
    :cond_5
    iget-object v4, v6, LQ/n;->b:Landroid/graphics/Path;

    .line 188
    .line 189
    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    .line 190
    .line 191
    .line 192
    instance-of v5, v0, LQ/i;

    .line 193
    .line 194
    if-eqz v5, :cond_7

    .line 195
    .line 196
    iget v0, v0, LQ/m;->c:I

    .line 197
    .line 198
    if-nez v0, :cond_6

    .line 199
    .line 200
    sget-object v0, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_6
    sget-object v0, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 204
    .line 205
    :goto_3
    invoke-virtual {v4, v0}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v4, v3, v13}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v8, v4}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 212
    .line 213
    .line 214
    goto/16 :goto_1

    .line 215
    .line 216
    :cond_7
    check-cast v0, LQ/j;

    .line 217
    .line 218
    iget v5, v0, LQ/j;->i:F

    .line 219
    .line 220
    const/4 v9, 0x0

    .line 221
    cmpl-float v10, v5, v9

    .line 222
    .line 223
    if-nez v10, :cond_8

    .line 224
    .line 225
    iget v9, v0, LQ/j;->j:F

    .line 226
    .line 227
    const/high16 v10, 0x3f800000    # 1.0f

    .line 228
    .line 229
    cmpl-float v9, v9, v10

    .line 230
    .line 231
    if-eqz v9, :cond_b

    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_8
    const/high16 v10, 0x3f800000    # 1.0f

    .line 235
    .line 236
    :goto_4
    iget v9, v0, LQ/j;->k:F

    .line 237
    .line 238
    add-float/2addr v5, v9

    .line 239
    rem-float/2addr v5, v10

    .line 240
    iget v14, v0, LQ/j;->j:F

    .line 241
    .line 242
    add-float/2addr v14, v9

    .line 243
    rem-float/2addr v14, v10

    .line 244
    iget-object v9, v6, LQ/n;->f:Landroid/graphics/PathMeasure;

    .line 245
    .line 246
    if-nez v9, :cond_9

    .line 247
    .line 248
    new-instance v9, Landroid/graphics/PathMeasure;

    .line 249
    .line 250
    invoke-direct {v9}, Landroid/graphics/PathMeasure;-><init>()V

    .line 251
    .line 252
    .line 253
    iput-object v9, v6, LQ/n;->f:Landroid/graphics/PathMeasure;

    .line 254
    .line 255
    :cond_9
    iget-object v9, v6, LQ/n;->f:Landroid/graphics/PathMeasure;

    .line 256
    .line 257
    invoke-virtual {v9, v3, v11}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 258
    .line 259
    .line 260
    iget-object v9, v6, LQ/n;->f:Landroid/graphics/PathMeasure;

    .line 261
    .line 262
    invoke-virtual {v9}, Landroid/graphics/PathMeasure;->getLength()F

    .line 263
    .line 264
    .line 265
    move-result v9

    .line 266
    mul-float v5, v5, v9

    .line 267
    .line 268
    mul-float v14, v14, v9

    .line 269
    .line 270
    invoke-virtual {v3}, Landroid/graphics/Path;->reset()V

    .line 271
    .line 272
    .line 273
    cmpl-float v10, v5, v14

    .line 274
    .line 275
    if-lez v10, :cond_a

    .line 276
    .line 277
    iget-object v10, v6, LQ/n;->f:Landroid/graphics/PathMeasure;

    .line 278
    .line 279
    const/4 v15, 0x1

    .line 280
    invoke-virtual {v10, v5, v9, v3, v15}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 281
    .line 282
    .line 283
    iget-object v5, v6, LQ/n;->f:Landroid/graphics/PathMeasure;

    .line 284
    .line 285
    const/4 v9, 0x0

    .line 286
    invoke-virtual {v5, v9, v14, v3, v15}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 287
    .line 288
    .line 289
    goto :goto_5

    .line 290
    :cond_a
    const/4 v9, 0x0

    .line 291
    const/4 v15, 0x1

    .line 292
    iget-object v10, v6, LQ/n;->f:Landroid/graphics/PathMeasure;

    .line 293
    .line 294
    invoke-virtual {v10, v5, v14, v3, v15}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 295
    .line 296
    .line 297
    :goto_5
    invoke-virtual {v3, v9, v9}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 298
    .line 299
    .line 300
    :cond_b
    invoke-virtual {v4, v3, v13}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    .line 301
    .line 302
    .line 303
    iget-object v3, v0, LQ/j;->f:Lq/d;

    .line 304
    .line 305
    iget-object v5, v3, Lq/d;->a:Landroid/graphics/Shader;

    .line 306
    .line 307
    if-eqz v5, :cond_c

    .line 308
    .line 309
    goto :goto_6

    .line 310
    :cond_c
    iget v5, v3, Lq/d;->c:I

    .line 311
    .line 312
    if-eqz v5, :cond_d

    .line 313
    .line 314
    :goto_6
    const/4 v5, 0x1

    .line 315
    goto :goto_7

    .line 316
    :cond_d
    const/4 v5, 0x0

    .line 317
    :goto_7
    const v9, 0xffffff

    .line 318
    .line 319
    .line 320
    const/4 v10, 0x0

    .line 321
    const/16 v14, 0xff

    .line 322
    .line 323
    const/high16 v15, 0x437f0000    # 255.0f

    .line 324
    .line 325
    if-eqz v5, :cond_11

    .line 326
    .line 327
    iget-object v5, v6, LQ/n;->e:Landroid/graphics/Paint;

    .line 328
    .line 329
    if-nez v5, :cond_e

    .line 330
    .line 331
    new-instance v5, Landroid/graphics/Paint;

    .line 332
    .line 333
    const/4 v11, 0x1

    .line 334
    invoke-direct {v5, v11}, Landroid/graphics/Paint;-><init>(I)V

    .line 335
    .line 336
    .line 337
    iput-object v5, v6, LQ/n;->e:Landroid/graphics/Paint;

    .line 338
    .line 339
    sget-object v11, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 340
    .line 341
    invoke-virtual {v5, v11}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 342
    .line 343
    .line 344
    :cond_e
    iget-object v5, v6, LQ/n;->e:Landroid/graphics/Paint;

    .line 345
    .line 346
    iget-object v11, v3, Lq/d;->a:Landroid/graphics/Shader;

    .line 347
    .line 348
    if-eqz v11, :cond_f

    .line 349
    .line 350
    invoke-virtual {v11, v13}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v5, v11}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 354
    .line 355
    .line 356
    iget v3, v0, LQ/j;->h:F

    .line 357
    .line 358
    mul-float v3, v3, v15

    .line 359
    .line 360
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 361
    .line 362
    .line 363
    move-result v3

    .line 364
    invoke-virtual {v5, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 365
    .line 366
    .line 367
    goto :goto_8

    .line 368
    :cond_f
    invoke-virtual {v5, v10}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v5, v14}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 372
    .line 373
    .line 374
    iget v3, v3, Lq/d;->c:I

    .line 375
    .line 376
    iget v11, v0, LQ/j;->h:F

    .line 377
    .line 378
    sget-object v16, LQ/q;->n:Landroid/graphics/PorterDuff$Mode;

    .line 379
    .line 380
    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    .line 381
    .line 382
    .line 383
    move-result v14

    .line 384
    and-int/2addr v3, v9

    .line 385
    int-to-float v14, v14

    .line 386
    mul-float v14, v14, v11

    .line 387
    .line 388
    float-to-int v11, v14

    .line 389
    shl-int/lit8 v11, v11, 0x18

    .line 390
    .line 391
    or-int/2addr v3, v11

    .line 392
    invoke-virtual {v5, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 393
    .line 394
    .line 395
    :goto_8
    invoke-virtual {v5, v10}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 396
    .line 397
    .line 398
    iget v3, v0, LQ/m;->c:I

    .line 399
    .line 400
    if-nez v3, :cond_10

    .line 401
    .line 402
    sget-object v3, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 403
    .line 404
    goto :goto_9

    .line 405
    :cond_10
    sget-object v3, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 406
    .line 407
    :goto_9
    invoke-virtual {v4, v3}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v8, v4, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 411
    .line 412
    .line 413
    :cond_11
    iget-object v3, v0, LQ/j;->d:Lq/d;

    .line 414
    .line 415
    iget-object v5, v3, Lq/d;->a:Landroid/graphics/Shader;

    .line 416
    .line 417
    if-eqz v5, :cond_12

    .line 418
    .line 419
    goto :goto_a

    .line 420
    :cond_12
    iget v5, v3, Lq/d;->c:I

    .line 421
    .line 422
    if-eqz v5, :cond_1

    .line 423
    .line 424
    :goto_a
    iget-object v5, v6, LQ/n;->d:Landroid/graphics/Paint;

    .line 425
    .line 426
    if-nez v5, :cond_13

    .line 427
    .line 428
    new-instance v5, Landroid/graphics/Paint;

    .line 429
    .line 430
    const/4 v11, 0x1

    .line 431
    invoke-direct {v5, v11}, Landroid/graphics/Paint;-><init>(I)V

    .line 432
    .line 433
    .line 434
    iput-object v5, v6, LQ/n;->d:Landroid/graphics/Paint;

    .line 435
    .line 436
    sget-object v11, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 437
    .line 438
    invoke-virtual {v5, v11}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 439
    .line 440
    .line 441
    :cond_13
    iget-object v5, v6, LQ/n;->d:Landroid/graphics/Paint;

    .line 442
    .line 443
    iget-object v11, v0, LQ/j;->m:Landroid/graphics/Paint$Join;

    .line 444
    .line 445
    if-eqz v11, :cond_14

    .line 446
    .line 447
    invoke-virtual {v5, v11}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 448
    .line 449
    .line 450
    :cond_14
    iget-object v11, v0, LQ/j;->l:Landroid/graphics/Paint$Cap;

    .line 451
    .line 452
    if-eqz v11, :cond_15

    .line 453
    .line 454
    invoke-virtual {v5, v11}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 455
    .line 456
    .line 457
    :cond_15
    iget v11, v0, LQ/j;->n:F

    .line 458
    .line 459
    invoke-virtual {v5, v11}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 460
    .line 461
    .line 462
    iget-object v11, v3, Lq/d;->a:Landroid/graphics/Shader;

    .line 463
    .line 464
    if-eqz v11, :cond_16

    .line 465
    .line 466
    invoke-virtual {v11, v13}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v5, v11}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 470
    .line 471
    .line 472
    iget v3, v0, LQ/j;->g:F

    .line 473
    .line 474
    mul-float v3, v3, v15

    .line 475
    .line 476
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 477
    .line 478
    .line 479
    move-result v3

    .line 480
    invoke-virtual {v5, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 481
    .line 482
    .line 483
    goto :goto_b

    .line 484
    :cond_16
    invoke-virtual {v5, v10}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 485
    .line 486
    .line 487
    const/16 v11, 0xff

    .line 488
    .line 489
    invoke-virtual {v5, v11}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 490
    .line 491
    .line 492
    iget v3, v3, Lq/d;->c:I

    .line 493
    .line 494
    iget v11, v0, LQ/j;->g:F

    .line 495
    .line 496
    sget-object v13, LQ/q;->n:Landroid/graphics/PorterDuff$Mode;

    .line 497
    .line 498
    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    .line 499
    .line 500
    .line 501
    move-result v13

    .line 502
    and-int/2addr v3, v9

    .line 503
    int-to-float v9, v13

    .line 504
    mul-float v9, v9, v11

    .line 505
    .line 506
    float-to-int v9, v9

    .line 507
    shl-int/lit8 v9, v9, 0x18

    .line 508
    .line 509
    or-int/2addr v3, v9

    .line 510
    invoke-virtual {v5, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 511
    .line 512
    .line 513
    :goto_b
    invoke-virtual {v5, v10}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 514
    .line 515
    .line 516
    mul-float v2, v2, p2

    .line 517
    .line 518
    iget v0, v0, LQ/j;->e:F

    .line 519
    .line 520
    mul-float v0, v0, v2

    .line 521
    .line 522
    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v8, v4, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 526
    .line 527
    .line 528
    goto/16 :goto_1

    .line 529
    .line 530
    :goto_c
    add-int/2addr v12, v0

    .line 531
    move-object/from16 v10, v17

    .line 532
    .line 533
    const/4 v9, 0x1

    .line 534
    const/4 v11, 0x0

    .line 535
    goto/16 :goto_0

    .line 536
    .line 537
    :cond_17
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->restore()V

    .line 538
    .line 539
    .line 540
    return-void

    .line 541
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public getAlpha()F
    .locals 2

    .line 1
    invoke-virtual {p0}, LQ/n;->getRootAlpha()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    const/high16 v1, 0x437f0000    # 255.0f

    .line 7
    .line 8
    div-float/2addr v0, v1

    .line 9
    return v0
.end method

.method public getRootAlpha()I
    .locals 1

    .line 1
    iget v0, p0, LQ/n;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public setAlpha(F)V
    .locals 1

    .line 1
    const/high16 v0, 0x437f0000    # 255.0f

    .line 2
    .line 3
    mul-float p1, p1, v0

    .line 4
    .line 5
    float-to-int p1, p1

    .line 6
    invoke-virtual {p0, p1}, LQ/n;->setRootAlpha(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setRootAlpha(I)V
    .locals 0

    .line 1
    iput p1, p0, LQ/n;->l:I

    .line 2
    .line 3
    return-void
.end method
