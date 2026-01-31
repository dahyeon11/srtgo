package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.ads.bL0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2352bL0 {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f18115a;
    public final int zza;
    public final NM0 zzb;

    private C2352bL0(CopyOnWriteArrayList copyOnWriteArrayList, int i8, NM0 nm0) {
        this.f18115a = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = nm0;
    }

    public final C2352bL0 zza(int i8, NM0 nm0) {
        return new C2352bL0(this.f18115a, 0, nm0);
    }

    public final void zzb(Handler handler, InterfaceC2466cL0 interfaceC2466cL0) {
        this.f18115a.add(new C2237aL0(handler, interfaceC2466cL0));
    }

    public final void zzc(InterfaceC2466cL0 interfaceC2466cL0) {
        Iterator it = this.f18115a.iterator();
        while (it.hasNext()) {
            C2237aL0 c2237aL0 = (C2237aL0) it.next();
            if (c2237aL0.zzb == interfaceC2466cL0) {
                this.f18115a.remove(c2237aL0);
            }
        }
    }

    public C2352bL0() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
