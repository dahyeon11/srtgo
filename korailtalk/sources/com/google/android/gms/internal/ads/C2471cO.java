package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.cO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2471cO implements InterfaceC1799Qi {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f18303a = Q1.f.ASSET_NAME_VIDEO;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC2700eO f18304b;

    C2471cO(BinderC2700eO binderC2700eO, String str) {
        this.f18304b = binderC2700eO;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1799Qi
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1799Qi
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1799Qi
    public final void zzc() {
        BinderC2700eO binderC2700eO = this.f18304b;
        if (binderC2700eO.f18760d != null) {
            binderC2700eO.f18760d.zzF(this.f18303a);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1799Qi
    public final void zzd(MotionEvent motionEvent) {
    }
}
