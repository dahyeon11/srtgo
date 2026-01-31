package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import i2.AbstractC5683p;

/* renamed from: com.google.android.gms.internal.ads.ju */
/* loaded from: classes2.dex */
public final class C3326ju {

    /* renamed from: a */
    private final Context f20328a;

    /* renamed from: b */
    private final InterfaceC4579uu f20329b;

    /* renamed from: c */
    private final ViewGroup f20330c;

    /* renamed from: d */
    private C3212iu f20331d;

    public C3326ju(Context context, ViewGroup viewGroup, InterfaceC2065Wv interfaceC2065Wv) {
        this.f20328a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f20330c = viewGroup;
        this.f20329b = interfaceC2065Wv;
        this.f20331d = null;
    }

    public final C3212iu zza() {
        return this.f20331d;
    }

    public final Integer zzb() {
        C3212iu c3212iu = this.f20331d;
        if (c3212iu != null) {
            return c3212iu.zzl();
        }
        return null;
    }

    public final void zzc(int i8, int i9, int i10, int i11) {
        AbstractC5683p.checkMainThread("The underlay may only be modified from the UI thread.");
        C3212iu c3212iu = this.f20331d;
        if (c3212iu != null) {
            c3212iu.zzF(i8, i9, i10, i11);
        }
    }

    public final void zzd(int i8, int i9, int i10, int i11, int i12, boolean z8, C4465tu c4465tu) {
        if (this.f20331d != null) {
            return;
        }
        AbstractC1142Ah.zza(this.f20329b.zzm().zza(), this.f20329b.zzk(), "vpr2");
        Context context = this.f20328a;
        InterfaceC4579uu interfaceC4579uu = this.f20329b;
        C3212iu c3212iu = new C3212iu(context, interfaceC4579uu, i12, z8, interfaceC4579uu.zzm().zza(), c4465tu);
        this.f20331d = c3212iu;
        this.f20330c.addView(c3212iu, 0, new ViewGroup.LayoutParams(-1, -1));
        this.f20331d.zzF(i8, i9, i10, i11);
        this.f20329b.zzz(false);
    }

    public final void zze() {
        AbstractC5683p.checkMainThread("onDestroy must be called from the UI thread.");
        C3212iu c3212iu = this.f20331d;
        if (c3212iu != null) {
            c3212iu.zzo();
            this.f20330c.removeView(this.f20331d);
            this.f20331d = null;
        }
    }

    public final void zzf() {
        AbstractC5683p.checkMainThread("onPause must be called from the UI thread.");
        C3212iu c3212iu = this.f20331d;
        if (c3212iu != null) {
            c3212iu.zzu();
        }
    }

    public final void zzg(int i8) {
        C3212iu c3212iu = this.f20331d;
        if (c3212iu != null) {
            c3212iu.zzC(i8);
        }
    }
}
