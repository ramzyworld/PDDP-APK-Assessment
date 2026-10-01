.class public final Lm/a;
.super Lm/i;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;


# instance fields
.field public l:LG/n;


# virtual methods
.method public final entrySet()Ljava/util/Set;
    .locals 3

    .line 1
    iget-object v0, p0, Lm/a;->l:LG/n;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LG/n;

    .line 6
    .line 7
    invoke-direct {v0, p0}, LG/n;-><init>(Lm/a;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lm/a;->l:LG/n;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lm/a;->l:LG/n;

    .line 13
    .line 14
    iget-object v1, v0, LG/n;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lm/f;

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    new-instance v1, Lm/f;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-direct {v1, v0, v2}, Lm/f;-><init>(LG/n;I)V

    .line 24
    .line 25
    .line 26
    iput-object v1, v0, LG/n;->a:Ljava/lang/Object;

    .line 27
    .line 28
    :cond_1
    iget-object v0, v0, LG/n;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lm/f;

    .line 31
    .line 32
    return-object v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 3

    .line 1
    iget-object v0, p0, Lm/a;->l:LG/n;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LG/n;

    .line 6
    .line 7
    invoke-direct {v0, p0}, LG/n;-><init>(Lm/a;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lm/a;->l:LG/n;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lm/a;->l:LG/n;

    .line 13
    .line 14
    iget-object v1, v0, LG/n;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lm/f;

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    new-instance v1, Lm/f;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-direct {v1, v0, v2}, Lm/f;-><init>(LG/n;I)V

    .line 24
    .line 25
    .line 26
    iput-object v1, v0, LG/n;->b:Ljava/lang/Object;

    .line 27
    .line 28
    :cond_1
    iget-object v0, v0, LG/n;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lm/f;

    .line 31
    .line 32
    return-object v0
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 6

    .line 1
    iget v0, p0, Lm/i;->g:I

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/2addr v1, v0

    .line 8
    iget v0, p0, Lm/i;->g:I

    .line 9
    .line 10
    iget-object v2, p0, Lm/i;->e:[I

    .line 11
    .line 12
    array-length v3, v2

    .line 13
    if-ge v3, v1, :cond_1

    .line 14
    .line 15
    iget-object v3, p0, Lm/i;->f:[Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lm/i;->a(I)V

    .line 18
    .line 19
    .line 20
    iget v1, p0, Lm/i;->g:I

    .line 21
    .line 22
    if-lez v1, :cond_0

    .line 23
    .line 24
    iget-object v1, p0, Lm/i;->e:[I

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-static {v2, v4, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lm/i;->f:[Ljava/lang/Object;

    .line 31
    .line 32
    shl-int/lit8 v5, v0, 0x1

    .line 33
    .line 34
    invoke-static {v3, v4, v1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-static {v2, v3, v0}, Lm/i;->b([I[Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iget v1, p0, Lm/i;->g:I

    .line 41
    .line 42
    if-ne v1, v0, :cond_3

    .line 43
    .line 44
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Ljava/util/Map$Entry;

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {p0, v1, v0}, Lm/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    return-void

    .line 77
    :cond_3
    new-instance p1, Ljava/util/ConcurrentModificationException;

    .line 78
    .line 79
    invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 80
    .line 81
    .line 82
    throw p1
.end method

.method public final values()Ljava/util/Collection;
    .locals 2

    .line 1
    iget-object v0, p0, Lm/a;->l:LG/n;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LG/n;

    .line 6
    .line 7
    invoke-direct {v0, p0}, LG/n;-><init>(Lm/a;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lm/a;->l:LG/n;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lm/a;->l:LG/n;

    .line 13
    .line 14
    iget-object v1, v0, LG/n;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lm/h;

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    new-instance v1, Lm/h;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Lm/h;-><init>(LG/n;)V

    .line 23
    .line 24
    .line 25
    iput-object v1, v0, LG/n;->c:Ljava/lang/Object;

    .line 26
    .line 27
    :cond_1
    iget-object v0, v0, LG/n;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lm/h;

    .line 30
    .line 31
    return-object v0
.end method
