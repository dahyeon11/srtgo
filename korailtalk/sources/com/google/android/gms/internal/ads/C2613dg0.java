package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.dg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2613dg0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18660a;

    /* renamed from: b, reason: collision with root package name */
    private final Looper f18661b;

    public C2613dg0(Context context, Looper looper) {
        this.f18660a = context;
        this.f18661b = looper;
    }

    public final void zza(String str) {
        C4552ug0 c4552ug0Zza = C5008yg0.zza();
        c4552ug0Zza.zza(this.f18660a.getPackageName());
        c4552ug0Zza.zzc(EnumC4894xg0.BLOCKED_IMPRESSION);
        C4210rg0 c4210rg0Zza = C4324sg0.zza();
        c4210rg0Zza.zzb(str);
        c4210rg0Zza.zza(EnumC4097qg0.BLOCKED_REASON_BACKGROUND);
        c4552ug0Zza.zzb(c4210rg0Zza);
        new C2727eg0(this.f18660a, this.f18661b, (C5008yg0) c4552ug0Zza.zzbr()).a();
    }
}
