.class public final synthetic Lv0/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq0/b;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Lv0/i;


# direct methods
.method public synthetic constructor <init>(Lv0/i;I)V
    .locals 0

    .line 1
    iput p2, p0, Lv0/M;->e:I

    iput-object p1, p0, Lv0/M;->f:Lv0/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/Object;LN/Q;)V
    .locals 6

    .line 1
    iget v0, p0, Lv0/M;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv0/M;->f:Lv0/i;

    .line 7
    .line 8
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 9
    .line 10
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    check-cast p1, Ljava/util/List;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string v3, "null cannot be cast to non-null type android.webkit.WebViewClient"

    .line 21
    .line 22
    invoke-static {v2, v3}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    check-cast v2, Landroid/webkit/WebViewClient;

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v4, "null cannot be cast to non-null type kotlin.Boolean"

    .line 33
    .line 34
    invoke-static {p1, v4}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    check-cast p1, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    :try_start_0
    instance-of v4, v2, Lv0/b0;

    .line 44
    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    check-cast v2, Lv0/b0;

    .line 48
    .line 49
    iput-boolean p1, v2, Lv0/b0;->c:Z

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    iget-object v0, v0, Lv0/i;->a:Lv/d;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 58
    .line 59
    const/16 v4, 0x18

    .line 60
    .line 61
    if-lt v0, v4, :cond_1

    .line 62
    .line 63
    const/4 v1, 0x1

    .line 64
    :cond_1
    if-eqz v1, :cond_2

    .line 65
    .line 66
    instance-of v0, v2, Lv0/d0;

    .line 67
    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    check-cast v2, Lv0/d0;

    .line 71
    .line 72
    iput-boolean p1, v2, Lv0/d0;->b:Z

    .line 73
    .line 74
    :goto_0
    const/4 p1, 0x0

    .line 75
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    goto :goto_2

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    goto :goto_1

    .line 82
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 83
    .line 84
    const-string v0, "This WebViewClient doesn\'t support setting the returnValueForShouldOverrideUrlLoading."

    .line 85
    .line 86
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    :goto_1
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    :goto_2
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :pswitch_0
    iget-object v0, p0, Lv0/M;->f:Lv0/i;

    .line 99
    .line 100
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 101
    .line 102
    invoke-static {p1, v1}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    check-cast p1, Ljava/util/List;

    .line 106
    .line 107
    const/4 v1, 0x0

    .line 108
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    const-string v2, "null cannot be cast to non-null type kotlin.Long"

    .line 113
    .line 114
    invoke-static {p1, v2}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    check-cast p1, Ljava/lang/Long;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 120
    .line 121
    .line 122
    move-result-wide v2

    .line 123
    :try_start_1
    iget-object p1, v0, Lv0/i;->a:Lv/d;

    .line 124
    .line 125
    iget-object p1, p1, Lv/d;->c:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p1, Lv0/c;

    .line 128
    .line 129
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 130
    .line 131
    const/16 v5, 0x18

    .line 132
    .line 133
    if-lt v4, v5, :cond_3

    .line 134
    .line 135
    const/4 v1, 0x1

    .line 136
    :cond_3
    if-eqz v1, :cond_4

    .line 137
    .line 138
    new-instance v1, Lv0/d0;

    .line 139
    .line 140
    invoke-direct {v1, v0}, Lv0/d0;-><init>(Lv0/i;)V

    .line 141
    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_4
    new-instance v1, Lv0/b0;

    .line 145
    .line 146
    invoke-direct {v1, v0}, Lv0/b0;-><init>(Lv0/i;)V

    .line 147
    .line 148
    .line 149
    :goto_3
    invoke-virtual {p1, v2, v3, v1}, Lv0/c;->a(JLjava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    const/4 p1, 0x0

    .line 153
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 154
    .line 155
    .line 156
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 157
    goto :goto_4

    .line 158
    :catchall_1
    move-exception p1

    .line 159
    invoke-static {p1}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    :goto_4
    invoke-virtual {p2, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
