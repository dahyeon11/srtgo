package i2;

import f2.C5392b;
import h2.InterfaceC5591h;
import i2.AbstractC5670c;

/* renamed from: i2.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5649H implements AbstractC5670c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC5591h f31701a;

    C5649H(InterfaceC5591h interfaceC5591h) {
        this.f31701a = interfaceC5591h;
    }

    @Override // i2.AbstractC5670c.b
    public final void onConnectionFailed(C5392b c5392b) {
        this.f31701a.onConnectionFailed(c5392b);
    }
}
