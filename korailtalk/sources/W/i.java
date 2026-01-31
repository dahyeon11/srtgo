package w;

import z.y0;
import z.z0;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final z0 f37365a = new z0(j.a());

    public static <T extends y0> T get(Class<T> cls) {
        return (T) f37365a.get(cls);
    }

    public static z0 getAll() {
        return f37365a;
    }
}
