package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.b;
import androidx.room.c;
import androidx.room.e;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    final Context f10677a;

    /* renamed from: b, reason: collision with root package name */
    final String f10678b;

    /* renamed from: c, reason: collision with root package name */
    int f10679c;

    /* renamed from: d, reason: collision with root package name */
    final androidx.room.e f10680d;

    /* renamed from: e, reason: collision with root package name */
    final e.c f10681e;

    /* renamed from: f, reason: collision with root package name */
    androidx.room.c f10682f;

    /* renamed from: g, reason: collision with root package name */
    final Executor f10683g;

    /* renamed from: h, reason: collision with root package name */
    final androidx.room.b f10684h = new a();

    /* renamed from: i, reason: collision with root package name */
    final AtomicBoolean f10685i = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    final ServiceConnection f10686j;

    /* renamed from: k, reason: collision with root package name */
    final Runnable f10687k;

    /* renamed from: l, reason: collision with root package name */
    final Runnable f10688l;

    /* renamed from: m, reason: collision with root package name */
    private final Runnable f10689m;

    class a extends b.a {

        /* renamed from: androidx.room.f$a$a, reason: collision with other inner class name */
        class RunnableC0168a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String[] f10691a;

            RunnableC0168a(String[] strArr) {
                this.f10691a = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.f10680d.notifyObserversByTableNames(this.f10691a);
            }
        }

        a() {
        }

        @Override // androidx.room.b.a, androidx.room.b
        public void onInvalidation(String[] strArr) {
            f.this.f10683g.execute(new RunnableC0168a(strArr));
        }
    }

    class b implements ServiceConnection {
        b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            f.this.f10682f = c.a.asInterface(iBinder);
            f fVar = f.this;
            fVar.f10683g.execute(fVar.f10687k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            f fVar = f.this;
            fVar.f10683g.execute(fVar.f10688l);
            f.this.f10682f = null;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f fVar = f.this;
                androidx.room.c cVar = fVar.f10682f;
                if (cVar != null) {
                    fVar.f10679c = cVar.registerCallback(fVar.f10684h, fVar.f10678b);
                    f fVar2 = f.this;
                    fVar2.f10680d.addObserver(fVar2.f10681e);
                }
            } catch (RemoteException e8) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e8);
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.f10680d.removeObserver(fVar.f10681e);
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.f10680d.removeObserver(fVar.f10681e);
            try {
                f fVar2 = f.this;
                androidx.room.c cVar = fVar2.f10682f;
                if (cVar != null) {
                    cVar.unregisterCallback(fVar2.f10684h, fVar2.f10679c);
                }
            } catch (RemoteException e8) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e8);
            }
            f fVar3 = f.this;
            fVar3.f10677a.unbindService(fVar3.f10686j);
        }
    }

    /* renamed from: androidx.room.f$f, reason: collision with other inner class name */
    class C0169f extends e.c {
        C0169f(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.e.c
        boolean a() {
            return true;
        }

        @Override // androidx.room.e.c
        public void onInvalidated(Set<String> set) {
            if (f.this.f10685i.get()) {
                return;
            }
            try {
                f fVar = f.this;
                androidx.room.c cVar = fVar.f10682f;
                if (cVar != null) {
                    cVar.broadcastInvalidation(fVar.f10679c, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e8) {
                Log.w("ROOM", "Cannot broadcast invalidation", e8);
            }
        }
    }

    f(Context context, String str, androidx.room.e eVar, Executor executor) {
        b bVar = new b();
        this.f10686j = bVar;
        this.f10687k = new c();
        this.f10688l = new d();
        this.f10689m = new e();
        Context applicationContext = context.getApplicationContext();
        this.f10677a = applicationContext;
        this.f10678b = str;
        this.f10680d = eVar;
        this.f10683g = executor;
        this.f10681e = new C0169f((String[]) eVar.f10652a.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, (Class<?>) MultiInstanceInvalidationService.class), bVar, 1);
    }

    void a() {
        if (this.f10685i.compareAndSet(false, true)) {
            this.f10683g.execute(this.f10689m);
        }
    }
}
