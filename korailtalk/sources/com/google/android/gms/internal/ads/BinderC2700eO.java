package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.eO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2700eO extends AbstractBinderC4785wj {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18757a;

    /* renamed from: b, reason: collision with root package name */
    private final SL f18758b;

    /* renamed from: c, reason: collision with root package name */
    private C4408tM f18759c;

    /* renamed from: d, reason: collision with root package name */
    private NL f18760d;

    public BinderC2700eO(Context context, SL sl, C4408tM c4408tM, NL nl) {
        this.f18757a = context;
        this.f18758b = sl;
        this.f18759c = c4408tM;
        this.f18760d = nl;
    }

    private final InterfaceC1799Qi c(String str) {
        return new C2471cO(this, Q1.f.ASSET_NAME_VIDEO);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4785wj, com.google.android.gms.internal.ads.InterfaceC4899xj
    public final H1.V0 zze() {
        return this.f18758b.zzj();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4785wj, com.google.android.gms.internal.ads.InterfaceC4899xj
    public final InterfaceC2168Zi zzf() {
        try {
            return this.f18760d.zzc().zza();
        } catch (NullPointerException e8) {
            G1.u.zzo().zzw(e8, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4785wj, com.google.android.gms.internal.ads.InterfaceC4899xj
    public final InterfaceC2503cj zzg(String str) {
        return (InterfaceC2503cj) this.f18758b.zzh().get(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4785wj, com.google.android.gms.internal.ads.InterfaceC4899xj
    public final InterfaceC6172a zzh() {
        return r2.b.wrap(this.f18757a);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4785wj, com.google.android.gms.internal.ads.InterfaceC4899xj
    public final String zzi() {
        return this.f18758b.zzA();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4785wj, com.google.android.gms.internal.ads.InterfaceC4899xj
    public final String zzj(String str) {
        return (String) this.f18758b.zzi().get(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4785wj, com.google.android.gms.internal.ads.InterfaceC4899xj
    public final List zzk() {
        try {
            O.h hVarZzh = this.f18758b.zzh();
            O.h hVarZzi = this.f18758b.zzi();
            String[] strArr = new String[hVarZzh.size() + hVarZzi.size()];
            int i8 = 0;
            for (int i9 = 0; i9 < hVarZzh.size(); i9++) {
                strArr[i8] = (String) hVarZzh.keyAt(i9);
                i8++;
            }
            for (int i10 = 0; i10 < hVarZzi.size(); i10++) {
                strArr[i8] = (String) hVarZzi.keyAt(i10);
                i8++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e8) {
            G1.u.zzo().zzw(e8, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4785wj, com.google.android.gms.internal.ads.InterfaceC4899xj
    public final void zzl() {
        NL nl = this.f18760d;
        if (nl != null) {
            nl.zzb();
        }
        this.f18760d = null;
        this.f18759c = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4785wj, com.google.android.gms.internal.ads.InterfaceC4899xj
    public final void zzm() {
        try {
            String strZzC = this.f18758b.zzC();
            if (Objects.equals(strZzC, "Google")) {
                L1.n.zzj("Illegal argument specified for omid partner name.");
                return;
            }
            if (TextUtils.isEmpty(strZzC)) {
                L1.n.zzj("Not starting OMID session. OM partner name has not been configured.");
                return;
            }
            NL nl = this.f18760d;
            if (nl != null) {
                nl.zzf(strZzC, false);
            }
        } catch (NullPointerException e8) {
            G1.u.zzo().zzw(e8, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4785wj, com.google.android.gms.internal.ads.InterfaceC4899xj
    public final void zzn(String str) {
        NL nl = this.f18760d;
        if (nl != null) {
            nl.zzF(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4785wj, com.google.android.gms.internal.ads.InterfaceC4899xj
    public final void zzo() {
        NL nl = this.f18760d;
        if (nl != null) {
            nl.zzI();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4785wj, com.google.android.gms.internal.ads.InterfaceC4899xj
    public final void zzp(InterfaceC6172a interfaceC6172a) throws SecurityException {
        NL nl;
        Object objUnwrap = r2.b.unwrap(interfaceC6172a);
        if (!(objUnwrap instanceof View) || this.f18758b.zzu() == null || (nl = this.f18760d) == null) {
            return;
        }
        nl.zzJ((View) objUnwrap);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4785wj, com.google.android.gms.internal.ads.InterfaceC4899xj
    public final boolean zzq() {
        NL nl = this.f18760d;
        return (nl == null || nl.zzW()) && this.f18758b.zzr() != null && this.f18758b.zzs() == null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4785wj, com.google.android.gms.internal.ads.InterfaceC4899xj
    public final boolean zzr(InterfaceC6172a interfaceC6172a) throws SecurityException {
        C4408tM c4408tM;
        Object objUnwrap = r2.b.unwrap(interfaceC6172a);
        if (!(objUnwrap instanceof ViewGroup) || (c4408tM = this.f18759c) == null || !c4408tM.zzf((ViewGroup) objUnwrap)) {
            return false;
        }
        this.f18758b.zzq().zzar(c(Q1.f.ASSET_NAME_VIDEO));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4785wj, com.google.android.gms.internal.ads.InterfaceC4899xj
    public final boolean zzs(InterfaceC6172a interfaceC6172a) throws SecurityException {
        C4408tM c4408tM;
        Object objUnwrap = r2.b.unwrap(interfaceC6172a);
        if (!(objUnwrap instanceof ViewGroup) || (c4408tM = this.f18759c) == null || !c4408tM.zzg((ViewGroup) objUnwrap)) {
            return false;
        }
        this.f18758b.zzs().zzar(c(Q1.f.ASSET_NAME_VIDEO));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4785wj, com.google.android.gms.internal.ads.InterfaceC4899xj
    public final boolean zzt() {
        C2597dX c2597dXZzu = this.f18758b.zzu();
        if (c2597dXZzu == null) {
            L1.n.zzj("Trying to start OMID session before creation.");
            return false;
        }
        G1.u.zzA().zzk(c2597dXZzu.zza());
        if (this.f18758b.zzr() == null) {
            return true;
        }
        this.f18758b.zzr().zzd("onSdkLoaded", new O.a());
        return true;
    }
}
