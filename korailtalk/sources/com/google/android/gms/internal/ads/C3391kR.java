package com.google.android.gms.internal.ads;

import H1.C0534f1;
import H1.InterfaceC0517a;
import K1.AbstractC0667v0;
import android.content.Context;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.kR, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3391kR implements z1.e, YG, InterfaceC0517a, InterfaceC5078zF, VF, WF, InterfaceC3941pG, CF, InterfaceC2378bd0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f20419a;

    /* renamed from: b, reason: collision with root package name */
    private final XQ f20420b;

    /* renamed from: c, reason: collision with root package name */
    private long f20421c;

    public C3391kR(XQ xq, AbstractC2302ax abstractC2302ax) {
        this.f20420b = xq;
        this.f20419a = Collections.singletonList(abstractC2302ax);
    }

    private final void a(Class cls, String str, Object... objArr) throws IOException {
        this.f20420b.zza(this.f20419a, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // H1.InterfaceC0517a
    public final void onAdClicked() throws IOException {
        a(InterfaceC0517a.class, "onAdClicked", new Object[0]);
    }

    @Override // z1.e
    public final void onAppEvent(String str, String str2) throws IOException {
        a(z1.e.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zza() throws IOException {
        a(InterfaceC5078zF.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzb() throws IOException {
        a(InterfaceC5078zF.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzc() throws IOException {
        a(InterfaceC5078zF.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2378bd0
    public final void zzd(EnumC1952Uc0 enumC1952Uc0, String str) throws IOException {
        a(InterfaceC1911Tc0.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.CF
    public final void zzdB(C0534f1 c0534f1) throws IOException {
        a(CF.class, "onAdFailedToLoad", Integer.valueOf(c0534f1.zza), c0534f1.zzb, c0534f1.zzc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2378bd0
    public final void zzdC(EnumC1952Uc0 enumC1952Uc0, String str) throws IOException {
        a(InterfaceC1911Tc0.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2378bd0
    public final void zzdD(EnumC1952Uc0 enumC1952Uc0, String str, Throwable th) throws IOException {
        a(InterfaceC1911Tc0.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2378bd0
    public final void zzdE(EnumC1952Uc0 enumC1952Uc0, String str) throws IOException {
        a(InterfaceC1911Tc0.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.WF
    public final void zzdj(Context context) throws IOException {
        a(WF.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.WF
    public final void zzdl(Context context) throws IOException {
        a(WF.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.WF
    public final void zzdm(Context context) throws IOException {
        a(WF.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.YG
    public final void zzdn(C2519cr c2519cr) throws IOException {
        this.f20421c = G1.u.zzB().elapsedRealtime();
        a(YG.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.YG
    public final void zzdo(C1457Ia0 c1457Ia0) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzds(InterfaceC4118qr interfaceC4118qr, String str, String str2) throws IOException {
        a(InterfaceC5078zF.class, "onRewarded", interfaceC4118qr, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zze() throws IOException {
        a(InterfaceC5078zF.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzf() throws IOException {
        a(InterfaceC5078zF.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.VF
    public final void zzr() throws IOException {
        a(VF.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3941pG
    public final void zzs() throws IOException {
        AbstractC0667v0.zza("Ad Request Latency : " + (G1.u.zzB().elapsedRealtime() - this.f20421c));
        a(InterfaceC3941pG.class, "onAdLoaded", new Object[0]);
    }
}
