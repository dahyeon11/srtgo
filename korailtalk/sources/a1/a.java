package A1;

import A1.a;
import H1.C;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3872oi;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.C2076Xd;
import com.google.android.gms.internal.ads.C4116qq;
import i2.AbstractC5683p;
import y1.AbstractC6525f;
import y1.C6527h;
import y1.m;
import y1.s;
import y1.y;
import z1.AbstractC6615a;

/* loaded from: classes.dex */
public abstract class a {
    public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
    public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;

    /* renamed from: A1.a$a */
    public static abstract class AbstractC0004a extends AbstractC6525f {
    }

    @Deprecated
    public static void load(final Context context, final String str, final C6527h c6527h, final int i8, final AbstractC0004a abstractC0004a) {
        AbstractC5683p.checkNotNull(context, "Context cannot be null.");
        AbstractC5683p.checkNotNull(str, "adUnitId cannot be null.");
        AbstractC5683p.checkNotNull(c6527h, "AdRequest cannot be null.");
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        AbstractC4439th.zza(context);
        if (((Boolean) AbstractC3872oi.zzd.zze()).booleanValue()) {
            if (((Boolean) C.zzc().zza(AbstractC4439th.zzlg)).booleanValue()) {
                L1.c.zzb.execute(new Runnable() { // from class: A1.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        int i9 = i8;
                        String str2 = str;
                        C6527h c6527h2 = c6527h;
                        try {
                            new C2076Xd(context2, str2, c6527h2.zza(), i9, abstractC0004a).zza();
                        } catch (IllegalStateException e8) {
                            C4116qq.zza(context2).zzh(e8, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new C2076Xd(context, str, c6527h.zza(), i8, abstractC0004a).zza();
    }

    public abstract String getAdUnitId();

    public abstract m getFullScreenContentCallback();

    public abstract s getOnPaidEventListener();

    public abstract y getResponseInfo();

    public abstract void setFullScreenContentCallback(m mVar);

    public abstract void setImmersiveMode(boolean z8);

    public abstract void setOnPaidEventListener(s sVar);

    public abstract void show(Activity activity);

    public static void load(final Context context, final String str, final C6527h c6527h, final AbstractC0004a abstractC0004a) {
        AbstractC5683p.checkNotNull(context, "Context cannot be null.");
        AbstractC5683p.checkNotNull(str, "adUnitId cannot be null.");
        AbstractC5683p.checkNotNull(c6527h, "AdRequest cannot be null.");
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        AbstractC4439th.zza(context);
        if (((Boolean) AbstractC3872oi.zzd.zze()).booleanValue()) {
            if (((Boolean) C.zzc().zza(AbstractC4439th.zzlg)).booleanValue()) {
                L1.c.zzb.execute(new Runnable() { // from class: A1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        C6527h c6527h2 = c6527h;
                        try {
                            new C2076Xd(context2, str2, c6527h2.zza(), 3, abstractC0004a).zza();
                        } catch (IllegalStateException e8) {
                            C4116qq.zza(context2).zzh(e8, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new C2076Xd(context, str, c6527h.zza(), 3, abstractC0004a).zza();
    }

    @Deprecated
    public static void load(final Context context, final String str, final AbstractC6615a abstractC6615a, final int i8, final AbstractC0004a abstractC0004a) {
        AbstractC5683p.checkNotNull(context, "Context cannot be null.");
        AbstractC5683p.checkNotNull(str, "adUnitId cannot be null.");
        AbstractC5683p.checkNotNull(abstractC6615a, "AdManagerAdRequest cannot be null.");
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        AbstractC4439th.zza(context);
        if (((Boolean) AbstractC3872oi.zzd.zze()).booleanValue()) {
            if (((Boolean) C.zzc().zza(AbstractC4439th.zzlg)).booleanValue()) {
                L1.c.zzb.execute(new Runnable(context, str, abstractC6615a, i8, abstractC0004a) { // from class: A1.d
                    public final /* synthetic */ Context zza;
                    public final /* synthetic */ String zzb;
                    public final /* synthetic */ AbstractC6615a zzc;
                    public final /* synthetic */ int zzd;
                    public final /* synthetic */ a.AbstractC0004a zze;

                    {
                        this.zzd = i8;
                        this.zze = abstractC0004a;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        throw null;
                    }
                });
                return;
            }
        }
        throw null;
    }
}
