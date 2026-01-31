package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.Wl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2052Wl0 extends AbstractC1683Nl0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final AbstractC1683Nl0 f17065a;

    C2052Wl0(AbstractC1683Nl0 abstractC1683Nl0) {
        this.f17065a = abstractC1683Nl0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1683Nl0, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f17065a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2052Wl0) {
            return this.f17065a.equals(((C2052Wl0) obj).f17065a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f17065a.hashCode();
    }

    public final String toString() {
        return this.f17065a.toString().concat(".reverse()");
    }
}
