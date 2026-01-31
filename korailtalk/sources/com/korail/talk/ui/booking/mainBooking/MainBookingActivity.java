package com.korail.talk.ui.booking.mainBooking;

import A6.g;
import I4.h;
import P4.C0693k;
import P4.InterfaceC0687e;
import Q7.X;
import V4.b;
import ai.maum.m2u.cdk.utils.G711;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.core.app.AbstractC0918b;
import com.korail.talk.application.KTApplication;
import com.korail.talk.data.CalendarData;
import com.korail.talk.data.ReceiveSRTData;
import com.korail.talk.data.StationNameData;
import com.korail.talk.data.vo.AvailableDates;
import com.korail.talk.database.model.MainPopupData;
import com.korail.talk.database.model.StationData;
import com.korail.talk.database.model.ZRecentStation;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.certification.ReservationDao;
import com.korail.talk.network.dao.common.CommonCodeDao;
import com.korail.talk.network.dao.common.MaasMenuListDao;
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
import com.korail.talk.ui.menu.DiscountCouponActivity;
import com.korail.talk.ui.menu.ReservedTicketActivity;
import com.korail.talk.ui.payment.PaymentActivity;
import com.korail.talk.ui.setting.MultiLanguageActivity;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import com.korail.talk.ui.web.MaumAIV2WebViewActivity;
import com.korail.talk.view.CCheckBox;
import com.korail.talk.view.CTextView;
import com.korail.talk.view.base.BaseActivity;
import com.korail.talk.view.base.BaseViewActivity;
import com.squareup.picasso.s;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import n4.AbstractC5951b;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import n4.AbstractC5960k;
import q4.C6111b;
import r4.EnumC6175b;
import r4.i;
import r4.p;
import s4.C6219c;
import v4.g;
import y4.C6536a;
import y6.C6550j;
import z4.C6626B;
import z4.C6630d;
import z4.C6631e;
import z4.C6634h;
import z4.C6637k;
import z4.C6641o;
import z4.E;
import z4.H;
import z4.M;
import z4.N;
import z4.q;
import z4.r;
import z4.t;
import z4.y;

/* loaded from: classes.dex */
public class MainBookingActivity extends BaseViewActivity implements StationSearch.e, g, CompoundButton.OnCheckedChangeListener, InterfaceC0687e {

    /* renamed from: A */
    private Bundle f27696A;

    /* renamed from: B */
    private I4.c f27697B;

    /* renamed from: C */
    private Calendar f27698C;

    /* renamed from: D */
    private Calendar f27699D;

    /* renamed from: E */
    private String f27700E;

    /* renamed from: F */
    private MaasMenuListDao.Menu f27701F;

    /* renamed from: G */
    private ViewGroup f27702G;

    /* renamed from: H */
    private RelativeLayout f27703H;

    /* renamed from: I */
    private RelativeLayout f27704I;

    /* renamed from: J */
    private CTextView f27705J;

    /* renamed from: K */
    private CTextView f27706K;

    /* renamed from: L */
    private RelativeLayout f27707L;

    /* renamed from: M */
    private CTextView f27708M;

    /* renamed from: N */
    private ImageButton f27709N;

    /* renamed from: O */
    private ImageButton f27710O;

    /* renamed from: P */
    private CCheckBox f27711P;

    /* renamed from: Q */
    private ImageView f27712Q;

    /* renamed from: R */
    private CCheckBox f27713R;

    /* renamed from: S */
    private CCheckBox f27714S;

    /* renamed from: T */
    private CCheckBox f27715T;

    /* renamed from: U */
    private StationSearch f27716U;

    /* renamed from: V */
    private LinearLayout f27717V;

    /* renamed from: W */
    private Button f27718W;

    /* renamed from: X */
    private Button f27719X;

    /* renamed from: Y */
    private Button f27720Y;

    /* renamed from: Z */
    private View f27721Z;

    /* renamed from: a0 */
    private View f27722a0;

    /* renamed from: b0 */
    private u4.c f27723b0;

    /* renamed from: c0 */
    private u4.e f27724c0;

    /* renamed from: d0 */
    protected View[] f27725d0;

    /* renamed from: e0 */
    private GridView f27726e0;

    /* renamed from: f0 */
    private C0693k f27727f0;

    /* renamed from: n */
    private boolean f27736n;

    /* renamed from: o */
    private boolean f27737o;

    /* renamed from: p */
    private boolean f27738p;

    /* renamed from: q */
    private List f27739q;

    /* renamed from: r */
    private int f27740r;

    /* renamed from: s */
    private SimpleDateFormat f27741s;

    /* renamed from: t */
    private AvailableDates f27742t;

    /* renamed from: u */
    private V4.b f27743u;

    /* renamed from: v */
    private com.korail.talk.ui.booking.option.date.a f27744v;

    /* renamed from: w */
    private com.korail.talk.ui.booking.option.date.a f27745w;

    /* renamed from: x */
    private Calendar f27746x;

    /* renamed from: y */
    private Calendar f27747y;

    /* renamed from: z */
    private T4.d f27748z;

    /* renamed from: i */
    private final int f27730i = 0;

    /* renamed from: j */
    private final int f27732j = 1;

    /* renamed from: k */
    private final int f27733k = 2;

    /* renamed from: l */
    private final int f27734l = 3;

    /* renamed from: m */
    private final int f27735m = -1;

    /* renamed from: g0 */
    private View f27728g0 = null;

    /* renamed from: h0 */
    private View f27729h0 = null;

    /* renamed from: i0 */
    private boolean f27731i0 = false;

    class a implements s.d {
        a() {
        }

        @Override // com.squareup.picasso.s.d
        public void onImageLoadFailed(s sVar, Uri uri, Exception exc) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            t.e("Picasso", "Failed to load image: " + uri, exc);
            MainBookingActivity.this.findViewById(AbstractC5955f.fr_holiday_popup_view).setVisibility(8);
        }
    }

    class b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonCodeDao.HolidayPopup f27750a;

        b(CommonCodeDao.HolidayPopup holidayPopup) {
            this.f27750a = holidayPopup;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f27750a.getPopupUrl().isEmpty()) {
                return;
            }
            C6630d.moveToOutSideBrowser(MainBookingActivity.this.getApplicationContext(), this.f27750a.getPopupUrl());
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainBookingActivity.this.v1();
        }
    }

    class d implements BaseActivity.d {
        d() {
        }

        @Override // com.korail.talk.view.base.BaseActivity.d
        public void onPhysicalDisabilityLoginSuccess() {
            if (MainBookingActivity.this.f27731i0) {
                MainBookingActivity.this.physicalDisabilityViewSetting(true);
                MainBookingActivity.this.u1();
            }
        }
    }

    class e extends Handler {

        /* renamed from: a */
        final /* synthetic */ ConvenienceSettingDao.CustTripInfo f27754a;

        e(ConvenienceSettingDao.CustTripInfo custTripInfo) {
            this.f27754a = custTripInfo;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            g.d dVar = g.d.toEnum(message.what);
            MainBookingActivity.this.f27723b0.dismiss();
            if (dVar.isContinue()) {
                return;
            }
            MainBookingActivity.this.f27724c0.dismissDialog();
            ReservationRequest oReservationRequest = D4.a.getOReservationRequest(MainBookingActivity.this.f27743u, MainBookingActivity.this.f27744v, MainBookingActivity.this.f27748z, this.f27754a);
            ArrayList arrayList = new ArrayList();
            arrayList.add("WRR800029");
            arrayList.add("ERR911531");
            arrayList.add("ERR911051");
            ReservationDao reservationDao = new ReservationDao();
            reservationDao.setRequest(oReservationRequest);
            reservationDao.setErrorMsgCdNotShowDialog(arrayList);
            MainBookingActivity.this.executeDao(reservationDao);
            A6.g.END();
        }
    }

    class f implements Animation.AnimationListener {
        f() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MainBookingActivity.this.f27716U.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    private void A1() {
        com.korail.talk.ui.booking.option.date.a aVar = new com.korail.talk.ui.booking.option.date.a(K());
        this.f27744v = aVar;
        aVar.setDate(C6631e.getNormalDateStrArray());
        this.f27742t = new AvailableDates(C6631e.getNormalDateStrArray());
        Calendar calendar = Calendar.getInstance();
        Calendar firstDate = this.f27742t.getFirstDate();
        if (C6634h.isEquals(firstDate, calendar, "yyyyMMdd")) {
            this.f27746x = calendar;
        } else {
            this.f27746x = firstDate;
        }
        this.f27705J.setText(this.f27741s.format(this.f27746x.getTime()));
    }

    private void B1() {
        this.f27709N.setOnClickListener(this);
        this.f27711P.setOnCheckedChangeListener(this);
        this.f27712Q.setOnClickListener(this);
        this.f27717V.setOnClickListener(this);
        this.f27713R.setOnCheckedChangeListener(this);
        this.f27714S.setOnCheckedChangeListener(this);
        this.f27715T.setOnCheckedChangeListener(this);
        findViewById(AbstractC5955f.tv_extra_option_close).setOnClickListener(this);
        this.f27718W.setOnClickListener(this);
        this.f27716U.setOnChangeStationListener(this);
        this.f27716U.setHideEventListener(this);
        this.f27719X.setOnClickListener(this);
        this.f27720Y.setOnClickListener(this);
        for (int i8 = 0; i8 < this.f27702G.getChildCount(); i8++) {
            View childAt = this.f27702G.getChildAt(i8);
            if (childAt instanceof C6550j) {
                ((C6550j) childAt).setHeaderClickListener(this);
            }
        }
        this.f27702G.setOnClickListener(this);
        this.f27716U.setOnChangeStationListener(this);
        this.f27716U.setHideEventListener(this);
        this.f27703H.setOnClickListener(this);
        this.f27704I.setOnClickListener(this);
        this.f27707L.setOnClickListener(this);
        this.f27726e0.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: P4.t
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i9, long j8) {
                this.f3737a.k1(adapterView, view, i9, j8);
            }
        });
    }

    private void C1() {
        com.korail.talk.ui.booking.option.date.a aVar = new com.korail.talk.ui.booking.option.date.a(K());
        this.f27745w = aVar;
        aVar.setDate(C6631e.getNormalDateStrArray());
        this.f27742t = new AvailableDates(C6631e.getNormalDateStrArray());
        Calendar calendar = Calendar.getInstance();
        Calendar firstDate = this.f27742t.getFirstDate();
        if (C6634h.isEquals(firstDate, calendar, "yyyyMMdd")) {
            this.f27747y = calendar;
        } else {
            this.f27747y = firstDate;
        }
        if (this.f27747y.compareTo(this.f27746x) <= -1) {
            this.f27747y = this.f27746x;
        }
        this.f27706K.setText(this.f27741s.format(this.f27747y.getTime()));
    }

    private void E1() {
        V4.b bVar = new V4.b(K());
        this.f27743u = bVar;
        this.f27702G.addView(bVar);
        String[] stationNm = M.getStationNm();
        this.f27743u.setStationInfo(stationNm[0], stationNm[1], 0, 8);
        this.f27743u.setStationNm(stationNm[0], stationNm[1]);
        this.f27743u.setOnReverseStationsListener(new b.a() { // from class: P4.u
            @Override // V4.b.a
            public final void onReverseStation() {
                this.f3738a.l1();
            }
        });
    }

    private void F1() {
        n0(true);
        ImageButton imageButton = (ImageButton) findViewById(AbstractC5955f.backBtn);
        this.f27709N = imageButton;
        imageButton.setImageResource(AbstractC5954e.ico_chat);
        this.f27709N.setContentDescription(getString(this.f27731i0 ? AbstractC5959j.title_impaired_chatbot_info : AbstractC5959j.drawer_menu_hearing_impaired));
        this.f27711P = (CCheckBox) findViewById(AbstractC5955f.cb_round_trip);
        this.f27712Q = (ImageView) findViewById(AbstractC5955f.iv_srt);
        this.f27717V = (LinearLayout) findViewById(AbstractC5955f.ll_extra_option);
        this.f27713R = (CCheckBox) findViewById(AbstractC5955f.cb_extra_option_near_station);
        this.f27715T = (CCheckBox) findViewById(AbstractC5955f.cb_extra_option_srt_near);
        this.f27714S = (CCheckBox) findViewById(AbstractC5955f.cb_extra_option_srt);
        this.f27728g0 = findViewById(AbstractC5955f.floating_action_mainbooking);
        this.f27729h0 = findViewById(AbstractC5955f.view_action_bottom_blank);
        this.f27728g0.setOnClickListener(new c());
        setOnPhysicalDisabilityLoginListener(new d());
        ImageButton imageButton2 = (ImageButton) findViewById(AbstractC5955f.ranguageBtn);
        this.f27710O = imageButton2;
        imageButton2.setVisibility(0);
        this.f27710O.setOnClickListener(this);
        boolean z8 = H.getBoolean(getApplicationContext(), "TRAIN_NEAR_STATION", true);
        boolean z9 = H.getBoolean(getApplicationContext(), "TRAIN_SRT_STATION", true);
        boolean z10 = H.getBoolean(getApplicationContext(), "TRAIN_NEAR_SRT_STATION", true);
        this.f27713R.setChecked(z8);
        this.f27714S.setChecked(z9);
        this.f27715T.setChecked(z10);
        this.f27718W = (Button) findViewById(AbstractC5955f.btn_right);
        this.f27716U = (StationSearch) findViewById(AbstractC5955f.ss_main_booking);
        this.f27702G = (ViewGroup) findViewById(AbstractC5955f.rl_route);
        this.f27703H = (RelativeLayout) findViewById(AbstractC5955f.rl_going_date);
        this.f27704I = (RelativeLayout) findViewById(AbstractC5955f.rl_incoming_date);
        this.f27705J = (CTextView) findViewById(AbstractC5955f.tv_value_going_date);
        this.f27706K = (CTextView) findViewById(AbstractC5955f.tv_value_incoming_date);
        this.f27707L = (RelativeLayout) findViewById(AbstractC5955f.rl_passenger_info);
        this.f27708M = (CTextView) findViewById(AbstractC5955f.tv_value_passenger);
        boolean z11 = H.getBoolean(getApplicationContext(), "CONVENIENCE_SETTING_VISIBLE");
        this.f27719X = (Button) findViewById(AbstractC5955f.btn_main_booking_payment);
        this.f27720Y = (Button) findViewById(AbstractC5955f.btn_main_booking_convenience_setting_list);
        this.f27721Z = findViewById(AbstractC5955f.v_main_booking_payment_layout);
        this.f27722a0 = findViewById(AbstractC5955f.v_main_booking_divider);
        this.f27721Z.setVisibility(z11 ? 0 : 8);
        this.f27725d0 = new View[5];
        this.f27726e0 = (GridView) findViewById(AbstractC5955f.gridview_maas_menu);
        C0693k c0693k = new C0693k();
        this.f27727f0 = c0693k;
        this.f27726e0.setAdapter((ListAdapter) c0693k);
        E1();
        A1();
        C1();
        D1();
        String[] externalAppStationNm = M.getExternalAppStationNm(getIntent().getExtras());
        if (N.isNotNull(externalAppStationNm[0]) && N.isNotNull(externalAppStationNm[1])) {
            this.f27743u.setStationNm(externalAppStationNm[0], externalAppStationNm[1]);
        }
        CalendarData externalAppDate = C6634h.getExternalAppDate(getIntent().getExtras());
        if (C6630d.isNotNull(externalAppDate)) {
            this.f27744v.refreshDate(externalAppDate);
        }
    }

    private void G1(final ConvenienceSettingDao.CustTripInfo custTripInfo) {
        C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.dialog_change_convenience)).setButtonListener(new DialogInterface.OnClickListener() { // from class: P4.m
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f3724a.m1(custTripInfo, dialogInterface, i8);
            }
        }).showDialog();
    }

    private void H1() {
        if (this.f27739q.isEmpty()) {
            return;
        }
        String[] strArr = new String[this.f27739q.size()];
        for (int i8 = 0; i8 < this.f27739q.size(); i8++) {
            ConvenienceSettingDao.CustTripInfo custTripInfo = (ConvenienceSettingDao.CustTripInfo) this.f27739q.get(i8);
            strArr[i8] = custTripInfo.getPtwtTtl() + X.SPACE + custTripInfo.getDptStnNm() + " → " + custTripInfo.getArvStnNm();
        }
        C6637k.getRDialog(K(), 1003, 0, getString(AbstractC5959j.title_simple_list)).setRadioGroup(strArr, this.f27740r).setContent(getString(AbstractC5959j.simple_info_msg)).setButtonNames(N.getStringArray(getString(AbstractC5959j.title_setting), getString(AbstractC5959j.common_confirm), getString(AbstractC5959j.common_cancel))).setButtonListener(new C6219c.d() { // from class: P4.n
            @Override // s4.C6219c.d
            public final void onClick(DialogInterface dialogInterface, int i9, boolean z8, int i10) throws ParseException {
                this.f3726a.n1(dialogInterface, i9, z8, i10);
            }
        }).showDialog();
    }

    private void I1() {
        C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.main_date_change_notice)).showDialog();
    }

    private void J1(StationData stationData, C6219c.InterfaceC0421c interfaceC0421c) {
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
        if (2 == popupType && (N.isNull(doNotLookADay) || C6634h.getToday("yyyyMMdd").compareTo(doNotLookADay) > 0)) {
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

    private void K1(final String str, final String str2, final boolean z8) {
        final StationData stationDataByName = C6111b.getInstance().getStationDataByName(z8 ? str : str2);
        if (C6630d.isNull(stationDataByName)) {
            t1(str, str2, z8);
            return;
        }
        final int popupType = stationDataByName.getPopupType();
        String doNotLookADay = stationDataByName.getDoNotLookADay();
        boolean doNotLookAgain = stationDataByName.getDoNotLookAgain();
        if (popupType == 0) {
            t1(str, str2, z8);
            return;
        }
        if (2 == popupType && C6634h.getToday("yyyyMMdd").compareTo(doNotLookADay) <= 0) {
            t1(str, str2, z8);
        } else if (3 == popupType && doNotLookAgain) {
            t1(str, str2, z8);
        } else {
            J1(stationDataByName, new C6219c.InterfaceC0421c() { // from class: P4.o
                @Override // s4.C6219c.InterfaceC0421c
                public final void onClick(DialogInterface dialogInterface, int i8, boolean z9) {
                    this.f3727a.o1(popupType, stationDataByName, str, str2, z8, dialogInterface, i8, z9);
                }
            });
        }
    }

    private void L1() {
        K1(this.f27743u.getStartStationNm(), this.f27743u.getArrivalStationNm(), true);
    }

    private void M0(int i8) throws ParseException {
        ConvenienceSettingDao.CustTripInfo custTripInfo = (ConvenienceSettingDao.CustTripInfo) this.f27739q.get(i8);
        this.f27740r = i8;
        Calendar calendarFromString = C6634h.getCalendarFromString(C6634h.getNearestDate(custTripInfo.getDayCd()) + custTripInfo.getJobStHr() + "0000", "yyyyMMddHHmmss");
        com.korail.talk.ui.booking.option.date.a aVar = new com.korail.talk.ui.booking.option.date.a(K());
        this.f27744v = aVar;
        aVar.setDate(C6631e.getNormalDateStrArray());
        Calendar calendar = Calendar.getInstance();
        if (!C6634h.isEquals(calendarFromString, calendar, "yyyyMMdd") || calendarFromString.after(calendar)) {
            this.f27746x = calendarFromString;
        } else {
            this.f27746x = calendar;
        }
        this.f27705J.setText(this.f27741s.format(this.f27746x.getTime()));
        this.f27744v.refreshDate(C6634h.getCalendarInfo(this.f27746x));
        this.f27743u.setStationNm(custTripInfo.getDptStnNm(), custTripInfo.getArvStnNm());
        Bundle bundle = new Bundle();
        bundle.putInt("ADULT_COUNT", N.intValue(custTripInfo.getAdulCnt(), 1));
        bundle.putInt("TEENAGER_COUNT", 0);
        bundle.putInt("CHILD_COUNT", N.intValue(custTripInfo.getChilCnt(), 0));
        bundle.putInt("CHILD_ACCOMPANY_COUNT", N.intValue(custTripInfo.getBabyAcpnPrnb(), 0));
        bundle.putInt("SENIOR_COUNT", N.intValue(custTripInfo.getEdrPrnb(), 0));
        bundle.putInt("HIGH_DISABLE_COUNT", N.intValue(custTripInfo.getAdltHdcpPrnb(), 0));
        bundle.putInt("LOW_DISABLE_COUNT", N.intValue(custTripInfo.getChldHdcpPrnb(), 0));
        this.f27696A = bundle;
        this.f27748z.updatePassengerData(bundle);
        this.f27708M.setText(this.f27748z.getTotalPassengerText());
        this.f27718W.setEnabled(true);
    }

    private void N0() {
        CommonCodeDao.HolidayPopup holidayPopup = (CommonCodeDao.HolidayPopup) q.fromJson(H.getString(getApplicationContext(), "HOLIDAY_POPUP_DATA"), CommonCodeDao.HolidayPopup.class);
        if (holidayPopup == null) {
            return;
        }
        if (!Objects.equals(holidayPopup.getPopup(), "Y")) {
            findViewById(AbstractC5955f.fr_holiday_popup_view).setVisibility(8);
            return;
        }
        CardView cardView = (CardView) findViewById(AbstractC5955f.fr_holiday_popup_view);
        cardView.setVisibility(0);
        s.b bVar = new s.b(this);
        bVar.listener(new a());
        bVar.build().load(Build.VERSION.SDK_INT <= 30 ? holidayPopup.getSubUrl() : holidayPopup.getPopupImg()).fit().into((ImageView) findViewById(AbstractC5955f.img_holiday_popup_img));
        cardView.setOnClickListener(new b(holidayPopup));
        if (holidayPopup.getPopupAlt().isEmpty()) {
            return;
        }
        ((CTextView) findViewById(AbstractC5955f.tv_holiday_popup_desc)).setText(holidayPopup.getPopupAlt());
        ((ImageView) findViewById(AbstractC5955f.img_holiday_popup_img)).setContentDescription(holidayPopup.getPopupAlt());
    }

    private void O0() {
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
        if (Locale.KOREAN.getLanguage().equals(r.getSystemLanguageType())) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("IS_DIRECT_SHOW_MULTI_LANGUAGE", true);
        C6641o.navigation(getApplicationContext(), MultiLanguageActivity.class, bundle2);
    }

    private void P0() {
        if (E.grantedLocationPermissions(K())) {
            w1();
        } else {
            AbstractC0918b.requestPermissions(K(), E.requestPermissions(), E.REQUEST_PERMISSION);
        }
    }

    private void Q0() {
        H.putBoolean(getApplicationContext(), "CONVENIENCE_SETTING_UPDATE", false);
        this.f27739q.clear();
        this.f27740r = -1;
        ConvenienceSettingDao convenienceSettingDao = new ConvenienceSettingDao();
        ConvenienceSettingDao.ConvenienceSettingRequest convenienceSettingRequest = convenienceSettingDao.new ConvenienceSettingRequest();
        convenienceSettingRequest.setCustMgNo(h.getInstance().getCustNo());
        convenienceSettingRequest.setMedDvCd("03");
        convenienceSettingRequest.setReqSqno("0");
        convenienceSettingDao.setRequest(convenienceSettingRequest);
        executeDao(convenienceSettingDao);
    }

    private void R0() {
        MaasMenuListDao maasMenuListDao = new MaasMenuListDao();
        maasMenuListDao.setRequest(new BaseRequest());
        executeDao(maasMenuListDao);
    }

    private void S0(ConvenienceSettingDao.CustTripInfo custTripInfo) {
        Calendar calendar = this.f27746x;
        if (calendar == null) {
            t.e(" dateOption == null");
            return;
        }
        String str = C6631e.isPeakSeason(calendar) ? r4.g.NETFUNNEL_ACTION_ID_PEAKSEASON : r4.g.NETFUNNEL_ACTION_ID;
        t.e("[Netfunnel 간편구매] date : " + this.f27746x.getTime() + ", netfunnelId : " + str + ", isPeakSeason : " + r4.g.NETFUNNEL_ACTION_ID_PEAKSEASON.equals(str));
        if (C6630d.isNull(this.f27724c0) || !this.f27724c0.isShowing()) {
            u4.e eVar = new u4.e(this);
            this.f27724c0 = eVar;
            eVar.showDialog();
            u4.c cVar = new u4.c(this);
            this.f27723b0 = cVar;
            cVar.show();
        }
        A6.g.BEGIN(r4.g.NETFUNNEL_SERVER_ID, str, this.f27724c0, new e(custTripInfo));
    }

    private TrainInquiryRequest[] T0(String str, CalendarData calendarData, String str2) {
        int i8 = this.f27711P.isChecked() ? 2 : 1;
        TrainInquiryRequest[] trainInquiryRequestArr = new TrainInquiryRequest[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            trainInquiryRequestArr[i9] = new TrainInquiryRequest();
        }
        B4.b.getRsvInquiryRequest(getApplicationContext(), trainInquiryRequestArr, this.f27743u, this.f27744v, this.f27745w, this.f27748z, str, calendarData, "11", str2);
        for (int i10 = 0; i10 < i8; i10++) {
            String str3 = "N";
            trainInquiryRequestArr[i10].setAdjStnScdlOfrFlg(this.f27713R.isChecked() ? "Y" : "N");
            if (this.f27715T.isChecked()) {
                trainInquiryRequestArr[i10].setAdjStnScdlOfrFlg("S");
            }
            trainInquiryRequestArr[i10].setEbizCrossCheck(this.f27714S.isChecked() ? "Y" : "N");
            trainInquiryRequestArr[i10].setSrtCheckYn(this.f27714S.isChecked() ? "Y" : "N");
            TrainInquiryRequest trainInquiryRequest = trainInquiryRequestArr[i10];
            if (this.f27711P.isChecked()) {
                str3 = "Y";
            }
            trainInquiryRequest.setRtYn(str3);
            trainInquiryRequestArr[i10].setMbCrdNo(h.getInstance().getMemberNum());
        }
        return trainInquiryRequestArr;
    }

    private ReservationRequest U0() {
        return D4.a.getOReservationRequest(this.f27748z);
    }

    private void W0() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("IS_DIRECT", true);
        X0(bundle);
    }

    private void X0(Bundle bundle) {
        z1();
        r1(bundle);
    }

    private boolean Y0(ConvenienceSettingDao.CustTripInfo custTripInfo) {
        if (!b1(custTripInfo) || !Z0(custTripInfo)) {
            return true;
        }
        a1(custTripInfo);
        return true;
    }

    private boolean Z0(ConvenienceSettingDao.CustTripInfo custTripInfo) {
        String nearestDate = C6634h.getNearestDate(custTripInfo.getDayCd());
        StringBuilder sb = new StringBuilder(custTripInfo.getJobStHr());
        sb.append("00");
        t.d("mDepartureCalendar: " + this.f27746x);
        t.d("날짜 비교1 : " + nearestDate);
        t.d("날짜 비교2 : " + C6634h.getStringFromCalendar(this.f27746x, "yyyyMMdd"));
        t.d("시간 비교1 : " + sb.toString());
        t.d("시간 비교2 : " + C6634h.getStringFromCalendar(this.f27746x, "HHmmss"));
        return (C6634h.isToday(nearestDate) && C6634h.isAfter(C6634h.getToday("HHmm"), sb.toString())) || (nearestDate.equals(C6634h.getStringFromCalendar(this.f27746x, "yyyyMMdd")) && sb.toString().equals(C6634h.getStringFromCalendar(this.f27746x, "HHmmss")));
    }

    private boolean a1(ConvenienceSettingDao.CustTripInfo custTripInfo) {
        Bundle bundle = new Bundle();
        bundle.putInt("ADULT_COUNT", N.intValue(custTripInfo.getAdulCnt(), 1));
        bundle.putInt("GUIDE_DOG_COUNT", 0);
        bundle.putInt("TEENAGER_COUNT", 0);
        bundle.putInt("CHILD_COUNT", N.intValue(custTripInfo.getChilCnt(), 0));
        bundle.putInt("CHILD_ACCOMPANY_COUNT", N.intValue(custTripInfo.getBabyAcpnPrnb(), 0));
        bundle.putInt("SENIOR_COUNT", N.intValue(custTripInfo.getEdrPrnb(), 0));
        bundle.putInt("HIGH_DISABLE_COUNT", N.intValue(custTripInfo.getAdltHdcpPrnb(), 0));
        bundle.putInt("LOW_DISABLE_COUNT", N.intValue(custTripInfo.getChldHdcpPrnb(), 0));
        T4.d dVar = new T4.d(this, bundle);
        return C6630d.equalsBundles(dVar.getPassengerInfo(), this.f27748z.getPassengerInfo());
    }

    private boolean b1(ConvenienceSettingDao.CustTripInfo custTripInfo) {
        return custTripInfo.getDptStnNm().equals(this.f27743u.getStartStationNm()) && custTripInfo.getArvStnNm().equals(this.f27743u.getArrivalStationNm());
    }

    private boolean c1() {
        return h.getInstance().isLogin();
    }

    public /* synthetic */ void d1() {
        this.f27737o = false;
    }

    public /* synthetic */ void e1(DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            if (!this.f27731i0) {
                C6630d.moveToOutSideBrowser(getApplicationContext(), getString(AbstractC5959j.hearing_impaired_url, h.getInstance().getEncryptHMbCrdNo()));
                return;
            }
            Intent intent = new Intent(getApplicationContext(), (Class<?>) MaumAIV2WebViewActivity.class);
            intent.putExtra("kind", 0);
            startActivity(intent);
        }
    }

    public /* synthetic */ void f1(DialogInterface dialogInterface, int i8) {
        startActivity(new Intent(getApplicationContext(), (Class<?>) ReservedTicketActivity.class));
    }

    public /* synthetic */ void g1(DialogInterface dialogInterface, int i8, boolean z8) {
        if (z8) {
            H.putBoolean(getApplicationContext(), "IS_DIALOG_AUTO_POPUP_CHATBOT", false);
        }
        if (102 == i8) {
            V0();
        }
    }

    public /* synthetic */ void h1(DialogInterface dialogInterface, int i8, boolean z8) {
        if (z8) {
            H.putBoolean(getApplicationContext(), "IS_DIALOG_AUTO_POPUP_CHATBOT", false);
        }
        if (102 == i8) {
            V0();
        }
    }

    public /* synthetic */ void i1(Intent intent) {
        C6637k.showLoginDialog(K(), (ArrayList) M(intent, "POPUP_DATA"));
    }

    public /* synthetic */ void j1(DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            startActivity(new Intent(getApplicationContext(), (Class<?>) DiscountCouponActivity.class));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void k1(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
        /*
            r0 = this;
            P4.k r1 = r0.f27727f0
            com.korail.talk.network.dao.common.MaasMenuListDao$Menu r1 = r1.getItem(r3)
            r0.f27701F = r1
            I4.c r1 = r0.f27697B
            boolean r1 = z4.C6630d.isNotNull(r1)
            if (r1 == 0) goto L2d
            I4.c r1 = r0.f27697B
            android.location.Location r1 = r1.getLastKnownLocation()
            boolean r2 = z4.C6630d.isNotNull(r1)
            if (r2 == 0) goto L2d
            double r2 = r1.getLatitude()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            double r3 = r1.getLongitude()
            java.lang.String r1 = java.lang.String.valueOf(r3)
            goto L30
        L2d:
            java.lang.String r2 = ""
            r1 = r2
        L30:
            android.app.Activity r3 = r0.K()
            com.korail.talk.network.dao.common.MaasMenuListDao$Menu r4 = r0.f27701F
            z4.w.moveToMaasService(r3, r4, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.korail.talk.ui.booking.mainBooking.MainBookingActivity.k1(android.widget.AdapterView, android.view.View, int, long):void");
    }

    public /* synthetic */ void l1() {
        V4.b bVar = this.f27743u;
        bVar.setStationNm(bVar.getArrivalStationNm(), this.f27743u.getStartStationNm());
    }

    public /* synthetic */ void m1(ConvenienceSettingDao.CustTripInfo custTripInfo, DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            S0(custTripInfo);
        }
    }

    public /* synthetic */ void n1(DialogInterface dialogInterface, int i8, boolean z8, int i9) throws ParseException {
        if (100 == i8) {
            p1();
        } else {
            if (102 != i8 || i9 <= -1) {
                return;
            }
            M0(i9);
        }
    }

    public /* synthetic */ void o1(int i8, StationData stationData, String str, String str2, boolean z8, DialogInterface dialogInterface, int i9, boolean z9) {
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
            t1(str, str2, z8);
        }
    }

    private void p1() {
        Bundle bundle = new Bundle();
        bundle.putString("WEB_POST_URL", r4.g.CONVENIENCE_SETTING_URL);
        bundle.putBoolean("IS_CLOSE_VIEW", true);
        C6641o.navigation(getApplicationContext(), IntegrationWebViewActivity.class, bundle);
    }

    private void q1(ReservationResponse reservationResponse) {
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
    /* JADX WARN: Type inference failed for: r0v8, types: [com.korail.talk.network.request.inquiry.TrainInquiryRequest[], java.io.Serializable] */
    private void r1(Bundle bundle) {
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
        t.d("moveToTrainInquiry - " + this);
        String string2 = bundle.getString("TRANSFER_CHTNRSSTNCD");
        String string3 = bundle.getString("TRANSFER_TRNGPCD");
        boolean z8 = bundle.getBoolean("IS_SELECT_TRANSFER");
        t.d("chtnrsStnCd - " + string2 + " trngpcd - " + string3 + " isSelectTransfer - " + z8);
        intent.putExtra("TRANSFER_CHTNRSSTNCD", string2);
        intent.putExtra("TRANSFER_TRNGPCD", string3);
        intent.putExtra("IS_SELECT_TRANSFER", z8);
        if (bundle.containsKey("RESERVATION_TYPE")) {
            intent.putExtra("RESERVATION_TYPE", bundle.getSerializable("RESERVATION_TYPE"));
        } else {
            intent.putExtra("RESERVATION_TYPE", this.f27711P.isChecked() ? r4.c.RSV_GOING : r4.c.RSV_DEFAULT);
        }
        if (bundle.containsKey("RESERVATION_RESPONSE")) {
            intent.putExtra("RESERVATION_RESPONSE", bundle.getSerializable("RESERVATION_RESPONSE"));
        }
        intent.putExtra("MENU_TYPE", EnumC6175b.DEFAULT);
        intent.putExtra("INQUIRY_REQUEST", (Serializable) T0(code, calendarInfo, string));
        intent.putExtra("RESERVATION_REQUEST", U0());
        startActivityForResult(intent, 117);
    }

    private void s1(Intent intent) {
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

    private void setLocationManager() {
        I4.c cVar = new I4.c();
        this.f27697B = cVar;
        cVar.requestLocationUpdates(getApplicationContext());
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_normal_booking_maas);
    }

    private void t1(String str, String str2, boolean z8) {
        if (z8) {
            K1(str, str2, false);
        } else {
            W0();
        }
    }

    public void v1() {
        C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.hearing_impaired_msg3)).setButtonListener(new C6219c.InterfaceC0421c() { // from class: P4.l
            @Override // s4.C6219c.InterfaceC0421c
            public final void onClick(DialogInterface dialogInterface, int i8, boolean z8) {
                this.f3723a.h1(dialogInterface, i8, z8);
            }
        }).showDimDialog(true);
    }

    private void w1() {
        final Intent intent = getIntent();
        O0();
        if (intent.hasExtra("POPUP_DATA")) {
            new Handler().postDelayed(new Runnable() { // from class: P4.v
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3739a.i1(intent);
                }
            }, 300L);
        }
        if (intent.hasExtra("POPUP_COUPON")) {
            String stringExtra = getIntent().getStringExtra("POPUP_COUPON");
            String str = getIntent().getStringExtra("POPUP_COUPON_NAME") + "님이 보유하신 쿠폰이 곧 \u001d만료될 예정입니다. 사용기한이 지나면 쿠폰은 소멸되며, 연장되지 않습니다.";
            if ("Y".equals(stringExtra)) {
                C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(str).setButtonListener(new DialogInterface.OnClickListener() { // from class: P4.w
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        this.f3741a.j1(dialogInterface, i8);
                    }
                }).setButtonNames(new String[]{"확인", "쿠폰 확인 바로가기"}).showDialog();
            }
        }
        new Handler().postDelayed(new Runnable() { // from class: P4.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f3742a.showMainPopupDialog();
            }
        }, 500L);
        setLocationManager();
        s1(intent);
    }

    private void x1(List list) throws Resources.NotFoundException, ParseException {
        this.f27739q = list;
        boolean z8 = !c1() || list.isEmpty();
        this.f27719X.setText(z8 ? AbstractC5959j.common_simple_register : AbstractC5959j.common_simple_buy);
        this.f27720Y.setVisibility(z8 ? 8 : 0);
        this.f27722a0.setVisibility(z8 ? 8 : 0);
        int intExtra = getIntent().getIntExtra("FAVORITE_SELECT_INDEX", -1);
        if (!c1() || intExtra <= -1) {
            return;
        }
        M0(intExtra);
        onClick(this.f27719X);
    }

    private void y1() {
        KTApplication.isAppRunning = true;
        this.f27738p = false;
        this.f27739q = new ArrayList();
        this.f27741s = new SimpleDateFormat("yyyy년 MM월 dd일 (E) HH:mm");
        this.f27700E = "";
    }

    private void z1() {
        String startStationNm = this.f27743u.getStartStationNm();
        String arrivalStationNm = this.f27743u.getArrivalStationNm();
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

    protected void D1() {
        if (C6630d.isNotNull(getIntent().getSerializableExtra("data_from_SRT"))) {
            T4.d dVar = new T4.d(K(), C6626B.getPassengerBundleData(getIntent().getExtras()));
            this.f27748z = dVar;
            this.f27708M.setText(dVar.getTotalPassengerText());
        } else {
            T4.d dVar2 = new T4.d(K(), C6626B.getPassengerBundleData());
            this.f27748z = dVar2;
            this.f27708M.setText(dVar2.getTotalPassengerText());
        }
    }

    void V0() {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) MaumAIV2WebViewActivity.class);
        intent.putExtra("kind", 1);
        startActivity(intent);
    }

    public void hideStationSearch() throws Resources.NotFoundException {
        if (this.f27716U.getVisibility() == 0) {
            this.f27743u.unSelectStation();
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(getApplicationContext(), AbstractC5951b.bottom_view_slide_down);
            animationLoadAnimation.setAnimationListener(new f());
            this.f27716U.startAnimation(animationLoadAnimation);
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(findViewById(AbstractC5955f.v_main_booking_container), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, 0.0f));
            objectAnimatorOfPropertyValuesHolder.setDuration(300L);
            objectAnimatorOfPropertyValuesHolder.start();
            O(this.f27716U);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i8, int i9, Intent intent) {
        String stringExtra;
        super.onActivityResult(i8, i9, intent);
        t.d("requestCode : " + i8);
        if (i9 != -1 || 113 == i8) {
            return;
        }
        if (117 == i8) {
            intent.getExtras();
            t.d("chtnrsStnCd - " + intent.getStringExtra("TRANSFER_CHTNRSSTNCD") + " trngpcd - " + intent.getStringExtra("TRANSFER_TRNGPCD"));
            X0(intent.getExtras());
            return;
        }
        if (132 == i8) {
            Calendar calendar = (Calendar) intent.getSerializableExtra("TICKET_DATE_INFO");
            this.f27746x = calendar;
            this.f27705J.setText(this.f27741s.format(calendar.getTime()));
            this.f27744v.refreshDate(C6634h.getCalendarInfo(this.f27746x));
            if (this.f27711P.isChecked()) {
                if (this.f27746x.compareTo(this.f27747y) < 1) {
                    this.f27705J.setText(this.f27741s.format(this.f27746x.getTime()));
                    this.f27744v.refreshDate(C6634h.getCalendarInfo(this.f27746x));
                    return;
                }
                I1();
                Calendar calendar2 = this.f27746x;
                this.f27747y = calendar2;
                this.f27706K.setText(this.f27741s.format(calendar2.getTime()));
                this.f27745w.refreshDate(C6634h.getCalendarInfo(this.f27747y));
                return;
            }
            return;
        }
        if (133 == i8) {
            Calendar calendar3 = (Calendar) intent.getSerializableExtra("TICKET_DATE_INFO");
            this.f27747y = calendar3;
            this.f27706K.setText(this.f27741s.format(calendar3.getTime()));
            this.f27745w.refreshDate(C6634h.getCalendarInfo(this.f27747y));
            if (this.f27747y.compareTo(this.f27746x) <= -1) {
                I1();
                Calendar calendar4 = this.f27747y;
                this.f27746x = calendar4;
                this.f27705J.setText(this.f27741s.format(calendar4.getTime()));
                this.f27744v.refreshDate(C6634h.getCalendarInfo(this.f27746x));
                return;
            }
            return;
        }
        if (134 == i8) {
            Bundle bundleExtra = intent.getBundleExtra("TICKET_PASSENGER_INFO");
            this.f27696A = bundleExtra;
            this.f27748z.updatePassengerData(bundleExtra);
            this.f27696A.getInt("TOTAL_PERSON_COUNT");
            this.f27708M.setText(this.f27748z.getTotalPassengerText());
            int i10 = this.f27696A.getInt("ADULT_COUNT");
            int i11 = this.f27696A.getInt("TEENAGER_COUNT");
            int i12 = this.f27696A.getInt("CHILD_COUNT");
            int i13 = this.f27696A.getInt("CHILD_ACCOMPANY_COUNT");
            int i14 = this.f27696A.getInt("SENIOR_COUNT");
            int i15 = this.f27696A.getInt("HIGH_DISABLE_COUNT");
            int i16 = this.f27696A.getInt("LOW_DISABLE_COUNT");
            int i17 = this.f27696A.getInt("GUIDE_DOG_COUNT");
            t.d("============================================================");
            t.d("adultCount : " + i10 + ", teenagerCount : " + i11 + ", childCount : " + i12 + ", childAccompanyCount : " + i13 + ", seniorCount : " + i14 + ", highDisableCount : " + i15 + ", lowDisableCount : " + i16 + ", guideDogCount : " + i17);
            return;
        }
        if (135 == i8) {
            this.f27700E = intent.getStringExtra("MAAS_STATION_CODE");
            t.d("mSelectedStationCode : " + this.f27700E);
            Intent intent2 = new Intent(getApplicationContext(), (Class<?>) MaasMainCalendarActivity.class);
            intent2.putExtra("MAAS_TITLE", this.f27701F.getName() + X.SPACE + getString(AbstractC5959j.maas_title_calendar));
            intent2.putExtra("MAAS_CALENDAR", true);
            String stringExtra2 = intent.getStringExtra("MAAS_RENTCAR_UI");
            if (stringExtra2 != null && (stringExtra2.equals("M30") || stringExtra2.equals("M10"))) {
                intent2.putExtra("MAAS_RENTCAR_UI", stringExtra2);
            }
            startActivityForResult(intent2, 137);
            return;
        }
        if (137 != i8) {
            if (138 == i8) {
                Intent intent3 = new Intent(getApplicationContext(), (Class<?>) MaasMainCalendarActivity.class);
                intent3.putExtra("MAAS_TITLE", this.f27701F.getName() + X.SPACE + getString(AbstractC5959j.maas_title_calendar));
                intent3.putExtra("MAAS_CALENDAR", true);
                if (intent.hasExtra("MAAS_RESELECT_DATE_CODE") && (stringExtra = intent.getStringExtra("MAAS_RESELECT_DATE_CODE")) != null && !stringExtra.isEmpty()) {
                    intent3.putExtra("MAAS_RESELECT_DATE_CODE", stringExtra);
                    if (stringExtra.equals("MAAS_SERVICE_RENTCAR_RENT_DATE")) {
                        if (C6630d.isNotNull(this.f27699D)) {
                            intent3.putExtra("MAAS_ALREADY_CALENDAR", (Calendar) this.f27699D.clone());
                        }
                    } else if (stringExtra.equals("MAAS_SERVICE_RENTCAR_RETURN_DATE")) {
                        if (C6630d.isNotNull(this.f27699D)) {
                            intent3.putExtra("MAAS_ALREADY_CALENDAR", (Calendar) this.f27699D.clone());
                        }
                        if (C6630d.isNotNull(this.f27698C)) {
                            intent3.putExtra("MAAS_ALREADY_CALENDAR_RETURN", (Calendar) this.f27698C.clone());
                        }
                    }
                }
                String stringExtra3 = intent.getStringExtra("MAAS_RENTCAR_UI");
                if (stringExtra3 != null && (stringExtra3.equals("M30") || stringExtra3.equals("M10"))) {
                    intent3.putExtra("MAAS_RENTCAR_UI", stringExtra3);
                }
                startActivityForResult(intent3, 137);
                return;
            }
            return;
        }
        this.f27698C = (Calendar) intent.getSerializableExtra("TICKET_DATE_INFO");
        t.d("date : " + C6634h.getStringFromCalendar(this.f27698C, "yyyyMMdd"));
        Intent intent4 = new Intent(getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
        intent4.putExtra("WEB_POST_URL", this.f27701F.getUrl());
        String stringExtra4 = intent.getStringExtra("MAAS_RENTCAR_UI");
        if (stringExtra4 != null && (stringExtra4.equals("M30") || stringExtra4.equals("M10"))) {
            intent4.putExtra("MAAS_RENTCAR_UI", stringExtra4);
        }
        if (intent.getBooleanExtra("INTEGRATION_RENT", false)) {
            this.f27699D = (Calendar) intent.getSerializableExtra("TICKET_DATE_INFO_FROM");
            intent4.putExtra("WEB_POST_PARAMETER", "custNo=" + h.getInstance().getCustNo() + "&mbCrdNo=" + h.getInstance().getMemberNum() + "&strStDt=" + C6634h.getStringFromCalendar(this.f27699D, "yyyyMMddHHmmss") + "&strClsDt=" + C6634h.getStringFromCalendar(this.f27698C, "yyyyMMddHHmmss") + "&stdrStnCd=" + this.f27700E + "&addsrvDvCd=" + this.f27701F.getAddSrvDvCd());
        } else {
            intent4.putExtra("WEB_POST_PARAMETER", "custNo=" + h.getInstance().getCustNo() + "&mbCrdNo=" + h.getInstance().getMemberNum() + "&stdrDt=" + C6634h.getStringFromCalendar(this.f27698C, "yyyyMMdd") + "&stdrStnCd=" + this.f27700E + "&addsrvDvCd=" + this.f27701F.getAddSrvDvCd());
        }
        startActivityForResult(intent4, 138);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, com.korail.talk.view.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() throws Resources.NotFoundException {
        if (C6630d.isNotNull(this.f27716U) && this.f27716U.getVisibility() == 0) {
            hideStationSearch();
            return;
        }
        if (isOpenDrawer()) {
            closeDrawer();
        } else {
            if (this.f27737o) {
                super.onBackPressed();
                return;
            }
            this.f27737o = true;
            Toast.makeText(getApplicationContext(), getString(AbstractC5959j.msg_toast_quit), 0).show();
            new Handler().postDelayed(new Runnable() { // from class: P4.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3733a.d1();
                }
            }, 2000L);
        }
    }

    @Override // com.korail.talk.ui.booking.option.station.StationSearch.e
    public void onChangeStation(StationNameData stationNameData) throws Resources.NotFoundException {
        this.f27743u.setStationNm(N.isNotNull(stationNameData.getDepartureStationName()) ? stationNameData.getDepartureStationName() : this.f27743u.getStartStationNm(), N.isNotNull(stationNameData.getArrivalStationName()) ? stationNameData.getArrivalStationName() : this.f27743u.getArrivalStationNm());
        hideStationSearch();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
        if (AbstractC5955f.cb_round_trip == compoundButton.getId()) {
            this.f27704I.setVisibility(z8 ? 0 : 8);
            C1();
            return;
        }
        if (AbstractC5955f.cb_extra_option_near_station == compoundButton.getId()) {
            H.putBoolean(getApplicationContext(), "TRAIN_NEAR_STATION", z8);
            if (z8) {
                return;
            }
            this.f27715T.setChecked(false);
            return;
        }
        if (AbstractC5955f.cb_extra_option_srt == compoundButton.getId()) {
            H.putBoolean(getApplicationContext(), "TRAIN_SRT_STATION", z8);
            if (z8) {
                return;
            }
            this.f27715T.setChecked(false);
            return;
        }
        if (AbstractC5955f.cb_extra_option_srt_near == compoundButton.getId()) {
            H.putBoolean(getApplicationContext(), "TRAIN_NEAR_SRT_STATION", z8);
            if (z8) {
                this.f27713R.setChecked(true);
                this.f27714S.setChecked(true);
            }
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) throws Resources.NotFoundException {
        O(view);
        int id = view.getId();
        if (AbstractC5955f.iv_main_booking == id) {
            C6630d.moveToOutSideBrowser(getApplicationContext(), getString(AbstractC5959j.hearing_impaired_url, h.getInstance().getEncryptHMbCrdNo()));
            return;
        }
        if (AbstractC5955f.iv_srt == id) {
            boolean z8 = this.f27738p;
            this.f27738p = !z8;
            this.f27717V.setVisibility(z8 ? 8 : 0);
            return;
        }
        if (AbstractC5955f.tv_extra_option_close == id) {
            this.f27717V.setVisibility(8);
            this.f27738p = false;
            return;
        }
        if (AbstractC5955f.v_station_search == id) {
            hideStationSearch();
            return;
        }
        if (AbstractC5955f.btn_right == id) {
            L1();
            return;
        }
        if (AbstractC5955f.btn_main_booking_payment == id) {
            if (!c1()) {
                C6641o.moveToLogin(K());
                return;
            }
            if (this.f27739q.isEmpty()) {
                p1();
                return;
            }
            t.d("mSelectIndex : " + this.f27740r);
            if (this.f27740r < 0) {
                H1();
                return;
            }
            if (C6630d.isNull(C6111b.getInstance().getStationDataByName(this.f27743u.getStartStationNm())) || C6630d.isNull(C6111b.getInstance().getStationDataByName(this.f27743u.getArrivalStationNm()))) {
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.station_data_empty)).showDialog();
                return;
            }
            ConvenienceSettingDao.CustTripInfo custTripInfo = (ConvenienceSettingDao.CustTripInfo) this.f27739q.get(this.f27740r);
            if (Y0(custTripInfo)) {
                S0(custTripInfo);
                return;
            } else {
                G1(custTripInfo);
                return;
            }
        }
        if (AbstractC5955f.btn_main_booking_convenience_setting_list == id) {
            if (!c1()) {
                C6641o.moveToLogin(K());
                return;
            } else if (this.f27739q.isEmpty()) {
                p1();
                return;
            } else {
                H1();
                return;
            }
        }
        if (AbstractC5955f.backBtn == id) {
            C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(this.f27731i0 ? AbstractC5959j.hearing_impaired_msg2 : AbstractC5959j.hearing_impaired_msg)).setButtonListener(new DialogInterface.OnClickListener() { // from class: P4.s
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f3736a.e1(dialogInterface, i8);
                }
            }).showDimDialog(true);
            return;
        }
        if (AbstractC5955f.ranguageBtn == id) {
            Intent intent = new Intent(getApplicationContext(), (Class<?>) MultiLanguageActivity.class);
            if (C6630d.isNotNull(null)) {
                intent.putExtras((Bundle) null);
            }
            startActivity(intent);
            return;
        }
        if (AbstractC5955f.rl_going_date == id) {
            Intent intent2 = new Intent(getApplicationContext(), (Class<?>) MaasMainCalendarActivity.class);
            intent2.putExtra("requestCode", G711.BIAS);
            intent2.putExtra("departureDate", this.f27746x.getTime());
            startActivityForResult(intent2, G711.BIAS);
            return;
        }
        if (AbstractC5955f.rl_incoming_date == id) {
            Intent intent3 = new Intent(getApplicationContext(), (Class<?>) MaasMainCalendarActivity.class);
            intent3.putExtra("requestCode", 133);
            intent3.putExtra("arrivalDate", this.f27747y.getTime());
            startActivityForResult(intent3, 133);
            return;
        }
        if (AbstractC5955f.rl_passenger_info != id) {
            super.onClick(view);
            return;
        }
        Intent intent4 = new Intent(getApplicationContext(), (Class<?>) MaasMainPassengerActivity.class);
        intent4.putExtra("TICKET_PASSENGER_INFO", this.f27748z.getPassengerInfo());
        startActivityForResult(intent4, 134);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_maas_main_booking);
        this.f27736n = C6630d.isNotNull(bundle);
        if (C6630d.isNull(bundle)) {
            this.f27731i0 = "Y".equals(((CommonCodeDao.Data) q.fromJson(H.getString(getApplicationContext(), "VAR_DATA"), CommonCodeDao.Data.class)).getCsChatBot());
            N0();
            y1();
            F1();
            setText();
            B1();
            P0();
            R0();
            if (h.getInstance().isPhysicalDisability() && this.f27731i0) {
                physicalDisabilityViewSetting(true);
                if (H.getBoolean(getApplicationContext(), "IS_DIALOG_AUTO_POPUP_CHATBOT", true)) {
                    u1();
                }
            }
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.appcompat.app.e, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onDestroy() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        KTApplication.isAppRunning = this.f27736n;
        I4.g.getInstance().unBindService(getApplicationContext());
        super.onDestroy();
    }

    @Override // com.korail.talk.view.base.BaseActivity
    public void onLoginFail(boolean z8) {
        super.onLoginFail(false);
    }

    @Override // P4.InterfaceC0687e
    public void onLogoutSuccess() {
        Bundle bundle = new Bundle();
        bundle.putInt("ADULT_COUNT", 1);
        bundle.putInt("TEENAGER_COUNT", 0);
        bundle.putInt("CHILD_COUNT", 0);
        bundle.putInt("CHILD_ACCOMPANY_COUNT", 0);
        bundle.putInt("SENIOR_COUNT", 0);
        bundle.putInt("HIGH_DISABLE_COUNT", 0);
        bundle.putInt("LOW_DISABLE_COUNT", 0);
        bundle.putInt("GUIDE_DOG_COUNT", 0);
        bundle.putInt("TOTAL_PERSON_COUNT", 1);
        if (this.f27731i0) {
            physicalDisabilityViewSetting(false);
        }
        this.f27696A = bundle;
        this.f27748z.updatePassengerData(bundle);
        this.f27708M.setText(this.f27748z.getTotalPassengerText());
    }

    @Override // androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        s1(intent);
    }

    @Override // v4.g
    public void onOptionHeaderClick(C6550j c6550j, boolean z8) {
        if (C6630d.isNotNull(c6550j) && (c6550j instanceof V4.b)) {
            showStationSearch(((V4.b) c6550j).isDepartureSelected() ? StationSearch.c.START : StationSearch.c.ARRIVAL);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) throws Resources.NotFoundException, ParseException {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_convenience_setting == id) {
            x1(((ConvenienceSettingDao.ConvenienceSettingResponse) iBaseDao.getResponse()).getMainList());
            return;
        }
        if (AbstractC5955f.dao_reservation == id) {
            q1((ReservationResponse) iBaseDao.getResponse());
            return;
        }
        if (AbstractC5955f.dao_maas_menu_list == id) {
            List<MaasMenuListDao.Menu> menuList = ((MaasMenuListDao.MaasMenuListResponse) iBaseDao.getResponse()).getMenuList();
            if (C6630d.isNotNull(menuList) && menuList.size() > 0) {
                this.f27727f0.setData(menuList);
                double dCeil = Math.ceil(menuList.size() / 4.0d);
                this.f27726e0.getLayoutParams().height = N.dpToPx(((int) dCeil) * 85);
                this.f27727f0.notifyDataSetChanged();
            }
            if (C6630d.isNotNull((ReceiveSRTData) M(getIntent(), "data_from_SRT"))) {
                W0();
                setIntent(new Intent());
            }
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        super.onReceiveError(iBaseDao, c6536a);
        if (AbstractC5955f.dao_reservation == iBaseDao.getId()) {
            ReservationResponse reservationResponse = (ReservationResponse) iBaseDao.getResponse();
            if ("WRR800029".equals(reservationResponse.gethMsgCd()) || "ERR911531".equals(reservationResponse.gethMsgCd()) || "ERR911051".equals(reservationResponse.gethMsgCd())) {
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(c6536a.getMessage()).setButtonListener(new DialogInterface.OnClickListener() { // from class: P4.r
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        this.f3735a.f1(dialogInterface, i8);
                    }
                }).showDialog();
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) throws Resources.NotFoundException {
        super.onRequestPermissionsResult(i8, strArr, iArr);
        if (i8 == E.REQUEST_PERMISSION) {
            if (C6630d.isNotNull(this.f27716U) && E.grantedLocationPermissions(K())) {
                this.f27716U.setLocationManager();
                this.f27716U.refreshList();
            }
            w1();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onResume() throws Resources.NotFoundException, ParseException {
        this.f27709N.setVisibility(c1() ? 0 : 8);
        this.f27727f0.notifyDataSetChanged();
        if (this.f27709N.getVisibility() == 0) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((ImageButton) findViewById(AbstractC5955f.railplusBtn)).getLayoutParams();
            layoutParams.setMargins(0, 0, 0, 0);
            ((ImageButton) findViewById(AbstractC5955f.railplusBtn)).setLayoutParams(layoutParams);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) ((ImageButton) findViewById(AbstractC5955f.railplusBtn)).getLayoutParams();
            layoutParams2.setMargins(30, 0, 0, 0);
            ((ImageButton) findViewById(AbstractC5955f.railplusBtn)).setLayoutParams(layoutParams2);
        }
        if (C6630d.isNotNull(this.f27716U)) {
            this.f27716U.refreshList();
        }
        if (c1() && H.getBoolean(getApplicationContext(), "CONVENIENCE_SETTING_VISIBLE") && H.getBoolean(getApplicationContext(), "CONVENIENCE_SETTING_UPDATE")) {
            Q0();
        } else if (!c1() && H.getBoolean(getApplicationContext(), "CONVENIENCE_SETTING_VISIBLE")) {
            x1(new ArrayList());
        }
        super.onResume();
    }

    public void physicalDisabilityViewSetting(boolean z8) {
        if (z8) {
            this.f27728g0.setVisibility(0);
            this.f27729h0.setVisibility(0);
        } else {
            this.f27728g0.setVisibility(8);
            this.f27729h0.setVisibility(8);
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

    public void showStationSearch(StationSearch.c cVar) {
        this.f27716U.initSearchEdit();
        this.f27716U.setStartArrivalType(cVar);
        if (this.f27716U.getVisibility() == 8) {
            this.f27716U.setVisibility(0);
            this.f27716U.performAccessibilityAction(64, null);
            this.f27716U.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), AbstractC5951b.bottom_view_slide_up));
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(findViewById(AbstractC5955f.v_main_booking_container), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, -N.dpToPx(105.0f)));
            objectAnimatorOfPropertyValuesHolder.setDuration(300L);
            objectAnimatorOfPropertyValuesHolder.start();
        }
    }

    void u1() {
        C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.hearing_impaired_msg3)).setCheckBoxMessage(getString(AbstractC5959j.do_not_show_again_2)).setButtonListener(new C6219c.InterfaceC0421c() { // from class: P4.q
            @Override // s4.C6219c.InterfaceC0421c
            public final void onClick(DialogInterface dialogInterface, int i8, boolean z8) {
                this.f3734a.g1(dialogInterface, i8, z8);
            }
        }).showDimDialog(true);
    }
}
