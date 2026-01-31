package k0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5837a {

    /* renamed from: a, reason: collision with root package name */
    private final Map f33529a = new LinkedHashMap();

    /* renamed from: k0.a$a, reason: collision with other inner class name */
    public static final class C0336a extends AbstractC5837a {
        public static final C0336a INSTANCE = new C0336a();

        private C0336a() {
        }

        @Override // k0.AbstractC5837a
        public <T> T get(b key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }
    }

    /* renamed from: k0.a$b */
    public interface b {
    }

    public abstract <T> T get(b bVar);

    public final Map<b, Object> getMap$lifecycle_viewmodel_release() {
        return this.f33529a;
    }
}
