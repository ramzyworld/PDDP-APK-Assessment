.class public final Lv0/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/webkit/DownloadListener;


# instance fields
.field public final a:Lv0/i;


# direct methods
.method public constructor <init>(Lv0/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv0/o;->a:Lv0/i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onDownloadStart(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 11

    .line 1
    move-object v8, p0

    .line 2
    iget-object v9, v8, Lv0/o;->a:Lv0/i;

    .line 3
    .line 4
    new-instance v10, Lv0/m;

    .line 5
    .line 6
    move-object v0, v10

    .line 7
    move-object v1, p0

    .line 8
    move-object v2, p1

    .line 9
    move-object v3, p2

    .line 10
    move-object v4, p3

    .line 11
    move-object v5, p4

    .line 12
    move-wide/from16 v6, p5

    .line 13
    .line 14
    invoke-direct/range {v0 .. v7}, Lv0/m;-><init>(Lv0/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 15
    .line 16
    .line 17
    iget-object v0, v9, Lv0/i;->a:Lv/d;

    .line 18
    .line 19
    invoke-virtual {v0, v10}, Lv/d;->c(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
