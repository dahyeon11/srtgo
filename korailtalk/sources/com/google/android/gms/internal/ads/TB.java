package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public class TB {

    /* renamed from: a, reason: collision with root package name */
    private final WC f16424a;

    /* renamed from: b, reason: collision with root package name */
    private final View f16425b;

    /* renamed from: c, reason: collision with root package name */
    private final C4768wa0 f16426c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC2065Wv f16427d;

    public TB(View view, InterfaceC2065Wv interfaceC2065Wv, WC wc, C4768wa0 c4768wa0) {
        this.f16425b = view;
        this.f16427d = interfaceC2065Wv;
        this.f16424a = wc;
        this.f16426c = c4768wa0;
    }

    public static final C4630vJ zzf(final Context context, final L1.a aVar, final C4654va0 c4654va0, final C1825Ra0 c1825Ra0) {
        return new C4630vJ(new InterfaceC3941pG() { // from class: com.google.android.gms.internal.ads.RB
            @Override // com.google.android.gms.internal.ads.InterfaceC3941pG
            public final void zzs() {
                G1.u.zzs().zzn(context, aVar.afmaVersion, c4654va0.zzD.toString(), c1825Ra0.zzf);
            }
        }, AbstractC4805wt.zzf);
    }

    public static final Set zzg(NC nc) {
        return Collections.singleton(new C4630vJ(nc, AbstractC4805wt.zzf));
    }

    public static final C4630vJ zzh(LC lc) {
        return new C4630vJ(lc, AbstractC4805wt.zze);
    }

    public final View zza() {
        return this.f16425b;
    }

    public final InterfaceC2065Wv zzb() {
        return this.f16427d;
    }

    public final WC zzc() {
        return this.f16424a;
    }

    public C3713nG zzd(Set set) {
        return new C3713nG(set);
    }

    public final C4768wa0 zze() {
        return this.f16426c;
    }
}
