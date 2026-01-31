package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.dA0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2559dA0 extends AbstractC2419by0 {

    /* renamed from: a, reason: collision with root package name */
    final C3018hA0 f18538a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC2648dy0 f18539b = a();

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3246jA0 f18540c;

    C2559dA0(C3246jA0 c3246jA0) {
        this.f18540c = c3246jA0;
        this.f18538a = new C3018hA0(c3246jA0, null);
    }

    private final InterfaceC2648dy0 a() {
        C3018hA0 c3018hA0 = this.f18538a;
        if (c3018hA0.hasNext()) {
            return c3018hA0.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18539b != null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2419by0, com.google.android.gms.internal.ads.InterfaceC2648dy0
    public final byte zza() {
        InterfaceC2648dy0 interfaceC2648dy0 = this.f18539b;
        if (interfaceC2648dy0 == null) {
            throw new NoSuchElementException();
        }
        byte bZza = interfaceC2648dy0.zza();
        if (!this.f18539b.hasNext()) {
            this.f18539b = a();
        }
        return bZza;
    }
}
