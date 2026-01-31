package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Pl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1765Pl0 extends AbstractC2394bl0 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C1806Ql0 f15405c;

    C1765Pl0(C1806Ql0 c1806Ql0) {
        this.f15405c = c1806Ql0;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i8) {
        AbstractC1188Bj0.zza(i8, this.f15405c.f16017e, "index");
        int i9 = i8 + i8;
        Object obj = this.f15405c.f16016d[i9];
        Objects.requireNonNull(obj);
        Object obj2 = this.f15405c.f16016d[i9 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15405c.f16017e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0
    public final boolean zzf() {
        return true;
    }
}
