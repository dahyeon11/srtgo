package i2;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* loaded from: classes.dex */
public final class i0 extends AbstractBinderC5665Y {

    /* renamed from: a, reason: collision with root package name */
    private AbstractC5670c f31815a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31816b;

    public i0(AbstractC5670c abstractC5670c, int i8) {
        this.f31815a = abstractC5670c;
        this.f31816b = i8;
    }

    @Override // i2.AbstractBinderC5665Y, i2.InterfaceC5678k
    public final void onPostInitComplete(int i8, IBinder iBinder, Bundle bundle) {
        AbstractC5683p.checkNotNull(this.f31815a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f31815a.n(i8, iBinder, bundle, this.f31816b);
        this.f31815a = null;
    }

    @Override // i2.AbstractBinderC5665Y, i2.InterfaceC5678k
    public final void zzb(int i8, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // i2.AbstractBinderC5665Y, i2.InterfaceC5678k
    public final void zzc(int i8, IBinder iBinder, m0 m0Var) {
        AbstractC5670c abstractC5670c = this.f31815a;
        AbstractC5683p.checkNotNull(abstractC5670c, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        AbstractC5683p.checkNotNull(m0Var);
        AbstractC5670c.y(abstractC5670c, m0Var);
        onPostInitComplete(i8, iBinder, m0Var.f31830a);
    }
}
