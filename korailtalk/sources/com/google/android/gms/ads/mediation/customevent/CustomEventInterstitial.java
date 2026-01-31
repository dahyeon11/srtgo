package com.google.android.gms.ads.mediation.customevent;

import N1.f;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventInterstitial extends O1.a {
    @Override // O1.a
    /* synthetic */ void onDestroy();

    @Override // O1.a
    /* synthetic */ void onPause();

    @Override // O1.a
    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, O1.c cVar, String str, f fVar, Bundle bundle);

    void showInterstitial();
}
