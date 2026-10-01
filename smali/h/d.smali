.class public final Lh/d;
.super Landroid/view/MenuInflater;
.source "SourceFile"


# static fields
.field public static final e:[Ljava/lang/Class;

.field public static final f:[Ljava/lang/Class;


# instance fields
.field public final a:[Ljava/lang/Object;

.field public final b:[Ljava/lang/Object;

.field public final c:Landroid/content/Context;

.field public d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [Ljava/lang/Class;

    .line 3
    .line 4
    const-class v1, Landroid/content/Context;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sput-object v0, Lh/d;->e:[Ljava/lang/Class;

    .line 10
    .line 11
    sput-object v0, Lh/d;->f:[Ljava/lang/Class;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/view/MenuInflater;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh/d;->c:Landroid/content/Context;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    new-array v0, v0, [Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    aput-object p1, v0, v1

    .line 11
    .line 12
    iput-object v0, p0, Lh/d;->a:[Ljava/lang/Object;

    .line 13
    .line 14
    iput-object v0, p0, Lh/d;->b:[Ljava/lang/Object;

    .line 15
    .line 16
    return-void
.end method

.method public static a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, Landroid/app/Activity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    check-cast p0, Landroid/content/ContextWrapper;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lh/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :cond_1
    return-object p0
.end method


# virtual methods
.method public final b(Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 1
    new-instance v2, Lh/c;

    move-object/from16 v3, p3

    invoke-direct {v2, v0, v3}, Lh/c;-><init>(Lh/d;Landroid/view/Menu;)V

    .line 2
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v3

    :goto_0
    const/4 v4, 0x1

    .line 3
    const-string v5, "menu"

    const/4 v6, 0x2

    if-ne v3, v6, :cond_1

    .line 4
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    .line 5
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 6
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    goto :goto_1

    .line 7
    :cond_0
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Expecting menu, got "

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 8
    :cond_1
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    if-ne v3, v4, :cond_18

    :goto_1
    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_2
    if-nez v9, :cond_17

    if-eq v3, v4, :cond_16

    .line 9
    const-string v12, "item"

    const-string v13, "group"

    const/4 v14, 0x3

    if-eq v3, v6, :cond_7

    if-eq v3, v14, :cond_3

    :cond_2
    :goto_3
    move-object/from16 v8, p1

    const/4 v4, 0x0

    :goto_4
    const/4 v6, 0x1

    goto/16 :goto_d

    .line 10
    :cond_3
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    if-eqz v10, :cond_4

    .line 11
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_4

    move-object/from16 v8, p1

    const/4 v4, 0x0

    const/4 v6, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    goto/16 :goto_d

    .line 12
    :cond_4
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_5

    .line 13
    iput v7, v2, Lh/c;->b:I

    .line 14
    iput v7, v2, Lh/c;->c:I

    .line 15
    iput v7, v2, Lh/c;->d:I

    .line 16
    iput v7, v2, Lh/c;->e:I

    .line 17
    iput-boolean v4, v2, Lh/c;->f:Z

    .line 18
    iput-boolean v4, v2, Lh/c;->g:Z

    goto :goto_3

    .line 19
    :cond_5
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    .line 20
    iget-boolean v3, v2, Lh/c;->h:Z

    if-nez v3, :cond_2

    .line 21
    iput-boolean v4, v2, Lh/c;->h:Z

    .line 22
    iget v3, v2, Lh/c;->b:I

    iget v12, v2, Lh/c;->i:I

    iget v13, v2, Lh/c;->j:I

    iget-object v14, v2, Lh/c;->k:Ljava/lang/CharSequence;

    iget-object v15, v2, Lh/c;->a:Landroid/view/Menu;

    invoke-interface {v15, v3, v12, v13, v14}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v3

    invoke-virtual {v2, v3}, Lh/c;->b(Landroid/view/MenuItem;)V

    goto :goto_3

    .line 23
    :cond_6
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    move-object/from16 v8, p1

    const/4 v4, 0x0

    const/4 v6, 0x1

    const/4 v9, 0x1

    goto/16 :goto_d

    :cond_7
    if-eqz v10, :cond_8

    goto :goto_3

    .line 24
    :cond_8
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    .line 25
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    const/4 v15, 0x5

    const/4 v8, 0x4

    iget-object v6, v2, Lh/c;->D:Lh/d;

    if-eqz v13, :cond_9

    .line 26
    iget-object v3, v6, Lh/d;->c:Landroid/content/Context;

    sget-object v6, Lc/a;->l:[I

    invoke-virtual {v3, v1, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v3

    .line 27
    invoke-virtual {v3, v4, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    iput v6, v2, Lh/c;->b:I

    .line 28
    invoke-virtual {v3, v14, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v2, Lh/c;->c:I

    .line 29
    invoke-virtual {v3, v8, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v2, Lh/c;->d:I

    .line 30
    invoke-virtual {v3, v15, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v2, Lh/c;->e:I

    const/4 v6, 0x2

    .line 31
    invoke-virtual {v3, v6, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v8

    iput-boolean v8, v2, Lh/c;->f:Z

    .line 32
    invoke-virtual {v3, v7, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, v2, Lh/c;->g:Z

    .line 33
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    goto/16 :goto_3

    .line 34
    :cond_9
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_14

    .line 35
    iget-object v3, v6, Lh/d;->c:Landroid/content/Context;

    sget-object v12, Lc/a;->m:[I

    .line 36
    invoke-virtual {v3, v1, v12}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v12

    const/4 v13, 0x2

    .line 37
    invoke-virtual {v12, v13, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    .line 38
    iput v4, v2, Lh/c;->i:I

    .line 39
    iget v4, v2, Lh/c;->c:I

    .line 40
    invoke-virtual {v12, v15, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    .line 41
    iget v15, v2, Lh/c;->d:I

    const/4 v13, 0x6

    .line 42
    invoke-virtual {v12, v13, v15}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v13

    const/high16 v15, -0x10000

    and-int/2addr v4, v15

    const v15, 0xffff

    and-int/2addr v13, v15

    or-int/2addr v4, v13

    .line 43
    iput v4, v2, Lh/c;->j:I

    const/4 v4, 0x7

    .line 44
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v4

    .line 45
    iput-object v4, v2, Lh/c;->k:Ljava/lang/CharSequence;

    const/16 v4, 0x8

    .line 46
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v4

    .line 47
    iput-object v4, v2, Lh/c;->l:Ljava/lang/CharSequence;

    .line 48
    invoke-virtual {v12, v7, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    .line 49
    iput v4, v2, Lh/c;->m:I

    const/16 v4, 0x9

    .line 50
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_a

    const/4 v4, 0x0

    goto :goto_5

    .line 51
    :cond_a
    invoke-virtual {v4, v7}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 52
    :goto_5
    iput-char v4, v2, Lh/c;->n:C

    const/16 v4, 0x10

    const/16 v13, 0x1000

    .line 53
    invoke-virtual {v12, v4, v13}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    .line 54
    iput v4, v2, Lh/c;->o:I

    const/16 v4, 0xa

    .line 55
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_b

    const/4 v4, 0x0

    goto :goto_6

    .line 56
    :cond_b
    invoke-virtual {v4, v7}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 57
    :goto_6
    iput-char v4, v2, Lh/c;->p:C

    const/16 v4, 0x14

    .line 58
    invoke-virtual {v12, v4, v13}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    .line 59
    iput v4, v2, Lh/c;->q:I

    const/16 v4, 0xb

    .line 60
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v13

    if-eqz v13, :cond_c

    .line 61
    invoke-virtual {v12, v4, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    .line 62
    iput v4, v2, Lh/c;->r:I

    goto :goto_7

    .line 63
    :cond_c
    iget v4, v2, Lh/c;->e:I

    iput v4, v2, Lh/c;->r:I

    .line 64
    :goto_7
    invoke-virtual {v12, v14, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    .line 65
    iput-boolean v4, v2, Lh/c;->s:Z

    .line 66
    iget-boolean v4, v2, Lh/c;->f:Z

    .line 67
    invoke-virtual {v12, v8, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    .line 68
    iput-boolean v4, v2, Lh/c;->t:Z

    .line 69
    iget-boolean v4, v2, Lh/c;->g:Z

    const/4 v8, 0x1

    .line 70
    invoke-virtual {v12, v8, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    .line 71
    iput-boolean v4, v2, Lh/c;->u:Z

    const/16 v4, 0x15

    const/4 v8, -0x1

    .line 72
    invoke-virtual {v12, v4, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    .line 73
    iput v4, v2, Lh/c;->v:I

    const/16 v4, 0xc

    .line 74
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 75
    iput-object v4, v2, Lh/c;->y:Ljava/lang/String;

    const/16 v4, 0xd

    .line 76
    invoke-virtual {v12, v4, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    .line 77
    iput v4, v2, Lh/c;->w:I

    const/16 v4, 0xf

    .line 78
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 79
    iput-object v4, v2, Lh/c;->x:Ljava/lang/String;

    const/16 v4, 0xe

    .line 80
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_d

    const/4 v13, 0x1

    goto :goto_8

    :cond_d
    const/4 v13, 0x0

    :goto_8
    if-eqz v13, :cond_f

    .line 81
    iget v14, v2, Lh/c;->w:I

    if-nez v14, :cond_f

    iget-object v14, v2, Lh/c;->x:Ljava/lang/String;

    if-nez v14, :cond_f

    .line 82
    sget-object v13, Lh/d;->f:[Ljava/lang/Class;

    iget-object v6, v6, Lh/d;->b:[Ljava/lang/Object;

    invoke-virtual {v2, v4, v13, v6}, Lh/c;->a(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_e

    goto :goto_9

    :cond_e
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    :cond_f
    if-eqz v13, :cond_10

    .line 83
    const-string v4, "SupportMenuInflater"

    const-string v6, "Ignoring attribute \'actionProviderClass\'. Action view already specified."

    invoke-static {v4, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_10
    :goto_9
    const/16 v4, 0x11

    .line 84
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v4

    .line 85
    iput-object v4, v2, Lh/c;->z:Ljava/lang/CharSequence;

    const/16 v4, 0x16

    .line 86
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v4

    .line 87
    iput-object v4, v2, Lh/c;->A:Ljava/lang/CharSequence;

    const/16 v4, 0x13

    .line 88
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    if-eqz v6, :cond_11

    .line 89
    invoke-virtual {v12, v4, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    .line 90
    iget-object v6, v2, Lh/c;->C:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v4, v6}, Lj/y;->d(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v4

    iput-object v4, v2, Lh/c;->C:Landroid/graphics/PorterDuff$Mode;

    goto :goto_a

    :cond_11
    const/4 v4, 0x0

    .line 91
    iput-object v4, v2, Lh/c;->C:Landroid/graphics/PorterDuff$Mode;

    :goto_a
    const/16 v4, 0x12

    .line 92
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    if-eqz v6, :cond_13

    .line 93
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    if-eqz v6, :cond_12

    .line 94
    invoke-virtual {v12, v4, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    if-eqz v6, :cond_12

    .line 95
    invoke-static {v3, v6}, Ld/b;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v3

    if-eqz v3, :cond_12

    goto :goto_b

    .line 96
    :cond_12
    invoke-virtual {v12, v4}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    .line 97
    :goto_b
    iput-object v3, v2, Lh/c;->B:Landroid/content/res/ColorStateList;

    const/4 v4, 0x0

    goto :goto_c

    :cond_13
    const/4 v4, 0x0

    .line 98
    iput-object v4, v2, Lh/c;->B:Landroid/content/res/ColorStateList;

    .line 99
    :goto_c
    invoke-virtual {v12}, Landroid/content/res/TypedArray;->recycle()V

    .line 100
    iput-boolean v7, v2, Lh/c;->h:Z

    move-object/from16 v8, p1

    goto/16 :goto_4

    :cond_14
    const/4 v4, 0x0

    .line 101
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_15

    const/4 v6, 0x1

    .line 102
    iput-boolean v6, v2, Lh/c;->h:Z

    .line 103
    iget v3, v2, Lh/c;->b:I

    iget v8, v2, Lh/c;->i:I

    iget v12, v2, Lh/c;->j:I

    iget-object v13, v2, Lh/c;->k:Ljava/lang/CharSequence;

    iget-object v14, v2, Lh/c;->a:Landroid/view/Menu;

    invoke-interface {v14, v3, v8, v12, v13}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object v3

    .line 104
    invoke-interface {v3}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    move-result-object v8

    invoke-virtual {v2, v8}, Lh/c;->b(Landroid/view/MenuItem;)V

    move-object/from16 v8, p1

    .line 105
    invoke-virtual {v0, v8, v1, v3}, Lh/d;->b(Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V

    goto :goto_d

    :cond_15
    move-object/from16 v8, p1

    const/4 v6, 0x1

    move-object v11, v3

    const/4 v10, 0x1

    .line 106
    :goto_d
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    const/4 v4, 0x1

    const/4 v6, 0x2

    goto/16 :goto_2

    .line 107
    :cond_16
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unexpected end of document"

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_17
    return-void

    :cond_18
    move-object/from16 v8, p1

    goto/16 :goto_0
.end method

.method public final inflate(ILandroid/view/Menu;)V
    .locals 3

    .line 1
    const-string v0, "Error inflating menu XML"

    .line 2
    .line 3
    instance-of v1, p2, Li/j;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1, p2}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :try_start_0
    iget-object v2, p0, Lh/d;->c:Landroid/content/Context;

    .line 13
    .line 14
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getLayout(I)Landroid/content/res/XmlResourceParser;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, v1, p1, p2}, Lh/d;->b(Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_2

    .line 35
    :catch_0
    move-exception p1

    .line 36
    goto :goto_0

    .line 37
    :catch_1
    move-exception p1

    .line 38
    goto :goto_1

    .line 39
    :goto_0
    :try_start_1
    new-instance p2, Landroid/view/InflateException;

    .line 40
    .line 41
    invoke-direct {p2, v0, p1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    throw p2

    .line 45
    :goto_1
    new-instance p2, Landroid/view/InflateException;

    .line 46
    .line 47
    invoke-direct {p2, v0, p1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    :goto_2
    if-eqz v1, :cond_1

    .line 52
    .line 53
    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V

    .line 54
    .line 55
    .line 56
    :cond_1
    throw p1
.end method
