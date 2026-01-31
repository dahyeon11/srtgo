package com.google.android.gms.ads.mediation.rtb;

import N1.AbstractC0676a;
import N1.InterfaceC0680e;
import N1.j;
import N1.l;
import N1.r;
import N1.u;
import N1.y;
import P1.a;
import P1.b;
import android.os.RemoteException;
import com.google.android.gms.ads.MobileAds;
import y1.C6521b;

/* loaded from: classes.dex */
public abstract class RtbAdapter extends AbstractC0676a {
    public abstract void collectSignals(a aVar, b bVar);

    public void loadRtbAppOpenAd(j jVar, InterfaceC0680e interfaceC0680e) {
        loadAppOpenAd(jVar, interfaceC0680e);
    }

    public void loadRtbBannerAd(l lVar, InterfaceC0680e interfaceC0680e) {
        loadBannerAd(lVar, interfaceC0680e);
    }

    public void loadRtbInterscrollerAd(l lVar, InterfaceC0680e interfaceC0680e) {
        interfaceC0680e.onFailure(new C6521b(7, getClass().getSimpleName().concat(" does not support interscroller ads."), MobileAds.ERROR_DOMAIN));
    }

    public void loadRtbInterstitialAd(r rVar, InterfaceC0680e interfaceC0680e) {
        loadInterstitialAd(rVar, interfaceC0680e);
    }

    @Deprecated
    public void loadRtbNativeAd(u uVar, InterfaceC0680e interfaceC0680e) {
        loadNativeAd(uVar, interfaceC0680e);
    }

    public void loadRtbNativeAdMapper(u uVar, InterfaceC0680e interfaceC0680e) throws RemoteException {
        loadNativeAdMapper(uVar, interfaceC0680e);
    }

    public void loadRtbRewardedAd(y yVar, InterfaceC0680e interfaceC0680e) {
        loadRewardedAd(yVar, interfaceC0680e);
    }

    public void loadRtbRewardedInterstitialAd(y yVar, InterfaceC0680e interfaceC0680e) {
        loadRewardedInterstitialAd(yVar, interfaceC0680e);
    }
}
