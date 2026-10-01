package p030q0;

import a1.a;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f3026a = new h();

    @Override // p030q0.j
    public final Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            p.f3033b.getClass();
            JSONTokener jSONTokener = new JSONTokener(p.c(byteBuffer));
            Object objNextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return objNextValue;
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // p030q0.j
    public final ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        Object objL = a.L(obj);
        if (objL instanceof String) {
            p pVar = p.f3033b;
            String strQuote = JSONObject.quote((String) objL);
            pVar.getClass();
            return p.d(strQuote);
        }
        p pVar2 = p.f3033b;
        String string = objL.toString();
        pVar2.getClass();
        return p.d(string);
    }
}
