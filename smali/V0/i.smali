.class public final LV0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:I

.field public f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LV0/i;->e:I

    iput-object p2, p0, LV0/i;->g:Ljava/lang/Object;

    iput-object p3, p0, LV0/i;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 2
    iput p3, p0, LV0/i;->e:I

    iput-object p1, p0, LV0/i;->f:Ljava/lang/Object;

    iput-object p2, p0, LV0/i;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, LV0/i;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LV0/i;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lv/f;

    .line 9
    .line 10
    iget-object v1, p0, LV0/i;->g:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lv/f;->accept(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, LV0/i;->f:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lp0/b;

    .line 19
    .line 20
    iget-object v0, v0, Lp0/b;->f:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lj/s;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v1, p0, LV0/i;->g:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Landroid/graphics/Typeface;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lj/s;->b(Landroid/graphics/Typeface;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void

    .line 34
    :pswitch_1
    iget-object v0, p0, LV0/i;->f:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lj/t;

    .line 43
    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-boolean v1, v0, Lj/t;->m:Z

    .line 48
    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    iget-object v1, v0, Lj/t;->a:Landroid/widget/TextView;

    .line 52
    .line 53
    iget-object v2, p0, LV0/i;->g:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v2, Landroid/graphics/Typeface;

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 58
    .line 59
    .line 60
    iput-object v2, v0, Lj/t;->l:Landroid/graphics/Typeface;

    .line 61
    .line 62
    :cond_2
    :goto_0
    return-void

    .line 63
    :pswitch_2
    iget-object v0, p0, LV0/i;->g:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, Lj/i;

    .line 66
    .line 67
    iget-object v1, v0, Lj/i;->g:Li/j;

    .line 68
    .line 69
    if-eqz v1, :cond_3

    .line 70
    .line 71
    iget-object v1, v1, Li/j;->e:LD/j;

    .line 72
    .line 73
    if-eqz v1, :cond_3

    .line 74
    .line 75
    iget-object v1, v1, LD/j;->f:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, Landroidx/appcompat/widget/ActionMenuView;

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    :cond_3
    iget-object v1, v0, Lj/i;->k:Landroidx/appcompat/widget/ActionMenuView;

    .line 83
    .line 84
    if-eqz v1, :cond_6

    .line 85
    .line 86
    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    if-eqz v1, :cond_6

    .line 91
    .line 92
    iget-object v1, p0, LV0/i;->f:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v1, Lj/f;

    .line 95
    .line 96
    invoke-virtual {v1}, Li/n;->b()Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_4

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    iget-object v2, v1, Li/n;->e:Landroid/view/View;

    .line 104
    .line 105
    if-nez v2, :cond_5

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_5
    const/4 v2, 0x0

    .line 109
    invoke-virtual {v1, v2, v2, v2, v2}, Li/n;->d(IIZZ)V

    .line 110
    .line 111
    .line 112
    :goto_1
    iput-object v1, v0, Lj/i;->v:Lj/f;

    .line 113
    .line 114
    :cond_6
    :goto_2
    const/4 v1, 0x0

    .line 115
    iput-object v1, v0, Lj/i;->x:LV0/i;

    .line 116
    .line 117
    return-void

    .line 118
    :pswitch_3
    const/4 v0, 0x0

    .line 119
    :cond_7
    :try_start_0
    iget-object v1, p0, LV0/i;->f:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v1, Ljava/lang/Runnable;

    .line 122
    .line 123
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    .line 125
    .line 126
    goto :goto_3

    .line 127
    :catchall_0
    move-exception v1

    .line 128
    sget-object v2, Lz0/j;->e:Lz0/j;

    .line 129
    .line 130
    invoke-static {v1, v2}, LQ0/v;->d(Ljava/lang/Throwable;Lz0/i;)V

    .line 131
    .line 132
    .line 133
    :goto_3
    iget-object v1, p0, LV0/i;->g:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v1, LV0/j;

    .line 136
    .line 137
    invoke-virtual {v1}, LV0/j;->i()Ljava/lang/Runnable;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    if-nez v2, :cond_8

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_8
    iput-object v2, p0, LV0/i;->f:Ljava/lang/Object;

    .line 145
    .line 146
    add-int/lit8 v0, v0, 0x1

    .line 147
    .line 148
    const/16 v2, 0x10

    .line 149
    .line 150
    if-lt v0, v2, :cond_7

    .line 151
    .line 152
    iget-object v0, v1, LV0/j;->g:LX0/l;

    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v1, p0}, LX0/l;->e(Lz0/i;Ljava/lang/Runnable;)V

    .line 158
    .line 159
    .line 160
    :goto_4
    return-void

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
