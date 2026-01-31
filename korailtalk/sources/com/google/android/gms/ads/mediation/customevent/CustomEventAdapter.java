package com.google.android.gms.ads.mediation.customevent;

import L1.n;
import N1.A;
import N1.f;
import N1.m;
import N1.s;
import N1.v;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.annotation.KeepName;
import y1.C6521b;
import y1.C6528i;

@KeepName
/* loaded from: classes.dex */
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* renamed from: e */
    static final C6521b f11748e = new C6521b(0, "Could not instantiate custom event adapter", MobileAds.ERROR_DOMAIN);

    /* renamed from: a */
    private View f11749a;

    /* renamed from: b */
    CustomEventBanner f11750b;

    /* renamed from: c */
    CustomEventInterstitial f11751c;

    /* renamed from: d */
    CustomEventNative f11752d;

    private static Object b(Class cls, String str) {
        try {
            if (str != null) {
                return cls.cast(Class.forName(str).getDeclaredConstructor(null).newInstance(null));
            }
            throw null;
        } catch (Throwable th) {
            n.zzj("Could not instantiate custom event adapter: " + str + ". " + th.getMessage());
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.f11749a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, N1.g, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        CustomEventBanner customEventBanner = this.f11750b;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f11751c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.f11752d;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, N1.g, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        CustomEventBanner customEventBanner = this.f11750b;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.f11751c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.f11752d;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, N1.g, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        CustomEventBanner customEventBanner = this.f11750b;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.f11751c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.f11752d;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, m mVar, Bundle bundle, C6528i c6528i, f fVar, Bundle bundle2) {
        CustomEventBanner customEventBanner = (CustomEventBanner) b(CustomEventBanner.class, bundle.getString("class_name"));
        this.f11750b = customEventBanner;
        if (customEventBanner == null) {
            mVar.onAdFailedToLoad(this, f11748e);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventBanner customEventBanner2 = this.f11750b;
        customEventBanner2.getClass();
        customEventBanner2.requestBannerAd(context, new a(this, mVar), bundle.getString(N1.n.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), c6528i, fVar, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, s sVar, Bundle bundle, f fVar, Bundle bundle2) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) b(CustomEventInterstitial.class, bundle.getString("class_name"));
        this.f11751c = customEventInterstitial;
        if (customEventInterstitial == null) {
            sVar.onAdFailedToLoad(this, f11748e);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventInterstitial customEventInterstitial2 = this.f11751c;
        customEventInterstitial2.getClass();
        customEventInterstitial2.requestInterstitialAd(context, new b(this, this, sVar), bundle.getString(N1.n.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), fVar, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, v vVar, Bundle bundle, A a9, Bundle bundle2) {
        CustomEventNative customEventNative = (CustomEventNative) b(CustomEventNative.class, bundle.getString("class_name"));
        this.f11752d = customEventNative;
        if (customEventNative == null) {
            vVar.onAdFailedToLoad(this, f11748e);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventNative customEventNative2 = this.f11752d;
        customEventNative2.getClass();
        customEventNative2.requestNativeAd(context, new c(this, vVar), bundle.getString(N1.n.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), a9, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        CustomEventInterstitial customEventInterstitial = this.f11751c;
        if (customEventInterstitial != null) {
            customEventInterstitial.showInterstitial();
        }
    }
}
