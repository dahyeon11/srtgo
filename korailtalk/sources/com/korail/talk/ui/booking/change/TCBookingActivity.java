package com.korail.talk.ui.booking.change;

import B4.b;
import T4.c;
import T4.e;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.korail.talk.data.CalendarData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.refund.TicketDetailDao;
import com.korail.talk.network.dao.research.OgTkInquiryDao;
import com.korail.talk.network.dao.research.OgTkInquiryDao.OgTkInquiryRequest;
import com.korail.talk.network.dao.reservation.TCReservationDao;
import com.korail.talk.network.dao.ticket.change.TripChgInfoDao;
import com.korail.talk.network.data.reservation.ROrtg;
import com.korail.talk.network.request.inquiry.RsvInquiryRequest;
import com.korail.talk.network.request.inquiry.TrainInquiryRequest;
import com.korail.talk.network.response.research.Jrny;
import com.korail.talk.ui.booking.option.date.a;
import com.korail.talk.ui.inquiry.rir.tcr.TCDirectInquiryActivity;
import com.korail.talk.ui.inquiry.rir.tcr.TCTransferInquiryActivity;
import com.korail.talk.view.base.BaseViewActivity;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import r4.EnumC6175b;
import r4.c;
import r4.d;
import z4.C6626B;
import z4.C6630d;
import z4.C6631e;
import z4.C6634h;
import z4.C6642p;
import z4.t;

/* loaded from: classes.dex */
public class TCBookingActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f27565i;

    /* renamed from: j, reason: collision with root package name */
    private OgTkInquiryDao.OgTkInquiryResponse f27566j;

    /* renamed from: k, reason: collision with root package name */
    private int f27567k;

    /* renamed from: l, reason: collision with root package name */
    private Bundle f27568l;

    /* renamed from: m, reason: collision with root package name */
    private ViewGroup f27569m;

    /* renamed from: n, reason: collision with root package name */
    private TextView f27570n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f27571o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f27572p;

    /* renamed from: q, reason: collision with root package name */
    private Button f27573q;

    /* renamed from: r, reason: collision with root package name */
    private e f27574r;

    /* renamed from: s, reason: collision with root package name */
    List f27575s = null;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.korail.talk.network.request.inquiry.RsvInquiryRequest[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.Serializable, java.lang.Object[]] */
    private void A0(String str, CalendarData calendarData, List list) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) (d.DIRECT_SQ_NO.getCode().equals(str) ? TCDirectInquiryActivity.class : TCTransferInquiryActivity.class));
        intent.putExtra("IS_DIRECT", true);
        intent.putExtra("RESERVATION_TYPE", c.RSV_DEFAULT);
        intent.putExtra("MENU_TYPE", EnumC6175b.DEFAULT);
        intent.putExtra("IS_TRANSFER", false);
        intent.putExtra("INQUIRY_REQUEST", (Serializable) v0(str, calendarData));
        intent.putExtra("RESERVATION_REQUEST", w0());
        List list2 = this.f27575s;
        if (list2 != null) {
            intent.putExtra("TRIP_CHG_DATES", (Serializable) list2.toArray());
        }
        startActivityForResult(intent, 117);
    }

    private void B0() {
        ArrayList arrayList = (ArrayList) getIntent().getSerializableExtra("TICKET_RESPONSE");
        this.f27565i = arrayList;
        this.f27567k = arrayList.size();
        this.f27568l = C6626B.getPassengerBundleData((ArrayList<TicketDetailDao.TicketDetailResponse>) this.f27565i);
    }

    private void C0() {
        this.f27574r.setOnChangePersonInfoListener(new c.a() { // from class: L4.a
            @Override // T4.c.a
            public final void onChangePersonInfo(Bundle bundle, int i8, String str) {
                this.f3062a.z0(bundle, i8, str);
            }
        });
        this.f27573q.setOnClickListener(this);
    }

    private void D0() {
        this.f27574r = new e(this, this.f27568l);
        if (y0()) {
            this.f27574r.showNCardType();
        }
        this.f27569m.addView(this.f27574r);
    }

    private void E0() {
        n0(false);
        this.f27569m = (ViewGroup) findViewById(AbstractC5955f.v_tc_booking);
        this.f27570n = (TextView) findViewById(AbstractC5955f.tv_tc_booking_date);
        this.f27571o = (TextView) findViewById(AbstractC5955f.tv_tc_booking_count);
        this.f27572p = (TextView) findViewById(AbstractC5955f.tv_tc_booking_train_route);
        this.f27573q = (Button) findViewById(AbstractC5955f.btn_tc_inquiry);
        D0();
    }

    private void setText() {
        setAppTitle(AbstractC5959j.common_tc);
        TicketDetailDao.TicketDetailResponse ticketDetailResponse = (TicketDetailDao.TicketDetailResponse) this.f27565i.get(0);
        List<TicketDetailDao.TicketInfo> ticket_info = ticketDetailResponse.getTicket_infos().getTicket_info();
        this.f27570n.setText(C6634h.convertFormat(ticket_info.get(0).getH_dpt_dt(), "yyyyMMdd", "yyyy년 MM월 dd일 (E)"));
        this.f27571o.setText(String.valueOf(this.f27567k));
        this.f27572p.setText(C6642p.getRoute(ticket_info, ticketDetailResponse.getH_dtour()));
    }

    private void t0() {
        Bundle passengerInfo = this.f27574r.getPassengerInfo();
        HashMap<String, String> map = new HashMap<>();
        int i8 = 0;
        while (i8 < this.f27565i.size()) {
            TicketDetailDao.TicketDetailResponse ticketDetailResponse = (TicketDetailDao.TicketDetailResponse) this.f27565i.get(i8);
            StringBuilder sb = new StringBuilder();
            sb.append(ROrtg.OGTK_SALE_WCT_NO);
            i8++;
            sb.append(i8);
            map.put(sb.toString(), ticketDetailResponse.getH_orgtk_wct_no());
            map.put(ROrtg.OGTK_SALE_DD + i8, ticketDetailResponse.getH_orgtk_ret_sale_dt());
            map.put(ROrtg.OGTK_SALE_SQ_NO + i8, ticketDetailResponse.getH_orgtk_sale_sqno());
            map.put(ROrtg.OGTK_RET_PWD + i8, ticketDetailResponse.getH_orgtk_ret_pwd());
        }
        OgTkInquiryDao ogTkInquiryDao = new OgTkInquiryDao();
        OgTkInquiryDao.OgTkInquiryRequest ogTkInquiryRequest = ogTkInquiryDao.new OgTkInquiryRequest();
        ogTkInquiryRequest.setTkCnt(passengerInfo.getInt("TOTAL_PERSON_COUNT"));
        ogTkInquiryRequest.setOgTkData(map);
        ogTkInquiryDao.setRequest(ogTkInquiryRequest);
        executeDao(ogTkInquiryDao);
    }

    private a u0(OgTkInquiryDao.OgTkInquiryResponse ogTkInquiryResponse) {
        CalendarData calendarInfo;
        Jrny jrny = ogTkInquiryResponse.getOrgTkList().get(0).getJrnyList().get(0);
        if (C6634h.isToday(jrny.getDptDt())) {
            calendarInfo = C6634h.getToday();
        } else {
            calendarInfo = C6634h.getCalendarInfo(C6634h.getCalendarFromString(jrny.getDptDt() + "000000", "yyyyMMddHHmmss"));
        }
        a aVar = new a(this);
        aVar.setHeaderSummary(getString(AbstractC5959j.common_departure_date));
        aVar.setDate(C6631e.getNormalDateStrArray());
        aVar.refreshDate(calendarInfo);
        return aVar;
    }

    private RsvInquiryRequest[] v0(String str, CalendarData calendarData) {
        TrainInquiryRequest[] trainInquiryRequestArr = {new TrainInquiryRequest()};
        b.getRsvInquiryRequest(getApplicationContext(), trainInquiryRequestArr, x0(this.f27566j), u0(this.f27566j), this.f27574r, str, calendarData);
        TrainInquiryRequest trainInquiryRequest = trainInquiryRequestArr[0];
        t.d("여행변경 n카드 DcntKndCd : " + this.f27566j.getOrgTkList().get(0).getCmpnList().get(0).getDcntKndCd());
        if ("53".equals(this.f27566j.getOrgTkList().get(0).getCmpnList().get(0).getDcntKndCd())) {
            trainInquiryRequest.setEtrPath("CN");
        } else {
            trainInquiryRequest.setEtrPath("C");
        }
        trainInquiryRequest.setTkDptDt(this.f27566j.getOrgTkList().get(0).getJrnyList().get(0).getDptDt());
        trainInquiryRequest.setTkDptTm(this.f27566j.getOrgTkList().get(0).getJrnyList().get(0).getDptTm());
        trainInquiryRequest.setTkTrnNo(this.f27566j.getOrgTkList().get(0).getJrnyList().get(0).getTrnNo());
        return trainInquiryRequestArr;
    }

    private TCReservationDao.TCReservationRequest w0() {
        return D4.b.getTicketChangeReservationRequest(this.f27566j, this.f27574r, null);
    }

    private V4.b x0(OgTkInquiryDao.OgTkInquiryResponse ogTkInquiryResponse) {
        String[] strArr = {ogTkInquiryResponse.getOrgTkList().get(0).getJrnyList().get(0).getDptRsStnNm(), ogTkInquiryResponse.getOrgTkList().get(0).getJrnyList().get(!r4.e.DIRECT.getCode().equals(ogTkInquiryResponse.getOrgTkList().get(0).getJrnyList().get(0).getJrnyTpCd()) ? 1 : 0).getArvRsStnNm()};
        V4.b bVar = new V4.b(this);
        bVar.setStationInfo(strArr[0], strArr[1], 0);
        return bVar;
    }

    private boolean y0() {
        return "443".equals(((TicketDetailDao.TicketDetailResponse) this.f27565i.get(0)).getTicket_infos().getTicket_info().get(0).getTk_seat_info().get(0).getH_dcnt_knd_cd());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(Bundle bundle, int i8, String str) {
        this.f27573q.setEnabled(bundle.getInt("TOTAL_PERSON_COUNT") == this.f27567k);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (-1 == i9) {
            A0((intent.getBooleanExtra("IS_DIRECT", false) ? d.DIRECT_SQ_NO : d.TRANSFER_SQ_NO).getCode(), C6634h.getCalendarInfo(C6634h.getCalendarFromString(intent.getStringExtra("ROUTE_DATE"), "yyyyMMddHHmmss")), null);
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.btn_tc_inquiry == view.getId()) {
            t0();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_tc_booking);
        if (C6630d.isNull(bundle)) {
            B0();
            E0();
            setText();
            C0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_og_tk_inquiry == id) {
            OgTkInquiryDao.OgTkInquiryResponse ogTkInquiryResponse = (OgTkInquiryDao.OgTkInquiryResponse) iBaseDao.getResponse();
            this.f27566j = ogTkInquiryResponse;
            A0((r4.e.DIRECT.getCode().equals(ogTkInquiryResponse.getOrgTkList().get(0).getJrnyList().get(0).getJrnyTpCd()) ? d.DIRECT_SQ_NO : d.TRANSFER_SQ_NO).getCode(), null, this.f27575s);
        } else if (AbstractC5955f.dao_ticket_trip_chg_info == id) {
            this.f27575s = ((TripChgInfoDao.TripChgInfoDaoResponse) iBaseDao.getResponse()).getTripChgDates();
        }
    }
}
