package com.korail.talk.ui.booking.discountBooking.commutation;

import B4.b;
import S4.k;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.common.CommonCodeDao;
import com.korail.talk.network.dao.common.CommonCodeDao.CommonCodeRequest;
import com.korail.talk.network.dao.pass.CommRsvInquiryDao;
import com.korail.talk.network.dao.pass.EnableDateDao;
import com.korail.talk.ui.inquiry.CommutationInquiryActivity;
import java.util.ArrayList;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import r4.d;
import z4.C6630d;
import z4.C6637k;
import z4.M;
import z4.N;

/* loaded from: classes.dex */
public class PeriodCommutationBookingActivity extends a {

    /* renamed from: t */
    private k f27577t;

    private void X0() {
        CommonCodeDao commonCodeDao = new CommonCodeDao();
        CommonCodeDao.CommonCodeRequest commonCodeRequest = commonCodeDao.new CommonCodeRequest();
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommonCodeDao.PERIOD_COMMUTATION_DATA);
        commonCodeRequest.setCodeList(arrayList);
        commonCodeRequest.setDepartDate(this.f27577t.getDepartDate());
        commonCodeRequest.setArrivalDate(this.f27577t.getArrivalDate());
        commonCodeRequest.setHolidayYn(this.f27577t.isChecked() ? "Y" : "N");
        commonCodeDao.setRequest(commonCodeRequest);
        executeDao(commonCodeDao);
    }

    private List Y0() {
        return E0().getPass_periodinfo();
    }

    public /* synthetic */ void Z0(DialogInterface dialogInterface, int i8) {
        finish();
    }

    public /* synthetic */ void a1(String str, String str2) {
        this.f27587r.setEnabled(N.isNotNull(str) && N.isNotNull(str2));
    }

    private void b1(String str, String str2) {
        CommRsvInquiryDao.CommRsvInquiryRequest commRsvInquiryRequest = b.getCommRsvInquiryRequest(F0(), str, str2, this.f27581l, (this.f27585p.getSelectedTabPosition() == 0 ? d.DIRECT_SQ_NO : d.TRANSFER_SQ_NO).getCode(), this.f27577t.getDepartDate(), this.f27586q.getStartStationNm(), this.f27586q.getArrivalStationNm(), this.f27577t.isChecked() ? "Y" : "N");
        Intent intent = new Intent(getApplicationContext(), (Class<?>) CommutationInquiryActivity.class);
        intent.putExtra("COMMUTATION_REQUEST", commRsvInquiryRequest);
        intent.putExtra("IS_PERIOD_COMMUTATION", true);
        startActivity(intent);
    }

    @Override // com.korail.talk.ui.booking.discountBooking.commutation.a
    protected void N0() {
        k kVar = new k(this);
        this.f27577t = kVar;
        this.f27583n.addView(kVar);
        this.f27577t.setIPeriodDateOption(new k.a() { // from class: M4.h
            @Override // S4.k.a
            public final void onSelectedDate(String str, String str2) {
                this.f3144a.a1(str, str2);
            }
        });
    }

    @Override // com.korail.talk.ui.booking.discountBooking.commutation.a
    protected void T0() {
        super.T0();
        this.f27587r.setEnabled(false);
    }

    @Override // com.korail.talk.ui.booking.discountBooking.commutation.a, com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.btn_commutation_booking_inquiry != view.getId()) {
            super.onClick(view);
        } else if (M.isStationSame(this.f27586q)) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.common_start_arrival_equal)).showDialog();
        } else {
            X0();
        }
    }

    @Override // com.korail.talk.ui.booking.discountBooking.commutation.a, com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_enable_date != id) {
            if (AbstractC5955f.dao_common_code == id) {
                CommonCodeDao.PeriodCommutationData periodCommutationData = ((CommonCodeDao.CommonCodeResponse) iBaseDao.getResponse()).getPeriodCommutationData();
                b1(periodCommutationData.getPeriodCd(), periodCommutationData.getPeriodNm());
                return;
            }
            return;
        }
        EnableDateDao.EnableDateResponse enableDateResponse = (EnableDateDao.EnableDateResponse) iBaseDao.getResponse();
        List<EnableDateDao.PassInfo> pass_info = enableDateResponse.getPass_info();
        List<EnableDateDao.Ticket_info> ticket_info = enableDateResponse.getTicket_info();
        if (C6630d.isNull(pass_info) || pass_info.size() == 0) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.comm_pass_disable_buy)).setButtonListener(new DialogInterface.OnClickListener() { // from class: M4.i
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f3145a.Z0(dialogInterface, i8);
                }
            }).showDialog();
            return;
        }
        ArrayList<ArrayList<String>> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        for (int i8 = 0; i8 < pass_info.size(); i8++) {
            arrayList2.add(pass_info.get(i8).getH_use_open_dt());
        }
        ArrayList<String> arrayList3 = new ArrayList<>();
        for (int i9 = 0; i9 < ticket_info.size(); i9++) {
            arrayList3.add(ticket_info.get(i9).getH_ise_dt2());
        }
        arrayList.add(arrayList2);
        arrayList.add(arrayList3);
        List listC0 = C0();
        List listY0 = Y0();
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(listC0);
        arrayList4.add(listY0);
        this.f27577t.setPeriodData(arrayList4);
        this.f27577t.setDateData(arrayList);
        if (C6630d.isNotNull(this.f27582m)) {
            z0();
        }
    }
}
