package p2;

import i2.AbstractC5683p;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f34593a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f34594b = new AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    private final ThreadFactory f34595c = Executors.defaultThreadFactory();

    public c(String str) {
        AbstractC5683p.checkNotNull(str, "Name must not be null");
        this.f34593a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f34595c.newThread(new d(runnable, 0));
        threadNewThread.setName(this.f34593a + "[" + this.f34594b.getAndIncrement() + "]");
        return threadNewThread;
    }
}
