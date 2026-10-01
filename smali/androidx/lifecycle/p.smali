.class public final synthetic Landroidx/lifecycle/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/lifecycle/p;->e:I

    iput-object p2, p0, Landroidx/lifecycle/p;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Landroidx/lifecycle/p;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/lifecycle/p;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lv0/c;

    .line 9
    .line 10
    const-string v1, "this$0"

    .line 11
    .line 12
    invoke-static {v0, v1}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-boolean v1, v0, Lv0/c;->j:Z

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    iget-object v1, v0, Lv0/c;->e:Ljava/lang/ref/ReferenceQueue;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 27
    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    iget-object v2, v0, Lv0/c;->f:Ljava/util/HashMap;

    .line 31
    .line 32
    instance-of v3, v2, LJ0/a;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    if-nez v3, :cond_1

    .line 36
    .line 37
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Ljava/lang/Long;

    .line 42
    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    iget-object v2, v0, Lv0/c;->c:Ljava/util/HashMap;

    .line 46
    .line 47
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    iget-object v2, v0, Lv0/c;->d:Ljava/util/HashMap;

    .line 51
    .line 52
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 56
    .line 57
    .line 58
    move-result-wide v2

    .line 59
    iget-object v5, v0, Lv0/c;->a:Lp0/b;

    .line 60
    .line 61
    new-instance v6, Lv0/h;

    .line 62
    .line 63
    invoke-direct {v6, v2, v3}, Lv0/h;-><init>(J)V

    .line 64
    .line 65
    .line 66
    iget-object v2, v5, Lp0/b;->f:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, Lv0/f;

    .line 69
    .line 70
    new-instance v3, LG/n;

    .line 71
    .line 72
    sget-object v5, Lv0/f;->b:Lx0/e;

    .line 73
    .line 74
    invoke-virtual {v5}, Lx0/e;->a()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    check-cast v5, Lq0/j;

    .line 79
    .line 80
    iget-object v2, v2, Lv0/f;->a:Lq0/f;

    .line 81
    .line 82
    const-string v7, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference"

    .line 83
    .line 84
    invoke-direct {v3, v2, v7, v5, v4}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    new-instance v2, Lg0/t;

    .line 92
    .line 93
    const/4 v4, 0x3

    .line 94
    invoke-direct {v2, v4, v6}, Lg0/t;-><init>(ILjava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, v1, v2}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_1
    const-string v0, "kotlin.collections.MutableMap"

    .line 102
    .line 103
    invoke-static {v2, v0}, LI0/s;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw v4

    .line 107
    :cond_2
    iget-object v1, v0, Lv0/c;->g:Landroid/os/Handler;

    .line 108
    .line 109
    iget-object v2, v0, Lv0/c;->h:Landroidx/lifecycle/p;

    .line 110
    .line 111
    iget-wide v3, v0, Lv0/c;->k:J

    .line 112
    .line 113
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 114
    .line 115
    .line 116
    :goto_1
    return-void

    .line 117
    :pswitch_0
    iget-object v0, p0, Landroidx/lifecycle/p;->f:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, Lj/s;

    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :pswitch_1
    iget-object v0, p0, Landroidx/lifecycle/p;->f:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v0, Lk0/b;

    .line 128
    .line 129
    iget-object v0, v0, Lk0/b;->b:Lk0/d;

    .line 130
    .line 131
    iget-object v0, v0, Lk0/d;->e:Lio/flutter/embedding/engine/FlutterJNI;

    .line 132
    .line 133
    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->prefetchDefaultFontManager()V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :pswitch_2
    const/4 v0, 0x0

    .line 138
    iget-object v1, p0, Landroidx/lifecycle/p;->f:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v1, Lio/flutter/plugin/platform/o;

    .line 141
    .line 142
    invoke-virtual {v1, v0}, Lio/flutter/plugin/platform/o;->e(Z)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :pswitch_3
    iget-object v0, p0, Landroidx/lifecycle/p;->f:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v0, Landroidx/lifecycle/s;

    .line 149
    .line 150
    const-string v1, "this$0"

    .line 151
    .line 152
    invoke-static {v0, v1}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    iget v1, v0, Landroidx/lifecycle/s;->f:I

    .line 156
    .line 157
    const/4 v2, 0x1

    .line 158
    iget-object v3, v0, Landroidx/lifecycle/s;->j:Landroidx/lifecycle/n;

    .line 159
    .line 160
    if-nez v1, :cond_3

    .line 161
    .line 162
    iput-boolean v2, v0, Landroidx/lifecycle/s;->g:Z

    .line 163
    .line 164
    sget-object v1, Landroidx/lifecycle/f;->ON_PAUSE:Landroidx/lifecycle/f;

    .line 165
    .line 166
    invoke-virtual {v3, v1}, Landroidx/lifecycle/n;->c(Landroidx/lifecycle/f;)V

    .line 167
    .line 168
    .line 169
    :cond_3
    iget v1, v0, Landroidx/lifecycle/s;->e:I

    .line 170
    .line 171
    if-nez v1, :cond_4

    .line 172
    .line 173
    iget-boolean v1, v0, Landroidx/lifecycle/s;->g:Z

    .line 174
    .line 175
    if-eqz v1, :cond_4

    .line 176
    .line 177
    sget-object v1, Landroidx/lifecycle/f;->ON_STOP:Landroidx/lifecycle/f;

    .line 178
    .line 179
    invoke-virtual {v3, v1}, Landroidx/lifecycle/n;->c(Landroidx/lifecycle/f;)V

    .line 180
    .line 181
    .line 182
    iput-boolean v2, v0, Landroidx/lifecycle/s;->h:Z

    .line 183
    .line 184
    :cond_4
    return-void

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
