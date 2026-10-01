package p030q0;

import N.Q;
import a1.a;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f3027a = new i();

    @Override // p030q0.l
    public ByteBuffer a(Object obj) {
        JSONArray jSONArrayPut = new JSONArray().put(a.L(obj));
        if (jSONArrayPut == null) {
            return null;
        }
        Object objL = a.L(jSONArrayPut);
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

    @Override // p030q0.l
    public Q b(ByteBuffer byteBuffer) {
        Object objNextValue;
        Object obj = null;
        if (byteBuffer == null) {
            objNextValue = null;
        } else {
            try {
                try {
                    p.f3033b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(p.c(byteBuffer));
                    objNextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e2) {
                    throw new IllegalArgumentException("Invalid JSON", e2);
                }
            } catch (JSONException e3) {
                throw new IllegalArgumentException("Invalid JSON", e3);
            }
        }
        if (objNextValue instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) objNextValue;
            Object obj2 = jSONObject.get("method");
            Object objOpt = jSONObject.opt("args");
            if (objOpt != JSONObject.NULL) {
                obj = objOpt;
            }
            if (obj2 instanceof String) {
                return new Q(22, (String) obj2, obj);
            }
        }
        throw new IllegalArgumentException("Invalid method call: " + objNextValue);
    }

    @Override // p030q0.l
    public Object c(ByteBuffer byteBuffer) {
        Object objNextValue;
        Object obj = null;
        if (byteBuffer == null) {
            objNextValue = null;
        } else {
            try {
                try {
                    p.f3033b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(p.c(byteBuffer));
                    objNextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e2) {
                    throw new IllegalArgumentException("Invalid JSON", e2);
                }
            } catch (JSONException e3) {
                throw new IllegalArgumentException("Invalid JSON", e3);
            }
        }
        if (objNextValue instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) objNextValue;
            if (jSONArray.length() == 1) {
                Object objOpt = jSONArray.opt(0);
                if (objOpt == JSONObject.NULL) {
                    return null;
                }
                return objOpt;
            }
            if (jSONArray.length() == 3) {
                Object obj2 = jSONArray.get(0);
                Object objOpt2 = jSONArray.opt(1);
                Object obj3 = JSONObject.NULL;
                if (objOpt2 == obj3) {
                    objOpt2 = null;
                }
                Object objOpt3 = jSONArray.opt(2);
                if (objOpt3 != obj3) {
                    obj = objOpt3;
                }
                if ((obj2 instanceof String) && (objOpt2 == null || (objOpt2 instanceof String))) {
                    throw new g((String) obj2, (String) objOpt2, obj);
                }
            }
        }
        throw new IllegalArgumentException("Invalid envelope: " + objNextValue);
    }

    @Override // p030q0.l
    public ByteBuffer d(String str, String str2) {
        JSONArray jSONArrayPut = new JSONArray().put("error").put(a.L(str)).put(JSONObject.NULL).put(a.L(str2));
        if (jSONArrayPut == null) {
            return null;
        }
        Object objL = a.L(jSONArrayPut);
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

    @Override // p030q0.l
    public ByteBuffer e(Q q2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", (String) q2.f471f);
            jSONObject.put("args", a.L(q2.f472g));
            Object objL = a.L(jSONObject);
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
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // p030q0.l
    public ByteBuffer f(String str, String str2, Object obj) {
        JSONArray jSONArrayPut = new JSONArray().put(str).put(a.L(str2)).put(a.L(obj));
        if (jSONArrayPut == null) {
            return null;
        }
        Object objL = a.L(jSONArrayPut);
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
