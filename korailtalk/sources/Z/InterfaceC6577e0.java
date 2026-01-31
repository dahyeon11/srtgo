package z;

import android.util.Pair;
import android.util.Size;
import androidx.camera.core.AbstractC0874e;
import java.util.List;
import java.util.Set;
import z.InterfaceC6565N;

/* renamed from: z.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6577e0 extends A0 {
    public static final int INVALID_ROTATION = -1;
    public static final InterfaceC6565N.a OPTION_TARGET_ASPECT_RATIO = InterfaceC6565N.a.create("camerax.core.imageOutput.targetAspectRatio", AbstractC0874e.class);
    public static final InterfaceC6565N.a OPTION_TARGET_ROTATION = InterfaceC6565N.a.create("camerax.core.imageOutput.targetRotation", Integer.TYPE);
    public static final InterfaceC6565N.a OPTION_TARGET_RESOLUTION = InterfaceC6565N.a.create("camerax.core.imageOutput.targetResolution", Size.class);
    public static final InterfaceC6565N.a OPTION_DEFAULT_RESOLUTION = InterfaceC6565N.a.create("camerax.core.imageOutput.defaultResolution", Size.class);
    public static final InterfaceC6565N.a OPTION_MAX_RESOLUTION = InterfaceC6565N.a.create("camerax.core.imageOutput.maxResolution", Size.class);
    public static final InterfaceC6565N.a OPTION_SUPPORTED_RESOLUTIONS = InterfaceC6565N.a.create("camerax.core.imageOutput.supportedResolutions", List.class);

    /* renamed from: z.e0$a */
    public interface a {
        Object setDefaultResolution(Size size);

        Object setMaxResolution(Size size);

        Object setSupportedResolutions(List<Pair<Integer, Size[]>> list);

        Object setTargetAspectRatio(int i8);

        Object setTargetResolution(Size size);

        Object setTargetRotation(int i8);
    }

    @Override // z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default boolean containsOption(InterfaceC6565N.a aVar) {
        return super.containsOption(aVar);
    }

    @Override // z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default void findOptions(String str, InterfaceC6565N.b bVar) {
        super.findOptions(str, bVar);
    }

    @Override // z.A0
    /* synthetic */ InterfaceC6565N getConfig();

    default Size getDefaultResolution(Size size) {
        return (Size) retrieveOption(OPTION_DEFAULT_RESOLUTION, size);
    }

    default Size getMaxResolution(Size size) {
        return (Size) retrieveOption(OPTION_MAX_RESOLUTION, size);
    }

    @Override // z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default InterfaceC6565N.c getOptionPriority(InterfaceC6565N.a aVar) {
        return super.getOptionPriority(aVar);
    }

    @Override // z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default Set getPriorities(InterfaceC6565N.a aVar) {
        return super.getPriorities(aVar);
    }

    default List<Pair<Integer, Size[]>> getSupportedResolutions(List<Pair<Integer, Size[]>> list) {
        return (List) retrieveOption(OPTION_SUPPORTED_RESOLUTIONS, list);
    }

    default int getTargetAspectRatio() {
        return ((Integer) retrieveOption(OPTION_TARGET_ASPECT_RATIO)).intValue();
    }

    default Size getTargetResolution(Size size) {
        return (Size) retrieveOption(OPTION_TARGET_RESOLUTION, size);
    }

    default int getTargetRotation(int i8) {
        return ((Integer) retrieveOption(OPTION_TARGET_ROTATION, Integer.valueOf(i8))).intValue();
    }

    default boolean hasTargetAspectRatio() {
        return containsOption(OPTION_TARGET_ASPECT_RATIO);
    }

    @Override // z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default Set listOptions() {
        return super.listOptions();
    }

    @Override // z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default Object retrieveOption(InterfaceC6565N.a aVar) {
        return super.retrieveOption(aVar);
    }

    @Override // z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default Object retrieveOptionWithPriority(InterfaceC6565N.a aVar, InterfaceC6565N.c cVar) {
        return super.retrieveOptionWithPriority(aVar, cVar);
    }

    default Size getDefaultResolution() {
        return (Size) retrieveOption(OPTION_DEFAULT_RESOLUTION);
    }

    default Size getMaxResolution() {
        return (Size) retrieveOption(OPTION_MAX_RESOLUTION);
    }

    default List<Pair<Integer, Size[]>> getSupportedResolutions() {
        return (List) retrieveOption(OPTION_SUPPORTED_RESOLUTIONS);
    }

    default Size getTargetResolution() {
        return (Size) retrieveOption(OPTION_TARGET_RESOLUTION);
    }

    default int getTargetRotation() {
        return ((Integer) retrieveOption(OPTION_TARGET_ROTATION)).intValue();
    }

    @Override // z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default Object retrieveOption(InterfaceC6565N.a aVar, Object obj) {
        return super.retrieveOption(aVar, obj);
    }
}
