package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.nM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3725nM extends AbstractBinderC3646mj implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, QM {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f21245a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f21246b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f21247c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f21248d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private NL f21249e;

    /* renamed from: f, reason: collision with root package name */
    private ViewOnAttachStateChangeListenerC2033Wc f21250f;

    public ViewTreeObserverOnGlobalLayoutListenerC3725nM(View view, HashMap map, HashMap map2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        G1.u.zzx();
        C1531Jt.zza(view, this);
        G1.u.zzx();
        C1531Jt.zzb(view, this);
        this.f21245a = new WeakReference(view);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.f21246b.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f21248d.putAll(this.f21246b);
        for (Map.Entry entry2 : map2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.f21247c.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.f21248d.putAll(this.f21247c);
        this.f21250f = new ViewOnAttachStateChangeListenerC2033Wc(view.getContext(), view);
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        NL nl = this.f21249e;
        if (nl != null) {
            nl.zzD(view, zzf(), zzl(), zzm(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        NL nl = this.f21249e;
        if (nl != null) {
            nl.zzB(zzf(), zzl(), zzm(), NL.zzX(zzf()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        NL nl = this.f21249e;
        if (nl != null) {
            nl.zzB(zzf(), zzl(), zzm(), NL.zzX(zzf()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        NL nl = this.f21249e;
        if (nl != null) {
            nl.zzK(view, motionEvent, zzf());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3646mj, com.google.android.gms.internal.ads.InterfaceC3760nj
    public final synchronized void zzb(InterfaceC6172a interfaceC6172a) {
        try {
            if (this.f21249e != null) {
                Object objUnwrap = r2.b.unwrap(interfaceC6172a);
                if (!(objUnwrap instanceof View)) {
                    L1.n.zzj("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                }
                this.f21249e.zzM((View) objUnwrap);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3646mj, com.google.android.gms.internal.ads.InterfaceC3760nj
    public final synchronized void zzc(InterfaceC6172a interfaceC6172a) {
        Object objUnwrap = r2.b.unwrap(interfaceC6172a);
        if (!(objUnwrap instanceof NL)) {
            L1.n.zzj("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        NL nl = this.f21249e;
        if (nl != null) {
            nl.zzS(this);
        }
        NL nl2 = (NL) objUnwrap;
        if (!nl2.zzT()) {
            L1.n.zzg("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        this.f21249e = nl2;
        nl2.zzR(this);
        this.f21249e.zzJ(zzf());
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3646mj, com.google.android.gms.internal.ads.InterfaceC3760nj
    public final synchronized void zzd() {
        NL nl = this.f21249e;
        if (nl != null) {
            nl.zzS(this);
            this.f21249e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.QM
    public final View zzf() {
        return (View) this.f21245a.get();
    }

    @Override // com.google.android.gms.internal.ads.QM
    public final synchronized View zzg(String str) {
        WeakReference weakReference = (WeakReference) this.f21248d.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.QM
    public final FrameLayout zzh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.QM
    public final ViewOnAttachStateChangeListenerC2033Wc zzi() {
        return this.f21250f;
    }

    @Override // com.google.android.gms.internal.ads.QM
    public final synchronized InterfaceC6172a zzj() {
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.QM
    public final synchronized String zzk() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.QM
    public final synchronized Map zzl() {
        return this.f21248d;
    }

    @Override // com.google.android.gms.internal.ads.QM
    public final synchronized Map zzm() {
        return this.f21246b;
    }

    @Override // com.google.android.gms.internal.ads.QM
    public final synchronized Map zzn() {
        return this.f21247c;
    }

    @Override // com.google.android.gms.internal.ads.QM
    public final synchronized JSONObject zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.QM
    public final synchronized JSONObject zzp() {
        NL nl = this.f21249e;
        if (nl == null) {
            return null;
        }
        return nl.zzk(zzf(), zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.QM
    public final synchronized void zzq(String str, View view, boolean z8) {
        this.f21248d.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.f21246b.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }
}
