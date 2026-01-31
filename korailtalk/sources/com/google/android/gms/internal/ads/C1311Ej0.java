package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ej0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1311Ej0 implements Serializable, InterfaceC1229Cj0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f12852a;

    public final boolean equals(Object obj) {
        if (obj instanceof C1311Ej0) {
            return this.f12852a.equals(((C1311Ej0) obj).f12852a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12852a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append("and(");
        boolean z8 = true;
        for (Object obj : this.f12852a) {
            if (!z8) {
                sb.append(',');
            }
            sb.append(obj);
            z8 = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1229Cj0
    public final boolean zza(Object obj) {
        for (int i8 = 0; i8 < this.f12852a.size(); i8++) {
            if (!((InterfaceC1229Cj0) this.f12852a.get(i8)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
