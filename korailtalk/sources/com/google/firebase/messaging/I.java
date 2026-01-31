package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes2.dex */
class I implements Runnable {

    /* renamed from: f */
    private static final Object f25779f = new Object();

    /* renamed from: g */
    private static Boolean f25780g;

    /* renamed from: h */
    private static Boolean f25781h;

    /* renamed from: a */
    private final Context f25782a;

    /* renamed from: b */
    private final com.google.firebase.iid.r f25783b;

    /* renamed from: c */
    private final PowerManager.WakeLock f25784c;

    /* renamed from: d */
    private final H f25785d;

    /* renamed from: e */
    private final long f25786e;

    class a extends BroadcastReceiver {

        /* renamed from: a */
        private I f25787a;

        public a(I i8) {
            this.f25787a = i8;
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            I i8 = this.f25787a;
            if (i8 == null) {
                return;
            }
            if (i8.i()) {
                I.j();
                this.f25787a.f25785d.m(this.f25787a, 0L);
                context.unregisterReceiver(this);
                this.f25787a = null;
            }
        }

        public void registerReceiver() {
            I.j();
            I.this.f25782a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    I(H h8, Context context, com.google.firebase.iid.r rVar, long j8) {
        this.f25785d = h8;
        this.f25782a = context;
        this.f25786e = j8;
        this.f25783b = rVar;
        this.f25784c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, AbstractC5186c.FCM_WAKE_LOCK);
    }

    private static String e(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 142);
        sb.append("Missing Permission: ");
        sb.append(str);
        sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return sb.toString();
    }

    private static boolean f(Context context) {
        boolean zG;
        synchronized (f25779f) {
            try {
                Boolean bool = f25781h;
                zG = bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue();
                f25781h = Boolean.valueOf(zG);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zG;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z8 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z8 && Log.isLoggable(AbstractC5186c.TAG, 3)) {
            e(str);
        }
        return z8;
    }

    private static boolean h(Context context) {
        boolean zG;
        synchronized (f25779f) {
            try {
                Boolean bool = f25780g;
                zG = bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue();
                f25780g = Boolean.valueOf(zG);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zG;
    }

    public synchronized boolean i() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f25782a.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean j() {
        return Log.isLoggable(AbstractC5186c.TAG, 3);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (h(this.f25782a)) {
            this.f25784c.acquire(AbstractC5186c.WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS);
        }
        try {
            try {
                this.f25785d.o(true);
                if (!this.f25783b.isGmscorePresent()) {
                    this.f25785d.o(false);
                    if (h(this.f25782a)) {
                        try {
                            this.f25784c.release();
                            return;
                        } catch (RuntimeException unused) {
                            return;
                        }
                    }
                    return;
                }
                if (f(this.f25782a) && !i()) {
                    new a(this).registerReceiver();
                    if (h(this.f25782a)) {
                        try {
                            this.f25784c.release();
                            return;
                        } catch (RuntimeException unused2) {
                            return;
                        }
                    }
                    return;
                }
                if (this.f25785d.s()) {
                    this.f25785d.o(false);
                } else {
                    this.f25785d.t(this.f25786e);
                }
                if (h(this.f25782a)) {
                    try {
                        this.f25784c.release();
                    } catch (RuntimeException unused3) {
                    }
                }
            } catch (IOException e8) {
                String strValueOf = String.valueOf(e8.getMessage());
                Log.e(AbstractC5186c.TAG, strValueOf.length() != 0 ? "Failed to sync topics. Won't retry sync. ".concat(strValueOf) : new String("Failed to sync topics. Won't retry sync. "));
                this.f25785d.o(false);
                if (h(this.f25782a)) {
                    try {
                        this.f25784c.release();
                    } catch (RuntimeException unused4) {
                    }
                }
            }
        } catch (Throwable th) {
            if (h(this.f25782a)) {
                try {
                    this.f25784c.release();
                } catch (RuntimeException unused5) {
                }
            }
            throw th;
        }
    }
}
