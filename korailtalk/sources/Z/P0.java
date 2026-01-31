package z;

import android.util.Size;
import androidx.camera.core.C0903t;
import androidx.camera.core.h1;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import z.C0;
import z.C6562K;
import z.InterfaceC6565N;

/* loaded from: classes.dex */
public final class P0 implements N0, InterfaceC6577e0, C.i {
    public static final InterfaceC6565N.a OPTION_AUDIO_BIT_RATE;
    public static final InterfaceC6565N.a OPTION_AUDIO_CHANNEL_COUNT;
    public static final InterfaceC6565N.a OPTION_AUDIO_MIN_BUFFER_SIZE;
    public static final InterfaceC6565N.a OPTION_AUDIO_SAMPLE_RATE;
    public static final InterfaceC6565N.a OPTION_BIT_RATE;
    public static final InterfaceC6565N.a OPTION_INTRA_FRAME_INTERVAL;
    public static final InterfaceC6565N.a OPTION_VIDEO_FRAME_RATE;

    /* renamed from: a, reason: collision with root package name */
    private final v0 f37753a;

    static {
        Class cls = Integer.TYPE;
        OPTION_VIDEO_FRAME_RATE = InterfaceC6565N.a.create("camerax.core.videoCapture.recordingFrameRate", cls);
        OPTION_BIT_RATE = InterfaceC6565N.a.create("camerax.core.videoCapture.bitRate", cls);
        OPTION_INTRA_FRAME_INTERVAL = InterfaceC6565N.a.create("camerax.core.videoCapture.intraFrameInterval", cls);
        OPTION_AUDIO_BIT_RATE = InterfaceC6565N.a.create("camerax.core.videoCapture.audioBitRate", cls);
        OPTION_AUDIO_SAMPLE_RATE = InterfaceC6565N.a.create("camerax.core.videoCapture.audioSampleRate", cls);
        OPTION_AUDIO_CHANNEL_COUNT = InterfaceC6565N.a.create("camerax.core.videoCapture.audioChannelCount", cls);
        OPTION_AUDIO_MIN_BUFFER_SIZE = InterfaceC6565N.a.create("camerax.core.videoCapture.audioMinBufferSize", cls);
    }

    public P0(v0 v0Var) {
        this.f37753a = v0Var;
    }

    @Override // z.N0, C.h, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ boolean containsOption(InterfaceC6565N.a aVar) {
        return super.containsOption(aVar);
    }

    @Override // z.N0, C.h, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ void findOptions(String str, InterfaceC6565N.b bVar) {
        super.findOptions(str, bVar);
    }

    public int getAudioBitRate(int i8) {
        return ((Integer) retrieveOption(OPTION_AUDIO_BIT_RATE, Integer.valueOf(i8))).intValue();
    }

    public int getAudioChannelCount(int i8) {
        return ((Integer) retrieveOption(OPTION_AUDIO_CHANNEL_COUNT, Integer.valueOf(i8))).intValue();
    }

    public int getAudioMinBufferSize(int i8) {
        return ((Integer) retrieveOption(OPTION_AUDIO_MIN_BUFFER_SIZE, Integer.valueOf(i8))).intValue();
    }

    public int getAudioSampleRate(int i8) {
        return ((Integer) retrieveOption(OPTION_AUDIO_SAMPLE_RATE, Integer.valueOf(i8))).intValue();
    }

    @Override // C.i
    public /* bridge */ /* synthetic */ Executor getBackgroundExecutor() {
        return super.getBackgroundExecutor();
    }

    public int getBitRate(int i8) {
        return ((Integer) retrieveOption(OPTION_BIT_RATE, Integer.valueOf(i8))).intValue();
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
        return this.f37753a;
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

    public int getIFrameInterval(int i8) {
        return ((Integer) retrieveOption(OPTION_INTRA_FRAME_INTERVAL, Integer.valueOf(i8))).intValue();
    }

    @Override // z.N0, z.InterfaceC6575d0
    public int getInputFormat() {
        return 34;
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

    public int getVideoFrameRate(int i8) {
        return ((Integer) retrieveOption(OPTION_VIDEO_FRAME_RATE, Integer.valueOf(i8))).intValue();
    }

    @Override // z.InterfaceC6577e0
    public /* bridge */ /* synthetic */ boolean hasTargetAspectRatio() {
        return super.hasTargetAspectRatio();
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

    public int getAudioBitRate() {
        return ((Integer) retrieveOption(OPTION_AUDIO_BIT_RATE)).intValue();
    }

    public int getAudioChannelCount() {
        return ((Integer) retrieveOption(OPTION_AUDIO_CHANNEL_COUNT)).intValue();
    }

    public int getAudioMinBufferSize() {
        return ((Integer) retrieveOption(OPTION_AUDIO_MIN_BUFFER_SIZE)).intValue();
    }

    public int getAudioSampleRate() {
        return ((Integer) retrieveOption(OPTION_AUDIO_SAMPLE_RATE)).intValue();
    }

    @Override // C.i
    public /* bridge */ /* synthetic */ Executor getBackgroundExecutor(Executor executor) {
        return super.getBackgroundExecutor(executor);
    }

    public int getBitRate() {
        return ((Integer) retrieveOption(OPTION_BIT_RATE)).intValue();
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

    public int getIFrameInterval() {
        return ((Integer) retrieveOption(OPTION_INTRA_FRAME_INTERVAL)).intValue();
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

    public int getVideoFrameRate() {
        return ((Integer) retrieveOption(OPTION_VIDEO_FRAME_RATE)).intValue();
    }

    @Override // z.N0, C.h, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ Object retrieveOption(InterfaceC6565N.a aVar, Object obj) {
        return super.retrieveOption(aVar, obj);
    }
}
