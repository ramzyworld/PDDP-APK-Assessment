package P0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Iterator, J0.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f572e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public M0.c f575h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f576i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f577j;

    public a(b bVar) {
        this.f577j = bVar;
        int i2 = bVar.f579b;
        int length = bVar.f578a.length();
        if (length < 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 > length) {
            i2 = length;
        }
        this.f573f = i2;
        this.f574g = i2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:17:0x0069  */
    /* JADX WARN: Code duplicated, block: B:18:0x006c  */
    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    public final void a() {
        p041x0.b bVar;
        int iIntValue;
        int i2;
        M0.c cVar;
        int i3 = this.f574g;
        if (i3 < 0) {
            this.f572e = 0;
            this.f575h = null;
            return;
        }
        b bVar2 = this.f577j;
        int i4 = bVar2.f580c;
        String str = bVar2.f578a;
        if (i4 > 0) {
            int i5 = this.f576i + 1;
            this.f576i = i5;
            if (i5 >= i4) {
                this.f575h = new M0.c(this.f573f, j.S(str), 1);
                this.f574g = -1;
            } else if (i3 > str.length() && (bVar = (p041x0.b) bVar2.f581d.h(str, Integer.valueOf(this.f574g))) != null) {
                iIntValue = ((Number) bVar.f3411e).intValue();
                int iIntValue2 = ((Number) bVar.f3412f).intValue();
                i2 = this.f573f;
                if (iIntValue <= Integer.MIN_VALUE) {
                    cVar = M0.c.f420h;
                } else {
                    cVar = new M0.c(i2, iIntValue - 1, 1);
                }
                this.f575h = cVar;
                int i6 = iIntValue + iIntValue2;
                this.f573f = i6;
                this.f574g = i6 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f575h = new M0.c(this.f573f, j.S(str), 1);
                this.f574g = -1;
            }
        } else if (i3 > str.length()) {
            this.f575h = new M0.c(this.f573f, j.S(str), 1);
            this.f574g = -1;
        } else {
            iIntValue = ((Number) bVar.f3411e).intValue();
            int iIntValue3 = ((Number) bVar.f3412f).intValue();
            i2 = this.f573f;
            if (iIntValue <= Integer.MIN_VALUE) {
                cVar = M0.c.f420h;
            } else {
                cVar = new M0.c(i2, iIntValue - 1, 1);
            }
            this.f575h = cVar;
            int i7 = iIntValue + iIntValue3;
            this.f573f = i7;
            this.f574g = i7 + (iIntValue3 == 0 ? 1 : 0);
        }
        this.f572e = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f572e == -1) {
            a();
        }
        return this.f572e == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f572e == -1) {
            a();
        }
        if (this.f572e == 0) {
            throw new NoSuchElementException();
        }
        M0.c cVar = this.f575h;
        I0.i.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f575h = null;
        this.f572e = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
