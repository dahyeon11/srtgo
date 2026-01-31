package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.bO0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2358bO0 implements PO0 {

    /* renamed from: a, reason: collision with root package name */
    protected final TH f18127a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f18128b;

    /* renamed from: c, reason: collision with root package name */
    protected final int[] f18129c;

    /* renamed from: d, reason: collision with root package name */
    private final Q5[] f18130d;

    /* renamed from: e, reason: collision with root package name */
    private int f18131e;

    public C2358bO0(TH th, int[] iArr, int i8) {
        int length = iArr.length;
        F10.zzf(length > 0);
        th.getClass();
        this.f18127a = th;
        this.f18128b = length;
        this.f18130d = new Q5[length];
        for (int i9 = 0; i9 < iArr.length; i9++) {
            this.f18130d[i9] = th.zzb(iArr[i9]);
        }
        Arrays.sort(this.f18130d, new Comparator() { // from class: com.google.android.gms.internal.ads.ZN0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Q5) obj2).zzj - ((Q5) obj).zzj;
            }
        });
        this.f18129c = new int[this.f18128b];
        for (int i10 = 0; i10 < this.f18128b; i10++) {
            this.f18129c[i10] = th.zza(this.f18130d[i10]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2358bO0 c2358bO0 = (C2358bO0) obj;
            if (this.f18127a.equals(c2358bO0.f18127a) && Arrays.equals(this.f18129c, c2358bO0.f18129c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = this.f18131e;
        if (i8 != 0) {
            return i8;
        }
        int iIdentityHashCode = (System.identityHashCode(this.f18127a) * 31) + Arrays.hashCode(this.f18129c);
        this.f18131e = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // com.google.android.gms.internal.ads.PO0, com.google.android.gms.internal.ads.TO0
    public final int zza(int i8) {
        return this.f18129c[i8];
    }

    @Override // com.google.android.gms.internal.ads.PO0, com.google.android.gms.internal.ads.TO0
    public final int zzb(int i8) {
        for (int i9 = 0; i9 < this.f18128b; i9++) {
            if (this.f18129c[i9] == i8) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.PO0, com.google.android.gms.internal.ads.TO0
    public final int zzc() {
        return this.f18129c.length;
    }

    @Override // com.google.android.gms.internal.ads.PO0, com.google.android.gms.internal.ads.TO0
    public final Q5 zzd(int i8) {
        return this.f18130d[i8];
    }

    @Override // com.google.android.gms.internal.ads.PO0, com.google.android.gms.internal.ads.TO0
    public final TH zze() {
        return this.f18127a;
    }
}
