package com.korail.talk.ui.reservation;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import com.korail.talk.data.reservation.DReservationData;
import com.korail.talk.data.reservation.ReservationMessageData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.reservationCancel.RsvCancelCheckDao;
import com.korail.talk.network.dao.reservationCancel.RsvCancelCheckDao.RsvCancelCheckRequest;
import com.korail.talk.network.dao.reservationCancel.RsvCancelDao;
import com.korail.talk.network.dao.reservationCancel.RsvCancelDao.RsvCancelRequest;
import com.korail.talk.network.dao.reservationWait.RsvWaitDao;
import com.korail.talk.network.dao.reservationWait.RsvWaitDao.RsvWaitRequest;
import com.korail.talk.network.data.reservation.old.OWait;
import com.korail.talk.network.response.certification.ReservationResponse;
import com.korail.talk.ui.reservation.confirm.activity.DReservationConfirmActivity;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5956g;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import x4.C6491a;
import z4.C6630d;
import z4.C6637k;
import z4.N;
import z4.O;

/* loaded from: classes.dex */
public class ReservationWaitActivity extends BaseViewActivity implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: i */
    private ReservationResponse f28609i;

    /* renamed from: j */
    private View f28610j;

    /* renamed from: k */
    private CheckBox f28611k;

    /* renamed from: l */
    private EditText f28612l;

    /* renamed from: m */
    private EditText f28613m;

    /* renamed from: n */
    private EditText f28614n;

    /* renamed from: o */
    private TextView f28615o;

    /* renamed from: p */
    private Button f28616p;

    private void A0() {
        this.f28609i = (ReservationResponse) M(getIntent(), "RESERVATION_RESPONSE");
    }

    private void B0() {
        this.f28611k.setOnClickListener(this);
        findViewById(AbstractC5955f.check1).setOnClickListener(this);
        ((CheckBox) findViewById(AbstractC5955f.cb_reservation_agree)).setOnCheckedChangeListener(this);
        this.f28615o.setOnClickListener(this);
        findViewById(AbstractC5955f.btn_cancel).setOnClickListener(this);
        this.f28616p.setOnClickListener(this);
        this.f28612l.addTextChangedListener(new C6491a(getResources().getInteger(AbstractC5956g.phone_number_max_length_3), this.f28613m));
        this.f28613m.addTextChangedListener(new C6491a(getResources().getInteger(AbstractC5956g.phone_number_max_length), this.f28614n));
    }

    private void C0() {
        n0(false);
        this.f28610j = findViewById(AbstractC5955f.phoneNoView);
        this.f28611k = (CheckBox) findViewById(AbstractC5955f.check0);
        this.f28612l = (EditText) findViewById(AbstractC5955f.phoneNoEdit0);
        this.f28613m = (EditText) findViewById(AbstractC5955f.phoneNoEdit1);
        this.f28614n = (EditText) findViewById(AbstractC5955f.phoneNoEdit2);
        this.f28615o = (TextView) findViewById(AbstractC5955f.tv_reservation_agree);
        Button button = (Button) findViewById(AbstractC5955f.btn_rsv_wait);
        this.f28616p = button;
        button.setEnabled(false);
        this.f28611k.setVisibility(O.isTourTrainGroup(this.f28609i.getJrny_infos().getJrny_info().get(0).getH_trn_gp_cd()) ? 8 : 0);
    }

    private void executeRsvCancel(ReservationResponse reservationResponse) {
        RsvCancelDao rsvCancelDao = new RsvCancelDao();
        RsvCancelDao.RsvCancelRequest rsvCancelRequest = rsvCancelDao.new RsvCancelRequest();
        rsvCancelRequest.setTxtPnrNo(reservationResponse.getH_pnr_no());
        rsvCancelRequest.setTxtJrnyCnt(reservationResponse.getH_jrny_cnt());
        rsvCancelRequest.setTxtJrnySqno("0001");
        rsvCancelRequest.setHidRsvChgNo("000");
        rsvCancelDao.setRequest(rsvCancelRequest);
        rsvCancelDao.setFinishView(true);
        executeDao(rsvCancelDao);
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_reservation_wait);
        this.f28615o.setText(N.applySpannable("개인정보 수집 및 이용 동의", new UnderlineSpan()));
    }

    private void u0(ReservationResponse reservationResponse) {
        RsvCancelCheckDao rsvCancelCheckDao = new RsvCancelCheckDao();
        RsvCancelCheckDao.RsvCancelCheckRequest rsvCancelCheckRequest = rsvCancelCheckDao.new RsvCancelCheckRequest();
        rsvCancelCheckRequest.setTxtPnrNo(reservationResponse.getH_pnr_no());
        rsvCancelCheckRequest.setTxtJrnyCnt(reservationResponse.getH_jrny_cnt());
        rsvCancelCheckRequest.setTxtJrnySqno("0001");
        rsvCancelCheckRequest.setHidRsvChgNo("000");
        rsvCancelCheckDao.setRequest(rsvCancelCheckRequest);
        rsvCancelCheckDao.setFinishView(true);
        executeDao(rsvCancelCheckDao);
    }

    private void v0(OWait oWait, ReservationResponse reservationResponse) {
        RsvWaitDao rsvWaitDao = new RsvWaitDao();
        RsvWaitDao.RsvWaitRequest rsvWaitRequest = rsvWaitDao.new RsvWaitRequest();
        rsvWaitRequest.setTxtPnrNo(reservationResponse.getH_pnr_no());
        rsvWaitRequest.setTxtPsrmClChgFlg(oWait.get(OWait.PSRM_CL_CHG_FLG));
        rsvWaitRequest.setTxtSmsSndFlg(oWait.get(OWait.SMS_FLG));
        rsvWaitRequest.setTxtCpNo(oWait.get(OWait.PHONE_NO));
        rsvWaitRequest.setReservationResponse(reservationResponse);
        rsvWaitDao.setRequest(rsvWaitRequest);
        executeDao(rsvWaitDao);
    }

    private String w0() {
        return N(this.f28612l) + N(this.f28613m) + N(this.f28614n);
    }

    public /* synthetic */ void x0(DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            u0(this.f28609i);
        }
    }

    public /* synthetic */ void y0(DialogInterface dialogInterface, int i8) {
        finish();
    }

    private void z0(ReservationResponse reservationResponse) {
        DReservationData dReservationData = new DReservationData();
        ArrayList arrayList = new ArrayList();
        arrayList.add(reservationResponse);
        dReservationData.setReservationResponseList(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ReservationMessageData reservationMessageData = new ReservationMessageData();
        reservationMessageData.setMessageList(Arrays.asList(getResources().getStringArray(AbstractC5952c.wait_message)));
        arrayList2.add(reservationMessageData);
        dReservationData.setReservationMessageDataList(arrayList2);
        Intent intent = new Intent(getApplicationContext(), (Class<?>) DReservationConfirmActivity.class);
        intent.putExtra("RESERVATION_DATA", dReservationData);
        startActivityForResult(intent, 119);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
        this.f28616p.setEnabled(z8);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.check1 == id) {
            this.f28610j.setVisibility(((CheckBox) view).isChecked() ? 0 : 8);
            return;
        }
        if (AbstractC5955f.tv_reservation_agree == id) {
            C6637k.getPDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_payment_private_collection_title)).setStringArray(getResources().getStringArray(AbstractC5952c.reservation_wait)).showDialog();
            return;
        }
        if (AbstractC5955f.btn_cancel == id) {
            executeRsvCancel(this.f28609i);
            return;
        }
        if (AbstractC5955f.btn_rsv_wait != id) {
            super.onClick(view);
            return;
        }
        CheckBox checkBox = (CheckBox) findViewById(AbstractC5955f.check0);
        CheckBox checkBox2 = (CheckBox) findViewById(AbstractC5955f.check1);
        boolean zIsChecked = checkBox.isChecked();
        boolean zIsChecked2 = checkBox2.isChecked();
        OWait oWait = new OWait();
        oWait.setSmsFlg(zIsChecked2 ? "Y" : "N");
        oWait.setPsrmClChgFlg(zIsChecked ? "Y" : "N");
        if (zIsChecked2) {
            String strW0 = w0();
            if (strW0.isEmpty() || strW0.length() < 10) {
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.inquiry_input_cellphone_number_warning)).showDialog();
                return;
            }
            oWait.setPhoneNo(strW0);
        }
        v0(oWait, this.f28609i);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_reservation_wait);
        if (C6630d.isNull(bundle)) {
            A0();
            C0();
            setText();
            B0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_rsv_wait == id) {
            z0(((RsvWaitDao.RsvWaitRequest) iBaseDao.getRequest()).getReservationResponse());
            finish();
        } else if (AbstractC5955f.dao_rsv_cancel == id) {
            C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.common_reservation_cancel_message)).setButtonListener(new DialogInterface.OnClickListener() { // from class: O5.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f3458a.x0(dialogInterface, i8);
                }
            }).showDialog();
        } else if (AbstractC5955f.dao_rsv_cancel_check == id) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.common_reservation_cancel_complete_message)).setButtonListener(new DialogInterface.OnClickListener() { // from class: O5.c
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f3459a.y0(dialogInterface, i8);
                }
            }).showDialog();
        }
    }
}
