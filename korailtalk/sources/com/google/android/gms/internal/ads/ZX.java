package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.d;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class ZX implements InterfaceC3171iX {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17575a;

    /* renamed from: b, reason: collision with root package name */
    private final EK f17576b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f17577c;

    /* renamed from: d, reason: collision with root package name */
    private final C4540ua0 f17578d;

    public ZX(Context context, Executor executor, EK ek, C4540ua0 c4540ua0) {
        this.f17575a = context;
        this.f17576b = ek;
        this.f17577c = executor;
        this.f17578d = c4540ua0;
    }

    private static String b(C4654va0 c4654va0) {
        try {
            return c4654va0.zzw.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    final /* synthetic */ com.google.common.util.concurrent.C a(Uri uri, C1457Ia0 c1457Ia0, C4654va0 c4654va0, Object obj) {
        try {
            androidx.browser.customtabs.d dVarBuild = new d.a().build();
            dVarBuild.intent.setData(uri);
            J1.j jVar = new J1.j(dVarBuild.intent, null);
            final C1203Bt c1203Bt = new C1203Bt();
            AbstractC2578dK abstractC2578dKZze = this.f17576b.zze(new C3935pD(c1457Ia0, c4654va0, null), new C2922gK(new MK() { // from class: com.google.android.gms.internal.ads.XX
                @Override // com.google.android.gms.internal.ads.MK
                public final void zza(boolean z8, Context context, MF mf) {
                    C1203Bt c1203Bt2 = c1203Bt;
                    try {
                        G1.u.zzi();
                        J1.v.zza(context, (AdOverlayInfoParcel) c1203Bt2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            c1203Bt.zzc(new AdOverlayInfoParcel(jVar, null, abstractC2578dKZze.zza(), null, new L1.a(0, 0, false), null, null));
            this.f17578d.zza();
            return AbstractC1483In0.zzh(abstractC2578dKZze.zzg());
        } catch (Throwable th) {
            L1.n.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171iX
    public final com.google.common.util.concurrent.C zza(final C1457Ia0 c1457Ia0, final C4654va0 c4654va0) {
        String strB = b(c4654va0);
        final Uri uri = strB != null ? Uri.parse(strB) : null;
        return AbstractC1483In0.zzn(AbstractC1483In0.zzh(null), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.WX
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.a(uri, c1457Ia0, c4654va0, obj);
            }
        }, this.f17577c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171iX
    public final boolean zzb(C1457Ia0 c1457Ia0, C4654va0 c4654va0) {
        Context context = this.f17575a;
        return (context instanceof Activity) && C1838Rh.zzg(context) && !TextUtils.isEmpty(b(c4654va0));
    }
}
