package com.korail.talk.ui.certification;

import Q7.C0709m;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.kakao.sdk.auth.Constants;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.certification.GovernmentCertificationStep1Dao;
import com.korail.talk.network.dao.certification.GovernmentCertificationStep1Dao.GovernmentCertificationStep1Request;
import com.korail.talk.network.dao.certification.GovernmentCertificationStep2Dao;
import com.korail.talk.network.dao.certification.GovernmentCertificationStep2Dao.GovernmentCertificationStep2Request;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import org.json.JSONException;
import org.json.JSONObject;
import y4.C6536a;
import z4.C6630d;
import z4.t;

/* loaded from: classes.dex */
public class GovernmentCertificationActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private final int f27936i = 100;

    /* renamed from: j, reason: collision with root package name */
    private String f27937j;

    /* renamed from: k, reason: collision with root package name */
    private String f27938k;

    /* renamed from: l, reason: collision with root package name */
    private String f27939l;

    /* renamed from: m, reason: collision with root package name */
    private TextView f27940m;

    /* renamed from: n, reason: collision with root package name */
    private Button f27941n;

    /* renamed from: o, reason: collision with root package name */
    private Button f27942o;

    private void s0() {
        this.f27937j = getIntent().getStringExtra("JOURNEY_INFO");
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_government_certification);
        this.f27940m.setText(this.f27937j);
    }

    private void t0() {
        this.f27941n.setOnClickListener(this);
        this.f27942o.setOnClickListener(this);
    }

    private void u0() {
        n0(false);
        this.f27940m = (TextView) findViewById(AbstractC5955f.tv_government_certification);
        this.f27941n = (Button) findViewById(AbstractC5955f.btn_government_certification);
        Button button = (Button) findViewById(AbstractC5955f.btn_confirm);
        this.f27942o = button;
        button.setEnabled(false);
    }

    public void executeGovernmentCertificationStep1() {
        GovernmentCertificationStep1Dao governmentCertificationStep1Dao = new GovernmentCertificationStep1Dao();
        governmentCertificationStep1Dao.setRequest(governmentCertificationStep1Dao.new GovernmentCertificationStep1Request());
        executeDao(governmentCertificationStep1Dao);
    }

    public void executeGovernmentCertificationStep2(String str) {
        GovernmentCertificationStep2Dao governmentCertificationStep2Dao = new GovernmentCertificationStep2Dao();
        GovernmentCertificationStep2Dao.GovernmentCertificationStep2Request governmentCertificationStep2Request = governmentCertificationStep2Dao.new GovernmentCertificationStep2Request();
        governmentCertificationStep2Request.setCsrfToken(str);
        governmentCertificationStep2Dao.setRequest(governmentCertificationStep2Request);
        executeDao(governmentCertificationStep2Dao);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        Uri data;
        super.onActivityResult(i8, i9, intent);
        if (i8 == 100 && -1 == i9 && (data = intent.getData()) != null && C0709m.TRUE.equals(data.getQueryParameter("result"))) {
            executeGovernmentCertificationStep2(this.f27938k);
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.btn_government_certification == id) {
            executeGovernmentCertificationStep1();
            return;
        }
        if (AbstractC5955f.btn_confirm != id) {
            super.onClick(view);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("PBEP_INFO", this.f27939l);
        setResult(-1, intent);
        finish();
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_government_certification);
        if (C6630d.isNull(bundle)) {
            s0();
            u0();
            setText();
            t0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_government_certification_step1 != id) {
            if (AbstractC5955f.dao_government_certification_step2 == id) {
                GovernmentCertificationStep2Dao.GovernmentCertificationStep2Response governmentCertificationStep2Response = (GovernmentCertificationStep2Dao.GovernmentCertificationStep2Response) iBaseDao.getResponse();
                t.d("[Step2] pbepInfo : " + governmentCertificationStep2Response.getPbepInfo());
                this.f27939l = governmentCertificationStep2Response.getPbepInfo();
                this.f27941n.setText(AbstractC5959j.mypage_certification_complete);
                this.f27941n.setEnabled(false);
                this.f27942o.setEnabled(true);
                return;
            }
            return;
        }
        GovernmentCertificationStep1Dao.GovernmentCertificationResponse governmentCertificationResponse = (GovernmentCertificationStep1Dao.GovernmentCertificationResponse) iBaseDao.getResponse();
        StringBuffer stringBuffer = new StringBuffer();
        this.f27938k = governmentCertificationResponse.getCsrfToken();
        t.d("[Step1] token : " + this.f27938k);
        try {
            JSONObject jSONObject = new JSONObject(governmentCertificationResponse.getApp());
            stringBuffer.append("bmc://verify_vp?appName=");
            stringBuffer.append(getString(AbstractC5959j.korailtalk_scheme));
            stringBuffer.append("&type=VERIFY&spDid=");
            stringBuffer.append(jSONObject.optString("sp_did"));
            stringBuffer.append("&serviceCode=");
            stringBuffer.append(jSONObject.optString("service_code"));
            stringBuffer.append("&callBackUrl=");
            stringBuffer.append(jSONObject.optString("callback_url"));
            stringBuffer.append("&nonce=");
            stringBuffer.append(jSONObject.optString(Constants.NONCE));
            stringBuffer.append("&encryptType=");
            stringBuffer.append(jSONObject.optString("encrypt_type"));
            stringBuffer.append("&sessionId=");
            stringBuffer.append(jSONObject.optString("sessionId"));
        } catch (JSONException e8) {
            t.e("JSONException = " + e8.getMessage());
        }
        startActivityForResult(new Intent("kr.go.id.bmc.VERIFY_VP", Uri.parse(stringBuffer.toString())), 100);
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        super.onReceiveError(iBaseDao, c6536a);
        if (AbstractC5955f.dao_government_certification_step2 == iBaseDao.getId()) {
            this.f27942o.setEnabled(false);
        }
    }
}
