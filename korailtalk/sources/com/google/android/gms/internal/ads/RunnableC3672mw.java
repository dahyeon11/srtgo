package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3672mw implements Runnable {
    public final /* synthetic */ InterfaceC2065Wv zza;

    public /* synthetic */ RunnableC3672mw(InterfaceC2065Wv interfaceC2065Wv) {
        this.zza = interfaceC2065Wv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.destroy();
    }
}
