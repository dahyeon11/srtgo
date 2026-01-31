package i2;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: i2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5677j extends IInterface {

    /* renamed from: i2.j$a */
    public static abstract class a extends z2.m implements InterfaceC5677j {
        public a() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        public static InterfaceC5677j asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof InterfaceC5677j ? (InterfaceC5677j) iInterfaceQueryLocalInterface : new y0(iBinder);
        }

        @Override // z2.m
        protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 != 2) {
                return false;
            }
            Account accountZzb = zzb();
            parcel2.writeNoException();
            z2.n.zzd(parcel2, accountZzb);
            return true;
        }

        @Override // i2.InterfaceC5677j
        public abstract /* synthetic */ Account zzb();
    }

    Account zzb();
}
