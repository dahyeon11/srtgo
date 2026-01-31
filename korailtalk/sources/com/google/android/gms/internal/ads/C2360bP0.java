package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.ads.bP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2360bP0 {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f18132a = new CopyOnWriteArrayList();

    public final void zza(Handler handler, InterfaceC2474cP0 interfaceC2474cP0) {
        zzc(interfaceC2474cP0);
        this.f18132a.add(new C2245aP0(handler, interfaceC2474cP0));
    }

    public final void zzb(final int i8, final long j8, final long j9) {
        Iterator it = this.f18132a.iterator();
        while (it.hasNext()) {
            final C2245aP0 c2245aP0 = (C2245aP0) it.next();
            if (!c2245aP0.f17946c) {
                c2245aP0.f17944a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ZO0
                    @Override // java.lang.Runnable
                    public final void run() {
                        c2245aP0.f17945b.zzX(i8, j8, j9);
                    }
                });
            }
        }
    }

    public final void zzc(InterfaceC2474cP0 interfaceC2474cP0) {
        Iterator it = this.f18132a.iterator();
        while (it.hasNext()) {
            C2245aP0 c2245aP0 = (C2245aP0) it.next();
            if (c2245aP0.f17945b == interfaceC2474cP0) {
                c2245aP0.zzc();
                this.f18132a.remove(c2245aP0);
            }
        }
    }
}
