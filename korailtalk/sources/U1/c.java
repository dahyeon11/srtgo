package U1;

import H1.C;
import L1.n;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.AbstractC3872oi;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.C1938Tr;
import com.google.android.gms.internal.ads.C4116qq;
import i2.AbstractC5683p;
import y1.C6527h;
import y1.m;
import y1.s;
import y1.t;
import y1.y;
import z1.AbstractC6615a;

/* loaded from: classes.dex */
public abstract class c {
    public static void load(final Context context, final String str, final C6527h c6527h, final d dVar) {
        AbstractC5683p.checkNotNull(context, "Context cannot be null.");
        AbstractC5683p.checkNotNull(str, "AdUnitId cannot be null.");
        AbstractC5683p.checkNotNull(c6527h, "AdRequest cannot be null.");
        AbstractC5683p.checkNotNull(dVar, "LoadCallback cannot be null.");
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        AbstractC4439th.zza(context);
        if (((Boolean) AbstractC3872oi.zzl.zze()).booleanValue()) {
            if (((Boolean) C.zzc().zza(AbstractC4439th.zzlg)).booleanValue()) {
                L1.c.zzb.execute(new Runnable() { // from class: U1.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        C6527h c6527h2 = c6527h;
                        try {
                            new C1938Tr(context2, str2).zza(c6527h2.zza(), dVar);
                        } catch (IllegalStateException e8) {
                            C4116qq.zza(context2).zzh(e8, "RewardedAd.load");
                        }
                    }
                });
                return;
            }
        }
        n.zze("Loading on UI thread");
        new C1938Tr(context, str).zza(c6527h.zza(), dVar);
    }

    public abstract Bundle getAdMetadata();

    public abstract String getAdUnitId();

    public abstract m getFullScreenContentCallback();

    public abstract a getOnAdMetadataChangedListener();

    public abstract s getOnPaidEventListener();

    public abstract y getResponseInfo();

    public abstract b getRewardItem();

    public abstract void setFullScreenContentCallback(m mVar);

    public abstract void setImmersiveMode(boolean z8);

    public abstract void setOnAdMetadataChangedListener(a aVar);

    public abstract void setOnPaidEventListener(s sVar);

    public abstract void setServerSideVerificationOptions(e eVar);

    public abstract void show(Activity activity, t tVar);

    public static void load(final Context context, final String str, final AbstractC6615a abstractC6615a, final d dVar) {
        AbstractC5683p.checkNotNull(context, "Context cannot be null.");
        AbstractC5683p.checkNotNull(str, "AdUnitId cannot be null.");
        AbstractC5683p.checkNotNull(abstractC6615a, "AdManagerAdRequest cannot be null.");
        AbstractC5683p.checkNotNull(dVar, "LoadCallback cannot be null.");
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        AbstractC4439th.zza(context);
        if (((Boolean) AbstractC3872oi.zzl.zze()).booleanValue()) {
            if (((Boolean) C.zzc().zza(AbstractC4439th.zzlg)).booleanValue()) {
                n.zze("Loading on background thread");
                L1.c.zzb.execute(new Runnable(context, str, abstractC6615a, dVar) { // from class: U1.g
                    public final /* synthetic */ Context zza;
                    public final /* synthetic */ String zzb;
                    public final /* synthetic */ AbstractC6615a zzc;
                    public final /* synthetic */ d zzd;

                    {
                        this.zzd = dVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = this.zza;
                        try {
                            new C1938Tr(context2, this.zzb);
                            throw null;
                        } catch (IllegalStateException e8) {
                            C4116qq.zza(context2).zzh(e8, "RewardedAd.loadAdManager");
                        }
                    }
                });
                return;
            }
        }
        n.zze("Loading on UI thread");
        new C1938Tr(context, str);
        throw null;
    }
}
