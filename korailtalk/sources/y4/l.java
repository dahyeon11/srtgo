package Y4;

import V4.b;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import com.korail.talk.data.CalendarData;
import com.korail.talk.data.SeatAssignData;
import com.korail.talk.ui.booking.option.date.a;
import k0.AbstractC5837a;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import y6.C6550j;
import z4.C6630d;
import z4.C6631e;
import z4.C6637k;
import z4.N;

/* loaded from: classes.dex */
public class l extends com.korail.talk.view.base.a implements b, v4.g {

    /* renamed from: d0, reason: collision with root package name */
    protected a f5635d0;

    /* renamed from: e0, reason: collision with root package name */
    protected SeatAssignData f5636e0;

    /* renamed from: f0, reason: collision with root package name */
    protected ScrollView f5637f0;

    /* renamed from: g0, reason: collision with root package name */
    protected ViewGroup f5638g0;

    /* renamed from: h0, reason: collision with root package name */
    protected V4.b f5639h0;

    /* renamed from: i0, reason: collision with root package name */
    protected com.korail.talk.ui.booking.option.date.a f5640i0;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0(View view) {
        this.f5637f0.smoothScrollTo(0, view.getTop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0(DialogInterface dialogInterface, int i8) {
        q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C0(CalendarData calendarData) {
        this.f5635d0.setDate(calendarData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D0() {
        K0(this.f5639h0.getArrivalStationNm(), this.f5639h0.getStartStationNm(), 4);
    }

    private void F0() {
        this.f5636e0 = new SeatAssignData();
    }

    private void H0() {
        for (int i8 = 0; i8 < this.f5638g0.getChildCount(); i8++) {
            View childAt = this.f5638g0.getChildAt(i8);
            if (childAt instanceof C6550j) {
                ((C6550j) childAt).setHeaderClickListener(this);
            }
        }
    }

    private void L0() {
        this.f5637f0 = (ScrollView) p0(AbstractC5955f.sv_seat_assign_booking);
        this.f5638g0 = (ViewGroup) p0(AbstractC5955f.v_seat_assign_booking_container);
        J0();
        G0();
        I0();
    }

    public static Fragment newInstance(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("DEPARTURE_STATION_NM", str);
        bundle.putString("ARRIVAL_STATION_NM", str2);
        l lVar = new l();
        lVar.setArguments(bundle);
        return lVar;
    }

    protected void E0(final View view) {
        if (C6630d.isNull(view)) {
            return;
        }
        this.f5637f0.post(new Runnable() { // from class: Y4.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f5630a.A0(view);
            }
        });
    }

    protected void G0() {
        com.korail.talk.ui.booking.option.date.a aVar = new com.korail.talk.ui.booking.option.date.a(getActivity());
        this.f5640i0 = aVar;
        this.f5638g0.addView(aVar);
        this.f5640i0.setHeaderSummary(getString(AbstractC5959j.common_departure_date));
        String[] normalDateStrArray = C6631e.getNormalDateStrArray();
        if (normalDateStrArray.length == 0) {
            C6637k.getCDialog(getActivity(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.n_card_not_use_day)).setButtonListener(new DialogInterface.OnClickListener() { // from class: Y4.i
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f5632a.B0(dialogInterface, i8);
                }
            }).showDialog();
        } else {
            this.f5640i0.setDate(normalDateStrArray);
        }
        this.f5640i0.setOnChangeDateOptionListener(new a.d() { // from class: Y4.j
            @Override // com.korail.talk.ui.booking.option.date.a.d
            public final void onChangeDateOption(CalendarData calendarData) {
                this.f5633a.C0(calendarData);
            }
        });
    }

    protected void J0() {
        V4.b bVar = new V4.b(getActivity());
        this.f5639h0 = bVar;
        this.f5638g0.addView(bVar);
        this.f5639h0.setStationInfo(getArguments().getString("DEPARTURE_STATION_NM"), getArguments().getString("ARRIVAL_STATION_NM"), 4);
        this.f5639h0.setOnReverseStationsListener(new b.a() { // from class: Y4.k
            @Override // V4.b.a
            public final void onReverseStation() {
                this.f5634a.D0();
            }
        });
    }

    protected void K0(String str, String str2, int i8) {
        this.f5639h0.setStationInfo(str, str2, i8, 8);
    }

    @Override // Y4.b
    public com.korail.talk.ui.booking.option.date.a getDateOption() {
        return this.f5640i0;
    }

    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    public int getPassengerCount() {
        return 1;
    }

    @Override // Y4.b
    public V4.b getRouteOption() {
        return this.f5639h0;
    }

    @Override // Y4.b
    public SeatAssignData getSeatAssignData() {
        return this.f5636e0;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            F0();
            L0();
            H0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f5635d0 = (a) context;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.fragment_seat_assign_booking, viewGroup, false);
    }

    public void onOptionHeaderClick(C6550j c6550j, boolean z8) {
        if (C6630d.isNull(c6550j)) {
            return;
        }
        E0(c6550j);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        if (C6630d.isNotNull(this.f5640i0)) {
            this.f5640i0.refreshDate();
        }
        super.onResume();
    }

    @Override // Y4.b
    public void setDate(CalendarData calendarData) {
        this.f5640i0.refreshDate(calendarData);
    }

    @Override // Y4.b
    public void setStationNm(String str, String str2) {
        if (!N.isNotNull(str)) {
            str = this.f5639h0.getStartStationNm();
        }
        if (!N.isNotNull(str2)) {
            str2 = this.f5639h0.getArrivalStationNm();
        }
        this.f5639h0.setStationNm(str, str2);
    }

    @Override // Y4.b
    public void unSelectStation() {
        this.f5639h0.unSelectStation();
    }

    protected void I0() {
    }
}
