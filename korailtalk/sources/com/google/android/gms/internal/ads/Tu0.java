package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class Tu0 {

    /* renamed from: a, reason: collision with root package name */
    private final Mu0 f16541a;

    /* renamed from: b, reason: collision with root package name */
    private final List f16542b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f16543c;

    /* synthetic */ Tu0(Mu0 mu0, List list, Integer num, Su0 su0) {
        this.f16541a = mu0;
        this.f16542b = list;
        this.f16543c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Tu0)) {
            return false;
        }
        Tu0 tu0 = (Tu0) obj;
        return this.f16541a.equals(tu0.f16541a) && this.f16542b.equals(tu0.f16542b) && Objects.equals(this.f16543c, tu0.f16543c);
    }

    public final int hashCode() {
        return Objects.hash(this.f16541a, this.f16542b);
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f16541a, this.f16542b, this.f16543c);
    }
}
