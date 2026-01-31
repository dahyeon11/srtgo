package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.ActivityC1010e;
import androidx.loader.app.a;
import b2.InterfaceC1072a;
import c2.f;
import c2.s;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import g2.AbstractC5544f;
import l0.C5880b;
import w2.AbstractC6461a;

@KeepName
/* loaded from: classes.dex */
public class SignInHubActivity extends ActivityC1010e {

    /* renamed from: f, reason: collision with root package name */
    private static boolean f11838f = false;

    /* renamed from: a, reason: collision with root package name */
    private boolean f11839a = false;

    /* renamed from: b, reason: collision with root package name */
    private SignInConfiguration f11840b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11841c;

    /* renamed from: d, reason: collision with root package name */
    private int f11842d;

    /* renamed from: e, reason: collision with root package name */
    private Intent f11843e;

    private final void t(int i8) {
        Status status = new Status(i8);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f11838f = false;
    }

    private final void v() {
        getSupportLoaderManager().initLoader(0, null, new a());
        f11838f = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        if (this.f11839a) {
            return;
        }
        setResult(0);
        if (i8 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra(InterfaceC1072a.EXTRA_SIGN_IN_ACCOUNT);
            if (signInAccount != null && signInAccount.getGoogleSignInAccount() != null) {
                GoogleSignInAccount googleSignInAccount = signInAccount.getGoogleSignInAccount();
                s.zzd(this).zzc(this.f11840b.zzu(), (GoogleSignInAccount) AbstractC6461a.checkNotNull(googleSignInAccount));
                intent.removeExtra(InterfaceC1072a.EXTRA_SIGN_IN_ACCOUNT);
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f11841c = true;
                this.f11842d = i9;
                this.f11843e = intent;
                v();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                t(intExtra);
                return;
            }
        }
        t(8);
    }

    @Override // androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String str = (String) AbstractC6461a.checkNotNull(intent.getAction());
        if ("com.google.android.gms.auth.NO_IMPL".equals(str)) {
            t(12500);
            return;
        }
        if (!str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !str.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            String strValueOf = String.valueOf(intent.getAction());
            Log.e("AuthSignInClient", strValueOf.length() != 0 ? "Unknown action: ".concat(strValueOf) : new String("Unknown action: "));
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) ((Bundle) AbstractC6461a.checkNotNull(intent.getBundleExtra("config"))).getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f11840b = signInConfiguration;
        if (bundle != null) {
            boolean z8 = bundle.getBoolean("signingInGoogleApiClients");
            this.f11841c = z8;
            if (z8) {
                this.f11842d = bundle.getInt("signInResultCode");
                this.f11843e = (Intent) AbstractC6461a.checkNotNull((Intent) bundle.getParcelable("signInResultData"));
                v();
                return;
            }
            return;
        }
        if (f11838f) {
            setResult(0);
            t(12502);
            return;
        }
        f11838f = true;
        Intent intent2 = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent2.setPackage("com.google.android.gms");
        } else {
            intent2.setPackage(getPackageName());
        }
        intent2.putExtra("config", this.f11840b);
        try {
            startActivityForResult(intent2, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f11839a = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            t(17);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f11841c);
        if (this.f11841c) {
            bundle.putInt("signInResultCode", this.f11842d);
            bundle.putParcelable("signInResultData", this.f11843e);
        }
    }

    private class a implements a.InterfaceC0156a {
        private a() {
        }

        @Override // androidx.loader.app.a.InterfaceC0156a
        public final C5880b onCreateLoader(int i8, Bundle bundle) {
            return new f(SignInHubActivity.this, AbstractC5544f.getAllClients());
        }

        @Override // androidx.loader.app.a.InterfaceC0156a
        public final /* synthetic */ void onLoadFinished(C5880b c5880b, Object obj) {
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.f11842d, SignInHubActivity.this.f11843e);
            SignInHubActivity.this.finish();
        }

        @Override // androidx.loader.app.a.InterfaceC0156a
        public final void onLoaderReset(C5880b c5880b) {
        }
    }
}
