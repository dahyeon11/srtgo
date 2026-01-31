package f2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import i2.AbstractC5683p;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: f2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ServiceConnectionC5391a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    boolean f30557a = false;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue f30558b = new LinkedBlockingQueue();

    @ResultIgnorabilityUnspecified
    public IBinder getService() {
        AbstractC5683p.checkNotMainThread("BlockingServiceConnection.getService() called on main thread");
        if (this.f30557a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f30557a = true;
        return (IBinder) this.f30558b.take();
    }

    @ResultIgnorabilityUnspecified
    public IBinder getServiceWithTimeout(long j8, TimeUnit timeUnit) throws TimeoutException {
        AbstractC5683p.checkNotMainThread("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f30557a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f30557a = true;
        IBinder iBinder = (IBinder) this.f30558b.poll(j8, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f30558b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
