package com.korail.talk.view.base;

import I4.h;
import Q7.X;
import android.R;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.e;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0;
import androidx.core.view.C0950d1;
import androidx.core.view.H1;
import androidx.core.view.W;
import androidx.core.view.accessibility.AbstractC0927b;
import androidx.fragment.app.Fragment;
import com.korail.talk.network.BaseDaoHelper;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.IBase;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.IBaseResult;
import com.korail.talk.network.dao.certification.ReservationDao;
import com.korail.talk.network.dao.common.CommonCodeDao;
import com.korail.talk.network.dao.login.AutoLoginDao;
import com.korail.talk.network.dao.login.LoginDao;
import com.korail.talk.network.dao.myTicket.TicketListDao;
import com.korail.talk.network.dao.push.PushUpdateDao;
import com.korail.talk.network.dao.push.PushUpdateDao.PushUpdateRequest;
import com.korail.talk.network.request.reservation.ReservationRequest;
import com.korail.talk.ui.booking.mainBooking.MainBookingActivity;
import com.korail.talk.ui.intro.IntroActivity;
import com.korail.talk.ui.menu.DiscountCouponActivity;
import com.korail.talk.ui.payment.PaymentActivity;
import com.korail.talk.ui.ticket.confirm.TicketListActivity;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import com.korail.talk.view.base.BaseActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m4.C5908a;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import n6.j;
import r4.g;
import s4.C6219c;
import y4.C6536a;
import y4.C6537b;
import y4.C6538c;
import y4.C6539d;
import z4.C6625A;
import z4.C6630d;
import z4.C6637k;
import z4.C6638l;
import z4.C6640n;
import z4.C6641o;
import z4.G;
import z4.H;
import z4.N;
import z4.P;
import z4.q;
import z4.t;
import z4.u;

/* loaded from: classes.dex */
public class BaseActivity extends e implements j, IBase, IBaseResult {

    /* renamed from: a */
    private BaseDaoHelper f29342a;

    /* renamed from: b */
    protected IBaseDao f29343b;

    /* renamed from: c */
    private C6640n f29344c;

    /* renamed from: d */
    private d f29345d;

    class a extends ClickableSpan {
        a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Intent intent = new Intent(BaseActivity.this.getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
            intent.putExtra("WEB_POST_URL", g.LIMOUSINE_COMMISSION_URL);
            intent.putExtra("IS_CLOSE_VIEW", true);
            BaseActivity.this.startActivity(intent);
        }
    }

    class b extends ClickableSpan {
        b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Intent intent = new Intent(BaseActivity.this.getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
            intent.putExtra("WEB_POST_URL", g.COMMISSION_URL);
            intent.putExtra("IS_CLOSE_VIEW", true);
            BaseActivity.this.startActivity(intent);
        }
    }

    class c implements DialogInterface.OnClickListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i8) {
            dialogInterface.dismiss();
            Intent intent = new Intent(BaseActivity.this.getApplicationContext(), (Class<?>) MainBookingActivity.class);
            intent.addFlags(AbstractC0927b.TYPE_VIEW_TARGETED_BY_SCROLL);
            BaseActivity.this.startActivity(intent);
            BaseActivity.this.finish();
        }
    }

    public interface d {
        void onPhysicalDisabilityLoginSuccess();
    }

    private void D() {
        clearBackStackFragment();
        Intent intent = new Intent(getApplicationContext(), (Class<?>) MainBookingActivity.class);
        intent.addFlags(603979776);
        startActivity(intent);
    }

    private void J() {
        PushUpdateDao pushUpdateDao = new PushUpdateDao();
        PushUpdateDao.PushUpdateRequest pushUpdateRequest = pushUpdateDao.new PushUpdateRequest();
        pushUpdateRequest.setJob_dv_cd("R");
        pushUpdateDao.setRequest(pushUpdateRequest);
        pushUpdateDao.setPending(false);
        executeDao(pushUpdateDao);
    }

    private String L(String str) {
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

    public /* synthetic */ void P(DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            startActivity(new Intent(getApplicationContext(), (Class<?>) DiscountCouponActivity.class));
        }
    }

    public static /* synthetic */ C0950d1 Q(View view, C0950d1 c0950d1) {
        androidx.core.graphics.b insets = c0950d1.getInsets(C0950d1.m.systemBars());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return c0950d1;
    }

    public /* synthetic */ void R(DialogInterface dialogInterface, int i8, boolean z8) {
        G.moveToGooglePlay(K(), getPackageName());
    }

    public /* synthetic */ void S() {
        I4.g.getInstance().bindService(getApplicationContext());
    }

    public /* synthetic */ void T() {
        I4.g.getInstance().bindService(getApplicationContext());
    }

    public /* synthetic */ void U(boolean z8, DialogInterface dialogInterface, int i8) {
        if (z8) {
            finish();
        }
    }

    public /* synthetic */ void V(DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            Intent intent = new Intent(getApplicationContext(), (Class<?>) TicketListActivity.class);
            intent.putExtra("IS_OFFLINE", true);
            startActivity(intent);
        }
        finish();
    }

    public /* synthetic */ void W(DialogInterface dialogInterface, int i8) {
        C6641o.navigation(getApplicationContext(), MainBookingActivity.class);
    }

    private void X(IBaseDao iBaseDao) {
        IBase base = iBaseDao.getBase();
        int id = iBaseDao.getId();
        if (id == AbstractC5955f.dao_auto_login) {
            LoginDao.LoginResponse loginResponse = (LoginDao.LoginResponse) ((LoginDao) iBaseDao).getResponse();
            if (!u.isLoginSuccess(loginResponse.gethMsgCd())) {
                I4.g.getInstance().logoutSmartAgent();
                if (N.isNull(loginResponse.getStrRedirectUrl())) {
                    h.getInstance().initLoginData(getApplicationContext());
                }
                Toast.makeText(getApplicationContext(), getString(AbstractC5959j.auto_login_fail_message), 1).show();
                return;
            }
            if (base instanceof BaseActivity) {
                ((BaseActivity) base).onLoginSuccess();
            } else if (base instanceof com.korail.talk.view.base.a) {
                ((com.korail.talk.view.base.a) base).onLoginSuccess();
            }
            if (!(this instanceof IntroActivity)) {
                C6637k.showLoginDialog(K(), u.getLoginSuccessPopupData(getApplicationContext(), loginResponse, false));
            }
            u.setLoginData(loginResponse);
            String strCustNo = loginResponse.getStrCustNo();
            new Handler().postDelayed(new Runnable() { // from class: n6.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34269a.S();
                }
            }, 1000L);
            if (!N.isNotNull(strCustNo) || strCustNo.equals(H.getString(getApplicationContext(), "is_exist_push_data"))) {
                return;
            }
            t.d("푸시 DB 기본값 생성 요청 - " + strCustNo);
            H.putString(getApplicationContext(), "is_exist_push_data", strCustNo);
            J();
            return;
        }
        if (id != AbstractC5955f.dao_login && id != AbstractC5955f.dao_easy_login) {
            if (id == AbstractC5955f.dao_logout) {
                I4.g.getInstance().logoutSmartAgent();
                h.getInstance().initLoginData(getApplicationContext());
                C6641o.navigation(getApplicationContext());
                if (getClass().getName().equals(MainBookingActivity.class.getName())) {
                    ((MainBookingActivity) this).onLogoutSuccess();
                    return;
                }
                return;
            }
            return;
        }
        LoginDao.LoginResponse loginResponse2 = (LoginDao.LoginResponse) iBaseDao.getResponse();
        if (!u.isLoginSuccess(loginResponse2.gethMsgCd())) {
            if (N.isNull(loginResponse2.getStrRedirectUrl())) {
                String str = loginResponse2.gethMsgTxt();
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(N.isNull(str) ? getString(AbstractC5959j.failed_to_login) : str.replaceAll("<br>", X.LF)).showDialog();
                return;
            }
            return;
        }
        H.putBoolean(getApplicationContext(), "CONVENIENCE_SETTING_UPDATE", true);
        u.setLoginData(loginResponse2);
        String strCustNo2 = loginResponse2.getStrCustNo();
        new Handler().postDelayed(new Runnable() { // from class: n6.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f34270a.T();
            }
        }, 1000L);
        if (!N.isNotNull(strCustNo2) || strCustNo2.equals(H.getString(getApplicationContext(), "is_exist_push_data"))) {
            return;
        }
        t.d("푸시 DB 기본값 생성 요청 - " + strCustNo2);
        H.putString(getApplicationContext(), "is_exist_push_data", strCustNo2);
        J();
    }

    private void Y(IBaseDao iBaseDao, C6536a c6536a) {
        if (c6536a instanceof C6537b) {
            e0(c6536a);
            return;
        }
        if (c6536a instanceof C6539d) {
            if (this instanceof PaymentActivity) {
                f0();
            } else {
                this.f29343b = iBaseDao;
            }
            F(iBaseDao);
            return;
        }
        if (!(c6536a instanceof C6538c)) {
            b0(iBaseDao, c6536a);
            return;
        }
        I4.g.getInstance().logoutSmartAgent();
        h.getInstance().initLoginData(getApplicationContext());
        if (this instanceof PaymentActivity) {
            f0();
        } else {
            this.f29343b = iBaseDao;
            d0(iBaseDao);
        }
    }

    private void b0(IBaseDao iBaseDao, C6536a c6536a) {
        if (iBaseDao.isNotShowDialog()) {
            return;
        }
        List<String> errorMsgCdNotShowDialog = iBaseDao.getErrorMsgCdNotShowDialog();
        String str = iBaseDao.getResponse().gethMsgCd();
        Iterator<String> it = errorMsgCdNotShowDialog.iterator();
        while (it.hasNext()) {
            if (it.next().equals(str)) {
                return;
            }
        }
        final boolean zIsFinishView = iBaseDao.isFinishView();
        C6637k.getCDialog(K(), 1001, this instanceof PaymentActivity ? 1 : 0, getString(AbstractC5959j.dialog_title)).setContent(c6536a.getMessage()).setButtonListener(new DialogInterface.OnClickListener() { // from class: n6.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f34267a.U(zIsFinishView, dialogInterface, i8);
            }
        }).showDialog();
    }

    private void d0(IBaseDao iBaseDao) {
        IBase base = iBaseDao.getBase();
        if (iBaseDao instanceof ReservationDao) {
            C6641o.moveToLogin(base, !((ReservationRequest) ((ReservationDao) iBaseDao).getRequest()).isNonmemberNotEnable(), true);
        } else if (iBaseDao instanceof TicketListDao) {
            C6641o.moveToLogin(base, true);
        } else {
            C6641o.moveToLogin(base);
        }
    }

    private void e0(C6536a c6536a) {
        C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(c6536a.getMessage()).setButtonListener(new DialogInterface.OnClickListener() { // from class: n6.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f34265a.V(dialogInterface, i8);
            }
        }).showDialog();
    }

    private void f0() {
        C6637k.getCDialog(K(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.dialog_session_expire_msg)).setButtonListener(new DialogInterface.OnClickListener() { // from class: n6.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f34266a.W(dialogInterface, i8);
            }
        }).showDialog();
    }

    public void E() {
        H("N");
    }

    protected void F(IBaseDao iBaseDao) {
        G(iBaseDao, "N");
    }

    protected void G(IBaseDao iBaseDao, String str) {
        String string = H.getString(getApplicationContext(), "KEY_LOGIN_TYPE");
        String strDecryptAES = C5908a.decryptAES(getApplicationContext(), H.getString(getApplicationContext(), "KEY_LOGIN_ID"));
        AutoLoginDao autoLoginDao = new AutoLoginDao();
        LoginDao.LoginRequest loginRequest = new LoginDao.LoginRequest();
        loginRequest.setLoginType(string);
        loginRequest.setCheckValidPw(str);
        if (u.isEasyLoginType(string)) {
            loginRequest.setCustId(strDecryptAES);
        } else {
            CommonCodeDao.Login login = (CommonCodeDao.Login) q.fromJson(H.getString(getApplicationContext(), "LOGIN_DATA"), CommonCodeDao.Login.class);
            loginRequest.setLoginId(strDecryptAES);
            loginRequest.setLoginPw(L(C5908a.decryptAES(getApplicationContext(), H.getString(getApplicationContext(), "KEY_LOGIN_PW"))));
            loginRequest.setIdx(login.getIdx());
        }
        autoLoginDao.setRequest(loginRequest);
        executeDao(autoLoginDao, C6630d.isNull(iBaseDao) ? this : iBaseDao.getBase());
    }

    protected void H(String str) {
        G(null, str);
    }

    public void I() {
        H("Y");
    }

    public Activity K() {
        return this;
    }

    protected Object M(Intent intent, String str) {
        return C6625A.getSerializableExtra(intent, str);
    }

    protected String N(TextView textView) {
        return N.getText(textView);
    }

    protected void O(View view) {
        P.hideIME(getApplicationContext(), view);
    }

    protected void Z(DialogInterface.OnClickListener onClickListener) {
        a0(getString(AbstractC5959j.dialog_commission_append_msg), onClickListener);
    }

    protected void a0(String str, DialogInterface.OnClickListener onClickListener) {
        C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.dialog_commission_msg), N.applySpannable(getString(AbstractC5959j.dialog_commission_msg_link), new b()), str).setButtonListener(onClickListener).showDialog();
    }

    @Override // n6.j
    public void addTransaction(int i8, Fragment fragment, String str) {
        this.f29344c.addTransaction(getSupportFragmentManager(), i8, fragment, str);
    }

    @Override // n6.j
    public boolean appBack() {
        return this.f29344c.appBack(getSupportFragmentManager());
    }

    protected void c0(String str, DialogInterface.OnClickListener onClickListener) {
        C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.dialog_commission_msg), N.applySpannable(getString(AbstractC5959j.dialog_commission_msg_link), new a()), str).setButtonListener(onClickListener).showDialog();
    }

    @Override // n6.j
    public void clearBackStackFragment() {
        this.f29344c.clearBackStackFragment(getSupportFragmentManager());
    }

    public void dismissLoading() {
        if (C6630d.isNull(this.f29342a)) {
            return;
        }
        this.f29342a.dismissLoading();
    }

    @Override // com.korail.talk.network.IBase
    public void executeDao(IBaseDao iBaseDao) {
        executeDao(iBaseDao, this);
    }

    @Override // com.korail.talk.network.IBase
    public void executeRetryDao() {
        if (C6630d.isNotNull(this.f29343b)) {
            IBaseDao iBaseDao = this.f29343b;
            executeDao(iBaseDao, iBaseDao.getBase());
            this.f29343b = null;
        }
    }

    @Override // n6.j
    public Fragment getCurrentFragment() {
        return this.f29344c.getCurrentFragment(getSupportFragmentManager());
    }

    @Override // n6.j
    public Fragment getFragment(String str) {
        return this.f29344c.getFragment(getSupportFragmentManager(), str);
    }

    @Override // n6.j
    public String getFragmentTag(int i8) {
        return this.f29344c.getFragmentTag(getSupportFragmentManager(), i8);
    }

    @Override // androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i9 != -1) {
            if (i9 == 0 && i8 == 104) {
                onLoginFail(true);
                return;
            }
            return;
        }
        if (i8 == 104) {
            boolean booleanExtra = intent.getBooleanExtra("IS_DRAWER_LOGIN", false);
            if (intent.getBooleanExtra("IS_NON_MEMBER_LOGIN", false)) {
                onNonMemberLoginSuccess();
            } else if (booleanExtra) {
                onDrawerLoginSuccess();
            } else {
                onLoginSuccess();
            }
            if (intent.hasExtra("POPUP_DATA")) {
                C6637k.showLoginDialog(K(), (ArrayList) M(intent, "POPUP_DATA"));
            }
            if (intent.hasExtra("POPUP_COUPON")) {
                String stringExtra = intent.getStringExtra("POPUP_COUPON");
                String str = intent.getStringExtra("POPUP_COUPON_NAME") + "님이 보유하신 쿠폰이 곧 \u001d만료될 예정입니다. 사용기한이 지나면 쿠폰은 소멸되며, 연장되지 않습니다.";
                if ("Y".equals(stringExtra)) {
                    C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(str).setButtonListener(new DialogInterface.OnClickListener() { // from class: n6.a
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            this.f34263a.P(dialogInterface, i10);
                        }
                    }).setButtonNames(new String[]{"확인", "쿠폰 확인 바로가기"}).showDialog();
                }
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (appBack()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.korail.talk.network.IBase
    public void onCancelDao() {
        if (C6630d.isNotNull(this.f29342a)) {
            this.f29342a.onCancelDao();
        }
    }

    @Override // androidx.appcompat.app.e, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i8 = configuration.orientation;
    }

    @Override // androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        t.v(getClass().getSimpleName() + " savedInstanceState = " + bundle);
        if (Build.VERSION.SDK_INT >= 35) {
            C0.setDecorFitsSystemWindows(getWindow(), false);
            H1 h12 = new H1(getWindow(), getWindow().getDecorView());
            h12.setAppearanceLightStatusBars(true);
            h12.setAppearanceLightNavigationBars(true);
            AbstractC0985p0.setOnApplyWindowInsetsListener(findViewById(R.id.content), new W() { // from class: n6.b
                @Override // androidx.core.view.W
                public final C0950d1 onApplyWindowInsets(View view, C0950d1 c0950d1) {
                    return BaseActivity.Q(view, c0950d1);
                }
            });
        }
        this.f29342a = new BaseDaoHelper(this);
        this.f29344c = new C6640n();
        if (C6630d.isNull(bundle)) {
            return;
        }
        if (!(this instanceof IntroActivity)) {
            D();
        }
        if (this instanceof MainBookingActivity) {
            startActivity(new Intent(getApplicationContext(), (Class<?>) IntroActivity.class));
            finish();
        }
    }

    @Override // androidx.appcompat.app.e, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onDestroy() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onDestroy();
        t.v(getClass().getSimpleName());
        if (!C6630d.isNull(this.f29342a)) {
            this.f29342a.onDestroy();
        }
        this.f29344c = null;
    }

    public void onDrawerLoginSuccess() {
        t.e(getClass().getSimpleName());
        physicalDisabilityCheck();
    }

    @Override // com.korail.talk.network.IBaseResult
    public void onIntegrationResult(IBaseDao iBaseDao, C6536a c6536a) {
        C6536a c6536a2;
        IBase base = iBaseDao.getBase();
        String macroShowDialog = iBaseDao.getMacroShowDialog();
        if (C6630d.isNull(c6536a)) {
            BaseResponse response = iBaseDao.getResponse();
            String strResult = response.getStrResult();
            String str = response.gethMsgCd();
            if ((BaseResponse.FAIL.equals(strResult) && (AbstractC5955f.dao_check_service == iBaseDao.getId() || AbstractC5955f.dao_train_calendar == iBaseDao.getId())) || "SEMGTK".equals(response.gethMsgCd())) {
                c6536a2 = new C6537b(response.gethMsgTxt());
            } else if ("P058".equals(response.gethMsgCd())) {
                c6536a2 = H.getBoolean(getApplicationContext(), "KEY_AUTO_LOGIN") ? new C6539d(response.gethMsgTxt()) : new C6538c(response.gethMsgTxt());
            } else {
                if ("SUPDATE".equals(response.gethMsgCd())) {
                    C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(response.gethMsgTxt()).setButtonListener(new C6219c.InterfaceC0421c() { // from class: n6.c
                        @Override // s4.C6219c.InterfaceC0421c
                        public final void onClick(DialogInterface dialogInterface, int i8, boolean z8) {
                            this.f34264a.R(dialogInterface, i8, z8);
                        }
                    }).showDialog();
                } else if ("WRC000288".equals(str) || BaseResponse.FAIL.equals(strResult)) {
                    if (AbstractC5955f.dao_verify_maas_status == iBaseDao.getId() && "S198".equals(str)) {
                        base.onReceiveError(iBaseDao, null);
                        return;
                    } else {
                        String str2 = response.gethMsgTxt();
                        c6536a2 = new C6536a(N.isNull(str2) ? "알수없는 오류가 발생하였습니다." : str2.replaceAll("<br>", X.LF));
                    }
                }
                c6536a = null;
            }
            c6536a = c6536a2;
        } else if (macroShowDialog != null && !macroShowDialog.isEmpty()) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(macroShowDialog).setButtonListener(new c()).showDialog();
            c6536a = null;
        }
        if (isFinishing()) {
            return;
        }
        if (C6630d.isNull(c6536a)) {
            X(iBaseDao);
            base.onReceive(iBaseDao);
            return;
        }
        Y(iBaseDao, c6536a);
        if ((c6536a instanceof C6537b) || (c6536a instanceof C6539d) || (c6536a instanceof C6538c)) {
            return;
        }
        base.onReceiveError(iBaseDao, c6536a);
    }

    public void onLoginFail(boolean z8) {
        t.e(getClass().getSimpleName() + z8);
        if (z8) {
            finish();
        } else {
            this.f29343b = null;
        }
    }

    public void onLoginSuccess() {
        t.e(getClass().getSimpleName());
        executeRetryDao();
        physicalDisabilityCheck();
    }

    public void onNonMemberLoginSuccess() {
        t.e(getClass().getSimpleName());
    }

    @Override // androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    public void onReceive(IBaseDao iBaseDao) {
    }

    @Override // androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onResume() {
        super.onResume();
    }

    public void physicalDisabilityCheck() {
        d dVar;
        if (!h.getInstance().isPhysicalDisability() || (dVar = this.f29345d) == null) {
            return;
        }
        dVar.onPhysicalDisabilityLoginSuccess();
    }

    @Override // n6.j
    public void replaceTransaction(int i8, Fragment fragment, String str) {
        this.f29344c.replaceTransaction(getSupportFragmentManager(), i8, fragment, str);
    }

    public void setAppTitle(int i8) {
        TextView textView = (TextView) findViewById(AbstractC5955f.titleTxt);
        if (C6630d.isNull(textView)) {
            return;
        }
        textView.setText(i8);
    }

    public void setOnPhysicalDisabilityLoginListener(d dVar) {
        this.f29345d = dVar;
    }

    public void showLoading() {
        if (C6630d.isNull(this.f29342a)) {
            return;
        }
        this.f29342a.showLoading();
    }

    public void executeDao(IBaseDao iBaseDao, IBase iBase) {
        if (isFinishing()) {
            return;
        }
        iBaseDao.setBase(iBase);
        iBaseDao.setINetworkResult(this);
        this.f29342a.executeDao(iBaseDao);
    }

    public void showLoading(boolean z8) {
        if (C6630d.isNull(this.f29342a)) {
            return;
        }
        this.f29342a.showLoading(z8);
    }

    public void setAppTitle(String str) {
        TextView textView = (TextView) findViewById(AbstractC5955f.titleTxt);
        if (C6630d.isNull(textView)) {
            return;
        }
        textView.setText(str);
    }

    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
    }
}
