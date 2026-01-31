package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.il0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3196il0 extends AbstractC2130Yj0 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Iterator f19973c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC1229Cj0 f19974d;

    C3196il0(Iterator it, InterfaceC1229Cj0 interfaceC1229Cj0) {
        this.f19973c = it;
        this.f19974d = interfaceC1229Cj0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2130Yj0
    protected final Object a() {
        while (this.f19973c.hasNext()) {
            Iterator it = this.f19973c;
            InterfaceC1229Cj0 interfaceC1229Cj0 = this.f19974d;
            Object next = it.next();
            if (interfaceC1229Cj0.zza(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
