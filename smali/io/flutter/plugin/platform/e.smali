.class public final Lio/flutter/plugin/platform/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnSystemUiVisibilityChangeListener;


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Lio/flutter/plugin/platform/f;


# direct methods
.method public constructor <init>(Lio/flutter/plugin/platform/f;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/flutter/plugin/platform/e;->b:Lio/flutter/plugin/platform/f;

    .line 5
    .line 6
    iput-object p2, p0, Lio/flutter/plugin/platform/e;->a:Landroid/view/View;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onSystemUiVisibilityChange(I)V
    .locals 1

    .line 1
    new-instance v0, Lio/flutter/plugin/platform/d;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lio/flutter/plugin/platform/d;-><init>(Lio/flutter/plugin/platform/e;I)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lio/flutter/plugin/platform/e;->a:Landroid/view/View;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method
