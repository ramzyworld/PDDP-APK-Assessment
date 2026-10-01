.class public abstract Lg0/e;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/l;


# static fields
.field public static final i:I


# instance fields
.field public e:Z

.field public f:Lg0/h;

.field public final g:Landroidx/lifecycle/n;

.field public final h:Landroid/window/OnBackInvokedCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sput v0, Lg0/e;->i:I

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lg0/e;->e:Z

    .line 6
    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v1, 0x21

    .line 10
    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/16 v1, 0x22

    .line 16
    .line 17
    if-lt v0, v1, :cond_1

    .line 18
    .line 19
    new-instance v0, Lg0/d;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Lg0/d;-><init>(Lg0/e;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    new-instance v0, Lg0/c;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Lg0/c;-><init>(Lg0/e;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iput-object v0, p0, Lg0/e;->h:Landroid/window/OnBackInvokedCallback;

    .line 31
    .line 32
    new-instance v0, Landroidx/lifecycle/n;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Landroidx/lifecycle/n;-><init>(Landroidx/lifecycle/l;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lg0/e;->g:Landroidx/lifecycle/n;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final a()Landroidx/lifecycle/n;
    .locals 1

    .line 1
    iget-object v0, p0, Lg0/e;->g:Landroidx/lifecycle/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "android.intent.action.RUN"

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_0
    const/4 v0, 0x0

    .line 39
    return-object v0
.end method

.method public final c()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "background_mode"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    const-string v1, "opaque"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const-string v1, "transparent"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    const/4 v0, 0x2

    .line 42
    :goto_0
    return v0

    .line 43
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 44
    .line 45
    const-string v2, "No enum constant io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode."

    .line 46
    .line 47
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v1

    .line 55
    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    .line 56
    .line 57
    const-string v1, "Name is null"

    .line 58
    .line 59
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v0

    .line 63
    :cond_3
    const/4 v0, 0x1

    .line 64
    return v0
.end method

.method public final d()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "cached_engine_id"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "main"

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "dart_entrypoint"

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lg0/e;->g()Landroid/os/Bundle;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    const-string v2, "io.flutter.Entrypoint"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v1, 0x0

    .line 38
    :goto_0
    if-eqz v1, :cond_2

    .line 39
    .line 40
    move-object v0, v1

    .line 41
    :catch_0
    :cond_2
    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "route"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :try_start_0
    invoke-virtual {p0}, Lg0/e;->g()Landroid/os/Bundle;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    const-string v2, "io.flutter.InitialRoute"

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    :catch_0
    :cond_1
    return-object v0
.end method

.method public final g()Landroid/os/Bundle;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/16 v2, 0x80

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;

    .line 16
    .line 17
    return-object v0
.end method

.method public final h(Z)V
    .locals 2

    .line 1
    const/16 v0, 0x21

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-boolean v1, p0, Lg0/e;->e:Z

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    if-lt p1, v0, :cond_1

    .line 12
    .line 13
    invoke-static {p0}, Lg0/b;->f(Lg0/e;)Landroid/window/OnBackInvokedDispatcher;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, Lg0/e;->h:Landroid/window/OnBackInvokedCallback;

    .line 18
    .line 19
    invoke-static {p1, v0}, Lg0/b;->m(Landroid/window/OnBackInvokedDispatcher;Landroid/window/OnBackInvokedCallback;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Lg0/e;->e:Z

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    if-nez p1, :cond_1

    .line 27
    .line 28
    iget-boolean p1, p0, Lg0/e;->e:Z

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 33
    .line 34
    if-lt p1, v0, :cond_1

    .line 35
    .line 36
    invoke-static {p0}, Lg0/b;->f(Lg0/e;)Landroid/window/OnBackInvokedDispatcher;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object v0, p0, Lg0/e;->h:Landroid/window/OnBackInvokedCallback;

    .line 41
    .line 42
    invoke-static {p1, v0}, Lg0/b;->o(Landroid/window/OnBackInvokedDispatcher;Landroid/window/OnBackInvokedCallback;)V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    iput-boolean p1, p0, Lg0/e;->e:Z

    .line 47
    .line 48
    :cond_1
    :goto_0
    return-void
.end method

.method public final i()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "destroy_engine_with_activity"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0}, Lg0/e;->d()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    iget-object v2, p0, Lg0/e;->f:Lg0/h;

    .line 19
    .line 20
    iget-boolean v2, v2, Lg0/h;->f:Z

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    :cond_1
    :goto_0
    return v0
.end method

.method public final j()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "enable_state_restoration"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0

    .line 23
    :cond_0
    invoke-virtual {p0}, Lg0/e;->d()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    return v2

    .line 30
    :cond_1
    const/4 v0, 0x1

    .line 31
    return v0
.end method

.method public final k(Ljava/lang/String;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lg0/e;->f:Lg0/h;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, " "

    .line 5
    .line 6
    const-string v3, "FlutterActivity "

    .line 7
    .line 8
    const-string v4, "FlutterActivity"

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string p1, " called after release."

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    return v1

    .line 43
    :cond_0
    iget-boolean v0, v0, Lg0/h;->i:Z

    .line 44
    .line 45
    if-nez v0, :cond_1

    .line 46
    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string p1, " called after detach."

    .line 66
    .line 67
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    return v1

    .line 78
    :cond_1
    const/4 p1, 0x1

    .line 79
    return p1
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 1
    const-string v0, "onActivityResult"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lg0/e;->k(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lg0/e;->f:Lg0/h;

    .line 10
    .line 11
    invoke-virtual {v0}, Lg0/h;->c()V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, Lg0/h;->b:Lh0/c;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-static {p3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    iget-object v0, v0, Lg0/h;->b:Lh0/c;

    .line 22
    .line 23
    iget-object v0, v0, Lh0/c;->d:Lh0/e;

    .line 24
    .line 25
    invoke-virtual {v0}, Lh0/e;->e()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    const-string v1, "FlutterEngineConnectionRegistry#onActivityResult"

    .line 32
    .line 33
    invoke-static {v1}, Lw0/a;->b(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :try_start_0
    iget-object v0, v0, Lh0/e;->f:Lh0/d;

    .line 37
    .line 38
    invoke-virtual {v0, p1, p2, p3}, Lh0/d;->d(IILandroid/content/Intent;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    :try_start_1
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_1
    move-exception p2

    .line 51
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    throw p1

    .line 55
    :cond_0
    const-string p1, "FlutterEngineCxnRegstry"

    .line 56
    .line 57
    const-string p2, "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached."

    .line 58
    .line 59
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    const-string p1, "FlutterActivityAndFragmentDelegate"

    .line 64
    .line 65
    const-string p2, "onActivityResult() invoked before FlutterFragment was attached to an Activity."

    .line 66
    .line 67
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    :cond_2
    :goto_1
    return-void
.end method

.method public final onBackPressed()V
    .locals 3

    .line 1
    const-string v0, "onBackPressed"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lg0/e;->k(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lg0/e;->f:Lg0/h;

    .line 10
    .line 11
    invoke-virtual {v0}, Lg0/h;->c()V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, Lg0/h;->b:Lh0/c;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, v0, Lh0/c;->i:Lp0/a;

    .line 19
    .line 20
    iget-object v0, v0, Lp0/a;->a:LN/b;

    .line 21
    .line 22
    const-string v1, "popRoute"

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-virtual {v0, v1, v2, v2}, LN/b;->F(Ljava/lang/String;Ljava/lang/Object;Lp0/k;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-string v0, "FlutterActivityAndFragmentDelegate"

    .line 30
    .line 31
    const-string v1, "Invoked onBackPressed() before FlutterFragment was attached to an Activity."

    .line 32
    .line 33
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 13

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lg0/e;->g()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v1, "io.flutter.embedding.android.NormalTheme"

    .line 8
    .line 9
    const/4 v2, -0x1

    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eq v0, v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/content/Context;->setTheme(I)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catch_0
    const-string v0, "FlutterActivity"

    .line 21
    .line 22
    const-string v1, "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme."

    .line 23
    .line 24
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    :goto_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 28
    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    const-string v0, "enableOnBackInvokedCallbackState"

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-virtual {p0, v0}, Lg0/e;->h(Z)V

    .line 39
    .line 40
    .line 41
    :cond_1
    new-instance v0, Lg0/h;

    .line 42
    .line 43
    invoke-direct {v0, p0}, Lg0/h;-><init>(Lg0/e;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lg0/e;->f:Lg0/h;

    .line 47
    .line 48
    invoke-virtual {v0}, Lg0/h;->c()V

    .line 49
    .line 50
    .line 51
    iget-object v1, v0, Lg0/h;->b:Lh0/c;

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    const/4 v3, 0x1

    .line 55
    const/4 v4, 0x0

    .line 56
    if-nez v1, :cond_1f

    .line 57
    .line 58
    iget-object v1, v0, Lg0/h;->a:Lg0/e;

    .line 59
    .line 60
    invoke-virtual {v1}, Lg0/e;->d()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    if-eqz v1, :cond_4

    .line 65
    .line 66
    sget-object v5, Lh0/i;->c:Lh0/i;

    .line 67
    .line 68
    if-nez v5, :cond_2

    .line 69
    .line 70
    new-instance v5, Lh0/i;

    .line 71
    .line 72
    const/4 v6, 0x1

    .line 73
    invoke-direct {v5, v6}, Lh0/i;-><init>(I)V

    .line 74
    .line 75
    .line 76
    sput-object v5, Lh0/i;->c:Lh0/i;

    .line 77
    .line 78
    :cond_2
    sget-object v5, Lh0/i;->c:Lh0/i;

    .line 79
    .line 80
    iget-object v5, v5, Lh0/i;->a:Ljava/util/HashMap;

    .line 81
    .line 82
    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    check-cast v5, Lh0/c;

    .line 87
    .line 88
    iput-object v5, v0, Lg0/h;->b:Lh0/c;

    .line 89
    .line 90
    iput-boolean v3, v0, Lg0/h;->f:Z

    .line 91
    .line 92
    if-eqz v5, :cond_3

    .line 93
    .line 94
    goto/16 :goto_6

    .line 95
    .line 96
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 97
    .line 98
    new-instance v0, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string v2, "The requested cached FlutterEngine did not exist in the FlutterEngineCache: \'"

    .line 101
    .line 102
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v1, "\'"

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw p1

    .line 121
    :cond_4
    iget-object v1, v0, Lg0/h;->a:Lg0/e;

    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    iput-object v4, v0, Lg0/h;->b:Lh0/c;

    .line 127
    .line 128
    iget-object v1, v0, Lg0/h;->a:Lg0/e;

    .line 129
    .line 130
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    const-string v5, "cached_engine_group_id"

    .line 135
    .line 136
    invoke-virtual {v1, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    if-eqz v1, :cond_8

    .line 141
    .line 142
    sget-object v5, Lh0/i;->b:Lh0/i;

    .line 143
    .line 144
    if-nez v5, :cond_6

    .line 145
    .line 146
    const-class v5, Lh0/i;

    .line 147
    .line 148
    monitor-enter v5

    .line 149
    :try_start_1
    sget-object v6, Lh0/i;->b:Lh0/i;

    .line 150
    .line 151
    if-nez v6, :cond_5

    .line 152
    .line 153
    new-instance v6, Lh0/i;

    .line 154
    .line 155
    const/4 v7, 0x0

    .line 156
    invoke-direct {v6, v7}, Lh0/i;-><init>(I)V

    .line 157
    .line 158
    .line 159
    sput-object v6, Lh0/i;->b:Lh0/i;

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :catchall_0
    move-exception p1

    .line 163
    goto :goto_2

    .line 164
    :cond_5
    :goto_1
    monitor-exit v5

    .line 165
    goto :goto_3

    .line 166
    :goto_2
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 167
    throw p1

    .line 168
    :cond_6
    :goto_3
    sget-object v5, Lh0/i;->b:Lh0/i;

    .line 169
    .line 170
    iget-object v5, v5, Lh0/i;->a:Ljava/util/HashMap;

    .line 171
    .line 172
    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    check-cast v5, Lh0/h;

    .line 177
    .line 178
    if-eqz v5, :cond_7

    .line 179
    .line 180
    new-instance v1, Lh0/g;

    .line 181
    .line 182
    iget-object v6, v0, Lg0/h;->a:Lg0/e;

    .line 183
    .line 184
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-direct {v1, v6}, Lh0/g;-><init>(Lg0/e;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v1}, Lg0/h;->a(Lh0/g;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v5, v1}, Lh0/h;->a(Lh0/g;)Lh0/c;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    iput-object v1, v0, Lg0/h;->b:Lh0/c;

    .line 198
    .line 199
    iput-boolean v2, v0, Lg0/h;->f:Z

    .line 200
    .line 201
    goto/16 :goto_6

    .line 202
    .line 203
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 204
    .line 205
    new-instance v0, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    const-string v2, "The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: \'"

    .line 208
    .line 209
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    const-string v1, "\'"

    .line 216
    .line 217
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    throw p1

    .line 228
    :cond_8
    new-instance v1, Lh0/h;

    .line 229
    .line 230
    iget-object v5, v0, Lg0/h;->a:Lg0/e;

    .line 231
    .line 232
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    iget-object v6, v0, Lg0/h;->a:Lg0/e;

    .line 236
    .line 237
    invoke-virtual {v6}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    new-instance v7, Ljava/util/ArrayList;

    .line 242
    .line 243
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 244
    .line 245
    .line 246
    const-string v8, "trace-startup"

    .line 247
    .line 248
    invoke-virtual {v6, v8, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 249
    .line 250
    .line 251
    move-result v8

    .line 252
    if-eqz v8, :cond_9

    .line 253
    .line 254
    const-string v8, "--trace-startup"

    .line 255
    .line 256
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    :cond_9
    const-string v8, "start-paused"

    .line 260
    .line 261
    invoke-virtual {v6, v8, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 262
    .line 263
    .line 264
    move-result v8

    .line 265
    if-eqz v8, :cond_a

    .line 266
    .line 267
    const-string v8, "--start-paused"

    .line 268
    .line 269
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    :cond_a
    const-string v8, "vm-service-port"

    .line 273
    .line 274
    invoke-virtual {v6, v8, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 275
    .line 276
    .line 277
    move-result v8

    .line 278
    const-string v9, "--vm-service-port="

    .line 279
    .line 280
    if-lez v8, :cond_b

    .line 281
    .line 282
    new-instance v10, Ljava/lang/StringBuilder;

    .line 283
    .line 284
    invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-static {v8}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v8

    .line 291
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v8

    .line 298
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    goto :goto_4

    .line 302
    :cond_b
    const-string v8, "observatory-port"

    .line 303
    .line 304
    invoke-virtual {v6, v8, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 305
    .line 306
    .line 307
    move-result v8

    .line 308
    if-lez v8, :cond_c

    .line 309
    .line 310
    new-instance v10, Ljava/lang/StringBuilder;

    .line 311
    .line 312
    invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    invoke-static {v8}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v8

    .line 319
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v8

    .line 326
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    :cond_c
    :goto_4
    const-string v8, "disable-service-auth-codes"

    .line 330
    .line 331
    invoke-virtual {v6, v8, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 332
    .line 333
    .line 334
    move-result v8

    .line 335
    if-eqz v8, :cond_d

    .line 336
    .line 337
    const-string v8, "--disable-service-auth-codes"

    .line 338
    .line 339
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    :cond_d
    const-string v8, "endless-trace-buffer"

    .line 343
    .line 344
    invoke-virtual {v6, v8, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 345
    .line 346
    .line 347
    move-result v8

    .line 348
    if-eqz v8, :cond_e

    .line 349
    .line 350
    const-string v8, "--endless-trace-buffer"

    .line 351
    .line 352
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    :cond_e
    const-string v8, "use-test-fonts"

    .line 356
    .line 357
    invoke-virtual {v6, v8, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 358
    .line 359
    .line 360
    move-result v8

    .line 361
    if-eqz v8, :cond_f

    .line 362
    .line 363
    const-string v8, "--use-test-fonts"

    .line 364
    .line 365
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    :cond_f
    const-string v8, "enable-dart-profiling"

    .line 369
    .line 370
    invoke-virtual {v6, v8, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 371
    .line 372
    .line 373
    move-result v8

    .line 374
    if-eqz v8, :cond_10

    .line 375
    .line 376
    const-string v8, "--enable-dart-profiling"

    .line 377
    .line 378
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    :cond_10
    const-string v8, "enable-software-rendering"

    .line 382
    .line 383
    invoke-virtual {v6, v8, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 384
    .line 385
    .line 386
    move-result v8

    .line 387
    if-eqz v8, :cond_11

    .line 388
    .line 389
    const-string v8, "--enable-software-rendering"

    .line 390
    .line 391
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    :cond_11
    const-string v8, "skia-deterministic-rendering"

    .line 395
    .line 396
    invoke-virtual {v6, v8, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 397
    .line 398
    .line 399
    move-result v8

    .line 400
    if-eqz v8, :cond_12

    .line 401
    .line 402
    const-string v8, "--skia-deterministic-rendering"

    .line 403
    .line 404
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    :cond_12
    const-string v8, "trace-skia"

    .line 408
    .line 409
    invoke-virtual {v6, v8, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 410
    .line 411
    .line 412
    move-result v8

    .line 413
    if-eqz v8, :cond_13

    .line 414
    .line 415
    const-string v8, "--trace-skia"

    .line 416
    .line 417
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    :cond_13
    const-string v8, "trace-skia-allowlist"

    .line 421
    .line 422
    invoke-virtual {v6, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v8

    .line 426
    if-eqz v8, :cond_14

    .line 427
    .line 428
    const-string v9, "--trace-skia-allowlist="

    .line 429
    .line 430
    invoke-virtual {v9, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v8

    .line 434
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    :cond_14
    const-string v8, "trace-systrace"

    .line 438
    .line 439
    invoke-virtual {v6, v8, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 440
    .line 441
    .line 442
    move-result v8

    .line 443
    if-eqz v8, :cond_15

    .line 444
    .line 445
    const-string v8, "--trace-systrace"

    .line 446
    .line 447
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    :cond_15
    const-string v8, "trace-to-file"

    .line 451
    .line 452
    invoke-virtual {v6, v8}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 453
    .line 454
    .line 455
    move-result v9

    .line 456
    if-eqz v9, :cond_16

    .line 457
    .line 458
    new-instance v9, Ljava/lang/StringBuilder;

    .line 459
    .line 460
    const-string v10, "--trace-to-file="

    .line 461
    .line 462
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v6, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v8

    .line 469
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v8

    .line 476
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    :cond_16
    const-string v8, "enable-impeller"

    .line 480
    .line 481
    invoke-virtual {v6, v8}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 482
    .line 483
    .line 484
    move-result v9

    .line 485
    if-eqz v9, :cond_18

    .line 486
    .line 487
    invoke-virtual {v6, v8, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 488
    .line 489
    .line 490
    move-result v8

    .line 491
    if-eqz v8, :cond_17

    .line 492
    .line 493
    const-string v8, "--enable-impeller=true"

    .line 494
    .line 495
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 496
    .line 497
    .line 498
    goto :goto_5

    .line 499
    :cond_17
    const-string v8, "--enable-impeller=false"

    .line 500
    .line 501
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    :cond_18
    :goto_5
    const-string v8, "enable-vulkan-validation"

    .line 505
    .line 506
    invoke-virtual {v6, v8, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 507
    .line 508
    .line 509
    move-result v8

    .line 510
    if-eqz v8, :cond_19

    .line 511
    .line 512
    const-string v8, "--enable-vulkan-validation"

    .line 513
    .line 514
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 515
    .line 516
    .line 517
    :cond_19
    const-string v8, "dump-skp-on-shader-compilation"

    .line 518
    .line 519
    invoke-virtual {v6, v8, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 520
    .line 521
    .line 522
    move-result v8

    .line 523
    if-eqz v8, :cond_1a

    .line 524
    .line 525
    const-string v8, "--dump-skp-on-shader-compilation"

    .line 526
    .line 527
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 528
    .line 529
    .line 530
    :cond_1a
    const-string v8, "cache-sksl"

    .line 531
    .line 532
    invoke-virtual {v6, v8, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 533
    .line 534
    .line 535
    move-result v8

    .line 536
    if-eqz v8, :cond_1b

    .line 537
    .line 538
    const-string v8, "--cache-sksl"

    .line 539
    .line 540
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 541
    .line 542
    .line 543
    :cond_1b
    const-string v8, "purge-persistent-cache"

    .line 544
    .line 545
    invoke-virtual {v6, v8, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 546
    .line 547
    .line 548
    move-result v8

    .line 549
    if-eqz v8, :cond_1c

    .line 550
    .line 551
    const-string v8, "--purge-persistent-cache"

    .line 552
    .line 553
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    :cond_1c
    const-string v8, "verbose-logging"

    .line 557
    .line 558
    invoke-virtual {v6, v8, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 559
    .line 560
    .line 561
    move-result v8

    .line 562
    if-eqz v8, :cond_1d

    .line 563
    .line 564
    const-string v8, "--verbose-logging"

    .line 565
    .line 566
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 567
    .line 568
    .line 569
    :cond_1d
    const-string v8, "dart-flags"

    .line 570
    .line 571
    invoke-virtual {v6, v8}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 572
    .line 573
    .line 574
    move-result v9

    .line 575
    if-eqz v9, :cond_1e

    .line 576
    .line 577
    new-instance v9, Ljava/lang/StringBuilder;

    .line 578
    .line 579
    const-string v10, "--dart-flags="

    .line 580
    .line 581
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 582
    .line 583
    .line 584
    invoke-virtual {v6, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    move-result-object v6

    .line 588
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v6

    .line 595
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 596
    .line 597
    .line 598
    :cond_1e
    new-instance v6, Ljava/util/HashSet;

    .line 599
    .line 600
    invoke-direct {v6, v7}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 601
    .line 602
    .line 603
    invoke-virtual {v6}, Ljava/util/HashSet;->size()I

    .line 604
    .line 605
    .line 606
    move-result v7

    .line 607
    new-array v7, v7, [Ljava/lang/String;

    .line 608
    .line 609
    invoke-virtual {v6, v7}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v6

    .line 613
    check-cast v6, [Ljava/lang/String;

    .line 614
    .line 615
    invoke-direct {v1, v5, v6}, Lh0/h;-><init>(Lg0/e;[Ljava/lang/String;)V

    .line 616
    .line 617
    .line 618
    new-instance v5, Lh0/g;

    .line 619
    .line 620
    iget-object v6, v0, Lg0/h;->a:Lg0/e;

    .line 621
    .line 622
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 623
    .line 624
    .line 625
    invoke-direct {v5, v6}, Lh0/g;-><init>(Lg0/e;)V

    .line 626
    .line 627
    .line 628
    iput-boolean v2, v5, Lh0/g;->e:Z

    .line 629
    .line 630
    iget-object v6, v0, Lg0/h;->a:Lg0/e;

    .line 631
    .line 632
    invoke-virtual {v6}, Lg0/e;->j()Z

    .line 633
    .line 634
    .line 635
    move-result v6

    .line 636
    iput-boolean v6, v5, Lh0/g;->f:Z

    .line 637
    .line 638
    invoke-virtual {v0, v5}, Lg0/h;->a(Lh0/g;)V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v1, v5}, Lh0/h;->a(Lh0/g;)Lh0/c;

    .line 642
    .line 643
    .line 644
    move-result-object v1

    .line 645
    iput-object v1, v0, Lg0/h;->b:Lh0/c;

    .line 646
    .line 647
    iput-boolean v2, v0, Lg0/h;->f:Z

    .line 648
    .line 649
    :cond_1f
    :goto_6
    iget-object v1, v0, Lg0/h;->a:Lg0/e;

    .line 650
    .line 651
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 652
    .line 653
    .line 654
    iget-object v1, v0, Lg0/h;->b:Lh0/c;

    .line 655
    .line 656
    iget-object v1, v1, Lh0/c;->d:Lh0/e;

    .line 657
    .line 658
    iget-object v5, v0, Lg0/h;->a:Lg0/e;

    .line 659
    .line 660
    iget-object v5, v5, Lg0/e;->g:Landroidx/lifecycle/n;

    .line 661
    .line 662
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 663
    .line 664
    .line 665
    const-string v6, "FlutterEngineConnectionRegistry#attachToActivity"

    .line 666
    .line 667
    invoke-static {v6}, Lw0/a;->b(Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    :try_start_2
    iget-object v6, v1, Lh0/e;->e:Lg0/h;

    .line 671
    .line 672
    if-eqz v6, :cond_20

    .line 673
    .line 674
    invoke-virtual {v6}, Lg0/h;->b()V

    .line 675
    .line 676
    .line 677
    goto :goto_7

    .line 678
    :catchall_1
    move-exception p1

    .line 679
    goto/16 :goto_19

    .line 680
    .line 681
    :cond_20
    :goto_7
    invoke-virtual {v1}, Lh0/e;->d()V

    .line 682
    .line 683
    .line 684
    iput-object v0, v1, Lh0/e;->e:Lg0/h;

    .line 685
    .line 686
    iget-object v6, v0, Lg0/h;->a:Lg0/e;

    .line 687
    .line 688
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 689
    .line 690
    .line 691
    invoke-virtual {v1, v6, v5}, Lh0/e;->b(Lg0/e;Landroidx/lifecycle/n;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 692
    .line 693
    .line 694
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 695
    .line 696
    .line 697
    iget-object v1, v0, Lg0/h;->a:Lg0/e;

    .line 698
    .line 699
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 700
    .line 701
    .line 702
    iget-object v5, v0, Lg0/h;->b:Lh0/c;

    .line 703
    .line 704
    new-instance v6, Lio/flutter/plugin/platform/f;

    .line 705
    .line 706
    iget-object v5, v5, Lh0/c;->l:LN/Q;

    .line 707
    .line 708
    invoke-direct {v6, v1, v5, v1}, Lio/flutter/plugin/platform/f;-><init>(Lg0/e;LN/Q;Lg0/e;)V

    .line 709
    .line 710
    .line 711
    iput-object v6, v0, Lg0/h;->d:Lio/flutter/plugin/platform/f;

    .line 712
    .line 713
    iget-object v1, v0, Lg0/h;->a:Lg0/e;

    .line 714
    .line 715
    iget-object v5, v0, Lg0/h;->b:Lh0/c;

    .line 716
    .line 717
    iget-object v1, v1, Lg0/e;->f:Lg0/h;

    .line 718
    .line 719
    iget-boolean v1, v1, Lg0/h;->f:Z

    .line 720
    .line 721
    if-eqz v1, :cond_21

    .line 722
    .line 723
    goto :goto_8

    .line 724
    :cond_21
    invoke-static {v5}, La1/a;->v(Lh0/c;)V

    .line 725
    .line 726
    .line 727
    :goto_8
    iput-boolean v3, v0, Lg0/h;->i:Z

    .line 728
    .line 729
    iget-object v0, p0, Lg0/e;->f:Lg0/h;

    .line 730
    .line 731
    invoke-virtual {v0}, Lg0/h;->c()V

    .line 732
    .line 733
    .line 734
    if-eqz p1, :cond_22

    .line 735
    .line 736
    const-string v1, "plugins"

    .line 737
    .line 738
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 739
    .line 740
    .line 741
    const-string v1, "framework"

    .line 742
    .line 743
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 744
    .line 745
    .line 746
    move-result-object p1

    .line 747
    goto :goto_9

    .line 748
    :cond_22
    move-object p1, v4

    .line 749
    :goto_9
    iget-object v1, v0, Lg0/h;->a:Lg0/e;

    .line 750
    .line 751
    invoke-virtual {v1}, Lg0/e;->j()Z

    .line 752
    .line 753
    .line 754
    move-result v1

    .line 755
    if-eqz v1, :cond_25

    .line 756
    .line 757
    iget-object v1, v0, Lg0/h;->b:Lh0/c;

    .line 758
    .line 759
    iget-object v1, v1, Lh0/c;->k:Lp0/l;

    .line 760
    .line 761
    iput-boolean v3, v1, Lp0/l;->e:Z

    .line 762
    .line 763
    iget-object v5, v1, Lp0/l;->d:Lp0/k;

    .line 764
    .line 765
    if-eqz v5, :cond_23

    .line 766
    .line 767
    invoke-static {p1}, Lp0/l;->a([B)Ljava/util/HashMap;

    .line 768
    .line 769
    .line 770
    move-result-object v6

    .line 771
    invoke-virtual {v5, v6}, Lp0/k;->c(Ljava/lang/Object;)V

    .line 772
    .line 773
    .line 774
    iput-object v4, v1, Lp0/l;->d:Lp0/k;

    .line 775
    .line 776
    iput-object p1, v1, Lp0/l;->b:[B

    .line 777
    .line 778
    goto :goto_a

    .line 779
    :cond_23
    iget-boolean v5, v1, Lp0/l;->f:Z

    .line 780
    .line 781
    if-eqz v5, :cond_24

    .line 782
    .line 783
    invoke-static {p1}, Lp0/l;->a([B)Ljava/util/HashMap;

    .line 784
    .line 785
    .line 786
    move-result-object v5

    .line 787
    new-instance v6, Lp0/k;

    .line 788
    .line 789
    const/4 v7, 0x0

    .line 790
    invoke-direct {v6, v7, v1, p1}, Lp0/k;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 791
    .line 792
    .line 793
    iget-object p1, v1, Lp0/l;->c:LN/b;

    .line 794
    .line 795
    const-string v1, "push"

    .line 796
    .line 797
    invoke-virtual {p1, v1, v5, v6}, LN/b;->F(Ljava/lang/String;Ljava/lang/Object;Lp0/k;)V

    .line 798
    .line 799
    .line 800
    goto :goto_a

    .line 801
    :cond_24
    iput-object p1, v1, Lp0/l;->b:[B

    .line 802
    .line 803
    :cond_25
    :goto_a
    iget-object p1, v0, Lg0/h;->a:Lg0/e;

    .line 804
    .line 805
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 806
    .line 807
    .line 808
    iget-object p1, v0, Lg0/h;->b:Lh0/c;

    .line 809
    .line 810
    iget-object p1, p1, Lh0/c;->d:Lh0/e;

    .line 811
    .line 812
    invoke-virtual {p1}, Lh0/e;->e()Z

    .line 813
    .line 814
    .line 815
    move-result v0

    .line 816
    if-eqz v0, :cond_28

    .line 817
    .line 818
    const-string v0, "FlutterEngineConnectionRegistry#onRestoreInstanceState"

    .line 819
    .line 820
    invoke-static {v0}, Lw0/a;->b(Ljava/lang/String;)V

    .line 821
    .line 822
    .line 823
    :try_start_3
    iget-object p1, p1, Lh0/e;->f:Lh0/d;

    .line 824
    .line 825
    iget-object p1, p1, Lh0/d;->f:Ljava/lang/Object;

    .line 826
    .line 827
    check-cast p1, Ljava/util/HashSet;

    .line 828
    .line 829
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 830
    .line 831
    .line 832
    move-result-object p1

    .line 833
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 834
    .line 835
    .line 836
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 837
    if-nez v0, :cond_26

    .line 838
    .line 839
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 840
    .line 841
    .line 842
    goto :goto_c

    .line 843
    :cond_26
    :try_start_4
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 844
    .line 845
    .line 846
    move-result-object p1

    .line 847
    if-nez p1, :cond_27

    .line 848
    .line 849
    throw v4

    .line 850
    :cond_27
    new-instance p1, Ljava/lang/ClassCastException;

    .line 851
    .line 852
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 853
    .line 854
    .line 855
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 856
    :catchall_2
    move-exception p1

    .line 857
    :try_start_5
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 858
    .line 859
    .line 860
    goto :goto_b

    .line 861
    :catchall_3
    move-exception v0

    .line 862
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 863
    .line 864
    .line 865
    :goto_b
    throw p1

    .line 866
    :cond_28
    const-string p1, "FlutterEngineCxnRegstry"

    .line 867
    .line 868
    const-string v0, "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached."

    .line 869
    .line 870
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 871
    .line 872
    .line 873
    :goto_c
    iget-object p1, p0, Lg0/e;->g:Landroidx/lifecycle/n;

    .line 874
    .line 875
    sget-object v0, Landroidx/lifecycle/f;->ON_CREATE:Landroidx/lifecycle/f;

    .line 876
    .line 877
    invoke-virtual {p1, v0}, Landroidx/lifecycle/n;->c(Landroidx/lifecycle/f;)V

    .line 878
    .line 879
    .line 880
    invoke-virtual {p0}, Lg0/e;->c()I

    .line 881
    .line 882
    .line 883
    move-result p1

    .line 884
    const/4 v0, 0x2

    .line 885
    if-ne p1, v0, :cond_29

    .line 886
    .line 887
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 888
    .line 889
    .line 890
    move-result-object p1

    .line 891
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 892
    .line 893
    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 894
    .line 895
    .line 896
    invoke-virtual {p1, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 897
    .line 898
    .line 899
    :cond_29
    iget-object p1, p0, Lg0/e;->f:Lg0/h;

    .line 900
    .line 901
    invoke-virtual {p0}, Lg0/e;->c()I

    .line 902
    .line 903
    .line 904
    move-result v1

    .line 905
    if-ne v1, v3, :cond_2a

    .line 906
    .line 907
    const/4 v0, 0x1

    .line 908
    :cond_2a
    if-ne v0, v3, :cond_2b

    .line 909
    .line 910
    const/4 v0, 0x1

    .line 911
    goto :goto_d

    .line 912
    :cond_2b
    const/4 v0, 0x0

    .line 913
    :goto_d
    invoke-virtual {p1}, Lg0/h;->c()V

    .line 914
    .line 915
    .line 916
    iget-object v1, p1, Lg0/h;->a:Lg0/e;

    .line 917
    .line 918
    invoke-virtual {v1}, Lg0/e;->c()I

    .line 919
    .line 920
    .line 921
    move-result v1

    .line 922
    if-ne v1, v3, :cond_2d

    .line 923
    .line 924
    new-instance v1, Lg0/k;

    .line 925
    .line 926
    iget-object v4, p1, Lg0/h;->a:Lg0/e;

    .line 927
    .line 928
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 929
    .line 930
    .line 931
    iget-object v5, p1, Lg0/h;->a:Lg0/e;

    .line 932
    .line 933
    invoke-virtual {v5}, Lg0/e;->c()I

    .line 934
    .line 935
    .line 936
    move-result v5

    .line 937
    if-ne v5, v3, :cond_2c

    .line 938
    .line 939
    const/4 v5, 0x0

    .line 940
    goto :goto_e

    .line 941
    :cond_2c
    const/4 v5, 0x1

    .line 942
    :goto_e
    invoke-direct {v1, v4, v5}, Lg0/k;-><init>(Lg0/e;Z)V

    .line 943
    .line 944
    .line 945
    iget-object v4, p1, Lg0/h;->a:Lg0/e;

    .line 946
    .line 947
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 948
    .line 949
    .line 950
    new-instance v4, Lg0/q;

    .line 951
    .line 952
    iget-object v5, p1, Lg0/h;->a:Lg0/e;

    .line 953
    .line 954
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 955
    .line 956
    .line 957
    invoke-direct {v4, v5, v1}, Lg0/q;-><init>(Lg0/e;Lg0/k;)V

    .line 958
    .line 959
    .line 960
    iput-object v4, p1, Lg0/h;->c:Lg0/q;

    .line 961
    .line 962
    goto :goto_10

    .line 963
    :cond_2d
    new-instance v1, Lg0/m;

    .line 964
    .line 965
    iget-object v4, p1, Lg0/h;->a:Lg0/e;

    .line 966
    .line 967
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 968
    .line 969
    .line 970
    const/4 v5, 0x0

    .line 971
    invoke-direct {v1, v4, v5}, Landroid/view/TextureView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 972
    .line 973
    .line 974
    const/4 v4, 0x0

    .line 975
    iput-boolean v4, v1, Lg0/m;->e:Z

    .line 976
    .line 977
    iput-boolean v4, v1, Lg0/m;->f:Z

    .line 978
    .line 979
    new-instance v4, Lg0/l;

    .line 980
    .line 981
    invoke-direct {v4, v1}, Lg0/l;-><init>(Lg0/m;)V

    .line 982
    .line 983
    .line 984
    invoke-virtual {v1, v4}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 985
    .line 986
    .line 987
    iget-object v4, p1, Lg0/h;->a:Lg0/e;

    .line 988
    .line 989
    invoke-virtual {v4}, Lg0/e;->c()I

    .line 990
    .line 991
    .line 992
    move-result v4

    .line 993
    if-ne v4, v3, :cond_2e

    .line 994
    .line 995
    const/4 v4, 0x1

    .line 996
    goto :goto_f

    .line 997
    :cond_2e
    const/4 v4, 0x0

    .line 998
    :goto_f
    invoke-virtual {v1, v4}, Landroid/view/TextureView;->setOpaque(Z)V

    .line 999
    .line 1000
    .line 1001
    iget-object v4, p1, Lg0/h;->a:Lg0/e;

    .line 1002
    .line 1003
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1004
    .line 1005
    .line 1006
    new-instance v4, Lg0/q;

    .line 1007
    .line 1008
    iget-object v5, p1, Lg0/h;->a:Lg0/e;

    .line 1009
    .line 1010
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1011
    .line 1012
    .line 1013
    invoke-direct {v4, v5, v1}, Lg0/q;-><init>(Lg0/e;Lg0/m;)V

    .line 1014
    .line 1015
    .line 1016
    iput-object v4, p1, Lg0/h;->c:Lg0/q;

    .line 1017
    .line 1018
    :goto_10
    iget-object v1, p1, Lg0/h;->c:Lg0/q;

    .line 1019
    .line 1020
    iget-object v4, p1, Lg0/h;->k:Lg0/f;

    .line 1021
    .line 1022
    iget-object v1, v1, Lg0/q;->j:Ljava/util/HashSet;

    .line 1023
    .line 1024
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1025
    .line 1026
    .line 1027
    iget-object v1, p1, Lg0/h;->a:Lg0/e;

    .line 1028
    .line 1029
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1030
    .line 1031
    .line 1032
    iget-object v1, p1, Lg0/h;->c:Lg0/q;

    .line 1033
    .line 1034
    iget-object v10, p1, Lg0/h;->b:Lh0/c;

    .line 1035
    .line 1036
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1037
    .line 1038
    .line 1039
    invoke-static {v10}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v1}, Lg0/q;->c()Z

    .line 1043
    .line 1044
    .line 1045
    move-result v4

    .line 1046
    if-eqz v4, :cond_30

    .line 1047
    .line 1048
    iget-object v4, v1, Lg0/q;->l:Lh0/c;

    .line 1049
    .line 1050
    if-ne v10, v4, :cond_2f

    .line 1051
    .line 1052
    goto/16 :goto_17

    .line 1053
    .line 1054
    :cond_2f
    invoke-virtual {v1}, Lg0/q;->a()V

    .line 1055
    .line 1056
    .line 1057
    :cond_30
    iput-object v10, v1, Lg0/q;->l:Lh0/c;

    .line 1058
    .line 1059
    iget-object v4, v10, Lh0/c;->b:Lio/flutter/embedding/engine/renderer/l;

    .line 1060
    .line 1061
    iget-boolean v5, v4, Lio/flutter/embedding/engine/renderer/l;->d:Z

    .line 1062
    .line 1063
    iput-boolean v5, v1, Lg0/q;->k:Z

    .line 1064
    .line 1065
    iget-object v5, v1, Lg0/q;->h:Landroid/view/View;

    .line 1066
    .line 1067
    invoke-interface {v5, v4}, Lio/flutter/embedding/engine/renderer/n;->a(Lio/flutter/embedding/engine/renderer/l;)V

    .line 1068
    .line 1069
    .line 1070
    iget-object v11, v1, Lg0/q;->z:Lg0/f;

    .line 1071
    .line 1072
    iget-object v5, v4, Lio/flutter/embedding/engine/renderer/l;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 1073
    .line 1074
    invoke-virtual {v5, v11}, Lio/flutter/embedding/engine/FlutterJNI;->addIsDisplayingFlutterUiListener(Lio/flutter/embedding/engine/renderer/m;)V

    .line 1075
    .line 1076
    .line 1077
    iget-boolean v4, v4, Lio/flutter/embedding/engine/renderer/l;->d:Z

    .line 1078
    .line 1079
    if-eqz v4, :cond_31

    .line 1080
    .line 1081
    invoke-virtual {v11}, Lg0/f;->b()V

    .line 1082
    .line 1083
    .line 1084
    :cond_31
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1085
    .line 1086
    const/16 v5, 0x18

    .line 1087
    .line 1088
    if-lt v4, v5, :cond_32

    .line 1089
    .line 1090
    new-instance v4, LN/Q;

    .line 1091
    .line 1092
    iget-object v5, v1, Lg0/q;->l:Lh0/c;

    .line 1093
    .line 1094
    iget-object v5, v5, Lh0/c;->h:Lp0/b;

    .line 1095
    .line 1096
    invoke-direct {v4, v1, v5}, LN/Q;-><init>(Ls0/a;Lp0/b;)V

    .line 1097
    .line 1098
    .line 1099
    iput-object v4, v1, Lg0/q;->n:LN/Q;

    .line 1100
    .line 1101
    :cond_32
    new-instance v4, Lio/flutter/plugin/editing/j;

    .line 1102
    .line 1103
    iget-object v5, v1, Lg0/q;->l:Lh0/c;

    .line 1104
    .line 1105
    iget-object v6, v5, Lh0/c;->q:LN/Q;

    .line 1106
    .line 1107
    iget-object v7, v5, Lh0/c;->m:Lp0/b;

    .line 1108
    .line 1109
    iget-object v5, v5, Lh0/c;->r:Lio/flutter/plugin/platform/o;

    .line 1110
    .line 1111
    invoke-direct {v4, v1, v6, v7, v5}, Lio/flutter/plugin/editing/j;-><init>(Landroid/view/View;LN/Q;Lp0/b;Lio/flutter/plugin/platform/o;)V

    .line 1112
    .line 1113
    .line 1114
    iput-object v4, v1, Lg0/q;->o:Lio/flutter/plugin/editing/j;

    .line 1115
    .line 1116
    :try_start_6
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v4

    .line 1120
    const-string v5, "textservices"

    .line 1121
    .line 1122
    invoke-virtual {v4, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v4

    .line 1126
    check-cast v4, Landroid/view/textservice/TextServicesManager;

    .line 1127
    .line 1128
    iput-object v4, v1, Lg0/q;->u:Landroid/view/textservice/TextServicesManager;

    .line 1129
    .line 1130
    new-instance v5, Lio/flutter/plugin/editing/g;

    .line 1131
    .line 1132
    iget-object v6, v1, Lg0/q;->l:Lh0/c;

    .line 1133
    .line 1134
    iget-object v6, v6, Lh0/c;->o:Lp0/b;

    .line 1135
    .line 1136
    invoke-direct {v5, v4, v6}, Lio/flutter/plugin/editing/g;-><init>(Landroid/view/textservice/TextServicesManager;Lp0/b;)V

    .line 1137
    .line 1138
    .line 1139
    iput-object v5, v1, Lg0/q;->p:Lio/flutter/plugin/editing/g;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    .line 1140
    .line 1141
    goto :goto_11

    .line 1142
    :catch_1
    const-string v4, "FlutterView"

    .line 1143
    .line 1144
    const-string v5, "TextServicesManager not supported by device, spell check disabled."

    .line 1145
    .line 1146
    invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1147
    .line 1148
    .line 1149
    :goto_11
    new-instance v4, LN/Q;

    .line 1150
    .line 1151
    iget-object v5, v1, Lg0/q;->o:Lio/flutter/plugin/editing/j;

    .line 1152
    .line 1153
    iget-object v5, v5, Lio/flutter/plugin/editing/j;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 1154
    .line 1155
    iget-object v6, v1, Lg0/q;->l:Lh0/c;

    .line 1156
    .line 1157
    iget-object v6, v6, Lh0/c;->m:Lp0/b;

    .line 1158
    .line 1159
    invoke-direct {v4, v1, v5, v6}, LN/Q;-><init>(Landroid/view/View;Landroid/view/inputmethod/InputMethodManager;Lp0/b;)V

    .line 1160
    .line 1161
    .line 1162
    iget-object v4, v1, Lg0/q;->l:Lh0/c;

    .line 1163
    .line 1164
    iget-object v4, v4, Lh0/c;->e:Lr0/b;

    .line 1165
    .line 1166
    iput-object v4, v1, Lg0/q;->q:Lr0/b;

    .line 1167
    .line 1168
    new-instance v4, LN/b;

    .line 1169
    .line 1170
    invoke-direct {v4, v1}, LN/b;-><init>(Lg0/C;)V

    .line 1171
    .line 1172
    .line 1173
    iput-object v4, v1, Lg0/q;->r:LN/b;

    .line 1174
    .line 1175
    new-instance v4, Lg0/a;

    .line 1176
    .line 1177
    iget-object v5, v1, Lg0/q;->l:Lh0/c;

    .line 1178
    .line 1179
    iget-object v5, v5, Lh0/c;->b:Lio/flutter/embedding/engine/renderer/l;

    .line 1180
    .line 1181
    invoke-direct {v4, v5, v2}, Lg0/a;-><init>(Lio/flutter/embedding/engine/renderer/l;Z)V

    .line 1182
    .line 1183
    .line 1184
    iput-object v4, v1, Lg0/q;->s:Lg0/a;

    .line 1185
    .line 1186
    new-instance v12, Lio/flutter/view/k;

    .line 1187
    .line 1188
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v4

    .line 1192
    const-string v5, "accessibility"

    .line 1193
    .line 1194
    invoke-virtual {v4, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v4

    .line 1198
    move-object v7, v4

    .line 1199
    check-cast v7, Landroid/view/accessibility/AccessibilityManager;

    .line 1200
    .line 1201
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v4

    .line 1205
    invoke-virtual {v4}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v8

    .line 1209
    iget-object v4, v1, Lg0/q;->l:Lh0/c;

    .line 1210
    .line 1211
    iget-object v9, v4, Lh0/c;->r:Lio/flutter/plugin/platform/o;

    .line 1212
    .line 1213
    iget-object v6, v10, Lh0/c;->f:LN/b;

    .line 1214
    .line 1215
    move-object v4, v12

    .line 1216
    move-object v5, v1

    .line 1217
    invoke-direct/range {v4 .. v9}, Lio/flutter/view/k;-><init>(Landroid/view/View;LN/b;Landroid/view/accessibility/AccessibilityManager;Landroid/content/ContentResolver;Lio/flutter/plugin/platform/o;)V

    .line 1218
    .line 1219
    .line 1220
    iput-object v12, v1, Lg0/q;->t:Lio/flutter/view/k;

    .line 1221
    .line 1222
    iget-object v4, v1, Lg0/q;->x:LD/j;

    .line 1223
    .line 1224
    iput-object v4, v12, Lio/flutter/view/k;->s:LD/j;

    .line 1225
    .line 1226
    iget-object v4, v12, Lio/flutter/view/k;->c:Landroid/view/accessibility/AccessibilityManager;

    .line 1227
    .line 1228
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 1229
    .line 1230
    .line 1231
    move-result v4

    .line 1232
    iget-object v5, v1, Lg0/q;->t:Lio/flutter/view/k;

    .line 1233
    .line 1234
    iget-object v5, v5, Lio/flutter/view/k;->c:Landroid/view/accessibility/AccessibilityManager;

    .line 1235
    .line 1236
    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 1237
    .line 1238
    .line 1239
    move-result v5

    .line 1240
    iget-object v6, v1, Lg0/q;->l:Lh0/c;

    .line 1241
    .line 1242
    iget-object v6, v6, Lh0/c;->b:Lio/flutter/embedding/engine/renderer/l;

    .line 1243
    .line 1244
    iget-object v6, v6, Lio/flutter/embedding/engine/renderer/l;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 1245
    .line 1246
    invoke-virtual {v6}, Lio/flutter/embedding/engine/FlutterJNI;->getIsSoftwareRenderingEnabled()Z

    .line 1247
    .line 1248
    .line 1249
    move-result v6

    .line 1250
    if-nez v6, :cond_34

    .line 1251
    .line 1252
    if-nez v4, :cond_33

    .line 1253
    .line 1254
    if-nez v5, :cond_33

    .line 1255
    .line 1256
    const/4 v4, 0x1

    .line 1257
    goto :goto_12

    .line 1258
    :cond_33
    const/4 v4, 0x0

    .line 1259
    :goto_12
    invoke-virtual {v1, v4}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 1260
    .line 1261
    .line 1262
    goto :goto_13

    .line 1263
    :cond_34
    invoke-virtual {v1, v2}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 1264
    .line 1265
    .line 1266
    :goto_13
    iget-object v4, v1, Lg0/q;->l:Lh0/c;

    .line 1267
    .line 1268
    iget-object v5, v4, Lh0/c;->r:Lio/flutter/plugin/platform/o;

    .line 1269
    .line 1270
    iget-object v6, v1, Lg0/q;->t:Lio/flutter/view/k;

    .line 1271
    .line 1272
    iget-object v7, v5, Lio/flutter/plugin/platform/o;->h:Lio/flutter/plugin/platform/a;

    .line 1273
    .line 1274
    iput-object v6, v7, Lio/flutter/plugin/platform/a;->a:Lio/flutter/view/k;

    .line 1275
    .line 1276
    new-instance v6, Lg0/a;

    .line 1277
    .line 1278
    iget-object v4, v4, Lh0/c;->b:Lio/flutter/embedding/engine/renderer/l;

    .line 1279
    .line 1280
    invoke-direct {v6, v4, v3}, Lg0/a;-><init>(Lio/flutter/embedding/engine/renderer/l;Z)V

    .line 1281
    .line 1282
    .line 1283
    iput-object v6, v5, Lio/flutter/plugin/platform/o;->b:Lg0/a;

    .line 1284
    .line 1285
    iget-object v4, v1, Lg0/q;->o:Lio/flutter/plugin/editing/j;

    .line 1286
    .line 1287
    iget-object v4, v4, Lio/flutter/plugin/editing/j;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 1288
    .line 1289
    invoke-virtual {v4, v1}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 1290
    .line 1291
    .line 1292
    invoke-virtual {v1}, Lg0/q;->d()V

    .line 1293
    .line 1294
    .line 1295
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v4

    .line 1299
    invoke-virtual {v4}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v4

    .line 1303
    const-string v5, "show_password"

    .line 1304
    .line 1305
    invoke-static {v5}, Landroid/provider/Settings$System;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v5

    .line 1309
    iget-object v6, v1, Lg0/q;->y:LE/a;

    .line 1310
    .line 1311
    invoke-virtual {v4, v5, v2, v6}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 1312
    .line 1313
    .line 1314
    invoke-virtual {v1}, Lg0/q;->e()V

    .line 1315
    .line 1316
    .line 1317
    iget-object v4, v10, Lh0/c;->r:Lio/flutter/plugin/platform/o;

    .line 1318
    .line 1319
    iput-object v1, v4, Lio/flutter/plugin/platform/o;->d:Lg0/q;

    .line 1320
    .line 1321
    const/4 v5, 0x0

    .line 1322
    :goto_14
    iget-object v6, v4, Lio/flutter/plugin/platform/o;->n:Landroid/util/SparseArray;

    .line 1323
    .line 1324
    invoke-virtual {v6}, Landroid/util/SparseArray;->size()I

    .line 1325
    .line 1326
    .line 1327
    move-result v7

    .line 1328
    if-ge v5, v7, :cond_35

    .line 1329
    .line 1330
    invoke-virtual {v6, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1331
    .line 1332
    .line 1333
    move-result-object v6

    .line 1334
    check-cast v6, Lio/flutter/plugin/platform/j;

    .line 1335
    .line 1336
    iget-object v7, v4, Lio/flutter/plugin/platform/o;->d:Lg0/q;

    .line 1337
    .line 1338
    invoke-virtual {v7, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1339
    .line 1340
    .line 1341
    add-int/lit8 v5, v5, 0x1

    .line 1342
    .line 1343
    goto :goto_14

    .line 1344
    :cond_35
    const/4 v5, 0x0

    .line 1345
    :goto_15
    iget-object v6, v4, Lio/flutter/plugin/platform/o;->l:Landroid/util/SparseArray;

    .line 1346
    .line 1347
    invoke-virtual {v6}, Landroid/util/SparseArray;->size()I

    .line 1348
    .line 1349
    .line 1350
    move-result v7

    .line 1351
    if-ge v5, v7, :cond_36

    .line 1352
    .line 1353
    invoke-virtual {v6, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v6

    .line 1357
    check-cast v6, Ll0/a;

    .line 1358
    .line 1359
    iget-object v7, v4, Lio/flutter/plugin/platform/o;->d:Lg0/q;

    .line 1360
    .line 1361
    invoke-virtual {v7, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1362
    .line 1363
    .line 1364
    add-int/lit8 v5, v5, 0x1

    .line 1365
    .line 1366
    goto :goto_15

    .line 1367
    :cond_36
    :goto_16
    iget-object v5, v4, Lio/flutter/plugin/platform/o;->k:Landroid/util/SparseArray;

    .line 1368
    .line 1369
    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    .line 1370
    .line 1371
    .line 1372
    move-result v6

    .line 1373
    if-ge v2, v6, :cond_37

    .line 1374
    .line 1375
    invoke-virtual {v5, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v5

    .line 1379
    check-cast v5, Lio/flutter/plugin/platform/g;

    .line 1380
    .line 1381
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1382
    .line 1383
    .line 1384
    add-int/lit8 v2, v2, 0x1

    .line 1385
    .line 1386
    goto :goto_16

    .line 1387
    :cond_37
    iget-object v2, v1, Lg0/q;->m:Ljava/util/HashSet;

    .line 1388
    .line 1389
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v2

    .line 1393
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1394
    .line 1395
    .line 1396
    move-result v4

    .line 1397
    if-nez v4, :cond_3c

    .line 1398
    .line 1399
    iget-boolean v1, v1, Lg0/q;->k:Z

    .line 1400
    .line 1401
    if-eqz v1, :cond_38

    .line 1402
    .line 1403
    invoke-virtual {v11}, Lg0/f;->b()V

    .line 1404
    .line 1405
    .line 1406
    :cond_38
    :goto_17
    iget-object v1, p1, Lg0/h;->c:Lg0/q;

    .line 1407
    .line 1408
    sget v2, Lg0/e;->i:I

    .line 1409
    .line 1410
    invoke-virtual {v1, v2}, Landroid/view/View;->setId(I)V

    .line 1411
    .line 1412
    .line 1413
    if-eqz v0, :cond_3b

    .line 1414
    .line 1415
    iget-object v0, p1, Lg0/h;->c:Lg0/q;

    .line 1416
    .line 1417
    iget-object v1, p1, Lg0/h;->a:Lg0/e;

    .line 1418
    .line 1419
    invoke-virtual {v1}, Lg0/e;->c()I

    .line 1420
    .line 1421
    .line 1422
    move-result v1

    .line 1423
    if-ne v1, v3, :cond_3a

    .line 1424
    .line 1425
    iget-object v1, p1, Lg0/h;->e:Lg0/g;

    .line 1426
    .line 1427
    if-eqz v1, :cond_39

    .line 1428
    .line 1429
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v1

    .line 1433
    iget-object v2, p1, Lg0/h;->e:Lg0/g;

    .line 1434
    .line 1435
    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 1436
    .line 1437
    .line 1438
    :cond_39
    new-instance v1, Lg0/g;

    .line 1439
    .line 1440
    invoke-direct {v1, p1, v0}, Lg0/g;-><init>(Lg0/h;Lg0/q;)V

    .line 1441
    .line 1442
    .line 1443
    iput-object v1, p1, Lg0/h;->e:Lg0/g;

    .line 1444
    .line 1445
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v0

    .line 1449
    iget-object v1, p1, Lg0/h;->e:Lg0/g;

    .line 1450
    .line 1451
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 1452
    .line 1453
    .line 1454
    goto :goto_18

    .line 1455
    :cond_3a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 1456
    .line 1457
    const-string v0, "Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`."

    .line 1458
    .line 1459
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1460
    .line 1461
    .line 1462
    throw p1

    .line 1463
    :cond_3b
    :goto_18
    iget-object p1, p1, Lg0/h;->c:Lg0/q;

    .line 1464
    .line 1465
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    .line 1466
    .line 1467
    .line 1468
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 1469
    .line 1470
    .line 1471
    move-result-object p1

    .line 1472
    const/high16 v0, -0x80000000

    .line 1473
    .line 1474
    invoke-virtual {p1, v0}, Landroid/view/Window;->addFlags(I)V

    .line 1475
    .line 1476
    .line 1477
    const/high16 v0, 0x40000000    # 2.0f

    .line 1478
    .line 1479
    invoke-virtual {p1, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 1480
    .line 1481
    .line 1482
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 1483
    .line 1484
    .line 1485
    move-result-object p1

    .line 1486
    const/16 v0, 0x500

    .line 1487
    .line 1488
    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 1489
    .line 1490
    .line 1491
    return-void

    .line 1492
    :cond_3c
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1493
    .line 1494
    .line 1495
    move-result-object p1

    .line 1496
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1497
    .line 1498
    .line 1499
    new-instance p1, Ljava/lang/ClassCastException;

    .line 1500
    .line 1501
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 1502
    .line 1503
    .line 1504
    throw p1

    .line 1505
    :goto_19
    :try_start_7
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 1506
    .line 1507
    .line 1508
    goto :goto_1a

    .line 1509
    :catchall_4
    move-exception v0

    .line 1510
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 1511
    .line 1512
    .line 1513
    :goto_1a
    throw p1
.end method

.method public final onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    const-string v0, "onDestroy"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lg0/e;->k(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lg0/e;->f:Lg0/h;

    .line 13
    .line 14
    invoke-virtual {v0}, Lg0/h;->e()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lg0/e;->f:Lg0/h;

    .line 18
    .line 19
    invoke-virtual {v0}, Lg0/h;->f()V

    .line 20
    .line 21
    .line 22
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 23
    .line 24
    const/16 v1, 0x21

    .line 25
    .line 26
    if-lt v0, v1, :cond_1

    .line 27
    .line 28
    invoke-static {p0}, Lg0/b;->f(Lg0/e;)Landroid/window/OnBackInvokedDispatcher;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v1, p0, Lg0/e;->h:Landroid/window/OnBackInvokedCallback;

    .line 33
    .line 34
    invoke-static {v0, v1}, Lg0/b;->o(Landroid/window/OnBackInvokedDispatcher;Landroid/window/OnBackInvokedCallback;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, Lg0/e;->e:Z

    .line 39
    .line 40
    :cond_1
    iget-object v0, p0, Lg0/e;->f:Lg0/h;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    iput-object v1, v0, Lg0/h;->a:Lg0/e;

    .line 46
    .line 47
    iput-object v1, v0, Lg0/h;->b:Lh0/c;

    .line 48
    .line 49
    iput-object v1, v0, Lg0/h;->c:Lg0/q;

    .line 50
    .line 51
    iput-object v1, v0, Lg0/h;->d:Lio/flutter/plugin/platform/f;

    .line 52
    .line 53
    iput-object v1, p0, Lg0/e;->f:Lg0/h;

    .line 54
    .line 55
    :cond_2
    iget-object v0, p0, Lg0/e;->g:Landroidx/lifecycle/n;

    .line 56
    .line 57
    sget-object v1, Landroidx/lifecycle/f;->ON_DESTROY:Landroidx/lifecycle/f;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroidx/lifecycle/n;->c(Landroidx/lifecycle/f;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "onNewIntent"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lg0/e;->k(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_4

    .line 11
    .line 12
    iget-object v0, p0, Lg0/e;->f:Lg0/h;

    .line 13
    .line 14
    invoke-virtual {v0}, Lg0/h;->c()V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lg0/h;->b:Lh0/c;

    .line 18
    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    iget-object v1, v1, Lh0/c;->d:Lh0/e;

    .line 22
    .line 23
    invoke-virtual {v1}, Lh0/e;->e()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    const-string v2, "FlutterEngineConnectionRegistry#onNewIntent"

    .line 31
    .line 32
    invoke-static {v2}, Lw0/a;->b(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :try_start_0
    iget-object v1, v1, Lh0/e;->f:Lh0/d;

    .line 36
    .line 37
    iget-object v1, v1, Lh0/d;->d:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Ljava/util/HashSet;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    if-nez v2, :cond_0

    .line 50
    .line 51
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_0
    :try_start_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-nez p1, :cond_1

    .line 60
    .line 61
    throw v3

    .line 62
    :cond_1
    new-instance p1, Ljava/lang/ClassCastException;

    .line 63
    .line 64
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 65
    .line 66
    .line 67
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    :catchall_0
    move-exception p1

    .line 69
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catchall_1
    move-exception v0

    .line 74
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    :goto_0
    throw p1

    .line 78
    :cond_2
    const-string v1, "FlutterEngineCxnRegstry"

    .line 79
    .line 80
    const-string v2, "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached."

    .line 81
    .line 82
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    :goto_1
    invoke-virtual {v0, p1}, Lg0/h;->d(Landroid/content/Intent;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    if-eqz p1, :cond_4

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-nez v1, :cond_4

    .line 96
    .line 97
    iget-object v0, v0, Lg0/h;->b:Lh0/c;

    .line 98
    .line 99
    iget-object v0, v0, Lh0/c;->i:Lp0/a;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    new-instance v1, Ljava/util/HashMap;

    .line 105
    .line 106
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 107
    .line 108
    .line 109
    const-string v2, "location"

    .line 110
    .line 111
    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    iget-object p1, v0, Lp0/a;->a:LN/b;

    .line 115
    .line 116
    const-string v0, "pushRouteInformation"

    .line 117
    .line 118
    invoke-virtual {p1, v0, v1, v3}, LN/b;->F(Ljava/lang/String;Ljava/lang/Object;Lp0/k;)V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_3
    const-string p1, "FlutterActivityAndFragmentDelegate"

    .line 123
    .line 124
    const-string v0, "onNewIntent() invoked before FlutterFragment was attached to an Activity."

    .line 125
    .line 126
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    :cond_4
    :goto_2
    return-void
.end method

.method public final onPause()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 2
    .line 3
    .line 4
    const-string v0, "onPause"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lg0/e;->k(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lg0/e;->f:Lg0/h;

    .line 13
    .line 14
    invoke-virtual {v0}, Lg0/h;->c()V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lg0/h;->a:Lg0/e;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, Lg0/h;->b:Lh0/c;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v0, v0, Lh0/c;->g:Lp0/d;

    .line 27
    .line 28
    iget-boolean v1, v0, Lp0/d;->c:Z

    .line 29
    .line 30
    const/4 v2, 0x3

    .line 31
    invoke-virtual {v0, v2, v1}, Lp0/d;->a(IZ)V

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object v0, p0, Lg0/e;->g:Landroidx/lifecycle/n;

    .line 35
    .line 36
    sget-object v1, Landroidx/lifecycle/f;->ON_PAUSE:Landroidx/lifecycle/f;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroidx/lifecycle/n;->c(Landroidx/lifecycle/f;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final onPostResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    .line 2
    .line 3
    .line 4
    const-string v0, "onPostResume"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lg0/e;->k(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-object v0, p0, Lg0/e;->f:Lg0/h;

    .line 13
    .line 14
    invoke-virtual {v0}, Lg0/h;->c()V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lg0/h;->b:Lh0/c;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iget-object v1, v0, Lg0/h;->d:Lio/flutter/plugin/platform/f;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {v1}, Lio/flutter/plugin/platform/f;->b()V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v0, v0, Lg0/h;->b:Lh0/c;

    .line 29
    .line 30
    iget-object v0, v0, Lh0/c;->r:Lio/flutter/plugin/platform/o;

    .line 31
    .line 32
    invoke-virtual {v0}, Lio/flutter/plugin/platform/o;->j()V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const-string v0, "FlutterActivityAndFragmentDelegate"

    .line 37
    .line 38
    const-string v1, "onPostResume() invoked before FlutterFragment was attached to an Activity."

    .line 39
    .line 40
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    :cond_2
    :goto_0
    return-void
.end method

.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    const-string p1, "onRequestPermissionsResult"

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lg0/e;->k(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_4

    .line 8
    .line 9
    iget-object p1, p0, Lg0/e;->f:Lg0/h;

    .line 10
    .line 11
    invoke-virtual {p1}, Lg0/h;->c()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p1, Lg0/h;->b:Lh0/c;

    .line 15
    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    invoke-static {p3}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    iget-object p1, p1, Lg0/h;->b:Lh0/c;

    .line 25
    .line 26
    iget-object p1, p1, Lh0/c;->d:Lh0/e;

    .line 27
    .line 28
    invoke-virtual {p1}, Lh0/e;->e()Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-eqz p2, :cond_2

    .line 33
    .line 34
    const-string p2, "FlutterEngineConnectionRegistry#onRequestPermissionsResult"

    .line 35
    .line 36
    invoke-static {p2}, Lw0/a;->b(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :try_start_0
    iget-object p1, p1, Lh0/e;->f:Lh0/d;

    .line 40
    .line 41
    iget-object p1, p1, Lh0/d;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Ljava/util/HashSet;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    if-nez p2, :cond_0

    .line 54
    .line 55
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_0
    :try_start_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-nez p1, :cond_1

    .line 64
    .line 65
    const/4 p1, 0x0

    .line 66
    throw p1

    .line 67
    :cond_1
    new-instance p1, Ljava/lang/ClassCastException;

    .line 68
    .line 69
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 70
    .line 71
    .line 72
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    :catchall_0
    move-exception p1

    .line 74
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :catchall_1
    move-exception p2

    .line 79
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    :goto_0
    throw p1

    .line 83
    :cond_2
    const-string p1, "FlutterEngineCxnRegstry"

    .line 84
    .line 85
    const-string p2, "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached."

    .line 86
    .line 87
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    const-string p1, "FlutterActivityAndFragmentDelegate"

    .line 92
    .line 93
    const-string p2, "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity."

    .line 94
    .line 95
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    :cond_4
    :goto_1
    return-void
.end method

.method public final onResume()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lg0/e;->g:Landroidx/lifecycle/n;

    .line 5
    .line 6
    sget-object v1, Landroidx/lifecycle/f;->ON_RESUME:Landroidx/lifecycle/f;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroidx/lifecycle/n;->c(Landroidx/lifecycle/f;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onResume"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lg0/e;->k(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lg0/e;->f:Lg0/h;

    .line 20
    .line 21
    invoke-virtual {v0}, Lg0/h;->c()V

    .line 22
    .line 23
    .line 24
    iget-object v1, v0, Lg0/h;->a:Lg0/e;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v0, v0, Lg0/h;->b:Lh0/c;

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iget-object v0, v0, Lh0/c;->g:Lp0/d;

    .line 34
    .line 35
    iget-boolean v1, v0, Lp0/d;->c:Z

    .line 36
    .line 37
    const/4 v2, 0x2

    .line 38
    invoke-virtual {v0, v2, v1}, Lp0/d;->a(IZ)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "onSaveInstanceState"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lg0/e;->k(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_4

    .line 11
    .line 12
    iget-object v0, p0, Lg0/e;->f:Lg0/h;

    .line 13
    .line 14
    invoke-virtual {v0}, Lg0/h;->c()V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lg0/h;->a:Lg0/e;

    .line 18
    .line 19
    invoke-virtual {v1}, Lg0/e;->j()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v1, v0, Lg0/h;->b:Lh0/c;

    .line 26
    .line 27
    iget-object v1, v1, Lh0/c;->k:Lp0/l;

    .line 28
    .line 29
    iget-object v1, v1, Lp0/l;->b:[B

    .line 30
    .line 31
    const-string v2, "framework"

    .line 32
    .line 33
    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object v1, v0, Lg0/h;->a:Lg0/e;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v1, Landroid/os/Bundle;

    .line 42
    .line 43
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 44
    .line 45
    .line 46
    iget-object v2, v0, Lg0/h;->b:Lh0/c;

    .line 47
    .line 48
    iget-object v2, v2, Lh0/c;->d:Lh0/e;

    .line 49
    .line 50
    invoke-virtual {v2}, Lh0/e;->e()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_3

    .line 55
    .line 56
    const-string v3, "FlutterEngineConnectionRegistry#onSaveInstanceState"

    .line 57
    .line 58
    invoke-static {v3}, Lw0/a;->b(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :try_start_0
    iget-object v2, v2, Lh0/e;->f:Lh0/d;

    .line 62
    .line 63
    iget-object v2, v2, Lh0/d;->f:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v2, Ljava/util/HashSet;

    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    if-nez v3, :cond_1

    .line 76
    .line 77
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    :try_start_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-nez p1, :cond_2

    .line 86
    .line 87
    const/4 p1, 0x0

    .line 88
    throw p1

    .line 89
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 90
    .line 91
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 92
    .line 93
    .line 94
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    :catchall_0
    move-exception p1

    .line 96
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :catchall_1
    move-exception v0

    .line 101
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    :goto_0
    throw p1

    .line 105
    :cond_3
    const-string v2, "FlutterEngineCxnRegstry"

    .line 106
    .line 107
    const-string v3, "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached."

    .line 108
    .line 109
    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    :goto_1
    const-string v2, "plugins"

    .line 113
    .line 114
    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 115
    .line 116
    .line 117
    iget-object v1, v0, Lg0/h;->a:Lg0/e;

    .line 118
    .line 119
    invoke-virtual {v1}, Lg0/e;->d()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    if-eqz v1, :cond_4

    .line 124
    .line 125
    iget-object v1, v0, Lg0/h;->a:Lg0/e;

    .line 126
    .line 127
    invoke-virtual {v1}, Lg0/e;->i()Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-nez v1, :cond_4

    .line 132
    .line 133
    iget-object v0, v0, Lg0/h;->a:Lg0/e;

    .line 134
    .line 135
    iget-boolean v0, v0, Lg0/e;->e:Z

    .line 136
    .line 137
    const-string v1, "enableOnBackInvokedCallbackState"

    .line 138
    .line 139
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 140
    .line 141
    .line 142
    :cond_4
    return-void
.end method

.method public final onStart()V
    .locals 6

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lg0/e;->g:Landroidx/lifecycle/n;

    .line 5
    .line 6
    sget-object v1, Landroidx/lifecycle/f;->ON_START:Landroidx/lifecycle/f;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroidx/lifecycle/n;->c(Landroidx/lifecycle/f;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onStart"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lg0/e;->k(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_7

    .line 18
    .line 19
    iget-object v0, p0, Lg0/e;->f:Lg0/h;

    .line 20
    .line 21
    invoke-virtual {v0}, Lg0/h;->c()V

    .line 22
    .line 23
    .line 24
    iget-object v1, v0, Lg0/h;->a:Lg0/e;

    .line 25
    .line 26
    invoke-virtual {v1}, Lg0/e;->d()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    goto/16 :goto_2

    .line 33
    .line 34
    :cond_0
    iget-object v1, v0, Lg0/h;->b:Lh0/c;

    .line 35
    .line 36
    iget-object v1, v1, Lh0/c;->c:Li0/b;

    .line 37
    .line 38
    iget-boolean v1, v1, Li0/b;->e:Z

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    goto/16 :goto_2

    .line 43
    .line 44
    :cond_1
    iget-object v1, v0, Lg0/h;->a:Lg0/e;

    .line 45
    .line 46
    invoke-virtual {v1}, Lg0/e;->f()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-nez v1, :cond_2

    .line 51
    .line 52
    iget-object v1, v0, Lg0/h;->a:Lg0/e;

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0, v1}, Lg0/h;->d(Landroid/content/Intent;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    if-nez v1, :cond_2

    .line 66
    .line 67
    const-string v1, "/"

    .line 68
    .line 69
    :cond_2
    iget-object v2, v0, Lg0/h;->a:Lg0/e;

    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    :try_start_0
    invoke-virtual {v2}, Lg0/e;->g()Landroid/os/Bundle;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    if-eqz v2, :cond_3

    .line 80
    .line 81
    const-string v4, "io.flutter.EntrypointUri"

    .line 82
    .line 83
    invoke-virtual {v2, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    goto :goto_0

    .line 88
    :catch_0
    :cond_3
    move-object v2, v3

    .line 89
    :goto_0
    iget-object v4, v0, Lg0/h;->a:Lg0/e;

    .line 90
    .line 91
    invoke-virtual {v4}, Lg0/e;->e()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    iget-object v4, v0, Lg0/h;->b:Lh0/c;

    .line 95
    .line 96
    iget-object v4, v4, Lh0/c;->i:Lp0/a;

    .line 97
    .line 98
    iget-object v4, v4, Lp0/a;->a:LN/b;

    .line 99
    .line 100
    const-string v5, "setInitialRoute"

    .line 101
    .line 102
    invoke-virtual {v4, v5, v1, v3}, LN/b;->F(Ljava/lang/String;Ljava/lang/Object;Lp0/k;)V

    .line 103
    .line 104
    .line 105
    iget-object v1, v0, Lg0/h;->a:Lg0/e;

    .line 106
    .line 107
    invoke-virtual {v1}, Lg0/e;->b()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    if-eqz v1, :cond_4

    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-eqz v3, :cond_5

    .line 118
    .line 119
    :cond_4
    invoke-static {}, LN/b;->E()LN/b;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    iget-object v1, v1, LN/b;->g:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v1, Lk0/d;

    .line 126
    .line 127
    iget-object v1, v1, Lk0/d;->d:Li0/b;

    .line 128
    .line 129
    iget-object v1, v1, Li0/b;->g:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v1, Ljava/lang/String;

    .line 132
    .line 133
    :cond_5
    if-nez v2, :cond_6

    .line 134
    .line 135
    new-instance v2, Li0/a;

    .line 136
    .line 137
    iget-object v3, v0, Lg0/h;->a:Lg0/e;

    .line 138
    .line 139
    invoke-virtual {v3}, Lg0/e;->e()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-direct {v2, v1, v3}, Li0/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_6
    new-instance v3, Li0/a;

    .line 148
    .line 149
    iget-object v4, v0, Lg0/h;->a:Lg0/e;

    .line 150
    .line 151
    invoke-virtual {v4}, Lg0/e;->e()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    invoke-direct {v3, v1, v2, v4}, Li0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    move-object v2, v3

    .line 159
    :goto_1
    iget-object v1, v0, Lg0/h;->b:Lh0/c;

    .line 160
    .line 161
    iget-object v1, v1, Lh0/c;->c:Li0/b;

    .line 162
    .line 163
    iget-object v3, v0, Lg0/h;->a:Lg0/e;

    .line 164
    .line 165
    invoke-virtual {v3}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    const-string v4, "dart_entrypoint_args"

    .line 170
    .line 171
    invoke-virtual {v3, v4}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    check-cast v3, Ljava/util/List;

    .line 176
    .line 177
    invoke-virtual {v1, v2, v3}, Li0/b;->a(Li0/a;Ljava/util/List;)V

    .line 178
    .line 179
    .line 180
    :goto_2
    iget-object v1, v0, Lg0/h;->j:Ljava/lang/Integer;

    .line 181
    .line 182
    if-eqz v1, :cond_7

    .line 183
    .line 184
    iget-object v0, v0, Lg0/h;->c:Lg0/q;

    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    invoke-virtual {v0, v1}, Lg0/q;->setVisibility(I)V

    .line 191
    .line 192
    .line 193
    :cond_7
    return-void
.end method

.method public final onStop()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 2
    .line 3
    .line 4
    const-string v0, "onStop"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lg0/e;->k(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lg0/e;->f:Lg0/h;

    .line 13
    .line 14
    invoke-virtual {v0}, Lg0/h;->c()V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lg0/h;->a:Lg0/e;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v1, v0, Lg0/h;->b:Lh0/c;

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iget-object v1, v1, Lh0/c;->g:Lp0/d;

    .line 27
    .line 28
    iget-boolean v2, v1, Lp0/d;->c:Z

    .line 29
    .line 30
    const/4 v3, 0x5

    .line 31
    invoke-virtual {v1, v3, v2}, Lp0/d;->a(IZ)V

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object v1, v0, Lg0/h;->c:Lg0/q;

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iput-object v1, v0, Lg0/h;->j:Ljava/lang/Integer;

    .line 45
    .line 46
    iget-object v1, v0, Lg0/h;->c:Lg0/q;

    .line 47
    .line 48
    const/16 v2, 0x8

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Lg0/q;->setVisibility(I)V

    .line 51
    .line 52
    .line 53
    iget-object v0, v0, Lg0/h;->b:Lh0/c;

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    const/16 v1, 0x28

    .line 58
    .line 59
    iget-object v0, v0, Lh0/c;->b:Lio/flutter/embedding/engine/renderer/l;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/renderer/l;->e(I)V

    .line 62
    .line 63
    .line 64
    :cond_1
    iget-object v0, p0, Lg0/e;->g:Landroidx/lifecycle/n;

    .line 65
    .line 66
    sget-object v1, Landroidx/lifecycle/f;->ON_STOP:Landroidx/lifecycle/f;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroidx/lifecycle/n;->c(Landroidx/lifecycle/f;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final onTrimMemory(I)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onTrimMemory(I)V

    .line 2
    .line 3
    .line 4
    const-string v0, "onTrimMemory"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lg0/e;->k(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    iget-object v0, p0, Lg0/e;->f:Lg0/h;

    .line 13
    .line 14
    invoke-virtual {v0}, Lg0/h;->c()V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lg0/h;->b:Lh0/c;

    .line 18
    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    iget-boolean v2, v0, Lg0/h;->h:Z

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    const/16 v2, 0xa

    .line 27
    .line 28
    if-lt p1, v2, :cond_1

    .line 29
    .line 30
    iget-object v1, v1, Lh0/c;->c:Li0/b;

    .line 31
    .line 32
    iget-object v1, v1, Li0/b;->f:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Lio/flutter/embedding/engine/FlutterJNI;

    .line 35
    .line 36
    invoke-virtual {v1}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    invoke-virtual {v1}, Lio/flutter/embedding/engine/FlutterJNI;->notifyLowMemoryWarning()V

    .line 43
    .line 44
    .line 45
    :cond_0
    iget-object v1, v0, Lg0/h;->b:Lh0/c;

    .line 46
    .line 47
    iget-object v1, v1, Lh0/c;->p:Lp0/c;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    new-instance v2, Ljava/util/HashMap;

    .line 53
    .line 54
    const/4 v4, 0x1

    .line 55
    invoke-direct {v2, v4}, Ljava/util/HashMap;-><init>(I)V

    .line 56
    .line 57
    .line 58
    const-string v4, "type"

    .line 59
    .line 60
    const-string v5, "memoryPressure"

    .line 61
    .line 62
    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    iget-object v1, v1, Lp0/c;->a:LG/n;

    .line 66
    .line 67
    invoke-virtual {v1, v2, v3}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    iget-object v1, v0, Lg0/h;->b:Lh0/c;

    .line 71
    .line 72
    iget-object v1, v1, Lh0/c;->b:Lio/flutter/embedding/engine/renderer/l;

    .line 73
    .line 74
    invoke-virtual {v1, p1}, Lio/flutter/embedding/engine/renderer/l;->e(I)V

    .line 75
    .line 76
    .line 77
    iget-object v0, v0, Lg0/h;->b:Lh0/c;

    .line 78
    .line 79
    iget-object v0, v0, Lh0/c;->r:Lio/flutter/plugin/platform/o;

    .line 80
    .line 81
    const/16 v1, 0x28

    .line 82
    .line 83
    if-ge p1, v1, :cond_2

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    iget-object p1, v0, Lio/flutter/plugin/platform/o;->i:Ljava/util/HashMap;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_3

    .line 104
    .line 105
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, Lio/flutter/plugin/platform/z;

    .line 110
    .line 111
    iget-object v0, v0, Lio/flutter/plugin/platform/z;->h:Landroid/hardware/display/VirtualDisplay;

    .line 112
    .line 113
    invoke-virtual {v0, v3}, Landroid/hardware/display/VirtualDisplay;->setSurface(Landroid/view/Surface;)V

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_3
    :goto_1
    return-void
.end method

.method public final onUserLeaveHint()V
    .locals 2

    .line 1
    const-string v0, "onUserLeaveHint"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lg0/e;->k(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    iget-object v0, p0, Lg0/e;->f:Lg0/h;

    .line 10
    .line 11
    invoke-virtual {v0}, Lg0/h;->c()V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, Lg0/h;->b:Lh0/c;

    .line 15
    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    iget-object v0, v0, Lh0/c;->d:Lh0/e;

    .line 19
    .line 20
    invoke-virtual {v0}, Lh0/e;->e()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    const-string v1, "FlutterEngineConnectionRegistry#onUserLeaveHint"

    .line 27
    .line 28
    invoke-static {v1}, Lw0/a;->b(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :try_start_0
    iget-object v0, v0, Lh0/e;->f:Lh0/d;

    .line 32
    .line 33
    iget-object v0, v0, Lh0/d;->e:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Ljava/util/HashSet;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    if-nez v1, :cond_0

    .line 46
    .line 47
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    :try_start_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-nez v0, :cond_1

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    throw v0

    .line 59
    :cond_1
    new-instance v0, Ljava/lang/ClassCastException;

    .line 60
    .line 61
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 62
    .line 63
    .line 64
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    :catchall_0
    move-exception v0

    .line 66
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catchall_1
    move-exception v1

    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    :goto_0
    throw v0

    .line 75
    :cond_2
    const-string v0, "FlutterEngineCxnRegstry"

    .line 76
    .line 77
    const-string v1, "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached."

    .line 78
    .line 79
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    const-string v0, "FlutterActivityAndFragmentDelegate"

    .line 84
    .line 85
    const-string v1, "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity."

    .line 86
    .line 87
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    :cond_4
    :goto_1
    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onWindowFocusChanged(Z)V

    .line 2
    .line 3
    .line 4
    const-string v0, "onWindowFocusChanged"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lg0/e;->k(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lg0/e;->f:Lg0/h;

    .line 13
    .line 14
    invoke-virtual {v0}, Lg0/h;->c()V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lg0/h;->a:Lg0/e;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, Lg0/h;->b:Lh0/c;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, v0, Lh0/c;->g:Lp0/d;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    iget p1, v0, Lp0/d;->a:I

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-virtual {v0, p1, v1}, Lp0/d;->a(IZ)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget p1, v0, Lp0/d;->a:I

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-virtual {v0, p1, v1}, Lp0/d;->a(IZ)V

    .line 41
    .line 42
    .line 43
    :cond_1
    :goto_0
    return-void
.end method
