package com.korail.talk.ui.menu;

import Q7.X;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.appcompat.app.g;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.cart.CartListDao;
import com.korail.talk.network.dao.cart.CartListDao.CartListRequest;
import com.korail.talk.network.dao.cart.VerifyMaasStatusDao;
import com.korail.talk.network.dao.cart.VerifyMaasStatusDao.VerifyMaasStatusRequest;
import com.korail.talk.network.dao.certification.TicketRsvInquiryDao;
import com.korail.talk.network.dao.certification.TicketRsvInquiryDao.TicketRsvInquiryRequest;
import com.korail.talk.network.dao.pay.IntgStlDao;
import com.korail.talk.network.dao.pay.IntgStlDao.IntgStlRequest;
import com.korail.talk.network.dao.pay.StbkAcntDao;
import com.korail.talk.network.dao.reservationCancel.RsvCancelCheckDao;
import com.korail.talk.network.dao.reservationCancel.RsvCancelCheckDao.RsvCancelCheckRequest;
import com.korail.talk.network.dao.reservationCancel.RsvCancelDao;
import com.korail.talk.network.dao.reservationCancel.RsvCancelDao.RsvCancelRequest;
import com.korail.talk.network.dao.ticket.MaasCancelDao;
import com.korail.talk.network.dao.ticket.MaasCancelDao.MaasCancelRequest;
import com.korail.talk.network.response.certification.ReservationResponse;
import com.korail.talk.ui.booking.mainBooking.MainBookingActivity;
import com.korail.talk.ui.certification.DisabilityCertificationActivity;
import com.korail.talk.ui.payment.PaymentActivity;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import m4.C5908a;
import n4.AbstractC5951b;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import p4.C6054a;
import r4.i;
import s4.C6219c;
import v4.c;
import w5.AbstractC6468a;
import y4.C6536a;
import z4.C6630d;
import z4.C6634h;
import z4.C6637k;
import z4.C6641o;
import z4.H;
import z4.N;

/* loaded from: classes.dex */
public class BasketTicketActivity extends BaseViewActivity implements View.OnClickListener {

    /* renamed from: D */
    private ArrayList f28185D;

    /* renamed from: E */
    private CartListDao.CartListResponse f28186E;

    /* renamed from: F */
    private List f28187F;

    /* renamed from: G */
    private ArrayList f28188G;

    /* renamed from: H */
    private int f28189H;

    /* renamed from: I */
    private ListView f28190I;

    /* renamed from: J */
    private b f28191J;

    /* renamed from: K */
    private ViewFlipper f28192K;

    /* renamed from: L */
    private CheckBox f28193L;

    /* renamed from: i */
    private final String f28194i = "JRNY_TP_CD";

    /* renamed from: j */
    private final String f28195j = "PNR_NO";

    /* renamed from: k */
    private final String f28196k = DisabilityCertificationActivity.SQ_NO;

    /* renamed from: l */
    private final String f28197l = "DEPARTURE_DATE";

    /* renamed from: m */
    private final String f28198m = "TICKET_COUNT";

    /* renamed from: n */
    private final String f28199n = "TICKET_NOTICE";

    /* renamed from: o */
    private final String f28200o = "TRAIN_NAME";

    /* renamed from: p */
    private final String f28201p = "TOTAL_AMOUNT";

    /* renamed from: q */
    private final String f28202q = "RECEIVED_AMOUNT";

    /* renamed from: r */
    private final String f28203r = "RESERVATION";

    /* renamed from: s */
    private final String f28204s = "LUMP_STL_TGT_NO";

    /* renamed from: t */
    private final String f28205t = "H_VR_RSV_NO";

    /* renamed from: u */
    private final String f28206u = "ADD_SRV_DV_CD";

    /* renamed from: v */
    private final String f28207v = "COPT_ENT_RSV_NO";

    /* renamed from: w */
    private final String f28208w = "CHECK_BOX";

    /* renamed from: x */
    private final String f28209x = "IS_DISCOUNT_ABLE";

    /* renamed from: y */
    private final String f28210y = "h_vr_rsv_no";

    /* renamed from: z */
    private final String f28211z = "h_rcvd_amt";

    /* renamed from: A */
    private final String f28182A = "custMgNo";

    /* renamed from: B */
    private final String f28183B = "IS_LIMOUSINE_TICKET";

    /* renamed from: C */
    private final String f28184C = "HID_RSV_CHG_NO";

    private class b extends BaseAdapter implements c.a {

        /* renamed from: a */
        private final LayoutInflater f28212a;

        private class a {
            public Button mBtnBookingDetail;
            public Button mBtnBuyInstant;
            public Button mBtnCancel;
            public CheckBox mCheckBox;
            public TextView mTvDepartureDate;
            public TextView mTvTicketCnt;
            public TextView mTvTicketNotice;
            public TextView mTvTotalAmt;
            public TextView mTvTrainRoute;

            private a() {
            }

            /* synthetic */ a(b bVar, a aVar) {
                this();
            }
        }

        public b() {
            this.f28212a = BasketTicketActivity.this.getLayoutInflater();
        }

        public Bundle b(int i8) {
            return (Bundle) BasketTicketActivity.this.f28185D.get(i8);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (C6630d.isNull(BasketTicketActivity.this.f28185D)) {
                return 0;
            }
            return BasketTicketActivity.this.f28185D.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i8) {
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i8) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i8, View view, ViewGroup viewGroup) {
            a aVar;
            View viewInflate;
            if (C6630d.isNull(view)) {
                aVar = new a();
                viewInflate = this.f28212a.inflate(AbstractC5957h.basket_ticket_list_item, viewGroup, false);
                aVar.mTvDepartureDate = (TextView) viewInflate.findViewById(AbstractC5955f.departureDateTxt);
                aVar.mTvTicketCnt = (TextView) viewInflate.findViewById(AbstractC5955f.ticketCntTxt);
                aVar.mTvTrainRoute = (TextView) viewInflate.findViewById(AbstractC5955f.train_route);
                aVar.mTvTicketNotice = (TextView) viewInflate.findViewById(AbstractC5955f.ticketNoticeTxt);
                aVar.mTvTotalAmt = (TextView) viewInflate.findViewById(AbstractC5955f.tv_total_amt);
                aVar.mBtnCancel = (Button) viewInflate.findViewById(AbstractC5955f.bookingCancelBtn);
                aVar.mBtnBookingDetail = (Button) viewInflate.findViewById(AbstractC5955f.bookingDetailBtn);
                aVar.mBtnBuyInstant = (Button) viewInflate.findViewById(AbstractC5955f.promptPurchaseBtn);
                aVar.mCheckBox = (CheckBox) viewInflate.findViewById(AbstractC5955f.selectCheck);
                viewInflate.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
                viewInflate = view;
            }
            Bundle bundleB = b(i8);
            aVar.mCheckBox.setChecked(bundleB.getBoolean("CHECK_BOX"));
            aVar.mTvDepartureDate.setText(bundleB.getString("DEPARTURE_DATE"));
            aVar.mTvTicketCnt.setText(BasketTicketActivity.this.getString(AbstractC5959j.common_s_ticket_count, Integer.valueOf(bundleB.getInt("TICKET_COUNT"))));
            aVar.mTvTrainRoute.setText(bundleB.getString("TRAIN_NAME"));
            aVar.mTvTicketNotice.setText(bundleB.getString("TICKET_NOTICE"));
            String decimalFormatString = N.getDecimalFormatString(bundleB.getInt("TOTAL_AMOUNT"));
            String decimalFormatString2 = N.getDecimalFormatString(bundleB.getInt("RECEIVED_AMOUNT"));
            if (decimalFormatString.equals(decimalFormatString2)) {
                aVar.mTvTotalAmt.setText(N.applySpannable(decimalFormatString, new ForegroundColorSpan(Color.parseColor("#000000"))));
                aVar.mTvTotalAmt.append(BasketTicketActivity.this.getString(AbstractC5959j.ticket_basket_won));
            } else {
                aVar.mTvTotalAmt.setText(N.applySpannable(decimalFormatString, new ForegroundColorSpan(Color.parseColor("#000000")), new StrikethroughSpan()));
                aVar.mTvTotalAmt.append(BasketTicketActivity.this.getString(AbstractC5959j.ticket_basket_won));
                aVar.mTvTotalAmt.append(X.SPACE);
                aVar.mTvTotalAmt.append(N.applySpannable(decimalFormatString2, new ForegroundColorSpan(Color.parseColor("#f04922"))));
                aVar.mTvTotalAmt.append(N.applySpannable(BasketTicketActivity.this.getString(AbstractC5959j.ticket_basket_won), new ForegroundColorSpan(Color.parseColor("#f04922"))));
            }
            bundleB.getBoolean("IS_DISCOUNT_ABLE");
            aVar.mBtnBookingDetail.setVisibility(bundleB.getBoolean("IS_LIMOUSINE_TICKET") ? 8 : 0);
            aVar.mBtnBuyInstant.setVisibility(8);
            aVar.mBtnCancel.setOnClickListener(new c(this, i8));
            aVar.mBtnBookingDetail.setOnClickListener(new c(this, i8));
            aVar.mBtnBuyInstant.setOnClickListener(new c(this, i8));
            aVar.mCheckBox.setOnClickListener(new c(this, i8));
            StringBuilder sb = new StringBuilder();
            sb.append(bundleB.getString("DEPARTURE_DATE"));
            sb.append(", ");
            sb.append(BasketTicketActivity.this.getString(AbstractC5959j.common_s_ticket_count, Integer.valueOf(bundleB.getInt("TICKET_COUNT"))));
            sb.append(", ");
            sb.append(bundleB.getString("TRAIN_NAME"));
            sb.append(", ");
            if (!decimalFormatString.equals(decimalFormatString2)) {
                decimalFormatString = decimalFormatString2;
            }
            sb.append(decimalFormatString);
            sb.append(", ");
            sb.append(bundleB.getString("TICKET_NOTICE"));
            aVar.mCheckBox.setContentDescription(sb.toString());
            return viewInflate;
        }

        @Override // v4.c.a
        public void onCustomClick(View view, int i8) {
            Bundle bundleB = b(i8);
            ReservationResponse reservationResponse = (ReservationResponse) bundleB.getSerializable("RESERVATION");
            int id = view.getId();
            if (AbstractC5955f.bookingCancelBtn == id) {
                BasketTicketActivity.this.f28186E.getCart_infos().getCart_info().get(i8);
                String string = bundleB.getString("PNR_NO");
                if (string == null || string.isEmpty()) {
                    BasketTicketActivity.this.moveToMaasServiceCancel(bundleB);
                    return;
                } else {
                    BasketTicketActivity.this.G0(bundleB.getString("PNR_NO"), reservationResponse.getH_jrny_cnt(), bundleB.getString(DisabilityCertificationActivity.SQ_NO), reservationResponse.getJrny_infos().getJrny_info().get(0).getH_rsv_chg_no());
                    return;
                }
            }
            if (AbstractC5955f.bookingDetailBtn == id) {
                BasketTicketActivity.this.X0(i8);
                return;
            }
            if (AbstractC5955f.promptPurchaseBtn == id) {
                BasketTicketActivity.this.X0(i8);
            } else if (AbstractC5955f.selectCheck == id) {
                b(i8).putBoolean("CHECK_BOX", ((CheckBox) view).isChecked());
                updateList();
            }
        }

        public void updateList() {
            BasketTicketActivity.this.updateSelectedTicketsInfo();
            notifyDataSetChanged();
        }
    }

    private boolean C0(int i8) {
        String string;
        if (i8 > -1) {
            String string2 = this.f28191J.b(i8).getString("H_VR_RSV_NO");
            if (string2 != null && !string2.isEmpty()) {
                return true;
            }
        } else {
            for (int i9 = 0; i9 < this.f28185D.size(); i9++) {
                if (((Bundle) this.f28185D.get(i9)).getBoolean("CHECK_BOX") && (string = this.f28191J.b(i9).getString("H_VR_RSV_NO")) != null && !string.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private List D0(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            CartListDao.CartInfo cartInfo = (CartListDao.CartInfo) list.get(i8);
            if (i8 == 0) {
                arrayList.add((CartListDao.CartInfo) list.get(i8));
            } else {
                CartListDao.CartInfo cartInfo2 = (CartListDao.CartInfo) arrayList.get(arrayList.size() - 1);
                if (cartInfo2.getH_pnr_no().equals("") || !cartInfo2.getH_pnr_no().equals(cartInfo.getH_pnr_no())) {
                    arrayList.add((CartListDao.CartInfo) list.get(i8));
                } else {
                    cartInfo2.setH_gd_nm(cartInfo2.getH_gd_nm() + X.LF + cartInfo.getH_gd_nm());
                    arrayList.remove(cartInfo2);
                    arrayList.add(cartInfo2);
                }
            }
        }
        return arrayList;
    }

    private void E0() {
        CartListDao cartListDao = new CartListDao();
        cartListDao.setRequest(cartListDao.new CartListRequest());
        executeDao(cartListDao);
    }

    private void F0(MaasCancelDao.MaasCancelRequest maasCancelRequest) {
        MaasCancelDao maasCancelDao = new MaasCancelDao();
        maasCancelDao.setRequest(maasCancelRequest);
        executeDao(maasCancelDao);
    }

    public void G0(String str, String str2, String str3, String str4) {
        RsvCancelDao rsvCancelDao = new RsvCancelDao();
        RsvCancelDao.RsvCancelRequest rsvCancelRequest = rsvCancelDao.new RsvCancelRequest();
        rsvCancelRequest.setTxtPnrNo(str);
        rsvCancelRequest.setTxtJrnyCnt(str2);
        rsvCancelRequest.setTxtJrnySqno(str3);
        rsvCancelRequest.setHidRsvChgNo(str4);
        rsvCancelDao.setRequest(rsvCancelRequest);
        executeDao(rsvCancelDao);
    }

    private void H0(String str, String str2, String str3, String str4) {
        RsvCancelCheckDao rsvCancelCheckDao = new RsvCancelCheckDao();
        RsvCancelCheckDao.RsvCancelCheckRequest rsvCancelCheckRequest = rsvCancelCheckDao.new RsvCancelCheckRequest();
        rsvCancelCheckRequest.setTxtPnrNo(str);
        rsvCancelCheckRequest.setTxtJrnyCnt(str2);
        rsvCancelCheckRequest.setTxtJrnySqno(str3);
        rsvCancelCheckRequest.setHidRsvChgNo(str4);
        rsvCancelCheckDao.setRequest(rsvCancelCheckRequest);
        executeDao(rsvCancelCheckDao);
    }

    private void I0(String str) {
        if (str == null || str.equals("")) {
            V0(null);
            return;
        }
        TicketRsvInquiryDao ticketRsvInquiryDao = new TicketRsvInquiryDao();
        TicketRsvInquiryDao.TicketRsvInquiryRequest ticketRsvInquiryRequest = ticketRsvInquiryDao.new TicketRsvInquiryRequest();
        ticketRsvInquiryRequest.setHidPnrNo(str);
        ticketRsvInquiryDao.setRequest(ticketRsvInquiryRequest);
        executeDao(ticketRsvInquiryDao);
    }

    private void J0(int i8, ReservationResponse reservationResponse) {
        String string;
        int i9;
        int i10;
        int i11;
        boolean z8;
        String str;
        IntgStlDao.IntgStlRequest intgStlRequest = new IntgStlDao().new IntgStlRequest();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        String str2 = "IS_DISCOUNT_ABLE";
        if (i8 > -1) {
            Bundle bundleB = this.f28191J.b(i8);
            arrayList.add(bundleB.getString("PNR_NO"));
            sb.append(bundleB.getString("LUMP_STL_TGT_NO"));
            string = bundleB.getString("HID_RSV_CHG_NO");
            i10 = bundleB.getInt("RECEIVED_AMOUNT");
            i9 = bundleB.getInt("TOTAL_AMOUNT") - bundleB.getInt("RECEIVED_AMOUNT");
            z8 = bundleB.getBoolean("IS_DISCOUNT_ABLE");
            i11 = 1;
        } else {
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i14 < this.f28185D.size()) {
                if (((Bundle) this.f28185D.get(i14)).getBoolean("CHECK_BOX")) {
                    ((Bundle) this.f28185D.get(i14)).getBoolean(str2);
                    i15++;
                    Bundle bundleB2 = this.f28191J.b(i14);
                    String string2 = bundleB2.getString("PNR_NO");
                    str = str2;
                    if (string2 != null && !string2.equals("")) {
                        arrayList.add(bundleB2.getString("PNR_NO"));
                    }
                    if (sb.length() > 0) {
                        sb.append(";");
                    }
                    sb.append(bundleB2.getString("LUMP_STL_TGT_NO"));
                    i13 += bundleB2.getInt("RECEIVED_AMOUNT");
                    i12 += bundleB2.getInt("TOTAL_AMOUNT") - bundleB2.getInt("RECEIVED_AMOUNT");
                } else {
                    str = str2;
                }
                i14++;
                str2 = str;
            }
            string = "0";
            i9 = i12;
            i10 = i13;
            i11 = i15;
            z8 = true;
        }
        intgStlRequest.setCart_LumpStlTgtNo(sb.toString());
        intgStlRequest.setHidRsvChgNo(string);
        Intent intent = new Intent(getApplicationContext(), (Class<?>) PaymentActivity.class);
        intent.putExtra("PNR_NO_LIST", arrayList);
        intent.putExtra("PAYMENT_TYPE", i.PAYMENT_DEFAULT);
        intent.putExtra("PAYMENT_REQUEST", intgStlRequest);
        if (reservationResponse != null) {
            intent.putExtra("SPRM_FARE_AMOUNT", reservationResponse.getH_sprm_fare());
            intent.putExtra("TOT_PRC_AMOUNT", reservationResponse.getH_tot_prc());
            intent.putExtra("TOT_FARE_AMOUNT", reservationResponse.getH_tot_fare());
            intent.putExtra("TOT_DCNT_AMOUNT", reservationResponse.getH_tot_dcnt_amt());
        }
        intent.putExtra("COMMON_RESERVATION_RESPONSE", reservationResponse);
        if (i8 == -1 || !z8) {
            intent.putExtra("IS_POINT_STEP", true);
            intent.putExtra("RECEIVED_AMOUNT", i10);
            intent.putExtra("DISCOUNT_AMOUNT", i9);
            intent.putExtra("SELECTED_ITEM_COUNT", i11);
        }
        startActivityForResult(intent, g.FEATURE_SUPPORT_ACTION_BAR_OVERLAY);
        overridePendingTransition(AbstractC5951b.bottom_view_slide_up, AbstractC5951b.bottom_view_slide_stay);
    }

    public /* synthetic */ void K0(Bundle bundle, DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            MaasCancelDao.MaasCancelRequest maasCancelRequest = new MaasCancelDao().new MaasCancelRequest();
            maasCancelRequest.setLumpStlTgtNo(bundle.getString("LUMP_STL_TGT_NO"));
            maasCancelRequest.setCustMgNo(bundle.getString("custMgNo"));
            F0(maasCancelRequest);
        }
    }

    public /* synthetic */ void L0(RsvCancelDao.RsvCancelRequest rsvCancelRequest, DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            H0(rsvCancelRequest.getTxtPnrNo(), rsvCancelRequest.getTxtJrnyCnt(), rsvCancelRequest.getTxtJrnySqno(), rsvCancelRequest.getHidRsvChgNo());
        }
    }

    public /* synthetic */ void M0(DialogInterface dialogInterface, int i8) {
        E0();
    }

    public /* synthetic */ void N0(DialogInterface dialogInterface, int i8) {
        E0();
    }

    public /* synthetic */ void O0(DialogInterface dialogInterface, int i8, boolean z8) {
        E0();
    }

    public /* synthetic */ void P0(int i8, DialogInterface dialogInterface, int i9) {
        if (102 == i9) {
            ReservationResponse reservationResponse = i8 >= 0 ? (ReservationResponse) this.f28191J.b(i8).getSerializable("RESERVATION") : null;
            if (!C0(i8)) {
                J0(i8, reservationResponse);
                return;
            }
            VerifyMaasStatusDao verifyMaasStatusDao = new VerifyMaasStatusDao();
            VerifyMaasStatusDao.VerifyMaasStatusRequest verifyMaasStatusRequest = verifyMaasStatusDao.new VerifyMaasStatusRequest();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            if (i8 >= 0) {
                Bundle bundleB = this.f28191J.b(i8);
                arrayList.add(bundleB.getString("ADD_SRV_DV_CD"));
                arrayList3.add(bundleB.getString("COPT_ENT_RSV_NO"));
                arrayList4.add(bundleB.getString("LUMP_STL_TGT_NO"));
                arrayList2.add(bundleB.getString("H_VR_RSV_NO"));
                verifyMaasStatusRequest.setAddSrvDvCd(AbstractC6468a.a(",", arrayList));
                verifyMaasStatusRequest.setCoptEntRsvNo(AbstractC6468a.a(",", arrayList3));
                verifyMaasStatusRequest.setAddSrvReqNo(AbstractC6468a.a(",", arrayList2));
                verifyMaasStatusRequest.setLumpStlTgtNo(AbstractC6468a.a(",", arrayList4));
                verifyMaasStatusRequest.setSeletedPos(i8);
                verifyMaasStatusDao.setRequest(verifyMaasStatusRequest);
                executeDao(verifyMaasStatusDao);
                return;
            }
            for (int i10 = 0; i10 < this.f28185D.size(); i10++) {
                if (((Bundle) this.f28185D.get(i10)).getBoolean("CHECK_BOX")) {
                    Bundle bundleB2 = this.f28191J.b(i10);
                    if (bundleB2.getString("H_VR_RSV_NO") != null && !bundleB2.getString("H_VR_RSV_NO").isEmpty()) {
                        arrayList.add(bundleB2.getString("ADD_SRV_DV_CD"));
                        arrayList3.add(bundleB2.getString("COPT_ENT_RSV_NO"));
                        arrayList4.add(bundleB2.getString("LUMP_STL_TGT_NO"));
                        arrayList2.add(bundleB2.getString("H_VR_RSV_NO"));
                    }
                }
            }
            verifyMaasStatusRequest.setAddSrvDvCd(AbstractC6468a.a(",", arrayList));
            verifyMaasStatusRequest.setCoptEntRsvNo(AbstractC6468a.a(",", arrayList3));
            verifyMaasStatusRequest.setAddSrvReqNo(AbstractC6468a.a(",", arrayList2));
            verifyMaasStatusRequest.setLumpStlTgtNo(AbstractC6468a.a(",", arrayList4));
            verifyMaasStatusRequest.setSeletedPos(i8);
            verifyMaasStatusDao.setRequest(verifyMaasStatusRequest);
            executeDao(verifyMaasStatusDao);
        }
    }

    private void Q0() {
        if (C6630d.isNotNull(this.f28188G)) {
            int i8 = 0;
            while (true) {
                if (i8 >= this.f28185D.size()) {
                    break;
                }
                if (((Bundle) this.f28185D.get(i8)).getBoolean("CHECK_BOX")) {
                    this.f28190I.setSelection(i8 + 1);
                    break;
                }
                i8++;
            }
            this.f28188G = null;
        }
    }

    private void R0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f28185D.iterator();
        while (it.hasNext()) {
            Bundle bundle = (Bundle) it.next();
            if (bundle.getBoolean("CHECK_BOX")) {
                arrayList.add(bundle.getString("PNR_NO"));
            }
        }
        this.f28185D.clear();
        this.f28189H = 0;
        List<CartListDao.CartInfo> listD0 = D0(list);
        this.f28187F = listD0;
        for (CartListDao.CartInfo cartInfo : listD0) {
            Bundle bundle2 = new Bundle();
            String h_pnr_no = cartInfo.getH_pnr_no();
            if (C6630d.isNotNull(this.f28188G)) {
                bundle2.putBoolean("CHECK_BOX", this.f28188G.contains(h_pnr_no));
            } else {
                bundle2.putBoolean("CHECK_BOX", arrayList.contains(h_pnr_no));
            }
            bundle2.putString("JRNY_TP_CD", cartInfo.getH_jrny_tp_cd());
            bundle2.putString(DisabilityCertificationActivity.SQ_NO, cartInfo.getH_jrny_sqno());
            if (h_pnr_no == null) {
                h_pnr_no = "";
            }
            bundle2.putString("PNR_NO", h_pnr_no);
            bundle2.putString("DEPARTURE_DATE", C6634h.convertFormat(cartInfo.getH_dpt_dt().isEmpty() ? cartInfo.getUtlStDt() : cartInfo.getH_dpt_dt(), "yyyyMMdd", "yyyy년 MM월 dd일 (E)"));
            if (cartInfo.getH_vr_rsv_no().isEmpty()) {
                bundle2.putString("DEPARTURE_DATE", C6634h.convertFormat(cartInfo.getH_dpt_dt(), "yyyyMMdd", "yyyy년 MM월 dd일 (E)"));
                bundle2.putInt("TICKET_COUNT", cartInfo.getH_tk_cnt());
            } else {
                bundle2.putString("DEPARTURE_DATE", C6634h.convertFormat(cartInfo.getUtlStDt(), "yyyyMMdd", "yyyy년 MM월 dd일 (E)"));
                bundle2.putInt("TICKET_COUNT", 1);
            }
            String strDecryptAES = C5908a.decryptAES(this, H.getString(this, "KEY_LOGIN_CUST_NO"));
            bundle2.putString("h_vr_rsv_no", cartInfo.getH_vr_rsv_no());
            bundle2.putString("h_rcvd_amt", cartInfo.getH_rcvd_amt());
            bundle2.putString("custMgNo", strDecryptAES);
            bundle2.putString("TRAIN_NAME", cartInfo.getH_gd_nm());
            bundle2.putString("LUMP_STL_TGT_NO", cartInfo.getH_lump_stl_tgt_no());
            bundle2.putString("H_VR_RSV_NO", cartInfo.getH_vr_rsv_no());
            bundle2.putString("ADD_SRV_DV_CD", cartInfo.getAddSrvDvCd());
            bundle2.putString("COPT_ENT_RSV_NO", cartInfo.getCoptEntRsvNo());
            bundle2.putBoolean("IS_LIMOUSINE_TICKET", "3".equals(cartInfo.getH_item_dv_cd()));
            String h_stl_lmt_tm = cartInfo.getH_stl_lmt_tm();
            bundle2.putString("TICKET_NOTICE", h_stl_lmt_tm.length() == 8 ? String.format(getString(AbstractC5959j.reserved_ticket_pay_deadline), C6634h.convertFormat(h_stl_lmt_tm, "yyyyMMdd", "yyyy년 MM월 dd일")) : String.format(getString(AbstractC5959j.reserved_ticket_pay_deadline), C6634h.convertFormat(h_stl_lmt_tm, "yyyyMMddHHmmss", "yyyy년 MM월 dd일 HH:mm")));
            this.f28185D.add(bundle2);
        }
        arrayList.clear();
        I0(((Bundle) this.f28185D.get(this.f28189H)).getString("PNR_NO"));
    }

    private void S0() {
        if (getIntent().hasExtra("TICKET_PNR_ARRAY_NUMBER")) {
            this.f28188G = new ArrayList(Arrays.asList(getIntent().getStringArrayExtra("TICKET_PNR_ARRAY_NUMBER")));
        }
        this.f28185D = new ArrayList();
        this.f28189H = 0;
    }

    private void T0() {
        findViewById(AbstractC5955f.bnt_go_train_inquiry).setOnClickListener(this);
        findViewById(AbstractC5955f.payBtn).setOnClickListener(this);
    }

    private void U0() {
        this.f28190I = (ListView) findViewById(AbstractC5955f.list);
        View viewInflate = View.inflate(this, AbstractC5957h.basket_ticket_list_header, null);
        this.f28190I.addHeaderView(viewInflate);
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(AbstractC5955f.allSelectionCheck);
        this.f28193L = checkBox;
        checkBox.setOnClickListener(this);
        this.f28193L.setContentDescription("전체 승차권");
        b bVar = new b();
        this.f28191J = bVar;
        this.f28190I.setAdapter((ListAdapter) bVar);
    }

    private void V0(ReservationResponse reservationResponse) {
        Bundle bundle = (Bundle) this.f28185D.get(this.f28189H);
        if (reservationResponse != null) {
            bundle.putInt("TOTAL_AMOUNT", Integer.parseInt(reservationResponse.getH_tot_prc()) + Integer.parseInt(reservationResponse.getH_tot_fare()));
            bundle.putInt("RECEIVED_AMOUNT", Integer.parseInt(reservationResponse.getH_tot_rcvd_amt()));
            bundle.putSerializable("RESERVATION", reservationResponse);
            bundle.putBoolean("IS_DISCOUNT_ABLE", A4.a.isDiscountReservation(reservationResponse));
            bundle.putString("HID_RSV_CHG_NO", reservationResponse.getJrny_infos().getJrny_info().get(0).getH_rsv_chg_no());
        } else {
            bundle.putInt("TOTAL_AMOUNT", Integer.parseInt(((Bundle) this.f28185D.get(this.f28189H)).getString("h_rcvd_amt")));
            bundle.putInt("RECEIVED_AMOUNT", Integer.parseInt(((Bundle) this.f28185D.get(this.f28189H)).getString("h_rcvd_amt")));
            bundle.putBoolean("IS_DISCOUNT_ABLE", false);
        }
        int i8 = this.f28189H + 1;
        this.f28189H = i8;
        if (i8 < this.f28185D.size()) {
            I0(((Bundle) this.f28185D.get(this.f28189H)).getString("PNR_NO"));
            return;
        }
        this.f28191J.updateList();
        updateSelectedTicketsInfo();
        if (this.f28192K.getDisplayedChild() != 2) {
            this.f28192K.setDisplayedChild(2);
            Q0();
        }
    }

    private void W0() {
        m0();
        U0();
        this.f28192K = (ViewFlipper) findViewById(AbstractC5955f.vf_basket);
    }

    public void X0(final int i8) {
        Z(new DialogInterface.OnClickListener() { // from class: w5.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                this.f37423a.P0(i8, dialogInterface, i9);
            }
        });
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_shopping_basket);
    }

    public void checkAll() {
        Iterator it = this.f28185D.iterator();
        while (it.hasNext()) {
            ((Bundle) it.next()).putBoolean("CHECK_BOX", this.f28193L.isChecked());
        }
        this.f28191J.updateList();
    }

    public void moveToMaasServiceCancel(final Bundle bundle) {
        C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.maas_service_cancel_content)).setButtonListener(new DialogInterface.OnClickListener() { // from class: w5.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f37421a.K0(bundle, dialogInterface, i8);
            }
        }).showDialog();
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i8 == 109) {
            E0();
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        O(view);
        int id = view.getId();
        if (AbstractC5955f.allSelectionCheck == id) {
            checkAll();
            return;
        }
        if (AbstractC5955f.bnt_go_train_inquiry == id) {
            C6641o.navigation(getApplicationContext(), MainBookingActivity.class);
            return;
        }
        if (AbstractC5955f.payBtn != id) {
            super.onClick(view);
            return;
        }
        Iterator it = this.f28185D.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            if (((Bundle) it.next()).getBoolean("CHECK_BOX")) {
                z8 = true;
            }
        }
        if (z8) {
            X0(-1);
        } else {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.cart_select_message)).showDialog();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.basket_ticket_activity);
        if (C6630d.isNull(bundle)) {
            S0();
            W0();
            setText();
            T0();
            E0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_cart_list == id) {
            CartListDao.CartListResponse cartListResponse = (CartListDao.CartListResponse) iBaseDao.getResponse();
            this.f28186E = cartListResponse;
            ArrayList arrayList = new ArrayList();
            for (CartListDao.CartInfo cartInfo : cartListResponse.getCart_infos().getCart_info()) {
                if (C6054a.IS_DEBUG_LOG || cartInfo.getH_item_dv_cd().equals("0") || cartInfo.getH_item_dv_cd().equals("3") || cartInfo.getH_item_dv_cd().equals(StbkAcntDao.CHANGE_PASSWORD)) {
                    arrayList.add(cartInfo);
                }
            }
            if (arrayList.isEmpty()) {
                this.f28192K.setDisplayedChild(1);
                return;
            } else {
                R0(arrayList);
                return;
            }
        }
        if (AbstractC5955f.dao_ticket_inquiry == id) {
            V0((ReservationResponse) iBaseDao.getResponse());
            return;
        }
        if (AbstractC5955f.dao_rsv_cancel == id) {
            final RsvCancelDao.RsvCancelRequest rsvCancelRequest = (RsvCancelDao.RsvCancelRequest) iBaseDao.getRequest();
            C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.common_reservation_cancel_message)).setButtonListener(new DialogInterface.OnClickListener() { // from class: w5.c
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f37417a.L0(rsvCancelRequest, dialogInterface, i8);
                }
            }).showDialog();
        } else {
            if (AbstractC5955f.dao_maas_cancel == id) {
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.common_reservation_cancel_complete_message)).setButtonListener(new DialogInterface.OnClickListener() { // from class: w5.d
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        this.f37419a.M0(dialogInterface, i8);
                    }
                }).showDialog();
                return;
            }
            if (AbstractC5955f.dao_rsv_cancel_check == id) {
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.common_reservation_cancel_complete_message)).setButtonListener(new DialogInterface.OnClickListener() { // from class: w5.e
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        this.f37420a.N0(dialogInterface, i8);
                    }
                }).showDialog();
            } else if (AbstractC5955f.dao_verify_maas_status == id) {
                int seletedPos = ((VerifyMaasStatusDao.VerifyMaasStatusRequest) iBaseDao.getRequest()).getSeletedPos();
                J0(seletedPos, seletedPos >= 0 ? (ReservationResponse) this.f28191J.b(seletedPos).getSerializable("RESERVATION") : null);
            }
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        super.onReceiveError(iBaseDao, c6536a);
        int id = iBaseDao.getId();
        BaseResponse response = iBaseDao.getResponse();
        if (id == AbstractC5955f.dao_verify_maas_status && "S198".equals(response.gethMsgCd())) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(response.gethMsgTxt()).setButtonListener(new C6219c.InterfaceC0421c() { // from class: w5.b
                @Override // s4.C6219c.InterfaceC0421c
                public final void onClick(DialogInterface dialogInterface, int i8, boolean z8) {
                    this.f37416a.O0(dialogInterface, i8, z8);
                }
            }).showDimDialog(true);
        }
    }

    public void updateSelectedTicketsInfo() {
        TextView textView = (TextView) findViewById(AbstractC5955f.payItemCntTxt);
        TextView textView2 = (TextView) findViewById(AbstractC5955f.totalSumTxt);
        Iterator it = this.f28185D.iterator();
        int i8 = 0;
        int i9 = 0;
        while (it.hasNext()) {
            Bundle bundle = (Bundle) it.next();
            if (bundle.getBoolean("CHECK_BOX")) {
                i8++;
                i9 += bundle.getInt("RECEIVED_AMOUNT");
            }
        }
        if (this.f28185D.size() == 0 || this.f28185D.size() != i8) {
            this.f28193L.setChecked(false);
            this.f28193L.setText(getString(AbstractC5959j.ticket_basket_all_selected));
        } else {
            this.f28193L.setChecked(true);
            this.f28193L.setText(String.format(getString(AbstractC5959j.ticket_basket_all_selected_item_count), Integer.valueOf(i8)));
        }
        textView.setText(String.format(getString(AbstractC5959j.ticket_basket_pay_amount_count), Integer.valueOf(i8)));
        textView2.setText(getString(AbstractC5959j.common_amount, N.getDecimalFormatString(i9)));
    }
}
