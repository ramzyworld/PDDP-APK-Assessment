.class public final LT0/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT0/e;


# instance fields
.field public final e:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LT0/t;->e:Ljava/lang/Throwable;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lz0/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p1, p0, LT0/t;->e:Ljava/lang/Throwable;

    .line 2
    .line 3
    throw p1
.end method
