package androidx.camera.core;

import C.g;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.C0889l0;
import androidx.camera.core.L;
import androidx.camera.core.M0;
import androidx.camera.core.RunnableC0914y0;
import androidx.camera.core.h1;
import androidx.concurrent.futures.c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p.InterfaceC6046a;
import z.AbstractC6586j;
import z.C0;
import z.C6562K;
import z.C6571b0;
import z.C6583h0;
import z.InterfaceC6552A;
import z.InterfaceC6553B;
import z.InterfaceC6561J;
import z.InterfaceC6563L;
import z.InterfaceC6564M;
import z.InterfaceC6565N;
import z.InterfaceC6566O;
import z.InterfaceC6575d0;
import z.InterfaceC6577e0;
import z.InterfaceC6581g0;
import z.N0;
import z.O0;

/* renamed from: androidx.camera.core.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0889l0 extends h1 {
    public static final int CAPTURE_MODE_MAXIMIZE_QUALITY = 0;
    public static final int CAPTURE_MODE_MINIMIZE_LATENCY = 1;
    public static final h DEFAULT_CONFIG = new h();
    public static final int ERROR_CAMERA_CLOSED = 3;
    public static final int ERROR_CAPTURE_FAILED = 2;
    public static final int ERROR_FILE_IO = 1;
    public static final int ERROR_INVALID_CAMERA = 4;
    public static final int ERROR_UNKNOWN = 0;
    public static final int FLASH_MODE_AUTO = 0;
    public static final int FLASH_MODE_OFF = 2;
    public static final int FLASH_MODE_ON = 1;
    public static final int FLASH_TYPE_ONE_SHOT_FLASH = 0;
    public static final int FLASH_TYPE_USE_TORCH_AS_FLASH = 1;

    /* renamed from: A, reason: collision with root package name */
    M0 f7729A;

    /* renamed from: B, reason: collision with root package name */
    private AbstractC6586j f7730B;

    /* renamed from: C, reason: collision with root package name */
    private z.S f7731C;

    /* renamed from: D, reason: collision with root package name */
    private j f7732D;

    /* renamed from: E, reason: collision with root package name */
    final Executor f7733E;

    /* renamed from: F, reason: collision with root package name */
    private Matrix f7734F;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC6581g0.a f7735l;

    /* renamed from: m, reason: collision with root package name */
    final Executor f7736m;

    /* renamed from: n, reason: collision with root package name */
    private final int f7737n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicReference f7738o;

    /* renamed from: p, reason: collision with root package name */
    private final int f7739p;

    /* renamed from: q, reason: collision with root package name */
    private int f7740q;

    /* renamed from: r, reason: collision with root package name */
    private Rational f7741r;

    /* renamed from: s, reason: collision with root package name */
    private ExecutorService f7742s;

    /* renamed from: t, reason: collision with root package name */
    private C6562K f7743t;

    /* renamed from: u, reason: collision with root package name */
    private InterfaceC6561J f7744u;

    /* renamed from: v, reason: collision with root package name */
    private int f7745v;

    /* renamed from: w, reason: collision with root package name */
    private InterfaceC6563L f7746w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f7747x;

    /* renamed from: y, reason: collision with root package name */
    C0.b f7748y;

    /* renamed from: z, reason: collision with root package name */
    U0 f7749z;

    /* renamed from: androidx.camera.core.l0$a */
    class a implements j.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C.l f7750a;

        a(C.l lVar) {
            this.f7750a = lVar;
        }

        @Override // androidx.camera.core.C0889l0.j.c
        public void onPreProcessRequest(i iVar) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f7750a.setJpegQuality(iVar.f7765b);
            }
        }
    }

    /* renamed from: androidx.camera.core.l0$b */
    class b implements RunnableC0914y0.b {
        b(l lVar) {
        }

        @Override // androidx.camera.core.RunnableC0914y0.b
        public void onError(RunnableC0914y0.c cVar, String str, Throwable th) {
            new C0895o0(f.f7761a[cVar.ordinal()] != 1 ? 0 : 1, str, th);
            throw null;
        }

        @Override // androidx.camera.core.RunnableC0914y0.b
        public void onImageSaved(n nVar) {
            throw null;
        }
    }

    /* renamed from: androidx.camera.core.l0$c */
    class c extends k {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f7753a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Executor f7754b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ RunnableC0914y0.b f7755c;

        c(m mVar, int i8, Executor executor, RunnableC0914y0.b bVar, l lVar) {
            this.f7753a = i8;
            this.f7754b = executor;
            this.f7755c = bVar;
        }

        @Override // androidx.camera.core.C0889l0.k
        public void onCaptureSuccess(InterfaceC0902s0 interfaceC0902s0) {
            C0889l0.this.f7736m.execute(new RunnableC0914y0(interfaceC0902s0, null, interfaceC0902s0.getImageInfo().getRotationDegrees(), this.f7753a, this.f7754b, C0889l0.this.f7733E, this.f7755c));
        }

        @Override // androidx.camera.core.C0889l0.k
        public void onError(C0895o0 c0895o0) {
            throw null;
        }
    }

    /* renamed from: androidx.camera.core.l0$d */
    class d implements B.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f7757a;

        d(c.a aVar) {
            this.f7757a = aVar;
        }

        @Override // B.c
        public void onFailure(Throwable th) {
            C0889l0.this.c0();
            this.f7757a.setException(th);
        }

        @Override // B.c
        public void onSuccess(Void r12) {
            C0889l0.this.c0();
        }
    }

    /* renamed from: androidx.camera.core.l0$e */
    class e implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f7759a = new AtomicInteger(0);

        e() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "CameraX-image_capture_" + this.f7759a.getAndIncrement());
        }
    }

    /* renamed from: androidx.camera.core.l0$f */
    static /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7761a;

        static {
            int[] iArr = new int[RunnableC0914y0.c.values().length];
            f7761a = iArr;
            try {
                iArr[RunnableC0914y0.c.FILE_IO_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: androidx.camera.core.l0$g */
    public static final class g implements N0.a, InterfaceC6577e0.a, g.a {

        /* renamed from: a, reason: collision with root package name */
        private final z.r0 f7762a;

        public g() {
            this(z.r0.create());
        }

        public static g fromConfig(InterfaceC6565N interfaceC6565N) {
            return new g(z.r0.from(interfaceC6565N));
        }

        @Override // z.N0.a, androidx.camera.core.I
        public z.q0 getMutableConfig() {
            return this.f7762a;
        }

        public g setBufferFormat(int i8) {
            getMutableConfig().insertOption(C6571b0.OPTION_BUFFER_FORMAT, Integer.valueOf(i8));
            return this;
        }

        public g setCaptureBundle(InterfaceC6561J interfaceC6561J) {
            getMutableConfig().insertOption(C6571b0.OPTION_CAPTURE_BUNDLE, interfaceC6561J);
            return this;
        }

        public g setCaptureMode(int i8) {
            getMutableConfig().insertOption(C6571b0.OPTION_IMAGE_CAPTURE_MODE, Integer.valueOf(i8));
            return this;
        }

        public g setCaptureProcessor(InterfaceC6563L interfaceC6563L) {
            getMutableConfig().insertOption(C6571b0.OPTION_CAPTURE_PROCESSOR, interfaceC6563L);
            return this;
        }

        public g setFlashMode(int i8) {
            getMutableConfig().insertOption(C6571b0.OPTION_FLASH_MODE, Integer.valueOf(i8));
            return this;
        }

        public g setFlashType(int i8) {
            getMutableConfig().insertOption(C6571b0.OPTION_FLASH_TYPE, Integer.valueOf(i8));
            return this;
        }

        public g setImageReaderProxyProvider(InterfaceC0904t0 interfaceC0904t0) {
            getMutableConfig().insertOption(C6571b0.OPTION_IMAGE_READER_PROXY_PROVIDER, interfaceC0904t0);
            return this;
        }

        public g setJpegQuality(int i8) {
            Z.h.checkArgumentInRange(i8, 1, 100, "jpegQuality");
            getMutableConfig().insertOption(C6571b0.OPTION_JPEG_COMPRESSION_QUALITY, Integer.valueOf(i8));
            return this;
        }

        public g setMaxCaptureStages(int i8) {
            getMutableConfig().insertOption(C6571b0.OPTION_MAX_CAPTURE_STAGES, Integer.valueOf(i8));
            return this;
        }

        public g setSoftwareJpegEncoderRequested(boolean z8) {
            getMutableConfig().insertOption(C6571b0.OPTION_USE_SOFTWARE_JPEG_ENCODER, Boolean.valueOf(z8));
            return this;
        }

        @Override // z.InterfaceC6577e0.a
        public /* bridge */ /* synthetic */ Object setSupportedResolutions(List list) {
            return setSupportedResolutions((List<Pair<Integer, Size[]>>) list);
        }

        @Override // z.N0.a, C.h.a
        public /* bridge */ /* synthetic */ Object setTargetClass(Class cls) {
            return setTargetClass((Class<C0889l0>) cls);
        }

        private g(z.r0 r0Var) {
            this.f7762a = r0Var;
            Class cls = (Class) r0Var.retrieveOption(C.h.OPTION_TARGET_CLASS, null);
            if (cls == null || cls.equals(C0889l0.class)) {
                setTargetClass(C0889l0.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        @Override // z.N0.a, androidx.camera.core.I
        public C0889l0 build() {
            int iIntValue;
            if (getMutableConfig().retrieveOption(InterfaceC6577e0.OPTION_TARGET_ASPECT_RATIO, null) != null && getMutableConfig().retrieveOption(InterfaceC6577e0.OPTION_TARGET_RESOLUTION, null) != null) {
                throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
            }
            Integer num = (Integer) getMutableConfig().retrieveOption(C6571b0.OPTION_BUFFER_FORMAT, null);
            if (num != null) {
                Z.h.checkArgument(getMutableConfig().retrieveOption(C6571b0.OPTION_CAPTURE_PROCESSOR, null) == null, "Cannot set buffer format with CaptureProcessor defined.");
                getMutableConfig().insertOption(InterfaceC6575d0.OPTION_INPUT_FORMAT, num);
            } else if (getMutableConfig().retrieveOption(C6571b0.OPTION_CAPTURE_PROCESSOR, null) != null) {
                getMutableConfig().insertOption(InterfaceC6575d0.OPTION_INPUT_FORMAT, 35);
            } else {
                getMutableConfig().insertOption(InterfaceC6575d0.OPTION_INPUT_FORMAT, 256);
            }
            C0889l0 c0889l0 = new C0889l0(getUseCaseConfig());
            Size size = (Size) getMutableConfig().retrieveOption(InterfaceC6577e0.OPTION_TARGET_RESOLUTION, null);
            if (size != null) {
                c0889l0.setCropAspectRatio(new Rational(size.getWidth(), size.getHeight()));
            }
            Z.h.checkArgument(((Integer) getMutableConfig().retrieveOption(C6571b0.OPTION_MAX_CAPTURE_STAGES, 2)).intValue() >= 1, "Maximum outstanding image count must be at least 1");
            Z.h.checkNotNull((Executor) getMutableConfig().retrieveOption(C.g.OPTION_IO_EXECUTOR, A.a.ioExecutor()), "The IO executor can't be null");
            z.q0 mutableConfig = getMutableConfig();
            InterfaceC6565N.a aVar = C6571b0.OPTION_FLASH_MODE;
            if (!mutableConfig.containsOption(aVar) || (iIntValue = ((Integer) getMutableConfig().retrieveOption(aVar)).intValue()) == 0 || iIntValue == 1 || iIntValue == 2) {
                return c0889l0;
            }
            throw new IllegalArgumentException("The flash mode is not allowed to set: " + iIntValue);
        }

        @Override // z.N0.a
        public C6571b0 getUseCaseConfig() {
            return new C6571b0(z.v0.from(this.f7762a));
        }

        @Override // z.N0.a
        public g setCameraSelector(C0903t c0903t) {
            getMutableConfig().insertOption(z.N0.OPTION_CAMERA_SELECTOR, c0903t);
            return this;
        }

        @Override // z.N0.a
        public g setCaptureOptionUnpacker(C6562K.b bVar) {
            getMutableConfig().insertOption(z.N0.OPTION_CAPTURE_CONFIG_UNPACKER, bVar);
            return this;
        }

        @Override // z.N0.a
        public g setDefaultCaptureConfig(C6562K c6562k) {
            getMutableConfig().insertOption(z.N0.OPTION_DEFAULT_CAPTURE_CONFIG, c6562k);
            return this;
        }

        @Override // z.InterfaceC6577e0.a
        public g setDefaultResolution(Size size) {
            getMutableConfig().insertOption(InterfaceC6577e0.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        @Override // z.N0.a
        public g setDefaultSessionConfig(z.C0 c02) {
            getMutableConfig().insertOption(z.N0.OPTION_DEFAULT_SESSION_CONFIG, c02);
            return this;
        }

        @Override // C.g.a
        public g setIoExecutor(Executor executor) {
            getMutableConfig().insertOption(C.g.OPTION_IO_EXECUTOR, executor);
            return this;
        }

        @Override // z.InterfaceC6577e0.a
        public g setMaxResolution(Size size) {
            getMutableConfig().insertOption(InterfaceC6577e0.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        @Override // z.N0.a
        public g setSessionOptionUnpacker(C0.d dVar) {
            getMutableConfig().insertOption(z.N0.OPTION_SESSION_CONFIG_UNPACKER, dVar);
            return this;
        }

        @Override // z.InterfaceC6577e0.a
        public g setSupportedResolutions(List<Pair<Integer, Size[]>> list) {
            getMutableConfig().insertOption(InterfaceC6577e0.OPTION_SUPPORTED_RESOLUTIONS, list);
            return this;
        }

        @Override // z.N0.a
        public g setSurfaceOccupancyPriority(int i8) {
            getMutableConfig().insertOption(z.N0.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i8));
            return this;
        }

        @Override // z.InterfaceC6577e0.a
        public g setTargetAspectRatio(int i8) {
            getMutableConfig().insertOption(InterfaceC6577e0.OPTION_TARGET_ASPECT_RATIO, Integer.valueOf(i8));
            return this;
        }

        @Override // z.N0.a, C.h.a
        public g setTargetClass(Class<C0889l0> cls) {
            getMutableConfig().insertOption(C.h.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(C.h.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + g5.e.STATE_NAME_NONE + UUID.randomUUID());
            }
            return this;
        }

        @Override // z.N0.a, C.h.a
        public g setTargetName(String str) {
            getMutableConfig().insertOption(C.h.OPTION_TARGET_NAME, str);
            return this;
        }

        @Override // z.InterfaceC6577e0.a
        public g setTargetResolution(Size size) {
            getMutableConfig().insertOption(InterfaceC6577e0.OPTION_TARGET_RESOLUTION, size);
            return this;
        }

        @Override // z.InterfaceC6577e0.a
        public g setTargetRotation(int i8) {
            getMutableConfig().insertOption(InterfaceC6577e0.OPTION_TARGET_ROTATION, Integer.valueOf(i8));
            return this;
        }

        @Override // z.N0.a, C.j.a
        public g setUseCaseEventCallback(h1.b bVar) {
            getMutableConfig().insertOption(C.j.OPTION_USE_CASE_EVENT_CALLBACK, bVar);
            return this;
        }
    }

    /* renamed from: androidx.camera.core.l0$h */
    public static final class h implements InterfaceC6566O {

        /* renamed from: a, reason: collision with root package name */
        private static final C6571b0 f7763a = new g().setSurfaceOccupancyPriority(4).setTargetAspectRatio(0).getUseCaseConfig();

        @Override // z.InterfaceC6566O
        public C6571b0 getConfig() {
            return f7763a;
        }
    }

    /* renamed from: androidx.camera.core.l0$i */
    static class i {

        /* renamed from: a, reason: collision with root package name */
        final int f7764a;

        /* renamed from: b, reason: collision with root package name */
        final int f7765b;

        /* renamed from: c, reason: collision with root package name */
        private final Rational f7766c;

        /* renamed from: d, reason: collision with root package name */
        private final Executor f7767d;

        /* renamed from: e, reason: collision with root package name */
        private final k f7768e;

        /* renamed from: f, reason: collision with root package name */
        AtomicBoolean f7769f = new AtomicBoolean(false);

        /* renamed from: g, reason: collision with root package name */
        private final Rect f7770g;

        /* renamed from: h, reason: collision with root package name */
        private final Matrix f7771h;

        i(int i8, int i9, Rational rational, Rect rect, Matrix matrix, Executor executor, k kVar) {
            this.f7764a = i8;
            this.f7765b = i9;
            if (rational != null) {
                Z.h.checkArgument(!rational.isZero(), "Target ratio cannot be zero");
                Z.h.checkArgument(rational.floatValue() > 0.0f, "Target ratio must be positive");
            }
            this.f7766c = rational;
            this.f7770g = rect;
            this.f7771h = matrix;
            this.f7767d = executor;
            this.f7768e = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(InterfaceC0902s0 interfaceC0902s0) {
            this.f7768e.onCaptureSuccess(interfaceC0902s0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(int i8, String str, Throwable th) {
            this.f7768e.onError(new C0895o0(i8, str, th));
        }

        void c(InterfaceC0902s0 interfaceC0902s0) {
            Size size;
            int rotation;
            if (!this.f7769f.compareAndSet(false, true)) {
                interfaceC0902s0.close();
                return;
            }
            if (new F.a().shouldUseExifOrientation(interfaceC0902s0)) {
                try {
                    ByteBuffer buffer = interfaceC0902s0.getPlanes()[0].getBuffer();
                    buffer.rewind();
                    byte[] bArr = new byte[buffer.capacity()];
                    buffer.get(bArr);
                    androidx.camera.core.impl.utils.f fVarCreateFromInputStream = androidx.camera.core.impl.utils.f.createFromInputStream(new ByteArrayInputStream(bArr));
                    buffer.rewind();
                    size = new Size(fVarCreateFromInputStream.getWidth(), fVarCreateFromInputStream.getHeight());
                    rotation = fVarCreateFromInputStream.getRotation();
                } catch (IOException e8) {
                    f(1, "Unable to parse JPEG exif", e8);
                    interfaceC0902s0.close();
                    return;
                }
            } else {
                size = new Size(interfaceC0902s0.getWidth(), interfaceC0902s0.getHeight());
                rotation = this.f7764a;
            }
            final V0 v02 = new V0(interfaceC0902s0, size, AbstractC0916z0.create(interfaceC0902s0.getImageInfo().getTagBundle(), interfaceC0902s0.getImageInfo().getTimestamp(), rotation, this.f7771h));
            v02.setCropRect(C0889l0.F(this.f7770g, this.f7766c, this.f7764a, size, rotation));
            try {
                this.f7767d.execute(new Runnable() { // from class: androidx.camera.core.n0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7791a.d(v02);
                    }
                });
            } catch (RejectedExecutionException unused) {
                B0.e("ImageCapture", "Unable to post to the supplied executor.");
                interfaceC0902s0.close();
            }
        }

        void f(final int i8, final String str, final Throwable th) {
            if (this.f7769f.compareAndSet(false, true)) {
                try {
                    this.f7767d.execute(new Runnable() { // from class: androidx.camera.core.m0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f7786a.e(i8, str, th);
                        }
                    });
                } catch (RejectedExecutionException unused) {
                    B0.e("ImageCapture", "Unable to post to the supplied executor.");
                }
            }
        }
    }

    /* renamed from: androidx.camera.core.l0$j */
    static class j implements L.a {

        /* renamed from: e, reason: collision with root package name */
        private final b f7776e;

        /* renamed from: f, reason: collision with root package name */
        private final int f7777f;

        /* renamed from: g, reason: collision with root package name */
        private final c f7778g;

        /* renamed from: a, reason: collision with root package name */
        private final Deque f7772a = new ArrayDeque();

        /* renamed from: b, reason: collision with root package name */
        i f7773b = null;

        /* renamed from: c, reason: collision with root package name */
        com.google.common.util.concurrent.C f7774c = null;

        /* renamed from: d, reason: collision with root package name */
        int f7775d = 0;

        /* renamed from: h, reason: collision with root package name */
        final Object f7779h = new Object();

        /* renamed from: androidx.camera.core.l0$j$a */
        class a implements B.c {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f7780a;

            a(i iVar) {
                this.f7780a = iVar;
            }

            @Override // B.c
            public void onFailure(Throwable th) {
                synchronized (j.this.f7779h) {
                    try {
                        if (!(th instanceof CancellationException)) {
                            this.f7780a.f(C0889l0.J(th), th != null ? th.getMessage() : "Unknown error", th);
                        }
                        j jVar = j.this;
                        jVar.f7773b = null;
                        jVar.f7774c = null;
                        jVar.a();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // B.c
            public void onSuccess(InterfaceC0902s0 interfaceC0902s0) {
                synchronized (j.this.f7779h) {
                    Z.h.checkNotNull(interfaceC0902s0);
                    X0 x02 = new X0(interfaceC0902s0);
                    x02.a(j.this);
                    j.this.f7775d++;
                    this.f7780a.c(x02);
                    j jVar = j.this;
                    jVar.f7773b = null;
                    jVar.f7774c = null;
                    jVar.a();
                }
            }
        }

        /* renamed from: androidx.camera.core.l0$j$b */
        interface b {
            com.google.common.util.concurrent.C capture(i iVar);
        }

        /* renamed from: androidx.camera.core.l0$j$c */
        interface c {
            void onPreProcessRequest(i iVar);
        }

        j(int i8, b bVar, c cVar) {
            this.f7777f = i8;
            this.f7776e = bVar;
            this.f7778g = cVar;
        }

        void a() {
            synchronized (this.f7779h) {
                try {
                    if (this.f7773b != null) {
                        return;
                    }
                    if (this.f7775d >= this.f7777f) {
                        B0.w("ImageCapture", "Too many acquire images. Close image to be able to process next.");
                        return;
                    }
                    i iVar = (i) this.f7772a.poll();
                    if (iVar == null) {
                        return;
                    }
                    this.f7773b = iVar;
                    c cVar = this.f7778g;
                    if (cVar != null) {
                        cVar.onPreProcessRequest(iVar);
                    }
                    com.google.common.util.concurrent.C cCapture = this.f7776e.capture(iVar);
                    this.f7774c = cCapture;
                    B.f.addCallback(cCapture, new a(iVar), A.a.directExecutor());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void cancelRequests(Throwable th) {
            i iVar;
            com.google.common.util.concurrent.C c9;
            ArrayList arrayList;
            synchronized (this.f7779h) {
                iVar = this.f7773b;
                this.f7773b = null;
                c9 = this.f7774c;
                this.f7774c = null;
                arrayList = new ArrayList(this.f7772a);
                this.f7772a.clear();
            }
            if (iVar != null && c9 != null) {
                iVar.f(C0889l0.J(th), th.getMessage(), th);
                c9.cancel(true);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((i) it.next()).f(C0889l0.J(th), th.getMessage(), th);
            }
        }

        @Override // androidx.camera.core.L.a
        public void onImageClose(InterfaceC0902s0 interfaceC0902s0) {
            synchronized (this.f7779h) {
                this.f7775d--;
                a();
            }
        }

        public void sendRequest(i iVar) {
            synchronized (this.f7779h) {
                this.f7772a.offer(iVar);
                B0.d("ImageCapture", String.format(Locale.US, "Send image capture request [current, pending] = [%d, %d]", Integer.valueOf(this.f7773b != null ? 1 : 0), Integer.valueOf(this.f7772a.size())));
                a();
            }
        }
    }

    /* renamed from: androidx.camera.core.l0$k */
    public static abstract class k {
        public void onCaptureSuccess(InterfaceC0902s0 interfaceC0902s0) {
        }

        public void onError(C0895o0 c0895o0) {
        }
    }

    /* renamed from: androidx.camera.core.l0$l */
    public interface l {
    }

    /* renamed from: androidx.camera.core.l0$m */
    public static final class m {
    }

    /* renamed from: androidx.camera.core.l0$n */
    public static class n {

        /* renamed from: a, reason: collision with root package name */
        private Uri f7782a;

        n(Uri uri) {
            this.f7782a = uri;
        }

        public Uri getSavedUri() {
            return this.f7782a;
        }
    }

    C0889l0(C6571b0 c6571b0) {
        super(c6571b0);
        this.f7735l = new InterfaceC6581g0.a() { // from class: androidx.camera.core.d0
            @Override // z.InterfaceC6581g0.a
            public final void onImageAvailable(InterfaceC6581g0 interfaceC6581g0) {
                C0889l0.Q(interfaceC6581g0);
            }
        };
        this.f7738o = new AtomicReference(null);
        this.f7740q = -1;
        this.f7741r = null;
        this.f7747x = false;
        this.f7734F = new Matrix();
        C6571b0 c6571b02 = (C6571b0) getCurrentConfig();
        if (c6571b02.containsOption(C6571b0.OPTION_IMAGE_CAPTURE_MODE)) {
            this.f7737n = c6571b02.getCaptureMode();
        } else {
            this.f7737n = 1;
        }
        this.f7739p = c6571b02.getFlashType(0);
        Executor executor = (Executor) Z.h.checkNotNull(c6571b02.getIoExecutor(A.a.ioExecutor()));
        this.f7736m = executor;
        this.f7733E = A.a.newSequentialExecutor(executor);
    }

    private void D() {
        if (this.f7732D != null) {
            this.f7732D.cancelRequests(new C0890m("Camera is closed."));
        }
    }

    static Rect F(Rect rect, Rational rational, int i8, Size size, int i9) {
        if (rect != null) {
            return G.a.computeCropRectFromDispatchInfo(rect, i8, size, i9);
        }
        if (rational != null) {
            if (i9 % 180 != 0) {
                rational = new Rational(rational.getDenominator(), rational.getNumerator());
            }
            if (G.a.isAspectRatioValid(size, rational)) {
                return G.a.computeCropRectFromAspectRatio(size, rational);
            }
        }
        return new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    static boolean H(z.q0 q0Var) {
        boolean z8;
        InterfaceC6565N.a aVar = C6571b0.OPTION_USE_SOFTWARE_JPEG_ENCODER;
        Boolean bool = Boolean.FALSE;
        boolean z9 = false;
        if (((Boolean) q0Var.retrieveOption(aVar, bool)).booleanValue()) {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 < 26) {
                B0.w("ImageCapture", "Software JPEG only supported on API 26+, but current API level is " + i8);
                z8 = false;
            } else {
                z8 = true;
            }
            Integer num = (Integer) q0Var.retrieveOption(C6571b0.OPTION_BUFFER_FORMAT, null);
            if (num == null || num.intValue() == 256) {
                z9 = z8;
            } else {
                B0.w("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z9) {
                B0.w("ImageCapture", "Unable to support software JPEG. Disabling.");
                q0Var.insertOption(aVar, bool);
            }
        }
        return z9;
    }

    private InterfaceC6561J I(InterfaceC6561J interfaceC6561J) {
        List<InterfaceC6564M> captureStages = this.f7744u.getCaptureStages();
        return (captureStages == null || captureStages.isEmpty()) ? interfaceC6561J : D.a(captureStages);
    }

    static int J(Throwable th) {
        if (th instanceof C0890m) {
            return 3;
        }
        if (th instanceof C0895o0) {
            return ((C0895o0) th).getImageCaptureError();
        }
        return 0;
    }

    private int K() {
        C6571b0 c6571b0 = (C6571b0) getCurrentConfig();
        if (c6571b0.containsOption(C6571b0.OPTION_JPEG_COMPRESSION_QUALITY)) {
            return c6571b0.getJpegQuality();
        }
        int i8 = this.f7737n;
        if (i8 == 0) {
            return 100;
        }
        if (i8 == 1) {
            return 95;
        }
        throw new IllegalStateException("CaptureMode " + this.f7737n + " is invalid");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void M(C.l lVar, G g8) {
        if (Build.VERSION.SDK_INT >= 26) {
            lVar.close();
            g8.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(String str, C6571b0 c6571b0, Size size, z.C0 c02, C0.e eVar) {
        E();
        if (g(str)) {
            C0.b bVarG = G(str, c6571b0, size);
            this.f7748y = bVarG;
            q(bVarG.build());
            j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void P(List list) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Q(InterfaceC6581g0 interfaceC6581g0) {
        try {
            InterfaceC0902s0 interfaceC0902s0AcquireLatestImage = interfaceC6581g0.acquireLatestImage();
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("Discarding ImageProxy which was inadvertently acquired: ");
                sb.append(interfaceC0902s0AcquireLatestImage);
                if (interfaceC0902s0AcquireLatestImage != null) {
                    interfaceC0902s0AcquireLatestImage.close();
                }
            } finally {
            }
        } catch (IllegalStateException e8) {
            Log.e("ImageCapture", "Failed to acquire latest image.", e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(k kVar) {
        kVar.onError(new C0895o0(4, "Not bound to a valid Camera [" + this + "]", null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void S(k kVar) {
        kVar.onError(new C0895o0(0, "Request is canceled", null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object V(i iVar, final c.a aVar) {
        this.f7749z.setOnImageAvailableListener(new InterfaceC6581g0.a() { // from class: androidx.camera.core.Z
            @Override // z.InterfaceC6581g0.a
            public final void onImageAvailable(InterfaceC6581g0 interfaceC6581g0) {
                C0889l0.W(aVar, interfaceC6581g0);
            }
        }, A.a.mainThreadExecutor());
        Y();
        final com.google.common.util.concurrent.C cL = L(iVar);
        B.f.addCallback(cL, new d(aVar), this.f7742s);
        aVar.addCancellationListener(new Runnable() { // from class: androidx.camera.core.a0
            @Override // java.lang.Runnable
            public final void run() {
                cL.cancel(true);
            }
        }, A.a.directExecutor());
        return "takePictureInternal";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void W(c.a aVar, InterfaceC6581g0 interfaceC6581g0) {
        try {
            InterfaceC0902s0 interfaceC0902s0AcquireLatestImage = interfaceC6581g0.acquireLatestImage();
            if (interfaceC0902s0AcquireLatestImage == null) {
                aVar.setException(new IllegalStateException("Unable to acquire image"));
            } else if (!aVar.set(interfaceC0902s0AcquireLatestImage)) {
                interfaceC0902s0AcquireLatestImage.close();
            }
        } catch (IllegalStateException e8) {
            aVar.setException(e8);
        }
    }

    private void Y() {
        synchronized (this.f7738o) {
            try {
                if (this.f7738o.get() != null) {
                    return;
                }
                this.f7738o.set(Integer.valueOf(getFlashMode()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void Z(Executor executor, final k kVar, int i8) {
        InterfaceC6553B camera = getCamera();
        if (camera == null) {
            executor.execute(new Runnable() { // from class: androidx.camera.core.j0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7721a.R(kVar);
                }
            });
            return;
        }
        j jVar = this.f7732D;
        if (jVar == null) {
            executor.execute(new Runnable() { // from class: androidx.camera.core.k0
                @Override // java.lang.Runnable
                public final void run() {
                    C0889l0.S(kVar);
                }
            });
        } else {
            jVar.sendRequest(new i(d(camera), i8, this.f7741r, getViewPortCropRect(), this.f7734F, executor, kVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public com.google.common.util.concurrent.C N(final i iVar) {
        return androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: androidx.camera.core.i0
            @Override // androidx.concurrent.futures.c.InterfaceC0123c
            public final Object attachCompleter(c.a aVar) {
                return this.f7657a.V(iVar, aVar);
            }
        });
    }

    private void b0() {
        synchronized (this.f7738o) {
            try {
                if (this.f7738o.get() != null) {
                    return;
                }
                b().setFlashMode(getFlashMode());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void E() {
        androidx.camera.core.impl.utils.m.checkMainThread();
        j jVar = this.f7732D;
        if (jVar != null) {
            jVar.cancelRequests(new CancellationException("Request is canceled."));
            this.f7732D = null;
        }
        z.S s8 = this.f7731C;
        this.f7731C = null;
        this.f7749z = null;
        this.f7729A = null;
        if (s8 != null) {
            s8.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    C0.b G(final String str, final C6571b0 c6571b0, final Size size) {
        InterfaceC6563L interfaceC6563L;
        final C.l lVar;
        final G g8;
        InterfaceC6563L g9;
        InterfaceC6563L interfaceC6563L2;
        androidx.camera.core.impl.utils.m.checkMainThread();
        C0.b bVarCreateFrom = C0.b.createFrom(c6571b0);
        c6571b0.getImageReaderProxyProvider();
        InterfaceC6563L interfaceC6563L3 = this.f7746w;
        if (interfaceC6563L3 != null || this.f7747x) {
            int imageFormat = getImageFormat();
            int imageFormat2 = getImageFormat();
            if (!this.f7747x) {
                interfaceC6563L = interfaceC6563L3;
                lVar = null;
                g8 = 0;
            } else {
                if (Build.VERSION.SDK_INT < 26) {
                    throw new IllegalStateException("Software JPEG only supported on API 26+");
                }
                B0.i("ImageCapture", "Using software JPEG encoder.");
                if (this.f7746w != null) {
                    lVar = new C.l(K(), this.f7745v);
                    g9 = new G(this.f7746w, this.f7745v, lVar, this.f7742s);
                    interfaceC6563L2 = g9;
                } else {
                    lVar = new C.l(K(), this.f7745v);
                    g9 = lVar;
                    interfaceC6563L2 = null;
                }
                interfaceC6563L = g9;
                g8 = interfaceC6563L2;
                imageFormat2 = 256;
            }
            M0 m0A = new M0.d(size.getWidth(), size.getHeight(), imageFormat, this.f7745v, I(D.c()), interfaceC6563L).c(this.f7742s).b(imageFormat2).a();
            this.f7729A = m0A;
            this.f7730B = m0A.b();
            this.f7749z = new U0(this.f7729A);
            if (lVar != null) {
                this.f7729A.c().addListener(new Runnable() { // from class: androidx.camera.core.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0889l0.M(lVar, g8);
                    }
                }, A.a.directExecutor());
            }
        } else {
            E0 e02 = new E0(size.getWidth(), size.getHeight(), getImageFormat(), 2);
            this.f7730B = e02.f();
            this.f7749z = new U0(e02);
            lVar = null;
        }
        j jVar = this.f7732D;
        if (jVar != null) {
            jVar.cancelRequests(new CancellationException("Request is canceled."));
        }
        this.f7732D = new j(2, new j.b() { // from class: androidx.camera.core.f0
            @Override // androidx.camera.core.C0889l0.j.b
            public final com.google.common.util.concurrent.C capture(C0889l0.i iVar) {
                return this.f7605a.N(iVar);
            }
        }, lVar != null ? new a(lVar) : null);
        this.f7749z.setOnImageAvailableListener(this.f7735l, A.a.mainThreadExecutor());
        final U0 u02 = this.f7749z;
        z.S s8 = this.f7731C;
        if (s8 != null) {
            s8.close();
        }
        C6583h0 c6583h0 = new C6583h0(this.f7749z.getSurface(), new Size(this.f7749z.getWidth(), this.f7749z.getHeight()), this.f7749z.getImageFormat());
        this.f7731C = c6583h0;
        com.google.common.util.concurrent.C terminationFuture = c6583h0.getTerminationFuture();
        Objects.requireNonNull(u02);
        terminationFuture.addListener(new Runnable() { // from class: androidx.camera.core.g0
            @Override // java.lang.Runnable
            public final void run() {
                u02.e();
            }
        }, A.a.mainThreadExecutor());
        bVarCreateFrom.addNonRepeatingSurface(this.f7731C);
        bVarCreateFrom.addErrorListener(new C0.c() { // from class: androidx.camera.core.h0
            @Override // z.C0.c
            public final void onError(z.C0 c02, C0.e eVar) {
                this.f7637a.O(str, c6571b0, size, c02, eVar);
            }
        });
        return bVarCreateFrom;
    }

    com.google.common.util.concurrent.C L(i iVar) {
        InterfaceC6561J interfaceC6561JI;
        String tagBundleKey;
        B0.d("ImageCapture", "issueTakePicture");
        ArrayList arrayList = new ArrayList();
        if (this.f7729A != null) {
            interfaceC6561JI = I(D.c());
            if (interfaceC6561JI == null) {
                return B.f.immediateFailedFuture(new IllegalArgumentException("ImageCapture cannot set empty CaptureBundle."));
            }
            if (this.f7746w == null && interfaceC6561JI.getCaptureStages().size() > 1) {
                return B.f.immediateFailedFuture(new IllegalArgumentException("No CaptureProcessor can be found to process the images captured for multiple CaptureStages."));
            }
            if (interfaceC6561JI.getCaptureStages().size() > this.f7745v) {
                return B.f.immediateFailedFuture(new IllegalArgumentException("ImageCapture has CaptureStages > Max CaptureStage size"));
            }
            this.f7729A.setCaptureBundle(interfaceC6561JI);
            tagBundleKey = this.f7729A.getTagBundleKey();
        } else {
            interfaceC6561JI = I(D.c());
            if (interfaceC6561JI.getCaptureStages().size() > 1) {
                return B.f.immediateFailedFuture(new IllegalArgumentException("ImageCapture have no CaptureProcess set with CaptureBundle size > 1."));
            }
            tagBundleKey = null;
        }
        for (InterfaceC6564M interfaceC6564M : interfaceC6561JI.getCaptureStages()) {
            C6562K.a aVar = new C6562K.a();
            aVar.setTemplateType(this.f7743t.getTemplateType());
            aVar.addImplementationOptions(this.f7743t.getImplementationOptions());
            aVar.addAllCameraCaptureCallbacks(this.f7748y.getSingleCameraCaptureCallbacks());
            aVar.addSurface(this.f7731C);
            if (new F.a().isRotationOptionSupported()) {
                aVar.addImplementationOption(C6562K.OPTION_ROTATION, Integer.valueOf(iVar.f7764a));
            }
            aVar.addImplementationOption(C6562K.OPTION_JPEG_QUALITY, Integer.valueOf(iVar.f7765b));
            aVar.addImplementationOptions(interfaceC6564M.getCaptureConfig().getImplementationOptions());
            if (tagBundleKey != null) {
                aVar.addTag(tagBundleKey, Integer.valueOf(interfaceC6564M.getId()));
            }
            aVar.addCameraCaptureCallback(this.f7730B);
            arrayList.add(aVar.build());
        }
        return B.f.transform(b().submitStillCaptureRequests(arrayList, this.f7737n, this.f7739p), new InterfaceC6046a() { // from class: androidx.camera.core.b0
            @Override // p.InterfaceC6046a
            public final Object apply(Object obj) {
                return C0889l0.P((List) obj);
            }
        }, A.a.directExecutor());
    }

    void c0() {
        synchronized (this.f7738o) {
            try {
                Integer num = (Integer) this.f7738o.getAndSet(null);
                if (num == null) {
                    return;
                }
                if (num.intValue() != getFlashMode()) {
                    b0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.h1
    protected R0 e() {
        InterfaceC6553B camera = getCamera();
        Size attachedSurfaceResolution = getAttachedSurfaceResolution();
        if (camera == null || attachedSurfaceResolution == null) {
            return null;
        }
        Rect viewPortCropRect = getViewPortCropRect();
        Rational rational = this.f7741r;
        if (viewPortCropRect == null) {
            viewPortCropRect = rational != null ? G.a.computeCropRectFromAspectRatio(attachedSurfaceResolution, rational) : new Rect(0, 0, attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight());
        }
        return R0.a(attachedSurfaceResolution, viewPortCropRect, d(camera));
    }

    public int getCaptureMode() {
        return this.f7737n;
    }

    @Override // androidx.camera.core.h1
    public z.N0 getDefaultConfig(boolean z8, z.O0 o02) {
        InterfaceC6565N config = o02.getConfig(O0.b.IMAGE_CAPTURE);
        if (z8) {
            config = InterfaceC6565N.mergeConfigs(config, DEFAULT_CONFIG.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    public int getFlashMode() {
        int flashMode;
        synchronized (this.f7738o) {
            flashMode = this.f7740q;
            if (flashMode == -1) {
                flashMode = ((C6571b0) getCurrentConfig()).getFlashMode(2);
            }
        }
        return flashMode;
    }

    public int getJpegQuality() {
        return K();
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
        return g.fromConfig(interfaceC6565N);
    }

    @Override // androidx.camera.core.h1
    protected void l() {
        b0();
    }

    @Override // androidx.camera.core.h1
    protected z.N0 m(InterfaceC6552A interfaceC6552A, N0.a aVar) {
        z.N0 useCaseConfig = aVar.getUseCaseConfig();
        InterfaceC6565N.a aVar2 = C6571b0.OPTION_CAPTURE_PROCESSOR;
        if (useCaseConfig.retrieveOption(aVar2, null) != null && Build.VERSION.SDK_INT >= 29) {
            B0.i("ImageCapture", "Requesting software JPEG due to a CaptureProcessor is set.");
            aVar.getMutableConfig().insertOption(C6571b0.OPTION_USE_SOFTWARE_JPEG_ENCODER, Boolean.TRUE);
        } else if (interfaceC6552A.getCameraQuirks().contains(E.e.class)) {
            z.q0 mutableConfig = aVar.getMutableConfig();
            InterfaceC6565N.a aVar3 = C6571b0.OPTION_USE_SOFTWARE_JPEG_ENCODER;
            Boolean bool = Boolean.TRUE;
            if (((Boolean) mutableConfig.retrieveOption(aVar3, bool)).booleanValue()) {
                B0.i("ImageCapture", "Requesting software JPEG due to device quirk.");
                aVar.getMutableConfig().insertOption(aVar3, bool);
            } else {
                B0.w("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            }
        }
        boolean zH = H(aVar.getMutableConfig());
        Integer num = (Integer) aVar.getMutableConfig().retrieveOption(C6571b0.OPTION_BUFFER_FORMAT, null);
        if (num != null) {
            Z.h.checkArgument(aVar.getMutableConfig().retrieveOption(aVar2, null) == null, "Cannot set buffer format with CaptureProcessor defined.");
            aVar.getMutableConfig().insertOption(InterfaceC6575d0.OPTION_INPUT_FORMAT, Integer.valueOf(zH ? 35 : num.intValue()));
        } else if (aVar.getMutableConfig().retrieveOption(aVar2, null) != null || zH) {
            aVar.getMutableConfig().insertOption(InterfaceC6575d0.OPTION_INPUT_FORMAT, 35);
        } else {
            aVar.getMutableConfig().insertOption(InterfaceC6575d0.OPTION_INPUT_FORMAT, 256);
        }
        Z.h.checkArgument(((Integer) aVar.getMutableConfig().retrieveOption(C6571b0.OPTION_MAX_CAPTURE_STAGES, 2)).intValue() >= 1, "Maximum outstanding image count must be at least 1");
        return aVar.getUseCaseConfig();
    }

    @Override // androidx.camera.core.h1
    protected Size n(Size size) {
        C0.b bVarG = G(c(), (C6571b0) getCurrentConfig(), size);
        this.f7748y = bVarG;
        q(bVarG.build());
        h();
        return size;
    }

    @Override // androidx.camera.core.h1
    public void onAttached() {
        C6571b0 c6571b0 = (C6571b0) getCurrentConfig();
        this.f7743t = C6562K.a.createFrom(c6571b0).build();
        this.f7746w = c6571b0.getCaptureProcessor(null);
        this.f7745v = c6571b0.getMaxCaptureStages(2);
        this.f7744u = c6571b0.getCaptureBundle(D.c());
        this.f7747x = c6571b0.isSoftwareJpegEncoderRequested();
        Z.h.checkNotNull(getCamera(), "Attached camera cannot be null");
        this.f7742s = Executors.newFixedThreadPool(1, new e());
    }

    @Override // androidx.camera.core.h1
    public void onDetached() {
        D();
        E();
        this.f7747x = false;
        this.f7742s.shutdown();
    }

    @Override // androidx.camera.core.h1
    public void onStateDetached() {
        D();
    }

    public void setCropAspectRatio(Rational rational) {
        this.f7741r = rational;
    }

    public void setFlashMode(int i8) {
        if (i8 != 0 && i8 != 1 && i8 != 2) {
            throw new IllegalArgumentException("Invalid flash mode: " + i8);
        }
        synchronized (this.f7738o) {
            this.f7740q = i8;
            b0();
        }
    }

    @Override // androidx.camera.core.h1
    public void setSensorToBufferTransformMatrix(Matrix matrix) {
        this.f7734F = matrix;
    }

    public void setTargetRotation(int i8) {
        int targetRotation = getTargetRotation();
        if (!p(i8) || this.f7741r == null) {
            return;
        }
        this.f7741r = G.a.getRotatedAspectRatio(Math.abs(androidx.camera.core.impl.utils.c.surfaceRotationToDegrees(i8) - androidx.camera.core.impl.utils.c.surfaceRotationToDegrees(targetRotation)), this.f7741r);
    }

    /* renamed from: takePicture, reason: merged with bridge method [inline-methods] */
    public void T(final Executor executor, final k kVar) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            A.a.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.Y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7571a.T(executor, kVar);
                }
            });
        } else {
            Z(executor, kVar, K());
        }
    }

    public String toString() {
        return "ImageCapture:" + getName();
    }

    /* renamed from: takePicture, reason: merged with bridge method [inline-methods] */
    public void U(final m mVar, final Executor executor, final l lVar) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            A.a.mainThreadExecutor().execute(new Runnable(mVar, executor, lVar) { // from class: androidx.camera.core.c0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Executor f7594b;

                {
                    this.f7594b = executor;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f7593a.U(null, this.f7594b, null);
                }
            });
            return;
        }
        b bVar = new b(lVar);
        int iK = K();
        c cVar = new c(mVar, iK, executor, bVar, lVar);
        int iD = d(getCamera());
        Size attachedSurfaceResolution = getAttachedSurfaceResolution();
        Rect rectF = F(getViewPortCropRect(), this.f7741r, iD, attachedSurfaceResolution, iD);
        if (G.a.shouldCropImage(attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight(), rectF.width(), rectF.height())) {
            iK = this.f7737n == 0 ? 100 : 95;
        }
        Z(A.a.mainThreadExecutor(), cVar, iK);
    }
}
