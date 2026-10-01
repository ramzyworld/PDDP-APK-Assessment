.class public abstract LY0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LD/j;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LD/j;

    .line 2
    .line 3
    const-string v1, "NO_OWNER"

    .line 4
    .line 5
    const/16 v2, 0xe

    .line 6
    .line 7
    invoke-direct {v0, v2, v1}, LD/j;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, LY0/e;->a:LD/j;

    .line 11
    .line 12
    return-void
.end method

.method public static a()LY0/d;
    .locals 2

    .line 1
    new-instance v0, LY0/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LY0/d;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
