package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: com.google.android.gms.internal.ads.Zi0 */
/* loaded from: classes2.dex */
final class ServiceConnectionC2169Zi0 implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C2275aj0 f17628a;

    /* synthetic */ ServiceConnectionC2169Zi0(C2275aj0 c2275aj0, AbstractC2128Yi0 abstractC2128Yi0) {
        this.f17628a = c2275aj0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f17628a.f18008b.zzc("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f17628a.zzc().post(new C2046Wi0(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f17628a.f18008b.zzc("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f17628a.zzc().post(new C2087Xi0(this));
    }
}
