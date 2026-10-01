.class public final Landroidx/appcompat/widget/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final synthetic e:Landroidx/appcompat/widget/SearchView;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/SearchView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/appcompat/widget/b;->e:Landroidx/appcompat/widget/SearchView;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Landroidx/appcompat/widget/b;->e:Landroidx/appcompat/widget/SearchView;

    .line 3
    .line 4
    iget-object v2, v1, Landroidx/appcompat/widget/SearchView;->f0:Landroid/app/SearchableInfo;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    return v3

    .line 10
    :cond_0
    iget-object v2, v1, Landroidx/appcompat/widget/SearchView;->t:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 11
    .line 12
    invoke-virtual {v2}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    const/16 v5, 0x42

    .line 17
    .line 18
    if-eqz v4, :cond_a

    .line 19
    .line 20
    invoke-virtual {v2}, Landroid/widget/AutoCompleteTextView;->getListSelection()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    const/4 v6, -0x1

    .line 25
    if-eq v4, v6, :cond_a

    .line 26
    .line 27
    iget-object p1, v1, Landroidx/appcompat/widget/SearchView;->f0:Landroid/app/SearchableInfo;

    .line 28
    .line 29
    if-nez p1, :cond_2

    .line 30
    .line 31
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 32
    goto :goto_4

    .line 33
    :cond_2
    iget-object p1, v1, Landroidx/appcompat/widget/SearchView;->S:LE/c;

    .line 34
    .line 35
    if-nez p1, :cond_3

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_1

    .line 43
    .line 44
    invoke-virtual {p3}, Landroid/view/KeyEvent;->hasNoModifiers()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    if-eq p2, v5, :cond_8

    .line 51
    .line 52
    const/16 p1, 0x54

    .line 53
    .line 54
    if-eq p2, p1, :cond_8

    .line 55
    .line 56
    const/16 p1, 0x3d

    .line 57
    .line 58
    if-ne p2, p1, :cond_4

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_4
    const/16 p1, 0x15

    .line 62
    .line 63
    if-eq p2, p1, :cond_6

    .line 64
    .line 65
    const/16 p3, 0x16

    .line 66
    .line 67
    if-ne p2, p3, :cond_5

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_5
    const/16 p1, 0x13

    .line 71
    .line 72
    if-ne p2, p1, :cond_1

    .line 73
    .line 74
    invoke-virtual {v2}, Landroid/widget/AutoCompleteTextView;->getListSelection()I

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_6
    :goto_1
    if-ne p2, p1, :cond_7

    .line 79
    .line 80
    const/4 p1, 0x0

    .line 81
    goto :goto_2

    .line 82
    :cond_7
    invoke-virtual {v2}, Landroid/widget/TextView;->length()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    :goto_2
    invoke-virtual {v2, p1}, Landroid/widget/EditText;->setSelection(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v3}, Landroid/widget/AutoCompleteTextView;->setListSelection(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, Landroid/widget/AutoCompleteTextView;->clearListSelection()V

    .line 93
    .line 94
    .line 95
    sget-object p1, Landroidx/appcompat/widget/SearchView;->k0:LB0/e;

    .line 96
    .line 97
    iget-object p1, p1, LB0/e;->c:Ljava/lang/reflect/Method;

    .line 98
    .line 99
    if-eqz p1, :cond_9

    .line 100
    .line 101
    :try_start_0
    new-array p2, v0, [Ljava/lang/Object;

    .line 102
    .line 103
    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 104
    .line 105
    aput-object p3, p2, v3

    .line 106
    .line 107
    invoke-virtual {p1, v2, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_8
    :goto_3
    invoke-virtual {v2}, Landroid/widget/AutoCompleteTextView;->getListSelection()I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/SearchView;->l(I)V

    .line 116
    .line 117
    .line 118
    :catch_0
    :cond_9
    :goto_4
    return v0

    .line 119
    :cond_a
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-static {v4}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-nez v4, :cond_b

    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_b
    invoke-virtual {p3}, Landroid/view/KeyEvent;->hasNoModifiers()Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-eqz v4, :cond_c

    .line 135
    .line 136
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 137
    .line 138
    .line 139
    move-result p3

    .line 140
    if-ne p3, v0, :cond_c

    .line 141
    .line 142
    if-ne p2, v5, :cond_c

    .line 143
    .line 144
    invoke-virtual {p1}, Landroid/view/View;->cancelLongPress()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    const/4 p2, 0x0

    .line 156
    const-string p3, "android.intent.action.SEARCH"

    .line 157
    .line 158
    invoke-virtual {v1, p3, p2, p2, p1}, Landroidx/appcompat/widget/SearchView;->h(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    invoke-virtual {p2, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 167
    .line 168
    .line 169
    return v0

    .line 170
    :cond_c
    :goto_5
    return v3
.end method
