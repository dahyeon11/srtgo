package z1;

import H1.C;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3872oi;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.C4116qq;
import com.google.android.gms.internal.ads.C4449tm;
import i2.AbstractC5683p;

/* renamed from: z1.c */
/* loaded from: classes.dex */
public abstract class AbstractC6617c extends M1.a {
    public static void load(final Context context, final String str, final AbstractC6615a abstractC6615a, final d dVar) {
        AbstractC5683p.checkNotNull(context, "Context cannot be null.");
        AbstractC5683p.checkNotNull(str, "AdUnitId cannot be null.");
        AbstractC5683p.checkNotNull(abstractC6615a, "AdManagerAdRequest cannot be null.");
        AbstractC5683p.checkNotNull(dVar, "LoadCallback cannot be null.");
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        AbstractC4439th.zza(context);
        if (((Boolean) AbstractC3872oi.zzi.zze()).booleanValue()) {
            if (((Boolean) C.zzc().zza(AbstractC4439th.zzlg)).booleanValue()) {
                L1.c.zzb.execute(new Runnable(context, str, abstractC6615a, dVar) { // from class: z1.g
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
                            new C4449tm(context2, this.zzb);
                            throw null;
                        } catch (IllegalStateException e8) {
                            C4116qq.zza(context2).zzh(e8, "AdManagerInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new C4449tm(context, str);
        throw null;
    }

    public abstract e getAppEventListener();

    public abstract void setAppEventListener(e eVar);
}
