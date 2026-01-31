package com.korail.talk.ui.login.member;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.material.tabs.TabLayout;
import com.korail.talk.network.dao.addService.HelpSrvCustDao;
import com.korail.talk.network.dao.pay.StbkAcntDao;
import com.korail.talk.ui.web.OnepassWebViewActivity;
import com.korail.talk.view.CustomViewPager;
import com.korail.talk.view.base.BaseViewActivity;
import g2.C5540b;
import java.lang.reflect.InvocationTargetException;
import java.security.NoSuchAlgorithmException;
import n4.AbstractC5951b;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import r5.C6176a;
import r5.C6178c;
import r5.C6179d;
import r5.ViewOnFocusChangeListenerC6177b;
import y1.x;
import z4.C6630d;
import z4.C6637k;
import z4.H;
import z4.N;
import z4.t;
import z4.z;

/* loaded from: classes.dex */
public class LoginActivity extends BaseViewActivity implements G4.b, TabLayout.d, G4.a {

    /* renamed from: i */
    private String[] f28151i;

    /* renamed from: j */
    private boolean f28152j;

    /* renamed from: k */
    private boolean f28153k;

    /* renamed from: l */
    private J4.a f28154l;

    /* renamed from: m */
    private J4.b f28155m;

    /* renamed from: n */
    private com.google.android.gms.auth.api.signin.b f28156n;

    /* renamed from: o */
    private TabLayout f28157o;

    /* renamed from: p */
    private CustomViewPager f28158p;

    /* renamed from: q */
    private b f28159q;

    private class b extends r {

        /* renamed from: h */
        private final Fragment[] f28160h;

        /* synthetic */ b(LoginActivity loginActivity, FragmentManager fragmentManager, a aVar) {
            this(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return LoginActivity.this.f28151i.length;
        }

        @Override // androidx.fragment.app.r
        public Fragment getItem(int i8) {
            return this.f28160h[i8];
        }

        @Override // androidx.viewpager.widget.a
        public CharSequence getPageTitle(int i8) {
            return LoginActivity.this.f28151i[i8];
        }

        private b(FragmentManager fragmentManager) {
            super(fragmentManager, 1);
            this.f28160h = new Fragment[]{C6179d.newInstance(LoginActivity.this.getIntent().getExtras()), C6176a.newInstance(LoginActivity.this.getIntent().getExtras()), C6178c.newInstance(LoginActivity.this.getIntent().getExtras())};
        }
    }

    private void setText() {
        setAppTitle(AbstractC5959j.common_login);
    }

    private void t0() {
        boolean z8 = H.getBoolean(getApplicationContext(), "KEY_MEMBER_NUM");
        if (isAutoLogin()) {
            x0();
        } else if (z8) {
            x0();
        }
    }

    private ViewOnFocusChangeListenerC6177b u0() {
        return (ViewOnFocusChangeListenerC6177b) this.f28159q.getItem(this.f28158p.getCurrentItem());
    }

    private void v0() {
        boolean z8 = false;
        this.f28152j = getIntent().getBooleanExtra("IS_DRAWER_LOGIN", false);
        this.f28151i = getResources().getStringArray(AbstractC5952c.login_title);
        if (N.isNotNull(getIntent().getStringExtra("WEB_POST_URL")) && N.isNotNull(getIntent().getStringExtra("WEB_POST_PARAMETER"))) {
            z8 = true;
        }
        this.f28153k = z8;
        J4.a aVar = new J4.a(this);
        this.f28154l = aVar;
        aVar.setListener(this);
        J4.b bVar = new J4.b(this);
        this.f28155m = bVar;
        bVar.setListener(this);
        this.f28156n = com.google.android.gms.auth.api.signin.a.getClient((Activity) this, new GoogleSignInOptions.a(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build());
    }

    private void w0() {
        this.f28157o.addOnTabSelectedListener((TabLayout.d) this);
    }

    private void x0() {
        String string = H.getString(getApplicationContext(), "KEY_LOGIN_TYPE");
        if (string.equals(StbkAcntDao.ACCOUNT_REGISTER)) {
            this.f28157o.getTabAt(0).select();
        } else if (string.equals(StbkAcntDao.CHANGE_PASSWORD)) {
            this.f28157o.getTabAt(1).select();
        } else if (string.equals("2")) {
            this.f28157o.getTabAt(2).select();
        }
    }

    private void y0() throws Resources.NotFoundException {
        l0();
        z0();
    }

    private void z0() throws Resources.NotFoundException {
        this.f28157o = (TabLayout) findViewById(AbstractC5955f.tab_login);
        this.f28158p = (CustomViewPager) findViewById(AbstractC5955f.vp_login);
        b bVar = new b(getSupportFragmentManager());
        this.f28159q = bVar;
        this.f28158p.setAdapter(bVar);
        this.f28158p.setOffscreenPageLimit(this.f28151i.length);
        this.f28158p.setSwipeEnabled(false);
        this.f28157o.setupWithViewPager(this.f28158p);
    }

    @Override // G4.b
    public void cancelLogin() {
        setResult(0);
        finish();
        overridePendingTransition(AbstractC5951b.bottom_view_slide_stay, AbstractC5951b.bottom_view_slide_down);
    }

    @Override // G4.a
    public void easyLoginFail(String str, String str2) {
        C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(str2).showDialog();
    }

    @Override // G4.a
    public void easyLoginSuccess(String str, String str2) {
        u0().executeEasyLogin(str, str2, "Y");
    }

    @Override // G4.a
    public void easyLogoutSuccess(String str) {
    }

    @Override // G4.b
    public Fragment getFragment(int i8) {
        if (C6630d.isNull(this.f28158p)) {
            return null;
        }
        return this.f28159q.getItem(i8);
    }

    @Override // G4.b
    public int getSelectedTabPosition() {
        return this.f28157o.getSelectedTabPosition();
    }

    @Override // G4.b
    public String getTitle(int i8) {
        return this.f28151i[i8];
    }

    @Override // G4.b
    public boolean isAutoLogin() {
        return this.f28153k;
    }

    @Override // G4.b
    public void moveToGoogleLogin() {
        startActivityForResult(this.f28156n.getSignInIntent(), 125);
    }

    @Override // G4.b
    public void moveToKakaoLogin() throws NoSuchAlgorithmException {
        this.f28154l.login();
    }

    @Override // G4.b
    public void moveToNaverLogin() {
        this.f28155m.login();
    }

    @Override // G4.b
    public void moveToOnepassLogin() {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) OnepassWebViewActivity.class);
        intent.putExtra("WEB_GET_URL", z.getWebHost() + "/classes/com.korail.mobile.onepass.login.do");
        startActivityForResult(intent, 128);
    }

    @Override // G4.b
    public void nonMemberSuccessLogin() {
        Intent intent = new Intent();
        intent.putExtra("IS_NON_MEMBER_LOGIN", true);
        setResult(-1, intent);
        finish();
        overridePendingTransition(AbstractC5951b.bottom_view_slide_stay, AbstractC5951b.bottom_view_slide_down);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i8 == 125) {
            try {
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) com.google.android.gms.auth.api.signin.a.getSignedInAccountFromIntent(intent).getResult(C5540b.class);
                t.e("firebaseAuthWithGoogle:" + googleSignInAccount.getId());
                easyLoginSuccess(x.MAX_AD_CONTENT_RATING_G, googleSignInAccount.getId());
                return;
            } catch (C5540b e8) {
                t.e(e8.getMessage());
                return;
            }
        }
        if (i9 == -1 && i8 == 128) {
            String stringExtra = intent.getStringExtra("userKey");
            t.e("userKey :" + stringExtra);
            if (N.isNotNull(stringExtra)) {
                easyLoginSuccess(HelpSrvCustDao.HelpSrvCustRequest.f27549D, intent.getStringExtra("userKey"));
            } else {
                Toast.makeText(getApplicationContext(), "디지털 원패스 로그인 실패(userKey 없음)", 1).show();
            }
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, com.korail.talk.view.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        cancelLogin();
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        O(view);
        super.onClick(view);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_login);
        if (C6630d.isNull(bundle)) {
            v0();
            y0();
            setText();
            w0();
            t0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.appcompat.app.e, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onDestroy() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onDestroy();
        if (C6630d.isNotNull(this.f28154l)) {
            this.f28154l = null;
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.d, com.google.android.material.tabs.TabLayout.c
    public void onTabReselected(TabLayout.g gVar) {
    }

    @Override // com.google.android.material.tabs.TabLayout.d, com.google.android.material.tabs.TabLayout.c
    public void onTabSelected(TabLayout.g gVar) {
        ((ViewOnFocusChangeListenerC6177b) this.f28159q.getItem(gVar.getPosition())).onTabSelected();
    }

    @Override // com.google.android.material.tabs.TabLayout.d, com.google.android.material.tabs.TabLayout.c
    public void onTabUnselected(TabLayout.g gVar) {
    }

    @Override // G4.b
    public void setAutoLogin(boolean z8) {
        this.f28153k = z8;
    }

    @Override // G4.b
    public void setTabPosition(int i8) {
        this.f28157o.getTabAt(i8).select();
    }

    @Override // G4.b
    public void successLogin() {
        Intent intent = new Intent();
        intent.putExtra("IS_DRAWER_LOGIN", this.f28152j);
        setResult(-1, intent);
        finish();
        overridePendingTransition(AbstractC5951b.bottom_view_slide_stay, AbstractC5951b.bottom_view_slide_down);
    }

    @Override // G4.b
    public void successLoginWidthPopup(Intent intent) {
        setResult(-1, intent);
        finish();
        overridePendingTransition(AbstractC5951b.bottom_view_slide_stay, AbstractC5951b.bottom_view_slide_down);
    }
}
