package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C1001x0;
import androidx.core.view.InterfaceC1003y0;
import h.AbstractC5563a;
import h.AbstractC5572j;

/* renamed from: androidx.appcompat.widget.a */
/* loaded from: classes.dex */
abstract class AbstractC0841a extends ViewGroup {

    /* renamed from: a */
    protected final b f7011a;

    /* renamed from: b */
    protected final Context f7012b;

    /* renamed from: c */
    protected ActionMenuView f7013c;

    /* renamed from: d */
    protected C0843c f7014d;

    /* renamed from: e */
    protected int f7015e;

    /* renamed from: f */
    protected C1001x0 f7016f;

    /* renamed from: g */
    private boolean f7017g;

    /* renamed from: h */
    private boolean f7018h;

    /* renamed from: androidx.appcompat.widget.a$a */
    class RunnableC0113a implements Runnable {
        RunnableC0113a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0841a.this.showOverflowMenu();
        }
    }

    /* renamed from: androidx.appcompat.widget.a$b */
    protected class b implements InterfaceC1003y0 {

        /* renamed from: a */
        private boolean f7020a = false;

        /* renamed from: b */
        int f7021b;

        protected b() {
        }

        @Override // androidx.core.view.InterfaceC1003y0
        public void onAnimationCancel(View view) {
            this.f7020a = true;
        }

        @Override // androidx.core.view.InterfaceC1003y0
        public void onAnimationEnd(View view) {
            if (this.f7020a) {
                return;
            }
            AbstractC0841a abstractC0841a = AbstractC0841a.this;
            abstractC0841a.f7016f = null;
            AbstractC0841a.super.setVisibility(this.f7021b);
        }

        @Override // androidx.core.view.InterfaceC1003y0
        public void onAnimationStart(View view) {
            AbstractC0841a.super.setVisibility(0);
            this.f7020a = false;
        }

        public b withFinalVisibility(C1001x0 c1001x0, int i8) {
            AbstractC0841a.this.f7016f = c1001x0;
            this.f7021b = i8;
            return this;
        }
    }

    AbstractC0841a(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f7011a = new b();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(AbstractC5563a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f7012b = context;
        } else {
            this.f7012b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i8, int i9, boolean z8) {
        return z8 ? i8 - i9 : i8 + i9;
    }

    public void animateToVisibility(int i8) {
        setupAnimatorToVisibility(i8, 200L).start();
    }

    protected int c(View view, int i8, int i9, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), i9);
        return Math.max(0, (i8 - view.getMeasuredWidth()) - i10);
    }

    public boolean canShowOverflowMenu() {
        return isOverflowReserved() && getVisibility() == 0;
    }

    public void dismissPopupMenus() {
        C0843c c0843c = this.f7014d;
        if (c0843c != null) {
            c0843c.dismissPopupMenus();
        }
    }

    protected int e(View view, int i8, int i9, int i10, boolean z8) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i9 + ((i10 - measuredHeight) / 2);
        if (z8) {
            view.layout(i8 - measuredWidth, i11, i8, measuredHeight + i11);
        } else {
            view.layout(i8, i11, i8 + measuredWidth, measuredHeight + i11);
        }
        return z8 ? -measuredWidth : measuredWidth;
    }

    public int getAnimatedVisibility() {
        return this.f7016f != null ? this.f7011a.f7021b : getVisibility();
    }

    public int getContentHeight() {
        return this.f7015e;
    }

    public boolean hideOverflowMenu() {
        C0843c c0843c = this.f7014d;
        if (c0843c != null) {
            return c0843c.hideOverflowMenu();
        }
        return false;
    }

    public boolean isOverflowMenuShowPending() {
        C0843c c0843c = this.f7014d;
        if (c0843c != null) {
            return c0843c.isOverflowMenuShowPending();
        }
        return false;
    }

    public boolean isOverflowMenuShowing() {
        C0843c c0843c = this.f7014d;
        if (c0843c != null) {
            return c0843c.isOverflowMenuShowing();
        }
        return false;
    }

    public boolean isOverflowReserved() {
        C0843c c0843c = this.f7014d;
        return c0843c != null && c0843c.isOverflowReserved();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC5572j.ActionBar, AbstractC5563a.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(AbstractC5572j.ActionBar_height, 0));
        typedArrayObtainStyledAttributes.recycle();
        C0843c c0843c = this.f7014d;
        if (c0843c != null) {
            c0843c.onConfigurationChanged(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f7018h = false;
        }
        if (!this.f7018h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f7018h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f7018h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f7017g = false;
        }
        if (!this.f7017g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f7017g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f7017g = false;
        }
        return true;
    }

    public void postShowOverflowMenu() {
        post(new RunnableC0113a());
    }

    public void setContentHeight(int i8) {
        this.f7015e = i8;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i8) {
        if (i8 != getVisibility()) {
            C1001x0 c1001x0 = this.f7016f;
            if (c1001x0 != null) {
                c1001x0.cancel();
            }
            super.setVisibility(i8);
        }
    }

    public C1001x0 setupAnimatorToVisibility(int i8, long j8) {
        C1001x0 c1001x0 = this.f7016f;
        if (c1001x0 != null) {
            c1001x0.cancel();
        }
        if (i8 != 0) {
            C1001x0 c1001x0Alpha = AbstractC0985p0.animate(this).alpha(0.0f);
            c1001x0Alpha.setDuration(j8);
            c1001x0Alpha.setListener(this.f7011a.withFinalVisibility(c1001x0Alpha, i8));
            return c1001x0Alpha;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C1001x0 c1001x0Alpha2 = AbstractC0985p0.animate(this).alpha(1.0f);
        c1001x0Alpha2.setDuration(j8);
        c1001x0Alpha2.setListener(this.f7011a.withFinalVisibility(c1001x0Alpha2, i8));
        return c1001x0Alpha2;
    }

    public boolean showOverflowMenu() {
        C0843c c0843c = this.f7014d;
        if (c0843c != null) {
            return c0843c.showOverflowMenu();
        }
        return false;
    }
}
