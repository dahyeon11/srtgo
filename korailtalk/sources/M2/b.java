package m2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import m2.AbstractC5906a;
import z2.s;

/* loaded from: classes.dex */
final class b implements AbstractC5906a.InterfaceC0351a {
    b() {
    }

    @Override // m2.AbstractC5906a.InterfaceC0351a
    public final ScheduledExecutorService newSingleThreadScheduledExecutor() {
        s.zza();
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
