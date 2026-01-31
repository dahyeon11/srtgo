package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Ee, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1300Ee {

    /* renamed from: a, reason: collision with root package name */
    InterfaceC1787Qc f12836a;

    /* renamed from: b, reason: collision with root package name */
    boolean f12837b;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f12838c;

    public C1300Ee() {
        this.f12838c = L1.c.zzb;
    }

    public C1300Ee(final Context context) {
        ExecutorService executorService = L1.c.zzb;
        this.f12838c = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ze
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzeT)).booleanValue();
                C1300Ee c1300Ee = this.zza;
                Context context2 = context;
                if (zBooleanValue) {
                    try {
                        c1300Ee.f12836a = (InterfaceC1787Qc) L1.r.zzb(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new L1.p() { // from class: com.google.android.gms.internal.ads.Ae
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // L1.p
                            public final Object zza(Object obj) {
                                return AbstractBinderC1746Pc.zzb(obj);
                            }
                        });
                        c1300Ee.f12836a.zze(r2.b.wrap(context2), "GMA_SDK");
                        c1300Ee.f12837b = true;
                    } catch (L1.q | RemoteException | NullPointerException unused) {
                        L1.n.zze("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
