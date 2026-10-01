.class public abstract Lj/A;
.super Landroid/widget/ListView;
.source "SourceFile"


# instance fields
.field public final e:Landroid/graphics/Rect;

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public final k:Ljava/lang/reflect/Field;

.field public l:Lj/z;

.field public m:Z

.field public final n:Z

.field public o:Z

.field public p:LD/g;

.field public q:LD/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const v1, 0x7f030086

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1, v0, v1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    .line 7
    .line 8
    new-instance p1, Landroid/graphics/Rect;

    .line 9
    .line 10
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lj/A;->e:Landroid/graphics/Rect;

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput p1, p0, Lj/A;->f:I

    .line 17
    .line 18
    iput p1, p0, Lj/A;->g:I

    .line 19
    .line 20
    iput p1, p0, Lj/A;->h:I

    .line 21
    .line 22
    iput p1, p0, Lj/A;->i:I

    .line 23
    .line 24
    iput-boolean p2, p0, Lj/A;->n:Z

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Landroid/widget/AbsListView;->setCacheColorHint(I)V

    .line 27
    .line 28
    .line 29
    :try_start_0
    const-class p1, Landroid/widget/AbsListView;

    .line 30
    .line 31
    const-string p2, "mIsChildViewEnabled"

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lj/A;->k:Ljava/lang/reflect/Field;

    .line 38
    .line 39
    const/4 p2, 0x1

    .line 40
    invoke-virtual {p1, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catch_0
    move-exception p1

    .line 45
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 46
    .line 47
    .line 48
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(II)I
    .locals 11

    .line 1
    invoke-virtual {p0}, Landroid/widget/AbsListView;->getListPaddingTop()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/widget/AbsListView;->getListPaddingBottom()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Landroid/widget/AbsListView;->getListPaddingLeft()I

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/widget/AbsListView;->getListPaddingRight()I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/widget/ListView;->getDividerHeight()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {p0}, Landroid/widget/ListView;->getDivider()Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {p0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    if-nez v4, :cond_0

    .line 28
    .line 29
    add-int/2addr v0, v1

    .line 30
    return v0

    .line 31
    :cond_0
    add-int/2addr v0, v1

    .line 32
    const/4 v1, 0x0

    .line 33
    if-lez v2, :cond_1

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v2, 0x0

    .line 39
    :goto_0
    invoke-interface {v4}, Landroid/widget/Adapter;->getCount()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    const/4 v5, 0x0

    .line 44
    move-object v8, v5

    .line 45
    const/4 v6, 0x0

    .line 46
    const/4 v7, 0x0

    .line 47
    :goto_1
    if-ge v6, v3, :cond_7

    .line 48
    .line 49
    invoke-interface {v4, v6}, Landroid/widget/Adapter;->getItemViewType(I)I

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    if-eq v9, v7, :cond_2

    .line 54
    .line 55
    move-object v8, v5

    .line 56
    move v7, v9

    .line 57
    :cond_2
    invoke-interface {v4, v6, v8, p0}, Landroid/widget/Adapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    if-nez v9, :cond_3

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/view/ViewGroup;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    invoke-virtual {v8, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 72
    .line 73
    .line 74
    :cond_3
    iget v9, v9, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 75
    .line 76
    if-lez v9, :cond_4

    .line 77
    .line 78
    const/high16 v10, 0x40000000    # 2.0f

    .line 79
    .line 80
    invoke-static {v9, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    goto :goto_2

    .line 85
    :cond_4
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 86
    .line 87
    .line 88
    move-result v9

    .line 89
    :goto_2
    invoke-virtual {v8, p1, v9}, Landroid/view/View;->measure(II)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v8}, Landroid/view/View;->forceLayout()V

    .line 93
    .line 94
    .line 95
    if-lez v6, :cond_5

    .line 96
    .line 97
    add-int/2addr v0, v2

    .line 98
    :cond_5
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    add-int/2addr v0, v9

    .line 103
    if-lt v0, p2, :cond_6

    .line 104
    .line 105
    return p2

    .line 106
    :cond_6
    add-int/lit8 v6, v6, 0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_7
    return v0
.end method

.method public final b(ILandroid/view/MotionEvent;)Z
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    if-eq v3, v4, :cond_2

    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    if-eq v3, v0, :cond_1

    .line 15
    .line 16
    const/4 v0, 0x3

    .line 17
    if-eq v3, v0, :cond_0

    .line 18
    .line 19
    :goto_0
    const/4 v6, 0x1

    .line 20
    goto/16 :goto_7

    .line 21
    .line 22
    :cond_0
    :goto_1
    const/4 v6, 0x0

    .line 23
    goto/16 :goto_7

    .line 24
    .line 25
    :cond_1
    move/from16 v0, p1

    .line 26
    .line 27
    const/4 v6, 0x1

    .line 28
    goto :goto_2

    .line 29
    :cond_2
    move/from16 v0, p1

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    :goto_2
    invoke-virtual {v2, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-gez v0, :cond_3

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    invoke-virtual {v2, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    float-to-int v7, v7

    .line 44
    invoke-virtual {v2, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    float-to-int v0, v0

    .line 49
    invoke-virtual {v1, v7, v0}, Landroid/widget/AbsListView;->pointToPosition(II)I

    .line 50
    .line 51
    .line 52
    move-result v8

    .line 53
    const/4 v9, -0x1

    .line 54
    if-ne v8, v9, :cond_4

    .line 55
    .line 56
    const/4 v5, 0x1

    .line 57
    goto/16 :goto_7

    .line 58
    .line 59
    :cond_4
    invoke-virtual/range {p0 .. p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    sub-int v6, v8, v6

    .line 64
    .line 65
    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    int-to-float v7, v7

    .line 70
    int-to-float v10, v0

    .line 71
    iput-boolean v4, v1, Lj/A;->o:Z

    .line 72
    .line 73
    invoke-virtual {v1, v7, v10}, Landroid/view/View;->drawableHotspotChanged(FF)V

    .line 74
    .line 75
    .line 76
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isPressed()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_5

    .line 81
    .line 82
    invoke-virtual {v1, v4}, Landroid/view/View;->setPressed(Z)V

    .line 83
    .line 84
    .line 85
    :cond_5
    invoke-virtual/range {p0 .. p0}, Landroid/widget/AbsListView;->layoutChildren()V

    .line 86
    .line 87
    .line 88
    iget v0, v1, Lj/A;->j:I

    .line 89
    .line 90
    if-eq v0, v9, :cond_6

    .line 91
    .line 92
    invoke-virtual/range {p0 .. p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 93
    .line 94
    .line 95
    move-result v11

    .line 96
    sub-int/2addr v0, v11

    .line 97
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    if-eqz v0, :cond_6

    .line 102
    .line 103
    if-eq v0, v6, :cond_6

    .line 104
    .line 105
    invoke-virtual {v0}, Landroid/view/View;->isPressed()Z

    .line 106
    .line 107
    .line 108
    move-result v11

    .line 109
    if-eqz v11, :cond_6

    .line 110
    .line 111
    invoke-virtual {v0, v5}, Landroid/view/View;->setPressed(Z)V

    .line 112
    .line 113
    .line 114
    :cond_6
    iput v8, v1, Lj/A;->j:I

    .line 115
    .line 116
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    int-to-float v0, v0

    .line 121
    sub-float v0, v7, v0

    .line 122
    .line 123
    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    .line 124
    .line 125
    .line 126
    move-result v11

    .line 127
    int-to-float v11, v11

    .line 128
    sub-float v11, v10, v11

    .line 129
    .line 130
    invoke-virtual {v6, v0, v11}, Landroid/view/View;->drawableHotspotChanged(FF)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v6}, Landroid/view/View;->isPressed()Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-nez v0, :cond_7

    .line 138
    .line 139
    invoke-virtual {v6, v4}, Landroid/view/View;->setPressed(Z)V

    .line 140
    .line 141
    .line 142
    :cond_7
    invoke-virtual/range {p0 .. p0}, Landroid/widget/AbsListView;->getSelector()Landroid/graphics/drawable/Drawable;

    .line 143
    .line 144
    .line 145
    move-result-object v11

    .line 146
    if-eqz v11, :cond_8

    .line 147
    .line 148
    if-eq v8, v9, :cond_8

    .line 149
    .line 150
    const/4 v12, 0x1

    .line 151
    goto :goto_3

    .line 152
    :cond_8
    const/4 v12, 0x0

    .line 153
    :goto_3
    if-eqz v12, :cond_9

    .line 154
    .line 155
    invoke-virtual {v11, v5, v5}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 156
    .line 157
    .line 158
    :cond_9
    iget-object v0, v1, Lj/A;->k:Ljava/lang/reflect/Field;

    .line 159
    .line 160
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    .line 161
    .line 162
    .line 163
    move-result v13

    .line 164
    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    .line 165
    .line 166
    .line 167
    move-result v14

    .line 168
    invoke-virtual {v6}, Landroid/view/View;->getRight()I

    .line 169
    .line 170
    .line 171
    move-result v15

    .line 172
    invoke-virtual {v6}, Landroid/view/View;->getBottom()I

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    iget-object v9, v1, Lj/A;->e:Landroid/graphics/Rect;

    .line 177
    .line 178
    invoke-virtual {v9, v13, v14, v15, v5}, Landroid/graphics/Rect;->set(IIII)V

    .line 179
    .line 180
    .line 181
    iget v5, v9, Landroid/graphics/Rect;->left:I

    .line 182
    .line 183
    iget v13, v1, Lj/A;->f:I

    .line 184
    .line 185
    sub-int/2addr v5, v13

    .line 186
    iput v5, v9, Landroid/graphics/Rect;->left:I

    .line 187
    .line 188
    iget v5, v9, Landroid/graphics/Rect;->top:I

    .line 189
    .line 190
    iget v13, v1, Lj/A;->g:I

    .line 191
    .line 192
    sub-int/2addr v5, v13

    .line 193
    iput v5, v9, Landroid/graphics/Rect;->top:I

    .line 194
    .line 195
    iget v5, v9, Landroid/graphics/Rect;->right:I

    .line 196
    .line 197
    iget v13, v1, Lj/A;->h:I

    .line 198
    .line 199
    add-int/2addr v5, v13

    .line 200
    iput v5, v9, Landroid/graphics/Rect;->right:I

    .line 201
    .line 202
    iget v5, v9, Landroid/graphics/Rect;->bottom:I

    .line 203
    .line 204
    iget v13, v1, Lj/A;->i:I

    .line 205
    .line 206
    add-int/2addr v5, v13

    .line 207
    iput v5, v9, Landroid/graphics/Rect;->bottom:I

    .line 208
    .line 209
    :try_start_0
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v5

    .line 213
    invoke-virtual {v6}, Landroid/view/View;->isEnabled()Z

    .line 214
    .line 215
    .line 216
    move-result v13

    .line 217
    if-eq v13, v5, :cond_a

    .line 218
    .line 219
    xor-int/2addr v5, v4

    .line 220
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    invoke-virtual {v0, v1, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    const/4 v5, -0x1

    .line 228
    if-eq v8, v5, :cond_a

    .line 229
    .line 230
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->refreshDrawableState()V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 231
    .line 232
    .line 233
    goto :goto_4

    .line 234
    :catch_0
    move-exception v0

    .line 235
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 236
    .line 237
    .line 238
    :cond_a
    :goto_4
    if-eqz v12, :cond_c

    .line 239
    .line 240
    invoke-virtual {v9}, Landroid/graphics/Rect;->exactCenterX()F

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    invoke-virtual {v9}, Landroid/graphics/Rect;->exactCenterY()F

    .line 245
    .line 246
    .line 247
    move-result v5

    .line 248
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getVisibility()I

    .line 249
    .line 250
    .line 251
    move-result v9

    .line 252
    if-nez v9, :cond_b

    .line 253
    .line 254
    const/4 v9, 0x1

    .line 255
    :goto_5
    const/4 v12, 0x0

    .line 256
    goto :goto_6

    .line 257
    :cond_b
    const/4 v9, 0x0

    .line 258
    goto :goto_5

    .line 259
    :goto_6
    invoke-virtual {v11, v9, v12}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 260
    .line 261
    .line 262
    invoke-static {v11, v0, v5}, Ls/a;->e(Landroid/graphics/drawable/Drawable;FF)V

    .line 263
    .line 264
    .line 265
    :cond_c
    invoke-virtual/range {p0 .. p0}, Landroid/widget/AbsListView;->getSelector()Landroid/graphics/drawable/Drawable;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    if-eqz v0, :cond_d

    .line 270
    .line 271
    const/4 v5, -0x1

    .line 272
    if-eq v8, v5, :cond_d

    .line 273
    .line 274
    invoke-static {v0, v7, v10}, Ls/a;->e(Landroid/graphics/drawable/Drawable;FF)V

    .line 275
    .line 276
    .line 277
    :cond_d
    iget-object v0, v1, Lj/A;->l:Lj/z;

    .line 278
    .line 279
    if-eqz v0, :cond_e

    .line 280
    .line 281
    const/4 v5, 0x0

    .line 282
    iput-boolean v5, v0, Lj/z;->f:Z

    .line 283
    .line 284
    :cond_e
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->refreshDrawableState()V

    .line 285
    .line 286
    .line 287
    if-ne v3, v4, :cond_f

    .line 288
    .line 289
    invoke-virtual {v1, v8}, Landroid/widget/AdapterView;->getItemIdAtPosition(I)J

    .line 290
    .line 291
    .line 292
    move-result-wide v9

    .line 293
    invoke-virtual {v1, v6, v8, v9, v10}, Landroid/widget/AdapterView;->performItemClick(Landroid/view/View;IJ)Z

    .line 294
    .line 295
    .line 296
    :cond_f
    const/4 v5, 0x0

    .line 297
    goto/16 :goto_0

    .line 298
    .line 299
    :goto_7
    if-eqz v6, :cond_10

    .line 300
    .line 301
    if-eqz v5, :cond_11

    .line 302
    .line 303
    :cond_10
    const/4 v3, 0x0

    .line 304
    iput-boolean v3, v1, Lj/A;->o:Z

    .line 305
    .line 306
    invoke-virtual {v1, v3}, Landroid/view/View;->setPressed(Z)V

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {p0 .. p0}, Lj/A;->drawableStateChanged()V

    .line 310
    .line 311
    .line 312
    iget v0, v1, Lj/A;->j:I

    .line 313
    .line 314
    invoke-virtual/range {p0 .. p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 315
    .line 316
    .line 317
    move-result v5

    .line 318
    sub-int/2addr v0, v5

    .line 319
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    if-eqz v0, :cond_11

    .line 324
    .line 325
    invoke-virtual {v0, v3}, Landroid/view/View;->setPressed(Z)V

    .line 326
    .line 327
    .line 328
    :cond_11
    if-eqz v6, :cond_13

    .line 329
    .line 330
    iget-object v0, v1, Lj/A;->p:LD/g;

    .line 331
    .line 332
    if-nez v0, :cond_12

    .line 333
    .line 334
    new-instance v0, LD/g;

    .line 335
    .line 336
    invoke-direct {v0, v1}, LD/g;-><init>(Lj/A;)V

    .line 337
    .line 338
    .line 339
    iput-object v0, v1, Lj/A;->p:LD/g;

    .line 340
    .line 341
    :cond_12
    iget-object v0, v1, Lj/A;->p:LD/g;

    .line 342
    .line 343
    iget-boolean v3, v0, LD/g;->p:Z

    .line 344
    .line 345
    iput-boolean v4, v0, LD/g;->p:Z

    .line 346
    .line 347
    invoke-virtual {v0, v1, v2}, LD/g;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 348
    .line 349
    .line 350
    goto :goto_8

    .line 351
    :cond_13
    iget-object v0, v1, Lj/A;->p:LD/g;

    .line 352
    .line 353
    if-eqz v0, :cond_15

    .line 354
    .line 355
    iget-boolean v2, v0, LD/g;->p:Z

    .line 356
    .line 357
    if-eqz v2, :cond_14

    .line 358
    .line 359
    invoke-virtual {v0}, LD/g;->d()V

    .line 360
    .line 361
    .line 362
    :cond_14
    const/4 v2, 0x0

    .line 363
    iput-boolean v2, v0, LD/g;->p:Z

    .line 364
    .line 365
    :cond_15
    :goto_8
    return v6
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lj/A;->e:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/widget/AbsListView;->getSelector()Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ListView;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final drawableStateChanged()V
    .locals 2

    .line 1
    iget-object v0, p0, Lj/A;->q:LD/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-super {p0}, Landroid/widget/ListView;->drawableStateChanged()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lj/A;->l:Lj/z;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    iput-boolean v1, v0, Lj/z;->f:Z

    .line 15
    .line 16
    :cond_1
    invoke-virtual {p0}, Landroid/widget/AbsListView;->getSelector()Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    iget-boolean v1, p0, Lj/A;->o:Z

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->isPressed()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 37
    .line 38
    .line 39
    :cond_2
    return-void
.end method

.method public final hasFocus()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lj/A;->n:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-super {p0}, Landroid/widget/ListView;->hasFocus()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    :goto_1
    return v0
.end method

.method public final hasWindowFocus()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lj/A;->n:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-super {p0}, Landroid/widget/ListView;->hasWindowFocus()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    :goto_1
    return v0
.end method

.method public final isFocused()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lj/A;->n:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-super {p0}, Landroid/widget/ListView;->isFocused()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    :goto_1
    return v0
.end method

.method public final isInTouchMode()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lj/A;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lj/A;->m:Z

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    :cond_0
    invoke-super {p0}, Landroid/widget/ListView;->isInTouchMode()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    :cond_1
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_2
    const/4 v0, 0x0

    .line 18
    :goto_0
    return v0
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lj/A;->q:LD/b;

    .line 3
    .line 4
    invoke-super {p0}, Landroid/widget/ListView;->onDetachedFromWindow()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/widget/ListView;->onHoverEvent(Landroid/view/MotionEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/16 v1, 0xa

    .line 17
    .line 18
    if-ne v0, v1, :cond_1

    .line 19
    .line 20
    iget-object v1, p0, Lj/A;->q:LD/b;

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    new-instance v1, LD/b;

    .line 25
    .line 26
    const/4 v2, 0x5

    .line 27
    invoke-direct {v1, v2, p0}, LD/b;-><init>(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lj/A;->q:LD/b;

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-super {p0, p1}, Landroid/widget/ListView;->onHoverEvent(Landroid/view/MotionEvent;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const/16 v2, 0x9

    .line 40
    .line 41
    const/4 v3, -0x1

    .line 42
    if-eq v0, v2, :cond_3

    .line 43
    .line 44
    const/4 v2, 0x7

    .line 45
    if-ne v0, v2, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-virtual {p0, v3}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    float-to-int v0, v0

    .line 57
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    float-to-int p1, p1

    .line 62
    invoke-virtual {p0, v0, p1}, Landroid/widget/AbsListView;->pointToPosition(II)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eq p1, v3, :cond_5

    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eq p1, v0, :cond_5

    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    sub-int v0, p1, v0

    .line 79
    .line 80
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_4

    .line 89
    .line 90
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    sub-int/2addr v0, v2

    .line 99
    invoke-virtual {p0, p1, v0}, Landroid/widget/AbsListView;->setSelectionFromTop(II)V

    .line 100
    .line 101
    .line 102
    :cond_4
    invoke-virtual {p0}, Landroid/widget/AbsListView;->getSelector()Landroid/graphics/drawable/Drawable;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-eqz p1, :cond_5

    .line 107
    .line 108
    iget-boolean v0, p0, Lj/A;->o:Z

    .line 109
    .line 110
    if-eqz v0, :cond_5

    .line 111
    .line 112
    invoke-virtual {p0}, Landroid/view/View;->isPressed()Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_5

    .line 117
    .line 118
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 123
    .line 124
    .line 125
    :cond_5
    :goto_1
    return v1
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    float-to-int v0, v0

    .line 13
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    float-to-int v1, v1

    .line 18
    invoke-virtual {p0, v0, v1}, Landroid/widget/AbsListView;->pointToPosition(II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iput v0, p0, Lj/A;->j:I

    .line 23
    .line 24
    :goto_0
    iget-object v0, p0, Lj/A;->q:LD/b;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v1, v0, LD/b;->f:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lj/A;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    iput-object v2, v1, Lj/A;->q:LD/b;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-super {p0, p1}, Landroid/widget/ListView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    return p1
.end method

.method public setListSelectionHidden(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lj/A;->m:Z

    .line 2
    .line 3
    return-void
.end method

.method public setSelector(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    new-instance v1, Lj/z;

    .line 5
    .line 6
    invoke-direct {v1}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v2, v1, Lj/z;->e:Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iput-object p1, v1, Lj/z;->e:Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    iput-boolean v0, v1, Lj/z;->f:Z

    .line 23
    .line 24
    move-object v0, v1

    .line 25
    :cond_1
    iput-object v0, p0, Lj/A;->l:Lj/z;

    .line 26
    .line 27
    invoke-super {p0, v0}, Landroid/widget/ListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Landroid/graphics/Rect;

    .line 31
    .line 32
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 33
    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 38
    .line 39
    .line 40
    :cond_2
    iget p1, v0, Landroid/graphics/Rect;->left:I

    .line 41
    .line 42
    iput p1, p0, Lj/A;->f:I

    .line 43
    .line 44
    iget p1, v0, Landroid/graphics/Rect;->top:I

    .line 45
    .line 46
    iput p1, p0, Lj/A;->g:I

    .line 47
    .line 48
    iget p1, v0, Landroid/graphics/Rect;->right:I

    .line 49
    .line 50
    iput p1, p0, Lj/A;->h:I

    .line 51
    .line 52
    iget p1, v0, Landroid/graphics/Rect;->bottom:I

    .line 53
    .line 54
    iput p1, p0, Lj/A;->i:I

    .line 55
    .line 56
    return-void
.end method
