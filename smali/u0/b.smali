.class public final Lu0/b;
.super Lq0/n;
.source "SourceFile"


# static fields
.field public static final e:Lu0/b;


# instance fields
.field public final synthetic d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lu0/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lu0/b;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lu0/b;->e:Lu0/b;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lu0/b;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lu0/b;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lq0/n;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    const-string v0, "buffer"

    .line 12
    .line 13
    invoke-static {p2, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/16 v0, -0x7f

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    if-ne p1, v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, p2}, Lq0/n;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Ljava/lang/Long;

    .line 27
    .line 28
    if-eqz p1, :cond_6

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 31
    .line 32
    .line 33
    move-result-wide p1

    .line 34
    long-to-int p2, p1

    .line 35
    invoke-static {}, Lu0/L;->values()[Lu0/L;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    array-length v0, p1

    .line 40
    :goto_0
    if-ge v1, v0, :cond_6

    .line 41
    .line 42
    aget-object v3, p1, v1

    .line 43
    .line 44
    iget v4, v3, Lu0/L;->e:I

    .line 45
    .line 46
    if-ne v4, p2, :cond_0

    .line 47
    .line 48
    move-object v2, v3

    .line 49
    goto :goto_3

    .line 50
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const/16 v0, -0x7e

    .line 54
    .line 55
    const/4 v3, 0x1

    .line 56
    if-ne p1, v0, :cond_3

    .line 57
    .line 58
    invoke-virtual {p0, p2}, Lq0/n;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    instance-of p2, p1, Ljava/util/List;

    .line 63
    .line 64
    if-eqz p2, :cond_2

    .line 65
    .line 66
    check-cast p1, Ljava/util/List;

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    move-object p1, v2

    .line 70
    :goto_1
    if-eqz p1, :cond_6

    .line 71
    .line 72
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    check-cast p2, Ljava/lang/String;

    .line 77
    .line 78
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    const-string v0, "null cannot be cast to non-null type kotlin.Boolean"

    .line 83
    .line 84
    invoke-static {p1, v0}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    check-cast p1, Ljava/lang/Boolean;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    new-instance v2, Lu0/h;

    .line 94
    .line 95
    invoke-direct {v2, p2, p1}, Lu0/h;-><init>(Ljava/lang/String;Z)V

    .line 96
    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_3
    const/16 v0, -0x7d

    .line 100
    .line 101
    if-ne p1, v0, :cond_5

    .line 102
    .line 103
    invoke-virtual {p0, p2}, Lq0/n;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    instance-of p2, p1, Ljava/util/List;

    .line 108
    .line 109
    if-eqz p2, :cond_4

    .line 110
    .line 111
    check-cast p1, Ljava/util/List;

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_4
    move-object p1, v2

    .line 115
    :goto_2
    if-eqz p1, :cond_6

    .line 116
    .line 117
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    check-cast p2, Ljava/lang/String;

    .line 122
    .line 123
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    const-string v0, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType"

    .line 128
    .line 129
    invoke-static {p1, v0}, LI0/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    check-cast p1, Lu0/L;

    .line 133
    .line 134
    new-instance v2, Lu0/N;

    .line 135
    .line 136
    invoke-direct {v2, p2, p1}, Lu0/N;-><init>(Ljava/lang/String;Lu0/L;)V

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_5
    invoke-super {p0, p1, p2}, Lq0/n;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    :cond_6
    :goto_3
    return-object v2

    .line 145
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public k(Lq0/m;Ljava/lang/Object;)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x2

    .line 4
    iget v3, p0, Lu0/b;->d:I

    .line 5
    .line 6
    packed-switch v3, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1, p2}, Lq0/n;->k(Lq0/m;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    instance-of v3, p2, Lu0/L;

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    const/16 v0, 0x81

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 20
    .line 21
    .line 22
    check-cast p2, Lu0/L;

    .line 23
    .line 24
    iget p2, p2, Lu0/L;->e:I

    .line 25
    .line 26
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p0, p1, p2}, Lu0/b;->k(Lq0/m;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    instance-of v3, p2, Lu0/h;

    .line 35
    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    const/16 v3, 0x82

    .line 39
    .line 40
    invoke-virtual {p1, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 41
    .line 42
    .line 43
    check-cast p2, Lu0/h;

    .line 44
    .line 45
    iget-boolean v3, p2, Lu0/h;->b:Z

    .line 46
    .line 47
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    iget-object p2, p2, Lu0/h;->a:Ljava/lang/String;

    .line 52
    .line 53
    new-array v2, v2, [Ljava/lang/Object;

    .line 54
    .line 55
    aput-object p2, v2, v1

    .line 56
    .line 57
    aput-object v3, v2, v0

    .line 58
    .line 59
    invoke-static {v2}, Ly0/e;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-virtual {p0, p1, p2}, Lu0/b;->k(Lq0/m;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    instance-of v3, p2, Lu0/N;

    .line 68
    .line 69
    if-eqz v3, :cond_2

    .line 70
    .line 71
    const/16 v3, 0x83

    .line 72
    .line 73
    invoke-virtual {p1, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 74
    .line 75
    .line 76
    check-cast p2, Lu0/N;

    .line 77
    .line 78
    iget-object v3, p2, Lu0/N;->a:Ljava/lang/String;

    .line 79
    .line 80
    iget-object p2, p2, Lu0/N;->b:Lu0/L;

    .line 81
    .line 82
    new-array v2, v2, [Ljava/lang/Object;

    .line 83
    .line 84
    aput-object v3, v2, v1

    .line 85
    .line 86
    aput-object p2, v2, v0

    .line 87
    .line 88
    invoke-static {v2}, Ly0/e;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-virtual {p0, p1, p2}, Lu0/b;->k(Lq0/m;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    invoke-super {p0, p1, p2}, Lq0/n;->k(Lq0/m;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :goto_0
    return-void

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
