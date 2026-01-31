package io.grpc.internal;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class Z {

    /* renamed from: a, reason: collision with root package name */
    private final Set f32596a = Collections.newSetFromMap(new IdentityHashMap());

    protected abstract void a();

    public final boolean anyObjectInUse(Object... objArr) {
        for (Object obj : objArr) {
            if (this.f32596a.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    protected abstract void b();

    public final boolean isInUse() {
        return !this.f32596a.isEmpty();
    }

    public final void updateObjectInUse(Object obj, boolean z8) {
        int size = this.f32596a.size();
        if (z8) {
            this.f32596a.add(obj);
            if (size == 0) {
                a();
                return;
            }
            return;
        }
        if (this.f32596a.remove(obj) && size == 1) {
            b();
        }
    }
}
