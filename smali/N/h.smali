.class public final LN/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final x:[I

.field public static final y:[I


# instance fields
.field public final a:I

.field public final b:Landroid/graphics/drawable/StateListDrawable;

.field public final c:Landroid/graphics/drawable/Drawable;

.field public final d:I

.field public final e:I

.field public final f:Landroid/graphics/drawable/StateListDrawable;

.field public final g:Landroid/graphics/drawable/Drawable;

.field public final h:I

.field public final i:I

.field public j:F

.field public k:F

.field public l:I

.field public m:I

.field public final n:Landroidx/recyclerview/widget/RecyclerView;

.field public final o:Z

.field public final p:Z

.field public q:I

.field public r:I

.field public final s:[I

.field public final t:[I

.field public final u:Landroid/animation/ValueAnimator;

.field public v:I

.field public final w:LD/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const v0, 0x10100a7

    .line 2
    .line 3
    .line 4
    filled-new-array {v0}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, LN/h;->x:[I

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    new-array v0, v0, [I

    .line 12
    .line 13
    sput-object v0, LN/h;->y:[I

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;III)V
    .locals 6

    .line 1
    const/4 p7, 0x1

    .line 2
    const/4 v0, 0x2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput v1, p0, LN/h;->l:I

    .line 8
    .line 9
    iput v1, p0, LN/h;->m:I

    .line 10
    .line 11
    iput-boolean v1, p0, LN/h;->o:Z

    .line 12
    .line 13
    iput-boolean v1, p0, LN/h;->p:Z

    .line 14
    .line 15
    iput v1, p0, LN/h;->q:I

    .line 16
    .line 17
    iput v1, p0, LN/h;->r:I

    .line 18
    .line 19
    new-array v2, v0, [I

    .line 20
    .line 21
    iput-object v2, p0, LN/h;->s:[I

    .line 22
    .line 23
    new-array v2, v0, [I

    .line 24
    .line 25
    iput-object v2, p0, LN/h;->t:[I

    .line 26
    .line 27
    new-array v2, v0, [F

    .line 28
    .line 29
    fill-array-data v2, :array_0

    .line 30
    .line 31
    .line 32
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iput-object v2, p0, LN/h;->u:Landroid/animation/ValueAnimator;

    .line 37
    .line 38
    iput v1, p0, LN/h;->v:I

    .line 39
    .line 40
    new-instance v3, LD/b;

    .line 41
    .line 42
    invoke-direct {v3, p7, p0}, LD/b;-><init>(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iput-object v3, p0, LN/h;->w:LD/b;

    .line 46
    .line 47
    new-instance v4, LN/e;

    .line 48
    .line 49
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p2, p0, LN/h;->b:Landroid/graphics/drawable/StateListDrawable;

    .line 53
    .line 54
    iput-object p3, p0, LN/h;->c:Landroid/graphics/drawable/Drawable;

    .line 55
    .line 56
    iput-object p4, p0, LN/h;->f:Landroid/graphics/drawable/StateListDrawable;

    .line 57
    .line 58
    iput-object p5, p0, LN/h;->g:Landroid/graphics/drawable/Drawable;

    .line 59
    .line 60
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    invoke-static {p6, v5}, Ljava/lang/Math;->max(II)I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    iput v5, p0, LN/h;->d:I

    .line 69
    .line 70
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    invoke-static {p6, v5}, Ljava/lang/Math;->max(II)I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    iput v5, p0, LN/h;->e:I

    .line 79
    .line 80
    invoke-virtual {p4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 81
    .line 82
    .line 83
    move-result p4

    .line 84
    invoke-static {p6, p4}, Ljava/lang/Math;->max(II)I

    .line 85
    .line 86
    .line 87
    move-result p4

    .line 88
    iput p4, p0, LN/h;->h:I

    .line 89
    .line 90
    invoke-virtual {p5}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 91
    .line 92
    .line 93
    move-result p4

    .line 94
    invoke-static {p6, p4}, Ljava/lang/Math;->max(II)I

    .line 95
    .line 96
    .line 97
    move-result p4

    .line 98
    iput p4, p0, LN/h;->i:I

    .line 99
    .line 100
    iput p8, p0, LN/h;->a:I

    .line 101
    .line 102
    const/16 p4, 0xff

    .line 103
    .line 104
    invoke-virtual {p2, p4}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p3, p4}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 108
    .line 109
    .line 110
    new-instance p2, LN/f;

    .line 111
    .line 112
    invoke-direct {p2, p0}, LN/f;-><init>(LN/h;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 116
    .line 117
    .line 118
    new-instance p2, LN/g;

    .line 119
    .line 120
    invoke-direct {p2, p0}, LN/g;-><init>(LN/h;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 124
    .line 125
    .line 126
    iget-object p2, p0, LN/h;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 127
    .line 128
    if-ne p2, p1, :cond_0

    .line 129
    .line 130
    goto/16 :goto_1

    .line 131
    .line 132
    :cond_0
    if-eqz p2, :cond_6

    .line 133
    .line 134
    iget-object p3, p2, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 135
    .line 136
    if-eqz p3, :cond_1

    .line 137
    .line 138
    const-string p4, "Cannot remove item decoration during a scroll  or layout"

    .line 139
    .line 140
    invoke-virtual {p3, p4}, LN/x;->a(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    :cond_1
    iget-object p3, p2, Landroidx/recyclerview/widget/RecyclerView;->n:Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-virtual {p3, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    invoke-virtual {p3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 149
    .line 150
    .line 151
    move-result p3

    .line 152
    if-eqz p3, :cond_3

    .line 153
    .line 154
    invoke-virtual {p2}, Landroid/view/View;->getOverScrollMode()I

    .line 155
    .line 156
    .line 157
    move-result p3

    .line 158
    if-ne p3, v0, :cond_2

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_2
    const/4 p7, 0x0

    .line 162
    :goto_0
    invoke-virtual {p2, p7}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 163
    .line 164
    .line 165
    :cond_3
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->m()V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 169
    .line 170
    .line 171
    iget-object p2, p0, LN/h;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 172
    .line 173
    iget-object p3, p2, Landroidx/recyclerview/widget/RecyclerView;->o:Ljava/util/ArrayList;

    .line 174
    .line 175
    invoke-virtual {p3, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    iget-object p3, p2, Landroidx/recyclerview/widget/RecyclerView;->p:LN/h;

    .line 179
    .line 180
    if-ne p3, p0, :cond_4

    .line 181
    .line 182
    const/4 p3, 0x0

    .line 183
    iput-object p3, p2, Landroidx/recyclerview/widget/RecyclerView;->p:LN/h;

    .line 184
    .line 185
    :cond_4
    iget-object p2, p0, LN/h;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 186
    .line 187
    iget-object p2, p2, Landroidx/recyclerview/widget/RecyclerView;->c0:Ljava/util/ArrayList;

    .line 188
    .line 189
    if-eqz p2, :cond_5

    .line 190
    .line 191
    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    :cond_5
    iget-object p2, p0, LN/h;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 195
    .line 196
    invoke-virtual {p2, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 197
    .line 198
    .line 199
    :cond_6
    iput-object p1, p0, LN/h;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 200
    .line 201
    if-eqz p1, :cond_a

    .line 202
    .line 203
    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 204
    .line 205
    if-eqz p2, :cond_7

    .line 206
    .line 207
    const-string p3, "Cannot add item decoration during a scroll  or layout"

    .line 208
    .line 209
    invoke-virtual {p2, p3}, LN/x;->a(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    :cond_7
    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView;->n:Ljava/util/ArrayList;

    .line 213
    .line 214
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 215
    .line 216
    .line 217
    move-result p3

    .line 218
    if-eqz p3, :cond_8

    .line 219
    .line 220
    invoke-virtual {p1, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 221
    .line 222
    .line 223
    :cond_8
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->m()V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 230
    .line 231
    .line 232
    iget-object p1, p0, LN/h;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 233
    .line 234
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->o:Ljava/util/ArrayList;

    .line 235
    .line 236
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    iget-object p1, p0, LN/h;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 240
    .line 241
    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView;->c0:Ljava/util/ArrayList;

    .line 242
    .line 243
    if-nez p2, :cond_9

    .line 244
    .line 245
    new-instance p2, Ljava/util/ArrayList;

    .line 246
    .line 247
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 248
    .line 249
    .line 250
    iput-object p2, p1, Landroidx/recyclerview/widget/RecyclerView;->c0:Ljava/util/ArrayList;

    .line 251
    .line 252
    :cond_9
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->c0:Ljava/util/ArrayList;

    .line 253
    .line 254
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    :cond_a
    :goto_1
    return-void

    .line 258
    nop

    .line 259
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static d(FF[IIII)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    aget v0, p2, v0

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    aget p2, p2, v1

    .line 6
    .line 7
    sub-int/2addr v0, p2

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    sub-float/2addr p1, p0

    .line 12
    int-to-float p0, v0

    .line 13
    div-float/2addr p1, p0

    .line 14
    sub-int/2addr p3, p5

    .line 15
    int-to-float p0, p3

    .line 16
    mul-float p1, p1, p0

    .line 17
    .line 18
    float-to-int p0, p1

    .line 19
    add-int/2addr p4, p0

    .line 20
    if-ge p4, p3, :cond_1

    .line 21
    .line 22
    if-ltz p4, :cond_1

    .line 23
    .line 24
    return p0

    .line 25
    :cond_1
    return v1
.end method


# virtual methods
.method public final a(FF)Z
    .locals 2

    .line 1
    iget v0, p0, LN/h;->m:I

    .line 2
    .line 3
    iget v1, p0, LN/h;->h:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    int-to-float v0, v0

    .line 7
    cmpl-float p2, p2, v0

    .line 8
    .line 9
    if-ltz p2, :cond_0

    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    div-int/lit8 v0, p2, 0x2

    .line 13
    .line 14
    rsub-int/lit8 v0, v0, 0x0

    .line 15
    .line 16
    int-to-float v0, v0

    .line 17
    cmpl-float v0, p1, v0

    .line 18
    .line 19
    if-ltz v0, :cond_0

    .line 20
    .line 21
    div-int/lit8 p2, p2, 0x2

    .line 22
    .line 23
    add-int/lit8 p2, p2, 0x0

    .line 24
    .line 25
    int-to-float p2, p2

    .line 26
    cmpg-float p1, p1, p2

    .line 27
    .line 28
    if-gtz p1, :cond_0

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p1, 0x0

    .line 33
    :goto_0
    return p1
.end method

.method public final b(FF)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, LN/h;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 3
    .line 4
    sget-object v2, Ly/x;->a:Ljava/lang/reflect/Field;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroid/view/View;->getLayoutDirection()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    :goto_0
    iget v3, p0, LN/h;->d:I

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    div-int/lit8 v3, v3, 0x2

    .line 21
    .line 22
    int-to-float v1, v3

    .line 23
    cmpg-float p1, p1, v1

    .line 24
    .line 25
    if-gtz p1, :cond_2

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    iget v1, p0, LN/h;->l:I

    .line 29
    .line 30
    sub-int/2addr v1, v3

    .line 31
    int-to-float v1, v1

    .line 32
    cmpl-float p1, p1, v1

    .line 33
    .line 34
    if-ltz p1, :cond_2

    .line 35
    .line 36
    :goto_1
    div-int/lit8 p1, v0, 0x2

    .line 37
    .line 38
    rsub-int/lit8 v1, p1, 0x0

    .line 39
    .line 40
    int-to-float v1, v1

    .line 41
    cmpl-float v1, p2, v1

    .line 42
    .line 43
    if-ltz v1, :cond_2

    .line 44
    .line 45
    add-int/2addr p1, v0

    .line 46
    int-to-float p1, p1

    .line 47
    cmpg-float p1, p2, p1

    .line 48
    .line 49
    if-gtz p1, :cond_2

    .line 50
    .line 51
    const/4 v0, 0x1

    .line 52
    :cond_2
    return v0
.end method

.method public final c(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    iget v0, p0, LN/h;->q:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    if-ne v0, v3, :cond_3

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    invoke-virtual {p0, v0, v4}, LN/h;->b(FF)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    invoke-virtual {p0, v4, v5}, LN/h;->a(FF)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-nez v5, :cond_4

    .line 37
    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    if-eqz v4, :cond_4

    .line 41
    .line 42
    :cond_0
    if-eqz v4, :cond_1

    .line 43
    .line 44
    iput v3, p0, LN/h;->r:I

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    float-to-int p1, p1

    .line 51
    int-to-float p1, p1

    .line 52
    iput p1, p0, LN/h;->k:F

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    if-eqz v0, :cond_2

    .line 56
    .line 57
    iput v2, p0, LN/h;->r:I

    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    float-to-int p1, p1

    .line 64
    int-to-float p1, p1

    .line 65
    iput p1, p0, LN/h;->j:F

    .line 66
    .line 67
    :cond_2
    :goto_0
    invoke-virtual {p0, v2}, LN/h;->e(I)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    if-ne v0, v2, :cond_4

    .line 72
    .line 73
    :goto_1
    const/4 v1, 0x1

    .line 74
    :cond_4
    return v1
.end method

.method public final e(I)V
    .locals 4

    .line 1
    iget-object v0, p0, LN/h;->w:LD/b;

    .line 2
    .line 3
    iget-object v1, p0, LN/h;->b:Landroid/graphics/drawable/StateListDrawable;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    if-ne p1, v2, :cond_0

    .line 7
    .line 8
    iget v3, p0, LN/h;->q:I

    .line 9
    .line 10
    if-eq v3, v2, :cond_0

    .line 11
    .line 12
    sget-object v3, LN/h;->x:[I

    .line 13
    .line 14
    invoke-virtual {v1, v3}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 15
    .line 16
    .line 17
    iget-object v3, p0, LN/h;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    invoke-virtual {v3, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    :cond_0
    if-nez p1, :cond_1

    .line 23
    .line 24
    iget-object v3, p0, LN/h;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 25
    .line 26
    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {p0}, LN/h;->f()V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget v3, p0, LN/h;->q:I

    .line 34
    .line 35
    if-ne v3, v2, :cond_2

    .line 36
    .line 37
    if-eq p1, v2, :cond_2

    .line 38
    .line 39
    sget-object v2, LN/h;->y:[I

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, LN/h;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, LN/h;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 50
    .line 51
    const/16 v2, 0x4b0

    .line 52
    .line 53
    int-to-long v2, v2

    .line 54
    invoke-virtual {v1, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    const/4 v1, 0x1

    .line 59
    if-ne p1, v1, :cond_3

    .line 60
    .line 61
    iget-object v1, p0, LN/h;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, LN/h;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 67
    .line 68
    const/16 v2, 0x5dc

    .line 69
    .line 70
    int-to-long v2, v2

    .line 71
    invoke-virtual {v1, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 72
    .line 73
    .line 74
    :cond_3
    :goto_1
    iput p1, p0, LN/h;->q:I

    .line 75
    .line 76
    return-void
.end method

.method public final f()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iget v1, p0, LN/h;->v:I

    .line 3
    .line 4
    iget-object v2, p0, LN/h;->u:Landroid/animation/ValueAnimator;

    .line 5
    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    const/4 v3, 0x3

    .line 9
    if-eq v1, v3, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->cancel()V

    .line 13
    .line 14
    .line 15
    :cond_1
    iput v0, p0, LN/h;->v:I

    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/lang/Float;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v3, 0x2

    .line 28
    new-array v3, v3, [F

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    aput v1, v3, v4

    .line 32
    .line 33
    const/high16 v1, 0x3f800000    # 1.0f

    .line 34
    .line 35
    aput v1, v3, v0

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 38
    .line 39
    .line 40
    const-wide/16 v0, 0x1f4

    .line 41
    .line 42
    invoke-virtual {v2, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 43
    .line 44
    .line 45
    const-wide/16 v0, 0x0

    .line 46
    .line 47
    invoke-virtual {v2, v0, v1}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->start()V

    .line 51
    .line 52
    .line 53
    :goto_0
    return-void
.end method
