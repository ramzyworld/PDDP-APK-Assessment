.class public final Lv0/A;
.super LI0/j;
.source "SourceFile"

# interfaces
.implements LH0/l;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:LN/Q;


# direct methods
.method public synthetic constructor <init>(LN/Q;I)V
    .locals 0

    .line 1
    iput p2, p0, Lv0/A;->f:I

    iput-object p1, p0, Lv0/A;->g:LN/Q;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LI0/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lv0/A;->f:I

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
    invoke-static {p1}, Lx0/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lv0/A;->g:LN/Q;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-static {v0}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {v1, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    instance-of v0, p1, Lx0/c;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    :cond_1
    check-cast p1, Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {v1, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    sget-object p1, Lx0/g;->a:Lx0/g;

    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_0
    check-cast p1, Lx0/d;

    .line 44
    .line 45
    iget-object p1, p1, Lx0/d;->e:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-static {p1}, Lx0/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v1, p0, Lv0/A;->g:LN/Q;

    .line 52
    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    invoke-static {v0}, La1/a;->N(Ljava/lang/Throwable;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {v1, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    instance-of v0, p1, Lx0/c;

    .line 64
    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    const/4 p1, 0x0

    .line 68
    :cond_3
    check-cast p1, Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-static {p1}, La1/a;->t(Ljava/lang/Object;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {v1, p1}, LN/Q;->b(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :goto_1
    sget-object p1, Lx0/g;->a:Lx0/g;

    .line 78
    .line 79
    return-object p1

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
