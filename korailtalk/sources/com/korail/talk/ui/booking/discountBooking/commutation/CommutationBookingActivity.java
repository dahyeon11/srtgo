package com.korail.talk.ui.booking.discountBooking.commutation;

import B4.b;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.pass.CommRsvInquiryDao;
import com.korail.talk.network.dao.pass.DiscountMenuDao;
import com.korail.talk.network.dao.pass.EnableDateDao;
import com.korail.talk.ui.booking.option.date.a;
import com.korail.talk.ui.inquiry.CommutationInquiryActivity;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import r4.d;
import z4.C6630d;
import z4.C6637k;
import z4.M;

/* loaded from: classes.dex */
public class CommutationBookingActivity extends a {

    /* renamed from: t */
    protected com.korail.talk.ui.booking.option.date.a f27576t;

    public /* synthetic */ void X0(DialogInterface dialogInterface, int i8) {
        finish();
    }

    public /* synthetic */ void Y0(int i8) {
        List listC0 = C0();
        this.f27579j = ((DiscountMenuDao.PassPeriodInfo) listC0.get(i8)).getH_cmtr_utl_trm_cd();
        this.f27580k = ((DiscountMenuDao.PassPeriodInfo) listC0.get(i8)).getH_comn_cd_nm();
    }

    private void Z0() {
        CommRsvInquiryDao.CommRsvInquiryRequest commRsvInquiryRequest = b.getCommRsvInquiryRequest(F0(), this.f27579j, this.f27580k, this.f27581l, (this.f27585p.getSelectedTabPosition() == 0 ? d.DIRECT_SQ_NO : d.TRANSFER_SQ_NO).getCode(), this.f27576t.getSelectedDay(), this.f27586q.getStartStationNm(), this.f27586q.getArrivalStationNm(), "N");
        Intent intent = new Intent(getApplicationContext(), (Class<?>) CommutationInquiryActivity.class);
        intent.putExtra("COMMUTATION_REQUEST", commRsvInquiryRequest);
        intent.putExtra("IS_PERIOD_COMMUTATION", false);
        startActivity(intent);
    }

    @Override // com.korail.talk.ui.booking.discountBooking.commutation.a
    protected void N0() {
        com.korail.talk.ui.booking.option.date.a aVar = new com.korail.talk.ui.booking.option.date.a(this);
        this.f27576t = aVar;
        this.f27583n.addView(aVar);
        List listC0 = C0();
        String[] strArr = new String[listC0.size()];
        for (int i8 = 0; i8 < listC0.size(); i8++) {
            strArr[i8] = ((DiscountMenuDao.PassPeriodInfo) listC0.get(i8)).getH_comn_cd_nm();
        }
        this.f27576t.setHeaderSummary(getString(AbstractC5959j.comm_pass_warning_use_period));
        this.f27576t.setPass(true);
        this.f27576t.setSelectDateMsg(getString(AbstractC5959j.booking_departure_date));
        this.f27576t.setPassDate(strArr);
        this.f27576t.setOnChangeRadioButtonListener(new a.e() { // from class: M4.f
            @Override // com.korail.talk.ui.booking.option.date.a.e
            public final void onChangeRadioButton(int i9) {
                this.f3142a.Y0(i9);
            }
        });
    }

    @Override // com.korail.talk.ui.booking.discountBooking.commutation.a, com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.btn_commutation_booking_inquiry != view.getId()) {
            super.onClick(view);
        } else if (M.isStationSame(this.f27586q)) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.common_start_arrival_equal)).showDialog();
        } else {
            Z0();
        }
    }

    @Override // com.korail.talk.ui.booking.discountBooking.commutation.a, com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_enable_date == iBaseDao.getId()) {
            List<EnableDateDao.PassInfo> pass_info = ((EnableDateDao.EnableDateResponse) iBaseDao.getResponse()).getPass_info();
            if (C6630d.isNull(pass_info) || pass_info.size() == 0) {
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.comm_pass_disable_buy)).setButtonListener(new DialogInterface.OnClickListener() { // from class: M4.g
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        this.f3143a.X0(dialogInterface, i8);
                    }
                }).showDialog();
                return;
            }
            String[] strArr = new String[pass_info.size()];
            for (int i8 = 0; i8 < pass_info.size(); i8++) {
                strArr[i8] = pass_info.get(i8).getH_use_open_dt();
            }
            this.f27576t.setDate(strArr);
            if (C6630d.isNotNull(this.f27582m)) {
                z0();
            }
        }
    }
}
