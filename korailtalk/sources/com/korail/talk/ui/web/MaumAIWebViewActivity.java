package com.korail.talk.ui.web;

import ai.maum.m2u.cdk.CdkNative;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.core.app.AbstractC0918b;
import androidx.core.content.e;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.ui.web.BaseWebViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.C6637k;
import z4.t;

/* loaded from: classes.dex */
public class MaumAIWebViewActivity extends BaseWebViewActivity {

    /* renamed from: A, reason: collision with root package name */
    private c f29282A;

    /* renamed from: u, reason: collision with root package name */
    String f29284u;

    /* renamed from: v, reason: collision with root package name */
    private CdkNative f29285v;

    /* renamed from: x, reason: collision with root package name */
    protected Context f29287x;

    /* renamed from: y, reason: collision with root package name */
    protected String f29288y;
    public static String[] PERMISSIONS_ALL = {"android.permission.RECORD_AUDIO", "android.permission.MODIFY_AUDIO_SETTINGS"};
    public static String[] PERMISSIONS_RECORD_AUDIO = {"android.permission.RECORD_AUDIO", "android.permission.MODIFY_AUDIO_SETTINGS"};

    /* renamed from: B, reason: collision with root package name */
    private static final String[] f29281B = new String[0];

    /* renamed from: t, reason: collision with root package name */
    boolean f29283t = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f29286w = false;

    /* renamed from: z, reason: collision with root package name */
    private final List f29289z = new ArrayList();

    class a implements c {
        a() {
        }

        @Override // com.korail.talk.ui.web.MaumAIWebViewActivity.c
        public void onDeniedPermission() {
        }

        @Override // com.korail.talk.ui.web.MaumAIWebViewActivity.c
        public void onGrantedPermission() {
            MaumAIWebViewActivity.this.M0();
            MaumAIWebViewActivity maumAIWebViewActivity = MaumAIWebViewActivity.this;
            maumAIWebViewActivity.f29284u = maumAIWebViewActivity.f29258q.toString();
        }
    }

    private class b extends BaseWebViewActivity.e {
        private b() {
            super();
        }

        @Override // com.korail.talk.ui.web.BaseWebViewActivity.e, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            t.e("onPageFinished url: " + str);
            t.e("onPageFinished mWebViewLoadFinished: " + MaumAIWebViewActivity.this.f29286w);
            if (MaumAIWebViewActivity.this.f29286w) {
                return;
            }
            MaumAIWebViewActivity.this.f29286w = true;
            MaumAIWebViewActivity.this.f29285v.resume();
        }

        @Override // com.korail.talk.ui.web.BaseWebViewActivity.e, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            boolean zShouldOverrideUrlLoading = super.shouldOverrideUrlLoading(webView, str);
            t.e("url = " + str);
            t.e("isShouldOverrideUrlLoading : " + zShouldOverrideUrlLoading);
            return zShouldOverrideUrlLoading;
        }

        /* synthetic */ b(MaumAIWebViewActivity maumAIWebViewActivity, a aVar) {
            this();
        }
    }

    interface c {
        void onDeniedPermission();

        void onGrantedPermission();
    }

    private void V0() {
        this.f29287x = this;
        this.f29288y = getPackageName();
    }

    private void X0() {
        String stringExtra = getIntent().getStringExtra("MAAS_INFO");
        String stringExtra2 = getIntent().getStringExtra("MAAS_POPUP_IMAGE");
        if (stringExtra2 != null) {
            C6637k.getCImageDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(stringExtra2).showDialog();
        } else if (stringExtra != null) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(stringExtra).showDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z0() {
        this.f29283t = false;
    }

    private void a1() {
        boolean booleanExtra = getIntent().getBooleanExtra("IS_SCREEN_FULL", false);
        findViewById(AbstractC5955f.titleAppBar).setVisibility(booleanExtra ? 8 : 0);
        if (booleanExtra) {
            setDrawerLockMode(1);
        } else if (this.f29252k) {
            l0();
        } else {
            n0(false);
        }
    }

    private void b1() {
        P0(new BaseWebViewActivity.c(), false);
        Q0(new b(this, null));
        O0(new BaseWebViewActivity.d());
    }

    protected void W0(String[] strArr, c cVar) {
        if (!this.f29289z.isEmpty()) {
            List list = this.f29289z;
            list.removeAll(list);
        }
        this.f29282A = cVar;
        for (String str : strArr) {
            if (e.checkSelfPermission(this.f29287x, str) != 0) {
                this.f29289z.add(str);
            }
        }
        List list2 = this.f29289z;
        String[] strArr2 = (String[]) list2.toArray(new String[list2.size()]);
        if (strArr2.length == 0) {
            this.f29282A.onGrantedPermission();
        } else {
            AbstractC0918b.requestPermissions((androidx.appcompat.app.e) this.f29287x, strArr2, 105);
        }
    }

    protected boolean Y0(String str) {
        return e.checkSelfPermission(this.f29287x, str) == 0;
    }

    protected boolean c1(int[] iArr) {
        if (iArr.length < 1) {
            return false;
        }
        for (int i8 : iArr) {
            if (i8 != 0) {
                return false;
            }
        }
        return true;
    }

    public void checkRecordAudioPermission() {
        if (Y0("android.permission.RECORD_AUDIO")) {
            this.f29282A.onGrantedPermission();
        } else if (shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
            AbstractC0918b.requestPermissions((androidx.appcompat.app.e) this.f29287x, PERMISSIONS_RECORD_AUDIO, 104);
        } else {
            AbstractC0918b.requestPermissions((androidx.appcompat.app.e) this.f29287x, PERMISSIONS_RECORD_AUDIO, 104);
        }
    }

    public void isAppFinish() {
        if (this.f29283t) {
            AbstractC0918b.finishAffinity(this);
            return;
        }
        this.f29283t = true;
        Toast.makeText(getApplicationContext(), getString(AbstractC5959j.msg_toast_quit), 0).show();
        new Handler().postDelayed(new Runnable() { // from class: m6.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f34120a.Z0();
            }
        }, 2000L);
    }

    @Override // com.korail.talk.ui.web.BaseWebViewActivity, com.korail.talk.view.base.BaseViewActivity, com.korail.talk.view.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.korail.talk.ui.web.BaseWebViewActivity, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_integration_webview);
        if (C6630d.isNull(bundle)) {
            V0();
            X0();
            a1();
            b1();
        }
        this.f29285v = new CdkNative(K(), this.f29256o, this.f29284u);
    }

    @Override // com.korail.talk.ui.web.BaseWebViewActivity, com.korail.talk.view.base.BaseActivity, androidx.appcompat.app.e, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onDestroy() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onDestroy();
        try {
            this.f29285v.close();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onPause() throws IllegalStateException, InterruptedException {
        super.onPause();
        this.f29285v.pause();
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        t.d("onReceive dao: " + iBaseDao.getClass().getName());
        super.onReceive(iBaseDao);
    }

    @Override // androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) {
        if (i8 == 104) {
            if (c1(iArr)) {
                this.f29282A.onGrantedPermission();
                return;
            } else {
                this.f29282A.onDeniedPermission();
                return;
            }
        }
        if (i8 != 105) {
            super.onRequestPermissionsResult(i8, strArr, iArr);
        } else if (c1(iArr)) {
            this.f29282A.onGrantedPermission();
        } else {
            this.f29282A.onDeniedPermission();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.f29286w) {
            this.f29285v.resume();
        } else {
            W0(PERMISSIONS_ALL, new a());
        }
    }
}
