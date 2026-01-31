package com.korail.talk.ui.certification;

import I4.h;
import Q7.X;
import Z4.b;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.korail.talk.data.DisabilityReservationData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.certification.ApplyDisabilityCertificationDao;
import com.korail.talk.network.dao.certification.ApplyDisabilityCertificationDao.ApplyDisabilityCertificationDaoRequest;
import com.korail.talk.network.dao.certification.DisabledCertificationDao;
import com.korail.talk.network.dao.certification.DisabledCertificationDao.DisabledCertificationRequest;
import com.korail.talk.network.response.certification.ReservationResponse;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import y4.C6536a;
import y6.ViewOnClickListenerC6546f;
import z4.C6630d;
import z4.C6634h;
import z4.C6637k;
import z4.H;
import z4.N;
import z4.q;

/* loaded from: classes.dex */
public class DisabilityCertificationActivity extends BaseViewActivity implements b {
    public static final String BIRTH_DAY = "BIRTH_DAY";
    public static final String CERTIFICATION_MESSAGE = "CERTIFICATION_MESSAGE";
    public static final String CERTIFICATION_STEP = "CERTIFICATION_STEP";
    public static final String DISABILITY_CERTIFICATION_CODE = "DISABILITY_CERTIFICATION_CODE";
    public static final String PASSENGER_POSITION = "PASSENGER_POSITION";
    public static final String RESIDENT_REGISTRATION_NUMBER = "RESIDENT_REGISTRATION_NUMBER";
    public static final String SQ_NO = "SQ_NO";
    public static final String SUITABILITY_RATING_CODE = "SUITABILITY_RATING_CODE";

    /* renamed from: i, reason: collision with root package name */
    private DisabilityReservationData f27929i;

    /* renamed from: j, reason: collision with root package name */
    private List f27930j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f27931k;

    /* renamed from: l, reason: collision with root package name */
    private TextView f27932l;

    /* renamed from: m, reason: collision with root package name */
    private Button f27933m;

    /* renamed from: n, reason: collision with root package name */
    private NestedScrollView f27934n;

    public enum a {
        NONE,
        DISABILITY_CERTIFICATION_SUCCESS,
        DISABILITY_CERTIFICATION_FAIL
    }

    private void A0() {
        n0(false);
        this.f27931k = (TextView) findViewById(AbstractC5955f.tv_disability_certification);
        this.f27932l = (TextView) findViewById(AbstractC5955f.tv_disability_message);
        Button button = (Button) findViewById(AbstractC5955f.btn_disability_certification_confirm);
        this.f27933m = button;
        button.setEnabled(false);
        this.f27934n = (NestedScrollView) findViewById(AbstractC5955f.ss_disability_certification);
        LinearLayout linearLayout = (LinearLayout) findViewById(AbstractC5955f.ll_disability_certification);
        List<ReservationResponse.PsgDiscAddInfo> psgDiscAdd_info = ((ReservationResponse) q.fromJson(this.f27929i.getReservationResponse(), ReservationResponse.class)).getPsgDiscAdd_infos().getPsgDiscAdd_info();
        for (int i8 = 0; i8 < psgDiscAdd_info.size(); i8++) {
            ReservationResponse.PsgDiscAddInfo psgDiscAddInfo = psgDiscAdd_info.get(i8);
            Bundle bundle = new Bundle();
            bundle.putInt(PASSENGER_POSITION, i8);
            bundle.putString(RESIDENT_REGISTRATION_NUMBER, "");
            bundle.putSerializable(CERTIFICATION_STEP, a.NONE);
            bundle.putInt(SQ_NO, psgDiscAddInfo.getH_psg_sqno());
            bundle.putString(DISABILITY_CERTIFICATION_CODE, psgDiscAddInfo.getH_duty_ref_rcgn_ps_dv_cd());
            ViewOnClickListenerC6546f viewOnClickListenerC6546f = new ViewOnClickListenerC6546f(this, bundle);
            this.f27930j.add(viewOnClickListenerC6546f);
            if (i8 < psgDiscAdd_info.size() - 1) {
                viewOnClickListenerC6546f.setMargin();
            }
            linearLayout.addView(viewOnClickListenerC6546f);
        }
        String string = H.getString(getApplicationContext(), "DISABILITY_CERTIFICATION_MSG");
        if (N.isNotNull(string)) {
            this.f27932l.setText(string);
        }
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_disability_certification);
        this.f27931k.setText(u0(((ReservationResponse) q.fromJson(this.f27929i.getReservationResponse(), ReservationResponse.class)).getJrny_infos().getJrny_info()));
    }

    private void t0() {
        int size = this.f27930j.size();
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();
        HashMap<String, String> map3 = new HashMap<>();
        HashMap<String, String> map4 = new HashMap<>();
        HashMap<String, String> map5 = new HashMap<>();
        HashMap<String, String> map6 = new HashMap<>();
        int i8 = 0;
        int i9 = 1;
        while (i8 < this.f27930j.size()) {
            Bundle buntData = ((ViewOnClickListenerC6546f) this.f27930j.get(i8)).getBuntData();
            map.put("txtPsgDisc0019Sqno_" + i9, Integer.valueOf(buntData.getInt(SQ_NO)));
            map2.put("txtJobDvCd0019_" + i9, "1");
            map3.put("txtPsgDisc0019PsDvCd_" + i9, buntData.getString(DISABILITY_CERTIFICATION_CODE));
            map4.put("txtPsgDisc0019CustNm_" + i9, "");
            map2.put("txtPsgDisc0019Birth_" + i9, buntData.getString(BIRTH_DAY));
            map2.put("txtPsgDisc0019Grade_" + i9, buntData.getString(SUITABILITY_RATING_CODE));
            i8++;
            i9++;
        }
        ApplyDisabilityCertificationDao applyDisabilityCertificationDao = new ApplyDisabilityCertificationDao();
        ApplyDisabilityCertificationDao.ApplyDisabilityCertificationDaoRequest applyDisabilityCertificationDaoRequest = applyDisabilityCertificationDao.new ApplyDisabilityCertificationDaoRequest();
        applyDisabilityCertificationDaoRequest.setHidPnrNo(this.f27929i.getTxtPnrNo());
        applyDisabilityCertificationDaoRequest.setTxtPsgDisc0019Cnt(size);
        applyDisabilityCertificationDaoRequest.setTxtPsgDisc0019Sqno(map);
        applyDisabilityCertificationDaoRequest.setTxtJobDvCd0019(map2);
        applyDisabilityCertificationDaoRequest.setTxtPsgDisc0019PsDvCd(map3);
        applyDisabilityCertificationDaoRequest.setTxtPsgDisc0019CustNm(map4);
        applyDisabilityCertificationDaoRequest.setTxtPsgDisc0019Birth(map5);
        applyDisabilityCertificationDaoRequest.setTxtPsgDisc0019Grade(map6);
        applyDisabilityCertificationDao.setRequest(applyDisabilityCertificationDaoRequest);
        executeDao(applyDisabilityCertificationDao);
    }

    private String u0(List list) {
        StringBuilder sb = new StringBuilder();
        sb.append(C6634h.convertFormat(((ReservationResponse.JrnyInfo) list.get(0)).getH_dpt_dt(), "yyyyMMdd", "yyyy년 MM월 dd일 (E)"));
        sb.append(", ");
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for (int i8 = 0; i8 < list.size(); i8++) {
            ReservationResponse.JrnyInfo jrnyInfo = (ReservationResponse.JrnyInfo) list.get(i8);
            sb2.append(jrnyInfo.getH_trn_clsf_nm() + X.SPACE + jrnyInfo.getH_trn_no());
            sb3.append(jrnyInfo.getH_dpt_rs_stn_nm() + X.SPACE + C6634h.convertFormat(jrnyInfo.getH_dpt_tm(), "HHmmss", "HH:mm"));
            sb3.append(" > ");
            sb3.append(jrnyInfo.getH_arv_rs_stn_nm() + X.SPACE + C6634h.convertFormat(jrnyInfo.getH_arv_tm(), "HHmmss", "HH:mm"));
            if (i8 == 0 && list.size() > 1) {
                sb2.append(" > ");
                sb3.append(" > ");
            }
        }
        sb.append(sb2.toString());
        sb.append(X.LF);
        sb.append(sb3.toString());
        return sb.toString();
    }

    private boolean v0() {
        Iterator it = this.f27930j.iterator();
        while (it.hasNext()) {
            if (!((ViewOnClickListenerC6546f) it.next()).isDisabilityCertification()) {
                return false;
            }
        }
        return true;
    }

    private boolean w0(Bundle bundle) {
        Iterator it = this.f27930j.iterator();
        while (it.hasNext()) {
            Bundle buntData = ((ViewOnClickListenerC6546f) it.next()).getBuntData();
            if (bundle != buntData && bundle.getString(RESIDENT_REGISTRATION_NUMBER).equals(buntData.getString(RESIDENT_REGISTRATION_NUMBER))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x0(NestedScrollView nestedScrollView, int i8, int i9, int i10, int i11) {
        O(this.f27934n);
    }

    private void y0() {
        this.f27929i = (DisabilityReservationData) getIntent().getSerializableExtra("RESERVATION_DATA");
        this.f27930j = new ArrayList();
    }

    private void z0() {
        this.f27933m.setOnClickListener(this);
        this.f27934n.setOnScrollChangeListener(new NestedScrollView.d() { // from class: Z4.a
            @Override // androidx.core.widget.NestedScrollView.d
            public final void onScrollChange(NestedScrollView nestedScrollView, int i8, int i9, int i10, int i11) {
                this.f5743a.x0(nestedScrollView, i8, i9, i10, i11);
            }
        });
    }

    @Override // Z4.b
    public void disabilityCertificationCheck(Bundle bundle) {
        if (w0(bundle)) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.applied_resident_registration_number)).showDialog();
        } else {
            executeDisabledCertification(bundle);
        }
    }

    public void executeDisabledCertification(Bundle bundle) {
        DisabledCertificationDao disabledCertificationDao = new DisabledCertificationDao();
        DisabledCertificationDao.DisabledCertificationRequest disabledCertificationRequest = disabledCertificationDao.new DisabledCertificationRequest();
        disabledCertificationRequest.setRegNum(bundle.getString(RESIDENT_REGISTRATION_NUMBER));
        disabledCertificationRequest.setHdcpGrade(bundle.getString(DISABILITY_CERTIFICATION_CODE));
        disabledCertificationRequest.setPosition(bundle.getInt(PASSENGER_POSITION));
        disabledCertificationDao.setRequest(disabledCertificationRequest);
        executeDao(disabledCertificationDao);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.btn_disability_certification_confirm != view.getId()) {
            super.onClick(view);
            return;
        }
        h hVar = h.getInstance();
        if (!C6630d.isNotNull(hVar) || !hVar.isNonMember()) {
            t0();
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("RESERVATION_DATA", this.f27929i);
        setResult(-1, intent);
        finish();
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_disability_certification);
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
        if (AbstractC5955f.dao_disabled != id) {
            if (AbstractC5955f.dao_applied_disability_certification == id) {
                Intent intent = new Intent();
                intent.putExtra("RESERVATION_DATA", this.f27929i);
                setResult(-1, intent);
                finish();
                return;
            }
            return;
        }
        DisabledCertificationDao.DisabledCertificationRequest disabledCertificationRequest = (DisabledCertificationDao.DisabledCertificationRequest) iBaseDao.getRequest();
        DisabledCertificationDao.DisabledCertificationResponse disabledCertificationResponse = (DisabledCertificationDao.DisabledCertificationResponse) iBaseDao.getResponse();
        ViewOnClickListenerC6546f viewOnClickListenerC6546f = (ViewOnClickListenerC6546f) this.f27930j.get(disabledCertificationRequest.getPosition());
        Bundle buntData = viewOnClickListenerC6546f.getBuntData();
        buntData.putSerializable(CERTIFICATION_STEP, a.DISABILITY_CERTIFICATION_SUCCESS);
        buntData.putString(CERTIFICATION_MESSAGE, disabledCertificationResponse.gethMsgTxt());
        buntData.putString(BIRTH_DAY, disabledCertificationResponse.getBtdt());
        buntData.putString(SUITABILITY_RATING_CODE, disabledCertificationResponse.getSubtDcsClCd());
        viewOnClickListenerC6546f.refreshView(buntData);
        this.f27933m.setEnabled(v0());
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        super.onReceiveError(iBaseDao, c6536a);
        if (AbstractC5955f.dao_disabled == iBaseDao.getId()) {
            ViewOnClickListenerC6546f viewOnClickListenerC6546f = (ViewOnClickListenerC6546f) this.f27930j.get(((DisabledCertificationDao.DisabledCertificationRequest) iBaseDao.getRequest()).getPosition());
            Bundle buntData = viewOnClickListenerC6546f.getBuntData();
            buntData.putSerializable(CERTIFICATION_STEP, a.DISABILITY_CERTIFICATION_FAIL);
            viewOnClickListenerC6546f.refreshView(buntData);
            this.f27933m.setEnabled(v0());
        }
    }
}
