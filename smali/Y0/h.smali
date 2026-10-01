.class public LY0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile _availablePermits:I

.field public final a:LG/M;

.field private volatile deqIdx:J

.field private volatile enqIdx:J

.field private volatile head:Ljava/lang/Object;

.field private volatile tail:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "head"

    .line 2
    .line 3
    const-class v1, LY0/h;

    .line 4
    .line 5
    const-class v2, Ljava/lang/Object;

    .line 6
    .line 7
    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, LY0/h;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    const-string v0, "deqIdx"

    .line 14
    .line 15
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, LY0/h;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 20
    .line 21
    const-string v0, "tail"

    .line 22
    .line 23
    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, LY0/h;->d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 28
    .line 29
    const-string v0, "enqIdx"

    .line 30
    .line 31
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, LY0/h;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 36
    .line 37
    const-string v0, "_availablePermits"

    .line 38
    .line 39
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, LY0/h;->f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 44
    .line 45
    return-void
.end method

.method public constructor <init>(I)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-ltz p1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-gt p1, v0, :cond_0

    .line 8
    .line 9
    new-instance v1, LY0/j;

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    invoke-direct {v1, v3, v4, v5, v2}, LY0/j;-><init>(JLY0/j;I)V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, LY0/h;->head:Ljava/lang/Object;

    .line 19
    .line 20
    iput-object v1, p0, LY0/h;->tail:Ljava/lang/Object;

    .line 21
    .line 22
    sub-int/2addr v0, p1

    .line 23
    iput v0, p0, LY0/h;->_availablePermits:I

    .line 24
    .line 25
    new-instance p1, LG/M;

    .line 26
    .line 27
    const/4 v0, 0x3

    .line 28
    invoke-direct {p1, v0, p0}, LG/M;-><init>(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, LY0/h;->a:LG/M;

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 35
    .line 36
    const-string v0, "The number of acquired permits should be in 0..1"

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1
.end method


# virtual methods
.method public final a(LY0/c;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    :cond_0
    :goto_0
    sget-object v2, LY0/h;->f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 6
    .line 7
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndDecrement(Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x1

    .line 12
    if-gt v2, v3, :cond_0

    .line 13
    .line 14
    sget-object v3, Lx0/g;->a:Lx0/g;

    .line 15
    .line 16
    iget-object v4, v0, LY0/h;->a:LG/M;

    .line 17
    .line 18
    if-lez v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1, v3, v4}, LY0/c;->l(Ljava/lang/Object;LH0/l;)V

    .line 21
    .line 22
    .line 23
    goto/16 :goto_4

    .line 24
    .line 25
    :cond_1
    sget-object v2, LY0/h;->d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 26
    .line 27
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    check-cast v5, LY0/j;

    .line 32
    .line 33
    sget-object v6, LY0/h;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 34
    .line 35
    invoke-virtual {v6, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 36
    .line 37
    .line 38
    move-result-wide v6

    .line 39
    sget-object v8, LY0/f;->m:LY0/f;

    .line 40
    .line 41
    sget v9, LY0/i;->f:I

    .line 42
    .line 43
    int-to-long v9, v9

    .line 44
    div-long v9, v6, v9

    .line 45
    .line 46
    :goto_1
    invoke-static {v5, v9, v10, v8}, LV0/a;->b(LV0/v;JLH0/p;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v11

    .line 50
    invoke-static {v11}, LV0/a;->e(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v12

    .line 54
    if-nez v12, :cond_6

    .line 55
    .line 56
    invoke-static {v11}, LV0/a;->c(Ljava/lang/Object;)LV0/v;

    .line 57
    .line 58
    .line 59
    move-result-object v12

    .line 60
    :goto_2
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v13

    .line 64
    check-cast v13, LV0/v;

    .line 65
    .line 66
    iget-wide v14, v13, LV0/v;->g:J

    .line 67
    .line 68
    move-object/from16 v16, v8

    .line 69
    .line 70
    move-wide/from16 v17, v9

    .line 71
    .line 72
    iget-wide v8, v12, LV0/v;->g:J

    .line 73
    .line 74
    cmp-long v10, v14, v8

    .line 75
    .line 76
    if-ltz v10, :cond_2

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_2
    invoke-virtual {v12}, LV0/v;->i()Z

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    if-nez v8, :cond_3

    .line 84
    .line 85
    move-object/from16 v8, v16

    .line 86
    .line 87
    move-wide/from16 v9, v17

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    invoke-virtual {v2, v0, v13, v12}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-eqz v8, :cond_4

    .line 95
    .line 96
    invoke-virtual {v13}, LV0/v;->e()Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_6

    .line 101
    .line 102
    invoke-virtual {v13}, LV0/d;->d()V

    .line 103
    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_4
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    if-eq v8, v13, :cond_3

    .line 111
    .line 112
    invoke-virtual {v12}, LV0/v;->e()Z

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    if-eqz v8, :cond_5

    .line 117
    .line 118
    invoke-virtual {v12}, LV0/d;->d()V

    .line 119
    .line 120
    .line 121
    :cond_5
    move-object/from16 v8, v16

    .line 122
    .line 123
    move-wide/from16 v9, v17

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_6
    :goto_3
    invoke-static {v11}, LV0/a;->c(Ljava/lang/Object;)LV0/v;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    check-cast v2, LY0/j;

    .line 131
    .line 132
    sget v5, LY0/i;->f:I

    .line 133
    .line 134
    int-to-long v8, v5

    .line 135
    rem-long/2addr v6, v8

    .line 136
    long-to-int v5, v6

    .line 137
    iget-object v6, v2, LY0/j;->i:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 138
    .line 139
    :cond_7
    const/4 v7, 0x0

    .line 140
    invoke-virtual {v6, v5, v7, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->compareAndSet(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v7

    .line 144
    if-eqz v7, :cond_8

    .line 145
    .line 146
    invoke-interface {v1, v2, v5}, LQ0/l0;->a(LV0/v;I)V

    .line 147
    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_8
    invoke-virtual {v6, v5}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    if-eqz v7, :cond_7

    .line 155
    .line 156
    sget-object v7, LY0/i;->b:LD/j;

    .line 157
    .line 158
    sget-object v8, LY0/i;->c:LD/j;

    .line 159
    .line 160
    :cond_9
    invoke-virtual {v6, v5, v7, v8}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->compareAndSet(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-eqz v2, :cond_a

    .line 165
    .line 166
    invoke-interface {v1, v3, v4}, LQ0/e;->l(Ljava/lang/Object;LH0/l;)V

    .line 167
    .line 168
    .line 169
    :goto_4
    return-void

    .line 170
    :cond_a
    invoke-virtual {v6, v5}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    if-eq v2, v7, :cond_9

    .line 175
    .line 176
    goto/16 :goto_0
.end method

.method public final b()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    :cond_0
    sget-object v1, LY0/h;->f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndIncrement(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x1

    .line 10
    if-ge v2, v3, :cond_10

    .line 11
    .line 12
    if-ltz v2, :cond_1

    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    sget-object v1, LY0/h;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, LY0/j;

    .line 22
    .line 23
    sget-object v4, LY0/h;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 24
    .line 25
    invoke-virtual {v4, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 26
    .line 27
    .line 28
    move-result-wide v4

    .line 29
    sget v6, LY0/i;->f:I

    .line 30
    .line 31
    int-to-long v6, v6

    .line 32
    div-long v6, v4, v6

    .line 33
    .line 34
    sget-object v8, LY0/g;->m:LY0/g;

    .line 35
    .line 36
    :goto_0
    invoke-static {v2, v6, v7, v8}, LV0/a;->b(LV0/v;JLH0/p;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v9

    .line 40
    invoke-static {v9}, LV0/a;->e(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v10

    .line 44
    if-nez v10, :cond_6

    .line 45
    .line 46
    invoke-static {v9}, LV0/a;->c(Ljava/lang/Object;)LV0/v;

    .line 47
    .line 48
    .line 49
    move-result-object v10

    .line 50
    :cond_2
    :goto_1
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v11

    .line 54
    check-cast v11, LV0/v;

    .line 55
    .line 56
    iget-wide v12, v11, LV0/v;->g:J

    .line 57
    .line 58
    iget-wide v14, v10, LV0/v;->g:J

    .line 59
    .line 60
    cmp-long v16, v12, v14

    .line 61
    .line 62
    if-ltz v16, :cond_3

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    invoke-virtual {v10}, LV0/v;->i()Z

    .line 66
    .line 67
    .line 68
    move-result v12

    .line 69
    if-nez v12, :cond_4

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_4
    invoke-virtual {v1, v0, v11, v10}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v12

    .line 76
    if-eqz v12, :cond_5

    .line 77
    .line 78
    invoke-virtual {v11}, LV0/v;->e()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_6

    .line 83
    .line 84
    invoke-virtual {v11}, LV0/d;->d()V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_5
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v12

    .line 92
    if-eq v12, v11, :cond_4

    .line 93
    .line 94
    invoke-virtual {v10}, LV0/v;->e()Z

    .line 95
    .line 96
    .line 97
    move-result v11

    .line 98
    if-eqz v11, :cond_2

    .line 99
    .line 100
    invoke-virtual {v10}, LV0/d;->d()V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_6
    :goto_2
    invoke-static {v9}, LV0/a;->c(Ljava/lang/Object;)LV0/v;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    check-cast v1, LY0/j;

    .line 109
    .line 110
    invoke-virtual {v1}, LV0/d;->a()V

    .line 111
    .line 112
    .line 113
    iget-wide v8, v1, LV0/v;->g:J

    .line 114
    .line 115
    const/4 v2, 0x0

    .line 116
    cmp-long v10, v8, v6

    .line 117
    .line 118
    if-lez v10, :cond_8

    .line 119
    .line 120
    :cond_7
    :goto_3
    const/4 v3, 0x0

    .line 121
    goto :goto_6

    .line 122
    :cond_8
    sget v6, LY0/i;->f:I

    .line 123
    .line 124
    int-to-long v6, v6

    .line 125
    rem-long/2addr v4, v6

    .line 126
    long-to-int v5, v4

    .line 127
    sget-object v4, LY0/i;->b:LD/j;

    .line 128
    .line 129
    iget-object v1, v1, LY0/j;->i:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 130
    .line 131
    invoke-virtual {v1, v5, v4}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    if-nez v4, :cond_d

    .line 136
    .line 137
    sget v4, LY0/i;->a:I

    .line 138
    .line 139
    const/4 v6, 0x0

    .line 140
    :goto_4
    if-ge v6, v4, :cond_a

    .line 141
    .line 142
    invoke-virtual {v1, v5}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    sget-object v8, LY0/i;->c:LD/j;

    .line 147
    .line 148
    if-ne v7, v8, :cond_9

    .line 149
    .line 150
    goto :goto_6

    .line 151
    :cond_9
    add-int/lit8 v6, v6, 0x1

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_a
    sget-object v6, LY0/i;->b:LD/j;

    .line 155
    .line 156
    sget-object v7, LY0/i;->d:LD/j;

    .line 157
    .line 158
    :cond_b
    invoke-virtual {v1, v5, v6, v7}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->compareAndSet(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    if-eqz v4, :cond_c

    .line 163
    .line 164
    const/4 v2, 0x1

    .line 165
    goto :goto_5

    .line 166
    :cond_c
    invoke-virtual {v1, v5}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    if-eq v4, v6, :cond_b

    .line 171
    .line 172
    :goto_5
    xor-int/2addr v3, v2

    .line 173
    goto :goto_6

    .line 174
    :cond_d
    sget-object v1, LY0/i;->e:LD/j;

    .line 175
    .line 176
    if-ne v4, v1, :cond_e

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_e
    instance-of v1, v4, LQ0/e;

    .line 180
    .line 181
    if-eqz v1, :cond_f

    .line 182
    .line 183
    check-cast v4, LQ0/e;

    .line 184
    .line 185
    sget-object v1, Lx0/g;->a:Lx0/g;

    .line 186
    .line 187
    iget-object v5, v0, LY0/h;->a:LG/M;

    .line 188
    .line 189
    invoke-interface {v4, v1, v5}, LQ0/e;->e(Ljava/lang/Object;LH0/l;)LD/j;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    if-eqz v1, :cond_7

    .line 194
    .line 195
    invoke-interface {v4, v1}, LQ0/e;->o(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    :goto_6
    if-eqz v3, :cond_0

    .line 199
    .line 200
    return-void

    .line 201
    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 202
    .line 203
    new-instance v2, Ljava/lang/StringBuilder;

    .line 204
    .line 205
    const-string v3, "unexpected: "

    .line 206
    .line 207
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw v1

    .line 225
    :cond_10
    :goto_7
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    if-le v2, v3, :cond_11

    .line 230
    .line 231
    invoke-virtual {v1, v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    if-nez v2, :cond_11

    .line 236
    .line 237
    goto :goto_7

    .line 238
    :cond_11
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 239
    .line 240
    const-string v2, "The number of released permits cannot be greater than 1"

    .line 241
    .line 242
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    throw v1
.end method
