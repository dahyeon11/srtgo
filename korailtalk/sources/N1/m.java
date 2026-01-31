package N1;

import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import y1.C6521b;

/* loaded from: classes.dex */
public interface m {
    void onAdClicked(MediationBannerAdapter mediationBannerAdapter);

    void onAdClosed(MediationBannerAdapter mediationBannerAdapter);

    @Deprecated
    void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i8);

    void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, C6521b c6521b);

    void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter);

    void onAdLoaded(MediationBannerAdapter mediationBannerAdapter);

    void onAdOpened(MediationBannerAdapter mediationBannerAdapter);

    void zzb(MediationBannerAdapter mediationBannerAdapter, String str, String str2);
}
