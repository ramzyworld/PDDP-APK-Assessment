.class public final Lh0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/HashMap;

.field public final b:Lh0/c;

.field public final c:LG/n;

.field public final d:Ljava/util/HashMap;

.field public e:Lg0/h;

.field public f:Lh0/d;

.field public g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lh0/c;Lk0/d;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lh0/e;->a:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lh0/e;->d:Ljava/util/HashMap;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Lh0/e;->g:Z

    .line 20
    .line 21
    new-instance v0, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v0, Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v0, Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p2, p0, Lh0/e;->b:Lh0/c;

    .line 37
    .line 38
    new-instance v0, LG/n;

    .line 39
    .line 40
    iget-object v1, p2, Lh0/c;->c:Li0/b;

    .line 41
    .line 42
    iget-object p2, p2, Lh0/c;->r:Lio/flutter/plugin/platform/o;

    .line 43
    .line 44
    iget-object p2, p2, Lio/flutter/plugin/platform/o;->a:Lio/flutter/plugin/platform/n;

    .line 45
    .line 46
    new-instance v2, LD/j;

    .line 47
    .line 48
    const/16 v3, 0x13

    .line 49
    .line 50
    invoke-direct {v2, v3, p3}, LD/j;-><init>(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {v0, p1, v1, p2, v2}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lh0/e;->c:LG/n;

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final a(Lm0/a;)V
    .locals 3

    .line 1
    const-string v0, "Attempted to register plugin ("

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "FlutterEngineConnectionRegistry#add "

    .line 12
    .line 13
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, Lw0/a;->b(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    iget-object v2, p0, Lh0/e;->a:Ljava/util/HashMap;

    .line 25
    .line 26
    :try_start_1
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    const-string v1, "FlutterEngineCxnRegstry"

    .line 33
    .line 34
    new-instance v2, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p1, ") but it was already registered with this FlutterEngine ("

    .line 43
    .line 44
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lh0/e;->b:Lh0/c;

    .line 48
    .line 49
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p1, ")."

    .line 53
    .line 54
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    .line 63
    .line 64
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :catchall_0
    move-exception p1

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Lh0/e;->c:LG/n;

    .line 81
    .line 82
    invoke-interface {p1, v0}, Lm0/a;->g(LG/n;)V

    .line 83
    .line 84
    .line 85
    instance-of v0, p1, Ln0/a;

    .line 86
    .line 87
    if-eqz v0, :cond_1

    .line 88
    .line 89
    move-object v0, p1

    .line 90
    check-cast v0, Ln0/a;

    .line 91
    .line 92
    iget-object v1, p0, Lh0/e;->d:Ljava/util/HashMap;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Lh0/e;->e()Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-eqz p1, :cond_1

    .line 106
    .line 107
    iget-object p1, p0, Lh0/e;->f:Lh0/d;

    .line 108
    .line 109
    invoke-interface {v0, p1}, Ln0/a;->b(Lh0/d;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 110
    .line 111
    .line 112
    :cond_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :goto_0
    :try_start_3
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :catchall_1
    move-exception v0

    .line 121
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    :goto_1
    throw p1
.end method

.method public final b(Lg0/e;Landroidx/lifecycle/n;)V
    .locals 3

    .line 1
    new-instance v0, Lh0/d;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lh0/d;-><init>(Lg0/e;Landroidx/lifecycle/n;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lh0/e;->f:Lh0/d;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    const/4 v0, 0x0

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    const-string v1, "enable-software-rendering"

    .line 20
    .line 21
    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p2, 0x0

    .line 27
    :goto_0
    iget-object v1, p0, Lh0/e;->b:Lh0/c;

    .line 28
    .line 29
    iget-object v2, v1, Lh0/c;->r:Lio/flutter/plugin/platform/o;

    .line 30
    .line 31
    iput-boolean p2, v2, Lio/flutter/plugin/platform/o;->u:Z

    .line 32
    .line 33
    iget-object p2, v2, Lio/flutter/plugin/platform/o;->c:Landroid/app/Activity;

    .line 34
    .line 35
    if-nez p2, :cond_3

    .line 36
    .line 37
    iput-object p1, v2, Lio/flutter/plugin/platform/o;->c:Landroid/app/Activity;

    .line 38
    .line 39
    iget-object p1, v1, Lh0/c;->b:Lio/flutter/embedding/engine/renderer/l;

    .line 40
    .line 41
    iput-object p1, v2, Lio/flutter/plugin/platform/o;->e:Lio/flutter/embedding/engine/renderer/l;

    .line 42
    .line 43
    new-instance p1, LN/Q;

    .line 44
    .line 45
    iget-object p2, v1, Lh0/c;->c:Li0/b;

    .line 46
    .line 47
    const/16 v1, 0xf

    .line 48
    .line 49
    invoke-direct {p1, p2, v1}, LN/Q;-><init>(Li0/b;I)V

    .line 50
    .line 51
    .line 52
    iput-object p1, v2, Lio/flutter/plugin/platform/o;->g:LN/Q;

    .line 53
    .line 54
    iget-object p2, v2, Lio/flutter/plugin/platform/o;->v:Lio/flutter/plugin/platform/n;

    .line 55
    .line 56
    iput-object p2, p1, LN/Q;->g:Ljava/lang/Object;

    .line 57
    .line 58
    iget-object p1, p0, Lh0/e;->d:Ljava/util/HashMap;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-eqz p2, :cond_2

    .line 73
    .line 74
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    check-cast p2, Ln0/a;

    .line 79
    .line 80
    iget-boolean v1, p0, Lh0/e;->g:Z

    .line 81
    .line 82
    if-eqz v1, :cond_1

    .line 83
    .line 84
    iget-object v1, p0, Lh0/e;->f:Lh0/d;

    .line 85
    .line 86
    invoke-interface {p2, v1}, Ln0/a;->c(Lh0/d;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    iget-object v1, p0, Lh0/e;->f:Lh0/d;

    .line 91
    .line 92
    invoke-interface {p2, v1}, Ln0/a;->b(Lh0/d;)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_2
    iput-boolean v0, p0, Lh0/e;->g:Z

    .line 97
    .line 98
    return-void

    .line 99
    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    .line 100
    .line 101
    const-string p2, "A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached."

    .line 102
    .line 103
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    throw p1
.end method

.method public final c()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lh0/e;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    const-string v0, "FlutterEngineConnectionRegistry#detachFromActivity"

    .line 8
    .line 9
    invoke-static {v0}, Lw0/a;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :try_start_0
    iget-object v0, p0, Lh0/e;->d:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ln0/a;

    .line 33
    .line 34
    invoke-interface {v1}, Ln0/a;->d()V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    iget-object v0, p0, Lh0/e;->b:Lh0/c;

    .line 41
    .line 42
    iget-object v0, v0, Lh0/c;->r:Lio/flutter/plugin/platform/o;

    .line 43
    .line 44
    iget-object v1, v0, Lio/flutter/plugin/platform/o;->g:LN/Q;

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    iput-object v2, v1, LN/Q;->g:Ljava/lang/Object;

    .line 50
    .line 51
    :cond_1
    invoke-virtual {v0}, Lio/flutter/plugin/platform/o;->c()V

    .line 52
    .line 53
    .line 54
    iput-object v2, v0, Lio/flutter/plugin/platform/o;->g:LN/Q;

    .line 55
    .line 56
    iput-object v2, v0, Lio/flutter/plugin/platform/o;->c:Landroid/app/Activity;

    .line 57
    .line 58
    iput-object v2, v0, Lio/flutter/plugin/platform/o;->e:Lio/flutter/embedding/engine/renderer/l;

    .line 59
    .line 60
    iput-object v2, p0, Lh0/e;->e:Lg0/h;

    .line 61
    .line 62
    iput-object v2, p0, Lh0/e;->f:Lh0/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 65
    .line 66
    .line 67
    goto :goto_3

    .line 68
    :goto_1
    :try_start_1
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :catchall_1
    move-exception v1

    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    :goto_2
    throw v0

    .line 77
    :cond_2
    const-string v0, "FlutterEngineCxnRegstry"

    .line 78
    .line 79
    const-string v1, "Attempted to detach plugins from an Activity when no Activity was attached."

    .line 80
    .line 81
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    :goto_3
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh0/e;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lh0/e;->c()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh0/e;->e:Lg0/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    return v0
.end method
