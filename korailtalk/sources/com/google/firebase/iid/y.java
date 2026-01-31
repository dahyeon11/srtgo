package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.iid.x;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final long f25690a;

    /* renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f25691b;

    /* renamed from: c, reason: collision with root package name */
    private final FirebaseInstanceId f25692c;

    /* renamed from: d, reason: collision with root package name */
    ExecutorService f25693d = h.b();

    static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private y f25694a;

        public a(y yVar) {
            this.f25694a = yVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            y yVar = this.f25694a;
            if (yVar != null && yVar.d()) {
                FirebaseInstanceId.m();
                this.f25694a.f25692c.e(this.f25694a, 0L);
                this.f25694a.b().unregisterReceiver(this);
                this.f25694a = null;
            }
        }

        public void registerReceiver() {
            FirebaseInstanceId.m();
            this.f25694a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    y(FirebaseInstanceId firebaseInstanceId, long j8) {
        this.f25692c = firebaseInstanceId;
        this.f25690a = j8;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f25691b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    private void c(String str) {
        if (l3.c.DEFAULT_APP_NAME.equals(this.f25692c.f().getName())) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(this.f25692c.f().getName());
                if (strValueOf.length() != 0) {
                    "Invoking onNewToken for app: ".concat(strValueOf);
                }
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new f(b(), this.f25693d).process(intent);
        }
    }

    Context b() {
        return this.f25692c.f().getApplicationContext();
    }

    boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    boolean e() throws IOException {
        x.a aVarK = this.f25692c.k();
        if (!this.f25692c.z(aVarK)) {
            return true;
        }
        try {
            String strC = this.f25692c.c();
            if (strC == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            Log.isLoggable("FirebaseInstanceId", 3);
            if (aVarK == null || !strC.equals(aVarK.f25687a)) {
                c(strC);
            }
            return true;
        } catch (IOException e8) {
            if (!o.e(e8.getMessage())) {
                if (e8.getMessage() != null) {
                    throw e8;
                }
                Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            String message = e8.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
            sb.append("Token retrieval failed: ");
            sb.append(message);
            sb.append(". Will retry token retrieval");
            Log.w("FirebaseInstanceId", sb.toString());
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (w.getInstance().c(b())) {
            this.f25691b.acquire();
        }
        try {
            try {
                this.f25692c.v(true);
                if (!this.f25692c.isGmsCorePresent()) {
                    this.f25692c.v(false);
                    if (w.getInstance().c(b())) {
                        this.f25691b.release();
                        return;
                    }
                    return;
                }
                if (w.getInstance().b(b()) && !d()) {
                    new a(this).registerReceiver();
                    if (w.getInstance().c(b())) {
                        this.f25691b.release();
                        return;
                    }
                    return;
                }
                if (e()) {
                    this.f25692c.v(false);
                } else {
                    this.f25692c.y(this.f25690a);
                }
                if (w.getInstance().c(b())) {
                    this.f25691b.release();
                }
            } catch (IOException e8) {
                String message = e8.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
                sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb.append(message);
                sb.append(". Won't retry the operation.");
                Log.e("FirebaseInstanceId", sb.toString());
                this.f25692c.v(false);
                if (w.getInstance().c(b())) {
                    this.f25691b.release();
                }
            }
        } catch (Throwable th) {
            if (w.getInstance().c(b())) {
                this.f25691b.release();
            }
            throw th;
        }
    }
}
