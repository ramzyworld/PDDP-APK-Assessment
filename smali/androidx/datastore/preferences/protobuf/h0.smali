.class public final Landroidx/datastore/preferences/protobuf/h0;
.super Landroidx/datastore/preferences/protobuf/i0;
.source "SourceFile"


# virtual methods
.method public final c(JLjava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/i0;->a:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-virtual {v0, p3, p1, p2}, Lsun/misc/Unsafe;->getBoolean(Ljava/lang/Object;J)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final d(JLjava/lang/Object;)D
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/i0;->a:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-virtual {v0, p3, p1, p2}, Lsun/misc/Unsafe;->getDouble(Ljava/lang/Object;J)D

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public final e(JLjava/lang/Object;)F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/i0;->a:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-virtual {v0, p3, p1, p2}, Lsun/misc/Unsafe;->getFloat(Ljava/lang/Object;J)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final j(Ljava/lang/Object;JZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/i0;->a:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Lsun/misc/Unsafe;->putBoolean(Ljava/lang/Object;JZ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final k(Ljava/lang/Object;JB)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/i0;->a:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Lsun/misc/Unsafe;->putByte(Ljava/lang/Object;JB)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final l(Ljava/lang/Object;JD)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/i0;->a:Lsun/misc/Unsafe;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    move-wide v2, p2

    .line 5
    move-wide v4, p4

    .line 6
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putDouble(Ljava/lang/Object;JD)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final m(Ljava/lang/Object;JF)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/i0;->a:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Lsun/misc/Unsafe;->putFloat(Ljava/lang/Object;JF)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final q()Z
    .locals 10

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x1

    .line 4
    const-class v3, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-super {p0}, Landroidx/datastore/preferences/protobuf/i0;->q()Z

    .line 7
    .line 8
    .line 9
    move-result v4

    .line 10
    const/4 v5, 0x0

    .line 11
    if-nez v4, :cond_0

    .line 12
    .line 13
    return v5

    .line 14
    :cond_0
    :try_start_0
    iget-object v4, p0, Landroidx/datastore/preferences/protobuf/i0;->a:Lsun/misc/Unsafe;

    .line 15
    .line 16
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    const-string v6, "getByte"

    .line 21
    .line 22
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    new-array v8, v1, [Ljava/lang/Class;

    .line 25
    .line 26
    aput-object v3, v8, v5

    .line 27
    .line 28
    aput-object v7, v8, v2

    .line 29
    .line 30
    invoke-virtual {v4, v6, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 31
    .line 32
    .line 33
    const-string v6, "putByte"

    .line 34
    .line 35
    new-array v8, v0, [Ljava/lang/Class;

    .line 36
    .line 37
    aput-object v3, v8, v5

    .line 38
    .line 39
    aput-object v7, v8, v2

    .line 40
    .line 41
    sget-object v9, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 42
    .line 43
    aput-object v9, v8, v1

    .line 44
    .line 45
    invoke-virtual {v4, v6, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 46
    .line 47
    .line 48
    const-string v6, "getBoolean"

    .line 49
    .line 50
    new-array v8, v1, [Ljava/lang/Class;

    .line 51
    .line 52
    aput-object v3, v8, v5

    .line 53
    .line 54
    aput-object v7, v8, v2

    .line 55
    .line 56
    invoke-virtual {v4, v6, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 57
    .line 58
    .line 59
    const-string v6, "putBoolean"

    .line 60
    .line 61
    new-array v8, v0, [Ljava/lang/Class;

    .line 62
    .line 63
    aput-object v3, v8, v5

    .line 64
    .line 65
    aput-object v7, v8, v2

    .line 66
    .line 67
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 68
    .line 69
    aput-object v9, v8, v1

    .line 70
    .line 71
    invoke-virtual {v4, v6, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 72
    .line 73
    .line 74
    const-string v6, "getFloat"

    .line 75
    .line 76
    new-array v8, v1, [Ljava/lang/Class;

    .line 77
    .line 78
    aput-object v3, v8, v5

    .line 79
    .line 80
    aput-object v7, v8, v2

    .line 81
    .line 82
    invoke-virtual {v4, v6, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 83
    .line 84
    .line 85
    const-string v6, "putFloat"

    .line 86
    .line 87
    new-array v8, v0, [Ljava/lang/Class;

    .line 88
    .line 89
    aput-object v3, v8, v5

    .line 90
    .line 91
    aput-object v7, v8, v2

    .line 92
    .line 93
    sget-object v9, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 94
    .line 95
    aput-object v9, v8, v1

    .line 96
    .line 97
    invoke-virtual {v4, v6, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 98
    .line 99
    .line 100
    const-string v6, "getDouble"

    .line 101
    .line 102
    new-array v8, v1, [Ljava/lang/Class;

    .line 103
    .line 104
    aput-object v3, v8, v5

    .line 105
    .line 106
    aput-object v7, v8, v2

    .line 107
    .line 108
    invoke-virtual {v4, v6, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 109
    .line 110
    .line 111
    const-string v6, "putDouble"

    .line 112
    .line 113
    new-array v0, v0, [Ljava/lang/Class;

    .line 114
    .line 115
    aput-object v3, v0, v5

    .line 116
    .line 117
    aput-object v7, v0, v2

    .line 118
    .line 119
    sget-object v3, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 120
    .line 121
    aput-object v3, v0, v1

    .line 122
    .line 123
    invoke-virtual {v4, v6, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    .line 125
    .line 126
    return v2

    .line 127
    :catchall_0
    move-exception v0

    .line 128
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/j0;->a(Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    return v5
.end method

.method public final r()Z
    .locals 12

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x1

    .line 4
    const/4 v3, 0x0

    .line 5
    const-string v4, "copyMemory"

    .line 6
    .line 7
    const-string v5, "getLong"

    .line 8
    .line 9
    const-class v6, Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v7, p0, Landroidx/datastore/preferences/protobuf/i0;->a:Lsun/misc/Unsafe;

    .line 12
    .line 13
    if-nez v7, :cond_0

    .line 14
    .line 15
    goto/16 :goto_0

    .line 16
    .line 17
    :cond_0
    :try_start_0
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v7

    .line 21
    const-string v8, "objectFieldOffset"

    .line 22
    .line 23
    new-array v9, v2, [Ljava/lang/Class;

    .line 24
    .line 25
    const-class v10, Ljava/lang/reflect/Field;

    .line 26
    .line 27
    aput-object v10, v9, v3

    .line 28
    .line 29
    invoke-virtual {v7, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 30
    .line 31
    .line 32
    sget-object v8, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 33
    .line 34
    new-array v9, v1, [Ljava/lang/Class;

    .line 35
    .line 36
    aput-object v6, v9, v3

    .line 37
    .line 38
    aput-object v8, v9, v2

    .line 39
    .line 40
    invoke-virtual {v7, v5, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 41
    .line 42
    .line 43
    invoke-static {}, Landroidx/datastore/preferences/protobuf/j0;->g()Ljava/lang/reflect/Field;

    .line 44
    .line 45
    .line 46
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 47
    if-nez v7, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :try_start_1
    iget-object v7, p0, Landroidx/datastore/preferences/protobuf/i0;->a:Lsun/misc/Unsafe;

    .line 51
    .line 52
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    const-string v9, "getByte"

    .line 57
    .line 58
    new-array v10, v2, [Ljava/lang/Class;

    .line 59
    .line 60
    aput-object v8, v10, v3

    .line 61
    .line 62
    invoke-virtual {v7, v9, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 63
    .line 64
    .line 65
    const-string v9, "putByte"

    .line 66
    .line 67
    new-array v10, v1, [Ljava/lang/Class;

    .line 68
    .line 69
    aput-object v8, v10, v3

    .line 70
    .line 71
    sget-object v11, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 72
    .line 73
    aput-object v11, v10, v2

    .line 74
    .line 75
    invoke-virtual {v7, v9, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 76
    .line 77
    .line 78
    const-string v9, "getInt"

    .line 79
    .line 80
    new-array v10, v2, [Ljava/lang/Class;

    .line 81
    .line 82
    aput-object v8, v10, v3

    .line 83
    .line 84
    invoke-virtual {v7, v9, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 85
    .line 86
    .line 87
    const-string v9, "putInt"

    .line 88
    .line 89
    new-array v10, v1, [Ljava/lang/Class;

    .line 90
    .line 91
    aput-object v8, v10, v3

    .line 92
    .line 93
    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 94
    .line 95
    aput-object v11, v10, v2

    .line 96
    .line 97
    invoke-virtual {v7, v9, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 98
    .line 99
    .line 100
    new-array v9, v2, [Ljava/lang/Class;

    .line 101
    .line 102
    aput-object v8, v9, v3

    .line 103
    .line 104
    invoke-virtual {v7, v5, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 105
    .line 106
    .line 107
    const-string v5, "putLong"

    .line 108
    .line 109
    new-array v9, v1, [Ljava/lang/Class;

    .line 110
    .line 111
    aput-object v8, v9, v3

    .line 112
    .line 113
    aput-object v8, v9, v2

    .line 114
    .line 115
    invoke-virtual {v7, v5, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 116
    .line 117
    .line 118
    new-array v5, v0, [Ljava/lang/Class;

    .line 119
    .line 120
    aput-object v8, v5, v3

    .line 121
    .line 122
    aput-object v8, v5, v2

    .line 123
    .line 124
    aput-object v8, v5, v1

    .line 125
    .line 126
    invoke-virtual {v7, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 127
    .line 128
    .line 129
    const/4 v5, 0x5

    .line 130
    new-array v5, v5, [Ljava/lang/Class;

    .line 131
    .line 132
    aput-object v6, v5, v3

    .line 133
    .line 134
    aput-object v8, v5, v2

    .line 135
    .line 136
    aput-object v6, v5, v1

    .line 137
    .line 138
    aput-object v8, v5, v0

    .line 139
    .line 140
    const/4 v0, 0x4

    .line 141
    aput-object v8, v5, v0

    .line 142
    .line 143
    invoke-virtual {v7, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 144
    .line 145
    .line 146
    return v2

    .line 147
    :catchall_0
    move-exception v0

    .line 148
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/j0;->a(Ljava/lang/Throwable;)V

    .line 149
    .line 150
    .line 151
    return v3

    .line 152
    :catchall_1
    move-exception v0

    .line 153
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/j0;->a(Ljava/lang/Throwable;)V

    .line 154
    .line 155
    .line 156
    :goto_0
    return v3
.end method
