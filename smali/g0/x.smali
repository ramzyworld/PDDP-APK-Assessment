.class public final synthetic Lg0/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lg0/x;->e:I

    iput-object p1, p0, Lg0/x;->f:Ljava/lang/Object;

    iput-object p2, p0, Lg0/x;->g:Ljava/lang/Object;

    iput-object p3, p0, Lg0/x;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Lg0/x;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lv0/n;

    .line 7
    .line 8
    const/4 v1, 0x3

    .line 9
    invoke-direct {v0, v1}, Lv0/n;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lg0/x;->f:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lv0/d0;

    .line 15
    .line 16
    iget-object v2, v1, Lv0/d0;->a:Lv0/i;

    .line 17
    .line 18
    iget-object v3, p0, Lg0/x;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Landroid/webkit/WebView;

    .line 21
    .line 22
    iget-object v4, p0, Lg0/x;->h:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v4, Landroid/webkit/WebResourceRequest;

    .line 25
    .line 26
    invoke-virtual {v2, v1, v3, v4, v0}, Lv0/i;->o(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;LH0/l;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    new-instance v0, Lv0/n;

    .line 31
    .line 32
    const/4 v1, 0x3

    .line 33
    invoke-direct {v0, v1}, Lv0/n;-><init>(I)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lg0/x;->f:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Lv0/d0;

    .line 39
    .line 40
    iget-object v2, v1, Lv0/d0;->a:Lv0/i;

    .line 41
    .line 42
    iget-object v3, p0, Lg0/x;->g:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, Landroid/webkit/WebView;

    .line 45
    .line 46
    iget-object v4, p0, Lg0/x;->h:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v4, Landroid/webkit/ClientCertRequest;

    .line 49
    .line 50
    invoke-virtual {v2, v1, v3, v4, v0}, Lv0/i;->g(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/ClientCertRequest;LH0/l;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_1
    new-instance v0, Lv0/n;

    .line 55
    .line 56
    const/4 v1, 0x2

    .line 57
    invoke-direct {v0, v1}, Lv0/n;-><init>(I)V

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Lg0/x;->f:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, Lv0/b0;

    .line 63
    .line 64
    iget-object v2, v1, Lv0/b0;->b:Lv0/i;

    .line 65
    .line 66
    iget-object v3, p0, Lg0/x;->g:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v3, Landroid/webkit/WebView;

    .line 69
    .line 70
    iget-object v4, p0, Lg0/x;->h:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v4, Landroid/webkit/WebResourceRequest;

    .line 73
    .line 74
    invoke-virtual {v2, v1, v3, v4, v0}, Lv0/i;->o(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;LH0/l;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :pswitch_2
    new-instance v0, Lv0/n;

    .line 79
    .line 80
    const/4 v1, 0x2

    .line 81
    invoke-direct {v0, v1}, Lv0/n;-><init>(I)V

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, Lg0/x;->f:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v1, Lv0/b0;

    .line 87
    .line 88
    iget-object v2, v1, Lv0/b0;->b:Lv0/i;

    .line 89
    .line 90
    iget-object v3, p0, Lg0/x;->g:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v3, Landroid/webkit/WebView;

    .line 93
    .line 94
    iget-object v4, p0, Lg0/x;->h:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v4, Landroid/webkit/ClientCertRequest;

    .line 97
    .line 98
    invoke-virtual {v2, v1, v3, v4, v0}, Lv0/i;->g(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/ClientCertRequest;LH0/l;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :pswitch_3
    iget-object v0, p0, Lg0/x;->f:Ljava/lang/Object;

    .line 103
    .line 104
    move-object v1, v0

    .line 105
    check-cast v1, Lg0/y;

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    iget-object v0, p0, Lg0/x;->g:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, Lg0/E;

    .line 113
    .line 114
    iget-wide v2, v0, Lg0/E;->b:J

    .line 115
    .line 116
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    iget-wide v4, v0, Lg0/E;->a:J

    .line 121
    .line 122
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    iget-object v0, p0, Lg0/x;->h:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, Landroid/view/KeyEvent;

    .line 129
    .line 130
    invoke-virtual {v0}, Landroid/view/KeyEvent;->getEventTime()J

    .line 131
    .line 132
    .line 133
    move-result-wide v5

    .line 134
    const/4 v2, 0x0

    .line 135
    invoke-virtual/range {v1 .. v6}, Lg0/y;->c(ZLjava/lang/Long;Ljava/lang/Long;J)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
