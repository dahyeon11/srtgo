package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.kh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3414kh {

    /* renamed from: a, reason: collision with root package name */
    private final int f20451a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20452b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f20453c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f20454d;

    /* synthetic */ AbstractC3414kh(int i8, String str, Object obj, Object obj2, AbstractC3300jh abstractC3300jh) {
        this.f20451a = i8;
        this.f20452b = str;
        this.f20453c = obj;
        this.f20454d = obj2;
        H1.C.zza().zzd(this);
    }

    public static AbstractC3414kh zzf(int i8, String str, float f8, float f9) {
        return new C3073hh(1, str, Float.valueOf(f8), Float.valueOf(f9));
    }

    public static AbstractC3414kh zzg(int i8, String str, int i9, int i10) {
        return new C2843fh(1, str, Integer.valueOf(i9), Integer.valueOf(i10));
    }

    public static AbstractC3414kh zzh(int i8, String str, long j8, long j9) {
        return new C2958gh(1, str, Long.valueOf(j8), Long.valueOf(j9));
    }

    public static AbstractC3414kh zzi(int i8, String str, Boolean bool, Boolean bool2) {
        return new C2728eh(i8, str, bool, bool2);
    }

    public static AbstractC3414kh zzj(int i8, String str, String str2, String str3) {
        return new C3187ih(1, str, str2, str3);
    }

    public static AbstractC3414kh zzk(int i8, String str) {
        AbstractC3414kh abstractC3414khZzj = zzj(1, "gads:sdk_core_constants:experiment_id", null, null);
        H1.C.zza().zzc(abstractC3414khZzj);
        return abstractC3414khZzj;
    }

    protected abstract Object zza(JSONObject jSONObject);

    public abstract Object zzb(Bundle bundle);

    protected abstract Object zzc(SharedPreferences sharedPreferences);

    public abstract void zzd(SharedPreferences.Editor editor, Object obj);

    public final int zze() {
        return this.f20451a;
    }

    public final Object zzl() {
        return H1.C.zzc().zza(this);
    }

    public final Object zzm() {
        return H1.C.zzc().b() ? this.f20454d : this.f20453c;
    }

    public final String zzn() {
        return this.f20452b;
    }
}
