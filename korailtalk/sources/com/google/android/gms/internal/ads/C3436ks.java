package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.ks, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3436ks {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20480a = Integer.toString(0, 36);

    /* renamed from: b, reason: collision with root package name */
    private static final String f20481b = Integer.toString(1, 36);

    /* renamed from: c, reason: collision with root package name */
    private static final String f20482c = Integer.toString(2, 36);

    /* renamed from: d, reason: collision with root package name */
    private static final String f20483d = Integer.toString(3, 36);

    /* renamed from: e, reason: collision with root package name */
    private static final String f20484e = Integer.toString(4, 36);

    /* renamed from: f, reason: collision with root package name */
    private static final String f20485f = Integer.toString(5, 36);

    /* renamed from: g, reason: collision with root package name */
    private static final String f20486g = Integer.toString(6, 36);

    /* renamed from: h, reason: collision with root package name */
    private static final String f20487h = Integer.toString(7, 36);

    /* renamed from: i, reason: collision with root package name */
    static final String f20488i = Integer.toString(8, 36);

    @Deprecated
    public static final RG0 zzb = new RG0() { // from class: com.google.android.gms.internal.ads.Gc
    };
    public final long zzc;
    public final int zzd;

    @Deprecated
    public final Uri[] zze;
    public final C3658mp[] zzf;
    public final int[] zzg;
    public final long[] zzh;
    public final long zzi;
    public final boolean zzj;

    public C3436ks(long j8) {
        this(0L, -1, -1, new int[0], new C3658mp[0], new long[0], 0L, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3436ks.class == obj.getClass()) {
            C3436ks c3436ks = (C3436ks) obj;
            if (this.zzd == c3436ks.zzd && Arrays.equals(this.zzf, c3436ks.zzf) && Arrays.equals(this.zzg, c3436ks.zzg) && Arrays.equals(this.zzh, c3436ks.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd * 31) - 1) * 961) + Arrays.hashCode(this.zzf)) * 31) + Arrays.hashCode(this.zzg)) * 31) + Arrays.hashCode(this.zzh)) * 961;
    }

    public final int zza(int i8) {
        int i9;
        int i10 = i8 + 1;
        while (true) {
            int[] iArr = this.zzg;
            if (i10 >= iArr.length || (i9 = iArr[i10]) == 0 || i9 == 1) {
                break;
            }
            i10++;
        }
        return i10;
    }

    public final C3436ks zzb(int i8) {
        int[] iArr = this.zzg;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.zzh;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        return new C3436ks(0L, 0, -1, iArrCopyOf, (C3658mp[]) Arrays.copyOf(this.zzf, 0), jArrCopyOf, 0L, false);
    }

    private C3436ks(long j8, int i8, int i9, int[] iArr, C3658mp[] c3658mpArr, long[] jArr, long j9, boolean z8) {
        Uri uri;
        int length = iArr.length;
        int length2 = c3658mpArr.length;
        int i10 = 0;
        F10.zzd(length == length2);
        this.zzc = 0L;
        this.zzd = i8;
        this.zzg = iArr;
        this.zzf = c3658mpArr;
        this.zzh = jArr;
        this.zzi = 0L;
        this.zzj = false;
        this.zze = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.zze;
            if (i10 >= uriArr.length) {
                return;
            }
            C3658mp c3658mp = c3658mpArr[i10];
            if (c3658mp == null) {
                uri = null;
            } else {
                C1478Il c1478Il = c3658mp.zzd;
                c1478Il.getClass();
                uri = c1478Il.zzb;
            }
            uriArr[i10] = uri;
            i10++;
        }
    }
}
