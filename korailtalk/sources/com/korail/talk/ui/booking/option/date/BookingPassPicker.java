package com.korail.talk.ui.booking.option.date;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import z4.t;

/* loaded from: classes.dex */
public class BookingPassPicker extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private int f27807a;

    /* renamed from: b, reason: collision with root package name */
    private String[] f27808b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f27809c;

    /* renamed from: d, reason: collision with root package name */
    private ImageButton f27810d;

    /* renamed from: e, reason: collision with root package name */
    private ImageButton f27811e;

    /* renamed from: f, reason: collision with root package name */
    private a f27812f;

    public interface a {
        void onItemChanged(BookingPassPicker bookingPassPicker, int i8);
    }

    public BookingPassPicker(Context context) {
        super(context);
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String[] strArr = this.f27808b;
        if (strArr == null || strArr.length == 0) {
            return;
        }
        int i8 = this.f27807a;
        if (i8 + 1 <= strArr.length - 1) {
            this.f27807a = i8 + 1;
        } else {
            this.f27807a = 0;
        }
        this.f27809c.setText(strArr[this.f27807a]);
        t.e("+ plusBtn.onClick(): curIdx=" + this.f27807a);
        a aVar = this.f27812f;
        if (aVar != null) {
            aVar.onItemChanged(this, this.f27807a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String[] strArr = this.f27808b;
        if (strArr == null || strArr.length == 0) {
            return;
        }
        int i8 = this.f27807a;
        if (i8 - 1 >= 0) {
            this.f27807a = i8 - 1;
        } else {
            this.f27807a = strArr.length - 1;
        }
        this.f27809c.setText(strArr[this.f27807a]);
        t.e("+ plusBtn.onClick(): curIdx=" + this.f27807a);
        a aVar = this.f27812f;
        if (aVar != null) {
            aVar.onItemChanged(this, this.f27807a);
        }
    }

    protected void c() {
        View.inflate(getContext(), AbstractC5957h.booking_date_picker, this);
        this.f27809c = (TextView) findViewById(AbstractC5955f.valueTxt);
        ImageButton imageButton = (ImageButton) findViewById(AbstractC5955f.plusBtn);
        this.f27810d = imageButton;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: S4.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                this.f4634a.d(view);
            }
        });
        ImageButton imageButton2 = (ImageButton) findViewById(AbstractC5955f.minusBtn);
        this.f27811e = imageButton2;
        imageButton2.setOnClickListener(new View.OnClickListener() { // from class: S4.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                this.f4635a.e(view);
            }
        });
    }

    public void select(int i8) {
        String[] strArr = this.f27808b;
        if (strArr == null || i8 < 0 || i8 > strArr.length - 1) {
            return;
        }
        this.f27807a = i8;
        this.f27809c.setText(strArr[i8]);
    }

    public void setEntries(String[] strArr) {
        this.f27808b = strArr;
        if (strArr == null || strArr.length != 1) {
            this.f27810d.setVisibility(0);
            this.f27810d.setEnabled(true);
            this.f27811e.setVisibility(0);
            this.f27811e.setEnabled(true);
        } else {
            this.f27810d.setVisibility(4);
            this.f27810d.setEnabled(false);
            this.f27811e.setVisibility(4);
            this.f27811e.setEnabled(false);
        }
        select(0);
    }

    public void setFocus(boolean z8) {
        this.f27809c.setSelected(z8);
    }

    public void setOnItemChangeListener(a aVar) {
        this.f27812f = aVar;
    }

    public BookingPassPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public BookingPassPicker(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        c();
    }
}
