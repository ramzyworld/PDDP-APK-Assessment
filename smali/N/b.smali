.class public final LN/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu0/g;
.implements LT0/d;


# static fields
.field public static i:LN/b;


# instance fields
.field public final synthetic e:I

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    iput p1, p0, LN/b;->e:I

    sparse-switch p1, :sswitch_data_0

    .line 2
    new-instance p1, LH/a;

    const/16 v0, 0xe

    .line 3
    invoke-direct {p1, v0}, LH/a;-><init>(I)V

    .line 4
    new-instance v0, LH/a;

    const/16 v1, 0xd

    .line 5
    invoke-direct {v0, v1}, LH/a;-><init>(I)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, LN/b;->g:Ljava/lang/Object;

    .line 8
    iput-object p1, p0, LN/b;->f:Ljava/lang/Object;

    .line 9
    iput-object v0, p0, LN/b;->h:Ljava/lang/Object;

    return-void

    .line 10
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object p1, p0, LN/b;->g:Ljava/lang/Object;

    return-void

    .line 12
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_1
        0x9 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(LD/j;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LN/b;->e:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, LN/b;->g:Ljava/lang/Object;

    .line 17
    new-instance p1, LN/c;

    invoke-direct {p1}, LN/c;-><init>()V

    iput-object p1, p0, LN/b;->h:Ljava/lang/Object;

    .line 18
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LN/b;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LD/j;B)V
    .locals 0

    const/4 p2, 0x2

    iput p2, p0, LN/b;->e:I

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, LN/b;->g:Ljava/lang/Object;

    .line 50
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, LN/b;->f:Ljava/lang/Object;

    .line 51
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, LN/b;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LH/a;)V
    .locals 1

    const/4 p1, 0x0

    iput p1, p0, LN/b;->e:I

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance p1, Lg0/F;

    const/16 v0, 0x1e

    invoke-direct {p1, v0}, Lg0/F;-><init>(I)V

    iput-object p1, p0, LN/b;->g:Ljava/lang/Object;

    .line 24
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LN/b;->f:Ljava/lang/Object;

    .line 25
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LN/b;->h:Ljava/lang/Object;

    .line 26
    new-instance p1, LH/a;

    const/16 v0, 0x8

    invoke-direct {p1, v0, p0}, LH/a;-><init>(ILjava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, LN/b;->e:I

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, LN/b;->g:Ljava/lang/Object;

    .line 21
    iput-object p2, p0, LN/b;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/ImageView;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, LN/b;->e:I

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, LN/b;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lg0/C;)V
    .locals 5

    const/4 v0, 0x5

    iput v0, p0, LN/b;->e:I

    const/4 v0, 0x0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, LN/b;->f:Ljava/lang/Object;

    .line 36
    iput-object p1, p0, LN/b;->h:Ljava/lang/Object;

    .line 37
    new-instance v1, Lg0/y;

    .line 38
    check-cast p1, Lg0/q;

    invoke-virtual {p1}, Lg0/q;->getBinaryMessenger()Lq0/f;

    move-result-object v2

    invoke-direct {v1, v2}, Lg0/y;-><init>(Lq0/f;)V

    new-instance v2, LN/Q;

    new-instance v3, Lp0/c;

    .line 39
    invoke-virtual {p1}, Lg0/q;->getBinaryMessenger()Lq0/f;

    move-result-object v4

    invoke-direct {v3, v4}, Lp0/c;-><init>(Lq0/f;)V

    invoke-direct {v2, v3}, LN/Q;-><init>(Lp0/c;)V

    const/4 v3, 0x2

    new-array v3, v3, [Lg0/B;

    aput-object v1, v3, v0

    const/4 v0, 0x1

    aput-object v2, v3, v0

    iput-object v3, p0, LN/b;->g:Ljava/lang/Object;

    .line 40
    new-instance v0, Lp0/b;

    invoke-virtual {p1}, Lg0/q;->getBinaryMessenger()Lq0/f;

    move-result-object p1

    invoke-direct {v0, p1}, Lp0/b;-><init>(Lq0/f;)V

    .line 41
    iput-object p0, v0, Lp0/b;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Li0/b;Lio/flutter/embedding/engine/FlutterJNI;)V
    .locals 5

    const/16 v0, 0x8

    iput v0, p0, LN/b;->e:I

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, LD/j;

    const/16 v1, 0x1d

    invoke-direct {v0, v1, p0}, LD/j;-><init>(ILjava/lang/Object;)V

    .line 29
    new-instance v1, LG/n;

    sget-object v2, Lq0/n;->a:Lq0/n;

    const/4 v3, 0x0

    .line 30
    const-string v4, "flutter/accessibility"

    invoke-direct {v1, p1, v4, v2, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    iput-object v1, p0, LN/b;->g:Ljava/lang/Object;

    .line 32
    invoke-virtual {v1, v0}, LG/n;->g(Lq0/b;)V

    .line 33
    iput-object p2, p0, LN/b;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, LN/b;->e:I

    iput-object p1, p0, LN/b;->g:Ljava/lang/Object;

    iput-object p2, p0, LN/b;->f:Ljava/lang/Object;

    iput-object p3, p0, LN/b;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lq0/f;Landroid/content/Context;LH/a;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, LN/b;->e:I

    const-string v0, "messenger"

    invoke-static {p1, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, LN/b;->g:Ljava/lang/Object;

    .line 44
    iput-object p2, p0, LN/b;->f:Ljava/lang/Object;

    .line 45
    iput-object p3, p0, LN/b;->h:Ljava/lang/Object;

    .line 46
    :try_start_0
    sget-object p2, Lu0/g;->d:Lu0/f;

    const-string p3, "shared_preferences"

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, p0, p3}, Lu0/f;->b(Lq0/f;Lu0/g;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 47
    const-string p2, "SharedPreferencesPlugin"

    const-string p3, "Received exception while setting up SharedPreferencesBackend"

    invoke-static {p2, p3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public static E()LN/b;
    .locals 5

    .line 1
    sget-object v0, LN/b;->i:LN/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LH/a;

    .line 6
    .line 7
    const/16 v1, 0xf

    .line 8
    .line 9
    invoke-direct {v0, v1}, LH/a;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lf0/a;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    iput v2, v1, Lf0/a;->a:I

    .line 19
    .line 20
    invoke-static {v1}, Ljava/util/concurrent/Executors;->newCachedThreadPool(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v3, Lk0/d;

    .line 25
    .line 26
    new-instance v4, Lio/flutter/embedding/engine/FlutterJNI;

    .line 27
    .line 28
    invoke-direct {v4}, Lio/flutter/embedding/engine/FlutterJNI;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-boolean v2, v3, Lk0/d;->a:Z

    .line 35
    .line 36
    iput-object v4, v3, Lk0/d;->e:Lio/flutter/embedding/engine/FlutterJNI;

    .line 37
    .line 38
    iput-object v1, v3, Lk0/d;->f:Ljava/util/concurrent/ExecutorService;

    .line 39
    .line 40
    new-instance v2, LN/b;

    .line 41
    .line 42
    const/4 v4, 0x4

    .line 43
    invoke-direct {v2, v4}, LN/b;-><init>(I)V

    .line 44
    .line 45
    .line 46
    iput-object v3, v2, LN/b;->g:Ljava/lang/Object;

    .line 47
    .line 48
    iput-object v0, v2, LN/b;->f:Ljava/lang/Object;

    .line 49
    .line 50
    iput-object v1, v2, LN/b;->h:Ljava/lang/Object;

    .line 51
    .line 52
    sput-object v2, LN/b;->i:LN/b;

    .line 53
    .line 54
    :cond_0
    sget-object v0, LN/b;->i:LN/b;

    .line 55
    .line 56
    return-object v0
.end method

.method public static varargs H(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-static {v0, p0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static I(Landroid/content/Context;Landroid/util/AttributeSet;[II)LN/b;
    .locals 2

    .line 1
    new-instance v0, LN/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, p1, p2, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-direct {v0, p0, p1}, LN/b;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method


# virtual methods
.method public A(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, LN/b;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LD/j;

    .line 4
    .line 5
    iget-object v0, v0, LD/j;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public B()I
    .locals 1

    .line 1
    iget-object v0, p0, LN/b;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LD/j;

    .line 4
    .line 5
    iget-object v0, v0, LD/j;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public C(Landroid/content/Context;)Ljava/io/File;
    .locals 4

    .line 1
    iget-object v0, p0, LN/b;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LH/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v0, "flutter"

    .line 9
    .line 10
    invoke-static {v0}, Ljava/lang/System;->mapLibraryName(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Ljava/io/File;

    .line 15
    .line 16
    const-string v2, "lib"

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-virtual {p1, v2, v3}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {v1, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v1
.end method

.method public D(Landroid/view/KeyEvent;)Z
    .locals 6

    .line 1
    iget-object v0, p0, LN/b;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    iget-object v0, p0, LN/b;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, [Lg0/B;

    .line 16
    .line 17
    array-length v2, v0

    .line 18
    if-lez v2, :cond_1

    .line 19
    .line 20
    new-instance v2, Lg0/A;

    .line 21
    .line 22
    invoke-direct {v2, p0, p1}, Lg0/A;-><init>(LN/b;Landroid/view/KeyEvent;)V

    .line 23
    .line 24
    .line 25
    array-length v3, v0

    .line 26
    :goto_0
    if-ge v1, v3, :cond_2

    .line 27
    .line 28
    aget-object v4, v0, v1

    .line 29
    .line 30
    new-instance v5, Lg0/z;

    .line 31
    .line 32
    invoke-direct {v5, v2}, Lg0/z;-><init>(Lg0/A;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v4, p1, v5}, Lg0/B;->a(Landroid/view/KeyEvent;Lg0/z;)V

    .line 36
    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {p0, p1}, LN/b;->J(Landroid/view/KeyEvent;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    const/4 p1, 0x1

    .line 45
    return p1
.end method

.method public F(Ljava/lang/String;Ljava/lang/Object;Lp0/k;)V
    .locals 2

    .line 1
    new-instance v0, LN/Q;

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    invoke-direct {v0, v1, p1, p2}, LN/Q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, LN/b;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lq0/l;

    .line 11
    .line 12
    invoke-interface {p1, v0}, Lq0/l;->e(LN/Q;)Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-nez p3, :cond_0

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p2, Lq0/a;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    invoke-direct {p2, v0, p0, p3}, Lq0/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    iget-object p3, p0, LN/b;->f:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p3, Ljava/lang/String;

    .line 29
    .line 30
    iget-object v0, p0, LN/b;->g:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lq0/f;

    .line 33
    .line 34
    invoke-interface {v0, p3, p1, p2}, Lq0/f;->n(Ljava/lang/String;Ljava/nio/ByteBuffer;Lq0/e;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public G(I)V
    .locals 7

    .line 1
    iget-object v0, p0, LN/b;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Lc/a;->e:[I

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-static {v1, v3, v2, p1}, LN/b;->I(Landroid/content/Context;Landroid/util/AttributeSet;[II)LN/b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :try_start_0
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    .line 19
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    const/4 v2, -0x1

    .line 21
    iget-object v4, p1, LN/b;->f:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v4, Landroid/content/res/TypedArray;

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    const/4 v5, 0x1

    .line 28
    :try_start_1
    invoke-virtual {v4, v5, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eq v5, v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v1, v5}, Ld/b;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    :goto_0
    if-eqz v1, :cond_1

    .line 51
    .line 52
    invoke-static {v1}, Lj/y;->b(Landroid/graphics/drawable/Drawable;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    const/4 v1, 0x2

    .line 56
    invoke-virtual {v4, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    const/16 v6, 0x15

    .line 61
    .line 62
    if-eqz v5, :cond_3

    .line 63
    .line 64
    invoke-virtual {p1, v1}, LN/b;->x(I)Landroid/content/res/ColorStateList;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 69
    .line 70
    invoke-static {v0, v1}, LD/f;->c(Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V

    .line 71
    .line 72
    .line 73
    if-ne v5, v6, :cond_3

    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-eqz v1, :cond_3

    .line 80
    .line 81
    invoke-static {v0}, LD/f;->a(Landroid/widget/ImageView;)Landroid/content/res/ColorStateList;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    if-eqz v5, :cond_3

    .line 86
    .line 87
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-eqz v5, :cond_2

    .line 92
    .line 93
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    invoke-virtual {v1, v5}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 98
    .line 99
    .line 100
    :cond_2
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 101
    .line 102
    .line 103
    :cond_3
    const/4 v1, 0x3

    .line 104
    invoke-virtual {v4, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    if-eqz v5, :cond_5

    .line 109
    .line 110
    invoke-virtual {v4, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    invoke-static {v1, v3}, Lj/y;->d(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 119
    .line 120
    invoke-static {v0, v1}, LD/f;->d(Landroid/widget/ImageView;Landroid/graphics/PorterDuff$Mode;)V

    .line 121
    .line 122
    .line 123
    if-ne v2, v6, :cond_5

    .line 124
    .line 125
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    if-eqz v1, :cond_5

    .line 130
    .line 131
    invoke-static {v0}, LD/f;->a(Landroid/widget/ImageView;)Landroid/content/res/ColorStateList;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    if-eqz v2, :cond_5

    .line 136
    .line 137
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-eqz v2, :cond_4

    .line 142
    .line 143
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 148
    .line 149
    .line 150
    :cond_4
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 151
    .line 152
    .line 153
    :cond_5
    invoke-virtual {p1}, LN/b;->L()V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :goto_1
    invoke-virtual {p1}, LN/b;->L()V

    .line 158
    .line 159
    .line 160
    throw v0
.end method

.method public J(Landroid/view/KeyEvent;)V
    .locals 8

    .line 1
    iget-object v0, p0, LN/b;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg0/C;

    .line 4
    .line 5
    if-eqz v0, :cond_c

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lg0/q;

    .line 9
    .line 10
    iget-object v1, v1, Lg0/q;->o:Lio/flutter/plugin/editing/j;

    .line 11
    .line 12
    iget-object v2, v1, Lio/flutter/plugin/editing/j;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 13
    .line 14
    invoke-virtual {v2}, Landroid/view/inputmethod/InputMethodManager;->isAcceptingText()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v2, :cond_a

    .line 20
    .line 21
    iget-object v1, v1, Lio/flutter/plugin/editing/j;->j:Landroid/view/inputmethod/InputConnection;

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    goto/16 :goto_1

    .line 26
    .line 27
    :cond_0
    instance-of v2, v1, Lio/flutter/plugin/editing/b;

    .line 28
    .line 29
    if-eqz v2, :cond_9

    .line 30
    .line 31
    check-cast v1, Lio/flutter/plugin/editing/b;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_a

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/16 v4, 0x15

    .line 44
    .line 45
    const/4 v5, 0x1

    .line 46
    if-ne v2, v4, :cond_1

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {v1, v5, v2}, Lio/flutter/plugin/editing/b;->d(ZZ)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    goto/16 :goto_1

    .line 57
    .line 58
    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    const/16 v4, 0x16

    .line 63
    .line 64
    if-ne v2, v4, :cond_2

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-virtual {v1, v3, v2}, Lio/flutter/plugin/editing/b;->d(ZZ)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    goto/16 :goto_1

    .line 75
    .line 76
    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    const/16 v4, 0x13

    .line 81
    .line 82
    if-ne v2, v4, :cond_3

    .line 83
    .line 84
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    invoke-virtual {v1, v5, v2}, Lio/flutter/plugin/editing/b;->e(ZZ)Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    goto/16 :goto_1

    .line 93
    .line 94
    :cond_3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    const/16 v4, 0x14

    .line 99
    .line 100
    if-ne v2, v4, :cond_4

    .line 101
    .line 102
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    invoke-virtual {v1, v3, v2}, Lio/flutter/plugin/editing/b;->e(ZZ)Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    goto :goto_1

    .line 111
    :cond_4
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    const/16 v4, 0x42

    .line 116
    .line 117
    if-eq v2, v4, :cond_5

    .line 118
    .line 119
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    const/16 v4, 0xa0

    .line 124
    .line 125
    if-ne v2, v4, :cond_6

    .line 126
    .line 127
    :cond_5
    iget-object v2, v1, Lio/flutter/plugin/editing/b;->e:Landroid/view/inputmethod/EditorInfo;

    .line 128
    .line 129
    iget v4, v2, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 130
    .line 131
    const/high16 v6, 0x20000

    .line 132
    .line 133
    and-int/2addr v4, v6

    .line 134
    if-nez v4, :cond_6

    .line 135
    .line 136
    iget v2, v2, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 137
    .line 138
    and-int/lit16 v2, v2, 0xff

    .line 139
    .line 140
    invoke-virtual {v1, v2}, Lio/flutter/plugin/editing/b;->performEditorAction(I)Z

    .line 141
    .line 142
    .line 143
    :goto_0
    const/4 v3, 0x1

    .line 144
    goto :goto_1

    .line 145
    :cond_6
    iget-object v2, v1, Lio/flutter/plugin/editing/b;->d:Lio/flutter/plugin/editing/e;

    .line 146
    .line 147
    invoke-static {v2}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    invoke-static {v2}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    .line 152
    .line 153
    .line 154
    move-result v6

    .line 155
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    if-ltz v4, :cond_a

    .line 160
    .line 161
    if-ltz v6, :cond_a

    .line 162
    .line 163
    if-nez v7, :cond_7

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_7
    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    invoke-virtual {v1}, Lio/flutter/plugin/editing/b;->beginBatchEdit()Z

    .line 175
    .line 176
    .line 177
    if-eq v3, v4, :cond_8

    .line 178
    .line 179
    invoke-virtual {v2, v3, v4}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 180
    .line 181
    .line 182
    :cond_8
    int-to-char v4, v7

    .line 183
    invoke-static {v4}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    invoke-virtual {v2, v3, v4}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 188
    .line 189
    .line 190
    add-int/2addr v3, v5

    .line 191
    invoke-virtual {v1, v3, v3}, Lio/flutter/plugin/editing/b;->setSelection(II)Z

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1}, Lio/flutter/plugin/editing/b;->endBatchEdit()Z

    .line 195
    .line 196
    .line 197
    goto :goto_0

    .line 198
    :cond_9
    invoke-interface {v1, p1}, Landroid/view/inputmethod/InputConnection;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    move v3, v1

    .line 203
    :cond_a
    :goto_1
    if-eqz v3, :cond_b

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_b
    iget-object v1, p0, LN/b;->f:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v1, Ljava/util/HashSet;

    .line 209
    .line 210
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    check-cast v0, Lg0/q;

    .line 214
    .line 215
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    if-eqz p1, :cond_c

    .line 227
    .line 228
    const-string p1, "KeyboardManager"

    .line 229
    .line 230
    const-string v0, "A redispatched key event was consumed before reaching KeyboardManager"

    .line 231
    .line 232
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 233
    .line 234
    .line 235
    :cond_c
    :goto_2
    return-void
.end method

.method public K(Landroid/app/Activity;LY/k;)V
    .locals 3

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LN/b;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/concurrent/locks/ReentrantLock;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, LN/b;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ljava/util/WeakHashMap;

    .line 16
    .line 17
    :try_start_0
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, LY/k;

    .line 22
    .line 23
    invoke-virtual {p2, v2}, LY/k;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    :try_start_1
    invoke-virtual {v1, p1, p2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, LY/k;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, LN/b;->g:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, LD/j;

    .line 45
    .line 46
    iget-object v0, v0, LD/j;->f:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lb0/k;

    .line 49
    .line 50
    iget-object v0, v0, Lb0/k;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Lb0/j;

    .line 67
    .line 68
    iget-object v2, v1, Lb0/j;->a:Landroid/app/Activity;

    .line 69
    .line 70
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    iput-object p2, v1, Lb0/j;->c:LY/k;

    .line 78
    .line 79
    iget-object v1, v1, Lb0/j;->b:LY/i;

    .line 80
    .line 81
    invoke-virtual {v1, p2}, LY/i;->accept(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    return-void

    .line 86
    :catchall_0
    move-exception p1

    .line 87
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 88
    .line 89
    .line 90
    throw p1
.end method

.method public L()V
    .locals 1

    .line 1
    iget-object v0, p0, LN/b;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public M(Ljava/util/ArrayList;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, LN/a;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v3, p0, LN/b;->g:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Lg0/F;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const-string v4, "instance"

    .line 25
    .line 26
    invoke-static {v2, v4}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget v4, v3, Lg0/F;->a:I

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    :goto_1
    iget-object v6, v3, Lg0/F;->b:[Ljava/lang/Object;

    .line 33
    .line 34
    if-ge v5, v4, :cond_1

    .line 35
    .line 36
    aget-object v6, v6, v5

    .line 37
    .line 38
    if-eq v6, v2, :cond_0

    .line 39
    .line 40
    add-int/lit8 v5, v5, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v0, "Already in the pool!"

    .line 46
    .line 47
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_1
    iget v4, v3, Lg0/F;->a:I

    .line 52
    .line 53
    array-length v5, v6

    .line 54
    if-ge v4, v5, :cond_2

    .line 55
    .line 56
    aput-object v2, v6, v4

    .line 57
    .line 58
    add-int/lit8 v4, v4, 0x1

    .line 59
    .line 60
    iput v4, v3, Lg0/F;->a:I

    .line 61
    .line 62
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public N(Lq0/k;)V
    .locals 4

    .line 1
    iget-object v0, p0, LN/b;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    new-instance v1, LN/Q;

    .line 6
    .line 7
    const/16 v2, 0x17

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v1, p0, p1, v2, v3}, LN/Q;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, LN/b;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Lq0/f;

    .line 16
    .line 17
    invoke-interface {p1, v0, v1}, Lq0/f;->f(Ljava/lang/String;Lq0/d;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public a()V
    .locals 5

    .line 1
    iget-object v0, p0, LN/b;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-static {v1}, Lj/y;->b(Landroid/graphics/drawable/Drawable;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    if-eqz v1, :cond_7

    .line 15
    .line 16
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v3, 0x15

    .line 19
    .line 20
    if-le v2, v3, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    if-ne v2, v3, :cond_6

    .line 24
    .line 25
    iget-object v2, p0, LN/b;->h:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, Lj/j0;

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    new-instance v2, Lj/j0;

    .line 32
    .line 33
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v2, p0, LN/b;->h:Ljava/lang/Object;

    .line 37
    .line 38
    :cond_2
    iget-object v2, p0, LN/b;->h:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Lj/j0;

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    iput-object v3, v2, Lj/j0;->a:Landroid/content/res/ColorStateList;

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    iput-boolean v4, v2, Lj/j0;->d:Z

    .line 47
    .line 48
    iput-object v3, v2, Lj/j0;->b:Landroid/graphics/PorterDuff$Mode;

    .line 49
    .line 50
    iput-boolean v4, v2, Lj/j0;->c:Z

    .line 51
    .line 52
    invoke-static {v0}, LD/f;->a(Landroid/widget/ImageView;)Landroid/content/res/ColorStateList;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    const/4 v4, 0x1

    .line 57
    if-eqz v3, :cond_3

    .line 58
    .line 59
    iput-boolean v4, v2, Lj/j0;->d:Z

    .line 60
    .line 61
    iput-object v3, v2, Lj/j0;->a:Landroid/content/res/ColorStateList;

    .line 62
    .line 63
    :cond_3
    invoke-static {v0}, LD/f;->b(Landroid/widget/ImageView;)Landroid/graphics/PorterDuff$Mode;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    if-eqz v3, :cond_4

    .line 68
    .line 69
    iput-boolean v4, v2, Lj/j0;->c:Z

    .line 70
    .line 71
    iput-object v3, v2, Lj/j0;->b:Landroid/graphics/PorterDuff$Mode;

    .line 72
    .line 73
    :cond_4
    iget-boolean v3, v2, Lj/j0;->d:Z

    .line 74
    .line 75
    if-nez v3, :cond_5

    .line 76
    .line 77
    iget-boolean v3, v2, Lj/j0;->c:Z

    .line 78
    .line 79
    if-eqz v3, :cond_6

    .line 80
    .line 81
    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v1, v2, v0}, Lj/o;->c(Landroid/graphics/drawable/Drawable;Lj/j0;[I)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_6
    :goto_0
    iget-object v2, p0, LN/b;->f:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v2, Lj/j0;

    .line 92
    .line 93
    if-eqz v2, :cond_7

    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v1, v2, v0}, Lj/o;->c(Landroid/graphics/drawable/Drawable;Lj/j0;[I)V

    .line 100
    .line 101
    .line 102
    :cond_7
    return-void
.end method

.method public b(Ljava/lang/String;Lu0/h;)Ljava/lang/Boolean;
    .locals 1

    .line 1
    invoke-virtual {p0, p2}, LN/b;->t(Lu0/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    :goto_0
    return-object p1
.end method

.method public c(Ljava/lang/String;Lu0/h;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0, p2}, LN/b;->t(Lu0/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v0, ""

    .line 12
    .line 13
    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    :goto_0
    return-object p1
.end method

.method public d(Ljava/lang/String;ZLu0/h;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p3}, LN/b;->t(Lu0/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-interface {p3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    invoke-interface {p3, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public e(Ljava/lang/String;DLu0/h;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p4}, LN/b;->t(Lu0/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p4

    .line 5
    invoke-interface {p4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object p4

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v1, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-interface {p4, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;Lu0/h;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p3}, LN/b;->t(Lu0/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-interface {p3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    invoke-interface {p3, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public g(LT0/e;Lz0/d;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, LT0/l;

    .line 2
    .line 3
    iget-object v1, p0, LN/b;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, LJ/d;

    .line 6
    .line 7
    iget-object v2, p0, LN/b;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lu0/J;

    .line 10
    .line 11
    invoke-direct {v0, p1, v1, v2}, LT0/l;-><init>(LT0/e;LJ/d;Lu0/J;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, LN/b;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, LT0/d;

    .line 17
    .line 18
    invoke-interface {p1, v0, p2}, LT0/d;->g(LT0/e;Lz0/d;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    sget-object p2, LA0/a;->e:LA0/a;

    .line 23
    .line 24
    if-ne p1, p2, :cond_0

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_0
    sget-object p1, Lx0/g;->a:Lx0/g;

    .line 28
    .line 29
    return-object p1
.end method

.method public h(Ljava/util/List;Lu0/h;)Ljava/util/List;
    .locals 5

    .line 1
    invoke-virtual {p0, p2}, LN/b;->t(Lu0/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const-string v0, "preferences.all"

    .line 10
    .line 11
    invoke-static {p2, v0}, LI0/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Ljava/util/Map$Entry;

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const-string v3, "it.key"

    .line 44
    .line 45
    invoke-static {v2, v3}, LI0/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    check-cast v2, Ljava/lang/String;

    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    if-eqz p1, :cond_1

    .line 55
    .line 56
    invoke-static {p1}, Ly0/d;->U(Ljava/util/Collection;)Ljava/util/Set;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    const/4 v4, 0x0

    .line 62
    :goto_1
    invoke-static {v2, v3, v4}, Lu0/K;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Set;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_0

    .line 67
    .line 68
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1}, Ly0/d;->T(Ljava/lang/Iterable;)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    return-object p1
.end method

.method public i(Ljava/lang/String;Lu0/h;)Ljava/lang/Long;
    .locals 2

    .line 1
    invoke-virtual {p0, p2}, LN/b;->t(Lu0/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    :try_start_0
    invoke-interface {p2, p1, v0, v1}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 14
    .line 15
    .line 16
    move-result-wide p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    const/4 v0, 0x0

    .line 19
    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    int-to-long p1, p1

    .line 24
    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    :goto_1
    return-object p1
.end method

.method public j(Ljava/lang/String;Ljava/lang/String;Lu0/h;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p3}, LN/b;->t(Lu0/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-interface {p3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    invoke-interface {p3, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public k(Ljava/lang/String;Lu0/h;)Lu0/N;
    .locals 2

    .line 1
    invoke-virtual {p0, p2}, LN/b;->t(Lu0/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    const-string v0, ""

    .line 13
    .line 14
    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, LI0/i;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const-string p2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!"

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    new-instance p2, Lu0/N;

    .line 30
    .line 31
    sget-object v0, Lu0/L;->g:Lu0/L;

    .line 32
    .line 33
    invoke-direct {p2, p1, v0}, Lu0/N;-><init>(Ljava/lang/String;Lu0/L;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-string p2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu"

    .line 38
    .line 39
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    new-instance p2, Lu0/N;

    .line 46
    .line 47
    sget-object p1, Lu0/L;->f:Lu0/L;

    .line 48
    .line 49
    invoke-direct {p2, v1, p1}, Lu0/N;-><init>(Ljava/lang/String;Lu0/L;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    new-instance p2, Lu0/N;

    .line 54
    .line 55
    sget-object p1, Lu0/L;->h:Lu0/L;

    .line 56
    .line 57
    invoke-direct {p2, v1, p1}, Lu0/N;-><init>(Ljava/lang/String;Lu0/L;)V

    .line 58
    .line 59
    .line 60
    :goto_0
    return-object p2

    .line 61
    :cond_2
    return-object v1
.end method

.method public l(Ljava/lang/String;Lu0/h;)Ljava/lang/Double;
    .locals 1

    .line 1
    invoke-virtual {p0, p2}, LN/b;->t(Lu0/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v0, ""

    .line 12
    .line 13
    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object p2, p0, LN/b;->h:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p2, LH/a;

    .line 20
    .line 21
    invoke-static {p1, p2}, Lu0/K;->c(Ljava/lang/Object;LH/a;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string p2, "null cannot be cast to non-null type kotlin.Double"

    .line 26
    .line 27
    invoke-static {p1, p2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    check-cast p1, Ljava/lang/Double;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    :goto_0
    return-object p1
.end method

.method public m(Ljava/lang/String;Ljava/util/List;Lu0/h;)V
    .locals 1

    .line 1
    iget-object v0, p0, LN/b;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LH/a;

    .line 4
    .line 5
    invoke-virtual {v0, p2}, LH/a;->f(Ljava/util/List;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const-string v0, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu"

    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p0, p3}, LN/b;->t(Lu0/h;)Landroid/content/SharedPreferences;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    invoke-interface {p3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-interface {p3, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public n(Ljava/util/List;Lu0/h;)Ljava/util/Map;
    .locals 5

    .line 1
    invoke-virtual {p0, p2}, LN/b;->t(Lu0/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const-string v0, "preferences.all"

    .line 10
    .line 11
    invoke-static {p2, v0}, LI0/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Ljava/util/Map$Entry;

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Ljava/lang/String;

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    invoke-static {p1}, Ly0/d;->U(Ljava/util/Collection;)Ljava/util/Set;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const/4 v4, 0x0

    .line 57
    :goto_1
    invoke-static {v2, v3, v4}, Lu0/K;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Set;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_0

    .line 62
    .line 63
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    if-eqz v2, :cond_0

    .line 68
    .line 69
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget-object v3, p0, LN/b;->h:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v3, LH/a;

    .line 76
    .line 77
    invoke-static {v2, v3}, Lu0/K;->c(Ljava/lang/Object;LH/a;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    const-string v3, "null cannot be cast to non-null type kotlin.Any"

    .line 82
    .line 83
    invoke-static {v2, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    return-object v0
.end method

.method public o(Ljava/lang/String;JLu0/h;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p4}, LN/b;->t(Lu0/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p4

    .line 5
    invoke-interface {p4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object p4

    .line 9
    invoke-interface {p4, p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public p(Ljava/util/List;Lu0/h;)V
    .locals 6

    .line 1
    invoke-virtual {p0, p2}, LN/b;->t(Lu0/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "preferences.edit()"

    .line 10
    .line 11
    invoke-static {v0, v1}, LI0/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p2}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const-string v1, "preferences.all"

    .line 19
    .line 20
    invoke-static {p2, v1}, LI0/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Ljava/lang/String;

    .line 47
    .line 48
    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    if-eqz p1, :cond_1

    .line 53
    .line 54
    invoke-static {p1}, Ly0/d;->U(Ljava/util/Collection;)Ljava/util/Set;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    const/4 v5, 0x0

    .line 60
    :goto_1
    invoke-static {v3, v4, v5}, Lu0/K;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Set;)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-eqz v4, :cond_0

    .line 65
    .line 66
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    if-eqz p2, :cond_3

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    check-cast p2, Ljava/lang/String;

    .line 85
    .line 86
    invoke-interface {v0, p2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public r(Ljava/lang/String;Lu0/h;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    invoke-virtual {p0, p2}, LN/b;->t(Lu0/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const-string v0, ""

    .line 13
    .line 14
    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v2}, LI0/i;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const-string v3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu"

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    const-string v3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!"

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iget-object p2, p0, LN/b;->h:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p2, LH/a;

    .line 44
    .line 45
    invoke-static {p1, p2}, Lu0/K;->c(Ljava/lang/Object;LH/a;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Ljava/util/List;

    .line 50
    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    new-instance v1, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-eqz p2, :cond_1

    .line 67
    .line 68
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    instance-of v0, p2, Ljava/lang/String;

    .line 73
    .line 74
    if-eqz v0, :cond_0

    .line 75
    .line 76
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    return-object v1
.end method

.method public s(Landroid/app/Activity;)V
    .locals 3

    .line 1
    iget-object v0, p0, LN/b;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/locks/ReentrantLock;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v1, p0, LN/b;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/util/WeakHashMap;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v1, p1, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 22
    .line 23
    .line 24
    throw p1
.end method

.method public t(Lu0/h;)Landroid/content/SharedPreferences;
    .locals 3

    .line 1
    iget-object p1, p1, Lu0/h;->a:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object v1, p0, LN/b;->f:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Landroid/content/Context;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    new-instance p1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v2, "_preferences"

    .line 23
    .line 24
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v1, p1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string v0, "{\n      PreferenceManage\u2026references(context)\n    }"

    .line 36
    .line 37
    invoke-static {p1, v0}, LI0/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {v1, p1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string v0, "{\n      context.getShare\u2026ntext.MODE_PRIVATE)\n    }"

    .line 46
    .line 47
    invoke-static {p1, v0}, LI0/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, LN/b;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, LN/b;->h:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, LN/c;

    .line 19
    .line 20
    invoke-virtual {v1}, LN/c;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ", hidden list:"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, LN/b;->f:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public u(ILio/flutter/view/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, LN/b;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/embedding/engine/FlutterJNI;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lio/flutter/embedding/engine/FlutterJNI;->dispatchSemanticsAction(ILio/flutter/view/e;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public v(ILio/flutter/view/e;Ljava/io/Serializable;)V
    .locals 1

    .line 1
    iget-object v0, p0, LN/b;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/embedding/engine/FlutterJNI;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lio/flutter/embedding/engine/FlutterJNI;->dispatchSemanticsAction(ILio/flutter/view/e;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public w(II)I
    .locals 3

    .line 1
    iget-object v0, p0, LN/b;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    :goto_0
    if-ge p2, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, LN/a;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    add-int/lit8 p2, p2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return p1
.end method

.method public x(I)Landroid/content/res/ColorStateList;
    .locals 3

    .line 1
    iget-object v0, p0, LN/b;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v2, p0, LN/b;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {v2, v1}, Ld/b;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public y(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    iget-object v0, p0, LN/b;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, LN/b;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {p1, v1}, Ld/b;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method

.method public z(IILj/s;)Landroid/graphics/Typeface;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p2

    .line 4
    .line 5
    move-object/from16 v10, p3

    .line 6
    .line 7
    const/4 v8, 0x1

    .line 8
    iget-object v2, v1, LN/b;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Landroid/content/res/TypedArray;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    move/from16 v4, p1

    .line 14
    .line 15
    invoke-virtual {v2, v4, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 16
    .line 17
    .line 18
    move-result v9

    .line 19
    const/4 v11, 0x0

    .line 20
    if-nez v9, :cond_0

    .line 21
    .line 22
    return-object v11

    .line 23
    :cond_0
    iget-object v2, v1, LN/b;->h:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Landroid/util/TypedValue;

    .line 26
    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    new-instance v2, Landroid/util/TypedValue;

    .line 30
    .line 31
    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v2, v1, LN/b;->h:Ljava/lang/Object;

    .line 35
    .line 36
    :cond_1
    iget-object v2, v1, LN/b;->h:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, Landroid/util/TypedValue;

    .line 39
    .line 40
    sget-object v3, Lq/n;->a:Ljava/lang/ThreadLocal;

    .line 41
    .line 42
    iget-object v3, v1, LN/b;->g:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, Landroid/content/Context;

    .line 45
    .line 46
    invoke-virtual {v3}, Landroid/content/Context;->isRestricted()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    goto/16 :goto_4

    .line 53
    .line 54
    :cond_2
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 55
    .line 56
    .line 57
    move-result-object v12

    .line 58
    invoke-virtual {v12, v9, v2, v8}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 59
    .line 60
    .line 61
    const-string v13, "ResourcesCompat"

    .line 62
    .line 63
    iget-object v4, v2, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 64
    .line 65
    if-eqz v4, :cond_9

    .line 66
    .line 67
    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v14

    .line 71
    const-string v4, "res/"

    .line 72
    .line 73
    invoke-virtual {v14, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-nez v4, :cond_3

    .line 78
    .line 79
    invoke-virtual/range {p3 .. p3}, Lj/s;->a()V

    .line 80
    .line 81
    .line 82
    goto/16 :goto_4

    .line 83
    .line 84
    :cond_3
    iget v4, v2, Landroid/util/TypedValue;->assetCookie:I

    .line 85
    .line 86
    sget-object v15, Lr/e;->b:Lm/d;

    .line 87
    .line 88
    invoke-static {v12, v9, v14, v4, v0}, Lr/e;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-virtual {v15, v4}, Lm/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    check-cast v4, Landroid/graphics/Typeface;

    .line 97
    .line 98
    if-eqz v4, :cond_4

    .line 99
    .line 100
    new-instance v0, Landroid/os/Handler;

    .line 101
    .line 102
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 107
    .line 108
    .line 109
    new-instance v2, LL/h;

    .line 110
    .line 111
    invoke-direct {v2, v8, v10, v4}, LL/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 115
    .line 116
    .line 117
    move-object v11, v4

    .line 118
    goto/16 :goto_4

    .line 119
    .line 120
    :cond_4
    :try_start_0
    invoke-virtual {v14}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    const-string v5, ".xml"

    .line 125
    .line 126
    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-eqz v4, :cond_6

    .line 131
    .line 132
    invoke-virtual {v12, v9}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-static {v4, v12}, Lq/b;->i(Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources;)Lq/f;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    if-nez v4, :cond_5

    .line 141
    .line 142
    const-string v0, "Failed to find font-family tag"

    .line 143
    .line 144
    invoke-static {v13, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {p3 .. p3}, Lj/s;->a()V

    .line 148
    .line 149
    .line 150
    goto/16 :goto_4

    .line 151
    .line 152
    :catch_0
    move-exception v0

    .line 153
    goto :goto_1

    .line 154
    :catch_1
    move-exception v0

    .line 155
    goto :goto_2

    .line 156
    :cond_5
    iget v7, v2, Landroid/util/TypedValue;->assetCookie:I

    .line 157
    .line 158
    move-object v2, v3

    .line 159
    move-object v3, v4

    .line 160
    move-object v4, v12

    .line 161
    move v5, v9

    .line 162
    move-object v6, v14

    .line 163
    move/from16 v8, p2

    .line 164
    .line 165
    move-object/from16 v9, p3

    .line 166
    .line 167
    invoke-static/range {v2 .. v9}, Lr/e;->a(Landroid/content/Context;Lq/f;Landroid/content/res/Resources;ILjava/lang/String;IILj/s;)Landroid/graphics/Typeface;

    .line 168
    .line 169
    .line 170
    move-result-object v11

    .line 171
    goto :goto_4

    .line 172
    :cond_6
    iget v7, v2, Landroid/util/TypedValue;->assetCookie:I

    .line 173
    .line 174
    sget-object v2, Lr/e;->a:La1/a;

    .line 175
    .line 176
    move-object v4, v12

    .line 177
    move v5, v9

    .line 178
    move-object v6, v14

    .line 179
    move v11, v7

    .line 180
    move/from16 v7, p2

    .line 181
    .line 182
    invoke-virtual/range {v2 .. v7}, La1/a;->j(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    if-eqz v2, :cond_7

    .line 187
    .line 188
    invoke-static {v12, v9, v14, v11, v0}, Lr/e;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {v15, v0, v2}, Lm/d;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    :cond_7
    if-eqz v2, :cond_8

    .line 196
    .line 197
    new-instance v0, Landroid/os/Handler;

    .line 198
    .line 199
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    invoke-direct {v0, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 204
    .line 205
    .line 206
    new-instance v3, LL/h;

    .line 207
    .line 208
    invoke-direct {v3, v8, v10, v2}, LL/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 212
    .line 213
    .line 214
    goto :goto_0

    .line 215
    :cond_8
    invoke-virtual/range {p3 .. p3}, Lj/s;->a()V
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 216
    .line 217
    .line 218
    :goto_0
    move-object v11, v2

    .line 219
    goto :goto_4

    .line 220
    :goto_1
    const-string v2, "Failed to read xml resource "

    .line 221
    .line 222
    invoke-virtual {v2, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-static {v13, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 227
    .line 228
    .line 229
    goto :goto_3

    .line 230
    :goto_2
    const-string v2, "Failed to parse xml resource "

    .line 231
    .line 232
    invoke-virtual {v2, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    invoke-static {v13, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 237
    .line 238
    .line 239
    :goto_3
    invoke-virtual/range {p3 .. p3}, Lj/s;->a()V

    .line 240
    .line 241
    .line 242
    const/4 v11, 0x0

    .line 243
    :goto_4
    return-object v11

    .line 244
    :cond_9
    new-instance v0, Landroid/content/res/Resources$NotFoundException;

    .line 245
    .line 246
    new-instance v3, Ljava/lang/StringBuilder;

    .line 247
    .line 248
    const-string v4, "Resource \""

    .line 249
    .line 250
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v12, v9}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    const-string v4, "\" ("

    .line 261
    .line 262
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    const-string v4, ") is not a Font: "

    .line 273
    .line 274
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    invoke-direct {v0, v2}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw v0
.end method
