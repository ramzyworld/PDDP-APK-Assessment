.class public final Lio/flutter/plugin/editing/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:[D

.field public final synthetic c:[D


# direct methods
.method public constructor <init>(Z[D[D)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lio/flutter/plugin/editing/i;->a:Z

    .line 5
    .line 6
    iput-object p2, p0, Lio/flutter/plugin/editing/i;->b:[D

    .line 7
    .line 8
    iput-object p3, p0, Lio/flutter/plugin/editing/i;->c:[D

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(DD)V
    .locals 11

    .line 1
    iget-boolean v0, p0, Lio/flutter/plugin/editing/i;->a:Z

    .line 2
    .line 3
    iget-object v1, p0, Lio/flutter/plugin/editing/i;->b:[D

    .line 4
    .line 5
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 6
    .line 7
    const/4 v4, 0x3

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    aget-wide v5, v1, v4

    .line 12
    .line 13
    mul-double v5, v5, p1

    .line 14
    .line 15
    const/4 v0, 0x7

    .line 16
    aget-wide v7, v1, v0

    .line 17
    .line 18
    mul-double v7, v7, p3

    .line 19
    .line 20
    add-double/2addr v7, v5

    .line 21
    const/16 v0, 0xf

    .line 22
    .line 23
    aget-wide v5, v1, v0

    .line 24
    .line 25
    add-double/2addr v7, v5

    .line 26
    div-double/2addr v2, v7

    .line 27
    :goto_0
    const/4 v0, 0x0

    .line 28
    aget-wide v5, v1, v0

    .line 29
    .line 30
    mul-double v5, v5, p1

    .line 31
    .line 32
    const/4 v7, 0x4

    .line 33
    aget-wide v7, v1, v7

    .line 34
    .line 35
    mul-double v7, v7, p3

    .line 36
    .line 37
    add-double/2addr v7, v5

    .line 38
    const/16 v5, 0xc

    .line 39
    .line 40
    aget-wide v5, v1, v5

    .line 41
    .line 42
    add-double/2addr v7, v5

    .line 43
    mul-double v7, v7, v2

    .line 44
    .line 45
    const/4 v5, 0x1

    .line 46
    aget-wide v9, v1, v5

    .line 47
    .line 48
    mul-double v9, v9, p1

    .line 49
    .line 50
    const/4 p1, 0x5

    .line 51
    aget-wide p1, v1, p1

    .line 52
    .line 53
    mul-double p1, p1, p3

    .line 54
    .line 55
    add-double/2addr p1, v9

    .line 56
    const/16 p3, 0xd

    .line 57
    .line 58
    aget-wide p3, v1, p3

    .line 59
    .line 60
    add-double/2addr p1, p3

    .line 61
    mul-double p1, p1, v2

    .line 62
    .line 63
    iget-object p3, p0, Lio/flutter/plugin/editing/i;->c:[D

    .line 64
    .line 65
    aget-wide v1, p3, v0

    .line 66
    .line 67
    cmpg-double p4, v7, v1

    .line 68
    .line 69
    if-gez p4, :cond_1

    .line 70
    .line 71
    aput-wide v7, p3, v0

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    aget-wide v0, p3, v5

    .line 75
    .line 76
    cmpl-double p4, v7, v0

    .line 77
    .line 78
    if-lez p4, :cond_2

    .line 79
    .line 80
    aput-wide v7, p3, v5

    .line 81
    .line 82
    :cond_2
    :goto_1
    const/4 p4, 0x2

    .line 83
    aget-wide v0, p3, p4

    .line 84
    .line 85
    cmpg-double v2, p1, v0

    .line 86
    .line 87
    if-gez v2, :cond_3

    .line 88
    .line 89
    aput-wide p1, p3, p4

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_3
    aget-wide v0, p3, v4

    .line 93
    .line 94
    cmpl-double p4, p1, v0

    .line 95
    .line 96
    if-lez p4, :cond_4

    .line 97
    .line 98
    aput-wide p1, p3, v4

    .line 99
    .line 100
    :cond_4
    :goto_2
    return-void
.end method
