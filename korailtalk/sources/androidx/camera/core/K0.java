package androidx.camera.core;

import C.i;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.g1;
import androidx.camera.core.h1;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import z.AbstractC6586j;
import z.C0;
import z.C6562K;
import z.InterfaceC6552A;
import z.InterfaceC6553B;
import z.InterfaceC6563L;
import z.InterfaceC6564M;
import z.InterfaceC6565N;
import z.InterfaceC6566O;
import z.InterfaceC6573c0;
import z.InterfaceC6575d0;
import z.InterfaceC6577e0;
import z.InterfaceC6600q;
import z.N0;
import z.O0;

/* loaded from: classes.dex */
public final class K0 extends h1 {
    public static final c DEFAULT_CONFIG = new c();

    /* renamed from: r */
    private static final Executor f7432r = A.a.mainThreadExecutor();

    /* renamed from: l */
    private d f7433l;

    /* renamed from: m */
    private Executor f7434m;

    /* renamed from: n */
    private z.S f7435n;

    /* renamed from: o */
    g1 f7436o;

    /* renamed from: p */
    private boolean f7437p;

    /* renamed from: q */
    private Size f7438q;

    class a extends AbstractC6586j {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6573c0 f7439a;

        a(InterfaceC6573c0 interfaceC6573c0) {
            this.f7439a = interfaceC6573c0;
        }

        @Override // z.AbstractC6586j
        public void onCaptureCompleted(InterfaceC6600q interfaceC6600q) {
            super.onCaptureCompleted(interfaceC6600q);
            if (this.f7439a.process(new C.b(interfaceC6600q))) {
                K0.this.k();
            }
        }
    }

    public static final class b implements N0.a, InterfaceC6577e0.a, i.a {

        /* renamed from: a */
        private final z.r0 f7441a;

        public b() {
            this(z.r0.create());
        }

        static b a(InterfaceC6565N interfaceC6565N) {
            return new b(z.r0.from(interfaceC6565N));
        }

        public static b fromConfig(z.x0 x0Var) {
            return new b(z.r0.from((InterfaceC6565N) x0Var));
        }

        @Override // z.N0.a, androidx.camera.core.I
        public z.q0 getMutableConfig() {
            return this.f7441a;
        }

        public b setCaptureProcessor(InterfaceC6563L interfaceC6563L) {
            getMutableConfig().insertOption(z.x0.OPTION_PREVIEW_CAPTURE_PROCESSOR, interfaceC6563L);
            return this;
        }

        public b setImageInfoProcessor(InterfaceC6573c0 interfaceC6573c0) {
            getMutableConfig().insertOption(z.x0.IMAGE_INFO_PROCESSOR, interfaceC6573c0);
            return this;
        }

        @Override // z.InterfaceC6577e0.a
        public /* bridge */ /* synthetic */ Object setSupportedResolutions(List list) {
            return setSupportedResolutions((List<Pair<Integer, Size[]>>) list);
        }

        @Override // z.N0.a, C.h.a
        public /* bridge */ /* synthetic */ Object setTargetClass(Class cls) {
            return setTargetClass((Class<K0>) cls);
        }

        private b(z.r0 r0Var) {
            this.f7441a = r0Var;
            Class cls = (Class) r0Var.retrieveOption(C.h.OPTION_TARGET_CLASS, null);
            if (cls == null || cls.equals(K0.class)) {
                setTargetClass(K0.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        @Override // z.N0.a, androidx.camera.core.I
        public K0 build() {
            if (getMutableConfig().retrieveOption(InterfaceC6577e0.OPTION_TARGET_ASPECT_RATIO, null) == null || getMutableConfig().retrieveOption(InterfaceC6577e0.OPTION_TARGET_RESOLUTION, null) == null) {
                return new K0(getUseCaseConfig());
            }
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }

        @Override // z.N0.a
        public z.x0 getUseCaseConfig() {
            return new z.x0(z.v0.from(this.f7441a));
        }

        @Override // C.i.a
        public b setBackgroundExecutor(Executor executor) {
            getMutableConfig().insertOption(C.i.OPTION_BACKGROUND_EXECUTOR, executor);
            return this;
        }

        @Override // z.N0.a
        public b setCameraSelector(C0903t c0903t) {
            getMutableConfig().insertOption(z.N0.OPTION_CAMERA_SELECTOR, c0903t);
            return this;
        }

        @Override // z.N0.a
        public b setCaptureOptionUnpacker(C6562K.b bVar) {
            getMutableConfig().insertOption(z.N0.OPTION_CAPTURE_CONFIG_UNPACKER, bVar);
            return this;
        }

        @Override // z.N0.a
        public b setDefaultCaptureConfig(C6562K c6562k) {
            getMutableConfig().insertOption(z.N0.OPTION_DEFAULT_CAPTURE_CONFIG, c6562k);
            return this;
        }

        @Override // z.InterfaceC6577e0.a
        public b setDefaultResolution(Size size) {
            getMutableConfig().insertOption(InterfaceC6577e0.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        @Override // z.N0.a
        public b setDefaultSessionConfig(z.C0 c02) {
            getMutableConfig().insertOption(z.N0.OPTION_DEFAULT_SESSION_CONFIG, c02);
            return this;
        }

        @Override // z.InterfaceC6577e0.a
        public b setMaxResolution(Size size) {
            getMutableConfig().insertOption(InterfaceC6577e0.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        @Override // z.N0.a
        public b setSessionOptionUnpacker(C0.d dVar) {
            getMutableConfig().insertOption(z.N0.OPTION_SESSION_CONFIG_UNPACKER, dVar);
            return this;
        }

        @Override // z.InterfaceC6577e0.a
        public b setSupportedResolutions(List<Pair<Integer, Size[]>> list) {
            getMutableConfig().insertOption(InterfaceC6577e0.OPTION_SUPPORTED_RESOLUTIONS, list);
            return this;
        }

        @Override // z.N0.a
        public b setSurfaceOccupancyPriority(int i8) {
            getMutableConfig().insertOption(z.N0.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i8));
            return this;
        }

        @Override // z.InterfaceC6577e0.a
        public b setTargetAspectRatio(int i8) {
            getMutableConfig().insertOption(InterfaceC6577e0.OPTION_TARGET_ASPECT_RATIO, Integer.valueOf(i8));
            return this;
        }

        @Override // z.N0.a, C.h.a
        public b setTargetClass(Class<K0> cls) {
            getMutableConfig().insertOption(C.h.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(C.h.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + g5.e.STATE_NAME_NONE + UUID.randomUUID());
            }
            return this;
        }

        @Override // z.N0.a, C.h.a
        public b setTargetName(String str) {
            getMutableConfig().insertOption(C.h.OPTION_TARGET_NAME, str);
            return this;
        }

        @Override // z.InterfaceC6577e0.a
        public b setTargetResolution(Size size) {
            getMutableConfig().insertOption(InterfaceC6577e0.OPTION_TARGET_RESOLUTION, size);
            return this;
        }

        @Override // z.InterfaceC6577e0.a
        public b setTargetRotation(int i8) {
            getMutableConfig().insertOption(InterfaceC6577e0.OPTION_TARGET_ROTATION, Integer.valueOf(i8));
            return this;
        }

        @Override // z.N0.a, C.j.a
        public b setUseCaseEventCallback(h1.b bVar) {
            getMutableConfig().insertOption(C.j.OPTION_USE_CASE_EVENT_CALLBACK, bVar);
            return this;
        }
    }

    public static final class c implements InterfaceC6566O {

        /* renamed from: a */
        private static final z.x0 f7442a = new b().setSurfaceOccupancyPriority(2).setTargetAspectRatio(0).getUseCaseConfig();

        @Override // z.InterfaceC6566O
        public z.x0 getConfig() {
            return f7442a;
        }
    }

    public interface d {
        void onSurfaceRequested(g1 g1Var);
    }

    K0(z.x0 x0Var) {
        super(x0Var);
        this.f7434m = f7432r;
        this.f7437p = false;
    }

    private Rect u(Size size) {
        if (getViewPortCropRect() != null) {
            return getViewPortCropRect();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    public /* synthetic */ void v(String str, z.x0 x0Var, Size size, z.C0 c02, C0.e eVar) {
        if (g(str)) {
            q(t(str, x0Var, size).build());
            j();
        }
    }

    private boolean x() {
        final g1 g1Var = this.f7436o;
        final d dVar = this.f7433l;
        if (dVar == null || g1Var == null) {
            return false;
        }
        this.f7434m.execute(new Runnable() { // from class: androidx.camera.core.J0
            @Override // java.lang.Runnable
            public final void run() {
                dVar.onSurfaceRequested(g1Var);
            }
        });
        return true;
    }

    private void y() {
        InterfaceC6553B camera = getCamera();
        d dVar = this.f7433l;
        Rect rectU = u(this.f7438q);
        g1 g1Var = this.f7436o;
        if (camera == null || dVar == null || rectU == null) {
            return;
        }
        g1Var.updateTransformationInfo(g1.g.of(rectU, d(camera), getTargetRotation()));
    }

    private void z(String str, z.x0 x0Var, Size size) {
        q(t(str, x0Var, size).build());
    }

    @Override // androidx.camera.core.h1
    public z.N0 getDefaultConfig(boolean z8, z.O0 o02) {
        InterfaceC6565N config = o02.getConfig(O0.b.PREVIEW);
        if (z8) {
            config = InterfaceC6565N.mergeConfigs(config, DEFAULT_CONFIG.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
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
        return b.a(interfaceC6565N);
    }

    @Override // androidx.camera.core.h1
    protected z.N0 m(InterfaceC6552A interfaceC6552A, N0.a aVar) {
        if (aVar.getMutableConfig().retrieveOption(z.x0.OPTION_PREVIEW_CAPTURE_PROCESSOR, null) != null) {
            aVar.getMutableConfig().insertOption(InterfaceC6575d0.OPTION_INPUT_FORMAT, 35);
        } else {
            aVar.getMutableConfig().insertOption(InterfaceC6575d0.OPTION_INPUT_FORMAT, 34);
        }
        return aVar.getUseCaseConfig();
    }

    @Override // androidx.camera.core.h1
    protected Size n(Size size) {
        this.f7438q = size;
        z(c(), (z.x0) getCurrentConfig(), this.f7438q);
        return size;
    }

    @Override // androidx.camera.core.h1
    public void onDetached() {
        z.S s8 = this.f7435n;
        if (s8 != null) {
            s8.close();
        }
        this.f7436o = null;
    }

    public void setSurfaceProvider(Executor executor, d dVar) {
        androidx.camera.core.impl.utils.m.checkMainThread();
        if (dVar == null) {
            this.f7433l = null;
            i();
            return;
        }
        this.f7433l = dVar;
        this.f7434m = executor;
        h();
        if (this.f7437p) {
            if (x()) {
                y();
                this.f7437p = false;
                return;
            }
            return;
        }
        if (getAttachedSurfaceResolution() != null) {
            z(c(), (z.x0) getCurrentConfig(), getAttachedSurfaceResolution());
            j();
        }
    }

    public void setTargetRotation(int i8) {
        if (p(i8)) {
            y();
        }
    }

    @Override // androidx.camera.core.h1
    public void setViewPortCropRect(Rect rect) {
        super.setViewPortCropRect(rect);
        y();
    }

    C0.b t(final String str, final z.x0 x0Var, final Size size) {
        androidx.camera.core.impl.utils.m.checkMainThread();
        C0.b bVarCreateFrom = C0.b.createFrom(x0Var);
        InterfaceC6563L captureProcessor = x0Var.getCaptureProcessor(null);
        z.S s8 = this.f7435n;
        if (s8 != null) {
            s8.close();
        }
        g1 g1Var = new g1(size, getCamera(), captureProcessor != null);
        this.f7436o = g1Var;
        if (x()) {
            y();
        } else {
            this.f7437p = true;
        }
        if (captureProcessor != null) {
            InterfaceC6564M.a aVar = new InterfaceC6564M.a();
            final HandlerThread handlerThread = new HandlerThread("CameraX-preview_processing");
            handlerThread.start();
            String string = Integer.toString(aVar.hashCode());
            Q0 q02 = new Q0(size.getWidth(), size.getHeight(), x0Var.getInputFormat(), new Handler(handlerThread.getLooper()), aVar, captureProcessor, g1Var.getDeferrableSurface(), string);
            bVarCreateFrom.addCameraCaptureCallback(q02.h());
            q02.getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.core.H0
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quitSafely();
                }
            }, A.a.directExecutor());
            this.f7435n = q02;
            bVarCreateFrom.addTag(string, Integer.valueOf(aVar.getId()));
        } else {
            InterfaceC6573c0 imageInfoProcessor = x0Var.getImageInfoProcessor(null);
            if (imageInfoProcessor != null) {
                bVarCreateFrom.addCameraCaptureCallback(new a(imageInfoProcessor));
            }
            this.f7435n = g1Var.getDeferrableSurface();
        }
        bVarCreateFrom.addSurface(this.f7435n);
        bVarCreateFrom.addErrorListener(new C0.c() { // from class: androidx.camera.core.I0
            @Override // z.C0.c
            public final void onError(z.C0 c02, C0.e eVar) {
                this.f7423a.v(str, x0Var, size, c02, eVar);
            }
        });
        return bVarCreateFrom;
    }

    public String toString() {
        return "Preview:" + getName();
    }

    public void setSurfaceProvider(d dVar) {
        setSurfaceProvider(f7432r, dVar);
    }
}
