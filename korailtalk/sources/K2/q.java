package k2;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import f2.C5394d;
import h2.InterfaceC5587d;
import h2.InterfaceC5591h;
import i2.AbstractC5674g;
import i2.C5671d;
import i2.C5690w;
import x2.AbstractC6487d;

/* loaded from: classes.dex */
public final class q extends AbstractC5674g {

    /* renamed from: H, reason: collision with root package name */
    private final C5690w f33566H;

    public q(Context context, Looper looper, C5671d c5671d, C5690w c5690w, InterfaceC5587d interfaceC5587d, InterfaceC5591h interfaceC5591h) {
        super(context, looper, 270, c5671d, interfaceC5587d, interfaceC5591h);
        this.f33566H = c5690w;
    }

    @Override // i2.AbstractC5670c
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof C5855j ? (C5855j) iInterfaceQueryLocalInterface : new C5855j(iBinder);
    }

    @Override // i2.AbstractC5670c
    protected final Bundle e() {
        return this.f33566H.zaa();
    }

    @Override // i2.AbstractC5670c
    public final C5394d[] getApiFeatures() {
        return AbstractC6487d.zab;
    }

    @Override // i2.AbstractC5670c, g2.C5539a.f
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // i2.AbstractC5670c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // i2.AbstractC5670c
    protected final String h() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // i2.AbstractC5670c
    protected final boolean j() {
        return true;
    }
}
