package y1;

import H1.C0537g1;
import H1.InterfaceC0517a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.AbstractC3872oi;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.C4116qq;
import i2.AbstractC5683p;

/* loaded from: classes.dex */
public abstract class l extends ViewGroup {

    /* renamed from: a */
    protected final C0537g1 f37588a;

    protected l(Context context, int i8) {
        super(context);
        this.f37588a = new C0537g1(this, i8);
    }

    public void destroy() {
        AbstractC4439th.zza(getContext());
        if (((Boolean) AbstractC3872oi.zze.zze()).booleanValue()) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzld)).booleanValue()) {
                L1.c.zzb.execute(new Runnable() { // from class: y1.F
                    @Override // java.lang.Runnable
                    public final void run() {
                        l lVar = this.zza;
                        try {
                            lVar.f37588a.zzk();
                        } catch (IllegalStateException e8) {
                            C4116qq.zza(lVar.getContext()).zzh(e8, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.f37588a.zzk();
    }

    public AbstractC6524e getAdListener() {
        return this.f37588a.zza();
    }

    public C6528i getAdSize() {
        return this.f37588a.zzb();
    }

    public String getAdUnitId() {
        return this.f37588a.zzj();
    }

    public s getOnPaidEventListener() {
        this.f37588a.zzc();
        return null;
    }

    public y getResponseInfo() {
        return this.f37588a.zzd();
    }

    public boolean isCollapsible() {
        return this.f37588a.zzA();
    }

    public boolean isLoading() {
        return this.f37588a.zzB();
    }

    public void loadAd(final C6527h c6527h) {
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        AbstractC4439th.zza(getContext());
        if (((Boolean) AbstractC3872oi.zzf.zze()).booleanValue()) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlg)).booleanValue()) {
                L1.c.zzb.execute(new Runnable() { // from class: y1.H
                    @Override // java.lang.Runnable
                    public final void run() {
                        l lVar = this.zza;
                        try {
                            lVar.f37588a.zzm(c6527h.f37577a);
                        } catch (IllegalStateException e8) {
                            C4116qq.zza(lVar.getContext()).zzh(e8, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.f37588a.zzm(c6527h.f37577a);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i12 = ((i10 - i8) - measuredWidth) / 2;
        int i13 = ((i11 - i9) - measuredHeight) / 2;
        childAt.layout(i12, i13, measuredWidth + i12, measuredHeight + i13);
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        C6528i adSize;
        int heightInPixels;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e8) {
                L1.n.zzh("Unable to retrieve ad size.", e8);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                heightInPixels = adSize.getHeightInPixels(context);
                measuredWidth = widthInPixels;
            } else {
                heightInPixels = 0;
            }
        } else {
            measureChild(childAt, i8, i9);
            measuredWidth = childAt.getMeasuredWidth();
            heightInPixels = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i8), View.resolveSize(Math.max(heightInPixels, getSuggestedMinimumHeight()), i9));
    }

    public void pause() {
        AbstractC4439th.zza(getContext());
        if (((Boolean) AbstractC3872oi.zzg.zze()).booleanValue()) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzle)).booleanValue()) {
                L1.c.zzb.execute(new Runnable() { // from class: y1.G
                    @Override // java.lang.Runnable
                    public final void run() {
                        l lVar = this.zza;
                        try {
                            lVar.f37588a.zzn();
                        } catch (IllegalStateException e8) {
                            C4116qq.zza(lVar.getContext()).zzh(e8, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.f37588a.zzn();
    }

    public void resume() {
        AbstractC4439th.zza(getContext());
        if (((Boolean) AbstractC3872oi.zzh.zze()).booleanValue()) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlc)).booleanValue()) {
                L1.c.zzb.execute(new Runnable() { // from class: y1.E
                    @Override // java.lang.Runnable
                    public final void run() {
                        l lVar = this.zza;
                        try {
                            lVar.f37588a.zzp();
                        } catch (IllegalStateException e8) {
                            C4116qq.zza(lVar.getContext()).zzh(e8, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.f37588a.zzp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(AbstractC6524e abstractC6524e) {
        this.f37588a.zzr(abstractC6524e);
        if (abstractC6524e == 0) {
            this.f37588a.zzq(null);
            return;
        }
        if (abstractC6524e instanceof InterfaceC0517a) {
            this.f37588a.zzq((InterfaceC0517a) abstractC6524e);
        }
        if (abstractC6524e instanceof z1.e) {
            this.f37588a.zzv((z1.e) abstractC6524e);
        }
    }

    public void setAdSize(C6528i c6528i) {
        this.f37588a.zzs(c6528i);
    }

    public void setAdUnitId(String str) {
        this.f37588a.zzu(str);
    }

    public void setOnPaidEventListener(s sVar) {
        this.f37588a.zzx(sVar);
    }

    protected l(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet);
        this.f37588a = new C0537g1(this, attributeSet, false, i8);
    }

    protected l(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8);
        this.f37588a = new C0537g1(this, attributeSet, false, i9);
    }

    protected l(Context context, AttributeSet attributeSet, int i8, int i9, boolean z8) {
        super(context, attributeSet, i8);
        this.f37588a = new C0537g1(this, attributeSet, z8, i9);
    }

    protected l(Context context, AttributeSet attributeSet, boolean z8) {
        super(context, attributeSet);
        this.f37588a = new C0537g1(this, attributeSet, z8);
    }
}
