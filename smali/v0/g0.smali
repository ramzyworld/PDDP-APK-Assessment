.class public final synthetic Lv0/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lv0/h0;

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Lv0/h0;IIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv0/g0;->e:Lv0/h0;

    iput p2, p0, Lv0/g0;->f:I

    iput p3, p0, Lv0/g0;->g:I

    iput p4, p0, Lv0/g0;->h:I

    iput p5, p0, Lv0/g0;->i:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    iget v2, v0, Lv0/g0;->f:I

    .line 5
    .line 6
    int-to-long v2, v2

    .line 7
    iget v4, v0, Lv0/g0;->g:I

    .line 8
    .line 9
    int-to-long v4, v4

    .line 10
    iget v6, v0, Lv0/g0;->h:I

    .line 11
    .line 12
    int-to-long v6, v6

    .line 13
    iget v8, v0, Lv0/g0;->i:I

    .line 14
    .line 15
    int-to-long v8, v8

    .line 16
    new-instance v10, Lv0/n;

    .line 17
    .line 18
    invoke-direct {v10, v1}, Lv0/n;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iget-object v11, v0, Lv0/g0;->e:Lv0/h0;

    .line 22
    .line 23
    iget-object v12, v11, Lv0/h0;->e:Lv0/i;

    .line 24
    .line 25
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v12, v12, Lv0/i;->a:Lv/d;

    .line 29
    .line 30
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v12}, Lv/d;->a()Lq0/j;

    .line 34
    .line 35
    .line 36
    move-result-object v13

    .line 37
    new-instance v14, LG/n;

    .line 38
    .line 39
    const-string v15, "dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged"

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    iget-object v12, v12, Lv/d;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v12, Lq0/f;

    .line 45
    .line 46
    invoke-direct {v14, v12, v15, v13, v1}, LG/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    const/4 v5, 0x5

    .line 66
    new-array v5, v5, [Ljava/lang/Object;

    .line 67
    .line 68
    const/4 v6, 0x0

    .line 69
    aput-object v11, v5, v6

    .line 70
    .line 71
    const/4 v6, 0x1

    .line 72
    aput-object v1, v5, v6

    .line 73
    .line 74
    const/4 v1, 0x2

    .line 75
    aput-object v2, v5, v1

    .line 76
    .line 77
    const/4 v1, 0x3

    .line 78
    aput-object v3, v5, v1

    .line 79
    .line 80
    const/4 v1, 0x4

    .line 81
    aput-object v4, v5, v1

    .line 82
    .line 83
    invoke-static {v5}, Ly0/e;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    new-instance v2, Lv0/H;

    .line 88
    .line 89
    const/16 v3, 0xe

    .line 90
    .line 91
    invoke-direct {v2, v3, v10}, Lv0/H;-><init>(ILjava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v14, v1, v2}, LG/n;->f(Ljava/lang/Object;Lq0/c;)V

    .line 95
    .line 96
    .line 97
    return-void
.end method
