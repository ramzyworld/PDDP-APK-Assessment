.class public final synthetic Lio/flutter/plugin/platform/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lio/flutter/plugin/platform/e;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/platform/e;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugin/platform/d;->e:Lio/flutter/plugin/platform/e;

    iput p2, p0, Lio/flutter/plugin/platform/d;->f:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget v2, p0, Lio/flutter/plugin/platform/d;->f:I

    .line 4
    .line 5
    and-int/lit8 v2, v2, 0x4

    .line 6
    .line 7
    iget-object v3, p0, Lio/flutter/plugin/platform/d;->e:Lio/flutter/plugin/platform/e;

    .line 8
    .line 9
    iget-object v3, v3, Lio/flutter/plugin/platform/e;->b:Lio/flutter/plugin/platform/f;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const-string v5, "SystemChrome.systemUIChange"

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    iget-object v2, v3, Lio/flutter/plugin/platform/f;->b:LN/Q;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-array v1, v1, [Ljava/lang/Boolean;

    .line 22
    .line 23
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 24
    .line 25
    aput-object v3, v1, v0

    .line 26
    .line 27
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, v2, LN/Q;->f:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, LN/b;

    .line 34
    .line 35
    invoke-virtual {v1, v5, v0, v4}, LN/b;->F(Ljava/lang/String;Ljava/lang/Object;Lp0/k;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-object v2, v3, Lio/flutter/plugin/platform/f;->b:LN/Q;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    new-array v1, v1, [Ljava/lang/Boolean;

    .line 45
    .line 46
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 47
    .line 48
    aput-object v3, v1, v0

    .line 49
    .line 50
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v1, v2, LN/Q;->f:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, LN/b;

    .line 57
    .line 58
    invoke-virtual {v1, v5, v0, v4}, LN/b;->F(Ljava/lang/String;Ljava/lang/Object;Lp0/k;)V

    .line 59
    .line 60
    .line 61
    :goto_0
    return-void
.end method
