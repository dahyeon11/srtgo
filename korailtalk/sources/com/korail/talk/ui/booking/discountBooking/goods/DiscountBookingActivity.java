package com.korail.talk.ui.booking.discountBooking.goods;

import T4.c;
import V4.b;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ScrollView;
import com.korail.talk.data.CalendarData;
import com.korail.talk.data.StationNameData;
import com.korail.talk.ui.booking.option.station.StationSearch;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5951b;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import r4.d;
import v4.g;
import y6.C6550j;
import z4.C6630d;
import z4.C6634h;
import z4.C6637k;
import z4.M;
import z4.N;
import z4.t;

/* loaded from: classes.dex */
public class DiscountBookingActivity extends BaseViewActivity implements StationSearch.e, g {

    /* renamed from: i, reason: collision with root package name */
    protected ViewGroup f27592i;

    /* renamed from: j, reason: collision with root package name */
    private ScrollView f27593j;

    /* renamed from: k, reason: collision with root package name */
    protected b f27594k;

    /* renamed from: l, reason: collision with root package name */
    protected com.korail.talk.ui.booking.option.date.a f27595l;

    /* renamed from: m, reason: collision with root package name */
    protected c f27596m;

    /* renamed from: n, reason: collision with root package name */
    private StationSearch f27597n;

    /* renamed from: o, reason: collision with root package name */
    protected Button f27598o;

    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            DiscountBookingActivity.this.f27597n.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    private void A0(String str, CalendarData calendarData) {
        x0(str, calendarData, null);
    }

    private void B0() {
    }

    private void D0() {
        n0(false);
        this.f27593j = (ScrollView) findViewById(AbstractC5955f.scrollView);
        this.f27597n = (StationSearch) findViewById(AbstractC5955f.stationSearchView);
        this.f27598o = (Button) findViewById(AbstractC5955f.trainInquiryBtn);
        this.f27592i = (ViewGroup) findViewById(AbstractC5955f.optionsContainer);
    }

    private void E0() {
        if (M.isStationSame(this.f27594k)) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.common_start_arrival_equal)).showDialog();
        } else {
            y0();
        }
    }

    private void refreshDate() {
        if (C6630d.isNotNull(this.f27595l)) {
            this.f27595l.refreshDate();
        }
    }

    private void scrollToOption(final View view) {
        if (C6630d.isNotNull(view)) {
            this.f27593j.post(new Runnable() { // from class: N4.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3235a.v0(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0(View view) {
        this.f27593j.smoothScrollTo(0, view.getTop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w0() {
        this.f27593j.scrollTo(0, 0);
    }

    private void y0() {
        A0(d.DIRECT_SQ_NO.getCode(), null);
    }

    private void z0(Bundle bundle) {
        String code = (bundle.getBoolean("IS_DIRECT", false) ? d.DIRECT_SQ_NO : d.TRANSFER_SQ_NO).getCode();
        CalendarData calendarInfo = bundle.containsKey("ROUTE_DATE") ? C6634h.getCalendarInfo(C6634h.getCalendarFromString(bundle.getString("ROUTE_DATE"), "yyyyMMddHHmmss")) : null;
        t.e("jobId : " + code + ", moveToTrainInquiry - " + this);
        x0(code, calendarInfo, bundle);
    }

    protected void C0() {
        this.f27597n.setHideEventListener(this);
        this.f27597n.setOnChangeStationListener(this);
        this.f27598o.setOnClickListener(this);
        for (int i8 = 0; i8 < this.f27592i.getChildCount(); i8++) {
            View childAt = this.f27592i.getChildAt(i8);
            if (childAt instanceof C6550j) {
                ((C6550j) childAt).setHeaderClickListener(this);
            }
        }
    }

    public void hideStationSearch() throws Resources.NotFoundException {
        if (this.f27597n.getVisibility() == 0) {
            this.f27594k.unSelectStation();
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(getApplicationContext(), AbstractC5951b.bottom_view_slide_down);
            animationLoadAnimation.setAnimationListener(new a());
            this.f27597n.startAnimation(animationLoadAnimation);
            O(this.f27597n);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i9 == -1 && 117 == i8) {
            if (intent.getBooleanExtra("IS_SELECT_TRANSFER", false)) {
                z0(intent.getExtras());
            } else {
                A0((intent.getBooleanExtra("IS_DIRECT", false) ? d.DIRECT_SQ_NO : d.TRANSFER_SQ_NO).getCode(), C6634h.getCalendarInfo(C6634h.getCalendarFromString(intent.getStringExtra("ROUTE_DATE"), "yyyyMMddHHmmss")));
            }
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, com.korail.talk.view.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() throws Resources.NotFoundException {
        if (C6630d.isNotNull(this.f27597n) && this.f27597n.getVisibility() == 0) {
            hideStationSearch();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.korail.talk.ui.booking.option.station.StationSearch.e
    public void onChangeStation(StationNameData stationNameData) throws Resources.NotFoundException {
        this.f27594k.setStationNm(N.isNotNull(stationNameData.getDepartureStationName()) ? stationNameData.getDepartureStationName() : this.f27594k.getStartStationNm(), N.isNotNull(stationNameData.getArrivalStationName()) ? stationNameData.getArrivalStationName() : this.f27594k.getArrivalStationNm());
        hideStationSearch();
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) throws Resources.NotFoundException {
        O(view);
        int id = view.getId();
        if (AbstractC5955f.v_station_search == id) {
            hideStationSearch();
        } else if (AbstractC5955f.trainInquiryBtn == id) {
            E0();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_discount_booking);
        if (C6630d.isNull(bundle)) {
            B0();
            D0();
        }
    }

    @Override // v4.g
    public void onOptionHeaderClick(C6550j c6550j, boolean z8) throws Resources.NotFoundException {
        if (C6630d.isNotNull(c6550j)) {
            if (!(c6550j instanceof b)) {
                scrollToOption(c6550j);
            } else {
                scrollToOption(c6550j);
                showStationSearch(((b) c6550j).isDepartureSelected() ? StationSearch.c.START : StationSearch.c.ARRIVAL);
            }
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    public void onResume() throws Resources.NotFoundException {
        if (C6630d.isNotNull(this.f27597n)) {
            this.f27597n.refreshList();
        }
        refreshDate();
        super.onResume();
    }

    public void scrollToTop() {
        this.f27593j.post(new Runnable() { // from class: N4.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f3234a.w0();
            }
        });
    }

    public void showStationSearch(StationSearch.c cVar) throws Resources.NotFoundException {
        scrollToTop();
        this.f27597n.initSearchEdit();
        this.f27597n.setStartArrivalType(cVar);
        if (this.f27597n.getVisibility() == 8) {
            this.f27597n.setVisibility(0);
            this.f27597n.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), AbstractC5951b.bottom_view_slide_up));
        }
    }

    protected void x0(String str, CalendarData calendarData, Bundle bundle) {
    }
}
