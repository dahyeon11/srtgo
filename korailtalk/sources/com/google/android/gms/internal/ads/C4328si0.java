package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.si0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4328si0 implements InterfaceC3002h20 {
    protected C4328si0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3002h20
    public final long zza() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3002h20
    public final InterfaceC4721w70 zzb(Looper looper, Handler.Callback callback) {
        return new C2007Vj0(new Handler(looper, callback));
    }
}
