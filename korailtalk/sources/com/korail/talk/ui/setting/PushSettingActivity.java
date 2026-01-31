package com.korail.talk.ui.setting;

import Q7.X;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.addService.HelpSrvCustDao;
import com.korail.talk.network.dao.delay.CashRfnDao;
import com.korail.talk.network.dao.push.PushUpdateDao;
import com.korail.talk.network.dao.push.PushUpdateDao.PushUpdateRequest;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5952c;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import s4.C6219c;
import z4.C6630d;
import z4.C6637k;
import z4.N;

/* loaded from: classes.dex */
public class PushSettingActivity extends BaseViewActivity implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: A, reason: collision with root package name */
    private ImageView f28710A;

    /* renamed from: i, reason: collision with root package name */
    private final String f28711i = CashRfnDao.f27552I;

    /* renamed from: j, reason: collision with root package name */
    private final String f28712j = "R";

    /* renamed from: k, reason: collision with root package name */
    private final String f28713k = "U";

    /* renamed from: l, reason: collision with root package name */
    private final String f28714l = HelpSrvCustDao.HelpSrvCustRequest.f27549D;

    /* renamed from: m, reason: collision with root package name */
    private final int f28715m = 3;

    /* renamed from: n, reason: collision with root package name */
    private final int f28716n = 0;

    /* renamed from: o, reason: collision with root package name */
    private int f28717o;

    /* renamed from: p, reason: collision with root package name */
    private int f28718p;

    /* renamed from: q, reason: collision with root package name */
    private String[] f28719q;

    /* renamed from: r, reason: collision with root package name */
    private String[] f28720r;

    /* renamed from: s, reason: collision with root package name */
    private String f28721s;

    /* renamed from: t, reason: collision with root package name */
    private String f28722t;

    /* renamed from: u, reason: collision with root package name */
    private CheckBox f28723u;

    /* renamed from: v, reason: collision with root package name */
    private CheckBox f28724v;

    /* renamed from: w, reason: collision with root package name */
    private ScrollView f28725w;

    /* renamed from: x, reason: collision with root package name */
    private TextView f28726x;

    /* renamed from: y, reason: collision with root package name */
    private TextView f28727y;

    /* renamed from: z, reason: collision with root package name */
    private TextView f28728z;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0(DialogInterface dialogInterface, int i8, boolean z8, int i9, String str) {
        if (102 == i8) {
            this.f28718p = i9;
            String[] strArr = this.f28720r;
            if (i9 == strArr.length - 1) {
                this.f28727y.setText(this.f28720r[i9] + X.SPACE + str + getString(AbstractC5959j.common_before_minute));
                this.f28722t = str;
            } else {
                this.f28727y.setText(strArr[i9]);
            }
            w0("U");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0(DialogInterface dialogInterface, int i8, boolean z8, int i9, String str) {
        if (102 == i8) {
            this.f28717o = x0(i9);
            String[] strArr = this.f28719q;
            if (i9 == strArr.length - 1) {
                this.f28726x.setText(this.f28719q[i9] + X.SPACE + str + getString(AbstractC5959j.common_before_minute));
                this.f28721s = str;
            } else {
                this.f28726x.setText(strArr[i9]);
            }
            w0("U");
        }
    }

    private void C0() {
        this.f28717o = 3;
        this.f28718p = 0;
        this.f28719q = getResources().getStringArray(AbstractC5952c.departure_notice_values);
        this.f28720r = getResources().getStringArray(AbstractC5952c.arrival_notice_values);
    }

    private void D0() {
        this.f28726x.setOnClickListener(this);
        this.f28727y.setOnClickListener(this);
        this.f28710A.setOnClickListener(this);
        this.f28723u.setOnCheckedChangeListener(this);
        this.f28724v.setOnCheckedChangeListener(this);
    }

    private void E0(PushUpdateDao.PushUpdateResponse pushUpdateResponse) {
        setText();
        D0();
        this.f28717o = Integer.parseInt(pushUpdateResponse.getTnsm_flg2());
        this.f28718p = Integer.parseInt(pushUpdateResponse.getTnsm_flg3());
        this.f28721s = pushUpdateResponse.getDptUsrInpTnum();
        this.f28722t = pushUpdateResponse.getArvUsrInpTnum();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb.append(this.f28719q[y0(this.f28717o)]);
        sb2.append(this.f28720r[this.f28718p]);
        if (x0(this.f28717o) == 4) {
            sb.append(X.SPACE);
            sb.append(Integer.parseInt(pushUpdateResponse.getDptUsrInpTnum()));
            sb.append(getString(AbstractC5959j.common_before_minute));
        }
        if (this.f28718p == 3) {
            sb2.append(X.SPACE);
            sb2.append(Integer.parseInt(pushUpdateResponse.getArvUsrInpTnum()));
            sb2.append(getString(AbstractC5959j.common_before_minute));
        }
        this.f28726x.setText(sb.toString());
        this.f28727y.setText(sb2.toString());
        v0(pushUpdateResponse.getTnsm_flg1(), pushUpdateResponse.getTnsm_flg4());
    }

    private void F0() {
        m0();
        this.f28725w = (ScrollView) findViewById(AbstractC5955f.scrollView);
        this.f28723u = (CheckBox) findViewById(AbstractC5955f.basicNotiSwitch);
        this.f28724v = (CheckBox) findViewById(AbstractC5955f.noticeEventSwitch);
        this.f28726x = (TextView) findViewById(AbstractC5955f.departureNotiStateTxt);
        this.f28727y = (TextView) findViewById(AbstractC5955f.arrivalNotiStateTxt);
        this.f28728z = (TextView) findViewById(AbstractC5955f.rememberMsgTxt);
        this.f28710A = (ImageView) findViewById(AbstractC5955f.rememberArwBtn);
    }

    private void G0() {
        C6637k.getTrainPushDialog(K(), 1002, 20, 0, getString(AbstractC5959j.notice_setting_notice_before_arrival)).setRadioGroup(this.f28720r, this.f28718p).setButtonNames(N.getStringArray(getString(AbstractC5959j.common_cancel), getString(AbstractC5959j.common_confirm))).setButtonListener(new C6219c.e() { // from class: V5.d
            @Override // s4.C6219c.e
            public final void onClick(DialogInterface dialogInterface, int i8, boolean z8, int i9, String str) {
                this.f5225a.A0(dialogInterface, i8, z8, i9, str);
            }
        }).showDialog();
    }

    private void H0(int i8) {
        C6637k.getTrainPushDialog(K(), 1002, 55, 0, getString(AbstractC5959j.notice_setting_notice_before_departure)).setRadioGroup(this.f28719q, i8).setButtonNames(N.getStringArray(getString(AbstractC5959j.common_cancel), getString(AbstractC5959j.common_confirm))).setButtonListener(new C6219c.e() { // from class: V5.c
            @Override // s4.C6219c.e
            public final void onClick(DialogInterface dialogInterface, int i9, boolean z8, int i10, String str) {
                this.f5224a.B0(dialogInterface, i9, z8, i10, str);
            }
        }).showDialog();
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_notification_setting);
    }

    private void v0(String str, String str2) {
        this.f28723u.setChecked(str.equals("1"));
        this.f28724v.setChecked(str2.equals("1"));
    }

    private void w0(String str) {
        PushUpdateDao pushUpdateDao = new PushUpdateDao();
        PushUpdateDao.PushUpdateRequest pushUpdateRequest = pushUpdateDao.new PushUpdateRequest();
        pushUpdateRequest.setJob_dv_cd(str);
        pushUpdateRequest.setTtnsm_flg1(this.f28723u.isChecked() ? "1" : "0");
        pushUpdateRequest.setTtnsm_flg2(String.valueOf(this.f28717o));
        pushUpdateRequest.setTtnsm_flg3(String.valueOf(this.f28718p));
        pushUpdateRequest.setTtnsm_flg4(this.f28724v.isChecked() ? "1" : "0");
        pushUpdateRequest.setDptUsrInpTnum(this.f28721s);
        pushUpdateRequest.setArvUsrInpTnum(this.f28722t);
        pushUpdateDao.setRequest(pushUpdateRequest);
        pushUpdateDao.setPending(true);
        executeDao(pushUpdateDao);
    }

    private int x0(int i8) {
        return getResources().getIntArray(AbstractC5952c.departure_notice_request_index)[i8];
    }

    private int y0(int i8) {
        return getResources().getIntArray(AbstractC5952c.departure_notice_values_index)[i8];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0() {
        this.f28725w.scrollTo(0, this.f28728z.getBottom());
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
        w0("U");
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        O(view);
        int id = view.getId();
        if (AbstractC5955f.departureNotiStateTxt == id) {
            H0(y0(this.f28717o));
            return;
        }
        if (AbstractC5955f.arrivalNotiStateTxt == id) {
            G0();
            return;
        }
        if (AbstractC5955f.rememberArwBtn != id) {
            super.onClick(view);
            return;
        }
        if (this.f28728z.getVisibility() == 0) {
            this.f28728z.setVisibility(8);
            this.f28710A.setImageResource(AbstractC5954e.fold_gray);
        } else {
            this.f28728z.setVisibility(0);
            this.f28710A.setImageResource(AbstractC5954e.unfold_gray);
            this.f28725w.post(new Runnable() { // from class: V5.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5223a.z0();
                }
            });
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.push_setting_activity);
        if (C6630d.isNull(bundle)) {
            C0();
            F0();
            setText();
            w0("R");
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_push_update == iBaseDao.getId()) {
            PushUpdateDao.PushUpdateRequest pushUpdateRequest = (PushUpdateDao.PushUpdateRequest) iBaseDao.getRequest();
            PushUpdateDao.PushUpdateResponse pushUpdateResponse = (PushUpdateDao.PushUpdateResponse) iBaseDao.getResponse();
            if ("R".equals(pushUpdateRequest.getJob_dv_cd())) {
                if ("WRB000032".equals(pushUpdateResponse.getPrs_cnqe_msg_cd())) {
                    w0(CashRfnDao.f27552I);
                } else {
                    E0(pushUpdateResponse);
                }
            }
        }
    }
}
