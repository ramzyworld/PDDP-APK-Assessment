package S0;

import Q0.InterfaceC0047e;
import V0.AbstractC0068a;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f788a = new j(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f789b = AbstractC0068a.k("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f790c = AbstractC0068a.k("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D.j f791d = new D.j(14, "BUFFERED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D.j f792e = new D.j(14, "SHOULD_BUFFER");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final D.j f793f = new D.j(14, "S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final D.j f794g = new D.j(14, "RESUMING_BY_EB");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final D.j f795h = new D.j(14, "POISONED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final D.j f796i = new D.j(14, "DONE_RCV");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final D.j f797j = new D.j(14, "INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final D.j f798k = new D.j(14, "INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final D.j f799l = new D.j(14, "CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final D.j f800m = new D.j(14, "SUSPEND");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final D.j f801n = new D.j(14, "SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final D.j f802o = new D.j(14, "FAILED");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final D.j f803p = new D.j(14, "NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final D.j f804q = new D.j(14, "CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final D.j f805r = new D.j(14, "CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final D.j f806s = new D.j(14, "NO_CLOSE_CAUSE");

    public static final boolean a(InterfaceC0047e interfaceC0047e, Object obj, H0.l lVar) {
        D.j jVarE = interfaceC0047e.e(obj, lVar);
        if (jVarE == null) {
            return false;
        }
        interfaceC0047e.o(jVarE);
        return true;
    }
}
