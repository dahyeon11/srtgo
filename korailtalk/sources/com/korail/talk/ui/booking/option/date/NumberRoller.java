package com.korail.talk.ui.booking.option.date;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import z4.C6630d;

/* loaded from: classes.dex */
public class NumberRoller extends LinearLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private int f27820a;

    /* renamed from: b, reason: collision with root package name */
    private String f27821b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f27822c;

    /* renamed from: d, reason: collision with root package name */
    ImageButton f27823d;

    /* renamed from: e, reason: collision with root package name */
    ImageButton f27824e;

    /* renamed from: f, reason: collision with root package name */
    private a f27825f;

    public interface a {
        void tryToRoll(NumberRoller numberRoller, int i8);
    }

    public NumberRoller(Context context) {
        super(context);
        this.f27821b = "";
        a();
    }

    protected void a() {
        View.inflate(getContext(), AbstractC5957h.booking_date_picker, this);
        this.f27822c = (TextView) findViewById(AbstractC5955f.valueTxt);
        ImageButton imageButton = (ImageButton) findViewById(AbstractC5955f.plusBtn);
        this.f27823d = imageButton;
        imageButton.setOnClickListener(this);
        ImageButton imageButton2 = (ImageButton) findViewById(AbstractC5955f.minusBtn);
        this.f27824e = imageButton2;
        imageButton2.setOnClickListener(this);
    }

    public int getValue() {
        return this.f27820a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.plusBtn == id) {
            if (C6630d.isNotNull(this.f27825f)) {
                this.f27825f.tryToRoll(this, 1);
            }
        } else if (AbstractC5955f.minusBtn == id && C6630d.isNotNull(this.f27825f)) {
            this.f27825f.tryToRoll(this, -1);
        }
    }

    public void setFocus(boolean z8) {
        this.f27822c.setSelected(z8);
    }

    public void setMinusBtnContentDescription(String str) {
        this.f27824e.setContentDescription(str);
    }

    public void setNumberRollerListener(a aVar) {
        this.f27825f = aVar;
    }

    public void setPlusBtnContentDescription(String str) {
        this.f27823d.setContentDescription(str);
    }

    public void setSuffix(String str) {
        if (str == null) {
            str = "";
        }
        this.f27821b = str;
    }

    public void setValue(int i8) {
        this.f27820a = i8;
        this.f27822c.setText(String.valueOf(this.f27820a) + this.f27821b);
    }

    public NumberRoller(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27821b = "";
        a();
    }

    public NumberRoller(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f27821b = "";
        a();
    }
}
