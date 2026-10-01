.class public final synthetic Lv0/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Landroid/webkit/WebViewClient;

.field public final synthetic g:Landroid/webkit/WebView;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/HttpAuthHandler;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p6, p0, Lv0/X;->e:I

    iput-object p1, p0, Lv0/X;->f:Landroid/webkit/WebViewClient;

    iput-object p2, p0, Lv0/X;->g:Landroid/webkit/WebView;

    iput-object p3, p0, Lv0/X;->j:Ljava/lang/Object;

    iput-object p4, p0, Lv0/X;->h:Ljava/lang/String;

    iput-object p5, p0, Lv0/X;->i:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 2
    iput p6, p0, Lv0/X;->e:I

    iput-object p1, p0, Lv0/X;->f:Landroid/webkit/WebViewClient;

    iput-object p2, p0, Lv0/X;->g:Landroid/webkit/WebView;

    iput-object p3, p0, Lv0/X;->h:Ljava/lang/String;

    iput-object p4, p0, Lv0/X;->i:Ljava/lang/String;

    iput-object p5, p0, Lv0/X;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget v0, p0, Lv0/X;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v7, Lv0/n;

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    invoke-direct {v7, v0}, Lv0/n;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lv0/X;->f:Landroid/webkit/WebViewClient;

    .line 13
    .line 14
    move-object v2, v0

    .line 15
    check-cast v2, Lv0/d0;

    .line 16
    .line 17
    iget-object v1, v2, Lv0/d0;->a:Lv0/i;

    .line 18
    .line 19
    iget-object v3, p0, Lv0/X;->g:Landroid/webkit/WebView;

    .line 20
    .line 21
    iget-object v0, p0, Lv0/X;->j:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v4, v0

    .line 24
    check-cast v4, Landroid/webkit/HttpAuthHandler;

    .line 25
    .line 26
    iget-object v5, p0, Lv0/X;->h:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v6, p0, Lv0/X;->i:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual/range {v1 .. v7}, Lv0/i;->i(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/HttpAuthHandler;Ljava/lang/String;Ljava/lang/String;LH0/l;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_0
    new-instance v14, Lv0/n;

    .line 35
    .line 36
    const/4 v0, 0x3

    .line 37
    invoke-direct {v14, v0}, Lv0/n;-><init>(I)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lv0/X;->f:Landroid/webkit/WebViewClient;

    .line 41
    .line 42
    move-object v9, v0

    .line 43
    check-cast v9, Lv0/d0;

    .line 44
    .line 45
    iget-object v8, v9, Lv0/d0;->a:Lv0/i;

    .line 46
    .line 47
    iget-object v10, p0, Lv0/X;->g:Landroid/webkit/WebView;

    .line 48
    .line 49
    iget-object v11, p0, Lv0/X;->h:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v12, p0, Lv0/X;->i:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v0, p0, Lv0/X;->j:Ljava/lang/Object;

    .line 54
    .line 55
    move-object v13, v0

    .line 56
    check-cast v13, Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual/range {v8 .. v14}, Lv0/i;->k(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LH0/l;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_1
    new-instance v6, Lv0/n;

    .line 63
    .line 64
    const/4 v0, 0x2

    .line 65
    invoke-direct {v6, v0}, Lv0/n;-><init>(I)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lv0/X;->f:Landroid/webkit/WebViewClient;

    .line 69
    .line 70
    move-object v1, v0

    .line 71
    check-cast v1, Lv0/b0;

    .line 72
    .line 73
    iget-object v0, v1, Lv0/b0;->b:Lv0/i;

    .line 74
    .line 75
    iget-object v2, p0, Lv0/X;->g:Landroid/webkit/WebView;

    .line 76
    .line 77
    iget-object v3, p0, Lv0/X;->j:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v3, Landroid/webkit/HttpAuthHandler;

    .line 80
    .line 81
    iget-object v4, p0, Lv0/X;->h:Ljava/lang/String;

    .line 82
    .line 83
    iget-object v5, p0, Lv0/X;->i:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual/range {v0 .. v6}, Lv0/i;->i(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/HttpAuthHandler;Ljava/lang/String;Ljava/lang/String;LH0/l;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :pswitch_2
    new-instance v13, Lv0/n;

    .line 90
    .line 91
    const/4 v0, 0x2

    .line 92
    invoke-direct {v13, v0}, Lv0/n;-><init>(I)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Lv0/X;->f:Landroid/webkit/WebViewClient;

    .line 96
    .line 97
    move-object v8, v0

    .line 98
    check-cast v8, Lv0/b0;

    .line 99
    .line 100
    iget-object v7, v8, Lv0/b0;->b:Lv0/i;

    .line 101
    .line 102
    iget-object v9, p0, Lv0/X;->g:Landroid/webkit/WebView;

    .line 103
    .line 104
    iget-object v10, p0, Lv0/X;->h:Ljava/lang/String;

    .line 105
    .line 106
    iget-object v11, p0, Lv0/X;->i:Ljava/lang/String;

    .line 107
    .line 108
    iget-object v0, p0, Lv0/X;->j:Ljava/lang/Object;

    .line 109
    .line 110
    move-object v12, v0

    .line 111
    check-cast v12, Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual/range {v7 .. v13}, Lv0/i;->k(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LH0/l;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
