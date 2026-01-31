package W6;

import W6.e;
import f7.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public interface g {

    public static final class a {

        /* renamed from: W6.g$a$a, reason: collision with other inner class name */
        static final class C0084a extends Lambda implements p {
            public static final C0084a INSTANCE = new C0084a();

            C0084a() {
                super(2);
            }

            @Override // f7.p
            public final g invoke(g acc, b element) {
                W6.c cVar;
                Intrinsics.checkNotNullParameter(acc, "acc");
                Intrinsics.checkNotNullParameter(element, "element");
                g gVarMinusKey = acc.minusKey(element.getKey());
                h hVar = h.INSTANCE;
                if (gVarMinusKey == hVar) {
                    return element;
                }
                e.b bVar = e.Key;
                e eVar = (e) gVarMinusKey.get(bVar);
                if (eVar == null) {
                    cVar = new W6.c(gVarMinusKey, element);
                } else {
                    g gVarMinusKey2 = gVarMinusKey.minusKey(bVar);
                    if (gVarMinusKey2 == hVar) {
                        return new W6.c(element, eVar);
                    }
                    cVar = new W6.c(new W6.c(gVarMinusKey2, element), eVar);
                }
                return cVar;
            }
        }

        public static g plus(g gVar, g context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context == h.INSTANCE ? gVar : (g) context.fold(gVar, C0084a.INSTANCE);
        }
    }

    public interface b extends g {

        public static final class a {
            public static <R> R fold(b bVar, R r8, p operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return (R) operation.invoke(r8, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E get(b bVar, c key) {
                Intrinsics.checkNotNullParameter(key, "key");
                if (!Intrinsics.areEqual(bVar.getKey(), key)) {
                    return null;
                }
                Intrinsics.checkNotNull(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static g minusKey(b bVar, c key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return Intrinsics.areEqual(bVar.getKey(), key) ? h.INSTANCE : bVar;
            }

            public static g plus(b bVar, g context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return a.plus(bVar, context);
            }
        }

        @Override // W6.g
        <R> R fold(R r8, p pVar);

        @Override // W6.g
        <E extends b> E get(c cVar);

        c getKey();

        @Override // W6.g
        g minusKey(c cVar);

        @Override // W6.g
        /* synthetic */ g plus(g gVar);
    }

    public interface c {
    }

    <R> R fold(R r8, p pVar);

    <E extends b> E get(c cVar);

    g minusKey(c cVar);

    g plus(g gVar);
}
