.class public final Ll/b;
.super La1/a;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final m:Ll/c;

.field public n:Ll/c;

.field public final synthetic o:I


# direct methods
.method public constructor <init>(Ll/c;Ll/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Ll/b;->o:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Ll/b;->m:Ll/c;

    .line 7
    .line 8
    iput-object p1, p0, Ll/b;->n:Ll/c;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ll/b;->n:Ll/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ll/b;->n:Ll/c;

    .line 2
    .line 3
    iget-object v1, p0, Ll/b;->m:Ll/c;

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget v1, p0, Ll/b;->o:I

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v1, v0, Ll/c;->h:Ll/c;

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :pswitch_0
    iget-object v1, v0, Ll/c;->g:Ll/c;

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 22
    :goto_1
    iput-object v1, p0, Ll/b;->n:Ll/c;

    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
