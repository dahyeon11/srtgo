package K;

import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.camera.core.B0;
import androidx.camera.core.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s.C6203b;
import z.C0;
import z.D0;
import z.E0;
import z.InterfaceC6565N;
import z.S;
import z.w0;

/* loaded from: classes.dex */
abstract class o implements D0 {

    /* renamed from: b */
    private HandlerThread f2716b;

    /* renamed from: e */
    private String f2719e;

    /* renamed from: a */
    private Map f2715a = new HashMap();

    /* renamed from: c */
    private List f2717c = new ArrayList();

    /* renamed from: d */
    private final Object f2718d = new Object();

    private static class a implements k {

        /* renamed from: b */
        private Image f2721b;

        /* renamed from: c */
        private final Object f2722c = new Object();

        /* renamed from: a */
        private int f2720a = 1;

        a(Image image) {
            this.f2721b = image;
        }

        @Override // K.k
        public boolean decrement() {
            synchronized (this.f2722c) {
                try {
                    int i8 = this.f2720a;
                    if (i8 <= 0) {
                        return false;
                    }
                    int i9 = i8 - 1;
                    this.f2720a = i9;
                    if (i9 <= 0) {
                        this.f2721b.close();
                    }
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // K.k
        public Image get() {
            return this.f2721b;
        }

        @Override // K.k
        public boolean increment() {
            synchronized (this.f2722c) {
                try {
                    int i8 = this.f2720a;
                    if (i8 <= 0) {
                        return false;
                    }
                    this.f2720a = i8 + 1;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    o() {
    }

    public static /* synthetic */ void f(i iVar, int i8, ImageReader imageReader) {
        try {
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            iVar.onNextImageAvailable(i8, imageAcquireNextImage.getTimestamp(), new a(imageAcquireNextImage), null);
        } catch (IllegalStateException e8) {
            B0.e("SessionProcessorBase", "Failed to acquire next image.", e8);
        }
    }

    @Override // z.D0
    public abstract /* synthetic */ void abortCapture(int i8);

    protected abstract void c();

    protected abstract g d(String str, Map map, w0 w0Var, w0 w0Var2, w0 w0Var3);

    @Override // z.D0
    public final void deInitSession() {
        B0.e("SessionProcessorBase", "deInitSession: cameraId=" + this.f2719e);
        c();
        synchronized (this.f2718d) {
            try {
                Iterator it = this.f2717c.iterator();
                while (it.hasNext()) {
                    ((S) it.next()).close();
                }
                this.f2717c.clear();
                this.f2715a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        HandlerThread handlerThread = this.f2716b;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f2716b = null;
        }
    }

    protected void g(final int i8, final i iVar) {
        ImageReader imageReader;
        synchronized (this.f2718d) {
            imageReader = (ImageReader) this.f2715a.get(Integer.valueOf(i8));
        }
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: K.m
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader2) {
                    o.f(iVar, i8, imageReader2);
                }
            }, new Handler(this.f2716b.getLooper()));
        }
    }

    @Override // z.D0
    public final C0 initSession(r rVar, w0 w0Var, w0 w0Var2, w0 w0Var3) {
        y.j jVarFrom = y.j.from(rVar);
        g gVarD = d(jVarFrom.getCameraId(), jVarFrom.getCameraCharacteristicsMap(), w0Var, w0Var2, w0Var3);
        synchronized (this.f2718d) {
            try {
                for (e eVar : gVarD.getOutputConfigs()) {
                    if (eVar instanceof p) {
                        this.f2717c.add(new E0(((p) eVar).getSurface(), eVar.getId()));
                    } else if (eVar instanceof j) {
                        j jVar = (j) eVar;
                        final ImageReader imageReaderNewInstance = ImageReader.newInstance(jVar.getSize().getWidth(), jVar.getSize().getHeight(), jVar.getImageFormat(), jVar.getMaxImages());
                        this.f2715a.put(Integer.valueOf(eVar.getId()), imageReaderNewInstance);
                        E0 e02 = new E0(imageReaderNewInstance.getSurface(), eVar.getId());
                        e02.getTerminationFuture().addListener(new Runnable() { // from class: K.n
                            @Override // java.lang.Runnable
                            public final void run() {
                                imageReaderNewInstance.close();
                            }
                        }, A.a.directExecutor());
                        this.f2717c.add(e02);
                    } else if (eVar instanceof l) {
                        throw new UnsupportedOperationException("MultiResolutionImageReader not supported");
                    }
                }
            } finally {
            }
        }
        C0.b bVar = new C0.b();
        synchronized (this.f2718d) {
            try {
                Iterator it = this.f2717c.iterator();
                while (it.hasNext()) {
                    bVar.addSurface((S) it.next());
                }
            } finally {
            }
        }
        C6203b.a aVar = new C6203b.a();
        for (CaptureRequest.Key<?> key : gVarD.getSessionParameters().keySet()) {
            aVar.setCaptureRequestOption(key, gVarD.getSessionParameters().get(key));
        }
        bVar.setImplementationOptions(aVar.build());
        bVar.setTemplateType(gVarD.getSessionTemplateId());
        HandlerThread handlerThread = new HandlerThread("CameraX-extensions_image_reader");
        this.f2716b = handlerThread;
        handlerThread.start();
        this.f2719e = jVarFrom.getCameraId();
        B0.d("SessionProcessorBase", "initSession: cameraId=" + this.f2719e);
        return bVar.build();
    }

    @Override // z.D0
    public abstract /* synthetic */ void onCaptureSessionEnd();

    @Override // z.D0
    public abstract /* synthetic */ void onCaptureSessionStart(z.B0 b02);

    @Override // z.D0
    public abstract /* synthetic */ void setParameters(InterfaceC6565N interfaceC6565N);

    @Override // z.D0
    public abstract /* synthetic */ int startCapture(D0.a aVar);

    @Override // z.D0
    public abstract /* synthetic */ int startRepeating(D0.a aVar);

    @Override // z.D0
    public abstract /* synthetic */ void stopRepeating();
}
