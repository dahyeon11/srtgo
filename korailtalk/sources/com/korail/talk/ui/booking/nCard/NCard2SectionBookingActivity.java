package com.korail.talk.ui.booking.nCard;

import D4.a;
import Q4.g;
import T4.j;
import V4.b;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.korail.talk.network.dao.research.NCardInquiryDao;
import com.korail.talk.network.dao.research.NCardReservationDao;
import com.korail.talk.ui.certification.NCardCertificationActivity;
import com.korail.talk.ui.inquiry.SectionNCardInquiryActivity;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.C6637k;
import z4.M;

/* loaded from: classes.dex */
public class NCard2SectionBookingActivity extends g implements j.a {

    /* renamed from: q, reason: collision with root package name */
    private j f27791q;

    private void D0() {
        this.f4056m = new b[2];
    }

    private void K0() {
        F0();
        H0("B2N19060502", "B2N19060503");
        P0();
        J0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N0(View view, DialogInterface dialogInterface, int i8) {
        scrollToOption(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.korail.talk.network.dao.research.NCardInquiryDao$NCardInquiryRequest[], java.io.Serializable] */
    private void O0() {
        ?? r02 = new NCardInquiryDao.NCardInquiryRequest[this.f4056m.length];
        int i8 = 0;
        while (true) {
            b[] bVarArr = this.f4056m;
            if (i8 >= bVarArr.length) {
                NCardReservationDao.NCardReservationRequest nCardReservationRequest = a.getNCardReservationRequest(this.f4057n);
                nCardReservationRequest.setUserCnt(String.valueOf(1));
                nCardReservationRequest.setCustMgNo(1, this.f27791q.getAddUserCustomerNo());
                nCardReservationRequest.setApdCustTel(1, this.f27791q.getAddUserPhoneNumber());
                nCardReservationRequest.setApdCustName(1, this.f27791q.getAddUserName());
                Intent intent = new Intent(getApplicationContext(), (Class<?>) SectionNCardInquiryActivity.class);
                intent.putExtra("TITLE_NAME", this.f4052i.getTitle());
                intent.putExtra("INQUIRY_ARRAY_REQUEST", (Serializable) r02);
                intent.putExtra("RESERVATION_REQUEST", nCardReservationRequest);
                startActivity(intent);
                return;
            }
            NCardInquiryDao.NCardInquiryRequest nCardInquiryRequest = B4.b.getNCardInquiryRequest(bVarArr[i8], this.f4057n);
            r02[i8] = nCardInquiryRequest;
            nCardInquiryRequest.setTrnGpCd(this.f4052i.getTrnGpCd());
            i8++;
        }
    }

    @Override // Q4.g
    protected void E0() {
        super.E0();
        this.f27791q.setCertification(this);
    }

    protected void P0() {
        j jVar = new j(this);
        this.f27791q = jVar;
        this.f4054k.addView(jVar);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (-1 == i9 && 118 == i8) {
            this.f27791q.setAddUserData(intent.getStringExtra("CERTIFICATION_ADD_USER_CUSTOMER_NO"), intent.getStringExtra("CERTIFICATION_ADD_USER_NAME"), intent.getStringExtra("CERTIFICATION_ADD_USER_PHONE_NUMBER"));
        }
    }

    @Override // Q4.g, com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(final View view) throws Resources.NotFoundException {
        if (AbstractC5955f.btn_multi_n_card_inquiry != view.getId()) {
            super.onClick(view);
            return;
        }
        if (M.isStationSame(this.f4056m)) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.common_start_arrival_equal)).showDialog();
            return;
        }
        if (M.isSectionStationSame(this.f4056m)) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.multi_n_card_section_equal)).showDialog();
        } else if (this.f27791q.isCertification()) {
            O0();
        } else {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.multi_n_card_add_passenger)).setButtonListener(new DialogInterface.OnClickListener() { // from class: Q4.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f4042a.N0(view, dialogInterface, i8);
                }
            }).showDialog();
        }
    }

    @Override // Q4.g, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        if (C6630d.isNull(bundle)) {
            D0();
            K0();
            E0();
        }
    }

    @Override // T4.j.a
    public void requestAddPassengerCertification() {
        startActivityForResult(new Intent(getApplicationContext(), (Class<?>) NCardCertificationActivity.class), 118);
    }
}
