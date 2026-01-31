package com.korail.talk.ui.stbk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
public class StbkArsVerificationActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private StbkData f28835i;

    private void s0() {
        StbkAcntDao stbkAcntDao = new StbkAcntDao();
        StbkAcntDao.StbkAcntRequest stbkAcntRequest = stbkAcntDao.new StbkAcntRequest();
        stbkAcntRequest.setStlBankCd(this.f28835i.getStlBankCd());
        stbkAcntRequest.setJobDvCd("2");
        stbkAcntRequest.setAcntNo(this.f28835i.getAcntNo());
        stbkAcntRequest.setCustCpNo(this.f28835i.getPhoneNumber());
        stbkAcntDao.setRequest(stbkAcntRequest);
        executeDao(stbkAcntDao);
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_bank_ars_verification);
    }

    private void t0() {
        StbkAcntDao stbkAcntDao = new StbkAcntDao();
        StbkAcntDao.StbkAcntRequest stbkAcntRequest = stbkAcntDao.new StbkAcntRequest();
        stbkAcntRequest.setStlBankCd(this.f28835i.getStlBankCd());
        stbkAcntRequest.setJobDvCd("3");
        stbkAcntRequest.setStbkTxnNo(this.f28835i.getStbkTxnNo());
        stbkAcntDao.setRequest(stbkAcntRequest);
        executeDao(stbkAcntDao);
    }

    private void u0() {
        this.f28835i = (StbkData) getIntent().getSerializableExtra("STBK_DATA");
    }

    private void v0() {
        findViewById(AbstractC5955f.btn_left).setOnClickListener(this);
        findViewById(AbstractC5955f.btn_right).setOnClickListener(this);
    }

    private void w0() {
        n0(false);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.btn_left == id) {
            s0();
        } else if (AbstractC5955f.btn_right == id) {
            t0();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_stbk_ars_verification);
        if (C6630d.isNull(bundle)) {
            u0();
            w0();
            setText();
            v0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_stbk_acnt == iBaseDao.getId()) {
            StbkAcntDao.StbkAcntRequest stbkAcntRequest = (StbkAcntDao.StbkAcntRequest) iBaseDao.getRequest();
            this.f28835i.setStbkTxnNo(((StbkAcntDao.StbkAcntResponse) iBaseDao.getResponse()).getStbkTxnNo());
            if ("3".equals(stbkAcntRequest.getJobDvCd())) {
                Intent intent = new Intent(getApplicationContext(), (Class<?>) StbkPasswordRegisterActivity.class);
                intent.putExtra("STBK_DATA", this.f28835i);
                startActivity(intent);
            }
        }
    }
}
