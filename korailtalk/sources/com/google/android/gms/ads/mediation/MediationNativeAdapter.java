package com.google.android.gms.ads.mediation;

import N1.A;
import N1.g;
import N1.v;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: classes.dex */
public interface MediationNativeAdapter extends g {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, v vVar, Bundle bundle, A a9, Bundle bundle2);
}
