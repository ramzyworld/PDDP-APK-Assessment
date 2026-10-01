.class public final Lv0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lx0/e;


# instance fields
.field public final a:Lq0/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lv0/e;->f:Lv0/e;

    .line 2
    .line 3
    new-instance v1, Lx0/e;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Lx0/e;-><init>(LH0/a;)V

    .line 6
    .line 7
    .line 8
    sput-object v1, Lv0/f;->b:Lx0/e;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lq0/f;)V
    .locals 1

    .line 1
    const-string v0, "binaryMessenger"

    .line 2
    .line 3
    invoke-static {p1, v0}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lv0/f;->a:Lq0/f;

    .line 10
    .line 11
    return-void
.end method
