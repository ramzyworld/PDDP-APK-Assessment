.class public final LG/s;
.super LB0/g;
.source "SourceFile"

# interfaces
.implements LH0/q;


# instance fields
.field public final synthetic i:I

.field public j:I

.field public synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILz0/d;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, LG/s;->i:I

    invoke-direct {p0, p1, p2}, LB0/g;-><init>(ILz0/d;)V

    return-void
.end method

.method public constructor <init>(LG/S;Lz0/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LG/s;->i:I

    .line 2
    iput-object p1, p0, LG/s;->k:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, LB0/g;-><init>(ILz0/d;)V

    return-void
.end method


# virtual methods
.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LG/s;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, LA0/a;->e:LA0/a;

    .line 7
    .line 8
    iget v1, p0, LG/s;->j:I

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, LG/s;->k:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, LG/U;

    .line 33
    .line 34
    iput v2, p0, LG/s;->j:I

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {p1, p0}, LG/U;->a(LG/U;LB0/b;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-ne p1, v0, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    :goto_0
    move-object v0, p1

    .line 47
    :goto_1
    return-object v0

    .line 48
    :pswitch_0
    sget-object v0, LA0/a;->e:LA0/a;

    .line 49
    .line 50
    iget v1, p0, LG/s;->j:I

    .line 51
    .line 52
    const/4 v2, 0x1

    .line 53
    if-eqz v1, :cond_4

    .line 54
    .line 55
    if-ne v1, v2, :cond_3

    .line 56
    .line 57
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_4
    invoke-static {p1}, La/a;->O(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iput v2, p0, LG/s;->j:I

    .line 73
    .line 74
    iget-object p1, p0, LG/s;->k:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, LG/S;

    .line 77
    .line 78
    invoke-static {p1, p0}, LG/S;->a(LG/S;LB0/b;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-ne p1, v0, :cond_5

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_5
    :goto_2
    sget-object v0, Lx0/g;->a:Lx0/g;

    .line 86
    .line 87
    :goto_3
    return-object v0

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Ljava/lang/Object;Ljava/lang/Object;LB0/b;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LG/s;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LG/U;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance p2, LG/s;

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    invoke-direct {p2, v0, p3}, LG/s;-><init>(ILz0/d;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p2, LG/s;->k:Ljava/lang/Object;

    .line 20
    .line 21
    sget-object p1, Lx0/g;->a:Lx0/g;

    .line 22
    .line 23
    invoke-virtual {p2, p1}, LG/s;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :pswitch_0
    check-cast p1, LT0/e;

    .line 29
    .line 30
    check-cast p2, Ljava/lang/Throwable;

    .line 31
    .line 32
    new-instance p1, LG/s;

    .line 33
    .line 34
    iget-object p2, p0, LG/s;->k:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p2, LG/S;

    .line 37
    .line 38
    invoke-direct {p1, p2, p3}, LG/s;-><init>(LG/S;Lz0/d;)V

    .line 39
    .line 40
    .line 41
    sget-object p2, Lx0/g;->a:Lx0/g;

    .line 42
    .line 43
    invoke-virtual {p1, p2}, LG/s;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
