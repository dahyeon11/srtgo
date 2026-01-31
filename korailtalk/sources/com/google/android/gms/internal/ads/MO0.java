package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class MO0 extends JO0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f14644a;

    /* renamed from: b, reason: collision with root package name */
    private final C4413tO0 f14645b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f14646c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f14647d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f14648e;

    /* renamed from: f, reason: collision with root package name */
    private final int f14649f;

    /* renamed from: g, reason: collision with root package name */
    private final int f14650g;

    /* renamed from: h, reason: collision with root package name */
    private final int f14651h;

    /* renamed from: i, reason: collision with root package name */
    private final int f14652i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f14653j;

    /* renamed from: k, reason: collision with root package name */
    private final int f14654k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f14655l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f14656m;

    /* renamed from: n, reason: collision with root package name */
    private final int f14657n;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MO0(int r5, com.google.android.gms.internal.ads.TH r6, int r7, com.google.android.gms.internal.ads.C4413tO0 r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.MO0.<init>(int, com.google.android.gms.internal.ads.TH, int, com.google.android.gms.internal.ads.tO0, int, int, boolean):void");
    }

    public static /* synthetic */ int zza(MO0 mo0, MO0 mo02) {
        AbstractC1683Nl0 abstractC1683Nl0Zza = (mo0.f14644a && mo0.f14647d) ? NO0.f14908j : NO0.f14908j.zza();
        AbstractC1763Pk0 abstractC1763Pk0Zzk = AbstractC1763Pk0.zzk();
        boolean z8 = mo0.f14645b.zzB;
        return abstractC1763Pk0Zzk.zzd(Integer.valueOf(mo0.f14650g), Integer.valueOf(mo02.f14650g), abstractC1683Nl0Zza).zzd(Integer.valueOf(mo0.f14649f), Integer.valueOf(mo02.f14649f), abstractC1683Nl0Zza).zza();
    }

    public static /* synthetic */ int zzd(MO0 mo0, MO0 mo02) {
        AbstractC1763Pk0 abstractC1763Pk0Zzd = AbstractC1763Pk0.zzk().zze(mo0.f14647d, mo02.f14647d).zzb(mo0.f14652i, mo02.f14652i).zze(mo0.f14653j, mo02.f14653j).zze(mo0.f14648e, mo02.f14648e).zze(mo0.f14644a, mo02.f14644a).zze(mo0.f14646c, mo02.f14646c).zzd(Integer.valueOf(mo0.f14651h), Integer.valueOf(mo02.f14651h), AbstractC1683Nl0.zzc().zza());
        boolean z8 = mo0.f14655l;
        AbstractC1763Pk0 abstractC1763Pk0Zze = abstractC1763Pk0Zzd.zze(z8, mo02.f14655l);
        boolean z9 = mo0.f14656m;
        AbstractC1763Pk0 abstractC1763Pk0Zze2 = abstractC1763Pk0Zze.zze(z9, mo02.f14656m);
        if (z8 && z9) {
            abstractC1763Pk0Zze2 = abstractC1763Pk0Zze2.zzb(mo0.f14657n, mo02.f14657n);
        }
        return abstractC1763Pk0Zze2.zza();
    }

    @Override // com.google.android.gms.internal.ads.JO0
    public final int zzb() {
        return this.f14654k;
    }

    @Override // com.google.android.gms.internal.ads.JO0
    public final /* bridge */ /* synthetic */ boolean zzc(JO0 jo0) {
        MO0 mo0 = (MO0) jo0;
        if (!AbstractC2281am0.zzG(this.zzd.zzn, mo0.zzd.zzn)) {
            return false;
        }
        boolean z8 = this.f14645b.zzL;
        return this.f14655l == mo0.f14655l && this.f14656m == mo0.f14656m;
    }
}
