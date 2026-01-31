package com.korail.talk.ui.scheme;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.common.EncryptDao;
import com.korail.talk.network.dao.common.EncryptDao.EncryptRequest;
import com.korail.talk.view.base.BaseActivity;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import m4.C5908a;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import org.json.JSONException;
import org.json.JSONObject;
import z4.C6630d;
import z4.H;
import z4.t;

/* loaded from: classes.dex */
public class DataActivity extends BaseActivity {
    private void g0() throws JSONException {
        try {
            String string = H.getString(getApplicationContext(), "KEY_LOGIN_TYPE");
            String string2 = H.getString(getApplicationContext(), "KEY_LOGIN_ID");
            String string3 = H.getString(getApplicationContext(), "KEY_LOGIN_PW");
            boolean z8 = H.getBoolean(getApplicationContext(), "KEY_AUTO_LOGIN");
            boolean z9 = H.getBoolean(getApplicationContext(), "KEY_MEMBER_NUM");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("loginType", string);
            jSONObject.put("loginId", (z9 || z8) ? C5908a.decryptAES(getApplicationContext(), string2) : "");
            jSONObject.put("loginPw", z8 ? C5908a.decryptAES(getApplicationContext(), string3) : "");
            jSONObject.put("isAutoLogin", z8);
            jSONObject.put("isSaveMemberNumber", z9);
            String strEncryptBase64 = C5908a.encryptBase64(jSONObject.toString());
            t.e("base64 " + strEncryptBase64);
            ArrayList arrayList = new ArrayList();
            arrayList.add(strEncryptBase64);
            EncryptDao encryptDao = new EncryptDao();
            EncryptDao.EncryptRequest encryptRequest = encryptDao.new EncryptRequest();
            encryptRequest.setType("1");
            encryptRequest.setValueList(arrayList);
            encryptDao.setRequest(encryptRequest);
            encryptDao.setFinishView(true);
            executeDao(encryptDao);
        } catch (UnsupportedEncodingException e8) {
            e = e8;
            t.e(e.getMessage());
            finish();
        } catch (JSONException e9) {
            e = e9;
            t.e(e.getMessage());
            finish();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, JSONException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        if (C6630d.isNotNull(getIntent())) {
            g0();
        } else {
            finish();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_encrypt == iBaseDao.getId()) {
            String encValue = ((EncryptDao.EncryptResponse) iBaseDao.getResponse()).getEncValueList().get(0).getEncValue();
            t.e("encryptValue : " + encValue);
            sendLoginData(encValue);
        }
    }

    public void sendLoginData(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(getString(AbstractC5959j.data_login_scheme, str)));
        intent.setFlags(872415232);
        startActivity(intent);
        finish();
    }
}
