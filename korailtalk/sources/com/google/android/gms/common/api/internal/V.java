package com.google.android.gms.common.api.internal;

import f2.C5394d;
import h2.AbstractC5603u;
import h2.C5585b;
import i2.AbstractC5681n;

/* loaded from: classes.dex */
final class V {

    /* renamed from: a, reason: collision with root package name */
    private final C5585b f11966a;

    /* renamed from: b, reason: collision with root package name */
    private final C5394d f11967b;

    /* synthetic */ V(C5585b c5585b, C5394d c5394d, AbstractC5603u abstractC5603u) {
        this.f11966a = c5585b;
        this.f11967b = c5394d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof V)) {
            V v8 = (V) obj;
            if (AbstractC5681n.equal(this.f11966a, v8.f11966a) && AbstractC5681n.equal(this.f11967b, v8.f11967b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC5681n.hashCode(this.f11966a, this.f11967b);
    }

    public final String toString() {
        return AbstractC5681n.toStringHelper(this).add("key", this.f11966a).add("feature", this.f11967b).toString();
    }
}
