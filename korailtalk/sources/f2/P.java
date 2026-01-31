package f2;

import android.util.Log;

/* loaded from: classes.dex */
class P {

    /* renamed from: e, reason: collision with root package name */
    private static final P f30552e = new P(true, 3, 1, null, null);

    /* renamed from: a, reason: collision with root package name */
    final boolean f30553a;

    /* renamed from: b, reason: collision with root package name */
    final String f30554b;

    /* renamed from: c, reason: collision with root package name */
    final Throwable f30555c;

    /* renamed from: d, reason: collision with root package name */
    final int f30556d;

    private P(boolean z8, int i8, int i9, String str, Throwable th) {
        this.f30553a = z8;
        this.f30556d = i8;
        this.f30554b = str;
        this.f30555c = th;
    }

    static P b() {
        return f30552e;
    }

    static P c(String str) {
        return new P(false, 1, 5, str, null);
    }

    static P d(String str, Throwable th) {
        return new P(false, 1, 5, str, th);
    }

    static P f(int i8) {
        return new P(true, i8, 1, null, null);
    }

    static P g(int i8, int i9, String str, Throwable th) {
        return new P(false, i8, i9, str, th);
    }

    String a() {
        return this.f30554b;
    }

    final void e() {
        if (this.f30553a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f30555c != null) {
            a();
        } else {
            a();
        }
    }
}
