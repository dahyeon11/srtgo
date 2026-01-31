package k0;

import k0.AbstractC5837a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5840d extends AbstractC5837a {
    public C5840d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // k0.AbstractC5837a
    public <T> T get(AbstractC5837a.b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) getMap$lifecycle_viewmodel_release().get(key);
    }

    public final <T> void set(AbstractC5837a.b key, T t8) {
        Intrinsics.checkNotNullParameter(key, "key");
        getMap$lifecycle_viewmodel_release().put(key, t8);
    }

    public C5840d(AbstractC5837a initialExtras) {
        Intrinsics.checkNotNullParameter(initialExtras, "initialExtras");
        getMap$lifecycle_viewmodel_release().putAll(initialExtras.getMap$lifecycle_viewmodel_release());
    }

    public /* synthetic */ C5840d(AbstractC5837a abstractC5837a, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? AbstractC5837a.C0336a.INSTANCE : abstractC5837a);
    }
}
