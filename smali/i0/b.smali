.class public final Li0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq0/f;


# instance fields
.field public e:Z

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lio/flutter/embedding/engine/FlutterJNI;Landroid/content/res/AssetManager;)V
    .locals 3

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Li0/b;->e:Z

    .line 9
    new-instance v0, LD/j;

    const/16 v1, 0x15

    invoke-direct {v0, v1, p0}, LD/j;-><init>(ILjava/lang/Object;)V

    .line 10
    iput-object p1, p0, Li0/b;->f:Ljava/lang/Object;

    .line 11
    iput-object p2, p0, Li0/b;->g:Ljava/lang/Object;

    .line 12
    new-instance p2, Li0/j;

    invoke-direct {p2, p1}, Li0/j;-><init>(Lio/flutter/embedding/engine/FlutterJNI;)V

    iput-object p2, p0, Li0/b;->h:Ljava/lang/Object;

    .line 13
    const-string v1, "flutter/isolate"

    const/4 v2, 0x0

    invoke-virtual {p2, v1, v0, v2}, Li0/j;->e(Ljava/lang/String;Lq0/d;LH/a;)V

    .line 14
    new-instance v0, LD/j;

    const/16 v1, 0x16

    invoke-direct {v0, v1, p2}, LD/j;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Li0/b;->i:Ljava/lang/Object;

    .line 15
    invoke-virtual {p1}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Li0/b;->e:Z

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    .line 2
    const-string p1, "libapp.so"

    :cond_0
    iput-object p1, p0, Li0/b;->f:Ljava/lang/Object;

    if-nez p2, :cond_1

    .line 3
    const-string p2, "flutter_assets"

    :cond_1
    iput-object p2, p0, Li0/b;->g:Ljava/lang/Object;

    .line 4
    iput-object p4, p0, Li0/b;->i:Ljava/lang/Object;

    if-nez p3, :cond_2

    .line 5
    const-string p3, ""

    :cond_2
    iput-object p3, p0, Li0/b;->h:Ljava/lang/Object;

    .line 6
    iput-boolean p5, p0, Li0/b;->e:Z

    return-void
.end method


# virtual methods
.method public a(Li0/a;Ljava/util/List;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Li0/b;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string p1, "DartExecutor"

    .line 6
    .line 7
    const-string p2, "Attempted to run a DartExecutor that is already running."

    .line 8
    .line 9
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string v0, "DartExecutor#executeDartEntrypoint"

    .line 14
    .line 15
    invoke-static {v0}, Lw0/a;->b(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :try_start_0
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Li0/b;->f:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v1, v0

    .line 24
    check-cast v1, Lio/flutter/embedding/engine/FlutterJNI;

    .line 25
    .line 26
    iget-object v2, p1, Li0/a;->a:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v3, p1, Li0/a;->c:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v4, p1, Li0/a;->b:Ljava/lang/String;

    .line 31
    .line 32
    iget-object p1, p0, Li0/b;->g:Ljava/lang/Object;

    .line 33
    .line 34
    move-object v5, p1

    .line 35
    check-cast v5, Landroid/content/res/AssetManager;

    .line 36
    .line 37
    move-object v6, p2

    .line 38
    invoke-virtual/range {v1 .. v6}, Lio/flutter/embedding/engine/FlutterJNI;->runBundleAndSnapshotFromLibrary(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;Ljava/util/List;)V

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    iput-boolean p1, p0, Li0/b;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    :try_start_1
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_1
    move-exception p2

    .line 54
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    :goto_0
    throw p1
.end method

.method public e(Ljava/lang/String;Lq0/d;LH/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li0/b;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LD/j;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, LD/j;->e(Ljava/lang/String;Lq0/d;LH/a;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public f(Ljava/lang/String;Lq0/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li0/b;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LD/j;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, LD/j;->f(Ljava/lang/String;Lq0/d;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public m()LH/a;
    .locals 2

    .line 1
    new-instance v0, Lq0/i;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Li0/b;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, LD/j;

    .line 9
    .line 10
    iget-object v1, v1, LD/j;->f:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Li0/j;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Li0/j;->b(Lq0/i;)LH/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public n(Ljava/lang/String;Ljava/nio/ByteBuffer;Lq0/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li0/b;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LD/j;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, LD/j;->n(Ljava/lang/String;Ljava/nio/ByteBuffer;Lq0/e;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
