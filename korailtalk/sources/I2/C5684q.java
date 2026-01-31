package i2;

/* renamed from: i2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5684q {

    /* renamed from: b, reason: collision with root package name */
    private static C5684q f31837b;

    /* renamed from: c, reason: collision with root package name */
    private static final C5685r f31838c = new C5685r(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private C5685r f31839a;

    private C5684q() {
    }

    public static synchronized C5684q getInstance() {
        try {
            if (f31837b == null) {
                f31837b = new C5684q();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f31837b;
    }

    public C5685r getConfig() {
        return this.f31839a;
    }

    public final synchronized void zza(C5685r c5685r) {
        if (c5685r == null) {
            this.f31839a = f31838c;
            return;
        }
        C5685r c5685r2 = this.f31839a;
        if (c5685r2 == null || c5685r2.getVersion() < c5685r.getVersion()) {
            this.f31839a = c5685r;
        }
    }
}
