.class public abstract LQ0/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LD/j;

.field public static final b:LD/j;

.field public static final c:LD/j;

.field public static final d:LD/j;

.field public static final e:LD/j;

.field public static final f:LD/j;

.field public static final g:LD/j;

.field public static final h:LQ0/E;

.field public static final i:LQ0/E;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LD/j;

    .line 2
    .line 3
    const-string v1, "RESUME_TOKEN"

    .line 4
    .line 5
    const/16 v2, 0xe

    .line 6
    .line 7
    invoke-direct {v0, v2, v1}, LD/j;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, LQ0/v;->a:LD/j;

    .line 11
    .line 12
    new-instance v0, LD/j;

    .line 13
    .line 14
    const-string v1, "CLOSED_EMPTY"

    .line 15
    .line 16
    const/16 v2, 0xe

    .line 17
    .line 18
    invoke-direct {v0, v2, v1}, LD/j;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, LQ0/v;->b:LD/j;

    .line 22
    .line 23
    new-instance v0, LD/j;

    .line 24
    .line 25
    const-string v1, "COMPLETING_ALREADY"

    .line 26
    .line 27
    const/16 v2, 0xe

    .line 28
    .line 29
    invoke-direct {v0, v2, v1}, LD/j;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sput-object v0, LQ0/v;->c:LD/j;

    .line 33
    .line 34
    new-instance v0, LD/j;

    .line 35
    .line 36
    const-string v1, "COMPLETING_WAITING_CHILDREN"

    .line 37
    .line 38
    invoke-direct {v0, v2, v1}, LD/j;-><init>(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sput-object v0, LQ0/v;->d:LD/j;

    .line 42
    .line 43
    new-instance v0, LD/j;

    .line 44
    .line 45
    const-string v1, "COMPLETING_RETRY"

    .line 46
    .line 47
    invoke-direct {v0, v2, v1}, LD/j;-><init>(ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sput-object v0, LQ0/v;->e:LD/j;

    .line 51
    .line 52
    new-instance v0, LD/j;

    .line 53
    .line 54
    const-string v1, "TOO_LATE_TO_CANCEL"

    .line 55
    .line 56
    invoke-direct {v0, v2, v1}, LD/j;-><init>(ILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, LQ0/v;->f:LD/j;

    .line 60
    .line 61
    new-instance v0, LD/j;

    .line 62
    .line 63
    const-string v1, "SEALED"

    .line 64
    .line 65
    invoke-direct {v0, v2, v1}, LD/j;-><init>(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    sput-object v0, LQ0/v;->g:LD/j;

    .line 69
    .line 70
    new-instance v0, LQ0/E;

    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    invoke-direct {v0, v1}, LQ0/E;-><init>(Z)V

    .line 74
    .line 75
    .line 76
    sput-object v0, LQ0/v;->h:LQ0/E;

    .line 77
    .line 78
    new-instance v0, LQ0/E;

    .line 79
    .line 80
    const/4 v1, 0x1

    .line 81
    invoke-direct {v0, v1}, LQ0/E;-><init>(Z)V

    .line 82
    .line 83
    .line 84
    sput-object v0, LQ0/v;->i:LQ0/E;

    .line 85
    .line 86
    return-void
.end method

.method public static final a(Lz0/i;Lz0/i;Z)Lz0/i;
    .locals 4

    .line 1
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    sget-object v0, LQ0/p;->h:LQ0/p;

    .line 4
    .line 5
    invoke-interface {p0, p2, v0}, Lz0/i;->d(Ljava/lang/Object;LH0/p;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-interface {p1, p2, v0}, Lz0/i;->d(Ljava/lang/Object;LH0/p;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    check-cast p2, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    if-nez p2, :cond_0

    .line 28
    .line 29
    invoke-interface {p0, p1}, Lz0/i;->c(Lz0/i;)Lz0/i;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_0
    sget-object v0, Lz0/j;->e:Lz0/j;

    .line 35
    .line 36
    new-instance v1, LQ0/p;

    .line 37
    .line 38
    const/4 v2, 0x2

    .line 39
    const/4 v3, 0x2

    .line 40
    invoke-direct {v1, v2, v3}, LQ0/p;-><init>(II)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p0, v0, v1}, Lz0/i;->d(Ljava/lang/Object;LH0/p;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Lz0/i;

    .line 48
    .line 49
    if-eqz p2, :cond_1

    .line 50
    .line 51
    check-cast p1, Lz0/i;

    .line 52
    .line 53
    sget-object p2, LQ0/p;->g:LQ0/p;

    .line 54
    .line 55
    invoke-interface {p1, v0, p2}, Lz0/i;->d(Ljava/lang/Object;LH0/p;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    :cond_1
    check-cast p1, Lz0/i;

    .line 60
    .line 61
    invoke-interface {p0, p1}, Lz0/i;->c(Lz0/i;)Lz0/i;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0
.end method

.method public static final b(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static final c(Lz0/d;)LQ0/f;
    .locals 6

    .line 1
    instance-of v0, p0, LV0/h;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LQ0/f;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p0}, LQ0/f;-><init>(ILz0/d;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    move-object v0, p0

    .line 13
    check-cast v0, LV0/h;

    .line 14
    .line 15
    :cond_1
    :goto_0
    sget-object v1, LV0/h;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget-object v3, LV0/a;->d:LD/j;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    if-nez v2, :cond_2

    .line 25
    .line 26
    invoke-virtual {v1, v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    move-object v2, v4

    .line 30
    goto :goto_1

    .line 31
    :cond_2
    instance-of v5, v2, LQ0/f;

    .line 32
    .line 33
    if-eqz v5, :cond_8

    .line 34
    .line 35
    :cond_3
    invoke-virtual {v1, v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_7

    .line 40
    .line 41
    check-cast v2, LQ0/f;

    .line 42
    .line 43
    :goto_1
    if-eqz v2, :cond_6

    .line 44
    .line 45
    sget-object v0, LQ0/f;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 46
    .line 47
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    instance-of v3, v1, LQ0/m;

    .line 52
    .line 53
    if-eqz v3, :cond_4

    .line 54
    .line 55
    check-cast v1, LQ0/m;

    .line 56
    .line 57
    iget-object v1, v1, LQ0/m;->d:Ljava/lang/Object;

    .line 58
    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    invoke-virtual {v2}, LQ0/f;->r()V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    sget-object v1, LQ0/f;->j:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 66
    .line 67
    const v3, 0x1fffffff

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    .line 71
    .line 72
    .line 73
    sget-object v1, LQ0/b;->e:LQ0/b;

    .line 74
    .line 75
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    move-object v4, v2

    .line 79
    :goto_2
    if-nez v4, :cond_5

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_5
    return-object v4

    .line 83
    :cond_6
    :goto_3
    new-instance v0, LQ0/f;

    .line 84
    .line 85
    const/4 v1, 0x2

    .line 86
    invoke-direct {v0, v1, p0}, LQ0/f;-><init>(ILz0/d;)V

    .line 87
    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_7
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    if-eq v5, v2, :cond_3

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_8
    if-eq v2, v3, :cond_1

    .line 98
    .line 99
    instance-of v1, v2, Ljava/lang/Throwable;

    .line 100
    .line 101
    if-eqz v1, :cond_9

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 105
    .line 106
    new-instance v0, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    const-string v1, "Inconsistent state "

    .line 109
    .line 110
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p0
.end method

.method public static final d(Ljava/lang/Throwable;Lz0/i;)V
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, LQ0/t;->e:LQ0/t;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lz0/i;->f(Lz0/h;)Lz0/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LR0/b;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p0, p1}, LR0/b;->e(Ljava/lang/Throwable;Lz0/i;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-static {p0, p1}, LV0/a;->d(Ljava/lang/Throwable;Lz0/i;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    if-ne p0, v0, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 24
    .line 25
    const-string v2, "Exception while trying to handle coroutine exception"

    .line 26
    .line 27
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v1, p0}, La1/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    move-object p0, v1

    .line 34
    :goto_0
    invoke-static {p0, p1}, LV0/a;->d(Ljava/lang/Throwable;Lz0/i;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public static synthetic e(LQ0/P;ZLQ0/U;I)LQ0/C;
    .locals 2

    .line 1
    and-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    :cond_1
    check-cast p0, LQ0/Z;

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1, p2}, LQ0/Z;->I(ZZLH0/l;)LQ0/C;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public static final f(I)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_1

    .line 3
    .line 4
    const/4 v1, 0x2

    .line 5
    if-ne p0, v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :cond_1
    :goto_0
    return v0
.end method

.method public static g(LQ0/u;LH0/p;)LQ0/e0;
    .locals 3

    .line 1
    sget-object v0, Lz0/j;->e:Lz0/j;

    .line 2
    .line 3
    invoke-interface {p0}, LQ0/u;->k()Lz0/i;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-static {p0, v0, v1}, LQ0/v;->a(Lz0/i;Lz0/i;Z)Lz0/i;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    sget-object v0, LQ0/B;->a:LX0/d;

    .line 13
    .line 14
    if-eq p0, v0, :cond_0

    .line 15
    .line 16
    sget-object v2, Lz0/e;->e:Lz0/e;

    .line 17
    .line 18
    invoke-interface {p0, v2}, Lz0/i;->f(Lz0/h;)Lz0/g;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    invoke-interface {p0, v0}, Lz0/i;->c(Lz0/i;)Lz0/i;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    :cond_0
    new-instance v0, LQ0/e0;

    .line 29
    .line 30
    invoke-direct {v0, p0, v1}, LQ0/a;-><init>(Lz0/i;Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1, v0, p1}, LQ0/a;->W(ILQ0/a;LH0/p;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public static final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, LQ0/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LQ0/n;

    .line 6
    .line 7
    iget-object p0, p0, LQ0/n;->a:Ljava/lang/Throwable;

    .line 8
    .line 9
    invoke-static {p0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    return-object p0
.end method

.method public static final i(LQ0/f;Lz0/d;Z)V
    .locals 2

    .line 1
    sget-object v0, LQ0/f;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, LQ0/f;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-static {v1}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0, v0}, LQ0/f;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :goto_0
    if-eqz p2, :cond_5

    .line 23
    .line 24
    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>"

    .line 25
    .line 26
    invoke-static {p1, p2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    check-cast p1, LV0/h;

    .line 30
    .line 31
    iget-object p2, p1, LV0/h;->i:LB0/b;

    .line 32
    .line 33
    invoke-interface {p2}, Lz0/d;->i()Lz0/i;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object p1, p1, LV0/h;->k:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {v0, p1}, LV0/a;->m(Lz0/i;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    sget-object v1, LV0/a;->f:LD/j;

    .line 44
    .line 45
    if-eq p1, v1, :cond_1

    .line 46
    .line 47
    invoke-static {p2, v0, p1}, LQ0/v;->m(Lz0/d;Lz0/i;Ljava/lang/Object;)LQ0/j0;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const/4 v1, 0x0

    .line 53
    :goto_1
    :try_start_0
    invoke-virtual {p2, p0}, LB0/b;->m(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    invoke-virtual {v1}, LQ0/j0;->X()Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_6

    .line 63
    .line 64
    :cond_2
    invoke-static {v0, p1}, LV0/a;->g(Lz0/i;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :catchall_0
    move-exception p0

    .line 69
    if-eqz v1, :cond_3

    .line 70
    .line 71
    invoke-virtual {v1}, LQ0/j0;->X()Z

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    if-eqz p2, :cond_4

    .line 76
    .line 77
    :cond_3
    invoke-static {v0, p1}, LV0/a;->g(Lz0/i;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    :cond_4
    throw p0

    .line 81
    :cond_5
    invoke-interface {p1, p0}, Lz0/d;->m(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_6
    :goto_2
    return-void
.end method

.method public static j(LH0/p;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lz0/j;->e:Lz0/j;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, Lz0/e;->e:Lz0/e;

    .line 8
    .line 9
    invoke-static {}, LQ0/h0;->a()LQ0/H;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    const/4 v4, 0x1

    .line 14
    invoke-static {v0, v3, v4}, LQ0/v;->a(Lz0/i;Lz0/i;Z)Lz0/i;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v5, LQ0/B;->a:LX0/d;

    .line 19
    .line 20
    if-eq v0, v5, :cond_0

    .line 21
    .line 22
    invoke-interface {v0, v2}, Lz0/i;->f(Lz0/h;)Lz0/g;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    invoke-interface {v0, v5}, Lz0/i;->c(Lz0/i;)Lz0/i;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_0
    new-instance v2, LQ0/c;

    .line 33
    .line 34
    invoke-direct {v2, v0, v1, v3}, LQ0/c;-><init>(Lz0/i;Ljava/lang/Thread;LQ0/H;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v4, v2, p0}, LQ0/a;->W(ILQ0/a;LH0/p;)V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    iget-object v0, v2, LQ0/c;->i:LQ0/H;

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    sget v1, LQ0/H;->j:I

    .line 46
    .line 47
    invoke-virtual {v0, p0}, LQ0/H;->k(Z)V

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_7

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    invoke-virtual {v0}, LQ0/H;->l()J

    .line 59
    .line 60
    .line 61
    move-result-wide v3

    .line 62
    goto :goto_1

    .line 63
    :catchall_0
    move-exception v1

    .line 64
    goto :goto_3

    .line 65
    :cond_2
    const-wide v3, 0x7fffffffffffffffL

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    :goto_1
    invoke-virtual {v2}, LQ0/Z;->E()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    instance-of v1, v1, LQ0/L;

    .line 75
    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    invoke-static {v2, v3, v4}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(Ljava/lang/Object;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    if-eqz v0, :cond_4

    .line 83
    .line 84
    sget v1, LQ0/H;->j:I

    .line 85
    .line 86
    invoke-virtual {v0, p0}, LQ0/H;->i(Z)V

    .line 87
    .line 88
    .line 89
    :cond_4
    invoke-virtual {v2}, LQ0/Z;->E()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-static {p0}, LQ0/v;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    instance-of v0, p0, LQ0/n;

    .line 98
    .line 99
    if-eqz v0, :cond_5

    .line 100
    .line 101
    move-object v0, p0

    .line 102
    check-cast v0, LQ0/n;

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_5
    const/4 v0, 0x0

    .line 106
    :goto_2
    if-nez v0, :cond_6

    .line 107
    .line 108
    return-object p0

    .line 109
    :cond_6
    iget-object p0, v0, LQ0/n;->a:Ljava/lang/Throwable;

    .line 110
    .line 111
    throw p0

    .line 112
    :cond_7
    :try_start_1
    new-instance v1, Ljava/lang/InterruptedException;

    .line 113
    .line 114
    invoke-direct {v1}, Ljava/lang/InterruptedException;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v1}, LQ0/Z;->s(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 121
    :goto_3
    if-eqz v0, :cond_8

    .line 122
    .line 123
    sget v2, LQ0/H;->j:I

    .line 124
    .line 125
    invoke-virtual {v0, p0}, LQ0/H;->i(Z)V

    .line 126
    .line 127
    .line 128
    :cond_8
    throw v1
.end method

.method public static final k(Lz0/d;)Ljava/lang/String;
    .locals 3

    .line 1
    instance-of v0, p0, LV0/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    goto :goto_2

    .line 10
    :cond_0
    const/16 v0, 0x40

    .line 11
    .line 12
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-static {p0}, LQ0/v;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    invoke-static {v1}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :goto_0
    invoke-static {v1}, Lx0/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    if-nez v2, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-static {p0}, LQ0/v;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    :goto_1
    move-object p0, v1

    .line 78
    check-cast p0, Ljava/lang/String;

    .line 79
    .line 80
    :goto_2
    return-object p0
.end method

.method public static final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, LQ0/M;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, LQ0/M;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-object v0, v0, LQ0/M;->a:LQ0/L;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    move-object p0, v0

    .line 18
    :cond_2
    :goto_1
    return-object p0
.end method

.method public static final m(Lz0/d;Lz0/i;Ljava/lang/Object;)LQ0/j0;
    .locals 2

    .line 1
    instance-of v0, p0, LB0/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    sget-object v0, LQ0/k0;->e:LQ0/k0;

    .line 8
    .line 9
    invoke-interface {p1, v0}, Lz0/i;->f(Lz0/h;)Lz0/g;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_4

    .line 14
    .line 15
    check-cast p0, LB0/c;

    .line 16
    .line 17
    :cond_1
    instance-of v0, p0, LQ0/z;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    invoke-interface {p0}, LB0/c;->g()LB0/c;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-nez p0, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    instance-of v0, p0, LQ0/j0;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    move-object v1, p0

    .line 34
    check-cast v1, LQ0/j0;

    .line 35
    .line 36
    :goto_0
    if-eqz v1, :cond_4

    .line 37
    .line 38
    invoke-virtual {v1, p1, p2}, LQ0/j0;->Y(Lz0/i;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_4
    return-object v1
.end method

.method public static final n(Lz0/i;LH0/p;LB0/g;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p2, LB0/b;->f:Lz0/i;

    .line 2
    .line 3
    invoke-static {v0}, LI0/i;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 7
    .line 8
    sget-object v2, LQ0/p;->h:LQ0/p;

    .line 9
    .line 10
    invoke-interface {p0, v1, v2}, Lz0/i;->d(Ljava/lang/Object;LH0/p;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    invoke-interface {v0, p0}, Lz0/i;->c(Lz0/i;)Lz0/i;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v0, p0, v2}, LQ0/v;->a(Lz0/i;Lz0/i;Z)Lz0/i;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :goto_0
    sget-object v1, LQ0/t;->f:LQ0/t;

    .line 33
    .line 34
    invoke-interface {p0, v1}, Lz0/i;->f(Lz0/h;)Lz0/g;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, LQ0/P;

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    invoke-interface {v1}, LQ0/P;->b()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    check-cast v1, LQ0/Z;

    .line 50
    .line 51
    invoke-virtual {v1}, LQ0/Z;->A()Ljava/util/concurrent/CancellationException;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    throw p0

    .line 56
    :cond_2
    :goto_1
    if-ne p0, v0, :cond_3

    .line 57
    .line 58
    new-instance v0, LV0/u;

    .line 59
    .line 60
    invoke-direct {v0, p2, p0}, LV0/u;-><init>(Lz0/d;Lz0/i;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v0, v0, p1}, La/a;->M(LV0/u;LV0/u;LH0/p;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    goto :goto_2

    .line 68
    :cond_3
    sget-object v1, Lz0/e;->e:Lz0/e;

    .line 69
    .line 70
    invoke-interface {p0, v1}, Lz0/i;->f(Lz0/h;)Lz0/g;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-interface {v0, v1}, Lz0/i;->f(Lz0/h;)Lz0/g;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v3, v0}, LI0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    new-instance v0, LQ0/j0;

    .line 85
    .line 86
    invoke-direct {v0, p0, p2}, LQ0/j0;-><init>(Lz0/i;LB0/g;)V

    .line 87
    .line 88
    .line 89
    const/4 p0, 0x0

    .line 90
    iget-object p2, v0, LQ0/a;->g:Lz0/i;

    .line 91
    .line 92
    invoke-static {p2, p0}, LV0/a;->m(Lz0/i;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    :try_start_0
    invoke-static {v0, v0, p1}, La/a;->M(LV0/u;LV0/u;LH0/p;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    invoke-static {p2, p0}, LV0/a;->g(Lz0/i;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    move-object p0, p1

    .line 104
    goto :goto_2

    .line 105
    :catchall_0
    move-exception p1

    .line 106
    invoke-static {p2, p0}, LV0/a;->g(Lz0/i;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    throw p1

    .line 110
    :cond_4
    new-instance v0, LQ0/z;

    .line 111
    .line 112
    invoke-direct {v0, p2, p0}, LV0/u;-><init>(Lz0/d;Lz0/i;)V

    .line 113
    .line 114
    .line 115
    invoke-static {p1, v0, v0}, La1/a;->H(LH0/p;LQ0/a;LQ0/a;)V

    .line 116
    .line 117
    .line 118
    :cond_5
    sget-object p0, LQ0/z;->i:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 119
    .line 120
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-eqz p1, :cond_8

    .line 125
    .line 126
    const/4 p0, 0x2

    .line 127
    if-ne p1, p0, :cond_7

    .line 128
    .line 129
    invoke-virtual {v0}, LQ0/Z;->E()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-static {p0}, LQ0/v;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    instance-of p1, p0, LQ0/n;

    .line 138
    .line 139
    if-nez p1, :cond_6

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_6
    check-cast p0, LQ0/n;

    .line 143
    .line 144
    iget-object p0, p0, LQ0/n;->a:Ljava/lang/Throwable;

    .line 145
    .line 146
    throw p0

    .line 147
    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 148
    .line 149
    const-string p1, "Already suspended"

    .line 150
    .line 151
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    throw p0

    .line 155
    :cond_8
    const/4 p1, 0x1

    .line 156
    invoke-virtual {p0, v0, v2, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    if-eqz p0, :cond_5

    .line 161
    .line 162
    sget-object p0, LA0/a;->e:LA0/a;

    .line 163
    .line 164
    :goto_2
    return-object p0
.end method
