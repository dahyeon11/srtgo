package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class M {

    /* renamed from: a, reason: collision with root package name */
    private final Map f10010a = new LinkedHashMap();

    public final void clear() {
        Iterator it = this.f10010a.values().iterator();
        while (it.hasNext()) {
            ((J) it.next()).a();
        }
        this.f10010a.clear();
    }

    public final J get(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (J) this.f10010a.get(key);
    }

    public final Set<String> keys() {
        return new HashSet(this.f10010a.keySet());
    }

    public final void put(String key, J viewModel) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        J j8 = (J) this.f10010a.put(key, viewModel);
        if (j8 != null) {
            j8.d();
        }
    }
}
