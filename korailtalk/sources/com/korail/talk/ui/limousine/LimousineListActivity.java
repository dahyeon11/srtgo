package com.korail.talk.ui.limousine;

import I4.b;
import T4.c;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.certification.BusReservationListDao;
import com.korail.talk.network.dao.certification.BusReservationListDao.BusInquiryRequest;
import com.korail.talk.network.dao.trainsInfo.Price2FareDao;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import q5.C6112a;
import v4.g;
import y4.C6536a;
import y6.C6550j;
import z4.C6630d;
import z4.C6634h;

/* loaded from: classes.dex */
public class LimousineListActivity extends BaseViewActivity implements c.a, g {

    /* renamed from: i */
    private TextView f28091i;

    /* renamed from: j */
    private RecyclerView f28092j;

    /* renamed from: k */
    private String f28093k;

    /* renamed from: l */
    private String f28094l;

    /* renamed from: m */
    private Bundle f28095m;

    /* renamed from: n */
    private int f28096n = 1;

    /* renamed from: o */
    private String f28097o;

    /* renamed from: p */
    private String f28098p;

    /* renamed from: q */
    private String f28099q;

    /* renamed from: r */
    private String f28100r;

    /* renamed from: s */
    private String f28101s;

    /* renamed from: t */
    private String f28102t;

    /* renamed from: u */
    private String f28103u;

    /* renamed from: v */
    private String f28104v;

    /* renamed from: w */
    private String f28105w;

    /* renamed from: x */
    private String f28106x;

    /* renamed from: y */
    private ArrayList f28107y;

    /* renamed from: z */
    private C6112a f28108z;

    class a implements C6112a.c {
        a() {
        }

        @Override // q5.C6112a.c
        public void onClick(int i8) {
            Intent intent = new Intent(LimousineListActivity.this, (Class<?>) LimousineSelectSeatActivity.class);
            intent.putExtra("inquiryData", LimousineListActivity.this.f28095m);
            intent.putExtra("passengerCount", LimousineListActivity.this.f28096n);
            intent.putExtra("selectDay", LimousineListActivity.this.f28097o);
            intent.putExtra("selectHour", LimousineListActivity.this.f28103u);
            intent.putExtra(b.ARV_RS_STN_CD, LimousineListActivity.this.f28099q);
            String trnGpCd = ((BusReservationListDao.BusList) LimousineListActivity.this.f28107y.get(i8)).getTrnGpCd();
            String runDt = ((BusReservationListDao.BusList) LimousineListActivity.this.f28107y.get(i8)).getRunDt();
            String dptStnRunOrdr = ((BusReservationListDao.BusList) LimousineListActivity.this.f28107y.get(i8)).getDptStnRunOrdr();
            String arvStnRunOrdr = ((BusReservationListDao.BusList) LimousineListActivity.this.f28107y.get(i8)).getArvStnRunOrdr();
            intent.putExtra(Price2FareDao.Price2Fare.trnNoString, ((BusReservationListDao.BusList) LimousineListActivity.this.f28107y.get(i8)).getTrnNo());
            intent.putExtra("TrnGpCd", trnGpCd);
            intent.putExtra("RunDt", runDt);
            intent.putExtra("DptStnRunOrdr", dptStnRunOrdr);
            intent.putExtra("ArvStnRunOrdr", arvStnRunOrdr);
            intent.putExtra("selectHour", ((BusReservationListDao.BusList) LimousineListActivity.this.f28107y.get(i8)).getDptTm());
            intent.putExtra("restSeat", ((BusReservationListDao.BusList) LimousineListActivity.this.f28107y.get(i8)).getGnrmRestSeatNum());
            intent.putExtra("mDPassengerOption", LimousineListActivity.this.getIntent().getBundleExtra("mDPassengerOption"));
            LimousineListActivity.this.startActivity(intent);
        }
    }

    private void A0() {
    }

    private void B0() {
        this.f28097o = this.f28095m.getString(b.DPT_DT);
        this.f28098p = this.f28095m.getString("dptRsStnCd");
        this.f28099q = this.f28095m.getString(b.ARV_RS_STN_CD);
        this.f28100r = this.f28095m.getString("arvRsStnNm");
        this.f28101s = this.f28095m.getString("tmGpCd");
        this.f28102t = this.f28095m.getString("psrmClCd");
        this.f28103u = this.f28095m.getString(b.DPT_TM);
        this.f28104v = this.f28095m.getString(Price2FareDao.Price2Fare.trnNoString);
        this.f28105w = this.f28095m.getString("seatAttCd");
        this.f28106x = this.f28095m.getString("rsvSaleDvCd");
    }

    private String C0(String str) throws ParseException {
        String str2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        try {
            Date date = simpleDateFormat.parse(this.f28097o);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            if (str.equals("next")) {
                calendar.add(5, 1);
                str2 = simpleDateFormat.format(calendar.getTime());
            } else {
                calendar.add(5, -1);
                str2 = simpleDateFormat.format(calendar.getTime());
            }
            return str2;
        } catch (ParseException e8) {
            e8.printStackTrace();
            return "";
        }
    }

    private void D0() {
    }

    private void E0() {
        findViewById(AbstractC5955f.prevDayBtn).setOnClickListener(this);
        findViewById(AbstractC5955f.nextDayBtn).setOnClickListener(this);
    }

    private void F0(BusReservationListDao.BusInquiryResponse busInquiryResponse) {
        ArrayList<BusReservationListDao.BusList> trainList = busInquiryResponse.getTrainList();
        this.f28107y = trainList;
        if (trainList == null) {
            this.f28107y = new ArrayList();
        }
        C6112a c6112a = new C6112a(this, this.f28107y, this.f28096n, this.f28100r);
        this.f28108z = c6112a;
        c6112a.setItemClickListener(new a());
        this.f28092j.setAdapter(this.f28108z);
        this.f28092j.setLayoutManager(new LinearLayoutManager(this, 1, false));
    }

    private void G0() {
    }

    private void H0() {
        m0();
        findViewById(AbstractC5955f.backBtn).setVisibility(0);
        this.f28091i = (TextView) findViewById(AbstractC5955f.departureDateTxt);
        this.f28092j = (RecyclerView) findViewById(AbstractC5955f.rcv_bus_list);
        D0();
        G0();
    }

    private void I0() throws ParseException {
        this.f28097o = C0("next");
        z0();
    }

    private void J0() throws ParseException {
        this.f28097o = C0("prev");
        z0();
    }

    private void scrollToOption(View view) {
    }

    private void setText() {
        setAppTitle(AbstractC5959j.drawer_menu_limousine_booking_list);
        this.f28091i.setText(getIntent().getStringExtra("dateText"));
    }

    private void y0() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        String str = simpleDateFormat.format(Calendar.getInstance().getTime());
        if (this.f28097o.equals("20241101") || this.f28097o.equals(str)) {
            findViewById(AbstractC5955f.prevDayBtn).setEnabled(false);
        } else {
            findViewById(AbstractC5955f.prevDayBtn).setEnabled(true);
        }
        try {
            Date date = simpleDateFormat.parse(this.f28097o);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            this.f28091i.setText(C6634h.getStringFromCalendar(calendar, "yyyy년 MM월 dd일 (E)"));
        } catch (ParseException e8) {
            e8.printStackTrace();
        }
    }

    private void z0() throws ParseException {
        BusReservationListDao busReservationListDao = new BusReservationListDao();
        BusReservationListDao.BusInquiryRequest busInquiryRequest = busReservationListDao.new BusInquiryRequest();
        busInquiryRequest.setDptDt(this.f28097o);
        busInquiryRequest.setDptRsStnCd(this.f28098p);
        busInquiryRequest.setArvRsStnCd(this.f28099q);
        busInquiryRequest.setTrnGpCd(this.f28101s);
        busInquiryRequest.setPsrmClCd(this.f28102t);
        busInquiryRequest.setDptTm(this.f28103u);
        busInquiryRequest.setTrnNo(this.f28104v);
        busInquiryRequest.setSeatAttCd(this.f28105w);
        busInquiryRequest.setRsvSaleDvCd(this.f28106x);
        busReservationListDao.setRequest(busInquiryRequest);
        executeDao(busReservationListDao);
        y0();
    }

    @Override // T4.c.a
    public void onChangePersonInfo(Bundle bundle, int i8, String str) {
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) throws ParseException {
        int id = view.getId();
        if (AbstractC5955f.prevDayBtn == id) {
            J0();
        } else if (AbstractC5955f.nextDayBtn == id) {
            I0();
        }
        if (AbstractC5955f.btn_limousine_pay == id) {
            refreshDate();
            Intent intent = new Intent(getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
            intent.putExtra("WEB_POST_URL", r4.g.LIMOUSINE_INFORMATION_URL);
            startActivity(intent);
            A0();
            return;
        }
        if (AbstractC5955f.iv_limousine_info != id) {
            super.onClick(view);
            return;
        }
        Intent intent2 = new Intent(getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
        intent2.putExtra("WEB_POST_URL", r4.g.LIMOUSINE_INFORMATION_URL);
        startActivity(intent2);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, ParseException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_limousine_list);
        this.f28093k = getIntent().getStringExtra("selectDay");
        this.f28094l = getIntent().getStringExtra("selectHour");
        this.f28095m = getIntent().getBundleExtra("inquiryData");
        this.f28096n = getIntent().getIntExtra("passengerCount", 1);
        if (C6630d.isNull(bundle)) {
            H0();
            setText();
            E0();
            B0();
            z0();
            y0();
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
        if (AbstractC5955f.dao_bus_reservation_list == iBaseDao.getId()) {
            this.f28092j.setVisibility(0);
            F0((BusReservationListDao.BusInquiryResponse) iBaseDao.getResponse());
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        super.onReceiveError(iBaseDao, c6536a);
        if (AbstractC5955f.dao_bus_reservation_list == iBaseDao.getId()) {
            this.f28092j.setVisibility(8);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onResume() {
        refreshDate();
        super.onResume();
    }

    public void refreshDate() {
    }
}
