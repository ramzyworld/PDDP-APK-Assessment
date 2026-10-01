.class public final LG/M;
.super LI0/j;
.source "SourceFile"

# interfaces
.implements LH0/l;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LG/M;->f:I

    iput-object p2, p0, LG/M;->g:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LI0/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LG/M;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lx0/d;

    .line 7
    .line 8
    iget-object p1, p1, Lx0/d;->e:Ljava/lang/Object;

    .line 9
    .line 10
    new-instance v0, Lv0/N;

    .line 11
    .line 12
    invoke-direct {v0, p1}, Lv0/N;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, LG/M;->g:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, LH0/l;

    .line 18
    .line 19
    invoke-interface {p1, v0}, LH0/l;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    sget-object p1, Lx0/g;->a:Lx0/g;

    .line 23
    .line 24
    return-object p1

    .line 25
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 26
    .line 27
    iget-object p1, p0, LG/M;->g:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, LY0/h;

    .line 30
    .line 31
    invoke-virtual {p1}, LY0/h;->b()V

    .line 32
    .line 33
    .line 34
    sget-object p1, Lx0/g;->a:Lx0/g;

    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 38
    .line 39
    sget-object p1, Lx0/g;->a:Lx0/g;

    .line 40
    .line 41
    iget-object v0, p0, LG/M;->g:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, LQ0/f;

    .line 44
    .line 45
    invoke-virtual {v0, p1}, LQ0/f;->m(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-object p1

    .line 49
    :pswitch_2
    check-cast p1, LM0/c;

    .line 50
    .line 51
    const-string v0, "it"

    .line 52
    .line 53
    invoke-static {p1, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, LG/M;->g:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Ljava/lang/String;

    .line 59
    .line 60
    iget v1, p1, LM0/a;->f:I

    .line 61
    .line 62
    add-int/lit8 v1, v1, 0x1

    .line 63
    .line 64
    iget p1, p1, LM0/a;->e:I

    .line 65
    .line 66
    invoke-virtual {v0, p1, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1

    .line 75
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 76
    .line 77
    iget-object v0, p0, LG/M;->g:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, LG/S;

    .line 80
    .line 81
    if-eqz p1, :cond_0

    .line 82
    .line 83
    iget-object v1, v0, LG/S;->l:LD/j;

    .line 84
    .line 85
    new-instance v2, LG/d0;

    .line 86
    .line 87
    invoke-direct {v2, p1}, LG/d0;-><init>(Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v2}, LD/j;->x(LG/m0;)V

    .line 91
    .line 92
    .line 93
    :cond_0
    iget-object p1, v0, LG/S;->n:Lx0/e;

    .line 94
    .line 95
    iget-object p1, p1, Lx0/e;->f:Ljava/lang/Object;

    .line 96
    .line 97
    sget-object v1, Lx0/f;->a:Lx0/f;

    .line 98
    .line 99
    if-eq p1, v1, :cond_1

    .line 100
    .line 101
    iget-object p1, v0, LG/S;->n:Lx0/e;

    .line 102
    .line 103
    invoke-virtual {p1}, Lx0/e;->a()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    check-cast p1, LG/a0;

    .line 108
    .line 109
    invoke-virtual {p1}, LG/a0;->close()V

    .line 110
    .line 111
    .line 112
    :cond_1
    sget-object p1, Lx0/g;->a:Lx0/g;

    .line 113
    .line 114
    return-object p1

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
