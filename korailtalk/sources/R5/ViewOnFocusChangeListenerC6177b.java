package r5;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.kakao.sdk.user.Constants;
import com.korail.talk.data.login.LoginPopUpData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.common.CommonCodeDao;
import com.korail.talk.network.dao.login.AutoLoginDao;
import com.korail.talk.network.dao.login.EasyLoginDao;
import com.korail.talk.network.dao.login.LoginDao;
import com.korail.talk.network.dao.login.LoginDao.LoginRequest;
import com.korail.talk.network.dao.pay.StbkAcntDao;
import com.korail.talk.ui.login.nonMember.NonMemberRegisterActivity;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.crypto.NoSuchPaddingException;
import k0.AbstractC5837a;
import m4.C5908a;
import maum.m2u.map.Map;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import org.json.JSONException;
import org.json.JSONObject;
import r4.g;
import z4.C6630d;
import z4.C6638l;
import z4.H;
import z4.N;
import z4.q;
import z4.t;
import z4.u;
import z4.z;

/* renamed from: r5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ViewOnFocusChangeListenerC6177b extends com.korail.talk.view.base.a implements TextView.OnEditorActionListener, View.OnFocusChangeListener, View.OnClickListener {

    /* renamed from: d0, reason: collision with root package name */
    protected int f35771d0;

    /* renamed from: e0, reason: collision with root package name */
    protected G4.b f35772e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f35773f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f35774g0;

    /* renamed from: h0, reason: collision with root package name */
    private View f35775h0;

    /* renamed from: i0, reason: collision with root package name */
    protected TextView f35776i0;

    /* renamed from: j0, reason: collision with root package name */
    protected EditText f35777j0;

    /* renamed from: k0, reason: collision with root package name */
    protected EditText f35778k0;

    /* renamed from: l0, reason: collision with root package name */
    protected CheckBox f35779l0;

    /* renamed from: m0, reason: collision with root package name */
    protected CheckBox f35780m0;

    /* renamed from: n0, reason: collision with root package name */
    private Button f35781n0;

    /* renamed from: o0, reason: collision with root package name */
    private Button f35782o0;

    /* renamed from: p0, reason: collision with root package name */
    private ImageView f35783p0;

    /* renamed from: q0, reason: collision with root package name */
    private ImageView f35784q0;

    /* renamed from: r0, reason: collision with root package name */
    private ImageView f35785r0;

    /* renamed from: s0, reason: collision with root package name */
    private ImageView f35786s0;

    /* renamed from: t0, reason: collision with root package name */
    private final TextWatcher f35787t0 = new a();

    private void A0() {
        B0("N");
    }

    private void B0(String str) {
        LoginDao loginDao = new LoginDao();
        LoginDao.LoginRequest loginRequest = loginDao.new LoginRequest();
        CommonCodeDao.Login login = (CommonCodeDao.Login) q.fromJson(H.getString(getApplicationContext(), "LOGIN_DATA"), CommonCodeDao.Login.class);
        loginRequest.setLoginId(s0(this.f35777j0));
        loginRequest.setLoginPw(E0(s0(this.f35778k0)));
        loginRequest.setLoginType(D0());
        loginRequest.setCheckValidPw(str);
        loginRequest.setIdx(login.getIdx());
        loginDao.setRequest(loginRequest);
        executeDao(loginDao);
    }

    private void C0() {
        B0("Y");
    }

    private String D0() {
        int selectedTabPosition = this.f35772e0.getSelectedTabPosition();
        return selectedTabPosition != 0 ? selectedTabPosition != 1 ? selectedTabPosition != 2 ? "" : "2" : StbkAcntDao.CHANGE_PASSWORD : StbkAcntDao.ACCOUNT_REGISTER;
    }

    private String E0(String str) {
        CommonCodeDao.Login login = (CommonCodeDao.Login) q.fromJson(H.getString(getApplicationContext(), "LOGIN_DATA"), CommonCodeDao.Login.class);
        if ("Y".equals(login.getPwdAESCphd())) {
            try {
                return C5908a.encryptBase64(C6638l.encryptAES(login.getKey(), str));
            } catch (Exception e8) {
                t.d(e8.getMessage());
            }
        } else {
            try {
                return C5908a.encryptBase64(str);
            } catch (Exception e9) {
                t.d(e9.getMessage());
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean F0() {
        int i8;
        int selectedTabPosition = this.f35772e0.getSelectedTabPosition();
        int i9 = 4;
        if (selectedTabPosition == 0) {
            i8 = 10;
        } else if (selectedTabPosition == 1 || selectedTabPosition == 2) {
            i8 = 1;
        } else {
            i8 = 0;
            i9 = 0;
        }
        return s0(this.f35777j0).length() >= i8 && s0(this.f35778k0).length() >= i9;
    }

    private void H0() {
        if (C6630d.isNotNull(getArguments())) {
            this.f35773f0 = getArguments().getBoolean("IS_NONMEMBER", false);
            this.f35774g0 = getArguments().getBoolean("IS_RESERVATION_DAO", false);
        }
    }

    private void I0() {
        this.f35777j0.setOnEditorActionListener(this);
        this.f35777j0.setOnFocusChangeListener(this);
        this.f35777j0.addTextChangedListener(this.f35787t0);
        this.f35778k0.setOnEditorActionListener(this);
        this.f35778k0.setOnFocusChangeListener(this);
        this.f35778k0.addTextChangedListener(this.f35787t0);
        p0(AbstractC5955f.tv_login_find_id).setOnClickListener(this);
        p0(AbstractC5955f.tv_login_find_pw).setOnClickListener(this);
        this.f35781n0.setOnClickListener(this);
        p0(AbstractC5955f.tv_login_register).setOnClickListener(this);
        this.f35782o0.setOnClickListener(this);
        this.f35783p0.setOnClickListener(this);
        this.f35784q0.setOnClickListener(this);
        this.f35785r0.setOnClickListener(this);
        this.f35786s0.setOnClickListener(this);
    }

    private void J0() {
        this.f35776i0 = (TextView) p0(AbstractC5955f.tv_login_id_label);
        this.f35777j0 = (EditText) p0(AbstractC5955f.et_login_id);
        this.f35778k0 = (EditText) p0(AbstractC5955f.et_login_pw);
        this.f35779l0 = (CheckBox) p0(AbstractC5955f.cb_login_save_id);
        this.f35780m0 = (CheckBox) p0(AbstractC5955f.cb_login_auto_login);
        this.f35781n0 = (Button) p0(AbstractC5955f.btn_login_non_register);
        this.f35782o0 = (Button) p0(AbstractC5955f.btn_login);
        this.f35783p0 = (ImageView) p0(AbstractC5955f.iv_onepass_login);
        this.f35784q0 = (ImageView) p0(AbstractC5955f.iv_kakao_login);
        this.f35785r0 = (ImageView) p0(AbstractC5955f.iv_naver_login);
        this.f35786s0 = (ImageView) p0(AbstractC5955f.iv_google_login);
    }

    private void y0() {
        this.f35781n0.setVisibility(this.f35773f0 ? 0 : 8);
        CommonCodeDao.EasyLogin easyLogin = (CommonCodeDao.EasyLogin) q.fromJson(H.getString(getApplicationContext(), "EASY_LOGIN"), CommonCodeDao.EasyLogin.class);
        boolean zIsOnepassShow = easyLogin.isOnepassShow();
        boolean zIsKakaoShow = easyLogin.isKakaoShow();
        boolean zIsNaverShow = easyLogin.isNaverShow();
        boolean zIsGoogleShow = easyLogin.isGoogleShow();
        p0(AbstractC5955f.v_easy_login).setVisibility((zIsKakaoShow || zIsNaverShow || zIsGoogleShow || zIsOnepassShow) ? 0 : 8);
        this.f35783p0.setVisibility(zIsOnepassShow ? 0 : 8);
        this.f35784q0.setVisibility(zIsKakaoShow ? 0 : 8);
        this.f35785r0.setVisibility(zIsNaverShow ? 0 : 8);
        this.f35786s0.setVisibility(zIsGoogleShow ? 0 : 8);
    }

    private void z0() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String strDecryptAES = C5908a.decryptAES(getApplicationContext(), H.getString(getApplicationContext(), "KEY_LOGIN_ID"));
        String strDecryptAES2 = C5908a.decryptAES(getApplicationContext(), H.getString(getApplicationContext(), "KEY_LOGIN_PW"));
        AutoLoginDao autoLoginDao = new AutoLoginDao();
        LoginDao.LoginRequest loginRequest = new LoginDao.LoginRequest();
        CommonCodeDao.Login login = (CommonCodeDao.Login) q.fromJson(H.getString(getApplicationContext(), "LOGIN_DATA"), CommonCodeDao.Login.class);
        loginRequest.setLoginId(strDecryptAES);
        loginRequest.setLoginPw(E0(strDecryptAES2));
        loginRequest.setLoginType(H.getString(getApplicationContext(), "KEY_LOGIN_TYPE"));
        loginRequest.setCheckValidPw("N");
        loginRequest.setIdx(login.getIdx());
        autoLoginDao.setRequest(loginRequest);
        autoLoginDao.setPending(true);
        executeDao(autoLoginDao);
    }

    protected void G0(String str, String str2) {
        if (N.isNotNull(str) && N.isNotNull(str2)) {
            Intent intent = new Intent(getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
            intent.putExtra("WEB_POST_URL", z.getSSLHost() + str);
            intent.putExtra("WEB_POST_PARAMETER", str2);
            startActivityForResult(intent, 105);
        }
    }

    public void executeEasyLogin(String str, String str2, String str3) {
        EasyLoginDao easyLoginDao = new EasyLoginDao();
        LoginDao.LoginRequest loginRequest = new LoginDao.LoginRequest();
        loginRequest.setLoginType(str);
        loginRequest.setCustId(str2);
        loginRequest.setCheckValidPw(str3);
        easyLoginDao.setRequest(loginRequest);
        executeDao(easyLoginDao);
    }

    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            H0();
            J0();
            I0();
            y0();
        }
    }

    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment
    public void onActivityResult(int i8, int i9, Intent intent) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        super.onActivityResult(i8, i9, intent);
        if (8 == i9) {
            String stringExtra = intent.getStringExtra("USER_ID");
            this.f35772e0.setTabPosition(0);
            ViewOnFocusChangeListenerC6177b viewOnFocusChangeListenerC6177b = (ViewOnFocusChangeListenerC6177b) this.f35772e0.getFragment(0);
            if (C6630d.isNull(viewOnFocusChangeListenerC6177b) || C6630d.isNull(viewOnFocusChangeListenerC6177b.f35777j0)) {
                return;
            }
            viewOnFocusChangeListenerC6177b.f35777j0.setText(stringExtra);
            return;
        }
        if (9 == i9) {
            this.f35778k0.setText("");
            return;
        }
        if (3 != i9) {
            if (-1 == i9) {
                if (100 == i8) {
                    this.f35772e0.nonMemberSuccessLogin();
                    return;
                }
                return;
            } else {
                if (i9 == 0 && 105 == i8 && this.f35772e0.isAutoLogin()) {
                    H.putBoolean(getApplicationContext(), "KEY_AUTO_LOGIN", false);
                    this.f35772e0.setAutoLogin(false);
                    return;
                }
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("USER_AUTHENTICATION"));
            String strOptString = jSONObject.optString("inputFlg");
            if (jSONObject.optString("checkValidPw").equals("Y")) {
                if (u.isEasyLoginType(strOptString)) {
                    executeEasyLogin(strOptString, jSONObject.optString(Constants.ID), "N");
                } else {
                    this.f35778k0.setText(jSONObject.optString("pw"));
                    A0();
                }
            } else if (u.isEasyLoginType(strOptString)) {
                executeEasyLogin(strOptString, jSONObject.optString(Constants.ID), "N");
            } else if (this.f35772e0.isAutoLogin()) {
                z0();
            } else {
                A0();
            }
        } catch (JSONException e8) {
            t.e(e8.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f35772e0 = (G4.b) context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        t.e("onclick");
        int id = view.getId();
        if (AbstractC5955f.tv_login_find_id == id) {
            Intent intent = new Intent(getActivity(), (Class<?>) IntegrationWebViewActivity.class);
            intent.putExtra("WEB_POST_URL", g.FIND_MEMBER_ID_URL);
            startActivityForResult(intent, 101);
            return;
        }
        if (AbstractC5955f.tv_login_find_pw == id) {
            Intent intent2 = new Intent(getActivity(), (Class<?>) IntegrationWebViewActivity.class);
            intent2.putExtra("WEB_POST_URL", g.FIND_MEMBER_PW_URL);
            intent2.putExtra("WEB_POST_PARAMETER", "&memberId=" + s0(this.f35777j0));
            startActivityForResult(intent2, 102);
            return;
        }
        if (AbstractC5955f.btn_login_non_register == id) {
            Intent intent3 = new Intent(getActivity(), (Class<?>) NonMemberRegisterActivity.class);
            intent3.putExtra("IS_RESERVATION_DAO", this.f35774g0);
            startActivityForResult(intent3, 100);
            return;
        }
        if (AbstractC5955f.tv_login_register == id) {
            Intent intent4 = new Intent(getActivity(), (Class<?>) IntegrationWebViewActivity.class);
            intent4.putExtra("WEB_POST_URL", g.SIGN_UP_URL);
            startActivityForResult(intent4, Map.MapException.CALLED_INTERFACE_FIELD_NUMBER);
            return;
        }
        if (AbstractC5955f.btn_login == id) {
            C0();
            return;
        }
        if (AbstractC5955f.iv_kakao_login == id) {
            this.f35772e0.moveToKakaoLogin();
            return;
        }
        if (AbstractC5955f.iv_naver_login == id) {
            this.f35772e0.moveToNaverLogin();
        } else if (AbstractC5955f.iv_google_login == id) {
            this.f35772e0.moveToGoogleLogin();
        } else if (AbstractC5955f.iv_onepass_login == id) {
            this.f35772e0.moveToOnepassLogin();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.fragment_login, viewGroup, false);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
        boolean zF0 = F0();
        if (6 == i8 && zF0) {
            C0();
        }
        return !zF0;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z8) {
        if (z8) {
            this.f35775h0 = view;
        }
    }

    @Override // com.korail.talk.view.base.a, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_login == id || AbstractC5955f.dao_auto_login == id || AbstractC5955f.dao_easy_login == id) {
            LoginDao.LoginRequest loginRequest = (LoginDao.LoginRequest) iBaseDao.getRequest();
            LoginDao.LoginResponse loginResponse = (LoginDao.LoginResponse) iBaseDao.getResponse();
            String str = loginResponse.gethMsgCd();
            String strRedirectUrl = loginResponse.getStrRedirectUrl();
            if (!u.isLoginSuccess(str)) {
                if (N.isNotNull(strRedirectUrl)) {
                    G0(strRedirectUrl, u.getLoginAuthenticationPostData((LoginDao) iBaseDao));
                    return;
                }
                return;
            }
            H.putString(getApplicationContext(), "KEY_LOGIN_TYPE", loginRequest.getLoginType());
            H.putBoolean(getApplicationContext(), "KEY_MEMBER_NUM", (AbstractC5955f.dao_login == iBaseDao.getId() || AbstractC5955f.dao_auto_login == iBaseDao.getId()) && this.f35779l0.isChecked());
            if (AbstractC5955f.dao_login == iBaseDao.getId()) {
                H.putBoolean(getApplicationContext(), "KEY_AUTO_LOGIN", this.f35780m0.isChecked());
                H.putString(getApplicationContext(), "KEY_LOGIN_ID", C5908a.encryptAES(getApplicationContext(), s0(this.f35777j0)));
                H.putString(getApplicationContext(), "KEY_LOGIN_PW", C5908a.encryptAES(getApplicationContext(), s0(this.f35778k0)));
            } else if (AbstractC5955f.dao_auto_login == iBaseDao.getId()) {
                H.putBoolean(getApplicationContext(), "KEY_AUTO_LOGIN", true);
                H.putString(getApplicationContext(), "KEY_LOGIN_ID", C5908a.encryptAES(getApplicationContext(), s0(this.f35777j0)));
            } else if (AbstractC5955f.dao_easy_login == iBaseDao.getId()) {
                H.putBoolean(getApplicationContext(), "KEY_AUTO_LOGIN", this.f35780m0.isChecked());
                H.putString(getApplicationContext(), "KEY_LOGIN_ID", C5908a.encryptAES(getApplicationContext(), loginRequest.getCustId()));
            }
            H.putString(getApplicationContext(), "KEY_LOGIN_CUST_NO", C5908a.encryptAES(getApplicationContext(), loginResponse.getStrCustNo()));
            ArrayList<LoginPopUpData> loginSuccessPopupData = u.getLoginSuccessPopupData(getApplicationContext(), loginResponse, true);
            if (!loginSuccessPopupData.isEmpty()) {
                Intent intent = new Intent();
                intent.putExtra("POPUP_DATA", loginSuccessPopupData);
                this.f35772e0.successLoginWidthPopup(intent);
            } else if (!"Y".equals(loginResponse.getCoupClsFlg())) {
                if ("IRZ000001".equals(str)) {
                    this.f35772e0.successLogin();
                }
            } else {
                Intent intent2 = new Intent();
                intent2.putExtra("POPUP_COUPON", loginResponse.getCoupClsFlg());
                intent2.putExtra("POPUP_COUPON_NAME", loginResponse.getStrCustNm());
                this.f35772e0.successLoginWidthPopup(intent2);
            }
        }
    }

    public void onTabSelected() {
        if (C6630d.isNotNull(this.f35775h0)) {
            this.f35775h0.requestFocus();
        }
    }

    /* renamed from: r5.b$a */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ViewOnFocusChangeListenerC6177b.this.f35782o0.setEnabled(ViewOnFocusChangeListenerC6177b.this.F0());
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            int length = charSequence.length();
            ViewOnFocusChangeListenerC6177b viewOnFocusChangeListenerC6177b = ViewOnFocusChangeListenerC6177b.this;
            if (length == viewOnFocusChangeListenerC6177b.f35771d0) {
                viewOnFocusChangeListenerC6177b.f35778k0.requestFocus();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }
}
