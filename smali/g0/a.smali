.class public final Lg0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:Landroid/graphics/Matrix;


# instance fields
.field public final a:Lio/flutter/embedding/engine/renderer/l;

.field public final b:LN/Q;

.field public final c:Z

.field public final d:Ljava/util/HashMap;

.field public e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lg0/a;->f:Landroid/graphics/Matrix;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lio/flutter/embedding/engine/renderer/l;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lg0/a;->d:Ljava/util/HashMap;

    .line 10
    .line 11
    iput-object p1, p0, Lg0/a;->a:Lio/flutter/embedding/engine/renderer/l;

    .line 12
    .line 13
    sget-object p1, LN/Q;->h:LN/Q;

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    new-instance p1, LN/Q;

    .line 18
    .line 19
    const/16 v0, 0x9

    .line 20
    .line 21
    invoke-direct {p1, v0}, LN/Q;-><init>(I)V

    .line 22
    .line 23
    .line 24
    sput-object p1, LN/Q;->h:LN/Q;

    .line 25
    .line 26
    :cond_0
    sget-object p1, LN/Q;->h:LN/Q;

    .line 27
    .line 28
    iput-object p1, p0, Lg0/a;->b:LN/Q;

    .line 29
    .line 30
    iput-boolean p2, p0, Lg0/a;->c:Z

    .line 31
    .line 32
    return-void
.end method

.method public static b(I)I
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x6

    .line 7
    if-ne p0, v1, :cond_1

    .line 8
    .line 9
    return v2

    .line 10
    :cond_1
    const/4 v1, 0x5

    .line 11
    if-ne p0, v1, :cond_2

    .line 12
    .line 13
    return v0

    .line 14
    :cond_2
    if-ne p0, v2, :cond_3

    .line 15
    .line 16
    return v2

    .line 17
    :cond_3
    const/4 v0, 0x2

    .line 18
    if-ne p0, v0, :cond_4

    .line 19
    .line 20
    return v1

    .line 21
    :cond_4
    const/4 v0, 0x7

    .line 22
    const/4 v1, 0x3

    .line 23
    if-ne p0, v0, :cond_5

    .line 24
    .line 25
    return v1

    .line 26
    :cond_5
    if-ne p0, v1, :cond_6

    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return p0

    .line 30
    :cond_6
    const/16 v0, 0x8

    .line 31
    .line 32
    if-ne p0, v0, :cond_7

    .line 33
    .line 34
    return v1

    .line 35
    :cond_7
    const/4 p0, -0x1

    .line 36
    return p0
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;Landroid/content/Context;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    const/4 v6, 0x1

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v9, -0x1

    if-ne v3, v9, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v10

    .line 2
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v11

    const/4 v13, 0x4

    if-eq v11, v6, :cond_3

    if-eq v11, v7, :cond_2

    const/4 v14, 0x3

    if-eq v11, v14, :cond_1

    if-eq v11, v13, :cond_4

    const/4 v14, 0x5

    goto :goto_0

    :cond_1
    const/4 v14, 0x1

    goto :goto_0

    :cond_2
    const/4 v14, 0x2

    goto :goto_0

    :cond_3
    const/4 v14, 0x0

    .line 3
    :cond_4
    :goto_0
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v11

    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v15

    new-array v9, v7, [F

    aput v11, v9, v8

    aput v15, v9, v6

    move-object/from16 v11, p5

    .line 4
    invoke-virtual {v11, v9}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 5
    iget-object v11, v0, Lg0/a;->d:Ljava/util/HashMap;

    const-wide/16 v7, 0x0

    if-ne v14, v6, :cond_6

    .line 6
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v16

    and-int/lit8 v15, v16, 0x1f

    int-to-long v12, v15

    cmp-long v15, v12, v7

    if-nez v15, :cond_5

    .line 7
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v15

    const/16 v6, 0x2002

    if-ne v15, v6, :cond_5

    const/4 v6, 0x4

    if-ne v3, v6, :cond_8

    .line 8
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-virtual {v11, v15, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_5
    const/4 v6, 0x4

    goto :goto_1

    :cond_6
    const/4 v6, 0x4

    const/4 v12, 0x2

    if-ne v14, v12, :cond_7

    .line 9
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v12

    shr-int/2addr v12, v6

    and-int/lit8 v12, v12, 0xf

    int-to-long v12, v12

    goto :goto_1

    :cond_7
    move-wide v12, v7

    .line 10
    :cond_8
    :goto_1
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-virtual {v11, v15}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_d

    if-ne v3, v6, :cond_9

    const/4 v6, 0x7

    :goto_2
    const/4 v7, -0x1

    goto :goto_4

    :cond_9
    const/4 v6, 0x5

    if-ne v3, v6, :cond_a

    const/16 v6, 0x8

    goto :goto_2

    :cond_a
    const/4 v6, 0x6

    if-eq v3, v6, :cond_c

    if-nez v3, :cond_b

    goto :goto_3

    :cond_b
    const/4 v6, -0x1

    goto :goto_2

    :cond_c
    :goto_3
    const/16 v6, 0x9

    goto :goto_2

    :goto_4
    if-ne v6, v7, :cond_e

    return-void

    :cond_d
    const/4 v7, -0x1

    const/4 v6, -0x1

    .line 11
    :cond_e
    iget-boolean v7, v0, Lg0/a;->c:Z

    if-eqz v7, :cond_f

    .line 12
    iget-object v7, v0, Lg0/a;->b:LN/Q;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    sget-object v8, Lg0/I;->b:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v0

    .line 14
    new-instance v8, Lg0/I;

    .line 15
    invoke-static/range {p1 .. p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v8

    .line 16
    iget-object v15, v7, LN/Q;->f:Ljava/lang/Object;

    check-cast v15, Landroid/util/LongSparseArray;

    invoke-virtual {v15, v0, v1, v8}, Landroid/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 17
    iget-object v7, v7, LN/Q;->g:Ljava/lang/Object;

    check-cast v7, Ljava/util/PriorityQueue;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_f
    const-wide/16 v0, 0x0

    .line 18
    :goto_5
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v7

    const/16 v8, 0x8

    if-ne v7, v8, :cond_10

    const/4 v7, 0x1

    goto :goto_6

    :cond_10
    const/4 v7, 0x0

    .line 19
    :goto_6
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v18

    const-wide/16 v20, 0x3e8

    move-wide/from16 v22, v12

    mul-long v12, v18, v20

    .line 20
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 21
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    if-eqz v17, :cond_11

    int-to-long v0, v6

    .line 22
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    const-wide/16 v0, 0x4

    .line 23
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    goto :goto_7

    :cond_11
    int-to-long v0, v3

    .line 24
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    int-to-long v0, v14

    .line 25
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    :goto_7
    int-to-long v0, v7

    .line 26
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    int-to-long v0, v10

    .line 27
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    const-wide/16 v0, 0x0

    .line 28
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    if-eqz v17, :cond_12

    .line 29
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    const/4 v1, 0x0

    .line 30
    aget v3, v0, v1

    float-to-double v12, v3

    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    const/4 v3, 0x1

    .line 31
    aget v0, v0, v3

    float-to-double v12, v0

    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    goto :goto_8

    :cond_12
    const/4 v1, 0x0

    const/4 v3, 0x1

    .line 32
    aget v0, v9, v1

    float-to-double v0, v0

    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 33
    aget v0, v9, v3

    float-to-double v0, v0

    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    :goto_8
    const-wide/16 v0, 0x0

    .line 34
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 35
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    move-wide/from16 v12, v22

    .line 36
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    const-wide/16 v12, 0x0

    .line 37
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 38
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 39
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getPressure(I)F

    move-result v3

    float-to-double v12, v3

    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 40
    invoke-virtual/range {p1 .. p1}, Landroid/view/InputEvent;->getDevice()Landroid/view/InputDevice;

    move-result-object v3

    if-eqz v3, :cond_13

    .line 41
    invoke-virtual/range {p1 .. p1}, Landroid/view/InputEvent;->getDevice()Landroid/view/InputDevice;

    move-result-object v3

    const/4 v8, 0x2

    invoke-virtual {v3, v8}, Landroid/view/InputDevice;->getMotionRange(I)Landroid/view/InputDevice$MotionRange;

    move-result-object v3

    const/16 v8, 0x9

    if-eqz v3, :cond_13

    .line 42
    invoke-virtual {v3}, Landroid/view/InputDevice$MotionRange;->getMin()F

    move-result v15

    float-to-double v12, v15

    .line 43
    invoke-virtual {v3}, Landroid/view/InputDevice$MotionRange;->getMax()F

    move-result v3

    move-object v15, v9

    float-to-double v8, v3

    goto :goto_9

    :cond_13
    move-object v15, v9

    move-wide v12, v0

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    .line 44
    :goto_9
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 45
    invoke-virtual {v4, v8, v9}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    const/4 v3, 0x2

    if-ne v14, v3, :cond_14

    const/16 v8, 0x18

    move-object/from16 v9, p1

    .line 46
    invoke-virtual {v9, v8, v2}, Landroid/view/MotionEvent;->getAxisValue(II)F

    move-result v8

    float-to-double v12, v8

    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 47
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    goto :goto_a

    :cond_14
    move-object/from16 v9, p1

    .line 48
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 49
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 50
    :goto_a
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getSize(I)F

    move-result v8

    float-to-double v12, v8

    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 51
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getToolMajor(I)F

    move-result v8

    float-to-double v12, v8

    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 52
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getToolMinor(I)F

    move-result v8

    float-to-double v12, v8

    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 53
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 54
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    const/16 v8, 0x8

    .line 55
    invoke-virtual {v9, v8, v2}, Landroid/view/MotionEvent;->getAxisValue(II)F

    move-result v8

    float-to-double v12, v8

    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    const/4 v3, 0x2

    if-ne v14, v3, :cond_15

    const/16 v3, 0x19

    .line 56
    invoke-virtual {v9, v3, v2}, Landroid/view/MotionEvent;->getAxisValue(II)F

    move-result v3

    float-to-double v12, v3

    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    :goto_b
    move/from16 v3, p4

    goto :goto_c

    .line 57
    :cond_15
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    goto :goto_b

    :goto_c
    int-to-long v12, v3

    .line 58
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    const/4 v3, 0x1

    if-ne v7, v3, :cond_19

    if-eqz v5, :cond_18

    .line 59
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1a

    if-lt v3, v7, :cond_16

    .line 60
    invoke-static/range {p7 .. p7}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v8

    invoke-static {v8}, LT/d;->C(Landroid/view/ViewConfiguration;)F

    move-result v8

    move v12, v8

    move-object/from16 v8, p0

    goto :goto_d

    :cond_16
    move-object/from16 v8, p0

    .line 61
    invoke-virtual {v8, v5}, Lg0/a;->c(Landroid/content/Context;)I

    move-result v12

    int-to-float v12, v12

    :goto_d
    float-to-double v12, v12

    if-lt v3, v7, :cond_17

    .line 62
    invoke-static/range {p7 .. p7}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v3

    invoke-static {v3}, LT/d;->a(Landroid/view/ViewConfiguration;)F

    move-result v3

    goto :goto_e

    .line 63
    :cond_17
    invoke-virtual {v8, v5}, Lg0/a;->c(Landroid/content/Context;)I

    move-result v3

    int-to-float v3, v3

    :goto_e
    float-to-double v0, v3

    goto :goto_f

    :cond_18
    move-object/from16 v8, p0

    const-wide/high16 v12, 0x4048000000000000L    # 48.0

    move-wide v0, v12

    :goto_f
    const/16 v3, 0xa

    .line 64
    invoke-virtual {v9, v3, v2}, Landroid/view/MotionEvent;->getAxisValue(II)F

    move-result v3

    neg-float v3, v3

    float-to-double v7, v3

    mul-double v12, v12, v7

    const/16 v3, 0x9

    .line 65
    invoke-virtual {v9, v3, v2}, Landroid/view/MotionEvent;->getAxisValue(II)F

    move-result v2

    neg-float v2, v2

    float-to-double v2, v2

    mul-double v0, v0, v2

    .line 66
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 67
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    goto :goto_10

    .line 68
    :cond_19
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 69
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    :goto_10
    if-eqz v17, :cond_1a

    .line 70
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    const/4 v1, 0x0

    .line 71
    aget v2, v15, v1

    aget v1, v0, v1

    sub-float/2addr v2, v1

    float-to-double v1, v2

    invoke-virtual {v4, v1, v2}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    const/4 v1, 0x1

    .line 72
    aget v2, v15, v1

    aget v0, v0, v1

    sub-float/2addr v2, v0

    float-to-double v0, v2

    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    const-wide/16 v0, 0x0

    goto :goto_11

    :cond_1a
    const-wide/16 v0, 0x0

    .line 73
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 74
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 75
    :goto_11
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 76
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 77
    invoke-virtual {v4, v2, v3}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 78
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    const-wide/16 v0, 0x0

    .line 79
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    if-eqz v17, :cond_1b

    const/16 v0, 0x9

    if-ne v6, v0, :cond_1b

    .line 80
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1b
    return-void
.end method

.method public final c(Landroid/content/Context;)I
    .locals 4

    .line 1
    iget v0, p0, Lg0/a;->e:I

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Landroid/util/TypedValue;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const v2, 0x101004d

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    const/16 p1, 0x30

    .line 25
    .line 26
    return p1

    .line 27
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v0, p1}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    float-to-int p1, p1

    .line 40
    iput p1, p0, Lg0/a;->e:I

    .line 41
    .line 42
    :cond_1
    iget p1, p0, Lg0/a;->e:I

    .line 43
    .line 44
    return p1
.end method

.method public final d(Landroid/view/MotionEvent;Landroid/graphics/Matrix;)V
    .locals 15

    .line 1
    move-object/from16 v8, p1

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v1}, Lg0/a;->b(I)I

    .line 12
    .line 13
    .line 14
    move-result v9

    .line 15
    const/4 v1, 0x5

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v10, 0x1

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v3, 0x0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    const/4 v3, 0x1

    .line 26
    :goto_1
    if-nez v3, :cond_3

    .line 27
    .line 28
    if-eq v0, v10, :cond_2

    .line 29
    .line 30
    const/4 v4, 0x6

    .line 31
    if-ne v0, v4, :cond_3

    .line 32
    .line 33
    :cond_2
    const/4 v0, 0x1

    .line 34
    goto :goto_2

    .line 35
    :cond_3
    const/4 v0, 0x0

    .line 36
    :goto_2
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    invoke-virtual {v8, v4}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eq v4, v10, :cond_7

    .line 45
    .line 46
    const/4 v5, 0x2

    .line 47
    if-eq v4, v5, :cond_6

    .line 48
    .line 49
    const/4 v5, 0x3

    .line 50
    if-eq v4, v5, :cond_5

    .line 51
    .line 52
    const/4 v6, 0x4

    .line 53
    if-eq v4, v6, :cond_4

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_4
    const/4 v1, 0x3

    .line 57
    goto :goto_3

    .line 58
    :cond_5
    const/4 v1, 0x1

    .line 59
    goto :goto_3

    .line 60
    :cond_6
    const/4 v1, 0x2

    .line 61
    goto :goto_3

    .line 62
    :cond_7
    const/4 v1, 0x0

    .line 63
    :goto_3
    if-eqz v0, :cond_8

    .line 64
    .line 65
    if-nez v1, :cond_8

    .line 66
    .line 67
    const/4 v11, 0x1

    .line 68
    goto :goto_4

    .line 69
    :cond_8
    const/4 v11, 0x0

    .line 70
    :goto_4
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 71
    .line 72
    .line 73
    move-result v12

    .line 74
    add-int v1, v12, v11

    .line 75
    .line 76
    mul-int/lit16 v1, v1, 0x120

    .line 77
    .line 78
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 79
    .line 80
    .line 81
    move-result-object v13

    .line 82
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 83
    .line 84
    invoke-virtual {v13, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 85
    .line 86
    .line 87
    if-eqz v3, :cond_9

    .line 88
    .line 89
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    const/4 v7, 0x0

    .line 94
    const/4 v4, 0x0

    .line 95
    move-object v0, p0

    .line 96
    move-object/from16 v1, p1

    .line 97
    .line 98
    move v3, v9

    .line 99
    move-object/from16 v5, p2

    .line 100
    .line 101
    move-object v6, v13

    .line 102
    invoke-virtual/range {v0 .. v7}, Lg0/a;->a(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;Landroid/content/Context;)V

    .line 103
    .line 104
    .line 105
    goto/16 :goto_7

    .line 106
    .line 107
    :cond_9
    if-eqz v0, :cond_c

    .line 108
    .line 109
    const/4 v14, 0x0

    .line 110
    :goto_5
    if-ge v14, v12, :cond_b

    .line 111
    .line 112
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eq v14, v0, :cond_a

    .line 117
    .line 118
    invoke-virtual {v8, v14}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-ne v0, v10, :cond_a

    .line 123
    .line 124
    const/4 v3, 0x5

    .line 125
    const/4 v4, 0x1

    .line 126
    const/4 v7, 0x0

    .line 127
    move-object v0, p0

    .line 128
    move-object/from16 v1, p1

    .line 129
    .line 130
    move v2, v14

    .line 131
    move-object/from16 v5, p2

    .line 132
    .line 133
    move-object v6, v13

    .line 134
    invoke-virtual/range {v0 .. v7}, Lg0/a;->a(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;Landroid/content/Context;)V

    .line 135
    .line 136
    .line 137
    :cond_a
    add-int/lit8 v14, v14, 0x1

    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_b
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    const/4 v7, 0x0

    .line 145
    const/4 v4, 0x0

    .line 146
    move-object v0, p0

    .line 147
    move-object/from16 v1, p1

    .line 148
    .line 149
    move v3, v9

    .line 150
    move-object/from16 v5, p2

    .line 151
    .line 152
    move-object v6, v13

    .line 153
    invoke-virtual/range {v0 .. v7}, Lg0/a;->a(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;Landroid/content/Context;)V

    .line 154
    .line 155
    .line 156
    if-eqz v11, :cond_d

    .line 157
    .line 158
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    const/4 v3, 0x2

    .line 163
    const/4 v4, 0x0

    .line 164
    const/4 v7, 0x0

    .line 165
    move-object v0, p0

    .line 166
    move-object/from16 v1, p1

    .line 167
    .line 168
    move-object/from16 v5, p2

    .line 169
    .line 170
    move-object v6, v13

    .line 171
    invoke-virtual/range {v0 .. v7}, Lg0/a;->a(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;Landroid/content/Context;)V

    .line 172
    .line 173
    .line 174
    goto :goto_7

    .line 175
    :cond_c
    const/4 v10, 0x0

    .line 176
    :goto_6
    if-ge v10, v12, :cond_d

    .line 177
    .line 178
    const/4 v7, 0x0

    .line 179
    const/4 v4, 0x0

    .line 180
    move-object v0, p0

    .line 181
    move-object/from16 v1, p1

    .line 182
    .line 183
    move v2, v10

    .line 184
    move v3, v9

    .line 185
    move-object/from16 v5, p2

    .line 186
    .line 187
    move-object v6, v13

    .line 188
    invoke-virtual/range {v0 .. v7}, Lg0/a;->a(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;Landroid/content/Context;)V

    .line 189
    .line 190
    .line 191
    add-int/lit8 v10, v10, 0x1

    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_d
    :goto_7
    invoke-virtual {v13}, Ljava/nio/Buffer;->position()I

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    rem-int/lit16 v0, v0, 0x120

    .line 199
    .line 200
    if-nez v0, :cond_e

    .line 201
    .line 202
    invoke-virtual {v13}, Ljava/nio/Buffer;->position()I

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    move-object v1, p0

    .line 207
    iget-object v2, v1, Lg0/a;->a:Lio/flutter/embedding/engine/renderer/l;

    .line 208
    .line 209
    iget-object v2, v2, Lio/flutter/embedding/engine/renderer/l;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 210
    .line 211
    invoke-virtual {v2, v13, v0}, Lio/flutter/embedding/engine/FlutterJNI;->dispatchPointerDataPacket(Ljava/nio/ByteBuffer;I)V

    .line 212
    .line 213
    .line 214
    return-void

    .line 215
    :cond_e
    move-object v1, p0

    .line 216
    new-instance v0, Ljava/lang/AssertionError;

    .line 217
    .line 218
    const-string v2, "Packet position is not on field boundary"

    .line 219
    .line 220
    invoke-direct {v0, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    throw v0
.end method
