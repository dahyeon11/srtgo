package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.u70, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4493u70 {

    /* renamed from: a, reason: collision with root package name */
    private final C2519cr f22976a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22977b;

    public C4493u70(C2519cr c2519cr, int i8) {
        this.f22976a = c2519cr;
        this.f22977b = i8;
    }

    final boolean a() {
        return this.f22976a.zzl;
    }

    final boolean b() {
        return this.f22976a.zza.getBoolean("is_gbid");
    }

    final boolean c() {
        return this.f22976a.zzk;
    }

    public final int zza() {
        return this.f22977b;
    }

    public final PackageInfo zzb() {
        return this.f22976a.zzf;
    }

    public final String zzc() {
        return this.f22976a.zzd;
    }

    public final String zzd() {
        return AbstractC1802Qj0.zzc(this.f22976a.zza.getString("ms"));
    }

    public final String zze() {
        return this.f22976a.zzh;
    }

    public final List zzf() {
        return this.f22976a.zze;
    }
}
