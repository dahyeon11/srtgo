package e2;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Messenger f30284a;

    /* renamed from: b, reason: collision with root package name */
    private final C5350d f30285b;

    r(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f30284a = new Messenger(iBinder);
            this.f30285b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f30285b = new C5350d(iBinder);
            this.f30284a = null;
        } else {
            String strValueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", strValueOf.length() != 0 ? "Invalid interface descriptor: ".concat(strValueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    final void a(Message message) throws RemoteException {
        Messenger messenger = this.f30284a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        C5350d c5350d = this.f30285b;
        if (c5350d == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        c5350d.zza(message);
    }
}
