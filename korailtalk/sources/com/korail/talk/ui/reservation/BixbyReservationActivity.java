package com.korail.talk.ui.reservation;

import I4.h;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.certification.BixbyReservationDao;
import com.korail.talk.network.dao.certification.BixbyReservationDao.BixbyReservationRequest;
import com.korail.talk.network.response.certification.ReservationResponse;
import com.korail.talk.ui.inquiry.rir.orr.a;
import com.korail.talk.ui.menu.ReservedTicketActivity;
import java.util.ArrayList;
import java.util.HashMap;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import y4.C6536a;
import z4.C6630d;
import z4.C6637k;

/* loaded from: classes.dex */
public class BixbyReservationActivity extends a {

    /* renamed from: k0 */
    private HashMap f28608k0;

    private void L0() {
        HashMap map = new HashMap();
        map.put("Device", BaseRequest.ANDROID);
        map.put("Version", "250601001");
        map.put("Key", BaseRequest.APP_KEY);
        Bundle extras = getIntent().getExtras();
        for (String str : extras.keySet()) {
            map.put(str, extras.getString(str));
        }
        this.f28608k0 = map;
    }

    public /* synthetic */ void Q2(DialogInterface dialogInterface, int i8) {
        startActivity(new Intent(getApplicationContext(), (Class<?>) ReservedTicketActivity.class));
        finish();
    }

    @Override // h5.AbstractActivityC5621k
    protected boolean F0() {
        return false;
    }

    @Override // com.korail.talk.ui.inquiry.rir.orr.a, j5.AbstractActivityC5828a, i5.AbstractActivityC5703c, h5.AbstractActivityC5621k, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C6630d.isNull(bundle)) {
            L0();
            w2();
        }
    }

    @Override // i5.AbstractActivityC5703c, h5.AbstractActivityC5621k, com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        if (AbstractC5955f.dao_reservation == iBaseDao.getId()) {
            ReservationResponse reservationResponse = (ReservationResponse) iBaseDao.getResponse();
            if ("WRR800029".equals(reservationResponse.gethMsgCd()) || "ERR911531".equals(reservationResponse.gethMsgCd()) || "ERR911051".equals(reservationResponse.gethMsgCd())) {
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(c6536a.getMessage()).setButtonListener(new DialogInterface.OnClickListener() { // from class: O5.a
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        this.f3457a.Q2(dialogInterface, i8);
                    }
                }).showDialog();
            }
        }
    }

    @Override // j5.AbstractActivityC5828a, h5.AbstractActivityC5621k
    protected void w0() {
        finish();
    }

    @Override // j5.AbstractActivityC5828a
    protected void w2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("WRR800029");
        arrayList.add("ERR911531");
        arrayList.add("ERR911051");
        BixbyReservationDao bixbyReservationDao = new BixbyReservationDao();
        BixbyReservationDao.BixbyReservationRequest bixbyReservationRequest = bixbyReservationDao.new BixbyReservationRequest();
        bixbyReservationRequest.setData(this.f28608k0);
        bixbyReservationRequest.setNotNonMemberShow(false);
        bixbyReservationDao.setRequest(bixbyReservationRequest);
        bixbyReservationDao.setErrorMsgCdNotShowDialog(arrayList);
        bixbyReservationDao.setFinishView(true);
        executeDao(bixbyReservationDao);
    }

    @Override // j5.AbstractActivityC5828a
    protected void x2() {
        h hVar = h.getInstance();
        BixbyReservationDao bixbyReservationDao = new BixbyReservationDao();
        BixbyReservationDao.BixbyReservationRequest bixbyReservationRequest = bixbyReservationDao.new BixbyReservationRequest();
        bixbyReservationRequest.setCustNm(hVar.getNonMemberName());
        bixbyReservationRequest.setCpNo(hVar.getNonMemberPhoneNumber());
        bixbyReservationRequest.setCustPw(hVar.getNonMemberPassword());
        bixbyReservationRequest.setData(this.f28608k0);
        bixbyReservationDao.setRequest(bixbyReservationRequest);
        bixbyReservationDao.setFinishView(true);
        executeDao(bixbyReservationDao);
    }

    @Override // j5.AbstractActivityC5828a
    protected void z2(ReservationResponse reservationResponse) {
        super.z2(reservationResponse);
        finish();
    }
}
