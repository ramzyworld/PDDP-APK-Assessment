.class public final Li/g;
.super Li/l;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public A:Li/o;

.field public B:Landroid/view/ViewTreeObserver;

.field public C:Li/m;

.field public D:Z

.field public final f:Landroid/content/Context;

.field public final g:I

.field public final h:I

.field public final i:Z

.field public final j:Landroid/os/Handler;

.field public final k:Ljava/util/ArrayList;

.field public final l:Ljava/util/ArrayList;

.field public final m:Li/c;

.field public final n:Li/d;

.field public final o:LD/j;

.field public p:I

.field public q:I

.field public r:Landroid/view/View;

.field public s:Landroid/view/View;

.field public t:I

.field public u:Z

.field public v:Z

.field public w:I

.field public x:I

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;IZ)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    .line 4
    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, Li/g;->k:Ljava/util/ArrayList;

    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Li/g;->l:Ljava/util/ArrayList;

    .line 18
    .line 19
    new-instance v1, Li/c;

    .line 20
    .line 21
    invoke-direct {v1, p0, v0}, Li/c;-><init>(Li/l;I)V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Li/g;->m:Li/c;

    .line 25
    .line 26
    new-instance v1, Li/d;

    .line 27
    .line 28
    invoke-direct {v1, p0, v0}, Li/d;-><init>(Li/l;I)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Li/g;->n:Li/d;

    .line 32
    .line 33
    new-instance v1, LD/j;

    .line 34
    .line 35
    const/16 v2, 0x14

    .line 36
    .line 37
    invoke-direct {v1, v2, p0}, LD/j;-><init>(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iput-object v1, p0, Li/g;->o:LD/j;

    .line 41
    .line 42
    iput v0, p0, Li/g;->p:I

    .line 43
    .line 44
    iput v0, p0, Li/g;->q:I

    .line 45
    .line 46
    iput-object p1, p0, Li/g;->f:Landroid/content/Context;

    .line 47
    .line 48
    iput-object p2, p0, Li/g;->r:Landroid/view/View;

    .line 49
    .line 50
    iput p3, p0, Li/g;->h:I

    .line 51
    .line 52
    iput-boolean p4, p0, Li/g;->i:Z

    .line 53
    .line 54
    iput-boolean v0, p0, Li/g;->y:Z

    .line 55
    .line 56
    sget-object p3, Ly/x;->a:Ljava/lang/reflect/Field;

    .line 57
    .line 58
    invoke-virtual {p2}, Landroid/view/View;->getLayoutDirection()I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    const/4 p3, 0x1

    .line 63
    if-ne p2, p3, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const/4 v0, 0x1

    .line 67
    :goto_0
    iput v0, p0, Li/g;->t:I

    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    iget p2, p2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 78
    .line 79
    div-int/lit8 p2, p2, 0x2

    .line 80
    .line 81
    const p3, 0x7f060017

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    iput p1, p0, Li/g;->g:I

    .line 93
    .line 94
    new-instance p1, Landroid/os/Handler;

    .line 95
    .line 96
    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 97
    .line 98
    .line 99
    iput-object p1, p0, Li/g;->j:Landroid/os/Handler;

    .line 100
    .line 101
    return-void
.end method


# virtual methods
.method public final a(Li/j;Z)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Li/g;->l:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    :goto_0
    if-ge v4, v2, :cond_1

    .line 11
    .line 12
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    check-cast v5, Li/f;

    .line 17
    .line 18
    iget-object v5, v5, Li/f;->b:Li/j;

    .line 19
    .line 20
    if-ne p1, v5, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    add-int/2addr v4, v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v4, -0x1

    .line 26
    :goto_1
    if-gez v4, :cond_2

    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    add-int/lit8 v2, v4, 0x1

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-ge v2, v5, :cond_3

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Li/f;

    .line 42
    .line 43
    iget-object v2, v2, Li/f;->b:Li/j;

    .line 44
    .line 45
    invoke-virtual {v2, v3}, Li/j;->c(Z)V

    .line 46
    .line 47
    .line 48
    :cond_3
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Li/f;

    .line 53
    .line 54
    iget-object v4, v2, Li/f;->b:Li/j;

    .line 55
    .line 56
    iget-object v4, v4, Li/j;->r:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    :cond_4
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-eqz v6, :cond_6

    .line 67
    .line 68
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    check-cast v6, Ljava/lang/ref/WeakReference;

    .line 73
    .line 74
    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    check-cast v7, Li/p;

    .line 79
    .line 80
    if-eqz v7, :cond_5

    .line 81
    .line 82
    if-ne v7, p0, :cond_4

    .line 83
    .line 84
    :cond_5
    invoke-virtual {v4, v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_6
    iget-boolean v4, p0, Li/g;->D:Z

    .line 89
    .line 90
    iget-object v2, v2, Li/f;->a:Lj/M;

    .line 91
    .line 92
    if-eqz v4, :cond_8

    .line 93
    .line 94
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 95
    .line 96
    const/16 v5, 0x17

    .line 97
    .line 98
    if-lt v4, v5, :cond_7

    .line 99
    .line 100
    iget-object v4, v2, Lj/J;->z:Lj/r;

    .line 101
    .line 102
    invoke-static {v4}, LD/r;->D(Lj/r;)V

    .line 103
    .line 104
    .line 105
    :cond_7
    iget-object v4, v2, Lj/J;->z:Lj/r;

    .line 106
    .line 107
    invoke-virtual {v4, v3}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 108
    .line 109
    .line 110
    :cond_8
    invoke-virtual {v2}, Lj/J;->dismiss()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-lez v2, :cond_9

    .line 118
    .line 119
    add-int/lit8 v4, v2, -0x1

    .line 120
    .line 121
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    check-cast v4, Li/f;

    .line 126
    .line 127
    iget v4, v4, Li/f;->c:I

    .line 128
    .line 129
    iput v4, p0, Li/g;->t:I

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_9
    iget-object v4, p0, Li/g;->r:Landroid/view/View;

    .line 133
    .line 134
    sget-object v5, Ly/x;->a:Ljava/lang/reflect/Field;

    .line 135
    .line 136
    invoke-virtual {v4}, Landroid/view/View;->getLayoutDirection()I

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-ne v4, v0, :cond_a

    .line 141
    .line 142
    const/4 v4, 0x0

    .line 143
    goto :goto_3

    .line 144
    :cond_a
    const/4 v4, 0x1

    .line 145
    :goto_3
    iput v4, p0, Li/g;->t:I

    .line 146
    .line 147
    :goto_4
    if-nez v2, :cond_e

    .line 148
    .line 149
    invoke-virtual {p0}, Li/g;->dismiss()V

    .line 150
    .line 151
    .line 152
    iget-object p2, p0, Li/g;->A:Li/o;

    .line 153
    .line 154
    if-eqz p2, :cond_b

    .line 155
    .line 156
    invoke-interface {p2, p1, v0}, Li/o;->a(Li/j;Z)V

    .line 157
    .line 158
    .line 159
    :cond_b
    iget-object p1, p0, Li/g;->B:Landroid/view/ViewTreeObserver;

    .line 160
    .line 161
    if-eqz p1, :cond_d

    .line 162
    .line 163
    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    if-eqz p1, :cond_c

    .line 168
    .line 169
    iget-object p1, p0, Li/g;->B:Landroid/view/ViewTreeObserver;

    .line 170
    .line 171
    iget-object p2, p0, Li/g;->m:Li/c;

    .line 172
    .line 173
    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 174
    .line 175
    .line 176
    :cond_c
    const/4 p1, 0x0

    .line 177
    iput-object p1, p0, Li/g;->B:Landroid/view/ViewTreeObserver;

    .line 178
    .line 179
    :cond_d
    iget-object p1, p0, Li/g;->s:Landroid/view/View;

    .line 180
    .line 181
    iget-object p2, p0, Li/g;->n:Li/d;

    .line 182
    .line 183
    invoke-virtual {p1, p2}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 184
    .line 185
    .line 186
    iget-object p1, p0, Li/g;->C:Li/m;

    .line 187
    .line 188
    invoke-virtual {p1}, Li/m;->onDismiss()V

    .line 189
    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_e
    if-eqz p2, :cond_f

    .line 193
    .line 194
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    check-cast p1, Li/f;

    .line 199
    .line 200
    iget-object p1, p1, Li/f;->b:Li/j;

    .line 201
    .line 202
    invoke-virtual {p1, v3}, Li/j;->c(Z)V

    .line 203
    .line 204
    .line 205
    :cond_f
    :goto_5
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Li/g;->j()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Li/g;->k:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Li/j;

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Li/g;->v(Li/j;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Li/g;->r:Landroid/view/View;

    .line 34
    .line 35
    iput-object v0, p0, Li/g;->s:Landroid/view/View;

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    iget-object v1, p0, Li/g;->B:Landroid/view/ViewTreeObserver;

    .line 40
    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    const/4 v1, 0x0

    .line 46
    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, Li/g;->B:Landroid/view/ViewTreeObserver;

    .line 51
    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    iget-object v1, p0, Li/g;->m:Li/c;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    iget-object v0, p0, Li/g;->s:Landroid/view/View;

    .line 60
    .line 61
    iget-object v1, p0, Li/g;->n:Li/d;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 64
    .line 65
    .line 66
    :cond_4
    return-void
.end method

.method public final d()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final dismiss()V
    .locals 4

    .line 1
    iget-object v0, p0, Li/g;->l:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-lez v1, :cond_1

    .line 8
    .line 9
    new-array v2, v1, [Li/f;

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, [Li/f;

    .line 16
    .line 17
    add-int/lit8 v1, v1, -0x1

    .line 18
    .line 19
    :goto_0
    if-ltz v1, :cond_1

    .line 20
    .line 21
    aget-object v2, v0, v1

    .line 22
    .line 23
    iget-object v3, v2, Li/f;->a:Lj/M;

    .line 24
    .line 25
    iget-object v3, v3, Lj/J;->z:Lj/r;

    .line 26
    .line 27
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iget-object v2, v2, Li/f;->a:Lj/M;

    .line 34
    .line 35
    invoke-virtual {v2}, Lj/J;->dismiss()V

    .line 36
    .line 37
    .line 38
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-void
.end method

.method public final f(Li/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Li/g;->A:Li/o;

    .line 2
    .line 3
    return-void
.end method

.method public final h()V
    .locals 3

    .line 1
    iget-object v0, p0, Li/g;->l:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Li/f;

    .line 18
    .line 19
    iget-object v1, v1, Li/f;->a:Lj/M;

    .line 20
    .line 21
    iget-object v1, v1, Lj/J;->g:Lj/L;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    instance-of v2, v1, Landroid/widget/HeaderViewListAdapter;

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    check-cast v1, Landroid/widget/HeaderViewListAdapter;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Li/h;

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    check-cast v1, Li/h;

    .line 41
    .line 42
    :goto_1
    invoke-virtual {v1}, Li/h;->notifyDataSetChanged()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return-void
.end method

.method public final i(Li/t;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Li/g;->l:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Li/f;

    .line 19
    .line 20
    iget-object v3, v1, Li/f;->b:Li/j;

    .line 21
    .line 22
    if-ne p1, v3, :cond_0

    .line 23
    .line 24
    iget-object p1, v1, Li/f;->a:Lj/M;

    .line 25
    .line 26
    iget-object p1, p1, Lj/J;->g:Lj/L;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 29
    .line 30
    .line 31
    return v2

    .line 32
    :cond_1
    invoke-virtual {p1}, Li/j;->hasVisibleItems()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Li/g;->l(Li/j;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Li/g;->A:Li/o;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-interface {v0, p1}, Li/o;->b(Li/t;)Z

    .line 46
    .line 47
    .line 48
    :cond_2
    return v2

    .line 49
    :cond_3
    const/4 p1, 0x0

    .line 50
    return p1
.end method

.method public final j()Z
    .locals 3

    .line 1
    iget-object v0, p0, Li/g;->l:Ljava/util/ArrayList;

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
    if-lez v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Li/f;

    .line 15
    .line 16
    iget-object v0, v0, Li/f;->a:Lj/M;

    .line 17
    .line 18
    iget-object v0, v0, Lj/J;->z:Lj/r;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    :cond_0
    return v2
.end method

.method public final k()Landroid/widget/ListView;
    .locals 2

    .line 1
    iget-object v0, p0, Li/g;->l:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/lit8 v1, v1, -0x1

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Li/f;

    .line 22
    .line 23
    iget-object v0, v0, Li/f;->a:Lj/M;

    .line 24
    .line 25
    iget-object v0, v0, Lj/J;->g:Lj/L;

    .line 26
    .line 27
    :goto_0
    return-object v0
.end method

.method public final l(Li/j;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li/g;->f:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p1, p0, v0}, Li/j;->b(Li/p;Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Li/g;->j()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Li/g;->v(Li/j;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Li/g;->k:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    :goto_0
    return-void
.end method

.method public final n(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Li/g;->r:Landroid/view/View;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Li/g;->r:Landroid/view/View;

    .line 6
    .line 7
    iget v0, p0, Li/g;->p:I

    .line 8
    .line 9
    sget-object v1, Ly/x;->a:Ljava/lang/reflect/Field;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {v0, p1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, p0, Li/g;->q:I

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final o(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Li/g;->y:Z

    .line 2
    .line 3
    return-void
.end method

.method public final onDismiss()V
    .locals 6

    .line 1
    iget-object v0, p0, Li/g;->l:Ljava/util/ArrayList;

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
    const/4 v3, 0x0

    .line 9
    :goto_0
    if-ge v3, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Li/f;

    .line 16
    .line 17
    iget-object v5, v4, Li/f;->a:Lj/M;

    .line 18
    .line 19
    iget-object v5, v5, Lj/J;->z:Lj/r;

    .line 20
    .line 21
    invoke-virtual {v5}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-nez v5, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v4, 0x0

    .line 32
    :goto_1
    if-eqz v4, :cond_2

    .line 33
    .line 34
    iget-object v0, v4, Li/f;->b:Li/j;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Li/j;->c(Z)V

    .line 37
    .line 38
    .line 39
    :cond_2
    return-void
.end method

.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p3, 0x1

    .line 6
    if-ne p1, p3, :cond_0

    .line 7
    .line 8
    const/16 p1, 0x52

    .line 9
    .line 10
    if-ne p2, p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Li/g;->dismiss()V

    .line 13
    .line 14
    .line 15
    return p3

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public final p(I)V
    .locals 2

    .line 1
    iget v0, p0, Li/g;->p:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Li/g;->p:I

    .line 6
    .line 7
    iget-object v0, p0, Li/g;->r:Landroid/view/View;

    .line 8
    .line 9
    sget-object v1, Ly/x;->a:Ljava/lang/reflect/Field;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {p1, v0}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, p0, Li/g;->q:I

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final q(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Li/g;->u:Z

    .line 3
    .line 4
    iput p1, p0, Li/g;->w:I

    .line 5
    .line 6
    return-void
.end method

.method public final r(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    .line 1
    check-cast p1, Li/m;

    .line 2
    .line 3
    iput-object p1, p0, Li/g;->C:Li/m;

    .line 4
    .line 5
    return-void
.end method

.method public final s(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Li/g;->z:Z

    .line 2
    .line 3
    return-void
.end method

.method public final t(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Li/g;->v:Z

    .line 3
    .line 4
    iput p1, p0, Li/g;->x:I

    .line 5
    .line 6
    return-void
.end method

.method public final v(Li/j;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v3, v0, Li/g;->f:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    new-instance v5, Li/h;

    .line 12
    .line 13
    iget-boolean v6, v0, Li/g;->i:Z

    .line 14
    .line 15
    const v7, 0x7f0b000b

    .line 16
    .line 17
    .line 18
    invoke-direct {v5, v1, v4, v6, v7}, Li/h;-><init>(Li/j;Landroid/view/LayoutInflater;ZI)V

    .line 19
    .line 20
    .line 21
    invoke-virtual/range {p0 .. p0}, Li/g;->j()Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    const/4 v7, 0x1

    .line 26
    if-nez v6, :cond_0

    .line 27
    .line 28
    iget-boolean v6, v0, Li/g;->y:Z

    .line 29
    .line 30
    if-eqz v6, :cond_0

    .line 31
    .line 32
    iput-boolean v7, v5, Li/h;->g:Z

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual/range {p0 .. p0}, Li/g;->j()Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_1

    .line 40
    .line 41
    invoke-static/range {p1 .. p1}, Li/l;->u(Li/j;)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    iput-boolean v6, v5, Li/h;->g:Z

    .line 46
    .line 47
    :cond_1
    :goto_0
    iget v6, v0, Li/g;->g:I

    .line 48
    .line 49
    invoke-static {v5, v3, v6}, Li/l;->m(Landroid/widget/ListAdapter;Landroid/content/Context;I)I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    new-instance v8, Lj/M;

    .line 54
    .line 55
    iget v9, v0, Li/g;->h:I

    .line 56
    .line 57
    invoke-direct {v8, v3, v9}, Lj/J;-><init>(Landroid/content/Context;I)V

    .line 58
    .line 59
    .line 60
    iget-object v3, v8, Lj/J;->z:Lj/r;

    .line 61
    .line 62
    iget-object v9, v0, Li/g;->o:LD/j;

    .line 63
    .line 64
    iput-object v9, v8, Lj/M;->D:LD/j;

    .line 65
    .line 66
    iput-object v0, v8, Lj/J;->q:Li/l;

    .line 67
    .line 68
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 69
    .line 70
    .line 71
    iget-object v9, v0, Li/g;->r:Landroid/view/View;

    .line 72
    .line 73
    iput-object v9, v8, Lj/J;->p:Landroid/view/View;

    .line 74
    .line 75
    iget v9, v0, Li/g;->q:I

    .line 76
    .line 77
    iput v9, v8, Lj/J;->n:I

    .line 78
    .line 79
    iput-boolean v7, v8, Lj/J;->y:Z

    .line 80
    .line 81
    invoke-virtual {v3, v7}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 82
    .line 83
    .line 84
    const/4 v9, 0x2

    .line 85
    invoke-virtual {v3, v9}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v8, v5}, Lj/J;->a(Landroid/widget/ListAdapter;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    if-eqz v5, :cond_2

    .line 96
    .line 97
    iget-object v10, v8, Lj/J;->w:Landroid/graphics/Rect;

    .line 98
    .line 99
    invoke-virtual {v5, v10}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 100
    .line 101
    .line 102
    iget v5, v10, Landroid/graphics/Rect;->left:I

    .line 103
    .line 104
    iget v10, v10, Landroid/graphics/Rect;->right:I

    .line 105
    .line 106
    add-int/2addr v5, v10

    .line 107
    add-int/2addr v5, v6

    .line 108
    iput v5, v8, Lj/J;->h:I

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    iput v6, v8, Lj/J;->h:I

    .line 112
    .line 113
    :goto_1
    iget v5, v0, Li/g;->q:I

    .line 114
    .line 115
    iput v5, v8, Lj/J;->n:I

    .line 116
    .line 117
    iget-object v5, v0, Li/g;->l:Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    if-lez v10, :cond_c

    .line 124
    .line 125
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    sub-int/2addr v10, v7

    .line 130
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v10

    .line 134
    check-cast v10, Li/f;

    .line 135
    .line 136
    iget-object v12, v10, Li/f;->b:Li/j;

    .line 137
    .line 138
    iget-object v13, v12, Li/j;->f:Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 141
    .line 142
    .line 143
    move-result v13

    .line 144
    const/4 v14, 0x0

    .line 145
    :goto_2
    if-ge v14, v13, :cond_4

    .line 146
    .line 147
    invoke-virtual {v12, v14}, Li/j;->getItem(I)Landroid/view/MenuItem;

    .line 148
    .line 149
    .line 150
    move-result-object v15

    .line 151
    invoke-interface {v15}, Landroid/view/MenuItem;->hasSubMenu()Z

    .line 152
    .line 153
    .line 154
    move-result v16

    .line 155
    if-eqz v16, :cond_3

    .line 156
    .line 157
    invoke-interface {v15}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    .line 158
    .line 159
    .line 160
    move-result-object v11

    .line 161
    if-ne v1, v11, :cond_3

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_3
    add-int/2addr v14, v7

    .line 165
    goto :goto_2

    .line 166
    :cond_4
    const/4 v15, 0x0

    .line 167
    :goto_3
    if-nez v15, :cond_6

    .line 168
    .line 169
    :cond_5
    :goto_4
    const/4 v2, 0x0

    .line 170
    goto :goto_8

    .line 171
    :cond_6
    iget-object v11, v10, Li/f;->a:Lj/M;

    .line 172
    .line 173
    iget-object v11, v11, Lj/J;->g:Lj/L;

    .line 174
    .line 175
    invoke-virtual {v11}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 176
    .line 177
    .line 178
    move-result-object v12

    .line 179
    instance-of v13, v12, Landroid/widget/HeaderViewListAdapter;

    .line 180
    .line 181
    if-eqz v13, :cond_7

    .line 182
    .line 183
    check-cast v12, Landroid/widget/HeaderViewListAdapter;

    .line 184
    .line 185
    invoke-virtual {v12}, Landroid/widget/HeaderViewListAdapter;->getHeadersCount()I

    .line 186
    .line 187
    .line 188
    move-result v13

    .line 189
    invoke-virtual {v12}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    .line 190
    .line 191
    .line 192
    move-result-object v12

    .line 193
    check-cast v12, Li/h;

    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_7
    check-cast v12, Li/h;

    .line 197
    .line 198
    const/4 v13, 0x0

    .line 199
    :goto_5
    invoke-virtual {v12}, Li/h;->getCount()I

    .line 200
    .line 201
    .line 202
    move-result v14

    .line 203
    const/4 v9, 0x0

    .line 204
    :goto_6
    if-ge v9, v14, :cond_9

    .line 205
    .line 206
    invoke-virtual {v12, v9}, Li/h;->b(I)Li/k;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    if-ne v15, v2, :cond_8

    .line 211
    .line 212
    const/4 v2, -0x1

    .line 213
    goto :goto_7

    .line 214
    :cond_8
    add-int/2addr v9, v7

    .line 215
    goto :goto_6

    .line 216
    :cond_9
    const/4 v2, -0x1

    .line 217
    const/4 v9, -0x1

    .line 218
    :goto_7
    if-ne v9, v2, :cond_a

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_a
    add-int/2addr v9, v13

    .line 222
    invoke-virtual {v11}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    sub-int/2addr v9, v2

    .line 227
    if-ltz v9, :cond_5

    .line 228
    .line 229
    invoke-virtual {v11}, Landroid/view/ViewGroup;->getChildCount()I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    if-lt v9, v2, :cond_b

    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_b
    invoke-virtual {v11, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    goto :goto_8

    .line 241
    :cond_c
    const/4 v2, 0x0

    .line 242
    const/4 v10, 0x0

    .line 243
    :goto_8
    if-eqz v2, :cond_19

    .line 244
    .line 245
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 246
    .line 247
    const/16 v11, 0x1c

    .line 248
    .line 249
    if-gt v9, v11, :cond_d

    .line 250
    .line 251
    sget-object v9, Lj/M;->E:Ljava/lang/reflect/Method;

    .line 252
    .line 253
    if-eqz v9, :cond_e

    .line 254
    .line 255
    :try_start_0
    new-array v11, v7, [Ljava/lang/Object;

    .line 256
    .line 257
    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 258
    .line 259
    const/4 v13, 0x0

    .line 260
    aput-object v12, v11, v13

    .line 261
    .line 262
    invoke-virtual {v9, v3, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 263
    .line 264
    .line 265
    goto :goto_9

    .line 266
    :catch_0
    const-string v9, "MenuPopupWindow"

    .line 267
    .line 268
    const-string v11, "Could not invoke setTouchModal() on PopupWindow. Oh well."

    .line 269
    .line 270
    invoke-static {v9, v11}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 271
    .line 272
    .line 273
    goto :goto_9

    .line 274
    :cond_d
    invoke-static {v3}, Landroidx/lifecycle/u;->A(Lj/r;)V

    .line 275
    .line 276
    .line 277
    :cond_e
    :goto_9
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 278
    .line 279
    const/16 v11, 0x17

    .line 280
    .line 281
    if-lt v9, v11, :cond_f

    .line 282
    .line 283
    invoke-static {v3}, LD/r;->x(Lj/r;)V

    .line 284
    .line 285
    .line 286
    :cond_f
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    sub-int/2addr v3, v7

    .line 291
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    check-cast v3, Li/f;

    .line 296
    .line 297
    iget-object v3, v3, Li/f;->a:Lj/M;

    .line 298
    .line 299
    iget-object v3, v3, Lj/J;->g:Lj/L;

    .line 300
    .line 301
    const/4 v11, 0x2

    .line 302
    new-array v12, v11, [I

    .line 303
    .line 304
    invoke-virtual {v3, v12}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 305
    .line 306
    .line 307
    new-instance v11, Landroid/graphics/Rect;

    .line 308
    .line 309
    invoke-direct {v11}, Landroid/graphics/Rect;-><init>()V

    .line 310
    .line 311
    .line 312
    iget-object v13, v0, Li/g;->s:Landroid/view/View;

    .line 313
    .line 314
    invoke-virtual {v13, v11}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 315
    .line 316
    .line 317
    iget v13, v0, Li/g;->t:I

    .line 318
    .line 319
    if-ne v13, v7, :cond_12

    .line 320
    .line 321
    const/16 v17, 0x0

    .line 322
    .line 323
    aget v12, v12, v17

    .line 324
    .line 325
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    add-int/2addr v3, v12

    .line 330
    add-int/2addr v3, v6

    .line 331
    iget v11, v11, Landroid/graphics/Rect;->right:I

    .line 332
    .line 333
    if-le v3, v11, :cond_11

    .line 334
    .line 335
    :cond_10
    const/4 v3, 0x0

    .line 336
    goto :goto_b

    .line 337
    :cond_11
    :goto_a
    const/4 v3, 0x1

    .line 338
    goto :goto_b

    .line 339
    :cond_12
    const/16 v17, 0x0

    .line 340
    .line 341
    aget v3, v12, v17

    .line 342
    .line 343
    sub-int/2addr v3, v6

    .line 344
    if-gez v3, :cond_10

    .line 345
    .line 346
    goto :goto_a

    .line 347
    :goto_b
    if-ne v3, v7, :cond_13

    .line 348
    .line 349
    const/4 v13, 0x1

    .line 350
    goto :goto_c

    .line 351
    :cond_13
    const/4 v13, 0x0

    .line 352
    :goto_c
    iput v3, v0, Li/g;->t:I

    .line 353
    .line 354
    const/16 v3, 0x1a

    .line 355
    .line 356
    const/4 v11, 0x5

    .line 357
    if-lt v9, v3, :cond_14

    .line 358
    .line 359
    iput-object v2, v8, Lj/J;->p:Landroid/view/View;

    .line 360
    .line 361
    const/4 v3, 0x0

    .line 362
    const/4 v12, 0x0

    .line 363
    goto :goto_e

    .line 364
    :cond_14
    const/4 v3, 0x2

    .line 365
    new-array v9, v3, [I

    .line 366
    .line 367
    iget-object v12, v0, Li/g;->r:Landroid/view/View;

    .line 368
    .line 369
    invoke-virtual {v12, v9}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 370
    .line 371
    .line 372
    new-array v3, v3, [I

    .line 373
    .line 374
    invoke-virtual {v2, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 375
    .line 376
    .line 377
    iget v12, v0, Li/g;->q:I

    .line 378
    .line 379
    and-int/lit8 v12, v12, 0x7

    .line 380
    .line 381
    if-ne v12, v11, :cond_15

    .line 382
    .line 383
    const/4 v12, 0x0

    .line 384
    aget v14, v9, v12

    .line 385
    .line 386
    iget-object v15, v0, Li/g;->r:Landroid/view/View;

    .line 387
    .line 388
    invoke-virtual {v15}, Landroid/view/View;->getWidth()I

    .line 389
    .line 390
    .line 391
    move-result v15

    .line 392
    add-int/2addr v15, v14

    .line 393
    aput v15, v9, v12

    .line 394
    .line 395
    aget v14, v3, v12

    .line 396
    .line 397
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 398
    .line 399
    .line 400
    move-result v15

    .line 401
    add-int/2addr v15, v14

    .line 402
    aput v15, v3, v12

    .line 403
    .line 404
    goto :goto_d

    .line 405
    :cond_15
    const/4 v12, 0x0

    .line 406
    :goto_d
    aget v14, v3, v12

    .line 407
    .line 408
    aget v15, v9, v12

    .line 409
    .line 410
    sub-int v12, v14, v15

    .line 411
    .line 412
    aget v3, v3, v7

    .line 413
    .line 414
    aget v9, v9, v7

    .line 415
    .line 416
    sub-int/2addr v3, v9

    .line 417
    :goto_e
    iget v9, v0, Li/g;->q:I

    .line 418
    .line 419
    and-int/2addr v9, v11

    .line 420
    if-ne v9, v11, :cond_17

    .line 421
    .line 422
    if-eqz v13, :cond_16

    .line 423
    .line 424
    add-int/2addr v12, v6

    .line 425
    goto :goto_f

    .line 426
    :cond_16
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 427
    .line 428
    .line 429
    move-result v2

    .line 430
    sub-int/2addr v12, v2

    .line 431
    goto :goto_f

    .line 432
    :cond_17
    if-eqz v13, :cond_18

    .line 433
    .line 434
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 435
    .line 436
    .line 437
    move-result v2

    .line 438
    add-int/2addr v12, v2

    .line 439
    goto :goto_f

    .line 440
    :cond_18
    sub-int/2addr v12, v6

    .line 441
    :goto_f
    iput v12, v8, Lj/J;->i:I

    .line 442
    .line 443
    iput-boolean v7, v8, Lj/J;->m:Z

    .line 444
    .line 445
    iput-boolean v7, v8, Lj/J;->l:Z

    .line 446
    .line 447
    iput v3, v8, Lj/J;->j:I

    .line 448
    .line 449
    iput-boolean v7, v8, Lj/J;->k:Z

    .line 450
    .line 451
    goto :goto_11

    .line 452
    :cond_19
    iget-boolean v2, v0, Li/g;->u:Z

    .line 453
    .line 454
    if-eqz v2, :cond_1a

    .line 455
    .line 456
    iget v2, v0, Li/g;->w:I

    .line 457
    .line 458
    iput v2, v8, Lj/J;->i:I

    .line 459
    .line 460
    :cond_1a
    iget-boolean v2, v0, Li/g;->v:Z

    .line 461
    .line 462
    if-eqz v2, :cond_1b

    .line 463
    .line 464
    iget v2, v0, Li/g;->x:I

    .line 465
    .line 466
    iput v2, v8, Lj/J;->j:I

    .line 467
    .line 468
    iput-boolean v7, v8, Lj/J;->k:Z

    .line 469
    .line 470
    :cond_1b
    iget-object v2, v0, Li/l;->e:Landroid/graphics/Rect;

    .line 471
    .line 472
    if-eqz v2, :cond_1c

    .line 473
    .line 474
    new-instance v3, Landroid/graphics/Rect;

    .line 475
    .line 476
    invoke-direct {v3, v2}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 477
    .line 478
    .line 479
    goto :goto_10

    .line 480
    :cond_1c
    const/4 v3, 0x0

    .line 481
    :goto_10
    iput-object v3, v8, Lj/J;->x:Landroid/graphics/Rect;

    .line 482
    .line 483
    :goto_11
    new-instance v2, Li/f;

    .line 484
    .line 485
    iget v3, v0, Li/g;->t:I

    .line 486
    .line 487
    invoke-direct {v2, v8, v1, v3}, Li/f;-><init>(Lj/M;Li/j;I)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    invoke-virtual {v8}, Lj/J;->c()V

    .line 494
    .line 495
    .line 496
    iget-object v2, v8, Lj/J;->g:Lj/L;

    .line 497
    .line 498
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 499
    .line 500
    .line 501
    if-nez v10, :cond_1d

    .line 502
    .line 503
    iget-boolean v3, v0, Li/g;->z:Z

    .line 504
    .line 505
    if-eqz v3, :cond_1d

    .line 506
    .line 507
    iget-object v3, v1, Li/j;->l:Ljava/lang/CharSequence;

    .line 508
    .line 509
    if-eqz v3, :cond_1d

    .line 510
    .line 511
    const v3, 0x7f0b0012

    .line 512
    .line 513
    .line 514
    const/4 v5, 0x0

    .line 515
    invoke-virtual {v4, v3, v2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 516
    .line 517
    .line 518
    move-result-object v3

    .line 519
    check-cast v3, Landroid/widget/FrameLayout;

    .line 520
    .line 521
    const v4, 0x1020016

    .line 522
    .line 523
    .line 524
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 525
    .line 526
    .line 527
    move-result-object v4

    .line 528
    check-cast v4, Landroid/widget/TextView;

    .line 529
    .line 530
    invoke-virtual {v3, v5}, Landroid/view/View;->setEnabled(Z)V

    .line 531
    .line 532
    .line 533
    iget-object v1, v1, Li/j;->l:Ljava/lang/CharSequence;

    .line 534
    .line 535
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 536
    .line 537
    .line 538
    const/4 v1, 0x0

    .line 539
    invoke-virtual {v2, v3, v1, v5}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v8}, Lj/J;->c()V

    .line 543
    .line 544
    .line 545
    :cond_1d
    return-void
.end method
