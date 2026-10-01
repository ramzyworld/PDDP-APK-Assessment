.class public final LO0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO0/b;


# instance fields
.field public final a:LP0/b;

.field public final b:LG/M;


# direct methods
.method public constructor <init>(LP0/b;LG/M;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LO0/g;->a:LP0/b;

    .line 5
    .line 6
    iput-object p2, p0, LO0/g;->b:LG/M;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, LO0/f;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LO0/f;-><init>(LO0/g;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
