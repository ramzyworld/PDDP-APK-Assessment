.class public final synthetic Lv0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH0/l;


# instance fields
.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lv0/n;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    iget v1, p0, Lv0/n;->e:I

    check-cast p1, Lx0/d;

    packed-switch v1, :pswitch_data_0

    sget p1, Lv0/h0;->h:I

    return-object v0

    :pswitch_0
    sget p1, Lv0/d0;->c:I

    return-object v0

    :pswitch_1
    sget p1, Lv0/b0;->d:I

    return-object v0

    :pswitch_2
    sget p1, Lv0/U;->h:I

    :pswitch_3
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
