package r2;

import android.os.IBinder;
import android.os.IInterface;
import z2.m;

/* renamed from: r2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6172a extends IInterface {

    /* renamed from: r2.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0399a extends m implements InterfaceC6172a {
        public AbstractBinderC0399a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static InterfaceC6172a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof InterfaceC6172a ? (InterfaceC6172a) iInterfaceQueryLocalInterface : new d(iBinder);
        }
    }
}
