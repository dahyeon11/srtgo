package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class T10 implements N50 {

    /* renamed from: a */
    private final InterfaceExecutorServiceC1974Un0 f16379a;

    /* renamed from: b */
    private final C1825Ra0 f16380b;

    /* renamed from: c */
    private final C3062hb0 f16381c;

    T10(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, C1825Ra0 c1825Ra0, C3062hb0 c3062hb0) {
        this.f16379a = interfaceExecutorServiceC1974Un0;
        this.f16380b = c1825Ra0;
        this.f16381c = c3062hb0;
    }

    final /* synthetic */ U10 a() {
        String strZza = null;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhr)).booleanValue() && "requester_type_2".equals(R1.W.zzc(this.f16380b.zzd))) {
            strZza = C3062hb0.zza();
        }
        return new U10(strZza);
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return this.f16379a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.S10
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.a();
            }
        });
    }
}
