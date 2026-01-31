package s7;

import W6.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import n7.Q0;

/* loaded from: classes3.dex */
public abstract class O {
    public static final K NO_THREAD_ELEMENTS = new K("NO_THREAD_ELEMENTS");

    /* renamed from: a, reason: collision with root package name */
    private static final f7.p f36329a = a.INSTANCE;

    /* renamed from: b, reason: collision with root package name */
    private static final f7.p f36330b = b.INSTANCE;

    /* renamed from: c, reason: collision with root package name */
    private static final f7.p f36331c = c.INSTANCE;

    static final class a extends Lambda implements f7.p {
        public static final a INSTANCE = new a();

        a() {
            super(2);
        }

        @Override // f7.p
        public final Object invoke(Object obj, g.b bVar) {
            if (!(bVar instanceof Q0)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
        }
    }

    static final class b extends Lambda implements f7.p {
        public static final b INSTANCE = new b();

        b() {
            super(2);
        }

        @Override // f7.p
        public final Q0 invoke(Q0 q02, g.b bVar) {
            if (q02 != null) {
                return q02;
            }
            if (bVar instanceof Q0) {
                return (Q0) bVar;
            }
            return null;
        }
    }

    static final class c extends Lambda implements f7.p {
        public static final c INSTANCE = new c();

        c() {
            super(2);
        }

        @Override // f7.p
        public final T invoke(T t8, g.b bVar) {
            if (bVar instanceof Q0) {
                Q0 q02 = (Q0) bVar;
                t8.append(q02, q02.a(t8.context));
            }
            return t8;
        }
    }

    public static final void restoreThreadContext(W6.g gVar, Object obj) {
        if (obj == NO_THREAD_ELEMENTS) {
            return;
        }
        if (obj instanceof T) {
            ((T) obj).restore(gVar);
            return;
        }
        Object objFold = gVar.fold(null, f36330b);
        Intrinsics.checkNotNull(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((Q0) objFold).c(gVar, obj);
    }

    public static final Object threadContextElements(W6.g gVar) {
        Object objFold = gVar.fold(0, f36329a);
        Intrinsics.checkNotNull(objFold);
        return objFold;
    }

    public static final Object updateThreadContext(W6.g gVar, Object obj) {
        if (obj == null) {
            obj = threadContextElements(gVar);
        }
        if (obj == 0) {
            return NO_THREAD_ELEMENTS;
        }
        if (obj instanceof Integer) {
            return gVar.fold(new T(gVar, ((Number) obj).intValue()), f36331c);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((Q0) obj).a(gVar);
    }
}
