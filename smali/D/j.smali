.class public LD/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT0/d;
.implements LG/i;
.implements LL/f;
.implements LT/p;
.implements Lj/K;
.implements Lq0/d;
.implements Lq0/f;
.implements Li/o;
.implements Lj/l;
.implements Lq0/b;


# instance fields
.field public final synthetic e:I

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, LD/j;->e:I

    sparse-switch p1, :sswitch_data_0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, LD/j;->f:Ljava/lang/Object;

    return-void

    .line 5
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, LD/j;->f:Ljava/lang/Object;

    return-void

    .line 7
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    sget-object p1, LG/n0;->b:LG/n0;

    .line 9
    new-instance v0, LT0/q;

    invoke-direct {v0, p1}, LT0/q;-><init>(Ljava/lang/Object;)V

    .line 10
    iput-object v0, p0, LD/j;->f:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_1
        0x7 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LD/j;->e:I

    iput-object p2, p0, LD/j;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 2
    iput p1, p0, LD/j;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LH0/p;)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, LD/j;->e:I

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    check-cast p1, LB0/g;

    iput-object p1, p0, LD/j;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, LD/j;->e:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, LD/j;->f:Ljava/lang/Object;

    return-void
.end method

.method public static r(II)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x0

    .line 5
    :goto_0
    const/4 v4, 0x1

    .line 6
    if-ge v1, p0, :cond_2

    .line 7
    .line 8
    add-int/lit8 v2, v2, 0x1

    .line 9
    .line 10
    if-ne v2, p1, :cond_0

    .line 11
    .line 12
    add-int/lit8 v3, v3, 0x1

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    if-le v2, p1, :cond_1

    .line 17
    .line 18
    add-int/lit8 v3, v3, 0x1

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    add-int/2addr v2, v4

    .line 25
    if-le v2, p1, :cond_3

    .line 26
    .line 27
    add-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    :cond_3
    return v3
.end method

.method public static s(I)Z
    .locals 1

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    if-gt v0, p0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x39

    .line 6
    .line 7
    if-le p0, v0, :cond_2

    .line 8
    .line 9
    :cond_0
    const/16 v0, 0x23

    .line 10
    .line 11
    if-eq p0, v0, :cond_2

    .line 12
    .line 13
    const/16 v0, 0x2a

    .line 14
    .line 15
    if-ne p0, v0, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 p0, 0x0

    .line 19
    goto :goto_1

    .line 20
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 21
    :goto_1
    return p0
.end method


# virtual methods
.method public a(Li/j;Z)V
    .locals 2

    .line 1
    instance-of v0, p1, Li/t;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Li/t;

    .line 7
    .line 8
    iget-object v0, v0, Li/t;->v:Li/j;

    .line 9
    .line 10
    invoke-virtual {v0}, Li/j;->j()Li/j;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Li/j;->c(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, LD/j;->f:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lj/i;

    .line 21
    .line 22
    iget-object v0, v0, Lj/i;->i:Li/o;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {v0, p1, p2}, Li/o;->a(Li/j;Z)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public b(Li/t;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p1, Li/t;->w:Li/k;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, LD/j;->f:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lj/i;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v1, v1, Lj/i;->i:Li/o;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {v1, p1}, Li/o;->b(Li/t;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    :cond_1
    return v0
.end method

.method public c(LH0/p;LB0/g;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LJ/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, LJ/c;-><init>(LH0/p;Lz0/d;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, LD/j;->f:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, LG/i;

    .line 10
    .line 11
    invoke-interface {p1, v0, p2}, LG/i;->c(LH0/p;LB0/g;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public d(Li/j;Li/k;)V
    .locals 7

    .line 1
    iget-object v0, p0, LD/j;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li/g;

    .line 4
    .line 5
    iget-object v1, v0, Li/g;->j:Landroid/os/Handler;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Li/g;->l:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x0

    .line 18
    :goto_0
    const/4 v5, -0x1

    .line 19
    if-ge v4, v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    check-cast v6, Li/f;

    .line 26
    .line 27
    iget-object v6, v6, Li/f;->b:Li/j;

    .line 28
    .line 29
    if-ne p1, v6, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v4, -0x1

    .line 36
    :goto_1
    if-ne v4, v5, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-ge v4, v3, :cond_3

    .line 46
    .line 47
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    move-object v2, v1

    .line 52
    check-cast v2, Li/f;

    .line 53
    .line 54
    :cond_3
    new-instance v1, Li/e;

    .line 55
    .line 56
    invoke-direct {v1, p0, v2, p2, p1}, Li/e;-><init>(LD/j;Li/f;Li/k;Li/j;)V

    .line 57
    .line 58
    .line 59
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 60
    .line 61
    .line 62
    move-result-wide v2

    .line 63
    const-wide/16 v4, 0xc8

    .line 64
    .line 65
    add-long/2addr v2, v4

    .line 66
    iget-object p2, v0, Li/g;->j:Landroid/os/Handler;

    .line 67
    .line 68
    invoke-virtual {p2, v1, p1, v2, v3}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public e(Ljava/lang/String;Lq0/d;LH/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD/j;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li0/j;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Li0/j;->e(Ljava/lang/String;Lq0/d;LH/a;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public f(Ljava/lang/String;Lq0/d;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, LD/j;->f:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, Li0/j;

    .line 5
    .line 6
    invoke-virtual {v1, p1, p2, v0}, Li0/j;->e(Ljava/lang/String;Lq0/d;LH/a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public g(LT0/e;Lz0/d;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LD/j;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, LT0/a;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, LT0/a;

    .line 12
    .line 13
    iget v1, v0, LT0/a;->k:I

    .line 14
    .line 15
    const/high16 v2, -0x80000000

    .line 16
    .line 17
    and-int v3, v1, v2

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, v0, LT0/a;->k:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, LT0/a;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, LT0/a;-><init>(LD/j;Lz0/d;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p2, v0, LT0/a;->i:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v1, LA0/a;->e:LA0/a;

    .line 33
    .line 34
    iget v2, v0, LT0/a;->k:I

    .line 35
    .line 36
    sget-object v3, Lx0/g;->a:Lx0/g;

    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    if-ne v2, v4, :cond_1

    .line 42
    .line 43
    iget-object p1, v0, LT0/a;->h:LU0/n;

    .line 44
    .line 45
    :try_start_0
    invoke-static {p2}, La/a;->O(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :catchall_0
    move-exception p2

    .line 50
    goto :goto_5

    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    invoke-static {p2}, La/a;->O(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    new-instance p2, LU0/n;

    .line 63
    .line 64
    iget-object v2, v0, LB0/b;->f:Lz0/i;

    .line 65
    .line 66
    invoke-static {v2}, LI0/i;->b(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p2, p1, v2}, LU0/n;-><init>(LT0/e;Lz0/i;)V

    .line 70
    .line 71
    .line 72
    :try_start_1
    iput-object p2, v0, LT0/a;->h:LU0/n;

    .line 73
    .line 74
    iput v4, v0, LT0/a;->k:I

    .line 75
    .line 76
    iget-object p1, p0, LD/j;->f:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p1, LB0/g;

    .line 79
    .line 80
    invoke-interface {p1, p2, v0}, LH0/p;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 84
    if-ne p1, v1, :cond_3

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    move-object p1, v3

    .line 88
    :goto_1
    if-ne p1, v1, :cond_4

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_4
    move-object p1, p2

    .line 92
    :goto_2
    invoke-virtual {p1}, LB0/b;->n()V

    .line 93
    .line 94
    .line 95
    move-object v1, v3

    .line 96
    :goto_3
    return-object v1

    .line 97
    :goto_4
    move-object v5, p2

    .line 98
    move-object p2, p1

    .line 99
    move-object p1, v5

    .line 100
    goto :goto_5

    .line 101
    :catchall_1
    move-exception p1

    .line 102
    goto :goto_4

    .line 103
    :goto_5
    invoke-virtual {p1}, LB0/b;->n()V

    .line 104
    .line 105
    .line 106
    throw p2

    .line 107
    :pswitch_0
    new-instance v0, LG/u;

    .line 108
    .line 109
    const/4 v1, 0x0

    .line 110
    invoke-direct {v0, p1, v1}, LG/u;-><init>(LT0/e;I)V

    .line 111
    .line 112
    .line 113
    iget-object p1, p0, LD/j;->f:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p1, LN/Q;

    .line 116
    .line 117
    invoke-virtual {p1, v0, p2}, LN/Q;->g(LT0/e;Lz0/d;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    sget-object p2, LA0/a;->e:LA0/a;

    .line 122
    .line 123
    if-ne p1, p2, :cond_5

    .line 124
    .line 125
    goto :goto_6

    .line 126
    :cond_5
    sget-object p1, Lx0/g;->a:Lx0/g;

    .line 127
    .line 128
    :goto_6
    return-object p1

    .line 129
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public getData()LT0/d;
    .locals 1

    .line 1
    iget-object v0, p0, LD/j;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LG/i;

    .line 4
    .line 5
    invoke-interface {v0}, LG/i;->getData()LT0/d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getStatics()Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;
    .locals 2

    .line 1
    iget-object v0, p0, LD/j;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->getStatics()Ljava/lang/reflect/InvocationHandler;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;

    .line 10
    .line 11
    invoke-static {v1, v0}, La1/a;->d(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;

    .line 16
    .line 17
    return-object v0
.end method

.method public getWebkitToCompatConverter()Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;
    .locals 2

    .line 1
    iget-object v0, p0, LD/j;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->getWebkitToCompatConverter()Ljava/lang/reflect/InvocationHandler;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    .line 10
    .line 11
    invoke-static {v1, v0}, La1/a;->d(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    .line 16
    .line 17
    return-object v0
.end method

.method public h(ILjava/io/Serializable;)V
    .locals 3

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    :pswitch_0
    const-string v0, ""

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_1
    const-string v0, "RESULT_DELETE_SKIP_FILE_SUCCESS"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :pswitch_2
    const-string v0, "RESULT_INSTALL_SKIP_FILE_SUCCESS"

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :pswitch_3
    const-string v0, "RESULT_PARSE_EXCEPTION"

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :pswitch_4
    const-string v0, "RESULT_IO_EXCEPTION"

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :pswitch_5
    const-string v0, "RESULT_BASELINE_PROFILE_NOT_FOUND"

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :pswitch_6
    const-string v0, "RESULT_DESIRED_FORMAT_UNSUPPORTED"

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :pswitch_7
    const-string v0, "RESULT_NOT_WRITABLE"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_8
    const-string v0, "RESULT_UNSUPPORTED_ART_VERSION"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_9
    const-string v0, "RESULT_ALREADY_INSTALLED"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_a
    const-string v0, "RESULT_INSTALL_SUCCESS"

    .line 35
    .line 36
    :goto_0
    const/4 v1, 0x6

    .line 37
    const-string v2, "ProfileInstaller"

    .line 38
    .line 39
    if-eq p1, v1, :cond_0

    .line 40
    .line 41
    const/4 v1, 0x7

    .line 42
    if-eq p1, v1, :cond_0

    .line 43
    .line 44
    const/16 v1, 0x8

    .line 45
    .line 46
    if-eq p1, v1, :cond_0

    .line 47
    .line 48
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    check-cast p2, Ljava/lang/Throwable;

    .line 53
    .line 54
    invoke-static {v2, v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 55
    .line 56
    .line 57
    :goto_1
    iget-object p2, p0, LD/j;->f:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p2, Landroidx/profileinstaller/ProfileInstallReceiver;

    .line 60
    .line 61
    invoke-virtual {p2, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public i(Li/j;Li/k;)V
    .locals 0

    .line 1
    iget-object p2, p0, LD/j;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, Li/g;

    .line 4
    .line 5
    iget-object p2, p2, Li/g;->j:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public j()V
    .locals 2

    .line 1
    const-string v0, "ProfileInstaller"

    .line 2
    .line 3
    const-string v1, "DIAGNOSTIC_PROFILE_IS_COMPRESSED"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public k()[Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LD/j;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->getSupportedFeatures()[Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public l(Ljava/nio/ByteBuffer;Li0/g;)V
    .locals 0

    .line 1
    sget-object p2, Lq0/p;->b:Lq0/p;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lq0/p;->c(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, LD/j;->f:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Li0/b;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
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
    iget-object v1, p0, LD/j;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Li0/j;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Li0/j;->b(Lq0/i;)LH/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method public n(Ljava/lang/String;Ljava/nio/ByteBuffer;Lq0/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD/j;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li0/j;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Li0/j;->n(Ljava/lang/String;Ljava/nio/ByteBuffer;Lq0/e;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public o(Ljava/lang/Object;LN/Q;)V
    .locals 11

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    iget-object v3, p0, LD/j;->f:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v3, LN/b;

    .line 7
    .line 8
    iget-object v4, v3, LN/b;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v4, Lio/flutter/view/b;

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    if-nez v4, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2, v5}, LN/Q;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    check-cast p1, Ljava/util/HashMap;

    .line 20
    .line 21
    const-string v4, "type"

    .line 22
    .line 23
    invoke-virtual {p1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Ljava/lang/String;

    .line 28
    .line 29
    const-string v6, "data"

    .line 30
    .line 31
    invoke-virtual {p1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    check-cast v6, Ljava/util/HashMap;

    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const-string v7, "message"

    .line 41
    .line 42
    const-string v8, "nodeId"

    .line 43
    .line 44
    const/4 v9, -0x1

    .line 45
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 46
    .line 47
    .line 48
    move-result v10

    .line 49
    sparse-switch v10, :sswitch_data_0

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :sswitch_0
    const-string v10, "longPress"

    .line 54
    .line 55
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-nez v4, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    const/4 v9, 0x4

    .line 63
    goto :goto_0

    .line 64
    :sswitch_1
    const-string v10, "focus"

    .line 65
    .line 66
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-nez v4, :cond_2

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    const/4 v9, 0x3

    .line 74
    goto :goto_0

    .line 75
    :sswitch_2
    const-string v10, "tap"

    .line 76
    .line 77
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-nez v4, :cond_3

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    const/4 v9, 0x2

    .line 85
    goto :goto_0

    .line 86
    :sswitch_3
    const-string v10, "announce"

    .line 87
    .line 88
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-nez v4, :cond_4

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_4
    const/4 v9, 0x1

    .line 96
    goto :goto_0

    .line 97
    :sswitch_4
    const-string v10, "tooltip"

    .line 98
    .line 99
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-nez v4, :cond_5

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_5
    const/4 v9, 0x0

    .line 107
    :goto_0
    packed-switch v9, :pswitch_data_0

    .line 108
    .line 109
    .line 110
    goto/16 :goto_1

    .line 111
    .line 112
    :pswitch_0
    invoke-virtual {p1, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    check-cast p1, Ljava/lang/Integer;

    .line 117
    .line 118
    if-eqz p1, :cond_7

    .line 119
    .line 120
    iget-object v1, v3, LN/b;->h:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v1, Lio/flutter/view/b;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    iget-object v1, v1, Lio/flutter/view/b;->a:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v1, Lio/flutter/view/k;

    .line 131
    .line 132
    invoke-virtual {v1, p1, v0}, Lio/flutter/view/k;->g(II)V

    .line 133
    .line 134
    .line 135
    goto/16 :goto_1

    .line 136
    .line 137
    :pswitch_1
    invoke-virtual {p1, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    check-cast p1, Ljava/lang/Integer;

    .line 142
    .line 143
    if-eqz p1, :cond_7

    .line 144
    .line 145
    iget-object v0, v3, LN/b;->h:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v0, Lio/flutter/view/b;

    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    iget-object v0, v0, Lio/flutter/view/b;->a:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, Lio/flutter/view/k;

    .line 156
    .line 157
    const/16 v1, 0x8

    .line 158
    .line 159
    invoke-virtual {v0, p1, v1}, Lio/flutter/view/k;->g(II)V

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :pswitch_2
    invoke-virtual {p1, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    check-cast p1, Ljava/lang/Integer;

    .line 168
    .line 169
    if-eqz p1, :cond_7

    .line 170
    .line 171
    iget-object v0, v3, LN/b;->h:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v0, Lio/flutter/view/b;

    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    iget-object v0, v0, Lio/flutter/view/b;->a:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v0, Lio/flutter/view/k;

    .line 182
    .line 183
    invoke-virtual {v0, p1, v1}, Lio/flutter/view/k;->g(II)V

    .line 184
    .line 185
    .line 186
    goto :goto_1

    .line 187
    :pswitch_3
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    check-cast p1, Ljava/lang/String;

    .line 192
    .line 193
    if-eqz p1, :cond_7

    .line 194
    .line 195
    iget-object v0, v3, LN/b;->h:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v0, Lio/flutter/view/b;

    .line 198
    .line 199
    iget-object v0, v0, Lio/flutter/view/b;->a:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v0, Lio/flutter/view/k;

    .line 202
    .line 203
    iget-object v0, v0, Lio/flutter/view/k;->a:Landroid/view/View;

    .line 204
    .line 205
    invoke-virtual {v0, p1}, Landroid/view/View;->announceForAccessibility(Ljava/lang/CharSequence;)V

    .line 206
    .line 207
    .line 208
    goto :goto_1

    .line 209
    :pswitch_4
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    check-cast p1, Ljava/lang/String;

    .line 214
    .line 215
    if-eqz p1, :cond_7

    .line 216
    .line 217
    iget-object v0, v3, LN/b;->h:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v0, Lio/flutter/view/b;

    .line 220
    .line 221
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 222
    .line 223
    const/16 v3, 0x1c

    .line 224
    .line 225
    if-lt v1, v3, :cond_6

    .line 226
    .line 227
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    goto :goto_1

    .line 231
    :cond_6
    iget-object v0, v0, Lio/flutter/view/b;->a:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v0, Lio/flutter/view/k;

    .line 234
    .line 235
    const/16 v1, 0x20

    .line 236
    .line 237
    invoke-virtual {v0, v2, v1}, Lio/flutter/view/k;->d(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0, v1}, Lio/flutter/view/k;->h(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 249
    .line 250
    .line 251
    :cond_7
    :goto_1
    invoke-virtual {p2, v5}, LN/Q;->b(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    return-void

    .line 255
    :sswitch_data_0
    .sparse-switch
        -0x43f42ffd -> :sswitch_4
        -0x26b86b97 -> :sswitch_3
        0x1bfa3 -> :sswitch_2
        0x5d154d8 -> :sswitch_1
        0x6ce9b27 -> :sswitch_0
    .end sparse-switch

    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public p()LG/m0;
    .locals 3

    .line 1
    iget-object v0, p0, LD/j;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LT0/q;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v1, LU0/l;->a:LD/j;

    .line 9
    .line 10
    sget-object v2, LT0/q;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 11
    .line 12
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    :cond_0
    check-cast v0, LG/m0;

    .line 20
    .line 21
    return-object v0
.end method

.method public t(ILp0/o;)V
    .locals 4

    .line 1
    iget-object v0, p0, LD/j;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/plugin/editing/j;

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/flutter/plugin/editing/j;->d()V

    .line 6
    .line 7
    .line 8
    iput-object p2, v0, Lio/flutter/plugin/editing/j;->f:Lp0/o;

    .line 9
    .line 10
    new-instance v1, LN/n;

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    invoke-direct {v1, v2, p1}, LN/n;-><init>(II)V

    .line 14
    .line 15
    .line 16
    iput-object v1, v0, Lio/flutter/plugin/editing/j;->e:LN/n;

    .line 17
    .line 18
    iget-object p1, v0, Lio/flutter/plugin/editing/j;->h:Lio/flutter/plugin/editing/e;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lio/flutter/plugin/editing/e;->e(Lio/flutter/plugin/editing/d;)V

    .line 21
    .line 22
    .line 23
    new-instance p1, Lio/flutter/plugin/editing/e;

    .line 24
    .line 25
    iget-object v1, p2, Lp0/o;->j:LG/n;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    iget-object v1, v1, LG/n;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Lp0/q;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v1, v2

    .line 36
    :goto_0
    iget-object v3, v0, Lio/flutter/plugin/editing/j;->a:Landroid/view/View;

    .line 37
    .line 38
    invoke-direct {p1, v1, v3}, Lio/flutter/plugin/editing/e;-><init>(Lp0/q;Landroid/view/View;)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, Lio/flutter/plugin/editing/j;->h:Lio/flutter/plugin/editing/e;

    .line 42
    .line 43
    invoke-virtual {v0, p2}, Lio/flutter/plugin/editing/j;->e(Lp0/o;)V

    .line 44
    .line 45
    .line 46
    const/4 p1, 0x1

    .line 47
    iput-boolean p1, v0, Lio/flutter/plugin/editing/j;->i:Z

    .line 48
    .line 49
    iget-object p1, v0, Lio/flutter/plugin/editing/j;->e:LN/n;

    .line 50
    .line 51
    iget p1, p1, LN/n;->b:I

    .line 52
    .line 53
    const/4 p2, 0x3

    .line 54
    if-ne p1, p2, :cond_1

    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    iput-boolean p1, v0, Lio/flutter/plugin/editing/j;->o:Z

    .line 58
    .line 59
    :cond_1
    iput-object v2, v0, Lio/flutter/plugin/editing/j;->l:Landroid/graphics/Rect;

    .line 60
    .line 61
    iget-object p1, v0, Lio/flutter/plugin/editing/j;->h:Lio/flutter/plugin/editing/e;

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Lio/flutter/plugin/editing/e;->a(Lio/flutter/plugin/editing/d;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, LD/j;->e:I

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
    const-string v1, "<"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LD/j;->f:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v1, 0x3e

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
    .end packed-switch
.end method

.method public u(DD[D)V
    .locals 19

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    move-wide/from16 v2, p3

    .line 4
    .line 5
    move-object/from16 v4, p5

    .line 6
    .line 7
    move-object/from16 v5, p0

    .line 8
    .line 9
    iget-object v6, v5, LD/j;->f:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v6, Lio/flutter/plugin/editing/j;

    .line 12
    .line 13
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const/4 v7, 0x4

    .line 17
    new-array v7, v7, [D

    .line 18
    .line 19
    const/4 v8, 0x3

    .line 20
    aget-wide v9, v4, v8

    .line 21
    .line 22
    const/16 v11, 0xf

    .line 23
    .line 24
    const/4 v12, 0x0

    .line 25
    const/4 v13, 0x1

    .line 26
    const-wide/16 v14, 0x0

    .line 27
    .line 28
    cmpl-double v16, v9, v14

    .line 29
    .line 30
    if-nez v16, :cond_0

    .line 31
    .line 32
    const/4 v9, 0x7

    .line 33
    aget-wide v9, v4, v9

    .line 34
    .line 35
    cmpl-double v16, v9, v14

    .line 36
    .line 37
    if-nez v16, :cond_0

    .line 38
    .line 39
    aget-wide v9, v4, v11

    .line 40
    .line 41
    const-wide/high16 v16, 0x3ff0000000000000L    # 1.0

    .line 42
    .line 43
    cmpl-double v18, v9, v16

    .line 44
    .line 45
    if-nez v18, :cond_0

    .line 46
    .line 47
    const/4 v9, 0x1

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/4 v9, 0x0

    .line 50
    :goto_0
    const/16 v10, 0xc

    .line 51
    .line 52
    aget-wide v16, v4, v10

    .line 53
    .line 54
    aget-wide v10, v4, v11

    .line 55
    .line 56
    div-double v16, v16, v10

    .line 57
    .line 58
    aput-wide v16, v7, v13

    .line 59
    .line 60
    aput-wide v16, v7, v12

    .line 61
    .line 62
    const/16 v16, 0xd

    .line 63
    .line 64
    aget-wide v16, v4, v16

    .line 65
    .line 66
    div-double v16, v16, v10

    .line 67
    .line 68
    aput-wide v16, v7, v8

    .line 69
    .line 70
    const/4 v10, 0x2

    .line 71
    aput-wide v16, v7, v10

    .line 72
    .line 73
    new-instance v11, Lio/flutter/plugin/editing/i;

    .line 74
    .line 75
    invoke-direct {v11, v9, v4, v7}, Lio/flutter/plugin/editing/i;-><init>(Z[D[D)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v11, v0, v1, v14, v15}, Lio/flutter/plugin/editing/i;->a(DD)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v11, v0, v1, v2, v3}, Lio/flutter/plugin/editing/i;->a(DD)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v11, v14, v15, v2, v3}, Lio/flutter/plugin/editing/i;->a(DD)V

    .line 85
    .line 86
    .line 87
    iget-object v0, v6, Lio/flutter/plugin/editing/j;->a:Landroid/view/View;

    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 102
    .line 103
    new-instance v1, Landroid/graphics/Rect;

    .line 104
    .line 105
    aget-wide v2, v7, v12

    .line 106
    .line 107
    float-to-double v11, v0

    .line 108
    mul-double v2, v2, v11

    .line 109
    .line 110
    double-to-int v0, v2

    .line 111
    aget-wide v2, v7, v10

    .line 112
    .line 113
    mul-double v2, v2, v11

    .line 114
    .line 115
    double-to-int v2, v2

    .line 116
    aget-wide v3, v7, v13

    .line 117
    .line 118
    mul-double v3, v3, v11

    .line 119
    .line 120
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 121
    .line 122
    .line 123
    move-result-wide v3

    .line 124
    double-to-int v3, v3

    .line 125
    aget-wide v8, v7, v8

    .line 126
    .line 127
    mul-double v8, v8, v11

    .line 128
    .line 129
    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    .line 130
    .line 131
    .line 132
    move-result-wide v7

    .line 133
    double-to-int v4, v7

    .line 134
    invoke-direct {v1, v0, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 135
    .line 136
    .line 137
    iput-object v1, v6, Lio/flutter/plugin/editing/j;->l:Landroid/graphics/Rect;

    .line 138
    .line 139
    return-void
.end method

.method public v(Lp0/q;)V
    .locals 12

    .line 1
    iget-object v0, p0, LD/j;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/plugin/editing/j;

    .line 4
    .line 5
    iget-object v1, v0, Lio/flutter/plugin/editing/j;->a:Landroid/view/View;

    .line 6
    .line 7
    iget-boolean v2, v0, Lio/flutter/plugin/editing/j;->i:Z

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-nez v2, :cond_3

    .line 11
    .line 12
    iget-object v2, v0, Lio/flutter/plugin/editing/j;->n:Lp0/q;

    .line 13
    .line 14
    if-eqz v2, :cond_3

    .line 15
    .line 16
    iget v4, v2, Lp0/q;->d:I

    .line 17
    .line 18
    if-ltz v4, :cond_3

    .line 19
    .line 20
    iget v5, v2, Lp0/q;->e:I

    .line 21
    .line 22
    if-le v5, v4, :cond_3

    .line 23
    .line 24
    sub-int/2addr v5, v4

    .line 25
    iget v6, p1, Lp0/q;->e:I

    .line 26
    .line 27
    iget v7, p1, Lp0/q;->d:I

    .line 28
    .line 29
    sub-int/2addr v6, v7

    .line 30
    const/4 v8, 0x1

    .line 31
    if-eq v5, v6, :cond_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    const/4 v6, 0x0

    .line 35
    :goto_0
    if-ge v6, v5, :cond_2

    .line 36
    .line 37
    iget-object v9, v2, Lp0/q;->a:Ljava/lang/String;

    .line 38
    .line 39
    add-int v10, v6, v4

    .line 40
    .line 41
    invoke-virtual {v9, v10}, Ljava/lang/String;->charAt(I)C

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    iget-object v10, p1, Lp0/q;->a:Ljava/lang/String;

    .line 46
    .line 47
    add-int v11, v6, v7

    .line 48
    .line 49
    invoke-virtual {v10, v11}, Ljava/lang/String;->charAt(I)C

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    if-eq v9, v10, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    const/4 v8, 0x0

    .line 60
    :goto_1
    iput-boolean v8, v0, Lio/flutter/plugin/editing/j;->i:Z

    .line 61
    .line 62
    :cond_3
    iput-object p1, v0, Lio/flutter/plugin/editing/j;->n:Lp0/q;

    .line 63
    .line 64
    iget-object v2, v0, Lio/flutter/plugin/editing/j;->h:Lio/flutter/plugin/editing/e;

    .line 65
    .line 66
    invoke-virtual {v2, p1}, Lio/flutter/plugin/editing/e;->f(Lp0/q;)V

    .line 67
    .line 68
    .line 69
    iget-boolean p1, v0, Lio/flutter/plugin/editing/j;->i:Z

    .line 70
    .line 71
    if-eqz p1, :cond_4

    .line 72
    .line 73
    iget-object p1, v0, Lio/flutter/plugin/editing/j;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 74
    .line 75
    invoke-virtual {p1, v1}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 76
    .line 77
    .line 78
    iput-boolean v3, v0, Lio/flutter/plugin/editing/j;->i:Z

    .line 79
    .line 80
    :cond_4
    return-void
.end method

.method public w(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LD/j;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;->setPaymentRequestEnabled(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public x(LG/m0;)V
    .locals 6

    .line 1
    const-string v0, "newState"

    .line 2
    .line 3
    invoke-static {p1, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    iget-object v0, p0, LD/j;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LT0/q;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object v1, LU0/l;->a:LD/j;

    .line 14
    .line 15
    sget-object v2, LT0/q;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 16
    .line 17
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-ne v2, v1, :cond_1

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    :cond_1
    move-object v3, v2

    .line 25
    check-cast v3, LG/m0;

    .line 26
    .line 27
    instance-of v4, v3, LG/f0;

    .line 28
    .line 29
    if-eqz v4, :cond_2

    .line 30
    .line 31
    const/4 v4, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    sget-object v4, LG/n0;->b:LG/n0;

    .line 34
    .line 35
    invoke-static {v3, v4}, LI0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    :goto_0
    if-eqz v4, :cond_3

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_3
    instance-of v4, v3, LG/d;

    .line 43
    .line 44
    if-eqz v4, :cond_4

    .line 45
    .line 46
    iget v4, v3, LG/m0;->a:I

    .line 47
    .line 48
    iget v5, p1, LG/m0;->a:I

    .line 49
    .line 50
    if-le v5, v4, :cond_5

    .line 51
    .line 52
    :goto_1
    move-object v3, p1

    .line 53
    goto :goto_2

    .line 54
    :cond_4
    instance-of v4, v3, LG/d0;

    .line 55
    .line 56
    if-eqz v4, :cond_8

    .line 57
    .line 58
    :cond_5
    :goto_2
    if-nez v2, :cond_6

    .line 59
    .line 60
    move-object v2, v1

    .line 61
    :cond_6
    if-nez v3, :cond_7

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_7
    move-object v1, v3

    .line 65
    :goto_3
    invoke-virtual {v0, v2, v1}, LT0/q;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_0

    .line 70
    .line 71
    return-void

    .line 72
    :cond_8
    new-instance p1, LO/c;

    .line 73
    .line 74
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 75
    .line 76
    .line 77
    throw p1
.end method
