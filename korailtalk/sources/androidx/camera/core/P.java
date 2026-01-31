package androidx.camera.core;

import C.i;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.h1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import z.C0;
import z.C6562K;
import z.C6569a0;
import z.C6583h0;
import z.InterfaceC6552A;
import z.InterfaceC6553B;
import z.InterfaceC6565N;
import z.InterfaceC6566O;
import z.InterfaceC6577e0;
import z.N0;
import z.O0;

/* loaded from: classes.dex */
public final class P extends h1 {
    public static final int OUTPUT_IMAGE_FORMAT_RGBA_8888 = 2;
    public static final int OUTPUT_IMAGE_FORMAT_YUV_420_888 = 1;
    public static final int STRATEGY_BLOCK_PRODUCER = 1;
    public static final int STRATEGY_KEEP_ONLY_LATEST = 0;

    /* renamed from: l */
    final T f7482l;

    /* renamed from: m */
    private final Object f7483m;

    /* renamed from: n */
    private a f7484n;

    /* renamed from: o */
    private z.S f7485o;
    public static final d DEFAULT_CONFIG = new d();

    /* renamed from: p */
    private static final Boolean f7481p = null;

    public interface a {
        void analyze(InterfaceC0902s0 interfaceC0902s0);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static final class c implements InterfaceC6577e0.a, i.a, N0.a {

        /* renamed from: a */
        private final z.r0 f7486a;

        public c() {
            this(z.r0.create());
        }

        static c a(InterfaceC6565N interfaceC6565N) {
            return new c(z.r0.from(interfaceC6565N));
        }

        public static c fromConfig(C6569a0 c6569a0) {
            return new c(z.r0.from((InterfaceC6565N) c6569a0));
        }

        @Override // z.N0.a, androidx.camera.core.I
        public z.q0 getMutableConfig() {
            return this.f7486a;
        }

        public c setBackpressureStrategy(int i8) {
            getMutableConfig().insertOption(C6569a0.OPTION_BACKPRESSURE_STRATEGY, Integer.valueOf(i8));
            return this;
        }

        public c setImageQueueDepth(int i8) {
            getMutableConfig().insertOption(C6569a0.OPTION_IMAGE_QUEUE_DEPTH, Integer.valueOf(i8));
            return this;
        }

        public c setImageReaderProxyProvider(InterfaceC0904t0 interfaceC0904t0) {
            getMutableConfig().insertOption(C6569a0.OPTION_IMAGE_READER_PROXY_PROVIDER, interfaceC0904t0);
            return this;
        }

        public c setOnePixelShiftEnabled(boolean z8) {
            getMutableConfig().insertOption(C6569a0.OPTION_ONE_PIXEL_SHIFT_ENABLED, Boolean.valueOf(z8));
            return this;
        }

        public c setOutputImageFormat(int i8) {
            getMutableConfig().insertOption(C6569a0.OPTION_OUTPUT_IMAGE_FORMAT, Integer.valueOf(i8));
            return this;
        }

        public c setOutputImageRotationEnabled(boolean z8) {
            getMutableConfig().insertOption(C6569a0.OPTION_OUTPUT_IMAGE_ROTATION_ENABLED, Boolean.valueOf(z8));
            return this;
        }

        @Override // z.InterfaceC6577e0.a
        public /* bridge */ /* synthetic */ Object setSupportedResolutions(List list) {
            return setSupportedResolutions((List<Pair<Integer, Size[]>>) list);
        }

        @Override // z.N0.a, C.h.a
        public /* bridge */ /* synthetic */ Object setTargetClass(Class cls) {
            return setTargetClass((Class<P>) cls);
        }

        private c(z.r0 r0Var) {
            this.f7486a = r0Var;
            Class cls = (Class) r0Var.retrieveOption(C.h.OPTION_TARGET_CLASS, null);
            if (cls == null || cls.equals(P.class)) {
                setTargetClass(P.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        @Override // z.N0.a, androidx.camera.core.I
        public P build() {
            if (getMutableConfig().retrieveOption(InterfaceC6577e0.OPTION_TARGET_ASPECT_RATIO, null) == null || getMutableConfig().retrieveOption(InterfaceC6577e0.OPTION_TARGET_RESOLUTION, null) == null) {
                return new P(getUseCaseConfig());
            }
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }

        @Override // z.N0.a
        public C6569a0 getUseCaseConfig() {
            return new C6569a0(z.v0.from(this.f7486a));
        }

        @Override // C.i.a
        public c setBackgroundExecutor(Executor executor) {
            getMutableConfig().insertOption(C.i.OPTION_BACKGROUND_EXECUTOR, executor);
            return this;
        }

        @Override // z.N0.a
        public c setCameraSelector(C0903t c0903t) {
            getMutableConfig().insertOption(z.N0.OPTION_CAMERA_SELECTOR, c0903t);
            return this;
        }

        @Override // z.N0.a
        public c setCaptureOptionUnpacker(C6562K.b bVar) {
            getMutableConfig().insertOption(z.N0.OPTION_CAPTURE_CONFIG_UNPACKER, bVar);
            return this;
        }

        @Override // z.N0.a
        public c setDefaultCaptureConfig(C6562K c6562k) {
            getMutableConfig().insertOption(z.N0.OPTION_DEFAULT_CAPTURE_CONFIG, c6562k);
            return this;
        }

        @Override // z.InterfaceC6577e0.a
        public c setDefaultResolution(Size size) {
            getMutableConfig().insertOption(InterfaceC6577e0.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        @Override // z.N0.a
        public c setDefaultSessionConfig(z.C0 c02) {
            getMutableConfig().insertOption(z.N0.OPTION_DEFAULT_SESSION_CONFIG, c02);
            return this;
        }

        @Override // z.InterfaceC6577e0.a
        public c setMaxResolution(Size size) {
            getMutableConfig().insertOption(InterfaceC6577e0.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        @Override // z.N0.a
        public c setSessionOptionUnpacker(C0.d dVar) {
            getMutableConfig().insertOption(z.N0.OPTION_SESSION_CONFIG_UNPACKER, dVar);
            return this;
        }

        @Override // z.InterfaceC6577e0.a
        public c setSupportedResolutions(List<Pair<Integer, Size[]>> list) {
            getMutableConfig().insertOption(InterfaceC6577e0.OPTION_SUPPORTED_RESOLUTIONS, list);
            return this;
        }

        @Override // z.N0.a
        public c setSurfaceOccupancyPriority(int i8) {
            getMutableConfig().insertOption(z.N0.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i8));
            return this;
        }

        @Override // z.InterfaceC6577e0.a
        public c setTargetAspectRatio(int i8) {
            getMutableConfig().insertOption(InterfaceC6577e0.OPTION_TARGET_ASPECT_RATIO, Integer.valueOf(i8));
            return this;
        }

        @Override // z.N0.a, C.h.a
        public c setTargetClass(Class<P> cls) {
            getMutableConfig().insertOption(C.h.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(C.h.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + g5.e.STATE_NAME_NONE + UUID.randomUUID());
            }
            return this;
        }

        @Override // z.N0.a, C.h.a
        public c setTargetName(String str) {
            getMutableConfig().insertOption(C.h.OPTION_TARGET_NAME, str);
            return this;
        }

        @Override // z.InterfaceC6577e0.a
        public c setTargetResolution(Size size) {
            getMutableConfig().insertOption(InterfaceC6577e0.OPTION_TARGET_RESOLUTION, size);
            return this;
        }

        @Override // z.InterfaceC6577e0.a
        public c setTargetRotation(int i8) {
            getMutableConfig().insertOption(InterfaceC6577e0.OPTION_TARGET_ROTATION, Integer.valueOf(i8));
            return this;
        }

        @Override // z.N0.a, C.j.a
        public c setUseCaseEventCallback(h1.b bVar) {
            getMutableConfig().insertOption(C.j.OPTION_USE_CASE_EVENT_CALLBACK, bVar);
            return this;
        }
    }

    public static final class d implements InterfaceC6566O {

        /* renamed from: a */
        private static final Size f7487a;

        /* renamed from: b */
        private static final C6569a0 f7488b;

        static {
            Size size = new Size(640, 480);
            f7487a = size;
            f7488b = new c().setDefaultResolution(size).setSurfaceOccupancyPriority(1).setTargetAspectRatio(0).getUseCaseConfig();
        }

        @Override // z.InterfaceC6566O
        public C6569a0 getConfig() {
            return f7488b;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    P(C6569a0 c6569a0) {
        super(c6569a0);
        this.f7483m = new Object();
        if (((C6569a0) getCurrentConfig()).getBackpressureStrategy(0) == 1) {
            this.f7482l = new U();
        } else {
            this.f7482l = new V(c6569a0.getBackgroundExecutor(A.a.highPriorityExecutor()));
        }
        this.f7482l.t(getOutputImageFormat());
        this.f7482l.u(isOutputImageRotationEnabled());
    }

    private void A() {
        InterfaceC6553B camera = getCamera();
        if (camera != null) {
            this.f7482l.w(d(camera));
        }
    }

    private boolean w(InterfaceC6553B interfaceC6553B) {
        return isOutputImageRotationEnabled() && d(interfaceC6553B) % 180 != 0;
    }

    public static /* synthetic */ void x(U0 u02, U0 u03) {
        u02.e();
        if (u03 != null) {
            u03.e();
        }
    }

    public /* synthetic */ void y(String str, C6569a0 c6569a0, Size size, z.C0 c02, C0.e eVar) {
        u();
        this.f7482l.f();
        if (g(str)) {
            q(v(str, c6569a0, size).build());
            j();
        }
    }

    public void clearAnalyzer() {
        synchronized (this.f7483m) {
            try {
                this.f7482l.r(null, null);
                if (this.f7484n != null) {
                    i();
                }
                this.f7484n = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getBackpressureStrategy() {
        return ((C6569a0) getCurrentConfig()).getBackpressureStrategy(0);
    }

    @Override // androidx.camera.core.h1
    public z.N0 getDefaultConfig(boolean z8, z.O0 o02) {
        InterfaceC6565N config = o02.getConfig(O0.b.IMAGE_ANALYSIS);
        if (z8) {
            config = InterfaceC6565N.mergeConfigs(config, DEFAULT_CONFIG.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    public int getImageQueueDepth() {
        return ((C6569a0) getCurrentConfig()).getImageQueueDepth(6);
    }

    public Boolean getOnePixelShiftEnabled() {
        return ((C6569a0) getCurrentConfig()).getOnePixelShiftEnabled(f7481p);
    }

    public int getOutputImageFormat() {
        return ((C6569a0) getCurrentConfig()).getOutputImageFormat(1);
    }

    @Override // androidx.camera.core.h1
    public R0 getResolutionInfo() {
        return super.getResolutionInfo();
    }

    public int getTargetRotation() {
        return f();
    }

    @Override // androidx.camera.core.h1
    public N0.a getUseCaseConfigBuilder(InterfaceC6565N interfaceC6565N) {
        return c.a(interfaceC6565N);
    }

    public boolean isOutputImageRotationEnabled() {
        return ((C6569a0) getCurrentConfig()).isOutputImageRotationEnabled(Boolean.FALSE).booleanValue();
    }

    @Override // androidx.camera.core.h1
    protected z.N0 m(InterfaceC6552A interfaceC6552A, N0.a aVar) {
        Boolean onePixelShiftEnabled = getOnePixelShiftEnabled();
        boolean zContains = interfaceC6552A.getCameraQuirks().contains(E.d.class);
        T t8 = this.f7482l;
        if (onePixelShiftEnabled != null) {
            zContains = onePixelShiftEnabled.booleanValue();
        }
        t8.s(zContains);
        return super.m(interfaceC6552A, aVar);
    }

    @Override // androidx.camera.core.h1
    protected Size n(Size size) {
        q(v(c(), (C6569a0) getCurrentConfig(), size).build());
        return size;
    }

    @Override // androidx.camera.core.h1
    public void onAttached() {
        this.f7482l.e();
    }

    @Override // androidx.camera.core.h1
    public void onDetached() {
        u();
        this.f7482l.i();
    }

    public void setAnalyzer(Executor executor, final a aVar) {
        synchronized (this.f7483m) {
            try {
                this.f7482l.r(executor, new a() { // from class: androidx.camera.core.M
                    @Override // androidx.camera.core.P.a
                    public final void analyze(InterfaceC0902s0 interfaceC0902s0) {
                        aVar.analyze(interfaceC0902s0);
                    }
                });
                if (this.f7484n == null) {
                    h();
                }
                this.f7484n = aVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.h1
    public void setSensorToBufferTransformMatrix(Matrix matrix) {
        this.f7482l.x(matrix);
    }

    public void setTargetRotation(int i8) {
        if (p(i8)) {
            A();
        }
    }

    @Override // androidx.camera.core.h1
    public void setViewPortCropRect(Rect rect) {
        super.setViewPortCropRect(rect);
        this.f7482l.y(rect);
    }

    public String toString() {
        return "ImageAnalysis:" + getName();
    }

    void u() {
        androidx.camera.core.impl.utils.m.checkMainThread();
        z.S s8 = this.f7485o;
        if (s8 != null) {
            s8.close();
            this.f7485o = null;
        }
    }

    C0.b v(final String str, final C6569a0 c6569a0, final Size size) {
        androidx.camera.core.impl.utils.m.checkMainThread();
        Executor executor = (Executor) Z.h.checkNotNull(c6569a0.getBackgroundExecutor(A.a.highPriorityExecutor()));
        boolean z8 = true;
        int imageQueueDepth = getBackpressureStrategy() == 1 ? getImageQueueDepth() : 4;
        c6569a0.getImageReaderProxyProvider();
        final U0 u02 = new U0(AbstractC0906u0.a(size.getWidth(), size.getHeight(), getImageFormat(), imageQueueDepth));
        boolean zW = getCamera() != null ? w(getCamera()) : false;
        int height = zW ? size.getHeight() : size.getWidth();
        int width = zW ? size.getWidth() : size.getHeight();
        int i8 = getOutputImageFormat() == 2 ? 1 : 35;
        boolean z9 = getImageFormat() == 35 && getOutputImageFormat() == 2;
        if (getImageFormat() != 35 || ((getCamera() == null || d(getCamera()) == 0) && !Boolean.TRUE.equals(getOnePixelShiftEnabled()))) {
            z8 = false;
        }
        final U0 u03 = (z9 || z8) ? new U0(AbstractC0906u0.a(height, width, i8, u02.getMaxImages())) : null;
        if (u03 != null) {
            this.f7482l.v(u03);
        }
        A();
        u02.setOnImageAvailableListener(this.f7482l, executor);
        C0.b bVarCreateFrom = C0.b.createFrom(c6569a0);
        z.S s8 = this.f7485o;
        if (s8 != null) {
            s8.close();
        }
        C6583h0 c6583h0 = new C6583h0(u02.getSurface(), size, getImageFormat());
        this.f7485o = c6583h0;
        c6583h0.getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.core.N
            @Override // java.lang.Runnable
            public final void run() {
                P.x(u02, u03);
            }
        }, A.a.mainThreadExecutor());
        bVarCreateFrom.addSurface(this.f7485o);
        bVarCreateFrom.addErrorListener(new C0.c() { // from class: androidx.camera.core.O
            @Override // z.C0.c
            public final void onError(z.C0 c02, C0.e eVar) {
                this.f7476a.y(str, c6569a0, size, c02, eVar);
            }
        });
        return bVarCreateFrom;
    }
}
