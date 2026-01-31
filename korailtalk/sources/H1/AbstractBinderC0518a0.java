package H1;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.AbstractBinderC1623Mc;

/* renamed from: H1.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0518a0 extends AbstractBinderC1623Mc implements InterfaceC0521b0 {
    public static InterfaceC0521b0 zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0521b0 ? (InterfaceC0521b0) iInterfaceQueryLocalInterface : new Z(iBinder);
    }
}
