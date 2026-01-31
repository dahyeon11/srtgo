package f6;

import a6.C0839c;
import a6.InterfaceC0837a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.korail.talk.data.WheelchairData;
import com.korail.talk.ui.booking.mainBooking.MainBookingActivity;
import com.korail.talk.ui.ticket.confirm.TicketListActivity;
import java.util.ArrayList;
import k0.AbstractC5837a;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import z4.C6630d;
import z4.C6641o;
import z4.N;

/* renamed from: f6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5517f extends com.korail.talk.view.base.a implements InterfaceC0837a {

    /* renamed from: d0, reason: collision with root package name */
    protected boolean f31223d0;

    /* renamed from: e0, reason: collision with root package name */
    private ArrayList f31224e0;

    /* renamed from: f0, reason: collision with root package name */
    private TextView f31225f0;

    /* renamed from: g0, reason: collision with root package name */
    private RecyclerView f31226g0;

    /* renamed from: h0, reason: collision with root package name */
    private C0839c f31227h0;

    private void A0(int i8) {
        if (C6630d.isNotNull(getActivity())) {
            ((TicketListActivity) getActivity()).setTabBadge(1, i8);
        }
    }

    private void B0() {
        TextView textView = (TextView) p0(AbstractC5955f.tv_ticket_list_valid_check);
        this.f31225f0 = textView;
        textView.setSelected(true);
        RecyclerView recyclerView = (RecyclerView) p0(AbstractC5955f.ticketList);
        this.f31226g0 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), 1, false));
        this.f31226g0.setHasFixedSize(true);
        C0839c c0839c = new C0839c(this.f31224e0);
        this.f31227h0 = c0839c;
        c0839c.setITicketListEventListener(this);
        this.f31226g0.setAdapter(this.f31227h0);
    }

    public static C5517f newInstance(boolean z8) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("IS_EMERGENCY", z8);
        C5517f c5517f = new C5517f();
        c5517f.setArguments(bundle);
        return c5517f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x0(View view) {
        C6641o.navigation(getApplicationContext(), MainBookingActivity.class);
    }

    private void y0() {
        this.f31223d0 = getArguments().getBoolean("IS_EMERGENCY", false);
        this.f31224e0 = new ArrayList();
    }

    private void z0() {
        p0(AbstractC5955f.goToInquiry).setOnClickListener(new View.OnClickListener() { // from class: f6.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31222a.x0(view);
            }
        });
    }

    public void clearData() {
        if (C6630d.isNull(this.f31224e0)) {
            this.f31224e0 = new ArrayList();
        } else {
            this.f31224e0.clear();
        }
        if (C6630d.isNotNull(this.f31227h0)) {
            this.f31227h0.notifyDataSetChanged();
        }
        A0(0);
    }

    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // a6.InterfaceC0837a
    public void moveToMaasServiceAddReservation(int i8) {
        z4.t.d("moveToMaasServiceAddReservation");
        ((TicketListActivity) getActivity()).moveToMaasServiceAddReservation(i8);
    }

    @Override // a6.InterfaceC0837a
    public void moveToMaasServiceCancel(int i8) {
        z4.t.d("moveToMaasCancel");
        ((TicketListActivity) getActivity()).moveToMaasServiceCancel(i8);
    }

    @Override // a6.InterfaceC0837a
    public void moveToMaasServiceDetail(int i8) {
        z4.t.d("moveToMaasServiceDetail");
        if (N.isNotNull(((Bundle) this.f31224e0.get(i8)).getString("MAAS_PNR_NUM"))) {
            ((TicketListActivity) getActivity()).moveToProductList(((Bundle) this.f31224e0.get(i8)).getString("MAAS_PNR_NUM"));
        } else {
            ((TicketListActivity) getActivity()).moveToMaasServiceDetail(i8);
        }
    }

    @Override // a6.InterfaceC0837a
    public void moveToMaasServiceReceipt(int i8) {
        z4.t.d("moveToMaasCancel");
        ((TicketListActivity) getActivity()).moveToMaasServiceReceipt(i8);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            y0();
            B0();
            z0();
            if (this.f31223d0) {
                p0(AbstractC5955f.noContentButtonLayout).setVisibility(8);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.fragment_ticket_list, viewGroup, false);
    }

    public void setMaasListData(Bundle bundle) {
        this.f31224e0.add(bundle);
    }

    public void updateList() {
        A0(this.f31227h0.getItemCount());
        p0(AbstractC5955f.v_no_content).setVisibility(this.f31224e0.isEmpty() ? 0 : 8);
        this.f31227h0.notifyDataSetChanged();
    }

    @Override // a6.InterfaceC0837a
    public void moveToCompanionMileageDetail(int i8) {
    }

    @Override // a6.InterfaceC0837a
    public void moveToDelayedCertificate(int i8) {
    }

    @Override // a6.InterfaceC0837a
    public void moveToDeviceReset(int i8) {
    }

    @Override // a6.InterfaceC0837a
    public void moveToGuardianReliefSMS(int i8) {
    }

    @Override // a6.InterfaceC0837a
    public void moveToProductList(int i8) {
    }

    @Override // a6.InterfaceC0837a
    public void moveToTicketChange(int i8) {
    }

    @Override // a6.InterfaceC0837a
    public void moveToTicketReturn(int i8) {
    }

    @Override // a6.InterfaceC0837a
    public void moveToTicketSeatChange(int i8) {
    }

    @Override // a6.InterfaceC0837a
    public void moveToTicketSend(int i8) {
    }

    @Override // a6.InterfaceC0837a
    public void nCardExtension(int i8) {
    }

    @Override // a6.InterfaceC0837a
    public void reservationLimousine(int i8) {
    }

    @Override // a6.InterfaceC0837a
    public void moveToDeliveredHistory(boolean z8, int i8) {
    }

    @Override // a6.InterfaceC0837a
    public void moveToReceipt(int i8, int i9) {
    }

    @Override // a6.InterfaceC0837a
    public void moveToSeatAssignBooking(int i8, String str) {
    }

    @Override // a6.InterfaceC0837a
    public void moveToTrainFacility(String str, String str2) {
    }

    @Override // a6.InterfaceC0837a
    public void moveToTrainServiceInfo(int i8, int i9) {
    }

    @Override // a6.InterfaceC0837a
    public void moveToWheelchair(String str, WheelchairData wheelchairData) {
    }

    @Override // a6.InterfaceC0837a
    public void moveToSelfCheckinStatus(int i8, int i9, int i10) {
    }

    @Override // a6.InterfaceC0837a
    public void onClickCallCrew(int i8, int i9, int i10) {
    }

    @Override // a6.InterfaceC0837a
    public void onClickUpdatePlatform(int i8, int i9, int i10) {
    }

    @Override // a6.InterfaceC0837a
    public void ticketShareInfo(View view, View view2, Bundle bundle) {
    }
}
