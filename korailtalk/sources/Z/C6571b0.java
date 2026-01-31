package z;

import android.util.Size;
import androidx.camera.core.C0903t;
import androidx.camera.core.InterfaceC0904t0;
import androidx.camera.core.h1;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import z.C0;
import z.C6562K;
import z.InterfaceC6565N;

/* renamed from: z.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6571b0 implements N0, InterfaceC6577e0, C.g {
    public static final InterfaceC6565N.a OPTION_BUFFER_FORMAT;
    public static final InterfaceC6565N.a OPTION_CAPTURE_BUNDLE;
    public static final InterfaceC6565N.a OPTION_CAPTURE_PROCESSOR;
    public static final InterfaceC6565N.a OPTION_FLASH_MODE;
    public static final InterfaceC6565N.a OPTION_FLASH_TYPE;
    public static final InterfaceC6565N.a OPTION_IMAGE_CAPTURE_MODE;
    public static final InterfaceC6565N.a OPTION_IMAGE_READER_PROXY_PROVIDER;
    public static final InterfaceC6565N.a OPTION_JPEG_COMPRESSION_QUALITY;
    public static final InterfaceC6565N.a OPTION_MAX_CAPTURE_STAGES;
    public static final InterfaceC6565N.a OPTION_USE_SOFTWARE_JPEG_ENCODER;

    /* renamed from: a, reason: collision with root package name */
    private final v0 f37801a;

    static {
        Class cls = Integer.TYPE;
        OPTION_IMAGE_CAPTURE_MODE = InterfaceC6565N.a.create("camerax.core.imageCapture.captureMode", cls);
        OPTION_FLASH_MODE = InterfaceC6565N.a.create("camerax.core.imageCapture.flashMode", cls);
        OPTION_CAPTURE_BUNDLE = InterfaceC6565N.a.create("camerax.core.imageCapture.captureBundle", InterfaceC6561J.class);
        OPTION_CAPTURE_PROCESSOR = InterfaceC6565N.a.create("camerax.core.imageCapture.captureProcessor", InterfaceC6563L.class);
        OPTION_BUFFER_FORMAT = InterfaceC6565N.a.create("camerax.core.imageCapture.bufferFormat", Integer.class);
        OPTION_MAX_CAPTURE_STAGES = InterfaceC6565N.a.create("camerax.core.imageCapture.maxCaptureStages", Integer.class);
        OPTION_IMAGE_READER_PROXY_PROVIDER = InterfaceC6565N.a.create("camerax.core.imageCapture.imageReaderProxyProvider", InterfaceC0904t0.class);
        OPTION_USE_SOFTWARE_JPEG_ENCODER = InterfaceC6565N.a.create("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE);
        OPTION_FLASH_TYPE = InterfaceC6565N.a.create("camerax.core.imageCapture.flashType", cls);
        OPTION_JPEG_COMPRESSION_QUALITY = InterfaceC6565N.a.create("camerax.core.imageCapture.jpegCompressionQuality", cls);
    }

    public C6571b0(v0 v0Var) {
        this.f37801a = v0Var;
    }

    @Override // z.N0, C.h, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ boolean containsOption(InterfaceC6565N.a aVar) {
        return super.containsOption(aVar);
    }

    @Override // z.N0, C.h, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ void findOptions(String str, InterfaceC6565N.b bVar) {
        super.findOptions(str, bVar);
    }

    public Integer getBufferFormat(Integer num) {
        return (Integer) retrieveOption(OPTION_BUFFER_FORMAT, num);
    }

    @Override // z.N0
    public /* bridge */ /* synthetic */ C0903t getCameraSelector() {
        return super.getCameraSelector();
    }

    public InterfaceC6561J getCaptureBundle(InterfaceC6561J interfaceC6561J) {
        return (InterfaceC6561J) retrieveOption(OPTION_CAPTURE_BUNDLE, interfaceC6561J);
    }

    public int getCaptureMode() {
        return ((Integer) retrieveOption(OPTION_IMAGE_CAPTURE_MODE)).intValue();
    }

    @Override // z.N0
    public /* bridge */ /* synthetic */ C6562K.b getCaptureOptionUnpacker() {
        return super.getCaptureOptionUnpacker();
    }

    public InterfaceC6563L getCaptureProcessor(InterfaceC6563L interfaceC6563L) {
        return (InterfaceC6563L) retrieveOption(OPTION_CAPTURE_PROCESSOR, interfaceC6563L);
    }

    @Override // z.N0, C.h, z.A0
    public InterfaceC6565N getConfig() {
        return this.f37801a;
    }

    @Override // z.N0
    public /* bridge */ /* synthetic */ C6562K getDefaultCaptureConfig() {
        return super.getDefaultCaptureConfig();
    }

    @Override // z.InterfaceC6577e0
    public /* bridge */ /* synthetic */ Size getDefaultResolution() {
        return super.getDefaultResolution();
    }

    @Override // z.N0
    public /* bridge */ /* synthetic */ C0 getDefaultSessionConfig() {
        return super.getDefaultSessionConfig();
    }

    public int getFlashMode(int i8) {
        return ((Integer) retrieveOption(OPTION_FLASH_MODE, Integer.valueOf(i8))).intValue();
    }

    public int getFlashType(int i8) {
        return ((Integer) retrieveOption(OPTION_FLASH_TYPE, Integer.valueOf(i8))).intValue();
    }

    public InterfaceC0904t0 getImageReaderProxyProvider() {
        android.support.v4.media.session.f.a(retrieveOption(OPTION_IMAGE_READER_PROXY_PROVIDER, null));
        return null;
    }

    @Override // z.N0, z.InterfaceC6575d0
    public int getInputFormat() {
        return ((Integer) retrieveOption(InterfaceC6575d0.OPTION_INPUT_FORMAT)).intValue();
    }

    @Override // C.g
    public Executor getIoExecutor(Executor executor) {
        return (Executor) retrieveOption(C.g.OPTION_IO_EXECUTOR, executor);
    }

    public int getJpegQuality(int i8) {
        return ((Integer) retrieveOption(OPTION_JPEG_COMPRESSION_QUALITY, Integer.valueOf(i8))).intValue();
    }

    public int getMaxCaptureStages(int i8) {
        return ((Integer) retrieveOption(OPTION_MAX_CAPTURE_STAGES, Integer.valueOf(i8))).intValue();
    }

    @Override // z.InterfaceC6577e0
    public /* bridge */ /* synthetic */ Size getMaxResolution() {
        return super.getMaxResolution();
    }

    @Override // z.N0, C.h, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ InterfaceC6565N.c getOptionPriority(InterfaceC6565N.a aVar) {
        return super.getOptionPriority(aVar);
    }

    @Override // z.N0, C.h, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ Set getPriorities(InterfaceC6565N.a aVar) {
        return super.getPriorities(aVar);
    }

    @Override // z.N0
    public /* bridge */ /* synthetic */ C0.d getSessionOptionUnpacker() {
        return super.getSessionOptionUnpacker();
    }

    @Override // z.InterfaceC6577e0
    public /* bridge */ /* synthetic */ List getSupportedResolutions() {
        return super.getSupportedResolutions();
    }

    @Override // z.N0
    public /* bridge */ /* synthetic */ int getSurfaceOccupancyPriority() {
        return super.getSurfaceOccupancyPriority();
    }

    @Override // z.InterfaceC6577e0
    public /* bridge */ /* synthetic */ int getTargetAspectRatio() {
        return super.getTargetAspectRatio();
    }

    @Override // z.N0, C.h
    public /* bridge */ /* synthetic */ Class getTargetClass() {
        return super.getTargetClass();
    }

    @Override // z.N0, C.h
    public /* bridge */ /* synthetic */ String getTargetName() {
        return super.getTargetName();
    }

    @Override // z.InterfaceC6577e0
    public /* bridge */ /* synthetic */ Size getTargetResolution() {
        return super.getTargetResolution();
    }

    @Override // z.InterfaceC6577e0
    public /* bridge */ /* synthetic */ int getTargetRotation() {
        return super.getTargetRotation();
    }

    @Override // z.N0, C.j
    public /* bridge */ /* synthetic */ h1.b getUseCaseEventCallback() {
        return super.getUseCaseEventCallback();
    }

    public boolean hasCaptureMode() {
        return containsOption(OPTION_IMAGE_CAPTURE_MODE);
    }

    @Override // z.InterfaceC6577e0
    public /* bridge */ /* synthetic */ boolean hasTargetAspectRatio() {
        return super.hasTargetAspectRatio();
    }

    public boolean isSoftwareJpegEncoderRequested() {
        return ((Boolean) retrieveOption(OPTION_USE_SOFTWARE_JPEG_ENCODER, Boolean.FALSE)).booleanValue();
    }

    @Override // z.N0, C.h, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ Set listOptions() {
        return super.listOptions();
    }

    @Override // z.N0, C.h, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ Object retrieveOption(InterfaceC6565N.a aVar) {
        return super.retrieveOption(aVar);
    }

    @Override // z.N0, C.h, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ Object retrieveOptionWithPriority(InterfaceC6565N.a aVar, InterfaceC6565N.c cVar) {
        return super.retrieveOptionWithPriority(aVar, cVar);
    }

    public Integer getBufferFormat() {
        return (Integer) retrieveOption(OPTION_BUFFER_FORMAT);
    }

    @Override // z.N0
    public /* bridge */ /* synthetic */ C0903t getCameraSelector(C0903t c0903t) {
        return super.getCameraSelector(c0903t);
    }

    public InterfaceC6561J getCaptureBundle() {
        return (InterfaceC6561J) retrieveOption(OPTION_CAPTURE_BUNDLE);
    }

    @Override // z.N0
    public /* bridge */ /* synthetic */ C6562K.b getCaptureOptionUnpacker(C6562K.b bVar) {
        return super.getCaptureOptionUnpacker(bVar);
    }

    public InterfaceC6563L getCaptureProcessor() {
        return (InterfaceC6563L) retrieveOption(OPTION_CAPTURE_PROCESSOR);
    }

    @Override // z.N0
    public /* bridge */ /* synthetic */ C6562K getDefaultCaptureConfig(C6562K c6562k) {
        return super.getDefaultCaptureConfig(c6562k);
    }

    @Override // z.InterfaceC6577e0
    public /* bridge */ /* synthetic */ Size getDefaultResolution(Size size) {
        return super.getDefaultResolution(size);
    }

    @Override // z.N0
    public /* bridge */ /* synthetic */ C0 getDefaultSessionConfig(C0 c02) {
        return super.getDefaultSessionConfig(c02);
    }

    public int getFlashMode() {
        return ((Integer) retrieveOption(OPTION_FLASH_MODE)).intValue();
    }

    public int getFlashType() {
        return ((Integer) retrieveOption(OPTION_FLASH_TYPE)).intValue();
    }

    @Override // C.g
    public Executor getIoExecutor() {
        return (Executor) retrieveOption(C.g.OPTION_IO_EXECUTOR);
    }

    public int getJpegQuality() {
        return ((Integer) retrieveOption(OPTION_JPEG_COMPRESSION_QUALITY)).intValue();
    }

    public int getMaxCaptureStages() {
        return ((Integer) retrieveOption(OPTION_MAX_CAPTURE_STAGES)).intValue();
    }

    @Override // z.InterfaceC6577e0
    public /* bridge */ /* synthetic */ Size getMaxResolution(Size size) {
        return super.getMaxResolution(size);
    }

    @Override // z.N0
    public /* bridge */ /* synthetic */ C0.d getSessionOptionUnpacker(C0.d dVar) {
        return super.getSessionOptionUnpacker(dVar);
    }

    @Override // z.InterfaceC6577e0
    public /* bridge */ /* synthetic */ List getSupportedResolutions(List list) {
        return super.getSupportedResolutions(list);
    }

    @Override // z.N0
    public /* bridge */ /* synthetic */ int getSurfaceOccupancyPriority(int i8) {
        return super.getSurfaceOccupancyPriority(i8);
    }

    @Override // z.N0, C.h
    public /* bridge */ /* synthetic */ Class getTargetClass(Class cls) {
        return super.getTargetClass(cls);
    }

    @Override // z.N0, C.h
    public /* bridge */ /* synthetic */ String getTargetName(String str) {
        return super.getTargetName(str);
    }

    @Override // z.InterfaceC6577e0
    public /* bridge */ /* synthetic */ Size getTargetResolution(Size size) {
        return super.getTargetResolution(size);
    }

    @Override // z.InterfaceC6577e0
    public /* bridge */ /* synthetic */ int getTargetRotation(int i8) {
        return super.getTargetRotation(i8);
    }

    @Override // z.N0, C.j
    public /* bridge */ /* synthetic */ h1.b getUseCaseEventCallback(h1.b bVar) {
        return super.getUseCaseEventCallback(bVar);
    }

    @Override // z.N0, C.h, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ Object retrieveOption(InterfaceC6565N.a aVar, Object obj) {
        return super.retrieveOption(aVar, obj);
    }
}
