package com.korail.talk.ui.booking.discountBooking.commutation;

import T4.l;
import V4.b;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.tabs.TabLayout;
import com.h2osystech.smartalimi.aidllib.MSGVo;
import com.korail.talk.data.StationNameData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.pass.DiscountMenuDao;
import com.korail.talk.network.dao.pass.EnableDateDao;
import com.korail.talk.network.dao.pass.EnableDateDao.EnableDateRequest;
import com.korail.talk.network.dao.push.CmtrKndMenuDao;
import com.korail.talk.network.dao.push.CmtrKndMenuDao.CmtrKndMenuRequest;
import com.korail.talk.ui.booking.option.station.StationSearch;
import com.korail.talk.view.CTabLayout;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import n4.AbstractC5951b;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import org.json.JSONException;
import org.json.JSONObject;
import q4.C6111b;
import v4.g;
import y6.C6550j;
import z4.C6630d;
import z4.C6634h;
import z4.C6637k;
import z4.M;
import z4.N;
import z4.q;

/* loaded from: classes.dex */
public abstract class a extends BaseViewActivity implements g {

    /* renamed from: i, reason: collision with root package name */
    protected DiscountMenuDao.DiscountMenu f27578i;

    /* renamed from: j, reason: collision with root package name */
    protected String f27579j;

    /* renamed from: k, reason: collision with root package name */
    protected String f27580k;

    /* renamed from: l, reason: collision with root package name */
    protected String f27581l;

    /* renamed from: m, reason: collision with root package name */
    protected MSGVo f27582m;

    /* renamed from: n, reason: collision with root package name */
    protected ViewGroup f27583n;

    /* renamed from: o, reason: collision with root package name */
    private NestedScrollView f27584o;

    /* renamed from: p, reason: collision with root package name */
    protected CTabLayout f27585p;

    /* renamed from: q, reason: collision with root package name */
    protected V4.b f27586q;

    /* renamed from: r, reason: collision with root package name */
    protected Button f27587r;

    /* renamed from: s, reason: collision with root package name */
    private StationSearch f27588s;

    /* renamed from: com.korail.talk.ui.booking.discountBooking.commutation.a$a, reason: collision with other inner class name */
    class C0235a implements TabLayout.d {
        C0235a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.d, com.google.android.material.tabs.TabLayout.c
        public void onTabReselected(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.d, com.google.android.material.tabs.TabLayout.c
        public void onTabSelected(TabLayout.g gVar) {
            a aVar = a.this;
            aVar.R0(aVar.f27586q.getStartStationNm(), a.this.f27586q.getArrivalStationNm());
        }

        @Override // com.google.android.material.tabs.TabLayout.d, com.google.android.material.tabs.TabLayout.c
        public void onTabUnselected(TabLayout.g gVar) {
        }
    }

    class b implements Animation.AnimationListener {
        b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            a.this.scrollToTop();
        }
    }

    class c implements Animation.AnimationListener {
        c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            a.this.f27588s.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    private void A0() {
        try {
            JSONObject jSONObject = new JSONObject(this.f27582m.getParam());
            CmtrKndMenuDao cmtrKndMenuDao = new CmtrKndMenuDao();
            CmtrKndMenuDao.CmtrKndMenuRequest cmtrKndMenuRequest = cmtrKndMenuDao.new CmtrKndMenuRequest();
            cmtrKndMenuRequest.setCmtrKndCd(jSONObject.getString("CMTR_KND_CD"));
            cmtrKndMenuDao.setRequest(cmtrKndMenuRequest);
            executeDao(cmtrKndMenuDao);
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
    }

    private void B0() {
        EnableDateDao enableDateDao = new EnableDateDao();
        EnableDateDao.EnableDateRequest enableDateRequest = enableDateDao.new EnableDateRequest();
        enableDateRequest.setTxtCmtrKndCd(F0());
        enableDateRequest.setTxtCmtrUtlTrmCd(this.f27579j);
        enableDateRequest.setTxtCmtrUtlAgeCd(this.f27581l);
        enableDateDao.setRequest(enableDateRequest);
        enableDateDao.setFinishView(true);
        enableDateDao.setLoadingCancelable(false);
        executeDao(enableDateDao);
    }

    private void G0() throws Resources.NotFoundException {
        if (this.f27588s.getVisibility() != 8) {
            this.f27586q.unSelectStation();
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(getApplicationContext(), AbstractC5951b.bottom_view_slide_down);
            animationLoadAnimation.setAnimationListener(new c());
            this.f27588s.startAnimation(animationLoadAnimation);
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(findViewById(AbstractC5955f.v_commutation_booking_contents), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, 0.0f));
            objectAnimatorOfPropertyValuesHolder.setDuration(300L);
            objectAnimatorOfPropertyValuesHolder.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H0(View view) {
        this.f27584o.smoothScrollTo(0, view.getTop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0() {
        this.f27584o.scrollTo(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0() {
        R0(this.f27586q.getArrivalStationNm(), this.f27586q.getStartStationNm());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0(StationNameData stationNameData) throws Resources.NotFoundException {
        R0(N.isNull(stationNameData.getDepartureStationName()) ? this.f27586q.getStartStationNm() : stationNameData.getDepartureStationName(), N.isNull(stationNameData.getArrivalStationName()) ? this.f27586q.getArrivalStationNm() : stationNameData.getArrivalStationName());
        O(this.f27588s);
        G0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0(DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            finish();
        } else if (102 == i8) {
            B0();
        }
    }

    private void M0() {
        if (getIntent().hasExtra("DISCOUNT_MENU_DATA")) {
            this.f27578i = (DiscountMenuDao.DiscountMenu) getIntent().getSerializableExtra("DISCOUNT_MENU_DATA");
        }
        List listC0 = C0();
        this.f27579j = ((DiscountMenuDao.PassPeriodInfo) listC0.get(0)).getH_cmtr_utl_trm_cd();
        this.f27580k = ((DiscountMenuDao.PassPeriodInfo) listC0.get(0)).getH_comn_cd_nm();
        int age = C6634h.getAge();
        for (DiscountMenuDao.PassAgeInfo passAgeInfo : D0()) {
            if (N.getInteger(passAgeInfo.getH_min_age()) <= age && N.getInteger(passAgeInfo.getH_max_age()) >= age) {
                this.f27581l = passAgeInfo.getH_cmtr_utl_age_cd();
                return;
            }
        }
    }

    private void O0() {
        this.f27587r.setOnClickListener(this);
        for (int i8 = 0; i8 < this.f27583n.getChildCount(); i8++) {
            View childAt = this.f27583n.getChildAt(i8);
            if (childAt instanceof C6550j) {
                ((C6550j) childAt).setHeaderClickListener(this);
            }
        }
    }

    private void P0() {
        l lVar = new l(this);
        this.f27583n.addView(lVar);
        List listD0 = D0();
        String[] strArr = new String[listD0.size()];
        for (int i8 = 0; i8 < listD0.size(); i8++) {
            strArr[i8] = ((DiscountMenuDao.PassAgeInfo) listD0.get(i8)).getH_comn_cd_nm();
        }
        lVar.setEntries(strArr);
        if (listD0.size() <= 1) {
            return;
        }
        int age = C6634h.getAge();
        for (int i9 = 0; i9 < listD0.size(); i9++) {
            DiscountMenuDao.PassAgeInfo passAgeInfo = (DiscountMenuDao.PassAgeInfo) listD0.get(i9);
            if (N.getInteger(passAgeInfo.getH_min_age()) > age || N.getInteger(passAgeInfo.getH_max_age()) < age) {
                lVar.disableSelect(i9);
            } else {
                lVar.select(i9);
            }
        }
    }

    private void Q0() {
        V4.b bVar = new V4.b(this);
        this.f27586q = bVar;
        this.f27583n.addView(bVar);
        String[] stationNm = M.getStationNm();
        R0(stationNm[0], stationNm[1]);
        this.f27586q.setOnReverseStationsListener(new b.a() { // from class: M4.e
            @Override // V4.b.a
            public final void onReverseStation() {
                this.f3141a.J0();
            }
        });
    }

    private void S0() {
        StationSearch stationSearch = (StationSearch) findViewById(AbstractC5955f.ss_commutation_booking_station);
        this.f27588s = stationSearch;
        stationSearch.setHideEventListener(this);
        this.f27588s.setOnChangeStationListener(new StationSearch.e() { // from class: M4.a
            @Override // com.korail.talk.ui.booking.option.station.StationSearch.e
            public final void onChangeStation(StationNameData stationNameData) throws Resources.NotFoundException {
                this.f3136a.K0(stationNameData);
            }
        });
    }

    private void U0() {
        String agree = this.f27578i.getAgree();
        if (N.isNull(agree)) {
            B0();
        } else {
            C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(agree).setButtonListener(new DialogInterface.OnClickListener() { // from class: M4.d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f3140a.L0(dialogInterface, i8);
                }
            }).showDialog();
        }
    }

    private void q() {
        M0();
        T0();
        setText();
        O0();
        U0();
    }

    private void scrollToOption(final View view) {
        if (C6630d.isNotNull(view)) {
            this.f27584o.post(new Runnable() { // from class: M4.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3138a.H0(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scrollToTop() {
        this.f27584o.post(new Runnable() { // from class: M4.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f3137a.I0();
            }
        });
    }

    private void setText() {
        setAppTitle(this.f27578i.getTitle());
    }

    private void showStationSearch(StationSearch.c cVar) throws Resources.NotFoundException {
        this.f27588s.initSearchEdit();
        this.f27588s.setStartArrivalType(cVar);
        if (this.f27588s.getVisibility() != 0) {
            this.f27588s.setVisibility(0);
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(getApplicationContext(), AbstractC5951b.bottom_view_slide_up);
            animationLoadAnimation.setAnimationListener(new b());
            this.f27588s.startAnimation(animationLoadAnimation);
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(findViewById(AbstractC5955f.v_commutation_booking_contents), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, -this.f27585p.getHeight()));
            objectAnimatorOfPropertyValuesHolder.setDuration(300L);
            objectAnimatorOfPropertyValuesHolder.start();
        }
    }

    protected List C0() {
        return E0().getPass_periodinfo();
    }

    protected List D0() {
        return E0().getPass_ageinfo();
    }

    protected DiscountMenuDao.PassMainInfo E0() {
        return this.f27578i.getPassData();
    }

    protected String F0() {
        return E0().getH_cmtr_knd_cd();
    }

    protected abstract void N0();

    protected void R0(String str, String str2) {
        this.f27586q.setStationInfo(str, str2, this.f27585p.getSelectedTabPosition() == 0 ? 0 : 1, 8);
    }

    protected void T0() {
        m0();
        this.f27583n = (ViewGroup) findViewById(AbstractC5955f.v_commutation_booking);
        this.f27584o = (NestedScrollView) findViewById(AbstractC5955f.sv_commutation_booking);
        this.f27587r = (Button) findViewById(AbstractC5955f.btn_commutation_booking_inquiry);
        CTabLayout cTabLayout = (CTabLayout) findViewById(AbstractC5955f.tl_commutation_booking);
        this.f27585p = cTabLayout;
        cTabLayout.setVisibility(0);
        this.f27585p.addOnTabSelectedListener((TabLayout.d) new C0235a());
        Q0();
        S0();
        N0();
        P0();
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, com.korail.talk.view.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() throws Resources.NotFoundException {
        if (C6630d.isNotNull(this.f27588s) && this.f27588s.getVisibility() == 0) {
            G0();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        O(view);
        if (AbstractC5955f.v_station_search != view.getId()) {
            super.onClick(view);
        } else if (C6630d.isNotNull(this.f27588s) && this.f27588s.getVisibility() == 0) {
            G0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_commutation_booking);
        if (C6630d.isNull(bundle)) {
            if (!getIntent().hasExtra("msg_vo")) {
                q();
            } else {
                this.f27582m = (MSGVo) getIntent().getParcelableExtra("msg_vo");
                A0();
            }
        }
    }

    @Override // v4.g
    public void onOptionHeaderClick(C6550j c6550j, boolean z8) throws Resources.NotFoundException {
        if (C6630d.isNotNull(c6550j)) {
            if (c6550j instanceof V4.b) {
                showStationSearch(((V4.b) c6550j).isDepartureSelected() ? StationSearch.c.START : StationSearch.c.ARRIVAL);
            } else {
                scrollToOption(c6550j);
            }
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_cmtrknd_info == iBaseDao.getId()) {
            this.f27578i = (DiscountMenuDao.DiscountMenu) q.fromJson(q.toJson((CmtrKndMenuDao.CmtrKndMenuResponse) iBaseDao.getResponse()), DiscountMenuDao.DiscountMenu.class);
            q();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onResume() throws Resources.NotFoundException {
        if (C6630d.isNotNull(this.f27588s)) {
            this.f27588s.refreshList();
        }
        super.onResume();
    }

    protected void z0() {
        try {
            JSONObject jSONObject = new JSONObject(this.f27582m.getParam());
            this.f27586q.setStationNm(C6111b.getInstance().getStationNameByCode(jSONObject.getString("FST_DPT_RS_STN_CD")), C6111b.getInstance().getStationNameByCode(jSONObject.getString("LAST_ARV_RS_STN_CD")));
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
    }
}
