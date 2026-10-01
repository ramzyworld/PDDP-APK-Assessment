.class public final synthetic Lg0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackInvokedCallback;


# instance fields
.field public final synthetic a:Lg0/e;


# direct methods
.method public synthetic constructor <init>(Lg0/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/c;->a:Lg0/e;

    return-void
.end method


# virtual methods
.method public final onBackInvoked()V
    .locals 1

    .line 1
    iget-object v0, p0, Lg0/c;->a:Lg0/e;

    invoke-virtual {v0}, Lg0/e;->onBackPressed()V

    return-void
.end method
