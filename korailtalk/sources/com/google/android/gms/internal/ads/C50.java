package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class C50 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f12471a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f12472b;

    /* renamed from: c, reason: collision with root package name */
    private final L1.a f12473c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12474d;

    C50(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, Context context, L1.a aVar, String str) {
        this.f12471a = interfaceExecutorServiceC1974Un0;
        this.f12472b = context;
        this.f12473c = aVar;
        this.f12474d = str;
    }

    final /* synthetic */ D50 a() {
        boolean zIsCallerInstantApp = q2.e.packageManager(this.f12472b).isCallerInstantApp();
        G1.u.zzp();
        boolean zZzE = K1.K0.zzE(this.f12472b);
        String str = this.f12473c.afmaVersion;
        G1.u.zzp();
        boolean zZzF = K1.K0.zzF();
        G1.u.zzp();
        ApplicationInfo applicationInfo = this.f12472b.getApplicationInfo();
        int i8 = applicationInfo == null ? 0 : applicationInfo.targetSdkVersion;
        Context context = this.f12472b;
        return new D50(zIsCallerInstantApp, zZzE, str, zZzF, i8, DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID), DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID), this.f12474d);
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 35;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return this.f12471a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.B50
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.a();
            }
        });
    }
}
