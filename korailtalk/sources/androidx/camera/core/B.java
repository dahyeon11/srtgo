package androidx.camera.core;

import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.core.C;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.concurrent.futures.c;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import z.C6556E;
import z.InterfaceC6606x;
import z.InterfaceC6607y;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: o, reason: collision with root package name */
    private static final Object f7363o = new Object();

    /* renamed from: p, reason: collision with root package name */
    private static final SparseArray f7364p = new SparseArray();

    /* renamed from: c, reason: collision with root package name */
    private final C f7367c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f7368d;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f7369e;

    /* renamed from: f, reason: collision with root package name */
    private final HandlerThread f7370f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC6607y f7371g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC6606x f7372h;

    /* renamed from: i, reason: collision with root package name */
    private z.O0 f7373i;

    /* renamed from: j, reason: collision with root package name */
    private Context f7374j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.common.util.concurrent.C f7375k;

    /* renamed from: n, reason: collision with root package name */
    private final Integer f7378n;

    /* renamed from: a, reason: collision with root package name */
    final C6556E f7365a = new C6556E();

    /* renamed from: b, reason: collision with root package name */
    private final Object f7366b = new Object();

    /* renamed from: l, reason: collision with root package name */
    private b f7376l = b.UNINITIALIZED;

    /* renamed from: m, reason: collision with root package name */
    private com.google.common.util.concurrent.C f7377m = B.f.immediateFuture(null);

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7379a;

        static {
            int[] iArr = new int[b.values().length];
            f7379a = iArr;
            try {
                iArr[b.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7379a[b.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7379a[b.INITIALIZING_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7379a[b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7379a[b.SHUTDOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private enum b {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public B(Context context, C.b bVar) {
        if (bVar != null) {
            this.f7367c = bVar.getCameraXConfig();
        } else {
            C.b bVarG = g(context);
            if (bVarG == null) {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
            this.f7367c = bVarG.getCameraXConfig();
        }
        Executor cameraExecutor = this.f7367c.getCameraExecutor(null);
        Handler schedulerHandler = this.f7367c.getSchedulerHandler(null);
        this.f7368d = cameraExecutor == null ? new ExecutorC0896p() : cameraExecutor;
        if (schedulerHandler == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f7370f = handlerThread;
            handlerThread.start();
            this.f7369e = androidx.core.os.i.createAsync(handlerThread.getLooper());
        } else {
            this.f7370f = null;
            this.f7369e = schedulerHandler;
        }
        Integer num = (Integer) this.f7367c.retrieveOption(C.f7387g, null);
        this.f7378n = num;
        h(num);
        this.f7375k = j(context);
    }

    private static void f(Integer num) {
        synchronized (f7363o) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray sparseArray = f7364p;
                int iIntValue = ((Integer) sparseArray.get(num.intValue())).intValue() - 1;
                if (iIntValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
                }
                r();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static C.b g(Context context) {
        ComponentCallbacks2 applicationFromContext = androidx.camera.core.impl.utils.e.getApplicationFromContext(context);
        if (applicationFromContext instanceof C.b) {
            return (C.b) applicationFromContext;
        }
        try {
            Context applicationContext = androidx.camera.core.impl.utils.e.getApplicationContext(context);
            Bundle bundle = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, (Class<?>) MetadataHolderService.class), 640).metaData;
            String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (C.b) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
            }
            B0.e("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException e8) {
            e = e8;
            B0.e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (ClassNotFoundException e9) {
            e = e9;
            B0.e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (IllegalAccessException e10) {
            e = e10;
            B0.e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InstantiationException e11) {
            e = e11;
            B0.e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NoSuchMethodException e12) {
            e = e12;
            B0.e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NullPointerException e13) {
            e = e13;
            B0.e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InvocationTargetException e14) {
            e = e14;
            B0.e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    private static void h(Integer num) {
        synchronized (f7363o) {
            try {
                if (num == null) {
                    return;
                }
                Z.h.checkArgumentInRange(num.intValue(), 3, 6, "minLogLevel");
                SparseArray sparseArray = f7364p;
                sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + ((Integer) sparseArray.get(num.intValue())).intValue() : 1));
                r();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void i(final Executor executor, final long j8, final Context context, final c.a aVar) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.z
            @Override // java.lang.Runnable
            public final void run() throws A0 {
                this.f7885a.l(context, executor, aVar, j8);
            }
        });
    }

    private com.google.common.util.concurrent.C j(final Context context) {
        com.google.common.util.concurrent.C future;
        synchronized (this.f7366b) {
            Z.h.checkState(this.f7376l == b.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.f7376l = b.INITIALIZING;
            future = androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: androidx.camera.core.w
                @Override // androidx.concurrent.futures.c.InterfaceC0123c
                public final Object attachCompleter(c.a aVar) {
                    return this.f7866a.m(context, aVar);
                }
            });
        }
        return future;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(Executor executor, long j8, c.a aVar) {
        i(executor, j8, this.f7374j, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void l(android.content.Context r8, final java.util.concurrent.Executor r9, final androidx.concurrent.futures.c.a r10, final long r11) throws androidx.camera.core.A0 {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.B.l(android.content.Context, java.util.concurrent.Executor, androidx.concurrent.futures.c$a, long):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object m(Context context, c.a aVar) {
        i(this.f7368d, SystemClock.elapsedRealtime(), context, aVar);
        return "CameraX initInternal";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(c.a aVar) {
        if (this.f7370f != null) {
            Executor executor = this.f7368d;
            if (executor instanceof ExecutorC0896p) {
                ((ExecutorC0896p) executor).c();
            }
            this.f7370f.quit();
            aVar.set(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(final c.a aVar) {
        this.f7365a.deinit().addListener(new Runnable() { // from class: androidx.camera.core.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f7875a.n(aVar);
            }
        }, this.f7368d);
        return "CameraX shutdownInternal";
    }

    private void p() {
        synchronized (this.f7366b) {
            this.f7376l = b.INITIALIZED;
        }
    }

    private com.google.common.util.concurrent.C q() {
        synchronized (this.f7366b) {
            try {
                this.f7369e.removeCallbacksAndMessages("retry_token");
                int i8 = a.f7379a[this.f7376l.ordinal()];
                if (i8 == 1) {
                    this.f7376l = b.SHUTDOWN;
                    return B.f.immediateFuture(null);
                }
                if (i8 == 2) {
                    throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                }
                if (i8 == 3 || i8 == 4) {
                    this.f7376l = b.SHUTDOWN;
                    f(this.f7378n);
                    this.f7377m = androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: androidx.camera.core.x
                        @Override // androidx.concurrent.futures.c.InterfaceC0123c
                        public final Object attachCompleter(c.a aVar) {
                            return this.f7872a.o(aVar);
                        }
                    });
                }
                return this.f7377m;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void r() {
        SparseArray sparseArray = f7364p;
        if (sparseArray.size() == 0) {
            B0.b();
            return;
        }
        if (sparseArray.get(3) != null) {
            B0.c(3);
            return;
        }
        if (sparseArray.get(4) != null) {
            B0.c(4);
        } else if (sparseArray.get(5) != null) {
            B0.c(5);
        } else if (sparseArray.get(6) != null) {
            B0.c(6);
        }
    }

    public InterfaceC6606x getCameraDeviceSurfaceManager() {
        InterfaceC6606x interfaceC6606x = this.f7372h;
        if (interfaceC6606x != null) {
            return interfaceC6606x;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public InterfaceC6607y getCameraFactory() {
        InterfaceC6607y interfaceC6607y = this.f7371g;
        if (interfaceC6607y != null) {
            return interfaceC6607y;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public C6556E getCameraRepository() {
        return this.f7365a;
    }

    public z.O0 getDefaultConfigFactory() {
        z.O0 o02 = this.f7373i;
        if (o02 != null) {
            return o02;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public com.google.common.util.concurrent.C getInitializeFuture() {
        return this.f7375k;
    }

    public com.google.common.util.concurrent.C shutdown() {
        return q();
    }
}
