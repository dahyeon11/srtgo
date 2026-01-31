package L1;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f3006a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f3007b;

    b(String str) {
        this.f3007b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(" + this.f3007b + ") #" + this.f3006a.getAndIncrement());
    }
}
