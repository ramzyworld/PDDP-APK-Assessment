.class public final Landroidx/datastore/preferences/protobuf/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/datastore/preferences/protobuf/W;


# static fields
.field public static final n:[I

.field public static final o:Lsun/misc/Unsafe;


# instance fields
.field public final a:[I

.field public final b:[Ljava/lang/Object;

.field public final c:I

.field public final d:I

.field public final e:Landroidx/datastore/preferences/protobuf/a;

.field public final f:Z

.field public final g:[I

.field public final h:I

.field public final i:I

.field public final j:Landroidx/datastore/preferences/protobuf/P;

.field public final k:Landroidx/datastore/preferences/protobuf/C;

.field public final l:Landroidx/datastore/preferences/protobuf/e0;

.field public final m:Landroidx/datastore/preferences/protobuf/J;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    sput-object v0, Landroidx/datastore/preferences/protobuf/N;->n:[I

    .line 5
    .line 6
    invoke-static {}, Landroidx/datastore/preferences/protobuf/j0;->i()Lsun/misc/Unsafe;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Landroidx/datastore/preferences/protobuf/N;->o:Lsun/misc/Unsafe;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>([I[Ljava/lang/Object;IILandroidx/datastore/preferences/protobuf/a;[IIILandroidx/datastore/preferences/protobuf/P;Landroidx/datastore/preferences/protobuf/C;Landroidx/datastore/preferences/protobuf/e0;Landroidx/datastore/preferences/protobuf/p;Landroidx/datastore/preferences/protobuf/J;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/N;->a:[I

    .line 3
    iput-object p2, p0, Landroidx/datastore/preferences/protobuf/N;->b:[Ljava/lang/Object;

    .line 4
    iput p3, p0, Landroidx/datastore/preferences/protobuf/N;->c:I

    .line 5
    iput p4, p0, Landroidx/datastore/preferences/protobuf/N;->d:I

    .line 6
    instance-of p1, p5, Landroidx/datastore/preferences/protobuf/w;

    iput-boolean p1, p0, Landroidx/datastore/preferences/protobuf/N;->f:Z

    .line 7
    iput-object p6, p0, Landroidx/datastore/preferences/protobuf/N;->g:[I

    .line 8
    iput p7, p0, Landroidx/datastore/preferences/protobuf/N;->h:I

    .line 9
    iput p8, p0, Landroidx/datastore/preferences/protobuf/N;->i:I

    .line 10
    iput-object p9, p0, Landroidx/datastore/preferences/protobuf/N;->j:Landroidx/datastore/preferences/protobuf/P;

    .line 11
    iput-object p10, p0, Landroidx/datastore/preferences/protobuf/N;->k:Landroidx/datastore/preferences/protobuf/C;

    .line 12
    iput-object p11, p0, Landroidx/datastore/preferences/protobuf/N;->l:Landroidx/datastore/preferences/protobuf/e0;

    .line 13
    iput-object p5, p0, Landroidx/datastore/preferences/protobuf/N;->e:Landroidx/datastore/preferences/protobuf/a;

    .line 14
    iput-object p13, p0, Landroidx/datastore/preferences/protobuf/N;->m:Landroidx/datastore/preferences/protobuf/J;

    return-void
.end method

.method public static A(JLjava/lang/Object;)J
    .locals 1

    .line 1
    sget-object v0, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Long;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 10
    .line 11
    .line 12
    move-result-wide p0

    .line 13
    return-wide p0
.end method

.method public static G(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 5

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    array-length v1, v0

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v1, :cond_1

    .line 13
    .line 14
    aget-object v3, v0, v2

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    return-object v3

    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 31
    .line 32
    new-instance v2, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v3, "Field "

    .line 35
    .line 36
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p1, " for "

    .line 43
    .line 44
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p0, " not found. Known fields are "

    .line 55
    .line 56
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v1
.end method

.method public static L(I)I
    .locals 1

    .line 1
    const/high16 v0, 0xff00000

    and-int/2addr p0, v0

    ushr-int/lit8 p0, p0, 0x14

    return p0
.end method

.method public static p(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p0, Landroidx/datastore/preferences/protobuf/w;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p0, Landroidx/datastore/preferences/protobuf/w;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/w;->i()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_1
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public static x(Landroidx/datastore/preferences/protobuf/V;Landroidx/datastore/preferences/protobuf/P;Landroidx/datastore/preferences/protobuf/C;Landroidx/datastore/preferences/protobuf/e0;Landroidx/datastore/preferences/protobuf/p;Landroidx/datastore/preferences/protobuf/J;)Landroidx/datastore/preferences/protobuf/N;
    .locals 32

    .line 1
    invoke-virtual/range {p0 .. p0}, Landroidx/datastore/preferences/protobuf/V;->c()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    .line 3
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const v5, 0xd800

    if-lt v3, v5, :cond_0

    const/4 v3, 0x1

    :goto_0
    add-int/lit8 v6, v3, 0x1

    .line 4
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-lt v3, v5, :cond_1

    move v3, v6

    goto :goto_0

    :cond_0
    const/4 v6, 0x1

    :cond_1
    add-int/lit8 v3, v6, 0x1

    .line 5
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v5, :cond_3

    and-int/lit16 v6, v6, 0x1fff

    const/16 v8, 0xd

    :goto_1
    add-int/lit8 v9, v3, 0x1

    .line 6
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-lt v3, v5, :cond_2

    and-int/lit16 v3, v3, 0x1fff

    shl-int/2addr v3, v8

    or-int/2addr v6, v3

    add-int/lit8 v8, v8, 0xd

    move v3, v9

    goto :goto_1

    :cond_2
    shl-int/2addr v3, v8

    or-int/2addr v6, v3

    move v3, v9

    :cond_3
    if-nez v6, :cond_4

    .line 7
    sget-object v6, Landroidx/datastore/preferences/protobuf/N;->n:[I

    move-object v14, v6

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    goto/16 :goto_a

    :cond_4
    add-int/lit8 v6, v3, 0x1

    .line 8
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-lt v3, v5, :cond_6

    and-int/lit16 v3, v3, 0x1fff

    const/16 v8, 0xd

    :goto_2
    add-int/lit8 v9, v6, 0x1

    .line 9
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v5, :cond_5

    and-int/lit16 v6, v6, 0x1fff

    shl-int/2addr v6, v8

    or-int/2addr v3, v6

    add-int/lit8 v8, v8, 0xd

    move v6, v9

    goto :goto_2

    :cond_5
    shl-int/2addr v6, v8

    or-int/2addr v3, v6

    move v6, v9

    :cond_6
    add-int/lit8 v8, v6, 0x1

    .line 10
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v5, :cond_8

    and-int/lit16 v6, v6, 0x1fff

    const/16 v9, 0xd

    :goto_3
    add-int/lit8 v10, v8, 0x1

    .line 11
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v5, :cond_7

    and-int/lit16 v8, v8, 0x1fff

    shl-int/2addr v8, v9

    or-int/2addr v6, v8

    add-int/lit8 v9, v9, 0xd

    move v8, v10

    goto :goto_3

    :cond_7
    shl-int/2addr v8, v9

    or-int/2addr v6, v8

    move v8, v10

    :cond_8
    add-int/lit8 v9, v8, 0x1

    .line 12
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v5, :cond_a

    and-int/lit16 v8, v8, 0x1fff

    const/16 v10, 0xd

    :goto_4
    add-int/lit8 v11, v9, 0x1

    .line 13
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v5, :cond_9

    and-int/lit16 v9, v9, 0x1fff

    shl-int/2addr v9, v10

    or-int/2addr v8, v9

    add-int/lit8 v10, v10, 0xd

    move v9, v11

    goto :goto_4

    :cond_9
    shl-int/2addr v9, v10

    or-int/2addr v8, v9

    move v9, v11

    :cond_a
    add-int/lit8 v10, v9, 0x1

    .line 14
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v5, :cond_c

    and-int/lit16 v9, v9, 0x1fff

    const/16 v11, 0xd

    :goto_5
    add-int/lit8 v12, v10, 0x1

    .line 15
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-lt v10, v5, :cond_b

    and-int/lit16 v10, v10, 0x1fff

    shl-int/2addr v10, v11

    or-int/2addr v9, v10

    add-int/lit8 v11, v11, 0xd

    move v10, v12

    goto :goto_5

    :cond_b
    shl-int/2addr v10, v11

    or-int/2addr v9, v10

    move v10, v12

    :cond_c
    add-int/lit8 v11, v10, 0x1

    .line 16
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-lt v10, v5, :cond_e

    and-int/lit16 v10, v10, 0x1fff

    const/16 v12, 0xd

    :goto_6
    add-int/lit8 v13, v11, 0x1

    .line 17
    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v5, :cond_d

    and-int/lit16 v11, v11, 0x1fff

    shl-int/2addr v11, v12

    or-int/2addr v10, v11

    add-int/lit8 v12, v12, 0xd

    move v11, v13

    goto :goto_6

    :cond_d
    shl-int/2addr v11, v12

    or-int/2addr v10, v11

    move v11, v13

    :cond_e
    add-int/lit8 v12, v11, 0x1

    .line 18
    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v5, :cond_10

    and-int/lit16 v11, v11, 0x1fff

    const/16 v13, 0xd

    :goto_7
    add-int/lit8 v14, v12, 0x1

    .line 19
    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v5, :cond_f

    and-int/lit16 v12, v12, 0x1fff

    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    add-int/lit8 v13, v13, 0xd

    move v12, v14

    goto :goto_7

    :cond_f
    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    move v12, v14

    :cond_10
    add-int/lit8 v13, v12, 0x1

    .line 20
    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v5, :cond_12

    and-int/lit16 v12, v12, 0x1fff

    const/16 v14, 0xd

    :goto_8
    add-int/lit8 v15, v13, 0x1

    .line 21
    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v5, :cond_11

    and-int/lit16 v13, v13, 0x1fff

    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    add-int/lit8 v14, v14, 0xd

    move v13, v15

    goto :goto_8

    :cond_11
    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    move v13, v15

    :cond_12
    add-int/lit8 v14, v13, 0x1

    .line 22
    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v5, :cond_14

    and-int/lit16 v13, v13, 0x1fff

    const/16 v15, 0xd

    :goto_9
    add-int/lit8 v16, v14, 0x1

    .line 23
    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v5, :cond_13

    and-int/lit16 v14, v14, 0x1fff

    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    add-int/lit8 v15, v15, 0xd

    move/from16 v14, v16

    goto :goto_9

    :cond_13
    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    move/from16 v14, v16

    :cond_14
    add-int v15, v13, v11

    add-int/2addr v15, v12

    .line 24
    new-array v12, v15, [I

    mul-int/lit8 v15, v3, 0x2

    add-int/2addr v15, v6

    move v6, v3

    move v3, v14

    move-object v14, v12

    move v12, v8

    move v8, v15

    move v15, v13

    move v13, v9

    .line 25
    :goto_a
    sget-object v9, Landroidx/datastore/preferences/protobuf/N;->o:Lsun/misc/Unsafe;

    .line 26
    invoke-virtual/range {p0 .. p0}, Landroidx/datastore/preferences/protobuf/V;->b()[Ljava/lang/Object;

    move-result-object v16

    .line 27
    invoke-virtual/range {p0 .. p0}, Landroidx/datastore/preferences/protobuf/V;->a()Landroidx/datastore/preferences/protobuf/a;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    mul-int/lit8 v7, v10, 0x3

    .line 28
    new-array v7, v7, [I

    mul-int/lit8 v10, v10, 0x2

    .line 29
    new-array v10, v10, [Ljava/lang/Object;

    add-int v19, v15, v11

    move/from16 v21, v15

    move/from16 v22, v19

    const/4 v11, 0x0

    const/16 v20, 0x0

    :goto_b
    if-ge v3, v1, :cond_35

    add-int/lit8 v23, v3, 0x1

    .line 30
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-lt v3, v5, :cond_16

    and-int/lit16 v3, v3, 0x1fff

    move/from16 v4, v23

    const/16 v23, 0xd

    :goto_c
    add-int/lit8 v25, v4, 0x1

    .line 31
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_15

    and-int/lit16 v4, v4, 0x1fff

    shl-int v4, v4, v23

    or-int/2addr v3, v4

    add-int/lit8 v23, v23, 0xd

    move/from16 v4, v25

    goto :goto_c

    :cond_15
    shl-int v4, v4, v23

    or-int/2addr v3, v4

    move/from16 v4, v25

    goto :goto_d

    :cond_16
    move/from16 v4, v23

    :goto_d
    add-int/lit8 v23, v4, 0x1

    .line 32
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_18

    and-int/lit16 v4, v4, 0x1fff

    move/from16 v5, v23

    const/16 v23, 0xd

    :goto_e
    add-int/lit8 v26, v5, 0x1

    .line 33
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    move/from16 v27, v1

    const v1, 0xd800

    if-lt v5, v1, :cond_17

    and-int/lit16 v1, v5, 0x1fff

    shl-int v1, v1, v23

    or-int/2addr v4, v1

    add-int/lit8 v23, v23, 0xd

    move/from16 v5, v26

    move/from16 v1, v27

    goto :goto_e

    :cond_17
    shl-int v1, v5, v23

    or-int/2addr v4, v1

    move/from16 v1, v26

    goto :goto_f

    :cond_18
    move/from16 v27, v1

    move/from16 v1, v23

    :goto_f
    and-int/lit16 v5, v4, 0xff

    move/from16 v23, v15

    and-int/lit16 v15, v4, 0x400

    if-eqz v15, :cond_19

    add-int/lit8 v15, v11, 0x1

    .line 34
    aput v20, v14, v11

    move v11, v15

    :cond_19
    const/16 v15, 0x33

    if-lt v5, v15, :cond_22

    add-int/lit8 v15, v1, 0x1

    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    move/from16 v26, v11

    const v11, 0xd800

    if-lt v1, v11, :cond_1b

    and-int/lit16 v1, v1, 0x1fff

    const/16 v30, 0xd

    :goto_10
    add-int/lit8 v31, v15, 0x1

    .line 36
    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-lt v15, v11, :cond_1a

    and-int/lit16 v11, v15, 0x1fff

    shl-int v11, v11, v30

    or-int/2addr v1, v11

    add-int/lit8 v30, v30, 0xd

    move/from16 v15, v31

    const v11, 0xd800

    goto :goto_10

    :cond_1a
    shl-int v11, v15, v30

    or-int/2addr v1, v11

    move/from16 v15, v31

    :cond_1b
    add-int/lit8 v11, v5, -0x33

    move/from16 v30, v15

    const/16 v15, 0x9

    if-eq v11, v15, :cond_1e

    const/16 v15, 0x11

    if-ne v11, v15, :cond_1c

    goto :goto_12

    :cond_1c
    const/16 v15, 0xc

    if-ne v11, v15, :cond_1f

    .line 37
    invoke-virtual/range {p0 .. p0}, Landroidx/datastore/preferences/protobuf/V;->d()I

    move-result v11

    const/4 v15, 0x1

    invoke-static {v11, v15}, LI/j;->a(II)Z

    move-result v11

    if-nez v11, :cond_1d

    and-int/lit16 v11, v4, 0x800

    if-eqz v11, :cond_1f

    .line 38
    :cond_1d
    div-int/lit8 v11, v20, 0x3

    mul-int/lit8 v11, v11, 0x2

    add-int/2addr v11, v15

    add-int/lit8 v15, v8, 0x1

    aget-object v8, v16, v8

    aput-object v8, v10, v11

    :goto_11
    move v8, v15

    goto :goto_13

    .line 39
    :cond_1e
    :goto_12
    div-int/lit8 v11, v20, 0x3

    mul-int/lit8 v11, v11, 0x2

    const/4 v15, 0x1

    add-int/2addr v11, v15

    add-int/lit8 v15, v8, 0x1

    aget-object v8, v16, v8

    aput-object v8, v10, v11

    goto :goto_11

    :cond_1f
    :goto_13
    mul-int/lit8 v1, v1, 0x2

    .line 40
    aget-object v11, v16, v1

    .line 41
    instance-of v15, v11, Ljava/lang/reflect/Field;

    if-eqz v15, :cond_20

    .line 42
    check-cast v11, Ljava/lang/reflect/Field;

    :goto_14
    move v15, v12

    goto :goto_15

    .line 43
    :cond_20
    check-cast v11, Ljava/lang/String;

    invoke-static {v2, v11}, Landroidx/datastore/preferences/protobuf/N;->G(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v11

    .line 44
    aput-object v11, v16, v1

    goto :goto_14

    .line 45
    :goto_15
    invoke-virtual {v9, v11}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v11

    long-to-int v12, v11

    add-int/lit8 v1, v1, 0x1

    .line 46
    aget-object v11, v16, v1

    move/from16 v28, v8

    .line 47
    instance-of v8, v11, Ljava/lang/reflect/Field;

    if-eqz v8, :cond_21

    .line 48
    check-cast v11, Ljava/lang/reflect/Field;

    :goto_16
    move v1, v12

    goto :goto_17

    .line 49
    :cond_21
    check-cast v11, Ljava/lang/String;

    invoke-static {v2, v11}, Landroidx/datastore/preferences/protobuf/N;->G(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v11

    .line 50
    aput-object v11, v16, v1

    goto :goto_16

    .line 51
    :goto_17
    invoke-virtual {v9, v11}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v11

    long-to-int v8, v11

    move v12, v1

    move v11, v8

    move/from16 v25, v28

    move/from16 v8, v30

    const/4 v1, 0x0

    move/from16 v30, v13

    move/from16 v28, v15

    move-object v15, v10

    goto/16 :goto_22

    :cond_22
    move/from16 v26, v11

    move v15, v12

    add-int/lit8 v11, v8, 0x1

    .line 52
    aget-object v12, v16, v8

    check-cast v12, Ljava/lang/String;

    invoke-static {v2, v12}, Landroidx/datastore/preferences/protobuf/N;->G(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v12

    move/from16 v30, v13

    const/16 v13, 0x9

    if-eq v5, v13, :cond_23

    const/16 v13, 0x11

    if-ne v5, v13, :cond_24

    :cond_23
    move/from16 v28, v15

    const/4 v15, 0x1

    goto/16 :goto_1c

    :cond_24
    const/16 v13, 0x1b

    if-eq v5, v13, :cond_25

    const/16 v13, 0x31

    if-ne v5, v13, :cond_26

    :cond_25
    move/from16 v28, v15

    const/4 v15, 0x1

    goto :goto_1b

    :cond_26
    const/16 v13, 0xc

    if-eq v5, v13, :cond_2a

    const/16 v13, 0x1e

    if-eq v5, v13, :cond_2a

    const/16 v13, 0x2c

    if-ne v5, v13, :cond_27

    goto :goto_19

    :cond_27
    const/16 v13, 0x32

    if-ne v5, v13, :cond_28

    add-int/lit8 v13, v21, 0x1

    .line 53
    aput v20, v14, v21

    .line 54
    div-int/lit8 v21, v20, 0x3

    mul-int/lit8 v21, v21, 0x2

    add-int/lit8 v28, v8, 0x2

    aget-object v11, v16, v11

    aput-object v11, v10, v21

    and-int/lit16 v11, v4, 0x800

    if-eqz v11, :cond_29

    add-int/lit8 v21, v21, 0x1

    add-int/lit8 v11, v8, 0x3

    .line 55
    aget-object v8, v16, v28

    aput-object v8, v10, v21

    move/from16 v21, v13

    :cond_28
    :goto_18
    move/from16 v28, v15

    const/4 v15, 0x1

    goto :goto_1d

    :cond_29
    move/from16 v21, v13

    move/from16 v11, v28

    goto :goto_18

    .line 56
    :cond_2a
    :goto_19
    invoke-virtual/range {p0 .. p0}, Landroidx/datastore/preferences/protobuf/V;->d()I

    move-result v13

    move/from16 v28, v15

    const/4 v15, 0x1

    if-eq v13, v15, :cond_2b

    and-int/lit16 v13, v4, 0x800

    if-eqz v13, :cond_2c

    .line 57
    :cond_2b
    div-int/lit8 v13, v20, 0x3

    mul-int/lit8 v13, v13, 0x2

    add-int/2addr v13, v15

    add-int/lit8 v8, v8, 0x2

    aget-object v11, v16, v11

    aput-object v11, v10, v13

    :goto_1a
    move v11, v8

    goto :goto_1d

    .line 58
    :goto_1b
    div-int/lit8 v13, v20, 0x3

    mul-int/lit8 v13, v13, 0x2

    add-int/2addr v13, v15

    add-int/lit8 v8, v8, 0x2

    aget-object v11, v16, v11

    aput-object v11, v10, v13

    goto :goto_1a

    .line 59
    :goto_1c
    div-int/lit8 v8, v20, 0x3

    mul-int/lit8 v8, v8, 0x2

    add-int/2addr v8, v15

    invoke-virtual {v12}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v13

    aput-object v13, v10, v8

    .line 60
    :cond_2c
    :goto_1d
    invoke-virtual {v9, v12}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v12

    long-to-int v12, v12

    and-int/lit16 v8, v4, 0x1000

    if-eqz v8, :cond_30

    const/16 v8, 0x11

    if-gt v5, v8, :cond_30

    add-int/lit8 v8, v1, 0x1

    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const v13, 0xd800

    if-lt v1, v13, :cond_2e

    and-int/lit16 v1, v1, 0x1fff

    const/16 v24, 0xd

    :goto_1e
    add-int/lit8 v25, v8, 0x1

    .line 62
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v13, :cond_2d

    and-int/lit16 v8, v8, 0x1fff

    shl-int v8, v8, v24

    or-int/2addr v1, v8

    add-int/lit8 v24, v24, 0xd

    move/from16 v8, v25

    goto :goto_1e

    :cond_2d
    shl-int v8, v8, v24

    or-int/2addr v1, v8

    move/from16 v8, v25

    :cond_2e
    mul-int/lit8 v24, v6, 0x2

    .line 63
    div-int/lit8 v25, v1, 0x20

    add-int v25, v25, v24

    .line 64
    aget-object v13, v16, v25

    .line 65
    instance-of v15, v13, Ljava/lang/reflect/Field;

    if-eqz v15, :cond_2f

    .line 66
    check-cast v13, Ljava/lang/reflect/Field;

    :goto_1f
    move-object v15, v10

    move/from16 v25, v11

    goto :goto_20

    .line 67
    :cond_2f
    check-cast v13, Ljava/lang/String;

    invoke-static {v2, v13}, Landroidx/datastore/preferences/protobuf/N;->G(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v13

    .line 68
    aput-object v13, v16, v25

    goto :goto_1f

    .line 69
    :goto_20
    invoke-virtual {v9, v13}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v10

    long-to-int v11, v10

    .line 70
    rem-int/lit8 v1, v1, 0x20

    goto :goto_21

    :cond_30
    move-object v15, v10

    move/from16 v25, v11

    const v8, 0xfffff

    move v8, v1

    const/4 v1, 0x0

    const v11, 0xfffff

    :goto_21
    const/16 v10, 0x12

    if-lt v5, v10, :cond_31

    const/16 v10, 0x31

    if-gt v5, v10, :cond_31

    add-int/lit8 v10, v22, 0x1

    .line 71
    aput v12, v14, v22

    move/from16 v22, v10

    :cond_31
    :goto_22
    add-int/lit8 v10, v20, 0x1

    .line 72
    aput v3, v7, v20

    add-int/lit8 v3, v20, 0x2

    and-int/lit16 v13, v4, 0x200

    if-eqz v13, :cond_32

    const/high16 v13, 0x20000000

    goto :goto_23

    :cond_32
    const/4 v13, 0x0

    :goto_23
    move-object/from16 v29, v0

    and-int/lit16 v0, v4, 0x100

    if-eqz v0, :cond_33

    const/high16 v0, 0x10000000

    goto :goto_24

    :cond_33
    const/4 v0, 0x0

    :goto_24
    or-int/2addr v0, v13

    and-int/lit16 v4, v4, 0x800

    if-eqz v4, :cond_34

    const/high16 v4, -0x80000000

    goto :goto_25

    :cond_34
    const/4 v4, 0x0

    :goto_25
    or-int/2addr v0, v4

    shl-int/lit8 v4, v5, 0x14

    or-int/2addr v0, v4

    or-int/2addr v0, v12

    .line 73
    aput v0, v7, v10

    add-int/lit8 v20, v20, 0x3

    shl-int/lit8 v0, v1, 0x14

    or-int/2addr v0, v11

    .line 74
    aput v0, v7, v3

    move v3, v8

    move-object v10, v15

    move/from16 v15, v23

    move/from16 v8, v25

    move/from16 v11, v26

    move/from16 v1, v27

    move/from16 v12, v28

    move-object/from16 v0, v29

    move/from16 v13, v30

    const v5, 0xd800

    goto/16 :goto_b

    :cond_35
    move/from16 v28, v12

    move/from16 v30, v13

    move/from16 v23, v15

    move-object v15, v10

    .line 75
    new-instance v0, Landroidx/datastore/preferences/protobuf/N;

    .line 76
    invoke-virtual/range {p0 .. p0}, Landroidx/datastore/preferences/protobuf/V;->a()Landroidx/datastore/preferences/protobuf/a;

    move-result-object v13

    move-object v8, v0

    move-object v9, v7

    move/from16 v11, v28

    move/from16 v12, v30

    move/from16 v15, v23

    move/from16 v16, v19

    move-object/from16 v17, p1

    move-object/from16 v18, p2

    move-object/from16 v19, p3

    move-object/from16 v20, p4

    move-object/from16 v21, p5

    .line 77
    invoke-direct/range {v8 .. v21}, Landroidx/datastore/preferences/protobuf/N;-><init>([I[Ljava/lang/Object;IILandroidx/datastore/preferences/protobuf/a;[IIILandroidx/datastore/preferences/protobuf/P;Landroidx/datastore/preferences/protobuf/C;Landroidx/datastore/preferences/protobuf/e0;Landroidx/datastore/preferences/protobuf/p;Landroidx/datastore/preferences/protobuf/J;)V

    return-object v0
.end method

.method public static y(I)J
    .locals 2

    .line 1
    const v0, 0xfffff

    and-int/2addr p0, v0

    int-to-long v0, p0

    return-wide v0
.end method

.method public static z(JLjava/lang/Object;)I
    .locals 1

    .line 1
    sget-object v0, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method


# virtual methods
.method public final B(I)I
    .locals 7

    .line 1
    iget v0, p0, Landroidx/datastore/preferences/protobuf/N;->c:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-lt p1, v0, :cond_2

    .line 5
    .line 6
    iget v0, p0, Landroidx/datastore/preferences/protobuf/N;->d:I

    .line 7
    .line 8
    if-gt p1, v0, :cond_2

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/N;->a:[I

    .line 11
    .line 12
    array-length v2, v0

    .line 13
    div-int/lit8 v2, v2, 0x3

    .line 14
    .line 15
    add-int/lit8 v2, v2, -0x1

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    :goto_0
    if-gt v3, v2, :cond_2

    .line 19
    .line 20
    add-int v4, v2, v3

    .line 21
    .line 22
    ushr-int/lit8 v4, v4, 0x1

    .line 23
    .line 24
    mul-int/lit8 v5, v4, 0x3

    .line 25
    .line 26
    aget v6, v0, v5

    .line 27
    .line 28
    if-ne p1, v6, :cond_0

    .line 29
    .line 30
    move v1, v5

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    if-ge p1, v6, :cond_1

    .line 33
    .line 34
    add-int/lit8 v4, v4, -0x1

    .line 35
    .line 36
    move v2, v4

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 39
    .line 40
    move v3, v4

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    :goto_1
    return v1
.end method

.method public final C(Ljava/lang/Object;JLandroidx/datastore/preferences/protobuf/k;Landroidx/datastore/preferences/protobuf/W;Landroidx/datastore/preferences/protobuf/o;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/N;->k:Landroidx/datastore/preferences/protobuf/C;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p2, p3, p1}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget p2, p4, Landroidx/datastore/preferences/protobuf/k;->b:I

    .line 11
    .line 12
    and-int/lit8 p3, p2, 0x7

    .line 13
    .line 14
    const/4 v0, 0x3

    .line 15
    if-ne p3, v0, :cond_3

    .line 16
    .line 17
    :cond_0
    invoke-interface {p5}, Landroidx/datastore/preferences/protobuf/W;->g()Landroidx/datastore/preferences/protobuf/w;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    invoke-virtual {p4, p3, p5, p6}, Landroidx/datastore/preferences/protobuf/k;->b(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/W;Landroidx/datastore/preferences/protobuf/o;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p5, p3}, Landroidx/datastore/preferences/protobuf/W;->h(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    move-object v0, p1

    .line 28
    check-cast v0, Landroidx/datastore/preferences/protobuf/U;

    .line 29
    .line 30
    invoke-virtual {v0, p3}, Landroidx/datastore/preferences/protobuf/U;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    iget-object p3, p4, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    .line 34
    .line 35
    invoke-virtual {p3}, Landroidx/datastore/preferences/protobuf/j;->c()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    iget v0, p4, Landroidx/datastore/preferences/protobuf/k;->d:I

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {p3}, Landroidx/datastore/preferences/protobuf/j;->u()I

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    if-eq p3, p2, :cond_0

    .line 51
    .line 52
    iput p3, p4, Landroidx/datastore/preferences/protobuf/k;->d:I

    .line 53
    .line 54
    :cond_2
    :goto_0
    return-void

    .line 55
    :cond_3
    invoke-static {}, Landroidx/datastore/preferences/protobuf/A;->b()Landroidx/datastore/preferences/protobuf/z;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    throw p1
.end method

.method public final D(Ljava/lang/Object;ILandroidx/datastore/preferences/protobuf/k;Landroidx/datastore/preferences/protobuf/W;Landroidx/datastore/preferences/protobuf/o;)V
    .locals 2

    .line 1
    const v0, 0xfffff

    .line 2
    .line 3
    .line 4
    and-int/2addr p2, v0

    .line 5
    int-to-long v0, p2

    .line 6
    iget-object p2, p0, Landroidx/datastore/preferences/protobuf/N;->k:Landroidx/datastore/preferences/protobuf/C;

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget p2, p3, Landroidx/datastore/preferences/protobuf/k;->b:I

    .line 16
    .line 17
    and-int/lit8 v0, p2, 0x7

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    if-ne v0, v1, :cond_3

    .line 21
    .line 22
    :cond_0
    invoke-interface {p4}, Landroidx/datastore/preferences/protobuf/W;->g()Landroidx/datastore/preferences/protobuf/w;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p3, v0, p4, p5}, Landroidx/datastore/preferences/protobuf/k;->c(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/W;Landroidx/datastore/preferences/protobuf/o;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p4, v0}, Landroidx/datastore/preferences/protobuf/W;->h(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    move-object v1, p1

    .line 33
    check-cast v1, Landroidx/datastore/preferences/protobuf/U;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Landroidx/datastore/preferences/protobuf/U;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    iget-object v0, p3, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    .line 39
    .line 40
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/j;->c()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_2

    .line 45
    .line 46
    iget v1, p3, Landroidx/datastore/preferences/protobuf/k;->d:I

    .line 47
    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/j;->u()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eq v0, p2, :cond_0

    .line 56
    .line 57
    iput v0, p3, Landroidx/datastore/preferences/protobuf/k;->d:I

    .line 58
    .line 59
    :cond_2
    :goto_0
    return-void

    .line 60
    :cond_3
    invoke-static {}, Landroidx/datastore/preferences/protobuf/A;->b()Landroidx/datastore/preferences/protobuf/z;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    throw p1
.end method

.method public final E(ILandroidx/datastore/preferences/protobuf/k;Ljava/lang/Object;)V
    .locals 4

    .line 1
    const/high16 v0, 0x20000000

    .line 2
    .line 3
    and-int/2addr v0, p1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    const/4 v1, 0x2

    .line 10
    const v2, 0xfffff

    .line 11
    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    and-int/2addr p1, v2

    .line 16
    int-to-long v2, p1

    .line 17
    invoke-virtual {p2, v1}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p2, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/j;->t()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p3, v2, v3, p1}, Landroidx/datastore/preferences/protobuf/j0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    iget-boolean v0, p0, Landroidx/datastore/preferences/protobuf/N;->f:Z

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    and-int/2addr p1, v2

    .line 35
    int-to-long v2, p1

    .line 36
    invoke-virtual {p2, v1}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p2, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    .line 40
    .line 41
    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/j;->s()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p3, v2, v3, p1}, Landroidx/datastore/preferences/protobuf/j0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    and-int/2addr p1, v2

    .line 50
    int-to-long v0, p1

    .line 51
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/k;->e()Landroidx/datastore/preferences/protobuf/g;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p3, v0, v1, p1}, Landroidx/datastore/preferences/protobuf/j0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :goto_1
    return-void
.end method

.method public final F(ILandroidx/datastore/preferences/protobuf/k;Ljava/lang/Object;)V
    .locals 5

    .line 1
    const/high16 v0, 0x20000000

    .line 2
    .line 3
    and-int/2addr v0, p1

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    const v3, 0xfffff

    .line 12
    .line 13
    .line 14
    iget-object v4, p0, Landroidx/datastore/preferences/protobuf/N;->k:Landroidx/datastore/preferences/protobuf/C;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    and-int/2addr p1, v3

    .line 19
    int-to-long v0, p1

    .line 20
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1, p3}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p2, p1, v2}, Landroidx/datastore/preferences/protobuf/k;->s(Landroidx/datastore/preferences/protobuf/x;Z)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    and-int/2addr p1, v3

    .line 32
    int-to-long v2, p1

    .line 33
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {v2, v3, p3}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p2, p1, v1}, Landroidx/datastore/preferences/protobuf/k;->s(Landroidx/datastore/preferences/protobuf/x;Z)V

    .line 41
    .line 42
    .line 43
    :goto_1
    return-void
.end method

.method public final H(ILjava/lang/Object;)V
    .locals 5

    .line 1
    add-int/lit8 p1, p1, 0x2

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/N;->a:[I

    .line 4
    .line 5
    aget p1, v0, p1

    .line 6
    .line 7
    const v0, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr v0, p1

    .line 11
    int-to-long v0, v0

    .line 12
    const-wide/32 v2, 0xfffff

    .line 13
    .line 14
    .line 15
    cmp-long v4, v0, v2

    .line 16
    .line 17
    if-nez v4, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    ushr-int/lit8 p1, p1, 0x14

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    shl-int p1, v2, p1

    .line 24
    .line 25
    sget-object v2, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 26
    .line 27
    invoke-virtual {v2, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    or-int/2addr p1, v2

    .line 32
    invoke-static {p2, v0, v1, p1}, Landroidx/datastore/preferences/protobuf/j0;->m(Ljava/lang/Object;JI)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final I(Ljava/lang/Object;II)V
    .locals 2

    .line 1
    add-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/N;->a:[I

    .line 4
    .line 5
    aget p3, v0, p3

    .line 6
    .line 7
    const v0, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr p3, v0

    .line 11
    int-to-long v0, p3

    .line 12
    invoke-static {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/j0;->m(Ljava/lang/Object;JI)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final J(Ljava/lang/Object;ILandroidx/datastore/preferences/protobuf/a;)V
    .locals 3

    .line 1
    sget-object v0, Landroidx/datastore/preferences/protobuf/N;->o:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Landroidx/datastore/preferences/protobuf/N;->M(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const v2, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr v1, v2

    .line 11
    int-to-long v1, v1

    .line 12
    invoke-virtual {v0, p1, v1, v2, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p2, p1}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final K(Ljava/lang/Object;IILandroidx/datastore/preferences/protobuf/a;)V
    .locals 3

    .line 1
    sget-object v0, Landroidx/datastore/preferences/protobuf/N;->o:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-virtual {p0, p3}, Landroidx/datastore/preferences/protobuf/N;->M(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const v2, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr v1, v2

    .line 11
    int-to-long v1, v1

    .line 12
    invoke-virtual {v0, p1, v1, v2, p4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/N;->I(Ljava/lang/Object;II)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final M(I)I
    .locals 1

    .line 1
    add-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/N;->a:[I

    .line 4
    .line 5
    aget p1, v0, p1

    .line 6
    .line 7
    return p1
.end method

.method public final N(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/F;)V
    .locals 19

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v8, p2

    .line 6
    .line 7
    iget-object v9, v6, Landroidx/datastore/preferences/protobuf/N;->a:[I

    .line 8
    .line 9
    array-length v10, v9

    .line 10
    sget-object v11, Landroidx/datastore/preferences/protobuf/N;->o:Lsun/misc/Unsafe;

    .line 11
    .line 12
    const v12, 0xfffff

    .line 13
    .line 14
    .line 15
    const v0, 0xfffff

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v14, 0x0

    .line 20
    :goto_0
    if-ge v14, v10, :cond_7

    .line 21
    .line 22
    invoke-virtual {v6, v14}, Landroidx/datastore/preferences/protobuf/N;->M(I)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    aget v15, v9, v14

    .line 27
    .line 28
    invoke-static {v2}, Landroidx/datastore/preferences/protobuf/N;->L(I)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const/16 v4, 0x11

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    if-gt v3, v4, :cond_2

    .line 36
    .line 37
    add-int/lit8 v4, v14, 0x2

    .line 38
    .line 39
    aget v4, v9, v4

    .line 40
    .line 41
    and-int v13, v4, v12

    .line 42
    .line 43
    if-eq v13, v0, :cond_1

    .line 44
    .line 45
    if-ne v13, v12, :cond_0

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    int-to-long v0, v13

    .line 50
    invoke-virtual {v11, v7, v0, v1}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    move v1, v0

    .line 55
    :goto_1
    move v0, v13

    .line 56
    :cond_1
    ushr-int/lit8 v4, v4, 0x14

    .line 57
    .line 58
    shl-int v4, v5, v4

    .line 59
    .line 60
    move v13, v0

    .line 61
    move/from16 v17, v1

    .line 62
    .line 63
    move/from16 v18, v4

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    move v13, v0

    .line 67
    move/from16 v17, v1

    .line 68
    .line 69
    const/16 v18, 0x0

    .line 70
    .line 71
    :goto_2
    and-int v0, v2, v12

    .line 72
    .line 73
    int-to-long v1, v0

    .line 74
    packed-switch v3, :pswitch_data_0

    .line 75
    .line 76
    .line 77
    :cond_3
    :goto_3
    move/from16 v16, v13

    .line 78
    .line 79
    goto/16 :goto_5

    .line 80
    .line 81
    :pswitch_0
    invoke-virtual {v6, v7, v15, v14}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_3

    .line 86
    .line 87
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v6, v14}, Landroidx/datastore/preferences/protobuf/N;->m(I)Landroidx/datastore/preferences/protobuf/W;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v8, v15, v0, v1}, Landroidx/datastore/preferences/protobuf/F;->h(ILjava/lang/Object;Landroidx/datastore/preferences/protobuf/W;)V

    .line 96
    .line 97
    .line 98
    goto :goto_3

    .line 99
    :pswitch_1
    invoke-virtual {v6, v7, v15, v14}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_3

    .line 104
    .line 105
    invoke-static {v1, v2, v7}, Landroidx/datastore/preferences/protobuf/N;->A(JLjava/lang/Object;)J

    .line 106
    .line 107
    .line 108
    move-result-wide v0

    .line 109
    invoke-virtual {v8, v0, v1, v15}, Landroidx/datastore/preferences/protobuf/F;->o(JI)V

    .line 110
    .line 111
    .line 112
    goto :goto_3

    .line 113
    :pswitch_2
    invoke-virtual {v6, v7, v15, v14}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_3

    .line 118
    .line 119
    invoke-static {v1, v2, v7}, Landroidx/datastore/preferences/protobuf/N;->z(JLjava/lang/Object;)I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    invoke-virtual {v8, v15, v0}, Landroidx/datastore/preferences/protobuf/F;->n(II)V

    .line 124
    .line 125
    .line 126
    goto :goto_3

    .line 127
    :pswitch_3
    invoke-virtual {v6, v7, v15, v14}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_3

    .line 132
    .line 133
    invoke-static {v1, v2, v7}, Landroidx/datastore/preferences/protobuf/N;->A(JLjava/lang/Object;)J

    .line 134
    .line 135
    .line 136
    move-result-wide v0

    .line 137
    invoke-virtual {v8, v0, v1, v15}, Landroidx/datastore/preferences/protobuf/F;->m(JI)V

    .line 138
    .line 139
    .line 140
    goto :goto_3

    .line 141
    :pswitch_4
    invoke-virtual {v6, v7, v15, v14}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_3

    .line 146
    .line 147
    invoke-static {v1, v2, v7}, Landroidx/datastore/preferences/protobuf/N;->z(JLjava/lang/Object;)I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    invoke-virtual {v8, v15, v0}, Landroidx/datastore/preferences/protobuf/F;->l(II)V

    .line 152
    .line 153
    .line 154
    goto :goto_3

    .line 155
    :pswitch_5
    invoke-virtual {v6, v7, v15, v14}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_3

    .line 160
    .line 161
    invoke-static {v1, v2, v7}, Landroidx/datastore/preferences/protobuf/N;->z(JLjava/lang/Object;)I

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    invoke-virtual {v8, v15, v0}, Landroidx/datastore/preferences/protobuf/F;->d(II)V

    .line 166
    .line 167
    .line 168
    goto :goto_3

    .line 169
    :pswitch_6
    invoke-virtual {v6, v7, v15, v14}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-eqz v0, :cond_3

    .line 174
    .line 175
    invoke-static {v1, v2, v7}, Landroidx/datastore/preferences/protobuf/N;->z(JLjava/lang/Object;)I

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    invoke-virtual {v8, v15, v0}, Landroidx/datastore/preferences/protobuf/F;->p(II)V

    .line 180
    .line 181
    .line 182
    goto :goto_3

    .line 183
    :pswitch_7
    invoke-virtual {v6, v7, v15, v14}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-eqz v0, :cond_3

    .line 188
    .line 189
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    check-cast v0, Landroidx/datastore/preferences/protobuf/g;

    .line 194
    .line 195
    invoke-virtual {v8, v15, v0}, Landroidx/datastore/preferences/protobuf/F;->b(ILandroidx/datastore/preferences/protobuf/g;)V

    .line 196
    .line 197
    .line 198
    goto :goto_3

    .line 199
    :pswitch_8
    invoke-virtual {v6, v7, v15, v14}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    if-eqz v0, :cond_3

    .line 204
    .line 205
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v6, v14}, Landroidx/datastore/preferences/protobuf/N;->m(I)Landroidx/datastore/preferences/protobuf/W;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-virtual {v8, v15, v0, v1}, Landroidx/datastore/preferences/protobuf/F;->k(ILjava/lang/Object;Landroidx/datastore/preferences/protobuf/W;)V

    .line 214
    .line 215
    .line 216
    goto/16 :goto_3

    .line 217
    .line 218
    :pswitch_9
    invoke-virtual {v6, v7, v15, v14}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-eqz v0, :cond_3

    .line 223
    .line 224
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    instance-of v1, v0, Ljava/lang/String;

    .line 229
    .line 230
    if-eqz v1, :cond_4

    .line 231
    .line 232
    check-cast v0, Ljava/lang/String;

    .line 233
    .line 234
    iget-object v1, v8, Landroidx/datastore/preferences/protobuf/F;->a:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v1, Landroidx/datastore/preferences/protobuf/m;

    .line 237
    .line 238
    invoke-virtual {v1, v0, v15}, Landroidx/datastore/preferences/protobuf/m;->C0(Ljava/lang/String;I)V

    .line 239
    .line 240
    .line 241
    goto/16 :goto_3

    .line 242
    .line 243
    :cond_4
    check-cast v0, Landroidx/datastore/preferences/protobuf/g;

    .line 244
    .line 245
    invoke-virtual {v8, v15, v0}, Landroidx/datastore/preferences/protobuf/F;->b(ILandroidx/datastore/preferences/protobuf/g;)V

    .line 246
    .line 247
    .line 248
    goto/16 :goto_3

    .line 249
    .line 250
    :pswitch_a
    invoke-virtual {v6, v7, v15, v14}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    if-eqz v0, :cond_3

    .line 255
    .line 256
    sget-object v0, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 257
    .line 258
    invoke-virtual {v0, v1, v2, v7}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    check-cast v0, Ljava/lang/Boolean;

    .line 263
    .line 264
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    invoke-virtual {v8, v15, v0}, Landroidx/datastore/preferences/protobuf/F;->a(IZ)V

    .line 269
    .line 270
    .line 271
    goto/16 :goto_3

    .line 272
    .line 273
    :pswitch_b
    invoke-virtual {v6, v7, v15, v14}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-eqz v0, :cond_3

    .line 278
    .line 279
    invoke-static {v1, v2, v7}, Landroidx/datastore/preferences/protobuf/N;->z(JLjava/lang/Object;)I

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    invoke-virtual {v8, v15, v0}, Landroidx/datastore/preferences/protobuf/F;->e(II)V

    .line 284
    .line 285
    .line 286
    goto/16 :goto_3

    .line 287
    .line 288
    :pswitch_c
    invoke-virtual {v6, v7, v15, v14}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-eqz v0, :cond_3

    .line 293
    .line 294
    invoke-static {v1, v2, v7}, Landroidx/datastore/preferences/protobuf/N;->A(JLjava/lang/Object;)J

    .line 295
    .line 296
    .line 297
    move-result-wide v0

    .line 298
    invoke-virtual {v8, v0, v1, v15}, Landroidx/datastore/preferences/protobuf/F;->f(JI)V

    .line 299
    .line 300
    .line 301
    goto/16 :goto_3

    .line 302
    .line 303
    :pswitch_d
    invoke-virtual {v6, v7, v15, v14}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    if-eqz v0, :cond_3

    .line 308
    .line 309
    invoke-static {v1, v2, v7}, Landroidx/datastore/preferences/protobuf/N;->z(JLjava/lang/Object;)I

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    invoke-virtual {v8, v15, v0}, Landroidx/datastore/preferences/protobuf/F;->i(II)V

    .line 314
    .line 315
    .line 316
    goto/16 :goto_3

    .line 317
    .line 318
    :pswitch_e
    invoke-virtual {v6, v7, v15, v14}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 319
    .line 320
    .line 321
    move-result v0

    .line 322
    if-eqz v0, :cond_3

    .line 323
    .line 324
    invoke-static {v1, v2, v7}, Landroidx/datastore/preferences/protobuf/N;->A(JLjava/lang/Object;)J

    .line 325
    .line 326
    .line 327
    move-result-wide v0

    .line 328
    invoke-virtual {v8, v0, v1, v15}, Landroidx/datastore/preferences/protobuf/F;->q(JI)V

    .line 329
    .line 330
    .line 331
    goto/16 :goto_3

    .line 332
    .line 333
    :pswitch_f
    invoke-virtual {v6, v7, v15, v14}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    if-eqz v0, :cond_3

    .line 338
    .line 339
    invoke-static {v1, v2, v7}, Landroidx/datastore/preferences/protobuf/N;->A(JLjava/lang/Object;)J

    .line 340
    .line 341
    .line 342
    move-result-wide v0

    .line 343
    invoke-virtual {v8, v0, v1, v15}, Landroidx/datastore/preferences/protobuf/F;->j(JI)V

    .line 344
    .line 345
    .line 346
    goto/16 :goto_3

    .line 347
    .line 348
    :pswitch_10
    invoke-virtual {v6, v7, v15, v14}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 349
    .line 350
    .line 351
    move-result v0

    .line 352
    if-eqz v0, :cond_3

    .line 353
    .line 354
    sget-object v0, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 355
    .line 356
    invoke-virtual {v0, v1, v2, v7}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    check-cast v0, Ljava/lang/Float;

    .line 361
    .line 362
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    invoke-virtual {v8, v15, v0}, Landroidx/datastore/preferences/protobuf/F;->g(IF)V

    .line 367
    .line 368
    .line 369
    goto/16 :goto_3

    .line 370
    .line 371
    :pswitch_11
    invoke-virtual {v6, v7, v15, v14}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 372
    .line 373
    .line 374
    move-result v0

    .line 375
    if-eqz v0, :cond_3

    .line 376
    .line 377
    sget-object v0, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 378
    .line 379
    invoke-virtual {v0, v1, v2, v7}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    check-cast v0, Ljava/lang/Double;

    .line 384
    .line 385
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 386
    .line 387
    .line 388
    move-result-wide v0

    .line 389
    invoke-virtual {v8, v15, v0, v1}, Landroidx/datastore/preferences/protobuf/F;->c(ID)V

    .line 390
    .line 391
    .line 392
    goto/16 :goto_3

    .line 393
    .line 394
    :pswitch_12
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    if-eqz v0, :cond_3

    .line 399
    .line 400
    div-int/lit8 v1, v14, 0x3

    .line 401
    .line 402
    const/4 v2, 0x2

    .line 403
    mul-int/lit8 v1, v1, 0x2

    .line 404
    .line 405
    iget-object v3, v6, Landroidx/datastore/preferences/protobuf/N;->b:[Ljava/lang/Object;

    .line 406
    .line 407
    aget-object v1, v3, v1

    .line 408
    .line 409
    iget-object v3, v6, Landroidx/datastore/preferences/protobuf/N;->m:Landroidx/datastore/preferences/protobuf/J;

    .line 410
    .line 411
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    check-cast v1, Landroidx/datastore/preferences/protobuf/H;

    .line 415
    .line 416
    iget-object v1, v1, Landroidx/datastore/preferences/protobuf/H;->a:Landroidx/datastore/preferences/protobuf/G;

    .line 417
    .line 418
    check-cast v0, Landroidx/datastore/preferences/protobuf/I;

    .line 419
    .line 420
    iget-object v3, v8, Landroidx/datastore/preferences/protobuf/F;->a:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast v3, Landroidx/datastore/preferences/protobuf/m;

    .line 423
    .line 424
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/I;->entrySet()Ljava/util/Set;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 436
    .line 437
    .line 438
    move-result v4

    .line 439
    if-eqz v4, :cond_3

    .line 440
    .line 441
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v4

    .line 445
    check-cast v4, Ljava/util/Map$Entry;

    .line 446
    .line 447
    invoke-virtual {v3, v15, v2}, Landroidx/datastore/preferences/protobuf/m;->E0(II)V

    .line 448
    .line 449
    .line 450
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v12

    .line 454
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    invoke-static {v1, v12, v2}, Landroidx/datastore/preferences/protobuf/H;->a(Landroidx/datastore/preferences/protobuf/G;Ljava/lang/Object;Ljava/lang/Object;)I

    .line 459
    .line 460
    .line 461
    move-result v2

    .line 462
    invoke-virtual {v3, v2}, Landroidx/datastore/preferences/protobuf/m;->G0(I)V

    .line 463
    .line 464
    .line 465
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v2

    .line 469
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v4

    .line 473
    iget-object v12, v1, Landroidx/datastore/preferences/protobuf/G;->a:Landroidx/datastore/preferences/protobuf/n0;

    .line 474
    .line 475
    invoke-static {v3, v12, v5, v2}, Landroidx/datastore/preferences/protobuf/r;->b(Landroidx/datastore/preferences/protobuf/m;Landroidx/datastore/preferences/protobuf/r0;ILjava/lang/Object;)V

    .line 476
    .line 477
    .line 478
    iget-object v2, v1, Landroidx/datastore/preferences/protobuf/G;->b:Landroidx/datastore/preferences/protobuf/p0;

    .line 479
    .line 480
    const/4 v12, 0x2

    .line 481
    invoke-static {v3, v2, v12, v4}, Landroidx/datastore/preferences/protobuf/r;->b(Landroidx/datastore/preferences/protobuf/m;Landroidx/datastore/preferences/protobuf/r0;ILjava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    const/4 v2, 0x2

    .line 485
    const v12, 0xfffff

    .line 486
    .line 487
    .line 488
    goto :goto_4

    .line 489
    :pswitch_13
    aget v0, v9, v14

    .line 490
    .line 491
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v1

    .line 495
    check-cast v1, Ljava/util/List;

    .line 496
    .line 497
    invoke-virtual {v6, v14}, Landroidx/datastore/preferences/protobuf/N;->m(I)Landroidx/datastore/preferences/protobuf/W;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    invoke-static {v0, v1, v8, v2}, Landroidx/datastore/preferences/protobuf/X;->J(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Landroidx/datastore/preferences/protobuf/W;)V

    .line 502
    .line 503
    .line 504
    goto/16 :goto_3

    .line 505
    .line 506
    :pswitch_14
    aget v0, v9, v14

    .line 507
    .line 508
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v1

    .line 512
    check-cast v1, Ljava/util/List;

    .line 513
    .line 514
    invoke-static {v0, v1, v8, v5}, Landroidx/datastore/preferences/protobuf/X;->Q(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 515
    .line 516
    .line 517
    goto/16 :goto_3

    .line 518
    .line 519
    :pswitch_15
    aget v0, v9, v14

    .line 520
    .line 521
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    check-cast v1, Ljava/util/List;

    .line 526
    .line 527
    invoke-static {v0, v1, v8, v5}, Landroidx/datastore/preferences/protobuf/X;->P(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 528
    .line 529
    .line 530
    goto/16 :goto_3

    .line 531
    .line 532
    :pswitch_16
    aget v0, v9, v14

    .line 533
    .line 534
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v1

    .line 538
    check-cast v1, Ljava/util/List;

    .line 539
    .line 540
    invoke-static {v0, v1, v8, v5}, Landroidx/datastore/preferences/protobuf/X;->O(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 541
    .line 542
    .line 543
    goto/16 :goto_3

    .line 544
    .line 545
    :pswitch_17
    aget v0, v9, v14

    .line 546
    .line 547
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v1

    .line 551
    check-cast v1, Ljava/util/List;

    .line 552
    .line 553
    invoke-static {v0, v1, v8, v5}, Landroidx/datastore/preferences/protobuf/X;->N(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 554
    .line 555
    .line 556
    goto/16 :goto_3

    .line 557
    .line 558
    :pswitch_18
    aget v0, v9, v14

    .line 559
    .line 560
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v1

    .line 564
    check-cast v1, Ljava/util/List;

    .line 565
    .line 566
    invoke-static {v0, v1, v8, v5}, Landroidx/datastore/preferences/protobuf/X;->F(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 567
    .line 568
    .line 569
    goto/16 :goto_3

    .line 570
    .line 571
    :pswitch_19
    aget v0, v9, v14

    .line 572
    .line 573
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v1

    .line 577
    check-cast v1, Ljava/util/List;

    .line 578
    .line 579
    invoke-static {v0, v1, v8, v5}, Landroidx/datastore/preferences/protobuf/X;->S(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 580
    .line 581
    .line 582
    goto/16 :goto_3

    .line 583
    .line 584
    :pswitch_1a
    aget v0, v9, v14

    .line 585
    .line 586
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v1

    .line 590
    check-cast v1, Ljava/util/List;

    .line 591
    .line 592
    invoke-static {v0, v1, v8, v5}, Landroidx/datastore/preferences/protobuf/X;->C(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 593
    .line 594
    .line 595
    goto/16 :goto_3

    .line 596
    .line 597
    :pswitch_1b
    aget v0, v9, v14

    .line 598
    .line 599
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v1

    .line 603
    check-cast v1, Ljava/util/List;

    .line 604
    .line 605
    invoke-static {v0, v1, v8, v5}, Landroidx/datastore/preferences/protobuf/X;->G(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 606
    .line 607
    .line 608
    goto/16 :goto_3

    .line 609
    .line 610
    :pswitch_1c
    aget v0, v9, v14

    .line 611
    .line 612
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    check-cast v1, Ljava/util/List;

    .line 617
    .line 618
    invoke-static {v0, v1, v8, v5}, Landroidx/datastore/preferences/protobuf/X;->H(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 619
    .line 620
    .line 621
    goto/16 :goto_3

    .line 622
    .line 623
    :pswitch_1d
    aget v0, v9, v14

    .line 624
    .line 625
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v1

    .line 629
    check-cast v1, Ljava/util/List;

    .line 630
    .line 631
    invoke-static {v0, v1, v8, v5}, Landroidx/datastore/preferences/protobuf/X;->K(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 632
    .line 633
    .line 634
    goto/16 :goto_3

    .line 635
    .line 636
    :pswitch_1e
    aget v0, v9, v14

    .line 637
    .line 638
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v1

    .line 642
    check-cast v1, Ljava/util/List;

    .line 643
    .line 644
    invoke-static {v0, v1, v8, v5}, Landroidx/datastore/preferences/protobuf/X;->T(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 645
    .line 646
    .line 647
    goto/16 :goto_3

    .line 648
    .line 649
    :pswitch_1f
    aget v0, v9, v14

    .line 650
    .line 651
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    check-cast v1, Ljava/util/List;

    .line 656
    .line 657
    invoke-static {v0, v1, v8, v5}, Landroidx/datastore/preferences/protobuf/X;->L(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 658
    .line 659
    .line 660
    goto/16 :goto_3

    .line 661
    .line 662
    :pswitch_20
    aget v0, v9, v14

    .line 663
    .line 664
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    check-cast v1, Ljava/util/List;

    .line 669
    .line 670
    invoke-static {v0, v1, v8, v5}, Landroidx/datastore/preferences/protobuf/X;->I(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 671
    .line 672
    .line 673
    goto/16 :goto_3

    .line 674
    .line 675
    :pswitch_21
    aget v0, v9, v14

    .line 676
    .line 677
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v1

    .line 681
    check-cast v1, Ljava/util/List;

    .line 682
    .line 683
    invoke-static {v0, v1, v8, v5}, Landroidx/datastore/preferences/protobuf/X;->E(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 684
    .line 685
    .line 686
    goto/16 :goto_3

    .line 687
    .line 688
    :pswitch_22
    aget v0, v9, v14

    .line 689
    .line 690
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v1

    .line 694
    check-cast v1, Ljava/util/List;

    .line 695
    .line 696
    const/4 v3, 0x0

    .line 697
    invoke-static {v0, v1, v8, v3}, Landroidx/datastore/preferences/protobuf/X;->Q(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 698
    .line 699
    .line 700
    goto/16 :goto_3

    .line 701
    .line 702
    :pswitch_23
    const/4 v3, 0x0

    .line 703
    aget v0, v9, v14

    .line 704
    .line 705
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 706
    .line 707
    .line 708
    move-result-object v1

    .line 709
    check-cast v1, Ljava/util/List;

    .line 710
    .line 711
    invoke-static {v0, v1, v8, v3}, Landroidx/datastore/preferences/protobuf/X;->P(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 712
    .line 713
    .line 714
    goto/16 :goto_3

    .line 715
    .line 716
    :pswitch_24
    const/4 v3, 0x0

    .line 717
    aget v0, v9, v14

    .line 718
    .line 719
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v1

    .line 723
    check-cast v1, Ljava/util/List;

    .line 724
    .line 725
    invoke-static {v0, v1, v8, v3}, Landroidx/datastore/preferences/protobuf/X;->O(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 726
    .line 727
    .line 728
    goto/16 :goto_3

    .line 729
    .line 730
    :pswitch_25
    const/4 v3, 0x0

    .line 731
    aget v0, v9, v14

    .line 732
    .line 733
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 734
    .line 735
    .line 736
    move-result-object v1

    .line 737
    check-cast v1, Ljava/util/List;

    .line 738
    .line 739
    invoke-static {v0, v1, v8, v3}, Landroidx/datastore/preferences/protobuf/X;->N(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 740
    .line 741
    .line 742
    goto/16 :goto_3

    .line 743
    .line 744
    :pswitch_26
    const/4 v3, 0x0

    .line 745
    aget v0, v9, v14

    .line 746
    .line 747
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v1

    .line 751
    check-cast v1, Ljava/util/List;

    .line 752
    .line 753
    invoke-static {v0, v1, v8, v3}, Landroidx/datastore/preferences/protobuf/X;->F(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 754
    .line 755
    .line 756
    goto/16 :goto_3

    .line 757
    .line 758
    :pswitch_27
    const/4 v3, 0x0

    .line 759
    aget v0, v9, v14

    .line 760
    .line 761
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v1

    .line 765
    check-cast v1, Ljava/util/List;

    .line 766
    .line 767
    invoke-static {v0, v1, v8, v3}, Landroidx/datastore/preferences/protobuf/X;->S(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 768
    .line 769
    .line 770
    goto/16 :goto_3

    .line 771
    .line 772
    :pswitch_28
    aget v0, v9, v14

    .line 773
    .line 774
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    move-result-object v1

    .line 778
    check-cast v1, Ljava/util/List;

    .line 779
    .line 780
    invoke-static {v0, v1, v8}, Landroidx/datastore/preferences/protobuf/X;->D(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;)V

    .line 781
    .line 782
    .line 783
    goto/16 :goto_3

    .line 784
    .line 785
    :pswitch_29
    aget v0, v9, v14

    .line 786
    .line 787
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 788
    .line 789
    .line 790
    move-result-object v1

    .line 791
    check-cast v1, Ljava/util/List;

    .line 792
    .line 793
    invoke-virtual {v6, v14}, Landroidx/datastore/preferences/protobuf/N;->m(I)Landroidx/datastore/preferences/protobuf/W;

    .line 794
    .line 795
    .line 796
    move-result-object v2

    .line 797
    invoke-static {v0, v1, v8, v2}, Landroidx/datastore/preferences/protobuf/X;->M(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Landroidx/datastore/preferences/protobuf/W;)V

    .line 798
    .line 799
    .line 800
    goto/16 :goto_3

    .line 801
    .line 802
    :pswitch_2a
    aget v0, v9, v14

    .line 803
    .line 804
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    move-result-object v1

    .line 808
    check-cast v1, Ljava/util/List;

    .line 809
    .line 810
    invoke-static {v0, v1, v8}, Landroidx/datastore/preferences/protobuf/X;->R(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;)V

    .line 811
    .line 812
    .line 813
    goto/16 :goto_3

    .line 814
    .line 815
    :pswitch_2b
    aget v0, v9, v14

    .line 816
    .line 817
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    move-result-object v1

    .line 821
    check-cast v1, Ljava/util/List;

    .line 822
    .line 823
    const/4 v12, 0x0

    .line 824
    invoke-static {v0, v1, v8, v12}, Landroidx/datastore/preferences/protobuf/X;->C(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 825
    .line 826
    .line 827
    goto/16 :goto_3

    .line 828
    .line 829
    :pswitch_2c
    const/4 v12, 0x0

    .line 830
    aget v0, v9, v14

    .line 831
    .line 832
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    move-result-object v1

    .line 836
    check-cast v1, Ljava/util/List;

    .line 837
    .line 838
    invoke-static {v0, v1, v8, v12}, Landroidx/datastore/preferences/protobuf/X;->G(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 839
    .line 840
    .line 841
    goto/16 :goto_3

    .line 842
    .line 843
    :pswitch_2d
    const/4 v12, 0x0

    .line 844
    aget v0, v9, v14

    .line 845
    .line 846
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 847
    .line 848
    .line 849
    move-result-object v1

    .line 850
    check-cast v1, Ljava/util/List;

    .line 851
    .line 852
    invoke-static {v0, v1, v8, v12}, Landroidx/datastore/preferences/protobuf/X;->H(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 853
    .line 854
    .line 855
    goto/16 :goto_3

    .line 856
    .line 857
    :pswitch_2e
    const/4 v12, 0x0

    .line 858
    aget v0, v9, v14

    .line 859
    .line 860
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 861
    .line 862
    .line 863
    move-result-object v1

    .line 864
    check-cast v1, Ljava/util/List;

    .line 865
    .line 866
    invoke-static {v0, v1, v8, v12}, Landroidx/datastore/preferences/protobuf/X;->K(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 867
    .line 868
    .line 869
    goto/16 :goto_3

    .line 870
    .line 871
    :pswitch_2f
    const/4 v12, 0x0

    .line 872
    aget v0, v9, v14

    .line 873
    .line 874
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 875
    .line 876
    .line 877
    move-result-object v1

    .line 878
    check-cast v1, Ljava/util/List;

    .line 879
    .line 880
    invoke-static {v0, v1, v8, v12}, Landroidx/datastore/preferences/protobuf/X;->T(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 881
    .line 882
    .line 883
    goto/16 :goto_3

    .line 884
    .line 885
    :pswitch_30
    const/4 v12, 0x0

    .line 886
    aget v0, v9, v14

    .line 887
    .line 888
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 889
    .line 890
    .line 891
    move-result-object v1

    .line 892
    check-cast v1, Ljava/util/List;

    .line 893
    .line 894
    invoke-static {v0, v1, v8, v12}, Landroidx/datastore/preferences/protobuf/X;->L(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 895
    .line 896
    .line 897
    goto/16 :goto_3

    .line 898
    .line 899
    :pswitch_31
    const/4 v12, 0x0

    .line 900
    aget v0, v9, v14

    .line 901
    .line 902
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 903
    .line 904
    .line 905
    move-result-object v1

    .line 906
    check-cast v1, Ljava/util/List;

    .line 907
    .line 908
    invoke-static {v0, v1, v8, v12}, Landroidx/datastore/preferences/protobuf/X;->I(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 909
    .line 910
    .line 911
    goto/16 :goto_3

    .line 912
    .line 913
    :pswitch_32
    const/4 v12, 0x0

    .line 914
    aget v0, v9, v14

    .line 915
    .line 916
    invoke-virtual {v11, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 917
    .line 918
    .line 919
    move-result-object v1

    .line 920
    check-cast v1, Ljava/util/List;

    .line 921
    .line 922
    invoke-static {v0, v1, v8, v12}, Landroidx/datastore/preferences/protobuf/X;->E(ILjava/util/List;Landroidx/datastore/preferences/protobuf/F;Z)V

    .line 923
    .line 924
    .line 925
    goto/16 :goto_3

    .line 926
    .line 927
    :pswitch_33
    const/4 v12, 0x0

    .line 928
    move-object/from16 v0, p0

    .line 929
    .line 930
    move-wide v4, v1

    .line 931
    move-object/from16 v1, p1

    .line 932
    .line 933
    move v2, v14

    .line 934
    move v3, v13

    .line 935
    move/from16 v16, v13

    .line 936
    .line 937
    move-wide v12, v4

    .line 938
    move/from16 v4, v17

    .line 939
    .line 940
    move/from16 v5, v18

    .line 941
    .line 942
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 943
    .line 944
    .line 945
    move-result v0

    .line 946
    if-eqz v0, :cond_6

    .line 947
    .line 948
    invoke-virtual {v11, v7, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    move-result-object v0

    .line 952
    invoke-virtual {v6, v14}, Landroidx/datastore/preferences/protobuf/N;->m(I)Landroidx/datastore/preferences/protobuf/W;

    .line 953
    .line 954
    .line 955
    move-result-object v1

    .line 956
    invoke-virtual {v8, v15, v0, v1}, Landroidx/datastore/preferences/protobuf/F;->h(ILjava/lang/Object;Landroidx/datastore/preferences/protobuf/W;)V

    .line 957
    .line 958
    .line 959
    goto/16 :goto_5

    .line 960
    .line 961
    :pswitch_34
    move/from16 v16, v13

    .line 962
    .line 963
    move-wide v12, v1

    .line 964
    move-object/from16 v0, p0

    .line 965
    .line 966
    move-object/from16 v1, p1

    .line 967
    .line 968
    move v2, v14

    .line 969
    move/from16 v3, v16

    .line 970
    .line 971
    move/from16 v4, v17

    .line 972
    .line 973
    move/from16 v5, v18

    .line 974
    .line 975
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 976
    .line 977
    .line 978
    move-result v0

    .line 979
    if-eqz v0, :cond_6

    .line 980
    .line 981
    invoke-virtual {v11, v7, v12, v13}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 982
    .line 983
    .line 984
    move-result-wide v0

    .line 985
    invoke-virtual {v8, v0, v1, v15}, Landroidx/datastore/preferences/protobuf/F;->o(JI)V

    .line 986
    .line 987
    .line 988
    goto/16 :goto_5

    .line 989
    .line 990
    :pswitch_35
    move/from16 v16, v13

    .line 991
    .line 992
    move-wide v12, v1

    .line 993
    move-object/from16 v0, p0

    .line 994
    .line 995
    move-object/from16 v1, p1

    .line 996
    .line 997
    move v2, v14

    .line 998
    move/from16 v3, v16

    .line 999
    .line 1000
    move/from16 v4, v17

    .line 1001
    .line 1002
    move/from16 v5, v18

    .line 1003
    .line 1004
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1005
    .line 1006
    .line 1007
    move-result v0

    .line 1008
    if-eqz v0, :cond_6

    .line 1009
    .line 1010
    invoke-virtual {v11, v7, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1011
    .line 1012
    .line 1013
    move-result v0

    .line 1014
    invoke-virtual {v8, v15, v0}, Landroidx/datastore/preferences/protobuf/F;->n(II)V

    .line 1015
    .line 1016
    .line 1017
    goto/16 :goto_5

    .line 1018
    .line 1019
    :pswitch_36
    move/from16 v16, v13

    .line 1020
    .line 1021
    move-wide v12, v1

    .line 1022
    move-object/from16 v0, p0

    .line 1023
    .line 1024
    move-object/from16 v1, p1

    .line 1025
    .line 1026
    move v2, v14

    .line 1027
    move/from16 v3, v16

    .line 1028
    .line 1029
    move/from16 v4, v17

    .line 1030
    .line 1031
    move/from16 v5, v18

    .line 1032
    .line 1033
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1034
    .line 1035
    .line 1036
    move-result v0

    .line 1037
    if-eqz v0, :cond_6

    .line 1038
    .line 1039
    invoke-virtual {v11, v7, v12, v13}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1040
    .line 1041
    .line 1042
    move-result-wide v0

    .line 1043
    invoke-virtual {v8, v0, v1, v15}, Landroidx/datastore/preferences/protobuf/F;->m(JI)V

    .line 1044
    .line 1045
    .line 1046
    goto/16 :goto_5

    .line 1047
    .line 1048
    :pswitch_37
    move/from16 v16, v13

    .line 1049
    .line 1050
    move-wide v12, v1

    .line 1051
    move-object/from16 v0, p0

    .line 1052
    .line 1053
    move-object/from16 v1, p1

    .line 1054
    .line 1055
    move v2, v14

    .line 1056
    move/from16 v3, v16

    .line 1057
    .line 1058
    move/from16 v4, v17

    .line 1059
    .line 1060
    move/from16 v5, v18

    .line 1061
    .line 1062
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1063
    .line 1064
    .line 1065
    move-result v0

    .line 1066
    if-eqz v0, :cond_6

    .line 1067
    .line 1068
    invoke-virtual {v11, v7, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1069
    .line 1070
    .line 1071
    move-result v0

    .line 1072
    invoke-virtual {v8, v15, v0}, Landroidx/datastore/preferences/protobuf/F;->l(II)V

    .line 1073
    .line 1074
    .line 1075
    goto/16 :goto_5

    .line 1076
    .line 1077
    :pswitch_38
    move/from16 v16, v13

    .line 1078
    .line 1079
    move-wide v12, v1

    .line 1080
    move-object/from16 v0, p0

    .line 1081
    .line 1082
    move-object/from16 v1, p1

    .line 1083
    .line 1084
    move v2, v14

    .line 1085
    move/from16 v3, v16

    .line 1086
    .line 1087
    move/from16 v4, v17

    .line 1088
    .line 1089
    move/from16 v5, v18

    .line 1090
    .line 1091
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1092
    .line 1093
    .line 1094
    move-result v0

    .line 1095
    if-eqz v0, :cond_6

    .line 1096
    .line 1097
    invoke-virtual {v11, v7, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1098
    .line 1099
    .line 1100
    move-result v0

    .line 1101
    invoke-virtual {v8, v15, v0}, Landroidx/datastore/preferences/protobuf/F;->d(II)V

    .line 1102
    .line 1103
    .line 1104
    goto/16 :goto_5

    .line 1105
    .line 1106
    :pswitch_39
    move/from16 v16, v13

    .line 1107
    .line 1108
    move-wide v12, v1

    .line 1109
    move-object/from16 v0, p0

    .line 1110
    .line 1111
    move-object/from16 v1, p1

    .line 1112
    .line 1113
    move v2, v14

    .line 1114
    move/from16 v3, v16

    .line 1115
    .line 1116
    move/from16 v4, v17

    .line 1117
    .line 1118
    move/from16 v5, v18

    .line 1119
    .line 1120
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1121
    .line 1122
    .line 1123
    move-result v0

    .line 1124
    if-eqz v0, :cond_6

    .line 1125
    .line 1126
    invoke-virtual {v11, v7, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1127
    .line 1128
    .line 1129
    move-result v0

    .line 1130
    invoke-virtual {v8, v15, v0}, Landroidx/datastore/preferences/protobuf/F;->p(II)V

    .line 1131
    .line 1132
    .line 1133
    goto/16 :goto_5

    .line 1134
    .line 1135
    :pswitch_3a
    move/from16 v16, v13

    .line 1136
    .line 1137
    move-wide v12, v1

    .line 1138
    move-object/from16 v0, p0

    .line 1139
    .line 1140
    move-object/from16 v1, p1

    .line 1141
    .line 1142
    move v2, v14

    .line 1143
    move/from16 v3, v16

    .line 1144
    .line 1145
    move/from16 v4, v17

    .line 1146
    .line 1147
    move/from16 v5, v18

    .line 1148
    .line 1149
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1150
    .line 1151
    .line 1152
    move-result v0

    .line 1153
    if-eqz v0, :cond_6

    .line 1154
    .line 1155
    invoke-virtual {v11, v7, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v0

    .line 1159
    check-cast v0, Landroidx/datastore/preferences/protobuf/g;

    .line 1160
    .line 1161
    invoke-virtual {v8, v15, v0}, Landroidx/datastore/preferences/protobuf/F;->b(ILandroidx/datastore/preferences/protobuf/g;)V

    .line 1162
    .line 1163
    .line 1164
    goto/16 :goto_5

    .line 1165
    .line 1166
    :pswitch_3b
    move/from16 v16, v13

    .line 1167
    .line 1168
    move-wide v12, v1

    .line 1169
    move-object/from16 v0, p0

    .line 1170
    .line 1171
    move-object/from16 v1, p1

    .line 1172
    .line 1173
    move v2, v14

    .line 1174
    move/from16 v3, v16

    .line 1175
    .line 1176
    move/from16 v4, v17

    .line 1177
    .line 1178
    move/from16 v5, v18

    .line 1179
    .line 1180
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1181
    .line 1182
    .line 1183
    move-result v0

    .line 1184
    if-eqz v0, :cond_6

    .line 1185
    .line 1186
    invoke-virtual {v11, v7, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v0

    .line 1190
    invoke-virtual {v6, v14}, Landroidx/datastore/preferences/protobuf/N;->m(I)Landroidx/datastore/preferences/protobuf/W;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v1

    .line 1194
    invoke-virtual {v8, v15, v0, v1}, Landroidx/datastore/preferences/protobuf/F;->k(ILjava/lang/Object;Landroidx/datastore/preferences/protobuf/W;)V

    .line 1195
    .line 1196
    .line 1197
    goto/16 :goto_5

    .line 1198
    .line 1199
    :pswitch_3c
    move/from16 v16, v13

    .line 1200
    .line 1201
    move-wide v12, v1

    .line 1202
    move-object/from16 v0, p0

    .line 1203
    .line 1204
    move-object/from16 v1, p1

    .line 1205
    .line 1206
    move v2, v14

    .line 1207
    move/from16 v3, v16

    .line 1208
    .line 1209
    move/from16 v4, v17

    .line 1210
    .line 1211
    move/from16 v5, v18

    .line 1212
    .line 1213
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1214
    .line 1215
    .line 1216
    move-result v0

    .line 1217
    if-eqz v0, :cond_6

    .line 1218
    .line 1219
    invoke-virtual {v11, v7, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v0

    .line 1223
    instance-of v1, v0, Ljava/lang/String;

    .line 1224
    .line 1225
    if-eqz v1, :cond_5

    .line 1226
    .line 1227
    check-cast v0, Ljava/lang/String;

    .line 1228
    .line 1229
    iget-object v1, v8, Landroidx/datastore/preferences/protobuf/F;->a:Ljava/lang/Object;

    .line 1230
    .line 1231
    check-cast v1, Landroidx/datastore/preferences/protobuf/m;

    .line 1232
    .line 1233
    invoke-virtual {v1, v0, v15}, Landroidx/datastore/preferences/protobuf/m;->C0(Ljava/lang/String;I)V

    .line 1234
    .line 1235
    .line 1236
    goto/16 :goto_5

    .line 1237
    .line 1238
    :cond_5
    check-cast v0, Landroidx/datastore/preferences/protobuf/g;

    .line 1239
    .line 1240
    invoke-virtual {v8, v15, v0}, Landroidx/datastore/preferences/protobuf/F;->b(ILandroidx/datastore/preferences/protobuf/g;)V

    .line 1241
    .line 1242
    .line 1243
    goto/16 :goto_5

    .line 1244
    .line 1245
    :pswitch_3d
    move/from16 v16, v13

    .line 1246
    .line 1247
    move-wide v12, v1

    .line 1248
    move-object/from16 v0, p0

    .line 1249
    .line 1250
    move-object/from16 v1, p1

    .line 1251
    .line 1252
    move v2, v14

    .line 1253
    move/from16 v3, v16

    .line 1254
    .line 1255
    move/from16 v4, v17

    .line 1256
    .line 1257
    move/from16 v5, v18

    .line 1258
    .line 1259
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1260
    .line 1261
    .line 1262
    move-result v0

    .line 1263
    if-eqz v0, :cond_6

    .line 1264
    .line 1265
    sget-object v0, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 1266
    .line 1267
    invoke-virtual {v0, v12, v13, v7}, Landroidx/datastore/preferences/protobuf/i0;->c(JLjava/lang/Object;)Z

    .line 1268
    .line 1269
    .line 1270
    move-result v0

    .line 1271
    invoke-virtual {v8, v15, v0}, Landroidx/datastore/preferences/protobuf/F;->a(IZ)V

    .line 1272
    .line 1273
    .line 1274
    goto/16 :goto_5

    .line 1275
    .line 1276
    :pswitch_3e
    move/from16 v16, v13

    .line 1277
    .line 1278
    move-wide v12, v1

    .line 1279
    move-object/from16 v0, p0

    .line 1280
    .line 1281
    move-object/from16 v1, p1

    .line 1282
    .line 1283
    move v2, v14

    .line 1284
    move/from16 v3, v16

    .line 1285
    .line 1286
    move/from16 v4, v17

    .line 1287
    .line 1288
    move/from16 v5, v18

    .line 1289
    .line 1290
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1291
    .line 1292
    .line 1293
    move-result v0

    .line 1294
    if-eqz v0, :cond_6

    .line 1295
    .line 1296
    invoke-virtual {v11, v7, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1297
    .line 1298
    .line 1299
    move-result v0

    .line 1300
    invoke-virtual {v8, v15, v0}, Landroidx/datastore/preferences/protobuf/F;->e(II)V

    .line 1301
    .line 1302
    .line 1303
    goto/16 :goto_5

    .line 1304
    .line 1305
    :pswitch_3f
    move/from16 v16, v13

    .line 1306
    .line 1307
    move-wide v12, v1

    .line 1308
    move-object/from16 v0, p0

    .line 1309
    .line 1310
    move-object/from16 v1, p1

    .line 1311
    .line 1312
    move v2, v14

    .line 1313
    move/from16 v3, v16

    .line 1314
    .line 1315
    move/from16 v4, v17

    .line 1316
    .line 1317
    move/from16 v5, v18

    .line 1318
    .line 1319
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1320
    .line 1321
    .line 1322
    move-result v0

    .line 1323
    if-eqz v0, :cond_6

    .line 1324
    .line 1325
    invoke-virtual {v11, v7, v12, v13}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1326
    .line 1327
    .line 1328
    move-result-wide v0

    .line 1329
    invoke-virtual {v8, v0, v1, v15}, Landroidx/datastore/preferences/protobuf/F;->f(JI)V

    .line 1330
    .line 1331
    .line 1332
    goto/16 :goto_5

    .line 1333
    .line 1334
    :pswitch_40
    move/from16 v16, v13

    .line 1335
    .line 1336
    move-wide v12, v1

    .line 1337
    move-object/from16 v0, p0

    .line 1338
    .line 1339
    move-object/from16 v1, p1

    .line 1340
    .line 1341
    move v2, v14

    .line 1342
    move/from16 v3, v16

    .line 1343
    .line 1344
    move/from16 v4, v17

    .line 1345
    .line 1346
    move/from16 v5, v18

    .line 1347
    .line 1348
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1349
    .line 1350
    .line 1351
    move-result v0

    .line 1352
    if-eqz v0, :cond_6

    .line 1353
    .line 1354
    invoke-virtual {v11, v7, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1355
    .line 1356
    .line 1357
    move-result v0

    .line 1358
    invoke-virtual {v8, v15, v0}, Landroidx/datastore/preferences/protobuf/F;->i(II)V

    .line 1359
    .line 1360
    .line 1361
    goto/16 :goto_5

    .line 1362
    .line 1363
    :pswitch_41
    move/from16 v16, v13

    .line 1364
    .line 1365
    move-wide v12, v1

    .line 1366
    move-object/from16 v0, p0

    .line 1367
    .line 1368
    move-object/from16 v1, p1

    .line 1369
    .line 1370
    move v2, v14

    .line 1371
    move/from16 v3, v16

    .line 1372
    .line 1373
    move/from16 v4, v17

    .line 1374
    .line 1375
    move/from16 v5, v18

    .line 1376
    .line 1377
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1378
    .line 1379
    .line 1380
    move-result v0

    .line 1381
    if-eqz v0, :cond_6

    .line 1382
    .line 1383
    invoke-virtual {v11, v7, v12, v13}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1384
    .line 1385
    .line 1386
    move-result-wide v0

    .line 1387
    invoke-virtual {v8, v0, v1, v15}, Landroidx/datastore/preferences/protobuf/F;->q(JI)V

    .line 1388
    .line 1389
    .line 1390
    goto :goto_5

    .line 1391
    :pswitch_42
    move/from16 v16, v13

    .line 1392
    .line 1393
    move-wide v12, v1

    .line 1394
    move-object/from16 v0, p0

    .line 1395
    .line 1396
    move-object/from16 v1, p1

    .line 1397
    .line 1398
    move v2, v14

    .line 1399
    move/from16 v3, v16

    .line 1400
    .line 1401
    move/from16 v4, v17

    .line 1402
    .line 1403
    move/from16 v5, v18

    .line 1404
    .line 1405
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1406
    .line 1407
    .line 1408
    move-result v0

    .line 1409
    if-eqz v0, :cond_6

    .line 1410
    .line 1411
    invoke-virtual {v11, v7, v12, v13}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1412
    .line 1413
    .line 1414
    move-result-wide v0

    .line 1415
    invoke-virtual {v8, v0, v1, v15}, Landroidx/datastore/preferences/protobuf/F;->j(JI)V

    .line 1416
    .line 1417
    .line 1418
    goto :goto_5

    .line 1419
    :pswitch_43
    move/from16 v16, v13

    .line 1420
    .line 1421
    move-wide v12, v1

    .line 1422
    move-object/from16 v0, p0

    .line 1423
    .line 1424
    move-object/from16 v1, p1

    .line 1425
    .line 1426
    move v2, v14

    .line 1427
    move/from16 v3, v16

    .line 1428
    .line 1429
    move/from16 v4, v17

    .line 1430
    .line 1431
    move/from16 v5, v18

    .line 1432
    .line 1433
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1434
    .line 1435
    .line 1436
    move-result v0

    .line 1437
    if-eqz v0, :cond_6

    .line 1438
    .line 1439
    sget-object v0, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 1440
    .line 1441
    invoke-virtual {v0, v12, v13, v7}, Landroidx/datastore/preferences/protobuf/i0;->e(JLjava/lang/Object;)F

    .line 1442
    .line 1443
    .line 1444
    move-result v0

    .line 1445
    invoke-virtual {v8, v15, v0}, Landroidx/datastore/preferences/protobuf/F;->g(IF)V

    .line 1446
    .line 1447
    .line 1448
    goto :goto_5

    .line 1449
    :pswitch_44
    move/from16 v16, v13

    .line 1450
    .line 1451
    move-wide v12, v1

    .line 1452
    move-object/from16 v0, p0

    .line 1453
    .line 1454
    move-object/from16 v1, p1

    .line 1455
    .line 1456
    move v2, v14

    .line 1457
    move/from16 v3, v16

    .line 1458
    .line 1459
    move/from16 v4, v17

    .line 1460
    .line 1461
    move/from16 v5, v18

    .line 1462
    .line 1463
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1464
    .line 1465
    .line 1466
    move-result v0

    .line 1467
    if-eqz v0, :cond_6

    .line 1468
    .line 1469
    sget-object v0, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 1470
    .line 1471
    invoke-virtual {v0, v12, v13, v7}, Landroidx/datastore/preferences/protobuf/i0;->d(JLjava/lang/Object;)D

    .line 1472
    .line 1473
    .line 1474
    move-result-wide v0

    .line 1475
    invoke-virtual {v8, v15, v0, v1}, Landroidx/datastore/preferences/protobuf/F;->c(ID)V

    .line 1476
    .line 1477
    .line 1478
    :cond_6
    :goto_5
    add-int/lit8 v14, v14, 0x3

    .line 1479
    .line 1480
    move/from16 v0, v16

    .line 1481
    .line 1482
    move/from16 v1, v17

    .line 1483
    .line 1484
    const v12, 0xfffff

    .line 1485
    .line 1486
    .line 1487
    goto/16 :goto_0

    .line 1488
    .line 1489
    :cond_7
    iget-object v0, v6, Landroidx/datastore/preferences/protobuf/N;->l:Landroidx/datastore/preferences/protobuf/e0;

    .line 1490
    .line 1491
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1492
    .line 1493
    .line 1494
    move-object v0, v7

    .line 1495
    check-cast v0, Landroidx/datastore/preferences/protobuf/w;

    .line 1496
    .line 1497
    iget-object v0, v0, Landroidx/datastore/preferences/protobuf/w;->unknownFields:Landroidx/datastore/preferences/protobuf/d0;

    .line 1498
    .line 1499
    invoke-virtual {v0, v8}, Landroidx/datastore/preferences/protobuf/d0;->d(Landroidx/datastore/preferences/protobuf/F;)V

    .line 1500
    .line 1501
    .line 1502
    return-void

    .line 1503
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Ljava/lang/Object;)Z
    .locals 17

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    const v8, 0xfffff

    .line 6
    .line 7
    .line 8
    const/4 v9, 0x0

    .line 9
    const v0, 0xfffff

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v10, 0x0

    .line 14
    :goto_0
    iget v2, v6, Landroidx/datastore/preferences/protobuf/N;->h:I

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    if-ge v10, v2, :cond_e

    .line 18
    .line 19
    iget-object v2, v6, Landroidx/datastore/preferences/protobuf/N;->g:[I

    .line 20
    .line 21
    aget v11, v2, v10

    .line 22
    .line 23
    iget-object v2, v6, Landroidx/datastore/preferences/protobuf/N;->a:[I

    .line 24
    .line 25
    aget v12, v2, v11

    .line 26
    .line 27
    invoke-virtual {v6, v11}, Landroidx/datastore/preferences/protobuf/N;->M(I)I

    .line 28
    .line 29
    .line 30
    move-result v13

    .line 31
    add-int/lit8 v4, v11, 0x2

    .line 32
    .line 33
    aget v2, v2, v4

    .line 34
    .line 35
    and-int v4, v2, v8

    .line 36
    .line 37
    ushr-int/lit8 v2, v2, 0x14

    .line 38
    .line 39
    shl-int v14, v3, v2

    .line 40
    .line 41
    if-eq v4, v0, :cond_1

    .line 42
    .line 43
    if-eq v4, v8, :cond_0

    .line 44
    .line 45
    sget-object v0, Landroidx/datastore/preferences/protobuf/N;->o:Lsun/misc/Unsafe;

    .line 46
    .line 47
    int-to-long v1, v4

    .line 48
    invoke-virtual {v0, v7, v1, v2}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    :cond_0
    move/from16 v16, v1

    .line 53
    .line 54
    move v15, v4

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move v15, v0

    .line 57
    move/from16 v16, v1

    .line 58
    .line 59
    :goto_1
    const/high16 v0, 0x10000000

    .line 60
    .line 61
    and-int/2addr v0, v13

    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    move-object/from16 v0, p0

    .line 65
    .line 66
    move-object/from16 v1, p1

    .line 67
    .line 68
    move v2, v11

    .line 69
    move v3, v15

    .line 70
    move/from16 v4, v16

    .line 71
    .line 72
    move v5, v14

    .line 73
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_2

    .line 78
    .line 79
    return v9

    .line 80
    :cond_2
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/N;->L(I)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    const/16 v1, 0x9

    .line 85
    .line 86
    if-eq v0, v1, :cond_c

    .line 87
    .line 88
    const/16 v1, 0x11

    .line 89
    .line 90
    if-eq v0, v1, :cond_c

    .line 91
    .line 92
    const/16 v1, 0x1b

    .line 93
    .line 94
    if-eq v0, v1, :cond_9

    .line 95
    .line 96
    const/16 v1, 0x3c

    .line 97
    .line 98
    if-eq v0, v1, :cond_8

    .line 99
    .line 100
    const/16 v1, 0x44

    .line 101
    .line 102
    if-eq v0, v1, :cond_8

    .line 103
    .line 104
    const/16 v1, 0x31

    .line 105
    .line 106
    if-eq v0, v1, :cond_9

    .line 107
    .line 108
    const/16 v1, 0x32

    .line 109
    .line 110
    if-eq v0, v1, :cond_3

    .line 111
    .line 112
    goto/16 :goto_3

    .line 113
    .line 114
    :cond_3
    and-int v0, v13, v8

    .line 115
    .line 116
    int-to-long v0, v0

    .line 117
    sget-object v2, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 118
    .line 119
    invoke-virtual {v2, v0, v1, v7}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    iget-object v1, v6, Landroidx/datastore/preferences/protobuf/N;->m:Landroidx/datastore/preferences/protobuf/J;

    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    check-cast v0, Landroidx/datastore/preferences/protobuf/I;

    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eqz v1, :cond_4

    .line 135
    .line 136
    goto/16 :goto_3

    .line 137
    .line 138
    :cond_4
    div-int/lit8 v11, v11, 0x3

    .line 139
    .line 140
    mul-int/lit8 v11, v11, 0x2

    .line 141
    .line 142
    iget-object v1, v6, Landroidx/datastore/preferences/protobuf/N;->b:[Ljava/lang/Object;

    .line 143
    .line 144
    aget-object v1, v1, v11

    .line 145
    .line 146
    check-cast v1, Landroidx/datastore/preferences/protobuf/H;

    .line 147
    .line 148
    iget-object v1, v1, Landroidx/datastore/preferences/protobuf/H;->a:Landroidx/datastore/preferences/protobuf/G;

    .line 149
    .line 150
    iget-object v1, v1, Landroidx/datastore/preferences/protobuf/G;->b:Landroidx/datastore/preferences/protobuf/p0;

    .line 151
    .line 152
    iget-object v1, v1, Landroidx/datastore/preferences/protobuf/r0;->e:Landroidx/datastore/preferences/protobuf/s0;

    .line 153
    .line 154
    sget-object v2, Landroidx/datastore/preferences/protobuf/s0;->m:Landroidx/datastore/preferences/protobuf/s0;

    .line 155
    .line 156
    if-eq v1, v2, :cond_5

    .line 157
    .line 158
    goto/16 :goto_3

    .line 159
    .line 160
    :cond_5
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    const/4 v1, 0x0

    .line 169
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-eqz v2, :cond_d

    .line 174
    .line 175
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    if-nez v1, :cond_7

    .line 180
    .line 181
    sget-object v1, Landroidx/datastore/preferences/protobuf/T;->c:Landroidx/datastore/preferences/protobuf/T;

    .line 182
    .line 183
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-virtual {v1, v3}, Landroidx/datastore/preferences/protobuf/T;->a(Ljava/lang/Class;)Landroidx/datastore/preferences/protobuf/W;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    :cond_7
    invoke-interface {v1, v2}, Landroidx/datastore/preferences/protobuf/W;->a(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    if-nez v2, :cond_6

    .line 196
    .line 197
    return v9

    .line 198
    :cond_8
    invoke-virtual {v6, v7, v12, v11}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_d

    .line 203
    .line 204
    invoke-virtual {v6, v11}, Landroidx/datastore/preferences/protobuf/N;->m(I)Landroidx/datastore/preferences/protobuf/W;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    and-int v1, v13, v8

    .line 209
    .line 210
    int-to-long v1, v1

    .line 211
    sget-object v3, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 212
    .line 213
    invoke-virtual {v3, v1, v2, v7}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    invoke-interface {v0, v1}, Landroidx/datastore/preferences/protobuf/W;->a(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-nez v0, :cond_d

    .line 222
    .line 223
    return v9

    .line 224
    :cond_9
    and-int v0, v13, v8

    .line 225
    .line 226
    int-to-long v0, v0

    .line 227
    sget-object v2, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 228
    .line 229
    invoke-virtual {v2, v0, v1, v7}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    check-cast v0, Ljava/util/List;

    .line 234
    .line 235
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    if-eqz v1, :cond_a

    .line 240
    .line 241
    goto :goto_3

    .line 242
    :cond_a
    invoke-virtual {v6, v11}, Landroidx/datastore/preferences/protobuf/N;->m(I)Landroidx/datastore/preferences/protobuf/W;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    const/4 v2, 0x0

    .line 247
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    if-ge v2, v3, :cond_d

    .line 252
    .line 253
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    invoke-interface {v1, v3}, Landroidx/datastore/preferences/protobuf/W;->a(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    if-nez v3, :cond_b

    .line 262
    .line 263
    return v9

    .line 264
    :cond_b
    add-int/lit8 v2, v2, 0x1

    .line 265
    .line 266
    goto :goto_2

    .line 267
    :cond_c
    move-object/from16 v0, p0

    .line 268
    .line 269
    move-object/from16 v1, p1

    .line 270
    .line 271
    move v2, v11

    .line 272
    move v3, v15

    .line 273
    move/from16 v4, v16

    .line 274
    .line 275
    move v5, v14

    .line 276
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    if-eqz v0, :cond_d

    .line 281
    .line 282
    invoke-virtual {v6, v11}, Landroidx/datastore/preferences/protobuf/N;->m(I)Landroidx/datastore/preferences/protobuf/W;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    and-int v1, v13, v8

    .line 287
    .line 288
    int-to-long v1, v1

    .line 289
    sget-object v3, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 290
    .line 291
    invoke-virtual {v3, v1, v2, v7}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    invoke-interface {v0, v1}, Landroidx/datastore/preferences/protobuf/W;->a(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    if-nez v0, :cond_d

    .line 300
    .line 301
    return v9

    .line 302
    :cond_d
    :goto_3
    add-int/lit8 v10, v10, 0x1

    .line 303
    .line 304
    move v0, v15

    .line 305
    move/from16 v1, v16

    .line 306
    .line 307
    goto/16 :goto_0

    .line 308
    .line 309
    :cond_e
    return v3
.end method

.method public final b(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/k;Landroidx/datastore/preferences/protobuf/o;)V
    .locals 1

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/N;->p(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/N;->l:Landroidx/datastore/preferences/protobuf/e0;

    .line 11
    .line 12
    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/N;->r(Landroidx/datastore/preferences/protobuf/e0;Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/k;Landroidx/datastore/preferences/protobuf/o;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    new-instance p3, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v0, "Mutating immutable message: "

    .line 21
    .line 22
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p2
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 10

    .line 1
    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/N;->p(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/N;->a:[I

    .line 12
    .line 13
    array-length v2, v1

    .line 14
    if-ge v0, v2, :cond_4

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/N;->M(I)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const v3, 0xfffff

    .line 21
    .line 22
    .line 23
    and-int/2addr v3, v2

    .line 24
    int-to-long v6, v3

    .line 25
    aget v1, v1, v0

    .line 26
    .line 27
    invoke-static {v2}, Landroidx/datastore/preferences/protobuf/N;->L(I)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    packed-switch v2, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    goto/16 :goto_1

    .line 35
    .line 36
    :pswitch_0
    invoke-virtual {p0, v0, p1, p2}, Landroidx/datastore/preferences/protobuf/N;->u(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_1

    .line 40
    .line 41
    :pswitch_1
    invoke-virtual {p0, p2, v1, v0}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    sget-object v2, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 48
    .line 49
    invoke-virtual {v2, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {p1, v6, v7, v2}, Landroidx/datastore/preferences/protobuf/j0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, p1, v1, v0}, Landroidx/datastore/preferences/protobuf/N;->I(Ljava/lang/Object;II)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_1

    .line 60
    .line 61
    :pswitch_2
    invoke-virtual {p0, v0, p1, p2}, Landroidx/datastore/preferences/protobuf/N;->u(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_1

    .line 65
    .line 66
    :pswitch_3
    invoke-virtual {p0, p2, v1, v0}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_3

    .line 71
    .line 72
    sget-object v2, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 73
    .line 74
    invoke-virtual {v2, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-static {p1, v6, v7, v2}, Landroidx/datastore/preferences/protobuf/j0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, p1, v1, v0}, Landroidx/datastore/preferences/protobuf/N;->I(Ljava/lang/Object;II)V

    .line 82
    .line 83
    .line 84
    goto/16 :goto_1

    .line 85
    .line 86
    :pswitch_4
    sget-object v1, Landroidx/datastore/preferences/protobuf/X;->a:Ljava/lang/Class;

    .line 87
    .line 88
    sget-object v1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 89
    .line 90
    invoke-virtual {v1, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    iget-object v3, p0, Landroidx/datastore/preferences/protobuf/N;->m:Landroidx/datastore/preferences/protobuf/J;

    .line 99
    .line 100
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-static {v2, v1}, Landroidx/datastore/preferences/protobuf/J;->b(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/I;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-static {p1, v6, v7, v1}, Landroidx/datastore/preferences/protobuf/j0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto/16 :goto_1

    .line 111
    .line 112
    :pswitch_5
    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/N;->k:Landroidx/datastore/preferences/protobuf/C;

    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    sget-object v1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 118
    .line 119
    invoke-virtual {v1, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    check-cast v2, Landroidx/datastore/preferences/protobuf/x;

    .line 124
    .line 125
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    check-cast v1, Landroidx/datastore/preferences/protobuf/x;

    .line 130
    .line 131
    move-object v3, v2

    .line 132
    check-cast v3, Landroidx/datastore/preferences/protobuf/U;

    .line 133
    .line 134
    iget v4, v3, Landroidx/datastore/preferences/protobuf/U;->g:I

    .line 135
    .line 136
    move-object v5, v1

    .line 137
    check-cast v5, Landroidx/datastore/preferences/protobuf/U;

    .line 138
    .line 139
    iget v5, v5, Landroidx/datastore/preferences/protobuf/U;->g:I

    .line 140
    .line 141
    if-lez v4, :cond_1

    .line 142
    .line 143
    if-lez v5, :cond_1

    .line 144
    .line 145
    move-object v8, v2

    .line 146
    check-cast v8, Landroidx/datastore/preferences/protobuf/b;

    .line 147
    .line 148
    iget-boolean v8, v8, Landroidx/datastore/preferences/protobuf/b;->e:Z

    .line 149
    .line 150
    if-nez v8, :cond_0

    .line 151
    .line 152
    add-int/2addr v5, v4

    .line 153
    invoke-virtual {v3, v5}, Landroidx/datastore/preferences/protobuf/U;->c(I)Landroidx/datastore/preferences/protobuf/U;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    :cond_0
    move-object v3, v2

    .line 158
    check-cast v3, Landroidx/datastore/preferences/protobuf/b;

    .line 159
    .line 160
    invoke-virtual {v3, v1}, Landroidx/datastore/preferences/protobuf/b;->addAll(Ljava/util/Collection;)Z

    .line 161
    .line 162
    .line 163
    :cond_1
    if-lez v4, :cond_2

    .line 164
    .line 165
    move-object v1, v2

    .line 166
    :cond_2
    invoke-static {p1, v6, v7, v1}, Landroidx/datastore/preferences/protobuf/j0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    goto/16 :goto_1

    .line 170
    .line 171
    :pswitch_6
    invoke-virtual {p0, v0, p1, p2}, Landroidx/datastore/preferences/protobuf/N;->t(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    goto/16 :goto_1

    .line 175
    .line 176
    :pswitch_7
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/N;->n(ILjava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    if-eqz v1, :cond_3

    .line 181
    .line 182
    sget-object v1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 183
    .line 184
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/i0;->g(JLjava/lang/Object;)J

    .line 185
    .line 186
    .line 187
    move-result-wide v1

    .line 188
    invoke-static {p1, v6, v7, v1, v2}, Landroidx/datastore/preferences/protobuf/j0;->n(Ljava/lang/Object;JJ)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    goto/16 :goto_1

    .line 195
    .line 196
    :pswitch_8
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/N;->n(ILjava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    if-eqz v1, :cond_3

    .line 201
    .line 202
    sget-object v1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 203
    .line 204
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    invoke-static {p1, v6, v7, v1}, Landroidx/datastore/preferences/protobuf/j0;->m(Ljava/lang/Object;JI)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    goto/16 :goto_1

    .line 215
    .line 216
    :pswitch_9
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/N;->n(ILjava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    if-eqz v1, :cond_3

    .line 221
    .line 222
    sget-object v1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 223
    .line 224
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/i0;->g(JLjava/lang/Object;)J

    .line 225
    .line 226
    .line 227
    move-result-wide v1

    .line 228
    invoke-static {p1, v6, v7, v1, v2}, Landroidx/datastore/preferences/protobuf/j0;->n(Ljava/lang/Object;JJ)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    goto/16 :goto_1

    .line 235
    .line 236
    :pswitch_a
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/N;->n(ILjava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    if-eqz v1, :cond_3

    .line 241
    .line 242
    sget-object v1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 243
    .line 244
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    invoke-static {p1, v6, v7, v1}, Landroidx/datastore/preferences/protobuf/j0;->m(Ljava/lang/Object;JI)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    goto/16 :goto_1

    .line 255
    .line 256
    :pswitch_b
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/N;->n(ILjava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v1

    .line 260
    if-eqz v1, :cond_3

    .line 261
    .line 262
    sget-object v1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 263
    .line 264
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    invoke-static {p1, v6, v7, v1}, Landroidx/datastore/preferences/protobuf/j0;->m(Ljava/lang/Object;JI)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    goto/16 :goto_1

    .line 275
    .line 276
    :pswitch_c
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/N;->n(ILjava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v1

    .line 280
    if-eqz v1, :cond_3

    .line 281
    .line 282
    sget-object v1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 283
    .line 284
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    invoke-static {p1, v6, v7, v1}, Landroidx/datastore/preferences/protobuf/j0;->m(Ljava/lang/Object;JI)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    goto/16 :goto_1

    .line 295
    .line 296
    :pswitch_d
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/N;->n(ILjava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    if-eqz v1, :cond_3

    .line 301
    .line 302
    sget-object v1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 303
    .line 304
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    invoke-static {p1, v6, v7, v1}, Landroidx/datastore/preferences/protobuf/j0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    goto/16 :goto_1

    .line 315
    .line 316
    :pswitch_e
    invoke-virtual {p0, v0, p1, p2}, Landroidx/datastore/preferences/protobuf/N;->t(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    goto/16 :goto_1

    .line 320
    .line 321
    :pswitch_f
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/N;->n(ILjava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v1

    .line 325
    if-eqz v1, :cond_3

    .line 326
    .line 327
    sget-object v1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 328
    .line 329
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    invoke-static {p1, v6, v7, v1}, Landroidx/datastore/preferences/protobuf/j0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    goto/16 :goto_1

    .line 340
    .line 341
    :pswitch_10
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/N;->n(ILjava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result v1

    .line 345
    if-eqz v1, :cond_3

    .line 346
    .line 347
    sget-object v1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 348
    .line 349
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/i0;->c(JLjava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result v2

    .line 353
    invoke-virtual {v1, p1, v6, v7, v2}, Landroidx/datastore/preferences/protobuf/i0;->j(Ljava/lang/Object;JZ)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    goto/16 :goto_1

    .line 360
    .line 361
    :pswitch_11
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/N;->n(ILjava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result v1

    .line 365
    if-eqz v1, :cond_3

    .line 366
    .line 367
    sget-object v1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 368
    .line 369
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 370
    .line 371
    .line 372
    move-result v1

    .line 373
    invoke-static {p1, v6, v7, v1}, Landroidx/datastore/preferences/protobuf/j0;->m(Ljava/lang/Object;JI)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    goto/16 :goto_1

    .line 380
    .line 381
    :pswitch_12
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/N;->n(ILjava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    if-eqz v1, :cond_3

    .line 386
    .line 387
    sget-object v1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 388
    .line 389
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/i0;->g(JLjava/lang/Object;)J

    .line 390
    .line 391
    .line 392
    move-result-wide v1

    .line 393
    invoke-static {p1, v6, v7, v1, v2}, Landroidx/datastore/preferences/protobuf/j0;->n(Ljava/lang/Object;JJ)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    goto :goto_1

    .line 400
    :pswitch_13
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/N;->n(ILjava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v1

    .line 404
    if-eqz v1, :cond_3

    .line 405
    .line 406
    sget-object v1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 407
    .line 408
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    invoke-static {p1, v6, v7, v1}, Landroidx/datastore/preferences/protobuf/j0;->m(Ljava/lang/Object;JI)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    goto :goto_1

    .line 419
    :pswitch_14
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/N;->n(ILjava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    move-result v1

    .line 423
    if-eqz v1, :cond_3

    .line 424
    .line 425
    sget-object v1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 426
    .line 427
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/i0;->g(JLjava/lang/Object;)J

    .line 428
    .line 429
    .line 430
    move-result-wide v1

    .line 431
    invoke-static {p1, v6, v7, v1, v2}, Landroidx/datastore/preferences/protobuf/j0;->n(Ljava/lang/Object;JJ)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    goto :goto_1

    .line 438
    :pswitch_15
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/N;->n(ILjava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v1

    .line 442
    if-eqz v1, :cond_3

    .line 443
    .line 444
    sget-object v1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 445
    .line 446
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/i0;->g(JLjava/lang/Object;)J

    .line 447
    .line 448
    .line 449
    move-result-wide v1

    .line 450
    invoke-static {p1, v6, v7, v1, v2}, Landroidx/datastore/preferences/protobuf/j0;->n(Ljava/lang/Object;JJ)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    goto :goto_1

    .line 457
    :pswitch_16
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/N;->n(ILjava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    move-result v1

    .line 461
    if-eqz v1, :cond_3

    .line 462
    .line 463
    sget-object v1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 464
    .line 465
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/i0;->e(JLjava/lang/Object;)F

    .line 466
    .line 467
    .line 468
    move-result v2

    .line 469
    invoke-virtual {v1, p1, v6, v7, v2}, Landroidx/datastore/preferences/protobuf/i0;->m(Ljava/lang/Object;JF)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    goto :goto_1

    .line 476
    :pswitch_17
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/N;->n(ILjava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v1

    .line 480
    if-eqz v1, :cond_3

    .line 481
    .line 482
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 483
    .line 484
    invoke-virtual {v4, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/i0;->d(JLjava/lang/Object;)D

    .line 485
    .line 486
    .line 487
    move-result-wide v8

    .line 488
    move-object v5, p1

    .line 489
    invoke-virtual/range {v4 .. v9}, Landroidx/datastore/preferences/protobuf/i0;->l(Ljava/lang/Object;JD)V

    .line 490
    .line 491
    .line 492
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    .line 493
    .line 494
    .line 495
    :cond_3
    :goto_1
    add-int/lit8 v0, v0, 0x3

    .line 496
    .line 497
    goto/16 :goto_0

    .line 498
    .line 499
    :cond_4
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/N;->l:Landroidx/datastore/preferences/protobuf/e0;

    .line 500
    .line 501
    invoke-static {v0, p1, p2}, Landroidx/datastore/preferences/protobuf/X;->A(Landroidx/datastore/preferences/protobuf/e0;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 502
    .line 503
    .line 504
    return-void

    .line 505
    :cond_5
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 506
    .line 507
    new-instance v0, Ljava/lang/StringBuilder;

    .line 508
    .line 509
    const-string v1, "Mutating immutable message: "

    .line 510
    .line 511
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object p1

    .line 521
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    throw p2

    .line 525
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/F;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/N;->N(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/F;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final e(Landroidx/datastore/preferences/protobuf/w;)I
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/N;->a:[I

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    :goto_0
    if-ge v2, v1, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0, v2}, Landroidx/datastore/preferences/protobuf/N;->M(I)I

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    aget v5, v0, v2

    .line 13
    .line 14
    const v6, 0xfffff

    .line 15
    .line 16
    .line 17
    and-int/2addr v6, v4

    .line 18
    int-to-long v6, v6

    .line 19
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/N;->L(I)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const/16 v8, 0x4d5

    .line 24
    .line 25
    const/16 v9, 0x4cf

    .line 26
    .line 27
    const/16 v10, 0x25

    .line 28
    .line 29
    packed-switch v4, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :pswitch_0
    invoke-virtual {p0, p1, v5, v2}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 41
    .line 42
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    mul-int/lit8 v3, v3, 0x35

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    :goto_1
    add-int/2addr v4, v3

    .line 53
    move v3, v4

    .line 54
    goto/16 :goto_4

    .line 55
    .line 56
    :pswitch_1
    invoke-virtual {p0, p1, v5, v2}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_2

    .line 61
    .line 62
    mul-int/lit8 v3, v3, 0x35

    .line 63
    .line 64
    invoke-static {v6, v7, p1}, Landroidx/datastore/preferences/protobuf/N;->A(JLjava/lang/Object;)J

    .line 65
    .line 66
    .line 67
    move-result-wide v4

    .line 68
    invoke-static {v4, v5}, Landroidx/datastore/preferences/protobuf/y;->b(J)I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    goto :goto_1

    .line 73
    :pswitch_2
    invoke-virtual {p0, p1, v5, v2}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eqz v4, :cond_2

    .line 78
    .line 79
    mul-int/lit8 v3, v3, 0x35

    .line 80
    .line 81
    invoke-static {v6, v7, p1}, Landroidx/datastore/preferences/protobuf/N;->z(JLjava/lang/Object;)I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    goto :goto_1

    .line 86
    :pswitch_3
    invoke-virtual {p0, p1, v5, v2}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_2

    .line 91
    .line 92
    mul-int/lit8 v3, v3, 0x35

    .line 93
    .line 94
    invoke-static {v6, v7, p1}, Landroidx/datastore/preferences/protobuf/N;->A(JLjava/lang/Object;)J

    .line 95
    .line 96
    .line 97
    move-result-wide v4

    .line 98
    invoke-static {v4, v5}, Landroidx/datastore/preferences/protobuf/y;->b(J)I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    goto :goto_1

    .line 103
    :pswitch_4
    invoke-virtual {p0, p1, v5, v2}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-eqz v4, :cond_2

    .line 108
    .line 109
    mul-int/lit8 v3, v3, 0x35

    .line 110
    .line 111
    invoke-static {v6, v7, p1}, Landroidx/datastore/preferences/protobuf/N;->z(JLjava/lang/Object;)I

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    goto :goto_1

    .line 116
    :pswitch_5
    invoke-virtual {p0, p1, v5, v2}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-eqz v4, :cond_2

    .line 121
    .line 122
    mul-int/lit8 v3, v3, 0x35

    .line 123
    .line 124
    invoke-static {v6, v7, p1}, Landroidx/datastore/preferences/protobuf/N;->z(JLjava/lang/Object;)I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    goto :goto_1

    .line 129
    :pswitch_6
    invoke-virtual {p0, p1, v5, v2}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-eqz v4, :cond_2

    .line 134
    .line 135
    mul-int/lit8 v3, v3, 0x35

    .line 136
    .line 137
    invoke-static {v6, v7, p1}, Landroidx/datastore/preferences/protobuf/N;->z(JLjava/lang/Object;)I

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    goto :goto_1

    .line 142
    :pswitch_7
    invoke-virtual {p0, p1, v5, v2}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-eqz v4, :cond_2

    .line 147
    .line 148
    mul-int/lit8 v3, v3, 0x35

    .line 149
    .line 150
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 151
    .line 152
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    goto :goto_1

    .line 161
    :pswitch_8
    invoke-virtual {p0, p1, v5, v2}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-eqz v4, :cond_2

    .line 166
    .line 167
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 168
    .line 169
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    mul-int/lit8 v3, v3, 0x35

    .line 174
    .line 175
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    goto :goto_1

    .line 180
    :pswitch_9
    invoke-virtual {p0, p1, v5, v2}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    if-eqz v4, :cond_2

    .line 185
    .line 186
    mul-int/lit8 v3, v3, 0x35

    .line 187
    .line 188
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 189
    .line 190
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    check-cast v4, Ljava/lang/String;

    .line 195
    .line 196
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    goto/16 :goto_1

    .line 201
    .line 202
    :pswitch_a
    invoke-virtual {p0, p1, v5, v2}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    if-eqz v4, :cond_2

    .line 207
    .line 208
    mul-int/lit8 v3, v3, 0x35

    .line 209
    .line 210
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 211
    .line 212
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    check-cast v4, Ljava/lang/Boolean;

    .line 217
    .line 218
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    sget-object v5, Landroidx/datastore/preferences/protobuf/y;->a:Ljava/nio/charset/Charset;

    .line 223
    .line 224
    if-eqz v4, :cond_0

    .line 225
    .line 226
    :goto_2
    const/16 v8, 0x4cf

    .line 227
    .line 228
    :cond_0
    add-int/2addr v8, v3

    .line 229
    move v3, v8

    .line 230
    goto/16 :goto_4

    .line 231
    .line 232
    :pswitch_b
    invoke-virtual {p0, p1, v5, v2}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 233
    .line 234
    .line 235
    move-result v4

    .line 236
    if-eqz v4, :cond_2

    .line 237
    .line 238
    mul-int/lit8 v3, v3, 0x35

    .line 239
    .line 240
    invoke-static {v6, v7, p1}, Landroidx/datastore/preferences/protobuf/N;->z(JLjava/lang/Object;)I

    .line 241
    .line 242
    .line 243
    move-result v4

    .line 244
    goto/16 :goto_1

    .line 245
    .line 246
    :pswitch_c
    invoke-virtual {p0, p1, v5, v2}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    if-eqz v4, :cond_2

    .line 251
    .line 252
    mul-int/lit8 v3, v3, 0x35

    .line 253
    .line 254
    invoke-static {v6, v7, p1}, Landroidx/datastore/preferences/protobuf/N;->A(JLjava/lang/Object;)J

    .line 255
    .line 256
    .line 257
    move-result-wide v4

    .line 258
    invoke-static {v4, v5}, Landroidx/datastore/preferences/protobuf/y;->b(J)I

    .line 259
    .line 260
    .line 261
    move-result v4

    .line 262
    goto/16 :goto_1

    .line 263
    .line 264
    :pswitch_d
    invoke-virtual {p0, p1, v5, v2}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    if-eqz v4, :cond_2

    .line 269
    .line 270
    mul-int/lit8 v3, v3, 0x35

    .line 271
    .line 272
    invoke-static {v6, v7, p1}, Landroidx/datastore/preferences/protobuf/N;->z(JLjava/lang/Object;)I

    .line 273
    .line 274
    .line 275
    move-result v4

    .line 276
    goto/16 :goto_1

    .line 277
    .line 278
    :pswitch_e
    invoke-virtual {p0, p1, v5, v2}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 279
    .line 280
    .line 281
    move-result v4

    .line 282
    if-eqz v4, :cond_2

    .line 283
    .line 284
    mul-int/lit8 v3, v3, 0x35

    .line 285
    .line 286
    invoke-static {v6, v7, p1}, Landroidx/datastore/preferences/protobuf/N;->A(JLjava/lang/Object;)J

    .line 287
    .line 288
    .line 289
    move-result-wide v4

    .line 290
    invoke-static {v4, v5}, Landroidx/datastore/preferences/protobuf/y;->b(J)I

    .line 291
    .line 292
    .line 293
    move-result v4

    .line 294
    goto/16 :goto_1

    .line 295
    .line 296
    :pswitch_f
    invoke-virtual {p0, p1, v5, v2}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 297
    .line 298
    .line 299
    move-result v4

    .line 300
    if-eqz v4, :cond_2

    .line 301
    .line 302
    mul-int/lit8 v3, v3, 0x35

    .line 303
    .line 304
    invoke-static {v6, v7, p1}, Landroidx/datastore/preferences/protobuf/N;->A(JLjava/lang/Object;)J

    .line 305
    .line 306
    .line 307
    move-result-wide v4

    .line 308
    invoke-static {v4, v5}, Landroidx/datastore/preferences/protobuf/y;->b(J)I

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    goto/16 :goto_1

    .line 313
    .line 314
    :pswitch_10
    invoke-virtual {p0, p1, v5, v2}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    if-eqz v4, :cond_2

    .line 319
    .line 320
    mul-int/lit8 v3, v3, 0x35

    .line 321
    .line 322
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 323
    .line 324
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v4

    .line 328
    check-cast v4, Ljava/lang/Float;

    .line 329
    .line 330
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 331
    .line 332
    .line 333
    move-result v4

    .line 334
    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 335
    .line 336
    .line 337
    move-result v4

    .line 338
    goto/16 :goto_1

    .line 339
    .line 340
    :pswitch_11
    invoke-virtual {p0, p1, v5, v2}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 341
    .line 342
    .line 343
    move-result v4

    .line 344
    if-eqz v4, :cond_2

    .line 345
    .line 346
    mul-int/lit8 v3, v3, 0x35

    .line 347
    .line 348
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 349
    .line 350
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v4

    .line 354
    check-cast v4, Ljava/lang/Double;

    .line 355
    .line 356
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 357
    .line 358
    .line 359
    move-result-wide v4

    .line 360
    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 361
    .line 362
    .line 363
    move-result-wide v4

    .line 364
    invoke-static {v4, v5}, Landroidx/datastore/preferences/protobuf/y;->b(J)I

    .line 365
    .line 366
    .line 367
    move-result v4

    .line 368
    goto/16 :goto_1

    .line 369
    .line 370
    :pswitch_12
    mul-int/lit8 v3, v3, 0x35

    .line 371
    .line 372
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 373
    .line 374
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v4

    .line 378
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 379
    .line 380
    .line 381
    move-result v4

    .line 382
    goto/16 :goto_1

    .line 383
    .line 384
    :pswitch_13
    mul-int/lit8 v3, v3, 0x35

    .line 385
    .line 386
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 387
    .line 388
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v4

    .line 392
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 393
    .line 394
    .line 395
    move-result v4

    .line 396
    goto/16 :goto_1

    .line 397
    .line 398
    :pswitch_14
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 399
    .line 400
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v4

    .line 404
    if-eqz v4, :cond_1

    .line 405
    .line 406
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 407
    .line 408
    .line 409
    move-result v10

    .line 410
    :cond_1
    :goto_3
    mul-int/lit8 v3, v3, 0x35

    .line 411
    .line 412
    add-int/2addr v3, v10

    .line 413
    goto/16 :goto_4

    .line 414
    .line 415
    :pswitch_15
    mul-int/lit8 v3, v3, 0x35

    .line 416
    .line 417
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 418
    .line 419
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->g(JLjava/lang/Object;)J

    .line 420
    .line 421
    .line 422
    move-result-wide v4

    .line 423
    invoke-static {v4, v5}, Landroidx/datastore/preferences/protobuf/y;->b(J)I

    .line 424
    .line 425
    .line 426
    move-result v4

    .line 427
    goto/16 :goto_1

    .line 428
    .line 429
    :pswitch_16
    mul-int/lit8 v3, v3, 0x35

    .line 430
    .line 431
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 432
    .line 433
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 434
    .line 435
    .line 436
    move-result v4

    .line 437
    goto/16 :goto_1

    .line 438
    .line 439
    :pswitch_17
    mul-int/lit8 v3, v3, 0x35

    .line 440
    .line 441
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 442
    .line 443
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->g(JLjava/lang/Object;)J

    .line 444
    .line 445
    .line 446
    move-result-wide v4

    .line 447
    invoke-static {v4, v5}, Landroidx/datastore/preferences/protobuf/y;->b(J)I

    .line 448
    .line 449
    .line 450
    move-result v4

    .line 451
    goto/16 :goto_1

    .line 452
    .line 453
    :pswitch_18
    mul-int/lit8 v3, v3, 0x35

    .line 454
    .line 455
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 456
    .line 457
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 458
    .line 459
    .line 460
    move-result v4

    .line 461
    goto/16 :goto_1

    .line 462
    .line 463
    :pswitch_19
    mul-int/lit8 v3, v3, 0x35

    .line 464
    .line 465
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 466
    .line 467
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 468
    .line 469
    .line 470
    move-result v4

    .line 471
    goto/16 :goto_1

    .line 472
    .line 473
    :pswitch_1a
    mul-int/lit8 v3, v3, 0x35

    .line 474
    .line 475
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 476
    .line 477
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 478
    .line 479
    .line 480
    move-result v4

    .line 481
    goto/16 :goto_1

    .line 482
    .line 483
    :pswitch_1b
    mul-int/lit8 v3, v3, 0x35

    .line 484
    .line 485
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 486
    .line 487
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v4

    .line 491
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 492
    .line 493
    .line 494
    move-result v4

    .line 495
    goto/16 :goto_1

    .line 496
    .line 497
    :pswitch_1c
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 498
    .line 499
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v4

    .line 503
    if-eqz v4, :cond_1

    .line 504
    .line 505
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 506
    .line 507
    .line 508
    move-result v10

    .line 509
    goto :goto_3

    .line 510
    :pswitch_1d
    mul-int/lit8 v3, v3, 0x35

    .line 511
    .line 512
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 513
    .line 514
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v4

    .line 518
    check-cast v4, Ljava/lang/String;

    .line 519
    .line 520
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 521
    .line 522
    .line 523
    move-result v4

    .line 524
    goto/16 :goto_1

    .line 525
    .line 526
    :pswitch_1e
    mul-int/lit8 v3, v3, 0x35

    .line 527
    .line 528
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 529
    .line 530
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->c(JLjava/lang/Object;)Z

    .line 531
    .line 532
    .line 533
    move-result v4

    .line 534
    sget-object v5, Landroidx/datastore/preferences/protobuf/y;->a:Ljava/nio/charset/Charset;

    .line 535
    .line 536
    if-eqz v4, :cond_0

    .line 537
    .line 538
    goto/16 :goto_2

    .line 539
    .line 540
    :pswitch_1f
    mul-int/lit8 v3, v3, 0x35

    .line 541
    .line 542
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 543
    .line 544
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 545
    .line 546
    .line 547
    move-result v4

    .line 548
    goto/16 :goto_1

    .line 549
    .line 550
    :pswitch_20
    mul-int/lit8 v3, v3, 0x35

    .line 551
    .line 552
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 553
    .line 554
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->g(JLjava/lang/Object;)J

    .line 555
    .line 556
    .line 557
    move-result-wide v4

    .line 558
    invoke-static {v4, v5}, Landroidx/datastore/preferences/protobuf/y;->b(J)I

    .line 559
    .line 560
    .line 561
    move-result v4

    .line 562
    goto/16 :goto_1

    .line 563
    .line 564
    :pswitch_21
    mul-int/lit8 v3, v3, 0x35

    .line 565
    .line 566
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 567
    .line 568
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 569
    .line 570
    .line 571
    move-result v4

    .line 572
    goto/16 :goto_1

    .line 573
    .line 574
    :pswitch_22
    mul-int/lit8 v3, v3, 0x35

    .line 575
    .line 576
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 577
    .line 578
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->g(JLjava/lang/Object;)J

    .line 579
    .line 580
    .line 581
    move-result-wide v4

    .line 582
    invoke-static {v4, v5}, Landroidx/datastore/preferences/protobuf/y;->b(J)I

    .line 583
    .line 584
    .line 585
    move-result v4

    .line 586
    goto/16 :goto_1

    .line 587
    .line 588
    :pswitch_23
    mul-int/lit8 v3, v3, 0x35

    .line 589
    .line 590
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 591
    .line 592
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->g(JLjava/lang/Object;)J

    .line 593
    .line 594
    .line 595
    move-result-wide v4

    .line 596
    invoke-static {v4, v5}, Landroidx/datastore/preferences/protobuf/y;->b(J)I

    .line 597
    .line 598
    .line 599
    move-result v4

    .line 600
    goto/16 :goto_1

    .line 601
    .line 602
    :pswitch_24
    mul-int/lit8 v3, v3, 0x35

    .line 603
    .line 604
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 605
    .line 606
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->e(JLjava/lang/Object;)F

    .line 607
    .line 608
    .line 609
    move-result v4

    .line 610
    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 611
    .line 612
    .line 613
    move-result v4

    .line 614
    goto/16 :goto_1

    .line 615
    .line 616
    :pswitch_25
    mul-int/lit8 v3, v3, 0x35

    .line 617
    .line 618
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 619
    .line 620
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/i0;->d(JLjava/lang/Object;)D

    .line 621
    .line 622
    .line 623
    move-result-wide v4

    .line 624
    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 625
    .line 626
    .line 627
    move-result-wide v4

    .line 628
    invoke-static {v4, v5}, Landroidx/datastore/preferences/protobuf/y;->b(J)I

    .line 629
    .line 630
    .line 631
    move-result v4

    .line 632
    goto/16 :goto_1

    .line 633
    .line 634
    :cond_2
    :goto_4
    add-int/lit8 v2, v2, 0x3

    .line 635
    .line 636
    goto/16 :goto_0

    .line 637
    .line 638
    :cond_3
    mul-int/lit8 v3, v3, 0x35

    .line 639
    .line 640
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/N;->l:Landroidx/datastore/preferences/protobuf/e0;

    .line 641
    .line 642
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 643
    .line 644
    .line 645
    iget-object p1, p1, Landroidx/datastore/preferences/protobuf/w;->unknownFields:Landroidx/datastore/preferences/protobuf/d0;

    .line 646
    .line 647
    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/d0;->hashCode()I

    .line 648
    .line 649
    .line 650
    move-result p1

    .line 651
    add-int/2addr p1, v3

    .line 652
    return p1

    .line 653
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Landroidx/datastore/preferences/protobuf/w;)I
    .locals 16

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    sget-object v8, Landroidx/datastore/preferences/protobuf/N;->o:Lsun/misc/Unsafe;

    .line 6
    .line 7
    const v10, 0xfffff

    .line 8
    .line 9
    .line 10
    const v0, 0xfffff

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v11, 0x0

    .line 15
    const/4 v12, 0x0

    .line 16
    :goto_0
    iget-object v2, v6, Landroidx/datastore/preferences/protobuf/N;->a:[I

    .line 17
    .line 18
    array-length v3, v2

    .line 19
    if-ge v11, v3, :cond_7

    .line 20
    .line 21
    invoke-virtual {v6, v11}, Landroidx/datastore/preferences/protobuf/N;->M(I)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->L(I)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    aget v13, v2, v11

    .line 30
    .line 31
    add-int/lit8 v5, v11, 0x2

    .line 32
    .line 33
    aget v2, v2, v5

    .line 34
    .line 35
    and-int v5, v2, v10

    .line 36
    .line 37
    const/16 v14, 0x11

    .line 38
    .line 39
    if-gt v4, v14, :cond_2

    .line 40
    .line 41
    if-eq v5, v0, :cond_1

    .line 42
    .line 43
    if-ne v5, v10, :cond_0

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    int-to-long v0, v5

    .line 48
    invoke-virtual {v8, v7, v0, v1}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    move v1, v0

    .line 53
    :goto_1
    move v0, v5

    .line 54
    :cond_1
    ushr-int/lit8 v2, v2, 0x14

    .line 55
    .line 56
    const/4 v5, 0x1

    .line 57
    shl-int v2, v5, v2

    .line 58
    .line 59
    move v14, v0

    .line 60
    move v15, v1

    .line 61
    move v5, v2

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    move v14, v0

    .line 64
    move v15, v1

    .line 65
    const/4 v5, 0x0

    .line 66
    :goto_2
    and-int v0, v3, v10

    .line 67
    .line 68
    int-to-long v2, v0

    .line 69
    sget-object v0, Landroidx/datastore/preferences/protobuf/s;->f:Landroidx/datastore/preferences/protobuf/s;

    .line 70
    .line 71
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/s;->a()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-lt v4, v0, :cond_3

    .line 76
    .line 77
    sget-object v0, Landroidx/datastore/preferences/protobuf/s;->g:Landroidx/datastore/preferences/protobuf/s;

    .line 78
    .line 79
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/s;->a()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    :cond_3
    packed-switch v4, :pswitch_data_0

    .line 84
    .line 85
    .line 86
    goto/16 :goto_6

    .line 87
    .line 88
    :pswitch_0
    invoke-virtual {v6, v7, v13, v11}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_6

    .line 93
    .line 94
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Landroidx/datastore/preferences/protobuf/a;

    .line 99
    .line 100
    invoke-virtual {v6, v11}, Landroidx/datastore/preferences/protobuf/N;->m(I)Landroidx/datastore/preferences/protobuf/W;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static {v13, v0, v1}, Landroidx/datastore/preferences/protobuf/m;->b0(ILandroidx/datastore/preferences/protobuf/a;Landroidx/datastore/preferences/protobuf/W;)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    :goto_3
    add-int/2addr v12, v0

    .line 109
    goto/16 :goto_6

    .line 110
    .line 111
    :pswitch_1
    invoke-virtual {v6, v7, v13, v11}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_6

    .line 116
    .line 117
    invoke-static {v2, v3, v7}, Landroidx/datastore/preferences/protobuf/N;->A(JLjava/lang/Object;)J

    .line 118
    .line 119
    .line 120
    move-result-wide v0

    .line 121
    invoke-static {v0, v1, v13}, Landroidx/datastore/preferences/protobuf/m;->h0(JI)I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    goto :goto_3

    .line 126
    :pswitch_2
    invoke-virtual {v6, v7, v13, v11}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-eqz v0, :cond_6

    .line 131
    .line 132
    invoke-static {v2, v3, v7}, Landroidx/datastore/preferences/protobuf/N;->z(JLjava/lang/Object;)I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/m;->g0(II)I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    goto :goto_3

    .line 141
    :pswitch_3
    invoke-virtual {v6, v7, v13, v11}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_6

    .line 146
    .line 147
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->f0(I)I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    goto :goto_3

    .line 152
    :pswitch_4
    invoke-virtual {v6, v7, v13, v11}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_6

    .line 157
    .line 158
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->e0(I)I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    goto :goto_3

    .line 163
    :pswitch_5
    invoke-virtual {v6, v7, v13, v11}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-eqz v0, :cond_6

    .line 168
    .line 169
    invoke-static {v2, v3, v7}, Landroidx/datastore/preferences/protobuf/N;->z(JLjava/lang/Object;)I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/m;->X(II)I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    goto :goto_3

    .line 178
    :pswitch_6
    invoke-virtual {v6, v7, v13, v11}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-eqz v0, :cond_6

    .line 183
    .line 184
    invoke-static {v2, v3, v7}, Landroidx/datastore/preferences/protobuf/N;->z(JLjava/lang/Object;)I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/m;->l0(II)I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    goto :goto_3

    .line 193
    :pswitch_7
    invoke-virtual {v6, v7, v13, v11}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-eqz v0, :cond_6

    .line 198
    .line 199
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    check-cast v0, Landroidx/datastore/preferences/protobuf/g;

    .line 204
    .line 205
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/m;->V(ILandroidx/datastore/preferences/protobuf/g;)I

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    goto :goto_3

    .line 210
    :pswitch_8
    invoke-virtual {v6, v7, v13, v11}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-eqz v0, :cond_6

    .line 215
    .line 216
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-virtual {v6, v11}, Landroidx/datastore/preferences/protobuf/N;->m(I)Landroidx/datastore/preferences/protobuf/W;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    invoke-static {v13, v0, v1}, Landroidx/datastore/preferences/protobuf/X;->o(ILjava/lang/Object;Landroidx/datastore/preferences/protobuf/W;)I

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    goto :goto_3

    .line 229
    :pswitch_9
    invoke-virtual {v6, v7, v13, v11}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-eqz v0, :cond_6

    .line 234
    .line 235
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    instance-of v1, v0, Landroidx/datastore/preferences/protobuf/g;

    .line 240
    .line 241
    if-eqz v1, :cond_4

    .line 242
    .line 243
    check-cast v0, Landroidx/datastore/preferences/protobuf/g;

    .line 244
    .line 245
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/m;->V(ILandroidx/datastore/preferences/protobuf/g;)I

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    :goto_4
    add-int/2addr v0, v12

    .line 250
    move v12, v0

    .line 251
    goto/16 :goto_6

    .line 252
    .line 253
    :cond_4
    check-cast v0, Ljava/lang/String;

    .line 254
    .line 255
    invoke-static {v0, v13}, Landroidx/datastore/preferences/protobuf/m;->i0(Ljava/lang/String;I)I

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    goto :goto_4

    .line 260
    :pswitch_a
    invoke-virtual {v6, v7, v13, v11}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-eqz v0, :cond_6

    .line 265
    .line 266
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->U(I)I

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    goto/16 :goto_3

    .line 271
    .line 272
    :pswitch_b
    invoke-virtual {v6, v7, v13, v11}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    if-eqz v0, :cond_6

    .line 277
    .line 278
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->Y(I)I

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    goto/16 :goto_3

    .line 283
    .line 284
    :pswitch_c
    invoke-virtual {v6, v7, v13, v11}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    if-eqz v0, :cond_6

    .line 289
    .line 290
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->Z(I)I

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    goto/16 :goto_3

    .line 295
    .line 296
    :pswitch_d
    invoke-virtual {v6, v7, v13, v11}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    if-eqz v0, :cond_6

    .line 301
    .line 302
    invoke-static {v2, v3, v7}, Landroidx/datastore/preferences/protobuf/N;->z(JLjava/lang/Object;)I

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/m;->c0(II)I

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    goto/16 :goto_3

    .line 311
    .line 312
    :pswitch_e
    invoke-virtual {v6, v7, v13, v11}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    if-eqz v0, :cond_6

    .line 317
    .line 318
    invoke-static {v2, v3, v7}, Landroidx/datastore/preferences/protobuf/N;->A(JLjava/lang/Object;)J

    .line 319
    .line 320
    .line 321
    move-result-wide v0

    .line 322
    invoke-static {v0, v1, v13}, Landroidx/datastore/preferences/protobuf/m;->n0(JI)I

    .line 323
    .line 324
    .line 325
    move-result v0

    .line 326
    goto/16 :goto_3

    .line 327
    .line 328
    :pswitch_f
    invoke-virtual {v6, v7, v13, v11}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    if-eqz v0, :cond_6

    .line 333
    .line 334
    invoke-static {v2, v3, v7}, Landroidx/datastore/preferences/protobuf/N;->A(JLjava/lang/Object;)J

    .line 335
    .line 336
    .line 337
    move-result-wide v0

    .line 338
    invoke-static {v0, v1, v13}, Landroidx/datastore/preferences/protobuf/m;->d0(JI)I

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    goto/16 :goto_3

    .line 343
    .line 344
    :pswitch_10
    invoke-virtual {v6, v7, v13, v11}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 345
    .line 346
    .line 347
    move-result v0

    .line 348
    if-eqz v0, :cond_6

    .line 349
    .line 350
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->a0(I)I

    .line 351
    .line 352
    .line 353
    move-result v0

    .line 354
    goto/16 :goto_3

    .line 355
    .line 356
    :pswitch_11
    invoke-virtual {v6, v7, v13, v11}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 357
    .line 358
    .line 359
    move-result v0

    .line 360
    if-eqz v0, :cond_6

    .line 361
    .line 362
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->W(I)I

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    goto/16 :goto_3

    .line 367
    .line 368
    :pswitch_12
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    div-int/lit8 v1, v11, 0x3

    .line 373
    .line 374
    mul-int/lit8 v1, v1, 0x2

    .line 375
    .line 376
    iget-object v2, v6, Landroidx/datastore/preferences/protobuf/N;->b:[Ljava/lang/Object;

    .line 377
    .line 378
    aget-object v1, v2, v1

    .line 379
    .line 380
    iget-object v2, v6, Landroidx/datastore/preferences/protobuf/N;->m:Landroidx/datastore/preferences/protobuf/J;

    .line 381
    .line 382
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    invoke-static {v13, v0, v1}, Landroidx/datastore/preferences/protobuf/J;->a(ILjava/lang/Object;Ljava/lang/Object;)I

    .line 386
    .line 387
    .line 388
    move-result v0

    .line 389
    goto/16 :goto_3

    .line 390
    .line 391
    :pswitch_13
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    check-cast v0, Ljava/util/List;

    .line 396
    .line 397
    invoke-virtual {v6, v11}, Landroidx/datastore/preferences/protobuf/N;->m(I)Landroidx/datastore/preferences/protobuf/W;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    invoke-static {v13, v0, v1}, Landroidx/datastore/preferences/protobuf/X;->j(ILjava/util/List;Landroidx/datastore/preferences/protobuf/W;)I

    .line 402
    .line 403
    .line 404
    move-result v0

    .line 405
    goto/16 :goto_3

    .line 406
    .line 407
    :pswitch_14
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    check-cast v0, Ljava/util/List;

    .line 412
    .line 413
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/X;->t(Ljava/util/List;)I

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    if-lez v0, :cond_6

    .line 418
    .line 419
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->k0(I)I

    .line 420
    .line 421
    .line 422
    move-result v1

    .line 423
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/m;->m0(I)I

    .line 424
    .line 425
    .line 426
    move-result v2

    .line 427
    :goto_5
    add-int/2addr v2, v1

    .line 428
    add-int/2addr v2, v0

    .line 429
    add-int/2addr v12, v2

    .line 430
    goto/16 :goto_6

    .line 431
    .line 432
    :pswitch_15
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    check-cast v0, Ljava/util/List;

    .line 437
    .line 438
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/X;->r(Ljava/util/List;)I

    .line 439
    .line 440
    .line 441
    move-result v0

    .line 442
    if-lez v0, :cond_6

    .line 443
    .line 444
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->k0(I)I

    .line 445
    .line 446
    .line 447
    move-result v1

    .line 448
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/m;->m0(I)I

    .line 449
    .line 450
    .line 451
    move-result v2

    .line 452
    goto :goto_5

    .line 453
    :pswitch_16
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    check-cast v0, Ljava/util/List;

    .line 458
    .line 459
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/X;->i(Ljava/util/List;)I

    .line 460
    .line 461
    .line 462
    move-result v0

    .line 463
    if-lez v0, :cond_6

    .line 464
    .line 465
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->k0(I)I

    .line 466
    .line 467
    .line 468
    move-result v1

    .line 469
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/m;->m0(I)I

    .line 470
    .line 471
    .line 472
    move-result v2

    .line 473
    goto :goto_5

    .line 474
    :pswitch_17
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    check-cast v0, Ljava/util/List;

    .line 479
    .line 480
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/X;->g(Ljava/util/List;)I

    .line 481
    .line 482
    .line 483
    move-result v0

    .line 484
    if-lez v0, :cond_6

    .line 485
    .line 486
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->k0(I)I

    .line 487
    .line 488
    .line 489
    move-result v1

    .line 490
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/m;->m0(I)I

    .line 491
    .line 492
    .line 493
    move-result v2

    .line 494
    goto :goto_5

    .line 495
    :pswitch_18
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    check-cast v0, Ljava/util/List;

    .line 500
    .line 501
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/X;->e(Ljava/util/List;)I

    .line 502
    .line 503
    .line 504
    move-result v0

    .line 505
    if-lez v0, :cond_6

    .line 506
    .line 507
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->k0(I)I

    .line 508
    .line 509
    .line 510
    move-result v1

    .line 511
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/m;->m0(I)I

    .line 512
    .line 513
    .line 514
    move-result v2

    .line 515
    goto :goto_5

    .line 516
    :pswitch_19
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    check-cast v0, Ljava/util/List;

    .line 521
    .line 522
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/X;->w(Ljava/util/List;)I

    .line 523
    .line 524
    .line 525
    move-result v0

    .line 526
    if-lez v0, :cond_6

    .line 527
    .line 528
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->k0(I)I

    .line 529
    .line 530
    .line 531
    move-result v1

    .line 532
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/m;->m0(I)I

    .line 533
    .line 534
    .line 535
    move-result v2

    .line 536
    goto :goto_5

    .line 537
    :pswitch_1a
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    check-cast v0, Ljava/util/List;

    .line 542
    .line 543
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/X;->b(Ljava/util/List;)I

    .line 544
    .line 545
    .line 546
    move-result v0

    .line 547
    if-lez v0, :cond_6

    .line 548
    .line 549
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->k0(I)I

    .line 550
    .line 551
    .line 552
    move-result v1

    .line 553
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/m;->m0(I)I

    .line 554
    .line 555
    .line 556
    move-result v2

    .line 557
    goto/16 :goto_5

    .line 558
    .line 559
    :pswitch_1b
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    check-cast v0, Ljava/util/List;

    .line 564
    .line 565
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/X;->g(Ljava/util/List;)I

    .line 566
    .line 567
    .line 568
    move-result v0

    .line 569
    if-lez v0, :cond_6

    .line 570
    .line 571
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->k0(I)I

    .line 572
    .line 573
    .line 574
    move-result v1

    .line 575
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/m;->m0(I)I

    .line 576
    .line 577
    .line 578
    move-result v2

    .line 579
    goto/16 :goto_5

    .line 580
    .line 581
    :pswitch_1c
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    check-cast v0, Ljava/util/List;

    .line 586
    .line 587
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/X;->i(Ljava/util/List;)I

    .line 588
    .line 589
    .line 590
    move-result v0

    .line 591
    if-lez v0, :cond_6

    .line 592
    .line 593
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->k0(I)I

    .line 594
    .line 595
    .line 596
    move-result v1

    .line 597
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/m;->m0(I)I

    .line 598
    .line 599
    .line 600
    move-result v2

    .line 601
    goto/16 :goto_5

    .line 602
    .line 603
    :pswitch_1d
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    check-cast v0, Ljava/util/List;

    .line 608
    .line 609
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/X;->l(Ljava/util/List;)I

    .line 610
    .line 611
    .line 612
    move-result v0

    .line 613
    if-lez v0, :cond_6

    .line 614
    .line 615
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->k0(I)I

    .line 616
    .line 617
    .line 618
    move-result v1

    .line 619
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/m;->m0(I)I

    .line 620
    .line 621
    .line 622
    move-result v2

    .line 623
    goto/16 :goto_5

    .line 624
    .line 625
    :pswitch_1e
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    check-cast v0, Ljava/util/List;

    .line 630
    .line 631
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/X;->y(Ljava/util/List;)I

    .line 632
    .line 633
    .line 634
    move-result v0

    .line 635
    if-lez v0, :cond_6

    .line 636
    .line 637
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->k0(I)I

    .line 638
    .line 639
    .line 640
    move-result v1

    .line 641
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/m;->m0(I)I

    .line 642
    .line 643
    .line 644
    move-result v2

    .line 645
    goto/16 :goto_5

    .line 646
    .line 647
    :pswitch_1f
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    check-cast v0, Ljava/util/List;

    .line 652
    .line 653
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/X;->n(Ljava/util/List;)I

    .line 654
    .line 655
    .line 656
    move-result v0

    .line 657
    if-lez v0, :cond_6

    .line 658
    .line 659
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->k0(I)I

    .line 660
    .line 661
    .line 662
    move-result v1

    .line 663
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/m;->m0(I)I

    .line 664
    .line 665
    .line 666
    move-result v2

    .line 667
    goto/16 :goto_5

    .line 668
    .line 669
    :pswitch_20
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    check-cast v0, Ljava/util/List;

    .line 674
    .line 675
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/X;->g(Ljava/util/List;)I

    .line 676
    .line 677
    .line 678
    move-result v0

    .line 679
    if-lez v0, :cond_6

    .line 680
    .line 681
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->k0(I)I

    .line 682
    .line 683
    .line 684
    move-result v1

    .line 685
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/m;->m0(I)I

    .line 686
    .line 687
    .line 688
    move-result v2

    .line 689
    goto/16 :goto_5

    .line 690
    .line 691
    :pswitch_21
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    check-cast v0, Ljava/util/List;

    .line 696
    .line 697
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/X;->i(Ljava/util/List;)I

    .line 698
    .line 699
    .line 700
    move-result v0

    .line 701
    if-lez v0, :cond_6

    .line 702
    .line 703
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->k0(I)I

    .line 704
    .line 705
    .line 706
    move-result v1

    .line 707
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/m;->m0(I)I

    .line 708
    .line 709
    .line 710
    move-result v2

    .line 711
    goto/16 :goto_5

    .line 712
    .line 713
    :pswitch_22
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    check-cast v0, Ljava/util/List;

    .line 718
    .line 719
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/X;->s(ILjava/util/List;)I

    .line 720
    .line 721
    .line 722
    move-result v0

    .line 723
    goto/16 :goto_3

    .line 724
    .line 725
    :pswitch_23
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    check-cast v0, Ljava/util/List;

    .line 730
    .line 731
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/X;->q(ILjava/util/List;)I

    .line 732
    .line 733
    .line 734
    move-result v0

    .line 735
    goto/16 :goto_3

    .line 736
    .line 737
    :pswitch_24
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v0

    .line 741
    check-cast v0, Ljava/util/List;

    .line 742
    .line 743
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/X;->h(ILjava/util/List;)I

    .line 744
    .line 745
    .line 746
    move-result v0

    .line 747
    goto/16 :goto_3

    .line 748
    .line 749
    :pswitch_25
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    check-cast v0, Ljava/util/List;

    .line 754
    .line 755
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/X;->f(ILjava/util/List;)I

    .line 756
    .line 757
    .line 758
    move-result v0

    .line 759
    goto/16 :goto_3

    .line 760
    .line 761
    :pswitch_26
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v0

    .line 765
    check-cast v0, Ljava/util/List;

    .line 766
    .line 767
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/X;->d(ILjava/util/List;)I

    .line 768
    .line 769
    .line 770
    move-result v0

    .line 771
    goto/16 :goto_3

    .line 772
    .line 773
    :pswitch_27
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    check-cast v0, Ljava/util/List;

    .line 778
    .line 779
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/X;->v(ILjava/util/List;)I

    .line 780
    .line 781
    .line 782
    move-result v0

    .line 783
    goto/16 :goto_3

    .line 784
    .line 785
    :pswitch_28
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 786
    .line 787
    .line 788
    move-result-object v0

    .line 789
    check-cast v0, Ljava/util/List;

    .line 790
    .line 791
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/X;->c(ILjava/util/List;)I

    .line 792
    .line 793
    .line 794
    move-result v0

    .line 795
    goto/16 :goto_3

    .line 796
    .line 797
    :pswitch_29
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    check-cast v0, Ljava/util/List;

    .line 802
    .line 803
    invoke-virtual {v6, v11}, Landroidx/datastore/preferences/protobuf/N;->m(I)Landroidx/datastore/preferences/protobuf/W;

    .line 804
    .line 805
    .line 806
    move-result-object v1

    .line 807
    invoke-static {v13, v0, v1}, Landroidx/datastore/preferences/protobuf/X;->p(ILjava/util/List;Landroidx/datastore/preferences/protobuf/W;)I

    .line 808
    .line 809
    .line 810
    move-result v0

    .line 811
    goto/16 :goto_3

    .line 812
    .line 813
    :pswitch_2a
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    check-cast v0, Ljava/util/List;

    .line 818
    .line 819
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/X;->u(ILjava/util/List;)I

    .line 820
    .line 821
    .line 822
    move-result v0

    .line 823
    goto/16 :goto_3

    .line 824
    .line 825
    :pswitch_2b
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 826
    .line 827
    .line 828
    move-result-object v0

    .line 829
    check-cast v0, Ljava/util/List;

    .line 830
    .line 831
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/X;->a(ILjava/util/List;)I

    .line 832
    .line 833
    .line 834
    move-result v0

    .line 835
    goto/16 :goto_3

    .line 836
    .line 837
    :pswitch_2c
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    check-cast v0, Ljava/util/List;

    .line 842
    .line 843
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/X;->f(ILjava/util/List;)I

    .line 844
    .line 845
    .line 846
    move-result v0

    .line 847
    goto/16 :goto_3

    .line 848
    .line 849
    :pswitch_2d
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    move-result-object v0

    .line 853
    check-cast v0, Ljava/util/List;

    .line 854
    .line 855
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/X;->h(ILjava/util/List;)I

    .line 856
    .line 857
    .line 858
    move-result v0

    .line 859
    goto/16 :goto_3

    .line 860
    .line 861
    :pswitch_2e
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    check-cast v0, Ljava/util/List;

    .line 866
    .line 867
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/X;->k(ILjava/util/List;)I

    .line 868
    .line 869
    .line 870
    move-result v0

    .line 871
    goto/16 :goto_3

    .line 872
    .line 873
    :pswitch_2f
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 874
    .line 875
    .line 876
    move-result-object v0

    .line 877
    check-cast v0, Ljava/util/List;

    .line 878
    .line 879
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/X;->x(ILjava/util/List;)I

    .line 880
    .line 881
    .line 882
    move-result v0

    .line 883
    goto/16 :goto_3

    .line 884
    .line 885
    :pswitch_30
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 886
    .line 887
    .line 888
    move-result-object v0

    .line 889
    check-cast v0, Ljava/util/List;

    .line 890
    .line 891
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/X;->m(ILjava/util/List;)I

    .line 892
    .line 893
    .line 894
    move-result v0

    .line 895
    goto/16 :goto_3

    .line 896
    .line 897
    :pswitch_31
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 898
    .line 899
    .line 900
    move-result-object v0

    .line 901
    check-cast v0, Ljava/util/List;

    .line 902
    .line 903
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/X;->f(ILjava/util/List;)I

    .line 904
    .line 905
    .line 906
    move-result v0

    .line 907
    goto/16 :goto_3

    .line 908
    .line 909
    :pswitch_32
    invoke-virtual {v8, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 910
    .line 911
    .line 912
    move-result-object v0

    .line 913
    check-cast v0, Ljava/util/List;

    .line 914
    .line 915
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/X;->h(ILjava/util/List;)I

    .line 916
    .line 917
    .line 918
    move-result v0

    .line 919
    goto/16 :goto_3

    .line 920
    .line 921
    :pswitch_33
    move-object/from16 v0, p0

    .line 922
    .line 923
    move-object/from16 v1, p1

    .line 924
    .line 925
    move-wide v3, v2

    .line 926
    move v2, v11

    .line 927
    move-wide v9, v3

    .line 928
    move v3, v14

    .line 929
    move v4, v15

    .line 930
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 931
    .line 932
    .line 933
    move-result v0

    .line 934
    if-eqz v0, :cond_6

    .line 935
    .line 936
    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 937
    .line 938
    .line 939
    move-result-object v0

    .line 940
    check-cast v0, Landroidx/datastore/preferences/protobuf/a;

    .line 941
    .line 942
    invoke-virtual {v6, v11}, Landroidx/datastore/preferences/protobuf/N;->m(I)Landroidx/datastore/preferences/protobuf/W;

    .line 943
    .line 944
    .line 945
    move-result-object v1

    .line 946
    invoke-static {v13, v0, v1}, Landroidx/datastore/preferences/protobuf/m;->b0(ILandroidx/datastore/preferences/protobuf/a;Landroidx/datastore/preferences/protobuf/W;)I

    .line 947
    .line 948
    .line 949
    move-result v0

    .line 950
    goto/16 :goto_3

    .line 951
    .line 952
    :pswitch_34
    move-wide v9, v2

    .line 953
    move-object/from16 v0, p0

    .line 954
    .line 955
    move-object/from16 v1, p1

    .line 956
    .line 957
    move v2, v11

    .line 958
    move v3, v14

    .line 959
    move v4, v15

    .line 960
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 961
    .line 962
    .line 963
    move-result v0

    .line 964
    if-eqz v0, :cond_6

    .line 965
    .line 966
    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 967
    .line 968
    .line 969
    move-result-wide v0

    .line 970
    invoke-static {v0, v1, v13}, Landroidx/datastore/preferences/protobuf/m;->h0(JI)I

    .line 971
    .line 972
    .line 973
    move-result v0

    .line 974
    goto/16 :goto_3

    .line 975
    .line 976
    :pswitch_35
    move-wide v9, v2

    .line 977
    move-object/from16 v0, p0

    .line 978
    .line 979
    move-object/from16 v1, p1

    .line 980
    .line 981
    move v2, v11

    .line 982
    move v3, v14

    .line 983
    move v4, v15

    .line 984
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 985
    .line 986
    .line 987
    move-result v0

    .line 988
    if-eqz v0, :cond_6

    .line 989
    .line 990
    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 991
    .line 992
    .line 993
    move-result v0

    .line 994
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/m;->g0(II)I

    .line 995
    .line 996
    .line 997
    move-result v0

    .line 998
    goto/16 :goto_3

    .line 999
    .line 1000
    :pswitch_36
    move-object/from16 v0, p0

    .line 1001
    .line 1002
    move-object/from16 v1, p1

    .line 1003
    .line 1004
    move v2, v11

    .line 1005
    move v3, v14

    .line 1006
    move v4, v15

    .line 1007
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1008
    .line 1009
    .line 1010
    move-result v0

    .line 1011
    if-eqz v0, :cond_6

    .line 1012
    .line 1013
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->f0(I)I

    .line 1014
    .line 1015
    .line 1016
    move-result v0

    .line 1017
    goto/16 :goto_3

    .line 1018
    .line 1019
    :pswitch_37
    move-object/from16 v0, p0

    .line 1020
    .line 1021
    move-object/from16 v1, p1

    .line 1022
    .line 1023
    move v2, v11

    .line 1024
    move v3, v14

    .line 1025
    move v4, v15

    .line 1026
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1027
    .line 1028
    .line 1029
    move-result v0

    .line 1030
    if-eqz v0, :cond_6

    .line 1031
    .line 1032
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->e0(I)I

    .line 1033
    .line 1034
    .line 1035
    move-result v0

    .line 1036
    goto/16 :goto_3

    .line 1037
    .line 1038
    :pswitch_38
    move-wide v9, v2

    .line 1039
    move-object/from16 v0, p0

    .line 1040
    .line 1041
    move-object/from16 v1, p1

    .line 1042
    .line 1043
    move v2, v11

    .line 1044
    move v3, v14

    .line 1045
    move v4, v15

    .line 1046
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1047
    .line 1048
    .line 1049
    move-result v0

    .line 1050
    if-eqz v0, :cond_6

    .line 1051
    .line 1052
    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1053
    .line 1054
    .line 1055
    move-result v0

    .line 1056
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/m;->X(II)I

    .line 1057
    .line 1058
    .line 1059
    move-result v0

    .line 1060
    goto/16 :goto_3

    .line 1061
    .line 1062
    :pswitch_39
    move-wide v9, v2

    .line 1063
    move-object/from16 v0, p0

    .line 1064
    .line 1065
    move-object/from16 v1, p1

    .line 1066
    .line 1067
    move v2, v11

    .line 1068
    move v3, v14

    .line 1069
    move v4, v15

    .line 1070
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1071
    .line 1072
    .line 1073
    move-result v0

    .line 1074
    if-eqz v0, :cond_6

    .line 1075
    .line 1076
    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1077
    .line 1078
    .line 1079
    move-result v0

    .line 1080
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/m;->l0(II)I

    .line 1081
    .line 1082
    .line 1083
    move-result v0

    .line 1084
    goto/16 :goto_3

    .line 1085
    .line 1086
    :pswitch_3a
    move-wide v9, v2

    .line 1087
    move-object/from16 v0, p0

    .line 1088
    .line 1089
    move-object/from16 v1, p1

    .line 1090
    .line 1091
    move v2, v11

    .line 1092
    move v3, v14

    .line 1093
    move v4, v15

    .line 1094
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1095
    .line 1096
    .line 1097
    move-result v0

    .line 1098
    if-eqz v0, :cond_6

    .line 1099
    .line 1100
    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v0

    .line 1104
    check-cast v0, Landroidx/datastore/preferences/protobuf/g;

    .line 1105
    .line 1106
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/m;->V(ILandroidx/datastore/preferences/protobuf/g;)I

    .line 1107
    .line 1108
    .line 1109
    move-result v0

    .line 1110
    goto/16 :goto_3

    .line 1111
    .line 1112
    :pswitch_3b
    move-wide v9, v2

    .line 1113
    move-object/from16 v0, p0

    .line 1114
    .line 1115
    move-object/from16 v1, p1

    .line 1116
    .line 1117
    move v2, v11

    .line 1118
    move v3, v14

    .line 1119
    move v4, v15

    .line 1120
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1121
    .line 1122
    .line 1123
    move-result v0

    .line 1124
    if-eqz v0, :cond_6

    .line 1125
    .line 1126
    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v0

    .line 1130
    invoke-virtual {v6, v11}, Landroidx/datastore/preferences/protobuf/N;->m(I)Landroidx/datastore/preferences/protobuf/W;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v1

    .line 1134
    invoke-static {v13, v0, v1}, Landroidx/datastore/preferences/protobuf/X;->o(ILjava/lang/Object;Landroidx/datastore/preferences/protobuf/W;)I

    .line 1135
    .line 1136
    .line 1137
    move-result v0

    .line 1138
    goto/16 :goto_3

    .line 1139
    .line 1140
    :pswitch_3c
    move-wide v9, v2

    .line 1141
    move-object/from16 v0, p0

    .line 1142
    .line 1143
    move-object/from16 v1, p1

    .line 1144
    .line 1145
    move v2, v11

    .line 1146
    move v3, v14

    .line 1147
    move v4, v15

    .line 1148
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1149
    .line 1150
    .line 1151
    move-result v0

    .line 1152
    if-eqz v0, :cond_6

    .line 1153
    .line 1154
    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v0

    .line 1158
    instance-of v1, v0, Landroidx/datastore/preferences/protobuf/g;

    .line 1159
    .line 1160
    if-eqz v1, :cond_5

    .line 1161
    .line 1162
    check-cast v0, Landroidx/datastore/preferences/protobuf/g;

    .line 1163
    .line 1164
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/m;->V(ILandroidx/datastore/preferences/protobuf/g;)I

    .line 1165
    .line 1166
    .line 1167
    move-result v0

    .line 1168
    goto/16 :goto_4

    .line 1169
    .line 1170
    :cond_5
    check-cast v0, Ljava/lang/String;

    .line 1171
    .line 1172
    invoke-static {v0, v13}, Landroidx/datastore/preferences/protobuf/m;->i0(Ljava/lang/String;I)I

    .line 1173
    .line 1174
    .line 1175
    move-result v0

    .line 1176
    goto/16 :goto_4

    .line 1177
    .line 1178
    :pswitch_3d
    move-object/from16 v0, p0

    .line 1179
    .line 1180
    move-object/from16 v1, p1

    .line 1181
    .line 1182
    move v2, v11

    .line 1183
    move v3, v14

    .line 1184
    move v4, v15

    .line 1185
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1186
    .line 1187
    .line 1188
    move-result v0

    .line 1189
    if-eqz v0, :cond_6

    .line 1190
    .line 1191
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->U(I)I

    .line 1192
    .line 1193
    .line 1194
    move-result v0

    .line 1195
    goto/16 :goto_3

    .line 1196
    .line 1197
    :pswitch_3e
    move-object/from16 v0, p0

    .line 1198
    .line 1199
    move-object/from16 v1, p1

    .line 1200
    .line 1201
    move v2, v11

    .line 1202
    move v3, v14

    .line 1203
    move v4, v15

    .line 1204
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1205
    .line 1206
    .line 1207
    move-result v0

    .line 1208
    if-eqz v0, :cond_6

    .line 1209
    .line 1210
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->Y(I)I

    .line 1211
    .line 1212
    .line 1213
    move-result v0

    .line 1214
    goto/16 :goto_3

    .line 1215
    .line 1216
    :pswitch_3f
    move-object/from16 v0, p0

    .line 1217
    .line 1218
    move-object/from16 v1, p1

    .line 1219
    .line 1220
    move v2, v11

    .line 1221
    move v3, v14

    .line 1222
    move v4, v15

    .line 1223
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1224
    .line 1225
    .line 1226
    move-result v0

    .line 1227
    if-eqz v0, :cond_6

    .line 1228
    .line 1229
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->Z(I)I

    .line 1230
    .line 1231
    .line 1232
    move-result v0

    .line 1233
    goto/16 :goto_3

    .line 1234
    .line 1235
    :pswitch_40
    move-wide v9, v2

    .line 1236
    move-object/from16 v0, p0

    .line 1237
    .line 1238
    move-object/from16 v1, p1

    .line 1239
    .line 1240
    move v2, v11

    .line 1241
    move v3, v14

    .line 1242
    move v4, v15

    .line 1243
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1244
    .line 1245
    .line 1246
    move-result v0

    .line 1247
    if-eqz v0, :cond_6

    .line 1248
    .line 1249
    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1250
    .line 1251
    .line 1252
    move-result v0

    .line 1253
    invoke-static {v13, v0}, Landroidx/datastore/preferences/protobuf/m;->c0(II)I

    .line 1254
    .line 1255
    .line 1256
    move-result v0

    .line 1257
    goto/16 :goto_3

    .line 1258
    .line 1259
    :pswitch_41
    move-wide v9, v2

    .line 1260
    move-object/from16 v0, p0

    .line 1261
    .line 1262
    move-object/from16 v1, p1

    .line 1263
    .line 1264
    move v2, v11

    .line 1265
    move v3, v14

    .line 1266
    move v4, v15

    .line 1267
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1268
    .line 1269
    .line 1270
    move-result v0

    .line 1271
    if-eqz v0, :cond_6

    .line 1272
    .line 1273
    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1274
    .line 1275
    .line 1276
    move-result-wide v0

    .line 1277
    invoke-static {v0, v1, v13}, Landroidx/datastore/preferences/protobuf/m;->n0(JI)I

    .line 1278
    .line 1279
    .line 1280
    move-result v0

    .line 1281
    goto/16 :goto_3

    .line 1282
    .line 1283
    :pswitch_42
    move-wide v9, v2

    .line 1284
    move-object/from16 v0, p0

    .line 1285
    .line 1286
    move-object/from16 v1, p1

    .line 1287
    .line 1288
    move v2, v11

    .line 1289
    move v3, v14

    .line 1290
    move v4, v15

    .line 1291
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1292
    .line 1293
    .line 1294
    move-result v0

    .line 1295
    if-eqz v0, :cond_6

    .line 1296
    .line 1297
    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1298
    .line 1299
    .line 1300
    move-result-wide v0

    .line 1301
    invoke-static {v0, v1, v13}, Landroidx/datastore/preferences/protobuf/m;->d0(JI)I

    .line 1302
    .line 1303
    .line 1304
    move-result v0

    .line 1305
    goto/16 :goto_3

    .line 1306
    .line 1307
    :pswitch_43
    move-object/from16 v0, p0

    .line 1308
    .line 1309
    move-object/from16 v1, p1

    .line 1310
    .line 1311
    move v2, v11

    .line 1312
    move v3, v14

    .line 1313
    move v4, v15

    .line 1314
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1315
    .line 1316
    .line 1317
    move-result v0

    .line 1318
    if-eqz v0, :cond_6

    .line 1319
    .line 1320
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->a0(I)I

    .line 1321
    .line 1322
    .line 1323
    move-result v0

    .line 1324
    goto/16 :goto_3

    .line 1325
    .line 1326
    :pswitch_44
    move-object/from16 v0, p0

    .line 1327
    .line 1328
    move-object/from16 v1, p1

    .line 1329
    .line 1330
    move v2, v11

    .line 1331
    move v3, v14

    .line 1332
    move v4, v15

    .line 1333
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/N;->o(Ljava/lang/Object;IIII)Z

    .line 1334
    .line 1335
    .line 1336
    move-result v0

    .line 1337
    if-eqz v0, :cond_6

    .line 1338
    .line 1339
    invoke-static {v13}, Landroidx/datastore/preferences/protobuf/m;->W(I)I

    .line 1340
    .line 1341
    .line 1342
    move-result v0

    .line 1343
    goto/16 :goto_3

    .line 1344
    .line 1345
    :cond_6
    :goto_6
    add-int/lit8 v11, v11, 0x3

    .line 1346
    .line 1347
    move v0, v14

    .line 1348
    move v1, v15

    .line 1349
    const v10, 0xfffff

    .line 1350
    .line 1351
    .line 1352
    goto/16 :goto_0

    .line 1353
    .line 1354
    :cond_7
    iget-object v0, v6, Landroidx/datastore/preferences/protobuf/N;->l:Landroidx/datastore/preferences/protobuf/e0;

    .line 1355
    .line 1356
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1357
    .line 1358
    .line 1359
    iget-object v0, v7, Landroidx/datastore/preferences/protobuf/w;->unknownFields:Landroidx/datastore/preferences/protobuf/d0;

    .line 1360
    .line 1361
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/d0;->b()I

    .line 1362
    .line 1363
    .line 1364
    move-result v0

    .line 1365
    add-int/2addr v0, v12

    .line 1366
    return v0

    .line 1367
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g()Landroidx/datastore/preferences/protobuf/w;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/N;->j:Landroidx/datastore/preferences/protobuf/P;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/N;->e:Landroidx/datastore/preferences/protobuf/a;

    .line 7
    .line 8
    check-cast v0, Landroidx/datastore/preferences/protobuf/w;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/w;->k()Landroidx/datastore/preferences/protobuf/w;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method public final h(Ljava/lang/Object;)V
    .locals 8

    .line 1
    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/N;->p(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    instance-of v0, p1, Landroidx/datastore/preferences/protobuf/w;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    move-object v0, p1

    .line 13
    check-cast v0, Landroidx/datastore/preferences/protobuf/w;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/w;->d()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/w;->c()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/w;->j()V

    .line 22
    .line 23
    .line 24
    :cond_1
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/N;->a:[I

    .line 25
    .line 26
    array-length v1, v0

    .line 27
    const/4 v2, 0x0

    .line 28
    :goto_0
    if-ge v2, v1, :cond_5

    .line 29
    .line 30
    invoke-virtual {p0, v2}, Landroidx/datastore/preferences/protobuf/N;->M(I)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const v4, 0xfffff

    .line 35
    .line 36
    .line 37
    and-int/2addr v4, v3

    .line 38
    int-to-long v4, v4

    .line 39
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->L(I)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    const/16 v6, 0x9

    .line 44
    .line 45
    if-eq v3, v6, :cond_3

    .line 46
    .line 47
    const/16 v6, 0x3c

    .line 48
    .line 49
    if-eq v3, v6, :cond_2

    .line 50
    .line 51
    const/16 v6, 0x44

    .line 52
    .line 53
    if-eq v3, v6, :cond_2

    .line 54
    .line 55
    packed-switch v3, :pswitch_data_0

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :pswitch_0
    sget-object v3, Landroidx/datastore/preferences/protobuf/N;->o:Lsun/misc/Unsafe;

    .line 60
    .line 61
    invoke-virtual {v3, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    if-eqz v6, :cond_4

    .line 66
    .line 67
    iget-object v7, p0, Landroidx/datastore/preferences/protobuf/N;->m:Landroidx/datastore/preferences/protobuf/J;

    .line 68
    .line 69
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/J;->c(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3, p1, v4, v5, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :pswitch_1
    iget-object v3, p0, Landroidx/datastore/preferences/protobuf/N;->k:Landroidx/datastore/preferences/protobuf/C;

    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-static {v4, v5, p1}, Landroidx/datastore/preferences/protobuf/C;->a(JLjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    aget v3, v0, v2

    .line 89
    .line 90
    invoke-virtual {p0, p1, v3, v2}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_4

    .line 95
    .line 96
    invoke-virtual {p0, v2}, Landroidx/datastore/preferences/protobuf/N;->m(I)Landroidx/datastore/preferences/protobuf/W;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    sget-object v6, Landroidx/datastore/preferences/protobuf/N;->o:Lsun/misc/Unsafe;

    .line 101
    .line 102
    invoke-virtual {v6, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-interface {v3, v4}, Landroidx/datastore/preferences/protobuf/W;->h(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    :pswitch_2
    invoke-virtual {p0, v2, p1}, Landroidx/datastore/preferences/protobuf/N;->n(ILjava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-eqz v3, :cond_4

    .line 115
    .line 116
    invoke-virtual {p0, v2}, Landroidx/datastore/preferences/protobuf/N;->m(I)Landroidx/datastore/preferences/protobuf/W;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    sget-object v6, Landroidx/datastore/preferences/protobuf/N;->o:Lsun/misc/Unsafe;

    .line 121
    .line 122
    invoke-virtual {v6, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-interface {v3, v4}, Landroidx/datastore/preferences/protobuf/W;->h(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_4
    :goto_1
    add-int/lit8 v2, v2, 0x3

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_5
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/N;->l:Landroidx/datastore/preferences/protobuf/e0;

    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/e0;->b(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Landroidx/datastore/preferences/protobuf/w;Ljava/lang/Object;)Z
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/N;->a:[I

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    :goto_0
    const/4 v4, 0x1

    .line 7
    if-ge v3, v1, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0, v3}, Landroidx/datastore/preferences/protobuf/N;->M(I)I

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    const v6, 0xfffff

    .line 14
    .line 15
    .line 16
    and-int v7, v5, v6

    .line 17
    .line 18
    int-to-long v7, v7

    .line 19
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/N;->L(I)I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    packed-switch v5, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    goto/16 :goto_1

    .line 27
    .line 28
    :pswitch_0
    add-int/lit8 v5, v3, 0x2

    .line 29
    .line 30
    aget v5, v0, v5

    .line 31
    .line 32
    and-int/2addr v5, v6

    .line 33
    int-to-long v5, v5

    .line 34
    sget-object v9, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 35
    .line 36
    invoke-virtual {v9, v5, v6, p1}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 37
    .line 38
    .line 39
    move-result v10

    .line 40
    invoke-virtual {v9, v5, v6, p2}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-ne v10, v5, :cond_0

    .line 45
    .line 46
    invoke-virtual {v9, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v9, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-static {v5, v6}, Landroidx/datastore/preferences/protobuf/X;->B(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_0

    .line 59
    .line 60
    goto/16 :goto_1

    .line 61
    .line 62
    :cond_0
    const/4 v4, 0x0

    .line 63
    goto/16 :goto_1

    .line 64
    .line 65
    :pswitch_1
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 66
    .line 67
    invoke-virtual {v4, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-virtual {v4, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-static {v5, v4}, Landroidx/datastore/preferences/protobuf/X;->B(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    goto/16 :goto_1

    .line 80
    .line 81
    :pswitch_2
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 82
    .line 83
    invoke-virtual {v4, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual {v4, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-static {v5, v4}, Landroidx/datastore/preferences/protobuf/X;->B(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    goto/16 :goto_1

    .line 96
    .line 97
    :pswitch_3
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/N;->j(Landroidx/datastore/preferences/protobuf/w;Ljava/lang/Object;I)Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-eqz v5, :cond_0

    .line 102
    .line 103
    sget-object v5, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 104
    .line 105
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-static {v6, v5}, Landroidx/datastore/preferences/protobuf/X;->B(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_0

    .line 118
    .line 119
    goto/16 :goto_1

    .line 120
    .line 121
    :pswitch_4
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/N;->j(Landroidx/datastore/preferences/protobuf/w;Ljava/lang/Object;I)Z

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    if-eqz v5, :cond_0

    .line 126
    .line 127
    sget-object v5, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 128
    .line 129
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/i0;->g(JLjava/lang/Object;)J

    .line 130
    .line 131
    .line 132
    move-result-wide v9

    .line 133
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/i0;->g(JLjava/lang/Object;)J

    .line 134
    .line 135
    .line 136
    move-result-wide v5

    .line 137
    cmp-long v7, v9, v5

    .line 138
    .line 139
    if-nez v7, :cond_0

    .line 140
    .line 141
    goto/16 :goto_1

    .line 142
    .line 143
    :pswitch_5
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/N;->j(Landroidx/datastore/preferences/protobuf/w;Ljava/lang/Object;I)Z

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    if-eqz v5, :cond_0

    .line 148
    .line 149
    sget-object v5, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 150
    .line 151
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 152
    .line 153
    .line 154
    move-result v6

    .line 155
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    if-ne v6, v5, :cond_0

    .line 160
    .line 161
    goto/16 :goto_1

    .line 162
    .line 163
    :pswitch_6
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/N;->j(Landroidx/datastore/preferences/protobuf/w;Ljava/lang/Object;I)Z

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    if-eqz v5, :cond_0

    .line 168
    .line 169
    sget-object v5, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 170
    .line 171
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/i0;->g(JLjava/lang/Object;)J

    .line 172
    .line 173
    .line 174
    move-result-wide v9

    .line 175
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/i0;->g(JLjava/lang/Object;)J

    .line 176
    .line 177
    .line 178
    move-result-wide v5

    .line 179
    cmp-long v7, v9, v5

    .line 180
    .line 181
    if-nez v7, :cond_0

    .line 182
    .line 183
    goto/16 :goto_1

    .line 184
    .line 185
    :pswitch_7
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/N;->j(Landroidx/datastore/preferences/protobuf/w;Ljava/lang/Object;I)Z

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    if-eqz v5, :cond_0

    .line 190
    .line 191
    sget-object v5, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 192
    .line 193
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    if-ne v6, v5, :cond_0

    .line 202
    .line 203
    goto/16 :goto_1

    .line 204
    .line 205
    :pswitch_8
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/N;->j(Landroidx/datastore/preferences/protobuf/w;Ljava/lang/Object;I)Z

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    if-eqz v5, :cond_0

    .line 210
    .line 211
    sget-object v5, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 212
    .line 213
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 214
    .line 215
    .line 216
    move-result v6

    .line 217
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 218
    .line 219
    .line 220
    move-result v5

    .line 221
    if-ne v6, v5, :cond_0

    .line 222
    .line 223
    goto/16 :goto_1

    .line 224
    .line 225
    :pswitch_9
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/N;->j(Landroidx/datastore/preferences/protobuf/w;Ljava/lang/Object;I)Z

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    if-eqz v5, :cond_0

    .line 230
    .line 231
    sget-object v5, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 232
    .line 233
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 234
    .line 235
    .line 236
    move-result v6

    .line 237
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    if-ne v6, v5, :cond_0

    .line 242
    .line 243
    goto/16 :goto_1

    .line 244
    .line 245
    :pswitch_a
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/N;->j(Landroidx/datastore/preferences/protobuf/w;Ljava/lang/Object;I)Z

    .line 246
    .line 247
    .line 248
    move-result v5

    .line 249
    if-eqz v5, :cond_0

    .line 250
    .line 251
    sget-object v5, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 252
    .line 253
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    invoke-static {v6, v5}, Landroidx/datastore/preferences/protobuf/X;->B(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v5

    .line 265
    if-eqz v5, :cond_0

    .line 266
    .line 267
    goto/16 :goto_1

    .line 268
    .line 269
    :pswitch_b
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/N;->j(Landroidx/datastore/preferences/protobuf/w;Ljava/lang/Object;I)Z

    .line 270
    .line 271
    .line 272
    move-result v5

    .line 273
    if-eqz v5, :cond_0

    .line 274
    .line 275
    sget-object v5, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 276
    .line 277
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v6

    .line 281
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    invoke-static {v6, v5}, Landroidx/datastore/preferences/protobuf/X;->B(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v5

    .line 289
    if-eqz v5, :cond_0

    .line 290
    .line 291
    goto/16 :goto_1

    .line 292
    .line 293
    :pswitch_c
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/N;->j(Landroidx/datastore/preferences/protobuf/w;Ljava/lang/Object;I)Z

    .line 294
    .line 295
    .line 296
    move-result v5

    .line 297
    if-eqz v5, :cond_0

    .line 298
    .line 299
    sget-object v5, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 300
    .line 301
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v6

    .line 305
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v5

    .line 309
    invoke-static {v6, v5}, Landroidx/datastore/preferences/protobuf/X;->B(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v5

    .line 313
    if-eqz v5, :cond_0

    .line 314
    .line 315
    goto/16 :goto_1

    .line 316
    .line 317
    :pswitch_d
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/N;->j(Landroidx/datastore/preferences/protobuf/w;Ljava/lang/Object;I)Z

    .line 318
    .line 319
    .line 320
    move-result v5

    .line 321
    if-eqz v5, :cond_0

    .line 322
    .line 323
    sget-object v5, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 324
    .line 325
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/i0;->c(JLjava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v6

    .line 329
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/i0;->c(JLjava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v5

    .line 333
    if-ne v6, v5, :cond_0

    .line 334
    .line 335
    goto/16 :goto_1

    .line 336
    .line 337
    :pswitch_e
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/N;->j(Landroidx/datastore/preferences/protobuf/w;Ljava/lang/Object;I)Z

    .line 338
    .line 339
    .line 340
    move-result v5

    .line 341
    if-eqz v5, :cond_0

    .line 342
    .line 343
    sget-object v5, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 344
    .line 345
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 346
    .line 347
    .line 348
    move-result v6

    .line 349
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 350
    .line 351
    .line 352
    move-result v5

    .line 353
    if-ne v6, v5, :cond_0

    .line 354
    .line 355
    goto/16 :goto_1

    .line 356
    .line 357
    :pswitch_f
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/N;->j(Landroidx/datastore/preferences/protobuf/w;Ljava/lang/Object;I)Z

    .line 358
    .line 359
    .line 360
    move-result v5

    .line 361
    if-eqz v5, :cond_0

    .line 362
    .line 363
    sget-object v5, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 364
    .line 365
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/i0;->g(JLjava/lang/Object;)J

    .line 366
    .line 367
    .line 368
    move-result-wide v9

    .line 369
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/i0;->g(JLjava/lang/Object;)J

    .line 370
    .line 371
    .line 372
    move-result-wide v5

    .line 373
    cmp-long v7, v9, v5

    .line 374
    .line 375
    if-nez v7, :cond_0

    .line 376
    .line 377
    goto/16 :goto_1

    .line 378
    .line 379
    :pswitch_10
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/N;->j(Landroidx/datastore/preferences/protobuf/w;Ljava/lang/Object;I)Z

    .line 380
    .line 381
    .line 382
    move-result v5

    .line 383
    if-eqz v5, :cond_0

    .line 384
    .line 385
    sget-object v5, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 386
    .line 387
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 388
    .line 389
    .line 390
    move-result v6

    .line 391
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 392
    .line 393
    .line 394
    move-result v5

    .line 395
    if-ne v6, v5, :cond_0

    .line 396
    .line 397
    goto :goto_1

    .line 398
    :pswitch_11
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/N;->j(Landroidx/datastore/preferences/protobuf/w;Ljava/lang/Object;I)Z

    .line 399
    .line 400
    .line 401
    move-result v5

    .line 402
    if-eqz v5, :cond_0

    .line 403
    .line 404
    sget-object v5, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 405
    .line 406
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/i0;->g(JLjava/lang/Object;)J

    .line 407
    .line 408
    .line 409
    move-result-wide v9

    .line 410
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/i0;->g(JLjava/lang/Object;)J

    .line 411
    .line 412
    .line 413
    move-result-wide v5

    .line 414
    cmp-long v7, v9, v5

    .line 415
    .line 416
    if-nez v7, :cond_0

    .line 417
    .line 418
    goto :goto_1

    .line 419
    :pswitch_12
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/N;->j(Landroidx/datastore/preferences/protobuf/w;Ljava/lang/Object;I)Z

    .line 420
    .line 421
    .line 422
    move-result v5

    .line 423
    if-eqz v5, :cond_0

    .line 424
    .line 425
    sget-object v5, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 426
    .line 427
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/i0;->g(JLjava/lang/Object;)J

    .line 428
    .line 429
    .line 430
    move-result-wide v9

    .line 431
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/i0;->g(JLjava/lang/Object;)J

    .line 432
    .line 433
    .line 434
    move-result-wide v5

    .line 435
    cmp-long v7, v9, v5

    .line 436
    .line 437
    if-nez v7, :cond_0

    .line 438
    .line 439
    goto :goto_1

    .line 440
    :pswitch_13
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/N;->j(Landroidx/datastore/preferences/protobuf/w;Ljava/lang/Object;I)Z

    .line 441
    .line 442
    .line 443
    move-result v5

    .line 444
    if-eqz v5, :cond_0

    .line 445
    .line 446
    sget-object v5, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 447
    .line 448
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/i0;->e(JLjava/lang/Object;)F

    .line 449
    .line 450
    .line 451
    move-result v6

    .line 452
    invoke-static {v6}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 453
    .line 454
    .line 455
    move-result v6

    .line 456
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/i0;->e(JLjava/lang/Object;)F

    .line 457
    .line 458
    .line 459
    move-result v5

    .line 460
    invoke-static {v5}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 461
    .line 462
    .line 463
    move-result v5

    .line 464
    if-ne v6, v5, :cond_0

    .line 465
    .line 466
    goto :goto_1

    .line 467
    :pswitch_14
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/N;->j(Landroidx/datastore/preferences/protobuf/w;Ljava/lang/Object;I)Z

    .line 468
    .line 469
    .line 470
    move-result v5

    .line 471
    if-eqz v5, :cond_0

    .line 472
    .line 473
    sget-object v5, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 474
    .line 475
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/i0;->d(JLjava/lang/Object;)D

    .line 476
    .line 477
    .line 478
    move-result-wide v9

    .line 479
    invoke-static {v9, v10}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 480
    .line 481
    .line 482
    move-result-wide v9

    .line 483
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/i0;->d(JLjava/lang/Object;)D

    .line 484
    .line 485
    .line 486
    move-result-wide v5

    .line 487
    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 488
    .line 489
    .line 490
    move-result-wide v5

    .line 491
    cmp-long v7, v9, v5

    .line 492
    .line 493
    if-nez v7, :cond_0

    .line 494
    .line 495
    :goto_1
    if-nez v4, :cond_1

    .line 496
    .line 497
    return v2

    .line 498
    :cond_1
    add-int/lit8 v3, v3, 0x3

    .line 499
    .line 500
    goto/16 :goto_0

    .line 501
    .line 502
    :cond_2
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/N;->l:Landroidx/datastore/preferences/protobuf/e0;

    .line 503
    .line 504
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 505
    .line 506
    .line 507
    iget-object p1, p1, Landroidx/datastore/preferences/protobuf/w;->unknownFields:Landroidx/datastore/preferences/protobuf/d0;

    .line 508
    .line 509
    check-cast p2, Landroidx/datastore/preferences/protobuf/w;

    .line 510
    .line 511
    iget-object p2, p2, Landroidx/datastore/preferences/protobuf/w;->unknownFields:Landroidx/datastore/preferences/protobuf/d0;

    .line 512
    .line 513
    invoke-virtual {p1, p2}, Landroidx/datastore/preferences/protobuf/d0;->equals(Ljava/lang/Object;)Z

    .line 514
    .line 515
    .line 516
    move-result p1

    .line 517
    if-nez p1, :cond_3

    .line 518
    .line 519
    return v2

    .line 520
    :cond_3
    return v4

    .line 521
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Landroidx/datastore/preferences/protobuf/w;Ljava/lang/Object;I)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p3, p1}, Landroidx/datastore/preferences/protobuf/N;->n(ILjava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p3, p2}, Landroidx/datastore/preferences/protobuf/N;->n(ILjava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    return p1
.end method

.method public final k(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/N;->a:[I

    .line 2
    .line 3
    aget p3, p3, p1

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/N;->M(I)I

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    const v0, 0xfffff

    .line 10
    .line 11
    .line 12
    and-int/2addr p3, v0

    .line 13
    int-to-long v0, p3

    .line 14
    sget-object p3, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 15
    .line 16
    invoke-virtual {p3, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    if-nez p2, :cond_0

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/N;->l(I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final l(I)V
    .locals 1

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    mul-int/lit8 p1, p1, 0x2

    .line 4
    .line 5
    add-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/N;->b:[Ljava/lang/Object;

    .line 8
    .line 9
    aget-object p1, v0, p1

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/ClassCastException;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw p1
.end method

.method public final m(I)Landroidx/datastore/preferences/protobuf/W;
    .locals 3

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    mul-int/lit8 p1, p1, 0x2

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/N;->b:[Ljava/lang/Object;

    .line 6
    .line 7
    aget-object v1, v0, p1

    .line 8
    .line 9
    check-cast v1, Landroidx/datastore/preferences/protobuf/W;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    sget-object v1, Landroidx/datastore/preferences/protobuf/T;->c:Landroidx/datastore/preferences/protobuf/T;

    .line 15
    .line 16
    add-int/lit8 v2, p1, 0x1

    .line 17
    .line 18
    aget-object v2, v0, v2

    .line 19
    .line 20
    check-cast v2, Ljava/lang/Class;

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroidx/datastore/preferences/protobuf/T;->a(Ljava/lang/Class;)Landroidx/datastore/preferences/protobuf/W;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    aput-object v1, v0, p1

    .line 27
    .line 28
    return-object v1
.end method

.method public final n(ILjava/lang/Object;)Z
    .locals 9

    .line 1
    add-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/N;->a:[I

    .line 4
    .line 5
    aget v0, v1, v0

    .line 6
    .line 7
    const v1, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int v2, v0, v1

    .line 11
    .line 12
    int-to-long v2, v2

    .line 13
    const-wide/32 v4, 0xfffff

    .line 14
    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x1

    .line 18
    cmp-long v8, v2, v4

    .line 19
    .line 20
    if-nez v8, :cond_11

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/N;->M(I)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    and-int v0, p1, v1

    .line 27
    .line 28
    int-to-long v0, v0

    .line 29
    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/N;->L(I)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const-wide/16 v2, 0x0

    .line 34
    .line 35
    packed-switch p1, :pswitch_data_0

    .line 36
    .line 37
    .line 38
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 39
    .line 40
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :pswitch_0
    sget-object p1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 45
    .line 46
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-eqz p1, :cond_0

    .line 51
    .line 52
    const/4 v6, 0x1

    .line 53
    :cond_0
    return v6

    .line 54
    :pswitch_1
    sget-object p1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 55
    .line 56
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/i0;->g(JLjava/lang/Object;)J

    .line 57
    .line 58
    .line 59
    move-result-wide p1

    .line 60
    cmp-long v0, p1, v2

    .line 61
    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    const/4 v6, 0x1

    .line 65
    :cond_1
    return v6

    .line 66
    :pswitch_2
    sget-object p1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 67
    .line 68
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_2

    .line 73
    .line 74
    const/4 v6, 0x1

    .line 75
    :cond_2
    return v6

    .line 76
    :pswitch_3
    sget-object p1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 77
    .line 78
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/i0;->g(JLjava/lang/Object;)J

    .line 79
    .line 80
    .line 81
    move-result-wide p1

    .line 82
    cmp-long v0, p1, v2

    .line 83
    .line 84
    if-eqz v0, :cond_3

    .line 85
    .line 86
    const/4 v6, 0x1

    .line 87
    :cond_3
    return v6

    .line 88
    :pswitch_4
    sget-object p1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 89
    .line 90
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-eqz p1, :cond_4

    .line 95
    .line 96
    const/4 v6, 0x1

    .line 97
    :cond_4
    return v6

    .line 98
    :pswitch_5
    sget-object p1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 99
    .line 100
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_5

    .line 105
    .line 106
    const/4 v6, 0x1

    .line 107
    :cond_5
    return v6

    .line 108
    :pswitch_6
    sget-object p1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 109
    .line 110
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-eqz p1, :cond_6

    .line 115
    .line 116
    const/4 v6, 0x1

    .line 117
    :cond_6
    return v6

    .line 118
    :pswitch_7
    sget-object p1, Landroidx/datastore/preferences/protobuf/g;->g:Landroidx/datastore/preferences/protobuf/g;

    .line 119
    .line 120
    sget-object v2, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 121
    .line 122
    invoke-virtual {v2, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    invoke-virtual {p1, p2}, Landroidx/datastore/preferences/protobuf/g;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    xor-int/2addr p1, v7

    .line 131
    return p1

    .line 132
    :pswitch_8
    sget-object p1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 133
    .line 134
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    if-eqz p1, :cond_7

    .line 139
    .line 140
    const/4 v6, 0x1

    .line 141
    :cond_7
    return v6

    .line 142
    :pswitch_9
    sget-object p1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 143
    .line 144
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    instance-of p2, p1, Ljava/lang/String;

    .line 149
    .line 150
    if-eqz p2, :cond_8

    .line 151
    .line 152
    check-cast p1, Ljava/lang/String;

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    xor-int/2addr p1, v7

    .line 159
    return p1

    .line 160
    :cond_8
    instance-of p2, p1, Landroidx/datastore/preferences/protobuf/g;

    .line 161
    .line 162
    if-eqz p2, :cond_9

    .line 163
    .line 164
    sget-object p2, Landroidx/datastore/preferences/protobuf/g;->g:Landroidx/datastore/preferences/protobuf/g;

    .line 165
    .line 166
    invoke-virtual {p2, p1}, Landroidx/datastore/preferences/protobuf/g;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    xor-int/2addr p1, v7

    .line 171
    return p1

    .line 172
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 173
    .line 174
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 175
    .line 176
    .line 177
    throw p1

    .line 178
    :pswitch_a
    sget-object p1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 179
    .line 180
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/i0;->c(JLjava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    return p1

    .line 185
    :pswitch_b
    sget-object p1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 186
    .line 187
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    if-eqz p1, :cond_a

    .line 192
    .line 193
    const/4 v6, 0x1

    .line 194
    :cond_a
    return v6

    .line 195
    :pswitch_c
    sget-object p1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 196
    .line 197
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/i0;->g(JLjava/lang/Object;)J

    .line 198
    .line 199
    .line 200
    move-result-wide p1

    .line 201
    cmp-long v0, p1, v2

    .line 202
    .line 203
    if-eqz v0, :cond_b

    .line 204
    .line 205
    const/4 v6, 0x1

    .line 206
    :cond_b
    return v6

    .line 207
    :pswitch_d
    sget-object p1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 208
    .line 209
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    if-eqz p1, :cond_c

    .line 214
    .line 215
    const/4 v6, 0x1

    .line 216
    :cond_c
    return v6

    .line 217
    :pswitch_e
    sget-object p1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 218
    .line 219
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/i0;->g(JLjava/lang/Object;)J

    .line 220
    .line 221
    .line 222
    move-result-wide p1

    .line 223
    cmp-long v0, p1, v2

    .line 224
    .line 225
    if-eqz v0, :cond_d

    .line 226
    .line 227
    const/4 v6, 0x1

    .line 228
    :cond_d
    return v6

    .line 229
    :pswitch_f
    sget-object p1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 230
    .line 231
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/i0;->g(JLjava/lang/Object;)J

    .line 232
    .line 233
    .line 234
    move-result-wide p1

    .line 235
    cmp-long v0, p1, v2

    .line 236
    .line 237
    if-eqz v0, :cond_e

    .line 238
    .line 239
    const/4 v6, 0x1

    .line 240
    :cond_e
    return v6

    .line 241
    :pswitch_10
    sget-object p1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 242
    .line 243
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/i0;->e(JLjava/lang/Object;)F

    .line 244
    .line 245
    .line 246
    move-result p1

    .line 247
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    if-eqz p1, :cond_f

    .line 252
    .line 253
    const/4 v6, 0x1

    .line 254
    :cond_f
    return v6

    .line 255
    :pswitch_11
    sget-object p1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 256
    .line 257
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/i0;->d(JLjava/lang/Object;)D

    .line 258
    .line 259
    .line 260
    move-result-wide p1

    .line 261
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 262
    .line 263
    .line 264
    move-result-wide p1

    .line 265
    cmp-long v0, p1, v2

    .line 266
    .line 267
    if-eqz v0, :cond_10

    .line 268
    .line 269
    const/4 v6, 0x1

    .line 270
    :cond_10
    return v6

    .line 271
    :cond_11
    ushr-int/lit8 p1, v0, 0x14

    .line 272
    .line 273
    shl-int p1, v7, p1

    .line 274
    .line 275
    sget-object v0, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 276
    .line 277
    invoke-virtual {v0, v2, v3, p2}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 278
    .line 279
    .line 280
    move-result p2

    .line 281
    and-int/2addr p1, p2

    .line 282
    if-eqz p1, :cond_12

    .line 283
    .line 284
    const/4 v6, 0x1

    .line 285
    :cond_12
    return v6

    .line 286
    nop

    .line 287
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final o(Ljava/lang/Object;IIII)Z
    .locals 1

    .line 1
    const v0, 0xfffff

    .line 2
    .line 3
    .line 4
    if-ne p3, v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0, p2, p1}, Landroidx/datastore/preferences/protobuf/N;->n(ILjava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :cond_0
    and-int p1, p4, p5

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 p1, 0x0

    .line 18
    :goto_0
    return p1
.end method

.method public final q(Ljava/lang/Object;II)Z
    .locals 2

    .line 1
    add-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/N;->a:[I

    .line 4
    .line 5
    aget p3, v0, p3

    .line 6
    .line 7
    const v0, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr p3, v0

    .line 11
    int-to-long v0, p3

    .line 12
    sget-object p3, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 13
    .line 14
    invoke-virtual {p3, v0, v1, p1}, Landroidx/datastore/preferences/protobuf/i0;->f(JLjava/lang/Object;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-ne p1, p2, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    :goto_0
    return p1
.end method

.method public final r(Landroidx/datastore/preferences/protobuf/e0;Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/k;Landroidx/datastore/preferences/protobuf/o;)V
    .locals 19

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move-object/from16 v0, p3

    move-object/from16 v11, p4

    .line 1
    iget-object v12, v8, Landroidx/datastore/preferences/protobuf/N;->g:[I

    iget v13, v8, Landroidx/datastore/preferences/protobuf/N;->i:I

    iget v14, v8, Landroidx/datastore/preferences/protobuf/N;->h:I

    const/4 v1, 0x0

    move-object v15, v1

    .line 2
    :goto_0
    :try_start_0
    invoke-virtual/range {p3 .. p3}, Landroidx/datastore/preferences/protobuf/k;->a()I

    move-result v1

    .line 3
    invoke-virtual {v8, v1}, Landroidx/datastore/preferences/protobuf/N;->B(I)I

    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v6, 0x0

    if-gez v7, :cond_7

    const v2, 0x7fffffff

    if-ne v1, v2, :cond_2

    :goto_1
    if-ge v14, v13, :cond_0

    .line 4
    aget v0, v12, v14

    .line 5
    invoke-virtual {v8, v0, v10, v15}, Landroidx/datastore/preferences/protobuf/N;->k(ILjava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v14, v14, 0x1

    goto :goto_1

    :cond_0
    if-eqz v15, :cond_1

    .line 6
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    move-object v0, v10

    check-cast v0, Landroidx/datastore/preferences/protobuf/w;

    iput-object v15, v0, Landroidx/datastore/preferences/protobuf/w;->unknownFields:Landroidx/datastore/preferences/protobuf/d0;

    :cond_1
    return-void

    .line 8
    :cond_2
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v15, :cond_3

    .line 9
    invoke-static/range {p2 .. p2}, Landroidx/datastore/preferences/protobuf/e0;->a(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/d0;

    move-result-object v1

    move-object v15, v1

    goto :goto_3

    :goto_2
    move/from16 v18, v14

    goto/16 :goto_c

    .line 10
    :cond_3
    :goto_3
    invoke-static {v6, v0, v15}, Landroidx/datastore/preferences/protobuf/e0;->c(ILandroidx/datastore/preferences/protobuf/k;Ljava/lang/Object;)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_4

    goto :goto_0

    :cond_4
    :goto_4
    if-ge v14, v13, :cond_5

    .line 11
    aget v0, v12, v14

    .line 12
    invoke-virtual {v8, v0, v10, v15}, Landroidx/datastore/preferences/protobuf/N;->k(ILjava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v14, v14, 0x1

    goto :goto_4

    :cond_5
    if-eqz v15, :cond_6

    .line 13
    move-object v0, v10

    check-cast v0, Landroidx/datastore/preferences/protobuf/w;

    iput-object v15, v0, Landroidx/datastore/preferences/protobuf/w;->unknownFields:Landroidx/datastore/preferences/protobuf/d0;

    :cond_6
    return-void

    .line 14
    :cond_7
    :try_start_2
    invoke-virtual {v8, v7}, Landroidx/datastore/preferences/protobuf/N;->M(I)I

    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 15
    :try_start_3
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->L(I)I

    move-result v2
    :try_end_3
    .catch Landroidx/datastore/preferences/protobuf/z; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iget-object v4, v0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    iget-object v5, v8, Landroidx/datastore/preferences/protobuf/N;->k:Landroidx/datastore/preferences/protobuf/C;

    packed-switch v2, :pswitch_data_0

    if-nez v15, :cond_8

    .line 16
    :try_start_4
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static/range {p2 .. p2}, Landroidx/datastore/preferences/protobuf/e0;->a(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/d0;

    move-result-object v15

    goto :goto_6

    :catch_0
    :goto_5
    move/from16 v18, v14

    const/4 v14, 0x0

    goto/16 :goto_9

    .line 17
    :cond_8
    :goto_6
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v0, v15}, Landroidx/datastore/preferences/protobuf/e0;->c(ILandroidx/datastore/preferences/protobuf/k;Ljava/lang/Object;)Z

    move-result v1
    :try_end_4
    .catch Landroidx/datastore/preferences/protobuf/z; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez v1, :cond_b

    :goto_7
    if-ge v14, v13, :cond_9

    .line 18
    aget v0, v12, v14

    .line 19
    invoke-virtual {v8, v0, v10, v15}, Landroidx/datastore/preferences/protobuf/N;->k(ILjava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v14, v14, 0x1

    goto :goto_7

    :cond_9
    if-eqz v15, :cond_a

    .line 20
    move-object v0, v10

    check-cast v0, Landroidx/datastore/preferences/protobuf/w;

    iput-object v15, v0, Landroidx/datastore/preferences/protobuf/w;->unknownFields:Landroidx/datastore/preferences/protobuf/d0;

    :cond_a
    return-void

    .line 21
    :pswitch_0
    :try_start_5
    invoke-virtual {v8, v10, v1, v7}, Landroidx/datastore/preferences/protobuf/N;->w(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/datastore/preferences/protobuf/a;

    .line 22
    invoke-virtual {v8, v7}, Landroidx/datastore/preferences/protobuf/N;->m(I)Landroidx/datastore/preferences/protobuf/W;

    move-result-object v3

    const/4 v4, 0x3

    .line 23
    invoke-virtual {v0, v4}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 24
    invoke-virtual {v0, v2, v3, v11}, Landroidx/datastore/preferences/protobuf/k;->b(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/W;Landroidx/datastore/preferences/protobuf/o;)V

    .line 25
    invoke-virtual {v8, v10, v1, v7, v2}, Landroidx/datastore/preferences/protobuf/N;->K(Ljava/lang/Object;IILandroidx/datastore/preferences/protobuf/a;)V

    :cond_b
    :goto_8
    move/from16 v18, v14

    goto/16 :goto_b

    :catchall_0
    move-exception v0

    goto :goto_2

    .line 26
    :pswitch_1
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v2

    .line 27
    invoke-virtual {v0, v6}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 28
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->r()J

    move-result-wide v4

    .line 29
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    .line 30
    invoke-static {v10, v2, v3, v4}, Landroidx/datastore/preferences/protobuf/j0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 31
    invoke-virtual {v8, v10, v1, v7}, Landroidx/datastore/preferences/protobuf/N;->I(Ljava/lang/Object;II)V

    goto :goto_8

    .line 32
    :pswitch_2
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v2

    .line 33
    invoke-virtual {v0, v6}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 34
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->q()I

    move-result v4

    .line 35
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 36
    invoke-static {v10, v2, v3, v4}, Landroidx/datastore/preferences/protobuf/j0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 37
    invoke-virtual {v8, v10, v1, v7}, Landroidx/datastore/preferences/protobuf/N;->I(Ljava/lang/Object;II)V

    goto :goto_8

    .line 38
    :pswitch_3
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v2

    const/4 v5, 0x1

    .line 39
    invoke-virtual {v0, v5}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 40
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->p()J

    move-result-wide v4

    .line 41
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    .line 42
    invoke-static {v10, v2, v3, v4}, Landroidx/datastore/preferences/protobuf/j0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 43
    invoke-virtual {v8, v10, v1, v7}, Landroidx/datastore/preferences/protobuf/N;->I(Ljava/lang/Object;II)V

    goto :goto_8

    .line 44
    :pswitch_4
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v2

    const/4 v5, 0x5

    .line 45
    invoke-virtual {v0, v5}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 46
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->o()I

    move-result v4

    .line 47
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 48
    invoke-static {v10, v2, v3, v4}, Landroidx/datastore/preferences/protobuf/j0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 49
    invoke-virtual {v8, v10, v1, v7}, Landroidx/datastore/preferences/protobuf/N;->I(Ljava/lang/Object;II)V

    goto :goto_8

    .line 50
    :pswitch_5
    invoke-virtual {v0, v6}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 51
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->i()I

    move-result v2

    .line 52
    invoke-virtual {v8, v7}, Landroidx/datastore/preferences/protobuf/N;->l(I)V

    .line 53
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v10, v3, v4, v2}, Landroidx/datastore/preferences/protobuf/j0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 54
    invoke-virtual {v8, v10, v1, v7}, Landroidx/datastore/preferences/protobuf/N;->I(Ljava/lang/Object;II)V

    goto :goto_8

    .line 55
    :pswitch_6
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v2

    .line 56
    invoke-virtual {v0, v6}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 57
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->v()I

    move-result v4

    .line 58
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 59
    invoke-static {v10, v2, v3, v4}, Landroidx/datastore/preferences/protobuf/j0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 60
    invoke-virtual {v8, v10, v1, v7}, Landroidx/datastore/preferences/protobuf/N;->I(Ljava/lang/Object;II)V

    goto/16 :goto_8

    .line 61
    :pswitch_7
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v2

    invoke-virtual/range {p3 .. p3}, Landroidx/datastore/preferences/protobuf/k;->e()Landroidx/datastore/preferences/protobuf/g;

    move-result-object v4

    invoke-static {v10, v2, v3, v4}, Landroidx/datastore/preferences/protobuf/j0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 62
    invoke-virtual {v8, v10, v1, v7}, Landroidx/datastore/preferences/protobuf/N;->I(Ljava/lang/Object;II)V

    goto/16 :goto_8

    .line 63
    :pswitch_8
    invoke-virtual {v8, v10, v1, v7}, Landroidx/datastore/preferences/protobuf/N;->w(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/datastore/preferences/protobuf/a;

    .line 64
    invoke-virtual {v8, v7}, Landroidx/datastore/preferences/protobuf/N;->m(I)Landroidx/datastore/preferences/protobuf/W;

    move-result-object v3

    const/4 v4, 0x2

    .line 65
    invoke-virtual {v0, v4}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 66
    invoke-virtual {v0, v2, v3, v11}, Landroidx/datastore/preferences/protobuf/k;->c(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/W;Landroidx/datastore/preferences/protobuf/o;)V

    .line 67
    invoke-virtual {v8, v10, v1, v7, v2}, Landroidx/datastore/preferences/protobuf/N;->K(Ljava/lang/Object;IILandroidx/datastore/preferences/protobuf/a;)V

    goto/16 :goto_8

    .line 68
    :pswitch_9
    invoke-virtual {v8, v3, v0, v10}, Landroidx/datastore/preferences/protobuf/N;->E(ILandroidx/datastore/preferences/protobuf/k;Ljava/lang/Object;)V

    .line 69
    invoke-virtual {v8, v10, v1, v7}, Landroidx/datastore/preferences/protobuf/N;->I(Ljava/lang/Object;II)V

    goto/16 :goto_8

    .line 70
    :pswitch_a
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v2

    .line 71
    invoke-virtual {v0, v6}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 72
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->f()Z

    move-result v4

    .line 73
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    .line 74
    invoke-static {v10, v2, v3, v4}, Landroidx/datastore/preferences/protobuf/j0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 75
    invoke-virtual {v8, v10, v1, v7}, Landroidx/datastore/preferences/protobuf/N;->I(Ljava/lang/Object;II)V

    goto/16 :goto_8

    .line 76
    :pswitch_b
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v2

    const/4 v5, 0x5

    .line 77
    invoke-virtual {v0, v5}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 78
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->j()I

    move-result v4

    .line 79
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 80
    invoke-static {v10, v2, v3, v4}, Landroidx/datastore/preferences/protobuf/j0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 81
    invoke-virtual {v8, v10, v1, v7}, Landroidx/datastore/preferences/protobuf/N;->I(Ljava/lang/Object;II)V

    goto/16 :goto_8

    .line 82
    :pswitch_c
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v2

    const/4 v5, 0x1

    .line 83
    invoke-virtual {v0, v5}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 84
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->k()J

    move-result-wide v4

    .line 85
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    .line 86
    invoke-static {v10, v2, v3, v4}, Landroidx/datastore/preferences/protobuf/j0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 87
    invoke-virtual {v8, v10, v1, v7}, Landroidx/datastore/preferences/protobuf/N;->I(Ljava/lang/Object;II)V

    goto/16 :goto_8

    .line 88
    :pswitch_d
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v2

    .line 89
    invoke-virtual {v0, v6}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 90
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->m()I

    move-result v4

    .line 91
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 92
    invoke-static {v10, v2, v3, v4}, Landroidx/datastore/preferences/protobuf/j0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 93
    invoke-virtual {v8, v10, v1, v7}, Landroidx/datastore/preferences/protobuf/N;->I(Ljava/lang/Object;II)V

    goto/16 :goto_8

    .line 94
    :pswitch_e
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v2

    .line 95
    invoke-virtual {v0, v6}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 96
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->w()J

    move-result-wide v4

    .line 97
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    .line 98
    invoke-static {v10, v2, v3, v4}, Landroidx/datastore/preferences/protobuf/j0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 99
    invoke-virtual {v8, v10, v1, v7}, Landroidx/datastore/preferences/protobuf/N;->I(Ljava/lang/Object;II)V

    goto/16 :goto_8

    .line 100
    :pswitch_f
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v2

    .line 101
    invoke-virtual {v0, v6}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 102
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->n()J

    move-result-wide v4

    .line 103
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    .line 104
    invoke-static {v10, v2, v3, v4}, Landroidx/datastore/preferences/protobuf/j0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 105
    invoke-virtual {v8, v10, v1, v7}, Landroidx/datastore/preferences/protobuf/N;->I(Ljava/lang/Object;II)V

    goto/16 :goto_8

    .line 106
    :pswitch_10
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v2

    const/4 v5, 0x5

    .line 107
    invoke-virtual {v0, v5}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 108
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->l()F

    move-result v4

    .line 109
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    .line 110
    invoke-static {v10, v2, v3, v4}, Landroidx/datastore/preferences/protobuf/j0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 111
    invoke-virtual {v8, v10, v1, v7}, Landroidx/datastore/preferences/protobuf/N;->I(Ljava/lang/Object;II)V

    goto/16 :goto_8

    .line 112
    :pswitch_11
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v2

    const/4 v5, 0x1

    .line 113
    invoke-virtual {v0, v5}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 114
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->h()D

    move-result-wide v4

    .line 115
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    .line 116
    invoke-static {v10, v2, v3, v4}, Landroidx/datastore/preferences/protobuf/j0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 117
    invoke-virtual {v8, v10, v1, v7}, Landroidx/datastore/preferences/protobuf/N;->I(Ljava/lang/Object;II)V
    :try_end_5
    .catch Landroidx/datastore/preferences/protobuf/z; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto/16 :goto_8

    .line 118
    :pswitch_12
    :try_start_6
    div-int/lit8 v1, v7, 0x3

    const/4 v2, 0x2

    mul-int/lit8 v1, v1, 0x2

    iget-object v2, v8, Landroidx/datastore/preferences/protobuf/N;->b:[Ljava/lang/Object;

    aget-object v4, v2, v1
    :try_end_6
    .catch Landroidx/datastore/preferences/protobuf/z; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move v3, v7

    move-object/from16 v5, p4

    const/4 v7, 0x0

    move-object/from16 v6, p3

    .line 119
    :try_start_7
    invoke-virtual/range {v1 .. v6}, Landroidx/datastore/preferences/protobuf/N;->s(Ljava/lang/Object;ILjava/lang/Object;Landroidx/datastore/preferences/protobuf/o;Landroidx/datastore/preferences/protobuf/k;)V

    goto/16 :goto_8

    :catch_1
    const/4 v7, 0x0

    goto/16 :goto_5

    .line 120
    :pswitch_13
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v3

    .line 121
    invoke-virtual {v8, v7}, Landroidx/datastore/preferences/protobuf/N;->m(I)Landroidx/datastore/preferences/protobuf/W;

    move-result-object v7
    :try_end_7
    .catch Landroidx/datastore/preferences/protobuf/z; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v5, p3

    move/from16 v18, v14

    const/4 v14, 0x0

    move-object v6, v7

    move-object/from16 v7, p4

    .line 122
    :try_start_8
    invoke-virtual/range {v1 .. v7}, Landroidx/datastore/preferences/protobuf/N;->C(Ljava/lang/Object;JLandroidx/datastore/preferences/protobuf/k;Landroidx/datastore/preferences/protobuf/W;Landroidx/datastore/preferences/protobuf/o;)V

    goto/16 :goto_b

    :catchall_1
    move-exception v0

    goto/16 :goto_c

    :pswitch_14
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 123
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    .line 124
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->r(Landroidx/datastore/preferences/protobuf/x;)V

    goto/16 :goto_b

    :pswitch_15
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 125
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    .line 126
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->q(Landroidx/datastore/preferences/protobuf/x;)V

    goto/16 :goto_b

    :pswitch_16
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 127
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    .line 128
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->p(Landroidx/datastore/preferences/protobuf/x;)V

    goto/16 :goto_b

    :pswitch_17
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 129
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    .line 130
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->o(Landroidx/datastore/preferences/protobuf/x;)V

    goto/16 :goto_b

    :pswitch_18
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 131
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v2

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v3, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v2

    .line 132
    invoke-virtual {v0, v2}, Landroidx/datastore/preferences/protobuf/k;->h(Landroidx/datastore/preferences/protobuf/x;)V

    .line 133
    invoke-virtual {v8, v7}, Landroidx/datastore/preferences/protobuf/N;->l(I)V

    .line 134
    invoke-static {v10, v1, v2, v15, v9}, Landroidx/datastore/preferences/protobuf/X;->z(Ljava/lang/Object;ILandroidx/datastore/preferences/protobuf/x;Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/e0;)Ljava/lang/Object;

    goto/16 :goto_b

    :pswitch_19
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 135
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    .line 136
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->t(Landroidx/datastore/preferences/protobuf/x;)V

    goto/16 :goto_b

    :pswitch_1a
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 137
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    .line 138
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->d(Landroidx/datastore/preferences/protobuf/x;)V

    goto/16 :goto_b

    :pswitch_1b
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 139
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    .line 140
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->j(Landroidx/datastore/preferences/protobuf/x;)V

    goto/16 :goto_b

    :pswitch_1c
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 141
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    .line 142
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->k(Landroidx/datastore/preferences/protobuf/x;)V

    goto/16 :goto_b

    :pswitch_1d
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 143
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    .line 144
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->m(Landroidx/datastore/preferences/protobuf/x;)V

    goto/16 :goto_b

    :pswitch_1e
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 145
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    .line 146
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->u(Landroidx/datastore/preferences/protobuf/x;)V

    goto/16 :goto_b

    :pswitch_1f
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 147
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    .line 148
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->n(Landroidx/datastore/preferences/protobuf/x;)V

    goto/16 :goto_b

    :pswitch_20
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 149
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    .line 150
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->l(Landroidx/datastore/preferences/protobuf/x;)V

    goto/16 :goto_b

    :pswitch_21
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 151
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    .line 152
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->g(Landroidx/datastore/preferences/protobuf/x;)V

    goto/16 :goto_b

    :pswitch_22
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 153
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    .line 154
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->r(Landroidx/datastore/preferences/protobuf/x;)V

    goto/16 :goto_b

    :pswitch_23
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 155
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    .line 156
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->q(Landroidx/datastore/preferences/protobuf/x;)V

    goto/16 :goto_b

    :pswitch_24
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 157
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    .line 158
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->p(Landroidx/datastore/preferences/protobuf/x;)V

    goto/16 :goto_b

    :pswitch_25
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 159
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    .line 160
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->o(Landroidx/datastore/preferences/protobuf/x;)V

    goto/16 :goto_b

    :pswitch_26
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 161
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v2

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v3, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v2

    .line 162
    invoke-virtual {v0, v2}, Landroidx/datastore/preferences/protobuf/k;->h(Landroidx/datastore/preferences/protobuf/x;)V

    .line 163
    invoke-virtual {v8, v7}, Landroidx/datastore/preferences/protobuf/N;->l(I)V

    .line 164
    invoke-static {v10, v1, v2, v15, v9}, Landroidx/datastore/preferences/protobuf/X;->z(Ljava/lang/Object;ILandroidx/datastore/preferences/protobuf/x;Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/e0;)Ljava/lang/Object;

    goto/16 :goto_b

    :pswitch_27
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 165
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    .line 166
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->t(Landroidx/datastore/preferences/protobuf/x;)V

    goto/16 :goto_b

    :pswitch_28
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 167
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    .line 168
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->f(Landroidx/datastore/preferences/protobuf/x;)V

    goto/16 :goto_b

    :pswitch_29
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 169
    invoke-virtual {v8, v7}, Landroidx/datastore/preferences/protobuf/N;->m(I)Landroidx/datastore/preferences/protobuf/W;

    move-result-object v5

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v4, p3

    move-object/from16 v6, p4

    .line 170
    invoke-virtual/range {v1 .. v6}, Landroidx/datastore/preferences/protobuf/N;->D(Ljava/lang/Object;ILandroidx/datastore/preferences/protobuf/k;Landroidx/datastore/preferences/protobuf/W;Landroidx/datastore/preferences/protobuf/o;)V

    goto/16 :goto_b

    :pswitch_2a
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 171
    invoke-virtual {v8, v3, v0, v10}, Landroidx/datastore/preferences/protobuf/N;->F(ILandroidx/datastore/preferences/protobuf/k;Ljava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_2b
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 172
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    .line 173
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->d(Landroidx/datastore/preferences/protobuf/x;)V

    goto/16 :goto_b

    :pswitch_2c
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 174
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    .line 175
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->j(Landroidx/datastore/preferences/protobuf/x;)V

    goto/16 :goto_b

    :pswitch_2d
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 176
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    .line 177
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->k(Landroidx/datastore/preferences/protobuf/x;)V

    goto/16 :goto_b

    :pswitch_2e
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 178
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    .line 179
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->m(Landroidx/datastore/preferences/protobuf/x;)V

    goto/16 :goto_b

    :pswitch_2f
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 180
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    .line 181
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->u(Landroidx/datastore/preferences/protobuf/x;)V

    goto/16 :goto_b

    :pswitch_30
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 182
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    .line 183
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->n(Landroidx/datastore/preferences/protobuf/x;)V

    goto/16 :goto_b

    :pswitch_31
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 184
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    .line 185
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->l(Landroidx/datastore/preferences/protobuf/x;)V

    goto/16 :goto_b

    :pswitch_32
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 186
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v10}, Landroidx/datastore/preferences/protobuf/C;->b(JLjava/lang/Object;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    .line 187
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->g(Landroidx/datastore/preferences/protobuf/x;)V

    goto/16 :goto_b

    :pswitch_33
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 188
    invoke-virtual {v8, v7, v10}, Landroidx/datastore/preferences/protobuf/N;->v(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/datastore/preferences/protobuf/a;

    .line 189
    invoke-virtual {v8, v7}, Landroidx/datastore/preferences/protobuf/N;->m(I)Landroidx/datastore/preferences/protobuf/W;

    move-result-object v2

    const/4 v3, 0x3

    .line 190
    invoke-virtual {v0, v3}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 191
    invoke-virtual {v0, v1, v2, v11}, Landroidx/datastore/preferences/protobuf/k;->b(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/W;Landroidx/datastore/preferences/protobuf/o;)V

    .line 192
    invoke-virtual {v8, v10, v7, v1}, Landroidx/datastore/preferences/protobuf/N;->J(Ljava/lang/Object;ILandroidx/datastore/preferences/protobuf/a;)V

    goto/16 :goto_b

    :pswitch_34
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 193
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    .line 194
    invoke-virtual {v0, v14}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 195
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->r()J

    move-result-wide v3

    .line 196
    invoke-static {v10, v1, v2, v3, v4}, Landroidx/datastore/preferences/protobuf/j0;->n(Ljava/lang/Object;JJ)V

    .line 197
    invoke-virtual {v8, v7, v10}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_35
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 198
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    .line 199
    invoke-virtual {v0, v14}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 200
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->q()I

    move-result v3

    .line 201
    invoke-static {v10, v1, v2, v3}, Landroidx/datastore/preferences/protobuf/j0;->m(Ljava/lang/Object;JI)V

    .line 202
    invoke-virtual {v8, v7, v10}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_36
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 203
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    const/4 v3, 0x1

    .line 204
    invoke-virtual {v0, v3}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 205
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->p()J

    move-result-wide v3

    .line 206
    invoke-static {v10, v1, v2, v3, v4}, Landroidx/datastore/preferences/protobuf/j0;->n(Ljava/lang/Object;JJ)V

    .line 207
    invoke-virtual {v8, v7, v10}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_37
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 208
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    const/4 v3, 0x5

    .line 209
    invoke-virtual {v0, v3}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 210
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->o()I

    move-result v3

    .line 211
    invoke-static {v10, v1, v2, v3}, Landroidx/datastore/preferences/protobuf/j0;->m(Ljava/lang/Object;JI)V

    .line 212
    invoke-virtual {v8, v7, v10}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_38
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 213
    invoke-virtual {v0, v14}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 214
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->i()I

    move-result v1

    .line 215
    invoke-virtual {v8, v7}, Landroidx/datastore/preferences/protobuf/N;->l(I)V

    .line 216
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v2

    invoke-static {v10, v2, v3, v1}, Landroidx/datastore/preferences/protobuf/j0;->m(Ljava/lang/Object;JI)V

    .line 217
    invoke-virtual {v8, v7, v10}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_39
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 218
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    .line 219
    invoke-virtual {v0, v14}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 220
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->v()I

    move-result v3

    .line 221
    invoke-static {v10, v1, v2, v3}, Landroidx/datastore/preferences/protobuf/j0;->m(Ljava/lang/Object;JI)V

    .line 222
    invoke-virtual {v8, v7, v10}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_3a
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 223
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    invoke-virtual/range {p3 .. p3}, Landroidx/datastore/preferences/protobuf/k;->e()Landroidx/datastore/preferences/protobuf/g;

    move-result-object v3

    invoke-static {v10, v1, v2, v3}, Landroidx/datastore/preferences/protobuf/j0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 224
    invoke-virtual {v8, v7, v10}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_3b
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 225
    invoke-virtual {v8, v7, v10}, Landroidx/datastore/preferences/protobuf/N;->v(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/datastore/preferences/protobuf/a;

    .line 226
    invoke-virtual {v8, v7}, Landroidx/datastore/preferences/protobuf/N;->m(I)Landroidx/datastore/preferences/protobuf/W;

    move-result-object v2

    const/4 v3, 0x2

    .line 227
    invoke-virtual {v0, v3}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 228
    invoke-virtual {v0, v1, v2, v11}, Landroidx/datastore/preferences/protobuf/k;->c(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/W;Landroidx/datastore/preferences/protobuf/o;)V

    .line 229
    invoke-virtual {v8, v10, v7, v1}, Landroidx/datastore/preferences/protobuf/N;->J(Ljava/lang/Object;ILandroidx/datastore/preferences/protobuf/a;)V

    goto/16 :goto_b

    :pswitch_3c
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 230
    invoke-virtual {v8, v3, v0, v10}, Landroidx/datastore/preferences/protobuf/N;->E(ILandroidx/datastore/preferences/protobuf/k;Ljava/lang/Object;)V

    .line 231
    invoke-virtual {v8, v7, v10}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_3d
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 232
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    .line 233
    invoke-virtual {v0, v14}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 234
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->f()Z

    move-result v3

    .line 235
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    invoke-virtual {v4, v10, v1, v2, v3}, Landroidx/datastore/preferences/protobuf/i0;->j(Ljava/lang/Object;JZ)V

    .line 236
    invoke-virtual {v8, v7, v10}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_3e
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 237
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    const/4 v3, 0x5

    .line 238
    invoke-virtual {v0, v3}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 239
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->j()I

    move-result v3

    .line 240
    invoke-static {v10, v1, v2, v3}, Landroidx/datastore/preferences/protobuf/j0;->m(Ljava/lang/Object;JI)V

    .line 241
    invoke-virtual {v8, v7, v10}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_3f
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 242
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    const/4 v3, 0x1

    .line 243
    invoke-virtual {v0, v3}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 244
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->k()J

    move-result-wide v3

    .line 245
    invoke-static {v10, v1, v2, v3, v4}, Landroidx/datastore/preferences/protobuf/j0;->n(Ljava/lang/Object;JJ)V

    .line 246
    invoke-virtual {v8, v7, v10}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_40
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 247
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    .line 248
    invoke-virtual {v0, v14}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 249
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->m()I

    move-result v3

    .line 250
    invoke-static {v10, v1, v2, v3}, Landroidx/datastore/preferences/protobuf/j0;->m(Ljava/lang/Object;JI)V

    .line 251
    invoke-virtual {v8, v7, v10}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_41
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 252
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    .line 253
    invoke-virtual {v0, v14}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 254
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->w()J

    move-result-wide v3

    .line 255
    invoke-static {v10, v1, v2, v3, v4}, Landroidx/datastore/preferences/protobuf/j0;->n(Ljava/lang/Object;JJ)V

    .line 256
    invoke-virtual {v8, v7, v10}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_42
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 257
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    .line 258
    invoke-virtual {v0, v14}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 259
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->n()J

    move-result-wide v3

    .line 260
    invoke-static {v10, v1, v2, v3, v4}, Landroidx/datastore/preferences/protobuf/j0;->n(Ljava/lang/Object;JJ)V

    .line 261
    invoke-virtual {v8, v7, v10}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    goto :goto_b

    :pswitch_43
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 262
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v1

    const/4 v3, 0x5

    .line 263
    invoke-virtual {v0, v3}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 264
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->l()F

    move-result v3

    .line 265
    sget-object v4, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    invoke-virtual {v4, v10, v1, v2, v3}, Landroidx/datastore/preferences/protobuf/i0;->m(Ljava/lang/Object;JF)V

    .line 266
    invoke-virtual {v8, v7, v10}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    goto :goto_b

    :pswitch_44
    move/from16 v18, v14

    const/4 v14, 0x0

    .line 267
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->y(I)J

    move-result-wide v5

    const/4 v1, 0x1

    .line 268
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 269
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/j;->h()D

    move-result-wide v16

    .line 270
    sget-object v1, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    move-object/from16 v2, p2

    move-wide v3, v5

    move-wide/from16 v5, v16

    invoke-virtual/range {v1 .. v6}, Landroidx/datastore/preferences/protobuf/i0;->l(Ljava/lang/Object;JD)V

    .line 271
    invoke-virtual {v8, v7, v10}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V
    :try_end_8
    .catch Landroidx/datastore/preferences/protobuf/z; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_b

    .line 272
    :catch_2
    :goto_9
    :try_start_9
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v15, :cond_c

    .line 273
    invoke-static/range {p2 .. p2}, Landroidx/datastore/preferences/protobuf/e0;->a(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/d0;

    move-result-object v1

    move-object v15, v1

    .line 274
    :cond_c
    invoke-static {v14, v0, v15}, Landroidx/datastore/preferences/protobuf/e0;->c(ILandroidx/datastore/preferences/protobuf/k;Ljava/lang/Object;)Z

    move-result v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    if-nez v1, :cond_f

    move/from16 v14, v18

    :goto_a
    if-ge v14, v13, :cond_d

    .line 275
    aget v0, v12, v14

    .line 276
    invoke-virtual {v8, v0, v10, v15}, Landroidx/datastore/preferences/protobuf/N;->k(ILjava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v14, v14, 0x1

    goto :goto_a

    :cond_d
    if-eqz v15, :cond_e

    .line 277
    move-object v0, v10

    check-cast v0, Landroidx/datastore/preferences/protobuf/w;

    iput-object v15, v0, Landroidx/datastore/preferences/protobuf/w;->unknownFields:Landroidx/datastore/preferences/protobuf/d0;

    :cond_e
    return-void

    :cond_f
    :goto_b
    move/from16 v14, v18

    goto/16 :goto_0

    :goto_c
    move/from16 v14, v18

    :goto_d
    if-ge v14, v13, :cond_10

    .line 278
    aget v1, v12, v14

    .line 279
    invoke-virtual {v8, v1, v10, v15}, Landroidx/datastore/preferences/protobuf/N;->k(ILjava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v14, v14, 0x1

    goto :goto_d

    :cond_10
    if-eqz v15, :cond_11

    .line 280
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    move-object v1, v10

    check-cast v1, Landroidx/datastore/preferences/protobuf/w;

    iput-object v15, v1, Landroidx/datastore/preferences/protobuf/w;->unknownFields:Landroidx/datastore/preferences/protobuf/d0;

    .line 282
    :cond_11
    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final s(Ljava/lang/Object;ILjava/lang/Object;Landroidx/datastore/preferences/protobuf/o;Landroidx/datastore/preferences/protobuf/k;)V
    .locals 8

    .line 1
    invoke-virtual {p0, p2}, Landroidx/datastore/preferences/protobuf/N;->M(I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const v0, 0xfffff

    .line 6
    .line 7
    .line 8
    and-int/2addr p2, v0

    .line 9
    int-to-long v0, p2

    .line 10
    sget-object p2, Landroidx/datastore/preferences/protobuf/j0;->c:Landroidx/datastore/preferences/protobuf/i0;

    .line 11
    .line 12
    invoke-virtual {p2, v0, v1, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    iget-object v2, p0, Landroidx/datastore/preferences/protobuf/N;->m:Landroidx/datastore/preferences/protobuf/J;

    .line 17
    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    sget-object p2, Landroidx/datastore/preferences/protobuf/I;->f:Landroidx/datastore/preferences/protobuf/I;

    .line 24
    .line 25
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/I;->b()Landroidx/datastore/preferences/protobuf/I;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-static {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/j0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-object v3, p2

    .line 37
    check-cast v3, Landroidx/datastore/preferences/protobuf/I;

    .line 38
    .line 39
    iget-boolean v3, v3, Landroidx/datastore/preferences/protobuf/I;->e:Z

    .line 40
    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    sget-object v3, Landroidx/datastore/preferences/protobuf/I;->f:Landroidx/datastore/preferences/protobuf/I;

    .line 44
    .line 45
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/I;->b()Landroidx/datastore/preferences/protobuf/I;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-static {v3, p2}, Landroidx/datastore/preferences/protobuf/J;->b(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/I;

    .line 50
    .line 51
    .line 52
    invoke-static {p1, v0, v1, v3}, Landroidx/datastore/preferences/protobuf/j0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move-object p2, v3

    .line 56
    :cond_1
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    check-cast p2, Landroidx/datastore/preferences/protobuf/I;

    .line 60
    .line 61
    check-cast p3, Landroidx/datastore/preferences/protobuf/H;

    .line 62
    .line 63
    iget-object p1, p3, Landroidx/datastore/preferences/protobuf/H;->a:Landroidx/datastore/preferences/protobuf/G;

    .line 64
    .line 65
    const/4 p3, 0x2

    .line 66
    invoke-virtual {p5, p3}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p5, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    .line 70
    .line 71
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/j;->v()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/j;->e(I)I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    const-string v2, ""

    .line 80
    .line 81
    iget-object v3, p1, Landroidx/datastore/preferences/protobuf/G;->c:LI/k;

    .line 82
    .line 83
    move-object v4, v3

    .line 84
    :goto_1
    :try_start_0
    invoke-virtual {p5}, Landroidx/datastore/preferences/protobuf/k;->a()I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    const v6, 0x7fffffff

    .line 89
    .line 90
    .line 91
    if-eq v5, v6, :cond_7

    .line 92
    .line 93
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/j;->c()Z

    .line 94
    .line 95
    .line 96
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    if-eqz v6, :cond_2

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_2
    const/4 v6, 0x1

    .line 101
    const-string v7, "Unable to parse map entry."

    .line 102
    .line 103
    if-eq v5, v6, :cond_5

    .line 104
    .line 105
    if-eq v5, p3, :cond_4

    .line 106
    .line 107
    :try_start_1
    invoke-virtual {p5}, Landroidx/datastore/preferences/protobuf/k;->x()Z

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    if-eqz v5, :cond_3

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_3
    new-instance v5, Landroidx/datastore/preferences/protobuf/A;

    .line 115
    .line 116
    invoke-direct {v5, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw v5

    .line 120
    :catchall_0
    move-exception p1

    .line 121
    goto :goto_3

    .line 122
    :cond_4
    iget-object v5, p1, Landroidx/datastore/preferences/protobuf/G;->b:Landroidx/datastore/preferences/protobuf/p0;

    .line 123
    .line 124
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    invoke-virtual {p5, v5, v6, p4}, Landroidx/datastore/preferences/protobuf/k;->i(Landroidx/datastore/preferences/protobuf/r0;Ljava/lang/Class;Landroidx/datastore/preferences/protobuf/o;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    goto :goto_1

    .line 133
    :cond_5
    iget-object v5, p1, Landroidx/datastore/preferences/protobuf/G;->a:Landroidx/datastore/preferences/protobuf/n0;

    .line 134
    .line 135
    const/4 v6, 0x0

    .line 136
    invoke-virtual {p5, v5, v6, v6}, Landroidx/datastore/preferences/protobuf/k;->i(Landroidx/datastore/preferences/protobuf/r0;Ljava/lang/Class;Landroidx/datastore/preferences/protobuf/o;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v2
    :try_end_1
    .catch Landroidx/datastore/preferences/protobuf/z; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 140
    goto :goto_1

    .line 141
    :catch_0
    :try_start_2
    invoke-virtual {p5}, Landroidx/datastore/preferences/protobuf/k;->x()Z

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    if-eqz v5, :cond_6

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_6
    new-instance p1, Landroidx/datastore/preferences/protobuf/A;

    .line 149
    .line 150
    invoke-direct {p1, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw p1

    .line 154
    :cond_7
    :goto_2
    invoke-virtual {p2, v2, v4}, Landroidx/datastore/preferences/protobuf/I;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/j;->d(I)V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :goto_3
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/j;->d(I)V

    .line 162
    .line 163
    .line 164
    throw p1
.end method

.method public final t(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    .line 1
    invoke-virtual {p0, p1, p3}, Landroidx/datastore/preferences/protobuf/N;->n(ILjava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/N;->M(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const v1, 0xfffff

    .line 13
    .line 14
    .line 15
    and-int/2addr v0, v1

    .line 16
    int-to-long v0, v0

    .line 17
    sget-object v2, Landroidx/datastore/preferences/protobuf/N;->o:Lsun/misc/Unsafe;

    .line 18
    .line 19
    invoke-virtual {v2, p3, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    if-eqz v3, :cond_4

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/N;->m(I)Landroidx/datastore/preferences/protobuf/W;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/N;->n(ILjava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-nez v4, :cond_2

    .line 34
    .line 35
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/N;->p(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-nez v4, :cond_1

    .line 40
    .line 41
    invoke-virtual {v2, p2, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-interface {p3}, Landroidx/datastore/preferences/protobuf/W;->g()Landroidx/datastore/preferences/protobuf/w;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-interface {p3, v4, v3}, Landroidx/datastore/preferences/protobuf/W;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, p2, v0, v1, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :goto_0
    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/N;->H(ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    invoke-virtual {v2, p2, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/N;->p(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-nez v4, :cond_3

    .line 68
    .line 69
    invoke-interface {p3}, Landroidx/datastore/preferences/protobuf/W;->g()Landroidx/datastore/preferences/protobuf/w;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-interface {p3, v4, p1}, Landroidx/datastore/preferences/protobuf/W;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, p2, v0, v1, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    move-object p1, v4

    .line 80
    :cond_3
    invoke-interface {p3, p1, v3}, Landroidx/datastore/preferences/protobuf/W;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_4
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 85
    .line 86
    new-instance v0, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v1, "Source subfield "

    .line 89
    .line 90
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/N;->a:[I

    .line 94
    .line 95
    aget p1, v1, p1

    .line 96
    .line 97
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string p1, " is present but null: "

    .line 101
    .line 102
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p2
.end method

.method public final u(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/N;->a:[I

    .line 2
    .line 3
    aget v1, v0, p1

    .line 4
    .line 5
    invoke-virtual {p0, p3, v1, p1}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/N;->M(I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const v3, 0xfffff

    .line 17
    .line 18
    .line 19
    and-int/2addr v2, v3

    .line 20
    int-to-long v2, v2

    .line 21
    sget-object v4, Landroidx/datastore/preferences/protobuf/N;->o:Lsun/misc/Unsafe;

    .line 22
    .line 23
    invoke-virtual {v4, p3, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    if-eqz v5, :cond_4

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/N;->m(I)Landroidx/datastore/preferences/protobuf/W;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    invoke-virtual {p0, p2, v1, p1}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/N;->p(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    invoke-virtual {v4, p2, v2, v3, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-interface {p3}, Landroidx/datastore/preferences/protobuf/W;->g()Landroidx/datastore/preferences/protobuf/w;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-interface {p3, v0, v5}, Landroidx/datastore/preferences/protobuf/W;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4, p2, v2, v3, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    invoke-virtual {p0, p2, v1, p1}, Landroidx/datastore/preferences/protobuf/N;->I(Ljava/lang/Object;II)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    invoke-virtual {v4, p2, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/N;->p(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_3

    .line 72
    .line 73
    invoke-interface {p3}, Landroidx/datastore/preferences/protobuf/W;->g()Landroidx/datastore/preferences/protobuf/w;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-interface {p3, v0, p1}, Landroidx/datastore/preferences/protobuf/W;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4, p2, v2, v3, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    move-object p1, v0

    .line 84
    :cond_3
    invoke-interface {p3, p1, v5}, Landroidx/datastore/preferences/protobuf/W;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_4
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 89
    .line 90
    new-instance v1, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    const-string v2, "Source subfield "

    .line 93
    .line 94
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    aget p1, v0, p1

    .line 98
    .line 99
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string p1, " is present but null: "

    .line 103
    .line 104
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p2
.end method

.method public final v(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/N;->m(I)Landroidx/datastore/preferences/protobuf/W;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/N;->M(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const v2, 0xfffff

    .line 10
    .line 11
    .line 12
    and-int/2addr v1, v2

    .line 13
    int-to-long v1, v1

    .line 14
    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/N;->n(ILjava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    invoke-interface {v0}, Landroidx/datastore/preferences/protobuf/W;->g()Landroidx/datastore/preferences/protobuf/w;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :cond_0
    sget-object p1, Landroidx/datastore/preferences/protobuf/N;->o:Lsun/misc/Unsafe;

    .line 26
    .line 27
    invoke-virtual {p1, p2, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/N;->p(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_1
    invoke-interface {v0}, Landroidx/datastore/preferences/protobuf/W;->g()Landroidx/datastore/preferences/protobuf/w;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-interface {v0, p2, p1}, Landroidx/datastore/preferences/protobuf/W;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    return-object p2
.end method

.method public final w(Ljava/lang/Object;II)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0, p3}, Landroidx/datastore/preferences/protobuf/N;->m(I)Landroidx/datastore/preferences/protobuf/W;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/N;->q(Ljava/lang/Object;II)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Landroidx/datastore/preferences/protobuf/W;->g()Landroidx/datastore/preferences/protobuf/w;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object p2, Landroidx/datastore/preferences/protobuf/N;->o:Lsun/misc/Unsafe;

    .line 17
    .line 18
    invoke-virtual {p0, p3}, Landroidx/datastore/preferences/protobuf/N;->M(I)I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    const v1, 0xfffff

    .line 23
    .line 24
    .line 25
    and-int/2addr p3, v1

    .line 26
    int-to-long v1, p3

    .line 27
    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/N;->p(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_1
    invoke-interface {v0}, Landroidx/datastore/preferences/protobuf/W;->g()Landroidx/datastore/preferences/protobuf/w;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-interface {v0, p2, p1}, Landroidx/datastore/preferences/protobuf/W;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    return-object p2
.end method
