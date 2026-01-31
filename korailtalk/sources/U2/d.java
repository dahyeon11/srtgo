package u2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import f2.C5394d;
import h2.InterfaceC5587d;
import h2.InterfaceC5591h;
import i2.AbstractC5674g;
import i2.C5671d;

/* loaded from: classes2.dex */
public final class d extends AbstractC5674g {
    protected d(Context context, Looper looper, C5671d c5671d, InterfaceC5587d interfaceC5587d, InterfaceC5591h interfaceC5591h) {
        super(context, looper, 300, c5671d, interfaceC5587d, interfaceC5591h);
    }

    @Override // i2.AbstractC5670c
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    @Override // i2.AbstractC5670c
    public final C5394d[] getApiFeatures() {
        return X1.h.zzb;
    }

    @Override // i2.AbstractC5670c, g2.C5539a.f
    public final int getMinApkVersion() {
        return 212800000;
    }

    @Override // i2.AbstractC5670c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // i2.AbstractC5670c
    protected final String h() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // i2.AbstractC5670c
    protected final boolean j() {
        return true;
    }

    @Override // i2.AbstractC5670c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
