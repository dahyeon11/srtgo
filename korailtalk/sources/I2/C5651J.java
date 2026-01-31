package i2;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import f2.C5392b;
import g2.AbstractC5544f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: i2.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5651J implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5650I f31702a;

    /* renamed from: h, reason: collision with root package name */
    private final Handler f31709h;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f31703b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f31704c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f31705d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f31706e = false;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicInteger f31707f = new AtomicInteger(0);

    /* renamed from: g, reason: collision with root package name */
    private boolean f31708g = false;

    /* renamed from: i, reason: collision with root package name */
    private final Object f31710i = new Object();

    public C5651J(Looper looper, InterfaceC5650I interfaceC5650I) {
        this.f31702a = interfaceC5650I;
        this.f31709h = new x2.j(looper, this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i8 = message.what;
        if (i8 != 1) {
            StringBuilder sb = new StringBuilder(45);
            sb.append("Don't know how to handle message: ");
            sb.append(i8);
            Log.wtf("GmsClientEvents", sb.toString(), new Exception());
            return false;
        }
        AbstractC5544f.b bVar = (AbstractC5544f.b) message.obj;
        synchronized (this.f31710i) {
            try {
                if (this.f31706e && this.f31702a.isConnected() && this.f31703b.contains(bVar)) {
                    bVar.onConnected(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public final void zaa() {
        this.f31706e = false;
        this.f31707f.incrementAndGet();
    }

    public final void zab() {
        this.f31706e = true;
    }

    @VisibleForTesting
    public final void zac(C5392b c5392b) {
        AbstractC5683p.checkHandlerThread(this.f31709h, "onConnectionFailure must only be called on the Handler thread");
        this.f31709h.removeMessages(1);
        synchronized (this.f31710i) {
            try {
                ArrayList arrayList = new ArrayList(this.f31705d);
                int i8 = this.f31707f.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC5544f.c cVar = (AbstractC5544f.c) it.next();
                    if (this.f31706e && this.f31707f.get() == i8) {
                        if (this.f31705d.contains(cVar)) {
                            cVar.onConnectionFailed(c5392b);
                        }
                    }
                    return;
                }
            } finally {
            }
        }
    }

    @VisibleForTesting
    public final void zad(Bundle bundle) {
        AbstractC5683p.checkHandlerThread(this.f31709h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f31710i) {
            try {
                AbstractC5683p.checkState(!this.f31708g);
                this.f31709h.removeMessages(1);
                this.f31708g = true;
                AbstractC5683p.checkState(this.f31704c.isEmpty());
                ArrayList arrayList = new ArrayList(this.f31703b);
                int i8 = this.f31707f.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC5544f.b bVar = (AbstractC5544f.b) it.next();
                    if (!this.f31706e || !this.f31702a.isConnected() || this.f31707f.get() != i8) {
                        break;
                    } else if (!this.f31704c.contains(bVar)) {
                        bVar.onConnected(bundle);
                    }
                }
                this.f31704c.clear();
                this.f31708g = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    public final void zae(int i8) {
        AbstractC5683p.checkHandlerThread(this.f31709h, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f31709h.removeMessages(1);
        synchronized (this.f31710i) {
            try {
                this.f31708g = true;
                ArrayList arrayList = new ArrayList(this.f31703b);
                int i9 = this.f31707f.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC5544f.b bVar = (AbstractC5544f.b) it.next();
                    if (!this.f31706e || this.f31707f.get() != i9) {
                        break;
                    } else if (this.f31703b.contains(bVar)) {
                        bVar.onConnectionSuspended(i8);
                    }
                }
                this.f31704c.clear();
                this.f31708g = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zaf(AbstractC5544f.b bVar) {
        AbstractC5683p.checkNotNull(bVar);
        synchronized (this.f31710i) {
            try {
                if (this.f31703b.contains(bVar)) {
                    String strValueOf = String.valueOf(bVar);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 62);
                    sb.append("registerConnectionCallbacks(): listener ");
                    sb.append(strValueOf);
                    sb.append(" is already registered");
                    Log.w("GmsClientEvents", sb.toString());
                } else {
                    this.f31703b.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f31702a.isConnected()) {
            Handler handler = this.f31709h;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    public final void zag(AbstractC5544f.c cVar) {
        AbstractC5683p.checkNotNull(cVar);
        synchronized (this.f31710i) {
            try {
                if (this.f31705d.contains(cVar)) {
                    String strValueOf = String.valueOf(cVar);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 67);
                    sb.append("registerConnectionFailedListener(): listener ");
                    sb.append(strValueOf);
                    sb.append(" is already registered");
                    Log.w("GmsClientEvents", sb.toString());
                } else {
                    this.f31705d.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zah(AbstractC5544f.b bVar) {
        AbstractC5683p.checkNotNull(bVar);
        synchronized (this.f31710i) {
            try {
                if (!this.f31703b.remove(bVar)) {
                    String strValueOf = String.valueOf(bVar);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 52);
                    sb.append("unregisterConnectionCallbacks(): listener ");
                    sb.append(strValueOf);
                    sb.append(" not found");
                    Log.w("GmsClientEvents", sb.toString());
                } else if (this.f31708g) {
                    this.f31704c.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zai(AbstractC5544f.c cVar) {
        AbstractC5683p.checkNotNull(cVar);
        synchronized (this.f31710i) {
            try {
                if (!this.f31705d.remove(cVar)) {
                    String strValueOf = String.valueOf(cVar);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 57);
                    sb.append("unregisterConnectionFailedListener(): listener ");
                    sb.append(strValueOf);
                    sb.append(" not found");
                    Log.w("GmsClientEvents", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zaj(AbstractC5544f.b bVar) {
        boolean zContains;
        AbstractC5683p.checkNotNull(bVar);
        synchronized (this.f31710i) {
            zContains = this.f31703b.contains(bVar);
        }
        return zContains;
    }

    public final boolean zak(AbstractC5544f.c cVar) {
        boolean zContains;
        AbstractC5683p.checkNotNull(cVar);
        synchronized (this.f31710i) {
            zContains = this.f31705d.contains(cVar);
        }
        return zContains;
    }
}
