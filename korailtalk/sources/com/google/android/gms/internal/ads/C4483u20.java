package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.u20, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4483u20 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    private final H1.j2 f22960a;

    /* renamed from: b, reason: collision with root package name */
    private final L1.a f22961b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f22962c;

    public C4483u20(H1.j2 j2Var, L1.a aVar, boolean z8) {
        this.f22960a = j2Var;
        this.f22961b = aVar;
        this.f22962c = z8;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.f22961b.clientJarVersion >= ((Integer) H1.C.zzc().zza(AbstractC4439th.zzfp)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfq)).booleanValue()) {
            bundle.putBoolean("app_switched", this.f22962c);
        }
        H1.j2 j2Var = this.f22960a;
        if (j2Var != null) {
            int i8 = j2Var.zza;
            if (i8 == 1) {
                bundle.putString("avo", "p");
            } else if (i8 == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
