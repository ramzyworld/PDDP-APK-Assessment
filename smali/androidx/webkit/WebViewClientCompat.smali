.class public abstract Landroidx/webkit/WebViewClientCompat;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"

# interfaces
.implements Lorg/chromium/support_lib_boundary/WebViewClientBoundaryInterface;


# static fields
.field public static final a:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "SHOULD_OVERRIDE_WITH_REDIRECTS"

    .line 2
    .line 3
    const-string v1, "SAFE_BROWSING_HIT"

    .line 4
    .line 5
    const-string v2, "VISUAL_STATE_CALLBACK"

    .line 6
    .line 7
    const-string v3, "RECEIVE_WEB_RESOURCE_ERROR"

    .line 8
    .line 9
    const-string v4, "RECEIVE_HTTP_ERROR"

    .line 10
    .line 11
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Landroidx/webkit/WebViewClientCompat;->a:[Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a(LN/Q;)V
    .locals 2

    .line 1
    const-string v0, "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL"

    .line 2
    .line 3
    invoke-static {v0}, La1/a;->r(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    sget-object v0, LT/m;->c:LT/b;

    .line 10
    .line 11
    invoke-virtual {v0}, LT/b;->a()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, LN/Q;->f:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Landroid/webkit/SafeBrowsingResponse;

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    sget-object v0, LT/n;->a:LD/j;

    .line 24
    .line 25
    iget-object v1, p0, LN/Q;->g:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lorg/chromium/support_lib_boundary/SafeBrowsingResponseBoundaryInterface;

    .line 28
    .line 29
    invoke-static {v1}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget-object v0, v0, LD/j;->f:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    .line 36
    .line 37
    invoke-interface {v0, v1}, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;->convertSafeBrowsingResponse(Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, LT/e;->a(Ljava/lang/Object;)Landroid/webkit/SafeBrowsingResponse;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, LN/Q;->f:Ljava/lang/Object;

    .line 46
    .line 47
    :cond_0
    iget-object p0, p0, LN/Q;->f:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, Landroid/webkit/SafeBrowsingResponse;

    .line 50
    .line 51
    invoke-static {p0}, LT/e;->b(Landroid/webkit/SafeBrowsingResponse;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {v0}, LT/c;->b()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    iget-object v0, p0, LN/Q;->g:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Lorg/chromium/support_lib_boundary/SafeBrowsingResponseBoundaryInterface;

    .line 64
    .line 65
    if-nez v0, :cond_2

    .line 66
    .line 67
    sget-object v0, LT/n;->a:LD/j;

    .line 68
    .line 69
    iget-object v1, p0, LN/Q;->f:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, Landroid/webkit/SafeBrowsingResponse;

    .line 72
    .line 73
    iget-object v0, v0, LD/j;->f:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    .line 76
    .line 77
    invoke-interface {v0, v1}, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;->convertSafeBrowsingResponse(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-class v1, Lorg/chromium/support_lib_boundary/SafeBrowsingResponseBoundaryInterface;

    .line 82
    .line 83
    invoke-static {v1, v0}, La1/a;->d(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Lorg/chromium/support_lib_boundary/SafeBrowsingResponseBoundaryInterface;

    .line 88
    .line 89
    iput-object v0, p0, LN/Q;->g:Ljava/lang/Object;

    .line 90
    .line 91
    :cond_2
    iget-object p0, p0, LN/Q;->g:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p0, Lorg/chromium/support_lib_boundary/SafeBrowsingResponseBoundaryInterface;

    .line 94
    .line 95
    const/4 v0, 0x1

    .line 96
    invoke-interface {p0, v0}, Lorg/chromium/support_lib_boundary/SafeBrowsingResponseBoundaryInterface;->showInterstitial(Z)V

    .line 97
    .line 98
    .line 99
    :goto_0
    return-void

    .line 100
    :cond_3
    invoke-static {}, LT/m;->a()Ljava/lang/UnsupportedOperationException;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    throw p0

    .line 105
    :cond_4
    invoke-static {}, LT/m;->a()Ljava/lang/UnsupportedOperationException;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    throw p0
.end method


# virtual methods
.method public final getSupportedFeatures()[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/webkit/WebViewClientCompat;->a:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 8

    .line 8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    return-void

    .line 9
    :cond_0
    new-instance v6, LT/i;

    .line 10
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p3, v6, LT/i;->a:Landroid/webkit/WebResourceError;

    .line 12
    move-object v3, p0

    check-cast v3, Lv0/b0;

    .line 13
    iget-object p3, v3, Lv0/b0;->b:Lv0/i;

    iget-object p3, p3, Lv0/i;->a:Lv/d;

    .line 14
    new-instance v0, Lv0/W;

    const/4 v7, 0x0

    move-object v2, v0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v2 .. v7}, Lv0/W;-><init>(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 15
    invoke-virtual {p3, v0}, Lv/d;->c(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Ljava/lang/reflect/InvocationHandler;)V
    .locals 7

    .line 1
    new-instance v4, LT/i;

    .line 2
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 3
    const-class v0, Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;

    invoke-static {v0, p3}, La1/a;->d(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;

    iput-object p3, v4, LT/i;->b:Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;

    .line 4
    move-object v1, p0

    check-cast v1, Lv0/b0;

    .line 5
    iget-object p3, v1, Lv0/b0;->b:Lv0/i;

    iget-object p3, p3, Lv0/i;->a:Lv/d;

    .line 6
    new-instance v6, Lv0/W;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lv0/W;-><init>(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 7
    invoke-virtual {p3, v6}, Lv/d;->c(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final onSafeBrowsingHit(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;ILandroid/webkit/SafeBrowsingResponse;)V
    .locals 0

    .line 5
    new-instance p1, LN/Q;

    const/4 p2, 0x1

    const/4 p3, 0x0

    .line 6
    invoke-direct {p1, p2, p3}, LN/Q;-><init>(IZ)V

    .line 7
    iput-object p4, p1, LN/Q;->f:Ljava/lang/Object;

    .line 8
    invoke-static {p1}, Landroidx/webkit/WebViewClientCompat;->a(LN/Q;)V

    return-void
.end method

.method public final onSafeBrowsingHit(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;ILjava/lang/reflect/InvocationHandler;)V
    .locals 0

    .line 1
    new-instance p1, LN/Q;

    const/4 p2, 0x1

    const/4 p3, 0x0

    .line 2
    invoke-direct {p1, p2, p3}, LN/Q;-><init>(IZ)V

    .line 3
    const-class p2, Lorg/chromium/support_lib_boundary/SafeBrowsingResponseBoundaryInterface;

    invoke-static {p2, p4}, La1/a;->d(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/chromium/support_lib_boundary/SafeBrowsingResponseBoundaryInterface;

    iput-object p2, p1, LN/Q;->g:Ljava/lang/Object;

    .line 4
    invoke-static {p1}, Landroidx/webkit/WebViewClientCompat;->a(LN/Q;)V

    return-void
.end method
