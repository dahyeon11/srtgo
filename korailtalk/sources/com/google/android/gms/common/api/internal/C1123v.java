package com.google.android.gms.common.api.internal;

import f2.C5392b;
import i2.AbstractC5670c;

/* renamed from: com.google.android.gms.common.api.internal.v */
/* loaded from: classes.dex */
final class C1123v extends L {

    /* renamed from: b */
    final /* synthetic */ AbstractC5670c.InterfaceC0311c f12102b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1123v(C1124w c1124w, h2.r rVar, AbstractC5670c.InterfaceC0311c interfaceC0311c) {
        super(rVar);
        this.f12102b = interfaceC0311c;
    }

    @Override // com.google.android.gms.common.api.internal.L
    public final void zaa() {
        this.f12102b.onReportServiceBinding(new C5392b(16, null));
    }
}
