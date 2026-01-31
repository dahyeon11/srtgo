package com.airbnb.lottie;

import T0.AbstractC0786c;
import T0.B;
import T0.C;
import T0.C0784a;
import T0.D;
import T0.E;
import T0.F;
import T0.G;
import T0.InterfaceC0785b;
import T0.t;
import T0.v;
import T0.x;
import T0.y;
import T0.z;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import g1.C5535b;
import g1.C5536c;
import g1.InterfaceC5538e;
import i.AbstractC5638a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: q, reason: collision with root package name */
    private static final v f11584q = new v() { // from class: T0.f
        @Override // T0.v
        public final void onResult(Object obj) {
            LottieAnimationView.n((Throwable) obj);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private final v f11585c;

    /* renamed from: d, reason: collision with root package name */
    private final v f11586d;

    /* renamed from: e, reason: collision with root package name */
    private v f11587e;

    /* renamed from: f, reason: collision with root package name */
    private int f11588f;

    /* renamed from: g, reason: collision with root package name */
    private final p f11589g;

    /* renamed from: h, reason: collision with root package name */
    private String f11590h;

    /* renamed from: i, reason: collision with root package name */
    private int f11591i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f11592j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f11593k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f11594l;

    /* renamed from: m, reason: collision with root package name */
    private final Set f11595m;

    /* renamed from: n, reason: collision with root package name */
    private final Set f11596n;

    /* renamed from: o, reason: collision with root package name */
    private q f11597o;

    /* renamed from: p, reason: collision with root package name */
    private T0.h f11598p;

    class a implements v {
        a() {
        }

        @Override // T0.v
        public void onResult(Throwable th) {
            if (LottieAnimationView.this.f11588f != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.f11588f);
            }
            (LottieAnimationView.this.f11587e == null ? LottieAnimationView.f11584q : LottieAnimationView.this.f11587e).onResult(th);
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

    private static class c extends View.BaseSavedState {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        String f11601a;

        /* renamed from: b, reason: collision with root package name */
        int f11602b;

        /* renamed from: c, reason: collision with root package name */
        float f11603c;

        /* renamed from: d, reason: collision with root package name */
        boolean f11604d;

        /* renamed from: e, reason: collision with root package name */
        String f11605e;

        /* renamed from: f, reason: collision with root package name */
        int f11606f;

        /* renamed from: g, reason: collision with root package name */
        int f11607g;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* synthetic */ c(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeString(this.f11601a);
            parcel.writeFloat(this.f11603c);
            parcel.writeInt(this.f11604d ? 1 : 0);
            parcel.writeString(this.f11605e);
            parcel.writeInt(this.f11606f);
            parcel.writeInt(this.f11607g);
        }

        c(Parcelable parcelable) {
            super(parcelable);
        }

        private c(Parcel parcel) {
            super(parcel);
            this.f11601a = parcel.readString();
            this.f11603c = parcel.readFloat();
            this.f11604d = parcel.readInt() == 1;
            this.f11605e = parcel.readString();
            this.f11606f = parcel.readInt();
            this.f11607g = parcel.readInt();
        }
    }

    private enum d {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f11585c = new v() { // from class: T0.d
            @Override // T0.v
            public final void onResult(Object obj) {
                this.f4794a.setComposition((h) obj);
            }
        };
        this.f11586d = new a();
        this.f11588f = 0;
        this.f11589g = new p();
        this.f11592j = false;
        this.f11593k = false;
        this.f11594l = true;
        this.f11595m = new HashSet();
        this.f11596n = new HashSet();
        k(null, C.lottieAnimationViewStyle);
    }

    private void g() {
        q qVar = this.f11597o;
        if (qVar != null) {
            qVar.removeListener(this.f11585c);
            this.f11597o.removeFailureListener(this.f11586d);
        }
    }

    private void h() {
        this.f11598p = null;
        this.f11589g.clearComposition();
    }

    private q i(final String str) {
        return isInEditMode() ? new q(new Callable() { // from class: T0.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f4795a.l(str);
            }
        }, true) : this.f11594l ? t.fromAsset(getContext(), str) : t.fromAsset(getContext(), str, null);
    }

    private q j(final int i8) {
        return isInEditMode() ? new q(new Callable() { // from class: T0.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f4797a.m(i8);
            }
        }, true) : this.f11594l ? t.fromRawRes(getContext(), i8) : t.fromRawRes(getContext(), i8, null);
    }

    private void k(AttributeSet attributeSet, int i8) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, D.LottieAnimationView, i8, 0);
        this.f11594l = typedArrayObtainStyledAttributes.getBoolean(D.LottieAnimationView_lottie_cacheComposition, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(D.LottieAnimationView_lottie_rawRes);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(D.LottieAnimationView_lottie_fileName);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(D.LottieAnimationView_lottie_url);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(D.LottieAnimationView_lottie_rawRes, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(D.LottieAnimationView_lottie_fileName);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(D.LottieAnimationView_lottie_url)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(D.LottieAnimationView_lottie_fallbackRes, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(D.LottieAnimationView_lottie_autoPlay, false)) {
            this.f11593k = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(D.LottieAnimationView_lottie_loop, false)) {
            this.f11589g.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(D.LottieAnimationView_lottie_repeatMode)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(D.LottieAnimationView_lottie_repeatMode, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(D.LottieAnimationView_lottie_repeatCount)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(D.LottieAnimationView_lottie_repeatCount, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(D.LottieAnimationView_lottie_speed)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(D.LottieAnimationView_lottie_speed, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(D.LottieAnimationView_lottie_clipToCompositionBounds)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(D.LottieAnimationView_lottie_clipToCompositionBounds, true));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(D.LottieAnimationView_lottie_imageAssetsFolder));
        setProgress(typedArrayObtainStyledAttributes.getFloat(D.LottieAnimationView_lottie_progress, 0.0f));
        enableMergePathsForKitKatAndAbove(typedArrayObtainStyledAttributes.getBoolean(D.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        if (typedArrayObtainStyledAttributes.hasValue(D.LottieAnimationView_lottie_colorFilter)) {
            addValueCallback(new Y0.e("**"), (Y0.e) y.COLOR_FILTER, new C5536c(new F(AbstractC5638a.getColorStateList(getContext(), typedArrayObtainStyledAttributes.getResourceId(D.LottieAnimationView_lottie_colorFilter, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(D.LottieAnimationView_lottie_renderMode)) {
            int i9 = D.LottieAnimationView_lottie_renderMode;
            E e8 = E.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i9, e8.ordinal());
            if (iOrdinal >= E.values().length) {
                iOrdinal = e8.ordinal();
            }
            setRenderMode(E.values()[iOrdinal]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(D.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f11589g.setSystemAnimationsAreEnabled(Boolean.valueOf(f1.j.getAnimationScale(getContext()) != 0.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ z l(String str) {
        return this.f11594l ? t.fromAssetSync(getContext(), str) : t.fromAssetSync(getContext(), str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ z m(int i8) {
        return this.f11594l ? t.fromRawResSync(getContext(), i8) : t.fromRawResSync(getContext(), i8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Throwable th) {
        if (!f1.j.isNetworkException(th)) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
        f1.f.warning("Unable to load composition.", th);
    }

    private void o() {
        boolean zIsAnimating = isAnimating();
        setImageDrawable(null);
        setImageDrawable(this.f11589g);
        if (zIsAnimating) {
            this.f11589g.resumeAnimation();
        }
    }

    private void setCompositionTask(q qVar) {
        this.f11595m.add(d.SET_ANIMATION);
        h();
        g();
        this.f11597o = qVar.addListener(this.f11585c).addFailureListener(this.f11586d);
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.f11589g.addAnimatorListener(animatorListener);
    }

    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f11589g.addAnimatorPauseListener(animatorPauseListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f11589g.addAnimatorUpdateListener(animatorUpdateListener);
    }

    public boolean addLottieOnCompositionLoadedListener(x xVar) {
        T0.h hVar = this.f11598p;
        if (hVar != null) {
            xVar.a(hVar);
        }
        return this.f11596n.add(xVar);
    }

    public <T> void addValueCallback(Y0.e eVar, T t8, C5536c c5536c) {
        this.f11589g.addValueCallback(eVar, (Y0.e) t8, c5536c);
    }

    public void cancelAnimation() {
        this.f11595m.add(d.PLAY_OPTION);
        this.f11589g.cancelAnimation();
    }

    @Deprecated
    public void disableExtraScaleModeInFitXY() {
        this.f11589g.disableExtraScaleModeInFitXY();
    }

    public void enableMergePathsForKitKatAndAbove(boolean z8) {
        this.f11589g.enableMergePathsForKitKatAndAbove(z8);
    }

    public boolean getClipToCompositionBounds() {
        return this.f11589g.getClipToCompositionBounds();
    }

    public T0.h getComposition() {
        return this.f11598p;
    }

    public long getDuration() {
        T0.h hVar = this.f11598p;
        if (hVar != null) {
            return (long) hVar.getDuration();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f11589g.getFrame();
    }

    public String getImageAssetsFolder() {
        return this.f11589g.getImageAssetsFolder();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f11589g.getMaintainOriginalImageBounds();
    }

    public float getMaxFrame() {
        return this.f11589g.getMaxFrame();
    }

    public float getMinFrame() {
        return this.f11589g.getMinFrame();
    }

    public B getPerformanceTracker() {
        return this.f11589g.getPerformanceTracker();
    }

    public float getProgress() {
        return this.f11589g.getProgress();
    }

    public E getRenderMode() {
        return this.f11589g.getRenderMode();
    }

    public int getRepeatCount() {
        return this.f11589g.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f11589g.getRepeatMode();
    }

    public float getSpeed() {
        return this.f11589g.getSpeed();
    }

    public boolean hasMasks() {
        return this.f11589g.hasMasks();
    }

    public boolean hasMatte() {
        return this.f11589g.hasMatte();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof p) && ((p) drawable).getRenderMode() == E.SOFTWARE) {
            this.f11589g.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        p pVar = this.f11589g;
        if (drawable2 == pVar) {
            super.invalidateDrawable(pVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean isAnimating() {
        return this.f11589g.isAnimating();
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.f11589g.isMergePathsEnabledForKitKatAndAbove();
    }

    @Deprecated
    public void loop(boolean z8) {
        this.f11589g.setRepeatCount(z8 ? -1 : 0);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f11593k) {
            return;
        }
        this.f11589g.playAnimation();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i8;
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.f11590h = cVar.f11601a;
        Set set = this.f11595m;
        d dVar = d.SET_ANIMATION;
        if (!set.contains(dVar) && !TextUtils.isEmpty(this.f11590h)) {
            setAnimation(this.f11590h);
        }
        this.f11591i = cVar.f11602b;
        if (!this.f11595m.contains(dVar) && (i8 = this.f11591i) != 0) {
            setAnimation(i8);
        }
        if (!this.f11595m.contains(d.SET_PROGRESS)) {
            setProgress(cVar.f11603c);
        }
        if (!this.f11595m.contains(d.PLAY_OPTION) && cVar.f11604d) {
            playAnimation();
        }
        if (!this.f11595m.contains(d.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(cVar.f11605e);
        }
        if (!this.f11595m.contains(d.SET_REPEAT_MODE)) {
            setRepeatMode(cVar.f11606f);
        }
        if (this.f11595m.contains(d.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(cVar.f11607g);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f11601a = this.f11590h;
        cVar.f11602b = this.f11591i;
        cVar.f11603c = this.f11589g.getProgress();
        cVar.f11604d = this.f11589g.D();
        cVar.f11605e = this.f11589g.getImageAssetsFolder();
        cVar.f11606f = this.f11589g.getRepeatMode();
        cVar.f11607g = this.f11589g.getRepeatCount();
        return cVar;
    }

    public void pauseAnimation() {
        this.f11593k = false;
        this.f11589g.pauseAnimation();
    }

    public void playAnimation() {
        this.f11595m.add(d.PLAY_OPTION);
        this.f11589g.playAnimation();
    }

    public void removeAllAnimatorListeners() {
        this.f11589g.removeAllAnimatorListeners();
    }

    public void removeAllLottieOnCompositionLoadedListener() {
        this.f11596n.clear();
    }

    public void removeAllUpdateListeners() {
        this.f11589g.removeAllUpdateListeners();
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.f11589g.removeAnimatorListener(animatorListener);
    }

    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f11589g.removeAnimatorPauseListener(animatorPauseListener);
    }

    public boolean removeLottieOnCompositionLoadedListener(x xVar) {
        return this.f11596n.remove(xVar);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f11589g.removeAnimatorUpdateListener(animatorUpdateListener);
    }

    public List<Y0.e> resolveKeyPath(Y0.e eVar) {
        return this.f11589g.resolveKeyPath(eVar);
    }

    public void resumeAnimation() {
        this.f11595m.add(d.PLAY_OPTION);
        this.f11589g.resumeAnimation();
    }

    public void reverseAnimationSpeed() {
        this.f11589g.reverseAnimationSpeed();
    }

    public void setAnimation(int i8) {
        this.f11591i = i8;
        this.f11590h = null;
        setCompositionTask(j(i8));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f11594l ? t.fromUrl(getContext(), str) : t.fromUrl(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z8) {
        this.f11589g.setApplyingOpacityToLayersEnabled(z8);
    }

    public void setCacheComposition(boolean z8) {
        this.f11594l = z8;
    }

    public void setClipToCompositionBounds(boolean z8) {
        this.f11589g.setClipToCompositionBounds(z8);
    }

    public void setComposition(T0.h hVar) {
        if (AbstractC0786c.DBG) {
            StringBuilder sb = new StringBuilder();
            sb.append("Set Composition \n");
            sb.append(hVar);
        }
        this.f11589g.setCallback(this);
        this.f11598p = hVar;
        this.f11592j = true;
        boolean composition = this.f11589g.setComposition(hVar);
        this.f11592j = false;
        if (getDrawable() != this.f11589g || composition) {
            if (!composition) {
                o();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.f11596n.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.f.a(it.next());
                throw null;
            }
        }
    }

    public void setFailureListener(v vVar) {
        this.f11587e = vVar;
    }

    public void setFallbackResource(int i8) {
        this.f11588f = i8;
    }

    public void setFontAssetDelegate(C0784a c0784a) {
        this.f11589g.setFontAssetDelegate(c0784a);
    }

    public void setFrame(int i8) {
        this.f11589g.setFrame(i8);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z8) {
        this.f11589g.setIgnoreDisabledSystemAnimations(z8);
    }

    public void setImageAssetDelegate(InterfaceC0785b interfaceC0785b) {
        this.f11589g.setImageAssetDelegate(interfaceC0785b);
    }

    public void setImageAssetsFolder(String str) {
        this.f11589g.setImagesAssetsFolder(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        g();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        g();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i8) {
        g();
        super.setImageResource(i8);
    }

    public void setMaintainOriginalImageBounds(boolean z8) {
        this.f11589g.setMaintainOriginalImageBounds(z8);
    }

    public void setMaxFrame(int i8) {
        this.f11589g.setMaxFrame(i8);
    }

    public void setMaxProgress(float f8) {
        this.f11589g.setMaxProgress(f8);
    }

    public void setMinAndMaxFrame(String str) {
        this.f11589g.setMinAndMaxFrame(str);
    }

    public void setMinAndMaxProgress(float f8, float f9) {
        this.f11589g.setMinAndMaxProgress(f8, f9);
    }

    public void setMinFrame(int i8) {
        this.f11589g.setMinFrame(i8);
    }

    public void setMinProgress(float f8) {
        this.f11589g.setMinProgress(f8);
    }

    public void setOutlineMasksAndMattes(boolean z8) {
        this.f11589g.setOutlineMasksAndMattes(z8);
    }

    public void setPerformanceTrackingEnabled(boolean z8) {
        this.f11589g.setPerformanceTrackingEnabled(z8);
    }

    public void setProgress(float f8) {
        this.f11595m.add(d.SET_PROGRESS);
        this.f11589g.setProgress(f8);
    }

    public void setRenderMode(E e8) {
        this.f11589g.setRenderMode(e8);
    }

    public void setRepeatCount(int i8) {
        this.f11595m.add(d.SET_REPEAT_COUNT);
        this.f11589g.setRepeatCount(i8);
    }

    public void setRepeatMode(int i8) {
        this.f11595m.add(d.SET_REPEAT_MODE);
        this.f11589g.setRepeatMode(i8);
    }

    public void setSafeMode(boolean z8) {
        this.f11589g.setSafeMode(z8);
    }

    public void setSpeed(float f8) {
        this.f11589g.setSpeed(f8);
    }

    public void setTextDelegate(G g8) {
        this.f11589g.setTextDelegate(g8);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        p pVar;
        if (!this.f11592j && drawable == (pVar = this.f11589g) && pVar.isAnimating()) {
            pauseAnimation();
        } else if (!this.f11592j && (drawable instanceof p)) {
            p pVar2 = (p) drawable;
            if (pVar2.isAnimating()) {
                pVar2.pauseAnimation();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public Bitmap updateBitmap(String str, Bitmap bitmap) {
        return this.f11589g.updateBitmap(str, bitmap);
    }

    public <T> void addValueCallback(Y0.e eVar, T t8, InterfaceC5538e interfaceC5538e) {
        this.f11589g.addValueCallback(eVar, (Y0.e) t8, (C5536c) new b(interfaceC5538e));
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.f11589g.setMaxFrame(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z8) {
        this.f11589g.setMinAndMaxFrame(str, str2, z8);
    }

    public void setMinFrame(String str) {
        this.f11589g.setMinFrame(str);
    }

    public void setMinAndMaxFrame(int i8, int i9) {
        this.f11589g.setMinAndMaxFrame(i8, i9);
    }

    public void setAnimation(String str) {
        this.f11590h = str;
        this.f11591i = 0;
        setCompositionTask(i(str));
    }

    public void setAnimationFromUrl(String str, String str2) {
        setCompositionTask(t.fromUrl(getContext(), str, str2));
    }

    public void setAnimation(InputStream inputStream, String str) {
        setCompositionTask(t.fromJsonInputStream(inputStream, str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11585c = new v() { // from class: T0.d
            @Override // T0.v
            public final void onResult(Object obj) {
                this.f4794a.setComposition((h) obj);
            }
        };
        this.f11586d = new a();
        this.f11588f = 0;
        this.f11589g = new p();
        this.f11592j = false;
        this.f11593k = false;
        this.f11594l = true;
        this.f11595m = new HashSet();
        this.f11596n = new HashSet();
        k(attributeSet, C.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f11585c = new v() { // from class: T0.d
            @Override // T0.v
            public final void onResult(Object obj) {
                this.f4794a.setComposition((h) obj);
            }
        };
        this.f11586d = new a();
        this.f11588f = 0;
        this.f11589g = new p();
        this.f11592j = false;
        this.f11593k = false;
        this.f11594l = true;
        this.f11595m = new HashSet();
        this.f11596n = new HashSet();
        k(attributeSet, i8);
    }
}
