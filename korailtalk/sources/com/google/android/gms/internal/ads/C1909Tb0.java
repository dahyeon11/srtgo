package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Tb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1909Tb0 implements InterfaceC1827Rb0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16498a;

    public C1909Tb0(String str) {
        this.f16498a = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1827Rb0
    public final boolean equals(Object obj) {
        if (obj instanceof C1909Tb0) {
            return this.f16498a.equals(((C1909Tb0) obj).f16498a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1827Rb0
    public final int hashCode() {
        return this.f16498a.hashCode();
    }

    public final String toString() {
        return this.f16498a;
    }
}
