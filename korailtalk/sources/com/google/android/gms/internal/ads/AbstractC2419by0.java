package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.by0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2419by0 implements InterfaceC2648dy0 {
    AbstractC2419by0() {
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(zza());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2648dy0
    public abstract /* synthetic */ byte zza();
}
