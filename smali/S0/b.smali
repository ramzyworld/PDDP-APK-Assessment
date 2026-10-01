.class public LS0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS0/f;


# static fields
.field public static final g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile _closeCause:Ljava/lang/Object;

.field private volatile bufferEnd:J

.field private volatile bufferEndSegment:Ljava/lang/Object;

.field private volatile closeHandler:Ljava/lang/Object;

.field private volatile completedExpandBuffersAndPauseFlag:J

.field public final e:I

.field public final f:LH0/l;

.field private volatile receiveSegment:Ljava/lang/Object;

.field private volatile receivers:J

.field private volatile sendSegment:Ljava/lang/Object;

.field private volatile sendersAndCloseStatus:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "sendersAndCloseStatus"

    .line 2
    .line 3
    const-class v1, LS0/b;

    .line 4
    .line 5
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, LS0/b;->g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 10
    .line 11
    const-string v0, "receivers"

    .line 12
    .line 13
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, LS0/b;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 18
    .line 19
    const-string v0, "bufferEnd"

    .line 20
    .line 21
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, LS0/b;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 26
    .line 27
    const-string v0, "completedExpandBuffersAndPauseFlag"

    .line 28
    .line 29
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, LS0/b;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 34
    .line 35
    const-string v0, "sendSegment"

    .line 36
    .line 37
    const-class v2, Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, LS0/b;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 44
    .line 45
    const-string v0, "receiveSegment"

    .line 46
    .line 47
    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, LS0/b;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 52
    .line 53
    const-string v0, "bufferEndSegment"

    .line 54
    .line 55
    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, LS0/b;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 60
    .line 61
    const-string v0, "_closeCause"

    .line 62
    .line 63
    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sput-object v0, LS0/b;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 68
    .line 69
    const-string v0, "closeHandler"

    .line 70
    .line 71
    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sput-object v0, LS0/b;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 76
    .line 77
    return-void
.end method

.method public constructor <init>(ILH0/l;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LS0/b;->e:I

    .line 5
    .line 6
    iput-object p2, p0, LS0/b;->f:LH0/l;

    .line 7
    .line 8
    if-ltz p1, :cond_3

    .line 9
    .line 10
    sget-object p2, LS0/d;->a:LS0/j;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    const p2, 0x7fffffff

    .line 15
    .line 16
    .line 17
    if-eq p1, p2, :cond_0

    .line 18
    .line 19
    int-to-long p1, p1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-wide p1, 0x7fffffffffffffffL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const-wide/16 p1, 0x0

    .line 28
    .line 29
    :goto_0
    iput-wide p1, p0, LS0/b;->bufferEnd:J

    .line 30
    .line 31
    sget-object p1, LS0/b;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 32
    .line 33
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 34
    .line 35
    .line 36
    move-result-wide p1

    .line 37
    iput-wide p1, p0, LS0/b;->completedExpandBuffersAndPauseFlag:J

    .line 38
    .line 39
    new-instance p1, LS0/j;

    .line 40
    .line 41
    const/4 v5, 0x3

    .line 42
    const-wide/16 v1, 0x0

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    move-object v0, p1

    .line 46
    move-object v4, p0

    .line 47
    invoke-direct/range {v0 .. v5}, LS0/j;-><init>(JLS0/j;LS0/b;I)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, LS0/b;->sendSegment:Ljava/lang/Object;

    .line 51
    .line 52
    iput-object p1, p0, LS0/b;->receiveSegment:Ljava/lang/Object;

    .line 53
    .line 54
    invoke-virtual {p0}, LS0/b;->u()Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-eqz p2, :cond_2

    .line 59
    .line 60
    sget-object p1, LS0/d;->a:LS0/j;

    .line 61
    .line 62
    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>"

    .line 63
    .line 64
    invoke-static {p1, p2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    iput-object p1, p0, LS0/b;->bufferEndSegment:Ljava/lang/Object;

    .line 68
    .line 69
    sget-object p1, LS0/d;->s:LD/j;

    .line 70
    .line 71
    iput-object p1, p0, LS0/b;->_closeCause:Ljava/lang/Object;

    .line 72
    .line 73
    return-void

    .line 74
    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v0, "Invalid channel capacity: "

    .line 77
    .line 78
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string p1, ", should be >=0"

    .line 85
    .line 86
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p2
.end method

.method public static final b(LS0/b;JLS0/j;)LS0/j;
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, LS0/d;->a:LS0/j;

    .line 5
    .line 6
    sget-object v0, LS0/c;->m:LS0/c;

    .line 7
    .line 8
    :goto_0
    invoke-static {p3, p1, p2, v0}, LV0/a;->b(LV0/v;JLH0/p;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1}, LV0/a;->e(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_4

    .line 17
    .line 18
    invoke-static {v1}, LV0/a;->c(Ljava/lang/Object;)LV0/v;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    :cond_0
    :goto_1
    sget-object v3, LS0/b;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 23
    .line 24
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, LV0/v;

    .line 29
    .line 30
    iget-wide v5, v4, LV0/v;->g:J

    .line 31
    .line 32
    iget-wide v7, v2, LV0/v;->g:J

    .line 33
    .line 34
    cmp-long v9, v5, v7

    .line 35
    .line 36
    if-ltz v9, :cond_1

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_1
    invoke-virtual {v2}, LV0/v;->i()Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-nez v5, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-virtual {v3, p0, v4, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_3

    .line 51
    .line 52
    invoke-virtual {v4}, LV0/v;->e()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    invoke-virtual {v4}, LV0/d;->d()V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    if-eq v5, v4, :cond_2

    .line 67
    .line 68
    invoke-virtual {v2}, LV0/v;->e()Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_0

    .line 73
    .line 74
    invoke-virtual {v2}, LV0/d;->d()V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    :goto_2
    invoke-static {v1}, LV0/a;->e(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    const/4 v2, 0x0

    .line 83
    sget-object v3, LS0/b;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 84
    .line 85
    if-eqz v0, :cond_5

    .line 86
    .line 87
    invoke-virtual {p0}, LS0/b;->s()Z

    .line 88
    .line 89
    .line 90
    sget p1, LS0/d;->b:I

    .line 91
    .line 92
    int-to-long p1, p1

    .line 93
    iget-wide v0, p3, LV0/v;->g:J

    .line 94
    .line 95
    mul-long v0, v0, p1

    .line 96
    .line 97
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 98
    .line 99
    .line 100
    move-result-wide p0

    .line 101
    cmp-long p2, v0, p0

    .line 102
    .line 103
    if-gez p2, :cond_9

    .line 104
    .line 105
    invoke-virtual {p3}, LV0/d;->a()V

    .line 106
    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_5
    invoke-static {v1}, LV0/a;->c(Ljava/lang/Object;)LV0/v;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    check-cast p3, LS0/j;

    .line 114
    .line 115
    iget-wide v0, p3, LV0/v;->g:J

    .line 116
    .line 117
    cmp-long v4, v0, p1

    .line 118
    .line 119
    if-lez v4, :cond_8

    .line 120
    .line 121
    sget p1, LS0/d;->b:I

    .line 122
    .line 123
    int-to-long p1, p1

    .line 124
    mul-long p1, p1, v0

    .line 125
    .line 126
    :cond_6
    sget-object v4, LS0/b;->g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 127
    .line 128
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 129
    .line 130
    .line 131
    move-result-wide v6

    .line 132
    const-wide v8, 0xfffffffffffffffL

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    and-long/2addr v8, v6

    .line 138
    cmp-long v5, v8, p1

    .line 139
    .line 140
    if-ltz v5, :cond_7

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_7
    const/16 v5, 0x3c

    .line 144
    .line 145
    shr-long v10, v6, v5

    .line 146
    .line 147
    long-to-int v11, v10

    .line 148
    int-to-long v10, v11

    .line 149
    shl-long/2addr v10, v5

    .line 150
    add-long/2addr v8, v10

    .line 151
    move-object v5, p0

    .line 152
    invoke-virtual/range {v4 .. v9}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-eqz v4, :cond_6

    .line 157
    .line 158
    :goto_3
    sget p1, LS0/d;->b:I

    .line 159
    .line 160
    int-to-long p1, p1

    .line 161
    mul-long v0, v0, p1

    .line 162
    .line 163
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 164
    .line 165
    .line 166
    move-result-wide p0

    .line 167
    cmp-long p2, v0, p0

    .line 168
    .line 169
    if-gez p2, :cond_9

    .line 170
    .line 171
    invoke-virtual {p3}, LV0/d;->a()V

    .line 172
    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_8
    move-object v2, p3

    .line 176
    :cond_9
    :goto_4
    return-object v2
.end method

.method public static final c(LS0/b;Ljava/lang/Object;LQ0/f;)V
    .locals 2

    .line 1
    iget-object v0, p0, LS0/b;->f:LH0/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v0, p1, v1}, LV0/a;->a(LH0/l;Ljava/lang/Object;LO/c;)LO/c;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object v0, p2, LQ0/f;->i:Lz0/i;

    .line 13
    .line 14
    invoke-static {p1, v0}, LQ0/v;->d(Ljava/lang/Throwable;Lz0/i;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, LS0/b;->o()Ljava/lang/Throwable;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p2, p0}, LQ0/f;->m(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static final d(LS0/b;LS0/j;ILjava/lang/Object;JLjava/lang/Object;Z)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p2, p3}, LS0/j;->m(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    if-eqz p7, :cond_0

    .line 8
    .line 9
    invoke-virtual/range {p0 .. p7}, LS0/b;->B(LS0/j;ILjava/lang/Object;JLjava/lang/Object;Z)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p1, p2}, LS0/j;->k(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-nez v0, :cond_3

    .line 21
    .line 22
    invoke-virtual {p0, p4, p5}, LS0/b;->e(J)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    sget-object v0, LS0/d;->d:LD/j;

    .line 29
    .line 30
    invoke-virtual {p1, p2, v2, v0}, LS0/j;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_6

    .line 35
    .line 36
    const/4 p0, 0x1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    if-nez p6, :cond_2

    .line 39
    .line 40
    const/4 p0, 0x3

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-virtual {p1, p2, v2, p6}, LS0/j;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_6

    .line 47
    .line 48
    const/4 p0, 0x2

    .line 49
    goto :goto_0

    .line 50
    :cond_3
    instance-of v3, v0, LQ0/l0;

    .line 51
    .line 52
    if-eqz v3, :cond_6

    .line 53
    .line 54
    invoke-virtual {p1, p2, v2}, LS0/j;->m(ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v0, p3}, LS0/b;->y(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-eqz p0, :cond_4

    .line 62
    .line 63
    sget-object p0, LS0/d;->i:LD/j;

    .line 64
    .line 65
    invoke-virtual {p1, p2, p0}, LS0/j;->n(ILD/j;)V

    .line 66
    .line 67
    .line 68
    const/4 p0, 0x0

    .line 69
    goto :goto_0

    .line 70
    :cond_4
    sget-object p0, LS0/d;->k:LD/j;

    .line 71
    .line 72
    iget-object p3, p1, LS0/j;->j:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 73
    .line 74
    mul-int/lit8 p4, p2, 0x2

    .line 75
    .line 76
    add-int/2addr p4, v1

    .line 77
    invoke-virtual {p3, p4, p0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    if-eq p3, p0, :cond_5

    .line 82
    .line 83
    invoke-virtual {p1, p2, v1}, LS0/j;->l(IZ)V

    .line 84
    .line 85
    .line 86
    :cond_5
    const/4 p0, 0x5

    .line 87
    goto :goto_0

    .line 88
    :cond_6
    invoke-virtual/range {p0 .. p7}, LS0/b;->B(LS0/j;ILjava/lang/Object;JLjava/lang/Object;Z)I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    :goto_0
    return p0
.end method

.method public static q(LS0/b;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, LS0/b;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 5
    .line 6
    const-wide/16 v1, 0x1

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    .line 13
    .line 14
    and-long/2addr v1, v3

    .line 15
    const-wide/16 v5, 0x0

    .line 16
    .line 17
    cmp-long v7, v1, v5

    .line 18
    .line 19
    if-eqz v7, :cond_0

    .line 20
    .line 21
    :goto_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    and-long/2addr v1, v3

    .line 26
    cmp-long v7, v1, v5

    .line 27
    .line 28
    if-eqz v7, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
.end method

.method public static z(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p0, LQ0/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"

    .line 6
    .line 7
    invoke-static {p0, v0}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast p0, LQ0/e;

    .line 11
    .line 12
    sget-object v0, Lx0/g;->a:Lx0/g;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-static {p0, v0, v1}, LS0/d;->a(LQ0/e;Ljava/lang/Object;LH0/l;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v2, "Unexpected waiter: "

    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v0
.end method


# virtual methods
.method public final A(LS0/j;IJLjava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-virtual {p1, p2}, LS0/j;->k(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    iget-object v2, p1, LS0/j;->j:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 7
    .line 8
    const-wide v3, 0xfffffffffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    sget-object v5, LS0/b;->g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v5, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v6

    .line 21
    and-long/2addr v6, v3

    .line 22
    cmp-long v8, p3, v6

    .line 23
    .line 24
    if-ltz v8, :cond_2

    .line 25
    .line 26
    if-nez p5, :cond_0

    .line 27
    .line 28
    sget-object p1, LS0/d;->n:LD/j;

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_0
    invoke-virtual {p1, p2, v0, p5}, LS0/j;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, LS0/b;->i()V

    .line 38
    .line 39
    .line 40
    sget-object p1, LS0/d;->m:LD/j;

    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_1
    sget-object v6, LS0/d;->d:LD/j;

    .line 44
    .line 45
    if-ne v0, v6, :cond_2

    .line 46
    .line 47
    sget-object v6, LS0/d;->i:LD/j;

    .line 48
    .line 49
    invoke-virtual {p1, p2, v0, v6}, LS0/j;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    invoke-virtual {p0}, LS0/b;->i()V

    .line 56
    .line 57
    .line 58
    mul-int/lit8 p3, p2, 0x2

    .line 59
    .line 60
    invoke-virtual {v2, p3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    invoke-virtual {p1, p2, v1}, LS0/j;->m(ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-object p3

    .line 68
    :cond_2
    invoke-virtual {p1, p2}, LS0/j;->k(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-eqz v0, :cond_b

    .line 73
    .line 74
    sget-object v6, LS0/d;->e:LD/j;

    .line 75
    .line 76
    if-ne v0, v6, :cond_3

    .line 77
    .line 78
    goto/16 :goto_0

    .line 79
    .line 80
    :cond_3
    sget-object v6, LS0/d;->d:LD/j;

    .line 81
    .line 82
    if-ne v0, v6, :cond_4

    .line 83
    .line 84
    sget-object v6, LS0/d;->i:LD/j;

    .line 85
    .line 86
    invoke-virtual {p1, p2, v0, v6}, LS0/j;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_2

    .line 91
    .line 92
    invoke-virtual {p0}, LS0/b;->i()V

    .line 93
    .line 94
    .line 95
    mul-int/lit8 p3, p2, 0x2

    .line 96
    .line 97
    invoke-virtual {v2, p3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p3

    .line 101
    invoke-virtual {p1, p2, v1}, LS0/j;->m(ILjava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    goto/16 :goto_1

    .line 105
    .line 106
    :cond_4
    sget-object v6, LS0/d;->j:LD/j;

    .line 107
    .line 108
    if-ne v0, v6, :cond_5

    .line 109
    .line 110
    sget-object p3, LS0/d;->o:LD/j;

    .line 111
    .line 112
    goto/16 :goto_1

    .line 113
    .line 114
    :cond_5
    sget-object v7, LS0/d;->h:LD/j;

    .line 115
    .line 116
    if-ne v0, v7, :cond_6

    .line 117
    .line 118
    sget-object p3, LS0/d;->o:LD/j;

    .line 119
    .line 120
    goto/16 :goto_1

    .line 121
    .line 122
    :cond_6
    sget-object v7, LS0/d;->l:LD/j;

    .line 123
    .line 124
    if-ne v0, v7, :cond_7

    .line 125
    .line 126
    invoke-virtual {p0}, LS0/b;->i()V

    .line 127
    .line 128
    .line 129
    sget-object p3, LS0/d;->o:LD/j;

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_7
    sget-object v7, LS0/d;->g:LD/j;

    .line 133
    .line 134
    if-eq v0, v7, :cond_2

    .line 135
    .line 136
    sget-object v7, LS0/d;->f:LD/j;

    .line 137
    .line 138
    invoke-virtual {p1, p2, v0, v7}, LS0/j;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    if-eqz v7, :cond_2

    .line 143
    .line 144
    instance-of p3, v0, LS0/s;

    .line 145
    .line 146
    if-eqz p3, :cond_8

    .line 147
    .line 148
    check-cast v0, LS0/s;

    .line 149
    .line 150
    iget-object v0, v0, LS0/s;->a:LQ0/l0;

    .line 151
    .line 152
    :cond_8
    invoke-static {v0}, LS0/b;->z(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result p4

    .line 156
    if-eqz p4, :cond_9

    .line 157
    .line 158
    sget-object p3, LS0/d;->i:LD/j;

    .line 159
    .line 160
    invoke-virtual {p1, p2, p3}, LS0/j;->n(ILD/j;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0}, LS0/b;->i()V

    .line 164
    .line 165
    .line 166
    mul-int/lit8 p3, p2, 0x2

    .line 167
    .line 168
    invoke-virtual {v2, p3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p3

    .line 172
    invoke-virtual {p1, p2, v1}, LS0/j;->m(ILjava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_9
    invoke-virtual {p1, p2, v6}, LS0/j;->n(ILD/j;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1}, LV0/v;->h()V

    .line 180
    .line 181
    .line 182
    if-eqz p3, :cond_a

    .line 183
    .line 184
    invoke-virtual {p0}, LS0/b;->i()V

    .line 185
    .line 186
    .line 187
    :cond_a
    sget-object p1, LS0/d;->o:LD/j;

    .line 188
    .line 189
    move-object p3, p1

    .line 190
    goto :goto_1

    .line 191
    :cond_b
    :goto_0
    invoke-virtual {v5, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 192
    .line 193
    .line 194
    move-result-wide v6

    .line 195
    and-long/2addr v6, v3

    .line 196
    cmp-long v8, p3, v6

    .line 197
    .line 198
    if-gez v8, :cond_c

    .line 199
    .line 200
    sget-object v6, LS0/d;->h:LD/j;

    .line 201
    .line 202
    invoke-virtual {p1, p2, v0, v6}, LS0/j;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_2

    .line 207
    .line 208
    invoke-virtual {p0}, LS0/b;->i()V

    .line 209
    .line 210
    .line 211
    sget-object p3, LS0/d;->o:LD/j;

    .line 212
    .line 213
    goto :goto_1

    .line 214
    :cond_c
    if-nez p5, :cond_d

    .line 215
    .line 216
    sget-object p3, LS0/d;->n:LD/j;

    .line 217
    .line 218
    goto :goto_1

    .line 219
    :cond_d
    invoke-virtual {p1, p2, v0, p5}, LS0/j;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-eqz v0, :cond_2

    .line 224
    .line 225
    invoke-virtual {p0}, LS0/b;->i()V

    .line 226
    .line 227
    .line 228
    sget-object p3, LS0/d;->m:LD/j;

    .line 229
    .line 230
    :goto_1
    return-object p3
.end method

.method public final B(LS0/j;ILjava/lang/Object;JLjava/lang/Object;Z)I
    .locals 5

    .line 1
    :cond_0
    invoke-virtual {p1, p2}, LS0/j;->k(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x4

    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v0, :cond_4

    .line 9
    .line 10
    invoke-virtual {p0, p4, p5}, LS0/b;->e(J)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    if-nez p7, :cond_1

    .line 17
    .line 18
    sget-object v0, LS0/d;->d:LD/j;

    .line 19
    .line 20
    invoke-virtual {p1, p2, v3, v0}, LS0/j;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    return v1

    .line 27
    :cond_1
    if-eqz p7, :cond_2

    .line 28
    .line 29
    sget-object v0, LS0/d;->j:LD/j;

    .line 30
    .line 31
    invoke-virtual {p1, p2, v3, v0}, LS0/j;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-virtual {p1}, LV0/v;->h()V

    .line 38
    .line 39
    .line 40
    return v2

    .line 41
    :cond_2
    if-nez p6, :cond_3

    .line 42
    .line 43
    const/4 p1, 0x3

    .line 44
    return p1

    .line 45
    :cond_3
    invoke-virtual {p1, p2, v3, p6}, LS0/j;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    const/4 p1, 0x2

    .line 52
    return p1

    .line 53
    :cond_4
    sget-object v4, LS0/d;->e:LD/j;

    .line 54
    .line 55
    if-ne v0, v4, :cond_5

    .line 56
    .line 57
    sget-object v2, LS0/d;->d:LD/j;

    .line 58
    .line 59
    invoke-virtual {p1, p2, v0, v2}, LS0/j;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_0

    .line 64
    .line 65
    return v1

    .line 66
    :cond_5
    sget-object p4, LS0/d;->k:LD/j;

    .line 67
    .line 68
    const/4 p5, 0x5

    .line 69
    if-ne v0, p4, :cond_6

    .line 70
    .line 71
    invoke-virtual {p1, p2, v3}, LS0/j;->m(ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return p5

    .line 75
    :cond_6
    sget-object p6, LS0/d;->h:LD/j;

    .line 76
    .line 77
    if-ne v0, p6, :cond_7

    .line 78
    .line 79
    invoke-virtual {p1, p2, v3}, LS0/j;->m(ILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return p5

    .line 83
    :cond_7
    sget-object p6, LS0/d;->l:LD/j;

    .line 84
    .line 85
    if-ne v0, p6, :cond_8

    .line 86
    .line 87
    invoke-virtual {p1, p2, v3}, LS0/j;->m(ILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, LS0/b;->s()Z

    .line 91
    .line 92
    .line 93
    return v2

    .line 94
    :cond_8
    invoke-virtual {p1, p2, v3}, LS0/j;->m(ILjava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    instance-of p6, v0, LS0/s;

    .line 98
    .line 99
    if-eqz p6, :cond_9

    .line 100
    .line 101
    check-cast v0, LS0/s;

    .line 102
    .line 103
    iget-object v0, v0, LS0/s;->a:LQ0/l0;

    .line 104
    .line 105
    :cond_9
    invoke-virtual {p0, v0, p3}, LS0/b;->y(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result p3

    .line 109
    if-eqz p3, :cond_a

    .line 110
    .line 111
    sget-object p3, LS0/d;->i:LD/j;

    .line 112
    .line 113
    invoke-virtual {p1, p2, p3}, LS0/j;->n(ILD/j;)V

    .line 114
    .line 115
    .line 116
    const/4 p5, 0x0

    .line 117
    goto :goto_0

    .line 118
    :cond_a
    iget-object p3, p1, LS0/j;->j:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 119
    .line 120
    mul-int/lit8 p6, p2, 0x2

    .line 121
    .line 122
    add-int/2addr p6, v1

    .line 123
    invoke-virtual {p3, p6, p4}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p3

    .line 127
    if-eq p3, p4, :cond_b

    .line 128
    .line 129
    invoke-virtual {p1, p2, v1}, LS0/j;->l(IZ)V

    .line 130
    .line 131
    .line 132
    :cond_b
    :goto_0
    return p5
.end method

.method public final C(J)V
    .locals 19

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, LS0/b;->u()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    sget-object v7, LS0/b;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 11
    .line 12
    invoke-virtual {v7, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    cmp-long v2, v0, p1

    .line 17
    .line 18
    if-lez v2, :cond_0

    .line 19
    .line 20
    sget v0, LS0/d;->c:I

    .line 21
    .line 22
    const/4 v8, 0x0

    .line 23
    const/4 v1, 0x0

    .line 24
    :goto_0
    sget-object v9, LS0/b;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 25
    .line 26
    const-wide v10, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    if-ge v1, v0, :cond_2

    .line 32
    .line 33
    invoke-virtual {v7, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    invoke-virtual {v9, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 38
    .line 39
    .line 40
    move-result-wide v4

    .line 41
    and-long/2addr v4, v10

    .line 42
    cmp-long v9, v2, v4

    .line 43
    .line 44
    if-nez v9, :cond_1

    .line 45
    .line 46
    invoke-virtual {v7, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    cmp-long v9, v2, v4

    .line 51
    .line 52
    if-nez v9, :cond_1

    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    invoke-virtual {v9, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 59
    .line 60
    .line 61
    move-result-wide v2

    .line 62
    and-long v0, v2, v10

    .line 63
    .line 64
    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    .line 65
    .line 66
    add-long v4, v12, v0

    .line 67
    .line 68
    move-object v0, v9

    .line 69
    move-object/from16 v1, p0

    .line 70
    .line 71
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_2

    .line 76
    .line 77
    :cond_3
    :goto_1
    invoke-virtual {v7, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 78
    .line 79
    .line 80
    move-result-wide v0

    .line 81
    invoke-virtual {v9, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 82
    .line 83
    .line 84
    move-result-wide v2

    .line 85
    and-long v4, v2, v10

    .line 86
    .line 87
    and-long v14, v2, v12

    .line 88
    .line 89
    const-wide/16 v16, 0x0

    .line 90
    .line 91
    cmp-long v18, v14, v16

    .line 92
    .line 93
    if-eqz v18, :cond_4

    .line 94
    .line 95
    const/4 v14, 0x1

    .line 96
    goto :goto_2

    .line 97
    :cond_4
    const/4 v14, 0x0

    .line 98
    :goto_2
    cmp-long v15, v0, v4

    .line 99
    .line 100
    if-nez v15, :cond_6

    .line 101
    .line 102
    invoke-virtual {v7, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 103
    .line 104
    .line 105
    move-result-wide v15

    .line 106
    cmp-long v17, v0, v15

    .line 107
    .line 108
    if-nez v17, :cond_6

    .line 109
    .line 110
    :cond_5
    invoke-virtual {v9, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 111
    .line 112
    .line 113
    move-result-wide v2

    .line 114
    and-long v4, v2, v10

    .line 115
    .line 116
    move-object v0, v9

    .line 117
    move-object/from16 v1, p0

    .line 118
    .line 119
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_5

    .line 124
    .line 125
    return-void

    .line 126
    :cond_6
    if-nez v14, :cond_3

    .line 127
    .line 128
    add-long/2addr v4, v12

    .line 129
    move-object v0, v9

    .line 130
    move-object/from16 v1, p0

    .line 131
    .line 132
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 133
    .line 134
    .line 135
    goto :goto_1
.end method

.method public final a(Ljava/util/concurrent/CancellationException;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Ljava/util/concurrent/CancellationException;

    .line 4
    .line 5
    const-string v0, "Channel was cancelled"

    .line 6
    .line 7
    invoke-direct {p1, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    invoke-virtual {p0, p1, v0}, LS0/b;->f(Ljava/lang/Throwable;Z)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final e(J)Z
    .locals 4

    .line 1
    sget-object v0, LS0/b;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    cmp-long v2, p1, v0

    .line 8
    .line 9
    if-ltz v2, :cond_1

    .line 10
    .line 11
    sget-object v0, LS0/b;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iget v2, p0, LS0/b;->e:I

    .line 18
    .line 19
    int-to-long v2, v2

    .line 20
    add-long/2addr v0, v2

    .line 21
    cmp-long v2, p1, v0

    .line 22
    .line 23
    if-gez v2, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 29
    :goto_1
    return p1
.end method

.method public final f(Ljava/lang/Throwable;Z)Z
    .locals 13

    .line 1
    const/16 v0, 0x3c

    .line 2
    .line 3
    const-wide v1, 0xfffffffffffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    sget-object v9, LS0/b;->g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 9
    .line 10
    const/4 v10, 0x1

    .line 11
    if-eqz p2, :cond_1

    .line 12
    .line 13
    :cond_0
    invoke-virtual {v9, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v5

    .line 17
    shr-long v3, v5, v0

    .line 18
    .line 19
    long-to-int v4, v3

    .line 20
    if-nez v4, :cond_1

    .line 21
    .line 22
    and-long v3, v5, v1

    .line 23
    .line 24
    sget-object v7, LS0/d;->a:LS0/j;

    .line 25
    .line 26
    int-to-long v7, v10

    .line 27
    shl-long/2addr v7, v0

    .line 28
    add-long/2addr v7, v3

    .line 29
    move-object v3, v9

    .line 30
    move-object v4, p0

    .line 31
    invoke-virtual/range {v3 .. v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    :cond_1
    sget-object v3, LS0/d;->s:LD/j;

    .line 38
    .line 39
    :cond_2
    sget-object v4, LS0/b;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 40
    .line 41
    invoke-virtual {v4, p0, v3, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz v5, :cond_3

    .line 46
    .line 47
    const/4 v11, 0x1

    .line 48
    goto :goto_0

    .line 49
    :cond_3
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    if-eq v4, v3, :cond_2

    .line 54
    .line 55
    const/4 p1, 0x0

    .line 56
    const/4 v11, 0x0

    .line 57
    :goto_0
    const/4 v12, 0x3

    .line 58
    if-eqz p2, :cond_5

    .line 59
    .line 60
    :cond_4
    invoke-virtual {v9, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 61
    .line 62
    .line 63
    move-result-wide v5

    .line 64
    and-long p1, v5, v1

    .line 65
    .line 66
    int-to-long v3, v12

    .line 67
    shl-long/2addr v3, v0

    .line 68
    add-long v7, v3, p1

    .line 69
    .line 70
    move-object v3, v9

    .line 71
    move-object v4, p0

    .line 72
    invoke-virtual/range {v3 .. v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_5
    invoke-virtual {v9, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 80
    .line 81
    .line 82
    move-result-wide v5

    .line 83
    shr-long p1, v5, v0

    .line 84
    .line 85
    long-to-int p2, p1

    .line 86
    if-eqz p2, :cond_7

    .line 87
    .line 88
    if-eq p2, v10, :cond_6

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_6
    and-long p1, v5, v1

    .line 92
    .line 93
    int-to-long v3, v12

    .line 94
    :goto_1
    shl-long/2addr v3, v0

    .line 95
    add-long/2addr v3, p1

    .line 96
    move-wide v7, v3

    .line 97
    goto :goto_2

    .line 98
    :cond_7
    and-long p1, v5, v1

    .line 99
    .line 100
    const/4 v3, 0x2

    .line 101
    int-to-long v3, v3

    .line 102
    goto :goto_1

    .line 103
    :goto_2
    move-object v3, v9

    .line 104
    move-object v4, p0

    .line 105
    invoke-virtual/range {v3 .. v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_5

    .line 110
    .line 111
    :goto_3
    invoke-virtual {p0}, LS0/b;->s()Z

    .line 112
    .line 113
    .line 114
    if-eqz v11, :cond_c

    .line 115
    .line 116
    :goto_4
    sget-object p1, LS0/b;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 117
    .line 118
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    if-nez p2, :cond_8

    .line 123
    .line 124
    sget-object v0, LS0/d;->q:LD/j;

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_8
    sget-object v0, LS0/d;->r:LD/j;

    .line 128
    .line 129
    :cond_9
    :goto_5
    invoke-virtual {p1, p0, p2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-eqz v1, :cond_b

    .line 134
    .line 135
    if-nez p2, :cond_a

    .line 136
    .line 137
    goto :goto_6

    .line 138
    :cond_a
    invoke-static {v10, p2}, LI0/s;->a(ILjava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    check-cast p2, LH0/l;

    .line 142
    .line 143
    invoke-virtual {p0}, LS0/b;->l()Ljava/lang/Throwable;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-interface {p2, p1}, LH0/l;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    goto :goto_6

    .line 151
    :cond_b
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    if-eq v1, p2, :cond_9

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_c
    :goto_6
    return v11
.end method

.method public final g(J)LS0/j;
    .locals 13

    .line 1
    sget-object v0, LS0/b;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, LS0/b;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, LS0/j;

    .line 14
    .line 15
    iget-wide v2, v1, LV0/v;->g:J

    .line 16
    .line 17
    move-object v4, v0

    .line 18
    check-cast v4, LS0/j;

    .line 19
    .line 20
    iget-wide v4, v4, LV0/v;->g:J

    .line 21
    .line 22
    cmp-long v6, v2, v4

    .line 23
    .line 24
    if-lez v6, :cond_0

    .line 25
    .line 26
    move-object v0, v1

    .line 27
    :cond_0
    sget-object v1, LS0/b;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 28
    .line 29
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, LS0/j;

    .line 34
    .line 35
    iget-wide v2, v1, LV0/v;->g:J

    .line 36
    .line 37
    move-object v4, v0

    .line 38
    check-cast v4, LS0/j;

    .line 39
    .line 40
    iget-wide v4, v4, LV0/v;->g:J

    .line 41
    .line 42
    cmp-long v6, v2, v4

    .line 43
    .line 44
    if-lez v6, :cond_1

    .line 45
    .line 46
    move-object v0, v1

    .line 47
    :cond_1
    check-cast v0, LV0/d;

    .line 48
    .line 49
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    sget-object v1, LV0/d;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    sget-object v2, LV0/a;->b:LD/j;

    .line 59
    .line 60
    const/4 v3, 0x0

    .line 61
    if-ne v1, v2, :cond_2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    check-cast v1, LV0/d;

    .line 65
    .line 66
    if-nez v1, :cond_15

    .line 67
    .line 68
    :cond_3
    sget-object v1, LV0/d;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 69
    .line 70
    invoke-virtual {v1, v0, v3, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_14

    .line 75
    .line 76
    :goto_1
    check-cast v0, LS0/j;

    .line 77
    .line 78
    invoke-virtual {p0}, LS0/b;->t()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    const/4 v2, -0x1

    .line 83
    const/4 v4, 0x1

    .line 84
    if-eqz v1, :cond_a

    .line 85
    .line 86
    move-object v1, v0

    .line 87
    :cond_4
    sget v5, LS0/d;->b:I

    .line 88
    .line 89
    sub-int/2addr v5, v4

    .line 90
    :goto_2
    const-wide/16 v6, -0x1

    .line 91
    .line 92
    if-ge v2, v5, :cond_9

    .line 93
    .line 94
    sget v8, LS0/d;->b:I

    .line 95
    .line 96
    int-to-long v8, v8

    .line 97
    iget-wide v10, v1, LV0/v;->g:J

    .line 98
    .line 99
    mul-long v10, v10, v8

    .line 100
    .line 101
    int-to-long v8, v5

    .line 102
    add-long/2addr v10, v8

    .line 103
    sget-object v8, LS0/b;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 104
    .line 105
    invoke-virtual {v8, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 106
    .line 107
    .line 108
    move-result-wide v8

    .line 109
    cmp-long v12, v10, v8

    .line 110
    .line 111
    if-gez v12, :cond_5

    .line 112
    .line 113
    :goto_3
    move-wide v10, v6

    .line 114
    goto :goto_5

    .line 115
    :cond_5
    invoke-virtual {v1, v5}, LS0/j;->k(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    if-eqz v8, :cond_7

    .line 120
    .line 121
    sget-object v9, LS0/d;->e:LD/j;

    .line 122
    .line 123
    if-ne v8, v9, :cond_6

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_6
    sget-object v9, LS0/d;->d:LD/j;

    .line 127
    .line 128
    if-ne v8, v9, :cond_8

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_7
    :goto_4
    sget-object v9, LS0/d;->l:LD/j;

    .line 132
    .line 133
    invoke-virtual {v1, v5, v8, v9}, LS0/j;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    if-eqz v8, :cond_5

    .line 138
    .line 139
    invoke-virtual {v1}, LV0/v;->h()V

    .line 140
    .line 141
    .line 142
    :cond_8
    add-int/lit8 v5, v5, -0x1

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_9
    sget-object v5, LV0/d;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 146
    .line 147
    invoke-virtual {v5, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    check-cast v1, LV0/d;

    .line 152
    .line 153
    check-cast v1, LS0/j;

    .line 154
    .line 155
    if-nez v1, :cond_4

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :goto_5
    cmp-long v1, v10, v6

    .line 159
    .line 160
    if-eqz v1, :cond_a

    .line 161
    .line 162
    invoke-virtual {p0, v10, v11}, LS0/b;->h(J)V

    .line 163
    .line 164
    .line 165
    :cond_a
    move-object v1, v0

    .line 166
    :goto_6
    if-eqz v1, :cond_11

    .line 167
    .line 168
    sget v5, LS0/d;->b:I

    .line 169
    .line 170
    sub-int/2addr v5, v4

    .line 171
    :goto_7
    if-ge v2, v5, :cond_10

    .line 172
    .line 173
    sget v6, LS0/d;->b:I

    .line 174
    .line 175
    int-to-long v6, v6

    .line 176
    iget-wide v8, v1, LV0/v;->g:J

    .line 177
    .line 178
    mul-long v8, v8, v6

    .line 179
    .line 180
    int-to-long v6, v5

    .line 181
    add-long/2addr v8, v6

    .line 182
    cmp-long v6, v8, p1

    .line 183
    .line 184
    if-ltz v6, :cond_11

    .line 185
    .line 186
    :cond_b
    invoke-virtual {v1, v5}, LS0/j;->k(I)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    if-eqz v6, :cond_e

    .line 191
    .line 192
    sget-object v7, LS0/d;->e:LD/j;

    .line 193
    .line 194
    if-ne v6, v7, :cond_c

    .line 195
    .line 196
    goto :goto_8

    .line 197
    :cond_c
    instance-of v7, v6, LS0/s;

    .line 198
    .line 199
    if-eqz v7, :cond_d

    .line 200
    .line 201
    sget-object v7, LS0/d;->l:LD/j;

    .line 202
    .line 203
    invoke-virtual {v1, v5, v6, v7}, LS0/j;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    if-eqz v7, :cond_b

    .line 208
    .line 209
    check-cast v6, LS0/s;

    .line 210
    .line 211
    iget-object v6, v6, LS0/s;->a:LQ0/l0;

    .line 212
    .line 213
    invoke-static {v3, v6}, LV0/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    invoke-virtual {v1, v5, v4}, LS0/j;->l(IZ)V

    .line 218
    .line 219
    .line 220
    goto :goto_9

    .line 221
    :cond_d
    instance-of v7, v6, LQ0/l0;

    .line 222
    .line 223
    if-eqz v7, :cond_f

    .line 224
    .line 225
    sget-object v7, LS0/d;->l:LD/j;

    .line 226
    .line 227
    invoke-virtual {v1, v5, v6, v7}, LS0/j;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v7

    .line 231
    if-eqz v7, :cond_b

    .line 232
    .line 233
    invoke-static {v3, v6}, LV0/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    invoke-virtual {v1, v5, v4}, LS0/j;->l(IZ)V

    .line 238
    .line 239
    .line 240
    goto :goto_9

    .line 241
    :cond_e
    :goto_8
    sget-object v7, LS0/d;->l:LD/j;

    .line 242
    .line 243
    invoke-virtual {v1, v5, v6, v7}, LS0/j;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v6

    .line 247
    if-eqz v6, :cond_b

    .line 248
    .line 249
    invoke-virtual {v1}, LV0/v;->h()V

    .line 250
    .line 251
    .line 252
    :cond_f
    :goto_9
    add-int/lit8 v5, v5, -0x1

    .line 253
    .line 254
    goto :goto_7

    .line 255
    :cond_10
    sget-object v5, LV0/d;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 256
    .line 257
    invoke-virtual {v5, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    check-cast v1, LV0/d;

    .line 262
    .line 263
    check-cast v1, LS0/j;

    .line 264
    .line 265
    goto :goto_6

    .line 266
    :cond_11
    if-eqz v3, :cond_13

    .line 267
    .line 268
    instance-of p1, v3, Ljava/util/ArrayList;

    .line 269
    .line 270
    if-nez p1, :cond_12

    .line 271
    .line 272
    check-cast v3, LQ0/l0;

    .line 273
    .line 274
    invoke-virtual {p0, v3, v4}, LS0/b;->x(LQ0/l0;Z)V

    .line 275
    .line 276
    .line 277
    goto :goto_b

    .line 278
    :cond_12
    check-cast v3, Ljava/util/ArrayList;

    .line 279
    .line 280
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 281
    .line 282
    .line 283
    move-result p1

    .line 284
    sub-int/2addr p1, v4

    .line 285
    :goto_a
    if-ge v2, p1, :cond_13

    .line 286
    .line 287
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object p2

    .line 291
    check-cast p2, LQ0/l0;

    .line 292
    .line 293
    invoke-virtual {p0, p2, v4}, LS0/b;->x(LQ0/l0;Z)V

    .line 294
    .line 295
    .line 296
    add-int/lit8 p1, p1, -0x1

    .line 297
    .line 298
    goto :goto_a

    .line 299
    :cond_13
    :goto_b
    return-object v0

    .line 300
    :cond_14
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    if-eqz v1, :cond_3

    .line 305
    .line 306
    goto/16 :goto_0

    .line 307
    .line 308
    :cond_15
    move-object v0, v1

    .line 309
    goto/16 :goto_0
.end method

.method public final h(J)V
    .locals 10

    .line 1
    sget-object v0, LS0/b;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LS0/j;

    .line 8
    .line 9
    :cond_0
    :goto_0
    sget-object v1, LS0/b;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 10
    .line 11
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v8

    .line 15
    iget v2, p0, LS0/b;->e:I

    .line 16
    .line 17
    int-to-long v2, v2

    .line 18
    add-long/2addr v2, v8

    .line 19
    sget-object v4, LS0/b;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 20
    .line 21
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 22
    .line 23
    .line 24
    move-result-wide v4

    .line 25
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    cmp-long v4, p1, v2

    .line 30
    .line 31
    if-gez v4, :cond_1

    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    const-wide/16 v2, 0x1

    .line 35
    .line 36
    add-long v5, v8, v2

    .line 37
    .line 38
    move-object v2, p0

    .line 39
    move-wide v3, v8

    .line 40
    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    sget v1, LS0/d;->b:I

    .line 47
    .line 48
    int-to-long v1, v1

    .line 49
    div-long v3, v8, v1

    .line 50
    .line 51
    rem-long v1, v8, v1

    .line 52
    .line 53
    long-to-int v5, v1

    .line 54
    iget-wide v1, v0, LV0/v;->g:J

    .line 55
    .line 56
    cmp-long v6, v1, v3

    .line 57
    .line 58
    if-eqz v6, :cond_3

    .line 59
    .line 60
    invoke-virtual {p0, v3, v4, v0}, LS0/b;->k(JLS0/j;)LS0/j;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    if-nez v1, :cond_2

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    move-object v0, v1

    .line 68
    :cond_3
    const/4 v7, 0x0

    .line 69
    move-object v2, p0

    .line 70
    move-object v3, v0

    .line 71
    move v4, v5

    .line 72
    move-wide v5, v8

    .line 73
    invoke-virtual/range {v2 .. v7}, LS0/b;->A(LS0/j;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    sget-object v2, LS0/d;->o:LD/j;

    .line 78
    .line 79
    if-ne v1, v2, :cond_4

    .line 80
    .line 81
    invoke-virtual {p0}, LS0/b;->p()J

    .line 82
    .line 83
    .line 84
    move-result-wide v1

    .line 85
    cmp-long v3, v8, v1

    .line 86
    .line 87
    if-gez v3, :cond_0

    .line 88
    .line 89
    invoke-virtual {v0}, LV0/d;->a()V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_4
    invoke-virtual {v0}, LV0/d;->a()V

    .line 94
    .line 95
    .line 96
    iget-object v2, p0, LS0/b;->f:LH0/l;

    .line 97
    .line 98
    if-eqz v2, :cond_0

    .line 99
    .line 100
    const/4 v3, 0x0

    .line 101
    invoke-static {v2, v1, v3}, LV0/a;->a(LH0/l;Ljava/lang/Object;LO/c;)LO/c;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    if-nez v1, :cond_5

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_5
    throw v1
.end method

.method public final i()V
    .locals 16

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, LS0/b;->u()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    sget-object v7, LS0/b;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 11
    .line 12
    invoke-virtual {v7, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, LS0/j;

    .line 17
    .line 18
    move-object v8, v0

    .line 19
    :goto_0
    sget-object v0, LS0/b;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 20
    .line 21
    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 22
    .line 23
    .line 24
    move-result-wide v9

    .line 25
    sget v0, LS0/d;->b:I

    .line 26
    .line 27
    int-to-long v0, v0

    .line 28
    div-long v0, v9, v0

    .line 29
    .line 30
    invoke-virtual/range {p0 .. p0}, LS0/b;->p()J

    .line 31
    .line 32
    .line 33
    move-result-wide v2

    .line 34
    cmp-long v4, v2, v9

    .line 35
    .line 36
    if-gtz v4, :cond_2

    .line 37
    .line 38
    iget-wide v2, v8, LV0/v;->g:J

    .line 39
    .line 40
    cmp-long v4, v2, v0

    .line 41
    .line 42
    if-gez v4, :cond_1

    .line 43
    .line 44
    invoke-virtual {v8}, LV0/d;->b()LV0/d;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    invoke-virtual {v6, v0, v1, v8}, LS0/b;->v(JLS0/j;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    invoke-static/range {p0 .. p0}, LS0/b;->q(LS0/b;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_2
    iget-wide v2, v8, LV0/v;->g:J

    .line 58
    .line 59
    cmp-long v4, v2, v0

    .line 60
    .line 61
    if-eqz v4, :cond_d

    .line 62
    .line 63
    sget-object v2, LS0/c;->m:LS0/c;

    .line 64
    .line 65
    :goto_1
    invoke-static {v8, v0, v1, v2}, LV0/a;->b(LV0/v;JLH0/p;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-static {v3}, LV0/a;->e(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-nez v4, :cond_7

    .line 74
    .line 75
    invoke-static {v3}, LV0/a;->c(Ljava/lang/Object;)LV0/v;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    :cond_3
    :goto_2
    invoke-virtual {v7, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    check-cast v5, LV0/v;

    .line 84
    .line 85
    iget-wide v11, v5, LV0/v;->g:J

    .line 86
    .line 87
    iget-wide v13, v4, LV0/v;->g:J

    .line 88
    .line 89
    cmp-long v15, v11, v13

    .line 90
    .line 91
    if-ltz v15, :cond_4

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_4
    invoke-virtual {v4}, LV0/v;->i()Z

    .line 95
    .line 96
    .line 97
    move-result v11

    .line 98
    if-nez v11, :cond_5

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_5
    invoke-virtual {v7, v6, v5, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    if-eqz v11, :cond_6

    .line 106
    .line 107
    invoke-virtual {v5}, LV0/v;->e()Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-eqz v2, :cond_7

    .line 112
    .line 113
    invoke-virtual {v5}, LV0/d;->d()V

    .line 114
    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_6
    invoke-virtual {v7, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v11

    .line 121
    if-eq v11, v5, :cond_5

    .line 122
    .line 123
    invoke-virtual {v4}, LV0/v;->e()Z

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    if-eqz v5, :cond_3

    .line 128
    .line 129
    invoke-virtual {v4}, LV0/d;->d()V

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_7
    :goto_3
    invoke-static {v3}, LV0/a;->e(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    const/4 v11, 0x0

    .line 138
    if-eqz v2, :cond_8

    .line 139
    .line 140
    invoke-virtual/range {p0 .. p0}, LS0/b;->s()Z

    .line 141
    .line 142
    .line 143
    invoke-virtual {v6, v0, v1, v8}, LS0/b;->v(JLS0/j;)V

    .line 144
    .line 145
    .line 146
    invoke-static/range {p0 .. p0}, LS0/b;->q(LS0/b;)V

    .line 147
    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_8
    invoke-static {v3}, LV0/a;->c(Ljava/lang/Object;)LV0/v;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    check-cast v2, LS0/j;

    .line 155
    .line 156
    iget-wide v3, v2, LV0/v;->g:J

    .line 157
    .line 158
    cmp-long v5, v3, v0

    .line 159
    .line 160
    if-lez v5, :cond_a

    .line 161
    .line 162
    const-wide/16 v0, 0x1

    .line 163
    .line 164
    add-long v12, v9, v0

    .line 165
    .line 166
    sget v0, LS0/d;->b:I

    .line 167
    .line 168
    int-to-long v0, v0

    .line 169
    mul-long v14, v3, v0

    .line 170
    .line 171
    sget-object v0, LS0/b;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 172
    .line 173
    move-object/from16 v1, p0

    .line 174
    .line 175
    move-wide v2, v12

    .line 176
    move-wide v4, v14

    .line 177
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-eqz v0, :cond_9

    .line 182
    .line 183
    sub-long/2addr v14, v9

    .line 184
    sget-object v0, LS0/b;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 185
    .line 186
    invoke-virtual {v0, v6, v14, v15}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 187
    .line 188
    .line 189
    move-result-wide v1

    .line 190
    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    .line 191
    .line 192
    and-long/2addr v1, v3

    .line 193
    const-wide/16 v12, 0x0

    .line 194
    .line 195
    cmp-long v5, v1, v12

    .line 196
    .line 197
    if-eqz v5, :cond_b

    .line 198
    .line 199
    :goto_4
    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 200
    .line 201
    .line 202
    move-result-wide v1

    .line 203
    and-long/2addr v1, v3

    .line 204
    cmp-long v5, v1, v12

    .line 205
    .line 206
    if-eqz v5, :cond_b

    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_9
    invoke-static/range {p0 .. p0}, LS0/b;->q(LS0/b;)V

    .line 210
    .line 211
    .line 212
    goto :goto_5

    .line 213
    :cond_a
    move-object v11, v2

    .line 214
    :cond_b
    :goto_5
    if-nez v11, :cond_c

    .line 215
    .line 216
    goto/16 :goto_0

    .line 217
    .line 218
    :cond_c
    move-object v8, v11

    .line 219
    :cond_d
    sget v0, LS0/d;->b:I

    .line 220
    .line 221
    int-to-long v0, v0

    .line 222
    rem-long v0, v9, v0

    .line 223
    .line 224
    long-to-int v1, v0

    .line 225
    invoke-virtual {v8, v1}, LS0/j;->k(I)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    instance-of v2, v0, LQ0/l0;

    .line 230
    .line 231
    sget-object v3, LS0/b;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 232
    .line 233
    if-eqz v2, :cond_f

    .line 234
    .line 235
    invoke-virtual {v3, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 236
    .line 237
    .line 238
    move-result-wide v4

    .line 239
    cmp-long v2, v9, v4

    .line 240
    .line 241
    if-ltz v2, :cond_f

    .line 242
    .line 243
    sget-object v2, LS0/d;->g:LD/j;

    .line 244
    .line 245
    invoke-virtual {v8, v1, v0, v2}, LS0/j;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    if-eqz v2, :cond_f

    .line 250
    .line 251
    invoke-static {v0}, LS0/b;->z(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    if-eqz v0, :cond_e

    .line 256
    .line 257
    sget-object v0, LS0/d;->d:LD/j;

    .line 258
    .line 259
    invoke-virtual {v8, v1, v0}, LS0/j;->n(ILD/j;)V

    .line 260
    .line 261
    .line 262
    goto/16 :goto_8

    .line 263
    .line 264
    :cond_e
    sget-object v0, LS0/d;->j:LD/j;

    .line 265
    .line 266
    invoke-virtual {v8, v1, v0}, LS0/j;->n(ILD/j;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v8}, LV0/v;->h()V

    .line 270
    .line 271
    .line 272
    goto :goto_7

    .line 273
    :cond_f
    :goto_6
    invoke-virtual {v8, v1}, LS0/j;->k(I)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    instance-of v2, v0, LQ0/l0;

    .line 278
    .line 279
    if-eqz v2, :cond_12

    .line 280
    .line 281
    invoke-virtual {v3, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 282
    .line 283
    .line 284
    move-result-wide v4

    .line 285
    cmp-long v2, v9, v4

    .line 286
    .line 287
    if-gez v2, :cond_10

    .line 288
    .line 289
    new-instance v2, LS0/s;

    .line 290
    .line 291
    move-object v4, v0

    .line 292
    check-cast v4, LQ0/l0;

    .line 293
    .line 294
    invoke-direct {v2, v4}, LS0/s;-><init>(LQ0/l0;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v8, v1, v0, v2}, LS0/j;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-eqz v0, :cond_f

    .line 302
    .line 303
    goto/16 :goto_8

    .line 304
    .line 305
    :cond_10
    sget-object v2, LS0/d;->g:LD/j;

    .line 306
    .line 307
    invoke-virtual {v8, v1, v0, v2}, LS0/j;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v2

    .line 311
    if-eqz v2, :cond_f

    .line 312
    .line 313
    invoke-static {v0}, LS0/b;->z(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    if-eqz v0, :cond_11

    .line 318
    .line 319
    sget-object v0, LS0/d;->d:LD/j;

    .line 320
    .line 321
    invoke-virtual {v8, v1, v0}, LS0/j;->n(ILD/j;)V

    .line 322
    .line 323
    .line 324
    goto :goto_8

    .line 325
    :cond_11
    sget-object v0, LS0/d;->j:LD/j;

    .line 326
    .line 327
    invoke-virtual {v8, v1, v0}, LS0/j;->n(ILD/j;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v8}, LV0/v;->h()V

    .line 331
    .line 332
    .line 333
    goto :goto_7

    .line 334
    :cond_12
    sget-object v2, LS0/d;->j:LD/j;

    .line 335
    .line 336
    if-ne v0, v2, :cond_13

    .line 337
    .line 338
    :goto_7
    invoke-static/range {p0 .. p0}, LS0/b;->q(LS0/b;)V

    .line 339
    .line 340
    .line 341
    goto/16 :goto_0

    .line 342
    .line 343
    :cond_13
    if-nez v0, :cond_14

    .line 344
    .line 345
    sget-object v2, LS0/d;->e:LD/j;

    .line 346
    .line 347
    invoke-virtual {v8, v1, v0, v2}, LS0/j;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    if-eqz v0, :cond_f

    .line 352
    .line 353
    goto :goto_8

    .line 354
    :cond_14
    sget-object v2, LS0/d;->d:LD/j;

    .line 355
    .line 356
    if-ne v0, v2, :cond_15

    .line 357
    .line 358
    goto :goto_8

    .line 359
    :cond_15
    sget-object v2, LS0/d;->h:LD/j;

    .line 360
    .line 361
    if-eq v0, v2, :cond_19

    .line 362
    .line 363
    sget-object v2, LS0/d;->i:LD/j;

    .line 364
    .line 365
    if-eq v0, v2, :cond_19

    .line 366
    .line 367
    sget-object v2, LS0/d;->k:LD/j;

    .line 368
    .line 369
    if-ne v0, v2, :cond_16

    .line 370
    .line 371
    goto :goto_8

    .line 372
    :cond_16
    sget-object v2, LS0/d;->l:LD/j;

    .line 373
    .line 374
    if-ne v0, v2, :cond_17

    .line 375
    .line 376
    goto :goto_8

    .line 377
    :cond_17
    sget-object v2, LS0/d;->f:LD/j;

    .line 378
    .line 379
    if-ne v0, v2, :cond_18

    .line 380
    .line 381
    goto :goto_6

    .line 382
    :cond_18
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 383
    .line 384
    new-instance v2, Ljava/lang/StringBuilder;

    .line 385
    .line 386
    const-string v3, "Unexpected cell state: "

    .line 387
    .line 388
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    throw v1

    .line 406
    :cond_19
    :goto_8
    invoke-static/range {p0 .. p0}, LS0/b;->q(LS0/b;)V

    .line 407
    .line 408
    .line 409
    return-void
.end method

.method public j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    sget-object v9, LS0/b;->g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 4
    .line 5
    invoke-virtual {v9, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    const/4 v10, 0x0

    .line 10
    invoke-virtual {v8, v0, v1, v10}, LS0/b;->r(JZ)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v11, 0x1

    .line 15
    const-wide v12, 0xfffffffffffffffL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    and-long/2addr v0, v12

    .line 25
    invoke-virtual {v8, v0, v1}, LS0/b;->e(J)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    xor-int/2addr v0, v11

    .line 30
    :goto_0
    sget-object v14, LS0/i;->a:LS0/h;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    return-object v14

    .line 35
    :cond_1
    sget-object v15, LS0/d;->j:LD/j;

    .line 36
    .line 37
    sget-object v0, LS0/b;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 38
    .line 39
    invoke-virtual {v0, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, LS0/j;

    .line 44
    .line 45
    :cond_2
    :goto_1
    invoke-virtual {v9, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    and-long v16, v1, v12

    .line 50
    .line 51
    invoke-virtual {v8, v1, v2, v10}, LS0/b;->r(JZ)Z

    .line 52
    .line 53
    .line 54
    move-result v18

    .line 55
    sget v7, LS0/d;->b:I

    .line 56
    .line 57
    int-to-long v1, v7

    .line 58
    div-long v3, v16, v1

    .line 59
    .line 60
    rem-long v1, v16, v1

    .line 61
    .line 62
    long-to-int v6, v1

    .line 63
    iget-wide v1, v0, LV0/v;->g:J

    .line 64
    .line 65
    cmp-long v5, v1, v3

    .line 66
    .line 67
    if-eqz v5, :cond_4

    .line 68
    .line 69
    invoke-static {v8, v3, v4, v0}, LS0/b;->b(LS0/b;JLS0/j;)LS0/j;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    if-nez v1, :cond_3

    .line 74
    .line 75
    if-eqz v18, :cond_2

    .line 76
    .line 77
    invoke-virtual/range {p0 .. p0}, LS0/b;->o()Ljava/lang/Throwable;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    new-instance v14, LS0/g;

    .line 82
    .line 83
    invoke-direct {v14, v0}, LS0/g;-><init>(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    goto/16 :goto_7

    .line 87
    .line 88
    :cond_3
    move-object v4, v1

    .line 89
    goto :goto_2

    .line 90
    :cond_4
    move-object v4, v0

    .line 91
    :goto_2
    move-object/from16 v0, p0

    .line 92
    .line 93
    move-object v1, v4

    .line 94
    move v2, v6

    .line 95
    move-object/from16 v3, p1

    .line 96
    .line 97
    move-object/from16 v19, v4

    .line 98
    .line 99
    move-wide/from16 v4, v16

    .line 100
    .line 101
    move/from16 v20, v6

    .line 102
    .line 103
    move-object v6, v15

    .line 104
    move/from16 v21, v7

    .line 105
    .line 106
    move/from16 v7, v18

    .line 107
    .line 108
    invoke-static/range {v0 .. v7}, LS0/b;->d(LS0/b;LS0/j;ILjava/lang/Object;JLjava/lang/Object;Z)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    sget-object v1, Lx0/g;->a:Lx0/g;

    .line 113
    .line 114
    if-eqz v0, :cond_e

    .line 115
    .line 116
    if-eq v0, v11, :cond_d

    .line 117
    .line 118
    const/4 v1, 0x2

    .line 119
    if-eq v0, v1, :cond_9

    .line 120
    .line 121
    const/4 v1, 0x3

    .line 122
    if-eq v0, v1, :cond_8

    .line 123
    .line 124
    const/4 v1, 0x4

    .line 125
    if-eq v0, v1, :cond_6

    .line 126
    .line 127
    const/4 v1, 0x5

    .line 128
    if-eq v0, v1, :cond_5

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_5
    invoke-virtual/range {v19 .. v19}, LV0/d;->a()V

    .line 132
    .line 133
    .line 134
    :goto_3
    move-object/from16 v0, v19

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_6
    sget-object v0, LS0/b;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 138
    .line 139
    invoke-virtual {v0, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 140
    .line 141
    .line 142
    move-result-wide v0

    .line 143
    cmp-long v2, v16, v0

    .line 144
    .line 145
    if-gez v2, :cond_7

    .line 146
    .line 147
    invoke-virtual/range {v19 .. v19}, LV0/d;->a()V

    .line 148
    .line 149
    .line 150
    :cond_7
    invoke-virtual/range {p0 .. p0}, LS0/b;->o()Ljava/lang/Throwable;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    new-instance v14, LS0/g;

    .line 155
    .line 156
    invoke-direct {v14, v0}, LS0/g;-><init>(Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    goto :goto_7

    .line 160
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 161
    .line 162
    const-string v1, "unexpected"

    .line 163
    .line 164
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw v0

    .line 168
    :cond_9
    if-eqz v18, :cond_a

    .line 169
    .line 170
    invoke-virtual/range {v19 .. v19}, LV0/v;->h()V

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {p0 .. p0}, LS0/b;->o()Ljava/lang/Throwable;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    new-instance v14, LS0/g;

    .line 178
    .line 179
    invoke-direct {v14, v0}, LS0/g;-><init>(Ljava/lang/Throwable;)V

    .line 180
    .line 181
    .line 182
    goto :goto_7

    .line 183
    :cond_a
    instance-of v0, v15, LQ0/l0;

    .line 184
    .line 185
    if-eqz v0, :cond_b

    .line 186
    .line 187
    check-cast v15, LQ0/l0;

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_b
    const/4 v15, 0x0

    .line 191
    :goto_4
    if-eqz v15, :cond_c

    .line 192
    .line 193
    add-int v6, v20, v21

    .line 194
    .line 195
    move-object/from16 v0, v19

    .line 196
    .line 197
    invoke-interface {v15, v0, v6}, LQ0/l0;->a(LV0/v;I)V

    .line 198
    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_c
    move-object/from16 v0, v19

    .line 202
    .line 203
    :goto_5
    invoke-virtual {v0}, LV0/v;->h()V

    .line 204
    .line 205
    .line 206
    goto :goto_7

    .line 207
    :cond_d
    :goto_6
    move-object v14, v1

    .line 208
    goto :goto_7

    .line 209
    :cond_e
    move-object/from16 v0, v19

    .line 210
    .line 211
    invoke-virtual {v0}, LV0/d;->a()V

    .line 212
    .line 213
    .line 214
    goto :goto_6

    .line 215
    :goto_7
    return-object v14
.end method

.method public final k(JLS0/j;)LS0/j;
    .locals 11

    .line 1
    sget-object v0, LS0/d;->a:LS0/j;

    .line 2
    .line 3
    sget-object v0, LS0/c;->m:LS0/c;

    .line 4
    .line 5
    :goto_0
    invoke-static {p3, p1, p2, v0}, LV0/a;->b(LV0/v;JLH0/p;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, LV0/a;->e(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_4

    .line 14
    .line 15
    invoke-static {v1}, LV0/a;->c(Ljava/lang/Object;)LV0/v;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :cond_0
    :goto_1
    sget-object v3, LS0/b;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 20
    .line 21
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, LV0/v;

    .line 26
    .line 27
    iget-wide v5, v4, LV0/v;->g:J

    .line 28
    .line 29
    iget-wide v7, v2, LV0/v;->g:J

    .line 30
    .line 31
    cmp-long v9, v5, v7

    .line 32
    .line 33
    if-ltz v9, :cond_1

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_1
    invoke-virtual {v2}, LV0/v;->i()Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-nez v5, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-virtual {v3, p0, v4, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_3

    .line 48
    .line 49
    invoke-virtual {v4}, LV0/v;->e()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    invoke-virtual {v4}, LV0/d;->d()V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    if-eq v5, v4, :cond_2

    .line 64
    .line 65
    invoke-virtual {v2}, LV0/v;->e()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_0

    .line 70
    .line 71
    invoke-virtual {v2}, LV0/d;->d()V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_4
    :goto_2
    invoke-static {v1}, LV0/a;->e(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    const/4 v2, 0x0

    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    invoke-virtual {p0}, LS0/b;->s()Z

    .line 83
    .line 84
    .line 85
    sget p1, LS0/d;->b:I

    .line 86
    .line 87
    int-to-long p1, p1

    .line 88
    iget-wide v0, p3, LV0/v;->g:J

    .line 89
    .line 90
    mul-long v0, v0, p1

    .line 91
    .line 92
    invoke-virtual {p0}, LS0/b;->p()J

    .line 93
    .line 94
    .line 95
    move-result-wide p1

    .line 96
    cmp-long v3, v0, p1

    .line 97
    .line 98
    if-gez v3, :cond_d

    .line 99
    .line 100
    invoke-virtual {p3}, LV0/d;->a()V

    .line 101
    .line 102
    .line 103
    goto/16 :goto_6

    .line 104
    .line 105
    :cond_5
    invoke-static {v1}, LV0/a;->c(Ljava/lang/Object;)LV0/v;

    .line 106
    .line 107
    .line 108
    move-result-object p3

    .line 109
    check-cast p3, LS0/j;

    .line 110
    .line 111
    invoke-virtual {p0}, LS0/b;->u()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    iget-wide v3, p3, LV0/v;->g:J

    .line 116
    .line 117
    if-nez v0, :cond_9

    .line 118
    .line 119
    sget-object v0, LS0/b;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 120
    .line 121
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 122
    .line 123
    .line 124
    move-result-wide v0

    .line 125
    sget v5, LS0/d;->b:I

    .line 126
    .line 127
    int-to-long v5, v5

    .line 128
    div-long/2addr v0, v5

    .line 129
    cmp-long v5, p1, v0

    .line 130
    .line 131
    if-gtz v5, :cond_9

    .line 132
    .line 133
    :cond_6
    :goto_3
    sget-object v0, LS0/b;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 134
    .line 135
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    check-cast v1, LV0/v;

    .line 140
    .line 141
    iget-wide v5, v1, LV0/v;->g:J

    .line 142
    .line 143
    cmp-long v7, v5, v3

    .line 144
    .line 145
    if-gez v7, :cond_9

    .line 146
    .line 147
    invoke-virtual {p3}, LV0/v;->i()Z

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    if-eqz v5, :cond_9

    .line 152
    .line 153
    :cond_7
    invoke-virtual {v0, p0, v1, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    if-eqz v5, :cond_8

    .line 158
    .line 159
    invoke-virtual {v1}, LV0/v;->e()Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-eqz v0, :cond_9

    .line 164
    .line 165
    invoke-virtual {v1}, LV0/d;->d()V

    .line 166
    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_8
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    if-eq v5, v1, :cond_7

    .line 174
    .line 175
    invoke-virtual {p3}, LV0/v;->e()Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-eqz v0, :cond_6

    .line 180
    .line 181
    invoke-virtual {p3}, LV0/d;->d()V

    .line 182
    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_9
    :goto_4
    cmp-long v0, v3, p1

    .line 186
    .line 187
    if-lez v0, :cond_c

    .line 188
    .line 189
    sget p1, LS0/d;->b:I

    .line 190
    .line 191
    int-to-long p1, p1

    .line 192
    mul-long p1, p1, v3

    .line 193
    .line 194
    :cond_a
    sget-object v5, LS0/b;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 195
    .line 196
    invoke-virtual {v5, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 197
    .line 198
    .line 199
    move-result-wide v7

    .line 200
    cmp-long v0, v7, p1

    .line 201
    .line 202
    if-ltz v0, :cond_b

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_b
    move-object v6, p0

    .line 206
    move-wide v9, p1

    .line 207
    invoke-virtual/range {v5 .. v10}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_a

    .line 212
    .line 213
    :goto_5
    sget p1, LS0/d;->b:I

    .line 214
    .line 215
    int-to-long p1, p1

    .line 216
    mul-long v3, v3, p1

    .line 217
    .line 218
    invoke-virtual {p0}, LS0/b;->p()J

    .line 219
    .line 220
    .line 221
    move-result-wide p1

    .line 222
    cmp-long v0, v3, p1

    .line 223
    .line 224
    if-gez v0, :cond_d

    .line 225
    .line 226
    invoke-virtual {p3}, LV0/d;->a()V

    .line 227
    .line 228
    .line 229
    goto :goto_6

    .line 230
    :cond_c
    move-object v2, p3

    .line 231
    :cond_d
    :goto_6
    return-object v2
.end method

.method public final l()Ljava/lang/Throwable;
    .locals 1

    .line 1
    sget-object v0, LS0/b;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Throwable;

    .line 8
    .line 9
    return-object v0
.end method

.method public final m()Ljava/lang/Throwable;
    .locals 2

    .line 1
    invoke-virtual {p0}, LS0/b;->l()Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, LS0/k;

    .line 8
    .line 9
    const-string v1, "Channel was closed"

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-object v0
.end method

.method public n(Ljava/lang/Object;Lz0/d;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v9, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    sget-object v10, LS0/b;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 6
    .line 7
    invoke-virtual {v10, v9}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, LS0/j;

    .line 12
    .line 13
    :cond_0
    :goto_0
    sget-object v11, LS0/b;->g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 14
    .line 15
    invoke-virtual {v11, v9}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    const-wide v12, 0xfffffffffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    and-long v14, v2, v12

    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    invoke-virtual {v9, v2, v3, v8}, LS0/b;->r(JZ)Z

    .line 28
    .line 29
    .line 30
    move-result v16

    .line 31
    sget v7, LS0/d;->b:I

    .line 32
    .line 33
    int-to-long v2, v7

    .line 34
    div-long v4, v14, v2

    .line 35
    .line 36
    rem-long v2, v14, v2

    .line 37
    .line 38
    long-to-int v6, v2

    .line 39
    iget-wide v2, v1, LV0/v;->g:J

    .line 40
    .line 41
    sget-object v12, Lx0/g;->a:Lx0/g;

    .line 42
    .line 43
    sget-object v13, LA0/a;->e:LA0/a;

    .line 44
    .line 45
    cmp-long v19, v2, v4

    .line 46
    .line 47
    if-eqz v19, :cond_3

    .line 48
    .line 49
    invoke-static {v9, v4, v5, v1}, LS0/b;->b(LS0/b;JLS0/j;)LS0/j;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    if-nez v2, :cond_2

    .line 54
    .line 55
    if-eqz v16, :cond_0

    .line 56
    .line 57
    invoke-virtual/range {p0 .. p2}, LS0/b;->w(Ljava/lang/Object;Lz0/d;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-ne v0, v13, :cond_1

    .line 62
    .line 63
    :goto_1
    move-object v12, v0

    .line 64
    goto/16 :goto_f

    .line 65
    .line 66
    :cond_1
    move-object v3, v12

    .line 67
    goto/16 :goto_e

    .line 68
    .line 69
    :cond_2
    move-object v5, v2

    .line 70
    goto :goto_2

    .line 71
    :cond_3
    move-object v5, v1

    .line 72
    :goto_2
    const/16 v19, 0x0

    .line 73
    .line 74
    move-object/from16 v1, p0

    .line 75
    .line 76
    move-object v2, v5

    .line 77
    move v3, v6

    .line 78
    move-object/from16 v4, p1

    .line 79
    .line 80
    move-object/from16 v21, v5

    .line 81
    .line 82
    move/from16 v20, v6

    .line 83
    .line 84
    move-wide v5, v14

    .line 85
    move/from16 v22, v7

    .line 86
    .line 87
    move-object/from16 v7, v19

    .line 88
    .line 89
    move-object/from16 v19, v12

    .line 90
    .line 91
    const/4 v12, 0x0

    .line 92
    move/from16 v8, v16

    .line 93
    .line 94
    invoke-static/range {v1 .. v8}, LS0/b;->d(LS0/b;LS0/j;ILjava/lang/Object;JLjava/lang/Object;Z)I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_1b

    .line 99
    .line 100
    const/4 v8, 0x1

    .line 101
    if-eq v1, v8, :cond_7

    .line 102
    .line 103
    const/4 v7, 0x2

    .line 104
    if-eq v1, v7, :cond_1a

    .line 105
    .line 106
    sget-object v5, LS0/b;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 107
    .line 108
    const/4 v6, 0x5

    .line 109
    const/4 v4, 0x4

    .line 110
    const/4 v3, 0x3

    .line 111
    if-eq v1, v3, :cond_8

    .line 112
    .line 113
    if-eq v1, v4, :cond_5

    .line 114
    .line 115
    if-eq v1, v6, :cond_4

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_4
    invoke-virtual/range {v21 .. v21}, LV0/d;->a()V

    .line 119
    .line 120
    .line 121
    :goto_3
    move-object/from16 v1, v21

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_5
    invoke-virtual {v5, v9}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 125
    .line 126
    .line 127
    move-result-wide v1

    .line 128
    cmp-long v3, v14, v1

    .line 129
    .line 130
    if-gez v3, :cond_6

    .line 131
    .line 132
    invoke-virtual/range {v21 .. v21}, LV0/d;->a()V

    .line 133
    .line 134
    .line 135
    :cond_6
    invoke-virtual/range {p0 .. p2}, LS0/b;->w(Ljava/lang/Object;Lz0/d;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    if-ne v0, v13, :cond_7

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_7
    move-object/from16 v3, v19

    .line 143
    .line 144
    goto/16 :goto_e

    .line 145
    .line 146
    :cond_8
    invoke-static/range {p2 .. p2}, La/a;->x(Lz0/d;)Lz0/d;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-static {v1}, LQ0/v;->c(Lz0/d;)LQ0/f;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    const/16 v16, 0x0

    .line 155
    .line 156
    move-object/from16 v1, p0

    .line 157
    .line 158
    move-object/from16 p2, v2

    .line 159
    .line 160
    move-object/from16 v2, v21

    .line 161
    .line 162
    move/from16 v3, v20

    .line 163
    .line 164
    const/4 v12, 0x4

    .line 165
    move-object/from16 v4, p1

    .line 166
    .line 167
    move-object/from16 v24, v5

    .line 168
    .line 169
    move-wide v5, v14

    .line 170
    const/4 v12, 0x2

    .line 171
    move-object/from16 v7, p2

    .line 172
    .line 173
    const/4 v12, 0x1

    .line 174
    move/from16 v8, v16

    .line 175
    .line 176
    :try_start_0
    invoke-static/range {v1 .. v8}, LS0/b;->d(LS0/b;LS0/j;ILjava/lang/Object;JLjava/lang/Object;Z)I

    .line 177
    .line 178
    .line 179
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 180
    if-eqz v1, :cond_18

    .line 181
    .line 182
    if-eq v1, v12, :cond_12

    .line 183
    .line 184
    const/4 v2, 0x2

    .line 185
    if-eq v1, v2, :cond_17

    .line 186
    .line 187
    const/4 v2, 0x4

    .line 188
    if-eq v1, v2, :cond_15

    .line 189
    .line 190
    const-string v14, "unexpected"

    .line 191
    .line 192
    const/4 v15, 0x5

    .line 193
    if-ne v1, v15, :cond_14

    .line 194
    .line 195
    :try_start_1
    invoke-virtual/range {v21 .. v21}, LV0/d;->a()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v10, v9}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    check-cast v1, LS0/j;

    .line 203
    .line 204
    :cond_9
    :goto_4
    invoke-virtual {v11, v9}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 205
    .line 206
    .line 207
    move-result-wide v2

    .line 208
    const-wide v16, 0xfffffffffffffffL

    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    and-long v20, v2, v16

    .line 214
    .line 215
    const/4 v10, 0x0

    .line 216
    invoke-virtual {v9, v2, v3, v10}, LS0/b;->r(JZ)Z

    .line 217
    .line 218
    .line 219
    move-result v18

    .line 220
    sget v8, LS0/d;->b:I

    .line 221
    .line 222
    int-to-long v2, v8

    .line 223
    div-long v4, v20, v2

    .line 224
    .line 225
    rem-long v2, v20, v2

    .line 226
    .line 227
    long-to-int v7, v2

    .line 228
    iget-wide v2, v1, LV0/v;->g:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 229
    .line 230
    cmp-long v6, v2, v4

    .line 231
    .line 232
    if-eqz v6, :cond_b

    .line 233
    .line 234
    :try_start_2
    invoke-static {v9, v4, v5, v1}, LS0/b;->b(LS0/b;JLS0/j;)LS0/j;

    .line 235
    .line 236
    .line 237
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 238
    if-nez v2, :cond_a

    .line 239
    .line 240
    if-eqz v18, :cond_9

    .line 241
    .line 242
    move-object/from16 v5, p2

    .line 243
    .line 244
    :try_start_3
    invoke-static {v9, v0, v5}, LS0/b;->c(LS0/b;Ljava/lang/Object;LQ0/f;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 245
    .line 246
    .line 247
    move-object v2, v5

    .line 248
    :goto_5
    move-object/from16 v3, v19

    .line 249
    .line 250
    goto/16 :goto_b

    .line 251
    .line 252
    :catchall_0
    move-exception v0

    .line 253
    :goto_6
    move-object v2, v5

    .line 254
    goto/16 :goto_d

    .line 255
    .line 256
    :cond_a
    move-object/from16 v5, p2

    .line 257
    .line 258
    move-object v6, v2

    .line 259
    goto :goto_7

    .line 260
    :catchall_1
    move-exception v0

    .line 261
    move-object/from16 v5, p2

    .line 262
    .line 263
    goto :goto_6

    .line 264
    :cond_b
    move-object/from16 v5, p2

    .line 265
    .line 266
    move-object v6, v1

    .line 267
    :goto_7
    move-object/from16 v1, p0

    .line 268
    .line 269
    move-object v2, v6

    .line 270
    move v3, v7

    .line 271
    move-object/from16 v4, p1

    .line 272
    .line 273
    move-object/from16 p2, v5

    .line 274
    .line 275
    move-object/from16 v22, v6

    .line 276
    .line 277
    move-wide/from16 v5, v20

    .line 278
    .line 279
    move/from16 v23, v7

    .line 280
    .line 281
    move-object/from16 v7, p2

    .line 282
    .line 283
    move/from16 v25, v8

    .line 284
    .line 285
    move/from16 v8, v18

    .line 286
    .line 287
    :try_start_4
    invoke-static/range {v1 .. v8}, LS0/b;->d(LS0/b;LS0/j;ILjava/lang/Object;JLjava/lang/Object;Z)I

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    if-eqz v1, :cond_13

    .line 292
    .line 293
    if-eq v1, v12, :cond_12

    .line 294
    .line 295
    const/4 v2, 0x2

    .line 296
    if-eq v1, v2, :cond_10

    .line 297
    .line 298
    const/4 v3, 0x3

    .line 299
    if-eq v1, v3, :cond_f

    .line 300
    .line 301
    const/4 v4, 0x4

    .line 302
    if-eq v1, v4, :cond_d

    .line 303
    .line 304
    if-eq v1, v15, :cond_c

    .line 305
    .line 306
    goto :goto_8

    .line 307
    :cond_c
    invoke-virtual/range {v22 .. v22}, LV0/d;->a()V

    .line 308
    .line 309
    .line 310
    :goto_8
    move-object/from16 v1, v22

    .line 311
    .line 312
    goto :goto_4

    .line 313
    :catchall_2
    move-exception v0

    .line 314
    move-object/from16 v2, p2

    .line 315
    .line 316
    goto/16 :goto_d

    .line 317
    .line 318
    :cond_d
    move-object/from16 v1, v24

    .line 319
    .line 320
    invoke-virtual {v1, v9}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 321
    .line 322
    .line 323
    move-result-wide v1

    .line 324
    cmp-long v3, v20, v1

    .line 325
    .line 326
    if-gez v3, :cond_e

    .line 327
    .line 328
    invoke-virtual/range {v22 .. v22}, LV0/d;->a()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 329
    .line 330
    .line 331
    :cond_e
    move-object/from16 v2, p2

    .line 332
    .line 333
    :goto_9
    :try_start_5
    invoke-static {v9, v0, v2}, LS0/b;->c(LS0/b;Ljava/lang/Object;LQ0/f;)V

    .line 334
    .line 335
    .line 336
    goto :goto_5

    .line 337
    :cond_f
    move-object/from16 v2, p2

    .line 338
    .line 339
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 340
    .line 341
    invoke-direct {v0, v14}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    throw v0

    .line 345
    :catchall_3
    move-exception v0

    .line 346
    goto/16 :goto_d

    .line 347
    .line 348
    :cond_10
    move-object/from16 v2, p2

    .line 349
    .line 350
    if-eqz v18, :cond_11

    .line 351
    .line 352
    invoke-virtual/range {v22 .. v22}, LV0/v;->h()V

    .line 353
    .line 354
    .line 355
    goto :goto_9

    .line 356
    :cond_11
    add-int v7, v23, v25

    .line 357
    .line 358
    move-object/from16 v1, v22

    .line 359
    .line 360
    invoke-virtual {v2, v1, v7}, LQ0/f;->a(LV0/v;I)V

    .line 361
    .line 362
    .line 363
    goto :goto_5

    .line 364
    :cond_12
    move-object/from16 v2, p2

    .line 365
    .line 366
    move-object/from16 v3, v19

    .line 367
    .line 368
    invoke-virtual {v2, v3}, LQ0/f;->m(Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    goto :goto_b

    .line 372
    :cond_13
    move-object/from16 v2, p2

    .line 373
    .line 374
    move-object/from16 v3, v19

    .line 375
    .line 376
    move-object/from16 v1, v22

    .line 377
    .line 378
    invoke-virtual {v1}, LV0/d;->a()V

    .line 379
    .line 380
    .line 381
    :goto_a
    invoke-virtual {v2, v3}, LQ0/f;->m(Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    goto :goto_b

    .line 385
    :cond_14
    move-object/from16 v2, p2

    .line 386
    .line 387
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 388
    .line 389
    invoke-direct {v0, v14}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    throw v0

    .line 393
    :cond_15
    move-object/from16 v2, p2

    .line 394
    .line 395
    move-object/from16 v3, v19

    .line 396
    .line 397
    move-object/from16 v1, v24

    .line 398
    .line 399
    invoke-virtual {v1, v9}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 400
    .line 401
    .line 402
    move-result-wide v4

    .line 403
    cmp-long v1, v14, v4

    .line 404
    .line 405
    if-gez v1, :cond_16

    .line 406
    .line 407
    invoke-virtual/range {v21 .. v21}, LV0/d;->a()V

    .line 408
    .line 409
    .line 410
    :cond_16
    invoke-static {v9, v0, v2}, LS0/b;->c(LS0/b;Ljava/lang/Object;LQ0/f;)V

    .line 411
    .line 412
    .line 413
    goto :goto_b

    .line 414
    :cond_17
    move-object/from16 v2, p2

    .line 415
    .line 416
    move-object/from16 v3, v19

    .line 417
    .line 418
    add-int v6, v20, v22

    .line 419
    .line 420
    move-object/from16 v1, v21

    .line 421
    .line 422
    invoke-virtual {v2, v1, v6}, LQ0/f;->a(LV0/v;I)V

    .line 423
    .line 424
    .line 425
    goto :goto_b

    .line 426
    :cond_18
    move-object/from16 v2, p2

    .line 427
    .line 428
    move-object/from16 v3, v19

    .line 429
    .line 430
    move-object/from16 v1, v21

    .line 431
    .line 432
    invoke-virtual {v1}, LV0/d;->a()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 433
    .line 434
    .line 435
    goto :goto_a

    .line 436
    :goto_b
    invoke-virtual {v2}, LQ0/f;->u()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    if-ne v0, v13, :cond_19

    .line 441
    .line 442
    goto :goto_c

    .line 443
    :cond_19
    move-object v0, v3

    .line 444
    :goto_c
    if-ne v0, v13, :cond_1c

    .line 445
    .line 446
    goto/16 :goto_1

    .line 447
    .line 448
    :goto_d
    invoke-virtual {v2}, LQ0/f;->B()V

    .line 449
    .line 450
    .line 451
    throw v0

    .line 452
    :cond_1a
    move-object/from16 v3, v19

    .line 453
    .line 454
    move-object/from16 v1, v21

    .line 455
    .line 456
    if-eqz v16, :cond_1c

    .line 457
    .line 458
    invoke-virtual {v1}, LV0/v;->h()V

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {p0 .. p2}, LS0/b;->w(Ljava/lang/Object;Lz0/d;)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    if-ne v0, v13, :cond_1c

    .line 466
    .line 467
    goto/16 :goto_1

    .line 468
    .line 469
    :cond_1b
    move-object/from16 v3, v19

    .line 470
    .line 471
    move-object/from16 v1, v21

    .line 472
    .line 473
    invoke-virtual {v1}, LV0/d;->a()V

    .line 474
    .line 475
    .line 476
    :cond_1c
    :goto_e
    move-object v12, v3

    .line 477
    :goto_f
    return-object v12
.end method

.method public final o()Ljava/lang/Throwable;
    .locals 2

    .line 1
    invoke-virtual {p0}, LS0/b;->l()Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, LS0/l;

    .line 8
    .line 9
    const-string v1, "Channel was closed"

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-object v0
.end method

.method public final p()J
    .locals 4

    .line 1
    sget-object v0, LS0/b;->g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide v2, 0xfffffffffffffffL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    and-long/2addr v0, v2

    .line 13
    return-wide v0
.end method

.method public final r(JZ)Z
    .locals 18

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    const/16 v0, 0x3c

    .line 4
    .line 5
    shr-long v0, p1, v0

    .line 6
    .line 7
    long-to-int v1, v0

    .line 8
    const/4 v7, 0x0

    .line 9
    if-eqz v1, :cond_22

    .line 10
    .line 11
    const/4 v8, 0x1

    .line 12
    if-eq v1, v8, :cond_22

    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    sget-object v9, LS0/b;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 16
    .line 17
    const-wide v2, 0xfffffffffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    if-eq v1, v0, :cond_13

    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    if-ne v1, v0, :cond_12

    .line 26
    .line 27
    and-long v0, p1, v2

    .line 28
    .line 29
    invoke-virtual {v6, v0, v1}, LS0/b;->g(J)LS0/j;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v2, 0x0

    .line 34
    move-object v1, v2

    .line 35
    move-object v3, v1

    .line 36
    :cond_0
    sget v4, LS0/d;->b:I

    .line 37
    .line 38
    sub-int/2addr v4, v8

    .line 39
    :goto_0
    const/4 v5, -0x1

    .line 40
    if-ge v5, v4, :cond_c

    .line 41
    .line 42
    sget v10, LS0/d;->b:I

    .line 43
    .line 44
    int-to-long v10, v10

    .line 45
    iget-wide v12, v0, LV0/v;->g:J

    .line 46
    .line 47
    mul-long v12, v12, v10

    .line 48
    .line 49
    int-to-long v10, v4

    .line 50
    add-long/2addr v12, v10

    .line 51
    :cond_1
    :goto_1
    invoke-virtual {v0, v4}, LS0/j;->k(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v10

    .line 55
    sget-object v11, LS0/d;->i:LD/j;

    .line 56
    .line 57
    if-eq v10, v11, :cond_d

    .line 58
    .line 59
    sget-object v11, LS0/d;->d:LD/j;

    .line 60
    .line 61
    iget-object v14, v0, LS0/j;->j:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 62
    .line 63
    iget-object v15, v6, LS0/b;->f:LH0/l;

    .line 64
    .line 65
    if-ne v10, v11, :cond_3

    .line 66
    .line 67
    invoke-virtual {v9, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 68
    .line 69
    .line 70
    move-result-wide v16

    .line 71
    cmp-long v11, v12, v16

    .line 72
    .line 73
    if-ltz v11, :cond_d

    .line 74
    .line 75
    sget-object v11, LS0/d;->l:LD/j;

    .line 76
    .line 77
    invoke-virtual {v0, v4, v10, v11}, LS0/j;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v10

    .line 81
    if-eqz v10, :cond_1

    .line 82
    .line 83
    if-eqz v15, :cond_2

    .line 84
    .line 85
    mul-int/lit8 v5, v4, 0x2

    .line 86
    .line 87
    invoke-virtual {v14, v5}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-static {v15, v5, v1}, LV0/a;->a(LH0/l;Ljava/lang/Object;LO/c;)LO/c;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    :cond_2
    invoke-virtual {v0, v4, v2}, LS0/j;->m(ILjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, LV0/v;->h()V

    .line 99
    .line 100
    .line 101
    goto :goto_5

    .line 102
    :cond_3
    sget-object v11, LS0/d;->e:LD/j;

    .line 103
    .line 104
    if-eq v10, v11, :cond_b

    .line 105
    .line 106
    if-nez v10, :cond_4

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_4
    instance-of v11, v10, LQ0/l0;

    .line 110
    .line 111
    if-nez v11, :cond_7

    .line 112
    .line 113
    instance-of v11, v10, LS0/s;

    .line 114
    .line 115
    if-eqz v11, :cond_5

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_5
    sget-object v11, LS0/d;->g:LD/j;

    .line 119
    .line 120
    if-eq v10, v11, :cond_d

    .line 121
    .line 122
    sget-object v14, LS0/d;->f:LD/j;

    .line 123
    .line 124
    if-ne v10, v14, :cond_6

    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_6
    if-eq v10, v11, :cond_1

    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_7
    :goto_2
    invoke-virtual {v9, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 131
    .line 132
    .line 133
    move-result-wide v16

    .line 134
    cmp-long v11, v12, v16

    .line 135
    .line 136
    if-ltz v11, :cond_d

    .line 137
    .line 138
    instance-of v11, v10, LS0/s;

    .line 139
    .line 140
    if-eqz v11, :cond_8

    .line 141
    .line 142
    move-object v11, v10

    .line 143
    check-cast v11, LS0/s;

    .line 144
    .line 145
    iget-object v11, v11, LS0/s;->a:LQ0/l0;

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_8
    move-object v11, v10

    .line 149
    check-cast v11, LQ0/l0;

    .line 150
    .line 151
    :goto_3
    sget-object v5, LS0/d;->l:LD/j;

    .line 152
    .line 153
    invoke-virtual {v0, v4, v10, v5}, LS0/j;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    if-eqz v5, :cond_a

    .line 158
    .line 159
    if-eqz v15, :cond_9

    .line 160
    .line 161
    mul-int/lit8 v5, v4, 0x2

    .line 162
    .line 163
    invoke-virtual {v14, v5}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    invoke-static {v15, v5, v1}, LV0/a;->a(LH0/l;Ljava/lang/Object;LO/c;)LO/c;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    :cond_9
    invoke-static {v3, v11}, LV0/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    invoke-virtual {v0, v4, v2}, LS0/j;->m(ILjava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0}, LV0/v;->h()V

    .line 179
    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_a
    const/4 v5, -0x1

    .line 183
    goto/16 :goto_1

    .line 184
    .line 185
    :cond_b
    :goto_4
    sget-object v5, LS0/d;->l:LD/j;

    .line 186
    .line 187
    invoke-virtual {v0, v4, v10, v5}, LS0/j;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    if-eqz v5, :cond_a

    .line 192
    .line 193
    invoke-virtual {v0}, LV0/v;->h()V

    .line 194
    .line 195
    .line 196
    :goto_5
    add-int/lit8 v4, v4, -0x1

    .line 197
    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :cond_c
    sget-object v4, LV0/d;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 201
    .line 202
    invoke-virtual {v4, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    check-cast v0, LV0/d;

    .line 207
    .line 208
    check-cast v0, LS0/j;

    .line 209
    .line 210
    if-nez v0, :cond_0

    .line 211
    .line 212
    :cond_d
    :goto_6
    if-eqz v3, :cond_f

    .line 213
    .line 214
    instance-of v0, v3, Ljava/util/ArrayList;

    .line 215
    .line 216
    if-nez v0, :cond_e

    .line 217
    .line 218
    check-cast v3, LQ0/l0;

    .line 219
    .line 220
    invoke-virtual {v6, v3, v7}, LS0/b;->x(LQ0/l0;Z)V

    .line 221
    .line 222
    .line 223
    goto :goto_8

    .line 224
    :cond_e
    check-cast v3, Ljava/util/ArrayList;

    .line 225
    .line 226
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    sub-int/2addr v0, v8

    .line 231
    const/4 v2, -0x1

    .line 232
    :goto_7
    if-ge v2, v0, :cond_f

    .line 233
    .line 234
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    check-cast v4, LQ0/l0;

    .line 239
    .line 240
    invoke-virtual {v6, v4, v7}, LS0/b;->x(LQ0/l0;Z)V

    .line 241
    .line 242
    .line 243
    add-int/lit8 v0, v0, -0x1

    .line 244
    .line 245
    goto :goto_7

    .line 246
    :cond_f
    :goto_8
    if-nez v1, :cond_11

    .line 247
    .line 248
    :cond_10
    :goto_9
    const/4 v7, 0x1

    .line 249
    goto/16 :goto_e

    .line 250
    .line 251
    :cond_11
    throw v1

    .line 252
    :cond_12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 253
    .line 254
    const-string v2, "unexpected close status: "

    .line 255
    .line 256
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 267
    .line 268
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    throw v1

    .line 276
    :cond_13
    and-long v0, p1, v2

    .line 277
    .line 278
    invoke-virtual {v6, v0, v1}, LS0/b;->g(J)LS0/j;

    .line 279
    .line 280
    .line 281
    if-eqz p3, :cond_10

    .line 282
    .line 283
    :cond_14
    :goto_a
    sget-object v0, LS0/b;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 284
    .line 285
    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    check-cast v1, LS0/j;

    .line 290
    .line 291
    invoke-virtual {v9, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 292
    .line 293
    .line 294
    move-result-wide v2

    .line 295
    invoke-virtual/range {p0 .. p0}, LS0/b;->p()J

    .line 296
    .line 297
    .line 298
    move-result-wide v4

    .line 299
    cmp-long v10, v4, v2

    .line 300
    .line 301
    if-gtz v10, :cond_15

    .line 302
    .line 303
    goto :goto_b

    .line 304
    :cond_15
    sget v4, LS0/d;->b:I

    .line 305
    .line 306
    int-to-long v4, v4

    .line 307
    div-long v10, v2, v4

    .line 308
    .line 309
    iget-wide v12, v1, LV0/v;->g:J

    .line 310
    .line 311
    cmp-long v14, v12, v10

    .line 312
    .line 313
    if-eqz v14, :cond_16

    .line 314
    .line 315
    invoke-virtual {v6, v10, v11, v1}, LS0/b;->k(JLS0/j;)LS0/j;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    if-nez v1, :cond_16

    .line 320
    .line 321
    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    check-cast v0, LS0/j;

    .line 326
    .line 327
    iget-wide v0, v0, LV0/v;->g:J

    .line 328
    .line 329
    cmp-long v2, v0, v10

    .line 330
    .line 331
    if-gez v2, :cond_14

    .line 332
    .line 333
    :goto_b
    goto :goto_9

    .line 334
    :cond_16
    invoke-virtual {v1}, LV0/d;->a()V

    .line 335
    .line 336
    .line 337
    rem-long v4, v2, v4

    .line 338
    .line 339
    long-to-int v0, v4

    .line 340
    :cond_17
    invoke-virtual {v1, v0}, LS0/j;->k(I)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v4

    .line 344
    if-eqz v4, :cond_20

    .line 345
    .line 346
    sget-object v5, LS0/d;->e:LD/j;

    .line 347
    .line 348
    if-ne v4, v5, :cond_18

    .line 349
    .line 350
    goto :goto_c

    .line 351
    :cond_18
    sget-object v0, LS0/d;->d:LD/j;

    .line 352
    .line 353
    if-ne v4, v0, :cond_19

    .line 354
    .line 355
    goto :goto_e

    .line 356
    :cond_19
    sget-object v0, LS0/d;->j:LD/j;

    .line 357
    .line 358
    if-ne v4, v0, :cond_1a

    .line 359
    .line 360
    goto :goto_d

    .line 361
    :cond_1a
    sget-object v0, LS0/d;->l:LD/j;

    .line 362
    .line 363
    if-ne v4, v0, :cond_1b

    .line 364
    .line 365
    goto :goto_d

    .line 366
    :cond_1b
    sget-object v0, LS0/d;->i:LD/j;

    .line 367
    .line 368
    if-ne v4, v0, :cond_1c

    .line 369
    .line 370
    goto :goto_d

    .line 371
    :cond_1c
    sget-object v0, LS0/d;->h:LD/j;

    .line 372
    .line 373
    if-ne v4, v0, :cond_1d

    .line 374
    .line 375
    goto :goto_d

    .line 376
    :cond_1d
    sget-object v0, LS0/d;->g:LD/j;

    .line 377
    .line 378
    if-ne v4, v0, :cond_1e

    .line 379
    .line 380
    goto :goto_e

    .line 381
    :cond_1e
    sget-object v0, LS0/d;->f:LD/j;

    .line 382
    .line 383
    if-ne v4, v0, :cond_1f

    .line 384
    .line 385
    goto :goto_d

    .line 386
    :cond_1f
    invoke-virtual {v9, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 387
    .line 388
    .line 389
    move-result-wide v0

    .line 390
    cmp-long v4, v2, v0

    .line 391
    .line 392
    if-nez v4, :cond_21

    .line 393
    .line 394
    goto :goto_e

    .line 395
    :cond_20
    :goto_c
    sget-object v5, LS0/d;->h:LD/j;

    .line 396
    .line 397
    invoke-virtual {v1, v0, v4, v5}, LS0/j;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result v4

    .line 401
    if-eqz v4, :cond_17

    .line 402
    .line 403
    invoke-virtual/range {p0 .. p0}, LS0/b;->i()V

    .line 404
    .line 405
    .line 406
    :cond_21
    :goto_d
    const-wide/16 v0, 0x1

    .line 407
    .line 408
    add-long v4, v2, v0

    .line 409
    .line 410
    sget-object v0, LS0/b;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 411
    .line 412
    move-object/from16 v1, p0

    .line 413
    .line 414
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 415
    .line 416
    .line 417
    goto/16 :goto_a

    .line 418
    .line 419
    :cond_22
    :goto_e
    return v7
.end method

.method public final s()Z
    .locals 3

    .line 1
    sget-object v0, LS0/b;->g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {p0, v0, v1, v2}, LS0/b;->r(JZ)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public t()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    sget-object v2, LS0/b;->g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 9
    .line 10
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    const/16 v4, 0x3c

    .line 15
    .line 16
    shr-long/2addr v2, v4

    .line 17
    long-to-int v3, v2

    .line 18
    const/4 v2, 0x2

    .line 19
    const/4 v4, 0x3

    .line 20
    if-eq v3, v2, :cond_1

    .line 21
    .line 22
    if-eq v3, v4, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string v3, "cancelled,"

    .line 26
    .line 27
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const-string v3, "closed,"

    .line 32
    .line 33
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v5, "capacity="

    .line 39
    .line 40
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget v5, v0, LS0/b;->e:I

    .line 44
    .line 45
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const/16 v5, 0x2c

    .line 49
    .line 50
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v3, "data=["

    .line 61
    .line 62
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    new-array v3, v4, [LS0/j;

    .line 66
    .line 67
    sget-object v4, LS0/b;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 68
    .line 69
    invoke-virtual {v4, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    const/4 v6, 0x0

    .line 74
    aput-object v4, v3, v6

    .line 75
    .line 76
    sget-object v4, LS0/b;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 77
    .line 78
    invoke-virtual {v4, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    const/4 v7, 0x1

    .line 83
    aput-object v4, v3, v7

    .line 84
    .line 85
    sget-object v4, LS0/b;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 86
    .line 87
    invoke-virtual {v4, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    aput-object v4, v3, v2

    .line 92
    .line 93
    invoke-static {v3}, Ly0/e;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    new-instance v3, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    if-eqz v4, :cond_3

    .line 111
    .line 112
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    move-object v8, v4

    .line 117
    check-cast v8, LS0/j;

    .line 118
    .line 119
    sget-object v9, LS0/d;->a:LS0/j;

    .line 120
    .line 121
    if-eq v8, v9, :cond_2

    .line 122
    .line 123
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-eqz v3, :cond_1b

    .line 136
    .line 137
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    if-nez v4, :cond_4

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_4
    move-object v4, v3

    .line 149
    check-cast v4, LS0/j;

    .line 150
    .line 151
    iget-wide v8, v4, LV0/v;->g:J

    .line 152
    .line 153
    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    move-object v10, v4

    .line 158
    check-cast v10, LS0/j;

    .line 159
    .line 160
    iget-wide v10, v10, LV0/v;->g:J

    .line 161
    .line 162
    cmp-long v12, v8, v10

    .line 163
    .line 164
    if-lez v12, :cond_6

    .line 165
    .line 166
    move-object v3, v4

    .line 167
    move-wide v8, v10

    .line 168
    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    if-nez v4, :cond_5

    .line 173
    .line 174
    :goto_2
    check-cast v3, LS0/j;

    .line 175
    .line 176
    sget-object v2, LS0/b;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 177
    .line 178
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 179
    .line 180
    .line 181
    move-result-wide v10

    .line 182
    invoke-virtual/range {p0 .. p0}, LS0/b;->p()J

    .line 183
    .line 184
    .line 185
    move-result-wide v12

    .line 186
    :goto_3
    sget v2, LS0/d;->b:I

    .line 187
    .line 188
    const/4 v4, 0x0

    .line 189
    :goto_4
    if-ge v4, v2, :cond_16

    .line 190
    .line 191
    iget-wide v8, v3, LV0/v;->g:J

    .line 192
    .line 193
    sget v14, LS0/d;->b:I

    .line 194
    .line 195
    int-to-long v14, v14

    .line 196
    mul-long v8, v8, v14

    .line 197
    .line 198
    int-to-long v14, v4

    .line 199
    add-long/2addr v8, v14

    .line 200
    cmp-long v14, v8, v12

    .line 201
    .line 202
    if-ltz v14, :cond_7

    .line 203
    .line 204
    cmp-long v15, v8, v10

    .line 205
    .line 206
    if-gez v15, :cond_17

    .line 207
    .line 208
    :cond_7
    invoke-virtual {v3, v4}, LS0/j;->k(I)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v15

    .line 212
    iget-object v6, v3, LS0/j;->j:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 213
    .line 214
    mul-int/lit8 v7, v4, 0x2

    .line 215
    .line 216
    invoke-virtual {v6, v7}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    instance-of v7, v15, LQ0/e;

    .line 221
    .line 222
    if-eqz v7, :cond_a

    .line 223
    .line 224
    cmp-long v7, v8, v10

    .line 225
    .line 226
    if-gez v7, :cond_8

    .line 227
    .line 228
    if-ltz v14, :cond_8

    .line 229
    .line 230
    const-string v7, "receive"

    .line 231
    .line 232
    goto/16 :goto_c

    .line 233
    .line 234
    :cond_8
    if-gez v14, :cond_9

    .line 235
    .line 236
    if-ltz v7, :cond_9

    .line 237
    .line 238
    const-string v7, "send"

    .line 239
    .line 240
    goto/16 :goto_c

    .line 241
    .line 242
    :cond_9
    const-string v7, "cont"

    .line 243
    .line 244
    goto/16 :goto_c

    .line 245
    .line 246
    :cond_a
    instance-of v7, v15, LS0/s;

    .line 247
    .line 248
    if-eqz v7, :cond_b

    .line 249
    .line 250
    new-instance v7, Ljava/lang/StringBuilder;

    .line 251
    .line 252
    const-string v8, "EB("

    .line 253
    .line 254
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    const/16 v8, 0x29

    .line 261
    .line 262
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v7

    .line 269
    goto :goto_c

    .line 270
    :cond_b
    sget-object v7, LS0/d;->f:LD/j;

    .line 271
    .line 272
    invoke-static {v15, v7}, LI0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v7

    .line 276
    if-eqz v7, :cond_c

    .line 277
    .line 278
    const/4 v7, 0x1

    .line 279
    goto :goto_5

    .line 280
    :cond_c
    sget-object v7, LS0/d;->g:LD/j;

    .line 281
    .line 282
    invoke-static {v15, v7}, LI0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v7

    .line 286
    :goto_5
    if-eqz v7, :cond_d

    .line 287
    .line 288
    const-string v7, "resuming_sender"

    .line 289
    .line 290
    goto :goto_c

    .line 291
    :cond_d
    if-nez v15, :cond_e

    .line 292
    .line 293
    const/4 v7, 0x1

    .line 294
    goto :goto_6

    .line 295
    :cond_e
    sget-object v7, LS0/d;->e:LD/j;

    .line 296
    .line 297
    invoke-virtual {v15, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v7

    .line 301
    :goto_6
    if-eqz v7, :cond_f

    .line 302
    .line 303
    const/4 v7, 0x1

    .line 304
    goto :goto_7

    .line 305
    :cond_f
    sget-object v7, LS0/d;->i:LD/j;

    .line 306
    .line 307
    invoke-static {v15, v7}, LI0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v7

    .line 311
    :goto_7
    if-eqz v7, :cond_10

    .line 312
    .line 313
    const/4 v7, 0x1

    .line 314
    goto :goto_8

    .line 315
    :cond_10
    sget-object v7, LS0/d;->h:LD/j;

    .line 316
    .line 317
    invoke-static {v15, v7}, LI0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v7

    .line 321
    :goto_8
    if-eqz v7, :cond_11

    .line 322
    .line 323
    const/4 v7, 0x1

    .line 324
    goto :goto_9

    .line 325
    :cond_11
    sget-object v7, LS0/d;->k:LD/j;

    .line 326
    .line 327
    invoke-static {v15, v7}, LI0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result v7

    .line 331
    :goto_9
    if-eqz v7, :cond_12

    .line 332
    .line 333
    const/4 v7, 0x1

    .line 334
    goto :goto_a

    .line 335
    :cond_12
    sget-object v7, LS0/d;->j:LD/j;

    .line 336
    .line 337
    invoke-static {v15, v7}, LI0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v7

    .line 341
    :goto_a
    if-eqz v7, :cond_13

    .line 342
    .line 343
    const/4 v7, 0x1

    .line 344
    goto :goto_b

    .line 345
    :cond_13
    sget-object v7, LS0/d;->l:LD/j;

    .line 346
    .line 347
    invoke-static {v15, v7}, LI0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v7

    .line 351
    :goto_b
    if-nez v7, :cond_15

    .line 352
    .line 353
    invoke-virtual {v15}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v7

    .line 357
    :goto_c
    if-eqz v6, :cond_14

    .line 358
    .line 359
    new-instance v8, Ljava/lang/StringBuilder;

    .line 360
    .line 361
    const-string v9, "("

    .line 362
    .line 363
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    const-string v6, "),"

    .line 376
    .line 377
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v6

    .line 384
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    goto :goto_d

    .line 388
    :cond_14
    new-instance v6, Ljava/lang/StringBuilder;

    .line 389
    .line 390
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v6

    .line 403
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    :cond_15
    :goto_d
    add-int/lit8 v4, v4, 0x1

    .line 407
    .line 408
    const/4 v6, 0x0

    .line 409
    const/4 v7, 0x1

    .line 410
    goto/16 :goto_4

    .line 411
    .line 412
    :cond_16
    invoke-virtual {v3}, LV0/d;->b()LV0/d;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    move-object v3, v2

    .line 417
    check-cast v3, LS0/j;

    .line 418
    .line 419
    if-nez v3, :cond_1a

    .line 420
    .line 421
    :cond_17
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 422
    .line 423
    .line 424
    move-result v2

    .line 425
    if-eqz v2, :cond_19

    .line 426
    .line 427
    invoke-static {v1}, LP0/j;->S(Ljava/lang/CharSequence;)I

    .line 428
    .line 429
    .line 430
    move-result v2

    .line 431
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->charAt(I)C

    .line 432
    .line 433
    .line 434
    move-result v2

    .line 435
    if-ne v2, v5, :cond_18

    .line 436
    .line 437
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 438
    .line 439
    .line 440
    move-result v2

    .line 441
    const/4 v4, 0x1

    .line 442
    sub-int/2addr v2, v4

    .line 443
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    const-string v3, "this.deleteCharAt(index)"

    .line 448
    .line 449
    invoke-static {v2, v3}, LI0/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    :cond_18
    const-string v2, "]"

    .line 453
    .line 454
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v1

    .line 461
    return-object v1

    .line 462
    :cond_19
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 463
    .line 464
    const-string v2, "Char sequence is empty."

    .line 465
    .line 466
    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    throw v1

    .line 470
    :cond_1a
    const/4 v6, 0x0

    .line 471
    const/4 v7, 0x1

    .line 472
    goto/16 :goto_3

    .line 473
    .line 474
    :cond_1b
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 475
    .line 476
    invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V

    .line 477
    .line 478
    .line 479
    throw v1
.end method

.method public final u()Z
    .locals 5

    .line 1
    sget-object v0, LS0/b;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v4, v0, v2

    .line 10
    .line 11
    if-eqz v4, :cond_1

    .line 12
    .line 13
    const-wide v2, 0x7fffffffffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    cmp-long v4, v0, v2

    .line 19
    .line 20
    if-nez v4, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 26
    :goto_1
    return v0
.end method

.method public final v(JLS0/j;)V
    .locals 5

    .line 1
    :goto_0
    iget-wide v0, p3, LV0/v;->g:J

    .line 2
    .line 3
    cmp-long v2, v0, p1

    .line 4
    .line 5
    if-gez v2, :cond_1

    .line 6
    .line 7
    invoke-virtual {p3}, LV0/d;->b()LV0/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, LS0/j;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    move-object p3, v0

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    :goto_1
    invoke-virtual {p3}, LV0/v;->c()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_3

    .line 23
    .line 24
    invoke-virtual {p3}, LV0/d;->b()LV0/d;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, LS0/j;

    .line 29
    .line 30
    if-nez p1, :cond_2

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move-object p3, p1

    .line 34
    goto :goto_1

    .line 35
    :cond_3
    :goto_2
    sget-object p1, LS0/b;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 36
    .line 37
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    check-cast p2, LV0/v;

    .line 42
    .line 43
    iget-wide v0, p2, LV0/v;->g:J

    .line 44
    .line 45
    iget-wide v2, p3, LV0/v;->g:J

    .line 46
    .line 47
    cmp-long v4, v0, v2

    .line 48
    .line 49
    if-ltz v4, :cond_4

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_4
    invoke-virtual {p3}, LV0/v;->i()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_5

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_5
    invoke-virtual {p1, p0, p2, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_7

    .line 64
    .line 65
    invoke-virtual {p2}, LV0/v;->e()Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_6

    .line 70
    .line 71
    invoke-virtual {p2}, LV0/d;->d()V

    .line 72
    .line 73
    .line 74
    :cond_6
    :goto_3
    return-void

    .line 75
    :cond_7
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    if-eq v0, p2, :cond_5

    .line 80
    .line 81
    invoke-virtual {p3}, LV0/v;->e()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    invoke-virtual {p3}, LV0/d;->d()V

    .line 88
    .line 89
    .line 90
    goto :goto_2
.end method

.method public final w(Ljava/lang/Object;Lz0/d;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LQ0/f;

    .line 2
    .line 3
    invoke-static {p2}, La/a;->x(Lz0/d;)Lz0/d;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p2}, LQ0/f;-><init>(ILz0/d;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LQ0/f;->v()V

    .line 12
    .line 13
    .line 14
    iget-object p2, p0, LS0/b;->f:LH0/l;

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-static {p2, p1, v1}, LV0/a;->a(LH0/l;Ljava/lang/Object;LO/c;)LO/c;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, LS0/b;->o()Ljava/lang/Throwable;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-static {p1, p2}, La1/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {v0, p1}, LQ0/f;->m(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p0}, LS0/b;->o()Ljava/lang/Throwable;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {v0, p1}, LQ0/f;->m(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-virtual {v0}, LQ0/f;->u()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    sget-object p2, LA0/a;->e:LA0/a;

    .line 56
    .line 57
    if-ne p1, p2, :cond_1

    .line 58
    .line 59
    return-object p1

    .line 60
    :cond_1
    sget-object p1, Lx0/g;->a:Lx0/g;

    .line 61
    .line 62
    return-object p1
.end method

.method public final x(LQ0/l0;Z)V
    .locals 2

    .line 1
    instance-of v0, p1, LQ0/e;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Lz0/d;

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, LS0/b;->m()Ljava/lang/Throwable;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, LS0/b;->o()Ljava/lang/Throwable;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    :goto_0
    invoke-static {p2}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-interface {p1, p2}, Lz0/d;->m(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    instance-of p2, p1, LS0/a;

    .line 27
    .line 28
    if-eqz p2, :cond_3

    .line 29
    .line 30
    check-cast p1, LS0/a;

    .line 31
    .line 32
    iget-object p2, p1, LS0/a;->f:LQ0/f;

    .line 33
    .line 34
    invoke-static {p2}, LI0/i;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-object v0, p1, LS0/a;->f:LQ0/f;

    .line 39
    .line 40
    sget-object v0, LS0/d;->l:LD/j;

    .line 41
    .line 42
    iput-object v0, p1, LS0/a;->e:Ljava/lang/Object;

    .line 43
    .line 44
    iget-object p1, p1, LS0/a;->g:LS0/b;

    .line 45
    .line 46
    invoke-virtual {p1}, LS0/b;->l()Ljava/lang/Throwable;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-nez p1, :cond_2

    .line 51
    .line 52
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {p2, p1}, LQ0/f;->m(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    invoke-static {p1}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p2, p1}, LQ0/f;->m(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :goto_1
    return-void

    .line 66
    :cond_3
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string v1, "Unexpected waiter: "

    .line 71
    .line 72
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw p2
.end method

.method public final y(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 4

    .line 1
    instance-of v0, p1, LS0/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>"

    .line 7
    .line 8
    invoke-static {p1, v0}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    check-cast p1, LS0/a;

    .line 12
    .line 13
    iget-object v0, p1, LS0/a;->f:LQ0/f;

    .line 14
    .line 15
    invoke-static {v0}, LI0/i;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iput-object v1, p1, LS0/a;->f:LQ0/f;

    .line 19
    .line 20
    iput-object p2, p1, LS0/a;->e:Ljava/lang/Object;

    .line 21
    .line 22
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 23
    .line 24
    iget-object p1, p1, LS0/a;->g:LS0/b;

    .line 25
    .line 26
    iget-object p1, p1, LS0/b;->f:LH0/l;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    new-instance v1, LV0/q;

    .line 31
    .line 32
    iget-object v3, v0, LQ0/f;->i:Lz0/i;

    .line 33
    .line 34
    invoke-direct {v1, p1, p2, v3}, LV0/q;-><init>(LH0/l;Ljava/lang/Object;Lz0/i;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-static {v0, v2, v1}, LS0/d;->a(LQ0/e;Ljava/lang/Object;LH0/l;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    instance-of v0, p1, LQ0/e;

    .line 43
    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>"

    .line 47
    .line 48
    invoke-static {p1, v0}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    check-cast p1, LQ0/e;

    .line 52
    .line 53
    iget-object v0, p0, LS0/b;->f:LH0/l;

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    invoke-interface {p1}, Lz0/d;->i()Lz0/i;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    new-instance v2, LV0/q;

    .line 62
    .line 63
    invoke-direct {v2, v0, p2, v1}, LV0/q;-><init>(LH0/l;Ljava/lang/Object;Lz0/i;)V

    .line 64
    .line 65
    .line 66
    move-object v1, v2

    .line 67
    :cond_2
    invoke-static {p1, p2, v1}, LS0/d;->a(LQ0/e;Ljava/lang/Object;LH0/l;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    :goto_0
    return p1

    .line 72
    :cond_3
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v1, "Unexpected receiver type: "

    .line 77
    .line 78
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p2
.end method
