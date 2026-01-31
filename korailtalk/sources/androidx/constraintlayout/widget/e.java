package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class e extends ViewGroup {
    public static final String TAG = "Constraints";

    /* renamed from: a */
    d f8605a;

    public e(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void b(AttributeSet attributeSet) {
    }

    @Override // android.view.ViewGroup
    /* renamed from: a */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    public d getConstraintSet() {
        if (this.f8605a == null) {
            this.f8605a = new d();
        }
        this.f8605a.clone(this);
        return this.f8605a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(attributeSet);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    public e(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        b(attributeSet);
        super.setVisibility(8);
    }

    public static class a extends ConstraintLayout.b {
        public float alpha;
        public boolean applyElevation;
        public float elevation;
        public float rotation;
        public float rotationX;
        public float rotationY;
        public float scaleX;
        public float scaleY;
        public float transformPivotX;
        public float transformPivotY;
        public float translationX;
        public float translationY;
        public float translationZ;

        public a(int i8, int i9) {
            super(i8, i9);
            this.alpha = 1.0f;
            this.applyElevation = false;
            this.elevation = 0.0f;
            this.rotation = 0.0f;
            this.rotationX = 0.0f;
            this.rotationY = 0.0f;
            this.scaleX = 1.0f;
            this.scaleY = 1.0f;
            this.transformPivotX = 0.0f;
            this.transformPivotY = 0.0f;
            this.translationX = 0.0f;
            this.translationY = 0.0f;
            this.translationZ = 0.0f;
        }

        public a(a aVar) {
            super((ConstraintLayout.b) aVar);
            this.alpha = 1.0f;
            this.applyElevation = false;
            this.elevation = 0.0f;
            this.rotation = 0.0f;
            this.rotationX = 0.0f;
            this.rotationY = 0.0f;
            this.scaleX = 1.0f;
            this.scaleY = 1.0f;
            this.transformPivotX = 0.0f;
            this.transformPivotY = 0.0f;
            this.translationX = 0.0f;
            this.translationY = 0.0f;
            this.translationZ = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.alpha = 1.0f;
            this.applyElevation = false;
            this.elevation = 0.0f;
            this.rotation = 0.0f;
            this.rotationX = 0.0f;
            this.rotationY = 0.0f;
            this.scaleX = 1.0f;
            this.scaleY = 1.0f;
            this.transformPivotX = 0.0f;
            this.transformPivotY = 0.0f;
            this.translationX = 0.0f;
            this.translationY = 0.0f;
            this.translationZ = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.ConstraintSet);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == i.ConstraintSet_android_alpha) {
                    this.alpha = typedArrayObtainStyledAttributes.getFloat(index, this.alpha);
                } else if (index == i.ConstraintSet_android_elevation) {
                    this.elevation = typedArrayObtainStyledAttributes.getFloat(index, this.elevation);
                    this.applyElevation = true;
                } else if (index == i.ConstraintSet_android_rotationX) {
                    this.rotationX = typedArrayObtainStyledAttributes.getFloat(index, this.rotationX);
                } else if (index == i.ConstraintSet_android_rotationY) {
                    this.rotationY = typedArrayObtainStyledAttributes.getFloat(index, this.rotationY);
                } else if (index == i.ConstraintSet_android_rotation) {
                    this.rotation = typedArrayObtainStyledAttributes.getFloat(index, this.rotation);
                } else if (index == i.ConstraintSet_android_scaleX) {
                    this.scaleX = typedArrayObtainStyledAttributes.getFloat(index, this.scaleX);
                } else if (index == i.ConstraintSet_android_scaleY) {
                    this.scaleY = typedArrayObtainStyledAttributes.getFloat(index, this.scaleY);
                } else if (index == i.ConstraintSet_android_transformPivotX) {
                    this.transformPivotX = typedArrayObtainStyledAttributes.getFloat(index, this.transformPivotX);
                } else if (index == i.ConstraintSet_android_transformPivotY) {
                    this.transformPivotY = typedArrayObtainStyledAttributes.getFloat(index, this.transformPivotY);
                } else if (index == i.ConstraintSet_android_translationX) {
                    this.translationX = typedArrayObtainStyledAttributes.getFloat(index, this.translationX);
                } else if (index == i.ConstraintSet_android_translationY) {
                    this.translationY = typedArrayObtainStyledAttributes.getFloat(index, this.translationY);
                } else if (index == i.ConstraintSet_android_translationZ) {
                    this.translationZ = typedArrayObtainStyledAttributes.getFloat(index, this.translationZ);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
