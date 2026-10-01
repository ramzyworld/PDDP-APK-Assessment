.class public final Lm/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:LG/n;


# direct methods
.method public synthetic constructor <init>(LG/n;I)V
    .locals 0

    .line 1
    iput p2, p0, Lm/f;->e:I

    iput-object p1, p0, Lm/f;->f:LG/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget v0, p0, Lm/f;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 9
    .line 10
    .line 11
    throw p1

    .line 12
    :pswitch_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 13
    .line 14
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 5

    .line 1
    iget v0, p0, Lm/f;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 9
    .line 10
    .line 11
    throw p1

    .line 12
    :pswitch_0
    iget-object v0, p0, Lm/f;->f:LG/n;

    .line 13
    .line 14
    iget-object v1, v0, LG/n;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lm/a;

    .line 17
    .line 18
    iget v1, v1, Lm/i;->g:I

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/util/Map$Entry;

    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget-object v4, v0, LG/n;->d:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v4, Lm/a;

    .line 47
    .line 48
    invoke-virtual {v4, v3, v2}, Lm/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    iget-object p1, v0, LG/n;->d:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Lm/a;

    .line 55
    .line 56
    iget p1, p1, Lm/i;->g:I

    .line 57
    .line 58
    if-eq v1, p1, :cond_1

    .line 59
    .line 60
    const/4 p1, 0x1

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    const/4 p1, 0x0

    .line 63
    :goto_1
    return p1

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final clear()V
    .locals 1

    .line 1
    iget v0, p0, Lm/f;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm/f;->f:LG/n;

    .line 7
    .line 8
    iget-object v0, v0, LG/n;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lm/a;

    .line 11
    .line 12
    invoke-virtual {v0}, Lm/i;->clear()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Lm/f;->f:LG/n;

    .line 17
    .line 18
    iget-object v0, v0, LG/n;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lm/a;

    .line 21
    .line 22
    invoke-virtual {v0}, Lm/i;->clear()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    iget v0, p0, Lm/f;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm/f;->f:LG/n;

    .line 7
    .line 8
    iget-object v0, v0, LG/n;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lm/a;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lm/i;->d(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-ltz p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    :goto_0
    return p1

    .line 22
    :pswitch_0
    instance-of v0, p1, Ljava/util/Map$Entry;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    check-cast p1, Ljava/util/Map$Entry;

    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v2, p0, Lm/f;->f:LG/n;

    .line 35
    .line 36
    iget-object v3, v2, LG/n;->d:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v3, Lm/a;

    .line 39
    .line 40
    invoke-virtual {v3, v0}, Lm/i;->d(Ljava/lang/Object;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-gez v0, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    const/4 v3, 0x1

    .line 48
    invoke-virtual {v2, v0, v3}, LG/n;->a(II)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-eq v0, p1, :cond_3

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_4

    .line 65
    .line 66
    :cond_3
    const/4 v1, 0x1

    .line 67
    :cond_4
    :goto_1
    return v1

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 2

    .line 1
    iget v0, p0, Lm/f;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm/f;->f:LG/n;

    .line 7
    .line 8
    iget-object v0, v0, LG/n;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lm/a;

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Lm/i;->containsKey(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 p1, 0x1

    .line 35
    :goto_0
    return p1

    .line 36
    :pswitch_0
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {p0, v0}, Lm/f;->contains(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    goto :goto_1

    .line 58
    :cond_3
    const/4 p1, 0x1

    .line 59
    :goto_1
    return p1

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget v0, p0, Lm/f;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, LG/n;->d(Ljava/util/Set;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    invoke-static {p0, p1}, LG/n;->d(Ljava/util/Set;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final hashCode()I
    .locals 7

    .line 1
    iget v0, p0, Lm/f;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm/f;->f:LG/n;

    .line 7
    .line 8
    iget-object v1, v0, LG/n;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lm/a;

    .line 11
    .line 12
    iget v1, v1, Lm/i;->g:I

    .line 13
    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    :goto_0
    if-ltz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, LG/n;->a(II)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    :goto_1
    add-int/2addr v3, v4

    .line 33
    add-int/lit8 v1, v1, -0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return v3

    .line 37
    :pswitch_0
    iget-object v0, p0, Lm/f;->f:LG/n;

    .line 38
    .line 39
    iget-object v1, v0, LG/n;->d:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Lm/a;

    .line 42
    .line 43
    iget v1, v1, Lm/i;->g:I

    .line 44
    .line 45
    const/4 v2, 0x1

    .line 46
    sub-int/2addr v1, v2

    .line 47
    const/4 v3, 0x0

    .line 48
    const/4 v4, 0x0

    .line 49
    :goto_2
    if-ltz v1, :cond_4

    .line 50
    .line 51
    invoke-virtual {v0, v1, v3}, LG/n;->a(II)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {v0, v1, v2}, LG/n;->a(II)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    if-nez v5, :cond_2

    .line 60
    .line 61
    const/4 v5, 0x0

    .line 62
    goto :goto_3

    .line 63
    :cond_2
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    :goto_3
    if-nez v6, :cond_3

    .line 68
    .line 69
    const/4 v6, 0x0

    .line 70
    goto :goto_4

    .line 71
    :cond_3
    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    :goto_4
    xor-int/2addr v5, v6

    .line 76
    add-int/2addr v4, v5

    .line 77
    add-int/lit8 v1, v1, -0x1

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    return v4

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final isEmpty()Z
    .locals 1

    .line 1
    iget v0, p0, Lm/f;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm/f;->f:LG/n;

    .line 7
    .line 8
    iget-object v0, v0, LG/n;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lm/a;

    .line 11
    .line 12
    iget v0, v0, Lm/i;->g:I

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    return v0

    .line 20
    :pswitch_0
    iget-object v0, p0, Lm/f;->f:LG/n;

    .line 21
    .line 22
    iget-object v0, v0, LG/n;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lm/a;

    .line 25
    .line 26
    iget v0, v0, Lm/i;->g:I

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/4 v0, 0x0

    .line 33
    :goto_1
    return v0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 1
    iget v0, p0, Lm/f;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lm/e;

    .line 7
    .line 8
    iget-object v1, p0, Lm/f;->f:LG/n;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v0, v1, v2}, Lm/e;-><init>(LG/n;I)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, Lm/g;

    .line 16
    .line 17
    iget-object v1, p0, Lm/f;->f:LG/n;

    .line 18
    .line 19
    invoke-direct {v0, v1}, Lm/g;-><init>(LG/n;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget v0, p0, Lm/f;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm/f;->f:LG/n;

    .line 7
    .line 8
    iget-object v1, v0, LG/n;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lm/a;

    .line 11
    .line 12
    invoke-virtual {v1, p1}, Lm/i;->d(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-ltz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, p1}, LG/n;->b(I)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    :goto_0
    return p1

    .line 25
    :pswitch_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 3

    .line 1
    iget v0, p0, Lm/f;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm/f;->f:LG/n;

    .line 7
    .line 8
    iget-object v0, v0, LG/n;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lm/a;

    .line 11
    .line 12
    invoke-virtual {v0}, Lm/i;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v0, v2}, Lm/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v0}, Lm/i;->size()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eq v1, p1, :cond_1

    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const/4 p1, 0x0

    .line 43
    :goto_1
    return p1

    .line 44
    :pswitch_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 4

    .line 1
    iget v0, p0, Lm/f;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm/f;->f:LG/n;

    .line 7
    .line 8
    iget-object v0, v0, LG/n;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lm/a;

    .line 11
    .line 12
    invoke-virtual {v0}, Lm/i;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0}, Lm/a;->keySet()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-interface {p1, v3}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_0

    .line 39
    .line 40
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {v0}, Lm/i;->size()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eq v1, p1, :cond_2

    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    const/4 p1, 0x0

    .line 53
    :goto_1
    return p1

    .line 54
    :pswitch_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 55
    .line 56
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final size()I
    .locals 1

    .line 1
    iget v0, p0, Lm/f;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm/f;->f:LG/n;

    .line 7
    .line 8
    iget-object v0, v0, LG/n;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lm/a;

    .line 11
    .line 12
    iget v0, v0, Lm/i;->g:I

    .line 13
    .line 14
    return v0

    .line 15
    :pswitch_0
    iget-object v0, p0, Lm/f;->f:LG/n;

    .line 16
    .line 17
    iget-object v0, v0, LG/n;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lm/a;

    .line 20
    .line 21
    iget v0, v0, Lm/i;->g:I

    .line 22
    .line 23
    return v0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lm/f;->e:I

    packed-switch v0, :pswitch_data_0

    .line 1
    iget-object v0, p0, Lm/f;->f:LG/n;

    .line 2
    iget-object v1, v0, LG/n;->d:Ljava/lang/Object;

    check-cast v1, Lm/a;

    iget v1, v1, Lm/i;->g:I

    .line 3
    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_0

    .line 4
    invoke-virtual {v0, v4, v3}, LG/n;->a(II)Ljava/lang/Object;

    move-result-object v5

    aput-object v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    return-object v2

    .line 5
    :pswitch_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lm/f;->e:I

    packed-switch v0, :pswitch_data_0

    .line 6
    iget-object v0, p0, Lm/f;->f:LG/n;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, LG/n;->h(I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 7
    :pswitch_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
