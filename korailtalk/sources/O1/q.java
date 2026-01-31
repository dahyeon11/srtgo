package o1;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import m1.C5904b;
import s1.InterfaceC6211e;
import w1.InterfaceC6458a;

/* loaded from: classes.dex */
public class q implements p {

    /* renamed from: e, reason: collision with root package name */
    private static volatile r f34434e;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6458a f34435a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6458a f34436b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6211e f34437c;

    /* renamed from: d, reason: collision with root package name */
    private final t1.j f34438d;

    q(InterfaceC6458a interfaceC6458a, InterfaceC6458a interfaceC6458a2, InterfaceC6211e interfaceC6211e, t1.j jVar, t1.n nVar) {
        this.f34435a = interfaceC6458a;
        this.f34436b = interfaceC6458a2;
        this.f34437c = interfaceC6211e;
        this.f34438d = jVar;
        nVar.ensureContextsScheduled();
    }

    private h a(k kVar) {
        return h.builder().setEventMillis(this.f34435a.getTime()).setUptimeMillis(this.f34436b.getTime()).setTransportName(kVar.getTransportName()).setEncodedPayload(new g(kVar.getEncoding(), kVar.getPayload())).setCode(kVar.a().getCode()).build();
    }

    private static Set b(InterfaceC6028e interfaceC6028e) {
        return interfaceC6028e instanceof f ? Collections.unmodifiableSet(((f) interfaceC6028e).getSupportedEncodings()) : Collections.singleton(C5904b.of("proto"));
    }

    public static q getInstance() {
        r rVar = f34434e;
        if (rVar != null) {
            return rVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void initialize(Context context) {
        if (f34434e == null) {
            synchronized (q.class) {
                try {
                    if (f34434e == null) {
                        f34434e = C6027d.builder().setApplicationContext(context).build();
                    }
                } finally {
                }
            }
        }
    }

    public t1.j getUploader() {
        return this.f34438d;
    }

    @Deprecated
    public m1.g newFactory(String str) {
        return new m(b(null), l.builder().setBackendName(str).build(), this);
    }

    @Override // o1.p
    public void send(k kVar, m1.h hVar) {
        this.f34437c.schedule(kVar.getTransportContext().withPriority(kVar.a().getPriority()), a(kVar), hVar);
    }

    public m1.g newFactory(InterfaceC6028e interfaceC6028e) {
        return new m(b(interfaceC6028e), l.builder().setBackendName(interfaceC6028e.getName()).setExtras(interfaceC6028e.getExtras()).build(), this);
    }
}
