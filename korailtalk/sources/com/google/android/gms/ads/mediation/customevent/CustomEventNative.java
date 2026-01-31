package com.google.android.gms.ads.mediation.customevent;

import N1.A;
import O1.e;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventNative extends O1.a {
    @Override // O1.a
    /* synthetic */ void onDestroy();

    @Override // O1.a
    /* synthetic */ void onPause();

    @Override // O1.a
    /* synthetic */ void onResume();

    void requestNativeAd(Context context, e eVar, String str, A a9, Bundle bundle);
}
