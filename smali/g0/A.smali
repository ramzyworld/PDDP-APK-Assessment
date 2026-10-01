.class public final Lg0/A;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/KeyEvent;

.field public b:I

.field public c:Z

.field public final synthetic d:LN/b;


# direct methods
.method public constructor <init>(LN/b;Landroid/view/KeyEvent;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg0/A;->d:LN/b;

    .line 5
    .line 6
    iget-object p1, p1, LN/b;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, [Lg0/B;

    .line 9
    .line 10
    array-length p1, p1

    .line 11
    iput p1, p0, Lg0/A;->b:I

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput-boolean p1, p0, Lg0/A;->c:Z

    .line 15
    .line 16
    iput-object p2, p0, Lg0/A;->a:Landroid/view/KeyEvent;

    .line 17
    .line 18
    return-void
.end method
