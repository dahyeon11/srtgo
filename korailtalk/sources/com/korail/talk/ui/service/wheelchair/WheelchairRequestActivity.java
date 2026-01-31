package com.korail.talk.ui.service.wheelchair;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.korail.talk.data.WheelchairData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.addService.AdditionalServiceDao;
import com.korail.talk.network.dao.addService.AdditionalServiceDao.AdditionalServiceRequest;
import com.korail.talk.network.dao.addService.HelpSrvCustDao;
import com.korail.talk.network.dao.addService.HelpSrvCustDao.HelpSrvCustRequest;
import com.korail.talk.ui.ticket.confirm.TicketSelfCheckinStatusActivity;
import com.korail.talk.view.base.BaseViewActivity;
import g5.e;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C;
import z4.C6630d;
import z4.C6637k;
import z4.N;

/* loaded from: classes.dex */
public class WheelchairRequestActivity extends BaseViewActivity implements RadioGroup.OnCheckedChangeListener, TextWatcher, CompoundButton.OnCheckedChangeListener {

    /* renamed from: i, reason: collision with root package name */
    private WheelchairData f28693i;

    /* renamed from: j, reason: collision with root package name */
    private HelpSrvCustDao.ReqSpec f28694j;

    /* renamed from: k, reason: collision with root package name */
    private RadioGroup f28695k;

    /* renamed from: l, reason: collision with root package name */
    private TextView f28696l;

    /* renamed from: m, reason: collision with root package name */
    private TextView f28697m;

    /* renamed from: n, reason: collision with root package name */
    private TextView f28698n;

    /* renamed from: o, reason: collision with root package name */
    private EditText f28699o;

    /* renamed from: p, reason: collision with root package name */
    private EditText f28700p;

    /* renamed from: q, reason: collision with root package name */
    private CheckBox f28701q;

    /* renamed from: r, reason: collision with root package name */
    private Button f28702r;

    private void s0() {
        this.f28702r.setEnabled(N(this.f28699o).length() > 0 && N(this.f28700p).length() > 0 && this.f28701q.isChecked());
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_wheelchair_request);
        this.f28697m.setText(N.applySpannable(getString(AbstractC5959j.common_private_collection), new UnderlineSpan()));
        N.setBulletSpan(getResources().getStringArray(AbstractC5952c.wheelchair_request_guide), this.f28698n);
    }

    private void t0() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(this.f28694j.getRcpSqno());
        AdditionalServiceDao additionalServiceDao = new AdditionalServiceDao();
        AdditionalServiceDao.AdditionalServiceRequest additionalServiceRequest = additionalServiceDao.new AdditionalServiceRequest();
        additionalServiceRequest.setSaleWctNo(this.f28693i.getWctNo());
        additionalServiceRequest.setSaleDt(this.f28693i.getSaleDt());
        additionalServiceRequest.setSaleSqno(this.f28693i.getSqNo());
        additionalServiceRequest.setJrnySqno("1");
        additionalServiceRequest.setJobDbCd("N");
        additionalServiceRequest.setAddSrvId("0020000001");
        additionalServiceRequest.setReqQnty(1);
        additionalServiceRequest.setHelpSrvTgtCnt(1);
        additionalServiceRequest.setRcpSqno(arrayList);
        additionalServiceDao.setRequest(additionalServiceRequest);
        executeDao(additionalServiceDao);
    }

    private void u0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("002");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.f28695k.getCheckedRadioButtonId() == AbstractC5955f.rb_wheelchair_user2 ? TicketSelfCheckinStatusActivity.CHECKIN_STATUS_NOT_USE : "02");
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(N(this.f28699o));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(N(this.f28700p));
        HelpSrvCustDao helpSrvCustDao = new HelpSrvCustDao();
        HelpSrvCustDao.HelpSrvCustRequest helpSrvCustRequest = helpSrvCustDao.new HelpSrvCustRequest();
        helpSrvCustRequest.setSaleWctNo(this.f28693i.getWctNo());
        helpSrvCustRequest.setSaleDt(this.f28693i.getSaleDt());
        helpSrvCustRequest.setSaleSqno(this.f28693i.getSqNo());
        helpSrvCustRequest.setReqCnt(1);
        helpSrvCustRequest.setReqAddSrvDvCd(arrayList);
        helpSrvCustRequest.setReqAddRcpSrvCd(arrayList2);
        helpSrvCustRequest.setReqCustNm(arrayList3);
        helpSrvCustRequest.setReqCntcChnCont(arrayList4);
        helpSrvCustDao.setRequest(helpSrvCustRequest);
        executeDao(helpSrvCustDao);
    }

    private void v0() {
        this.f28693i = (WheelchairData) getIntent().getSerializableExtra("WHEELCHAIR_DATA");
    }

    private void w0() {
        this.f28695k.setOnCheckedChangeListener(this);
        findViewById(AbstractC5955f.btn_wheelchair_request_history).setOnClickListener(this);
        this.f28697m.setOnClickListener(this);
        this.f28699o.addTextChangedListener(this);
        this.f28700p.addTextChangedListener(this);
        this.f28701q.setOnCheckedChangeListener(this);
        this.f28702r.setOnClickListener(this);
    }

    private void x0() {
        l0();
        this.f28695k = (RadioGroup) findViewById(AbstractC5955f.rg_wheelchair_request);
        this.f28696l = (TextView) findViewById(AbstractC5955f.tv_wheelchair_request_name_label);
        this.f28697m = (TextView) findViewById(AbstractC5955f.tv_wheelchair_request_agree);
        this.f28699o = (EditText) findViewById(AbstractC5955f.et_wheelchair_request_name);
        this.f28700p = (EditText) findViewById(AbstractC5955f.et_wheelchair_request_phone_number);
        this.f28701q = (CheckBox) findViewById(AbstractC5955f.cb_wheelchair_request_agree);
        this.f28698n = (TextView) findViewById(AbstractC5955f.tv_wheelchair_request_guide);
        this.f28702r = (Button) findViewById(AbstractC5955f.btn_wheelchair_request);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        s0();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (-1 == i9 && 124 == i8) {
            HelpSrvCustDao.ReqSpec reqSpec = (HelpSrvCustDao.ReqSpec) intent.getSerializableExtra("REQSPEC_DATA");
            this.f28694j = reqSpec;
            int i10 = TicketSelfCheckinStatusActivity.CHECKIN_STATUS_NOT_USE.equals(reqSpec.getAddRcpSrvCd()) ? AbstractC5955f.rb_wheelchair_user2 : AbstractC5955f.rb_wheelchair_request_companion;
            for (int i11 = 0; i11 < this.f28695k.getChildCount(); i11++) {
                RadioButton radioButton = (RadioButton) this.f28695k.getChildAt(i11);
                if (radioButton.getId() == i10) {
                    radioButton.setChecked(true);
                }
                radioButton.setEnabled(false);
            }
            String str = "";
            for (String str2 : this.f28694j.getCustTeln().split(e.STATE_NAME_NONE)) {
                str = str + str2;
            }
            this.f28699o.setText(this.f28694j.getCustNm());
            this.f28699o.setEnabled(false);
            this.f28700p.setText(str);
            this.f28700p.setEnabled(false);
        }
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i8) {
        if (AbstractC5955f.rb_wheelchair_user2 == i8) {
            this.f28696l.setText(AbstractC5959j.common_user_name2);
        } else {
            this.f28696l.setText(AbstractC5959j.common_companion_name);
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.btn_wheelchair_request_history == id) {
            startActivityForResult(new Intent(getApplicationContext(), (Class<?>) WheelchairHistoryActivity.class), 124);
            return;
        }
        if (AbstractC5955f.tv_wheelchair_request_agree == id) {
            C6637k.getPDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_payment_private_collection_title)).setStringArray(getResources().getStringArray(AbstractC5952c.private_collection_wheelchair)).showDialog();
            return;
        }
        if (AbstractC5955f.btn_wheelchair_request != id) {
            super.onClick(view);
            return;
        }
        if (!C6630d.isNull(this.f28694j)) {
            t0();
            return;
        }
        if (!C.isInvalidName(N(this.f28699o))) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.nonmember_check_name_message2)).showDialog();
        } else if (N.isNull(C.makePhoneNumber(N(this.f28700p)))) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.nonmember_check_phone_number)).showDialog();
        } else {
            u0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_wheelchair_request);
        if (C6630d.isNull(bundle)) {
            v0();
            x0();
            setText();
            w0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_help_srv_cust == id || AbstractC5955f.dao_additional_service == id) {
            Intent intent = new Intent(getApplicationContext(), (Class<?>) WheelchairConfirmActivity.class);
            intent.putExtra("WHEELCHAIR_DATA", this.f28693i);
            startActivity(intent);
            setResult(-1);
            finish();
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
        s0();
    }
}
