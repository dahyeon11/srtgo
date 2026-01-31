package h2;

import androidx.fragment.app.ActivityC1010e;
import f2.C5392b;
import g2.AbstractC5544f;
import g2.AbstractC5547i;
import g2.C5539a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* renamed from: h2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5598o extends AbstractC5544f {

    /* renamed from: b, reason: collision with root package name */
    private final String f31438b = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.";

    public C5598o(String str) {
    }

    @Override // g2.AbstractC5544f
    public final C5392b blockingConnect() {
        throw new UnsupportedOperationException(this.f31438b);
    }

    @Override // g2.AbstractC5544f
    public final AbstractC5547i clearDefaultAccountAndReconnect() {
        throw new UnsupportedOperationException(this.f31438b);
    }

    @Override // g2.AbstractC5544f
    public final void connect() {
        throw new UnsupportedOperationException(this.f31438b);
    }

    @Override // g2.AbstractC5544f
    public final void disconnect() {
        throw new UnsupportedOperationException(this.f31438b);
    }

    @Override // g2.AbstractC5544f
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw new UnsupportedOperationException(this.f31438b);
    }

    @Override // g2.AbstractC5544f
    public final C5392b getConnectionResult(C5539a c5539a) {
        throw new UnsupportedOperationException(this.f31438b);
    }

    @Override // g2.AbstractC5544f
    public final boolean hasConnectedApi(C5539a c5539a) {
        throw new UnsupportedOperationException(this.f31438b);
    }

    @Override // g2.AbstractC5544f
    public final boolean isConnected() {
        throw new UnsupportedOperationException(this.f31438b);
    }

    @Override // g2.AbstractC5544f
    public final boolean isConnecting() {
        throw new UnsupportedOperationException(this.f31438b);
    }

    @Override // g2.AbstractC5544f
    public final boolean isConnectionCallbacksRegistered(AbstractC5544f.b bVar) {
        throw new UnsupportedOperationException(this.f31438b);
    }

    @Override // g2.AbstractC5544f
    public final boolean isConnectionFailedListenerRegistered(AbstractC5544f.c cVar) {
        throw new UnsupportedOperationException(this.f31438b);
    }

    @Override // g2.AbstractC5544f
    public final void reconnect() {
        throw new UnsupportedOperationException(this.f31438b);
    }

    @Override // g2.AbstractC5544f
    public final void registerConnectionCallbacks(AbstractC5544f.b bVar) {
        throw new UnsupportedOperationException(this.f31438b);
    }

    @Override // g2.AbstractC5544f
    public final void registerConnectionFailedListener(AbstractC5544f.c cVar) {
        throw new UnsupportedOperationException(this.f31438b);
    }

    @Override // g2.AbstractC5544f
    public final void stopAutoManage(ActivityC1010e activityC1010e) {
        throw new UnsupportedOperationException(this.f31438b);
    }

    @Override // g2.AbstractC5544f
    public final void unregisterConnectionCallbacks(AbstractC5544f.b bVar) {
        throw new UnsupportedOperationException(this.f31438b);
    }

    @Override // g2.AbstractC5544f
    public final void unregisterConnectionFailedListener(AbstractC5544f.c cVar) {
        throw new UnsupportedOperationException(this.f31438b);
    }

    @Override // g2.AbstractC5544f
    public final C5392b blockingConnect(long j8, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(this.f31438b);
    }
}
