package com.korail.talk.ui.reservation.confirm.activity;

import P5.a;
import Q5.b;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.appcompat.app.g;
import com.korail.talk.data.reservation.CReservationData;
import com.korail.talk.network.dao.pass.CommReservationDao;
import com.korail.talk.ui.payment.PaymentActivity;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import z4.C6630d;

/* loaded from: classes.dex */
public class CReservationConfirmActivity extends a implements CompoundButton.OnCheckedChangeListener {
    private void A0() {
        CommReservationDao.CommReservationResponse.MainInfo mainInfo = ((CReservationData) t0()).getMainInfo();
        if (C6630d.isNotNull(mainInfo)) {
            b bVar = new b();
            bVar.setViewType(1);
            bVar.setMainInfo(mainInfo);
            this.f3746j.add(bVar);
        }
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_commutation_reservation_confirm);
        this.f3748l.setText(AbstractC5959j.common_reservation_cancel);
        this.f3750n.setText(AbstractC5959j.common_pay);
    }

    private void y0() {
        this.f3747k.setVisibility(0);
        this.f3750n.setEnabled(false);
    }

    private void z0() {
        CReservationData cReservationData = (CReservationData) t0();
        CommReservationDao.CommReservationResponse.MainInfo mainInfo = cReservationData.getMainInfo();
        Intent intent = new Intent(getApplicationContext(), (Class<?>) PaymentActivity.class);
        intent.putExtra("PAYMENT_TYPE", cReservationData.getPaymentType());
        intent.putExtra("PAYMENT_REQUEST", (Serializable) cReservationData.getPaymentRequest());
        intent.putExtra("IS_POINT_STEP", true);
        intent.putExtra("RECEIVED_AMOUNT", Integer.parseInt(mainInfo.getH_rcvd_amt()));
        intent.putExtra("DISCOUNT_AMOUNT", 0);
        startActivityForResult(intent, g.FEATURE_SUPPORT_ACTION_BAR_OVERLAY);
        finish();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
        this.f3750n.setEnabled(z8);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        int id = view.getId();
        if (AbstractC5955f.btn_reservation_confirm_left == id) {
            finish();
        } else if (AbstractC5955f.btn_reservation_confirm_right == id) {
            z0();
        }
    }

    @Override // P5.a, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        if (C6630d.isNull(bundle)) {
            u0();
            x0();
            setText();
            v0();
            y0();
        }
    }

    @Override // P5.a
    protected void u0() {
        super.u0();
        A0();
        w0();
    }

    @Override // P5.a
    protected void v0() {
        super.v0();
        ((CheckBox) findViewById(AbstractC5955f.cb_reservation_confirm_agree)).setOnCheckedChangeListener(this);
    }
}
