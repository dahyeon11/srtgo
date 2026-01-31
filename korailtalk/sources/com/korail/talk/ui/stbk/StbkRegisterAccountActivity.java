package com.korail.talk.ui.stbk;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.korail.talk.data.StbkData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.pay.StbkAcntDao;
import com.korail.talk.network.dao.pay.StbkAcntDao.StbkAcntRequest;
import com.korail.talk.view.base.BaseViewActivity;
import com.squareup.picasso.p;
import com.squareup.picasso.s;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.N;

/* loaded from: classes.dex */
public class StbkRegisterAccountActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private StbkData f28868i;

    /* renamed from: j, reason: collision with root package name */
    private EditText f28869j;

    /* renamed from: k, reason: collision with root package name */
    private EditText f28870k;

    /* renamed from: l, reason: collision with root package name */
    private Button f28871l;

    /* renamed from: m, reason: collision with root package name */
    private Button f28872m;

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            StbkRegisterAccountActivity.this.f28871l.setEnabled(editable.length() > 0);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }

    private void setText() {
        setAppTitle(AbstractC5959j.common_register_account);
    }

    private void u0() {
        StbkAcntDao stbkAcntDao = new StbkAcntDao();
        StbkAcntDao.StbkAcntRequest stbkAcntRequest = stbkAcntDao.new StbkAcntRequest();
        stbkAcntRequest.setStlBankCd(this.f28868i.getStlBankCd());
        stbkAcntRequest.setJobDvCd("1");
        stbkAcntRequest.setAcntNo(N(this.f28869j));
        stbkAcntDao.setRequest(stbkAcntRequest);
        executeDao(stbkAcntDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean v0(TextView textView, int i8, KeyEvent keyEvent) {
        if (6 != i8) {
            return false;
        }
        u0();
        return false;
    }

    private void w0() {
        this.f28868i = (StbkData) getIntent().getSerializableExtra("STBK_DATA");
    }

    private void x0() {
        this.f28871l.setOnClickListener(this);
        this.f28872m.setOnClickListener(this);
        this.f28869j.addTextChangedListener(new a());
        this.f28869j.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: Z5.d
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
                return this.f5747a.v0(textView, i8, keyEvent);
            }
        });
    }

    private void y0() {
        n0(false);
        this.f28869j = (EditText) findViewById(AbstractC5955f.et_stbk_register_account);
        this.f28870k = (EditText) findViewById(AbstractC5955f.et_stbk_register_account_name);
        this.f28871l = (Button) findViewById(AbstractC5955f.btn_stbk_register_account_check);
        this.f28872m = (Button) findViewById(AbstractC5955f.btn_stbk_register_account_confirm);
        s.get().load(this.f28868i.getImageUrl()).resize(N.dpToPx(150.0f), N.dpToPx(30.0f)).networkPolicy(p.NO_CACHE, p.NO_STORE).into((ImageView) findViewById(AbstractC5955f.iv_bank_register_account));
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.btn_stbk_register_account_check == id) {
            u0();
            return;
        }
        if (AbstractC5955f.btn_stbk_register_account_confirm != id) {
            super.onClick(view);
            return;
        }
        this.f28868i.setAcntNo(N(this.f28869j));
        Intent intent = new Intent(getApplicationContext(), (Class<?>) StbkArsCertificationActivity.class);
        intent.putExtra("STBK_DATA", this.f28868i);
        startActivity(intent);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_stbk_register_account);
        if (C6630d.isNull(bundle)) {
            w0();
            y0();
            setText();
            x0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_stbk_acnt == iBaseDao.getId()) {
            StbkAcntDao.StbkAcntResponse stbkAcntResponse = (StbkAcntDao.StbkAcntResponse) iBaseDao.getResponse();
            this.f28869j.setEnabled(false);
            this.f28870k.setText(stbkAcntResponse.getCustNm());
            this.f28871l.setEnabled(false);
            this.f28872m.setEnabled(true);
        }
    }
}
