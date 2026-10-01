.class public abstract LB0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/d;
.implements LB0/c;
.implements Ljava/io/Serializable;


# instance fields
.field public final e:Lz0/d;

.field public final f:Lz0/i;

.field public transient g:Lz0/d;


# direct methods
.method public constructor <init>(Lz0/d;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 4
    invoke-interface {p1}, Lz0/d;->i()Lz0/i;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, p1, v0}, LB0/b;-><init>(Lz0/d;Lz0/i;)V

    return-void
.end method

.method public constructor <init>(Lz0/d;Lz0/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LB0/b;->e:Lz0/d;

    .line 3
    iput-object p2, p0, LB0/b;->f:Lz0/i;

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;Lz0/d;)Lz0/d;
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p2, "create(Any?;Continuation) has not been overridden"

    .line 4
    .line 5
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public d()Ljava/lang/StackTraceElement;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, LB0/d;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, LB0/d;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto/16 :goto_b

    .line 17
    .line 18
    :cond_0
    invoke-interface {v0}, LB0/d;->v()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x1

    .line 23
    if-gt v2, v3, :cond_d

    .line 24
    .line 25
    const/4 v2, -0x1

    .line 26
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const-string v5, "label"

    .line 31
    .line 32
    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v4, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    instance-of v5, v4, Ljava/lang/Integer;

    .line 44
    .line 45
    if-eqz v5, :cond_1

    .line 46
    .line 47
    check-cast v4, Ljava/lang/Integer;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catch_0
    nop

    .line 51
    goto :goto_2

    .line 52
    :cond_1
    move-object v4, v1

    .line 53
    :goto_0
    if-eqz v4, :cond_2

    .line 54
    .line 55
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    const/4 v4, 0x0

    .line 61
    :goto_1
    sub-int/2addr v4, v3

    .line 62
    goto :goto_3

    .line 63
    :goto_2
    const/4 v4, -0x1

    .line 64
    :goto_3
    if-gez v4, :cond_3

    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_3
    invoke-interface {v0}, LB0/d;->l()[I

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    aget v2, v2, v4

    .line 72
    .line 73
    :goto_4
    sget-object v3, LB0/f;->b:LB0/e;

    .line 74
    .line 75
    sget-object v4, LB0/f;->a:LB0/e;

    .line 76
    .line 77
    if-nez v3, :cond_4

    .line 78
    .line 79
    :try_start_1
    const-class v3, Ljava/lang/Class;

    .line 80
    .line 81
    const-string v5, "getModule"

    .line 82
    .line 83
    invoke-virtual {v3, v5, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    const-string v6, "java.lang.Module"

    .line 96
    .line 97
    invoke-virtual {v5, v6}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    const-string v6, "getDescriptor"

    .line 102
    .line 103
    invoke-virtual {v5, v6, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-virtual {v6}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    const-string v7, "java.lang.module.ModuleDescriptor"

    .line 116
    .line 117
    invoke-virtual {v6, v7}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    const-string v7, "name"

    .line 122
    .line 123
    invoke-virtual {v6, v7, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    new-instance v7, LB0/e;

    .line 128
    .line 129
    invoke-direct {v7, v3, v5, v6}, LB0/e;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 130
    .line 131
    .line 132
    sput-object v7, LB0/f;->b:LB0/e;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 133
    .line 134
    move-object v3, v7

    .line 135
    goto :goto_5

    .line 136
    :catch_1
    sput-object v4, LB0/f;->b:LB0/e;

    .line 137
    .line 138
    move-object v3, v4

    .line 139
    :cond_4
    :goto_5
    if-ne v3, v4, :cond_5

    .line 140
    .line 141
    goto :goto_9

    .line 142
    :cond_5
    iget-object v4, v3, LB0/e;->a:Ljava/lang/reflect/Method;

    .line 143
    .line 144
    if-eqz v4, :cond_6

    .line 145
    .line 146
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    invoke-virtual {v4, v5, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    goto :goto_6

    .line 155
    :cond_6
    move-object v4, v1

    .line 156
    :goto_6
    if-nez v4, :cond_7

    .line 157
    .line 158
    goto :goto_9

    .line 159
    :cond_7
    iget-object v5, v3, LB0/e;->b:Ljava/lang/reflect/Method;

    .line 160
    .line 161
    if-eqz v5, :cond_8

    .line 162
    .line 163
    invoke-virtual {v5, v4, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    goto :goto_7

    .line 168
    :cond_8
    move-object v4, v1

    .line 169
    :goto_7
    if-nez v4, :cond_9

    .line 170
    .line 171
    goto :goto_9

    .line 172
    :cond_9
    iget-object v3, v3, LB0/e;->c:Ljava/lang/reflect/Method;

    .line 173
    .line 174
    if-eqz v3, :cond_a

    .line 175
    .line 176
    invoke-virtual {v3, v4, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    goto :goto_8

    .line 181
    :cond_a
    move-object v3, v1

    .line 182
    :goto_8
    instance-of v4, v3, Ljava/lang/String;

    .line 183
    .line 184
    if-eqz v4, :cond_b

    .line 185
    .line 186
    move-object v1, v3

    .line 187
    check-cast v1, Ljava/lang/String;

    .line 188
    .line 189
    :cond_b
    :goto_9
    if-nez v1, :cond_c

    .line 190
    .line 191
    invoke-interface {v0}, LB0/d;->c()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    goto :goto_a

    .line 196
    :cond_c
    new-instance v3, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    const/16 v1, 0x2f

    .line 205
    .line 206
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-interface {v0}, LB0/d;->c()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    :goto_a
    new-instance v3, Ljava/lang/StackTraceElement;

    .line 221
    .line 222
    invoke-interface {v0}, LB0/d;->m()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    invoke-interface {v0}, LB0/d;->f()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-direct {v3, v1, v4, v0, v2}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 231
    .line 232
    .line 233
    move-object v1, v3

    .line 234
    :goto_b
    return-object v1

    .line 235
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 236
    .line 237
    new-instance v1, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    const-string v3, "Debug metadata version mismatch. Expected: 1, got "

    .line 240
    .line 241
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    const-string v2, ". Please update the Kotlin standard library."

    .line 248
    .line 249
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    throw v0
.end method

.method public g()LB0/c;
    .locals 2

    .line 1
    iget-object v0, p0, LB0/b;->e:Lz0/d;

    .line 2
    .line 3
    instance-of v1, v0, LB0/c;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, LB0/c;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    return-object v0
.end method

.method public i()Lz0/i;
    .locals 1

    .line 1
    iget-object v0, p0, LB0/b;->f:Lz0/i;

    .line 2
    .line 3
    invoke-static {v0}, LI0/i;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public abstract k(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final m(Ljava/lang/Object;)V
    .locals 3

    .line 1
    move-object v0, p0

    .line 2
    :goto_0
    check-cast v0, LB0/b;

    .line 3
    .line 4
    iget-object v1, v0, LB0/b;->e:Lz0/d;

    .line 5
    .line 6
    invoke-static {v1}, LI0/i;->b(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    :try_start_0
    invoke-virtual {v0, p1}, LB0/b;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget-object v2, LA0/a;->e:LA0/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    if-ne p1, v2, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    invoke-static {p1}, La/a;->l(Ljava/lang/Throwable;)Lx0/c;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :cond_0
    invoke-virtual {v0}, LB0/b;->n()V

    .line 24
    .line 25
    .line 26
    instance-of v0, v1, LB0/b;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    move-object v0, v1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-interface {v1, p1}, Lz0/d;->m(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public n()V
    .locals 4

    .line 1
    iget-object v0, p0, LB0/b;->g:Lz0/d;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    if-eq v0, p0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, LB0/b;->i()Lz0/i;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, Lz0/e;->e:Lz0/e;

    .line 12
    .line 13
    invoke-interface {v1, v2}, Lz0/i;->f(Lz0/h;)Lz0/g;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, LI0/i;->b(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    check-cast v1, Lz0/f;

    .line 21
    .line 22
    check-cast v0, LV0/h;

    .line 23
    .line 24
    :cond_0
    sget-object v1, LV0/h;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    sget-object v3, LV0/a;->d:LD/j;

    .line 31
    .line 32
    if-eq v2, v3, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    instance-of v1, v0, LQ0/f;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    check-cast v0, LQ0/f;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v0, 0x0

    .line 46
    :goto_0
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-virtual {v0}, LQ0/f;->r()V

    .line 49
    .line 50
    .line 51
    :cond_2
    sget-object v0, LB0/a;->e:LB0/a;

    .line 52
    .line 53
    iput-object v0, p0, LB0/b;->g:Lz0/d;

    .line 54
    .line 55
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Continuation at "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, LB0/b;->d()Ljava/lang/StackTraceElement;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0
.end method
