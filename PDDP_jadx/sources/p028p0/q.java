package p028p0;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2976e;

    public q(String str, int i2, int i3, int i4, int i5) {
        if (!(i2 == -1 && i3 == -1) && (i2 < 0 || i3 < 0)) {
            throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i2) + ", " + String.valueOf(i3) + ")");
        }
        if (!(i4 == -1 && i5 == -1) && (i4 < 0 || i4 > i5)) {
            throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i4) + ", " + String.valueOf(i5) + ")");
        }
        if (i5 > str.length()) {
            throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i4));
        }
        if (i2 > str.length()) {
            throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i2));
        }
        if (i3 > str.length()) {
            throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i3));
        }
        this.f2972a = str;
        this.f2973b = i2;
        this.f2974c = i3;
        this.f2975d = i4;
        this.f2976e = i5;
    }

    public static q a(JSONObject jSONObject) {
        return new q(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
    }
}
