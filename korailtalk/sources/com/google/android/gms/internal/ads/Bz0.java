package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
final class Bz0 extends Dz0 {
    /* synthetic */ Bz0(Az0 az0) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.Dz0
    final List a(Object obj, long j8) {
        InterfaceC3679mz0 interfaceC3679mz0 = (InterfaceC3679mz0) MA0.p(obj, j8);
        if (interfaceC3679mz0.zzc()) {
            return interfaceC3679mz0;
        }
        int size = interfaceC3679mz0.size();
        InterfaceC3679mz0 interfaceC3679mz0Zzf = interfaceC3679mz0.zzf(size == 0 ? 10 : size + size);
        MA0.D(obj, j8, interfaceC3679mz0Zzf);
        return interfaceC3679mz0Zzf;
    }

    @Override // com.google.android.gms.internal.ads.Dz0
    final void b(Object obj, long j8) {
        ((InterfaceC3679mz0) MA0.p(obj, j8)).zzb();
    }

    @Override // com.google.android.gms.internal.ads.Dz0
    final void c(Object obj, Object obj2, long j8) {
        InterfaceC3679mz0 interfaceC3679mz0Zzf = (InterfaceC3679mz0) MA0.p(obj, j8);
        InterfaceC3679mz0 interfaceC3679mz0 = (InterfaceC3679mz0) MA0.p(obj2, j8);
        int size = interfaceC3679mz0Zzf.size();
        int size2 = interfaceC3679mz0.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC3679mz0Zzf.zzc()) {
                interfaceC3679mz0Zzf = interfaceC3679mz0Zzf.zzf(size2 + size);
            }
            interfaceC3679mz0Zzf.addAll(interfaceC3679mz0);
        }
        if (size > 0) {
            interfaceC3679mz0 = interfaceC3679mz0Zzf;
        }
        MA0.D(obj, j8, interfaceC3679mz0);
    }
}
