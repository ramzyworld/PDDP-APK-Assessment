.class public final LG/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT0/e;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LG/A;->e:I

    iput-object p2, p0, LG/A;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lz0/d;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LG/A;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, LG/A;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p2, LY/i;

    .line 9
    .line 10
    invoke-virtual {p2, p1}, LY/i;->accept(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget-object p1, Lx0/g;->a:Lx0/g;

    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    iget-object p2, p0, LG/A;->f:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p2, LI0/p;

    .line 19
    .line 20
    iput-object p1, p2, LI0/p;->e:Ljava/lang/Object;

    .line 21
    .line 22
    new-instance p1, LU0/a;

    .line 23
    .line 24
    invoke-direct {p1, p0}, LU0/a;-><init>(LT0/e;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :pswitch_1
    check-cast p1, Lx0/g;

    .line 29
    .line 30
    iget-object p1, p0, LG/A;->f:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, LG/S;

    .line 33
    .line 34
    iget-object v0, p1, LG/S;->l:LD/j;

    .line 35
    .line 36
    invoke-virtual {v0}, LD/j;->p()LG/m0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    instance-of v0, v0, LG/d0;

    .line 41
    .line 42
    sget-object v1, Lx0/g;->a:Lx0/g;

    .line 43
    .line 44
    if-nez v0, :cond_0

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    invoke-static {p1, v0, p2}, LG/S;->e(LG/S;ZLz0/d;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    sget-object p2, LA0/a;->e:LA0/a;

    .line 52
    .line 53
    if-ne p1, p2, :cond_0

    .line 54
    .line 55
    move-object v1, p1

    .line 56
    :cond_0
    return-object v1

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
