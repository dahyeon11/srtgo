package com.korail.talk.ui.inquiry.rir.orr;

import F4.C0500a;
import I4.h;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.korail.talk.data.DisabilityReservationData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.certification.LReservationDao;
import com.korail.talk.network.data.reservation.old.OJrny;
import com.korail.talk.network.data.reservation.old.OSrcar;
import com.korail.talk.network.request.reservation.ReservationRequest;
import com.korail.talk.network.response.certification.ReservationResponse;
import com.korail.talk.ui.certification.DisabilityCertificationActivity;
import com.korail.talk.ui.reservation.ReservationWaitActivity;
import g5.e;
import j5.AbstractActivityC5828a;
import java.util.ArrayList;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import r4.EnumC6175b;
import r4.c;
import r4.d;
import r4.p;
import r4.s;
import z4.C6630d;
import z4.C6634h;
import z4.C6637k;
import z4.G;
import z4.J;
import z4.N;
import z4.O;
import z4.q;
import z4.t;

/* loaded from: classes.dex */
public abstract class a extends AbstractActivityC5828a {

    /* renamed from: i0, reason: collision with root package name */
    protected EnumC6175b f28069i0;

    /* renamed from: j0, reason: collision with root package name */
    protected Handler f28070j0;

    private void E2(ReservationRequest reservationRequest) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("WRR800029");
        arrayList.add("ERR911531");
        arrayList.add("ERR911051");
        IBaseDao lReservationDao = new LReservationDao();
        lReservationDao.setErrorMsgCdNotShowDialog(arrayList);
        lReservationDao.setRequest(reservationRequest);
        executeDao(lReservationDao);
    }

    private boolean F2() {
        h hVar = h.getInstance();
        return (B0() != EnumC6175b.DEFAULT || hVar.isSejongMember().booleanValue() || hVar.isNaJuMember() || hVar.isSinGyeongJu()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G2(DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            N0(E0());
            K2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H2(ReservationResponse reservationResponse, DialogInterface dialogInterface, int i8) {
        z2(reservationResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I2(ReservationResponse reservationResponse, DialogInterface dialogInterface, int i8) {
        this.f31588n = c.RSV_INCOMING;
        ReservationResponse.JrnyInfo jrnyInfo = reservationResponse.getJrny_infos().getJrny_info().get(reservationResponse.getJrny_infos().getJrny_info().size() - 1);
        String h_dpt_dt = jrnyInfo.getH_dpt_dt();
        if (N.getInteger(jrnyInfo.getH_arv_tm()) < N.getInteger(jrnyInfo.getH_dpt_tm())) {
            h_dpt_dt = C6634h.addDay(jrnyInfo.getH_dpt_dt(), "yyyyMMdd", 1);
        }
        if (C6634h.isBefore(this.f31910Y[1].getTxtGoAbrdDt() + this.f31910Y[1].getTxtGoHour(), h_dpt_dt + jrnyInfo.getH_arv_tm())) {
            this.f31910Y[1].setTxtGoAbrdDt(h_dpt_dt);
            this.f31910Y[1].setTxtGoHour(jrnyInfo.getH_arv_tm());
        }
        this.f31910Y[1].setRadJobId(this.f31909X.getRadJobId());
        this.f31910Y[1].setSelGoTrain(this.f31909X.getSelGoTrain());
        this.f31910Y[1].setTxtTrnGpCd(this.f31909X.getTxtTrnGpCd());
        this.f31910Y[1].setTxtSeatAttCd_4(this.f31909X.getTxtSeatAttCd_4());
        this.f31909X = this.f31910Y[1];
        setAppTitle(AbstractC5959j.inquiry_coming_train_inquiry);
        V1();
        c2(this.f31591q ? "" : getString(AbstractC5959j.common_transfer), "");
        v0();
        s2();
        this.f31592r = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J2(DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            G.moveToGooglePlay(K(), "kr.co.srail.newapp");
        }
    }

    private void K2() {
        if (h.getInstance().isNonMember()) {
            h.getInstance().initNonmemberData();
        }
        w2();
    }

    private void L0() {
        this.f28069i0 = (EnumC6175b) getIntent().getSerializableExtra("MENU_TYPE");
        this.f31589o = (ReservationResponse) getIntent().getSerializableExtra("RESERVATION_RESPONSE");
        this.f28070j0 = new Handler(getMainLooper());
    }

    private void L2(final ReservationResponse reservationResponse) {
        t.e("isLinkageLimousineTicket : " + F0());
        t.e("getReservationType() : " + C0());
        t.e("isLimousine = " + C0500a.isLimousine(reservationResponse.getJrny_infos().getJrny_info()));
        if (c.RSV_GOING == C0()) {
            this.f31589o = reservationResponse;
            N2(reservationResponse);
            return;
        }
        c cVar = c.RSV_INCOMING;
        if (cVar == C0() || C0500a.isLimousine(reservationResponse.getJrny_infos().getJrny_info())) {
            this.f31590p = reservationResponse;
            z2(reservationResponse);
            if (C0() == cVar) {
                finish();
                return;
            }
            return;
        }
        if (!F0()) {
            this.f31590p = reservationResponse;
            String str = reservationResponse.gethMsgCd();
            if (!N.isNotNull(str) || !"IRT800005".equals(str)) {
                z2(reservationResponse);
                return;
            } else {
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(reservationResponse.gethMsgTxt()).setButtonListener(new DialogInterface.OnClickListener() { // from class: k5.f
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        this.f33653a.H2(reservationResponse, dialogInterface, i8);
                    }
                }).showDialog();
                return;
            }
        }
        this.f31589o = reservationResponse;
        ReservationRequest reservationRequest = (ReservationRequest) this.f33487h0.clone();
        reservationRequest.setJobId("1101");
        reservationRequest.getOSrcar().clear();
        reservationRequest.setHidFreeFlg("N");
        reservationRequest.setStndFlg("N");
        reservationRequest.setPnrNo(reservationResponse.getH_pnr_no());
        OJrny oJrny = new OJrny();
        d dVar = d.DIRECT_SQ_NO;
        oJrny.setTrnClsfCd(Integer.parseInt(dVar.getCode()), "98");
        oJrny.setTrnGpCd(Integer.parseInt(dVar.getCode()), s.LIMOUSINE.getCode());
        reservationRequest.setOJrny(oJrny);
        E2(reservationRequest);
    }

    private void M2(ReservationResponse reservationResponse) {
        this.f31590p = reservationResponse;
        h.getInstance().setNonMemberNumber(reservationResponse.getH_cust_mg_no());
        z2(reservationResponse);
    }

    private void N2(final ReservationResponse reservationResponse) {
        C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.rsv_inquiry_detail_rsv_ok)).setButtonListener(new DialogInterface.OnClickListener() { // from class: k5.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f33656a.I2(reservationResponse, dialogInterface, i8);
            }
        }).showDialog();
    }

    @Override // h5.AbstractActivityC5621k
    protected EnumC6175b B0() {
        return this.f28069i0;
    }

    @Override // h5.AbstractActivityC5621k
    protected void K0() {
        if (this.f31591q || this.f31607A != 0) {
            K2();
            return;
        }
        if (this.f33487h0.getOSrcar().isEmpty()) {
            K2();
            return;
        }
        if ((!this.f33487h0.getOSrcar().containsKey("txtSrcarCnt") || this.f33487h0.getOSrcar().containsKey(OSrcar.SRCAR_CNT1)) && (this.f33487h0.getOSrcar().containsKey("txtSrcarCnt") || !this.f33487h0.getOSrcar().containsKey(OSrcar.SRCAR_CNT1))) {
            K2();
        } else {
            C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.inquiry_no_select_seat_warning)).setButtonListener(new DialogInterface.OnClickListener() { // from class: k5.g
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f33655a.G2(dialogInterface, i8);
                }
            }).showDialog();
        }
    }

    @Override // h5.AbstractActivityC5621k
    protected void O0(ReservationResponse reservationResponse) {
        if (!reservationResponse.getPsgDiscAdd_infos().getPsgDiscAdd_info().isEmpty()) {
            DisabilityReservationData disabilityReservationData = new DisabilityReservationData();
            disabilityReservationData.setTxtPnrNo(reservationResponse.getH_pnr_no());
            disabilityReservationData.setReservationResponse(q.toJson(reservationResponse));
            Intent intent = new Intent(getApplicationContext(), (Class<?>) DisabilityCertificationActivity.class);
            intent.putExtra("RESERVATION_DATA", disabilityReservationData);
            startActivityForResult(intent, 112);
            return;
        }
        if ("IRR000014".equals(reservationResponse.gethMsgCd())) {
            Intent intent2 = new Intent(getApplicationContext(), (Class<?>) ReservationWaitActivity.class);
            intent2.putExtra("RESERVATION_RESPONSE", reservationResponse);
            startActivity(intent2);
        } else if (h.getInstance().isLogin()) {
            L2(reservationResponse);
        } else {
            M2(reservationResponse);
        }
    }

    protected void O2() {
        Bundle trainInfoBundleData = B4.a.getTrainInfoBundleData(D0(), this.f31585k);
        C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.dialog_simultaneous_stop, trainInfoBundleData.getString(e.KEY_TRAIN_DEPARTURE), trainInfoBundleData.getString(e.KEY_TRAIN_ARRIVAL), "") + "\n\n" + getString(AbstractC5959j.srt_manager_dialog_message_install)).setButtonListener(new DialogInterface.OnClickListener() { // from class: k5.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f33652a.J2(dialogInterface, i8);
            }
        }).showDialog();
    }

    @Override // h5.AbstractActivityC5631u
    protected void m2() {
        super.m2();
        b2(0);
        Z1();
        if (getIntent().hasExtra("TRAIN_GROUP_CODE")) {
            l2(false, O.getTrainGroupFilterIndex(getIntent().getStringExtra("TRAIN_GROUP_CODE")));
        } else {
            k2(true);
        }
        ArrayList<String> trainSeatFilterData = J.getTrainSeatFilterData();
        int integer = N.getInteger(this.f31909X.getTxtPsgFlg_3());
        if (u2()) {
            trainSeatFilterData.add(p.EVACUATION_HELPER.getName());
        } else if (integer > 0) {
            trainSeatFilterData.add(p.OLDER.getName());
        }
        g2(F2(), trainSeatFilterData);
        d2();
    }

    @Override // j5.AbstractActivityC5828a, i5.AbstractActivityC5703c, h5.AbstractActivityC5621k, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C6630d.isNull(bundle)) {
            L0();
        }
    }

    @Override // j5.AbstractActivityC5828a, i5.AbstractActivityC5703c, h5.AbstractActivityC5631u, com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        if (AbstractC5955f.dao_l_reservation == iBaseDao.getId()) {
            L2((ReservationResponse) iBaseDao.getResponse());
        } else {
            super.onReceive(iBaseDao);
        }
    }

    @Override // j5.AbstractActivityC5828a
    protected ReservationResponse y2() {
        return this.f31589o;
    }
}
