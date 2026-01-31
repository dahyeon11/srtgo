package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.gm0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2969gm0 extends AbstractC2967gl0 {

    /* renamed from: c, reason: collision with root package name */
    final transient Object f19396c;

    C2969gm0(Object obj) {
        obj.getClass();
        this.f19396c = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0
    final int a(Object[] objArr, int i8) {
        objArr[i8] = this.f19396c;
        return i8 + 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f19396c.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2967gl0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f19396c.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2967gl0, com.google.android.gms.internal.ads.AbstractC2009Vk0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C3423kl0(this.f19396c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f19396c.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2967gl0, com.google.android.gms.internal.ads.AbstractC2009Vk0
    public final AbstractC2394bl0 zzd() {
        return AbstractC2394bl0.zzn(this.f19396c);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2967gl0, com.google.android.gms.internal.ads.AbstractC2009Vk0
    /* renamed from: zze */
    public final AbstractC3311jm0 iterator() {
        return new C3423kl0(this.f19396c);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0
    final boolean zzf() {
        return false;
    }
}
