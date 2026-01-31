package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.rP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4186rP implements WF {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2065Wv f22462a;

    C4186rP(InterfaceC2065Wv interfaceC2065Wv) {
        this.f22462a = interfaceC2065Wv;
    }

    @Override // com.google.android.gms.internal.ads.WF
    public final void zzdj(Context context) {
        InterfaceC2065Wv interfaceC2065Wv = this.f22462a;
        if (interfaceC2065Wv != null) {
            interfaceC2065Wv.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.WF
    public final void zzdl(Context context) {
        InterfaceC2065Wv interfaceC2065Wv = this.f22462a;
        if (interfaceC2065Wv != null) {
            interfaceC2065Wv.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.WF
    public final void zzdm(Context context) {
        InterfaceC2065Wv interfaceC2065Wv = this.f22462a;
        if (interfaceC2065Wv != null) {
            interfaceC2065Wv.onResume();
        }
    }
}
