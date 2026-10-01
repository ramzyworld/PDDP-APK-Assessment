.class public final Le/b;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "SourceFile"


# instance fields
.field public A:Z

.field public B:Landroid/graphics/ColorFilter;

.field public C:Z

.field public D:Landroid/content/res/ColorStateList;

.field public E:Landroid/graphics/PorterDuff$Mode;

.field public F:Z

.field public G:Z

.field public H:[[I

.field public I:Lm/c;

.field public J:Lm/j;

.field public final a:Le/e;

.field public b:Landroid/content/res/Resources;

.field public c:I

.field public d:I

.field public e:I

.field public f:Landroid/util/SparseArray;

.field public g:[Landroid/graphics/drawable/Drawable;

.field public h:I

.field public i:Z

.field public j:Z

.field public k:Landroid/graphics/Rect;

.field public l:Z

.field public m:Z

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:Z

.field public s:I

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:Z

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Le/b;Le/e;Landroid/content/res/Resources;)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v2, 0xa0

    .line 7
    .line 8
    iput v2, p0, Le/b;->c:I

    .line 9
    .line 10
    iput-boolean v1, p0, Le/b;->i:Z

    .line 11
    .line 12
    iput-boolean v1, p0, Le/b;->l:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Le/b;->w:Z

    .line 15
    .line 16
    iput v1, p0, Le/b;->y:I

    .line 17
    .line 18
    iput v1, p0, Le/b;->z:I

    .line 19
    .line 20
    iput-object p2, p0, Le/b;->a:Le/e;

    .line 21
    .line 22
    if-eqz p3, :cond_0

    .line 23
    .line 24
    move-object p2, p3

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    if-eqz p1, :cond_1

    .line 27
    .line 28
    iget-object p2, p1, Le/b;->b:Landroid/content/res/Resources;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 p2, 0x0

    .line 32
    :goto_0
    iput-object p2, p0, Le/b;->b:Landroid/content/res/Resources;

    .line 33
    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    iget p2, p1, Le/b;->c:I

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    const/4 p2, 0x0

    .line 40
    :goto_1
    sget v3, Le/f;->q:I

    .line 41
    .line 42
    if-nez p3, :cond_3

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_3
    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    iget p2, p2, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 50
    .line 51
    :goto_2
    if-nez p2, :cond_4

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_4
    move v2, p2

    .line 55
    :goto_3
    iput v2, p0, Le/b;->c:I

    .line 56
    .line 57
    if-eqz p1, :cond_c

    .line 58
    .line 59
    iget p2, p1, Le/b;->d:I

    .line 60
    .line 61
    iput p2, p0, Le/b;->d:I

    .line 62
    .line 63
    iget p2, p1, Le/b;->e:I

    .line 64
    .line 65
    iput p2, p0, Le/b;->e:I

    .line 66
    .line 67
    iput-boolean v0, p0, Le/b;->u:Z

    .line 68
    .line 69
    iput-boolean v0, p0, Le/b;->v:Z

    .line 70
    .line 71
    iget-boolean p2, p1, Le/b;->i:Z

    .line 72
    .line 73
    iput-boolean p2, p0, Le/b;->i:Z

    .line 74
    .line 75
    iget-boolean p2, p1, Le/b;->l:Z

    .line 76
    .line 77
    iput-boolean p2, p0, Le/b;->l:Z

    .line 78
    .line 79
    iget-boolean p2, p1, Le/b;->w:Z

    .line 80
    .line 81
    iput-boolean p2, p0, Le/b;->w:Z

    .line 82
    .line 83
    iget p2, p1, Le/b;->x:I

    .line 84
    .line 85
    iput p2, p0, Le/b;->x:I

    .line 86
    .line 87
    iget p2, p1, Le/b;->y:I

    .line 88
    .line 89
    iput p2, p0, Le/b;->y:I

    .line 90
    .line 91
    iget p2, p1, Le/b;->z:I

    .line 92
    .line 93
    iput p2, p0, Le/b;->z:I

    .line 94
    .line 95
    iget-boolean p2, p1, Le/b;->A:Z

    .line 96
    .line 97
    iput-boolean p2, p0, Le/b;->A:Z

    .line 98
    .line 99
    iget-object p2, p1, Le/b;->B:Landroid/graphics/ColorFilter;

    .line 100
    .line 101
    iput-object p2, p0, Le/b;->B:Landroid/graphics/ColorFilter;

    .line 102
    .line 103
    iget-boolean p2, p1, Le/b;->C:Z

    .line 104
    .line 105
    iput-boolean p2, p0, Le/b;->C:Z

    .line 106
    .line 107
    iget-object p2, p1, Le/b;->D:Landroid/content/res/ColorStateList;

    .line 108
    .line 109
    iput-object p2, p0, Le/b;->D:Landroid/content/res/ColorStateList;

    .line 110
    .line 111
    iget-object p2, p1, Le/b;->E:Landroid/graphics/PorterDuff$Mode;

    .line 112
    .line 113
    iput-object p2, p0, Le/b;->E:Landroid/graphics/PorterDuff$Mode;

    .line 114
    .line 115
    iget-boolean p2, p1, Le/b;->F:Z

    .line 116
    .line 117
    iput-boolean p2, p0, Le/b;->F:Z

    .line 118
    .line 119
    iget-boolean p2, p1, Le/b;->G:Z

    .line 120
    .line 121
    iput-boolean p2, p0, Le/b;->G:Z

    .line 122
    .line 123
    iget p2, p1, Le/b;->c:I

    .line 124
    .line 125
    if-ne p2, v2, :cond_6

    .line 126
    .line 127
    iget-boolean p2, p1, Le/b;->j:Z

    .line 128
    .line 129
    if-eqz p2, :cond_5

    .line 130
    .line 131
    new-instance p2, Landroid/graphics/Rect;

    .line 132
    .line 133
    iget-object p3, p1, Le/b;->k:Landroid/graphics/Rect;

    .line 134
    .line 135
    invoke-direct {p2, p3}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 136
    .line 137
    .line 138
    iput-object p2, p0, Le/b;->k:Landroid/graphics/Rect;

    .line 139
    .line 140
    iput-boolean v0, p0, Le/b;->j:Z

    .line 141
    .line 142
    :cond_5
    iget-boolean p2, p1, Le/b;->m:Z

    .line 143
    .line 144
    if-eqz p2, :cond_6

    .line 145
    .line 146
    iget p2, p1, Le/b;->n:I

    .line 147
    .line 148
    iput p2, p0, Le/b;->n:I

    .line 149
    .line 150
    iget p2, p1, Le/b;->o:I

    .line 151
    .line 152
    iput p2, p0, Le/b;->o:I

    .line 153
    .line 154
    iget p2, p1, Le/b;->p:I

    .line 155
    .line 156
    iput p2, p0, Le/b;->p:I

    .line 157
    .line 158
    iget p2, p1, Le/b;->q:I

    .line 159
    .line 160
    iput p2, p0, Le/b;->q:I

    .line 161
    .line 162
    iput-boolean v0, p0, Le/b;->m:Z

    .line 163
    .line 164
    :cond_6
    iget-boolean p2, p1, Le/b;->r:Z

    .line 165
    .line 166
    if-eqz p2, :cond_7

    .line 167
    .line 168
    iget p2, p1, Le/b;->s:I

    .line 169
    .line 170
    iput p2, p0, Le/b;->s:I

    .line 171
    .line 172
    iput-boolean v0, p0, Le/b;->r:Z

    .line 173
    .line 174
    :cond_7
    iget-boolean p2, p1, Le/b;->t:Z

    .line 175
    .line 176
    if-eqz p2, :cond_8

    .line 177
    .line 178
    iput-boolean v0, p0, Le/b;->t:Z

    .line 179
    .line 180
    :cond_8
    iget-object p2, p1, Le/b;->g:[Landroid/graphics/drawable/Drawable;

    .line 181
    .line 182
    array-length p3, p2

    .line 183
    new-array p3, p3, [Landroid/graphics/drawable/Drawable;

    .line 184
    .line 185
    iput-object p3, p0, Le/b;->g:[Landroid/graphics/drawable/Drawable;

    .line 186
    .line 187
    iget p3, p1, Le/b;->h:I

    .line 188
    .line 189
    iput p3, p0, Le/b;->h:I

    .line 190
    .line 191
    iget-object p3, p1, Le/b;->f:Landroid/util/SparseArray;

    .line 192
    .line 193
    if-eqz p3, :cond_9

    .line 194
    .line 195
    invoke-virtual {p3}, Landroid/util/SparseArray;->clone()Landroid/util/SparseArray;

    .line 196
    .line 197
    .line 198
    move-result-object p3

    .line 199
    iput-object p3, p0, Le/b;->f:Landroid/util/SparseArray;

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_9
    new-instance p3, Landroid/util/SparseArray;

    .line 203
    .line 204
    iget v2, p0, Le/b;->h:I

    .line 205
    .line 206
    invoke-direct {p3, v2}, Landroid/util/SparseArray;-><init>(I)V

    .line 207
    .line 208
    .line 209
    iput-object p3, p0, Le/b;->f:Landroid/util/SparseArray;

    .line 210
    .line 211
    :goto_4
    iget p3, p0, Le/b;->h:I

    .line 212
    .line 213
    :goto_5
    if-ge v1, p3, :cond_d

    .line 214
    .line 215
    aget-object v2, p2, v1

    .line 216
    .line 217
    if-eqz v2, :cond_b

    .line 218
    .line 219
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    if-eqz v2, :cond_a

    .line 224
    .line 225
    iget-object v3, p0, Le/b;->f:Landroid/util/SparseArray;

    .line 226
    .line 227
    invoke-virtual {v3, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    goto :goto_6

    .line 231
    :cond_a
    iget-object v2, p0, Le/b;->g:[Landroid/graphics/drawable/Drawable;

    .line 232
    .line 233
    aget-object v3, p2, v1

    .line 234
    .line 235
    aput-object v3, v2, v1

    .line 236
    .line 237
    :cond_b
    :goto_6
    add-int/2addr v1, v0

    .line 238
    goto :goto_5

    .line 239
    :cond_c
    const/16 p2, 0xa

    .line 240
    .line 241
    new-array p2, p2, [Landroid/graphics/drawable/Drawable;

    .line 242
    .line 243
    iput-object p2, p0, Le/b;->g:[Landroid/graphics/drawable/Drawable;

    .line 244
    .line 245
    iput v1, p0, Le/b;->h:I

    .line 246
    .line 247
    :cond_d
    if-eqz p1, :cond_e

    .line 248
    .line 249
    iget-object p2, p1, Le/b;->H:[[I

    .line 250
    .line 251
    iput-object p2, p0, Le/b;->H:[[I

    .line 252
    .line 253
    goto :goto_7

    .line 254
    :cond_e
    iget-object p2, p0, Le/b;->g:[Landroid/graphics/drawable/Drawable;

    .line 255
    .line 256
    array-length p2, p2

    .line 257
    new-array p2, p2, [[I

    .line 258
    .line 259
    iput-object p2, p0, Le/b;->H:[[I

    .line 260
    .line 261
    :goto_7
    if-eqz p1, :cond_f

    .line 262
    .line 263
    iget-object p2, p1, Le/b;->I:Lm/c;

    .line 264
    .line 265
    iput-object p2, p0, Le/b;->I:Lm/c;

    .line 266
    .line 267
    iget-object p1, p1, Le/b;->J:Lm/j;

    .line 268
    .line 269
    iput-object p1, p0, Le/b;->J:Lm/j;

    .line 270
    .line 271
    goto :goto_8

    .line 272
    :cond_f
    new-instance p1, Lm/c;

    .line 273
    .line 274
    invoke-direct {p1}, Lm/c;-><init>()V

    .line 275
    .line 276
    .line 277
    iput-object p1, p0, Le/b;->I:Lm/c;

    .line 278
    .line 279
    new-instance p1, Lm/j;

    .line 280
    .line 281
    invoke-direct {p1}, Lm/j;-><init>()V

    .line 282
    .line 283
    .line 284
    iput-object p1, p0, Le/b;->J:Lm/j;

    .line 285
    .line 286
    :goto_8
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/drawable/Drawable;)I
    .locals 5

    .line 1
    iget v0, p0, Le/b;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Le/b;->g:[Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    array-length v1, v1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    add-int/lit8 v1, v0, 0xa

    .line 10
    .line 11
    new-array v3, v1, [Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    iget-object v4, p0, Le/b;->g:[Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    invoke-static {v4, v2, v3, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 16
    .line 17
    .line 18
    iput-object v3, p0, Le/b;->g:[Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    new-array v1, v1, [[I

    .line 21
    .line 22
    iget-object v3, p0, Le/b;->H:[[I

    .line 23
    .line 24
    invoke-static {v3, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Le/b;->H:[[I

    .line 28
    .line 29
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-virtual {p1, v2, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 34
    .line 35
    .line 36
    iget-object v3, p0, Le/b;->a:Le/e;

    .line 37
    .line 38
    invoke-virtual {p1, v3}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 39
    .line 40
    .line 41
    iget-object v3, p0, Le/b;->g:[Landroid/graphics/drawable/Drawable;

    .line 42
    .line 43
    aput-object p1, v3, v0

    .line 44
    .line 45
    iget v3, p0, Le/b;->h:I

    .line 46
    .line 47
    add-int/2addr v3, v1

    .line 48
    iput v3, p0, Le/b;->h:I

    .line 49
    .line 50
    iget v1, p0, Le/b;->e:I

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    or-int/2addr p1, v1

    .line 57
    iput p1, p0, Le/b;->e:I

    .line 58
    .line 59
    iput-boolean v2, p0, Le/b;->r:Z

    .line 60
    .line 61
    iput-boolean v2, p0, Le/b;->t:Z

    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    iput-object p1, p0, Le/b;->k:Landroid/graphics/Rect;

    .line 65
    .line 66
    iput-boolean v2, p0, Le/b;->j:Z

    .line 67
    .line 68
    iput-boolean v2, p0, Le/b;->m:Z

    .line 69
    .line 70
    iput-boolean v2, p0, Le/b;->u:Z

    .line 71
    .line 72
    return v0
.end method

.method public final b()V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Le/b;->m:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Le/b;->c()V

    .line 5
    .line 6
    .line 7
    iget v0, p0, Le/b;->h:I

    .line 8
    .line 9
    iget-object v1, p0, Le/b;->g:[Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    iput v2, p0, Le/b;->o:I

    .line 13
    .line 14
    iput v2, p0, Le/b;->n:I

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    iput v2, p0, Le/b;->q:I

    .line 18
    .line 19
    iput v2, p0, Le/b;->p:I

    .line 20
    .line 21
    :goto_0
    if-ge v2, v0, :cond_4

    .line 22
    .line 23
    aget-object v3, v1, v2

    .line 24
    .line 25
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    iget v5, p0, Le/b;->n:I

    .line 30
    .line 31
    if-le v4, v5, :cond_0

    .line 32
    .line 33
    iput v4, p0, Le/b;->n:I

    .line 34
    .line 35
    :cond_0
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    iget v5, p0, Le/b;->o:I

    .line 40
    .line 41
    if-le v4, v5, :cond_1

    .line 42
    .line 43
    iput v4, p0, Le/b;->o:I

    .line 44
    .line 45
    :cond_1
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    iget v5, p0, Le/b;->p:I

    .line 50
    .line 51
    if-le v4, v5, :cond_2

    .line 52
    .line 53
    iput v4, p0, Le/b;->p:I

    .line 54
    .line 55
    :cond_2
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    iget v4, p0, Le/b;->q:I

    .line 60
    .line 61
    if-le v3, v4, :cond_3

    .line 62
    .line 63
    iput v3, p0, Le/b;->q:I

    .line 64
    .line 65
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    return-void
.end method

.method public final c()V
    .locals 7

    .line 1
    iget-object v0, p0, Le/b;->f:Landroid/util/SparseArray;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, v0, :cond_1

    .line 11
    .line 12
    iget-object v2, p0, Le/b;->f:Landroid/util/SparseArray;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    iget-object v3, p0, Le/b;->f:Landroid/util/SparseArray;

    .line 19
    .line 20
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Landroid/graphics/drawable/Drawable$ConstantState;

    .line 25
    .line 26
    iget-object v4, p0, Le/b;->g:[Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    iget-object v5, p0, Le/b;->b:Landroid/content/res/Resources;

    .line 29
    .line 30
    invoke-virtual {v3, v5}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 35
    .line 36
    const/16 v6, 0x17

    .line 37
    .line 38
    if-lt v5, v6, :cond_0

    .line 39
    .line 40
    iget v5, p0, Le/b;->x:I

    .line 41
    .line 42
    invoke-static {v3, v5}, LD/r;->t(Landroid/graphics/drawable/Drawable;I)V

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    iget-object v5, p0, Le/b;->a:Le/e;

    .line 50
    .line 51
    invoke-virtual {v3, v5}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 52
    .line 53
    .line 54
    aput-object v3, v4, v2

    .line 55
    .line 56
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    const/4 v0, 0x0

    .line 60
    iput-object v0, p0, Le/b;->f:Landroid/util/SparseArray;

    .line 61
    .line 62
    :cond_2
    return-void
.end method

.method public final canApplyTheme()Z
    .locals 6

    .line 1
    iget v0, p0, Le/b;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Le/b;->g:[Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    :goto_0
    if-ge v3, v0, :cond_2

    .line 8
    .line 9
    aget-object v4, v1, v3

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    if-eqz v4, :cond_0

    .line 13
    .line 14
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->canApplyTheme()Z

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-eqz v4, :cond_1

    .line 19
    .line 20
    return v5

    .line 21
    :cond_0
    iget-object v4, p0, Le/b;->f:Landroid/util/SparseArray;

    .line 22
    .line 23
    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Landroid/graphics/drawable/Drawable$ConstantState;

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable$ConstantState;->canApplyTheme()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    return v5

    .line 38
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return v2
.end method

.method public final d(I)Landroid/graphics/drawable/Drawable;
    .locals 5

    .line 1
    iget-object v0, p0, Le/b;->g:[Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    aget-object v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, p0, Le/b;->f:Landroid/util/SparseArray;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->indexOfKey(I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-ltz v0, :cond_3

    .line 18
    .line 19
    iget-object v2, p0, Le/b;->f:Landroid/util/SparseArray;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Landroid/graphics/drawable/Drawable$ConstantState;

    .line 26
    .line 27
    iget-object v3, p0, Le/b;->b:Landroid/content/res/Resources;

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 34
    .line 35
    const/16 v4, 0x17

    .line 36
    .line 37
    if-lt v3, v4, :cond_1

    .line 38
    .line 39
    iget v3, p0, Le/b;->x:I

    .line 40
    .line 41
    invoke-static {v2, v3}, LD/r;->t(Landroid/graphics/drawable/Drawable;I)V

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iget-object v3, p0, Le/b;->a:Le/e;

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 51
    .line 52
    .line 53
    iget-object v3, p0, Le/b;->g:[Landroid/graphics/drawable/Drawable;

    .line 54
    .line 55
    aput-object v2, v3, p1

    .line 56
    .line 57
    iget-object p1, p0, Le/b;->f:Landroid/util/SparseArray;

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->removeAt(I)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Le/b;->f:Landroid/util/SparseArray;

    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_2

    .line 69
    .line 70
    iput-object v1, p0, Le/b;->f:Landroid/util/SparseArray;

    .line 71
    .line 72
    :cond_2
    return-object v2

    .line 73
    :cond_3
    return-object v1
.end method

.method public final e([I)I
    .locals 4

    .line 1
    iget-object v0, p0, Le/b;->H:[[I

    .line 2
    .line 3
    iget v1, p0, Le/b;->h:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :goto_0
    if-ge v2, v1, :cond_1

    .line 7
    .line 8
    aget-object v3, v0, v2

    .line 9
    .line 10
    invoke-static {v3, p1}, Landroid/util/StateSet;->stateSetMatches([I[I)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    return v2

    .line 17
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p1, -0x1

    .line 21
    return p1
.end method

.method public final getChangingConfigurations()I
    .locals 2

    .line 1
    iget v0, p0, Le/b;->d:I

    .line 2
    .line 3
    iget v1, p0, Le/b;->e:I

    .line 4
    .line 5
    or-int/2addr v0, v1

    .line 6
    return v0
.end method

.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    new-instance v0, Le/e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Le/e;-><init>(Le/b;Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public final newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 2
    new-instance v0, Le/e;

    invoke-direct {v0, p0, p1}, Le/e;-><init>(Le/b;Landroid/content/res/Resources;)V

    return-object v0
.end method
