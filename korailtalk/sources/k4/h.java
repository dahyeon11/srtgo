package k4;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import j4.u;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: n */
    private static final String f33588n = "h";

    /* renamed from: a */
    private m f33589a;

    /* renamed from: b */
    private l f33590b;

    /* renamed from: c */
    private i f33591c;

    /* renamed from: d */
    private Handler f33592d;

    /* renamed from: e */
    private o f33593e;

    /* renamed from: h */
    private Handler f33596h;

    /* renamed from: f */
    private boolean f33594f = false;

    /* renamed from: g */
    private boolean f33595g = true;

    /* renamed from: i */
    private k f33597i = new k();

    /* renamed from: j */
    private Runnable f33598j = new a();

    /* renamed from: k */
    private Runnable f33599k = new b();

    /* renamed from: l */
    private Runnable f33600l = new c();

    /* renamed from: m */
    private Runnable f33601m = new d();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String unused = h.f33588n;
                h.this.f33591c.open();
            } catch (Exception e8) {
                h.this.r(e8);
                Log.e(h.f33588n, "Failed to open camera", e8);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String unused = h.f33588n;
                h.this.f33591c.configure();
                if (h.this.f33592d != null) {
                    h.this.f33592d.obtainMessage(K3.k.zxing_prewiew_size_ready, h.this.m()).sendToTarget();
                }
            } catch (Exception e8) {
                h.this.r(e8);
                Log.e(h.f33588n, "Failed to configure camera", e8);
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String unused = h.f33588n;
                h.this.f33591c.setPreviewDisplay(h.this.f33590b);
                h.this.f33591c.startPreview();
            } catch (Exception e8) {
                h.this.r(e8);
                Log.e(h.f33588n, "Failed to start preview", e8);
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String unused = h.f33588n;
                h.this.f33591c.stopPreview();
                h.this.f33591c.close();
            } catch (Exception e8) {
                Log.e(h.f33588n, "Failed to close camera", e8);
            }
            h.this.f33595g = true;
            h.this.f33592d.sendEmptyMessage(K3.k.zxing_camera_closed);
            h.this.f33589a.b();
        }
    }

    public h(Context context) {
        u.validateMainThread();
        this.f33589a = m.getInstance();
        i iVar = new i(context);
        this.f33591c = iVar;
        iVar.setCameraSettings(this.f33597i);
        this.f33596h = new Handler();
    }

    public j4.s m() {
        return this.f33591c.getPreviewSize();
    }

    public /* synthetic */ void n(j jVar) {
        this.f33591c.changeCameraParameters(jVar);
    }

    public /* synthetic */ void o(r rVar) {
        this.f33591c.requestPreviewFrame(rVar);
    }

    public /* synthetic */ void p(final r rVar) {
        if (this.f33594f) {
            this.f33589a.c(new Runnable() { // from class: k4.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33586a.o(rVar);
                }
            });
        }
    }

    public /* synthetic */ void q(boolean z8) {
        this.f33591c.setTorch(z8);
    }

    public void r(Exception exc) {
        Handler handler = this.f33592d;
        if (handler != null) {
            handler.obtainMessage(K3.k.zxing_camera_error, exc).sendToTarget();
        }
    }

    private void s() {
        if (!this.f33594f) {
            throw new IllegalStateException("CameraInstance is not open");
        }
    }

    public void changeCameraParameters(final j jVar) {
        u.validateMainThread();
        if (this.f33594f) {
            this.f33589a.c(new Runnable(jVar) { // from class: k4.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33585a.n(null);
                }
            });
        }
    }

    public void close() {
        u.validateMainThread();
        if (this.f33594f) {
            this.f33589a.c(this.f33601m);
        } else {
            this.f33595g = true;
        }
        this.f33594f = false;
    }

    public void configureCamera() {
        u.validateMainThread();
        s();
        this.f33589a.c(this.f33599k);
    }

    public int getCameraRotation() {
        return this.f33591c.getCameraRotation();
    }

    public k getCameraSettings() {
        return this.f33597i;
    }

    public o getDisplayConfiguration() {
        return this.f33593e;
    }

    public boolean isCameraClosed() {
        return this.f33595g;
    }

    public boolean isOpen() {
        return this.f33594f;
    }

    public void open() {
        u.validateMainThread();
        this.f33594f = true;
        this.f33595g = false;
        this.f33589a.d(this.f33598j);
    }

    public void requestPreview(final r rVar) {
        this.f33596h.post(new Runnable() { // from class: k4.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f33581a.p(rVar);
            }
        });
    }

    public void setCameraSettings(k kVar) {
        if (this.f33594f) {
            return;
        }
        this.f33597i = kVar;
        this.f33591c.setCameraSettings(kVar);
    }

    public void setDisplayConfiguration(o oVar) {
        this.f33593e = oVar;
        this.f33591c.setDisplayConfiguration(oVar);
    }

    public void setReadyHandler(Handler handler) {
        this.f33592d = handler;
    }

    public void setSurface(l lVar) {
        this.f33590b = lVar;
    }

    public void setSurfaceHolder(SurfaceHolder surfaceHolder) {
        setSurface(new l(surfaceHolder));
    }

    public void setTorch(final boolean z8) {
        u.validateMainThread();
        if (this.f33594f) {
            this.f33589a.c(new Runnable() { // from class: k4.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33583a.q(z8);
                }
            });
        }
    }

    public void startPreview() {
        u.validateMainThread();
        s();
        this.f33589a.c(this.f33600l);
    }

    public h(i iVar) {
        u.validateMainThread();
        this.f33591c = iVar;
    }
}
