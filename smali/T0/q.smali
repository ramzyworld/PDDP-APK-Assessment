.class public final LT0/q;
.super LU0/b;
.source "SourceFile"

# interfaces
.implements LT0/d;
.implements LT0/e;
.implements LU0/j;


# static fields
.field public static final i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile _state:Ljava/lang/Object;

.field public h:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    const-string v1, "_state"

    .line 4
    .line 5
    const-class v2, LT0/q;

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, LT0/q;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LT0/q;->_state:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lz0/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, LU0/l;->a:LD/j;

    .line 4
    .line 5
    :cond_0
    const/4 p2, 0x0

    .line 6
    invoke-virtual {p0, p2, p1}, LT0/q;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    sget-object p1, Lx0/g;->a:Lx0/g;

    .line 10
    .line 11
    return-object p1
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 10

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, LT0/q;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 3
    .line 4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-static {v1, p1}, LI0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return v2

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto/16 :goto_5

    .line 21
    .line 22
    :cond_0
    :try_start_1
    invoke-static {v1, p2}, LI0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    const/4 v1, 0x1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    monitor-exit p0

    .line 30
    return v1

    .line 31
    :cond_1
    :try_start_2
    invoke-virtual {v0, p0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget p1, p0, LT0/q;->h:I

    .line 35
    .line 36
    and-int/lit8 p2, p1, 0x1

    .line 37
    .line 38
    if-nez p2, :cond_b

    .line 39
    .line 40
    add-int/2addr p1, v1

    .line 41
    iput p1, p0, LT0/q;->h:I

    .line 42
    .line 43
    iget-object p2, p0, LU0/b;->e:[LU0/c;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 44
    .line 45
    monitor-exit p0

    .line 46
    :goto_0
    check-cast p2, [LT0/s;

    .line 47
    .line 48
    if-eqz p2, :cond_9

    .line 49
    .line 50
    array-length v0, p2

    .line 51
    const/4 v3, 0x0

    .line 52
    :goto_1
    if-ge v3, v0, :cond_9

    .line 53
    .line 54
    aget-object v4, p2, v3

    .line 55
    .line 56
    if-eqz v4, :cond_8

    .line 57
    .line 58
    :goto_2
    sget-object v5, LT0/s;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 59
    .line 60
    invoke-virtual {v5, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    if-nez v6, :cond_2

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_2
    sget-object v7, LT0/r;->b:LD/j;

    .line 68
    .line 69
    if-ne v6, v7, :cond_3

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_3
    sget-object v8, LT0/r;->a:LD/j;

    .line 73
    .line 74
    if-ne v6, v8, :cond_6

    .line 75
    .line 76
    :cond_4
    invoke-virtual {v5, v4, v6, v7}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    if-eqz v8, :cond_5

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_5
    invoke-virtual {v5, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    if-eq v8, v6, :cond_4

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_6
    invoke-virtual {v5, v4, v6, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-eqz v7, :cond_7

    .line 95
    .line 96
    check-cast v6, LQ0/f;

    .line 97
    .line 98
    sget-object v4, Lx0/g;->a:Lx0/g;

    .line 99
    .line 100
    invoke-virtual {v6, v4}, LQ0/f;->m(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_7
    invoke-virtual {v5, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    if-eq v7, v6, :cond_6

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_8
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_9
    monitor-enter p0

    .line 115
    :try_start_3
    iget p2, p0, LT0/q;->h:I

    .line 116
    .line 117
    if-ne p2, p1, :cond_a

    .line 118
    .line 119
    add-int/2addr p1, v1

    .line 120
    iput p1, p0, LT0/q;->h:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 121
    .line 122
    monitor-exit p0

    .line 123
    return v1

    .line 124
    :catchall_1
    move-exception p1

    .line 125
    goto :goto_4

    .line 126
    :cond_a
    :try_start_4
    iget-object p1, p0, LU0/b;->e:[LU0/c;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 127
    .line 128
    monitor-exit p0

    .line 129
    move v9, p2

    .line 130
    move-object p2, p1

    .line 131
    move p1, v9

    .line 132
    goto :goto_0

    .line 133
    :goto_4
    monitor-exit p0

    .line 134
    throw p1

    .line 135
    :cond_b
    add-int/lit8 p1, p1, 0x2

    .line 136
    .line 137
    :try_start_5
    iput p1, p0, LT0/q;->h:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 138
    .line 139
    monitor-exit p0

    .line 140
    return v1

    .line 141
    :goto_5
    monitor-exit p0

    .line 142
    throw p1
.end method

.method public final g(LT0/e;Lz0/d;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    instance-of v2, v0, LT0/p;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, LT0/p;

    .line 11
    .line 12
    iget v3, v2, LT0/p;->o:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, LT0/p;->o:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, LT0/p;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, LT0/p;-><init>(LT0/q;Lz0/d;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, LT0/p;->m:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, LA0/a;->e:LA0/a;

    .line 32
    .line 33
    iget v4, v2, LT0/p;->o:I

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x3

    .line 38
    const/4 v8, 0x2

    .line 39
    if-eqz v4, :cond_4

    .line 40
    .line 41
    if-eq v4, v5, :cond_3

    .line 42
    .line 43
    if-eq v4, v8, :cond_2

    .line 44
    .line 45
    if-ne v4, v7, :cond_1

    .line 46
    .line 47
    iget-object v4, v2, LT0/p;->l:Ljava/lang/Object;

    .line 48
    .line 49
    iget-object v9, v2, LT0/p;->k:LQ0/P;

    .line 50
    .line 51
    iget-object v10, v2, LT0/p;->j:LT0/s;

    .line 52
    .line 53
    iget-object v11, v2, LT0/p;->i:LT0/e;

    .line 54
    .line 55
    iget-object v12, v2, LT0/p;->h:LT0/q;

    .line 56
    .line 57
    :try_start_0
    invoke-static {v0}, La/a;->O(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    move-object v0, v4

    .line 61
    goto/16 :goto_a

    .line 62
    .line 63
    :catchall_0
    move-exception v0

    .line 64
    goto/16 :goto_b

    .line 65
    .line 66
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v0

    .line 74
    :cond_2
    iget-object v4, v2, LT0/p;->l:Ljava/lang/Object;

    .line 75
    .line 76
    iget-object v9, v2, LT0/p;->k:LQ0/P;

    .line 77
    .line 78
    iget-object v10, v2, LT0/p;->j:LT0/s;

    .line 79
    .line 80
    iget-object v11, v2, LT0/p;->i:LT0/e;

    .line 81
    .line 82
    iget-object v12, v2, LT0/p;->h:LT0/q;

    .line 83
    .line 84
    :try_start_1
    invoke-static {v0}, La/a;->O(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    .line 86
    .line 87
    goto/16 :goto_7

    .line 88
    .line 89
    :cond_3
    iget-object v10, v2, LT0/p;->j:LT0/s;

    .line 90
    .line 91
    iget-object v4, v2, LT0/p;->i:LT0/e;

    .line 92
    .line 93
    iget-object v12, v2, LT0/p;->h:LT0/q;

    .line 94
    .line 95
    :try_start_2
    invoke-static {v0}, La/a;->O(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 96
    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_4
    invoke-static {v0}, La/a;->O(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    monitor-enter p0

    .line 103
    :try_start_3
    iget-object v0, v1, LU0/b;->e:[LU0/c;

    .line 104
    .line 105
    if-nez v0, :cond_5

    .line 106
    .line 107
    new-array v0, v8, [LT0/s;

    .line 108
    .line 109
    iput-object v0, v1, LU0/b;->e:[LU0/c;

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :catchall_1
    move-exception v0

    .line 113
    goto/16 :goto_c

    .line 114
    .line 115
    :cond_5
    iget v4, v1, LU0/b;->f:I

    .line 116
    .line 117
    array-length v9, v0

    .line 118
    if-lt v4, v9, :cond_6

    .line 119
    .line 120
    array-length v4, v0

    .line 121
    mul-int/lit8 v4, v4, 0x2

    .line 122
    .line 123
    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const-string v4, "copyOf(this, newSize)"

    .line 128
    .line 129
    invoke-static {v0, v4}, LI0/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    move-object v4, v0

    .line 133
    check-cast v4, [LU0/c;

    .line 134
    .line 135
    iput-object v4, v1, LU0/b;->e:[LU0/c;

    .line 136
    .line 137
    check-cast v0, [LU0/c;

    .line 138
    .line 139
    :cond_6
    :goto_1
    iget v4, v1, LU0/b;->g:I

    .line 140
    .line 141
    :goto_2
    aget-object v9, v0, v4

    .line 142
    .line 143
    if-nez v9, :cond_7

    .line 144
    .line 145
    new-instance v9, LT0/s;

    .line 146
    .line 147
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 148
    .line 149
    .line 150
    aput-object v9, v0, v4

    .line 151
    .line 152
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 153
    .line 154
    array-length v10, v0

    .line 155
    if-lt v4, v10, :cond_8

    .line 156
    .line 157
    const/4 v4, 0x0

    .line 158
    :cond_8
    move-object v10, v9

    .line 159
    check-cast v10, LT0/s;

    .line 160
    .line 161
    sget-object v11, LT0/s;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 162
    .line 163
    invoke-virtual {v11, v10}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v12

    .line 167
    if-eqz v12, :cond_9

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_9
    sget-object v0, LT0/r;->a:LD/j;

    .line 171
    .line 172
    invoke-virtual {v11, v10, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    iput v4, v1, LU0/b;->g:I

    .line 176
    .line 177
    iget v0, v1, LU0/b;->f:I

    .line 178
    .line 179
    add-int/2addr v0, v5

    .line 180
    iput v0, v1, LU0/b;->f:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 181
    .line 182
    monitor-exit p0

    .line 183
    check-cast v9, LT0/s;

    .line 184
    .line 185
    move-object/from16 v4, p1

    .line 186
    .line 187
    move-object v12, v1

    .line 188
    move-object v10, v9

    .line 189
    :goto_3
    :try_start_4
    iget-object v0, v2, LB0/b;->f:Lz0/i;

    .line 190
    .line 191
    invoke-static {v0}, LI0/i;->b(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    sget-object v9, LQ0/t;->f:LQ0/t;

    .line 195
    .line 196
    invoke-interface {v0, v9}, Lz0/i;->f(Lz0/h;)Lz0/g;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    check-cast v0, LQ0/P;

    .line 201
    .line 202
    move-object v9, v0

    .line 203
    move-object v11, v4

    .line 204
    move-object v0, v6

    .line 205
    :goto_4
    sget-object v4, LT0/q;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 206
    .line 207
    invoke-virtual {v4, v12}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    if-eqz v9, :cond_b

    .line 212
    .line 213
    invoke-interface {v9}, LQ0/P;->b()Z

    .line 214
    .line 215
    .line 216
    move-result v13

    .line 217
    if-eqz v13, :cond_a

    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_a
    check-cast v9, LQ0/Z;

    .line 221
    .line 222
    invoke-virtual {v9}, LQ0/Z;->A()Ljava/util/concurrent/CancellationException;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    throw v0

    .line 227
    :cond_b
    :goto_5
    if-eqz v0, :cond_c

    .line 228
    .line 229
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v13

    .line 233
    if-nez v13, :cond_f

    .line 234
    .line 235
    :cond_c
    sget-object v0, LU0/l;->a:LD/j;

    .line 236
    .line 237
    if-ne v4, v0, :cond_d

    .line 238
    .line 239
    move-object v0, v6

    .line 240
    goto :goto_6

    .line 241
    :cond_d
    move-object v0, v4

    .line 242
    :goto_6
    iput-object v12, v2, LT0/p;->h:LT0/q;

    .line 243
    .line 244
    iput-object v11, v2, LT0/p;->i:LT0/e;

    .line 245
    .line 246
    iput-object v10, v2, LT0/p;->j:LT0/s;

    .line 247
    .line 248
    iput-object v9, v2, LT0/p;->k:LQ0/P;

    .line 249
    .line 250
    iput-object v4, v2, LT0/p;->l:Ljava/lang/Object;

    .line 251
    .line 252
    iput v8, v2, LT0/p;->o:I

    .line 253
    .line 254
    invoke-interface {v11, v0, v2}, LT0/e;->a(Ljava/lang/Object;Lz0/d;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    if-ne v0, v3, :cond_e

    .line 259
    .line 260
    return-object v3

    .line 261
    :cond_e
    :goto_7
    move-object v0, v4

    .line 262
    :cond_f
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    sget-object v4, LT0/r;->a:LD/j;

    .line 266
    .line 267
    sget-object v13, LT0/s;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 268
    .line 269
    invoke-virtual {v13, v10, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v13

    .line 273
    invoke-static {v13}, LI0/i;->b(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    sget-object v14, LT0/r;->b:LD/j;

    .line 277
    .line 278
    if-ne v13, v14, :cond_10

    .line 279
    .line 280
    goto :goto_4

    .line 281
    :cond_10
    iput-object v12, v2, LT0/p;->h:LT0/q;

    .line 282
    .line 283
    iput-object v11, v2, LT0/p;->i:LT0/e;

    .line 284
    .line 285
    iput-object v10, v2, LT0/p;->j:LT0/s;

    .line 286
    .line 287
    iput-object v9, v2, LT0/p;->k:LQ0/P;

    .line 288
    .line 289
    iput-object v0, v2, LT0/p;->l:Ljava/lang/Object;

    .line 290
    .line 291
    iput v7, v2, LT0/p;->o:I

    .line 292
    .line 293
    new-instance v13, LQ0/f;

    .line 294
    .line 295
    invoke-static {v2}, La/a;->x(Lz0/d;)Lz0/d;

    .line 296
    .line 297
    .line 298
    move-result-object v14

    .line 299
    invoke-direct {v13, v5, v14}, LQ0/f;-><init>(ILz0/d;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v13}, LQ0/f;->v()V

    .line 303
    .line 304
    .line 305
    :goto_8
    sget-object v14, LT0/s;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 306
    .line 307
    invoke-virtual {v14, v10, v4, v13}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v15

    .line 311
    sget-object v5, Lx0/g;->a:Lx0/g;

    .line 312
    .line 313
    if-eqz v15, :cond_11

    .line 314
    .line 315
    goto :goto_9

    .line 316
    :cond_11
    invoke-virtual {v14, v10}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v14

    .line 320
    if-eq v14, v4, :cond_14

    .line 321
    .line 322
    invoke-virtual {v13, v5}, LQ0/f;->m(Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    :goto_9
    invoke-virtual {v13}, LQ0/f;->u()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v4

    .line 329
    sget-object v13, LA0/a;->e:LA0/a;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 330
    .line 331
    if-ne v4, v13, :cond_12

    .line 332
    .line 333
    move-object v5, v4

    .line 334
    :cond_12
    if-ne v5, v3, :cond_13

    .line 335
    .line 336
    return-object v3

    .line 337
    :cond_13
    :goto_a
    const/4 v5, 0x1

    .line 338
    goto/16 :goto_4

    .line 339
    .line 340
    :cond_14
    const/4 v5, 0x1

    .line 341
    goto :goto_8

    .line 342
    :goto_b
    invoke-virtual {v12, v10}, LU0/b;->b(LT0/s;)V

    .line 343
    .line 344
    .line 345
    throw v0

    .line 346
    :goto_c
    monitor-exit p0

    .line 347
    throw v0
.end method

.method public final q(Lz0/i;II)LT0/d;
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    if-ltz p2, :cond_0

    .line 3
    .line 4
    if-ge p2, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v1, -0x2

    .line 8
    if-ne p2, v1, :cond_1

    .line 9
    .line 10
    :goto_0
    if-ne p3, v0, :cond_1

    .line 11
    .line 12
    :goto_1
    move-object v0, p0

    .line 13
    goto :goto_2

    .line 14
    :cond_1
    if-eqz p2, :cond_2

    .line 15
    .line 16
    const/4 v0, -0x3

    .line 17
    if-ne p2, v0, :cond_3

    .line 18
    .line 19
    :cond_2
    const/4 v0, 0x1

    .line 20
    if-ne p3, v0, :cond_3

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_3
    new-instance v0, LU0/h;

    .line 24
    .line 25
    invoke-direct {v0, p0, p1, p2, p3}, LU0/h;-><init>(LT0/d;Lz0/i;II)V

    .line 26
    .line 27
    .line 28
    :goto_2
    return-object v0
.end method
