package com.korail.talk.ui.stbk;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.korail.talk.data.StbkData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.pay.StbkAcntDao;
import com.korail.talk.network.dao.pay.StbkAcntDao.StbkAcntRequest;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import x4.C6491a;
import z4.C6630d;
import z4.C6637k;
import z4.N;

/* loaded from: classes.dex */
public class StbkPasswordRegisterActivity extends BaseViewActivity implements TextView.OnEditorActionListener {

    /* renamed from: i */
    private StbkData f28849i;

    /* renamed from: j */
    private final int f28850j = 1;

    /* renamed from: k */
    private final int f28851k = 6;

    /* renamed from: l */
    private EditText f28852l;

    /* renamed from: m */
    private EditText f28853m;

    /* renamed from: n */
    private EditText f28854n;

    /* renamed from: o */
    private EditText f28855o;

    /* renamed from: p */
    private EditText f28856p;

    /* renamed from: q */
    private EditText f28857q;

    /* renamed from: r */
    private EditText f28858r;

    /* renamed from: s */
    private EditText f28859s;

    /* renamed from: t */
    private EditText f28860t;

    /* renamed from: u */
    private EditText f28861u;

    /* renamed from: v */
    private EditText f28862v;

    /* renamed from: w */
    private EditText f28863w;

    /* renamed from: x */
    private Button f28864x;

    private class a implements View.OnKeyListener {

        /* renamed from: a */
        protected EditText f28865a;

        public a(EditText editText) {
            this.f28865a = editText;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i8, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 1 || i8 != 67) {
                return false;
            }
            this.f28865a.setText("");
            this.f28865a.requestFocus();
            return true;
        }
    }

    private class b extends C6491a {
        public b(int i8, EditText editText) {
            super(i8, editText);
        }

        @Override // x4.C6491a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            super.afterTextChanged(editable);
            StbkPasswordRegisterActivity.this.f28864x.setEnabled(StbkPasswordRegisterActivity.this.z0().length() == 6 && StbkPasswordRegisterActivity.this.y0().length() == 6);
        }
    }

    public /* synthetic */ void A0(DialogInterface dialogInterface, int i8) {
        StbkData stbkData = new StbkData();
        stbkData.setType(this.f28849i.getType());
        Intent intent = new Intent(getApplicationContext(), (Class<?>) StbkRegisterAccountListActivity.class);
        intent.putExtra("STBK_DATA", stbkData);
        intent.setFlags(872415232);
        startActivity(intent);
    }

    private void B0() {
        this.f28849i = (StbkData) getIntent().getSerializableExtra("STBK_DATA");
    }

    private void C0() {
        this.f28852l.setOnEditorActionListener(this);
        this.f28853m.setOnEditorActionListener(this);
        this.f28854n.setOnEditorActionListener(this);
        this.f28855o.setOnEditorActionListener(this);
        this.f28856p.setOnEditorActionListener(this);
        this.f28857q.setOnEditorActionListener(this);
        this.f28852l.addTextChangedListener(new b(1, this.f28853m));
        this.f28853m.addTextChangedListener(new b(1, this.f28854n));
        this.f28854n.addTextChangedListener(new b(1, this.f28855o));
        this.f28855o.addTextChangedListener(new b(1, this.f28856p));
        this.f28856p.addTextChangedListener(new b(1, this.f28857q));
        this.f28857q.addTextChangedListener(new b(1, this.f28858r));
        this.f28853m.setOnKeyListener(new a(this.f28852l));
        this.f28854n.setOnKeyListener(new a(this.f28853m));
        this.f28855o.setOnKeyListener(new a(this.f28854n));
        this.f28856p.setOnKeyListener(new a(this.f28855o));
        this.f28857q.setOnKeyListener(new a(this.f28856p));
        this.f28858r.setOnEditorActionListener(this);
        this.f28859s.setOnEditorActionListener(this);
        this.f28860t.setOnEditorActionListener(this);
        this.f28861u.setOnEditorActionListener(this);
        this.f28862v.setOnEditorActionListener(this);
        this.f28863w.setOnEditorActionListener(this);
        this.f28858r.setOnKeyListener(new a(this.f28857q));
        this.f28859s.setOnKeyListener(new a(this.f28858r));
        this.f28860t.setOnKeyListener(new a(this.f28859s));
        this.f28861u.setOnKeyListener(new a(this.f28860t));
        this.f28862v.setOnKeyListener(new a(this.f28861u));
        this.f28863w.setOnKeyListener(new a(this.f28862v));
        this.f28858r.addTextChangedListener(new b(1, this.f28859s));
        this.f28859s.addTextChangedListener(new b(1, this.f28860t));
        this.f28860t.addTextChangedListener(new b(1, this.f28861u));
        this.f28861u.addTextChangedListener(new b(1, this.f28862v));
        this.f28862v.addTextChangedListener(new b(1, this.f28863w));
        this.f28863w.addTextChangedListener(new b(1, null));
        this.f28864x.setOnClickListener(this);
    }

    private void D0() {
        n0(false);
        this.f28852l = (EditText) findViewById(AbstractC5955f.et_pw1);
        this.f28853m = (EditText) findViewById(AbstractC5955f.et_pw2);
        this.f28854n = (EditText) findViewById(AbstractC5955f.et_pw3);
        this.f28855o = (EditText) findViewById(AbstractC5955f.et_pw4);
        this.f28856p = (EditText) findViewById(AbstractC5955f.et_pw5);
        this.f28857q = (EditText) findViewById(AbstractC5955f.et_pw6);
        this.f28858r = (EditText) findViewById(AbstractC5955f.et_pw_confirm1);
        this.f28859s = (EditText) findViewById(AbstractC5955f.et_pw_confirm2);
        this.f28860t = (EditText) findViewById(AbstractC5955f.et_pw_confirm3);
        this.f28861u = (EditText) findViewById(AbstractC5955f.et_pw_confirm4);
        this.f28862v = (EditText) findViewById(AbstractC5955f.et_pw_confirm5);
        this.f28863w = (EditText) findViewById(AbstractC5955f.et_pw_confirm6);
        this.f28864x = (Button) findViewById(AbstractC5955f.btn_pw_register_confirm);
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_simple_password_register);
    }

    private void w0() {
        StbkAcntDao stbkAcntDao = new StbkAcntDao();
        StbkAcntDao.StbkAcntRequest stbkAcntRequest = stbkAcntDao.new StbkAcntRequest();
        stbkAcntRequest.setStlBankCd(this.f28849i.getStlBankCd());
        stbkAcntRequest.setJobDvCd(StbkAcntDao.CHANGE_PASSWORD);
        stbkAcntRequest.setStlApvPwd(y0());
        stbkAcntDao.setRequest(stbkAcntRequest);
        executeDao(stbkAcntDao);
    }

    private void x0() {
        StbkAcntDao stbkAcntDao = new StbkAcntDao();
        StbkAcntDao.StbkAcntRequest stbkAcntRequest = stbkAcntDao.new StbkAcntRequest();
        stbkAcntRequest.setStlBankCd(this.f28849i.getStlBankCd());
        stbkAcntRequest.setJobDvCd(StbkAcntDao.ACCOUNT_REGISTER);
        stbkAcntRequest.setAcntNo(this.f28849i.getAcntNo());
        stbkAcntRequest.setStbkTxnNo(this.f28849i.getStbkTxnNo());
        stbkAcntRequest.setStlBankCd(this.f28849i.getStlBankCd());
        stbkAcntRequest.setStlApvPwd(y0());
        stbkAcntDao.setRequest(stbkAcntRequest);
        executeDao(stbkAcntDao);
    }

    public String y0() {
        return N(this.f28858r) + N(this.f28859s) + N(this.f28860t) + N(this.f28861u) + N(this.f28862v) + N(this.f28863w);
    }

    public String z0() {
        return N(this.f28852l) + N(this.f28853m) + N(this.f28854n) + N(this.f28855o) + N(this.f28856p) + N(this.f28857q);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.btn_pw_register_confirm != view.getId()) {
            super.onClick(view);
            return;
        }
        if (!y0().equals(z0())) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.nonmember_check_password_equal)).showDialog();
        } else if (2 == this.f28849i.getSubType()) {
            x0();
        } else if (3 == this.f28849i.getSubType()) {
            w0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_stbk_password_register);
        if (C6630d.isNull(bundle)) {
            B0();
            D0();
            setText();
            C0();
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
        if (i8 == 6) {
            O(textView);
            return false;
        }
        if (i8 != 5) {
            return false;
        }
        int id = textView.getId();
        if (AbstractC5955f.et_pw1 == id) {
            this.f28853m.requestFocus();
            return false;
        }
        if (AbstractC5955f.et_pw2 == id) {
            this.f28854n.requestFocus();
            return false;
        }
        if (AbstractC5955f.et_pw3 == id) {
            this.f28855o.requestFocus();
            return false;
        }
        if (AbstractC5955f.et_pw4 == id) {
            this.f28856p.requestFocus();
            return false;
        }
        if (AbstractC5955f.et_pw5 == id) {
            this.f28857q.requestFocus();
            return false;
        }
        if (AbstractC5955f.et_pw6 == id) {
            this.f28858r.requestFocus();
            return false;
        }
        if (AbstractC5955f.et_pw_confirm1 == id) {
            this.f28859s.requestFocus();
            return false;
        }
        if (AbstractC5955f.et_pw_confirm2 == id) {
            this.f28860t.requestFocus();
            return false;
        }
        if (AbstractC5955f.et_pw_confirm3 == id) {
            this.f28861u.requestFocus();
            return false;
        }
        if (AbstractC5955f.et_pw_confirm4 == id) {
            this.f28862v.requestFocus();
            return false;
        }
        if (AbstractC5955f.et_pw_confirm5 != id) {
            return false;
        }
        this.f28863w.requestFocus();
        return false;
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_stbk_acnt == iBaseDao.getId()) {
            String string = 2 == this.f28849i.getSubType() ? getString(AbstractC5959j.dialog_simple_account_register_success) : 3 == this.f28849i.getSubType() ? getString(AbstractC5959j.dialog_simple_change_password_success) : null;
            if (N.isNotNull(string)) {
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(string).setButtonListener(new DialogInterface.OnClickListener() { // from class: Z5.c
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        this.f5746a.A0(dialogInterface, i8);
                    }
                }).showDialog();
            }
        }
    }
}
