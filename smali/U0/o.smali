.class public final synthetic LU0/o;
.super LI0/g;
.source "SourceFile"

# interfaces
.implements LH0/q;


# static fields
.field public static final m:LU0/o;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v6, LU0/o;

    .line 2
    .line 3
    const-string v4, "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x3

    .line 7
    const-class v2, LT0/e;

    .line 8
    .line 9
    const-string v3, "emit"

    .line 10
    .line 11
    move-object v0, v6

    .line 12
    invoke-direct/range {v0 .. v5}, LI0/g;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    sput-object v6, LU0/o;->m:LU0/o;

    .line 16
    .line 17
    return-void
.end method
