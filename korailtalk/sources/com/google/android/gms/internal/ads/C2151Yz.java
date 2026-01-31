package com.google.android.gms.internal.ads;

import K1.InterfaceC0671x0;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Yz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2151Yz implements InterfaceC2069Wz {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0671x0 f17466a;

    public C2151Yz(InterfaceC0671x0 interfaceC0671x0) {
        this.f17466a = interfaceC0671x0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069Wz
    public final void zza(Map map) {
        this.f17466a.zzy(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
