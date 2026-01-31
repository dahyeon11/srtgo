package t1;

import android.content.Context;
import java.util.concurrent.Executor;
import u1.InterfaceC6407c;
import v1.InterfaceC6428b;
import w1.InterfaceC6458a;

/* loaded from: classes.dex */
public final class k implements H6.b {

    /* renamed from: a, reason: collision with root package name */
    private final Q6.a f36920a;

    /* renamed from: b, reason: collision with root package name */
    private final Q6.a f36921b;

    /* renamed from: c, reason: collision with root package name */
    private final Q6.a f36922c;

    /* renamed from: d, reason: collision with root package name */
    private final Q6.a f36923d;

    /* renamed from: e, reason: collision with root package name */
    private final Q6.a f36924e;

    /* renamed from: f, reason: collision with root package name */
    private final Q6.a f36925f;

    /* renamed from: g, reason: collision with root package name */
    private final Q6.a f36926g;

    public k(Q6.a aVar, Q6.a aVar2, Q6.a aVar3, Q6.a aVar4, Q6.a aVar5, Q6.a aVar6, Q6.a aVar7) {
        this.f36920a = aVar;
        this.f36921b = aVar2;
        this.f36922c = aVar3;
        this.f36923d = aVar4;
        this.f36924e = aVar5;
        this.f36925f = aVar6;
        this.f36926g = aVar7;
    }

    public static k create(Q6.a aVar, Q6.a aVar2, Q6.a aVar3, Q6.a aVar4, Q6.a aVar5, Q6.a aVar6, Q6.a aVar7) {
        return new k(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static j newInstance(Context context, p1.e eVar, InterfaceC6407c interfaceC6407c, p pVar, Executor executor, InterfaceC6428b interfaceC6428b, InterfaceC6458a interfaceC6458a) {
        return new j(context, eVar, interfaceC6407c, pVar, executor, interfaceC6428b, interfaceC6458a);
    }

    @Override // H6.b, Q6.a, G6.a
    public j get() {
        return new j((Context) this.f36920a.get(), (p1.e) this.f36921b.get(), (InterfaceC6407c) this.f36922c.get(), (p) this.f36923d.get(), (Executor) this.f36924e.get(), (InterfaceC6428b) this.f36925f.get(), (InterfaceC6458a) this.f36926g.get());
    }
}
