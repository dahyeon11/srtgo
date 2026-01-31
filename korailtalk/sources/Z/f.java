package Z;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f5683a;

    /* renamed from: b, reason: collision with root package name */
    private int f5684b;

    public f(int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f5683a = new Object[i8];
    }

    private final boolean a(Object obj) {
        int i8 = this.f5684b;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f5683a[i9] == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // Z.e
    public Object acquire() {
        int i8 = this.f5684b;
        if (i8 <= 0) {
            return null;
        }
        int i9 = i8 - 1;
        Object obj = this.f5683a[i9];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f5683a[i9] = null;
        this.f5684b--;
        return obj;
    }

    @Override // Z.e
    public boolean release(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (a(instance)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i8 = this.f5684b;
        Object[] objArr = this.f5683a;
        if (i8 >= objArr.length) {
            return false;
        }
        objArr[i8] = instance;
        this.f5684b = i8 + 1;
        return true;
    }
}
