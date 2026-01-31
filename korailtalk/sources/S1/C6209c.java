package s1;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import o1.l;
import o1.q;
import p1.m;
import t1.p;
import u1.InterfaceC6407c;
import v1.InterfaceC6428b;

/* renamed from: s1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6209c implements InterfaceC6211e {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f36141f = Logger.getLogger(q.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final p f36142a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f36143b;

    /* renamed from: c, reason: collision with root package name */
    private final p1.e f36144c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6407c f36145d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6428b f36146e;

    public C6209c(Executor executor, p1.e eVar, p pVar, InterfaceC6407c interfaceC6407c, InterfaceC6428b interfaceC6428b) {
        this.f36143b = executor;
        this.f36144c = eVar;
        this.f36142a = pVar;
        this.f36145d = interfaceC6407c;
        this.f36146e = interfaceC6428b;
    }

    static /* synthetic */ Object a(C6209c c6209c, l lVar, o1.h hVar) {
        c6209c.f36145d.persist(lVar, hVar);
        c6209c.f36142a.schedule(lVar, 1);
        return null;
    }

    static /* synthetic */ void b(C6209c c6209c, l lVar, m1.h hVar, o1.h hVar2) {
        try {
            m mVar = c6209c.f36144c.get(lVar.getBackendName());
            if (mVar == null) {
                String str = String.format("Transport backend '%s' is not registered", lVar.getBackendName());
                f36141f.warning(str);
                hVar.onSchedule(new IllegalArgumentException(str));
            } else {
                c6209c.f36146e.runCriticalSection(C6208b.lambdaFactory$(c6209c, lVar, mVar.decorate(hVar2)));
                hVar.onSchedule(null);
            }
        } catch (Exception e8) {
            f36141f.warning("Error scheduling event " + e8.getMessage());
            hVar.onSchedule(e8);
        }
    }

    @Override // s1.InterfaceC6211e
    public void schedule(l lVar, o1.h hVar, m1.h hVar2) {
        this.f36143b.execute(RunnableC6207a.lambdaFactory$(this, lVar, hVar2, hVar));
    }
}
