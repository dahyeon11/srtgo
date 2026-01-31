package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Rl0 */
/* loaded from: classes2.dex */
final class C1847Rl0 extends AbstractC2967gl0 {

    /* renamed from: c */
    private final transient AbstractC2737el0 f16151c;

    /* renamed from: d */
    private final transient AbstractC2394bl0 f16152d;

    C1847Rl0(AbstractC2737el0 abstractC2737el0, AbstractC2394bl0 abstractC2394bl0) {
        this.f16151c = abstractC2737el0;
        this.f16152d = abstractC2394bl0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0
    final int a(Object[] objArr, int i8) {
        return this.f16152d.a(objArr, i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f16151c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2967gl0, com.google.android.gms.internal.ads.AbstractC2009Vk0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f16152d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f16151c.size();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2967gl0, com.google.android.gms.internal.ads.AbstractC2009Vk0
    public final AbstractC2394bl0 zzd() {
        return this.f16152d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2967gl0, com.google.android.gms.internal.ads.AbstractC2009Vk0
    /* renamed from: zze */
    public final AbstractC3311jm0 iterator() {
        return this.f16152d.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0
    final boolean zzf() {
        return true;
    }
}
