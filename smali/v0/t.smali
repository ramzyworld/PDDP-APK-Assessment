.class public final Lv0/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lv0/i;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lv0/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv0/t;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lv0/t;->b:Lv0/i;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public postMessage(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, Lv0/t;->b:Lv0/i;

    .line 2
    .line 3
    new-instance v1, LL/h;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v1, v2, p0, p1}, LL/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, v0, Lv0/i;->a:Lv/d;

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Lv/d;->c(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
