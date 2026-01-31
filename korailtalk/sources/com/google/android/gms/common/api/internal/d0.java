package com.google.android.gms.common.api.internal;

import I2.C0609m;
import com.google.android.gms.common.api.internal.C1106d;
import com.google.android.gms.common.api.internal.C1109g;
import g2.C5539a;

/* loaded from: classes.dex */
final class d0 extends AbstractC1111i {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1109g.a f12019b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d0(C1109g.a aVar, C1106d.a aVar2) {
        super(aVar2);
        this.f12019b = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1111i
    protected final void a(C5539a.b bVar, C0609m c0609m) {
        this.f12019b.f12028b.accept(bVar, c0609m);
    }
}
