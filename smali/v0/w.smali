.class public final Lv0/w;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/webkit/WebSettings;Z)V
    .locals 4

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    sget-object v1, LT/m;->e:LT/b;

    .line 4
    .line 5
    invoke-virtual {v1}, LT/c;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    :try_start_0
    sget-object v1, LT/n;->a:LD/j;

    .line 12
    .line 13
    new-instance v2, LD/j;

    .line 14
    .line 15
    iget-object v1, v1, LD/j;->f:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    .line 18
    .line 19
    invoke-interface {v1, p0}, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;->convertSettings(Landroid/webkit/WebSettings;)Ljava/lang/reflect/InvocationHandler;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-class v3, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;

    .line 24
    .line 25
    invoke-static {v3, v1}, La1/a;->d(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;

    .line 30
    .line 31
    invoke-direct {v2, v0, v1}, LD/j;-><init>(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catch_0
    move-exception v1

    .line 36
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 37
    .line 38
    const/16 v3, 0x1e

    .line 39
    .line 40
    if-ne v2, v3, :cond_0

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const-string v2, "android.webkit.WebSettingsWrapper"

    .line 51
    .line 52
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-eqz p0, :cond_0

    .line 57
    .line 58
    const-string p0, "WebSettingsCompat"

    .line 59
    .line 60
    const-string v2, "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info."

    .line 61
    .line 62
    invoke-static {p0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 63
    .line 64
    .line 65
    new-instance v2, LT/j;

    .line 66
    .line 67
    const/4 p0, 0x0

    .line 68
    invoke-direct {v2, v0, p0}, LD/j;-><init>(ILjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :goto_0
    invoke-virtual {v2, p1}, LD/j;->w(Z)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_0
    throw v1

    .line 76
    :cond_1
    invoke-static {}, LT/m;->a()Ljava/lang/UnsupportedOperationException;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    throw p0
.end method
