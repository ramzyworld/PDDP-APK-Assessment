.class public final synthetic Lv0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lv0/o;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:J


# direct methods
.method public synthetic constructor <init>(Lv0/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv0/m;->e:Lv0/o;

    iput-object p2, p0, Lv0/m;->f:Ljava/lang/String;

    iput-object p3, p0, Lv0/m;->g:Ljava/lang/String;

    iput-object p4, p0, Lv0/m;->h:Ljava/lang/String;

    iput-object p5, p0, Lv0/m;->i:Ljava/lang/String;

    iput-wide p6, p0, Lv0/m;->j:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    new-instance v1, Lv0/n;

    .line 3
    .line 4
    invoke-direct {v1, v0}, Lv0/n;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v2, p0, Lv0/m;->e:Lv0/o;

    .line 8
    .line 9
    iget-object v3, v2, Lv0/o;->a:Lv0/i;

    .line 10
    .line 11
    iget-object v4, p0, Lv0/m;->f:Ljava/lang/String;

    .line 12
    .line 13
    const-string v5, "urlArg"

    .line 14
    .line 15
    invoke-static {v4, v5}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v5, p0, Lv0/m;->g:Ljava/lang/String;

    .line 19
    .line 20
    const-string v6, "userAgentArg"

    .line 21
    .line 22
    invoke-static {v5, v6}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v6, p0, Lv0/m;->h:Ljava/lang/String;

    .line 26
    .line 27
    const-string v7, "contentDispositionArg"

    .line 28
    .line 29
    invoke-static {v6, v7}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v7, p0, Lv0/m;->i:Ljava/lang/String;

    .line 33
    .line 34
    const-string v8, "mimetypeArg"

    .line 35
    .line 36
    invoke-static {v7, v8}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object v3, v3, Lv0/i;->a:Lv/d;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Lv/d;->a()Lq0/j;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    new-instance v9, LG/n;

    .line 49
    .line 50
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart"

    .line 51
    .line 52
    const/4 v11, 0x0

    .line 53
    iget-object v3, v3, Lv/d;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v3, Lq0/f;

    .line 56
    .line 57
    invoke-direct {v9, v3, v10, v8, v11}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-wide v10, p0, Lv0/m;->j:J

    .line 61
    .line 62
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    const/4 v8, 0x6

    .line 67
    new-array v8, v8, [Ljava/lang/Object;

    .line 68
    .line 69
    aput-object v2, v8, v0

    .line 70
    .line 71
    const/4 v0, 0x1

    .line 72
    aput-object v4, v8, v0

    .line 73
    .line 74
    const/4 v0, 0x2

    .line 75
    aput-object v5, v8, v0

    .line 76
    .line 77
    const/4 v0, 0x3

    .line 78
    aput-object v6, v8, v0

    .line 79
    .line 80
    const/4 v0, 0x4

    .line 81
    aput-object v7, v8, v0

    .line 82
    .line 83
    const/4 v0, 0x5

    .line 84
    aput-object v3, v8, v0

    .line 85
    .line 86
    invoke-static {v8}, Ly0/e;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    new-instance v2, Lv0/x;

    .line 91
    .line 92
    const/16 v3, 0x9

    .line 93
    .line 94
    invoke-direct {v2, v3, v1}, Lv0/x;-><init>(ILjava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v9, v0, v2}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method
