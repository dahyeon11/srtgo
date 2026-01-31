package com.korail.talk.ui.mileage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.login.MemberCertDao;
import com.korail.talk.network.dao.login.MemberCertDao.MemberCertRequest;
import com.korail.talk.network.dao.mileage.AcpnMlgSaveDao;
import com.korail.talk.network.dao.mileage.AcpnMlgSaveDao.AcpnMlgSaveRequest;
import com.korail.talk.network.dao.pay.StbkAcntDao;
import com.korail.talk.view.CTextView;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import x4.C6491a;
import y4.C6536a;
import z4.C;
import z4.C6630d;
import z4.C6637k;
import z4.N;
import z4.P;

/* loaded from: classes.dex */
public class AccumulatingKTXMileageActivity extends BaseViewActivity implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: i */
    private String f28419i;

    /* renamed from: j */
    private RadioGroup f28420j;

    /* renamed from: k */
    private EditText f28421k;

    /* renamed from: l */
    private EditText f28422l;

    /* renamed from: m */
    private EditText f28423m;

    /* renamed from: n */
    private EditText f28424n;

    /* renamed from: o */
    private EditText f28425o;

    /* renamed from: p */
    private EditText f28426p;

    /* renamed from: q */
    private Button f28427q;

    /* renamed from: r */
    private TabLayout f28428r;

    /* renamed from: s */
    private CTextView f28429s;

    /* renamed from: t */
    private boolean f28430t = true;

    class a implements TabLayout.d {
        a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.d, com.google.android.material.tabs.TabLayout.c
        public void onTabReselected(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.d, com.google.android.material.tabs.TabLayout.c
        public void onTabSelected(TabLayout.g gVar) {
            AccumulatingKTXMileageActivity.this.B0(gVar.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.d, com.google.android.material.tabs.TabLayout.c
        public void onTabUnselected(TabLayout.g gVar) {
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccumulatingKTXMileageActivity.this.f28429s.setSelected(!AccumulatingKTXMileageActivity.this.f28429s.isSelected());
            if (AccumulatingKTXMileageActivity.this.f28429s.isSelected()) {
                AccumulatingKTXMileageActivity.this.findViewById(AbstractC5955f.tv_accumulating_ktx_mileage_message).setVisibility(0);
            } else {
                AccumulatingKTXMileageActivity.this.findViewById(AbstractC5955f.tv_accumulating_ktx_mileage_message).setVisibility(8);
            }
        }
    }

    private void A0() {
        n0(false);
        this.f28420j = (RadioGroup) findViewById(AbstractC5955f.rg_accumulating_ktx_mileage_check);
        TabLayout tabLayout = (TabLayout) findViewById(AbstractC5955f.tabLayout);
        this.f28428r = tabLayout;
        tabLayout.addTab(tabLayout.newTab().setText(getString(AbstractC5959j.companion_mileage_tab_direct)));
        TabLayout tabLayout2 = this.f28428r;
        tabLayout2.addTab(tabLayout2.newTab().setText(getString(AbstractC5959j.companion_mileage_tab_instead)));
        this.f28428r.getTabAt(0).select();
        B0(0);
        this.f28428r.addOnTabSelectedListener((TabLayout.d) new a());
        this.f28421k = (EditText) findViewById(AbstractC5955f.et_accumulating_ktx_mileage_reservation_name);
        this.f28422l = (EditText) findViewById(AbstractC5955f.et_accumulating_ktx_mileage_certification_no);
        this.f28423m = (EditText) findViewById(AbstractC5955f.et_delay_account_refund_ticket_wct_no);
        this.f28424n = (EditText) findViewById(AbstractC5955f.et_delay_account_refund_ticket_db);
        this.f28425o = (EditText) findViewById(AbstractC5955f.et_delay_account_refund_ticket_sq_no);
        this.f28426p = (EditText) findViewById(AbstractC5955f.et_delay_account_refund_ticket_pw);
        this.f28429s = (CTextView) findViewById(AbstractC5955f.txt_precautions_msg);
        this.f28422l.setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
        this.f28422l.setInputType(2);
        Button button = (Button) findViewById(AbstractC5955f.btn_accumulating_ktx_mileage_confirm);
        this.f28427q = button;
        button.setEnabled(false);
    }

    public void B0(int i8) {
        if (i8 == 0) {
            this.f28430t = true;
            ((CTextView) findViewById(AbstractC5955f.txt_name)).setText(getString(AbstractC5959j.companion_mileage_direct_name));
            ((CTextView) findViewById(AbstractC5955f.txt_name_select)).setText(getString(AbstractC5959j.companion_mileage_direct_desc));
            ((CTextView) findViewById(AbstractC5955f.txt_name_desc)).setText(getString(AbstractC5959j.accumulating_ktx_mileage_message));
            N.setBulletSpan(getResources().getStringArray(AbstractC5952c.accumulating_ktx_mileage_message), (TextView) findViewById(AbstractC5955f.tv_accumulating_ktx_mileage_message));
            ((CTextView) findViewById(AbstractC5955f.tv_accumulating_ktx_mileage_message)).append(getString(AbstractC5959j.accumulating_ktx_mileage_message_detail));
            return;
        }
        this.f28430t = false;
        ((CTextView) findViewById(AbstractC5955f.txt_name)).setText(getString(AbstractC5959j.companion_mileage_instead_name));
        ((CTextView) findViewById(AbstractC5955f.txt_name_select)).setText(getString(AbstractC5959j.companion_mileage_instead_desc));
        ((CTextView) findViewById(AbstractC5955f.txt_name_desc)).setText(getString(AbstractC5959j.accumulating_ktx_mileage_message_instead));
        N.setBulletSpan(getResources().getStringArray(AbstractC5952c.accumulating_ktx_mileage_message_instead), (TextView) findViewById(AbstractC5955f.tv_accumulating_ktx_mileage_message));
        ((CTextView) findViewById(AbstractC5955f.tv_accumulating_ktx_mileage_message)).append(getString(AbstractC5959j.accumulating_ktx_mileage_message_detail));
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_accumulating_ktx_mileage);
        N.setBulletSpan(getResources().getStringArray(AbstractC5952c.accumulating_ktx_mileage_message), (TextView) findViewById(AbstractC5955f.tv_accumulating_ktx_mileage_message));
        ((CTextView) findViewById(AbstractC5955f.tv_accumulating_ktx_mileage_message)).append(getString(AbstractC5959j.accumulating_ktx_mileage_message_detail));
    }

    private void v0() {
        AcpnMlgSaveDao acpnMlgSaveDao = new AcpnMlgSaveDao();
        AcpnMlgSaveDao.AcpnMlgSaveRequest acpnMlgSaveRequest = acpnMlgSaveDao.new AcpnMlgSaveRequest();
        if (this.f28430t) {
            acpnMlgSaveRequest.setRsvMbCrdNo(this.f28419i);
            acpnMlgSaveRequest.setCustNm(N(this.f28421k));
        }
        if (!this.f28430t) {
            acpnMlgSaveRequest.setMlgAcmMbCrdNo(this.f28419i);
        }
        acpnMlgSaveRequest.setSaleWctNo(N(this.f28423m));
        acpnMlgSaveRequest.setSaleDd(N(this.f28424n));
        acpnMlgSaveRequest.setSaleSqno(N(this.f28425o));
        acpnMlgSaveRequest.setTkRetPwd(N(this.f28426p));
        acpnMlgSaveDao.setRequest(acpnMlgSaveRequest);
        executeDao(acpnMlgSaveDao);
    }

    private void w0(String str, String str2, int i8) {
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

    public /* synthetic */ void x0(DialogInterface dialogInterface, int i8) {
        finish();
    }

    private void y0() {
    }

    private void z0() {
        this.f28420j.setOnCheckedChangeListener(this);
        this.f28423m.addTextChangedListener(new C6491a(5, this.f28424n));
        this.f28424n.addTextChangedListener(new C6491a(4, this.f28425o));
        this.f28425o.addTextChangedListener(new C6491a(5, this.f28426p));
        this.f28425o.addTextChangedListener(new C6491a(2, null));
        findViewById(AbstractC5955f.btn_accumulating_ktx_mileage_request).setOnClickListener(this);
        this.f28427q.setOnClickListener(this);
        this.f28429s.setOnClickListener(new b());
        this.f28429s.setSelected(true);
        findViewById(AbstractC5955f.tv_accumulating_ktx_mileage_message).setVisibility(0);
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i8) {
        if (AbstractC5955f.rb_accumulating_ktx_mileage_member == i8) {
            this.f28422l.setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
            this.f28422l.setInputType(2);
            this.f28422l.requestFocus();
            P.showIME(getApplicationContext());
            return;
        }
        if (AbstractC5955f.rb_accumulating_ktx_mileage_phone == i8) {
            this.f28422l.setFilters(new InputFilter[]{new InputFilter.LengthFilter(11)});
            this.f28422l.setInputType(2);
            this.f28422l.requestFocus();
            P.showIME(getApplicationContext());
            return;
        }
        if (AbstractC5955f.rb_accumulating_ktx_mileage_mail == i8) {
            this.f28422l.setFilters(new InputFilter[]{new InputFilter.LengthFilter(30)});
            this.f28422l.setInputType(32);
            this.f28422l.requestFocus();
            P.showIME(getApplicationContext());
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.btn_accumulating_ktx_mileage_request != id) {
            if (AbstractC5955f.btn_accumulating_ktx_mileage_confirm != id) {
                super.onClick(view);
                return;
            }
            string = ((N(this.f28423m).length() + N(this.f28424n).length()) + N(this.f28425o).length()) + N(this.f28426p).length() < 16 ? getString(AbstractC5959j.accumulating_ktx_mileage_request_return_no) : null;
            if (N.isNull(string)) {
                v0();
                return;
            } else {
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(string).showDialog();
                return;
            }
        }
        String strN = N(this.f28421k);
        String strN2 = N(this.f28422l);
        int checkedRadioButtonId = this.f28420j.getCheckedRadioButtonId();
        if (strN.isEmpty()) {
            string = this.f28430t ? getString(AbstractC5959j.accumulating_ktx_mileage_request_reservation_name) : getString(AbstractC5959j.accumulating_ktx_mileage_request_reservation_name_instead);
        } else if (!C.isInvalidName(strN)) {
            string = getString(AbstractC5959j.nonmember_check_name_message2);
        } else if (N.isNull(strN2)) {
            string = AbstractC5955f.rb_accumulating_ktx_mileage_member == checkedRadioButtonId ? getString(AbstractC5959j.ticket_delivery_input_member_number_warning) : AbstractC5955f.rb_accumulating_ktx_mileage_phone == checkedRadioButtonId ? getString(AbstractC5959j.ticket_delivery_input_cellphone_number_warning) : getString(AbstractC5959j.ticket_delivery_input_email_warning);
        }
        if (N.isNull(string)) {
            w0(strN, strN2, checkedRadioButtonId);
        } else {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(string).showDialog();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_accumulating_ktx_mileage);
        if (C6630d.isNull(bundle)) {
            y0();
            A0();
            setText();
            z0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_cert_member == id) {
            this.f28419i = ((MemberCertDao.MemberCertResponse) iBaseDao.getResponse()).getMbCrdNo();
            this.f28427q.setEnabled(true);
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.ticket_delivery_input_verified)).showDialog();
        } else if (AbstractC5955f.dao_acpn_mlg_save_key == id) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(iBaseDao.getResponse().gethMsgTxt()).setButtonListener(new DialogInterface.OnClickListener() { // from class: B5.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f340a.x0(dialogInterface, i8);
                }
            }).showDialog();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        super.onReceiveError(iBaseDao, c6536a);
        if (AbstractC5955f.dao_cert_member == iBaseDao.getId()) {
            this.f28419i = null;
            this.f28427q.setEnabled(false);
        }
    }
}
