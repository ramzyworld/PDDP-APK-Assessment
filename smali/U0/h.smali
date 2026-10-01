.class public final LU0/h;
.super LU0/f;
.source "SourceFile"


# instance fields
.field public final h:LT0/d;


# direct methods
.method public constructor <init>(LT0/d;Lz0/i;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3, p4}, LU0/f;-><init>(Lz0/i;II)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LU0/h;->h:LT0/d;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(LS0/p;Lz0/d;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, LU0/r;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LU0/r;-><init>(LS0/p;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LU0/h;->h:LT0/d;

    .line 7
    .line 8
    invoke-interface {p1, v0, p2}, LT0/d;->g(LT0/e;Lz0/d;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object p2, LA0/a;->e:LA0/a;

    .line 13
    .line 14
    sget-object v0, Lx0/g;->a:Lx0/g;

    .line 15
    .line 16
    if-ne p1, p2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object p1, v0

    .line 20
    :goto_0
    if-ne p1, p2, :cond_1

    .line 21
    .line 22
    move-object v0, p1

    .line 23
    :cond_1
    return-object v0
.end method

.method public final b(Lz0/i;II)LU0/f;
    .locals 2

    .line 1
    new-instance v0, LU0/h;

    .line 2
    .line 3
    iget-object v1, p0, LU0/h;->h:LT0/d;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1, p2, p3}, LU0/h;-><init>(LT0/d;Lz0/i;II)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final g(LT0/e;Lz0/d;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, LA0/a;->e:LA0/a;

    .line 2
    .line 3
    sget-object v1, Lx0/g;->a:Lx0/g;

    .line 4
    .line 5
    iget v2, p0, LU0/f;->f:I

    .line 6
    .line 7
    const/4 v3, -0x3

    .line 8
    if-ne v2, v3, :cond_5

    .line 9
    .line 10
    invoke-interface {p2}, Lz0/d;->i()Lz0/i;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 15
    .line 16
    sget-object v4, LQ0/p;->h:LQ0/p;

    .line 17
    .line 18
    iget-object v5, p0, LU0/f;->e:Lz0/i;

    .line 19
    .line 20
    invoke-interface {v5, v3, v4}, Lz0/i;->d(Ljava/lang/Object;LH0/p;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    invoke-interface {v2, v5}, Lz0/i;->c(Lz0/i;)Lz0/i;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v3, 0x0

    .line 38
    invoke-static {v2, v5, v3}, LQ0/v;->a(Lz0/i;Lz0/i;Z)Lz0/i;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    :goto_0
    invoke-static {v3, v2}, LI0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_2

    .line 47
    .line 48
    iget-object v2, p0, LU0/h;->h:LT0/d;

    .line 49
    .line 50
    invoke-interface {v2, p1, p2}, LT0/d;->g(LT0/e;Lz0/d;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-ne p1, v0, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    move-object p1, v1

    .line 58
    :goto_1
    if-ne p1, v0, :cond_6

    .line 59
    .line 60
    :goto_2
    move-object v1, p1

    .line 61
    goto :goto_5

    .line 62
    :cond_2
    sget-object v4, Lz0/e;->e:Lz0/e;

    .line 63
    .line 64
    invoke-interface {v3, v4}, Lz0/i;->f(Lz0/h;)Lz0/g;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-interface {v2, v4}, Lz0/i;->f(Lz0/h;)Lz0/g;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-static {v5, v2}, LI0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_5

    .line 77
    .line 78
    invoke-interface {p2}, Lz0/d;->i()Lz0/i;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    instance-of v4, p1, LU0/r;

    .line 83
    .line 84
    if-eqz v4, :cond_3

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_3
    new-instance v4, LT0/l;

    .line 88
    .line 89
    invoke-direct {v4, p1, v2}, LT0/l;-><init>(LT0/e;Lz0/i;)V

    .line 90
    .line 91
    .line 92
    move-object p1, v4

    .line 93
    :goto_3
    new-instance v2, LU0/g;

    .line 94
    .line 95
    const/4 v4, 0x0

    .line 96
    invoke-direct {v2, p0, v4}, LU0/g;-><init>(LU0/h;Lz0/d;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v3}, LV0/a;->l(Lz0/i;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-static {v3, p1, v4, v2, p2}, LU0/l;->b(Lz0/i;Ljava/lang/Object;Ljava/lang/Object;LH0/p;Lz0/d;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-ne p1, v0, :cond_4

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_4
    move-object p1, v1

    .line 111
    :goto_4
    if-ne p1, v0, :cond_6

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    invoke-super {p0, p1, p2}, LU0/f;->g(LT0/e;Lz0/d;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    if-ne p1, v0, :cond_6

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_6
    :goto_5
    return-object v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LU0/h;->h:LT0/d;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, " -> "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-super {p0}, LU0/f;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method
