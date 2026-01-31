package com.korail.talk.ui.inquiry.rir.orr;

import I4.b;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.common.CookieDao;
import com.korail.talk.network.data.reservation.old.OSeat;
import com.korail.talk.network.data.reservation.old.OSrcar;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse;
import g5.e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import org.json.JSONException;
import org.json.JSONObject;
import r4.c;
import r4.d;
import z4.C6630d;
import z4.C6637k;
import z4.G;
import z4.t;

/* loaded from: classes.dex */
public class TransferInquiryActivity extends a {
    public /* synthetic */ void Q2(DialogInterface dialogInterface, int i8) {
        executeDao(new CookieDao());
    }

    private void R2() {
        C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.srt_manager_dialog_message_reservation)).setButtonListener(new DialogInterface.OnClickListener() { // from class: k5.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f33658a.Q2(dialogInterface, i8);
            }
        }).showDialog();
    }

    @Override // h5.AbstractActivityC5631u, com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) throws JSONException {
        O(view);
        if (AbstractC5955f.bookingBtn != view.getId()) {
            super.onClick(view);
            return;
        }
        if (this.f31585k > -1) {
            if (this.f31607A == 0) {
                e1();
                return;
            }
            if (!G.isInstallApp(K(), G.getIntentDefault(K(), "kr.co.srail.newapp"))) {
                O2();
                return;
            }
            b bVar = b.getInstance();
            try {
                bVar.setPassengerData(this.f31909X.mo405clone());
            } catch (CloneNotSupportedException e8) {
                t.e(e8.getMessage());
            }
            bVar.setCorpTransfer(this.f31607A == 1);
            bVar.setChtnDvCd((this.f31607A == 1 ? d.DIRECT_SQ_NO : d.TRANSFER_SQ_NO).getCode());
            Bundle[] bundleArr = (Bundle[]) ((Bundle) this.f31587m.get(this.f31585k)).getParcelableArray("TRAIN_DATA");
            for (int i8 = 0; i8 < bundleArr.length; i8++) {
                Bundle bundle = bundleArr[i8];
                RsvInquiryResponse.TrainInfo trainInfo = (RsvInquiryResponse.TrainInfo) bundle.getBundle(bundle.getInt(e.KEY_SELECTED_SEAT_TYPE) == 0 ? e.KEY_SEAT_STANDARD : e.KEY_SEAT_SUITE).getSerializable("SRT_TRAIN_DATA");
                if (!"17".equals(trainInfo.getH_trn_clsf_cd())) {
                    OSrcar oSrcar = (OSrcar) this.f33487h0.getOSrcar().clone();
                    N0(trainInfo);
                    this.f33487h0.setOSrcar(oSrcar);
                    OSeat oSeat = new OSeat();
                    oSeat.setPsrmClCd(Integer.parseInt(d.DIRECT_SQ_NO.getCode()), B4.a.getSelectSeatTypeCode(D0(), i8));
                    this.f33487h0.setOSeat(oSeat);
                } else if (this.f31607A == 2 && i8 == 1) {
                    JSONObject jsonObject = bVar.getJsonObject();
                    bVar.setTrainData(jsonObject.optString(b.TRAIN_NO), jsonObject.optString("dptRsStnCd"), trainInfo.getH_arv_rs_stn_cd(), jsonObject.optString(b.DPT_DT), jsonObject.optString(b.DPT_TM));
                } else {
                    bVar.setTrainData(trainInfo.getH_trn_no(), trainInfo.getH_dpt_rs_stn_cd(), trainInfo.getH_arv_rs_stn_cd(), trainInfo.getH_dpt_dt(), trainInfo.getH_dpt_tm());
                }
            }
            if (this.f31607A == 1) {
                R2();
            } else {
                executeDao(new CookieDao());
            }
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
        if (AbstractC5955f.dao_ck_value != iBaseDao.getId()) {
            super.onReceive(iBaseDao);
            return;
        }
        b.getInstance().setMutMrkVrfCd(((CookieDao.RsvWaitResponse) iBaseDao.getResponse()).getMutMrkVrfCd());
        int i8 = this.f31607A;
        if (i8 == 1) {
            e1();
        } else if (i8 == 2) {
            G.playApp(K(), G.getIntentSRT(K(), b.getInstance().getJsonObject()));
        }
    }

    @Override // h5.AbstractActivityC5631u
    protected void setText() {
        super.setText();
        c cVar = this.f31588n;
        if (cVar == c.RSV_DEFAULT) {
            setAppTitle(AbstractC5959j.title_select_train_inquiry);
        } else if (cVar == c.RSV_GOING) {
            setAppTitle(AbstractC5959j.inquiry_train_inquiry_going);
        } else {
            setAppTitle(AbstractC5959j.inquiry_train_inquiry_coming);
        }
        c2(getString(AbstractC5959j.common_transfer), null);
    }
}
