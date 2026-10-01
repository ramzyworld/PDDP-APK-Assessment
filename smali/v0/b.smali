.class public Lv0/b;
.super Lq0/n;
.source "SourceFile"


# virtual methods
.method public f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;
    .locals 5

    .line 1
    const-string v0, "buffer"

    .line 2
    .line 3
    invoke-static {p2, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, -0x7f

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    if-ne p1, v0, :cond_2

    .line 11
    .line 12
    invoke-virtual {p0, p2}, Lq0/n;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ljava/lang/Long;

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    long-to-int p2, p1

    .line 25
    invoke-static {}, Lv0/p;->values()[Lv0/p;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    array-length v0, p1

    .line 30
    :goto_0
    if-ge v1, v0, :cond_1

    .line 31
    .line 32
    aget-object v3, p1, v1

    .line 33
    .line 34
    iget v4, v3, Lv0/p;->e:I

    .line 35
    .line 36
    if-ne v4, p2, :cond_0

    .line 37
    .line 38
    move-object v2, v3

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    :goto_1
    return-object v2

    .line 44
    :cond_2
    const/16 v0, -0x7e

    .line 45
    .line 46
    if-ne p1, v0, :cond_5

    .line 47
    .line 48
    invoke-virtual {p0, p2}, Lq0/n;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Ljava/lang/Long;

    .line 53
    .line 54
    if-eqz p1, :cond_4

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 57
    .line 58
    .line 59
    move-result-wide p1

    .line 60
    long-to-int p2, p1

    .line 61
    invoke-static {}, Lv0/j;->values()[Lv0/j;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    array-length v0, p1

    .line 66
    :goto_2
    if-ge v1, v0, :cond_4

    .line 67
    .line 68
    aget-object v3, p1, v1

    .line 69
    .line 70
    iget v4, v3, Lv0/j;->e:I

    .line 71
    .line 72
    if-ne v4, p2, :cond_3

    .line 73
    .line 74
    move-object v2, v3

    .line 75
    goto :goto_3

    .line 76
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    :goto_3
    return-object v2

    .line 80
    :cond_5
    const/16 v0, -0x7d

    .line 81
    .line 82
    if-ne p1, v0, :cond_8

    .line 83
    .line 84
    invoke-virtual {p0, p2}, Lq0/n;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    check-cast p1, Ljava/lang/Long;

    .line 89
    .line 90
    if-eqz p1, :cond_7

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 93
    .line 94
    .line 95
    move-result-wide p1

    .line 96
    long-to-int p2, p1

    .line 97
    invoke-static {}, Lv0/v;->values()[Lv0/v;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    array-length v0, p1

    .line 102
    :goto_4
    if-ge v1, v0, :cond_7

    .line 103
    .line 104
    aget-object v3, p1, v1

    .line 105
    .line 106
    iget v4, v3, Lv0/v;->e:I

    .line 107
    .line 108
    if-ne v4, p2, :cond_6

    .line 109
    .line 110
    move-object v2, v3

    .line 111
    goto :goto_5

    .line 112
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_7
    :goto_5
    return-object v2

    .line 116
    :cond_8
    const/16 v0, -0x7c

    .line 117
    .line 118
    if-ne p1, v0, :cond_b

    .line 119
    .line 120
    invoke-virtual {p0, p2}, Lq0/n;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    check-cast p1, Ljava/lang/Long;

    .line 125
    .line 126
    if-eqz p1, :cond_a

    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 129
    .line 130
    .line 131
    move-result-wide p1

    .line 132
    long-to-int p2, p1

    .line 133
    invoke-static {}, Lv0/O;->values()[Lv0/O;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    array-length v0, p1

    .line 138
    :goto_6
    if-ge v1, v0, :cond_a

    .line 139
    .line 140
    aget-object v3, p1, v1

    .line 141
    .line 142
    iget v4, v3, Lv0/O;->e:I

    .line 143
    .line 144
    if-ne v4, p2, :cond_9

    .line 145
    .line 146
    move-object v2, v3

    .line 147
    goto :goto_7

    .line 148
    :cond_9
    add-int/lit8 v1, v1, 0x1

    .line 149
    .line 150
    goto :goto_6

    .line 151
    :cond_a
    :goto_7
    return-object v2

    .line 152
    :cond_b
    const/16 v0, -0x7b

    .line 153
    .line 154
    if-ne p1, v0, :cond_e

    .line 155
    .line 156
    invoke-virtual {p0, p2}, Lq0/n;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    check-cast p1, Ljava/lang/Long;

    .line 161
    .line 162
    if-eqz p1, :cond_d

    .line 163
    .line 164
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 165
    .line 166
    .line 167
    move-result-wide p1

    .line 168
    long-to-int p2, p1

    .line 169
    invoke-static {}, Lv0/u;->values()[Lv0/u;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    array-length v0, p1

    .line 174
    :goto_8
    if-ge v1, v0, :cond_d

    .line 175
    .line 176
    aget-object v3, p1, v1

    .line 177
    .line 178
    iget v4, v3, Lv0/u;->e:I

    .line 179
    .line 180
    if-ne v4, p2, :cond_c

    .line 181
    .line 182
    move-object v2, v3

    .line 183
    goto :goto_9

    .line 184
    :cond_c
    add-int/lit8 v1, v1, 0x1

    .line 185
    .line 186
    goto :goto_8

    .line 187
    :cond_d
    :goto_9
    return-object v2

    .line 188
    :cond_e
    invoke-super {p0, p1, p2}, Lq0/n;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    return-object p1
.end method

.method public k(Lq0/m;Ljava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p2, Lv0/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x81

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 8
    .line 9
    .line 10
    check-cast p2, Lv0/p;

    .line 11
    .line 12
    iget p2, p2, Lv0/p;->e:I

    .line 13
    .line 14
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-virtual {p0, p1, p2}, Lv0/b;->k(Lq0/m;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    instance-of v0, p2, Lv0/j;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    const/16 v0, 0x82

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 29
    .line 30
    .line 31
    check-cast p2, Lv0/j;

    .line 32
    .line 33
    iget p2, p2, Lv0/j;->e:I

    .line 34
    .line 35
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {p0, p1, p2}, Lv0/b;->k(Lq0/m;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    instance-of v0, p2, Lv0/v;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    const/16 v0, 0x83

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 50
    .line 51
    .line 52
    check-cast p2, Lv0/v;

    .line 53
    .line 54
    iget p2, p2, Lv0/v;->e:I

    .line 55
    .line 56
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p0, p1, p2}, Lv0/b;->k(Lq0/m;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    instance-of v0, p2, Lv0/O;

    .line 65
    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    const/16 v0, 0x84

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 71
    .line 72
    .line 73
    check-cast p2, Lv0/O;

    .line 74
    .line 75
    iget p2, p2, Lv0/O;->e:I

    .line 76
    .line 77
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-virtual {p0, p1, p2}, Lv0/b;->k(Lq0/m;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_3
    instance-of v0, p2, Lv0/u;

    .line 86
    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    const/16 v0, 0x85

    .line 90
    .line 91
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 92
    .line 93
    .line 94
    check-cast p2, Lv0/u;

    .line 95
    .line 96
    iget p2, p2, Lv0/u;->e:I

    .line 97
    .line 98
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lv0/b;->k(Lq0/m;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :catchall_0
    move-exception p1

    .line 107
    throw p1

    .line 108
    :cond_4
    invoke-super {p0, p1, p2}, Lq0/n;->k(Lq0/m;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :goto_0
    return-void
.end method
