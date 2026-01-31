package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.mO0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3616mO0 extends JO0 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final int f20900a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20901b;

    /* renamed from: c, reason: collision with root package name */
    private final String f20902c;

    /* renamed from: d, reason: collision with root package name */
    private final C4413tO0 f20903d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f20904e;

    /* renamed from: f, reason: collision with root package name */
    private final int f20905f;

    /* renamed from: g, reason: collision with root package name */
    private final int f20906g;

    /* renamed from: h, reason: collision with root package name */
    private final int f20907h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f20908i;

    /* renamed from: j, reason: collision with root package name */
    private final int f20909j;

    /* renamed from: k, reason: collision with root package name */
    private final int f20910k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f20911l;

    /* renamed from: m, reason: collision with root package name */
    private final int f20912m;

    /* renamed from: n, reason: collision with root package name */
    private final int f20913n;

    /* renamed from: o, reason: collision with root package name */
    private final int f20914o;

    /* renamed from: p, reason: collision with root package name */
    private final int f20915p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f20916q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f20917r;

    public C3616mO0(int i8, TH th, int i9, C4413tO0 c4413tO0, int i10, boolean z8, InterfaceC1229Cj0 interfaceC1229Cj0, int i11) {
        int i12;
        int iE;
        int iE2;
        boolean z9;
        super(i8, th, i9);
        this.f20903d = c4413tO0;
        int i13 = 1;
        int i14 = true != c4413tO0.zzR ? 16 : 24;
        this.f20902c = NO0.g(this.zzd.zze);
        this.f20904e = NO0.i(i10, false);
        int i15 = 0;
        while (true) {
            i12 = Integer.MAX_VALUE;
            if (i15 >= c4413tO0.zzq.size()) {
                iE = 0;
                i15 = Integer.MAX_VALUE;
                break;
            } else {
                iE = NO0.e(this.zzd, (String) c4413tO0.zzq.get(i15), false);
                if (iE > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.f20906g = i15;
        this.f20905f = iE;
        this.f20907h = NO0.d(this.zzd.zzg, 0);
        Q5 q52 = this.zzd;
        int i16 = q52.zzg;
        this.f20908i = i16 == 0 || (i16 & 1) != 0;
        this.f20911l = 1 == (q52.zzf & 1);
        this.f20912m = q52.zzA;
        this.f20913n = q52.zzB;
        this.f20914o = q52.zzj;
        this.f20901b = interfaceC1229Cj0.zza(q52);
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] strArrSplit = AbstractC2281am0.zza >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
        for (int i17 = 0; i17 < strArrSplit.length; i17++) {
            strArrSplit[i17] = AbstractC2281am0.zzD(strArrSplit[i17]);
        }
        int i18 = 0;
        while (true) {
            if (i18 >= strArrSplit.length) {
                iE2 = 0;
                i18 = Integer.MAX_VALUE;
                break;
            } else {
                iE2 = NO0.e(this.zzd, strArrSplit[i18], false);
                if (iE2 > 0) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        this.f20909j = i18;
        this.f20910k = iE2;
        int i19 = 0;
        while (true) {
            if (i19 >= c4413tO0.zzu.size()) {
                break;
            }
            String str = this.zzd.zzn;
            if (str != null && str.equals(c4413tO0.zzu.get(i19))) {
                i12 = i19;
                break;
            }
            i19++;
        }
        this.f20915p = i12;
        this.f20916q = (i10 & 384) == 128;
        this.f20917r = (i10 & 64) == 64;
        C4413tO0 c4413tO02 = this.f20903d;
        if (!NO0.i(i10, c4413tO02.zzT) || (!(z9 = this.f20901b) && !c4413tO02.zzM)) {
            i13 = 0;
        } else if (NO0.i(i10, false) && z9 && this.zzd.zzj != -1 && ((c4413tO02.zzV || !z8) && (i14 & i10) != 0)) {
            i13 = 2;
        }
        this.f20900a = i13;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3616mO0 c3616mO0) {
        AbstractC1683Nl0 abstractC1683Nl0Zza = (this.f20901b && this.f20904e) ? NO0.f14908j : NO0.f14908j.zza();
        AbstractC1763Pk0 abstractC1763Pk0Zzd = AbstractC1763Pk0.zzk().zze(this.f20904e, c3616mO0.f20904e).zzd(Integer.valueOf(this.f20906g), Integer.valueOf(c3616mO0.f20906g), AbstractC1683Nl0.zzc().zza()).zzb(this.f20905f, c3616mO0.f20905f).zzb(this.f20907h, c3616mO0.f20907h).zze(this.f20911l, c3616mO0.f20911l).zze(this.f20908i, c3616mO0.f20908i).zzd(Integer.valueOf(this.f20909j), Integer.valueOf(c3616mO0.f20909j), AbstractC1683Nl0.zzc().zza()).zzb(this.f20910k, c3616mO0.f20910k).zze(this.f20901b, c3616mO0.f20901b).zzd(Integer.valueOf(this.f20915p), Integer.valueOf(c3616mO0.f20915p), AbstractC1683Nl0.zzc().zza());
        boolean z8 = this.f20903d.zzB;
        AbstractC1763Pk0 abstractC1763Pk0Zzd2 = abstractC1763Pk0Zzd.zze(this.f20916q, c3616mO0.f20916q).zze(this.f20917r, c3616mO0.f20917r).zzd(Integer.valueOf(this.f20912m), Integer.valueOf(c3616mO0.f20912m), abstractC1683Nl0Zza).zzd(Integer.valueOf(this.f20913n), Integer.valueOf(c3616mO0.f20913n), abstractC1683Nl0Zza);
        if (AbstractC2281am0.zzG(this.f20902c, c3616mO0.f20902c)) {
            abstractC1763Pk0Zzd2 = abstractC1763Pk0Zzd2.zzd(Integer.valueOf(this.f20914o), Integer.valueOf(c3616mO0.f20914o), abstractC1683Nl0Zza);
        }
        return abstractC1763Pk0Zzd2.zza();
    }

    @Override // com.google.android.gms.internal.ads.JO0
    public final int zzb() {
        return this.f20900a;
    }

    @Override // com.google.android.gms.internal.ads.JO0
    public final /* bridge */ /* synthetic */ boolean zzc(JO0 jo0) {
        String str;
        C3616mO0 c3616mO0 = (C3616mO0) jo0;
        boolean z8 = this.f20903d.zzP;
        Q5 q52 = this.zzd;
        int i8 = q52.zzA;
        if (i8 == -1) {
            return false;
        }
        Q5 q53 = c3616mO0.zzd;
        if (i8 != q53.zzA || (str = q52.zzn) == null || !TextUtils.equals(str, q53.zzn)) {
            return false;
        }
        boolean z9 = this.f20903d.zzO;
        int i9 = this.zzd.zzB;
        return i9 != -1 && i9 == c3616mO0.zzd.zzB && this.f20916q == c3616mO0.f20916q && this.f20917r == c3616mO0.f20917r;
    }
}
