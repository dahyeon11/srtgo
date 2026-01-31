package com.korail.talk.ui.railPlus;

import Q7.X;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import com.korail.talk.data.PlayAppData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.addService.HelpSrvCustDao;
import com.korail.talk.network.dao.common.DecryptDao;
import com.korail.talk.network.dao.common.DecryptDao.DecryptRequest;
import com.korail.talk.network.dao.delay.CashRfnDao;
import com.korail.talk.network.dao.railplus.AutoChargeDao;
import com.korail.talk.network.dao.railplus.AutoChargeDao.AutoChargeRequest;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import y4.C6536a;
import z4.C6630d;
import z4.C6637k;
import z4.G;
import z4.N;

/* loaded from: classes.dex */
public class RailPlusActivity extends BaseViewActivity implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: i, reason: collision with root package name */
    private final String f28597i = CashRfnDao.f27552I;

    /* renamed from: j, reason: collision with root package name */
    private final String f28598j = HelpSrvCustDao.HelpSrvCustRequest.f27549D;

    /* renamed from: k, reason: collision with root package name */
    private final String f28599k = "R";

    /* renamed from: l, reason: collision with root package name */
    private TextView f28600l;

    /* renamed from: m, reason: collision with root package name */
    private CheckBox f28601m;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0(DialogInterface dialogInterface, int i8) {
        finish();
    }

    private void B0() {
        this.f28601m.setOnCheckedChangeListener(null);
    }

    private void C0() {
        B0();
        this.f28601m.setChecked(!r0.isChecked());
        E0();
    }

    private void D0() {
        this.f28600l.setText(N.applySpannable(N.getDecimalFormatString(w0()), new ForegroundColorSpan(Color.parseColor("#0066b3"))));
        this.f28600l.append(getString(AbstractC5959j.common_amount, X.SPACE));
    }

    private void E0() {
        this.f28601m.setOnCheckedChangeListener(this);
    }

    private void F0() {
        findViewById(AbstractC5955f.tv_card_info).setOnClickListener(this);
        findViewById(AbstractC5955f.btn_move_rail_plus).setOnClickListener(this);
    }

    private void G0() {
        n0(false);
        this.f28600l = (TextView) findViewById(AbstractC5955f.tv_card_amount);
        this.f28601m = (CheckBox) findViewById(AbstractC5955f.cb_auto_charge);
    }

    private void setText() {
        setAppTitle(AbstractC5959j.common_rail_plus);
    }

    private void u0(String str, String str2) {
        AutoChargeDao autoChargeDao = new AutoChargeDao();
        AutoChargeDao.AutoChargeRequest autoChargeRequest = autoChargeDao.new AutoChargeRequest();
        autoChargeRequest.setJobDvCd(str);
        autoChargeRequest.setPrepCrdNo(str2);
        autoChargeDao.setRequest(autoChargeRequest);
        executeDao(autoChargeDao);
    }

    private void v0(String str, String... strArr) {
        DecryptDao decryptDao = new DecryptDao();
        DecryptDao.DecryptRequest decryptRequest = decryptDao.new DecryptRequest();
        decryptRequest.setType("1");
        decryptRequest.setValueList(Arrays.asList(strArr));
        decryptRequest.setAutoChargeRequestType(str);
        decryptDao.setRequest(decryptRequest);
        decryptDao.setFinishView(true);
        executeDao(decryptDao);
    }

    private String w0() {
        return getIntent().getData().getQueryParameter("BALANCE");
    }

    private String x0() {
        return getIntent().getData().getQueryParameter("CARD_NO");
    }

    private void y0() {
        PlayAppData playAppData = new PlayAppData();
        playAppData.setIntent(G.getIntentScheme(getString(AbstractC5959j.payment_rail_plus_cardinfo_scheme), "com.mic.set.hce.railpluscardserviceandroid"));
        playAppData.setShowDialog(true);
        playAppData.setFinishActivity(true);
        playAppData.setTitle(getString(AbstractC5959j.railplus_app_install_title));
        playAppData.setMessageList(getString(AbstractC5959j.railplus_app_install_message), N.applySpannable(getString(AbstractC5959j.railplus_app_install_sub_message), new ForegroundColorSpan(Color.parseColor("#0066b3"))));
        G.playApp(K(), playAppData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(String str, DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            C0();
        } else if (102 == i8) {
            v0(str, x0());
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
        final String str = z8 ? CashRfnDao.f27552I : HelpSrvCustDao.HelpSrvCustRequest.f27549D;
        C6637k.getCDialog(K(), 1002, 0, getString(z8 ? AbstractC5959j.railplus_ktx_auto_change_request_title : AbstractC5959j.railplus_ktx_auto_change_cancel_title)).setContent(getString(z8 ? AbstractC5959j.railplus_ktx_auto_change_request_message : AbstractC5959j.railplus_ktx_auto_change_cancel_message), z8 ? N.applySpannable(getString(AbstractC5959j.railplus_ktx_auto_change_request_sub_message), new ForegroundColorSpan(Color.parseColor("#0066b3"))) : N.applySpannable(getString(AbstractC5959j.railplus_ktx_auto_change_cancel_sub_message), new ForegroundColorSpan(Color.parseColor("#0066b3")))).setButtonListener(new DialogInterface.OnClickListener() { // from class: M5.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f3146a.z0(str, dialogInterface, i8);
            }
        }).showDialog();
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.tv_card_info != id) {
            if (AbstractC5955f.btn_move_rail_plus == id) {
                G.playApp(K(), G.getIntentDefault(K(), "com.mic.set.hce.railpluscardserviceandroid"));
                return;
            } else {
                super.onClick(view);
                return;
            }
        }
        C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.railplus_ktx_auto_change_request_message) + "\n\n" + getString(AbstractC5959j.railplus_app_install_message)).showDialog();
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_rail_plus);
        if (C6630d.isNull(bundle)) {
            G0();
            setText();
            F0();
            y0();
        }
    }

    @Override // androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        if (C6630d.isNull(getIntent()) || C6630d.isNull(getIntent().getData())) {
            return;
        }
        Uri data = getIntent().getData();
        if ("000000".equals(data.getQueryParameter("RET_CODE"))) {
            D0();
            v0("R", x0());
        } else {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(data.getQueryParameter("RET_MSG")).setButtonListener(new DialogInterface.OnClickListener() { // from class: M5.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f3148a.A0(dialogInterface, i8);
                }
            }).showDialog();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_decrypt == id) {
            u0(((DecryptDao.DecryptRequest) iBaseDao.getRequest()).getAutoChargeRequestType(), ((DecryptDao.DecryptResponse) iBaseDao.getResponse()).getDecValueList().get(0).getDecValue());
            return;
        }
        if (AbstractC5955f.dao_auto_charge == id) {
            AutoChargeDao.AutoChargeRequest autoChargeRequest = (AutoChargeDao.AutoChargeRequest) iBaseDao.getRequest();
            AutoChargeDao.AutoChargeResponse autoChargeResponse = (AutoChargeDao.AutoChargeResponse) iBaseDao.getResponse();
            String jobDvCd = autoChargeRequest.getJobDvCd();
            if (!"R".equals(jobDvCd)) {
                Toast.makeText(getApplicationContext(), getString(CashRfnDao.f27552I.equals(jobDvCd) ? AbstractC5959j.railplus_request_success_toast : AbstractC5959j.railplus_request_cancel_toast), 0).show();
            } else {
                this.f28601m.setChecked(autoChargeResponse.getPsbFlg().equals("Y"));
                E0();
            }
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        super.onReceiveError(iBaseDao, c6536a);
        if (AbstractC5955f.dao_auto_charge == iBaseDao.getId()) {
            if (!"R".equals(((AutoChargeDao.AutoChargeRequest) iBaseDao.getRequest()).getJobDvCd())) {
                C0();
            }
            E0();
        }
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        y0();
    }
}
