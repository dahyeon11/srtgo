package N5;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.korail.talk.network.dao.delay.DelayRefundCheckDao;
import com.korail.talk.network.dao.delay.DelayRefundCheckDao.DelayRefundCheckRequest;
import com.korail.talk.network.dao.delay.DelayRefundDao;
import com.korail.talk.network.dao.delay.DelayRefundDao.DelayRefundRequest;
import com.korail.talk.network.dao.delay.DelayRefundListDao;
import com.korail.talk.network.dao.delay.DelayRefundListDao.DelayRefundListRequest;
import com.korail.talk.network.response.delay.RefundResponse;
import com.korail.talk.ui.ticket.confirm.TicketSelfCheckinStatusActivity;
import java.util.ArrayList;
import java.util.HashMap;
import k0.AbstractC5837a;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import s4.C6219c;
import z4.C6630d;
import z4.C6634h;
import z4.C6637k;
import z4.N;
import z4.t;

/* loaded from: classes.dex */
public class c extends f {
    public static final String TAG = "DelayRefundFragment";

    /* renamed from: t0 */
    private String[] f3247t0;

    private void J0() {
        this.f3247t0 = getResources().getStringArray(AbstractC5952c.delay_refund_entries);
    }

    private void M0() {
        this.f3263q0.setText(getString(AbstractC5959j.common_fare_refund) + "(" + getString(AbstractC5959j.common_payment) + ")");
    }

    public /* synthetic */ void R0(DialogInterface dialogInterface, int i8, boolean z8, int i9) {
        if (102 == i8) {
            Q0(this.f3258l0);
        }
    }

    public static Fragment newInstance() {
        return new c();
    }

    @Override // N5.f
    protected void C0(DelayRefundCheckDao.DelayRefundCheckRequest delayRefundCheckRequest) {
        DelayRefundDao delayRefundDao = new DelayRefundDao();
        DelayRefundDao.DelayRefundRequest delayRefundRequest = delayRefundDao.new DelayRefundRequest();
        delayRefundRequest.setDlayFarePymtMtdCd(TicketSelfCheckinStatusActivity.CHECKIN_STATUS_NOT_USE);
        delayRefundRequest.setTkCnt(delayRefundCheckRequest.getTkCnt());
        delayRefundRequest.setOgTkSaleWctNo(delayRefundCheckRequest.getOgTkSaleWctNo());
        delayRefundRequest.setOgTkSaleDd(delayRefundCheckRequest.getOgTkSaleDd());
        delayRefundRequest.setOgTkSaleSqNo(delayRefundCheckRequest.getOgTkSaleSqNo());
        delayRefundRequest.setOgTkRetPwd(delayRefundCheckRequest.getOgTkRetPwd());
        delayRefundDao.setRequest(delayRefundRequest);
        executeDao(delayRefundDao);
    }

    @Override // N5.f
    protected void D0() {
        String str = F0() + TicketSelfCheckinStatusActivity.CHECKIN_STATUS_NOT_USE;
        String today = F0() + "31";
        t.e("today : " + C6634h.getToday("yyyyMMdd") + ", toDate : " + today);
        if (C6634h.isAfter(today, C6634h.getToday("yyyyMMdd"))) {
            today = C6634h.getToday("yyyyMMdd");
        }
        DelayRefundListDao delayRefundListDao = new DelayRefundListDao();
        DelayRefundListDao.DelayRefundListRequest delayRefundListRequest = delayRefundListDao.new DelayRefundListRequest();
        int i8 = this.f3252f0;
        this.f3252f0 = i8 + 1;
        delayRefundListRequest.setNowPgNo(i8);
        delayRefundListRequest.setDptDtFrom(str);
        delayRefundListRequest.setDptDtTo(today);
        delayRefundListDao.setRequest(delayRefundListRequest);
        delayRefundListDao.setErrorMsgCdNotShowDialog("WRG000000");
        executeDao(delayRefundListDao);
    }

    protected void Q0(HashMap map) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Integer num : map.keySet()) {
            num.intValue();
            RefundResponse.TicketList ticketList = (RefundResponse.TicketList) map.get(num);
            arrayList.add(ticketList.getSaleWctNo());
            arrayList2.add(ticketList.getSaleDd());
            arrayList3.add(ticketList.getSaleSqNo());
            arrayList4.add(ticketList.getTkRetPwd());
        }
        DelayRefundCheckDao delayRefundCheckDao = new DelayRefundCheckDao();
        DelayRefundCheckDao.DelayRefundCheckRequest delayRefundCheckRequest = delayRefundCheckDao.new DelayRefundCheckRequest();
        delayRefundCheckRequest.setTkCnt(map.size());
        delayRefundCheckRequest.setOgTkSaleWctNo(arrayList);
        delayRefundCheckRequest.setOgTkSaleDd(arrayList2);
        delayRefundCheckRequest.setOgTkSaleSqNo(arrayList3);
        delayRefundCheckRequest.setOgTkRetPwd(arrayList4);
        delayRefundCheckDao.setRequest(delayRefundCheckRequest);
        executeDao(delayRefundCheckDao);
    }

    @Override // N5.f, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // N5.f, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            J0();
            M0();
        }
    }

    @Override // N5.f, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.iv_refund_info == id) {
            C6637k.getCDialog(getActivity(), 1001, 0, getString(AbstractC5959j.refund_delay_popup_title)).setContent(getString(AbstractC5959j.refund_delay_popup_msg)).showDialog();
        } else if (AbstractC5955f.btn_refund_request == id) {
            C6637k.getRDialog(getActivity(), 1002, 0, getString(AbstractC5959j.dialog_delay_refund_title)).setRadioGroup(this.f3247t0, 0).setButtonNames(N.getStringArray(getString(AbstractC5959j.common_cancel), getString(AbstractC5959j.common_confirm))).setButtonListener(new C6219c.d() { // from class: N5.b
                @Override // s4.C6219c.d
                public final void onClick(DialogInterface dialogInterface, int i8, boolean z8, int i9) {
                    this.f3246a.R0(dialogInterface, i8, z8, i9);
                }
            }).showDialog();
        } else {
            super.onClick(view);
        }
    }
}
