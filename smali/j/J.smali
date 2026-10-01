.class public abstract Lj/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li/r;


# static fields
.field public static final A:Ljava/lang/reflect/Method;

.field public static final B:Ljava/lang/reflect/Method;

.field public static final C:Ljava/lang/reflect/Method;


# instance fields
.field public final e:Landroid/content/Context;

.field public f:Landroid/widget/ListAdapter;

.field public g:Lj/L;

.field public h:I

.field public i:I

.field public j:I

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:I

.field public o:LE/b;

.field public p:Landroid/view/View;

.field public q:Li/l;

.field public final r:Lj/G;

.field public final s:Lj/I;

.field public final t:Lj/H;

.field public final u:Lj/G;

.field public final v:Landroid/os/Handler;

.field public final w:Landroid/graphics/Rect;

.field public x:Landroid/graphics/Rect;

.field public y:Z

.field public final z:Lj/r;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v3, 0x1c

    .line 6
    .line 7
    const-string v4, "ListPopupWindow"

    .line 8
    .line 9
    const-class v5, Landroid/widget/PopupWindow;

    .line 10
    .line 11
    if-gt v2, v3, :cond_0

    .line 12
    .line 13
    :try_start_0
    const-string v2, "setClipToScreenEnabled"

    .line 14
    .line 15
    new-array v3, v1, [Ljava/lang/Class;

    .line 16
    .line 17
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    aput-object v6, v3, v0

    .line 20
    .line 21
    invoke-virtual {v5, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    sput-object v2, Lj/J;->A:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catch_0
    const-string v2, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well."

    .line 29
    .line 30
    invoke-static {v4, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    :goto_0
    :try_start_1
    const-string v2, "setEpicenterBounds"

    .line 34
    .line 35
    new-array v3, v1, [Ljava/lang/Class;

    .line 36
    .line 37
    const-class v6, Landroid/graphics/Rect;

    .line 38
    .line 39
    aput-object v6, v3, v0

    .line 40
    .line 41
    invoke-virtual {v5, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    sput-object v2, Lj/J;->C:Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catch_1
    const-string v2, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well."

    .line 49
    .line 50
    invoke-static {v4, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    :cond_0
    :goto_1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 54
    .line 55
    const/16 v3, 0x17

    .line 56
    .line 57
    if-gt v2, v3, :cond_1

    .line 58
    .line 59
    :try_start_2
    const-string v2, "getMaxAvailableHeight"

    .line 60
    .line 61
    const/4 v3, 0x3

    .line 62
    new-array v3, v3, [Ljava/lang/Class;

    .line 63
    .line 64
    const-class v6, Landroid/view/View;

    .line 65
    .line 66
    aput-object v6, v3, v0

    .line 67
    .line 68
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 69
    .line 70
    aput-object v0, v3, v1

    .line 71
    .line 72
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 73
    .line 74
    const/4 v1, 0x2

    .line 75
    aput-object v0, v3, v1

    .line 76
    .line 77
    invoke-virtual {v5, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sput-object v0, Lj/J;->B:Ljava/lang/reflect/Method;
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_2

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :catch_2
    const-string v0, "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well."

    .line 85
    .line 86
    invoke-static {v4, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    :cond_1
    :goto_2
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x2

    .line 5
    iput v0, p0, Lj/J;->h:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lj/J;->n:I

    .line 9
    .line 10
    new-instance v1, Lj/G;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v1, p0, v2}, Lj/G;-><init>(Lj/J;I)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lj/J;->r:Lj/G;

    .line 17
    .line 18
    new-instance v1, Lj/I;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Lj/I;-><init>(Lj/J;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lj/J;->s:Lj/I;

    .line 24
    .line 25
    new-instance v1, Lj/H;

    .line 26
    .line 27
    invoke-direct {v1, p0}, Lj/H;-><init>(Lj/J;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lj/J;->t:Lj/H;

    .line 31
    .line 32
    new-instance v1, Lj/G;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-direct {v1, p0, v2}, Lj/G;-><init>(Lj/J;I)V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, Lj/J;->u:Lj/G;

    .line 39
    .line 40
    new-instance v1, Landroid/graphics/Rect;

    .line 41
    .line 42
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, Lj/J;->w:Landroid/graphics/Rect;

    .line 46
    .line 47
    iput-object p1, p0, Lj/J;->e:Landroid/content/Context;

    .line 48
    .line 49
    new-instance v1, Landroid/os/Handler;

    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 56
    .line 57
    .line 58
    iput-object v1, p0, Lj/J;->v:Landroid/os/Handler;

    .line 59
    .line 60
    sget-object v1, Lc/a;->k:[I

    .line 61
    .line 62
    const/4 v2, 0x0

    .line 63
    invoke-virtual {p1, v2, v1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1, v0, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    iput v3, p0, Lj/J;->i:I

    .line 72
    .line 73
    const/4 v3, 0x1

    .line 74
    invoke-virtual {v1, v3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    iput v4, p0, Lj/J;->j:I

    .line 79
    .line 80
    if-eqz v4, :cond_0

    .line 81
    .line 82
    iput-boolean v3, p0, Lj/J;->k:Z

    .line 83
    .line 84
    :cond_0
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 85
    .line 86
    .line 87
    new-instance v1, Lj/r;

    .line 88
    .line 89
    invoke-direct {v1, p1, v2, p2, v0}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 90
    .line 91
    .line 92
    sget-object v4, Lc/a;->o:[I

    .line 93
    .line 94
    invoke-virtual {p1, v2, v4, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    const/4 v2, 0x2

    .line 99
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-eqz v4, :cond_1

    .line 104
    .line 105
    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    invoke-static {v1, v2}, La/a;->E(Lj/r;Z)V

    .line 110
    .line 111
    .line 112
    :cond_1
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_2

    .line 117
    .line 118
    invoke-virtual {p2, v0, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-eqz v2, :cond_2

    .line 123
    .line 124
    invoke-static {p1, v2}, Ld/b;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    goto :goto_0

    .line 129
    :cond_2
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    :goto_0
    invoke-virtual {v1, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 137
    .line 138
    .line 139
    iput-object v1, p0, Lj/J;->z:Lj/r;

    .line 140
    .line 141
    invoke-virtual {v1, v3}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 142
    .line 143
    .line 144
    return-void
.end method


# virtual methods
.method public final a(Landroid/widget/ListAdapter;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lj/J;->o:LE/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LE/b;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p0}, LE/b;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lj/J;->o:LE/b;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v1, p0, Lj/J;->f:Landroid/widget/ListAdapter;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v1, v0}, Landroid/widget/Adapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    :goto_0
    iput-object p1, p0, Lj/J;->f:Landroid/widget/ListAdapter;

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    iget-object v0, p0, Lj/J;->o:LE/b;

    .line 26
    .line 27
    invoke-interface {p1, v0}, Landroid/widget/Adapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 28
    .line 29
    .line 30
    :cond_2
    iget-object p1, p0, Lj/J;->g:Lj/L;

    .line 31
    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    iget-object v0, p0, Lj/J;->f:Landroid/widget/ListAdapter;

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 37
    .line 38
    .line 39
    :cond_3
    return-void
.end method

.method public final c()V
    .locals 15

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    iget-object v3, p0, Lj/J;->g:Lj/L;

    .line 5
    .line 6
    iget-object v4, p0, Lj/J;->z:Lj/r;

    .line 7
    .line 8
    iget-object v5, p0, Lj/J;->e:Landroid/content/Context;

    .line 9
    .line 10
    if-nez v3, :cond_0

    .line 11
    .line 12
    iget-boolean v3, p0, Lj/J;->y:Z

    .line 13
    .line 14
    xor-int/2addr v3, v1

    .line 15
    move-object v6, p0

    .line 16
    check-cast v6, Lj/M;

    .line 17
    .line 18
    new-instance v7, Lj/L;

    .line 19
    .line 20
    invoke-direct {v7, v5, v3}, Lj/L;-><init>(Landroid/content/Context;Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v7, v6}, Lj/L;->setHoverListener(Lj/K;)V

    .line 24
    .line 25
    .line 26
    iput-object v7, p0, Lj/J;->g:Lj/L;

    .line 27
    .line 28
    iget-object v3, p0, Lj/J;->f:Landroid/widget/ListAdapter;

    .line 29
    .line 30
    invoke-virtual {v7, v3}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 31
    .line 32
    .line 33
    iget-object v3, p0, Lj/J;->g:Lj/L;

    .line 34
    .line 35
    iget-object v6, p0, Lj/J;->q:Li/l;

    .line 36
    .line 37
    invoke-virtual {v3, v6}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 38
    .line 39
    .line 40
    iget-object v3, p0, Lj/J;->g:Lj/L;

    .line 41
    .line 42
    invoke-virtual {v3, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 43
    .line 44
    .line 45
    iget-object v3, p0, Lj/J;->g:Lj/L;

    .line 46
    .line 47
    invoke-virtual {v3, v1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 48
    .line 49
    .line 50
    iget-object v3, p0, Lj/J;->g:Lj/L;

    .line 51
    .line 52
    new-instance v6, Lj/F;

    .line 53
    .line 54
    invoke-direct {v6, v2, p0}, Lj/F;-><init>(ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v6}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 58
    .line 59
    .line 60
    iget-object v3, p0, Lj/J;->g:Lj/L;

    .line 61
    .line 62
    iget-object v6, p0, Lj/J;->t:Lj/H;

    .line 63
    .line 64
    invoke-virtual {v3, v6}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 65
    .line 66
    .line 67
    iget-object v3, p0, Lj/J;->g:Lj/L;

    .line 68
    .line 69
    invoke-virtual {v4, v3}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    invoke-virtual {v4}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    check-cast v3, Landroid/view/ViewGroup;

    .line 78
    .line 79
    :goto_0
    invoke-virtual {v4}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    iget-object v6, p0, Lj/J;->w:Landroid/graphics/Rect;

    .line 84
    .line 85
    if-eqz v3, :cond_1

    .line 86
    .line 87
    invoke-virtual {v3, v6}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 88
    .line 89
    .line 90
    iget v3, v6, Landroid/graphics/Rect;->top:I

    .line 91
    .line 92
    iget v7, v6, Landroid/graphics/Rect;->bottom:I

    .line 93
    .line 94
    add-int/2addr v7, v3

    .line 95
    iget-boolean v8, p0, Lj/J;->k:Z

    .line 96
    .line 97
    if-nez v8, :cond_2

    .line 98
    .line 99
    neg-int v3, v3

    .line 100
    iput v3, p0, Lj/J;->j:I

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_1
    invoke-virtual {v6}, Landroid/graphics/Rect;->setEmpty()V

    .line 104
    .line 105
    .line 106
    const/4 v7, 0x0

    .line 107
    :cond_2
    :goto_1
    invoke-virtual {v4}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-ne v3, v0, :cond_3

    .line 112
    .line 113
    const/4 v3, 0x1

    .line 114
    goto :goto_2

    .line 115
    :cond_3
    const/4 v3, 0x0

    .line 116
    :goto_2
    iget-object v8, p0, Lj/J;->p:Landroid/view/View;

    .line 117
    .line 118
    iget v9, p0, Lj/J;->j:I

    .line 119
    .line 120
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 121
    .line 122
    const/16 v11, 0x17

    .line 123
    .line 124
    const-string v12, "ListPopupWindow"

    .line 125
    .line 126
    if-gt v10, v11, :cond_5

    .line 127
    .line 128
    sget-object v10, Lj/J;->B:Ljava/lang/reflect/Method;

    .line 129
    .line 130
    if-eqz v10, :cond_4

    .line 131
    .line 132
    :try_start_0
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v13

    .line 136
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    const/4 v14, 0x3

    .line 141
    new-array v14, v14, [Ljava/lang/Object;

    .line 142
    .line 143
    aput-object v8, v14, v2

    .line 144
    .line 145
    aput-object v13, v14, v1

    .line 146
    .line 147
    aput-object v3, v14, v0

    .line 148
    .line 149
    invoke-virtual {v10, v4, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    check-cast v0, Ljava/lang/Integer;

    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 156
    .line 157
    .line 158
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 159
    goto :goto_3

    .line 160
    :catch_0
    const-string v0, "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version."

    .line 161
    .line 162
    invoke-static {v12, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 163
    .line 164
    .line 165
    :cond_4
    invoke-virtual {v4, v8, v9}, Landroid/widget/PopupWindow;->getMaxAvailableHeight(Landroid/view/View;I)I

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    goto :goto_3

    .line 170
    :cond_5
    invoke-static {v4, v8, v9, v3}, LL/a;->c(Lj/r;Landroid/view/View;IZ)I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    :goto_3
    iget v3, p0, Lj/J;->h:I

    .line 175
    .line 176
    const/4 v8, -0x2

    .line 177
    const/4 v9, -0x1

    .line 178
    if-eq v3, v8, :cond_7

    .line 179
    .line 180
    const/high16 v10, 0x40000000    # 2.0f

    .line 181
    .line 182
    if-eq v3, v9, :cond_6

    .line 183
    .line 184
    invoke-static {v3, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    goto :goto_4

    .line 189
    :cond_6
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 198
    .line 199
    iget v5, v6, Landroid/graphics/Rect;->left:I

    .line 200
    .line 201
    iget v6, v6, Landroid/graphics/Rect;->right:I

    .line 202
    .line 203
    add-int/2addr v5, v6

    .line 204
    sub-int/2addr v3, v5

    .line 205
    invoke-static {v3, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    goto :goto_4

    .line 210
    :cond_7
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 219
    .line 220
    iget v5, v6, Landroid/graphics/Rect;->left:I

    .line 221
    .line 222
    iget v6, v6, Landroid/graphics/Rect;->right:I

    .line 223
    .line 224
    add-int/2addr v5, v6

    .line 225
    sub-int/2addr v3, v5

    .line 226
    const/high16 v5, -0x80000000

    .line 227
    .line 228
    invoke-static {v3, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    :goto_4
    iget-object v5, p0, Lj/J;->g:Lj/L;

    .line 233
    .line 234
    invoke-virtual {v5, v3, v0}, Lj/A;->a(II)I

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-lez v0, :cond_8

    .line 239
    .line 240
    iget-object v3, p0, Lj/J;->g:Lj/L;

    .line 241
    .line 242
    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    iget-object v5, p0, Lj/J;->g:Lj/L;

    .line 247
    .line 248
    invoke-virtual {v5}, Landroid/view/View;->getPaddingBottom()I

    .line 249
    .line 250
    .line 251
    move-result v5

    .line 252
    add-int/2addr v5, v3

    .line 253
    add-int/2addr v5, v7

    .line 254
    goto :goto_5

    .line 255
    :cond_8
    const/4 v5, 0x0

    .line 256
    :goto_5
    add-int/2addr v0, v5

    .line 257
    iget-object v3, p0, Lj/J;->z:Lj/r;

    .line 258
    .line 259
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    .line 260
    .line 261
    .line 262
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 263
    .line 264
    const/16 v5, 0x3ea

    .line 265
    .line 266
    if-lt v3, v11, :cond_9

    .line 267
    .line 268
    invoke-static {v4, v5}, LD/n;->d(Landroid/widget/PopupWindow;I)V

    .line 269
    .line 270
    .line 271
    goto :goto_6

    .line 272
    :cond_9
    sget-boolean v3, La/a;->b:Z

    .line 273
    .line 274
    if-nez v3, :cond_a

    .line 275
    .line 276
    :try_start_1
    const-class v3, Landroid/widget/PopupWindow;

    .line 277
    .line 278
    const-string v6, "setWindowLayoutType"

    .line 279
    .line 280
    new-array v7, v1, [Ljava/lang/Class;

    .line 281
    .line 282
    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 283
    .line 284
    aput-object v10, v7, v2

    .line 285
    .line 286
    invoke-virtual {v3, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    sput-object v3, La/a;->a:Ljava/lang/reflect/Method;

    .line 291
    .line 292
    invoke-virtual {v3, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 293
    .line 294
    .line 295
    :catch_1
    sput-boolean v1, La/a;->b:Z

    .line 296
    .line 297
    :cond_a
    sget-object v3, La/a;->a:Ljava/lang/reflect/Method;

    .line 298
    .line 299
    if-eqz v3, :cond_b

    .line 300
    .line 301
    :try_start_2
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 302
    .line 303
    .line 304
    move-result-object v5

    .line 305
    new-array v6, v1, [Ljava/lang/Object;

    .line 306
    .line 307
    aput-object v5, v6, v2

    .line 308
    .line 309
    invoke-virtual {v3, v4, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 310
    .line 311
    .line 312
    goto :goto_6

    .line 313
    :catch_2
    nop

    .line 314
    :cond_b
    :goto_6
    invoke-virtual {v4}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 315
    .line 316
    .line 317
    move-result v3

    .line 318
    if-eqz v3, :cond_11

    .line 319
    .line 320
    iget-object v2, p0, Lj/J;->p:Landroid/view/View;

    .line 321
    .line 322
    sget-object v3, Ly/x;->a:Ljava/lang/reflect/Field;

    .line 323
    .line 324
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 325
    .line 326
    .line 327
    move-result v2

    .line 328
    if-nez v2, :cond_c

    .line 329
    .line 330
    return-void

    .line 331
    :cond_c
    iget v2, p0, Lj/J;->h:I

    .line 332
    .line 333
    if-ne v2, v9, :cond_d

    .line 334
    .line 335
    const/4 v2, -0x1

    .line 336
    goto :goto_7

    .line 337
    :cond_d
    if-ne v2, v8, :cond_e

    .line 338
    .line 339
    iget-object v2, p0, Lj/J;->p:Landroid/view/View;

    .line 340
    .line 341
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 342
    .line 343
    .line 344
    move-result v2

    .line 345
    :cond_e
    :goto_7
    invoke-virtual {v4, v1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 346
    .line 347
    .line 348
    iget-object v5, p0, Lj/J;->p:Landroid/view/View;

    .line 349
    .line 350
    iget v6, p0, Lj/J;->i:I

    .line 351
    .line 352
    iget v7, p0, Lj/J;->j:I

    .line 353
    .line 354
    if-gez v2, :cond_f

    .line 355
    .line 356
    const/4 v8, -0x1

    .line 357
    goto :goto_8

    .line 358
    :cond_f
    move v8, v2

    .line 359
    :goto_8
    if-gez v0, :cond_10

    .line 360
    .line 361
    goto :goto_9

    .line 362
    :cond_10
    move v9, v0

    .line 363
    :goto_9
    invoke-virtual/range {v4 .. v9}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    .line 364
    .line 365
    .line 366
    goto/16 :goto_d

    .line 367
    .line 368
    :cond_11
    iget v3, p0, Lj/J;->h:I

    .line 369
    .line 370
    if-ne v3, v9, :cond_12

    .line 371
    .line 372
    const/4 v3, -0x1

    .line 373
    goto :goto_a

    .line 374
    :cond_12
    if-ne v3, v8, :cond_13

    .line 375
    .line 376
    iget-object v3, p0, Lj/J;->p:Landroid/view/View;

    .line 377
    .line 378
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 379
    .line 380
    .line 381
    move-result v3

    .line 382
    :cond_13
    :goto_a
    invoke-virtual {v4, v3}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v4, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 386
    .line 387
    .line 388
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 389
    .line 390
    const/16 v3, 0x1c

    .line 391
    .line 392
    if-gt v0, v3, :cond_14

    .line 393
    .line 394
    sget-object v0, Lj/J;->A:Ljava/lang/reflect/Method;

    .line 395
    .line 396
    if-eqz v0, :cond_15

    .line 397
    .line 398
    :try_start_3
    new-array v5, v1, [Ljava/lang/Object;

    .line 399
    .line 400
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 401
    .line 402
    aput-object v6, v5, v2

    .line 403
    .line 404
    invoke-virtual {v0, v4, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 405
    .line 406
    .line 407
    goto :goto_b

    .line 408
    :catch_3
    const-string v0, "Could not call setClipToScreenEnabled() on PopupWindow. Oh well."

    .line 409
    .line 410
    invoke-static {v12, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 411
    .line 412
    .line 413
    goto :goto_b

    .line 414
    :cond_14
    invoke-static {v4}, Landroidx/lifecycle/u;->s(Lj/r;)V

    .line 415
    .line 416
    .line 417
    :cond_15
    :goto_b
    invoke-virtual {v4, v1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 418
    .line 419
    .line 420
    iget-object v0, p0, Lj/J;->s:Lj/I;

    .line 421
    .line 422
    invoke-virtual {v4, v0}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    .line 423
    .line 424
    .line 425
    iget-boolean v0, p0, Lj/J;->m:Z

    .line 426
    .line 427
    if-eqz v0, :cond_16

    .line 428
    .line 429
    iget-boolean v0, p0, Lj/J;->l:Z

    .line 430
    .line 431
    invoke-static {v4, v0}, La/a;->E(Lj/r;Z)V

    .line 432
    .line 433
    .line 434
    :cond_16
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 435
    .line 436
    if-gt v0, v3, :cond_17

    .line 437
    .line 438
    sget-object v0, Lj/J;->C:Ljava/lang/reflect/Method;

    .line 439
    .line 440
    if-eqz v0, :cond_18

    .line 441
    .line 442
    :try_start_4
    iget-object v3, p0, Lj/J;->x:Landroid/graphics/Rect;

    .line 443
    .line 444
    new-array v5, v1, [Ljava/lang/Object;

    .line 445
    .line 446
    aput-object v3, v5, v2

    .line 447
    .line 448
    invoke-virtual {v0, v4, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 449
    .line 450
    .line 451
    goto :goto_c

    .line 452
    :catch_4
    move-exception v0

    .line 453
    const-string v2, "Could not invoke setEpicenterBounds on PopupWindow"

    .line 454
    .line 455
    invoke-static {v12, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 456
    .line 457
    .line 458
    goto :goto_c

    .line 459
    :cond_17
    iget-object v0, p0, Lj/J;->x:Landroid/graphics/Rect;

    .line 460
    .line 461
    invoke-static {v4, v0}, Landroidx/lifecycle/u;->t(Lj/r;Landroid/graphics/Rect;)V

    .line 462
    .line 463
    .line 464
    :cond_18
    :goto_c
    iget-object v0, p0, Lj/J;->p:Landroid/view/View;

    .line 465
    .line 466
    iget v2, p0, Lj/J;->i:I

    .line 467
    .line 468
    iget v3, p0, Lj/J;->j:I

    .line 469
    .line 470
    iget v5, p0, Lj/J;->n:I

    .line 471
    .line 472
    invoke-virtual {v4, v0, v2, v3, v5}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V

    .line 473
    .line 474
    .line 475
    iget-object v0, p0, Lj/J;->g:Lj/L;

    .line 476
    .line 477
    invoke-virtual {v0, v9}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 478
    .line 479
    .line 480
    iget-boolean v0, p0, Lj/J;->y:Z

    .line 481
    .line 482
    if-eqz v0, :cond_19

    .line 483
    .line 484
    iget-object v0, p0, Lj/J;->g:Lj/L;

    .line 485
    .line 486
    invoke-virtual {v0}, Lj/A;->isInTouchMode()Z

    .line 487
    .line 488
    .line 489
    move-result v0

    .line 490
    if-eqz v0, :cond_1a

    .line 491
    .line 492
    :cond_19
    iget-object v0, p0, Lj/J;->g:Lj/L;

    .line 493
    .line 494
    if-eqz v0, :cond_1a

    .line 495
    .line 496
    invoke-virtual {v0, v1}, Lj/A;->setListSelectionHidden(Z)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 500
    .line 501
    .line 502
    :cond_1a
    iget-boolean v0, p0, Lj/J;->y:Z

    .line 503
    .line 504
    if-nez v0, :cond_1b

    .line 505
    .line 506
    iget-object v0, p0, Lj/J;->v:Landroid/os/Handler;

    .line 507
    .line 508
    iget-object v1, p0, Lj/J;->u:Lj/G;

    .line 509
    .line 510
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 511
    .line 512
    .line 513
    :cond_1b
    :goto_d
    return-void
.end method

.method public final dismiss()V
    .locals 2

    .line 1
    iget-object v0, p0, Lj/J;->z:Lj/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, Lj/J;->g:Lj/L;

    .line 11
    .line 12
    iget-object v0, p0, Lj/J;->v:Landroid/os/Handler;

    .line 13
    .line 14
    iget-object v1, p0, Lj/J;->r:Lj/G;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final j()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lj/J;->z:Lj/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final k()Landroid/widget/ListView;
    .locals 1

    .line 1
    iget-object v0, p0, Lj/J;->g:Lj/L;

    .line 2
    .line 3
    return-object v0
.end method
