package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.cT, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2478cT implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f18310a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f18311b;

    public C2478cT(XD0 xd0, XD0 xd02) {
        this.f18310a = xd0;
        this.f18311b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* synthetic */ Object zzb() {
        C2263ad0 c2263ad0 = (C2263ad0) this.f18310a.zzb();
        final CookieManager cookieManagerZza = G1.u.zzq().zza((Context) this.f18311b.zzb());
        C1829Rc0 c1829Rc0Zzi = AbstractC1543Kc0.zza(new Callable() { // from class: com.google.android.gms.internal.ads.ZS
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = cookieManagerZza;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) H1.C.zzc().zza(AbstractC4439th.zzaO));
            }
        }, EnumC1952Uc0.WEBVIEW_COOKIE, c2263ad0).zzi(1L, TimeUnit.SECONDS);
        final InterfaceC1215Cc0 interfaceC1215Cc0 = new InterfaceC1215Cc0() { // from class: com.google.android.gms.internal.ads.aT
            @Override // com.google.android.gms.internal.ads.InterfaceC1215Cc0
            public final Object zza(Object obj) {
                return "";
            }
        };
        return c1829Rc0Zzi.zzc(Exception.class, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.Lc0
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return AbstractC1483In0.zzh("");
            }
        }).zza();
    }
}
