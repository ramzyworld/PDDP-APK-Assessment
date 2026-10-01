.class public final Landroidx/lifecycle/n;
.super Landroidx/lifecycle/h;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public b:Ll/a;

.field public c:Landroidx/lifecycle/g;

.field public final d:Ljava/lang/ref/WeakReference;

.field public e:I

.field public f:Z

.field public g:Z

.field public final h:Ljava/util/ArrayList;

.field public final i:LT0/q;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/l;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Landroidx/lifecycle/n;->a:Z

    .line 11
    .line 12
    new-instance v0, Ll/a;

    .line 13
    .line 14
    invoke-direct {v0}, Ll/a;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Landroidx/lifecycle/n;->b:Ll/a;

    .line 18
    .line 19
    sget-object v0, Landroidx/lifecycle/g;->f:Landroidx/lifecycle/g;

    .line 20
    .line 21
    iput-object v0, p0, Landroidx/lifecycle/n;->c:Landroidx/lifecycle/g;

    .line 22
    .line 23
    new-instance v1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Landroidx/lifecycle/n;->h:Ljava/util/ArrayList;

    .line 29
    .line 30
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 31
    .line 32
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Landroidx/lifecycle/n;->d:Ljava/lang/ref/WeakReference;

    .line 36
    .line 37
    new-instance p1, LT0/q;

    .line 38
    .line 39
    invoke-direct {p1, v0}, LT0/q;-><init>(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Landroidx/lifecycle/n;->i:LT0/q;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final a(Lio/flutter/embedding/engine/renderer/b;)Landroidx/lifecycle/g;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/n;->b:Ll/a;

    .line 2
    .line 3
    iget-object v0, v0, Ll/a;->i:Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ll/c;

    .line 17
    .line 18
    iget-object p1, p1, Ll/c;->h:Ll/c;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object p1, v2

    .line 22
    :goto_0
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-object p1, p1, Ll/c;->f:Landroidx/lifecycle/m;

    .line 25
    .line 26
    iget-object p1, p1, Landroidx/lifecycle/m;->a:Landroidx/lifecycle/g;

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move-object p1, v2

    .line 30
    :goto_1
    iget-object v0, p0, Landroidx/lifecycle/n;->h:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    add-int/lit8 v1, v1, -0x1

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    move-object v2, v0

    .line 49
    check-cast v2, Landroidx/lifecycle/g;

    .line 50
    .line 51
    :cond_2
    iget-object v0, p0, Landroidx/lifecycle/n;->c:Landroidx/lifecycle/g;

    .line 52
    .line 53
    const-string v1, "state1"

    .line 54
    .line 55
    invoke-static {v0, v1}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    invoke-virtual {p1, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-gez v1, :cond_3

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    move-object p1, v0

    .line 68
    :goto_2
    if-eqz v2, :cond_4

    .line 69
    .line 70
    invoke-virtual {v2, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-gez v0, :cond_4

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_4
    move-object v2, p1

    .line 78
    :goto_3
    return-object v2
.end method

.method public final b(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/lifecycle/n;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    sget-object v0, Lk/a;->f:Lk/a;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lk/a;->f:Lk/a;

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    const-class v0, Lk/a;

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_0
    sget-object v1, Lk/a;->f:Lk/a;

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    new-instance v1, Lk/a;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v1, v2}, Lk/a;-><init>(I)V

    .line 23
    .line 24
    .line 25
    sput-object v1, Lk/a;->f:Lk/a;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_2

    .line 30
    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    sget-object v0, Lk/a;->f:Lk/a;

    .line 32
    .line 33
    :goto_1
    iget-object v0, v0, Lk/a;->e:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lk/a;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    if-ne v0, v1, :cond_2

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v1, "Method "

    .line 58
    .line 59
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string p1, " must be called on the main thread"

    .line 66
    .line 67
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v0

    .line 84
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    throw p1

    .line 86
    :cond_3
    :goto_3
    return-void
.end method

.method public final c(Landroidx/lifecycle/f;)V
    .locals 3

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "handleLifecycleEvent"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroidx/lifecycle/n;->b(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/lifecycle/f;->a()Landroidx/lifecycle/g;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Landroidx/lifecycle/n;->c:Landroidx/lifecycle/g;

    .line 16
    .line 17
    if-ne v0, p1, :cond_0

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    sget-object v1, Landroidx/lifecycle/g;->f:Landroidx/lifecycle/g;

    .line 21
    .line 22
    sget-object v2, Landroidx/lifecycle/g;->e:Landroidx/lifecycle/g;

    .line 23
    .line 24
    if-ne v0, v1, :cond_2

    .line 25
    .line 26
    if-eq p1, v2, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v0, "no event down from "

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Landroidx/lifecycle/n;->c:Landroidx/lifecycle/g;

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v0, " in component "

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Landroidx/lifecycle/n;->d:Ljava/lang/ref/WeakReference;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :cond_2
    :goto_0
    iput-object p1, p0, Landroidx/lifecycle/n;->c:Landroidx/lifecycle/g;

    .line 70
    .line 71
    iget-boolean p1, p0, Landroidx/lifecycle/n;->f:Z

    .line 72
    .line 73
    const/4 v0, 0x1

    .line 74
    if-nez p1, :cond_4

    .line 75
    .line 76
    iget p1, p0, Landroidx/lifecycle/n;->e:I

    .line 77
    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    iput-boolean v0, p0, Landroidx/lifecycle/n;->f:Z

    .line 82
    .line 83
    invoke-virtual {p0}, Landroidx/lifecycle/n;->d()V

    .line 84
    .line 85
    .line 86
    const/4 p1, 0x0

    .line 87
    iput-boolean p1, p0, Landroidx/lifecycle/n;->f:Z

    .line 88
    .line 89
    iget-object p1, p0, Landroidx/lifecycle/n;->c:Landroidx/lifecycle/g;

    .line 90
    .line 91
    if-ne p1, v2, :cond_5

    .line 92
    .line 93
    new-instance p1, Ll/a;

    .line 94
    .line 95
    invoke-direct {p1}, Ll/a;-><init>()V

    .line 96
    .line 97
    .line 98
    iput-object p1, p0, Landroidx/lifecycle/n;->b:Ll/a;

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    :goto_1
    iput-boolean v0, p0, Landroidx/lifecycle/n;->g:Z

    .line 102
    .line 103
    :cond_5
    :goto_2
    return-void
.end method

.method public final d()V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/n;->d:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/lifecycle/l;

    .line 8
    .line 9
    if-eqz v0, :cond_c

    .line 10
    .line 11
    :cond_0
    iget-object v1, p0, Landroidx/lifecycle/n;->b:Ll/a;

    .line 12
    .line 13
    iget v2, v1, Ll/a;->h:I

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    iget-object v1, v1, Ll/a;->e:Ll/c;

    .line 21
    .line 22
    invoke-static {v1}, LI0/i;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, v1, Ll/c;->f:Landroidx/lifecycle/m;

    .line 26
    .line 27
    iget-object v1, v1, Landroidx/lifecycle/m;->a:Landroidx/lifecycle/g;

    .line 28
    .line 29
    iget-object v2, p0, Landroidx/lifecycle/n;->b:Ll/a;

    .line 30
    .line 31
    iget-object v2, v2, Ll/a;->f:Ll/c;

    .line 32
    .line 33
    invoke-static {v2}, LI0/i;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v2, v2, Ll/c;->f:Landroidx/lifecycle/m;

    .line 37
    .line 38
    iget-object v2, v2, Landroidx/lifecycle/m;->a:Landroidx/lifecycle/g;

    .line 39
    .line 40
    if-ne v1, v2, :cond_3

    .line 41
    .line 42
    iget-object v1, p0, Landroidx/lifecycle/n;->c:Landroidx/lifecycle/g;

    .line 43
    .line 44
    if-ne v1, v2, :cond_3

    .line 45
    .line 46
    :goto_0
    iput-boolean v4, p0, Landroidx/lifecycle/n;->g:Z

    .line 47
    .line 48
    iget-object v0, p0, Landroidx/lifecycle/n;->c:Landroidx/lifecycle/g;

    .line 49
    .line 50
    iget-object v1, p0, Landroidx/lifecycle/n;->i:LT0/q;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    sget-object v0, LU0/l;->a:LD/j;

    .line 58
    .line 59
    :cond_2
    invoke-virtual {v1, v3, v0}, LT0/q;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_3
    iput-boolean v4, p0, Landroidx/lifecycle/n;->g:Z

    .line 64
    .line 65
    iget-object v1, p0, Landroidx/lifecycle/n;->c:Landroidx/lifecycle/g;

    .line 66
    .line 67
    iget-object v2, p0, Landroidx/lifecycle/n;->b:Ll/a;

    .line 68
    .line 69
    iget-object v2, v2, Ll/a;->e:Ll/c;

    .line 70
    .line 71
    invoke-static {v2}, LI0/i;->b(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object v2, v2, Ll/c;->f:Landroidx/lifecycle/m;

    .line 75
    .line 76
    iget-object v2, v2, Landroidx/lifecycle/m;->a:Landroidx/lifecycle/g;

    .line 77
    .line 78
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-gez v1, :cond_9

    .line 83
    .line 84
    iget-object v1, p0, Landroidx/lifecycle/n;->b:Ll/a;

    .line 85
    .line 86
    new-instance v2, Ll/b;

    .line 87
    .line 88
    iget-object v4, v1, Ll/a;->f:Ll/c;

    .line 89
    .line 90
    iget-object v5, v1, Ll/a;->e:Ll/c;

    .line 91
    .line 92
    const/4 v6, 0x1

    .line 93
    invoke-direct {v2, v4, v5, v6}, Ll/b;-><init>(Ll/c;Ll/c;I)V

    .line 94
    .line 95
    .line 96
    iget-object v1, v1, Ll/a;->g:Ljava/util/WeakHashMap;

    .line 97
    .line 98
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 99
    .line 100
    invoke-virtual {v1, v2, v4}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    :cond_4
    invoke-virtual {v2}, Ll/b;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_9

    .line 108
    .line 109
    iget-boolean v1, p0, Landroidx/lifecycle/n;->g:Z

    .line 110
    .line 111
    if-nez v1, :cond_9

    .line 112
    .line 113
    invoke-virtual {v2}, Ll/b;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, Ljava/util/Map$Entry;

    .line 118
    .line 119
    const-string v4, "next()"

    .line 120
    .line 121
    invoke-static {v1, v4}, LI0/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    check-cast v4, Landroidx/lifecycle/k;

    .line 129
    .line 130
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    check-cast v1, Landroidx/lifecycle/m;

    .line 135
    .line 136
    :goto_1
    iget-object v5, v1, Landroidx/lifecycle/m;->a:Landroidx/lifecycle/g;

    .line 137
    .line 138
    iget-object v6, p0, Landroidx/lifecycle/n;->c:Landroidx/lifecycle/g;

    .line 139
    .line 140
    invoke-virtual {v5, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-lez v5, :cond_4

    .line 145
    .line 146
    iget-boolean v5, p0, Landroidx/lifecycle/n;->g:Z

    .line 147
    .line 148
    if-nez v5, :cond_4

    .line 149
    .line 150
    iget-object v5, p0, Landroidx/lifecycle/n;->b:Ll/a;

    .line 151
    .line 152
    iget-object v5, v5, Ll/a;->i:Ljava/util/HashMap;

    .line 153
    .line 154
    invoke-virtual {v5, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    if-eqz v5, :cond_4

    .line 159
    .line 160
    sget-object v5, Landroidx/lifecycle/f;->Companion:Landroidx/lifecycle/d;

    .line 161
    .line 162
    iget-object v6, v1, Landroidx/lifecycle/m;->a:Landroidx/lifecycle/g;

    .line 163
    .line 164
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    const-string v5, "state"

    .line 168
    .line 169
    invoke-static {v6, v5}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    const/4 v6, 0x2

    .line 177
    if-eq v5, v6, :cond_7

    .line 178
    .line 179
    const/4 v6, 0x3

    .line 180
    if-eq v5, v6, :cond_6

    .line 181
    .line 182
    const/4 v6, 0x4

    .line 183
    if-eq v5, v6, :cond_5

    .line 184
    .line 185
    move-object v5, v3

    .line 186
    goto :goto_2

    .line 187
    :cond_5
    sget-object v5, Landroidx/lifecycle/f;->ON_PAUSE:Landroidx/lifecycle/f;

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_6
    sget-object v5, Landroidx/lifecycle/f;->ON_STOP:Landroidx/lifecycle/f;

    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_7
    sget-object v5, Landroidx/lifecycle/f;->ON_DESTROY:Landroidx/lifecycle/f;

    .line 194
    .line 195
    :goto_2
    if-eqz v5, :cond_8

    .line 196
    .line 197
    invoke-virtual {v5}, Landroidx/lifecycle/f;->a()Landroidx/lifecycle/g;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    iget-object v7, p0, Landroidx/lifecycle/n;->h:Ljava/util/ArrayList;

    .line 202
    .line 203
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1, v0, v5}, Landroidx/lifecycle/m;->a(Landroidx/lifecycle/l;Landroidx/lifecycle/f;)V

    .line 207
    .line 208
    .line 209
    iget-object v5, p0, Landroidx/lifecycle/n;->h:Ljava/util/ArrayList;

    .line 210
    .line 211
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    add-int/lit8 v6, v6, -0x1

    .line 216
    .line 217
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    goto :goto_1

    .line 221
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 222
    .line 223
    new-instance v2, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    const-string v3, "no event down from "

    .line 226
    .line 227
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    iget-object v1, v1, Landroidx/lifecycle/m;->a:Landroidx/lifecycle/g;

    .line 231
    .line 232
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    throw v0

    .line 243
    :cond_9
    iget-object v1, p0, Landroidx/lifecycle/n;->b:Ll/a;

    .line 244
    .line 245
    iget-object v1, v1, Ll/a;->f:Ll/c;

    .line 246
    .line 247
    iget-boolean v2, p0, Landroidx/lifecycle/n;->g:Z

    .line 248
    .line 249
    if-nez v2, :cond_0

    .line 250
    .line 251
    if-eqz v1, :cond_0

    .line 252
    .line 253
    iget-object v2, p0, Landroidx/lifecycle/n;->c:Landroidx/lifecycle/g;

    .line 254
    .line 255
    iget-object v1, v1, Ll/c;->f:Landroidx/lifecycle/m;

    .line 256
    .line 257
    iget-object v1, v1, Landroidx/lifecycle/m;->a:Landroidx/lifecycle/g;

    .line 258
    .line 259
    invoke-virtual {v2, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    if-lez v1, :cond_0

    .line 264
    .line 265
    iget-object v1, p0, Landroidx/lifecycle/n;->b:Ll/a;

    .line 266
    .line 267
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    new-instance v2, Ll/d;

    .line 271
    .line 272
    invoke-direct {v2, v1}, Ll/d;-><init>(Ll/a;)V

    .line 273
    .line 274
    .line 275
    iget-object v1, v1, Ll/a;->g:Ljava/util/WeakHashMap;

    .line 276
    .line 277
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 278
    .line 279
    invoke-virtual {v1, v2, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    :cond_a
    invoke-virtual {v2}, Ll/d;->hasNext()Z

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    if-eqz v1, :cond_0

    .line 287
    .line 288
    iget-boolean v1, p0, Landroidx/lifecycle/n;->g:Z

    .line 289
    .line 290
    if-nez v1, :cond_0

    .line 291
    .line 292
    invoke-virtual {v2}, Ll/d;->next()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    check-cast v1, Ljava/util/Map$Entry;

    .line 297
    .line 298
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    check-cast v3, Landroidx/lifecycle/k;

    .line 303
    .line 304
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    check-cast v1, Landroidx/lifecycle/m;

    .line 309
    .line 310
    :goto_3
    iget-object v4, v1, Landroidx/lifecycle/m;->a:Landroidx/lifecycle/g;

    .line 311
    .line 312
    iget-object v5, p0, Landroidx/lifecycle/n;->c:Landroidx/lifecycle/g;

    .line 313
    .line 314
    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    if-gez v4, :cond_a

    .line 319
    .line 320
    iget-boolean v4, p0, Landroidx/lifecycle/n;->g:Z

    .line 321
    .line 322
    if-nez v4, :cond_a

    .line 323
    .line 324
    iget-object v4, p0, Landroidx/lifecycle/n;->b:Ll/a;

    .line 325
    .line 326
    iget-object v4, v4, Ll/a;->i:Ljava/util/HashMap;

    .line 327
    .line 328
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v4

    .line 332
    if-eqz v4, :cond_a

    .line 333
    .line 334
    iget-object v4, v1, Landroidx/lifecycle/m;->a:Landroidx/lifecycle/g;

    .line 335
    .line 336
    iget-object v5, p0, Landroidx/lifecycle/n;->h:Ljava/util/ArrayList;

    .line 337
    .line 338
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    sget-object v4, Landroidx/lifecycle/f;->Companion:Landroidx/lifecycle/d;

    .line 342
    .line 343
    iget-object v5, v1, Landroidx/lifecycle/m;->a:Landroidx/lifecycle/g;

    .line 344
    .line 345
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    invoke-static {v5}, Landroidx/lifecycle/d;->a(Landroidx/lifecycle/g;)Landroidx/lifecycle/f;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    if-eqz v4, :cond_b

    .line 353
    .line 354
    invoke-virtual {v1, v0, v4}, Landroidx/lifecycle/m;->a(Landroidx/lifecycle/l;Landroidx/lifecycle/f;)V

    .line 355
    .line 356
    .line 357
    iget-object v4, p0, Landroidx/lifecycle/n;->h:Ljava/util/ArrayList;

    .line 358
    .line 359
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 360
    .line 361
    .line 362
    move-result v5

    .line 363
    add-int/lit8 v5, v5, -0x1

    .line 364
    .line 365
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    goto :goto_3

    .line 369
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 370
    .line 371
    new-instance v2, Ljava/lang/StringBuilder;

    .line 372
    .line 373
    const-string v3, "no event up from "

    .line 374
    .line 375
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    iget-object v1, v1, Landroidx/lifecycle/m;->a:Landroidx/lifecycle/g;

    .line 379
    .line 380
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    throw v0

    .line 391
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 392
    .line 393
    const-string v1, "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."

    .line 394
    .line 395
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    throw v0
.end method
