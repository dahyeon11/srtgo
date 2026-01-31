package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Xb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2072Xb extends AbstractCallableC4657vc {

    /* renamed from: i, reason: collision with root package name */
    private final long f17262i;

    public C2072Xb(C1294Eb c1294Eb, String str, String str2, C3357k9 c3357k9, long j8, int i8, int i9) {
        super(c1294Eb, "Rx5KxmHu63h8QT7T4cYR2mu7F4LQnYkocG/Azb9HP8ZHyjUHnRxxCuB99BIp3kbl", "3fysZeGzwX+hqd2f4+qtlSho+oF+DeFl9kzKrTFOSWo=", c3357k9, i8, 25);
        this.f17262i = j8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4657vc
    protected final void a() {
        long jLongValue = ((Long) this.f23266f.invoke(null, null)).longValue();
        synchronized (this.f23265e) {
            try {
                this.f23265e.zzv(jLongValue);
                long j8 = this.f17262i;
                if (j8 != 0) {
                    this.f23265e.zzZ(jLongValue - j8);
                    this.f23265e.zzab(this.f17262i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
