package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.x00, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4821x00 {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f23593a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final C5098zP f23594b;

    public C4821x00(C5098zP c5098zP) {
        this.f23594b = c5098zP;
    }

    public final InterfaceC1852Ro zza(String str) {
        if (this.f23593a.containsKey(str)) {
            return (InterfaceC1852Ro) this.f23593a.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        try {
            this.f23593a.put(str, this.f23594b.zzb(str));
        } catch (RemoteException e8) {
            AbstractC0667v0.zzb("Couldn't create RTB adapter : ", e8);
        }
    }
}
