.class public final Lq/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/Shader;

.field public final b:Landroid/content/res/ColorStateList;

.field public c:I


# direct methods
.method public constructor <init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq/d;->a:Landroid/graphics/Shader;

    .line 5
    .line 6
    iput-object p2, p0, Lq/d;->b:Landroid/content/res/ColorStateList;

    .line 7
    .line 8
    iput p3, p0, Lq/d;->c:I

    .line 9
    .line 10
    return-void
.end method

.method public static a(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Lq/d;
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 1
    const-string v2, "gradient"

    invoke-virtual/range {p0 .. p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v3

    .line 2
    invoke-static {v3}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v4

    .line 3
    :goto_0
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v5

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eq v5, v6, :cond_0

    if-eq v5, v7, :cond_0

    goto :goto_0

    :cond_0
    if-ne v5, v6, :cond_21

    .line 4
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    .line 5
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v8, 0x0

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    const-string v2, "selector"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 6
    invoke-static {v0, v3, v4, v1}, Lq/c;->b(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    move-result-object v0

    .line 7
    new-instance v1, Lq/d;

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v2

    invoke-direct {v1, v8, v0, v2}, Lq/d;-><init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V

    return-object v1

    .line 8
    :cond_1
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": unsupported complex color tag "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 9
    :cond_2
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    .line 10
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_20

    .line 11
    sget-object v2, Lo/a;->d:[I

    invoke-static {v0, v1, v4, v2}, Lq/b;->h(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 12
    const-string v5, "startX"

    invoke-static {v3, v5}, Lq/b;->e(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v5

    const/4 v9, 0x0

    if-nez v5, :cond_3

    const/4 v11, 0x0

    goto :goto_1

    :cond_3
    const/16 v5, 0x8

    .line 13
    invoke-virtual {v2, v5, v9}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v5

    move v11, v5

    .line 14
    :goto_1
    const-string v5, "startY"

    invoke-static {v3, v5}, Lq/b;->e(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_4

    const/4 v12, 0x0

    goto :goto_2

    :cond_4
    const/16 v5, 0x9

    .line 15
    invoke-virtual {v2, v5, v9}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v5

    move v12, v5

    .line 16
    :goto_2
    const-string v5, "endX"

    invoke-static {v3, v5}, Lq/b;->e(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_5

    const/4 v13, 0x0

    goto :goto_3

    :cond_5
    const/16 v5, 0xa

    .line 17
    invoke-virtual {v2, v5, v9}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v5

    move v13, v5

    .line 18
    :goto_3
    const-string v5, "endY"

    invoke-static {v3, v5}, Lq/b;->e(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_6

    const/4 v14, 0x0

    goto :goto_4

    :cond_6
    const/16 v5, 0xb

    .line 19
    invoke-virtual {v2, v5, v9}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v5

    move v14, v5

    .line 20
    :goto_4
    const-string v5, "centerX"

    invoke-static {v3, v5}, Lq/b;->e(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v5

    const/4 v10, 0x3

    if-nez v5, :cond_7

    const/4 v5, 0x0

    goto :goto_5

    .line 21
    :cond_7
    invoke-virtual {v2, v10, v9}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v5

    .line 22
    :goto_5
    const-string v15, "centerY"

    invoke-static {v3, v15}, Lq/b;->e(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v15

    if-nez v15, :cond_8

    const/4 v15, 0x0

    goto :goto_6

    :cond_8
    const/4 v15, 0x4

    .line 23
    invoke-virtual {v2, v15, v9}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v15

    .line 24
    :goto_6
    const-string v8, "type"

    invoke-static {v3, v8}, Lq/b;->e(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v8

    const/4 v10, 0x0

    if-nez v8, :cond_9

    const/4 v8, 0x0

    goto :goto_7

    .line 25
    :cond_9
    invoke-virtual {v2, v6, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v8

    .line 26
    :goto_7
    const-string v6, "startColor"

    invoke-static {v3, v6}, Lq/b;->e(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_a

    const/4 v6, 0x0

    goto :goto_8

    .line 27
    :cond_a
    invoke-virtual {v2, v10, v10}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v6

    .line 28
    :goto_8
    const-string v9, "centerColor"

    invoke-static {v3, v9}, Lq/b;->e(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v19

    .line 29
    invoke-static {v3, v9}, Lq/b;->e(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_b

    const/4 v9, 0x0

    goto :goto_9

    :cond_b
    const/4 v9, 0x7

    .line 30
    invoke-virtual {v2, v9, v10}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v9

    .line 31
    :goto_9
    const-string v7, "endColor"

    invoke-static {v3, v7}, Lq/b;->e(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_c

    const/4 v7, 0x0

    goto :goto_a

    :cond_c
    const/4 v7, 0x1

    .line 32
    invoke-virtual {v2, v7, v10}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v21

    move/from16 v7, v21

    .line 33
    :goto_a
    const-string v10, "tileMode"

    invoke-static {v3, v10}, Lq/b;->e(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_d

    move/from16 v22, v5

    const/4 v5, 0x0

    goto :goto_b

    :cond_d
    const/4 v10, 0x6

    move/from16 v22, v5

    const/4 v5, 0x0

    .line 34
    invoke-virtual {v2, v10, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v10

    move v5, v10

    .line 35
    :goto_b
    const-string v10, "gradientRadius"

    invoke-static {v3, v10}, Lq/b;->e(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_e

    move/from16 v23, v15

    const/4 v10, 0x0

    goto :goto_c

    :cond_e
    const/4 v10, 0x5

    move/from16 v23, v15

    const/4 v15, 0x0

    .line 36
    invoke-virtual {v2, v10, v15}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v10

    .line 37
    :goto_c
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 38
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v2

    const/4 v15, 0x1

    add-int/2addr v2, v15

    .line 39
    new-instance v15, Ljava/util/ArrayList;

    move/from16 v24, v10

    const/16 v10, 0x14

    invoke-direct {v15, v10}, Ljava/util/ArrayList;-><init>(I)V

    move/from16 v25, v14

    .line 40
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    :goto_d
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v10

    move/from16 v26, v13

    const/4 v13, 0x1

    if-eq v10, v13, :cond_14

    .line 42
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v13

    move/from16 v27, v12

    if-ge v13, v2, :cond_f

    const/4 v12, 0x3

    if-eq v10, v12, :cond_15

    :cond_f
    const/4 v12, 0x2

    if-eq v10, v12, :cond_11

    :cond_10
    :goto_e
    move/from16 v13, v26

    move/from16 v12, v27

    goto :goto_d

    :cond_11
    if-gt v13, v2, :cond_10

    .line 43
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v10

    const-string v12, "item"

    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_12

    goto :goto_e

    .line 44
    :cond_12
    sget-object v10, Lo/a;->e:[I

    invoke-static {v0, v1, v4, v10}, Lq/b;->h(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v10

    const/4 v12, 0x0

    .line 45
    invoke-virtual {v10, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v13

    const/4 v12, 0x1

    .line 46
    invoke-virtual {v10, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v20

    if-eqz v13, :cond_13

    if-eqz v20, :cond_13

    const/4 v13, 0x0

    .line 47
    invoke-virtual {v10, v13, v13}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v21

    const/4 v13, 0x0

    .line 48
    invoke-virtual {v10, v12, v13}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v28

    .line 49
    invoke-virtual {v10}, Landroid/content/res/TypedArray;->recycle()V

    .line 50
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    invoke-static/range {v28 .. v28}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-virtual {v15, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    .line 52
    :cond_13
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": <item> tag requires a \'color\' attribute and a \'offset\' attribute!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    move/from16 v27, v12

    .line 54
    :cond_15
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_16

    new-instance v0, LN/Q;

    invoke-direct {v0, v14, v15}, LN/Q;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    goto :goto_f

    :cond_16
    const/4 v0, 0x0

    :goto_f
    if-eqz v0, :cond_17

    :goto_10
    const/4 v1, 0x1

    goto :goto_11

    :cond_17
    if-eqz v19, :cond_18

    .line 55
    new-instance v0, LN/Q;

    invoke-direct {v0, v6, v9, v7}, LN/Q;-><init>(III)V

    goto :goto_10

    .line 56
    :cond_18
    new-instance v0, LN/Q;

    invoke-direct {v0, v6, v7}, LN/Q;-><init>(II)V

    goto :goto_10

    :goto_11
    if-eq v8, v1, :cond_1c

    const/4 v2, 0x2

    if-eq v8, v2, :cond_1b

    .line 57
    new-instance v3, Landroid/graphics/LinearGradient;

    if-eq v5, v1, :cond_1a

    if-eq v5, v2, :cond_19

    .line 58
    sget-object v1, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    :goto_12
    move-object/from16 v17, v1

    goto :goto_13

    .line 59
    :cond_19
    sget-object v1, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    goto :goto_12

    .line 60
    :cond_1a
    sget-object v1, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    goto :goto_12

    .line 61
    :goto_13
    iget-object v1, v0, LN/Q;->f:Ljava/lang/Object;

    move-object v15, v1

    check-cast v15, [I

    iget-object v0, v0, LN/Q;->g:Ljava/lang/Object;

    move-object/from16 v16, v0

    check-cast v16, [F

    const/4 v1, 0x0

    move-object v10, v3

    move/from16 v12, v27

    move/from16 v13, v26

    move/from16 v14, v25

    invoke-direct/range {v10 .. v17}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    goto :goto_16

    :cond_1b
    const/4 v1, 0x0

    .line 62
    new-instance v3, Landroid/graphics/SweepGradient;

    iget-object v2, v0, LN/Q;->f:Ljava/lang/Object;

    check-cast v2, [I

    iget-object v0, v0, LN/Q;->g:Ljava/lang/Object;

    check-cast v0, [F

    move/from16 v9, v22

    move/from16 v15, v23

    invoke-direct {v3, v9, v15, v2, v0}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    goto :goto_16

    :cond_1c
    move/from16 v9, v22

    move/from16 v15, v23

    const/4 v1, 0x0

    const/4 v2, 0x0

    cmpg-float v2, v24, v2

    if-lez v2, :cond_1f

    .line 63
    new-instance v3, Landroid/graphics/RadialGradient;

    const/4 v2, 0x1

    if-eq v5, v2, :cond_1e

    const/4 v2, 0x2

    if-eq v5, v2, :cond_1d

    .line 64
    sget-object v2, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    :goto_14
    move-object/from16 v21, v2

    goto :goto_15

    .line 65
    :cond_1d
    sget-object v2, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    goto :goto_14

    .line 66
    :cond_1e
    sget-object v2, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    goto :goto_14

    .line 67
    :goto_15
    iget-object v2, v0, LN/Q;->f:Ljava/lang/Object;

    move-object/from16 v19, v2

    check-cast v19, [I

    iget-object v0, v0, LN/Q;->g:Ljava/lang/Object;

    move-object/from16 v20, v0

    check-cast v20, [F

    move v0, v15

    move-object v15, v3

    move/from16 v16, v9

    move/from16 v17, v0

    move/from16 v18, v24

    invoke-direct/range {v15 .. v21}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 68
    :goto_16
    new-instance v0, Lq/d;

    const/4 v2, 0x0

    invoke-direct {v0, v3, v2, v1}, Lq/d;-><init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V

    return-object v0

    .line 69
    :cond_1f
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "<gradient> tag requires \'gradientRadius\' attribute with radial type"

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 70
    :cond_20
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": invalid gradient color tag "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 72
    :cond_21
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "No start tag found"

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq/d;->a:Landroid/graphics/Shader;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lq/d;->b:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    return v0
.end method
