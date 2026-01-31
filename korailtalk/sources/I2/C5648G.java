package i2;

import android.os.Bundle;
import h2.InterfaceC5587d;
import i2.AbstractC5670c;

/* renamed from: i2.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5648G implements AbstractC5670c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC5587d f31700a;

    C5648G(InterfaceC5587d interfaceC5587d) {
        this.f31700a = interfaceC5587d;
    }

    @Override // i2.AbstractC5670c.a
    public final void onConnected(Bundle bundle) {
        this.f31700a.onConnected(bundle);
    }

    @Override // i2.AbstractC5670c.a
    public final void onConnectionSuspended(int i8) {
        this.f31700a.onConnectionSuspended(i8);
    }
}
