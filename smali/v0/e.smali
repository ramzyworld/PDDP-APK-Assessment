.class public final Lv0/e;
.super LI0/j;
.source "SourceFile"

# interfaces
.implements LH0/a;


# static fields
.field public static final f:Lv0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lv0/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LI0/j;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lv0/e;->f:Lv0/e;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final f()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lv0/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
