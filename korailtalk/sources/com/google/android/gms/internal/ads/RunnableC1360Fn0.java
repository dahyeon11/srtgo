package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.Fn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1360Fn0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final Future f13069a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC1319En0 f13070b;

    RunnableC1360Fn0(Future future, InterfaceC1319En0 interfaceC1319En0) {
        this.f13069a = future;
        this.f13070b = interfaceC1319En0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable thZza;
        Object obj = this.f13069a;
        if ((obj instanceof AbstractC3657mo0) && (thZza = AbstractC3771no0.zza((AbstractC3657mo0) obj)) != null) {
            this.f13070b.zza(thZza);
            return;
        }
        try {
            this.f13070b.zzb(AbstractC1483In0.zzp(this.f13069a));
        } catch (ExecutionException e8) {
            this.f13070b.zza(e8.getCause());
        } catch (Throwable th) {
            this.f13070b.zza(th);
        }
    }

    public final String toString() {
        C4330sj0 c4330sj0Zza = AbstractC4444tj0.zza(this);
        c4330sj0Zza.zza(this.f13070b);
        return c4330sj0Zza.toString();
    }
}
