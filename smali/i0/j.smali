.class public final Li0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq0/f;
.implements Li0/k;


# instance fields
.field public final e:Lio/flutter/embedding/engine/FlutterJNI;

.field public final f:Ljava/util/HashMap;

.field public final g:Ljava/util/HashMap;

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final j:Ljava/util/HashMap;

.field public k:I

.field public final l:Li0/l;

.field public final m:Ljava/util/WeakHashMap;

.field public final n:LD/j;


# direct methods
.method public constructor <init>(Lio/flutter/embedding/engine/FlutterJNI;)V
    .locals 3

    .line 1
    new-instance v0, LD/j;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, LD/j;-><init>(IZ)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, LN/b;->E()LN/b;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, LN/b;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ljava/util/concurrent/ExecutorService;

    .line 16
    .line 17
    iput-object v1, v0, LD/j;->f:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance v1, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Li0/j;->f:Ljava/util/HashMap;

    .line 28
    .line 29
    new-instance v1, Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Li0/j;->g:Ljava/util/HashMap;

    .line 35
    .line 36
    new-instance v1, Ljava/lang/Object;

    .line 37
    .line 38
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v1, p0, Li0/j;->h:Ljava/lang/Object;

    .line 42
    .line 43
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 47
    .line 48
    .line 49
    iput-object v1, p0, Li0/j;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 50
    .line 51
    new-instance v1, Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v1, p0, Li0/j;->j:Ljava/util/HashMap;

    .line 57
    .line 58
    const/4 v1, 0x1

    .line 59
    iput v1, p0, Li0/j;->k:I

    .line 60
    .line 61
    new-instance v1, Li0/l;

    .line 62
    .line 63
    invoke-direct {v1}, Li0/l;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object v1, p0, Li0/j;->l:Li0/l;

    .line 67
    .line 68
    new-instance v1, Ljava/util/WeakHashMap;

    .line 69
    .line 70
    invoke-direct {v1}, Ljava/util/WeakHashMap;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object v1, p0, Li0/j;->m:Ljava/util/WeakHashMap;

    .line 74
    .line 75
    iput-object p1, p0, Li0/j;->e:Lio/flutter/embedding/engine/FlutterJNI;

    .line 76
    .line 77
    iput-object v0, p0, Li0/j;->n:LD/j;

    .line 78
    .line 79
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Li0/f;Ljava/nio/ByteBuffer;IJ)V
    .locals 14

    .line 1
    move-object/from16 v5, p2

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/4 v1, 0x1

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x0

    .line 8
    if-eqz v5, :cond_0

    .line 9
    .line 10
    iget-object v6, v5, Li0/f;->b:Li0/e;

    .line 11
    .line 12
    move-object v9, v6

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v9, v4

    .line 15
    :goto_0
    new-instance v6, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v7, "PlatformChannel ScheduleHandler on "

    .line 18
    .line 19
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    move-object v7, p1

    .line 23
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    invoke-static {v6}, Lw0/a;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 35
    .line 36
    const/16 v10, 0x1d

    .line 37
    .line 38
    if-lt v8, v10, :cond_1

    .line 39
    .line 40
    invoke-static {v6}, La1/a;->I(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    move/from16 v8, p4

    .line 45
    .line 46
    invoke-static {v0, v8}, LP/a;->a(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_1
    move/from16 v8, p4

    .line 51
    .line 52
    invoke-static {v6}, La1/a;->I(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    const-string v10, "asyncTraceBegin"

    .line 57
    .line 58
    :try_start_0
    sget-object v11, La1/a;->g:Ljava/lang/reflect/Method;

    .line 59
    .line 60
    if-nez v11, :cond_2

    .line 61
    .line 62
    const-class v11, Landroid/os/Trace;

    .line 63
    .line 64
    new-array v12, v3, [Ljava/lang/Class;

    .line 65
    .line 66
    sget-object v13, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 67
    .line 68
    aput-object v13, v12, v2

    .line 69
    .line 70
    const-class v13, Ljava/lang/String;

    .line 71
    .line 72
    aput-object v13, v12, v1

    .line 73
    .line 74
    sget-object v13, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 75
    .line 76
    aput-object v13, v12, v0

    .line 77
    .line 78
    invoke-virtual {v11, v10, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 79
    .line 80
    .line 81
    move-result-object v11

    .line 82
    sput-object v11, La1/a;->g:Ljava/lang/reflect/Method;

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :catch_0
    move-exception v0

    .line 86
    goto :goto_2

    .line 87
    :cond_2
    :goto_1
    sget-object v11, La1/a;->g:Ljava/lang/reflect/Method;

    .line 88
    .line 89
    sget-wide v12, La1/a;->e:J

    .line 90
    .line 91
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 92
    .line 93
    .line 94
    move-result-object v12

    .line 95
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v13

    .line 99
    new-array v3, v3, [Ljava/lang/Object;

    .line 100
    .line 101
    aput-object v12, v3, v2

    .line 102
    .line 103
    aput-object v6, v3, v1

    .line 104
    .line 105
    aput-object v13, v3, v0

    .line 106
    .line 107
    invoke-virtual {v11, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    .line 109
    .line 110
    goto :goto_3

    .line 111
    :goto_2
    invoke-static {v10, v0}, La1/a;->q(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 112
    .line 113
    .line 114
    :goto_3
    new-instance v0, Li0/c;

    .line 115
    .line 116
    move-object v1, v0

    .line 117
    move-object v2, p0

    .line 118
    move-object v3, p1

    .line 119
    move/from16 v4, p4

    .line 120
    .line 121
    move-object/from16 v5, p2

    .line 122
    .line 123
    move-object/from16 v6, p3

    .line 124
    .line 125
    move-wide/from16 v7, p5

    .line 126
    .line 127
    invoke-direct/range {v1 .. v8}, Li0/c;-><init>(Li0/j;Ljava/lang/String;ILi0/f;Ljava/nio/ByteBuffer;J)V

    .line 128
    .line 129
    .line 130
    move-object v1, p0

    .line 131
    if-nez v9, :cond_3

    .line 132
    .line 133
    iget-object v9, v1, Li0/j;->l:Li0/l;

    .line 134
    .line 135
    :cond_3
    invoke-interface {v9, v0}, Li0/e;->a(Li0/c;)V

    .line 136
    .line 137
    .line 138
    return-void
.end method

.method public final b(Lq0/i;)LH/a;
    .locals 2

    .line 1
    iget-object p1, p0, Li0/j;->n:LD/j;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Li0/i;

    .line 7
    .line 8
    iget-object p1, p1, LD/j;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Ljava/util/concurrent/ExecutorService;

    .line 11
    .line 12
    invoke-direct {v0, p1}, Li0/i;-><init>(Ljava/util/concurrent/ExecutorService;)V

    .line 13
    .line 14
    .line 15
    new-instance p1, LH/a;

    .line 16
    .line 17
    const/16 v1, 0x10

    .line 18
    .line 19
    invoke-direct {p1, v1}, LH/a;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Li0/j;->m:Ljava/util/WeakHashMap;

    .line 23
    .line 24
    invoke-virtual {v1, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-object p1
.end method

.method public final e(Ljava/lang/String;Lq0/d;LH/a;)V
    .locals 8

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Li0/j;->h:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object p2, p0, Li0/j;->f:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    monitor-exit v0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    throw p1

    .line 16
    :cond_0
    if-eqz p3, :cond_2

    .line 17
    .line 18
    iget-object v0, p0, Li0/j;->m:Ljava/util/WeakHashMap;

    .line 19
    .line 20
    invoke-virtual {v0, p3}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    check-cast p3, Li0/e;

    .line 25
    .line 26
    if-eqz p3, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 30
    .line 31
    const-string p2, "Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue)."

    .line 32
    .line 33
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_2
    const/4 p3, 0x0

    .line 38
    :goto_0
    iget-object v0, p0, Li0/j;->h:Ljava/lang/Object;

    .line 39
    .line 40
    monitor-enter v0

    .line 41
    :try_start_1
    iget-object v1, p0, Li0/j;->f:Ljava/util/HashMap;

    .line 42
    .line 43
    new-instance v2, Li0/f;

    .line 44
    .line 45
    invoke-direct {v2, p2, p3}, Li0/f;-><init>(Lq0/d;Li0/e;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    iget-object p2, p0, Li0/j;->g:Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    check-cast p2, Ljava/util/List;

    .line 58
    .line 59
    if-nez p2, :cond_3

    .line 60
    .line 61
    monitor-exit v0

    .line 62
    return-void

    .line 63
    :catchall_1
    move-exception p1

    .line 64
    goto :goto_2

    .line 65
    :cond_3
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 66
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    if-eqz p3, :cond_4

    .line 75
    .line 76
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    check-cast p3, Li0/d;

    .line 81
    .line 82
    iget-object v0, p0, Li0/j;->f:Ljava/util/HashMap;

    .line 83
    .line 84
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    move-object v3, v0

    .line 89
    check-cast v3, Li0/f;

    .line 90
    .line 91
    iget-object v4, p3, Li0/d;->a:Ljava/nio/ByteBuffer;

    .line 92
    .line 93
    iget v5, p3, Li0/d;->b:I

    .line 94
    .line 95
    iget-wide v6, p3, Li0/d;->c:J

    .line 96
    .line 97
    move-object v1, p0

    .line 98
    move-object v2, p1

    .line 99
    invoke-virtual/range {v1 .. v7}, Li0/j;->a(Ljava/lang/String;Li0/f;Ljava/nio/ByteBuffer;IJ)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    return-void

    .line 104
    :goto_2
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 105
    throw p1
.end method

.method public final f(Ljava/lang/String;Lq0/d;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Li0/j;->e(Ljava/lang/String;Lq0/d;LH/a;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final m()LH/a;
    .locals 3

    .line 1
    iget-object v0, p0, Li0/j;->n:LD/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Li0/i;

    .line 7
    .line 8
    iget-object v0, v0, LD/j;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/util/concurrent/ExecutorService;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Li0/i;-><init>(Ljava/util/concurrent/ExecutorService;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, LH/a;

    .line 16
    .line 17
    const/16 v2, 0x10

    .line 18
    .line 19
    invoke-direct {v0, v2}, LH/a;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Li0/j;->m:Ljava/util/WeakHashMap;

    .line 23
    .line 24
    invoke-virtual {v2, v0, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public final n(Ljava/lang/String;Ljava/nio/ByteBuffer;Lq0/e;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "DartMessenger#send on "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lw0/a;->b(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :try_start_0
    iget v0, p0, Li0/j;->k:I

    .line 19
    .line 20
    add-int/lit8 v1, v0, 0x1

    .line 21
    .line 22
    iput v1, p0, Li0/j;->k:I

    .line 23
    .line 24
    if-eqz p3, :cond_0

    .line 25
    .line 26
    iget-object v1, p0, Li0/j;->j:Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v1, v2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    goto :goto_2

    .line 38
    :cond_0
    :goto_0
    iget-object p3, p0, Li0/j;->e:Lio/flutter/embedding/engine/FlutterJNI;

    .line 39
    .line 40
    if-nez p2, :cond_1

    .line 41
    .line 42
    :try_start_1
    invoke-virtual {p3, p1, v0}, Lio/flutter/embedding/engine/FlutterJNI;->dispatchEmptyPlatformMessage(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-virtual {p2}, Ljava/nio/Buffer;->position()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    invoke-virtual {p3, p1, p2, v1, v0}, Lio/flutter/embedding/engine/FlutterJNI;->dispatchPlatformMessage(Ljava/lang/String;Ljava/nio/ByteBuffer;II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    .line 52
    .line 53
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :goto_2
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 58
    .line 59
    .line 60
    goto :goto_3

    .line 61
    :catchall_1
    move-exception p2

    .line 62
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    :goto_3
    throw p1
.end method
