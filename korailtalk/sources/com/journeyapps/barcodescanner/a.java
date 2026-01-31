package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import j4.n;
import j4.o;
import j4.s;
import j4.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k4.h;
import k4.j;
import k4.k;
import k4.l;
import k4.p;
import k4.q;

/* loaded from: classes2.dex */
public class a extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    private static final String f27476A = "a";

    /* renamed from: a, reason: collision with root package name */
    private h f27477a;

    /* renamed from: b, reason: collision with root package name */
    private WindowManager f27478b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f27479c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f27480d;

    /* renamed from: e, reason: collision with root package name */
    private SurfaceView f27481e;

    /* renamed from: f, reason: collision with root package name */
    private TextureView f27482f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f27483g;

    /* renamed from: h, reason: collision with root package name */
    private o f27484h;

    /* renamed from: i, reason: collision with root package name */
    private int f27485i;

    /* renamed from: j, reason: collision with root package name */
    private List f27486j;

    /* renamed from: k, reason: collision with root package name */
    private k4.o f27487k;

    /* renamed from: l, reason: collision with root package name */
    private k f27488l;

    /* renamed from: m, reason: collision with root package name */
    private s f27489m;

    /* renamed from: n, reason: collision with root package name */
    private s f27490n;

    /* renamed from: o, reason: collision with root package name */
    private Rect f27491o;

    /* renamed from: p, reason: collision with root package name */
    private s f27492p;

    /* renamed from: q, reason: collision with root package name */
    private Rect f27493q;

    /* renamed from: r, reason: collision with root package name */
    private Rect f27494r;

    /* renamed from: s, reason: collision with root package name */
    private s f27495s;

    /* renamed from: t, reason: collision with root package name */
    private double f27496t;

    /* renamed from: u, reason: collision with root package name */
    private k4.s f27497u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f27498v;

    /* renamed from: w, reason: collision with root package name */
    private final SurfaceHolder.Callback f27499w;

    /* renamed from: x, reason: collision with root package name */
    private final Handler.Callback f27500x;

    /* renamed from: y, reason: collision with root package name */
    private n f27501y;

    /* renamed from: z, reason: collision with root package name */
    private final f f27502z;

    /* renamed from: com.journeyapps.barcodescanner.a$a, reason: collision with other inner class name */
    class TextureViewSurfaceTextureListenerC0227a implements TextureView.SurfaceTextureListener {
        TextureViewSurfaceTextureListenerC0227a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i8, int i9) {
            onSurfaceTextureSizeChanged(surfaceTexture, i8, i9);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i8, int i9) {
            a.this.f27492p = new s(i8, i9);
            a.this.w();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    class b implements SurfaceHolder.Callback {
        b() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i8, int i9, int i10) {
            if (surfaceHolder == null) {
                Log.e(a.f27476A, "*** WARNING *** surfaceChanged() gave us a null surface!");
                return;
            }
            a.this.f27492p = new s(i9, i10);
            a.this.w();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            a.this.f27492p = null;
        }
    }

    class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == K3.k.zxing_prewiew_size_ready) {
                a.this.r((s) message.obj);
                return true;
            }
            if (i8 != K3.k.zxing_camera_error) {
                if (i8 != K3.k.zxing_camera_closed) {
                    return false;
                }
                a.this.f27502z.cameraClosed();
                return false;
            }
            Exception exc = (Exception) message.obj;
            if (!a.this.q()) {
                return false;
            }
            a.this.pause();
            a.this.f27502z.cameraError(exc);
            return false;
        }
    }

    class d implements n {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            a.this.t();
        }

        @Override // j4.n
        public void onRotationChanged(int i8) {
            a.this.f27479c.postDelayed(new Runnable() { // from class: com.journeyapps.barcodescanner.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27508a.b();
                }
            }, 250L);
        }
    }

    class e implements f {
        e() {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void cameraClosed() {
            Iterator it = a.this.f27486j.iterator();
            while (it.hasNext()) {
                ((f) it.next()).cameraClosed();
            }
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void cameraError(Exception exc) {
            Iterator it = a.this.f27486j.iterator();
            while (it.hasNext()) {
                ((f) it.next()).cameraError(exc);
            }
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void previewSized() {
            Iterator it = a.this.f27486j.iterator();
            while (it.hasNext()) {
                ((f) it.next()).previewSized();
            }
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void previewStarted() {
            Iterator it = a.this.f27486j.iterator();
            while (it.hasNext()) {
                ((f) it.next()).previewStarted();
            }
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void previewStopped() {
            Iterator it = a.this.f27486j.iterator();
            while (it.hasNext()) {
                ((f) it.next()).previewStopped();
            }
        }
    }

    public interface f {
        void cameraClosed();

        void cameraError(Exception exc);

        void previewSized();

        void previewStarted();

        void previewStopped();
    }

    public a(Context context) {
        super(context);
        this.f27480d = false;
        this.f27483g = false;
        this.f27485i = -1;
        this.f27486j = new ArrayList();
        this.f27488l = new k();
        this.f27493q = null;
        this.f27494r = null;
        this.f27495s = null;
        this.f27496t = 0.1d;
        this.f27497u = null;
        this.f27498v = false;
        this.f27499w = new b();
        this.f27500x = new c();
        this.f27501y = new d();
        this.f27502z = new e();
        o(context, null, 0, 0);
    }

    private int getDisplayRotation() {
        return this.f27478b.getDefaultDisplay().getRotation();
    }

    private void i() {
        s sVar;
        k4.o oVar;
        s sVar2 = this.f27489m;
        if (sVar2 == null || (sVar = this.f27490n) == null || (oVar = this.f27487k) == null) {
            this.f27494r = null;
            this.f27493q = null;
            this.f27491o = null;
            throw new IllegalStateException("containerSize or previewSize is not set yet");
        }
        int i8 = sVar.width;
        int i9 = sVar.height;
        int i10 = sVar2.width;
        int i11 = sVar2.height;
        Rect rectScalePreview = oVar.scalePreview(sVar);
        if (rectScalePreview.width() <= 0 || rectScalePreview.height() <= 0) {
            return;
        }
        this.f27491o = rectScalePreview;
        this.f27493q = j(new Rect(0, 0, i10, i11), this.f27491o);
        Rect rect = new Rect(this.f27493q);
        Rect rect2 = this.f27491o;
        rect.offset(-rect2.left, -rect2.top);
        Rect rect3 = new Rect((rect.left * i8) / this.f27491o.width(), (rect.top * i9) / this.f27491o.height(), (rect.right * i8) / this.f27491o.width(), (rect.bottom * i9) / this.f27491o.height());
        this.f27494r = rect3;
        if (rect3.width() > 0 && this.f27494r.height() > 0) {
            this.f27502z.previewSized();
            return;
        }
        this.f27494r = null;
        this.f27493q = null;
        Log.w(f27476A, "Preview frame is too small");
    }

    private void l(s sVar) {
        this.f27489m = sVar;
        h hVar = this.f27477a;
        if (hVar == null || hVar.getDisplayConfiguration() != null) {
            return;
        }
        k4.o oVar = new k4.o(getDisplayRotation(), sVar);
        this.f27487k = oVar;
        oVar.setPreviewScalingStrategy(getPreviewScalingStrategy());
        this.f27477a.setDisplayConfiguration(this.f27487k);
        this.f27477a.configureCamera();
        boolean z8 = this.f27498v;
        if (z8) {
            this.f27477a.setTorch(z8);
        }
    }

    private void n() {
        if (this.f27477a != null) {
            Log.w(f27476A, "initCamera called twice");
            return;
        }
        h hVarM = m();
        this.f27477a = hVarM;
        hVarM.setReadyHandler(this.f27479c);
        this.f27477a.open();
        this.f27485i = getDisplayRotation();
    }

    private void o(Context context, AttributeSet attributeSet, int i8, int i9) {
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        p(attributeSet);
        this.f27478b = (WindowManager) context.getSystemService("window");
        this.f27479c = new Handler(this.f27500x);
        this.f27484h = new o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(s sVar) {
        this.f27490n = sVar;
        if (this.f27489m != null) {
            i();
            requestLayout();
            w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (!q() || getDisplayRotation() == this.f27485i) {
            return;
        }
        pause();
        resume();
    }

    private void u() {
        if (this.f27480d) {
            TextureView textureView = new TextureView(getContext());
            this.f27482f = textureView;
            textureView.setSurfaceTextureListener(x());
            addView(this.f27482f);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.f27481e = surfaceView;
        surfaceView.getHolder().addCallback(this.f27499w);
        addView(this.f27481e);
    }

    private void v(l lVar) {
        if (this.f27483g || this.f27477a == null) {
            return;
        }
        this.f27477a.setSurface(lVar);
        this.f27477a.startPreview();
        this.f27483g = true;
        s();
        this.f27502z.previewStarted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        Rect rect;
        s sVar = this.f27492p;
        if (sVar == null || this.f27490n == null || (rect = this.f27491o) == null) {
            return;
        }
        if (this.f27481e != null && sVar.equals(new s(rect.width(), this.f27491o.height()))) {
            v(new l(this.f27481e.getHolder()));
            return;
        }
        TextureView textureView = this.f27482f;
        if (textureView == null || textureView.getSurfaceTexture() == null) {
            return;
        }
        if (this.f27490n != null) {
            this.f27482f.setTransform(k(new s(this.f27482f.getWidth(), this.f27482f.getHeight()), this.f27490n));
        }
        v(new l(this.f27482f.getSurfaceTexture()));
    }

    private TextureView.SurfaceTextureListener x() {
        return new TextureViewSurfaceTextureListenerC0227a();
    }

    public void addStateListener(f fVar) {
        this.f27486j.add(fVar);
    }

    public void changeCameraParameters(j jVar) {
        h hVar = this.f27477a;
        if (hVar != null) {
            hVar.changeCameraParameters(jVar);
        }
    }

    public h getCameraInstance() {
        return this.f27477a;
    }

    public k getCameraSettings() {
        return this.f27488l;
    }

    public Rect getFramingRect() {
        return this.f27493q;
    }

    public s getFramingRectSize() {
        return this.f27495s;
    }

    public double getMarginFraction() {
        return this.f27496t;
    }

    public Rect getPreviewFramingRect() {
        return this.f27494r;
    }

    public k4.s getPreviewScalingStrategy() {
        k4.s sVar = this.f27497u;
        return sVar != null ? sVar : this.f27482f != null ? new k4.n() : new p();
    }

    public s getPreviewSize() {
        return this.f27490n;
    }

    public boolean isCameraClosed() {
        h hVar = this.f27477a;
        return hVar == null || hVar.isCameraClosed();
    }

    public boolean isPreviewActive() {
        return this.f27483g;
    }

    public boolean isUseTextureView() {
        return this.f27480d;
    }

    protected Rect j(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        if (this.f27495s != null) {
            rect3.inset(Math.max(0, (rect3.width() - this.f27495s.width) / 2), Math.max(0, (rect3.height() - this.f27495s.height) / 2));
            return rect3;
        }
        int iMin = (int) Math.min(rect3.width() * this.f27496t, rect3.height() * this.f27496t);
        rect3.inset(iMin, iMin);
        if (rect3.height() > rect3.width()) {
            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
        }
        return rect3;
    }

    protected Matrix k(s sVar, s sVar2) {
        float f8;
        float f9 = sVar.width / sVar.height;
        float f10 = sVar2.width / sVar2.height;
        float f11 = 1.0f;
        if (f9 < f10) {
            float f12 = f10 / f9;
            f8 = 1.0f;
            f11 = f12;
        } else {
            f8 = f9 / f10;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f11, f8);
        int i8 = sVar.width;
        int i9 = sVar.height;
        matrix.postTranslate((i8 - (i8 * f11)) / 2.0f, (i9 - (i9 * f8)) / 2.0f);
        return matrix;
    }

    protected h m() {
        h hVar = new h(getContext());
        hVar.setCameraSettings(this.f27488l);
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        l(new s(i10 - i8, i11 - i9));
        SurfaceView surfaceView = this.f27481e;
        if (surfaceView == null) {
            TextureView textureView = this.f27482f;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
                return;
            }
            return;
        }
        Rect rect = this.f27491o;
        if (rect == null) {
            surfaceView.layout(0, 0, getWidth(), getHeight());
        } else {
            surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", parcelableOnSaveInstanceState);
        bundle.putBoolean("torch", this.f27498v);
        return bundle;
    }

    protected void p(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, K3.o.zxing_camera_preview);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(K3.o.zxing_camera_preview_zxing_framing_rect_width, -1.0f);
        int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(K3.o.zxing_camera_preview_zxing_framing_rect_height, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.f27495s = new s(dimension, dimension2);
        }
        this.f27480d = typedArrayObtainStyledAttributes.getBoolean(K3.o.zxing_camera_preview_zxing_use_texture_view, true);
        int integer = typedArrayObtainStyledAttributes.getInteger(K3.o.zxing_camera_preview_zxing_preview_scaling_strategy, -1);
        if (integer == 1) {
            this.f27497u = new k4.n();
        } else if (integer == 2) {
            this.f27497u = new p();
        } else if (integer == 3) {
            this.f27497u = new q();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void pause() {
        TextureView textureView;
        SurfaceView surfaceView;
        u.validateMainThread();
        this.f27485i = -1;
        h hVar = this.f27477a;
        if (hVar != null) {
            hVar.close();
            this.f27477a = null;
            this.f27483g = false;
        } else {
            this.f27479c.sendEmptyMessage(K3.k.zxing_camera_closed);
        }
        if (this.f27492p == null && (surfaceView = this.f27481e) != null) {
            surfaceView.getHolder().removeCallback(this.f27499w);
        }
        if (this.f27492p == null && (textureView = this.f27482f) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.f27489m = null;
        this.f27490n = null;
        this.f27494r = null;
        this.f27484h.stop();
        this.f27502z.previewStopped();
    }

    public void pauseAndWait() throws InterruptedException {
        h cameraInstance = getCameraInstance();
        pause();
        long jNanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.isCameraClosed() && System.nanoTime() - jNanoTime <= 2000000000) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    protected boolean q() {
        return this.f27477a != null;
    }

    public void resume() {
        u.validateMainThread();
        n();
        if (this.f27492p != null) {
            w();
        } else {
            SurfaceView surfaceView = this.f27481e;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.f27499w);
            } else {
                TextureView textureView = this.f27482f;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        x().onSurfaceTextureAvailable(this.f27482f.getSurfaceTexture(), this.f27482f.getWidth(), this.f27482f.getHeight());
                    } else {
                        this.f27482f.setSurfaceTextureListener(x());
                    }
                }
            }
        }
        requestLayout();
        this.f27484h.listen(getContext(), this.f27501y);
    }

    protected void s() {
    }

    public void setCameraSettings(k kVar) {
        this.f27488l = kVar;
    }

    public void setFramingRectSize(s sVar) {
        this.f27495s = sVar;
    }

    public void setMarginFraction(double d9) {
        if (d9 >= 0.5d) {
            throw new IllegalArgumentException("The margin fraction must be less than 0.5");
        }
        this.f27496t = d9;
    }

    public void setPreviewScalingStrategy(k4.s sVar) {
        this.f27497u = sVar;
    }

    public void setTorch(boolean z8) {
        this.f27498v = z8;
        h hVar = this.f27477a;
        if (hVar != null) {
            hVar.setTorch(z8);
        }
    }

    public void setUseTextureView(boolean z8) {
        this.f27480d = z8;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27480d = false;
        this.f27483g = false;
        this.f27485i = -1;
        this.f27486j = new ArrayList();
        this.f27488l = new k();
        this.f27493q = null;
        this.f27494r = null;
        this.f27495s = null;
        this.f27496t = 0.1d;
        this.f27497u = null;
        this.f27498v = false;
        this.f27499w = new b();
        this.f27500x = new c();
        this.f27501y = new d();
        this.f27502z = new e();
        o(context, attributeSet, 0, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f27480d = false;
        this.f27483g = false;
        this.f27485i = -1;
        this.f27486j = new ArrayList();
        this.f27488l = new k();
        this.f27493q = null;
        this.f27494r = null;
        this.f27495s = null;
        this.f27496t = 0.1d;
        this.f27497u = null;
        this.f27498v = false;
        this.f27499w = new b();
        this.f27500x = new c();
        this.f27501y = new d();
        this.f27502z = new e();
        o(context, attributeSet, i8, 0);
    }
}
