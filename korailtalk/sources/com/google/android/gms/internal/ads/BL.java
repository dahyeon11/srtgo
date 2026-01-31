package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import r2.InterfaceC6172a;

/* loaded from: classes2.dex */
public final class BL extends AbstractBinderC2127Yi {

    /* renamed from: a, reason: collision with root package name */
    private final SL f12270a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC6172a f12271b;

    public BL(SL sl) {
        this.f12270a = sl;
    }

    private static float b(InterfaceC6172a interfaceC6172a) {
        Drawable drawable;
        if (interfaceC6172a == null || (drawable = (Drawable) r2.b.unwrap(interfaceC6172a)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2127Yi, com.google.android.gms.internal.ads.InterfaceC2168Zi
    public final float zze() {
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgv)).booleanValue()) {
            return 0.0f;
        }
        if (this.f12270a.zzb() != 0.0f) {
            return this.f12270a.zzb();
        }
        if (this.f12270a.zzj() != null) {
            try {
                return this.f12270a.zzj().zze();
            } catch (RemoteException e8) {
                L1.n.zzh("Remote exception getting video controller aspect ratio.", e8);
                return 0.0f;
            }
        }
        InterfaceC6172a interfaceC6172a = this.f12271b;
        if (interfaceC6172a != null) {
            return b(interfaceC6172a);
        }
        InterfaceC2503cj interfaceC2503cjZzm = this.f12270a.zzm();
        if (interfaceC2503cjZzm == null) {
            return 0.0f;
        }
        float fZzd = (interfaceC2503cjZzm.zzd() == -1 || interfaceC2503cjZzm.zzc() == -1) ? 0.0f : interfaceC2503cjZzm.zzd() / interfaceC2503cjZzm.zzc();
        return fZzd == 0.0f ? b(interfaceC2503cjZzm.zzf()) : fZzd;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2127Yi, com.google.android.gms.internal.ads.InterfaceC2168Zi
    public final float zzf() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgw)).booleanValue() && this.f12270a.zzj() != null) {
            return this.f12270a.zzj().zzf();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2127Yi, com.google.android.gms.internal.ads.InterfaceC2168Zi
    public final float zzg() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgw)).booleanValue() && this.f12270a.zzj() != null) {
            return this.f12270a.zzj().zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2127Yi, com.google.android.gms.internal.ads.InterfaceC2168Zi
    public final H1.V0 zzh() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgw)).booleanValue()) {
            return this.f12270a.zzj();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2127Yi, com.google.android.gms.internal.ads.InterfaceC2168Zi
    public final InterfaceC6172a zzi() {
        InterfaceC6172a interfaceC6172a = this.f12271b;
        if (interfaceC6172a != null) {
            return interfaceC6172a;
        }
        InterfaceC2503cj interfaceC2503cjZzm = this.f12270a.zzm();
        if (interfaceC2503cjZzm == null) {
            return null;
        }
        return interfaceC2503cjZzm.zzf();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2127Yi, com.google.android.gms.internal.ads.InterfaceC2168Zi
    public final void zzj(InterfaceC6172a interfaceC6172a) {
        this.f12271b = interfaceC6172a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2127Yi, com.google.android.gms.internal.ads.InterfaceC2168Zi
    public final boolean zzk() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgw)).booleanValue()) {
            return this.f12270a.zzaf();
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2127Yi, com.google.android.gms.internal.ads.InterfaceC2168Zi
    public final boolean zzl() {
        return ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgw)).booleanValue() && this.f12270a.zzj() != null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2127Yi, com.google.android.gms.internal.ads.InterfaceC2168Zi
    public final void zzm(C1637Mj c1637Mj) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgw)).booleanValue() && (this.f12270a.zzj() instanceof BinderC1206Bw)) {
            ((BinderC1206Bw) this.f12270a.zzj()).zzv(c1637Mj);
        }
    }
}
