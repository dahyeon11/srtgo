package y3;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: y3.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6535d {

    /* renamed from: b, reason: collision with root package name */
    private static volatile C6535d f37616b;

    /* renamed from: a, reason: collision with root package name */
    private final Set f37617a = new HashSet();

    C6535d() {
    }

    public static C6535d getInstance() {
        C6535d c6535d = f37616b;
        if (c6535d == null) {
            synchronized (C6535d.class) {
                try {
                    c6535d = f37616b;
                    if (c6535d == null) {
                        c6535d = new C6535d();
                        f37616b = c6535d;
                    }
                } finally {
                }
            }
        }
        return c6535d;
    }

    Set a() {
        Set setUnmodifiableSet;
        synchronized (this.f37617a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f37617a);
        }
        return setUnmodifiableSet;
    }

    public void registerVersion(String str, String str2) {
        synchronized (this.f37617a) {
            this.f37617a.add(f.a(str, str2));
        }
    }
}
