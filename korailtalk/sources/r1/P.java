package R1;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class P extends LinkedHashMap {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Q f4323a;

    P(Q q8) {
        this.f4323a = q8;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        synchronized (this.f4323a) {
            try {
                int size = size();
                Q q8 = this.f4323a;
                if (size <= q8.f4324a) {
                    return false;
                }
                q8.f4329f.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                return size() > this.f4323a.f4324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
