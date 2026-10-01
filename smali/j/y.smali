.class public abstract Lj/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[I

.field public static final b:[I

.field public static final c:Landroid/graphics/Rect;

.field public static final d:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const v0, 0x10100a0

    .line 2
    .line 3
    .line 4
    filled-new-array {v0}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lj/y;->a:[I

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    new-array v0, v0, [I

    .line 12
    .line 13
    sput-object v0, Lj/y;->b:[I

    .line 14
    .line 15
    new-instance v0, Landroid/graphics/Rect;

    .line 16
    .line 17
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lj/y;->c:Landroid/graphics/Rect;

    .line 21
    .line 22
    :try_start_0
    const-string v0, "android.graphics.Insets"

    .line 23
    .line 24
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lj/y;->d:Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    :catch_0
    return-void
.end method

.method public static a(Landroid/graphics/drawable/Drawable;)Z
    .locals 4

    .line 1
    instance-of v0, p0, Landroid/graphics/drawable/DrawableContainer;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    instance-of v0, p0, Landroid/graphics/drawable/DrawableContainer$DrawableContainerState;

    .line 10
    .line 11
    if-eqz v0, :cond_4

    .line 12
    .line 13
    check-cast p0, Landroid/graphics/drawable/DrawableContainer$DrawableContainerState;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/graphics/drawable/DrawableContainer$DrawableContainerState;->getChildren()[Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    array-length v0, p0

    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    :goto_0
    if-ge v2, v0, :cond_4

    .line 23
    .line 24
    aget-object v3, p0, v2

    .line 25
    .line 26
    invoke-static {v3}, Lj/y;->a(Landroid/graphics/drawable/Drawable;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    return v1

    .line 33
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    instance-of v0, p0, Ls/e;

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    check-cast p0, Ls/e;

    .line 41
    .line 42
    check-cast p0, Ls/f;

    .line 43
    .line 44
    iget-object p0, p0, Ls/f;->j:Landroid/graphics/drawable/Drawable;

    .line 45
    .line 46
    invoke-static {p0}, Lj/y;->a(Landroid/graphics/drawable/Drawable;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    return p0

    .line 51
    :cond_2
    instance-of v0, p0, Lj/z;

    .line 52
    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    check-cast p0, Lj/z;

    .line 56
    .line 57
    iget-object p0, p0, Lj/z;->e:Landroid/graphics/drawable/Drawable;

    .line 58
    .line 59
    invoke-static {p0}, Lj/y;->a(Landroid/graphics/drawable/Drawable;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    return p0

    .line 64
    :cond_3
    instance-of v0, p0, Landroid/graphics/drawable/ScaleDrawable;

    .line 65
    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    check-cast p0, Landroid/graphics/drawable/ScaleDrawable;

    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/graphics/drawable/ScaleDrawable;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-static {p0}, Lj/y;->a(Landroid/graphics/drawable/Drawable;)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    return p0

    .line 79
    :cond_4
    const/4 p0, 0x1

    .line 80
    return p0
.end method

.method public static b(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    if-ne v0, v1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "android.graphics.drawable.VectorDrawable"

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    array-length v1, v0

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    sget-object v1, Lj/y;->b:[I

    .line 34
    .line 35
    invoke-virtual {p0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    sget-object v1, Lj/y;->a:[I

    .line 40
    .line 41
    invoke-virtual {p0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 42
    .line 43
    .line 44
    :goto_1
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 45
    .line 46
    .line 47
    :cond_2
    return-void
.end method

.method public static c(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;
    .locals 11

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Landroidx/lifecycle/u;->d(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance v0, Landroid/graphics/Rect;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, Landroidx/lifecycle/u;->a(Landroid/graphics/Insets;)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 21
    .line 22
    invoke-static {p0}, Landroidx/lifecycle/u;->v(Landroid/graphics/Insets;)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 27
    .line 28
    invoke-static {p0}, Landroidx/lifecycle/u;->B(Landroid/graphics/Insets;)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 33
    .line 34
    invoke-static {p0}, Landroidx/lifecycle/u;->D(Landroid/graphics/Insets;)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    iput p0, v0, Landroid/graphics/Rect;->bottom:I

    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_0
    sget-object v0, Lj/y;->d:Ljava/lang/Class;

    .line 42
    .line 43
    if-eqz v0, :cond_8

    .line 44
    .line 45
    :try_start_0
    instance-of v1, p0, Ls/e;

    .line 46
    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    check-cast p0, Ls/e;

    .line 50
    .line 51
    check-cast p0, Ls/f;

    .line 52
    .line 53
    iget-object p0, p0, Ls/f;->j:Landroid/graphics/drawable/Drawable;

    .line 54
    .line 55
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const-string v2, "getOpticalInsets"

    .line 60
    .line 61
    const/4 v3, 0x0

    .line 62
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    if-eqz p0, :cond_8

    .line 71
    .line 72
    new-instance v1, Landroid/graphics/Rect;

    .line 73
    .line 74
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    array-length v2, v0

    .line 82
    const/4 v3, 0x0

    .line 83
    const/4 v4, 0x0

    .line 84
    :goto_0
    if-ge v4, v2, :cond_7

    .line 85
    .line 86
    aget-object v5, v0, v4

    .line 87
    .line 88
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    const/4 v8, 0x1

    .line 97
    const/4 v9, 0x3

    .line 98
    const/4 v10, 0x2

    .line 99
    sparse-switch v7, :sswitch_data_0

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :sswitch_0
    const-string v7, "right"

    .line 104
    .line 105
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    if-eqz v6, :cond_2

    .line 110
    .line 111
    const/4 v6, 0x2

    .line 112
    goto :goto_2

    .line 113
    :sswitch_1
    const-string v7, "left"

    .line 114
    .line 115
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    if-eqz v6, :cond_2

    .line 120
    .line 121
    const/4 v6, 0x0

    .line 122
    goto :goto_2

    .line 123
    :sswitch_2
    const-string v7, "top"

    .line 124
    .line 125
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-eqz v6, :cond_2

    .line 130
    .line 131
    const/4 v6, 0x1

    .line 132
    goto :goto_2

    .line 133
    :sswitch_3
    const-string v7, "bottom"

    .line 134
    .line 135
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    if-eqz v6, :cond_2

    .line 140
    .line 141
    const/4 v6, 0x3

    .line 142
    goto :goto_2

    .line 143
    :cond_2
    :goto_1
    const/4 v6, -0x1

    .line 144
    :goto_2
    if-eqz v6, :cond_6

    .line 145
    .line 146
    if-eq v6, v8, :cond_5

    .line 147
    .line 148
    if-eq v6, v10, :cond_4

    .line 149
    .line 150
    if-eq v6, v9, :cond_3

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_3
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    iput v5, v1, Landroid/graphics/Rect;->bottom:I

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_4
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    iput v5, v1, Landroid/graphics/Rect;->right:I

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_5
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    iput v5, v1, Landroid/graphics/Rect;->top:I

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_6
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    iput v5, v1, Landroid/graphics/Rect;->left:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 179
    .line 180
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 181
    .line 182
    goto :goto_0

    .line 183
    :cond_7
    return-object v1

    .line 184
    :catch_0
    const-string p0, "DrawableUtils"

    .line 185
    .line 186
    const-string v0, "Couldn\'t obtain the optical insets. Ignoring."

    .line 187
    .line 188
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 189
    .line 190
    .line 191
    :cond_8
    sget-object p0, Lj/y;->c:Landroid/graphics/Rect;

    .line 192
    .line 193
    return-object p0

    .line 194
    nop

    .line 195
    :sswitch_data_0
    .sparse-switch
        -0x527265d5 -> :sswitch_3
        0x1c155 -> :sswitch_2
        0x32a007 -> :sswitch_1
        0x677c21c -> :sswitch_0
    .end sparse-switch
.end method

.method public static d(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    if-eq p0, v0, :cond_2

    .line 3
    .line 4
    const/4 v0, 0x5

    .line 5
    if-eq p0, v0, :cond_1

    .line 6
    .line 7
    const/16 v0, 0x9

    .line 8
    .line 9
    if-eq p0, v0, :cond_0

    .line 10
    .line 11
    packed-switch p0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->ADD:Landroid/graphics/PorterDuff$Mode;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_1
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SCREEN:Landroid/graphics/PorterDuff$Mode;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_2
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_2
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
