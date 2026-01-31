package W6;

import W6.g;
import f7.l;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class b implements g.c {

    /* renamed from: a, reason: collision with root package name */
    private final l f5380a;

    /* renamed from: b, reason: collision with root package name */
    private final g.c f5381b;

    public b(g.c baseKey, l safeCast) {
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        this.f5380a = safeCast;
        this.f5381b = baseKey instanceof b ? ((b) baseKey).f5381b : baseKey;
    }

    public final boolean isSubKey$kotlin_stdlib(g.c key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return key == this || this.f5381b == key;
    }

    public final Object tryCast$kotlin_stdlib(g.b element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return (g.b) this.f5380a.invoke(element);
    }
}
