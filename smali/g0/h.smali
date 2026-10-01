.class public final Lg0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lg0/e;

.field public b:Lh0/c;

.field public c:Lg0/q;

.field public d:Lio/flutter/plugin/platform/f;

.field public e:Lg0/g;

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Ljava/lang/Integer;

.field public final k:Lg0/f;


# direct methods
.method public constructor <init>(Lg0/e;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lg0/f;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1, p0}, Lg0/f;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lg0/h;->k:Lg0/f;

    .line 11
    .line 12
    iput-object p1, p0, Lg0/h;->a:Lg0/e;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iput-boolean p1, p0, Lg0/h;->h:Z

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(Lh0/g;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lg0/h;->a:Lg0/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/e;->b()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    :cond_0
    invoke-static {}, LN/b;->E()LN/b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, LN/b;->g:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lk0/d;

    .line 22
    .line 23
    iget-object v0, v0, Lk0/d;->d:Li0/b;

    .line 24
    .line 25
    iget-object v0, v0, Li0/b;->g:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/lang/String;

    .line 28
    .line 29
    :cond_1
    new-instance v1, Li0/a;

    .line 30
    .line 31
    iget-object v2, p0, Lg0/h;->a:Lg0/e;

    .line 32
    .line 33
    invoke-virtual {v2}, Lg0/e;->e()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-direct {v1, v0, v2}, Li0/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lg0/h;->a:Lg0/e;

    .line 41
    .line 42
    invoke-virtual {v0}, Lg0/e;->f()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    iget-object v0, p0, Lg0/h;->a:Lg0/e;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p0, v0}, Lg0/h;->d(Landroid/content/Intent;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-nez v0, :cond_2

    .line 62
    .line 63
    const-string v0, "/"

    .line 64
    .line 65
    :cond_2
    iput-object v1, p1, Lh0/g;->b:Li0/a;

    .line 66
    .line 67
    iput-object v0, p1, Lh0/g;->c:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v0, p0, Lg0/h;->a:Lg0/e;

    .line 70
    .line 71
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const-string v1, "dart_entrypoint_args"

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Ljava/util/List;

    .line 82
    .line 83
    iput-object v0, p1, Lh0/g;->d:Ljava/util/List;

    .line 84
    .line 85
    return-void
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lg0/h;->a:Lg0/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/e;->i()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lg0/h;->a:Lg0/e;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v2, "FlutterActivity "

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v2, " connection to the engine "

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v2, v0, Lg0/e;->f:Lg0/h;

    .line 30
    .line 31
    iget-object v2, v2, Lg0/h;->b:Lh0/c;

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v2, " evicted by another attaching activity"

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-string v2, "FlutterActivity"

    .line 46
    .line 47
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    iget-object v1, v0, Lg0/e;->f:Lg0/h;

    .line 51
    .line 52
    if-eqz v1, :cond_0

    .line 53
    .line 54
    invoke-virtual {v1}, Lg0/h;->e()V

    .line 55
    .line 56
    .line 57
    iget-object v0, v0, Lg0/e;->f:Lg0/h;

    .line 58
    .line 59
    invoke-virtual {v0}, Lg0/h;->f()V

    .line 60
    .line 61
    .line 62
    :cond_0
    return-void

    .line 63
    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    .line 64
    .line 65
    new-instance v1, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v2, "The internal FlutterEngine created by "

    .line 68
    .line 69
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iget-object v2, p0, Lg0/h;->a:Lg0/e;

    .line 73
    .line 74
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v2, " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine"

    .line 78
    .line 79
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    throw v0
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg0/h;->a:Lg0/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate."

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final d(Landroid/content/Intent;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lg0/h;->a:Lg0/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {v0}, Lg0/e;->g()Landroid/os/Bundle;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-string v1, "flutter_deeplinking_enabled"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x1

    .line 26
    goto :goto_0

    .line 27
    :catch_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1

    .line 41
    :cond_1
    const/4 p1, 0x0

    .line 42
    return-object p1
.end method

.method public final e()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lg0/h;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lg0/h;->e:Lg0/g;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lg0/h;->c:Lg0/q;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lg0/h;->e:Lg0/g;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, Lg0/h;->e:Lg0/g;

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lg0/h;->c:Lg0/q;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Lg0/q;->a()V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lg0/h;->c:Lg0/q;

    .line 30
    .line 31
    iget-object v1, p0, Lg0/h;->k:Lg0/f;

    .line 32
    .line 33
    iget-object v0, v0, Lg0/q;->j:Ljava/util/HashSet;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method public final f()V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lg0/h;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lg0/h;->c()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lg0/h;->a:Lg0/e;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lg0/h;->a:Lg0/e;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lg0/h;->a:Lg0/e;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v1, 0x0

    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v0, :cond_4

    .line 31
    .line 32
    iget-object v0, p0, Lg0/h;->b:Lh0/c;

    .line 33
    .line 34
    iget-object v0, v0, Lh0/c;->d:Lh0/e;

    .line 35
    .line 36
    invoke-virtual {v0}, Lh0/e;->e()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_3

    .line 41
    .line 42
    const-string v3, "FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges"

    .line 43
    .line 44
    invoke-static {v3}, Lw0/a;->b(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :try_start_0
    iput-boolean v2, v0, Lh0/e;->g:Z

    .line 48
    .line 49
    iget-object v3, v0, Lh0/e;->d:Ljava/util/HashMap;

    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_1

    .line 64
    .line 65
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    check-cast v4, Ln0/a;

    .line 70
    .line 71
    invoke-interface {v4}, Ln0/a;->e()V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    goto :goto_1

    .line 77
    :cond_1
    iget-object v3, v0, Lh0/e;->b:Lh0/c;

    .line 78
    .line 79
    iget-object v3, v3, Lh0/c;->r:Lio/flutter/plugin/platform/o;

    .line 80
    .line 81
    iget-object v4, v3, Lio/flutter/plugin/platform/o;->g:LN/Q;

    .line 82
    .line 83
    if-eqz v4, :cond_2

    .line 84
    .line 85
    iput-object v1, v4, LN/Q;->g:Ljava/lang/Object;

    .line 86
    .line 87
    :cond_2
    invoke-virtual {v3}, Lio/flutter/plugin/platform/o;->c()V

    .line 88
    .line 89
    .line 90
    iput-object v1, v3, Lio/flutter/plugin/platform/o;->g:LN/Q;

    .line 91
    .line 92
    iput-object v1, v3, Lio/flutter/plugin/platform/o;->c:Landroid/app/Activity;

    .line 93
    .line 94
    iput-object v1, v3, Lio/flutter/plugin/platform/o;->e:Lio/flutter/embedding/engine/renderer/l;

    .line 95
    .line 96
    iput-object v1, v0, Lh0/e;->e:Lg0/h;

    .line 97
    .line 98
    iput-object v1, v0, Lh0/e;->f:Lh0/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    .line 100
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :goto_1
    :try_start_1
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :catchall_1
    move-exception v1

    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    :goto_2
    throw v0

    .line 113
    :cond_3
    const-string v0, "FlutterEngineCxnRegstry"

    .line 114
    .line 115
    const-string v3, "Attempted to detach plugins from an Activity when no Activity was attached."

    .line 116
    .line 117
    invoke-static {v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_4
    iget-object v0, p0, Lg0/h;->b:Lh0/c;

    .line 122
    .line 123
    iget-object v0, v0, Lh0/c;->d:Lh0/e;

    .line 124
    .line 125
    invoke-virtual {v0}, Lh0/e;->c()V

    .line 126
    .line 127
    .line 128
    :goto_3
    iget-object v0, p0, Lg0/h;->d:Lio/flutter/plugin/platform/f;

    .line 129
    .line 130
    if-eqz v0, :cond_5

    .line 131
    .line 132
    iget-object v0, v0, Lio/flutter/plugin/platform/f;->b:LN/Q;

    .line 133
    .line 134
    iput-object v1, v0, LN/Q;->g:Ljava/lang/Object;

    .line 135
    .line 136
    iput-object v1, p0, Lg0/h;->d:Lio/flutter/plugin/platform/f;

    .line 137
    .line 138
    :cond_5
    iget-object v0, p0, Lg0/h;->a:Lg0/e;

    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    iget-object v0, p0, Lg0/h;->b:Lh0/c;

    .line 144
    .line 145
    if-eqz v0, :cond_6

    .line 146
    .line 147
    iget-object v0, v0, Lh0/c;->g:Lp0/d;

    .line 148
    .line 149
    iget-boolean v3, v0, Lp0/d;->c:Z

    .line 150
    .line 151
    invoke-virtual {v0, v2, v3}, Lp0/d;->a(IZ)V

    .line 152
    .line 153
    .line 154
    :cond_6
    iget-object v0, p0, Lg0/h;->a:Lg0/e;

    .line 155
    .line 156
    invoke-virtual {v0}, Lg0/e;->i()Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    const/4 v2, 0x0

    .line 161
    if-eqz v0, :cond_f

    .line 162
    .line 163
    iget-object v0, p0, Lg0/h;->b:Lh0/c;

    .line 164
    .line 165
    iget-object v3, v0, Lh0/c;->s:Ljava/util/HashSet;

    .line 166
    .line 167
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    if-eqz v4, :cond_7

    .line 176
    .line 177
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    check-cast v4, Lh0/b;

    .line 182
    .line 183
    invoke-interface {v4}, Lh0/b;->b()V

    .line 184
    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_7
    iget-object v3, v0, Lh0/c;->d:Lh0/e;

    .line 188
    .line 189
    invoke-virtual {v3}, Lh0/e;->d()V

    .line 190
    .line 191
    .line 192
    new-instance v4, Ljava/util/HashSet;

    .line 193
    .line 194
    iget-object v5, v3, Lh0/e;->a:Ljava/util/HashMap;

    .line 195
    .line 196
    invoke-virtual {v5}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    invoke-direct {v4, v6}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v6

    .line 211
    if-eqz v6, :cond_b

    .line 212
    .line 213
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    check-cast v6, Ljava/lang/Class;

    .line 218
    .line 219
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v7

    .line 223
    check-cast v7, Lm0/a;

    .line 224
    .line 225
    if-nez v7, :cond_8

    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_8
    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v8

    .line 232
    const-string v9, "FlutterEngineConnectionRegistry#remove "

    .line 233
    .line 234
    invoke-virtual {v9, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v8

    .line 238
    invoke-static {v8}, Lw0/a;->b(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    :try_start_2
    instance-of v8, v7, Ln0/a;

    .line 242
    .line 243
    if-eqz v8, :cond_a

    .line 244
    .line 245
    invoke-virtual {v3}, Lh0/e;->e()Z

    .line 246
    .line 247
    .line 248
    move-result v8

    .line 249
    if-eqz v8, :cond_9

    .line 250
    .line 251
    move-object v8, v7

    .line 252
    check-cast v8, Ln0/a;

    .line 253
    .line 254
    invoke-interface {v8}, Ln0/a;->d()V

    .line 255
    .line 256
    .line 257
    goto :goto_6

    .line 258
    :catchall_2
    move-exception v0

    .line 259
    goto :goto_7

    .line 260
    :cond_9
    :goto_6
    iget-object v8, v3, Lh0/e;->d:Ljava/util/HashMap;

    .line 261
    .line 262
    invoke-virtual {v8, v6}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    :cond_a
    iget-object v8, v3, Lh0/e;->c:LG/n;

    .line 266
    .line 267
    invoke-interface {v7, v8}, Lm0/a;->a(LG/n;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 271
    .line 272
    .line 273
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 274
    .line 275
    .line 276
    goto :goto_5

    .line 277
    :goto_7
    :try_start_3
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 278
    .line 279
    .line 280
    goto :goto_8

    .line 281
    :catchall_3
    move-exception v1

    .line 282
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 283
    .line 284
    .line 285
    :goto_8
    throw v0

    .line 286
    :cond_b
    invoke-virtual {v5}, Ljava/util/HashMap;->clear()V

    .line 287
    .line 288
    .line 289
    :goto_9
    iget-object v3, v0, Lh0/c;->r:Lio/flutter/plugin/platform/o;

    .line 290
    .line 291
    iget-object v4, v3, Lio/flutter/plugin/platform/o;->k:Landroid/util/SparseArray;

    .line 292
    .line 293
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    .line 294
    .line 295
    .line 296
    move-result v5

    .line 297
    if-lez v5, :cond_c

    .line 298
    .line 299
    invoke-virtual {v4, v2}, Landroid/util/SparseArray;->keyAt(I)I

    .line 300
    .line 301
    .line 302
    move-result v4

    .line 303
    iget-object v3, v3, Lio/flutter/plugin/platform/o;->v:Lio/flutter/plugin/platform/n;

    .line 304
    .line 305
    invoke-virtual {v3, v4}, Lio/flutter/plugin/platform/n;->e(I)V

    .line 306
    .line 307
    .line 308
    goto :goto_9

    .line 309
    :cond_c
    iget-object v3, v0, Lh0/c;->c:Li0/b;

    .line 310
    .line 311
    iget-object v3, v3, Li0/b;->f:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v3, Lio/flutter/embedding/engine/FlutterJNI;

    .line 314
    .line 315
    invoke-virtual {v3, v1}, Lio/flutter/embedding/engine/FlutterJNI;->setPlatformMessageHandler(Li0/k;)V

    .line 316
    .line 317
    .line 318
    iget-object v3, v0, Lh0/c;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 319
    .line 320
    iget-object v0, v0, Lh0/c;->t:Lh0/a;

    .line 321
    .line 322
    invoke-virtual {v3, v0}, Lio/flutter/embedding/engine/FlutterJNI;->removeEngineLifecycleListener(Lh0/b;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v3, v1}, Lio/flutter/embedding/engine/FlutterJNI;->setDeferredComponentManager(Lj0/a;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v3}, Lio/flutter/embedding/engine/FlutterJNI;->detachFromNativeAndReleaseResources()V

    .line 329
    .line 330
    .line 331
    invoke-static {}, LN/b;->E()LN/b;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    iget-object v0, p0, Lg0/h;->a:Lg0/e;

    .line 339
    .line 340
    invoke-virtual {v0}, Lg0/e;->d()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    if-eqz v0, :cond_e

    .line 345
    .line 346
    sget-object v0, Lh0/i;->c:Lh0/i;

    .line 347
    .line 348
    if-nez v0, :cond_d

    .line 349
    .line 350
    new-instance v0, Lh0/i;

    .line 351
    .line 352
    const/4 v3, 0x1

    .line 353
    invoke-direct {v0, v3}, Lh0/i;-><init>(I)V

    .line 354
    .line 355
    .line 356
    sput-object v0, Lh0/i;->c:Lh0/i;

    .line 357
    .line 358
    :cond_d
    sget-object v0, Lh0/i;->c:Lh0/i;

    .line 359
    .line 360
    iget-object v3, p0, Lg0/h;->a:Lg0/e;

    .line 361
    .line 362
    invoke-virtual {v3}, Lg0/e;->d()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    iget-object v0, v0, Lh0/i;->a:Ljava/util/HashMap;

    .line 367
    .line 368
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    :cond_e
    iput-object v1, p0, Lg0/h;->b:Lh0/c;

    .line 372
    .line 373
    :cond_f
    iput-boolean v2, p0, Lg0/h;->i:Z

    .line 374
    .line 375
    return-void
.end method
