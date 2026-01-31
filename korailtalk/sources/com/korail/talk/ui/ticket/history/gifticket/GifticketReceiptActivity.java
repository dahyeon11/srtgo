package com.korail.talk.ui.ticket.history.gifticket;

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
import r4.C6174a;
import z4.C6630d;
import z4.C6633g;
import z4.C6634h;
import z4.C6639m;
import z4.G;

/* loaded from: classes.dex */
public class GifticketReceiptActivity extends BaseViewActivity {
    public static final String TAG = "GifticketReceiptActivity";

    /* renamed from: i, reason: collision with root package name */
    private TicketDetailDao.TicketDetailResponse f29108i;

    /* renamed from: j, reason: collision with root package name */
    private String f29109j;

    /* renamed from: k, reason: collision with root package name */
    private String f29110k;

    /* renamed from: l, reason: collision with root package name */
    private String f29111l;

    /* renamed from: m, reason: collision with root package name */
    private String f29112m;

    /* renamed from: n, reason: collision with root package name */
    private String f29113n;

    /* renamed from: o, reason: collision with root package name */
    private View f29114o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f29115p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f29116q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f29117r;

    private void s0() {
        File file = C6639m.getFile(getApplicationContext(), C6174a.VOLATILITY_FOLDER, C6174a.RECEIPT_IMAGE_NM);
        if (C6633g.receiptSaveToBitmapFile(file, this.f29114o)) {
            C6630d.sendReceiptMail(K(), file, "코레일톡 영수증", "코레일톡에서 구매한 승차권 영수증입니다.");
        } else {
            Toast.makeText(getApplicationContext(), "이메일 발송에 실패하셨습니다.", 0).show();
        }
    }

    private void setText() {
        setAppTitle(AbstractC5959j.common_receipt);
        this.f29117r.setText(getString(AbstractC5959j.company_info, C6634h.getToday("yyyy-MM-dd HH:mm")));
    }

    private void t0() {
        this.f29108i = (TicketDetailDao.TicketDetailResponse) getIntent().getSerializableExtra("TICKET_RESPONSE");
        this.f29109j = getIntent().getStringExtra("STBK_RECEIPT_APPROVE_NAME");
        this.f29110k = getIntent().getStringExtra("STBK_RECEIPT_RECOGNIZE_NO");
        this.f29111l = getIntent().getStringExtra("STBK_RECEIPT_PURPOSE");
        this.f29112m = getIntent().getStringExtra("STBK_RECEIPT_APPROVE_NO");
        this.f29113n = getIntent().getStringExtra("STBK_RECEIPT_APPROVE_AMOUNT");
    }

    private void u0() {
        findViewById(AbstractC5955f.btn_left).setOnClickListener(this);
        findViewById(AbstractC5955f.btn_right).setOnClickListener(this);
    }

    private void v0() {
        n0(false);
        this.f29114o = findViewById(AbstractC5955f.v_receipt_fax);
        this.f29115p = (TextView) findViewById(AbstractC5955f.tv_receipt_ticket_number);
        this.f29116q = (TextView) findViewById(AbstractC5955f.tv_receipt_issue_date);
        this.f29117r = (TextView) findViewById(AbstractC5955f.tv_receipt_info);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) throws Throwable {
        int id = view.getId();
        if (AbstractC5955f.btn_left == id) {
            sendFax();
        } else if (AbstractC5955f.btn_right == id) {
            s0();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_gifticket_receipt);
        if (C6630d.isNull(bundle)) {
            t0();
            v0();
            setText();
            u0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onResume() {
        super.onResume();
    }

    public void sendFax() throws Throwable {
        File file = C6639m.getFile(getApplicationContext(), C6174a.VOLATILITY_FOLDER, C6174a.RECEIPT_IMAGE_NM);
        C6633g.createMobileFaxBitmapFile(file, this.f29114o);
        PlayAppData playAppData = new PlayAppData();
        playAppData.setIntent(G.getIntentFax(K(), file));
        playAppData.setShowDialog(true);
        playAppData.setTitle(getString(AbstractC5959j.receipt_mobile_install_dialog_title));
        playAppData.setMessageList(getString(AbstractC5959j.receipt_mobile_install_dialog_content));
        G.playApp(K(), playAppData);
    }
}
