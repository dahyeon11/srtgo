package com.korail.talk.ui.ticket.confirm;

import F4.C0501b;
import a6.C0839c;
import a6.InterfaceC0837a;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.korail.talk.data.WheelchairData;
import com.korail.talk.network.dao.ticket.UpdatePlatformDao;
import com.korail.talk.ui.menu.BasketTicketActivity;
import f6.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import k0.AbstractC5837a;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import r4.C6174a;
import z4.C6630d;
import z4.C6633g;
import z4.C6637k;
import z4.C6639m;
import z4.C6641o;
import z4.G;
import z4.N;
import z4.P;
import z4.t;

/* loaded from: classes.dex */
public class a extends com.korail.talk.view.base.a implements InterfaceC0837a {

    /* renamed from: d0, reason: collision with root package name */
    protected boolean f29020d0;

    /* renamed from: e0, reason: collision with root package name */
    private int f29021e0;

    /* renamed from: f0, reason: collision with root package name */
    private ArrayList f29022f0;

    /* renamed from: g0, reason: collision with root package name */
    private TextView f29023g0;

    /* renamed from: h0, reason: collision with root package name */
    private RecyclerView f29024h0;

    /* renamed from: i0, reason: collision with root package name */
    private C0839c f29025i0;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0(View view) {
        C6641o.navigation(getApplicationContext(), BasketTicketActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0(String str, View view, View view2, String[] strArr, AdapterView adapterView, View view3, int i8, long j8) {
        if (i8 == 0) {
            if (C6630d.isNotNull(getContext())) {
                P.setClipBoardLink(getContext(), str);
                return;
            }
            return;
        }
        File file = C6639m.getFile(getContext(), C6174a.VOLATILITY_FOLDER, C6174a.SHARE_IMAGE_NM);
        if (C6630d.isNotNull(file)) {
            if (!C6633g.ticketSaveToBitmapFile(view, view2, file)) {
                Toast.makeText(getContext(), "일정 공유에 실패 하셨습니다", 0).show();
            } else {
                G.playApp(getActivity(), G.getIntentShare(getActivity(), file, strArr[i8], str));
            }
        }
    }

    private void C0() {
        this.f29021e0 = -1;
        this.f29020d0 = getArguments().getBoolean("IS_EMERGENCY", false);
        this.f29022f0 = new ArrayList();
    }

    private void D0() {
        p0(AbstractC5955f.goToShoppingBasket).setOnClickListener(new View.OnClickListener() { // from class: f6.B
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31207a.A0(view);
            }
        });
    }

    private void E0(int i8) {
        if (C6630d.isNotNull(getActivity())) {
            ((TicketListActivity) getActivity()).setTabBadge(this instanceof h ? 0 : 2, i8);
        }
    }

    private void F0() {
        TextView textView = (TextView) p0(AbstractC5955f.tv_ticket_list_valid_check);
        this.f29023g0 = textView;
        textView.setSelected(true);
        RecyclerView recyclerView = (RecyclerView) p0(AbstractC5955f.ticketList);
        this.f29024h0 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), 1, false));
        this.f29024h0.setHasFixedSize(true);
        C0839c c0839c = new C0839c(this.f29022f0);
        this.f29025i0 = c0839c;
        c0839c.setITicketListEventListener(this);
        this.f29024h0.setAdapter(this.f29025i0);
    }

    private void H0(final View view, final View view2, final String str) throws Resources.NotFoundException {
        String[] stringArray = getResources().getStringArray(AbstractC5952c.share_app_nm);
        final String[] stringArray2 = getResources().getStringArray(AbstractC5952c.share_app_lnik);
        C6637k.getLDialog(getActivity(), 1001, 0, getString(AbstractC5959j.dialog_share_schedule)).setListData(Arrays.asList(stringArray), new AdapterView.OnItemClickListener() { // from class: f6.D
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view3, int i8, long j8) {
                this.f31210a.B0(str, view, view2, stringArray2, adapterView, view3, i8, j8);
            }
        }).setButtonNames(N.getStringArray(getString(AbstractC5959j.common_cancel))).setContent(getString(AbstractC5959j.dialog_share_schedule_content)).showDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(int i8, DialogInterface dialogInterface, int i9) {
        if (102 != i9 || C6630d.isNull(getActivity())) {
            return;
        }
        ((TicketListActivity) getActivity()).NCardExtension(i8);
    }

    protected void G0(int i8, int i9) {
        if (i8 == this.f29023g0.getId()) {
            this.f29023g0.setVisibility(i9);
        }
    }

    public void clearData() {
        if (C6630d.isNull(this.f29022f0)) {
            this.f29022f0 = new ArrayList();
        } else {
            this.f29022f0.clear();
        }
        if (C6630d.isNotNull(this.f29025i0)) {
            this.f29025i0.notifyDataSetChanged();
        }
        E0(0);
    }

    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    public int getListDataSize() {
        return this.f29022f0.size();
    }

    @Override // a6.InterfaceC0837a
    public void moveToCompanionMileageDetail(int i8) {
        t.d("moveToCompanionMileageDetail");
    }

    @Override // a6.InterfaceC0837a
    public void moveToDelayedCertificate(int i8) {
        t.d("moveToDelayedCertificate");
    }

    @Override // a6.InterfaceC0837a
    public void moveToDeliveredHistory(boolean z8, int i8) {
        if (C6630d.isNotNull(getActivity())) {
            ((TicketListActivity) getActivity()).moveToDeliveredHistory(z8, i8);
        }
    }

    @Override // a6.InterfaceC0837a
    public void moveToDeviceReset(int i8) {
        t.d("moveToDeviceReset");
        ((TicketListActivity) getActivity()).showDeviceReset(i8);
    }

    @Override // a6.InterfaceC0837a
    public void moveToGuardianReliefSMS(int i8) {
        if (C6630d.isNotNull(getActivity())) {
            ((TicketListActivity) getActivity()).moveToGuardianReliefSMS(i8);
        }
    }

    @Override // a6.InterfaceC0837a
    public void moveToMaasServiceAddReservation(int i8) {
        t.d("moveToMaasServiceAddReservation");
    }

    @Override // a6.InterfaceC0837a
    public void moveToMaasServiceCancel(int i8) {
        t.d("moveToMaasCancel");
    }

    @Override // a6.InterfaceC0837a
    public void moveToMaasServiceDetail(int i8) {
        t.d("moveToMaasServiceDetail");
    }

    @Override // a6.InterfaceC0837a
    public void moveToMaasServiceReceipt(int i8) {
        t.d("moveToMaasServiceReceipt");
    }

    @Override // a6.InterfaceC0837a
    public void moveToProductList(int i8) {
        t.e(getClass().getSimpleName() + ", index : " + i8);
        if (C6630d.isNotNull(getActivity())) {
            ((TicketListActivity) getActivity()).moveToProductList(i8);
        }
    }

    @Override // a6.InterfaceC0837a
    public void moveToReceipt(int i8, int i9) {
        t.e(getClass().getSimpleName() + ", index : " + i8 + ", seatIndex : " + i9);
        if (C6630d.isNotNull(getActivity())) {
            ((TicketListActivity) getActivity()).moveToReceipt(i8, i9);
        }
    }

    @Override // a6.InterfaceC0837a
    public void moveToSeatAssignBooking(int i8, String str) {
        t.e(getClass().getSimpleName() + ", index : " + i8);
        if (C6630d.isNotNull(getActivity())) {
            ((TicketListActivity) getActivity()).moveToSeatAssignBooking(i8, str);
        }
    }

    @Override // a6.InterfaceC0837a
    public void moveToSelfCheckinStatus(int i8, int i9, int i10) {
        t.d("moveToSelfCheckin");
        ((TicketListActivity) getActivity()).moveToSelfCheckinStatus(i8, i9, i10);
    }

    @Override // a6.InterfaceC0837a
    public void moveToTicketChange(int i8) {
        t.e(getClass().getSimpleName() + ", index : " + i8);
        if (C6630d.isNotNull(getActivity())) {
            ((TicketListActivity) getActivity()).moveToTicketChange(i8);
        }
    }

    @Override // a6.InterfaceC0837a
    public void moveToTicketReturn(int i8) {
        t.e(getClass().getSimpleName() + ", index : " + i8);
        if (C6630d.isNotNull(getActivity())) {
            ((TicketListActivity) getActivity()).moveToTicketReturn(i8);
        }
    }

    @Override // a6.InterfaceC0837a
    public void moveToTicketSeatChange(int i8) {
        t.e(getClass().getSimpleName() + ", index : " + i8);
        if (C6630d.isNotNull(getActivity())) {
            ((TicketListActivity) getActivity()).moveToTicketSeatChange(i8);
        }
    }

    @Override // a6.InterfaceC0837a
    public void moveToTicketSend(int i8) {
        t.e(getClass().getSimpleName() + ", index : " + i8);
        if (C6630d.isNotNull(getActivity())) {
            ((TicketListActivity) getActivity()).moveToTicketSend(i8);
        }
    }

    @Override // a6.InterfaceC0837a
    public void moveToTrainFacility(String str, String str2) {
        t.e(getClass().getSimpleName() + ", trainFacilityUrl : " + str + ", vrUrl : " + str2);
        if (C6630d.isNotNull(getActivity())) {
            ((TicketListActivity) getActivity()).moveToTrainFacility(str, str2);
        }
    }

    @Override // a6.InterfaceC0837a
    public void moveToTrainServiceInfo(int i8, int i9) {
        t.e(getClass().getSimpleName() + ", index : " + i8 + ", jrnyIndex : " + i9);
        if (C6630d.isNotNull(getActivity())) {
            ((TicketListActivity) getActivity()).moveToTrainServiceInfo(i8, i9);
        }
    }

    @Override // a6.InterfaceC0837a
    public void moveToWheelchair(String str, WheelchairData wheelchairData) {
        if (C6630d.isNotNull(getActivity())) {
            ((TicketListActivity) getActivity()).moveToWheelchair(str, wheelchairData);
        }
    }

    @Override // a6.InterfaceC0837a
    public void nCardExtension(final int i8) {
        t.e(getClass().getSimpleName() + ", index : " + i8);
        C6637k.getCDialog(getActivity(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.dialog_n_card_period_extension)).setButtonListener(new DialogInterface.OnClickListener() { // from class: f6.C
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                this.f31208a.z0(i8, dialogInterface, i9);
            }
        }).showDialog();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            C0();
            F0();
            D0();
            if (this.f29020d0) {
                p0(AbstractC5955f.noContentButtonLayout).setVisibility(8);
            }
        }
    }

    @Override // a6.InterfaceC0837a
    public void onClickCallCrew(int i8, int i9, int i10) {
        ((TicketListActivity) getActivity()).gotoCallCrew(i8, i9, i10);
    }

    @Override // a6.InterfaceC0837a
    public void onClickUpdatePlatform(int i8, int i9, int i10) {
        t.e(getClass().getSimpleName() + ", index : " + i8 + ", jrnyIndex : " + i9 + ", seatIndex : " + i10);
        ((TicketListActivity) getActivity()).onClickUpdatePlatform(i8, i9, i10);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.fragment_ticket_list, viewGroup, false);
    }

    @Override // a6.InterfaceC0837a
    public void reservationLimousine(int i8) {
        t.e(getClass().getSimpleName() + ", index : " + i8);
        if (C6630d.isNotNull(getActivity())) {
            ((TicketListActivity) getActivity()).reservationLimousine(i8);
        }
    }

    public void setListData(Bundle bundle) {
        this.f29022f0.add(bundle);
    }

    public void setTargetPosition() {
        this.f29021e0 = getListDataSize() - 1;
    }

    @Override // a6.InterfaceC0837a
    public void ticketShareInfo(View view, View view2, Bundle bundle) throws Resources.NotFoundException {
        t.e(getClass().getSimpleName());
        H0(view, view2, C0501b.getShareText(getApplicationContext(), bundle));
    }

    public void updateList() {
        t.d("");
        E0(this.f29025i0.getItemCount());
        int i8 = 8;
        p0(AbstractC5955f.v_no_content).setVisibility(this.f29022f0.isEmpty() ? 0 : 8);
        int i9 = AbstractC5955f.tv_ticket_list_valid_check;
        if (!this.f29022f0.isEmpty() && !this.f29020d0) {
            i8 = 0;
        }
        G0(i9, i8);
        int i10 = this.f29021e0;
        if (i10 > 0) {
            this.f29024h0.scrollToPosition(i10);
        }
        this.f29025i0.notifyDataSetChanged();
    }

    public void updatePlatform(UpdatePlatformDao.PlfNoResponse plfNoResponse, String str, int i8, int i9) {
        String plfNo = plfNoResponse.getAcepList().get(0).getJrnyList().get(i8).getPlfNo();
        int i10 = 0;
        for (int i11 = 0; i11 < this.f29022f0.size(); i11++) {
            ArrayList parcelableArrayList = ((Bundle) this.f29022f0.get(i11)).getParcelableArrayList("JRNY_LIST_DATA");
            if (parcelableArrayList.size() > i8) {
                ArrayList parcelableArrayList2 = ((Bundle) parcelableArrayList.get(i8)).getParcelableArrayList("SEAT_LIST_DATA");
                for (int i12 = 0; i12 < parcelableArrayList2.size(); i12++) {
                    C6630d.printBundleData((Bundle) parcelableArrayList2.get(i12));
                    if (str.equals(((Bundle) parcelableArrayList2.get(i12)).getString("RETURN_NO"))) {
                        ((Bundle) parcelableArrayList2.get(i12)).putString("KEY_PLF_NO", plfNo);
                        i10 = i11;
                    }
                }
            }
        }
        t.d("ticketIndex : " + i10 + ", jrnyIndex : " + i8 + ", seatIndex : " + i9 + ", 타는곳번호 : " + plfNo);
        this.f29025i0.notifyItemChanged(i10);
    }
}
