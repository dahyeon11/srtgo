package i2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import f2.C5392b;

/* loaded from: classes.dex */
public final class k0 extends AbstractC5663W {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC5670c f31819e;
    public final IBinder zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(AbstractC5670c abstractC5670c, int i8, IBinder iBinder, Bundle bundle) {
        super(abstractC5670c, i8, bundle);
        this.f31819e = abstractC5670c;
        this.zze = iBinder;
    }

    @Override // i2.AbstractC5663W
    protected final void c(C5392b c5392b) {
        if (this.f31819e.f31754v != null) {
            this.f31819e.f31754v.onConnectionFailed(c5392b);
        }
        this.f31819e.l(c5392b);
    }

    @Override // i2.AbstractC5663W
    protected final boolean d() throws RemoteException {
        try {
            IBinder iBinder = this.zze;
            AbstractC5683p.checkNotNull(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f31819e.h().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + this.f31819e.h() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceB = this.f31819e.b(this.zze);
            if (iInterfaceB == null || !(AbstractC5670c.C(this.f31819e, 2, 4, iInterfaceB) || AbstractC5670c.C(this.f31819e, 3, 4, iInterfaceB))) {
                return false;
            }
            this.f31819e.f31758z = null;
            AbstractC5670c abstractC5670c = this.f31819e;
            Bundle connectionHint = abstractC5670c.getConnectionHint();
            if (abstractC5670c.f31753u == null) {
                return true;
            }
            this.f31819e.f31753u.onConnected(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
