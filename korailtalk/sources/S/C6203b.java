package s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.I;
import java.util.Set;
import y.l;
import z.InterfaceC6565N;
import z.q0;
import z.r0;
import z.v0;

/* renamed from: s.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6203b extends l {
    public static final String CAPTURE_REQUEST_ID_STEM = "camera2.captureRequest.option.";
    public static final InterfaceC6565N.a TEMPLATE_TYPE_OPTION = InterfaceC6565N.a.create("camera2.captureRequest.templateType", Integer.TYPE);
    public static final InterfaceC6565N.a DEVICE_STATE_CALLBACK_OPTION = InterfaceC6565N.a.create("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);
    public static final InterfaceC6565N.a SESSION_STATE_CALLBACK_OPTION = InterfaceC6565N.a.create("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);
    public static final InterfaceC6565N.a SESSION_CAPTURE_CALLBACK_OPTION = InterfaceC6565N.a.create("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);
    public static final InterfaceC6565N.a CAMERA_EVENT_CALLBACK_OPTION = InterfaceC6565N.a.create("camera2.cameraEvent.callback", C6205d.class);
    public static final InterfaceC6565N.a CAPTURE_REQUEST_TAG_OPTION = InterfaceC6565N.a.create("camera2.captureRequest.tag", Object.class);
    public static final InterfaceC6565N.a SESSION_PHYSICAL_CAMERA_ID_OPTION = InterfaceC6565N.a.create("camera2.cameraCaptureSession.physicalCameraId", String.class);

    /* renamed from: s.b$a */
    public static final class a implements I {

        /* renamed from: a, reason: collision with root package name */
        private final r0 f36127a = r0.create();

        @Override // androidx.camera.core.I
        public q0 getMutableConfig() {
            return this.f36127a;
        }

        public a insertAllOptions(InterfaceC6565N interfaceC6565N) {
            for (InterfaceC6565N.a aVar : interfaceC6565N.listOptions()) {
                this.f36127a.insertOption(aVar, interfaceC6565N.retrieveOption(aVar));
            }
            return this;
        }

        public <ValueT> a setCaptureRequestOption(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f36127a.insertOption(C6203b.createCaptureRequestOption(key), valuet);
            return this;
        }

        public <ValueT> a setCaptureRequestOptionWithPriority(CaptureRequest.Key<ValueT> key, ValueT valuet, InterfaceC6565N.c cVar) {
            this.f36127a.insertOption(C6203b.createCaptureRequestOption(key), cVar, valuet);
            return this;
        }

        @Override // androidx.camera.core.I
        public C6203b build() {
            return new C6203b(v0.from(this.f36127a));
        }
    }

    /* renamed from: s.b$b, reason: collision with other inner class name */
    public static final class C0417b {

        /* renamed from: a, reason: collision with root package name */
        I f36128a;

        public C0417b(I i8) {
            this.f36128a = i8;
        }

        public C0417b setCameraEventCallback(C6205d c6205d) {
            this.f36128a.getMutableConfig().insertOption(C6203b.CAMERA_EVENT_CALLBACK_OPTION, c6205d);
            return this;
        }
    }

    public C6203b(InterfaceC6565N interfaceC6565N) {
        super(interfaceC6565N);
    }

    public static InterfaceC6565N.a createCaptureRequestOption(CaptureRequest.Key<?> key) {
        return InterfaceC6565N.a.create(CAPTURE_REQUEST_ID_STEM + key.getName(), Object.class, key);
    }

    @Override // y.l, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ boolean containsOption(InterfaceC6565N.a aVar) {
        return super.containsOption(aVar);
    }

    @Override // y.l, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ void findOptions(String str, InterfaceC6565N.b bVar) {
        super.findOptions(str, bVar);
    }

    public C6205d getCameraEventCallback(C6205d c6205d) {
        return (C6205d) getConfig().retrieveOption(CAMERA_EVENT_CALLBACK_OPTION, c6205d);
    }

    public l getCaptureRequestOptions() {
        return l.a.from(getConfig()).build();
    }

    public Object getCaptureRequestTag(Object obj) {
        return getConfig().retrieveOption(CAPTURE_REQUEST_TAG_OPTION, obj);
    }

    public int getCaptureRequestTemplate(int i8) {
        return ((Integer) getConfig().retrieveOption(TEMPLATE_TYPE_OPTION, Integer.valueOf(i8))).intValue();
    }

    public CameraDevice.StateCallback getDeviceStateCallback(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) getConfig().retrieveOption(DEVICE_STATE_CALLBACK_OPTION, stateCallback);
    }

    @Override // y.l, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ InterfaceC6565N.c getOptionPriority(InterfaceC6565N.a aVar) {
        return super.getOptionPriority(aVar);
    }

    public String getPhysicalCameraId(String str) {
        return (String) getConfig().retrieveOption(SESSION_PHYSICAL_CAMERA_ID_OPTION, str);
    }

    @Override // y.l, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ Set getPriorities(InterfaceC6565N.a aVar) {
        return super.getPriorities(aVar);
    }

    public CameraCaptureSession.CaptureCallback getSessionCaptureCallback(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) getConfig().retrieveOption(SESSION_CAPTURE_CALLBACK_OPTION, captureCallback);
    }

    public CameraCaptureSession.StateCallback getSessionStateCallback(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) getConfig().retrieveOption(SESSION_STATE_CALLBACK_OPTION, stateCallback);
    }

    @Override // y.l, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ Set listOptions() {
        return super.listOptions();
    }

    @Override // y.l, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ Object retrieveOption(InterfaceC6565N.a aVar) {
        return super.retrieveOption(aVar);
    }

    @Override // y.l, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ Object retrieveOptionWithPriority(InterfaceC6565N.a aVar, InterfaceC6565N.c cVar) {
        return super.retrieveOptionWithPriority(aVar, cVar);
    }

    @Override // y.l, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ Object retrieveOption(InterfaceC6565N.a aVar, Object obj) {
        return super.retrieveOption(aVar, obj);
    }
}
