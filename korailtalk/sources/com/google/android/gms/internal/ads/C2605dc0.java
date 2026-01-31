package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* renamed from: com.google.android.gms.internal.ads.dc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2605dc0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1418Hb0 f18642a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2376bc0 f18643b;

    /* renamed from: c, reason: collision with root package name */
    private final C1213Cb0 f18644c;

    /* renamed from: e, reason: collision with root package name */
    private C3405kc0 f18646e;

    /* renamed from: f, reason: collision with root package name */
    private int f18647f = 1;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque f18645d = new ArrayDeque();

    public C2605dc0(InterfaceC1418Hb0 interfaceC1418Hb0, C1213Cb0 c1213Cb0, InterfaceC2376bc0 interfaceC2376bc0) {
        this.f18642a = interfaceC1418Hb0;
        this.f18644c = c1213Cb0;
        this.f18643b = interfaceC2376bc0;
        c1213Cb0.zzb(new C2114Yb0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void f() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgy)).booleanValue() && !G1.u.zzo().zzi().zzh().zzh()) {
            this.f18645d.clear();
            return;
        }
        if (g()) {
            while (!this.f18645d.isEmpty()) {
                InterfaceC2490cc0 interfaceC2490cc0 = (InterfaceC2490cc0) this.f18645d.pollFirst();
                if (interfaceC2490cc0 == null || (interfaceC2490cc0.zza() != null && this.f18642a.zze(interfaceC2490cc0.zza()))) {
                    C3405kc0 c3405kc0 = new C3405kc0(this.f18642a, this.f18643b, interfaceC2490cc0);
                    this.f18646e = c3405kc0;
                    c3405kc0.zzd(new C2155Zb0(this, interfaceC2490cc0));
                    return;
                }
            }
        }
    }

    private final synchronized boolean g() {
        return this.f18646e == null;
    }

    final /* synthetic */ void d() {
        synchronized (this) {
            this.f18647f = 1;
            f();
        }
    }

    public final synchronized com.google.common.util.concurrent.C zza(InterfaceC2490cc0 interfaceC2490cc0) {
        this.f18647f = 2;
        if (g()) {
            return null;
        }
        return this.f18646e.zza(interfaceC2490cc0);
    }

    public final synchronized void zze(InterfaceC2490cc0 interfaceC2490cc0) {
        this.f18645d.add(interfaceC2490cc0);
    }
}
