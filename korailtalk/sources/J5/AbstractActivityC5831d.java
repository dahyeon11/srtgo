package j5;

import android.content.Intent;
import android.os.Bundle;
import com.korail.talk.data.reservation.DReservationData;
import com.korail.talk.data.reservation.ReservationMessageData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.reservation.TCReservationDao;
import com.korail.talk.network.data.reservation.RJrny;
import com.korail.talk.network.data.reservation.RSeat;
import com.korail.talk.network.data.reservation.RSrcar;
import com.korail.talk.network.response.certification.ReservationResponse;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse;
import com.korail.talk.ui.reservation.confirm.activity.DReservationConfirmActivity;
import com.korail.talk.ui.seat.SeatSearchActivity;
import i5.AbstractActivityC5703c;
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
import z4.N;
import z4.t;
import z4.x;

/* renamed from: j5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC5831d extends AbstractActivityC5703c {

    /* renamed from: h0, reason: collision with root package name */
    private TCReservationDao.TCReservationRequest f33490h0;

    private void L0() {
        this.f33490h0 = (TCReservationDao.TCReservationRequest) getIntent().getSerializableExtra("RESERVATION_REQUEST");
    }

    @Override // h5.AbstractActivityC5621k
    protected void N0(RsvInquiryResponse.TrainInfo... trainInfoArr) {
        RJrny rJrny = new RJrny();
        rJrny.setJrnyCnt(N.addZero(4, trainInfoArr.length));
        RSeat rSeat = this.f33490h0.getRSeat();
        int i8 = 0;
        while (i8 < trainInfoArr.length) {
            int i9 = i8 + 1;
            String selectSeatTypeCode = B4.a.getSelectSeatTypeCode(D0(), i8);
            RsvInquiryResponse.TrainInfo trainInfo = trainInfoArr[i8];
            rJrny.setJrnySqNo(i9, N.addZero(4, Integer.parseInt((i8 == 0 ? r4.d.DIRECT_SQ_NO : r4.d.TRANSFER_SQ_NO).getCode())));
            rJrny.setJrnyTpCd(i9, (trainInfoArr.length == 1 ? e.DIRECT : e.TRANSFER).getCode());
            rJrny.setTrnNo(i9, N.addZero(5, Integer.parseInt(trainInfo.getH_trn_no())));
            rJrny.setRunDt(i9, trainInfo.getH_run_dt());
            rJrny.setStlbTrnClsfCd(i9, trainInfo.getH_trn_clsf_cd());
            rJrny.setTrnGpCd(i9, trainInfo.getH_trn_gp_cd());
            rJrny.setDptDt(i9, trainInfo.getH_dpt_dt());
            rJrny.setDptTm(i9, trainInfo.getH_dpt_tm());
            rJrny.setDptRsStnCd(i9, trainInfo.getH_dpt_rs_stn_cd());
            rJrny.setDptStnConsOrdr(i9, trainInfo.getH_dpt_stn_cons_ordr());
            rJrny.setDptStnRunOrdr(i9, trainInfo.getH_dpt_stn_run_ordr());
            rJrny.setArvDt(i9, trainInfo.getH_arv_dt());
            rJrny.setArvTm(i9, trainInfo.getH_arv_tm());
            rJrny.setArvRsStnCd(i9, trainInfo.getH_arv_rs_stn_cd());
            rJrny.setArvStnConsOrdr(i9, trainInfo.getH_arv_stn_cons_ordr());
            rJrny.setArvStnRunOrdr(i9, trainInfo.getH_arv_stn_run_ordr());
            String str = "N";
            this.f33490h0.setStndSeatFlg(J.isStndSeat(selectSeatTypeCode, trainInfo.getH_gen_rsv_cd(), trainInfo.getH_stnd_rsv_cd()) ? "Y" : "N");
            rSeat.setSeatCnt(i9, N.addZero(4, trainInfoArr.length));
            rSeat.setRoomClsfCd(i9, 1, selectSeatTypeCode);
            if (J.isFreeSeat(selectSeatTypeCode, trainInfo.getH_gen_rsv_cd(), trainInfo.getH_free_rsv_cd())) {
                rSeat.setRqSeatAttCd(i9, 1, p.NORMAL_FREE.getCode());
            } else {
                rSeat.setRqSeatAttCd(i9, 1, t2());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("입석 = ");
            sb.append(J.isStndSeat(selectSeatTypeCode, trainInfo.getH_gen_rsv_cd(), trainInfo.getH_stnd_rsv_cd()) ? "Y" : "N");
            t.d(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("자유석 = ");
            if (J.isFreeSeat(selectSeatTypeCode, trainInfo.getH_gen_rsv_cd(), trainInfo.getH_free_rsv_cd())) {
                str = "Y";
            }
            sb2.append(str);
            t.d(sb2.toString());
            i8 = i9;
        }
        this.f33490h0.setRJrny(rJrny);
        this.f33490h0.getRSrcar().clear();
    }

    @Override // h5.AbstractActivityC5631u
    protected void Q1(int i8) {
        String str = this.f33490h0.getRSeat().get(RSeat.ROOM_CLSF_CD + (i8 + 1) + "_1");
        RsvInquiryResponse.TrainInfo trainInfoData = B4.a.getTrainInfoData(E0(), i8);
        t.e("menuID : 11 psrmClCd : " + str + " trainIndex : " + i8);
        Intent intent = new Intent(getApplicationContext(), (Class<?>) SeatSearchActivity.class);
        intent.putExtra("TYPE", "TYPE_TCRR_RIR");
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
            this.f33490h0.setRSrcar(rSrcar);
        }
    }

    @Override // i5.AbstractActivityC5703c, h5.AbstractActivityC5621k, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        if (C6630d.isNull(bundle)) {
            L0();
        }
    }

    @Override // i5.AbstractActivityC5703c, h5.AbstractActivityC5631u, com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        if (AbstractC5955f.dao_tc_reservation != iBaseDao.getId()) {
            super.onReceive(iBaseDao);
        } else {
            this.f33490h0 = (TCReservationDao.TCReservationRequest) iBaseDao.getRequest();
            O0((ReservationResponse) iBaseDao.getResponse());
        }
    }

    protected void w2() {
        IBaseDao tCReservationDao = new TCReservationDao();
        TCReservationDao.TCReservationRequest tCReservationRequestM404clone = this.f33490h0.m404clone();
        tCReservationRequestM404clone.setPrcFareReCalcFlg("N");
        tCReservationRequestM404clone.setTmpJobSqno(null);
        tCReservationDao.setRequest(tCReservationRequestM404clone);
        executeDao(tCReservationDao);
    }

    protected void x2(ReservationResponse reservationResponse) {
        TCReservationDao.TCReservationRequest tCReservationRequestM404clone = this.f33490h0.m404clone();
        tCReservationRequestM404clone.setPrcFareReCalcFlg("Y");
        tCReservationRequestM404clone.setTmpJobSqno(reservationResponse.getH_pnr_no());
        DReservationData dReservationData = new DReservationData();
        dReservationData.setPaymentType(i.PAYMENT_TICKET_CHANGE);
        dReservationData.setPaymentRequest(C4.b.getIntgStlRequest(reservationResponse));
        dReservationData.setTcReservationRequest(tCReservationRequestM404clone);
        dReservationData.setReservationType(k.TICKET_CHANGE);
        ArrayList arrayList = new ArrayList();
        arrayList.add(reservationResponse);
        dReservationData.setReservationResponseList(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ReservationMessageData reservationMessageData = new ReservationMessageData();
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add("승차권을 발권받은 스마트폰에서만 확인할 수 있습니다.");
        arrayList3.add("할인승차권 이용시에는 관련 신분증 또는 증명서를 소지하셔야 합니다.");
        String superiorClassMessage = x.getSuperiorClassMessage(reservationResponse);
        if (N.isNotNull(superiorClassMessage)) {
            arrayList3.add(superiorClassMessage);
        }
        reservationMessageData.setMessageList(arrayList3);
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
