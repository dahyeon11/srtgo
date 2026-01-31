package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.wy0 */
/* loaded from: classes2.dex */
public abstract class AbstractC4816wy0 {

    /* renamed from: d */
    private static volatile int f23570d = 100;
    public static final /* synthetic */ int zzd = 0;

    /* renamed from: a */
    int f23571a;

    /* renamed from: b */
    final int f23572b = f23570d;

    /* renamed from: c */
    C4930xy0 f23573c;

    /* synthetic */ AbstractC4816wy0(AbstractC4702vy0 abstractC4702vy0) {
    }

    static AbstractC4816wy0 a(byte[] bArr, int i8, int i9, boolean z8) {
        C3905oy0 c3905oy0 = new C3905oy0(bArr, i8, i9, z8, null);
        try {
            c3905oy0.zze(i9);
            return c3905oy0;
        } catch (C4021pz0 e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public static int zzF(int i8) {
        return (i8 >>> 1) ^ (-(i8 & 1));
    }

    public static int zzG(int i8, InputStream inputStream) throws IOException {
        if ((i8 & 128) == 0) {
            return i8;
        }
        int i9 = i8 & 127;
        int i10 = 7;
        while (i10 < 32) {
            int i11 = inputStream.read();
            if (i11 == -1) {
                throw C4021pz0.i();
            }
            i9 |= (i11 & 127) << i10;
            if ((i11 & 128) == 0) {
                return i9;
            }
            i10 += 7;
        }
        while (i10 < 64) {
            int i12 = inputStream.read();
            if (i12 == -1) {
                throw C4021pz0.i();
            }
            if ((i12 & 128) == 0) {
                return i9;
            }
            i10 += 7;
        }
        throw C4021pz0.e();
    }

    public static long zzH(long j8) {
        return (j8 >>> 1) ^ (-(1 & j8));
    }

    public static AbstractC4816wy0 zzI(InputStream inputStream, int i8) {
        if (inputStream != null) {
            return new C4360sy0(inputStream, 4096, null);
        }
        byte[] bArr = AbstractC3793nz0.zzd;
        int length = bArr.length;
        return a(bArr, 0, 0, false);
    }

    public abstract void zzA(int i8);

    public abstract boolean zzC();

    public abstract boolean zzD();

    public abstract boolean zzE(int i8);

    public abstract double zzb();

    public abstract float zzc();

    public abstract int zzd();

    public abstract int zze(int i8);

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzk();

    public abstract int zzl();

    public abstract int zzm();

    public abstract int zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract long zzt();

    public abstract long zzu();

    public abstract long zzv();

    public abstract AbstractC3677my0 zzw();

    public abstract String zzx();

    public abstract String zzy();

    public abstract void zzz(int i8);
}
