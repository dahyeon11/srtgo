package com.google.android.material.snackbar;

import J2.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* loaded from: classes2.dex */
public class Snackbar extends BaseTransientBottomBar {

    /* renamed from: B, reason: collision with root package name */
    private static final int[] f25092B;

    /* renamed from: C, reason: collision with root package name */
    private static final int[] f25093C;

    /* renamed from: A, reason: collision with root package name */
    private BaseTransientBottomBar.s f25094A;

    /* renamed from: y, reason: collision with root package name */
    private final AccessibilityManager f25095y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f25096z;

    public static final class SnackbarLayout extends BaseTransientBottomBar.w {
        public SnackbarLayout(Context context) {
            super(context);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i8, int i9) {
            super.onMeasure(i8, i9);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f25097a;

        a(View.OnClickListener onClickListener) {
            this.f25097a = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f25097a.onClick(view);
            Snackbar.this.v(1);
        }
    }

    public static class b extends BaseTransientBottomBar.s {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s
        public void onDismissed(Snackbar snackbar, int i8) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s
        public void onShown(Snackbar snackbar) {
        }
    }

    static {
        int i8 = J2.b.snackbarButtonStyle;
        f25092B = new int[]{i8};
        f25093C = new int[]{i8, J2.b.snackbarTextViewStyle};
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, com.google.android.material.snackbar.a aVar) {
        super(context, viewGroup, view, aVar);
        this.f25095y = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    private static ViewGroup S(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    private static boolean T(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f25093C);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    private static Snackbar U(Context context, View view, CharSequence charSequence, int i8) {
        ViewGroup viewGroupS = S(view);
        if (viewGroupS == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = viewGroupS.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(T(context) ? h.mtrl_layout_snackbar_include : h.design_layout_snackbar_include, viewGroupS, false);
        Snackbar snackbar = new Snackbar(context, viewGroupS, snackbarContentLayout, snackbarContentLayout);
        snackbar.setText(charSequence);
        snackbar.setDuration(i8);
        return snackbar;
    }

    public static Snackbar make(View view, CharSequence charSequence, int i8) {
        return U(null, view, charSequence, i8);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void dismiss() {
        super.dismiss();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int getDuration() {
        int duration = super.getDuration();
        if (duration == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f25095y.getRecommendedTimeoutMillis(duration, (this.f25096z ? 4 : 0) | 3);
        }
        if (this.f25096z && this.f25095y.isTouchExplorationEnabled()) {
            return -2;
        }
        return duration;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public boolean isShown() {
        return super.isShown();
    }

    public Snackbar setAction(int i8, View.OnClickListener onClickListener) {
        return setAction(getContext().getText(i8), onClickListener);
    }

    public Snackbar setActionTextColor(ColorStateList colorStateList) {
        ((SnackbarContentLayout) this.f25041c.getChildAt(0)).getActionView().setTextColor(colorStateList);
        return this;
    }

    public Snackbar setBackgroundTint(int i8) {
        return setBackgroundTintList(ColorStateList.valueOf(i8));
    }

    public Snackbar setBackgroundTintList(ColorStateList colorStateList) {
        this.f25041c.setBackgroundTintList(colorStateList);
        return this;
    }

    public Snackbar setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f25041c.setBackgroundTintMode(mode);
        return this;
    }

    @Deprecated
    public Snackbar setCallback(b bVar) {
        BaseTransientBottomBar.s sVar = this.f25094A;
        if (sVar != null) {
            removeCallback(sVar);
        }
        if (bVar != null) {
            addCallback(bVar);
        }
        this.f25094A = bVar;
        return this;
    }

    public Snackbar setMaxInlineActionWidth(int i8) {
        ((SnackbarContentLayout) this.f25041c.getChildAt(0)).setMaxInlineActionWidth(i8);
        return this;
    }

    public Snackbar setText(CharSequence charSequence) {
        ((SnackbarContentLayout) this.f25041c.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    public Snackbar setTextColor(ColorStateList colorStateList) {
        ((SnackbarContentLayout) this.f25041c.getChildAt(0)).getMessageView().setTextColor(colorStateList);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void show() {
        super.show();
    }

    public static Snackbar make(Context context, View view, CharSequence charSequence, int i8) {
        return U(context, view, charSequence, i8);
    }

    public Snackbar setAction(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.f25041c.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.f25096z = false;
        } else {
            this.f25096z = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new a(onClickListener));
        }
        return this;
    }

    public static Snackbar make(View view, int i8, int i9) {
        return make(view, view.getResources().getText(i8), i9);
    }

    public Snackbar setActionTextColor(int i8) {
        ((SnackbarContentLayout) this.f25041c.getChildAt(0)).getActionView().setTextColor(i8);
        return this;
    }

    public Snackbar setText(int i8) {
        return setText(getContext().getText(i8));
    }

    public Snackbar setTextColor(int i8) {
        ((SnackbarContentLayout) this.f25041c.getChildAt(0)).getMessageView().setTextColor(i8);
        return this;
    }
}
