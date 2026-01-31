package W6;

import W6.g;
import f7.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface e extends g.b {
    public static final b Key = b.f5384a;

    public static final class a {
        public static <R> R fold(e eVar, R r8, p operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) g.b.a.fold(eVar, r8, operation);
        }

        public static <E extends g.b> E get(e eVar, g.c key) {
            E e8;
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof W6.b)) {
                if (e.Key != key) {
                    return null;
                }
                Intrinsics.checkNotNull(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            }
            W6.b bVar = (W6.b) key;
            if (!bVar.isSubKey$kotlin_stdlib(eVar.getKey()) || (e8 = (E) bVar.tryCast$kotlin_stdlib(eVar)) == null) {
                return null;
            }
            return e8;
        }

        public static g minusKey(e eVar, g.c key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof W6.b)) {
                return e.Key == key ? h.INSTANCE : eVar;
            }
            W6.b bVar = (W6.b) key;
            return (!bVar.isSubKey$kotlin_stdlib(eVar.getKey()) || bVar.tryCast$kotlin_stdlib(eVar) == null) ? eVar : h.INSTANCE;
        }

        public static g plus(e eVar, g context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return g.b.a.plus(eVar, context);
        }

        public static void releaseInterceptedContinuation(e eVar, d<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "continuation");
        }
    }

    public static final class b implements g.c {

        /* renamed from: a */
        static final /* synthetic */ b f5384a = new b();

        private b() {
        }
    }

    @Override // W6.g.b, W6.g
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // W6.g.b, W6.g
    <E extends g.b> E get(g.c cVar);

    @Override // W6.g.b
    /* synthetic */ g.c getKey();

    <T> d<T> interceptContinuation(d<? super T> dVar);

    @Override // W6.g.b, W6.g
    g minusKey(g.c cVar);

    @Override // W6.g.b, W6.g
    /* synthetic */ g plus(g gVar);

    void releaseInterceptedContinuation(d<?> dVar);
}
