package com.korail.talk.ui.mileage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.login.MemberCertDao;
import com.korail.talk.network.dao.login.MemberCertDao.MemberCertRequest;
import com.korail.talk.network.dao.mileage.AcpnMlgSaveDao;
import com.korail.talk.network.dao.mileage.AcpnMlgSaveDao.AcpnMlgSaveRequest;
import com.korail.talk.network.dao.mileage.AcpnMlgSpecDao;
import com.korail.talk.network.dao.pay.StbkAcntDao;
import com.korail.talk.view.CTextView;
import com.korail.talk.view.base.BaseViewActivity;
import g5.e;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import y4.C6536a;
import z4.C;
import z4.C6630d;
import z4.C6634h;
import z4.C6637k;
import z4.N;
import z4.P;

/* loaded from: classes.dex */
public class CompanionMileageRequestActivity extends BaseViewActivity implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: i, reason: collision with root package name */
    private String f28444i;

    /* renamed from: j, reason: collision with root package name */
    private AcpnMlgSpecDao.Ticket f28445j;

    /* renamed from: k, reason: collision with root package name */
    private RadioGroup f28446k;

    /* renamed from: l, reason: collision with root package name */
    private EditText f28447l;

    /* renamed from: m, reason: collision with root package name */
    private EditText f28448m;

    /* renamed from: n, reason: collision with root package name */
    private Button f28449n;

    private void setText() {
        setAppTitle(AbstractC5959j.title_accumulating_ktx_mileage);
        ((CTextView) findViewById(AbstractC5955f.tv_mileage_reservation_name)).setText(this.f28445j.getRsvPsNm());
        ((CTextView) findViewById(AbstractC5955f.tv_mileage_reservation_phone)).setText(this.f28445j.getRsvPsHndyTeln());
        ((CTextView) findViewById(AbstractC5955f.tv_mileage_reservation_ticket_number)).setText(this.f28445j.getSaleWctNo() + e.STATE_NAME_NONE + String.format(C6634h.convertFormat(this.f28445j.getSaleDt(), "yyyyMMdd", "MMdd"), new Object[0]) + e.STATE_NAME_NONE + N.getInteger(this.f28445j.getSaleSqno()) + e.STATE_NAME_NONE + this.f28445j.getTkRetPwd());
        N.setBulletSpan(getResources().getStringArray(AbstractC5952c.accumulating_ktx_mileage_message), (TextView) findViewById(AbstractC5955f.tv_companion_mileage_request_message));
    }

    private void t0() {
        AcpnMlgSaveDao acpnMlgSaveDao = new AcpnMlgSaveDao();
        AcpnMlgSaveDao.AcpnMlgSaveRequest acpnMlgSaveRequest = acpnMlgSaveDao.new AcpnMlgSaveRequest();
        acpnMlgSaveRequest.setRsvMbCrdNo(this.f28445j.getMbCrdNo());
        acpnMlgSaveRequest.setCustNm(N(this.f28447l));
        acpnMlgSaveRequest.setMlgAcmMbCrdNo(this.f28444i);
        acpnMlgSaveRequest.setSaleWctNo(this.f28445j.getSaleWctNo());
        acpnMlgSaveRequest.setSaleDd(String.format(C6634h.convertFormat(this.f28445j.getSaleDt(), "yyyyMMdd", "MMdd"), new Object[0]));
        acpnMlgSaveRequest.setSaleSqno(this.f28445j.getSaleSqno());
        acpnMlgSaveRequest.setTkRetPwd(this.f28445j.getTkRetPwd());
        acpnMlgSaveDao.setRequest(acpnMlgSaveRequest);
        executeDao(acpnMlgSaveDao);
    }

    private void u0(String str, String str2, int i8) {
        MemberCertDao memberCertDao = new MemberCertDao();
        MemberCertDao.MemberCertRequest memberCertRequest = memberCertDao.new MemberCertRequest();
        memberCertRequest.setTxtAcptPsNm(str);
        if (AbstractC5955f.rb_accumulating_ktx_mileage_member == i8) {
            memberCertRequest.setAcept(StbkAcntDao.ACCOUNT_REGISTER);
            memberCertRequest.setMemNum(str2);
        } else if (AbstractC5955f.rb_accumulating_ktx_mileage_phone == i8) {
            memberCertRequest.setAcept("6");
            memberCertRequest.setTxtCpNo(str2);
        } else {
            memberCertRequest.setAcept(StbkAcntDao.CHANGE_PASSWORD);
            memberCertRequest.setTxtEmailNo(str2);
        }
        memberCertDao.setRequest(memberCertRequest);
        executeDao(memberCertDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0(DialogInterface dialogInterface, int i8) {
        setResult(-1);
        finish();
    }

    private void w0() {
        this.f28445j = (AcpnMlgSpecDao.Ticket) getIntent().getSerializableExtra("COMPANION_MILEAGE_DATA");
    }

    private void x0() {
        this.f28446k.setOnCheckedChangeListener(this);
        findViewById(AbstractC5955f.btn_companion_ktx_mileage_inquiry).setOnClickListener(this);
        this.f28449n.setOnClickListener(this);
    }

    private void y0() {
        n0(false);
        this.f28446k = (RadioGroup) findViewById(AbstractC5955f.rg_companion_mileage_request);
        this.f28447l = (EditText) findViewById(AbstractC5955f.et_companion_name);
        this.f28448m = (EditText) findViewById(AbstractC5955f.et_companion_certification_no);
        this.f28448m.setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
        this.f28448m.setInputType(2);
        findViewById(AbstractC5955f.btn_companion_ktx_mileage_inquiry).setOnClickListener(this);
        Button button = (Button) findViewById(AbstractC5955f.btn_accumulating_ktx_mileage_confirm);
        this.f28449n = button;
        button.setEnabled(false);
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i8) {
        if (AbstractC5955f.rb_accumulating_ktx_mileage_member == i8) {
            this.f28448m.setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
            this.f28448m.setInputType(2);
            this.f28448m.requestFocus();
            P.showIME(getApplicationContext());
            return;
        }
        if (AbstractC5955f.rb_accumulating_ktx_mileage_phone == i8) {
            this.f28448m.setFilters(new InputFilter[]{new InputFilter.LengthFilter(11)});
            this.f28448m.setInputType(2);
            this.f28448m.requestFocus();
            P.showIME(getApplicationContext());
            return;
        }
        if (AbstractC5955f.rb_accumulating_ktx_mileage_mail == i8) {
            this.f28448m.setFilters(new InputFilter[]{new InputFilter.LengthFilter(30)});
            this.f28448m.setInputType(32);
            this.f28448m.requestFocus();
            P.showIME(getApplicationContext());
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        String string = null;
        if (AbstractC5955f.btn_companion_ktx_mileage_inquiry != id) {
            if (AbstractC5955f.btn_accumulating_ktx_mileage_confirm != id) {
                super.onClick(view);
                return;
            } else if (N.isNull(null)) {
                t0();
                return;
            } else {
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(null).showDialog();
                return;
            }
        }
        String strN = N(this.f28447l);
        String strN2 = N(this.f28448m);
        int checkedRadioButtonId = this.f28446k.getCheckedRadioButtonId();
        if (strN.isEmpty()) {
            string = getString(AbstractC5959j.accumulating_ktx_mileage_request_reservation_name);
        } else if (!C.isInvalidName(strN)) {
            string = getString(AbstractC5959j.nonmember_check_name_message2);
        } else if (N.isNull(strN2)) {
            string = AbstractC5955f.rb_accumulating_ktx_mileage_member == checkedRadioButtonId ? getString(AbstractC5959j.ticket_delivery_input_member_number_warning) : AbstractC5955f.rb_accumulating_ktx_mileage_phone == checkedRadioButtonId ? getString(AbstractC5959j.ticket_delivery_input_cellphone_number_warning) : getString(AbstractC5959j.ticket_delivery_input_email_warning);
        }
        if (N.isNull(string)) {
            u0(strN, strN2, checkedRadioButtonId);
        } else {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(string).showDialog();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_companion_mileage_request);
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
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_cert_member == id) {
            this.f28444i = ((MemberCertDao.MemberCertResponse) iBaseDao.getResponse()).getMbCrdNo();
            this.f28449n.setEnabled(true);
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.ticket_delivery_input_verified)).showDialog();
        } else if (AbstractC5955f.dao_acpn_mlg_save_key == id) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(iBaseDao.getResponse().gethMsgTxt()).setButtonListener(new DialogInterface.OnClickListener() { // from class: B5.d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f343a.v0(dialogInterface, i8);
                }
            }).showDialog();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        super.onReceiveError(iBaseDao, c6536a);
        if (AbstractC5955f.dao_cert_member == iBaseDao.getId()) {
            this.f28444i = null;
            this.f28449n.setEnabled(false);
        }
    }
}
