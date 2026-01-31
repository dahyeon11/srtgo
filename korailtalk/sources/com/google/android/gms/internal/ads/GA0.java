package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class GA0 extends AbstractList implements RandomAccess, InterfaceC4932xz0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4932xz0 f13116a;

    public GA0(InterfaceC4932xz0 interfaceC4932xz0) {
        this.f13116a = interfaceC4932xz0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i8) {
        return ((C4818wz0) this.f13116a).get(i8);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new FA0(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i8) {
        return new EA0(this, i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13116a.size();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4932xz0
    public final InterfaceC4932xz0 zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4932xz0
    public final Object zze(int i8) {
        return this.f13116a.zze(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4932xz0
    public final List zzh() {
        return this.f13116a.zzh();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4932xz0
    public final void zzi(AbstractC3677my0 abstractC3677my0) {
        throw new UnsupportedOperationException();
    }
}
