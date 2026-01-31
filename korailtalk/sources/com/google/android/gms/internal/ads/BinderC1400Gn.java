package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import java.util.List;
import java.util.Map;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Gn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC1400Gn extends AbstractBinderC1984Uw {

    /* renamed from: a, reason: collision with root package name */
    private final D2.a f13197a;

    BinderC1400Gn(D2.a aVar) {
        this.f13197a = aVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1984Uw, com.google.android.gms.internal.ads.InterfaceC2025Vw
    public final int zzb(String str) {
        return this.f13197a.getMaxUserProperties(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1984Uw, com.google.android.gms.internal.ads.InterfaceC2025Vw
    public final long zzc() {
        return this.f13197a.generateEventId();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1984Uw, com.google.android.gms.internal.ads.InterfaceC2025Vw
    public final Bundle zzd(Bundle bundle) {
        return this.f13197a.performActionWithResponse(bundle);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1984Uw, com.google.android.gms.internal.ads.InterfaceC2025Vw
    public final String zze() {
        return this.f13197a.getAppIdOrigin();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1984Uw, com.google.android.gms.internal.ads.InterfaceC2025Vw
    public final String zzf() {
        return this.f13197a.getAppInstanceId();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1984Uw, com.google.android.gms.internal.ads.InterfaceC2025Vw
    public final String zzg() {
        return this.f13197a.getCurrentScreenClass();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1984Uw, com.google.android.gms.internal.ads.InterfaceC2025Vw
    public final String zzh() {
        return this.f13197a.getCurrentScreenName();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1984Uw, com.google.android.gms.internal.ads.InterfaceC2025Vw
    public final String zzi() {
        return this.f13197a.getGmpAppId();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1984Uw, com.google.android.gms.internal.ads.InterfaceC2025Vw
    public final List zzj(String str, String str2) {
        return this.f13197a.getConditionalUserProperties(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1984Uw, com.google.android.gms.internal.ads.InterfaceC2025Vw
    public final Map zzk(String str, String str2, boolean z8) {
        return this.f13197a.getUserProperties(str, str2, z8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1984Uw, com.google.android.gms.internal.ads.InterfaceC2025Vw
    public final void zzl(String str) {
        this.f13197a.beginAdUnitExposure(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1984Uw, com.google.android.gms.internal.ads.InterfaceC2025Vw
    public final void zzm(String str, String str2, Bundle bundle) {
        this.f13197a.clearConditionalUserProperty(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1984Uw, com.google.android.gms.internal.ads.InterfaceC2025Vw
    public final void zzn(String str) {
        this.f13197a.endAdUnitExposure(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1984Uw, com.google.android.gms.internal.ads.InterfaceC2025Vw
    public final void zzo(String str, String str2, Bundle bundle) {
        this.f13197a.logEvent(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1984Uw, com.google.android.gms.internal.ads.InterfaceC2025Vw
    public final void zzp(Bundle bundle) {
        this.f13197a.performAction(bundle);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1984Uw, com.google.android.gms.internal.ads.InterfaceC2025Vw
    public final void zzq(Bundle bundle) {
        this.f13197a.setConditionalUserProperty(bundle);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1984Uw, com.google.android.gms.internal.ads.InterfaceC2025Vw
    public final void zzr(Bundle bundle) {
        this.f13197a.setConsent(bundle);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1984Uw, com.google.android.gms.internal.ads.InterfaceC2025Vw
    public final void zzs(InterfaceC6172a interfaceC6172a, String str, String str2) {
        this.f13197a.setCurrentScreen(interfaceC6172a != null ? (Activity) r2.b.unwrap(interfaceC6172a) : null, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1984Uw, com.google.android.gms.internal.ads.InterfaceC2025Vw
    public final void zzt(String str, String str2, InterfaceC6172a interfaceC6172a) {
        this.f13197a.setUserProperty(str, str2, interfaceC6172a != null ? r2.b.unwrap(interfaceC6172a) : null);
    }
}
