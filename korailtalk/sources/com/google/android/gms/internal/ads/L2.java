package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: classes2.dex */
public final class L2 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f14146a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L2)) {
            return false;
        }
        L2 l22 = (L2) obj;
        if (AbstractC2281am0.zza >= 24) {
            return this.f14146a.equals(l22.f14146a);
        }
        if (this.f14146a.size() != l22.f14146a.size()) {
            return false;
        }
        for (int i8 = 0; i8 < this.f14146a.size(); i8++) {
            if (zza(i8) != l22.zza(i8)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (AbstractC2281am0.zza >= 24) {
            return this.f14146a.hashCode();
        }
        int size = this.f14146a.size();
        for (int i8 = 0; i8 < this.f14146a.size(); i8++) {
            size = (size * 31) + zza(i8);
        }
        return size;
    }

    public final int zza(int i8) {
        F10.zza(i8, 0, this.f14146a.size());
        return this.f14146a.keyAt(i8);
    }

    public final int zzb() {
        return this.f14146a.size();
    }

    public final boolean zzc(int i8) {
        return this.f14146a.get(i8);
    }
}
