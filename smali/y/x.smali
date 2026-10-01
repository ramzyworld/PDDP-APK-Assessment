.class public abstract Ly/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ljava/lang/reflect/Field; = null

.field public static b:Z = false


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static a(Landroid/view/ViewGroup;Ly/b;)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez p1, :cond_4

    .line 4
    .line 5
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v3, 0x1d

    .line 8
    .line 9
    if-lt v2, v3, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, Ly/u;->a(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    goto :goto_2

    .line 16
    :cond_0
    sget-boolean v2, Ly/x;->b:Z

    .line 17
    .line 18
    if-eqz v2, :cond_2

    .line 19
    .line 20
    :cond_1
    :goto_0
    move-object v2, v1

    .line 21
    goto :goto_2

    .line 22
    :cond_2
    sget-object v2, Ly/x;->a:Ljava/lang/reflect/Field;

    .line 23
    .line 24
    if-nez v2, :cond_3

    .line 25
    .line 26
    :try_start_0
    const-class v2, Landroid/view/View;

    .line 27
    .line 28
    const-string v3, "mAccessibilityDelegate"

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    sput-object v2, Ly/x;->a:Ljava/lang/reflect/Field;

    .line 35
    .line 36
    invoke-virtual {v2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    sput-boolean v0, Ly/x;->b:Z

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    :goto_1
    :try_start_1
    sget-object v2, Ly/x;->a:Ljava/lang/reflect/Field;

    .line 44
    .line 45
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    instance-of v3, v2, Landroid/view/View$AccessibilityDelegate;

    .line 50
    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    check-cast v2, Landroid/view/View$AccessibilityDelegate;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :catchall_1
    sput-boolean v0, Ly/x;->b:Z

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :goto_2
    instance-of v2, v2, Ly/a;

    .line 60
    .line 61
    if-eqz v2, :cond_4

    .line 62
    .line 63
    new-instance p1, Ly/b;

    .line 64
    .line 65
    invoke-direct {p1}, Ly/b;-><init>()V

    .line 66
    .line 67
    .line 68
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getImportantForAccessibility()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-nez v2, :cond_5

    .line 73
    .line 74
    invoke-virtual {p0, v0}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 75
    .line 76
    .line 77
    :cond_5
    if-nez p1, :cond_6

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_6
    iget-object v1, p1, Ly/b;->b:Ly/a;

    .line 81
    .line 82
    :goto_3
    invoke-virtual {p0, v1}, Landroid/view/View;->setAccessibilityDelegate(Landroid/view/View$AccessibilityDelegate;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method
