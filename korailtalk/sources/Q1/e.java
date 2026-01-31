package Q1;

import H1.C;
import H1.C0581v1;
import H1.C0591z;
import L1.n;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.InterfaceC2962gj;
import r2.InterfaceC6172a;
import y1.o;

/* loaded from: classes.dex */
public final class e extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final FrameLayout f4015a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2962gj f4016b;

    public e(Context context) {
        super(context);
        this.f4015a = d(context);
        this.f4016b = e();
    }

    private final FrameLayout d(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final InterfaceC2962gj e() {
        if (isInEditMode()) {
            return null;
        }
        FrameLayout frameLayout = this.f4015a;
        return C0591z.zza().zzh(frameLayout.getContext(), this, frameLayout);
    }

    private final void f(String str, View view) {
        InterfaceC2962gj interfaceC2962gj = this.f4016b;
        if (interfaceC2962gj == null) {
            return;
        }
        try {
            interfaceC2962gj.zzdv(str, r2.b.wrap(view));
        } catch (RemoteException e8) {
            n.zzh("Unable to call setAssetView on delegate", e8);
        }
    }

    protected final View a(String str) {
        InterfaceC2962gj interfaceC2962gj = this.f4016b;
        if (interfaceC2962gj != null) {
            try {
                InterfaceC6172a interfaceC6172aZzb = interfaceC2962gj.zzb(str);
                if (interfaceC6172aZzb != null) {
                    return (View) r2.b.unwrap(interfaceC6172aZzb);
                }
            } catch (RemoteException e8) {
                n.zzh("Unable to call getAssetView on delegate", e8);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i8, layoutParams);
        super.bringChildToFront(this.f4015a);
    }

    final /* synthetic */ void b(o oVar) {
        InterfaceC2962gj interfaceC2962gj = this.f4016b;
        if (interfaceC2962gj == null) {
            return;
        }
        try {
            if (oVar instanceof C0581v1) {
                interfaceC2962gj.zzdx(((C0581v1) oVar).zzc());
            } else if (oVar == null) {
                interfaceC2962gj.zzdx(null);
            } else {
                n.zze("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e8) {
            n.zzh("Unable to call setMediaContent on delegate", e8);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f4015a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    final /* synthetic */ void c(ImageView.ScaleType scaleType) {
        InterfaceC2962gj interfaceC2962gj = this.f4016b;
        if (interfaceC2962gj == null || scaleType == null) {
            return;
        }
        try {
            interfaceC2962gj.zzdy(r2.b.wrap(scaleType));
        } catch (RemoteException e8) {
            n.zzh("Unable to call setMediaViewImageScaleType on delegate", e8);
        }
    }

    public void destroy() {
        InterfaceC2962gj interfaceC2962gj = this.f4016b;
        if (interfaceC2962gj == null) {
            return;
        }
        try {
            interfaceC2962gj.zzc();
        } catch (RemoteException e8) {
            n.zzh("Unable to destroy native ad view", e8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f4016b != null) {
            if (((Boolean) C.zzc().zza(AbstractC4439th.zzlA)).booleanValue()) {
                try {
                    this.f4016b.zzd(r2.b.wrap(motionEvent));
                } catch (RemoteException e8) {
                    n.zzh("Unable to call handleTouchEvent on delegate", e8);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public a getAdChoicesView() {
        View viewA = a("3011");
        if (viewA instanceof a) {
            return (a) viewA;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return a("3005");
    }

    public final View getBodyView() {
        return a("3004");
    }

    public final View getCallToActionView() {
        return a("3002");
    }

    public final View getHeadlineView() {
        return a("3001");
    }

    public final View getIconView() {
        return a("3003");
    }

    public final View getImageView() {
        return a("3008");
    }

    public final b getMediaView() {
        View viewA = a("3010");
        if (viewA instanceof b) {
            return (b) viewA;
        }
        if (viewA == null) {
            return null;
        }
        n.zze("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return a("3007");
    }

    public final View getStarRatingView() {
        return a("3009");
    }

    public final View getStoreView() {
        return a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i8) {
        super.onVisibilityChanged(view, i8);
        InterfaceC2962gj interfaceC2962gj = this.f4016b;
        if (interfaceC2962gj == null) {
            return;
        }
        try {
            interfaceC2962gj.zze(r2.b.wrap(view), i8);
        } catch (RemoteException e8) {
            n.zzh("Unable to call onVisibilityChanged on delegate", e8);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f4015a);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f4015a == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(a aVar) {
        f("3011", aVar);
    }

    public final void setAdvertiserView(View view) {
        f("3005", view);
    }

    public final void setBodyView(View view) {
        f("3004", view);
    }

    public final void setCallToActionView(View view) {
        f("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        InterfaceC2962gj interfaceC2962gj = this.f4016b;
        if (interfaceC2962gj == null) {
            return;
        }
        try {
            interfaceC2962gj.zzdw(r2.b.wrap(view));
        } catch (RemoteException e8) {
            n.zzh("Unable to call setClickConfirmingView on delegate", e8);
        }
    }

    public final void setHeadlineView(View view) {
        f("3001", view);
    }

    public final void setIconView(View view) {
        f("3003", view);
    }

    public final void setImageView(View view) {
        f("3008", view);
    }

    public final void setMediaView(b bVar) {
        f("3010", bVar);
        if (bVar == null) {
            return;
        }
        bVar.a(new h(this));
        bVar.b(new i(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, r2.a] */
    public void setNativeAd(c cVar) {
        InterfaceC2962gj interfaceC2962gj = this.f4016b;
        if (interfaceC2962gj == 0) {
            return;
        }
        try {
            interfaceC2962gj.zzdz(cVar.a());
        } catch (RemoteException e8) {
            n.zzh("Unable to call setNativeAd on delegate", e8);
        }
    }

    public final void setPriceView(View view) {
        f("3007", view);
    }

    public final void setStarRatingView(View view) {
        f("3009", view);
    }

    public final void setStoreView(View view) {
        f("3006", view);
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4015a = d(context);
        this.f4016b = e();
    }

    public e(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f4015a = d(context);
        this.f4016b = e();
    }

    public e(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        this.f4015a = d(context);
        this.f4016b = e();
    }
}
