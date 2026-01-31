package com.google.android.gms.internal.ads;

import H1.C0591z;
import K1.AbstractC0630c0;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.kakao.sdk.user.Constants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class OM {

    /* renamed from: a, reason: collision with root package name */
    private final C3275jP f15105a;

    /* renamed from: b, reason: collision with root package name */
    private final C4754wO f15106b;

    /* renamed from: c, reason: collision with root package name */
    private ViewTreeObserver.OnScrollChangedListener f15107c = null;

    public OM(C3275jP c3275jP, C4754wO c4754wO) {
        this.f15105a = c3275jP;
        this.f15106b = c4754wO;
    }

    private static final int e(Context context, String str, int i8) throws NumberFormatException {
        try {
            i8 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        C0591z.zzb();
        return L1.g.zzy(context, i8);
    }

    final /* synthetic */ void a(InterfaceC2065Wv interfaceC2065Wv, Map map) {
        this.f15106b.zzj("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void b(WindowManager windowManager, View view, InterfaceC2065Wv interfaceC2065Wv, Map map) {
        L1.n.zze("Hide native ad policy validator overlay.");
        interfaceC2065Wv.zzF().setVisibility(8);
        if (interfaceC2065Wv.zzF().getWindowToken() != null) {
            windowManager.removeView(interfaceC2065Wv.zzF());
        }
        interfaceC2065Wv.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.f15107c == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.f15107c);
    }

    final /* synthetic */ void c(Map map, boolean z8, int i8, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "validatorHtmlLoaded");
        map2.put(Constants.ID, (String) map.get(Constants.ID));
        this.f15106b.zzj("sendMessageToNativeJs", map2);
    }

    final /* synthetic */ void d(final View view, final WindowManager windowManager, final InterfaceC2065Wv interfaceC2065Wv, final Map map) throws NumberFormatException {
        interfaceC2065Wv.zzN().zzB(new InterfaceC1779Pw() { // from class: com.google.android.gms.internal.ads.NM
            @Override // com.google.android.gms.internal.ads.InterfaceC1779Pw
            public final void zza(boolean z8, int i8, String str, String str2) {
                this.zza.c(map, z8, i8, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int iE = e(context, (String) map.get("validator_width"), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzig)).intValue());
        int iE2 = e(context, (String) map.get("validator_height"), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzih)).intValue());
        int iE3 = e(context, (String) map.get("validator_x"), 0);
        int iE4 = e(context, (String) map.get("validator_y"), 0);
        interfaceC2065Wv.zzaj(C1943Tw.zzb(iE, iE2));
        try {
            interfaceC2065Wv.zzG().getSettings().setUseWideViewPort(((Boolean) H1.C.zzc().zza(AbstractC4439th.zzii)).booleanValue());
            interfaceC2065Wv.zzG().getSettings().setLoadWithOverviewMode(((Boolean) H1.C.zzc().zza(AbstractC4439th.zzij)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams layoutParamsZzb = AbstractC0630c0.zzb();
        layoutParamsZzb.x = iE3;
        layoutParamsZzb.y = iE4;
        windowManager.updateViewLayout(interfaceC2065Wv.zzF(), layoutParamsZzb);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i8 = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - iE4;
            this.f15107c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.MM
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        InterfaceC2065Wv interfaceC2065Wv2 = interfaceC2065Wv;
                        if (interfaceC2065Wv2.zzF().getWindowToken() == null) {
                            return;
                        }
                        int i9 = i8;
                        WindowManager.LayoutParams layoutParams = layoutParamsZzb;
                        String str2 = str;
                        if ("1".equals(str2) || "2".equals(str2)) {
                            layoutParams.y = rect2.bottom - i9;
                        } else {
                            layoutParams.y = rect2.top - i9;
                        }
                        windowManager.updateViewLayout(interfaceC2065Wv2.zzF(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.f15107c);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        interfaceC2065Wv.loadUrl(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zza(final View view, final WindowManager windowManager) {
        InterfaceC2065Wv interfaceC2065WvZza = this.f15105a.zza(H1.d2.zzc(), null, null);
        View view2 = (View) interfaceC2065WvZza;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        interfaceC2065WvZza.zzag("/sendMessageToSdk", new InterfaceC2278al() { // from class: com.google.android.gms.internal.ads.IM
            @Override // com.google.android.gms.internal.ads.InterfaceC2278al
            public final void zza(Object obj, Map map) {
                this.zza.a((InterfaceC2065Wv) obj, map);
            }
        });
        interfaceC2065WvZza.zzag("/hideValidatorOverlay", new InterfaceC2278al() { // from class: com.google.android.gms.internal.ads.JM
            @Override // com.google.android.gms.internal.ads.InterfaceC2278al
            public final void zza(Object obj, Map map) {
                this.zza.b(windowManager, view, (InterfaceC2065Wv) obj, map);
            }
        });
        interfaceC2065WvZza.zzag("/open", new C3764nl(null, null, null, null, null));
        this.f15106b.zzm(new WeakReference(interfaceC2065WvZza), "/loadNativeAdPolicyViolations", new InterfaceC2278al() { // from class: com.google.android.gms.internal.ads.KM
            @Override // com.google.android.gms.internal.ads.InterfaceC2278al
            public final void zza(Object obj, Map map) throws NumberFormatException {
                this.zza.d(view, windowManager, (InterfaceC2065Wv) obj, map);
            }
        });
        this.f15106b.zzm(new WeakReference(interfaceC2065WvZza), "/showValidatorOverlay", new InterfaceC2278al() { // from class: com.google.android.gms.internal.ads.LM
            @Override // com.google.android.gms.internal.ads.InterfaceC2278al
            public final void zza(Object obj, Map map) {
                L1.n.zze("Show native ad policy validator overlay.");
                ((InterfaceC2065Wv) obj).zzF().setVisibility(0);
            }
        });
        return (View) interfaceC2065WvZza;
    }
}
