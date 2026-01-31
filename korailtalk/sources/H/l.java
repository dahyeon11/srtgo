package H;

import android.content.Context;
import android.os.Build;
import androidx.camera.core.B0;
import androidx.camera.core.C0889l0;
import androidx.camera.core.h1;
import androidx.camera.core.r;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import androidx.camera.extensions.impl.CaptureStageImpl;
import androidx.camera.extensions.impl.ImageCaptureExtenderImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import s.AbstractC6204c;
import s.C6203b;
import s.C6205d;
import z.C6562K;
import z.C6571b0;
import z.InterfaceC6561J;
import z.InterfaceC6564M;
import z.InterfaceC6565N;
import z.InterfaceC6566O;

/* loaded from: classes.dex */
public class l implements InterfaceC6566O {

    /* renamed from: d, reason: collision with root package name */
    static final InterfaceC6565N.a f1541d = InterfaceC6565N.a.create("camerax.extensions.imageCaptureConfigProvider.mode", Integer.class);

    /* renamed from: a, reason: collision with root package name */
    private final n f1542a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f1543b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1544c;

    private static class a extends AbstractC6204c implements h1.b, InterfaceC6561J {

        /* renamed from: a, reason: collision with root package name */
        private final ImageCaptureExtenderImpl f1545a;

        /* renamed from: b, reason: collision with root package name */
        private final Context f1546b;

        /* renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f1547c = new AtomicBoolean(true);

        /* renamed from: d, reason: collision with root package name */
        private final Object f1548d = new Object();

        /* renamed from: e, reason: collision with root package name */
        private volatile int f1549e = 0;

        /* renamed from: f, reason: collision with root package name */
        private volatile boolean f1550f = false;

        a(ImageCaptureExtenderImpl imageCaptureExtenderImpl, Context context) {
            this.f1545a = imageCaptureExtenderImpl;
            this.f1546b = context;
        }

        private void a() {
            if (this.f1547c.get()) {
                this.f1545a.onDeInit();
                this.f1547c.set(false);
            }
        }

        @Override // z.InterfaceC6561J
        public List<InterfaceC6564M> getCaptureStages() {
            List captureStages;
            if (!this.f1547c.get() || (captureStages = this.f1545a.getCaptureStages()) == null || captureStages.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = captureStages.iterator();
            while (it.hasNext()) {
                arrayList.add(new b((CaptureStageImpl) it.next()));
            }
            return arrayList;
        }

        @Override // androidx.camera.core.h1.b
        public void onAttach(r rVar) {
            if (this.f1547c.get()) {
                this.f1545a.onInit(y.j.from(rVar).getCameraId(), y.j.extractCameraCharacteristics(rVar), this.f1546b);
            }
        }

        @Override // androidx.camera.core.h1.b
        public void onDetach() {
            synchronized (this.f1548d) {
                try {
                    this.f1550f = true;
                    if (this.f1549e == 0) {
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
                if (!this.f1547c.get() || (captureStageImplOnDisableSession = this.f1545a.onDisableSession()) == null) {
                    synchronized (this.f1548d) {
                        try {
                            this.f1549e--;
                            if (this.f1549e == 0 && this.f1550f) {
                                a();
                            }
                        } finally {
                        }
                    }
                    return null;
                }
                C6562K captureConfig = new b(captureStageImplOnDisableSession).getCaptureConfig();
                synchronized (this.f1548d) {
                    try {
                        this.f1549e--;
                        if (this.f1549e == 0 && this.f1550f) {
                            a();
                        }
                    } finally {
                    }
                }
                return captureConfig;
            } catch (Throwable th) {
                synchronized (this.f1548d) {
                    try {
                        this.f1549e--;
                        if (this.f1549e == 0 && this.f1550f) {
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
                if (!this.f1547c.get() || (captureStageImplOnEnableSession = this.f1545a.onEnableSession()) == null) {
                    synchronized (this.f1548d) {
                        this.f1549e++;
                    }
                    return null;
                }
                C6562K captureConfig = new b(captureStageImplOnEnableSession).getCaptureConfig();
                synchronized (this.f1548d) {
                    this.f1549e++;
                }
                return captureConfig;
            } catch (Throwable th) {
                synchronized (this.f1548d) {
                    this.f1549e++;
                    throw th;
                }
            }
        }

        @Override // s.AbstractC6204c
        public C6562K onPresetSession() {
            CaptureStageImpl captureStageImplOnPresetSession;
            if (!this.f1547c.get() || (captureStageImplOnPresetSession = this.f1545a.onPresetSession()) == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                return new b(captureStageImplOnPresetSession).getCaptureConfig();
            }
            B0.w("ImageCaptureConfigProvider", "The CaptureRequest parameters returned from onPresetSession() will be passed to the camera device as part of the capture session via SessionConfiguration#setSessionParameters(CaptureRequest) which only supported from API level 28!");
            return null;
        }
    }

    public l(int i8, n nVar, Context context) {
        this.f1544c = i8;
        this.f1542a = nVar;
        this.f1543b = context;
    }

    void a(C0889l0.g gVar, int i8, n nVar, Context context) {
        if (nVar instanceof g) {
            ImageCaptureExtenderImpl imageCaptureExtenderImpl = ((g) nVar).getImageCaptureExtenderImpl();
            CaptureProcessorImpl captureProcessor = imageCaptureExtenderImpl.getCaptureProcessor();
            if (captureProcessor != null) {
                gVar.setCaptureProcessor(new H.a(captureProcessor));
            }
            if (imageCaptureExtenderImpl.getMaxCaptureStage() > 0) {
                gVar.setMaxCaptureStages(imageCaptureExtenderImpl.getMaxCaptureStage());
            }
            a aVar = new a(imageCaptureExtenderImpl, context);
            new C6203b.C0417b(gVar).setCameraEventCallback(new C6205d(aVar));
            gVar.setUseCaseEventCallback((h1.b) aVar);
            gVar.setCaptureBundle(aVar);
        }
        gVar.getMutableConfig().insertOption(f1541d, Integer.valueOf(i8));
        gVar.setSupportedResolutions(nVar.getSupportedCaptureOutputResolutions());
    }

    @Override // z.InterfaceC6566O
    public C6571b0 getConfig() {
        C0889l0.g gVar = new C0889l0.g();
        a(gVar, this.f1544c, this.f1542a, this.f1543b);
        return gVar.getUseCaseConfig();
    }
}
