.class public abstract Lu0/K;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[LN0/c;

.field public static final b:LI/c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, LI0/l;

    .line 2
    .line 3
    sget-object v1, LI0/b;->e:LI0/b;

    .line 4
    .line 5
    const-string v2, "sharedPreferencesDataStore"

    .line 6
    .line 7
    const-string v3, "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"

    .line 8
    .line 9
    const-class v4, Lu0/K;

    .line 10
    .line 11
    invoke-direct {v0, v1, v4, v2, v3}, LI0/m;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sget-object v1, LI0/q;->a:LI0/r;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    new-array v1, v1, [LN0/c;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    aput-object v0, v1, v2

    .line 24
    .line 25
    sput-object v1, Lu0/K;->a:[LN0/c;

    .line 26
    .line 27
    sget-object v0, LI/a;->f:LI/a;

    .line 28
    .line 29
    sget-object v1, LQ0/B;->b:LX0/c;

    .line 30
    .line 31
    new-instance v2, LQ0/f0;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-direct {v2, v3}, LQ0/T;-><init>(LQ0/P;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    sget-object v4, Lz0/j;->e:Lz0/j;

    .line 41
    .line 42
    if-ne v2, v4, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    sget-object v4, Lz0/b;->h:Lz0/b;

    .line 46
    .line 47
    invoke-virtual {v2, v1, v4}, LQ0/Z;->d(Ljava/lang/Object;LH0/p;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Lz0/i;

    .line 52
    .line 53
    :goto_0
    new-instance v2, LV0/e;

    .line 54
    .line 55
    sget-object v4, LQ0/t;->f:LQ0/t;

    .line 56
    .line 57
    invoke-interface {v1, v4}, Lz0/i;->f(Lz0/h;)Lz0/g;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    if-eqz v4, :cond_1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    new-instance v4, LQ0/T;

    .line 65
    .line 66
    invoke-direct {v4, v3}, LQ0/T;-><init>(LQ0/P;)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v1, v4}, Lz0/i;->c(Lz0/i;)Lz0/i;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    :goto_1
    invoke-direct {v2, v1}, LV0/e;-><init>(Lz0/i;)V

    .line 74
    .line 75
    .line 76
    new-instance v1, LI/c;

    .line 77
    .line 78
    invoke-direct {v1, v0, v2}, LI/c;-><init>(LH0/l;LQ0/u;)V

    .line 79
    .line 80
    .line 81
    sput-object v1, Lu0/K;->b:LI/c;

    .line 82
    .line 83
    return-void
.end method

.method public static final a(Landroid/content/Context;)LD/j;
    .locals 8

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lu0/K;->b:LI/c;

    .line 7
    .line 8
    sget-object v1, Lu0/K;->a:[LN0/c;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    aget-object v1, v1, v2

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const-string v2, "property"

    .line 17
    .line 18
    invoke-static {v1, v2}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, v0, LI/c;->d:LD/j;

    .line 22
    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    iget-object v1, v0, LI/c;->c:Ljava/lang/Object;

    .line 26
    .line 27
    monitor-enter v1

    .line 28
    :try_start_0
    iget-object v2, v0, LI/c;->d:LD/j;

    .line 29
    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    iget-object v2, v0, LI/c;->a:LH0/l;

    .line 37
    .line 38
    const-string v3, "applicationContext"

    .line 39
    .line 40
    invoke-static {p0, v3}, LI0/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v2, p0}, LH0/l;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Ljava/util/List;

    .line 48
    .line 49
    iget-object v3, v0, LI/c;->b:LQ0/u;

    .line 50
    .line 51
    new-instance v4, LI/b;

    .line 52
    .line 53
    const/4 v5, 0x0

    .line 54
    invoke-direct {v4, v5, p0, v0}, LI/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    const-string p0, "migrations"

    .line 58
    .line 59
    invoke-static {v2, p0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    new-instance p0, LG/X;

    .line 63
    .line 64
    new-instance v5, LG/W;

    .line 65
    .line 66
    const/4 v6, 0x1

    .line 67
    invoke-direct {v5, v6, v4}, LG/W;-><init>(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {p0, v5}, LG/X;-><init>(LG/W;)V

    .line 71
    .line 72
    .line 73
    new-instance v4, LD/j;

    .line 74
    .line 75
    new-instance v5, LH/a;

    .line 76
    .line 77
    const/4 v6, 0x0

    .line 78
    invoke-direct {v5, v6}, LH/a;-><init>(I)V

    .line 79
    .line 80
    .line 81
    new-instance v6, LG/e;

    .line 82
    .line 83
    const/4 v7, 0x0

    .line 84
    invoke-direct {v6, v2, v7}, LG/e;-><init>(Ljava/util/List;Lz0/d;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v6}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    new-instance v6, LG/S;

    .line 92
    .line 93
    invoke-direct {v6, p0, v2, v5, v3}, LG/S;-><init>(LG/X;Ljava/util/List;LH/a;LQ0/u;)V

    .line 94
    .line 95
    .line 96
    const/4 p0, 0x5

    .line 97
    invoke-direct {v4, p0, v6}, LD/j;-><init>(ILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    new-instance p0, LD/j;

    .line 101
    .line 102
    const/4 v2, 0x5

    .line 103
    invoke-direct {p0, v2, v4}, LD/j;-><init>(ILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iput-object p0, v0, LI/c;->d:LD/j;

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :catchall_0
    move-exception p0

    .line 110
    goto :goto_1

    .line 111
    :cond_0
    :goto_0
    iget-object p0, v0, LI/c;->d:LD/j;

    .line 112
    .line 113
    invoke-static {p0}, LI0/i;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    .line 115
    .line 116
    monitor-exit v1

    .line 117
    move-object v1, p0

    .line 118
    goto :goto_2

    .line 119
    :goto_1
    monitor-exit v1

    .line 120
    throw p0

    .line 121
    :cond_1
    :goto_2
    return-object v1
.end method

.method public static final b(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Set;)Z
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p0, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p2, :cond_2

    .line 7
    .line 8
    instance-of p0, p1, Ljava/lang/Boolean;

    .line 9
    .line 10
    if-nez p0, :cond_1

    .line 11
    .line 12
    instance-of p0, p1, Ljava/lang/Long;

    .line 13
    .line 14
    if-nez p0, :cond_1

    .line 15
    .line 16
    instance-of p0, p1, Ljava/lang/String;

    .line 17
    .line 18
    if-nez p0, :cond_1

    .line 19
    .line 20
    instance-of p0, p1, Ljava/lang/Double;

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 28
    :goto_1
    return p0

    .line 29
    :cond_2
    invoke-interface {p2, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0
.end method

.method public static final c(Ljava/lang/Object;LH/a;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p0, Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Ljava/lang/String;

    .line 7
    .line 8
    const-string v1, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu"

    .line 9
    .line 10
    const-string v2, "<this>"

    .line 11
    .line 12
    invoke-static {v0, v2}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const-string v2, "substring(...)"

    .line 20
    .line 21
    const/16 v3, 0x28

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const-string v1, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0, v2}, LI0/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p0}, LH/a;->e(Ljava/lang/String;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    :goto_0
    return-object p0

    .line 46
    :cond_1
    const-string p1, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu"

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0, v2}, LI0/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 62
    .line 63
    .line 64
    move-result-wide p0

    .line 65
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    :cond_2
    return-object p0
.end method
