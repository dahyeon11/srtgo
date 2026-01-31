package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Ls, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1611Ls {

    /* renamed from: a, reason: collision with root package name */
    private final Map f14357a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List f14358b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Context f14359c;

    /* renamed from: d, reason: collision with root package name */
    private final C4803ws f14360d;

    C1611Ls(Context context, C4803ws c4803ws) {
        this.f14359c = context;
        this.f14360d = c4803ws;
    }

    final /* synthetic */ void b(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.f14360d.zzd();
        }
    }

    final synchronized void c(String str) {
        try {
            if (this.f14357a.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f14359c) : this.f14359c.getSharedPreferences(str, 0);
            SharedPreferencesOnSharedPreferenceChangeListenerC1571Ks sharedPreferencesOnSharedPreferenceChangeListenerC1571Ks = new SharedPreferencesOnSharedPreferenceChangeListenerC1571Ks(this, str);
            this.f14357a.put(str, sharedPreferencesOnSharedPreferenceChangeListenerC1571Ks);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC1571Ks);
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized void d(C1530Js c1530Js) {
        this.f14358b.add(c1530Js);
    }
}
