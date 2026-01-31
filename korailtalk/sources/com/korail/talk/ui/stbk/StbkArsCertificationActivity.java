package com.korail.talk.ui.stbk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.korail.talk.data.StbkData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.pay.StbkAcntDao;
import com.korail.talk.network.dao.pay.StbkAcntDao.StbkAcntRequest;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;

/* loaded from: classes.dex */
public class StbkArsCertificationActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private StbkData f28833i;

    /* renamed from: j, reason: collision with root package name */
    private EditText f28834j;

    private void s0() {
        StbkAcntDao stbkAcntDao = new StbkAcntDao();
        StbkAcntDao.StbkAcntRequest stbkAcntRequest = stbkAcntDao.new StbkAcntRequest();
        stbkAcntRequest.setStlBankCd(this.f28833i.getStlBankCd());
        stbkAcntRequest.setJobDvCd("2");
        stbkAcntRequest.setAcntNo(this.f28833i.getAcntNo());
        stbkAcntRequest.setCustCpNo(this.f28833i.getPhoneNumber());
        stbkAcntDao.setRequest(stbkAcntRequest);
        executeDao(stbkAcntDao);
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_bank_ars_verification);
        this.f28834j.setText(this.f28833i.getPhoneNumber());
    }

    private void t0() {
        this.f28833i = (StbkData) getIntent().getSerializableExtra("STBK_DATA");
    }

    private void u0() {
        findViewById(AbstractC5955f.btn_bank_ars_certification_confirm).setOnClickListener(this);
    }

    private void v0() {
        n0(false);
        this.f28834j = (EditText) findViewById(AbstractC5955f.et_stbk_ars_certification_name);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.btn_bank_ars_certification_confirm == view.getId()) {
            s0();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_stbk_ars_certification);
        if (C6630d.isNull(bundle)) {
            t0();
            v0();
            setText();
            u0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_stbk_acnt == iBaseDao.getId()) {
            this.f28833i.setStbkTxnNo(((StbkAcntDao.StbkAcntResponse) iBaseDao.getResponse()).getStbkTxnNo());
            Intent intent = new Intent(getApplicationContext(), (Class<?>) StbkArsVerificationActivity.class);
            intent.putExtra("STBK_DATA", this.f28833i);
            startActivity(intent);
        }
    }
}
