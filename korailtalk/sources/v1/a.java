package V1;

import H1.C;
import U1.e;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.AbstractC3872oi;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.C2750es;
import com.google.android.gms.internal.ads.C4116qq;
import i2.AbstractC5683p;
import y1.C6527h;
import y1.m;
import y1.s;
import y1.t;
import y1.y;
import z1.AbstractC6615a;

/* loaded from: classes.dex */
public abstract class a {
    public static void load(final Context context, final String str, final C6527h c6527h, final b bVar) {
        AbstractC5683p.checkNotNull(context, "Context cannot be null.");
        AbstractC5683p.checkNotNull(str, "AdUnitId cannot be null.");
        AbstractC5683p.checkNotNull(c6527h, "AdRequest cannot be null.");
        AbstractC5683p.checkNotNull(bVar, "LoadCallback cannot be null.");
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        AbstractC4439th.zza(context);
        if (((Boolean) AbstractC3872oi.zzl.zze()).booleanValue()) {
            if (((Boolean) C.zzc().zza(AbstractC4439th.zzlg)).booleanValue()) {
                L1.c.zzb.execute(new Runnable() { // from class: V1.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        C6527h c6527h2 = c6527h;
                        try {
                            new C2750es(context2, str2).zza(c6527h2.zza(), bVar);
                        } catch (IllegalStateException e8) {
                            C4116qq.zza(context2).zzh(e8, "RewardedInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new C2750es(context, str).zza(c6527h.zza(), bVar);
    }

    public abstract Bundle getAdMetadata();

    public abstract String getAdUnitId();

    public abstract m getFullScreenContentCallback();

    public abstract U1.a getOnAdMetadataChangedListener();

    public abstract s getOnPaidEventListener();

    public abstract y getResponseInfo();

    public abstract U1.b getRewardItem();

    public abstract void setFullScreenContentCallback(m mVar);

    public abstract void setImmersiveMode(boolean z8);

    public abstract void setOnAdMetadataChangedListener(U1.a aVar);

    public abstract void setOnPaidEventListener(s sVar);

    public abstract void setServerSideVerificationOptions(e eVar);

    public abstract void show(Activity activity, t tVar);

    public static void load(final Context context, final String str, final AbstractC6615a abstractC6615a, final b bVar) {
        AbstractC5683p.checkNotNull(context, "Context cannot be null.");
        AbstractC5683p.checkNotNull(str, "AdUnitId cannot be null.");
        AbstractC5683p.checkNotNull(abstractC6615a, "AdManagerAdRequest cannot be null.");
        AbstractC5683p.checkNotNull(bVar, "LoadCallback cannot be null.");
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        AbstractC4439th.zza(context);
        if (((Boolean) AbstractC3872oi.zzl.zze()).booleanValue()) {
            if (((Boolean) C.zzc().zza(AbstractC4439th.zzlg)).booleanValue()) {
                L1.c.zzb.execute(new Runnable(context, str, abstractC6615a, bVar) { // from class: V1.c
                    public final /* synthetic */ Context zza;
                    public final /* synthetic */ String zzb;
                    public final /* synthetic */ AbstractC6615a zzc;
                    public final /* synthetic */ b zzd;

                    {
                        this.zzd = bVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = this.zza;
                        try {
                            new C2750es(context2, this.zzb);
                            throw null;
                        } catch (IllegalStateException e8) {
                            C4116qq.zza(context2).zzh(e8, "RewardedInterstitialAdManager.load");
                        }
                    }
                });
                return;
            }
        }
        new C2750es(context, str);
        throw null;
    }
}
