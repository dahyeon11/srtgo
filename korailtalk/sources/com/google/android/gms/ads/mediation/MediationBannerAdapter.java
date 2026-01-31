package com.google.android.gms.ads.mediation;

import N1.f;
import N1.g;
import N1.m;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import y1.C6528i;

@Deprecated
/* loaded from: classes.dex */
public interface MediationBannerAdapter extends g {
    View getBannerView();

    @Override // N1.g, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onDestroy();

    @Override // N1.g, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onPause();

    @Override // N1.g, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onResume();

    void requestBannerAd(Context context, m mVar, Bundle bundle, C6528i c6528i, f fVar, Bundle bundle2);
}
