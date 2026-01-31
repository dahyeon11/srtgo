package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* renamed from: com.google.android.gms.internal.ads.vh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4668vh0 implements Closeable {
    static /* synthetic */ Integer b() {
        return -1;
    }

    public static C1430Hh0 zza() {
        return new C1430Hh0();
    }

    public static C1430Hh0 zzb(final int i8, InterfaceC1389Gh0 interfaceC1389Gh0) {
        return new C1430Hh0(new InterfaceC1843Rj0() { // from class: com.google.android.gms.internal.ads.th0
            @Override // com.google.android.gms.internal.ads.InterfaceC1843Rj0
            public final Object zza() {
                return Integer.valueOf(i8);
            }
        }, new InterfaceC1843Rj0() { // from class: com.google.android.gms.internal.ads.uh0
            @Override // com.google.android.gms.internal.ads.InterfaceC1843Rj0
            public final Object zza() {
                return AbstractC4668vh0.b();
            }
        }, interfaceC1389Gh0);
    }

    public static C1430Hh0 zzc(InterfaceC1843Rj0 interfaceC1843Rj0, InterfaceC1843Rj0 interfaceC1843Rj02, InterfaceC1389Gh0 interfaceC1389Gh0) {
        return new C1430Hh0(interfaceC1843Rj0, interfaceC1843Rj02, interfaceC1389Gh0);
    }
}
