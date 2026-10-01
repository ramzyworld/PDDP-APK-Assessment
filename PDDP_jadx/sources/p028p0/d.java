package p028p0;

import G.C0013n;
import I.j;
import java.util.Locale;
import p015i0.b;
import p030q0.p;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0013n f2901d;

    public d(b bVar) {
        C0013n c0013n = new C0013n(bVar, "flutter/lifecycle", p.f3033b, (Object) null);
        this.f2898a = 0;
        this.f2899b = 0;
        this.f2900c = true;
        this.f2901d = c0013n;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0029  */
    public final void a(int i2, boolean z2) {
        int i3;
        String str;
        int i4 = this.f2898a;
        if (i4 == i2 && z2 == this.f2900c) {
            return;
        }
        if (i2 == 0 && i4 == 0) {
            this.f2900c = z2;
            return;
        }
        int iB = j.b(i2);
        if (iB != 0) {
            if (iB == 1) {
                i3 = z2 ? 2 : 3;
            } else if (iB == 2 || iB == 3 || iB == 4) {
                i3 = i2;
            } else {
                i3 = 0;
            }
        } else {
            i3 = i2;
        }
        this.f2898a = i2;
        this.f2900c = z2;
        if (i3 == this.f2899b) {
            return;
        }
        StringBuilder sb = new StringBuilder("AppLifecycleState.");
        if (i3 == 1) {
            str = "DETACHED";
        } else if (i3 == 2) {
            str = "RESUMED";
        } else if (i3 == 3) {
            str = "INACTIVE";
        } else if (i3 == 4) {
            str = "HIDDEN";
        } else {
            if (i3 != 5) {
                throw null;
            }
            str = "PAUSED";
        }
        sb.append(str.toLowerCase(Locale.ROOT));
        this.f2901d.f(sb.toString(), null);
        this.f2899b = i3;
    }
}
