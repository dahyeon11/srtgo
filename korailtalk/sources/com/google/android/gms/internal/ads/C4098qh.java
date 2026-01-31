package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.internal.ads.qh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4098qh implements InterfaceC1349Fi {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SharedPreferences f21974a;

    C4098qh(SharedPreferencesOnSharedPreferenceChangeListenerC4211rh sharedPreferencesOnSharedPreferenceChangeListenerC4211rh, SharedPreferences sharedPreferences) {
        this.f21974a = sharedPreferences;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1349Fi
    public final Boolean zza(String str, boolean z8) {
        try {
            return Boolean.valueOf(this.f21974a.getBoolean(str, z8));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.f21974a.getString(str, String.valueOf(z8)));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1349Fi
    public final Double zzb(String str, double d9) {
        try {
            return Double.valueOf(this.f21974a.getFloat(str, (float) d9));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.f21974a.getString(str, String.valueOf(d9)));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1349Fi
    public final Long zzc(String str, long j8) {
        try {
            return Long.valueOf(this.f21974a.getLong(str, j8));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.f21974a.getInt(str, (int) j8));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1349Fi
    public final String zzd(String str, String str2) {
        return this.f21974a.getString(str, str2);
    }
}
