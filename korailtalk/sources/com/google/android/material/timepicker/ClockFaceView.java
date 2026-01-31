package com.google.android.material.timepicker;

import J2.f;
import J2.h;
import J2.k;
import J2.l;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0923a;
import androidx.core.view.accessibility.H;
import com.google.android.material.timepicker.ClockHandView;
import i.AbstractC5638a;
import java.util.Arrays;

/* loaded from: classes2.dex */
class ClockFaceView extends com.google.android.material.timepicker.b implements ClockHandView.d {

    /* renamed from: C, reason: collision with root package name */
    private final ClockHandView f25389C;

    /* renamed from: D, reason: collision with root package name */
    private final Rect f25390D;

    /* renamed from: E, reason: collision with root package name */
    private final RectF f25391E;

    /* renamed from: F, reason: collision with root package name */
    private final SparseArray f25392F;

    /* renamed from: G, reason: collision with root package name */
    private final C0923a f25393G;

    /* renamed from: H, reason: collision with root package name */
    private final int[] f25394H;

    /* renamed from: I, reason: collision with root package name */
    private final float[] f25395I;

    /* renamed from: J, reason: collision with root package name */
    private final int f25396J;

    /* renamed from: K, reason: collision with root package name */
    private String[] f25397K;

    /* renamed from: L, reason: collision with root package name */
    private float f25398L;

    /* renamed from: M, reason: collision with root package name */
    private final ColorStateList f25399M;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.setRadius(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f25389C.getSelectorRadius()) - ClockFaceView.this.f25396J);
            return true;
        }
    }

    class b extends C0923a {
        b() {
        }

        @Override // androidx.core.view.C0923a
        public void onInitializeAccessibilityNodeInfo(View view, H h8) {
            super.onInitializeAccessibilityNodeInfo(view, h8);
            int iIntValue = ((Integer) view.getTag(f.material_value_index)).intValue();
            if (iIntValue > 0) {
                h8.setTraversalAfter((View) ClockFaceView.this.f25392F.get(iIntValue - 1));
            }
            h8.setCollectionItemInfo(H.f.obtain(0, 1, iIntValue, 1, false, view.isSelected()));
        }
    }

    public ClockFaceView(Context context) {
        this(context, null);
    }

    private void v() {
        RectF currentSelectorBox = this.f25389C.getCurrentSelectorBox();
        for (int i8 = 0; i8 < this.f25392F.size(); i8++) {
            TextView textView = (TextView) this.f25392F.get(i8);
            if (textView != null) {
                textView.getDrawingRect(this.f25390D);
                this.f25390D.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.f25390D);
                this.f25391E.set(this.f25390D);
                textView.getPaint().setShader(w(currentSelectorBox, this.f25391E));
                textView.invalidate();
            }
        }
    }

    private RadialGradient w(RectF rectF, RectF rectF2) {
        if (RectF.intersects(rectF, rectF2)) {
            return new RadialGradient(rectF.centerX() - this.f25391E.left, rectF.centerY() - this.f25391E.top, rectF.width() * 0.5f, this.f25394H, this.f25395I, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private void x(int i8) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.f25392F.size();
        for (int i9 = 0; i9 < Math.max(this.f25397K.length, size); i9++) {
            TextView textView = (TextView) this.f25392F.get(i9);
            if (i9 >= this.f25397K.length) {
                removeView(textView);
                this.f25392F.remove(i9);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(h.material_clockface_textview, (ViewGroup) this, false);
                    this.f25392F.put(i9, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f25397K[i9]);
                textView.setTag(f.material_value_index, Integer.valueOf(i9));
                AbstractC0985p0.setAccessibilityDelegate(textView, this.f25393G);
                textView.setTextColor(this.f25399M);
                if (i8 != 0) {
                    textView.setContentDescription(getResources().getString(i8, this.f25397K[i9]));
                }
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        H.wrap(accessibilityNodeInfo).setCollectionInfo(H.e.obtain(1, this.f25397K.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        v();
    }

    @Override // com.google.android.material.timepicker.ClockHandView.d
    public void onRotate(float f8, boolean z8) {
        if (Math.abs(this.f25398L - f8) > 0.001f) {
            this.f25398L = f8;
            v();
        }
    }

    public void setHandRotation(float f8) {
        this.f25389C.setHandRotation(f8);
        v();
    }

    @Override // com.google.android.material.timepicker.b
    public void setRadius(int i8) {
        if (i8 != getRadius()) {
            super.setRadius(i8);
            this.f25389C.setCircleRadius(getRadius());
        }
    }

    public void setValues(String[] strArr, int i8) {
        this.f25397K = strArr;
        x(i8);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, J2.b.materialClockStyle);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f25390D = new Rect();
        this.f25391E = new RectF();
        this.f25392F = new SparseArray();
        this.f25395I = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.ClockFaceView, i8, k.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateList = X2.c.getColorStateList(context, typedArrayObtainStyledAttributes, l.ClockFaceView_clockNumberTextColor);
        this.f25399M = colorStateList;
        LayoutInflater.from(context).inflate(h.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(f.material_clock_hand);
        this.f25389C = clockHandView;
        this.f25396J = resources.getDimensionPixelSize(J2.d.material_clock_hand_padding);
        int colorForState = colorStateList.getColorForState(new int[]{R.attr.state_selected}, colorStateList.getDefaultColor());
        this.f25394H = new int[]{colorForState, colorForState, colorStateList.getDefaultColor()};
        clockHandView.addOnRotateListener(this);
        int defaultColor = AbstractC5638a.getColorStateList(context, J2.c.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateList2 = X2.c.getColorStateList(context, typedArrayObtainStyledAttributes, l.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(colorStateList2 != null ? colorStateList2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f25393G = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        setValues(strArr, 0);
    }
}
