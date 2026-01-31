package com.korail.talk.view.payment.point;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import w4.C6467a;
import x4.C6491a;
import y6.C6542b;
import z4.C6627a;
import z4.C6630d;
import z4.N;

/* loaded from: classes.dex */
public class CityPointView extends C6542b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private boolean f29474a;

    /* renamed from: b, reason: collision with root package name */
    private Bundle f29475b;

    /* renamed from: c, reason: collision with root package name */
    private a f29476c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f29477d;

    /* renamed from: e, reason: collision with root package name */
    private EditText f29478e;

    /* renamed from: f, reason: collision with root package name */
    private EditText f29479f;

    /* renamed from: g, reason: collision with root package name */
    private EditText f29480g;

    /* renamed from: h, reason: collision with root package name */
    private EditText f29481h;

    /* renamed from: i, reason: collision with root package name */
    private EditText f29482i;

    /* renamed from: j, reason: collision with root package name */
    private EditText f29483j;

    public interface a {
        void onRequestQuery(int i8, Bundle bundle);
    }

    public CityPointView(Context context) {
        super(context);
        g();
    }

    private void g() {
        View.inflate(getContext(), AbstractC5957h.view_city_point, this);
        h();
        j();
        i();
    }

    private void h() {
        this.f29475b = new Bundle();
    }

    private void i() {
        this.f29479f.setTransformationMethod(new C6467a());
        this.f29480g.setTransformationMethod(new C6467a());
        this.f29478e.addTextChangedListener(new C6491a(4, this.f29479f));
        this.f29479f.addTextChangedListener(new C6491a(4, this.f29480g));
        this.f29480g.addTextChangedListener(new C6491a(4, this.f29481h));
        this.f29481h.addTextChangedListener(new C6491a(4, this.f29482i));
        this.f29482i.addTextChangedListener(new C6491a(2, this.f29483j));
        findViewById(AbstractC5955f.queryBtn).setOnClickListener(this);
    }

    private void j() {
        this.f29478e = (EditText) findViewById(AbstractC5955f.cardNoEdit0);
        this.f29479f = (EditText) findViewById(AbstractC5955f.cardNoEdit1);
        this.f29480g = (EditText) findViewById(AbstractC5955f.cardNoEdit2);
        this.f29481h = (EditText) findViewById(AbstractC5955f.cardNoEdit3);
        this.f29482i = (EditText) findViewById(AbstractC5955f.cardMonthEdit);
        this.f29483j = (EditText) findViewById(AbstractC5955f.cardYearEdit);
        this.f29477d = (TextView) findViewById(AbstractC5955f.availablePointsTxt);
        C6627a.setEditTextDescription(getContext().getApplicationContext(), this.f29478e, b(AbstractC5959j.description_card_input_0));
        C6627a.setEditTextDescription(getContext().getApplicationContext(), this.f29479f, b(AbstractC5959j.description_card_input_1));
        C6627a.setEditTextDescription(getContext().getApplicationContext(), this.f29480g, b(AbstractC5959j.description_card_input_2));
        C6627a.setEditTextDescription(getContext().getApplicationContext(), this.f29481h, b(AbstractC5959j.description_card_input_3));
        C6627a.setEditTextDescription(getContext().getApplicationContext(), this.f29482i, b(AbstractC5959j.description_card_mm));
        C6627a.setEditTextDescription(getContext().getApplicationContext(), this.f29483j, b(AbstractC5959j.description_card_yyyy));
    }

    public Bundle getApplyCardData() {
        return this.f29475b;
    }

    public Bundle getCityPointCardData() {
        Bundle bundle = new Bundle();
        bundle.putString("CARD_NO_1", e(this.f29478e));
        bundle.putString("CARD_NO_2", e(this.f29479f));
        bundle.putString("CARD_NO_3", e(this.f29480g));
        bundle.putString("CARD_NO_4", e(this.f29481h));
        bundle.putString("CARD_MONTH", e(this.f29482i));
        bundle.putString("CARD_YEAR", e(this.f29483j));
        return bundle;
    }

    public boolean isApplyRequest() {
        return this.f29474a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.queryBtn == view.getId() && C6630d.isNotNull(this.f29476c)) {
            Bundle bundle = new Bundle();
            bundle.putString("CARD_NO_1", e(this.f29478e));
            bundle.putString("CARD_NO_2", e(this.f29479f));
            bundle.putString("CARD_NO_3", e(this.f29480g));
            bundle.putString("CARD_NO_4", e(this.f29481h));
            bundle.putString("CARD_MONTH", e(this.f29482i));
            bundle.putString("CARD_YEAR", e(this.f29483j));
            this.f29476c.onRequestQuery(3, bundle);
        }
    }

    public void setApplyCardData() {
        this.f29478e.setText(this.f29475b.getString("CARD_NO_1"));
        this.f29479f.setText(this.f29475b.getString("CARD_NO_2"));
        this.f29480g.setText(this.f29475b.getString("CARD_NO_3"));
        this.f29481h.setText(this.f29475b.getString("CARD_NO_4"));
        this.f29482i.setText(this.f29475b.getString("CARD_MONTH"));
        this.f29483j.setText(this.f29475b.getString("CARD_YEAR"));
    }

    public void setApplyRequest(boolean z8) {
        if (z8) {
            this.f29475b = getCityPointCardData();
        } else {
            this.f29475b.clear();
        }
        this.f29474a = z8;
    }

    public void setAvailablePoints(int i8) {
        this.f29477d.setText(c(AbstractC5959j.common_points, N.getDecimalFormatString(i8)));
    }

    public void setOnActionListener(a aVar) {
        this.f29476c = aVar;
    }

    public CityPointView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }
}
