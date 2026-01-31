package t1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p1.g;
import q1.AbstractC6104a;
import u1.AbstractC6412h;
import u1.InterfaceC6407c;
import v1.C6427a;
import v1.InterfaceC6428b;
import w1.InterfaceC6458a;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a */
    private final Context f36913a;

    /* renamed from: b */
    private final p1.e f36914b;

    /* renamed from: c */
    private final InterfaceC6407c f36915c;

    /* renamed from: d */
    private final p f36916d;

    /* renamed from: e */
    private final Executor f36917e;

    /* renamed from: f */
    private final InterfaceC6428b f36918f;

    /* renamed from: g */
    private final InterfaceC6458a f36919g;

    public j(Context context, p1.e eVar, InterfaceC6407c interfaceC6407c, p pVar, Executor executor, InterfaceC6428b interfaceC6428b, InterfaceC6458a interfaceC6458a) {
        this.f36913a = context;
        this.f36914b = eVar;
        this.f36915c = interfaceC6407c;
        this.f36916d = pVar;
        this.f36917e = executor;
        this.f36918f = interfaceC6428b;
        this.f36919g = interfaceC6458a;
    }

    static /* synthetic */ Iterable b(j jVar, o1.l lVar) {
        return jVar.f36915c.loadBatch(lVar);
    }

    static /* synthetic */ Object c(j jVar, p1.g gVar, Iterable iterable, o1.l lVar, int i8) {
        if (gVar.getStatus() == g.a.TRANSIENT_ERROR) {
            jVar.f36915c.recordFailure(iterable);
            jVar.f36916d.schedule(lVar, i8 + 1);
            return null;
        }
        jVar.f36915c.recordSuccess(iterable);
        if (gVar.getStatus() == g.a.OK) {
            jVar.f36915c.recordNextCallTime(lVar, jVar.f36919g.getTime() + gVar.getNextRequestWaitMillis());
        }
        if (!jVar.f36915c.hasPendingEventsFor(lVar)) {
            return null;
        }
        jVar.f36916d.schedule(lVar, 1);
        return null;
    }

    static /* synthetic */ Object d(j jVar, o1.l lVar, int i8) {
        jVar.f36916d.schedule(lVar, i8 + 1);
        return null;
    }

    static /* synthetic */ void e(j jVar, o1.l lVar, int i8, Runnable runnable) {
        try {
            try {
                InterfaceC6428b interfaceC6428b = jVar.f36918f;
                InterfaceC6407c interfaceC6407c = jVar.f36915c;
                interfaceC6407c.getClass();
                interfaceC6428b.runCriticalSection(h.lambdaFactory$(interfaceC6407c));
                if (jVar.a()) {
                    jVar.f(lVar, i8);
                } else {
                    jVar.f36918f.runCriticalSection(i.lambdaFactory$(jVar, lVar, i8));
                }
            } catch (C6427a unused) {
                jVar.f36916d.schedule(lVar, i8 + 1);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    boolean a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f36913a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    void f(o1.l lVar, int i8) {
        p1.g gVarSend;
        p1.m mVar = this.f36914b.get(lVar.getBackendName());
        Iterable iterable = (Iterable) this.f36918f.runCriticalSection(f.lambdaFactory$(this, lVar));
        if (iterable.iterator().hasNext()) {
            if (mVar == null) {
                AbstractC6104a.d("Uploader", "Unknown backend for %s, deleting event batch for it...", lVar);
                gVarSend = p1.g.fatalError();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC6412h) it.next()).getEvent());
                }
                gVarSend = mVar.send(p1.f.builder().setEvents(arrayList).setExtras(lVar.getExtras()).build());
            }
            this.f36918f.runCriticalSection(g.lambdaFactory$(this, gVarSend, iterable, lVar, i8));
        }
    }

    public void upload(o1.l lVar, int i8, Runnable runnable) {
        this.f36917e.execute(e.lambdaFactory$(this, lVar, i8, runnable));
    }
}
