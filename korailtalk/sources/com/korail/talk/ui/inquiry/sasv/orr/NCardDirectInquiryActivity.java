package com.korail.talk.ui.inquiry.sasv.orr;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.korail.talk.network.response.certification.ReservationResponse;
import g5.e;
import j5.AbstractActivityC5829b;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import r4.p;
import r4.s;
import z4.C6630d;
import z4.C6637k;
import z4.N;
import z4.O;

/* loaded from: classes.dex */
public class NCardDirectInquiryActivity extends AbstractActivityC5829b {
    /* JADX INFO: Access modifiers changed from: private */
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
        String stringExtra = getIntent().getStringExtra("TRAIN_GROUP_CODE");
        l2(false, O.getTrainGroupFilterIndex(stringExtra));
        ArrayList arrayList = new ArrayList();
        arrayList.add(p.DEFAULT.getName());
        arrayList.add(p.NORMAL_FREE.getName());
        if (s.ITX_YOUTH.getCode().equals(stringExtra)) {
            arrayList.add(p.SECOND_FLOOR.getName());
            arrayList.add(p.BICYCLE.getName());
        }
        g2(true, arrayList);
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
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(string).setButtonListener(new DialogInterface.OnClickListener() { // from class: m5.a
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i9) {
                        this.f34114a.t2(dialogInterface, i9);
                    }
                }).showDialog();
            } else {
                K0();
            }
        }
    }

    @Override // j5.AbstractActivityC5829b, i5.AbstractActivityC5704d, h5.AbstractActivityC5621k, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
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

    @Override // i5.AbstractActivityC5704d, h5.AbstractActivityC5631u
    protected void j2(s sVar) {
    }
}
