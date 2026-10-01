package p030q0;

import N.Q;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class o implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f3031a;

    static {
        n nVar = n.f3028a;
        f3031a = new o();
    }

    @Override // p030q0.l
    public final ByteBuffer a(Object obj) throws IOException {
        m mVar = new m();
        mVar.write(0);
        n.f3028a.k(mVar, obj);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(mVar.size());
        byteBufferAllocateDirect.put(mVar.a(), 0, mVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // p030q0.l
    public final Q b(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        n nVar = n.f3028a;
        Object objE = nVar.e(byteBuffer);
        Object objE2 = nVar.e(byteBuffer);
        if (!(objE instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new Q(22, (String) objE, objE2);
    }

    @Override // p030q0.l
    public final Object c(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b2 = byteBuffer.get();
        if (b2 != 0) {
            if (b2 == 1) {
            }
            throw new IllegalArgumentException("Envelope corrupted");
        }
        Object objE = n.f3028a.e(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return objE;
        }
        n nVar = n.f3028a;
        Object objE2 = nVar.e(byteBuffer);
        Object objE3 = nVar.e(byteBuffer);
        Object objE4 = nVar.e(byteBuffer);
        if ((objE2 instanceof String) && ((objE3 == null || (objE3 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new g((String) objE2, (String) objE3, objE4);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }

    @Override // p030q0.l
    public final ByteBuffer d(String str, String str2) throws IOException {
        m mVar = new m();
        mVar.write(1);
        n nVar = n.f3028a;
        nVar.k(mVar, "error");
        nVar.k(mVar, str);
        mVar.write(0);
        nVar.k(mVar, str2);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(mVar.size());
        byteBufferAllocateDirect.put(mVar.a(), 0, mVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // p030q0.l
    public final ByteBuffer e(Q q2) {
        m mVar = new m();
        n nVar = n.f3028a;
        nVar.k(mVar, (String) q2.f471f);
        nVar.k(mVar, q2.f472g);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(mVar.size());
        byteBufferAllocateDirect.put(mVar.a(), 0, mVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // p030q0.l
    public final ByteBuffer f(String str, String str2, Object obj) throws IOException {
        m mVar = new m();
        mVar.write(1);
        n nVar = n.f3028a;
        nVar.k(mVar, str);
        nVar.k(mVar, str2);
        if (obj instanceof Throwable) {
            nVar.k(mVar, Log.getStackTraceString((Throwable) obj));
        } else {
            nVar.k(mVar, obj);
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(mVar.size());
        byteBufferAllocateDirect.put(mVar.a(), 0, mVar.size());
        return byteBufferAllocateDirect;
    }
}
