package p039v0;

import H0.l;
import I0.j;
import android.util.Log;
import p041x0.c;
import p041x0.d;
import p041x0.g;

/* JADX INFO: renamed from: v0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0150h extends j implements l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f3359f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0150h(long j2) {
        super(1);
        this.f3359f = j2;
    }

    @Override // H0.l
    public final Object j(Object obj) {
        if (((d) obj).f3414e instanceof c) {
            Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + this.f3359f);
        }
        return g.f3419a;
    }
}
