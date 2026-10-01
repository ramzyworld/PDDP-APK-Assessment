.class public abstract LV0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LD/j;

.field public static final b:LD/j;

.field public static final c:LD/j;

.field public static final d:LD/j;

.field public static final e:LD/j;

.field public static final f:LD/j;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LD/j;

    .line 2
    .line 3
    const-string v1, "NO_DECISION"

    .line 4
    .line 5
    const/16 v2, 0xe

    .line 6
    .line 7
    invoke-direct {v0, v2, v1}, LD/j;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, LV0/a;->a:LD/j;

    .line 11
    .line 12
    new-instance v0, LD/j;

    .line 13
    .line 14
    const-string v1, "CLOSED"

    .line 15
    .line 16
    const/16 v2, 0xe

    .line 17
    .line 18
    invoke-direct {v0, v2, v1}, LD/j;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, LV0/a;->b:LD/j;

    .line 22
    .line 23
    new-instance v0, LD/j;

    .line 24
    .line 25
    const-string v1, "UNDEFINED"

    .line 26
    .line 27
    const/16 v2, 0xe

    .line 28
    .line 29
    invoke-direct {v0, v2, v1}, LD/j;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sput-object v0, LV0/a;->c:LD/j;

    .line 33
    .line 34
    new-instance v0, LD/j;

    .line 35
    .line 36
    const-string v1, "REUSABLE_CLAIMED"

    .line 37
    .line 38
    invoke-direct {v0, v2, v1}, LD/j;-><init>(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sput-object v0, LV0/a;->d:LD/j;

    .line 42
    .line 43
    new-instance v0, LD/j;

    .line 44
    .line 45
    const-string v1, "CONDITION_FALSE"

    .line 46
    .line 47
    const/16 v2, 0xe

    .line 48
    .line 49
    invoke-direct {v0, v2, v1}, LD/j;-><init>(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sput-object v0, LV0/a;->e:LD/j;

    .line 53
    .line 54
    new-instance v0, LD/j;

    .line 55
    .line 56
    const-string v1, "NO_THREAD_ELEMENTS"

    .line 57
    .line 58
    const/16 v2, 0xe

    .line 59
    .line 60
    invoke-direct {v0, v2, v1}, LD/j;-><init>(ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    sput-object v0, LV0/a;->f:LD/j;

    .line 64
    .line 65
    return-void
.end method

.method public static final a(LH0/l;Ljava/lang/Object;LO/c;)LO/c;
    .locals 2

    .line 1
    :try_start_0
    invoke-interface {p0, p1}, LH0/l;->j(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    goto :goto_0

    .line 5
    :catchall_0
    move-exception p0

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eq v0, p0, :cond_0

    .line 13
    .line 14
    invoke-static {p2, p0}, La1/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    return-object p2

    .line 18
    :cond_0
    new-instance p2, LO/c;

    .line 19
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v1, "Exception in undelivered element handler for "

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-direct {p2, p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    return-object p2
.end method

.method public static final b(LV0/v;JLH0/p;)Ljava/lang/Object;
    .locals 4

    .line 1
    :goto_0
    iget-wide v0, p0, LV0/v;->g:J

    .line 2
    .line 3
    cmp-long v2, v0, p1

    .line 4
    .line 5
    if-ltz v2, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, LV0/v;->c()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    return-object p0

    .line 15
    :cond_1
    :goto_1
    sget-object v0, LV0/d;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, LV0/a;->b:LD/j;

    .line 22
    .line 23
    if-ne v0, v1, :cond_2

    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_2
    check-cast v0, LV0/d;

    .line 27
    .line 28
    check-cast v0, LV0/v;

    .line 29
    .line 30
    if-eqz v0, :cond_4

    .line 31
    .line 32
    :cond_3
    :goto_2
    move-object p0, v0

    .line 33
    goto :goto_0

    .line 34
    :cond_4
    iget-wide v0, p0, LV0/v;->g:J

    .line 35
    .line 36
    const-wide/16 v2, 0x1

    .line 37
    .line 38
    add-long/2addr v0, v2

    .line 39
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {p3, v0, p0}, LH0/p;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, LV0/v;

    .line 48
    .line 49
    :cond_5
    sget-object v1, LV0/d;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    invoke-virtual {v1, p0, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_6

    .line 57
    .line 58
    invoke-virtual {p0}, LV0/v;->c()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    invoke-virtual {p0}, LV0/d;->d()V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_6
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    if-eqz v1, :cond_5

    .line 73
    .line 74
    goto :goto_0
.end method

.method public static final c(Ljava/lang/Object;)LV0/v;
    .locals 1

    .line 1
    sget-object v0, LV0/a;->b:LD/j;

    .line 2
    .line 3
    if-eq p0, v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LV0/v;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Does not contain segment"

    .line 11
    .line 12
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p0
.end method

.method public static final d(Ljava/lang/Throwable;Lz0/i;)V
    .locals 4

    .line 1
    sget-object v0, LV0/f;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

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
    check-cast v1, LR0/b;

    .line 18
    .line 19
    :try_start_0
    invoke-virtual {v1, p0, p1}, LR0/b;->e(Ljava/lang/Throwable;Lz0/i;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    if-ne p0, v1, :cond_0

    .line 25
    .line 26
    move-object v2, p0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    new-instance v2, Ljava/lang/RuntimeException;

    .line 29
    .line 30
    const-string v3, "Exception while trying to handle coroutine exception"

    .line 31
    .line 32
    invoke-direct {v2, v3, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v2, p0}, La1/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-interface {v3, v1, v2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :try_start_1
    new-instance v0, LV0/g;

    .line 51
    .line 52
    invoke-direct {v0, p1}, LV0/g;-><init>(Lz0/i;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v0}, La1/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 56
    .line 57
    .line 58
    :catchall_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-interface {v0, p1, p0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public static final e(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    sget-object v0, LV0/a;->b:LD/j;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    :goto_0
    return p0
.end method

.method public static final f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    move-object p0, p1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    instance-of v0, p0, Ljava/util/ArrayList;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    check-cast v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-object p0, v0

    .line 29
    :goto_0
    return-object p0
.end method

.method public static final g(Lz0/i;Ljava/lang/Object;)V
    .locals 2

    .line 1
    sget-object v0, LV0/a;->f:LD/j;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    instance-of v0, p1, LV0/A;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    check-cast p1, LV0/A;

    .line 12
    .line 13
    iget-object p0, p1, LV0/A;->b:[LQ0/g0;

    .line 14
    .line 15
    array-length v0, p0

    .line 16
    add-int/lit8 v0, v0, -0x1

    .line 17
    .line 18
    if-gez v0, :cond_1

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    aget-object p0, p0, v0

    .line 22
    .line 23
    invoke-static {v1}, LI0/i;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p1, LV0/A;->a:[Ljava/lang/Object;

    .line 27
    .line 28
    aget-object p0, p0, v0

    .line 29
    .line 30
    throw v1

    .line 31
    :cond_2
    sget-object p1, LV0/y;->h:LV0/y;

    .line 32
    .line 33
    invoke-interface {p0, v1, p1}, Lz0/i;->d(Ljava/lang/Object;LH0/p;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const-string p1, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    .line 38
    .line 39
    invoke-static {p0, p1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0}, LI0/h;->g(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    throw v1
.end method

.method public static final h(Lz0/d;Ljava/lang/Object;LH0/l;)V
    .locals 8

    .line 1
    instance-of v0, p0, LV0/h;

    .line 2
    .line 3
    if-eqz v0, :cond_b

    .line 4
    .line 5
    check-cast p0, LV0/h;

    .line 6
    .line 7
    invoke-static {p1}, Lx0/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    new-instance v0, LQ0/o;

    .line 16
    .line 17
    invoke-direct {v0, p1, p2}, LQ0/o;-><init>(Ljava/lang/Object;LH0/l;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v0, p1

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    new-instance p2, LQ0/n;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {p2, v0, v1}, LQ0/n;-><init>(Ljava/lang/Throwable;Z)V

    .line 27
    .line 28
    .line 29
    move-object v0, p2

    .line 30
    :goto_0
    iget-object p2, p0, LV0/h;->i:LB0/b;

    .line 31
    .line 32
    invoke-interface {p2}, Lz0/d;->i()Lz0/i;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, LV0/h;->h:LQ0/s;

    .line 36
    .line 37
    invoke-virtual {v1}, LQ0/s;->g()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    const/4 v3, 0x1

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    iput-object v0, p0, LV0/h;->j:Ljava/lang/Object;

    .line 45
    .line 46
    iput v3, p0, LQ0/A;->g:I

    .line 47
    .line 48
    invoke-interface {p2}, Lz0/d;->i()Lz0/i;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v1, p1, p0}, LQ0/s;->e(Lz0/i;Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_5

    .line 56
    .line 57
    :cond_2
    invoke-static {}, LQ0/h0;->a()LQ0/H;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iget-wide v4, v1, LQ0/H;->g:J

    .line 62
    .line 63
    const-wide v6, 0x100000000L

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    cmp-long v2, v4, v6

    .line 69
    .line 70
    if-ltz v2, :cond_4

    .line 71
    .line 72
    iput-object v0, p0, LV0/h;->j:Ljava/lang/Object;

    .line 73
    .line 74
    iput v3, p0, LQ0/A;->g:I

    .line 75
    .line 76
    iget-object p1, v1, LQ0/H;->i:Ly0/b;

    .line 77
    .line 78
    if-nez p1, :cond_3

    .line 79
    .line 80
    new-instance p1, Ly0/b;

    .line 81
    .line 82
    invoke-direct {p1}, Ly0/b;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object p1, v1, LQ0/H;->i:Ly0/b;

    .line 86
    .line 87
    :cond_3
    invoke-virtual {p1, p0}, Ly0/b;->addLast(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    goto/16 :goto_5

    .line 91
    .line 92
    :cond_4
    invoke-virtual {v1, v3}, LQ0/H;->k(Z)V

    .line 93
    .line 94
    .line 95
    const/4 v2, 0x0

    .line 96
    :try_start_0
    invoke-interface {p2}, Lz0/d;->i()Lz0/i;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    sget-object v5, LQ0/t;->f:LQ0/t;

    .line 101
    .line 102
    invoke-interface {v4, v5}, Lz0/i;->f(Lz0/h;)Lz0/g;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    check-cast v4, LQ0/P;

    .line 107
    .line 108
    if-eqz v4, :cond_5

    .line 109
    .line 110
    invoke-interface {v4}, LQ0/P;->b()Z

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    if-nez v5, :cond_5

    .line 115
    .line 116
    check-cast v4, LQ0/Z;

    .line 117
    .line 118
    invoke-virtual {v4}, LQ0/Z;->A()Ljava/util/concurrent/CancellationException;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p0, v0, p1}, LV0/h;->b(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V

    .line 123
    .line 124
    .line 125
    invoke-static {p1}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p0, p1}, LV0/h;->m(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :catchall_0
    move-exception p1

    .line 134
    goto :goto_4

    .line 135
    :cond_5
    iget-object v0, p0, LV0/h;->k:Ljava/lang/Object;

    .line 136
    .line 137
    invoke-interface {p2}, Lz0/d;->i()Lz0/i;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    invoke-static {v4, v0}, LV0/a;->m(Lz0/i;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    sget-object v5, LV0/a;->f:LD/j;

    .line 146
    .line 147
    if-eq v0, v5, :cond_6

    .line 148
    .line 149
    invoke-static {p2, v4, v0}, LQ0/v;->m(Lz0/d;Lz0/i;Ljava/lang/Object;)LQ0/j0;

    .line 150
    .line 151
    .line 152
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    goto :goto_1

    .line 154
    :cond_6
    move-object v5, v2

    .line 155
    :goto_1
    :try_start_1
    invoke-virtual {p2, p1}, LB0/b;->m(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 156
    .line 157
    .line 158
    if-eqz v5, :cond_7

    .line 159
    .line 160
    :try_start_2
    invoke-virtual {v5}, LQ0/j0;->X()Z

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    if-eqz p1, :cond_8

    .line 165
    .line 166
    :cond_7
    invoke-static {v4, v0}, LV0/a;->g(Lz0/i;Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    :cond_8
    :goto_2
    invoke-virtual {v1}, LQ0/H;->m()Z

    .line 170
    .line 171
    .line 172
    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 173
    if-nez p1, :cond_8

    .line 174
    .line 175
    :goto_3
    invoke-virtual {v1, v3}, LQ0/H;->i(Z)V

    .line 176
    .line 177
    .line 178
    goto :goto_5

    .line 179
    :catchall_1
    move-exception p1

    .line 180
    if-eqz v5, :cond_9

    .line 181
    .line 182
    :try_start_3
    invoke-virtual {v5}, LQ0/j0;->X()Z

    .line 183
    .line 184
    .line 185
    move-result p2

    .line 186
    if-eqz p2, :cond_a

    .line 187
    .line 188
    :cond_9
    invoke-static {v4, v0}, LV0/a;->g(Lz0/i;Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    :cond_a
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 192
    :goto_4
    :try_start_4
    invoke-virtual {p0, p1, v2}, LQ0/A;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 193
    .line 194
    .line 195
    goto :goto_3

    .line 196
    :catchall_2
    move-exception p0

    .line 197
    invoke-virtual {v1, v3}, LQ0/H;->i(Z)V

    .line 198
    .line 199
    .line 200
    throw p0

    .line 201
    :cond_b
    invoke-interface {p0, p1}, Lz0/d;->m(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    :goto_5
    return-void
.end method

.method public static synthetic i(Ljava/lang/Object;Lz0/d;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p1, p0, v0}, LV0/a;->h(Lz0/d;Ljava/lang/Object;LH0/l;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static final j(Ljava/lang/String;JJJ)J
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p3

    .line 4
    .line 5
    move-wide/from16 v3, p5

    .line 6
    .line 7
    const/4 v5, 0x1

    .line 8
    sget v6, LV0/x;->a:I

    .line 9
    .line 10
    :try_start_0
    invoke-static/range {p0 .. p0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v7
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    goto :goto_0

    .line 15
    :catch_0
    nop

    .line 16
    const/4 v7, 0x0

    .line 17
    :goto_0
    if-nez v7, :cond_0

    .line 18
    .line 19
    move-wide/from16 v8, p1

    .line 20
    .line 21
    goto/16 :goto_8

    .line 22
    .line 23
    :cond_0
    new-instance v8, LM0/c;

    .line 24
    .line 25
    const/4 v9, 0x2

    .line 26
    const/16 v10, 0x24

    .line 27
    .line 28
    invoke-direct {v8, v9, v10, v5}, LM0/a;-><init>(III)V

    .line 29
    .line 30
    .line 31
    iget v8, v8, LM0/a;->f:I

    .line 32
    .line 33
    const/16 v11, 0xa

    .line 34
    .line 35
    if-gt v11, v8, :cond_e

    .line 36
    .line 37
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    if-nez v8, :cond_2

    .line 42
    .line 43
    :cond_1
    :goto_1
    move-object/from16 v20, v7

    .line 44
    .line 45
    :goto_2
    const/4 v6, 0x0

    .line 46
    goto/16 :goto_7

    .line 47
    .line 48
    :cond_2
    const/4 v9, 0x0

    .line 49
    invoke-virtual {v7, v9}, Ljava/lang/String;->charAt(I)C

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    const/16 v12, 0x30

    .line 54
    .line 55
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    if-ge v10, v12, :cond_5

    .line 61
    .line 62
    if-ne v8, v5, :cond_3

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    const/16 v12, 0x2d

    .line 66
    .line 67
    if-ne v10, v12, :cond_4

    .line 68
    .line 69
    const-wide/high16 v13, -0x8000000000000000L

    .line 70
    .line 71
    const/4 v9, 0x1

    .line 72
    const/4 v10, 0x1

    .line 73
    goto :goto_3

    .line 74
    :cond_4
    const/16 v12, 0x2b

    .line 75
    .line 76
    if-ne v10, v12, :cond_1

    .line 77
    .line 78
    const/4 v9, 0x1

    .line 79
    :cond_5
    const/4 v10, 0x0

    .line 80
    :goto_3
    const-wide v15, -0x38e38e38e38e38eL    # -2.772000429909333E291

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    const-wide/16 v17, 0x0

    .line 86
    .line 87
    move-wide/from16 v5, v17

    .line 88
    .line 89
    move-wide/from16 v18, v15

    .line 90
    .line 91
    :goto_4
    if-ge v9, v8, :cond_a

    .line 92
    .line 93
    invoke-virtual {v7, v9}, Ljava/lang/String;->charAt(I)C

    .line 94
    .line 95
    .line 96
    move-result v12

    .line 97
    invoke-static {v12, v11}, Ljava/lang/Character;->digit(II)I

    .line 98
    .line 99
    .line 100
    move-result v12

    .line 101
    if-gez v12, :cond_6

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_6
    cmp-long v20, v5, v18

    .line 105
    .line 106
    if-gez v20, :cond_7

    .line 107
    .line 108
    cmp-long v20, v18, v15

    .line 109
    .line 110
    if-nez v20, :cond_1

    .line 111
    .line 112
    move-object/from16 v20, v7

    .line 113
    .line 114
    move/from16 p2, v8

    .line 115
    .line 116
    int-to-long v7, v11

    .line 117
    div-long v18, v13, v7

    .line 118
    .line 119
    cmp-long v7, v5, v18

    .line 120
    .line 121
    if-gez v7, :cond_8

    .line 122
    .line 123
    :goto_5
    goto :goto_2

    .line 124
    :cond_7
    move-object/from16 v20, v7

    .line 125
    .line 126
    move/from16 p2, v8

    .line 127
    .line 128
    :cond_8
    int-to-long v7, v11

    .line 129
    mul-long v5, v5, v7

    .line 130
    .line 131
    int-to-long v7, v12

    .line 132
    add-long v21, v13, v7

    .line 133
    .line 134
    cmp-long v12, v5, v21

    .line 135
    .line 136
    if-gez v12, :cond_9

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_9
    sub-long/2addr v5, v7

    .line 140
    const/4 v7, 0x1

    .line 141
    add-int/2addr v9, v7

    .line 142
    move/from16 v8, p2

    .line 143
    .line 144
    move-object/from16 v7, v20

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_a
    move-object/from16 v20, v7

    .line 148
    .line 149
    if-eqz v10, :cond_b

    .line 150
    .line 151
    :goto_6
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    move-object v6, v5

    .line 156
    goto :goto_7

    .line 157
    :cond_b
    neg-long v5, v5

    .line 158
    goto :goto_6

    .line 159
    :goto_7
    const/16 v5, 0x27

    .line 160
    .line 161
    const-string v7, "System property \'"

    .line 162
    .line 163
    if-eqz v6, :cond_d

    .line 164
    .line 165
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 166
    .line 167
    .line 168
    move-result-wide v8

    .line 169
    cmp-long v6, v1, v8

    .line 170
    .line 171
    if-gtz v6, :cond_c

    .line 172
    .line 173
    cmp-long v6, v8, v3

    .line 174
    .line 175
    if-gtz v6, :cond_c

    .line 176
    .line 177
    :goto_8
    return-wide v8

    .line 178
    :cond_c
    new-instance v6, Ljava/lang/IllegalStateException;

    .line 179
    .line 180
    new-instance v10, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    invoke-direct {v10, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    const-string v0, "\' should be in range "

    .line 189
    .line 190
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v10, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    const-string v0, ".."

    .line 197
    .line 198
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v10, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    const-string v0, ", but is \'"

    .line 205
    .line 206
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v10, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-direct {v6, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw v6

    .line 227
    :cond_d
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 228
    .line 229
    new-instance v2, Ljava/lang/StringBuilder;

    .line 230
    .line 231
    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    const-string v0, "\' has unrecognized value \'"

    .line 238
    .line 239
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    move-object/from16 v6, v20

    .line 243
    .line 244
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    throw v1

    .line 262
    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 263
    .line 264
    new-instance v1, Ljava/lang/StringBuilder;

    .line 265
    .line 266
    const-string v2, "radix 10 was not in valid range "

    .line 267
    .line 268
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    new-instance v2, LM0/c;

    .line 272
    .line 273
    const/4 v3, 0x1

    .line 274
    invoke-direct {v2, v9, v10, v3}, LM0/a;-><init>(III)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw v0
.end method

.method public static k(Ljava/lang/String;IIII)I
    .locals 7

    .line 1
    and-int/lit8 v0, p4, 0x4

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x1

    .line 6
    :cond_0
    and-int/lit8 p4, p4, 0x8

    .line 7
    .line 8
    if-eqz p4, :cond_1

    .line 9
    .line 10
    const p3, 0x7fffffff

    .line 11
    .line 12
    .line 13
    :cond_1
    int-to-long v1, p1

    .line 14
    int-to-long v3, p2

    .line 15
    int-to-long v5, p3

    .line 16
    move-object v0, p0

    .line 17
    invoke-static/range {v0 .. v6}, LV0/a;->j(Ljava/lang/String;JJJ)J

    .line 18
    .line 19
    .line 20
    move-result-wide p0

    .line 21
    long-to-int p1, p0

    .line 22
    return p1
.end method

.method public static final l(Lz0/i;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sget-object v1, LV0/y;->g:LV0/y;

    .line 7
    .line 8
    invoke-interface {p0, v0, v1}, Lz0/i;->d(Ljava/lang/Object;LH0/p;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, LI0/i;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public static final m(Lz0/i;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, LV0/a;->l(Lz0/i;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-ne p1, v0, :cond_1

    .line 13
    .line 14
    sget-object p0, LV0/a;->f:LD/j;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    new-instance v0, LV0/A;

    .line 22
    .line 23
    check-cast p1, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-direct {v0, p1, p0}, LV0/A;-><init>(ILz0/i;)V

    .line 30
    .line 31
    .line 32
    sget-object p1, LV0/y;->i:LV0/y;

    .line 33
    .line 34
    invoke-interface {p0, v0, p1}, Lz0/i;->d(Ljava/lang/Object;LH0/p;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    :goto_0
    return-object p0

    .line 39
    :cond_2
    invoke-static {p1}, LI0/h;->g(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    throw p0
.end method
