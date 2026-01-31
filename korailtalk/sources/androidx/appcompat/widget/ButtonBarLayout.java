package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.AbstractC0985p0;
import h.AbstractC5568f;
import h.AbstractC5572j;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6782a;

    /* renamed from: b, reason: collision with root package name */
    private int f6783b;

    /* renamed from: c, reason: collision with root package name */
    private int f6784c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6783b = -1;
        this.f6784c = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5572j.ButtonBarLayout);
        AbstractC0985p0.saveAttributeDataForStyleable(this, context, AbstractC5572j.ButtonBarLayout, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f6782a = typedArrayObtainStyledAttributes.getBoolean(AbstractC5572j.ButtonBarLayout_allowStacking, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    private int a(int i8) {
        int childCount = getChildCount();
        while (i8 < childCount) {
            if (getChildAt(i8).getVisibility() == 0) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    private boolean b() {
        return getOrientation() == 1;
    }

    private void setStacked(boolean z8) {
        setOrientation(z8 ? 1 : 0);
        setGravity(z8 ? androidx.core.view.A.END : 80);
        View viewFindViewById = findViewById(AbstractC5568f.spacer);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(z8 ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.f6784c, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        int iMakeMeasureSpec;
        boolean z8;
        int size = View.MeasureSpec.getSize(i8);
        int paddingBottom = 0;
        if (this.f6782a) {
            if (size > this.f6783b && b()) {
                setStacked(false);
            }
            this.f6783b = size;
        }
        if (b() || View.MeasureSpec.getMode(i8) != 1073741824) {
            iMakeMeasureSpec = i8;
            z8 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z8 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i9);
        if (this.f6782a && !b() && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z8 = true;
        }
        if (z8) {
            super.onMeasure(i8, i9);
        }
        int iA = a(0);
        if (iA >= 0) {
            View childAt = getChildAt(iA);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (b()) {
                int iA2 = a(iA + 1);
                if (iA2 >= 0) {
                    paddingTop += getChildAt(iA2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                paddingBottom = paddingTop;
            } else {
                paddingBottom = paddingTop + getPaddingBottom();
            }
        }
        if (AbstractC0985p0.getMinimumHeight(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
        }
    }

    public void setAllowStacking(boolean z8) {
        if (this.f6782a != z8) {
            this.f6782a = z8;
            if (!z8 && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
