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
public class KTXMileageView extends C6542b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private boolean f29494a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f29495b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f29496c;

    /* renamed from: d, reason: collision with root package name */
    private a f29497d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f29498e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f29499f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f29500g;

    /* renamed from: h, reason: collision with root package name */
    private EditText f29501h;

    /* renamed from: i, reason: collision with root package name */
    private int f29502i;

    /* renamed from: j, reason: collision with root package name */
    private int f29503j;

    public interface a {
        void onRequestAllApply(int i8, Bundle bundle);

        void onRequestApply(int i8, Bundle bundle);

        void onRequestQuery(int i8, Bundle bundle);
    }

    public KTXMileageView(Context context) {
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
        this.f29496c = new Bundle();
    }

    private void i() {
        this.f29498e = (TextView) findViewById(AbstractC5955f.availablePointsTxt);
        this.f29499f = (TextView) findViewById(AbstractC5955f.available_ktx_points_txt);
        this.f29500g = (TextView) findViewById(AbstractC5955f.available_samsung_ktx_points_txt);
        this.f29501h = (EditText) findViewById(AbstractC5955f.usePointsEdit);
        findViewById(AbstractC5955f.applyBtn).setOnClickListener(this);
        findViewById(AbstractC5955f.allApplyBtn).setOnClickListener(this);
        C6627a.setEditTextDescription(getContext().getApplicationContext(), this.f29501h);
    }

    private void j() {
        View.inflate(getContext(), AbstractC5957h.view_ktx_mileage, this);
    }

    public int getApplyPoint() {
        return this.f29496c.getInt("USE_POINT", 0);
    }

    public int getInputPoints() {
        if (e(this.f29501h).isEmpty()) {
            return 0;
        }
        return Integer.parseInt(C.getNumber(e(this.f29501h)));
    }

    public String getKTXPoints() {
        return this.f29499f.getText().toString();
    }

    public String getKTXSamsungPoints() {
        return this.f29500g.getText().toString();
    }

    public int getUseKTXPoint() {
        return this.f29502i;
    }

    public int getUseSamsungKTXPoint() {
        return this.f29503j;
    }

    public boolean isApplyPoint() {
        return this.f29495b;
    }

    public boolean isApplyRequest() {
        return this.f29494a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.applyBtn == id) {
            if (C6630d.isNotNull(this.f29497d)) {
                Bundle bundle = new Bundle();
                bundle.putInt("INPUT_POINT", getInputPoints());
                bundle.putInt("ENABLE_POINT", Integer.parseInt(C.getNumber(e(this.f29498e))));
                this.f29497d.onRequestApply(0, bundle);
                return;
            }
            return;
        }
        if (AbstractC5955f.allApplyBtn != id) {
            if (AbstractC5955f.queryBtn == id && C6630d.isNotNull(this.f29497d)) {
                this.f29497d.onRequestQuery(0, new Bundle());
                return;
            }
            return;
        }
        if (C6630d.isNotNull(this.f29497d)) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("ENABLE_POINT", Integer.parseInt(C.getNumber(e(this.f29498e))));
            this.f29497d.onRequestAllApply(0, bundle2);
        }
    }

    public void setApplyPoint(boolean z8) {
        if (z8) {
            this.f29496c = getApplyPointData();
        } else {
            this.f29496c.clear();
        }
        this.f29495b = z8;
    }

    public void setApplyRequest(boolean z8) {
        this.f29494a = z8;
        setApplyPoint(false);
        setUsePointsEdit();
    }

    public void setApplyUsePoints() {
        setUsePointsEdit(this.f29496c.getInt("USE_POINT", 0));
    }

    public void setAvailablePoints() {
        this.f29498e.setText(c(AbstractC5959j.common_points, N.getDecimalFormatString(0)));
        this.f29499f.setText(0);
        this.f29500g.setText(0);
    }

    public void setOnActionListener(a aVar) {
        this.f29497d = aVar;
    }

    public void setUsePoints(int i8, int i9) {
        this.f29502i = i8;
        this.f29503j = i9;
    }

    public void setUsePointsEdit(int i8) {
        this.f29501h.setText(String.valueOf(i8));
    }

    public void setUsePointsEdit() {
        this.f29501h.setText((CharSequence) null);
    }

    public KTXMileageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }

    public void setAvailablePoints(int i8, String str, String str2) {
        this.f29498e.setText(c(AbstractC5959j.common_points, Integer.valueOf(i8)));
        this.f29499f.setText(str);
        this.f29500g.setText(str2);
    }
}
