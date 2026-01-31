package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class Zx0 extends AbstractC2419by0 {

    /* renamed from: a */
    private int f17724a = 0;

    /* renamed from: b */
    private final int f17725b;

    /* renamed from: c */
    final /* synthetic */ AbstractC3677my0 f17726c;

    Zx0(AbstractC3677my0 abstractC3677my0) {
        this.f17726c = abstractC3677my0;
        this.f17725b = abstractC3677my0.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17724a < this.f17725b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2419by0, com.google.android.gms.internal.ads.InterfaceC2648dy0
    public final byte zza() {
        int i8 = this.f17724a;
        if (i8 >= this.f17725b) {
            throw new NoSuchElementException();
        }
        this.f17724a = i8 + 1;
        return this.f17726c.a(i8);
    }
}
