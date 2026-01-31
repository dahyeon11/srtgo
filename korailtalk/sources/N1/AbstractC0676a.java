package N1;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.MobileAds;
import java.util.List;
import y1.C6521b;

/* renamed from: N1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0676a {
    public abstract y1.z getSDKVersionInfo();

    public abstract y1.z getVersionInfo();

    public abstract void initialize(Context context, InterfaceC0677b interfaceC0677b, List<n> list);

    public void loadAppOpenAd(j jVar, InterfaceC0680e interfaceC0680e) {
        interfaceC0680e.onFailure(new C6521b(7, getClass().getSimpleName().concat(" does not support app open ads."), MobileAds.ERROR_DOMAIN));
    }

    public void loadBannerAd(l lVar, InterfaceC0680e interfaceC0680e) {
        interfaceC0680e.onFailure(new C6521b(7, getClass().getSimpleName().concat(" does not support banner ads."), MobileAds.ERROR_DOMAIN));
    }

    public void loadInterscrollerAd(l lVar, InterfaceC0680e interfaceC0680e) {
        interfaceC0680e.onFailure(new C6521b(7, getClass().getSimpleName().concat(" does not support interscroller ads."), MobileAds.ERROR_DOMAIN));
    }

    public void loadInterstitialAd(r rVar, InterfaceC0680e interfaceC0680e) {
        interfaceC0680e.onFailure(new C6521b(7, getClass().getSimpleName().concat(" does not support interstitial ads."), MobileAds.ERROR_DOMAIN));
    }

    @Deprecated
    public void loadNativeAd(u uVar, InterfaceC0680e interfaceC0680e) {
        interfaceC0680e.onFailure(new C6521b(7, getClass().getSimpleName().concat(" does not support native ads."), MobileAds.ERROR_DOMAIN));
    }

    public void loadNativeAdMapper(u uVar, InterfaceC0680e interfaceC0680e) throws RemoteException {
        throw new RemoteException("Method is not found");
    }

    public void loadRewardedAd(y yVar, InterfaceC0680e interfaceC0680e) {
        interfaceC0680e.onFailure(new C6521b(7, getClass().getSimpleName().concat(" does not support rewarded ads."), MobileAds.ERROR_DOMAIN));
    }

    public void loadRewardedInterstitialAd(y yVar, InterfaceC0680e interfaceC0680e) {
        interfaceC0680e.onFailure(new C6521b(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), MobileAds.ERROR_DOMAIN));
    }
}
