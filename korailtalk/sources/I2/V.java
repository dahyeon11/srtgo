package I2;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class V implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ S f2020a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Callable f2021b;

    V(S s8, Callable callable) {
        this.f2020a = s8;
        this.f2021b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f2020a.zzb(this.f2021b.call());
        } catch (Exception e8) {
            this.f2020a.zza(e8);
        } catch (Throwable th) {
            this.f2020a.zza(new RuntimeException(th));
        }
    }
}
