package N1;

import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import y1.C6521b;

/* loaded from: classes.dex */
public interface s {
    void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter);

    @Deprecated
    void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i8);

    void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, C6521b c6521b);

    void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter);
}
