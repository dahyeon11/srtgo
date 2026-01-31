package e2;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: e2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5350d implements Parcelable {
    public static final Parcelable.Creator<C5350d> CREATOR = new f();

    /* renamed from: a, reason: collision with root package name */
    private Messenger f30259a;

    /* renamed from: e2.d$a */
    public static final class a extends ClassLoader {
        @Override // java.lang.ClassLoader
        protected final Class loadClass(String str, boolean z8) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z8);
            }
            Log.isLoggable("CloudMessengerCompat", 3);
            return C5350d.class;
        }
    }

    public C5350d(IBinder iBinder) {
        this.f30259a = new Messenger(iBinder);
    }

    private final IBinder b() {
        Messenger messenger = this.f30259a;
        messenger.getClass();
        return messenger.getBinder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return b().equals(((C5350d) obj).b());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return b().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        Messenger messenger = this.f30259a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }

    public final void zza(Message message) throws RemoteException {
        Messenger messenger = this.f30259a;
        messenger.getClass();
        messenger.send(message);
    }
}
