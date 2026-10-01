.class public final synthetic LL/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LL/h;->e:I

    iput-object p2, p0, LL/h;->f:Ljava/lang/Object;

    iput-object p3, p0, LL/h;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, LL/h;->g:Ljava/lang/Object;

    .line 3
    .line 4
    iget-object v2, p0, LL/h;->f:Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    iget v4, p0, LL/h;->e:I

    .line 8
    .line 9
    packed-switch v4, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v4, Lv0/n;

    .line 13
    .line 14
    invoke-direct {v4, v3}, Lv0/n;-><init>(I)V

    .line 15
    .line 16
    .line 17
    check-cast v2, Lv0/t;

    .line 18
    .line 19
    iget-object v5, v2, Lv0/t;->b:Lv0/i;

    .line 20
    .line 21
    check-cast v1, Ljava/lang/String;

    .line 22
    .line 23
    const-string v6, "messageArg"

    .line 24
    .line 25
    invoke-static {v1, v6}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v5, v5, Lv0/i;->a:Lv/d;

    .line 29
    .line 30
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v5}, Lv/d;->a()Lq0/j;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    new-instance v7, LG/n;

    .line 38
    .line 39
    const-string v8, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage"

    .line 40
    .line 41
    const/4 v9, 0x0

    .line 42
    iget-object v5, v5, Lv/d;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v5, Lq0/f;

    .line 45
    .line 46
    invoke-direct {v7, v5, v8, v6, v9}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    const/4 v5, 0x2

    .line 50
    new-array v5, v5, [Ljava/lang/Object;

    .line 51
    .line 52
    aput-object v2, v5, v3

    .line 53
    .line 54
    aput-object v1, v5, v0

    .line 55
    .line 56
    invoke-static {v5}, Ly0/e;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    new-instance v1, Lv0/x;

    .line 61
    .line 62
    const/16 v2, 0xf

    .line 63
    .line 64
    invoke-direct {v1, v2, v4}, Lv0/x;-><init>(ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v7, v0, v1}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_0
    check-cast v2, Lj/s;

    .line 72
    .line 73
    check-cast v1, Landroid/graphics/Typeface;

    .line 74
    .line 75
    invoke-virtual {v2, v1}, Lj/s;->b(Landroid/graphics/Typeface;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :pswitch_1
    check-cast v2, Landroidx/profileinstaller/ProfileInstallerInitializer;

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 85
    .line 86
    const/16 v4, 0x1c

    .line 87
    .line 88
    if-lt v2, v4, :cond_0

    .line 89
    .line 90
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-static {v2}, LL/m;->a(Landroid/os/Looper;)Landroid/os/Handler;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    goto :goto_0

    .line 99
    :cond_0
    new-instance v2, Landroid/os/Handler;

    .line 100
    .line 101
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-direct {v2, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 106
    .line 107
    .line 108
    :goto_0
    new-instance v4, Ljava/util/Random;

    .line 109
    .line 110
    invoke-direct {v4}, Ljava/util/Random;-><init>()V

    .line 111
    .line 112
    .line 113
    const/16 v5, 0x3e8

    .line 114
    .line 115
    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    invoke-virtual {v4, v0}, Ljava/util/Random;->nextInt(I)I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    new-instance v4, LL/i;

    .line 124
    .line 125
    check-cast v1, Landroid/content/Context;

    .line 126
    .line 127
    invoke-direct {v4, v1, v3}, LL/i;-><init>(Landroid/content/Context;I)V

    .line 128
    .line 129
    .line 130
    add-int/lit16 v0, v0, 0x1388

    .line 131
    .line 132
    int-to-long v0, v0

    .line 133
    invoke-virtual {v2, v4, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
