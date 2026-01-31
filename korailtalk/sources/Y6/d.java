package Y6;

import W6.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class d extends a {

    /* renamed from: b, reason: collision with root package name */
    private final W6.g f5653b;

    /* renamed from: c, reason: collision with root package name */
    private transient W6.d f5654c;

    public d(W6.d<Object> dVar, W6.g gVar) {
        super(dVar);
        this.f5653b = gVar;
    }

    @Override // Y6.a, W6.d
    public W6.g getContext() {
        W6.g gVar = this.f5653b;
        Intrinsics.checkNotNull(gVar);
        return gVar;
    }

    public final W6.d<Object> intercepted() {
        W6.d<Object> dVarInterceptContinuation = this.f5654c;
        if (dVarInterceptContinuation == null) {
            W6.e eVar = (W6.e) getContext().get(W6.e.Key);
            if (eVar == null || (dVarInterceptContinuation = eVar.interceptContinuation(this)) == null) {
                dVarInterceptContinuation = this;
            }
            this.f5654c = dVarInterceptContinuation;
        }
        return dVarInterceptContinuation;
    }

    @Override // Y6.a
    protected void releaseIntercepted() {
        W6.d<?> dVar = this.f5654c;
        if (dVar != null && dVar != this) {
            g.b bVar = getContext().get(W6.e.Key);
            Intrinsics.checkNotNull(bVar);
            ((W6.e) bVar).releaseInterceptedContinuation(dVar);
        }
        this.f5654c = c.INSTANCE;
    }

    public d(W6.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
