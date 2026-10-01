.class public final LS0/m;
.super LS0/b;
.source "SourceFile"


# instance fields
.field public final p:I


# direct methods
.method public constructor <init>(IILH0/l;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p3}, LS0/b;-><init>(ILH0/l;)V

    .line 2
    .line 3
    .line 4
    iput p2, p0, LS0/m;->p:I

    .line 5
    .line 6
    const/4 p3, 0x1

    .line 7
    if-eq p2, p3, :cond_1

    .line 8
    .line 9
    if-lt p1, p3, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string p3, "Buffered channel capacity must be at least 1, but "

    .line 15
    .line 16
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string p1, " was specified"

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p2

    .line 41
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string p2, "This implementation does not support suspension for senders, use "

    .line 44
    .line 45
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-class p2, LS0/b;

    .line 49
    .line 50
    invoke-static {p2}, LI0/q;->a(Ljava/lang/Class;)LI0/e;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p2}, LI0/e;->b()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string p2, " instead"

    .line 62
    .line 63
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p2
.end method


# virtual methods
.method public final D(Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    sget-object v9, Lx0/g;->a:Lx0/g;

    .line 4
    .line 5
    iget v0, v8, LS0/m;->p:I

    .line 6
    .line 7
    const/4 v10, 0x3

    .line 8
    const/4 v11, 0x0

    .line 9
    if-ne v0, v10, :cond_3

    .line 10
    .line 11
    invoke-super/range {p0 .. p1}, LS0/b;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    instance-of v1, v0, LS0/h;

    .line 16
    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    instance-of v1, v0, LS0/g;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    if-eqz p2, :cond_10

    .line 25
    .line 26
    iget-object v0, v8, LS0/b;->f:LH0/l;

    .line 27
    .line 28
    if-eqz v0, :cond_10

    .line 29
    .line 30
    move-object/from16 v12, p1

    .line 31
    .line 32
    invoke-static {v0, v12, v11}, LV0/a;->a(LH0/l;Ljava/lang/Object;LO/c;)LO/c;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    goto/16 :goto_6

    .line 39
    .line 40
    :cond_1
    throw v0

    .line 41
    :cond_2
    :goto_0
    move-object v9, v0

    .line 42
    goto/16 :goto_6

    .line 43
    .line 44
    :cond_3
    move-object/from16 v12, p1

    .line 45
    .line 46
    sget-object v13, LS0/d;->d:LD/j;

    .line 47
    .line 48
    sget-object v0, LS0/b;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 49
    .line 50
    invoke-virtual {v0, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, LS0/j;

    .line 55
    .line 56
    :goto_1
    sget-object v1, LS0/b;->g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 57
    .line 58
    invoke-virtual {v1, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 59
    .line 60
    .line 61
    move-result-wide v1

    .line 62
    const-wide v3, 0xfffffffffffffffL

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    and-long v14, v1, v3

    .line 68
    .line 69
    const/4 v3, 0x0

    .line 70
    invoke-virtual {v8, v1, v2, v3}, LS0/b;->r(JZ)Z

    .line 71
    .line 72
    .line 73
    move-result v16

    .line 74
    sget v7, LS0/d;->b:I

    .line 75
    .line 76
    int-to-long v4, v7

    .line 77
    div-long v1, v14, v4

    .line 78
    .line 79
    rem-long v11, v14, v4

    .line 80
    .line 81
    long-to-int v12, v11

    .line 82
    iget-wide v10, v0, LV0/v;->g:J

    .line 83
    .line 84
    cmp-long v3, v10, v1

    .line 85
    .line 86
    if-eqz v3, :cond_6

    .line 87
    .line 88
    invoke-static {v8, v1, v2, v0}, LS0/b;->b(LS0/b;JLS0/j;)LS0/j;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    if-nez v1, :cond_5

    .line 93
    .line 94
    if-eqz v16, :cond_4

    .line 95
    .line 96
    invoke-virtual/range {p0 .. p0}, LS0/b;->o()Ljava/lang/Throwable;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    new-instance v9, LS0/g;

    .line 101
    .line 102
    invoke-direct {v9, v0}, LS0/g;-><init>(Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    goto/16 :goto_6

    .line 106
    .line 107
    :cond_4
    move-object/from16 v12, p1

    .line 108
    .line 109
    :goto_2
    const/4 v10, 0x3

    .line 110
    const/4 v11, 0x0

    .line 111
    goto :goto_1

    .line 112
    :cond_5
    move-object v10, v1

    .line 113
    goto :goto_3

    .line 114
    :cond_6
    move-object v10, v0

    .line 115
    :goto_3
    move-object/from16 v0, p0

    .line 116
    .line 117
    move-object v1, v10

    .line 118
    move v2, v12

    .line 119
    move-object/from16 v3, p1

    .line 120
    .line 121
    move-wide/from16 v17, v4

    .line 122
    .line 123
    move-wide v4, v14

    .line 124
    move-object v6, v13

    .line 125
    move v11, v7

    .line 126
    move/from16 v7, v16

    .line 127
    .line 128
    invoke-static/range {v0 .. v7}, LS0/b;->d(LS0/b;LS0/j;ILjava/lang/Object;JLjava/lang/Object;Z)I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_f

    .line 133
    .line 134
    const/4 v1, 0x1

    .line 135
    if-eq v0, v1, :cond_10

    .line 136
    .line 137
    const/4 v1, 0x2

    .line 138
    if-eq v0, v1, :cond_b

    .line 139
    .line 140
    const/4 v1, 0x3

    .line 141
    if-eq v0, v1, :cond_a

    .line 142
    .line 143
    const/4 v2, 0x4

    .line 144
    if-eq v0, v2, :cond_8

    .line 145
    .line 146
    const/4 v2, 0x5

    .line 147
    if-eq v0, v2, :cond_7

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_7
    invoke-virtual {v10}, LV0/d;->a()V

    .line 151
    .line 152
    .line 153
    :goto_4
    move-object/from16 v12, p1

    .line 154
    .line 155
    move-object v0, v10

    .line 156
    goto :goto_2

    .line 157
    :cond_8
    sget-object v0, LS0/b;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 158
    .line 159
    invoke-virtual {v0, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 160
    .line 161
    .line 162
    move-result-wide v0

    .line 163
    cmp-long v2, v14, v0

    .line 164
    .line 165
    if-gez v2, :cond_9

    .line 166
    .line 167
    invoke-virtual {v10}, LV0/d;->a()V

    .line 168
    .line 169
    .line 170
    :cond_9
    invoke-virtual/range {p0 .. p0}, LS0/b;->o()Ljava/lang/Throwable;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    new-instance v9, LS0/g;

    .line 175
    .line 176
    invoke-direct {v9, v0}, LS0/g;-><init>(Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    goto :goto_6

    .line 180
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 181
    .line 182
    const-string v1, "unexpected"

    .line 183
    .line 184
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw v0

    .line 188
    :cond_b
    if-eqz v16, :cond_c

    .line 189
    .line 190
    invoke-virtual {v10}, LV0/v;->h()V

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {p0 .. p0}, LS0/b;->o()Ljava/lang/Throwable;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    new-instance v9, LS0/g;

    .line 198
    .line 199
    invoke-direct {v9, v0}, LS0/g;-><init>(Ljava/lang/Throwable;)V

    .line 200
    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_c
    instance-of v0, v13, LQ0/l0;

    .line 204
    .line 205
    if-eqz v0, :cond_d

    .line 206
    .line 207
    move-object v0, v13

    .line 208
    check-cast v0, LQ0/l0;

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_d
    const/4 v0, 0x0

    .line 212
    :goto_5
    if-eqz v0, :cond_e

    .line 213
    .line 214
    add-int v7, v12, v11

    .line 215
    .line 216
    invoke-interface {v0, v10, v7}, LQ0/l0;->a(LV0/v;I)V

    .line 217
    .line 218
    .line 219
    :cond_e
    iget-wide v0, v10, LV0/v;->g:J

    .line 220
    .line 221
    mul-long v0, v0, v17

    .line 222
    .line 223
    int-to-long v2, v12

    .line 224
    add-long/2addr v0, v2

    .line 225
    invoke-virtual {v8, v0, v1}, LS0/b;->h(J)V

    .line 226
    .line 227
    .line 228
    goto :goto_6

    .line 229
    :cond_f
    invoke-virtual {v10}, LV0/d;->a()V

    .line 230
    .line 231
    .line 232
    :cond_10
    :goto_6
    return-object v9
.end method

.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, LS0/m;->D(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public final n(Ljava/lang/Object;Lz0/d;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 p2, 0x1

    .line 2
    invoke-virtual {p0, p1, p2}, LS0/m;->D(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p2

    .line 6
    instance-of p2, p2, LS0/g;

    .line 7
    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    iget-object p2, p0, LS0/b;->f:LH0/l;

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-static {p2, p1, v0}, LV0/a;->a(LH0/l;Ljava/lang/Object;LO/c;)LO/c;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, LS0/b;->o()Ljava/lang/Throwable;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-static {p1, p2}, La1/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_0
    invoke-virtual {p0}, LS0/b;->o()Ljava/lang/Throwable;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    throw p1

    .line 34
    :cond_1
    sget-object p1, Lx0/g;->a:Lx0/g;

    .line 35
    .line 36
    return-object p1
.end method

.method public final t()Z
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    iget v1, p0, LS0/m;->p:I

    .line 3
    .line 4
    if-ne v1, v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    return v0
.end method
