package com.korail.talk.ui.ticket.receipt;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.delay.DelayReturnReceiptDao;
import com.korail.talk.network.dao.delay.DelayReturnReceiptDao.DelayReturnReceiptRequest;
import com.korail.talk.network.dao.refund.TicketDetailDao;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import o4.C6038a;
import z4.C6630d;
import z4.C6634h;
import z4.N;

/* loaded from: classes.dex */
public class DelayReturnReceiptActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private TicketDetailDao.TicketDetailResponse f29118i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f29119j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f29120k;

    /* renamed from: l, reason: collision with root package name */
    private TextView f29121l;

    /* renamed from: m, reason: collision with root package name */
    private TextView f29122m;

    /* renamed from: n, reason: collision with root package name */
    private TextView f29123n;

    private void s0() {
        DelayReturnReceiptDao delayReturnReceiptDao = new DelayReturnReceiptDao();
        DelayReturnReceiptDao.DelayReturnReceiptRequest delayReturnReceiptRequest = delayReturnReceiptDao.new DelayReturnReceiptRequest();
        delayReturnReceiptRequest.setSaleDd(this.f29118i.getH_orgtk_ret_sale_dt());
        delayReturnReceiptRequest.setSaleWctNo(this.f29118i.getH_orgtk_wct_no());
        delayReturnReceiptRequest.setSaleSqno(this.f29118i.getH_orgtk_sale_sqno());
        delayReturnReceiptRequest.setTkRetPwd(this.f29118i.getH_orgtk_ret_pwd());
        delayReturnReceiptDao.setRequest(delayReturnReceiptRequest);
        executeDao(delayReturnReceiptDao);
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_delay_return_receipt);
        this.f29119j.setText(t0());
        this.f29120k.setText(C6634h.getToday("yyyy년 MM월 dd일 (E) HH:mm"));
    }

    private String t0() {
        return C6038a.getReturnNumberWithDash(this.f29118i.getH_orgtk_wct_no(), this.f29118i.getH_orgtk_ret_sale_dt(), this.f29118i.getH_orgtk_sale_sqno(), this.f29118i.getH_orgtk_ret_pwd());
    }

    private void u0() {
        this.f29118i = (TicketDetailDao.TicketDetailResponse) getIntent().getSerializableExtra("TICKET_RESPONSE");
    }

    private void v0() {
    }

    private void w0(DelayReturnReceiptDao.DelayReturnReceiptResponse delayReturnReceiptResponse) {
        this.f29121l.setText(delayReturnReceiptResponse.getDlayFarePymtMtdNm());
        this.f29122m.setText(C6634h.convertFormat(delayReturnReceiptResponse.getRetDt(), "yyyyMMdd", "yyyy.MM.dd"));
        this.f29123n.setText(getString(AbstractC5959j.common_amount, N.getDecimalFormatString(delayReturnReceiptResponse.getDlayFareRetAmt())));
    }

    private void x0() {
        l0();
        this.f29119j = (TextView) findViewById(AbstractC5955f.tv_delay_return_receipt_ticket_number);
        this.f29120k = (TextView) findViewById(AbstractC5955f.tv_delay_return_receipt_issue_date);
        this.f29121l = (TextView) findViewById(AbstractC5955f.tv_delay_return_receipt_type);
        this.f29122m = (TextView) findViewById(AbstractC5955f.tv_delay_return_receipt_date);
        this.f29123n = (TextView) findViewById(AbstractC5955f.tv_delay_return_receipt_amount);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_delay_return_receipt);
        if (C6630d.isNull(bundle)) {
            u0();
            x0();
            setText();
            v0();
            s0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_delay_return_receipt == iBaseDao.getId()) {
            w0((DelayReturnReceiptDao.DelayReturnReceiptResponse) iBaseDao.getResponse());
        }
    }
}
