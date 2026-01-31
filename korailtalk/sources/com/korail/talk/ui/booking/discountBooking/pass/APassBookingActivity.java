package com.korail.talk.ui.booking.discountBooking.pass;

import R4.b;
import T4.c;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ScrollView;
import com.korail.talk.data.StationNameData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.pass.DiscountMenuDao;
import com.korail.talk.network.dao.pass.EnableDateDao;
import com.korail.talk.network.dao.pass.EnableDateDao.EnableDateRequest;
import com.korail.talk.network.dao.pass.PassPaymentDao;
import com.korail.talk.network.dao.pass.PassPaymentDao.PassPaymentRequest;
import com.korail.talk.network.dao.pass.PassReservationDao;
import com.korail.talk.network.dao.pass.PassReservationDao.PassReservationRequest;
import com.korail.talk.network.dao.research.CmtrInfoDao;
import com.korail.talk.network.dao.research.CmtrInfoDao.CmtrInfoRequest;
import com.korail.talk.ui.booking.option.date.a;
import com.korail.talk.ui.booking.option.station.StationSearch;
import com.korail.talk.ui.payment.PaymentActivity;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import n4.AbstractC5951b;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import r4.i;
import v4.g;
import y6.C6550j;
import z4.C6625A;
import z4.C6630d;
import z4.C6634h;
import z4.C6637k;
import z4.M;
import z4.N;
import z4.t;

/* loaded from: classes.dex */
public class APassBookingActivity extends BaseViewActivity implements g, b.a {

    /* renamed from: i, reason: collision with root package name */
    private boolean f27605i;

    /* renamed from: j, reason: collision with root package name */
    private DiscountMenuDao.DiscountMenu f27606j;

    /* renamed from: k, reason: collision with root package name */
    private String f27607k;

    /* renamed from: l, reason: collision with root package name */
    private String f27608l;

    /* renamed from: m, reason: collision with root package name */
    private List f27609m;

    /* renamed from: n, reason: collision with root package name */
    private String f27610n;

    /* renamed from: o, reason: collision with root package name */
    private CmtrInfoDao.CmtrInfoResponse f27611o;

    /* renamed from: p, reason: collision with root package name */
    private ViewGroup f27612p;

    /* renamed from: q, reason: collision with root package name */
    private ScrollView f27613q;

    /* renamed from: r, reason: collision with root package name */
    private T4.a f27614r;

    /* renamed from: s, reason: collision with root package name */
    private R4.b f27615s;

    /* renamed from: t, reason: collision with root package name */
    private com.korail.talk.ui.booking.option.date.a f27616t;

    /* renamed from: u, reason: collision with root package name */
    private V4.a f27617u;

    /* renamed from: v, reason: collision with root package name */
    private StationSearch f27618v;

    /* renamed from: w, reason: collision with root package name */
    private Button f27619w;

    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            APassBookingActivity aPassBookingActivity = APassBookingActivity.this;
            aPassBookingActivity.scrollToOption(aPassBookingActivity.f27617u);
        }
    }

    class b implements Animation.AnimationListener {
        b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            APassBookingActivity.this.f27618v.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            APassBookingActivity.this.f27617u.collapse();
        }
    }

    private void E0(String str) {
        F0(str, 0, null, null);
    }

    private void F0(String str, int i8, ArrayList arrayList, ArrayList arrayList2) {
        CmtrInfoDao cmtrInfoDao = new CmtrInfoDao();
        CmtrInfoDao.CmtrInfoRequest cmtrInfoRequest = cmtrInfoDao.new CmtrInfoRequest();
        cmtrInfoRequest.setJobDvCd(str);
        cmtrInfoRequest.setCmtrKndCd(L0());
        if (CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_B.equals(str)) {
            cmtrInfoRequest.setPsgCnt(i8);
            cmtrInfoRequest.setCmtrUtlAgeCd(arrayList);
            cmtrInfoRequest.setPsgPrnb(arrayList2);
        }
        if (CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_A.equals(str)) {
            cmtrInfoDao.setFinishView(true);
        }
        cmtrInfoDao.setRequest(cmtrInfoRequest);
        executeDao(cmtrInfoDao);
    }

    private void G0() {
        EnableDateDao enableDateDao = new EnableDateDao();
        EnableDateDao.EnableDateRequest enableDateRequest = enableDateDao.new EnableDateRequest();
        enableDateRequest.setTxtCmtrKndCd(L0());
        enableDateRequest.setTxtCmtrUtlTrmCd(this.f27607k);
        enableDateRequest.setTxtCmtrUtlAgeCd(this.f27608l);
        enableDateDao.setRequest(enableDateRequest);
        enableDateDao.setFinishView(true);
        executeDao(enableDateDao);
    }

    private void H0(String str, String str2) {
        PassReservationDao passReservationDao = new PassReservationDao();
        PassReservationDao.PassReservationRequest passReservationRequest = passReservationDao.new PassReservationRequest();
        passReservationRequest.setHidCmtrKndCd(str);
        passReservationRequest.setHidCmtrUtlAgeCd(str2);
        passReservationRequest.setHidCmtrUtlTrmCd(this.f27607k);
        passReservationRequest.setHidUseOpenDt(this.f27616t.getSelectedDay());
        passReservationDao.setRequest(passReservationRequest);
        executeDao(passReservationDao);
    }

    private List I0() {
        return J0().getPass_ageinfo();
    }

    private DiscountMenuDao.PassMainInfo J0() {
        return this.f27606j.getPassData();
    }

    private List K0() {
        return J0().getPass_periodinfo();
    }

    private String L0() {
        return J0().getH_cmtr_knd_cd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0(DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            finish();
        } else if (102 == i8) {
            G0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N0(DialogInterface dialogInterface, int i8) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O0() {
        this.f27613q.fullScroll(130);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P0(View view) {
        this.f27613q.smoothScrollTo(0, view.getTop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q0(int i8) {
        this.f27613q.smoothScrollTo(0, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R0(StationNameData stationNameData) throws Resources.NotFoundException {
        String arrivalStationName = stationNameData.getArrivalStationName();
        this.f27617u.setHeaderVal0Txt(arrivalStationName);
        Iterator it = this.f27609m.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EnableDateDao.WctInfo wctInfo = (EnableDateDao.WctInfo) it.next();
            if (arrivalStationName.equals(wctInfo.getKor_cd_val())) {
                this.f27610n = wctInfo.getEng_cd_val();
                this.f27619w.setEnabled(true);
                break;
            }
        }
        O(this.f27618v);
        hideBenefitStationSelectView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S0(int i8) {
        this.f27607k = ((DiscountMenuDao.PassPeriodInfo) K0().get(i8)).getH_cmtr_utl_trm_cd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T0(Bundle bundle, int i8, String str) {
        if (this.f27614r.isCmpaFlg()) {
            this.f27615s.setCompanionDetailView(bundle, i8, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U0(DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            finish();
        } else if (102 == i8) {
            E0(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_A);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V0(DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            List<CmtrInfoDao.Psg> psgList = this.f27611o.getPsgList();
            int size = psgList.size();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i9 = 0; i9 < size; i9++) {
                arrayList.add(i9, psgList.get(i9).getCmtrUtlAgeCd());
                arrayList2.add(i9, Integer.valueOf(this.f27614r.getPassengerInfo(i9)));
            }
            F0(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_B, size, arrayList, arrayList2);
        }
    }

    private void W0(PassPaymentDao.PassPaymentRequest passPaymentRequest) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) PaymentActivity.class);
        intent.putExtra("PAYMENT_TYPE", i.PAYMENT_DEFAULT);
        intent.putExtra("PAYMENT_REQUEST", passPaymentRequest);
        intent.putExtra("IS_POINT_STEP", true);
        intent.putExtra("RECEIVED_AMOUNT", N.getInteger(passPaymentRequest.getH_rcvd_prc()));
        intent.putExtra("DISCOUNT_AMOUNT", 0);
        intent.putExtra("DISABLE_DISCOUNT_POINT", L0().equals("0007"));
        startActivity(intent);
    }

    private void X0() {
        V4.a aVar = new V4.a(this);
        this.f27617u = aVar;
        aVar.setVisibility(8);
        this.f27612p.addView(this.f27617u);
    }

    private void Y0() {
        StationSearch stationSearch = (StationSearch) findViewById(AbstractC5955f.ss_a_pass_booking_benefit_station);
        this.f27618v = stationSearch;
        stationSearch.setHideEventListener(this);
        this.f27617u.setHeaderClickListener(this);
        this.f27618v.setOnChangeStationListener(new StationSearch.e() { // from class: O4.j
            @Override // com.korail.talk.ui.booking.option.station.StationSearch.e
            public final void onChangeStation(StationNameData stationNameData) throws Resources.NotFoundException {
                this.f3436a.R0(stationNameData);
            }
        });
    }

    private void Z0() {
        R4.b bVar = new R4.b(this);
        this.f27615s = bVar;
        bVar.setICompanionView(this);
        this.f27615s.setVisibility(8);
        this.f27612p.addView(this.f27615s);
    }

    private void a1() {
        this.f27606j = (DiscountMenuDao.DiscountMenu) getIntent().getSerializableExtra("DISCOUNT_MENU_DATA");
        this.f27607k = ((DiscountMenuDao.PassPeriodInfo) K0().get(0)).getH_cmtr_utl_trm_cd();
        int age = C6634h.getAge();
        for (DiscountMenuDao.PassAgeInfo passAgeInfo : I0()) {
            if (N.getInteger(passAgeInfo.getH_min_age()) <= age && N.getInteger(passAgeInfo.getH_max_age()) >= age) {
                this.f27608l = passAgeInfo.getH_cmtr_utl_age_cd();
                return;
            }
        }
    }

    private void b1() {
        com.korail.talk.ui.booking.option.date.a aVar = new com.korail.talk.ui.booking.option.date.a(this);
        this.f27616t = aVar;
        this.f27612p.addView(aVar);
        List listK0 = K0();
        String[] strArr = new String[listK0.size()];
        for (int i8 = 0; i8 < listK0.size(); i8++) {
            strArr[i8] = ((DiscountMenuDao.PassPeriodInfo) listK0.get(i8)).getH_comn_cd_nm();
        }
        this.f27616t.setPass(true);
        this.f27616t.setPassDate(strArr);
        this.f27616t.setHeaderSummary(getString(AbstractC5959j.comm_pass_warning_use_period));
        this.f27616t.setSelectDateMsg(getString(AbstractC5959j.booking_departure_date));
        this.f27616t.setOnChangeRadioButtonListener(new a.e() { // from class: O4.h
            @Override // com.korail.talk.ui.booking.option.date.a.e
            public final void onChangeRadioButton(int i9) {
                this.f3434a.S0(i9);
            }
        });
    }

    private void c1() {
        this.f27619w.setOnClickListener(this);
        for (int i8 = 0; i8 < this.f27612p.getChildCount(); i8++) {
            View childAt = this.f27612p.getChildAt(i8);
            if (childAt instanceof C6550j) {
                ((C6550j) childAt).setHeaderClickListener(this);
            }
        }
    }

    private void d1() {
        T4.a aVar = new T4.a(this);
        this.f27614r = aVar;
        this.f27612p.addView(aVar);
        this.f27614r.setOnChangePersonInfoListener(new c.a() { // from class: O4.a
            @Override // T4.c.a
            public final void onChangePersonInfo(Bundle bundle, int i8, String str) {
                this.f3425a.T0(bundle, i8, str);
            }
        });
    }

    private void e1() {
        m0();
        this.f27612p = (ViewGroup) findViewById(AbstractC5955f.v_a_pass_booking);
        this.f27613q = (ScrollView) findViewById(AbstractC5955f.sv_a_pass_booking);
        this.f27619w = (Button) findViewById(AbstractC5955f.btn_a_pass_booking_payment);
        d1();
        b1();
        X0();
        Y0();
        Z0();
    }

    private void f1() {
        String agree = this.f27606j.getAgree();
        if (N.isNull(agree)) {
            E0(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_A);
        } else {
            C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(agree).setButtonListener(new DialogInterface.OnClickListener() { // from class: O4.i
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f3435a.U0(dialogInterface, i8);
                }
            }).showDialog();
        }
    }

    private void g1() throws Resources.NotFoundException {
        if (this.f27618v.getVisibility() != 0) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(getApplicationContext(), AbstractC5951b.bottom_view_slide_up);
            this.f27617u.findViewById(AbstractC5955f.foldImg).setVisibility(4);
            this.f27618v.setVisibility(0);
            animationLoadAnimation.setAnimationListener(new a());
            this.f27618v.startAnimation(animationLoadAnimation);
        }
    }

    private void h1() {
        C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.dialog_period_notice, this.f27606j.getTitle(), this.f27616t.getSelectedDay("yyyy.MM.dd"))).setButtonListener(new DialogInterface.OnClickListener() { // from class: O4.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f3433a.V0(dialogInterface, i8);
            }
        }).showDialog();
    }

    private void setText() {
        setAppTitle(this.f27606j.getTitle());
    }

    public void hideBenefitStationSelectView() throws Resources.NotFoundException {
        if (this.f27618v.getVisibility() != 8) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(getApplicationContext(), AbstractC5951b.bottom_view_slide_down);
            this.f27617u.findViewById(AbstractC5955f.foldImg).setVisibility(0);
            animationLoadAnimation.setAnimationListener(new b());
            this.f27618v.startAnimation(animationLoadAnimation);
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, com.korail.talk.view.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() throws Resources.NotFoundException {
        if (C6630d.isNotNull(this.f27618v) && this.f27618v.getVisibility() == 0) {
            hideBenefitStationSelectView();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.btn_a_pass_booking_payment != view.getId()) {
            super.onClick(view);
        } else if (this.f27615s.isValid()) {
            h1();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_a_pass_booking);
        if (C6630d.isNull(bundle)) {
            a1();
            e1();
            setText();
            c1();
            f1();
        }
    }

    @Override // v4.g
    public void onOptionHeaderClick(C6550j c6550j, boolean z8) throws Resources.NotFoundException {
        if (C6630d.isNotNull(c6550j)) {
            t.e("v : " + c6550j);
            if (!(c6550j instanceof V4.a)) {
                scrollToOption(c6550j);
            } else if (z8) {
                g1();
            } else {
                hideBenefitStationSelectView();
            }
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        int i8 = 0;
        if (AbstractC5955f.dao_cmtr_info == id) {
            CmtrInfoDao.CmtrInfoRequest cmtrInfoRequest = (CmtrInfoDao.CmtrInfoRequest) iBaseDao.getRequest();
            CmtrInfoDao.CmtrInfoResponse cmtrInfoResponse = (CmtrInfoDao.CmtrInfoResponse) iBaseDao.getResponse();
            if (!CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_A.equals(cmtrInfoRequest.getJobDvCd())) {
                H0(cmtrInfoResponse.getCmtrKndCd(), cmtrInfoResponse.getCmtrUtlAgeCd());
                return;
            }
            this.f27611o = cmtrInfoResponse;
            this.f27614r.init(cmtrInfoRequest.getJobDvCd(), this.f27611o);
            if ("Y".equals(this.f27611o.getAddSrvGdFlg())) {
                this.f27617u.setVisibility(0);
                if (C6630d.isNotNull(this.f27611o.getPrmoMsg())) {
                    this.f27617u.setEventMsg(cmtrInfoResponse.getPrmoMsg());
                    this.f27617u.setEventUrl(cmtrInfoResponse.getPrmoUrl());
                }
            } else {
                this.f27619w.setEnabled(true);
            }
            if (cmtrInfoResponse.getPoppMsg().isEmpty()) {
                G0();
                return;
            } else {
                C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(cmtrInfoResponse.getPoppMsg()).setButtonListener(new DialogInterface.OnClickListener() { // from class: O4.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i9) {
                        this.f3426a.M0(dialogInterface, i9);
                    }
                }).showDialog();
                return;
            }
        }
        if (AbstractC5955f.dao_enable_date == id) {
            EnableDateDao.EnableDateResponse enableDateResponse = (EnableDateDao.EnableDateResponse) iBaseDao.getResponse();
            List<EnableDateDao.PassInfo> pass_info = enableDateResponse.getPass_info();
            if (C6630d.isNull(pass_info) || pass_info.size() == 0) {
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.comm_pass_disable_buy)).setButtonListener(new DialogInterface.OnClickListener() { // from class: O4.c
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i9) {
                        this.f3427a.N0(dialogInterface, i9);
                    }
                }).showDialog();
            } else {
                String[] strArr = new String[pass_info.size()];
                while (i8 < pass_info.size()) {
                    strArr[i8] = pass_info.get(i8).getH_use_open_dt();
                    i8++;
                }
                this.f27616t.setDate(strArr);
            }
            if (this.f27617u.getVisibility() == 0) {
                List<EnableDateDao.WctInfo> wct_info = enableDateResponse.getWct_info();
                this.f27609m = wct_info;
                this.f27618v.setBenefitStationsData(M.getWctInfoList(wct_info));
            }
            this.f27605i = true;
            return;
        }
        if (AbstractC5955f.dao_pass_reservation == id) {
            try {
                PassReservationDao.MainInfo main_info = ((PassReservationDao.PassReservationResponse) iBaseDao.getResponse()).getMain_info();
                PassPaymentDao.PassPaymentRequest passPaymentRequest = new PassPaymentDao().new PassPaymentRequest();
                passPaymentRequest.setH_rcvd_prc(main_info.getH_rcvd_amt());
                passPaymentRequest.setPassPaymentMap(C6625A.convertObjectToMap(main_info));
                ArrayList<R4.a> companionData = this.f27615s.getCompanionData();
                if (!companionData.isEmpty()) {
                    HashMap<String, String> map = new HashMap<>();
                    map.put("h_cmpa_cnt", String.valueOf(companionData.size()));
                    while (i8 < companionData.size()) {
                        R4.a aVar = companionData.get(i8);
                        map.put("h_cmpa_nm_" + i8, aVar.getCompanionName());
                        map.put("h_cmpa_btdt_" + i8, aVar.getCompanionBirthDate());
                        map.put("h_cmpa_sex_dv_cd_" + i8, aVar.getGender());
                        i8++;
                    }
                    passPaymentRequest.setHashMap(map);
                }
                if (N.isNotNull(this.f27610n)) {
                    passPaymentRequest.setHidWctNo(this.f27610n);
                }
                W0(passPaymentRequest);
            } catch (Exception e8) {
                t.e(e8.getMessage());
            }
        }
    }

    @Override // R4.b.a
    public void scrollToBottom() {
        if (this.f27605i) {
            this.f27613q.post(new Runnable() { // from class: O4.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3428a.O0();
                }
            });
        }
    }

    public void scrollToOption(final View view) {
        this.f27613q.post(new Runnable() { // from class: O4.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f3431a.P0(view);
            }
        });
    }

    @Override // R4.b.a
    public void scrollToView(final int i8) {
        this.f27613q.post(new Runnable() { // from class: O4.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f3429a.Q0(i8);
            }
        });
    }
}
