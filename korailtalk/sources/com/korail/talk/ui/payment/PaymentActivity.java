package com.korail.talk.ui.payment;

import F5.a;
import H5.A;
import H5.B;
import H5.C;
import I5.f;
import I5.g;
import I5.h;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.style.ForegroundColorSpan;
import androidx.fragment.app.Fragment;
import com.korail.talk.data.DiscountObjectData;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.delay.DelayPNRAcceptDao;
import com.korail.talk.network.dao.delay.DelayPNRAcceptDao.DelayPNRAcceptRequest;
import com.korail.talk.network.dao.delay.DelayPNRQueryDao;
import com.korail.talk.network.dao.delay.DelayPNRQueryDao.DelayPNRQueryRequest;
import com.korail.talk.network.dao.pass.CommPaymentDao;
import com.korail.talk.network.dao.pass.PassPaymentDao;
import com.korail.talk.network.dao.passCard.DCCouponListDao;
import com.korail.talk.network.dao.passCard.DelayTicketListDao;
import com.korail.talk.network.dao.pay.IntgStlDao;
import com.korail.talk.network.dao.payment.RsvPaymentDao;
import com.korail.talk.network.dao.reservation.TCReservationDao;
import com.korail.talk.network.dao.ticket.TicketDuplicationCheckDao;
import com.korail.talk.network.dao.ticket.TicketDuplicationCheckDao.DuplicationCheckRequest;
import com.korail.talk.network.request.payment.IPaymentRequest;
import com.korail.talk.network.response.certification.ReservationResponse;
import com.korail.talk.ui.menu.tripbooking.TripBookingListActivity;
import com.korail.talk.ui.ticket.confirm.TicketListActivity;
import com.korail.talk.ui.ticket.confirm.TicketSelfCheckinStatusActivity;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import o4.C6038a;
import r4.e;
import r4.i;
import r4.j;
import u6.C6420a;
import y4.C6536a;
import z4.C6630d;
import z4.C6637k;
import z4.C6641o;
import z4.D;
import z4.N;
import z4.t;

/* loaded from: classes.dex */
public class PaymentActivity extends BaseViewActivity implements a {

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f28534i;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f28535j;

    /* renamed from: k, reason: collision with root package name */
    private i f28536k;

    /* renamed from: l, reason: collision with root package name */
    private IPaymentRequest f28537l;

    /* renamed from: m, reason: collision with root package name */
    private ReservationResponse f28538m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f28539n;

    /* renamed from: o, reason: collision with root package name */
    private int f28540o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f28541p;

    /* renamed from: q, reason: collision with root package name */
    private String f28542q;

    /* renamed from: r, reason: collision with root package name */
    private String f28543r;

    /* renamed from: s, reason: collision with root package name */
    private String f28544s;

    /* renamed from: t, reason: collision with root package name */
    private String f28545t;

    /* renamed from: u, reason: collision with root package name */
    private j f28546u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f28547v;

    /* renamed from: w, reason: collision with root package name */
    private int f28548w;

    /* renamed from: x, reason: collision with root package name */
    private int f28549x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f28550y;

    /* JADX INFO: Access modifiers changed from: private */
    public void A0() {
        ReservationResponse reservationResponse = getReservationResponse();
        i paymentType = getPaymentType();
        if (!C6630d.isNotNull(reservationResponse) || i.PAYMENT_TICKET_CHANGE == paymentType) {
            if (i.PAYMENT_MAAS != paymentType) {
                z0();
                return;
            }
            return;
        }
        TicketDuplicationCheckDao ticketDuplicationCheckDao = new TicketDuplicationCheckDao();
        TicketDuplicationCheckDao.DuplicationCheckRequest duplicationCheckRequest = ticketDuplicationCheckDao.new DuplicationCheckRequest();
        duplicationCheckRequest.setPnrNo(getPNRNo());
        ticketDuplicationCheckDao.setRequest(duplicationCheckRequest);
        ticketDuplicationCheckDao.setLoadingCancelable(false);
        ticketDuplicationCheckDao.setNotShowDialog(true);
        executeDao(ticketDuplicationCheckDao);
    }

    private Fragment B0(String str) {
        Fragment fragment = getFragment(str);
        return C6630d.isNull(fragment) ? B.TAG.equals(str) ? B.newInstance() : C.TAG.equals(str) ? C.newInstance((TCReservationDao.TCReservationRequest) getIntent().getSerializableExtra("TICKET_CHANGE_RESERVATION_REQUEST")) : A.TAG.equals(str) ? A.newInstance() : h.TAG.equals(str) ? h.newInstance() : f.TAG.equals(str) ? f.newInstance(getIntent().getStringExtra("PRODUCT_NO")) : g.TAG.equals(str) ? g.newInstance(getIntent().getStringExtra("PRODUCT_NO")) : fragment : fragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C0(int i8, List list, ArrayList arrayList, DialogInterface dialogInterface, int i9) {
        if (100 == i9) {
            finish();
        } else if (102 == i9) {
            x0(i8 + 1, list, arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D0(DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            z0();
        } else if (102 == i8) {
            C6641o.navigation(getApplicationContext(), isTravelPackages() ? TripBookingListActivity.class : TicketListActivity.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E0(DialogInterface dialogInterface, int i8) {
        setResult(-1);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F0(DialogInterface dialogInterface, int i8) {
        setResult(-1);
        finish();
    }

    private void G0() {
        if (isReservationResponseNull()) {
            this.f28548w = getIntent().getIntExtra("RECEIVED_AMOUNT", -1);
            this.f28549x = getIntent().getIntExtra("DISCOUNT_AMOUNT", -1);
        } else {
            this.f28542q = this.f28538m.getH_sprm_fare();
            this.f28543r = this.f28538m.getH_tot_prc();
            this.f28544s = this.f28538m.getH_tot_fare();
            this.f28545t = this.f28538m.getH_tot_dcnt_amt();
            if (i.PAYMENT_TICKET_CHANGE.equals(getPaymentType())) {
                int scnIndcAmt = this.f28538m.getScnIndcAmt();
                this.f28548w = scnIndcAmt;
                this.f28549x = scnIndcAmt;
            } else {
                Iterator<ReservationResponse.JrnyInfo> it = getJrnyInfoList().iterator();
                int i8 = 0;
                int i9 = 0;
                while (it.hasNext()) {
                    for (ReservationResponse.SeatInfo seatInfo : it.next().getSeat_infos().getSeat_info()) {
                        i8 += Integer.parseInt(seatInfo.getH_seat_prc()) + Integer.parseInt(seatInfo.getH_seat_fare());
                        i9 += (Integer.parseInt(seatInfo.getH_seat_prc()) + Integer.parseInt(seatInfo.getH_seat_fare())) - Integer.parseInt(seatInfo.getH_rcvd_amt());
                    }
                }
                t.e("totalAmount : " + i8 + ", discountAmount : " + i9);
                StringBuilder sb = new StringBuilder();
                sb.append("totalAmount - discountAmount : ");
                int i10 = i8 - i9;
                sb.append(i10);
                t.e(sb.toString());
                t.e("totalAmount - mSprmFareAmount : " + this.f28542q + ", mTotPrc : " + this.f28543r);
                t.e("totalAmount - mTotFare : " + this.f28544s + ", mTotDcnt : " + this.f28545t);
                this.f28548w = i10;
                this.f28549x = i9;
            }
        }
        t.e("mReceivedAmount : " + this.f28548w + ", mDiscountAmount : " + this.f28549x);
    }

    private void H0() {
        if (C6630d.isNotNull(getIntent())) {
            this.f28534i = (ArrayList) M(getIntent(), "PNR_NO_LIST");
            this.f28535j = (ArrayList) M(getIntent(), "WCT_NO_LIST");
            this.f28536k = (i) M(getIntent(), "PAYMENT_TYPE");
            this.f28542q = (String) M(getIntent(), "SPRM_FARE_AMOUNT");
            this.f28543r = (String) M(getIntent(), "TOT_PRC_AMOUNT");
            this.f28544s = (String) M(getIntent(), "TOT_FARE_AMOUNT");
            this.f28545t = (String) M(getIntent(), "TOT_DCNT_AMOUNT");
            this.f28537l = (IPaymentRequest) M(getIntent(), "PAYMENT_REQUEST");
            this.f28538m = (ReservationResponse) M(getIntent(), "COMMON_RESERVATION_RESPONSE");
            this.f28539n = getIntent().getBooleanExtra("IS_POINT_STEP", false);
            this.f28540o = getIntent().getIntExtra("SELECTED_ITEM_COUNT", 1);
            this.f28541p = getIntent().getBooleanExtra("IS_TRAVEL_PACKAGES", false);
            G0();
            this.f28546u = (j) getIntent().getSerializableExtra("RESERVED_TICKET_TYPE");
            this.f28547v = getIntent().getBooleanExtra("IS_RESERVATION_HISTORY", false);
            this.f28550y = getIntent().getBooleanExtra("DISABLE_DISCOUNT_POINT", false);
            t.d("PAymentInfoData::PNR List = " + this.f28534i);
            if (C6630d.isNotNull(this.f28534i)) {
                t.d("PNR List size : " + this.f28534i.size());
            }
            t.d("PAymentInfoData::WCT NO List = " + this.f28535j);
            if (C6630d.isNotNull(this.f28535j)) {
                t.d("WCT NO  List size : " + this.f28535j.size());
            }
            t.d("PAymentInfoData::PaymentType = " + this.f28536k);
            t.d("PAymentInfoData::IPaymentRequest = " + this.f28537l);
            t.d("PAymentInfoData::ReservationResponse = " + this.f28538m);
            t.d("PAymentInfoData::IsOnlyPointPayment = " + this.f28539n);
            t.d("PAymentInfoData::SelectedItemCount = " + this.f28540o);
            t.d("PAymentInfoData::IsTravelPackages = " + this.f28541p);
            t.d("PAymentInfoData::ReservedTicketType = " + this.f28546u);
            t.d("PAymentInfoData::IsReservationHistory = " + this.f28547v);
            t.d("PAymentInfoData::ReceivedAmount = " + this.f28548w);
            t.d("PAymentInfoData::DiscountAmount = " + this.f28549x);
            t.d("PAymentInfoData::DisableDiscountPoint = " + this.f28550y);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void I0() {
        /*
            r3 = this;
            r4.j r0 = r3.getReservedTicketType()
            boolean r0 = z4.C6630d.isNull(r0)
            if (r0 != 0) goto L12
            r4.j r0 = r3.getReservedTicketType()
            r4.j r1 = r4.j.NORMAL
            if (r0 != r1) goto L6f
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "type = "
            r0.append(r1)
            r4.i r1 = r3.getPaymentType()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            z4.t.e(r0)
            r4.i r0 = r4.i.PAYMENT_TICKET_CHANGE
            r4.i r1 = r3.getPaymentType()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L39
            java.lang.String r0 = "TDiscountFragment"
            goto L71
        L39:
            r4.i r0 = r4.i.PAYMENT_MULTI_CHILD
            r4.i r1 = r3.getPaymentType()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L48
            java.lang.String r0 = "MDiscountFragment"
            goto L71
        L48:
            r4.i r0 = r4.i.PAYMENT_PRODUCT
            r4.i r1 = r3.getPaymentType()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L57
            java.lang.String r0 = "CPaymentFragment"
            goto L71
        L57:
            r4.i r0 = r4.i.PAYMENT_MAAS
            r4.i r1 = r3.getPaymentType()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L66
            java.lang.String r0 = "MaasPaymentFragment"
            goto L71
        L66:
            boolean r0 = r3.isOnlyPayment()
            if (r0 == 0) goto L6f
            java.lang.String r0 = "NPaymentFragment"
            goto L71
        L6f:
            java.lang.String r0 = "NDiscountFragment"
        L71:
            int r1 = n4.AbstractC5955f.contentContainer
            androidx.fragment.app.Fragment r2 = r3.B0(r0)
            r3.replaceTransaction(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.korail.talk.ui.payment.PaymentActivity.I0():void");
    }

    private void J0() {
        l0();
    }

    private void setText() {
        if (isReservationHistory()) {
            setAppTitle(AbstractC5959j.payment_reservation_info);
            return;
        }
        if (getReservedTicketType() == j.WAIT) {
            setAppTitle(AbstractC5959j.payment_reservation_info);
        } else if (getReservedTicketType() == j.SENT) {
            setAppTitle(AbstractC5959j.payment_reservation_info);
        } else {
            setAppTitle(AbstractC5959j.title_payment_main);
        }
    }

    private void x0(final int i8, final List list, final ArrayList arrayList) {
        boolean z8;
        if (i8 >= list.size()) {
            if (arrayList.isEmpty()) {
                return;
            }
            y0(arrayList);
            return;
        }
        List<DelayPNRQueryDao.Delay> delay = ((DelayPNRQueryDao.Main) list.get(i8)).getDelay();
        Iterator<DelayPNRQueryDao.Delay> it = delay.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().getDlayAcptFlg().equals("Y")) {
                    arrayList.add(Integer.valueOf(i8));
                    z8 = true;
                    break;
                }
            } else {
                z8 = false;
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (z8) {
            for (DelayPNRQueryDao.Delay delay2 : delay) {
                if (e.STANDING_SEAT_2.getCode().equals(delay2.getJrnyTpCd())) {
                    break;
                }
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(N.getIntegerString(delay2.getTrnNo()));
            }
        }
        if (z8) {
            C6637k.getCDialog(K(), 1005, 1, getString(AbstractC5959j.dialog_title_delay_agree)).setContent(getString(AbstractC5959j.dialog_delay_agree_msg1, sb.toString()), N.applySpannable(getString(AbstractC5959j.dialog_delay_agree_msg2), new ForegroundColorSpan(Color.parseColor("#ff0000"))), getString(AbstractC5959j.dialog_delay_agree_msg3), N.applySpannable(getString(AbstractC5959j.dialog_delay_agree_msg4), new ForegroundColorSpan(Color.parseColor("#ff0000"))), getString(AbstractC5959j.dialog_delay_agree_msg5)).setCheckBoxMessage(getString(AbstractC5959j.commutation_agree_message)).setButtonNames(N.getStringArray(getString(AbstractC5959j.common_no), getString(AbstractC5959j.common_yes_agree))).setButtonListener(new DialogInterface.OnClickListener() { // from class: F5.f
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i9) {
                    this.f1264a.C0(i8, list, arrayList, dialogInterface, i9);
                }
            }).showDialog();
        } else {
            x0(i8 + 1, list, arrayList);
        }
    }

    private void y0(ArrayList arrayList) {
        i paymentType = getPaymentType();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            arrayList2.add((String) this.f28534i.get(num.intValue()));
            if (i.PAYMENT_TICKET_CHANGE == paymentType) {
                arrayList3.add((String) this.f28535j.get(num.intValue()));
            }
        }
        DelayPNRAcceptDao delayPNRAcceptDao = new DelayPNRAcceptDao();
        DelayPNRAcceptDao.DelayPNRAcceptRequest delayPNRAcceptRequest = delayPNRAcceptDao.new DelayPNRAcceptRequest();
        i iVar = i.PAYMENT_TICKET_CHANGE;
        delayPNRAcceptRequest.setJobDvCd(iVar == paymentType ? "1" : "0");
        delayPNRAcceptRequest.setPnrCnt(arrayList2.size());
        delayPNRAcceptRequest.setPnrList(arrayList2);
        if (iVar == paymentType) {
            delayPNRAcceptRequest.setOgtkWctNo(arrayList3);
        }
        delayPNRAcceptDao.setRequest(delayPNRAcceptRequest);
        delayPNRAcceptDao.setNotShowDialog(true);
        executeDao(delayPNRAcceptDao);
    }

    private void z0() {
        j reservedTicketType = getReservedTicketType();
        if (!C6630d.isNotNull(this.f28534i) || this.f28534i.size() <= 0) {
            return;
        }
        if (C6630d.isNull(reservedTicketType) || reservedTicketType == j.NORMAL) {
            i paymentType = getPaymentType();
            DelayPNRQueryDao delayPNRQueryDao = new DelayPNRQueryDao();
            DelayPNRQueryDao.DelayPNRQueryRequest delayPNRQueryRequest = delayPNRQueryDao.new DelayPNRQueryRequest();
            i iVar = i.PAYMENT_TICKET_CHANGE;
            delayPNRQueryRequest.setJobDvCd(iVar == paymentType ? "1" : "0");
            delayPNRQueryRequest.setPnrCnt(this.f28534i.size());
            delayPNRQueryRequest.setPnrList(this.f28534i);
            if (iVar == paymentType) {
                delayPNRQueryRequest.setOgtkWctNoList(this.f28535j);
            }
            delayPNRQueryDao.setRequest(delayPNRQueryRequest);
            delayPNRQueryDao.setNotShowDialog(true);
            executeDao(delayPNRQueryDao);
        }
    }

    @Override // F5.a
    public boolean disableDiscountPoint() {
        return this.f28550y;
    }

    @Override // F5.a
    public int getDiscountAmount() {
        return this.f28549x;
    }

    @Override // F5.a
    public IPaymentRequest getIPaymentRequest() {
        return this.f28537l;
    }

    @Override // F5.a
    public String getJrnyCnt() {
        return this.f28538m.getH_jrny_cnt();
    }

    @Override // F5.a
    public ReservationResponse.JrnyInfo getJrnyInfo() {
        return getJrnyInfoList().get(0);
    }

    @Override // F5.a
    public List<ReservationResponse.JrnyInfo> getJrnyInfoList() {
        return this.f28538m.getJrny_infos().getJrny_info();
    }

    @Override // F5.a
    public String getPNRNo() {
        return this.f28538m.getH_pnr_no();
    }

    @Override // F5.a
    public i getPaymentType() {
        return this.f28536k;
    }

    @Override // F5.a
    public int getReceivedAmount() {
        return this.f28548w;
    }

    @Override // F5.a
    public ReservationResponse getReservationResponse() {
        return this.f28538m;
    }

    @Override // F5.a
    public j getReservedTicketType() {
        return this.f28546u;
    }

    @Override // F5.a
    public int getSelectedItemCount() {
        return this.f28540o;
    }

    public String getmSprmFareAmount() {
        return this.f28542q;
    }

    public String getmTotDcnt() {
        return this.f28545t;
    }

    public String getmTotFare() {
        return this.f28544s;
    }

    public String getmTotPrc() {
        return this.f28543r;
    }

    @Override // F5.a
    public boolean isCommPaymentRequest() {
        return getIPaymentRequest() instanceof CommPaymentDao.CommPaymentResponse;
    }

    @Override // F5.a
    public boolean isEnableMeritProtector() {
        for (ReservationResponse.SeatInfo seatInfo : getJrnyInfo().getSeat_infos().getSeat_info()) {
            if ("207".equals(seatInfo.getH_dcnt_knd_cd1()) || "207".equals(seatInfo.getH_dcnt_knd_cd2())) {
                return true;
            }
        }
        return false;
    }

    @Override // F5.a
    public boolean isEnableTarget(C6420a c6420a, int i8) {
        return c6420a.getBusinessTripCoupon().isEnableTarget(i8) && c6420a.getDiscountMemberCoupon().isEnableTarget(i8) && c6420a.getDelayDiscountCoupon().isEnableTarget(i8) && c6420a.getNationalMeritPersonDiscount().isEnableTarget(i8) && c6420a.getNationalMeritGuardianDiscount().isEnableTarget(i8) && c6420a.getCongresspersonDiscountOption().isEnableTarget(i8) && c6420a.getDisabledPersonGuardianDiscount().isEnableTarget(i8);
    }

    @Override // F5.a
    public boolean isExistHighDisable() {
        List<ReservationResponse.SeatInfo> seat_info = getJrnyInfo().getSeat_infos().getSeat_info();
        for (int i8 = 0; i8 < seat_info.size(); i8++) {
            if (seat_info.get(i8).getH_dcnt_knd_cd1().equals("205")) {
                return true;
            }
        }
        return false;
    }

    @Override // F5.a
    public boolean isIntgStlRequest() {
        return getIPaymentRequest() instanceof IntgStlDao.IntgStlRequest;
    }

    @Override // F5.a
    public boolean isOnlyPayment() {
        return this.f28539n;
    }

    @Override // F5.a
    public boolean isPassPaymentRequest() {
        return getIPaymentRequest() instanceof PassPaymentDao.PassPaymentRequest;
    }

    @Override // F5.a
    public boolean isReservationHistory() {
        return this.f28547v;
    }

    @Override // F5.a
    public boolean isReservationResponseNull() {
        return C6630d.isNull(this.f28538m);
    }

    @Override // F5.a
    public boolean isRsvPaymentRequest() {
        return getIPaymentRequest() instanceof RsvPaymentDao.RsvPaymentRequest;
    }

    @Override // F5.a
    public boolean isTravelPackages() {
        return this.f28541p;
    }

    @Override // F5.a
    public ArrayList<DiscountObjectData> makeDelayCouponEntries(Context context, List<DelayTicketListDao.DelayCoupon> list) {
        ArrayList<DiscountObjectData> arrayList = new ArrayList<>();
        DiscountObjectData discountObjectData = new DiscountObjectData();
        discountObjectData.setTitle(context.getString(AbstractC5959j.payment_no_select));
        arrayList.add(discountObjectData);
        for (int i8 = 0; i8 < list.size(); i8++) {
            DelayTicketListDao.DelayCoupon delayCoupon = list.get(i8);
            String h_orgtk_wct_no = delayCoupon.getH_orgtk_wct_no();
            String h_orgtk_ret_sale_dt = delayCoupon.getH_orgtk_ret_sale_dt();
            String h_orgtk_sale_sqno = delayCoupon.getH_orgtk_sale_sqno();
            String h_orgtk_ret_pwd = delayCoupon.getH_orgtk_ret_pwd();
            StringBuilder sb = new StringBuilder();
            if (!N.isNull(h_orgtk_wct_no) && !N.isNull(h_orgtk_sale_sqno) && !N.isNull(h_orgtk_ret_sale_dt) && !N.isNull(h_orgtk_ret_pwd)) {
                sb.append(C6038a.getReturnNumberWithDash(h_orgtk_wct_no, h_orgtk_ret_sale_dt, h_orgtk_sale_sqno, h_orgtk_ret_pwd));
                if (!N.isNull(delayCoupon.getH_dlay_fare())) {
                    sb.append(" / ");
                    sb.append(getString(AbstractC5959j.common_amount, N.getDecimalFormatString(delayCoupon.getH_dlay_fare())));
                }
            }
            DiscountObjectData discountObjectData2 = new DiscountObjectData();
            discountObjectData2.setIndex(i8);
            discountObjectData2.setTitle(sb.toString());
            discountObjectData2.setObject(list.get(i8));
            arrayList.add(discountObjectData2);
        }
        DiscountObjectData discountObjectData3 = new DiscountObjectData();
        discountObjectData3.setTitle(context.getString(AbstractC5959j.payment_direct_input));
        arrayList.add(discountObjectData3);
        return arrayList;
    }

    @Override // F5.a
    public ArrayList<DiscountObjectData> makeDiscountCouponEntries(Context context, List<DCCouponListDao.DiscountCoupon> list) {
        ArrayList<DiscountObjectData> arrayList = new ArrayList<>();
        DiscountObjectData discountObjectData = new DiscountObjectData();
        discountObjectData.setTitle(context.getString(AbstractC5959j.payment_no_select));
        arrayList.add(discountObjectData);
        for (int i8 = 0; i8 < list.size(); i8++) {
            StringBuilder sb = new StringBuilder();
            sb.append(list.get(i8).getH_cpn_no());
            if (!N.isNull(list.get(i8).getH_inwk_prc_disc_rt_amt())) {
                sb.append(" - ");
                if (list.get(i8).getH_disc_rt_amt_dv_cd().equals(TicketSelfCheckinStatusActivity.CHECKIN_STATUS_NOT_USE)) {
                    sb.append(getString(AbstractC5959j.common_amount, N.getDecimalFormatString(list.get(i8).getH_inwk_prc_disc_rt_amt())));
                } else if (list.get(i8).getH_disc_rt_amt_dv_cd().equals("02")) {
                    String h_inwk_prc_disc_rt_amt = list.get(i8).getH_inwk_prc_disc_rt_amt();
                    String h_wknd_prc_disc_rt_amt = list.get(i8).getH_wknd_prc_disc_rt_amt();
                    String h_inwk_fare_disc_rt_amt = list.get(i8).getH_inwk_fare_disc_rt_amt();
                    String h_wknd_fare_disc_rt_amt = list.get(i8).getH_wknd_fare_disc_rt_amt();
                    if (Integer.parseInt(h_inwk_prc_disc_rt_amt) < Integer.parseInt(h_wknd_prc_disc_rt_amt)) {
                        h_inwk_prc_disc_rt_amt = h_wknd_prc_disc_rt_amt;
                    }
                    if (Integer.parseInt(h_inwk_fare_disc_rt_amt) < Integer.parseInt(h_wknd_fare_disc_rt_amt)) {
                        h_inwk_fare_disc_rt_amt = h_wknd_fare_disc_rt_amt;
                    }
                    boolean z8 = Integer.parseInt(h_inwk_prc_disc_rt_amt) > Integer.parseInt(h_inwk_fare_disc_rt_amt);
                    sb.append(z8 ? "일반실 운임 : " + (z8 ? N.getInteger(h_inwk_prc_disc_rt_amt) : N.getInteger(h_inwk_fare_disc_rt_amt)) + "%" : "특실업그레이드");
                }
            }
            DiscountObjectData discountObjectData2 = new DiscountObjectData();
            discountObjectData2.setIndex(i8);
            discountObjectData2.setTitle(sb.toString());
            discountObjectData2.setObject(list.get(i8));
            arrayList.add(discountObjectData2);
        }
        DiscountObjectData discountObjectData3 = new DiscountObjectData();
        discountObjectData3.setTitle(context.getString(AbstractC5959j.payment_direct_input));
        arrayList.add(discountObjectData3);
        return arrayList;
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_payment);
        if (D.isApproveScheme(getApplicationContext(), getIntent())) {
            finish();
            return;
        }
        H0();
        J0();
        setText();
        I0();
        new Handler().postDelayed(new Runnable() { // from class: F5.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f1263a.A0();
            }
        }, 100L);
    }

    @Override // androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        t.d("intent : " + intent.getData());
        if (D.isApproveScheme(getApplicationContext(), intent)) {
            Uri data = intent.getData();
            Bundle bundle = new Bundle();
            for (String str : data.getQueryParameterNames()) {
                bundle.putString(str, data.getQueryParameter(str));
            }
            Fragment currentFragment = getCurrentFragment();
            if (currentFragment instanceof I5.e) {
                ((I5.e) currentFragment).setEasyPaymentData(bundle);
            }
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_ticket_duplication_check != id) {
            if (AbstractC5955f.dao_delay_pnr_query == id) {
                x0(0, ((DelayPNRQueryDao.DelayPNRQueryResponse) iBaseDao.getResponse()).getMain(), new ArrayList());
            }
        } else if (((TicketDuplicationCheckDao.DuplicationCheckResponse) iBaseDao.getResponse()).getRsvCnt() > 0) {
            C6637k.getCDialog(K(), 1002, 1, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.payment_duplication_msg)).setButtonListener(new DialogInterface.OnClickListener() { // from class: F5.d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f1262a.D0(dialogInterface, i8);
                }
            }).showDialog();
        } else {
            z0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        super.onReceiveError(iBaseDao, c6536a);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_delay_pnr_query == id) {
            DelayPNRQueryDao.DelayPNRQueryResponse delayPNRQueryResponse = (DelayPNRQueryDao.DelayPNRQueryResponse) iBaseDao.getResponse();
            String str = delayPNRQueryResponse.gethMsgCd();
            String str2 = delayPNRQueryResponse.gethMsgTxt();
            if ("WRZ000001".equals(str)) {
                C6637k.getCDialog(K(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(str2).setButtonListener(new DialogInterface.OnClickListener() { // from class: F5.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        this.f1260a.E0(dialogInterface, i8);
                    }
                }).showDialog();
                return;
            }
            return;
        }
        if (AbstractC5955f.dao_delay_pnr_accept == id) {
            BaseResponse response = iBaseDao.getResponse();
            String str3 = response.gethMsgCd();
            String str4 = response.gethMsgTxt();
            if ("WRZ000001".equals(str3)) {
                C6637k.getCDialog(K(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(str4).setButtonListener(new DialogInterface.OnClickListener() { // from class: F5.c
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        this.f1261a.F0(dialogInterface, i8);
                    }
                }).showDialog();
            }
        }
    }

    @Override // F5.a
    public void setIPaymentRequest(IPaymentRequest iPaymentRequest) {
        this.f28537l = iPaymentRequest;
    }

    @Override // F5.a
    public void setReservationResponse(ReservationResponse reservationResponse) {
        this.f28538m = reservationResponse;
        G0();
        if (i.PAYMENT_MAAS.equals(getPaymentType())) {
            this.f28548w = 0;
            this.f28549x = 0;
        }
    }
}
