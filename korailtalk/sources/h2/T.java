package h2;

import android.os.Bundle;
import f2.C5392b;
import g2.AbstractC5544f;
import g2.C5539a;
import i2.AbstractC5683p;

/* loaded from: classes.dex */
public final class T implements AbstractC5544f.b, AbstractC5544f.c {

    /* renamed from: a */
    private final boolean f31405a;

    /* renamed from: b */
    private U f31406b;
    public final C5539a zaa;

    public T(C5539a c5539a, boolean z8) {
        this.zaa = c5539a;
        this.f31405a = z8;
    }

    private final U a() {
        AbstractC5683p.checkNotNull(this.f31406b, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f31406b;
    }

    @Override // g2.AbstractC5544f.b, h2.InterfaceC5587d
    public final void onConnected(Bundle bundle) {
        a().onConnected(bundle);
    }

    @Override // g2.AbstractC5544f.c, h2.InterfaceC5591h
    public final void onConnectionFailed(C5392b c5392b) {
        a().zaa(c5392b, this.zaa, this.f31405a);
    }

    @Override // g2.AbstractC5544f.b, h2.InterfaceC5587d
    public final void onConnectionSuspended(int i8) {
        a().onConnectionSuspended(i8);
    }

    public final void zaa(U u8) {
        this.f31406b = u8;
    }
}
