package e2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import i2.AbstractC5683p;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class i implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    int f30270a;

    /* renamed from: b, reason: collision with root package name */
    final Messenger f30271b;

    /* renamed from: c, reason: collision with root package name */
    r f30272c;

    /* renamed from: d, reason: collision with root package name */
    final Queue f30273d;

    /* renamed from: e, reason: collision with root package name */
    final SparseArray f30274e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h f30275f;

    private i(h hVar) {
        this.f30275f = hVar;
        this.f30270a = 0;
        this.f30271b = new Messenger(new y2.e(Looper.getMainLooper(), new Handler.Callback(this) { // from class: e2.l

            /* renamed from: a, reason: collision with root package name */
            private final i f30277a;

            {
                this.f30277a = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f30277a.d(message);
            }
        }));
        this.f30273d = new ArrayDeque();
        this.f30274e = new SparseArray();
    }

    final void a() {
        this.f30275f.f30267b.execute(new Runnable(this) { // from class: e2.m

            /* renamed from: a, reason: collision with root package name */
            private final i f30278a;

            {
                this.f30278a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final t tVar;
                final i iVar = this.f30278a;
                while (true) {
                    synchronized (iVar) {
                        try {
                            if (iVar.f30270a != 2) {
                                return;
                            }
                            if (iVar.f30273d.isEmpty()) {
                                iVar.f();
                                return;
                            } else {
                                tVar = (t) iVar.f30273d.poll();
                                iVar.f30274e.put(tVar.f30287a, tVar);
                                iVar.f30275f.f30267b.schedule(new Runnable(iVar, tVar) { // from class: e2.o

                                    /* renamed from: a, reason: collision with root package name */
                                    private final i f30281a;

                                    /* renamed from: b, reason: collision with root package name */
                                    private final t f30282b;

                                    {
                                        this.f30281a = iVar;
                                        this.f30282b = tVar;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f30281a.b(this.f30282b.f30287a);
                                    }
                                }, 30L, TimeUnit.SECONDS);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String strValueOf = String.valueOf(tVar);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 8);
                        sb.append("Sending ");
                        sb.append(strValueOf);
                    }
                    Context context = iVar.f30275f.f30266a;
                    Messenger messenger = iVar.f30271b;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = tVar.f30289c;
                    messageObtain.arg1 = tVar.f30287a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", tVar.d());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", tVar.f30290d);
                    messageObtain.setData(bundle);
                    try {
                        iVar.f30272c.a(messageObtain);
                    } catch (RemoteException e8) {
                        iVar.c(2, e8.getMessage());
                    }
                }
            }
        });
    }

    final synchronized void b(int i8) {
        t tVar = (t) this.f30274e.get(i8);
        if (tVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i8);
            Log.w("MessengerIpcClient", sb.toString());
            this.f30274e.remove(i8);
            tVar.b(new s(3, "Timed out waiting for response"));
            f();
        }
    }

    final synchronized void c(int i8, String str) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String strValueOf = String.valueOf(str);
                if (strValueOf.length() != 0) {
                    "Disconnected: ".concat(strValueOf);
                }
            }
            int i9 = this.f30270a;
            if (i9 == 0) {
                throw new IllegalStateException();
            }
            if (i9 != 1 && i9 != 2) {
                if (i9 == 3) {
                    this.f30270a = 4;
                    return;
                } else {
                    if (i9 == 4) {
                        return;
                    }
                    int i10 = this.f30270a;
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("Unknown state: ");
                    sb.append(i10);
                    throw new IllegalStateException(sb.toString());
                }
            }
            Log.isLoggable("MessengerIpcClient", 2);
            this.f30270a = 4;
            n2.b.getInstance().unbindService(this.f30275f.f30266a, this);
            s sVar = new s(i8, str);
            Iterator it = this.f30273d.iterator();
            while (it.hasNext()) {
                ((t) it.next()).b(sVar);
            }
            this.f30273d.clear();
            for (int i11 = 0; i11 < this.f30274e.size(); i11++) {
                ((t) this.f30274e.valueAt(i11)).b(sVar);
            }
            this.f30274e.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    final boolean d(Message message) {
        int i8 = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Received response to request: ");
            sb.append(i8);
        }
        synchronized (this) {
            try {
                t tVar = (t) this.f30274e.get(i8);
                if (tVar == null) {
                    StringBuilder sb2 = new StringBuilder(50);
                    sb2.append("Received response for unknown request: ");
                    sb2.append(i8);
                    Log.w("MessengerIpcClient", sb2.toString());
                    return true;
                }
                this.f30274e.remove(i8);
                f();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    tVar.b(new s(4, "Not supported by GmsCore"));
                } else {
                    tVar.a(data);
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final synchronized boolean e(t tVar) {
        int i8 = this.f30270a;
        if (i8 == 0) {
            this.f30273d.add(tVar);
            AbstractC5683p.checkState(this.f30270a == 0);
            Log.isLoggable("MessengerIpcClient", 2);
            this.f30270a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            if (n2.b.getInstance().bindService(this.f30275f.f30266a, intent, this, 1)) {
                this.f30275f.f30267b.schedule(new Runnable(this) { // from class: e2.k

                    /* renamed from: a, reason: collision with root package name */
                    private final i f30276a;

                    {
                        this.f30276a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f30276a.g();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                c(0, "Unable to bind to service");
            }
            return true;
        }
        if (i8 == 1) {
            this.f30273d.add(tVar);
            return true;
        }
        if (i8 == 2) {
            this.f30273d.add(tVar);
            a();
            return true;
        }
        if (i8 != 3 && i8 != 4) {
            int i9 = this.f30270a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i9);
            throw new IllegalStateException(sb.toString());
        }
        return false;
    }

    final synchronized void f() {
        if (this.f30270a == 2 && this.f30273d.isEmpty() && this.f30274e.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.f30270a = 3;
            n2.b.getInstance().unbindService(this.f30275f.f30266a, this);
        }
    }

    final synchronized void g() {
        if (this.f30270a == 1) {
            c(1, "Timed out while binding");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        Log.isLoggable("MessengerIpcClient", 2);
        this.f30275f.f30267b.execute(new Runnable(this, iBinder) { // from class: e2.n

            /* renamed from: a, reason: collision with root package name */
            private final i f30279a;

            /* renamed from: b, reason: collision with root package name */
            private final IBinder f30280b;

            {
                this.f30279a = this;
                this.f30280b = iBinder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i iVar = this.f30279a;
                IBinder iBinder2 = this.f30280b;
                synchronized (iVar) {
                    if (iBinder2 == null) {
                        iVar.c(0, "Null service connection");
                        return;
                    }
                    try {
                        iVar.f30272c = new r(iBinder2);
                        iVar.f30270a = 2;
                        iVar.a();
                    } catch (RemoteException e8) {
                        iVar.c(0, e8.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("MessengerIpcClient", 2);
        this.f30275f.f30267b.execute(new Runnable(this) { // from class: e2.p

            /* renamed from: a, reason: collision with root package name */
            private final i f30283a;

            {
                this.f30283a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f30283a.c(2, "Service disconnected");
            }
        });
    }
}
