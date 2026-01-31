package com.google.android.gms.common.api.internal;

import I2.C0609m;
import com.google.android.gms.common.api.internal.AbstractC1110h;
import f2.C5394d;
import g2.C5539a;

/* loaded from: classes.dex */
final class f0 extends AbstractC1110h {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC1110h.a f12026d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f0(AbstractC1110h.a aVar, C5394d[] c5394dArr, boolean z8, int i8) {
        super(c5394dArr, z8, i8);
        this.f12026d = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1110h
    protected final void a(C5539a.b bVar, C0609m c0609m) {
        this.f12026d.f12039a.accept(bVar, c0609m);
    }
}
