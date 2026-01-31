package com.google.android.gms.ads.internal;

import G1.t;
import H1.AbstractBinderC0539h0;
import H1.C;
import H1.C1;
import H1.InterfaceC0571s0;
import H1.O0;
import H1.T;
import H1.X;
import H1.d2;
import J1.A;
import J1.B;
import J1.BinderC0622e;
import J1.BinderC0624g;
import J1.G;
import J1.h;
import L1.a;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AbstractC2302ax;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.G80;
import com.google.android.gms.internal.ads.InterfaceC1232Cl;
import com.google.android.gms.internal.ads.InterfaceC1568Kp;
import com.google.android.gms.internal.ads.InterfaceC1570Kr;
import com.google.android.gms.internal.ads.InterfaceC1850Rn;
import com.google.android.gms.internal.ads.InterfaceC1895Sp;
import com.google.android.gms.internal.ads.InterfaceC1939Ts;
import com.google.android.gms.internal.ads.InterfaceC2962gj;
import com.google.android.gms.internal.ads.InterfaceC3760nj;
import com.google.android.gms.internal.ads.InterfaceC3857oa0;
import com.google.android.gms.internal.ads.InterfaceC4459tr;
import com.google.android.gms.internal.ads.InterfaceC4644vR;
import com.google.android.gms.internal.ads.InterfaceC4953y90;
import com.google.android.gms.internal.ads.InterfaceC5131zl;
import com.google.android.gms.internal.ads.J00;
import com.google.android.gms.internal.ads.Q70;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC3725nM;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC3953pM;
import java.util.HashMap;
import r2.InterfaceC6172a;
import r2.b;

/* loaded from: classes.dex */
public class ClientApi extends AbstractBinderC0539h0 {
    @Override // H1.AbstractBinderC0539h0, H1.InterfaceC0542i0
    public final T zzb(InterfaceC6172a interfaceC6172a, String str, InterfaceC1850Rn interfaceC1850Rn, int i8) {
        Context context = (Context) b.unwrap(interfaceC6172a);
        return new J00(AbstractC2302ax.zzb(context, interfaceC1850Rn, i8), context, str);
    }

    @Override // H1.AbstractBinderC0539h0, H1.InterfaceC0542i0
    public final X zzc(InterfaceC6172a interfaceC6172a, d2 d2Var, String str, InterfaceC1850Rn interfaceC1850Rn, int i8) {
        Context context = (Context) b.unwrap(interfaceC6172a);
        Q70 q70Zzt = AbstractC2302ax.zzb(context, interfaceC1850Rn, i8).zzt();
        q70Zzt.zza(str);
        q70Zzt.zzb(context);
        return i8 >= ((Integer) C.zzc().zza(AbstractC4439th.zzfp)).intValue() ? q70Zzt.zzc().zza() : new C1();
    }

    @Override // H1.AbstractBinderC0539h0, H1.InterfaceC0542i0
    public final X zzd(InterfaceC6172a interfaceC6172a, d2 d2Var, String str, InterfaceC1850Rn interfaceC1850Rn, int i8) {
        Context context = (Context) b.unwrap(interfaceC6172a);
        G80 g80Zzu = AbstractC2302ax.zzb(context, interfaceC1850Rn, i8).zzu();
        g80Zzu.zzc(context);
        g80Zzu.zza(d2Var);
        g80Zzu.zzb(str);
        return g80Zzu.zzd().zza();
    }

    @Override // H1.AbstractBinderC0539h0, H1.InterfaceC0542i0
    public final X zze(InterfaceC6172a interfaceC6172a, d2 d2Var, String str, InterfaceC1850Rn interfaceC1850Rn, int i8) {
        Context context = (Context) b.unwrap(interfaceC6172a);
        InterfaceC4953y90 interfaceC4953y90Zzv = AbstractC2302ax.zzb(context, interfaceC1850Rn, i8).zzv();
        interfaceC4953y90Zzv.zzc(context);
        interfaceC4953y90Zzv.zza(d2Var);
        interfaceC4953y90Zzv.zzb(str);
        return interfaceC4953y90Zzv.zzd().zza();
    }

    @Override // H1.AbstractBinderC0539h0, H1.InterfaceC0542i0
    public final X zzf(InterfaceC6172a interfaceC6172a, d2 d2Var, String str, int i8) {
        return new t((Context) b.unwrap(interfaceC6172a), d2Var, str, new a(241806000, i8, true, false));
    }

    @Override // H1.AbstractBinderC0539h0, H1.InterfaceC0542i0
    public final InterfaceC0571s0 zzg(InterfaceC6172a interfaceC6172a, int i8) {
        return AbstractC2302ax.zzb((Context) b.unwrap(interfaceC6172a), null, i8).zzc();
    }

    @Override // H1.AbstractBinderC0539h0, H1.InterfaceC0542i0
    public final O0 zzh(InterfaceC6172a interfaceC6172a, InterfaceC1850Rn interfaceC1850Rn, int i8) {
        return AbstractC2302ax.zzb((Context) b.unwrap(interfaceC6172a), interfaceC1850Rn, i8).zzm();
    }

    @Override // H1.AbstractBinderC0539h0, H1.InterfaceC0542i0
    public final InterfaceC2962gj zzi(InterfaceC6172a interfaceC6172a, InterfaceC6172a interfaceC6172a2) {
        return new ViewTreeObserverOnGlobalLayoutListenerC3953pM((FrameLayout) b.unwrap(interfaceC6172a), (FrameLayout) b.unwrap(interfaceC6172a2), 241806000);
    }

    @Override // H1.AbstractBinderC0539h0, H1.InterfaceC0542i0
    public final InterfaceC3760nj zzj(InterfaceC6172a interfaceC6172a, InterfaceC6172a interfaceC6172a2, InterfaceC6172a interfaceC6172a3) {
        return new ViewTreeObserverOnGlobalLayoutListenerC3725nM((View) b.unwrap(interfaceC6172a), (HashMap) b.unwrap(interfaceC6172a2), (HashMap) b.unwrap(interfaceC6172a3));
    }

    @Override // H1.AbstractBinderC0539h0, H1.InterfaceC0542i0
    public final InterfaceC1232Cl zzk(InterfaceC6172a interfaceC6172a, InterfaceC1850Rn interfaceC1850Rn, int i8, InterfaceC5131zl interfaceC5131zl) {
        Context context = (Context) b.unwrap(interfaceC6172a);
        InterfaceC4644vR interfaceC4644vRZzk = AbstractC2302ax.zzb(context, interfaceC1850Rn, i8).zzk();
        interfaceC4644vRZzk.zzb(context);
        interfaceC4644vRZzk.zza(interfaceC5131zl);
        return interfaceC4644vRZzk.zzc().zzd();
    }

    @Override // H1.AbstractBinderC0539h0, H1.InterfaceC0542i0
    public final InterfaceC1568Kp zzl(InterfaceC6172a interfaceC6172a, InterfaceC1850Rn interfaceC1850Rn, int i8) {
        return AbstractC2302ax.zzb((Context) b.unwrap(interfaceC6172a), interfaceC1850Rn, i8).zzn();
    }

    @Override // H1.AbstractBinderC0539h0, H1.InterfaceC0542i0
    public final InterfaceC1895Sp zzm(InterfaceC6172a interfaceC6172a) {
        Activity activity = (Activity) b.unwrap(interfaceC6172a);
        AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (adOverlayInfoParcelZza == null) {
            return new B(activity);
        }
        int i8 = adOverlayInfoParcelZza.zzk;
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 5 ? new B(activity) : new BinderC0622e(activity) : new G(activity, adOverlayInfoParcelZza) : new h(activity) : new BinderC0624g(activity) : new A(activity);
    }

    @Override // H1.AbstractBinderC0539h0, H1.InterfaceC0542i0
    public final InterfaceC4459tr zzn(InterfaceC6172a interfaceC6172a, InterfaceC1850Rn interfaceC1850Rn, int i8) {
        Context context = (Context) b.unwrap(interfaceC6172a);
        InterfaceC3857oa0 interfaceC3857oa0Zzw = AbstractC2302ax.zzb(context, interfaceC1850Rn, i8).zzw();
        interfaceC3857oa0Zzw.zzb(context);
        return interfaceC3857oa0Zzw.zzc().zzb();
    }

    @Override // H1.AbstractBinderC0539h0, H1.InterfaceC0542i0
    public final InterfaceC1570Kr zzo(InterfaceC6172a interfaceC6172a, String str, InterfaceC1850Rn interfaceC1850Rn, int i8) {
        Context context = (Context) b.unwrap(interfaceC6172a);
        InterfaceC3857oa0 interfaceC3857oa0Zzw = AbstractC2302ax.zzb(context, interfaceC1850Rn, i8).zzw();
        interfaceC3857oa0Zzw.zzb(context);
        interfaceC3857oa0Zzw.zza(str);
        return interfaceC3857oa0Zzw.zzc().zza();
    }

    @Override // H1.AbstractBinderC0539h0, H1.InterfaceC0542i0
    public final InterfaceC1939Ts zzp(InterfaceC6172a interfaceC6172a, InterfaceC1850Rn interfaceC1850Rn, int i8) {
        return AbstractC2302ax.zzb((Context) b.unwrap(interfaceC6172a), interfaceC1850Rn, i8).zzq();
    }
}
