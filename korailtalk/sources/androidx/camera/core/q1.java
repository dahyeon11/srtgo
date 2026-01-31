package androidx.camera.core;

import C.i;
import android.media.AudioRecord;
import android.media.CamcorderProfile;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.h1;
import androidx.camera.core.q1;
import androidx.concurrent.futures.c;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import z.C0;
import z.C6562K;
import z.C6583h0;
import z.InterfaceC6553B;
import z.InterfaceC6565N;
import z.InterfaceC6566O;
import z.InterfaceC6577e0;
import z.N0;
import z.O0;

/* loaded from: classes.dex */
public final class q1 extends h1 {
    public static final int ERROR_ENCODER = 1;
    public static final int ERROR_FILE_IO = 4;
    public static final int ERROR_INVALID_CAMERA = 5;
    public static final int ERROR_MUXER = 2;
    public static final int ERROR_RECORDING_IN_PROGRESS = 3;
    public static final int ERROR_RECORDING_TOO_SHORT = 6;
    public static final int ERROR_UNKNOWN = 0;

    /* renamed from: A, reason: collision with root package name */
    private final AtomicBoolean f7805A;

    /* renamed from: B, reason: collision with root package name */
    private int f7806B;

    /* renamed from: C, reason: collision with root package name */
    private int f7807C;

    /* renamed from: D, reason: collision with root package name */
    Surface f7808D;

    /* renamed from: E, reason: collision with root package name */
    private volatile AudioRecord f7809E;

    /* renamed from: F, reason: collision with root package name */
    private volatile int f7810F;

    /* renamed from: G, reason: collision with root package name */
    private volatile boolean f7811G;

    /* renamed from: H, reason: collision with root package name */
    private int f7812H;

    /* renamed from: I, reason: collision with root package name */
    private int f7813I;

    /* renamed from: J, reason: collision with root package name */
    private int f7814J;

    /* renamed from: K, reason: collision with root package name */
    private z.S f7815K;

    /* renamed from: L, reason: collision with root package name */
    private final AtomicBoolean f7816L;

    /* renamed from: M, reason: collision with root package name */
    private h f7817M;

    /* renamed from: N, reason: collision with root package name */
    private Throwable f7818N;

    /* renamed from: l, reason: collision with root package name */
    private final MediaCodec.BufferInfo f7819l;

    /* renamed from: m, reason: collision with root package name */
    private final Object f7820m;
    public final AtomicBoolean mIsFirstAudioSampleWrite;
    public final AtomicBoolean mIsFirstVideoKeyFrameWrite;

    /* renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f7821n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f7822o;

    /* renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f7823p;

    /* renamed from: q, reason: collision with root package name */
    private final MediaCodec.BufferInfo f7824q;

    /* renamed from: r, reason: collision with root package name */
    private HandlerThread f7825r;

    /* renamed from: s, reason: collision with root package name */
    private Handler f7826s;

    /* renamed from: t, reason: collision with root package name */
    private HandlerThread f7827t;

    /* renamed from: u, reason: collision with root package name */
    private Handler f7828u;

    /* renamed from: v, reason: collision with root package name */
    MediaCodec f7829v;

    /* renamed from: w, reason: collision with root package name */
    private MediaCodec f7830w;

    /* renamed from: x, reason: collision with root package name */
    private com.google.common.util.concurrent.C f7831x;

    /* renamed from: y, reason: collision with root package name */
    private C0.b f7832y;

    /* renamed from: z, reason: collision with root package name */
    private MediaMuxer f7833z;
    public static final d DEFAULT_CONFIG = new d();

    /* renamed from: O, reason: collision with root package name */
    private static final int[] f7804O = {8, 6, 5, 4};

    class a implements C0.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7834a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Size f7835b;

        a(String str, Size size) {
            this.f7834a = str;
            this.f7835b = size;
        }

        @Override // z.C0.c
        public void onError(z.C0 c02, C0.e eVar) {
            if (q1.this.g(this.f7834a)) {
                q1.this.L(this.f7834a, this.f7835b);
                q1.this.j();
            }
        }
    }

    private static class b {
        static int a(MediaCodec.CodecException codecException) {
            return codecException.getErrorCode();
        }
    }

    public static final class c implements N0.a, InterfaceC6577e0.a, i.a {

        /* renamed from: a, reason: collision with root package name */
        private final z.r0 f7837a;

        public c() {
            this(z.r0.create());
        }

        static c a(InterfaceC6565N interfaceC6565N) {
            return new c(z.r0.from(interfaceC6565N));
        }

        public static c fromConfig(z.P0 p02) {
            return new c(z.r0.from((InterfaceC6565N) p02));
        }

        @Override // z.N0.a, androidx.camera.core.I
        public z.q0 getMutableConfig() {
            return this.f7837a;
        }

        public c setAudioBitRate(int i8) {
            getMutableConfig().insertOption(z.P0.OPTION_AUDIO_BIT_RATE, Integer.valueOf(i8));
            return this;
        }

        public c setAudioChannelCount(int i8) {
            getMutableConfig().insertOption(z.P0.OPTION_AUDIO_CHANNEL_COUNT, Integer.valueOf(i8));
            return this;
        }

        public c setAudioMinBufferSize(int i8) {
            getMutableConfig().insertOption(z.P0.OPTION_AUDIO_MIN_BUFFER_SIZE, Integer.valueOf(i8));
            return this;
        }

        public c setAudioSampleRate(int i8) {
            getMutableConfig().insertOption(z.P0.OPTION_AUDIO_SAMPLE_RATE, Integer.valueOf(i8));
            return this;
        }

        public c setBitRate(int i8) {
            getMutableConfig().insertOption(z.P0.OPTION_BIT_RATE, Integer.valueOf(i8));
            return this;
        }

        public c setIFrameInterval(int i8) {
            getMutableConfig().insertOption(z.P0.OPTION_INTRA_FRAME_INTERVAL, Integer.valueOf(i8));
            return this;
        }

        @Override // z.InterfaceC6577e0.a
        public /* bridge */ /* synthetic */ Object setSupportedResolutions(List list) {
            return setSupportedResolutions((List<Pair<Integer, Size[]>>) list);
        }

        @Override // z.N0.a, C.h.a
        public /* bridge */ /* synthetic */ Object setTargetClass(Class cls) {
            return setTargetClass((Class<q1>) cls);
        }

        public c setVideoFrameRate(int i8) {
            getMutableConfig().insertOption(z.P0.OPTION_VIDEO_FRAME_RATE, Integer.valueOf(i8));
            return this;
        }

        private c(z.r0 r0Var) {
            this.f7837a = r0Var;
            Class cls = (Class) r0Var.retrieveOption(C.h.OPTION_TARGET_CLASS, null);
            if (cls == null || cls.equals(q1.class)) {
                setTargetClass(q1.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        @Override // z.N0.a, androidx.camera.core.I
        public q1 build() {
            if (getMutableConfig().retrieveOption(InterfaceC6577e0.OPTION_TARGET_ASPECT_RATIO, null) == null || getMutableConfig().retrieveOption(InterfaceC6577e0.OPTION_TARGET_RESOLUTION, null) == null) {
                return new q1(getUseCaseConfig());
            }
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }

        @Override // z.N0.a
        public z.P0 getUseCaseConfig() {
            return new z.P0(z.v0.from(this.f7837a));
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
        public c setTargetClass(Class<q1> cls) {
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

        /* renamed from: a, reason: collision with root package name */
        private static final Size f7838a;

        /* renamed from: b, reason: collision with root package name */
        private static final z.P0 f7839b;

        static {
            Size size = new Size(1920, 1080);
            f7838a = size;
            f7839b = new c().setVideoFrameRate(30).setBitRate(8388608).setIFrameInterval(1).setAudioBitRate(64000).setAudioSampleRate(8000).setAudioChannelCount(1).setAudioMinBufferSize(1024).setMaxResolution(size).setSurfaceOccupancyPriority(3).setTargetAspectRatio(1).getUseCaseConfig();
        }

        @Override // z.InterfaceC6566O
        public z.P0 getConfig() {
            return f7839b;
        }
    }

    public interface e {
        void onError(int i8, String str, Throwable th);

        void onVideoSaved(g gVar);
    }

    public static final class f {
    }

    public static class g {
    }

    enum h {
        VIDEO_ENCODER_INIT_STATUS_UNINITIALIZED,
        VIDEO_ENCODER_INIT_STATUS_INITIALIZED_FAILED,
        VIDEO_ENCODER_INIT_STATUS_INSUFFICIENT_RESOURCE,
        VIDEO_ENCODER_INIT_STATUS_RESOURCE_RECLAIMED
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class i implements e {

        /* renamed from: a, reason: collision with root package name */
        Executor f7841a;

        /* renamed from: b, reason: collision with root package name */
        e f7842b;

        i(Executor executor, e eVar) {
            this.f7841a = executor;
            this.f7842b = eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(int i8, String str, Throwable th) {
            this.f7842b.onError(i8, str, th);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(g gVar) {
            this.f7842b.onVideoSaved(gVar);
        }

        @Override // androidx.camera.core.q1.e
        public void onError(final int i8, final String str, final Throwable th) {
            try {
                this.f7841a.execute(new Runnable() { // from class: androidx.camera.core.r1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7845a.c(i8, str, th);
                    }
                });
            } catch (RejectedExecutionException unused) {
                B0.e("VideoCapture", "Unable to post to the supplied executor.");
            }
        }

        @Override // androidx.camera.core.q1.e
        public void onVideoSaved(final g gVar) {
            try {
                this.f7841a.execute(new Runnable(gVar) { // from class: androidx.camera.core.s1

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ q1.g f7850b;

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7849a.d(this.f7850b);
                    }
                });
            } catch (RejectedExecutionException unused) {
                B0.e("VideoCapture", "Unable to post to the supplied executor.");
            }
        }
    }

    q1(z.P0 p02) {
        super(p02);
        this.f7819l = new MediaCodec.BufferInfo();
        this.f7820m = new Object();
        this.f7821n = new AtomicBoolean(true);
        this.f7822o = new AtomicBoolean(true);
        this.f7823p = new AtomicBoolean(true);
        this.f7824q = new MediaCodec.BufferInfo();
        this.mIsFirstVideoKeyFrameWrite = new AtomicBoolean(false);
        this.mIsFirstAudioSampleWrite = new AtomicBoolean(false);
        this.f7831x = null;
        this.f7832y = new C0.b();
        this.f7805A = new AtomicBoolean(false);
        this.f7811G = false;
        this.f7816L = new AtomicBoolean(true);
        this.f7817M = h.VIDEO_ENCODER_INIT_STATUS_UNINITIALIZED;
    }

    private MediaMuxer A(f fVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C(boolean z8, MediaCodec mediaCodec) {
        if (!z8 || mediaCodec == null) {
            return;
        }
        mediaCodec.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object E(AtomicReference atomicReference, c.a aVar) {
        atomicReference.set(aVar);
        return "startRecording";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        this.f7831x = null;
        if (getCamera() != null) {
            L(c(), getAttachedSurfaceResolution());
            j();
        }
    }

    private void H() {
        this.f7827t.quitSafely();
        MediaCodec mediaCodec = this.f7830w;
        if (mediaCodec != null) {
            mediaCodec.release();
            this.f7830w = null;
        }
        if (this.f7809E != null) {
            this.f7809E.release();
            this.f7809E = null;
        }
    }

    private void I(final boolean z8) {
        z.S s8 = this.f7815K;
        if (s8 == null) {
            return;
        }
        final MediaCodec mediaCodec = this.f7829v;
        s8.close();
        this.f7815K.getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.core.o1
            @Override // java.lang.Runnable
            public final void run() {
                q1.C(z8, mediaCodec);
            }
        }, A.a.mainThreadExecutor());
        if (z8) {
            this.f7829v = null;
        }
        this.f7808D = null;
        this.f7815K = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void B() {
        this.f7825r.quitSafely();
        H();
        if (this.f7808D != null) {
            I(true);
        }
    }

    private void K(Size size, String str) {
        try {
            for (int i8 : f7804O) {
                if (CamcorderProfile.hasProfile(Integer.parseInt(str), i8)) {
                    CamcorderProfile camcorderProfile = CamcorderProfile.get(Integer.parseInt(str), i8);
                    if (size.getWidth() == camcorderProfile.videoFrameWidth && size.getHeight() == camcorderProfile.videoFrameHeight) {
                        this.f7812H = camcorderProfile.audioChannels;
                        this.f7813I = camcorderProfile.audioSampleRate;
                        this.f7814J = camcorderProfile.audioBitRate;
                        return;
                    }
                }
            }
        } catch (NumberFormatException unused) {
            B0.i("VideoCapture", "The camera Id is not an integer because the camera may be a removable device. Use the default values for the audio related settings.");
        }
        z.P0 p02 = (z.P0) getCurrentConfig();
        this.f7812H = p02.getAudioChannelCount();
        this.f7813I = p02.getAudioSampleRate();
        this.f7814J = p02.getAudioBitRate();
    }

    private AudioRecord x(z.P0 p02) {
        int i8 = this.f7812H == 1 ? 16 : 12;
        try {
            int minBufferSize = AudioRecord.getMinBufferSize(this.f7813I, i8, 2);
            if (minBufferSize <= 0) {
                minBufferSize = p02.getAudioMinBufferSize();
            }
            int i9 = minBufferSize;
            AudioRecord audioRecord = new AudioRecord(5, this.f7813I, i8, 2, i9 * 2);
            if (audioRecord.getState() != 1) {
                return null;
            }
            this.f7810F = i9;
            B0.i("VideoCapture", "source: 5 audioSampleRate: " + this.f7813I + " channelConfig: " + i8 + " audioFormat: 2 bufferSize: " + i9);
            return audioRecord;
        } catch (Exception e8) {
            B0.e("VideoCapture", "Exception, keep trying.", e8);
            return null;
        }
    }

    private MediaFormat y() {
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", this.f7813I, this.f7812H);
        mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
        mediaFormatCreateAudioFormat.setInteger("bitrate", this.f7814J);
        return mediaFormatCreateAudioFormat;
    }

    private static MediaFormat z(z.P0 p02, Size size) {
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", size.getWidth(), size.getHeight());
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", p02.getBitRate());
        mediaFormatCreateVideoFormat.setInteger("frame-rate", p02.getVideoFrameRate());
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", p02.getIFrameInterval());
        return mediaFormatCreateVideoFormat;
    }

    void L(String str, Size size) {
        z.P0 p02 = (z.P0) getCurrentConfig();
        this.f7829v.reset();
        this.f7817M = h.VIDEO_ENCODER_INIT_STATUS_UNINITIALIZED;
        try {
            this.f7829v.configure(z(p02, size), (Surface) null, (MediaCrypto) null, 1);
            if (this.f7808D != null) {
                I(false);
            }
            final Surface surfaceCreateInputSurface = this.f7829v.createInputSurface();
            this.f7808D = surfaceCreateInputSurface;
            this.f7832y = C0.b.createFrom(p02);
            z.S s8 = this.f7815K;
            if (s8 != null) {
                s8.close();
            }
            C6583h0 c6583h0 = new C6583h0(this.f7808D, size, getImageFormat());
            this.f7815K = c6583h0;
            com.google.common.util.concurrent.C terminationFuture = c6583h0.getTerminationFuture();
            Objects.requireNonNull(surfaceCreateInputSurface);
            terminationFuture.addListener(new Runnable() { // from class: androidx.camera.core.p1
                @Override // java.lang.Runnable
                public final void run() {
                    surfaceCreateInputSurface.release();
                }
            }, A.a.mainThreadExecutor());
            this.f7832y.addNonRepeatingSurface(this.f7815K);
            this.f7832y.addErrorListener(new a(str, size));
            q(this.f7832y.build());
            this.f7816L.set(true);
            K(size, str);
            this.f7830w.reset();
            this.f7830w.configure(y(), (Surface) null, (MediaCrypto) null, 1);
            if (this.f7809E != null) {
                this.f7809E.release();
            }
            this.f7809E = x(p02);
            if (this.f7809E == null) {
                B0.e("VideoCapture", "AudioRecord object cannot initialized correctly!");
                this.f7816L.set(false);
            }
            synchronized (this.f7820m) {
                this.f7806B = -1;
                this.f7807C = -1;
            }
            this.f7811G = false;
        } catch (MediaCodec.CodecException e8) {
            int iA = b.a(e8);
            String diagnosticInfo = e8.getDiagnosticInfo();
            if (iA == 1100) {
                B0.i("VideoCapture", "CodecException: code: " + iA + " diagnostic: " + diagnosticInfo);
                this.f7817M = h.VIDEO_ENCODER_INIT_STATUS_INSUFFICIENT_RESOURCE;
            } else if (iA == 1101) {
                B0.i("VideoCapture", "CodecException: code: " + iA + " diagnostic: " + diagnosticInfo);
                this.f7817M = h.VIDEO_ENCODER_INIT_STATUS_RESOURCE_RECLAIMED;
            }
            this.f7818N = e8;
        } catch (IllegalArgumentException e9) {
            e = e9;
            this.f7817M = h.VIDEO_ENCODER_INIT_STATUS_INITIALIZED_FAILED;
            this.f7818N = e;
        } catch (IllegalStateException e10) {
            e = e10;
            this.f7817M = h.VIDEO_ENCODER_INIT_STATUS_INITIALIZED_FAILED;
            this.f7818N = e;
        }
    }

    @Override // androidx.camera.core.h1
    public z.N0 getDefaultConfig(boolean z8, z.O0 o02) {
        InterfaceC6565N config = o02.getConfig(O0.b.VIDEO_CAPTURE);
        if (z8) {
            config = InterfaceC6565N.mergeConfigs(config, DEFAULT_CONFIG.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    @Override // androidx.camera.core.h1
    public N0.a getUseCaseConfigBuilder(InterfaceC6565N interfaceC6565N) {
        return c.a(interfaceC6565N);
    }

    @Override // androidx.camera.core.h1
    protected Size n(Size size) {
        if (this.f7808D != null) {
            this.f7829v.stop();
            this.f7829v.release();
            this.f7830w.stop();
            this.f7830w.release();
            I(false);
        }
        try {
            this.f7829v = MediaCodec.createEncoderByType("video/avc");
            this.f7830w = MediaCodec.createEncoderByType("audio/mp4a-latm");
            L(c(), size);
            h();
            return size;
        } catch (IOException e8) {
            throw new IllegalStateException("Unable to create MediaCodec due to: " + e8.getCause());
        }
    }

    @Override // androidx.camera.core.h1
    public void onAttached() {
        this.f7825r = new HandlerThread("CameraX-video encoding thread");
        this.f7827t = new HandlerThread("CameraX-audio encoding thread");
        this.f7825r.start();
        this.f7826s = new Handler(this.f7825r.getLooper());
        this.f7827t.start();
        this.f7828u = new Handler(this.f7827t.getLooper());
    }

    @Override // androidx.camera.core.h1
    public void onDetached() {
        G();
        com.google.common.util.concurrent.C c9 = this.f7831x;
        if (c9 != null) {
            c9.addListener(new Runnable() { // from class: androidx.camera.core.k1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7728a.B();
                }
            }, A.a.mainThreadExecutor());
        } else {
            B();
        }
    }

    @Override // androidx.camera.core.h1
    public void onStateDetached() {
        G();
    }

    public void setTargetRotation(int i8) {
        p(i8);
    }

    /* renamed from: startRecording, reason: merged with bridge method [inline-methods] */
    public void D(final f fVar, final Executor executor, final e eVar) throws IllegalStateException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            A.a.mainThreadExecutor().execute(new Runnable(fVar, executor, eVar) { // from class: androidx.camera.core.l1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Executor f7784b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ q1.e f7785c;

                {
                    this.f7784b = executor;
                    this.f7785c = eVar;
                }

                @Override // java.lang.Runnable
                public final void run() throws IllegalStateException {
                    this.f7783a.D(null, this.f7784b, this.f7785c);
                }
            });
            return;
        }
        B0.i("VideoCapture", "startRecording");
        this.mIsFirstVideoKeyFrameWrite.set(false);
        this.mIsFirstAudioSampleWrite.set(false);
        i iVar = new i(executor, eVar);
        InterfaceC6553B camera = getCamera();
        if (camera == null) {
            iVar.onError(5, "Not bound to a Camera [" + this + "]", null);
            return;
        }
        h hVar = this.f7817M;
        if (hVar == h.VIDEO_ENCODER_INIT_STATUS_INSUFFICIENT_RESOURCE || hVar == h.VIDEO_ENCODER_INIT_STATUS_INITIALIZED_FAILED || hVar == h.VIDEO_ENCODER_INIT_STATUS_RESOURCE_RECLAIMED) {
            iVar.onError(1, "Video encoder initialization failed before start recording ", this.f7818N);
            return;
        }
        if (!this.f7823p.get()) {
            iVar.onError(3, "It is still in video recording!", null);
            return;
        }
        if (this.f7816L.get()) {
            try {
                if (this.f7809E.getState() == 1) {
                    this.f7809E.startRecording();
                }
            } catch (IllegalStateException e8) {
                B0.i("VideoCapture", "AudioRecorder cannot start recording, disable audio." + e8.getMessage());
                this.f7816L.set(false);
                H();
            }
            if (this.f7809E.getRecordingState() != 3) {
                B0.i("VideoCapture", "AudioRecorder startRecording failed - incorrect state: " + this.f7809E.getRecordingState());
                this.f7816L.set(false);
                H();
            }
        }
        final AtomicReference atomicReference = new AtomicReference();
        this.f7831x = androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: androidx.camera.core.m1
            @Override // androidx.concurrent.futures.c.InterfaceC0123c
            public final Object attachCompleter(c.a aVar) {
                return q1.E(atomicReference, aVar);
            }
        });
        c.a aVar = (c.a) Z.h.checkNotNull((c.a) atomicReference.get());
        this.f7831x.addListener(new Runnable() { // from class: androidx.camera.core.n1
            @Override // java.lang.Runnable
            public final void run() {
                this.f7793a.F();
            }
        }, A.a.mainThreadExecutor());
        try {
            B0.i("VideoCapture", "videoEncoder start");
            this.f7829v.start();
            if (this.f7816L.get()) {
                B0.i("VideoCapture", "audioEncoder start");
                this.f7830w.start();
            }
            try {
                synchronized (this.f7820m) {
                    MediaMuxer mediaMuxerA = A(fVar);
                    this.f7833z = mediaMuxerA;
                    Z.h.checkNotNull(mediaMuxerA);
                    this.f7833z.setOrientationHint(d(camera));
                    throw null;
                }
            } catch (IOException e9) {
                aVar.set(null);
                iVar.onError(2, "MediaMuxer creation failed!", e9);
            }
        } catch (IllegalStateException e10) {
            aVar.set(null);
            iVar.onError(1, "Audio/Video encoder start fail", e10);
        }
    }

    /* renamed from: stopRecording, reason: merged with bridge method [inline-methods] */
    public void G() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            A.a.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.j1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7723a.G();
                }
            });
            return;
        }
        B0.i("VideoCapture", "stopRecording");
        this.f7832y.clearSurfaces();
        this.f7832y.addNonRepeatingSurface(this.f7815K);
        q(this.f7832y.build());
        k();
        if (this.f7811G) {
            if (this.f7816L.get()) {
                this.f7822o.set(true);
            } else {
                this.f7821n.set(true);
            }
        }
    }
}
