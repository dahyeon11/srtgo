package com.korail.talk.ui.inquiry.sasv.sar;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.korail.talk.network.response.certification.ReservationResponse;
import g5.e;
import j5.AbstractActivityC5830c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.C6637k;
import z4.J;
import z4.N;

/* loaded from: classes.dex */
public class APassDirectInquiryActivity extends AbstractActivityC5830c {
    public /* synthetic */ void t2(DialogInterface dialogInterface, int i8) {
        K0();
    }

    @Override // h5.AbstractActivityC5631u
    protected boolean D1() {
        return false;
    }

    @Override // h5.AbstractActivityC5621k
    protected void K0() {
        q2();
    }

    @Override // h5.AbstractActivityC5621k
    protected void O0(ReservationResponse reservationResponse) {
        r2(reservationResponse);
    }

    @Override // h5.AbstractActivityC5631u
    protected void m2() {
        super.m2();
        Z1();
        l2(true, 0);
        g2(false, J.getTrainSeatFilterData());
        d2();
    }

    @Override // h5.AbstractActivityC5631u, com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.bookingBtn != view.getId()) {
            super.onClick(view);
            return;
        }
        int i8 = this.f31585k;
        if (i8 > -1) {
            String string = ((Bundle) this.f31587m.get(i8)).getString(e.KEY_POPUP_MESSAGE);
            if (N.isNotNull(string)) {
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(string).setButtonListener(new DialogInterface.OnClickListener() { // from class: n5.a
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i9) {
                        this.f34261a.t2(dialogInterface, i9);
                    }
                }).showDialog();
            } else {
                K0();
            }
        }
    }

    @Override // j5.AbstractActivityC5830c, i5.AbstractActivityC5704d, h5.AbstractActivityC5621k, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_train_inquiry);
        if (C6630d.isNull(bundle)) {
            m2();
            setText();
            W1();
            p2();
        }
    }

    @Override // h5.AbstractActivityC5631u
    protected void setText() {
        super.setText();
        setAppTitle(AbstractC5959j.inquiry_train_inquiry);
        c2("", "");
    }
}
