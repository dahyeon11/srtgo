package com.google.android.gms.common.api.internal;

import I2.C0609m;
import com.google.android.gms.common.api.internal.C1109g;
import f2.C5394d;
import g2.C5539a;

/* loaded from: classes.dex */
final class c0 extends AbstractC1108f {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C1109g.a f12013e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c0(C1109g.a aVar, C1106d c1106d, C5394d[] c5394dArr, boolean z8, int i8) {
        super(c1106d, c5394dArr, z8, i8);
        this.f12013e = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1108f
    protected final void a(C5539a.b bVar, C0609m c0609m) {
        this.f12013e.f12027a.accept(bVar, c0609m);
    }
}
