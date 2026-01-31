package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Wi0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2046Wi0 extends AbstractRunnableC1759Pi0 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ IBinder f17061b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ServiceConnectionC2169Zi0 f17062c;

    C2046Wi0(ServiceConnectionC2169Zi0 serviceConnectionC2169Zi0, IBinder iBinder) {
        this.f17061b = iBinder;
        this.f17062c = serviceConnectionC2169Zi0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1759Pi0
    public final void zza() throws RemoteException {
        this.f17062c.f17628a.f18019m = AbstractBinderC2846fi0.zzb(this.f17061b);
        C2275aj0.n(this.f17062c.f17628a);
        this.f17062c.f17628a.f18013g = false;
        Iterator it = this.f17062c.f17628a.f18010d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f17062c.f17628a.f18010d.clear();
    }
}
