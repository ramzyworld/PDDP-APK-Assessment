.class public final synthetic Lio/flutter/plugin/platform/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:Lio/flutter/plugin/platform/o;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/platform/o;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugin/platform/k;->a:Lio/flutter/plugin/platform/o;

    iput p2, p0, Lio/flutter/plugin/platform/k;->b:I

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 2

    .line 1
    iget-object p1, p0, Lio/flutter/plugin/platform/k;->a:Lio/flutter/plugin/platform/o;

    .line 2
    .line 3
    iget v0, p0, Lio/flutter/plugin/platform/k;->b:I

    .line 4
    .line 5
    if-eqz p2, :cond_1

    .line 6
    .line 7
    iget-object p1, p1, Lio/flutter/plugin/platform/o;->g:LN/Q;

    .line 8
    .line 9
    iget-object p1, p1, LN/Q;->f:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, LN/b;

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    const/4 v0, 0x0

    .line 21
    const-string v1, "viewFocused"

    .line 22
    .line 23
    invoke-virtual {p1, v1, p2, v0}, LN/b;->F(Ljava/lang/String;Ljava/lang/Object;Lp0/k;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object p1, p1, Lio/flutter/plugin/platform/o;->f:Lio/flutter/plugin/editing/j;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lio/flutter/plugin/editing/j;->b(I)V

    .line 32
    .line 33
    .line 34
    :cond_2
    :goto_0
    return-void
.end method
