package K1;

/* renamed from: K1.f0 */
/* loaded from: classes.dex */
public final class C0636f0 {

    /* renamed from: a */
    private long f2810a;

    /* renamed from: b */
    private long f2811b = Long.MIN_VALUE;

    /* renamed from: c */
    private final Object f2812c = new Object();

    public C0636f0(long j8) {
        this.f2810a = j8;
    }

    public final void zza(long j8) {
        synchronized (this.f2812c) {
            this.f2810a = j8;
        }
    }

    public final boolean zzb() {
        synchronized (this.f2812c) {
            try {
                long jElapsedRealtime = G1.u.zzB().elapsedRealtime();
                if (this.f2811b + this.f2810a > jElapsedRealtime) {
                    return false;
                }
                this.f2811b = jElapsedRealtime;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
