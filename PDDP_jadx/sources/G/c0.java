package G;

import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends U {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Object obj, B0.b bVar) throws IOException {
        b0 b0Var;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (bVar instanceof b0) {
            b0Var = (b0) bVar;
            int i2 = b0Var.f188l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b0Var.f188l = i2 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(this, bVar);
            }
        } else {
            b0Var = new b0(this, bVar);
        }
        Object obj2 = b0Var.f186j;
        A0.a aVar = A0.a.f0e;
        int i3 = b0Var.f188l;
        p041x0.g gVar = p041x0.g.f3419a;
        if (i3 == 0) {
            p000a.a.O(obj2);
            if (this.f158b.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            FileOutputStream fileOutputStream3 = new FileOutputStream(this.f157a);
            try {
                J.g gVar2 = J.g.f348a;
                o0 o0Var = new o0(fileOutputStream3);
                b0Var.f184h = fileOutputStream3;
                b0Var.f185i = fileOutputStream3;
                b0Var.f188l = 1;
                gVar2.b(obj, o0Var);
                if (gVar == aVar) {
                    return aVar;
                }
                fileOutputStream2 = fileOutputStream3;
                fileOutputStream = fileOutputStream2;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream3;
                throw th;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream2 = b0Var.f185i;
            fileOutputStream = b0Var.f184h;
            try {
                p000a.a.O(obj2);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    p000a.a.g(fileOutputStream, th);
                    throw th3;
                }
            }
        }
        fileOutputStream2.getFD().sync();
        p000a.a.g(fileOutputStream, null);
        return gVar;
    }
}
