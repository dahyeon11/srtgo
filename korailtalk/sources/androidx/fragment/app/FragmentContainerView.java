package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0950d1;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f9552a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList f9553b;

    /* renamed from: c, reason: collision with root package name */
    private View.OnApplyWindowInsetsListener f9554c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9555d;

    public FragmentContainerView(Context context) {
        super(context);
        this.f9555d = true;
    }

    private void a(View view) {
        ArrayList arrayList = this.f9553b;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f9552a == null) {
            this.f9552a = new ArrayList();
        }
        this.f9552a.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        if (FragmentManager.s0(view) != null) {
            super.addView(view, i8, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i8, ViewGroup.LayoutParams layoutParams, boolean z8) {
        if (FragmentManager.s0(view) != null) {
            return super.addViewInLayout(view, i8, layoutParams, z8);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C0950d1 windowInsetsCompat = C0950d1.toWindowInsetsCompat(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f9554c;
        C0950d1 windowInsetsCompat2 = onApplyWindowInsetsListener != null ? C0950d1.toWindowInsetsCompat(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : AbstractC0985p0.onApplyWindowInsets(this, windowInsetsCompat);
        if (!windowInsetsCompat2.isConsumed()) {
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                AbstractC0985p0.dispatchApplyWindowInsets(getChildAt(i8), windowInsetsCompat2);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f9555d && this.f9552a != null) {
            for (int i8 = 0; i8 < this.f9552a.size(); i8++) {
                super.drawChild(canvas, (View) this.f9552a.get(i8), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j8) {
        ArrayList arrayList;
        if (!this.f9555d || (arrayList = this.f9552a) == null || arrayList.size() <= 0 || !this.f9552a.contains(view)) {
            return super.drawChild(canvas, view, j8);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList arrayList = this.f9553b;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.f9552a;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f9555d = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z8) {
        if (z8) {
            a(view);
        }
        super.removeDetachedView(view, z8);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i8) {
        a(getChildAt(i8));
        super.removeViewAt(i8);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i8, int i9) {
        for (int i10 = i8; i10 < i8 + i9; i10++) {
            a(getChildAt(i10));
        }
        super.removeViews(i8, i9);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i8, int i9) {
        for (int i10 = i8; i10 < i8 + i9; i10++) {
            a(getChildAt(i10));
        }
        super.removeViewsInLayout(i8, i9);
    }

    void setDrawDisappearingViewsLast(boolean z8) {
        this.f9555d = z8;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f9554c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f9553b == null) {
                this.f9553b = new ArrayList();
            }
            this.f9553b.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, int i8) {
        String str;
        super(context, attributeSet, i8);
        this.f9555d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f0.c.FragmentContainerView);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(f0.c.FragmentContainerView_android_name);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
        }
    }

    FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        String str;
        super(context, attributeSet);
        this.f9555d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f0.c.FragmentContainerView);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(f0.c.FragmentContainerView_android_name) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(f0.c.FragmentContainerView_android_tag);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentFindFragmentById = fragmentManager.findFragmentById(id);
        if (classAttribute != null && fragmentFindFragmentById == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment fragmentInstantiate = fragmentManager.getFragmentFactory().instantiate(context.getClassLoader(), classAttribute);
            fragmentInstantiate.onInflate(context, attributeSet, (Bundle) null);
            fragmentManager.beginTransaction().setReorderingAllowed(true).a(this, fragmentInstantiate, string).commitNowAllowingStateLoss();
        }
        fragmentManager.L0(this);
    }
}
