package com.google.android.gms.internal.ads;

import H1.C0534f1;
import H1.InterfaceC0517a;

/* loaded from: classes2.dex */
public final class ZP implements YG, InterfaceC3941pG, CF, VF, InterfaceC0517a, InterfaceC3603mI {

    /* renamed from: a, reason: collision with root package name */
    private final C4775we f17566a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f17567b = false;

    public ZP(C4775we c4775we, C3814o90 c3814o90) {
        this.f17566a = c4775we;
        c4775we.zzb(EnumC5003ye.AD_REQUEST);
        if (c3814o90 != null) {
            c4775we.zzb(EnumC5003ye.REQUEST_IS_PREFETCH);
        }
    }

    @Override // H1.InterfaceC0517a
    public final synchronized void onAdClicked() {
        if (this.f17567b) {
            this.f17566a.zzb(EnumC5003ye.AD_SUBSEQUENT_CLICK);
        } else {
            this.f17566a.zzb(EnumC5003ye.AD_FIRST_CLICK);
            this.f17567b = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.CF
    public final void zzdB(C0534f1 c0534f1) {
        switch (c0534f1.zza) {
            case 1:
                this.f17566a.zzb(EnumC5003ye.AD_FAILED_TO_LOAD_INVALID_REQUEST);
                break;
            case 2:
                this.f17566a.zzb(EnumC5003ye.AD_FAILED_TO_LOAD_NETWORK_ERROR);
                break;
            case 3:
                this.f17566a.zzb(EnumC5003ye.AD_FAILED_TO_LOAD_NO_FILL);
                break;
            case 4:
                this.f17566a.zzb(EnumC5003ye.AD_FAILED_TO_LOAD_TIMEOUT);
                break;
            case 5:
                this.f17566a.zzb(EnumC5003ye.AD_FAILED_TO_LOAD_CANCELLED);
                break;
            case 6:
                this.f17566a.zzb(EnumC5003ye.AD_FAILED_TO_LOAD_NO_ERROR);
                break;
            case 7:
                this.f17566a.zzb(EnumC5003ye.AD_FAILED_TO_LOAD_NOT_FOUND);
                break;
            default:
                this.f17566a.zzb(EnumC5003ye.AD_FAILED_TO_LOAD);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.YG
    public final void zzdn(C2519cr c2519cr) {
    }

    @Override // com.google.android.gms.internal.ads.YG
    public final void zzdo(final C1457Ia0 c1457Ia0) {
        this.f17566a.zzc(new InterfaceC4661ve() { // from class: com.google.android.gms.internal.ads.VP
            @Override // com.google.android.gms.internal.ads.InterfaceC4661ve
            public final void zza(C1713Og c1713Og) {
                C1464Ie c1464Ie = (C1464Ie) c1713Og.zze().zzcZ();
                C5007yg c5007yg = (C5007yg) c1713Og.zze().zzad().zzcZ();
                c5007yg.zzo(c1457Ia0.zzb.zzb.zzb);
                c1464Ie.zzT(c5007yg);
                c1713Og.zzG(c1464Ie);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3603mI
    public final void zzh() {
        this.f17566a.zzb(EnumC5003ye.REQUEST_FAILED_TO_LOAD_FROM_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3603mI
    public final void zzi(final C1957Uf c1957Uf) {
        this.f17566a.zzc(new InterfaceC4661ve() { // from class: com.google.android.gms.internal.ads.YP
            @Override // com.google.android.gms.internal.ads.InterfaceC4661ve
            public final void zza(C1713Og c1713Og) {
                c1713Og.zzJ(c1957Uf);
            }
        });
        this.f17566a.zzb(EnumC5003ye.REQUEST_LOADED_FROM_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3603mI
    public final void zzj(final C1957Uf c1957Uf) {
        this.f17566a.zzc(new InterfaceC4661ve() { // from class: com.google.android.gms.internal.ads.WP
            @Override // com.google.android.gms.internal.ads.InterfaceC4661ve
            public final void zza(C1713Og c1713Og) {
                c1713Og.zzJ(c1957Uf);
            }
        });
        this.f17566a.zzb(EnumC5003ye.REQUEST_SAVED_TO_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3603mI
    public final void zzl(boolean z8) {
        this.f17566a.zzb(z8 ? EnumC5003ye.NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED : EnumC5003ye.NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3603mI
    public final void zzm(final C1957Uf c1957Uf) {
        this.f17566a.zzc(new InterfaceC4661ve() { // from class: com.google.android.gms.internal.ads.XP
            @Override // com.google.android.gms.internal.ads.InterfaceC4661ve
            public final void zza(C1713Og c1713Og) {
                c1713Og.zzJ(c1957Uf);
            }
        });
        this.f17566a.zzb(EnumC5003ye.REQUEST_PREFETCH_INTERCEPTED);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3603mI
    public final void zzn(boolean z8) {
        this.f17566a.zzb(z8 ? EnumC5003ye.REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED : EnumC5003ye.REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED);
    }

    @Override // com.google.android.gms.internal.ads.VF
    public final synchronized void zzr() {
        this.f17566a.zzb(EnumC5003ye.AD_IMPRESSION);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3941pG
    public final void zzs() {
        this.f17566a.zzb(EnumC5003ye.AD_LOADED);
    }
}
