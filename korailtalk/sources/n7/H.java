package n7;

import W6.g;
import f7.InterfaceC5519a;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public abstract class H {

    static final class a extends Lambda implements f7.p {
        public static final a INSTANCE = new a();

        a() {
            super(2);
        }

        @Override // f7.p
        public final W6.g invoke(W6.g gVar, g.b bVar) {
            return gVar.plus(bVar);
        }
    }

    static final class b extends Lambda implements f7.p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f34303a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f34304b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Ref.ObjectRef objectRef, boolean z8) {
            super(2);
            this.f34303a = objectRef;
            this.f34304b = z8;
        }

        @Override // f7.p
        public final W6.g invoke(W6.g gVar, g.b bVar) {
            return gVar.plus(bVar);
        }
    }

    static final class c extends Lambda implements f7.p {
        public static final c INSTANCE = new c();

        c() {
            super(2);
        }

        public final Boolean invoke(boolean z8, g.b bVar) {
            return Boolean.valueOf(z8);
        }

        @Override // f7.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (g.b) obj2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final W6.g a(W6.g gVar, W6.g gVar2, boolean z8) {
        boolean zB = b(gVar);
        boolean zB2 = b(gVar2);
        if (!zB && !zB2) {
            return gVar.plus(gVar2);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = gVar2;
        W6.h hVar = W6.h.INSTANCE;
        W6.g gVar3 = (W6.g) gVar.fold(hVar, new b(objectRef, z8));
        if (zB2) {
            objectRef.element = ((W6.g) objectRef.element).fold(hVar, a.INSTANCE);
        }
        return gVar3.plus((W6.g) objectRef.element);
    }

    private static final boolean b(W6.g gVar) {
        return ((Boolean) gVar.fold(Boolean.FALSE, c.INSTANCE)).booleanValue();
    }

    public static final String getCoroutineName(W6.g gVar) {
        return null;
    }

    public static final W6.g newCoroutineContext(L l8, W6.g gVar) {
        W6.g gVarA = a(l8.getCoroutineContext(), gVar, true);
        return (gVarA == C5971a0.getDefault() || gVarA.get(W6.e.Key) != null) ? gVarA : gVarA.plus(C5971a0.getDefault());
    }

    public static final U0 undispatchedCompletion(Y6.e eVar) {
        while (!(eVar instanceof X) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof U0) {
                return (U0) eVar;
            }
        }
        return null;
    }

    public static final U0 updateUndispatchedCompletion(W6.d<?> dVar, W6.g gVar, Object obj) {
        if (!(dVar instanceof Y6.e) || gVar.get(V0.INSTANCE) == null) {
            return null;
        }
        U0 u0UndispatchedCompletion = undispatchedCompletion((Y6.e) dVar);
        if (u0UndispatchedCompletion != null) {
            u0UndispatchedCompletion.saveThreadContext(gVar, obj);
        }
        return u0UndispatchedCompletion;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> T withContinuationContext(W6.d<?> r2, java.lang.Object r3, f7.InterfaceC5519a r4) {
        /*
            W6.g r0 = r2.getContext()
            java.lang.Object r3 = s7.O.updateThreadContext(r0, r3)
            s7.K r1 = s7.O.NO_THREAD_ELEMENTS
            if (r3 == r1) goto L11
            n7.U0 r2 = updateUndispatchedCompletion(r2, r0, r3)
            goto L12
        L11:
            r2 = 0
        L12:
            r1 = 1
            java.lang.Object r4 = r4.invoke()     // Catch: java.lang.Throwable -> L29
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            if (r2 == 0) goto L22
            boolean r2 = r2.clearThreadContext()
            if (r2 == 0) goto L25
        L22:
            s7.O.restoreThreadContext(r0, r3)
        L25:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r4
        L29:
            r4 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            if (r2 == 0) goto L35
            boolean r2 = r2.clearThreadContext()
            if (r2 == 0) goto L38
        L35:
            s7.O.restoreThreadContext(r0, r3)
        L38:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.H.withContinuationContext(W6.d, java.lang.Object, f7.a):java.lang.Object");
    }

    public static final <T> T withCoroutineContext(W6.g gVar, Object obj, InterfaceC5519a interfaceC5519a) {
        Object objUpdateThreadContext = s7.O.updateThreadContext(gVar, obj);
        try {
            return (T) interfaceC5519a.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            s7.O.restoreThreadContext(gVar, objUpdateThreadContext);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final W6.g newCoroutineContext(W6.g gVar, W6.g gVar2) {
        return !b(gVar2) ? gVar.plus(gVar2) : a(gVar, gVar2, false);
    }
}
