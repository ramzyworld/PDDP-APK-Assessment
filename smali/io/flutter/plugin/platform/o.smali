.class public final Lio/flutter/plugin/platform/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final w:[Ljava/lang/Class;


# instance fields
.field public final a:Lio/flutter/plugin/platform/n;

.field public b:Lg0/a;

.field public c:Landroid/app/Activity;

.field public d:Lg0/q;

.field public e:Lio/flutter/embedding/engine/renderer/l;

.field public f:Lio/flutter/plugin/editing/j;

.field public g:LN/Q;

.field public final h:Lio/flutter/plugin/platform/a;

.field public final i:Ljava/util/HashMap;

.field public final j:Ljava/util/HashMap;

.field public final k:Landroid/util/SparseArray;

.field public final l:Landroid/util/SparseArray;

.field public final m:Landroid/util/SparseArray;

.field public final n:Landroid/util/SparseArray;

.field public o:I

.field public p:Z

.field public q:Z

.field public final r:Ljava/util/HashSet;

.field public final s:Ljava/util/HashSet;

.field public final t:LN/Q;

.field public u:Z

.field public final v:Lio/flutter/plugin/platform/n;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [Ljava/lang/Class;

    .line 3
    .line 4
    const-class v1, Landroid/view/SurfaceView;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sput-object v0, Lio/flutter/plugin/platform/o;->w:[Ljava/lang/Class;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lio/flutter/plugin/platform/o;->o:I

    .line 6
    .line 7
    iput-boolean v0, p0, Lio/flutter/plugin/platform/o;->p:Z

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iput-boolean v1, p0, Lio/flutter/plugin/platform/o;->q:Z

    .line 11
    .line 12
    iput-boolean v0, p0, Lio/flutter/plugin/platform/o;->u:Z

    .line 13
    .line 14
    new-instance v0, Lio/flutter/plugin/platform/n;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lio/flutter/plugin/platform/n;-><init>(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lio/flutter/plugin/platform/o;->v:Lio/flutter/plugin/platform/n;

    .line 20
    .line 21
    new-instance v0, Lio/flutter/plugin/platform/n;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v1, Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v1, v0, Lio/flutter/plugin/platform/n;->a:Ljava/lang/Object;

    .line 32
    .line 33
    iput-object v0, p0, Lio/flutter/plugin/platform/o;->a:Lio/flutter/plugin/platform/n;

    .line 34
    .line 35
    new-instance v0, Ljava/util/HashMap;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lio/flutter/plugin/platform/o;->i:Ljava/util/HashMap;

    .line 41
    .line 42
    new-instance v0, Lio/flutter/plugin/platform/a;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lio/flutter/plugin/platform/o;->h:Lio/flutter/plugin/platform/a;

    .line 48
    .line 49
    new-instance v0, Ljava/util/HashMap;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object v0, p0, Lio/flutter/plugin/platform/o;->j:Ljava/util/HashMap;

    .line 55
    .line 56
    new-instance v0, Landroid/util/SparseArray;

    .line 57
    .line 58
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, Lio/flutter/plugin/platform/o;->m:Landroid/util/SparseArray;

    .line 62
    .line 63
    new-instance v0, Ljava/util/HashSet;

    .line 64
    .line 65
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 66
    .line 67
    .line 68
    iput-object v0, p0, Lio/flutter/plugin/platform/o;->r:Ljava/util/HashSet;

    .line 69
    .line 70
    new-instance v0, Ljava/util/HashSet;

    .line 71
    .line 72
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, Lio/flutter/plugin/platform/o;->s:Ljava/util/HashSet;

    .line 76
    .line 77
    new-instance v0, Landroid/util/SparseArray;

    .line 78
    .line 79
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 80
    .line 81
    .line 82
    iput-object v0, p0, Lio/flutter/plugin/platform/o;->n:Landroid/util/SparseArray;

    .line 83
    .line 84
    new-instance v0, Landroid/util/SparseArray;

    .line 85
    .line 86
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, Lio/flutter/plugin/platform/o;->k:Landroid/util/SparseArray;

    .line 90
    .line 91
    new-instance v0, Landroid/util/SparseArray;

    .line 92
    .line 93
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 94
    .line 95
    .line 96
    iput-object v0, p0, Lio/flutter/plugin/platform/o;->l:Landroid/util/SparseArray;

    .line 97
    .line 98
    sget-object v0, LN/Q;->h:LN/Q;

    .line 99
    .line 100
    if-nez v0, :cond_0

    .line 101
    .line 102
    new-instance v0, LN/Q;

    .line 103
    .line 104
    const/16 v1, 0x9

    .line 105
    .line 106
    invoke-direct {v0, v1}, LN/Q;-><init>(I)V

    .line 107
    .line 108
    .line 109
    sput-object v0, LN/Q;->h:LN/Q;

    .line 110
    .line 111
    :cond_0
    sget-object v0, LN/Q;->h:LN/Q;

    .line 112
    .line 113
    iput-object v0, p0, Lio/flutter/plugin/platform/o;->t:LN/Q;

    .line 114
    .line 115
    return-void
.end method

.method public static a(Lio/flutter/plugin/platform/o;Lp0/h;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget p0, p1, Lp0/h;->g:I

    .line 5
    .line 6
    if-eqz p0, :cond_1

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    if-ne p0, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v2, "Trying to create a view with unknown direction value: "

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p0, "(view id: "

    .line 25
    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget p0, p1, Lp0/h;->a:I

    .line 30
    .line 31
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p0, ")"

    .line 35
    .line 36
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v0

    .line 47
    :cond_1
    :goto_0
    return-void
.end method

.method public static d(I)V
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    if-lt v0, p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    new-instance v2, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v3, "Trying to use platform views with API "

    .line 11
    .line 12
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v0, ", required API level is: "

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-direct {v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v1
.end method

.method public static i(Lio/flutter/embedding/engine/renderer/l;)Lio/flutter/plugin/platform/h;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lio/flutter/embedding/engine/renderer/l;->c()Lio/flutter/view/TextureRegistry$SurfaceProducer;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance v0, Lio/flutter/plugin/platform/n;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p0, v0, Lio/flutter/plugin/platform/n;->a:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    if-lt v0, v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Lio/flutter/embedding/engine/renderer/l;->b()Lio/flutter/view/TextureRegistry$ImageTextureEntry;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    new-instance v0, LN/D;

    .line 26
    .line 27
    invoke-direct {v0, p0}, LN/D;-><init>(Lio/flutter/view/TextureRegistry$ImageTextureEntry;)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_1
    invoke-virtual {p0}, Lio/flutter/embedding/engine/renderer/l;->d()Lio/flutter/embedding/engine/renderer/i;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    new-instance v0, Lio/flutter/plugin/platform/v;

    .line 36
    .line 37
    invoke-direct {v0, p0}, Lio/flutter/plugin/platform/v;-><init>(Lio/flutter/embedding/engine/renderer/i;)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method


# virtual methods
.method public final b(Lp0/h;Z)Lio/flutter/plugin/platform/g;
    .locals 4

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/o;->a:Lio/flutter/plugin/platform/n;

    .line 2
    .line 3
    iget-object v0, v0, Lio/flutter/plugin/platform/n;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/HashMap;

    .line 6
    .line 7
    iget-object v1, p1, Lp0/h;->b:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lv0/s;

    .line 14
    .line 15
    if-eqz v0, :cond_6

    .line 16
    .line 17
    iget-object v1, p1, Lp0/h;->i:Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iget-object v2, v0, Lv0/s;->a:Lq0/n;

    .line 22
    .line 23
    invoke-virtual {v2, v1}, Lq0/n;->a(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x0

    .line 29
    :goto_0
    if-eqz p2, :cond_1

    .line 30
    .line 31
    new-instance p2, Landroid/content/MutableContextWrapper;

    .line 32
    .line 33
    iget-object v2, p0, Lio/flutter/plugin/platform/o;->c:Landroid/app/Activity;

    .line 34
    .line 35
    invoke-direct {p2, v2}, Landroid/content/MutableContextWrapper;-><init>(Landroid/content/Context;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    move-object p2, v1

    .line 39
    check-cast p2, Ljava/lang/Integer;

    .line 40
    .line 41
    if-eqz p2, :cond_5

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    int-to-long v2, p2

    .line 48
    iget-object p2, v0, Lv0/s;->b:Lv0/c;

    .line 49
    .line 50
    invoke-virtual {p2, v2, v3}, Lv0/c;->e(J)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    instance-of v0, p2, Lio/flutter/plugin/platform/g;

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    check-cast p2, Lio/flutter/plugin/platform/g;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    instance-of v0, p2, Landroid/view/View;

    .line 62
    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    new-instance v0, Lv0/r;

    .line 66
    .line 67
    check-cast p2, Landroid/view/View;

    .line 68
    .line 69
    invoke-direct {v0, p2}, Lv0/r;-><init>(Landroid/view/View;)V

    .line 70
    .line 71
    .line 72
    move-object p2, v0

    .line 73
    :goto_1
    invoke-interface {p2}, Lio/flutter/plugin/platform/g;->getView()Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    iget v1, p1, Lp0/h;->g:I

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutDirection(I)V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Lio/flutter/plugin/platform/o;->k:Landroid/util/SparseArray;

    .line 85
    .line 86
    iget p1, p1, Lp0/h;->a:I

    .line 87
    .line 88
    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-object p2

    .line 92
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 93
    .line 94
    const-string p2, "PlatformView#getView() returned null, but an Android view reference was expected."

    .line 95
    .line 96
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw p1

    .line 100
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 101
    .line 102
    new-instance v0, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v2, "Unable to find a PlatformView or View instance: "

    .line 105
    .line 106
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v1, ", "

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p1

    .line 128
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 129
    .line 130
    const-string p2, "An identifier is required to retrieve a View instance."

    .line 131
    .line 132
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw p1

    .line 136
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 137
    .line 138
    new-instance p2, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    const-string v0, "Trying to create a platform view of unregistered type: "

    .line 141
    .line 142
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw p1
.end method

.method public final c()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lio/flutter/plugin/platform/o;->m:Landroid/util/SparseArray;

    .line 3
    .line 4
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-ge v0, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lio/flutter/plugin/platform/c;

    .line 15
    .line 16
    invoke-virtual {v1}, Lg0/i;->c()V

    .line 17
    .line 18
    .line 19
    iget-object v1, v1, Lg0/i;->e:Landroid/media/ImageReader;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/media/ImageReader;->close()V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public final e(Z)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    iget-object v2, p0, Lio/flutter/plugin/platform/o;->m:Landroid/util/SparseArray;

    .line 4
    .line 5
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    const/16 v4, 0x8

    .line 10
    .line 11
    if-ge v1, v3, :cond_3

    .line 12
    .line 13
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lio/flutter/plugin/platform/c;

    .line 22
    .line 23
    iget-object v5, p0, Lio/flutter/plugin/platform/o;->r:Ljava/util/HashSet;

    .line 24
    .line 25
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v5, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    iget-object v3, p0, Lio/flutter/plugin/platform/o;->d:Lg0/q;

    .line 36
    .line 37
    iget-object v3, v3, Lg0/q;->l:Lh0/c;

    .line 38
    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    iget-object v3, v3, Lh0/c;->b:Lio/flutter/embedding/engine/renderer/l;

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Lg0/i;->a(Lio/flutter/embedding/engine/renderer/l;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-virtual {v2}, Lg0/i;->e()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    and-int/2addr p1, v2

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    iget-boolean v3, p0, Lio/flutter/plugin/platform/o;->p:Z

    .line 53
    .line 54
    if-nez v3, :cond_2

    .line 55
    .line 56
    invoke-virtual {v2}, Lg0/i;->c()V

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 60
    .line 61
    .line 62
    iget-object v3, p0, Lio/flutter/plugin/platform/o;->d:Lg0/q;

    .line 63
    .line 64
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 65
    .line 66
    .line 67
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    const/4 v1, 0x0

    .line 71
    :goto_2
    iget-object v2, p0, Lio/flutter/plugin/platform/o;->l:Landroid/util/SparseArray;

    .line 72
    .line 73
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-ge v1, v3, :cond_6

    .line 78
    .line 79
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    invoke-virtual {v2, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, Landroid/view/View;

    .line 88
    .line 89
    iget-object v5, p0, Lio/flutter/plugin/platform/o;->s:Ljava/util/HashSet;

    .line 90
    .line 91
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v5, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_5

    .line 100
    .line 101
    if-nez p1, :cond_4

    .line 102
    .line 103
    iget-boolean v3, p0, Lio/flutter/plugin/platform/o;->q:Z

    .line 104
    .line 105
    if-nez v3, :cond_5

    .line 106
    .line 107
    :cond_4
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 108
    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_5
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 112
    .line 113
    .line 114
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_6
    return-void
.end method

.method public final f()F
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/o;->c:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 12
    .line 13
    return v0
.end method

.method public final g(I)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lio/flutter/plugin/platform/o;->m(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lio/flutter/plugin/platform/o;->i:Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lio/flutter/plugin/platform/z;

    .line 18
    .line 19
    invoke-virtual {p1}, Lio/flutter/plugin/platform/z;->a()Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/platform/o;->k:Landroid/util/SparseArray;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lio/flutter/plugin/platform/g;

    .line 31
    .line 32
    if-nez p1, :cond_1

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    return-object p1

    .line 36
    :cond_1
    invoke-interface {p1}, Lio/flutter/plugin/platform/g;->getView()Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1
.end method

.method public final h()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lio/flutter/plugin/platform/o;->q:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-boolean v0, p0, Lio/flutter/plugin/platform/o;->p:Z

    .line 6
    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lio/flutter/plugin/platform/o;->d:Lg0/q;

    .line 10
    .line 11
    iget-object v1, v0, Lg0/q;->h:Landroid/view/View;

    .line 12
    .line 13
    invoke-interface {v1}, Lio/flutter/embedding/engine/renderer/n;->b()V

    .line 14
    .line 15
    .line 16
    iget-object v1, v0, Lg0/q;->g:Lg0/i;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    new-instance v1, Lg0/i;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    invoke-direct {v1, v3, v4, v5, v2}, Lg0/i;-><init>(Landroid/content/Context;III)V

    .line 36
    .line 37
    .line 38
    iput-object v1, v0, Lg0/q;->g:Lg0/i;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    invoke-virtual {v1, v3, v4}, Lg0/i;->g(II)V

    .line 53
    .line 54
    .line 55
    :goto_0
    iget-object v1, v0, Lg0/q;->h:Landroid/view/View;

    .line 56
    .line 57
    iput-object v1, v0, Lg0/q;->i:Landroid/view/View;

    .line 58
    .line 59
    iget-object v1, v0, Lg0/q;->g:Lg0/i;

    .line 60
    .line 61
    iput-object v1, v0, Lg0/q;->h:Landroid/view/View;

    .line 62
    .line 63
    iget-object v0, v0, Lg0/q;->l:Lh0/c;

    .line 64
    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    iget-object v0, v0, Lh0/c;->b:Lio/flutter/embedding/engine/renderer/l;

    .line 68
    .line 69
    invoke-virtual {v1, v0}, Lg0/i;->a(Lio/flutter/embedding/engine/renderer/l;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    iput-boolean v2, p0, Lio/flutter/plugin/platform/o;->p:Z

    .line 73
    .line 74
    :cond_2
    return-void
.end method

.method public final j()V
    .locals 14

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/o;->i:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lio/flutter/plugin/platform/z;

    .line 22
    .line 23
    iget-object v2, v1, Lio/flutter/plugin/platform/z;->f:Lio/flutter/plugin/platform/h;

    .line 24
    .line 25
    invoke-interface {v2}, Lio/flutter/plugin/platform/h;->getWidth()I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    iget-object v2, v1, Lio/flutter/plugin/platform/z;->f:Lio/flutter/plugin/platform/h;

    .line 30
    .line 31
    invoke-interface {v2}, Lio/flutter/plugin/platform/h;->getHeight()I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-virtual {v1}, Lio/flutter/plugin/platform/z;->a()Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v3}, Landroid/view/View;->isFocused()Z

    .line 40
    .line 41
    .line 42
    move-result v13

    .line 43
    iget-object v3, v1, Lio/flutter/plugin/platform/z;->a:Lio/flutter/plugin/platform/SingleViewPresentation;

    .line 44
    .line 45
    invoke-virtual {v3}, Lio/flutter/plugin/platform/SingleViewPresentation;->detachState()Lio/flutter/plugin/platform/t;

    .line 46
    .line 47
    .line 48
    move-result-object v12

    .line 49
    iget-object v3, v1, Lio/flutter/plugin/platform/z;->h:Landroid/hardware/display/VirtualDisplay;

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-virtual {v3, v4}, Landroid/hardware/display/VirtualDisplay;->setSurface(Landroid/view/Surface;)V

    .line 53
    .line 54
    .line 55
    iget-object v3, v1, Lio/flutter/plugin/platform/z;->h:Landroid/hardware/display/VirtualDisplay;

    .line 56
    .line 57
    invoke-virtual {v3}, Landroid/hardware/display/VirtualDisplay;->release()V

    .line 58
    .line 59
    .line 60
    iget-object v3, v1, Lio/flutter/plugin/platform/z;->b:Landroid/app/Activity;

    .line 61
    .line 62
    const-string v4, "display"

    .line 63
    .line 64
    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    check-cast v3, Landroid/hardware/display/DisplayManager;

    .line 69
    .line 70
    new-instance v4, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    const-string v7, "flutter-vd#"

    .line 73
    .line 74
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iget v7, v1, Lio/flutter/plugin/platform/z;->e:I

    .line 78
    .line 79
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-interface {v2}, Lio/flutter/plugin/platform/h;->getSurface()Landroid/view/Surface;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    sget-object v10, Lio/flutter/plugin/platform/z;->i:Lio/flutter/plugin/platform/w;

    .line 91
    .line 92
    const/4 v9, 0x0

    .line 93
    const/4 v11, 0x0

    .line 94
    iget v7, v1, Lio/flutter/plugin/platform/z;->d:I

    .line 95
    .line 96
    invoke-virtual/range {v3 .. v11}, Landroid/hardware/display/DisplayManager;->createVirtualDisplay(Ljava/lang/String;IIILandroid/view/Surface;ILandroid/hardware/display/VirtualDisplay$Callback;Landroid/os/Handler;)Landroid/hardware/display/VirtualDisplay;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    iput-object v2, v1, Lio/flutter/plugin/platform/z;->h:Landroid/hardware/display/VirtualDisplay;

    .line 101
    .line 102
    new-instance v2, Lio/flutter/plugin/platform/SingleViewPresentation;

    .line 103
    .line 104
    iget-object v3, v1, Lio/flutter/plugin/platform/z;->h:Landroid/hardware/display/VirtualDisplay;

    .line 105
    .line 106
    invoke-virtual {v3}, Landroid/hardware/display/VirtualDisplay;->getDisplay()Landroid/view/Display;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    iget-object v3, v1, Lio/flutter/plugin/platform/z;->g:Lio/flutter/plugin/platform/l;

    .line 111
    .line 112
    iget-object v8, v1, Lio/flutter/plugin/platform/z;->b:Landroid/app/Activity;

    .line 113
    .line 114
    iget-object v10, v1, Lio/flutter/plugin/platform/z;->c:Lio/flutter/plugin/platform/a;

    .line 115
    .line 116
    move-object v7, v2

    .line 117
    move-object v11, v12

    .line 118
    move-object v12, v3

    .line 119
    invoke-direct/range {v7 .. v13}, Lio/flutter/plugin/platform/SingleViewPresentation;-><init>(Landroid/content/Context;Landroid/view/Display;Lio/flutter/plugin/platform/a;Lio/flutter/plugin/platform/t;Landroid/view/View$OnFocusChangeListener;Z)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    .line 123
    .line 124
    .line 125
    iget-object v3, v1, Lio/flutter/plugin/platform/z;->a:Lio/flutter/plugin/platform/SingleViewPresentation;

    .line 126
    .line 127
    invoke-virtual {v3}, Landroid/app/Dialog;->cancel()V

    .line 128
    .line 129
    .line 130
    iput-object v2, v1, Lio/flutter/plugin/platform/z;->a:Lio/flutter/plugin/platform/SingleViewPresentation;

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_0
    return-void
.end method

.method public final k(FLp0/j;Z)Landroid/view/MotionEvent;
    .locals 24

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    new-instance v1, Lg0/I;

    .line 4
    .line 5
    iget-wide v2, v0, Lp0/j;->p:J

    .line 6
    .line 7
    invoke-direct {v1, v2, v3}, Lg0/I;-><init>(J)V

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p0

    .line 11
    .line 12
    :goto_0
    iget-object v3, v2, Lio/flutter/plugin/platform/o;->t:LN/Q;

    .line 13
    .line 14
    iget-object v4, v3, LN/Q;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v4, Ljava/util/PriorityQueue;

    .line 17
    .line 18
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    iget-object v3, v3, LN/Q;->f:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Landroid/util/LongSparseArray;

    .line 25
    .line 26
    iget-wide v6, v1, Lg0/I;->a:J

    .line 27
    .line 28
    if-nez v5, :cond_0

    .line 29
    .line 30
    invoke-virtual {v4}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    check-cast v5, Ljava/lang/Long;

    .line 35
    .line 36
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 37
    .line 38
    .line 39
    move-result-wide v8

    .line 40
    cmp-long v5, v8, v6

    .line 41
    .line 42
    if-gez v5, :cond_0

    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, Ljava/lang/Long;

    .line 49
    .line 50
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 51
    .line 52
    .line 53
    move-result-wide v4

    .line 54
    invoke-virtual {v3, v4, v5}, Landroid/util/LongSparseArray;->remove(J)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_1

    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Ljava/lang/Long;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 71
    .line 72
    .line 73
    move-result-wide v8

    .line 74
    cmp-long v1, v8, v6

    .line 75
    .line 76
    if-nez v1, :cond_1

    .line 77
    .line 78
    invoke-virtual {v4}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    :cond_1
    invoke-virtual {v3, v6, v7}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    check-cast v1, Landroid/view/MotionEvent;

    .line 86
    .line 87
    invoke-virtual {v3, v6, v7}, Landroid/util/LongSparseArray;->remove(J)V

    .line 88
    .line 89
    .line 90
    iget-object v3, v0, Lp0/j;->g:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v3, Ljava/util/List;

    .line 93
    .line 94
    new-instance v4, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    const/4 v6, 0x1

    .line 108
    const/4 v7, 0x0

    .line 109
    if-eqz v5, :cond_2

    .line 110
    .line 111
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    check-cast v5, Ljava/util/List;

    .line 116
    .line 117
    new-instance v8, Landroid/view/MotionEvent$PointerCoords;

    .line 118
    .line 119
    invoke-direct {v8}, Landroid/view/MotionEvent$PointerCoords;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    check-cast v7, Ljava/lang/Double;

    .line 127
    .line 128
    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    .line 129
    .line 130
    .line 131
    move-result-wide v9

    .line 132
    double-to-float v7, v9

    .line 133
    iput v7, v8, Landroid/view/MotionEvent$PointerCoords;->orientation:F

    .line 134
    .line 135
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    check-cast v6, Ljava/lang/Double;

    .line 140
    .line 141
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 142
    .line 143
    .line 144
    move-result-wide v6

    .line 145
    double-to-float v6, v6

    .line 146
    iput v6, v8, Landroid/view/MotionEvent$PointerCoords;->pressure:F

    .line 147
    .line 148
    const/4 v6, 0x2

    .line 149
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    check-cast v6, Ljava/lang/Double;

    .line 154
    .line 155
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 156
    .line 157
    .line 158
    move-result-wide v6

    .line 159
    double-to-float v6, v6

    .line 160
    iput v6, v8, Landroid/view/MotionEvent$PointerCoords;->size:F

    .line 161
    .line 162
    const/4 v6, 0x3

    .line 163
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    check-cast v6, Ljava/lang/Double;

    .line 168
    .line 169
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 170
    .line 171
    .line 172
    move-result-wide v6

    .line 173
    move/from16 v9, p1

    .line 174
    .line 175
    float-to-double v10, v9

    .line 176
    mul-double v6, v6, v10

    .line 177
    .line 178
    double-to-float v6, v6

    .line 179
    iput v6, v8, Landroid/view/MotionEvent$PointerCoords;->toolMajor:F

    .line 180
    .line 181
    const/4 v6, 0x4

    .line 182
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    check-cast v6, Ljava/lang/Double;

    .line 187
    .line 188
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 189
    .line 190
    .line 191
    move-result-wide v6

    .line 192
    mul-double v6, v6, v10

    .line 193
    .line 194
    double-to-float v6, v6

    .line 195
    iput v6, v8, Landroid/view/MotionEvent$PointerCoords;->toolMinor:F

    .line 196
    .line 197
    const/4 v6, 0x5

    .line 198
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    check-cast v6, Ljava/lang/Double;

    .line 203
    .line 204
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 205
    .line 206
    .line 207
    move-result-wide v6

    .line 208
    mul-double v6, v6, v10

    .line 209
    .line 210
    double-to-float v6, v6

    .line 211
    iput v6, v8, Landroid/view/MotionEvent$PointerCoords;->touchMajor:F

    .line 212
    .line 213
    const/4 v6, 0x6

    .line 214
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    check-cast v6, Ljava/lang/Double;

    .line 219
    .line 220
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 221
    .line 222
    .line 223
    move-result-wide v6

    .line 224
    mul-double v6, v6, v10

    .line 225
    .line 226
    double-to-float v6, v6

    .line 227
    iput v6, v8, Landroid/view/MotionEvent$PointerCoords;->touchMinor:F

    .line 228
    .line 229
    const/4 v6, 0x7

    .line 230
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v6

    .line 234
    check-cast v6, Ljava/lang/Double;

    .line 235
    .line 236
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 237
    .line 238
    .line 239
    move-result-wide v6

    .line 240
    mul-double v6, v6, v10

    .line 241
    .line 242
    double-to-float v6, v6

    .line 243
    iput v6, v8, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 244
    .line 245
    const/16 v6, 0x8

    .line 246
    .line 247
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    check-cast v5, Ljava/lang/Double;

    .line 252
    .line 253
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 254
    .line 255
    .line 256
    move-result-wide v5

    .line 257
    mul-double v5, v5, v10

    .line 258
    .line 259
    double-to-float v5, v5

    .line 260
    iput v5, v8, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 261
    .line 262
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    goto/16 :goto_1

    .line 266
    .line 267
    :cond_2
    iget v3, v0, Lp0/j;->e:I

    .line 268
    .line 269
    new-array v5, v3, [Landroid/view/MotionEvent$PointerCoords;

    .line 270
    .line 271
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    move-object v15, v4

    .line 276
    check-cast v15, [Landroid/view/MotionEvent$PointerCoords;

    .line 277
    .line 278
    if-nez p3, :cond_4

    .line 279
    .line 280
    if-eqz v1, :cond_4

    .line 281
    .line 282
    array-length v0, v15

    .line 283
    if-ge v0, v6, :cond_3

    .line 284
    .line 285
    goto :goto_2

    .line 286
    :cond_3
    aget-object v0, v15, v7

    .line 287
    .line 288
    iget v0, v0, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 289
    .line 290
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    sub-float/2addr v0, v3

    .line 295
    aget-object v3, v15, v7

    .line 296
    .line 297
    iget v3, v3, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 298
    .line 299
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 300
    .line 301
    .line 302
    move-result v4

    .line 303
    sub-float/2addr v3, v4

    .line 304
    invoke-virtual {v1, v0, v3}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 305
    .line 306
    .line 307
    :goto_2
    return-object v1

    .line 308
    :cond_4
    iget-object v1, v0, Lp0/j;->f:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v1, Ljava/util/List;

    .line 311
    .line 312
    new-instance v4, Ljava/util/ArrayList;

    .line 313
    .line 314
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 315
    .line 316
    .line 317
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 322
    .line 323
    .line 324
    move-result v5

    .line 325
    if-eqz v5, :cond_5

    .line 326
    .line 327
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v5

    .line 331
    check-cast v5, Ljava/util/List;

    .line 332
    .line 333
    new-instance v8, Landroid/view/MotionEvent$PointerProperties;

    .line 334
    .line 335
    invoke-direct {v8}, Landroid/view/MotionEvent$PointerProperties;-><init>()V

    .line 336
    .line 337
    .line 338
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v9

    .line 342
    check-cast v9, Ljava/lang/Integer;

    .line 343
    .line 344
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 345
    .line 346
    .line 347
    move-result v9

    .line 348
    iput v9, v8, Landroid/view/MotionEvent$PointerProperties;->id:I

    .line 349
    .line 350
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v5

    .line 354
    check-cast v5, Ljava/lang/Integer;

    .line 355
    .line 356
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 357
    .line 358
    .line 359
    move-result v5

    .line 360
    iput v5, v8, Landroid/view/MotionEvent$PointerProperties;->toolType:I

    .line 361
    .line 362
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    goto :goto_3

    .line 366
    :cond_5
    new-array v1, v3, [Landroid/view/MotionEvent$PointerProperties;

    .line 367
    .line 368
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    move-object v14, v1

    .line 373
    check-cast v14, [Landroid/view/MotionEvent$PointerProperties;

    .line 374
    .line 375
    iget-object v1, v0, Lp0/j;->b:Ljava/lang/Number;

    .line 376
    .line 377
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 378
    .line 379
    .line 380
    move-result-wide v8

    .line 381
    iget-object v1, v0, Lp0/j;->c:Ljava/lang/Number;

    .line 382
    .line 383
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 384
    .line 385
    .line 386
    move-result-wide v10

    .line 387
    iget v1, v0, Lp0/j;->l:I

    .line 388
    .line 389
    iget v3, v0, Lp0/j;->m:I

    .line 390
    .line 391
    iget v12, v0, Lp0/j;->d:I

    .line 392
    .line 393
    iget v13, v0, Lp0/j;->e:I

    .line 394
    .line 395
    iget v4, v0, Lp0/j;->h:I

    .line 396
    .line 397
    iget v5, v0, Lp0/j;->i:I

    .line 398
    .line 399
    iget v6, v0, Lp0/j;->j:F

    .line 400
    .line 401
    iget v7, v0, Lp0/j;->k:F

    .line 402
    .line 403
    iget v2, v0, Lp0/j;->n:I

    .line 404
    .line 405
    iget v0, v0, Lp0/j;->o:I

    .line 406
    .line 407
    move/from16 v16, v4

    .line 408
    .line 409
    move/from16 v17, v5

    .line 410
    .line 411
    move/from16 v18, v6

    .line 412
    .line 413
    move/from16 v19, v7

    .line 414
    .line 415
    move/from16 v20, v1

    .line 416
    .line 417
    move/from16 v21, v3

    .line 418
    .line 419
    move/from16 v22, v2

    .line 420
    .line 421
    move/from16 v23, v0

    .line 422
    .line 423
    invoke-static/range {v8 .. v23}, Landroid/view/MotionEvent;->obtain(JJII[Landroid/view/MotionEvent$PointerProperties;[Landroid/view/MotionEvent$PointerCoords;IIFFIIII)Landroid/view/MotionEvent;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    return-object v0
.end method

.method public final l(D)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lio/flutter/plugin/platform/o;->f()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    float-to-double v0, v0

    .line 6
    mul-double p1, p1, v0

    .line 7
    .line 8
    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    .line 9
    .line 10
    .line 11
    move-result-wide p1

    .line 12
    long-to-int p2, p1

    .line 13
    return p2
.end method

.method public final m(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/o;->i:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method
