package com.korail.talk.ui.service.sms;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import com.korail.talk.database.model.SMSData;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.ticket.GuardianReliefSmsDao;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import m4.C5908a;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import q4.C6111b;
import z4.C6630d;
import z4.C6637k;
import z4.N;

/* loaded from: classes.dex */
public class GuardianReliefSmsActivity extends BaseViewActivity implements CompoundButton.OnCheckedChangeListener, TextWatcher {

    /* renamed from: i, reason: collision with root package name */
    private SMSData f28666i;

    /* renamed from: j, reason: collision with root package name */
    private EditText f28667j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f28668k;

    /* renamed from: l, reason: collision with root package name */
    private CheckBox f28669l;

    /* renamed from: m, reason: collision with root package name */
    private Button f28670m;

    private void setText() {
        setAppTitle(AbstractC5959j.guardian_relief_sms_title);
        this.f28668k.setText(N.applySpannable(getString(AbstractC5959j.common_private_collection), new UnderlineSpan()));
    }

    private void t0() {
        this.f28670m.setEnabled(N(this.f28667j).length() >= 10 && this.f28669l.isChecked());
    }

    private void u0() {
        IBaseDao guardianReliefSmsDao = new GuardianReliefSmsDao();
        GuardianReliefSmsDao.GuardianReliefSmsRequest guardianReliefSmsRequest = (GuardianReliefSmsDao.GuardianReliefSmsRequest) M(getIntent(), "SMS_REQUEST");
        guardianReliefSmsRequest.setRcvPsHndyTeln(N(this.f28667j));
        guardianReliefSmsDao.setRequest(guardianReliefSmsRequest);
        executeDao(guardianReliefSmsDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0(DialogInterface dialogInterface, int i8) {
        finish();
    }

    private void w0() {
        this.f28666i = (SMSData) M(getIntent(), "SMS_DATA");
    }

    private void x0() {
        this.f28668k.setOnClickListener(this);
        this.f28670m.setOnClickListener(this);
        this.f28667j.addTextChangedListener(this);
        this.f28669l.setOnCheckedChangeListener(this);
    }

    private void y0() {
        l0();
        this.f28667j = (EditText) findViewById(AbstractC5955f.et_guardian_relief_sms);
        this.f28668k = (TextView) findViewById(AbstractC5955f.tv_guardian_relief_sms_agree);
        this.f28669l = (CheckBox) findViewById(AbstractC5955f.cb_guardian_relief_sms_agree);
        this.f28670m = (Button) findViewById(AbstractC5955f.btn_guardian_relief_sms_send);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        t0();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
        t0();
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.tv_guardian_relief_sms_agree == id) {
            C6637k.getPDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_payment_private_collection_title)).setStringArray(getResources().getStringArray(AbstractC5952c.guardian_relief_sms)).showDialog();
        } else if (AbstractC5955f.btn_guardian_relief_sms_send == id) {
            u0();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_guardian_relief_sms);
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
        if (AbstractC5955f.dao_guardian_relief_sms == iBaseDao.getId()) {
            BaseResponse response = iBaseDao.getResponse();
            this.f28666i.setPhoneNumber(C5908a.encryptAES(getApplicationContext(), N(this.f28667j)));
            C6111b.getInstance().insertSMSData(this.f28666i);
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(response.gethMsgTxt()).setButtonListener(new DialogInterface.OnClickListener() { // from class: T5.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f4927a.v0(dialogInterface, i8);
                }
            }).showDialog();
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
    }
}
