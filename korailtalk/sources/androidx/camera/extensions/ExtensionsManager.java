package androidx.camera.extensions;

import H.j;
import H.o;
import H.p;
import android.content.Context;
import android.util.Range;
import androidx.camera.core.B0;
import androidx.camera.core.C0903t;
import androidx.camera.core.InterfaceC0901s;
import androidx.camera.extensions.impl.InitializerImpl;
import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.C;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class ExtensionsManager {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f7890c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static C f7891d;

    /* renamed from: e, reason: collision with root package name */
    private static C f7892e;

    /* renamed from: f, reason: collision with root package name */
    private static ExtensionsManager f7893f;

    /* renamed from: a, reason: collision with root package name */
    private final ExtensionsAvailability f7894a;

    /* renamed from: b, reason: collision with root package name */
    private final d f7895b;

    enum ExtensionsAvailability {
        LIBRARY_AVAILABLE,
        LIBRARY_UNAVAILABLE_ERROR_LOADING,
        LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION,
        NONE
    }

    private ExtensionsManager(ExtensionsAvailability extensionsAvailability, InterfaceC0901s interfaceC0901s) {
        this.f7894a = extensionsAvailability;
        this.f7895b = new d(interfaceC0901s);
    }

    static C c(final Context context, final InterfaceC0901s interfaceC0901s, final p pVar) {
        synchronized (f7890c) {
            try {
                C c9 = f7892e;
                if (c9 != null && !c9.isDone()) {
                    throw new IllegalStateException("Not yet done deinitializing extensions");
                }
                f7892e = null;
                if (j.getRuntimeVersion() == null) {
                    return B.f.immediateFuture(d(ExtensionsAvailability.NONE, interfaceC0901s));
                }
                if (j.getRuntimeVersion().compareTo(o.VERSION_1_1) < 0) {
                    return B.f.immediateFuture(d(ExtensionsAvailability.LIBRARY_AVAILABLE, interfaceC0901s));
                }
                if (f7891d == null) {
                    f7891d = androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: androidx.camera.extensions.f
                        @Override // androidx.concurrent.futures.c.InterfaceC0123c
                        public final Object attachCompleter(c.a aVar) {
                            return ExtensionsManager.e(pVar, context, interfaceC0901s, aVar);
                        }
                    });
                }
                return f7891d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static ExtensionsManager d(ExtensionsAvailability extensionsAvailability, InterfaceC0901s interfaceC0901s) {
        synchronized (f7890c) {
            try {
                ExtensionsManager extensionsManager = f7893f;
                if (extensionsManager != null) {
                    return extensionsManager;
                }
                ExtensionsManager extensionsManager2 = new ExtensionsManager(extensionsAvailability, interfaceC0901s);
                f7893f = extensionsManager2;
                return extensionsManager2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object e(p pVar, Context context, final InterfaceC0901s interfaceC0901s, final c.a aVar) {
        try {
            InitializerImpl.init(pVar.toVersionString(), androidx.camera.core.impl.utils.e.getApplicationContext(context), new InitializerImpl.OnExtensionsInitializedCallback() { // from class: androidx.camera.extensions.ExtensionsManager.1
                public void onFailure(int i8) {
                    B0.e("ExtensionsManager", "Failed to initialize extensions");
                    aVar.set(ExtensionsManager.d(ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, interfaceC0901s));
                }

                public void onSuccess() {
                    B0.d("ExtensionsManager", "Successfully initialized extensions");
                    aVar.set(ExtensionsManager.d(ExtensionsAvailability.LIBRARY_AVAILABLE, interfaceC0901s));
                }
            }, A.a.directExecutor());
            return "Initialize extensions";
        } catch (AbstractMethodError e8) {
            e = e8;
            B0.e("ExtensionsManager", "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            aVar.set(d(ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, interfaceC0901s));
            return "Initialize extensions";
        } catch (NoClassDefFoundError e9) {
            e = e9;
            B0.e("ExtensionsManager", "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            aVar.set(d(ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, interfaceC0901s));
            return "Initialize extensions";
        } catch (NoSuchMethodError e10) {
            e = e10;
            B0.e("ExtensionsManager", "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            aVar.set(d(ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, interfaceC0901s));
            return "Initialize extensions";
        } catch (RuntimeException e11) {
            B0.e("ExtensionsManager", "Failed to initialize extensions. Something wents wrong when initializing the vendor library. " + e11);
            aVar.set(d(ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, interfaceC0901s));
            return "Initialize extensions";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object f(final c.a aVar) {
        try {
            InitializerImpl.deinit(new InitializerImpl.OnExtensionsDeinitializedCallback() { // from class: androidx.camera.extensions.ExtensionsManager.2
                public void onFailure(int i8) {
                    aVar.setException(new Exception("Failed to deinitialize extensions."));
                }

                public void onSuccess() {
                    aVar.set(null);
                }
            }, A.a.directExecutor());
            return null;
        } catch (NoClassDefFoundError | NoSuchMethodError e8) {
            aVar.setException(e8);
            return null;
        }
    }

    public static C getInstanceAsync(Context context, InterfaceC0901s interfaceC0901s) {
        return c(context, interfaceC0901s, p.getCurrentVersion());
    }

    public Range<Long> getEstimatedCaptureLatencyRange(C0903t c0903t, int i8) {
        if (i8 == 0 || this.f7894a != ExtensionsAvailability.LIBRARY_AVAILABLE) {
            throw new IllegalArgumentException("No camera can be found to support the specified extensions mode! isExtensionAvailable should be checked first before calling getEstimatedCaptureLatencyRange.");
        }
        return this.f7895b.b(c0903t, i8, null);
    }

    public C0903t getExtensionEnabledCameraSelector(C0903t c0903t, int i8) {
        if (i8 == 0) {
            return c0903t;
        }
        if (this.f7894a == ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return this.f7895b.d(c0903t, i8);
        }
        throw new IllegalArgumentException("This device doesn't support extensions function! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
    }

    public boolean isExtensionAvailable(C0903t c0903t, int i8) {
        if (i8 == 0) {
            return true;
        }
        if (this.f7894a != ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return false;
        }
        return this.f7895b.i(c0903t, i8);
    }

    public C shutdown() {
        synchronized (f7890c) {
            try {
                if (j.getRuntimeVersion() == null) {
                    f7891d = null;
                    f7893f = null;
                    return B.f.immediateFuture(null);
                }
                C c9 = f7891d;
                if (c9 == null) {
                    return B.f.immediateFuture(null);
                }
                C c10 = f7892e;
                if (c10 != null) {
                    return c10;
                }
                try {
                    c9.get();
                    f7891d = null;
                    ExtensionsAvailability extensionsAvailability = f7893f.f7894a;
                    f7893f = null;
                    if (extensionsAvailability == ExtensionsAvailability.LIBRARY_AVAILABLE) {
                        f7892e = androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: androidx.camera.extensions.e
                            @Override // androidx.concurrent.futures.c.InterfaceC0123c
                            public final Object attachCompleter(c.a aVar) {
                                return this.f7904a.f(aVar);
                            }
                        });
                    } else {
                        f7892e = B.f.immediateFuture(null);
                    }
                    return f7892e;
                } catch (InterruptedException e8) {
                    e = e8;
                    C cImmediateFailedFuture = B.f.immediateFailedFuture(e);
                    f7892e = cImmediateFailedFuture;
                    return cImmediateFailedFuture;
                } catch (ExecutionException e9) {
                    e = e9;
                    C cImmediateFailedFuture2 = B.f.immediateFailedFuture(e);
                    f7892e = cImmediateFailedFuture2;
                    return cImmediateFailedFuture2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
