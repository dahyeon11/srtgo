package com.korail.talk.ui.booking.option.date;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.korail.talk.data.vo.AvailableDates;
import com.korail.talk.ui.booking.option.date.NumberRoller;
import java.util.Calendar;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import v4.InterfaceC6431a;

/* loaded from: classes.dex */
public class CalendarManualPicker extends FrameLayout implements NumberRoller.a {

    /* renamed from: a, reason: collision with root package name */
    private NumberRoller f27813a;

    /* renamed from: b, reason: collision with root package name */
    private NumberRoller f27814b;

    /* renamed from: c, reason: collision with root package name */
    private NumberRoller f27815c;

    /* renamed from: d, reason: collision with root package name */
    private NumberRoller f27816d;

    /* renamed from: e, reason: collision with root package name */
    private AvailableDates f27817e;

    /* renamed from: f, reason: collision with root package name */
    private Calendar f27818f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC6431a f27819g;

    public CalendarManualPicker(Context context) {
        super(context);
        a();
    }

    private void a() {
        View.inflate(getContext(), AbstractC5957h.calendar_manual_picker, this);
        NumberRoller numberRoller = (NumberRoller) findViewById(AbstractC5955f.yearRoller);
        this.f27813a = numberRoller;
        numberRoller.setSuffix(getContext().getString(AbstractC5959j.normal_booking_year));
        this.f27813a.setNumberRollerListener(this);
        this.f27813a.setPlusBtnContentDescription(getContext().getString(AbstractC5959j.booking_inc_year));
        this.f27813a.setMinusBtnContentDescription(getContext().getString(AbstractC5959j.booking_desc_year));
        NumberRoller numberRoller2 = (NumberRoller) findViewById(AbstractC5955f.monthRoller);
        this.f27814b = numberRoller2;
        numberRoller2.setSuffix(getContext().getString(AbstractC5959j.normal_booking_month));
        this.f27814b.setNumberRollerListener(this);
        this.f27814b.setPlusBtnContentDescription(getContext().getString(AbstractC5959j.booking_inc_month));
        this.f27814b.setMinusBtnContentDescription(getContext().getString(AbstractC5959j.booking_desc_month));
        NumberRoller numberRoller3 = (NumberRoller) findViewById(AbstractC5955f.dayRoller);
        this.f27815c = numberRoller3;
        numberRoller3.setSuffix(getContext().getString(AbstractC5959j.normal_booking_day));
        this.f27815c.setNumberRollerListener(this);
        this.f27815c.setPlusBtnContentDescription(getContext().getString(AbstractC5959j.booking_inc_day));
        this.f27815c.setMinusBtnContentDescription(getContext().getString(AbstractC5959j.booking_desc_day));
        NumberRoller numberRoller4 = (NumberRoller) findViewById(AbstractC5955f.hourRoller);
        this.f27816d = numberRoller4;
        numberRoller4.setSuffix(getContext().getString(AbstractC5959j.normal_booking_hour));
        this.f27816d.setNumberRollerListener(this);
        this.f27816d.setPlusBtnContentDescription(getContext().getString(AbstractC5959j.booking_inc_hour));
        this.f27816d.setMinusBtnContentDescription(getContext().getString(AbstractC5959j.booking_desc_hour));
    }

    public void looseFocus() {
        this.f27813a.setFocus(false);
        this.f27814b.setFocus(false);
        this.f27815c.setFocus(false);
        this.f27816d.setFocus(false);
    }

    public void setAvailableDates(InterfaceC6431a interfaceC6431a, AvailableDates availableDates) {
        this.f27819g = interfaceC6431a;
        this.f27817e = availableDates;
    }

    public void setHourVisible(boolean z8) {
        if (z8) {
            this.f27816d.setVisibility(0);
        } else {
            this.f27816d.setVisibility(8);
        }
    }

    public void setSelectedDate(Calendar calendar) {
        this.f27818f = calendar;
        this.f27813a.setValue(calendar.get(1));
        this.f27814b.setValue(calendar.get(2) + 1);
        this.f27815c.setValue(calendar.get(5));
        this.f27816d.setValue(calendar.get(11));
    }

    @Override // com.korail.talk.ui.booking.option.date.NumberRoller.a
    public void tryToRoll(NumberRoller numberRoller, int i8) {
        Calendar calendar = (Calendar) this.f27818f.clone();
        while (this.f27817e.isInAvailableRange(calendar)) {
            if (numberRoller == this.f27813a) {
                calendar.add(1, i8);
                looseFocus();
                this.f27813a.setFocus(true);
            } else if (numberRoller == this.f27814b) {
                calendar.add(2, i8);
                looseFocus();
                this.f27814b.setFocus(true);
            } else if (numberRoller == this.f27815c) {
                calendar.add(5, i8);
                looseFocus();
                this.f27815c.setFocus(true);
            } else if (numberRoller == this.f27816d) {
                calendar.add(11, i8);
                looseFocus();
                this.f27816d.setFocus(true);
            }
            if (this.f27817e.isAvailableDate(calendar)) {
                setSelectedDate(calendar);
                InterfaceC6431a interfaceC6431a = this.f27819g;
                if (interfaceC6431a != null) {
                    interfaceC6431a.onSelectDate((Calendar) calendar.clone());
                    return;
                }
                return;
            }
        }
    }

    public CalendarManualPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public CalendarManualPicker(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        a();
    }
}
