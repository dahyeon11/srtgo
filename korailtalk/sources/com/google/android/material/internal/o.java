package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0950d1;
import androidx.core.view.W;

/* loaded from: classes2.dex */
public abstract class o {

    static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f25027a;

        a(View view) {
            this.f25027a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.f25027a.getContext().getSystemService("input_method")).showSoftInput(this.f25027a, 1);
        }
    }

    static class b implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f25028a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f25029b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f25030c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f25031d;

        b(boolean z8, boolean z9, boolean z10, e eVar) {
            this.f25028a = z8;
            this.f25029b = z9;
            this.f25030c = z10;
            this.f25031d = eVar;
        }

        @Override // com.google.android.material.internal.o.e
        public C0950d1 onApplyWindowInsets(View view, C0950d1 c0950d1, f fVar) {
            if (this.f25028a) {
                fVar.bottom += c0950d1.getSystemWindowInsetBottom();
            }
            boolean zIsLayoutRtl = o.isLayoutRtl(view);
            if (this.f25029b) {
                if (zIsLayoutRtl) {
                    fVar.end += c0950d1.getSystemWindowInsetLeft();
                } else {
                    fVar.start += c0950d1.getSystemWindowInsetLeft();
                }
            }
            if (this.f25030c) {
                if (zIsLayoutRtl) {
                    fVar.start += c0950d1.getSystemWindowInsetRight();
                } else {
                    fVar.end += c0950d1.getSystemWindowInsetRight();
                }
            }
            fVar.applyToView(view);
            e eVar = this.f25031d;
            return eVar != null ? eVar.onApplyWindowInsets(view, c0950d1, fVar) : c0950d1;
        }
    }

    static class c implements W {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f25032a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f25033b;

        c(e eVar, f fVar) {
            this.f25032a = eVar;
            this.f25033b = fVar;
        }

        @Override // androidx.core.view.W
        public C0950d1 onApplyWindowInsets(View view, C0950d1 c0950d1) {
            return this.f25032a.onApplyWindowInsets(view, c0950d1, new f(this.f25033b));
        }
    }

    static class d implements View.OnAttachStateChangeListener {
        d() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            AbstractC0985p0.requestApplyInsets(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface e {
        C0950d1 onApplyWindowInsets(View view, C0950d1 c0950d1, f fVar);
    }

    public static void addOnGlobalLayoutListener(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void doOnApplyWindowInsets(View view, AttributeSet attributeSet, int i8, int i9) {
        doOnApplyWindowInsets(view, attributeSet, i8, i9, null);
    }

    public static float dpToPx(Context context, int i8) {
        return TypedValue.applyDimension(1, i8, context.getResources().getDisplayMetrics());
    }

    public static ViewGroup getContentView(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static n getContentViewOverlay(View view) {
        return getOverlay(getContentView(view));
    }

    public static n getOverlay(View view) {
        if (view == null) {
            return null;
        }
        return new m(view);
    }

    public static float getParentAbsoluteElevation(View view) {
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += AbstractC0985p0.getElevation((View) parent);
        }
        return elevation;
    }

    public static boolean isLayoutRtl(View view) {
        return AbstractC0985p0.getLayoutDirection(view) == 1;
    }

    public static PorterDuff.Mode parseTintMode(int i8, PorterDuff.Mode mode) {
        if (i8 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i8 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i8 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i8) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void removeOnGlobalLayoutListener(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            removeOnGlobalLayoutListener(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void requestApplyInsetsWhenAttached(View view) {
        if (AbstractC0985p0.isAttachedToWindow(view)) {
            AbstractC0985p0.requestApplyInsets(view);
        } else {
            view.addOnAttachStateChangeListener(new d());
        }
    }

    public static void requestFocusAndShowKeyboard(View view) {
        view.requestFocus();
        view.post(new a(view));
    }

    public static void doOnApplyWindowInsets(View view, AttributeSet attributeSet, int i8, int i9, e eVar) {
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, J2.l.Insets, i8, i9);
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(J2.l.Insets_paddingBottomSystemWindowInsets, false);
        boolean z9 = typedArrayObtainStyledAttributes.getBoolean(J2.l.Insets_paddingLeftSystemWindowInsets, false);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(J2.l.Insets_paddingRightSystemWindowInsets, false);
        typedArrayObtainStyledAttributes.recycle();
        doOnApplyWindowInsets(view, new b(z8, z9, z10, eVar));
    }

    public static void removeOnGlobalLayoutListener(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static class f {
        public int bottom;
        public int end;
        public int start;
        public int top;

        public f(int i8, int i9, int i10, int i11) {
            this.start = i8;
            this.top = i9;
            this.end = i10;
            this.bottom = i11;
        }

        public void applyToView(View view) {
            AbstractC0985p0.setPaddingRelative(view, this.start, this.top, this.end, this.bottom);
        }

        public f(f fVar) {
            this.start = fVar.start;
            this.top = fVar.top;
            this.end = fVar.end;
            this.bottom = fVar.bottom;
        }
    }

    public static void doOnApplyWindowInsets(View view, e eVar) {
        AbstractC0985p0.setOnApplyWindowInsetsListener(view, new c(eVar, new f(AbstractC0985p0.getPaddingStart(view), view.getPaddingTop(), AbstractC0985p0.getPaddingEnd(view), view.getPaddingBottom())));
        requestApplyInsetsWhenAttached(view);
    }
}
