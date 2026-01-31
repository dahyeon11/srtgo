package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class SN0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2394bl0 f16276a;

    /* renamed from: b, reason: collision with root package name */
    private int f16277b;
    public final int zzc;
    public static final SN0 zza = new SN0(new TH[0]);

    /* renamed from: c, reason: collision with root package name */
    private static final String f16275c = Integer.toString(0, 36);

    @Deprecated
    public static final RG0 zzb = new RG0() { // from class: com.google.android.gms.internal.ads.QN0
    };

    public SN0(TH... thArr) {
        this.f16276a = AbstractC2394bl0.zzl(thArr);
        this.zzc = thArr.length;
        int i8 = 0;
        while (i8 < this.f16276a.size()) {
            int i9 = i8 + 1;
            for (int i10 = i9; i10 < this.f16276a.size(); i10++) {
                if (((TH) this.f16276a.get(i8)).equals(this.f16276a.get(i10))) {
                    AbstractC2834fc0.zzd("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i8 = i9;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SN0.class == obj.getClass()) {
            SN0 sn0 = (SN0) obj;
            if (this.zzc == sn0.zzc && this.f16276a.equals(sn0.f16276a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = this.f16277b;
        if (i8 != 0) {
            return i8;
        }
        int iHashCode = this.f16276a.hashCode();
        this.f16277b = iHashCode;
        return iHashCode;
    }

    public final int zza(TH th) {
        int iIndexOf = this.f16276a.indexOf(th);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final TH zzb(int i8) {
        return (TH) this.f16276a.get(i8);
    }

    public final AbstractC2394bl0 zzc() {
        return AbstractC2394bl0.zzk(AbstractC4220rl0.zzb(this.f16276a, new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.RN0
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                SN0 sn0 = SN0.zza;
                return Integer.valueOf(((TH) obj).zzd);
            }
        }));
    }
}
