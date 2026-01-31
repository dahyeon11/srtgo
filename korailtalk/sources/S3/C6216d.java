package s3;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: s3.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C6216d {

    /* renamed from: b, reason: collision with root package name */
    private static C6216d f36163b;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f36164a;

    private C6216d(Context context) {
        this.f36164a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    static synchronized C6216d a(Context context) {
        try {
            if (f36163b == null) {
                f36163b = new C6216d(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f36163b;
    }

    synchronized boolean b(long j8) {
        return c("fire-global", j8);
    }

    synchronized boolean c(String str, long j8) {
        if (!this.f36164a.contains(str)) {
            this.f36164a.edit().putLong(str, j8).apply();
            return true;
        }
        if (j8 - this.f36164a.getLong(str, -1L) < 86400000) {
            return false;
        }
        this.f36164a.edit().putLong(str, j8).apply();
        return true;
    }
}
