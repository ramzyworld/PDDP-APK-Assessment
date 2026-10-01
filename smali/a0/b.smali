.class public final synthetic La0/b;
.super LI0/g;
.source "SourceFile"

# interfaces
.implements LH0/l;


# direct methods
.method public constructor <init>(La0/f;)V
    .locals 7

    .line 1
    const-string v5, "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V"

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    const-class v3, La0/f;

    .line 6
    .line 7
    const-string v4, "accept"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    move-object v2, p1

    .line 11
    invoke-direct/range {v0 .. v6}, LI0/g;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Landroidx/window/extensions/layout/WindowLayoutInfo;

    .line 2
    .line 3
    const-string v0, "p0"

    .line 4
    .line 5
    invoke-static {p1, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LI0/c;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, La0/f;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, La0/f;->a(Landroidx/window/extensions/layout/WindowLayoutInfo;)V

    .line 13
    .line 14
    .line 15
    sget-object p1, Lx0/g;->a:Lx0/g;

    .line 16
    .line 17
    return-object p1
.end method
