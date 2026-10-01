package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends p000a.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1535e;

    public /* synthetic */ k0(int i2) {
        this.f1535e = i2;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0065 A[LOOP:2: B:23:0x005f->B:26:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0139 A[SYNTHETIC] */
    @Override // p000a.a
    public final String n(byte[] bArr, int i2, int i3) throws A {
        int i4;
        byte b2;
        int i5;
        byte b3;
        byte b4;
        byte b5;
        int i6 = i2;
        switch (this.f1535e) {
            case 0:
                if ((i6 | i3 | ((bArr.length - i6) - i3)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
                }
                int i7 = i6 + i3;
                char[] cArr = new char[i3];
                int i8 = 0;
                while (i6 < i7) {
                    byte b6 = bArr[i6];
                    if (b6 < 0) {
                        while (i6 < i7) {
                            i4 = i6 + 1;
                            b2 = bArr[i6];
                            if (b2 < 0) {
                                i5 = i8 + 1;
                                cArr[i8] = (char) b2;
                                while (i4 < i7) {
                                    b3 = bArr[i4];
                                    if (b3 >= 0) {
                                        i4++;
                                        cArr[i5] = (char) b3;
                                        i5++;
                                    } else {
                                        i8 = i5;
                                        i6 = i4;
                                    }
                                }
                                i8 = i5;
                                i6 = i4;
                            } else if (b2 < -32) {
                                if (i4 < i7) {
                                    throw A.a();
                                }
                                i6 += 2;
                                byte b7 = bArr[i4];
                                int i9 = i8 + 1;
                                if (b2 >= -62 || a1.a.s(b7)) {
                                    throw A.a();
                                }
                                cArr[i8] = (char) ((b7 & 63) | ((b2 & 31) << 6));
                                i8 = i9;
                            } else if (b2 < -16) {
                                if (i4 < i7 - 1) {
                                    throw A.a();
                                }
                                int i10 = i6 + 2;
                                b4 = bArr[i4];
                                i6 += 3;
                                byte b8 = bArr[i10];
                                int i11 = i8 + 1;
                                if (!a1.a.s(b4) || ((b2 == -32 && b4 < -96) || ((b2 == -19 && b4 >= -96) || a1.a.s(b8)))) {
                                    throw A.a();
                                }
                                cArr[i8] = (char) (((b4 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                                i8 = i11;
                            } else {
                                if (i4 < i7 - 2) {
                                    throw A.a();
                                }
                                b5 = bArr[i4];
                                int i12 = i6 + 3;
                                byte b9 = bArr[i6 + 2];
                                i6 += 4;
                                byte b10 = bArr[i12];
                                int i13 = i8 + 1;
                                if (!a1.a.s(b5) || (((b5 + 112) + (b2 << 28)) >> 30) != 0 || a1.a.s(b9) || a1.a.s(b10)) {
                                    throw A.a();
                                }
                                int i14 = ((b5 & 63) << 12) | ((b2 & 7) << 18) | ((b9 & 63) << 6) | (b10 & 63);
                                cArr[i8] = (char) ((i14 >>> 10) + 55232);
                                cArr[i13] = (char) ((i14 & 1023) + 56320);
                                i8 += 2;
                            }
                        }
                        return new String(cArr, 0, i8);
                    }
                    i6++;
                    cArr[i8] = (char) b6;
                    i8++;
                }
                while (i6 < i7) {
                    i4 = i6 + 1;
                    b2 = bArr[i6];
                    if (b2 < 0) {
                        if (b2 < -32) {
                            if (i4 < i7) {
                                throw A.a();
                            }
                            i6 += 2;
                            byte b11 = bArr[i4];
                            int i15 = i8 + 1;
                            if (b2 >= -62) {
                            }
                            throw A.a();
                        }
                        if (b2 < -16) {
                            if (i4 < i7 - 1) {
                                throw A.a();
                            }
                            int i16 = i6 + 2;
                            b4 = bArr[i4];
                            i6 += 3;
                            byte b12 = bArr[i16];
                            int i17 = i8 + 1;
                            if (a1.a.s(b4)) {
                            }
                            throw A.a();
                        }
                        if (i4 < i7 - 2) {
                            throw A.a();
                        }
                        b5 = bArr[i4];
                        int i18 = i6 + 3;
                        byte b13 = bArr[i6 + 2];
                        i6 += 4;
                        byte b14 = bArr[i18];
                        int i19 = i8 + 1;
                        if (a1.a.s(b5)) {
                        }
                        throw A.a();
                    }
                    i5 = i8 + 1;
                    cArr[i8] = (char) b2;
                    while (i4 < i7) {
                        b3 = bArr[i4];
                        if (b3 >= 0) {
                            i4++;
                            cArr[i5] = (char) b3;
                            i5++;
                        } else {
                            i8 = i5;
                            i6 = i4;
                        }
                    }
                    i8 = i5;
                    i6 = i4;
                }
                return new String(cArr, 0, i8);
            default:
                Charset charset = AbstractC0092y.f1577a;
                String str = new String(bArr, i6, i3, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i6, i3 + i6))) {
                    throw A.a();
                }
                return str;
        }
    }

    @Override // p000a.a
    public final int p(String str, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        char cCharAt;
        long j2;
        String str2;
        String str3;
        int i6;
        char cCharAt2;
        switch (this.f1535e) {
            case 0:
                int length = str.length();
                int i7 = i3 + i2;
                int i8 = 0;
                while (i8 < length && (i5 = i8 + i2) < i7 && (cCharAt = str.charAt(i8)) < 128) {
                    bArr[i5] = (byte) cCharAt;
                    i8++;
                }
                if (i8 == length) {
                    return i2 + length;
                }
                int i9 = i2 + i8;
                while (i8 < length) {
                    char cCharAt3 = str.charAt(i8);
                    if (cCharAt3 < 128 && i9 < i7) {
                        bArr[i9] = (byte) cCharAt3;
                        i9++;
                    } else if (cCharAt3 < 2048 && i9 <= i7 - 2) {
                        int i10 = i9 + 1;
                        bArr[i9] = (byte) ((cCharAt3 >>> 6) | 960);
                        i9 += 2;
                        bArr[i10] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i9 > i7 - 3) {
                            if (i9 > i7 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i4 = i8 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i4)))) {
                                    throw new l0(i8, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i9);
                            }
                            int i11 = i8 + 1;
                            if (i11 != str.length()) {
                                char cCharAt4 = str.charAt(i11);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i9] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i9 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i12 = i9 + 3;
                                    bArr[i9 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i9 += 4;
                                    bArr[i12] = (byte) ((codePoint & 63) | 128);
                                    i8 = i11;
                                } else {
                                    i8 = i11;
                                }
                            }
                            throw new l0(i8 - 1, length);
                        }
                        bArr[i9] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i13 = i9 + 2;
                        bArr[i9 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i9 += 3;
                        bArr[i13] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i8++;
                }
                return i9;
            default:
                long j3 = i2;
                long j4 = ((long) i3) + j3;
                int length2 = str.length();
                String str4 = " at index ";
                String str5 = "Failed writing ";
                if (length2 > i3 || bArr.length - i3 < i2) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i2 + i3));
                }
                int i14 = 0;
                while (true) {
                    j2 = 1;
                    if (i14 < length2 && (cCharAt2 = str.charAt(i14)) < 128) {
                        j0.j(bArr, j3, (byte) cCharAt2);
                        i14++;
                        j3 = 1 + j3;
                    }
                }
                if (i14 != length2) {
                    while (i14 < length2) {
                        char cCharAt5 = str.charAt(i14);
                        if (cCharAt5 < 128 && j3 < j4) {
                            j0.j(bArr, j3, (byte) cCharAt5);
                            str3 = str5;
                            j3 += j2;
                            str2 = str4;
                        } else if (cCharAt5 >= 2048 || j3 > j4 - 2) {
                            str2 = str4;
                            str3 = str5;
                            if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j3 > j4 - 3) {
                                if (j3 > j4 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i6 = i14 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i6)))) {
                                        throw new l0(i14, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException(str3 + cCharAt5 + str2 + j3);
                                }
                                int i15 = i14 + 1;
                                if (i15 != length2) {
                                    char cCharAt6 = str.charAt(i15);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        j0.j(bArr, j3, (byte) ((codePoint2 >>> 18) | 240));
                                        j0.j(bArr, j3 + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j5 = 3 + j3;
                                        j0.j(bArr, j3 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j3 += 4;
                                        j0.j(bArr, j5, (byte) ((codePoint2 & 63) | 128));
                                        i14 = i15;
                                    } else {
                                        i14 = i15;
                                    }
                                }
                                throw new l0(i14 - 1, length2);
                            }
                            j0.j(bArr, j3, (byte) ((cCharAt5 >>> '\f') | 480));
                            long j6 = j3 + 2;
                            j0.j(bArr, j3 + 1, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j3 += 3;
                            j0.j(bArr, j6, (byte) ((cCharAt5 & '?') | 128));
                        } else {
                            str2 = str4;
                            str3 = str5;
                            long j7 = j3 + j2;
                            j0.j(bArr, j3, (byte) ((cCharAt5 >>> 6) | 960));
                            j3 += 2;
                            j0.j(bArr, j7, (byte) ((cCharAt5 & '?') | 128));
                        }
                        i14++;
                        str4 = str2;
                        str5 = str3;
                        j2 = 1;
                    }
                }
                return (int) j3;
        }
    }
}
