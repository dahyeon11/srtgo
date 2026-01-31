package z1;

import H1.C;
import H1.X;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.internal.ads.AbstractC3872oi;
import com.google.android.gms.internal.ads.AbstractC4439th;
import i2.AbstractC5683p;
import y1.C6514A;
import y1.C6515B;
import y1.C6528i;
import y1.l;

/* renamed from: z1.b */
/* loaded from: classes.dex */
public final class C6616b extends l {
    public C6616b(Context context) {
        super(context, 0);
        AbstractC5683p.checkNotNull(context, "Context cannot be null");
    }

    final /* synthetic */ void a(AbstractC6615a abstractC6615a) {
        throw null;
    }

    public C6528i[] getAdSizes() {
        return this.f37588a.zzC();
    }

    public e getAppEventListener() {
        return this.f37588a.zzh();
    }

    public C6514A getVideoController() {
        return this.f37588a.zzf();
    }

    public C6515B getVideoOptions() {
        return this.f37588a.zzg();
    }

    public void loadAd(final AbstractC6615a abstractC6615a) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        AbstractC4439th.zza(getContext());
        if (((Boolean) AbstractC3872oi.zzf.zze()).booleanValue()) {
            if (((Boolean) C.zzc().zza(AbstractC4439th.zzlg)).booleanValue()) {
                L1.c.zzb.execute(new Runnable(abstractC6615a) { // from class: z1.f
                    public final /* synthetic */ AbstractC6615a zzb;

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.a(null);
                    }
                });
                return;
            }
        }
        throw null;
    }

    public void recordManualImpression() {
        this.f37588a.zzo();
    }

    public void setAdSizes(C6528i... c6528iArr) {
        if (c6528iArr == null || c6528iArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f37588a.zzt(c6528iArr);
    }

    public void setAppEventListener(e eVar) {
        this.f37588a.zzv(eVar);
    }

    public void setManualImpressionsEnabled(boolean z8) {
        this.f37588a.zzw(z8);
    }

    public void setVideoOptions(C6515B c6515b) {
        this.f37588a.zzy(c6515b);
    }

    public final boolean zzb(X x8) {
        return this.f37588a.zzz(x8);
    }

    public C6616b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, true);
        AbstractC5683p.checkNotNull(context, "Context cannot be null");
    }

    public C6616b(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8, 0, true);
        AbstractC5683p.checkNotNull(context, "Context cannot be null");
    }
}
