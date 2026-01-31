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
import y6.C6542b;
import z4.C;
import z4.C6627a;
import z4.C6630d;
import z4.N;

/* loaded from: classes.dex */
public class OkCashBackPointView extends C6542b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private boolean f29514a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f29515b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f29516c;

    /* renamed from: d, reason: collision with root package name */
    private Bundle f29517d;

    /* renamed from: e, reason: collision with root package name */
    private a f29518e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f29519f;

    /* renamed from: g, reason: collision with root package name */
    private EditText f29520g;

    /* renamed from: h, reason: collision with root package name */
    private EditText f29521h;

    /* renamed from: i, reason: collision with root package name */
    private EditText f29522i;

    public interface a {
        void onRequestApply(int i8, Bundle bundle);

        void onRequestApplyPhoneNo(int i8, Bundle bundle);

        void onRequestAuth(int i8, Bundle bundle);
    }

    public OkCashBackPointView(Context context) {
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
        this.f29516c = new Bundle();
        this.f29517d = new Bundle();
    }

    private void i() {
        findViewById(AbstractC5955f.phoneNoInputBtn).setOnClickListener(this);
        findViewById(AbstractC5955f.authBtn).setOnClickListener(this);
        findViewById(AbstractC5955f.applyBtn).setOnClickListener(this);
    }

    private void j() {
        View.inflate(getContext(), AbstractC5957h.view_okcashback_point, this);
        this.f29519f = (TextView) findViewById(AbstractC5955f.availablePointsTxt);
        this.f29520g = (EditText) findViewById(AbstractC5955f.phoneNoEdit);
        this.f29521h = (EditText) findViewById(AbstractC5955f.authNoEdit);
        this.f29522i = (EditText) findViewById(AbstractC5955f.usePointsEdit);
        C6627a.setEditTextDescription(getContext().getApplicationContext(), this.f29520g);
        C6627a.setEditTextDescription(getContext().getApplicationContext(), this.f29521h);
        C6627a.setEditTextDescription(getContext().getApplicationContext(), this.f29522i);
    }

    public Bundle getApplyCardData() {
        Bundle bundle = new Bundle();
        bundle.putString("PHONE_NM", e(this.f29520g));
        bundle.putString("AUTH_NO", e(this.f29521h));
        return bundle;
    }

    public int getApplyPoint() {
        return this.f29517d.getInt("USE_POINT", 0);
    }

    public int getInputPoints() {
        if (e(this.f29522i).isEmpty()) {
            return 0;
        }
        return Integer.parseInt(C.getNumber(e(this.f29522i)));
    }

    public boolean isApplyPoint() {
        return this.f29515b;
    }

    public boolean isApplyRequest() {
        return this.f29514a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.phoneNoInputBtn == id) {
            if (C6630d.isNotNull(this.f29518e)) {
                Bundle bundle = new Bundle();
                bundle.putString("PHONE_NM", e(this.f29520g));
                this.f29518e.onRequestApplyPhoneNo(4, bundle);
                return;
            }
            return;
        }
        if (AbstractC5955f.authBtn == id) {
            if (C6630d.isNotNull(this.f29518e)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("PHONE_NM", e(this.f29520g));
                bundle2.putString("AUTH_NO", e(this.f29521h));
                this.f29518e.onRequestAuth(4, bundle2);
                return;
            }
            return;
        }
        if (AbstractC5955f.applyBtn == id && C6630d.isNotNull(this.f29518e)) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("AUTH_NO", e(this.f29521h));
            bundle3.putInt("INPUT_POINT", getInputPoints());
            bundle3.putInt("ENABLE_POINT", Integer.parseInt(C.getNumber(e(this.f29519f))));
            this.f29518e.onRequestApply(4, bundle3);
        }
    }

    public void setApplyCardData() {
        this.f29520g.setText(this.f29516c.getString("PHONE_NM"));
        this.f29521h.setText(this.f29516c.getString("AUTH_NO"));
    }

    public void setApplyPoint(boolean z8) {
        if (z8) {
            this.f29517d = getApplyPointData();
        } else {
            this.f29517d.clear();
        }
        this.f29515b = z8;
    }

    public void setApplyRequest(boolean z8) {
        if (z8) {
            this.f29516c = getApplyCardData();
        } else {
            this.f29516c.clear();
        }
        this.f29514a = z8;
        setApplyPoint(false);
        setUsePointsEdit();
    }

    public void setApplyUsePoints() {
        setUsePointsEdit(this.f29517d.getInt("USE_POINT", 0));
    }

    public void setAvailablePoints(int i8) {
        this.f29519f.setText(c(AbstractC5959j.common_points, N.getDecimalFormatString(i8)));
    }

    public void setOnActionListener(a aVar) {
        this.f29518e = aVar;
    }

    public void setUsePointsEdit(int i8) {
        this.f29522i.setText(String.valueOf(i8));
    }

    public void setUsePointsEdit() {
        this.f29522i.setText((CharSequence) null);
    }

    public OkCashBackPointView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }
}
