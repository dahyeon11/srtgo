package j5;

import android.content.Intent;
import android.os.Bundle;
import com.korail.talk.data.reservation.DReservationData;
import com.korail.talk.data.reservation.ReservationMessageData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.certification.ReservationDao;
import com.korail.talk.network.data.reservation.old.OJrny;
import com.korail.talk.network.data.reservation.old.OSeat;
import com.korail.talk.network.data.reservation.old.OSrcar;
import com.korail.talk.network.request.reservation.ReservationRequest;
import com.korail.talk.network.response.certification.ReservationResponse;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse;
import com.korail.talk.ui.reservation.confirm.activity.DReservationConfirmActivity;
import com.korail.talk.ui.seat.SeatSearchActivity;
import i5.AbstractActivityC5704d;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import r4.e;
import r4.i;
import r4.k;
import r4.p;
import z4.C6630d;
import z4.J;
import z4.O;
import z4.t;
import z4.x;

/* renamed from: j5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC5829b extends AbstractActivityC5704d {

    /* renamed from: Z, reason: collision with root package name */
    protected ReservationRequest f33488Z;

    private void L0() {
        this.f33488Z = (ReservationRequest) getIntent().getSerializableExtra("RESERVATION_REQUEST");
    }

    @Override // h5.AbstractActivityC5621k
    protected void N0(RsvInquiryResponse.TrainInfo... trainInfoArr) {
        OJrny oJrny = new OJrny();
        oJrny.setJrnyCnt((trainInfoArr.length == 1 ? r4.d.DIRECT_SQ_NO : r4.d.TRANSFER_SQ_NO).getCode());
        int i8 = 0;
        while (i8 < trainInfoArr.length) {
            int i9 = i8 + 1;
            String selectSeatTypeCode = B4.a.getSelectSeatTypeCode(D0(), i8);
            RsvInquiryResponse.TrainInfo trainInfo = trainInfoArr[i8];
            this.f33488Z.setJobId("1101");
            oJrny.setJrnyTpCd(i9, (trainInfoArr.length == 1 ? e.DIRECT : e.TRANSFER).getCode());
            oJrny.setJrnySqNo(i9, O.getSequenceNo((i8 == 0 ? r4.d.DIRECT_SQ_NO : r4.d.TRANSFER_SQ_NO).getCode()));
            oJrny.setTrnNo(i9, trainInfo.getH_trn_no());
            oJrny.setTrnClsfCd(i9, trainInfo.getH_trn_clsf_cd());
            oJrny.setTrnGpCd(i9, trainInfo.getH_trn_gp_cd());
            oJrny.setRunDt(i9, trainInfo.getH_run_dt());
            oJrny.setDptDt(i9, trainInfo.getH_dpt_dt());
            oJrny.setDptTm(i9, trainInfo.getH_dpt_tm());
            oJrny.setDptRsStnCd(i9, trainInfo.getH_dpt_rs_stn_cd());
            oJrny.setDptStnConsOrdr(i9, trainInfo.getH_dpt_stn_cons_ordr());
            oJrny.setDptStnRunOrdr(i9, trainInfo.getH_dpt_stn_run_ordr());
            oJrny.setArvRsStnCd(i9, trainInfo.getH_arv_rs_stn_cd());
            oJrny.setArvStnConsOrdr(i9, trainInfo.getH_arv_stn_cons_ordr());
            oJrny.setArvStnRunOrdr(i9, trainInfo.getH_arv_stn_run_ordr());
            String str = "N";
            oJrny.setChgFlg(i9, "N");
            this.f33488Z.setOJrny(oJrny);
            this.f33488Z.setStndFlg(J.isStndSeat(selectSeatTypeCode, trainInfo.getH_gen_rsv_cd(), trainInfo.getH_stnd_rsv_cd()) ? "Y" : "N");
            OSeat oSeat = new OSeat();
            oSeat.setSeatAttCd4(i9, trainInfo.getH_seat_att_cd());
            oSeat.setPsrmClCd(i9, selectSeatTypeCode);
            this.f33488Z.setOSeat(oSeat);
            t.d("trainInfo.getH_seat_att_cd() = " + trainInfo.getH_seat_att_cd());
            StringBuilder sb = new StringBuilder();
            sb.append("입석 = ");
            if (J.isStndSeat(selectSeatTypeCode, trainInfo.getH_gen_rsv_cd(), trainInfo.getH_stnd_rsv_cd())) {
                str = "Y";
            }
            sb.append(str);
            t.d(sb.toString());
            t.d("자유석 = " + p.NORMAL_FREE.getCode().equals(trainInfo.getH_seat_att_cd()));
            i8 = i9;
        }
        this.f33488Z.getOSrcar().clear();
    }

    @Override // h5.AbstractActivityC5631u
    protected void Q1(int i8) {
        String str = this.f33488Z.getOSeat().get(OSeat.PSRM_CL_CD + (i8 + 1));
        RsvInquiryResponse.TrainInfo trainInfoData = B4.a.getTrainInfoData(E0(), i8);
        t.e("menuID : 11 psrmClCd : " + str + " trainIndex : " + i8);
        Intent intent = new Intent(getApplicationContext(), (Class<?>) SeatSearchActivity.class);
        intent.putExtra("TYPE", "TYPE_ORR_SASVR");
        intent.putExtra("SEAT_SEARCH_REQUEST", E4.b.getSearchRequest("11", str, trainInfoData));
        intent.putExtra("TRAIN_INDEX", i8);
        startActivityForResult(intent, 114);
    }

    @Override // h5.AbstractActivityC5631u, h5.AbstractActivityC5621k, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (-1 == i9 && 114 == i8) {
            OSrcar oSrcar = new OSrcar();
            oSrcar.putAll((Map) M(intent, "SEAT_SELECT_DATA"));
            this.f33488Z.setJobId("1103");
            this.f33488Z.setOSrcar(oSrcar);
        }
    }

    @Override // i5.AbstractActivityC5704d, h5.AbstractActivityC5621k, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        if (C6630d.isNull(bundle)) {
            L0();
        }
    }

    @Override // i5.AbstractActivityC5704d, h5.AbstractActivityC5631u, com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        if (AbstractC5955f.dao_reservation == iBaseDao.getId()) {
            O0((ReservationResponse) iBaseDao.getResponse());
        } else {
            super.onReceive(iBaseDao);
        }
    }

    protected void q2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("WRR800029");
        arrayList.add("ERR911531");
        arrayList.add("ERR911051");
        arrayList.add("ERR911081");
        IBaseDao reservationDao = new ReservationDao();
        reservationDao.setRequest((ReservationRequest) this.f33488Z.clone());
        reservationDao.setErrorMsgCdNotShowDialog(arrayList);
        executeDao(reservationDao);
    }

    protected void r2(ReservationResponse reservationResponse) {
        DReservationData dReservationData = new DReservationData();
        dReservationData.setPaymentType(i.PAYMENT_DEFAULT);
        dReservationData.setPaymentRequest(C4.b.getRsvPaymentRequest(reservationResponse));
        dReservationData.setReservationType(k.SEAT_ASSIGN_N_CARD);
        ArrayList arrayList = new ArrayList();
        arrayList.add(reservationResponse);
        dReservationData.setReservationResponseList(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ReservationMessageData reservationMessageData = new ReservationMessageData();
        reservationMessageData.setMessageList(x.getReservationMessage(getApplicationContext(), F0(), C0(), reservationResponse));
        ReservationMessageData reservationMessageData2 = new ReservationMessageData();
        reservationMessageData2.setTitle(getString(AbstractC5959j.notice_must_know));
        reservationMessageData2.setMessageList(Arrays.asList(getResources().getStringArray(AbstractC5952c.default_commission_message)));
        arrayList2.add(reservationMessageData);
        arrayList2.add(reservationMessageData2);
        dReservationData.setReservationMessageDataList(arrayList2);
        Intent intent = new Intent(getApplicationContext(), (Class<?>) DReservationConfirmActivity.class);
        intent.putExtra("RESERVATION_DATA", dReservationData);
        startActivityForResult(intent, 119);
    }

    @Override // h5.AbstractActivityC5621k
    protected void w0() {
    }
}
