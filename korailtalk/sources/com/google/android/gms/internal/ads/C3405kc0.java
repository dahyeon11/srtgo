package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kc0 */
/* loaded from: classes2.dex */
public final class C3405kc0 {

    /* renamed from: a */
    private final InterfaceC2490cc0 f20437a;

    /* renamed from: b */
    private final com.google.common.util.concurrent.C f20438b;

    /* renamed from: c */
    private boolean f20439c = false;

    /* renamed from: d */
    private boolean f20440d = false;

    public C3405kc0(final InterfaceC1418Hb0 interfaceC1418Hb0, final InterfaceC2376bc0 interfaceC2376bc0, final InterfaceC2490cc0 interfaceC2490cc0) {
        this.f20437a = interfaceC2490cc0;
        this.f20438b = AbstractC1483In0.zzf(AbstractC1483In0.zzn(interfaceC2376bc0.zza(interfaceC2490cc0), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.ic0
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.a(interfaceC2376bc0, interfaceC1418Hb0, interfaceC2490cc0, (C1786Qb0) obj);
            }
        }, interfaceC2490cc0.zzb()), Exception.class, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.jc0
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.b(interfaceC2376bc0, (Exception) obj);
            }
        }, interfaceC2490cc0.zzb());
    }

    final /* synthetic */ com.google.common.util.concurrent.C a(InterfaceC2376bc0 interfaceC2376bc0, InterfaceC1418Hb0 interfaceC1418Hb0, InterfaceC2490cc0 interfaceC2490cc0, C1786Qb0 c1786Qb0) {
        synchronized (this) {
            try {
                this.f20440d = true;
                interfaceC2376bc0.zzb(c1786Qb0);
                if (this.f20439c) {
                    return AbstractC1483In0.zzh(new C2261ac0(c1786Qb0, interfaceC2490cc0));
                }
                interfaceC1418Hb0.zzd(interfaceC2490cc0.zza(), c1786Qb0);
                return AbstractC1483In0.zzh(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ com.google.common.util.concurrent.C b(InterfaceC2376bc0 interfaceC2376bc0, Exception exc) {
        synchronized (this) {
            this.f20440d = true;
            throw exc;
        }
    }

    public final synchronized com.google.common.util.concurrent.C zza(InterfaceC2490cc0 interfaceC2490cc0) {
        if (!this.f20440d && !this.f20439c && this.f20437a.zza() != null && interfaceC2490cc0.zza() != null && this.f20437a.zza().equals(interfaceC2490cc0.zza())) {
            this.f20439c = true;
            return this.f20438b;
        }
        return null;
    }

    public final synchronized void zzd(InterfaceC1319En0 interfaceC1319En0) {
        AbstractC1483In0.zzr(AbstractC1483In0.zzn(this.f20438b, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.hc0
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return AbstractC1483In0.zzi();
            }
        }, this.f20437a.zzb()), interfaceC1319En0, this.f20437a.zzb());
    }
}
