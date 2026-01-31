package F7;

import C7.L;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes3.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private final Set f1323a = new LinkedHashSet();

    h() {
    }

    public synchronized void connected(L l8) {
        this.f1323a.remove(l8);
    }

    public synchronized void failed(L l8) {
        this.f1323a.add(l8);
    }

    public synchronized boolean shouldPostpone(L l8) {
        return this.f1323a.contains(l8);
    }
}
