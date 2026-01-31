package com.korail.talk.ui.limousine;

import Q7.X;
import T4.c;
import T4.d;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.certification.BusReservationSeatListDao;
import com.korail.talk.network.dao.certification.BusReservationSeatListDao.BusSeatListRequest;
import com.korail.talk.network.dao.certification.BusReservationSeatListDao.SeatList;
import com.korail.talk.network.dao.certification.LReservationDao;
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
import com.korail.talk.ui.payment.PaymentActivity;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import q5.C6113b;
import r4.e;
import r4.i;
import r4.s;
import v4.g;
import y6.C6550j;
import z4.C6630d;
import z4.C6634h;
import z4.O;

/* loaded from: classes.dex */
public class LimousineSelectSeatActivity extends BaseViewActivity implements c.a, g {

    /* renamed from: A, reason: collision with root package name */
    private String f28110A;

    /* renamed from: B, reason: collision with root package name */
    private Bundle f28111B;

    /* renamed from: C, reason: collision with root package name */
    private String f28112C;

    /* renamed from: D, reason: collision with root package name */
    private ArrayList f28113D;

    /* renamed from: E, reason: collision with root package name */
    private C6113b f28114E;

    /* renamed from: I, reason: collision with root package name */
    private d f28118I;

    /* renamed from: i, reason: collision with root package name */
    private TextView f28119i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f28120j;

    /* renamed from: k, reason: collision with root package name */
    private RecyclerView f28121k;

    /* renamed from: l, reason: collision with root package name */
    private LinearLayout f28122l;

    /* renamed from: m, reason: collision with root package name */
    private TextView f28123m;

    /* renamed from: n, reason: collision with root package name */
    private Button f28124n;

    /* renamed from: o, reason: collision with root package name */
    private String f28125o;

    /* renamed from: p, reason: collision with root package name */
    private String f28126p;

    /* renamed from: q, reason: collision with root package name */
    private Bundle f28127q;

    /* renamed from: s, reason: collision with root package name */
    private String f28129s;

    /* renamed from: t, reason: collision with root package name */
    private String f28130t;

    /* renamed from: u, reason: collision with root package name */
    private String f28131u;

    /* renamed from: v, reason: collision with root package name */
    private String f28132v;

    /* renamed from: w, reason: collision with root package name */
    private String f28133w;

    /* renamed from: x, reason: collision with root package name */
    private String f28134x;

    /* renamed from: y, reason: collision with root package name */
    private String f28135y;

    /* renamed from: z, reason: collision with root package name */
    private String f28136z;

    /* renamed from: r, reason: collision with root package name */
    private int f28128r = 1;

    /* renamed from: F, reason: collision with root package name */
    int f28115F = 0;

    /* renamed from: G, reason: collision with root package name */
    int f28116G = -1;

    /* renamed from: H, reason: collision with root package name */
    private ReservationResponse f28117H = null;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        public int compare(BusReservationSeatListDao.SeatList seatList, BusReservationSeatListDao.SeatList seatList2) {
            return LimousineSelectSeatActivity.this.B0(seatList.getSeat_no()).compareTo(LimousineSelectSeatActivity.this.B0(seatList2.getSeat_no()));
        }
    }

    class b implements C6113b.c {
        b() {
        }

        @Override // q5.C6113b.c
        public void onClick(int i8) {
            LimousineSelectSeatActivity.this.I0(i8);
        }
    }

    class c extends GridLayoutManager.c {
        c() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int getSpanSize(int i8) {
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0(DialogInterface dialogInterface, int i8) {
        if (i8 == 100) {
            w0(this.f28117H.getH_pnr_no(), this.f28117H.getH_jrny_cnt());
            return;
        }
        if (i8 == 102 && this.f28117H != null) {
            RsvPaymentDao.RsvPaymentRequest rsvPaymentRequest = new RsvPaymentDao().new RsvPaymentRequest();
            rsvPaymentRequest.setHidPnrNo(this.f28117H.getH_pnr_no());
            rsvPaymentRequest.setWctNo(this.f28117H.getH_wct_no());
            rsvPaymentRequest.setJobSqNo1(this.f28117H.getH_tmp_job_sqno1());
            rsvPaymentRequest.setJobSqNo2(this.f28117H.getH_tmp_job_sqno2());
            rsvPaymentRequest.setHidRsvChgNo(this.f28117H.getJrny_infos().getJrny_info().get(0).getH_rsv_chg_no());
            Intent intent = new Intent(getApplicationContext(), (Class<?>) PaymentActivity.class);
            intent.putExtra("PAYMENT_TYPE", i.PAYMENT_DEFAULT);
            intent.putExtra("PAYMENT_REQUEST", rsvPaymentRequest);
            intent.putExtra("COMMON_RESERVATION_RESPONSE", this.f28117H);
            intent.putExtra("IS_POINT_STEP", true);
            startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Integer B0(String str) {
        return Integer.valueOf(Integer.parseInt(str));
    }

    private void C0(int i8, boolean z8) {
        if (z8) {
            this.f28116G = -1;
            this.f28115F--;
            ((BusReservationSeatListDao.SeatList) this.f28113D.get(i8)).setSelected(false);
        } else {
            if (this.f28128r != 1) {
                this.f28115F++;
            } else {
                this.f28115F = 1;
                int i9 = this.f28116G;
                if (i9 != -1) {
                    ((BusReservationSeatListDao.SeatList) this.f28113D.get(i9)).setSelected(false);
                }
                this.f28116G = i8;
            }
            ((BusReservationSeatListDao.SeatList) this.f28113D.get(i8)).setSelected(true);
        }
        this.f28114E.notifyDataSetChanged();
        if (this.f28115F > 0) {
            this.f28122l.setVisibility(0);
            this.f28123m.setText(this.f28115F + "명 좌석 선택 / 총 " + this.f28128r + "명");
        } else {
            this.f28122l.setVisibility(8);
        }
        H0();
    }

    private void D0() {
        findViewById(AbstractC5955f.btn_limousine_pay).setOnClickListener(this);
    }

    private void E0(BusReservationSeatListDao.SeatListResponse seatListResponse) {
        BusReservationSeatListDao busReservationSeatListDao = new BusReservationSeatListDao();
        ArrayList arrayList = new ArrayList();
        Collections.sort(seatListResponse.getSeat(), new a());
        int i8 = 2;
        for (int i9 = 0; i9 < seatListResponse.getSeat().size(); i9++) {
            if (i8 == i9 && i8 < 24) {
                i8 += 3;
                arrayList.add(busReservationSeatListDao.new SeatList());
            }
            arrayList.add(seatListResponse.getSeat().get(i9));
        }
        ArrayList arrayList2 = new ArrayList();
        this.f28113D = arrayList2;
        arrayList2.addAll(arrayList);
        C6113b c6113b = new C6113b(this, this.f28113D);
        this.f28114E = c6113b;
        c6113b.setItemClickListener(new b());
        this.f28121k.setAdapter(this.f28114E);
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) this, 4, 1, false);
        gridLayoutManager.setSpanSizeLookup(new c());
        this.f28121k.setLayoutManager(gridLayoutManager);
    }

    private void F0(String str) throws NumberFormatException {
        int i8 = Integer.parseInt(str);
        this.f28120j.setText("잔여" + i8 + "석 / 전체 28석");
    }

    private void G0() {
        m0();
        findViewById(AbstractC5955f.backBtn).setVisibility(0);
        this.f28119i = (TextView) findViewById(AbstractC5955f.departureDateTxt);
        this.f28120j = (TextView) findViewById(AbstractC5955f.seatInfoText);
        this.f28121k = (RecyclerView) findViewById(AbstractC5955f.rcv_seat_list);
        this.f28122l = (LinearLayout) findViewById(AbstractC5955f.reservInfoLayout);
        this.f28123m = (TextView) findViewById(AbstractC5955f.reservCountInfo);
        this.f28124n = (Button) findViewById(AbstractC5955f.btn_limousine_pay);
    }

    private void H0() {
        int i8 = this.f28115F;
        if (i8 <= 0 || this.f28128r != i8) {
            this.f28124n.setEnabled(false);
        } else {
            this.f28124n.setEnabled(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0(int i8) {
        boolean zIsSelected = ((BusReservationSeatListDao.SeatList) this.f28113D.get(i8)).isSelected();
        int i9 = this.f28128r;
        if (i9 == 1 || this.f28115F < i9 || zIsSelected) {
            C0(i8, zIsSelected);
        }
    }

    private void setText() throws NumberFormatException, ParseException {
        setAppTitle(AbstractC5959j.drawer_menu_limousine_seat_select);
        try {
            Date date = new SimpleDateFormat("yyyyMMddHHmmss").parse(this.f28125o + this.f28126p);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            this.f28119i.setText(C6634h.getStringFromCalendar(calendar, "yyyy년 MM월 dd일 (E)") + X.SPACE + C6634h.getStringFromCalendar(calendar, "HH시 mm분"));
        } catch (ParseException e8) {
            e8.printStackTrace();
        }
        F0(this.f28112C);
    }

    private void v0() {
        BusReservationSeatListDao busReservationSeatListDao = new BusReservationSeatListDao();
        BusReservationSeatListDao.BusSeatListRequest busSeatListRequest = busReservationSeatListDao.new BusSeatListRequest();
        busSeatListRequest.setTrnClsfCd("98");
        busSeatListRequest.setTrnGpCd(this.f28134x);
        busSeatListRequest.setRunDt(this.f28135y);
        busSeatListRequest.setTrnNo(this.f28132v);
        busSeatListRequest.setSrcarNo("0001");
        busSeatListRequest.setPsrmClCd(this.f28131u);
        busSeatListRequest.setDptRsStnCd(this.f28129s);
        busSeatListRequest.setArvRsStnCd(this.f28130t);
        busSeatListRequest.setSeatAttCd(this.f28133w);
        busSeatListRequest.setDptStnRunOrdr(this.f28136z);
        busSeatListRequest.setArvStnRunOrdr(this.f28110A);
        busSeatListRequest.setTotPsgCnt(this.f28128r + "");
        busSeatListRequest.setGdNo("");
        busSeatListRequest.setArrow(false);
        busReservationSeatListDao.setRequest(busSeatListRequest);
        executeDao(busReservationSeatListDao);
    }

    private void w0(String str, String str2) {
        RsvCancelDao rsvCancelDao = new RsvCancelDao();
        RsvCancelDao.RsvCancelRequest rsvCancelRequest = rsvCancelDao.new RsvCancelRequest();
        rsvCancelRequest.setTxtPnrNo(str);
        rsvCancelRequest.setTxtJrnyCnt(str2);
        rsvCancelRequest.setTxtJrnySqno("0001");
        rsvCancelRequest.setHidRsvChgNo("000");
        rsvCancelDao.setRequest(rsvCancelRequest);
        executeDao(rsvCancelDao);
    }

    private void x0(String str, String str2, String str3, String str4) {
        RsvCancelCheckDao rsvCancelCheckDao = new RsvCancelCheckDao();
        RsvCancelCheckDao.RsvCancelCheckRequest rsvCancelCheckRequest = rsvCancelCheckDao.new RsvCancelCheckRequest();
        rsvCancelCheckRequest.setTxtPnrNo(str);
        rsvCancelCheckRequest.setTxtJrnyCnt(str2);
        rsvCancelCheckRequest.setTxtJrnySqno(str3);
        rsvCancelCheckRequest.setHidRsvChgNo(str4);
        rsvCancelCheckDao.setRequest(rsvCancelCheckRequest);
        executeDao(rsvCancelCheckDao);
    }

    private void y0() {
        d dVar = new d(this, this.f28111B);
        this.f28118I = dVar;
        ReservationRequest oReservationRequest = D4.a.getOReservationRequest(dVar);
        OJrny oJrny = new OJrny();
        int i8 = 1;
        oJrny.setTrnNo(1, this.f28132v);
        r4.d dVar2 = r4.d.DIRECT_SQ_NO;
        oJrny.setJrnyCnt(dVar2.getCode());
        oJrny.setJrnyTpCd(1, e.DIRECT.getCode());
        oJrny.setJrnySqNo(1, O.getSequenceNo(dVar2.getCode()));
        oJrny.setTrnGpCd(1, s.LIMOUSINE.getCode());
        oJrny.setTrnClsfCd(1, "98");
        oJrny.setDptRsStnCd(1, "0501");
        oJrny.setArvRsStnCd(1, this.f28130t);
        oJrny.setDptDt(1, this.f28125o);
        oJrny.setDptTm(1, this.f28126p);
        oJrny.setRunDt(1, this.f28135y);
        oJrny.setDptStnRunOrdr(1, this.f28136z);
        oJrny.setArvStnRunOrdr(1, this.f28110A);
        oJrny.setSrcarCnt(this.f28128r + "");
        for (int i9 = 0; i9 < this.f28113D.size(); i9++) {
            if (((BusReservationSeatListDao.SeatList) this.f28113D.get(i9)).isSelected()) {
                oJrny.setSrcarNo(i8, "0001");
                oJrny.setSeatNo(i8, ((BusReservationSeatListDao.SeatList) this.f28113D.get(i9)).getSeat_no());
                i8++;
            }
        }
        oReservationRequest.setOJrny(oJrny);
        IBaseDao lReservationDao = new LReservationDao();
        lReservationDao.setRequest(oReservationRequest);
        executeDao(lReservationDao);
    }

    private void z0() {
        this.f28129s = this.f28127q.getString("dptRsStnCd");
        this.f28130t = this.f28127q.getString(I4.b.ARV_RS_STN_CD);
        this.f28131u = this.f28127q.getString("psrmClCd");
        this.f28133w = this.f28127q.getString("seatAttCd");
        this.f28132v = getIntent().getStringExtra(Price2FareDao.Price2Fare.trnNoString);
        this.f28134x = getIntent().getStringExtra("TrnGpCd");
        this.f28135y = getIntent().getStringExtra("RunDt");
        this.f28136z = getIntent().getStringExtra("DptStnRunOrdr");
        this.f28110A = getIntent().getStringExtra("ArvStnRunOrdr");
    }

    @Override // T4.c.a
    public void onChangePersonInfo(Bundle bundle, int i8, String str) {
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.btn_limousine_pay == id) {
            if (this.f28115F == this.f28128r) {
                y0();
            }
        } else {
            if (AbstractC5955f.iv_limousine_info != id) {
                super.onClick(view);
                return;
            }
            Intent intent = new Intent(getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
            intent.putExtra("WEB_POST_URL", r4.g.LIMOUSINE_INFORMATION_URL);
            startActivity(intent);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, ParseException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_limousine_select_seat);
        this.f28125o = getIntent().getStringExtra("selectDay");
        this.f28126p = getIntent().getStringExtra("selectHour");
        this.f28127q = getIntent().getBundleExtra("inquiryData");
        this.f28128r = getIntent().getIntExtra("passengerCount", 1);
        this.f28112C = getIntent().getStringExtra("restSeat");
        this.f28111B = getIntent().getBundleExtra("mDPassengerOption");
        if (C6630d.isNull(bundle)) {
            G0();
            setText();
            D0();
            z0();
            v0();
            H0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity
    public void onLoginFail(boolean z8) {
        super.onLoginFail(false);
    }

    @Override // com.korail.talk.view.base.BaseActivity
    public void onNonMemberLoginSuccess() {
        super.onNonMemberLoginSuccess();
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_bus_reservation_seat_list == id) {
            E0((BusReservationSeatListDao.SeatListResponse) iBaseDao.getResponse());
            return;
        }
        if (AbstractC5955f.dao_l_reservation == id) {
            this.f28117H = (ReservationResponse) iBaseDao.getResponse();
            c0(getString(AbstractC5959j.dialog_commission_limousine_append_msg), new DialogInterface.OnClickListener() { // from class: p5.i
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f34610a.A0(dialogInterface, i8);
                }
            });
        } else if (AbstractC5955f.dao_rsv_cancel == id) {
            RsvCancelDao.RsvCancelRequest rsvCancelRequest = (RsvCancelDao.RsvCancelRequest) iBaseDao.getRequest();
            x0(rsvCancelRequest.getTxtPnrNo(), rsvCancelRequest.getTxtJrnyCnt(), rsvCancelRequest.getTxtJrnySqno(), rsvCancelRequest.getHidRsvChgNo());
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onResume() {
        super.onResume();
        ReservationResponse reservationResponse = this.f28117H;
        if (reservationResponse != null) {
            w0(reservationResponse.getH_pnr_no(), this.f28117H.getH_jrny_cnt());
            this.f28117H = null;
        }
    }

    @Override // v4.g
    public void onOptionHeaderClick(C6550j c6550j, boolean z8) {
    }
}
