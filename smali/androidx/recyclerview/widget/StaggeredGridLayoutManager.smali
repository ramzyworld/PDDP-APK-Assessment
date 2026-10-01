.class public Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
.super LN/x;
.source "SourceFile"


# instance fields
.field public final h:I

.field public final i:[LN/O;

.field public final j:LN/q;

.field public final k:LN/q;

.field public final l:I

.field public final m:Z

.field public final n:Z

.field public final o:LD/j;

.field public final p:I

.field public q:LN/N;

.field public final r:Z

.field public final s:LD/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 5

    .line 1
    invoke-direct {p0}, LN/x;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->n:Z

    .line 11
    .line 12
    new-instance v1, LD/j;

    .line 13
    .line 14
    const/16 v2, 0x9

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v1, v2, v3}, LD/j;-><init>(IZ)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:LD/j;

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    iput v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->p:I

    .line 24
    .line 25
    new-instance v2, Landroid/graphics/Rect;

    .line 26
    .line 27
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance v2, LH/a;

    .line 31
    .line 32
    const/16 v3, 0xb

    .line 33
    .line 34
    invoke-direct {v2, v3, p0}, LH/a;-><init>(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    iput-boolean v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    .line 39
    .line 40
    new-instance v3, LD/b;

    .line 41
    .line 42
    const/4 v4, 0x3

    .line 43
    invoke-direct {v3, v4, p0}, LD/b;-><init>(ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iput-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->s:LD/b;

    .line 47
    .line 48
    invoke-static {p1, p2, p3, p4}, LN/x;->w(Landroid/content/Context;Landroid/util/AttributeSet;II)LN/o;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget p2, p1, LN/o;->b:I

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    if-ne p2, v2, :cond_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 60
    .line 61
    const-string p2, "invalid orientation."

    .line 62
    .line 63
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1

    .line 67
    :cond_1
    :goto_0
    const/4 p3, 0x0

    .line 68
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    .line 72
    .line 73
    if-ne p2, p4, :cond_2

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    iput p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    .line 77
    .line 78
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:LN/q;

    .line 79
    .line 80
    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:LN/q;

    .line 81
    .line 82
    iput-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:LN/q;

    .line 83
    .line 84
    iput-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:LN/q;

    .line 85
    .line 86
    invoke-virtual {p0}, LN/x;->H()V

    .line 87
    .line 88
    .line 89
    :goto_1
    iget p2, p1, LN/o;->c:I

    .line 90
    .line 91
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    .line 95
    .line 96
    if-eq p2, p4, :cond_4

    .line 97
    .line 98
    iput-object p3, v1, LD/j;->f:Ljava/lang/Object;

    .line 99
    .line 100
    invoke-virtual {p0}, LN/x;->H()V

    .line 101
    .line 102
    .line 103
    iput p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    .line 104
    .line 105
    new-instance p2, Ljava/util/BitSet;

    .line 106
    .line 107
    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    .line 108
    .line 109
    invoke-direct {p2, p4}, Ljava/util/BitSet;-><init>(I)V

    .line 110
    .line 111
    .line 112
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    .line 113
    .line 114
    new-array p2, p2, [LN/O;

    .line 115
    .line 116
    iput-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:[LN/O;

    .line 117
    .line 118
    const/4 p2, 0x0

    .line 119
    :goto_2
    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    .line 120
    .line 121
    if-ge p2, p4, :cond_3

    .line 122
    .line 123
    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:[LN/O;

    .line 124
    .line 125
    new-instance v1, LN/O;

    .line 126
    .line 127
    invoke-direct {v1, p0, p2}, LN/O;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;I)V

    .line 128
    .line 129
    .line 130
    aput-object v1, p4, p2

    .line 131
    .line 132
    add-int/lit8 p2, p2, 0x1

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_3
    invoke-virtual {p0}, LN/x;->H()V

    .line 136
    .line 137
    .line 138
    :cond_4
    iget-boolean p1, p1, LN/o;->d:Z

    .line 139
    .line 140
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:LN/N;

    .line 144
    .line 145
    if-eqz p2, :cond_5

    .line 146
    .line 147
    iget-boolean p3, p2, LN/N;->h:Z

    .line 148
    .line 149
    if-eq p3, p1, :cond_5

    .line 150
    .line 151
    iput-boolean p1, p2, LN/N;->h:Z

    .line 152
    .line 153
    :cond_5
    iput-boolean p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:Z

    .line 154
    .line 155
    invoke-virtual {p0}, LN/x;->H()V

    .line 156
    .line 157
    .line 158
    new-instance p1, LN/n;

    .line 159
    .line 160
    const/4 p2, 0x0

    .line 161
    invoke-direct {p1, p2}, LN/n;-><init>(I)V

    .line 162
    .line 163
    .line 164
    iput v0, p1, LN/n;->b:I

    .line 165
    .line 166
    iput v0, p1, LN/n;->c:I

    .line 167
    .line 168
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    .line 169
    .line 170
    invoke-static {p0, p1}, LN/q;->a(LN/x;I)LN/q;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:LN/q;

    .line 175
    .line 176
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    .line 177
    .line 178
    sub-int/2addr v2, p1

    .line 179
    invoke-static {p0, v2}, LN/q;->a(LN/x;I)LN/q;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:LN/q;

    .line 184
    .line 185
    return-void
.end method


# virtual methods
.method public final A(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, LN/x;->A(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LN/x;->p()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-lez p1, :cond_1

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->O(Z)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->N(Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, LN/y;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    throw p1

    .line 35
    :cond_1
    :goto_0
    return-void
.end method

.method public final B(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, LN/N;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, LN/N;

    .line 6
    .line 7
    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:LN/N;

    .line 8
    .line 9
    invoke-virtual {p0}, LN/x;->H()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final C()Landroid/os/Parcelable;
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:LN/N;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, LN/N;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iget v2, v0, LN/N;->c:I

    .line 11
    .line 12
    iput v2, v1, LN/N;->c:I

    .line 13
    .line 14
    iget v2, v0, LN/N;->a:I

    .line 15
    .line 16
    iput v2, v1, LN/N;->a:I

    .line 17
    .line 18
    iget v2, v0, LN/N;->b:I

    .line 19
    .line 20
    iput v2, v1, LN/N;->b:I

    .line 21
    .line 22
    iget-object v2, v0, LN/N;->d:[I

    .line 23
    .line 24
    iput-object v2, v1, LN/N;->d:[I

    .line 25
    .line 26
    iget v2, v0, LN/N;->e:I

    .line 27
    .line 28
    iput v2, v1, LN/N;->e:I

    .line 29
    .line 30
    iget-object v2, v0, LN/N;->f:[I

    .line 31
    .line 32
    iput-object v2, v1, LN/N;->f:[I

    .line 33
    .line 34
    iget-boolean v2, v0, LN/N;->h:Z

    .line 35
    .line 36
    iput-boolean v2, v1, LN/N;->h:Z

    .line 37
    .line 38
    iget-boolean v2, v0, LN/N;->i:Z

    .line 39
    .line 40
    iput-boolean v2, v1, LN/N;->i:Z

    .line 41
    .line 42
    iget-boolean v2, v0, LN/N;->j:Z

    .line 43
    .line 44
    iput-boolean v2, v1, LN/N;->j:Z

    .line 45
    .line 46
    iget-object v0, v0, LN/N;->g:Ljava/util/ArrayList;

    .line 47
    .line 48
    iput-object v0, v1, LN/N;->g:Ljava/util/ArrayList;

    .line 49
    .line 50
    return-object v1

    .line 51
    :cond_0
    new-instance v0, LN/N;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:Z

    .line 57
    .line 58
    iput-boolean v1, v0, LN/N;->h:Z

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    iput-boolean v1, v0, LN/N;->i:Z

    .line 62
    .line 63
    iput-boolean v1, v0, LN/N;->j:Z

    .line 64
    .line 65
    iput v1, v0, LN/N;->e:I

    .line 66
    .line 67
    invoke-virtual {p0}, LN/x;->p()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    const/4 v3, -0x1

    .line 72
    if-lez v2, :cond_6

    .line 73
    .line 74
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->P()V

    .line 75
    .line 76
    .line 77
    iput v1, v0, LN/N;->a:I

    .line 78
    .line 79
    iget-boolean v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->n:Z

    .line 80
    .line 81
    const/4 v4, 0x1

    .line 82
    if-eqz v2, :cond_1

    .line 83
    .line 84
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->N(Z)Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    goto :goto_0

    .line 89
    :cond_1
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->O(Z)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    :goto_0
    if-nez v2, :cond_5

    .line 94
    .line 95
    iput v3, v0, LN/N;->b:I

    .line 96
    .line 97
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    .line 98
    .line 99
    iput v2, v0, LN/N;->c:I

    .line 100
    .line 101
    new-array v2, v2, [I

    .line 102
    .line 103
    iput-object v2, v0, LN/N;->d:[I

    .line 104
    .line 105
    :goto_1
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    .line 106
    .line 107
    if-ge v1, v2, :cond_7

    .line 108
    .line 109
    const/high16 v2, -0x80000000

    .line 110
    .line 111
    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:[LN/O;

    .line 112
    .line 113
    aget-object v3, v3, v1

    .line 114
    .line 115
    iget v4, v3, LN/O;->b:I

    .line 116
    .line 117
    const/high16 v5, -0x80000000

    .line 118
    .line 119
    if-eq v4, v5, :cond_2

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_2
    iget-object v4, v3, LN/O;->a:Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-nez v4, :cond_3

    .line 129
    .line 130
    const/high16 v4, -0x80000000

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_3
    iget-object v4, v3, LN/O;->a:Ljava/util/ArrayList;

    .line 134
    .line 135
    const/4 v5, 0x0

    .line 136
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    check-cast v4, Landroid/view/View;

    .line 141
    .line 142
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    check-cast v5, LN/L;

    .line 147
    .line 148
    iget-object v6, v3, LN/O;->e:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 149
    .line 150
    iget-object v6, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:LN/q;

    .line 151
    .line 152
    invoke-virtual {v6, v4}, LN/q;->c(Landroid/view/View;)I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    iput v4, v3, LN/O;->b:I

    .line 157
    .line 158
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    iget v4, v3, LN/O;->b:I

    .line 162
    .line 163
    :goto_2
    if-eq v4, v2, :cond_4

    .line 164
    .line 165
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:LN/q;

    .line 166
    .line 167
    invoke-virtual {v2}, LN/q;->e()I

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    sub-int/2addr v4, v2

    .line 172
    :cond_4
    iget-object v2, v0, LN/N;->d:[I

    .line 173
    .line 174
    aput v4, v2, v1

    .line 175
    .line 176
    add-int/lit8 v1, v1, 0x1

    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_5
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    check-cast v0, LN/y;

    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    const/4 v0, 0x0

    .line 189
    throw v0

    .line 190
    :cond_6
    iput v3, v0, LN/N;->a:I

    .line 191
    .line 192
    iput v3, v0, LN/N;->b:I

    .line 193
    .line 194
    iput v1, v0, LN/N;->c:I

    .line 195
    .line 196
    :cond_7
    return-object v0
.end method

.method public final D(I)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->J()Z

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public final J()Z
    .locals 8

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    .line 2
    .line 3
    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->n:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-virtual {p0}, LN/x;->p()I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    const/4 v4, 0x0

    .line 11
    if-eqz v3, :cond_6

    .line 12
    .line 13
    iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->p:I

    .line 14
    .line 15
    if-eqz v3, :cond_6

    .line 16
    .line 17
    iget-boolean v3, p0, LN/x;->e:Z

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    goto :goto_3

    .line 22
    :cond_0
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->Q()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->P()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->P()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->Q()V

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-virtual {p0}, LN/x;->p()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    add-int/lit8 v5, v3, -0x1

    .line 42
    .line 43
    new-instance v6, Ljava/util/BitSet;

    .line 44
    .line 45
    invoke-direct {v6, v0}, Ljava/util/BitSet;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v6, v4, v0, v2}, Ljava/util/BitSet;->set(IIZ)V

    .line 49
    .line 50
    .line 51
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    .line 52
    .line 53
    const/4 v6, -0x1

    .line 54
    if-ne v0, v2, :cond_3

    .line 55
    .line 56
    iget-object v0, p0, LN/x;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 57
    .line 58
    sget-object v7, Ly/x;->a:Ljava/lang/reflect/Field;

    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-ne v0, v2, :cond_2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    const/4 v2, 0x0

    .line 68
    :cond_3
    :goto_1
    if-eqz v1, :cond_4

    .line 69
    .line 70
    const/4 v3, -0x1

    .line 71
    goto :goto_2

    .line 72
    :cond_4
    const/4 v5, 0x0

    .line 73
    :goto_2
    if-ne v5, v3, :cond_5

    .line 74
    .line 75
    return v4

    .line 76
    :cond_5
    invoke-virtual {p0, v5}, LN/x;->o(I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, LN/L;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    const/4 v0, 0x0

    .line 90
    throw v0

    .line 91
    :cond_6
    :goto_3
    return v4
.end method

.method public final K(LN/G;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, LN/x;->p()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:LN/q;

    .line 10
    .line 11
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    .line 12
    .line 13
    xor-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->O(Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->N(Z)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-boolean v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    .line 24
    .line 25
    move-object v0, p1

    .line 26
    move-object v4, p0

    .line 27
    invoke-static/range {v0 .. v5}, La1/a;->e(LN/G;LN/q;Landroid/view/View;Landroid/view/View;LN/x;Z)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1
.end method

.method public final L(LN/G;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LN/x;->p()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    .line 9
    .line 10
    xor-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->O(Z)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->N(Z)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p0}, LN/x;->p()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    invoke-virtual {p1}, LN/G;->a()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, LN/y;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    throw p1

    .line 48
    :cond_2
    :goto_0
    return-void
.end method

.method public final M(LN/G;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, LN/x;->p()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:LN/q;

    .line 10
    .line 11
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    .line 12
    .line 13
    xor-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->O(Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->N(Z)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-boolean v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    .line 24
    .line 25
    move-object v0, p1

    .line 26
    move-object v4, p0

    .line 27
    invoke-static/range {v0 .. v5}, La1/a;->f(LN/G;LN/q;Landroid/view/View;Landroid/view/View;LN/x;Z)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1
.end method

.method public final N(Z)Landroid/view/View;
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:LN/q;

    .line 2
    .line 3
    invoke-virtual {v0}, LN/q;->e()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:LN/q;

    .line 8
    .line 9
    invoke-virtual {v1}, LN/q;->d()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p0}, LN/x;->p()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    add-int/lit8 v2, v2, -0x1

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    :goto_0
    if-ltz v2, :cond_4

    .line 21
    .line 22
    invoke-virtual {p0, v2}, LN/x;->o(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:LN/q;

    .line 27
    .line 28
    invoke-virtual {v5, v4}, LN/q;->c(Landroid/view/View;)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:LN/q;

    .line 33
    .line 34
    invoke-virtual {v6, v4}, LN/q;->b(Landroid/view/View;)I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-le v6, v0, :cond_3

    .line 39
    .line 40
    if-lt v5, v1, :cond_0

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_0
    if-le v6, v1, :cond_2

    .line 44
    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    if-nez v3, :cond_3

    .line 49
    .line 50
    move-object v3, v4

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    :goto_1
    return-object v4

    .line 53
    :cond_3
    :goto_2
    add-int/lit8 v2, v2, -0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_4
    return-object v3
.end method

.method public final O(Z)Landroid/view/View;
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:LN/q;

    .line 2
    .line 3
    invoke-virtual {v0}, LN/q;->e()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:LN/q;

    .line 8
    .line 9
    invoke-virtual {v1}, LN/q;->d()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p0}, LN/x;->p()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    :goto_0
    if-ge v4, v2, :cond_4

    .line 20
    .line 21
    invoke-virtual {p0, v4}, LN/x;->o(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:LN/q;

    .line 26
    .line 27
    invoke-virtual {v6, v5}, LN/q;->c(Landroid/view/View;)I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:LN/q;

    .line 32
    .line 33
    invoke-virtual {v7, v5}, LN/q;->b(Landroid/view/View;)I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-le v7, v0, :cond_3

    .line 38
    .line 39
    if-lt v6, v1, :cond_0

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_0
    if-ge v6, v0, :cond_2

    .line 43
    .line 44
    if-nez p1, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    if-nez v3, :cond_3

    .line 48
    .line 49
    move-object v3, v5

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    :goto_1
    return-object v5

    .line 52
    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_4
    return-object v3
.end method

.method public final P()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LN/x;->p()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, v0}, LN/x;->o(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, LN/x;->v(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    throw v0
.end method

.method public final Q()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LN/x;->p()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 9
    .line 10
    invoke-virtual {p0, v0}, LN/x;->o(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, LN/x;->v(Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    throw v0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:LN/N;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LN/x;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    return v0
.end method

.method public final c()Z
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    :goto_0
    return v1
.end method

.method public final d(LN/y;)Z
    .locals 0

    .line 1
    instance-of p1, p1, LN/L;

    .line 2
    .line 3
    return p1
.end method

.method public final f(LN/G;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->K(LN/G;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final g(LN/G;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->L(LN/G;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final h(LN/G;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->M(LN/G;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final i(LN/G;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->K(LN/G;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final j(LN/G;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->L(LN/G;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final k(LN/G;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->M(LN/G;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final l()LN/y;
    .locals 3

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, -0x2

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, LN/L;

    .line 8
    .line 9
    invoke-direct {v0, v2, v1}, LN/y;-><init>(II)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    new-instance v0, LN/L;

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, LN/y;-><init>(II)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final m(Landroid/content/Context;Landroid/util/AttributeSet;)LN/y;
    .locals 1

    .line 1
    new-instance v0, LN/L;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, LN/y;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final n(Landroid/view/ViewGroup$LayoutParams;)LN/y;
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LN/L;

    .line 6
    .line 7
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 8
    .line 9
    invoke-direct {v0, p1}, LN/y;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    new-instance v0, LN/L;

    .line 14
    .line 15
    invoke-direct {v0, p1}, LN/y;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final q(LN/D;LN/G;)I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    .line 7
    .line 8
    return p1

    .line 9
    :cond_0
    invoke-super {p0, p1, p2}, LN/x;->q(LN/D;LN/G;)I

    .line 10
    .line 11
    .line 12
    return v1
.end method

.method public final x(LN/D;LN/G;)I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    .line 6
    .line 7
    return p1

    .line 8
    :cond_0
    invoke-super {p0, p1, p2}, LN/x;->x(LN/D;LN/G;)I

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1
.end method

.method public final y()Z
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->p:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    return v0
.end method

.method public final z(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 3

    .line 1
    iget-object v0, p0, LN/x;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->s:LD/b;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    .line 12
    .line 13
    if-ge v0, v1, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:[LN/O;

    .line 16
    .line 17
    aget-object v1, v1, v0

    .line 18
    .line 19
    iget-object v2, v1, LN/O;->a:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 22
    .line 23
    .line 24
    const/high16 v2, -0x80000000

    .line 25
    .line 26
    iput v2, v1, LN/O;->b:I

    .line 27
    .line 28
    iput v2, v1, LN/O;->c:I

    .line 29
    .line 30
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 34
    .line 35
    .line 36
    return-void
.end method
