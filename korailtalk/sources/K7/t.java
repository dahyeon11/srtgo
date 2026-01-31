package k7;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
class t extends s {

    static final class a extends Lambda implements f7.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f33727a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls) {
            super(1);
            this.f33727a = cls;
        }

        @Override // f7.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.f33727a.isInstance(obj));
        }
    }

    public static final <R> m filterIsInstance(m mVar, Class<R> klass) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(klass, "klass");
        m mVarFilter = u.filter(mVar, new a(klass));
        Intrinsics.checkNotNull(mVarFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        return mVarFilter;
    }

    public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(m mVar, C destination, Class<R> klass) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(klass, "klass");
        for (Object obj : mVar) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    /* renamed from: max, reason: collision with other method in class */
    public static final /* synthetic */ Double m410max(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return u.m414maxOrNull(mVar);
    }

    public static final /* synthetic */ <T, R extends Comparable<? super R>> T maxBy(m mVar, f7.l selector) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(next);
            do {
                Object next2 = it.next();
                Comparable comparable2 = (Comparable) selector.invoke(next2);
                if (comparable.compareTo(comparable2) < 0) {
                    next = next2;
                    comparable = comparable2;
                }
            } while (it.hasNext());
        }
        return (T) next;
    }

    public static final /* synthetic */ Object maxWith(m mVar, Comparator comparator) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return u.maxWithOrNull(mVar, comparator);
    }

    /* renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ Double m412min(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return u.m418minOrNull(mVar);
    }

    public static final /* synthetic */ <T, R extends Comparable<? super R>> T minBy(m mVar, f7.l selector) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(next);
            do {
                Object next2 = it.next();
                Comparable comparable2 = (Comparable) selector.invoke(next2);
                if (comparable.compareTo(comparable2) > 0) {
                    next = next2;
                    comparable = comparable2;
                }
            } while (it.hasNext());
        }
        return (T) next;
    }

    public static final /* synthetic */ Object minWith(m mVar, Comparator comparator) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return u.minWithOrNull(mVar, comparator);
    }

    public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return (SortedSet) u.toCollection(mVar, new TreeSet());
    }

    /* renamed from: max, reason: collision with other method in class */
    public static final /* synthetic */ Float m411max(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return u.m415maxOrNull(mVar);
    }

    /* renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ Float m413min(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return u.m419minOrNull(mVar);
    }

    public static final <T> SortedSet<T> toSortedSet(m mVar, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (SortedSet) u.toCollection(mVar, new TreeSet(comparator));
    }

    public static final /* synthetic */ Comparable max(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return u.maxOrNull(mVar);
    }

    public static final /* synthetic */ Comparable min(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return u.minOrNull(mVar);
    }
}
