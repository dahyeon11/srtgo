package com.korail.talk.ui.reservation.confirm.activity;

import I4.h;
import P5.a;
import Q5.b;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.g;
import com.korail.talk.data.reservation.DReservationData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.cart.AddCartDao;
import com.korail.talk.network.dao.cart.AddCartDao.AddCartRequest;
import com.korail.talk.network.dao.cart.AddProductDao;
import com.korail.talk.network.dao.reservationCancel.RsvCancelCheckDao;
import com.korail.talk.network.dao.reservationCancel.RsvCancelCheckDao.RsvCancelCheckRequest;
import com.korail.talk.network.dao.reservationCancel.RsvCancelDao;
import com.korail.talk.network.dao.reservationCancel.RsvCancelDao.RsvCancelRequest;
import com.korail.talk.network.dao.ticket.TCCancelDao;
import com.korail.talk.network.dao.ticket.TCCancelDao.TCCancelRequest;
import com.korail.talk.network.response.certification.ReservationResponse;
import com.korail.talk.ui.menu.BasketTicketActivity;
import com.korail.talk.ui.menu.ReservedTicketActivity;
import com.korail.talk.ui.payment.PaymentActivity;
import com.korail.talk.ui.ticket.confirm.TicketListActivity;
import com.korail.talk.ui.web.ExtraProductWebViewActivity;
import e0.C5339a;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import r4.k;
import y4.C6536a;
import z4.C6625A;
import z4.C6630d;
import z4.C6637k;
import z4.t;

/* loaded from: classes.dex */
public class DReservationConfirmActivity extends a {

    /* renamed from: o */
    private final int f28617o = 0;

    /* renamed from: p */
    private final int f28618p = 1;

    /* renamed from: q */
    private final int f28619q = 2;

    /* renamed from: r */
    private final int f28620r = 3;

    /* renamed from: s */
    private final int f28621s = 4;

    /* renamed from: t */
    private boolean f28622t = false;

    /* renamed from: u */
    private final String f28623u = "WRS800036";

    /* renamed from: v */
    private List f28624v;

    private void A0() {
        if (E0() == null || E0().isEmpty()) {
            return;
        }
        boolean z8 = false;
        int i8 = 0;
        for (int i9 = 0; i9 < E0().size(); i9++) {
            if (((ReservationResponse) E0().get(i9)).gethMsgCd() != null && ((ReservationResponse) E0().get(i9)).gethMsgCd().equals("WRS800036")) {
                i8 = i9;
                z8 = true;
            }
        }
        if (!z8 || ((ReservationResponse) E0().get(i8)).gethMsgTxt() == null) {
            return;
        }
        C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(((ReservationResponse) E0().get(i8)).gethMsgTxt()).showDimDialog(true);
    }

    private void B0() {
        if (E0() == null || E0().isEmpty()) {
            return;
        }
        boolean z8 = false;
        int i8 = 0;
        for (int i9 = 0; i9 < E0().size(); i9++) {
            t.d("getReservationResponseList().get(i).getH_payment_flg() = " + ((ReservationResponse) E0().get(i9)).getH_payment_flg());
            if (((ReservationResponse) E0().get(i9)).getH_payment_flg() != null && ((ReservationResponse) E0().get(i9)).getH_payment_flg().equals("N")) {
                i8 = i9;
                z8 = true;
            }
        }
        if (z8) {
            if (E0().size() == 1) {
                Button button = F0() ? (Button) findViewById(AbstractC5955f.btn_reservation_confirm_mid) : (Button) findViewById(AbstractC5955f.btn_reservation_confirm_right);
                button.setEnabled(true);
                button.setText(getString(AbstractC5959j.common_reservation_confirm));
                this.f28622t = true;
                button.setTag(4);
            }
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(((ReservationResponse) E0().get(i8)).getH_payment_msg()).showDimDialog(true);
        }
    }

    private void C0() {
        this.f3747k.setVisibility(8);
        M0(this.f3748l);
        this.f3749m.setVisibility(F0() ? 0 : 8);
    }

    private void D0(ReservationResponse reservationResponse) {
        RsvCancelCheckDao rsvCancelCheckDao = new RsvCancelCheckDao();
        RsvCancelCheckDao.RsvCancelCheckRequest rsvCancelCheckRequest = rsvCancelCheckDao.new RsvCancelCheckRequest();
        rsvCancelCheckRequest.setTxtPnrNo(reservationResponse.getH_pnr_no());
        rsvCancelCheckRequest.setTxtJrnyCnt(reservationResponse.getH_jrny_cnt());
        rsvCancelCheckRequest.setTxtJrnySqno("0001");
        rsvCancelCheckRequest.setHidRsvChgNo("000");
        rsvCancelCheckDao.setRequest(rsvCancelCheckRequest);
        executeDao(rsvCancelCheckDao);
    }

    private List E0() {
        return ((DReservationData) t0()).getReservationResponseList();
    }

    private boolean F0() {
        return C5339a.GPS_MEASUREMENT_INTERRUPTED.equals(getReservationResponse().getH_pre_stl_tgt_flg());
    }

    public /* synthetic */ void G0(RsvCancelDao.RsvCancelRequest rsvCancelRequest, DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            D0(rsvCancelRequest.getReservationResponse());
        }
    }

    public /* synthetic */ void H0(DialogInterface dialogInterface, int i8) {
        finish();
    }

    private void I0() {
        DReservationData dReservationData = (DReservationData) t0();
        ReservationResponse reservationResponse = getReservationResponse();
        ArrayList arrayList = new ArrayList();
        k kVar = k.TICKET_CHANGE;
        if (kVar == getReservationType()) {
            arrayList.add(reservationResponse.getStopStnList().get(0).getPnrNo());
        } else {
            arrayList.add(reservationResponse.getH_pnr_no());
        }
        ArrayList arrayList2 = new ArrayList();
        if (kVar == getReservationType()) {
            arrayList2.add(reservationResponse.getTkList().get(0).getSaleWctNo());
        }
        Intent intent = new Intent(getApplicationContext(), (Class<?>) PaymentActivity.class);
        intent.putExtra("PNR_NO_LIST", arrayList);
        intent.putExtra("WCT_NO_LIST", arrayList2);
        intent.putExtra("PAYMENT_TYPE", dReservationData.getPaymentType());
        intent.putExtra("SPRM_FARE_AMOUNT", reservationResponse.getH_sprm_fare());
        intent.putExtra("TOT_PRC_AMOUNT", reservationResponse.getH_tot_prc());
        intent.putExtra("TOT_FARE_AMOUNT", reservationResponse.getH_tot_fare());
        intent.putExtra("TOT_DCNT_AMOUNT", reservationResponse.getH_tot_dcnt_amt());
        intent.putExtra("PAYMENT_REQUEST", (Serializable) dReservationData.getPaymentRequest());
        intent.putExtra("TICKET_CHANGE_RESERVATION_REQUEST", dReservationData.getTcReservationRequest());
        intent.putExtra("COMMON_RESERVATION_RESPONSE", reservationResponse);
        intent.putExtra("IS_POINT_STEP", !A4.a.isDiscountReservation(reservationResponse));
        startActivityForResult(intent, g.FEATURE_SUPPORT_ACTION_BAR_OVERLAY);
        finish();
    }

    private void J0() {
        startActivity(new Intent(getApplicationContext(), (Class<?>) ReservedTicketActivity.class));
        finish();
    }

    private void K0() {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) TicketListActivity.class);
        intent.addFlags(872415232);
        startActivity(intent);
    }

    private void L0() {
        List<ReservationResponse> reservationResponseList = ((DReservationData) t0()).getReservationResponseList();
        if (C6630d.isNotNull(reservationResponseList)) {
            for (ReservationResponse reservationResponse : reservationResponseList) {
                b bVar = new b();
                bVar.setViewType(0);
                bVar.setReservationResponse(reservationResponse);
                this.f3746j.add(bVar);
            }
        }
    }

    private void M0(Button button) {
        int i8 = 8;
        if (k.SEAT_ASSIGN_COMMUTATION != getReservationType() && k.DEFAULT != getReservationType() && k.SEAT_ASSIGN_PASS != getReservationType() && !h.getInstance().isNonMember() && !"N".equals(getReservationResponse().getH_add_srv_flg()) && k.TICKET_CHANGE != getReservationType()) {
            i8 = 0;
        }
        button.setVisibility(i8);
    }

    private ReservationResponse getReservationResponse() {
        return ((DReservationData) t0()).getReservationResponseList().get(r0.size() - 1);
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_reservation_confirm);
        if (isLinkageReservation()) {
            this.f3748l.setText(AbstractC5959j.common_reservation_cancel);
            this.f3748l.setTag(1);
            this.f3750n.setText(AbstractC5959j.title_shopping_basket);
            this.f3750n.setTag(1);
            return;
        }
        if (isWait()) {
            this.f3748l.setText(AbstractC5959j.common_reservation_cancel);
            this.f3748l.setTag(2);
            this.f3750n.setText(AbstractC5959j.inquiry_reservation_dialog_go_reservation_ticket);
            this.f3750n.setTag(2);
            return;
        }
        if (F0()) {
            this.f3748l.setText(AbstractC5959j.common_extra_new);
            this.f3748l.setTag(3);
            this.f3749m.setText(AbstractC5959j.common_pay);
            this.f3749m.setTag(3);
            this.f3750n.setText(AbstractC5959j.common_pay_later);
            this.f3750n.setTag(3);
            return;
        }
        if (isWaitConfirmPayment()) {
            this.f3749m.setText(AbstractC5959j.common_reservation_confirm);
            this.f3749m.setTag(4);
        } else {
            this.f3748l.setText(AbstractC5959j.common_extra_new);
            this.f3748l.setTag(0);
            this.f3750n.setText(AbstractC5959j.common_pay);
            this.f3750n.setTag(0);
        }
    }

    @Override // P5.a, P5.d
    public void executeAddCart(ReservationResponse reservationResponse) {
        AddCartDao addCartDao = new AddCartDao();
        AddCartDao.AddCartRequest addCartRequest = addCartDao.new AddCartRequest();
        addCartRequest.setHidPnrNo(reservationResponse.getH_pnr_no());
        addCartDao.setRequest(addCartRequest);
        executeDao(addCartDao);
    }

    @Override // P5.a, P5.d
    public void executeAddProduct(ReservationResponse reservationResponse) {
        AddProductDao addProductDao = new AddProductDao();
        AddCartDao.AddCartRequest addCartRequest = new AddCartDao.AddCartRequest();
        addCartRequest.setHidPnrNo(reservationResponse.getH_pnr_no());
        addProductDao.setRequest(addCartRequest);
        executeDao(addProductDao);
    }

    @Override // P5.a, P5.d
    public void executeRsvCancel(ReservationResponse reservationResponse) {
        RsvCancelDao rsvCancelDao = new RsvCancelDao();
        RsvCancelDao.RsvCancelRequest rsvCancelRequest = rsvCancelDao.new RsvCancelRequest();
        rsvCancelRequest.setTxtPnrNo(reservationResponse.getH_pnr_no());
        rsvCancelRequest.setTxtJrnyCnt(reservationResponse.getH_jrny_cnt());
        rsvCancelRequest.setTxtJrnySqno("0001");
        rsvCancelRequest.setHidRsvChgNo("000");
        rsvCancelRequest.setReservationResponse(reservationResponse);
        rsvCancelDao.setRequest(rsvCancelRequest);
        executeDao(rsvCancelDao);
    }

    @Override // P5.a, P5.d
    public void executeTicketChangeCancel(ReservationResponse reservationResponse) {
        TCCancelDao tCCancelDao = new TCCancelDao();
        TCCancelDao.TCCancelRequest tCCancelRequest = tCCancelDao.new TCCancelRequest();
        tCCancelRequest.setLumpStlCnt("1");
        tCCancelRequest.setLumpStlTgtNo(1, reservationResponse.getJrny_infos().getJrny_info().get(0).getLumpStlTgtNo());
        tCCancelDao.setRequest(tCCancelRequest);
        tCCancelDao.setNotShowDialog(true);
        executeDao(tCCancelDao);
    }

    @Override // P5.a, P5.d
    public k getReservationType() {
        return ((DReservationData) t0()).getReservationType();
    }

    @Override // P5.a, P5.d
    public boolean isLinkageReservation() {
        return ((DReservationData) t0()).isLinkageReservation();
    }

    @Override // P5.a, P5.d
    public boolean isWait() {
        return "IRR000014".equals(getReservationResponse().gethMsgCd());
    }

    public boolean isWaitConfirmPayment() {
        return this.f28622t;
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, com.korail.talk.view.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (k.TICKET_CHANGE == getReservationType()) {
            executeTicketChangeCancel(getReservationResponse());
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        int id = view.getId();
        if (AbstractC5955f.btn_reservation_confirm_left == id) {
            int iIntValue = ((Integer) view.getTag()).intValue();
            if (iIntValue != 0) {
                if (iIntValue == 1) {
                    startActivity(new Intent(getApplicationContext(), (Class<?>) ReservedTicketActivity.class));
                    finish();
                } else if (iIntValue != 2) {
                    if (iIntValue != 3) {
                        if (iIntValue != 4) {
                            return;
                        }
                        startActivity(new Intent(getApplicationContext(), (Class<?>) ReservedTicketActivity.class));
                        finish();
                    }
                }
                executeRsvCancel(getReservationResponse());
                return;
            }
            executeAddProduct(getReservationResponse());
            return;
        }
        if (AbstractC5955f.btn_reservation_confirm_mid == id) {
            int iIntValue2 = ((Integer) view.getTag()).intValue();
            if (iIntValue2 == 3) {
                I0();
                return;
            } else {
                if (iIntValue2 != 4) {
                    return;
                }
                startActivity(new Intent(getApplicationContext(), (Class<?>) ReservedTicketActivity.class));
                finish();
                return;
            }
        }
        if (AbstractC5955f.btn_reservation_confirm_right != id) {
            if (k.TICKET_CHANGE == getReservationType()) {
                executeTicketChangeCancel(getReservationResponse());
                return;
            } else {
                super.onClick(view);
                return;
            }
        }
        int iIntValue3 = ((Integer) view.getTag()).intValue();
        if (iIntValue3 == 0) {
            I0();
            return;
        }
        if (iIntValue3 == 1) {
            executeAddCart(getReservationResponse());
            return;
        }
        if (iIntValue3 != 2) {
            if (iIntValue3 == 3) {
                J0();
                return;
            } else if (iIntValue3 != 4) {
                return;
            }
        }
        startActivity(new Intent(getApplicationContext(), (Class<?>) ReservedTicketActivity.class));
        finish();
    }

    @Override // P5.a, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        if (C6630d.isNull(bundle)) {
            u0();
            x0();
            setText();
            v0();
            C0();
            B0();
            A0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        DReservationData dReservationData = (DReservationData) t0();
        if (AbstractC5955f.dao_rsv_cancel == id) {
            final RsvCancelDao.RsvCancelRequest rsvCancelRequest = (RsvCancelDao.RsvCancelRequest) iBaseDao.getRequest();
            if (isLinkageReservation()) {
                D0(rsvCancelRequest.getReservationResponse());
                return;
            } else {
                C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.common_reservation_cancel_message)).setButtonListener(new DialogInterface.OnClickListener() { // from class: P5.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        this.f3751a.G0(rsvCancelRequest, dialogInterface, i8);
                    }
                }).showDialog();
                return;
            }
        }
        if (AbstractC5955f.dao_rsv_cancel_check == id) {
            if (!isLinkageReservation() || dReservationData.getReservationResponseList().size() != 2) {
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.common_reservation_cancel_complete_message)).setButtonListener(new DialogInterface.OnClickListener() { // from class: P5.c
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        this.f3753a.H0(dialogInterface, i8);
                    }
                }).showDialog();
                return;
            } else {
                dReservationData.getReservationResponseList().remove(getReservationResponse());
                executeRsvCancel(getReservationResponse());
                return;
            }
        }
        if (AbstractC5955f.dao_tc_cancel == id) {
            K0();
            return;
        }
        if (AbstractC5955f.dao_add_cart == id) {
            this.f28624v.add(((AddCartDao.AddCartRequest) iBaseDao.getRequest()).getHidPnrNo());
            if (isLinkageReservation() && dReservationData.getReservationResponseList().size() == 2) {
                dReservationData.getReservationResponseList().remove(getReservationResponse());
                executeAddCart(getReservationResponse());
                return;
            } else {
                Intent intent = new Intent(getApplicationContext(), (Class<?>) BasketTicketActivity.class);
                intent.putExtra("TICKET_PNR_ARRAY_NUMBER", C6625A.toArray(this.f28624v));
                startActivity(intent);
                finish();
                return;
            }
        }
        if (AbstractC5955f.dao_add_product == id) {
            AddCartDao.AddCartRequest addCartRequest = (AddCartDao.AddCartRequest) iBaseDao.getRequest();
            Intent intent2 = new Intent(getApplicationContext(), (Class<?>) ExtraProductWebViewActivity.class);
            intent2.putExtra("WEB_POST_URL", r4.g.PRODUCT_URL);
            intent2.putExtra("WEB_POST_PARAMETER", r4.g.PRODUCT_POST_DATA + addCartRequest.getHidPnrNo());
            startActivity(intent2);
            finish();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        super.onReceiveError(iBaseDao, c6536a);
        if (AbstractC5955f.dao_tc_cancel == iBaseDao.getId()) {
            K0();
        }
    }

    @Override // P5.a
    protected void u0() {
        super.u0();
        this.f28624v = new ArrayList();
        L0();
        w0();
    }
}
