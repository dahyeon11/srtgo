package q7;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;

/* renamed from: q7.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC6157s {

    /* renamed from: a, reason: collision with root package name */
    private static final f7.l f35429a = b.INSTANCE;

    /* renamed from: b, reason: collision with root package name */
    private static final f7.p f35430b = a.INSTANCE;

    /* renamed from: q7.s$a */
    static final class a extends Lambda implements f7.p {
        public static final a INSTANCE = new a();

        a() {
            super(2);
        }

        @Override // f7.p
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(Intrinsics.areEqual(obj, obj2));
        }
    }

    private static final InterfaceC6147i a(InterfaceC6147i interfaceC6147i, f7.l lVar, f7.p pVar) {
        if (interfaceC6147i instanceof C6145g) {
            C6145g c6145g = (C6145g) interfaceC6147i;
            if (c6145g.keySelector == lVar && c6145g.areEquivalent == pVar) {
                return interfaceC6147i;
            }
        }
        return new C6145g(interfaceC6147i, lVar, pVar);
    }

    public static final <T> InterfaceC6147i distinctUntilChanged(InterfaceC6147i interfaceC6147i) {
        return interfaceC6147i instanceof InterfaceC6132S ? interfaceC6147i : a(interfaceC6147i, f35429a, f35430b);
    }

    public static final <T, K> InterfaceC6147i distinctUntilChangedBy(InterfaceC6147i interfaceC6147i, f7.l lVar) {
        return a(interfaceC6147i, lVar, f35430b);
    }

    public static final <T> InterfaceC6147i distinctUntilChanged(InterfaceC6147i interfaceC6147i, f7.p pVar) {
        f7.l lVar = f35429a;
        Intrinsics.checkNotNull(pVar, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        return a(interfaceC6147i, lVar, (f7.p) TypeIntrinsics.beforeCheckcastToFunctionOfArity(pVar, 2));
    }

    /* renamed from: q7.s$b */
    static final class b extends Lambda implements f7.l {
        public static final b INSTANCE = new b();

        b() {
            super(1);
        }

        @Override // f7.l
        public final Object invoke(Object obj) {
            return obj;
        }
    }
}
