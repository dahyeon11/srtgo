package com.google.android.material.timepicker;

import J2.h;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0923a;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Locale;

/* loaded from: classes2.dex */
class TimePickerView extends ConstraintLayout implements com.google.android.material.timepicker.d {

    /* renamed from: A, reason: collision with root package name */
    private final Chip f25420A;

    /* renamed from: B, reason: collision with root package name */
    private final ClockHandView f25421B;

    /* renamed from: C, reason: collision with root package name */
    private final ClockFaceView f25422C;

    /* renamed from: D, reason: collision with root package name */
    private final MaterialButtonToggleGroup f25423D;

    /* renamed from: E, reason: collision with root package name */
    private final View.OnClickListener f25424E;

    /* renamed from: z, reason: collision with root package name */
    private final Chip f25425z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.o(TimePickerView.this);
        }
    }

    class b implements MaterialButtonToggleGroup.e {
        b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.e
        public void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, int i8, boolean z8) {
            TimePickerView.p(TimePickerView.this);
        }
    }

    class c extends GestureDetector.SimpleOnGestureListener {
        c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean zOnDoubleTap = super.onDoubleTap(motionEvent);
            TimePickerView.q(TimePickerView.this);
            return zOnDoubleTap;
        }
    }

    class d implements View.OnTouchListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ GestureDetector f25429a;

        d(GestureDetector gestureDetector) {
            this.f25429a = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f25429a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    interface e {
    }

    interface f {
    }

    interface g {
    }

    public TimePickerView(Context context) {
        this(context, null);
    }

    static /* synthetic */ g o(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    static /* synthetic */ f p(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    static /* synthetic */ e q(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    private void r() {
        this.f25425z.setTag(J2.f.selection_type, 12);
        this.f25420A.setTag(J2.f.selection_type, 10);
        this.f25425z.setOnClickListener(this.f25424E);
        this.f25420A.setOnClickListener(this.f25424E);
    }

    private void s() {
        d dVar = new d(new GestureDetector(getContext(), new c()));
        this.f25425z.setOnTouchListener(dVar);
        this.f25420A.setOnTouchListener(dVar);
    }

    private void t() {
        if (this.f25423D.getVisibility() == 0) {
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.clone(this);
            dVar.clear(J2.f.material_clock_display, AbstractC0985p0.getLayoutDirection(this) == 0 ? 2 : 1);
            dVar.applyTo(this);
        }
    }

    public void addOnRotateListener(ClockHandView.d dVar) {
        this.f25421B.addOnRotateListener(dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i8) {
        super.onVisibilityChanged(view, i8);
        if (view == this && i8 == 0) {
            t();
        }
    }

    @Override // com.google.android.material.timepicker.d
    public void setActiveSelection(int i8) {
        this.f25425z.setChecked(i8 == 12);
        this.f25420A.setChecked(i8 == 10);
    }

    public void setAnimateOnTouchUp(boolean z8) {
        this.f25421B.setAnimateOnTouchUp(z8);
    }

    @Override // com.google.android.material.timepicker.d
    public void setHandRotation(float f8) {
        this.f25421B.setHandRotation(f8);
    }

    public void setHourClickDelegate(C0923a c0923a) {
        AbstractC0985p0.setAccessibilityDelegate(this.f25425z, c0923a);
    }

    public void setMinuteHourDelegate(C0923a c0923a) {
        AbstractC0985p0.setAccessibilityDelegate(this.f25420A, c0923a);
    }

    public void setOnActionUpListener(ClockHandView.c cVar) {
        this.f25421B.setOnActionUpListener(cVar);
    }

    @Override // com.google.android.material.timepicker.d
    public void setValues(String[] strArr, int i8) {
        this.f25422C.setValues(strArr, i8);
    }

    public void showToggle() {
        this.f25423D.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.d
    public void updateTime(int i8, int i9, int i10) {
        this.f25423D.check(i8 == 1 ? J2.f.material_clock_period_pm_button : J2.f.material_clock_period_am_button);
        Locale locale = getResources().getConfiguration().locale;
        String str = String.format(locale, com.google.android.material.timepicker.c.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i10));
        String str2 = String.format(locale, com.google.android.material.timepicker.c.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i9));
        this.f25425z.setText(str);
        this.f25420A.setText(str2);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setHandRotation(float f8, boolean z8) {
        this.f25421B.setHandRotation(f8, z8);
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f25424E = new a();
        LayoutInflater.from(context).inflate(h.material_timepicker, this);
        this.f25422C = (ClockFaceView) findViewById(J2.f.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(J2.f.material_clock_period_toggle);
        this.f25423D = materialButtonToggleGroup;
        materialButtonToggleGroup.addOnButtonCheckedListener(new b());
        this.f25425z = (Chip) findViewById(J2.f.material_minute_tv);
        this.f25420A = (Chip) findViewById(J2.f.material_hour_tv);
        this.f25421B = (ClockHandView) findViewById(J2.f.material_clock_hand);
        s();
        r();
    }
}
