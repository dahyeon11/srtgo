package d5;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import c5.d;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.login.MemberCertDao;
import com.korail.talk.network.dao.login.MemberCertDao.MemberCertRequest;
import com.korail.talk.network.dao.ticket.DlvRcvCustDao;
import com.korail.talk.network.dao.ticket.RecentDeliveryHistoryDao;
import k0.AbstractC5837a;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import y4.C6536a;
import z4.C6630d;
import z4.C6637k;
import z4.N;

/* renamed from: d5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ViewOnClickListenerC5325a extends d implements View.OnClickListener, TextWatcher {
    public static final String TAG = "DeliveryKTMFragment";

    /* renamed from: e0, reason: collision with root package name */
    private String f30041e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f30042f0 = false;

    /* renamed from: g0, reason: collision with root package name */
    private EditText f30043g0;

    /* renamed from: h0, reason: collision with root package name */
    private EditText f30044h0;

    /* renamed from: i0, reason: collision with root package name */
    private EditText f30045i0;

    /* renamed from: j0, reason: collision with root package name */
    private RadioGroup f30046j0;

    private void H0(String str, String str2, int i8) {
        MemberCertDao memberCertDao = new MemberCertDao();
        MemberCertDao.MemberCertRequest memberCertRequest = memberCertDao.new MemberCertRequest();
        memberCertRequest.setTxtAcptPsNm(str);
        if (AbstractC5955f.rb_delivery_kt_m_m == i8) {
            memberCertRequest.setAcept("1");
            memberCertRequest.setMemNum(str2);
        } else if (AbstractC5955f.rb_delivery_kt_m_h == i8) {
            memberCertRequest.setAcept("3");
            memberCertRequest.setTxtCpNo(str2);
        } else if (AbstractC5955f.rb_delivery_kt_m_e == i8) {
            memberCertRequest.setAcept("2");
            memberCertRequest.setTxtEmailNo(str2);
        }
        memberCertDao.setRequest(memberCertRequest);
        executeDao(memberCertDao);
    }

    private void I0() {
        p0(AbstractC5955f.btn_delivery_kt_m_verification_request).setOnClickListener(this);
        p0(AbstractC5955f.btn_delivery_kt_m_delivery).setOnClickListener(this);
        this.f30043g0.addTextChangedListener(this);
        this.f30044h0.addTextChangedListener(this);
    }

    private void J0() {
        N.setBulletSpan(r0(AbstractC5952c.delivery_korail_talk_notice), (TextView) p0(AbstractC5955f.tv_delivery_kt_m_notice));
    }

    private void K0() {
        this.f30043g0 = (EditText) p0(AbstractC5955f.et_delivery_kt_m_nm);
        this.f30044h0 = (EditText) p0(AbstractC5955f.et_delivery_kt_m_verification_no);
        this.f30045i0 = (EditText) p0(AbstractC5955f.et_delivery_kt_m_hp_no);
        this.f30046j0 = (RadioGroup) p0(AbstractC5955f.rg_delivery_kt_m);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void L0() {
        /*
            r6 = this;
            android.widget.EditText r0 = r6.f30043g0
            java.lang.String r0 = r6.s0(r0)
            android.widget.EditText r1 = r6.f30044h0
            java.lang.String r1 = r6.s0(r1)
            android.widget.RadioGroup r2 = r6.f30046j0
            int r2 = r2.getCheckedRadioButtonId()
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L21
            int r3 = n4.AbstractC5959j.ticket_delivery_input_name_warning
            java.lang.String r3 = r6.getString(r3)
            android.widget.EditText r4 = r6.f30043g0
            goto L5f
        L21:
            boolean r3 = z4.C.isInvalidName(r0)
            if (r3 != 0) goto L30
            int r3 = n4.AbstractC5959j.nonmember_check_name_message2
            java.lang.String r3 = r6.getString(r3)
            android.widget.EditText r4 = r6.f30043g0
            goto L5f
        L30:
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L5d
            int r3 = n4.AbstractC5955f.rb_delivery_kt_m_m
            if (r3 != r2) goto L43
            int r3 = n4.AbstractC5959j.ticket_delivery_input_member_number_warning
            java.lang.String r3 = r6.getString(r3)
            android.widget.EditText r4 = r6.f30044h0
            goto L5f
        L43:
            int r3 = n4.AbstractC5955f.rb_delivery_kt_m_h
            if (r3 != r2) goto L50
            int r3 = n4.AbstractC5959j.ticket_delivery_input_cellphone_number_warning
            java.lang.String r3 = r6.getString(r3)
            android.widget.EditText r4 = r6.f30044h0
            goto L5f
        L50:
            int r3 = n4.AbstractC5955f.rb_delivery_kt_m_e
            if (r3 != r2) goto L5d
            int r3 = n4.AbstractC5959j.ticket_delivery_input_email_warning
            java.lang.String r3 = r6.getString(r3)
            android.widget.EditText r4 = r6.f30044h0
            goto L5f
        L5d:
            r3 = 0
            r4 = r3
        L5f:
            boolean r5 = z4.N.isNull(r3)
            if (r5 == 0) goto L69
            r6.H0(r0, r1, r2)
            goto L88
        L69:
            android.content.Context r0 = r6.getContext()
            int r1 = n4.AbstractC5959j.dialog_title
            java.lang.String r1 = r6.getString(r1)
            r2 = 1001(0x3e9, float:1.403E-42)
            r5 = 0
            s4.c r0 = z4.C6637k.getCDialog(r0, r2, r5, r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            s4.c r0 = r0.setContent(r1)
            r0.showDialog()
            r4.requestFocus()
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.ViewOnClickListenerC5325a.L0():void");
    }

    public static Fragment newInstance() {
        return new ViewOnClickListenerC5325a();
    }

    @Override // c5.d
    protected void D0(RecentDeliveryHistoryDao.Acep acep) {
        this.f30043g0.setText(acep.getAcepCustNm());
        this.f30045i0.setText(acep.getAcepCustTeln());
        this.f30046j0.check(AbstractC5955f.rb_delivery_kt_m_m);
        this.f30044h0.setText(acep.getMbCrdNo());
        this.f30041e0 = acep.getAcepCustMgNo();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.f30041e0 = null;
    }

    @Override // c5.d, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            K0();
            J0();
            I0();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.btn_delivery_kt_m_verification_request == id) {
            L0();
        } else if (AbstractC5955f.btn_delivery_kt_m_delivery == id) {
            F0(this.f30043g0, this.f30045i0, this.f30041e0, this.f30042f0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.fragment_delivery_kt_m, viewGroup, false);
    }

    @Override // com.korail.talk.view.base.a, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_cert_member == iBaseDao.getId()) {
            MemberCertDao.MemberCertRequest memberCertRequest = (MemberCertDao.MemberCertRequest) iBaseDao.getRequest();
            this.f30041e0 = ((MemberCertDao.MemberCertResponse) iBaseDao.getResponse()).getStrCustNo();
            C6637k.getCDialog(getActivity(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.ticket_delivery_input_verified)).showDialog();
            if ("3".equals(memberCertRequest.getAcept())) {
                this.f30045i0.setText(memberCertRequest.getTxtCpNo());
            }
        }
    }

    @Override // com.korail.talk.view.base.a, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        super.onReceiveError(iBaseDao, c6536a);
        if (AbstractC5955f.dao_cert_member == iBaseDao.getId()) {
            this.f30041e0 = null;
        }
    }

    public void setNcardUserData(DlvRcvCustDao.DlvRcvCustwResponse dlvRcvCustwResponse) {
        this.f30042f0 = true;
        String acepCustMgNo = dlvRcvCustwResponse.getAcepCustMgNo();
        String acepCustTeln = dlvRcvCustwResponse.getAcepCustTeln();
        String acepCustNm = dlvRcvCustwResponse.getAcepCustNm();
        String mbCrdNo = dlvRcvCustwResponse.getMbCrdNo();
        this.f30043g0.setText(acepCustNm);
        this.f30044h0.setText(mbCrdNo);
        this.f30045i0.setText(acepCustTeln);
        this.f30041e0 = acepCustMgNo;
        p0(AbstractC5955f.btn_delivery_kt_m_verification_request).setEnabled(false);
        p0(AbstractC5955f.rb_delivery_kt_m_h).setEnabled(false);
        p0(AbstractC5955f.rb_delivery_kt_m_e).setEnabled(false);
        this.f30043g0.setEnabled(false);
        this.f30044h0.setEnabled(false);
        this.f30045i0.setEnabled(false);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
    }
}
