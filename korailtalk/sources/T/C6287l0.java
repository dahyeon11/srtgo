package t;

import s.C6203b;
import s.C6205d;
import z.C0;
import z.InterfaceC6565N;

/* renamed from: t.l0 */
/* loaded from: classes.dex */
final class C6287l0 implements C0.d {

    /* renamed from: a */
    static final C6287l0 f36721a = new C6287l0();

    C6287l0() {
    }

    @Override // z.C0.d
    public void unpack(z.N0 n02, C0.b bVar) {
        z.C0 defaultSessionConfig = n02.getDefaultSessionConfig(null);
        InterfaceC6565N interfaceC6565NEmptyBundle = z.v0.emptyBundle();
        int templateType = z.C0.defaultEmptySessionConfig().getTemplateType();
        if (defaultSessionConfig != null) {
            templateType = defaultSessionConfig.getTemplateType();
            bVar.addAllDeviceStateCallbacks(defaultSessionConfig.getDeviceStateCallbacks());
            bVar.addAllSessionStateCallbacks(defaultSessionConfig.getSessionStateCallbacks());
            bVar.addAllRepeatingCameraCaptureCallbacks(defaultSessionConfig.getRepeatingCameraCaptureCallbacks());
            interfaceC6565NEmptyBundle = defaultSessionConfig.getImplementationOptions();
        }
        bVar.setImplementationOptions(interfaceC6565NEmptyBundle);
        C6203b c6203b = new C6203b(n02);
        bVar.setTemplateType(c6203b.getCaptureRequestTemplate(templateType));
        bVar.addDeviceStateCallback(c6203b.getDeviceStateCallback(AbstractC6295p0.createNoOpCallback()));
        bVar.addSessionStateCallback(c6203b.getSessionStateCallback(AbstractC6293o0.createNoOpCallback()));
        bVar.addCameraCaptureCallback(C6304u0.a(c6203b.getSessionCaptureCallback(T.createNoOpCallback())));
        z.r0 r0VarCreate = z.r0.create();
        r0VarCreate.insertOption(C6203b.CAMERA_EVENT_CALLBACK_OPTION, c6203b.getCameraEventCallback(C6205d.createEmptyCallback()));
        r0VarCreate.insertOption(C6203b.SESSION_PHYSICAL_CAMERA_ID_OPTION, c6203b.getPhysicalCameraId(null));
        bVar.addImplementationOptions(r0VarCreate);
        bVar.addImplementationOptions(c6203b.getCaptureRequestOptions());
    }
}
