package j5;

import android.content.Intent;
import android.os.Bundle;
import com.korail.talk.data.reservation.DReservationData;
import com.korail.talk.data.reservation.ReservationMessageData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.reservation.SeatAssignReservationDao;
import com.korail.talk.network.data.reservation.RJrny;
import com.korail.talk.network.data.reservation.RSeat;
import com.korail.talk.network.data.reservation.RSrcar;
import com.korail.talk.network.response.certification.ReservationResponse;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse;
import com.korail.talk.ui.inquiry.sasv.sar.APassDirectInquiryActivity;
import com.korail.talk.ui.reservation.confirm.activity.DReservationConfirmActivity;
import com.korail.talk.ui.seat.SeatSearchActivity;
import i5.AbstractActivityC5704d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
import z4.N;
import z4.O;
import z4.t;
import z4.x;

/* renamed from: j5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC5830c extends AbstractActivityC5704d {

    /* renamed from: Z, reason: collision with root package name */
    protected SeatAssignReservationDao.SeatAssignReservationRequest f33489Z;

    private void L0() {
        this.f33489Z = (SeatAssignReservationDao.SeatAssignReservationRequest) getIntent().getSerializableExtra("RESERVATION_REQUEST");
    }

    @Override // h5.AbstractActivityC5621k
    protected void N0(RsvInquiryResponse.TrainInfo... trainInfoArr) {
        RJrny rJrny = new RJrny();
        rJrny.setJrnyCnt(N.addZero(4, trainInfoArr.length));
        RSeat rSeat = this.f33489Z.getRSeat();
        int i8 = 0;
        while (i8 < trainInfoArr.length) {
            int i9 = i8 + 1;
            RsvInquiryResponse.TrainInfo trainInfo = trainInfoArr[i8];
            String selectSeatTypeCode = B4.a.getSelectSeatTypeCode(D0(), i8);
            rJrny.setJrnySqNo(i9, O.getSequenceNo(r4.d.DIRECT_SQ_NO.getCode()));
            rJrny.setJrnyTpCd(i9, e.DIRECT.getCode());
            rJrny.setTrnNo(i9, N.addZero(5, Integer.parseInt(trainInfo.getH_trn_no())));
            rJrny.setRunDt(i9, trainInfo.getH_run_dt());
            rJrny.setStlbTrnClsfCd(i9, trainInfo.getH_trn_clsf_cd());
            rJrny.setTrnGpCd(i9, trainInfo.getH_trn_gp_cd());
            rJrny.setDptDt(i9, trainInfo.getH_dpt_dt());
            rJrny.setDptTm(i9, trainInfo.getH_dpt_tm());
            rJrny.setDptRsStnCd(i9, trainInfo.getH_dpt_rs_stn_cd());
            rJrny.setDptStnConsOrdr(i9, trainInfo.getH_dpt_stn_cons_ordr());
            rJrny.setDptStnRunOrdr(i9, trainInfo.getH_dpt_stn_run_ordr());
            rJrny.setArvRsStnCd(i9, trainInfo.getH_arv_rs_stn_cd());
            rJrny.setArvStnConsOrdr(i9, trainInfo.getH_arv_stn_cons_ordr());
            rJrny.setArvStnRunOrdr(i9, trainInfo.getH_arv_stn_run_ordr());
            String str = "N";
            rJrny.setChgFlg(i9, "N");
            this.f33489Z.setStndFlg(J.isStndSeat(selectSeatTypeCode, trainInfo.getH_gen_rsv_cd(), trainInfo.getH_stnd_rsv_cd()) ? "Y" : "N");
            rSeat.setRqSeatAttCd(i9, 1, trainInfo.getH_seat_att_cd());
            rSeat.setSeatPsrmClCd(i9, 1, selectSeatTypeCode);
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
        this.f33489Z.setRJrny(rJrny);
        this.f33489Z.getRSrcar().clear();
    }

    @Override // h5.AbstractActivityC5631u
    protected void Q1(int i8) {
        String str = this.f33489Z.getRSeat().get(RSeat.SEAT_PSRM_CL_CD + (i8 + 1) + "_1");
        RsvInquiryResponse.TrainInfo trainInfoData = B4.a.getTrainInfoData(E0(), i8);
        t.e("menuID : 11 psrmClCd : " + str + " trainIndex : " + i8);
        Intent intent = new Intent(getApplicationContext(), (Class<?>) SeatSearchActivity.class);
        intent.putExtra("TYPE", "TYPE_SARR_SASVR");
        intent.putExtra("SEAT_SEARCH_REQUEST", E4.b.getSearchRequest("11", str, trainInfoData));
        intent.putExtra("TRAIN_INDEX", i8);
        startActivityForResult(intent, 114);
    }

    @Override // h5.AbstractActivityC5631u, h5.AbstractActivityC5621k, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (-1 == i9 && 114 == i8) {
            RSrcar rSrcar = new RSrcar();
            rSrcar.putAll((Map) M(intent, "SEAT_SELECT_DATA"));
            this.f33489Z.setRSrcar(rSrcar);
        }
    }

    @Override // i5.AbstractActivityC5704d, h5.AbstractActivityC5621k, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C6630d.isNull(bundle)) {
            L0();
        }
    }

    @Override // i5.AbstractActivityC5704d, h5.AbstractActivityC5631u, com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        if (AbstractC5955f.dao_seat_assign_reservation == iBaseDao.getId()) {
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
        IBaseDao seatAssignReservationDao = new SeatAssignReservationDao();
        seatAssignReservationDao.setRequest(this.f33489Z.m403clone());
        seatAssignReservationDao.setErrorMsgCdNotShowDialog(arrayList);
        executeDao(seatAssignReservationDao);
    }

    protected void r2(ReservationResponse reservationResponse) {
        List<String> listAsList;
        DReservationData dReservationData = new DReservationData();
        dReservationData.setPaymentType(i.PAYMENT_DEFAULT);
        dReservationData.setPaymentRequest(C4.b.getRsvPaymentRequest(reservationResponse));
        dReservationData.setReservationType(k.SEAT_ASSIGN_COMMUTATION);
        ArrayList arrayList = new ArrayList();
        arrayList.add(reservationResponse);
        dReservationData.setReservationResponseList(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ReservationMessageData reservationMessageData = new ReservationMessageData();
        reservationMessageData.setTitle(getString(AbstractC5959j.notice_must_know));
        if (this instanceof APassDirectInquiryActivity) {
            dReservationData.setReservationType(k.SEAT_ASSIGN_PASS);
            listAsList = Arrays.asList(getResources().getStringArray(AbstractC5952c.seat_assign_pass_commission_message));
        } else {
            listAsList = Arrays.asList(getResources().getStringArray(AbstractC5952c.seat_assign_commutation_commission_message));
        }
        String superiorClassMessage = x.getSuperiorClassMessage(reservationResponse);
        if (N.isNotNull(superiorClassMessage)) {
            listAsList.add(superiorClassMessage);
        }
        reservationMessageData.setMessageList(listAsList);
        arrayList2.add(reservationMessageData);
        dReservationData.setReservationMessageDataList(arrayList2);
        Intent intent = new Intent(getApplicationContext(), (Class<?>) DReservationConfirmActivity.class);
        intent.putExtra("RESERVATION_DATA", dReservationData);
        startActivityForResult(intent, 119);
    }

    @Override // h5.AbstractActivityC5621k
    protected void w0() {
    }
}
