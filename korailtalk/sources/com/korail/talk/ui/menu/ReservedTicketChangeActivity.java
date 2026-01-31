package com.korail.talk.ui.menu;

import C4.b;
import D4.a;
import Q7.X;
import T4.c;
import T4.e;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.certification.TicketRsvInquiryDao;
import com.korail.talk.network.dao.certification.TicketRsvInquiryDao.TicketRsvInquiryRequest;
import com.korail.talk.network.dao.pay.IntgStlDao;
import com.korail.talk.network.dao.reservationCancel.ReservationChangeDao;
import com.korail.talk.network.request.payment.PaymentMethod;
import com.korail.talk.network.response.certification.ReservationResponse;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import r4.k;
import z4.C6626B;
import z4.C6630d;
import z4.C6637k;
import z4.C6642p;

/* loaded from: classes.dex */
public class ReservedTicketChangeActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private ReservationResponse f28256i;

    /* renamed from: j, reason: collision with root package name */
    private Bundle f28257j;

    /* renamed from: k, reason: collision with root package name */
    private ViewGroup f28258k;

    /* renamed from: l, reason: collision with root package name */
    private TextView f28259l;

    /* renamed from: m, reason: collision with root package name */
    private TextView f28260m;

    /* renamed from: n, reason: collision with root package name */
    private TextView f28261n;

    /* renamed from: o, reason: collision with root package name */
    private Button f28262o;

    /* renamed from: p, reason: collision with root package name */
    private e f28263p;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0(Bundle bundle, int i8, String str) {
        this.f28262o.setEnabled(((bundle.getInt("ADULT_COUNT") == this.f28257j.getInt("ADULT_COUNT") && bundle.getInt("CHILD_COUNT") == this.f28257j.getInt("CHILD_COUNT") && bundle.getInt("CHILD_ACCOMPANY_COUNT") == this.f28257j.getInt("CHILD_ACCOMPANY_COUNT") && bundle.getInt("SENIOR_COUNT") == this.f28257j.getInt("SENIOR_COUNT") && bundle.getInt("HIGH_DISABLE_COUNT") == this.f28257j.getInt("HIGH_DISABLE_COUNT") && bundle.getInt("LOW_DISABLE_COUNT") == this.f28257j.getInt("LOW_DISABLE_COUNT")) || bundle.getInt("TOTAL_PERSON_COUNT") == 0) ? false : true);
    }

    private void B0() {
        this.f28263p.setOnChangePersonInfoListener(new c.a() { // from class: w5.m
            @Override // T4.c.a
            public final void onChangePersonInfo(Bundle bundle, int i8, String str) {
                this.f37433a.A0(bundle, i8, str);
            }
        });
        this.f28262o.setOnClickListener(this);
    }

    private void C0() {
        e eVar = new e(this, C6626B.getPassengerBundleData());
        this.f28263p = eVar;
        eVar.setPassengerViewText(1, getString(AbstractC5959j.common_child));
        this.f28258k.addView(this.f28263p);
    }

    private void D0(ReservationResponse reservationResponse) {
        this.f28256i = reservationResponse;
        List<ReservationResponse.JrnyInfo> jrny_info = reservationResponse.getJrny_infos().getJrny_info();
        this.f28259l.setText(C6642p.getDate(reservationResponse));
        this.f28260m.setText(C6642p.getTicketCount(getApplicationContext(), k.DEFAULT, reservationResponse));
        for (int i8 = 0; i8 < jrny_info.size(); i8++) {
            this.f28261n.append(C6642p.getTrainRoute(jrny_info.get(i8)));
            if (i8 < jrny_info.size() - 1) {
                this.f28261n.append(X.LF);
            }
        }
        Bundle passengerBundleData = C6626B.getPassengerBundleData(jrny_info.get(0).getSeat_infos().getSeat_info());
        this.f28257j = passengerBundleData;
        this.f28263p.updatePassengerData((Bundle) passengerBundleData.clone());
    }

    private void E0() {
        m0();
        this.f28259l = (TextView) findViewById(AbstractC5955f.departureDateTxt);
        this.f28260m = (TextView) findViewById(AbstractC5955f.ticketCntTxt);
        this.f28261n = (TextView) findViewById(AbstractC5955f.train_route);
        this.f28258k = (ViewGroup) findViewById(AbstractC5955f.v_reservedTicketChange_container);
        this.f28262o = (Button) findViewById(AbstractC5955f.btn_reservedTicketChange);
        C0();
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_reserved_ticket_change);
    }

    private void v0(String str) {
        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.setHiduserYn("Y");
        IntgStlDao.IntgStlRequest intgStlRequest = b.getIntgStlRequest("0008", str);
        intgStlRequest.setPaymentMethod(paymentMethod);
        IBaseDao intgStlDao = new IntgStlDao();
        intgStlDao.setRequest(intgStlRequest);
        executeDao(intgStlDao);
    }

    private void w0() {
        ReservationChangeDao reservationChangeDao = new ReservationChangeDao();
        reservationChangeDao.setRequest(a.getReservationChangeRequest(this.f28256i, this.f28263p));
        executeDao(reservationChangeDao);
    }

    private void x0() {
        TicketRsvInquiryDao ticketRsvInquiryDao = new TicketRsvInquiryDao();
        TicketRsvInquiryDao.TicketRsvInquiryRequest ticketRsvInquiryRequest = ticketRsvInquiryDao.new TicketRsvInquiryRequest();
        ticketRsvInquiryRequest.setHidPnrNo(getIntent().getStringExtra("TICKET_PNR_NUMBER"));
        ticketRsvInquiryDao.setRequest(ticketRsvInquiryRequest);
        ticketRsvInquiryDao.setFinishView(true);
        executeDao(ticketRsvInquiryDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0(String str, DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            v0(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(DialogInterface dialogInterface, int i8) {
        setResult(-1);
        finish();
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.btn_reservedTicketChange == view.getId()) {
            w0();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_reserved_ticket_change);
        if (C6630d.isNull(bundle)) {
            E0();
            setText();
            B0();
            x0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_ticket_inquiry == id) {
            D0((ReservationResponse) iBaseDao.getResponse());
            return;
        }
        if (AbstractC5955f.dao_rsv_change == id) {
            final String lumpStlTgtNo = ((ReservationChangeDao.ReservationChangeResponse) iBaseDao.getResponse()).getJrnyList().get(0).getLumpStlTgtNo();
            C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.title_reserved_ticket_change)).setContent(getString(AbstractC5959j.reserved_ticket_reservation_change_noti)).setButtonListener(new DialogInterface.OnClickListener() { // from class: w5.n
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f37434a.y0(lumpStlTgtNo, dialogInterface, i8);
                }
            }).showDialog();
        } else if (AbstractC5955f.dao_cart_payment == id) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.title_reserved_ticket_change)).setContent(getString(AbstractC5959j.reserved_ticket_reservation_change_complete)).setButtonListener(new DialogInterface.OnClickListener() { // from class: w5.o
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f37436a.z0(dialogInterface, i8);
                }
            }).showDialog();
        }
    }
}
