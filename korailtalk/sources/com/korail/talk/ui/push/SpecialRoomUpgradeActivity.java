package com.korail.talk.ui.push;

import E4.b;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.h2osystech.smartalimi.aidllib.MSGVo;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.myTicket.SpecialRoomUpgradeDao;
import com.korail.talk.network.dao.myTicket.SpecialRoomUpgradeProcessDao;
import com.korail.talk.network.dao.research.CmtrInfoDao;
import com.korail.talk.network.request.myTicket.PushUpdateRequest;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse.TrainInfo;
import com.korail.talk.ui.seat.SeatSearchActivity;
import com.korail.talk.view.base.BaseActivity;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.HashMap;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import org.json.JSONException;
import org.json.JSONObject;
import p4.C6054a;
import r4.o;
import y4.C6536a;
import z4.C6630d;
import z4.C6637k;
import z4.N;

/* loaded from: classes.dex */
public class SpecialRoomUpgradeActivity extends BaseActivity {

    /* renamed from: e */
    private final String f28591e = "KTX";

    /* renamed from: f */
    private final String f28592f = "00";

    /* renamed from: g */
    private final String f28593g = "100";

    /* renamed from: h */
    protected final String f28594h = C6054a.AFTER_DEPARTURE;

    /* renamed from: i */
    private final int f28595i = 1;

    /* renamed from: j */
    private final int f28596j = 0;

    private void A0(SpecialRoomUpgradeDao.SpecialRoomUpgradeResponse specialRoomUpgradeResponse) throws NumberFormatException {
        String str = specialRoomUpgradeResponse.gethMsgCd();
        if (!"IRT000000".equals(str) && !"MRT200105".equals(str)) {
            x0(specialRoomUpgradeResponse.gethMsgTxt());
            return;
        }
        final SpecialRoomUpgradeDao.TicketInfo ticketInfo = specialRoomUpgradeResponse.getTicketInfo();
        final SpecialRoomUpgradeDao.Jrnys jrnys = specialRoomUpgradeResponse.getJrnys().get(0);
        C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.title_cart_upgrade)).setContent("KTX마일리지 " + new DecimalFormat("#,###").format(Integer.parseInt(ticketInfo.getScnIndcAmt())) + "점을 차감하여 특실로 업그레이드 하시겠습니까?").setButtonListener(new DialogInterface.OnClickListener() { // from class: L5.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f3070a.t0(ticketInfo, jrnys, dialogInterface, i8);
            }
        }).showDialog();
    }

    private SpecialRoomUpgradeProcessDao.SpecialRoomUpgradeProcessRequest B0(SpecialRoomUpgradeDao.TicketInfo ticketInfo, SpecialRoomUpgradeDao.Jrnys jrnys) {
        SpecialRoomUpgradeProcessDao.SpecialRoomUpgradeProcessRequest specialRoomUpgradeProcessRequest = new SpecialRoomUpgradeProcessDao.SpecialRoomUpgradeProcessRequest();
        specialRoomUpgradeProcessRequest.setTotTxnAmt(N.getIntegerString(ticketInfo.getTotFare()));
        specialRoomUpgradeProcessRequest.setTotCncRetAmt("0");
        specialRoomUpgradeProcessRequest.setTotCncRetFee("0");
        specialRoomUpgradeProcessRequest.setLumpStlTgtNo(jrnys.getLumpStlTgtNo());
        specialRoomUpgradeProcessRequest.setMnsGridcnt("1");
        specialRoomUpgradeProcessRequest.setStlMnsSqno("1");
        specialRoomUpgradeProcessRequest.setStlMnsCd("12");
        specialRoomUpgradeProcessRequest.setMnsStlAmt(N.getIntegerString(ticketInfo.getScnIndcAmt()));
        specialRoomUpgradeProcessRequest.setCrdInpWayCd("@");
        specialRoomUpgradeProcessRequest.setIsmtMnthNum("0");
        specialRoomUpgradeProcessRequest.setPontDvCd("1");
        specialRoomUpgradeProcessRequest.setPontInpDvCd("1");
        specialRoomUpgradeProcessRequest.setFeeProyStlSqno("0");
        specialRoomUpgradeProcessRequest.setPrepCrdTxnAftAmt("0");
        specialRoomUpgradeProcessRequest.setPrepCrdTxnBfAmt("0");
        return specialRoomUpgradeProcessRequest;
    }

    private void l0(PushUpdateRequest pushUpdateRequest) {
        SpecialRoomUpgradeDao specialRoomUpgradeDao = new SpecialRoomUpgradeDao();
        specialRoomUpgradeDao.setRequest(pushUpdateRequest);
        specialRoomUpgradeDao.setNotShowDialog(true);
        executeDao(specialRoomUpgradeDao);
    }

    private void m0(SpecialRoomUpgradeDao.TicketInfo ticketInfo, SpecialRoomUpgradeDao.Jrnys jrnys) {
        SpecialRoomUpgradeProcessDao specialRoomUpgradeProcessDao = new SpecialRoomUpgradeProcessDao();
        specialRoomUpgradeProcessDao.setRequest(B0(ticketInfo, jrnys));
        specialRoomUpgradeProcessDao.setNotShowDialog(true);
        executeDao(specialRoomUpgradeProcessDao);
    }

    private PushUpdateRequest n0() {
        PushUpdateRequest pushUpdateRequest = new PushUpdateRequest();
        try {
            JSONObject jSONObject = new JSONObject(((MSGVo) getIntent().getParcelableExtra("msg_vo")).getParam());
            pushUpdateRequest.setOgtkSaleDd(jSONObject.optString(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_A));
            pushUpdateRequest.setOgtkSaleWctNo(jSONObject.optString(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_B));
            pushUpdateRequest.setOgtkSaleSqno(jSONObject.optString(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_C));
            pushUpdateRequest.setOgtkRetPwd(jSONObject.optString("d"));
            pushUpdateRequest.setJrnyTpCd(jSONObject.optString("e"));
            pushUpdateRequest.setJrnySqno(jSONObject.optString("f"));
            pushUpdateRequest.setDptDt(jSONObject.optString("g"));
            pushUpdateRequest.setDptStnConsOrdr(jSONObject.optString("h"));
            pushUpdateRequest.setDptStnRunOrdr(jSONObject.optString("i"));
            pushUpdateRequest.setDptRsStnCd(jSONObject.optString("j"));
            pushUpdateRequest.setDptTm(jSONObject.optString("k"));
            pushUpdateRequest.setArvDt(jSONObject.optString("l"));
            pushUpdateRequest.setArvStnConsOrdr(jSONObject.optString("m"));
            pushUpdateRequest.setArvStnRunOrdr(jSONObject.optString("n"));
            pushUpdateRequest.setArvRsStnCd(jSONObject.optString("o"));
            pushUpdateRequest.setArvTm(jSONObject.optString("p"));
            pushUpdateRequest.setTrnNo(jSONObject.optString("q"));
            pushUpdateRequest.setRunDt(jSONObject.optString("r"));
            pushUpdateRequest.setRoomClsfCd(jSONObject.optString("t"));
            pushUpdateRequest.setTrnGpCd("100");
        } catch (JSONException unused) {
            finish();
        }
        return pushUpdateRequest;
    }

    private RsvInquiryResponse.TrainInfo o0() {
        RsvInquiryResponse.TrainInfo trainInfo = new RsvInquiryResponse().new TrainInfo();
        try {
            JSONObject jSONObject = new JSONObject(((MSGVo) getIntent().getParcelableExtra("msg_vo")).getParam());
            trainInfo.setH_run_dt(jSONObject.optString("r"));
            trainInfo.setH_dpt_dt(jSONObject.optString("g"));
            trainInfo.setH_trn_no(jSONObject.optString("q"));
            trainInfo.setH_dpt_rs_stn_cd(jSONObject.optString("j"));
            trainInfo.setH_arv_rs_stn_cd(jSONObject.optString("o"));
            trainInfo.setH_dpt_stn_run_ordr(jSONObject.optString("i"));
            trainInfo.setH_arv_stn_run_ordr(jSONObject.optString("n"));
            trainInfo.setH_trn_clsf_nm("KTX");
            trainInfo.setH_trn_clsf_cd("00");
            trainInfo.setH_trn_gp_cd("100");
            trainInfo.setH_seat_att_cd(C6054a.AFTER_DEPARTURE);
            trainInfo.setTotPsgCnt(1);
        } catch (JSONException unused) {
            finish();
        }
        return trainInfo;
    }

    public /* synthetic */ void p0(DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            finish();
            return;
        }
        if (102 == i8) {
            PushUpdateRequest pushUpdateRequestN0 = n0();
            pushUpdateRequestN0.setScarNo("");
            pushUpdateRequestN0.setSeatNo("");
            pushUpdateRequestN0.setRqSeatAttCd(C6054a.AFTER_DEPARTURE);
            l0(pushUpdateRequestN0);
        }
    }

    public /* synthetic */ void q0(DialogInterface dialogInterface, int i8) {
        finish();
    }

    public /* synthetic */ void r0(DialogInterface dialogInterface, int i8) {
        v0();
    }

    public /* synthetic */ void s0(DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            finish();
        } else if (102 == i8) {
            u0();
        }
    }

    public /* synthetic */ void t0(SpecialRoomUpgradeDao.TicketInfo ticketInfo, SpecialRoomUpgradeDao.Jrnys jrnys, DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            finish();
        } else if (102 == i8) {
            m0(ticketInfo, jrnys);
        }
    }

    private void u0() {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) SeatSearchActivity.class);
        intent.putExtra("TYPE", "TYPE_PUSH");
        intent.putExtra("SEAT_SEARCH_REQUEST", b.getSearchRequest("11", o.SPECIAL.getCode(), o0()));
        intent.putExtra("TRAIN_INDEX", 0);
        startActivityForResult(intent, 114);
    }

    private void v0() {
        Intent intent = new Intent();
        intent.setData(Uri.parse(getString(AbstractC5959j.navigation_ticket)));
        intent.setFlags(872415232);
        startActivity(intent);
        finish();
    }

    private void w0(String str) {
        C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.title_cart_upgrade)).setContent(str).setButtonNames(N.getStringArray(getString(AbstractC5959j.common_no), getString(AbstractC5959j.tss_dialog_random_seat))).setButtonListener(new DialogInterface.OnClickListener() { // from class: L5.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f3067a.p0(dialogInterface, i8);
            }
        }).showDialog();
    }

    private void x0(String str) {
        C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.title_cart_upgrade)).setContent(str).setButtonListener(new DialogInterface.OnClickListener() { // from class: L5.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f3073a.q0(dialogInterface, i8);
            }
        }).showDialog();
    }

    private void y0() {
        C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.title_cart_upgrade)).setContent("변경이 완료되었습니다. 승차권목록으로 이동합니다.").setButtonListener(new DialogInterface.OnClickListener() { // from class: L5.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f3069a.r0(dialogInterface, i8);
            }
        }).showDialog();
    }

    private void z0() {
        MSGVo mSGVo = (MSGVo) getIntent().getParcelableExtra("msg_vo");
        if (C6630d.isNull(mSGVo)) {
            finish();
        } else {
            C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.title_cart_upgrade)).setContent(mSGVo.getContent()).setButtonNames(N.getStringArray(getString(AbstractC5959j.tss_dialog_cancel), getString(AbstractC5959j.tss_dialog_select_seat))).setButtonListener(new DialogInterface.OnClickListener() { // from class: L5.e
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f3068a.s0(dialogInterface, i8);
                }
            }).showDialog();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (-1 != i9) {
            if (i9 == 0 && 114 == i8) {
                w0((C6630d.isNotNull(intent) && intent.hasExtra("MAP_TIME_OUT_MESSAGE")) ? intent.getStringExtra("MAP_TIME_OUT_MESSAGE") : getString(AbstractC5959j.tss_dialog_cancel_seat_select));
                return;
            }
            return;
        }
        if (114 == i8) {
            HashMap map = (HashMap) M(intent, "SEAT_SELECT_DATA");
            PushUpdateRequest pushUpdateRequestN0 = n0();
            pushUpdateRequestN0.setScarNo((String) map.get("tss_srcar_no"));
            pushUpdateRequestN0.setSeatNo((String) map.get("tss_seat_no"));
            pushUpdateRequestN0.setRqSeatAttCd(C6054a.AFTER_DEPARTURE);
            l0(pushUpdateRequestN0);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_empty);
        z0();
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) throws NumberFormatException {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_cart_upgrade_service == id) {
            A0((SpecialRoomUpgradeDao.SpecialRoomUpgradeResponse) iBaseDao.getResponse());
            return;
        }
        if (AbstractC5955f.dao_cart_upgradeproc_service == id) {
            BaseResponse response = iBaseDao.getResponse();
            if ("WRTP20000".equals(response.gethMsgCd())) {
                y0();
            } else {
                x0(response.gethMsgTxt());
            }
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_cart_upgrade_service != id) {
            if (AbstractC5955f.dao_cart_upgradeproc_service == id) {
                x0(iBaseDao.getResponse().gethMsgTxt());
                return;
            }
            return;
        }
        SpecialRoomUpgradeDao.SpecialRoomUpgradeResponse specialRoomUpgradeResponse = (SpecialRoomUpgradeDao.SpecialRoomUpgradeResponse) iBaseDao.getResponse();
        String str = specialRoomUpgradeResponse.gethMsgCd();
        if ("WRI411345".equals(str)) {
            w0(getString(AbstractC5959j.tss_dialog_no_seat));
        } else if ("ERR211161".equals(str)) {
            x0(getString(AbstractC5959j.tss_dialog_no_left_seat));
        } else {
            x0(specialRoomUpgradeResponse.gethMsgTxt());
        }
    }
}
