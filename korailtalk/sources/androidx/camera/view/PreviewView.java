package androidx.camera.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.B0;
import androidx.camera.core.G0;
import androidx.camera.core.K0;
import androidx.camera.core.g1;
import androidx.camera.core.t1;
import androidx.camera.view.l;
import androidx.core.view.AbstractC0985p0;
import androidx.lifecycle.LiveData;
import java.util.concurrent.atomic.AtomicReference;
import z.InterfaceC6552A;
import z.InterfaceC6553B;

/* loaded from: classes.dex */
public final class PreviewView extends FrameLayout {

    /* renamed from: k */
    private static final c f7938k = c.PERFORMANCE;

    /* renamed from: a */
    c f7939a;

    /* renamed from: b */
    l f7940b;

    /* renamed from: c */
    final androidx.camera.view.f f7941c;

    /* renamed from: d */
    final androidx.lifecycle.t f7942d;

    /* renamed from: e */
    final AtomicReference f7943e;

    /* renamed from: f */
    m f7944f;

    /* renamed from: g */
    private final ScaleGestureDetector f7945g;

    /* renamed from: h */
    private MotionEvent f7946h;

    /* renamed from: i */
    private final View.OnLayoutChangeListener f7947i;

    /* renamed from: j */
    final K0.d f7948j;

    class a implements K0.d {
        a() {
        }

        public /* synthetic */ void d(g1 g1Var) {
            PreviewView.this.f7948j.onSurfaceRequested(g1Var);
        }

        public /* synthetic */ void e(InterfaceC6553B interfaceC6553B, g1 g1Var, g1.g gVar) {
            B0.d("PreviewView", "Preview transformation info updated. " + gVar);
            PreviewView.this.f7941c.o(gVar, g1Var.getResolution(), interfaceC6553B.getCameraInfoInternal().getLensFacing().intValue() == 0);
            PreviewView.this.d();
        }

        public /* synthetic */ void f(androidx.camera.view.e eVar, InterfaceC6553B interfaceC6553B) {
            if (h.a(PreviewView.this.f7943e, eVar, null)) {
                eVar.j(f.IDLE);
            }
            eVar.e();
            interfaceC6553B.getCameraState().removeObserver(eVar);
        }

        @Override // androidx.camera.core.K0.d
        public void onSurfaceRequested(final g1 g1Var) {
            l rVar;
            if (!androidx.camera.core.impl.utils.m.isMainThread()) {
                androidx.core.content.a.getMainExecutor(PreviewView.this.getContext()).execute(new Runnable() { // from class: androidx.camera.view.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7984a.d(g1Var);
                    }
                });
                return;
            }
            B0.d("PreviewView", "Surface requested by Preview.");
            final InterfaceC6553B camera = g1Var.getCamera();
            g1Var.setTransformationInfoListener(androidx.core.content.a.getMainExecutor(PreviewView.this.getContext()), new g1.h() { // from class: androidx.camera.view.j
                @Override // androidx.camera.core.g1.h
                public final void onTransformationInfoUpdate(g1.g gVar) {
                    this.f7986a.e(camera, g1Var, gVar);
                }
            });
            PreviewView previewView = PreviewView.this;
            if (PreviewView.e(g1Var, previewView.f7939a)) {
                PreviewView previewView2 = PreviewView.this;
                rVar = new y(previewView2, previewView2.f7941c);
            } else {
                PreviewView previewView3 = PreviewView.this;
                rVar = new r(previewView3, previewView3.f7941c);
            }
            previewView.f7940b = rVar;
            InterfaceC6552A cameraInfoInternal = camera.getCameraInfoInternal();
            PreviewView previewView4 = PreviewView.this;
            final androidx.camera.view.e eVar = new androidx.camera.view.e(cameraInfoInternal, previewView4.f7942d, previewView4.f7940b);
            PreviewView.this.f7943e.set(eVar);
            camera.getCameraState().addObserver(androidx.core.content.a.getMainExecutor(PreviewView.this.getContext()), eVar);
            PreviewView.this.f7940b.g(g1Var, new l.a() { // from class: androidx.camera.view.k
                @Override // androidx.camera.view.l.a
                public final void onSurfaceNotInUse() {
                    this.f7989a.f(eVar, camera);
                }
            });
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f7950a;

        /* renamed from: b */
        static final /* synthetic */ int[] f7951b;

        static {
            int[] iArr = new int[c.values().length];
            f7951b = iArr;
            try {
                iArr[c.COMPATIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7951b[c.PERFORMANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[e.values().length];
            f7950a = iArr2;
            try {
                iArr2[e.FILL_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7950a[e.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7950a[e.FILL_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7950a[e.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7950a[e.FIT_CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7950a[e.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public enum c {
        PERFORMANCE(0),
        COMPATIBLE(1);


        /* renamed from: a */
        private final int f7953a;

        c(int i8) {
            this.f7953a = i8;
        }

        static c a(int i8) {
            for (c cVar : values()) {
                if (cVar.f7953a == i8) {
                    return cVar;
                }
            }
            throw new IllegalArgumentException("Unknown implementation mode id " + i8);
        }

        int b() {
            return this.f7953a;
        }
    }

    class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        d() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            PreviewView.this.getClass();
            return true;
        }
    }

    public enum e {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);


        /* renamed from: a */
        private final int f7956a;

        e(int i8) {
            this.f7956a = i8;
        }

        static e a(int i8) {
            for (e eVar : values()) {
                if (eVar.f7956a == i8) {
                    return eVar;
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + i8);
        }

        int b() {
            return this.f7956a;
        }
    }

    public enum f {
        IDLE,
        STREAMING
    }

    public PreviewView(Context context) {
        this(context, null);
    }

    private void b(boolean z8) {
        androidx.camera.core.impl.utils.m.checkMainThread();
        getDisplay();
        getViewPort();
    }

    public /* synthetic */ void c(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i10 - i8 == i14 - i12 && i11 - i9 == i15 - i13) {
            return;
        }
        d();
        b(true);
    }

    static boolean e(g1 g1Var, c cVar) {
        int i8;
        boolean zEquals = g1Var.getCamera().getCameraInfoInternal().getImplementationType().equals(androidx.camera.core.r.IMPLEMENTATION_TYPE_CAMERA2_LEGACY);
        boolean z8 = (L.a.get(L.d.class) == null && L.a.get(L.c.class) == null) ? false : true;
        if (g1Var.isRGBA8888Required() || Build.VERSION.SDK_INT <= 24 || zEquals || z8 || (i8 = b.f7951b[cVar.ordinal()]) == 1) {
            return true;
        }
        if (i8 == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + cVar);
    }

    private int getViewPortScaleType() {
        switch (b.f7950a[getScaleType().ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 0;
            case 4:
            case 5:
            case 6:
                return 3;
            default:
                throw new IllegalStateException("Unexpected scale type: " + getScaleType());
        }
    }

    void d() {
        androidx.camera.core.impl.utils.m.checkMainThread();
        l lVar = this.f7940b;
        if (lVar != null) {
            lVar.h();
        }
        this.f7944f.b(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    public Bitmap getBitmap() {
        androidx.camera.core.impl.utils.m.checkMainThread();
        l lVar = this.f7940b;
        if (lVar == null) {
            return null;
        }
        return lVar.a();
    }

    public androidx.camera.view.a getController() {
        androidx.camera.core.impl.utils.m.checkMainThread();
        return null;
    }

    public c getImplementationMode() {
        androidx.camera.core.impl.utils.m.checkMainThread();
        return this.f7939a;
    }

    public G0 getMeteringPointFactory() {
        androidx.camera.core.impl.utils.m.checkMainThread();
        return this.f7944f;
    }

    public M.a getOutputTransform() {
        Matrix matrixH;
        androidx.camera.core.impl.utils.m.checkMainThread();
        try {
            matrixH = this.f7941c.h(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixH = null;
        }
        Rect rectG = this.f7941c.g();
        if (matrixH == null || rectG == null) {
            B0.d("PreviewView", "Transform info is not ready");
            return null;
        }
        matrixH.preConcat(z.getNormalizedToBuffer(rectG));
        if (this.f7940b instanceof y) {
            matrixH.postConcat(getMatrix());
        } else {
            B0.w("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        return new M.a(matrixH, new Size(rectG.width(), rectG.height()));
    }

    public LiveData getPreviewStreamState() {
        return this.f7942d;
    }

    public e getScaleType() {
        androidx.camera.core.impl.utils.m.checkMainThread();
        return this.f7941c.f();
    }

    public K0.d getSurfaceProvider() {
        androidx.camera.core.impl.utils.m.checkMainThread();
        return this.f7948j;
    }

    public t1 getViewPort() {
        androidx.camera.core.impl.utils.m.checkMainThread();
        if (getDisplay() == null) {
            return null;
        }
        return getViewPort(getDisplay().getRotation());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        addOnLayoutChangeListener(this.f7947i);
        l lVar = this.f7940b;
        if (lVar != null) {
            lVar.d();
        }
        b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f7947i);
        l lVar = this.f7940b;
        if (lVar != null) {
            lVar.e();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        this.f7946h = null;
        return super.performClick();
    }

    public void setController(androidx.camera.view.a aVar) {
        androidx.camera.core.impl.utils.m.checkMainThread();
        b(false);
    }

    public void setImplementationMode(c cVar) {
        androidx.camera.core.impl.utils.m.checkMainThread();
        this.f7939a = cVar;
    }

    public void setScaleType(e eVar) {
        androidx.camera.core.impl.utils.m.checkMainThread();
        this.f7941c.n(eVar);
        d();
        b(false);
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        c cVar = f7938k;
        this.f7939a = cVar;
        androidx.camera.view.f fVar = new androidx.camera.view.f();
        this.f7941c = fVar;
        this.f7942d = new androidx.lifecycle.t(f.IDLE);
        this.f7943e = new AtomicReference();
        this.f7944f = new m(fVar);
        this.f7947i = new View.OnLayoutChangeListener() { // from class: androidx.camera.view.g
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                this.f7983a.c(view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        };
        this.f7948j = new a();
        androidx.camera.core.impl.utils.m.checkMainThread();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, n.PreviewView, i8, i9);
        AbstractC0985p0.saveAttributeDataForStyleable(this, context, n.PreviewView, attributeSet, typedArrayObtainStyledAttributes, i8, i9);
        try {
            setScaleType(e.a(typedArrayObtainStyledAttributes.getInteger(n.PreviewView_scaleType, fVar.f().b())));
            setImplementationMode(c.a(typedArrayObtainStyledAttributes.getInteger(n.PreviewView_implementationMode, cVar.b())));
            typedArrayObtainStyledAttributes.recycle();
            this.f7945g = new ScaleGestureDetector(context, new d());
            if (getBackground() == null) {
                setBackgroundColor(androidx.core.content.a.getColor(getContext(), R.color.black));
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public t1 getViewPort(int i8) {
        androidx.camera.core.impl.utils.m.checkMainThread();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new t1.a(new Rational(getWidth(), getHeight()), i8).setScaleType(getViewPortScaleType()).setLayoutDirection(getLayoutDirection()).build();
    }
}
