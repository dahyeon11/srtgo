package N5;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.korail.talk.network.dao.compensate.CompensateRefundCheckDao;
import com.korail.talk.network.dao.compensate.CompensateRefundCheckDao.CompensateRefundCheckRequest;
import com.korail.talk.network.dao.compensate.CompensateRefundDao;
import com.korail.talk.network.dao.compensate.CompensateRefundDao.CompensateRefundRequest;
import com.korail.talk.network.dao.compensate.CompensateRefundListDao;
import com.korail.talk.network.dao.compensate.CompensateRefundListDao.CompensateRefundListRequest;
import com.korail.talk.network.response.delay.RefundResponse;
import com.korail.talk.ui.ticket.confirm.TicketSelfCheckinStatusActivity;
import java.util.ArrayList;
import java.util.HashMap;
import k0.AbstractC5837a;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.C6634h;
import z4.C6637k;
import z4.t;

/* loaded from: classes.dex */
public class a extends f {
    public static final String TAG = "CompensateRefundFragment";

    private void M0() {
        this.f3263q0.setText(getString(AbstractC5959j.common_fare_refund) + "\n(" + getString(AbstractC5959j.common_redemption_coupon) + ")");
    }

    public static Fragment newInstance() {
        return new a();
    }

    @Override // N5.f
    protected void B0(CompensateRefundCheckDao.CompensateRefundCheckRequest compensateRefundCheckRequest) {
        CompensateRefundDao compensateRefundDao = new CompensateRefundDao();
        CompensateRefundDao.CompensateRefundRequest compensateRefundRequest = compensateRefundDao.new CompensateRefundRequest();
        compensateRefundRequest.setTkCnt(compensateRefundCheckRequest.getTkCnt());
        compensateRefundRequest.setTrnStpRsStnCd(compensateRefundCheckRequest.getTrnStpRsStnCd());
        compensateRefundRequest.setJrnyStpTkFlg(compensateRefundCheckRequest.getJrnyStpTkFlg());
        compensateRefundRequest.setOgTkSaleWctNo(compensateRefundCheckRequest.getOgTkSaleWctNo());
        compensateRefundRequest.setOgTkSaleDd(compensateRefundCheckRequest.getOgTkSaleDd());
        compensateRefundRequest.setOgTkSaleSqNo(compensateRefundCheckRequest.getOgTkSaleSqNo());
        compensateRefundRequest.setOgTkRetPwd(compensateRefundCheckRequest.getOgTkRetPwd());
        compensateRefundDao.setRequest(compensateRefundRequest);
        executeDao(compensateRefundDao);
    }

    @Override // N5.f
    protected void D0() {
        String str = F0() + TicketSelfCheckinStatusActivity.CHECKIN_STATUS_NOT_USE;
        String today = F0() + "31";
        t.e("today : " + C6634h.getToday("yyyyMMdd") + ", toDate : " + today);
        if (C6634h.isAfter(today, C6634h.getToday("yyyyMMdd"))) {
            today = C6634h.getToday("yyyyMMdd");
        }
        CompensateRefundListDao compensateRefundListDao = new CompensateRefundListDao();
        CompensateRefundListDao.CompensateRefundListRequest compensateRefundListRequest = compensateRefundListDao.new CompensateRefundListRequest();
        int i8 = this.f3252f0;
        this.f3252f0 = i8 + 1;
        compensateRefundListRequest.setNowPgNo(i8);
        compensateRefundListRequest.setDptDtFrom(str);
        compensateRefundListRequest.setDptDtTo(today);
        compensateRefundListDao.setRequest(compensateRefundListRequest);
        compensateRefundListDao.setErrorMsgCdNotShowDialog("WRG000000");
        executeDao(compensateRefundListDao);
    }

    protected void P0(HashMap map) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        for (Integer num : map.keySet()) {
            num.intValue();
            RefundResponse.TicketList ticketList = (RefundResponse.TicketList) map.get(num);
            arrayList.add(ticketList.getTrnStpRsStnCd());
            arrayList2.add(ticketList.getJrnyStpTkFlg());
            arrayList3.add(ticketList.getSaleWctNo());
            arrayList4.add(ticketList.getSaleDd());
            arrayList5.add(ticketList.getSaleSqNo());
            arrayList6.add(ticketList.getTkRetPwd());
        }
        CompensateRefundCheckDao compensateRefundCheckDao = new CompensateRefundCheckDao();
        CompensateRefundCheckDao.CompensateRefundCheckRequest compensateRefundCheckRequest = compensateRefundCheckDao.new CompensateRefundCheckRequest();
        compensateRefundCheckRequest.setTkCnt(map.size());
        compensateRefundCheckRequest.setTrnStpRsStnCd(arrayList);
        compensateRefundCheckRequest.setJrnyStpTkFlg(arrayList2);
        compensateRefundCheckRequest.setOgTkSaleWctNo(arrayList3);
        compensateRefundCheckRequest.setOgTkSaleDd(arrayList4);
        compensateRefundCheckRequest.setOgTkSaleSqNo(arrayList5);
        compensateRefundCheckRequest.setOgTkRetPwd(arrayList6);
        compensateRefundCheckDao.setRequest(compensateRefundCheckRequest);
        executeDao(compensateRefundCheckDao);
    }

    @Override // N5.f, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // N5.f, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            M0();
        }
    }

    @Override // N5.f, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.iv_refund_info == id) {
            C6637k.getCDialog(getActivity(), 1001, 0, getString(AbstractC5959j.refund_stop_popup_title)).setContent(getString(AbstractC5959j.refund_stop_popup_msg)).showDialog();
        } else if (AbstractC5955f.btn_refund_request == id) {
            P0(this.f3258l0);
        } else {
            super.onClick(view);
        }
    }
}
