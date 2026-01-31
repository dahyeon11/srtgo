package V6;

import java.util.Comparator;

/* loaded from: classes3.dex */
public final class h implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f7.l f5235a;

    public h(f7.l lVar) {
        this.f5235a = lVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        f7.l lVar = this.f5235a;
        return a.compareValues((Comparable) lVar.invoke(obj2), (Comparable) lVar.invoke(obj));
    }
}
