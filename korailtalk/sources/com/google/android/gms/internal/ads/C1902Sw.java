package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* renamed from: com.google.android.gms.internal.ads.Sw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1902Sw extends MutableContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    private Activity f16352a;

    /* renamed from: b, reason: collision with root package name */
    private Context f16353b;

    /* renamed from: c, reason: collision with root package name */
    private Context f16354c;

    public C1902Sw(Context context) {
        super(context);
        setBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f16354c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f16353b = applicationContext;
        this.f16352a = context instanceof Activity ? (Activity) context : null;
        this.f16354c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f16352a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f16353b.startActivity(intent);
        }
    }

    public final Activity zza() {
        return this.f16352a;
    }

    public final Context zzb() {
        return this.f16354c;
    }
}
