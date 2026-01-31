package com.korail.talk.ui.booking.option.passenger;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import y6.C6542b;

/* loaded from: classes.dex */
public class PassengerPicker extends C6542b {

    /* renamed from: a, reason: collision with root package name */
    private TextView f27871a;

    /* renamed from: b, reason: collision with root package name */
    private ImageButton f27872b;

    /* renamed from: c, reason: collision with root package name */
    private ImageButton f27873c;

    public PassengerPicker(Context context) {
        super(context);
        g();
    }

    private void g() {
        h();
    }

    private void h() {
        View.inflate(getContext(), AbstractC5957h.passenger_count_picker, this);
        this.f27871a = (TextView) findViewById(AbstractC5955f.valueTxt);
        this.f27872b = (ImageButton) findViewById(AbstractC5955f.plusBtn);
        this.f27873c = (ImageButton) findViewById(AbstractC5955f.minusBtn);
    }

    public String getValue() {
        return e(this.f27871a);
    }

    public void setMinusDescription(String str) {
        this.f27873c.setContentDescription(str);
    }

    public void setMinusEnabled(boolean z8) {
        this.f27873c.setEnabled(z8);
    }

    public void setMinusEventListener(View.OnClickListener onClickListener) {
        this.f27873c.setOnClickListener(onClickListener);
    }

    public void setPlusDescription(String str) {
        this.f27872b.setContentDescription(str);
    }

    public void setPlusEnabled(boolean z8) {
        this.f27872b.setEnabled(z8);
    }

    public void setPlusEventListener(View.OnClickListener onClickListener) {
        this.f27872b.setOnClickListener(onClickListener);
    }

    public void setValue(String str) {
        this.f27871a.setText(str);
    }

    public PassengerPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }

    public PassengerPicker(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        g();
    }
}
