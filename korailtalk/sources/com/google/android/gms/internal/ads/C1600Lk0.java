package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.Lk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1600Lk0 extends AbstractC1683Nl0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Comparator f14349a;

    C1600Lk0(Comparator comparator) {
        this.f14349a = comparator;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1683Nl0, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f14349a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1600Lk0) {
            return this.f14349a.equals(((C1600Lk0) obj).f14349a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14349a.hashCode();
    }

    public final String toString() {
        return this.f14349a.toString();
    }
}
