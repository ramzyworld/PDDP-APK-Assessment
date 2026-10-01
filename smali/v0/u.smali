.class public final enum Lv0/u;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic f:[Lv0/u;


# instance fields
.field public final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lv0/u;

    .line 2
    .line 3
    const-string v1, "ALWAYS_ALLOW"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v2, v1, v2}, Lv0/u;-><init>(ILjava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lv0/u;

    .line 10
    .line 11
    const-string v3, "COMPATIBILITY_MODE"

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    invoke-direct {v1, v4, v3, v4}, Lv0/u;-><init>(ILjava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    new-instance v3, Lv0/u;

    .line 18
    .line 19
    const-string v5, "NEVER_ALLOW"

    .line 20
    .line 21
    const/4 v6, 0x2

    .line 22
    invoke-direct {v3, v6, v5, v6}, Lv0/u;-><init>(ILjava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    const/4 v5, 0x3

    .line 26
    new-array v5, v5, [Lv0/u;

    .line 27
    .line 28
    aput-object v0, v5, v2

    .line 29
    .line 30
    aput-object v1, v5, v4

    .line 31
    .line 32
    aput-object v3, v5, v6

    .line 33
    .line 34
    sput-object v5, Lv0/u;->f:[Lv0/u;

    .line 35
    .line 36
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lv0/u;->e:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lv0/u;
    .locals 1

    .line 1
    const-class v0, Lv0/u;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lv0/u;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lv0/u;
    .locals 1

    .line 1
    sget-object v0, Lv0/u;->f:[Lv0/u;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lv0/u;

    .line 8
    .line 9
    return-object v0
.end method
