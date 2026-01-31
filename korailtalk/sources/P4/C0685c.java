package P4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.fragment.app.Fragment;
import com.korail.talk.data.CalendarData;
import com.korail.talk.ui.booking.option.date.a;
import k0.AbstractC5837a;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import v4.f;
import z4.C6630d;
import z4.C6631e;
import z4.C6634h;

/* renamed from: P4.c */
/* loaded from: classes.dex */
public class C0685c extends C {
    public static final String TAG = "DirectBookingFragment";

    /* renamed from: i0 */
    private com.korail.talk.ui.booking.option.date.a f3715i0;

    /* renamed from: j0 */
    private W4.c f3716j0;

    public /* synthetic */ void N0(RadioGroup radioGroup, int i8, int i9) {
        z4.H.putIntList(getApplicationContext(), "BOOKING_TOGGLE_OPTION", this.f3716j0.getCheckedIndexList());
    }

    public /* synthetic */ void O0(CalendarData calendarData) {
        this.f3689d0.setDate(calendarData);
    }

    private void P0() {
        W4.c cVar = new W4.c(getActivity());
        this.f3716j0 = cVar;
        this.f3691f0.addView(cVar);
        this.f3716j0.setHeaderSummary(getString(AbstractC5959j.common_detail_option));
        this.f3716j0.setHeaderMessage(getString(AbstractC5959j.normal_booking_near_station));
        this.f3716j0.setOnCustomRadioCheckedChangListener(new f.a() { // from class: P4.b
            @Override // v4.f.a
            public final void onCustomCheckedChanged(RadioGroup radioGroup, int i8, int i9) {
                this.f3714a.N0(radioGroup, i8, i9);
            }
        });
    }

    private void Q0() {
        com.korail.talk.ui.booking.option.date.a aVar = new com.korail.talk.ui.booking.option.date.a(getActivity());
        this.f3715i0 = aVar;
        this.f3691f0.addView(aVar);
        this.f3715i0.setHeaderSummary(getString(AbstractC5959j.common_departure_date));
        this.f3715i0.setDate(C6631e.getNormalDateStrArray());
        this.f3715i0.setOnChangeDateOptionListener(new a.d() { // from class: P4.a
            @Override // com.korail.talk.ui.booking.option.date.a.d
            public final void onChangeDateOption(CalendarData calendarData) {
                this.f3713a.O0(calendarData);
            }
        });
    }

    public static Fragment newInstance(Bundle bundle) {
        C0685c c0685c = new C0685c();
        c0685c.setArguments(bundle);
        return c0685c;
    }

    @Override // P4.C, P4.InterfaceC0688f
    public W4.c getBookingToggleOption() {
        return this.f3716j0;
    }

    @Override // P4.C, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // P4.C, P4.InterfaceC0688f
    public com.korail.talk.ui.booking.option.date.a getDepartureDateOption() {
        return this.f3715i0;
    }

    @Override // P4.C, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            Q0();
            H0();
            P0();
            G0();
            setExternalAppDate(getArguments());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.fragment_main_booking, viewGroup, false);
    }

    @Override // P4.C, P4.InterfaceC0688f
    public void refreshDate() {
        if (C6630d.isNotNull(this.f3715i0)) {
            this.f3715i0.refreshDate();
        }
    }

    @Override // P4.C, P4.InterfaceC0688f
    public void setDate(CalendarData calendarData) {
        this.f3715i0.refreshDate(calendarData);
    }

    @Override // P4.C, P4.InterfaceC0688f
    public void setExternalAppDate(Bundle bundle) {
        CalendarData externalAppDate = C6634h.getExternalAppDate(bundle);
        if (C6630d.isNotNull(externalAppDate)) {
            this.f3715i0.refreshDate(externalAppDate);
        }
    }
}
