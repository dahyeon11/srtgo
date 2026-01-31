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
import z4.C;
import z4.C6627a;
import z4.C6630d;
import z4.N;

/* loaded from: classes.dex */
public class WoorimorePointView extends C6542b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private boolean f29529a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f29530b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f29531c;

    /* renamed from: d, reason: collision with root package name */
    private Bundle f29532d;

    /* renamed from: e, reason: collision with root package name */
    private a f29533e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f29534f;

    /* renamed from: g, reason: collision with root package name */
    private EditText f29535g;

    /* renamed from: h, reason: collision with root package name */
    private EditText f29536h;

    /* renamed from: i, reason: collision with root package name */
    private EditText f29537i;

    /* renamed from: j, reason: collision with root package name */
    private EditText f29538j;

    /* renamed from: k, reason: collision with root package name */
    private EditText f29539k;

    /* renamed from: l, reason: collision with root package name */
    private EditText f29540l;

    /* renamed from: m, reason: collision with root package name */
    private EditText f29541m;

    /* renamed from: n, reason: collision with root package name */
    private EditText f29542n;

    public interface a {
        void onRequestApply(int i8, Bundle bundle);

        void onRequestQuery(int i8, Bundle bundle);
    }

    public WoorimorePointView(Context context) {
        super(context);
        g();
    }

    private void g() {
        h();
        j();
        i();
    }

    private Bundle getApplyPointData() {
        Bundle bundle = new Bundle();
        bundle.putInt("USE_POINT", getInputPoints());
        return bundle;
    }

    private void h() {
        this.f29531c = new Bundle();
        this.f29532d = new Bundle();
    }

    private void i() {
        this.f29536h.setTransformationMethod(new C6467a());
        this.f29537i.setTransformationMethod(new C6467a());
        this.f29541m.setTransformationMethod(new C6467a());
        this.f29535g.addTextChangedListener(new C6491a(4, this.f29536h));
        this.f29536h.addTextChangedListener(new C6491a(4, this.f29537i));
        this.f29537i.addTextChangedListener(new C6491a(4, this.f29538j));
        this.f29538j.addTextChangedListener(new C6491a(4, this.f29539k));
        this.f29539k.addTextChangedListener(new C6491a(2, this.f29540l));
        this.f29540l.addTextChangedListener(new C6491a(4, this.f29541m));
        findViewById(AbstractC5955f.queryBtn).setOnClickListener(this);
        findViewById(AbstractC5955f.applyBtn).setOnClickListener(this);
    }

    private void j() {
        View.inflate(getContext(), AbstractC5957h.view_woorimore_point, this);
        this.f29534f = (TextView) findViewById(AbstractC5955f.availablePointsTxt);
        this.f29535g = (EditText) findViewById(AbstractC5955f.cardNoEdit0);
        this.f29536h = (EditText) findViewById(AbstractC5955f.cardNoEdit1);
        this.f29537i = (EditText) findViewById(AbstractC5955f.cardNoEdit2);
        this.f29538j = (EditText) findViewById(AbstractC5955f.cardNoEdit3);
        this.f29539k = (EditText) findViewById(AbstractC5955f.cardMonthEdit);
        this.f29540l = (EditText) findViewById(AbstractC5955f.cardYearEdit);
        this.f29541m = (EditText) findViewById(AbstractC5955f.cardPwdEdit);
        this.f29542n = (EditText) findViewById(AbstractC5955f.usePointsEdit);
        C6627a.setEditTextDescription(getContext().getApplicationContext(), this.f29535g, b(AbstractC5959j.description_card_input_0));
        C6627a.setEditTextDescription(getContext().getApplicationContext(), this.f29536h, b(AbstractC5959j.description_card_input_1));
        C6627a.setEditTextDescription(getContext().getApplicationContext(), this.f29537i, b(AbstractC5959j.description_card_input_2));
        C6627a.setEditTextDescription(getContext().getApplicationContext(), this.f29538j, b(AbstractC5959j.description_card_input_3));
        C6627a.setEditTextDescription(getContext().getApplicationContext(), this.f29539k, b(AbstractC5959j.description_card_mm));
        C6627a.setEditTextDescription(getContext().getApplicationContext(), this.f29540l, b(AbstractC5959j.description_card_yyyy));
        C6627a.setEditTextDescription(getContext().getApplicationContext(), this.f29541m, b(AbstractC5959j.description_card_pw));
        C6627a.setEditTextDescription(getContext().getApplicationContext(), this.f29542n);
    }

    public Bundle getApplyCardData() {
        return this.f29531c;
    }

    public int getApplyPoint() {
        return this.f29532d.getInt("USE_POINT", 0);
    }

    public int getInputPoints() {
        if (e(this.f29542n).isEmpty()) {
            return 0;
        }
        return Integer.parseInt(C.getNumber(e(this.f29542n)));
    }

    public Bundle getWoorimorPointData() {
        Bundle bundle = new Bundle();
        bundle.putString("CARD_NO_1", e(this.f29535g));
        bundle.putString("CARD_NO_2", e(this.f29536h));
        bundle.putString("CARD_NO_3", e(this.f29537i));
        bundle.putString("CARD_NO_4", e(this.f29538j));
        bundle.putString("CARD_MONTH", e(this.f29539k));
        bundle.putString("CARD_YEAR", e(this.f29540l));
        bundle.putString("CARD_PASSWORD", e(this.f29541m));
        return bundle;
    }

    public boolean isApplyPoint() {
        return this.f29530b;
    }

    public boolean isApplyRequest() {
        return this.f29529a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.queryBtn != id) {
            if (AbstractC5955f.applyBtn == id && C6630d.isNotNull(this.f29533e)) {
                Bundle bundle = new Bundle();
                bundle.putInt("INPUT_POINT", getInputPoints());
                bundle.putInt("ENABLE_POINT", Integer.parseInt(C.getNumber(e(this.f29534f))));
                this.f29533e.onRequestApply(2, bundle);
                return;
            }
            return;
        }
        if (C6630d.isNotNull(this.f29533e)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("CARD_NO_1", e(this.f29535g));
            bundle2.putString("CARD_NO_2", e(this.f29536h));
            bundle2.putString("CARD_NO_3", e(this.f29537i));
            bundle2.putString("CARD_NO_4", e(this.f29538j));
            bundle2.putString("CARD_MONTH", e(this.f29539k));
            bundle2.putString("CARD_YEAR", e(this.f29540l));
            bundle2.putString("CARD_PASSWORD", e(this.f29541m));
            this.f29533e.onRequestQuery(2, bundle2);
        }
    }

    public void setApplyCardData() {
        this.f29535g.setText(this.f29531c.getString("CARD_NO_1"));
        this.f29536h.setText(this.f29531c.getString("CARD_NO_2"));
        this.f29537i.setText(this.f29531c.getString("CARD_NO_3"));
        this.f29538j.setText(this.f29531c.getString("CARD_NO_4"));
        this.f29539k.setText(this.f29531c.getString("CARD_MONTH"));
        this.f29540l.setText(this.f29531c.getString("CARD_YEAR"));
        this.f29541m.setText(this.f29531c.getString("CARD_PASSWORD"));
    }

    public void setApplyPoint(boolean z8) {
        if (z8) {
            this.f29532d = getApplyPointData();
        } else {
            this.f29532d.clear();
        }
        this.f29530b = z8;
    }

    public void setApplyRequest(boolean z8) {
        if (z8) {
            this.f29531c = getWoorimorPointData();
        } else {
            this.f29531c.clear();
        }
        this.f29529a = z8;
        setApplyPoint(false);
        setUsePointsEdit();
    }

    public void setApplyUsePoints() {
        setUsePointsEdit(this.f29532d.getInt("USE_POINT", 0));
    }

    public void setAvailablePoints(int i8) {
        this.f29534f.setText(c(AbstractC5959j.common_points, N.getDecimalFormatString(i8)));
    }

    public void setOnActionListener(a aVar) {
        this.f29533e = aVar;
    }

    public void setUsePointsEdit(int i8) {
        this.f29542n.setText(String.valueOf(i8));
    }

    public void setUsePointsEdit() {
        this.f29542n.setText((CharSequence) null);
    }

    public WoorimorePointView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }
}
