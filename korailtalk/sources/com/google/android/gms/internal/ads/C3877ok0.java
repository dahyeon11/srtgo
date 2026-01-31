package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.ads.ok0 */
/* loaded from: classes2.dex */
final class C3877ok0 extends C3649mk0 implements ListIterator {

    /* renamed from: d */
    final /* synthetic */ C3991pk0 f21556d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3877ok0(C3991pk0 c3991pk0) {
        super(c3991pk0);
        this.f21556d = c3991pk0;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean zIsEmpty = this.f21556d.isEmpty();
        a();
        ((ListIterator) this.f20976a).add(obj);
        this.f21556d.f21801f.f21985e++;
        if (zIsEmpty) {
            this.f21556d.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f20976a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f20976a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f20976a).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f20976a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f20976a).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3877ok0(C3991pk0 c3991pk0, int i8) {
        super(c3991pk0, ((List) c3991pk0.f21333b).listIterator(i8));
        this.f21556d = c3991pk0;
    }
}
