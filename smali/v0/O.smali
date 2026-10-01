.class public final enum Lv0/O;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum f:Lv0/O;

.field public static final enum g:Lv0/O;

.field public static final enum h:Lv0/O;

.field public static final enum i:Lv0/O;

.field public static final enum j:Lv0/O;

.field public static final enum k:Lv0/O;

.field public static final enum l:Lv0/O;

.field public static final synthetic m:[Lv0/O;


# instance fields
.field public final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Lv0/O;

    .line 2
    .line 3
    const-string v1, "DATE_INVALID"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v2, v1, v2}, Lv0/O;-><init>(ILjava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lv0/O;->f:Lv0/O;

    .line 10
    .line 11
    new-instance v1, Lv0/O;

    .line 12
    .line 13
    const-string v3, "EXPIRED"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v4, v3, v4}, Lv0/O;-><init>(ILjava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lv0/O;->g:Lv0/O;

    .line 20
    .line 21
    new-instance v3, Lv0/O;

    .line 22
    .line 23
    const-string v5, "ID_MISMATCH"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v6, v5, v6}, Lv0/O;-><init>(ILjava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lv0/O;->h:Lv0/O;

    .line 30
    .line 31
    new-instance v5, Lv0/O;

    .line 32
    .line 33
    const-string v7, "INVALID"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v8, v7, v8}, Lv0/O;-><init>(ILjava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Lv0/O;->i:Lv0/O;

    .line 40
    .line 41
    new-instance v7, Lv0/O;

    .line 42
    .line 43
    const-string v9, "NOT_YET_VALID"

    .line 44
    .line 45
    const/4 v10, 0x4

    .line 46
    invoke-direct {v7, v10, v9, v10}, Lv0/O;-><init>(ILjava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v7, Lv0/O;->j:Lv0/O;

    .line 50
    .line 51
    new-instance v9, Lv0/O;

    .line 52
    .line 53
    const-string v11, "UNTRUSTED"

    .line 54
    .line 55
    const/4 v12, 0x5

    .line 56
    invoke-direct {v9, v12, v11, v12}, Lv0/O;-><init>(ILjava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v9, Lv0/O;->k:Lv0/O;

    .line 60
    .line 61
    new-instance v11, Lv0/O;

    .line 62
    .line 63
    const-string v13, "UNKNOWN"

    .line 64
    .line 65
    const/4 v14, 0x6

    .line 66
    invoke-direct {v11, v14, v13, v14}, Lv0/O;-><init>(ILjava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    sput-object v11, Lv0/O;->l:Lv0/O;

    .line 70
    .line 71
    const/4 v13, 0x7

    .line 72
    new-array v13, v13, [Lv0/O;

    .line 73
    .line 74
    aput-object v0, v13, v2

    .line 75
    .line 76
    aput-object v1, v13, v4

    .line 77
    .line 78
    aput-object v3, v13, v6

    .line 79
    .line 80
    aput-object v5, v13, v8

    .line 81
    .line 82
    aput-object v7, v13, v10

    .line 83
    .line 84
    aput-object v9, v13, v12

    .line 85
    .line 86
    aput-object v11, v13, v14

    .line 87
    .line 88
    sput-object v13, Lv0/O;->m:[Lv0/O;

    .line 89
    .line 90
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lv0/O;->e:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lv0/O;
    .locals 1

    .line 1
    const-class v0, Lv0/O;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lv0/O;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lv0/O;
    .locals 1

    .line 1
    sget-object v0, Lv0/O;->m:[Lv0/O;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lv0/O;

    .line 8
    .line 9
    return-object v0
.end method
