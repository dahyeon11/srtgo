package P4;

import T4.c;
import V4.b;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.korail.talk.data.CalendarData;
import com.korail.talk.ui.booking.option.station.StationSearch;
import k0.AbstractC5837a;
import n4.AbstractC5955f;
import y6.C6550j;
import z4.C6626B;
import z4.C6630d;

/* loaded from: classes.dex */
public class C extends com.korail.talk.view.base.a implements InterfaceC0688f, v4.g {

    /* renamed from: d0, reason: collision with root package name */
    protected InterfaceC0686d f3689d0;

    /* renamed from: e0, reason: collision with root package name */
    private ScrollView f3690e0;

    /* renamed from: f0, reason: collision with root package name */
    protected ViewGroup f3691f0;

    /* renamed from: g0, reason: collision with root package name */
    private V4.b f3692g0;

    /* renamed from: h0, reason: collision with root package name */
    private T4.d f3693h0;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0(View view) {
        this.f3690e0.smoothScrollTo(0, view.getTop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0() {
        this.f3690e0.scrollTo(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C0(Bundle bundle, int i8, String str) {
        this.f3689d0.setPassengerData(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D0() {
        this.f3689d0.setStationNm(this.f3692g0.getArrivalStationNm(), this.f3692g0.getStartStationNm());
    }

    private void E0(final View view) {
        if (C6630d.isNotNull(view)) {
            this.f3690e0.post(new Runnable() { // from class: P4.A
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3686a.A0(view);
                }
            });
        }
    }

    private void F0() {
        this.f3690e0.post(new Runnable() { // from class: P4.B
            @Override // java.lang.Runnable
            public final void run() {
                this.f3688a.B0();
            }
        });
    }

    private void I0() {
        if (C6630d.isNotNull(this.f3693h0)) {
            this.f3693h0.setGuideDogView(I4.h.getInstance().isCustLeadFlg());
        }
    }

    private void J0() {
        V4.b bVar = new V4.b(getActivity());
        this.f3692g0 = bVar;
        this.f3691f0.addView(bVar);
        String[] stationNm = z4.M.getStationNm();
        this.f3692g0.setStationInfo(stationNm[0], stationNm[1], this instanceof C0685c ? 0 : 2, 0);
        this.f3692g0.setOnReverseStationsListener(new b.a() { // from class: P4.z
            @Override // V4.b.a
            public final void onReverseStation() {
                this.f3744a.D0();
            }
        });
    }

    private void K0() {
        this.f3690e0 = (ScrollView) p0(AbstractC5955f.sv_main_booking);
        this.f3691f0 = (ViewGroup) p0(AbstractC5955f.v_main_booking_container);
    }

    protected void G0() {
        for (int i8 = 0; i8 < this.f3691f0.getChildCount(); i8++) {
            View childAt = this.f3691f0.getChildAt(i8);
            if (childAt instanceof C6550j) {
                ((C6550j) childAt).setHeaderClickListener(this);
            }
        }
    }

    protected void H0() {
        T4.d dVar = new T4.d(getActivity(), C6626B.getPassengerBundleData(getArguments()));
        this.f3693h0 = dVar;
        this.f3691f0.addView(dVar);
        this.f3693h0.setOnChangePersonInfoListener(new c.a() { // from class: P4.y
            @Override // T4.c.a
            public final void onChangePersonInfo(Bundle bundle, int i8, String str) {
                this.f3743a.C0(bundle, i8, str);
            }
        });
    }

    @Override // P4.InterfaceC0688f
    public W4.c getBookingToggleOption() {
        return null;
    }

    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // P4.InterfaceC0688f
    public com.korail.talk.ui.booking.option.date.a getDepartureDateOption() {
        return null;
    }

    @Override // P4.InterfaceC0688f
    public com.korail.talk.ui.booking.option.date.a getInComingDateOption() {
        return null;
    }

    @Override // P4.InterfaceC0688f
    public T4.d getPassengerAgeSeatCountOption() {
        return this.f3693h0;
    }

    @Override // P4.InterfaceC0688f
    public V4.b getRouteOption() {
        return this.f3692g0;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            K0();
            J0();
            setExternalAppStationNm(getArguments());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f3689d0 = (InterfaceC0686d) context;
    }

    @Override // v4.g
    public void onOptionHeaderClick(C6550j c6550j, boolean z8) {
        if (C6630d.isNotNull(c6550j)) {
            if (!(c6550j instanceof V4.b)) {
                E0(c6550j);
            } else {
                F0();
                this.f3689d0.showStationSearch(((V4.b) c6550j).isDepartureSelected() ? StationSearch.c.START : StationSearch.c.ARRIVAL);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        refreshDate();
        I0();
        super.onResume();
    }

    @Override // P4.InterfaceC0688f
    public void setExternalAppStationNm(Bundle bundle) {
        String[] externalAppStationNm = z4.M.getExternalAppStationNm(bundle);
        if (z4.N.isNotNull(externalAppStationNm[0]) && z4.N.isNotNull(externalAppStationNm[1])) {
            this.f3692g0.setStationNm(externalAppStationNm[0], externalAppStationNm[1]);
        }
    }

    @Override // P4.InterfaceC0688f
    public void setPassengerData(Bundle bundle) {
        this.f3693h0.updatePassengerData(bundle);
    }

    @Override // P4.InterfaceC0688f
    public void setStationNm(String str, String str2) {
        if (!z4.N.isNotNull(str)) {
            str = this.f3692g0.getStartStationNm();
        }
        if (!z4.N.isNotNull(str2)) {
            str2 = this.f3692g0.getArrivalStationNm();
        }
        this.f3692g0.setStationNm(str, str2);
    }

    @Override // P4.InterfaceC0688f
    public void unSelectStation() {
        this.f3692g0.unSelectStation();
    }

    @Override // P4.InterfaceC0688f
    public void refreshDate() {
    }

    @Override // P4.InterfaceC0688f
    public void setDate(CalendarData calendarData) {
    }

    @Override // P4.InterfaceC0688f
    public void setExternalAppDate(Bundle bundle) {
    }
}
