.class public final Lp0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LG/n;


# direct methods
.method public constructor <init>(Li0/b;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, LG/n;

    sget-object v1, Lq0/h;->a:Lq0/h;

    const/4 v2, 0x0

    .line 3
    const-string v3, "flutter/system"

    invoke-direct {v0, p1, v3, v1, v2}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4
    iput-object v0, p0, Lp0/c;->a:LG/n;

    return-void
.end method

.method public constructor <init>(Lq0/f;)V
    .locals 4

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, LG/n;

    sget-object v1, Lq0/h;->a:Lq0/h;

    const/4 v2, 0x0

    .line 7
    const-string v3, "flutter/keyevent"

    invoke-direct {v0, p1, v3, v1, v2}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    iput-object v0, p0, Lp0/c;->a:LG/n;

    return-void
.end method
