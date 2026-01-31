package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* renamed from: com.google.android.gms.internal.ads.Ob0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1704Ob0 extends AbstractC5814a {
    public static final Parcelable.Creator<C1704Ob0> CREATOR = new C1745Pb0();

    /* renamed from: a, reason: collision with root package name */
    private final EnumC1582Lb0[] f15135a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15136b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15137c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15138d;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f15139e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f15140f;
    public final Context zza;
    public final EnumC1582Lb0 zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;

    public C1704Ob0(int i8, int i9, int i10, int i11, String str, int i12, int i13) {
        EnumC1582Lb0[] enumC1582Lb0ArrValues = EnumC1582Lb0.values();
        this.f15135a = enumC1582Lb0ArrValues;
        int[] iArrZza = AbstractC1622Mb0.zza();
        this.f15139e = iArrZza;
        int[] iArrZza2 = AbstractC1663Nb0.zza();
        this.f15140f = iArrZza2;
        this.zza = null;
        this.f15136b = i8;
        this.zzb = enumC1582Lb0ArrValues[i8];
        this.zzc = i9;
        this.zzd = i10;
        this.zze = i11;
        this.zzf = str;
        this.f15137c = i12;
        this.zzg = iArrZza[i12];
        this.f15138d = i13;
        int i14 = iArrZza2[i13];
    }

    public static C1704Ob0 zza(EnumC1582Lb0 enumC1582Lb0, Context context) {
        if (enumC1582Lb0 == EnumC1582Lb0.Rewarded) {
            return new C1704Ob0(context, enumC1582Lb0, ((Integer) H1.C.zzc().zza(AbstractC4439th.zzgC)).intValue(), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzgI)).intValue(), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzgK)).intValue(), (String) H1.C.zzc().zza(AbstractC4439th.zzgM), (String) H1.C.zzc().zza(AbstractC4439th.zzgE), (String) H1.C.zzc().zza(AbstractC4439th.zzgG));
        }
        if (enumC1582Lb0 == EnumC1582Lb0.Interstitial) {
            return new C1704Ob0(context, enumC1582Lb0, ((Integer) H1.C.zzc().zza(AbstractC4439th.zzgD)).intValue(), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzgJ)).intValue(), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzgL)).intValue(), (String) H1.C.zzc().zza(AbstractC4439th.zzgN), (String) H1.C.zzc().zza(AbstractC4439th.zzgF), (String) H1.C.zzc().zza(AbstractC4439th.zzgH));
        }
        if (enumC1582Lb0 != EnumC1582Lb0.AppOpen) {
            return null;
        }
        return new C1704Ob0(context, enumC1582Lb0, ((Integer) H1.C.zzc().zza(AbstractC4439th.zzgQ)).intValue(), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzgS)).intValue(), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzgT)).intValue(), (String) H1.C.zzc().zza(AbstractC4439th.zzgO), (String) H1.C.zzc().zza(AbstractC4439th.zzgP), (String) H1.C.zzc().zza(AbstractC4439th.zzgR));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f15136b;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, i9);
        AbstractC5816c.writeInt(parcel, 2, this.zzc);
        AbstractC5816c.writeInt(parcel, 3, this.zzd);
        AbstractC5816c.writeInt(parcel, 4, this.zze);
        AbstractC5816c.writeString(parcel, 5, this.zzf, false);
        AbstractC5816c.writeInt(parcel, 6, this.f15137c);
        AbstractC5816c.writeInt(parcel, 7, this.f15138d);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private C1704Ob0(Context context, EnumC1582Lb0 enumC1582Lb0, int i8, int i9, int i10, String str, String str2, String str3) {
        int i11;
        this.f15135a = EnumC1582Lb0.values();
        this.f15139e = AbstractC1622Mb0.zza();
        this.f15140f = AbstractC1663Nb0.zza();
        this.zza = context;
        this.f15136b = enumC1582Lb0.ordinal();
        this.zzb = enumC1582Lb0;
        this.zzc = i8;
        this.zzd = i9;
        this.zze = i10;
        this.zzf = str;
        if ("oldest".equals(str2)) {
            i11 = 1;
        } else {
            i11 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.zzg = i11;
        this.f15137c = i11 - 1;
        "onAdClosed".equals(str3);
        this.f15138d = 0;
    }
}
