.class public final LN/Q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT0/d;
.implements LY/h;
.implements Lg0/B;
.implements Lq0/k;
.implements Lq0/c;
.implements Lq0/d;


# static fields
.field public static h:LN/Q;

.field public static i:Lg0/D;


# instance fields
.field public final synthetic e:I

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, LN/Q;->e:I

    packed-switch p1, :pswitch_data_0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, LN/Q;->f:Ljava/lang/Object;

    .line 16
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, LN/Q;->g:Ljava/lang/Object;

    return-void

    .line 17
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance p1, Landroid/util/LongSparseArray;

    invoke-direct {p1}, Landroid/util/LongSparseArray;-><init>()V

    iput-object p1, p0, LN/Q;->f:Ljava/lang/Object;

    .line 19
    new-instance p1, Ljava/util/PriorityQueue;

    invoke-direct {p1}, Ljava/util/PriorityQueue;-><init>()V

    iput-object p1, p0, LN/Q;->g:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(II)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, LN/Q;->e:I

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    filled-new-array {p1, p2}, [I

    move-result-object p1

    iput-object p1, p0, LN/Q;->f:Ljava/lang/Object;

    const/4 p1, 0x2

    .line 65
    new-array p1, p1, [F

    fill-array-data p1, :array_0

    iput-object p1, p0, LN/Q;->g:Ljava/lang/Object;

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(III)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, LN/Q;->e:I

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    filled-new-array {p1, p2, p3}, [I

    move-result-object p1

    iput-object p1, p0, LN/Q;->f:Ljava/lang/Object;

    const/4 p1, 0x3

    .line 68
    new-array p1, p1, [F

    fill-array-data p1, :array_0

    iput-object p1, p0, LN/Q;->g:Ljava/lang/Object;

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LN/Q;->e:I

    iput-object p2, p0, LN/Q;->f:Ljava/lang/Object;

    iput-object p3, p0, LN/Q;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 2
    iput p1, p0, LN/Q;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LN/w;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LN/Q;->e:I

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, LN/Q;->f:Ljava/lang/Object;

    .line 53
    new-instance p1, LN/P;

    .line 54
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 55
    iput v0, p1, LN/P;->a:I

    .line 56
    iput-object p1, p0, LN/Q;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LY/b;)V
    .locals 2

    const/4 v0, 0x6

    iput v0, p0, LN/Q;->e:I

    .line 26
    new-instance v0, LN/Q;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, LN/Q;-><init>(I)V

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, LN/Q;->f:Ljava/lang/Object;

    .line 29
    iput-object v0, p0, LN/Q;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Landroid/view/inputmethod/InputMethodManager;Lp0/b;)V
    .locals 2

    const/16 v0, 0xa

    iput v0, p0, LN/Q;->e:I

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    .line 22
    invoke-static {p1}, Lg0/b;->k(Landroid/view/View;)V

    .line 23
    :cond_0
    iput-object p1, p0, LN/Q;->g:Ljava/lang/Object;

    .line 24
    iput-object p2, p0, LN/Q;->f:Ljava/lang/Object;

    .line 25
    iput-object p0, p3, Lp0/b;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Li0/b;I)V
    .locals 4

    iput p2, p0, LN/Q;->e:I

    packed-switch p2, :pswitch_data_0

    .line 30
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance p2, Lp0/b;

    const/4 v0, 0x2

    invoke-direct {p2, v0, p0}, Lp0/b;-><init>(ILjava/lang/Object;)V

    .line 32
    new-instance v0, LN/b;

    sget-object v1, Lq0/i;->a:Lq0/i;

    const-string v2, "flutter/localization"

    const/16 v3, 0xa

    invoke-direct {v0, p1, v2, v1, v3}, LN/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v0, p0, LN/Q;->f:Ljava/lang/Object;

    .line 33
    invoke-virtual {v0, p2}, LN/b;->N(Lq0/k;)V

    return-void

    .line 34
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance p2, Lp0/b;

    const/16 v0, 0xd

    invoke-direct {p2, v0, p0}, Lp0/b;-><init>(ILjava/lang/Object;)V

    .line 36
    new-instance v0, LN/b;

    sget-object v1, Lq0/i;->a:Lq0/i;

    const-string v2, "flutter/textinput"

    const/16 v3, 0xa

    invoke-direct {v0, p1, v2, v1, v3}, LN/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v0, p0, LN/Q;->f:Ljava/lang/Object;

    .line 37
    invoke-virtual {v0, p2}, LN/b;->N(Lq0/k;)V

    return-void

    .line 38
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance p2, Lp0/b;

    const/4 v0, 0x6

    invoke-direct {p2, v0, p0}, Lp0/b;-><init>(ILjava/lang/Object;)V

    .line 40
    new-instance v0, LN/b;

    const-string v1, "flutter/platform_views"

    sget-object v2, Lq0/o;->a:Lq0/o;

    const/16 v3, 0xa

    invoke-direct {v0, p1, v1, v2, v3}, LN/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v0, p0, LN/Q;->f:Ljava/lang/Object;

    .line 41
    invoke-virtual {v0, p2}, LN/b;->N(Lq0/k;)V

    return-void

    .line 42
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance p2, Lp0/b;

    const/4 v0, 0x5

    invoke-direct {p2, v0, p0}, Lp0/b;-><init>(ILjava/lang/Object;)V

    .line 44
    new-instance v0, LN/b;

    sget-object v1, Lq0/i;->a:Lq0/i;

    const-string v2, "flutter/platform"

    const/16 v3, 0xa

    invoke-direct {v0, p1, v2, v1, v3}, LN/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v0, p0, LN/Q;->f:Ljava/lang/Object;

    .line 45
    invoke-virtual {v0, p2}, LN/b;->N(Lq0/k;)V

    return-void

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public constructor <init>(Li0/b;Landroid/content/pm/PackageManager;)V
    .locals 4

    const/16 v0, 0x10

    iput v0, p0, LN/Q;->e:I

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Lp0/b;

    const/4 v1, 0x7

    invoke-direct {v0, v1, p0}, Lp0/b;-><init>(ILjava/lang/Object;)V

    .line 48
    iput-object p2, p0, LN/Q;->f:Ljava/lang/Object;

    .line 49
    new-instance p2, LN/b;

    const-string v1, "flutter/processtext"

    sget-object v2, Lq0/o;->a:Lq0/o;

    const/16 v3, 0xa

    invoke-direct {p2, p1, v1, v2, v3}, LN/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 50
    invoke-virtual {p2, v0}, LN/b;->N(Lq0/k;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 3
    iput p3, p0, LN/Q;->e:I

    iput-object p1, p0, LN/Q;->g:Ljava/lang/Object;

    iput-object p2, p0, LN/Q;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    const/16 v0, 0x13

    iput v0, p0, LN/Q;->e:I

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 59
    new-array v1, v0, [I

    iput-object v1, p0, LN/Q;->f:Ljava/lang/Object;

    .line 60
    new-array v1, v0, [F

    iput-object v1, p0, LN/Q;->g:Ljava/lang/Object;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 61
    iget-object v2, p0, LN/Q;->f:Ljava/lang/Object;

    check-cast v2, [I

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aput v3, v2, v1

    .line 62
    iget-object v2, p0, LN/Q;->g:Ljava/lang/Object;

    check-cast v2, [F

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Lp0/b;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, LN/Q;->e:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN/Q;->g:Ljava/lang/Object;

    .line 13
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LN/Q;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lp0/c;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, LN/Q;->e:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, LX0/i;

    invoke-direct {v0}, LX0/i;-><init>()V

    iput-object v0, p0, LN/Q;->g:Ljava/lang/Object;

    .line 11
    iput-object p1, p0, LN/Q;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ls0/a;Lp0/b;)V
    .locals 1

    const/16 v0, 0x18

    iput v0, p0, LN/Q;->e:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, LN/Q;->f:Ljava/lang/Object;

    .line 6
    iput-object p2, p0, LN/Q;->g:Ljava/lang/Object;

    .line 7
    new-instance p1, Lp0/b;

    const/16 v0, 0x10

    invoke-direct {p1, v0, p0}, Lp0/b;-><init>(ILjava/lang/Object;)V

    .line 8
    iput-object p1, p2, Lp0/b;->f:Ljava/lang/Object;

    return-void
.end method

.method public static d(LN/Q;Lorg/json/JSONArray;)I
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    const/4 v4, 0x2

    .line 13
    const/4 v5, 0x4

    .line 14
    const/4 v6, 0x1

    .line 15
    if-ge v0, v3, :cond_b

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-static {v5}, LI/j;->c(I)[I

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    array-length v7, v5

    .line 26
    const/4 v8, 0x0

    .line 27
    :goto_1
    if-ge v8, v7, :cond_a

    .line 28
    .line 29
    aget v9, v5, v8

    .line 30
    .line 31
    const/4 v10, 0x1

    .line 32
    if-eq v9, v10, :cond_3

    .line 33
    .line 34
    const/4 v10, 0x2

    .line 35
    if-eq v9, v10, :cond_2

    .line 36
    .line 37
    const/4 v10, 0x3

    .line 38
    if-eq v9, v10, :cond_1

    .line 39
    .line 40
    const/4 v10, 0x4

    .line 41
    if-ne v9, v10, :cond_0

    .line 42
    .line 43
    const-string v10, "DeviceOrientation.landscapeRight"

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_0
    const/4 p0, 0x0

    .line 47
    throw p0

    .line 48
    :cond_1
    const-string v10, "DeviceOrientation.landscapeLeft"

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const-string v10, "DeviceOrientation.portraitDown"

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    const-string v10, "DeviceOrientation.portraitUp"

    .line 55
    .line 56
    :goto_2
    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v10

    .line 60
    if-eqz v10, :cond_9

    .line 61
    .line 62
    invoke-static {v9}, LI/j;->b(I)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_7

    .line 67
    .line 68
    if-eq v3, v6, :cond_6

    .line 69
    .line 70
    if-eq v3, v4, :cond_5

    .line 71
    .line 72
    const/4 v4, 0x3

    .line 73
    if-eq v3, v4, :cond_4

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_4
    or-int/lit8 v1, v1, 0x8

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_5
    or-int/lit8 v1, v1, 0x2

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_6
    or-int/lit8 v1, v1, 0x4

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_7
    or-int/lit8 v1, v1, 0x1

    .line 86
    .line 87
    :goto_3
    if-nez v2, :cond_8

    .line 88
    .line 89
    move v2, v1

    .line 90
    :cond_8
    add-int/lit8 v0, v0, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_9
    add-int/lit8 v8, v8, 0x1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_a
    new-instance p0, Ljava/lang/NoSuchFieldException;

    .line 97
    .line 98
    const-string p1, "No such DeviceOrientation: "

    .line 99
    .line 100
    invoke-static {p1, v3}, LI0/h;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-direct {p0, p1}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw p0

    .line 108
    :cond_b
    if-eqz v1, :cond_e

    .line 109
    .line 110
    const/16 p1, 0x8

    .line 111
    .line 112
    const/16 v0, 0x9

    .line 113
    .line 114
    packed-switch v1, :pswitch_data_0

    .line 115
    .line 116
    .line 117
    goto :goto_4

    .line 118
    :pswitch_0
    const/16 p0, 0xd

    .line 119
    .line 120
    goto :goto_5

    .line 121
    :pswitch_1
    const/4 p0, 0x2

    .line 122
    goto :goto_5

    .line 123
    :pswitch_2
    const/16 p0, 0xb

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_c
    :pswitch_3
    const/16 p0, 0x8

    .line 127
    .line 128
    goto :goto_5

    .line 129
    :pswitch_4
    const/16 p0, 0xc

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_d
    :pswitch_5
    const/16 p0, 0x9

    .line 133
    .line 134
    goto :goto_5

    .line 135
    :pswitch_6
    if-eq v2, v4, :cond_f

    .line 136
    .line 137
    if-eq v2, v5, :cond_d

    .line 138
    .line 139
    if-eq v2, p1, :cond_c

    .line 140
    .line 141
    :goto_4
    const/4 p0, 0x1

    .line 142
    goto :goto_5

    .line 143
    :cond_e
    const/4 p0, -0x1

    .line 144
    :cond_f
    :goto_5
    :pswitch_7
    return p0

    .line 145
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_6
        :pswitch_6
        :pswitch_3
        :pswitch_6
        :pswitch_2
        :pswitch_1
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_0
    .end packed-switch
.end method

.method public static e(LN/Q;Lorg/json/JSONArray;)Ljava/util/ArrayList;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v1, v2, :cond_4

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {}, Lp0/g;->values()[Lp0/g;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    array-length v4, v3

    .line 26
    const/4 v5, 0x0

    .line 27
    :goto_1
    if-ge v5, v4, :cond_3

    .line 28
    .line 29
    aget-object v6, v3, v5

    .line 30
    .line 31
    iget-object v7, v6, Lp0/g;->e:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-eqz v7, :cond_2

    .line 38
    .line 39
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    if-eq v2, v3, :cond_0

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_0
    sget-object v2, Lp0/g;->g:Lp0/g;

    .line 50
    .line 51
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_1
    sget-object v2, Lp0/g;->f:Lp0/g;

    .line 56
    .line 57
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    new-instance p0, Ljava/lang/NoSuchFieldException;

    .line 67
    .line 68
    const-string p1, "No such SystemUiOverlay: "

    .line 69
    .line 70
    invoke-static {p1, v2}, LI0/h;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-direct {p0, p1}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p0

    .line 78
    :cond_4
    return-object p0
.end method

.method public static f(LN/Q;Ljava/lang/String;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x4

    .line 5
    invoke-static {p0}, LI/j;->c(I)[I

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    array-length v1, v0

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v1, :cond_8

    .line 12
    .line 13
    aget v3, v0, v2

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    if-eq v3, v4, :cond_3

    .line 17
    .line 18
    const/4 v4, 0x2

    .line 19
    if-eq v3, v4, :cond_2

    .line 20
    .line 21
    const/4 v4, 0x3

    .line 22
    if-eq v3, v4, :cond_1

    .line 23
    .line 24
    const/4 v4, 0x4

    .line 25
    if-ne v3, v4, :cond_0

    .line 26
    .line 27
    const-string v4, "SystemUiMode.edgeToEdge"

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    const/4 p0, 0x0

    .line 31
    throw p0

    .line 32
    :cond_1
    const-string v4, "SystemUiMode.immersiveSticky"

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    const-string v4, "SystemUiMode.immersive"

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_3
    const-string v4, "SystemUiMode.leanBack"

    .line 39
    .line 40
    :goto_1
    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_7

    .line 45
    .line 46
    invoke-static {v3}, LI/j;->b(I)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    const/4 v0, 0x1

    .line 51
    if-eqz p1, :cond_6

    .line 52
    .line 53
    const/4 v1, 0x2

    .line 54
    if-eq p1, v0, :cond_5

    .line 55
    .line 56
    if-eq p1, v1, :cond_4

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_4
    const/4 p0, 0x3

    .line 60
    goto :goto_2

    .line 61
    :cond_5
    const/4 p0, 0x2

    .line 62
    goto :goto_2

    .line 63
    :cond_6
    const/4 p0, 0x1

    .line 64
    :goto_2
    return p0

    .line 65
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_8
    new-instance p0, Ljava/lang/NoSuchFieldException;

    .line 69
    .line 70
    const-string v0, "No such SystemUiMode: "

    .line 71
    .line 72
    invoke-static {v0, p1}, LI0/h;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-direct {p0, p1}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p0
.end method

.method public static h(LN/Q;Lorg/json/JSONObject;)Lp0/f;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string p0, "statusBarColor"

    .line 5
    .line 6
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    move-object v3, p0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v3, v1

    .line 24
    :goto_0
    const-string p0, "statusBarIconBrightness"

    .line 25
    .line 26
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v2, 0x0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, LI0/h;->a(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    move v4, p0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const/4 v4, 0x0

    .line 44
    :goto_1
    const-string p0, "systemStatusBarContrastEnforced"

    .line 45
    .line 46
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    move-object v5, p0

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move-object v5, v1

    .line 63
    :goto_2
    const-string p0, "systemNavigationBarColor"

    .line 64
    .line 65
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_3

    .line 70
    .line 71
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    move-object v6, p0

    .line 80
    goto :goto_3

    .line 81
    :cond_3
    move-object v6, v1

    .line 82
    :goto_3
    const-string p0, "systemNavigationBarIconBrightness"

    .line 83
    .line 84
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_4

    .line 89
    .line 90
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {p0}, LI0/h;->a(Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    move v7, p0

    .line 99
    goto :goto_4

    .line 100
    :cond_4
    const/4 v7, 0x0

    .line 101
    :goto_4
    const-string p0, "systemNavigationBarDividerColor"

    .line 102
    .line 103
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-nez v0, :cond_5

    .line 108
    .line 109
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    move-object v8, p0

    .line 118
    goto :goto_5

    .line 119
    :cond_5
    move-object v8, v1

    .line 120
    :goto_5
    const-string p0, "systemNavigationBarContrastEnforced"

    .line 121
    .line 122
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-nez v0, :cond_6

    .line 127
    .line 128
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    :cond_6
    move-object v9, v1

    .line 137
    new-instance p0, Lp0/f;

    .line 138
    .line 139
    move-object v2, p0

    .line 140
    invoke-direct/range {v2 .. v9}, Lp0/f;-><init>(Ljava/lang/Integer;ILjava/lang/Boolean;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Boolean;)V

    .line 141
    .line 142
    .line 143
    return-object p0
.end method

.method public static i(Ljava/lang/String;IIII)Ljava/util/HashMap;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "text"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string p1, "selectionBase"

    .line 16
    .line 17
    invoke-virtual {v0, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-string p1, "selectionExtent"

    .line 25
    .line 26
    invoke-virtual {v0, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-string p1, "composingBase"

    .line 34
    .line 35
    invoke-virtual {v0, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const-string p1, "composingExtent"

    .line 43
    .line 44
    invoke-virtual {v0, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    return-object v0
.end method


# virtual methods
.method public a(Landroid/view/KeyEvent;Lg0/z;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2, v2}, Lg0/z;->a(Z)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v3, p0, LN/Q;->g:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, LX0/i;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-virtual {v3, v4}, LX0/i;->a(I)Ljava/lang/Character;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v1, 0x0

    .line 31
    :goto_0
    new-instance v0, Lg0/t;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v0, v4, p2}, Lg0/t;-><init>(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p2, p0, LN/Q;->f:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p2, Lp0/c;

    .line 40
    .line 41
    new-instance v4, Ljava/util/HashMap;

    .line 42
    .line 43
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 44
    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    const-string v1, "keyup"

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    const-string v1, "keydown"

    .line 52
    .line 53
    :goto_1
    const-string v5, "type"

    .line 54
    .line 55
    invoke-virtual {v4, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    const-string v1, "keymap"

    .line 59
    .line 60
    const-string v5, "android"

    .line 61
    .line 62
    invoke-virtual {v4, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getFlags()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    const-string v5, "flags"

    .line 74
    .line 75
    invoke-virtual {v4, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v2}, Landroid/view/KeyEvent;->getUnicodeChar(I)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    const-string v2, "plainCodePoint"

    .line 87
    .line 88
    invoke-virtual {v4, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    const-string v2, "codePoint"

    .line 100
    .line 101
    invoke-virtual {v4, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    const-string v2, "keyCode"

    .line 113
    .line 114
    invoke-virtual {v4, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getScanCode()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    const-string v2, "scanCode"

    .line 126
    .line 127
    invoke-virtual {v4, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    const-string v2, "metaState"

    .line 139
    .line 140
    invoke-virtual {v4, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    const-string v1, "character"

    .line 144
    .line 145
    invoke-virtual {v3}, Ljava/lang/Character;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {v4, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getSource()I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    const-string v2, "source"

    .line 161
    .line 162
    invoke-virtual {v4, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getDeviceId()I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    const-string v2, "deviceId"

    .line 174
    .line 175
    invoke-virtual {v4, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    const-string v1, "repeatCount"

    .line 187
    .line 188
    invoke-virtual {v4, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    new-instance p1, Lg0/t;

    .line 192
    .line 193
    const/4 v1, 0x1

    .line 194
    invoke-direct {p1, v1, v0}, Lg0/t;-><init>(ILjava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    iget-object p2, p2, Lp0/c;->a:LG/n;

    .line 198
    .line 199
    invoke-virtual {p2, v4, p1}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 200
    .line 201
    .line 202
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, LN/Q;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LN/Q;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LN/Q;

    .line 9
    .line 10
    iget-object v0, v0, LN/Q;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, LG/n;

    .line 13
    .line 14
    iget-object v0, v0, LG/n;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lq0/j;

    .line 17
    .line 18
    invoke-interface {v0, p1}, Lq0/j;->b(Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object v0, p0, LN/Q;->f:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Li0/g;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Li0/g;->a(Ljava/nio/ByteBuffer;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    iget-object p1, p0, LN/Q;->g:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, LN/b;

    .line 33
    .line 34
    iget-object v0, p1, LN/b;->g:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 37
    .line 38
    iget-object v1, p0, LN/Q;->f:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Lp0/m;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    iget-object p1, p1, LN/b;->g:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-nez p1, :cond_0

    .line 54
    .line 55
    new-instance p1, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v0, "The queue becomes empty after removing config generation "

    .line 58
    .line 59
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    iget v0, v1, Lp0/m;->a:I

    .line 63
    .line 64
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    const-string v0, "SettingsChannel"

    .line 76
    .line 77
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    :cond_0
    return-void

    .line 81
    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
    .end packed-switch
.end method

.method public c(LN/Q;Lp0/k;)V
    .locals 2

    .line 1
    iget-object v0, p0, LN/Q;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lp0/b;

    .line 4
    .line 5
    iget-object v1, v0, Lp0/b;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LN/b;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, LN/Q;->f:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Ljava/util/Map;

    .line 14
    .line 15
    invoke-virtual {p2, p1}, Lp0/k;->c(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    iget-object p1, p1, LN/Q;->f:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const-string v1, "getKeyboardState"

    .line 27
    .line 28
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p2}, Lp0/k;->b()V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    :try_start_0
    iget-object p1, v0, Lp0/b;->f:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, LN/b;

    .line 41
    .line 42
    iget-object p1, p1, LN/b;->g:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, [Lg0/B;

    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    aget-object p1, p1, v0

    .line 48
    .line 49
    check-cast p1, Lg0/y;

    .line 50
    .line 51
    iget-object p1, p1, Lg0/y;->f:Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput-object p1, p0, LN/Q;->f:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catch_0
    move-exception p1

    .line 61
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    const/4 v0, 0x0

    .line 66
    const-string v1, "error"

    .line 67
    .line 68
    invoke-virtual {p2, v1, p1, v0}, Lp0/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :goto_0
    iget-object p1, p0, LN/Q;->f:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, Ljava/util/Map;

    .line 74
    .line 75
    invoke-virtual {p2, p1}, Lp0/k;->c(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :goto_1
    return-void
.end method

.method public g(LT0/e;Lz0/d;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LN/Q;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, LT0/m;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, LT0/m;

    .line 12
    .line 13
    iget v1, v0, LT0/m;->i:I

    .line 14
    .line 15
    const/high16 v2, -0x80000000

    .line 16
    .line 17
    and-int v3, v1, v2

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, v0, LT0/m;->i:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, LT0/m;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, LT0/m;-><init>(LN/Q;Lz0/d;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p2, v0, LT0/m;->h:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v1, LA0/a;->e:LA0/a;

    .line 33
    .line 34
    iget v2, v0, LT0/m;->i:I

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget-object p1, v0, LT0/m;->k:Lu0/n;

    .line 42
    .line 43
    :try_start_0
    invoke-static {p2}, La/a;->O(Ljava/lang/Object;)V
    :try_end_0
    .catch LU0/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    goto :goto_2

    .line 47
    :catch_0
    move-exception p2

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    invoke-static {p2}, La/a;->O(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p2, p0, LN/Q;->f:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p2, LN/Q;

    .line 63
    .line 64
    new-instance v2, Lu0/n;

    .line 65
    .line 66
    iget-object v4, p0, LN/Q;->g:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v4, LG/q;

    .line 69
    .line 70
    invoke-direct {v2, v4, p1}, Lu0/n;-><init>(LG/q;LT0/e;)V

    .line 71
    .line 72
    .line 73
    :try_start_1
    iput-object v2, v0, LT0/m;->k:Lu0/n;

    .line 74
    .line 75
    iput v3, v0, LT0/m;->i:I

    .line 76
    .line 77
    invoke-virtual {p2, v2, v0}, LN/Q;->g(LT0/e;Lz0/d;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1
    :try_end_1
    .catch LU0/a; {:try_start_1 .. :try_end_1} :catch_1

    .line 81
    if-ne p1, v1, :cond_3

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :catch_1
    move-exception p2

    .line 85
    move-object p1, v2

    .line 86
    :goto_1
    iget-object v0, p2, LU0/a;->e:LT0/e;

    .line 87
    .line 88
    if-ne v0, p1, :cond_4

    .line 89
    .line 90
    :cond_3
    :goto_2
    sget-object v1, Lx0/g;->a:Lx0/g;

    .line 91
    .line 92
    :goto_3
    return-object v1

    .line 93
    :cond_4
    throw p2

    .line 94
    :pswitch_0
    new-instance v0, LI0/n;

    .line 95
    .line 96
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 97
    .line 98
    .line 99
    new-instance v1, LT0/l;

    .line 100
    .line 101
    iget-object v2, p0, LN/Q;->g:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v2, LG/r;

    .line 104
    .line 105
    invoke-direct {v1, v0, p1, v2}, LT0/l;-><init>(LI0/n;LT0/e;LG/r;)V

    .line 106
    .line 107
    .line 108
    iget-object p1, p0, LN/Q;->f:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast p1, LN/Q;

    .line 111
    .line 112
    invoke-virtual {p1, v1, p2}, LN/Q;->g(LT0/e;Lz0/d;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    sget-object p2, LA0/a;->e:LA0/a;

    .line 117
    .line 118
    if-ne p1, p2, :cond_5

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_5
    sget-object p1, Lx0/g;->a:Lx0/g;

    .line 122
    .line 123
    :goto_4
    return-object p1

    .line 124
    :pswitch_1
    instance-of v0, p2, LT0/j;

    .line 125
    .line 126
    if-eqz v0, :cond_6

    .line 127
    .line 128
    move-object v0, p2

    .line 129
    check-cast v0, LT0/j;

    .line 130
    .line 131
    iget v1, v0, LT0/j;->i:I

    .line 132
    .line 133
    const/high16 v2, -0x80000000

    .line 134
    .line 135
    and-int v3, v1, v2

    .line 136
    .line 137
    if-eqz v3, :cond_6

    .line 138
    .line 139
    sub-int/2addr v1, v2

    .line 140
    iput v1, v0, LT0/j;->i:I

    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_6
    new-instance v0, LT0/j;

    .line 144
    .line 145
    invoke-direct {v0, p0, p2}, LT0/j;-><init>(LN/Q;Lz0/d;)V

    .line 146
    .line 147
    .line 148
    :goto_5
    iget-object p2, v0, LT0/j;->h:Ljava/lang/Object;

    .line 149
    .line 150
    sget-object v1, LA0/a;->e:LA0/a;

    .line 151
    .line 152
    iget v2, v0, LT0/j;->i:I

    .line 153
    .line 154
    const/4 v3, 0x2

    .line 155
    const/4 v4, 0x1

    .line 156
    if-eqz v2, :cond_9

    .line 157
    .line 158
    if-eq v2, v4, :cond_8

    .line 159
    .line 160
    if-ne v2, v3, :cond_7

    .line 161
    .line 162
    invoke-static {p2}, La/a;->O(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    sget-object v1, Lx0/g;->a:Lx0/g;

    .line 166
    .line 167
    goto :goto_7

    .line 168
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 169
    .line 170
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 171
    .line 172
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw p1

    .line 176
    :cond_8
    iget-object p1, v0, LT0/j;->m:LU0/n;

    .line 177
    .line 178
    iget-object v2, v0, LT0/j;->l:LT0/e;

    .line 179
    .line 180
    iget-object v4, v0, LT0/j;->k:LN/Q;

    .line 181
    .line 182
    :try_start_2
    invoke-static {p2}, La/a;->O(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 183
    .line 184
    .line 185
    goto :goto_6

    .line 186
    :catchall_0
    move-exception p2

    .line 187
    goto :goto_8

    .line 188
    :cond_9
    invoke-static {p2}, La/a;->O(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    new-instance p2, LU0/n;

    .line 192
    .line 193
    iget-object v2, v0, LB0/b;->f:Lz0/i;

    .line 194
    .line 195
    invoke-static {v2}, LI0/i;->b(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    invoke-direct {p2, p1, v2}, LU0/n;-><init>(LT0/e;Lz0/i;)V

    .line 199
    .line 200
    .line 201
    :try_start_3
    iget-object v2, p0, LN/Q;->f:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v2, LG/p;

    .line 204
    .line 205
    iput-object p0, v0, LT0/j;->k:LN/Q;

    .line 206
    .line 207
    iput-object p1, v0, LT0/j;->l:LT0/e;

    .line 208
    .line 209
    iput-object p2, v0, LT0/j;->m:LU0/n;

    .line 210
    .line 211
    iput v4, v0, LT0/j;->i:I

    .line 212
    .line 213
    invoke-virtual {v2, p2, v0}, LG/p;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 217
    if-ne v2, v1, :cond_a

    .line 218
    .line 219
    goto :goto_7

    .line 220
    :cond_a
    move-object v4, p0

    .line 221
    move-object v2, p1

    .line 222
    move-object p1, p2

    .line 223
    :goto_6
    invoke-virtual {p1}, LB0/b;->n()V

    .line 224
    .line 225
    .line 226
    iget-object p1, v4, LN/Q;->g:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast p1, LT0/q;

    .line 229
    .line 230
    const/4 p2, 0x0

    .line 231
    iput-object p2, v0, LT0/j;->k:LN/Q;

    .line 232
    .line 233
    iput-object p2, v0, LT0/j;->l:LT0/e;

    .line 234
    .line 235
    iput-object p2, v0, LT0/j;->m:LU0/n;

    .line 236
    .line 237
    iput v3, v0, LT0/j;->i:I

    .line 238
    .line 239
    invoke-virtual {p1, v2, v0}, LT0/q;->g(LT0/e;Lz0/d;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    :goto_7
    return-object v1

    .line 243
    :catchall_1
    move-exception p1

    .line 244
    move-object v5, p2

    .line 245
    move-object p2, p1

    .line 246
    move-object p1, v5

    .line 247
    :goto_8
    invoke-virtual {p1}, LB0/b;->n()V

    .line 248
    .line 249
    .line 250
    throw p2

    .line 251
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public j(IIII)Landroid/view/View;
    .locals 10

    .line 1
    iget-object v0, p0, LN/Q;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LN/w;

    .line 4
    .line 5
    iget v1, v0, LN/w;->a:I

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, LN/w;->b:LN/x;

    .line 11
    .line 12
    invoke-virtual {v1}, LN/x;->u()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    goto :goto_0

    .line 17
    :pswitch_0
    iget-object v1, v0, LN/w;->b:LN/x;

    .line 18
    .line 19
    invoke-virtual {v1}, LN/x;->s()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    :goto_0
    iget v2, v0, LN/w;->a:I

    .line 24
    .line 25
    packed-switch v2, :pswitch_data_1

    .line 26
    .line 27
    .line 28
    iget-object v2, v0, LN/w;->b:LN/x;

    .line 29
    .line 30
    iget v3, v2, LN/x;->g:I

    .line 31
    .line 32
    invoke-virtual {v2}, LN/x;->r()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    :goto_1
    sub-int/2addr v3, v2

    .line 37
    goto :goto_2

    .line 38
    :pswitch_1
    iget-object v2, v0, LN/w;->b:LN/x;

    .line 39
    .line 40
    iget v3, v2, LN/x;->f:I

    .line 41
    .line 42
    invoke-virtual {v2}, LN/x;->t()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    goto :goto_1

    .line 47
    :goto_2
    if-le p2, p1, :cond_0

    .line 48
    .line 49
    const/4 v2, 0x1

    .line 50
    goto :goto_3

    .line 51
    :cond_0
    const/4 v2, -0x1

    .line 52
    :goto_3
    const/4 v4, 0x0

    .line 53
    :goto_4
    if-eq p1, p2, :cond_3

    .line 54
    .line 55
    iget v5, v0, LN/w;->a:I

    .line 56
    .line 57
    packed-switch v5, :pswitch_data_2

    .line 58
    .line 59
    .line 60
    iget-object v5, v0, LN/w;->b:LN/x;

    .line 61
    .line 62
    invoke-virtual {v5, p1}, LN/x;->o(I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    goto :goto_5

    .line 67
    :pswitch_2
    iget-object v5, v0, LN/w;->b:LN/x;

    .line 68
    .line 69
    invoke-virtual {v5, p1}, LN/x;->o(I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    :goto_5
    iget v6, v0, LN/w;->a:I

    .line 74
    .line 75
    packed-switch v6, :pswitch_data_3

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    check-cast v6, LN/y;

    .line 83
    .line 84
    iget-object v7, v0, LN/w;->b:LN/x;

    .line 85
    .line 86
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    check-cast v8, LN/y;

    .line 98
    .line 99
    iget-object v8, v8, LN/y;->a:Landroid/graphics/Rect;

    .line 100
    .line 101
    iget v8, v8, Landroid/graphics/Rect;->top:I

    .line 102
    .line 103
    sub-int/2addr v7, v8

    .line 104
    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 105
    .line 106
    :goto_6
    sub-int/2addr v7, v6

    .line 107
    goto :goto_7

    .line 108
    :pswitch_3
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    check-cast v6, LN/y;

    .line 113
    .line 114
    iget-object v7, v0, LN/w;->b:LN/x;

    .line 115
    .line 116
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    check-cast v8, LN/y;

    .line 128
    .line 129
    iget-object v8, v8, LN/y;->a:Landroid/graphics/Rect;

    .line 130
    .line 131
    iget v8, v8, Landroid/graphics/Rect;->left:I

    .line 132
    .line 133
    sub-int/2addr v7, v8

    .line 134
    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 135
    .line 136
    goto :goto_6

    .line 137
    :goto_7
    iget v6, v0, LN/w;->a:I

    .line 138
    .line 139
    packed-switch v6, :pswitch_data_4

    .line 140
    .line 141
    .line 142
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    check-cast v6, LN/y;

    .line 147
    .line 148
    iget-object v8, v0, LN/w;->b:LN/x;

    .line 149
    .line 150
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 158
    .line 159
    .line 160
    move-result-object v9

    .line 161
    check-cast v9, LN/y;

    .line 162
    .line 163
    iget-object v9, v9, LN/y;->a:Landroid/graphics/Rect;

    .line 164
    .line 165
    iget v9, v9, Landroid/graphics/Rect;->bottom:I

    .line 166
    .line 167
    add-int/2addr v8, v9

    .line 168
    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 169
    .line 170
    :goto_8
    add-int/2addr v8, v6

    .line 171
    goto :goto_9

    .line 172
    :pswitch_4
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    check-cast v6, LN/y;

    .line 177
    .line 178
    iget-object v8, v0, LN/w;->b:LN/x;

    .line 179
    .line 180
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    .line 184
    .line 185
    .line 186
    move-result v8

    .line 187
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    check-cast v9, LN/y;

    .line 192
    .line 193
    iget-object v9, v9, LN/y;->a:Landroid/graphics/Rect;

    .line 194
    .line 195
    iget v9, v9, Landroid/graphics/Rect;->right:I

    .line 196
    .line 197
    add-int/2addr v8, v9

    .line 198
    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 199
    .line 200
    goto :goto_8

    .line 201
    :goto_9
    iget-object v6, p0, LN/Q;->g:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v6, LN/P;

    .line 204
    .line 205
    iput v1, v6, LN/P;->b:I

    .line 206
    .line 207
    iput v3, v6, LN/P;->c:I

    .line 208
    .line 209
    iput v7, v6, LN/P;->d:I

    .line 210
    .line 211
    iput v8, v6, LN/P;->e:I

    .line 212
    .line 213
    if-eqz p3, :cond_1

    .line 214
    .line 215
    iput p3, v6, LN/P;->a:I

    .line 216
    .line 217
    invoke-virtual {v6}, LN/P;->a()Z

    .line 218
    .line 219
    .line 220
    move-result v7

    .line 221
    if-eqz v7, :cond_1

    .line 222
    .line 223
    return-object v5

    .line 224
    :cond_1
    if-eqz p4, :cond_2

    .line 225
    .line 226
    iput p4, v6, LN/P;->a:I

    .line 227
    .line 228
    invoke-virtual {v6}, LN/P;->a()Z

    .line 229
    .line 230
    .line 231
    move-result v6

    .line 232
    if-eqz v6, :cond_2

    .line 233
    .line 234
    move-object v4, v5

    .line 235
    :cond_2
    add-int/2addr p1, v2

    .line 236
    goto/16 :goto_4

    .line 237
    .line 238
    :cond_3
    return-object v4

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch

    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_3
    .end packed-switch

    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_4
    .end packed-switch
.end method

.method public k(Lv/g;)V
    .locals 5

    .line 1
    iget v0, p1, Lv/g;->b:I

    .line 2
    .line 3
    iget-object v1, p0, LN/Q;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/os/Handler;

    .line 6
    .line 7
    iget-object v2, p0, LN/Q;->f:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lp0/b;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, LV0/i;

    .line 14
    .line 15
    iget-object p1, p1, Lv/g;->a:Landroid/graphics/Typeface;

    .line 16
    .line 17
    const/4 v3, 0x3

    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-direct {v0, v2, p1, v3, v4}, LV0/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance p1, LD/b;

    .line 27
    .line 28
    invoke-direct {p1, v2, v0}, LD/b;-><init>(Lp0/b;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 32
    .line 33
    .line 34
    :goto_0
    return-void
.end method

.method public l(Ljava/nio/ByteBuffer;Li0/g;)V
    .locals 5

    .line 1
    iget v0, p0, LN/Q;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LN/Q;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LN/b;

    .line 9
    .line 10
    iget-object v1, v0, LN/b;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lq0/l;

    .line 13
    .line 14
    invoke-interface {v1, p1}, Lq0/l;->b(Ljava/nio/ByteBuffer;)LN/Q;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :try_start_0
    iget-object v1, p0, LN/Q;->f:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lq0/k;

    .line 21
    .line 22
    new-instance v2, Lp0/k;

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    invoke-direct {v2, v3, p0, p2}, Lp0/k;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v1, p1, v2}, Lq0/k;->c(LN/Q;Lp0/k;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catch_0
    move-exception p1

    .line 33
    iget-object v1, v0, LN/b;->f:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Ljava/lang/String;

    .line 36
    .line 37
    const-string v2, "MethodChannel#"

    .line 38
    .line 39
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v2, "Failed to handle method call"

    .line 44
    .line 45
    invoke-static {v1, v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iget-object v0, v0, LN/b;->h:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Lq0/l;

    .line 59
    .line 60
    invoke-interface {v0, v1, p1}, Lq0/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/nio/ByteBuffer;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p2, p1}, Li0/g;->a(Ljava/nio/ByteBuffer;)V

    .line 65
    .line 66
    .line 67
    :goto_0
    return-void

    .line 68
    :pswitch_0
    iget-object v0, p0, LN/Q;->g:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, LG/n;

    .line 71
    .line 72
    :try_start_1
    iget-object v1, p0, LN/Q;->f:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, Lq0/b;

    .line 75
    .line 76
    iget-object v2, v0, LG/n;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v2, Lq0/j;

    .line 79
    .line 80
    invoke-interface {v2, p1}, Lq0/j;->a(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    new-instance v2, LN/Q;

    .line 85
    .line 86
    const/16 v3, 0x14

    .line 87
    .line 88
    const/4 v4, 0x0

    .line 89
    invoke-direct {v2, p0, p2, v3, v4}, LN/Q;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 90
    .line 91
    .line 92
    invoke-interface {v1, p1, v2}, Lq0/b;->o(Ljava/lang/Object;LN/Q;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :catch_1
    move-exception p1

    .line 97
    new-instance v1, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    const-string v2, "BasicMessageChannel#"

    .line 100
    .line 101
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    iget-object v0, v0, LG/n;->b:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    const-string v1, "Failed to handle message"

    .line 116
    .line 117
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 118
    .line 119
    .line 120
    const/4 p1, 0x0

    .line 121
    invoke-virtual {p2, p1}, Li0/g;->a(Ljava/nio/ByteBuffer;)V

    .line 122
    .line 123
    .line 124
    :goto_1
    return-void

    .line 125
    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_0
    .end packed-switch
.end method
