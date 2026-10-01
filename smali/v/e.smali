.class public final Lv/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:Lv/d;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroid/content/Context;Lv/d;II)V
    .locals 0

    .line 1
    iput p5, p0, Lv/e;->a:I

    iput-object p1, p0, Lv/e;->b:Ljava/lang/String;

    iput-object p2, p0, Lv/e;->c:Landroid/content/Context;

    iput-object p3, p0, Lv/e;->d:Lv/d;

    iput p4, p0, Lv/e;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lv/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Lv/e;->b:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v1, p0, Lv/e;->c:Landroid/content/Context;

    .line 9
    .line 10
    iget-object v2, p0, Lv/e;->d:Lv/d;

    .line 11
    .line 12
    iget v3, p0, Lv/e;->e:I

    .line 13
    .line 14
    invoke-static {v0, v1, v2, v3}, Lv/h;->a(Ljava/lang/String;Landroid/content/Context;Lv/d;I)Lv/g;

    .line 15
    .line 16
    .line 17
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    new-instance v0, Lv/g;

    .line 20
    .line 21
    const/4 v1, -0x3

    .line 22
    invoke-direct {v0, v1}, Lv/g;-><init>(I)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-object v0

    .line 26
    :pswitch_0
    iget-object v0, p0, Lv/e;->b:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v1, p0, Lv/e;->c:Landroid/content/Context;

    .line 29
    .line 30
    iget-object v2, p0, Lv/e;->d:Lv/d;

    .line 31
    .line 32
    iget v3, p0, Lv/e;->e:I

    .line 33
    .line 34
    invoke-static {v0, v1, v2, v3}, Lv/h;->a(Ljava/lang/String;Landroid/content/Context;Lv/d;I)Lv/g;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
