.class public final Li/t;
.super Li/j;
.source "SourceFile"

# interfaces
.implements Landroid/view/SubMenu;


# instance fields
.field public final v:Li/j;

.field public final w:Li/k;


# direct methods
.method public constructor <init>(Landroid/content/Context;Li/j;Li/k;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Li/j;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Li/t;->v:Li/j;

    .line 5
    .line 6
    iput-object p3, p0, Li/t;->w:Li/k;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d(Li/k;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Li/t;->v:Li/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li/j;->d(Li/k;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final e(Li/j;Landroid/view/MenuItem;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Li/j;->e(Li/j;Landroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Li/t;->v:Li/j;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Li/j;->e(Li/j;Landroid/view/MenuItem;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public final f(Li/k;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Li/t;->v:Li/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li/j;->f(Li/k;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final getItem()Landroid/view/MenuItem;
    .locals 1

    .line 1
    iget-object v0, p0, Li/t;->w:Li/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Li/j;
    .locals 1

    .line 1
    iget-object v0, p0, Li/t;->v:Li/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Li/j;->j()Li/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final l()Z
    .locals 1

    .line 1
    iget-object v0, p0, Li/t;->v:Li/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Li/j;->l()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final m()Z
    .locals 1

    .line 1
    iget-object v0, p0, Li/t;->v:Li/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Li/j;->m()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final n()Z
    .locals 1

    .line 1
    iget-object v0, p0, Li/t;->v:Li/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Li/j;->n()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final setGroupDividerEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Li/t;->v:Li/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li/j;->setGroupDividerEnabled(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setHeaderIcon(I)Landroid/view/SubMenu;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0, v1, p1, v1}, Li/j;->q(ILjava/lang/CharSequence;ILandroid/view/View;)V

    return-object p0
.end method

.method public final setHeaderIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 1

    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, p1, v0}, Li/j;->q(ILjava/lang/CharSequence;ILandroid/view/View;)V

    return-object p0
.end method

.method public final setHeaderTitle(I)Landroid/view/SubMenu;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, p1, v1, v0, v1}, Li/j;->q(ILjava/lang/CharSequence;ILandroid/view/View;)V

    return-object p0
.end method

.method public final setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, v1, p1, v1, v0}, Li/j;->q(ILjava/lang/CharSequence;ILandroid/view/View;)V

    return-object p0
.end method

.method public final setHeaderView(Landroid/view/View;)Landroid/view/SubMenu;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v1, v0, v1, p1}, Li/j;->q(ILjava/lang/CharSequence;ILandroid/view/View;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final setIcon(I)Landroid/view/SubMenu;
    .locals 1

    .line 2
    iget-object v0, p0, Li/t;->w:Li/k;

    invoke-virtual {v0, p1}, Li/k;->setIcon(I)Landroid/view/MenuItem;

    return-object p0
.end method

.method public final setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 1

    .line 1
    iget-object v0, p0, Li/t;->w:Li/k;

    invoke-virtual {v0, p1}, Li/k;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public final setQwertyMode(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Li/t;->v:Li/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li/j;->setQwertyMode(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
