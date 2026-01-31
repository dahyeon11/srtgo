package com.google.android.gms.internal.ads;

import H1.InterfaceC0583w0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import r2.InterfaceC6172a;

/* loaded from: classes2.dex */
public final class VM implements InterfaceC2353bM {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3087ho f16835a;

    /* renamed from: b, reason: collision with root package name */
    private final TF f16836b;

    /* renamed from: c, reason: collision with root package name */
    private final C4850xF f16837c;

    /* renamed from: d, reason: collision with root package name */
    private final BJ f16838d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f16839e;

    /* renamed from: f, reason: collision with root package name */
    private final C4654va0 f16840f;

    /* renamed from: g, reason: collision with root package name */
    private final L1.a f16841g;

    /* renamed from: h, reason: collision with root package name */
    private final C1825Ra0 f16842h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16843i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f16844j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16845k = true;

    /* renamed from: l, reason: collision with root package name */
    private final C2513co f16846l;

    /* renamed from: m, reason: collision with root package name */
    private final C2742eo f16847m;

    public VM(C2513co c2513co, C2742eo c2742eo, InterfaceC3087ho interfaceC3087ho, TF tf, C4850xF c4850xF, BJ bj, Context context, C4654va0 c4654va0, L1.a aVar, C1825Ra0 c1825Ra0) {
        this.f16846l = c2513co;
        this.f16847m = c2742eo;
        this.f16835a = interfaceC3087ho;
        this.f16836b = tf;
        this.f16837c = c4850xF;
        this.f16838d = bj;
        this.f16839e = context;
        this.f16840f = c4654va0;
        this.f16841g = aVar;
        this.f16842h = c1825Ra0;
    }

    private final void a(View view) {
        try {
            InterfaceC3087ho interfaceC3087ho = this.f16835a;
            if (interfaceC3087ho != null && !interfaceC3087ho.zzA()) {
                this.f16835a.zzw(r2.b.wrap(view));
                this.f16837c.onAdClicked();
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkM)).booleanValue()) {
                    this.f16838d.zzdG();
                    return;
                }
                return;
            }
            C2513co c2513co = this.f16846l;
            if (c2513co != null && !c2513co.zzx()) {
                this.f16846l.zzs(r2.b.wrap(view));
                this.f16837c.onAdClicked();
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkM)).booleanValue()) {
                    this.f16838d.zzdG();
                    return;
                }
                return;
            }
            C2742eo c2742eo = this.f16847m;
            if (c2742eo == null || c2742eo.zzv()) {
                return;
            }
            this.f16847m.zzq(r2.b.wrap(view));
            this.f16837c.onAdClicked();
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkM)).booleanValue()) {
                this.f16838d.zzdG();
            }
        } catch (RemoteException e8) {
            L1.n.zzk("Failed to call handleClick", e8);
        }
    }

    private static final HashMap b(Map map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            synchronized (map) {
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        View view = (View) ((WeakReference) entry.getValue()).get();
                        if (view != null) {
                            map2.put((String) entry.getKey(), view);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return map2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final boolean zzA() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final boolean zzB() {
        return this.f16840f.zzM;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final boolean zzC(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzj(H1.A0 a02) {
        L1.n.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzk(View view, View view2, Map map, Map map2, boolean z8, ImageView.ScaleType scaleType) {
        if (this.f16844j && this.f16840f.zzM) {
            return;
        }
        a(view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzm(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzo(View view, View view2, Map map, Map map2, boolean z8, ImageView.ScaleType scaleType, int i8) {
        if (!this.f16844j) {
            L1.n.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.f16840f.zzM) {
            a(view2);
        } else {
            L1.n.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzq(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.f16843i) {
                this.f16843i = G1.u.zzs().zzn(this.f16839e, this.f16841g.afmaVersion, this.f16840f.zzD.toString(), this.f16842h.zzf);
            }
            if (this.f16845k) {
                InterfaceC3087ho interfaceC3087ho = this.f16835a;
                if (interfaceC3087ho != null && !interfaceC3087ho.zzB()) {
                    this.f16835a.zzx();
                    this.f16836b.zza();
                    return;
                }
                C2513co c2513co = this.f16846l;
                if (c2513co != null && !c2513co.zzy()) {
                    this.f16846l.zzt();
                    this.f16836b.zza();
                    return;
                }
                C2742eo c2742eo = this.f16847m;
                if (c2742eo == null || c2742eo.zzw()) {
                    return;
                }
                this.f16847m.zzr();
                this.f16836b.zza();
            }
        } catch (RemoteException e8) {
            L1.n.zzk("Failed to call recordImpression", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzr() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzs(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzt(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzu(View view) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzv() {
        this.f16844j = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzw(InterfaceC0583w0 interfaceC0583w0) {
        L1.n.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzx(InterfaceC2129Yj interfaceC2129Yj) {
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf A[Catch: RemoteException -> 0x002b, JSONException -> 0x0047, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0047, blocks: (B:49:0x00b4, B:50:0x00c9, B:52:0x00cf), top: B:73:0x00b4 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzy(android.view.View r9, java.util.Map r10, java.util.Map r11, android.view.View.OnTouchListener r12, android.view.View.OnClickListener r13) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.VM.zzy(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzz(View view, Map map) {
        try {
            InterfaceC6172a interfaceC6172aWrap = r2.b.wrap(view);
            InterfaceC3087ho interfaceC3087ho = this.f16835a;
            if (interfaceC3087ho != null) {
                interfaceC3087ho.zzz(interfaceC6172aWrap);
                return;
            }
            C2513co c2513co = this.f16846l;
            if (c2513co != null) {
                c2513co.zzw(interfaceC6172aWrap);
                return;
            }
            C2742eo c2742eo = this.f16847m;
            if (c2742eo != null) {
                c2742eo.zzu(interfaceC6172aWrap);
            }
        } catch (RemoteException e8) {
            L1.n.zzk("Failed to call untrackView", e8);
        }
    }
}
