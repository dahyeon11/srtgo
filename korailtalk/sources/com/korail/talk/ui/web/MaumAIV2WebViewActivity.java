package com.korail.talk.ui.web;

import a5.e;
import android.os.Bundle;
import android.widget.Toast;
import androidx.core.app.AbstractC0918b;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.z;

/* loaded from: classes.dex */
public class MaumAIV2WebViewActivity extends BaseViewActivity {
    public static String[] PERMISSIONS_ALL = {"android.permission.RECORD_AUDIO", "android.permission.CALL_PHONE", "android.permission.READ_PHONE_STATE"};

    /* renamed from: i, reason: collision with root package name */
    private final List f29276i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private b f29277j;

    class a implements b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f29278a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f29279b;

        a(Bundle bundle, int i8) {
            this.f29278a = bundle;
            this.f29279b = i8;
        }

        @Override // com.korail.talk.ui.web.MaumAIV2WebViewActivity.b
        public void onDeniedPermission() {
            Toast.makeText(MaumAIV2WebViewActivity.this.getApplicationContext(), MaumAIV2WebViewActivity.this.getString(AbstractC5959j.permission_toast_check_content), 0).show();
            MaumAIV2WebViewActivity.this.finish();
        }

        @Override // com.korail.talk.ui.web.MaumAIV2WebViewActivity.b
        public void onGrantedPermission() {
            if (this.f29278a == null) {
                MaumAIV2WebViewActivity.this.getSupportFragmentManager().beginTransaction().replace(AbstractC5955f.fragment_container, e.newInstance(this.f29279b)).commit();
            }
        }
    }

    public interface b {
        void onDeniedPermission();

        void onGrantedPermission();
    }

    public void initTitle(String str) {
        setAppTitle(str);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_maum_aiv2_web_view);
        getWindow().addFlags(128);
        findViewById(AbstractC5955f.backBtn).setVisibility(0);
        findViewById(AbstractC5955f.backBtn).setAccessibilityTraversalAfter(AbstractC5955f.titleTxt);
        findViewById(AbstractC5955f.menuBtn).setVisibility(8);
        int intExtra = getIntent().getIntExtra("kind", 0);
        if (!z.isNetworkAvailable(this)) {
            Toast.makeText(getApplicationContext(), getString(AbstractC5959j.network_check_network_state), 0).show();
            finish();
        }
        if (intExtra == 1) {
            if (C6630d.isNull(bundle)) {
                m0();
            }
            s0(PERMISSIONS_ALL, new a(bundle, intExtra));
        } else {
            if (C6630d.isNull(bundle)) {
                m0();
            }
            if (bundle == null) {
                getSupportFragmentManager().beginTransaction().replace(AbstractC5955f.fragment_container, e.newInstance(intExtra)).commit();
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) {
        if (i8 == 104) {
            if (t0(iArr)) {
                this.f29277j.onGrantedPermission();
                return;
            } else {
                this.f29277j.onDeniedPermission();
                return;
            }
        }
        if (i8 != 105) {
            super.onRequestPermissionsResult(i8, strArr, iArr);
        } else if (t0(iArr)) {
            this.f29277j.onGrantedPermission();
        } else {
            this.f29277j.onDeniedPermission();
        }
    }

    protected void s0(String[] strArr, b bVar) {
        if (!this.f29276i.isEmpty()) {
            List list = this.f29276i;
            list.removeAll(list);
        }
        this.f29277j = bVar;
        for (String str : strArr) {
            if (androidx.core.content.e.checkSelfPermission(this, str) != 0) {
                this.f29276i.add(str);
            }
        }
        List list2 = this.f29276i;
        String[] strArr2 = (String[]) list2.toArray(new String[list2.size()]);
        if (strArr2.length == 0) {
            this.f29277j.onGrantedPermission();
        } else {
            AbstractC0918b.requestPermissions(this, strArr2, 105);
        }
    }

    protected boolean t0(int[] iArr) {
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
}
