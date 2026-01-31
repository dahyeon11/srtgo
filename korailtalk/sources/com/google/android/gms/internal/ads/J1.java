package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: classes2.dex */
public final class J1 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f13563a = new SparseBooleanArray();

    /* renamed from: b, reason: collision with root package name */
    private boolean f13564b;

    public final J1 zza(int i8) {
        F10.zzf(!this.f13564b);
        this.f13563a.append(i8, true);
        return this;
    }

    public final L2 zzb() {
        F10.zzf(!this.f13564b);
        this.f13564b = true;
        return new L2(this.f13563a, null);
    }
}
