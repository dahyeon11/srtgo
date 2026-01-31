package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.Vl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2011Vl0 extends AbstractC1683Nl0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final C2011Vl0 f16894a = new C2011Vl0();

    private C2011Vl0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1683Nl0, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
