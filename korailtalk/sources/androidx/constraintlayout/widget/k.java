package androidx.constraintlayout.widget;

import R.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class k extends b {

    /* renamed from: j */
    private boolean f8625j;

    /* renamed from: k */
    private boolean f8626k;

    public k(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.b
    protected void j(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.j(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == i.ConstraintLayout_Layout_android_visibility) {
                    this.f8625j = true;
                } else if (index == i.ConstraintLayout_Layout_android_elevation) {
                    this.f8626k = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f8625j || this.f8626k) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i8 = 0; i8 < this.f8570b; i8++) {
                View viewById = constraintLayout.getViewById(this.f8569a[i8]);
                if (viewById != null) {
                    if (this.f8625j) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f8626k && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        d();
    }

    @Override // android.view.View
    public void setVisibility(int i8) {
        super.setVisibility(i8);
        d();
    }

    public k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public k(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }

    public void onMeasure(l lVar, int i8, int i9) {
    }
}
