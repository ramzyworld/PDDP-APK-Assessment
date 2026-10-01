.class public abstract La/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ljava/lang/reflect/Method;

.field public static b:Z

.field public static c:Ljava/lang/reflect/Field;

.field public static d:Z


# direct methods
.method public static A(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    :try_start_0
    const-string v1, "r"

    .line 7
    .line 8
    invoke-virtual {p0, p1, v1, v0}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-nez p0, :cond_1

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    :cond_0
    return-object v0

    .line 20
    :cond_1
    :try_start_1
    new-instance p1, Ljava/io/FileInputStream;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-direct {p1, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    .line 29
    :try_start_2
    invoke-virtual {p1}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    .line 34
    .line 35
    .line 36
    move-result-wide v6

    .line 37
    sget-object v3, Ljava/nio/channels/FileChannel$MapMode;->READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;

    .line 38
    .line 39
    const-wide/16 v4, 0x0

    .line 40
    .line 41
    invoke-virtual/range {v2 .. v7}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 42
    .line 43
    .line 44
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 45
    :try_start_3
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 46
    .line 47
    .line 48
    :try_start_4
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 49
    .line 50
    .line 51
    return-object v1

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto :goto_1

    .line 54
    :catchall_1
    move-exception v1

    .line 55
    :try_start_5
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_2
    move-exception p1

    .line 60
    :try_start_6
    invoke-virtual {v1, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    :goto_0
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 64
    :goto_1
    :try_start_7
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :catchall_3
    move-exception p0

    .line 69
    :try_start_8
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    :goto_2
    throw p1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    .line 73
    :catch_0
    return-object v0
.end method

.method public static E(Lj/r;Z)V
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1}, LD/n;->c(Landroid/widget/PopupWindow;Z)V

    .line 8
    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    sget-boolean v0, La/a;->d:Z

    .line 12
    .line 13
    const-string v1, "PopupWindowCompatApi21"

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    :try_start_0
    const-class v2, Landroid/widget/PopupWindow;

    .line 19
    .line 20
    const-string v3, "mOverlapAnchor"

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    sput-object v2, La/a;->c:Ljava/lang/reflect/Field;

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catch_0
    move-exception v2

    .line 33
    const-string v3, "Could not fetch mOverlapAnchor field from PopupWindow"

    .line 34
    .line 35
    invoke-static {v1, v3, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 36
    .line 37
    .line 38
    :goto_0
    sput-boolean v0, La/a;->d:Z

    .line 39
    .line 40
    :cond_1
    sget-object v0, La/a;->c:Ljava/lang/reflect/Field;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    :try_start_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catch_1
    move-exception p0

    .line 53
    const-string p1, "Could not set overlap anchor field in PopupWindow"

    .line 54
    .line 55
    invoke-static {v1, p1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 56
    .line 57
    .line 58
    :cond_2
    :goto_1
    return-void
.end method

.method public static F(Lq0/f;Lv0/c;)V
    .locals 5

    .line 1
    const-string v0, "binaryMessenger"

    .line 2
    .line 3
    invoke-static {p0, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LG/n;

    .line 7
    .line 8
    sget-object v1, Lv0/f;->b:Lx0/e;

    .line 9
    .line 10
    invoke-virtual {v1}, Lx0/e;->a()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Lq0/j;

    .line 15
    .line 16
    const-string v3, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference"

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-direct {v0, p0, v3, v2, v4}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    new-instance v2, Lv0/d;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {v2, p1, v3}, Lv0/d;-><init>(Lv0/c;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v2}, LG/n;->g(Lq0/b;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v0, v4}, LG/n;->g(Lq0/b;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    new-instance v0, LG/n;

    .line 38
    .line 39
    invoke-virtual {v1}, Lx0/e;->a()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Lq0/j;

    .line 44
    .line 45
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.clear"

    .line 46
    .line 47
    invoke-direct {v0, p0, v2, v1, v4}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    new-instance p0, Lv0/d;

    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    invoke-direct {p0, p1, v1}, Lv0/d;-><init>(Lv0/c;I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p0}, LG/n;->g(Lq0/b;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    invoke-virtual {v0, v4}, LG/n;->g(Lq0/b;)V

    .line 63
    .line 64
    .line 65
    :goto_1
    return-void
.end method

.method public static G(Lq0/f;Lv0/i;)V
    .locals 5

    .line 1
    const-string v0, "binaryMessenger"

    .line 2
    .line 3
    invoke-static {p0, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p1, Lv0/i;->a:Lv/d;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lv/d;->a()Lq0/j;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, Lv0/b;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    :goto_0
    new-instance v1, LG/n;

    .line 23
    .line 24
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.CookieManager.instance"

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    new-instance v2, Lv0/z;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-direct {v2, p1, v4}, Lv0/z;-><init>(Lv0/i;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 43
    .line 44
    .line 45
    :goto_1
    new-instance v1, LG/n;

    .line 46
    .line 47
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setCookie"

    .line 48
    .line 49
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    new-instance v2, Lv0/z;

    .line 55
    .line 56
    const/4 v4, 0x1

    .line 57
    invoke-direct {v2, p1, v4}, Lv0/z;-><init>(Lv0/i;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 65
    .line 66
    .line 67
    :goto_2
    new-instance v1, LG/n;

    .line 68
    .line 69
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.CookieManager.removeAllCookies"

    .line 70
    .line 71
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    new-instance v2, Lv0/z;

    .line 77
    .line 78
    const/4 v4, 0x2

    .line 79
    invoke-direct {v2, p1, v4}, Lv0/z;-><init>(Lv0/i;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_3
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 87
    .line 88
    .line 89
    :goto_3
    new-instance v1, LG/n;

    .line 90
    .line 91
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setAcceptThirdPartyCookies"

    .line 92
    .line 93
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    if-eqz p1, :cond_4

    .line 97
    .line 98
    new-instance p0, Lv0/z;

    .line 99
    .line 100
    const/4 v0, 0x3

    .line 101
    invoke-direct {p0, p1, v0}, Lv0/z;-><init>(Lv0/i;I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, p0}, LG/n;->g(Lq0/b;)V

    .line 105
    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_4
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 109
    .line 110
    .line 111
    :goto_4
    return-void
.end method

.method public static H(Lq0/f;Lv0/i;)V
    .locals 5

    .line 1
    const-string v0, "binaryMessenger"

    .line 2
    .line 3
    invoke-static {p0, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p1, Lv0/i;->a:Lv/d;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lv/d;->a()Lq0/j;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, Lv0/b;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    :goto_0
    new-instance v1, LG/n;

    .line 23
    .line 24
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.useHttpAuthUsernamePassword"

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    new-instance v2, Lv0/C;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-direct {v2, p1, v4}, Lv0/C;-><init>(Lv0/i;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 43
    .line 44
    .line 45
    :goto_1
    new-instance v1, LG/n;

    .line 46
    .line 47
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.cancel"

    .line 48
    .line 49
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    new-instance v2, Lv0/C;

    .line 55
    .line 56
    const/4 v4, 0x1

    .line 57
    invoke-direct {v2, p1, v4}, Lv0/C;-><init>(Lv0/i;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 65
    .line 66
    .line 67
    :goto_2
    new-instance v1, LG/n;

    .line 68
    .line 69
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.proceed"

    .line 70
    .line 71
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    new-instance p0, Lv0/C;

    .line 77
    .line 78
    const/4 v0, 0x2

    .line 79
    invoke-direct {p0, p1, v0}, Lv0/C;-><init>(Lv0/i;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, p0}, LG/n;->g(Lq0/b;)V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_3
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 87
    .line 88
    .line 89
    :goto_3
    return-void
.end method

.method public static I(Lq0/f;Lv0/i;)V
    .locals 5

    .line 1
    const-string v0, "binaryMessenger"

    .line 2
    .line 3
    invoke-static {p0, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p1, Lv0/i;->a:Lv/d;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lv/d;->a()Lq0/j;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, Lv0/b;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    :goto_0
    new-instance v1, LG/n;

    .line 23
    .line 24
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getCName"

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    new-instance v2, Lv0/E;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-direct {v2, p1, v4}, Lv0/E;-><init>(Lv0/i;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 43
    .line 44
    .line 45
    :goto_1
    new-instance v1, LG/n;

    .line 46
    .line 47
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getDName"

    .line 48
    .line 49
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    new-instance v2, Lv0/E;

    .line 55
    .line 56
    const/4 v4, 0x1

    .line 57
    invoke-direct {v2, p1, v4}, Lv0/E;-><init>(Lv0/i;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 65
    .line 66
    .line 67
    :goto_2
    new-instance v1, LG/n;

    .line 68
    .line 69
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getOName"

    .line 70
    .line 71
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    new-instance v2, Lv0/E;

    .line 77
    .line 78
    const/4 v4, 0x2

    .line 79
    invoke-direct {v2, p1, v4}, Lv0/E;-><init>(Lv0/i;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_3
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 87
    .line 88
    .line 89
    :goto_3
    new-instance v1, LG/n;

    .line 90
    .line 91
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getUName"

    .line 92
    .line 93
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    if-eqz p1, :cond_4

    .line 97
    .line 98
    new-instance p0, Lv0/E;

    .line 99
    .line 100
    const/4 v0, 0x3

    .line 101
    invoke-direct {p0, p1, v0}, Lv0/E;-><init>(Lv0/i;I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, p0}, LG/n;->g(Lq0/b;)V

    .line 105
    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_4
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 109
    .line 110
    .line 111
    :goto_4
    return-void
.end method

.method public static J(Lq0/f;Lv0/i;)V
    .locals 5

    .line 1
    const-string v0, "binaryMessenger"

    .line 2
    .line 3
    invoke-static {p0, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p1, Lv0/i;->a:Lv/d;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lv/d;->a()Lq0/j;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, Lv0/b;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    :goto_0
    new-instance v1, LG/n;

    .line 23
    .line 24
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.pigeon_defaultConstructor"

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    new-instance v2, Lv0/I;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-direct {v2, p1, v4}, Lv0/I;-><init>(Lv0/i;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 43
    .line 44
    .line 45
    :goto_1
    new-instance v1, LG/n;

    .line 46
    .line 47
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnShowFileChooser"

    .line 48
    .line 49
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    new-instance v2, Lv0/I;

    .line 55
    .line 56
    const/4 v4, 0x1

    .line 57
    invoke-direct {v2, p1, v4}, Lv0/I;-><init>(Lv0/i;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 65
    .line 66
    .line 67
    :goto_2
    new-instance v1, LG/n;

    .line 68
    .line 69
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnConsoleMessage"

    .line 70
    .line 71
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    new-instance v2, Lv0/I;

    .line 77
    .line 78
    const/4 v4, 0x2

    .line 79
    invoke-direct {v2, p1, v4}, Lv0/I;-><init>(Lv0/i;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_3
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 87
    .line 88
    .line 89
    :goto_3
    new-instance v1, LG/n;

    .line 90
    .line 91
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsAlert"

    .line 92
    .line 93
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    if-eqz p1, :cond_4

    .line 97
    .line 98
    new-instance v2, Lv0/I;

    .line 99
    .line 100
    const/4 v4, 0x3

    .line 101
    invoke-direct {v2, p1, v4}, Lv0/I;-><init>(Lv0/i;I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 105
    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_4
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 109
    .line 110
    .line 111
    :goto_4
    new-instance v1, LG/n;

    .line 112
    .line 113
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsConfirm"

    .line 114
    .line 115
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    if-eqz p1, :cond_5

    .line 119
    .line 120
    new-instance v2, Lv0/I;

    .line 121
    .line 122
    const/4 v4, 0x4

    .line 123
    invoke-direct {v2, p1, v4}, Lv0/I;-><init>(Lv0/i;I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 127
    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_5
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 131
    .line 132
    .line 133
    :goto_5
    new-instance v1, LG/n;

    .line 134
    .line 135
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsPrompt"

    .line 136
    .line 137
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    if-eqz p1, :cond_6

    .line 141
    .line 142
    new-instance p0, Lv0/I;

    .line 143
    .line 144
    const/4 v0, 0x5

    .line 145
    invoke-direct {p0, p1, v0}, Lv0/I;-><init>(Lv0/i;I)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, p0}, LG/n;->g(Lq0/b;)V

    .line 149
    .line 150
    .line 151
    goto :goto_6

    .line 152
    :cond_6
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 153
    .line 154
    .line 155
    :goto_6
    return-void
.end method

.method public static K(Lq0/f;Lv0/i;)V
    .locals 5

    .line 1
    const-string v0, "binaryMessenger"

    .line 2
    .line 3
    invoke-static {p0, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p1, Lv0/i;->a:Lv/d;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lv/d;->a()Lq0/j;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, Lv0/b;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    :goto_0
    new-instance v1, LG/n;

    .line 23
    .line 24
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_defaultConstructor"

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    new-instance v2, Lv0/K;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-direct {v2, p1, v4}, Lv0/K;-><init>(Lv0/i;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 43
    .line 44
    .line 45
    :goto_1
    new-instance v1, LG/n;

    .line 46
    .line 47
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.settings"

    .line 48
    .line 49
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    new-instance v2, Lv0/K;

    .line 55
    .line 56
    const/4 v4, 0x2

    .line 57
    invoke-direct {v2, p1, v4}, Lv0/K;-><init>(Lv0/i;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 65
    .line 66
    .line 67
    :goto_2
    new-instance v1, LG/n;

    .line 68
    .line 69
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.loadData"

    .line 70
    .line 71
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    new-instance v2, Lv0/K;

    .line 77
    .line 78
    const/4 v4, 0x6

    .line 79
    invoke-direct {v2, p1, v4}, Lv0/K;-><init>(Lv0/i;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_3
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 87
    .line 88
    .line 89
    :goto_3
    new-instance v1, LG/n;

    .line 90
    .line 91
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.loadDataWithBaseUrl"

    .line 92
    .line 93
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    if-eqz p1, :cond_4

    .line 97
    .line 98
    new-instance v2, Lv0/K;

    .line 99
    .line 100
    const/4 v4, 0x7

    .line 101
    invoke-direct {v2, p1, v4}, Lv0/K;-><init>(Lv0/i;I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 105
    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_4
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 109
    .line 110
    .line 111
    :goto_4
    new-instance v1, LG/n;

    .line 112
    .line 113
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.loadUrl"

    .line 114
    .line 115
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    if-eqz p1, :cond_5

    .line 119
    .line 120
    new-instance v2, Lv0/K;

    .line 121
    .line 122
    const/16 v4, 0x8

    .line 123
    .line 124
    invoke-direct {v2, p1, v4}, Lv0/K;-><init>(Lv0/i;I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 128
    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_5
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 132
    .line 133
    .line 134
    :goto_5
    new-instance v1, LG/n;

    .line 135
    .line 136
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.postUrl"

    .line 137
    .line 138
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    if-eqz p1, :cond_6

    .line 142
    .line 143
    new-instance v2, Lv0/K;

    .line 144
    .line 145
    const/16 v4, 0x9

    .line 146
    .line 147
    invoke-direct {v2, p1, v4}, Lv0/K;-><init>(Lv0/i;I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 151
    .line 152
    .line 153
    goto :goto_6

    .line 154
    :cond_6
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 155
    .line 156
    .line 157
    :goto_6
    new-instance v1, LG/n;

    .line 158
    .line 159
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.getUrl"

    .line 160
    .line 161
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    if-eqz p1, :cond_7

    .line 165
    .line 166
    new-instance v2, Lv0/K;

    .line 167
    .line 168
    const/16 v4, 0xa

    .line 169
    .line 170
    invoke-direct {v2, p1, v4}, Lv0/K;-><init>(Lv0/i;I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 174
    .line 175
    .line 176
    goto :goto_7

    .line 177
    :cond_7
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 178
    .line 179
    .line 180
    :goto_7
    new-instance v1, LG/n;

    .line 181
    .line 182
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoBack"

    .line 183
    .line 184
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    if-eqz p1, :cond_8

    .line 188
    .line 189
    new-instance v2, Lv0/K;

    .line 190
    .line 191
    const/16 v4, 0xc

    .line 192
    .line 193
    invoke-direct {v2, p1, v4}, Lv0/K;-><init>(Lv0/i;I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 197
    .line 198
    .line 199
    goto :goto_8

    .line 200
    :cond_8
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 201
    .line 202
    .line 203
    :goto_8
    new-instance v1, LG/n;

    .line 204
    .line 205
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoForward"

    .line 206
    .line 207
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    if-eqz p1, :cond_9

    .line 211
    .line 212
    new-instance v2, Lv0/K;

    .line 213
    .line 214
    const/16 v4, 0xd

    .line 215
    .line 216
    invoke-direct {v2, p1, v4}, Lv0/K;-><init>(Lv0/i;I)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 220
    .line 221
    .line 222
    goto :goto_9

    .line 223
    :cond_9
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 224
    .line 225
    .line 226
    :goto_9
    new-instance v1, LG/n;

    .line 227
    .line 228
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.goBack"

    .line 229
    .line 230
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    if-eqz p1, :cond_a

    .line 234
    .line 235
    new-instance v2, Lv0/K;

    .line 236
    .line 237
    const/16 v4, 0xe

    .line 238
    .line 239
    invoke-direct {v2, p1, v4}, Lv0/K;-><init>(Lv0/i;I)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 243
    .line 244
    .line 245
    goto :goto_a

    .line 246
    :cond_a
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 247
    .line 248
    .line 249
    :goto_a
    new-instance v1, LG/n;

    .line 250
    .line 251
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.goForward"

    .line 252
    .line 253
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    if-eqz p1, :cond_b

    .line 257
    .line 258
    new-instance v2, Lv0/K;

    .line 259
    .line 260
    const/16 v4, 0xb

    .line 261
    .line 262
    invoke-direct {v2, p1, v4}, Lv0/K;-><init>(Lv0/i;I)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 266
    .line 267
    .line 268
    goto :goto_b

    .line 269
    :cond_b
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 270
    .line 271
    .line 272
    :goto_b
    new-instance v1, LG/n;

    .line 273
    .line 274
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.reload"

    .line 275
    .line 276
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    if-eqz p1, :cond_c

    .line 280
    .line 281
    new-instance v2, Lv0/K;

    .line 282
    .line 283
    const/16 v4, 0xf

    .line 284
    .line 285
    invoke-direct {v2, p1, v4}, Lv0/K;-><init>(Lv0/i;I)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 289
    .line 290
    .line 291
    goto :goto_c

    .line 292
    :cond_c
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 293
    .line 294
    .line 295
    :goto_c
    new-instance v1, LG/n;

    .line 296
    .line 297
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.clearCache"

    .line 298
    .line 299
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    if-eqz p1, :cond_d

    .line 303
    .line 304
    new-instance v2, Lv0/K;

    .line 305
    .line 306
    const/16 v4, 0x10

    .line 307
    .line 308
    invoke-direct {v2, p1, v4}, Lv0/K;-><init>(Lv0/i;I)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 312
    .line 313
    .line 314
    goto :goto_d

    .line 315
    :cond_d
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 316
    .line 317
    .line 318
    :goto_d
    new-instance v1, LG/n;

    .line 319
    .line 320
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.evaluateJavascript"

    .line 321
    .line 322
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    if-eqz p1, :cond_e

    .line 326
    .line 327
    new-instance v2, Lv0/K;

    .line 328
    .line 329
    const/16 v4, 0x11

    .line 330
    .line 331
    invoke-direct {v2, p1, v4}, Lv0/K;-><init>(Lv0/i;I)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 335
    .line 336
    .line 337
    goto :goto_e

    .line 338
    :cond_e
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 339
    .line 340
    .line 341
    :goto_e
    new-instance v1, LG/n;

    .line 342
    .line 343
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.getTitle"

    .line 344
    .line 345
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    if-eqz p1, :cond_f

    .line 349
    .line 350
    new-instance v2, Lv0/K;

    .line 351
    .line 352
    const/16 v4, 0x12

    .line 353
    .line 354
    invoke-direct {v2, p1, v4}, Lv0/K;-><init>(Lv0/i;I)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 358
    .line 359
    .line 360
    goto :goto_f

    .line 361
    :cond_f
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 362
    .line 363
    .line 364
    :goto_f
    new-instance v1, LG/n;

    .line 365
    .line 366
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebContentsDebuggingEnabled"

    .line 367
    .line 368
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    if-eqz p1, :cond_10

    .line 372
    .line 373
    new-instance v2, Lv0/K;

    .line 374
    .line 375
    const/16 v4, 0x13

    .line 376
    .line 377
    invoke-direct {v2, p1, v4}, Lv0/K;-><init>(Lv0/i;I)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 381
    .line 382
    .line 383
    goto :goto_10

    .line 384
    :cond_10
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 385
    .line 386
    .line 387
    :goto_10
    new-instance v1, LG/n;

    .line 388
    .line 389
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebViewClient"

    .line 390
    .line 391
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    if-eqz p1, :cond_11

    .line 395
    .line 396
    new-instance v2, Lv0/K;

    .line 397
    .line 398
    const/16 v4, 0x14

    .line 399
    .line 400
    invoke-direct {v2, p1, v4}, Lv0/K;-><init>(Lv0/i;I)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 404
    .line 405
    .line 406
    goto :goto_11

    .line 407
    :cond_11
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 408
    .line 409
    .line 410
    :goto_11
    new-instance v1, LG/n;

    .line 411
    .line 412
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.addJavaScriptChannel"

    .line 413
    .line 414
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    if-eqz p1, :cond_12

    .line 418
    .line 419
    new-instance v2, Lv0/K;

    .line 420
    .line 421
    const/16 v4, 0x15

    .line 422
    .line 423
    invoke-direct {v2, p1, v4}, Lv0/K;-><init>(Lv0/i;I)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 427
    .line 428
    .line 429
    goto :goto_12

    .line 430
    :cond_12
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 431
    .line 432
    .line 433
    :goto_12
    new-instance v1, LG/n;

    .line 434
    .line 435
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.removeJavaScriptChannel"

    .line 436
    .line 437
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    if-eqz p1, :cond_13

    .line 441
    .line 442
    new-instance v2, Lv0/K;

    .line 443
    .line 444
    const/16 v4, 0x16

    .line 445
    .line 446
    invoke-direct {v2, p1, v4}, Lv0/K;-><init>(Lv0/i;I)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 450
    .line 451
    .line 452
    goto :goto_13

    .line 453
    :cond_13
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 454
    .line 455
    .line 456
    :goto_13
    new-instance v1, LG/n;

    .line 457
    .line 458
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.setDownloadListener"

    .line 459
    .line 460
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 461
    .line 462
    .line 463
    if-eqz p1, :cond_14

    .line 464
    .line 465
    new-instance v2, Lv0/K;

    .line 466
    .line 467
    const/4 v4, 0x1

    .line 468
    invoke-direct {v2, p1, v4}, Lv0/K;-><init>(Lv0/i;I)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 472
    .line 473
    .line 474
    goto :goto_14

    .line 475
    :cond_14
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 476
    .line 477
    .line 478
    :goto_14
    new-instance v1, LG/n;

    .line 479
    .line 480
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebChromeClient"

    .line 481
    .line 482
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 483
    .line 484
    .line 485
    if-eqz p1, :cond_15

    .line 486
    .line 487
    new-instance v2, Lv0/K;

    .line 488
    .line 489
    const/4 v4, 0x3

    .line 490
    invoke-direct {v2, p1, v4}, Lv0/K;-><init>(Lv0/i;I)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 494
    .line 495
    .line 496
    goto :goto_15

    .line 497
    :cond_15
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 498
    .line 499
    .line 500
    :goto_15
    new-instance v1, LG/n;

    .line 501
    .line 502
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.setBackgroundColor"

    .line 503
    .line 504
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    if-eqz p1, :cond_16

    .line 508
    .line 509
    new-instance v2, Lv0/K;

    .line 510
    .line 511
    const/4 v4, 0x4

    .line 512
    invoke-direct {v2, p1, v4}, Lv0/K;-><init>(Lv0/i;I)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v1, v2}, LG/n;->g(Lq0/b;)V

    .line 516
    .line 517
    .line 518
    goto :goto_16

    .line 519
    :cond_16
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 520
    .line 521
    .line 522
    :goto_16
    new-instance v1, LG/n;

    .line 523
    .line 524
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.destroy"

    .line 525
    .line 526
    invoke-direct {v1, p0, v2, v0, v3}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    if-eqz p1, :cond_17

    .line 530
    .line 531
    new-instance p0, Lv0/K;

    .line 532
    .line 533
    const/4 v0, 0x5

    .line 534
    invoke-direct {p0, p1, v0}, Lv0/K;-><init>(Lv0/i;I)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v1, p0}, LG/n;->g(Lq0/b;)V

    .line 538
    .line 539
    .line 540
    goto :goto_17

    .line 541
    :cond_17
    invoke-virtual {v1, v3}, LG/n;->g(Lq0/b;)V

    .line 542
    .line 543
    .line 544
    :goto_17
    return-void
.end method

.method public static final M(LV0/u;LV0/u;LH0/p;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    :try_start_0
    invoke-static {v0, p2}, LI0/s;->a(ILjava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    invoke-interface {p2, p1, p0}, LH0/p;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    new-instance p2, LQ0/n;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p2, p1, v0}, LQ0/n;-><init>(Ljava/lang/Throwable;Z)V

    .line 15
    .line 16
    .line 17
    move-object p1, p2

    .line 18
    :goto_0
    sget-object p2, LA0/a;->e:LA0/a;

    .line 19
    .line 20
    if-ne p1, p2, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    invoke-virtual {p0, p1}, LQ0/Z;->L(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    sget-object p1, LQ0/v;->d:LD/j;

    .line 28
    .line 29
    if-ne p0, p1, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    instance-of p1, p0, LQ0/n;

    .line 33
    .line 34
    if-nez p1, :cond_2

    .line 35
    .line 36
    invoke-static {p0}, LQ0/v;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    :goto_1
    return-object p2

    .line 41
    :cond_2
    check-cast p0, LQ0/n;

    .line 42
    .line 43
    iget-object p0, p0, LQ0/n;->a:Ljava/lang/Throwable;

    .line 44
    .line 45
    throw p0
.end method

.method public static final O(Ljava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p0, Lx0/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast p0, Lx0/c;

    .line 7
    .line 8
    iget-object p0, p0, Lx0/c;->e:Ljava/lang/Throwable;

    .line 9
    .line 10
    throw p0
.end method

.method public static P(Landroid/view/View;Lw0/b;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-interface {p1, p0}, Lw0/b;->a(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    return v2

    .line 13
    :cond_1
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    check-cast p0, Landroid/view/ViewGroup;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-ge v1, v3, :cond_3

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-static {v3, p1}, La/a;->P(Landroid/view/View;Lw0/b;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    return v2

    .line 37
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_3
    return v0
.end method

.method public static Q(Ljava/lang/Throwable;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v2, "Cause: "

    .line 28
    .line 29
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v2, ", Stacktrace: "

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    return-object v0
.end method

.method public static R(Landroid/hardware/display/DisplayManager;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance p0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    :try_start_0
    const-class v0, Landroid/hardware/display/DisplayManager;

    .line 14
    .line 15
    const-string v1, "mGlobal"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v2, "mDisplayListeners"

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Ljava/util/ArrayList;

    .line 47
    .line 48
    new-instance v0, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    const/4 v2, 0x0

    .line 58
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_2

    .line 63
    .line 64
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    if-nez v2, :cond_1

    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    const-string v4, "mListener"

    .line 75
    .line 76
    invoke-virtual {v2, v4}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :catch_0
    move-exception p0

    .line 85
    goto :goto_2

    .line 86
    :catch_1
    move-exception p0

    .line 87
    goto :goto_2

    .line 88
    :cond_1
    :goto_1
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    check-cast v3, Landroid/hardware/display/DisplayManager$DisplayListener;

    .line 93
    .line 94
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    return-object v0

    .line 99
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    const-string v1, "Could not extract WebView\'s display listeners. "

    .line 102
    .line 103
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    const-string v0, "DisplayListenerProxy"

    .line 114
    .line 115
    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    new-instance p0, Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 121
    .line 122
    .line 123
    return-object p0
.end method

.method public static a(Landroid/content/Context;Lh0/c;)V
    .locals 7

    .line 1
    invoke-static {p0}, La/a;->t(Landroid/content/Context;)Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    sget v1, LY/m;->a:I

    .line 8
    .line 9
    sget-object v1, LY/n;->a:LY/a;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget v1, LY/o;->b:I

    .line 15
    .line 16
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v2, 0x1e

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    if-lt v1, v2, :cond_0

    .line 22
    .line 23
    invoke-static {v0}, LD/r;->q(Landroid/app/Activity;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Landroid/view/WindowManager;

    .line 28
    .line 29
    invoke-static {v4}, Lc0/a;->j(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-static {v4}, Lc0/a;->e(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    const-string v5, "wm.maximumWindowMetrics.bounds"

    .line 38
    .line 39
    invoke-static {v4, v5}, LI0/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const-string v4, "window"

    .line 44
    .line 45
    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const-string v5, "null cannot be cast to non-null type android.view.WindowManager"

    .line 50
    .line 51
    invoke-static {v4, v5}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    check-cast v4, Landroid/view/WindowManager;

    .line 55
    .line 56
    invoke-interface {v4}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    const-string v5, "display"

    .line 61
    .line 62
    invoke-static {v4, v5}, LI0/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    new-instance v5, Landroid/graphics/Point;

    .line 66
    .line 67
    invoke-direct {v5}, Landroid/graphics/Point;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4, v5}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 71
    .line 72
    .line 73
    new-instance v4, Landroid/graphics/Rect;

    .line 74
    .line 75
    iget v6, v5, Landroid/graphics/Point;->x:I

    .line 76
    .line 77
    iget v5, v5, Landroid/graphics/Point;->y:I

    .line 78
    .line 79
    invoke-direct {v4, v3, v3, v6, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 80
    .line 81
    .line 82
    :goto_0
    if-lt v1, v2, :cond_2

    .line 83
    .line 84
    if-lt v1, v2, :cond_1

    .line 85
    .line 86
    sget-object v1, Lc0/b;->a:Lc0/b;

    .line 87
    .line 88
    invoke-virtual {v1, v0}, Lc0/b;->a(Landroid/content/Context;)Ly/O;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    goto :goto_2

    .line 93
    :cond_1
    new-instance p0, Ljava/lang/Exception;

    .line 94
    .line 95
    const-string p1, "Incompatible SDK version"

    .line 96
    .line 97
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p0

    .line 101
    :cond_2
    if-lt v1, v2, :cond_3

    .line 102
    .line 103
    new-instance v0, Ly/G;

    .line 104
    .line 105
    invoke-direct {v0}, Ly/G;-><init>()V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    const/16 v0, 0x1d

    .line 110
    .line 111
    if-lt v1, v0, :cond_4

    .line 112
    .line 113
    new-instance v0, Ly/F;

    .line 114
    .line 115
    invoke-direct {v0}, Ly/F;-><init>()V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_4
    new-instance v0, Ly/E;

    .line 120
    .line 121
    invoke-direct {v0}, Ly/E;-><init>()V

    .line 122
    .line 123
    .line 124
    :goto_1
    invoke-virtual {v0}, Ly/H;->b()Ly/O;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    const-string v1, "{\n            WindowInse\u2026ilder().build()\n        }"

    .line 129
    .line 130
    invoke-static {v0, v1}, LI0/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :goto_2
    iget v1, v4, Landroid/graphics/Rect;->left:I

    .line 134
    .line 135
    iget v2, v4, Landroid/graphics/Rect;->top:I

    .line 136
    .line 137
    iget v5, v4, Landroid/graphics/Rect;->right:I

    .line 138
    .line 139
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 140
    .line 141
    if-gt v1, v5, :cond_6

    .line 142
    .line 143
    if-gt v2, v4, :cond_5

    .line 144
    .line 145
    const-string v6, "_windowInsetsCompat"

    .line 146
    .line 147
    invoke-static {v0, v6}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    new-instance v0, Landroid/graphics/Rect;

    .line 151
    .line 152
    invoke-direct {v0, v1, v2, v5, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    int-to-float v0, v0

    .line 160
    new-instance v6, Landroid/graphics/Rect;

    .line 161
    .line 162
    invoke-direct {v6, v1, v2, v5, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    int-to-float v1, v1

    .line 170
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 179
    .line 180
    iget-object p1, p1, Lh0/c;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 181
    .line 182
    invoke-virtual {p1, v3, v0, v1, p0}, Lio/flutter/embedding/engine/FlutterJNI;->updateDisplayMetrics(IFFF)V

    .line 183
    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_5
    new-instance p0, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    const-string p1, "top must be less than or equal to bottom, top: "

    .line 189
    .line 190
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    const-string p1, ", bottom: "

    .line 197
    .line 198
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 209
    .line 210
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw p1

    .line 218
    :cond_6
    new-instance p0, Ljava/lang/StringBuilder;

    .line 219
    .line 220
    const-string p1, "Left must be less than or equal to right, left: "

    .line 221
    .line 222
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    const-string p1, ", right: "

    .line 229
    .line 230
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 241
    .line 242
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    throw p1

    .line 250
    :cond_7
    :goto_3
    return-void
.end method

.method public static b([Lr/d;[Lr/d;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_5

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto :goto_2

    .line 7
    :cond_0
    array-length v1, p0

    .line 8
    array-length v2, p1

    .line 9
    if-eq v1, v2, :cond_1

    .line 10
    .line 11
    return v0

    .line 12
    :cond_1
    const/4 v1, 0x0

    .line 13
    :goto_0
    array-length v2, p0

    .line 14
    if-ge v1, v2, :cond_4

    .line 15
    .line 16
    aget-object v2, p0, v1

    .line 17
    .line 18
    iget-char v3, v2, Lr/d;->a:C

    .line 19
    .line 20
    aget-object v4, p1, v1

    .line 21
    .line 22
    iget-char v5, v4, Lr/d;->a:C

    .line 23
    .line 24
    if-ne v3, v5, :cond_3

    .line 25
    .line 26
    iget-object v2, v2, Lr/d;->b:[F

    .line 27
    .line 28
    array-length v2, v2

    .line 29
    iget-object v3, v4, Lr/d;->b:[F

    .line 30
    .line 31
    array-length v3, v3

    .line 32
    if-eq v2, v3, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    :goto_1
    return v0

    .line 39
    :cond_4
    const/4 p0, 0x1

    .line 40
    return p0

    .line 41
    :cond_5
    :goto_2
    return v0
.end method

.method public static final g(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    invoke-static {p1, p0}, La1/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    return-void
.end method

.method public static h(Ljava/io/Closeable;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    :catch_0
    :cond_0
    return-void
.end method

.method public static i([FI)[F
    .locals 2

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    if-ltz v0, :cond_0

    .line 5
    .line 6
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    new-array p1, p1, [F

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-static {p0, v1, p1, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    .line 20
    .line 21
    .line 22
    throw p0

    .line 23
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 24
    .line 25
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 26
    .line 27
    .line 28
    throw p0
.end method

.method public static j(Ljava/io/File;Landroid/content/res/Resources;I)Z
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    .line 2
    .line 3
    .line 4
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    :try_start_1
    invoke-static {p0, p1}, La/a;->k(Ljava/io/File;Ljava/io/InputStream;)Z

    .line 6
    .line 7
    .line 8
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    invoke-static {p1}, La/a;->h(Ljava/io/Closeable;)V

    .line 10
    .line 11
    .line 12
    return p0

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    goto :goto_0

    .line 15
    :catchall_1
    move-exception p0

    .line 16
    const/4 p1, 0x0

    .line 17
    :goto_0
    invoke-static {p1}, La/a;->h(Ljava/io/Closeable;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method

.method public static k(Ljava/io/File;Ljava/io/InputStream;)Z
    .locals 5

    .line 1
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskWrites()Landroid/os/StrictMode$ThreadPolicy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    :try_start_0
    new-instance v3, Ljava/io/FileOutputStream;

    .line 8
    .line 9
    invoke-direct {v3, p0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    .line 11
    .line 12
    const/16 p0, 0x400

    .line 13
    .line 14
    :try_start_1
    new-array p0, p0, [B

    .line 15
    .line 16
    :goto_0
    invoke-virtual {p1, p0}, Ljava/io/InputStream;->read([B)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v4, -0x1

    .line 21
    if-eq v2, v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {v3, p0, v1, v2}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    move-object v2, v3

    .line 29
    goto :goto_2

    .line 30
    :catch_0
    move-exception p0

    .line 31
    move-object v2, v3

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    invoke-static {v3}, La/a;->h(Ljava/io/Closeable;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x1

    .line 40
    return p0

    .line 41
    :catchall_1
    move-exception p0

    .line 42
    goto :goto_2

    .line 43
    :catch_1
    move-exception p0

    .line 44
    :goto_1
    :try_start_2
    const-string p1, "TypefaceCompatUtil"

    .line 45
    .line 46
    new-instance v3, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v4, "Error copying resource contents to temp file: "

    .line 52
    .line 53
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 68
    .line 69
    .line 70
    invoke-static {v2}, La/a;->h(Ljava/io/Closeable;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 74
    .line 75
    .line 76
    return v1

    .line 77
    :goto_2
    invoke-static {v2}, La/a;->h(Ljava/io/Closeable;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 81
    .line 82
    .line 83
    throw p0
.end method

.method public static final l(Ljava/lang/Throwable;)Lx0/c;
    .locals 1

    .line 1
    const-string v0, "exception"

    .line 2
    .line 3
    invoke-static {p0, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lx0/c;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lx0/c;-><init>(Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static m(Ljava/lang/String;)[Lr/d;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    :goto_0
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v6

    .line 15
    if-ge v4, v6, :cond_f

    .line 16
    .line 17
    :goto_1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    const/16 v7, 0x45

    .line 22
    .line 23
    const/16 v8, 0x65

    .line 24
    .line 25
    if-ge v4, v6, :cond_2

    .line 26
    .line 27
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    add-int/lit8 v9, v6, -0x41

    .line 32
    .line 33
    add-int/lit8 v10, v6, -0x5a

    .line 34
    .line 35
    mul-int v10, v10, v9

    .line 36
    .line 37
    if-lez v10, :cond_0

    .line 38
    .line 39
    add-int/lit8 v9, v6, -0x61

    .line 40
    .line 41
    add-int/lit8 v10, v6, -0x7a

    .line 42
    .line 43
    mul-int v10, v10, v9

    .line 44
    .line 45
    if-gtz v10, :cond_1

    .line 46
    .line 47
    :cond_0
    if-eq v6, v8, :cond_1

    .line 48
    .line 49
    if-eq v6, v7, :cond_1

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    :goto_2
    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-nez v6, :cond_e

    .line 68
    .line 69
    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    const/16 v9, 0x7a

    .line 74
    .line 75
    if-eq v6, v9, :cond_d

    .line 76
    .line 77
    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    const/16 v9, 0x5a

    .line 82
    .line 83
    if-ne v6, v9, :cond_3

    .line 84
    .line 85
    goto/16 :goto_c

    .line 86
    .line 87
    :cond_3
    :try_start_0
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    new-array v6, v6, [F

    .line 92
    .line 93
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 94
    .line 95
    .line 96
    move-result v9

    .line 97
    const/4 v10, 0x1

    .line 98
    const/4 v11, 0x0

    .line 99
    :goto_3
    if-ge v10, v9, :cond_c

    .line 100
    .line 101
    move v12, v10

    .line 102
    const/4 v13, 0x0

    .line 103
    const/4 v14, 0x0

    .line 104
    const/4 v15, 0x0

    .line 105
    const/16 v16, 0x0

    .line 106
    .line 107
    :goto_4
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-ge v12, v3, :cond_9

    .line 112
    .line 113
    invoke-virtual {v5, v12}, Ljava/lang/String;->charAt(I)C

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    const/16 v2, 0x20

    .line 118
    .line 119
    if-eq v3, v2, :cond_7

    .line 120
    .line 121
    if-eq v3, v7, :cond_6

    .line 122
    .line 123
    if-eq v3, v8, :cond_6

    .line 124
    .line 125
    packed-switch v3, :pswitch_data_0

    .line 126
    .line 127
    .line 128
    goto :goto_6

    .line 129
    :pswitch_0
    if-nez v14, :cond_4

    .line 130
    .line 131
    const/4 v13, 0x0

    .line 132
    const/4 v14, 0x1

    .line 133
    goto :goto_7

    .line 134
    :cond_4
    :goto_5
    const/4 v13, 0x0

    .line 135
    const/4 v15, 0x1

    .line 136
    const/16 v16, 0x1

    .line 137
    .line 138
    goto :goto_7

    .line 139
    :pswitch_1
    if-eq v12, v10, :cond_5

    .line 140
    .line 141
    if-nez v13, :cond_5

    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_5
    :goto_6
    const/4 v13, 0x0

    .line 145
    goto :goto_7

    .line 146
    :cond_6
    const/4 v13, 0x1

    .line 147
    goto :goto_7

    .line 148
    :cond_7
    :pswitch_2
    const/4 v13, 0x0

    .line 149
    const/4 v15, 0x1

    .line 150
    :goto_7
    if-eqz v15, :cond_8

    .line 151
    .line 152
    goto :goto_8

    .line 153
    :cond_8
    add-int/lit8 v12, v12, 0x1

    .line 154
    .line 155
    const/4 v2, 0x0

    .line 156
    goto :goto_4

    .line 157
    :cond_9
    :goto_8
    if-ge v10, v12, :cond_a

    .line 158
    .line 159
    add-int/lit8 v2, v11, 0x1

    .line 160
    .line 161
    invoke-virtual {v5, v10, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    aput v3, v6, v11

    .line 170
    .line 171
    move v11, v2

    .line 172
    goto :goto_9

    .line 173
    :catch_0
    move-exception v0

    .line 174
    goto :goto_b

    .line 175
    :cond_a
    :goto_9
    if-eqz v16, :cond_b

    .line 176
    .line 177
    move v10, v12

    .line 178
    :goto_a
    const/4 v2, 0x0

    .line 179
    goto :goto_3

    .line 180
    :cond_b
    add-int/lit8 v10, v12, 0x1

    .line 181
    .line 182
    goto :goto_a

    .line 183
    :cond_c
    invoke-static {v6, v11}, La/a;->i([FI)[F

    .line 184
    .line 185
    .line 186
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 187
    move-object v3, v2

    .line 188
    const/4 v2, 0x0

    .line 189
    goto :goto_d

    .line 190
    :goto_b
    new-instance v1, Ljava/lang/RuntimeException;

    .line 191
    .line 192
    new-instance v2, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    const-string v3, "error in parsing \""

    .line 195
    .line 196
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    const-string v3, "\""

    .line 203
    .line 204
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 212
    .line 213
    .line 214
    throw v1

    .line 215
    :cond_d
    :goto_c
    new-array v3, v2, [F

    .line 216
    .line 217
    :goto_d
    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    .line 218
    .line 219
    .line 220
    move-result v5

    .line 221
    new-instance v2, Lr/d;

    .line 222
    .line 223
    invoke-direct {v2, v5, v3}, Lr/d;-><init>(C[F)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    :cond_e
    add-int/lit8 v2, v4, 0x1

    .line 230
    .line 231
    move v5, v4

    .line 232
    move v4, v2

    .line 233
    const/4 v2, 0x0

    .line 234
    goto/16 :goto_0

    .line 235
    .line 236
    :cond_f
    sub-int/2addr v4, v5

    .line 237
    const/4 v2, 0x1

    .line 238
    if-ne v4, v2, :cond_10

    .line 239
    .line 240
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    if-ge v5, v2, :cond_10

    .line 245
    .line 246
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    const/4 v2, 0x0

    .line 251
    new-array v3, v2, [F

    .line 252
    .line 253
    new-instance v4, Lr/d;

    .line 254
    .line 255
    invoke-direct {v4, v0, v3}, Lr/d;-><init>(C[F)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    goto :goto_e

    .line 262
    :cond_10
    const/4 v2, 0x0

    .line 263
    :goto_e
    new-array v0, v2, [Lr/d;

    .line 264
    .line 265
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    check-cast v0, [Lr/d;

    .line 270
    .line 271
    return-object v0

    .line 272
    nop

    .line 273
    :pswitch_data_0
    .packed-switch 0x2c
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static o([Lr/d;)[Lr/d;
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    new-array v0, v0, [Lr/d;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    array-length v2, p0

    .line 6
    if-ge v1, v2, :cond_0

    .line 7
    .line 8
    new-instance v2, Lr/d;

    .line 9
    .line 10
    aget-object v3, p0, v1

    .line 11
    .line 12
    invoke-direct {v2, v3}, Lr/d;-><init>(Lr/d;)V

    .line 13
    .line 14
    .line 15
    aput-object v2, v0, v1

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-object v0
.end method

.method public static q(Landroidx/datastore/preferences/protobuf/g;)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/g;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/g;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v1, v2, :cond_4

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Landroidx/datastore/preferences/protobuf/g;->a(I)B

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/16 v3, 0x22

    .line 22
    .line 23
    if-eq v2, v3, :cond_3

    .line 24
    .line 25
    const/16 v3, 0x27

    .line 26
    .line 27
    if-eq v2, v3, :cond_2

    .line 28
    .line 29
    const/16 v3, 0x5c

    .line 30
    .line 31
    if-eq v2, v3, :cond_1

    .line 32
    .line 33
    packed-switch v2, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    const/16 v4, 0x20

    .line 37
    .line 38
    if-lt v2, v4, :cond_0

    .line 39
    .line 40
    const/16 v4, 0x7e

    .line 41
    .line 42
    if-gt v2, v4, :cond_0

    .line 43
    .line 44
    int-to-char v2, v2

    .line 45
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    ushr-int/lit8 v3, v2, 0x6

    .line 53
    .line 54
    and-int/lit8 v3, v3, 0x3

    .line 55
    .line 56
    add-int/lit8 v3, v3, 0x30

    .line 57
    .line 58
    int-to-char v3, v3

    .line 59
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    ushr-int/lit8 v3, v2, 0x3

    .line 63
    .line 64
    and-int/lit8 v3, v3, 0x7

    .line 65
    .line 66
    add-int/lit8 v3, v3, 0x30

    .line 67
    .line 68
    int-to-char v3, v3

    .line 69
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    and-int/lit8 v2, v2, 0x7

    .line 73
    .line 74
    add-int/lit8 v2, v2, 0x30

    .line 75
    .line 76
    int-to-char v2, v2

    .line 77
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :pswitch_0
    const-string v2, "\\r"

    .line 82
    .line 83
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :pswitch_1
    const-string v2, "\\f"

    .line 88
    .line 89
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :pswitch_2
    const-string v2, "\\v"

    .line 94
    .line 95
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :pswitch_3
    const-string v2, "\\n"

    .line 100
    .line 101
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :pswitch_4
    const-string v2, "\\t"

    .line 106
    .line 107
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :pswitch_5
    const-string v2, "\\b"

    .line 112
    .line 113
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :pswitch_6
    const-string v2, "\\a"

    .line 118
    .line 119
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_1
    const-string v2, "\\\\"

    .line 124
    .line 125
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_2
    const-string v2, "\\\'"

    .line 130
    .line 131
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_3
    const-string v2, "\\\""

    .line 136
    .line 137
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 141
    .line 142
    goto/16 :goto_0

    .line 143
    .line 144
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    return-object p0

    .line 149
    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static r()Ljava/lang/reflect/InvocationHandler;
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {}, LL/l;->q()Ljava/lang/ClassLoader;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    :try_start_0
    const-class v0, Landroid/webkit/WebView;

    .line 14
    .line 15
    const-string v1, "getFactory"

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :goto_0
    const-string v1, "org.chromium.support_lib_glue.SupportLibReflectionUtil"

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-static {v1, v3, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "createWebViewProviderFactory"

    .line 45
    .line 46
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Ljava/lang/reflect/InvocationHandler;

    .line 55
    .line 56
    return-object v0

    .line 57
    :catch_0
    move-exception v0

    .line 58
    goto :goto_1

    .line 59
    :catch_1
    move-exception v0

    .line 60
    goto :goto_1

    .line 61
    :catch_2
    move-exception v0

    .line 62
    :goto_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 63
    .line 64
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    throw v1
.end method

.method public static s(Lz0/g;Lz0/h;)Lz0/g;
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lz0/g;->getKey()Lz0/h;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0, p1}, LI0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    :goto_0
    return-object p0
.end method

.method public static t(Landroid/content/Context;)Landroid/app/Activity;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    instance-of v1, p0, Landroid/app/Activity;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p0, Landroid/app/Activity;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_1
    instance-of v1, p0, Landroid/content/ContextWrapper;

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    check-cast p0, Landroid/content/ContextWrapper;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, La/a;->t(Landroid/content/Context;)Landroid/app/Activity;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_2
    return-object v0
.end method

.method public static u(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v1, Lq/m;

    .line 10
    .line 11
    invoke-direct {v1, v0, p0}, Lq/m;-><init>(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;)V

    .line 12
    .line 13
    .line 14
    sget-object v2, Lq/n;->c:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v2

    .line 17
    :try_start_0
    sget-object v3, Lq/n;->b:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-virtual {v3, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Landroid/util/SparseArray;

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    if-eqz v3, :cond_3

    .line 27
    .line 28
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-lez v5, :cond_3

    .line 33
    .line 34
    invoke-virtual {v3, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    check-cast v5, Lq/l;

    .line 39
    .line 40
    if-eqz v5, :cond_3

    .line 41
    .line 42
    iget-object v6, v5, Lq/l;->b:Landroid/content/res/Configuration;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    invoke-virtual {v6, v7}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_2

    .line 53
    .line 54
    if-nez p0, :cond_0

    .line 55
    .line 56
    iget v6, v5, Lq/l;->c:I

    .line 57
    .line 58
    if-eqz v6, :cond_1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception p0

    .line 62
    goto :goto_4

    .line 63
    :cond_0
    :goto_0
    if-eqz p0, :cond_2

    .line 64
    .line 65
    iget v6, v5, Lq/l;->c:I

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/content/res/Resources$Theme;->hashCode()I

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    if-ne v6, v7, :cond_2

    .line 72
    .line 73
    :cond_1
    iget-object v3, v5, Lq/l;->a:Landroid/content/res/ColorStateList;

    .line 74
    .line 75
    monitor-exit v2

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    invoke-virtual {v3, p1}, Landroid/util/SparseArray;->remove(I)V

    .line 78
    .line 79
    .line 80
    :cond_3
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    move-object v3, v4

    .line 82
    :goto_1
    if-eqz v3, :cond_4

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_4
    sget-object v2, Lq/n;->a:Ljava/lang/ThreadLocal;

    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    check-cast v3, Landroid/util/TypedValue;

    .line 92
    .line 93
    if-nez v3, :cond_5

    .line 94
    .line 95
    new-instance v3, Landroid/util/TypedValue;

    .line 96
    .line 97
    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v3}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :cond_5
    const/4 v2, 0x1

    .line 104
    invoke-virtual {v0, p1, v3, v2}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 105
    .line 106
    .line 107
    iget v2, v3, Landroid/util/TypedValue;->type:I

    .line 108
    .line 109
    const/16 v3, 0x1c

    .line 110
    .line 111
    if-lt v2, v3, :cond_6

    .line 112
    .line 113
    const/16 v3, 0x1f

    .line 114
    .line 115
    if-gt v2, v3, :cond_6

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_6
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    :try_start_1
    invoke-static {v0, v2, p0}, Lq/c;->a(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    .line 123
    .line 124
    .line 125
    move-result-object v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 126
    goto :goto_2

    .line 127
    :catch_0
    move-exception v2

    .line 128
    const-string v3, "ResourcesCompat"

    .line 129
    .line 130
    const-string v5, "Failed to inflate ColorStateList, leaving it to the framework"

    .line 131
    .line 132
    invoke-static {v3, v5, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 133
    .line 134
    .line 135
    :goto_2
    if-eqz v4, :cond_7

    .line 136
    .line 137
    invoke-static {v1, p1, v4, p0}, Lq/n;->a(Lq/m;ILandroid/content/res/ColorStateList;Landroid/content/res/Resources$Theme;)V

    .line 138
    .line 139
    .line 140
    move-object v3, v4

    .line 141
    goto :goto_3

    .line 142
    :cond_7
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 143
    .line 144
    const/16 v2, 0x17

    .line 145
    .line 146
    if-lt v1, v2, :cond_8

    .line 147
    .line 148
    invoke-static {v0, p1, p0}, Lq/k;->b(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    goto :goto_3

    .line 153
    :cond_8
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    :goto_3
    return-object v3

    .line 158
    :goto_4
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 159
    throw p0
.end method

.method public static final v(LN0/b;)Ljava/lang/Class;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p0, LI0/d;

    .line 7
    .line 8
    invoke-interface {p0}, LI0/d;->a()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    sparse-switch v1, :sswitch_data_0

    .line 28
    .line 29
    .line 30
    goto/16 :goto_0

    .line 31
    .line 32
    :sswitch_0
    const-string v1, "short"

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    goto/16 :goto_0

    .line 41
    .line 42
    :cond_1
    const-class p0, Ljava/lang/Short;

    .line 43
    .line 44
    goto/16 :goto_0

    .line 45
    .line 46
    :sswitch_1
    const-string v1, "float"

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    const-class p0, Ljava/lang/Float;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :sswitch_2
    const-string v1, "boolean"

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_3

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    const-class p0, Ljava/lang/Boolean;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :sswitch_3
    const-string v1, "void"

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_4

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    const-class p0, Ljava/lang/Void;

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :sswitch_4
    const-string v1, "long"

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_5

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_5
    const-class p0, Ljava/lang/Long;

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :sswitch_5
    const-string v1, "char"

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-nez v0, :cond_6

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_6
    const-class p0, Ljava/lang/Character;

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :sswitch_6
    const-string v1, "byte"

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-nez v0, :cond_7

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_7
    const-class p0, Ljava/lang/Byte;

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :sswitch_7
    const-string v1, "int"

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-nez v0, :cond_8

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_8
    const-class p0, Ljava/lang/Integer;

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :sswitch_8
    const-string v1, "double"

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-nez v0, :cond_9

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_9
    const-class p0, Ljava/lang/Double;

    .line 140
    .line 141
    :goto_0
    return-object p0

    .line 142
    nop

    .line 143
    :sswitch_data_0
    .sparse-switch
        -0x4f08842f -> :sswitch_8
        0x197ef -> :sswitch_7
        0x2e6108 -> :sswitch_6
        0x2e9356 -> :sswitch_5
        0x32c67c -> :sswitch_4
        0x375194 -> :sswitch_3
        0x3db6c28 -> :sswitch_2
        0x5d0225c -> :sswitch_1
        0x685847c -> :sswitch_0
    .end sparse-switch
.end method

.method public static w(Landroid/content/Context;)Ljava/io/File;
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v2, ".font"

    .line 12
    .line 13
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v2, "-"

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const/4 v2, 0x0

    .line 43
    :goto_0
    const/16 v3, 0x64

    .line 44
    .line 45
    if-ge v2, v3, :cond_2

    .line 46
    .line 47
    new-instance v3, Ljava/io/File;

    .line 48
    .line 49
    new-instance v4, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-direct {v3, p0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z

    .line 68
    .line 69
    .line 70
    move-result v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    if-eqz v4, :cond_1

    .line 72
    .line 73
    return-object v3

    .line 74
    :catch_0
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    return-object v0
.end method

.method public static x(Lz0/d;)Lz0/d;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, LB0/b;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p0

    .line 11
    check-cast v0, LB0/b;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-object p0, v0, LB0/b;->g:Lz0/d;

    .line 18
    .line 19
    if-nez p0, :cond_2

    .line 20
    .line 21
    invoke-virtual {v0}, LB0/b;->i()Lz0/i;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sget-object v1, Lz0/e;->e:Lz0/e;

    .line 26
    .line 27
    invoke-interface {p0, v1}, Lz0/i;->f(Lz0/h;)Lz0/g;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lz0/f;

    .line 32
    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    check-cast p0, LQ0/s;

    .line 36
    .line 37
    new-instance v1, LV0/h;

    .line 38
    .line 39
    invoke-direct {v1, p0, v0}, LV0/h;-><init>(LQ0/s;LB0/b;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move-object v1, v0

    .line 44
    :goto_1
    iput-object v1, v0, LB0/b;->g:Lz0/d;

    .line 45
    .line 46
    move-object p0, v1

    .line 47
    :cond_2
    return-object p0
.end method

.method public static y(I)I
    .locals 1

    .line 1
    if-gez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const/4 v0, 0x3

    .line 5
    if-ge p0, v0, :cond_1

    .line 6
    .line 7
    add-int/lit8 p0, p0, 0x1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    const/high16 v0, 0x40000000    # 2.0f

    .line 11
    .line 12
    if-ge p0, v0, :cond_2

    .line 13
    .line 14
    int-to-float p0, p0

    .line 15
    const/high16 v0, 0x3f400000    # 0.75f

    .line 16
    .line 17
    div-float/2addr p0, v0

    .line 18
    const/high16 v0, 0x3f800000    # 1.0f

    .line 19
    .line 20
    add-float/2addr p0, v0

    .line 21
    float-to-int p0, p0

    .line 22
    goto :goto_0

    .line 23
    :cond_2
    const p0, 0x7fffffff

    .line 24
    .line 25
    .line 26
    :goto_0
    return p0
.end method

.method public static z(Lz0/g;Lz0/h;)Lz0/i;
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lz0/g;->getKey()Lz0/h;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0, p1}, LI0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    sget-object p0, Lz0/j;->e:Lz0/j;

    .line 17
    .line 18
    :cond_0
    return-object p0
.end method


# virtual methods
.method public abstract B(Ln/f;Ln/f;)V
.end method

.method public abstract C(Ln/f;Ljava/lang/Thread;)V
.end method

.method public D()V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract L()V
.end method

.method public abstract N()V
.end method

.method public c()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public abstract d(Ln/g;Ln/c;)Z
.end method

.method public abstract e(Ln/g;Ljava/lang/Object;Ljava/lang/Object;)Z
.end method

.method public abstract f(Ln/g;Ln/f;Ln/f;)Z
.end method

.method public abstract n([BII)Ljava/lang/String;
.end method

.method public abstract p(Ljava/lang/String;[BII)I
.end method
