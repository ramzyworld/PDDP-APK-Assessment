.class public final Lp0/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:LN/b;


# instance fields
.field public final a:LG/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LN/b;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, LN/b;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lp0/n;->b:LN/b;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Li0/b;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LG/n;

    .line 5
    .line 6
    sget-object v1, Lq0/h;->a:Lq0/h;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const-string v3, "flutter/settings"

    .line 10
    .line 11
    invoke-direct {v0, p1, v3, v1, v2}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lp0/n;->a:LG/n;

    .line 15
    .line 16
    return-void
.end method
