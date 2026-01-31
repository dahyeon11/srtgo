package com.korail.talk.ui.certification;

import android.content.Intent;
import android.os.Bundle;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.login.MemberCertDao;
import com.korail.talk.network.dao.login.MemberCertDao.MemberCertRequest;
import com.korail.talk.view.base.BaseViewActivity;
import com.korail.talk.viewGroup.TicketDeliveryMember;
import g6.InterfaceC5558a;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.C6637k;

/* loaded from: classes.dex */
public class NCardCertificationActivity extends BaseViewActivity implements InterfaceC5558a {

    /* renamed from: i, reason: collision with root package name */
    private TicketDeliveryMember f27943i;

    private void s0(String str, String str2, int i8) {
        MemberCertDao memberCertDao = new MemberCertDao();
        MemberCertDao.MemberCertRequest memberCertRequest = memberCertDao.new MemberCertRequest();
        memberCertRequest.setTxtAcptPsNm(str);
        if (i8 == 0) {
            memberCertRequest.setAcept("1");
            memberCertRequest.setMemNum(str2);
        } else if (i8 == 1) {
            memberCertRequest.setAcept("3");
            memberCertRequest.setTxtCpNo(str2);
        } else if (i8 == 2) {
            memberCertRequest.setAcept("2");
            memberCertRequest.setTxtEmailNo(str2);
        }
        memberCertDao.setRequest(memberCertRequest);
        executeDao(memberCertDao);
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_n_card_certification);
        TicketDeliveryMember ticketDeliveryMember = (TicketDeliveryMember) findViewById(AbstractC5955f.mTicketDeliveryMember);
        this.f27943i = ticketDeliveryMember;
        ticketDeliveryMember.setNoticeMessage(AbstractC5959j.n_card_certification_notice_message);
        this.f27943i.setBottomMessage(AbstractC5959j.common_register);
    }

    private void t0() {
        this.f27943i.setITicketDelivery(this);
    }

    private void u0() {
        n0(false);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_n_card_certification);
        if (C6630d.isNull(bundle)) {
            u0();
            setText();
            t0();
        }
    }

    @Override // g6.InterfaceC5558a
    public void onNonMemberDelivery(String str, String str2, String str3) {
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_cert_member == iBaseDao.getId()) {
            this.f27943i.setCustomerNo(((MemberCertDao.MemberCertResponse) iBaseDao.getResponse()).getStrCustNo());
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.ticket_delivery_input_verified)).showDialog();
        }
    }

    @Override // g6.InterfaceC5558a
    public void requestDelivery(String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.putExtra("CERTIFICATION_ADD_USER_NAME", str);
        intent.putExtra("CERTIFICATION_ADD_USER_PHONE_NUMBER", str2);
        intent.putExtra("CERTIFICATION_ADD_USER_CUSTOMER_NO", str3);
        setResult(-1, intent);
        finish();
    }

    @Override // g6.InterfaceC5558a
    public void requestMemberQuery(String str, String str2, int i8) {
        s0(str, str2, i8);
    }
}
