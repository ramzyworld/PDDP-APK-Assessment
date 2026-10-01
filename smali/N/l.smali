.class public final LN/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final i:Ljava/lang/ThreadLocal;

.field public static final j:LN/i;


# instance fields
.field public e:Ljava/util/ArrayList;

.field public f:J

.field public g:J

.field public h:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LN/l;->i:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    new-instance v0, LN/i;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LN/l;->j:LN/i;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 5

    .line 1
    iget-boolean v0, p1, Landroidx/recyclerview/widget/RecyclerView;->q:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, p0, LN/l;->f:J

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v4, v0, v2

    .line 10
    .line 11
    if-nez v4, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iput-wide v0, p0, LN/l;->f:J

    .line 18
    .line 19
    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->a0:LN/j;

    .line 23
    .line 24
    iput p2, p1, LN/j;->a:I

    .line 25
    .line 26
    iput p3, p1, LN/j;->b:I

    .line 27
    .line 28
    return-void
.end method

.method public final b(J)V
    .locals 5

    .line 1
    iget-object p1, p0, LN/l;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v1, p2, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    invoke-virtual {v3}, Landroid/view/View;->getWindowVisibility()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView;->a0:LN/j;

    .line 25
    .line 26
    iput v0, v3, LN/j;->c:I

    .line 27
    .line 28
    iget v3, v3, LN/j;->c:I

    .line 29
    .line 30
    add-int/2addr v2, v3

    .line 31
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object v1, p0, LN/l;->h:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 37
    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    :goto_1
    if-ge v2, p2, :cond_5

    .line 41
    .line 42
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Landroidx/recyclerview/widget/RecyclerView;

    .line 47
    .line 48
    invoke-virtual {v3}, Landroid/view/View;->getWindowVisibility()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_2

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_2
    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView;->a0:LN/j;

    .line 56
    .line 57
    iget v4, v3, LN/j;->a:I

    .line 58
    .line 59
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    .line 60
    .line 61
    .line 62
    iget v4, v3, LN/j;->b:I

    .line 63
    .line 64
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    .line 65
    .line 66
    .line 67
    iget v3, v3, LN/j;->c:I

    .line 68
    .line 69
    mul-int/lit8 v3, v3, 0x2

    .line 70
    .line 71
    if-lez v3, :cond_4

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-gtz p1, :cond_3

    .line 78
    .line 79
    new-instance p1, LN/k;

    .line 80
    .line 81
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    check-cast p1, LN/k;

    .line 93
    .line 94
    :goto_2
    const/4 p1, 0x0

    .line 95
    throw p1

    .line 96
    :cond_4
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    sget-object p1, LN/l;->j:LN/i;

    .line 100
    .line 101
    invoke-static {v1, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-lez p1, :cond_9

    .line 109
    .line 110
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    check-cast p1, LN/k;

    .line 115
    .line 116
    iget-object p2, p1, LN/k;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 117
    .line 118
    if-nez p2, :cond_6

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_6
    iget p1, p1, LN/k;->e:I

    .line 122
    .line 123
    iget-object v1, p2, Landroidx/recyclerview/widget/RecyclerView;->h:LN/b;

    .line 124
    .line 125
    invoke-virtual {v1}, LN/b;->B()I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    const/4 v2, 0x0

    .line 130
    if-gtz v1, :cond_8

    .line 131
    .line 132
    iget-object v0, p2, Landroidx/recyclerview/widget/RecyclerView;->e:LN/D;

    .line 133
    .line 134
    :try_start_0
    iget v1, p2, Landroidx/recyclerview/widget/RecyclerView;->A:I

    .line 135
    .line 136
    add-int/lit8 v1, v1, 0x1

    .line 137
    .line 138
    iput v1, p2, Landroidx/recyclerview/widget/RecyclerView;->A:I

    .line 139
    .line 140
    invoke-virtual {v0, p1}, LN/D;->d(I)V

    .line 141
    .line 142
    .line 143
    throw v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    :catchall_0
    move-exception p1

    .line 145
    iget v0, p2, Landroidx/recyclerview/widget/RecyclerView;->A:I

    .line 146
    .line 147
    const/4 v1, 0x1

    .line 148
    sub-int/2addr v0, v1

    .line 149
    iput v0, p2, Landroidx/recyclerview/widget/RecyclerView;->A:I

    .line 150
    .line 151
    if-ge v0, v1, :cond_7

    .line 152
    .line 153
    const/4 v0, 0x0

    .line 154
    iput v0, p2, Landroidx/recyclerview/widget/RecyclerView;->A:I

    .line 155
    .line 156
    :cond_7
    throw p1

    .line 157
    :cond_8
    iget-object p1, p2, Landroidx/recyclerview/widget/RecyclerView;->h:LN/b;

    .line 158
    .line 159
    invoke-virtual {p1, v0}, LN/b;->A(I)Landroid/view/View;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->j(Landroid/view/View;)V

    .line 164
    .line 165
    .line 166
    throw v2

    .line 167
    :cond_9
    :goto_4
    return-void
.end method

.method public final run()V
    .locals 9

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    const-string v2, "RV Prefetch"

    .line 4
    .line 5
    sget v3, Lu/b;->a:I

    .line 6
    .line 7
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, LN/l;->e:Ljava/util/ArrayList;

    .line 11
    .line 12
    :try_start_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    iput-wide v0, p0, LN/l;->f:J

    .line 19
    .line 20
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    :try_start_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const/4 v4, 0x0

    .line 29
    move-wide v5, v0

    .line 30
    :goto_0
    if-ge v4, v3, :cond_2

    .line 31
    .line 32
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    check-cast v7, Landroidx/recyclerview/widget/RecyclerView;

    .line 37
    .line 38
    invoke-virtual {v7}, Landroid/view/View;->getWindowVisibility()I

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    if-nez v8, :cond_1

    .line 43
    .line 44
    invoke-virtual {v7}, Landroid/view/View;->getDrawingTime()J

    .line 45
    .line 46
    .line 47
    move-result-wide v7

    .line 48
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 49
    .line 50
    .line 51
    move-result-wide v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 52
    goto :goto_1

    .line 53
    :catchall_0
    move-exception v2

    .line 54
    goto :goto_2

    .line 55
    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    cmp-long v2, v5, v0

    .line 59
    .line 60
    if-nez v2, :cond_3

    .line 61
    .line 62
    iput-wide v0, p0, LN/l;->f:J

    .line 63
    .line 64
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_3
    :try_start_3
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 69
    .line 70
    invoke-virtual {v2, v5, v6}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 71
    .line 72
    .line 73
    move-result-wide v2

    .line 74
    iget-wide v4, p0, LN/l;->g:J

    .line 75
    .line 76
    add-long/2addr v2, v4

    .line 77
    invoke-virtual {p0, v2, v3}, LN/l;->b(J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 78
    .line 79
    .line 80
    iput-wide v0, p0, LN/l;->f:J

    .line 81
    .line 82
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :goto_2
    iput-wide v0, p0, LN/l;->f:J

    .line 87
    .line 88
    sget v0, Lu/b;->a:I

    .line 89
    .line 90
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 91
    .line 92
    .line 93
    throw v2
.end method
