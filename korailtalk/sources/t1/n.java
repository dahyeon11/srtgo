package t1;

import java.util.Iterator;
import java.util.concurrent.Executor;
import u1.InterfaceC6407c;
import v1.InterfaceC6428b;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f36929a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6407c f36930b;

    /* renamed from: c, reason: collision with root package name */
    private final p f36931c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6428b f36932d;

    n(Executor executor, InterfaceC6407c interfaceC6407c, p pVar, InterfaceC6428b interfaceC6428b) {
        this.f36929a = executor;
        this.f36930b = interfaceC6407c;
        this.f36931c = pVar;
        this.f36932d = interfaceC6428b;
    }

    static /* synthetic */ Object a(n nVar) {
        Iterator<o1.l> it = nVar.f36930b.loadActiveContexts().iterator();
        while (it.hasNext()) {
            nVar.f36931c.schedule(it.next(), 1);
        }
        return null;
    }

    public void ensureContextsScheduled() {
        this.f36929a.execute(l.lambdaFactory$(this));
    }
}
