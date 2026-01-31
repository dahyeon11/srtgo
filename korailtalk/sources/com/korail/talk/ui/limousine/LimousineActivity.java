package com.korail.talk.ui.limousine;

import T4.c;
import T4.d;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.korail.talk.data.CalendarData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.certification.LReservationDao;
import com.korail.talk.network.dao.common.CommonCodeDao;
import com.korail.talk.network.dao.common.CommonCodeDao.CommonCodeRequest;
import com.korail.talk.network.dao.payment.RsvPaymentDao;
import com.korail.talk.network.dao.payment.RsvPaymentDao.RsvPaymentRequest;
import com.korail.talk.network.dao.reservationCancel.RsvCancelCheckDao;
import com.korail.talk.network.dao.reservationCancel.RsvCancelCheckDao.RsvCancelCheckRequest;
import com.korail.talk.network.dao.reservationCancel.RsvCancelDao;
import com.korail.talk.network.dao.reservationCancel.RsvCancelDao.RsvCancelRequest;
import com.korail.talk.network.dao.trainsInfo.Price2FareDao;
import com.korail.talk.network.data.reservation.old.OJrny;
import com.korail.talk.network.request.reservation.ReservationRequest;
import com.korail.talk.network.response.certification.ReservationResponse;
import com.korail.talk.ui.booking.option.date.a;
import com.korail.talk.ui.payment.PaymentActivity;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import com.korail.talk.view.CTextView;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import r4.e;
import r4.i;
import r4.s;
import v4.g;
import y6.C6550j;
import z4.C6625A;
import z4.C6626B;
import z4.C6630d;
import z4.C6631e;
import z4.H;
import z4.O;

/* loaded from: classes.dex */
public class LimousineActivity extends BaseViewActivity implements c.a, g {

    /* renamed from: i, reason: collision with root package name */
    private String[] f28077i;

    /* renamed from: j, reason: collision with root package name */
    private String[] f28078j;

    /* renamed from: k, reason: collision with root package name */
    private ViewGroup f28079k;

    /* renamed from: l, reason: collision with root package name */
    private ScrollView f28080l;

    /* renamed from: m, reason: collision with root package name */
    private TextView f28081m;

    /* renamed from: n, reason: collision with root package name */
    private TextView f28082n;

    /* renamed from: o, reason: collision with root package name */
    private Button f28083o;

    /* renamed from: p, reason: collision with root package name */
    private com.korail.talk.ui.booking.option.date.a f28084p;

    /* renamed from: q, reason: collision with root package name */
    private d f28085q;

    /* renamed from: r, reason: collision with root package name */
    private int f28086r = 0;

    /* renamed from: s, reason: collision with root package name */
    private String[] f28087s = {"인천공항T1", "인천공항T2"};

    /* renamed from: t, reason: collision with root package name */
    private String[] f28088t = {"0921", "0923"};

    class a implements a.d {
        a() {
        }

        @Override // com.korail.talk.ui.booking.option.date.a.d
        public void onChangeDateOption(CalendarData calendarData) {
            if (Integer.parseInt(LimousineActivity.this.f28084p.getSelectedDay()) < 20241101) {
                LimousineActivity.this.f28086r = 0;
                LimousineActivity.this.f28082n.setText(LimousineActivity.this.f28087s[LimousineActivity.this.f28086r]);
            }
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean zIsSelected = LimousineActivity.this.f28085q.findViewById(AbstractC5955f.headerView).isSelected();
            LimousineActivity.this.f28085q.findViewById(AbstractC5955f.headerView).setSelected(!zIsSelected);
            ImageView imageView = (ImageView) LimousineActivity.this.f28085q.findViewById(AbstractC5955f.foldImg);
            if (zIsSelected) {
                imageView.setImageResource(AbstractC5954e.unfold);
                LimousineActivity.this.f28085q.findViewById(AbstractC5955f.expandView).setVisibility(8);
            } else {
                imageView.setImageResource(AbstractC5954e.ic_fold_s);
                LimousineActivity.this.f28085q.findViewById(AbstractC5955f.expandView).setVisibility(0);
            }
        }
    }

    private void A0() {
        CommonCodeDao commonCodeDao = new CommonCodeDao();
        CommonCodeDao.CommonCodeRequest commonCodeRequest = commonCodeDao.new CommonCodeRequest();
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommonCodeDao.STATION_NM);
        arrayList.add(CommonCodeDao.STATION_CD);
        arrayList.add(CommonCodeDao.LIMOUSINE_MSG);
        commonCodeRequest.setCodeList(arrayList);
        commonCodeDao.setRequest(commonCodeRequest);
        executeDao(commonCodeDao);
    }

    private void B0(String str, String str2) {
        RsvCancelDao rsvCancelDao = new RsvCancelDao();
        RsvCancelDao.RsvCancelRequest rsvCancelRequest = rsvCancelDao.new RsvCancelRequest();
        rsvCancelRequest.setTxtPnrNo(str);
        rsvCancelRequest.setTxtJrnyCnt(str2);
        rsvCancelRequest.setTxtJrnySqno("0001");
        rsvCancelRequest.setHidRsvChgNo("000");
        rsvCancelDao.setRequest(rsvCancelRequest);
        executeDao(rsvCancelDao);
    }

    private void C0(String str, String str2, String str3, String str4) {
        RsvCancelCheckDao rsvCancelCheckDao = new RsvCancelCheckDao();
        RsvCancelCheckDao.RsvCancelCheckRequest rsvCancelCheckRequest = rsvCancelCheckDao.new RsvCancelCheckRequest();
        rsvCancelCheckRequest.setTxtPnrNo(str);
        rsvCancelCheckRequest.setTxtJrnyCnt(str2);
        rsvCancelCheckRequest.setTxtJrnySqno(str3);
        rsvCancelCheckRequest.setHidRsvChgNo(str4);
        rsvCancelCheckDao.setRequest(rsvCancelCheckRequest);
        executeDao(rsvCancelCheckDao);
    }

    private void D0() {
        ReservationRequest oReservationRequest = D4.a.getOReservationRequest(this.f28085q);
        OJrny oJrny = new OJrny();
        r4.d dVar = r4.d.DIRECT_SQ_NO;
        oJrny.setJrnyCnt(dVar.getCode());
        oJrny.setJrnyTpCd(1, e.DIRECT.getCode());
        oJrny.setJrnySqNo(1, O.getSequenceNo(dVar.getCode()));
        oJrny.setTrnGpCd(1, s.LIMOUSINE.getCode());
        oJrny.setTrnClsfCd(1, "98");
        oJrny.setDptRsStnCd(1, "0501");
        oJrny.setArvRsStnCd(1, this.f28088t[this.f28086r]);
        oJrny.setDptDt(1, this.f28084p.getSelectedDay());
        oJrny.setDptTm(1, this.f28084p.getSelectedHour());
        oReservationRequest.setOJrny(oJrny);
        IBaseDao lReservationDao = new LReservationDao();
        lReservationDao.setRequest(oReservationRequest);
        executeDao(lReservationDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E0(ReservationResponse reservationResponse, DialogInterface dialogInterface, int i8) {
        if (i8 == 100) {
            B0(reservationResponse.getH_pnr_no(), reservationResponse.getH_jrny_cnt());
            return;
        }
        if (i8 != 102) {
            return;
        }
        RsvPaymentDao.RsvPaymentRequest rsvPaymentRequest = new RsvPaymentDao().new RsvPaymentRequest();
        rsvPaymentRequest.setHidPnrNo(reservationResponse.getH_pnr_no());
        rsvPaymentRequest.setWctNo(reservationResponse.getH_wct_no());
        rsvPaymentRequest.setJobSqNo1(reservationResponse.getH_tmp_job_sqno1());
        rsvPaymentRequest.setJobSqNo2(reservationResponse.getH_tmp_job_sqno2());
        rsvPaymentRequest.setHidRsvChgNo(reservationResponse.getJrny_infos().getJrny_info().get(0).getH_rsv_chg_no());
        Intent intent = new Intent(getApplicationContext(), (Class<?>) PaymentActivity.class);
        intent.putExtra("PAYMENT_TYPE", i.PAYMENT_DEFAULT);
        intent.putExtra("PAYMENT_REQUEST", rsvPaymentRequest);
        intent.putExtra("COMMON_RESERVATION_RESPONSE", reservationResponse);
        intent.putExtra("IS_POINT_STEP", true);
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F0(View view) {
        this.f28080l.smoothScrollTo(0, view.getTop());
    }

    private void G0() {
        com.korail.talk.ui.booking.option.date.a aVar = new com.korail.talk.ui.booking.option.date.a(this);
        this.f28084p = aVar;
        aVar.setDate(C6631e.getNormalDateStrArray());
        this.f28084p.setHeaderSummary(getString(AbstractC5959j.common_departure_date));
        this.f28084p.setOnChangeDateOptionListener(new a());
        this.f28079k.addView(this.f28084p);
    }

    private void H0() {
        this.f28083o.setOnClickListener(this);
        this.f28085q.setOnChangePersonInfoListener(this);
        this.f28085q.setHeaderClickListener(this);
        findViewById(AbstractC5955f.iv_limousine_info).setOnClickListener(this);
        this.f28082n.setOnClickListener(this);
    }

    private void I0() {
        d dVar = new d(this, C6626B.getPassengerBundleData());
        this.f28085q = dVar;
        dVar.setPassengerViewText(1, getString(AbstractC5959j.common_child));
        this.f28085q.setPassengerViewVisibility(2, 8);
        this.f28085q.setPassengerViewVisibility(3, 8);
        this.f28085q.setPassengerViewVisibility(4, 8);
        this.f28085q.setPassengerViewVisibility(5, 8);
        this.f28085q.setPassengerViewVisibility(6, 8);
        this.f28085q.findViewById(AbstractC5955f.foldImg).setVisibility(0);
        this.f28085q.findViewById(AbstractC5955f.headerView).setOnClickListener(new b());
        this.f28079k.addView(this.f28085q);
    }

    private void J0() {
        m0();
        this.f28079k = (ViewGroup) findViewById(AbstractC5955f.v_limousine_container);
        this.f28080l = (ScrollView) findViewById(AbstractC5955f.sv_limousine);
        this.f28081m = (TextView) findViewById(AbstractC5955f.tv_limousine_msg);
        this.f28083o = (Button) findViewById(AbstractC5955f.btn_limousine_pay);
        this.f28082n = (TextView) findViewById(AbstractC5955f.tv_arrival_station);
        this.f28083o.setEnabled(false);
        G0();
        I0();
    }

    private void K0() {
        if (this.f28086r == 0) {
            this.f28086r = 1;
        } else {
            this.f28086r = 0;
        }
        this.f28082n.setText(this.f28087s[this.f28086r]);
    }

    public static boolean isDate1AfterDate2(String str, String str2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return simpleDateFormat.parse(str).after(simpleDateFormat.parse(str2));
        } catch (Exception unused) {
            return false;
        }
    }

    private void scrollToOption(final View view) {
        if (C6630d.isNull(view)) {
            return;
        }
        this.f28080l.post(new Runnable() { // from class: p5.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f34597a.F0(view);
            }
        });
    }

    private void setText() {
        setAppTitle(AbstractC5959j.drawer_menu_limousine_booking);
        ((CTextView) findViewById(AbstractC5955f.tv_limousine_main_msg)).setText(H.getString(getApplicationContext(), "KEY_LIMOUSINE_MAIN_MSG"));
    }

    @Override // T4.c.a
    public void onChangePersonInfo(Bundle bundle, int i8, String str) {
        this.f28083o.setEnabled(bundle.getInt("TOTAL_PERSON_COUNT") > 0);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.tv_arrival_station == id) {
            if (Integer.parseInt(this.f28084p.getSelectedDay()) < 20241101) {
                return;
            }
            K0();
            return;
        }
        if (AbstractC5955f.btn_limousine_pay != id) {
            if (AbstractC5955f.iv_limousine_info != id) {
                super.onClick(view);
                return;
            }
            Intent intent = new Intent(getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
            intent.putExtra("WEB_POST_URL", r4.g.LIMOUSINE_INFORMATION_URL);
            startActivity(intent);
            return;
        }
        refreshDate();
        if (Integer.parseInt(this.f28084p.getSelectedDay()) < 20241101) {
            D0();
            return;
        }
        Intent intent2 = new Intent(getApplicationContext(), (Class<?>) LimousineListActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(I4.b.DPT_DT, this.f28084p.getSelectedDay());
        bundle.putString("dptRsStnCd", "0501");
        bundle.putString(I4.b.ARV_RS_STN_CD, this.f28088t[this.f28086r]);
        bundle.putString("arvRsStnNm", this.f28087s[this.f28086r]);
        bundle.putString("tmGpCd", s.LIMOUSINE.getCode());
        bundle.putString("psrmClCd", "1");
        bundle.putString(I4.b.DPT_TM, this.f28084p.getSelectedHour());
        bundle.putString(Price2FareDao.Price2Fare.trnNoString, "");
        bundle.putString("seatAttCd", "");
        bundle.putString("rsvSaleDvCd", "T");
        intent2.putExtra("dateText", this.f28084p.getSelectedDay("yyyy년 MM월 dd일 (E)"));
        intent2.putExtra("inquiryData", bundle);
        intent2.putExtra("selectDay", this.f28084p.getSelectedDay());
        intent2.putExtra("selectHour", this.f28084p.getSelectedHour());
        intent2.putExtra("passengerCount", this.f28085q.getTotalCount());
        intent2.putExtra("mDPassengerOption", this.f28085q.getPassengerInfo());
        startActivity(intent2);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_limousine);
        if (C6630d.isNull(bundle)) {
            J0();
            setText();
            H0();
            A0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity
    public void onLoginFail(boolean z8) {
        super.onLoginFail(false);
    }

    @Override // v4.g
    public void onOptionHeaderClick(C6550j c6550j, boolean z8) {
        scrollToOption(c6550j);
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_common_code == id) {
            CommonCodeDao.CommonCodeResponse commonCodeResponse = (CommonCodeDao.CommonCodeResponse) iBaseDao.getResponse();
            this.f28078j = C6625A.toArray(commonCodeResponse.getStationCd());
            this.f28077i = C6625A.toArray(commonCodeResponse.getStationNm());
            this.f28081m.setText(commonCodeResponse.getLimousineMsg());
            this.f28083o.setEnabled(true);
            return;
        }
        if (AbstractC5955f.dao_l_reservation == id) {
            final ReservationResponse reservationResponse = (ReservationResponse) iBaseDao.getResponse();
            c0(getString(AbstractC5959j.dialog_commission_limousine_append_msg), new DialogInterface.OnClickListener() { // from class: p5.d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f34599a.E0(reservationResponse, dialogInterface, i8);
                }
            });
        } else if (AbstractC5955f.dao_rsv_cancel == id) {
            RsvCancelDao.RsvCancelRequest rsvCancelRequest = (RsvCancelDao.RsvCancelRequest) iBaseDao.getRequest();
            C0(rsvCancelRequest.getTxtPnrNo(), rsvCancelRequest.getTxtJrnyCnt(), rsvCancelRequest.getTxtJrnySqno(), rsvCancelRequest.getHidRsvChgNo());
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onResume() {
        refreshDate();
        super.onResume();
    }

    public void refreshDate() {
        if (C6630d.isNull(this.f28084p)) {
            return;
        }
        this.f28084p.refreshDate();
    }
}
