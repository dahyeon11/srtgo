package com.google.android.gms.ads.mediation;

import N1.f;
import N1.g;
import N1.s;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: classes.dex */
public interface MediationInterstitialAdapter extends g {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, s sVar, Bundle bundle, f fVar, Bundle bundle2);

    void showInterstitial();
}
