package com.korail.talk.ui.mileage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.mileage.AcpnMlgNotiDao;
import com.korail.talk.network.dao.mileage.AcpnMlgNotiDao.AcpnMlgNotiRequest;
import com.korail.talk.network.dao.mileage.AcpnMlgSpecDao;
import com.korail.talk.view.CTextView;
import com.korail.talk.view.base.BaseViewActivity;
import g5.e;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.C6634h;
import z4.C6637k;
import z4.N;

/* loaded from: classes.dex */
public class CompanionMileageInformActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private AcpnMlgSpecDao.Ticket f28440i;

    /* renamed from: j, reason: collision with root package name */
    private EditText f28441j;

    /* renamed from: k, reason: collision with root package name */
    private Button f28442k;

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            CompanionMileageInformActivity.this.f28442k.setEnabled(editable.length() > 0);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }

    private void A0() {
        n0(false);
        this.f28441j = (EditText) findViewById(AbstractC5955f.et_companion_phone);
        this.f28441j.setFilters(new InputFilter[]{new InputFilter.LengthFilter(11)});
        this.f28441j.setInputType(2);
        Button button = (Button) findViewById(AbstractC5955f.btn_companion_mileage_inform_confirm);
        this.f28442k = button;
        button.setEnabled(false);
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_accumulating_ktx_mileage_inform);
        ((CTextView) findViewById(AbstractC5955f.tv_mileage_reservation_name)).setText(this.f28440i.getRsvPsNm());
        ((CTextView) findViewById(AbstractC5955f.tv_mileage_reservation_phone)).setText(this.f28440i.getRsvPsHndyTeln());
        ((CTextView) findViewById(AbstractC5955f.tv_mileage_reservation_ticket_number)).setText(this.f28440i.getSaleWctNo() + e.STATE_NAME_NONE + String.format(C6634h.convertFormat(this.f28440i.getSaleDt(), "yyyyMMdd", "MMdd"), new Object[0]) + e.STATE_NAME_NONE + N.getInteger(this.f28440i.getSaleSqno()) + e.STATE_NAME_NONE + this.f28440i.getTkRetPwd());
    }

    private void v0() {
        AcpnMlgNotiDao acpnMlgNotiDao = new AcpnMlgNotiDao();
        AcpnMlgNotiDao.AcpnMlgNotiRequest acpnMlgNotiRequest = acpnMlgNotiDao.new AcpnMlgNotiRequest();
        acpnMlgNotiRequest.setSaleWctNo(this.f28440i.getSaleWctNo());
        acpnMlgNotiRequest.setSaleDt(this.f28440i.getSaleDt());
        acpnMlgNotiRequest.setSaleSqno(this.f28440i.getSaleSqno());
        acpnMlgNotiRequest.setRetPwd(this.f28440i.getTkRetPwd());
        acpnMlgNotiRequest.setRcvPsHndyTeln(this.f28441j.getText().toString());
        acpnMlgNotiDao.setRequest(acpnMlgNotiRequest);
        executeDao(acpnMlgNotiDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w0(DialogInterface dialogInterface, int i8) {
        setResult(-1);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x0(View view) {
        v0();
    }

    private void y0() {
        this.f28440i = (AcpnMlgSpecDao.Ticket) getIntent().getSerializableExtra("COMPANION_MILEAGE_DATA");
    }

    private void z0() {
        this.f28441j.addTextChangedListener(new a());
        this.f28442k.setOnClickListener(new View.OnClickListener() { // from class: B5.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f341a.x0(view);
            }
        });
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_companion_mileage_inform);
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
        if (AbstractC5955f.dao_acpn_mlg_noti == iBaseDao.getId()) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(iBaseDao.getResponse().gethMsgTxt()).setButtonListener(new DialogInterface.OnClickListener() { // from class: B5.c
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f342a.w0(dialogInterface, i8);
                }
            }).showDialog();
        }
    }
}
