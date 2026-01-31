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
public class RailPointView extends C6542b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private boolean f29523a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f29524b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f29525c;

    /* renamed from: d, reason: collision with root package name */
    private a f29526d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f29527e;

    /* renamed from: f, reason: collision with root package name */
    private EditText f29528f;

    public interface a {
        void onRequestAllApply(int i8, Bundle bundle);

        void onRequestApply(int i8, Bundle bundle);

        void onRequestQuery(int i8, Bundle bundle);
    }

    public RailPointView(Context context) {
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
        this.f29525c = new Bundle();
    }

    private void i() {
        this.f29527e = (TextView) findViewById(AbstractC5955f.availablePointsTxt);
        this.f29528f = (EditText) findViewById(AbstractC5955f.usePointsEdit);
        findViewById(AbstractC5955f.queryBtn).setOnClickListener(this);
        findViewById(AbstractC5955f.applyBtn).setOnClickListener(this);
        findViewById(AbstractC5955f.allApplyBtn).setOnClickListener(this);
        C6627a.setEditTextDescription(getContext().getApplicationContext(), this.f29528f);
    }

    private void j() {
        View.inflate(getContext(), AbstractC5957h.view_rail_point, this);
    }

    public int getApplyPoint() {
        return this.f29525c.getInt("USE_POINT", 0);
    }

    public int getInputPoints() {
        if (e(this.f29528f).isEmpty()) {
            return 0;
        }
        return Integer.parseInt(C.getNumber(e(this.f29528f)));
    }

    public boolean isApplyPoint() {
        return this.f29524b;
    }

    public boolean isApplyRequest() {
        return this.f29523a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.applyBtn == id) {
            if (C6630d.isNotNull(this.f29526d)) {
                Bundle bundle = new Bundle();
                bundle.putInt("INPUT_POINT", getInputPoints());
                bundle.putInt("ENABLE_POINT", Integer.parseInt(C.getNumber(e(this.f29527e))));
                this.f29526d.onRequestApply(1, bundle);
                return;
            }
            return;
        }
        if (AbstractC5955f.allApplyBtn != id) {
            if (AbstractC5955f.queryBtn == id && C6630d.isNotNull(this.f29526d)) {
                this.f29526d.onRequestQuery(1, new Bundle());
                return;
            }
            return;
        }
        if (C6630d.isNotNull(this.f29526d)) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("ENABLE_POINT", Integer.parseInt(C.getNumber(e(this.f29527e))));
            this.f29526d.onRequestAllApply(1, bundle2);
        }
    }

    public void setApplyPoint(boolean z8) {
        if (z8) {
            this.f29525c = getApplyPointData();
        } else {
            this.f29525c.clear();
        }
        this.f29524b = z8;
    }

    public void setApplyRequest(boolean z8) {
        this.f29523a = z8;
        setApplyPoint(false);
        setUsePointsEdit();
    }

    public void setApplyUsePoints() {
        setUsePointsEdit(this.f29525c.getInt("USE_POINT", 0));
    }

    public void setAvailablePoints(int i8) {
        this.f29527e.setText(c(AbstractC5959j.common_points, N.getDecimalFormatString(i8)));
    }

    public void setOnActionListener(a aVar) {
        this.f29526d = aVar;
    }

    public void setUsePointsEdit(int i8) {
        this.f29528f.setText(String.valueOf(i8));
    }

    public void setUsePointsEdit() {
        this.f29528f.setText((CharSequence) null);
    }

    public RailPointView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }
}
