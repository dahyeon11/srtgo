package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class GO0 extends JO0 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final int f13139a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f13140b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f13141c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f13142d;

    /* renamed from: e, reason: collision with root package name */
    private final int f13143e;

    /* renamed from: f, reason: collision with root package name */
    private final int f13144f;

    /* renamed from: g, reason: collision with root package name */
    private final int f13145g;

    /* renamed from: h, reason: collision with root package name */
    private final int f13146h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f13147i;

    public GO0(int i8, TH th, int i9, C4413tO0 c4413tO0, int i10, String str) {
        int iE;
        super(i8, th, i9);
        int i11 = 0;
        this.f13140b = NO0.i(i10, false);
        int i12 = this.zzd.zzf;
        int i13 = c4413tO0.zzy;
        this.f13141c = 1 == (i12 & 1);
        this.f13142d = (i12 & 2) != 0;
        AbstractC2394bl0 abstractC2394bl0Zzn = c4413tO0.zzw.isEmpty() ? AbstractC2394bl0.zzn("") : c4413tO0.zzw;
        int i14 = 0;
        while (true) {
            if (i14 >= abstractC2394bl0Zzn.size()) {
                i14 = Integer.MAX_VALUE;
                iE = 0;
                break;
            } else {
                iE = NO0.e(this.zzd, (String) abstractC2394bl0Zzn.get(i14), false);
                if (iE > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.f13143e = i14;
        this.f13144f = iE;
        int iD = NO0.d(this.zzd.zzg, c4413tO0.zzx);
        this.f13145g = iD;
        this.f13147i = (this.zzd.zzg & 1088) != 0;
        int iE2 = NO0.e(this.zzd, str, NO0.g(str) == null);
        this.f13146h = iE2;
        boolean z8 = iE > 0 || (c4413tO0.zzw.isEmpty() && iD > 0) || this.f13141c || (this.f13142d && iE2 > 0);
        if (NO0.i(i10, c4413tO0.zzT) && z8) {
            i11 = 1;
        }
        this.f13139a = i11;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(GO0 go0) {
        AbstractC1763Pk0 abstractC1763Pk0Zzb = AbstractC1763Pk0.zzk().zze(this.f13140b, go0.f13140b).zzd(Integer.valueOf(this.f13143e), Integer.valueOf(go0.f13143e), AbstractC1683Nl0.zzc().zza()).zzb(this.f13144f, go0.f13144f).zzb(this.f13145g, go0.f13145g).zze(this.f13141c, go0.f13141c).zzd(Boolean.valueOf(this.f13142d), Boolean.valueOf(go0.f13142d), this.f13144f == 0 ? AbstractC1683Nl0.zzc() : AbstractC1683Nl0.zzc().zza()).zzb(this.f13146h, go0.f13146h);
        if (this.f13145g == 0) {
            abstractC1763Pk0Zzb = abstractC1763Pk0Zzb.zzf(this.f13147i, go0.f13147i);
        }
        return abstractC1763Pk0Zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.JO0
    public final int zzb() {
        return this.f13139a;
    }

    @Override // com.google.android.gms.internal.ads.JO0
    public final /* bridge */ /* synthetic */ boolean zzc(JO0 jo0) {
        return false;
    }
}
