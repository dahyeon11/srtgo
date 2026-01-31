package retrofit2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final Method f35979a;

    /* renamed from: b, reason: collision with root package name */
    private final List f35980b;

    j(Method method, List list) {
        this.f35979a = method;
        this.f35980b = Collections.unmodifiableList(list);
    }

    public static j of(Method method, List<?> list) {
        B.b(method, "method == null");
        B.b(list, "arguments == null");
        return new j(method, new ArrayList(list));
    }

    public List<?> arguments() {
        return this.f35980b;
    }

    public Method method() {
        return this.f35979a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f35979a.getDeclaringClass().getName(), this.f35979a.getName(), this.f35980b);
    }
}
