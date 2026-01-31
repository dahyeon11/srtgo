package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Jl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1520Jl0 extends AbstractC2171Zj0 {

    /* renamed from: f, reason: collision with root package name */
    final transient InterfaceC1843Rj0 f13692f;

    C1520Jl0(Map map, InterfaceC1843Rj0 interfaceC1843Rj0) {
        super(map);
        this.f13692f = interfaceC1843Rj0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4446tk0
    final Map c() {
        return k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4446tk0
    final Set d() {
        return l();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    @Override // com.google.android.gms.internal.ads.AbstractC4105qk0
    protected final /* bridge */ /* synthetic */ Collection e() {
        return this.f13692f.zza();
    }
}
