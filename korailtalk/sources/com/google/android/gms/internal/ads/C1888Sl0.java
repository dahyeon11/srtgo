package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Sl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1888Sl0 extends AbstractC2394bl0 {

    /* renamed from: c, reason: collision with root package name */
    private final transient Object[] f16329c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f16330d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f16331e;

    C1888Sl0(Object[] objArr, int i8, int i9) {
        this.f16329c = objArr;
        this.f16330d = i8;
        this.f16331e = i9;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        AbstractC1188Bj0.zza(i8, this.f16331e, "index");
        Object obj = this.f16329c[i8 + i8 + this.f16330d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16331e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0
    final boolean zzf() {
        return true;
    }
}
