package V6;

import java.util.Comparator;

/* loaded from: classes3.dex */
public final class g implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f7.l f5234a;

    public g(f7.l lVar) {
        this.f5234a = lVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        f7.l lVar = this.f5234a;
        return a.compareValues((Comparable) lVar.invoke(obj), (Comparable) lVar.invoke(obj2));
    }
}
