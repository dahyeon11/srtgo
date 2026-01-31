package k0;

import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k0.b */
/* loaded from: classes.dex */
public final class C5838b implements K.b {

    /* renamed from: a */
    private final C5842f[] f33530a;

    public C5838b(C5842f... initializers) {
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        this.f33530a = initializers;
    }

    @Override // androidx.lifecycle.K.b
    public /* bridge */ /* synthetic */ J create(Class cls) {
        return super.create(cls);
    }

    @Override // androidx.lifecycle.K.b
    public <T extends J> T create(Class<T> modelClass, AbstractC5837a extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        T t8 = null;
        for (C5842f c5842f : this.f33530a) {
            if (Intrinsics.areEqual(c5842f.getClazz$lifecycle_viewmodel_release(), modelClass)) {
                Object objInvoke = c5842f.getInitializer$lifecycle_viewmodel_release().invoke(extras);
                t8 = objInvoke instanceof J ? (T) objInvoke : null;
            }
        }
        if (t8 != null) {
            return t8;
        }
        throw new IllegalArgumentException("No initializer set for given class " + modelClass.getName());
    }
}
