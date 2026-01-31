package I2;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: I2.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0615t implements InterfaceC0616u {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f2028a = new CountDownLatch(1);

    /* synthetic */ C0615t(AbstractC0614s abstractC0614s) {
    }

    @Override // I2.InterfaceC0616u, I2.InterfaceC0601e
    public final void onCanceled() {
        this.f2028a.countDown();
    }

    @Override // I2.InterfaceC0616u, I2.InterfaceC0603g
    public final void onFailure(Exception exc) {
        this.f2028a.countDown();
    }

    @Override // I2.InterfaceC0616u, I2.InterfaceC0604h
    public final void onSuccess(Object obj) {
        this.f2028a.countDown();
    }

    public final void zza() throws InterruptedException {
        this.f2028a.await();
    }

    public final boolean zzb(long j8, TimeUnit timeUnit) {
        return this.f2028a.await(j8, timeUnit);
    }
}
