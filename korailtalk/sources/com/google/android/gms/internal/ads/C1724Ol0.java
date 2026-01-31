package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Ol0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1724Ol0 extends AbstractC2394bl0 {

    /* renamed from: e, reason: collision with root package name */
    static final AbstractC2394bl0 f15149e = new C1724Ol0(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f15150c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f15151d;

    C1724Ol0(Object[] objArr, int i8) {
        this.f15150c = objArr;
        this.f15151d = i8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2394bl0, com.google.android.gms.internal.ads.AbstractC2009Vk0
    final int a(Object[] objArr, int i8) {
        System.arraycopy(this.f15150c, 0, objArr, i8, this.f15151d);
        return i8 + this.f15151d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0
    final int b() {
        return this.f15151d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0
    final int c() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0
    final Object[] d() {
        return this.f15150c;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        AbstractC1188Bj0.zza(i8, this.f15151d, "index");
        Object obj = this.f15150c[i8];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15151d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0
    final boolean zzf() {
        return false;
    }
}
