package m2;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: m2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5906a {

    /* renamed from: a, reason: collision with root package name */
    private static InterfaceC0351a f34113a;

    /* renamed from: m2.a$a, reason: collision with other inner class name */
    public interface InterfaceC0351a {
        @Deprecated
        ScheduledExecutorService newSingleThreadScheduledExecutor();
    }

    @Deprecated
    public static synchronized InterfaceC0351a getInstance() {
        try {
            if (f34113a == null) {
                f34113a = new b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f34113a;
    }
}
