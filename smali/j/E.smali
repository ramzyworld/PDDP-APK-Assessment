.class public abstract Lj/E;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# instance fields
.field public e:Z

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:F

.field public l:Z

.field public m:[I

.field public n:[I

.field public o:Landroid/graphics/drawable/Drawable;

.field public p:I

.field public q:I

.field public r:I

.field public s:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lj/E;->e:Z

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    iput v1, p0, Lj/E;->f:I

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    iput v2, p0, Lj/E;->g:I

    .line 12
    .line 13
    const v3, 0x800033

    .line 14
    .line 15
    .line 16
    iput v3, p0, Lj/E;->i:I

    .line 17
    .line 18
    sget-object v3, Lc/a;->i:[I

    .line 19
    .line 20
    invoke-static {p1, p2, v3, p3}, LN/b;->I(Landroid/content/Context;Landroid/util/AttributeSet;[II)LN/b;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object p2, p1, LN/b;->f:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p2, Landroid/content/res/TypedArray;

    .line 27
    .line 28
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    if-ltz p3, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0, p3}, Lj/E;->setOrientation(I)V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 38
    .line 39
    .line 40
    move-result p3

    .line 41
    if-ltz p3, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0, p3}, Lj/E;->setGravity(I)V

    .line 44
    .line 45
    .line 46
    :cond_1
    const/4 p3, 0x2

    .line 47
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    if-nez p3, :cond_2

    .line 52
    .line 53
    invoke-virtual {p0, p3}, Lj/E;->setBaselineAligned(Z)V

    .line 54
    .line 55
    .line 56
    :cond_2
    const/4 p3, 0x4

    .line 57
    const/high16 v0, -0x40800000    # -1.0f

    .line 58
    .line 59
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 60
    .line 61
    .line 62
    move-result p3

    .line 63
    iput p3, p0, Lj/E;->k:F

    .line 64
    .line 65
    const/4 p3, 0x3

    .line 66
    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 67
    .line 68
    .line 69
    move-result p3

    .line 70
    iput p3, p0, Lj/E;->f:I

    .line 71
    .line 72
    const/4 p3, 0x7

    .line 73
    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 74
    .line 75
    .line 76
    move-result p3

    .line 77
    iput-boolean p3, p0, Lj/E;->l:Z

    .line 78
    .line 79
    const/4 p3, 0x5

    .line 80
    invoke-virtual {p1, p3}, LN/b;->y(I)Landroid/graphics/drawable/Drawable;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    invoke-virtual {p0, p3}, Lj/E;->setDividerDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 85
    .line 86
    .line 87
    const/16 p3, 0x8

    .line 88
    .line 89
    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 90
    .line 91
    .line 92
    move-result p3

    .line 93
    iput p3, p0, Lj/E;->r:I

    .line 94
    .line 95
    const/4 p3, 0x6

    .line 96
    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    iput p2, p0, Lj/E;->s:I

    .line 101
    .line 102
    invoke-virtual {p1}, LN/b;->L()V

    .line 103
    .line 104
    .line 105
    return-void
.end method


# virtual methods
.method public final b(Landroid/graphics/Canvas;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lj/E;->o:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget v2, p0, Lj/E;->s:I

    .line 8
    .line 9
    add-int/2addr v1, v2

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    sub-int/2addr v2, v3

    .line 19
    iget v3, p0, Lj/E;->s:I

    .line 20
    .line 21
    sub-int/2addr v2, v3

    .line 22
    iget v3, p0, Lj/E;->q:I

    .line 23
    .line 24
    add-int/2addr v3, p2

    .line 25
    invoke-virtual {v0, v1, p2, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 26
    .line 27
    .line 28
    iget-object p2, p0, Lj/E;->o:Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final c(Landroid/graphics/Canvas;I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lj/E;->o:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget v2, p0, Lj/E;->s:I

    .line 8
    .line 9
    add-int/2addr v1, v2

    .line 10
    iget v2, p0, Lj/E;->p:I

    .line 11
    .line 12
    add-int/2addr v2, p2

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    sub-int/2addr v3, v4

    .line 22
    iget v4, p0, Lj/E;->s:I

    .line 23
    .line 24
    sub-int/2addr v3, v4

    .line 25
    invoke-virtual {v0, p2, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 26
    .line 27
    .line 28
    iget-object p2, p0, Lj/E;->o:Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Lj/D;

    .line 2
    .line 3
    return p1
.end method

.method public d()Lj/D;
    .locals 2

    .line 1
    iget v0, p0, Lj/E;->h:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lj/D;

    .line 6
    .line 7
    const/4 v1, -0x2

    .line 8
    invoke-direct {v0, v1}, Lj/D;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v1, 0x1

    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    new-instance v0, Lj/D;

    .line 16
    .line 17
    const/4 v1, -0x1

    .line 18
    invoke-direct {v0, v1}, Lj/D;-><init>(I)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    return-object v0
.end method

.method public e(Landroid/util/AttributeSet;)Lj/D;
    .locals 2

    .line 1
    new-instance v0, Lj/D;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1, p1}, Lj/D;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public f(Landroid/view/ViewGroup$LayoutParams;)Lj/D;
    .locals 1

    .line 1
    new-instance v0, Lj/D;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lj/D;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final g(I)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    iget p1, p0, Lj/E;->r:I

    .line 6
    .line 7
    and-int/2addr p1, v1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    :cond_0
    return v0

    .line 12
    :cond_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ne p1, v2, :cond_3

    .line 17
    .line 18
    iget p1, p0, Lj/E;->r:I

    .line 19
    .line 20
    and-int/lit8 p1, p1, 0x4

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    :cond_2
    return v0

    .line 26
    :cond_3
    iget v2, p0, Lj/E;->r:I

    .line 27
    .line 28
    and-int/lit8 v2, v2, 0x2

    .line 29
    .line 30
    if-eqz v2, :cond_5

    .line 31
    .line 32
    sub-int/2addr p1, v1

    .line 33
    :goto_0
    if-ltz p1, :cond_5

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/16 v3, 0x8

    .line 44
    .line 45
    if-eq v2, v3, :cond_4

    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    goto :goto_1

    .line 49
    :cond_4
    add-int/lit8 p1, p1, -0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_5
    :goto_1
    return v0
.end method

.method public bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj/E;->d()Lj/D;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lj/E;->e(Landroid/util/AttributeSet;)Lj/D;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lj/E;->f(Landroid/view/ViewGroup$LayoutParams;)Lj/D;

    move-result-object p1

    return-object p1
.end method

.method public getBaseline()I
    .locals 5

    .line 1
    iget v0, p0, Lj/E;->f:I

    .line 2
    .line 3
    if-gez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0}, Landroid/view/ViewGroup;->getBaseline()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget v1, p0, Lj/E;->f:I

    .line 15
    .line 16
    if-le v0, v1, :cond_6

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Landroid/view/View;->getBaseline()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, -0x1

    .line 27
    if-ne v1, v2, :cond_2

    .line 28
    .line 29
    iget v0, p0, Lj/E;->f:I

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    return v2

    .line 34
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 35
    .line 36
    const-string v1, "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn\'t know how to get its baseline."

    .line 37
    .line 38
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0

    .line 42
    :cond_2
    iget v2, p0, Lj/E;->g:I

    .line 43
    .line 44
    iget v3, p0, Lj/E;->h:I

    .line 45
    .line 46
    const/4 v4, 0x1

    .line 47
    if-ne v3, v4, :cond_5

    .line 48
    .line 49
    iget v3, p0, Lj/E;->i:I

    .line 50
    .line 51
    and-int/lit8 v3, v3, 0x70

    .line 52
    .line 53
    const/16 v4, 0x30

    .line 54
    .line 55
    if-eq v3, v4, :cond_5

    .line 56
    .line 57
    const/16 v4, 0x10

    .line 58
    .line 59
    if-eq v3, v4, :cond_4

    .line 60
    .line 61
    const/16 v4, 0x50

    .line 62
    .line 63
    if-eq v3, v4, :cond_3

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    sub-int/2addr v2, v3

    .line 75
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    sub-int/2addr v2, v3

    .line 80
    iget v3, p0, Lj/E;->j:I

    .line 81
    .line 82
    sub-int/2addr v2, v3

    .line 83
    goto :goto_0

    .line 84
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    sub-int/2addr v3, v4

    .line 93
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    sub-int/2addr v3, v4

    .line 98
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    sub-int/2addr v3, v4

    .line 103
    iget v4, p0, Lj/E;->j:I

    .line 104
    .line 105
    sub-int/2addr v3, v4

    .line 106
    div-int/lit8 v3, v3, 0x2

    .line 107
    .line 108
    add-int/2addr v2, v3

    .line 109
    :cond_5
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Lj/D;

    .line 114
    .line 115
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 116
    .line 117
    add-int/2addr v2, v0

    .line 118
    add-int/2addr v2, v1

    .line 119
    return v2

    .line 120
    :cond_6
    new-instance v0, Ljava/lang/RuntimeException;

    .line 121
    .line 122
    const-string v1, "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds."

    .line 123
    .line 124
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw v0
.end method

.method public getBaselineAlignedChildIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lj/E;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public getDividerDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lj/E;->o:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDividerPadding()I
    .locals 1

    .line 1
    iget v0, p0, Lj/E;->s:I

    .line 2
    .line 3
    return v0
.end method

.method public getDividerWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lj/E;->p:I

    .line 2
    .line 3
    return v0
.end method

.method public getGravity()I
    .locals 1

    .line 1
    iget v0, p0, Lj/E;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public getOrientation()I
    .locals 1

    .line 1
    iget v0, p0, Lj/E;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public getShowDividers()I
    .locals 1

    .line 1
    iget v0, p0, Lj/E;->r:I

    .line 2
    .line 3
    return v0
.end method

.method public getVirtualChildCount()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public getWeightSum()F
    .locals 1

    .line 1
    iget v0, p0, Lj/E;->k:F

    .line 2
    .line 3
    return v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lj/E;->o:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p0, Lj/E;->h:I

    .line 7
    .line 8
    const/16 v1, 0x8

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x1

    .line 12
    if-ne v0, v3, :cond_4

    .line 13
    .line 14
    invoke-virtual {p0}, Lj/E;->getVirtualChildCount()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    :goto_0
    if-ge v2, v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-eq v5, v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0, v2}, Lj/E;->g(I)Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-eqz v5, :cond_1

    .line 37
    .line 38
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, Lj/D;

    .line 43
    .line 44
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    iget v5, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 49
    .line 50
    sub-int/2addr v4, v5

    .line 51
    iget v5, p0, Lj/E;->q:I

    .line 52
    .line 53
    sub-int/2addr v4, v5

    .line 54
    invoke-virtual {p0, p1, v4}, Lj/E;->b(Landroid/graphics/Canvas;I)V

    .line 55
    .line 56
    .line 57
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-virtual {p0, v0}, Lj/E;->g(I)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_b

    .line 65
    .line 66
    sub-int/2addr v0, v3

    .line 67
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    if-nez v0, :cond_3

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    sub-int/2addr v0, v1

    .line 82
    iget v1, p0, Lj/E;->q:I

    .line 83
    .line 84
    sub-int/2addr v0, v1

    .line 85
    goto :goto_1

    .line 86
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, Lj/D;

    .line 91
    .line 92
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 97
    .line 98
    add-int/2addr v0, v1

    .line 99
    :goto_1
    invoke-virtual {p0, p1, v0}, Lj/E;->b(Landroid/graphics/Canvas;I)V

    .line 100
    .line 101
    .line 102
    goto/16 :goto_6

    .line 103
    .line 104
    :cond_4
    invoke-virtual {p0}, Lj/E;->getVirtualChildCount()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    invoke-static {p0}, Lj/w0;->a(Landroid/view/View;)Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    :goto_2
    if-ge v2, v0, :cond_7

    .line 113
    .line 114
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    if-eqz v5, :cond_6

    .line 119
    .line 120
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    if-eq v6, v1, :cond_6

    .line 125
    .line 126
    invoke-virtual {p0, v2}, Lj/E;->g(I)Z

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    if-eqz v6, :cond_6

    .line 131
    .line 132
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    check-cast v6, Lj/D;

    .line 137
    .line 138
    if-eqz v4, :cond_5

    .line 139
    .line 140
    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 145
    .line 146
    add-int/2addr v5, v6

    .line 147
    goto :goto_3

    .line 148
    :cond_5
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 153
    .line 154
    sub-int/2addr v5, v6

    .line 155
    iget v6, p0, Lj/E;->p:I

    .line 156
    .line 157
    sub-int/2addr v5, v6

    .line 158
    :goto_3
    invoke-virtual {p0, p1, v5}, Lj/E;->c(Landroid/graphics/Canvas;I)V

    .line 159
    .line 160
    .line 161
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_7
    invoke-virtual {p0, v0}, Lj/E;->g(I)Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-eqz v1, :cond_b

    .line 169
    .line 170
    sub-int/2addr v0, v3

    .line 171
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    if-nez v0, :cond_9

    .line 176
    .line 177
    if-eqz v4, :cond_8

    .line 178
    .line 179
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    goto :goto_5

    .line 184
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    sub-int/2addr v0, v1

    .line 193
    iget v1, p0, Lj/E;->p:I

    .line 194
    .line 195
    :goto_4
    sub-int/2addr v0, v1

    .line 196
    goto :goto_5

    .line 197
    :cond_9
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    check-cast v1, Lj/D;

    .line 202
    .line 203
    if-eqz v4, :cond_a

    .line 204
    .line 205
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 210
    .line 211
    sub-int/2addr v0, v1

    .line 212
    iget v1, p0, Lj/E;->p:I

    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_a
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 220
    .line 221
    add-int/2addr v0, v1

    .line 222
    :goto_5
    invoke-virtual {p0, p1, v0}, Lj/E;->c(Landroid/graphics/Canvas;I)V

    .line 223
    .line 224
    .line 225
    :cond_b
    :goto_6
    return-void
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "androidx.appcompat.widget.LinearLayoutCompat"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "androidx.appcompat.widget.LinearLayoutCompat"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lj/E;->h:I

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    const/16 v3, 0x8

    .line 7
    .line 8
    const/16 v5, 0x50

    .line 9
    .line 10
    const/4 v6, 0x2

    .line 11
    const/16 v7, 0x10

    .line 12
    .line 13
    const v8, 0x800007

    .line 14
    .line 15
    .line 16
    const/4 v9, 0x1

    .line 17
    if-ne v1, v9, :cond_8

    .line 18
    .line 19
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    sub-int v10, p4, p2

    .line 24
    .line 25
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    .line 26
    .line 27
    .line 28
    move-result v11

    .line 29
    sub-int v11, v10, v11

    .line 30
    .line 31
    sub-int/2addr v10, v1

    .line 32
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    .line 33
    .line 34
    .line 35
    move-result v12

    .line 36
    sub-int/2addr v10, v12

    .line 37
    invoke-virtual/range {p0 .. p0}, Lj/E;->getVirtualChildCount()I

    .line 38
    .line 39
    .line 40
    move-result v12

    .line 41
    iget v13, v0, Lj/E;->i:I

    .line 42
    .line 43
    and-int/lit8 v14, v13, 0x70

    .line 44
    .line 45
    and-int/2addr v8, v13

    .line 46
    if-eq v14, v7, :cond_1

    .line 47
    .line 48
    if-eq v14, v5, :cond_0

    .line 49
    .line 50
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    add-int v5, v5, p5

    .line 60
    .line 61
    sub-int v5, v5, p3

    .line 62
    .line 63
    iget v7, v0, Lj/E;->j:I

    .line 64
    .line 65
    sub-int/2addr v5, v7

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    sub-int v7, p5, p3

    .line 72
    .line 73
    iget v13, v0, Lj/E;->j:I

    .line 74
    .line 75
    sub-int/2addr v7, v13

    .line 76
    div-int/2addr v7, v6

    .line 77
    add-int/2addr v5, v7

    .line 78
    :goto_0
    const/4 v4, 0x0

    .line 79
    :goto_1
    if-ge v4, v12, :cond_16

    .line 80
    .line 81
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    if-nez v7, :cond_2

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_2
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    if-eq v13, v3, :cond_7

    .line 93
    .line 94
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    .line 95
    .line 96
    .line 97
    move-result v13

    .line 98
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    .line 99
    .line 100
    .line 101
    move-result v14

    .line 102
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 103
    .line 104
    .line 105
    move-result-object v15

    .line 106
    check-cast v15, Lj/D;

    .line 107
    .line 108
    iget v3, v15, Lj/D;->b:I

    .line 109
    .line 110
    if-gez v3, :cond_3

    .line 111
    .line 112
    move v3, v8

    .line 113
    :cond_3
    sget-object v16, Ly/x;->a:Ljava/lang/reflect/Field;

    .line 114
    .line 115
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutDirection()I

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    invoke-static {v3, v6}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    and-int/lit8 v3, v3, 0x7

    .line 124
    .line 125
    if-eq v3, v9, :cond_5

    .line 126
    .line 127
    if-eq v3, v2, :cond_4

    .line 128
    .line 129
    iget v3, v15, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 130
    .line 131
    add-int/2addr v3, v1

    .line 132
    goto :goto_3

    .line 133
    :cond_4
    sub-int v3, v11, v13

    .line 134
    .line 135
    iget v6, v15, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 136
    .line 137
    :goto_2
    sub-int/2addr v3, v6

    .line 138
    goto :goto_3

    .line 139
    :cond_5
    sub-int v3, v10, v13

    .line 140
    .line 141
    const/4 v6, 0x2

    .line 142
    div-int/2addr v3, v6

    .line 143
    add-int/2addr v3, v1

    .line 144
    iget v6, v15, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 145
    .line 146
    add-int/2addr v3, v6

    .line 147
    iget v6, v15, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :goto_3
    invoke-virtual {v0, v4}, Lj/E;->g(I)Z

    .line 151
    .line 152
    .line 153
    move-result v6

    .line 154
    if-eqz v6, :cond_6

    .line 155
    .line 156
    iget v6, v0, Lj/E;->q:I

    .line 157
    .line 158
    add-int/2addr v5, v6

    .line 159
    :cond_6
    iget v6, v15, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 160
    .line 161
    add-int/2addr v5, v6

    .line 162
    add-int/2addr v13, v3

    .line 163
    add-int v6, v5, v14

    .line 164
    .line 165
    invoke-virtual {v7, v3, v5, v13, v6}, Landroid/view/View;->layout(IIII)V

    .line 166
    .line 167
    .line 168
    iget v3, v15, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 169
    .line 170
    add-int/2addr v14, v3

    .line 171
    add-int/2addr v14, v5

    .line 172
    move v5, v14

    .line 173
    :cond_7
    :goto_4
    add-int/2addr v4, v9

    .line 174
    const/16 v3, 0x8

    .line 175
    .line 176
    const/4 v6, 0x2

    .line 177
    goto :goto_1

    .line 178
    :cond_8
    invoke-static/range {p0 .. p0}, Lj/w0;->a(Landroid/view/View;)Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    sub-int v6, p5, p3

    .line 187
    .line 188
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    .line 189
    .line 190
    .line 191
    move-result v10

    .line 192
    sub-int v10, v6, v10

    .line 193
    .line 194
    sub-int/2addr v6, v3

    .line 195
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    .line 196
    .line 197
    .line 198
    move-result v11

    .line 199
    sub-int/2addr v6, v11

    .line 200
    invoke-virtual/range {p0 .. p0}, Lj/E;->getVirtualChildCount()I

    .line 201
    .line 202
    .line 203
    move-result v11

    .line 204
    iget v12, v0, Lj/E;->i:I

    .line 205
    .line 206
    and-int/2addr v8, v12

    .line 207
    and-int/lit8 v12, v12, 0x70

    .line 208
    .line 209
    iget-boolean v13, v0, Lj/E;->e:Z

    .line 210
    .line 211
    iget-object v14, v0, Lj/E;->m:[I

    .line 212
    .line 213
    iget-object v15, v0, Lj/E;->n:[I

    .line 214
    .line 215
    sget-object v17, Ly/x;->a:Ljava/lang/reflect/Field;

    .line 216
    .line 217
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutDirection()I

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    invoke-static {v8, v4}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    if-eq v4, v9, :cond_a

    .line 226
    .line 227
    if-eq v4, v2, :cond_9

    .line 228
    .line 229
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    goto :goto_5

    .line 234
    :cond_9
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    add-int v2, v2, p4

    .line 239
    .line 240
    sub-int v2, v2, p2

    .line 241
    .line 242
    iget v4, v0, Lj/E;->j:I

    .line 243
    .line 244
    sub-int/2addr v2, v4

    .line 245
    goto :goto_5

    .line 246
    :cond_a
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    sub-int v4, p4, p2

    .line 251
    .line 252
    iget v8, v0, Lj/E;->j:I

    .line 253
    .line 254
    sub-int/2addr v4, v8

    .line 255
    const/4 v8, 0x2

    .line 256
    div-int/2addr v4, v8

    .line 257
    add-int/2addr v2, v4

    .line 258
    :goto_5
    if-eqz v1, :cond_b

    .line 259
    .line 260
    add-int/lit8 v1, v11, -0x1

    .line 261
    .line 262
    const/4 v8, -0x1

    .line 263
    goto :goto_6

    .line 264
    :cond_b
    const/4 v1, 0x0

    .line 265
    const/4 v8, 0x1

    .line 266
    :goto_6
    const/4 v9, 0x0

    .line 267
    :goto_7
    if-ge v9, v11, :cond_16

    .line 268
    .line 269
    mul-int v18, v8, v9

    .line 270
    .line 271
    add-int v5, v18, v1

    .line 272
    .line 273
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 274
    .line 275
    .line 276
    move-result-object v7

    .line 277
    if-nez v7, :cond_c

    .line 278
    .line 279
    move/from16 p3, v1

    .line 280
    .line 281
    move/from16 p4, v8

    .line 282
    .line 283
    move/from16 p5, v11

    .line 284
    .line 285
    move/from16 v20, v12

    .line 286
    .line 287
    const/4 v1, 0x1

    .line 288
    const/4 v12, -0x1

    .line 289
    goto/16 :goto_b

    .line 290
    .line 291
    :cond_c
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 292
    .line 293
    .line 294
    move-result v4

    .line 295
    move/from16 p3, v1

    .line 296
    .line 297
    const/16 v1, 0x8

    .line 298
    .line 299
    if-eq v4, v1, :cond_15

    .line 300
    .line 301
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    .line 302
    .line 303
    .line 304
    move-result v4

    .line 305
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    .line 306
    .line 307
    .line 308
    move-result v19

    .line 309
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 310
    .line 311
    .line 312
    move-result-object v20

    .line 313
    move-object/from16 v1, v20

    .line 314
    .line 315
    check-cast v1, Lj/D;

    .line 316
    .line 317
    move/from16 p4, v8

    .line 318
    .line 319
    if-eqz v13, :cond_d

    .line 320
    .line 321
    iget v8, v1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 322
    .line 323
    move/from16 p5, v11

    .line 324
    .line 325
    const/4 v11, -0x1

    .line 326
    if-eq v8, v11, :cond_e

    .line 327
    .line 328
    invoke-virtual {v7}, Landroid/view/View;->getBaseline()I

    .line 329
    .line 330
    .line 331
    move-result v11

    .line 332
    goto :goto_8

    .line 333
    :cond_d
    move/from16 p5, v11

    .line 334
    .line 335
    :cond_e
    const/4 v11, -0x1

    .line 336
    :goto_8
    iget v8, v1, Lj/D;->b:I

    .line 337
    .line 338
    if-gez v8, :cond_f

    .line 339
    .line 340
    move v8, v12

    .line 341
    :cond_f
    and-int/lit8 v8, v8, 0x70

    .line 342
    .line 343
    move/from16 v20, v12

    .line 344
    .line 345
    const/16 v12, 0x10

    .line 346
    .line 347
    if-eq v8, v12, :cond_12

    .line 348
    .line 349
    const/16 v12, 0x30

    .line 350
    .line 351
    if-eq v8, v12, :cond_11

    .line 352
    .line 353
    const/16 v12, 0x50

    .line 354
    .line 355
    if-eq v8, v12, :cond_10

    .line 356
    .line 357
    move v8, v3

    .line 358
    const/4 v12, -0x1

    .line 359
    goto :goto_9

    .line 360
    :cond_10
    sub-int v8, v10, v19

    .line 361
    .line 362
    iget v12, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 363
    .line 364
    sub-int/2addr v8, v12

    .line 365
    const/4 v12, -0x1

    .line 366
    if-eq v11, v12, :cond_13

    .line 367
    .line 368
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    .line 369
    .line 370
    .line 371
    move-result v21

    .line 372
    sub-int v21, v21, v11

    .line 373
    .line 374
    const/4 v11, 0x2

    .line 375
    aget v22, v15, v11

    .line 376
    .line 377
    sub-int v22, v22, v21

    .line 378
    .line 379
    sub-int v8, v8, v22

    .line 380
    .line 381
    goto :goto_9

    .line 382
    :cond_11
    const/4 v12, -0x1

    .line 383
    iget v8, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 384
    .line 385
    add-int/2addr v8, v3

    .line 386
    if-eq v11, v12, :cond_13

    .line 387
    .line 388
    const/16 v17, 0x1

    .line 389
    .line 390
    aget v21, v14, v17

    .line 391
    .line 392
    sub-int v21, v21, v11

    .line 393
    .line 394
    add-int v8, v21, v8

    .line 395
    .line 396
    goto :goto_9

    .line 397
    :cond_12
    const/4 v12, -0x1

    .line 398
    sub-int v8, v6, v19

    .line 399
    .line 400
    const/4 v11, 0x2

    .line 401
    div-int/2addr v8, v11

    .line 402
    add-int/2addr v8, v3

    .line 403
    iget v11, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 404
    .line 405
    add-int/2addr v8, v11

    .line 406
    iget v11, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 407
    .line 408
    sub-int/2addr v8, v11

    .line 409
    :cond_13
    :goto_9
    invoke-virtual {v0, v5}, Lj/E;->g(I)Z

    .line 410
    .line 411
    .line 412
    move-result v5

    .line 413
    if-eqz v5, :cond_14

    .line 414
    .line 415
    iget v5, v0, Lj/E;->p:I

    .line 416
    .line 417
    add-int/2addr v2, v5

    .line 418
    :cond_14
    iget v5, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 419
    .line 420
    add-int/2addr v2, v5

    .line 421
    add-int v5, v2, v4

    .line 422
    .line 423
    add-int v11, v8, v19

    .line 424
    .line 425
    invoke-virtual {v7, v2, v8, v5, v11}, Landroid/view/View;->layout(IIII)V

    .line 426
    .line 427
    .line 428
    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 429
    .line 430
    add-int/2addr v4, v1

    .line 431
    add-int/2addr v4, v2

    .line 432
    move v2, v4

    .line 433
    :goto_a
    const/4 v1, 0x1

    .line 434
    goto :goto_b

    .line 435
    :cond_15
    move/from16 p4, v8

    .line 436
    .line 437
    move/from16 p5, v11

    .line 438
    .line 439
    move/from16 v20, v12

    .line 440
    .line 441
    const/4 v12, -0x1

    .line 442
    goto :goto_a

    .line 443
    :goto_b
    add-int/2addr v9, v1

    .line 444
    move/from16 v1, p3

    .line 445
    .line 446
    move/from16 v8, p4

    .line 447
    .line 448
    move/from16 v11, p5

    .line 449
    .line 450
    move/from16 v12, v20

    .line 451
    .line 452
    const/16 v5, 0x50

    .line 453
    .line 454
    const/16 v7, 0x10

    .line 455
    .line 456
    goto/16 :goto_7

    .line 457
    .line 458
    :cond_16
    return-void
.end method

.method public onMeasure(II)V
    .locals 37

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move/from16 v7, p1

    .line 4
    .line 5
    move/from16 v8, p2

    .line 6
    .line 7
    iget v0, v6, Lj/E;->h:I

    .line 8
    .line 9
    const/4 v10, -0x2

    .line 10
    const/high16 v11, 0x40000000    # 2.0f

    .line 11
    .line 12
    const/16 v12, 0x8

    .line 13
    .line 14
    const/high16 v14, -0x80000000

    .line 15
    .line 16
    const/4 v15, 0x0

    .line 17
    const/4 v5, 0x0

    .line 18
    const/4 v4, 0x1

    .line 19
    if-ne v0, v4, :cond_28

    .line 20
    .line 21
    iput v5, v6, Lj/E;->j:I

    .line 22
    .line 23
    invoke-virtual/range {p0 .. p0}, Lj/E;->getVirtualChildCount()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iget v0, v6, Lj/E;->f:I

    .line 36
    .line 37
    iget-boolean v9, v6, Lj/E;->l:Z

    .line 38
    .line 39
    const/4 v13, 0x0

    .line 40
    const/16 v17, 0x0

    .line 41
    .line 42
    const/16 v18, 0x0

    .line 43
    .line 44
    const/16 v19, 0x0

    .line 45
    .line 46
    const/16 v20, 0x0

    .line 47
    .line 48
    const/16 v21, 0x0

    .line 49
    .line 50
    const/16 v22, 0x0

    .line 51
    .line 52
    const/16 v23, 0x0

    .line 53
    .line 54
    const/16 v24, 0x1

    .line 55
    .line 56
    const/16 v25, 0x0

    .line 57
    .line 58
    :goto_0
    if-ge v13, v3, :cond_10

    .line 59
    .line 60
    invoke-virtual {v6, v13}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v26

    .line 64
    if-nez v26, :cond_0

    .line 65
    .line 66
    iget v4, v6, Lj/E;->j:I

    .line 67
    .line 68
    iput v4, v6, Lj/E;->j:I

    .line 69
    .line 70
    :goto_1
    move v10, v0

    .line 71
    move/from16 v29, v1

    .line 72
    .line 73
    move/from16 v31, v3

    .line 74
    .line 75
    move/from16 v11, v22

    .line 76
    .line 77
    const/16 v27, 0x1

    .line 78
    .line 79
    goto/16 :goto_e

    .line 80
    .line 81
    :cond_0
    invoke-virtual/range {v26 .. v26}, Landroid/view/View;->getVisibility()I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-ne v4, v12, :cond_1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    invoke-virtual {v6, v13}, Lj/E;->g(I)Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_2

    .line 93
    .line 94
    iget v4, v6, Lj/E;->j:I

    .line 95
    .line 96
    iget v5, v6, Lj/E;->q:I

    .line 97
    .line 98
    add-int/2addr v4, v5

    .line 99
    iput v4, v6, Lj/E;->j:I

    .line 100
    .line 101
    :cond_2
    invoke-virtual/range {v26 .. v26}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    move-object v5, v4

    .line 106
    check-cast v5, Lj/D;

    .line 107
    .line 108
    iget v4, v5, Lj/D;->a:F

    .line 109
    .line 110
    add-float v17, v17, v4

    .line 111
    .line 112
    if-ne v1, v11, :cond_3

    .line 113
    .line 114
    iget v12, v5, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 115
    .line 116
    if-nez v12, :cond_3

    .line 117
    .line 118
    cmpl-float v12, v4, v15

    .line 119
    .line 120
    if-lez v12, :cond_3

    .line 121
    .line 122
    iget v4, v6, Lj/E;->j:I

    .line 123
    .line 124
    iget v12, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 125
    .line 126
    add-int/2addr v12, v4

    .line 127
    iget v11, v5, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 128
    .line 129
    add-int/2addr v12, v11

    .line 130
    invoke-static {v4, v12}, Ljava/lang/Math;->max(II)I

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    iput v4, v6, Lj/E;->j:I

    .line 135
    .line 136
    move v10, v0

    .line 137
    move/from16 v29, v1

    .line 138
    .line 139
    move/from16 v30, v2

    .line 140
    .line 141
    move/from16 v31, v3

    .line 142
    .line 143
    move-object v15, v5

    .line 144
    const/4 v4, 0x1

    .line 145
    const/16 v27, 0x1

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_3
    iget v11, v5, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 149
    .line 150
    if-nez v11, :cond_4

    .line 151
    .line 152
    cmpl-float v4, v4, v15

    .line 153
    .line 154
    if-lez v4, :cond_4

    .line 155
    .line 156
    iput v10, v5, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 157
    .line 158
    const/4 v11, 0x0

    .line 159
    goto :goto_2

    .line 160
    :cond_4
    const/high16 v11, -0x80000000

    .line 161
    .line 162
    :goto_2
    cmpl-float v4, v17, v15

    .line 163
    .line 164
    if-nez v4, :cond_5

    .line 165
    .line 166
    iget v4, v6, Lj/E;->j:I

    .line 167
    .line 168
    move v12, v4

    .line 169
    goto :goto_3

    .line 170
    :cond_5
    const/4 v12, 0x0

    .line 171
    :goto_3
    const/4 v4, 0x0

    .line 172
    move v10, v0

    .line 173
    move-object/from16 v0, p0

    .line 174
    .line 175
    move/from16 v29, v1

    .line 176
    .line 177
    move-object/from16 v1, v26

    .line 178
    .line 179
    move/from16 v30, v2

    .line 180
    .line 181
    move/from16 v2, p1

    .line 182
    .line 183
    move/from16 v31, v3

    .line 184
    .line 185
    move v3, v4

    .line 186
    const/16 v27, 0x1

    .line 187
    .line 188
    move/from16 v4, p2

    .line 189
    .line 190
    move-object v15, v5

    .line 191
    move v5, v12

    .line 192
    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 193
    .line 194
    .line 195
    if-eq v11, v14, :cond_6

    .line 196
    .line 197
    iput v11, v15, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 198
    .line 199
    :cond_6
    invoke-virtual/range {v26 .. v26}, Landroid/view/View;->getMeasuredHeight()I

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    iget v1, v6, Lj/E;->j:I

    .line 204
    .line 205
    add-int v2, v1, v0

    .line 206
    .line 207
    iget v3, v15, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 208
    .line 209
    add-int/2addr v2, v3

    .line 210
    iget v3, v15, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 211
    .line 212
    add-int/2addr v2, v3

    .line 213
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    iput v1, v6, Lj/E;->j:I

    .line 218
    .line 219
    move/from16 v5, v21

    .line 220
    .line 221
    if-eqz v9, :cond_7

    .line 222
    .line 223
    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    .line 224
    .line 225
    .line 226
    move-result v21

    .line 227
    :cond_7
    move/from16 v4, v20

    .line 228
    .line 229
    :goto_4
    if-ltz v10, :cond_8

    .line 230
    .line 231
    add-int/lit8 v0, v13, 0x1

    .line 232
    .line 233
    if-ne v10, v0, :cond_8

    .line 234
    .line 235
    iget v0, v6, Lj/E;->j:I

    .line 236
    .line 237
    iput v0, v6, Lj/E;->g:I

    .line 238
    .line 239
    :cond_8
    iget v0, v15, Lj/D;->a:F

    .line 240
    .line 241
    if-ge v13, v10, :cond_9

    .line 242
    .line 243
    const/4 v1, 0x0

    .line 244
    cmpl-float v2, v0, v1

    .line 245
    .line 246
    if-gtz v2, :cond_a

    .line 247
    .line 248
    :cond_9
    move/from16 v2, v30

    .line 249
    .line 250
    const/high16 v1, 0x40000000    # 2.0f

    .line 251
    .line 252
    goto :goto_5

    .line 253
    :cond_a
    new-instance v0, Ljava/lang/RuntimeException;

    .line 254
    .line 255
    const-string v1, "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won\'t work.  Either remove the weight, or don\'t set mBaselineAlignedChildIndex."

    .line 256
    .line 257
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    throw v0

    .line 261
    :goto_5
    if-eq v2, v1, :cond_b

    .line 262
    .line 263
    iget v1, v15, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 264
    .line 265
    const/4 v3, -0x1

    .line 266
    if-ne v1, v3, :cond_b

    .line 267
    .line 268
    const/4 v5, 0x1

    .line 269
    const/16 v25, 0x1

    .line 270
    .line 271
    goto :goto_6

    .line 272
    :cond_b
    const/4 v5, 0x0

    .line 273
    :goto_6
    iget v1, v15, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 274
    .line 275
    iget v3, v15, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 276
    .line 277
    add-int/2addr v1, v3

    .line 278
    invoke-virtual/range {v26 .. v26}, Landroid/view/View;->getMeasuredWidth()I

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    add-int/2addr v3, v1

    .line 283
    move/from16 v11, v22

    .line 284
    .line 285
    invoke-static {v11, v3}, Ljava/lang/Math;->max(II)I

    .line 286
    .line 287
    .line 288
    move-result v11

    .line 289
    invoke-virtual/range {v26 .. v26}, Landroid/view/View;->getMeasuredState()I

    .line 290
    .line 291
    .line 292
    move-result v12

    .line 293
    move/from16 v14, v23

    .line 294
    .line 295
    invoke-static {v14, v12}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 296
    .line 297
    .line 298
    move-result v12

    .line 299
    if-eqz v24, :cond_c

    .line 300
    .line 301
    iget v14, v15, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 302
    .line 303
    const/4 v15, -0x1

    .line 304
    if-ne v14, v15, :cond_c

    .line 305
    .line 306
    const/4 v14, 0x1

    .line 307
    :goto_7
    const/4 v15, 0x0

    .line 308
    goto :goto_8

    .line 309
    :cond_c
    const/4 v14, 0x0

    .line 310
    goto :goto_7

    .line 311
    :goto_8
    cmpl-float v0, v0, v15

    .line 312
    .line 313
    if-lez v0, :cond_e

    .line 314
    .line 315
    if-eqz v5, :cond_d

    .line 316
    .line 317
    :goto_9
    move/from16 v0, v19

    .line 318
    .line 319
    goto :goto_a

    .line 320
    :cond_d
    move v1, v3

    .line 321
    goto :goto_9

    .line 322
    :goto_a
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 323
    .line 324
    .line 325
    move-result v19

    .line 326
    goto :goto_d

    .line 327
    :cond_e
    move/from16 v0, v19

    .line 328
    .line 329
    if-eqz v5, :cond_f

    .line 330
    .line 331
    :goto_b
    move/from16 v3, v18

    .line 332
    .line 333
    goto :goto_c

    .line 334
    :cond_f
    move v1, v3

    .line 335
    goto :goto_b

    .line 336
    :goto_c
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    .line 337
    .line 338
    .line 339
    move-result v18

    .line 340
    move/from16 v19, v0

    .line 341
    .line 342
    :goto_d
    move/from16 v20, v4

    .line 343
    .line 344
    move/from16 v23, v12

    .line 345
    .line 346
    move/from16 v24, v14

    .line 347
    .line 348
    :goto_e
    add-int/lit8 v13, v13, 0x1

    .line 349
    .line 350
    move v0, v10

    .line 351
    move/from16 v22, v11

    .line 352
    .line 353
    move/from16 v1, v29

    .line 354
    .line 355
    move/from16 v3, v31

    .line 356
    .line 357
    const/4 v4, 0x1

    .line 358
    const/4 v5, 0x0

    .line 359
    const/4 v10, -0x2

    .line 360
    const/high16 v11, 0x40000000    # 2.0f

    .line 361
    .line 362
    const/16 v12, 0x8

    .line 363
    .line 364
    const/high16 v14, -0x80000000

    .line 365
    .line 366
    const/4 v15, 0x0

    .line 367
    goto/16 :goto_0

    .line 368
    .line 369
    :cond_10
    move/from16 v29, v1

    .line 370
    .line 371
    move/from16 v31, v3

    .line 372
    .line 373
    move/from16 v3, v18

    .line 374
    .line 375
    move/from16 v0, v19

    .line 376
    .line 377
    move/from16 v5, v21

    .line 378
    .line 379
    move/from16 v11, v22

    .line 380
    .line 381
    move/from16 v14, v23

    .line 382
    .line 383
    const/16 v27, 0x1

    .line 384
    .line 385
    iget v1, v6, Lj/E;->j:I

    .line 386
    .line 387
    move/from16 v10, v31

    .line 388
    .line 389
    if-lez v1, :cond_11

    .line 390
    .line 391
    invoke-virtual {v6, v10}, Lj/E;->g(I)Z

    .line 392
    .line 393
    .line 394
    move-result v1

    .line 395
    if-eqz v1, :cond_11

    .line 396
    .line 397
    iget v1, v6, Lj/E;->j:I

    .line 398
    .line 399
    iget v4, v6, Lj/E;->q:I

    .line 400
    .line 401
    add-int/2addr v1, v4

    .line 402
    iput v1, v6, Lj/E;->j:I

    .line 403
    .line 404
    :cond_11
    move/from16 v4, v29

    .line 405
    .line 406
    if-eqz v9, :cond_15

    .line 407
    .line 408
    const/high16 v1, -0x80000000

    .line 409
    .line 410
    if-eq v4, v1, :cond_12

    .line 411
    .line 412
    if-nez v4, :cond_15

    .line 413
    .line 414
    :cond_12
    const/4 v12, 0x0

    .line 415
    iput v12, v6, Lj/E;->j:I

    .line 416
    .line 417
    const/4 v1, 0x0

    .line 418
    :goto_f
    if-ge v1, v10, :cond_15

    .line 419
    .line 420
    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 421
    .line 422
    .line 423
    move-result-object v13

    .line 424
    if-nez v13, :cond_13

    .line 425
    .line 426
    iget v13, v6, Lj/E;->j:I

    .line 427
    .line 428
    iput v13, v6, Lj/E;->j:I

    .line 429
    .line 430
    goto :goto_10

    .line 431
    :cond_13
    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    .line 432
    .line 433
    .line 434
    move-result v15

    .line 435
    const/16 v12, 0x8

    .line 436
    .line 437
    if-ne v15, v12, :cond_14

    .line 438
    .line 439
    goto :goto_10

    .line 440
    :cond_14
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 441
    .line 442
    .line 443
    move-result-object v12

    .line 444
    check-cast v12, Lj/D;

    .line 445
    .line 446
    iget v13, v6, Lj/E;->j:I

    .line 447
    .line 448
    add-int v21, v13, v5

    .line 449
    .line 450
    iget v15, v12, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 451
    .line 452
    add-int v21, v21, v15

    .line 453
    .line 454
    iget v12, v12, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 455
    .line 456
    add-int v12, v21, v12

    .line 457
    .line 458
    invoke-static {v13, v12}, Ljava/lang/Math;->max(II)I

    .line 459
    .line 460
    .line 461
    move-result v12

    .line 462
    iput v12, v6, Lj/E;->j:I

    .line 463
    .line 464
    :goto_10
    add-int/lit8 v1, v1, 0x1

    .line 465
    .line 466
    const/4 v12, 0x0

    .line 467
    goto :goto_f

    .line 468
    :cond_15
    iget v1, v6, Lj/E;->j:I

    .line 469
    .line 470
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    .line 471
    .line 472
    .line 473
    move-result v12

    .line 474
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    .line 475
    .line 476
    .line 477
    move-result v13

    .line 478
    add-int/2addr v13, v12

    .line 479
    add-int/2addr v13, v1

    .line 480
    iput v13, v6, Lj/E;->j:I

    .line 481
    .line 482
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 483
    .line 484
    .line 485
    move-result v1

    .line 486
    invoke-static {v13, v1}, Ljava/lang/Math;->max(II)I

    .line 487
    .line 488
    .line 489
    move-result v1

    .line 490
    const/4 v12, 0x0

    .line 491
    invoke-static {v1, v8, v12}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 492
    .line 493
    .line 494
    move-result v1

    .line 495
    const v12, 0xffffff

    .line 496
    .line 497
    .line 498
    and-int/2addr v12, v1

    .line 499
    iget v13, v6, Lj/E;->j:I

    .line 500
    .line 501
    sub-int/2addr v12, v13

    .line 502
    if-nez v20, :cond_1a

    .line 503
    .line 504
    if-eqz v12, :cond_16

    .line 505
    .line 506
    const/4 v13, 0x0

    .line 507
    cmpl-float v15, v17, v13

    .line 508
    .line 509
    if-lez v15, :cond_16

    .line 510
    .line 511
    goto :goto_14

    .line 512
    :cond_16
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    .line 513
    .line 514
    .line 515
    move-result v0

    .line 516
    if-eqz v9, :cond_19

    .line 517
    .line 518
    const/high16 v3, 0x40000000    # 2.0f

    .line 519
    .line 520
    if-eq v4, v3, :cond_19

    .line 521
    .line 522
    const/4 v3, 0x0

    .line 523
    :goto_11
    if-ge v3, v10, :cond_19

    .line 524
    .line 525
    invoke-virtual {v6, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 526
    .line 527
    .line 528
    move-result-object v4

    .line 529
    if-eqz v4, :cond_18

    .line 530
    .line 531
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 532
    .line 533
    .line 534
    move-result v9

    .line 535
    const/16 v12, 0x8

    .line 536
    .line 537
    if-ne v9, v12, :cond_17

    .line 538
    .line 539
    goto :goto_12

    .line 540
    :cond_17
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 541
    .line 542
    .line 543
    move-result-object v9

    .line 544
    check-cast v9, Lj/D;

    .line 545
    .line 546
    iget v9, v9, Lj/D;->a:F

    .line 547
    .line 548
    const/4 v12, 0x0

    .line 549
    cmpl-float v9, v9, v12

    .line 550
    .line 551
    if-lez v9, :cond_18

    .line 552
    .line 553
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 554
    .line 555
    .line 556
    move-result v9

    .line 557
    const/high16 v12, 0x40000000    # 2.0f

    .line 558
    .line 559
    invoke-static {v9, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 560
    .line 561
    .line 562
    move-result v9

    .line 563
    invoke-static {v5, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 564
    .line 565
    .line 566
    move-result v13

    .line 567
    invoke-virtual {v4, v9, v13}, Landroid/view/View;->measure(II)V

    .line 568
    .line 569
    .line 570
    :cond_18
    :goto_12
    add-int/lit8 v3, v3, 0x1

    .line 571
    .line 572
    goto :goto_11

    .line 573
    :cond_19
    :goto_13
    move/from16 v22, v11

    .line 574
    .line 575
    goto/16 :goto_1c

    .line 576
    .line 577
    :cond_1a
    :goto_14
    iget v0, v6, Lj/E;->k:F

    .line 578
    .line 579
    const/4 v5, 0x0

    .line 580
    cmpl-float v9, v0, v5

    .line 581
    .line 582
    if-lez v9, :cond_1b

    .line 583
    .line 584
    move/from16 v17, v0

    .line 585
    .line 586
    :cond_1b
    const/4 v0, 0x0

    .line 587
    iput v0, v6, Lj/E;->j:I

    .line 588
    .line 589
    const/4 v5, 0x0

    .line 590
    :goto_15
    if-ge v5, v10, :cond_25

    .line 591
    .line 592
    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 597
    .line 598
    .line 599
    move-result v9

    .line 600
    const/16 v13, 0x8

    .line 601
    .line 602
    if-ne v9, v13, :cond_1c

    .line 603
    .line 604
    move/from16 v29, v4

    .line 605
    .line 606
    goto/16 :goto_1b

    .line 607
    .line 608
    :cond_1c
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 609
    .line 610
    .line 611
    move-result-object v9

    .line 612
    check-cast v9, Lj/D;

    .line 613
    .line 614
    iget v13, v9, Lj/D;->a:F

    .line 615
    .line 616
    const/4 v15, 0x0

    .line 617
    cmpl-float v16, v13, v15

    .line 618
    .line 619
    if-lez v16, :cond_21

    .line 620
    .line 621
    int-to-float v15, v12

    .line 622
    mul-float v15, v15, v13

    .line 623
    .line 624
    div-float v15, v15, v17

    .line 625
    .line 626
    float-to-int v15, v15

    .line 627
    sub-float v17, v17, v13

    .line 628
    .line 629
    sub-int/2addr v12, v15

    .line 630
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    .line 631
    .line 632
    .line 633
    move-result v13

    .line 634
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    .line 635
    .line 636
    .line 637
    move-result v16

    .line 638
    add-int v16, v16, v13

    .line 639
    .line 640
    iget v13, v9, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 641
    .line 642
    add-int v16, v16, v13

    .line 643
    .line 644
    iget v13, v9, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 645
    .line 646
    add-int v13, v16, v13

    .line 647
    .line 648
    move/from16 v16, v12

    .line 649
    .line 650
    iget v12, v9, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 651
    .line 652
    invoke-static {v7, v13, v12}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 653
    .line 654
    .line 655
    move-result v12

    .line 656
    iget v13, v9, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 657
    .line 658
    if-nez v13, :cond_1f

    .line 659
    .line 660
    const/high16 v13, 0x40000000    # 2.0f

    .line 661
    .line 662
    if-eq v4, v13, :cond_1d

    .line 663
    .line 664
    goto :goto_17

    .line 665
    :cond_1d
    if-lez v15, :cond_1e

    .line 666
    .line 667
    goto :goto_16

    .line 668
    :cond_1e
    const/4 v15, 0x0

    .line 669
    :goto_16
    invoke-static {v15, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 670
    .line 671
    .line 672
    move-result v15

    .line 673
    invoke-virtual {v0, v12, v15}, Landroid/view/View;->measure(II)V

    .line 674
    .line 675
    .line 676
    goto :goto_18

    .line 677
    :cond_1f
    const/high16 v13, 0x40000000    # 2.0f

    .line 678
    .line 679
    :goto_17
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 680
    .line 681
    .line 682
    move-result v18

    .line 683
    add-int v15, v18, v15

    .line 684
    .line 685
    if-gez v15, :cond_20

    .line 686
    .line 687
    const/4 v15, 0x0

    .line 688
    :cond_20
    invoke-static {v15, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 689
    .line 690
    .line 691
    move-result v15

    .line 692
    invoke-virtual {v0, v12, v15}, Landroid/view/View;->measure(II)V

    .line 693
    .line 694
    .line 695
    :goto_18
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredState()I

    .line 696
    .line 697
    .line 698
    move-result v12

    .line 699
    and-int/lit16 v12, v12, -0x100

    .line 700
    .line 701
    invoke-static {v14, v12}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 702
    .line 703
    .line 704
    move-result v14

    .line 705
    move/from16 v12, v16

    .line 706
    .line 707
    :cond_21
    iget v13, v9, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 708
    .line 709
    iget v15, v9, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 710
    .line 711
    add-int/2addr v13, v15

    .line 712
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 713
    .line 714
    .line 715
    move-result v15

    .line 716
    add-int/2addr v15, v13

    .line 717
    invoke-static {v11, v15}, Ljava/lang/Math;->max(II)I

    .line 718
    .line 719
    .line 720
    move-result v11

    .line 721
    move/from16 v29, v4

    .line 722
    .line 723
    const/high16 v4, 0x40000000    # 2.0f

    .line 724
    .line 725
    if-eq v2, v4, :cond_22

    .line 726
    .line 727
    iget v4, v9, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 728
    .line 729
    move/from16 v16, v11

    .line 730
    .line 731
    const/4 v11, -0x1

    .line 732
    if-ne v4, v11, :cond_23

    .line 733
    .line 734
    goto :goto_19

    .line 735
    :cond_22
    move/from16 v16, v11

    .line 736
    .line 737
    const/4 v11, -0x1

    .line 738
    :cond_23
    move v13, v15

    .line 739
    :goto_19
    invoke-static {v3, v13}, Ljava/lang/Math;->max(II)I

    .line 740
    .line 741
    .line 742
    move-result v3

    .line 743
    if-eqz v24, :cond_24

    .line 744
    .line 745
    iget v4, v9, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 746
    .line 747
    if-ne v4, v11, :cond_24

    .line 748
    .line 749
    const/4 v4, 0x1

    .line 750
    goto :goto_1a

    .line 751
    :cond_24
    const/4 v4, 0x0

    .line 752
    :goto_1a
    iget v11, v6, Lj/E;->j:I

    .line 753
    .line 754
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 755
    .line 756
    .line 757
    move-result v0

    .line 758
    add-int/2addr v0, v11

    .line 759
    iget v13, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 760
    .line 761
    add-int/2addr v0, v13

    .line 762
    iget v9, v9, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 763
    .line 764
    add-int/2addr v0, v9

    .line 765
    invoke-static {v11, v0}, Ljava/lang/Math;->max(II)I

    .line 766
    .line 767
    .line 768
    move-result v0

    .line 769
    iput v0, v6, Lj/E;->j:I

    .line 770
    .line 771
    move/from16 v24, v4

    .line 772
    .line 773
    move/from16 v11, v16

    .line 774
    .line 775
    :goto_1b
    add-int/lit8 v5, v5, 0x1

    .line 776
    .line 777
    move/from16 v4, v29

    .line 778
    .line 779
    goto/16 :goto_15

    .line 780
    .line 781
    :cond_25
    iget v0, v6, Lj/E;->j:I

    .line 782
    .line 783
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    .line 784
    .line 785
    .line 786
    move-result v4

    .line 787
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    .line 788
    .line 789
    .line 790
    move-result v5

    .line 791
    add-int/2addr v5, v4

    .line 792
    add-int/2addr v5, v0

    .line 793
    iput v5, v6, Lj/E;->j:I

    .line 794
    .line 795
    move v0, v3

    .line 796
    goto/16 :goto_13

    .line 797
    .line 798
    :goto_1c
    if-nez v24, :cond_26

    .line 799
    .line 800
    const/high16 v3, 0x40000000    # 2.0f

    .line 801
    .line 802
    if-eq v2, v3, :cond_26

    .line 803
    .line 804
    goto :goto_1d

    .line 805
    :cond_26
    move/from16 v0, v22

    .line 806
    .line 807
    :goto_1d
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    .line 808
    .line 809
    .line 810
    move-result v2

    .line 811
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    .line 812
    .line 813
    .line 814
    move-result v3

    .line 815
    add-int/2addr v3, v2

    .line 816
    add-int/2addr v3, v0

    .line 817
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    .line 818
    .line 819
    .line 820
    move-result v0

    .line 821
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    .line 822
    .line 823
    .line 824
    move-result v0

    .line 825
    invoke-static {v0, v7, v14}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 826
    .line 827
    .line 828
    move-result v0

    .line 829
    invoke-virtual {v6, v0, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 830
    .line 831
    .line 832
    if-eqz v25, :cond_62

    .line 833
    .line 834
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 835
    .line 836
    .line 837
    move-result v0

    .line 838
    const/high16 v1, 0x40000000    # 2.0f

    .line 839
    .line 840
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 841
    .line 842
    .line 843
    move-result v7

    .line 844
    const/4 v9, 0x0

    .line 845
    :goto_1e
    if-ge v9, v10, :cond_62

    .line 846
    .line 847
    invoke-virtual {v6, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 848
    .line 849
    .line 850
    move-result-object v1

    .line 851
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 852
    .line 853
    .line 854
    move-result v0

    .line 855
    const/16 v2, 0x8

    .line 856
    .line 857
    if-eq v0, v2, :cond_27

    .line 858
    .line 859
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    move-object v11, v0

    .line 864
    check-cast v11, Lj/D;

    .line 865
    .line 866
    iget v0, v11, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 867
    .line 868
    const/4 v2, -0x1

    .line 869
    if-ne v0, v2, :cond_27

    .line 870
    .line 871
    iget v12, v11, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 872
    .line 873
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 874
    .line 875
    .line 876
    move-result v0

    .line 877
    iput v0, v11, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 878
    .line 879
    const/4 v3, 0x0

    .line 880
    const/4 v5, 0x0

    .line 881
    move-object/from16 v0, p0

    .line 882
    .line 883
    move v2, v7

    .line 884
    move/from16 v4, p2

    .line 885
    .line 886
    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 887
    .line 888
    .line 889
    iput v12, v11, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 890
    .line 891
    :cond_27
    add-int/lit8 v9, v9, 0x1

    .line 892
    .line 893
    goto :goto_1e

    .line 894
    :cond_28
    const/4 v0, 0x0

    .line 895
    const/16 v27, 0x1

    .line 896
    .line 897
    iput v0, v6, Lj/E;->j:I

    .line 898
    .line 899
    invoke-virtual/range {p0 .. p0}, Lj/E;->getVirtualChildCount()I

    .line 900
    .line 901
    .line 902
    move-result v9

    .line 903
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 904
    .line 905
    .line 906
    move-result v10

    .line 907
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 908
    .line 909
    .line 910
    move-result v11

    .line 911
    iget-object v0, v6, Lj/E;->m:[I

    .line 912
    .line 913
    const/4 v12, 0x4

    .line 914
    if-eqz v0, :cond_29

    .line 915
    .line 916
    iget-object v0, v6, Lj/E;->n:[I

    .line 917
    .line 918
    if-nez v0, :cond_2a

    .line 919
    .line 920
    :cond_29
    new-array v0, v12, [I

    .line 921
    .line 922
    iput-object v0, v6, Lj/E;->m:[I

    .line 923
    .line 924
    new-array v0, v12, [I

    .line 925
    .line 926
    iput-object v0, v6, Lj/E;->n:[I

    .line 927
    .line 928
    :cond_2a
    iget-object v13, v6, Lj/E;->m:[I

    .line 929
    .line 930
    iget-object v14, v6, Lj/E;->n:[I

    .line 931
    .line 932
    const/4 v15, 0x3

    .line 933
    const/4 v0, -0x1

    .line 934
    aput v0, v13, v15

    .line 935
    .line 936
    const/16 v17, 0x2

    .line 937
    .line 938
    aput v0, v13, v17

    .line 939
    .line 940
    aput v0, v13, v27

    .line 941
    .line 942
    const/4 v1, 0x0

    .line 943
    aput v0, v13, v1

    .line 944
    .line 945
    aput v0, v14, v15

    .line 946
    .line 947
    aput v0, v14, v17

    .line 948
    .line 949
    aput v0, v14, v27

    .line 950
    .line 951
    aput v0, v14, v1

    .line 952
    .line 953
    iget-boolean v5, v6, Lj/E;->e:Z

    .line 954
    .line 955
    iget-boolean v4, v6, Lj/E;->l:Z

    .line 956
    .line 957
    const/high16 v0, 0x40000000    # 2.0f

    .line 958
    .line 959
    if-ne v10, v0, :cond_2b

    .line 960
    .line 961
    const/16 v18, 0x1

    .line 962
    .line 963
    goto :goto_1f

    .line 964
    :cond_2b
    const/16 v18, 0x0

    .line 965
    .line 966
    :goto_1f
    const/4 v0, 0x0

    .line 967
    const/4 v1, 0x0

    .line 968
    const/4 v2, 0x0

    .line 969
    const/4 v3, 0x0

    .line 970
    const/4 v8, 0x0

    .line 971
    const/4 v12, 0x0

    .line 972
    const/4 v15, 0x0

    .line 973
    const/16 v19, 0x1

    .line 974
    .line 975
    const/16 v21, 0x0

    .line 976
    .line 977
    const/16 v24, 0x0

    .line 978
    .line 979
    :goto_20
    if-ge v3, v9, :cond_3f

    .line 980
    .line 981
    invoke-virtual {v6, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 982
    .line 983
    .line 984
    move-result-object v7

    .line 985
    if-nez v7, :cond_2c

    .line 986
    .line 987
    iget v7, v6, Lj/E;->j:I

    .line 988
    .line 989
    iput v7, v6, Lj/E;->j:I

    .line 990
    .line 991
    move/from16 v25, v3

    .line 992
    .line 993
    move/from16 v26, v4

    .line 994
    .line 995
    move/from16 v30, v5

    .line 996
    .line 997
    goto/16 :goto_2d

    .line 998
    .line 999
    :cond_2c
    move/from16 v25, v0

    .line 1000
    .line 1001
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 1002
    .line 1003
    .line 1004
    move-result v0

    .line 1005
    move/from16 v26, v2

    .line 1006
    .line 1007
    const/16 v2, 0x8

    .line 1008
    .line 1009
    if-ne v0, v2, :cond_2d

    .line 1010
    .line 1011
    move/from16 v30, v5

    .line 1012
    .line 1013
    move/from16 v0, v25

    .line 1014
    .line 1015
    move/from16 v2, v26

    .line 1016
    .line 1017
    move/from16 v25, v3

    .line 1018
    .line 1019
    move/from16 v26, v4

    .line 1020
    .line 1021
    goto/16 :goto_2d

    .line 1022
    .line 1023
    :cond_2d
    invoke-virtual {v6, v3}, Lj/E;->g(I)Z

    .line 1024
    .line 1025
    .line 1026
    move-result v0

    .line 1027
    if-eqz v0, :cond_2e

    .line 1028
    .line 1029
    iget v0, v6, Lj/E;->j:I

    .line 1030
    .line 1031
    iget v2, v6, Lj/E;->p:I

    .line 1032
    .line 1033
    add-int/2addr v0, v2

    .line 1034
    iput v0, v6, Lj/E;->j:I

    .line 1035
    .line 1036
    :cond_2e
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v0

    .line 1040
    move-object v2, v0

    .line 1041
    check-cast v2, Lj/D;

    .line 1042
    .line 1043
    iget v0, v2, Lj/D;->a:F

    .line 1044
    .line 1045
    add-float v29, v1, v0

    .line 1046
    .line 1047
    const/high16 v1, 0x40000000    # 2.0f

    .line 1048
    .line 1049
    if-ne v10, v1, :cond_31

    .line 1050
    .line 1051
    iget v1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 1052
    .line 1053
    if-nez v1, :cond_31

    .line 1054
    .line 1055
    const/4 v1, 0x0

    .line 1056
    cmpl-float v30, v0, v1

    .line 1057
    .line 1058
    if-lez v30, :cond_31

    .line 1059
    .line 1060
    if-eqz v18, :cond_2f

    .line 1061
    .line 1062
    iget v0, v6, Lj/E;->j:I

    .line 1063
    .line 1064
    iget v1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 1065
    .line 1066
    move/from16 v30, v3

    .line 1067
    .line 1068
    iget v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 1069
    .line 1070
    add-int/2addr v1, v3

    .line 1071
    add-int/2addr v1, v0

    .line 1072
    iput v1, v6, Lj/E;->j:I

    .line 1073
    .line 1074
    goto :goto_21

    .line 1075
    :cond_2f
    move/from16 v30, v3

    .line 1076
    .line 1077
    iget v0, v6, Lj/E;->j:I

    .line 1078
    .line 1079
    iget v1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 1080
    .line 1081
    add-int/2addr v1, v0

    .line 1082
    iget v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 1083
    .line 1084
    add-int/2addr v1, v3

    .line 1085
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 1086
    .line 1087
    .line 1088
    move-result v0

    .line 1089
    iput v0, v6, Lj/E;->j:I

    .line 1090
    .line 1091
    :goto_21
    if-eqz v5, :cond_30

    .line 1092
    .line 1093
    const/4 v0, 0x0

    .line 1094
    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 1095
    .line 1096
    .line 1097
    move-result v1

    .line 1098
    invoke-virtual {v7, v1, v1}, Landroid/view/View;->measure(II)V

    .line 1099
    .line 1100
    .line 1101
    move-object v0, v2

    .line 1102
    move/from16 v33, v25

    .line 1103
    .line 1104
    move/from16 v34, v26

    .line 1105
    .line 1106
    move/from16 v25, v30

    .line 1107
    .line 1108
    move/from16 v26, v4

    .line 1109
    .line 1110
    move/from16 v30, v5

    .line 1111
    .line 1112
    goto/16 :goto_26

    .line 1113
    .line 1114
    :cond_30
    move-object v0, v2

    .line 1115
    move/from16 v33, v25

    .line 1116
    .line 1117
    move/from16 v34, v26

    .line 1118
    .line 1119
    move/from16 v25, v30

    .line 1120
    .line 1121
    const/high16 v1, 0x40000000    # 2.0f

    .line 1122
    .line 1123
    move/from16 v26, v4

    .line 1124
    .line 1125
    move/from16 v30, v5

    .line 1126
    .line 1127
    const/4 v4, 0x1

    .line 1128
    goto/16 :goto_27

    .line 1129
    .line 1130
    :cond_31
    move/from16 v30, v3

    .line 1131
    .line 1132
    iget v1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 1133
    .line 1134
    if-nez v1, :cond_32

    .line 1135
    .line 1136
    const/4 v1, 0x0

    .line 1137
    cmpl-float v0, v0, v1

    .line 1138
    .line 1139
    if-lez v0, :cond_33

    .line 1140
    .line 1141
    const/4 v0, -0x2

    .line 1142
    iput v0, v2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 1143
    .line 1144
    const/4 v3, 0x0

    .line 1145
    goto :goto_22

    .line 1146
    :cond_32
    const/4 v1, 0x0

    .line 1147
    :cond_33
    const/high16 v3, -0x80000000

    .line 1148
    .line 1149
    :goto_22
    cmpl-float v0, v29, v1

    .line 1150
    .line 1151
    if-nez v0, :cond_34

    .line 1152
    .line 1153
    iget v0, v6, Lj/E;->j:I

    .line 1154
    .line 1155
    move/from16 v31, v0

    .line 1156
    .line 1157
    goto :goto_23

    .line 1158
    :cond_34
    const/16 v31, 0x0

    .line 1159
    .line 1160
    :goto_23
    const/16 v32, 0x0

    .line 1161
    .line 1162
    move/from16 v1, v25

    .line 1163
    .line 1164
    move-object/from16 v0, p0

    .line 1165
    .line 1166
    move/from16 v33, v1

    .line 1167
    .line 1168
    move-object v1, v7

    .line 1169
    move-object/from16 v35, v2

    .line 1170
    .line 1171
    move/from16 v34, v26

    .line 1172
    .line 1173
    move/from16 v2, p1

    .line 1174
    .line 1175
    move/from16 v36, v3

    .line 1176
    .line 1177
    move/from16 v25, v30

    .line 1178
    .line 1179
    move/from16 v3, v31

    .line 1180
    .line 1181
    move/from16 v26, v4

    .line 1182
    .line 1183
    move/from16 v4, p2

    .line 1184
    .line 1185
    move/from16 v30, v5

    .line 1186
    .line 1187
    move/from16 v5, v32

    .line 1188
    .line 1189
    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 1190
    .line 1191
    .line 1192
    move/from16 v1, v36

    .line 1193
    .line 1194
    const/high16 v0, -0x80000000

    .line 1195
    .line 1196
    if-eq v1, v0, :cond_35

    .line 1197
    .line 1198
    move-object/from16 v0, v35

    .line 1199
    .line 1200
    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 1201
    .line 1202
    goto :goto_24

    .line 1203
    :cond_35
    move-object/from16 v0, v35

    .line 1204
    .line 1205
    :goto_24
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    .line 1206
    .line 1207
    .line 1208
    move-result v1

    .line 1209
    if-eqz v18, :cond_36

    .line 1210
    .line 1211
    iget v2, v6, Lj/E;->j:I

    .line 1212
    .line 1213
    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 1214
    .line 1215
    add-int/2addr v3, v1

    .line 1216
    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 1217
    .line 1218
    add-int/2addr v3, v4

    .line 1219
    add-int/2addr v3, v2

    .line 1220
    iput v3, v6, Lj/E;->j:I

    .line 1221
    .line 1222
    goto :goto_25

    .line 1223
    :cond_36
    iget v2, v6, Lj/E;->j:I

    .line 1224
    .line 1225
    add-int v3, v2, v1

    .line 1226
    .line 1227
    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 1228
    .line 1229
    add-int/2addr v3, v4

    .line 1230
    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 1231
    .line 1232
    add-int/2addr v3, v4

    .line 1233
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 1234
    .line 1235
    .line 1236
    move-result v2

    .line 1237
    iput v2, v6, Lj/E;->j:I

    .line 1238
    .line 1239
    :goto_25
    if-eqz v26, :cond_37

    .line 1240
    .line 1241
    invoke-static {v1, v12}, Ljava/lang/Math;->max(II)I

    .line 1242
    .line 1243
    .line 1244
    move-result v12

    .line 1245
    :cond_37
    :goto_26
    move/from16 v4, v21

    .line 1246
    .line 1247
    const/high16 v1, 0x40000000    # 2.0f

    .line 1248
    .line 1249
    :goto_27
    if-eq v11, v1, :cond_38

    .line 1250
    .line 1251
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 1252
    .line 1253
    const/4 v2, -0x1

    .line 1254
    if-ne v1, v2, :cond_38

    .line 1255
    .line 1256
    const/4 v5, 0x1

    .line 1257
    const/16 v24, 0x1

    .line 1258
    .line 1259
    goto :goto_28

    .line 1260
    :cond_38
    const/4 v5, 0x0

    .line 1261
    :goto_28
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 1262
    .line 1263
    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 1264
    .line 1265
    add-int/2addr v1, v2

    .line 1266
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    .line 1267
    .line 1268
    .line 1269
    move-result v2

    .line 1270
    add-int/2addr v2, v1

    .line 1271
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredState()I

    .line 1272
    .line 1273
    .line 1274
    move-result v3

    .line 1275
    invoke-static {v8, v3}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 1276
    .line 1277
    .line 1278
    move-result v3

    .line 1279
    if-eqz v30, :cond_3a

    .line 1280
    .line 1281
    invoke-virtual {v7}, Landroid/view/View;->getBaseline()I

    .line 1282
    .line 1283
    .line 1284
    move-result v7

    .line 1285
    const/4 v8, -0x1

    .line 1286
    if-eq v7, v8, :cond_3a

    .line 1287
    .line 1288
    iget v8, v0, Lj/D;->b:I

    .line 1289
    .line 1290
    if-gez v8, :cond_39

    .line 1291
    .line 1292
    iget v8, v6, Lj/E;->i:I

    .line 1293
    .line 1294
    :cond_39
    and-int/lit8 v8, v8, 0x70

    .line 1295
    .line 1296
    const/16 v21, 0x4

    .line 1297
    .line 1298
    shr-int/lit8 v8, v8, 0x4

    .line 1299
    .line 1300
    const/16 v21, -0x2

    .line 1301
    .line 1302
    and-int/lit8 v8, v8, -0x2

    .line 1303
    .line 1304
    shr-int/lit8 v8, v8, 0x1

    .line 1305
    .line 1306
    move/from16 v21, v1

    .line 1307
    .line 1308
    aget v1, v13, v8

    .line 1309
    .line 1310
    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    .line 1311
    .line 1312
    .line 1313
    move-result v1

    .line 1314
    aput v1, v13, v8

    .line 1315
    .line 1316
    aget v1, v14, v8

    .line 1317
    .line 1318
    sub-int v7, v2, v7

    .line 1319
    .line 1320
    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    .line 1321
    .line 1322
    .line 1323
    move-result v1

    .line 1324
    aput v1, v14, v8

    .line 1325
    .line 1326
    :goto_29
    move/from16 v7, v34

    .line 1327
    .line 1328
    goto :goto_2a

    .line 1329
    :cond_3a
    move/from16 v21, v1

    .line 1330
    .line 1331
    goto :goto_29

    .line 1332
    :goto_2a
    invoke-static {v7, v2}, Ljava/lang/Math;->max(II)I

    .line 1333
    .line 1334
    .line 1335
    move-result v1

    .line 1336
    if-eqz v19, :cond_3b

    .line 1337
    .line 1338
    iget v7, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 1339
    .line 1340
    const/4 v8, -0x1

    .line 1341
    if-ne v7, v8, :cond_3b

    .line 1342
    .line 1343
    const/4 v7, 0x1

    .line 1344
    goto :goto_2b

    .line 1345
    :cond_3b
    const/4 v7, 0x0

    .line 1346
    :goto_2b
    iget v0, v0, Lj/D;->a:F

    .line 1347
    .line 1348
    const/4 v8, 0x0

    .line 1349
    cmpl-float v0, v0, v8

    .line 1350
    .line 1351
    if-lez v0, :cond_3d

    .line 1352
    .line 1353
    if-eqz v5, :cond_3c

    .line 1354
    .line 1355
    move/from16 v2, v21

    .line 1356
    .line 1357
    :cond_3c
    invoke-static {v15, v2}, Ljava/lang/Math;->max(II)I

    .line 1358
    .line 1359
    .line 1360
    move-result v15

    .line 1361
    move/from16 v0, v33

    .line 1362
    .line 1363
    goto :goto_2c

    .line 1364
    :cond_3d
    if-eqz v5, :cond_3e

    .line 1365
    .line 1366
    move/from16 v2, v21

    .line 1367
    .line 1368
    :cond_3e
    move/from16 v0, v33

    .line 1369
    .line 1370
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 1371
    .line 1372
    .line 1373
    move-result v0

    .line 1374
    :goto_2c
    move v2, v1

    .line 1375
    move v8, v3

    .line 1376
    move/from16 v21, v4

    .line 1377
    .line 1378
    move/from16 v19, v7

    .line 1379
    .line 1380
    move/from16 v1, v29

    .line 1381
    .line 1382
    :goto_2d
    add-int/lit8 v3, v25, 0x1

    .line 1383
    .line 1384
    move/from16 v7, p1

    .line 1385
    .line 1386
    move/from16 v4, v26

    .line 1387
    .line 1388
    move/from16 v5, v30

    .line 1389
    .line 1390
    goto/16 :goto_20

    .line 1391
    .line 1392
    :cond_3f
    move v7, v2

    .line 1393
    move/from16 v26, v4

    .line 1394
    .line 1395
    move/from16 v30, v5

    .line 1396
    .line 1397
    iget v2, v6, Lj/E;->j:I

    .line 1398
    .line 1399
    if-lez v2, :cond_40

    .line 1400
    .line 1401
    invoke-virtual {v6, v9}, Lj/E;->g(I)Z

    .line 1402
    .line 1403
    .line 1404
    move-result v2

    .line 1405
    if-eqz v2, :cond_40

    .line 1406
    .line 1407
    iget v2, v6, Lj/E;->j:I

    .line 1408
    .line 1409
    iget v3, v6, Lj/E;->p:I

    .line 1410
    .line 1411
    add-int/2addr v2, v3

    .line 1412
    iput v2, v6, Lj/E;->j:I

    .line 1413
    .line 1414
    :cond_40
    aget v2, v13, v27

    .line 1415
    .line 1416
    const/4 v3, -0x1

    .line 1417
    if-ne v2, v3, :cond_42

    .line 1418
    .line 1419
    const/4 v4, 0x0

    .line 1420
    aget v5, v13, v4

    .line 1421
    .line 1422
    if-ne v5, v3, :cond_42

    .line 1423
    .line 1424
    aget v4, v13, v17

    .line 1425
    .line 1426
    if-ne v4, v3, :cond_42

    .line 1427
    .line 1428
    const/4 v4, 0x3

    .line 1429
    aget v5, v13, v4

    .line 1430
    .line 1431
    if-eq v5, v3, :cond_41

    .line 1432
    .line 1433
    goto :goto_2e

    .line 1434
    :cond_41
    move v2, v7

    .line 1435
    move/from16 v25, v8

    .line 1436
    .line 1437
    goto :goto_2f

    .line 1438
    :cond_42
    const/4 v4, 0x3

    .line 1439
    :goto_2e
    aget v3, v13, v4

    .line 1440
    .line 1441
    const/4 v5, 0x0

    .line 1442
    aget v4, v13, v5

    .line 1443
    .line 1444
    aget v5, v13, v17

    .line 1445
    .line 1446
    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    .line 1447
    .line 1448
    .line 1449
    move-result v2

    .line 1450
    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    .line 1451
    .line 1452
    .line 1453
    move-result v2

    .line 1454
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 1455
    .line 1456
    .line 1457
    move-result v2

    .line 1458
    const/4 v3, 0x3

    .line 1459
    aget v4, v14, v3

    .line 1460
    .line 1461
    const/4 v3, 0x0

    .line 1462
    aget v5, v14, v3

    .line 1463
    .line 1464
    aget v3, v14, v27

    .line 1465
    .line 1466
    move/from16 v25, v8

    .line 1467
    .line 1468
    aget v8, v14, v17

    .line 1469
    .line 1470
    invoke-static {v3, v8}, Ljava/lang/Math;->max(II)I

    .line 1471
    .line 1472
    .line 1473
    move-result v3

    .line 1474
    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    .line 1475
    .line 1476
    .line 1477
    move-result v3

    .line 1478
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    .line 1479
    .line 1480
    .line 1481
    move-result v3

    .line 1482
    add-int/2addr v3, v2

    .line 1483
    invoke-static {v7, v3}, Ljava/lang/Math;->max(II)I

    .line 1484
    .line 1485
    .line 1486
    move-result v2

    .line 1487
    :goto_2f
    if-eqz v26, :cond_47

    .line 1488
    .line 1489
    const/high16 v3, -0x80000000

    .line 1490
    .line 1491
    if-eq v10, v3, :cond_43

    .line 1492
    .line 1493
    if-nez v10, :cond_47

    .line 1494
    .line 1495
    :cond_43
    const/4 v3, 0x0

    .line 1496
    iput v3, v6, Lj/E;->j:I

    .line 1497
    .line 1498
    const/4 v5, 0x0

    .line 1499
    :goto_30
    if-ge v5, v9, :cond_47

    .line 1500
    .line 1501
    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v3

    .line 1505
    if-nez v3, :cond_44

    .line 1506
    .line 1507
    iget v3, v6, Lj/E;->j:I

    .line 1508
    .line 1509
    iput v3, v6, Lj/E;->j:I

    .line 1510
    .line 1511
    goto :goto_31

    .line 1512
    :cond_44
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 1513
    .line 1514
    .line 1515
    move-result v4

    .line 1516
    const/16 v7, 0x8

    .line 1517
    .line 1518
    if-ne v4, v7, :cond_45

    .line 1519
    .line 1520
    goto :goto_31

    .line 1521
    :cond_45
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v3

    .line 1525
    check-cast v3, Lj/D;

    .line 1526
    .line 1527
    if-eqz v18, :cond_46

    .line 1528
    .line 1529
    iget v4, v6, Lj/E;->j:I

    .line 1530
    .line 1531
    iget v7, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 1532
    .line 1533
    add-int/2addr v7, v12

    .line 1534
    iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 1535
    .line 1536
    add-int/2addr v7, v3

    .line 1537
    add-int/2addr v7, v4

    .line 1538
    iput v7, v6, Lj/E;->j:I

    .line 1539
    .line 1540
    goto :goto_31

    .line 1541
    :cond_46
    iget v4, v6, Lj/E;->j:I

    .line 1542
    .line 1543
    add-int v7, v4, v12

    .line 1544
    .line 1545
    iget v8, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 1546
    .line 1547
    add-int/2addr v7, v8

    .line 1548
    iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 1549
    .line 1550
    add-int/2addr v7, v3

    .line 1551
    invoke-static {v4, v7}, Ljava/lang/Math;->max(II)I

    .line 1552
    .line 1553
    .line 1554
    move-result v3

    .line 1555
    iput v3, v6, Lj/E;->j:I

    .line 1556
    .line 1557
    :goto_31
    add-int/lit8 v5, v5, 0x1

    .line 1558
    .line 1559
    goto :goto_30

    .line 1560
    :cond_47
    iget v3, v6, Lj/E;->j:I

    .line 1561
    .line 1562
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    .line 1563
    .line 1564
    .line 1565
    move-result v4

    .line 1566
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    .line 1567
    .line 1568
    .line 1569
    move-result v5

    .line 1570
    add-int/2addr v5, v4

    .line 1571
    add-int/2addr v5, v3

    .line 1572
    iput v5, v6, Lj/E;->j:I

    .line 1573
    .line 1574
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    .line 1575
    .line 1576
    .line 1577
    move-result v3

    .line 1578
    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    .line 1579
    .line 1580
    .line 1581
    move-result v3

    .line 1582
    move/from16 v7, p1

    .line 1583
    .line 1584
    const/4 v4, 0x0

    .line 1585
    invoke-static {v3, v7, v4}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 1586
    .line 1587
    .line 1588
    move-result v3

    .line 1589
    const v4, 0xffffff

    .line 1590
    .line 1591
    .line 1592
    and-int/2addr v4, v3

    .line 1593
    iget v5, v6, Lj/E;->j:I

    .line 1594
    .line 1595
    sub-int/2addr v4, v5

    .line 1596
    if-nez v21, :cond_4c

    .line 1597
    .line 1598
    if-eqz v4, :cond_48

    .line 1599
    .line 1600
    const/4 v8, 0x0

    .line 1601
    cmpl-float v16, v1, v8

    .line 1602
    .line 1603
    if-lez v16, :cond_48

    .line 1604
    .line 1605
    goto :goto_34

    .line 1606
    :cond_48
    invoke-static {v0, v15}, Ljava/lang/Math;->max(II)I

    .line 1607
    .line 1608
    .line 1609
    move-result v0

    .line 1610
    if-eqz v26, :cond_4b

    .line 1611
    .line 1612
    const/high16 v1, 0x40000000    # 2.0f

    .line 1613
    .line 1614
    if-eq v10, v1, :cond_4b

    .line 1615
    .line 1616
    const/4 v1, 0x0

    .line 1617
    :goto_32
    if-ge v1, v9, :cond_4b

    .line 1618
    .line 1619
    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 1620
    .line 1621
    .line 1622
    move-result-object v4

    .line 1623
    if-eqz v4, :cond_4a

    .line 1624
    .line 1625
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 1626
    .line 1627
    .line 1628
    move-result v8

    .line 1629
    const/16 v10, 0x8

    .line 1630
    .line 1631
    if-ne v8, v10, :cond_49

    .line 1632
    .line 1633
    goto :goto_33

    .line 1634
    :cond_49
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v8

    .line 1638
    check-cast v8, Lj/D;

    .line 1639
    .line 1640
    iget v8, v8, Lj/D;->a:F

    .line 1641
    .line 1642
    const/4 v10, 0x0

    .line 1643
    cmpl-float v8, v8, v10

    .line 1644
    .line 1645
    if-lez v8, :cond_4a

    .line 1646
    .line 1647
    const/high16 v8, 0x40000000    # 2.0f

    .line 1648
    .line 1649
    invoke-static {v12, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 1650
    .line 1651
    .line 1652
    move-result v10

    .line 1653
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 1654
    .line 1655
    .line 1656
    move-result v13

    .line 1657
    invoke-static {v13, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 1658
    .line 1659
    .line 1660
    move-result v13

    .line 1661
    invoke-virtual {v4, v10, v13}, Landroid/view/View;->measure(II)V

    .line 1662
    .line 1663
    .line 1664
    :cond_4a
    :goto_33
    add-int/lit8 v1, v1, 0x1

    .line 1665
    .line 1666
    goto :goto_32

    .line 1667
    :cond_4b
    move/from16 v4, p2

    .line 1668
    .line 1669
    move/from16 v22, v9

    .line 1670
    .line 1671
    const/4 v8, 0x0

    .line 1672
    goto/16 :goto_43

    .line 1673
    .line 1674
    :cond_4c
    :goto_34
    iget v2, v6, Lj/E;->k:F

    .line 1675
    .line 1676
    const/4 v8, 0x0

    .line 1677
    cmpl-float v12, v2, v8

    .line 1678
    .line 1679
    if-lez v12, :cond_4d

    .line 1680
    .line 1681
    move v1, v2

    .line 1682
    :cond_4d
    const/4 v2, -0x1

    .line 1683
    const/4 v8, 0x3

    .line 1684
    aput v2, v13, v8

    .line 1685
    .line 1686
    aput v2, v13, v17

    .line 1687
    .line 1688
    aput v2, v13, v27

    .line 1689
    .line 1690
    const/4 v12, 0x0

    .line 1691
    aput v2, v13, v12

    .line 1692
    .line 1693
    aput v2, v14, v8

    .line 1694
    .line 1695
    aput v2, v14, v17

    .line 1696
    .line 1697
    aput v2, v14, v27

    .line 1698
    .line 1699
    aput v2, v14, v12

    .line 1700
    .line 1701
    iput v12, v6, Lj/E;->j:I

    .line 1702
    .line 1703
    move/from16 v12, v25

    .line 1704
    .line 1705
    const/4 v2, -0x1

    .line 1706
    const/4 v8, 0x0

    .line 1707
    :goto_35
    if-ge v8, v9, :cond_5c

    .line 1708
    .line 1709
    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 1710
    .line 1711
    .line 1712
    move-result-object v15

    .line 1713
    if-eqz v15, :cond_4e

    .line 1714
    .line 1715
    invoke-virtual {v15}, Landroid/view/View;->getVisibility()I

    .line 1716
    .line 1717
    .line 1718
    move-result v5

    .line 1719
    const/16 v7, 0x8

    .line 1720
    .line 1721
    if-ne v5, v7, :cond_4f

    .line 1722
    .line 1723
    :cond_4e
    move v7, v4

    .line 1724
    move/from16 v22, v9

    .line 1725
    .line 1726
    const/16 v21, 0x0

    .line 1727
    .line 1728
    const/16 v23, 0x4

    .line 1729
    .line 1730
    const/16 v28, -0x2

    .line 1731
    .line 1732
    move/from16 v4, p2

    .line 1733
    .line 1734
    goto/16 :goto_40

    .line 1735
    .line 1736
    :cond_4f
    invoke-virtual {v15}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1737
    .line 1738
    .line 1739
    move-result-object v5

    .line 1740
    check-cast v5, Lj/D;

    .line 1741
    .line 1742
    iget v7, v5, Lj/D;->a:F

    .line 1743
    .line 1744
    const/16 v21, 0x0

    .line 1745
    .line 1746
    cmpl-float v22, v7, v21

    .line 1747
    .line 1748
    if-lez v22, :cond_54

    .line 1749
    .line 1750
    move/from16 v22, v9

    .line 1751
    .line 1752
    int-to-float v9, v4

    .line 1753
    mul-float v9, v9, v7

    .line 1754
    .line 1755
    div-float/2addr v9, v1

    .line 1756
    float-to-int v9, v9

    .line 1757
    sub-float/2addr v1, v7

    .line 1758
    sub-int/2addr v4, v9

    .line 1759
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    .line 1760
    .line 1761
    .line 1762
    move-result v7

    .line 1763
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    .line 1764
    .line 1765
    .line 1766
    move-result v25

    .line 1767
    add-int v25, v25, v7

    .line 1768
    .line 1769
    iget v7, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 1770
    .line 1771
    add-int v25, v25, v7

    .line 1772
    .line 1773
    iget v7, v5, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 1774
    .line 1775
    add-int v7, v25, v7

    .line 1776
    .line 1777
    move/from16 v25, v1

    .line 1778
    .line 1779
    iget v1, v5, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 1780
    .line 1781
    move/from16 v26, v4

    .line 1782
    .line 1783
    move/from16 v4, p2

    .line 1784
    .line 1785
    invoke-static {v4, v7, v1}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 1786
    .line 1787
    .line 1788
    move-result v1

    .line 1789
    iget v7, v5, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 1790
    .line 1791
    if-nez v7, :cond_52

    .line 1792
    .line 1793
    const/high16 v7, 0x40000000    # 2.0f

    .line 1794
    .line 1795
    if-eq v10, v7, :cond_50

    .line 1796
    .line 1797
    goto :goto_37

    .line 1798
    :cond_50
    if-lez v9, :cond_51

    .line 1799
    .line 1800
    goto :goto_36

    .line 1801
    :cond_51
    const/4 v9, 0x0

    .line 1802
    :goto_36
    invoke-static {v9, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 1803
    .line 1804
    .line 1805
    move-result v9

    .line 1806
    invoke-virtual {v15, v9, v1}, Landroid/view/View;->measure(II)V

    .line 1807
    .line 1808
    .line 1809
    goto :goto_38

    .line 1810
    :cond_52
    const/high16 v7, 0x40000000    # 2.0f

    .line 1811
    .line 1812
    :goto_37
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredWidth()I

    .line 1813
    .line 1814
    .line 1815
    move-result v28

    .line 1816
    add-int v9, v28, v9

    .line 1817
    .line 1818
    if-gez v9, :cond_53

    .line 1819
    .line 1820
    const/4 v9, 0x0

    .line 1821
    :cond_53
    invoke-static {v9, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 1822
    .line 1823
    .line 1824
    move-result v9

    .line 1825
    invoke-virtual {v15, v9, v1}, Landroid/view/View;->measure(II)V

    .line 1826
    .line 1827
    .line 1828
    :goto_38
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredState()I

    .line 1829
    .line 1830
    .line 1831
    move-result v1

    .line 1832
    const/high16 v7, -0x1000000

    .line 1833
    .line 1834
    and-int/2addr v1, v7

    .line 1835
    invoke-static {v12, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 1836
    .line 1837
    .line 1838
    move-result v12

    .line 1839
    move/from16 v1, v25

    .line 1840
    .line 1841
    move/from16 v7, v26

    .line 1842
    .line 1843
    goto :goto_39

    .line 1844
    :cond_54
    move v7, v4

    .line 1845
    move/from16 v22, v9

    .line 1846
    .line 1847
    move/from16 v4, p2

    .line 1848
    .line 1849
    :goto_39
    if-eqz v18, :cond_55

    .line 1850
    .line 1851
    iget v9, v6, Lj/E;->j:I

    .line 1852
    .line 1853
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredWidth()I

    .line 1854
    .line 1855
    .line 1856
    move-result v25

    .line 1857
    move/from16 v26, v1

    .line 1858
    .line 1859
    iget v1, v5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 1860
    .line 1861
    add-int v25, v25, v1

    .line 1862
    .line 1863
    iget v1, v5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 1864
    .line 1865
    add-int v25, v25, v1

    .line 1866
    .line 1867
    add-int v1, v25, v9

    .line 1868
    .line 1869
    iput v1, v6, Lj/E;->j:I

    .line 1870
    .line 1871
    move/from16 v25, v7

    .line 1872
    .line 1873
    :goto_3a
    const/high16 v1, 0x40000000    # 2.0f

    .line 1874
    .line 1875
    goto :goto_3b

    .line 1876
    :cond_55
    move/from16 v26, v1

    .line 1877
    .line 1878
    iget v1, v6, Lj/E;->j:I

    .line 1879
    .line 1880
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredWidth()I

    .line 1881
    .line 1882
    .line 1883
    move-result v9

    .line 1884
    add-int/2addr v9, v1

    .line 1885
    move/from16 v25, v7

    .line 1886
    .line 1887
    iget v7, v5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 1888
    .line 1889
    add-int/2addr v9, v7

    .line 1890
    iget v7, v5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 1891
    .line 1892
    add-int/2addr v9, v7

    .line 1893
    invoke-static {v1, v9}, Ljava/lang/Math;->max(II)I

    .line 1894
    .line 1895
    .line 1896
    move-result v1

    .line 1897
    iput v1, v6, Lj/E;->j:I

    .line 1898
    .line 1899
    goto :goto_3a

    .line 1900
    :goto_3b
    if-eq v11, v1, :cond_56

    .line 1901
    .line 1902
    iget v1, v5, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 1903
    .line 1904
    const/4 v7, -0x1

    .line 1905
    if-ne v1, v7, :cond_56

    .line 1906
    .line 1907
    const/4 v1, 0x1

    .line 1908
    goto :goto_3c

    .line 1909
    :cond_56
    const/4 v1, 0x0

    .line 1910
    :goto_3c
    iget v7, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 1911
    .line 1912
    iget v9, v5, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 1913
    .line 1914
    add-int/2addr v7, v9

    .line 1915
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredHeight()I

    .line 1916
    .line 1917
    .line 1918
    move-result v9

    .line 1919
    add-int/2addr v9, v7

    .line 1920
    invoke-static {v2, v9}, Ljava/lang/Math;->max(II)I

    .line 1921
    .line 1922
    .line 1923
    move-result v2

    .line 1924
    if-eqz v1, :cond_57

    .line 1925
    .line 1926
    goto :goto_3d

    .line 1927
    :cond_57
    move v7, v9

    .line 1928
    :goto_3d
    invoke-static {v0, v7}, Ljava/lang/Math;->max(II)I

    .line 1929
    .line 1930
    .line 1931
    move-result v0

    .line 1932
    if-eqz v19, :cond_58

    .line 1933
    .line 1934
    iget v1, v5, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 1935
    .line 1936
    const/4 v7, -0x1

    .line 1937
    if-ne v1, v7, :cond_59

    .line 1938
    .line 1939
    const/4 v1, 0x1

    .line 1940
    goto :goto_3e

    .line 1941
    :cond_58
    const/4 v7, -0x1

    .line 1942
    :cond_59
    const/4 v1, 0x0

    .line 1943
    :goto_3e
    if-eqz v30, :cond_5b

    .line 1944
    .line 1945
    invoke-virtual {v15}, Landroid/view/View;->getBaseline()I

    .line 1946
    .line 1947
    .line 1948
    move-result v15

    .line 1949
    if-eq v15, v7, :cond_5b

    .line 1950
    .line 1951
    iget v5, v5, Lj/D;->b:I

    .line 1952
    .line 1953
    if-gez v5, :cond_5a

    .line 1954
    .line 1955
    iget v5, v6, Lj/E;->i:I

    .line 1956
    .line 1957
    :cond_5a
    and-int/lit8 v5, v5, 0x70

    .line 1958
    .line 1959
    const/16 v23, 0x4

    .line 1960
    .line 1961
    shr-int/lit8 v5, v5, 0x4

    .line 1962
    .line 1963
    const/16 v28, -0x2

    .line 1964
    .line 1965
    and-int/lit8 v5, v5, -0x2

    .line 1966
    .line 1967
    shr-int/lit8 v5, v5, 0x1

    .line 1968
    .line 1969
    aget v7, v13, v5

    .line 1970
    .line 1971
    invoke-static {v7, v15}, Ljava/lang/Math;->max(II)I

    .line 1972
    .line 1973
    .line 1974
    move-result v7

    .line 1975
    aput v7, v13, v5

    .line 1976
    .line 1977
    aget v7, v14, v5

    .line 1978
    .line 1979
    sub-int/2addr v9, v15

    .line 1980
    invoke-static {v7, v9}, Ljava/lang/Math;->max(II)I

    .line 1981
    .line 1982
    .line 1983
    move-result v7

    .line 1984
    aput v7, v14, v5

    .line 1985
    .line 1986
    goto :goto_3f

    .line 1987
    :cond_5b
    const/16 v23, 0x4

    .line 1988
    .line 1989
    const/16 v28, -0x2

    .line 1990
    .line 1991
    :goto_3f
    move/from16 v19, v1

    .line 1992
    .line 1993
    move/from16 v7, v25

    .line 1994
    .line 1995
    move/from16 v1, v26

    .line 1996
    .line 1997
    :goto_40
    add-int/lit8 v8, v8, 0x1

    .line 1998
    .line 1999
    move v4, v7

    .line 2000
    move/from16 v9, v22

    .line 2001
    .line 2002
    move/from16 v7, p1

    .line 2003
    .line 2004
    goto/16 :goto_35

    .line 2005
    .line 2006
    :cond_5c
    move/from16 v4, p2

    .line 2007
    .line 2008
    move/from16 v22, v9

    .line 2009
    .line 2010
    iget v1, v6, Lj/E;->j:I

    .line 2011
    .line 2012
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    .line 2013
    .line 2014
    .line 2015
    move-result v5

    .line 2016
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    .line 2017
    .line 2018
    .line 2019
    move-result v7

    .line 2020
    add-int/2addr v7, v5

    .line 2021
    add-int/2addr v7, v1

    .line 2022
    iput v7, v6, Lj/E;->j:I

    .line 2023
    .line 2024
    aget v1, v13, v27

    .line 2025
    .line 2026
    const/4 v5, -0x1

    .line 2027
    if-ne v1, v5, :cond_5e

    .line 2028
    .line 2029
    const/4 v7, 0x0

    .line 2030
    aget v8, v13, v7

    .line 2031
    .line 2032
    if-ne v8, v5, :cond_5e

    .line 2033
    .line 2034
    aget v7, v13, v17

    .line 2035
    .line 2036
    if-ne v7, v5, :cond_5e

    .line 2037
    .line 2038
    const/4 v7, 0x3

    .line 2039
    aget v8, v13, v7

    .line 2040
    .line 2041
    if-eq v8, v5, :cond_5d

    .line 2042
    .line 2043
    goto :goto_41

    .line 2044
    :cond_5d
    const/4 v8, 0x0

    .line 2045
    goto :goto_42

    .line 2046
    :cond_5e
    const/4 v7, 0x3

    .line 2047
    :goto_41
    aget v5, v13, v7

    .line 2048
    .line 2049
    const/4 v8, 0x0

    .line 2050
    aget v9, v13, v8

    .line 2051
    .line 2052
    aget v10, v13, v17

    .line 2053
    .line 2054
    invoke-static {v1, v10}, Ljava/lang/Math;->max(II)I

    .line 2055
    .line 2056
    .line 2057
    move-result v1

    .line 2058
    invoke-static {v9, v1}, Ljava/lang/Math;->max(II)I

    .line 2059
    .line 2060
    .line 2061
    move-result v1

    .line 2062
    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    .line 2063
    .line 2064
    .line 2065
    move-result v1

    .line 2066
    aget v5, v14, v7

    .line 2067
    .line 2068
    aget v7, v14, v8

    .line 2069
    .line 2070
    aget v9, v14, v27

    .line 2071
    .line 2072
    aget v10, v14, v17

    .line 2073
    .line 2074
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    .line 2075
    .line 2076
    .line 2077
    move-result v9

    .line 2078
    invoke-static {v7, v9}, Ljava/lang/Math;->max(II)I

    .line 2079
    .line 2080
    .line 2081
    move-result v7

    .line 2082
    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    .line 2083
    .line 2084
    .line 2085
    move-result v5

    .line 2086
    add-int/2addr v5, v1

    .line 2087
    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    .line 2088
    .line 2089
    .line 2090
    move-result v1

    .line 2091
    move v2, v1

    .line 2092
    :goto_42
    move/from16 v25, v12

    .line 2093
    .line 2094
    :goto_43
    if-nez v19, :cond_5f

    .line 2095
    .line 2096
    const/high16 v1, 0x40000000    # 2.0f

    .line 2097
    .line 2098
    if-eq v11, v1, :cond_5f

    .line 2099
    .line 2100
    goto :goto_44

    .line 2101
    :cond_5f
    move v0, v2

    .line 2102
    :goto_44
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    .line 2103
    .line 2104
    .line 2105
    move-result v1

    .line 2106
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    .line 2107
    .line 2108
    .line 2109
    move-result v2

    .line 2110
    add-int/2addr v2, v1

    .line 2111
    add-int/2addr v2, v0

    .line 2112
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 2113
    .line 2114
    .line 2115
    move-result v0

    .line 2116
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 2117
    .line 2118
    .line 2119
    move-result v0

    .line 2120
    const/high16 v1, -0x1000000

    .line 2121
    .line 2122
    and-int v1, v25, v1

    .line 2123
    .line 2124
    or-int/2addr v1, v3

    .line 2125
    shl-int/lit8 v2, v25, 0x10

    .line 2126
    .line 2127
    invoke-static {v0, v4, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 2128
    .line 2129
    .line 2130
    move-result v0

    .line 2131
    invoke-virtual {v6, v1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 2132
    .line 2133
    .line 2134
    if-eqz v24, :cond_62

    .line 2135
    .line 2136
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 2137
    .line 2138
    .line 2139
    move-result v0

    .line 2140
    const/high16 v1, 0x40000000    # 2.0f

    .line 2141
    .line 2142
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 2143
    .line 2144
    .line 2145
    move-result v7

    .line 2146
    move/from16 v9, v22

    .line 2147
    .line 2148
    :goto_45
    if-ge v8, v9, :cond_62

    .line 2149
    .line 2150
    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 2151
    .line 2152
    .line 2153
    move-result-object v1

    .line 2154
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 2155
    .line 2156
    .line 2157
    move-result v0

    .line 2158
    const/16 v10, 0x8

    .line 2159
    .line 2160
    if-eq v0, v10, :cond_60

    .line 2161
    .line 2162
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2163
    .line 2164
    .line 2165
    move-result-object v0

    .line 2166
    move-object v11, v0

    .line 2167
    check-cast v11, Lj/D;

    .line 2168
    .line 2169
    iget v0, v11, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 2170
    .line 2171
    const/4 v12, -0x1

    .line 2172
    if-ne v0, v12, :cond_61

    .line 2173
    .line 2174
    iget v13, v11, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 2175
    .line 2176
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 2177
    .line 2178
    .line 2179
    move-result v0

    .line 2180
    iput v0, v11, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 2181
    .line 2182
    const/4 v3, 0x0

    .line 2183
    const/4 v5, 0x0

    .line 2184
    move-object/from16 v0, p0

    .line 2185
    .line 2186
    move/from16 v2, p1

    .line 2187
    .line 2188
    move v4, v7

    .line 2189
    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 2190
    .line 2191
    .line 2192
    iput v13, v11, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 2193
    .line 2194
    goto :goto_46

    .line 2195
    :cond_60
    const/4 v12, -0x1

    .line 2196
    :cond_61
    :goto_46
    add-int/lit8 v8, v8, 0x1

    .line 2197
    .line 2198
    goto :goto_45

    .line 2199
    :cond_62
    return-void
.end method

.method public setBaselineAligned(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lj/E;->e:Z

    .line 2
    .line 3
    return-void
.end method

.method public setBaselineAlignedChildIndex(I)V
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ge p1, v0, :cond_0

    .line 8
    .line 9
    iput p1, p0, Lj/E;->f:I

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v1, "base aligned child index out of range (0, "

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ")"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
.end method

.method public setDividerDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lj/E;->o:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-object p1, p0, Lj/E;->o:Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iput v1, p0, Lj/E;->p:I

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iput v1, p0, Lj/E;->q:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iput v0, p0, Lj/E;->p:I

    .line 25
    .line 26
    iput v0, p0, Lj/E;->q:I

    .line 27
    .line 28
    :goto_0
    if-nez p1, :cond_2

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    :cond_2
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public setDividerPadding(I)V
    .locals 0

    .line 1
    iput p1, p0, Lj/E;->s:I

    .line 2
    .line 3
    return-void
.end method

.method public setGravity(I)V
    .locals 1

    .line 1
    iget v0, p0, Lj/E;->i:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_2

    .line 4
    .line 5
    const v0, 0x800007

    .line 6
    .line 7
    .line 8
    and-int/2addr v0, p1

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const v0, 0x800003

    .line 12
    .line 13
    .line 14
    or-int/2addr p1, v0

    .line 15
    :cond_0
    and-int/lit8 v0, p1, 0x70

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    or-int/lit8 p1, p1, 0x30

    .line 20
    .line 21
    :cond_1
    iput p1, p0, Lj/E;->i:I

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 24
    .line 25
    .line 26
    :cond_2
    return-void
.end method

.method public setHorizontalGravity(I)V
    .locals 2

    .line 1
    const v0, 0x800007

    .line 2
    .line 3
    .line 4
    and-int/2addr p1, v0

    .line 5
    iget v1, p0, Lj/E;->i:I

    .line 6
    .line 7
    and-int/2addr v0, v1

    .line 8
    if-eq v0, p1, :cond_0

    .line 9
    .line 10
    const v0, -0x800008

    .line 11
    .line 12
    .line 13
    and-int/2addr v0, v1

    .line 14
    or-int/2addr p1, v0

    .line 15
    iput p1, p0, Lj/E;->i:I

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public setMeasureWithLargestChildEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lj/E;->l:Z

    .line 2
    .line 3
    return-void
.end method

.method public setOrientation(I)V
    .locals 1

    .line 1
    iget v0, p0, Lj/E;->h:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lj/E;->h:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setShowDividers(I)V
    .locals 1

    .line 1
    iget v0, p0, Lj/E;->r:I

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput p1, p0, Lj/E;->r:I

    .line 9
    .line 10
    return-void
.end method

.method public setVerticalGravity(I)V
    .locals 2

    .line 1
    and-int/lit8 p1, p1, 0x70

    .line 2
    .line 3
    iget v0, p0, Lj/E;->i:I

    .line 4
    .line 5
    and-int/lit8 v1, v0, 0x70

    .line 6
    .line 7
    if-eq v1, p1, :cond_0

    .line 8
    .line 9
    and-int/lit8 v0, v0, -0x71

    .line 10
    .line 11
    or-int/2addr p1, v0

    .line 12
    iput p1, p0, Lj/E;->i:I

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public setWeightSum(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    iput p1, p0, Lj/E;->k:F

    .line 7
    .line 8
    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method
