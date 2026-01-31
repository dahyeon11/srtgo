package p5;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.korail.talk.data.CalendarData;
import com.korail.talk.ui.booking.option.date.a;
import com.korail.talk.ui.booking.option.station.StationSearch;
import k0.AbstractC5837a;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import y6.C6550j;
import z4.C6630d;
import z4.C6631e;

/* loaded from: classes.dex */
public class h extends com.korail.talk.view.base.a implements v4.g, InterfaceC6055a {

    /* renamed from: d0, reason: collision with root package name */
    protected InterfaceC6056b f34605d0;

    /* renamed from: e0, reason: collision with root package name */
    protected ScrollView f34606e0;

    /* renamed from: f0, reason: collision with root package name */
    protected LinearLayout f34607f0;

    /* renamed from: g0, reason: collision with root package name */
    protected com.korail.talk.ui.booking.option.date.a f34608g0;

    /* renamed from: h0, reason: collision with root package name */
    protected T4.d f34609h0;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0() {
        this.f34606e0.scrollTo(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0(CalendarData calendarData) {
        this.f34605d0.setDate(calendarData);
    }

    private void C0(final View view) {
        if (C6630d.isNotNull(view)) {
            this.f34606e0.post(new Runnable() { // from class: p5.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34603a.z0(view);
                }
            });
        }
    }

    private void D0() {
        this.f34606e0.post(new Runnable() { // from class: p5.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f34602a.A0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(View view) {
        this.f34606e0.smoothScrollTo(0, view.getTop());
    }

    protected void E0() {
        com.korail.talk.ui.booking.option.date.a aVar = new com.korail.talk.ui.booking.option.date.a(getActivity());
        this.f34608g0 = aVar;
        this.f34607f0.addView(aVar);
        this.f34608g0.setHeaderSummary(getString(AbstractC5959j.common_departure_date));
        this.f34608g0.setDate(C6631e.getNormalDateStrArray());
        this.f34608g0.setOnChangeDateOptionListener(new a.d() { // from class: p5.e
            @Override // com.korail.talk.ui.booking.option.date.a.d
            public final void onChangeDateOption(CalendarData calendarData) {
                this.f34601a.B0(calendarData);
            }
        });
    }

    protected void F0() {
        for (int i8 = 0; i8 < this.f34607f0.getChildCount(); i8++) {
            View childAt = this.f34607f0.getChildAt(i8);
            if (childAt instanceof C6550j) {
                ((C6550j) childAt).setHeaderClickListener(this);
            }
        }
    }

    protected void G0() {
        this.f34607f0 = (LinearLayout) p0(AbstractC5955f.v_limousine_container);
        this.f34606e0 = (ScrollView) p0(AbstractC5955f.sv_limousine);
    }

    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // p5.InterfaceC6055a
    public com.korail.talk.ui.booking.option.date.a getDepartureDateOption() {
        return this.f34608g0;
    }

    @Override // p5.InterfaceC6055a
    public T4.d getPassengerAgeSeatCountOption() {
        return this.f34609h0;
    }

    @Override // p5.InterfaceC6055a
    public V4.b getRouteOption() {
        return null;
    }

    public void initPassengerDataChange() {
        Bundle bundle = new Bundle();
        bundle.putInt("ADULT_COUNT", 1);
        bundle.putInt("TEENAGER_COUNT", 0);
        bundle.putInt("CHILD_COUNT", 0);
        bundle.putInt("CHILD_ACCOMPANY_COUNT", 0);
        bundle.putInt("SENIOR_COUNT", 0);
        bundle.putInt("HIGH_DISABLE_COUNT", 0);
        bundle.putInt("LOW_DISABLE_COUNT", 0);
        bundle.putInt("GUIDE_DOG_COUNT", 0);
        this.f34609h0.updatePassengerData(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            G0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f34605d0 = (InterfaceC6056b) context;
    }

    @Override // v4.g
    public void onOptionHeaderClick(C6550j c6550j, boolean z8) {
        if (C6630d.isNotNull(c6550j)) {
            if (!(c6550j instanceof V4.b)) {
                C0(c6550j);
            } else {
                D0();
                this.f34605d0.showStationSearch(((V4.b) c6550j).isDepartureSelected() ? StationSearch.c.START : StationSearch.c.ARRIVAL);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        refreshDate();
        super.onResume();
    }

    @Override // p5.InterfaceC6055a
    public void refreshDate() {
        if (C6630d.isNotNull(this.f34608g0)) {
            this.f34608g0.refreshDate();
        }
    }

    @Override // p5.InterfaceC6055a
    public void setDate(CalendarData calendarData) {
        this.f34608g0.refreshDate(calendarData);
    }

    @Override // p5.InterfaceC6055a
    public void unSelectStation() {
    }

    @Override // p5.InterfaceC6055a
    public void setStationNm(String str, String str2) {
    }
}
