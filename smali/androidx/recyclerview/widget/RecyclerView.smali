.class public Landroidx/recyclerview/widget/RecyclerView;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# static fields
.field public static final l0:[I

.field public static final m0:[I

.field public static final n0:Z

.field public static final o0:[Ljava/lang/Class;

.field public static final p0:LN/r;


# instance fields
.field public A:I

.field public final B:I

.field public C:LN/u;

.field public D:Landroid/widget/EdgeEffect;

.field public E:Landroid/widget/EdgeEffect;

.field public F:Landroid/widget/EdgeEffect;

.field public G:Landroid/widget/EdgeEffect;

.field public H:LN/v;

.field public I:I

.field public J:I

.field public K:Landroid/view/VelocityTracker;

.field public L:I

.field public M:I

.field public N:I

.field public O:I

.field public P:I

.field public final Q:I

.field public final R:I

.field public final S:F

.field public final T:F

.field public U:Z

.field public final V:LN/I;

.field public W:LN/l;

.field public final a0:LN/j;

.field public final b0:LN/G;

.field public c0:Ljava/util/ArrayList;

.field public final d0:LH/a;

.field public final e:LN/D;

.field public e0:LN/K;

.field public f:LN/F;

.field public f0:Ly/g;

.field public final g:LN/b;

.field public final g0:[I

.field public final h:LN/b;

.field public final h0:[I

.field public final i:LH/a;

.field public final i0:[I

.field public j:Z

.field public final j0:Ljava/util/ArrayList;

.field public final k:Landroid/graphics/Rect;

.field public final k0:LD/b;

.field public final l:Landroid/graphics/Rect;

.field public m:LN/x;

.field public final n:Ljava/util/ArrayList;

.field public final o:Ljava/util/ArrayList;

.field public p:LN/h;

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:I

.field public u:Z

.field public v:Z

.field public w:I

.field public final x:Landroid/view/accessibility/AccessibilityManager;

.field public y:Z

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const v1, 0x1010436

    .line 3
    .line 4
    .line 5
    filled-new-array {v1}, [I

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sput-object v1, Landroidx/recyclerview/widget/RecyclerView;->l0:[I

    .line 10
    .line 11
    const v1, 0x10100eb

    .line 12
    .line 13
    .line 14
    filled-new-array {v1}, [I

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sput-object v1, Landroidx/recyclerview/widget/RecyclerView;->m0:[I

    .line 19
    .line 20
    sput-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->n0:Z

    .line 21
    .line 22
    const/4 v1, 0x4

    .line 23
    new-array v1, v1, [Ljava/lang/Class;

    .line 24
    .line 25
    const-class v2, Landroid/content/Context;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    aput-object v2, v1, v3

    .line 29
    .line 30
    const-class v2, Landroid/util/AttributeSet;

    .line 31
    .line 32
    aput-object v2, v1, v0

    .line 33
    .line 34
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 35
    .line 36
    const/4 v2, 0x2

    .line 37
    aput-object v0, v1, v2

    .line 38
    .line 39
    const/4 v2, 0x3

    .line 40
    aput-object v0, v1, v2

    .line 41
    .line 42
    sput-object v1, Landroidx/recyclerview/widget/RecyclerView;->o0:[Ljava/lang/Class;

    .line 43
    .line 44
    new-instance v0, LN/r;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, Landroidx/recyclerview/widget/RecyclerView;->p0:LN/r;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 22

    .line 1
    move-object/from16 v10, p0

    .line 2
    .line 3
    move-object/from16 v11, p1

    .line 4
    .line 5
    move-object/from16 v12, p2

    .line 6
    .line 7
    const/16 v0, 0x8

    .line 8
    .line 9
    const/4 v13, 0x2

    .line 10
    const/4 v14, 0x0

    .line 11
    invoke-direct {v10, v11, v12, v14}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    .line 13
    .line 14
    new-instance v1, LN/D;

    .line 15
    .line 16
    invoke-direct {v1, v10}, LN/D;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->e:LN/D;

    .line 20
    .line 21
    new-instance v1, LH/a;

    .line 22
    .line 23
    invoke-direct {v1}, LH/a;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->i:LH/a;

    .line 27
    .line 28
    new-instance v1, Landroid/graphics/Rect;

    .line 29
    .line 30
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->k:Landroid/graphics/Rect;

    .line 34
    .line 35
    new-instance v1, Landroid/graphics/Rect;

    .line 36
    .line 37
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->l:Landroid/graphics/Rect;

    .line 41
    .line 42
    new-instance v1, Landroid/graphics/RectF;

    .line 43
    .line 44
    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    .line 45
    .line 46
    .line 47
    new-instance v1, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->n:Ljava/util/ArrayList;

    .line 53
    .line 54
    new-instance v1, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->o:Ljava/util/ArrayList;

    .line 60
    .line 61
    iput v14, v10, Landroidx/recyclerview/widget/RecyclerView;->t:I

    .line 62
    .line 63
    iput-boolean v14, v10, Landroidx/recyclerview/widget/RecyclerView;->y:Z

    .line 64
    .line 65
    iput-boolean v14, v10, Landroidx/recyclerview/widget/RecyclerView;->z:Z

    .line 66
    .line 67
    iput v14, v10, Landroidx/recyclerview/widget/RecyclerView;->A:I

    .line 68
    .line 69
    iput v14, v10, Landroidx/recyclerview/widget/RecyclerView;->B:I

    .line 70
    .line 71
    new-instance v1, LN/u;

    .line 72
    .line 73
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->C:LN/u;

    .line 77
    .line 78
    new-instance v1, LN/d;

    .line 79
    .line 80
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 81
    .line 82
    .line 83
    const/4 v15, 0x0

    .line 84
    iput-object v15, v1, LN/v;->a:LH/a;

    .line 85
    .line 86
    new-instance v2, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v2, v1, LN/v;->b:Ljava/util/ArrayList;

    .line 92
    .line 93
    const-wide/16 v2, 0xfa

    .line 94
    .line 95
    iput-wide v2, v1, LN/v;->c:J

    .line 96
    .line 97
    iput-wide v2, v1, LN/v;->d:J

    .line 98
    .line 99
    new-instance v2, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 102
    .line 103
    .line 104
    iput-object v2, v1, LN/d;->e:Ljava/util/ArrayList;

    .line 105
    .line 106
    new-instance v2, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 109
    .line 110
    .line 111
    iput-object v2, v1, LN/d;->f:Ljava/util/ArrayList;

    .line 112
    .line 113
    new-instance v2, Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 116
    .line 117
    .line 118
    iput-object v2, v1, LN/d;->g:Ljava/util/ArrayList;

    .line 119
    .line 120
    new-instance v2, Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 123
    .line 124
    .line 125
    iput-object v2, v1, LN/d;->h:Ljava/util/ArrayList;

    .line 126
    .line 127
    new-instance v2, Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 130
    .line 131
    .line 132
    iput-object v2, v1, LN/d;->i:Ljava/util/ArrayList;

    .line 133
    .line 134
    new-instance v2, Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 137
    .line 138
    .line 139
    iput-object v2, v1, LN/d;->j:Ljava/util/ArrayList;

    .line 140
    .line 141
    new-instance v2, Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 144
    .line 145
    .line 146
    iput-object v2, v1, LN/d;->k:Ljava/util/ArrayList;

    .line 147
    .line 148
    new-instance v2, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 151
    .line 152
    .line 153
    iput-object v2, v1, LN/d;->l:Ljava/util/ArrayList;

    .line 154
    .line 155
    new-instance v2, Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 158
    .line 159
    .line 160
    iput-object v2, v1, LN/d;->m:Ljava/util/ArrayList;

    .line 161
    .line 162
    new-instance v2, Ljava/util/ArrayList;

    .line 163
    .line 164
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 165
    .line 166
    .line 167
    iput-object v2, v1, LN/d;->n:Ljava/util/ArrayList;

    .line 168
    .line 169
    new-instance v2, Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 172
    .line 173
    .line 174
    iput-object v2, v1, LN/d;->o:Ljava/util/ArrayList;

    .line 175
    .line 176
    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->H:LN/v;

    .line 177
    .line 178
    iput v14, v10, Landroidx/recyclerview/widget/RecyclerView;->I:I

    .line 179
    .line 180
    const/4 v1, -0x1

    .line 181
    iput v1, v10, Landroidx/recyclerview/widget/RecyclerView;->J:I

    .line 182
    .line 183
    const/4 v2, 0x1

    .line 184
    iput v2, v10, Landroidx/recyclerview/widget/RecyclerView;->S:F

    .line 185
    .line 186
    iput v2, v10, Landroidx/recyclerview/widget/RecyclerView;->T:F

    .line 187
    .line 188
    const/4 v9, 0x1

    .line 189
    iput-boolean v9, v10, Landroidx/recyclerview/widget/RecyclerView;->U:Z

    .line 190
    .line 191
    new-instance v2, LN/I;

    .line 192
    .line 193
    invoke-direct {v2, v10}, LN/I;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 194
    .line 195
    .line 196
    iput-object v2, v10, Landroidx/recyclerview/widget/RecyclerView;->V:LN/I;

    .line 197
    .line 198
    sget-boolean v2, Landroidx/recyclerview/widget/RecyclerView;->n0:Z

    .line 199
    .line 200
    if-eqz v2, :cond_0

    .line 201
    .line 202
    new-instance v2, LN/j;

    .line 203
    .line 204
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 205
    .line 206
    .line 207
    goto :goto_0

    .line 208
    :cond_0
    move-object v2, v15

    .line 209
    :goto_0
    iput-object v2, v10, Landroidx/recyclerview/widget/RecyclerView;->a0:LN/j;

    .line 210
    .line 211
    new-instance v2, LN/G;

    .line 212
    .line 213
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 214
    .line 215
    .line 216
    iput v14, v2, LN/G;->a:I

    .line 217
    .line 218
    iput-boolean v14, v2, LN/G;->b:Z

    .line 219
    .line 220
    iput-boolean v14, v2, LN/G;->c:Z

    .line 221
    .line 222
    iput-boolean v14, v2, LN/G;->d:Z

    .line 223
    .line 224
    iput-boolean v14, v2, LN/G;->e:Z

    .line 225
    .line 226
    iput-object v2, v10, Landroidx/recyclerview/widget/RecyclerView;->b0:LN/G;

    .line 227
    .line 228
    new-instance v2, LH/a;

    .line 229
    .line 230
    const/16 v3, 0xa

    .line 231
    .line 232
    invoke-direct {v2, v3}, LH/a;-><init>(I)V

    .line 233
    .line 234
    .line 235
    iput-object v2, v10, Landroidx/recyclerview/widget/RecyclerView;->d0:LH/a;

    .line 236
    .line 237
    new-array v3, v13, [I

    .line 238
    .line 239
    iput-object v3, v10, Landroidx/recyclerview/widget/RecyclerView;->g0:[I

    .line 240
    .line 241
    new-array v3, v13, [I

    .line 242
    .line 243
    iput-object v3, v10, Landroidx/recyclerview/widget/RecyclerView;->h0:[I

    .line 244
    .line 245
    new-array v3, v13, [I

    .line 246
    .line 247
    iput-object v3, v10, Landroidx/recyclerview/widget/RecyclerView;->i0:[I

    .line 248
    .line 249
    new-instance v3, Ljava/util/ArrayList;

    .line 250
    .line 251
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 252
    .line 253
    .line 254
    iput-object v3, v10, Landroidx/recyclerview/widget/RecyclerView;->j0:Ljava/util/ArrayList;

    .line 255
    .line 256
    new-instance v3, LD/b;

    .line 257
    .line 258
    invoke-direct {v3, v13, v10}, LD/b;-><init>(ILjava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    iput-object v3, v10, Landroidx/recyclerview/widget/RecyclerView;->k0:LD/b;

    .line 262
    .line 263
    if-eqz v12, :cond_1

    .line 264
    .line 265
    sget-object v3, Landroidx/recyclerview/widget/RecyclerView;->m0:[I

    .line 266
    .line 267
    invoke-virtual {v11, v12, v3, v14, v14}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    invoke-virtual {v3, v14, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    iput-boolean v4, v10, Landroidx/recyclerview/widget/RecyclerView;->j:Z

    .line 276
    .line 277
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 278
    .line 279
    .line 280
    goto :goto_1

    .line 281
    :cond_1
    iput-boolean v9, v10, Landroidx/recyclerview/widget/RecyclerView;->j:Z

    .line 282
    .line 283
    :goto_1
    invoke-virtual {v10, v9}, Landroid/view/View;->setScrollContainer(Z)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v10, v9}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 287
    .line 288
    .line 289
    invoke-static/range {p1 .. p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    invoke-virtual {v3}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 294
    .line 295
    .line 296
    move-result v4

    .line 297
    iput v4, v10, Landroidx/recyclerview/widget/RecyclerView;->P:I

    .line 298
    .line 299
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 300
    .line 301
    const/16 v5, 0x1a

    .line 302
    .line 303
    if-lt v4, v5, :cond_2

    .line 304
    .line 305
    sget-object v6, Ly/B;->a:Ljava/lang/reflect/Method;

    .line 306
    .line 307
    invoke-static {v3}, Ly/y;->a(Landroid/view/ViewConfiguration;)F

    .line 308
    .line 309
    .line 310
    move-result v6

    .line 311
    goto :goto_2

    .line 312
    :cond_2
    invoke-static {v3, v11}, Ly/B;->a(Landroid/view/ViewConfiguration;Landroid/content/Context;)F

    .line 313
    .line 314
    .line 315
    move-result v6

    .line 316
    :goto_2
    iput v6, v10, Landroidx/recyclerview/widget/RecyclerView;->S:F

    .line 317
    .line 318
    if-lt v4, v5, :cond_3

    .line 319
    .line 320
    invoke-static {v3}, Ly/y;->b(Landroid/view/ViewConfiguration;)F

    .line 321
    .line 322
    .line 323
    move-result v6

    .line 324
    goto :goto_3

    .line 325
    :cond_3
    invoke-static {v3, v11}, Ly/B;->a(Landroid/view/ViewConfiguration;Landroid/content/Context;)F

    .line 326
    .line 327
    .line 328
    move-result v6

    .line 329
    :goto_3
    iput v6, v10, Landroidx/recyclerview/widget/RecyclerView;->T:F

    .line 330
    .line 331
    invoke-virtual {v3}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    .line 332
    .line 333
    .line 334
    move-result v6

    .line 335
    iput v6, v10, Landroidx/recyclerview/widget/RecyclerView;->Q:I

    .line 336
    .line 337
    invoke-virtual {v3}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    iput v3, v10, Landroidx/recyclerview/widget/RecyclerView;->R:I

    .line 342
    .line 343
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getOverScrollMode()I

    .line 344
    .line 345
    .line 346
    move-result v3

    .line 347
    if-ne v3, v13, :cond_4

    .line 348
    .line 349
    const/4 v3, 0x1

    .line 350
    goto :goto_4

    .line 351
    :cond_4
    const/4 v3, 0x0

    .line 352
    :goto_4
    invoke-virtual {v10, v3}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 353
    .line 354
    .line 355
    iget-object v3, v10, Landroidx/recyclerview/widget/RecyclerView;->H:LN/v;

    .line 356
    .line 357
    iput-object v2, v3, LN/v;->a:LH/a;

    .line 358
    .line 359
    new-instance v2, LN/b;

    .line 360
    .line 361
    new-instance v3, LH/a;

    .line 362
    .line 363
    const/16 v6, 0x9

    .line 364
    .line 365
    invoke-direct {v3, v6, v10}, LH/a;-><init>(ILjava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    invoke-direct {v2, v3}, LN/b;-><init>(LH/a;)V

    .line 369
    .line 370
    .line 371
    iput-object v2, v10, Landroidx/recyclerview/widget/RecyclerView;->g:LN/b;

    .line 372
    .line 373
    new-instance v2, LN/b;

    .line 374
    .line 375
    new-instance v3, LD/j;

    .line 376
    .line 377
    invoke-direct {v3, v0, v10}, LD/j;-><init>(ILjava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    invoke-direct {v2, v3}, LN/b;-><init>(LD/j;)V

    .line 381
    .line 382
    .line 383
    iput-object v2, v10, Landroidx/recyclerview/widget/RecyclerView;->h:LN/b;

    .line 384
    .line 385
    sget-object v2, Ly/x;->a:Ljava/lang/reflect/Field;

    .line 386
    .line 387
    if-lt v4, v5, :cond_5

    .line 388
    .line 389
    invoke-static/range {p0 .. p0}, Ly/r;->c(Landroid/view/View;)I

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    goto :goto_5

    .line 394
    :cond_5
    const/4 v2, 0x0

    .line 395
    :goto_5
    if-nez v2, :cond_6

    .line 396
    .line 397
    if-lt v4, v5, :cond_6

    .line 398
    .line 399
    invoke-static {v10, v0}, Ly/r;->m(Landroid/view/View;I)V

    .line 400
    .line 401
    .line 402
    :cond_6
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getImportantForAccessibility()I

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    if-nez v0, :cond_7

    .line 407
    .line 408
    invoke-virtual {v10, v9}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 409
    .line 410
    .line 411
    :cond_7
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    const-string v2, "accessibility"

    .line 416
    .line 417
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    .line 422
    .line 423
    iput-object v0, v10, Landroidx/recyclerview/widget/RecyclerView;->x:Landroid/view/accessibility/AccessibilityManager;

    .line 424
    .line 425
    new-instance v0, LN/K;

    .line 426
    .line 427
    invoke-direct {v0, v10}, LN/K;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v10, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAccessibilityDelegateCompat(LN/K;)V

    .line 431
    .line 432
    .line 433
    const/high16 v0, 0x40000

    .line 434
    .line 435
    if-eqz v12, :cond_f

    .line 436
    .line 437
    sget-object v2, LM/a;->a:[I

    .line 438
    .line 439
    invoke-virtual {v11, v12, v2, v14, v14}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 440
    .line 441
    .line 442
    move-result-object v8

    .line 443
    const/4 v2, 0x7

    .line 444
    invoke-virtual {v8, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v16

    .line 448
    invoke-virtual {v8, v9, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 449
    .line 450
    .line 451
    move-result v2

    .line 452
    if-ne v2, v1, :cond_8

    .line 453
    .line 454
    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 455
    .line 456
    .line 457
    :cond_8
    invoke-virtual {v8, v13, v14}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 458
    .line 459
    .line 460
    move-result v0

    .line 461
    const/4 v7, 0x4

    .line 462
    const/4 v6, 0x3

    .line 463
    if-eqz v0, :cond_a

    .line 464
    .line 465
    const/4 v0, 0x5

    .line 466
    invoke-virtual {v8, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    move-object v3, v0

    .line 471
    check-cast v3, Landroid/graphics/drawable/StateListDrawable;

    .line 472
    .line 473
    const/4 v0, 0x6

    .line 474
    invoke-virtual {v8, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 475
    .line 476
    .line 477
    move-result-object v4

    .line 478
    invoke-virtual {v8, v6}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    move-object v5, v0

    .line 483
    check-cast v5, Landroid/graphics/drawable/StateListDrawable;

    .line 484
    .line 485
    invoke-virtual {v8, v7}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    if-eqz v3, :cond_9

    .line 490
    .line 491
    if-eqz v4, :cond_9

    .line 492
    .line 493
    if-eqz v5, :cond_9

    .line 494
    .line 495
    if-eqz v0, :cond_9

    .line 496
    .line 497
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    new-instance v2, LN/h;

    .line 506
    .line 507
    const v6, 0x7f060057

    .line 508
    .line 509
    .line 510
    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 511
    .line 512
    .line 513
    move-result v18

    .line 514
    const v6, 0x7f060059

    .line 515
    .line 516
    .line 517
    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 518
    .line 519
    .line 520
    move-result v19

    .line 521
    const v6, 0x7f060058

    .line 522
    .line 523
    .line 524
    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 525
    .line 526
    .line 527
    move-result v20

    .line 528
    move-object v1, v2

    .line 529
    move-object/from16 v2, p0

    .line 530
    .line 531
    const/16 v17, 0x3

    .line 532
    .line 533
    move-object v6, v0

    .line 534
    const/4 v0, 0x4

    .line 535
    move/from16 v7, v18

    .line 536
    .line 537
    move-object/from16 v18, v8

    .line 538
    .line 539
    move/from16 v8, v19

    .line 540
    .line 541
    const/4 v15, 0x1

    .line 542
    move/from16 v9, v20

    .line 543
    .line 544
    invoke-direct/range {v1 .. v9}, LN/h;-><init>(Landroidx/recyclerview/widget/RecyclerView;Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;III)V

    .line 545
    .line 546
    .line 547
    goto :goto_6

    .line 548
    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 549
    .line 550
    new-instance v1, Ljava/lang/StringBuilder;

    .line 551
    .line 552
    const-string v2, "Trying to set fast scroller without both required drawables."

    .line 553
    .line 554
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->h()Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v2

    .line 561
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 562
    .line 563
    .line 564
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 569
    .line 570
    .line 571
    throw v0

    .line 572
    :cond_a
    move-object/from16 v18, v8

    .line 573
    .line 574
    const/4 v0, 0x4

    .line 575
    const/4 v15, 0x1

    .line 576
    const/16 v17, 0x3

    .line 577
    .line 578
    :goto_6
    invoke-virtual/range {v18 .. v18}, Landroid/content/res/TypedArray;->recycle()V

    .line 579
    .line 580
    .line 581
    const-string v1, ": Could not instantiate the LayoutManager: "

    .line 582
    .line 583
    if-eqz v16, :cond_e

    .line 584
    .line 585
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v2

    .line 589
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 590
    .line 591
    .line 592
    move-result v3

    .line 593
    if-nez v3, :cond_e

    .line 594
    .line 595
    invoke-virtual {v2, v14}, Ljava/lang/String;->charAt(I)C

    .line 596
    .line 597
    .line 598
    move-result v3

    .line 599
    const/16 v4, 0x2e

    .line 600
    .line 601
    if-ne v3, v4, :cond_b

    .line 602
    .line 603
    new-instance v3, Ljava/lang/StringBuilder;

    .line 604
    .line 605
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 606
    .line 607
    .line 608
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v4

    .line 612
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 616
    .line 617
    .line 618
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v2

    .line 622
    goto :goto_7

    .line 623
    :cond_b
    const-string v3, "."

    .line 624
    .line 625
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 626
    .line 627
    .line 628
    move-result v3

    .line 629
    if-eqz v3, :cond_c

    .line 630
    .line 631
    goto :goto_7

    .line 632
    :cond_c
    new-instance v3, Ljava/lang/StringBuilder;

    .line 633
    .line 634
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 635
    .line 636
    .line 637
    const-class v5, Landroidx/recyclerview/widget/RecyclerView;

    .line 638
    .line 639
    invoke-virtual {v5}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 640
    .line 641
    .line 642
    move-result-object v5

    .line 643
    invoke-virtual {v5}, Ljava/lang/Package;->getName()Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v5

    .line 647
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 648
    .line 649
    .line 650
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 651
    .line 652
    .line 653
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 657
    .line 658
    .line 659
    move-result-object v2

    .line 660
    :goto_7
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isInEditMode()Z

    .line 661
    .line 662
    .line 663
    move-result v3

    .line 664
    if-eqz v3, :cond_d

    .line 665
    .line 666
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 667
    .line 668
    .line 669
    move-result-object v3

    .line 670
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 671
    .line 672
    .line 673
    move-result-object v3

    .line 674
    goto :goto_8

    .line 675
    :catch_0
    move-exception v0

    .line 676
    goto/16 :goto_a

    .line 677
    .line 678
    :catch_1
    move-exception v0

    .line 679
    goto/16 :goto_b

    .line 680
    .line 681
    :catch_2
    move-exception v0

    .line 682
    goto/16 :goto_c

    .line 683
    .line 684
    :catch_3
    move-exception v0

    .line 685
    goto/16 :goto_d

    .line 686
    .line 687
    :catch_4
    move-exception v0

    .line 688
    goto/16 :goto_e

    .line 689
    .line 690
    :cond_d
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 691
    .line 692
    .line 693
    move-result-object v3

    .line 694
    :goto_8
    invoke-virtual {v3, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 695
    .line 696
    .line 697
    move-result-object v3

    .line 698
    const-class v4, LN/x;

    .line 699
    .line 700
    invoke-virtual {v3, v4}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 701
    .line 702
    .line 703
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 704
    :try_start_1
    sget-object v4, Landroidx/recyclerview/widget/RecyclerView;->o0:[Ljava/lang/Class;

    .line 705
    .line 706
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 707
    .line 708
    .line 709
    move-result-object v4

    .line 710
    new-array v0, v0, [Ljava/lang/Object;

    .line 711
    .line 712
    aput-object v11, v0, v14

    .line 713
    .line 714
    aput-object v12, v0, v15

    .line 715
    .line 716
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 717
    .line 718
    .line 719
    move-result-object v5

    .line 720
    aput-object v5, v0, v13

    .line 721
    .line 722
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 723
    .line 724
    .line 725
    move-result-object v5

    .line 726
    aput-object v5, v0, v17
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_0

    .line 727
    .line 728
    goto :goto_9

    .line 729
    :catch_5
    move-exception v0

    .line 730
    move-object v5, v0

    .line 731
    const/4 v4, 0x0

    .line 732
    :try_start_2
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 733
    .line 734
    .line 735
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_0

    .line 736
    move-object/from16 v21, v4

    .line 737
    .line 738
    move-object v4, v0

    .line 739
    move-object/from16 v0, v21

    .line 740
    .line 741
    :goto_9
    :try_start_3
    invoke-virtual {v4, v15}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 742
    .line 743
    .line 744
    invoke-virtual {v4, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    check-cast v0, LN/x;

    .line 749
    .line 750
    invoke-virtual {v10, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(LN/x;)V

    .line 751
    .line 752
    .line 753
    goto/16 :goto_f

    .line 754
    .line 755
    :catch_6
    move-exception v0

    .line 756
    move-object v3, v0

    .line 757
    invoke-virtual {v3, v5}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 758
    .line 759
    .line 760
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 761
    .line 762
    new-instance v4, Ljava/lang/StringBuilder;

    .line 763
    .line 764
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 765
    .line 766
    .line 767
    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    .line 768
    .line 769
    .line 770
    move-result-object v5

    .line 771
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 772
    .line 773
    .line 774
    const-string v5, ": Error creating LayoutManager "

    .line 775
    .line 776
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 777
    .line 778
    .line 779
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 780
    .line 781
    .line 782
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 783
    .line 784
    .line 785
    move-result-object v4

    .line 786
    invoke-direct {v0, v4, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 787
    .line 788
    .line 789
    throw v0
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_3 .. :try_end_3} :catch_0

    .line 790
    :goto_a
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 791
    .line 792
    new-instance v3, Ljava/lang/StringBuilder;

    .line 793
    .line 794
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 795
    .line 796
    .line 797
    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    .line 798
    .line 799
    .line 800
    move-result-object v4

    .line 801
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 802
    .line 803
    .line 804
    const-string v4, ": Class is not a LayoutManager "

    .line 805
    .line 806
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 807
    .line 808
    .line 809
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 810
    .line 811
    .line 812
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 813
    .line 814
    .line 815
    move-result-object v2

    .line 816
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 817
    .line 818
    .line 819
    throw v1

    .line 820
    :goto_b
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 821
    .line 822
    new-instance v3, Ljava/lang/StringBuilder;

    .line 823
    .line 824
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 825
    .line 826
    .line 827
    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    .line 828
    .line 829
    .line 830
    move-result-object v4

    .line 831
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 832
    .line 833
    .line 834
    const-string v4, ": Cannot access non-public constructor "

    .line 835
    .line 836
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 837
    .line 838
    .line 839
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 840
    .line 841
    .line 842
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 843
    .line 844
    .line 845
    move-result-object v2

    .line 846
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 847
    .line 848
    .line 849
    throw v1

    .line 850
    :goto_c
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 851
    .line 852
    new-instance v4, Ljava/lang/StringBuilder;

    .line 853
    .line 854
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 855
    .line 856
    .line 857
    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    .line 858
    .line 859
    .line 860
    move-result-object v5

    .line 861
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 862
    .line 863
    .line 864
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 865
    .line 866
    .line 867
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 868
    .line 869
    .line 870
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 871
    .line 872
    .line 873
    move-result-object v1

    .line 874
    invoke-direct {v3, v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 875
    .line 876
    .line 877
    throw v3

    .line 878
    :goto_d
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 879
    .line 880
    new-instance v4, Ljava/lang/StringBuilder;

    .line 881
    .line 882
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 883
    .line 884
    .line 885
    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    .line 886
    .line 887
    .line 888
    move-result-object v5

    .line 889
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 890
    .line 891
    .line 892
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 893
    .line 894
    .line 895
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 896
    .line 897
    .line 898
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 899
    .line 900
    .line 901
    move-result-object v1

    .line 902
    invoke-direct {v3, v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 903
    .line 904
    .line 905
    throw v3

    .line 906
    :goto_e
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 907
    .line 908
    new-instance v3, Ljava/lang/StringBuilder;

    .line 909
    .line 910
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 911
    .line 912
    .line 913
    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    .line 914
    .line 915
    .line 916
    move-result-object v4

    .line 917
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 918
    .line 919
    .line 920
    const-string v4, ": Unable to find LayoutManager "

    .line 921
    .line 922
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 923
    .line 924
    .line 925
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 926
    .line 927
    .line 928
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 929
    .line 930
    .line 931
    move-result-object v2

    .line 932
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 933
    .line 934
    .line 935
    throw v1

    .line 936
    :cond_e
    :goto_f
    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->l0:[I

    .line 937
    .line 938
    invoke-virtual {v11, v12, v0, v14, v14}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 939
    .line 940
    .line 941
    move-result-object v0

    .line 942
    invoke-virtual {v0, v14, v15}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 943
    .line 944
    .line 945
    move-result v9

    .line 946
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 947
    .line 948
    .line 949
    goto :goto_10

    .line 950
    :cond_f
    const/4 v15, 0x1

    .line 951
    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 952
    .line 953
    .line 954
    const/4 v9, 0x1

    .line 955
    :goto_10
    invoke-virtual {v10, v9}, Landroidx/recyclerview/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 956
    .line 957
    .line 958
    return-void
.end method

.method public static synthetic a(Landroidx/recyclerview/widget/RecyclerView;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->awakenScrollBars()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private getScrollingChildHelper()Ly/g;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:Ly/g;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ly/g;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Ly/g;-><init>(Landroid/view/ViewGroup;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:Ly/g;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:Ly/g;

    .line 13
    .line 14
    return-object v0
.end method

.method public static j(Landroid/view/View;)V
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, LN/y;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final addFocusables(Ljava/util/ArrayList;II)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addFocusables(Ljava/util/ArrayList;II)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->A:I

    .line 2
    .line 3
    if-lez v0, :cond_1

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v1, "Cannot call this method while RecyclerView is computing a layout or scrolling"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->h()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0

    .line 37
    :cond_1
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->B:I

    .line 38
    .line 39
    if-lez p1, :cond_2

    .line 40
    .line 41
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v1, ""

    .line 46
    .line 47
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->h()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v0, "RecyclerView"

    .line 65
    .line 66
    const-string v1, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame."

    .line 67
    .line 68
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 69
    .line 70
    .line 71
    :cond_2
    return-void
.end method

.method public final c(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Landroid/widget/EdgeEffect;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    if-lez p1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Landroid/widget/EdgeEffect;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Landroid/widget/EdgeEffect;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    :goto_0
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/widget/EdgeEffect;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    if-gez p1, :cond_1

    .line 37
    .line 38
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/widget/EdgeEffect;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/widget/EdgeEffect;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    or-int/2addr v0, p1

    .line 50
    :cond_1
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-nez p1, :cond_2

    .line 59
    .line 60
    if-lez p2, :cond_2

    .line 61
    .line 62
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    or-int/2addr v0, p1

    .line 74
    :cond_2
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Landroid/widget/EdgeEffect;

    .line 75
    .line 76
    if-eqz p1, :cond_3

    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_3

    .line 83
    .line 84
    if-gez p2, :cond_3

    .line 85
    .line 86
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Landroid/widget/EdgeEffect;

    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 89
    .line 90
    .line 91
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Landroid/widget/EdgeEffect;

    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    or-int/2addr v0, p1

    .line 98
    :cond_3
    if-eqz v0, :cond_4

    .line 99
    .line 100
    sget-object p1, Ly/x;->a:Ljava/lang/reflect/Field;

    .line 101
    .line 102
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 103
    .line 104
    .line 105
    :cond_4
    return-void
.end method

.method public final checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    .line 1
    instance-of v0, p1, LN/y;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 6
    .line 7
    check-cast p1, LN/y;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, LN/x;->d(LN/y;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    :goto_0
    return p1
.end method

.method public final computeHorizontalScrollExtent()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {v0}, LN/x;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:LN/G;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, LN/x;->f(LN/G;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    :cond_1
    return v1
.end method

.method public final computeHorizontalScrollOffset()I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {v0}, LN/x;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 14
    .line 15
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:LN/G;

    .line 16
    .line 17
    invoke-virtual {v0, v2}, LN/x;->g(LN/G;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    return v1
.end method

.method public final computeHorizontalScrollRange()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {v0}, LN/x;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:LN/G;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, LN/x;->h(LN/G;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    :cond_1
    return v1
.end method

.method public final computeVerticalScrollExtent()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {v0}, LN/x;->c()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:LN/G;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, LN/x;->i(LN/G;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    :cond_1
    return v1
.end method

.method public final computeVerticalScrollOffset()I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {v0}, LN/x;->c()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 14
    .line 15
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:LN/G;

    .line 16
    .line 17
    invoke-virtual {v0, v2}, LN/x;->j(LN/G;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    return v1
.end method

.method public final computeVerticalScrollRange()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {v0}, LN/x;->c()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:LN/G;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, LN/x;->k(LN/G;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    :cond_1
    return v1
.end method

.method public final d()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->g:LN/b;

    .line 2
    .line 3
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Z

    .line 4
    .line 5
    const-string v2, "No adapter attached; skipping layout"

    .line 6
    .line 7
    const-string v3, "RecyclerView"

    .line 8
    .line 9
    const-string v4, "RV FullInvalidate"

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->y:Z

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v1, v0, LN/b;->f:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-lez v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v0, v0, LN/b;->f:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-lez v0, :cond_1

    .line 40
    .line 41
    sget v0, Lu/b;->a:I

    .line 42
    .line 43
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v3, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-void

    .line 53
    :cond_2
    :goto_0
    sget v0, Lu/b;->a:I

    .line 54
    .line 55
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v3, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final dispatchNestedFling(FFZ)Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Ly/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2, p3}, Ly/g;->a(FFZ)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final dispatchNestedPreFling(FF)Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Ly/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, Ly/g;->b(FF)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final dispatchNestedPreScroll(II[I[I)Z
    .locals 6

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Ly/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v5, 0x0

    .line 6
    move v1, p1

    .line 7
    move v2, p2

    .line 8
    move-object v3, p3

    .line 9
    move-object v4, p4

    .line 10
    invoke-virtual/range {v0 .. v5}, Ly/g;->c(II[I[II)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method public final dispatchNestedScroll(IIII[I)Z
    .locals 8

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Ly/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v7, 0x0

    .line 7
    move v1, p1

    .line 8
    move v2, p2

    .line 9
    move v3, p3

    .line 10
    move v4, p4

    .line 11
    move-object v5, p5

    .line 12
    invoke-virtual/range {v0 .. v7}, Ly/g;->d(IIII[II[I)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method

.method public final dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->dispatchThawSelfOnly(Landroid/util/SparseArray;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final dispatchSaveInstanceState(Landroid/util/SparseArray;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->dispatchFreezeSelfOnly(Landroid/util/SparseArray;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 14

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->n:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    :goto_0
    const/4 v5, 0x0

    .line 14
    if-ge v4, v2, :cond_5

    .line 15
    .line 16
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    check-cast v6, LN/h;

    .line 21
    .line 22
    iget v7, v6, LN/h;->l:I

    .line 23
    .line 24
    iget-object v8, v6, LN/h;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 25
    .line 26
    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result v8

    .line 30
    if-ne v7, v8, :cond_3

    .line 31
    .line 32
    iget v7, v6, LN/h;->m:I

    .line 33
    .line 34
    iget-object v8, v6, LN/h;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 35
    .line 36
    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    if-eq v7, v8, :cond_0

    .line 41
    .line 42
    goto/16 :goto_2

    .line 43
    .line 44
    :cond_0
    iget v7, v6, LN/h;->v:I

    .line 45
    .line 46
    if-eqz v7, :cond_4

    .line 47
    .line 48
    iget-boolean v7, v6, LN/h;->o:Z

    .line 49
    .line 50
    if-eqz v7, :cond_2

    .line 51
    .line 52
    iget v7, v6, LN/h;->l:I

    .line 53
    .line 54
    iget v8, v6, LN/h;->d:I

    .line 55
    .line 56
    sub-int/2addr v7, v8

    .line 57
    div-int/lit8 v9, v3, 0x2

    .line 58
    .line 59
    rsub-int/lit8 v9, v9, 0x0

    .line 60
    .line 61
    iget-object v10, v6, LN/h;->b:Landroid/graphics/drawable/StateListDrawable;

    .line 62
    .line 63
    invoke-virtual {v10, v3, v3, v8, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 64
    .line 65
    .line 66
    iget v11, v6, LN/h;->m:I

    .line 67
    .line 68
    iget-object v12, v6, LN/h;->c:Landroid/graphics/drawable/Drawable;

    .line 69
    .line 70
    iget v13, v6, LN/h;->e:I

    .line 71
    .line 72
    invoke-virtual {v12, v3, v3, v13, v11}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 73
    .line 74
    .line 75
    iget-object v11, v6, LN/h;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 76
    .line 77
    sget-object v13, Ly/x;->a:Ljava/lang/reflect/Field;

    .line 78
    .line 79
    invoke-virtual {v11}, Landroid/view/View;->getLayoutDirection()I

    .line 80
    .line 81
    .line 82
    move-result v11

    .line 83
    if-ne v11, v0, :cond_1

    .line 84
    .line 85
    invoke-virtual {v12, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 86
    .line 87
    .line 88
    int-to-float v7, v8

    .line 89
    int-to-float v11, v9

    .line 90
    invoke-virtual {p1, v7, v11}, Landroid/graphics/Canvas;->translate(FF)V

    .line 91
    .line 92
    .line 93
    const/high16 v7, -0x40800000    # -1.0f

    .line 94
    .line 95
    const/high16 v11, 0x3f800000    # 1.0f

    .line 96
    .line 97
    invoke-virtual {p1, v7, v11}, Landroid/graphics/Canvas;->scale(FF)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v10, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v11, v11}, Landroid/graphics/Canvas;->scale(FF)V

    .line 104
    .line 105
    .line 106
    neg-int v7, v8

    .line 107
    int-to-float v7, v7

    .line 108
    neg-int v8, v9

    .line 109
    int-to-float v8, v8

    .line 110
    invoke-virtual {p1, v7, v8}, Landroid/graphics/Canvas;->translate(FF)V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_1
    int-to-float v8, v7

    .line 115
    invoke-virtual {p1, v8, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v12, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 119
    .line 120
    .line 121
    int-to-float v8, v9

    .line 122
    invoke-virtual {p1, v5, v8}, Landroid/graphics/Canvas;->translate(FF)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v10, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 126
    .line 127
    .line 128
    neg-int v7, v7

    .line 129
    int-to-float v7, v7

    .line 130
    neg-int v8, v9

    .line 131
    int-to-float v8, v8

    .line 132
    invoke-virtual {p1, v7, v8}, Landroid/graphics/Canvas;->translate(FF)V

    .line 133
    .line 134
    .line 135
    :cond_2
    :goto_1
    iget-boolean v7, v6, LN/h;->p:Z

    .line 136
    .line 137
    if-eqz v7, :cond_4

    .line 138
    .line 139
    iget v7, v6, LN/h;->m:I

    .line 140
    .line 141
    iget v8, v6, LN/h;->h:I

    .line 142
    .line 143
    sub-int/2addr v7, v8

    .line 144
    div-int/lit8 v9, v3, 0x2

    .line 145
    .line 146
    rsub-int/lit8 v9, v9, 0x0

    .line 147
    .line 148
    iget-object v10, v6, LN/h;->f:Landroid/graphics/drawable/StateListDrawable;

    .line 149
    .line 150
    invoke-virtual {v10, v3, v3, v3, v8}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 151
    .line 152
    .line 153
    iget v8, v6, LN/h;->l:I

    .line 154
    .line 155
    iget-object v11, v6, LN/h;->g:Landroid/graphics/drawable/Drawable;

    .line 156
    .line 157
    iget v6, v6, LN/h;->i:I

    .line 158
    .line 159
    invoke-virtual {v11, v3, v3, v8, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 160
    .line 161
    .line 162
    int-to-float v6, v7

    .line 163
    invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v11, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 167
    .line 168
    .line 169
    int-to-float v6, v9

    .line 170
    invoke-virtual {p1, v6, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v10, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 174
    .line 175
    .line 176
    neg-int v5, v9

    .line 177
    int-to-float v5, v5

    .line 178
    neg-int v6, v7

    .line 179
    int-to-float v6, v6

    .line 180
    invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 181
    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_3
    :goto_2
    iget-object v5, v6, LN/h;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 185
    .line 186
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 187
    .line 188
    .line 189
    move-result v5

    .line 190
    iput v5, v6, LN/h;->l:I

    .line 191
    .line 192
    iget-object v5, v6, LN/h;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 193
    .line 194
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    iput v5, v6, LN/h;->m:I

    .line 199
    .line 200
    invoke-virtual {v6, v3}, LN/h;->e(I)V

    .line 201
    .line 202
    .line 203
    :cond_4
    :goto_3
    add-int/2addr v4, v0

    .line 204
    goto/16 :goto_0

    .line 205
    .line 206
    :cond_5
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Landroid/widget/EdgeEffect;

    .line 207
    .line 208
    if-eqz v2, :cond_8

    .line 209
    .line 210
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    if-nez v2, :cond_8

    .line 215
    .line 216
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    iget-boolean v4, p0, Landroidx/recyclerview/widget/RecyclerView;->j:Z

    .line 221
    .line 222
    if-eqz v4, :cond_6

    .line 223
    .line 224
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 225
    .line 226
    .line 227
    move-result v4

    .line 228
    goto :goto_4

    .line 229
    :cond_6
    const/4 v4, 0x0

    .line 230
    :goto_4
    const/high16 v6, 0x43870000    # 270.0f

    .line 231
    .line 232
    invoke-virtual {p1, v6}, Landroid/graphics/Canvas;->rotate(F)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 236
    .line 237
    .line 238
    move-result v6

    .line 239
    neg-int v6, v6

    .line 240
    add-int/2addr v6, v4

    .line 241
    int-to-float v4, v6

    .line 242
    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 243
    .line 244
    .line 245
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Landroid/widget/EdgeEffect;

    .line 246
    .line 247
    if-eqz v4, :cond_7

    .line 248
    .line 249
    invoke-virtual {v4, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 250
    .line 251
    .line 252
    move-result v4

    .line 253
    if-eqz v4, :cond_7

    .line 254
    .line 255
    const/4 v4, 0x1

    .line 256
    goto :goto_5

    .line 257
    :cond_7
    const/4 v4, 0x0

    .line 258
    :goto_5
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 259
    .line 260
    .line 261
    goto :goto_6

    .line 262
    :cond_8
    const/4 v4, 0x0

    .line 263
    :goto_6
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    .line 264
    .line 265
    if-eqz v2, :cond_b

    .line 266
    .line 267
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    if-nez v2, :cond_b

    .line 272
    .line 273
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    iget-boolean v5, p0, Landroidx/recyclerview/widget/RecyclerView;->j:Z

    .line 278
    .line 279
    if-eqz v5, :cond_9

    .line 280
    .line 281
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 282
    .line 283
    .line 284
    move-result v5

    .line 285
    int-to-float v5, v5

    .line 286
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 287
    .line 288
    .line 289
    move-result v6

    .line 290
    int-to-float v6, v6

    .line 291
    invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 292
    .line 293
    .line 294
    :cond_9
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    .line 295
    .line 296
    if-eqz v5, :cond_a

    .line 297
    .line 298
    invoke-virtual {v5, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 299
    .line 300
    .line 301
    move-result v5

    .line 302
    if-eqz v5, :cond_a

    .line 303
    .line 304
    const/4 v5, 0x1

    .line 305
    goto :goto_7

    .line 306
    :cond_a
    const/4 v5, 0x0

    .line 307
    :goto_7
    or-int/2addr v4, v5

    .line 308
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 309
    .line 310
    .line 311
    :cond_b
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/widget/EdgeEffect;

    .line 312
    .line 313
    if-eqz v2, :cond_e

    .line 314
    .line 315
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    if-nez v2, :cond_e

    .line 320
    .line 321
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 322
    .line 323
    .line 324
    move-result v2

    .line 325
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 326
    .line 327
    .line 328
    move-result v5

    .line 329
    iget-boolean v6, p0, Landroidx/recyclerview/widget/RecyclerView;->j:Z

    .line 330
    .line 331
    if-eqz v6, :cond_c

    .line 332
    .line 333
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 334
    .line 335
    .line 336
    move-result v6

    .line 337
    goto :goto_8

    .line 338
    :cond_c
    const/4 v6, 0x0

    .line 339
    :goto_8
    const/high16 v7, 0x42b40000    # 90.0f

    .line 340
    .line 341
    invoke-virtual {p1, v7}, Landroid/graphics/Canvas;->rotate(F)V

    .line 342
    .line 343
    .line 344
    neg-int v6, v6

    .line 345
    int-to-float v6, v6

    .line 346
    neg-int v5, v5

    .line 347
    int-to-float v5, v5

    .line 348
    invoke-virtual {p1, v6, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 349
    .line 350
    .line 351
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/widget/EdgeEffect;

    .line 352
    .line 353
    if-eqz v5, :cond_d

    .line 354
    .line 355
    invoke-virtual {v5, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 356
    .line 357
    .line 358
    move-result v5

    .line 359
    if-eqz v5, :cond_d

    .line 360
    .line 361
    const/4 v5, 0x1

    .line 362
    goto :goto_9

    .line 363
    :cond_d
    const/4 v5, 0x0

    .line 364
    :goto_9
    or-int/2addr v4, v5

    .line 365
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 366
    .line 367
    .line 368
    :cond_e
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Landroid/widget/EdgeEffect;

    .line 369
    .line 370
    if-eqz v2, :cond_11

    .line 371
    .line 372
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 373
    .line 374
    .line 375
    move-result v2

    .line 376
    if-nez v2, :cond_11

    .line 377
    .line 378
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 379
    .line 380
    .line 381
    move-result v2

    .line 382
    const/high16 v5, 0x43340000    # 180.0f

    .line 383
    .line 384
    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->rotate(F)V

    .line 385
    .line 386
    .line 387
    iget-boolean v5, p0, Landroidx/recyclerview/widget/RecyclerView;->j:Z

    .line 388
    .line 389
    if-eqz v5, :cond_f

    .line 390
    .line 391
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 392
    .line 393
    .line 394
    move-result v5

    .line 395
    neg-int v5, v5

    .line 396
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 397
    .line 398
    .line 399
    move-result v6

    .line 400
    add-int/2addr v6, v5

    .line 401
    int-to-float v5, v6

    .line 402
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 403
    .line 404
    .line 405
    move-result v6

    .line 406
    neg-int v6, v6

    .line 407
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 408
    .line 409
    .line 410
    move-result v7

    .line 411
    add-int/2addr v7, v6

    .line 412
    int-to-float v6, v7

    .line 413
    invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 414
    .line 415
    .line 416
    goto :goto_a

    .line 417
    :cond_f
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 418
    .line 419
    .line 420
    move-result v5

    .line 421
    neg-int v5, v5

    .line 422
    int-to-float v5, v5

    .line 423
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 424
    .line 425
    .line 426
    move-result v6

    .line 427
    neg-int v6, v6

    .line 428
    int-to-float v6, v6

    .line 429
    invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 430
    .line 431
    .line 432
    :goto_a
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Landroid/widget/EdgeEffect;

    .line 433
    .line 434
    if-eqz v5, :cond_10

    .line 435
    .line 436
    invoke-virtual {v5, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 437
    .line 438
    .line 439
    move-result v5

    .line 440
    if-eqz v5, :cond_10

    .line 441
    .line 442
    const/4 v3, 0x1

    .line 443
    :cond_10
    or-int/2addr v4, v3

    .line 444
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 445
    .line 446
    .line 447
    :cond_11
    if-nez v4, :cond_12

    .line 448
    .line 449
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->H:LN/v;

    .line 450
    .line 451
    if-eqz p1, :cond_12

    .line 452
    .line 453
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 454
    .line 455
    .line 456
    move-result p1

    .line 457
    if-lez p1, :cond_12

    .line 458
    .line 459
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->H:LN/v;

    .line 460
    .line 461
    invoke-virtual {p1}, LN/v;->b()Z

    .line 462
    .line 463
    .line 464
    move-result p1

    .line 465
    if-eqz p1, :cond_12

    .line 466
    .line 467
    goto :goto_b

    .line 468
    :cond_12
    move v0, v4

    .line 469
    :goto_b
    if-eqz v0, :cond_13

    .line 470
    .line 471
    sget-object p1, Ly/x;->a:Ljava/lang/reflect/Field;

    .line 472
    .line 473
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 474
    .line 475
    .line 476
    :cond_13
    return-void
.end method

.method public final drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final e(II)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v1, v0

    .line 10
    sget-object v0, Ly/x;->a:Ljava/lang/reflect/Field;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getMinimumWidth()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-static {p1, v1, v0}, LN/x;->e(III)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    add-int/2addr v1, v0

    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getMinimumHeight()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {p2, v1, v0}, LN/x;->e(III)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final f(II[I[II)Z
    .locals 6

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Ly/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    move v1, p1

    .line 6
    move v2, p2

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move v5, p5

    .line 10
    invoke-virtual/range {v0 .. v5}, Ly/g;->c(II[I[II)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method public final focusSearch(Landroid/view/View;I)Landroid/view/View;
    .locals 12

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p0, p1, p2}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->hasFocusable()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :cond_0
    const/4 p2, 0x0

    .line 34
    invoke-virtual {p0, v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->o(Landroid/view/View;Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_1
    if-eqz v0, :cond_15

    .line 39
    .line 40
    if-ne v0, p0, :cond_2

    .line 41
    .line 42
    goto/16 :goto_3

    .line 43
    .line 44
    :cond_2
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->i(Landroid/view/View;)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    if-nez v1, :cond_3

    .line 49
    .line 50
    goto/16 :goto_3

    .line 51
    .line 52
    :cond_3
    if-nez p1, :cond_4

    .line 53
    .line 54
    goto/16 :goto_4

    .line 55
    .line 56
    :cond_4
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->i(Landroid/view/View;)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    if-nez v1, :cond_5

    .line 61
    .line 62
    goto/16 :goto_4

    .line 63
    .line 64
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->k:Landroid/graphics/Rect;

    .line 73
    .line 74
    const/4 v4, 0x0

    .line 75
    invoke-virtual {v3, v4, v4, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->l:Landroid/graphics/Rect;

    .line 87
    .line 88
    invoke-virtual {v5, v4, v4, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, p1, v3}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v0, v5}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 95
    .line 96
    .line 97
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 98
    .line 99
    iget-object v1, v1, LN/x;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 100
    .line 101
    sget-object v2, Ly/x;->a:Ljava/lang/reflect/Field;

    .line 102
    .line 103
    invoke-virtual {v1}, Landroid/view/View;->getLayoutDirection()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    const/4 v2, 0x1

    .line 108
    const/4 v6, -0x1

    .line 109
    if-ne v1, v2, :cond_6

    .line 110
    .line 111
    const/4 v1, -0x1

    .line 112
    goto :goto_0

    .line 113
    :cond_6
    const/4 v1, 0x1

    .line 114
    :goto_0
    iget v7, v3, Landroid/graphics/Rect;->left:I

    .line 115
    .line 116
    iget v8, v5, Landroid/graphics/Rect;->left:I

    .line 117
    .line 118
    if-lt v7, v8, :cond_7

    .line 119
    .line 120
    iget v9, v3, Landroid/graphics/Rect;->right:I

    .line 121
    .line 122
    if-gt v9, v8, :cond_8

    .line 123
    .line 124
    :cond_7
    iget v9, v3, Landroid/graphics/Rect;->right:I

    .line 125
    .line 126
    iget v10, v5, Landroid/graphics/Rect;->right:I

    .line 127
    .line 128
    if-ge v9, v10, :cond_8

    .line 129
    .line 130
    const/4 v7, 0x1

    .line 131
    goto :goto_1

    .line 132
    :cond_8
    iget v9, v3, Landroid/graphics/Rect;->right:I

    .line 133
    .line 134
    iget v10, v5, Landroid/graphics/Rect;->right:I

    .line 135
    .line 136
    if-gt v9, v10, :cond_9

    .line 137
    .line 138
    if-lt v7, v10, :cond_a

    .line 139
    .line 140
    :cond_9
    if-le v7, v8, :cond_a

    .line 141
    .line 142
    const/4 v7, -0x1

    .line 143
    goto :goto_1

    .line 144
    :cond_a
    const/4 v7, 0x0

    .line 145
    :goto_1
    iget v8, v3, Landroid/graphics/Rect;->top:I

    .line 146
    .line 147
    iget v9, v5, Landroid/graphics/Rect;->top:I

    .line 148
    .line 149
    if-lt v8, v9, :cond_b

    .line 150
    .line 151
    iget v10, v3, Landroid/graphics/Rect;->bottom:I

    .line 152
    .line 153
    if-gt v10, v9, :cond_c

    .line 154
    .line 155
    :cond_b
    iget v10, v3, Landroid/graphics/Rect;->bottom:I

    .line 156
    .line 157
    iget v11, v5, Landroid/graphics/Rect;->bottom:I

    .line 158
    .line 159
    if-ge v10, v11, :cond_c

    .line 160
    .line 161
    const/4 v4, 0x1

    .line 162
    goto :goto_2

    .line 163
    :cond_c
    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    .line 164
    .line 165
    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    .line 166
    .line 167
    if-gt v3, v5, :cond_d

    .line 168
    .line 169
    if-lt v8, v5, :cond_e

    .line 170
    .line 171
    :cond_d
    if-le v8, v9, :cond_e

    .line 172
    .line 173
    const/4 v4, -0x1

    .line 174
    :cond_e
    :goto_2
    if-eq p2, v2, :cond_14

    .line 175
    .line 176
    const/4 v2, 0x2

    .line 177
    if-eq p2, v2, :cond_13

    .line 178
    .line 179
    const/16 v1, 0x11

    .line 180
    .line 181
    if-eq p2, v1, :cond_12

    .line 182
    .line 183
    const/16 v1, 0x21

    .line 184
    .line 185
    if-eq p2, v1, :cond_11

    .line 186
    .line 187
    const/16 v1, 0x42

    .line 188
    .line 189
    if-eq p2, v1, :cond_10

    .line 190
    .line 191
    const/16 v1, 0x82

    .line 192
    .line 193
    if-ne p2, v1, :cond_f

    .line 194
    .line 195
    if-lez v4, :cond_15

    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_f
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 199
    .line 200
    new-instance v0, Ljava/lang/StringBuilder;

    .line 201
    .line 202
    const-string v1, "Invalid direction: "

    .line 203
    .line 204
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->h()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object p2

    .line 221
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw p1

    .line 225
    :cond_10
    if-lez v7, :cond_15

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_11
    if-gez v4, :cond_15

    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_12
    if-gez v7, :cond_15

    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_13
    if-gtz v4, :cond_16

    .line 235
    .line 236
    if-nez v4, :cond_15

    .line 237
    .line 238
    mul-int v7, v7, v1

    .line 239
    .line 240
    if-ltz v7, :cond_15

    .line 241
    .line 242
    goto :goto_4

    .line 243
    :cond_14
    if-ltz v4, :cond_16

    .line 244
    .line 245
    if-nez v4, :cond_15

    .line 246
    .line 247
    mul-int v7, v7, v1

    .line 248
    .line 249
    if-gtz v7, :cond_15

    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_15
    :goto_3
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    :cond_16
    :goto_4
    return-object v0
.end method

.method public final g([II)Z
    .locals 8

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Ly/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v7, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    move-object v5, p1

    .line 11
    move v6, p2

    .line 12
    invoke-virtual/range {v0 .. v7}, Ly/g;->d(IIII[II[I)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method

.method public final generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, LN/x;->l()LN/y;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, "RecyclerView has no LayoutManager"

    .line 15
    .line 16
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->h()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, LN/x;->m(Landroid/content/Context;Landroid/util/AttributeSet;)LN/y;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RecyclerView has no LayoutManager"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 4
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0, p1}, LN/x;->n(Landroid/view/ViewGroup$LayoutParams;)LN/y;

    move-result-object p1

    return-object p1

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RecyclerView has no LayoutManager"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getAdapter()LN/s;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public getBaseline()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    return v0

    .line 10
    :cond_0
    invoke-super {p0}, Landroid/view/ViewGroup;->getBaseline()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0
.end method

.method public final getChildDrawingOrder(II)I
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->getChildDrawingOrder(II)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public getClipToPadding()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->j:Z

    .line 2
    .line 3
    return v0
.end method

.method public getCompatAccessibilityDelegate()LN/K;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:LN/K;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEdgeEffectFactory()LN/u;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->C:LN/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public getItemAnimator()LN/v;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->H:LN/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public getItemDecorationCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->n:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getLayoutManager()LN/x;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMaxFlingVelocity()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->R:I

    .line 2
    .line 3
    return v0
.end method

.method public getMinFlingVelocity()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Q:I

    .line 2
    .line 3
    return v0
.end method

.method public getNanoTime()J
    .locals 2

    .line 1
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->n0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    :cond_0
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    return-wide v0
.end method

.method public getOnFlingListener()LN/z;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public getPreserveFocusAfterLayout()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->U:Z

    .line 2
    .line 3
    return v0
.end method

.method public getRecycledViewPool()LN/C;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e:LN/D;

    .line 2
    .line 3
    iget-object v1, v0, LN/D;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, LN/C;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    new-instance v1, LN/C;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v2, Landroid/util/SparseArray;

    .line 15
    .line 16
    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v2, v1, LN/C;->a:Landroid/util/SparseArray;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    iput v2, v1, LN/C;->b:I

    .line 23
    .line 24
    iput-object v1, v0, LN/D;->e:Ljava/lang/Object;

    .line 25
    .line 26
    :cond_0
    iget-object v0, v0, LN/D;->e:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, LN/C;

    .line 29
    .line 30
    return-object v0
.end method

.method public getScrollState()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->I:I

    .line 2
    .line 3
    return v0
.end method

.method public final h()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, " "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Landroid/view/ViewGroup;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ", adapter:null, layout:"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, ", context:"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0
.end method

.method public final hasNestedScrollingParent()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Ly/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Ly/g;->f(I)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
.end method

.method public final i(Landroid/view/View;)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_0

    .line 6
    .line 7
    if-eq v0, p0, :cond_0

    .line 8
    .line 9
    instance-of v1, v0, Landroid/view/View;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    move-object p1, v0

    .line 14
    check-cast p1, Landroid/view/View;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    if-ne v0, p0, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/4 p1, 0x0

    .line 25
    :goto_1
    return-object p1
.end method

.method public final isAttachedToWindow()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->q:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isNestedScrollingEnabled()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Ly/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Ly/g;->d:Z

    .line 6
    .line 7
    return v0
.end method

.method public final k()Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Ly/g;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {v1, v0}, Ly/g;->f(I)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
.end method

.method public final l()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->y:Z

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->g:LN/b;

    .line 10
    .line 11
    iget-object v0, v0, LN/b;->f:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-lez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 25
    :goto_1
    return v0
.end method

.method public final m()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->h:LN/b;

    .line 2
    .line 3
    invoke-virtual {v0}, LN/b;->B()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v0, :cond_0

    .line 10
    .line 11
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->h:LN/b;

    .line 12
    .line 13
    invoke-virtual {v3, v2}, LN/b;->A(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, LN/y;

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    iput-boolean v4, v3, LN/y;->b:Z

    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e:LN/D;

    .line 30
    .line 31
    iget-object v0, v0, LN/D;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-gtz v2, :cond_1

    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    new-instance v0, Ljava/lang/ClassCastException;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw v0
.end method

.method public final n(Landroid/view/MotionEvent;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView;->J:I

    .line 10
    .line 11
    if-ne v1, v2, :cond_1

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->J:I

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/high16 v2, 0x3f000000    # 0.5f

    .line 29
    .line 30
    add-float/2addr v1, v2

    .line 31
    float-to-int v1, v1

    .line 32
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->N:I

    .line 33
    .line 34
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->L:I

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    add-float/2addr p1, v2

    .line 41
    float-to-int p1, p1

    .line 42
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->O:I

    .line 43
    .line 44
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->M:I

    .line 45
    .line 46
    :cond_1
    return-void
.end method

.method public final o(Landroid/view/View;Landroid/view/View;)V
    .locals 11

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    move-object v0, p2

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    move-object v0, p1

    .line 6
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->k:Landroid/graphics/Rect;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-virtual {v3, v4, v4, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    instance-of v1, v0, LN/y;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    check-cast v0, LN/y;

    .line 29
    .line 30
    iget-boolean v1, v0, LN/y;->b:Z

    .line 31
    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    iget v1, v3, Landroid/graphics/Rect;->left:I

    .line 35
    .line 36
    iget-object v0, v0, LN/y;->a:Landroid/graphics/Rect;

    .line 37
    .line 38
    iget v2, v0, Landroid/graphics/Rect;->left:I

    .line 39
    .line 40
    sub-int/2addr v1, v2

    .line 41
    iput v1, v3, Landroid/graphics/Rect;->left:I

    .line 42
    .line 43
    iget v1, v3, Landroid/graphics/Rect;->right:I

    .line 44
    .line 45
    iget v2, v0, Landroid/graphics/Rect;->right:I

    .line 46
    .line 47
    add-int/2addr v1, v2

    .line 48
    iput v1, v3, Landroid/graphics/Rect;->right:I

    .line 49
    .line 50
    iget v1, v3, Landroid/graphics/Rect;->top:I

    .line 51
    .line 52
    iget v2, v0, Landroid/graphics/Rect;->top:I

    .line 53
    .line 54
    sub-int/2addr v1, v2

    .line 55
    iput v1, v3, Landroid/graphics/Rect;->top:I

    .line 56
    .line 57
    iget v1, v3, Landroid/graphics/Rect;->bottom:I

    .line 58
    .line 59
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 60
    .line 61
    add-int/2addr v1, v0

    .line 62
    iput v1, v3, Landroid/graphics/Rect;->bottom:I

    .line 63
    .line 64
    :cond_1
    if-eqz p2, :cond_2

    .line 65
    .line 66
    invoke-virtual {p0, p2, v3}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p1, v3}, Landroid/view/ViewGroup;->offsetRectIntoDescendantCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 73
    .line 74
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Z

    .line 75
    .line 76
    const/4 v1, 0x1

    .line 77
    xor-int/lit8 v9, v0, 0x1

    .line 78
    .line 79
    if-nez p2, :cond_3

    .line 80
    .line 81
    const/4 v10, 0x1

    .line 82
    goto :goto_1

    .line 83
    :cond_3
    const/4 v10, 0x0

    .line 84
    :goto_1
    iget-object v8, p0, Landroidx/recyclerview/widget/RecyclerView;->k:Landroid/graphics/Rect;

    .line 85
    .line 86
    move-object v6, p0

    .line 87
    move-object v7, p1

    .line 88
    invoke-virtual/range {v5 .. v10}, LN/x;->G(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->A:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->q:Z

    .line 9
    .line 10
    iget-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Z

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    :cond_0
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Z

    .line 22
    .line 23
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iput-boolean v1, v0, LN/x;->e:Z

    .line 28
    .line 29
    :cond_1
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->n0:Z

    .line 30
    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    sget-object v0, LN/l;->i:Ljava/lang/ThreadLocal;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, LN/l;

    .line 40
    .line 41
    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->W:LN/l;

    .line 42
    .line 43
    if-nez v1, :cond_3

    .line 44
    .line 45
    new-instance v1, LN/l;

    .line 46
    .line 47
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    new-instance v2, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v2, v1, LN/l;->e:Ljava/util/ArrayList;

    .line 56
    .line 57
    new-instance v2, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v2, v1, LN/l;->h:Ljava/util/ArrayList;

    .line 63
    .line 64
    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->W:LN/l;

    .line 65
    .line 66
    sget-object v1, Ly/x;->a:Ljava/lang/reflect/Field;

    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-nez v2, :cond_2

    .line 77
    .line 78
    if-eqz v1, :cond_2

    .line 79
    .line 80
    invoke-virtual {v1}, Landroid/view/Display;->getRefreshRate()F

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    const/high16 v2, 0x41f00000    # 30.0f

    .line 85
    .line 86
    cmpl-float v2, v1, v2

    .line 87
    .line 88
    if-ltz v2, :cond_2

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_2
    const/high16 v1, 0x42700000    # 60.0f

    .line 92
    .line 93
    :goto_0
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->W:LN/l;

    .line 94
    .line 95
    const v3, 0x4e6e6b28    # 1.0E9f

    .line 96
    .line 97
    .line 98
    div-float/2addr v3, v1

    .line 99
    float-to-long v3, v3

    .line 100
    iput-wide v3, v2, LN/l;->g:J

    .line 101
    .line 102
    invoke-virtual {v0, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :cond_3
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->W:LN/l;

    .line 106
    .line 107
    iget-object v0, v0, LN/l;->e:Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    :cond_4
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 6

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->H:LN/v;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, LN/v;->a()V

    .line 9
    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->V:LN/I;

    .line 16
    .line 17
    iget-object v2, v1, LN/I;->k:Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    invoke-virtual {v2, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    iget-object v1, v1, LN/I;->g:Landroid/widget/OverScroller;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 25
    .line 26
    .line 27
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->q:Z

    .line 28
    .line 29
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    iput-boolean v0, v1, LN/x;->e:Z

    .line 34
    .line 35
    invoke-virtual {v1, p0}, LN/x;->z(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->j0:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->k0:LD/b;

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->i:LH/a;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    :goto_0
    sget-object v0, LN/S;->a:Lg0/F;

    .line 54
    .line 55
    iget v1, v0, Lg0/F;->a:I

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    if-lez v1, :cond_2

    .line 59
    .line 60
    add-int/lit8 v1, v1, -0x1

    .line 61
    .line 62
    iget-object v3, v0, Lg0/F;->b:[Ljava/lang/Object;

    .line 63
    .line 64
    aget-object v4, v3, v1

    .line 65
    .line 66
    const-string v5, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool"

    .line 67
    .line 68
    invoke-static {v4, v5}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    aput-object v2, v3, v1

    .line 72
    .line 73
    iget v1, v0, Lg0/F;->a:I

    .line 74
    .line 75
    add-int/lit8 v1, v1, -0x1

    .line 76
    .line 77
    iput v1, v0, Lg0/F;->a:I

    .line 78
    .line 79
    move-object v2, v4

    .line 80
    :cond_2
    if-eqz v2, :cond_3

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->n0:Z

    .line 84
    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->W:LN/l;

    .line 88
    .line 89
    if-eqz v0, :cond_4

    .line 90
    .line 91
    iget-object v0, v0, LN/l;->e:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    const/4 v0, 0x0

    .line 97
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->W:LN/l;

    .line 98
    .line 99
    :cond_4
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->n:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-ge v1, v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, LN/h;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public final onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->u:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    return v1

    .line 12
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/16 v2, 0x8

    .line 17
    .line 18
    if-ne v0, v2, :cond_8

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    and-int/lit8 v0, v0, 0x2

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    if-eqz v0, :cond_4

    .line 28
    .line 29
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 30
    .line 31
    invoke-virtual {v0}, LN/x;->c()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    const/16 v0, 0x9

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    neg-float v0, v0

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const/4 v0, 0x0

    .line 46
    :goto_0
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 47
    .line 48
    invoke-virtual {v3}, LN/x;->b()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_3

    .line 53
    .line 54
    const/16 v3, 0xa

    .line 55
    .line 56
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getAxisValue(I)F

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    goto :goto_2

    .line 61
    :cond_3
    :goto_1
    const/4 v3, 0x0

    .line 62
    goto :goto_2

    .line 63
    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    const/high16 v3, 0x400000

    .line 68
    .line 69
    and-int/2addr v0, v3

    .line 70
    if-eqz v0, :cond_6

    .line 71
    .line 72
    const/16 v0, 0x1a

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 79
    .line 80
    invoke-virtual {v3}, LN/x;->c()Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_5

    .line 85
    .line 86
    neg-float v0, v0

    .line 87
    goto :goto_1

    .line 88
    :cond_5
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 89
    .line 90
    invoke-virtual {v3}, LN/x;->b()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_6

    .line 95
    .line 96
    move v3, v0

    .line 97
    const/4 v0, 0x0

    .line 98
    goto :goto_2

    .line 99
    :cond_6
    const/4 v0, 0x0

    .line 100
    goto :goto_1

    .line 101
    :goto_2
    cmpl-float v4, v0, v2

    .line 102
    .line 103
    if-nez v4, :cond_7

    .line 104
    .line 105
    cmpl-float v2, v3, v2

    .line 106
    .line 107
    if-eqz v2, :cond_8

    .line 108
    .line 109
    :cond_7
    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView;->S:F

    .line 110
    .line 111
    mul-float v3, v3, v2

    .line 112
    .line 113
    float-to-int v2, v3

    .line 114
    iget v3, p0, Landroidx/recyclerview/widget/RecyclerView;->T:F

    .line 115
    .line 116
    mul-float v0, v0, v3

    .line 117
    .line 118
    float-to-int v0, v0

    .line 119
    invoke-virtual {p0, v2, v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->q(IILandroid/view/MotionEvent;)V

    .line 120
    .line 121
    .line 122
    :cond_8
    return v1
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 9

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->u:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x3

    .line 12
    if-eq v0, v2, :cond_1

    .line 13
    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    :cond_1
    const/4 v3, 0x0

    .line 17
    iput-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->p:LN/h;

    .line 18
    .line 19
    :cond_2
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->o:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const/4 v5, 0x0

    .line 26
    :goto_0
    const/4 v6, 0x1

    .line 27
    if-ge v5, v4, :cond_4

    .line 28
    .line 29
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    check-cast v7, LN/h;

    .line 34
    .line 35
    invoke-virtual {v7, p1}, LN/h;->c(Landroid/view/MotionEvent;)Z

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    if-eqz v8, :cond_3

    .line 40
    .line 41
    if-eq v0, v2, :cond_3

    .line 42
    .line 43
    iput-object v7, p0, Landroidx/recyclerview/widget/RecyclerView;->p:LN/h;

    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->p()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 49
    .line 50
    .line 51
    return v6

    .line 52
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_4
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 56
    .line 57
    if-nez v0, :cond_5

    .line 58
    .line 59
    return v1

    .line 60
    :cond_5
    invoke-virtual {v0}, LN/x;->b()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 65
    .line 66
    invoke-virtual {v3}, LN/x;->c()Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->K:Landroid/view/VelocityTracker;

    .line 71
    .line 72
    if-nez v4, :cond_6

    .line 73
    .line 74
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    iput-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->K:Landroid/view/VelocityTracker;

    .line 79
    .line 80
    :cond_6
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->K:Landroid/view/VelocityTracker;

    .line 81
    .line 82
    invoke-virtual {v4, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    const/4 v7, 0x2

    .line 94
    const/high16 v8, 0x3f000000    # 0.5f

    .line 95
    .line 96
    if-eqz v4, :cond_f

    .line 97
    .line 98
    if-eq v4, v6, :cond_e

    .line 99
    .line 100
    if-eq v4, v7, :cond_a

    .line 101
    .line 102
    if-eq v4, v2, :cond_9

    .line 103
    .line 104
    const/4 v0, 0x5

    .line 105
    if-eq v4, v0, :cond_8

    .line 106
    .line 107
    const/4 v0, 0x6

    .line 108
    if-eq v4, v0, :cond_7

    .line 109
    .line 110
    goto/16 :goto_2

    .line 111
    .line 112
    :cond_7
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->n(Landroid/view/MotionEvent;)V

    .line 113
    .line 114
    .line 115
    goto/16 :goto_2

    .line 116
    .line 117
    :cond_8
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->J:I

    .line 122
    .line 123
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getX(I)F

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    add-float/2addr v0, v8

    .line 128
    float-to-int v0, v0

    .line 129
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->N:I

    .line 130
    .line 131
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->L:I

    .line 132
    .line 133
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getY(I)F

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    add-float/2addr p1, v8

    .line 138
    float-to-int p1, p1

    .line 139
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->O:I

    .line 140
    .line 141
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->M:I

    .line 142
    .line 143
    goto/16 :goto_2

    .line 144
    .line 145
    :cond_9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->p()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 149
    .line 150
    .line 151
    goto/16 :goto_2

    .line 152
    .line 153
    :cond_a
    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView;->J:I

    .line 154
    .line 155
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-gez v2, :cond_b

    .line 160
    .line 161
    new-instance p1, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    const-string v0, "Error processing scroll; pointer index for id "

    .line 164
    .line 165
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->J:I

    .line 169
    .line 170
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string v0, " not found. Did any MotionEvents get skipped?"

    .line 174
    .line 175
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    const-string v0, "RecyclerView"

    .line 183
    .line 184
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 185
    .line 186
    .line 187
    return v1

    .line 188
    :cond_b
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    add-float/2addr v4, v8

    .line 193
    float-to-int v4, v4

    .line 194
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    add-float/2addr p1, v8

    .line 199
    float-to-int p1, p1

    .line 200
    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView;->I:I

    .line 201
    .line 202
    if-eq v2, v6, :cond_13

    .line 203
    .line 204
    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView;->L:I

    .line 205
    .line 206
    sub-int v2, v4, v2

    .line 207
    .line 208
    iget v5, p0, Landroidx/recyclerview/widget/RecyclerView;->M:I

    .line 209
    .line 210
    sub-int v5, p1, v5

    .line 211
    .line 212
    if-eqz v0, :cond_c

    .line 213
    .line 214
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView;->P:I

    .line 219
    .line 220
    if-le v0, v2, :cond_c

    .line 221
    .line 222
    iput v4, p0, Landroidx/recyclerview/widget/RecyclerView;->N:I

    .line 223
    .line 224
    const/4 v0, 0x1

    .line 225
    goto :goto_1

    .line 226
    :cond_c
    const/4 v0, 0x0

    .line 227
    :goto_1
    if-eqz v3, :cond_d

    .line 228
    .line 229
    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    iget v3, p0, Landroidx/recyclerview/widget/RecyclerView;->P:I

    .line 234
    .line 235
    if-le v2, v3, :cond_d

    .line 236
    .line 237
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->O:I

    .line 238
    .line 239
    const/4 v0, 0x1

    .line 240
    :cond_d
    if-eqz v0, :cond_13

    .line 241
    .line 242
    invoke-virtual {p0, v6}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 243
    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_e
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->K:Landroid/view/VelocityTracker;

    .line 247
    .line 248
    invoke-virtual {p1}, Landroid/view/VelocityTracker;->clear()V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->s(I)V

    .line 252
    .line 253
    .line 254
    goto :goto_2

    .line 255
    :cond_f
    iget-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->v:Z

    .line 256
    .line 257
    if-eqz v2, :cond_10

    .line 258
    .line 259
    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->v:Z

    .line 260
    .line 261
    :cond_10
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 262
    .line 263
    .line 264
    move-result v2

    .line 265
    iput v2, p0, Landroidx/recyclerview/widget/RecyclerView;->J:I

    .line 266
    .line 267
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    add-float/2addr v2, v8

    .line 272
    float-to-int v2, v2

    .line 273
    iput v2, p0, Landroidx/recyclerview/widget/RecyclerView;->N:I

    .line 274
    .line 275
    iput v2, p0, Landroidx/recyclerview/widget/RecyclerView;->L:I

    .line 276
    .line 277
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 278
    .line 279
    .line 280
    move-result p1

    .line 281
    add-float/2addr p1, v8

    .line 282
    float-to-int p1, p1

    .line 283
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->O:I

    .line 284
    .line 285
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->M:I

    .line 286
    .line 287
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->I:I

    .line 288
    .line 289
    if-ne p1, v7, :cond_11

    .line 290
    .line 291
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    invoke-interface {p1, v6}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {p0, v6}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 299
    .line 300
    .line 301
    :cond_11
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->i0:[I

    .line 302
    .line 303
    aput v1, p1, v6

    .line 304
    .line 305
    aput v1, p1, v1

    .line 306
    .line 307
    if-eqz v3, :cond_12

    .line 308
    .line 309
    or-int/lit8 v0, v0, 0x2

    .line 310
    .line 311
    :cond_12
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Ly/g;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    invoke-virtual {p1, v0, v1}, Ly/g;->g(II)Z

    .line 316
    .line 317
    .line 318
    :cond_13
    :goto_2
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->I:I

    .line 319
    .line 320
    if-ne p1, v6, :cond_14

    .line 321
    .line 322
    const/4 v1, 0x1

    .line 323
    :cond_14
    return v1
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    sget p1, Lu/b;->a:I

    .line 2
    .line 3
    const-string p1, "RV OnLayout"

    .line 4
    .line 5
    invoke-static {p1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string p1, "RecyclerView"

    .line 9
    .line 10
    const-string p2, "No adapter attached; skipping layout"

    .line 11
    .line 12
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Z

    .line 20
    .line 21
    return-void
.end method

.method public final onMeasure(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->e(II)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {v0}, LN/x;->y()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 16
    .line 17
    .line 18
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 22
    .line 23
    iget-object v0, v0, LN/x;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 24
    .line 25
    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->e(II)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->r:Z

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 34
    .line 35
    iget-object v0, v0, LN/x;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 36
    .line 37
    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->e(II)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:LN/G;

    .line 42
    .line 43
    iget-boolean v1, v0, LN/G;->e:Z

    .line 44
    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget v1, p0, Landroidx/recyclerview/widget/RecyclerView;->t:I

    .line 63
    .line 64
    add-int/lit8 v1, v1, 0x1

    .line 65
    .line 66
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->t:I

    .line 67
    .line 68
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 69
    .line 70
    iget-object v1, v1, LN/x;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 71
    .line 72
    invoke-virtual {v1, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->e(II)V

    .line 73
    .line 74
    .line 75
    const/4 p1, 0x0

    .line 76
    iget p2, p0, Landroidx/recyclerview/widget/RecyclerView;->t:I

    .line 77
    .line 78
    const/4 v1, 0x1

    .line 79
    if-ge p2, v1, :cond_4

    .line 80
    .line 81
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->t:I

    .line 82
    .line 83
    :cond_4
    iget p2, p0, Landroidx/recyclerview/widget/RecyclerView;->t:I

    .line 84
    .line 85
    sub-int/2addr p2, v1

    .line 86
    iput p2, p0, Landroidx/recyclerview/widget/RecyclerView;->t:I

    .line 87
    .line 88
    iput-boolean p1, v0, LN/G;->c:Z

    .line 89
    .line 90
    return-void
.end method

.method public final onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->A:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, LN/F;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p1, LN/F;

    .line 10
    .line 11
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->f:LN/F;

    .line 12
    .line 13
    iget-object p1, p1, LF/c;->a:Landroid/os/Parcelable;

    .line 14
    .line 15
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->f:LN/F;

    .line 23
    .line 24
    iget-object v0, v0, LN/F;->c:Landroid/os/Parcelable;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1, v0}, LN/x;->B(Landroid/os/Parcelable;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    new-instance v0, LN/F;

    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, LF/c;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->f:LN/F;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v1, v1, LN/F;->c:Landroid/os/Parcelable;

    .line 15
    .line 16
    iput-object v1, v0, LN/F;->c:Landroid/os/Parcelable;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1}, LN/x;->C()Landroid/os/Parcelable;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iput-object v1, v0, LN/F;->c:Landroid/os/Parcelable;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v1, 0x0

    .line 31
    iput-object v1, v0, LN/F;->c:Landroid/os/Parcelable;

    .line 32
    .line 33
    :goto_0
    return-object v0
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    if-ne p1, p3, :cond_0

    .line 5
    .line 6
    if-eq p2, p4, :cond_1

    .line 7
    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Landroid/widget/EdgeEffect;

    .line 10
    .line 11
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    .line 12
    .line 13
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/widget/EdgeEffect;

    .line 14
    .line 15
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Landroid/widget/EdgeEffect;

    .line 16
    .line 17
    :cond_1
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 21

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-boolean v1, v6, Landroidx/recyclerview/widget/RecyclerView;->u:Z

    .line 6
    .line 7
    const/4 v7, 0x0

    .line 8
    if-nez v1, :cond_36

    .line 9
    .line 10
    iget-boolean v1, v6, Landroidx/recyclerview/widget/RecyclerView;->v:Z

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    goto/16 :goto_12

    .line 15
    .line 16
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iget-object v2, v6, Landroidx/recyclerview/widget/RecyclerView;->p:LN/h;

    .line 21
    .line 22
    const/4 v8, 0x1

    .line 23
    const/4 v3, 0x2

    .line 24
    const/4 v4, 0x3

    .line 25
    const/4 v5, 0x0

    .line 26
    if-eqz v2, :cond_f

    .line 27
    .line 28
    const/4 v9, 0x0

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    iput-object v9, v6, Landroidx/recyclerview/widget/RecyclerView;->p:LN/h;

    .line 32
    .line 33
    goto/16 :goto_3

    .line 34
    .line 35
    :cond_1
    iget v10, v2, LN/h;->q:I

    .line 36
    .line 37
    if-nez v10, :cond_2

    .line 38
    .line 39
    goto/16 :goto_2

    .line 40
    .line 41
    :cond_2
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    .line 42
    .line 43
    .line 44
    move-result v10

    .line 45
    if-nez v10, :cond_6

    .line 46
    .line 47
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    invoke-virtual {v2, v5, v10}, LN/h;->b(FF)Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 64
    .line 65
    .line 66
    move-result v11

    .line 67
    invoke-virtual {v2, v10, v11}, LN/h;->a(FF)Z

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    if-nez v5, :cond_3

    .line 72
    .line 73
    if-eqz v10, :cond_d

    .line 74
    .line 75
    :cond_3
    if-eqz v10, :cond_4

    .line 76
    .line 77
    iput v8, v2, LN/h;->r:I

    .line 78
    .line 79
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    float-to-int v0, v0

    .line 84
    int-to-float v0, v0

    .line 85
    iput v0, v2, LN/h;->k:F

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    if-eqz v5, :cond_5

    .line 89
    .line 90
    iput v3, v2, LN/h;->r:I

    .line 91
    .line 92
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    float-to-int v0, v0

    .line 97
    int-to-float v0, v0

    .line 98
    iput v0, v2, LN/h;->j:F

    .line 99
    .line 100
    :cond_5
    :goto_0
    invoke-virtual {v2, v3}, LN/h;->e(I)V

    .line 101
    .line 102
    .line 103
    goto/16 :goto_2

    .line 104
    .line 105
    :cond_6
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    if-ne v10, v8, :cond_7

    .line 110
    .line 111
    iget v10, v2, LN/h;->q:I

    .line 112
    .line 113
    if-ne v10, v3, :cond_7

    .line 114
    .line 115
    iput v5, v2, LN/h;->j:F

    .line 116
    .line 117
    iput v5, v2, LN/h;->k:F

    .line 118
    .line 119
    invoke-virtual {v2, v8}, LN/h;->e(I)V

    .line 120
    .line 121
    .line 122
    iput v7, v2, LN/h;->r:I

    .line 123
    .line 124
    goto/16 :goto_2

    .line 125
    .line 126
    :cond_7
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    if-ne v5, v3, :cond_d

    .line 131
    .line 132
    iget v5, v2, LN/h;->q:I

    .line 133
    .line 134
    if-ne v5, v3, :cond_d

    .line 135
    .line 136
    invoke-virtual {v2}, LN/h;->f()V

    .line 137
    .line 138
    .line 139
    iget v5, v2, LN/h;->r:I

    .line 140
    .line 141
    const/high16 v10, 0x40000000    # 2.0f

    .line 142
    .line 143
    iget v11, v2, LN/h;->a:I

    .line 144
    .line 145
    if-ne v5, v8, :cond_a

    .line 146
    .line 147
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    iget-object v14, v2, LN/h;->t:[I

    .line 152
    .line 153
    aput v11, v14, v7

    .line 154
    .line 155
    iget v12, v2, LN/h;->l:I

    .line 156
    .line 157
    sub-int/2addr v12, v11

    .line 158
    aput v12, v14, v8

    .line 159
    .line 160
    int-to-float v13, v11

    .line 161
    int-to-float v12, v12

    .line 162
    invoke-static {v12, v5}, Ljava/lang/Math;->min(FF)F

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    invoke-static {v13, v5}, Ljava/lang/Math;->max(FF)F

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    const/4 v12, 0x0

    .line 171
    int-to-float v12, v12

    .line 172
    sub-float/2addr v12, v5

    .line 173
    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    .line 174
    .line 175
    .line 176
    move-result v12

    .line 177
    cmpg-float v12, v12, v10

    .line 178
    .line 179
    if-gez v12, :cond_8

    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_8
    iget v12, v2, LN/h;->k:F

    .line 183
    .line 184
    iget-object v13, v2, LN/h;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 185
    .line 186
    invoke-virtual {v13}, Landroidx/recyclerview/widget/RecyclerView;->computeHorizontalScrollRange()I

    .line 187
    .line 188
    .line 189
    move-result v15

    .line 190
    iget-object v13, v2, LN/h;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 191
    .line 192
    invoke-virtual {v13}, Landroidx/recyclerview/widget/RecyclerView;->computeHorizontalScrollOffset()I

    .line 193
    .line 194
    .line 195
    const/16 v16, 0x0

    .line 196
    .line 197
    iget v13, v2, LN/h;->l:I

    .line 198
    .line 199
    move/from16 v17, v13

    .line 200
    .line 201
    move v13, v5

    .line 202
    invoke-static/range {v12 .. v17}, LN/h;->d(FF[IIII)I

    .line 203
    .line 204
    .line 205
    move-result v12

    .line 206
    if-eqz v12, :cond_9

    .line 207
    .line 208
    iget-object v13, v2, LN/h;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 209
    .line 210
    invoke-virtual {v13, v12, v7}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 211
    .line 212
    .line 213
    :cond_9
    iput v5, v2, LN/h;->k:F

    .line 214
    .line 215
    :cond_a
    :goto_1
    iget v5, v2, LN/h;->r:I

    .line 216
    .line 217
    if-ne v5, v3, :cond_d

    .line 218
    .line 219
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    iget-object v14, v2, LN/h;->s:[I

    .line 224
    .line 225
    aput v11, v14, v7

    .line 226
    .line 227
    iget v3, v2, LN/h;->m:I

    .line 228
    .line 229
    sub-int/2addr v3, v11

    .line 230
    aput v3, v14, v8

    .line 231
    .line 232
    int-to-float v5, v11

    .line 233
    int-to-float v3, v3

    .line 234
    invoke-static {v3, v0}, Ljava/lang/Math;->min(FF)F

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    invoke-static {v5, v0}, Ljava/lang/Math;->max(FF)F

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    const/4 v3, 0x0

    .line 243
    int-to-float v3, v3

    .line 244
    sub-float/2addr v3, v0

    .line 245
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    cmpg-float v3, v3, v10

    .line 250
    .line 251
    if-gez v3, :cond_b

    .line 252
    .line 253
    goto :goto_2

    .line 254
    :cond_b
    iget v12, v2, LN/h;->j:F

    .line 255
    .line 256
    iget-object v3, v2, LN/h;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 257
    .line 258
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollRange()I

    .line 259
    .line 260
    .line 261
    move-result v15

    .line 262
    iget-object v3, v2, LN/h;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 263
    .line 264
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollOffset()I

    .line 265
    .line 266
    .line 267
    const/16 v16, 0x0

    .line 268
    .line 269
    iget v3, v2, LN/h;->m:I

    .line 270
    .line 271
    move v13, v0

    .line 272
    move/from16 v17, v3

    .line 273
    .line 274
    invoke-static/range {v12 .. v17}, LN/h;->d(FF[IIII)I

    .line 275
    .line 276
    .line 277
    move-result v3

    .line 278
    if-eqz v3, :cond_c

    .line 279
    .line 280
    iget-object v5, v2, LN/h;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 281
    .line 282
    invoke-virtual {v5, v7, v3}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 283
    .line 284
    .line 285
    :cond_c
    iput v0, v2, LN/h;->j:F

    .line 286
    .line 287
    :cond_d
    :goto_2
    if-eq v1, v4, :cond_e

    .line 288
    .line 289
    if-ne v1, v8, :cond_10

    .line 290
    .line 291
    :cond_e
    iput-object v9, v6, Landroidx/recyclerview/widget/RecyclerView;->p:LN/h;

    .line 292
    .line 293
    goto :goto_5

    .line 294
    :cond_f
    :goto_3
    if-eqz v1, :cond_12

    .line 295
    .line 296
    iget-object v1, v6, Landroidx/recyclerview/widget/RecyclerView;->o:Ljava/util/ArrayList;

    .line 297
    .line 298
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 299
    .line 300
    .line 301
    move-result v2

    .line 302
    const/4 v9, 0x0

    .line 303
    :goto_4
    if-ge v9, v2, :cond_12

    .line 304
    .line 305
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v10

    .line 309
    check-cast v10, LN/h;

    .line 310
    .line 311
    invoke-virtual {v10, v0}, LN/h;->c(Landroid/view/MotionEvent;)Z

    .line 312
    .line 313
    .line 314
    move-result v11

    .line 315
    if-eqz v11, :cond_11

    .line 316
    .line 317
    iput-object v10, v6, Landroidx/recyclerview/widget/RecyclerView;->p:LN/h;

    .line 318
    .line 319
    :cond_10
    :goto_5
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->p()V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v6, v7}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 323
    .line 324
    .line 325
    return v8

    .line 326
    :cond_11
    add-int/lit8 v9, v9, 0x1

    .line 327
    .line 328
    goto :goto_4

    .line 329
    :cond_12
    iget-object v1, v6, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 330
    .line 331
    if-nez v1, :cond_13

    .line 332
    .line 333
    return v7

    .line 334
    :cond_13
    invoke-virtual {v1}, LN/x;->b()Z

    .line 335
    .line 336
    .line 337
    move-result v9

    .line 338
    iget-object v1, v6, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 339
    .line 340
    invoke-virtual {v1}, LN/x;->c()Z

    .line 341
    .line 342
    .line 343
    move-result v10

    .line 344
    iget-object v1, v6, Landroidx/recyclerview/widget/RecyclerView;->K:Landroid/view/VelocityTracker;

    .line 345
    .line 346
    if-nez v1, :cond_14

    .line 347
    .line 348
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    iput-object v1, v6, Landroidx/recyclerview/widget/RecyclerView;->K:Landroid/view/VelocityTracker;

    .line 353
    .line 354
    :cond_14
    invoke-static/range {p1 .. p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 355
    .line 356
    .line 357
    move-result-object v11

    .line 358
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 359
    .line 360
    .line 361
    move-result v1

    .line 362
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    iget-object v12, v6, Landroidx/recyclerview/widget/RecyclerView;->i0:[I

    .line 367
    .line 368
    if-nez v1, :cond_15

    .line 369
    .line 370
    aput v7, v12, v8

    .line 371
    .line 372
    aput v7, v12, v7

    .line 373
    .line 374
    :cond_15
    aget v13, v12, v7

    .line 375
    .line 376
    int-to-float v13, v13

    .line 377
    aget v14, v12, v8

    .line 378
    .line 379
    int-to-float v14, v14

    .line 380
    invoke-virtual {v11, v13, v14}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 381
    .line 382
    .line 383
    const/high16 v13, 0x3f000000    # 0.5f

    .line 384
    .line 385
    if-eqz v1, :cond_33

    .line 386
    .line 387
    const-string v14, "RecyclerView"

    .line 388
    .line 389
    if-eq v1, v8, :cond_24

    .line 390
    .line 391
    if-eq v1, v3, :cond_19

    .line 392
    .line 393
    if-eq v1, v4, :cond_18

    .line 394
    .line 395
    const/4 v3, 0x5

    .line 396
    if-eq v1, v3, :cond_17

    .line 397
    .line 398
    const/4 v2, 0x6

    .line 399
    if-eq v1, v2, :cond_16

    .line 400
    .line 401
    goto/16 :goto_10

    .line 402
    .line 403
    :cond_16
    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/RecyclerView;->n(Landroid/view/MotionEvent;)V

    .line 404
    .line 405
    .line 406
    goto/16 :goto_10

    .line 407
    .line 408
    :cond_17
    invoke-virtual {v0, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    iput v1, v6, Landroidx/recyclerview/widget/RecyclerView;->J:I

    .line 413
    .line 414
    invoke-virtual {v0, v2}, Landroid/view/MotionEvent;->getX(I)F

    .line 415
    .line 416
    .line 417
    move-result v1

    .line 418
    add-float/2addr v1, v13

    .line 419
    float-to-int v1, v1

    .line 420
    iput v1, v6, Landroidx/recyclerview/widget/RecyclerView;->N:I

    .line 421
    .line 422
    iput v1, v6, Landroidx/recyclerview/widget/RecyclerView;->L:I

    .line 423
    .line 424
    invoke-virtual {v0, v2}, Landroid/view/MotionEvent;->getY(I)F

    .line 425
    .line 426
    .line 427
    move-result v0

    .line 428
    add-float/2addr v0, v13

    .line 429
    float-to-int v0, v0

    .line 430
    iput v0, v6, Landroidx/recyclerview/widget/RecyclerView;->O:I

    .line 431
    .line 432
    iput v0, v6, Landroidx/recyclerview/widget/RecyclerView;->M:I

    .line 433
    .line 434
    goto/16 :goto_10

    .line 435
    .line 436
    :cond_18
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->p()V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v6, v7}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 440
    .line 441
    .line 442
    goto/16 :goto_10

    .line 443
    .line 444
    :cond_19
    iget v1, v6, Landroidx/recyclerview/widget/RecyclerView;->J:I

    .line 445
    .line 446
    invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 447
    .line 448
    .line 449
    move-result v1

    .line 450
    if-gez v1, :cond_1a

    .line 451
    .line 452
    new-instance v0, Ljava/lang/StringBuilder;

    .line 453
    .line 454
    const-string v1, "Error processing scroll; pointer index for id "

    .line 455
    .line 456
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    iget v1, v6, Landroidx/recyclerview/widget/RecyclerView;->J:I

    .line 460
    .line 461
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    const-string v1, " not found. Did any MotionEvents get skipped?"

    .line 465
    .line 466
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    invoke-static {v14, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 474
    .line 475
    .line 476
    return v7

    .line 477
    :cond_1a
    invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->getX(I)F

    .line 478
    .line 479
    .line 480
    move-result v2

    .line 481
    add-float/2addr v2, v13

    .line 482
    float-to-int v14, v2

    .line 483
    invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->getY(I)F

    .line 484
    .line 485
    .line 486
    move-result v0

    .line 487
    add-float/2addr v0, v13

    .line 488
    float-to-int v13, v0

    .line 489
    iget v0, v6, Landroidx/recyclerview/widget/RecyclerView;->N:I

    .line 490
    .line 491
    sub-int v15, v0, v14

    .line 492
    .line 493
    iget v0, v6, Landroidx/recyclerview/widget/RecyclerView;->O:I

    .line 494
    .line 495
    sub-int v16, v0, v13

    .line 496
    .line 497
    const/4 v5, 0x0

    .line 498
    iget-object v3, v6, Landroidx/recyclerview/widget/RecyclerView;->h0:[I

    .line 499
    .line 500
    iget-object v4, v6, Landroidx/recyclerview/widget/RecyclerView;->g0:[I

    .line 501
    .line 502
    move-object/from16 v0, p0

    .line 503
    .line 504
    move v1, v15

    .line 505
    move/from16 v2, v16

    .line 506
    .line 507
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/RecyclerView;->f(II[I[II)Z

    .line 508
    .line 509
    .line 510
    move-result v0

    .line 511
    iget-object v1, v6, Landroidx/recyclerview/widget/RecyclerView;->g0:[I

    .line 512
    .line 513
    if-eqz v0, :cond_1b

    .line 514
    .line 515
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->h0:[I

    .line 516
    .line 517
    aget v2, v0, v7

    .line 518
    .line 519
    sub-int/2addr v15, v2

    .line 520
    aget v0, v0, v8

    .line 521
    .line 522
    sub-int v16, v16, v0

    .line 523
    .line 524
    aget v0, v1, v7

    .line 525
    .line 526
    int-to-float v0, v0

    .line 527
    aget v2, v1, v8

    .line 528
    .line 529
    int-to-float v2, v2

    .line 530
    invoke-virtual {v11, v0, v2}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 531
    .line 532
    .line 533
    aget v0, v12, v7

    .line 534
    .line 535
    aget v2, v1, v7

    .line 536
    .line 537
    add-int/2addr v0, v2

    .line 538
    aput v0, v12, v7

    .line 539
    .line 540
    aget v0, v12, v8

    .line 541
    .line 542
    aget v2, v1, v8

    .line 543
    .line 544
    add-int/2addr v0, v2

    .line 545
    aput v0, v12, v8

    .line 546
    .line 547
    :cond_1b
    iget v0, v6, Landroidx/recyclerview/widget/RecyclerView;->I:I

    .line 548
    .line 549
    if-eq v0, v8, :cond_20

    .line 550
    .line 551
    if-eqz v9, :cond_1d

    .line 552
    .line 553
    invoke-static {v15}, Ljava/lang/Math;->abs(I)I

    .line 554
    .line 555
    .line 556
    move-result v0

    .line 557
    iget v2, v6, Landroidx/recyclerview/widget/RecyclerView;->P:I

    .line 558
    .line 559
    if-le v0, v2, :cond_1d

    .line 560
    .line 561
    if-lez v15, :cond_1c

    .line 562
    .line 563
    sub-int/2addr v15, v2

    .line 564
    goto :goto_6

    .line 565
    :cond_1c
    add-int/2addr v15, v2

    .line 566
    :goto_6
    const/4 v0, 0x1

    .line 567
    goto :goto_7

    .line 568
    :cond_1d
    const/4 v0, 0x0

    .line 569
    :goto_7
    if-eqz v10, :cond_1f

    .line 570
    .line 571
    invoke-static/range {v16 .. v16}, Ljava/lang/Math;->abs(I)I

    .line 572
    .line 573
    .line 574
    move-result v2

    .line 575
    iget v3, v6, Landroidx/recyclerview/widget/RecyclerView;->P:I

    .line 576
    .line 577
    if-le v2, v3, :cond_1f

    .line 578
    .line 579
    if-lez v16, :cond_1e

    .line 580
    .line 581
    sub-int v16, v16, v3

    .line 582
    .line 583
    goto :goto_8

    .line 584
    :cond_1e
    add-int v16, v16, v3

    .line 585
    .line 586
    :goto_8
    const/4 v0, 0x1

    .line 587
    :cond_1f
    if-eqz v0, :cond_20

    .line 588
    .line 589
    invoke-virtual {v6, v8}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 590
    .line 591
    .line 592
    :cond_20
    move/from16 v0, v16

    .line 593
    .line 594
    iget v2, v6, Landroidx/recyclerview/widget/RecyclerView;->I:I

    .line 595
    .line 596
    if-ne v2, v8, :cond_35

    .line 597
    .line 598
    aget v2, v1, v7

    .line 599
    .line 600
    sub-int/2addr v14, v2

    .line 601
    iput v14, v6, Landroidx/recyclerview/widget/RecyclerView;->N:I

    .line 602
    .line 603
    aget v1, v1, v8

    .line 604
    .line 605
    sub-int/2addr v13, v1

    .line 606
    iput v13, v6, Landroidx/recyclerview/widget/RecyclerView;->O:I

    .line 607
    .line 608
    if-eqz v9, :cond_21

    .line 609
    .line 610
    move v1, v15

    .line 611
    goto :goto_9

    .line 612
    :cond_21
    const/4 v1, 0x0

    .line 613
    :goto_9
    if-eqz v10, :cond_22

    .line 614
    .line 615
    move v7, v0

    .line 616
    :cond_22
    invoke-virtual {v6, v1, v7, v11}, Landroidx/recyclerview/widget/RecyclerView;->q(IILandroid/view/MotionEvent;)V

    .line 617
    .line 618
    .line 619
    iget-object v1, v6, Landroidx/recyclerview/widget/RecyclerView;->W:LN/l;

    .line 620
    .line 621
    if-eqz v1, :cond_35

    .line 622
    .line 623
    if-nez v15, :cond_23

    .line 624
    .line 625
    if-eqz v0, :cond_35

    .line 626
    .line 627
    :cond_23
    invoke-virtual {v1, v6, v15, v0}, LN/l;->a(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 628
    .line 629
    .line 630
    goto/16 :goto_10

    .line 631
    .line 632
    :cond_24
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->K:Landroid/view/VelocityTracker;

    .line 633
    .line 634
    invoke-virtual {v0, v11}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 635
    .line 636
    .line 637
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->K:Landroid/view/VelocityTracker;

    .line 638
    .line 639
    iget v1, v6, Landroidx/recyclerview/widget/RecyclerView;->R:I

    .line 640
    .line 641
    int-to-float v2, v1

    .line 642
    const/16 v4, 0x3e8

    .line 643
    .line 644
    invoke-virtual {v0, v4, v2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 645
    .line 646
    .line 647
    if-eqz v9, :cond_25

    .line 648
    .line 649
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->K:Landroid/view/VelocityTracker;

    .line 650
    .line 651
    iget v2, v6, Landroidx/recyclerview/widget/RecyclerView;->J:I

    .line 652
    .line 653
    invoke-virtual {v0, v2}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    .line 654
    .line 655
    .line 656
    move-result v0

    .line 657
    neg-float v0, v0

    .line 658
    goto :goto_a

    .line 659
    :cond_25
    const/4 v0, 0x0

    .line 660
    :goto_a
    if-eqz v10, :cond_26

    .line 661
    .line 662
    iget-object v2, v6, Landroidx/recyclerview/widget/RecyclerView;->K:Landroid/view/VelocityTracker;

    .line 663
    .line 664
    iget v4, v6, Landroidx/recyclerview/widget/RecyclerView;->J:I

    .line 665
    .line 666
    invoke-virtual {v2, v4}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    .line 667
    .line 668
    .line 669
    move-result v2

    .line 670
    neg-float v2, v2

    .line 671
    goto :goto_b

    .line 672
    :cond_26
    const/4 v2, 0x0

    .line 673
    :goto_b
    cmpl-float v4, v0, v5

    .line 674
    .line 675
    if-nez v4, :cond_27

    .line 676
    .line 677
    cmpl-float v4, v2, v5

    .line 678
    .line 679
    if-eqz v4, :cond_32

    .line 680
    .line 681
    :cond_27
    float-to-int v0, v0

    .line 682
    float-to-int v2, v2

    .line 683
    iget-object v4, v6, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 684
    .line 685
    if-nez v4, :cond_28

    .line 686
    .line 687
    const-string v0, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."

    .line 688
    .line 689
    invoke-static {v14, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 690
    .line 691
    .line 692
    goto/16 :goto_e

    .line 693
    .line 694
    :cond_28
    iget-boolean v5, v6, Landroidx/recyclerview/widget/RecyclerView;->u:Z

    .line 695
    .line 696
    if-eqz v5, :cond_29

    .line 697
    .line 698
    goto/16 :goto_e

    .line 699
    .line 700
    :cond_29
    invoke-virtual {v4}, LN/x;->b()Z

    .line 701
    .line 702
    .line 703
    move-result v4

    .line 704
    iget-object v5, v6, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 705
    .line 706
    invoke-virtual {v5}, LN/x;->c()Z

    .line 707
    .line 708
    .line 709
    move-result v5

    .line 710
    iget v9, v6, Landroidx/recyclerview/widget/RecyclerView;->Q:I

    .line 711
    .line 712
    if-eqz v4, :cond_2a

    .line 713
    .line 714
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 715
    .line 716
    .line 717
    move-result v10

    .line 718
    if-ge v10, v9, :cond_2b

    .line 719
    .line 720
    :cond_2a
    const/4 v0, 0x0

    .line 721
    :cond_2b
    if-eqz v5, :cond_2c

    .line 722
    .line 723
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    .line 724
    .line 725
    .line 726
    move-result v10

    .line 727
    if-ge v10, v9, :cond_2d

    .line 728
    .line 729
    :cond_2c
    const/4 v2, 0x0

    .line 730
    :cond_2d
    if-nez v0, :cond_2e

    .line 731
    .line 732
    if-nez v2, :cond_2e

    .line 733
    .line 734
    goto :goto_e

    .line 735
    :cond_2e
    int-to-float v9, v0

    .line 736
    int-to-float v10, v2

    .line 737
    invoke-virtual {v6, v9, v10}, Landroidx/recyclerview/widget/RecyclerView;->dispatchNestedPreFling(FF)Z

    .line 738
    .line 739
    .line 740
    move-result v12

    .line 741
    if-nez v12, :cond_32

    .line 742
    .line 743
    if-nez v4, :cond_30

    .line 744
    .line 745
    if-eqz v5, :cond_2f

    .line 746
    .line 747
    goto :goto_c

    .line 748
    :cond_2f
    const/4 v12, 0x0

    .line 749
    goto :goto_d

    .line 750
    :cond_30
    :goto_c
    const/4 v12, 0x1

    .line 751
    :goto_d
    invoke-virtual {v6, v9, v10, v12}, Landroidx/recyclerview/widget/RecyclerView;->dispatchNestedFling(FFZ)Z

    .line 752
    .line 753
    .line 754
    if-eqz v12, :cond_32

    .line 755
    .line 756
    if-eqz v5, :cond_31

    .line 757
    .line 758
    or-int/lit8 v4, v4, 0x2

    .line 759
    .line 760
    :cond_31
    invoke-direct/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Ly/g;

    .line 761
    .line 762
    .line 763
    move-result-object v5

    .line 764
    invoke-virtual {v5, v4, v8}, Ly/g;->g(II)Z

    .line 765
    .line 766
    .line 767
    neg-int v4, v1

    .line 768
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 769
    .line 770
    .line 771
    move-result v0

    .line 772
    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    .line 773
    .line 774
    .line 775
    move-result v15

    .line 776
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    .line 777
    .line 778
    .line 779
    move-result v0

    .line 780
    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    .line 781
    .line 782
    .line 783
    move-result v16

    .line 784
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->V:LN/I;

    .line 785
    .line 786
    iget-object v1, v0, LN/I;->k:Landroidx/recyclerview/widget/RecyclerView;

    .line 787
    .line 788
    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 789
    .line 790
    .line 791
    iput v7, v0, LN/I;->f:I

    .line 792
    .line 793
    iput v7, v0, LN/I;->e:I

    .line 794
    .line 795
    iget-object v12, v0, LN/I;->g:Landroid/widget/OverScroller;

    .line 796
    .line 797
    const/high16 v17, -0x80000000

    .line 798
    .line 799
    const v18, 0x7fffffff

    .line 800
    .line 801
    .line 802
    const/4 v13, 0x0

    .line 803
    const/4 v14, 0x0

    .line 804
    const/high16 v19, -0x80000000

    .line 805
    .line 806
    const v20, 0x7fffffff

    .line 807
    .line 808
    .line 809
    invoke-virtual/range {v12 .. v20}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    .line 810
    .line 811
    .line 812
    invoke-virtual {v0}, LN/I;->a()V

    .line 813
    .line 814
    .line 815
    goto :goto_f

    .line 816
    :cond_32
    :goto_e
    invoke-virtual {v6, v7}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 817
    .line 818
    .line 819
    :goto_f
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->p()V

    .line 820
    .line 821
    .line 822
    goto :goto_11

    .line 823
    :cond_33
    invoke-virtual {v0, v7}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 824
    .line 825
    .line 826
    move-result v1

    .line 827
    iput v1, v6, Landroidx/recyclerview/widget/RecyclerView;->J:I

    .line 828
    .line 829
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 830
    .line 831
    .line 832
    move-result v1

    .line 833
    add-float/2addr v1, v13

    .line 834
    float-to-int v1, v1

    .line 835
    iput v1, v6, Landroidx/recyclerview/widget/RecyclerView;->N:I

    .line 836
    .line 837
    iput v1, v6, Landroidx/recyclerview/widget/RecyclerView;->L:I

    .line 838
    .line 839
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 840
    .line 841
    .line 842
    move-result v0

    .line 843
    add-float/2addr v0, v13

    .line 844
    float-to-int v0, v0

    .line 845
    iput v0, v6, Landroidx/recyclerview/widget/RecyclerView;->O:I

    .line 846
    .line 847
    iput v0, v6, Landroidx/recyclerview/widget/RecyclerView;->M:I

    .line 848
    .line 849
    if-eqz v10, :cond_34

    .line 850
    .line 851
    or-int/lit8 v9, v9, 0x2

    .line 852
    .line 853
    :cond_34
    invoke-direct/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Ly/g;

    .line 854
    .line 855
    .line 856
    move-result-object v0

    .line 857
    invoke-virtual {v0, v9, v7}, Ly/g;->g(II)Z

    .line 858
    .line 859
    .line 860
    :cond_35
    :goto_10
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->K:Landroid/view/VelocityTracker;

    .line 861
    .line 862
    invoke-virtual {v0, v11}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 863
    .line 864
    .line 865
    :goto_11
    invoke-virtual {v11}, Landroid/view/MotionEvent;->recycle()V

    .line 866
    .line 867
    .line 868
    return v8

    .line 869
    :cond_36
    :goto_12
    return v7
.end method

.method public final p()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->K:Landroid/view/VelocityTracker;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->s(I)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Landroid/widget/EdgeEffect;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Landroid/widget/EdgeEffect;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    :cond_1
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    or-int/2addr v0, v1

    .line 39
    :cond_2
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/widget/EdgeEffect;

    .line 40
    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/widget/EdgeEffect;

    .line 47
    .line 48
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    or-int/2addr v0, v1

    .line 53
    :cond_3
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Landroid/widget/EdgeEffect;

    .line 54
    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Landroid/widget/EdgeEffect;

    .line 61
    .line 62
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    or-int/2addr v0, v1

    .line 67
    :cond_4
    if-eqz v0, :cond_5

    .line 68
    .line 69
    sget-object v0, Ly/x;->a:Ljava/lang/reflect/Field;

    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 72
    .line 73
    .line 74
    :cond_5
    return-void
.end method

.method public final q(IILandroid/view/MotionEvent;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->d()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->n:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->g0:[I

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {p0, v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->g([II)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x1

    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->N:I

    .line 26
    .line 27
    aget p2, v0, v1

    .line 28
    .line 29
    sub-int/2addr p1, p2

    .line 30
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->N:I

    .line 31
    .line 32
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->O:I

    .line 33
    .line 34
    aget v2, v0, v3

    .line 35
    .line 36
    sub-int/2addr p1, v2

    .line 37
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->O:I

    .line 38
    .line 39
    if-eqz p3, :cond_1

    .line 40
    .line 41
    int-to-float p1, p2

    .line 42
    int-to-float p2, v2

    .line 43
    invoke-virtual {p3, p1, p2}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 44
    .line 45
    .line 46
    :cond_1
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->i0:[I

    .line 47
    .line 48
    aget p2, p1, v1

    .line 49
    .line 50
    aget p3, v0, v1

    .line 51
    .line 52
    add-int/2addr p2, p3

    .line 53
    aput p2, p1, v1

    .line 54
    .line 55
    aget p2, p1, v3

    .line 56
    .line 57
    aget p3, v0, v3

    .line 58
    .line 59
    add-int/2addr p2, p3

    .line 60
    aput p2, p1, v3

    .line 61
    .line 62
    goto/16 :goto_8

    .line 63
    .line 64
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getOverScrollMode()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    const/4 v2, 0x2

    .line 69
    if-eq v0, v2, :cond_12

    .line 70
    .line 71
    if-eqz p3, :cond_11

    .line 72
    .line 73
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getSource()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    const/16 v2, 0x2002

    .line 78
    .line 79
    and-int/2addr v0, v2

    .line 80
    if-ne v0, v2, :cond_3

    .line 81
    .line 82
    goto/16 :goto_7

    .line 83
    .line 84
    :cond_3
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    int-to-float v2, v1

    .line 89
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    .line 90
    .line 91
    .line 92
    move-result p3

    .line 93
    const/high16 v4, 0x3f800000    # 1.0f

    .line 94
    .line 95
    const/4 v5, 0x0

    .line 96
    cmpg-float v6, v2, v5

    .line 97
    .line 98
    if-gez v6, :cond_6

    .line 99
    .line 100
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Landroid/widget/EdgeEffect;

    .line 101
    .line 102
    if-eqz v1, :cond_4

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_4
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->C:LN/u;

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    new-instance v1, Landroid/widget/EdgeEffect;

    .line 111
    .line 112
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    invoke-direct {v1, v7}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    .line 117
    .line 118
    .line 119
    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Landroid/widget/EdgeEffect;

    .line 120
    .line 121
    iget-boolean v7, p0, Landroidx/recyclerview/widget/RecyclerView;->j:Z

    .line 122
    .line 123
    if-eqz v7, :cond_5

    .line 124
    .line 125
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    sub-int/2addr v7, v8

    .line 134
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 135
    .line 136
    .line 137
    move-result v8

    .line 138
    sub-int/2addr v7, v8

    .line 139
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 140
    .line 141
    .line 142
    move-result v8

    .line 143
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    sub-int/2addr v8, v9

    .line 148
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 149
    .line 150
    .line 151
    move-result v9

    .line 152
    sub-int/2addr v8, v9

    .line 153
    invoke-virtual {v1, v7, v8}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 154
    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 158
    .line 159
    .line 160
    move-result v7

    .line 161
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    invoke-virtual {v1, v7, v8}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 166
    .line 167
    .line 168
    :goto_0
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Landroid/widget/EdgeEffect;

    .line 169
    .line 170
    neg-float v7, v2

    .line 171
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    int-to-float v8, v8

    .line 176
    div-float/2addr v7, v8

    .line 177
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 178
    .line 179
    .line 180
    move-result v8

    .line 181
    int-to-float v8, v8

    .line 182
    div-float/2addr p3, v8

    .line 183
    sub-float p3, v4, p3

    .line 184
    .line 185
    invoke-static {v1, v7, p3}, LD/d;->a(Landroid/widget/EdgeEffect;FF)V

    .line 186
    .line 187
    .line 188
    :goto_1
    const/4 v1, 0x1

    .line 189
    goto :goto_3

    .line 190
    :cond_6
    cmpl-float v7, v2, v5

    .line 191
    .line 192
    if-lez v7, :cond_9

    .line 193
    .line 194
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/widget/EdgeEffect;

    .line 195
    .line 196
    if-eqz v1, :cond_7

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_7
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->C:LN/u;

    .line 200
    .line 201
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    new-instance v1, Landroid/widget/EdgeEffect;

    .line 205
    .line 206
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    invoke-direct {v1, v7}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    .line 211
    .line 212
    .line 213
    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/widget/EdgeEffect;

    .line 214
    .line 215
    iget-boolean v7, p0, Landroidx/recyclerview/widget/RecyclerView;->j:Z

    .line 216
    .line 217
    if-eqz v7, :cond_8

    .line 218
    .line 219
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 224
    .line 225
    .line 226
    move-result v8

    .line 227
    sub-int/2addr v7, v8

    .line 228
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 229
    .line 230
    .line 231
    move-result v8

    .line 232
    sub-int/2addr v7, v8

    .line 233
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 234
    .line 235
    .line 236
    move-result v8

    .line 237
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 238
    .line 239
    .line 240
    move-result v9

    .line 241
    sub-int/2addr v8, v9

    .line 242
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 243
    .line 244
    .line 245
    move-result v9

    .line 246
    sub-int/2addr v8, v9

    .line 247
    invoke-virtual {v1, v7, v8}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 248
    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 252
    .line 253
    .line 254
    move-result v7

    .line 255
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 256
    .line 257
    .line 258
    move-result v8

    .line 259
    invoke-virtual {v1, v7, v8}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 260
    .line 261
    .line 262
    :goto_2
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/widget/EdgeEffect;

    .line 263
    .line 264
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 265
    .line 266
    .line 267
    move-result v7

    .line 268
    int-to-float v7, v7

    .line 269
    div-float v7, v2, v7

    .line 270
    .line 271
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 272
    .line 273
    .line 274
    move-result v8

    .line 275
    int-to-float v8, v8

    .line 276
    div-float/2addr p3, v8

    .line 277
    invoke-static {v1, v7, p3}, LD/d;->a(Landroid/widget/EdgeEffect;FF)V

    .line 278
    .line 279
    .line 280
    goto :goto_1

    .line 281
    :cond_9
    :goto_3
    if-gez v6, :cond_c

    .line 282
    .line 283
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    .line 284
    .line 285
    if-eqz p3, :cond_a

    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_a
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView;->C:LN/u;

    .line 289
    .line 290
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    new-instance p3, Landroid/widget/EdgeEffect;

    .line 294
    .line 295
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-direct {p3, v1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    .line 300
    .line 301
    .line 302
    iput-object p3, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    .line 303
    .line 304
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->j:Z

    .line 305
    .line 306
    if-eqz v1, :cond_b

    .line 307
    .line 308
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 313
    .line 314
    .line 315
    move-result v4

    .line 316
    sub-int/2addr v1, v4

    .line 317
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 318
    .line 319
    .line 320
    move-result v4

    .line 321
    sub-int/2addr v1, v4

    .line 322
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 323
    .line 324
    .line 325
    move-result v4

    .line 326
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 327
    .line 328
    .line 329
    move-result v6

    .line 330
    sub-int/2addr v4, v6

    .line 331
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 332
    .line 333
    .line 334
    move-result v6

    .line 335
    sub-int/2addr v4, v6

    .line 336
    invoke-virtual {p3, v1, v4}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 337
    .line 338
    .line 339
    goto :goto_4

    .line 340
    :cond_b
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 341
    .line 342
    .line 343
    move-result v1

    .line 344
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 345
    .line 346
    .line 347
    move-result v4

    .line 348
    invoke-virtual {p3, v1, v4}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 349
    .line 350
    .line 351
    :goto_4
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    .line 352
    .line 353
    neg-float v1, v2

    .line 354
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 355
    .line 356
    .line 357
    move-result v4

    .line 358
    int-to-float v4, v4

    .line 359
    div-float/2addr v1, v4

    .line 360
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 361
    .line 362
    .line 363
    move-result v4

    .line 364
    int-to-float v4, v4

    .line 365
    div-float/2addr v0, v4

    .line 366
    invoke-static {p3, v1, v0}, LD/d;->a(Landroid/widget/EdgeEffect;FF)V

    .line 367
    .line 368
    .line 369
    goto :goto_6

    .line 370
    :cond_c
    cmpl-float p3, v2, v5

    .line 371
    .line 372
    if-lez p3, :cond_f

    .line 373
    .line 374
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Landroid/widget/EdgeEffect;

    .line 375
    .line 376
    if-eqz p3, :cond_d

    .line 377
    .line 378
    goto :goto_5

    .line 379
    :cond_d
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView;->C:LN/u;

    .line 380
    .line 381
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    new-instance p3, Landroid/widget/EdgeEffect;

    .line 385
    .line 386
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    invoke-direct {p3, v1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    .line 391
    .line 392
    .line 393
    iput-object p3, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Landroid/widget/EdgeEffect;

    .line 394
    .line 395
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->j:Z

    .line 396
    .line 397
    if-eqz v1, :cond_e

    .line 398
    .line 399
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 400
    .line 401
    .line 402
    move-result v1

    .line 403
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 404
    .line 405
    .line 406
    move-result v6

    .line 407
    sub-int/2addr v1, v6

    .line 408
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 409
    .line 410
    .line 411
    move-result v6

    .line 412
    sub-int/2addr v1, v6

    .line 413
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 414
    .line 415
    .line 416
    move-result v6

    .line 417
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 418
    .line 419
    .line 420
    move-result v7

    .line 421
    sub-int/2addr v6, v7

    .line 422
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 423
    .line 424
    .line 425
    move-result v7

    .line 426
    sub-int/2addr v6, v7

    .line 427
    invoke-virtual {p3, v1, v6}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 428
    .line 429
    .line 430
    goto :goto_5

    .line 431
    :cond_e
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 432
    .line 433
    .line 434
    move-result v1

    .line 435
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 436
    .line 437
    .line 438
    move-result v6

    .line 439
    invoke-virtual {p3, v1, v6}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 440
    .line 441
    .line 442
    :goto_5
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Landroid/widget/EdgeEffect;

    .line 443
    .line 444
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 445
    .line 446
    .line 447
    move-result v1

    .line 448
    int-to-float v1, v1

    .line 449
    div-float v1, v2, v1

    .line 450
    .line 451
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 452
    .line 453
    .line 454
    move-result v6

    .line 455
    int-to-float v6, v6

    .line 456
    div-float/2addr v0, v6

    .line 457
    sub-float/2addr v4, v0

    .line 458
    invoke-static {p3, v1, v4}, LD/d;->a(Landroid/widget/EdgeEffect;FF)V

    .line 459
    .line 460
    .line 461
    goto :goto_6

    .line 462
    :cond_f
    move v3, v1

    .line 463
    :goto_6
    if-nez v3, :cond_10

    .line 464
    .line 465
    cmpl-float p3, v2, v5

    .line 466
    .line 467
    if-nez p3, :cond_10

    .line 468
    .line 469
    if-eqz p3, :cond_11

    .line 470
    .line 471
    :cond_10
    sget-object p3, Ly/x;->a:Ljava/lang/reflect/Field;

    .line 472
    .line 473
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 474
    .line 475
    .line 476
    :cond_11
    :goto_7
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->c(II)V

    .line 477
    .line 478
    .line 479
    :cond_12
    :goto_8
    invoke-virtual {p0}, Landroid/view/View;->awakenScrollBars()Z

    .line 480
    .line 481
    .line 482
    move-result p1

    .line 483
    if-nez p1, :cond_13

    .line 484
    .line 485
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 486
    .line 487
    .line 488
    :cond_13
    return-void
.end method

.method public final r(II)V
    .locals 13

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string p1, "RecyclerView"

    .line 6
    .line 7
    const-string p2, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."

    .line 8
    .line 9
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    goto/16 :goto_6

    .line 13
    .line 14
    :cond_0
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->u:Z

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    goto/16 :goto_6

    .line 19
    .line 20
    :cond_1
    invoke-virtual {v0}, LN/x;->b()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v1, 0x0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    move v5, p1

    .line 30
    :goto_0
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 31
    .line 32
    invoke-virtual {p1}, LN/x;->c()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-nez p1, :cond_3

    .line 37
    .line 38
    const/4 v6, 0x0

    .line 39
    goto :goto_1

    .line 40
    :cond_3
    move v6, p2

    .line 41
    :goto_1
    if-nez v5, :cond_4

    .line 42
    .line 43
    if-eqz v6, :cond_b

    .line 44
    .line 45
    :cond_4
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->V:LN/I;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-le p2, v0, :cond_5

    .line 59
    .line 60
    const/4 v2, 0x1

    .line 61
    goto :goto_2

    .line 62
    :cond_5
    const/4 v2, 0x0

    .line 63
    :goto_2
    int-to-double v3, v1

    .line 64
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 65
    .line 66
    .line 67
    move-result-wide v3

    .line 68
    double-to-int v3, v3

    .line 69
    mul-int v4, v5, v5

    .line 70
    .line 71
    mul-int v7, v6, v6

    .line 72
    .line 73
    add-int/2addr v7, v4

    .line 74
    int-to-double v7, v7

    .line 75
    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    .line 76
    .line 77
    .line 78
    move-result-wide v7

    .line 79
    double-to-int v4, v7

    .line 80
    iget-object v7, p1, LN/I;->k:Landroidx/recyclerview/widget/RecyclerView;

    .line 81
    .line 82
    if-eqz v2, :cond_6

    .line 83
    .line 84
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    goto :goto_3

    .line 89
    :cond_6
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    :goto_3
    div-int/lit8 v9, v8, 0x2

    .line 94
    .line 95
    int-to-float v4, v4

    .line 96
    const/high16 v10, 0x3f800000    # 1.0f

    .line 97
    .line 98
    mul-float v4, v4, v10

    .line 99
    .line 100
    int-to-float v8, v8

    .line 101
    div-float/2addr v4, v8

    .line 102
    invoke-static {v10, v4}, Ljava/lang/Math;->min(FF)F

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    int-to-float v9, v9

    .line 107
    const/high16 v11, 0x3f000000    # 0.5f

    .line 108
    .line 109
    sub-float/2addr v4, v11

    .line 110
    const v11, 0x3ef1463b

    .line 111
    .line 112
    .line 113
    mul-float v4, v4, v11

    .line 114
    .line 115
    float-to-double v11, v4

    .line 116
    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    .line 117
    .line 118
    .line 119
    move-result-wide v11

    .line 120
    double-to-float v4, v11

    .line 121
    mul-float v4, v4, v9

    .line 122
    .line 123
    add-float/2addr v4, v9

    .line 124
    if-lez v3, :cond_7

    .line 125
    .line 126
    int-to-float p2, v3

    .line 127
    div-float/2addr v4, p2

    .line 128
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    const/high16 v0, 0x447a0000    # 1000.0f

    .line 133
    .line 134
    mul-float p2, p2, v0

    .line 135
    .line 136
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    mul-int/lit8 p2, p2, 0x4

    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_7
    if-eqz v2, :cond_8

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_8
    move p2, v0

    .line 147
    :goto_4
    int-to-float p2, p2

    .line 148
    div-float/2addr p2, v8

    .line 149
    add-float/2addr p2, v10

    .line 150
    const/high16 v0, 0x43960000    # 300.0f

    .line 151
    .line 152
    mul-float p2, p2, v0

    .line 153
    .line 154
    float-to-int p2, p2

    .line 155
    :goto_5
    const/16 v0, 0x7d0

    .line 156
    .line 157
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    .line 158
    .line 159
    .line 160
    move-result p2

    .line 161
    iget-object v0, p1, LN/I;->h:Landroid/view/animation/Interpolator;

    .line 162
    .line 163
    sget-object v2, Landroidx/recyclerview/widget/RecyclerView;->p0:LN/r;

    .line 164
    .line 165
    if-eq v0, v2, :cond_9

    .line 166
    .line 167
    iput-object v2, p1, LN/I;->h:Landroid/view/animation/Interpolator;

    .line 168
    .line 169
    new-instance v0, Landroid/widget/OverScroller;

    .line 170
    .line 171
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    invoke-direct {v0, v3, v2}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    .line 176
    .line 177
    .line 178
    iput-object v0, p1, LN/I;->g:Landroid/widget/OverScroller;

    .line 179
    .line 180
    :cond_9
    const/4 v0, 0x2

    .line 181
    invoke-virtual {v7, v0}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 182
    .line 183
    .line 184
    iput v1, p1, LN/I;->f:I

    .line 185
    .line 186
    iput v1, p1, LN/I;->e:I

    .line 187
    .line 188
    iget-object v2, p1, LN/I;->g:Landroid/widget/OverScroller;

    .line 189
    .line 190
    const/4 v3, 0x0

    .line 191
    const/4 v4, 0x0

    .line 192
    move v7, p2

    .line 193
    invoke-virtual/range {v2 .. v7}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    .line 194
    .line 195
    .line 196
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 197
    .line 198
    const/16 v0, 0x17

    .line 199
    .line 200
    if-ge p2, v0, :cond_a

    .line 201
    .line 202
    iget-object p2, p1, LN/I;->g:Landroid/widget/OverScroller;

    .line 203
    .line 204
    invoke-virtual {p2}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    .line 205
    .line 206
    .line 207
    :cond_a
    invoke-virtual {p1}, LN/I;->a()V

    .line 208
    .line 209
    .line 210
    :cond_b
    :goto_6
    return-void
.end method

.method public final removeDetachedView(Landroid/view/View;Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->j(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->j(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->removeDetachedView(Landroid/view/View;Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final requestChildFocus(Landroid/view/View;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->A:I

    .line 7
    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    if-eqz p2, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->o(Landroid/view/View;Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p1

    .line 6
    move-object v3, p2

    .line 7
    move v4, p3

    .line 8
    invoke-virtual/range {v0 .. v5}, LN/x;->G(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final requestDisallowInterceptTouchEvent(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->o:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    check-cast v3, LN/h;

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final requestLayout()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->t:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->u:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final s(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Ly/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Ly/g;->h(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final scrollBy(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string p1, "RecyclerView"

    .line 6
    .line 7
    const-string p2, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."

    .line 8
    .line 9
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->u:Z

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    invoke-virtual {v0}, LN/x;->b()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 23
    .line 24
    invoke-virtual {v1}, LN/x;->c()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    if-eqz v1, :cond_5

    .line 31
    .line 32
    :cond_2
    const/4 v2, 0x0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    const/4 p1, 0x0

    .line 37
    :goto_0
    if-eqz v1, :cond_4

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_4
    const/4 p2, 0x0

    .line 41
    :goto_1
    const/4 v0, 0x0

    .line 42
    invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->q(IILandroid/view/MotionEvent;)V

    .line 43
    .line 44
    .line 45
    :cond_5
    return-void
.end method

.method public final scrollTo(II)V
    .locals 0

    .line 1
    const-string p1, "RecyclerView"

    .line 2
    .line 3
    const-string p2, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead"

    .line 4
    .line 5
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->A:I

    .line 2
    .line 3
    if-lez v0, :cond_2

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getContentChangeTypes()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    if-nez p1, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    move v0, p1

    .line 18
    :goto_1
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->w:I

    .line 19
    .line 20
    or-int/2addr p1, v0

    .line 21
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->w:I

    .line 22
    .line 23
    return-void

    .line 24
    :cond_2
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public setAccessibilityDelegateCompat(LN/K;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:LN/K;

    .line 2
    .line 3
    invoke-static {p0, p1}, Ly/x;->a(Landroid/view/ViewGroup;Ly/b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setAdapter(LN/s;)V
    .locals 4

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutFrozen(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->H:LN/v;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, LN/v;->a()V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->e:LN/D;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, LN/x;->E()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, LN/x;->F(LN/D;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object v0, v1, LN/D;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, LN/D;->c()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->g:LN/b;

    .line 37
    .line 38
    iget-object v2, v0, LN/b;->f:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v0, v2}, LN/b;->M(Ljava/util/ArrayList;)V

    .line 43
    .line 44
    .line 45
    iget-object v2, v0, LN/b;->h:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {v0, v2}, LN/b;->M(Ljava/util/ArrayList;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, v1, LN/D;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, LN/D;->c()V

    .line 60
    .line 61
    .line 62
    iget-object v0, v1, LN/D;->e:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, LN/C;

    .line 65
    .line 66
    if-nez v0, :cond_2

    .line 67
    .line 68
    new-instance v0, LN/C;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    new-instance v2, Landroid/util/SparseArray;

    .line 74
    .line 75
    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object v2, v0, LN/C;->a:Landroid/util/SparseArray;

    .line 79
    .line 80
    iput p1, v0, LN/C;->b:I

    .line 81
    .line 82
    iput-object v0, v1, LN/D;->e:Ljava/lang/Object;

    .line 83
    .line 84
    :cond_2
    iget-object v0, v1, LN/D;->e:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, LN/C;

    .line 87
    .line 88
    iget v2, v0, LN/C;->b:I

    .line 89
    .line 90
    if-nez v2, :cond_4

    .line 91
    .line 92
    iget-object v0, v0, LN/C;->a:Landroid/util/SparseArray;

    .line 93
    .line 94
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-gtz v2, :cond_3

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    check-cast p1, LN/B;

    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    const/4 p1, 0x0

    .line 111
    throw p1

    .line 112
    :cond_4
    :goto_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:LN/G;

    .line 113
    .line 114
    const/4 v2, 0x1

    .line 115
    iput-boolean v2, v0, LN/G;->b:Z

    .line 116
    .line 117
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->z:Z

    .line 118
    .line 119
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->z:Z

    .line 120
    .line 121
    iput-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->y:Z

    .line 122
    .line 123
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->h:LN/b;

    .line 124
    .line 125
    invoke-virtual {v0}, LN/b;->B()I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    const/4 v2, 0x0

    .line 130
    :goto_1
    if-ge v2, v0, :cond_5

    .line 131
    .line 132
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->h:LN/b;

    .line 133
    .line 134
    invoke-virtual {v3, v2}, LN/b;->A(I)Landroid/view/View;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->j(Landroid/view/View;)V

    .line 139
    .line 140
    .line 141
    add-int/lit8 v2, v2, 0x1

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->m()V

    .line 145
    .line 146
    .line 147
    iget-object v0, v1, LN/D;->d:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    :goto_2
    if-ge p1, v2, :cond_7

    .line 156
    .line 157
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    if-nez v3, :cond_6

    .line 162
    .line 163
    add-int/lit8 p1, p1, 0x1

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_6
    new-instance p1, Ljava/lang/ClassCastException;

    .line 167
    .line 168
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 169
    .line 170
    .line 171
    throw p1

    .line 172
    :cond_7
    iget-object p1, v1, LN/D;->f:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 175
    .line 176
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1}, LN/D;->c()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 183
    .line 184
    .line 185
    return-void
.end method

.method public setChildDrawingOrderCallback(LN/t;)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const/4 p1, 0x0

    .line 5
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setChildrenDrawingOrderEnabled(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setClipToPadding(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->j:Z

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Landroid/widget/EdgeEffect;

    .line 7
    .line 8
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    .line 9
    .line 10
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/widget/EdgeEffect;

    .line 11
    .line 12
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Landroid/widget/EdgeEffect;

    .line 13
    .line 14
    :cond_0
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->j:Z

    .line 15
    .line 16
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 17
    .line 18
    .line 19
    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Z

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public setEdgeEffectFactory(LN/u;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->C:LN/u;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Landroid/widget/EdgeEffect;

    .line 8
    .line 9
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    .line 10
    .line 11
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/widget/EdgeEffect;

    .line 12
    .line 13
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Landroid/widget/EdgeEffect;

    .line 14
    .line 15
    return-void
.end method

.method public setHasFixedSize(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->r:Z

    .line 2
    .line 3
    return-void
.end method

.method public setItemAnimator(LN/v;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->H:LN/v;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, LN/v;->a()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->H:LN/v;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-object v1, v0, LN/v;->a:LH/a;

    .line 12
    .line 13
    :cond_0
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->H:LN/v;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:LH/a;

    .line 18
    .line 19
    iput-object v0, p1, LN/v;->a:LH/a;

    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method public setItemViewCacheSize(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e:LN/D;

    .line 2
    .line 3
    iput p1, v0, LN/D;->a:I

    .line 4
    .line 5
    invoke-virtual {v0}, LN/D;->e()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setLayoutFrozen(Z)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->u:Z

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    .line 5
    const-string v0, "Do not setLayoutFrozen in layout or scroll"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->u:Z

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    const/4 v5, 0x3

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v7, 0x0

    .line 23
    const/4 v8, 0x0

    .line 24
    move-wide v1, v3

    .line 25
    invoke-static/range {v1 .. v8}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->u:Z

    .line 34
    .line 35
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->v:Z

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->V:LN/I;

    .line 41
    .line 42
    iget-object v0, p1, LN/I;->k:Landroidx/recyclerview/widget/RecyclerView;

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 45
    .line 46
    .line 47
    iget-object p1, p1, LN/I;->g:Landroid/widget/OverScroller;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 50
    .line 51
    .line 52
    :cond_1
    :goto_0
    return-void
.end method

.method public setLayoutManager(LN/x;)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->V:LN/I;

    .line 11
    .line 12
    iget-object v2, v1, LN/I;->k:Landroidx/recyclerview/widget/RecyclerView;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    iget-object v1, v1, LN/I;->g:Landroid/widget/OverScroller;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 23
    .line 24
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->e:LN/D;

    .line 25
    .line 26
    if-eqz v1, :cond_3

    .line 27
    .line 28
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->H:LN/v;

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {v1}, LN/v;->a()V

    .line 33
    .line 34
    .line 35
    :cond_1
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 36
    .line 37
    invoke-virtual {v1}, LN/x;->E()V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 41
    .line 42
    invoke-virtual {v1, v2}, LN/x;->F(LN/D;)V

    .line 43
    .line 44
    .line 45
    iget-object v1, v2, LN/D;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, LN/D;->c()V

    .line 53
    .line 54
    .line 55
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->q:Z

    .line 56
    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 60
    .line 61
    iput-boolean v0, v1, LN/x;->e:Z

    .line 62
    .line 63
    invoke-virtual {v1, p0}, LN/x;->z(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    invoke-virtual {v1, v3}, LN/x;->I(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 70
    .line 71
    .line 72
    iput-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    iget-object v1, v2, LN/D;->c:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, LN/D;->c()V

    .line 83
    .line 84
    .line 85
    :goto_0
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->h:LN/b;

    .line 86
    .line 87
    iget-object v3, v1, LN/b;->h:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v3, LN/c;

    .line 90
    .line 91
    invoke-virtual {v3}, LN/c;->c()V

    .line 92
    .line 93
    .line 94
    iget-object v3, v1, LN/b;->f:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v3, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    const/4 v5, 0x1

    .line 103
    sub-int/2addr v4, v5

    .line 104
    :goto_1
    iget-object v6, v1, LN/b;->g:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v6, LD/j;

    .line 107
    .line 108
    if-ltz v4, :cond_4

    .line 109
    .line 110
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    check-cast v6, Landroid/view/View;

    .line 115
    .line 116
    invoke-static {v6}, Landroidx/recyclerview/widget/RecyclerView;->j(Landroid/view/View;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    add-int/lit8 v4, v4, -0x1

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    iget-object v1, v6, LD/j;->f:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 128
    .line 129
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    :goto_2
    if-ge v0, v3, :cond_5

    .line 134
    .line 135
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-static {v4}, Landroidx/recyclerview/widget/RecyclerView;->j(Landroid/view/View;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v4}, Landroid/view/View;->clearAnimation()V

    .line 143
    .line 144
    .line 145
    add-int/lit8 v0, v0, 0x1

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_5
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 149
    .line 150
    .line 151
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 152
    .line 153
    if-eqz p1, :cond_7

    .line 154
    .line 155
    iget-object v0, p1, LN/x;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 156
    .line 157
    if-nez v0, :cond_6

    .line 158
    .line 159
    invoke-virtual {p1, p0}, LN/x;->I(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 160
    .line 161
    .line 162
    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->q:Z

    .line 163
    .line 164
    if-eqz p1, :cond_7

    .line 165
    .line 166
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 167
    .line 168
    iput-boolean v5, p1, LN/x;->e:Z

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 172
    .line 173
    new-instance v1, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    const-string v2, "LayoutManager "

    .line 176
    .line 177
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    const-string v2, " is already attached to a RecyclerView:"

    .line 184
    .line 185
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    iget-object p1, p1, LN/x;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 189
    .line 190
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->h()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    throw v0

    .line 205
    :cond_7
    :goto_3
    invoke-virtual {v2}, LN/D;->e()V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 209
    .line 210
    .line 211
    return-void
.end method

.method public setNestedScrollingEnabled(Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Ly/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v1, v0, Ly/g;->d:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    sget-object v1, Ly/x;->a:Ljava/lang/reflect/Field;

    .line 10
    .line 11
    iget-object v1, v0, Ly/g;->c:Landroid/view/ViewGroup;

    .line 12
    .line 13
    invoke-static {v1}, Ly/p;->z(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iput-boolean p1, v0, Ly/g;->d:Z

    .line 17
    .line 18
    return-void
.end method

.method public setOnFlingListener(LN/z;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setOnScrollListener(LN/A;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    return-void
.end method

.method public setPreserveFocusAfterLayout(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->U:Z

    .line 2
    .line 3
    return-void
.end method

.method public setRecycledViewPool(LN/C;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e:LN/D;

    .line 2
    .line 3
    iget-object v1, v0, LN/D;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, LN/C;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget v2, v1, LN/C;->b:I

    .line 10
    .line 11
    add-int/lit8 v2, v2, -0x1

    .line 12
    .line 13
    iput v2, v1, LN/C;->b:I

    .line 14
    .line 15
    :cond_0
    iput-object p1, v0, LN/D;->e:Ljava/lang/Object;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iget-object p1, v0, LN/D;->f:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()LN/s;

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public setRecyclerListener(LN/E;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setScrollState(I)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->I:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->I:I

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    if-eq p1, v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->V:LN/I;

    .line 12
    .line 13
    iget-object v1, v0, LN/I;->k:Landroidx/recyclerview/widget/RecyclerView;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, LN/I;->g:Landroid/widget/OverScroller;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {v0, p1}, LN/x;->D(I)V

    .line 28
    .line 29
    .line 30
    :cond_2
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:Ljava/util/ArrayList;

    .line 31
    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    add-int/lit8 p1, p1, -0x1

    .line 39
    .line 40
    :goto_0
    if-ltz p1, :cond_3

    .line 41
    .line 42
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, LN/A;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    add-int/lit8 p1, p1, -0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    return-void
.end method

.method public setScrollingTouchSlop(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq p1, v1, :cond_0

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v2, "setScrollingTouchSlop(): bad argument constant "

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p1, "; using default value"

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v1, "RecyclerView"

    .line 34
    .line 35
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledPagingTouchSlop()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->P:I

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    :goto_0
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->P:I

    .line 51
    .line 52
    :goto_1
    return-void
.end method

.method public setViewCacheExtension(LN/H;)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->e:LN/D;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final startNestedScroll(I)Z
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Ly/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, v1}, Ly/g;->g(II)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public final stopNestedScroll()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Ly/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Ly/g;->h(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
