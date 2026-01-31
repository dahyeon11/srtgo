package com.google.android.gms.ads.mediation.customevent;

import N1.f;
import android.content.Context;
import android.os.Bundle;
import y1.C6528i;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventBanner extends O1.a {
    @Override // O1.a
    /* synthetic */ void onDestroy();

    @Override // O1.a
    /* synthetic */ void onPause();

    @Override // O1.a
    /* synthetic */ void onResume();

    void requestBannerAd(Context context, O1.b bVar, String str, C6528i c6528i, f fVar, Bundle bundle);
}
