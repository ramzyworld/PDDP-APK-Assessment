.class public final enum Lv0/v;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum f:Lv0/v;

.field public static final synthetic g:[Lv0/v;


# instance fields
.field public final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lv0/v;

    .line 2
    .line 3
    const-string v1, "ALWAYS"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v2, v1, v2}, Lv0/v;-><init>(ILjava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lv0/v;

    .line 10
    .line 11
    const-string v3, "IF_CONTENT_SCROLLS"

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    invoke-direct {v1, v4, v3, v4}, Lv0/v;-><init>(ILjava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    new-instance v3, Lv0/v;

    .line 18
    .line 19
    const-string v5, "NEVER"

    .line 20
    .line 21
    const/4 v6, 0x2

    .line 22
    invoke-direct {v3, v6, v5, v6}, Lv0/v;-><init>(ILjava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    new-instance v5, Lv0/v;

    .line 26
    .line 27
    const-string v7, "UNKNOWN"

    .line 28
    .line 29
    const/4 v8, 0x3

    .line 30
    invoke-direct {v5, v8, v7, v8}, Lv0/v;-><init>(ILjava/lang/String;I)V

    .line 31
    .line 32
    .line 33
    sput-object v5, Lv0/v;->f:Lv0/v;

    .line 34
    .line 35
    const/4 v7, 0x4

    .line 36
    new-array v7, v7, [Lv0/v;

    .line 37
    .line 38
    aput-object v0, v7, v2

    .line 39
    .line 40
    aput-object v1, v7, v4

    .line 41
    .line 42
    aput-object v3, v7, v6

    .line 43
    .line 44
    aput-object v5, v7, v8

    .line 45
    .line 46
    sput-object v7, Lv0/v;->g:[Lv0/v;

    .line 47
    .line 48
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lv0/v;->e:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lv0/v;
    .locals 1

    .line 1
    const-class v0, Lv0/v;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lv0/v;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lv0/v;
    .locals 1

    .line 1
    sget-object v0, Lv0/v;->g:[Lv0/v;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lv0/v;

    .line 8
    .line 9
    return-object v0
.end method
