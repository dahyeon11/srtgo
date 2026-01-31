package com.korail.talk.ui.booking.seatAssign;

import Y4.g;
import Y4.l;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r;
import com.korail.talk.data.CalendarData;
import com.korail.talk.data.SeatAssignData;
import com.korail.talk.data.StationNameData;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.refund.TicketDetailDao;
import com.korail.talk.network.dao.refund.TicketDetailDao.TicketDetailRequest;
import com.korail.talk.network.dao.reservation.SeatAssignReservationDao;
import com.korail.talk.network.request.reservation.ReservationRequest;
import com.korail.talk.ui.booking.option.station.StationSearch;
import com.korail.talk.ui.inquiry.sasv.orr.NCardDirectInquiryActivity;
import com.korail.talk.ui.inquiry.sasv.sar.APassDirectInquiryActivity;
import com.korail.talk.ui.inquiry.sasv.sar.CommutationDirectInquiryActivity;
import com.korail.talk.view.CTabLayout;
import com.korail.talk.view.CustomViewPager;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import n4.AbstractC5951b;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import r4.p;
import r4.s;
import z4.C6630d;
import z4.t;

/* loaded from: classes.dex */
public class SeatAssignBookingActivity extends BaseViewActivity implements Y4.a, StationSearch.e {

    /* renamed from: i, reason: collision with root package name */
    private TicketDetailDao.TicketDetailResponse f27915i;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f27916j;

    /* renamed from: k, reason: collision with root package name */
    private CTabLayout f27917k;

    /* renamed from: l, reason: collision with root package name */
    private CustomViewPager f27918l;

    /* renamed from: m, reason: collision with root package name */
    private d f27919m;

    /* renamed from: n, reason: collision with root package name */
    private Button f27920n;

    /* renamed from: o, reason: collision with root package name */
    private StationSearch f27921o;

    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SeatAssignBookingActivity.this.f27921o.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    private class b implements H4.a {

        /* renamed from: a, reason: collision with root package name */
        private Class f27923a;

        /* renamed from: b, reason: collision with root package name */
        private BaseRequest f27924b;

        /* renamed from: c, reason: collision with root package name */
        private SeatAssignData f27925c;

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Class d() {
            return this.f27923a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public BaseRequest e() {
            BaseRequest baseRequest = this.f27924b;
            return baseRequest instanceof ReservationRequest ? (ReservationRequest) baseRequest : (SeatAssignReservationDao.SeatAssignReservationRequest) baseRequest;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SeatAssignData f() {
            t.e("MenuId : " + this.f27925c.getMenuId() + ", SeatAttCd1 : " + this.f27925c.getSeatAttCd1() + ", TrnGpCd : " + this.f27925c.getTrnGpCd());
            return this.f27925c;
        }

        @Override // H4.a
        public /* bridge */ /* synthetic */ void callTicketKind(TicketDetailDao.TicketDetailResponse ticketDetailResponse) {
            super.callTicketKind(ticketDetailResponse);
        }

        @Override // H4.a
        public void setCommutationTicket(int i8) {
            int passengerCount = SeatAssignBookingActivity.this.A0().getPassengerCount();
            Y4.b bVar = (Y4.b) SeatAssignBookingActivity.this.f27919m.getItem(SeatAssignBookingActivity.this.f27918l.getCurrentItem());
            List<TicketDetailDao.TicketInfo> ticket_info = SeatAssignBookingActivity.this.f27915i.getTicket_infos().getTicket_info();
            this.f27923a = CommutationDirectInquiryActivity.class;
            SeatAssignData seatAssignData = bVar.getSeatAssignData();
            this.f27925c = seatAssignData;
            seatAssignData.setMenuId("A1");
            this.f27925c.setSeatAttCd1(p.COMMUTATION_SEAT_ASSIGN.getCode());
            this.f27925c.setTrnGpCd(ticket_info.get(0).getH_trn_gp_cd());
            this.f27924b = D4.a.getSeatAssignReservationRequest(SeatAssignBookingActivity.this.f27915i, this.f27925c, passengerCount);
        }

        @Override // H4.a
        public void setGPassTicket(int i8) {
            int passengerCount = SeatAssignBookingActivity.this.A0().getPassengerCount();
            Y4.b bVar = (Y4.b) SeatAssignBookingActivity.this.f27919m.getItem(SeatAssignBookingActivity.this.f27918l.getCurrentItem());
            List<TicketDetailDao.TicketInfo> ticket_info = SeatAssignBookingActivity.this.f27915i.getTicket_infos().getTicket_info();
            this.f27923a = CommutationDirectInquiryActivity.class;
            SeatAssignData seatAssignData = bVar.getSeatAssignData();
            this.f27925c = seatAssignData;
            seatAssignData.setMenuId("A1");
            this.f27925c.setSeatAttCd1(p.COMMUTATION_SEAT_ASSIGN.getCode());
            this.f27925c.setTrnGpCd(ticket_info.get(0).getH_trn_gp_cd());
            this.f27924b = D4.a.getSeatAssignReservationRequest(SeatAssignBookingActivity.this.f27915i, this.f27925c, passengerCount);
        }

        @Override // H4.a
        public void setGeneralTicket(int i8) {
        }

        @Override // H4.a
        public void setNCCardTicket(int i8) {
            List<TicketDetailDao.TicketInfo> ticket_info = SeatAssignBookingActivity.this.f27915i.getTicket_infos().getTicket_info();
            Y4.b bVar = (Y4.b) SeatAssignBookingActivity.this.f27919m.getItem(SeatAssignBookingActivity.this.f27918l.getCurrentItem());
            this.f27923a = NCardDirectInquiryActivity.class;
            SeatAssignData seatAssignData = bVar.getSeatAssignData();
            this.f27925c = seatAssignData;
            seatAssignData.setMenuId("A2");
            this.f27925c.setSeatAttCd1(p.DEFAULT.getCode());
            this.f27925c.setTrnGpCd(ticket_info.get(0).getH_trn_gp_cd());
            this.f27924b = D4.a.getNCardReservationRequest(SeatAssignBookingActivity.this.f27915i, this.f27925c);
        }

        @Override // H4.a
        public void setPassTicket(int i8) {
            int passengerCount = SeatAssignBookingActivity.this.A0().getPassengerCount();
            Y4.b bVar = (Y4.b) SeatAssignBookingActivity.this.f27919m.getItem(SeatAssignBookingActivity.this.f27918l.getCurrentItem());
            this.f27923a = APassDirectInquiryActivity.class;
            SeatAssignData seatAssignData = bVar.getSeatAssignData();
            this.f27925c = seatAssignData;
            seatAssignData.setTrnGpCd(s.ALL.getCode());
            this.f27924b = D4.a.getSeatAssignReservationRequest(SeatAssignBookingActivity.this.f27915i, this.f27925c, passengerCount);
        }

        /* synthetic */ b(SeatAssignBookingActivity seatAssignBookingActivity, a aVar) {
            this();
        }

        @Override // H4.a
        public /* bridge */ /* synthetic */ void callTicketKind(TicketDetailDao.TicketDetailResponse ticketDetailResponse, boolean z8) {
            super.callTicketKind(ticketDetailResponse, z8);
        }

        @Override // H4.a
        public /* bridge */ /* synthetic */ void callTicketKind(TicketDetailDao.TicketDetailResponse ticketDetailResponse, boolean z8, int i8) {
            super.callTicketKind(ticketDetailResponse, z8, i8);
        }
    }

    private class c implements H4.a {
        private c() {
        }

        @Override // H4.a
        public /* bridge */ /* synthetic */ void callTicketKind(TicketDetailDao.TicketDetailResponse ticketDetailResponse) {
            super.callTicketKind(ticketDetailResponse);
        }

        @Override // H4.a
        public void setCommutationTicket(int i8) {
            SeatAssignBookingActivity.this.setAppTitle(AbstractC5959j.common_seat_assign);
            List<TicketDetailDao.TicketInfo> ticket_info = SeatAssignBookingActivity.this.f27915i.getTicket_infos().getTicket_info();
            SeatAssignBookingActivity.this.f27916j.add(l.newInstance(ticket_info.get(0).getH_dpt_rs_stn_nm(), ticket_info.get(ticket_info.size() - 1).getH_arv_rs_stn_nm()));
            SeatAssignBookingActivity.this.f27917k.setVisibility(8);
        }

        @Override // H4.a
        public void setGPassTicket(int i8) {
            SeatAssignBookingActivity.this.setAppTitle(AbstractC5959j.common_seat_assign);
            List<TicketDetailDao.TicketInfo> ticket_info = SeatAssignBookingActivity.this.f27915i.getTicket_infos().getTicket_info();
            SeatAssignBookingActivity.this.f27916j.add(l.newInstance(ticket_info.get(0).getH_dpt_rs_stn_nm(), ticket_info.get(ticket_info.size() - 1).getH_arv_rs_stn_nm()));
            SeatAssignBookingActivity.this.f27917k.setVisibility(8);
        }

        @Override // H4.a
        public void setGeneralTicket(int i8) {
        }

        @Override // H4.a
        public void setNCCardTicket(int i8) {
            SeatAssignBookingActivity.this.setAppTitle(AbstractC5959j.title_n_card_booking);
            for (TicketDetailDao.AppSegInfo appSegInfo : SeatAssignBookingActivity.this.f27915i.getDcnt_crd_info().getAppSeg_info()) {
                SeatAssignBookingActivity.this.f27916j.add(l.newInstance(appSegInfo.getDptRsStnNm(), appSegInfo.getArvRsStnNm()));
            }
            SeatAssignBookingActivity.this.f27917k.setVisibility(0);
        }

        @Override // H4.a
        public void setPassTicket(int i8) {
            SeatAssignBookingActivity seatAssignBookingActivity = SeatAssignBookingActivity.this;
            seatAssignBookingActivity.setAppTitle(seatAssignBookingActivity.getIntent().getStringExtra("activity_name"));
            SeatAssignBookingActivity.this.f27916j.add(g.newInstance(SeatAssignBookingActivity.this.getIntent().getStringExtra("INQUIRY_TYPE")));
            SeatAssignBookingActivity.this.f27917k.setVisibility(8);
        }

        /* synthetic */ c(SeatAssignBookingActivity seatAssignBookingActivity, a aVar) {
            this();
        }

        @Override // H4.a
        public /* bridge */ /* synthetic */ void callTicketKind(TicketDetailDao.TicketDetailResponse ticketDetailResponse, boolean z8) {
            super.callTicketKind(ticketDetailResponse, z8);
        }

        @Override // H4.a
        public /* bridge */ /* synthetic */ void callTicketKind(TicketDetailDao.TicketDetailResponse ticketDetailResponse, boolean z8, int i8) {
            super.callTicketKind(ticketDetailResponse, z8, i8);
        }
    }

    private class d extends r {
        /* synthetic */ d(SeatAssignBookingActivity seatAssignBookingActivity, FragmentManager fragmentManager, a aVar) {
            this(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return SeatAssignBookingActivity.this.f27916j.size();
        }

        @Override // androidx.fragment.app.r
        public Fragment getItem(int i8) {
            return (Fragment) SeatAssignBookingActivity.this.f27916j.get(i8);
        }

        @Override // androidx.viewpager.widget.a
        public CharSequence getPageTitle(int i8) {
            return SeatAssignBookingActivity.this.getString(AbstractC5959j.common_section_n, Integer.valueOf(i8 + 1));
        }

        private d(FragmentManager fragmentManager) {
            super(fragmentManager, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Y4.b A0() {
        return (Y4.b) this.f27919m.getItem(this.f27918l.getCurrentItem());
    }

    private void B0() {
        this.f27916j = new ArrayList();
    }

    private void C0() {
        this.f27920n.setOnClickListener(this);
        this.f27921o.setOnChangeStationListener(this);
        this.f27921o.setHideEventListener(this);
    }

    private void D0() {
        n0(false);
        this.f27917k = (CTabLayout) findViewById(AbstractC5955f.tl_seat_assign_booking);
        this.f27918l = (CustomViewPager) findViewById(AbstractC5955f.vp_seat_assign_booking);
        this.f27920n = (Button) findViewById(AbstractC5955f.btn_seat_assign_booking_inquiry);
        this.f27921o = (StationSearch) findViewById(AbstractC5955f.ss_seat_assign_booking);
    }

    private void E0() throws Resources.NotFoundException {
        a aVar = null;
        new c(this, aVar).callTicketKind(this.f27915i);
        this.f27919m = new d(this, getSupportFragmentManager(), aVar);
        this.f27918l.setOffscreenPageLimit(this.f27916j.size());
        this.f27918l.setAdapter(this.f27919m);
        this.f27918l.setSwipeEnabled(false);
        this.f27917k.setupWithViewPager(this.f27918l);
    }

    private void z0() {
        TicketDetailDao ticketDetailDao = new TicketDetailDao();
        TicketDetailDao.TicketDetailRequest ticketDetailRequest = ticketDetailDao.new TicketDetailRequest();
        ticketDetailRequest.setWctNo(getIntent().getStringExtra("WCT_NO"));
        ticketDetailRequest.setSaleDt(getIntent().getStringExtra("RET_SALE_DT"));
        ticketDetailRequest.setSaleSqNo(getIntent().getStringExtra("SALE_SQ_NO"));
        ticketDetailRequest.setRetPwd(getIntent().getStringExtra("RET_PWD"));
        ticketDetailRequest.setH_purchase_history("N");
        ticketDetailDao.setRequest(ticketDetailRequest);
        ticketDetailDao.setFinishView(true);
        ticketDetailDao.setLoadingCancelable(false);
        executeDao(ticketDetailDao);
    }

    @Override // Y4.a
    public TicketDetailDao.TicketDetailResponse getDetailResponse() {
        return this.f27915i;
    }

    @Override // Y4.a
    public void hideStationSearch() throws Resources.NotFoundException {
        if (this.f27921o.getVisibility() == 0) {
            A0().unSelectStation();
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(getApplicationContext(), AbstractC5951b.bottom_view_slide_down);
            animationLoadAnimation.setAnimationListener(new a());
            this.f27921o.startAnimation(animationLoadAnimation);
            O(this.f27921o);
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, com.korail.talk.view.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() throws Resources.NotFoundException {
        if (C6630d.isNotNull(this.f27921o) && this.f27921o.getVisibility() == 0) {
            hideStationSearch();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.korail.talk.ui.booking.option.station.StationSearch.e
    public void onChangeStation(StationNameData stationNameData) throws Resources.NotFoundException {
        setStationNm(stationNameData.getDepartureStationName(), stationNameData.getArrivalStationName());
        hideStationSearch();
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) throws Resources.NotFoundException {
        int id = view.getId();
        if (AbstractC5955f.v_station_search == id) {
            hideStationSearch();
            return;
        }
        if (AbstractC5955f.btn_seat_assign_booking_inquiry != id) {
            super.onClick(view);
            return;
        }
        int passengerCount = A0().getPassengerCount();
        Y4.b bVar = (Y4.b) this.f27919m.getItem(this.f27918l.getCurrentItem());
        b bVar2 = new b(this, null);
        bVar2.callTicketKind(this.f27915i);
        SeatAssignData seatAssignDataF = bVar2.f();
        Intent intent = new Intent(getApplicationContext(), (Class<?>) bVar2.d());
        intent.putExtra("IS_DIRECT", true);
        intent.putExtra("IS_TRANSFER", false);
        intent.putExtra("TRAIN_GROUP_CODE", seatAssignDataF.getTrnGpCd());
        intent.putExtra("INQUIRY_REQUEST", B4.b.getSeatAssignScheduleViewRequest(this.f27915i, bVar.getRouteOption(), bVar.getDateOption(), seatAssignDataF, this.f27918l.getCurrentItem(), passengerCount));
        intent.putExtra("RESERVATION_REQUEST", bVar2.e());
        startActivity(intent);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_seat_assign_booking);
        if (C6630d.isNull(bundle)) {
            B0();
            D0();
            C0();
            z0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) throws Resources.NotFoundException {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_ticket_detail == iBaseDao.getId()) {
            this.f27915i = (TicketDetailDao.TicketDetailResponse) iBaseDao.getResponse();
            E0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onResume() throws Resources.NotFoundException {
        if (C6630d.isNotNull(this.f27921o)) {
            this.f27921o.refreshList();
        }
        super.onResume();
    }

    @Override // Y4.a
    public void setDate(CalendarData calendarData) {
        for (int i8 = 0; i8 < this.f27919m.getCount(); i8++) {
            if (i8 != this.f27918l.getCurrentItem()) {
                ((Y4.b) this.f27919m.getItem(i8)).setDate(calendarData);
            }
        }
    }

    @Override // Y4.a
    public void setInquiryEnable(boolean z8) {
        this.f27920n.setEnabled(z8);
    }

    @Override // Y4.a
    public void setStationNm(String str, String str2) {
        for (int i8 = 0; i8 < this.f27919m.getCount(); i8++) {
            ((Y4.b) this.f27919m.getItem(i8)).setStationNm(str, str2);
        }
    }

    @Override // Y4.a
    public void showStationSearch(StationSearch.c cVar) throws Resources.NotFoundException {
        this.f27921o.initSearchEdit();
        this.f27921o.setStartArrivalType(cVar);
        if (this.f27921o.getVisibility() == 8) {
            this.f27921o.setVisibility(0);
            this.f27921o.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), AbstractC5951b.bottom_view_slide_up));
        }
    }
}
