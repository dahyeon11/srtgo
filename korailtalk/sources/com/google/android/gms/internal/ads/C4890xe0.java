package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.xe0 */
/* loaded from: classes2.dex */
public final class C4890xe0 extends AbstractC4434te0 {

    /* renamed from: a */
    private final C4662ve0 f23769a;

    /* renamed from: b */
    private final C4548ue0 f23770b;

    /* renamed from: d */
    private C1344Ff0 f23772d;

    /* renamed from: e */
    private C2611df0 f23773e;

    /* renamed from: h */
    private final String f23776h;

    /* renamed from: c */
    private final C1915Te0 f23771c = new C1915Te0();

    /* renamed from: f */
    private boolean f23774f = false;

    /* renamed from: g */
    private boolean f23775g = false;

    C4890xe0(C4548ue0 c4548ue0, C4662ve0 c4662ve0, String str) {
        this.f23770b = c4548ue0;
        this.f23769a = c4662ve0;
        this.f23776h = str;
        a(null);
        if (c4662ve0.zzd() == EnumC4776we0.HTML || c4662ve0.zzd() == EnumC4776we0.JAVASCRIPT) {
            this.f23773e = new C2725ef0(str, c4662ve0.zza());
        } else {
            this.f23773e = new C3070hf0(str, c4662ve0.zzi(), null);
        }
        this.f23773e.zzn();
        C1751Pe0.zza().zzd(this);
        this.f23773e.zzf(c4548ue0);
    }

    private final void a(View view) {
        this.f23772d = new C1344Ff0(view);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4434te0
    public final void zzb(View view, EnumC1137Ae0 enumC1137Ae0, String str) {
        if (this.f23775g) {
            return;
        }
        this.f23771c.zzb(view, enumC1137Ae0, "Ad overlay");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4434te0
    public final void zzc() {
        if (this.f23775g) {
            return;
        }
        this.f23772d.clear();
        if (!this.f23775g) {
            this.f23771c.zzc();
        }
        this.f23775g = true;
        this.f23773e.zze();
        C1751Pe0.zza().zze(this);
        this.f23773e.zzc();
        this.f23773e = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4434te0
    public final void zzd(View view) {
        if (this.f23775g || zzf() == view) {
            return;
        }
        a(view);
        this.f23773e.zzb();
        Collection<C4890xe0> collectionZzc = C1751Pe0.zza().zzc();
        if (collectionZzc == null || collectionZzc.isEmpty()) {
            return;
        }
        for (C4890xe0 c4890xe0 : collectionZzc) {
            if (c4890xe0 != this && c4890xe0.zzf() == view) {
                c4890xe0.f23772d.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4434te0
    public final void zze() {
        if (this.f23774f) {
            return;
        }
        this.f23774f = true;
        C1751Pe0.zza().zzf(this);
        this.f23773e.zzl(C2079Xe0.zzb().zza());
        this.f23773e.zzg(C1669Ne0.zza().zzb());
        this.f23773e.zzi(this, this.f23769a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zzf() {
        return (View) this.f23772d.get();
    }

    public final C2611df0 zzg() {
        return this.f23773e;
    }

    public final String zzh() {
        return this.f23776h;
    }

    public final List zzi() {
        return this.f23771c.zza();
    }

    public final boolean zzj() {
        return this.f23774f && !this.f23775g;
    }
}
