package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.oD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3821oD {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f21434a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f21435b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.common.util.concurrent.C f21436c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f21437d = true;

    public C3821oD(Executor executor, ScheduledExecutorService scheduledExecutorService, com.google.common.util.concurrent.C c9) {
        this.f21434a = executor;
        this.f21435b = scheduledExecutorService;
        this.f21436c = c9;
    }

    static /* bridge */ /* synthetic */ void b(final C3821oD c3821oD, List list, final InterfaceC1319En0 interfaceC1319En0) {
        if (list == null || list.isEmpty()) {
            c3821oD.f21434a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.iD
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC1319En0.zza(new RS(3));
                }
            });
            return;
        }
        com.google.common.util.concurrent.C cZzh = AbstractC1483In0.zzh(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final com.google.common.util.concurrent.C c9 = (com.google.common.util.concurrent.C) it.next();
            cZzh = AbstractC1483In0.zzn(AbstractC1483In0.zzf(cZzh, Throwable.class, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.kD
                @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
                public final com.google.common.util.concurrent.C zza(Object obj) {
                    interfaceC1319En0.zza((Throwable) obj);
                    return AbstractC1483In0.zzh(null);
                }
            }, c3821oD.f21434a), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.lD
                @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
                public final com.google.common.util.concurrent.C zza(Object obj) {
                    return this.zza.a(interfaceC1319En0, c9, (YC) obj);
                }
            }, c3821oD.f21434a);
        }
        AbstractC1483In0.zzr(cZzh, new C3707nD(c3821oD, interfaceC1319En0), c3821oD.f21434a);
    }

    final /* synthetic */ com.google.common.util.concurrent.C a(InterfaceC1319En0 interfaceC1319En0, com.google.common.util.concurrent.C c9, YC yc) {
        if (yc != null) {
            interfaceC1319En0.zzb(yc);
        }
        return AbstractC1483In0.zzo(c9, ((Long) AbstractC1267Di.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.f21435b);
    }

    final /* synthetic */ void d() {
        this.f21437d = false;
    }

    public final void zze(InterfaceC1319En0 interfaceC1319En0) {
        AbstractC1483In0.zzr(this.f21436c, new C3593mD(this, interfaceC1319En0), this.f21434a);
    }

    public final boolean zzf() {
        return this.f21437d;
    }
}
