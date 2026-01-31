package com.google.android.gms.internal.ads;

import i2.AbstractC5683p;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.vl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4675vl implements InterfaceC2278al {

    /* renamed from: a, reason: collision with root package name */
    private final C3734nS f23305a;

    public C4675vl(C3734nS c3734nS) {
        AbstractC5683p.checkNotNull(c3734nS, "The Inspector Manager must not be null");
        this.f23305a = c3734nS;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final void zza(Object obj, Map map) throws NumberFormatException {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j8 = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j8 = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.f23305a.zzi((String) map.get("extras"), j8);
    }
}
