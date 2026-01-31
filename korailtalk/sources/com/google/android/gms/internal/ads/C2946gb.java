package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* renamed from: com.google.android.gms.internal.ads.gb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2946gb {

    /* renamed from: a, reason: collision with root package name */
    private NetworkCapabilities f19376a;

    C2946gb(ConnectivityManager connectivityManager) {
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new C2831fb(this));
            } catch (RuntimeException unused) {
                synchronized (C2946gb.class) {
                    this.f19376a = null;
                }
            }
        }
    }

    public static C2946gb zzc(Context context) {
        if (context != null) {
            return new C2946gb((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final long zza() {
        synchronized (C2946gb.class) {
            try {
                NetworkCapabilities networkCapabilities = this.f19376a;
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(4)) {
                        return 2L;
                    }
                    if (this.f19376a.hasTransport(1)) {
                        return 1L;
                    }
                    if (this.f19376a.hasTransport(0)) {
                        return 0L;
                    }
                }
                return -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final NetworkCapabilities zzb() {
        return this.f19376a;
    }
}
