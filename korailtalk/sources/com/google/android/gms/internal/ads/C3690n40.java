package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.n40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3690n40 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f21185a;

    /* renamed from: b, reason: collision with root package name */
    private final ViewGroup f21186b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f21187c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f21188d;

    public C3690n40(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, ViewGroup viewGroup, Context context, Set set) {
        this.f21185a = interfaceExecutorServiceC1974Un0;
        this.f21188d = set;
        this.f21186b = viewGroup;
        this.f21187c = context;
    }

    final /* synthetic */ C3804o40 a() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgb)).booleanValue() && this.f21186b != null && this.f21188d.contains("banner")) {
            return new C3804o40(Boolean.valueOf(this.f21186b.isHardwareAccelerated()));
        }
        Boolean boolValueOf = null;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgc)).booleanValue() && this.f21188d.contains("native")) {
            Context context = this.f21187c;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        boolValueOf = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    boolValueOf = Boolean.TRUE;
                }
                return new C3804o40(boolValueOf);
            }
        }
        return new C3804o40(null);
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 22;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return this.f21185a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.m40
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.a();
            }
        });
    }
}
