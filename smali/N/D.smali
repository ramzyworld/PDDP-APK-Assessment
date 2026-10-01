.class public final LN/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/platform/h;


# instance fields
.field public a:I

.field public b:I

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN/D;->f:Ljava/lang/Object;

    .line 10
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LN/D;->c:Ljava/lang/Object;

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LN/D;->d:Ljava/lang/Object;

    .line 12
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    const/4 p1, 0x2

    .line 13
    iput p1, p0, LN/D;->a:I

    .line 14
    iput p1, p0, LN/D;->b:I

    return-void
.end method

.method public constructor <init>(Lio/flutter/view/TextureRegistry$ImageTextureEntry;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, LN/D;->a:I

    .line 3
    iput v0, p0, LN/D;->b:I

    .line 4
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, LN/D;->e:Ljava/lang/Object;

    .line 5
    new-instance v0, Lio/flutter/plugin/platform/b;

    invoke-direct {v0, p0}, Lio/flutter/plugin/platform/b;-><init>(LN/D;)V

    iput-object v0, p0, LN/D;->f:Ljava/lang/Object;

    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    .line 7
    iput-object p1, p0, LN/D;->c:Ljava/lang/Object;

    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "ImageReaderPlatformViewRenderTarget requires API version 29+"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 1
    iget-object v0, p0, LN/D;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/view/TextureRegistry$ImageTextureEntry;

    .line 4
    .line 5
    invoke-interface {v0}, Lio/flutter/view/TextureRegistry$ImageTextureEntry;->id()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public b(II)V
    .locals 4

    .line 1
    iget-object v0, p0, LN/D;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/ImageReader;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v1, p0, LN/D;->a:I

    .line 8
    .line 9
    if-ne v1, p1, :cond_0

    .line 10
    .line 11
    iget v1, p0, LN/D;->b:I

    .line 12
    .line 13
    if-ne v1, p2, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, LN/D;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lio/flutter/view/TextureRegistry$ImageTextureEntry;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-interface {v0, v1}, Lio/flutter/view/TextureRegistry$ImageTextureEntry;->pushImage(Landroid/media/Image;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, LN/D;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Landroid/media/ImageReader;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/media/ImageReader;->close()V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, LN/D;->d:Ljava/lang/Object;

    .line 34
    .line 35
    :cond_1
    iput p1, p0, LN/D;->a:I

    .line 36
    .line 37
    iput p2, p0, LN/D;->b:I

    .line 38
    .line 39
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 40
    .line 41
    iget-object v1, p0, LN/D;->e:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Landroid/os/Handler;

    .line 44
    .line 45
    const/16 v2, 0x21

    .line 46
    .line 47
    iget-object v3, p0, LN/D;->f:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v3, Lio/flutter/plugin/platform/b;

    .line 50
    .line 51
    if-lt v0, v2, :cond_2

    .line 52
    .line 53
    invoke-static {}, Lg0/b;->h()V

    .line 54
    .line 55
    .line 56
    iget p1, p0, LN/D;->a:I

    .line 57
    .line 58
    iget p2, p0, LN/D;->b:I

    .line 59
    .line 60
    invoke-static {p1, p2}, Lg0/b;->c(II)Landroid/media/ImageReader$Builder;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p1}, Lg0/b;->q(Landroid/media/ImageReader$Builder;)V

    .line 65
    .line 66
    .line 67
    invoke-static {p1}, Lg0/b;->n(Landroid/media/ImageReader$Builder;)V

    .line 68
    .line 69
    .line 70
    invoke-static {p1}, Lg0/b;->p(Landroid/media/ImageReader$Builder;)V

    .line 71
    .line 72
    .line 73
    invoke-static {p1}, Lg0/b;->d(Landroid/media/ImageReader$Builder;)Landroid/media/ImageReader;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p1, v3, v1}, Landroid/media/ImageReader;->setOnImageAvailableListener(Landroid/media/ImageReader$OnImageAvailableListener;Landroid/os/Handler;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    const/16 v2, 0x1d

    .line 82
    .line 83
    if-lt v0, v2, :cond_3

    .line 84
    .line 85
    invoke-static {p1, p2}, Landroidx/lifecycle/u;->C(II)Landroid/media/ImageReader;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p1, v3, v1}, Landroid/media/ImageReader;->setOnImageAvailableListener(Landroid/media/ImageReader$OnImageAvailableListener;Landroid/os/Handler;)V

    .line 90
    .line 91
    .line 92
    :goto_0
    iput-object p1, p0, LN/D;->d:Ljava/lang/Object;

    .line 93
    .line 94
    return-void

    .line 95
    :cond_3
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 96
    .line 97
    const-string p2, "ImageReaderPlatformViewRenderTarget requires API version 29+"

    .line 98
    .line 99
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p1
.end method

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, LN/D;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v1, v1, -0x1

    .line 10
    .line 11
    if-gez v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 14
    .line 15
    .line 16
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->n0:Z

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, LN/D;->f:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 23
    .line 24
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->a0:LN/j;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    iput v1, v0, LN/j;->c:I

    .line 31
    .line 32
    :cond_0
    return-void

    .line 33
    :cond_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->l0:[I

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    throw v0

    .line 43
    :cond_2
    new-instance v0, Ljava/lang/ClassCastException;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 46
    .line 47
    .line 48
    throw v0
.end method

.method public d(I)V
    .locals 6

    .line 1
    iget-object v0, p0, LN/D;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    if-ltz p1, :cond_4

    .line 6
    .line 7
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->b0:LN/G;

    .line 8
    .line 9
    invoke-virtual {v1}, LN/G;->a()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ge p1, v1, :cond_4

    .line 14
    .line 15
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->b0:LN/G;

    .line 16
    .line 17
    iget-boolean v2, v1, LN/G;->c:Z

    .line 18
    .line 19
    iget-object v2, p0, LN/D;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v4, 0x0

    .line 28
    if-gtz v3, :cond_3

    .line 29
    .line 30
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->h:LN/b;

    .line 31
    .line 32
    iget-object v2, v2, LN/b;->f:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    const/4 v5, 0x0

    .line 41
    if-gtz v3, :cond_2

    .line 42
    .line 43
    iget-object v2, p0, LN/D;->d:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v2, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-gtz v3, :cond_1

    .line 52
    .line 53
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->g:LN/b;

    .line 54
    .line 55
    invoke-virtual {v2, p1, v4}, LN/b;->w(II)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-ltz v2, :cond_0

    .line 60
    .line 61
    throw v5

    .line 62
    :cond_0
    new-instance v3, Ljava/lang/IndexOutOfBoundsException;

    .line 63
    .line 64
    new-instance v4, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    const-string v5, "Inconsistency detected. Invalid item position "

    .line 67
    .line 68
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string p1, "(offset:"

    .line 75
    .line 76
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string p1, ").state:"

    .line 83
    .line 84
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, LN/G;->a()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->h()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-direct {v3, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw v3

    .line 109
    :cond_1
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    new-instance p1, Ljava/lang/ClassCastException;

    .line 117
    .line 118
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 119
    .line 120
    .line 121
    throw p1

    .line 122
    :cond_2
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    check-cast p1, Landroid/view/View;

    .line 127
    .line 128
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->j(Landroid/view/View;)V

    .line 129
    .line 130
    .line 131
    throw v5

    .line 132
    :cond_3
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    new-instance p1, Ljava/lang/ClassCastException;

    .line 140
    .line 141
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 142
    .line 143
    .line 144
    throw p1

    .line 145
    :cond_4
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    .line 146
    .line 147
    new-instance v2, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    const-string v3, "Invalid item position "

    .line 150
    .line 151
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string v3, "("

    .line 158
    .line 159
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    const-string p1, "). Item count:"

    .line 166
    .line 167
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    iget-object p1, v0, Landroidx/recyclerview/widget/RecyclerView;->b0:LN/G;

    .line 171
    .line 172
    invoke-virtual {p1}, LN/G;->a()I

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->h()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    throw v1
.end method

.method public e()V
    .locals 4

    .line 1
    iget-object v0, p0, LN/D;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->m:LN/x;

    .line 6
    .line 7
    iget v0, p0, LN/D;->a:I

    .line 8
    .line 9
    iput v0, p0, LN/D;->b:I

    .line 10
    .line 11
    iget-object v0, p0, LN/D;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/lit8 v1, v1, -0x1

    .line 20
    .line 21
    if-ltz v1, :cond_2

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    iget v3, p0, LN/D;->b:I

    .line 28
    .line 29
    if-gt v2, v3, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->l0:[I

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    throw v0

    .line 42
    :cond_1
    new-instance v0, Ljava/lang/ClassCastException;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 45
    .line 46
    .line 47
    throw v0

    .line 48
    :cond_2
    :goto_0
    return-void
.end method

.method public getHeight()I
    .locals 1

    .line 1
    iget v0, p0, LN/D;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public getSurface()Landroid/view/Surface;
    .locals 1

    .line 1
    iget-object v0, p0, LN/D;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/ImageReader;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getWidth()I
    .locals 1

    .line 1
    iget v0, p0, LN/D;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public release()V
    .locals 2

    .line 1
    iget-object v0, p0, LN/D;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/ImageReader;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, LN/D;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lio/flutter/view/TextureRegistry$ImageTextureEntry;

    .line 11
    .line 12
    invoke-interface {v0, v1}, Lio/flutter/view/TextureRegistry$ImageTextureEntry;->pushImage(Landroid/media/Image;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, LN/D;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Landroid/media/ImageReader;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/media/ImageReader;->close()V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, LN/D;->d:Ljava/lang/Object;

    .line 23
    .line 24
    :cond_0
    iput-object v1, p0, LN/D;->c:Ljava/lang/Object;

    .line 25
    .line 26
    return-void
.end method

.method public synthetic scheduleFrame()V
    .locals 0

    .line 1
    return-void
.end method
