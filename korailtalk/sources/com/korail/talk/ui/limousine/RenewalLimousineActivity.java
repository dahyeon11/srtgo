package com.korail.talk.ui.limousine;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r;
import com.google.android.material.tabs.TabLayout;
import com.korail.talk.data.CalendarData;
import com.korail.talk.data.StationNameData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.common.CommonCodeDao;
import com.korail.talk.network.dao.common.CommonCodeDao.CommonCodeRequest;
import com.korail.talk.network.request.inquiry.RsvInquiryRequest;
import com.korail.talk.network.request.inquiry.TrainInquiryRequest;
import com.korail.talk.network.request.reservation.ReservationRequest;
import com.korail.talk.ui.booking.option.station.StationSearch;
import com.korail.talk.ui.inquiry.rir.orr.DirectInquiryActivity;
import com.korail.talk.ui.inquiry.rir.orr.TransferInquiryActivity;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import com.korail.talk.view.CTabLayout;
import com.korail.talk.view.CustomViewPager;
import com.korail.talk.view.base.BaseViewActivity;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import n4.AbstractC5951b;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import p5.InterfaceC6055a;
import p5.InterfaceC6056b;
import p5.h;
import p5.l;
import p5.n;
import r4.EnumC6175b;
import r4.d;
import r4.g;
import z4.C6630d;
import z4.C6637k;
import z4.M;

/* loaded from: classes.dex */
public class RenewalLimousineActivity extends BaseViewActivity implements InterfaceC6056b, StationSearch.e {

    /* renamed from: i, reason: collision with root package name */
    private String[] f28140i;

    /* renamed from: j, reason: collision with root package name */
    private CTabLayout f28141j;

    /* renamed from: k, reason: collision with root package name */
    private CustomViewPager f28142k;

    /* renamed from: l, reason: collision with root package name */
    private c f28143l;

    /* renamed from: m, reason: collision with root package name */
    private TextView f28144m;

    /* renamed from: n, reason: collision with root package name */
    private StationSearch f28145n;

    /* renamed from: o, reason: collision with root package name */
    private Button f28146o;

    class a implements TabLayout.d {
        a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.d, com.google.android.material.tabs.TabLayout.c
        public void onTabReselected(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.d, com.google.android.material.tabs.TabLayout.c
        public void onTabSelected(TabLayout.g gVar) {
            RenewalLimousineActivity.this.f28146o.setEnabled(true);
            ((h) RenewalLimousineActivity.this.f28143l.getItem(gVar.getPosition())).initPassengerDataChange();
            RenewalLimousineActivity.this.f28146o.setText(RenewalLimousineActivity.this.getText(gVar.getPosition() == 0 ? AbstractC5959j.limousine_inquiry : AbstractC5959j.limousine_train_inquiry));
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
            RenewalLimousineActivity.this.f28145n.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    private class c extends r {

        /* renamed from: h, reason: collision with root package name */
        private final Fragment[] f28149h;

        /* synthetic */ c(RenewalLimousineActivity renewalLimousineActivity, FragmentManager fragmentManager, a aVar) {
            this(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return RenewalLimousineActivity.this.f28140i.length;
        }

        @Override // androidx.fragment.app.r
        public Fragment getItem(int i8) {
            return this.f28149h[i8];
        }

        @Override // androidx.viewpager.widget.a
        public CharSequence getPageTitle(int i8) {
            return RenewalLimousineActivity.this.f28140i[i8];
        }

        private c(FragmentManager fragmentManager) {
            super(fragmentManager, 1);
            this.f28149h = new Fragment[]{n.newInstance(), l.newInstance()};
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.korail.talk.network.request.inquiry.RsvInquiryRequest[], java.io.Serializable] */
    private void A0(String str) {
        Context applicationContext = getApplicationContext();
        d dVar = d.DIRECT_SQ_NO;
        Intent intent = new Intent(applicationContext, (Class<?>) (dVar.getCode().equals(str) ? DirectInquiryActivity.class : TransferInquiryActivity.class));
        intent.putExtra("IS_DIRECT", dVar.getCode().equals(str));
        intent.putExtra("RESERVATION_TYPE", r4.c.RSV_DEFAULT);
        intent.putExtra("MENU_TYPE", EnumC6175b.THEME_FAMILY);
        intent.putExtra("IS_TRANSFER", false);
        intent.putExtra("INQUIRY_REQUEST", (Serializable) y0(str));
        intent.putExtra("RESERVATION_REQUEST", z0());
        startActivityForResult(intent, 117);
    }

    private void B0(String str) {
        A0(str);
    }

    private void C0() {
        this.f28140i = getResources().getStringArray(AbstractC5952c.limousine_booking);
    }

    private void D0() {
        this.f28145n.setOnChangeStationListener(this);
        this.f28145n.setHideEventListener(this);
        findViewById(AbstractC5955f.iv_limousine_info).setOnClickListener(this);
        this.f28146o.setOnClickListener(this);
    }

    private void E0() throws Resources.NotFoundException {
        m0();
        this.f28142k = (CustomViewPager) findViewById(AbstractC5955f.vp_Limousine_booking);
        c cVar = new c(this, getSupportFragmentManager(), null);
        this.f28143l = cVar;
        this.f28142k.setAdapter(cVar);
        this.f28142k.setSwipeEnabled(false);
        CTabLayout cTabLayout = (CTabLayout) findViewById(AbstractC5955f.tl_limousine_booking);
        this.f28141j = cTabLayout;
        cTabLayout.setupWithViewPager(this.f28142k);
        this.f28141j.addOnTabSelectedListener((TabLayout.d) new a());
        this.f28144m = (TextView) findViewById(AbstractC5955f.tv_limousine_msg);
        this.f28145n = (StationSearch) findViewById(AbstractC5955f.ss_limousine_booking);
        this.f28146o = (Button) findViewById(AbstractC5955f.btn_limousine_inquiry);
    }

    private void F0() {
        V4.b routeOption = x0().getRouteOption();
        String startStationNm = routeOption.getStartStationNm();
        String arrivalStationNm = routeOption.getArrivalStationNm();
        if (M.isLimousineTerminal(startStationNm) || M.isLimousineTerminal(arrivalStationNm)) {
            G0();
        } else {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.common_no_limousine_station)).showDialog();
        }
    }

    private void G0() {
        V4.b routeOption = x0().getRouteOption();
        String startStationNm = routeOption.getStartStationNm();
        String arrivalStationNm = routeOption.getArrivalStationNm();
        if (startStationNm.equals(arrivalStationNm) || (M.isShuttleBus(startStationNm) && M.isShuttleBus(arrivalStationNm))) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.common_start_arrival_equal)).showDialog();
        } else {
            B0((this.f28142k.getCurrentItem() == 0 ? d.DIRECT_SQ_NO : d.TRANSFER_SQ_NO).getCode());
        }
    }

    private void setText() {
        setAppTitle(AbstractC5959j.drawer_menu_limousine_booking);
    }

    private void w0() {
        CommonCodeDao commonCodeDao = new CommonCodeDao();
        CommonCodeDao.CommonCodeRequest commonCodeRequest = commonCodeDao.new CommonCodeRequest();
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommonCodeDao.STATION_NM);
        arrayList.add(CommonCodeDao.STATION_CD);
        arrayList.add(CommonCodeDao.LIMOUSINE_MSG);
        commonCodeRequest.setCodeList(arrayList);
        commonCodeDao.setRequest(commonCodeRequest);
        commonCodeDao.setPending(true);
        executeDao(commonCodeDao);
    }

    private InterfaceC6055a x0() {
        return (InterfaceC6055a) this.f28143l.getItem(this.f28142k.getCurrentItem());
    }

    private RsvInquiryRequest[] y0(String str) {
        InterfaceC6055a interfaceC6055aX0 = x0();
        V4.b routeOption = interfaceC6055aX0.getRouteOption();
        com.korail.talk.ui.booking.option.date.a departureDateOption = interfaceC6055aX0.getDepartureDateOption();
        T4.d passengerAgeSeatCountOption = interfaceC6055aX0.getPassengerAgeSeatCountOption();
        TrainInquiryRequest[] trainInquiryRequestArr = {new TrainInquiryRequest()};
        B4.b.getRsvInquiryRequest(getApplicationContext(), trainInquiryRequestArr, routeOption, departureDateOption, passengerAgeSeatCountOption, str, null);
        return trainInquiryRequestArr;
    }

    private ReservationRequest z0() {
        return D4.a.getOReservationRequest(x0().getPassengerAgeSeatCountOption());
    }

    @Override // p5.InterfaceC6056b
    public void hideStationSearch() throws Resources.NotFoundException {
        if (this.f28145n.getVisibility() == 0) {
            x0().unSelectStation();
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(getApplicationContext(), AbstractC5951b.bottom_view_slide_down);
            animationLoadAnimation.setAnimationListener(new b());
            this.f28145n.startAnimation(animationLoadAnimation);
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(findViewById(AbstractC5955f.v_main_booking_content), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, 0.0f));
            objectAnimatorOfPropertyValuesHolder.setDuration(300L);
            objectAnimatorOfPropertyValuesHolder.start();
            O(this.f28145n);
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, com.korail.talk.view.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() throws Resources.NotFoundException {
        if (C6630d.isNotNull(this.f28145n) && this.f28145n.getVisibility() == 0) {
            hideStationSearch();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.korail.talk.ui.booking.option.station.StationSearch.e
    public void onChangeStation(StationNameData stationNameData) throws Resources.NotFoundException {
        x0().setStationNm(stationNameData.getDepartureStationName(), stationNameData.getArrivalStationName());
        hideStationSearch();
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) throws Resources.NotFoundException {
        O(view);
        int id = view.getId();
        if (AbstractC5955f.v_station_search == id) {
            hideStationSearch();
            return;
        }
        if (AbstractC5955f.iv_limousine_info == id) {
            Intent intent = new Intent(getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
            intent.putExtra("WEB_POST_URL", g.LIMOUSINE_INFORMATION_URL);
            startActivity(intent);
        } else if (AbstractC5955f.btn_limousine_inquiry == id) {
            F0();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_renewal_limousin);
        if (C6630d.isNull(bundle)) {
            C0();
            E0();
            setText();
            D0();
            w0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_common_code == iBaseDao.getId()) {
            CommonCodeDao.CommonCodeResponse commonCodeResponse = (CommonCodeDao.CommonCodeResponse) iBaseDao.getResponse();
            this.f28144m.setText(commonCodeResponse.getLimousineMsg());
            ((n) this.f28143l.getItem(0)).setLimousineStation(commonCodeResponse);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onResume() throws Resources.NotFoundException {
        if (C6630d.isNotNull(this.f28145n)) {
            this.f28145n.refreshList();
        }
        super.onResume();
    }

    @Override // p5.InterfaceC6056b
    public void setDate(CalendarData calendarData) {
        for (int i8 = 0; i8 < this.f28143l.getCount(); i8++) {
            if (i8 != this.f28142k.getCurrentItem()) {
                ((InterfaceC6055a) this.f28143l.getItem(i8)).setDate(calendarData);
            }
        }
    }

    @Override // p5.InterfaceC6056b
    public void setPassengerData(Bundle bundle) {
        this.f28146o.setEnabled(bundle.getInt("TOTAL_PERSON_COUNT") > 0);
    }

    @Override // p5.InterfaceC6056b
    public void showStationSearch(StationSearch.c cVar) {
        this.f28145n.initSearchEdit();
        this.f28145n.setStartArrivalType(cVar);
        if (this.f28145n.getVisibility() == 8) {
            this.f28145n.setVisibility(0);
            this.f28145n.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), AbstractC5951b.bottom_view_slide_up));
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(findViewById(AbstractC5955f.v_main_booking_content), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, -this.f28141j.getHeight()));
            objectAnimatorOfPropertyValuesHolder.setDuration(300L);
            objectAnimatorOfPropertyValuesHolder.start();
        }
    }
}
