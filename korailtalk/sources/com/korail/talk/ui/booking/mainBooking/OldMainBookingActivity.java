package com.korail.talk.ui.booking.mainBooking;

import A6.g;
import I4.h;
import P4.C0685c;
import P4.InterfaceC0686d;
import P4.InterfaceC0688f;
import P4.N;
import Q7.X;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Property;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.core.app.AbstractC0918b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r;
import androidx.viewpager.widget.ViewPager;
import com.korail.talk.application.KTApplication;
import com.korail.talk.data.CalendarData;
import com.korail.talk.data.ReceiveSRTData;
import com.korail.talk.data.StationNameData;
import com.korail.talk.database.model.MainPopupData;
import com.korail.talk.database.model.StationData;
import com.korail.talk.database.model.ZRecentStation;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.certification.ReservationDao;
import com.korail.talk.network.dao.common.CommonCodeDao;
import com.korail.talk.network.dao.payment.RsvPaymentDao;
import com.korail.talk.network.dao.payment.RsvPaymentDao.RsvPaymentRequest;
import com.korail.talk.network.dao.research.ConvenienceSettingDao;
import com.korail.talk.network.dao.research.ConvenienceSettingDao.ConvenienceSettingRequest;
import com.korail.talk.network.request.inquiry.TrainInquiryRequest;
import com.korail.talk.network.request.reservation.ReservationRequest;
import com.korail.talk.network.response.certification.ReservationResponse;
import com.korail.talk.ui.booking.option.station.StationSearch;
import com.korail.talk.ui.inquiry.rir.orr.DirectInquiryActivity;
import com.korail.talk.ui.inquiry.rir.orr.TransferInquiryActivity;
import com.korail.talk.ui.limousine.RenewalLimousineActivity;
import com.korail.talk.ui.menu.ReservedTicketActivity;
import com.korail.talk.ui.payment.PaymentActivity;
import com.korail.talk.ui.setting.MultiLanguageActivity;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import com.korail.talk.view.CTabLayout;
import com.korail.talk.view.CustomViewPager;
import com.korail.talk.view.base.BaseViewActivity;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import n4.AbstractC5951b;
import n4.AbstractC5952c;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import n4.AbstractC5960k;
import p4.C6054a;
import q4.C6111b;
import r4.EnumC6175b;
import r4.i;
import r4.p;
import s4.C6219c;
import u4.e;
import y4.C6536a;
import z4.C6627a;
import z4.C6630d;
import z4.C6631e;
import z4.C6634h;
import z4.C6637k;
import z4.C6641o;
import z4.E;
import z4.H;
import z4.M;
import z4.q;
import z4.t;
import z4.y;

/* loaded from: classes.dex */
public class OldMainBookingActivity extends BaseViewActivity implements InterfaceC0686d, StationSearch.e {

    /* renamed from: A, reason: collision with root package name */
    private Button f27757A;

    /* renamed from: B, reason: collision with root package name */
    private View f27758B;

    /* renamed from: C, reason: collision with root package name */
    private View f27759C;

    /* renamed from: D, reason: collision with root package name */
    private u4.c f27760D;

    /* renamed from: E, reason: collision with root package name */
    private e f27761E;

    /* renamed from: i, reason: collision with root package name */
    private final int f27762i = 0;

    /* renamed from: j, reason: collision with root package name */
    private final int f27763j = 1;

    /* renamed from: k, reason: collision with root package name */
    private final int f27764k = 2;

    /* renamed from: l, reason: collision with root package name */
    private final int f27765l = 3;

    /* renamed from: m, reason: collision with root package name */
    private final int f27766m = -1;

    /* renamed from: n, reason: collision with root package name */
    private boolean f27767n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f27768o;

    /* renamed from: p, reason: collision with root package name */
    private String[] f27769p;

    /* renamed from: q, reason: collision with root package name */
    private List f27770q;

    /* renamed from: r, reason: collision with root package name */
    private int f27771r;

    /* renamed from: s, reason: collision with root package name */
    private CTabLayout f27772s;

    /* renamed from: t, reason: collision with root package name */
    private CustomViewPager f27773t;

    /* renamed from: u, reason: collision with root package name */
    private d f27774u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f27775v;

    /* renamed from: w, reason: collision with root package name */
    private ImageButton f27776w;

    /* renamed from: x, reason: collision with root package name */
    private StationSearch f27777x;

    /* renamed from: y, reason: collision with root package name */
    private Button f27778y;

    /* renamed from: z, reason: collision with root package name */
    private Button f27779z;

    class a implements ViewPager.j {
        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i8) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i8, float f8, int i9) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i8) {
            if (H.getBoolean(OldMainBookingActivity.this.getApplicationContext(), "CONVENIENCE_SETTING_VISIBLE")) {
                OldMainBookingActivity.this.f27758B.setVisibility(i8 == 0 ? 0 : 8);
            }
        }
    }

    class b implements Animation.AnimationListener {
        b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            OldMainBookingActivity.this.f27777x.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ConvenienceSettingDao.CustTripInfo f27782a;

        c(ConvenienceSettingDao.CustTripInfo custTripInfo) {
            this.f27782a = custTripInfo;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            g.d dVar = g.d.toEnum(message.what);
            OldMainBookingActivity.this.f27760D.dismiss();
            if (dVar.isContinue()) {
                return;
            }
            OldMainBookingActivity.this.f27761E.dismissDialog();
            ReservationRequest oReservationRequest = D4.a.getOReservationRequest(OldMainBookingActivity.this.K0().getRouteOption(), OldMainBookingActivity.this.K0().getDepartureDateOption(), OldMainBookingActivity.this.K0().getPassengerAgeSeatCountOption(), this.f27782a);
            ArrayList arrayList = new ArrayList();
            arrayList.add("WRR800029");
            arrayList.add("ERR911531");
            arrayList.add("ERR911051");
            ReservationDao reservationDao = new ReservationDao();
            reservationDao.setRequest(oReservationRequest);
            reservationDao.setErrorMsgCdNotShowDialog(arrayList);
            OldMainBookingActivity.this.executeDao(reservationDao);
            g.END();
        }
    }

    private class d extends r {

        /* renamed from: h, reason: collision with root package name */
        private final Fragment[] f27784h;

        /* synthetic */ d(OldMainBookingActivity oldMainBookingActivity, FragmentManager fragmentManager, a aVar) {
            this(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return OldMainBookingActivity.this.f27769p.length;
        }

        @Override // androidx.fragment.app.r
        public Fragment getItem(int i8) {
            return this.f27784h[i8];
        }

        @Override // androidx.viewpager.widget.a
        public CharSequence getPageTitle(int i8) {
            return OldMainBookingActivity.this.f27769p[i8];
        }

        private d(FragmentManager fragmentManager) {
            super(fragmentManager, 1);
            this.f27784h = new Fragment[]{C0685c.newInstance(OldMainBookingActivity.this.getIntent().getExtras()), N.newInstance(OldMainBookingActivity.this.getIntent().getExtras())};
        }
    }

    private void F0(int i8) {
        ConvenienceSettingDao.CustTripInfo custTripInfo = (ConvenienceSettingDao.CustTripInfo) this.f27770q.get(i8);
        this.f27771r = i8;
        for (int i9 = 0; i9 < this.f27774u.getCount(); i9++) {
            ((InterfaceC0688f) this.f27774u.getItem(i9)).setDate(C6634h.getCalendarInfo(C6634h.getCalendarFromString(C6634h.getNearestDate(custTripInfo.getDayCd()) + custTripInfo.getJobStHr() + "0000", "yyyyMMddHHmmss")));
        }
        setStationNm(custTripInfo.getDptStnNm(), custTripInfo.getArvStnNm());
        Bundle bundle = new Bundle();
        bundle.putInt("ADULT_COUNT", z4.N.intValue(custTripInfo.getAdulCnt(), 1));
        bundle.putInt("TEENAGER_COUNT", 0);
        bundle.putInt("CHILD_COUNT", z4.N.intValue(custTripInfo.getChilCnt(), 0));
        bundle.putInt("CHILD_ACCOMPANY_COUNT", z4.N.intValue(custTripInfo.getBabyAcpnPrnb(), 0));
        bundle.putInt("SENIOR_COUNT", z4.N.intValue(custTripInfo.getEdrPrnb(), 0));
        bundle.putInt("HIGH_DISABLE_COUNT", z4.N.intValue(custTripInfo.getAdltHdcpPrnb(), 0));
        bundle.putInt("LOW_DISABLE_COUNT", z4.N.intValue(custTripInfo.getChldHdcpPrnb(), 0));
        for (int i10 = 0; i10 < this.f27774u.getCount(); i10++) {
            ((InterfaceC0688f) this.f27774u.getItem(i10)).setPassengerData(bundle);
        }
        this.f27778y.setEnabled(true);
    }

    private void G0() {
        String string = H.getString(getApplicationContext(), "IS_MULTI_LANGUAGE_TYPE");
        if (!string.isEmpty()) {
            if (Locale.KOREAN.getLanguage().equals(string)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("IS_DIRECT_SHOW_MULTI_LANGUAGE", true);
            C6641o.navigation(getApplicationContext(), MultiLanguageActivity.class, bundle);
            return;
        }
        if (Locale.KOREAN.getLanguage().equals(z4.r.getSystemLanguageType())) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("IS_DIRECT_SHOW_MULTI_LANGUAGE", true);
        C6641o.navigation(getApplicationContext(), MultiLanguageActivity.class, bundle2);
    }

    private void H0() {
        if (E.grantedLocationPermissions(K())) {
            g1();
        } else {
            AbstractC0918b.requestPermissions(K(), E.requestPermissions(), E.REQUEST_PERMISSION);
        }
    }

    private void I0() {
        H.putBoolean(getApplicationContext(), "CONVENIENCE_SETTING_UPDATE", false);
        this.f27770q.clear();
        this.f27771r = -1;
        ConvenienceSettingDao convenienceSettingDao = new ConvenienceSettingDao();
        ConvenienceSettingDao.ConvenienceSettingRequest convenienceSettingRequest = convenienceSettingDao.new ConvenienceSettingRequest();
        convenienceSettingRequest.setCustMgNo(h.getInstance().getCustNo());
        convenienceSettingRequest.setMedDvCd("03");
        convenienceSettingRequest.setReqSqno("0");
        convenienceSettingDao.setRequest(convenienceSettingRequest);
        executeDao(convenienceSettingDao);
    }

    private void J0(ConvenienceSettingDao.CustTripInfo custTripInfo) {
        CalendarData selectedDate = K0().getDepartureDateOption().getSelectedDate();
        String str = C6631e.isPeakSeason(selectedDate) ? r4.g.NETFUNNEL_ACTION_ID_PEAKSEASON : r4.g.NETFUNNEL_ACTION_ID;
        t.e("[Netfunnel 간편구매] date : " + selectedDate.getDate() + ", netfunnelId : " + str + ", isPeakSeason : " + r4.g.NETFUNNEL_ACTION_ID_PEAKSEASON.equals(str));
        if (C6630d.isNull(this.f27761E) || !this.f27761E.isShowing()) {
            e eVar = new e(this);
            this.f27761E = eVar;
            eVar.showDialog();
            u4.c cVar = new u4.c(this);
            this.f27760D = cVar;
            cVar.show();
        }
        g.BEGIN(r4.g.NETFUNNEL_SERVER_ID, str, this.f27761E, new c(custTripInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0688f K0() {
        return (InterfaceC0688f) this.f27774u.getItem(this.f27773t.getCurrentItem());
    }

    private TrainInquiryRequest[] L0(String str, CalendarData calendarData, String str2) {
        String str3;
        String str4;
        InterfaceC0688f interfaceC0688fK0 = K0();
        V4.b routeOption = interfaceC0688fK0.getRouteOption();
        com.korail.talk.ui.booking.option.date.a departureDateOption = interfaceC0688fK0.getDepartureDateOption();
        com.korail.talk.ui.booking.option.date.a inComingDateOption = interfaceC0688fK0.getInComingDateOption();
        T4.d passengerAgeSeatCountOption = interfaceC0688fK0.getPassengerAgeSeatCountOption();
        W4.c bookingToggleOption = interfaceC0688fK0.getBookingToggleOption();
        int i8 = C6630d.isNotNull(inComingDateOption) ? 2 : 1;
        TrainInquiryRequest[] trainInquiryRequestArr = new TrainInquiryRequest[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            trainInquiryRequestArr[i9] = new TrainInquiryRequest();
        }
        B4.b.getRsvInquiryRequest(getApplicationContext(), trainInquiryRequestArr, routeOption, departureDateOption, inComingDateOption, passengerAgeSeatCountOption, str, calendarData, "11", str2);
        if (C6630d.isNotNull(bookingToggleOption)) {
            ArrayList<Integer> checkedIndexList = bookingToggleOption.getCheckedIndexList();
            str4 = checkedIndexList.get(0).intValue() == 0 ? "Y" : "N";
            str3 = checkedIndexList.get(1).intValue() == 0 ? "Y" : "N";
        } else {
            str3 = "N";
            str4 = str3;
        }
        for (int i10 = 0; i10 < i8; i10++) {
            trainInquiryRequestArr[i10].setAdjStnScdlOfrFlg(str4);
            trainInquiryRequestArr[i10].setEbizCrossCheck(str3);
            trainInquiryRequestArr[i10].setSrtCheckYn(str3);
            trainInquiryRequestArr[i10].setRtYn(C6630d.isNotNull(inComingDateOption) ? "Y" : "N");
            trainInquiryRequestArr[i10].setMbCrdNo(h.getInstance().getMemberNum());
            ReceiveSRTData receiveSRTData = (ReceiveSRTData) getIntent().getSerializableExtra("data_from_SRT");
            if (C6630d.isNotNull(receiveSRTData)) {
                trainInquiryRequestArr[i10].setTxtGoTrnNo(receiveSRTData.getTrainNo());
            }
        }
        return trainInquiryRequestArr;
    }

    private ReservationRequest M0() {
        return D4.a.getOReservationRequest(K0().getPassengerAgeSeatCountOption());
    }

    private void N0() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("IS_DIRECT", true);
        O0(bundle);
    }

    private void O0(Bundle bundle) {
        j1();
        d1(bundle);
    }

    private boolean P0(ConvenienceSettingDao.CustTripInfo custTripInfo) {
        return S0(custTripInfo) && Q0(custTripInfo) && R0(custTripInfo);
    }

    private boolean Q0(ConvenienceSettingDao.CustTripInfo custTripInfo) {
        com.korail.talk.ui.booking.option.date.a departureDateOption = K0().getDepartureDateOption();
        String nearestDate = C6634h.getNearestDate(custTripInfo.getDayCd());
        StringBuilder sb = new StringBuilder(custTripInfo.getJobStHr());
        sb.append("00");
        return (C6634h.isToday(nearestDate) && C6634h.isAfter(C6634h.getToday("HHmm"), sb.toString())) || (nearestDate.equals(departureDateOption.getSelectedDay()) && sb.toString().equals(C6634h.convertFormat(departureDateOption.getSelectedHour(), "HHmmss", "HHmm")));
    }

    private boolean R0(ConvenienceSettingDao.CustTripInfo custTripInfo) {
        Bundle bundle = new Bundle();
        bundle.putInt("ADULT_COUNT", z4.N.intValue(custTripInfo.getAdulCnt(), 1));
        bundle.putInt("GUIDE_DOG_COUNT", 0);
        bundle.putInt("TEENAGER_COUNT", 0);
        bundle.putInt("CHILD_COUNT", z4.N.intValue(custTripInfo.getChilCnt(), 0));
        bundle.putInt("CHILD_ACCOMPANY_COUNT", z4.N.intValue(custTripInfo.getBabyAcpnPrnb(), 0));
        bundle.putInt("SENIOR_COUNT", z4.N.intValue(custTripInfo.getEdrPrnb(), 0));
        bundle.putInt("HIGH_DISABLE_COUNT", z4.N.intValue(custTripInfo.getAdltHdcpPrnb(), 0));
        bundle.putInt("LOW_DISABLE_COUNT", z4.N.intValue(custTripInfo.getChldHdcpPrnb(), 0));
        T4.d dVar = new T4.d(this, bundle);
        return C6630d.equalsBundles(dVar.getPassengerInfo(), K0().getPassengerAgeSeatCountOption().getPassengerInfo());
    }

    private boolean S0(ConvenienceSettingDao.CustTripInfo custTripInfo) {
        V4.b routeOption = K0().getRouteOption();
        return custTripInfo.getDptStnNm().equals(routeOption.getStartStationNm()) && custTripInfo.getArvStnNm().equals(routeOption.getArrivalStationNm());
    }

    private boolean T0() {
        return h.getInstance().isLogin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U0() {
        this.f27768o = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V0(DialogInterface dialogInterface, int i8) {
        startActivity(new Intent(getApplicationContext(), (Class<?>) ReservedTicketActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W0(Intent intent) {
        C6637k.showLoginDialog(K(), (ArrayList) M(intent, "POPUP_DATA"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X0(ConvenienceSettingDao.CustTripInfo custTripInfo, DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            J0(custTripInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y0(DialogInterface dialogInterface, int i8, boolean z8, int i9) {
        if (100 == i8) {
            b1();
        } else {
            if (102 != i8 || i9 <= -1) {
                return;
            }
            F0(i9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z0(int i8, StationData stationData, String str, String str2, boolean z8, DialogInterface dialogInterface, int i9, boolean z9) {
        if (z9) {
            if (2 == i8) {
                stationData.setDoNotLookADay(C6634h.getToday("yyyyMMdd"));
            } else if (3 == i8) {
                stationData.setDoNotLookAgain(true);
            }
            C6111b.getInstance().updateStationData(stationData);
        }
        String popupLinkUrl = stationData.getPopupLinkUrl();
        if (C6630d.isNotNull(popupLinkUrl) && 102 == i9) {
            C6630d.moveToOutSideBrowser(getApplicationContext(), popupLinkUrl);
        } else {
            f1(str, str2, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a1(DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            C6641o.navigation(getApplicationContext(), RenewalLimousineActivity.class);
        }
    }

    private void b1() {
        Bundle bundle = new Bundle();
        bundle.putString("WEB_POST_URL", r4.g.CONVENIENCE_SETTING_URL);
        bundle.putBoolean("IS_CLOSE_VIEW", true);
        C6641o.navigation(getApplicationContext(), IntegrationWebViewActivity.class, bundle);
    }

    private void c1(ReservationResponse reservationResponse) {
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
        intent.putExtra("PAYMENT_TYPE", i.PAYMENT_DEFAULT);
        intent.putExtra("PAYMENT_REQUEST", rsvPaymentRequest);
        intent.putExtra("COMMON_RESERVATION_RESPONSE", reservationResponse);
        intent.putExtra("IS_POINT_STEP", !A4.a.isDiscountReservation(reservationResponse));
        startActivity(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.korail.talk.network.request.inquiry.TrainInquiryRequest[], java.io.Serializable] */
    private void d1(Bundle bundle) {
        String code = (bundle.getBoolean("IS_DIRECT", false) ? r4.d.DIRECT_SQ_NO : r4.d.TRANSFER_SQ_NO).getCode();
        CalendarData calendarInfo = bundle.containsKey("ROUTE_DATE") ? C6634h.getCalendarInfo(C6634h.getCalendarFromString(bundle.getString("ROUTE_DATE"), "yyyyMMddHHmmss")) : null;
        int i8 = bundle.getInt("SEAT_OPTION_INDEX", 0);
        String string = bundle.getString("SEAT_OPTION_CODE", p.DEFAULT.getCode());
        t.e("jobId : " + code + ", seatOptionIndex : " + i8 + ", seatOptionCode : " + string);
        Context applicationContext = getApplicationContext();
        r4.d dVar = r4.d.DIRECT_SQ_NO;
        Intent intent = new Intent(applicationContext, (Class<?>) (dVar.getCode().equals(code) ? DirectInquiryActivity.class : TransferInquiryActivity.class));
        intent.putExtra("IS_DIRECT", dVar.getCode().equals(code));
        intent.putExtra("IS_TRANSFER", true);
        intent.putExtra("SEAT_OPTION_INDEX", i8);
        intent.putExtra("SEAT_OPTION_CODE", string);
        intent.putExtra("RESERVATION_TYPE", this.f27773t.getCurrentItem() == 0 ? r4.c.RSV_DEFAULT : r4.c.RSV_GOING);
        intent.putExtra("MENU_TYPE", EnumC6175b.DEFAULT);
        intent.putExtra("INQUIRY_REQUEST", (Serializable) L0(code, calendarInfo, string));
        intent.putExtra("RESERVATION_REQUEST", M0());
        startActivityForResult(intent, 117);
    }

    private void e1(Intent intent) {
        if (y.isNavigation(intent)) {
            intent.removeExtra("TYPE");
            if (!intent.hasExtra("CLASS")) {
                navigationMenuRefresh();
                return;
            }
            Class<?> cls = (Class) M(intent, "CLASS");
            intent.removeExtra("CLASS");
            if (MainBookingActivity.class.equals(cls)) {
                return;
            }
            Intent intent2 = new Intent();
            intent2.setClass(getApplicationContext(), cls);
            intent2.addFlags(65536);
            if (C6630d.isNotNull(intent.getExtras())) {
                intent2.putExtras(intent.getExtras());
            }
            startActivity(intent2);
        }
    }

    private void f1(String str, String str2, boolean z8) {
        if (z8) {
            p1(str, str2, false);
        } else {
            N0();
        }
    }

    private void g1() {
        final Intent intent = getIntent();
        G0();
        if (intent.hasExtra("POPUP_DATA")) {
            new Handler().postDelayed(new Runnable() { // from class: P4.G
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3702a.W0(intent);
                }
            }, 300L);
        }
        new Handler().postDelayed(new Runnable() { // from class: P4.H
            @Override // java.lang.Runnable
            public final void run() {
                this.f3704a.showMainPopupDialog();
            }
        }, 500L);
        e1(intent);
    }

    private void h1(List list) throws Resources.NotFoundException {
        this.f27770q = list;
        boolean z8 = !T0() || list.isEmpty();
        this.f27779z.setText(z8 ? AbstractC5959j.common_simple_register : AbstractC5959j.common_simple_buy);
        this.f27757A.setVisibility(z8 ? 8 : 0);
        this.f27759C.setVisibility(z8 ? 8 : 0);
        int intExtra = getIntent().getIntExtra("FAVORITE_SELECT_INDEX", -1);
        if (!T0() || intExtra <= -1) {
            return;
        }
        F0(intExtra);
        onClick(this.f27779z);
    }

    private void i1() {
        KTApplication.isAppRunning = true;
        this.f27769p = getResources().getStringArray(AbstractC5952c.main_booking);
        this.f27771r = -1;
        this.f27770q = new ArrayList();
    }

    private void j1() {
        V4.b routeOption = K0().getRouteOption();
        String startStationNm = routeOption.getStartStationNm();
        String arrivalStationNm = routeOption.getArrivalStationNm();
        List<ZRecentStation> recentStationList = C6111b.getInstance().getRecentStationList();
        for (int i8 = 0; i8 < recentStationList.size(); i8++) {
            ZRecentStation zRecentStation = recentStationList.get(i8);
            if (startStationNm.equals(zRecentStation.getStartStation()) && arrivalStationNm.equals(zRecentStation.getArrivalStation())) {
                C6111b.getInstance().deleteRecentSection(zRecentStation);
            }
        }
        ZRecentStation zRecentStation2 = new ZRecentStation();
        zRecentStation2.setStartStation(startStationNm);
        zRecentStation2.setArrivalStation(arrivalStationNm);
        zRecentStation2.setTimestamp(new Date().getTime());
        C6111b.getInstance().insertRecentSection(zRecentStation2);
    }

    private void k1() {
        this.f27773t.addOnPageChangeListener(new a());
        this.f27776w.setOnClickListener(this);
        this.f27775v.setOnClickListener(this);
        this.f27778y.setOnClickListener(this);
        this.f27777x.setOnChangeStationListener(this);
        this.f27777x.setHideEventListener(this);
        this.f27779z.setOnClickListener(this);
        this.f27757A.setOnClickListener(this);
    }

    private void l1() throws Resources.NotFoundException {
        n0(true);
        ImageButton imageButton = (ImageButton) findViewById(AbstractC5955f.backBtn);
        this.f27776w = imageButton;
        imageButton.setImageResource(AbstractC5954e.ico_chat);
        this.f27776w.setContentDescription(getString(AbstractC5959j.drawer_menu_hearing_impaired));
        C6627a.addClickEvent(this.f27776w, getString(AbstractC5959j.open_new_window));
        this.f27775v = (ImageView) findViewById(AbstractC5955f.iv_main_booking);
        this.f27778y = (Button) findViewById(AbstractC5955f.btn_main_booking_inquiry);
        this.f27777x = (StationSearch) findViewById(AbstractC5955f.ss_main_booking);
        this.f27772s = (CTabLayout) findViewById(AbstractC5955f.tl_main_booking);
        this.f27773t = (CustomViewPager) findViewById(AbstractC5955f.vp_main_booking);
        d dVar = new d(this, getSupportFragmentManager(), null);
        this.f27774u = dVar;
        this.f27773t.setAdapter(dVar);
        this.f27773t.setSwipeEnabled(false);
        this.f27772s.setupWithViewPager(this.f27773t);
        boolean z8 = H.getBoolean(getApplicationContext(), "CONVENIENCE_SETTING_VISIBLE");
        this.f27779z = (Button) findViewById(AbstractC5955f.btn_main_booking_payment);
        this.f27757A = (Button) findViewById(AbstractC5955f.btn_main_booking_convenience_setting_list);
        this.f27758B = findViewById(AbstractC5955f.v_main_booking_payment_layout);
        this.f27759C = findViewById(AbstractC5955f.v_main_booking_divider);
        this.f27758B.setVisibility(z8 ? 0 : 8);
    }

    private void m1(final ConvenienceSettingDao.CustTripInfo custTripInfo) {
        C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.dialog_change_convenience)).setButtonListener(new DialogInterface.OnClickListener() { // from class: P4.K
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f3707a.X0(custTripInfo, dialogInterface, i8);
            }
        }).showDialog();
    }

    private void n1() {
        if (this.f27770q.isEmpty()) {
            return;
        }
        String[] strArr = new String[this.f27770q.size()];
        for (int i8 = 0; i8 < this.f27770q.size(); i8++) {
            ConvenienceSettingDao.CustTripInfo custTripInfo = (ConvenienceSettingDao.CustTripInfo) this.f27770q.get(i8);
            strArr[i8] = custTripInfo.getPtwtTtl() + X.SPACE + custTripInfo.getDptStnNm() + " → " + custTripInfo.getArvStnNm();
        }
        C6637k.getRDialog(K(), 1003, 0, getString(AbstractC5959j.title_simple_list)).setRadioGroup(strArr, this.f27771r).setContent(getString(AbstractC5959j.simple_info_msg)).setButtonNames(z4.N.getStringArray(getString(AbstractC5959j.common_register), getString(AbstractC5959j.common_confirm), getString(AbstractC5959j.common_cancel))).setButtonListener(new C6219c.d() { // from class: P4.J
            @Override // s4.C6219c.d
            public final void onClick(DialogInterface dialogInterface, int i9, boolean z8, int i10) {
                this.f3706a.Y0(dialogInterface, i9, z8, i10);
            }
        }).showDialog();
    }

    private void o1(StationData stationData, C6219c.InterfaceC0421c interfaceC0421c) {
        int popupType = stationData.getPopupType();
        String popupMessage = stationData.getPopupMessage();
        String doNotLookADay = stationData.getDoNotLookADay();
        boolean doNotLookAgain = stationData.getDoNotLookAgain();
        if (1 == popupType) {
            if (C6630d.isNull(stationData.getPopupLinkTitle())) {
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(popupMessage).setButtonListener(interfaceC0421c).showDialog();
                return;
            } else {
                C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(popupMessage).setButtonListener(interfaceC0421c).setButtonNames(new String[]{getString(AbstractC5959j.common_confirm), stationData.getPopupLinkTitle()}).showDialog();
                return;
            }
        }
        if (2 == popupType && (z4.N.isNull(doNotLookADay) || C6634h.getToday("yyyyMMdd").compareTo(doNotLookADay) > 0)) {
            if (C6630d.isNull(stationData.getPopupLinkTitle())) {
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(popupMessage).setCheckBoxMessage(getString(AbstractC5959j.do_not_show_one_day)).setButtonListener(interfaceC0421c).showDialog();
                return;
            } else {
                C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(popupMessage).setCheckBoxMessage(getString(AbstractC5959j.do_not_show_one_day)).setButtonListener(interfaceC0421c).setButtonNames(new String[]{getString(AbstractC5959j.common_confirm), stationData.getPopupLinkTitle()}).showDialog();
                return;
            }
        }
        if (doNotLookAgain || 3 != popupType) {
            return;
        }
        if (C6630d.isNull(stationData.getPopupLinkTitle())) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(popupMessage).setCheckBoxMessage(getString(AbstractC5959j.do_not_show_again)).setButtonListener(interfaceC0421c).showDialog();
        } else {
            C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(popupMessage).setCheckBoxMessage(getString(AbstractC5959j.do_not_show_again)).setButtonListener(interfaceC0421c).setButtonNames(new String[]{getString(AbstractC5959j.common_confirm), stationData.getPopupLinkTitle()}).showDialog();
        }
    }

    private void p1(final String str, final String str2, final boolean z8) {
        final StationData stationDataByName = C6111b.getInstance().getStationDataByName(z8 ? str : str2);
        if (C6630d.isNull(stationDataByName)) {
            f1(str, str2, z8);
            return;
        }
        final int popupType = stationDataByName.getPopupType();
        String doNotLookADay = stationDataByName.getDoNotLookADay();
        boolean doNotLookAgain = stationDataByName.getDoNotLookAgain();
        if (popupType == 0) {
            f1(str, str2, z8);
            return;
        }
        if (2 == popupType && C6634h.getToday("yyyyMMdd").compareTo(doNotLookADay) <= 0) {
            f1(str, str2, z8);
        } else if (3 == popupType && doNotLookAgain) {
            f1(str, str2, z8);
        } else {
            o1(stationDataByName, new C6219c.InterfaceC0421c() { // from class: P4.D
                @Override // s4.C6219c.InterfaceC0421c
                public final void onClick(DialogInterface dialogInterface, int i8, boolean z9) {
                    this.f3694a.Z0(popupType, stationDataByName, str, str2, z8, dialogInterface, i8, z9);
                }
            });
        }
    }

    private void q1() {
        V4.b routeOption = K0().getRouteOption();
        String startStationNm = routeOption.getStartStationNm();
        String arrivalStationNm = routeOption.getArrivalStationNm();
        if (M.isLimousineTerminal(startStationNm) || M.isLimousineTerminal(arrivalStationNm)) {
            C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.common_limousine_station)).setButtonListener(new DialogInterface.OnClickListener() { // from class: P4.I
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f3705a.a1(dialogInterface, i8);
                }
            }).showDialog();
        } else {
            r1();
        }
    }

    private void r1() {
        V4.b routeOption = K0().getRouteOption();
        if (M.isStationSame(routeOption)) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.common_start_arrival_equal)).showDialog();
        } else {
            p1(routeOption.getStartStationNm(), routeOption.getArrivalStationNm(), true);
        }
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_normal_booking);
    }

    @Override // P4.InterfaceC0686d
    public void hideStationSearch() throws Resources.NotFoundException {
        if (this.f27777x.getVisibility() == 0) {
            K0().unSelectStation();
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(getApplicationContext(), AbstractC5951b.bottom_view_slide_down);
            animationLoadAnimation.setAnimationListener(new b());
            this.f27777x.startAnimation(animationLoadAnimation);
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(findViewById(AbstractC5955f.v_main_booking_content), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, 0.0f));
            objectAnimatorOfPropertyValuesHolder.setDuration(300L);
            objectAnimatorOfPropertyValuesHolder.start();
            O(this.f27777x);
        }
    }

    @Override // P4.InterfaceC0686d
    public void moveToTrainInquiryBySRT() {
        if (C6630d.isNotNull((ReceiveSRTData) M(getIntent(), "data_from_SRT"))) {
            N0();
            setIntent(new Intent());
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (-1 == i9) {
            if (113 == i8) {
                setStationNm(intent.getStringExtra("DEPARTURE_STATION_NM"), intent.getStringExtra("ARRIVAL_STATION_NM"));
            } else if (117 == i8) {
                O0(intent.getExtras());
            }
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, com.korail.talk.view.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() throws Resources.NotFoundException {
        if (C6630d.isNotNull(this.f27777x) && this.f27777x.getVisibility() == 0) {
            hideStationSearch();
            return;
        }
        if (isOpenDrawer()) {
            closeDrawer();
        } else {
            if (this.f27768o) {
                finish();
                return;
            }
            this.f27768o = true;
            Toast.makeText(getApplicationContext(), getString(AbstractC5959j.msg_toast_quit), 0).show();
            new Handler().postDelayed(new Runnable() { // from class: P4.F
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3701a.U0();
                }
            }, 2000L);
        }
    }

    @Override // com.korail.talk.ui.booking.option.station.StationSearch.e
    public void onChangeStation(StationNameData stationNameData) throws Resources.NotFoundException {
        setStationNm(stationNameData.getDepartureStationName(), stationNameData.getArrivalStationName());
        hideStationSearch();
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) throws Resources.NotFoundException {
        O(view);
        int id = view.getId();
        if (AbstractC5955f.iv_main_booking == id) {
            C6630d.moveToOutSideBrowser(getApplicationContext(), getString(AbstractC5959j.hearing_impaired_url, h.getInstance().getEncryptHMbCrdNo()));
            return;
        }
        if (AbstractC5955f.v_station_search == id) {
            hideStationSearch();
            return;
        }
        if (AbstractC5955f.btn_main_booking_inquiry == id) {
            if (C6054a.IS_LIMOUSINE_TEST) {
                q1();
                return;
            } else {
                r1();
                return;
            }
        }
        if (AbstractC5955f.btn_main_booking_payment != id) {
            if (AbstractC5955f.btn_main_booking_convenience_setting_list != id) {
                if (AbstractC5955f.backBtn == id) {
                    C6630d.moveToOutSideBrowser(getApplicationContext(), getString(AbstractC5959j.hearing_impaired_url, h.getInstance().getEncryptHMbCrdNo()));
                    return;
                } else {
                    super.onClick(view);
                    return;
                }
            }
            if (!T0()) {
                C6641o.moveToLogin(K());
                return;
            } else if (this.f27770q.isEmpty()) {
                b1();
                return;
            } else {
                n1();
                return;
            }
        }
        if (!T0()) {
            C6641o.moveToLogin(K());
            return;
        }
        if (this.f27770q.isEmpty()) {
            b1();
            return;
        }
        if (this.f27771r < 0) {
            n1();
            return;
        }
        V4.b routeOption = K0().getRouteOption();
        if (C6630d.isNull(C6111b.getInstance().getStationDataByName(routeOption.getStartStationNm())) || C6630d.isNull(C6111b.getInstance().getStationDataByName(routeOption.getArrivalStationNm()))) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.station_data_empty)).showDialog();
            return;
        }
        ConvenienceSettingDao.CustTripInfo custTripInfo = (ConvenienceSettingDao.CustTripInfo) this.f27770q.get(this.f27771r);
        if (P0(custTripInfo)) {
            J0(custTripInfo);
        } else {
            m1(custTripInfo);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_main_booking);
        this.f27767n = C6630d.isNotNull(bundle);
        if (C6630d.isNull(bundle)) {
            i1();
            l1();
            setText();
            k1();
            H0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.appcompat.app.e, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onDestroy() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        KTApplication.isAppRunning = this.f27767n;
        I4.g.getInstance().unBindService(getApplicationContext());
        super.onDestroy();
    }

    @Override // com.korail.talk.view.base.BaseActivity
    public void onLoginFail(boolean z8) {
        super.onLoginFail(false);
    }

    @Override // androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        if (C6630d.isNotNull(this.f27774u)) {
            for (int i8 = 0; i8 < this.f27774u.getCount(); i8++) {
                InterfaceC0688f interfaceC0688f = (InterfaceC0688f) this.f27774u.getItem(i8);
                interfaceC0688f.setExternalAppStationNm(intent.getExtras());
                interfaceC0688f.setExternalAppDate(intent.getExtras());
            }
        }
        e1(intent);
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) throws Resources.NotFoundException {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_convenience_setting == id) {
            h1(((ConvenienceSettingDao.ConvenienceSettingResponse) iBaseDao.getResponse()).getMainList());
        } else if (AbstractC5955f.dao_reservation == id) {
            c1((ReservationResponse) iBaseDao.getResponse());
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        super.onReceiveError(iBaseDao, c6536a);
        if (AbstractC5955f.dao_reservation == iBaseDao.getId()) {
            ReservationResponse reservationResponse = (ReservationResponse) iBaseDao.getResponse();
            if ("WRR800029".equals(reservationResponse.gethMsgCd()) || "ERR911531".equals(reservationResponse.gethMsgCd()) || "ERR911051".equals(reservationResponse.gethMsgCd())) {
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(c6536a.getMessage()).setButtonListener(new DialogInterface.OnClickListener() { // from class: P4.E
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        this.f3700a.V0(dialogInterface, i8);
                    }
                }).showDialog();
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) throws Resources.NotFoundException {
        super.onRequestPermissionsResult(i8, strArr, iArr);
        if (i8 == E.REQUEST_PERMISSION) {
            if (C6630d.isNotNull(this.f27777x) && E.grantedLocationPermissions(K())) {
                this.f27777x.setLocationManager();
                this.f27777x.refreshList();
            }
            g1();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onResume() throws Resources.NotFoundException {
        int i8 = 8;
        this.f27776w.setVisibility(T0() ? 0 : 8);
        if (C6630d.isNotNull(this.f27777x)) {
            this.f27777x.refreshList();
        }
        if (C6630d.isNotNull(this.f27775v)) {
            CommonCodeDao.ViewVisibility viewVisibility = (CommonCodeDao.ViewVisibility) q.fromJson(H.getString(getApplicationContext(), "VIEW_VISIBILITY"), CommonCodeDao.ViewVisibility.class);
            ImageView imageView = this.f27775v;
            if (viewVisibility.getHearingImpaired().equals("Y") && h.getInstance().isHearingImpaired()) {
                i8 = 0;
            }
            imageView.setVisibility(i8);
        }
        if (T0() && H.getBoolean(getApplicationContext(), "CONVENIENCE_SETTING_VISIBLE") && H.getBoolean(getApplicationContext(), "CONVENIENCE_SETTING_UPDATE")) {
            I0();
        } else if (!T0() && H.getBoolean(getApplicationContext(), "CONVENIENCE_SETTING_VISIBLE")) {
            h1(new ArrayList());
        }
        super.onResume();
    }

    @Override // P4.InterfaceC0686d
    public void setDate(CalendarData calendarData) {
        for (int i8 = 0; i8 < this.f27774u.getCount(); i8++) {
            if (i8 != this.f27773t.getCurrentItem()) {
                ((InterfaceC0688f) this.f27774u.getItem(i8)).setDate(calendarData);
            }
        }
    }

    @Override // P4.InterfaceC0686d
    public void setPassengerData(Bundle bundle) {
        this.f27778y.setEnabled(bundle.getInt("TOTAL_PERSON_COUNT") > 0);
        for (int i8 = 0; i8 < this.f27774u.getCount(); i8++) {
            if (i8 != this.f27773t.getCurrentItem()) {
                ((InterfaceC0688f) this.f27774u.getItem(i8)).setPassengerData(bundle);
            }
        }
    }

    @Override // P4.InterfaceC0686d
    public void setStationNm(String str, String str2) {
        for (int i8 = 0; i8 < this.f27774u.getCount(); i8++) {
            ((InterfaceC0688f) this.f27774u.getItem(i8)).setStationNm(str, str2);
        }
    }

    public void showMainPopupDialog() {
        MainPopupData mainPopupData = C6111b.getInstance().getMainPopupData();
        if (C6630d.isNotNull(mainPopupData) && !C6634h.isBefore(C6634h.getToday("yyyyMMdd"), mainPopupData.getConfirmDate())) {
            s4.t tVar = new s4.t(this, AbstractC5960k.FullScreenDialog);
            tVar.setMainPopupData(mainPopupData);
            tVar.showDialog();
        }
        if (C6630d.isNotNull(H.getString(getApplicationContext(), "NOUGAT_DATA"))) {
            C6634h.getToday("yyyyMMdd").equals(H.getString(getApplicationContext(), "IS_DEVICE_POPUP_TODAY"));
        }
    }

    @Override // P4.InterfaceC0686d
    public void showStationSearch(StationSearch.c cVar) {
        this.f27777x.initSearchEdit();
        this.f27777x.setStartArrivalType(cVar);
        if (this.f27777x.getVisibility() == 8) {
            this.f27777x.setVisibility(0);
            this.f27777x.performAccessibilityAction(64, null);
            this.f27777x.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), AbstractC5951b.bottom_view_slide_up));
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(findViewById(AbstractC5955f.v_main_booking_content), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, -this.f27772s.getHeight()));
            objectAnimatorOfPropertyValuesHolder.setDuration(300L);
            objectAnimatorOfPropertyValuesHolder.start();
        }
    }
}
