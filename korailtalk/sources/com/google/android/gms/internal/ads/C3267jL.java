package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.jL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3267jL implements InterfaceC2278al {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f20234a;

    /* synthetic */ C3267jL(C3837oL c3837oL, AbstractC3154iL abstractC3154iL) {
        this.f20234a = new WeakReference(c3837oL);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final void zza(Object obj, Map map) {
        C3837oL c3837oL = (C3837oL) this.f20234a.get();
        if (c3837oL != null && "_ac".equals((String) map.get("eventName"))) {
            c3837oL.f21457h.onAdClicked();
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkM)).booleanValue()) {
                c3837oL.f21458i.zzdG();
                if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    return;
                }
                c3837oL.f21458i.zzdf();
            }
        }
    }
}
