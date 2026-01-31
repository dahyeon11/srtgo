package I2;

/* loaded from: classes2.dex */
final class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC0608l f2038a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f2039b;

    x(y yVar, AbstractC0608l abstractC0608l) {
        this.f2039b = yVar;
        this.f2038a = abstractC0608l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2038a.isCanceled()) {
            this.f2039b.f2042c.zzc();
            return;
        }
        try {
            this.f2039b.f2042c.zzb(this.f2039b.f2041b.then(this.f2038a));
        } catch (C0606j e8) {
            if (e8.getCause() instanceof Exception) {
                this.f2039b.f2042c.zza((Exception) e8.getCause());
            } else {
                this.f2039b.f2042c.zza(e8);
            }
        } catch (Exception e9) {
            this.f2039b.f2042c.zza(e9);
        }
    }
}
