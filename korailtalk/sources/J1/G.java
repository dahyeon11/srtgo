package J1;

import H1.InterfaceC0517a;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AbstractBinderC1854Rp;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.DJ;
import r2.InterfaceC6172a;

/* loaded from: classes.dex */
public final class G extends AbstractBinderC1854Rp {

    /* renamed from: a, reason: collision with root package name */
    private final AdOverlayInfoParcel f2539a;

    /* renamed from: b, reason: collision with root package name */
    private final Activity f2540b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2541c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2542d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2543e = false;

    public G(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f2539a = adOverlayInfoParcel;
        this.f2540b = activity;
    }

    private final synchronized void zzb() {
        try {
            if (this.f2542d) {
                return;
            }
            w wVar = this.f2539a.zzc;
            if (wVar != null) {
                wVar.zzdu(4);
            }
            this.f2542d = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final boolean zzH() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzl(Bundle bundle) {
        w wVar;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zziS)).booleanValue() && !this.f2543e) {
            this.f2540b.requestWindowFeature(1);
        }
        boolean z8 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z8 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2539a;
        if (adOverlayInfoParcel == null) {
            this.f2540b.finish();
            return;
        }
        if (z8) {
            this.f2540b.finish();
            return;
        }
        if (bundle == null) {
            InterfaceC0517a interfaceC0517a = adOverlayInfoParcel.zzb;
            if (interfaceC0517a != null) {
                interfaceC0517a.onAdClicked();
            }
            DJ dj = this.f2539a.zzu;
            if (dj != null) {
                dj.zzdG();
            }
            if (this.f2540b.getIntent() != null && this.f2540b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (wVar = this.f2539a.zzc) != null) {
                wVar.zzdr();
            }
        }
        Activity activity = this.f2540b;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f2539a;
        G1.u.zzh();
        j jVar = adOverlayInfoParcel2.zza;
        if (C0618a.zzb(activity, jVar, adOverlayInfoParcel2.zzi, jVar.zzi)) {
            return;
        }
        this.f2540b.finish();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzm() {
        if (this.f2540b.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzo() {
        w wVar = this.f2539a.zzc;
        if (wVar != null) {
            wVar.zzdk();
        }
        if (this.f2540b.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzr() {
        if (this.f2541c) {
            this.f2540b.finish();
            return;
        }
        this.f2541c = true;
        w wVar = this.f2539a.zzc;
        if (wVar != null) {
            wVar.zzdH();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f2541c);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzu() {
        if (this.f2540b.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzv() {
        w wVar = this.f2539a.zzc;
        if (wVar != null) {
            wVar.zzdt();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzx() {
        this.f2543e = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzt() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzk(InterfaceC6172a interfaceC6172a) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzh(int i8, int i9, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzp(int i8, String[] strArr, int[] iArr) {
    }
}
