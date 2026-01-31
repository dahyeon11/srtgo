package k0;

import androidx.lifecycle.J;
import f7.l;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5842f {

    /* renamed from: a, reason: collision with root package name */
    private final Class f33532a;

    /* renamed from: b, reason: collision with root package name */
    private final l f33533b;

    public C5842f(Class<J> clazz, l initializer) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f33532a = clazz;
        this.f33533b = initializer;
    }

    public final Class<J> getClazz$lifecycle_viewmodel_release() {
        return this.f33532a;
    }

    public final l getInitializer$lifecycle_viewmodel_release() {
        return this.f33533b;
    }
}
