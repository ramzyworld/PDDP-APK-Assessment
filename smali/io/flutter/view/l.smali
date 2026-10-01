.class public final Lio/flutter/view/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/reflect/Method;

.field public final b:Ljava/lang/reflect/Method;

.field public final c:Ljava/lang/reflect/Method;

.field public final d:Ljava/lang/reflect/Method;

.field public final e:Ljava/lang/reflect/Field;

.field public final f:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>()V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const-string v2, "getSourceNodeId"

    .line 4
    .line 5
    const-class v3, Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 6
    .line 7
    const-string v4, "AccessibilityBridge"

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    :try_start_0
    invoke-virtual {v3, v2, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 14
    .line 15
    .line 16
    move-result-object v6
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    const-string v6, "can\'t invoke AccessibilityNodeInfo#getSourceNodeId with reflection"

    .line 19
    .line 20
    invoke-static {v4, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-object v6, v5

    .line 24
    :goto_0
    :try_start_1
    const-class v7, Landroid/view/accessibility/AccessibilityRecord;

    .line 25
    .line 26
    invoke-virtual {v7, v2, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 27
    .line 28
    .line 29
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 30
    goto :goto_1

    .line 31
    :catch_1
    const-string v2, "can\'t invoke AccessibiiltyRecord#getSourceNodeId with reflection"

    .line 32
    .line 33
    invoke-static {v4, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-object v2, v5

    .line 37
    :goto_1
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 38
    .line 39
    const/16 v8, 0x1a

    .line 40
    .line 41
    if-gt v7, v8, :cond_0

    .line 42
    .line 43
    :try_start_2
    const-string v7, "getParentNodeId"

    .line 44
    .line 45
    invoke-virtual {v3, v7, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 46
    .line 47
    .line 48
    move-result-object v7
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_2

    .line 49
    goto :goto_2

    .line 50
    :catch_2
    const-string v7, "can\'t invoke getParentNodeId with reflection"

    .line 51
    .line 52
    invoke-static {v4, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-object v7, v5

    .line 56
    :goto_2
    :try_start_3
    const-string v8, "getChildId"

    .line 57
    .line 58
    new-array v1, v1, [Ljava/lang/Class;

    .line 59
    .line 60
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 61
    .line 62
    aput-object v9, v1, v0

    .line 63
    .line 64
    invoke-virtual {v3, v8, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 65
    .line 66
    .line 67
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_3

    .line 68
    move-object v1, v5

    .line 69
    :goto_3
    move-object v3, v1

    .line 70
    move-object v5, v7

    .line 71
    goto :goto_4

    .line 72
    :catch_3
    const-string v0, "can\'t invoke getChildId with reflection"

    .line 73
    .line 74
    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    move-object v0, v5

    .line 78
    move-object v1, v0

    .line 79
    goto :goto_3

    .line 80
    :cond_0
    :try_start_4
    const-string v7, "mChildNodeIds"

    .line 81
    .line 82
    invoke-virtual {v3, v7}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v3, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 87
    .line 88
    .line 89
    const-string v7, "android.util.LongArray"

    .line 90
    .line 91
    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    const-string v8, "get"

    .line 96
    .line 97
    new-array v1, v1, [Ljava/lang/Class;

    .line 98
    .line 99
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 100
    .line 101
    aput-object v9, v1, v0

    .line 102
    .line 103
    invoke-virtual {v7, v8, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 104
    .line 105
    .line 106
    move-result-object v0
    :try_end_4
    .catch Ljava/lang/NoSuchFieldException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/NullPointerException; {:try_start_4 .. :try_end_4} :catch_4

    .line 107
    move-object v1, v0

    .line 108
    move-object v0, v5

    .line 109
    goto :goto_4

    .line 110
    :catch_4
    const-string v0, "can\'t access childNodeIdsField with reflection"

    .line 111
    .line 112
    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    move-object v0, v5

    .line 116
    move-object v1, v0

    .line 117
    move-object v3, v1

    .line 118
    :goto_4
    iput-object v6, p0, Lio/flutter/view/l;->a:Ljava/lang/reflect/Method;

    .line 119
    .line 120
    iput-object v5, p0, Lio/flutter/view/l;->b:Ljava/lang/reflect/Method;

    .line 121
    .line 122
    iput-object v2, p0, Lio/flutter/view/l;->c:Ljava/lang/reflect/Method;

    .line 123
    .line 124
    iput-object v0, p0, Lio/flutter/view/l;->d:Ljava/lang/reflect/Method;

    .line 125
    .line 126
    iput-object v3, p0, Lio/flutter/view/l;->e:Ljava/lang/reflect/Field;

    .line 127
    .line 128
    iput-object v1, p0, Lio/flutter/view/l;->f:Ljava/lang/reflect/Method;

    .line 129
    .line 130
    return-void
.end method

.method public static a(Lio/flutter/view/l;Landroid/view/accessibility/AccessibilityRecord;)Ljava/lang/Long;
    .locals 2

    .line 1
    const-string v0, "AccessibilityBridge"

    .line 2
    .line 3
    iget-object p0, p0, Lio/flutter/view/l;->c:Ljava/lang/reflect/Method;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    goto :goto_2

    .line 9
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljava/lang/Long;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    move-object v1, p0

    .line 16
    goto :goto_2

    .line 17
    :catch_0
    move-exception p0

    .line 18
    goto :goto_0

    .line 19
    :catch_1
    move-exception p0

    .line 20
    goto :goto_1

    .line 21
    :goto_0
    const-string p1, "The getRecordSourceNodeId method threw an exception when invoked."

    .line 22
    .line 23
    invoke-static {v0, p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 24
    .line 25
    .line 26
    goto :goto_2

    .line 27
    :goto_1
    const-string p1, "Failed to access the getRecordSourceNodeId method."

    .line 28
    .line 29
    invoke-static {v0, p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 30
    .line 31
    .line 32
    :goto_2
    return-object v1
.end method

.method public static b(JI)Z
    .locals 2

    .line 1
    const-wide/16 v0, 0x1

    shl-long/2addr v0, p2

    and-long/2addr p0, v0

    const-wide/16 v0, 0x0

    cmp-long p2, p0, v0

    if-eqz p2, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
