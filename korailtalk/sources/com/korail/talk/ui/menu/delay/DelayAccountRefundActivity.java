package com.korail.talk.ui.menu.delay;

import android.os.Bundle;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.delay.CashRfnDao;
import com.korail.talk.network.dao.delay.CashRfnDao.CashRfnRequest;
import com.korail.talk.network.dao.delay.DptnBankDao;
import com.korail.talk.view.base.BaseViewActivity;
import com.korail.talk.viewGroup.DropDownSelector;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import s4.C6219c;
import x4.C6491a;
import z4.C6630d;
import z4.C6637k;
import z4.N;

/* loaded from: classes.dex */
public class DelayAccountRefundActivity extends BaseViewActivity implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: i, reason: collision with root package name */
    private EditText f28267i;

    /* renamed from: j, reason: collision with root package name */
    private EditText f28268j;

    /* renamed from: k, reason: collision with root package name */
    private EditText f28269k;

    /* renamed from: l, reason: collision with root package name */
    private EditText f28270l;

    /* renamed from: m, reason: collision with root package name */
    private EditText f28271m;

    /* renamed from: n, reason: collision with root package name */
    private EditText f28272n;

    /* renamed from: o, reason: collision with root package name */
    private EditText f28273o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f28274p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f28275q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f28276r;

    /* renamed from: s, reason: collision with root package name */
    private DropDownSelector f28277s;

    /* renamed from: t, reason: collision with root package name */
    private Button f28278t;

    /* renamed from: u, reason: collision with root package name */
    private List f28279u;

    /* renamed from: v, reason: collision with root package name */
    private int f28280v;

    private void setText() {
        setAppTitle(AbstractC5959j.title_delay_account_refund);
        this.f28276r.setText(N.applySpannable("개인정보 수집 및 이용 동의", new UnderlineSpan()));
        N.setBulletSpan(getResources().getStringArray(AbstractC5952c.delay_account_refund_info), (TextView) findViewById(AbstractC5955f.tv_delay_account_refund_info));
    }

    private void t0() {
        this.f28275q.setEnabled(false);
        this.f28278t.setEnabled(false);
    }

    private void u0(String str) {
        CashRfnDao cashRfnDao = new CashRfnDao();
        CashRfnDao.CashRfnRequest cashRfnRequest = cashRfnDao.new CashRfnRequest();
        cashRfnRequest.setDmnPrsDvCd(str);
        cashRfnRequest.setCustNm(N(this.f28271m));
        cashRfnRequest.setSaleWctNo(N(this.f28267i));
        cashRfnRequest.setSaleDd(N(this.f28268j));
        cashRfnRequest.setSaleSqno(N(this.f28269k));
        cashRfnRequest.setTkRetPwd(N(this.f28270l));
        if (CashRfnDao.f27551B.equals(str) || CashRfnDao.f27552I.equals(str)) {
            cashRfnRequest.setDptnBankCd(((DptnBankDao.DptnBank) this.f28279u.get(this.f28280v - 1)).getDptnBankCd());
            cashRfnRequest.setDptnAcntNo(N(this.f28272n));
        }
        if (CashRfnDao.f27552I.equals(str)) {
            cashRfnRequest.setCustTeln(N(this.f28273o));
        }
        cashRfnDao.setRequest(cashRfnRequest);
        executeDao(cashRfnDao);
    }

    private void v0() {
        DptnBankDao dptnBankDao = new DptnBankDao();
        dptnBankDao.setRequest(new BaseRequest());
        dptnBankDao.setFinishView(true);
        executeDao(dptnBankDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w0(DropDownSelector dropDownSelector, int i8) {
        this.f28280v = i8;
    }

    private void x0() {
        this.f28274p.setOnClickListener(this);
        this.f28275q.setOnClickListener(this);
        this.f28276r.setOnClickListener(this);
        this.f28278t.setOnClickListener(this);
        this.f28267i.addTextChangedListener(new C6491a(5, this.f28268j));
        this.f28268j.addTextChangedListener(new C6491a(4, this.f28269k));
        this.f28269k.addTextChangedListener(new C6491a(5, this.f28270l));
        this.f28270l.addTextChangedListener(new C6491a(2, this.f28271m));
        this.f28277s.setOnSelectorItemClickListener(new DropDownSelector.b() { // from class: x5.a
            @Override // com.korail.talk.viewGroup.DropDownSelector.b
            public final void onItemSelected(DropDownSelector dropDownSelector, int i8) {
                this.f37515a.w0(dropDownSelector, i8);
            }
        });
        ((CheckBox) findViewById(AbstractC5955f.cb_private_agree)).setOnCheckedChangeListener(this);
    }

    private void y0() {
        n0(false);
        this.f28267i = (EditText) findViewById(AbstractC5955f.et_delay_account_refund_ticket_wct_no);
        this.f28268j = (EditText) findViewById(AbstractC5955f.et_delay_account_refund_ticket_db);
        this.f28269k = (EditText) findViewById(AbstractC5955f.et_delay_account_refund_ticket_sq_no);
        this.f28270l = (EditText) findViewById(AbstractC5955f.et_delay_account_refund_ticket_pw);
        this.f28274p = (TextView) findViewById(AbstractC5955f.tv_delay_account_refund_ticket_inquiry);
        this.f28271m = (EditText) findViewById(AbstractC5955f.et_delay_account_refund_ticket_name);
        this.f28277s = (DropDownSelector) findViewById(AbstractC5955f.dds_delay_account_refund_account);
        this.f28272n = (EditText) findViewById(AbstractC5955f.et_delay_account_refund_account);
        this.f28275q = (TextView) findViewById(AbstractC5955f.tv_delay_account_refund_account_inquiry);
        this.f28276r = (TextView) findViewById(AbstractC5955f.tv_private_agree);
        this.f28273o = (EditText) findViewById(AbstractC5955f.et_delay_account_refund_contact);
        this.f28278t = (Button) findViewById(AbstractC5955f.btn_delay_account_refund_request);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
        this.f28278t.setEnabled(z8);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.tv_delay_account_refund_ticket_inquiry == id) {
            u0("A");
            return;
        }
        if (AbstractC5955f.tv_delay_account_refund_account_inquiry == id) {
            if (this.f28277s.getSelectIndex() == 0) {
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent("계좌정보를 확인해주세요.").showDialog();
                return;
            } else {
                u0(CashRfnDao.f27551B);
                return;
            }
        }
        if (AbstractC5955f.btn_delay_account_refund_request == id) {
            if (this.f28277s.getSelectIndex() == 0) {
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent("계좌정보를 확인해주세요.").showDialog();
                return;
            } else {
                u0(CashRfnDao.f27552I);
                return;
            }
        }
        if (AbstractC5955f.tv_private_agree == id) {
            C6637k.getPDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_payment_private_collection_title)).setStringArray(getResources().getStringArray(AbstractC5952c.delay_account_refund)).showDialog();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_delay_account_refund);
        if (C6630d.isNull(bundle)) {
            y0();
            setText();
            x0();
            t0();
            v0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_dptn_bank == id) {
            List<DptnBankDao.DptnBank> dptnBank = ((DptnBankDao.DptnBankResponse) iBaseDao.getResponse()).getDptnBank();
            this.f28279u = dptnBank;
            String[] strArr = new String[dptnBank.size() + 1];
            strArr[0] = getString(AbstractC5959j.delay_account_refund_select_bank);
            int i8 = 1;
            int i9 = 0;
            while (i9 < this.f28279u.size()) {
                strArr[i8] = ((DptnBankDao.DptnBank) this.f28279u.get(i9)).getDptnBankNm();
                i9++;
                i8++;
            }
            this.f28277s.setEntries(strArr, (String[]) null, 0);
            return;
        }
        if (AbstractC5955f.dao_cash_rfn == id) {
            CashRfnDao.CashRfnRequest cashRfnRequest = (CashRfnDao.CashRfnRequest) iBaseDao.getRequest();
            CashRfnDao.CashRfnResponse cashRfnResponse = (CashRfnDao.CashRfnResponse) iBaseDao.getResponse();
            String dmnPrsDvCd = cashRfnRequest.getDmnPrsDvCd();
            if ("A".equals(dmnPrsDvCd)) {
                C6219c cDialog = C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title));
                cDialog.setContent(cashRfnResponse.gethMsgTxt());
                cDialog.showDialog();
                this.f28275q.setEnabled(true);
                return;
            }
            if (CashRfnDao.f27551B.equals(dmnPrsDvCd)) {
                C6219c cDialog2 = C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title));
                cDialog2.setContent(cashRfnResponse.gethMsgTxt());
                cDialog2.showDialog();
            } else if (CashRfnDao.f27552I.equals(dmnPrsDvCd)) {
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title_delay_account_refund)).setContent(getString(AbstractC5959j.dialog_message_delay_account_refund, cashRfnResponse.getRfnAmt(), cashRfnResponse.gethMsgTxt())).showDialog();
            }
        }
    }
}
