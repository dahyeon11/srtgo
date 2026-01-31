package androidx.camera.core;

import C.h;
import android.os.Handler;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import z.InterfaceC6565N;
import z.InterfaceC6606x;
import z.InterfaceC6607y;
import z.O0;

/* loaded from: classes.dex */
public final class C implements C.h {

    /* renamed from: b, reason: collision with root package name */
    static final InterfaceC6565N.a f7382b = InterfaceC6565N.a.create("camerax.core.appConfig.cameraFactoryProvider", InterfaceC6607y.a.class);

    /* renamed from: c, reason: collision with root package name */
    static final InterfaceC6565N.a f7383c = InterfaceC6565N.a.create("camerax.core.appConfig.deviceSurfaceManagerProvider", InterfaceC6606x.a.class);

    /* renamed from: d, reason: collision with root package name */
    static final InterfaceC6565N.a f7384d = InterfaceC6565N.a.create("camerax.core.appConfig.useCaseConfigFactoryProvider", O0.c.class);

    /* renamed from: e, reason: collision with root package name */
    static final InterfaceC6565N.a f7385e = InterfaceC6565N.a.create("camerax.core.appConfig.cameraExecutor", Executor.class);

    /* renamed from: f, reason: collision with root package name */
    static final InterfaceC6565N.a f7386f = InterfaceC6565N.a.create("camerax.core.appConfig.schedulerHandler", Handler.class);

    /* renamed from: g, reason: collision with root package name */
    static final InterfaceC6565N.a f7387g = InterfaceC6565N.a.create("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE);

    /* renamed from: h, reason: collision with root package name */
    static final InterfaceC6565N.a f7388h = InterfaceC6565N.a.create("camerax.core.appConfig.availableCamerasLimiter", C0903t.class);

    /* renamed from: a, reason: collision with root package name */
    private final z.v0 f7389a;

    public static final class a implements h.a {

        /* renamed from: a, reason: collision with root package name */
        private final z.r0 f7390a;

        public a() {
            this(z.r0.create());
        }

        public static a fromConfig(C c9) {
            return new a(z.r0.from((InterfaceC6565N) c9));
        }

        private z.q0 getMutableConfig() {
            return this.f7390a;
        }

        public C build() {
            return new C(z.v0.from(this.f7390a));
        }

        public a setAvailableCamerasLimiter(C0903t c0903t) {
            getMutableConfig().insertOption(C.f7388h, c0903t);
            return this;
        }

        public a setCameraExecutor(Executor executor) {
            getMutableConfig().insertOption(C.f7385e, executor);
            return this;
        }

        public a setCameraFactoryProvider(InterfaceC6607y.a aVar) {
            getMutableConfig().insertOption(C.f7382b, aVar);
            return this;
        }

        public a setDeviceSurfaceManagerProvider(InterfaceC6606x.a aVar) {
            getMutableConfig().insertOption(C.f7383c, aVar);
            return this;
        }

        public a setMinimumLoggingLevel(int i8) {
            getMutableConfig().insertOption(C.f7387g, Integer.valueOf(i8));
            return this;
        }

        public a setSchedulerHandler(Handler handler) {
            getMutableConfig().insertOption(C.f7386f, handler);
            return this;
        }

        @Override // C.h.a
        public /* bridge */ /* synthetic */ Object setTargetClass(Class cls) {
            return setTargetClass((Class<B>) cls);
        }

        public a setUseCaseConfigFactoryProvider(O0.c cVar) {
            getMutableConfig().insertOption(C.f7384d, cVar);
            return this;
        }

        private a(z.r0 r0Var) {
            this.f7390a = r0Var;
            Class cls = (Class) r0Var.retrieveOption(C.h.OPTION_TARGET_CLASS, null);
            if (cls == null || cls.equals(B.class)) {
                setTargetClass(B.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        @Override // C.h.a
        public a setTargetClass(Class<B> cls) {
            getMutableConfig().insertOption(C.h.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(C.h.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + g5.e.STATE_NAME_NONE + UUID.randomUUID());
            }
            return this;
        }

        @Override // C.h.a
        public a setTargetName(String str) {
            getMutableConfig().insertOption(C.h.OPTION_TARGET_NAME, str);
            return this;
        }
    }

    public interface b {
        C getCameraXConfig();
    }

    C(z.v0 v0Var) {
        this.f7389a = v0Var;
    }

    @Override // C.h, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ boolean containsOption(InterfaceC6565N.a aVar) {
        return super.containsOption(aVar);
    }

    @Override // C.h, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ void findOptions(String str, InterfaceC6565N.b bVar) {
        super.findOptions(str, bVar);
    }

    public C0903t getAvailableCamerasLimiter(C0903t c0903t) {
        return (C0903t) this.f7389a.retrieveOption(f7388h, c0903t);
    }

    public Executor getCameraExecutor(Executor executor) {
        return (Executor) this.f7389a.retrieveOption(f7385e, executor);
    }

    public InterfaceC6607y.a getCameraFactoryProvider(InterfaceC6607y.a aVar) {
        return (InterfaceC6607y.a) this.f7389a.retrieveOption(f7382b, aVar);
    }

    @Override // C.h, z.A0
    public InterfaceC6565N getConfig() {
        return this.f7389a;
    }

    public InterfaceC6606x.a getDeviceSurfaceManagerProvider(InterfaceC6606x.a aVar) {
        return (InterfaceC6606x.a) this.f7389a.retrieveOption(f7383c, aVar);
    }

    public int getMinimumLoggingLevel() {
        return ((Integer) this.f7389a.retrieveOption(f7387g, 3)).intValue();
    }

    @Override // C.h, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ InterfaceC6565N.c getOptionPriority(InterfaceC6565N.a aVar) {
        return super.getOptionPriority(aVar);
    }

    @Override // C.h, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ Set getPriorities(InterfaceC6565N.a aVar) {
        return super.getPriorities(aVar);
    }

    public Handler getSchedulerHandler(Handler handler) {
        return (Handler) this.f7389a.retrieveOption(f7386f, handler);
    }

    @Override // C.h
    public /* bridge */ /* synthetic */ Class getTargetClass() {
        return super.getTargetClass();
    }

    @Override // C.h
    public /* bridge */ /* synthetic */ String getTargetName() {
        return super.getTargetName();
    }

    public O0.c getUseCaseConfigFactoryProvider(O0.c cVar) {
        return (O0.c) this.f7389a.retrieveOption(f7384d, cVar);
    }

    @Override // C.h, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ Set listOptions() {
        return super.listOptions();
    }

    @Override // C.h, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ Object retrieveOption(InterfaceC6565N.a aVar) {
        return super.retrieveOption(aVar);
    }

    @Override // C.h, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ Object retrieveOptionWithPriority(InterfaceC6565N.a aVar, InterfaceC6565N.c cVar) {
        return super.retrieveOptionWithPriority(aVar, cVar);
    }

    @Override // C.h
    public /* bridge */ /* synthetic */ Class getTargetClass(Class cls) {
        return super.getTargetClass(cls);
    }

    @Override // C.h
    public /* bridge */ /* synthetic */ String getTargetName(String str) {
        return super.getTargetName(str);
    }

    @Override // C.h, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ Object retrieveOption(InterfaceC6565N.a aVar, Object obj) {
        return super.retrieveOption(aVar, obj);
    }
}
