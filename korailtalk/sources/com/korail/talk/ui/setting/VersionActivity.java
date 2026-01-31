package com.korail.talk.ui.setting;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.cache.AppDataDao;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import r4.g;
import z4.C6630d;
import z4.G;

/* loaded from: classes.dex */
public class VersionActivity extends BaseViewActivity implements View.OnClickListener {

    /* renamed from: i, reason: collision with root package name */
    private String f28742i;

    /* renamed from: j, reason: collision with root package name */
    private String f28743j;

    /* renamed from: k, reason: collision with root package name */
    private int f28744k;

    /* renamed from: l, reason: collision with root package name */
    private Button f28745l;

    private void s0() {
        AppDataDao appDataDao = new AppDataDao();
        appDataDao.setPending(true);
        executeDao(appDataDao);
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_version_info);
        if (C6630d.isNull(this.f28743j) || C6630d.isNull(this.f28742i)) {
            return;
        }
        TextView textView = (TextView) findViewById(AbstractC5955f.curVerTxt);
        textView.setText(getString(AbstractC5959j.version_info_current_version, C6630d.getVersionName()));
        textView.setOnClickListener(this);
        if (!C6630d.isAppUpdate(this.f28743j, this.f28742i)) {
            ((TextView) findViewById(AbstractC5955f.latestVerTxt)).setText(getString(AbstractC5959j.version_info_this_version_last_version));
            this.f28745l.setVisibility(8);
        } else {
            ((TextView) findViewById(AbstractC5955f.latestVerTxt)).setText(String.format(getString(AbstractC5959j.version_info_last_version), this.f28742i));
            this.f28745l.setVisibility(0);
            findViewById(AbstractC5955f.updateBtn).setVisibility(0);
        }
    }

    private void t0() {
        this.f28745l.setOnClickListener(this);
    }

    private void u0() {
        m0();
        this.f28745l = (Button) findViewById(AbstractC5955f.updateBtn);
    }

    private void v0() throws PackageManager.NameNotFoundException {
        int i8 = this.f28744k;
        this.f28744k = i8 + 1;
        if (i8 % 10 == 9) {
            try {
                Toast.makeText(this, "VERSION:" + getPackageManager().getPackageInfo(getPackageName(), 0).versionCode + "\nSERVER_TYPE:" + g.SERVER_TYPE.name(), 1).show();
            } catch (PackageManager.NameNotFoundException e8) {
                e8.printStackTrace();
            }
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) throws PackageManager.NameNotFoundException {
        O(view);
        int id = view.getId();
        if (AbstractC5955f.updateBtn == id) {
            G.moveToGooglePlay(K(), getPackageName());
        } else if (AbstractC5955f.curVerTxt == id) {
            v0();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.version_activity);
        if (C6630d.isNull(bundle)) {
            u0();
            t0();
            s0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_app_data == iBaseDao.getId()) {
            this.f28742i = ((AppDataDao.AppDataResponse) iBaseDao.getResponse()).getVersion().getNEWDVERSION();
            this.f28743j = C6630d.getVersionName();
            setText();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onResume() {
        super.onResume();
        setText();
        this.f28744k = 0;
    }
}
