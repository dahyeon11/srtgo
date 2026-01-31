package z;

import android.util.Size;
import androidx.camera.core.C0903t;
import androidx.camera.core.InterfaceC0904t0;
import androidx.camera.core.P;
import androidx.camera.core.h1;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import z.C0;
import z.C6562K;
import z.InterfaceC6565N;

/* renamed from: z.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6569a0 implements N0, InterfaceC6577e0, C.i {

    /* renamed from: a, reason: collision with root package name */
    private final v0 f37798a;
    public static final InterfaceC6565N.a OPTION_BACKPRESSURE_STRATEGY = InterfaceC6565N.a.create("camerax.core.imageAnalysis.backpressureStrategy", P.b.class);
    public static final InterfaceC6565N.a OPTION_IMAGE_QUEUE_DEPTH = InterfaceC6565N.a.create("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE);
    public static final InterfaceC6565N.a OPTION_IMAGE_READER_PROXY_PROVIDER = InterfaceC6565N.a.create("camerax.core.imageAnalysis.imageReaderProxyProvider", InterfaceC0904t0.class);
    public static final InterfaceC6565N.a OPTION_OUTPUT_IMAGE_FORMAT = InterfaceC6565N.a.create("camerax.core.imageAnalysis.outputImageFormat", P.e.class);
    public static final InterfaceC6565N.a OPTION_ONE_PIXEL_SHIFT_ENABLED = InterfaceC6565N.a.create("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class);
    public static final InterfaceC6565N.a OPTION_OUTPUT_IMAGE_ROTATION_ENABLED = InterfaceC6565N.a.create("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class);

    public C6569a0(v0 v0Var) {
        this.f37798a = v0Var;
    }

    @Override // z.N0, C.h, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ boolean containsOption(InterfaceC6565N.a aVar) {
        return super.containsOption(aVar);
    }

    @Override // z.N0, C.h, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ void findOptions(String str, InterfaceC6565N.b bVar) {
        super.findOptions(str, bVar);
    }

    @Override // C.i
    public /* bridge */ /* synthetic */ Executor getBackgroundExecutor() {
        return super.getBackgroundExecutor();
    }

    public int getBackpressureStrategy(int i8) {
        return ((Integer) retrieveOption(OPTION_BACKPRESSURE_STRATEGY, Integer.valueOf(i8))).intValue();
    }

    @Override // z.N0
    public /* bridge */ /* synthetic */ C0903t getCameraSelector() {
        return super.getCameraSelector();
    }

    @Override // z.N0
    public /* bridge */ /* synthetic */ C6562K.b getCaptureOptionUnpacker() {
        return super.getCaptureOptionUnpacker();
    }

    @Override // z.N0, C.h, z.A0
    public InterfaceC6565N getConfig() {
        return this.f37798a;
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

    public int getImageQueueDepth(int i8) {
        return ((Integer) retrieveOption(OPTION_IMAGE_QUEUE_DEPTH, Integer.valueOf(i8))).intValue();
    }

    public InterfaceC0904t0 getImageReaderProxyProvider() {
        android.support.v4.media.session.f.a(retrieveOption(OPTION_IMAGE_READER_PROXY_PROVIDER, null));
        return null;
    }

    @Override // z.N0, z.InterfaceC6575d0
    public int getInputFormat() {
        return 35;
    }

    @Override // z.InterfaceC6577e0
    public /* bridge */ /* synthetic */ Size getMaxResolution() {
        return super.getMaxResolution();
    }

    public Boolean getOnePixelShiftEnabled(Boolean bool) {
        return (Boolean) retrieveOption(OPTION_ONE_PIXEL_SHIFT_ENABLED, bool);
    }

    @Override // z.N0, C.h, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ InterfaceC6565N.c getOptionPriority(InterfaceC6565N.a aVar) {
        return super.getOptionPriority(aVar);
    }

    public int getOutputImageFormat(int i8) {
        return ((Integer) retrieveOption(OPTION_OUTPUT_IMAGE_FORMAT, Integer.valueOf(i8))).intValue();
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

    @Override // z.InterfaceC6577e0
    public /* bridge */ /* synthetic */ boolean hasTargetAspectRatio() {
        return super.hasTargetAspectRatio();
    }

    public Boolean isOutputImageRotationEnabled(Boolean bool) {
        return (Boolean) retrieveOption(OPTION_OUTPUT_IMAGE_ROTATION_ENABLED, bool);
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

    @Override // C.i
    public /* bridge */ /* synthetic */ Executor getBackgroundExecutor(Executor executor) {
        return super.getBackgroundExecutor(executor);
    }

    public int getBackpressureStrategy() {
        return ((Integer) retrieveOption(OPTION_BACKPRESSURE_STRATEGY)).intValue();
    }

    @Override // z.N0
    public /* bridge */ /* synthetic */ C0903t getCameraSelector(C0903t c0903t) {
        return super.getCameraSelector(c0903t);
    }

    @Override // z.N0
    public /* bridge */ /* synthetic */ C6562K.b getCaptureOptionUnpacker(C6562K.b bVar) {
        return super.getCaptureOptionUnpacker(bVar);
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

    public int getImageQueueDepth() {
        return ((Integer) retrieveOption(OPTION_IMAGE_QUEUE_DEPTH)).intValue();
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
