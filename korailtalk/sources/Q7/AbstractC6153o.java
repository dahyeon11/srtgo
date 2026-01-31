package q7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: q7.o */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC6153o {

    /* renamed from: q7.o$a */
    static final class a extends Y6.d {

        /* renamed from: d */
        Object f35352d;

        /* renamed from: e */
        /* synthetic */ Object f35353e;

        /* renamed from: f */
        int f35354f;

        a(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f35353e = obj;
            this.f35354f |= Integer.MIN_VALUE;
            return AbstractC6149k.toCollection(null, null, this);
        }
    }

    /* renamed from: q7.o$b */
    static final class b implements InterfaceC6148j {

        /* renamed from: a */
        final /* synthetic */ Collection f35355a;

        b(Collection collection) {
            this.f35355a = collection;
        }

        @Override // q7.InterfaceC6148j
        public final Object emit(Object obj, W6.d<? super R6.G> dVar) {
            this.f35355a.add(obj);
            return R6.G.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object toCollection(q7.InterfaceC6147i r4, C r5, W6.d<? super C> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof q7.AbstractC6153o.a
            if (r0 == 0) goto L13
            r0 = r6
            q7.o$a r0 = (q7.AbstractC6153o.a) r0
            int r1 = r0.f35354f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35354f = r1
            goto L18
        L13:
            q7.o$a r0 = new q7.o$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f35353e
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f35354f
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f35352d
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            R6.r.throwOnFailure(r6)
            goto L49
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            R6.r.throwOnFailure(r6)
            q7.o$b r6 = new q7.o$b
            r6.<init>(r5)
            r0.f35352d = r5
            r0.f35354f = r3
            java.lang.Object r4 = r4.collect(r6, r0)
            if (r4 != r1) goto L49
            return r1
        L49:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6153o.toCollection(q7.i, java.util.Collection, W6.d):java.lang.Object");
    }

    public static final <T> Object toList(InterfaceC6147i interfaceC6147i, List<T> list, W6.d<? super List<? extends T>> dVar) {
        return AbstractC6149k.toCollection(interfaceC6147i, list, dVar);
    }

    public static /* synthetic */ Object toList$default(InterfaceC6147i interfaceC6147i, List list, W6.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            list = new ArrayList();
        }
        return AbstractC6149k.toList(interfaceC6147i, list, dVar);
    }

    public static final <T> Object toSet(InterfaceC6147i interfaceC6147i, Set<T> set, W6.d<? super Set<? extends T>> dVar) {
        return AbstractC6149k.toCollection(interfaceC6147i, set, dVar);
    }

    public static /* synthetic */ Object toSet$default(InterfaceC6147i interfaceC6147i, Set set, W6.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            set = new LinkedHashSet();
        }
        return AbstractC6149k.toSet(interfaceC6147i, set, dVar);
    }
}
