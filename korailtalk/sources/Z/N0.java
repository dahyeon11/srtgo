package z;

import C.h;
import C.j;
import androidx.camera.core.C0903t;
import androidx.camera.core.h1;
import java.util.Set;
import z.C0;
import z.C6562K;
import z.InterfaceC6565N;

/* loaded from: classes.dex */
public interface N0 extends C.h, C.j, InterfaceC6575d0 {
    public static final InterfaceC6565N.a OPTION_DEFAULT_SESSION_CONFIG = InterfaceC6565N.a.create("camerax.core.useCase.defaultSessionConfig", C0.class);
    public static final InterfaceC6565N.a OPTION_DEFAULT_CAPTURE_CONFIG = InterfaceC6565N.a.create("camerax.core.useCase.defaultCaptureConfig", C6562K.class);
    public static final InterfaceC6565N.a OPTION_SESSION_CONFIG_UNPACKER = InterfaceC6565N.a.create("camerax.core.useCase.sessionConfigUnpacker", C0.d.class);
    public static final InterfaceC6565N.a OPTION_CAPTURE_CONFIG_UNPACKER = InterfaceC6565N.a.create("camerax.core.useCase.captureConfigUnpacker", C6562K.b.class);
    public static final InterfaceC6565N.a OPTION_SURFACE_OCCUPANCY_PRIORITY = InterfaceC6565N.a.create("camerax.core.useCase.surfaceOccupancyPriority", Integer.TYPE);
    public static final InterfaceC6565N.a OPTION_CAMERA_SELECTOR = InterfaceC6565N.a.create("camerax.core.useCase.cameraSelector", C0903t.class);

    public interface a extends h.a, androidx.camera.core.I, j.a {
        /* synthetic */ Object build();

        /* synthetic */ q0 getMutableConfig();

        N0 getUseCaseConfig();

        Object setCameraSelector(C0903t c0903t);

        Object setCaptureOptionUnpacker(C6562K.b bVar);

        Object setDefaultCaptureConfig(C6562K c6562k);

        Object setDefaultSessionConfig(C0 c02);

        Object setSessionOptionUnpacker(C0.d dVar);

        Object setSurfaceOccupancyPriority(int i8);

        @Override // C.h.a
        /* synthetic */ Object setTargetClass(Class cls);

        @Override // C.h.a
        /* synthetic */ Object setTargetName(String str);

        /* synthetic */ Object setUseCaseEventCallback(h1.b bVar);
    }

    @Override // C.h, z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default boolean containsOption(InterfaceC6565N.a aVar) {
        return super.containsOption(aVar);
    }

    @Override // C.h, z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default void findOptions(String str, InterfaceC6565N.b bVar) {
        super.findOptions(str, bVar);
    }

    default C0903t getCameraSelector(C0903t c0903t) {
        return (C0903t) retrieveOption(OPTION_CAMERA_SELECTOR, c0903t);
    }

    default C6562K.b getCaptureOptionUnpacker(C6562K.b bVar) {
        return (C6562K.b) retrieveOption(OPTION_CAPTURE_CONFIG_UNPACKER, bVar);
    }

    @Override // C.h, z.A0
    /* synthetic */ InterfaceC6565N getConfig();

    default C6562K getDefaultCaptureConfig(C6562K c6562k) {
        return (C6562K) retrieveOption(OPTION_DEFAULT_CAPTURE_CONFIG, c6562k);
    }

    default C0 getDefaultSessionConfig(C0 c02) {
        return (C0) retrieveOption(OPTION_DEFAULT_SESSION_CONFIG, c02);
    }

    /* bridge */ /* synthetic */ default int getInputFormat() {
        return super.getInputFormat();
    }

    @Override // C.h, z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default InterfaceC6565N.c getOptionPriority(InterfaceC6565N.a aVar) {
        return super.getOptionPriority(aVar);
    }

    @Override // C.h, z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default Set getPriorities(InterfaceC6565N.a aVar) {
        return super.getPriorities(aVar);
    }

    default C0.d getSessionOptionUnpacker(C0.d dVar) {
        return (C0.d) retrieveOption(OPTION_SESSION_CONFIG_UNPACKER, dVar);
    }

    default int getSurfaceOccupancyPriority(int i8) {
        return ((Integer) retrieveOption(OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i8))).intValue();
    }

    @Override // C.h
    /* bridge */ /* synthetic */ default Class getTargetClass() {
        return super.getTargetClass();
    }

    @Override // C.h
    /* bridge */ /* synthetic */ default String getTargetName() {
        return super.getTargetName();
    }

    /* bridge */ /* synthetic */ default h1.b getUseCaseEventCallback() {
        return super.getUseCaseEventCallback();
    }

    @Override // C.h, z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default Set listOptions() {
        return super.listOptions();
    }

    @Override // C.h, z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default Object retrieveOption(InterfaceC6565N.a aVar) {
        return super.retrieveOption(aVar);
    }

    @Override // C.h, z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default Object retrieveOptionWithPriority(InterfaceC6565N.a aVar, InterfaceC6565N.c cVar) {
        return super.retrieveOptionWithPriority(aVar, cVar);
    }

    default C0903t getCameraSelector() {
        return (C0903t) retrieveOption(OPTION_CAMERA_SELECTOR);
    }

    default C6562K.b getCaptureOptionUnpacker() {
        return (C6562K.b) retrieveOption(OPTION_CAPTURE_CONFIG_UNPACKER);
    }

    default C6562K getDefaultCaptureConfig() {
        return (C6562K) retrieveOption(OPTION_DEFAULT_CAPTURE_CONFIG);
    }

    default C0 getDefaultSessionConfig() {
        return (C0) retrieveOption(OPTION_DEFAULT_SESSION_CONFIG);
    }

    default C0.d getSessionOptionUnpacker() {
        return (C0.d) retrieveOption(OPTION_SESSION_CONFIG_UNPACKER);
    }

    default int getSurfaceOccupancyPriority() {
        return ((Integer) retrieveOption(OPTION_SURFACE_OCCUPANCY_PRIORITY)).intValue();
    }

    @Override // C.h
    /* bridge */ /* synthetic */ default Class getTargetClass(Class cls) {
        return super.getTargetClass(cls);
    }

    @Override // C.h
    /* bridge */ /* synthetic */ default String getTargetName(String str) {
        return super.getTargetName(str);
    }

    /* bridge */ /* synthetic */ default h1.b getUseCaseEventCallback(h1.b bVar) {
        return super.getUseCaseEventCallback(bVar);
    }

    @Override // C.h, z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default Object retrieveOption(InterfaceC6565N.a aVar, Object obj) {
        return super.retrieveOption(aVar, obj);
    }
}
