package e3;

import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class t extends j implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final j f30419a;

    t(j jVar) {
        this.f30419a = (j) w.checkNotNull(jVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e3.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(Iterable iterable, Iterable iterable2) {
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!this.f30419a.equivalent(it.next(), it2.next())) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e3.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int b(Iterable iterable) {
        Iterator it = iterable.iterator();
        int iHash = 78721;
        while (it.hasNext()) {
            iHash = (iHash * 24943) + this.f30419a.hash(it.next());
        }
        return iHash;
    }

    public boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f30419a.equals(((t) obj).f30419a);
        }
        return false;
    }

    public int hashCode() {
        return this.f30419a.hashCode() ^ 1185147655;
    }

    public String toString() {
        return this.f30419a + ".pairwise()";
    }
}
