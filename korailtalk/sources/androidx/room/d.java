package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
class d {

    /* renamed from: a */
    final Set f10649a = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: b */
    private final h f10650b;

    d(h hVar) {
        this.f10650b = hVar;
    }

    LiveData a(String[] strArr, boolean z8, Callable callable) {
        return new j(this.f10650b, this, z8, callable, strArr);
    }

    void b(LiveData liveData) {
        this.f10649a.add(liveData);
    }

    void c(LiveData liveData) {
        this.f10649a.remove(liveData);
    }
}
