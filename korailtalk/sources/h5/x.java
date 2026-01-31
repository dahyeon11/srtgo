package H5;

import F4.C0500a;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.cart.AddCartDao;
import com.korail.talk.network.dao.cart.AddCartDao.AddCartRequest;
import com.korail.talk.network.dao.reservationCancel.RsvCancelCheckDao;
import com.korail.talk.network.dao.reservationCancel.RsvCancelCheckDao.RsvCancelCheckRequest;
import com.korail.talk.network.dao.reservationCancel.RsvCancelDao;
import com.korail.talk.network.dao.reservationCancel.RsvCancelDao.RsvCancelRequest;
import com.korail.talk.network.dao.ticket.TCCancelDao;
import com.korail.talk.network.dao.ticket.TCCancelDao.TCCancelRequest;
import com.korail.talk.ui.ticket.confirm.TicketListActivity;
import k0.AbstractC5837a;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import u6.C6420a;
import z4.C6630d;
import z4.C6637k;

/* loaded from: classes.dex */
public abstract class x extends G5.a {

    /* renamed from: k0, reason: collision with root package name */
    private boolean f1863k0;

    /* renamed from: l0, reason: collision with root package name */
    private View f1864l0;

    /* renamed from: m0, reason: collision with root package name */
    private View f1865m0;

    private void A0() {
        p0(AbstractC5955f.btn_payment_bottom0).setOnClickListener(this);
    }

    private void C0() {
        this.f1864l0 = p0(AbstractC5955f.v_payment_amount);
        this.f1865m0 = p0(AbstractC5955f.v_payment_bottom);
    }

    private void J0(String str) {
        RsvCancelCheckDao rsvCancelCheckDao = new RsvCancelCheckDao();
        RsvCancelCheckDao.RsvCancelCheckRequest rsvCancelCheckRequest = rsvCancelCheckDao.new RsvCancelCheckRequest();
        rsvCancelCheckRequest.setTxtPnrNo(str);
        rsvCancelCheckRequest.setTxtJrnyCnt(getJrnyCnt());
        rsvCancelCheckRequest.setTxtJrnySqno("0001");
        rsvCancelCheckRequest.setHidRsvChgNo("000");
        rsvCancelCheckDao.setRequest(rsvCancelCheckRequest);
        executeDao(rsvCancelCheckDao);
    }

    private boolean M0() {
        return getReservedTicketType() == r4.j.NO_ISSUE || getReservedTicketType() == r4.j.RECEIVED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N0(DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            getActivity().setResult(-1);
            getActivity().onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O0(DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            J0(getPNRNo());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P0(DialogInterface dialogInterface, int i8) {
        getActivity().setResult(-1);
        getActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q0(DialogInterface dialogInterface, int i8) {
        if (isReservationHistory()) {
            getActivity().setResult(-1);
            getActivity().onBackPressed();
        }
    }

    protected void H0(String str) {
        AddCartDao addCartDao = new AddCartDao();
        AddCartDao.AddCartRequest addCartRequest = addCartDao.new AddCartRequest();
        addCartRequest.setHidPnrNo(str);
        addCartDao.setRequest(addCartRequest);
        executeDao(addCartDao);
    }

    protected void I0(String str) {
        RsvCancelDao rsvCancelDao = new RsvCancelDao();
        RsvCancelDao.RsvCancelRequest rsvCancelRequest = rsvCancelDao.new RsvCancelRequest();
        rsvCancelRequest.setTxtPnrNo(str);
        rsvCancelRequest.setTxtJrnyCnt(getJrnyCnt());
        rsvCancelRequest.setTxtJrnySqno("0001");
        rsvCancelRequest.setHidRsvChgNo("000");
        rsvCancelDao.setRequest(rsvCancelRequest);
        executeDao(rsvCancelDao);
    }

    protected void K0() {
        TCCancelDao tCCancelDao = new TCCancelDao();
        TCCancelDao.TCCancelRequest tCCancelRequest = tCCancelDao.new TCCancelRequest();
        tCCancelRequest.setLumpStlCnt("1");
        tCCancelRequest.setLumpStlTgtNo(1, getReservationResponse().getJrny_infos().getJrny_info().get(0).getLumpStlTgtNo());
        tCCancelDao.setRequest(tCCancelRequest);
        tCCancelDao.setNotShowDialog(true);
        executeDao(tCCancelDao);
    }

    abstract C6420a L0();

    protected void R0() {
        addTransaction(AbstractC5955f.contentContainer, I5.h.newInstance(), I5.h.TAG);
    }

    protected void S0() {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) TicketListActivity.class);
        intent.addFlags(872415232);
        startActivity(intent);
    }

    protected void T0(int i8, int i9) {
        ((TextView) p0(i8)).setText(i9);
    }

    protected void U0() {
        if (!C0500a.isOneTicket(getJrnyInfo())) {
            this.f1863k0 = false;
        } else {
            if (this.f1863k0) {
                return;
            }
            this.f1863k0 = true;
            C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.payment_one_ticket_msg)).setButtonListener(new DialogInterface.OnClickListener() { // from class: H5.w
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f1862a.Q0(dialogInterface, i8);
                }
            }).showDialog();
        }
    }

    @Override // G5.a, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // G5.a, android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.btn_payment_bottom0 == view.getId()) {
            if (r4.i.PAYMENT_TICKET_CHANGE == getPaymentType()) {
                K0();
            } else if (I4.h.getInstance().isNonMember()) {
                C6637k.getCDialog(getActivity(), 1002, 1, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.common_reservation_cancel_message)).setButtonListener(new DialogInterface.OnClickListener() { // from class: H5.t
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        this.f1859a.N0(dialogInterface, i8);
                    }
                }).showDialog();
            } else {
                I0(getPNRNo());
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.fragment_discount, viewGroup, false);
    }

    @Override // com.korail.talk.view.base.a, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_add_cart == id) {
            if (C0500a.isOneTicket(getJrnyInfo()) || !isReservationHistory()) {
                return;
            }
            getActivity().onBackPressed();
            return;
        }
        if (AbstractC5955f.dao_rsv_cancel == id) {
            C6637k.getCDialog(getActivity(), 1002, 1, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.common_reservation_cancel_message)).setButtonListener(new DialogInterface.OnClickListener() { // from class: H5.u
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f1860a.O0(dialogInterface, i8);
                }
            }).showDialog();
        } else if (AbstractC5955f.dao_rsv_cancel_check == id) {
            C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.common_reservation_cancel_complete_message)).setButtonListener(new DialogInterface.OnClickListener() { // from class: H5.v
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f1861a.P0(dialogInterface, i8);
                }
            }).showDialog();
        } else if (AbstractC5955f.dao_tc_cancel == id) {
            S0();
        }
    }

    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (C6630d.isNull(bundle)) {
            C0();
            A0();
        }
    }

    @Override // G5.a
    protected void y0() {
        super.y0();
        C6420a c6420aL0 = L0();
        if (getReservedTicketType() == r4.j.WAIT) {
            if (C6630d.isNotNull(c6420aL0)) {
                c6420aL0.setVisibility(8);
            }
            this.f1486j0.setVisibility(8);
            return;
        }
        if (getReservedTicketType() == r4.j.SENT) {
            if (C6630d.isNotNull(c6420aL0)) {
                c6420aL0.setVisibility(8);
            }
            this.f1865m0.setVisibility(8);
            this.f1864l0.setVisibility(8);
            return;
        }
        if (M0()) {
            if (C6630d.isNotNull(c6420aL0)) {
                c6420aL0.setVisibility(8);
            }
            B0(0);
        } else {
            if (getReceivedAmount() != 0) {
                if (isReservationHistory()) {
                    B0(1);
                    return;
                } else {
                    B0(0);
                    return;
                }
            }
            if (!isReservationHistory()) {
                B0(0);
                return;
            }
            if (C6630d.isNotNull(c6420aL0)) {
                c6420aL0.setVisibility(8);
            }
            this.f1486j0.setVisibility(8);
        }
    }
}
