package com.korail.talk.ui.inquiry.rir.orr;

import A6.g;
import I4.h;
import Q7.X;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.certification.ReservationDao;
import com.korail.talk.network.dao.common.CommonCodeDao;
import com.korail.talk.network.dao.common.CookieDao;
import com.korail.talk.network.dao.research.MergeSeatInquiryDao;
import com.korail.talk.network.dao.research.MergeSeatInquiryDao.MergeSeatInquiryRequest;
import com.korail.talk.network.dao.reservationCancel.AutoRsvCancelCheckDao;
import com.korail.talk.network.dao.reservationCancel.AutoRsvCancelCheckDao.AutoRsvCancelCheckRequest;
import com.korail.talk.network.dao.reservationCancel.AutoRsvCancelDao;
import com.korail.talk.network.dao.reservationCancel.AutoRsvCancelDao.AutoRsvCancelRequest;
import com.korail.talk.network.data.reservation.old.OJrny;
import com.korail.talk.network.data.reservation.old.OPsg;
import com.korail.talk.network.data.reservation.old.OSeat;
import com.korail.talk.network.request.inquiry.RsvInquiryRequest;
import com.korail.talk.network.request.reservation.ReservationRequest;
import com.korail.talk.network.response.certification.ReservationResponse;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse;
import com.korail.talk.ui.certification.GovernmentCertificationActivity;
import i5.AbstractActivityC5703c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import org.json.JSONException;
import p4.C6054a;
import q4.C6111b;
import r4.o;
import s4.C6221e;
import y4.C6536a;
import z4.C6630d;
import z4.C6634h;
import z4.C6637k;
import z4.G;
import z4.H;
import z4.N;
import z4.O;
import z4.q;
import z4.t;

/* loaded from: classes.dex */
public class DirectInquiryActivity extends com.korail.talk.ui.inquiry.rir.orr.a {

    /* renamed from: k0 */
    private C6221e f28058k0;

    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Intent f28059a;

        a(Intent intent) {
            this.f28059a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            DirectInquiryActivity.this.startActivityForResult(this.f28059a, 129);
        }
    }

    class b extends Handler {

        /* renamed from: a */
        final /* synthetic */ Runnable f28061a;

        b(Runnable runnable) {
            this.f28061a = runnable;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            g.d dVar = g.d.toEnum(message.what);
            ((AbstractActivityC5703c) DirectInquiryActivity.this).f31911Z.dismiss();
            if (dVar.isContinue()) {
                return;
            }
            ((AbstractActivityC5703c) DirectInquiryActivity.this).f31912a0.dismissDialog();
            if (g.d.Success == dVar) {
                DirectInquiryActivity.this.f28070j0.post(this.f28061a);
            }
            g.END();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DirectInquiryActivity.this.e1();
        }
    }

    class d extends Handler {

        /* renamed from: a */
        final /* synthetic */ Runnable f28064a;

        d(Runnable runnable) {
            this.f28064a = runnable;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            g.d dVar = g.d.toEnum(message.what);
            if (dVar.isContinue() || g.d.UserStop == dVar) {
                return;
            }
            DirectInquiryActivity.this.f28070j0.post(this.f28064a);
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DirectInquiryActivity.this.e1();
        }
    }

    class f extends Handler {

        /* renamed from: a */
        final /* synthetic */ Runnable f28067a;

        f(Runnable runnable) {
            this.f28067a = runnable;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            g.d dVar = g.d.toEnum(message.what);
            ((AbstractActivityC5703c) DirectInquiryActivity.this).f31911Z.dismiss();
            if (dVar.isContinue()) {
                return;
            }
            ((AbstractActivityC5703c) DirectInquiryActivity.this).f31912a0.dismissDialog();
            if (g.d.Success == dVar) {
                DirectInquiryActivity.this.f28070j0.post(this.f28067a);
            }
            g.END();
        }
    }

    private void Z2(ReservationResponse reservationResponse, RsvInquiryResponse.TrainInfos trainInfos) {
        AutoRsvCancelDao autoRsvCancelDao = new AutoRsvCancelDao();
        AutoRsvCancelDao.AutoRsvCancelRequest autoRsvCancelRequest = autoRsvCancelDao.new AutoRsvCancelRequest();
        autoRsvCancelRequest.setTrainInfo(trainInfos);
        autoRsvCancelRequest.setTxtPnrNo(reservationResponse.getH_pnr_no());
        autoRsvCancelRequest.setTxtJrnyCnt(reservationResponse.getH_jrny_cnt());
        autoRsvCancelRequest.setTxtJrnySqno("0001");
        autoRsvCancelRequest.setHidRsvChgNo("000");
        autoRsvCancelRequest.setReservationResponse(reservationResponse);
        autoRsvCancelDao.setRequest(autoRsvCancelRequest);
        executeDao(autoRsvCancelDao);
    }

    private void a3(ReservationResponse reservationResponse, RsvInquiryResponse.TrainInfos trainInfos) {
        AutoRsvCancelCheckDao autoRsvCancelCheckDao = new AutoRsvCancelCheckDao();
        AutoRsvCancelCheckDao.AutoRsvCancelCheckRequest autoRsvCancelCheckRequest = autoRsvCancelCheckDao.new AutoRsvCancelCheckRequest();
        autoRsvCancelCheckRequest.setTrainInfo(trainInfos);
        autoRsvCancelCheckRequest.setTxtPnrNo(reservationResponse.getH_pnr_no());
        autoRsvCancelCheckRequest.setTxtJrnyCnt(reservationResponse.getH_jrny_cnt());
        autoRsvCancelCheckRequest.setTxtJrnySqno("0001");
        autoRsvCancelCheckRequest.setHidRsvChgNo("000");
        autoRsvCancelCheckDao.setRequest(autoRsvCancelCheckRequest);
        executeDao(autoRsvCancelCheckDao);
    }

    private ArrayList d3(List list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(((MergeSeatInquiryDao.MidStnList.MidStationInfo) list.get(i8)).getRsStnNm());
        }
        return arrayList;
    }

    public /* synthetic */ void e3(List list, int i8) {
        c3(((MergeSeatInquiryDao.MidStnList.MidStationInfo) list.get(i8)).getRsStnNm());
    }

    public /* synthetic */ void f3(MergeSeatInquiryDao.MergeSeatInquiryResponse mergeSeatInquiryResponse, DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            Z2(this.f31590p, mergeSeatInquiryResponse.getTrnInfos());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.korail.talk.network.request.inquiry.RsvInquiryRequest[], java.io.Serializable] */
    public /* synthetic */ void g3(DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            finish();
            return;
        }
        if (102 == i8) {
            RsvInquiryRequest rsvInquiryRequest = this.f31909X;
            r4.d dVar = r4.d.TRANSFER_SQ_NO;
            rsvInquiryRequest.setRadJobId(dVar.getCode());
            this.f31910Y[0] = rsvInquiryRequest;
            OJrny oJrny = new OJrny();
            oJrny.setJrnyCnt(dVar.getCode());
            this.f33487h0.setOJrny(oJrny);
            Intent intent = new Intent(getApplicationContext(), (Class<?>) TransferInquiryActivity.class);
            intent.putExtra("IS_DIRECT", false);
            intent.putExtra("RESERVATION_TYPE", C0());
            intent.putExtra("MENU_TYPE", B0());
            intent.putExtra("INQUIRY_REQUEST", (Serializable) this.f31910Y);
            intent.putExtra("RESERVATION_REQUEST", this.f33487h0);
            if (C6630d.isNotNull(this.f31589o)) {
                intent.putExtra("RESERVATION_RESPONSE", this.f31589o);
            }
            intent.putExtra("IS_TRANSFER", C0() != r4.c.RSV_INCOMING);
            intent.addFlags(33554432);
            startActivity(intent);
            overridePendingTransition(0, 0);
            finish();
        }
    }

    public /* synthetic */ void h3(DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            executeDao(new CookieDao());
        }
    }

    private void i3() {
        Bundle trainInfoBundleData = B4.a.getTrainInfoBundleData(D0(), this.f31585k);
        C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.dialog_simultaneous_stop, trainInfoBundleData.getString(g5.e.KEY_TRAIN_DEPARTURE), trainInfoBundleData.getString(g5.e.KEY_TRAIN_ARRIVAL), "") + "\n\n" + getString(AbstractC5959j.srt_manager_dialog_message_direct_execution)).setButtonListener(new DialogInterface.OnClickListener() { // from class: k5.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f33646a.h3(dialogInterface, i8);
            }
        }).showDialog();
    }

    protected void b3(ReservationRequest reservationRequest) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("WRR800029");
        arrayList.add("ERR911531");
        arrayList.add("ERR911051");
        IBaseDao reservationDao = new ReservationDao();
        reservationRequest.setNotNonMemberShow(C0() == r4.c.RSV_GOING || F0());
        reservationDao.setRequest(reservationRequest);
        reservationDao.setErrorMsgCdNotShowDialog(arrayList);
        executeDao(reservationDao);
    }

    protected void c3(String str) {
        MergeSeatInquiryDao mergeSeatInquiryDao = new MergeSeatInquiryDao();
        MergeSeatInquiryDao.MergeSeatInquiryRequest mergeSeatInquiryRequest = mergeSeatInquiryDao.new MergeSeatInquiryRequest();
        OJrny oJrny = this.f33487h0.getOJrny();
        OSeat oSeat = this.f33487h0.getOSeat();
        OPsg oPsg = this.f33487h0.getOPsg();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(OJrny.DPT_DT);
        r4.d dVar = r4.d.DIRECT_SQ_NO;
        sb2.append(dVar.getCode());
        sb.append(oJrny.get(sb2.toString()));
        sb.append(oJrny.get(OJrny.DPT_TM + dVar.getCode()));
        mergeSeatInquiryRequest.setAbrdDt(sb.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(oJrny.get(OJrny.DPT_DT + dVar.getCode()));
        sb3.append(oJrny.get(OJrny.DPT_TM + dVar.getCode()));
        mergeSeatInquiryRequest.setRuntDt(sb3.toString());
        mergeSeatInquiryRequest.setTrnNo(N.addZero(5, Integer.parseInt(oJrny.get(OJrny.TRN_NO + dVar.getCode()))));
        mergeSeatInquiryRequest.setDptRsStnNm(C6111b.getInstance().getStationNameByCode(oJrny.get(OJrny.DPT_RS_STN_CD + dVar.getCode())));
        mergeSeatInquiryRequest.setSelRsStnNm(str);
        mergeSeatInquiryRequest.setArvRsStnNm(C6111b.getInstance().getStationNameByCode(oJrny.get(OJrny.ARV_RS_STN_CD + dVar.getCode())));
        mergeSeatInquiryRequest.setPsrmClCd(oSeat.get(OSeat.PSRM_CL_CD + dVar.getCode()));
        mergeSeatInquiryRequest.setSeatAttCd(oSeat.get(OSeat.SEAT_ATT_CD4));
        mergeSeatInquiryRequest.setTotPsgNum(oPsg.get(OPsg.TOT_PSG_CNT));
        mergeSeatInquiryDao.setRequest(mergeSeatInquiryRequest);
        executeDao(mergeSeatInquiryDao);
    }

    @Override // h5.AbstractActivityC5631u, g5.c
    public void moveToSRT(Bundle bundle) throws JSONException {
        try {
            if (G.isInstallApp(K(), G.getIntentDefault(K(), "kr.co.srail.newapp"))) {
                RsvInquiryResponse.TrainInfo trainInfo = (RsvInquiryResponse.TrainInfo) bundle.getBundle(g5.e.KEY_SEAT_STANDARD).getSerializable("SRT_TRAIN_DATA");
                I4.b bVar = I4.b.getInstance();
                bVar.setChtnDvCd(r4.d.DIRECT_SQ_NO.getCode());
                bVar.setPassengerData(this.f31909X.mo405clone());
                bVar.setTrainData(trainInfo.getH_trn_no(), trainInfo.getH_dpt_rs_stn_cd(), trainInfo.getH_arv_rs_stn_cd(), trainInfo.getH_dpt_dt(), trainInfo.getH_dpt_tm());
                i3();
            } else {
                O2();
            }
        } catch (CloneNotSupportedException e8) {
            t.e(e8.getMessage());
        }
    }

    @Override // j5.AbstractActivityC5828a, h5.AbstractActivityC5631u, h5.AbstractActivityC5621k, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (-1 == i9) {
            if (i8 == 119) {
                showConnectingStationDialog();
                return;
            }
            if (129 == i8) {
                this.f33487h0.setPbepInfo(intent.getStringExtra("PBEP_INFO"));
                t.d("[공무원 인증 완료] pbepInfo : " + this.f33487h0.getPbepInfo());
            }
        }
    }

    @Override // h5.AbstractActivityC5631u, com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        O(view);
        int id = view.getId();
        boolean z8 = C6054a.IS_DEBUG_LOG;
        if (AbstractC5955f.bookingBtn != id) {
            if (AbstractC5955f.bookingBtn1 != id) {
                super.onClick(view);
                return;
            }
            if (this.f31585k > -1) {
                t.e("예약대기 onClick()");
                this.f33487h0.setJobId("1102");
                e eVar = new e();
                if (C6630d.isNull(this.f31912a0) || !this.f31912a0.isShowing()) {
                    this.f31912a0 = new u4.e(this);
                    this.f31911Z = new u4.c(this);
                    this.f31912a0.showDialog();
                    this.f31911Z.show();
                }
                g.BEGIN(r4.g.NETFUNNEL_SERVER_ID, r4.g.NETFUNNEL_ACTION_RESERVE_ID, this.f31912a0, new f(eVar));
                return;
            }
            return;
        }
        if (this.f31585k > -1) {
            t.e("tag = " + this.f31619M.getTag());
            if ("1202".equals((String) this.f31619M.getTag())) {
                this.f33487h0.setJobId("1202");
                t.e("입석+좌석 onClick()");
            } else {
                t.e("일반 예약 onClick() : " + this.f33487h0.getJobId());
            }
            CommonCodeDao.ViewVisibility viewVisibility = (CommonCodeDao.ViewVisibility) q.fromJson(H.getString(getApplicationContext(), "VIEW_VISIBILITY"), CommonCodeDao.ViewVisibility.class);
            t.e("공무원인 경우 인증 먼저. getPbepInfo() = [" + this.f33487h0.getPbepInfo() + "]");
            StringBuilder sb = new StringBuilder();
            sb.append("viewVisibility.getMbilPbepAthn() : ");
            sb.append(viewVisibility.getMbilPbepAthn());
            t.e(sb.toString());
            if (!"Y".equals(viewVisibility.getMbilPbepAthn()) || !h.getInstance().isSejongMember().booleanValue() || !N.isNull(this.f33487h0.getPbepInfo()) || !h.getInstance().isSejongCertification().booleanValue()) {
                c cVar = new c();
                if (C6630d.isNull(this.f31912a0) || !this.f31912a0.isShowing()) {
                    this.f31912a0 = new u4.e(this);
                    this.f31911Z = new u4.c(this);
                    this.f31912a0.showDialog();
                    this.f31911Z.show();
                }
                g.BEGIN(r4.g.NETFUNNEL_SERVER_ID, r4.g.NETFUNNEL_ACTION_RESERVE_ID, this.f31912a0, new d(cVar));
                return;
            }
            OJrny oJrny = this.f33487h0.getOJrny();
            String code = r4.d.DIRECT_SQ_NO.getCode();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C6634h.convertFormat(oJrny.get(OJrny.DPT_DT + code), "yyyyMMdd", "yyyy년 MM월 dd일 (E)"));
            sb2.append(", ");
            sb2.append(O.getTrainGroupName(N.getIntegerString(oJrny.get(OJrny.TRN_GP_CD + code))));
            sb2.append(X.SPACE);
            sb2.append(oJrny.get(OJrny.TRN_NO + code));
            sb2.append(X.LF);
            sb2.append(C6111b.getInstance().getStationNameByCode(oJrny.get(OJrny.DPT_RS_STN_CD + code)));
            sb2.append(X.SPACE);
            sb2.append(C6634h.convertFormat(oJrny.get(OJrny.DPT_TM + code), "HHmmss", "HH:mm"));
            sb2.append(" > ");
            sb2.append(C6111b.getInstance().getStationNameByCode(oJrny.get(OJrny.ARV_RS_STN_CD + code)));
            if (N.isNotNull(oJrny.get("arvTm_" + code))) {
                sb2.append(X.SPACE);
                sb2.append(C6634h.convertFormat(oJrny.get("arvTm_" + code), "HHmmss", "HH:mm"));
            }
            Intent intent = new Intent(getApplicationContext(), (Class<?>) GovernmentCertificationActivity.class);
            intent.putExtra("JOURNEY_INFO", sb2.toString());
            a aVar = new a(intent);
            if (C6630d.isNull(this.f31912a0) || !this.f31912a0.isShowing()) {
                this.f31912a0 = new u4.e(this);
                this.f31911Z = new u4.c(this);
                this.f31912a0.showDialog();
                this.f31911Z.show();
            }
            g.BEGIN(r4.g.NETFUNNEL_SERVER_ID, r4.g.NETFUNNEL_ACTION_RESERVE_ID, this.f31912a0, new b(aVar));
        }
    }

    @Override // com.korail.talk.ui.inquiry.rir.orr.a, j5.AbstractActivityC5828a, i5.AbstractActivityC5703c, h5.AbstractActivityC5621k, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_train_inquiry);
        if (C6630d.isNull(bundle)) {
            m2();
            setText();
            W1();
            s2();
        }
    }

    @Override // com.korail.talk.ui.inquiry.rir.orr.a, j5.AbstractActivityC5828a, i5.AbstractActivityC5703c, h5.AbstractActivityC5631u, com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) throws JSONException {
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_ck_value == id) {
            CookieDao.RsvWaitResponse rsvWaitResponse = (CookieDao.RsvWaitResponse) iBaseDao.getResponse();
            I4.b bVar = I4.b.getInstance();
            bVar.setMutMrkVrfCd(rsvWaitResponse.getMutMrkVrfCd());
            G.playApp(K(), G.getIntentSRT(K(), bVar.getJsonObject()));
            return;
        }
        int i8 = 0;
        if (AbstractC5955f.dao_merge_seat_inquiry == id) {
            final MergeSeatInquiryDao.MergeSeatInquiryResponse mergeSeatInquiryResponse = (MergeSeatInquiryDao.MergeSeatInquiryResponse) iBaseDao.getResponse();
            final List<MergeSeatInquiryDao.MidStnList.MidStationInfo> midStnList = mergeSeatInquiryResponse.getMidStnList();
            if (C6630d.isNull(this.f28058k0) || !this.f28058k0.isShowing()) {
                C6221e c6221e = (C6221e) C6637k.getDialog(6, K(), 1002, 0, getString(AbstractC5959j.dialog_title_connecting_station));
                this.f28058k0 = c6221e;
                c6221e.setStationFilterView(d3(midStnList), 0);
                this.f28058k0.setMidStationSelectListener(new C6221e.c() { // from class: k5.c
                    @Override // s4.C6221e.c
                    public final void onMidStationSelect(int i9) {
                        this.f33648a.e3(midStnList, i9);
                    }
                });
                this.f28058k0.setContent(getString(AbstractC5959j.dialog_content_connecting_station));
                this.f28058k0.setButtonNames(N.getStringArray(getString(AbstractC5959j.common_cancel), getString(AbstractC5959j.common_confirm)));
                this.f28058k0.showDialog();
            }
            this.f28058k0.setTrainInfo(mergeSeatInquiryResponse).setButtonListener(new DialogInterface.OnClickListener() { // from class: k5.d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i9) {
                    this.f33650a.f3(mergeSeatInquiryResponse, dialogInterface, i9);
                }
            });
            return;
        }
        if (AbstractC5955f.dao_auto_rsv_cancel == id) {
            a3(this.f31590p, ((AutoRsvCancelDao.AutoRsvCancelRequest) iBaseDao.getRequest()).getTrainInfo());
            return;
        }
        if (AbstractC5955f.dao_auto_rsv_cancel_check != id) {
            super.onReceive(iBaseDao);
            return;
        }
        List<RsvInquiryResponse.TrainInfo> trn_info = ((AutoRsvCancelCheckDao.AutoRsvCancelCheckRequest) ((AutoRsvCancelCheckDao) iBaseDao).getRequest()).getTrainInfo().getTrn_info();
        ReservationRequest reservationRequest = (ReservationRequest) this.f33487h0.clone();
        OJrny oJrny = new OJrny();
        oJrny.setJrnyCnt(r4.d.TRANSFER_SQ_NO.getCode());
        while (i8 < trn_info.size()) {
            int i9 = i8 + 1;
            RsvInquiryResponse.TrainInfo trainInfo = trn_info.get(i8);
            reservationRequest.setJobId("1101");
            oJrny.setJrnyTpCd(i9, (i8 == 0 ? r4.e.STANDING_SEAT_1 : r4.e.STANDING_SEAT_2).getCode());
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
            oJrny.setChgFlg(i9, "N");
            reservationRequest.setOJrny(oJrny);
            reservationRequest.setStndFlg("Y");
            OSeat oSeat = new OSeat();
            oSeat.setSeatAttCd4(i9, t2());
            oSeat.setPsrmClCd(i9, o.GENERAL.getCode());
            reservationRequest.setOSeat(oSeat);
            i8 = i9;
        }
        b3(reservationRequest);
    }

    @Override // i5.AbstractActivityC5703c, h5.AbstractActivityC5621k, com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        if (AbstractC5955f.dao_train_inquiry != iBaseDao.getId()) {
            super.onReceiveError(iBaseDao, c6536a);
            return;
        }
        if (!"WRD000061".equals(((RsvInquiryResponse) iBaseDao.getResponse()).gethMsgCd())) {
            super.onReceiveError(iBaseDao, c6536a);
            return;
        }
        C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(c6536a.getMessage()).setButtonListener(new DialogInterface.OnClickListener() { // from class: k5.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f33647a.g3(dialogInterface, i8);
            }
        }).showDialog();
        if (C6630d.isNull(this.f31587m) || this.f31587m.isEmpty()) {
            M0(true);
        }
    }

    @Override // h5.AbstractActivityC5631u
    protected void setText() {
        super.setText();
        setAppTitle(this.f31588n == r4.c.RSV_DEFAULT ? AbstractC5959j.inquiry_train_inquiry : AbstractC5959j.inquiry_train_inquiry_going);
        c2("", "");
    }

    public void showConnectingStationDialog() {
        c3("");
    }
}
