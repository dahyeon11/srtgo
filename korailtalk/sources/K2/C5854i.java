package k2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import g2.AbstractC5544f;
import i2.AbstractC5674g;
import i2.C5671d;

/* renamed from: k2.i */
/* loaded from: classes.dex */
public final class C5854i extends AbstractC5674g {
    public C5854i(Context context, Looper looper, C5671d c5671d, AbstractC5544f.b bVar, AbstractC5544f.c cVar) {
        super(context, looper, 39, c5671d, bVar, cVar);
    }

    @Override // i2.AbstractC5670c
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
        return iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new m(iBinder);
    }

    @Override // i2.AbstractC5670c
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.service.START";
    }

    @Override // i2.AbstractC5670c
    protected final String h() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }
}
