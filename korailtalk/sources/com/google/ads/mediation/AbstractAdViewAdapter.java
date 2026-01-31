package com.google.ads.mediation;

import H1.C0591z;
import H1.V0;
import L1.g;
import N1.A;
import N1.C;
import N1.E;
import N1.f;
import N1.m;
import N1.s;
import N1.v;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import java.util.Iterator;
import java.util.Set;
import y1.C6526g;
import y1.C6527h;
import y1.C6528i;
import y1.C6529j;

/* loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter, C, E {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private C6526g adLoader;
    protected C6529j mAdView;
    protected M1.a mInterstitialAd;

    C6527h buildAdRequest(Context context, f fVar, Bundle bundle, Bundle bundle2) {
        C6527h.a aVar = new C6527h.a();
        Set<String> keywords = fVar.getKeywords();
        if (keywords != null) {
            Iterator<String> it = keywords.iterator();
            while (it.hasNext()) {
                aVar.addKeyword(it.next());
            }
        }
        if (fVar.isTesting()) {
            C0591z.zzb();
            aVar.zza(g.zzz(context));
        }
        if (fVar.taggedForChildDirectedTreatment() != -1) {
            aVar.zzc(fVar.taggedForChildDirectedTreatment() == 1);
        }
        aVar.zzb(fVar.isDesignedForFamilies());
        aVar.addNetworkExtrasBundle(AdMobAdapter.class, buildExtrasBundle(bundle, bundle2));
        return aVar.build();
    }

    protected abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    M1.a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @Override // N1.E
    public V0 getVideoController() {
        C6529j c6529j = this.mAdView;
        if (c6529j != null) {
            return c6529j.zza().zza();
        }
        return null;
    }

    C6526g.a newAdLoader(Context context, String str) {
        return new C6526g.a(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, N1.g, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        C6529j c6529j = this.mAdView;
        if (c6529j != null) {
            c6529j.destroy();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    @Override // N1.C
    public void onImmersiveModeUpdated(boolean z8) {
        M1.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.setImmersiveMode(z8);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, N1.g, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        C6529j c6529j = this.mAdView;
        if (c6529j != null) {
            c6529j.pause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, N1.g, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        C6529j c6529j = this.mAdView;
        if (c6529j != null) {
            c6529j.resume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, m mVar, Bundle bundle, C6528i c6528i, f fVar, Bundle bundle2) {
        C6529j c6529j = new C6529j(context);
        this.mAdView = c6529j;
        c6529j.setAdSize(new C6528i(c6528i.getWidth(), c6528i.getHeight()));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new b(this, mVar));
        this.mAdView.loadAd(buildAdRequest(context, fVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, s sVar, Bundle bundle, f fVar, Bundle bundle2) {
        M1.a.load(context, getAdUnitId(bundle), buildAdRequest(context, fVar, bundle2, bundle), new c(this, sVar));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, v vVar, Bundle bundle, A a9, Bundle bundle2) {
        e eVar = new e(this, vVar);
        C6526g.a aVarWithAdListener = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER)).withAdListener(eVar);
        aVarWithAdListener.zzc(a9.getNativeAdOptions());
        aVarWithAdListener.withNativeAdOptions(a9.getNativeAdRequestOptions());
        if (a9.isUnifiedNativeAdRequested()) {
            aVarWithAdListener.zzb(eVar);
        }
        if (a9.zzb()) {
            for (String str : a9.zza().keySet()) {
                aVarWithAdListener.zza(str, eVar, true != ((Boolean) a9.zza().get(str)).booleanValue() ? null : eVar);
            }
        }
        C6526g c6526gBuild = aVarWithAdListener.build();
        this.adLoader = c6526gBuild;
        c6526gBuild.loadAd(buildAdRequest(context, a9, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        M1.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.show(null);
        }
    }
}
