package H;

import android.content.Context;
import android.os.Build;
import androidx.camera.core.B0;
import androidx.camera.core.K0;
import androidx.camera.core.h1;
import androidx.camera.core.r;
import androidx.camera.extensions.impl.CaptureStageImpl;
import androidx.camera.extensions.impl.PreviewExtenderImpl;
import s.AbstractC6204c;
import s.C6203b;
import s.C6205d;
import z.C6562K;
import z.InterfaceC6565N;
import z.InterfaceC6566O;
import z.x0;

/* loaded from: classes.dex */
public class m implements InterfaceC6566O {

    /* renamed from: d, reason: collision with root package name */
    static final InterfaceC6565N.a f1551d = InterfaceC6565N.a.create("camerax.extensions.previewConfigProvider.mode", Integer.class);

    /* renamed from: a, reason: collision with root package name */
    private final n f1552a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f1553b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1554c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1555a;

        static {
            int[] iArr = new int[PreviewExtenderImpl.ProcessorType.values().length];
            f1555a = iArr;
            try {
                iArr[PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_REQUEST_UPDATE_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1555a[PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_IMAGE_PROCESSOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static class b extends AbstractC6204c implements h1.b {

        /* renamed from: a, reason: collision with root package name */
        final PreviewExtenderImpl f1556a;

        /* renamed from: b, reason: collision with root package name */
        private final Context f1557b;

        /* renamed from: c, reason: collision with root package name */
        final i f1558c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f1559d = true;

        /* renamed from: e, reason: collision with root package name */
        final Object f1560e = new Object();

        /* renamed from: f, reason: collision with root package name */
        private volatile int f1561f = 0;

        /* renamed from: g, reason: collision with root package name */
        private volatile boolean f1562g = false;

        b(PreviewExtenderImpl previewExtenderImpl, Context context, i iVar) {
            this.f1556a = previewExtenderImpl;
            this.f1557b = context;
            this.f1558c = iVar;
        }

        private void a() {
            synchronized (this.f1560e) {
                try {
                    if (this.f1559d) {
                        i iVar = this.f1558c;
                        if (iVar != null) {
                            iVar.close();
                        }
                        this.f1556a.onDeInit();
                        this.f1559d = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.camera.core.h1.b
        public void onAttach(r rVar) {
            synchronized (this.f1560e) {
                try {
                    if (this.f1559d) {
                        this.f1556a.onInit(y.j.from(rVar).getCameraId(), y.j.extractCameraCharacteristics(rVar), this.f1557b);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.camera.core.h1.b
        public void onDetach() {
            synchronized (this.f1560e) {
                try {
                    this.f1562g = true;
                    if (this.f1561f == 0) {
                        a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // s.AbstractC6204c
        public C6562K onDisableSession() {
            CaptureStageImpl captureStageImplOnDisableSession;
            try {
                synchronized (this.f1560e) {
                    if (!this.f1559d || (captureStageImplOnDisableSession = this.f1556a.onDisableSession()) == null) {
                        synchronized (this.f1560e) {
                            try {
                                this.f1561f--;
                                if (this.f1561f == 0 && this.f1562g) {
                                    a();
                                }
                            } finally {
                            }
                        }
                        return null;
                    }
                    C6562K captureConfig = new H.b(captureStageImplOnDisableSession).getCaptureConfig();
                    synchronized (this.f1560e) {
                        try {
                            this.f1561f--;
                            if (this.f1561f == 0 && this.f1562g) {
                                a();
                            }
                        } finally {
                        }
                    }
                    return captureConfig;
                }
            } catch (Throwable th) {
                synchronized (this.f1560e) {
                    try {
                        this.f1561f--;
                        if (this.f1561f == 0 && this.f1562g) {
                            a();
                        }
                        throw th;
                    } finally {
                    }
                }
            }
        }

        @Override // s.AbstractC6204c
        public C6562K onEnableSession() {
            CaptureStageImpl captureStageImplOnEnableSession;
            try {
                synchronized (this.f1560e) {
                    if (!this.f1559d || (captureStageImplOnEnableSession = this.f1556a.onEnableSession()) == null) {
                        synchronized (this.f1560e) {
                            this.f1561f++;
                        }
                        return null;
                    }
                    C6562K captureConfig = new H.b(captureStageImplOnEnableSession).getCaptureConfig();
                    synchronized (this.f1560e) {
                        this.f1561f++;
                    }
                    return captureConfig;
                }
            } catch (Throwable th) {
                synchronized (this.f1560e) {
                    this.f1561f++;
                    throw th;
                }
            }
        }

        @Override // s.AbstractC6204c
        public C6562K onPresetSession() {
            synchronized (this.f1560e) {
                try {
                    CaptureStageImpl captureStageImplOnPresetSession = this.f1556a.onPresetSession();
                    if (captureStageImplOnPresetSession != null) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            return new H.b(captureStageImplOnPresetSession).getCaptureConfig();
                        }
                        B0.w("PreviewConfigProvider", "The CaptureRequest parameters returned from onPresetSession() will be passed to the camera device as part of the capture session via SessionConfiguration#setSessionParameters(CaptureRequest) which only supported from API level 28!");
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // s.AbstractC6204c
        public C6562K onRepeating() {
            CaptureStageImpl captureStage;
            synchronized (this.f1560e) {
                try {
                    if (!this.f1559d || (captureStage = this.f1556a.getCaptureStage()) == null) {
                        return null;
                    }
                    return new H.b(captureStage).getCaptureConfig();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public m(int i8, n nVar, Context context) {
        this.f1554c = i8;
        this.f1552a = nVar;
        this.f1553b = context;
    }

    void a(K0.b bVar, int i8, n nVar, Context context) {
        h1.b bVar2;
        h1.b bVar3;
        if (nVar instanceof g) {
            PreviewExtenderImpl previewExtenderImpl = ((g) nVar).getPreviewExtenderImpl();
            int i9 = a.f1555a[previewExtenderImpl.getProcessorType().ordinal()];
            if (i9 == 1) {
                d dVar = new d(previewExtenderImpl);
                bVar.setImageInfoProcessor(dVar);
                bVar2 = new b(previewExtenderImpl, context, dVar);
            } else if (i9 != 2) {
                bVar3 = new b(previewExtenderImpl, context, null);
                new C6203b.C0417b(bVar).setCameraEventCallback(new C6205d(bVar3));
                bVar.setUseCaseEventCallback(bVar3);
            } else {
                c cVar = new c(previewExtenderImpl.getProcessor());
                bVar.setCaptureProcessor(cVar);
                bVar2 = new b(previewExtenderImpl, context, cVar);
            }
            bVar3 = bVar2;
            new C6203b.C0417b(bVar).setCameraEventCallback(new C6205d(bVar3));
            bVar.setUseCaseEventCallback(bVar3);
        }
        bVar.getMutableConfig().insertOption(f1551d, Integer.valueOf(i8));
        bVar.setSupportedResolutions(nVar.getSupportedPreviewOutputResolutions());
    }

    @Override // z.InterfaceC6566O
    public x0 getConfig() {
        K0.b bVar = new K0.b();
        a(bVar, this.f1554c, this.f1552a, this.f1553b);
        return bVar.getUseCaseConfig();
    }
}
