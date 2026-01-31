package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.Ll0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1602Ll0 extends AbstractC1683Nl0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final C1602Ll0 f14350a = new C1602Ll0();

    private C1602Ll0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1683Nl0, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1683Nl0
    public final AbstractC1683Nl0 zza() {
        return C2011Vl0.f16894a;
    }
}
