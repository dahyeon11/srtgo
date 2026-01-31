package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.q60, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4036q60 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f21857a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21858b;

    /* renamed from: c, reason: collision with root package name */
    private final PackageInfo f21859c;

    /* renamed from: d, reason: collision with root package name */
    private final C2523ct f21860d;

    public C4036q60(C2523ct c2523ct, Executor executor, String str, PackageInfo packageInfo, int i8) {
        this.f21860d = c2523ct;
        this.f21857a = executor;
        this.f21858b = str;
        this.f21859c = packageInfo;
    }

    final /* synthetic */ com.google.common.util.concurrent.C a(Throwable th) {
        return AbstractC1483In0.zzh(new C4149r60(this.f21858b));
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return AbstractC1483In0.zzf(AbstractC1483In0.zzm(AbstractC1483In0.zzh(this.f21858b), new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.o60
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                return new C4149r60((String) obj);
            }
        }, this.f21857a), Throwable.class, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.p60
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.a((Throwable) obj);
            }
        }, this.f21857a);
    }
}
