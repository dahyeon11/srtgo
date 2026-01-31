package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.jA0 */
/* loaded from: classes2.dex */
final class C3246jA0 extends AbstractC3677my0 {

    /* renamed from: i */
    static final int[] f20201i = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: d */
    private final int f20202d;

    /* renamed from: e */
    private final AbstractC3677my0 f20203e;

    /* renamed from: f */
    private final AbstractC3677my0 f20204f;

    /* renamed from: g */
    private final int f20205g;

    /* renamed from: h */
    private final int f20206h;

    /* synthetic */ C3246jA0(AbstractC3677my0 abstractC3677my0, AbstractC3677my0 abstractC3677my02, AbstractC3133iA0 abstractC3133iA0) {
        this(abstractC3677my0, abstractC3677my02);
    }

    static AbstractC3677my0 n(AbstractC3677my0 abstractC3677my0, AbstractC3677my0 abstractC3677my02) {
        if (abstractC3677my02.zzd() == 0) {
            return abstractC3677my0;
        }
        if (abstractC3677my0.zzd() == 0) {
            return abstractC3677my02;
        }
        int iZzd = abstractC3677my0.zzd() + abstractC3677my02.zzd();
        if (iZzd < 128) {
            return o(abstractC3677my0, abstractC3677my02);
        }
        if (abstractC3677my0 instanceof C3246jA0) {
            C3246jA0 c3246jA0 = (C3246jA0) abstractC3677my0;
            if (c3246jA0.f20204f.zzd() + abstractC3677my02.zzd() < 128) {
                return new C3246jA0(c3246jA0.f20203e, o(c3246jA0.f20204f, abstractC3677my02));
            }
            if (c3246jA0.f20203e.d() > c3246jA0.f20204f.d() && c3246jA0.f20206h > abstractC3677my02.d()) {
                return new C3246jA0(c3246jA0.f20203e, new C3246jA0(c3246jA0.f20204f, abstractC3677my02));
            }
        }
        return iZzd >= p(Math.max(abstractC3677my0.d(), abstractC3677my02.d()) + 1) ? new C3246jA0(abstractC3677my0, abstractC3677my02) : C2788fA0.a(new C2788fA0(null), abstractC3677my0, abstractC3677my02);
    }

    private static AbstractC3677my0 o(AbstractC3677my0 abstractC3677my0, AbstractC3677my0 abstractC3677my02) {
        int iZzd = abstractC3677my0.zzd();
        int iZzd2 = abstractC3677my02.zzd();
        byte[] bArr = new byte[iZzd + iZzd2];
        abstractC3677my0.zzA(bArr, 0, 0, iZzd);
        abstractC3677my02.zzA(bArr, 0, iZzd, iZzd2);
        return new C2993gy0(bArr);
    }

    static int p(int i8) {
        int[] iArr = f20201i;
        int length = iArr.length;
        if (i8 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i8];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    final byte a(int i8) {
        int i9 = this.f20205g;
        return i8 < i9 ? this.f20203e.a(i8) : this.f20204f.a(i8 - i9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    protected final void c(byte[] bArr, int i8, int i9, int i10) {
        int i11 = i8 + i10;
        int i12 = this.f20205g;
        if (i11 <= i12) {
            this.f20203e.c(bArr, i8, i9, i10);
        } else {
            if (i8 >= i12) {
                this.f20204f.c(bArr, i8 - i12, i9, i10);
                return;
            }
            int i13 = i12 - i8;
            this.f20203e.c(bArr, i8, i9, i13);
            this.f20204f.c(bArr, 0, i9 + i13, i10 - i13);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    protected final int d() {
        return this.f20206h;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    protected final boolean e() {
        return this.f20202d >= p(this.f20206h);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3677my0)) {
            return false;
        }
        AbstractC3677my0 abstractC3677my0 = (AbstractC3677my0) obj;
        if (this.f20202d != abstractC3677my0.zzd()) {
            return false;
        }
        if (this.f20202d == 0) {
            return true;
        }
        int iK = k();
        int iK2 = abstractC3677my0.k();
        if (iK != 0 && iK2 != 0 && iK != iK2) {
            return false;
        }
        C3018hA0 c3018hA0 = new C3018hA0(this, null);
        AbstractC2878fy0 next = c3018hA0.next();
        C3018hA0 c3018hA02 = new C3018hA0(abstractC3677my0, null);
        AbstractC2878fy0 next2 = c3018hA02.next();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int iZzd = next.zzd() - i8;
            int iZzd2 = next2.zzd() - i9;
            int iMin = Math.min(iZzd, iZzd2);
            if (!(i8 == 0 ? next.m(next2, i9, iMin) : next2.m(next, i8, iMin))) {
                return false;
            }
            i10 += iMin;
            int i11 = this.f20202d;
            if (i10 >= i11) {
                if (i10 == i11) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzd) {
                next = c3018hA0.next();
                i8 = 0;
            } else {
                i8 += iMin;
                next = next;
            }
            if (iMin == iZzd2) {
                next2 = c3018hA02.next();
                i9 = 0;
            } else {
                i9 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    protected final int f(int i8, int i9, int i10) {
        int i11 = i9 + i10;
        int i12 = this.f20205g;
        if (i11 <= i12) {
            return this.f20203e.f(i8, i9, i10);
        }
        if (i9 >= i12) {
            return this.f20204f.f(i8, i9 - i12, i10);
        }
        int i13 = i12 - i9;
        return this.f20204f.f(this.f20203e.f(i8, i9, i13), 0, i10 - i13);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    protected final int g(int i8, int i9, int i10) {
        int i11 = i9 + i10;
        int i12 = this.f20205g;
        if (i11 <= i12) {
            return this.f20203e.g(i8, i9, i10);
        }
        if (i9 >= i12) {
            return this.f20204f.g(i8, i9 - i12, i10);
        }
        int i13 = i12 - i9;
        return this.f20204f.g(this.f20203e.g(i8, i9, i13), 0, i10 - i13);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    protected final String h(Charset charset) {
        return new String(zzB(), charset);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    final void i(Yx0 yx0) {
        this.f20203e.i(yx0);
        this.f20204f.i(yx0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C2559dA0(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    public final byte zza(int i8) {
        AbstractC3677my0.l(i8, this.f20202d);
        return a(i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    public final int zzd() {
        return this.f20202d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    public final AbstractC3677my0 zzk(int i8, int i9) {
        int iJ = AbstractC3677my0.j(i8, i9, this.f20202d);
        if (iJ == 0) {
            return AbstractC3677my0.zzb;
        }
        if (iJ == this.f20202d) {
            return this;
        }
        int i10 = this.f20205g;
        if (i9 <= i10) {
            return this.f20203e.zzk(i8, i9);
        }
        if (i8 >= i10) {
            return this.f20204f.zzk(i8 - i10, i9 - i10);
        }
        AbstractC3677my0 abstractC3677my0 = this.f20203e;
        return new C3246jA0(abstractC3677my0.zzk(i8, abstractC3677my0.zzd()), this.f20204f.zzk(0, i9 - this.f20205g));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    public final AbstractC4816wy0 zzl() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        C3018hA0 c3018hA0 = new C3018hA0(this, null);
        while (c3018hA0.hasNext()) {
            arrayList.add(c3018hA0.next().zzn());
        }
        int i8 = AbstractC4816wy0.zzd;
        int i9 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            iRemaining += byteBuffer.remaining();
            i9 = byteBuffer.hasArray() ? i9 | 1 : byteBuffer.isDirect() ? i9 | 2 : i9 | 4;
        }
        return i9 == 2 ? new C4133qy0(arrayList, iRemaining, true, null) : AbstractC4816wy0.zzI(new C4135qz0(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    public final ByteBuffer zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    public final boolean zzp() {
        AbstractC3677my0 abstractC3677my0 = this.f20203e;
        AbstractC3677my0 abstractC3677my02 = this.f20204f;
        return abstractC3677my02.g(abstractC3677my0.g(0, 0, this.f20205g), 0, abstractC3677my02.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3677my0
    /* renamed from: zzs */
    public final InterfaceC2648dy0 iterator() {
        return new C2559dA0(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    C3246jA0(AbstractC3677my0 abstractC3677my0, AbstractC3677my0 abstractC3677my02) {
        this.f20203e = abstractC3677my0;
        this.f20204f = abstractC3677my02;
        int iZzd = abstractC3677my0.zzd();
        this.f20205g = iZzd;
        this.f20202d = iZzd + abstractC3677my02.zzd();
        this.f20206h = Math.max(abstractC3677my0.d(), abstractC3677my02.d()) + 1;
    }
}
