package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.bE0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2338bE0 extends AbstractC1804Qk0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f18106a;

    public C2338bE0(Map map) {
        this.f18106a = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1845Rk0
    protected final /* synthetic */ Object a() {
        return this.f18106a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1804Qk0
    protected final Map b() {
        return this.f18106a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1804Qk0, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1804Qk0, java.util.Map
    public final boolean containsValue(Object obj) {
        return super.d(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1804Qk0, java.util.Map
    public final Set entrySet() {
        return AbstractC2854fm0.zzc(this.f18106a.entrySet(), new InterfaceC1229Cj0() { // from class: com.google.android.gms.internal.ads.RD0
            @Override // com.google.android.gms.internal.ads.InterfaceC1229Cj0
            public final boolean zza(Object obj) {
                return ((Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1804Qk0, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && super.e(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1804Qk0, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f18106a.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1804Qk0, java.util.Map
    public final int hashCode() {
        return super.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1804Qk0, java.util.Map
    public final boolean isEmpty() {
        if (this.f18106a.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1804Qk0, java.util.Map
    public final Set keySet() {
        return AbstractC2854fm0.zzc(this.f18106a.keySet(), new InterfaceC1229Cj0() { // from class: com.google.android.gms.internal.ads.aE0
            @Override // com.google.android.gms.internal.ads.InterfaceC1229Cj0
            public final boolean zza(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1804Qk0, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
