package com.google.android.gms.ads;

import H1.C0591z;
import H1.O0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.google.android.gms.internal.ads.BinderC1686Nn;
import r2.b;
import y1.u;
import y1.v;

/* loaded from: classes.dex */
public final class OutOfContextTestingActivity extends Activity {
    public static final String AD_UNIT_KEY = "adUnit";
    public static final String CLASS_NAME = "com.google.android.gms.ads.OutOfContextTestingActivity";

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O0 o0Zzf = C0591z.zza().zzf(this, new BinderC1686Nn());
        if (o0Zzf == null) {
            finish();
            return;
        }
        setContentView(v.admob_empty_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(u.layout);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra(AD_UNIT_KEY);
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            o0Zzf.zze(stringExtra, b.wrap(this), b.wrap(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
