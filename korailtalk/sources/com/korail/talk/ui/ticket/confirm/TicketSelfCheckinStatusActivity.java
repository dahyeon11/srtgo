package com.korail.talk.ui.ticket.confirm;

import Q7.X;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.ticket.SelfCheckinCancelDao;
import com.korail.talk.network.dao.ticket.SelfCheckinCancelDao.SelfCheckinCancelRequest;
import com.korail.talk.network.dao.ticket.SelfCheckinInfoDao;
import com.korail.talk.network.dao.ticket.SelfCheckinInfoDao.SelfCheckinPossibleRequest;
import com.korail.talk.network.dao.ticket.SelfCheckinPossibleDao;
import com.korail.talk.network.dao.ticket.SelfCheckinPossibleDao.SelfCheckinPossibleRequest;
import com.korail.talk.network.dao.ticket.SelfCheckinRegisterDao;
import com.korail.talk.network.dao.ticket.SelfCheckinRegisterDao.SelfCheckinRegisterRequest;
import com.korail.talk.network.dao.trainsInfo.Price2FareDao;
import com.korail.talk.view.base.BaseViewActivity;
import f.InterfaceC5379b;
import f.d;
import g5.e;
import j4.p;
import j4.q;
import j4.r;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.C6637k;
import z4.N;
import z4.t;

/* loaded from: classes.dex */
public class TicketSelfCheckinStatusActivity extends BaseViewActivity {
    public static final String CHECKIN_STATUS_CANCEL = "06";
    public static final String CHECKIN_STATUS_EXCEED = "14";
    public static final String CHECKIN_STATUS_NOT_USE = "01";
    public static final String CHECKIN_STATUS_USING = "05";

    /* renamed from: i, reason: collision with root package name */
    private String f29008i;

    /* renamed from: j, reason: collision with root package name */
    private String f29009j;

    /* renamed from: k, reason: collision with root package name */
    private String f29010k;

    /* renamed from: l, reason: collision with root package name */
    private String f29011l;

    /* renamed from: m, reason: collision with root package name */
    private String f29012m;

    /* renamed from: n, reason: collision with root package name */
    private String f29013n;

    /* renamed from: o, reason: collision with root package name */
    private String f29014o;

    /* renamed from: p, reason: collision with root package name */
    private String f29015p;

    /* renamed from: q, reason: collision with root package name */
    private LinearLayout f29016q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f29017r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f29018s;

    /* renamed from: t, reason: collision with root package name */
    private final d f29019t = registerForActivityResult(new p(), new InterfaceC5379b() { // from class: f6.G
        @Override // f.InterfaceC5379b
        public final void onActivityResult(Object obj) {
            this.f31218a.z0((j4.q) obj);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0(DialogInterface dialogInterface, int i8) {
        if (100 != i8 && 102 == i8) {
            v0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0(SelfCheckinPossibleDao.ConsList consList, DialogInterface dialogInterface, int i8) {
        if (100 != i8 && 102 == i8) {
            y0(consList.getCpsNo(), consList.getScarNo(), consList.getSeatNo());
        }
    }

    private void C0() {
        r rVar = new r();
        rVar.setOrientationLocked(false);
        rVar.setCaptureActivity(TicketSelfCheckinQRScanActivity.class);
        rVar.setPrompt(getString(AbstractC5959j.self_checkin_qr_scan_content));
        this.f29019t.launch(rVar);
    }

    private void D0() {
        this.f29013n = getIntent().getStringExtra(Price2FareDao.Price2Fare.jrnySqnoString);
        this.f29008i = getIntent().getStringExtra("WCT_NO");
        this.f29010k = getIntent().getStringExtra("RET_SALE_DT");
        this.f29009j = getIntent().getStringExtra("RET_SALE_DD");
        this.f29011l = getIntent().getStringExtra("SALE_SQ_NO");
        this.f29012m = getIntent().getStringExtra("RET_PWD");
        this.f29014o = getIntent().getStringExtra("SELF_CHECKIN_STATUS");
    }

    private void E0() {
        findViewById(AbstractC5955f.tv_status_btn).setOnClickListener(this);
        findViewById(AbstractC5955f.btn_bottom).setOnClickListener(this);
    }

    private void F0() {
        l0();
        t.d("mJrnySqno : " + this.f29013n + ", mSaleWctNo : " + this.f29008i + ", mSaleDd : " + this.f29009j + ", mSaleSqno : " + this.f29011l + ", mTkRetPwd : " + this.f29012m + ", mSelfCheckinStatus : " + this.f29014o);
        this.f29016q = (LinearLayout) findViewById(AbstractC5955f.ll_self_checkin_info);
        this.f29017r = (TextView) findViewById(AbstractC5955f.tv_status_title);
        this.f29018s = (TextView) findViewById(AbstractC5955f.tv_status_btn);
        if (CHECKIN_STATUS_USING.equals(this.f29014o)) {
            return;
        }
        G0();
    }

    private void G0() {
        if (CHECKIN_STATUS_USING.equals(this.f29014o)) {
            this.f29017r.setText(AbstractC5959j.common_using);
            this.f29018s.setText(AbstractC5959j.common_cancel2);
            this.f29018s.setOnClickListener(this);
            this.f29018s.setTextColor(-11184811);
            this.f29018s.setBackgroundResource(AbstractC5954e.bg_self_checkin_btn_round_stroke_gray);
            this.f29016q.setVisibility(0);
            return;
        }
        if (CHECKIN_STATUS_CANCEL.equals(this.f29014o)) {
            this.f29017r.setText(AbstractC5959j.common_canceled);
            this.f29018s.setText(AbstractC5959j.self_checkin_reregistration);
            this.f29018s.setOnClickListener(null);
            this.f29018s.setTextColor(-5395027);
            this.f29018s.setBackgroundResource(AbstractC5954e.bg_self_checkin_btn_round_stroke_disable);
            this.f29016q.setVisibility(8);
            return;
        }
        this.f29017r.setText(AbstractC5959j.common_not_use);
        this.f29018s.setText(AbstractC5959j.self_checkin_start);
        this.f29018s.setOnClickListener(this);
        this.f29018s.setTextColor(-16754791);
        this.f29018s.setBackgroundResource(AbstractC5954e.selector_btn_round_stroke_blue);
        this.f29016q.setVisibility(8);
    }

    private void setText() {
        setAppTitle(AbstractC5959j.common_self_checkin);
    }

    private void v0() {
        SelfCheckinCancelDao selfCheckinCancelDao = new SelfCheckinCancelDao();
        SelfCheckinCancelDao.SelfCheckinCancelRequest selfCheckinCancelRequest = selfCheckinCancelDao.new SelfCheckinCancelRequest();
        selfCheckinCancelRequest.setSaleWctNo(this.f29008i);
        selfCheckinCancelRequest.setSaleDt(this.f29010k);
        selfCheckinCancelRequest.setSaleSqno(this.f29011l);
        selfCheckinCancelRequest.setTkRetPwd(this.f29012m);
        selfCheckinCancelRequest.setJrnySqno(this.f29013n);
        selfCheckinCancelDao.setRequest(selfCheckinCancelRequest);
        executeDao(selfCheckinCancelDao);
    }

    private void w0() {
        SelfCheckinInfoDao selfCheckinInfoDao = new SelfCheckinInfoDao();
        SelfCheckinInfoDao.SelfCheckinPossibleRequest selfCheckinPossibleRequest = selfCheckinInfoDao.new SelfCheckinPossibleRequest();
        selfCheckinPossibleRequest.setSaleWctNo(this.f29008i);
        selfCheckinPossibleRequest.setSaleDt(this.f29010k);
        selfCheckinPossibleRequest.setSaleSqno(this.f29011l);
        selfCheckinPossibleRequest.setTkRetPwd(this.f29012m);
        selfCheckinPossibleRequest.setJrnySqno(this.f29013n);
        selfCheckinInfoDao.setRequest(selfCheckinPossibleRequest);
        executeDao(selfCheckinInfoDao);
    }

    private void x0() {
        SelfCheckinPossibleDao selfCheckinPossibleDao = new SelfCheckinPossibleDao();
        SelfCheckinPossibleDao.SelfCheckinPossibleRequest selfCheckinPossibleRequest = selfCheckinPossibleDao.new SelfCheckinPossibleRequest();
        selfCheckinPossibleRequest.setQrcode(this.f29015p);
        selfCheckinPossibleRequest.setSaleWctNo(this.f29008i);
        selfCheckinPossibleRequest.setSaleDd(this.f29009j);
        selfCheckinPossibleRequest.setSaleSqno(this.f29011l);
        selfCheckinPossibleRequest.setTkRetPwd(this.f29012m);
        selfCheckinPossibleRequest.setJrnySqno(this.f29013n);
        selfCheckinPossibleDao.setRequest(selfCheckinPossibleRequest);
        executeDao(selfCheckinPossibleDao);
    }

    private void y0(String str, String str2, String str3) {
        SelfCheckinRegisterDao selfCheckinRegisterDao = new SelfCheckinRegisterDao();
        SelfCheckinRegisterDao.SelfCheckinRegisterRequest selfCheckinRegisterRequest = selfCheckinRegisterDao.new SelfCheckinRegisterRequest();
        selfCheckinRegisterRequest.setCpsNo(str);
        selfCheckinRegisterRequest.setScarNo(str2);
        selfCheckinRegisterRequest.setSeatNo(str3);
        selfCheckinRegisterRequest.setSaleWctNo(this.f29008i);
        selfCheckinRegisterRequest.setSaleDd(this.f29009j);
        selfCheckinRegisterRequest.setSaleSqno(this.f29011l);
        selfCheckinRegisterRequest.setTkRetPwd(this.f29012m);
        selfCheckinRegisterRequest.setJrnySqno(this.f29013n);
        selfCheckinRegisterDao.setRequest(selfCheckinRegisterRequest);
        executeDao(selfCheckinRegisterDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(q qVar) {
        if (qVar.getContents() != null) {
            t.d("Scanned : " + this.f29015p);
            this.f29015p = qVar.getContents();
            x0();
            return;
        }
        Intent originalIntent = qVar.getOriginalIntent();
        if (originalIntent == null) {
            t.d("Cancelled scan");
        } else if (originalIntent.hasExtra("MISSING_CAMERA_PERMISSION")) {
            t.d("Cancelled scan due to missing camera permission");
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.btn_bottom == id) {
            t.d("btn_bottom");
            finish();
            return;
        }
        if (AbstractC5955f.tv_status_btn != id) {
            super.onClick(view);
            return;
        }
        t.d("tv_status_btn : " + this.f29014o);
        if (CHECKIN_STATUS_USING.equals(this.f29014o)) {
            C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.self_checkin_cancel_content)).setButtonListener(new DialogInterface.OnClickListener() { // from class: f6.E
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f31215a.A0(dialogInterface, i8);
                }
            }).showDialog();
        } else if (CHECKIN_STATUS_CANCEL.equals(this.f29014o)) {
            t.d("재등록불가");
        } else {
            C0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_ticket_self_checkin_status);
        if (C6630d.isNull(bundle)) {
            D0();
            F0();
            setText();
            E0();
            if (CHECKIN_STATUS_USING.equals(this.f29014o)) {
                w0();
            }
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_self_checkin_possible == id) {
            final SelfCheckinPossibleDao.ConsList consList = ((SelfCheckinPossibleDao.SelfCheckinPossibleResponse) iBaseDao.getResponse()).getConsList().get(0);
            C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(N.applySpannable(getString(AbstractC5959j.common_s_seat, consList.getScarNo(), consList.getSeatNo()) + X.SPACE, new ForegroundColorSpan(Color.parseColor("#0063b7"))), getString(AbstractC5959j.self_checkin_register_content)).setButtonListener(new DialogInterface.OnClickListener() { // from class: f6.F
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f31216a.B0(consList, dialogInterface, i8);
                }
            }).showDialog();
            return;
        }
        if (AbstractC5955f.dao_self_checkin_register == id) {
            finish();
            return;
        }
        if (AbstractC5955f.dao_self_checkin_info != id) {
            if (AbstractC5955f.dao_self_checkin_cancel == id) {
                finish();
                return;
            }
            return;
        }
        SelfCheckinInfoDao.SelfCheckinInfoResponse selfCheckinInfoResponse = (SelfCheckinInfoDao.SelfCheckinInfoResponse) iBaseDao.getResponse();
        G0();
        ((TextView) findViewById(AbstractC5955f.tv_self_checkin_seat_info)).setText(getString(AbstractC5959j.common_s_seat, selfCheckinInfoResponse.getScarNo(), selfCheckinInfoResponse.getSeatNo()));
        ((TextView) findViewById(AbstractC5955f.tv_self_checkin_train_info)).setText(selfCheckinInfoResponse.getStlbTrnClsfNm() + X.SPACE + selfCheckinInfoResponse.getTrnNo());
        ((TextView) findViewById(AbstractC5955f.tv_self_checkin_journey_info)).setText(selfCheckinInfoResponse.getDptRsStnNm() + "(" + selfCheckinInfoResponse.getDptTmQb() + ") -> " + selfCheckinInfoResponse.getArvRsStnNm() + "(" + selfCheckinInfoResponse.getArvTmQb() + ")");
        ((TextView) findViewById(AbstractC5955f.tv_self_checkin_ticket_no)).setText(this.f29008i + e.STATE_NAME_NONE + this.f29009j + e.STATE_NAME_NONE + this.f29011l + e.STATE_NAME_NONE + this.f29012m);
    }
}
