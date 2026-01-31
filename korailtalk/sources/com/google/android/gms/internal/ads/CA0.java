package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class CA0 {

    /* renamed from: f */
    private static final CA0 f12493f = new CA0(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f12494a;

    /* renamed from: b */
    private int[] f12495b;

    /* renamed from: c */
    private Object[] f12496c;

    /* renamed from: d */
    private int f12497d;

    /* renamed from: e */
    private boolean f12498e;

    private CA0(int i8, int[] iArr, Object[] objArr, boolean z8) {
        this.f12497d = -1;
        this.f12494a = i8;
        this.f12495b = iArr;
        this.f12496c = objArr;
        this.f12498e = z8;
    }

    static CA0 b(CA0 ca0, CA0 ca02) {
        int i8 = ca0.f12494a + ca02.f12494a;
        int[] iArrCopyOf = Arrays.copyOf(ca0.f12495b, i8);
        System.arraycopy(ca02.f12495b, 0, iArrCopyOf, ca0.f12494a, ca02.f12494a);
        Object[] objArrCopyOf = Arrays.copyOf(ca0.f12496c, i8);
        System.arraycopy(ca02.f12496c, 0, objArrCopyOf, ca0.f12494a, ca02.f12494a);
        return new CA0(i8, iArrCopyOf, objArrCopyOf, true);
    }

    static CA0 c() {
        return new CA0();
    }

    private final void h(int i8) {
        int[] iArr = this.f12495b;
        if (i8 > iArr.length) {
            int i9 = this.f12494a;
            int i10 = i9 + (i9 / 2);
            if (i10 >= i8) {
                i8 = i10;
            }
            if (i8 < 8) {
                i8 = 8;
            }
            this.f12495b = Arrays.copyOf(iArr, i8);
            this.f12496c = Arrays.copyOf(this.f12496c, i8);
        }
    }

    public static CA0 zzc() {
        return f12493f;
    }

    final CA0 a(CA0 ca0) {
        if (ca0.equals(f12493f)) {
            return this;
        }
        d();
        int i8 = this.f12494a + ca0.f12494a;
        h(i8);
        System.arraycopy(ca0.f12495b, 0, this.f12495b, this.f12494a, ca0.f12494a);
        System.arraycopy(ca0.f12496c, 0, this.f12496c, this.f12494a, ca0.f12494a);
        this.f12494a = i8;
        return this;
    }

    final void d() {
        if (!this.f12498e) {
            throw new UnsupportedOperationException();
        }
    }

    final void e(StringBuilder sb, int i8) {
        for (int i9 = 0; i9 < this.f12494a; i9++) {
            Rz0.b(sb, i8, String.valueOf(this.f12495b[i9] >>> 3), this.f12496c[i9]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CA0)) {
            return false;
        }
        CA0 ca0 = (CA0) obj;
        int i8 = this.f12494a;
        if (i8 == ca0.f12494a) {
            int[] iArr = this.f12495b;
            int[] iArr2 = ca0.f12495b;
            int i9 = 0;
            while (true) {
                if (i9 >= i8) {
                    Object[] objArr = this.f12496c;
                    Object[] objArr2 = ca0.f12496c;
                    int i10 = this.f12494a;
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (objArr[i11].equals(objArr2[i11])) {
                        }
                    }
                    return true;
                }
                if (iArr[i9] != iArr2[i9]) {
                    break;
                }
                i9++;
            }
        }
        return false;
    }

    final void f(int i8, Object obj) {
        d();
        h(this.f12494a + 1);
        int[] iArr = this.f12495b;
        int i9 = this.f12494a;
        iArr[i9] = i8;
        this.f12496c[i9] = obj;
        this.f12494a = i9 + 1;
    }

    final void g(UA0 ua0) {
        for (int i8 = 0; i8 < this.f12494a; i8++) {
            ua0.zzw(this.f12495b[i8] >>> 3, this.f12496c[i8]);
        }
    }

    public final int hashCode() {
        int i8 = this.f12494a;
        int i9 = i8 + 527;
        int[] iArr = this.f12495b;
        int iHashCode = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i8; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = ((i9 * 31) + i10) * 31;
        Object[] objArr = this.f12496c;
        int i13 = this.f12494a;
        for (int i14 = 0; i14 < i13; i14++) {
            iHashCode = (iHashCode * 31) + objArr[i14].hashCode();
        }
        return i12 + iHashCode;
    }

    public final int zza() {
        int iZzD;
        int iZzE;
        int iZzD2;
        int i8 = this.f12497d;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f12494a; i10++) {
            int i11 = this.f12495b[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 == 1) {
                    ((Long) this.f12496c[i10]).longValue();
                    iZzD2 = Dy0.zzD(i12 << 3) + 8;
                } else if (i13 == 2) {
                    int i14 = i12 << 3;
                    AbstractC3677my0 abstractC3677my0 = (AbstractC3677my0) this.f12496c[i10];
                    int iZzD3 = Dy0.zzD(i14);
                    int iZzd = abstractC3677my0.zzd();
                    iZzD2 = iZzD3 + Dy0.zzD(iZzd) + iZzd;
                } else if (i13 == 3) {
                    int iZzD4 = Dy0.zzD(i12 << 3);
                    iZzD = iZzD4 + iZzD4;
                    iZzE = ((CA0) this.f12496c[i10]).zza();
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(C4021pz0.a());
                    }
                    ((Integer) this.f12496c[i10]).intValue();
                    iZzD2 = Dy0.zzD(i12 << 3) + 4;
                }
                i9 += iZzD2;
            } else {
                int i15 = i12 << 3;
                long jLongValue = ((Long) this.f12496c[i10]).longValue();
                iZzD = Dy0.zzD(i15);
                iZzE = Dy0.zzE(jLongValue);
            }
            iZzD2 = iZzD + iZzE;
            i9 += iZzD2;
        }
        this.f12497d = i9;
        return i9;
    }

    public final int zzb() {
        int i8 = this.f12497d;
        if (i8 != -1) {
            return i8;
        }
        int iZzD = 0;
        for (int i9 = 0; i9 < this.f12494a; i9++) {
            int i10 = this.f12495b[i9] >>> 3;
            AbstractC3677my0 abstractC3677my0 = (AbstractC3677my0) this.f12496c[i9];
            int iZzD2 = Dy0.zzD(8);
            int iZzD3 = Dy0.zzD(16) + Dy0.zzD(i10);
            int iZzD4 = Dy0.zzD(24);
            int iZzd = abstractC3677my0.zzd();
            iZzD += iZzD2 + iZzD2 + iZzD3 + iZzD4 + Dy0.zzD(iZzd) + iZzd;
        }
        this.f12497d = iZzD;
        return iZzD;
    }

    public final void zzh() {
        if (this.f12498e) {
            this.f12498e = false;
        }
    }

    public final void zzl(UA0 ua0) {
        if (this.f12494a != 0) {
            for (int i8 = 0; i8 < this.f12494a; i8++) {
                int i9 = this.f12495b[i8];
                Object obj = this.f12496c[i8];
                int i10 = i9 & 7;
                int i11 = i9 >>> 3;
                if (i10 == 0) {
                    ua0.zzt(i11, ((Long) obj).longValue());
                } else if (i10 == 1) {
                    ua0.zzm(i11, ((Long) obj).longValue());
                } else if (i10 == 2) {
                    ua0.zzd(i11, (AbstractC3677my0) obj);
                } else if (i10 == 3) {
                    ua0.zzF(i11);
                    ((CA0) obj).zzl(ua0);
                    ua0.zzh(i11);
                } else {
                    if (i10 != 5) {
                        throw new RuntimeException(C4021pz0.a());
                    }
                    ua0.zzk(i11, ((Integer) obj).intValue());
                }
            }
        }
    }

    private CA0() {
        this(0, new int[8], new Object[8], true);
    }
}
