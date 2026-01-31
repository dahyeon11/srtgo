package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.internal.ads.Ks, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class SharedPreferencesOnSharedPreferenceChangeListenerC1571Ks implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final String f13865a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1611Ls f13866b;

    public SharedPreferencesOnSharedPreferenceChangeListenerC1571Ks(C1611Ls c1611Ls, String str) {
        this.f13866b = c1611Ls;
        this.f13865a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f13866b) {
            try {
                for (C1530Js c1530Js : this.f13866b.f14358b) {
                    c1530Js.zza.b(c1530Js.zzb, sharedPreferences, this.f13865a, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
