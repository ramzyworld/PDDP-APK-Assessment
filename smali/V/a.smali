.class public final LV/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LV/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LV/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LV/a;->a:LV/a;

    .line 7
    .line 8
    return-void
.end method

.method public static a(ILjava/lang/Object;)LV/h;
    .locals 2

    .line 1
    sget-object v0, LV/a;->a:LV/a;

    .line 2
    .line 3
    const-string v1, "<this>"

    .line 4
    .line 5
    invoke-static {p1, v1}, LI0/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "verificationMode"

    .line 9
    .line 10
    invoke-static {v1, p0}, LI0/h;->h(Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v1, LV/h;

    .line 14
    .line 15
    invoke-direct {v1, p1, p0, v0}, LV/h;-><init>(Ljava/lang/Object;ILV/a;)V

    .line 16
    .line 17
    .line 18
    return-object v1
.end method
