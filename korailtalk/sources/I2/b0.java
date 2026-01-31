package i2;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class b0 extends z2.m implements c0 {
    public static c0 zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return iInterfaceQueryLocalInterface instanceof c0 ? (c0) iInterfaceQueryLocalInterface : new C5668a0(iBinder);
    }
}
