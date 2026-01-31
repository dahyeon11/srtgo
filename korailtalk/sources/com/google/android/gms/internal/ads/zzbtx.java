package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.d;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;

/* loaded from: classes2.dex */
public final class zzbtx implements MediationInterstitialAdapter {

    /* renamed from: a, reason: collision with root package name */
    private Activity f24226a;

    /* renamed from: b, reason: collision with root package name */
    private N1.s f24227b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f24228c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        L1.n.zze("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        L1.n.zze("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        L1.n.zze("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, N1.s sVar, Bundle bundle, N1.f fVar, Bundle bundle2) {
        this.f24227b = sVar;
        if (sVar == null) {
            L1.n.zzj("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            L1.n.zzj("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f24227b.onAdFailedToLoad(this, 0);
            return;
        }
        if (!C1838Rh.zzg(context)) {
            L1.n.zzj("Default browser does not support custom tabs. Bailing out.");
            this.f24227b.onAdFailedToLoad(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            L1.n.zzj("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.f24227b.onAdFailedToLoad(this, 0);
        } else {
            this.f24226a = (Activity) context;
            this.f24228c = Uri.parse(string);
            this.f24227b.onAdLoaded(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        androidx.browser.customtabs.d dVarBuild = new d.a().build();
        dVarBuild.intent.setData(this.f24228c);
        K1.K0.zza.post(new RunnableC3316jp(this, new AdOverlayInfoParcel(new J1.j(dVarBuild.intent, null), null, new C3203ip(this), null, new L1.a(0, 0, false), null, null)));
        G1.u.zzo().zzq();
    }
}
