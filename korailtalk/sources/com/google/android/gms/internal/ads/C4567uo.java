package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import i2.AbstractC5683p;
import y1.C6514A;
import y1.C6521b;

/* renamed from: com.google.android.gms.internal.ads.uo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4567uo implements N1.m, N1.s, N1.v {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2096Xn f23109a;

    /* renamed from: b, reason: collision with root package name */
    private N1.D f23110b;

    /* renamed from: c, reason: collision with root package name */
    private C5013yj f23111c;

    public C4567uo(InterfaceC2096Xn interfaceC2096Xn) {
        this.f23109a = interfaceC2096Xn;
    }

    @Override // N1.m
    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdClicked.");
        try {
            this.f23109a.zze();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.m
    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdClosed.");
        try {
            this.f23109a.zzf();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.m
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i8) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdFailedToLoad with error. " + i8);
        try {
            this.f23109a.zzg(i8);
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.v
    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        N1.D d9 = this.f23110b;
        if (this.f23111c == null) {
            if (d9 == null) {
                L1.n.zzl("#007 Could not call remote method.", null);
                return;
            } else if (!d9.getOverrideImpressionRecording()) {
                L1.n.zze("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        L1.n.zze("Adapter called onAdImpression.");
        try {
            this.f23109a.zzm();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.m
    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdLeftApplication.");
        try {
            this.f23109a.zzn();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.m
    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdLoaded.");
        try {
            this.f23109a.zzo();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.m
    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdOpened.");
        try {
            this.f23109a.zzp();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.v
    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onVideoEnd.");
        try {
            this.f23109a.zzv();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    public final N1.D zza() {
        return this.f23110b;
    }

    @Override // N1.m
    public final void zzb(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAppEvent.");
        try {
            this.f23109a.zzq(str, str2);
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    public final C5013yj zzc() {
        return this.f23111c;
    }

    @Override // N1.v
    public final void zzd(MediationNativeAdapter mediationNativeAdapter, C5013yj c5013yj) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdLoaded with template id ".concat(String.valueOf(c5013yj.zzb())));
        this.f23111c = c5013yj;
        try {
            this.f23109a.zzo();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.v
    public final void zze(MediationNativeAdapter mediationNativeAdapter, C5013yj c5013yj, String str) {
        try {
            this.f23109a.zzr(c5013yj.zza(), str);
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.s
    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdClicked.");
        try {
            this.f23109a.zze();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.s
    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdClosed.");
        try {
            this.f23109a.zzf();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.m
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, C6521b c6521b) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + c6521b.getCode() + ". ErrorMessage: " + c6521b.getMessage() + ". ErrorDomain: " + c6521b.getDomain());
        try {
            this.f23109a.zzh(c6521b.zza());
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.s
    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdLeftApplication.");
        try {
            this.f23109a.zzn();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.s
    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdLoaded.");
        try {
            this.f23109a.zzo();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.s
    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdOpened.");
        try {
            this.f23109a.zzp();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.v
    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        N1.D d9 = this.f23110b;
        if (this.f23111c == null) {
            if (d9 == null) {
                L1.n.zzl("#007 Could not call remote method.", null);
                return;
            } else if (!d9.getOverrideClickHandling()) {
                L1.n.zze("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        L1.n.zze("Adapter called onAdClicked.");
        try {
            this.f23109a.zze();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.v
    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdClosed.");
        try {
            this.f23109a.zzf();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.v
    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdLeftApplication.");
        try {
            this.f23109a.zzn();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.v
    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, N1.D d9) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdLoaded.");
        this.f23110b = d9;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            C6514A c6514a = new C6514A();
            c6514a.zzb(new BinderC3201io());
            if (d9 != null && d9.hasVideoContent()) {
                d9.zze(c6514a);
            }
        }
        try {
            this.f23109a.zzo();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.v
    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdOpened.");
        try {
            this.f23109a.zzp();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.s
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i8) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdFailedToLoad with error " + i8 + ".");
        try {
            this.f23109a.zzg(i8);
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.s
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, C6521b c6521b) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + c6521b.getCode() + ". ErrorMessage: " + c6521b.getMessage() + ". ErrorDomain: " + c6521b.getDomain());
        try {
            this.f23109a.zzh(c6521b.zza());
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.v
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i8) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdFailedToLoad with error " + i8 + ".");
        try {
            this.f23109a.zzg(i8);
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // N1.v
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, C6521b c6521b) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        L1.n.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + c6521b.getCode() + ". ErrorMessage: " + c6521b.getMessage() + ". ErrorDomain: " + c6521b.getDomain());
        try {
            this.f23109a.zzh(c6521b.zza());
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }
}
