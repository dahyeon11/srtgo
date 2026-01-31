package com.korail.talk.ui.ticket.receipt;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.korail.talk.data.PlayAppData;
import com.korail.talk.network.dao.refund.TicketDetailDao;
import com.korail.talk.view.base.BaseViewActivity;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import o4.C6038a;
import r4.C6174a;
import z4.C6630d;
import z4.C6633g;
import z4.C6634h;
import z4.C6639m;
import z4.G;
import z4.N;

/* loaded from: classes.dex */
public class TicketStbkReceiptActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private TicketDetailDao.TicketDetailResponse f29148i;

    /* renamed from: j, reason: collision with root package name */
    private String f29149j;

    /* renamed from: k, reason: collision with root package name */
    private String f29150k;

    /* renamed from: l, reason: collision with root package name */
    private String f29151l;

    /* renamed from: m, reason: collision with root package name */
    private String f29152m;

    /* renamed from: n, reason: collision with root package name */
    private String f29153n;

    /* renamed from: o, reason: collision with root package name */
    private View f29154o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f29155p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f29156q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f29157r;

    private String s0() {
        return C6038a.getReturnNumberWithDash(this.f29148i.getH_orgtk_wct_no(), this.f29148i.getH_orgtk_ret_sale_dt(), this.f29148i.getH_orgtk_sale_sqno(), this.f29148i.getH_orgtk_ret_pwd());
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_stbk_receipt);
        this.f29155p.setText(s0());
        this.f29156q.setText(C6634h.convertFormat(this.f29148i.getH_sale_dt() + this.f29148i.getH_sale_tm(), "yyyyMMddHHmmss", "yyyy년 MM월 dd일 (E) HH:mm"));
        w0();
        this.f29157r.setText(getString(AbstractC5959j.company_info, C6634h.getToday("yyyy-MM-dd HH:mm")));
    }

    private void t0() {
        File file = C6639m.getFile(getApplicationContext(), C6174a.VOLATILITY_FOLDER, C6174a.RECEIPT_IMAGE_NM);
        if (C6633g.receiptSaveToBitmapFile(file, this.f29154o)) {
            C6630d.sendReceiptMail(K(), file, "코레일톡 영수증", "코레일톡에서 구매한 승차권 영수증입니다.");
        } else {
            Toast.makeText(getApplicationContext(), "이메일 발송에 실패하셨습니다.", 0).show();
        }
    }

    private void u0() {
        this.f29148i = (TicketDetailDao.TicketDetailResponse) getIntent().getSerializableExtra("TICKET_RESPONSE");
        this.f29149j = getIntent().getStringExtra("STBK_RECEIPT_APPROVE_NAME");
        this.f29150k = getIntent().getStringExtra("STBK_RECEIPT_RECOGNIZE_NO");
        this.f29151l = getIntent().getStringExtra("STBK_RECEIPT_PURPOSE");
        this.f29152m = getIntent().getStringExtra("STBK_RECEIPT_APPROVE_NO");
        this.f29153n = getIntent().getStringExtra("STBK_RECEIPT_APPROVE_AMOUNT");
    }

    private void v0() {
        findViewById(AbstractC5955f.btn_left).setOnClickListener(this);
        findViewById(AbstractC5955f.btn_right).setOnClickListener(this);
    }

    private void w0() {
        ((TextView) findViewById(AbstractC5955f.tv_receipt_station)).setText(this.f29149j);
        ((TextView) findViewById(AbstractC5955f.tv_receipt_user)).setText(this.f29150k);
        ((TextView) findViewById(AbstractC5955f.tv_receipt_purpose)).setText(this.f29151l);
        ((TextView) findViewById(AbstractC5955f.tv_receipt_account_accept_no)).setText(this.f29152m);
        ((TextView) findViewById(AbstractC5955f.tv_receipt_account_amount)).setText(getString(AbstractC5959j.common_amount, N.getDecimalFormatString(this.f29153n)));
    }

    private void x0() {
        n0(false);
        this.f29154o = findViewById(AbstractC5955f.v_receipt_fax);
        this.f29155p = (TextView) findViewById(AbstractC5955f.tv_receipt_ticket_number);
        this.f29156q = (TextView) findViewById(AbstractC5955f.tv_receipt_issue_date);
        this.f29157r = (TextView) findViewById(AbstractC5955f.tv_receipt_info);
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
        setContentView(AbstractC5957h.ticket_stbk_receipt_activity);
        if (C6630d.isNull(bundle)) {
            u0();
            x0();
            setText();
            v0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onResume() {
        super.onResume();
    }

    public void sendFax() throws Throwable {
        File file = C6639m.getFile(getApplicationContext(), C6174a.VOLATILITY_FOLDER, C6174a.RECEIPT_IMAGE_NM);
        C6633g.createMobileFaxBitmapFile(file, this.f29154o);
        PlayAppData playAppData = new PlayAppData();
        playAppData.setIntent(G.getIntentFax(K(), file));
        playAppData.setShowDialog(true);
        playAppData.setTitle(getString(AbstractC5959j.receipt_mobile_install_dialog_title));
        playAppData.setMessageList(getString(AbstractC5959j.receipt_mobile_install_dialog_content));
        G.playApp(K(), playAppData);
    }
}
