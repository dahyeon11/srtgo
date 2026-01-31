package s7;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s7.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6256q {

    /* renamed from: a, reason: collision with root package name */
    private final Object f36356a;

    private /* synthetic */ C6256q(Object obj) {
        this.f36356a = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ C6256q m581boximpl(Object obj) {
        return new C6256q(obj);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ Object m583constructorimpl$default(Object obj, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i8 & 1) != 0) {
            obj = null;
        }
        return m582constructorimpl(obj);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m584equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof C6256q) && Intrinsics.areEqual(obj, ((C6256q) obj2).m590unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m585equalsimpl0(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    /* renamed from: forEachReversed-impl, reason: not valid java name */
    public static final void m586forEachReversedimpl(Object obj, f7.l lVar) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            lVar.invoke(obj);
            return;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                lVar.invoke(arrayList.get(size));
            }
        }
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m587hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: plus-FjFbRPM, reason: not valid java name */
    public static final Object m588plusFjFbRPM(Object obj, Object obj2) {
        if (obj == null) {
            return m582constructorimpl(obj2);
        }
        if (obj instanceof ArrayList) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList) obj).add(obj2);
            return m582constructorimpl(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return m582constructorimpl(arrayList);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m589toStringimpl(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m584equalsimpl(this.f36356a, obj);
    }

    public int hashCode() {
        return m587hashCodeimpl(this.f36356a);
    }

    public String toString() {
        return m589toStringimpl(this.f36356a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m590unboximpl() {
        return this.f36356a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <E> Object m582constructorimpl(Object obj) {
        return obj;
    }
}
