.class public final LQ0/p;
.super LI0/j;
.source "SourceFile"

# interfaces
.implements LH0/p;


# static fields
.field public static final g:LQ0/p;

.field public static final h:LQ0/p;


# instance fields
.field public final synthetic f:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LQ0/p;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, LQ0/p;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LQ0/p;->g:LQ0/p;

    .line 9
    .line 10
    new-instance v0, LQ0/p;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-direct {v0, v1, v2}, LQ0/p;-><init>(II)V

    .line 15
    .line 16
    .line 17
    sput-object v0, LQ0/p;->h:LQ0/p;

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, LQ0/p;->f:I

    invoke-direct {p0, p1}, LI0/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LQ0/p;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lz0/i;

    .line 7
    .line 8
    check-cast p2, Lz0/g;

    .line 9
    .line 10
    invoke-interface {p1, p2}, Lz0/i;->c(Lz0/i;)Lz0/i;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    check-cast p2, Lz0/g;

    .line 21
    .line 22
    return-object p1

    .line 23
    :pswitch_1
    check-cast p1, Lz0/i;

    .line 24
    .line 25
    check-cast p2, Lz0/g;

    .line 26
    .line 27
    invoke-interface {p1, p2}, Lz0/i;->c(Lz0/i;)Lz0/i;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
