package com.korail.talk.view.payment.point;

import android.content.Context;
import android.os.Bundle;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.korail.talk.view.CCheckBox;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import y6.C6542b;
import z4.C;
import z4.C6627a;
import z4.C6630d;
import z4.C6637k;
import z4.N;

/* loaded from: classes.dex */
public class LPointView extends C6542b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private boolean f29504a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f29505b;

    /* renamed from: c, reason: collision with root package name */
    private String f29506c;

    /* renamed from: d, reason: collision with root package name */
    private Bundle f29507d;

    /* renamed from: e, reason: collision with root package name */
    private a f29508e;

    /* renamed from: f, reason: collision with root package name */
    private CCheckBox f29509f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f29510g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f29511h;

    /* renamed from: i, reason: collision with root package name */
    private EditText f29512i;

    /* renamed from: j, reason: collision with root package name */
    private EditText f29513j;

    public interface a {
        void onRequestApply(int i8, Bundle bundle);

        void onRequestAuth(int i8, Bundle bundle);
    }

    public LPointView(Context context) {
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
        this.f29507d = new Bundle();
    }

    private void i() {
        this.f29509f = (CCheckBox) findViewById(AbstractC5955f.cb_private_collection);
        this.f29510g = (TextView) findViewById(AbstractC5955f.tv_private_collection);
        this.f29511h = (TextView) findViewById(AbstractC5955f.availablePointsTxt);
        this.f29512i = (EditText) findViewById(AbstractC5955f.et_password);
        this.f29513j = (EditText) findViewById(AbstractC5955f.usePointsEdit);
        this.f29510g.setText(N.applySpannable(b(AbstractC5959j.dialog_payment_private_collection_title), new UnderlineSpan()));
        this.f29510g.setOnClickListener(this);
        findViewById(AbstractC5955f.confirmBtn).setOnClickListener(this);
        findViewById(AbstractC5955f.applyBtn).setOnClickListener(this);
        this.f29509f.setContentDescription(this.f29510g.getText().toString());
        C6627a.setEditTextDescription(getContext().getApplicationContext(), this.f29513j);
    }

    private void j() {
        View.inflate(getContext(), AbstractC5957h.view_l_point, this);
    }

    public int getApplyPoint() {
        return this.f29507d.getInt("USE_POINT", 0);
    }

    public String getCustomerNo() {
        return this.f29506c;
    }

    public int getInputPoints() {
        if (e(this.f29513j).isEmpty()) {
            return 0;
        }
        return Integer.parseInt(C.getNumber(e(this.f29513j)));
    }

    public boolean isApplyPoint() {
        return this.f29505b;
    }

    public boolean isApplyRequest() {
        return this.f29504a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.confirmBtn == id) {
            if (C6630d.isNotNull(this.f29508e)) {
                if (!this.f29509f.isChecked()) {
                    C6637k.getCDialog(getContext(), 1001, 1, b(AbstractC5959j.dialog_title)).setContent(b(AbstractC5959j.dialog_payment_msg)).showDialog();
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("CARD_PASSWORD", this.f29512i.getText().toString());
                this.f29508e.onRequestAuth(5, bundle);
                return;
            }
            return;
        }
        if (AbstractC5955f.applyBtn != id) {
            if (AbstractC5955f.tv_private_collection == id && C6630d.isNotNull(this.f29508e)) {
                C6637k.getPDialog(getContext(), 1001, 1, b(AbstractC5959j.dialog_payment_private_collection_title)).setStringArray(d(AbstractC5952c.private_collection_lpoint)).showDialog();
                return;
            }
            return;
        }
        if (C6630d.isNotNull(this.f29508e)) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("INPUT_POINT", getInputPoints());
            bundle2.putInt("ENABLE_POINT", Integer.parseInt(C.getNumber(e(this.f29511h))));
            this.f29508e.onRequestApply(5, bundle2);
        }
    }

    public void setApplyPoint(boolean z8) {
        if (z8) {
            this.f29507d = getApplyPointData();
        } else {
            this.f29507d.clear();
        }
        this.f29505b = z8;
    }

    public void setApplyRequest(boolean z8) {
        this.f29504a = z8;
        setApplyPoint(false);
        setUsePointsEdit();
    }

    public void setApplyUsePoints() {
        setUsePointsEdit(this.f29507d.getInt("USE_POINT", 0));
    }

    public void setAvailablePoints(int i8) {
        this.f29511h.setText(c(AbstractC5959j.common_points, N.getDecimalFormatString(i8)));
    }

    public void setCustomerNo(String str) {
        this.f29506c = str;
    }

    public void setOnActionListener(a aVar) {
        this.f29508e = aVar;
    }

    public void setUsePointsEdit(int i8) {
        this.f29513j.setText(String.valueOf(i8));
    }

    public void setUsePointsEdit() {
        this.f29513j.setText((CharSequence) null);
    }

    public LPointView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }
}
