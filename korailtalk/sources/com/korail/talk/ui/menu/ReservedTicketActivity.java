package com.korail.talk.ui.menu;

import A6.g;
import Q7.X;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.korail.talk.data.DisabilityReservationData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.NetfunnelDao;
import com.korail.talk.network.dao.certification.TicketRsvInquiryDao;
import com.korail.talk.network.dao.certification.TicketRsvInquiryDao.TicketRsvInquiryRequest;
import com.korail.talk.network.dao.payment.RsvPaymentDao;
import com.korail.talk.network.dao.payment.RsvPaymentDao.RsvPaymentRequest;
import com.korail.talk.network.dao.reservation.TicketRsvHistoryDao;
import com.korail.talk.network.dao.reservationCancel.RsvCancelCheckDao;
import com.korail.talk.network.dao.reservationCancel.RsvCancelCheckDao.RsvCancelCheckRequest;
import com.korail.talk.network.dao.reservationCancel.RsvCancelDao;
import com.korail.talk.network.dao.reservationCancel.RsvCancelDao.RsvCancelRequest;
import com.korail.talk.network.response.certification.ReservationResponse;
import com.korail.talk.ui.booking.mainBooking.MainBookingActivity;
import com.korail.talk.ui.certification.DisabilityCertificationActivity;
import com.korail.talk.ui.payment.PaymentActivity;
import com.korail.talk.view.base.BaseViewActivity;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import n4.AbstractC5951b;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import p4.C6054a;
import r4.i;
import r4.j;
import u4.e;
import v4.c;
import z4.C6630d;
import z4.C6634h;
import z4.C6637k;
import z4.C6641o;
import z4.C6642p;
import z4.N;
import z4.q;

/* loaded from: classes.dex */
public class ReservedTicketActivity extends BaseViewActivity {

    /* renamed from: i */
    private int f28239i;

    /* renamed from: j */
    private List f28240j;

    /* renamed from: k */
    private List f28241k;

    /* renamed from: l */
    private List f28242l;

    /* renamed from: m */
    private TextView f28243m;

    /* renamed from: n */
    private Button f28244n;

    /* renamed from: o */
    private ListView f28245o;

    /* renamed from: p */
    private c f28246p;

    /* renamed from: q */
    protected e f28247q;

    /* renamed from: r */
    protected u4.c f28248r;

    /* renamed from: s */
    protected Handler f28249s;
    public final String DEPARTURE_DATE = "DEPARTURE_DATE";
    public final String TICKET_COUNT = "TICKET_COUNT";
    public final String TICKET_TYPE = "TICKET_TYPE";
    public final String TICKET_NOTICE = "TICKET_NOTICE";
    public final String TICKET_CANCELABLE = "TICKET_CANCELABLE";
    public final String TICKET_CHANGE = "TICKET_CHANGE";
    public final String TICKET_PURCHASABLE = "TICKET_PURCHASABLE";
    public final String TICKET_TRAIN_INFO = "TICKET_TRAIN_INFO";
    public final String TICKET_PAYMENT_FLG = "TICKET_PAYMENT_FLG";

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ReservedTicketActivity.this.G0();
        }
    }

    class b extends Handler {

        /* renamed from: a */
        final /* synthetic */ Runnable f28251a;

        b(Runnable runnable) {
            this.f28251a = runnable;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            g.d dVar = g.d.toEnum(message.what);
            if (dVar.isContinue() || g.d.UserStop == dVar) {
                return;
            }
            ReservedTicketActivity.this.f28249s.post(this.f28251a);
        }
    }

    private class c extends BaseAdapter implements c.a {

        /* renamed from: a */
        private final LayoutInflater f28253a;

        private class a {
            public Button mBtnCancelable;
            public Button mBtnChange;
            public Button mBtnPurchasable;
            public TextView mTvDepartureDate;
            public TextView mTvSentTicket;
            public TextView mTvTicketCount;
            public TextView mTvTicketNotice;
            public TextView mTvTicketTrainInfo;

            private a() {
            }

            /* synthetic */ a(c cVar, a aVar) {
                this();
            }
        }

        /* synthetic */ c(ReservedTicketActivity reservedTicketActivity, a aVar) {
            this();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (C6630d.isNull(ReservedTicketActivity.this.f28242l)) {
                return 0;
            }
            return ReservedTicketActivity.this.f28242l.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i8) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i8, View view, ViewGroup viewGroup) {
            View viewInflate;
            a aVar;
            ReservedTicketActivity reservedTicketActivity;
            int i9;
            if (C6630d.isNull(view)) {
                aVar = new a(this, null);
                viewInflate = this.f28253a.inflate(AbstractC5957h.reserved_ticket_list_item, viewGroup, false);
                aVar.mTvDepartureDate = (TextView) viewInflate.findViewById(AbstractC5955f.tv_reserved_departure_date);
                aVar.mTvTicketCount = (TextView) viewInflate.findViewById(AbstractC5955f.tv_reserved_ticket_count);
                aVar.mTvTicketTrainInfo = (TextView) viewInflate.findViewById(AbstractC5955f.tv_reserved_ticket_train_info);
                aVar.mTvTicketNotice = (TextView) viewInflate.findViewById(AbstractC5955f.tv_reserved_ticket_notice);
                aVar.mTvSentTicket = (TextView) viewInflate.findViewById(AbstractC5955f.tv_reserved_ticket_sent);
                aVar.mBtnCancelable = (Button) viewInflate.findViewById(AbstractC5955f.bookingCancelBtn);
                aVar.mBtnChange = (Button) viewInflate.findViewById(AbstractC5955f.bookingChangeBtn);
                aVar.mBtnPurchasable = (Button) viewInflate.findViewById(AbstractC5955f.promptPurchaseBtn);
                viewInflate.setTag(aVar);
            } else {
                viewInflate = view;
                aVar = (a) view.getTag();
            }
            Bundle item = getItem(i8);
            aVar.mTvDepartureDate.setText(item.getString("DEPARTURE_DATE"));
            aVar.mTvTicketCount.setText(ReservedTicketActivity.this.getString(AbstractC5959j.common_s_ticket_count, Integer.valueOf(item.getInt("TICKET_COUNT"))));
            aVar.mTvTicketTrainInfo.setText(item.getString("TICKET_TRAIN_INFO"));
            aVar.mTvTicketNotice.setText(item.getString("TICKET_NOTICE"));
            j jVar = (j) item.getSerializable("TICKET_TYPE");
            TextView textView = aVar.mTvSentTicket;
            j jVar2 = j.SENT;
            textView.setVisibility((jVar == jVar2 || jVar == j.RECEIVED) ? 0 : 8);
            aVar.mTvSentTicket.setText(jVar == jVar2 ? ReservedTicketActivity.this.getString(AbstractC5959j.reserved_ticket_sent_ticket) : jVar == j.RECEIVED ? ReservedTicketActivity.this.getString(AbstractC5959j.reserved_ticket_received_ticket) : "");
            aVar.mBtnCancelable.setEnabled(item.getBoolean("TICKET_CANCELABLE"));
            aVar.mBtnCancelable.setOnClickListener(new v4.c(this, i8));
            aVar.mBtnChange.setEnabled(item.getBoolean("TICKET_CHANGE"));
            aVar.mBtnChange.setOnClickListener(new v4.c(this, i8));
            Button button = aVar.mBtnPurchasable;
            if (item.getBoolean("TICKET_PURCHASABLE")) {
                reservedTicketActivity = ReservedTicketActivity.this;
                i9 = AbstractC5959j.reserved_ticket_pay_or_issue;
            } else {
                reservedTicketActivity = ReservedTicketActivity.this;
                i9 = AbstractC5959j.reserved_ticket_history;
            }
            button.setText(reservedTicketActivity.getString(i9));
            aVar.mBtnPurchasable.setOnClickListener(new v4.c(this, i8));
            if (item.getString("TICKET_PAYMENT_FLG", "").equals("N")) {
                aVar.mBtnPurchasable.setEnabled(false);
            } else {
                aVar.mBtnPurchasable.setEnabled(true);
            }
            return viewInflate;
        }

        @Override // v4.c.a
        public void onCustomClick(View view, int i8) {
            int id = view.getId();
            if (AbstractC5955f.bookingCancelBtn == id) {
                ReservationResponse reservationResponse = (ReservationResponse) ReservedTicketActivity.this.f28241k.get(i8);
                ReservationResponse.JrnyInfo jrnyInfo = reservationResponse.getJrny_infos().getJrny_info().get(0);
                ReservedTicketActivity.this.E0(reservationResponse.getH_pnr_no(), reservationResponse.getH_jrny_cnt(), jrnyInfo.getH_jrny_sqno(), jrnyInfo.getH_rsv_chg_no());
                return;
            }
            if (AbstractC5955f.bookingChangeBtn == id) {
                ReservationResponse reservationResponse2 = (ReservationResponse) ReservedTicketActivity.this.f28241k.get(i8);
                Intent intent = new Intent(ReservedTicketActivity.this.getApplicationContext(), (Class<?>) ReservedTicketChangeActivity.class);
                intent.putExtra("TICKET_PNR_NUMBER", reservationResponse2.getH_pnr_no());
                ReservedTicketActivity.this.startActivityForResult(intent, 115);
                return;
            }
            if (AbstractC5955f.promptPurchaseBtn == id) {
                ReservationResponse reservationResponse3 = (ReservationResponse) ReservedTicketActivity.this.f28241k.get(i8);
                if (reservationResponse3.getPsgDiscAdd_infos().getPsgDiscAdd_info().isEmpty()) {
                    ReservedTicketActivity.this.P0(i8);
                    return;
                }
                DisabilityReservationData disabilityReservationData = new DisabilityReservationData();
                disabilityReservationData.setTxtPnrNo(reservationResponse3.getH_pnr_no());
                disabilityReservationData.setReservationResponse(q.toJson(reservationResponse3));
                disabilityReservationData.setSelectedPosition(i8);
                Intent intent2 = new Intent(ReservedTicketActivity.this.getApplicationContext(), (Class<?>) DisabilityCertificationActivity.class);
                intent2.putExtra("RESERVATION_DATA", disabilityReservationData);
                ReservedTicketActivity.this.startActivityForResult(intent2, 112);
            }
        }

        public void update() {
            notifyDataSetChanged();
            ReservedTicketActivity.this.f28243m.setVisibility(getCount() > 0 ? 0 : 8);
            ReservedTicketActivity.this.f28244n.setVisibility(getCount() <= 0 ? 0 : 8);
        }

        private c() {
            this.f28253a = ReservedTicketActivity.this.getLayoutInflater();
        }

        @Override // android.widget.Adapter
        public Bundle getItem(int i8) {
            return (Bundle) ReservedTicketActivity.this.f28242l.get(i8);
        }
    }

    private void D0() {
        this.f28239i = 0;
        this.f28240j.clear();
        this.f28241k.clear();
        this.f28242l.clear();
        this.f28246p.notifyDataSetChanged();
        this.f28245o.getEmptyView().setVisibility(8);
    }

    public void E0(String str, String str2, String str3, String str4) {
        RsvCancelDao rsvCancelDao = new RsvCancelDao();
        RsvCancelDao.RsvCancelRequest rsvCancelRequest = rsvCancelDao.new RsvCancelRequest();
        rsvCancelRequest.setTxtPnrNo(str);
        rsvCancelRequest.setTxtJrnyCnt(str2);
        rsvCancelRequest.setTxtJrnySqno(str3);
        rsvCancelRequest.setHidRsvChgNo(str4);
        rsvCancelDao.setRequest(rsvCancelRequest);
        executeDao(rsvCancelDao);
    }

    private void F0(String str, String str2, String str3, String str4) {
        RsvCancelCheckDao rsvCancelCheckDao = new RsvCancelCheckDao();
        RsvCancelCheckDao.RsvCancelCheckRequest rsvCancelCheckRequest = rsvCancelCheckDao.new RsvCancelCheckRequest();
        rsvCancelCheckRequest.setTxtPnrNo(str);
        rsvCancelCheckRequest.setTxtJrnyCnt(str2);
        rsvCancelCheckRequest.setTxtJrnySqno(str3);
        rsvCancelCheckRequest.setHidRsvChgNo(str4);
        rsvCancelCheckDao.setRequest(rsvCancelCheckRequest);
        executeDao(rsvCancelCheckDao);
    }

    public void G0() {
        TicketRsvHistoryDao ticketRsvHistoryDao = new TicketRsvHistoryDao();
        ticketRsvHistoryDao.setFinishView(true);
        ticketRsvHistoryDao.setNetfunnelDao(new NetfunnelDao(this.f28248r, this.f28247q, null, new Handler(getMainLooper())));
        executeDao(ticketRsvHistoryDao);
    }

    private void H0(String str) {
        TicketRsvInquiryDao ticketRsvInquiryDao = new TicketRsvInquiryDao();
        TicketRsvInquiryDao.TicketRsvInquiryRequest ticketRsvInquiryRequest = ticketRsvInquiryDao.new TicketRsvInquiryRequest();
        ticketRsvInquiryRequest.setHidPnrNo(str);
        ticketRsvInquiryDao.setRequest(ticketRsvInquiryRequest);
        ticketRsvInquiryDao.setFinishView(true);
        executeDao(ticketRsvInquiryDao);
    }

    private int I0(TicketRsvHistoryDao.TrainInfo trainInfo) {
        return trainInfo.getH_tot_seat_cnt() + trainInfo.getH_tot_stnd_cnt();
    }

    private Bundle J0(TicketRsvHistoryDao.TrainInfo trainInfo) {
        String string;
        Bundle bundle = new Bundle();
        if ("08".equals(trainInfo.getH_rsv_tp_cd())) {
            bundle.putString("TICKET_NOTICE", getString(AbstractC5959j.reserved_ticket_wait_reservation));
            bundle.putSerializable("TICKET_TYPE", j.WAIT);
            bundle.putBoolean("TICKET_CANCELABLE", true);
            bundle.putBoolean("TICKET_PURCHASABLE", false);
            bundle.putBoolean("TICKET_CHANGE", false);
        } else if ("Y".equals(trainInfo.getH_stl_flg())) {
            String h_acpt_ps_flg = trainInfo.getH_acpt_ps_flg();
            bundle.putString("TICKET_NOTICE", getString(AbstractC5959j.reserved_ticket_pay_completed));
            if ("Y".equals(h_acpt_ps_flg)) {
                bundle.putSerializable("TICKET_TYPE", j.SENT);
                bundle.putBoolean("TICKET_CANCELABLE", false);
                bundle.putBoolean("TICKET_PURCHASABLE", false);
                bundle.putBoolean("TICKET_CHANGE", false);
            } else if ("F".equals(h_acpt_ps_flg)) {
                bundle.putSerializable("TICKET_TYPE", j.RECEIVED);
                bundle.putBoolean("TICKET_CANCELABLE", true);
                bundle.putBoolean("TICKET_PURCHASABLE", true);
                bundle.putBoolean("TICKET_CHANGE", false);
            } else {
                bundle.putSerializable("TICKET_TYPE", j.NO_ISSUE);
                bundle.putBoolean("TICKET_CANCELABLE", true);
                bundle.putBoolean("TICKET_PURCHASABLE", true);
                bundle.putBoolean("TICKET_CHANGE", false);
            }
        } else {
            String str = getString(AbstractC5959j.reserved_ticket_pay_deadline_pre) + X.LF;
            if (trainInfo.getH_payment_flg() == null || !trainInfo.getH_payment_flg().equals("N")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(getString(AbstractC5959j.reserved_ticket_pay_deadline_content, C6634h.convertFormat(trainInfo.getH_ntisu_lmt_dt() + trainInfo.getH_ntisu_lmt_tm(), "yyyyMMddHHmmss", "yyyy. MM. dd(E) HH:mm")));
                string = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                int i8 = AbstractC5959j.reserved_ticket_pay_deadline_content;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(C6634h.convertFormat(trainInfo.getH_ntisu_psb_dt() + trainInfo.getH_ise_psb_tm(), "yyyyMMddHHmmss", "yyyy. MM. dd(E) HH:mm"));
                sb3.append("~");
                sb3.append(C6634h.convertFormat(trainInfo.getH_ntisu_lmt_dt() + trainInfo.getH_ntisu_lmt_tm(), "yyyyMMddHHmmss", "yyyy. MM. dd(E) HH:mm"));
                sb2.append(getString(i8, sb3.toString()));
                string = sb2.toString();
            }
            bundle.putString("TICKET_NOTICE", (string + X.LF) + getString(AbstractC5959j.reserved_ticket_pay_deadline_desc));
            bundle.putSerializable("TICKET_TYPE", j.NORMAL);
            bundle.putBoolean("TICKET_CANCELABLE", true);
            bundle.putBoolean("TICKET_PURCHASABLE", true);
            bundle.putBoolean("TICKET_CHANGE", true);
            bundle.putString("TICKET_PAYMENT_FLG", trainInfo.getH_payment_flg() == null ? "" : trainInfo.getH_payment_flg());
        }
        return bundle;
    }

    public /* synthetic */ void K0(Intent intent) {
        DisabilityReservationData disabilityReservationData = (DisabilityReservationData) intent.getSerializableExtra("RESERVATION_DATA");
        ((ReservationResponse) this.f28241k.get(disabilityReservationData.getSelectedPosition())).getPsgDiscAdd_infos().getPsgDiscAdd_info().clear();
        P0(disabilityReservationData.getSelectedPosition());
    }

    public /* synthetic */ void L0(RsvCancelDao.RsvCancelRequest rsvCancelRequest, DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            F0(rsvCancelRequest.getTxtPnrNo(), rsvCancelRequest.getTxtJrnyCnt(), rsvCancelRequest.getTxtJrnySqno(), rsvCancelRequest.getHidRsvChgNo());
        }
    }

    public /* synthetic */ void M0(DialogInterface dialogInterface, int i8) {
        D0();
        G0();
    }

    public /* synthetic */ void N0(int i8, DialogInterface dialogInterface, int i9) {
        if (i9 != 102) {
            return;
        }
        O0(i8);
    }

    private void O0(int i8) {
        ReservationResponse reservationResponse = (ReservationResponse) this.f28241k.get(i8);
        RsvPaymentDao.RsvPaymentRequest rsvPaymentRequest = new RsvPaymentDao().new RsvPaymentRequest();
        rsvPaymentRequest.setHidPnrNo(reservationResponse.getH_pnr_no());
        rsvPaymentRequest.setWctNo(reservationResponse.getH_wct_no());
        rsvPaymentRequest.setJobSqNo1(reservationResponse.getH_tmp_job_sqno1());
        rsvPaymentRequest.setJobSqNo2(reservationResponse.getH_tmp_job_sqno2());
        rsvPaymentRequest.setHidRsvChgNo(reservationResponse.getJrny_infos().getJrny_info().get(0).getH_rsv_chg_no());
        ArrayList arrayList = new ArrayList();
        arrayList.add(reservationResponse.getH_pnr_no());
        Intent intent = new Intent(getApplicationContext(), (Class<?>) PaymentActivity.class);
        intent.putExtra("PNR_NO_LIST", arrayList);
        intent.putExtra("PAYMENT_TYPE", "Y".equals(reservationResponse.getH_fmly_info_cfm_flg()) ? i.PAYMENT_MULTI_CHILD : i.PAYMENT_DEFAULT);
        intent.putExtra("SPRM_FARE_AMOUNT", reservationResponse.getH_sprm_fare());
        intent.putExtra("TOT_PRC_AMOUNT", reservationResponse.getH_tot_prc());
        intent.putExtra("TOT_FARE_AMOUNT", reservationResponse.getH_tot_fare());
        intent.putExtra("TOT_DCNT_AMOUNT", reservationResponse.getH_tot_dcnt_amt());
        intent.putExtra("PAYMENT_REQUEST", rsvPaymentRequest);
        intent.putExtra("RESERVED_TICKET_TYPE", this.f28246p.getItem(i8).getSerializable("TICKET_TYPE"));
        intent.putExtra("COMMON_RESERVATION_RESPONSE", reservationResponse);
        intent.putExtra("IS_POINT_STEP", !A4.a.isDiscountReservation(reservationResponse));
        startActivityForResult(intent, androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR_OVERLAY);
        overridePendingTransition(AbstractC5951b.bottom_view_slide_up, AbstractC5951b.bottom_view_slide_stay);
    }

    public void P0(int i8) {
        Bundle item = this.f28246p.getItem(i8);
        if (item.getBoolean("TICKET_PURCHASABLE")) {
            if (item.getInt("TICKET_COUNT") > 9) {
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.dialog_group_issuing)).showDialog();
                return;
            } else {
                U0(i8);
                return;
            }
        }
        Intent intent = new Intent(getApplicationContext(), (Class<?>) PaymentActivity.class);
        intent.putExtra("PAYMENT_TYPE", i.PAYMENT_DEFAULT);
        intent.putExtra("RESERVED_TICKET_TYPE", item.getSerializable("TICKET_TYPE"));
        intent.putExtra("COMMON_RESERVATION_RESPONSE", (Serializable) this.f28241k.get(i8));
        startActivityForResult(intent, androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR_OVERLAY);
        overridePendingTransition(AbstractC5951b.bottom_view_slide_up, AbstractC5951b.bottom_view_slide_stay);
    }

    private void Q0() {
        this.f28239i = 0;
        this.f28240j = new ArrayList();
        this.f28241k = new ArrayList();
        this.f28242l = new ArrayList();
        this.f28249s = new Handler(getMainLooper());
    }

    private void R0() {
        this.f28244n.setOnClickListener(this);
    }

    private void S0() {
        for (TicketRsvHistoryDao.JrnyInfo jrnyInfo : this.f28240j) {
            Bundle bundle = new Bundle();
            List<TicketRsvHistoryDao.TrainInfo> train_info = jrnyInfo.getTrain_infos().getTrain_info();
            TicketRsvHistoryDao.TrainInfo trainInfo = train_info.get(0);
            bundle.putString("DEPARTURE_DATE", C6634h.convertFormat(trainInfo.getH_run_dt(), "yyyyMMdd", "yyyy년 MM월 dd일 (E)"));
            bundle.putInt("TICKET_COUNT", I0(trainInfo));
            bundle.putAll(J0(trainInfo));
            bundle.putString("TICKET_TRAIN_INFO", C6642p.getTrainInfo(train_info));
            this.f28242l.add(bundle);
        }
        this.f28246p.update();
    }

    private void T0() {
        n0(false);
        this.f28243m = (TextView) findViewById(AbstractC5955f.tv_reserved_info_msg);
        TextView textView = (TextView) findViewById(AbstractC5955f.tv_reserved_empty);
        textView.setText(N.applySpannable(getString(AbstractC5959j.reserved_ticket_no_list), new ForegroundColorSpan(Color.parseColor("#ff073b62"))));
        textView.append(N.applySpannable(getString(AbstractC5959j.reserved_ticket_auto_delete), new ForegroundColorSpan(Color.parseColor("#ff1c59ae"))));
        Button button = (Button) findViewById(AbstractC5955f.bnt_go_train_inquiry);
        this.f28244n = button;
        button.setVisibility(8);
        ListView listView = (ListView) findViewById(AbstractC5955f.lv_reserved);
        this.f28245o = listView;
        listView.setEmptyView(findViewById(AbstractC5955f.tv_reserved_empty));
        c cVar = new c(this, null);
        this.f28246p = cVar;
        this.f28245o.setAdapter((ListAdapter) cVar);
        this.f28245o.getEmptyView().setVisibility(8);
    }

    private void U0(final int i8) {
        Z(new DialogInterface.OnClickListener() { // from class: w5.l
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                this.f37431a.N0(i8, dialogInterface, i9);
            }
        });
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_reserved_ticket);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, final Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i9 == -1) {
            if (109 == i8 || 115 == i8) {
                D0();
                G0();
            } else if (112 == i8) {
                new Handler().postDelayed(new Runnable() { // from class: w5.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f37426a.K0(intent);
                    }
                }, 500L);
            }
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.bnt_go_train_inquiry == view.getId()) {
            C6641o.navigation(getApplicationContext(), MainBookingActivity.class);
        } else {
            super.onClick(view);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_reserved_ticket);
        if (C6630d.isNull(bundle)) {
            Q0();
            T0();
            setText();
            R0();
            a aVar = new a();
            boolean z8 = C6054a.IS_DEBUG_LOG;
            if (C6630d.isNull(this.f28247q) || !this.f28247q.isShowing()) {
                this.f28247q = new e(this);
                this.f28248r = new u4.c(this);
                this.f28247q.showDialog();
                this.f28248r.show();
            }
            g.BEGIN(r4.g.NETFUNNEL_SERVER_ID, r4.g.NETFUNNEL_ACTION_RESERVED_ID, this.f28247q, new b(aVar));
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity
    public void onLoginSuccess() {
        if (this.f29343b.getId() != AbstractC5955f.dao_rsv_history) {
            super.onLoginSuccess();
        } else {
            D0();
            executeRetryDao();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_rsv_history == id) {
            List<TicketRsvHistoryDao.JrnyInfo> jrny_info = ((TicketRsvHistoryDao.TicketRsvHistoryResponse) iBaseDao.getResponse()).getJrny_infos().getJrny_info();
            if (jrny_info.isEmpty()) {
                this.f28246p.update();
                return;
            }
            this.f28240j = jrny_info;
            this.f28239i = 1;
            H0(jrny_info.get(0).getTrain_infos().getTrain_info().get(0).getH_pnr_no());
            return;
        }
        if (AbstractC5955f.dao_ticket_inquiry != id) {
            if (AbstractC5955f.dao_rsv_cancel == id) {
                final RsvCancelDao.RsvCancelRequest rsvCancelRequest = (RsvCancelDao.RsvCancelRequest) iBaseDao.getRequest();
                C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.common_reservation_cancel_message)).setButtonListener(new DialogInterface.OnClickListener() { // from class: w5.j
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        this.f37428a.L0(rsvCancelRequest, dialogInterface, i8);
                    }
                }).showDialog();
                return;
            } else {
                if (AbstractC5955f.dao_rsv_cancel_check == id) {
                    C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.common_reservation_cancel_complete_message)).setButtonListener(new DialogInterface.OnClickListener() { // from class: w5.k
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i8) {
                            this.f37430a.M0(dialogInterface, i8);
                        }
                    }).showDialog();
                    return;
                }
                return;
            }
        }
        this.f28241k.add((ReservationResponse) iBaseDao.getResponse());
        if (this.f28239i >= this.f28240j.size()) {
            S0();
            return;
        }
        List list = this.f28240j;
        int i8 = this.f28239i;
        this.f28239i = i8 + 1;
        H0(((TicketRsvHistoryDao.JrnyInfo) list.get(i8)).getTrain_infos().getTrain_info().get(0).getH_pnr_no());
    }
}
