package com.korail.talk.ui.stbk;

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
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import r4.g;
import x4.C6491a;
import z4.C6630d;

/* loaded from: classes.dex */
public class StbkPasswordEnterActivity extends BaseViewActivity implements TextView.OnEditorActionListener {

    /* renamed from: i */
    private StbkData f28836i;

    /* renamed from: j */
    private final int f28837j = 1;

    /* renamed from: k */
    private final int f28838k = 6;

    /* renamed from: l */
    private EditText f28839l;

    /* renamed from: m */
    private EditText f28840m;

    /* renamed from: n */
    private EditText f28841n;

    /* renamed from: o */
    private EditText f28842o;

    /* renamed from: p */
    private EditText f28843p;

    /* renamed from: q */
    private EditText f28844q;

    /* renamed from: r */
    private Button f28845r;

    private class a implements View.OnKeyListener {

        /* renamed from: a */
        protected EditText f28846a;

        public a(EditText editText) {
            this.f28846a = editText;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i8, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 1 || i8 != 67) {
                return false;
            }
            this.f28846a.setText("");
            this.f28846a.requestFocus();
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
            StbkPasswordEnterActivity.this.f28845r.setEnabled(StbkPasswordEnterActivity.this.w0().length() == 6);
        }
    }

    private void A0() {
        this.f28836i.setPassword(w0());
        if (this.f28836i.getType() == 0) {
            v0();
        } else if (1 == this.f28836i.getType()) {
            Intent intent = new Intent();
            intent.putExtra("STBK_DATA", this.f28836i);
            setResult(-1, intent);
            finish();
        }
    }

    private void B0() {
        n0(false);
        this.f28839l = (EditText) findViewById(AbstractC5955f.et_pw1);
        this.f28840m = (EditText) findViewById(AbstractC5955f.et_pw2);
        this.f28841n = (EditText) findViewById(AbstractC5955f.et_pw3);
        this.f28842o = (EditText) findViewById(AbstractC5955f.et_pw4);
        this.f28843p = (EditText) findViewById(AbstractC5955f.et_pw5);
        this.f28844q = (EditText) findViewById(AbstractC5955f.et_pw6);
        this.f28845r = (Button) findViewById(AbstractC5955f.btn_pw_enter);
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_simple_password_enter);
    }

    private void v0() {
        StbkAcntDao stbkAcntDao = new StbkAcntDao();
        StbkAcntDao.StbkAcntRequest stbkAcntRequest = stbkAcntDao.new StbkAcntRequest();
        stbkAcntRequest.setStlBankCd(this.f28836i.getStlBankCd());
        stbkAcntRequest.setJobDvCd(StbkAcntDao.DELETE_ACCOUNT);
        stbkAcntRequest.setStlApvPwd(this.f28836i.getPassword());
        stbkAcntDao.setRequest(stbkAcntRequest);
        executeDao(stbkAcntDao);
    }

    public String w0() {
        return N(this.f28839l) + N(this.f28840m) + N(this.f28841n) + N(this.f28842o) + N(this.f28843p) + N(this.f28844q);
    }

    public /* synthetic */ void x0(View view) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
        intent.putExtra("WEB_POST_URL", g.IDENTITY_VERIFICATION_URL);
        startActivityForResult(intent, 120);
    }

    private void y0() {
        this.f28836i = (StbkData) getIntent().getSerializableExtra("STBK_DATA");
    }

    private void z0() {
        this.f28845r.setOnClickListener(this);
        this.f28839l.setOnEditorActionListener(this);
        this.f28840m.setOnEditorActionListener(this);
        this.f28841n.setOnEditorActionListener(this);
        this.f28842o.setOnEditorActionListener(this);
        this.f28843p.setOnEditorActionListener(this);
        this.f28844q.setOnEditorActionListener(this);
        this.f28839l.addTextChangedListener(new b(1, this.f28840m));
        this.f28840m.addTextChangedListener(new b(1, this.f28841n));
        this.f28841n.addTextChangedListener(new b(1, this.f28842o));
        this.f28842o.addTextChangedListener(new b(1, this.f28843p));
        this.f28843p.addTextChangedListener(new b(1, this.f28844q));
        this.f28844q.addTextChangedListener(new b(1, null));
        this.f28840m.setOnKeyListener(new a(this.f28839l));
        this.f28841n.setOnKeyListener(new a(this.f28840m));
        this.f28842o.setOnKeyListener(new a(this.f28841n));
        this.f28843p.setOnKeyListener(new a(this.f28842o));
        this.f28844q.setOnKeyListener(new a(this.f28843p));
        findViewById(AbstractC5955f.tv_find_pw).setOnClickListener(new View.OnClickListener() { // from class: Z5.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5745a.x0(view);
            }
        });
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (16 == i9 && 120 == i8 && intent.hasExtra("IDENTITY_VERIFICATION_SUCCESS")) {
            this.f28836i.setSubType(3);
            Intent intent2 = new Intent(getApplicationContext(), (Class<?>) StbkPasswordRegisterActivity.class);
            intent2.putExtra("STBK_DATA", this.f28836i);
            startActivity(intent2);
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.btn_pw_enter == view.getId()) {
            A0();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_stbk_password_enter);
        if (C6630d.isNull(bundle)) {
            y0();
            B0();
            setText();
            z0();
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
            this.f28840m.requestFocus();
            return false;
        }
        if (AbstractC5955f.et_pw2 == id) {
            this.f28841n.requestFocus();
            return false;
        }
        if (AbstractC5955f.et_pw3 == id) {
            this.f28842o.requestFocus();
            return false;
        }
        if (AbstractC5955f.et_pw4 == id) {
            this.f28843p.requestFocus();
            return false;
        }
        if (AbstractC5955f.et_pw5 != id) {
            return false;
        }
        this.f28844q.requestFocus();
        return false;
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_stbk_acnt == iBaseDao.getId()) {
            Intent intent = new Intent();
            intent.putExtra("STBK_DATA", this.f28836i);
            setResult(-1, intent);
            finish();
        }
    }
}
