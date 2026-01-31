package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ql0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1806Ql0 extends AbstractC2967gl0 {

    /* renamed from: c, reason: collision with root package name */
    private final transient AbstractC2737el0 f16015c;

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f16016d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f16017e;

    C1806Ql0(AbstractC2737el0 abstractC2737el0, Object[] objArr, int i8, int i9) {
        this.f16015c = abstractC2737el0;
        this.f16016d = objArr;
        this.f16017e = i9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0
    final int a(Object[] objArr, int i8) {
        return zzd().a(objArr, i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f16015c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2967gl0
    final AbstractC2394bl0 f() {
        return new C1765Pl0(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2967gl0, com.google.android.gms.internal.ads.AbstractC2009Vk0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f16017e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2967gl0, com.google.android.gms.internal.ads.AbstractC2009Vk0
    /* renamed from: zze */
    public final AbstractC3311jm0 iterator() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0
    final boolean zzf() {
        return true;
    }
}
