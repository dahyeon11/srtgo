package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.r;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class p extends androidx.constraintlayout.widget.b implements a, r.i {

    /* renamed from: j, reason: collision with root package name */
    private boolean f8277j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f8278k;

    /* renamed from: l, reason: collision with root package name */
    private float f8279l;

    /* renamed from: m, reason: collision with root package name */
    protected View[] f8280m;

    public p(Context context) {
        super(context);
        this.f8277j = false;
        this.f8278k = false;
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public float getProgress() {
        return this.f8279l;
    }

    public boolean isUseOnHide() {
        return this.f8278k;
    }

    public boolean isUsedOnShow() {
        return this.f8277j;
    }

    @Override // androidx.constraintlayout.widget.b
    protected void j(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.j(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.MotionHelper);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == androidx.constraintlayout.widget.i.MotionHelper_onShow) {
                    this.f8277j = typedArrayObtainStyledAttributes.getBoolean(index, this.f8277j);
                } else if (index == androidx.constraintlayout.widget.i.MotionHelper_onHide) {
                    this.f8278k = typedArrayObtainStyledAttributes.getBoolean(index, this.f8278k);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.r.i
    public void onTransitionChange(r rVar, int i8, int i9, float f8) {
    }

    @Override // androidx.constraintlayout.motion.widget.r.i
    public void onTransitionCompleted(r rVar, int i8) {
    }

    @Override // androidx.constraintlayout.motion.widget.r.i
    public void onTransitionStarted(r rVar, int i8, int i9) {
    }

    @Override // androidx.constraintlayout.motion.widget.r.i
    public void onTransitionTrigger(r rVar, int i8, boolean z8, float f8) {
    }

    public void setProgress(View view, float f8) {
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void setProgress(float f8) {
        this.f8279l = f8;
        int i8 = 0;
        if (this.f8570b > 0) {
            this.f8280m = i((ConstraintLayout) getParent());
            while (i8 < this.f8570b) {
                setProgress(this.f8280m[i8], f8);
                i8++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i8 < childCount) {
            View childAt = viewGroup.getChildAt(i8);
            if (!(childAt instanceof p)) {
                setProgress(childAt, f8);
            }
            i8++;
        }
    }

    public p(Context context, AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context, attributeSet);
        this.f8277j = false;
        this.f8278k = false;
        j(attributeSet);
    }

    public p(Context context, AttributeSet attributeSet, int i8) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context, attributeSet, i8);
        this.f8277j = false;
        this.f8278k = false;
        j(attributeSet);
    }
}
