package p2;

import i2.AbstractC5683p;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f34591a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadFactory f34592b = Executors.defaultThreadFactory();

    public b(String str) {
        AbstractC5683p.checkNotNull(str, "Name must not be null");
        this.f34591a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f34592b.newThread(new d(runnable, 0));
        threadNewThread.setName(this.f34591a);
        return threadNewThread;
    }
}
