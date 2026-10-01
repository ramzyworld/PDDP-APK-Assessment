.class public final Lv0/a;
.super Ljava/lang/Throwable;
.source "SourceFile"


# instance fields
.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Throwable;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv0/a;->e:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lv0/a;->f:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lv0/a;->g:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final getMessage()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/a;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
