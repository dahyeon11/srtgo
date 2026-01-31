package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.gK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2922gK {

    /* renamed from: a, reason: collision with root package name */
    private final MK f19347a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2065Wv f19348b;

    public C2922gK(MK mk, InterfaceC2065Wv interfaceC2065Wv) {
        this.f19347a = mk;
        this.f19348b = interfaceC2065Wv;
    }

    public static final C4630vJ zzh(C2951gd0 c2951gd0) {
        return new C4630vJ(c2951gd0, AbstractC4805wt.zzf);
    }

    public static final C4630vJ zzi(RK rk) {
        return new C4630vJ(rk, AbstractC4805wt.zzf);
    }

    public final View zza() {
        InterfaceC2065Wv interfaceC2065Wv = this.f19348b;
        if (interfaceC2065Wv == null) {
            return null;
        }
        return interfaceC2065Wv.zzG();
    }

    public final View zzb() {
        InterfaceC2065Wv interfaceC2065Wv = this.f19348b;
        if (interfaceC2065Wv != null) {
            return interfaceC2065Wv.zzG();
        }
        return null;
    }

    public final InterfaceC2065Wv zzc() {
        return this.f19348b;
    }

    public final C4630vJ zzd(Executor executor) {
        final InterfaceC2065Wv interfaceC2065Wv = this.f19348b;
        return new C4630vJ(new RH() { // from class: com.google.android.gms.internal.ads.fK
            @Override // com.google.android.gms.internal.ads.RH
            public final void zza() {
                J1.u uVarZzL;
                InterfaceC2065Wv interfaceC2065Wv2 = interfaceC2065Wv;
                if (interfaceC2065Wv2 == null || (uVarZzL = interfaceC2065Wv2.zzL()) == null) {
                    return;
                }
                uVarZzL.zzb();
            }
        }, executor);
    }

    public final MK zze() {
        return this.f19347a;
    }

    public Set zzf(VE ve) {
        return Collections.singleton(new C4630vJ(ve, AbstractC4805wt.zzf));
    }

    public Set zzg(VE ve) {
        return Collections.singleton(new C4630vJ(ve, AbstractC4805wt.zzf));
    }
}
