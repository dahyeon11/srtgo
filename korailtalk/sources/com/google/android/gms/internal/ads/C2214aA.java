package com.google.android.gms.internal.ads;

import K1.InterfaceC0671x0;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.aA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2214aA implements InterfaceC2069Wz {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0671x0 f17910a;

    public C2214aA(InterfaceC0671x0 interfaceC0671x0) {
        this.f17910a = interfaceC0671x0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069Wz
    public final void zza(Map map) {
        this.f17910a.zzA(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}
