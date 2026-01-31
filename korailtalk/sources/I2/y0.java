package i2;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import z2.AbstractC6618a;

/* loaded from: classes.dex */
public final class y0 extends AbstractC6618a implements InterfaceC5677j {
    y0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // i2.InterfaceC5677j
    public final Account zzb() {
        Parcel parcelA = a(2, b());
        Account account = (Account) z2.n.zza(parcelA, Account.CREATOR);
        parcelA.recycle();
        return account;
    }
}
