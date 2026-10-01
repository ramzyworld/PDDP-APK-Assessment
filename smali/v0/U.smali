.class public final Lv0/U;
.super Lv0/Q;
.source "SourceFile"


# static fields
.field public static final synthetic h:I


# instance fields
.field public final b:Lv0/i;

.field public c:Z

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Z


# direct methods
.method public constructor <init>(Lv0/i;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lv0/U;->c:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lv0/U;->d:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lv0/U;->e:Z

    .line 10
    .line 11
    iput-boolean v0, p0, Lv0/U;->f:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Lv0/U;->g:Z

    .line 14
    .line 15
    iput-object p1, p0, Lv0/U;->b:Lv0/i;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    new-instance v2, Lv0/n;

    .line 4
    .line 5
    invoke-direct {v2, v1}, Lv0/n;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v3, p0, Lv0/U;->b:Lv0/i;

    .line 9
    .line 10
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v4, "messageArg"

    .line 14
    .line 15
    invoke-static {p1, v4}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v3, v3, Lv0/i;->a:Lv/d;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Lv/d;->a()Lq0/j;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    new-instance v5, LG/n;

    .line 28
    .line 29
    const-string v6, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage"

    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    iget-object v3, v3, Lv/d;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v3, Lq0/f;

    .line 35
    .line 36
    invoke-direct {v5, v3, v6, v4, v7}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    new-array v3, v0, [Ljava/lang/Object;

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    aput-object p0, v3, v4

    .line 43
    .line 44
    aput-object p1, v3, v1

    .line 45
    .line 46
    invoke-static {v3}, Ly0/e;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    new-instance v1, Lv0/H;

    .line 51
    .line 52
    invoke-direct {v1, v0, v2}, Lv0/H;-><init>(ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5, p1, v1}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 56
    .line 57
    .line 58
    iget-boolean p1, p0, Lv0/U;->d:Z

    .line 59
    .line 60
    return p1
.end method

.method public final onGeolocationPermissionsHidePrompt()V
    .locals 6

    .line 1
    new-instance v0, Lv0/n;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lv0/n;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lv0/U;->b:Lv0/i;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, v1, Lv0/i;->a:Lv/d;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lv/d;->a()Lq0/j;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    new-instance v3, LG/n;

    .line 22
    .line 23
    const-string v4, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt"

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    iget-object v1, v1, Lv/d;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lq0/f;

    .line 29
    .line 30
    invoke-direct {v3, v1, v4, v2, v5}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p0}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    new-instance v2, Lv0/H;

    .line 38
    .line 39
    const/4 v4, 0x4

    .line 40
    invoke-direct {v2, v4, v0}, Lv0/H;-><init>(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v1, v2}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V
    .locals 8

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x1

    .line 3
    new-instance v2, Lv0/n;

    .line 4
    .line 5
    invoke-direct {v2, v1}, Lv0/n;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v3, p0, Lv0/U;->b:Lv0/i;

    .line 9
    .line 10
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v4, "originArg"

    .line 14
    .line 15
    invoke-static {p1, v4}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v4, "callbackArg"

    .line 19
    .line 20
    invoke-static {p2, v4}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v3, v3, Lv0/i;->a:Lv/d;

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3}, Lv/d;->a()Lq0/j;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    new-instance v5, LG/n;

    .line 33
    .line 34
    const-string v6, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt"

    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    iget-object v3, v3, Lv/d;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v3, Lq0/f;

    .line 40
    .line 41
    invoke-direct {v5, v3, v6, v4, v7}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    new-array v3, v0, [Ljava/lang/Object;

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    aput-object p0, v3, v4

    .line 48
    .line 49
    aput-object p1, v3, v1

    .line 50
    .line 51
    const/4 p1, 0x2

    .line 52
    aput-object p2, v3, p1

    .line 53
    .line 54
    invoke-static {v3}, Ly0/e;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    new-instance p2, Lv0/H;

    .line 59
    .line 60
    invoke-direct {p2, v0, v2}, Lv0/H;-><init>(ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5, p1, p2}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final onHideCustomView()V
    .locals 6

    .line 1
    new-instance v0, Lv0/n;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lv0/n;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lv0/U;->b:Lv0/i;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, v1, Lv0/i;->a:Lv/d;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lv/d;->a()Lq0/j;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    new-instance v3, LG/n;

    .line 22
    .line 23
    const-string v4, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView"

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    iget-object v1, v1, Lv/d;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lq0/f;

    .line 29
    .line 30
    invoke-direct {v3, v1, v4, v2, v5}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p0}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    new-instance v2, Lv0/x;

    .line 38
    .line 39
    const/16 v4, 0x1c

    .line 40
    .line 41
    invoke-direct {v2, v4, v0}, Lv0/x;-><init>(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v1, v2}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x4

    .line 3
    const/4 v2, 0x1

    .line 4
    iget-boolean v3, p0, Lv0/U;->e:Z

    .line 5
    .line 6
    if-eqz v3, :cond_0

    .line 7
    .line 8
    new-instance v3, Lv0/S;

    .line 9
    .line 10
    invoke-direct {v3, p0, p4, v2}, Lv0/S;-><init>(Lv0/U;Landroid/webkit/JsResult;I)V

    .line 11
    .line 12
    .line 13
    new-instance p4, LG/M;

    .line 14
    .line 15
    invoke-direct {p4, v1, v3}, LG/M;-><init>(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object v3, p0, Lv0/U;->b:Lv0/i;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const-string v4, "webViewArg"

    .line 24
    .line 25
    invoke-static {p1, v4}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v4, "urlArg"

    .line 29
    .line 30
    invoke-static {p2, v4}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v4, "messageArg"

    .line 34
    .line 35
    invoke-static {p3, v4}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object v3, v3, Lv0/i;->a:Lv/d;

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Lv/d;->a()Lq0/j;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    new-instance v5, LG/n;

    .line 48
    .line 49
    const-string v6, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert"

    .line 50
    .line 51
    const/4 v7, 0x0

    .line 52
    iget-object v3, v3, Lv/d;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v3, Lq0/f;

    .line 55
    .line 56
    invoke-direct {v5, v3, v6, v4, v7}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    new-array v1, v1, [Ljava/lang/Object;

    .line 60
    .line 61
    aput-object p0, v1, v0

    .line 62
    .line 63
    aput-object p1, v1, v2

    .line 64
    .line 65
    const/4 p1, 0x2

    .line 66
    aput-object p2, v1, p1

    .line 67
    .line 68
    const/4 p1, 0x3

    .line 69
    aput-object p3, v1, p1

    .line 70
    .line 71
    invoke-static {v1}, Ly0/e;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    new-instance p2, Lv0/G;

    .line 76
    .line 77
    invoke-direct {p2, p4, v2}, Lv0/G;-><init>(LG/M;I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5, p1, p2}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 81
    .line 82
    .line 83
    return v2

    .line 84
    :cond_0
    return v0
.end method

.method public final onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 9

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x4

    .line 4
    const/4 v3, 0x0

    .line 5
    iget-boolean v4, p0, Lv0/U;->f:Z

    .line 6
    .line 7
    if-eqz v4, :cond_0

    .line 8
    .line 9
    new-instance v4, Lv0/S;

    .line 10
    .line 11
    invoke-direct {v4, p0, p4, v3}, Lv0/S;-><init>(Lv0/U;Landroid/webkit/JsResult;I)V

    .line 12
    .line 13
    .line 14
    new-instance p4, LG/M;

    .line 15
    .line 16
    invoke-direct {p4, v2, v4}, LG/M;-><init>(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v4, p0, Lv0/U;->b:Lv0/i;

    .line 20
    .line 21
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const-string v5, "webViewArg"

    .line 25
    .line 26
    invoke-static {p1, v5}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v5, "urlArg"

    .line 30
    .line 31
    invoke-static {p2, v5}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v5, "messageArg"

    .line 35
    .line 36
    invoke-static {p3, v5}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object v4, v4, Lv0/i;->a:Lv/d;

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    new-instance v6, LG/n;

    .line 49
    .line 50
    const-string v7, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm"

    .line 51
    .line 52
    const/4 v8, 0x0

    .line 53
    iget-object v4, v4, Lv/d;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v4, Lq0/f;

    .line 56
    .line 57
    invoke-direct {v6, v4, v7, v5, v8}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-array v2, v2, [Ljava/lang/Object;

    .line 61
    .line 62
    aput-object p0, v2, v3

    .line 63
    .line 64
    aput-object p1, v2, v1

    .line 65
    .line 66
    const/4 p1, 0x2

    .line 67
    aput-object p2, v2, p1

    .line 68
    .line 69
    aput-object p3, v2, v0

    .line 70
    .line 71
    invoke-static {v2}, Ly0/e;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    new-instance p2, Lv0/G;

    .line 76
    .line 77
    invoke-direct {p2, p4, v0}, Lv0/G;-><init>(LG/M;I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v6, p1, p2}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 81
    .line 82
    .line 83
    return v1

    .line 84
    :cond_0
    return v3
.end method

.method public final onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x4

    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x0

    .line 5
    iget-boolean v4, p0, Lv0/U;->g:Z

    .line 6
    .line 7
    if-eqz v4, :cond_0

    .line 8
    .line 9
    new-instance v4, Lv0/S;

    .line 10
    .line 11
    invoke-direct {v4, p0, p5, v2}, Lv0/S;-><init>(Lv0/U;Landroid/webkit/JsResult;I)V

    .line 12
    .line 13
    .line 14
    new-instance p5, LG/M;

    .line 15
    .line 16
    invoke-direct {p5, v1, v4}, LG/M;-><init>(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v4, p0, Lv0/U;->b:Lv0/i;

    .line 20
    .line 21
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const-string v5, "webViewArg"

    .line 25
    .line 26
    invoke-static {p1, v5}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v5, "urlArg"

    .line 30
    .line 31
    invoke-static {p2, v5}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v5, "messageArg"

    .line 35
    .line 36
    invoke-static {p3, v5}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v5, "defaultValueArg"

    .line 40
    .line 41
    invoke-static {p4, v5}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object v4, v4, Lv0/i;->a:Lv/d;

    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4}, Lv/d;->a()Lq0/j;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    new-instance v6, LG/n;

    .line 54
    .line 55
    const-string v7, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt"

    .line 56
    .line 57
    const/4 v8, 0x0

    .line 58
    iget-object v4, v4, Lv/d;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v4, Lq0/f;

    .line 61
    .line 62
    invoke-direct {v6, v4, v7, v5, v8}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    const/4 v4, 0x5

    .line 66
    new-array v4, v4, [Ljava/lang/Object;

    .line 67
    .line 68
    aput-object p0, v4, v3

    .line 69
    .line 70
    aput-object p1, v4, v0

    .line 71
    .line 72
    aput-object p2, v4, v2

    .line 73
    .line 74
    const/4 p1, 0x3

    .line 75
    aput-object p3, v4, p1

    .line 76
    .line 77
    aput-object p4, v4, v1

    .line 78
    .line 79
    invoke-static {v4}, Ly0/e;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    new-instance p2, Lv0/G;

    .line 84
    .line 85
    invoke-direct {p2, p5, v3}, Lv0/G;-><init>(LG/M;I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v6, p1, p2}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 89
    .line 90
    .line 91
    return v0

    .line 92
    :cond_0
    return v3
.end method

.method public final onPermissionRequest(Landroid/webkit/PermissionRequest;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    new-instance v2, Lv0/n;

    .line 4
    .line 5
    invoke-direct {v2, v1}, Lv0/n;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v3, p0, Lv0/U;->b:Lv0/i;

    .line 9
    .line 10
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v4, "requestArg"

    .line 14
    .line 15
    invoke-static {p1, v4}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v3, v3, Lv0/i;->a:Lv/d;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Lv/d;->a()Lq0/j;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    new-instance v5, LG/n;

    .line 28
    .line 29
    const-string v6, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest"

    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    iget-object v3, v3, Lv/d;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v3, Lq0/f;

    .line 35
    .line 36
    invoke-direct {v5, v3, v6, v4, v7}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    const/4 v3, 0x2

    .line 40
    new-array v3, v3, [Ljava/lang/Object;

    .line 41
    .line 42
    aput-object p0, v3, v0

    .line 43
    .line 44
    aput-object p1, v3, v1

    .line 45
    .line 46
    invoke-static {v3}, Ly0/e;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    new-instance v1, Lv0/H;

    .line 51
    .line 52
    invoke-direct {v1, v0, v2}, Lv0/H;-><init>(ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5, p1, v1}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    int-to-long v1, p2

    .line 3
    new-instance p2, Lv0/n;

    .line 4
    .line 5
    invoke-direct {p2, v0}, Lv0/n;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v3, p0, Lv0/U;->b:Lv0/i;

    .line 9
    .line 10
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v4, "webViewArg"

    .line 14
    .line 15
    invoke-static {p1, v4}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v3, v3, Lv0/i;->a:Lv/d;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Lv/d;->a()Lq0/j;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    new-instance v5, LG/n;

    .line 28
    .line 29
    const-string v6, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged"

    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    iget-object v3, v3, Lv/d;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v3, Lq0/f;

    .line 35
    .line 36
    invoke-direct {v5, v3, v6, v4, v7}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/4 v2, 0x3

    .line 44
    new-array v2, v2, [Ljava/lang/Object;

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    aput-object p0, v2, v3

    .line 48
    .line 49
    aput-object p1, v2, v0

    .line 50
    .line 51
    const/4 p1, 0x2

    .line 52
    aput-object v1, v2, p1

    .line 53
    .line 54
    invoke-static {v2}, Ly0/e;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    new-instance v0, Lv0/x;

    .line 59
    .line 60
    const/16 v1, 0x1d

    .line 61
    .line 62
    invoke-direct {v0, v1, p2}, Lv0/x;-><init>(ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5, p1, v0}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    new-instance v1, Lv0/n;

    .line 3
    .line 4
    invoke-direct {v1, v0}, Lv0/n;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v2, p0, Lv0/U;->b:Lv0/i;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-string v3, "viewArg"

    .line 13
    .line 14
    invoke-static {p1, v3}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v3, "callbackArg"

    .line 18
    .line 19
    invoke-static {p2, v3}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v2, v2, Lv0/i;->a:Lv/d;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Lv/d;->a()Lq0/j;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    new-instance v4, LG/n;

    .line 32
    .line 33
    const-string v5, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView"

    .line 34
    .line 35
    const/4 v6, 0x0

    .line 36
    iget-object v2, v2, Lv/d;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, Lq0/f;

    .line 39
    .line 40
    invoke-direct {v4, v2, v5, v3, v6}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    const/4 v2, 0x3

    .line 44
    new-array v2, v2, [Ljava/lang/Object;

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    aput-object p0, v2, v3

    .line 48
    .line 49
    aput-object p1, v2, v0

    .line 50
    .line 51
    const/4 p1, 0x2

    .line 52
    aput-object p2, v2, p1

    .line 53
    .line 54
    invoke-static {v2}, Ly0/e;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    new-instance p2, Lv0/H;

    .line 59
    .line 60
    invoke-direct {p2, v0, v1}, Lv0/H;-><init>(ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, p1, p2}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    iget-boolean v1, p0, Lv0/U;->c:Z

    .line 3
    .line 4
    new-instance v2, Lv0/T;

    .line 5
    .line 6
    invoke-direct {v2, p0, v1, p2}, Lv0/T;-><init>(Lv0/U;ZLandroid/webkit/ValueCallback;)V

    .line 7
    .line 8
    .line 9
    new-instance p2, LG/M;

    .line 10
    .line 11
    const/4 v3, 0x4

    .line 12
    invoke-direct {p2, v3, v2}, LG/M;-><init>(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, Lv0/U;->b:Lv0/i;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const-string v3, "webViewArg"

    .line 21
    .line 22
    invoke-static {p1, v3}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v3, "paramsArg"

    .line 26
    .line 27
    invoke-static {p3, v3}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v2, v2, Lv0/i;->a:Lv/d;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Lv/d;->a()Lq0/j;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    new-instance v4, LG/n;

    .line 40
    .line 41
    const-string v5, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser"

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    iget-object v2, v2, Lv/d;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Lq0/f;

    .line 47
    .line 48
    invoke-direct {v4, v2, v5, v3, v6}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    const/4 v2, 0x3

    .line 52
    new-array v2, v2, [Ljava/lang/Object;

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    aput-object p0, v2, v3

    .line 56
    .line 57
    const/4 v3, 0x1

    .line 58
    aput-object p1, v2, v3

    .line 59
    .line 60
    aput-object p3, v2, v0

    .line 61
    .line 62
    invoke-static {v2}, Ly0/e;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    new-instance p3, Lv0/G;

    .line 67
    .line 68
    invoke-direct {p3, p2, v0}, Lv0/G;-><init>(LG/M;I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4, p1, p3}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 72
    .line 73
    .line 74
    return v1
.end method
