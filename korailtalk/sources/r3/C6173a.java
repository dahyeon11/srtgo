package r3;

import n3.v;

/* renamed from: r3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6173a {

    /* renamed from: a, reason: collision with root package name */
    private final Class f35729a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f35730b;

    public C6173a(Class<Object> cls, Object obj) {
        this.f35729a = (Class) v.checkNotNull(cls);
        this.f35730b = v.checkNotNull(obj);
    }

    public Object getPayload() {
        return this.f35730b;
    }

    public Class<Object> getType() {
        return this.f35729a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f35729a, this.f35730b);
    }
}
