package i2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class j0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final int f31817a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC5670c f31818b;

    public j0(AbstractC5670c abstractC5670c, int i8) {
        this.f31818b = abstractC5670c;
        this.f31817a = i8;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC5670c abstractC5670c = this.f31818b;
        if (iBinder == null) {
            AbstractC5670c.z(abstractC5670c, 16);
            return;
        }
        synchronized (abstractC5670c.f31746n) {
            try {
                AbstractC5670c abstractC5670c2 = this.f31818b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC5670c2.f31747o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC5679l)) ? new C5666Z(iBinder) : (InterfaceC5679l) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f31818b.A(0, null, this.f31817a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f31818b.f31746n) {
            this.f31818b.f31747o = null;
        }
        AbstractC5670c abstractC5670c = this.f31818b;
        int i8 = this.f31817a;
        Handler handler = abstractC5670c.f31744l;
        handler.sendMessage(handler.obtainMessage(6, i8, 1));
    }
}
