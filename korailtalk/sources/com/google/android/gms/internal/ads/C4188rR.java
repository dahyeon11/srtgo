package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.rR, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4188rR {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5131zl f22465a;

    C4188rR(InterfaceC5131zl interfaceC5131zl) {
        this.f22465a = interfaceC5131zl;
    }

    private final void a(C4075qR c4075qR) throws JSONException {
        String strA = C4075qR.a(c4075qR);
        L1.n.zzi("Dispatching AFMA event on publisher webview: ".concat(strA));
        this.f22465a.zzb(strA);
    }

    public final void zza() {
        a(new C4075qR("initialize", null));
    }

    public final void zzb(long j8) throws JSONException {
        C4075qR c4075qR = new C4075qR("interstitial", null);
        c4075qR.f21934a = Long.valueOf(j8);
        c4075qR.f21936c = "onAdClicked";
        this.f22465a.zzb(C4075qR.a(c4075qR));
    }

    public final void zzc(long j8) throws JSONException {
        C4075qR c4075qR = new C4075qR("interstitial", null);
        c4075qR.f21934a = Long.valueOf(j8);
        c4075qR.f21936c = "onAdClosed";
        a(c4075qR);
    }

    public final void zzd(long j8, int i8) throws JSONException {
        C4075qR c4075qR = new C4075qR("interstitial", null);
        c4075qR.f21934a = Long.valueOf(j8);
        c4075qR.f21936c = "onAdFailedToLoad";
        c4075qR.f21937d = Integer.valueOf(i8);
        a(c4075qR);
    }

    public final void zze(long j8) throws JSONException {
        C4075qR c4075qR = new C4075qR("interstitial", null);
        c4075qR.f21934a = Long.valueOf(j8);
        c4075qR.f21936c = "onAdLoaded";
        a(c4075qR);
    }

    public final void zzf(long j8) {
        C4075qR c4075qR = new C4075qR("interstitial", null);
        c4075qR.f21934a = Long.valueOf(j8);
        c4075qR.f21936c = "onNativeAdObjectNotAvailable";
        a(c4075qR);
    }

    public final void zzg(long j8) throws JSONException {
        C4075qR c4075qR = new C4075qR("interstitial", null);
        c4075qR.f21934a = Long.valueOf(j8);
        c4075qR.f21936c = "onAdOpened";
        a(c4075qR);
    }

    public final void zzh(long j8) {
        C4075qR c4075qR = new C4075qR("creation", null);
        c4075qR.f21934a = Long.valueOf(j8);
        c4075qR.f21936c = "nativeObjectCreated";
        a(c4075qR);
    }

    public final void zzi(long j8) {
        C4075qR c4075qR = new C4075qR("creation", null);
        c4075qR.f21934a = Long.valueOf(j8);
        c4075qR.f21936c = "nativeObjectNotCreated";
        a(c4075qR);
    }

    public final void zzj(long j8) throws JSONException {
        C4075qR c4075qR = new C4075qR("rewarded", null);
        c4075qR.f21934a = Long.valueOf(j8);
        c4075qR.f21936c = "onAdClicked";
        a(c4075qR);
    }

    public final void zzk(long j8) throws JSONException {
        C4075qR c4075qR = new C4075qR("rewarded", null);
        c4075qR.f21934a = Long.valueOf(j8);
        c4075qR.f21936c = "onRewardedAdClosed";
        a(c4075qR);
    }

    public final void zzl(long j8, InterfaceC1406Gr interfaceC1406Gr) throws JSONException {
        C4075qR c4075qR = new C4075qR("rewarded", null);
        c4075qR.f21934a = Long.valueOf(j8);
        c4075qR.f21936c = "onUserEarnedReward";
        c4075qR.f21938e = interfaceC1406Gr.zzf();
        c4075qR.f21939f = Integer.valueOf(interfaceC1406Gr.zze());
        a(c4075qR);
    }

    public final void zzm(long j8, int i8) throws JSONException {
        C4075qR c4075qR = new C4075qR("rewarded", null);
        c4075qR.f21934a = Long.valueOf(j8);
        c4075qR.f21936c = "onRewardedAdFailedToLoad";
        c4075qR.f21937d = Integer.valueOf(i8);
        a(c4075qR);
    }

    public final void zzn(long j8, int i8) throws JSONException {
        C4075qR c4075qR = new C4075qR("rewarded", null);
        c4075qR.f21934a = Long.valueOf(j8);
        c4075qR.f21936c = "onRewardedAdFailedToShow";
        c4075qR.f21937d = Integer.valueOf(i8);
        a(c4075qR);
    }

    public final void zzo(long j8) throws JSONException {
        C4075qR c4075qR = new C4075qR("rewarded", null);
        c4075qR.f21934a = Long.valueOf(j8);
        c4075qR.f21936c = "onAdImpression";
        a(c4075qR);
    }

    public final void zzp(long j8) throws JSONException {
        C4075qR c4075qR = new C4075qR("rewarded", null);
        c4075qR.f21934a = Long.valueOf(j8);
        c4075qR.f21936c = "onRewardedAdLoaded";
        a(c4075qR);
    }

    public final void zzq(long j8) {
        C4075qR c4075qR = new C4075qR("rewarded", null);
        c4075qR.f21934a = Long.valueOf(j8);
        c4075qR.f21936c = "onNativeAdObjectNotAvailable";
        a(c4075qR);
    }

    public final void zzr(long j8) throws JSONException {
        C4075qR c4075qR = new C4075qR("rewarded", null);
        c4075qR.f21934a = Long.valueOf(j8);
        c4075qR.f21936c = "onRewardedAdOpened";
        a(c4075qR);
    }
}
