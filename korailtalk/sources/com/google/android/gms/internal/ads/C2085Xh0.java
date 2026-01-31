package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Xh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2085Xh0 {

    /* renamed from: c, reason: collision with root package name */
    private static C2085Xh0 f17283c;

    /* renamed from: a, reason: collision with root package name */
    private final String f17284a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f17285b;

    private C2085Xh0(Context context) {
        this.f17284a = context.getPackageName();
        this.f17285b = context.getSharedPreferences("paid_storage_sp", 0);
    }

    static C2085Xh0 b(Context context) {
        if (f17283c == null) {
            f17283c = new C2085Xh0(context);
        }
        return f17283c;
    }

    final long a(String str, long j8) {
        return this.f17285b.getLong(str, -1L);
    }

    final String c(String str, String str2) {
        return this.f17285b.getString(str, null);
    }

    final void d(String str, Object obj) throws IOException {
        boolean zCommit;
        if (obj instanceof String) {
            zCommit = this.f17285b.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            zCommit = this.f17285b.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else {
            if (!(obj instanceof Boolean)) {
                Log.e("PaidLifecycleSPHandler", "Unexpected object class " + String.valueOf(obj.getClass()) + " for app " + this.f17284a);
                throw new IOException("Failed to store " + str + " for app " + this.f17284a);
            }
            zCommit = this.f17285b.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        }
        if (zCommit) {
            return;
        }
        throw new IOException("Failed to store " + str + " for app " + this.f17284a);
    }

    final void e(String str) throws IOException {
        if (this.f17285b.edit().remove(str).commit()) {
            return;
        }
        throw new IOException("Failed to remove " + str + " for app " + this.f17284a);
    }

    final boolean f(String str, boolean z8) {
        return this.f17285b.getBoolean(str, true);
    }

    final boolean g(String str) {
        return this.f17285b.contains(str);
    }
}
