package i2;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import i2.InterfaceC5677j;

/* renamed from: i2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5667a extends InterfaceC5677j.a {
    public static Account getAccountBinderSafe(InterfaceC5677j interfaceC5677j) {
        Account accountZzb = null;
        if (interfaceC5677j != null) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    accountZzb = interfaceC5677j.zzb();
                } catch (RemoteException unused) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                }
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
        return accountZzb;
    }
}
