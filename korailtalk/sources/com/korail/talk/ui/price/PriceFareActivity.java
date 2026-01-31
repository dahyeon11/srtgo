package com.korail.talk.ui.price;

import android.content.DialogInterface;
import android.os.Bundle;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.trainsInfo.Price2FareDao;
import com.korail.talk.network.dao.trainsInfo.Price2FareDao.Price2FareParams;
import com.korail.talk.network.dao.trainsInfo.Price2FareDao.Price2FareRequest;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse;
import com.korail.talk.view.base.BaseActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import r4.d;
import s4.y;
import z4.C6630d;
import z4.C6637k;
import z4.N;

/* loaded from: classes.dex */
public class PriceFareActivity extends BaseActivity {

    /* renamed from: e, reason: collision with root package name */
    private int f28556e;

    /* renamed from: f, reason: collision with root package name */
    private String f28557f;

    /* renamed from: g, reason: collision with root package name */
    private String f28558g;

    /* renamed from: h, reason: collision with root package name */
    private RsvInquiryResponse.TrainInfo f28559h;

    /* renamed from: i, reason: collision with root package name */
    private RsvInquiryResponse.TrainInfo f28560i;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i0(DialogInterface dialogInterface, int i8) {
        finish();
        overridePendingTransition(0, 0);
    }

    private void k0() {
        this.f28557f = getIntent().getStringExtra("JRNY_COUNT");
        this.f28558g = getIntent().getStringExtra("MENU_ID");
        this.f28556e = getIntent().getIntExtra("TRAIN_SELECT_INDEX", -1);
        this.f28559h = (RsvInquiryResponse.TrainInfo) getIntent().getSerializableExtra("FIRST_TRAIN_INFO");
        this.f28560i = (RsvInquiryResponse.TrainInfo) getIntent().getSerializableExtra("LAST_TRAIN_INFO");
    }

    protected void h0() {
        boolean z8 = this.f28560i != null;
        if (d.TRANSFER_SQ_NO.getCode().equals(this.f28557f) && !"17".equals(this.f28559h.getH_trn_clsf_cd())) {
            "17".equals(this.f28560i.getH_trn_clsf_cd());
        }
        Price2FareDao price2FareDao = new Price2FareDao();
        Price2FareDao.Price2FareRequest price2FareRequest = price2FareDao.new Price2FareRequest();
        Price2FareDao.Price2FareParams price2FareParams = price2FareDao.new Price2FareParams();
        price2FareRequest.setTxtMenuId(this.f28558g);
        price2FareRequest.setChtnDvCd(this.f28557f);
        price2FareRequest.setTrnCnt(this.f28557f);
        RsvInquiryResponse.TrainInfo[] trainInfoArr = new RsvInquiryResponse.TrainInfo[z8 ? 2 : 1];
        trainInfoArr[0] = this.f28559h;
        if (z8) {
            trainInfoArr[1] = this.f28560i;
        }
        price2FareRequest.setTrainInfo(trainInfoArr);
        j0(trainInfoArr, price2FareParams);
        new ArrayList().add(price2FareParams);
        price2FareRequest.setPrice2FareParams(price2FareParams);
        price2FareDao.setRequest(price2FareRequest);
        price2FareDao.setFinishView(true);
        executeDao(price2FareDao);
    }

    void j0(RsvInquiryResponse.TrainInfo[] trainInfoArr, Price2FareDao.Price2FareParams price2FareParams) {
        if (trainInfoArr.length <= 1) {
            price2FareParams.setDptRsStnCd(trainInfoArr[0].getH_dpt_rs_stn_cd());
            price2FareParams.setArvRsStnCd(trainInfoArr[0].getH_arv_rs_stn_cd());
            price2FareParams.setRunDt(trainInfoArr[0].getH_run_dt());
            price2FareParams.setTrnNo(trainInfoArr[0].getH_trn_no());
            price2FareParams.setGdNo(trainInfoArr[0].getTxtGdNo());
            price2FareParams.setRqSeatAttCd(trainInfoArr[0].getH_seat_att_cd());
            price2FareParams.setTrnGpCd(trainInfoArr[0].getH_trn_gp_cd());
            price2FareParams.setStlbTrnClsfCd(trainInfoArr[0].getH_trn_clsf_cd());
            return;
        }
        price2FareParams.setDptRsStnCd(trainInfoArr[0].getH_dpt_rs_stn_cd() + "," + trainInfoArr[1].getH_dpt_rs_stn_cd());
        price2FareParams.setArvRsStnCd(trainInfoArr[0].getH_arv_rs_stn_cd() + "," + trainInfoArr[1].getH_arv_rs_stn_cd());
        price2FareParams.setRunDt(trainInfoArr[0].getH_run_dt() + "," + trainInfoArr[1].getH_run_dt());
        price2FareParams.setTrnNo(trainInfoArr[0].getH_trn_no() + "," + trainInfoArr[1].getH_trn_no());
        price2FareParams.setGdNo(trainInfoArr[0].getTxtGdNo() + "," + trainInfoArr[1].getTxtGdNo());
        price2FareParams.setRqSeatAttCd(trainInfoArr[0].getH_seat_att_cd() + "," + trainInfoArr[1].getH_seat_att_cd());
        price2FareParams.setTrnGpCd(trainInfoArr[0].getH_trn_gp_cd() + "," + trainInfoArr[1].getH_trn_gp_cd());
        price2FareParams.setStlbTrnClsfCd(trainInfoArr[0].getH_trn_clsf_cd() + "," + trainInfoArr[1].getH_trn_clsf_cd());
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        if (C6630d.isNull(bundle)) {
            k0();
            h0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_price_2_fare == iBaseDao.getId()) {
            Price2FareDao.Price2FareRequest price2FareRequest = (Price2FareDao.Price2FareRequest) iBaseDao.getRequest();
            Price2FareDao.Price2FareResponse price2FareResponse = (Price2FareDao.Price2FareResponse) iBaseDao.getResponse();
            RsvInquiryResponse.TrainInfo[] trainInfo = price2FareRequest.getTrainInfo();
            boolean z8 = trainInfo.length > 1;
            List<Price2FareDao.Price2Fare> prcList = price2FareResponse.getPrcList();
            LinkedHashMap<String, LinkedHashMap<String, String>> linkedHashMap = new LinkedHashMap<>();
            for (int i8 = 0; i8 < prcList.size(); i8++) {
                if (!z8 || i8 % 2 == this.f28556e) {
                    LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<>();
                    Price2FareDao.Price2Fare price2Fare = prcList.get(i8);
                    linkedHashMap2.put(price2Fare.getTrnNoStr(), price2Fare.getTrnNo());
                    linkedHashMap2.put(price2Fare.getJrnySqnoStr(), price2Fare.getJrnySqno());
                    linkedHashMap2.put(price2Fare.getPsrmClNmStr(), price2Fare.getPsrmClNmStr());
                    linkedHashMap2.put(price2Fare.getRcvdPrcStr(), price2Fare.getRcvdPrc());
                    linkedHashMap2.put(price2Fare.getRcvdFareStr(), price2Fare.getRcvdFare());
                    linkedHashMap2.put(price2Fare.getSumAmtStr(), price2Fare.getSumAmt());
                    linkedHashMap.put(price2Fare.getPsrmClNm(), linkedHashMap2);
                }
            }
            String h_free_sracar_cnt = trainInfo[this.f28556e].getH_free_sracar_cnt();
            ((y) C6637k.getDialog(7, K(), 1001, 0, getString(AbstractC5959j.dialog_service_fare_info))).initFareList(N.isNotNull(h_free_sracar_cnt) && Integer.parseInt(h_free_sracar_cnt) > 0, linkedHashMap).setButtonListener(new DialogInterface.OnClickListener() { // from class: K5.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i9) {
                    this.f2914a.i0(dialogInterface, i9);
                }
            }).showDialog();
        }
    }
}
