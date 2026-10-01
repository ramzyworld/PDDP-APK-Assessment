.class public final Lj/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Lj/o;

.field public c:I

.field public d:Lj/j0;

.field public e:Lj/j0;

.field public f:Lj/j0;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lj/n;->c:I

    .line 6
    .line 7
    iput-object p1, p0, Lj/n;->a:Landroid/view/View;

    .line 8
    .line 9
    sget-object p1, Lj/o;->b:Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    const-class p1, Lj/o;

    .line 12
    .line 13
    monitor-enter p1

    .line 14
    :try_start_0
    sget-object v0, Lj/o;->c:Lj/o;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-static {}, Lj/o;->b()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    sget-object v0, Lj/o;->c:Lj/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    monitor-exit p1

    .line 27
    iput-object v0, p0, Lj/n;->b:Lj/o;

    .line 28
    .line 29
    return-void

    .line 30
    :goto_1
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    throw v0
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lj/n;->a:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_7

    .line 8
    .line 9
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v3, 0x15

    .line 12
    .line 13
    if-le v2, v3, :cond_0

    .line 14
    .line 15
    iget-object v2, p0, Lj/n;->d:Lj/j0;

    .line 16
    .line 17
    if-eqz v2, :cond_5

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    if-ne v2, v3, :cond_5

    .line 21
    .line 22
    :goto_0
    iget-object v2, p0, Lj/n;->f:Lj/j0;

    .line 23
    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    new-instance v2, Lj/j0;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v2, p0, Lj/n;->f:Lj/j0;

    .line 32
    .line 33
    :cond_1
    iget-object v2, p0, Lj/n;->f:Lj/j0;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    iput-object v3, v2, Lj/j0;->a:Landroid/content/res/ColorStateList;

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    iput-boolean v4, v2, Lj/j0;->d:Z

    .line 40
    .line 41
    iput-object v3, v2, Lj/j0;->b:Landroid/graphics/PorterDuff$Mode;

    .line 42
    .line 43
    iput-boolean v4, v2, Lj/j0;->c:Z

    .line 44
    .line 45
    sget-object v3, Ly/x;->a:Ljava/lang/reflect/Field;

    .line 46
    .line 47
    invoke-static {v0}, Ly/p;->g(Landroid/view/View;)Landroid/content/res/ColorStateList;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    const/4 v4, 0x1

    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    iput-boolean v4, v2, Lj/j0;->d:Z

    .line 55
    .line 56
    iput-object v3, v2, Lj/j0;->a:Landroid/content/res/ColorStateList;

    .line 57
    .line 58
    :cond_2
    invoke-static {v0}, Ly/p;->h(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    if-eqz v3, :cond_3

    .line 63
    .line 64
    iput-boolean v4, v2, Lj/j0;->c:Z

    .line 65
    .line 66
    iput-object v3, v2, Lj/j0;->b:Landroid/graphics/PorterDuff$Mode;

    .line 67
    .line 68
    :cond_3
    iget-boolean v3, v2, Lj/j0;->d:Z

    .line 69
    .line 70
    if-nez v3, :cond_4

    .line 71
    .line 72
    iget-boolean v3, v2, Lj/j0;->c:Z

    .line 73
    .line 74
    if-eqz v3, :cond_5

    .line 75
    .line 76
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v1, v2, v0}, Lj/o;->c(Landroid/graphics/drawable/Drawable;Lj/j0;[I)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_5
    iget-object v2, p0, Lj/n;->e:Lj/j0;

    .line 85
    .line 86
    if-eqz v2, :cond_6

    .line 87
    .line 88
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {v1, v2, v0}, Lj/o;->c(Landroid/graphics/drawable/Drawable;Lj/j0;[I)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_6
    iget-object v2, p0, Lj/n;->d:Lj/j0;

    .line 97
    .line 98
    if-eqz v2, :cond_7

    .line 99
    .line 100
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-static {v1, v2, v0}, Lj/o;->c(Landroid/graphics/drawable/Drawable;Lj/j0;[I)V

    .line 105
    .line 106
    .line 107
    :cond_7
    :goto_1
    return-void
.end method

.method public final b(Landroid/util/AttributeSet;I)V
    .locals 7

    .line 1
    iget-object v0, p0, Lj/n;->a:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, Lc/a;->u:[I

    .line 8
    .line 9
    invoke-static {v1, p1, v2, p2}, LN/b;->I(Landroid/content/Context;Landroid/util/AttributeSet;[II)LN/b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object p2, p1, LN/b;->f:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p2, Landroid/content/res/TypedArray;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    :try_start_0
    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, -0x1

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p2, v1, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iput v2, p0, Lj/n;->c:I

    .line 30
    .line 31
    iget-object v2, p0, Lj/n;->b:Lj/o;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget v5, p0, Lj/n;->c:I

    .line 38
    .line 39
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    :try_start_1
    iget-object v6, v2, Lj/o;->a:Lj/P;

    .line 41
    .line 42
    invoke-virtual {v6, v4, v5}, Lj/P;->i(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 43
    .line 44
    .line 45
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 46
    :try_start_2
    monitor-exit v2

    .line 47
    if-eqz v4, :cond_0

    .line 48
    .line 49
    invoke-virtual {p0, v4}, Lj/n;->d(Landroid/content/res/ColorStateList;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception p2

    .line 54
    goto/16 :goto_3

    .line 55
    .line 56
    :catchall_1
    move-exception p2

    .line 57
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 58
    :try_start_4
    throw p2

    .line 59
    :cond_0
    :goto_0
    const/4 v2, 0x1

    .line 60
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    const/16 v5, 0x15

    .line 65
    .line 66
    if-eqz v4, :cond_4

    .line 67
    .line 68
    invoke-virtual {p1, v2}, LN/b;->x(I)Landroid/content/res/ColorStateList;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    sget-object v6, Ly/x;->a:Ljava/lang/reflect/Field;

    .line 73
    .line 74
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 75
    .line 76
    invoke-static {v0, v4}, Ly/p;->q(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 77
    .line 78
    .line 79
    if-ne v6, v5, :cond_4

    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-static {v0}, Ly/p;->g(Landroid/view/View;)Landroid/content/res/ColorStateList;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    if-nez v6, :cond_2

    .line 90
    .line 91
    invoke-static {v0}, Ly/p;->h(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    if-eqz v6, :cond_1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_1
    const/4 v6, 0x0

    .line 99
    goto :goto_2

    .line 100
    :cond_2
    :goto_1
    const/4 v6, 0x1

    .line 101
    :goto_2
    if-eqz v4, :cond_4

    .line 102
    .line 103
    if-eqz v6, :cond_4

    .line 104
    .line 105
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    if-eqz v6, :cond_3

    .line 110
    .line 111
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    invoke-virtual {v4, v6}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 116
    .line 117
    .line 118
    :cond_3
    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 119
    .line 120
    .line 121
    :cond_4
    const/4 v4, 0x2

    .line 122
    invoke-virtual {p2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    if-eqz v6, :cond_8

    .line 127
    .line 128
    invoke-virtual {p2, v4, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    const/4 v3, 0x0

    .line 133
    invoke-static {p2, v3}, Lj/y;->d(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    sget-object v3, Ly/x;->a:Ljava/lang/reflect/Field;

    .line 138
    .line 139
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 140
    .line 141
    invoke-static {v0, p2}, Ly/p;->r(Landroid/view/View;Landroid/graphics/PorterDuff$Mode;)V

    .line 142
    .line 143
    .line 144
    if-ne v3, v5, :cond_8

    .line 145
    .line 146
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    invoke-static {v0}, Ly/p;->g(Landroid/view/View;)Landroid/content/res/ColorStateList;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    if-nez v3, :cond_5

    .line 155
    .line 156
    invoke-static {v0}, Ly/p;->h(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    if-eqz v3, :cond_6

    .line 161
    .line 162
    :cond_5
    const/4 v1, 0x1

    .line 163
    :cond_6
    if-eqz p2, :cond_8

    .line 164
    .line 165
    if-eqz v1, :cond_8

    .line 166
    .line 167
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-eqz v1, :cond_7

    .line 172
    .line 173
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {p2, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 178
    .line 179
    .line 180
    :cond_7
    invoke-virtual {v0, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 181
    .line 182
    .line 183
    :cond_8
    invoke-virtual {p1}, LN/b;->L()V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :goto_3
    invoke-virtual {p1}, LN/b;->L()V

    .line 188
    .line 189
    .line 190
    throw p2
.end method

.method public final c(I)V
    .locals 3

    .line 1
    iput p1, p0, Lj/n;->c:I

    .line 2
    .line 3
    iget-object v0, p0, Lj/n;->b:Lj/o;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lj/n;->a:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    iget-object v2, v0, Lj/o;->a:Lj/P;

    .line 15
    .line 16
    invoke-virtual {v2, v1, p1}, Lj/P;->i(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    .line 19
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    monitor-exit v0

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    throw p1

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    :goto_0
    invoke-virtual {p0, p1}, Lj/n;->d(Landroid/content/res/ColorStateList;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lj/n;->a()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final d(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lj/n;->d:Lj/j0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lj/j0;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lj/n;->d:Lj/j0;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lj/n;->d:Lj/j0;

    .line 15
    .line 16
    iput-object p1, v0, Lj/j0;->a:Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput-boolean p1, v0, Lj/j0;->d:Z

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    iput-object p1, p0, Lj/n;->d:Lj/j0;

    .line 24
    .line 25
    :goto_0
    invoke-virtual {p0}, Lj/n;->a()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final e(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lj/n;->e:Lj/j0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lj/j0;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lj/n;->e:Lj/j0;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lj/n;->e:Lj/j0;

    .line 13
    .line 14
    iput-object p1, v0, Lj/j0;->a:Landroid/content/res/ColorStateList;

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, v0, Lj/j0;->d:Z

    .line 18
    .line 19
    invoke-virtual {p0}, Lj/n;->a()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final f(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lj/n;->e:Lj/j0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lj/j0;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lj/n;->e:Lj/j0;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lj/n;->e:Lj/j0;

    .line 13
    .line 14
    iput-object p1, v0, Lj/j0;->b:Landroid/graphics/PorterDuff$Mode;

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, v0, Lj/j0;->c:Z

    .line 18
    .line 19
    invoke-virtual {p0}, Lj/n;->a()V

    .line 20
    .line 21
    .line 22
    return-void
.end method
