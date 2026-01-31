package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.my0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3677my0 implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    private static final Comparator f21172b;

    /* renamed from: c, reason: collision with root package name */
    private static final C3563ly0 f21173c;
    public static final AbstractC3677my0 zzb = new C2993gy0(AbstractC3793nz0.zzd);

    /* renamed from: a, reason: collision with root package name */
    private int f21174a = 0;

    static {
        int i8 = Ux0.zza;
        f21173c = new C3563ly0(null);
        f21172b = new C2305ay0();
    }

    AbstractC3677my0() {
    }

    private static AbstractC3677my0 b(Iterator it, int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i8)));
        }
        if (i8 == 1) {
            return (AbstractC3677my0) it.next();
        }
        int i9 = i8 >>> 1;
        AbstractC3677my0 abstractC3677my0B = b(it, i9);
        AbstractC3677my0 abstractC3677my0B2 = b(it, i8 - i9);
        if (Integer.MAX_VALUE - abstractC3677my0B.zzd() >= abstractC3677my0B2.zzd()) {
            return C3246jA0.n(abstractC3677my0B, abstractC3677my0B2);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + abstractC3677my0B.zzd() + "+" + abstractC3677my0B2.zzd());
    }

    static int j(int i8, int i9, int i10) {
        int i11 = i9 - i8;
        if ((i8 | i9 | i11 | (i10 - i9)) >= 0) {
            return i11;
        }
        if (i8 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i8 + " < 0");
        }
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i8 + ", " + i9);
        }
        throw new IndexOutOfBoundsException("End index: " + i9 + " >= " + i10);
    }

    static void l(int i8, int i9) {
        if (((i9 - (i8 + 1)) | i8) < 0) {
            if (i8 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i8);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i8 + ", " + i9);
        }
    }

    public static C3108hy0 zzt() {
        return new C3108hy0(128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AbstractC3677my0 zzu(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = iterable.size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zzb : b(iterable.iterator(), size);
    }

    public static AbstractC3677my0 zzv(byte[] bArr, int i8, int i9) {
        j(i8, i8 + i9, bArr.length);
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, i8, bArr2, 0, i9);
        return new C2993gy0(bArr2);
    }

    public static AbstractC3677my0 zzw(String str) {
        return new C2993gy0(str.getBytes(AbstractC3793nz0.f21377b));
    }

    abstract byte a(int i8);

    protected abstract void c(byte[] bArr, int i8, int i9, int i10);

    protected abstract int d();

    protected abstract boolean e();

    public abstract boolean equals(Object obj);

    protected abstract int f(int i8, int i9, int i10);

    protected abstract int g(int i8, int i9, int i10);

    protected abstract String h(Charset charset);

    public final int hashCode() {
        int iF = this.f21174a;
        if (iF == 0) {
            int iZzd = zzd();
            iF = f(iZzd, 0, iZzd);
            if (iF == 0) {
                iF = 1;
            }
            this.f21174a = iF;
        }
        return iF;
    }

    abstract void i(Yx0 yx0);

    protected final int k() {
        return this.f21174a;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? AbstractC5069zA0.a(this) : AbstractC5069zA0.a(zzk(0, 47)).concat("..."));
    }

    @Deprecated
    public final void zzA(byte[] bArr, int i8, int i9, int i10) {
        j(0, i10, zzd());
        j(i9, i9 + i10, bArr.length);
        if (i10 > 0) {
            c(bArr, 0, i9, i10);
        }
    }

    public final byte[] zzB() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return AbstractC3793nz0.zzd;
        }
        byte[] bArr = new byte[iZzd];
        c(bArr, 0, 0, iZzd);
        return bArr;
    }

    public abstract byte zza(int i8);

    public abstract int zzd();

    public abstract AbstractC3677my0 zzk(int i8, int i9);

    public abstract AbstractC4816wy0 zzl();

    public abstract ByteBuffer zzn();

    public abstract boolean zzp();

    @Override // java.lang.Iterable
    /* renamed from: zzs, reason: merged with bridge method [inline-methods] */
    public InterfaceC2648dy0 iterator() {
        return new Zx0(this);
    }

    public final String zzx(Charset charset) {
        return zzd() == 0 ? "" : h(charset);
    }

    public final String zzy() {
        return zzx(AbstractC3793nz0.f21377b);
    }
}
