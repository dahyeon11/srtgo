package j5;

import I4.h;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.korail.talk.data.reservation.DReservationData;
import com.korail.talk.data.reservation.ReservationMessageData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.NetfunnelDao;
import com.korail.talk.network.dao.certification.ReservationDao;
import com.korail.talk.network.data.reservation.old.OJrny;
import com.korail.talk.network.data.reservation.old.OSeat;
import com.korail.talk.network.data.reservation.old.OSrcar;
import com.korail.talk.network.request.reservation.ReservationRequest;
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
import r4.EnumC6175b;
import r4.e;
import r4.i;
import r4.k;
import r4.p;
import z4.C6630d;
import z4.J;
import z4.O;
import z4.t;
import z4.x;

/* renamed from: j5.a */
/* loaded from: classes.dex */
public abstract class AbstractActivityC5828a extends AbstractActivityC5703c {

    /* renamed from: h0 */
    protected ReservationRequest f33487h0;

    private void L0() {
        this.f33487h0 = (ReservationRequest) getIntent().getSerializableExtra("RESERVATION_REQUEST");
        t.d("setData - " + this);
        t.d("chtnrsStnCd - " + getIntent().getStringExtra("TRANSFER_CHTNRSSTNCD") + " trngpcd - " + getIntent().getStringExtra("TRANSFER_TRNGPCD"));
    }

    @Override // h5.AbstractActivityC5621k
    protected String A0() {
        return this.f33487h0.getMenuId();
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
            this.f33487h0.setJobId("1101");
            oJrny.setJrnyTpCd(i9, (trainInfoArr.length == 1 ? e.DIRECT : e.TRANSFER).getCode());
            oJrny.setJrnySqNo(i9, O.getSequenceNo((i8 == 0 ? r4.d.DIRECT_SQ_NO : r4.d.TRANSFER_SQ_NO).getCode()));
            oJrny.setTrnNo(i9, trainInfo.getH_trn_no());
            oJrny.setTrnClsfCd(i9, trainInfo.getH_trn_clsf_cd());
            oJrny.setTrnGpCd(i9, trainInfo.getH_trn_gp_cd());
            oJrny.setRunDt(i9, trainInfo.getH_run_dt());
            oJrny.setDptDt(i9, trainInfo.getH_dpt_dt());
            oJrny.setDptTm(i9, trainInfo.getH_dpt_tm());
            oJrny.setArvTm(i9, trainInfo.getH_arv_tm());
            oJrny.setDptRsStnCd(i9, trainInfo.getH_dpt_rs_stn_cd());
            oJrny.setDptStnConsOrdr(i9, trainInfo.getH_dpt_stn_cons_ordr());
            oJrny.setDptStnRunOrdr(i9, trainInfo.getH_dpt_stn_run_ordr());
            oJrny.setArvRsStnCd(i9, trainInfo.getH_arv_rs_stn_cd());
            oJrny.setArvStnConsOrdr(i9, trainInfo.getH_arv_stn_cons_ordr());
            oJrny.setArvStnRunOrdr(i9, trainInfo.getH_arv_stn_run_ordr());
            String str = "N";
            oJrny.setChgFlg(i9, "N");
            this.f33487h0.setOJrny(oJrny);
            if (i8 == 0) {
                this.f33487h0.setStndFlg(J.isStndSeat(selectSeatTypeCode, trainInfo.getH_gen_rsv_cd(), trainInfo.getH_stnd_rsv_cd()) ? "Y" : "N");
            } else if ("N".equals(this.f33487h0.getStndFlg())) {
                this.f33487h0.setStndFlg(J.isStndSeat(selectSeatTypeCode, trainInfo.getH_gen_rsv_cd(), trainInfo.getH_stnd_rsv_cd()) ? "Y" : "N");
            }
            OSeat oSeat = new OSeat();
            if (J.isFreeSeat(selectSeatTypeCode, trainInfo.getH_gen_rsv_cd(), trainInfo.getH_free_rsv_cd())) {
                oSeat.setSeatAttCd4(i9, p.NORMAL_FREE.getCode());
            } else {
                oSeat.setSeatAttCd4(i9, t2());
            }
            oSeat.setPsrmClCd(i9, selectSeatTypeCode);
            this.f33487h0.setOSeat(oSeat);
            t.d("-----------------------------------------------------------------------");
            StringBuilder sb = new StringBuilder();
            sb.append("입석 = ");
            sb.append(J.isStndSeat(selectSeatTypeCode, trainInfo.getH_gen_rsv_cd(), trainInfo.getH_stnd_rsv_cd()) ? "Y" : "N");
            t.d(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("자유석 = ");
            sb2.append(J.isFreeSeat(selectSeatTypeCode, trainInfo.getH_gen_rsv_cd(), trainInfo.getH_free_rsv_cd()) ? "Y" : "N");
            t.d(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("SRT = ");
            if ("17".equals(trainInfo.getH_trn_clsf_cd())) {
                str = "Y";
            }
            sb3.append(str);
            t.d(sb3.toString());
            t.d("-----------------------------------------------------------------------");
            i8 = i9;
        }
        this.f33487h0.getOSrcar().clear();
    }

    @Override // h5.AbstractActivityC5631u
    protected void Q1(int i8) {
        String menuId = this.f33487h0.getMenuId();
        String str = this.f33487h0.getOSeat().get(OSeat.PSRM_CL_CD + (i8 + 1));
        RsvInquiryResponse.TrainInfo trainInfoData = B4.a.getTrainInfoData(E0(), i8);
        t.e("menuID : " + menuId + " psrmClCd : " + str + " trainIndex : " + i8);
        Intent intent = new Intent(getApplicationContext(), (Class<?>) SeatSearchActivity.class);
        intent.putExtra("TYPE", "TYPE_ORR_RIR");
        intent.putExtra("SEAT_SEARCH_REQUEST", E4.b.getSearchRequest(menuId, str, trainInfoData));
        if (this.f31607A == 1) {
            i8 = 0;
        }
        intent.putExtra("TRAIN_INDEX", i8);
        startActivityForResult(intent, 114);
    }

    @Override // h5.AbstractActivityC5631u, h5.AbstractActivityC5621k, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (-1 == i9) {
            t.d("좌석선택 데이터 넣기.");
            if (114 == i8) {
                OSrcar oSrcar = new OSrcar();
                oSrcar.putAll((Map) M(intent, "SEAT_SELECT_DATA"));
                this.f33487h0.setJobId("1103");
                this.f33487h0.setOSrcar(oSrcar);
            }
        }
    }

    @Override // i5.AbstractActivityC5703c, h5.AbstractActivityC5621k, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        if (C6630d.isNull(bundle)) {
            L0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity
    public void onNonMemberLoginSuccess() {
        x2();
    }

    @Override // i5.AbstractActivityC5703c, h5.AbstractActivityC5631u, com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        if (AbstractC5955f.dao_reservation == iBaseDao.getId()) {
            O0((ReservationResponse) iBaseDao.getResponse());
        } else {
            super.onReceive(iBaseDao);
        }
    }

    protected void w2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("WRR800029");
        arrayList.add("ERR911531");
        arrayList.add("ERR911051");
        arrayList.add("ERR911081");
        ReservationDao reservationDao = new ReservationDao();
        ReservationRequest reservationRequest = (ReservationRequest) this.f33487h0.clone();
        reservationDao.setErrorMsgCdNotShowDialog(arrayList);
        reservationRequest.setNotNonMemberShow(C0() == r4.c.RSV_GOING || F0());
        reservationDao.setRequest(reservationRequest);
        reservationDao.setNetfunnelDao(new NetfunnelDao(this.f31911Z, this.f31912a0, null, new Handler(getMainLooper())));
        executeDao(reservationDao);
    }

    protected void x2() {
        h hVar = h.getInstance();
        IBaseDao reservationDao = new ReservationDao();
        ReservationRequest reservationRequest = (ReservationRequest) this.f33487h0.clone();
        reservationRequest.setCustNm(hVar.getNonMemberName());
        reservationRequest.setCpNo(hVar.getNonMemberPhoneNumber());
        reservationRequest.setCustPw(hVar.getNonMemberPassword());
        reservationDao.setRequest(reservationRequest);
        executeDao(reservationDao);
    }

    protected abstract ReservationResponse y2();

    protected void z2(ReservationResponse reservationResponse) {
        DReservationData dReservationData = new DReservationData();
        dReservationData.setPaymentType("Y".equals(reservationResponse.getH_fmly_info_cfm_flg()) ? i.PAYMENT_MULTI_CHILD : i.PAYMENT_DEFAULT);
        dReservationData.setPaymentRequest(C4.b.getRsvPaymentRequest(reservationResponse));
        dReservationData.setReservationType(k.DEFAULT);
        ArrayList arrayList = new ArrayList();
        ReservationResponse reservationResponseY2 = y2();
        if (C6630d.isNotNull(reservationResponseY2)) {
            arrayList.add(reservationResponseY2);
        }
        arrayList.add(reservationResponse);
        dReservationData.setReservationResponseList(arrayList);
        dReservationData.setLinkageReservation(arrayList.size() >= 2);
        ArrayList arrayList2 = new ArrayList();
        ReservationMessageData reservationMessageData = new ReservationMessageData();
        reservationMessageData.setMessageList(x.getReservationMessage(getApplicationContext(), F0(), C0(), reservationResponse));
        arrayList2.add(reservationMessageData);
        if (EnumC6175b.THEME_DISCOUNT == B0() || !C6630d.isNull(y2())) {
            ReservationMessageData reservationMessageData2 = new ReservationMessageData();
            reservationMessageData2.setTitle(getString(AbstractC5959j.notice_must_know));
            int i8 = AbstractC5952c.default_commission_message;
            if (p.WHEELCHAIR.getCode().equals(t2())) {
                i8 = AbstractC5952c.wheelchair_seat_commission_message;
            }
            reservationMessageData2.setMessageList(Arrays.asList(getResources().getStringArray(i8)));
            arrayList2.add(reservationMessageData2);
        } else {
            ReservationMessageData reservationMessageData3 = new ReservationMessageData();
            reservationMessageData3.setTitle(getString(AbstractC5959j.notice_must_know));
            int i9 = AbstractC5952c.default_commission_message;
            if (p.WHEELCHAIR.getCode().equals(t2())) {
                i9 = AbstractC5952c.wheelchair_seat_commission_message;
            }
            reservationMessageData3.setMessageList(Arrays.asList(getResources().getStringArray(i9)));
            arrayList2.add(reservationMessageData3);
        }
        dReservationData.setReservationMessageDataList(arrayList2);
        Intent intent = new Intent(getApplicationContext(), (Class<?>) DReservationConfirmActivity.class);
        intent.putExtra("RESERVATION_DATA", dReservationData);
        startActivityForResult(intent, 119);
    }

    @Override // h5.AbstractActivityC5621k
    protected void w0() {
    }
}
