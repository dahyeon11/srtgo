package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.sM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4294sM implements InterfaceC1799Qi {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ QM f22624a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewGroup f22625b;

    C4294sM(QM qm, ViewGroup viewGroup) {
        this.f22624a = qm;
        this.f22625b = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1799Qi
    public final JSONObject zza() {
        return this.f22624a.zzo();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1799Qi
    public final JSONObject zzb() {
        return this.f22624a.zzp();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1799Qi
    public final void zzc() {
        AbstractC2394bl0 abstractC2394bl0 = ViewTreeObserverOnGlobalLayoutListenerC3953pM.zza;
        Map mapZzm = this.f22624a.zzm();
        if (mapZzm == null) {
            return;
        }
        int size = abstractC2394bl0.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = mapZzm.get((String) abstractC2394bl0.get(i8));
            i8++;
            if (obj != null) {
                this.f22624a.onClick(this.f22625b);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1799Qi
    public final void zzd(MotionEvent motionEvent) {
        this.f22624a.onTouch(null, motionEvent);
    }
}
