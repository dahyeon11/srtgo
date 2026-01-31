package A2;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f69a = new ConcurrentHashMap(16, 0.75f, 10);

    /* renamed from: b, reason: collision with root package name */
    private final ReferenceQueue f70b = new ReferenceQueue();

    m() {
    }

    public final List<Throwable> zza(Throwable th, boolean z8) {
        Reference referencePoll = this.f70b.poll();
        while (referencePoll != null) {
            this.f69a.remove(referencePoll);
            referencePoll = this.f70b.poll();
        }
        List<Throwable> list = (List) this.f69a.get(new p(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> list2 = (List) this.f69a.putIfAbsent(new p(th, this.f70b), vector);
        return list2 == null ? vector : list2;
    }
}
