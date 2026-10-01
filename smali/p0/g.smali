.class public final enum Lp0/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum f:Lp0/g;

.field public static final enum g:Lp0/g;

.field public static final synthetic h:[Lp0/g;


# instance fields
.field public final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lp0/g;

    .line 2
    .line 3
    const-string v1, "SystemUiOverlay.top"

    .line 4
    .line 5
    const-string v2, "TOP_OVERLAYS"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v3, v2, v1}, Lp0/g;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lp0/g;->f:Lp0/g;

    .line 12
    .line 13
    new-instance v1, Lp0/g;

    .line 14
    .line 15
    const-string v2, "SystemUiOverlay.bottom"

    .line 16
    .line 17
    const-string v4, "BOTTOM_OVERLAYS"

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    invoke-direct {v1, v5, v4, v2}, Lp0/g;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lp0/g;->g:Lp0/g;

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    new-array v2, v2, [Lp0/g;

    .line 27
    .line 28
    aput-object v0, v2, v3

    .line 29
    .line 30
    aput-object v1, v2, v5

    .line 31
    .line 32
    sput-object v2, Lp0/g;->h:[Lp0/g;

    .line 33
    .line 34
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lp0/g;->e:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lp0/g;
    .locals 1

    .line 1
    const-class v0, Lp0/g;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lp0/g;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lp0/g;
    .locals 1

    .line 1
    sget-object v0, Lp0/g;->h:[Lp0/g;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lp0/g;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lp0/g;

    .line 8
    .line 9
    return-object v0
.end method
