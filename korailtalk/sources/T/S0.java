package t;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C0903t;
import androidx.camera.core.h1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import u.C6372C;
import z.C0;
import z.C6562K;
import z.C6583h0;
import z.InterfaceC6565N;

/* loaded from: classes.dex */
class S0 {

    /* renamed from: a */
    private z.S f36541a;

    /* renamed from: b */
    private final z.C0 f36542b;

    class a implements B.c {

        /* renamed from: a */
        final /* synthetic */ Surface f36543a;

        /* renamed from: b */
        final /* synthetic */ SurfaceTexture f36544b;

        a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f36543a = surface;
            this.f36544b = surfaceTexture;
        }

        @Override // B.c
        public void onFailure(Throwable th) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }

        @Override // B.c
        public void onSuccess(Void r12) {
            this.f36543a.release();
            this.f36544b.release();
        }
    }

    private static class b implements z.N0 {

        /* renamed from: a */
        private final InterfaceC6565N f36546a;

        b() {
            z.r0 r0VarCreate = z.r0.create();
            r0VarCreate.insertOption(z.N0.OPTION_SESSION_CONFIG_UNPACKER, new C6287l0());
            this.f36546a = r0VarCreate;
        }

        @Override // z.N0, C.h, z.A0, z.InterfaceC6565N
        public /* bridge */ /* synthetic */ boolean containsOption(InterfaceC6565N.a aVar) {
            return super.containsOption(aVar);
        }

        @Override // z.N0, C.h, z.A0, z.InterfaceC6565N
        public /* bridge */ /* synthetic */ void findOptions(String str, InterfaceC6565N.b bVar) {
            super.findOptions(str, bVar);
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
            return this.f36546a;
        }

        @Override // z.N0
        public /* bridge */ /* synthetic */ C6562K getDefaultCaptureConfig() {
            return super.getDefaultCaptureConfig();
        }

        @Override // z.N0
        public /* bridge */ /* synthetic */ z.C0 getDefaultSessionConfig() {
            return super.getDefaultSessionConfig();
        }

        @Override // z.N0, z.InterfaceC6575d0
        public /* bridge */ /* synthetic */ int getInputFormat() {
            return super.getInputFormat();
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

        @Override // z.N0
        public /* bridge */ /* synthetic */ int getSurfaceOccupancyPriority() {
            return super.getSurfaceOccupancyPriority();
        }

        @Override // z.N0, C.h
        public /* bridge */ /* synthetic */ Class getTargetClass() {
            return super.getTargetClass();
        }

        @Override // z.N0, C.h
        public /* bridge */ /* synthetic */ String getTargetName() {
            return super.getTargetName();
        }

        @Override // z.N0, C.j
        public /* bridge */ /* synthetic */ h1.b getUseCaseEventCallback() {
            return super.getUseCaseEventCallback();
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

        @Override // z.N0
        public /* bridge */ /* synthetic */ z.C0 getDefaultSessionConfig(z.C0 c02) {
            return super.getDefaultSessionConfig(c02);
        }

        @Override // z.N0
        public /* bridge */ /* synthetic */ C0.d getSessionOptionUnpacker(C0.d dVar) {
            return super.getSessionOptionUnpacker(dVar);
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

        @Override // z.N0, C.j
        public /* bridge */ /* synthetic */ h1.b getUseCaseEventCallback(h1.b bVar) {
            return super.getUseCaseEventCallback(bVar);
        }

        @Override // z.N0, C.h, z.A0, z.InterfaceC6565N
        public /* bridge */ /* synthetic */ Object retrieveOption(InterfaceC6565N.a aVar, Object obj) {
            return super.retrieveOption(aVar, obj);
        }
    }

    S0(C6372C c6372c) {
        b bVar = new b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size sizeC = c(c6372c);
        androidx.camera.core.B0.d("MeteringRepeating", "MerteringSession SurfaceTexture size: " + sizeC);
        surfaceTexture.setDefaultBufferSize(sizeC.getWidth(), sizeC.getHeight());
        Surface surface = new Surface(surfaceTexture);
        C0.b bVarCreateFrom = C0.b.createFrom(bVar);
        bVarCreateFrom.setTemplateType(1);
        C6583h0 c6583h0 = new C6583h0(surface);
        this.f36541a = c6583h0;
        B.f.addCallback(c6583h0.getTerminationFuture(), new a(surface, surfaceTexture), A.a.directExecutor());
        bVarCreateFrom.addSurface(this.f36541a);
        this.f36542b = bVarCreateFrom.build();
    }

    private Size c(C6372C c6372c) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) c6372c.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            androidx.camera.core.B0.e("MeteringRepeating", "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP.");
            return new Size(0, 0);
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(34);
        if (outputSizes != null) {
            return (Size) Collections.min(Arrays.asList(outputSizes), new Comparator() { // from class: t.R0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return S0.f((Size) obj, (Size) obj2);
                }
            });
        }
        androidx.camera.core.B0.e("MeteringRepeating", "Can not get output size list.");
        return new Size(0, 0);
    }

    public static /* synthetic */ int f(Size size, Size size2) {
        return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
    }

    void b() {
        androidx.camera.core.B0.d("MeteringRepeating", "MeteringRepeating clear!");
        z.S s8 = this.f36541a;
        if (s8 != null) {
            s8.close();
        }
        this.f36541a = null;
    }

    String d() {
        return "MeteringRepeating";
    }

    z.C0 e() {
        return this.f36542b;
    }
}
