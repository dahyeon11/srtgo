package t;

import s.C6203b;
import z.C6562K;
import z.InterfaceC6565N;

/* loaded from: classes.dex */
class U implements C6562K.b {

    /* renamed from: a */
    static final U f36552a = new U();

    U() {
    }

    @Override // z.C6562K.b
    public void unpack(z.N0 n02, C6562K.a aVar) {
        C6562K defaultCaptureConfig = n02.getDefaultCaptureConfig(null);
        InterfaceC6565N interfaceC6565NEmptyBundle = z.v0.emptyBundle();
        int templateType = C6562K.defaultEmptyCaptureConfig().getTemplateType();
        if (defaultCaptureConfig != null) {
            templateType = defaultCaptureConfig.getTemplateType();
            aVar.addAllCameraCaptureCallbacks(defaultCaptureConfig.getCameraCaptureCallbacks());
            interfaceC6565NEmptyBundle = defaultCaptureConfig.getImplementationOptions();
        }
        aVar.setImplementationOptions(interfaceC6565NEmptyBundle);
        C6203b c6203b = new C6203b(n02);
        aVar.setTemplateType(c6203b.getCaptureRequestTemplate(templateType));
        aVar.addCameraCaptureCallback(C6304u0.a(c6203b.getSessionCaptureCallback(T.createNoOpCallback())));
        aVar.addImplementationOptions(c6203b.getCaptureRequestOptions());
    }
}
