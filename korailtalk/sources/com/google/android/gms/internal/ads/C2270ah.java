package com.google.android.gms.internal.ads;

import K1.AbstractC0648l0;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import i2.AbstractC5683p;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.ah, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2270ah {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18000a;

    public C2270ah(Context context) {
        AbstractC5683p.checkNotNull(context, "Context can not be null");
        this.f18000a = context;
    }

    public final boolean zza(Intent intent) {
        AbstractC5683p.checkNotNull(intent, "Intent can not be null");
        return !this.f18000a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public final boolean zzb() {
        return zza(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean zzc() {
        return ((Boolean) AbstractC0648l0.zza(this.f18000a, new Callable() { // from class: com.google.android.gms.internal.ads.Zg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
            }
        })).booleanValue() && q2.e.packageManager(this.f18000a).checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
