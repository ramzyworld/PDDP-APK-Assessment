.class public final Lh0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lg0/e;[Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lh0/h;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-static {}, LN/b;->E()LN/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, LN/b;->g:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lk0/d;

    .line 18
    .line 19
    iget-boolean v1, v0, Lk0/d;->a:Z

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Lk0/d;->b(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {v0, p1, p2}, Lk0/d;->a(Landroid/content/Context;[Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lh0/g;)Lh0/c;
    .locals 10

    .line 1
    iget-object v1, p1, Lh0/g;->a:Lg0/e;

    .line 2
    .line 3
    iget-object v0, p1, Lh0/g;->b:Li0/a;

    .line 4
    .line 5
    iget-object v6, p1, Lh0/g;->c:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v7, p1, Lh0/g;->d:Ljava/util/List;

    .line 8
    .line 9
    new-instance v3, Lio/flutter/plugin/platform/o;

    .line 10
    .line 11
    invoke-direct {v3}, Lio/flutter/plugin/platform/o;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-boolean v4, p1, Lh0/g;->e:Z

    .line 15
    .line 16
    iget-boolean v5, p1, Lh0/g;->f:Z

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    invoke-static {}, LN/b;->E()LN/b;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object p1, p1, LN/b;->g:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lk0/d;

    .line 27
    .line 28
    iget-boolean v0, p1, Lk0/d;->a:Z

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    new-instance v0, Li0/a;

    .line 33
    .line 34
    iget-object p1, p1, Lk0/d;->d:Li0/b;

    .line 35
    .line 36
    iget-object p1, p1, Li0/b;->g:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, Ljava/lang/String;

    .line 39
    .line 40
    const-string v2, "main"

    .line 41
    .line 42
    invoke-direct {v0, p1, v2}, Li0/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    move-object p1, v0

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    .line 48
    .line 49
    const-string v0, "DartEntrypoints can only be created once a FlutterEngine is created."

    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :goto_0
    iget-object v8, p0, Lh0/h;->a:Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_3

    .line 62
    .line 63
    new-instance v9, Lh0/c;

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    move-object v0, v9

    .line 67
    invoke-direct/range {v0 .. v5}, Lh0/c;-><init>(Lg0/e;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/o;ZZ)V

    .line 68
    .line 69
    .line 70
    if-eqz v6, :cond_2

    .line 71
    .line 72
    iget-object v0, v9, Lh0/c;->i:Lp0/a;

    .line 73
    .line 74
    iget-object v0, v0, Lp0/a;->a:LN/b;

    .line 75
    .line 76
    const-string v1, "setInitialRoute"

    .line 77
    .line 78
    const/4 v2, 0x0

    .line 79
    invoke-virtual {v0, v1, v6, v2}, LN/b;->F(Ljava/lang/String;Ljava/lang/Object;Lp0/k;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    iget-object v0, v9, Lh0/c;->c:Li0/b;

    .line 83
    .line 84
    invoke-virtual {v0, p1, v7}, Li0/b;->a(Li0/a;Ljava/util/List;)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    const/4 v0, 0x0

    .line 89
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, Lh0/c;

    .line 94
    .line 95
    iget-object v0, v0, Lh0/c;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 96
    .line 97
    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_4

    .line 102
    .line 103
    iget-object v2, p1, Li0/a;->c:Ljava/lang/String;

    .line 104
    .line 105
    iget-object p1, p1, Li0/a;->b:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {v0, v2, p1, v6, v7}, Lio/flutter/embedding/engine/FlutterJNI;->spawn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/flutter/embedding/engine/FlutterJNI;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    new-instance v9, Lh0/c;

    .line 112
    .line 113
    move-object v0, v9

    .line 114
    invoke-direct/range {v0 .. v5}, Lh0/c;-><init>(Lg0/e;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/o;ZZ)V

    .line 115
    .line 116
    .line 117
    :goto_1
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    new-instance p1, Lh0/f;

    .line 121
    .line 122
    invoke-direct {p1, p0, v9}, Lh0/f;-><init>(Lh0/h;Lh0/c;)V

    .line 123
    .line 124
    .line 125
    iget-object v0, v9, Lh0/c;->s:Ljava/util/HashSet;

    .line 126
    .line 127
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    return-object v9

    .line 131
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 132
    .line 133
    const-string v0, "Spawn can only be called on a fully constructed FlutterEngine"

    .line 134
    .line 135
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw p1
.end method
