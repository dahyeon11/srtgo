package M1;

import H1.C;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3872oi;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.C4116qq;
import com.google.android.gms.internal.ads.C4449tm;
import i2.AbstractC5683p;
import y1.C6527h;
import y1.m;
import y1.s;
import y1.y;

/* loaded from: classes.dex */
public abstract class a {
    public static void load(final Context context, final String str, final C6527h c6527h, final b bVar) {
        AbstractC5683p.checkNotNull(context, "Context cannot be null.");
        AbstractC5683p.checkNotNull(str, "AdUnitId cannot be null.");
        AbstractC5683p.checkNotNull(c6527h, "AdRequest cannot be null.");
        AbstractC5683p.checkNotNull(bVar, "LoadCallback cannot be null.");
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        AbstractC4439th.zza(context);
        if (((Boolean) AbstractC3872oi.zzi.zze()).booleanValue()) {
            if (((Boolean) C.zzc().zza(AbstractC4439th.zzlg)).booleanValue()) {
                L1.c.zzb.execute(new Runnable() { // from class: M1.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        C6527h c6527h2 = c6527h;
                        try {
                            new C4449tm(context2, str2).zza(c6527h2.zza(), bVar);
                        } catch (IllegalStateException e8) {
                            C4116qq.zza(context2).zzh(e8, "InterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new C4449tm(context, str).zza(c6527h.zza(), bVar);
    }

    public abstract String getAdUnitId();

    public abstract m getFullScreenContentCallback();

    public abstract s getOnPaidEventListener();

    public abstract y getResponseInfo();

    public abstract void setFullScreenContentCallback(m mVar);

    public abstract void setImmersiveMode(boolean z8);

    public abstract void setOnPaidEventListener(s sVar);

    public abstract void show(Activity activity);
}
