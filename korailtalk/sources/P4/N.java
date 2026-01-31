package P4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.korail.talk.data.CalendarData;
import com.korail.talk.ui.booking.option.date.a;
import k0.AbstractC5837a;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.C6631e;
import z4.C6634h;
import z4.C6637k;

/* loaded from: classes.dex */
public class N extends C {
    public static final String TAG = "RoundTripBookingFragment";

    /* renamed from: i0, reason: collision with root package name */
    private com.korail.talk.ui.booking.option.date.a f3711i0;

    /* renamed from: j0, reason: collision with root package name */
    private com.korail.talk.ui.booking.option.date.a f3712j0;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N0(CalendarData calendarData) {
        if (calendarData.isLaterThan(this.f3712j0.getSelectedDate())) {
            R0();
            this.f3712j0.refreshDate(calendarData);
        }
        this.f3689d0.setDate(calendarData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O0(CalendarData calendarData) {
        if (this.f3711i0.getSelectedDate().isLaterThan(calendarData)) {
            R0();
            this.f3711i0.refreshDate(calendarData);
        }
        this.f3689d0.setDate(this.f3711i0.getSelectedDate());
    }

    private void P0() {
        com.korail.talk.ui.booking.option.date.a aVar = new com.korail.talk.ui.booking.option.date.a(getActivity());
        this.f3711i0 = aVar;
        this.f3691f0.addView(aVar);
        this.f3711i0.setHeaderSummary(getString(AbstractC5959j.normal_booking_going_date));
        this.f3711i0.setSelectDateMsg(getString(AbstractC5959j.normal_booking_going_date));
        this.f3711i0.setDate(C6631e.getNormalDateStrArray());
        this.f3711i0.setOnChangeDateOptionListener(new a.d() { // from class: P4.M
            @Override // com.korail.talk.ui.booking.option.date.a.d
            public final void onChangeDateOption(CalendarData calendarData) {
                this.f3710a.N0(calendarData);
            }
        });
    }

    private void Q0() {
        com.korail.talk.ui.booking.option.date.a aVar = new com.korail.talk.ui.booking.option.date.a(getActivity());
        this.f3712j0 = aVar;
        this.f3691f0.addView(aVar);
        this.f3712j0.setHeaderSummary(getString(AbstractC5959j.normal_booking_coming_date));
        this.f3712j0.setSelectDateMsg(getString(AbstractC5959j.normal_booking_coming_date));
        this.f3712j0.setDate(C6631e.getNormalDateStrArray());
        this.f3712j0.setOnChangeDateOptionListener(new a.d() { // from class: P4.L
            @Override // com.korail.talk.ui.booking.option.date.a.d
            public final void onChangeDateOption(CalendarData calendarData) {
                this.f3709a.O0(calendarData);
            }
        });
    }

    private void R0() {
        C6637k.getCDialog(getActivity(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.main_date_change_notice)).showDialog();
    }

    public static Fragment newInstance(Bundle bundle) {
        N n8 = new N();
        n8.setArguments(bundle);
        return n8;
    }

    @Override // P4.C, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // P4.C, P4.InterfaceC0688f
    public com.korail.talk.ui.booking.option.date.a getDepartureDateOption() {
        return this.f3711i0;
    }

    @Override // P4.C, P4.InterfaceC0688f
    public com.korail.talk.ui.booking.option.date.a getInComingDateOption() {
        return this.f3712j0;
    }

    @Override // P4.C, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            P0();
            Q0();
            H0();
            G0();
            setExternalAppDate(getArguments());
            this.f3689d0.moveToTrainInquiryBySRT();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.fragment_main_booking, viewGroup, false);
    }

    @Override // P4.C, P4.InterfaceC0688f
    public void refreshDate() {
        if (C6630d.isNotNull(this.f3711i0)) {
            this.f3711i0.refreshDate();
        }
        if (C6630d.isNotNull(this.f3712j0)) {
            this.f3712j0.refreshDate();
        }
    }

    @Override // P4.C, P4.InterfaceC0688f
    public void setDate(CalendarData calendarData) {
        this.f3711i0.refreshDate(calendarData);
        if (calendarData.isLaterThan(this.f3712j0.getSelectedDate())) {
            this.f3712j0.refreshDate(calendarData);
        }
    }

    @Override // P4.C, P4.InterfaceC0688f
    public void setExternalAppDate(Bundle bundle) {
        CalendarData externalAppDate = C6634h.getExternalAppDate(bundle);
        if (C6630d.isNotNull(externalAppDate)) {
            this.f3711i0.refreshDate(externalAppDate);
            this.f3712j0.refreshDate(externalAppDate);
        }
    }
}
