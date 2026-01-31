package com.airbnb.lottie;

import T0.AbstractC0786c;
import T0.B;
import T0.C0784a;
import T0.E;
import T0.G;
import T0.InterfaceC0785b;
import T0.u;
import T0.y;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import b1.C1065c;
import d1.v;
import g1.C5535b;
import g1.C5536c;
import g1.InterfaceC5538e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class p extends Drawable implements Drawable.Callback, Animatable {
    public static final int INFINITE = -1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;

    /* renamed from: A */
    private Rect f11643A;

    /* renamed from: B */
    private RectF f11644B;

    /* renamed from: C */
    private Paint f11645C;

    /* renamed from: D */
    private Rect f11646D;

    /* renamed from: E */
    private Rect f11647E;

    /* renamed from: F */
    private RectF f11648F;

    /* renamed from: G */
    private RectF f11649G;

    /* renamed from: H */
    private Matrix f11650H;

    /* renamed from: I */
    private Matrix f11651I;

    /* renamed from: J */
    private boolean f11652J;

    /* renamed from: a */
    private T0.h f11653a;

    /* renamed from: b */
    private final f1.g f11654b;

    /* renamed from: c */
    private boolean f11655c;

    /* renamed from: d */
    private boolean f11656d;

    /* renamed from: e */
    private boolean f11657e;

    /* renamed from: f */
    private d f11658f;

    /* renamed from: g */
    private final ArrayList f11659g;

    /* renamed from: h */
    private final ValueAnimator.AnimatorUpdateListener f11660h;

    /* renamed from: i */
    private X0.b f11661i;

    /* renamed from: j */
    private String f11662j;

    /* renamed from: k */
    private X0.a f11663k;

    /* renamed from: l */
    C0784a f11664l;

    /* renamed from: m */
    G f11665m;

    /* renamed from: n */
    private boolean f11666n;

    /* renamed from: o */
    private boolean f11667o;

    /* renamed from: p */
    private boolean f11668p;

    /* renamed from: q */
    private C1065c f11669q;

    /* renamed from: r */
    private int f11670r;

    /* renamed from: s */
    private boolean f11671s;

    /* renamed from: t */
    private boolean f11672t;

    /* renamed from: u */
    private boolean f11673u;

    /* renamed from: v */
    private E f11674v;

    /* renamed from: w */
    private boolean f11675w;

    /* renamed from: x */
    private final Matrix f11676x;

    /* renamed from: y */
    private Bitmap f11677y;

    /* renamed from: z */
    private Canvas f11678z;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (p.this.f11669q != null) {
                p.this.f11669q.setProgress(p.this.f11654b.getAnimatedValueAbsolute());
            }
        }
    }

    class b extends C5536c {
        b(InterfaceC5538e interfaceC5538e) {
        }

        @Override // g1.C5536c
        public T getValue(C5535b c5535b) {
            throw null;
        }
    }

    interface c {
        void run(T0.h hVar);
    }

    private enum d {
        NONE,
        PLAY,
        RESUME
    }

    public p() {
        f1.g gVar = new f1.g();
        this.f11654b = gVar;
        this.f11655c = true;
        this.f11656d = false;
        this.f11657e = false;
        this.f11658f = d.NONE;
        this.f11659g = new ArrayList();
        a aVar = new a();
        this.f11660h = aVar;
        this.f11667o = false;
        this.f11668p = true;
        this.f11670r = 255;
        this.f11674v = E.AUTOMATIC;
        this.f11675w = false;
        this.f11676x = new Matrix();
        this.f11652J = false;
        gVar.addUpdateListener(aVar);
    }

    private X0.a A() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f11663k == null) {
            this.f11663k = new X0.a(getCallback(), this.f11664l);
        }
        return this.f11663k;
    }

    private X0.b B() {
        if (getCallback() == null) {
            return null;
        }
        X0.b bVar = this.f11661i;
        if (bVar != null && !bVar.hasSameContext(z())) {
            this.f11661i = null;
        }
        if (this.f11661i == null) {
            this.f11661i = new X0.b(getCallback(), this.f11662j, null, this.f11653a.getImages());
        }
        return this.f11661i;
    }

    private boolean C() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        if (((View) callback).getParent() instanceof ViewGroup) {
            return !((ViewGroup) r0).getClipChildren();
        }
        return false;
    }

    public /* synthetic */ void E(Y0.e eVar, Object obj, C5536c c5536c, T0.h hVar) {
        addValueCallback(eVar, (Y0.e) obj, c5536c);
    }

    public /* synthetic */ void F(T0.h hVar) {
        playAnimation();
    }

    public /* synthetic */ void G(T0.h hVar) {
        resumeAnimation();
    }

    public /* synthetic */ void H(int i8, T0.h hVar) {
        setFrame(i8);
    }

    public /* synthetic */ void I(int i8, T0.h hVar) {
        setMaxFrame(i8);
    }

    public /* synthetic */ void J(String str, T0.h hVar) {
        setMaxFrame(str);
    }

    public /* synthetic */ void K(float f8, T0.h hVar) {
        setMaxProgress(f8);
    }

    public /* synthetic */ void L(int i8, int i9, T0.h hVar) {
        setMinAndMaxFrame(i8, i9);
    }

    public /* synthetic */ void M(String str, T0.h hVar) {
        setMinAndMaxFrame(str);
    }

    public /* synthetic */ void N(String str, String str2, boolean z8, T0.h hVar) {
        setMinAndMaxFrame(str, str2, z8);
    }

    public /* synthetic */ void O(float f8, float f9, T0.h hVar) {
        setMinAndMaxProgress(f8, f9);
    }

    public /* synthetic */ void P(int i8, T0.h hVar) {
        setMinFrame(i8);
    }

    public /* synthetic */ void Q(String str, T0.h hVar) {
        setMinFrame(str);
    }

    public /* synthetic */ void R(float f8, T0.h hVar) {
        setMinProgress(f8);
    }

    public /* synthetic */ void S(float f8, T0.h hVar) {
        setProgress(f8);
    }

    private void T(Canvas canvas, C1065c c1065c) {
        if (this.f11653a == null || c1065c == null) {
            return;
        }
        y();
        canvas.getMatrix(this.f11650H);
        canvas.getClipBounds(this.f11643A);
        u(this.f11643A, this.f11644B);
        this.f11650H.mapRect(this.f11644B);
        v(this.f11644B, this.f11643A);
        if (this.f11668p) {
            this.f11649G.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            c1065c.getBounds(this.f11649G, null, false);
        }
        this.f11650H.mapRect(this.f11649G);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        U(this.f11649G, fWidth, fHeight);
        if (!C()) {
            RectF rectF = this.f11649G;
            Rect rect = this.f11643A;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.f11649G.width());
        int iCeil2 = (int) Math.ceil(this.f11649G.height());
        if (iCeil == 0 || iCeil2 == 0) {
            return;
        }
        x(iCeil, iCeil2);
        if (this.f11652J) {
            this.f11676x.set(this.f11650H);
            this.f11676x.preScale(fWidth, fHeight);
            Matrix matrix = this.f11676x;
            RectF rectF2 = this.f11649G;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.f11677y.eraseColor(0);
            c1065c.draw(this.f11678z, this.f11676x, this.f11670r);
            this.f11650H.invert(this.f11651I);
            this.f11651I.mapRect(this.f11648F, this.f11649G);
            v(this.f11648F, this.f11647E);
        }
        this.f11646D.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.f11677y, this.f11646D, this.f11647E, this.f11645C);
    }

    private void U(RectF rectF, float f8, float f9) {
        rectF.set(rectF.left * f8, rectF.top * f9, rectF.right * f8, rectF.bottom * f9);
    }

    private boolean r() {
        return this.f11655c || this.f11656d;
    }

    private void s() {
        T0.h hVar = this.f11653a;
        if (hVar == null) {
            return;
        }
        C1065c c1065c = new C1065c(this, v.parse(hVar), hVar.getLayers(), hVar);
        this.f11669q = c1065c;
        if (this.f11672t) {
            c1065c.setOutlineMasksAndMattes(true);
        }
        this.f11669q.setClipToCompositionBounds(this.f11668p);
    }

    private void t() {
        T0.h hVar = this.f11653a;
        if (hVar == null) {
            return;
        }
        this.f11675w = this.f11674v.useSoftwareRendering(Build.VERSION.SDK_INT, hVar.hasDashPattern(), hVar.getMaskAndMatteCount());
    }

    private void u(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void v(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void w(Canvas canvas) {
        C1065c c1065c = this.f11669q;
        T0.h hVar = this.f11653a;
        if (c1065c == null || hVar == null) {
            return;
        }
        this.f11676x.reset();
        if (!getBounds().isEmpty()) {
            this.f11676x.preScale(r2.width() / hVar.getBounds().width(), r2.height() / hVar.getBounds().height());
        }
        c1065c.draw(canvas, this.f11676x, this.f11670r);
    }

    private void x(int i8, int i9) {
        Bitmap bitmap = this.f11677y;
        if (bitmap == null || bitmap.getWidth() < i8 || this.f11677y.getHeight() < i9) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
            this.f11677y = bitmapCreateBitmap;
            this.f11678z.setBitmap(bitmapCreateBitmap);
            this.f11652J = true;
            return;
        }
        if (this.f11677y.getWidth() > i8 || this.f11677y.getHeight() > i9) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f11677y, 0, 0, i8, i9);
            this.f11677y = bitmapCreateBitmap2;
            this.f11678z.setBitmap(bitmapCreateBitmap2);
            this.f11652J = true;
        }
    }

    private void y() {
        if (this.f11678z != null) {
            return;
        }
        this.f11678z = new Canvas();
        this.f11649G = new RectF();
        this.f11650H = new Matrix();
        this.f11651I = new Matrix();
        this.f11643A = new Rect();
        this.f11644B = new RectF();
        this.f11645C = new U0.a();
        this.f11646D = new Rect();
        this.f11647E = new Rect();
        this.f11648F = new RectF();
    }

    private Context z() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    boolean D() {
        if (isVisible()) {
            return this.f11654b.isRunning();
        }
        d dVar = this.f11658f;
        return dVar == d.PLAY || dVar == d.RESUME;
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.f11654b.addListener(animatorListener);
    }

    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f11654b.addPauseListener(animatorPauseListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f11654b.addUpdateListener(animatorUpdateListener);
    }

    public <T> void addValueCallback(final Y0.e eVar, final T t8, final C5536c c5536c) {
        C1065c c1065c = this.f11669q;
        if (c1065c == null) {
            this.f11659g.add(new c() { // from class: com.airbnb.lottie.e
                @Override // com.airbnb.lottie.p.c
                public final void run(T0.h hVar) {
                    this.f11618a.E(eVar, t8, c5536c, hVar);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (eVar == Y0.e.COMPOSITION) {
            c1065c.addValueCallback(t8, c5536c);
        } else if (eVar.getResolvedElement() != null) {
            eVar.getResolvedElement().addValueCallback(t8, c5536c);
        } else {
            List<Y0.e> listResolveKeyPath = resolveKeyPath(eVar);
            for (int i8 = 0; i8 < listResolveKeyPath.size(); i8++) {
                listResolveKeyPath.get(i8).getResolvedElement().addValueCallback(t8, c5536c);
            }
            zIsEmpty = true ^ listResolveKeyPath.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (t8 == y.TIME_REMAP) {
                setProgress(getProgress());
            }
        }
    }

    public void cancelAnimation() {
        this.f11659g.clear();
        this.f11654b.cancel();
        if (isVisible()) {
            return;
        }
        this.f11658f = d.NONE;
    }

    public void clearComposition() {
        if (this.f11654b.isRunning()) {
            this.f11654b.cancel();
            if (!isVisible()) {
                this.f11658f = d.NONE;
            }
        }
        this.f11653a = null;
        this.f11669q = null;
        this.f11661i = null;
        this.f11654b.clearComposition();
        invalidateSelf();
    }

    @Deprecated
    public void disableExtraScaleModeInFitXY() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        AbstractC0786c.beginSection("Drawable#draw");
        if (this.f11657e) {
            try {
                if (this.f11675w) {
                    T(canvas, this.f11669q);
                } else {
                    w(canvas);
                }
            } catch (Throwable th) {
                f1.f.error("Lottie crashed in draw!", th);
            }
        } else if (this.f11675w) {
            T(canvas, this.f11669q);
        } else {
            w(canvas);
        }
        this.f11652J = false;
        AbstractC0786c.endSection("Drawable#draw");
    }

    public boolean enableMergePathsForKitKatAndAbove() {
        return this.f11666n;
    }

    public void endAnimation() {
        this.f11659g.clear();
        this.f11654b.endAnimation();
        if (isVisible()) {
            return;
        }
        this.f11658f = d.NONE;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f11670r;
    }

    public Bitmap getBitmapForId(String str) {
        X0.b bVarB = B();
        if (bVarB != null) {
            return bVarB.bitmapForId(str);
        }
        return null;
    }

    public boolean getClipToCompositionBounds() {
        return this.f11668p;
    }

    public T0.h getComposition() {
        return this.f11653a;
    }

    public int getFrame() {
        return (int) this.f11654b.getFrame();
    }

    @Deprecated
    public Bitmap getImageAsset(String str) {
        X0.b bVarB = B();
        if (bVarB != null) {
            return bVarB.bitmapForId(str);
        }
        T0.h hVar = this.f11653a;
        u uVar = hVar == null ? null : hVar.getImages().get(str);
        if (uVar != null) {
            return uVar.getBitmap();
        }
        return null;
    }

    public String getImageAssetsFolder() {
        return this.f11662j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        T0.h hVar = this.f11653a;
        if (hVar == null) {
            return -1;
        }
        return hVar.getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        T0.h hVar = this.f11653a;
        if (hVar == null) {
            return -1;
        }
        return hVar.getBounds().width();
    }

    public u getLottieImageAssetForId(String str) {
        T0.h hVar = this.f11653a;
        if (hVar == null) {
            return null;
        }
        return hVar.getImages().get(str);
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f11667o;
    }

    public float getMaxFrame() {
        return this.f11654b.getMaxFrame();
    }

    public float getMinFrame() {
        return this.f11654b.getMinFrame();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public B getPerformanceTracker() {
        T0.h hVar = this.f11653a;
        if (hVar != null) {
            return hVar.getPerformanceTracker();
        }
        return null;
    }

    public float getProgress() {
        return this.f11654b.getAnimatedValueAbsolute();
    }

    public E getRenderMode() {
        return this.f11675w ? E.SOFTWARE : E.HARDWARE;
    }

    public int getRepeatCount() {
        return this.f11654b.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f11654b.getRepeatMode();
    }

    public float getSpeed() {
        return this.f11654b.getSpeed();
    }

    public G getTextDelegate() {
        return this.f11665m;
    }

    public Typeface getTypeface(String str, String str2) {
        X0.a aVarA = A();
        if (aVarA != null) {
            return aVarA.getTypeface(str, str2);
        }
        return null;
    }

    public boolean hasMasks() {
        C1065c c1065c = this.f11669q;
        return c1065c != null && c1065c.hasMasks();
    }

    public boolean hasMatte() {
        C1065c c1065c = this.f11669q;
        return c1065c != null && c1065c.hasMatte();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f11652J) {
            return;
        }
        this.f11652J = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isAnimating() {
        f1.g gVar = this.f11654b;
        if (gVar == null) {
            return false;
        }
        return gVar.isRunning();
    }

    public boolean isApplyingOpacityToLayersEnabled() {
        return this.f11673u;
    }

    public boolean isLooping() {
        return this.f11654b.getRepeatCount() == -1;
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.f11666n;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return isAnimating();
    }

    @Deprecated
    public void loop(boolean z8) {
        this.f11654b.setRepeatCount(z8 ? -1 : 0);
    }

    public void pauseAnimation() {
        this.f11659g.clear();
        this.f11654b.pauseAnimation();
        if (isVisible()) {
            return;
        }
        this.f11658f = d.NONE;
    }

    public void playAnimation() {
        if (this.f11669q == null) {
            this.f11659g.add(new c() { // from class: com.airbnb.lottie.k
                @Override // com.airbnb.lottie.p.c
                public final void run(T0.h hVar) {
                    this.f11633a.F(hVar);
                }
            });
            return;
        }
        t();
        if (r() || getRepeatCount() == 0) {
            if (isVisible()) {
                this.f11654b.playAnimation();
                this.f11658f = d.NONE;
            } else {
                this.f11658f = d.PLAY;
            }
        }
        if (r()) {
            return;
        }
        setFrame((int) (getSpeed() < 0.0f ? getMinFrame() : getMaxFrame()));
        this.f11654b.endAnimation();
        if (isVisible()) {
            return;
        }
        this.f11658f = d.NONE;
    }

    public void removeAllAnimatorListeners() {
        this.f11654b.removeAllListeners();
    }

    public void removeAllUpdateListeners() {
        this.f11654b.removeAllUpdateListeners();
        this.f11654b.addUpdateListener(this.f11660h);
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.f11654b.removeListener(animatorListener);
    }

    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f11654b.removePauseListener(animatorPauseListener);
    }

    public void removeAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f11654b.removeUpdateListener(animatorUpdateListener);
    }

    public List<Y0.e> resolveKeyPath(Y0.e eVar) {
        if (this.f11669q == null) {
            f1.f.warning("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f11669q.resolveKeyPath(eVar, 0, arrayList, new Y0.e(new String[0]));
        return arrayList;
    }

    public void resumeAnimation() {
        if (this.f11669q == null) {
            this.f11659g.add(new c() { // from class: com.airbnb.lottie.g
                @Override // com.airbnb.lottie.p.c
                public final void run(T0.h hVar) {
                    this.f11624a.G(hVar);
                }
            });
            return;
        }
        t();
        if (r() || getRepeatCount() == 0) {
            if (isVisible()) {
                this.f11654b.resumeAnimation();
                this.f11658f = d.NONE;
            } else {
                this.f11658f = d.RESUME;
            }
        }
        if (r()) {
            return;
        }
        setFrame((int) (getSpeed() < 0.0f ? getMinFrame() : getMaxFrame()));
        this.f11654b.endAnimation();
        if (isVisible()) {
            return;
        }
        this.f11658f = d.NONE;
    }

    public void reverseAnimationSpeed() {
        this.f11654b.reverseAnimationSpeed();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        this.f11670r = i8;
        invalidateSelf();
    }

    public void setApplyingOpacityToLayersEnabled(boolean z8) {
        this.f11673u = z8;
    }

    public void setClipToCompositionBounds(boolean z8) {
        if (z8 != this.f11668p) {
            this.f11668p = z8;
            C1065c c1065c = this.f11669q;
            if (c1065c != null) {
                c1065c.setClipToCompositionBounds(z8);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        f1.f.warning("Use addColorFilter instead.");
    }

    public boolean setComposition(T0.h hVar) {
        if (this.f11653a == hVar) {
            return false;
        }
        this.f11652J = true;
        clearComposition();
        this.f11653a = hVar;
        s();
        this.f11654b.setComposition(hVar);
        setProgress(this.f11654b.getAnimatedFraction());
        Iterator it = new ArrayList(this.f11659g).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar != null) {
                cVar.run(hVar);
            }
            it.remove();
        }
        this.f11659g.clear();
        hVar.setPerformanceTrackingEnabled(this.f11671s);
        t();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void setFontAssetDelegate(C0784a c0784a) {
        this.f11664l = c0784a;
        X0.a aVar = this.f11663k;
        if (aVar != null) {
            aVar.setDelegate(c0784a);
        }
    }

    public void setFrame(final int i8) {
        if (this.f11653a == null) {
            this.f11659g.add(new c() { // from class: com.airbnb.lottie.n
                @Override // com.airbnb.lottie.p.c
                public final void run(T0.h hVar) {
                    this.f11638a.H(i8, hVar);
                }
            });
        } else {
            this.f11654b.setFrame(i8);
        }
    }

    public void setIgnoreDisabledSystemAnimations(boolean z8) {
        this.f11656d = z8;
    }

    public void setImageAssetDelegate(InterfaceC0785b interfaceC0785b) {
        X0.b bVar = this.f11661i;
        if (bVar != null) {
            bVar.setDelegate(interfaceC0785b);
        }
    }

    public void setImagesAssetsFolder(String str) {
        this.f11662j = str;
    }

    public void setMaintainOriginalImageBounds(boolean z8) {
        this.f11667o = z8;
    }

    public void setMaxFrame(final int i8) {
        if (this.f11653a == null) {
            this.f11659g.add(new c() { // from class: com.airbnb.lottie.c
                @Override // com.airbnb.lottie.p.c
                public final void run(T0.h hVar) {
                    this.f11614a.I(i8, hVar);
                }
            });
        } else {
            this.f11654b.setMaxFrame(i8 + 0.99f);
        }
    }

    public void setMaxProgress(final float f8) {
        T0.h hVar = this.f11653a;
        if (hVar == null) {
            this.f11659g.add(new c() { // from class: com.airbnb.lottie.f
                @Override // com.airbnb.lottie.p.c
                public final void run(T0.h hVar2) {
                    this.f11622a.K(f8, hVar2);
                }
            });
        } else {
            this.f11654b.setMaxFrame(f1.i.lerp(hVar.getStartFrame(), this.f11653a.getEndFrame(), f8));
        }
    }

    public void setMinAndMaxFrame(final String str) {
        T0.h hVar = this.f11653a;
        if (hVar == null) {
            this.f11659g.add(new c() { // from class: com.airbnb.lottie.a
                @Override // com.airbnb.lottie.p.c
                public final void run(T0.h hVar2) {
                    this.f11609a.M(str, hVar2);
                }
            });
            return;
        }
        Y0.h marker = hVar.getMarker(str);
        if (marker != null) {
            int i8 = (int) marker.startFrame;
            setMinAndMaxFrame(i8, ((int) marker.durationFrames) + i8);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public void setMinAndMaxProgress(final float f8, final float f9) {
        T0.h hVar = this.f11653a;
        if (hVar == null) {
            this.f11659g.add(new c() { // from class: com.airbnb.lottie.o
                @Override // com.airbnb.lottie.p.c
                public final void run(T0.h hVar2) {
                    this.f11640a.O(f8, f9, hVar2);
                }
            });
        } else {
            setMinAndMaxFrame((int) f1.i.lerp(hVar.getStartFrame(), this.f11653a.getEndFrame(), f8), (int) f1.i.lerp(this.f11653a.getStartFrame(), this.f11653a.getEndFrame(), f9));
        }
    }

    public void setMinFrame(final int i8) {
        if (this.f11653a == null) {
            this.f11659g.add(new c() { // from class: com.airbnb.lottie.d
                @Override // com.airbnb.lottie.p.c
                public final void run(T0.h hVar) {
                    this.f11616a.P(i8, hVar);
                }
            });
        } else {
            this.f11654b.setMinFrame(i8);
        }
    }

    public void setMinProgress(final float f8) {
        T0.h hVar = this.f11653a;
        if (hVar == null) {
            this.f11659g.add(new c() { // from class: com.airbnb.lottie.l
                @Override // com.airbnb.lottie.p.c
                public final void run(T0.h hVar2) {
                    this.f11634a.R(f8, hVar2);
                }
            });
        } else {
            setMinFrame((int) f1.i.lerp(hVar.getStartFrame(), this.f11653a.getEndFrame(), f8));
        }
    }

    public void setOutlineMasksAndMattes(boolean z8) {
        if (this.f11672t == z8) {
            return;
        }
        this.f11672t = z8;
        C1065c c1065c = this.f11669q;
        if (c1065c != null) {
            c1065c.setOutlineMasksAndMattes(z8);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z8) {
        this.f11671s = z8;
        T0.h hVar = this.f11653a;
        if (hVar != null) {
            hVar.setPerformanceTrackingEnabled(z8);
        }
    }

    public void setProgress(final float f8) {
        if (this.f11653a == null) {
            this.f11659g.add(new c() { // from class: com.airbnb.lottie.m
                @Override // com.airbnb.lottie.p.c
                public final void run(T0.h hVar) {
                    this.f11636a.S(f8, hVar);
                }
            });
            return;
        }
        AbstractC0786c.beginSection("Drawable#setProgress");
        this.f11654b.setFrame(this.f11653a.getFrameForProgress(f8));
        AbstractC0786c.endSection("Drawable#setProgress");
    }

    public void setRenderMode(E e8) {
        this.f11674v = e8;
        t();
    }

    public void setRepeatCount(int i8) {
        this.f11654b.setRepeatCount(i8);
    }

    public void setRepeatMode(int i8) {
        this.f11654b.setRepeatMode(i8);
    }

    public void setSafeMode(boolean z8) {
        this.f11657e = z8;
    }

    public void setSpeed(float f8) {
        this.f11654b.setSpeed(f8);
    }

    public void setSystemAnimationsAreEnabled(Boolean bool) {
        this.f11655c = bool.booleanValue();
    }

    public void setTextDelegate(G g8) {
        this.f11665m = g8;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z8, boolean z9) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z8, z9);
        if (z8) {
            d dVar = this.f11658f;
            if (dVar == d.PLAY) {
                playAnimation();
            } else if (dVar == d.RESUME) {
                resumeAnimation();
            }
        } else if (this.f11654b.isRunning()) {
            pauseAnimation();
            this.f11658f = d.RESUME;
        } else if (zIsVisible) {
            this.f11658f = d.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        playAnimation();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        endAnimation();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public Bitmap updateBitmap(String str, Bitmap bitmap) {
        X0.b bVarB = B();
        if (bVarB == null) {
            f1.f.warning("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        Bitmap bitmapUpdateBitmap = bVarB.updateBitmap(str, bitmap);
        invalidateSelf();
        return bitmapUpdateBitmap;
    }

    public boolean useTextGlyphs() {
        return this.f11665m == null && this.f11653a.getCharacters().size() > 0;
    }

    public void enableMergePathsForKitKatAndAbove(boolean z8) {
        if (this.f11666n == z8) {
            return;
        }
        this.f11666n = z8;
        if (this.f11653a != null) {
            s();
        }
    }

    public void setMaxFrame(final String str) {
        T0.h hVar = this.f11653a;
        if (hVar == null) {
            this.f11659g.add(new c() { // from class: com.airbnb.lottie.i
                @Override // com.airbnb.lottie.p.c
                public final void run(T0.h hVar2) {
                    this.f11629a.J(str, hVar2);
                }
            });
            return;
        }
        Y0.h marker = hVar.getMarker(str);
        if (marker != null) {
            setMaxFrame((int) (marker.startFrame + marker.durationFrames));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void setMinFrame(final String str) {
        T0.h hVar = this.f11653a;
        if (hVar == null) {
            this.f11659g.add(new c() { // from class: com.airbnb.lottie.j
                @Override // com.airbnb.lottie.p.c
                public final void run(T0.h hVar2) {
                    this.f11631a.Q(str, hVar2);
                }
            });
            return;
        }
        Y0.h marker = hVar.getMarker(str);
        if (marker != null) {
            setMinFrame((int) marker.startFrame);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void setMinAndMaxFrame(final String str, final String str2, final boolean z8) {
        T0.h hVar = this.f11653a;
        if (hVar == null) {
            this.f11659g.add(new c() { // from class: com.airbnb.lottie.h
                @Override // com.airbnb.lottie.p.c
                public final void run(T0.h hVar2) {
                    this.f11625a.N(str, str2, z8, hVar2);
                }
            });
            return;
        }
        Y0.h marker = hVar.getMarker(str);
        if (marker == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        int i8 = (int) marker.startFrame;
        Y0.h marker2 = this.f11653a.getMarker(str2);
        if (marker2 == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str2 + ".");
        }
        setMinAndMaxFrame(i8, (int) (marker2.startFrame + (z8 ? 1.0f : 0.0f)));
    }

    public void draw(Canvas canvas, Matrix matrix) {
        C1065c c1065c = this.f11669q;
        T0.h hVar = this.f11653a;
        if (c1065c == null || hVar == null) {
            return;
        }
        if (this.f11675w) {
            canvas.save();
            canvas.concat(matrix);
            T(canvas, c1065c);
            canvas.restore();
        } else {
            c1065c.draw(canvas, matrix, this.f11670r);
        }
        this.f11652J = false;
    }

    public <T> void addValueCallback(Y0.e eVar, T t8, InterfaceC5538e interfaceC5538e) {
        addValueCallback(eVar, (Y0.e) t8, (C5536c) new b(interfaceC5538e));
    }

    public void setMinAndMaxFrame(final int i8, final int i9) {
        if (this.f11653a == null) {
            this.f11659g.add(new c() { // from class: com.airbnb.lottie.b
                @Override // com.airbnb.lottie.p.c
                public final void run(T0.h hVar) {
                    this.f11611a.L(i8, i9, hVar);
                }
            });
        } else {
            this.f11654b.setMinAndMaxFrames(i8, i9 + 0.99f);
        }
    }
}
