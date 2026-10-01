.class public final enum Lu0/L;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum f:Lu0/L;

.field public static final enum g:Lu0/L;

.field public static final enum h:Lu0/L;

.field public static final synthetic i:[Lu0/L;


# instance fields
.field public final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lu0/L;

    .line 2
    .line 3
    const-string v1, "PLATFORM_ENCODED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v2, v1, v2}, Lu0/L;-><init>(ILjava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lu0/L;->f:Lu0/L;

    .line 10
    .line 11
    new-instance v1, Lu0/L;

    .line 12
    .line 13
    const-string v3, "JSON_ENCODED"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v4, v3, v4}, Lu0/L;-><init>(ILjava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lu0/L;->g:Lu0/L;

    .line 20
    .line 21
    new-instance v3, Lu0/L;

    .line 22
    .line 23
    const-string v5, "UNEXPECTED_STRING"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v6, v5, v6}, Lu0/L;-><init>(ILjava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lu0/L;->h:Lu0/L;

    .line 30
    .line 31
    const/4 v5, 0x3

    .line 32
    new-array v5, v5, [Lu0/L;

    .line 33
    .line 34
    aput-object v0, v5, v2

    .line 35
    .line 36
    aput-object v1, v5, v4

    .line 37
    .line 38
    aput-object v3, v5, v6

    .line 39
    .line 40
    sput-object v5, Lu0/L;->i:[Lu0/L;

    .line 41
    .line 42
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lu0/L;->e:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lu0/L;
    .locals 1

    .line 1
    const-class v0, Lu0/L;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lu0/L;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lu0/L;
    .locals 1

    .line 1
    sget-object v0, Lu0/L;->i:[Lu0/L;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lu0/L;

    .line 8
    .line 9
    return-object v0
.end method
