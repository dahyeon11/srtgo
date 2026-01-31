package Q4;

import V4.b;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.core.widget.NestedScrollView;
import com.korail.talk.data.StationNameData;
import com.korail.talk.network.dao.pass.DiscountMenuDao;
import com.korail.talk.ui.booking.option.station.StationSearch;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5951b;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import y6.C6550j;
import z4.C6630d;
import z4.N;

/* loaded from: classes.dex */
public class g extends BaseViewActivity implements v4.g {

    /* renamed from: i, reason: collision with root package name */
    protected DiscountMenuDao.DiscountMenu f4052i;

    /* renamed from: j, reason: collision with root package name */
    private NestedScrollView f4053j;

    /* renamed from: k, reason: collision with root package name */
    protected ViewGroup f4054k;

    /* renamed from: l, reason: collision with root package name */
    protected V4.b f4055l;

    /* renamed from: m, reason: collision with root package name */
    protected V4.b[] f4056m;

    /* renamed from: n, reason: collision with root package name */
    protected X4.b f4057n;

    /* renamed from: o, reason: collision with root package name */
    protected X4.a f4058o;

    /* renamed from: p, reason: collision with root package name */
    private StationSearch f4059p;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0() {
        this.f4053j.scrollTo(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0(V4.b bVar) {
        I0(bVar, bVar.getArrivalStationNm(), bVar.getStartStationNm());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C0(StationNameData stationNameData) throws Resources.NotFoundException {
        I0(this.f4055l, N.isNull(stationNameData.getDepartureStationName()) ? this.f4055l.getStartStationNm() : stationNameData.getDepartureStationName(), N.isNull(stationNameData.getArrivalStationName()) ? this.f4055l.getArrivalStationNm() : stationNameData.getArrivalStationName());
        O(this.f4059p);
        y0();
    }

    private void D0() {
        this.f4052i = (DiscountMenuDao.DiscountMenu) getIntent().getSerializableExtra("DISCOUNT_MENU_DATA");
    }

    private void I0(V4.b bVar, String str, String str2) {
        bVar.setStationInfo(str, str2, 6);
    }

    private void K0() {
        n0(false);
        this.f4054k = (ViewGroup) findViewById(AbstractC5955f.v_multi_n_card_container);
        this.f4053j = (NestedScrollView) findViewById(AbstractC5955f.sv_multi_n_card);
    }

    private void L0(V4.b bVar, StationSearch.c cVar) throws Resources.NotFoundException {
        this.f4055l = bVar;
        this.f4059p.initSearchEdit();
        this.f4059p.setStartArrivalType(cVar);
        if (this.f4059p.getVisibility() != 0) {
            this.f4059p.setVisibility(0);
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(getApplicationContext(), AbstractC5951b.bottom_view_slide_up);
            animationLoadAnimation.setAnimationListener(new a());
            this.f4059p.startAnimation(animationLoadAnimation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scrollToTop() {
        this.f4053j.post(new Runnable() { // from class: Q4.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f4049a.A0();
            }
        });
    }

    private void setText() {
        setAppTitle(this.f4052i.getTitle());
    }

    private void y0() throws Resources.NotFoundException {
        if (this.f4059p.getVisibility() != 8) {
            this.f4055l.unSelectStation();
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(getApplicationContext(), AbstractC5951b.bottom_view_slide_down);
            animationLoadAnimation.setAnimationListener(new b());
            this.f4059p.startAnimation(animationLoadAnimation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(View view) {
        this.f4053j.smoothScrollTo(0, view.getTop());
    }

    protected void E0() {
        findViewById(AbstractC5955f.btn_multi_n_card_inquiry).setOnClickListener(this);
        for (int i8 = 0; i8 < this.f4054k.getChildCount(); i8++) {
            View childAt = this.f4054k.getChildAt(i8);
            if (childAt instanceof C6550j) {
                ((C6550j) childAt).setHeaderClickListener(this);
            }
        }
    }

    protected void F0() {
        int i8 = 0;
        while (i8 < this.f4056m.length) {
            int i9 = i8 + 1;
            final V4.b bVar = new V4.b(this, getString(AbstractC5959j.common_section_n, Integer.valueOf(i9)));
            this.f4054k.addView(bVar);
            I0(bVar, getString(AbstractC5959j.favorite_route_station_name), getString(AbstractC5959j.favorite_route_station_name));
            bVar.setOnReverseStationsListener(new b.a() { // from class: Q4.d
                @Override // V4.b.a
                public final void onReverseStation() {
                    this.f4047a.B0(bVar);
                }
            });
            this.f4056m[i8] = bVar;
            i8 = i9;
        }
    }

    protected void G0(String str, int i8) {
        X4.a aVar = new X4.a(this);
        this.f4058o = aVar;
        aVar.setNCardMemberType(str, i8);
        this.f4054k.addView(this.f4058o);
    }

    protected void H0(String str, String str2) {
        X4.b bVar = new X4.b(this);
        this.f4057n = bVar;
        bVar.setNCardTypeCode(str, str2);
        this.f4054k.addView(this.f4057n);
    }

    protected void J0() {
        StationSearch stationSearch = (StationSearch) findViewById(AbstractC5955f.ss_multi_n_card_station);
        this.f4059p = stationSearch;
        stationSearch.setHideEventListener(this);
        this.f4059p.setOnChangeStationListener(new StationSearch.e() { // from class: Q4.c
            @Override // com.korail.talk.ui.booking.option.station.StationSearch.e
            public final void onChangeStation(StationNameData stationNameData) throws Resources.NotFoundException {
                this.f4046a.C0(stationNameData);
            }
        });
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, com.korail.talk.view.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() throws Resources.NotFoundException {
        if (C6630d.isNotNull(this.f4059p) && this.f4059p.getVisibility() == 0) {
            y0();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) throws Resources.NotFoundException {
        if (AbstractC5955f.v_station_search != view.getId()) {
            super.onClick(view);
        } else {
            if (C6630d.isNull(this.f4059p) || this.f4059p.getVisibility() != 0) {
                return;
            }
            y0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_multi_n_card);
        if (C6630d.isNull(bundle)) {
            D0();
            K0();
            setText();
        }
    }

    @Override // v4.g
    public void onOptionHeaderClick(C6550j c6550j, boolean z8) throws Resources.NotFoundException {
        if (C6630d.isNull(c6550j) || !(c6550j instanceof V4.b)) {
            return;
        }
        V4.b bVar = (V4.b) c6550j;
        L0(bVar, bVar.isDepartureSelected() ? StationSearch.c.START : StationSearch.c.ARRIVAL);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onResume() throws Resources.NotFoundException {
        if (C6630d.isNotNull(this.f4059p)) {
            this.f4059p.refreshList();
        }
        super.onResume();
    }

    protected void scrollToOption(final View view) {
        if (C6630d.isNotNull(view)) {
            this.f4053j.post(new Runnable() { // from class: Q4.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4050a.z0(view);
                }
            });
        }
    }

    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            g.this.scrollToTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    class b implements Animation.AnimationListener {
        b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            g.this.f4059p.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
