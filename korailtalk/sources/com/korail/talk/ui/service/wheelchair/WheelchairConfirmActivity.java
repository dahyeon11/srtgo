package com.korail.talk.ui.service.wheelchair;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.korail.talk.data.WheelchairData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.addService.AdditionalServiceDao;
import com.korail.talk.network.dao.addService.AdditionalServiceDao.AdditionalServiceRequest;
import com.korail.talk.network.dao.addService.HelpSrvTkDao;
import com.korail.talk.network.dao.addService.HelpSrvTkDao.HelpSrvTkDaoRequest;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.C6637k;
import z4.N;

/* loaded from: classes.dex */
public class WheelchairConfirmActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private WheelchairData f28671i;

    /* renamed from: j, reason: collision with root package name */
    private HelpSrvTkDao.HelpSrvTkDaoResponse f28672j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f28673k;

    /* renamed from: l, reason: collision with root package name */
    private TextView f28674l;

    /* renamed from: m, reason: collision with root package name */
    private TextView f28675m;

    /* renamed from: n, reason: collision with root package name */
    private TextView f28676n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f28677o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f28678p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f28679q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f28680r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f28681s;

    private void setText() {
        setAppTitle(AbstractC5959j.title_wheelchair_confirm);
    }

    private void u0() {
        HelpSrvTkDao helpSrvTkDao = new HelpSrvTkDao();
        HelpSrvTkDao.HelpSrvTkDaoRequest helpSrvTkDaoRequest = helpSrvTkDao.new HelpSrvTkDaoRequest();
        helpSrvTkDaoRequest.setSaleWctNo(this.f28671i.getWctNo());
        helpSrvTkDaoRequest.setSaleDt(this.f28671i.getSaleDt());
        helpSrvTkDaoRequest.setSaleSqno(this.f28671i.getSqNo());
        helpSrvTkDao.setRequest(helpSrvTkDaoRequest);
        executeDao(helpSrvTkDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0(DialogInterface dialogInterface, int i8) {
        setResult(-1);
        finish();
    }

    private void w0() {
        this.f28671i = (WheelchairData) getIntent().getSerializableExtra("WHEELCHAIR_DATA");
    }

    private void x0() {
        findViewById(AbstractC5955f.btn_wheelchair_confirm_cancel).setOnClickListener(this);
        findViewById(AbstractC5955f.btn_wheelchair_confirm_confirm).setOnClickListener(this);
    }

    private void y0(HelpSrvTkDao.helpSrv helpsrv) {
        HelpSrvTkDao.helpSrvTgt helpsrvtgt = helpsrv.getHelpSrvTgtList().get(0);
        findViewById(AbstractC5955f.v_wheelchair).setVisibility(0);
        this.f28673k.setText(getString(AbstractC5959j.wheelchair_confirm_user_name, helpsrvtgt.getCustNm()));
        this.f28674l.setText(getString(AbstractC5959j.wheelchair_confirm_phone_number, helpsrvtgt.getCustTeln()));
        this.f28675m.setText(getString(AbstractC5959j.wheelchair_confirm_dpt_dt, this.f28671i.getDptDt()));
        this.f28676n.setText(getString(AbstractC5959j.wheelchair_confirm_trn_nm, this.f28671i.getTrnNm()));
        this.f28677o.setText(getString(AbstractC5959j.wheelchair_confirm_stn_nm, helpsrv.getJrnyInfo300()));
        this.f28678p.setText(getString(AbstractC5959j.wheelchair_confirm_meeting_place, helpsrv.getAddSrvSpotCont()));
        this.f28679q.setText(getString(AbstractC5959j.wheelchair_confirm_meeting_time, helpsrv.getArvEpctTm()));
        this.f28680r.setText(getString(AbstractC5959j.wheelchair_confirm_questions, helpsrv.getLeadMsgCont()));
        N.setBulletSpan(getResources().getStringArray(AbstractC5952c.wheelchair_confirm_guide), this.f28681s);
    }

    private void z0() {
        l0();
        this.f28673k = (TextView) findViewById(AbstractC5955f.tv_wheelchair_confirm_name);
        this.f28674l = (TextView) findViewById(AbstractC5955f.tv_wheelchair_confirm_phone_number);
        this.f28675m = (TextView) findViewById(AbstractC5955f.tv_wheelchair_confirm_dpt_dt);
        this.f28676n = (TextView) findViewById(AbstractC5955f.tv_wheelchair_confirm_trn_nm);
        this.f28677o = (TextView) findViewById(AbstractC5955f.tv_wheelchair_confirm_stn_nm);
        this.f28678p = (TextView) findViewById(AbstractC5955f.tv_wheelchair_confirm_meeting_place);
        this.f28679q = (TextView) findViewById(AbstractC5955f.tv_wheelchair_confirm_meeting_time);
        this.f28680r = (TextView) findViewById(AbstractC5955f.tv_wheelchair_confirm_questions);
        this.f28681s = (TextView) findViewById(AbstractC5955f.tv_wheelchair_confirm_guide);
        findViewById(AbstractC5955f.v_wheelchair_confirm_cancel).setVisibility(this.f28671i.isShowCancelButton() ? 0 : 8);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.btn_wheelchair_confirm_cancel == id) {
            t0();
        } else if (AbstractC5955f.btn_wheelchair_confirm_confirm == id) {
            finish();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_wheelchair_confirm);
        if (C6630d.isNull(bundle)) {
            w0();
            z0();
            setText();
            x0();
            u0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_help_srv_tk == id) {
            HelpSrvTkDao.HelpSrvTkDaoResponse helpSrvTkDaoResponse = (HelpSrvTkDao.HelpSrvTkDaoResponse) iBaseDao.getResponse();
            this.f28672j = helpSrvTkDaoResponse;
            y0(helpSrvTkDaoResponse.getHelpSrvList().get(0));
        } else if (AbstractC5955f.dao_additional_service == id) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.wheelchair_confirm_cancel)).setButtonListener(new DialogInterface.OnClickListener() { // from class: U5.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f5048a.v0(dialogInterface, i8);
                }
            }).showDialog();
        }
    }

    protected void t0() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(this.f28672j.getHelpSrvList().get(0).getAddSrvReqNo());
        AdditionalServiceDao additionalServiceDao = new AdditionalServiceDao();
        AdditionalServiceDao.AdditionalServiceRequest additionalServiceRequest = additionalServiceDao.new AdditionalServiceRequest();
        additionalServiceRequest.setSaleWctNo(this.f28671i.getWctNo());
        additionalServiceRequest.setSaleDt(this.f28671i.getSaleDt());
        additionalServiceRequest.setSaleSqno(this.f28671i.getSqNo());
        additionalServiceRequest.setJrnySqno("1");
        additionalServiceRequest.setJobDbCd("C");
        additionalServiceRequest.setAddSrvId("0020000001");
        additionalServiceRequest.setCncTgtCnt(1);
        additionalServiceRequest.setAddSrvReqNo(arrayList);
        additionalServiceDao.setRequest(additionalServiceRequest);
        executeDao(additionalServiceDao);
    }
}
