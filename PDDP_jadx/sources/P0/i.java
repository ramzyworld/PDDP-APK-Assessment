package P0;

import H0.p;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class i extends I0.j implements p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f583g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(List list, boolean z2) {
        super(2);
        this.f582f = list;
        this.f583g = z2;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ca A[EDGE_INSN: B:50:0x00ca->B:51:0x00cb BREAK  A[LOOP:0: B:24:0x0064->B:35:0x0094]] */
    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        Object next;
        p041x0.b bVar;
        String str;
        Object next2;
        String str2;
        CharSequence charSequence = (CharSequence) obj;
        int iIntValue = ((Number) obj2).intValue();
        I0.i.e(charSequence, "$this$$receiver");
        List list = this.f582f;
        boolean z2 = this.f583g;
        if (z2 || list.size() != 1) {
            if (iIntValue < 0) {
                iIntValue = 0;
            }
            boolean z3 = charSequence instanceof String;
            int i2 = new M0.c(iIntValue, charSequence.length(), 1).f414f;
            if (!z3) {
                if (iIntValue <= i2) {
                    while (true) {
                        Iterator it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            str = (String) next;
                        } while (!j.W(str, charSequence, iIntValue, str.length(), z2));
                        String str3 = (String) next;
                        if (str3 == null) {
                            if (iIntValue == i2) {
                                bVar = null;
                                break;
                            }
                            iIntValue++;
                        } else {
                            bVar = new p041x0.b(Integer.valueOf(iIntValue), str3);
                            break;
                        }
                    }
                } else {
                    bVar = null;
                    break;
                }
            } else if (iIntValue <= i2) {
                while (true) {
                    Iterator it2 = list.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        str2 = (String) next2;
                    } while (!j.V(str2, (String) charSequence, iIntValue, str2.length(), z2));
                    String str4 = (String) next2;
                    if (str4 == null) {
                        if (iIntValue == i2) {
                            bVar = null;
                            break;
                        }
                        iIntValue++;
                    } else {
                        bVar = new p041x0.b(Integer.valueOf(iIntValue), str4);
                        break;
                    }
                }
            } else {
                bVar = null;
                break;
            }
        } else {
            int size = list.size();
            if (size == 0) {
                throw new NoSuchElementException("List is empty.");
            }
            if (size != 1) {
                throw new IllegalArgumentException("List has more than one element.");
            }
            String str5 = (String) list.get(0);
            int iT = j.T(charSequence, str5, iIntValue, 4);
            if (iT < 0) {
                bVar = null;
                break;
            }
            bVar = new p041x0.b(Integer.valueOf(iT), str5);
        }
        if (bVar == null) {
            return null;
        }
        return new p041x0.b(bVar.f3411e, Integer.valueOf(((String) bVar.f3412f).length()));
    }
}
