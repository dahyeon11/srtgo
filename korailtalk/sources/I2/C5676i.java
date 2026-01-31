package i2;

import android.util.Log;

/* renamed from: i2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5676i {

    /* renamed from: a, reason: collision with root package name */
    private final String f31813a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31814b;

    public C5676i(String str) {
        this(str, null);
    }

    private final String a(String str) {
        String str2 = this.f31814b;
        return str2 == null ? str : str2.concat(str);
    }

    private final String b(String str, Object... objArr) {
        String str2 = this.f31814b;
        String str3 = String.format(str, objArr);
        return str2 == null ? str3 : str2.concat(str3);
    }

    public boolean canLog(int i8) {
        return Log.isLoggable(this.f31813a, i8);
    }

    public boolean canLogPii() {
        return false;
    }

    public void d(String str, String str2) {
        if (canLog(3)) {
            a(str2);
        }
    }

    public void e(String str, String str2) {
        if (canLog(6)) {
            Log.e(str, a(str2));
        }
    }

    public void efmt(String str, String str2, Object... objArr) {
        if (canLog(6)) {
            Log.e(str, b(str2, objArr));
        }
    }

    public void i(String str, String str2) {
        if (canLog(4)) {
            a(str2);
        }
    }

    public void pii(String str, String str2) {
    }

    public void v(String str, String str2) {
        if (canLog(2)) {
            a(str2);
        }
    }

    public void w(String str, String str2) {
        if (canLog(5)) {
            Log.w(str, a(str2));
        }
    }

    public void wfmt(String str, String str2, Object... objArr) {
        if (canLog(5)) {
            Log.w(this.f31813a, b(str2, objArr));
        }
    }

    public void wtf(String str, String str2, Throwable th) {
        if (canLog(7)) {
            Log.e(str, a(str2), th);
            Log.wtf(str, a(str2), th);
        }
    }

    public C5676i(String str, String str2) {
        AbstractC5683p.checkNotNull(str, "log tag cannot be null");
        AbstractC5683p.checkArgument(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f31813a = str;
        this.f31814b = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public void pii(String str, String str2, Throwable th) {
    }

    public void d(String str, String str2, Throwable th) {
        if (canLog(3)) {
            a(str2);
        }
    }

    public void e(String str, String str2, Throwable th) {
        if (canLog(6)) {
            Log.e(str, a(str2), th);
        }
    }

    public void i(String str, String str2, Throwable th) {
        if (canLog(4)) {
            a(str2);
        }
    }

    public void v(String str, String str2, Throwable th) {
        if (canLog(2)) {
            a(str2);
        }
    }

    public void w(String str, String str2, Throwable th) {
        if (canLog(5)) {
            Log.w(str, a(str2), th);
        }
    }
}
