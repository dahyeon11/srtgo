package com.korail.talk.ui.mypage;

import I4.h;
import J4.b;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.addService.HelpSrvCustDao;
import com.korail.talk.network.dao.common.CommonCodeDao;
import com.korail.talk.network.dao.login.LoginAthnRegDao;
import com.korail.talk.network.dao.login.LoginAthnRegDao.LoginAthnRegRequest;
import com.korail.talk.network.dao.login.LoginAthnRmvDao;
import com.korail.talk.network.dao.login.LoginAthnRmvDao.LoginAthnRmvRequest;
import com.korail.talk.network.dao.login.LoginDao;
import com.korail.talk.network.dao.login.LoginDao.LoginResponse;
import com.korail.talk.network.dao.login.LogoutDao;
import com.korail.talk.network.dao.xPoint.KorailPointInquiryDao;
import com.korail.talk.ui.menu.DelayDiscountCouponActivity;
import com.korail.talk.ui.menu.DiscountCouponActivity;
import com.korail.talk.ui.mileage.MileageHistoryActivity;
import com.korail.talk.ui.setting.memberCard.MemberCardActivity;
import com.korail.talk.ui.web.OnepassWebViewActivity;
import com.korail.talk.view.base.BaseViewActivity;
import g2.C5540b;
import g5.e;
import java.lang.reflect.InvocationTargetException;
import java.security.NoSuchAlgorithmException;
import n4.AbstractC5953d;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import y1.x;
import y4.C6536a;
import z4.C;
import z4.C6630d;
import z4.C6633g;
import z4.C6637k;
import z4.H;
import z4.I;
import z4.N;
import z4.q;
import z4.t;
import z4.u;
import z4.z;

/* loaded from: classes.dex */
public class MyPageActivity extends BaseViewActivity implements G4.a {

    /* renamed from: A, reason: collision with root package name */
    private TextView f28505A;

    /* renamed from: B, reason: collision with root package name */
    private ImageView f28506B;

    /* renamed from: C, reason: collision with root package name */
    private TextView f28507C;

    /* renamed from: D, reason: collision with root package name */
    private TextView f28508D;

    /* renamed from: E, reason: collision with root package name */
    private ImageView f28509E;

    /* renamed from: F, reason: collision with root package name */
    private TextView f28510F;

    /* renamed from: G, reason: collision with root package name */
    private TextView f28511G;

    /* renamed from: i, reason: collision with root package name */
    private final int f28512i = 3;

    /* renamed from: j, reason: collision with root package name */
    private final int f28513j = 0;

    /* renamed from: k, reason: collision with root package name */
    private final int f28514k = 1;

    /* renamed from: l, reason: collision with root package name */
    private final int f28515l = 2;

    /* renamed from: m, reason: collision with root package name */
    private J4.a f28516m;

    /* renamed from: n, reason: collision with root package name */
    private b f28517n;

    /* renamed from: o, reason: collision with root package name */
    private com.google.android.gms.auth.api.signin.b f28518o;

    /* renamed from: p, reason: collision with root package name */
    private View[] f28519p;

    /* renamed from: q, reason: collision with root package name */
    private View f28520q;

    /* renamed from: r, reason: collision with root package name */
    private View f28521r;

    /* renamed from: s, reason: collision with root package name */
    private View f28522s;

    /* renamed from: t, reason: collision with root package name */
    private View f28523t;

    /* renamed from: u, reason: collision with root package name */
    private View f28524u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f28525v;

    /* renamed from: w, reason: collision with root package name */
    private TextView f28526w;

    /* renamed from: x, reason: collision with root package name */
    private TextView f28527x;

    /* renamed from: y, reason: collision with root package name */
    private ImageView f28528y;

    /* renamed from: z, reason: collision with root package name */
    private TextView f28529z;

    private class a extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        private final ImageView f28530a;

        /* renamed from: b, reason: collision with root package name */
        private final String f28531b;

        /* renamed from: c, reason: collision with root package name */
        private final int f28532c;

        a(ImageView imageView, String str, int i8) {
            this.f28530a = imageView;
            this.f28531b = str;
            this.f28532c = i8;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Drawable doInBackground(Void... voidArr) {
            return this.f28532c == 0 ? new BitmapDrawable(MyPageActivity.this.getResources(), C6633g.createQRCode(this.f28531b, N.dpToPx(60.0f), N.dpToPx(60.0f), -15574641, -1971213)) : new BitmapDrawable(MyPageActivity.this.getResources(), C6633g.createBarcode(this.f28531b, N.dpToPx(160.0f), N.dpToPx(60.0f), androidx.core.content.a.getColor(MyPageActivity.this.getApplicationContext(), AbstractC5953d.barcode_line_mypage), androidx.core.content.a.getColor(MyPageActivity.this.getApplicationContext(), AbstractC5953d.barcode_background_mypage)));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Drawable drawable) {
            super.onPostExecute(drawable);
            this.f28530a.setBackground(drawable);
            MyPageActivity.this.dismissLoading();
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            MyPageActivity.this.showLoading();
        }
    }

    private void A0() {
        executeDao(new LogoutDao());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0(DialogInterface dialogInterface, int i8) {
        A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C0(DialogInterface dialogInterface, int i8) {
        x0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D0(LoginDao.LoginResponse loginResponse, View view) {
        C6637k.showLoginDialog(this, u.getLoginSuccessPopupData(getApplicationContext(), loginResponse, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E0(DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            A0();
        }
    }

    private void F0() {
        this.f28518o = com.google.android.gms.auth.api.signin.a.getClient((Activity) this, new GoogleSignInOptions.a(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build());
    }

    private void G0(KorailPointInquiryDao.KorailPointInquiryResponse korailPointInquiryResponse) {
        if ("Y".equals(korailPointInquiryResponse.getH_hdcp_flg())) {
            this.f28522s.setVisibility(0);
            ((TextView) this.f28523t.findViewById(AbstractC5955f.countTxt)).setText(korailPointInquiryResponse.getH_subt_dcs_cl_nm());
            ((TextView) this.f28524u.findViewById(AbstractC5955f.countTxt)).setText(korailPointInquiryResponse.getH_cust_lead_flg_nm());
        }
    }

    private void H0(KorailPointInquiryDao.KorailPointInquiryResponse korailPointInquiryResponse) {
        boolean zEqualsIgnoreCase = korailPointInquiryResponse.getH_logn_tp_cd2().equalsIgnoreCase("Y");
        this.f28529z.setText(zEqualsIgnoreCase ? "연동" : "미연동");
        this.f28528y.setVisibility(zEqualsIgnoreCase ? 8 : 0);
        this.f28505A.setText(N.applySpannable("카카오 ID 연동 해제", new UnderlineSpan()));
        this.f28505A.setVisibility(zEqualsIgnoreCase ? 0 : 8);
        boolean zEqualsIgnoreCase2 = korailPointInquiryResponse.getH_logn_tp_cd1().equalsIgnoreCase("Y");
        this.f28526w.setText(zEqualsIgnoreCase2 ? "연동" : "미연동");
        this.f28525v.setVisibility(zEqualsIgnoreCase2 ? 8 : 0);
        this.f28527x.setText(N.applySpannable("네이버 ID 연동 해제", new UnderlineSpan()));
        this.f28527x.setVisibility(zEqualsIgnoreCase2 ? 0 : 8);
        boolean zEqualsIgnoreCase3 = korailPointInquiryResponse.getH_logn_tp_cd4().equalsIgnoreCase("Y");
        this.f28507C.setText(zEqualsIgnoreCase3 ? "연동" : "미연동");
        this.f28506B.setVisibility(zEqualsIgnoreCase3 ? 8 : 0);
        this.f28508D.setText(N.applySpannable("Google ID 연동 해제", new UnderlineSpan()));
        this.f28508D.setVisibility(zEqualsIgnoreCase3 ? 0 : 8);
        boolean zEqualsIgnoreCase4 = korailPointInquiryResponse.getH_logn_tp_cd5().equalsIgnoreCase("Y");
        this.f28510F.setText(zEqualsIgnoreCase4 ? "연동" : "미연동");
        this.f28509E.setVisibility(zEqualsIgnoreCase4 ? 8 : 0);
        this.f28511G.setText(N.applySpannable("디지털원패스 연동 해제", new UnderlineSpan()));
        this.f28511G.setVisibility(zEqualsIgnoreCase4 ? 0 : 8);
    }

    private void I0() {
        if (C6630d.isNull(this.f28516m)) {
            J4.a aVar = new J4.a(this);
            this.f28516m = aVar;
            aVar.setListener(this);
        }
        if (C6630d.isNull(this.f28517n)) {
            b bVar = new b(this);
            this.f28517n = bVar;
            bVar.setListener(this);
        }
    }

    private void J0(boolean z8) {
        h hVar = h.getInstance();
        StringBuilder sb = new StringBuilder();
        String memberEmailAdr = hVar.getMemberEmailAdr();
        if (!z8 || !C.isValidEmail(hVar.getMemberEmailAdr())) {
            ((TextView) this.f28521r.findViewById(AbstractC5955f.certi_complete)).setText(getString(AbstractC5959j.mypage_unauthorized));
            this.f28521r.findViewById(AbstractC5955f.certi_text).setVisibility(4);
            return;
        }
        String[] strArrSplit = memberEmailAdr.split("@");
        if (strArrSplit[0].length() == 1) {
            sb.append("*");
        } else if (strArrSplit[0].length() == 2) {
            sb.append(strArrSplit[0].substring(0, 1));
            sb.append("*");
        } else if (strArrSplit[0].length() > 2) {
            String str = strArrSplit[0];
            sb.append(str.substring(0, str.length() - 2));
            sb.append("**");
        }
        sb.append("@");
        sb.append(strArrSplit[1]);
        ((TextView) this.f28521r.findViewById(AbstractC5955f.certi_complete)).setText(getString(AbstractC5959j.mypage_certification_complete));
        ((TextView) this.f28521r.findViewById(AbstractC5955f.certi_text)).setText(sb.toString());
    }

    private void K0() {
        for (View view : this.f28519p) {
            view.setOnClickListener(this);
        }
        this.f28525v.setOnClickListener(this);
        this.f28527x.setOnClickListener(this);
        this.f28528y.setOnClickListener(this);
        this.f28505A.setOnClickListener(this);
        this.f28506B.setOnClickListener(this);
        this.f28508D.setOnClickListener(this);
        this.f28509E.setOnClickListener(this);
        this.f28511G.setOnClickListener(this);
        findViewById(AbstractC5955f.tv_mypage_logout).setOnClickListener(this);
        findViewById(AbstractC5955f.mypage_barcode_layout).setOnClickListener(this);
        findViewById(AbstractC5955f.mypage_qrcode_layout).setOnClickListener(this);
    }

    private void L0(boolean z8, String str) {
        StringBuilder sb = new StringBuilder();
        if (!z8 || N.isNull(str)) {
            ((TextView) this.f28520q.findViewById(AbstractC5955f.certi_complete)).setText(getString(AbstractC5959j.mypage_unauthorized));
            this.f28520q.findViewById(AbstractC5955f.certi_text).setVisibility(4);
            CommonCodeDao.Athn athn = (CommonCodeDao.Athn) q.fromJson(H.getString(getApplicationContext(), "ATHN"), CommonCodeDao.Athn.class);
            this.f28520q.findViewById(AbstractC5955f.certi_btn).setVisibility(athn.isApply() ? 0 : 8);
            if (athn.isApply()) {
                final LoginDao.LoginResponse loginResponse = new LoginDao().new LoginResponse();
                loginResponse.setStrAthnFlg5("N");
                this.f28520q.findViewById(AbstractC5955f.certi_btn).setOnClickListener(new View.OnClickListener() { // from class: D5.g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f946a.D0(loginResponse, view);
                    }
                });
                return;
            }
            return;
        }
        h.getInstance().setMemberPhoneNo(str);
        sb.append(str.substring(0, 3));
        sb.append(e.STATE_NAME_NONE);
        if (str.length() == 10) {
            sb.append("***");
        } else {
            sb.append("****");
        }
        sb.append(e.STATE_NAME_NONE);
        sb.append(str.substring(sb.length() - 2));
        ((TextView) this.f28520q.findViewById(AbstractC5955f.certi_complete)).setText(getString(AbstractC5959j.mypage_certification_complete));
        ((TextView) this.f28520q.findViewById(AbstractC5955f.certi_text)).setText(sb.toString());
        this.f28520q.findViewById(AbstractC5955f.certi_text).setVisibility(0);
        this.f28520q.findViewById(AbstractC5955f.certi_btn).setVisibility(4);
    }

    private void M0(int i8, String str) {
        ((TextView) this.f28519p[i8].findViewById(AbstractC5955f.countTxt)).setText(str);
    }

    private void N0() {
        m0();
        this.f28519p = new View[3];
        for (int i8 = 0; i8 < 3; i8++) {
            this.f28519p[i8] = findViewById(I.getViewId(getApplicationContext(), "countCell" + i8));
        }
        this.f28520q = findViewById(AbstractC5955f.phoneCell);
        this.f28521r = findViewById(AbstractC5955f.emailCell);
        this.f28529z = (TextView) findViewById(AbstractC5955f.tv_mypage_kakao_linkage_state);
        this.f28528y = (ImageView) findViewById(AbstractC5955f.iv_mypage_kakao_linkage_reg);
        this.f28505A = (TextView) findViewById(AbstractC5955f.tv_mypage_kakao_linkage_rmv);
        this.f28526w = (TextView) findViewById(AbstractC5955f.tv_mypage_naver_linkage_state);
        this.f28525v = (ImageView) findViewById(AbstractC5955f.iv_mypage_naver_linkage_reg);
        this.f28527x = (TextView) findViewById(AbstractC5955f.tv_mypage_naver_linkage_rmv);
        this.f28507C = (TextView) findViewById(AbstractC5955f.tv_mypage_google_linkage_state);
        this.f28506B = (ImageView) findViewById(AbstractC5955f.iv_mypage_google_linkage_reg);
        this.f28508D = (TextView) findViewById(AbstractC5955f.tv_mypage_google_linkage_rmv);
        this.f28510F = (TextView) findViewById(AbstractC5955f.tv_mypage_onepass_linkage_state);
        this.f28509E = (ImageView) findViewById(AbstractC5955f.iv_mypage_onepass_linkage_reg);
        this.f28511G = (TextView) findViewById(AbstractC5955f.tv_mypage_onepass_linkage_rmv);
        this.f28522s = findViewById(AbstractC5955f.v_mypage_disable_person);
        this.f28523t = findViewById(AbstractC5955f.v_mypage_disable_person_grade);
        this.f28524u = findViewById(AbstractC5955f.v_mypage_disable_person_guide_dog);
        CommonCodeDao.EasyLogin easyLogin = (CommonCodeDao.EasyLogin) q.fromJson(H.getString(getApplicationContext(), "EASY_LOGIN"), CommonCodeDao.EasyLogin.class);
        boolean zIsKakaoShow = easyLogin.isKakaoShow();
        boolean zIsNaverShow = easyLogin.isNaverShow();
        boolean zIsGoogleShow = easyLogin.isGoogleShow();
        boolean zIsOnepassShow = easyLogin.isOnepassShow();
        findViewById(AbstractC5955f.v_mypage_easy_login).setVisibility((zIsKakaoShow || zIsNaverShow || zIsGoogleShow) ? 0 : 8);
        findViewById(AbstractC5955f.v_mypage_kakao).setVisibility(zIsKakaoShow ? 0 : 8);
        findViewById(AbstractC5955f.v_mypage_naver).setVisibility(zIsNaverShow ? 0 : 8);
        findViewById(AbstractC5955f.v_mypage_google).setVisibility(zIsGoogleShow ? 0 : 8);
        findViewById(AbstractC5955f.v_mypage_onepass).setVisibility(zIsOnepassShow ? 0 : 8);
    }

    private void O0() throws Resources.NotFoundException {
        Resources resources;
        int i8;
        if (H.getBoolean(getApplicationContext(), "KEY_AUTO_LOGIN")) {
            resources = getResources();
            i8 = AbstractC5959j.logout_confirm_message_remove_auto;
        } else {
            resources = getResources();
            i8 = AbstractC5959j.logout_confirm_message;
        }
        C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(resources.getString(i8)).setButtonListener(new DialogInterface.OnClickListener() { // from class: D5.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                this.f943a.E0(dialogInterface, i9);
            }
        }).showDialog();
    }

    private void setText() {
        setAppTitle(getString(AbstractC5959j.drawer_menu_member_information));
        ((TextView) this.f28519p[0].findViewById(AbstractC5955f.titleTxt)).setText(AbstractC5959j.common_ktx_mileage);
        ((TextView) this.f28519p[1].findViewById(AbstractC5955f.titleTxt)).setText(AbstractC5959j.common_discount_coupon);
        ((TextView) this.f28519p[2].findViewById(AbstractC5955f.titleTxt)).setText(AbstractC5959j.mypage_delay_discount_coupon);
        ((TextView) this.f28520q.findViewById(AbstractC5955f.certi_title)).setText(getString(AbstractC5959j.mypage_certification_phone));
        ((TextView) this.f28521r.findViewById(AbstractC5955f.certi_title)).setText(getString(AbstractC5959j.mypage_certification_email));
        ((TextView) this.f28523t.findViewById(AbstractC5955f.titleTxt)).setText(AbstractC5959j.mypage_disable_person_certification);
        ((TextView) this.f28524u.findViewById(AbstractC5955f.titleTxt)).setText(AbstractC5959j.mypage_disable_person_guide_dog);
    }

    private void w0() {
        h hVar = h.getInstance();
        ((TextView) findViewById(AbstractC5955f.tv_mypage_name)).setText(hVar.getMemberName());
        if (N.isNull(hVar.getCustClCd()) || !hVar.getCustClCd().equals("A")) {
            findViewById(AbstractC5955f.iv_mypage_vvip).setVisibility(8);
            findViewById(AbstractC5955f.iv_mypage_crown).setVisibility(8);
        } else {
            findViewById(AbstractC5955f.iv_mypage_vvip).setVisibility(0);
            findViewById(AbstractC5955f.iv_mypage_crown).setVisibility(0);
        }
        String memberNum = hVar.getMemberNum();
        ((TextView) findViewById(AbstractC5955f.tv_mypage_number)).setText(memberNum);
        new a((ImageView) findViewById(AbstractC5955f.barcodeImg), memberNum, 1).execute(new Void[0]);
        new a((ImageView) findViewById(AbstractC5955f.qrcodeImg), memberNum, 0).execute(new Void[0]);
    }

    private void x0() {
        executeDao(new KorailPointInquiryDao());
    }

    private void y0(String str, String str2) {
        LoginAthnRegDao loginAthnRegDao = new LoginAthnRegDao();
        LoginAthnRegDao.LoginAthnRegRequest loginAthnRegRequest = loginAthnRegDao.new LoginAthnRegRequest();
        loginAthnRegRequest.setLognTpCd(str);
        loginAthnRegRequest.setCustId(str2);
        loginAthnRegDao.setRequest(loginAthnRegRequest);
        loginAthnRegDao.setErrorMsgCdNotShowDialog("WRC000462");
        executeDao(loginAthnRegDao);
    }

    private void z0(String str) {
        LoginAthnRmvDao loginAthnRmvDao = new LoginAthnRmvDao();
        LoginAthnRmvDao.LoginAthnRmvRequest loginAthnRmvRequest = loginAthnRmvDao.new LoginAthnRmvRequest();
        loginAthnRmvRequest.setSrvQryDvVal("U");
        loginAthnRmvRequest.setLognTpCd(str);
        loginAthnRmvDao.setRequest(loginAthnRmvRequest);
        loginAthnRmvDao.setErrorMsgCdNotShowDialog("ERR000100");
        executeDao(loginAthnRmvDao);
    }

    @Override // G4.a
    public void easyLoginFail(String str, String str2) {
        C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(str2).showDialog();
    }

    @Override // G4.a
    public void easyLoginSuccess(String str, String str2) {
        y0(str, str2);
    }

    @Override // G4.a
    public void easyLogoutSuccess(String str) {
        x0();
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        if (i8 == 125) {
            try {
                easyLoginSuccess(x.MAX_AD_CONTENT_RATING_G, ((GoogleSignInAccount) com.google.android.gms.auth.api.signin.a.getSignedInAccountFromIntent(intent).getResult(C5540b.class)).getId());
                return;
            } catch (C5540b e8) {
                t.e(e8.getMessage());
                return;
            }
        }
        if (-1 == i9 && i8 == 128) {
            String stringExtra = intent.getStringExtra("userKey");
            t.e("userKey :" + stringExtra);
            if (N.isNotNull(stringExtra)) {
                easyLoginSuccess(HelpSrvCustDao.HelpSrvCustRequest.f27549D, intent.getStringExtra("userKey"));
            } else {
                Toast.makeText(getApplicationContext(), "디지털 원패스 로그인 실패(userKey 없음)", 1).show();
            }
        } else if (i8 == 122) {
            x0();
        }
        super.onActivityResult(i8, i9, intent);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) throws Resources.NotFoundException, NoSuchAlgorithmException {
        int id = view.getId();
        if (AbstractC5955f.countCell0 == id) {
            startActivity(new Intent(getApplicationContext(), (Class<?>) MileageHistoryActivity.class));
            return;
        }
        if (AbstractC5955f.countCell1 == id) {
            startActivity(new Intent(getApplicationContext(), (Class<?>) DiscountCouponActivity.class));
            return;
        }
        if (AbstractC5955f.countCell2 == id) {
            startActivity(new Intent(getApplicationContext(), (Class<?>) DelayDiscountCouponActivity.class));
            return;
        }
        if (AbstractC5955f.mypage_barcode_layout == id) {
            Intent intent = new Intent(getApplicationContext(), (Class<?>) MemberCardActivity.class);
            intent.putExtra(MemberCardActivity.MEMBER_CARD_SELECTED_POSITION, 1);
            startActivity(intent);
            return;
        }
        if (AbstractC5955f.mypage_qrcode_layout == id) {
            Intent intent2 = new Intent(getApplicationContext(), (Class<?>) MemberCardActivity.class);
            intent2.putExtra(MemberCardActivity.MEMBER_CARD_SELECTED_POSITION, 0);
            startActivity(intent2);
            return;
        }
        if (AbstractC5955f.tv_mypage_logout == id) {
            O0();
            return;
        }
        if (AbstractC5955f.iv_mypage_kakao_linkage_reg == id) {
            this.f28516m.login();
            return;
        }
        if (AbstractC5955f.tv_mypage_kakao_linkage_rmv == id) {
            z0("K");
            return;
        }
        if (AbstractC5955f.iv_mypage_naver_linkage_reg == id) {
            this.f28517n.login();
            return;
        }
        if (AbstractC5955f.tv_mypage_naver_linkage_rmv == id) {
            z0("N");
            return;
        }
        if (AbstractC5955f.iv_mypage_google_linkage_reg == id) {
            startActivityForResult(this.f28518o.getSignInIntent(), 125);
            return;
        }
        if (AbstractC5955f.tv_mypage_google_linkage_rmv == id) {
            this.f28518o.signOut();
            z0(x.MAX_AD_CONTENT_RATING_G);
            return;
        }
        if (AbstractC5955f.iv_mypage_onepass_linkage_reg != id) {
            if (AbstractC5955f.tv_mypage_onepass_linkage_rmv == id) {
                z0(HelpSrvCustDao.HelpSrvCustRequest.f27549D);
                return;
            } else {
                super.onClick(view);
                return;
            }
        }
        Intent intent3 = new Intent(getApplicationContext(), (Class<?>) OnepassWebViewActivity.class);
        intent3.putExtra("WEB_GET_URL", z.getWebHost() + "/classes/com.korail.mobile.onepass.login.do");
        startActivityForResult(intent3, 128);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_mypage);
        if (C6630d.isNull(bundle)) {
            F0();
            N0();
            setText();
            K0();
            x0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.appcompat.app.e, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onDestroy() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onDestroy();
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_korail_point_inquiry != id) {
            if (AbstractC5955f.dao_login_athn_reg == id) {
                x0();
                return;
            } else {
                if (AbstractC5955f.dao_login_athn_rmv == id) {
                    if (((LoginAthnRmvDao.LoginAthnRmvRequest) iBaseDao.getRequest()).getLognTpCd().equals(H.getString(getApplicationContext(), "KEY_LOGIN_TYPE"))) {
                        C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.easy_login_unlink)).setButtonListener(new DialogInterface.OnClickListener() { // from class: D5.e
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i8) {
                                this.f944a.B0(dialogInterface, i8);
                            }
                        }).showDialog();
                        return;
                    } else {
                        x0();
                        return;
                    }
                }
                return;
            }
        }
        I0();
        w0();
        KorailPointInquiryDao.KorailPointInquiryResponse korailPointInquiryResponse = (KorailPointInquiryDao.KorailPointInquiryResponse) iBaseDao.getResponse();
        String h_korail_point = korailPointInquiryResponse.getH_korail_point();
        String h_disc_coup_cnt = korailPointInquiryResponse.getH_disc_coup_cnt();
        String h_delay_cnt = korailPointInquiryResponse.getH_delay_cnt();
        String h_cntc_chn_cont1 = korailPointInquiryResponse.getH_cntc_chn_cont1();
        boolean zEquals = korailPointInquiryResponse.getH_cp_athn_flg().toUpperCase().equals("Y");
        boolean zEquals2 = korailPointInquiryResponse.getH_emil_athn_flg().toUpperCase().equals("Y");
        M0(0, N.getDecimalFormatString(String.valueOf(h_korail_point)));
        M0(1, h_disc_coup_cnt);
        M0(2, h_delay_cnt);
        J0(zEquals2);
        L0(zEquals, h_cntc_chn_cont1);
        H0(korailPointInquiryResponse);
        G0(korailPointInquiryResponse);
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        super.onReceiveError(iBaseDao, c6536a);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_login_athn_reg == id || AbstractC5955f.dao_login_athn_rmv == id) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(iBaseDao.getResponse().gethMsgTxt()).setButtonListener(new DialogInterface.OnClickListener() { // from class: D5.f
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f945a.C0(dialogInterface, i8);
                }
            }).showDialog();
        }
    }
}
