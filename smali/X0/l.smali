.class public final LX0/l;
.super LQ0/s;
.source "SourceFile"


# static fields
.field public static final g:LX0/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LX0/l;

    .line 2
    .line 3
    invoke-direct {v0}, LQ0/s;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LX0/l;->g:LX0/l;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final e(Lz0/i;Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    sget-object p1, LX0/d;->h:LX0/d;

    .line 2
    .line 3
    sget-object v0, LX0/k;->h:LX0/i;

    .line 4
    .line 5
    iget-object p1, p1, LX0/g;->g:LX0/b;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {p1, p2, v0, v1}, LX0/b;->b(Ljava/lang/Runnable;LX0/i;Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
