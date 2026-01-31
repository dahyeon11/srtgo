package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class RK implements InterfaceC5078zF, InterfaceC3035hJ {

    /* renamed from: a, reason: collision with root package name */
    private final C1243Cs f16077a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f16078b;

    /* renamed from: c, reason: collision with root package name */
    private final C1407Gs f16079c;

    /* renamed from: d, reason: collision with root package name */
    private final View f16080d;

    /* renamed from: e, reason: collision with root package name */
    private String f16081e;

    /* renamed from: f, reason: collision with root package name */
    private final EnumC1382Ge f16082f;

    public RK(C1243Cs c1243Cs, Context context, C1407Gs c1407Gs, View view, EnumC1382Ge enumC1382Ge) {
        this.f16077a = c1243Cs;
        this.f16078b = context;
        this.f16079c = c1407Gs;
        this.f16080d = view;
        this.f16082f = enumC1382Ge;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zza() {
        this.f16077a.zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzc() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View view = this.f16080d;
        if (view != null && this.f16081e != null) {
            this.f16079c.zzo(view.getContext(), this.f16081e);
        }
        this.f16077a.zzb(true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzds(InterfaceC4118qr interfaceC4118qr, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f16079c.zzp(this.f16078b)) {
            try {
                C1407Gs c1407Gs = this.f16079c;
                Context context = this.f16078b;
                c1407Gs.zzl(context, c1407Gs.zza(context), this.f16077a.zza(), interfaceC4118qr.zzc(), interfaceC4118qr.zzb());
            } catch (RemoteException e8) {
                L1.n.zzk("Remote Exception to get reward item.", e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3035hJ
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3035hJ
    public final void zzl() {
        if (this.f16082f == EnumC1382Ge.APP_OPEN) {
            return;
        }
        String strZzc = this.f16079c.zzc(this.f16078b);
        this.f16081e = strZzc;
        this.f16081e = String.valueOf(strZzc).concat(this.f16082f == EnumC1382Ge.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }
}
