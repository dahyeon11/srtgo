package com.korail.talk.ui.ticket.history;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.korail.talk.data.PlayAppData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.delay.DelayCertificateDao;
import com.korail.talk.network.dao.delay.DelayCertificateDao.DelayCertificateRequest;
import com.korail.talk.network.dao.refund.TicketDetailDao;
import com.korail.talk.view.base.BaseViewActivity;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import r4.C6174a;
import z4.C6630d;
import z4.C6633g;
import z4.C6639m;
import z4.G;
import z4.t;

/* loaded from: classes.dex */
public class TicketDelayCertificateActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private TicketDetailDao.TicketDetailResponse f29051i;

    /* renamed from: j, reason: collision with root package name */
    private View f29052j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f29053k;

    private void s0() {
        DelayCertificateDao delayCertificateDao = new DelayCertificateDao();
        DelayCertificateDao.DelayCertificateRequest delayCertificateRequest = delayCertificateDao.new DelayCertificateRequest();
        delayCertificateRequest.setOgTkSaleWctNo(this.f29051i.getH_orgtk_wct_no());
        delayCertificateRequest.setOgTkSaleDd(this.f29051i.getH_orgtk_ret_sale_dt());
        delayCertificateRequest.setOgTkSaleSqNo(this.f29051i.getH_orgtk_sale_sqno());
        delayCertificateRequest.setOgTkRetPwd(this.f29051i.getH_orgtk_ret_pwd());
        delayCertificateDao.setRequest(delayCertificateRequest);
        executeDao(delayCertificateDao);
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_delay_certificate);
    }

    private void t0() {
        File file = C6639m.getFile(getApplicationContext(), C6174a.VOLATILITY_FOLDER, C6174a.RECEIPT_IMAGE_NM);
        if (C6633g.receiptSaveToBitmapFile(file, this.f29052j)) {
            C6630d.sendReceiptMail(K(), file, getString(AbstractC5959j.delay_cerfiticate), getString(AbstractC5959j.delay_cerfiticate));
        } else {
            Toast.makeText(getApplicationContext(), "이메일 발송에 실패하셨습니다.", 0).show();
        }
    }

    private void u0(DelayCertificateDao.DelayCertificateResponse delayCertificateResponse) {
        List<DelayCertificateDao.DelayInfo> dlayList = delayCertificateResponse.getDlayList();
        DelayCertificateDao.DelayInfo delayInfo = dlayList.get(0);
        if (dlayList.size() == 1) {
            this.f29053k.setText(getString(AbstractC5959j.delay_cerfiticate_content2, delayInfo.getRunDay(), delayInfo.getTrnNo(), delayInfo.getArvRsStnNm(), delayInfo.getTrnDlayTm()));
            return;
        }
        if (dlayList.size() <= 1) {
            t.e("Error. response - " + delayCertificateResponse);
            return;
        }
        DelayCertificateDao.DelayInfo delayInfo2 = dlayList.get(1);
        StringBuilder sb = new StringBuilder();
        if ("Y".equals(delayInfo.getDlayArvFlg())) {
            sb.append(getString(AbstractC5959j.delay_cerfiticate_content2, delayInfo.getRunDay(), delayInfo.getTrnNo(), delayInfo.getArvRsStnNm(), delayInfo.getTrnDlayTm()));
            sb.append("\n\n");
        }
        if ("Y".equals(delayInfo2.getDlayArvFlg())) {
            sb.append(getString(AbstractC5959j.delay_cerfiticate_content2, delayInfo2.getRunDay(), delayInfo2.getTrnNo(), delayInfo2.getArvRsStnNm(), delayInfo2.getTrnDlayTm()));
        }
        this.f29053k.setText(sb.toString());
    }

    private void v0() {
        this.f29051i = (TicketDetailDao.TicketDetailResponse) getIntent().getSerializableExtra("TICKET_RESPONSE");
    }

    private void w0() {
        findViewById(AbstractC5955f.btn_left).setOnClickListener(this);
        findViewById(AbstractC5955f.btn_right).setOnClickListener(this);
    }

    private void x0() {
        n0(false);
        this.f29052j = findViewById(AbstractC5955f.v_certificate);
        TextView textView = (TextView) findViewById(AbstractC5955f.tv_delay_certificate_content);
        this.f29053k = textView;
        textView.setTypeface(null, 1);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) throws Throwable {
        int id = view.getId();
        if (AbstractC5955f.btn_left == id) {
            sendFax();
        } else if (AbstractC5955f.btn_right == id) {
            t0();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_ticket_delay_certificate);
        if (C6630d.isNull(bundle)) {
            v0();
            x0();
            setText();
            w0();
            s0();
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_delay_certificate == iBaseDao.getId()) {
            u0((DelayCertificateDao.DelayCertificateResponse) iBaseDao.getResponse());
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onResume() {
        super.onResume();
    }

    public void sendFax() throws Throwable {
        File file = C6639m.getFile(getApplicationContext(), C6174a.VOLATILITY_FOLDER, C6174a.RECEIPT_IMAGE_NM);
        C6633g.createMobileFaxBitmapFile(file, this.f29052j);
        PlayAppData playAppData = new PlayAppData();
        playAppData.setIntent(G.getIntentFax(K(), file));
        playAppData.setShowDialog(true);
        playAppData.setTitle(getString(AbstractC5959j.receipt_mobile_install_dialog_title));
        playAppData.setMessageList(getString(AbstractC5959j.receipt_mobile_install_dialog_content));
        G.playApp(K(), playAppData);
    }
}
